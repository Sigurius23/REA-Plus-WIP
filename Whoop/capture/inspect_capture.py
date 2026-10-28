#!/usr/bin/env python3
"""Report expiry claims and refresh settings without printing live token values.

Use the existing whoop-mitm-venv for cryptography's X.509 parser. Parsing does
not verify a token signature, trust chain, firmware acceptance or replayability.
"""
from __future__ import annotations

import argparse
import base64
import binascii
from datetime import datetime, timezone
import hashlib
import json
import math
from pathlib import Path
import re

CONFIG_KEY = "mobile-strap-unlock-refresh-threshold-days"
MAX_CAPTURE_BYTES = 8 * 1024 * 1024


def b64(text: str) -> bytes:
    compact = "".join(text.split())
    return base64.b64decode(compact + "=" * (-len(compact) % 4), altchars=b"-_", validate=True)


def certificate_summary(data: bytes, now: datetime) -> list[dict]:
    from cryptography import x509
    from cryptography.hazmat.primitives import serialization
    try:
        certificates = (x509.load_pem_x509_certificates(data) if b"-----BEGIN" in data
                        else [x509.load_der_x509_certificate(data)])
    except ValueError:
        return []
    output = []
    for certificate in certificates:
        start, end = certificate.not_valid_before_utc, certificate.not_valid_after_utc
        state = "not_yet_valid" if now < start else "expired" if now >= end else "within_claimed_window"
        output.append({"der_sha256": hashlib.sha256(certificate.public_bytes(serialization.Encoding.DER)).hexdigest(),
            "not_before": start.isoformat(), "not_after": end.isoformat(),
            "window_seconds": int((end - start).total_seconds()), "time_status": state,
            "signature_and_trust_verified": False})
    return output


def token_summary(token: str, now: datetime | None = None) -> dict:
    now = now or datetime.now(timezone.utc)
    result = {"token_sha256": hashlib.sha256(token.encode()).hexdigest(),
              "token_characters": len(token), "container": "opaque",
              "certificates": [], "claims": {}, "signature_verified": False,
              "firmware_acceptance": "unknown", "replayability": "unknown"}
    parts = token.split(".")
    try:
        if len(parts) == 3:
            header, payload = json.loads(b64(parts[0])), json.loads(b64(parts[1]))
            if isinstance(header, dict) and isinstance(payload, dict):
                result["container"] = "jws_unverified"
                for name in ("iat", "nbf", "exp"):
                    value = payload.get(name)
                    if type(value) in (int, float) and math.isfinite(value):
                        try:
                            result["claims"][name] = datetime.fromtimestamp(value, timezone.utc).isoformat()
                        except (ValueError, OverflowError, OSError):
                            pass
                for encoded in header.get("x5c", []) if isinstance(header.get("x5c"), list) else []:
                    if isinstance(encoded, str):
                        result["certificates"].extend(certificate_summary(b64(encoded), now))
                return result
        material = token.strip()
        if material.startswith("-----BEGIN"):
            data, result["container"] = material.encode(), "pem"
        elif len(material) % 2 == 0 and re.fullmatch(r"[a-fA-F0-9]+", material):
            data, result["container"] = bytes.fromhex(material), "hex"
        else:
            data, result["container"] = b64(material), "base64"
        result["certificates"] = certificate_summary(data, now)
    except (binascii.Error, ValueError, UnicodeError):
        result["parse_status"] = "opaque_or_malformed"
    return result


def refresh_settings(value: object, path: str = "$", output: list | None = None) -> list:
    output = [] if output is None else output
    if isinstance(value, dict):
        found = value.get(CONFIG_KEY)
        if value.get("key") == CONFIG_KEY:
            found = value.get("value")
        if found is not None:
            try:
                days = int(found) if not isinstance(found, bool) and str(found).strip().lstrip("-").isdigit() else None
            except (TypeError, ValueError):
                days = None
            output.append({"path": path, "days": days,
                           "meaning": "client refresh threshold; not certificate TTL"})
        for key, item in value.items():
            if isinstance(item, (dict, list)):
                refresh_settings(item, path + "." + str(key), output)
    elif isinstance(value, list):
        for index, item in enumerate(value):
            refresh_settings(item, f"{path}[{index}]", output)
    return output


def read_json(path: Path) -> object:
    if path.stat().st_size > MAX_CAPTURE_BYTES:
        raise ValueError("Capture exceeds the 8 MiB offline JSON budget")
    with path.open('rb') as stream:
        data = stream.read(MAX_CAPTURE_BYTES + 1)
    if len(data) > MAX_CAPTURE_BYTES:
        raise ValueError("Capture grew beyond the JSON budget")
    return json.loads(data)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("exchange", type=Path)
    parser.add_argument("--config", type=Path, action="append", default=[])
    args = parser.parse_args()
    document = read_json(args.exchange)
    response = document.get("response") if isinstance(document, dict) else None
    body = response.get("body") if isinstance(response, dict) else None
    if not isinstance(body, dict) or not isinstance(body.get("token"), str):
        parser.error("Exchange has no token response to inspect")
    report = token_summary(body["token"])
    report["refresh_settings"] = [entry for path in args.config
                                  for entry in refresh_settings(read_json(path))]
    report["refresh_guard_observed_in_app"] = "UNLOCKED and counterSeconds <= threshold_days * 86400"
    report["static_default_threshold_days"] = 38
    print(json.dumps(report, indent=2))


if __name__ == "__main__":
    main()
