# REA+ analysis notes — WHOOP 5.473.0

Analyzed with `rea-agents@6.4.0` CLI (jadx-headless-mcp 0.7.1, OpenJDK 21). Raw JSON outputs in `/tmp/whoop-*.json` may have been cleaned up by the OS after this session.

## Environment (to reproduce)

```sh
JAR=rea-local/_reference/apk-integration/jadx-headless-mcp-0.7.1-all.jar   # SHA-256 verified via `npm run fixtures:android`
export REA_JADX_MCP_JAR="$PWD/$JAR"
export JAVA_HOME=/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home
export PATH="$JAVA_HOME/bin:$PATH"
```

Note: the only system `java` is a Java 8 applet JRE; REA refuses it — a full JDK is required.

## Target

| Field | Value |
|---|---|
| File | `WHOOP_5.473.0_APKPure.xapk` (84.2 MB, no top-level `base.apk`) |
| Modules | `com.whoop.android.apk` (base, 58.7 MB), `config.armeabi_v7a.apk`, `config.xhdpi.apk` |
| SHA-256 (xapk) | `f6adb497107e62f1fd49ac140ea9125450cd5d3fb90c2ad409c1d2d7233af148` |
| Base APK SHA-256 | `db865d60f13ebc8537a37775a65f7137c9ea38e4ff5716ec1564d476f31e699d` |
| Package | `com.whoop.android` 5.473.0 (version code 618174) |
| SDKs | minSdk 28 (Android 9), targetSdk 36 (Android 16) |
| Size | 47,244 classes / 4,957 resources — far above the 8,192-class honest-scan budget |

## What the analysis found

- **Subscription surface is server-side.** 17 subscription classes
  (`SubscriptionPause`, `SubscriptionPlan`, `CancelSubscriptionRequestBody`,
  `feedbacksurvey` cancel flow, `AdvancedLabsSubscriptionCardModel`); **no Play
  Billing client at all** — the XAPK is from APKPure, not a Play-licensed build.
- **Research/Labs module survives naming.** `com.whoop.whooplabs.*` keeps real
  names: `WhoopLabsApi`, campaign DTOs, Room entities, `BtHrSubmissionWorker`.
- **Endpoints recovered from obfuscated annotations.** `WhoopLabsApi.stopStudy`
  carries `@Lwg3/b; value="/research-service/v1/campaigns/{campaign_id}/event"`.
  Kotlin `Metadata` annotations decode, exposing original member names
  (`firmwareVersion`, `whoopStrapId`, `CampaignStepResponse`, …).
- **Other identified surfaces.** `io.getstream…TokenAuthInterceptor` (chat auth),
  `StrainCoachGoalPicker` / `StrainCoachStrainGraph` (realtime strain coach),
  widget providers for strain/sleep/steps/stress/battery.
- **Decompiled body working.** `DeadBatteryWorker.j()` decompiled completely
  (coroutine state machine, `@Override` intact): reads `batteryLevel` from
  WorkManager input data, logs "Battery silence timeout reached", renders
  a dead-battery notification, then awaits the reporting queue.

## Honest failures / behavior notes (not bugs in our pipeline)

1. `inspect-android-method abandonCampaign` → **upstream jadx 0.7.1
   ClassCastException** in `get_annotation_values`: `jadx.core.dex.info.FieldInfo
   cannot be cast to jadx.api.plugins.input.data.IFieldRef`. Method-specific;
   other members of the same class work. Surfaces as clean
   `execution_failure` with partial observation retained, not silent degradation.
2. Retrofit suspend fns and kotlinx serializers report
   `body_status: not_available` (abstract) instead of fake source.
3. Whole-APK scans on 47k classes exceed the 8,192-class code-cache budget, so
   degradation can set in after scans in later commands. Per-command targeted
   use (search → inspect directly) is the right pattern at this size.
4. Each REA CLI command relaunches the engine (~20 s APK load); state is
   retained only within a command.

## Working command patterns

