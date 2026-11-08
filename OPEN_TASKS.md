# Open tasks

Open work on `main` following PR #1 and the field tests.

## Status

- **Arc delegate/evaluator follow-up (2026-11-06, continued 2026-11-08):** On the fixed 1.172.1 DMG,
  selected public metadata identifies `BoostsEditorWindowContent` as the
  substantive Boost-command delegate and `WebContentFrame`'s corresponding
  slot as a four-byte return stub. The editor's lazy web-content creation path
  installs its delegate witness; command handling reaches its captured dispatch
  closure. Selector evaluation now has the concrete `WebContentsAdaptor` /
  `SelectorPickerWebContents` identity, a main-actor/callback route to
  `executeJavascript:reason:completion:`, and a fixed-version String/JSON
  return continuation. The separate async DevTools route is distinguished.
  New capability
  gaps **51–52** record the missing protocol-scoped discovery and generic
  witness-template observations; the latter has an owned source-built
  CLI/MCP reproduction. **53** records misleading disk-capacity diagnostics.
  Full feature behavior remains partial. See the
  [follow-up report](field-tests/arc-dispatch-2026-11-06.md) and its captures.
- **Arc DMG repairs and retest (2026-11-06):** Items **45–47 are fixed for
  their documented profiles** and retested on the supplied Arc **1.172.1 /
  build 90370** DMG. Return-field provenance reaches the literal; five shipped
  callback associations are recovered; Swift decoding preserves the missing
  error branches, including a cleanup-before-check variant. Three additional
  issues found during verification, **48–50**, are also fixed: DMG extraction,
  quadratic return-field slot lookup and package-verifier archive parsing.
  **515 source tests / 14 files**,
  **38 distinct public/boundary cases / seven files**, real Ghidra/compiler and
  macOS-bundle lanes, repository/docs checks and isolated packaging verify
  the batch. All **1,113 extracted regular files** match their commitments.
  Full Arc behavior remains partial. See the
  [DMG retest](field-tests/arc-retest-2026-11-06.md).
- **Arc deepening (2026-11-03):** New open items **45–47** have owned public
  reproductions: caller return-field propagation, listener-handler continuation,
  and Swift throwing-call guards omitted by decompiler-derived flow. Native
  selector invocation, JSON result decoding and result processing are now traced;
  Boost wire-key spellings are established. This analysis-only pass changes no
  REA+ implementation source. It retains 106 driver calls / 95 successes,
  three exact JavaScript CLI/MCP comparisons, source-built Swift reproduction,
  authenticated Evidence and unchanged 782-file target identity. Full Arc
  behavior remains partial. See [deepening report](field-tests/arc-deepening-2026-11-03.md).
- **Arc continuation (2026-11-03):** Items **42–44 are implemented and
  publicly verified**: static resilient Swift witness records, bounded decoded
  Chromium-resource literal search, and returned-object field provenance.
  Arc's request decoder is now addressable through its static witness;
  complete canonical-pack searches recover three additional code bodies;
  known return-field traces reach their sink while DOM candidates remain
  uncertain. **189 tests / 16 files**, repository/docs/native checks and
  authenticated CLI/MCP receipts verify the batch. Full Arc behavior remains
  incomplete. See [continuation report](field-tests/arc-continuation-2026-11-03.md).
- **Arc inline HTML and feature follow-up (2026-11-03):** Item **41 is done**.
  Offline HTML now produces derived classic/module sources with original
  document identity/ranges, separate physical/inline counts and explicit
  omission/unsupported diagnostics, including after interruption. **166 tests
  / seven files**, public CLI/MCP parity, legacy Evidence reuse and an actual
  Arc retest verify the change: **three inline bodies / 222 AST nodes**, with
  all three module IRs retained. Native follow-up establishes the gallery's
  URL/action and Boost IDE request-case/response names. A 300-second native
  comparison still remains partial; full Arc behavior is not complete. Source,
  docs, duplication and isolated package checks pass. See the
  [feature follow-up](field-tests/arc-feature-followup-2026-11-02.md).
- **Arc fixes and fresh retest (2026-11-02):** Items **38–40 are fixed and
  published in `3a3b6c438e7f`**, then independently retested on Arc. Explicit
  snapshot budgets admit the original universal
  executable; the new Chromium resource reader validates packs and selected
  gzip/Brotli content; guarded URL receiver provenance removes the query-key
  candidate without suppressing unknown custom clients. **77 tests / 11 files**
  and matching real Arc CLI/MCP Evidence verify the changes. Full app behavior
  remains incomplete. The fresh pass exhausts all **5,796 main-pack IDs**,
  confirms zero scoped false endpoint candidates and recovers five seeded
  native helpers. **69 retained MCP calls / 63 successes**, five expected
  errors and one resolved environmental startup error; no new product defect
  reproduced. See [fresh retest](field-tests/arc-retest-2026-11-02.md),
  [fix verification](field-tests/arc-fixes-2026-11-02.md) and the
  [original field test](field-tests/arc-macos-1.171.0.md).
- **Function emulation (2026-10-31):** Item **16 is implemented and verified**
  for its initial bounded arm64/x86-64 profile. Public `emulate_function` and
  `rea emulate-function` preserve explicit code/register/memory inputs and
  conditional Evidence, with instruction/time/coverage bounds and named stops.
  **42 source-built scenarios / 57 MCP invocations**, four exact CLI/MCP
  comparisons, cancellation/cleanup checks and an actual installed-package
  emulation pass. HeyClicky's main-window routine reaches its return boundary
  with false; other trials expose missing runtime memory or an outside-code
  callee rather than completing those functions. Full app analysis stays open.
  See the [verification report](field-tests/function-emulation-2026-10-31.md).
- **HeyClicky feature follow-up (2026-10-30):** Item **37 is fixed and verified**.
  REA+ now recovers the Swift enum dispatch itself: all 30 notch-sizing cases,
  a 15,380-byte owning body and complete case code in pseudocode. Two positive
  compiler fixtures and 16 rejection variants pass 72 real MCP calls; the
  30-case CLI/MCP Evidence IDs match. Manual UI observations remain separate:
  Settings Escape collapsed, while Chat Escape removed text-input focus and
  left the panel expanded; hover remains unverified. The authored workflow now
  keeps manual/external checks supplemental to tool recovery. Full app analysis
  remains incomplete. See the
  [item 37 fix verification](field-tests/heyclicky-37-fix-verification-2026-10-30.md)
  and [current dossier](field-tests/heyclicky-analysis-dossier-2026-10-29.md).
