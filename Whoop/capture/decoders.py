#!/usr/bin/env python3
"""Decode kit for WHOOP firmware-service /strap/unlock-token artifacts.

Zero third-party dependencies. Two ways to use it:

1. Standalone:  python3 decoders.py <artifact.json | token-string> [--json]
   If the argument is a path to an exchange artifact produced by
   unlock_token_capture.py, the token field is located automatically.

2. Imported by unlock_token_capture.py to decode live traffic.

Self-test:  python3 decoders.py --selftest
"""

from __future__ import annotations

import base64
import binascii
import gzip
import hashlib
import json
import math
import os
import string
import sys
import zlib

MAX_DER_DEPTH = 14
MAX_NESTED_UNWRAP = 4

_B64_ALPHABET = set(string.ascii_letters + string.digits + "+/=")
_B64URL_ALPHABET = set(string.ascii_letters + string.digits + "-_=")

TAG_NAMES = {
    0x01: "BOOLEAN",
    0x02: "INTEGER",
    0x03: "BIT STRING",
    0x04: "OCTET STRING",
    0x05: "NULL",
    0x06: "OID",
    0x0C: "UTF8String",
    0x0D: "NumericString",
    0x13: "PrintableString",
    0x16: "IA5String",
    0x17: "UTCTime",
    0x18: "GeneralizedTime",
    0x1E: "BMPString",
    0x30: "SEQUENCE",
    0x31: "SET",
}

OID_NAMES = {
    "1.2.840.113549.1.7.2": "PKCS#7 signedData (CMS)",
    "1.2.840.113549.1.7.1": "PKCS#7 data",
    "1.2.840.113549.1.1.1": "RSA public key (X.509 SubjectPublicKeyInfo)",
    "1.2.840.113549.1.1.5": "sha1WithRSA",
    "1.2.840.113549.1.1.11": "sha256WithRSA",
    "1.2.840.113549.1.1.12": "sha384WithRSA",
    "1.2.840.113549.1.1.13": "sha512WithRSA",
    "1.2.840.10045.2.1": "id-ecPublicKey (EC public key)",
    "1.2.840.10045.4.1.1": "ecdsa-with-SHA1",
    "1.2.840.10045.4.3.2": "ecdsa-with-SHA256",
    "1.2.840.10045.4.3.3": "ecdsa-with-SHA384",
    "2.5.4.3": "commonName",
    "2.5.4.10": "organizationName",
    "2.5.29.19": "X509v3 Basic Constraints",
    "2.5.29.15": "X509v3 Key Usage",
}


# ---------------------------------------------------------------- DER walker

DERTlv = dict  # {"tag", "start", "end", "content_start", "children"}


def _read_len(data: bytes, off: int) -> tuple[int, int] | None:
    """Return (length, offset_after_len) reading data[off], or None if malformed."""
    if off >= len(data):
        return None
    first = data[off]
    off += 1
    if first < 0x80:
        return first, off
    n = first & 0x7F
    if not 1 <= n <= 4:
        return None
    if off + n > len(data):
        return None
    length = int.from_bytes(data[off : off + n], "big")
    return length, off + n


def parse_der(data: bytes, depth: int = 0) -> DERTlv | None:
    """Parse a single DER TLV starting at data[0]; returns node dict or None."""
    if depth > MAX_DER_DEPTH or len(data) < 2:
        return None
    tag = data[0]
    if tag & 0x1F == 0x1F:  # high tag numbers are not part of our subset
        return None
    parsed = _read_len(data, 1)
    if parsed is None:
        return None
    length, content_start = parsed
    constructed = bool(tag & 0x20) or tag in (0x30, 0x31)
    end = content_start + length
    if end > len(data):
        return None
    node: DERTlv = {
        "tag": tag,
        "start": 0,
        "end": end,
        "content_start": content_start,
        "children": [],
    }
    if constructed:
        pos = content_start
        while pos < end:
            child = parse_der(data[pos:end], depth + 1)
            if child is None:
                return None
            child["offset"] = pos - content_start
            node["children"].append(child)
            pos += child["end"]
        if pos != end:
            return None
    return node


