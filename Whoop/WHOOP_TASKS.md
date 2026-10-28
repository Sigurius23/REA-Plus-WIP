# WHOOP work items

Open tasks for the WHOOP use case (WHOOP MG band, eBay strap). General
REA+ project work stays in `../OPEN_TASKS.md`. Full analysis details live in
`notes-rea-analysis.md`.

## Investigation result (2026-10-25): confirmed

The original goal — "edit the app so I can connect my WHOOP MG band and use
all the features without the subscription" — is **not achievable by patching
the app alone**:

- The analysis models (recovery, strain, sleep scoring) are **server-side
  only**. The complete decompilation (47,235 classes) contains no local
  scoring code; the app renders computed scores from `api.prod.whoop.com`.
- The built entitlement patch (`we1/g.smali` → always-`true`, shipped as
  `patch/base-patched-signed.apk`) unlocks everything the *client* gates.
  Payload-server features (AI coach, hormonal insights, etc.) still 403 from
  their APIs without a real subscription.
- "Downloading their models" is not a shortcut: the models are server-side
  compute, not shippable artifacts. The API responses carry computed scores,
  never the models.

## Status

- [x] Entitlement patch built and signed (`patch/BUILD-PLAN.md`, 2026-10-25)
  - `we1/g.smali` `b(Entitlement)Z` → `const/4 v0,1`
  - `res/xml/certificates.xml` trusts user CAs (for mitm capture)
  - Keystore: `/tmp/whoop-patch.jks` (recreate for future re-signs)
- [x] Strap unlock flow fully traced (session 5/5b, `notes-rea-analysis.md`)
- [x] Unlock-token capture tooling verified end-to-end (`capture/`)
- [x] Boundary confirmed: client-gated vs payload-server features

## Progress — 2026-10-25 continuation

- [x] Signed patched APK inspected: release-level system + user CA trust
  confirmed from the actual signed artifact; system-CA promotion is not needed
  for this build. APK signature verifies with v3.
- [x] Complete install set prepared: ABI/density splits aligned and re-signed
  with the patched base's key. The base alone has no native libraries and
  declares required splits. See `patch/DEVICE-TEST.md` and
  `patch/install-set/manifest.json`.
- [x] Read-only phone/install preflight: `patch/check_device.py` checks SDK,
  ARM32 ABI support, existing app state and artifact hashes. No phone is
  currently connected; nothing has been installed or cleared.
- [x] Capture preparation improved: private correlated artifacts, exact
  base64url wire bytes, no token values in proxy logs, and
  `capture/inspect_capture.py` for unverified date claims/config summaries.
- [x] Static refresh semantics corrected: default **38 days**; the observed
  guard is `UNLOCKED && counterSeconds <= threshold_days * 86400`.
  This is a refresh threshold, not the token TTL. Live override and firmware
  acceptance/expiry remain unknown.
- [x] First mock-backend slice: source-backed 8 core + 3 conditional GET
  candidates, selective startup capture addon, and loopback-only fixture replay
  server. Exact queries/header variants match; missing fixtures/writes return
  501 and nothing forwards to WHOOP. See `mock_backend/README.md`.
- [x] Eleven focused Python tests pass, covering synthetic data, a generated real
  X.509 certificate, local HTTP replay, and both addons through real mitmdump;
  decoder self-test also passes. The proxy test caught and corrected config
  snapshots ignoring the API's list-shaped configuration response.

**Waiting on external evidence:** an authorized connected phone, logged-in
account/trial session, and the owned band. Live token/config capture,
on-device gate behavior and real startup responses have not been observed.

## Progress — 2026-10-26 offline continuation

User selected **offline tasks**; device work remains deferred.

- [x] Source-backed response checks for all 11 shortlisted GET contracts:
  `mock_backend/check_fixtures.py` reports strict JSON-shape errors separately
  from login/profile/navigation conversion warnings. It preserves captures,
  lists coverage gaps and omits response/query values from diagnostics.
  See `mock_backend/RESPONSE-CONTRACTS.md` for DTO evidence and limitations.
- [x] Replay JSON loader rejects duplicate members and nonfinite numbers;
  recorded no-body statuses 204/205/304 emit zero bytes. Authentication,
  real startup ordering and account identity remain unverified.
