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
- **Flaky boundary tests:** Done. Both `processCaptureProgress.test.ts` and `clientProfileLifecycle.test.ts` use load-tolerant orchestration budgets without changing cancellation-latency commitments. The capability-skip path remains mutation-backed. Both suites passed in the full `check:pr` run on 2026-10-27 (item 1), completing the pending verification under suite load.
- **Environment:** The 2026-10-27 gate used the supported Node v24.22.1 runtime at `/Users/sigur/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/bin/node` and installed npm 10.9.2. The exact pins (Node 24.18.0 / npm 11.16.0) were not available locally; the gate did not install a replacement toolchain. Previously recorded tool versions: `ghidra` 12.1.4 (with OpenJDK 27), `radare2` 6.2.4, `binwalk` 3.1.0, `jadx` 1.5.6, and `apktool` 3.0.3.
- **Ghidra DEX support:** Done on `main`. Forced `DexLoader` import with the Dalvik language selected from the DEX header version; DEX string-pool definition runs as a packaged post-analysis script (`ReaGhidraPrepareDex.java`) so Dalvik method discovery keeps working; DEX byte-read and file-offset behavior is documented honestly in `docs/ghidra-dex.md`; `npm run verify:ghidra:dex` verifies the committed `tests/fixtures/dex/` fixture end to end (green on macOS arm64/ghidra 12.1.4).
- **Flaky `ghidraLauncher.test.ts` and `processFinalization.test.ts`:** Addressed. The launcher test matches the DEX-aware conflict message (plus a DEX-negative case); finalization acceptance tests use a 15s compiled-workflow startup budget (30s test timeout) without changing cancellation-latency (<8s) commitments. Both passed in the full 2026-10-27 gate (item 1).

## Branch, gate and git

1. **Gate verification (`npm run check:pr`):**
   - The earlier 2026-10-27 gate passed 904 files / 8,408 tests, with 16 files /
     274 tests skipped. See [earlier gate report](field-tests/rea-check-pr-2026-10-27.md).
   - **Final reviewed offline-backlog gate passed on 2026-10-28 (exit 0):**
     **912 files / 8,442 tests passed; 16 files / 274 tests skipped; zero
     failures**. The test phase took 1,065.46 s. Types, lint (852 warnings,
     zero errors), formatting, unused code, metadata, documentation, jscpd
     (**2.50%**) and tech-debt scanning passed. Provider skips do not establish
     real-provider coverage. See
     [offline verification](field-tests/rea-offline-backlog-2026-10-27.md).
2. **Branch state and push:**
   - With the offline-backlog commit, `main` is **10 ahead / 0 behind** the
     locally recorded `origin/main`; the remote was not refreshed.
   - Relevant source, tests, documentation and compact verification records are
     committed. Private target inputs, large generated Evidence and unrelated
     local work stay outside the commit. No push was performed for this batch.

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
8. **Android package formats and validation:** done.
   - XAPK admission and composition landed in `7795b12`; strict bounded manifest
     validation, declared base-name resolution and pre-codegen annotation
     snapshots landed in `2eef296`. The declared base is never renamed.
   - APK-set directories, explicit `.apks` variant selection and universal AAB
     conversion are now implemented; see item 26 for their admitted scope.
   - Optional verification of original APK signatures has its own apksig
     authority; see item 27. Composition does not authenticate an install image.
9. **Android string constants and bytecode searching:** done, with measured limits.
   - The original decompiled-body operation remains available. Explicit
     `scan_mode: "dex"` now reads original const-string/jumbo instructions,
     preserving member/instruction locations without Java code generation or
     the decompiled mode's class/cache and per-class method caps.
   - Dedicated method-cap counters, caller-selected total deadlines and partial
     coverage for unreadable methods are implemented. See item 29 and the
     [offline verification](field-tests/rea-offline-backlog-2026-10-27.md).
   - Windows lifecycle verification remains unexercised locally. Neither mode
     is a complete DEX string-pool, annotation or resource inventory.
10. **`inspect-jvm-artifact` duplicate entry handling:**
    - Done: Archive inventory now keeps the first record of a repeated name.

## Flaky tests and gate robustness

11. **Test timeouts under concurrent load:**
    - Done on `main`: both suites' budgets and the capability-skip path are stabilized and mutation-checked as described above. The full 2026-10-27 `check:pr` run passed, including these suites under full suite load (item 1).