- **HeyClicky continuation (2026-10-29):** The fresh retest reproduced the
  original checks for items **30–35** and exposed the receiver-fact collision
  in **36**. Item 36 is now fixed: 43 focused tests and a new shipped-extension
  analysis pass, retaining seven storage facts with no false continuations.
  The earlier full repository gate predates this fix; it was not rerun.
  Feature recovery continues beyond tool verification; the full app analysis
  is not complete. See the [fresh retest](field-tests/heyclicky-retest-2026-10-29.md)
  and [feature-analysis dossier](field-tests/heyclicky-analysis-dossier-2026-10-29.md).
- **HeyClicky field test (2026-10-28):** Items **30–35** are fixed and verified
  through focused checks and matching real-provider/static app retests; the full
  repository gate passed on 2026-10-29. The previously completed Rize/WHOOP engineering batch
  (17–29) retains its recorded scope. See
  [HeyClicky report](field-tests/heyclicky-macos-1.1.1.md).
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
   - **HeyClicky corrections gate passed on 2026-10-29 (exit 0):** **913 files /
     8,474 tests passed; 16 files / 274 tests skipped; zero failures**. The test
     phase took 1,000.69 s. Types, lint (865 warnings, zero errors), formatting,
     unused code, metadata, documentation, jscpd (**2.49%**) and tech-debt
     scanning passed. An earlier sleep-interrupted run's exact failed cases
     also passed with unchanged test budgets; see
     [HeyClicky fix verification](field-tests/heyclicky-fixes-2026-10-28.md).
