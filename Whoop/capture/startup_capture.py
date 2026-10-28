"""mitmproxy addon for the source-backed startup GET shortlist.

Run alongside unlock_token_capture.py. Captures JSON response fixtures only;
Authorization/Cookie headers and auth endpoints are never recorded here.
"""
import json
import os
from pathlib import Path
import sys

from mitmproxy import ctx, http

MOCK = Path(__file__).resolve().parent.parent / "mock_backend"
sys.path.insert(0, str(MOCK))
from replay import MAX_FIXTURE_BYTES, route_for, save_fixture  # noqa: E402

ARTIFACT_DIRECTORY = Path(os.environ.get("WHOOP_CAPTURE_DIR", str(Path(__file__).resolve().parent / "artifacts")))
DIRECTORY = ARTIFACT_DIRECTORY / "startup"


def response(flow: http.HTTPFlow) -> None:
    if flow.request.pretty_host != "api.prod.whoop.com" or flow.response is None:
        return
    route = route_for(flow.request.method, flow.request.path)
    if route is None:
        return
    try:
        raw = flow.response.content or b""
        if len(raw) > MAX_FIXTURE_BYTES:
            raise ValueError("Startup response exceeds the local fixture budget")
        body = None if not raw else json.loads(raw)
        ARTIFACT_DIRECTORY.mkdir(mode=0o700, parents=True, exist_ok=True)
        ARTIFACT_DIRECTORY.chmod(0o700)
        save_fixture(DIRECTORY, flow.request.method, flow.request.path,
                     flow.response.status_code, body, flow.request.pretty_host, flow.request.headers)
        ctx.log.info(f"[startup-capture] saved {route['path']} status={flow.response.status_code}")
    except (ValueError, OSError):
        ctx.log.warn(f"[startup-capture] skipped unreadable or oversized response for {route['path']}")