## Consensus

12. Analyze a HAR exported from your own consensus.app session with `inspect-web-network-capture` once it is available.
13. Optional: add a telemetry section to the rebuild plan, and check the tool list of the anonymous MCP tier.

## WHOOP

14. **Open field-test questions:**
    - Running the app or its traffic; reading the strap protocol itself; strap unlock and membership checks.
    - Mapping UUID families to device generations, and identifying codenames (Kenmore, Copley).
    - Update [field-tests/whoop-android-5.473.0.md](field-tests/whoop-android-5.473.0.md) to reflect that radare2 and Ghidra now admit standalone DEX files (done: "gaps still open" item 1 rewritten).

## Environment

15. **Reverse engineering tools:** done on this host.
    Existing radare2, binwalk, apktool, jadx, d8 and a full JDK were verified in
    the field-test work. No additional host toolchain installation was needed.

## Paused

16. Function emulation.

## REA+ gap registry (2026-10-26)

Details and Evidence-backed context: `field-tests/rize-macos-1.1.52.md` and
`field-tests/whoop-android-5.473.0.md`. This is the single cross-test list.
State of play (2026-10-28): **17–29 are implemented and offline-verified**
within the limits recorded below. Item 22(a–c), scope filters and the remaining
helper/format/signature/measurement work are included in the final gate and
commit batch. Device/live-traffic work (12, 14), optional Consensus research
(13) and paused emulation (16) retain their separate status. See the
[combined verification report](field-tests/rea-offline-backlog-2026-10-27.md).

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
    landed together; the full `check:pr` gate re-run passed on 2026-10-27
    (item 1).

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

19. **Bridge helper discovery:** done at candidate authority.
    Same-module and imported exported helpers retain namespace/member candidates
    with caller/helper path, digest and ranges. Object-alias contents remain
    unknown because lexical initialization does not prove their state after
    member writes. Actual exposed `members` remain
    unverified; lexical shadows, reassigned helpers and missing arguments do not
    acquire observed-exposure authority. The paged `context_bridges` view and
    summary expose the distinction. Final scoped Rize: **58 member candidates**;
    `exposed_api_members` remains 0.

20. **Endpoint template materialization:** done.
    The paged `endpoints` view accepts an explicit caller `bindings` map keyed
    by the preserved source expression. It returns `materialized_value` beside
    the original template, retained parts and unresolved expressions. No ambient
    environment, expression execution or guessed historical metadata is used.

21. **No scope/include filters on `analyze-javascript-application`.**
    The full 20,561-file tree (12k vendor `node_modules` modules, 3.6k source
    maps) competes for the same budgets as the ~300 application sources.
    Propose: path include/exclude options (`node_modules` off by default for
    same-protocol Electron targets, with an explicit flag to include), and
    coverage recording everything excluded so Evidence stays honest.
    Status (2026-10-27): **implemented on `main`** —
    `paths_include` / `paths_exclude` accept artifact-relative glob patterns
    (anchored full path; `**` spans segments with `**/` also matching zero
    segments; `*`/`?` stay within one segment; excludes win over includes).
    Scoping happens at the artifact-read stage, so excluded files are never
    read or analyzed, and the result `statistics.paths_scope` records the
    pattern lists verbatim plus considered/selected/excluded counts —
    coverage stays explicit without the limitations string. Defaults are
    deliberately unchanged (every file analyzed, zero-exclusion counts
    reported): after 22(a)/(b) application sources reach the budget first,
    so the registry's "node_modules off by default" flip is no longer the
    structural fix it was; revisit only on new field evidence. The option surface, contracts and CLI/MCP checks are included in the
    final combined gate (item 1).

