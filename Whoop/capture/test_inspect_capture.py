import base64
from datetime import datetime, timedelta, timezone
import hashlib
import json
import unittest

from cryptography import x509
from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import ec
from cryptography.x509.oid import NameOID

import decoders
from inspect_capture import CONFIG_KEY, refresh_settings, token_summary


class ExpiryTests(unittest.TestCase):
    def test_real_certificate_dates_are_reported_without_asserting_acceptance(self):
        now = datetime(2026, 10, 25, tzinfo=timezone.utc)
        key = ec.generate_private_key(ec.SECP256R1())
        name = x509.Name([x509.NameAttribute(NameOID.COMMON_NAME, "synthetic fixture")])
        certificate = (x509.CertificateBuilder().subject_name(name).issuer_name(name)
            .public_key(key.public_key()).serial_number(1)
            .not_valid_before(now - timedelta(days=1)).not_valid_after(now + timedelta(days=2))
            .sign(key, hashes.SHA256()))
        token = base64.urlsafe_b64encode(certificate.public_bytes(serialization.Encoding.DER)).decode()
        report = token_summary(token, now)
        self.assertEqual(report['certificates'][0]['time_status'], 'within_claimed_window')
        self.assertEqual(report['certificates'][0]['window_seconds'], 3 * 86400)
        self.assertEqual(token_summary(token, now + timedelta(days=3))['certificates'][0]['time_status'], 'expired')
        self.assertFalse(report['signature_verified'])
        self.assertEqual(report['firmware_acceptance'], 'unknown')
        self.assertNotIn(token, json.dumps(report))

    def test_unverified_jws_exposes_only_temporal_claims(self):
        def encode(value):
            return base64.urlsafe_b64encode(json.dumps(value).encode()).decode().rstrip('=')
        token = encode({'alg': 'ES256'}) + '.' + encode({'exp': 1792972800, 'private': 'synthetic hidden'}) + '.c2ln'
        report = token_summary(token)
        self.assertEqual(report['container'], 'jws_unverified')
        self.assertIn('exp', report['claims'])
        self.assertNotIn('synthetic hidden', json.dumps(report))
        self.assertFalse(report['signature_verified'])

    def test_refresh_threshold_is_not_promoted_to_token_expiry(self):
        entries = refresh_settings({'response': {'body': [{'key': CONFIG_KEY, 'value': '38'}]}})
        self.assertEqual(entries[0]['days'], 38)
        self.assertIn('not certificate TTL', entries[0]['meaning'])
        self.assertEqual(token_summary('opaque!')['replayability'], 'unknown')

    def test_urlsafe_token_decode_preserves_exact_wire_bytes(self):
        raw = b'\xfb\xff\xff' * 8
        token = base64.urlsafe_b64encode(raw).decode()
        self.assertIn('_', token)
        self.assertEqual(decoders._b64_decode(token), raw)
        self.assertEqual(decoders.analyze_material(token)['bytes']['sha256'], hashlib.sha256(raw).hexdigest())
        self.assertIsNone(decoders._b64_decode('not!base64'))


if __name__ == '__main__':
    unittest.main()