```sh
APE=/var/folders/…/rea-extracted-…/com.whoop.android.apk   # extracted base

node scripts/rea.mjs inspect-android-package "$APK"
node scripts/rea.mjs search-android-classes "$APK" Subscription --filter-output normalized_result.matches --format json
node scripts/rea.mjs inspect-android-class "$APK" com.whoop.whooplabs.data.network.WhoopLabsApi --format json
node scripts/rea.mjs inspect-android-method "$APK" <class> <method> --overload-index 0 --format json
node scripts/rea.mjs trace-android-references "$APK" com.whoop.whooplabs.data.network.WhoopLabsApi --format json
```

Quickly extracting the base APK first (the XAPK layout here isn't what jadx expects):

```sh
node scripts/rea.mjs inspect-artifact WHOOP_5.473.0_APKPure.xapk --format json
node scripts/rea.mjs extract-artifact WHOOP_5.473.0_APKPure.xapk /tmp/whoop-xapk-extracted --format json
```

## Session 2 — strings sweep and resource decode

### `search-android-strings`

At this APK size the string-scan lane is impractical beyond the default
budget: `--class-limit 8192` and `1024` both hit the 120 s operation timeout
(`provider_timeout`). The default 256-class scan succeeds in ~90 s but covers
only the obfuscated `defpackage` prefix: scanned 256 / 83,390 string-bearing
identities, coverage honestly `partial`, zero `https://` / `api.whoop` hits in
that prefix. Raw outputs: `/tmp/whoop-str1.json` (default budget,
`https://`), `/tmp/whoop-str2.json` (`api.whoop`).

### `decode-android-resources` (apktool 3.0.3)

Succeeded: decoded manifest XML + 2,000 default-locale string resources
(5,041 total decoded files), 9 locales (ar, de, en, es, fr, it, pt, pt-rPT,
ru), coverage `partial` (string-limit). Notable recovered strings:

- `free_trial_cancellation_end_trial_button` = "END FREE TRIAL", with
  `Your trial ends on: %1$s.` — a trial-cancellation flow exists in-app.
- `calendar_appointment_title` = "WHOOP Advanced Labs Appointment" and
  `drawer_whoop_labs` = "Digital WHOOP Labs" — confirms the Labs research
  program marketing surface found in code.
- `labrador_result_possible_shepherd_info` — Atrial Fibrillation (AFib)
  screening copy ("Shepherd" is the internal AFib feature codename;
  "Labrador" the screening flow).
- `error_generating_trial_codes` — internal/admin trial-code generation path.

Raw output: `/tmp/whoop-res.json`.

### Raw output files from the first session (subject to OS cleanup)

All under `/tmp/`, one run each unless noted:

| File | Operation |
|---|---|
| `/tmp/whoop-inspect.json` | `inspect-artifact` on the XAPK container |
| `/tmp/whoop-extract.json` | `extract-artifact` (base + config APKs + manifest.json + icon.png) |
| `/tmp/whoop-package.json` | `inspect-android-package` on the extracted base APK |
| `/tmp/whoop-s1.json`, `whoop-s2.json`, `whoop-s3.json` | class searches: TokenAuth / StrainCoach / BiometricUnlock |
| `/tmp/whoop-q-*.json` | Subscription / WhoopLabsApi / StrapRequest / BillingClient searches |
| `/tmp/whoop-labs-class.json` | `inspect-android-class` WhoopLabsApi (annotations, static_inits, value_coverage complete) |
| `/tmp/whoop-method.json` | failed `inspect-android-method abandonCampaign` (engine ClassCastException) |
| `/tmp/whoop-m2.json` | `stopStudy` (abstract; endpoint annotation) |
| `/tmp/whoop-m3.json` | failed `<init>` on SubscriptionInfoKt |
| `/tmp/whoop-m4.json`, `whoop-m5.json` | ambiguous-overload invalid_request examples |
| `/tmp/whoop-m6.json`, `whoop-m7.json` | DeadBatteryWorker getter and doWork body |
| `/tmp/whoop-refs.json` | `trace-android-references` WhoopLabsApi (6 refs, complete) |
| `/tmp/whoop-str1.json`, `whoop-str2.json` | strings sweep (session 2) |
| `/tmp/whoop-res.json` | apktool resource decode (session 2) |

Health note: after each REA command exit, no jadx/bridge processes were left
running (checked via `pgrep`); the engine only lives for the duration of a
command.

## Full source export (session 3, revised after verification)

A complete jadx source export of the base APK now lives in this folder:

**`whoop-src/`** — 47,235 decompiled `.java` files, 722 MB:
- `whoop-src/sources/` — all code, no missing packages this time
- `whoop-src/resources/` — provenance files exported by jadx (AndroidManifest.xml,
  META-INF, assets listings, THIRD-PARTY.txt)
- `whoop-Resources-Base/` (136 MB) + `whoop-Resources-Xhdpi/` (2.1 MB) — apktool
  3.0.3 (`apktool d -s -f -o ...`) decodes of the base APK and the
  `config.xhdpi.apk` density split: readable `AndroidManifest.xml`, `res/`,
  `assets/`. The xhdpi split only adds density-specific drawables; all strings,
  manifests and layouts come from the base.
- `whoop-apk/` — copies of `com.whoop.android.apk`, `config.xhdpi.apk` and
  `config.armeabi_v7a.apk` extracted from the XAPK. The armeabi_v7a split holds
  the native libraries (`libjingle_peerconnection_so.so` WebRTC voice,
  `libmapbox-maps.so`, `libseon.so`/`libseon2.so`, `libquickjs-android-wrapper.so`,
  `libsentry.so`, ...) so they stay available even after `/tmp` cleanup; all
  bytecode is in the base.

The REA-bundled engine jar is headless-only (no `jadx.cli` classes), so the
official **jadx 1.5.6 CLI** was used (zip SHA-256
`545ea2be9c242511bc145755cf4bda2485ade42966e096f8b4d3da2a230e8974`) with the
Homebrew OpenJDK 21. Gotchas encountered, all worth remembering:

1. `/usr/bin/java` is Java 8 and shadows everything; invoke the JDK's binary
   directly, not `jadx` from PATH (its `bin/jadx` script also inherits the
   wrong JVM).
2. Backgrounding with `&` inside a tool-driven shell got the process reaped
   when the shell finished — the crashes that looked like memory kills at 7-12%
   were that, not jadx failing. Run it foreground (sync) or as a managed
   background job.
3. `java -jar jadx-1.5.6-all.jar` runs the **GUI** (that is the manifest main
   class); launch `jadx.cli.JadxCLI` explicitly via `-cp` instead. On macOS
   also add `-Djava.awt.headless=true`, or the JVM starts the AWT event loop
   and the CLI sits silently at ~0% CPU forever.
4. jadx keeps a disk code cache under
   `~/Library/Caches/io.github.skylot.jadx/projects/...`; a rerun of the same
   APK with matching settings moves fast (cache replay) — verify liveness via
   the log and code cache rather than vibes before calling a run stuck.

First-pass command (worked, but see the 658-error note):

```sh
/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home/bin/java \
  -Xmx8g -XX:TieredStopAtLevel=1 -cp /tmp/jadx-1.5.6/lib/* jadx.cli.JadxCLI \
  --deobf --fs-case-sensitive --no-res --no-debug-info --threads-count 3 \
  --show-bad-code -d whoop-src com.whoop.android.apk
```

First pass shipped 45,167 files and left 658 classes unwritten; my initial
note blamed "case-collision pairs on APFS" — that diagnosis was **wrong**.
The real failure mode, visible in the jadx log:

```
ERROR - Error saving class: ...
jadx.core.utils.exceptions.JadxRuntimeException: Can't create directory
```

Deterministic `Can't create directory` save failures in the multithreaded
save phase: a few parent dirs (e.g. under `com/whoop/settings`) never got
created, taking whole subtrees like `androidx/navigation/` and `vz1/` with
them. Recovery session 4: rerun from a fresh output dir with `-j 1`, with the
disk code cache replaying the fast part:

```sh
/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home/bin/java \
  -Djava.awt.headless=true -Xmx6g \
  -cp /tmp/jadx-1.5.6/lib/jadx-1.5.6-all.jar jadx.cli.JadxCLI \
  -j 1 --deobf -d whoop-src-j1 com.whoop.android.apk
```

(Note this rerun dropped `--fs-case-sensitive --no-res --no-debug-info
--threads-count 3 --show-bad-code`: default resource decoding produced the
real `resources/` dir, and `-j 1` replaced `--threads-count 3`.)

Result details:
- Final tree: **47,235 `.java` files** (out of 47,244 loaded classes; the 9-file
  delta is inner classes merged into the same compile unit), zero empty
  directories, zero zero-byte files, no `.txt` error stubs. The 16 `.txt`
  files are META-INF license texts; no source was dropped.
- `--deobf` renamed obfuscated classes to stable `l11/InterfaceC23222d`
-style names; everything under `sources/com/whoop/**` keeps real names. The
  rerun uses the same deobf settings, so the names match what the first pass
  recorded. Grep-able stack: `whooplabs`, `widget`, `whooplive`,
  `whoopstatus`, `whoopaction`, `workmanager`.
- R8 inside classes: fields/methods still renamed (e.g. `j()` for doWork),
  only class paths are deobfuscated.
- "finished with errors, count: 658" persists in the single-threaded run too:
  these are decompile-quality errors marked **inline in the produced sources**
  (274 files carry a `JADX ERROR` marker comment; `grep -rl 'JADX ERROR'
  whoop-src/sources`), not missing files. No class was lost.
- Exit code: 0 would be clean; here 2 = finished with errors, which is the
  expected mode for an APK this size and shape.

## On-device verification map (session 5, reconnaissance before any patching)

Goal of this pass: identify what the app verifies locally vs what is enforced
server-side, to size the "use without lock-in" patch. Findings:

**API / transport**
- Bases are hardcoded in `sr2.q` (class C32935q, "essentials_release"):
  API `https://api.prod.whoop.com`, web `https://app.whoop.com/`,
  checkout/upgrade `https://join.whoop.com/`.
- **No TLS certificate pinning.** Zero `CertificatePinner` occurrences;
  `res/xml/certificates.xml` (networkSecurityConfig) only has
  `debug-overrides` trusting user CAs. A local mock/redirect backend is
  technically unobstructed at the TLS layer.
- Play Integrity: only an error-message mapping helper exists (`tr/AbstractC34092a`);
  no app-boot integrity gate observed.

**User auth (server-verified, client-trusting)**
- Bearer-token OAuth. `SessionAwareAuthenticator` (j92.r, class C21450r), an
  OkHttp `Authenticator`, reacts to 401s by choosing one of two token
  refreshers (OAuth vs onboarding token recovery) driven by
  `pendingUserSessionRepository.getPendingAuthMaterial()` and the
  `ONBOARDING_TOKEN_RECOVERY` feature flag.
- The app performs no local crypto verification of the session: "who the user
  is" equals the cached `User` object in `userInfoAccessor` (z92) plus stored
  tokens. Gating of login-vs-home UI is driven by `OnboardingStatusChecker`
  and session state, not by cryptographic checks. Redirecting the API host
  would satisfy whatever the app validates.

**Strap auth (the real hardware lock-in)**
- `com.whoop.strapauth.client.StrapUnlockApi`:
  `firmware-service/v4/strap/unlock-token` with `X-WHOOP-Strap-Id` header.
- The band-to-app connection state machine
  (`com/whoop/service/rearchitect/C10015c`) has explicit
  "Strap unlocked; transitioning to Ready" vs "Strap unlock failed ...;
  remaining Locked" transitions, followed by a `cert_transfer` phase
  (metrics in `connectivity.strap.app.strap_unlock.*`). Unlock tokens have a
  validity window (`mobile-strap-unlock-refresh-threshold-days`).
- Implication: the strap participates in a per-device certificate/unlock
  exchange whose material is fetched from WHOOP's firmware-service while
  authenticated as a user. This is the layer that binds band to account.

**Local storage (what exists on-device)**
- Room DBs for strap packets: `table_metrics_data`, `sensor_data_packets`,
  `console_packets`, `table_research_packets`, `memfault_packets`, battery/
  firmware event tables. `labrador` readings (ECG) are stored locally with an
  `uploaded` flag — i.e. the capture pipeline is local-first.
- Feature flags: `com.whoop.data.repositories.FeatureFlagChecker`, per-domain
  enums (onboarding/home/connectivity/etc).

**Bottom line for full offline use**
- Server-computed values (recovery/strain/sleep scores) exist only as rendered
  responses from api.prod.whoop.com; the app has no local equivalents.
- Strap unlock is server-mediated; without provisioned cert material the
  band stays `Locked` at the connection step after pairing.
- So "all functionality, no account" = reimplementing both the user API and
  the firmware-service unlock/cert exchange. Patching only the login gate is
  the tractable project; the mock-backend is the large one; investigating
  whether the cert material can be captured once (logged-in phone, real
  backend) and replayed locally is a third, cheaper path.

### Strap unlock + cert-transfer trace (session 5b, end-to-end)

The whole flow, class by class, from BLE handshake to unlocked band:

1. **Strap reports its signature locally.** `WhoopStrapInfo.getStrapSignature()`
   (plus serial) comes from the band itself over the BLE hello/handshake
   (`zj0.t$b hello`). Trigger paths at `vh2.C36050e`
   (`StrapUnlockServiceImpl.kt`):
   - `mo114449b()`: strap is Locked and connected → retry unlock (single-flight
     via `attemptLock`),
   - the refresh path: `hello.getLockInfo()` is `UNLOCKED` but the band's own
     `counterSeconds` is at or below the configured refresh threshold
     (`m114465r()` reads `mobile-strap-unlock-refresh-threshold-days`
     from `configurationRepository`) → schedule refresh (single-flight via
     `refreshLock`).
2. **Phone → backend fetch** (`th2.C33816b`, `StrapUnlockClientImpl.kt`,
   `InterfaceC33815a.mo106973a(serial, signature)`):
   - request encodes `strapSignature` as `hex-decode → UTF-8 string`
     (`AbstractC39401e.m125836a` is base16-decode, then `m125916A` bytes→string),
     body `StrapUnlockRequest{strapSignature}`, header `X-WHOOP-Strap-Id` = serial,
     endpoint `firmware-service/v4/strap/unlock-token` (`StrapUnlockApi`),
   - retries 1s/2s/4s backoff (`f141621d`), wrapped error mapping into
     `InterfaceC33817c` results (`.d` = token, `.a/b/c` = backend-fail /
     forbidden / no-network),
   - response `StrapUnlockResponse{token}` — the token **is** the cert blob.
3. **Phone → strap GATT transfer** (`sh2.C32511b` = `CertificateTransferApiImpl`
   → `sh2.C32514e`, the GATT task):
   - token is base64/wire-decoded into `byte[] certificate` and handed to the
     strap's task executor (`InterfaceC21750d.mo24749u(new C32514e(certificate, ...))`),
   - `C32514e` (`InterfaceC36084j` GATT task) writes the cert bytes over the
     strap-auth GATT characteristic, packet-by-packet, 5 s per-packet timeout
     (`m101526i` waits response / ack per `AbstractC38334b` packet; per-step
     failures map through `C32514e$b` and `sh2.C32512c` failure reasons),
   - the strap validates the certificate **locally on-device**;
     `AbstractC32512c.d` = success → the caller records
     `strapLockStateRecorder.mo114433a()` and the state machine moves to Ready;
     anything else stays Locked (`InterfaceC36053h.b` STRAP_REJECT / FORBIDDEN /
     BACKEND_FAIL / NO_NETWORK / mapped `AbstractC32512c.a` reason; metrics per
     `C36048c.m114445h`).

**What this means for capture-once / offline replay:**
- The only per-account input at the exchange is the **user bearer token**
  (implicitly, via OkHttp auth) and the strap's own identity (`serial` + its
  locally-produced `strapSignature`). The signature is generated by the band,
  not the phone, so the band can produce it under a plain BLE client with no
  WHOOP app involved.
