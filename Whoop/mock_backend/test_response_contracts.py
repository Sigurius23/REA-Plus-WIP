import copy
import json
from pathlib import Path
import subprocess
import sys
import tempfile
import unittest

from check_fixtures import check_directory
from replay import CONTRACTS, load_fixtures, save_fixture
from response_contracts import CHECKS, validate_response


class ResponseContractTests(unittest.TestCase):
    def check(self, path, body):
        return validate_response(path, body)

    def test_every_shortlisted_contract_has_a_checker(self):
        self.assertEqual(set(CHECKS), {route["path"] for route in CONTRACTS})

    def test_configuration_wire_types_unknown_fields_and_empty_arrays(self):
        path = "/configuration/v1/services/mobile/name/Android/properties"
        for valid in ([], [{"key": "synthetic", "value": "false", "future": {"any": None}}]):
            self.assertEqual(self.check(path, valid)["errors"], [])
        for invalid in ({"key": "synthetic"}, [None], [{"key": "synthetic"}], [{"key": "synthetic", "value": False}]):
            self.assertTrue(self.check(path, invalid)["errors"])
        self.assertTrue(self.check("/feature-flags/flags/user", [None])["errors"])
        self.assertTrue(self.check("/feature-flags/flags/onboarding/{flagName}", 1)["errors"])

    def test_bootstrap_shape_and_downstream_conversion_are_distinct(self):
        path = "/users-service/v2/bootstrap"
        empty = self.check(path, {})
        self.assertEqual(empty["errors"], [])
        self.assertEqual({item["path"] for item in empty["conversion_warnings"]}, {"$.account", "$.user"})
        account = {"username": "fixture", "email": "synthetic.invalid", "created_at": "fixture",
                   "can_upload_data": False, "deidentified": False, "concealed": False}
        body = {"account": account, "user": {}, "profile": None, "bio_data": {"recovery_count": 0}}
        original = copy.deepcopy(body)
        checked = self.check(path, body)
        self.assertEqual(checked["errors"], [])
        self.assertIn("$.account.user_id", {item["path"] for item in checked["conversion_warnings"]})
        self.assertEqual(body, original)
        account["user_id"] = True
        self.assertTrue(self.check(path, body)["errors"])
        account["user_id"] = 2**31
        self.assertTrue(self.check(path, body)["errors"])
        account["user_id"] = -(2**31)
        self.assertEqual(self.check(path, body)["errors"], [])
        del account["concealed"]
        self.assertIn("$.account.concealed", {item["path"] for item in self.check(path, body)["errors"]})

    def test_profile_exact_enum_conversion_warning_and_finite_numbers(self):
        path = "/users-service/v2/bootstrap"
        body = {"profile": {"unit_system": "METRIC", "fitness_level": "invented", "gender": ""}}
        checked = self.check(path, body)
        self.assertEqual(checked["errors"], [])
        warning_paths = {item["path"] for item in checked["conversion_warnings"]}
        self.assertTrue({"$.profile", "$.profile.unit_system", "$.profile.fitness_level"} <= warning_paths)
        self.assertNotIn("$.profile.gender", warning_paths)
        for invalid in (True, float("inf"), float("nan"), "170", 1e100, 10**400):
            body["profile"]["height"] = invalid
            self.assertTrue(self.check(path, body)["errors"])
        body["profile"]["height"] = 3.4028234663852886e38
        self.assertEqual(self.check(path, body)["errors"], [])

    def test_app_config_nested_tabs_analytics_and_navigation(self):
        path = "/app-configuration-service/v1/config"
        body = {"tabs": {"items": [{"id": "fixture", "title": "Fixture", "icon_key": None,
                 "analytic_event": {"name": "fixture", "category": "fixture", "properties": {"arbitrary": [None, 1]}},
                 "destination": {"screen": "fixture", "parameters": {}}}]}, "should_fetch_ai_context": None}
        self.assertEqual(self.check(path, body)["errors"], [])
        body["tabs"]["items"][0]["analytic_event"]["properties"] = None
        self.assertTrue(self.check(path, body)["errors"])
        self.assertEqual(self.check(path, {"tabs": None})["errors"], [])
        self.assertTrue(self.check(path, {"tabs": {"items": [None]}})["errors"])

    def test_map_booleans_entitlement_defaults_and_straps(self):
        education = "/onboarding-service/v1/feature-education-state"
        self.assertEqual(self.check(education, {"future": True})["errors"], [])
        self.assertTrue(self.check(education, {"private-map-key": 1})["errors"])
        self.assertNotIn("private-map-key", json.dumps(self.check(education, {"private-map-key": 1})))
        entitlement = "/entitlement-service/v1/entitlements"
        self.assertEqual(self.check(entitlement, {"entitlements": {"future": {}}, "context": {"membership_type": None}})["errors"], [])
        for bad in ({"entitlements": None}, {"entitlements": {"future": None}}, {"entitlements": {"future": {"entitled": 1}}}):
            self.assertTrue(self.check(entitlement, bad)["errors"])
        straps = "/membership-service/v1/straps"
        body = {"last_seen_strap": None, "previous_straps": [{"generation": "UNKNOWN_FUTURE", "serial": None, "first_seen": "opaque"}]}
        self.assertEqual(self.check(straps, body)["errors"], [])
        self.assertTrue(self.check(straps, {"previous_straps": [None]})["errors"])

    def test_navigation_converter_dependent_fields_are_warnings(self):
        path = "/onboarding-service/v1/app/destination"
        checked = self.check(path, {"screen": "future", "tab": "malformed"})
        self.assertEqual(checked["errors"], [])
        self.assertEqual({item["path"] for item in checked["conversion_warnings"]}, {"$", "$.tab", "$.parameters"})
        self.assertTrue(self.check(path, {"screen": "fixture", "parameters": []})["errors"])
        self.assertTrue(self.check(path, {"screen_name": "fixture", "parameters": {}})["errors"])

    def test_actual_check_cli_preserves_captures_omits_values_and_skips_error_bodies(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            first = save_fixture(root, "GET", "/configuration/v1/services/mobile/name/Android/properties",
                                 200, [{"key": "private-configuration", "value": 7}], "synthetic.invalid")
            second = save_fixture(root, "GET", "/feature-flags/flags/user", 403,
                                  {"server_error": "private-value"}, "synthetic.invalid")
            before = {path.name: path.read_bytes() for path in (first, second)}
            cli = subprocess.run([sys.executable, str(Path(__file__).with_name("check_fixtures.py")),
                                  "--fixtures", str(root)], capture_output=True, text=True, timeout=5)
            self.assertEqual(cli.returncode, 1, cli.stderr)
            report = json.loads(cli.stdout)
            self.assertEqual(report["shape_error_count"], 1)
            self.assertFalse(report["app_startup_verified"])
            self.assertTrue(report["missing_core_contracts"])
            self.assertIn("skipped_non_body_or_non_success_response", {item["validation"] for item in report["fixtures"]})
            self.assertNotIn("private-", cli.stdout)
            self.assertEqual(before, {path.name: path.read_bytes() for path in (first, second)})
            save_fixture(root, "GET", "/configuration/v1/services/mobile/name/Android/properties",
                         200, [], "synthetic.invalid")
            passing = subprocess.run(cli.args, capture_output=True, text=True, timeout=5)
            self.assertEqual(passing.returncode, 0, passing.stderr)
            self.assertEqual(json.loads(passing.stdout)["shape_error_count"], 0)

    def test_loader_rejects_ambiguous_and_nonfinite_json_at_boundary(self):
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            record = {"method": "GET", "path": "/feature-flags/flags/user", "status": 200,
                      "body": [], "request_variant_hashes": {}}
            file = root / "fixture.json"
            malformed = ("[]", "{}", '{"method":"GET","method":"POST"}',
                         json.dumps(dict(record, status=True)), json.dumps(dict(record, path=[])),
                         json.dumps(dict(record, body=[float("nan")])),
                         json.dumps(record).replace('"body": []', '"body": [1e999]'))
            for text in malformed:
                with self.subTest(text=text):
                    file.write_text(text)
                    with self.assertRaises(ValueError):
                        load_fixtures(root)
            file.unlink()
            self.assertEqual(check_directory(root)["fixture_count"], 0)
            with self.assertRaises(ValueError):
                check_directory(root / "absent")


if __name__ == "__main__":
    unittest.main()
