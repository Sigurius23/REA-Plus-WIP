"""Exercise both addons through real mitmdump against an owned loopback origin."""
import base64
import http.client
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer
import json
import os
from pathlib import Path
import socket
import subprocess
import sys
import tempfile
from threading import Thread
import time
import unittest


class LocalProxyTests(unittest.TestCase):
    def test_real_proxy_records_only_local_synthetic_exchange_and_startup(self):
        mitmdump = Path(sys.prefix)/'bin/mitmdump'
        if not mitmdump.is_file():
            self.skipTest('Use the existing whoop-mitm-venv for real mitmdump verification')
        raw = b'\xfb\xff\xff' * 8
        token = base64.urlsafe_b64encode(raw).decode()

        class Origin(BaseHTTPRequestHandler):
            def do_POST(self):
                self.rfile.read(int(self.headers.get('Content-Length', '0')))
                self.reply({'token': token})

            def do_GET(self):
                self.reply([{'key': 'mobile-strap-unlock-refresh-threshold-days', 'value': '38'}])

            def reply(self, value):
                encoded = json.dumps(value).encode()
                self.send_response(200)
                self.send_header('Content-Type', 'application/json')
                self.send_header('Content-Length', str(len(encoded)))
                self.end_headers()
                self.wfile.write(encoded)

            def log_message(self, *_):
                pass

        origin = ThreadingHTTPServer(('127.0.0.1', 0), Origin)
        worker = Thread(target=origin.serve_forever, daemon=True)
        worker.start()
        process = None
        try:
            with tempfile.TemporaryDirectory() as temporary:
                root = Path(temporary)
                with socket.socket() as reservation:
                    reservation.bind(('127.0.0.1', 0))
                    proxy_port = reservation.getsockname()[1]
                environment = os.environ.copy()
                environment['WHOOP_CAPTURE_DIR'] = str(root/'artifacts')
                here = Path(__file__).resolve().parent
                with (root/'proxy.log').open('wb') as log:
                    process = subprocess.Popen([str(mitmdump), '--mode',
                        f'reverse:http://127.0.0.1:{origin.server_port}',
                        '--listen-host', '127.0.0.1', '--listen-port', str(proxy_port),
                        '--set', 'keep_host_header=true', '--set', f'confdir={root / "mitm-conf"}',
                        '-s', str(here/'unlock_token_capture.py'), '-s', str(here/'startup_capture.py')],
                        env=environment, stdout=log, stderr=log)
                    try:
                        deadline = time.monotonic() + 12
                        while True:
                            if process.poll() is not None or time.monotonic() >= deadline:
                                self.fail('Local mitmdump failed to start: ' + (root/'proxy.log').read_text()[-1000:])
                            try:
                                with socket.create_connection(('127.0.0.1', proxy_port), timeout=.1):
                                    break
                            except OSError:
                                time.sleep(.1)
                        headers = {'Host': 'api.prod.whoop.com', 'Authorization': 'Bearer synthetic-only',
                                   'X-WHOOP-Strap-Id': 'synthetic-band', 'Content-Type': 'application/json'}
                        for method, path, body in [
                            ('POST', '/firmware-service/v4/strap/unlock-token', '{"strapSignature":"synthetic"}'),
                            ('GET', '/configuration/v1/services/mobile/name/Android/properties', None)]:
                            client = http.client.HTTPConnection('127.0.0.1', proxy_port, timeout=4)
                            try:
                                client.request(method, path, body=body, headers=headers)
                                response = client.getresponse()
                                self.assertEqual(response.status, 200)
                                response.read()
                            finally:
                                client.close()
                        exchange = next((root/'artifacts/exchanges').glob('*.json'))
                        self.assertEqual((root/'artifacts/tokens'/f'{exchange.stem}.bin').read_bytes(), raw)
                        fixture = next((root/'artifacts/startup').glob('*.json'))
                        self.assertNotIn('Authorization', fixture.read_text())
                        self.assertEqual(json.loads(fixture.read_text())['body'][0]['value'], '38')
                        self.assertEqual(len(list((root/'artifacts/config').glob('*.json'))), 1)
                        self.assertEqual((root/'artifacts').stat().st_mode & 0o777, 0o700)
                    finally:
                        process.terminate()
                        try:
                            process.wait(timeout=5)
                        except subprocess.TimeoutExpired:
                            process.kill()
                            process.wait(timeout=5)
                        process = None
                self.assertNotIn(token, (root/'proxy.log').read_text())
        finally:
            if process is not None and process.poll() is None:
                process.kill()
                process.wait(timeout=5)
            origin.shutdown()
            origin.server_close()
            worker.join(timeout=2)


if __name__ == '__main__':
    unittest.main()