def _oid_dotted(content: bytes) -> str | None:
    if not content or len(content) > 32:
        return None
    try:
        parts = [str(content[0] // 40), str(content[0] % 40)]
        val = 0
        for byte in content[1:]:
            val = (val << 7) | (byte & 0x7F)
            if not byte & 0x80:
                parts.append(str(val))
                val = 0
        if val:
            return None
        return ".".join(parts)
    except Exception:
        return None


def _oid_label(content: bytes) -> str:
    dotted = _oid_dotted(content)
    if dotted is None:
        return " =(bad oid)"
    return f" = {dotted} ({OID_NAMES.get(dotted, '?')})"


def _walk(node: DERTlv, data: bytes, depth: int, out: list[str]) -> None:
    tag = node["tag"]
    cs, ce = node["content_start"], node["end"]
    label = TAG_NAMES.get(tag, f"tag 0x{tag:02x}")
    extra = ""
    if not node["children"]:
        content = data[cs:ce]
        if tag == 0x06:
            extra = _oid_label(content)
        elif tag in (0x0C, 0x13, 0x14, 0x16, 0x1E):
            extra = " =" + content.decode("utf-8", "replace")
        elif tag == 0x02 and content:
            extra = " =" + str(int.from_bytes(content, "big"))
        elif tag == 0x17 or tag == 0x18:
            extra = " =" + content.decode("ascii", "replace")
        elif tag in (0x03, 0x04) and content and len(content) <= 24:
            extra = " =" + content.hex()
    out.append("  " * depth + f"{label} (len={ce - cs}){extra}")
    for child in node["children"]:
        child_data = data[cs + child.get("offset", 0) : ce]
        _walk(child, child_data, depth + 1, out)


def render_tree(root: DERTlv, data: bytes) -> list[str]:
    lines: list[str] = []
    label = TAG_NAMES.get(root["tag"], f"tag 0x{root['tag']:02x}")
    lines.append(f"{label} (len={root['end'] - root['content_start']})")
    cs = root["content_start"]
    for child in root["children"]:
        _walk(child, data[cs + child.get("offset", 0) : root["end"]], 1, lines)
    return lines


def _is_der_start(b: bytes) -> bool:
    return (
        len(b) >= 4
        and (b[0] & 0x1F) != 0x1F
        and b[0] in (0x30, 0x31, 0x61, 0x70, 0x7F)
        and _read_len(b, 1) is not None
    )


# ------------------------------------------------------------ cert detection

def _cert_shape(root: DERTlv) -> bool:
    """X.509 Certificate ::= SEQUENCE { tbs SEQUENCE, alg SEQUENCE, sig BIT STRING }"""
    if root["tag"] != 0x30 or len(root["children"]) != 3:
        return False
    return (
        root["children"][2]["tag"] == 0x03
        and root["children"][0]["tag"] == 0x30
        and root["children"][1]["tag"] == 0x30
    )


def _cms_shape(root: DERTlv, whole: bytes) -> str | None:
    if root["tag"] != 0x30 or len(root["children"]) != 1:
        return None
    content = root["children"][0]
    if content["tag"] != 0x30 or not content["children"]:
        return None
    first = content["children"][0]
    if first["tag"] != 0x06 or first["children"]:
        return None
    oid_bytes = whole[
        content["content_start"] + first["content_start"] :
        content["content_start"] + first["end"]
    ]
    dotted = _oid_dotted(oid_bytes)
    if dotted is None:
        return None
    return OID_NAMES.get(dotted) or f"OID {dotted}"


# --------------------------------------------------------- container probes

def _b64_decode(s: str) -> bytes | None:
    compact = "".join(s.split())
    if not compact:
        return None
    pad = (-len(compact)) % 4
    try:
        return base64.b64decode(compact + "=" * pad, altchars=b"-_", validate=True)
    except (binascii.Error, ValueError):
        return None


def _looks_hex(s: str) -> bool:
    t = "".join(s.split())
    return len(t) >= 4 and len(t) % 2 == 0 and all(c in "0123456789abcdefABCDEF" for c in t)


def _protobuf_probe(data: bytes) -> dict | None:
    """Shallow protobuf field scan with a conservative accept gate."""
    if len(data) < 2:
        return None
    fields: list[dict] = []
    pos = 0
    while pos < len(data) and len(fields) < 64:
        key, shift, ok = 0, 0, False
        while pos < len(data):
            byte = data[pos]
            pos += 1
            key |= (byte & 0x7F) << shift
            if not byte & 0x80:
                ok = True
                break
            shift += 7
            if shift > 42:
                return None
        if not ok:
            return None
        field_no, wire = key >> 3, key & 7
        if field_no == 0 or wire in (3, 4):
            return None
        if wire == 0:
            val, shift, ok = 0, 0, False
            while pos < len(data):
                byte = data[pos]
                pos += 1
                val |= (byte & 0x7F) << shift
                if not byte & 0x80:
                    ok = True
                    break
                shift += 7
                if shift > 63:
                    return None
            if not ok:
                return None
            fields.append({"field": field_no, "wire": "varint", "value": val})
        elif wire == 1 and pos + 8 <= len(data):
            fields.append({"field": field_no, "wire": "fixed64", "hex": data[pos : pos + 8].hex()})
            pos += 8
        elif wire == 2:
            parsed = _read_len(data, pos)
            if parsed is None:
                return None
            ln, pos2 = parsed
            if pos2 + ln > len(data):
                return None
            payload = data[pos2 : pos2 + ln]
            entry: dict = {"field": field_no, "wire": "len", "len": ln}
            if all(32 <= c < 127 or c in (9, 10, 13) for c in payload):
                try:
                    entry["text"] = payload.decode("utf-8")
                except Exception:
                    entry["hex"] = payload.hex()[:200]
            else:
                entry["hex"] = payload.hex()[:200]
                entry["utf8_lossy"] = payload.decode("utf-8", "replace")[:120]
            fields.append(entry)
            pos = pos2 + ln
        elif wire == 5 and pos + 4 <= len(data):
            fields.append({"field": field_no, "wire": "fixed32", "hex": data[pos : pos + 4].hex()})
            pos += 4
        else:
            return None
    if not fields or pos < len(data) * 0.6:
        return None
    return {"consumed": pos, "total": len(data), "fields": fields}


def _ascii_strings(data: bytes, min_len: int = 5) -> list[str]:
    runs: list[str] = []
    run = bytearray()
    for byte in data:
        if 32 <= byte < 127:
            run.append(byte)
        else:
            if len(run) >= min_len:
                runs.append(run.decode("ascii"))
            run.clear()
    if len(run) >= min_len:
        runs.append(run.decode("ascii"))
    return runs


def _entropy(data: bytes) -> float:
    if not data:
        return 0.0
    counts = [0] * 256
    for b in data:
        counts[b] += 1
    n = len(data)
    return round(-sum((c / n) * math.log2(c / n) for c in counts if c), 3)


def _uncompress(data: bytes) -> tuple[str, bytes] | None:
    if data[:3] == b"\x1f\x8b\x08":
        try:
            return "gzip", gzip.decompress(data)
        except Exception:
            return None
    if data[:2] in (b"\x78\x01", b"\x78\x5e", b"\x78\x9c", b"\x78\xda"):
        try:
            return "zlib", zlib.decompress(data)
        except Exception:
            pass
        try:
            return "zlib-raw", zlib.decompress(data, -15)
        except Exception:
            return None
    if data[:4] == b"PK\x03\x04":
        return "zip-shell (not auto-unwrapped; inspect with unzip)", data
    return None


# -------------------------------------------------------------------- JOSE

def _jose_b64_json(seg: str):
    if not _looks_b64url(seg):
        return None
    b = _b64_decode(seg)
    if not b:
        return None
    try:
        return json.loads(b.decode("utf-8"))
    except Exception:
        return None


def _looks_b64url(seg: str) -> bool:
    return bool(seg) and len(seg) >= 8 and set(seg) <= _B64URL_ALPHABET


def _is_b64_text(s: str) -> bool:
    return bool(s) and set(s) and set(s) <= (_B64_ALPHABET | _B64URL_ALPHABET)


def _pem(der: bytes, kind: str) -> str:
    b64 = base64.b64encode(der).decode("ascii")
    lines = [b64[i : i + 64] for i in range(0, len(b64), 64)]
    return f"-----BEGIN {kind}-----\n" + "\n".join(lines) + f"\n-----END {kind}-----"


def _analyze_jose(token: str) -> dict | None:
    parts = token.split(".")
    if len(parts) != 3 or not _looks_b64url(parts[0]):
        return None
    header = _jose_b64_json(parts[0])
    if not isinstance(header, dict) or "alg" not in header:
        return None
    out: dict = {"header": header}
    payload = _jose_b64_json(parts[1])
    out["payload"] = payload if isinstance(payload, dict) else parts[1][:120]
    out["signature_b64url"] = parts[2]
    certs: list[dict] = []
    if isinstance(header.get("x5c"), list):
        for i, item in enumerate(header["x5c"]):
            der = _b64_decode(str(item))
            info: dict = {"index": i, "size": len(der) if der else 0}
            if der and _is_der_start(der):
                root = parse_der(der)
                if root and _cert_shape(root):
                    info["shape"] = "X.509 certificate"
                    info["pem"] = _pem(der, "CERTIFICATE")
            certs.append(info)
    out["x5c_degrees"] = certs
    return out


# ---------------------------------------------------------------- analyze

def _analyze_bytes(layer: str, data: bytes, depth: int) -> dict:
    info: dict = {"layer": layer, "size": len(data), "sha256": hashlib.sha256(data).hexdigest()}
    info["entropy"] = _entropy(data)
    root = parse_der(data) if _is_der_start(data) else None
    der_info: dict = {"valid": bool(root)}
    if root:
        if _cert_shape(root):
            der_info["as_x509"] = True
            info["pem"] = _pem(data, "CERTIFICATE")
        if (cms := _cms_shape(root, data)):
            der_info["as_cms"] = cms
        der_info["structure"] = render_tree(root, data)[:200]
        info["der"] = der_info
        # also look for nested certs inside non-cert DER (e.g. CMS signedData)
        nested = _find_nested_certs(root, data, 1)
        if nested:
            info["nested_pems"] = nested
    else:
        pb = _protobuf_probe(data)
        if pb:
            info["protobuf"] = pb
    cmp = _uncompress(data)
    if cmp and depth + 1 <= MAX_NESTED_UNWRAP and len(cmp[1]) < 8_000_000:
        info["decompressed"] = _analyze_bytes(cmp[0], cmp[1], depth + 1)
    info["ascii_strings"] = _ascii_strings(data)[:20]
    if data and all(32 <= c < 127 or c in (9, 10, 13) for c in data):
        info["ascii_preview"] = data.decode("utf-8", "replace")[:400]
    return info


def _find_nested_certs(node: DERTlv, whole: bytes, depth: int) -> list[str]:
    """Search a DER subtree for X.509-shaped child structures and emit PEMs."""
    out: list[str] = []
    if depth > MAX_DER_DEPTH or not node.get("children"):
        return out
    for child in node["children"]:
        if _cert_shape(child):
            out.append(_pem(whole[child["content_start"] : child["end"]], "CERTIFICATE"))
        else:
            out.extend(_find_nested_certs(child, whole, depth + 1))
    return out


def analyze_material(token: str) -> dict:
    """Probe a token/signature string and describe what it is."""
    token = token.strip()
    result: dict = {"input_length": len(token)}
    if token.startswith("-----BEGIN"):
        norm = "".join(
            l for l in token.splitlines() if not l.startswith("----") and ":" not in l[:40]
        )
        der = _b64_decode(norm)
        if der:
            result["container"] = "pem"
            result["bytes"] = _analyze_bytes("pem", der, 0)
        else:
            result["container"] = "pem (undecodable)"
        return result
    if (jose := _analyze_jose(token)) is not None:
        result["container"] = "jws"
        merged = dict(result)
        merged["jws"] = jose
        header = jose.get("header") or {}
        if header.get("x5c"):
            merged["x5c_degrees"] = jose.get("x5c_degrees")
        return merged
    if _looks_hex(token):
        raw = bytes.fromhex("".join(token.split()))
        result["container"] = "hex"
        result["decoded_ascii"] = raw.decode("utf-8", "replace")[:400]
        result["bytes"] = _analyze_bytes("hex", raw, 0)
        return result
    b64 = _b64_decode(token)
    if b64 is not None and _is_b64_text("".join(token.split())):
        result["container"] = "base64"
        layers = 1
        inner = b64
        while layers < MAX_NESTED_UNWRAP and _is_ascii_b64(raw=inner):
            nxt = _b64_decode(inner.decode("ascii", "ignore"))
            if not nxt:
                break
            inner = nxt
            layers += 1
        result["b64_layers"] = layers
        result["bytes"] = _analyze_bytes("base64", inner, 0)
        return result
    if token and all(32 <= ord(c) < 127 for c in token):
        result["container"] = "printable-ascii (unrecognized)"
        return result
    result["container"] = "unrecognized"
    return result


def _is_ascii_b64(raw: bytes) -> bool:
    try:
        s = raw.decode("ascii")
    except Exception:
        return False
    if not _is_b64_text(s.replace("\n", "").replace("\r", "")):
        return False
    return len(s.rstrip("=\n\r")) % 4 == 0 and len(s) > 8


# ---------------------------------------------------------------- CLI

def _locate_token(doc: dict) -> str | None:
    resp = doc.get("response") or doc
    body = resp.get("body")
    if isinstance(body, dict) and isinstance(body.get("token"), str):
        return body["token"]
    if isinstance(doc.get("token"), str):
        return doc["token"]
    return None


def _pretty(report: dict) -> str:
    lines = [f"container: {report.get('container')}", f"input_length: {report.get('input_length')}"]
    if "decoded_ascii" in report:
        lines.append(f"decoded_ascii: {report['decoded_ascii']!r}")
    if report.get("container") == "jws":
        j = report.get("jws", {})
        lines.append(f"alg: {j.get('header', {}).get('alg')}")
        lines.append(f"payload: {json.dumps(j.get('payload'))[:300]}")
        for c in j.get("x5c_degrees", []):
            lines.append(f"  x5c[{c['index']}] size={c['size']} {c.get('shape', '')}")
    b = report.get("bytes") or {}
    if b.get("der", {}).get("valid"):
        label = b["der"].get("as_cms") or ("X.509 certificate" if b["der"].get("as_x509") else "valid DER")
        lines.append(f"der: {label}")
        for line in b["der"].get("structure", [])[:40]:
            lines.append("  " + line)
    if "decompressed" in b:
        lines.append(f"compressed: {b['decompressed']['layer']}, inner size {b['decompressed']['size']}")
    pp = b.get("protobuf")
    if pp:
        lines.append(f"protobuf: {len(pp['fields'])} fields, {pp['consumed']}/{pp['total']} bytes consumed")
        for f in pp["fields"][:12]:
            lines.append("  " + json.dumps(f)[:160])
    if b.get("pem"):
        lines.append("pem: extracted X.509 certificate (see JSON output)")
    for s in b.get("ascii_strings", [])[:8]:
        lines.append(f"string: {s!r}")
    if b.get("ascii_preview"):
        lines.append(f"ascii: {b['ascii_preview'][:200]!r}")
    return "\n".join(lines)


def main(argv: list[str]) -> int:
    if not argv or "--help" in argv or "-h" in argv:
        print(__doc__)
        return 0
    if "--selftest" in argv:
        return selftest()
    arg = argv[0]
    as_json = "--json" in argv
    try:
        if os.path.isfile(arg):
            with open(arg, "r", encoding="utf-8") as fh:
                doc = json.load(fh)
            token = _locate_token(doc)
            if token is None:
                print("no 'token' found in artifact", file=sys.stderr)
                return 2
        else:
            token = arg
    except (OSError, json.JSONDecodeError) as exc:
        print(f"error: {exc}", file=sys.stderr)
        return 2
    report = analyze_material(token)
    print(json.dumps(report, indent=2) if as_json else _pretty(report))
    return 0


# -------------------------------------------------------------- self-test

def _emit_tlv(tag: int, content: bytes) -> bytes:
    if len(content) < 0x80:
        return bytes([tag, len(content)]) + content
    ln = len(content).to_bytes((len(content).bit_length() + 7) // 8, "big")
    return bytes([tag, 0x80 | len(ln)]) + ln + content


def _oid_of(dotted: str) -> bytes:
    parts = [int(x) for x in dotted.split(".")]
    out = bytearray([parts[0] * 40 + parts[1]])
    for value in parts[2:]:
        chunk = bytearray([value & 0x7F])
        value >>= 7
        while value:
            chunk.append((value & 0x7F) | 0x80)
            value >>= 7
        out += bytearray(reversed(chunk))
    return bytes(out)


def _fake_ec_cert() -> bytes:
    tbs = (
        _emit_tlv(0x30,
            _emit_tlv(0x02, b"\x02")  # version INTEGER 2
            + _emit_tlv(0x02, b"\x01")  # serial 1
            + _emit_tlv(0x30, _emit_tlv(0x06, _oid_of("1.2.840.10045.4.3.2")))
            + _emit_tlv(0x30, _emit_tlv(0x31,
                _emit_tlv(0x30, _emit_tlv(0x06, _oid_of("2.5.4.3"))
                    + _emit_tlv(0x0C, b"whoop-capture-test"))))
            + _emit_tlv(0x30,
                _emit_tlv(0x17, b"260101000000Z") + _emit_tlv(0x17, b"271231235959Z"))
            + _emit_tlv(0x30, _emit_tlv(0x31,
                _emit_tlv(0x30, _emit_tlv(0x06, _oid_of("2.5.4.3"))
                    + _emit_tlv(0x0C, b"strap-root")))))
    )
    sig_alg = _emit_tlv(0x30, _emit_tlv(0x06, _oid_of("1.2.840.10045.4.3.2")))
    sig_val = _emit_tlv(0x03, b"\x00" + b"\x04" * 4)
    return _emit_tlv(0x30, tbs + sig_alg + sig_val)


def selftest() -> int:
    failures: list[str] = []

    def check(name: str, cond: bool) -> None:
        if not cond:
            failures.append(name)

    cert = _fake_ec_cert()
    root = parse_der(cert)
    check("cert: der parse", root is not None and root["end"] == len(cert))
    check("cert: shape", root is not None and _cert_shape(root))
    tree = "\n".join(render_tree(root, cert)) if root else ""
    check("cert: tree shows commonName", "commonName" in tree)
    check("cert: tree shows ecdsa oid", "ecdsa-with-SHA256" in tree)

    # malformed input must not crash
    analyze_material("48656c6c6f2c2073tr8")
    analyze_material("")
    for probe in (b"\x30\x85\xff\xff\xff", b"\x30\x00", b"\x30\x02\x50"):
        parse_der(probe)

    hex_case = analyze_material(bytes(range(0, 32)).hex())
    check("hex: container", hex_case.get("container") == "hex")

    b64_case = analyze_material(base64.b64encode(cert).decode())
    check("b64: container", str(b64_case.get("container")).startswith("base64"))
    b = b64_case.get("bytes") or {}
    check("b64: der valid", b.get("der", {}).get("valid"))
    check("b64: x509 shape", b.get("der", {}).get("as_x509"))
    check("b64: pem extracted", "BEGIN CERTIFICATE" in b.get("pem", ""))

    compressed = analyze_material(base64.b64encode(gzip.compress(b"strap-cert-secret")).decode())
    inner = (compressed.get("bytes") or {}).get("decompressed") or {}
    check("gzip: found", inner.get("layer") == "gzip")
    check("gzip: string leaked", any("strap-cert-secret" in s for s in inner.get("ascii_strings") or []))

    header = base64.urlsafe_b64encode(
        json.dumps({"alg": "ES256", "x5c": [base64.b64encode(cert).decode()]}).encode()
    ).decode().rstrip("=")
    payload = base64.urlsafe_b64encode(json.dumps({"msg": "hi"}).encode()).decode().rstrip("=")
    jose = analyze_material(f"{header}.{payload}.c2ln")
    check("jose: found", jose.get("container") == "jws")
    check("jose: x5c parsed", any(c.get("shape") for c in jose.get("jws", {}).get("x5c_degrees", [])))

    asm_cert = analyze_material(_pem(cert, "CERTIFICATE"))
    check("pem: container", asm_cert.get("container") == "pem")
    check("pem: der valid", (asm_cert.get("bytes") or {}).get("der", {}).get("valid"))

    if failures:
        print("FAIL:", ", ".join(failures))
        return 1
    print(f"selftest: all checks passed ({len(failures)==0})")
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