22. **Result-budget mechanics are all-or-nothing per important files.**
    The parent reserved its remaining budget for static observations, so
    semantic analysis skipped exactly the interesting files: all ten 
    `.webpack` renderer bundles and `native_modules/electron-log-preload.js`.
    Propose: (a) application-path priority over vendor when budgeting,
    (b) per-file semantic budgets instead of one global cap, and (c) a
    compact per-file skip/block view (today the omissions are one giant
    comma-joined limitations string that is hostile to programmatic readers).
    Status (2026-10-27): **(a) implemented** — `analysisOrder`
    (`JavaScriptArtifactAnalysis.ts`) sorts sources size-ascending *within*
    two admission groups, non-vendor first, so application sources reach the
    semantic budget before vendor modules; other files keep their place.
    Same-tree Rize re-run with the env-gated resolver debug line:
    `semantic-files=312` (down from 1,693, which was vendor-weighted) with the
    application sources now admitted first — the intended trade per (a). The
    resolver now runs against IR-backed modules instead of never executing.
    Follow-up (b) is **done** (2026-10-27): the run-wide kill-switch is gone —
    semantic degradation is per file. The parent reserves an observed-cost
    capacity for static-child results (`javaScriptStaticObservationReserve`)
    and the worker projects module IR against per-file node budgets; a file
    that exhausts becomes a per-file resource-constraint record
    (`AnalysisResourceConstraintError` carrying the file path and budget
    fields) instead of aborting every remaining source. The result-budget
    throw, the dead marker field and the run-wide break rule were removed,
    and the worker boundary suite pins semantics retention for 64 sequential
    small sources. Full-Rize confirmation on the rebuilt dist: exit 0,
    complete evidence, **zero interruption records**, `semantic-files=2,739`
    (up from 1,693 pre-(a) / 312 under (a) alone), and IR for all 48 of 48
    `src/main/modules/*` files including the previously skipped large
    modules (toaster, blocker, windowManager, …). Verification evidence:
    `/tmp/rize-22b-final.json` (not persisted into `field-tests/`). No
    channels resolved for Rize yet: attempts fail closed at
    `origin-null`/`provider-null` — bare specifiers bound through webpack's
    `resolve.modules` (item 28), which item 22 does not address.
    Follow-up **(c) is implemented and verified** (2026-10-27):
    `inspect_analysis_view` / `rea inspect-analysis-view` now support a paged
    `file_statuses` collection, with `filter: "with-issues"` (default) or
    `"all"`. Rows preserve path/digest/node/observation identity, text and parse
    status, module-IR retention/coverage, semantic-projection status and
    structured source-bound errors/limits. Byte-identical aliases remain
    separate rows. Parent diagnostics and large limitations are referenced,
    not repeated; older missing metadata remains `not-recorded`.
    **69 related tests passed**, including real CLI production/inspection,
    retained MCP pages, SDK-advertised schema validation and memory-limited
    recovery. Type/lint/format/unused-code/metadata/architecture checks,
    documentation checks and jscpd (2.50%) passed. That focused run did not rerun
    the full suite. The final combined gate (recorded 2026-10-28, item 1) now
    covers these changes too. See [verification](field-tests/rea-file-status-2026-10-27.md).

23. **Budget-failure remediation:** done.
    Resource diagnostics name the recorded budget fields, explain that capacity
    must change or scope shrink, and state that unchanged limits reproduce the
    failure. `retryable` remains false. Worker heap changes are distinguished
    from parent result/node budgets; no blanket retryability was added.

24. **Module-count semantics:** done.
    The legacy `statistics.modules` field is explicitly documented as the sum
    of recovered bundler module registrations. Summary `module_counts`
    separately reports `bundler_module_registrations`, JavaScript assets,
    JavaScript modules, source modules and module-page entries. The page counts
    graph module nodes; absent bundler metadata does not imply absent modules.

25. **Opt-in shipped-material candidates:** done.
    `scan_shipped_material` / `--scan-shipped-material` records inventory
    key/certificate extensions and 32/40/64/128-character hexadecimal literals.
    Literal discovery runs in the isolated parser worker; graph expansion obeys
    per-file budgets. Results preserve locations/digests and unknown secrecy,
    without copying literal values or declaring them secrets. The paged
    `shipped_material` view reports omitted/unavailable scope. Final scoped Rize:
    **18 emitted candidates** (1 extension, 17 hex), **10 literal candidates not
    projected**; scan coverage remains partial.

## WHOOP-test format, signature and scan follow-ups

26. **APK-set and AAB admission:** done within explicit scope.
    Android operations admit selected `.apks` variants and loose regular
    top-level APK directories. Directory identity commits to sorted member
    names, sizes and SHA-256 values; changed members are rejected. Alternatives
    require caller selection, never inferred device compatibility. AAB uses a
    caller-configured, snapshotted bundletool JAR in an owned temporary runtime;
    universal output covers fused modules only. Original subject identity,
    member digests and merge limitations survive admission. Real CLI/MCP
    APK-set and AAB fixtures passed; on-device installation and non-fused feature
    coverage remain unverified.

