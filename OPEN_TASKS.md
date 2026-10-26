# Open tasks

Open work on `main` following PR #1 and the field tests.

## Status

- **Items 1, 3, 10, 11:** Done. Merged in PR #1 or committed on `main`.
  Item 12 is **not** done: no consensus.app HAR has been analyzed
  (`inspect-web-network-capture` still open, see item 12 below).
- **Item 3 (radare2 DEX documentation):** Done (committed in `a27f184`); the
  real DEX fixture test landed in `fa9463e` (see item 3). Note: the fixture
  test `skipIf`-guards on a radare2 executable, so a host without radare2
  reports a skip, not a pass — "green" records assume radare2 6.2.4 present
  as in the Environment note.
- **Native DMG verification on localized macOS hosts:** Fixed and verified. Added locale-independent status line matching and target fallback inspection in `NativeDmgArtifactReader.ts`. All 30 tests in `nativeDmgArtifactReader.test.ts` pass.
- **jscpd duplicate lines:** Reduced from 2.88% down to 2.50% duplicated lines. Beyond the shared `InlineReportService` sweep, the concentrated hotspots were extracted: `cli/coreBinaryCommands.ts` now uses shared option constants and one parameterized procedure-selector registration; `processTrace.fixture.ts` carries the trace capture/specification shared by the domain unit test and the MCP parity test; and the `webCaptureDiff` / `interfaceBuilderBundle` test suites use extracted capture helpers. 0.1 pts of headroom under the 2.6% threshold; consider lowering the threshold (the `.jscpd.json` comment calls for it) as remaining duplication is removed.
- **Flaky boundary tests:** Done. Both `processCaptureProgress.test.ts` and `clientProfileLifecycle.test.ts` now use load-tolerant budgets (test orchestration only; the <\\_s cancellation-latency commitments themselves are untouched), and both pass under the v24.11.0 Node in isolation. The capability-skip path in `processCaptureProgress.test.ts` is mutation-backed: flipping `available: true` → `false` in `ProcessCaptureCapability.ts` flips the suite's assertions to the named-skip path as intended. A whole-suite re-run to confirm the budgets hold under full parallel load is still pending (host was busy during this pass). Runtime note: this host's default `node` is v22.17.0, which the CLI's own version gate refuses; tests that shell out to the CLI proxy fail with exit 1 unless vitest runs under the v24.11.0 Node in `/private/tmp/node-v24.11.0-darwin-arm64/bin`.
- **Environment:** Node v24.11.0 is available locally in `/private/tmp/node-v24.11.0-darwin-arm64/bin`. Reverse engineering tools installed and verified: `ghidra` 12.1.4 (with OpenJDK 27), `radare2` 6.2.4, `binwalk` 3.1.0, `jadx` 1.5.6, and `apktool` 3.0.3.
- **Ghidra DEX support:** Done on `main`. Forced `DexLoader` import with the Dalvik language selected from the DEX header version; DEX string-pool definition runs as a packaged post-analysis script (`ReaGhidraPrepareDex.java`) so Dalvik method discovery keeps working; DEX byte-read and file-offset behavior is documented honestly in `docs/ghidra-dex.md`; `npm run verify:ghidra:dex` verifies the committed `tests/fixtures/dex/` fixture end to end (green on macOS arm64/ghidra 12.1.4).
- **Flaky `ghidraLauncher.test.ts` and `processFinalization.test.ts`:** Addressed. The launcher test now matches the DEX-aware conflict message (plus a new DEX-negative case); the finalization acceptance tests give compiled-workflow startup a 15s load-tolerant budget (30s test timeout) while keeping the cancellation-latency (<8s) commitments themselves untouched. Both green in isolation; whole-suite re-run pending (host load >100 at the time).

## Branch, gate and git

1. **Gate verification (`npm run check:pr`):**
   - Green end to end as of Oct 22, 2026 (exit 0): typecheck, lint, format
     (`oxfmt`), knip, metadata, `docs:check`, jscpd (exactly at the 2.6%
     threshold; further refactors wanted for headroom), `scan:todos`, and the
     full test suite (897 files passed, 0 failed).
