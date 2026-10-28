# Capture an authorized WHOOP session

Capture one real strap unlock exchange and the source-backed startup read
shortlist. Live capture has not happened: no Android device was connected in
the 25 October preparation pass. No WHOOP requests were made during verification.

## Ready on this Mac

- `/tmp/whoop-mitm-venv/bin/mitmdump`: mitmproxy 12.3.0.
- `unlock_token_capture.py`: full selected unlock request/response archive,
  matching token text/wire bytes, and configuration snapshots.
- `startup_capture.py`: JSON response fixtures for the 8 core + 3 conditional
  GET candidates in `../mock_backend/contracts.json`. It omits bearer/cookie
  headers and auth endpoints; fixtures may still contain personal profile data.
- `inspect_capture.py`: expiry-claim summary that omits token/header values.
  Its X.509 parser uses the existing venv's cryptography package.
- `decoders.py`: zero-dependency container/DER/protobuf heuristics. The expiry
  inspector uses the X.509 parser instead of treating a DER-shaped blob as a
  validated certificate. Base64url decoding now preserves `-` and `_` correctly.

Artifacts are Git-ignored. New private artifact directories use mode 0700,
files mode 0600. Unlock artifacts share a microsecond capture ID; token values
and bearer headers are not printed in proxy log messages. The full unlock
exchange file deliberately retains its request Authorization header locally.

## 1. Prepare the phone and test installation

Run `python3 Whoop/patch/check_device.py` after connecting and authorizing USB
ADB. See `../patch/DEVICE-TEST.md` for the complete signed base + split set.
This XAPK requires an armeabi-v7a-capable Android 9+ device. The base alone
has no native libraries and is not the complete install set.

The signed patched APK has a verified release-level `base-config` trusting
**system and user CAs**. Install the proxy CA as a user certificate on the test
phone. A system-CA modification is unnecessary for this artifact. The stock
release only has user CA trust in debug overrides; that is a different setup.
No explicit certificate pinning was found in the static analysis.

An existing stock WHOOP app has a different signing key. Review its data and
replacement plan before replacing it; the preflight never uninstalls or clears
app storage. Account login and CA installation still require the phone.

## 2. Start the selected capture

```sh
cd Whoop/capture
/tmp/whoop-mitm-venv/bin/mitmdump -p 8888 \
  -s unlock_token_capture.py -s startup_capture.py
```

Configure the test phone's Wi-Fi proxy to this Mac's LAN IP and port 8888.
Use `http://mitm.it` through that proxy to install its CA if necessary.
Keep a record of the previous proxy setting so it can be restored afterward.
The proxy CA normally lives at `~/.mitmproxy/mitmproxy-ca-cert.pem`.

## 3. Trigger the normal owned-band connection

Use the authorized account/trial session and normally pair/connect the band.
A Locked band's connection attempts the unlock exchange. Avoid resetting an
existing app merely to force the trigger: clearing storage removes local data.
A separate fresh test profile/device is preferable when a clean state is needed.

For an already UNLOCKED band, the bytecode's refresh guard is:

```text
counterSeconds <= refresh_threshold_days * 86400
```

The static fallback is **38 days**. This corrects the previous note that said
refresh happened when the counter exceeded the threshold. The protocol meaning
of `counterSeconds` and the live config override still need observation.

**The refresh threshold is not the certificate TTL.** A decoded `notAfter` or
JWS `exp` is an unverified payload claim until its signature/chain and firmware
behavior are established. A config snapshot alone cannot establish replay life.

## 4. Inspect the local artifacts

```text
artifacts/exchanges/<band>-<capture-id>.json    full unlock request/response
artifacts/tokens/<band>-<capture-id>.b64        token text verbatim
artifacts/tokens/<band>-<capture-id>.bin        base64-decoded wire bytes, when decodable
artifacts/config/config-<capture-id>.json      config containing the refresh key
artifacts/startup/<request-hash>.json          selected startup response fixture
```

Use the exact captured filenames:

```sh
/tmp/whoop-mitm-venv/bin/python inspect_capture.py artifacts/exchanges/EXCHANGE.json \
  --config artifacts/config/CONFIG.json
python3 decoders.py artifacts/exchanges/EXCHANGE.json --json
```

The first command reports certificate/JWS date claims, time-window status,
refresh settings, and hashes without printing token values. Signature validity,
firmware acceptance, and replayability remain explicitly unknown. It supports
raw DER certificates, PEM, and JWS/x5c; custom opaque token formats remain unknown.
The generic decoder's full JSON may expose token contents, so keep it local.

Once a real response is captured, compare its claims with observed band behavior
before implementing task 4's replay. No replay material has been captured yet.
Startup fixture use and limitations are described in `../mock_backend/README.md`.

## Verification

```sh
python3 Whoop/capture/decoders.py --selftest
/tmp/whoop-mitm-venv/bin/python -m unittest discover -s Whoop/capture -p 'test_*.py' -v
/tmp/whoop-mitm-venv/bin/python -m unittest discover -s Whoop/mock_backend -p 'test_*.py' -v
```

Run these verification commands from the workspace root (the parent of `Whoop`).
Current checks use synthetic exchanges, a generated X.509 certificate, and a
loopback-only HTTP server. They do not establish real WHOOP startup, pairing,
server authorization, certificate validity, or hardware replay success.