- The returned `token` is opaque cert material consumed verbatim by the phone;
  the phone does no parsing or re-signing. The @Metadata fn names
  (`getUnlockToken` → per-packet GATT writes) mean the provenance of the bundle
  is checked only by the strap firmware (expiry/issuer/serial binding inside the
  cert chain).
- Practical replay shape: capture request+response once against the real
  backend from an account-authenticated session (signature is hex-encoded;
  stability across handshakes has not been observed), archive `{serial, signature, unlock-token-response}` per band,
  then either (a) replay the cert transfer with a small BLE client / patched
  app serving the cached response, or (b) keep the app, mock
  `firmware-service/v4/strap/unlock-token`. No TLS pinning stands in the way
  (see session 5). This is a replay hypothesis, not observed hardware behavior.
  The refresh threshold is not the certificate TTL. Firmware expiry, serial/
  signature/nonce binding, and the signature's stability across handshakes are
  still unknown. Changing the refresh threshold does not demonstrate longer
  token validity.
- Open: the cert payload's internal expiry semantics and whether the backend
  issues short-lived vs strap-lifetime certs was not determined from the
  client-side code (opaque token); that would need one live capture of `/unlock-token`
  to settle (token decode + strap firmware behavior).

### Capture plan + decoder (session 5c)

Tooling now exists in `Whoop/capture/` (see its README for the full plan):

