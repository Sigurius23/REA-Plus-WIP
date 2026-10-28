from contextlib import contextmanager
import http.client
from http.server import ThreadingHTTPServer
import importlib.util
import json
from pathlib import Path
import tempfile
from threading import Thread
from types import SimpleNamespace
import unittest

from replay import canonical_path, handler_for, load_fixtures, route_for, save_fixture


@contextmanager
def serving(records):
    server = ThreadingHTTPServer(("127.0.0.1", 0), handler_for(records))
    worker = Thread(target=server.serve_forever, daemon=True)
    worker.start()
    try:
        yield server.server_port
    finally:
        server.shutdown()
        server.server_close()
        worker.join(timeout=2)


def request(port, method, path, headers=None):
    client = http.client.HTTPConnection("127.0.0.1", port, timeout=3)
    try:
        client.request(method, path, headers=headers or {})
        response = client.getresponse()
        return response.status, json.loads(response.read())
    finally:
        client.close()


class ReplayTests(unittest.TestCase):
    def test_captured_json_is_replayed_with_exact_queries_and_no_write_passthrough(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            body = {"fixture_only": True, "show_education": False}
            save_fixture(root, "GET", "/onboarding-service/v1/feature-education-state?userId=7&flow=setup",
                         200, body, "synthetic.invalid")
            fixtures = load_fixtures(root)
            with serving(fixtures) as port:
                self.assertEqual(request(port, "GET", "/onboarding-service/v1/feature-education-state?flow=setup&userId=7"), (200, body))
                self.assertEqual(request(port, "GET", "/onboarding-service/v1/feature-education-state?userId=8&flow=setup")[0], 501)
                self.assertEqual(request(port, "GET", "/not-recorded")[0], 501)
                self.assertEqual(request(port, "POST", "/entitlement-service/v1/entitlements")[0], 501)
                self.assertFalse(request(port, "GET", "/__health")[1]["upstream_requests"])

    def test_capture_selection_excludes_auth_unlock_and_other_hosts(self):
        self.assertIsNotNone(route_for("GET", "/membership-service/v1/straps"))
        self.assertIsNotNone(route_for("GET", "/feature-flags/flags/onboarding/EXAMPLE"))
        self.assertIsNone(route_for("POST", "/auth-service/v3/whoop"))
        self.assertIsNone(route_for("GET", "/firmware-service/v4/strap/unlock-token"))
        self.assertIsNone(route_for("GET", "/feature-flags/flags/onboarding/extra/path"))
        with self.assertRaises(ValueError):
            canonical_path("https://api.prod.whoop.com/users-service/v2/bootstrap")

    def test_duplicate_fixtures_are_rejected(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            first = save_fixture(root, "GET", "/feature-flags/flags/user", 200, [], "synthetic.invalid")
            (root / "duplicate.json").write_bytes(first.read_bytes())
            with self.assertRaisesRegex(ValueError, "Duplicate"):
                load_fixtures(root)

    def test_recorded_no_body_status_sends_zero_bytes(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            path = "/feature-flags/flags/user"
            for status in (204, 205, 304):
                save_fixture(root, "GET", path, status, {"ignored": "synthetic"}, "synthetic.invalid")
                with serving(load_fixtures(root)) as port:
                    client = http.client.HTTPConnection("127.0.0.1", port, timeout=3)
                    try:
                        client.request("GET", path)
                        response = client.getresponse()
                        self.assertEqual(response.status, status)
                        self.assertEqual(response.getheader("Content-Length"), "0")
                        self.assertEqual(response.read(), b"")
                    finally:
                        client.close()

    def test_strap_dependent_navigation_matches_hashed_request_variant(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            path = '/onboarding-service/v1/app/destination?flow=setup'
            header = {'X-WHOOP-Strap-Signature': 'synthetic-strap-signature'}
            fixture = save_fixture(root, 'GET', path, 200, {'screen': 'fixture', 'parameters': {}},
                                   'synthetic.invalid', header)
            self.assertNotIn('synthetic-strap-signature', fixture.read_text())
            with serving(load_fixtures(root)) as port:
                self.assertEqual(request(port, 'GET', path, header)[0], 200)
                self.assertEqual(request(port, 'GET', path)[0], 501)
                self.assertEqual(request(port, 'GET', path, {'X-WHOOP-Strap-Signature': 'other'})[0], 501)

    def test_startup_addon_preserves_body_but_omits_authentication_headers(self):
        try:
            import mitmproxy  # noqa: F401
        except ImportError:
            self.skipTest("Run with the existing whoop-mitm-venv to verify the mitmproxy addon")
        source = Path(__file__).resolve().parent.parent / "capture/startup_capture.py"
        spec = importlib.util.spec_from_file_location("startup_capture", source)
        addon = importlib.util.module_from_spec(spec)
        spec.loader.exec_module(addon)
        addon.ctx = SimpleNamespace(log=SimpleNamespace(info=lambda _: None, warn=lambda _: None))
        with tempfile.TemporaryDirectory() as temporary:
            addon.ARTIFACT_DIRECTORY = Path(temporary)
            addon.DIRECTORY = Path(temporary)/'startup'
            flow = SimpleNamespace(
                request=SimpleNamespace(pretty_host="api.prod.whoop.com", method="GET",
                    path="/feature-flags/flags/user", headers={"Authorization": "Bearer synthetic-test-only"}),
                response=SimpleNamespace(content=b'["SYNTHETIC_FLAG"]', status_code=200))
            addon.response(flow)
            files = list(addon.DIRECTORY.glob("*.json"))
            self.assertEqual(len(files), 1)
            captured = files[0].read_text()
            self.assertNotIn("Bearer", captured)
            self.assertEqual(json.loads(captured)["body"], ["SYNTHETIC_FLAG"])
            self.assertEqual(files[0].stat().st_mode & 0o777, 0o600)
            flow.request.pretty_host = "other.invalid"
            flow.request.path = "/app-configuration-service/v1/config"
            addon.response(flow)
            self.assertEqual(len(list(addon.DIRECTORY.glob("*.json"))), 1)


if __name__ == "__main__":
    unittest.main()