2. **Branch state and push:**
   - `main` is **0 ahead / 0 behind** `origin/main`; nothing to push.
   - The working tree does hold **uncommitted** follow-ups (Android XAPK
     manifest validation, method-annotation snapshotting in the JADX bridge,
     expanded tests, docs; see item 8) plus the Rize field-test artifacts.
     Commit them after the gate, then re-check ahead/behind.

## DEX support

3. **radare2 side:**
   - [x] Documentation: `docs/radare2-provider.md`, `docs/android-analysis.md` and skill reference updated.
   - [x] Real-radare2 fixture test on a small DEX built from Java source with `javac` and `d8` (`tests/boundary/providers/radare2/radare2Provider.dex.test.ts`; 3/3 green against radare2 6.2.4). Caveat: the suite `skipIf`-guards on a radare2 executable, so "green" means with radare2 installed; a missing radare2 reports skip.
4. **Ghidra side** (done, incl. the real DEX fixture test in `fa9463e` and `verify:ghidra:dex` in the DEX commits):
   - [x] Force Ghidra's DEX loader and choose the Dalvik language from the DEX version;
   - [x] Make `list_strings`/`search_strings` cover the DEX string pool (post-analysis pool definition, `align` markers excluded);
   - [x] Document that Ghidra's DEX memory is loader-owned: `.dex` bytes read back, but file-offset mapping is explicitly rejected;
   - [x] Add a real-Ghidra test (`npm run verify:ghidra:dex`) and docs (`docs/ghidra-dex.md`).
5. **DEX inside an APK** (implemented on `main`):
   - [x] `container#member` fragment targeting (`/path/App.apk#classes2.dex`) at the generic binary/session layer (`parseBinaryTarget` → `ContainerDexTarget.ts`): ZIP container verification, top-level `.dex` member lookup, digest-reused staging beside the container (or MCP `staging_dir` / CLI `--staging-dir`), Dalvik classification, `container_selection` provenance on the resolved target.
   - [x] Boundary tests in `tests/boundary/filesystem/binaryTarget.test.ts`; documented in `docs/android-analysis.md`, `docs/cli.md` and `docs/ghidra-dex.md`. The Android-specific `inspect_android_*` operations keep whole-APK semantics.

## REA+ gaps found in the WHOOP test

6. **`decode-android-resources`:** (done in `f5f036a`)
   - Page past the first 2,000 strings (`strings_offset`, `strings_limit`), and expose `res/xml` files such as the network security config (`include_xml_resources`).
7. **`inspect-android-class` / `inspect-android-method`:** (done in `eb83e19`)
   - Show annotation values (e.g., Retrofit API paths) and static field initial values via JADX bridge without runtime class loading.
