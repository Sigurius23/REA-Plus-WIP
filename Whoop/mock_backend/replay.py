#!/usr/bin/env python3
"""Loopback-only JSON fixture replay for the documented WHOOP startup reads."""
from __future__ import annotations

import argparse
from datetime import datetime, timezone
import hashlib
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
import json
import os
from pathlib import Path
import re
from urllib.parse import parse_qsl, urlencode, urlsplit

HERE = Path(__file__).resolve().parent
CONTRACTS = json.loads((HERE / "contracts.json").read_text())["routes"]
MAX_FIXTURE_BYTES = 8 * 1024 * 1024


def canonical_path(target: str) -> str:
    url = urlsplit(target)
    if url.scheme or url.netloc or url.fragment or not url.path.startswith("/"):
        raise ValueError("Expected a relative request path")
    query = urlencode(sorted(parse_qsl(url.query, keep_blank_values=True), key=lambda pair: pair[0]))
    return url.path + ("?" + query if query else "")


def route_for(method: str, target: str) -> dict | None:
    path = urlsplit(canonical_path(target)).path
    for route in CONTRACTS:
        pattern = re.escape(route["path"]).replace(r"\{flagName\}", r"[^/]+")
        if method == route["method"] and re.fullmatch(pattern, path):
            return route
    return None


def request_variants(method: str, target: str, headers=None) -> dict:
    route = route_for(method, target)
    selected = ("X-WHOOP-Strap-Signature",) if route and route['path'] == "/onboarding-service/v1/app/destination" else ()
    normalized = {key.lower(): value for key, value in (headers or {}).items()}
    return {name: hashlib.sha256(normalized[name.lower()].encode()).hexdigest()
            if name.lower() in normalized else None for name in selected}


def request_key(method: str, target: str, variants: dict) -> tuple[str, str, str]:
    return method, canonical_path(target), json.dumps(variants, sort_keys=True)


def fixture_name(method: str, target: str, variants: dict) -> str:
    key = json.dumps(request_key(method, target, variants))
    return hashlib.sha256(key.encode()).hexdigest() + ".json"


def save_fixture(directory: Path, method: str, target: str, status: int,
                 body: object, source_host: str, headers=None) -> Path:
    route = route_for(method, target)
    if route is None:
        raise ValueError("Request is outside the startup capture shortlist")
    if not 200 <= status <= 599:
        raise ValueError("Unsupported recorded response status")
    variants = request_variants(method, target, headers)
    record = {"method": method, "path": canonical_path(target), "status": status,
              "body": body, "source_host": source_host,
              "request_variant_hashes": variants,
              "captured_at": datetime.now(timezone.utc).isoformat(),
              "contract_path": route["path"]}
    encoded = (json.dumps(record, ensure_ascii=False, allow_nan=False, indent=2) + "\n").encode()
    if len(encoded) > MAX_FIXTURE_BYTES:
        raise ValueError("Fixture exceeds the 8 MiB local JSON budget")
    directory.mkdir(parents=True, mode=0o700, exist_ok=True)
    path = directory / fixture_name(method, target, variants)
    # Repeated captures replace this exact request's latest response atomically.
    temporary = directory / (path.name + ".tmp")
    descriptor = os.open(temporary, os.O_WRONLY | os.O_CREAT | os.O_TRUNC, 0o600)
    with os.fdopen(descriptor, "wb") as stream:
        stream.write(encoded)
    temporary.replace(path)
    return path


def load_fixtures(directory: Path) -> dict[tuple[str, str, str], dict]:
    if not directory.is_dir():
        raise ValueError("Fixture directory does not exist")
    records = {}
    for path in sorted(directory.glob("*.json")):
        if path.is_symlink() or path.stat().st_size > MAX_FIXTURE_BYTES:
            raise ValueError(f"Unreadable or oversized fixture: {path.name}")
        record = json.loads(path.read_text(), parse_constant=reject_nonfinite,
                            object_pairs_hook=unique_members)
        if not isinstance(record, dict) or not {"method", "path", "status", "body"} <= record.keys():
            raise ValueError("Fixture must have method, path, status and body members")
        method, target, status = record["method"], record["path"], record["status"]
        if not isinstance(method, str) or not isinstance(target, str) or \
                route_for(method, target) is None or type(status) is not int or not 200 <= status <= 599:
            raise ValueError(f"Invalid fixture request or status: {path.name}")
        # Also reject exponent overflow (e.g. 1e999), which parse_constant does
        # not receive. Validate only JSON encodability here; real response shape
        # problems remain replayable and are reported by check_fixtures.py.
        json.dumps(record, allow_nan=False)
        variants = record.get('request_variant_hashes', {})
        expected = request_variants(method, target)
        if not isinstance(variants, dict) or set(variants) != set(expected) or any(
                value is not None and (not isinstance(value, str) or not re.fullmatch(r'[a-f0-9]{64}', value))
                for value in variants.values()):
            raise ValueError(f"Invalid request variant identity: {path.name}")
        key = request_key(method, target, variants)
        if key in records:
            raise ValueError("Duplicate recorded request; select one fixture per exact request")
        records[key] = record
    return records


def reject_nonfinite(_):
    raise ValueError("Nonfinite JSON number")


def unique_members(pairs):
    value = {}
    for name, item in pairs:
        if name in value:
            raise ValueError("Duplicate JSON member")
        value[name] = item
    return value


def handler_for(records: dict):
    class Handler(BaseHTTPRequestHandler):
        def do_GET(self):
            try:
                target = canonical_path(self.path)
            except ValueError:
                self.respond(400, {"error": "invalid_request_path"})
                return
            if target == "/__health":
                self.respond(200, {"mode": "local_fixture_replay", "fixtures": len(records),
                                   "upstream_requests": False})
                return
            record = records.get(request_key("GET", target, request_variants("GET", target, self.headers)))
            if record is None:
                self.respond(501, {"error": "fixture_not_recorded", "method": "GET",
                                   "path": urlsplit(target).path})
                return
            self.respond(record["status"], record["body"])

        def do_POST(self):
            self.close_connection = True
            self.respond(501, {"error": "write_and_authentication_routes_not_implemented"})

        do_PUT = do_POST
        do_PATCH = do_POST
        do_DELETE = do_POST

        def respond(self, status: int, value: object):
            body = b"" if status in (204, 205, 304) else json.dumps(value, allow_nan=False).encode()
            self.send_response(status)
            self.send_header("Content-Type", "application/json")
            self.send_header("Content-Length", str(len(body)))
            self.send_header("Cache-Control", "no-store")
            self.end_headers()
            self.wfile.write(body)

        def log_message(self, *_):
            # No headers, query values, response payloads or credentials in logs.
            pass

    return Handler


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--fixtures", type=Path, required=True)
    parser.add_argument("--port", type=int, default=8765)
    args = parser.parse_args()
    if not args.fixtures.is_dir():
        parser.error("Select a directory containing captures or explicitly created local fixtures")
    records = load_fixtures(args.fixtures)
    server = ThreadingHTTPServer(("127.0.0.1", args.port), handler_for(records))
    print(f"Local replay: http://127.0.0.1:{server.server_port}; {len(records)} fixtures", flush=True)
    try:
        server.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        server.server_close()


if __name__ == "__main__":
    main()