- `unlock_token_capture.py` — mitmproxy 12 addon. Matches any host for the
  path `firmware-service/v4/strap/unlock-token`, archives the full
  exchange (headers + bodies + decoded analyses) under
  `artifacts/exchanges/`, drops the token verbatim plus its bytes
  (`artifacts/tokens/*.b64|*.bin`), and snapshots any config response
  carrying `mobile-strap-unlock-refresh-threshold-days` (the TTL question).
- `decoders.py` — zero-dependency probe kit for the issued material:
  PEM, JWS+x5c (WHOOP already uses that pattern in the Cognito verifier
  `q30.e0`), hex, multi-layer base64 → DER tree with X.509/CMS shape
  detection and nested-cert PEM extraction, gzip/zlib unwrap, shallow
  protobuf scan. CLI accepts an artifact JSON or a raw token.
- Verification status: `decoders.py --selftest` green; addon exercised
  end-to-end through mitmdump 12.3.0 against a local fake endpoint —
  exchange JSON, token `.b64`/`.bin` and config snapshot all produced,
  and the standalone CLI re-decoded the artifact (X.509-shaped DER,
  ecdsa OID, PEM extract).
- Missing before a real capture: a device with the mitmproxy CA
  trusted at *system* level for the release app (no pinning, but the
  release `certificates.xml` only trusts system anchors; options in the
  README: Magisk module, repacked APK with a user-trusting
  networkSecurityConfig, or Frida trust-anchor hook).