8. **Android package formats and validation:** (done in `7795b12`)
   - XAPK: done. `.xapk` containers are admitted by all five Android
     operations (`APK_CONTAINER_FORMATS`); `AndroidXapkBundle.ts` validates the
     top-level `manifest.json` + `base.apk` shape, composes a stored-entry
     4 GiB-capped `bundle.apk` (base entries verbatim, split `*.dex` entries
     merged under `splits/<member>/<name>` colliding aliases), retires staged
     members, and records the merge scope in Evidence limitations. Round-trip
     tests: `tests/boundary/process/androidXapkBundle.test.ts`. A `.aab` and
     loose split-APK sets (directories, `.apks`) remain unsupported forms.
   - Split-APK bundles: documented-only for now. ADB `pull_adb_package` already
     pulls the complete split set digested per file; a directory/`.apks`
     admission flow would be the natural follow-up once a caller owns one.
   - APK signature verification: not implemented, deliberately. v1/v2/v3
     schemes mean real crypto (message digests, RSA/ECDSA, byte-range offsets
     over signed regions up through the APK Signing Block) whose honest home is
     a dedicated adapter with its own Evidence authority, not jadx's; today
     `inspect_android_package` reports signing as `not_performed` and the
     signature blocks stay visible to inventory/extraction. Recommend building
     it only when a caller task actually needs tamper/lift detection.
     (Re-registered as item 27 in the gap registry.)
   - **Uncommitted follow-ups present in the working tree (2026-10-26), to be
     committed after the gate:** strict/checked XAPK manifest handling
     (new `AndroidXapkManifest.ts`: 1 MiB-bounded manifest JSON, zod schema,
     base-name resolution from the *declared* entry — never renaming a base to
     `base.apk`), round-trip test expansion in
     `tests/boundary/process/androidXapkBundle.test.ts`, method-annotation
     snapshotting in `ReaJadxBridge.java` (attributes are captured pre-codegen,
     since code generation clears attributes and replaces annotation literals
     with derived field references — this also tightens item 7's behavior),
     plus matching `docs/android-analysis.md` and fixture updates.
9. **Android string constants and bytecode searching:** (done in `1c1333e`)
   - `search-android-strings` / `search_android_strings`: scans string constants across decompiled method bodies (Java/smali), supporting `class_limit` (up to 8,192 classes), reporting `matches`, `scanned_classes`, `scanned_methods`, `skipped_methods`, and `coverage`.
   - Scan-inspect ordering defect resolved: method bodies and `static_inits` stay byte-identical before and after whole-APK scans.
   - Known boundaries documented:
     1. Large-APK memory behavior (>8,192 classes or memory pressure near 4 GiB heap) remains unmeasured in production.
     2. APKs exceeding 8,192 classes hit third-party JAR LRU cache eviction if rescanned.
     3. Per-class method-cap skips are reflected in partial coverage, while `skipped_methods` counts engine decompile failures.
     4. Verified on macOS arm64; Windows lifecycle verifier remains unexercised locally.
     5. Engine scan-skip counts show small non-deterministic variance (12-23 across runs) on malformed/unparseable method bodies.
10. **`inspect-jvm-artifact` duplicate entry handling:**
    - Done: Archive inventory now keeps the first record of a repeated name.

## Flaky tests and gate robustness

11. **Test timeouts under concurrent load:**
    - Done on `main`: both suites' budgets and the capability-skip path are stabilized and mutation-checked as described in the status note above. Remaining follow-up: one whole-suite `npm run check:pr` re-run under the v24.11.0 Node to confirm the budgets hold under full parallel load.

## Consensus

12. Analyze a HAR exported from your own consensus.app session with `inspect-web-network-capture` once it is available.
13. Optional: add a telemetry section to the rebuild plan, and check the tool list of the anonymous MCP tier.

## WHOOP

14. **Open field-test questions:**
    - Running the app or its traffic; reading the strap protocol itself; strap unlock and membership checks.
    - Mapping UUID families to device generations, and identifying codenames (Kenmore, Copley).
    - Update [field-tests/whoop-android-5.473.0.md](field-tests/whoop-android-5.473.0.md) to reflect that radare2 and Ghidra now admit standalone DEX files (done: "gaps still open" item 1 rewritten).

## Environment

15. **Reverse engineering tools:**
    - Installing `radare2`, `binwalk`, `apktool`, and `jadx` via Homebrew (`brew install`).
    - Verify presence of `d8` (available at `/opt/homebrew/bin/d8`) and `javac` (`/usr/bin/javac`).

## Paused

16. Function emulation.

## REA+ gap registry (2026-10-26)

Details and Evidence-backed context: `field-tests/rize-macos-1.1.52.md` and
`field-tests/whoop-android-5.473.0.md`. This is the single cross-test list.
State of play: WHOOP items **6, 7, 9, 10** are done (see their own section
below); item **8** is partially done (XAPK) with its residuals re-registered as
26–28; Rize items **17–25** are all open. Items 17 and 18 have also now been
observed in a second workflow (the WHOOP Android test) and are the
highest-value fixes. Agreed order for implementation: **17 → 18** next
(both offline-proceedable), then **21–22** (filtering/budget allocation) for
large Electron investigations.

17. **JavaScript constant/string search is not exposed (repeat, cross-workflow).**
    The Rize hosts, the embedded Amplitude API key and the `certificate.p12`
    reference were all found with direct tree greps, not with REA+. Same shape
    as WHOOP gap 9, but for the JS/Electron workflow: propose a
    `search-javascript-strings` over string literals and identifier tables
    across the inventoried files, keyed by the application-graph artifact
    digests, with path/class/file limits and coverage, so graphs stay the
    single source of locations.
    Status (2026-10-26): **implemented on `main`** —
    `search_javascript_strings` / `rea search-javascript-strings` inventories
    the target (directory or `.asar`), parses inventoried UTF-8 JavaScript
    files, and matches case-sensitive substrings against string constants
    (string literals, directive literals, static template quasis) or runtime
    identifier names (`--scope identifiers`). Matches carry file path, file
    `sha256`, byte offset, exact value and literal kind; coverage, parse
    failures, `file_limit`/`match_limit` omissions and UTF-8 gaps are explicit
    counts; bundler module attribution stays with
    `analyze_javascript_application`. Domain walker, service, contract,
    effects, availability, CLI/MCP registration, docs and boundary tests
    landed together; the full `check:pr` gate re-run (incl. the suite) is the
    remaining follow-up.

18. **Dynamic IPC channels never resolve to names.**
    LANDED (parent-side): dynamic channel expressions are split into fixed
    text and import-bound roots (`electronIpcChannelParts.ts`), then resolved
    against each file's projected module IR — import-binding `provenance`
    origins for the consumer, exported literal-string constants for the
    provider — with artifact-scoped module-specifier path resolution one hop
    between them. Resolved findings keep their recorded expression, gain
    `channel_origin: "imported-constant"`, and pair/summarize unchanged;
    unresolved stays dynamic. Fail-closed on local constants, shadows/folded
    bindings, multi-fragment member paths, re-export chains, and constants
    outside the artifact. Graph edges label the source honestly as
    `imported-constant` instead of `literal`.
    Rize field re-test (2026-10-26, evidence 565 MB vs same `git` tree): the
    resolver works end to end — a scratch fixture with relative imports
    resolves 3 of 4 channels through an imported constant in the CLI — but
    Rize stays at 109/109 dynamic and 0 paired, because all its channel
    constants are bound through **bare specifiers** (`utils/ipcMessages`)
    that webpack resolves against its extra module directory
    (`resolve.modules: ['node_modules', './src']` in
    `webpack.main.config.js`). `resolveArtifactPathByContext` only walks
    enclosing `node_modules` directories and reports such specifiers
    `external` before the constant table is consulted; no webpack
    `resolve.modules` support exists anywhere in the codebase. Remaining
    as item 28 below.

19. **`contextBridge.exposeInMainWorld` through a helper is blind.**
    Rize exposes all 17 bridges via one helper (`src/utils/createPreload.js`),
    so `context_bridge_apis` counted 17 but `exposed_api_members` counted 0:
    passed member arrays flow through a local function, not a literal at the
    call site. Propose: resolve same-module helper indirection for the
    `exposeInMainWorld` namespace + member arguments (or at minimum report the
    helper and its member candidates explicitly instead of a bare 0).

20. **Endpoint templates are dead ends without a materializer.**
    REA+ correctly kept `{}/auth/magic-link/request`-style templates when hosts
    are runtime-interpolated, but nothing can substitute the build-time env
    values back in. Propose: an optional caller-supplied constant/env map
    consumed by views and traces (`materialized_value` alongside the preserved
    template; template authority stays intact).

21. **No scope/include filters on `analyze-javascript-application`.**
    The full 20,561-file tree (12k vendor `node_modules` modules, 3.6k source
    maps) competes for the same budgets as the ~300 application sources.
    Propose: path include/exclude options (`node_modules` off by default for
    same-protocol Electron targets, with an explicit flag to include), and
    coverage recording everything excluded so Evidence stays honest.

22. **Result-budget mechanics are all-or-nothing per important files.**
    The parent reserved its remaining budget for static observations, so
    semantic analysis skipped exactly the interesting files: all ten 
    `.webpack` renderer bundles and `native_modules/electron-log-preload.js`.
    Propose: (a) application-path priority over vendor when budgeting,
    (b) per-file semantic budgets instead of one global cap, and (c) a
    compact per-file skip/block view (today the omissions are one giant
    comma-joined limitations string that is hostile to programmatic readers).

23. **`analysis_failure` remediation overpromises for budget-only causes.**
    All 25,383 failure records are pure result-budget constraints, and the
    remediation text says "Retry with sufficient memory or a smaller
    artifact", which is misleading: a **retry with unchanged limits is
    expected to reproduce the failure**, and the record currently reports
    `retryable: false` for budget causes. Corrected position (2026-10-26,
    after code review): do **not** blanket-mark budget failures retryable.
    Instead: (a) make the remediation text truthful — state which knob would
    have to change (budget/limit name only) and that an unchanged retry
    fails identically; (b) keep `retryable` false for unchanged limits, and
    derive it truthfully only where the failure actually depends on a caller
    knob, or drop the field pending a real retry-semantics review.

24. **`summary.statistics.modules` names a different thing than graph
    modules.**
    Corrected by code check (`JavaScriptArtifactAnalysis.ts:211`): the counter
    sums `bundler_registrations[].modules` — i.e. **bundled module
    registrations** recovered from bundler metadata, not graph
    `javascript-module`/`source-module` nodes; Rize's 0 means no bundler
    registration metadata was recovered, which isn't by itself a counting
    bug. The gap is naming/documentation: rename the field (e.g.
    `bundler_module_registrations`) or document it at the summary schema, and
    make the summary distinguish 'no bundler metadata recovered' from module
    counts. Recheck the module-page view against the same distinction.

25. **Optional: a secrets/declared-material scan for JS/Electron Evidence.**
    The Rize finding that a CI code-signing certificate shipped in the bundle
    was found by hand. A declarative "shipped-material" check (binary blobs,
    key/cert file extensions, hex-length API keys) flagged inside the Evidence
    would turn this observation class into a tool result rather than luck.
    This is a feature request, not a defect: keep it opt-in to avoid
    noise/false positives.

## WHOOP-test gaps still open (re-registered from that field test)

WHOOP items 6, 7, 9 and 10 above are done, and the binwalk gap from its "How
REA+ did" table is resolved by the installed toolchain. These residuals from
item 8 remain open as REA+ gaps:

26. **Split-APK bundle forms are still unsupported (documented-only).**
    `.aab` and loose split sets (directories, `.apks`) remain unadmitted by
    all five Android operations, even though `pull_adb_package` already pulls
    the complete split set digested per file. An admission flow plus merge-
    scope Evidence should match the XAPK treatment in item 8. Same format-
    coverage gap class, different container.

27. **APK signature verification is a standing `not_performed` hole.**
    Item 8's deliberate deferral, kept visible here so it does not get lost:
    `inspect_android_package` reports signing as `not_performed`, and every
    test since (WHOOP) has had to fall back to `apksigtool` by hand. A
    dedicated adapter with its own Evidence authority is required — v1/v2/v3
    mean message digests, RSA/ECDSA, and byte-range offsets over signed
    regions up through the APK Signing Block. Position unchanged: build it
    only when a caller task actually needs tamper/lift detection.

28. **Bare specifiers through an application module root are unresolvable.**
    New (2026-10-26) follow-up from the Rize gap-18 re-test: webpack's
    `resolve.modules: ['node_modules', './src']` binds the app's own
    directories into bare-specifier resolution (`utils/ipcMessages` →
    `src/utils/ipcMessages.js`), and Rize — and Electron apps like it —
    rely on it. To resolve, read the extra module directories from an
    inventoried webpack/rspack/jest config (or accept caller-supplied roots),
    admit them as a *lower-precedence* candidate class after `node_modules`
    (never shadowing a real package), strictly inside the artifact, and keep
    unresolved outcomes honest as `external` with the reason. This unblocks
    item 18's pairing for these apps; without it the 58 `ipcMain` handlers
    stay `0 paired`.

29. **`search-android-strings` boundaries are standing measurement gaps.**
    From the done item 9: large-APK memory behavior (>8,192 classes or memory
    pressure near a 4 GiB heap) is unmeasured in production; APKs over 8,192
    classes hit third-party JAR LRU cache eviction on rescans;
    `skipped_methods` counts only engine decompile failures while per-class
    method-cap skips show as partial coverage without a dedicated field; and
    engine scan-skip counts vary non-deterministically (12–23) on malformed
    bodies. Also, the scan runs over *decompiled* method bodies: bytecode-
    level (smali/binary) constant search still exists only in radare2/Ghidra,
    so note it has the same shape as Rize item 17.
