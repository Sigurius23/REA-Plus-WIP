import base64
import json
from pathlib import Path
import tempfile
from types import SimpleNamespace
import unittest
from unittest.mock import patch

import unlock_token_capture as addon


class CaptureTests(unittest.TestCase):
    def test_related_artifacts_share_identity_are_private_and_logs_omit_tokens(self):
        raw = b'\xfb\xff\xff' * 8
        token = base64.urlsafe_b64encode(raw).decode()
        messages = []
        with tempfile.TemporaryDirectory() as temporary:
            root = Path(temporary)
            with patch.multiple(addon, ARTIFACT_DIR=str(root), EXCHANGES_DIR=str(root/'exchanges'), TOKENS_DIR=str(root/'tokens'),
                                CONFIG_DIR=str(root/'config'), ctx=SimpleNamespace(log=SimpleNamespace(
                                    info=messages.append, error=messages.append))):
                request = SimpleNamespace(path='/firmware-service/v4/strap/unlock-token', method='POST',
                    pretty_url='https://api.prod.whoop.com/firmware-service/v4/strap/unlock-token',
                    headers={'X-WHOOP-Strap-Id': 'synthetic-band', 'Authorization': 'Bearer synthetic-only'},
                    get_text=lambda: json.dumps({'strapSignature': 'synthetic-signature'}))
                response = SimpleNamespace(status_code=200, headers={}, get_text=lambda: json.dumps({'token': token}))
                addon.response(SimpleNamespace(request=request, response=response))
                exchange = next((root/'exchanges').glob('*.json'))
                identity = exchange.stem
                self.assertEqual((root/'tokens'/f'{identity}.bin').read_bytes(), raw)
                self.assertEqual((root/'tokens'/f'{identity}.b64').read_text(), token)
                self.assertEqual(json.loads(exchange.read_text())['meta']['capture_id'], identity)
                self.assertNotIn(token, '\n'.join(messages))
                self.assertNotIn('Bearer synthetic-only', '\n'.join(messages))
                for path in root.rglob('*'):
                    self.assertEqual(path.stat().st_mode & 0o777, 0o700 if path.is_dir() else 0o600)


if __name__ == '__main__':
    unittest.main()