- Note for the trigger sequence: the deterministic single exchange is
  clear-app-storage → login → pair/connect the band (Locked path fires on
  connect). `artifacts/` contains live bearer tokens — keep local only.

Working set now in the Whoop folder:

```
WHOOP_5.473.0_APKPure.xapk   original container
notes-rea-analysis.md        this file
whoop-src/                   full decompiled Java tree (this session)
whoop-Resources-Base/        apktool decode, base APK resources
whoop-Resources-Xhdpi/       apktool decode, xhdpi density-split resources
whoop-apk/                   extracted base + xhdpi APKs
```


## Session 6 — device readiness and first local replay slice (2026-10-25)

No authorized Android device was connected; no app was installed, no storage
was cleared, and no WHOOP request or live token capture occurred.

### Verified install artifacts

Fresh `apksigner verify` confirms the patched base uses v3 and signer SHA-256
`f688a8060ab8f163751be41b43f4f0b190f17b6d2be286dab5b0c6143b489113`.
REA+ decoded the actual signed APK's release-level `base-config`: it trusts
system **and user** CAs. Evidence is
`rea-test-2026-10-24/19-patched-resources.json`,
`ev_9b632af6e82c57014cb00cd5bef5cc2c476fbc26f29597072948d31b485baa15`.
The base has no native libraries and declares required ABI/density split types.
A complete matching set was prepared by aligning and re-signing the original
armeabi-v7a and xhdpi splits with the same local key; signatures/alignment and
unchanged input hashes were checked. See `patch/DEVICE-TEST.md`,
`patch/install-set/manifest.json`, and the read-only `patch/check_device.py`.
ARM64-only phones cannot use this particular ARM32 split set.

