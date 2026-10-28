# Local startup response replay

This is the first slice of task 3: a source-backed capture shortlist and a local
fixture replay server. It has no live WHOOP fixtures yet and has not driven the
app through startup. It does not implement Cognito login, refresh-token issuance,
strap unlock, uploads, scoring, or an official developer API adapter.

`contracts.json` lists eight core GET candidates and three conditional ones,
with response-shape notes and exact decompiled-source citations. Runtime capture
must establish which are actually required, their order, and missing calls.
The saved 542-path inventory is incomplete: relative Retrofit routes are absent.
For example, `MembershipV2Api` resolves `straps` against `/membership-service/v1/`.

Important contract details:

- Bootstrap must contain `account`, `user`, and `account.user_id` for the login
  converter. `{}` is not a working login fixture; profile dates/enums also need
  valid values. See `pd1/C29104a.java:374–413`.
- Kotlin serialization enables SnakeCase (`u82/AbstractC34650k.java:36`), matching
  the listed wire names such as `last_seen_strap` and `membership_type`.
- Navigation responses use `screen`, not `screen_name`; preserve the original
  `parameters` object and optional `tab.id`. See
  `com/whoop/navigation/json/NavigationActionTypeAdapter.java:321–327`.
- `/auth-service/v3/whoop` is a Cognito SDK endpoint override, not evidence of a
  simple username/password JSON API. No guessed authentication handler is served.

## Capture real response fixtures

Run this alongside the unlock capture during the authorized phone session:

```sh
cd Whoop/capture
/tmp/whoop-mitm-venv/bin/mitmdump -p 8888 \
  -s unlock_token_capture.py -s startup_capture.py
```

The startup addon captures only the listed GET paths on `api.prod.whoop.com`.
Files go to `capture/artifacts/startup/` with mode 0600. Response bodies may
contain personal data; the folder is ignored by Git. Authorization/Cookie
headers are omitted. Strap-dependent navigation variants retain a hash of the
request signature for exact matching. Use a separate fixture directory per
account and capture session. A repeat request atomically replaces its fixture.

## Check the selected local fixture set

```sh
python3 Whoop/mock_backend/check_fixtures.py \
  --fixtures Whoop/capture/artifacts/startup
```

This read-only command checks successful JSON responses against all eleven
source-backed DTO shapes. It reports known field paths and request hashes,
omitting response/query values. It lists missing core captures, routes without
a shape pass, structural errors and separate conversion warnings. It exits 1
for an empty/invalid set or structural errors; missing routes and conversion
warnings are informational. Non-success and no-body responses are preserved
and skipped. Captures are never rewritten or filled with invented defaults.

These checks deliberately validate uncoerced JSON. The app's Kotlin/Gson
converters can differ on defaults and coercion; profile date parsing and
screen-specific navigation still require runtime verification. An empty
bootstrap can pass DTO shape checks while triggering login-conversion warnings.
A passing report does not establish working login or startup. Source details
and limitations are in [RESPONSE-CONTRACTS.md](RESPONSE-CONTRACTS.md).

## Serve the selected local fixture set

```sh
python3 Whoop/mock_backend/replay.py \
  --fixtures Whoop/capture/artifacts/startup --port 8765
```

The server binds `127.0.0.1` and has no upstream client. GET `/__health` reports
how many fixtures were loaded. A request matches its method, path, full query,
and any defined header variant. Missing recordings return 501; writes and auth
operations return 501. Recorded error statuses are preserved. Fixture changes
require a restart. Ambiguous duplicate JSON members and nonfinite numbers are
rejected at load time; malformed response shapes can still be replayed for
diagnosis. The server does not redirect the app's hardcoded HTTPS host;
app integration and TLS routing are a later device-tested step.

All current verification used explicitly synthetic fixtures. Run it with:

```sh
/tmp/whoop-mitm-venv/bin/python -m unittest discover \
  -s Whoop/mock_backend -p 'test_*.py' -v
```