2. **Branch state and push:**
   - **Items 45–50 verification batch (2026-11-06):** implementation, tests,
     skill 43, DMG retest and complete small captures are included together
     after `14855891c323`. The fixed user DMG, source-built binaries,
     Ghidra projects and two large local Rize JSONs remain outside this batch.
     Historical receipts describe intermediate source profiles and failed
     attempts; the final Swift profile is `proved-native-synchronous-callee-x21-v3`.
   - **Arc deepening notes (2026-11-03):** findings, issues 45–47, owned
     reproductions and complete captures are included together after
     `cb8ed4db254e`. This pass does not claim those issues fixed or rerun the
     earlier implementation suite. Source-built binaries and provider projects
     remain outside Git; the two large Rize JSONs remain local and excluded.
   - **Items 42–44 publication batch (2026-11-03):** static resilient witness
     records, decoded-resource search, return-field provenance, tests, skill 42,
     feature notes and authenticated captures are included together after
     `ab8a587c5928`. The final gate passes 189 focused tests / 16 files,
     repository/docs/native checks and isolated packaging (205 tools / six
     prompts). Historical receipts record their source-parent and uncommitted
     capture sessions. The two large local Rize JSONs remain excluded.
   - **Item 41 publication batch (2026-11-03):** inline-source implementation,
     tests, skill 41, feature findings and authenticated captures are included
     together after the published retest `d4bf47b75`. The package check verifies
     204 tools / six prompts and isolated install/update/cleanup. Historical
     uncommitted statements describe the original capture sessions; the two
     large local Rize JSONs remain excluded.
   - **Arc publication batch (2026-11-02):** the initial field test, items 38–40
     implementation and verification were pushed in `3a3b6c438e7f` to the
     existing WIP `origin/main`; the remote main hash was checked explicitly.
     The subsequent fresh retest is documented separately and adds no
     production changes. The required `check:fast` passes. Historical receipts' uncommitted/unpushed statements
     describe their original verification sessions. The existing two large Rize
     JSONs remain local and excluded from this batch.
   - **Item 16 publication batch (2026-10-31):** the bounded function-emulation
     implementation, tests, documentation and durable small Evidence bundles
     are included together. The user requested publication to the existing
     `origin/main` on `Sigurius23/REA-Plus-WIP`. The required pre-push
     `check:fast` passed; full `check:pr` remains a separate optional follow-up.
     Earlier verification receipts describe their original uncommitted session.
   - **Publication batch (2026-10-31):** published commit `57bc7264a` contains the HeyClicky
     fixes for items 30–37, their tests, workflow improvements and investigation
     reports. The refreshed `origin/main` matched the prior local HEAD
     (`895057282e98`) before publication; destination is
     `Sigurius23/REA-Plus-WIP`, branch `main`, over the existing SSH push URL.
   - Pre-publication `check:fast`, `docs:check` and the complete
     `verify:package` lane passed on 2026-10-31, including packed helper
     inclusion, isolated install/update, CLI/MCP workflows and verified empty
     verifier lineage. No replacement host toolchain was installed.
   - The two existing local Rize Evidence JSONs remain untracked by design:
     `field-tests/rize-macos-1.1.52/evidence.json` and `summary-view.json`.
     Historical reports' “no commit or push” statements describe their original
     verification sessions. The full `check:pr` gate still predates items
     36–37, 16 and 38–50; their focused and real-provider
     verification is recorded below.

   **Remaining work:** item 12 (Consensus HAR), optional item 13 (Consensus
   telemetry/anonymous MCP research), item 14 (WHOOP device/live evidence; see
   `Whoop/WHOOP_TASKS.md`). Item 16's initial profile is done. HeyClicky's
   tool gaps 30–37 are fixed, while its broader feature/design investigation
   remains incomplete; the [dossier's feature checklist](field-tests/heyclicky-analysis-dossier-2026-10-29.md#feature-checklist)
   records the remaining tracing and runtime questions. Rize's admitted offline
   engineering scope (17–29) is complete with the documented dynamic/coverage
   limits; those limits do not establish full runtime understanding. Arc's
   tool gaps 38–50 are done within their documented profiles; new capability
   gaps 51–53 remain open. Its broader
   feature/design investigation remains incomplete. The latest
   [delegate/evaluator follow-up](field-tests/arc-dispatch-2026-11-06.md#evidence-boundaries-and-remaining-work)
   records the remaining command-dispatch effects, overlay coordinates and
   rendering, extension loading and Boost state/persistence questions.

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

## Function emulation

16. **Concrete function emulation:** initial profile done (2026-10-31).
    `emulate_function` / `rea emulate-function` accepts an original artifact,
    arm64/x86-64 entry, explicit file-offset code mappings, canonical initial
    registers including 128-bit SIMD, initialized memory and selected memory
    observations. Results preserve source/engine hashes, effective registers,
    selected before/after memory, instruction-entry coverage and stop reason as
    derived `controlled-replay` Evidence. No loader, relocation, ABI stack,
    Swift/Objective-C runtime, TLS or imported-call stub is synthesized.

    Instruction, time and unique-coverage limits stop explicitly. External
    calls and the outer return stop before execution; missing/protected memory
    and unsupported CPU/runtime context remain named boundaries. Native page
    permissions protect code/read-only data, with shared-page write conflicts
    rejected. Owned process cancellation, one-engine capacity, retained cleanup
    leases and preservation of completed observations are verified. Python
    launcher and live framework image identity remain distinct on macOS.

    **Verification:** two source-built Mach-O binaries exercise 42 arm64/x86-64
    scenarios through 57 real MCP invocations (45 successful replies including
    retained-bundle operations, 12 expected input/configuration/capacity or
    cancellation outcomes). Four source CLI/MCP comparisons match Evidence
    exactly. **79 source/contract tests**, static checks, documentation,
    duplication (**2.48%**), package verification and `npm pack --dry-run` pass.
    A real installed package reproduces source CLI Evidence with the exact
    shipped helper. Final owned-process lineages are verified empty.

    **HeyClicky:** fresh bounded Ghidra views establish original function ranges
    and file-byte equivalence. The main-window eligibility routine produces
    false at its return boundary. Whole key-window and notch-sizing experiments
    stop at missing runtime globals. Supplying one explicitly assumed global
    value exposes an outside-code callee stop; no runtime stub or complete
    focus/layout result is claimed. Complete small Evidence bundles and static
    records are retained in `field-tests/`, not solely under temporary paths.

    **Limits:** real-engine verification ran on macOS arm64; Linux-host behavior
    remains unverified and Windows is outside this initial process profile.
    OS/runtime emulation, general loader/ABI reconstruction, x87/MMX/AVX and
    full-app semantics remain outside this version. The full repository
    `check:pr` suite was not rerun. See the [guide](rea-local/docs/function-emulation.md)
    and [verification](field-tests/function-emulation-2026-10-31.md).

## REA+ gap registry (2026-10-26)

Details and Evidence-backed context: `field-tests/rize-macos-1.1.52.md` and
`field-tests/whoop-android-5.473.0.md`. This is the single cross-test list.
State of play (2026-10-28): **17–29 are implemented and offline-verified**
within the limits recorded below. Item 22(a–c), scope filters and the remaining
helper/format/signature/measurement work are included in the final gate and
commit batch. Device/live-traffic work (12, 14) and optional Consensus research (13) retain
their separate status. Item 16 is now implemented as the bounded profile above. See the
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
    (`JavaScriptArtifactAnalysis.ts`) sorts sources size-ascending _within_
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
    admit them as a _lower-precedence_ candidate class after `node_modules`
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

## HeyClicky native and browser-extension gaps (2026-10-28)

Field evidence and reproduction context:
[HeyClicky 1.1.1](field-tests/heyclicky-macos-1.1.1.md) and its compact JSON.
These are baseline gaps addressed below; the earlier 17–29 completion statement does not
include this later field test.

30. **Chrome storage keys become network endpoints.** Done (2026-10-28).
    `endpointArgument` in `javascriptStaticAnalysisHelpers.ts` accepts arbitrary
    `.get`/HTTP-method suffixes; `javascriptStaticAnalysisCalls.ts` promotes the
    result to a network endpoint without proving the receiver is a network
    client. HeyClicky's four endpoint results are actually
    `chrome.storage.session/local.get('clickyTabs'|'profileId'|'cursorOverlay')`,
    with `cursorOverlay` present twice. Retain storage semantics and require
    truthful receiver provenance for network observations; preserve unknown
    custom clients rather than guessing. Pin Chrome storage and existing
    HTTP-client behavior through public analysis/view regressions.
    Implemented lexical receiver classification with immutable aliases,
    projections and visible-mutation/shadow guards. Extension storage now
    retains its API, area and key; URL-shaped keys stay storage. Unknown
    custom clients remain low-confidence candidates with explicit
    `network_receiver` metadata in graph, worker, web-bundle and endpoint-view
    results. Historical missing receiver metadata stays null.
    Verification: **37 tests passed** across domain and real compiled CLI/MCP
    journeys; build, typecheck and lint passed. A new scoped HeyClicky run
    (`ev_663f4ca8aa3f1be685fd17f1e77a659d26ba20b71df953478cf92c447f4a03b2`)
    moves all four falsely reported endpoints to extension-storage facts.
    One `content-type` lookup remains explicitly receiver-unknown, rather
    than being asserted as network use. See
    [fix verification](field-tests/heyclicky-fixes-2026-10-28.md).

    **Follow-up from the fresh 2026-10-29 retest:** the four former storage-key
    endpoints remain corrected, but receiver facts also misclassify chained
    Promise continuations as storage calls. This follow-up is fixed in item
    **36** below.

31. **Generic browser facts acquire Electron authority.** Done (2026-10-28).
    HeyClicky's `sender.id !== chrome.runtime.id` check enters
    `javascript.electron.sender_validations` through member-name matching in
    `electronStaticAnalysisIpc.ts`. `JavaScriptArtifactGraphDocuments.ts` also
    labels its ordinary scripted popup/welcome HTML as `electron-renderer`.
    Keep valid sender checks and script edges under a generic web/browser
    classification; Electron roles require actual Electron provenance. Account
    for downstream runtime reconciliation that consumes these node kinds.
    Scripted HTML now uses `web-document` with source/script relationships
    preserved; separately supported Electron roles remain distinct. Generic
    sender checks retain transport identity or explicit unknowns; Electron
    checks require lexical provenance from an IPC callback, with alias,
    projection, shadow and visible-mutation guards. Runtime reconciliation
    preserves the generic static kind. Build/type/lint passed, and 162 distinct
    affected checks were verified (including the corrected 23-test HTML
    boundary rerun). Fresh scoped HeyClicky Evidence
    `ev_a60c0e545a01f34677208b3f98ff53f4bb01bb97e27dc83714939474e88bc45b`
    contains two web documents, zero Electron roles/checks and one retained
    generic sender check. The forwarding helper's transport remains unknown.

32. **Shared native metadata budget starves Swift facets.** Done (2026-10-28).
    On HeyClicky's arm64 slice, `max_records:20000` (the maximum public value)
    recovers 656 Objective-C class-list entries plus related records, then
    examines only 96 of 4,036 Swift conformance entries and zero of 4,055 Swift
    type entries supplied to the vtable decoder. The type table includes
    non-class types; 4,055 is not a vtable count. `AppleDispatchMetadata.ts`
    spends the same budget in fixed facet
    order. Add explicit facet selection, paging or separately owned facet
    admission so useful Swift inspection can proceed within bounded resources.
    Preserve count/omission authority; increasing a record cap alone does not
    establish completeness or solve unsupported layouts. Universal input also
    exceeds the existing 64 MiB snapshot budget; the field test uses a
    separately identified 55,971,232-byte arm64 derivation.
    **Fix verified:** explicit `facet` selection (`all`, `objc`,
    `swift-conformances`, `swift-vtables`) directs the existing aggregate
    budget; each family owns its exhaustion status and unselected families
    report `not_requested`. Fresh HeyClicky Swift-only requests recover 1,448
    vtable slots and 17 decoded conformances plus 102 witness slots, examining
    all 4,036 conformance entries. Unsupported layouts remain partial.
    Build, typecheck/lint, 48 focused tests and ten real source-built Apple
    fixture variants passed, including actual CLI/MCP schema and selection
    parity. See the [fix report](field-tests/heyclicky-fixes-2026-10-28.md).

33. **External Swift bind provenance is replaced with null.** Done (2026-10-28).
    `AppleDispatchMetadata.ts` maps external pointer binds to `0n` before
    `AppleSwiftDispatchFacets.ts` inspects them. Actual descriptor field
    `0x102dec794` points indirectly through `0x10330df28` to
    `_$ss25ExpressibleByArrayLiteralMp` from
    `/usr/lib/swift/libswiftCore.dylib`; pre-fix Evidence instead reported an
    unmapped `0x0`. Keep external bind identity, separate it from local metadata
    addresses, and return truthful unsupported external-layout status. A
    decoded relative displacement is not proof that its external target was
    decoded.
    **Fix verified:** typed binds now retain symbol/library/weak/addend, the
    indirect slot and null final file-backed target with unsupported external
    layout status. Partial conformances preserve local names separately from
    external descriptor identities. The exact HeyClicky reference above now
    retains `ReadingOptions`; 40 focused checks, typecheck/lint and ten real
    compiled fixture variants passed, including CLI/MCP external-bind parity.

34. **Semantic unknowns are described as syntax parse failures.** Done (2026-10-28).
    `javascriptStaticAnalysis.ts` makes `parse_status` partial when
    `unknownFindings > 0`, even if `parse_error_count` is zero. HeyClicky's
    `background.js` reproduces this with the dynamic expected value
    `chrome.runtime.id` and complete retained module IR. The file-status view
    then says "Recorded syntax parse status is partial." Separate actual
    syntax parsing from semantic/fact completeness, and project/document each
    status truthfully. No syntax failure in HeyClicky was observed.
    **Fix verified:** fresh producer/checkpoint/asset metadata now separates
    syntax, static facts and unresolved discovery occurrences. Legacy aggregate
    `parse_status` remains documented for compatibility; historical missing split
    metadata is `not-recorded`. Graph coverage remains partial for dynamic facts.
    HeyClicky background now reports syntax complete / zero parse errors, static
    facts partial / one unresolved occurrence, and complete retained IR; the
    retained file view reports only the static-fact issue. 43 domain and 50
    compiled CLI/MCP/worker/view checks passed, plus typecheck and lint.

35. **Large Swift Ghidra import times out before useful inspection; diagnostics
    hide the phase.** Done (2026-10-28).
    HeyClicky's separately identified 55,971,232-byte arm64 input opened
    lazily, but the first public `binary_overview {}` spent 903,183 ms before
    returning `provider_timeout` at the configured 900,000 ms startup limit.
    A thread sample showed Ghidra's `DecompilerSwitchAnalyzer` active; no
    overview, procedure search or pseudocode from the main executable was
    produced. Cleanup succeeded and the input digest stayed unchanged.
    The error names internal `list_documents` and says "Try a smaller
    request" even though the public overview has no request-size argument.
    Investigate a bounded useful path for large Swift inputs; preserve any
    reduced-analysis coverage explicitly. Report startup/import phase and
    the applicable `REA_GHIDRA_STARTUP_TIMEOUT_MS` knob truthfully. Review
    retry semantics for that phase rather than promising an unchanged retry
    will help or blanket-changing all timeout errors. Do not count this failed
    main-binary pass as successful deep-provider verification.

    **Fix verified:** explicit profile-bound bounded auto-analysis serves a
    stable partial Program only after analysis settles. Default complete-only
    admission is unchanged. Actual completion flags survive provider and
    composed Evidence, including deterministic limitation ordering and exact
    per-launch handshake identity checks across restarts. Startup diagnostics
    retain the public operation, internal operation, stage and bounded redacted
    capture; remediation names the settings and does not promise unchanged retry.
    HeyClicky main now yields an overview and notch-panel pseudocode in the
    bounded profile: 143,433 ms from MCP startup to first overview, 19,880
    procedures / 60,845 defined strings / 59 blocks; analysis remains explicitly
    incomplete. Source-built default/bounded fixtures pass real CLI/MCP schema
    and exact Evidence parity. Inputs are unchanged; owned cleanup verified.
    The full repository gate passed on 2026-10-29; see the fix report for scope and logs.

36. **Receiver facts collide for nested calls with the same start offset.**
    **Done (2026-10-29).** In the pre-fix implementation,
    `javascriptCallReceiverFacts.ts:464` stored facts under `node.start`;
    `javascriptStaticAnalysisCalls.ts:259` retrieved by that same key. Nested
    `storage.get(...).then(...).catch(...)` calls share a start offset while
    having different ends. The inner storage receiver therefore leaks into
    outer Promise continuations, which become exact observed
    `extension-storage` facts with `call:then` / `call:catch` mechanisms.
    Item 30's receiver-fact generalization introduced these false storage
    observations, already present in its first retained output; start-only
    indexing predates it in the older `.open` classifier. The regression was
    discovered by retesting unchanged shipped source.

    Fresh scoped HeyClicky Evidence
    `ev_d1105abe4988de128b79b1441f5f31174bce5aad4a3cd85f50bdbee1f871a5e0`
    contains at least two false continuation observations:
    `ClickyBrowserExtension/background.js:187:7–114` and
    `ClickyBrowserExtension/popup.js:248:0–130`. An inert two-line fixture
    analyzed through the public CLI reproduces two valid getters plus two
    false continuations, Evidence
    `ev_5f9d7550ce39e84be2373f318ee81169d2565554902330f316ec8cef009679ec`.
    Neither the fixture nor HeyClicky was executed.

    **Fix verified:** receiver facts now use exact AST node identity, with one
    internal type shared by every static and captured-web consumer. No wire or
    schema change. Regressions cover aliases, optional chains, real storage
    getters and unknown outer getters after storage, keyed and network calls.
    The new regression failed before the change; **30 domain + 13 compiled
    CLI/MCP/worker tests** pass after it. Full TypeScript, scoped lint (zero
    errors, ten existing warnings), formatting and whitespace checks pass.
    A fresh shipped-extension analysis exits 0, Evidence
    `ev_84f1cc12fe637b3b7988bb7b00a77a4c8cb40d2543a47a690dba6d32b6dbab27`:
    seven storage facts (nine before), zero `call:then`/`call:catch` facts,
    original four getter keys/areas retained, sole `content-type` endpoint
    candidate still receiver-unknown. All 222 resource files are unchanged.
    The earlier full gate was not rerun for this focused fix. The
    [retest report](field-tests/heyclicky-retest-2026-10-29.md) and
    [compact receipt](field-tests/heyclicky-retest-2026-10-29.json) retain the
    original reproduction; the
    [fix receipt](field-tests/heyclicky-36-verification-2026-10-29.json) retains
    the corrected run. No commit or push was made.

37. **Unguarded Swift enum dispatch can leave signed-word switch cases outside
    the recovered function body.** **Done (2026-10-30).** The original HeyClicky
    sizing routine at `0x101319e48` used `LDRSW` relative entries at dispatch
    `0x10131a324`, with an unguarded `swift_getEnumCaseMultiPayload` index.
    Ghidra returned no jump table and omitted case code. The bridge's older
    byte/halfword decoder required an already recovered table/target set and
    local unsigned guard. A source-owned 18-payload/12-empty Swift fixture
    independently reproduced the missing 30 cases even with complete
    auto-analysis. The [original reproduction](field-tests/heyclicky-switch-reproduction-2026-10-30.md)
    remains preserved; increasing p-code output limits could not fix that body.

    **Fix verified:** REA+ now proves a bound from the matching non-generic
    enum descriptor, reflection records, declared accessor/cache and exact
    `libswiftCore` helpers, with unchanged tag flow on every incoming path.
    It decodes signed-word tables without requiring an existing JumpTable,
    validates destinations, restores computed edges and the existing body,
    and installs a derived Ghidra override before queries. It does not create
    separate functions at case labels or steal independent function entries.
    Unsupported/ambiguous/budget-exhausted forms remain unrecovered. Public
    mappings carry their ABI/instruction/metadata proof and explicit limits.
    Supported profiles commit `abi-signed-word-cfg-v1`; Windows P0 is unchanged.

    **Verification:** 30-case and 12-case compiler fixtures pass; 16 malformed
    variants reject altered indices, metadata/cache inconsistencies, escaped frame storage,
    wrong imports, invalid targets and short tables. All **72 real MCP calls**
    pass schemas/canonical contracts; the 30-case CLI/MCP Evidence ID matches
    exactly. Body metadata is checked before decompilation. Inputs stay
    unchanged; final owned lineage is verified empty. **50 source tests**,
    `npm run check`, build/docs checks and jscpd (**2.49%**) pass. The earlier
    full `check:pr` gate was not rerun for this change.

    **HeyClicky:** the unchanged source/slice yields all **30** mappings, one
    **15,380-byte** body (`0x101319e48..0x10131da5b`) and **313 blocks**; the
    missing-switch warning is gone. First overview takes **92,046 ms**.
    The complete result exceeds MCP's inline limit and is consumed through
    REA+'s native-API view and retained export: 10 successful calls plus one
    expected transport constraint, a verified 10,141,215-byte/10-record bundle,
    successful close and token-verified empty lineage. Main auto-analysis
    remains explicitly partial at 60 seconds; case recovery does not establish
    all layout decisions, animation or full app completeness. See the
    [fix report](field-tests/heyclicky-37-fix-verification-2026-10-30.md) and
    [exact receipt](field-tests/heyclicky-37-fix-verification-2026-10-30.json).

## Arc field-test follow-ups (2026-11-02)

Target: `/Applications/Arc.app`, version **1.171.0**, build **89666**.
This is an offline shipped-artifact test; Arc and its helpers were not launched,
and no browser profile, account data or target service was selected. Full feature
recovery is not established. See [Arc field test](field-tests/arc-macos-1.171.0.md)
for the exact scope, raw observations and native-analysis outcome.

38. **Whole-file dispatch-metadata cap blocks large native applications.** Done
    (2026-11-02). The binary reader accepts explicit `max_file_bytes` (CLI
    `--max-file-bytes`), default **64 MiB**, maximum **512 MiB**, for the whole
    original file including universal slices. Refusals report the observed file
    size, selected cap and exact knob; unchanged retries remain non-retryable.
    Facet/record selection does not change byte admission. Large thin/universal
    owned fixtures verify admission, default refusal, cancellation and changed
    identity. Arc's original **166,692,288-byte** universal executable succeeds
    with a **256 MiB** snapshot policy; CLI/MCP Evidence matches exactly. The
    selected 1,000-record Swift-vtable pass retains 337 dispatch slots and 517
    relative pointers, with partial/unsupported layout coverage still explicit.
    This is bounded snapshot admission, not an RSS or complete-metadata claim.

39. **Chromium resource packs remain opaque.** Done (2026-11-02).
    New target-free `inspect_chromium_resources` /
    `rea inspect-chromium-resources` validates DataPack **v4/v5**, pages original
    numeric IDs/aliases with source ranges and hashes, and reads complete bounded
    selected stored or decoded content. Gzip and Chromium-envelope Brotli are
    supported; unknown filenames/MIME types are not invented. Defaults admit
    64 MiB files / 1 MiB selected payloads, with explicit 512 MiB / 8 MiB maxima.
    The public fixture journey verifies actual advertised schemas, CLI/MCP
    parity, aliases, UTF16/binary coexistence, corruption/size/overlap refusals,
    bounded decoding, recovery and stored-byte selection. Arc's main, scale and
    locale packs are positively decoded as v5: **5,414+382**, **319+68** and
    **12,470+2,215** canonical/alias counts respectively. Selected resource 205
    produces **8,038 decoded bytes**; original inventory and selected-content
    CLI/MCP Evidence both match exactly. This fixes a missing format primitive;
    the game archive reader correctly retains its separate advertised formats.
    Outer compressed pack wrappers and automatic resource-to-feature attribution
    remain outside the profile. See [guide](rea-local/docs/chromium-resources.md).

40. **Mutable URL bindings leave query keys as network candidates.** Done
    (2026-11-02); a receiver-provenance refinement, not a regression of item 30.
    The owning lexical receiver model now proves the narrow single-assignment
    URL/URLSearchParams try/catch initialization with an abrupt catch. Guard
    restrictions survive immutable aliases and are checked at each read;
    earlier uses and callable/class boundary crossings stay uncertain. Visible
    member/prototype writes, including writes in closures, still invalidate
    facts. Non-abrupt catches, finally, conditional initialization, reassignment,
    preinitialized bindings, shadowed constructors and unknown HTTP clients
    retain uncertainty. Eleven public source scenarios plus representative
    CLI/MCP parity pin those boundaries. Arc's unchanged three-script scope now
    emits **zero endpoint candidates**, while the retained fixture's real fetch
    remains recognized. That scoped result is not absence of Arc network traffic.

Items 38–40 share the [verification report](field-tests/arc-fixes-2026-11-02.md)
and durable complete Evidence under `field-tests/arc-fixes-2026-11-02/`.
The subsequent [fresh retest](field-tests/arc-retest-2026-11-02.md) confirms
their behavior after publication. Its maximum-budget Objective-C read recovers
871 class/metaclass records and 3,052 method implementations, with coverage
still partial; lower-budget empty class arrays are not absence claims. No new
numbered defect was reproduced, and full Arc feature recovery remains open.

41. **Offline HTML inline scripts have no analyzed source identity.** Done
    (2026-11-03); capability extension, not a regression of the
    documented external-script-link profile. The exact decoded Arc resource
    pages 14552 and 14565 contain inline JavaScript bodies, but the earlier offline
    JavaScript producer inventories their HTML without parsing those bodies.
    An owned **117-byte HTML / identical 68-byte JavaScript body** pair
    reproduces the boundary: HTML has zero parsed JavaScript files / AST nodes
    and no endpoint candidate, while the standalone body yields one parsed
    file / 12 nodes and the declared `/owned-inline-only` fetch candidate.
    Evidence `ev_a41c112f831dbe901885768eb338b7304ea2c54b60c072b4f08009f6857bf3c8`
    and `ev_7d8d352118848a4d7e1059e5c199d913f357cfe2186196b10828784cc3ba8820`
    is retained under `field-tests/arc-feature-followup-2026-11-02/resources/`.

    **Fix verified:** one prepared-source owner retains exact body identity,
    original HTML digest/inventory ID, UTF-16 ranges, classic/module kind and
    document base. Logical `rea-inline-script://` identities are not filesystem
    entries. Imports and source maps resolve from the document/base; bare
    browser specifiers and Node bindings retain uncertainty. Physical inventory
    and parsed-file counts stay separate from inline-source counts. The
    run-wide `max_inline_scripts` policy (CLI `--max-inline-scripts`) defaults
    to 1,000; omissions, parser failures and unsupported unterminated bodies
    stay visible in coverage and compact source-kind-aware statuses. Known HTML
    metadata survives both active and later-unexamined interruption paths.

    **Verification:** 166 tests / seven files, 15-call public fixture/legacy
    journey, exact default and zero-budget CLI/MCP parity, and a six-call real
    timeout/recovery journey (one expected timeout) verify the behavior.
    Actual Arc pages now retain **three bodies / 222 AST nodes / three complete
    module IRs**; 142 semantic source ranges map back to the exact decoded HTML.
    Four retained-parent feature traces remain partial at DOM/dynamic-value
    boundaries. Source/checks, docs, duplication (2.48%) and isolated package
    verification pass; full `check:pr` was not rerun. See the
    [report](field-tests/arc-feature-followup-2026-11-02.md).

42. **Static resilient Swift witness records are missing.** Done (2026-11-03).
    Validated resilient requirement/witness tails are now retained separately
    from runtime slots. Imported requirement flags, generic private storage and
    runtime instantiation remain unknown where unavailable. Exact indexed
    `swift_conformance_address` selection requires `facet: "swift-conformances"`
    and preserves selected scope, rather than raising the admission cap.
    Unbacked runtime control targets retain independently valid pairs with a
    partial limitation; malformed file-backed tails remain rejected. Arc's
    `BoostIDERequest` exposes executable address `0x100537e18`; CLI/MCP Evidence
    matches exactly. Owned source-built fixtures and selector negatives verify
    the behavior. See [final native receipts](field-tests/arc-continuation-2026-11-03/resilient/after/final/README.md).

43. **Decoded Chromium resource literal search is unavailable.** Done (2026-11-03).
    `search_chromium_resources` / `search-chromium-resources` shares the validated
    DataPack index and bounded decoder with selected inspection. Literal needle
    encoding is independent of payload text validity. First matches preserve
    exact decoded byte ranges/hashes, stored ranges and alias table identities.
    Canonical paging, match limits, skipped resources and charged/observed decode
    budgets expose partial coverage; blocked entries retain their cursor and
    continuation can pin the original pack digest. Lossless optional text ranges
    and surrogate-safe previews retain their own narrower authority. The owned
    compressed/binary pack and public CLI/MCP journey pass; four real Arc surveys
    each examine all 5,414 canonical payloads with zero skips. Three additional
    inert code bodies are authenticated and analyzed, without claiming original
    filenames or runtime use. See [resource findings](field-tests/arc-continuation-2026-11-03/resources/findings.md).

44. **JavaScript object return fields lose source provenance.** Done (2026-11-03).
    Optional per-return `fieldSources` reuse the owning static value evaluator,
    preserving last writes and spread/computed/getter/mutation/prototype
    invalidation. Existing graph identities link represented source reads to
    returned own fields and their aggregate, without equating input and output
    objects. Known return flow is 4 nodes / 3 resolved edges / 1 sink; both arrow
    forms and nested keys pass, while ten negative controls gain no false sink.
    Historical IR omission and exact imported legacy traces remain valid.
    Default ambiguous-edge filtering is unchanged. Fresh Arc analysis retains
    21 returned-field slots (16 in SelectorPicker), with DOM values unknown.
    See [public verification](field-tests/arc-continuation-2026-11-03/returns/after/findings.md).

45. **Returned own fields do not propagate through an exact local call result.** Done (2026-11-06).
    Confirmed offline capability gap (2026-11-03), beyond item 44's return-owned
    field projection. Owned fixture: `function known(){return {value:"owned-value"};}`
    followed by `const result=known(); const output=result.value; consume(output);`.
    REA+ retains the literal return field and resolved return-to-call relation,
    but the caller's result/value property remains unknown. A candidate-enabled
    backward trace from output has 2 nodes / 1 edge and no return-field/literal
    source (`ev_ec6c69ba88f8808cf2f8ebaaba61fce4bc4760c403ce24ed3c6ac3febeff424b`);
    the return-field forward trace stops at the result binding
    (`ev_83fbc363cbd1b5691b4097f7decefe5d01bddcb057bf8451b563dd36d5565580`).
    The original reproduction remains under
    `field-tests/arc-deepening-2026-11-03/script-activation/owned/`. The new
    optional `callResultFieldFlows` producer proves direct synchronous own-field
    dependencies while lexical lifetime and mutation ownership are available.
    It rejects unsupported aliases, reassignments, accessor/prototype returns,
    overlapping mutations and escapes; no general function interpreter or
    invented caller constant is introduced. The fresh default backward trace
    now has **5 nodes / 4 edges** and reaches the returned literal
    (`ev_78388b79d4c183b6619955b78c04def0ebc923504344428807a27113d43f60ee`).
    Public CLI/MCP parity and positive/negative cases pass. See the
    [DMG retest](field-tests/arc-retest-2026-11-06.md).

46. **Event registrations lack their locally resolvable handler continuation.** Done (2026-11-06).
    Confirmed offline capability gap (2026-11-03). An owned `node:events`
    EventEmitter, named local `receive` function, `.on("owned-event", receive)`
    and matching `.emit(...)` produce event/registration/dispatch candidates,
    but no listener-to-handler relation. Candidate-enabled listener-forward
    trace is 1 node / 0 edges
    (`ev_322778863d38b015f35d2b2d2c9da244bc410877e689a8c0c304c47811d3db3d`).
    New optional callback facts and `binds-handler` relations preserve exact
    local function/unchanged lexical-alias identity separately from event
    dispatch. Explicit Chrome Event and direct document/window DOM profiles
    retain their correct callback positions. Dynamic/reassigned/imported and
    spread-position handlers remain unknown; historical IR is unchanged.
    The owned listener trace is now **2 nodes / 1 edge**; fresh Arc analysis
    recovers five callback associations (one loose-script resize handler and
    four in decoded resource 15901). These are static associations, not observed
    event execution or argument forwarding. See the
    [DMG retest](field-tests/arc-retest-2026-11-06.md).

47. **Swift throwing calls can lose their error guard in decompiler-derived flow.** Done for the proved ARM64 synchronous profile (2026-11-06).
    Confirmed Ghidra integration/interpretation gap (2026-11-03), reproduced on
    an owned 318-byte Swift Decodable source compiled with installed Swift 6.3.3
    and never executed. The witness's machine assembly has
    `0xefc: cbz x21, 0xf3c`; its machine basic-block successors preserve failure
    `0xf00` and success `0xf3c`, with the output store only on success. Pseudocode
    instead warns that `0xf00` is unreachable and emits the output assignment
    after String decoding without the second error check. High p-code/effects
    omit the conditional at `0xefc` despite `truncated:false`.
    Evidence `ev_ed7af7ef81e435ae504cf6bfe8cb8aa37aaca115c22b3dd076dbf835f333343c`
    and the analogous Arc payload decoder
    `ev_5214eaaf9d918d2b0233b5dbe3016eda15db021c940ac5178300f6f32d47296b`
    are retained respectively under `field-tests/arc-deepening-2026-11-03/swift-error-abi/`
    and `field-tests/arc-deepening-2026-11-03/native/payload-decoder.evidence.json`.
    The reported convention was already `__swiftcall`. The confirmed cause is
    its preserved x21 effect across synchronous throwing calls. A private-Program
    convention clone changes only that effect for an original symbol whose own
    declaration's expanded function type proves synchronous throws. Nested
    callback/return/generic-constraint function types cannot qualify it. The
    callee effect remains valid across intervening cleanup calls; an immediate
    guard is not required. Parameters, return storage and user/caller overrides
    are preserved.
    Structured model adjustments and unproved control-flow uncertainties survive
    CLI/MCP and native-value tracing. Owned real-Ghidra positive, override and
    nonthrowing/callback/generic-context/async controls pass, with exact public
    CLI/MCP Evidence and a separate cleanup-before-check reproduction.
    Fresh Arc payload decoding retains both post-call guards at
    `0x1004cab40` and `0x1004cab58`
    (`ev_39a755888baca922cc1753faeac569382a8c07bdd49422ab83eb4e5168df11c2`).
    The command helper also retains `0x10053c7b0`, localized-error handling
    and its response path after JSONDecoder and cleanup calls
    (`ev_75d2743fbca847e8d5aecdb6bdeffe82d3704189e88213d57d400f013133031f`).
    Unproved local calls stay uncertain; other ABI/host profiles are unverified.
    `truncated:false` still describes retention, not semantic correctness. See
    [verification and DMG retest](field-tests/arc-retest-2026-11-06.md).

48. **DMG inventory succeeds while extraction rejects the same format.** Done (2026-11-06).
    The supplied Arc DMG reproduced `unsupported_target` / "Artifact format has
    no extraction reader: dmg" after successful read-only inventory. Extraction
    now reuses `NativeDmgArtifactReader`, verifies observed entry hashes and
    preserves mount/detach provenance and owned cleanup. The real source-built
    macOS bundle lane passes CLI/MCP extraction, identical file commitments,
    executable-byte checks, Applications-symlink exclusion and final detach.
    Arc DMG extraction verifies **1,113 regular files / 916,318,369 bytes**;
    its artifact session closes with verified empty descendants. Unsupported PKG
    refusal and cancellation remain covered. See the
    [DMG retest](field-tests/arc-retest-2026-11-06.md).

49. **Repeated return-field slot lookup is quadratic for wide returned objects.** Done (2026-11-06).
    Field projection repeatedly searched the same immutable container's entire
    slot array. Shared weakly owned indexes now perform each container scan
    once, preserving first-slot, absence, array-length and unknown semantics.
    The existing two 160,000-entry receiver-return cases pass under their
    original timeout. Their complete retained IR exceeds the inline MCP frame
    budget; the public test verifies that typed transport boundary, exports and
    authenticates the original parent, and compares full CLI/MCP Evidence.
    This supported transport stop is not counted as an additional product bug.

50. **Package verifier treats lifecycle diagnostics as an archive filename.** Done (2026-11-06).
    The final isolated package refresh reproduced `.git can't be found` from
    the prepare hook before npm's archive filename. The verifier treated all
    stdout as that filename and failed at `tar`, despite a successful pack.
    It now requests structured npm pack metadata with lifecycle output piped
    separately, validates exactly one archive basename and checks its existence.
    Lifecycle scripts still run; the existing real-pack isolation case now
    proves a noisy prepare hook executes while package validation reaches its
    intended failure and preserves the caller-owned archive. The complete
    isolated package lane is rerun afterward; this is a verification-tooling
    defect, separate from target-analysis correctness.

51. **Discover Swift conformances by protocol before spending decode admission.** Open capability gap (2026-11-06).
    `inspect_native_dispatch_metadata` selects a facet or one already-known
    conformance address, but cannot select a protocol/type and discover its
    conformances. Arc's 20,000-record conformance pass retains 1,435 rows and
    omits the needed `WebContentUIDelegate` and `SelectorPickerWebContents`
    conformances. Supplemental preparation over the complete 22,066-entry
    public index, accounting for distinct chained-pointer alias slots, found
    exact selectors at indices 6,632, 10,138 and 10,205. Public selected metadata
    then recovers `WebContentFrame`, `BoostsEditorWindowContent` and
    `WebContentsAdaptor`. Add protocol/type discovery at the owning metadata
    boundary, preserving observed index coverage, alias/import identities and
    unresolved records; filtering only after the same budget is spent would
    leave the admission problem. Do not infer global conformance absence from
    the existing partial overview. Captures:
    `field-tests/arc-dispatch-2026-11-06/`.

52. **Retain static generic/runtime-instantiated Swift witness templates.** Open capability gap (2026-11-06).
    Exact selected metadata identifies Arc's `WebContentsAdaptor` conformance
    to `SelectorPickerWebContents` and its shipped witness-template address,
    but emits no dispatch slots, reporting conditional/generic/resilient
    witness decoding as unsupported. Public bytes preserve an async descriptor
    and zoom-getter entry that require supplemental interpretation to select
    their code. The owned `GenericWitness.swift` reproduction also returns an
    `OwnedAdaptor: OwnedSurface` row with a template address and zero slots
    (`ev_583c14deb472b8cb44ecd03c46b9b563bf2229e3666451f9dbb0bf422ac920f4`).
    Preserve shipped template entries separately from instantiated runtime
    witness tables, including conditional requirements, holes, async-descriptor
    locations and uncertainty. This extends item 42's static resilient-record
    support; it must not invent runtime slot population or concrete instances.
    Owned source, compiler/input hashes and public CLI Evidence are retained
    under `field-tests/arc-dispatch-2026-11-06/owned/`; its library was not run.

53. **Report explicit Ghidra disk exhaustion as a capacity failure.** Open diagnostics gap (2026-11-06).
    The Arc evaluator binding failed while Ghidra wrote its temporary database.
    Retained diagnostics explicitly contain `java.io.IOException: No space left
    on device`, but the public result is generic `execution_failure` with
    "Retry once" remediation. Preserve the underlying diagnostic and classify
    positively identified disk exhaustion as a resource/capacity condition;
    name freeing workspace space or reducing analysis demand as the remedy,
    without suggesting an unchanged retry will repair it or marking it
    automatically retryable. Unidentified failures must retain their uncertainty.
    The failed binding closed with verified empty descendants. The follow-up
    uses a fresh explicit 15-second profile and the same established seeds,
    rather than repeating the same 60-second resource demand. Capture:
    `field-tests/arc-dispatch-2026-11-06/evaluator/selector-evaluator-main-actor.reply.json`.