### Refresh semantics correction

The static fallback for `mobile-strap-unlock-refresh-threshold-days` is **38**:
`whoop-src/sources/vh2/C36050e.java:120` supplies the default to
`js0/AbstractC21907a.java:17`. The raw smali confirms `0x26` in
`patch/apk-src/smali_classes10/vh2/e$a$a.smali:66`.
`m114465r()` converts that integer into days (`C36050e.java:1161`).
The UNLOCKED refresh guard is `counterSeconds <= threshold`, not greater-than:
`C36050e.java:1207`, verified against `patch/apk-src/smali_classes4/vh2/e.smali:1986`
(`if-lez` proceeds to the refresh lock; greater-than returns).
The default and guard do not determine the token's TTL or prove what the
counter represents in firmware. The older trace above has been corrected.

`capture/inspect_capture.py` now extracts X.509 validity/JWS temporal claims
without printing token/header values. It reports signatures, firmware
acceptance and replayability as unverified/unknown. Generated real X.509
certificates and synthetic JWS tokens exercise the date parsing. The generic
capture decoder's base64url handling was corrected to preserve `-` and `_`.
Capture artifacts now share one ID, have private permissions, and proxy logs
contain lengths/hashes rather than token values. Configuration capture accepts
the API's list-shaped `{key,value}` response as well as object responses.

