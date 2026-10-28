"""mitmproxy addon that captures the strap /unlock-token exchange live.

Run with:
    mitmdump -s unlock_token_capture.py -p 8888
(or any other port). Every matched exchange is written to
    artifacts/exchanges/<serial>-<UTCtimestamp>.json
plus the decoded token bytes to
    artifacts/tokens/<serial>-<UTCtimestamp>.{b64,bin}

As a secondary hook, any config response containing the key
`mobile-strap-unlock-refresh-threshold-days` is saved under
    artifacts/config/
that number is the open question about how long captured cert material
stays valid (session 5b in notes-rea-analysis.md).

Matches by URL path substring, so it does not matter whether the app
resolves `firmware-service/*` against api.prod.whoop.com or any other
host.
"""

from __future__ import annotations

import datetime
import hashlib
import json
import os
import sys

from mitmproxy import ctx, http

ADDON_DIR = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, ADDON_DIR)

import decoders  # noqa: E402

TARGET_PATH = "firmware-service/v4/strap/unlock-token"
CONFIG_KEY = "mobile-strap-unlock-refresh-threshold-days"

ARTIFACT_DIR = os.environ.get("WHOOP_CAPTURE_DIR", os.path.join(ADDON_DIR, "artifacts"))
EXCHANGES_DIR = os.path.join(ARTIFACT_DIR, "exchanges")
TOKENS_DIR = os.path.join(ARTIFACT_DIR, "tokens")
CONFIG_DIR = os.path.join(ARTIFACT_DIR, "config")


def _stamp() -> str:
    return datetime.datetime.now(datetime.timezone.utc).strftime("%Y%m%dT%H%M%S%f")


def _safe_name(s: str) -> str:
    return "".join(c if c.isalnum() or c in "-_" else "_" for c in s)[:64] or "unknown"


def response(flow: http.HTTPFlow) -> None:
    try:
        _handle_unlock_token(flow)
        _handle_config(flow)
    except Exception as exc:  # never break the proxy on analysis hiccups
        ctx.log.error(f"[unlock-capture] internal error: {exc!r}")


def _handle_unlock_token(flow: http.HTTPFlow) -> None:
    if TARGET_PATH not in (flow.request.path or ""):
        return
    if flow.response is None:
        return

    serial = flow.request.headers.get("X-WHOOP-Strap-Id") or "unknown-serial"
    status = flow.response.status_code

    record: dict = {
        "meta": {
            "captured_at": datetime.datetime.now(datetime.timezone.utc).isoformat(),
            "method": flow.request.method,
            "url": flow.request.pretty_url,
            "status": status,
        },
        "request": {
            "headers": dict(flow.request.headers),
            "body": _json_or_raw(flow.request.get_text()),
        },
        "response": {
            "status": status,
            "headers": dict(flow.response.headers),
            "body": _json_or_raw(flow.response.get_text()),
        },
    }

    # decoded analyses --------------------------------------------------
    req_body = record["request"]["body"]
    if isinstance(req_body, dict) and isinstance(req_body.get("strapSignature"), str):
        sig = req_body["strapSignature"]
        record["request"]["decoded"] = {"strapSignature_analysis": decoders.analyze_material(sig)}
    resp_body = record["response"]["body"]
    token = resp_body.get("token") if isinstance(resp_body, dict) else None
    if isinstance(token, str):
        record["response"]["decoded"] = {
            "token_analysis": decoders.analyze_material(token),
            "token_sha256": hashlib.sha256(token.encode("utf-8")).hexdigest(),
        }

    capture_id = f"{_safe_name(serial)}-{_stamp()}"
    record["meta"]["capture_id"] = capture_id
    _save(record, capture_id)

    if isinstance(token, str):
        base = os.path.join(TOKENS_DIR, capture_id)
        _private_write(base + ".b64", token.encode("utf-8"))
        bytes_val = _b64_or_raw(token)
        if bytes_val:
            _private_write(base + ".bin", bytes_val)

    ctx.log.info(f"[unlock-capture] exchange saved: status={status}")
    ctx.log.info(f"[unlock-capture]   request : {_short(record['request'], 'strapSignature')}")
    ctx.log.info(f"[unlock-capture]   response: {_short(record['response'], 'token')}")


def _handle_config(flow: http.HTTPFlow) -> None:
    if flow.response is None:
        return
    body = _json_or_raw(flow.response.get_text())
    if not isinstance(body, (dict, list)):
        return
    text = json.dumps(body, default=str)
    if CONFIG_KEY not in text:
        return
    _private_directory(ARTIFACT_DIR)
    _private_directory(CONFIG_DIR)
    path = os.path.join(CONFIG_DIR, f"config-{_stamp()}.json")
    _private_write(path, text.encode("utf-8"))
    ctx.log.info(f"[unlock-capture] config snapshot saved: {path}")


# ----------------------------------------------------------------- helpers

def _json_or_raw(text: str | None):
    if not text:
        return None
    try:
        return json.loads(text)
    except (json.JSONDecodeError, ValueError):
        return text


def _b64_or_raw(token: str) -> bytes | None:
    decoder = getattr(decoders, "_b64_decode", None)
    return decoder(token) if decoder else None


def _short(section: dict, key: str) -> str:
    body = section.get("body")
    if not isinstance(body, dict) or key not in body:
        return "(no body)"
    value = body[key]
    return f"{key}: {len(value)} chars, sha256={hashlib.sha256(value.encode()).hexdigest()}"


def _private_directory(path: str) -> None:
    os.makedirs(path, mode=0o700, exist_ok=True)
    os.chmod(path, 0o700)


def _private_write(path: str, data: bytes) -> None:
    descriptor = os.open(path, os.O_WRONLY | os.O_CREAT | os.O_EXCL, 0o600)
    with os.fdopen(descriptor, "wb") as stream:
        stream.write(data)


def _save(record: dict, capture_id: str) -> None:
    _private_directory(ARTIFACT_DIR)
    _private_directory(EXCHANGES_DIR)
    _private_directory(TOKENS_DIR)
    path = os.path.join(EXCHANGES_DIR, capture_id + ".json")
    _private_write(path, json.dumps(record, indent=2, default=str).encode("utf-8"))
    ctx.log.info(f"[unlock-capture] artifact: {path}")