27. **Optional APK signatures:** done.
    `inspect_android_package` accepts `verify_signatures: true` with a separately
    configured Android apksig JAR. It verifies each original APK's bytes,
    records verifier/member digests, v1/v2/v3/v3.1 results, certificate hashes,
    errors/warnings and cross-member signer consistency. Defaults stay
    `not_performed`; composed analysis images and generated AAB APKs do not
    authenticate their sources. Real signed, tampered and split fixtures passed.
    Publisher trust/revocation, v4 sidecars, AAB signing and installability remain
    outside this APK-specific facet.

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
    Status (2026-10-27): **implemented on `main`** (commit `25cf8f7d8`) —
    `javascriptModuleRoots.ts` reads string-literal-only extra module
    directories from inventoried webpack/rspack/jest configurations,
    configuration code is never executed, and the directories are admitted
    as a lower-precedence candidate class after `node_modules`, strictly
    inside the artifact, never shadowing a real package; unresolvable
    outcomes stay `external` with the reason.
    Status (2026-10-27, second pass): **Rize re-test confirms the chain** —
    combined with imported-constant channel resolution, full-Rize runs show
    `literal_channels` 0 → **52** and `dynamic_channel_operations`
    109 → **97**, then **57** once the module-IR projection also retains
    namespace-import destructurings (`const { X } = namespace`); 104
    `imported-constant` occurrences, every recovered channel a real Rize IPC
    name, no fabricated values. Pairing stays 0 paired with
    `unpaired_literal` 0 and `ambiguous` 0: all 52 literals are main-side
    listeners, while every renderer transmission stays dynamic — 32+16
    minified roots in `.webpack/renderer/*` bundles (`t`/`r`, webpack module
    tables unprojected) plus 4 callback-parameter sites
    (`mapValues(on, ipcMessage => ipcRenderer.on(ipcMessage, …))`), both
    outside the resolver's fail-closed imported-constant scope. Sequential
    follow-ups that would finally move `paired_renderer_transmissions`:
    baked webpack chunk module-table resolution, and interprocedural
    argument flow into preloaded bridge calls; each recorded here rather
    than opening a new item. See `field-tests/rize-macos-1.1.52.md`,
    "Re-test note (2026-10-27, item 28 module-roots + imported-constant
    chains)".

    Final follow-up (2026-10-27): **done for admitted static flows**.
    Bound CommonJS bootstrap tables, namespace-import destructuring and narrow
    helper argument flows now retain the missing renderer facts. Bootstrap
    syntax is labelled `commonjs-bootstrap`, without claiming the original
    packager. Helper channels carry `helper-argument` inference plus original
    helper/caller locations. Final Rize CLI re-test excluded `node_modules/**`
    and `**/*.map`: **52 paired renderer transmissions**, **0 ambiguous**,
    **0 unpaired literal**, **39 dynamic operations**. The explicit scope
    selected 415 of 20,561 files; this is not a full-vendor or runtime claim.

29. **Android scan measurement and raw-bytecode path:** done, with limitations.
    Real public MCP fixtures verify all 4,101 methods in raw DEX mode versus
    4,096 scanned / 5 cap omissions in decompiled mode. An independent byte
    oracle verifies ordinary const-string and const-string/jumbo offsets.
    Whole WHOOP base APK (SHA-256 `db865d60…e699d`), 4 GiB JVM heap: two raw
    scans examined **83,390 class identities / 510,417 methods**, in
    **17,702 ms cold / 709 ms warm**. Both reported **3 unreadable methods**,
    **0 method-cap omissions**, and **partial coverage**. Source bytes were
    unchanged. `/usr/bin/time -l` reported maximum RSS of **3,638,460,416 bytes**, distinct from
    the configured heap. The inventory/load count (47,244 top-level classes)
    differs from the scan's inner-class-inclusive identities by design.
    Decompiled scans timed out at 120 s and twice at the explicit 600 s limit;
    no completed decompiler skip-count/cache-stability claim follows. Raw mode
    avoids that source-generation/cache path, but still does not inventory
    every string-pool, annotation or resource entry. Details and compact real
    evidence: [offline verification](field-tests/rea-offline-backlog-2026-10-27.md).