### Local startup replay foundation

`mock_backend/contracts.json` contains 8 core and 3 conditional GET capture
candidates, with source citations. The former 542-path list omits relative
Retrofit annotations; `MembershipV2Api`'s relative `straps` actually resolves
against `/membership-service/v1/` (`e50/C12722a.java:50,117`).
Bootstrap requires `account`, `user` and `account.user_id`; empty JSON is not a
working fixture (`pd1/C29104a.java:374–385`). Wire names use SnakeCase. Navigation
uses `screen`, `parameters` and optional `tab.id`, not `screen_name`.

`capture/startup_capture.py` records only the shortlist's JSON read responses
without Authorization/Cookie headers. `mock_backend/replay.py` serves selected
fixtures on loopback, matching full queries and hashed strap-header variants;
unknown reads and writes return 501. It has no upstream client and does not
implement auth, strap unlock or scoring. Current fixtures/tests are synthetic.
Actual startup completeness, TLS/app integration, official API data adaptation
and local scoring remain open. See `mock_backend/README.md` and `WHOOP_TASKS.md`.

## Session 7 — offline contracts and packet-store groundwork (2026-10-26)

The user selected offline tasks. No phone operations, real WHOOP requests,
account login, token capture or real database acquisition occurred in this pass.
The findings below read the existing WHOOP 5.473.0 decompiled sources; synthetic
test data does not establish app behavior against a live backend or band.

### Startup response checks

`mock_backend/response_contracts.py` and `check_fixtures.py` cover the 8 core
and 3 conditional routes already shortlisted. Checks preserve responses and
allow unknown members; diagnostics contain known field paths and request
hashes, not personal values or arbitrary map keys. Successful JSON bodies get
strict uncoerced DTO-shape checks, while error/no-body responses are retained
and skipped. Missing captures and core routes without a shape pass are listed.