- [x] Raw packet storage traced: `persistent_packet_db`, Room version 17.
  `offline_data/packet_export.py` exports four selected packet tables and
  optional firmware/version metadata from an explicitly supplied stable copy.
  It preserves BLOB bytes, revision/frame/version fields and integer precision,
  handles captured WAL on a staged copy, and records source/output hashes.
  It rejects incompatible schemas rather than migrating them. This is storage
  groundwork; sensor decoding and score computation remain open.
- [x] Offline verification: **40 focused Python tests passed** (15 mock-backend,
  6 capture, 19 packet-export), plus a real exporter CLI smoke check on synthetic
  SQLite data, decoder self-test, Python AST checks and `git diff --check`.
  WAL testing confirmed committed rows were exported without changing the
  original DB/WAL/SHM. No real capture or user database has been tested.

## Open

1. **Live unlock-token capture** — run `capture/unlock_token_capture.py`
   against a logged-in session (trial account works):
   - Open questions: the live refresh setting
     (`mobile-strap-unlock-refresh-threshold-days`), token expiry claims, and
     firmware acceptance semantics. The refresh setting alone is not a TTL.
   - Prerequisite: connected test phone, account session and owned band. The
     signed patched build trusts user CAs; install the proxy CA as a user CA.
     The stock release has different trust behavior. See `capture/README.md`.
   - Preparation complete; actual capture is waiting on the device. The static
     refresh fallback is 38 days, while token expiry semantics remain unknown.
   - Artifacts stay local-only (contain live bearer tokens).
2. **On-device test of `base-patched-signed.apk`** — verify the entitlement
   gate behaves as predicted with a trial account and whether the deferred
   `b30/u2` membershipAdjustment nav wall (PATCH 3) actually fires; patch
   it only if it does. Use the complete matching split set and read-only
   preflight in `patch/DEVICE-TEST.md`; runtime verification is still pending.
3. **Mock backend** (the larger project; only path to "all features without
   WHOOP's servers"):
   - Reimplement the client-facing API surface — 542 paths, full list in
    `../field-tests/whoop-android-5.473.0-api-paths.txt`; pick the subset the
   patched app actually exercises before pairing/sync. The saved list omits
   relative Retrofit paths, so it is not exhaustive. `mock_backend/contracts.json`
   now records a source-backed startup shortlist. Capture/replay tooling is
   implemented and tested with synthetic fixtures, but real app integration
   and the actual minimal request set still require capture. Run
   `mock_backend/check_fixtures.py` before replay to inspect DTO errors,
   converter warnings and missing routes; a shape pass is not proof of startup.
   - **Official developer API (OAuth) as a data source** for read paths where
     its data model fits (sleep, recovery, strain, workouts, physiological
     metrics). Restriction: read-only, historical, no raw sensor streams; the
     app's private API (capture/replay) still covers writes, real-time, and
     uncensored raw data. Not a subscription bypass: it authenticates as a
     user with an active subscription (a trial works).
   - Write own recovery/strain/sleep scoring approximations fed by the raw
   packet data the app already stores locally (Room tables:
   `table_metrics_data`, `sensor_data_packets`, `console_packets`,
   `table_research_packets`). These are tables in `persistent_packet_db`, not
   four separate databases. The v17 exporter and schema/revision trace are
   documented in `offline_data/README.md`. No real database has been acquired;
   decoding, sampling rates, calibration and score validation remain pending.
   - Serving strategy either: redirect the API host (no pinning stands in
   the way — session 5), or serve replayed responses only.
4. **Capture-once / replay path** — archive the
   `{serial, strapSignature, unlock-token response}` bundle per band, then
   either replay the cert transfer with a small BLE client or mock
   `firmware-service/v4/strap/unlock-token`. Limited by the cert validity
   window and request binding; needs item 1's expiry evidence and observation
   of signature/nonce stability first. No replayability has been established.
5. **Deferred / rejected**:
   - Strap protocol deep-read beyond the unlock exchange (not needed for
   the current goal).
   - Kenmore/Copley codename identification (curiosity only).
   - APK signature verification in REA+ (callers exist; see OPEN_TASKS.md).

## Non-goals

- Anything involving unauthorized access to WHOOP's infrastructure. All
  work stays on software and hardware we own, with our own accounts. The
  server-side models are out of reach by design; the plan is to approximate
  scoring, not recover their models.