DTO compatibility is separate from downstream conversion: bootstrap sections
are nullable in the DTO, but login requires account, user and account.user_id
(`pd1/C29104a.java:374–385`). Profile conversion also requires usable dates,
timezones and exact enum strings (`:399–413`). Navigation uses screen-specific
dispatch, and omitted parameters differ between Kotlin and Gson. The checker
reports these as conversion warnings rather than claiming successful startup.
See `mock_backend/RESPONSE-CONTRACTS.md` for exact DTO/adapter citations.

Review caught profile Float overflow (`1e100` and huge integers), which is now
rejected consistently with the source decoder's finite-Float requirement
(`bd3/C3121f0.java:398–407`). The fixture loader now rejects duplicate JSON
members/nonfinite numbers; replay correctly emits no body for 204, 205 or 304.

### Packet database trace and exporter

The four named packet tables belong to **persistent_packet_db**
(`sr2/C32928j.java:266`), Room version **17**, current identity hash
`6e6c7540db7fb622e48555d647c1c077`
(`com/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl.java:556`).
Creation SQL at `:93–98` establishes columns, primary keys and defaults.
The companion `table_heart_data_versions` contains hardware/firmware metadata;
version IDs must be retained alongside packet/frame revisions.

The four DAO adapters store `ByteBuffer.array()` directly and reconstruct with
`ByteBuffer.wrap()` (`mu0/C25953e.java:44`, `hu0/C17642c.java:38`,
`qu0/C30624c.java:39`, `yt0/C39767f.java:47`). These are backing-array bytes,
not decoded sensor values. Console metadata is JSON text (`zt0/C41125c.java:15`).
Timestamp units are milliseconds from `fk2/C14554a.java:208–209` and traced
insertion paths; the exporter preserves raw integers and does not infer clock
accuracy from those units.

`offline_data/packet_export.py` accepts an explicit stable local database copy,
checks v17/current Room identity and the selected schemas, then writes exact
SHA-256 named BLOB files, deterministic NDJSON and a final provenance manifest.
Database integers become decimal strings to preserve 64-bit precision. It
stages the main file and captured WAL, opens SQLite only on its private copy,
checks source/sidecar hashes and metadata for change, and rejects nonempty
rollback journals. Existing output directories are never reused. Other packet
tables are listed as unexported; this is not a complete raw-data export.

Metrics ingestion distinguishes legacy frame 1 revisions 9/12/18/24 from
Rev2 frame 2 packet type 1 (`bi2/AbstractC3289e.java:15`,
`lt0/InterfaceC24730g.java:54`, `hk0/EnumC17381p.java:14`). Research dispatch
recognizes 7/10/11/20/21 (`nt0/AbstractC27120h.java:40`); one sensor uploader
selects 25/26 (`j52/C21342c.java:255`). These are observed static selections,
not exhaustive database constraints. Unknown revisions remain exportable
with warnings. No payload layout, sampling rate, calibration or recovery/
strain/sleep-score decoder has been established by this storage trace.

Live capture, on-device checks, startup completeness, OAuth data adaptation,
sensor decoding and scoring remain open in `WHOOP_TASKS.md`.

### Verification

All **40 focused Python tests passed**: 15 mock-backend (including the new DTO
checks and actual local HTTP replay), 6 capture (including real mitmdump against
an owned loopback synthetic server), and 19 packet-export tests using real
SQLite databases. The latter cover committed uncheckpointed WAL data,
unchanged source DB/WAL/SHM, exact byte/integer/text preservation, deterministic
rows, unsupported schemas, NULL/dynamic types, configurable resource limits,
existing-output preservation and failure cleanup. An additional real exporter
CLI smoke check preserved a synthetic packet and left its source unchanged.
Decoder self-test, AST checks for 14 Python files and `git diff --check` passed.
These results establish the local tooling boundary only, not real app startup,
band acceptance, acquired database consistency or score quality.
