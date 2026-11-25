# Open tasks

Open work on `main` following PR #1 and the field tests.

## Status

- **Intel HEX / S-record integrated (2026-11-25, item 62 partial):** Root
  carriers expose sparse decoded regions, checksums, overlaps, header/start/
  termination facts and verified extraction through existing artifact tools.
  Address metadata is separate from carrier-file offsets; caller budgets have
  typed resource refusals. Shared target-format schemas, stable reader ownership,
  declaration scope and observed-hash provenance are repaired. 82 selected tests,
  43 final MCP calls (six expected refusals), three complete CLI/MCP pairs and
  32 historical snapshots and package/check/docs gates qualify this slice. Arc's complete reducer Evidence
  is unchanged. UF2/DfuSe and the other firmware/CPU groups remain open. See
  [qualification](field-tests/upstream-hex-records-2026-11-25.md).

- **File-backed native decompilation integrated (2026-11-25, item 62 partial):**
  decompile_all / CLI decompile-all write per-function pseudocode and return a
  compact manifest/index. Resume binds target/provider/profile, verifies stored
  hashes and preserves conflicts/history. Transient reads avoid retaining all
  bodies; session cleanup and known metadata-mutation guards preserve ownership
  and context. 50 selected tests, 18 real Ghidra MCP calls (one expected refusal),
  two exact CLI/MCP pairs, 31 historical snapshots and package/check/docs gates
  qualify the slice. Arc's 63,696-code-unit pseudocode and complete 10,072-byte /
  2,518-instruction reducer match prior observations. Full Arc and the separately
  listed integration groups remain open. See
  [qualification](field-tests/upstream-decompile-export-2026-11-25.md).

- **Analyzed-memory byte search integrated (2026-11-25, item 62 partial):**
  Ghidra search_bytes / CLI search-bytes support masks, inclusive bounds,
  overlapping hits, coverage, exclusions and bound continuations. Shared native
  file mapping now refuses auxiliary-source offsets while preserving genuine
  zero. Native bridge ENOSPC now has a machine capacity code and actionable disk
  error. 90 selected tests, ten Java producer controls, seven CLI/MCP Evidence
  pairs and package checks qualify this slice. Arc's complete reducer result is
  unchanged (10,072 bytes / 2,518 instructions) under a new bridge profile.
  The observed disk failures, cleanup and successful release checks are recorded
  in [qualification](field-tests/upstream-byte-search-2026-11-24.md).

- **Native relationship/context views integrated (2026-11-24, item 62 partial):**
  Six native observation families now support retained pages and separate source
  overview/profile/caveat views. Four primitive tools and call graphs add summary
  delivery; CLI shares portable complete parents. Fixed interrupted graph
  admission and retained its prefix/caveats; corrected stale CLI coverage metadata
  and rejected misplaced CLI delivery settings. 101 selected tests, public Ghidra
  controls, seven CLI/MCP Evidence pairs and package checks qualify this slice.
  Arc's 70 callees reconstruct through continuation and its exact 10,072-byte /
  2,518-instruction reducer Evidence is unchanged. See
  [qualification](field-tests/upstream-native-observations-2026-11-24.md).

- **Native inventory/batch retained delivery integrated (2026-11-24, item 62 partial):**
  Five inventory/search tools and explicit decompilation batches now support
  complete/summary delivery and stable pages through CLI/MCP. Null pseudocode,
  duplicate selectors, per-item caveats and interrupted-prefix facts remain
  distinct. The package verifier now handles intentional tracked deletions.
  134 selected tests pass; 47 qualified MCP calls, six exact CLI/MCP Evidence
  pairs, package checks and 28 historical snapshots qualify the slice. Arc
  retains 11,330 observed procedure rows and its unchanged 10,072-byte /
  2,518-instruction reducer; 63,696 pseudocode units reconstruct from 16 pages.
  See [the report](field-tests/upstream-native-pages-2026-11-24.md).

- **Owned Ghidra checkpoints integrated (2026-11-24, item 62 partial):**
  Opt-in native Linux/macOS sessions preserve seeded analysis and acknowledged
  metadata edits through verified packed-Program restores. Arc's cold/warm
  reducer results match exactly (10,072 bytes / 2,518 instructions), retaining
  the original partial-analysis flag and one-second budget. Publication-failure
  cache handling, write diagnostics and absent-root path aliases are repaired.
  175 tests pass with one platform skip; final public MCP controls, two exact
  CLI/MCP Evidence pairs, package checks and 27 historical snapshots qualify.
  Extensions/special loaders/Windows, automatic retirement refresh and stale-lock
  recovery remain outside this qualified slice. See
  [the checkpoint report](field-tests/upstream-ghidra-checkpoints-2026-11-24.md).

- **Upstream saved-project inspection integrated (2026-11-24, item 62 partial):**
  REA+ opens a content-verified private copy selected by `.gpr` and exact root
  Program; original analysis state remains unknown and analyst edits are
  unavailable. Wrong, unavailable and changed identity refusals are qualified.
  The seeded Arc reducer still returns its 10,072-byte body / 2,518 instructions.
  Owned checkpoint publication is qualified separately above. See
  [the saved-project report](field-tests/upstream-ghidra-projects-2026-11-24.md).

- **Arc selected-file sidebar restore traced (2026-11-24):**
  The selected RestoreSidebarDataFlow worker reads a RestorableFile URL,
  attempts to clear the current StorableWindows collection, clears the
  restored sidebar's sidebarSyncState and requests a sidebar save. Its Boolean
  follows backup-data presence; caught write errors do not make it false.
  Windows offsets/49-byte size and both store model identities are verified.
  308 MCP calls (304 successful), 246 instruction-byte checks, two exact
  CLI/MCP pairs and 24 historical snapshots qualify the finding. A field
  recorder's null schema diagnostic was fixed and checked with a zero-call
  rejection control. Product code is unchanged. The generic automatic backup
  helper's higher consumer, actual I/O/durability and item 63 remain open.
  See [the checkpoint](field-tests/arc-restore-consumer-2026-11-24.md).

- **Arc bucket removal and default backend policy checked (2026-11-24, item 63 partial):**
  The selected removal helper repairs its probe cluster and clears the final
  hole; ten supplied-hash and four isolated Arc/C pairs agree. An occupied-next
  control stops before the runtime helper. The default storage constructor
  selects Memory for `ARC_UI_TESTS == "1"`, the cached XCTest predicate or
  `ARC_E2E_TESTS == "1"`; otherwise it selects Firebase. Getter wrapper/async
  return joins are checked, and stale callback frontier notes are corrected.
  420 MCP attempts (416 successful), 29 emulations, four exact CLI/MCP pairs,
  213 instruction-byte checks and 23 historical snapshots verify. A caller's
  omitted unlisted-decode option was corrected with preserved captures; no
  product defect was found. Actual selection, typed invocation mapping and
  persistence/durability remain open. See
  [the checkpoint](field-tests/arc-removal-persistence-2026-11-24.md).

- **Arc cache/context and local ownership checked (2026-11-24, item 63 partial):**
  Cache comparison uses the 64-bit key identity plus context byte; live/test
  entries stay distinct even across hash collisions. Seven bounded Arc/C probe
  pairs match; a malformed full table hits the declared limit. The VWT copy
  reproduces all 368 bytes before its first external retain, and source binds
  the worker's retain/destroy/call/release sequence under normal Swift ABI/ARC.
  Actual returned Client, earlier instance relations and typed invocation
  mapping remain open at unknown revision 3. 237 MCP attempts (232 successful),
  four full CLI/MCP pairs, two standalone copy replays, 22 historical snapshots
  and unchanged runtime/source hashes verify. No new product defect was found.
  See [the checkpoint](field-tests/arc-cache-selection-2026-11-24.md).


- **Blob text and CLI decoder defects repaired (2026-11-23, items 73–74):**
  Declared CBOR/MessagePack UTF-8 controls survive tree/strings views, while
  malformed UTF-8 and untyped bytes retain their earlier representation.
  `--blob-format` now selects the CLI decoder independently of global output
  `--format`; MCP's `format` input is unchanged. Owned and original Arc
  retests, 17 passing boundary tests (four optional checks skipped), four exact
  CLI/MCP pairs, source/runtime/history and build/fast/docs/package checks
  qualify the repair. Failed harness attempts remain intact. See
  [the repair checkpoint](field-tests/blob-text-controls-2026-11-23.md).


- **Arc suite/context/store producers advanced (2026-11-23, item 63 partial):**
  The suite suffix is a wrapping 64-bit UTF-8 hash seeded at 5381 with multiplier
  33, described as UInt64. Seven bounded Arc/C replay pairs agree. The custom
  directory/suite gate tests bundle-ID prefix `company.thebrowser.dia`, falling
  back to `__CFBundleIdentifier` only without a bundle ID; the original Arc
  identifier does not match. XCTest markers, executable-name/extension and
  current-test fallback are traced. Generic storage has explicit insert/replace
  paths; incoming setter references remain despite no direct callers in the
  bounded Program. Actual Client choice stays open at unknown revision 2.
  796 attempts (ten unlisted-procedure errors), four CLI/MCP pairs, 1,114 main
  bundle records, 20 historical snapshots and empty lineages verify. A typed
  blob-text defect discovered during verification is item 73. See
  [the checkpoint](field-tests/arc-client-producers-2026-11-23.md).


- **Arc dependency/default policy advanced (2026-11-23, item 63 partial):**
  The observed scope selects NavigationIDPathKey with Value NavigationIDPath,
  separate from the Client key. Native observations support current-over-captured
  storage merge under ordinary copy/dictionary semantics, explicit context
  override/fallback rules, and different default bool behavior: live/preview
  copy the global Client; the test-default first closure returns false without
  the table. Global preferences select an optional suite attempt or standard
  defaults; the gated custom suite prefix is `com.dia.instance.`. Actual Client
  code/context remains an explicit open REA+ unknown. 337 attempts (two unlisted
  procedure errors), two exact CLI/MCP pairs, 335 exported records, unchanged
  frozen source/runtime and 19 historical snapshots verify. No new product
  defect or runtime observation is claimed. See
  [the policy checkpoint](field-tests/arc-dependency-policy-2026-11-23.md).

- **Arc selected helper outputs replayed (2026-11-23, item 63 partial):**
  Bounded REA+ emulation now reaches the helper's outer return for inputs 49
  and 50, with source-bound literal reads confirming the associated
  `hasDismissedBoostsInterstitial` and `hasDismissedJSWarningBanner` bytes.
  Two source-owned controls return their expected values. The initial code-range
  escapes are retained; explicit shared-tail mappings complete the replays.
  13 successful public MCP calls, four exact CLI/MCP Evidence pairs, unchanged
  frozen code/source hashes, 18 historical snapshots and empty lineages verify.
  This does not resolve actual BLR X23 callee/Client selection, preference I/O,
  or full Arc analysis. See [the replay checkpoint](field-tests/arc-dispatch-replay-2026-11-23.md).

- **Arc selected-index dispatch primitive verified (2026-11-23, item 63 partial):**
  New `inspect_native_table_dispatch` derives explicit halfword-table targets
  with source bytes/hash and optional conditional direct-call singleton,
  without CFG mutation or a typed/global input bound. Arc indices 49/50 now
  return `0x1005ab4e8` / `0x1005aa834` through public Evidence. The actual
  BLR X23 retains X0=49 but no callee link; typed invocation proof, active
  Client selection and instance stability stay open. File-cap remediation
  caught during qualification now names `max_file_bytes` truthfully. 25 affected
  tests, 14 final MCP calls (two expected errors), seven exact CLI/MCP pairs,
  frozen-runtime/history checks and package verification pass. See
  [the checkpoint](field-tests/arc-table-dispatch-2026-11-23.md).

- **Arc constructed-child / projection route advanced (2026-11-23, item 63):**
  The wrapper's keypath output word, indirect X8 projection ABI, dynamic
  _IfLetReducer child field, dependency-writing scope and exact final Root
  witness dispatch now have source-bound checks. The route is conditional on
  valid typed storage/copies, branch predicates and entry into the stored
  scope callback. Actual TaskLocal/default Client selection and a typed
  invocation-only mapping remain open; the selected-index primitive is now
  implemented in the newer checkpoint above. 117 successful public calls,
  two exact CLI/MCP pairs and sixteen historical snapshots verify on the unchanged
  item 72 runtime. One disk-failed capture is preserved; after space was freed,
  full-image retry succeeded. See [the checkpoint](field-tests/arc-instance-flow-2026-11-23.md).

- **Arc generic member templates, item 72 done (2026-11-23):** The selected
  wrapper's keyPath now retains exact DependencyValues and owner-parameter
  identities plus the unresolved external import. Joining the exact Root
  application gives a checked analyst declaration substitution to
  UserDefaultsClient. 88 source tests, 41 final public MCP calls plus 18
  baseline, four exact CLI/MCP pairs and build/fast/docs/package checks pass.
  Actual captured-instance/field stability and item 63's invocation mapping
  remain open. See [the checkpoint](field-tests/arc-member-templates-2026-11-23.md).

- **Arc allocator ABI repair, item 68 done (2026-11-23):** Exact supported
  libswiftCore allocation calls now preserve their C-ABI X0 return instead of
  reusing the metadata argument in pseudocode. All 23 Arc constructor results
  are corrected. Wrong-library/local namesakes, explicit signatures/overrides
  and analyst-created external labels retain their authority; memory effects
  remain unknown. 86 source tests, 28 final public replies, five exact CLI/MCP
  pairs, six boundary probes and build/fast/docs/package checks pass, alongside
  the final Swift error-model lane. Item 63 now binds the captured reducer
  layout and `_userDefaultsClient` at byte offset 480; keypath/default selection
  and actual closure origin remain open. See the
  [repair and origin checkpoint](field-tests/arc-invocation-origin-2026-11-23.md).

- **Arc selected closure call, item 63 partial (2026-11-22):** REA+ now retains
  conditional AArch64 call-preparation constants with exact source words.
  The actual call at `0x1012ab840` sets X0=49; exact enum alignment 2 excludes
  indirect pointer passing under the stated valid normal typed-closure
  premises. Field stability and selected code/context origin remain open.
  Two defects caught during qualification (vector-lane scalar confusion and
  ORR alias omission) are fixed, with failed captures preserved. 20 native
  controls, 85 source tests, 67 final public calls, five exact CLI/MCP pairs
  and build/fast/docs/package checks pass. Reducer mappings/body are unchanged.
  See the [call and origin checkpoint](field-tests/arc-closure-origin-2026-11-22.md).

- **Arc static Client layout / ABI boundary, item 63 partial (2026-11-22):**
  Exact metadata binding now recovers all 23 physical field offsets and the
  VWT copy identity. The selected wrapper provides a conditional typed source
  anchor. Owned compiler controls expose direct versus indirect argument
  passing for the same reflected closure shape, so ABI lowering remains
  unresolved pending selected-context proof. 136 tests, 41 public calls
  (39 successful/two expected invalid requests), three exact CLI comparisons
  and build/fast/docs/package checks pass; lineages are empty. See the
  [checkpoint](field-tests/arc-closure-abi-2026-11-22.md).

- **Selected Swift field types, item 63 partial (2026-11-22):** The existing
  metadata tool now binds Arc's complete supported `boolForSetting` declaration
  to its exact 297-case enum. Shared-code typed/raw/foreign-owner controls stay
  distinct. All 23 field records are retained; nineteen field types remain
  unsupported. Qualified CLI/MCP Evidence, explicit negative/error coverage,
  124 affected source tests and cleanup pass. Native ABI lowering, typed
  buffer/field offset, code/context origin and per-invocation dispatch remain
  open; no helper-global CFG bound is installed. See the
  [field-type checkpoint](field-tests/arc-field-types-2026-11-22.md).

- **Static Swift witness data, item 64 (2026-11-21):** Implemented and
  qualified on unchanged Arc bytes. Inherited protocol and associated-type
  data retain typed identity/provenance separately from executable targets;
  unsupported representations stay partial. **92 source tests**, fast/build/
  docs/package checks, **40/40 public MCP replies**, two exact CLI/MCP cases
  and the existing ten-variant compiler lane pass. All owned verification
  lineages are empty. Arc's `Value = UserDefaultsClient` is now explicit;
  getter signature/closure provenance and item 63 recovery remain open. See
  [the repair and retest](field-tests/arc-witness-data-2026-11-21.md).

- **Arc editor/JS/local-store follow-up (2026-11-21):** The selected editor
  now reaches `createBoost`, `setBoostData` and preview effects. Getter decoding
  proves the stored-active/local-ID/nonblank-JS gate. New local insertion
  performs an inactive-copy merge, then an original-model merge on first
  success; both primary error paths are traced. The selected local store
  reaches queued JSON read/write and temporary-file replacement code. **352
  successful replies / two retained admission errors**, five verified empty
  owned lineages. One field-test plan stopped on a duplicate label; all replies
  and the failed status are retained. Production source is unchanged. Exact
  store location, policy/readback and broader Arc remain open. See the
  [findings and verification](field-tests/arc-callbacks-2026-11-21.md).

- **Arc-focused upstream retention, item 62 (2026-11-20):** First bounded
  slice implemented and verified. Native function summaries retain complete
  Evidence and expose existing selected pages; the CLI saves a new portable
  full bundle before summary delivery. **44 focused tests**, fast/docs/package
  checks, **37/37 real Arc MCP calls** and a fresh CLI case pass with empty
  owned lineage. The 31,084-byte MCP summary points to the exact saved full
  Arc record: all 28 mappings and 10,072 body bytes remain unchanged. Baseline
  research is saved/pushed as `d62dd2f4f` and tag
  `arc-baseline-before-upstream-2026-11-20`. Program persistence remains open:
  upstream's stock checkpoint profile rejects the seeds/extensions our Arc
  workflow requires. The same pass observes all 21 `BoostsEditor.State` stored
  names. See the [update and retest](field-tests/arc-upstream-retained-2026-11-20.md).

- **Cleanup history across attempts, item 58 (2026-11-14):** Fixed and verified.
  Review reproduced a false successful second close after an incomplete stop:
  the launcher exits and a detached, unreadable child is forgotten. The repair
  gives each launch one cleanup capability shared by rollback and later stops;
  it retains candidate groups and original identities, with fresh ownership
  checks before every signal. The final consumer matrix passes **132 tests / three
  platform skips across 12 files**, including both real owned-process rollback
  cases and six normalized custom-launch consumers. A fresh Arc session passes
  **15/15 calls**, two successful closes and verified empty owned lineage. Fast,
  built-doc and package checks pass. Published in **`076c706c6`**. Item 57 covers
  settlement within one attempt. See the
  [ownership repair/retest](field-tests/arc-cleanup-history-2026-11-13.md).
- **Radare2 startup rollback ownership, item 59 (2026-11-14):** Fixed and verified.
  The pipe waits for its startup NUL before returning its handle. If startup
  fails and its internal stop is incomplete, the client never receives that
  handle and can delete the private root. Acquisition now transfers ownership
  before protocol readiness is awaited. The owned-Node regression fails before
  the repair and passes afterward, including repeated failed close and eventual
  verified removal. Included in **`076c706c6`** and the same final consumer matrix.
- **Provider cleanup settlement, item 57 (2026-11-13):** Done within the owned
  single-attempt stop-deadline profile. The supervisor's existing grace now funds token
  settlement, sweeps and exit waits through one retained cleanup plan; group
  membership is revalidated before signaling. **91 source tests / one Linux
  skip**, **70 boundary tests / one Windows skip**, and **20/20 real Arc calls
  across three cleanly closed sessions** pass. Uncertainty within that attempt
  remains incomplete; item 58 repairs retention across attempts. Published in
  **`72fcdbe8c`**. See the
  [cleanup report](field-tests/arc-cleanup-settlement-2026-11-09.md).
- **Selected Swift vtable admission, item 56 (2026-11-09):** Done within the
  static indexed-class profile. Exact `swift_class_address` / CLI
  `--swift-class-address` selection scans the type index before class decode
  admission, preserving indirect aliases, unresolved identities and shared
  budgets. Requested Swift index spans are validated before enumeration.
  **151 source cases / seven files**, **17 MCP calls (13 successes / four
  expected rejections)** and **nine CLI/MCP comparisons** pass. Arc's selected
  hover class returns 17 rows with two resolved targets; unsupported rows and
  runtime dispatch remain unproved. See item 56 and the
  [repair/retest report](field-tests/arc-selector-rendering-2026-11-09.md).
  Implementation published in **`8a5efd668`**.
- **Arc native registration and consolidated analysis (2026-11-09):** New
  fixed-build getter observations confirm `boostId`, `type`, `data`, `contents`.
  Native loaded pointers associate the three selected extension filenames with
  resources 15865, 15866 and 15901. The internal-extension route now reaches
  override-aware manifest supply, first placeholder replacement, parsing,
  registration checks and a conditional activation handoff. The final Core
  session completes **15/15 public calls**, exports and closes cleanly;
  44 canonical Evidence records and five bundles authenticate. Runtime
  activation and Google Docs registration remain unobserved. See the
  [Core report](field-tests/arc-core-loader-2026-11-08.md),
  [reducer/persistence pass](field-tests/arc-persistence-routes-2026-11-08.md)
  and [feature coverage dossier](field-tests/arc-analysis-dossier-2026-11-08.md).
- **Ghidra seed-file diagnostics, item 54 (2026-11-08):** Fixed. Missing,
  unresolvable, non-regular and oversized selected seed files now produce
  actionable `configuration_invalid` errors preserving the selected path and
  `REA_GHIDRA_SEED_FILE`; permission, disk-capacity and incidental failures
  retain their distinct classifications. **29 source checks** and **three real
  CLI/MCP comparisons**, including Arc, pass. Published to WIP `main` in
  **`a74006bbe`**, with the remote SHA checked on 2026-11-09. See the
  [repair report](field-tests/arc-seed-diagnostics-2026-11-08.md).
- **Swift reducer dispatch, item 55 (2026-11-15):** Implemented and verified
  within the conditional v9 typed-snapshot/ABI profile. All **102 real native
  cases (15 positives / 87 rejections)** and **13 CLI/MCP comparisons** pass.
  Arc now returns **28 exact switch targets and a contiguous 10,072-byte body**,
  replacing the earlier 2,024-byte partial body. All targets agree with the
  independently captured table and are instruction-covered. Preceding copy
  ownership, actual runtime binding, case effects and app-wide behavior remain
  separate questions. Item 60 repairs import admission; item 61 restores the
  complete inline response without dropping proof or raising its limit.
  Implementation is published in `70d5dd7d1`; supporting notes/captures are included in the pre-upstream research checkpoint. See the
  [proof and retest](field-tests/arc-dynamic-snapshot-2026-11-15.md).
- **Arc selector follow-up (2026-11-15):** The selected native path now
  connects an installed flipped AppKit tracking view, local/normalized mouse
  coordinates, point filtering, DOM queries, forward rectangle scaling and
  SwiftUI gradient/candidate drawing. Setup/update/teardown, exact tracking
  flags and the five-attempt rectangle retry are traced. Separate S01–S30
  anchors extend the historical 88-anchor dossier; they are not a claim of
  complete Arc coverage. Tap candidate-response selection remains queued for
  the next v9 Arc retest. Page/world identity, live viewport mapping,
  persistence and broader features remain open. See the
  [dossier](field-tests/arc-analysis-dossier-2026-11-08.md).
- **Arc store handoff and editor lifecycle (2026-11-08):** Offline tracing now
  connects the editor's `_viewStore` initialization to its installed send
  closure and captured store-send routine. The concrete stored witness target
  remains unresolved; high-pcode truncation and a bounded value trace are
  explicit. Editor CSS/JavaScript URL selection, a conditional cache-release
  path and the separate Combine notification pipeline are recovered. **77
  public calls / 73 successes**, 48 authenticated Evidence records, 9 bundles,
  19 finding checks and eight cleanly closed sessions verify this pass. No new
  product defect is established; concrete reducer effects, persistence and
  broader Arc behavior remain open. See the
  [store/lifecycle report](field-tests/arc-command-effects-2026-11-08.md).
- **Ghidra disk-capacity diagnostics, item 53 (2026-11-08):** Fixed. Confirmed
  local `ENOSPC` or supported startup Java disk-exhaustion exceptions now return
  `resource_constraint`, resource `disk`, and `retryable: false`, preserving the
  original diagnostics and public/provider operation names. The retained real
  Arc failure reprojects correctly with identical diagnostics/profile identity;
  a fresh real-Ghidra one-second partial profile returns 89 evaluator
  instructions and closes cleanly. SDK CLI/MCP and worker-boundary checks pass.
  Arc's recorded tool gaps **38–53 are addressed within their documented
  profiles**; broader feature/design recovery remains incomplete. See the
  [repair/retest report](field-tests/arc-disk-diagnostics-2026-11-08.md).
- **Swift witness templates, item 52 (2026-11-08):** Fixed within the documented
  static metadata scope and retested on Arc 1.172.1. `swift_witness_templates`
  preserves shipped words, holes, conditional/pack metadata, generic controls
  and async-descriptor locations separately from runtime dispatch slots. Arc's
  adaptor now returns its four-word pattern and three entries; private runtime
  storage remains explicitly unobserved/partial. Owned generic and conditional
  Swift fixtures, including stripped binaries, pass real CLI/MCP checks.
  Item 53 is subsequently fixed above. See the
  [repair/retest report](field-tests/arc-witness-templates-2026-11-08.md).
- **Swift conformance discovery, item 51 (2026-11-08):** Fixed and retested on
  the supplied Arc 1.172.1 DMG. Exact protocol/type name filters scan all 22,066
  index entries before matching decode admission, recovering both UI delegates,
  the selector adaptor and the editor's four local conformances without manual
  descriptor preparation. Six compiled CLI/MCP comparisons agree; imported or
  malformed requested identities remain unresolved, and omitted matches/records
  retain explicit budget accounting. Item 52 is subsequently fixed above;
  item 53 is now fixed above. See the
  [repair/retest report](field-tests/arc-conformance-discovery-2026-11-08.md).
- **Arc delegate/evaluator follow-up (2026-11-06, continued 2026-11-08):** On the fixed 1.172.1 DMG,
  selected public metadata identifies `BoostsEditorWindowContent` as the
  substantive Boost-command delegate and `WebContentFrame`'s corresponding
  slot as a four-byte return stub. The editor's lazy web-content creation path
  installs its delegate witness; command handling reaches its captured dispatch
  closure. Selector evaluation now has the concrete `WebContentsAdaptor` /
  `SelectorPickerWebContents` identity, a main-actor/callback route to
  `executeJavascript:reason:completion:`, and a fixed-version String/JSON
  return continuation. The separate async DevTools route is distinguished.
  Capability
  gaps **51–52** recorded the missing protocol-scoped discovery and generic
  witness-template observations; the latter has an owned source-built
  CLI/MCP reproduction. Items 51–53 are subsequently fixed above, including the
  misleading disk-capacity diagnostics recorded by 53.
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
   - **Implementation checkpoint (2026-11-15):** `5628ef81ce5144c9af3bdc11b1e3647a9035c368`
     is pushed; its identity was checked against WIP `main` by direct SSH.
     The later documentation/evidence checkpoint `325702b06` is also pushed.
     The implementation includes class selection `8a5efd668`, bounded
     Swift dispatch `f2cdb96ba`, single-attempt settlement `72fcdbe8c`, retained
     cleanup/startup ownership `076c706c6`, supporting captures `72cccedec`,
     and bounded Darwin probe effects `5628ef81c`. The dynamic-snapshot
     implementation is published in `70d5dd7d1`. Follow-up notes and retained
     text captures are saved in the 2026-11-20 pre-upstream research checkpoint.
     The supplied DMG, compiled probes, provider projects and two large Rize
     JSONs remain local. Item 55's exact Arc projection and broader feature
     recovery stay open.
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
     36–37, 16 and 38–53; their focused and real-provider
     verification is recorded below.

   **Remaining work:** item 12 (Consensus HAR), optional item 13 (Consensus
   telemetry/anonymous MCP research), item 14 (WHOOP device/live evidence; see
   `Whoop/WHOOP_TASKS.md`). Item 16's initial profile is done. HeyClicky's
   tool gaps 30–37 are fixed, while its broader feature/design investigation
   remains incomplete; the [dossier's feature checklist](field-tests/heyclicky-analysis-dossier-2026-10-29.md#feature-checklist)
   records the remaining tracing and runtime questions. Rize's admitted offline
   engineering scope (17–29) is complete with the documented dynamic/coverage
   limits; those limits do not establish full runtime understanding. Arc's
   tool gaps 38–54 and 56 are done within their documented profiles. Item 55
   remains in progress. Its broader
   feature/design investigation remains incomplete. The latest
   [store/lifecycle follow-up](field-tests/arc-command-effects-2026-11-08.md#verification-issues-and-next-questions)
   narrows the command route to the captured store's unresolved witness call.
   Concrete reducer installation/effects, internal CSS/JavaScript URL handlers,
   overlay coordinates/rendering, bootstrap/injection, extension loading and
   Boost state/persistence remain open research questions.

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

51. **Discover Swift conformances by protocol before spending decode admission.** Done (2026-11-08), within the documented static metadata profile.
    `swift_conformance_filter` now accepts exact local `protocol_name` and/or
    `type_name` constraints (ANDed); CLI exposes `--swift-protocol-name` and
    `--swift-type-name`. Discovery scans the full index before admitting matching
    decodes, resolving all indirect aliases through the existing fixup reader.
    Counts distinguish examined index entries, matches, admitted decodes and
    unresolved identities. Known matches receive admission before bounded
    uncertain records, whose relative pointers retain alias/import evidence.
    Aggregate record limits include those records and their pointers. Exact
    address/filter conflicts and other facets are rejected; unavailable binary
    discovery cannot silently fall back to names. Imported metadata names and
    unsupported layouts remain unknown, and local names do not establish module
    uniqueness. Six Arc compiled CLI/MCP comparisons recover the two delegates,
    adaptor and four editor conformances; a 16-record query retains two matches
    versus one admitted decode. Owned stripped Swift verification exercises
    protocol/type/intersection/imported-type/negative queries and advertised
    schemas. Details and captures:
    `field-tests/arc-conformance-discovery-2026-11-08.md`.

    Original reproduction (2026-11-06):
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

52. **Retain static generic/runtime-instantiated Swift witness templates.** Done (2026-11-08), within the documented static metadata profile.
    `swift_witness_templates` now retains pattern/control addresses, bounded
    template extent, raw words, holes, available requirement flags, pointer/bind
    identities, conditional requirement/pack records and async-descriptor
    locations. Generic control copy size or a local stable protocol bounds the
    pattern; unknown/resilient ordering is not guessed. Shared conformance-tail
    parsing handles checked retroactive/conditional/pack prefixes and preserves
    resilient pairs without decoding the same control pointers twice. Headers,
    entries, conditions, packs and pointers share `max_records`; missing context,
    malformed spans, unknown flags and omitted records remain partial. Templates
    do not populate runtime dispatch slots, and no condition or instantiator is
    evaluated. Arc retesting recovers the adaptor's hole, async descriptor
    `0x10378c758` and synchronous target `0x1012fa5e0`; private storage remains
    unobserved. The unchanged original owned fixture now returns two entries
    within its three-word pattern, and real generic/conditional stripped Swift
    fixtures pass CLI/MCP checks. Async/coroutine execution and actual runtime
    tables remain outside this static capability. Details:
    `field-tests/arc-witness-templates-2026-11-08.md`.

    Original reproduction (2026-11-06):
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

53. **Report explicit Ghidra disk exhaustion as a capacity failure.** Done (2026-11-08), for the documented diagnostic forms.
    The provider recognizes current structured `ENOSPC` and supported complete
    Java capacity exception lines during startup. It returns
    `resource_constraint` / resource `disk`, preserves bounded token-redacted
    diagnostics and truncation markers, and keeps `retryable: false`.
    Remediation names restoring the runtime/project volume's capacity and the
    optional `REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS` demand knob, explaining its
    import-storage limitation and that unchanged conditions can reproduce the
    failure. No free-space amount or quota is invented. Ambiguous I/O text,
    quoted target strings and stale remote-operation logs are not reclassified;
    cancellation and incomplete cleanup retain their semantics. Resource kinds
    now have one canonical definition shared with the JavaScript worker wire
    schema. Source, SDK error and real worker checks pass. The complete retained
    Arc failure reprojects with the same diagnostics/profile; a fresh real
    Ghidra bounded healthy run returns 89 instructions across the evaluator's
    two observed body ranges and closes with verified empty descendants. No
    fresh disk-exhaustion event was induced. Details and captures:
    `field-tests/arc-disk-diagnostics-2026-11-08.md`.

    Original reproduction (2026-11-06):
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

54. **Classify invalid Ghidra seed-file selections as configuration errors.** Done (2026-11-08).
    The caller's failed seed preparation exposed generic `execution_failure`
    and unchanged-retry advice for a missing `REA_GHIDRA_SEED_FILE` path.
    Classification now belongs to the seed-file reader: missing/unresolvable,
    non-regular and oversized files use `configuration_invalid` with the exact
    selected path and setting guidance. Valid symlinks and commitment/snapshot
    checks remain supported; access denial, confirmed disk exhaustion and
    incidental failures remain distinct. **29 source cases** and **three real
    CLI/MCP comparisons** pass, including an owned C fixture and the unchanged
    Arc artifact. Source/typecheck/build/fast/built-doc checks pass. See
    [repair and receipts](field-tests/arc-seed-diagnostics-2026-11-08.md).

55. **Recover fixed-layout Swift enum dispatch from proved caller type.** Done within the conditional v9 profile (2026-11-15).
    Arc's `BoostsEditor: Reducer` witness at `0x1012a9870` reaches
    `0x1012a571c`, whose nested outlined tag getter is `0x1012b2860` and whose
    signed-word dispatch at `0x1012a5bc8` was originally unrecovered. The
    earlier observed body was 2,024 bytes across an 8,608-byte span. The v9
    retest now recovers all 28 targets and a contiguous 10,072-byte body;
    high-level case effects remain a separate analysis task.

    An owned fixed-layout `-Onone` nested reducer reproduces the omission:
    zero tables and zero of 24 known case callees, versus all 30 recovered for
    the existing resilient control. The optimized fixture also emits Arc's
    exact seven-instruction tag-helper shape but uses a byte table; that is a
    separate unsupported table profile. These controls establish a capability
    extension beyond item 37, not a regression of its supported case.

    A second owned enum with the same payload layout but a different empty-case
    count can share/fold its getter through a thunk. A helper signature, address
    or equal bytes therefore cannot establish the caller's enum identity/count.
    Recovery must bind the active outer enum case to its reflected payload
    type and prove complete representation provenance before assigning cases
    or growing function ownership. The existing lane proves a private-frame
    copy; the new snapshot lane instead names a recursively valid call-site
    value and stable checked window as explicit premises. Preserve ambiguity
    and budgets;
    do not weaken the existing guards or guess a case count from tag bits.
    Sources, compiler records and public before/control captures are retained
    under `field-tests/arc-reducer-dispatch-probe-2026-11-08/`.

    Independent suffix prerequisites are repaired on 2026-11-09: a simple
    non-clobbering load between destination addition and `BR` now preserves
    the proven edge. Review also reproduced a false recovery when an external
    function jumps into that suffix; all known foreign entries into its
    instructions now reject recovery. Exact unchanged-fixture before/after
    captures verify both changes. The typed private-frame copy profile and its
    memory/lifetime/unknown-flow rejection controls are implemented. Final v7
    verification passes **44 cases / 176 MCP calls**, three exact CLI/MCP
    comparisons, source/fast/built-doc checks and package verification. These
    repairs do not yet establish Arc's dynamic-stack
    copy and inline SIMD projection. See
    [suffix and foreign-entry report](field-tests/arc-dispatch-load-2026-11-09.md).

    The follow-up owned probe now reproduces a second-argument action, dynamic
    outer storage, 156-byte SIMD projection and a shared getter for 28/29-case
    child types. Four exact native helpers are retained: the copy wrapper
    forwards VWT `initializeWithCopy`, while outer metadata uses the existing
    cached/shared accessor shape. A conditional byte audit covers all 156 bytes
    and rejects eight altered controls. Those supplemental checks are not
    public recovery. Required residuals include a typed snapshot/copy-effect
    rule, complete extent/disjointness and byte-origin proofs. The bounded
    Darwin stack-probe integration is now verified separately below. See
    [proof obligations and probe](field-tests/arc-dynamic-projection-2026-11-13/design.md).
    The selected installed ARM64 stack-probe body is now confirmed through
    public REA+: **108 bytes / 27 instructions / nine blocks**, matching an
    independent local byte proof. Normal-return X2/X8/X12/SP preservation is
    established for that image; Arc runtime binding remains a separate
    obligation. See
    [dependency verification](field-tests/arc-dynamic-projection-2026-11-13/stackprobe-rea-verification.md).

    The 2026-11-14 public follow-up confirms the complete 1,016-byte outer
    copy witness, its 120-byte completion callback and both small retention
    tails. The selected installed Swift runtime preserves the incoming VWT
    pointer and copy slot +16 for the observed callback/layout flags, while
    changing other slots. That supplemental implementation proof remains
    conditional on the selected installed runtime. A later singleton-path
    follow-up confirms descriptor +32 instance identity for that runtime;
    Arc's actual runtime binding remains unproved. The dispatch snapshot
    approach does not require proving the preceding copy's ownership effects.
    Symbolic stack separation and complete SIMD provenance still need
    producing support. See the
    [runtime and public corroboration](field-tests/arc-dynamic-projection-2026-11-13/swift-runtime-vwt-followup.md).

    **Bounded Darwin effects complete (2026-11-15):** Profile v8 accepts only
    the exact system import with unambiguous original chained-bind ordinal
    and loaded target identity. It preserves the verified minimum register
    set and models 16 bytes of scratch below incoming SP; unknown bounds
    discard memory provenance. **67 distinct real cases / five CLI/MCP
    comparisons** pass, with all completed runs verifying empty owned lineage.
    Focused source, fast, built-doc and package checks also pass; the complete
    `check:pr` gate was not rerun. Published in `5628ef81c`. The unchanged
    Arc retest still returns 2,024 bytes across 8,608 and no nested table,
    confirming that the dynamic snapshot/SIMD lane remains necessary.
    See the [bounded probe report](field-tests/darwin-probe-profile-2026-11-14.md)
    and [Arc retest](field-tests/arc-selector-v8-2026-11-15/reducer-retest.md).

    **v9 resolution (2026-11-15):** A conditional typed snapshot at the exact
    runtime outer-tag call replaces a required proof of preceding copy effects.
    Named validity/ABI/linkage/nonwrapping/live-region/stability premises remain
    explicit. Same-metadata aligned extent, live/disjoint stack identities,
    all-path outer-case selection, all 156 inline SIMD byte origins, pure child
    getter and closed getter-to-dispatch window are checked. Final recovery
    source `9717688d…c4df34` passes 102 native cases and 13 CLI comparisons.
    Arc's 28 mappings match all captured signed words, and all targets belong
    to the contiguous 10,072-byte body with 2,518 decoded instructions. A later
    evidence-text-only change preserves these facts and full shared proof while
    reducing the inline response below 10 MiB. Source/fast, package and built-doc
    checks pass; `check:pr` was not rerun. See the
    [final proof](field-tests/arc-dynamic-snapshot-2026-11-15.md).

56. **Select an indexed Swift vtable class before decode admission.** Done (2026-11-09), within the static indexed-class profile.
    Arc's `HoveredElementTracker` descriptor at `0x103d7bcb4` is established by
    public conformance metadata. The facet-only 20,000-record vtable query
    retains 5,097 slots / 507 owners and 10,267 relative pointers, with the
    decode exhaustion recorded at `0x103d772c0`; the requested hover owner is later.
    This is bounded admission, not a wrong count or global class absence.

    An owned three-class Swift fixture reproduces the analyst problem:
    `max_records: 10` retains four slots from `BudgetFirst`; a 100-record
    query retains 15 slots across all three classes, including `BudgetTarget`.
    Both are real public MCP observations, with an unchanged compiled fixture,
    exported bundle, explicit close and verified empty descendants. Captures:
    `field-tests/arc-selector-rendering-2026-11-09/owned/`.

    The implemented `swift_class_address` / CLI `--swift-class-address` selects
    one unslid indexed nominal class descriptor for `swift-vtables`. It scans
    the full type index before class decode admission, accounts for indirect
    aliases and unresolved entries, deduplicates the descriptor, and preserves
    selected-scope coverage and shared record limits. Wrong facets, conflicting
    conformance selectors and nonindexed/nonclass addresses cannot fall back to
    names. Unsupported class layouts and runtime instantiation remain unknown.

    The final source run passes **151 cases / seven files**, including indirect
    aliases, unresolved/nonclass/nonindexed identities, tight budgets,
    conflicting selectors and existing cancellation coverage. Review also
    identified malformed-section work amplification in full-index scans.
    Requested `__swift5_types` and `__swift5_proto` spans now require proper
    alignment, no unsigned address wrap and one complete file-backed mapped
    range before enumeration; empty indexes and unrequested families retain
    their scope. Two owned 55,752-byte copies declaring a **2^44-byte** index
    are rejected as `unsupported_target`, with `retryable: false` and truthful
    unchanged-bytes remediation. No worst-case enumeration was run.

    The final real MCP matrix completes **17 calls: 13 successful results and
    four expected rejections**, exports its bundle and closes with verified
    empty descendants. **Nine actual CLI/MCP comparisons** agree: five
    canonical Evidence records and four canonical error projections, including
    wrong-facet/conflict and malformed-index controls. All selected input hashes
    remain unchanged. Arc's exact hover-class query examines **11,125 / 11,125**
    index entries, finds one matching descriptor and returns **17 vtable rows /
    two resolved native targets** (`0x1012e4cec`, `0x1012e4d6c`); the other 15
    rows remain partial. These metadata word slots are not source method
    ordinals or proof of a concrete runtime receiver. Final selector rendering
    and the separate item 55 reducer work remain open. The uncached fast gate
    and built-documentation checks pass. See
    [repair/retest and retained boundaries](field-tests/arc-selector-rendering-2026-11-09.md).

57. **Settle a retiring provider process before declaring cleanup incomplete.** Done (2026-11-13), within one caller stop-deadline attempt.
    Real Arc Ghidra closes can report `sysctl_errno_22` for a process already
    exiting, followed by verified empty descendants at MCP shutdown. The
    supervisor returns immediately on the first incomplete group cleanup,
    before spending its existing grace interval. The retained failure remains
    truthful at that instant; child exit alone cannot establish group cleanup
    or authorize signaling a reused/unverified PID.

    One retained cleanup plan now spends the supervisor's existing absolute
    stop deadline across token settlement, sweeps and exit waits, with a fresh
    pre-signal membership check. Persistent unreadable tokens,
    surviving unverified group members and identity mismatches must still
    report incomplete. **91 source tests / one Linux-only skip**, **70
    process/Ghidra callback boundary tests / one Windows-only skip**, and **20/20 public
    Arc calls across three clean closes** pass. A further selector-return
    pass completes 5/5 and the four-helper pass completes 7/7, both closing
    cleanly. The original failed close and later
    empty-lineage receipt remain under
    `field-tests/arc-dispatch-load-2026-11-09/arc-v6-retest/`.
    Fast, built-documentation and package verification pass; source is published
    in `72fcdbe8c`. See the
    [repair and final verification](field-tests/arc-cleanup-settlement-2026-11-09.md).

58. **Retain detached cleanup candidates across failed close and rollback attempts.** P1, fixed and verified (2026-11-14).
    A controlled host reproduction against `72fcdbe8c` returns `incomplete`
    on its first stop, then `verified-cleanup` after the launcher exits even
    though an unreadable detached child remains live. A fresh one-shot plan
    loses the previously observed group; the recorded launcher exit can then
    release the provider's runtime roots. Item 57's deadline does not repair
    this cross-attempt ownership loss.

    The repair creates one cleanup capability at spawn, retaining candidate
    groups and original PID/start identities across rollback and later stops.
    Retention supplies candidates, never signal authority: each attempt still
    requires fresh matching run tokens, identities and group membership.
    Ghidra normalizes injected launches before ownership-manifest rollback;
    other provider consumers reuse the spawn capability. Source regressions
    cover unreadable orphans, later verified ownership, foreign/reused/migrated
    processes, and groups discovered during validation. Production-boundary
    tests pass, including both production-spawn and cap-less injected rollback
    cases with real owned Node processes. The final 12-file consumer matrix
    passes 132 tests with three platform skips; a fresh real Arc session passes
    15 calls, closes twice successfully and verifies empty owned descendants.
    Fast, built-doc and package checks pass. Published in `076c706c6`. See the
    [report and receipts](field-tests/arc-cleanup-history-2026-11-13.md).

59. **Retain the radare2 pipe when startup rollback cleanup fails.** P1, fixed and verified (2026-11-14).
    `Radare2Pipe.start` waits for the startup NUL before returning. On failure
    it calls `stop()` and discards an incomplete result, then throws before
    the client can assign its `pipe` reference. The client's release path sees
    no process handle and removes the private target/runtime root. Separate
    process acquisition from protocol readiness: the client now owns the pipe
    before any handshake or stream validation can fail. The owned-Node startup
    regression fails before the repair and passes afterward; failed cleanup
    retains both the handle and root across repeated closes, then releases them
    after successful verification. All 11 radare2 process-fixture tests pass,
    included in the final item 58 matrix. Published in `076c706c6`. See the
    [ownership report](field-tests/arc-cleanup-history-2026-11-13.md) and
    `field-tests/radare2-startup-cleanup-2026-11-14/`.

60. **Admit stack-probe imports independently of unrelated rebases and preserve original import addends.** Fixed and verified; implementation published in `70d5dd7d1` (2026-11-15).
    The v8 probe-identity lookup spends its 100,000-record budget on the entire
    Ghidra relocation table before selecting a probe import. Original Arc
    bytes contain 329,896 chained pointers but only 8,039 import records;
    the exact probe is import 1,428, library ordinal 14, `libSystem.B.dylib`.
    Installed Ghidra source adds a relocation for each chained fixup, so this
    lookup cannot finish its uniqueness proof on that complete index. Public
    loader diagnostics independently confirm the fixed-up pointer count;
    neither count is a direct live Ghidra-table measurement. An unchanged
    862,864-byte owned fixture now reproduces the gap through public MCP:
    v8 returns zero tables / 296 function bytes; v9 returns all 24 mappings /
    776 bytes. Both sessions explicitly close and verify empty lineage.

    The repair scans bounded original chained-import records for global
    same-name ordinal uniqueness, retains exact loaded header, imported
    external, applied selected-slot relocation and loaded-target checks,
    and rejects mixed classic binding/section-relocation carriers. Review
    also identified that Ghidra parses but omits format 2/3 import-table
    addends when applying pointers. Exact-name nonzero import addends must
    therefore reject the summary even if Ghidra's loaded pointer appears
    canonical. Owned large-rebase and zero/nonzero-addend controls are being
    verified in the completed 102-case native matrix, including zero/nonzero
    format 2/3 addends and a normalized-name collision. The Arc retest also
    recovers all 28 cases under the declared probe/typed-snapshot assumptions.
    Implementation is published in `70d5dd7d1`; supporting material is retained
    in the pre-upstream research checkpoint. See the
    [comparison](field-tests/arc-dynamic-snapshot-2026-11-15/large-rebase-comparison.json)
    and [current proof report](field-tests/arc-dynamic-snapshot-2026-11-15.md).

61. **Keep shared Swift switch proofs at the table instead of repeating them per case.** Fixed and verified; implementation published in `70d5dd7d1` (2026-11-15).
    The successful Arc v9 analysis recovers all 28 cases and a contiguous
    10,072-byte body, but its MCP response exceeds 10 MiB. The complete Evidence
    is retained and public bundle export recovers it; the first field recorder
    incorrectly treated the response limit as fatal before exporting.
    Inspection finds the same roughly 11 KiB shared proof repeated in every
    case mapping, in addition to the table data source. Across raw/normalized
    results, 58 large detail occurrences total 641,212 bytes. Keep each mapping's
    tag/name, word address and target facts, referring to the complete proof
    already owned by its table data source. Do not remove assumptions or raise
    the response limit. The unchanged-Arc retest now succeeds inline with a
    9,298,190-byte serialized reply. All 28 mappings, 10,072 body bytes, complete
    shared proof and limitations are identical. Both explicit closes succeed
    and the owned lineage is empty. Recovery logic is unchanged from the
    102-case producer; its full matrix was not repeated for this text-only
    repair. See the [exact comparison](field-tests/arc-dynamic-snapshot-2026-11-15/arc-v9-inline-retest/comparison.json).

## Upstream reconciliation (2026-11-18)

62. **Review and selectively integrate upstream REA additions.** Audit done;
    integration open. Compared local `70d5dd7d1` / source package 6.4.0 with
    upstream `f7849cad3fe3bffb207b4dc30f34394978c20297` / package 6.9.0
    (main includes changes after the November 11 release). Static source
    contracts: **205 local / 260 upstream**, **175 shared**, **85 upstream-only
    names / 30 local-only names**. Counts describe names, not independent
    capabilities or verified runtime availability.

    - [x] Add bounded native function summary delivery and use retained native
      pages through MCP/CLI (2026-11-20). The complete parent is preserved;
      default complete behavior and the response budget remain unchanged.
      See the [44-test and real Arc qualification](field-tests/arc-upstream-retained-2026-11-20.md).

    - [ ] Reconcile shared schema/Evidence/profile, boundary/parser and
      lifecycle changes while retaining local Swift/Arc/Rize and ownership
      fixes. Audit findings alone do not prove upstream bug fixes are missing
      semantically from our different implementation.
    - [x] Port verified selected-project copies (2026-11-24). Exact `.gpr`/
      Program configuration, whole selected-pair and bridge-source commitment,
      private verified copy and read-only analyst authority are implemented.
      Original analysis completeness remains unknown; saved seed reports are
      historical. Public controls caught and fixed flattened changed-source
      errors and unclear wrong/unavailable identity handling. 108 tests pass
      with one platform skip; final CLI/MCP parity, owned controls, seeded Arc
      regression, package/fast/docs checks and 26 historical snapshots qualify
      this slice. Arc retains its 10,072-byte / 2,518-instruction reducer body.
      See [the integration report](field-tests/upstream-ghidra-projects-2026-11-24.md).
    - [x] Port opt-in owned Ghidra checkpoints for native Linux/macOS
      ELF/PE/thin Mach-O, including seeded and bounded analysis (2026-11-24).
      `REA_GHIDRA_CHECKPOINT_DIR` binds the full profile, bridge, target and
      saved Program hash. Initial analysis and acknowledged metadata edits are
      saved; verified private restores preserve the original completion flag.
      Publication ownership, failed-cleanup retention and stale/corrupt-state
      refusal are implemented. Real Arc cold/warm results retain all 10,072
      reducer bytes / 2,518 instructions with the original one-second timeout.
      Public refusal controls exposed and repaired stale snapshot reuse after
      failed publication and misleading read-permission diagnostics for a
      write failure. Missing checkpoint roots under symlinked parents (such as
      macOS `/tmp`) are now canonicalized before profile binding. Source and
      lifecycle checks pass; see [the qualification](field-tests/upstream-ghidra-checkpoints-2026-11-24.md).
    - [x] Port retained native inventory/batch pages (2026-11-24). Five
      inventories/searches and batch_decompile retain complete parents for
      summaries, original-index item pages and Unicode-safe body pages. CLI
      supports portable bundles; complete remains default. Real Ghidra controls
      qualify null-as-unavailable, duplicate selectors and exact parity. Batch
      admission is sequential, caveats stay per item and interrupted prefixes
      retain identity. Workflow revision 3 avoids old replay semantics. Fixed
      the repository-skill verifier's tracked-deletion copy failure exposed by
      the shared CLI-helper rename. See [qualification](field-tests/upstream-native-pages-2026-11-24.md).
    - [x] Port native-observation/context delivery for procedure addresses,
      callers/callees, containing-procedure resolution, xrefs and call graphs
      (2026-11-24). Complete defaults, source indices, unknown profile coverage
      and context commitments preserve existing local facts. Interrupted graph
      admission now stops safely with retained prefix facts/caveats; workflow
      revision 2 avoids historical replay. Public owned/Arc and CLI/MCP parity
      qualify the slice; see [report](field-tests/upstream-native-observations-2026-11-24.md).
    - [x] Port analyzed-memory search_bytes and CLI search-bytes (2026-11-25).
      Masked signatures, source offsets, inclusive ranges, overlapping pages and
      explicit exclusions/cursor generation are qualified on owned Ghidra controls
      and Arc. Fixed auxiliary-source offsets in the existing mapping owner and
      explicit native ENOSPC classification exposed by this run. Complete CLI/MCP
      parity and the release package gate pass; see [report](field-tests/upstream-byte-search-2026-11-24.md).
    - [x] Review and selectively integrate decompile_all / bulk export (2026-11-25).
      File-backed manifests, verified resume, immutable attempt history and
      per-item caveats complement the existing inline batch tool. Fixed export
      resource/retention plumbing, publication acknowledgment and known-mutation
      admission; 50 selected tests, owned/Arc Ghidra, complete CLI/MCP parity and
      package gates pass. Address layout only; independent-context retries and
      debug compilation-unit facts are not advertised. See
      [qualification](field-tests/upstream-decompile-export-2026-11-25.md).
    - [ ] Checkpoint extensions, Windows/special loaders, automatic profile
      refresh after retirement and automatic crashed-publisher lock recovery
      remain separate unqualified scope. Reopen to bind a newly saved generation;
      a stale profile refuses changed state. No PID-only lock reclamation.
    - [ ] Add structured offline firmware readers and devicetree inspection.
      - [x] Intel HEX / S-record root carriers (2026-11-25): sparse regions,
        record integrity, declarations and verified extraction; caller capacity,
        metadata/source ownership and lifecycle vocabularies qualified. 82 tests,
        public CLI/MCP, Arc and historical checks pass. See
        [qualification](field-tests/upstream-hex-records-2026-11-25.md).
      - [ ] UF2 / DfuSe readers are next; then uImage/FIT/ESP, Android boot/OTA
        and devicetree. Nested recursive decoding and raw CPU/board loading are
        not implied by the text-carrier slice.
    - [ ] Qualify raw-image/RISC-V, expanded MIPS and PowerPC/DOL lanes
      separately. Upstream raw ARM remains A32; Cortex-M/Thumb is not established.
    - [ ] Review native diagnostics, APK signing/JNI/R8, standalone packages,
      language/data inspectors and network/browser/Electron additions against
      overlapping local tools.
    - [ ] Prioritize optional persistent debugger/Frida sessions, desktop/agent
      environments and NTFS/Windows workflows when needed.

    Preserve the 30 differently exposed local tools, including general function
    emulation and Chromium resource inspection/search; do not replace REA+
    wholesale. The November 18 audit performed no source merge, dependency
    install or upstream provider run. The November 20 selective delivery
    update and local qualification are recorded above. See the
    [comparison and proposed order](field-tests/upstream-rea-comparison-2026-11-18.md)
    and [complete source-name inventory](field-tests/upstream-rea-comparison-2026-11-18/comparison.json).

## Arc continuation (2026-11-21)

The 2026-11-24 [selected-file sidebar restore follow-up](field-tests/arc-restore-consumer-2026-11-24.md)
binds the selected worker's read/reset/save sequence and preserves caught-save
error semantics. Its return value is not a write-success receipt. This route
uses read/save fields and does not close the separate generic restoreFromBackup
consumer gap. A field-harness diagnostic correction is verified; no new
production defect or helper-global typed domain is claimed.

63. **Recover unguarded halfword enum/string dispatch from proved input type.**
    **2026-11-24 boundary retained during restore work.** The saved typed-input
    design still requires a proved closure origin and valid invocation context;
    actual override/cache/default selection remains unresolved. Adjacent store
    declaration fields are now retained, including read/save/restore names,
    but their generic/throwing signatures and nested application lowering remain
    outside the current narrow decoder. Do not treat the analyst's conditional
    sidebar composition as automatic typed invocation recovery. Unknown
    revision 3 stays open; the next independent work is the restore UI caller/
    post-save route and the generic automatic-restore consumer.

    **2026-11-24 bucket repair and backend predicate advanced.**
    Selected helper `0x100710288` now has static move/bookkeeping coverage,
    fourteen matching Arc/C pairs and one explicit runtime-call stop. The
    default Memory/Firebase constructor's predicate resolves to UI/e2e test
    environment strings equal to `1` or the previously recovered cached
    XCTest predicate. Getter block/capture adapters and async X20 return joins
    are traced; codec/activation and local-enable callback semantics were
    already recovered and are not counted as new findings. The earlier generic
    callback frontier was stale. A caller omission of `decode_unlisted` was
    corrected in a separate retained session; no new product bug was found.
    Concrete Client/backend choice, earlier instance relations, first-class
    typed invocation mapping and durable I/O remain open. Unknown revision 3
    remains open. See [the new report](field-tests/arc-removal-persistence-2026-11-24.md).

    **2026-11-24 cache partition and local post-getter window advanced.**
    The selected cache probes raw identity/context together; source follows the
    normal and test-context callback bridge. Under the previously identified
    live/preview/test byte meanings, a test-context cache entry does not match
    live. The exact Client VWT copy/destroy slots and worker ownership sequence
    narrow the local loaded-pair stability gap under ordinary Swift ABI/ARC.
    Seven Arc/C probe pairs, two budget stops and two copy-prefix stops retain
    explicit input/stop boundaries. Concrete getter output and earlier Root/
    wrapper/keypath/copy relations still remain; the typed invocation carrier
    is not implemented by this analyst composition. Unknown revision 3 stays
    open. Its then-open bucket repair and selected callback joins are covered
    by the newer checkpoint above. See [the cache report](field-tests/arc-cache-selection-2026-11-24.md).

    **2026-11-23 static dependency/default policy advanced; actual choice stays open.**
    The surrounding scope's computed keypath selects NavigationIDPathKey
    (`0x103d4d1e4`, metadata `0x10428b940`, witness `0x1045c82f0`) with associated
    Value NavigationIDPath. Its metadata/witness differ from the Client's.
    Wrapper instructions support current-over-captured storage with the captured
    cache under normal copy/dictionary semantics; broad alias/store effects
    remain unproved. Context factory recognizes SWIFT_DEPENDENCIES_CONTEXT
    live/preview/test and falls back through the preview flag and a cached test
    predicate. With the retained local conformances, live/preview default getters
    copy the global Client; the test-default bool closure at `0x100003b60`
    returns false without consulting the table. Actual overrides/cache contents,
    selected code/context, relevant instance/copy stability and the qualified
    typed invocation join remain open. This is retained explicitly as unknown
    `unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04`.
    Preferences object selection has source-bound suite/standard selectors. The
    newer [producer checkpoint](field-tests/arc-client-producers-2026-11-23.md)
    closes the suffix algorithm, Dia-specific gate and static test predicate;
    current suite and durability remain unresolved.
    No new producer defect was established. See
    [the dependency-policy report](field-tests/arc-dependency-policy-2026-11-23.md).

    **2026-11-23 selected-index observation carrier implemented; typed proof remains open.**
    New target-free `inspect_native_table_dispatch` reads a stable arm64 Mach-O
    and reports requested indices from a verified straight-line mask16/LDRH/
    scaled-ADD/BR prefix. Exact source bytes, file offsets, artifact hash,
    content-bound observation identity and per-index failures survive CLI/MCP.
    Optional exact direct BL/literal suffix gives only a conditional singleton;
    known bypasses, indirect calls and unselected indices withhold it. It never
    infers a Swift type/domain, extends a function, or changes a global CFG.
    Arc selected indices 49/50 map to `0x1005ab4e8`/`0x1005aa834`. Actual call
    `0x1012ab840` remains indirect-unresolved despite its observed X0=49; direct
    helper call `0x100d910f0` has no proved adjacent literal. Active default/Client
    selection, exact stored code/context and relevant instance/copy stability
    remain the typed invocation-proof residuals. File-cap guidance caught in
    the new adapter's public check was fixed to name `max_file_bytes` and the
    unchanged-retry failure. 25 affected tests, 14 final MCP calls (two expected
    errors), seven exact CLI/MCP comparisons, 17 historical snapshots and
    build/fast/docs/architecture/package checks pass. See
    [the selected-index checkpoint](field-tests/arc-table-dispatch-2026-11-23.md).

    **2026-11-23 constructed-child / scoped callback route advanced.**
    The selected wrapper writes its saved keypath to output+16 in a checked
    18-instruction call-free window; the Root+496 relationship stays conditional
    on the later copy/alias window. Source-built compiler IR and real public
    native observations corroborate Swift keypath projection's X8 result.
    The constructed Root is moved into _IfLetReducer.child using the declared
    vector entry at metadata+0x34, without inventing a runtime generic offset.
    That composition's shipped witness entry reaches child reduction, which
    builds _DependencyKeyWritingReducer with the exact Child metadata/witness.
    Stored operation callback `0x1008719b4` dispatches Child witness+0x20; for
    the retained Root instantiation it reaches `0x1012a9870` -> `0x1012a571c`.
    This is a conditional static value path, not observed execution. Scope
    helper `0x10070d148` -> `0x10070d1ec` checks the update error register and
    uses synchronous TaskLocal.withValue; trampoline `0x10071069c` and helper
    `0x10070d2f8` unpack and invoke the saved operation/context. The zero-error,
    standard import-binding, child-branch and unchanged instance/copy premises
    remain explicit. Active
    TaskLocal/default selection and the Client's actual code/context are not
    established. The invocation-only carrier stays open; no helper-global bound.
    Verification: 117 successful new public MCP calls, two complete-Evidence
    CLI/MCP pairs, sixteen historical snapshots and empty owned lineages on
    unchanged item 72 production code. One correctly reported disk failure is
    preserved, followed by a successful full-image retry after user cleanup.
    See [the constructed/scoped path report](field-tests/arc-instance-flow-2026-11-23.md).

    **2026-11-23 member-template binding advanced; item remains open.**
    Item 72 retains Dependency's keyPath template with DependencyValues
    descriptor `0x103d46e58` and depth-zero parameter 0 at `0x103d46d88`.
    Its owner/signature exactly match Root's Dependency<UserDefaultsClient>
    application. A separate checked analyst composition substitutes exact
    Client `0x103d648c4`; REA+ does not automate that substitution. External
    descriptor kind/arity/constraints/authenticity/runtime binding remain
    unresolved despite the retained KeyPath import identity. This supersedes
    the raw member-template gap below. Actual constructor/captured-instance
    relation, relevant keypath/Client field stability, and an observation-only
    invocation-domain/mapping carrier remain open. No generic layout or
    helper-global bound follows. See
    [the member-template report](field-tests/arc-member-templates-2026-11-23.md).

    **2026-11-23 concrete generic declaration binding advanced.**
    Item 71 now binds Root field 6 to Dependencies.Dependency<UserDefaultsClient>
    using exact wrapper/module/signature/argument descriptors, rather than raw
    bytes alone. Seven of eight Root applications decode; the mainQueue argument
    stays unsupported. No generic layout, native argument ABI or function domain
    is inferred. The next member boundary is imported `_$ss7KeyPathCMn` in the
    wrapper's parameterized keyPath type; interpreting that template and applying
    the selected Client substitution remain open. A conditional analyst check of
    retained adapter/reader instructions verifies that X0 is unchanged along
    the exact default entry to helper call `0x100d910f0`. This does not select the
    actual active target or establish field/alias stability. Actual-instance/
    default relation and a first-class invocation-domain/mapping carrier remain
    open. See [the generic application report](field-tests/arc-generic-applications-2026-11-23.md).

    **2026-11-23 generic declarations and typed constructor use advanced.**
    Item 70 now retains the five generic Dependency field declarations while
    refusing generic physical-layout inference. Public code also binds candidate
    initializer output at caller SP+0x1680 to consumer `0x100876de8`, supplied
    with exact Root metadata `0x104316db8`. At `0x100876ee8`, source X26 and
    metadata X28 reach VWT+0x20: Root's initializeWithTake witness `0x1012b4074`
    copies 640 bytes. This is a conditional typed-use anchor, not unchanged
    construction bytes across aliases or proof of the actual captured instance.
    Exact BoostsEditor:Reducer conformance binds witness `0x1046270d8`; slot 4
    (`0x1012a9870`) copies incoming Self to SP and calls reducer `0x1012a571c`.
    Slot 5 is a diagnostic/trap, so slot order supplies no method-name shortcut.
    Concrete generic specialization/substitution, relevant field stability,
    captured-instance/default relation, forwarding and invocation-only mapping
    remain open. No helper-wide override. See
    [the generic/constructor-use report](field-tests/arc-generic-declarations-2026-11-23.md).

    **2026-11-23 keypath/dependency trace advanced; item remains open.**
    Item 69 repairs the missing C return from keypath instantiation. Selected
    pattern `0x103788708` binds `DependencyValues` -> `UserDefaultsClient`;
    its external property descriptor is trivial, selecting local getter
    `0x1003b5454` via `0x1012b283c`. The getter passes exact Client metadata
    and TestDependencyKey witness `0x1045ee8b0` into lookup `0x1006fb0c0`.
    The storage/context/cache paths and two exact Client conformances are now
    public Evidence. On a cache miss, context 0 resolves DependencyKey slot 2
    (`0x100d929a0` for the retained static conformance); contexts 1/other valid
    select TestDependencyKey slots 2/3 (`0x100d8c154`/`0x100d8c1dc`). The first
    also copies the known global Client; the second constructs other closures.
    This is conditional selection, not an observed live default. Candidate
    initializer ownership/use, generic wrapper representation, relevant field
    stability through aliases, unchanged forwarding and invocation-only mapping
    remain open. Generic metadata-response/stack-probe conventions still make
    lookup pseudocode incomplete; the retained native instructions support
    this conditional trace. Do not give Swift metadata responses the new C ABI. No helper-global 297-case override. See
    [the keypath/dependency report](field-tests/arc-keypath-origin-2026-11-23.md).

    **2026-11-23 captured reducer environment bound; item remains open.**
    The selected reducer effect copies 640 bytes into its async context.
    Descriptor `0x1037887f8` -> thunk `0x1012b3670` -> entry `0x1012ab2d0`
    carries that environment into the worker. Exact `BoostsEditor` metadata
    `0x104316db8` / owner `0x103d7b1ac` binds eight physical offsets and field 6
    `_userDefaultsClient` at 480, matching the worker's 80-byte wrapper load.
    The Root copy wrapper supplies a conditional typed source anchor under
    normal copy/VWT, validity and field-stability premises. The field's raw
    generic typeref matches the worker's instantiation typeref; generic shape
    interpretation remains explicitly unsupported. The precise next gap is
    the captured keypath/construction and selected/default Client's code/context
    origin, then relevant unchanged forwarding and invocation mapping.
    Item 68 repairs the allocator return defect found along this path without
    inferring pure calls or a helper-global type/CFG bound. Reducer mappings
    and body, helper limits and X0=49 call preparation remain unchanged. See
    [the captured-origin and repair report](field-tests/arc-invocation-origin-2026-11-23.md).

    **2026-11-22 selected-call preparation done; item remains open.**
    Optional instruction `call_preparation` reports a native-encoding-validated
    immediate suffix, its source bytes and conditional X0–X7 constants. The
    selected actual closure call `0x1012ab840` sets X0=0x31. Its loaded pair
    shares a Client-buffer/VWT-destroy source anchor, conditional on normal
    VWT, valid live/disjoint source and a stable field window. Exact enum VWT
    alignment 2 excludes X0=49 as an aligned indirect pointer under the valid
    normal one-argument Swift-closure premise. This is a selected analyst
    discrimination, not a metadata-wide lowerer or a default-target proof.
    Code/context origin, relevant field stability, unchanged forwarding into
    the selected converter and the per-invocation mapping carrier remain open.
    Initial new-feature qualification falsely treated a vector lane index as
    an immediate; an intermediate version omitted Ghidra's ORR spelling of
    logical MOV constants. Both producer defects are fixed and failed evidence
    retained. 20/20 native controls, 85 affected source tests, 67 final public
    replies, five exact CLI/MCP comparisons and build/fast/docs/package checks
    pass. One parity attempt had differing truthful one-second analysis limits;
    final fixture parity uses a matching 60-second policy. Existing v10 enum
    recovery is unchanged: reducer 28 mappings/10,072 bytes, helper zero tables.
    See the [selected-call report](field-tests/arc-closure-origin-2026-11-22.md).

    **2026-11-22 static-metadata follow-up done; item remains open.**
    Optional `swift_metadata_address` now binds Arc's exact Client metadata,
    physical uint32 field offsets (0,16,...,352) and VWT/copy role. The selected
    wrapper/caller supplies a conditional typed source anchor under named VWT,
    stable-metadata and valid-source premises. Owned controls prove reflected
    shape/case count/current size cannot choose direct i16 versus indirect
    pointer passing; `argument_abi` explicitly stays unresolved. Shared VWT
    helper identity never replaces the descriptor backpointer. Selected ABI,
    closed code/context origin, forwarding and invocation mapping remain open.
    136 tests, 39 successful public replies/two intentional invalid requests,
    three exact CLI/MCP cases and build/fast/docs/package checks pass. See the
    [static metadata and ABI report](field-tests/arc-closure-abi-2026-11-22.md).

    **2026-11-22 field-type step implemented and verified; item remains open.**
    The existing metadata tool's opt-in `swift-fields` facet with exact
    `swift_type_address` now decodes selected reflection declarations and the
    complete supported symbolic closure type. Public Arc evidence binds
    `UserDefaultsClient.boolForSetting` to `@Sendable (ArcUserDefaultSettings)
    -> Bool`, exact enum `0x103d41568`, zero payload / 297 empty cases.
    All 23 field records are retained; four function types decode and nineteen
    remain unsupported, so overall coverage stays partial. Owned merged
    typed/UInt16/foreign-owner controls remain distinct, and an enum only in the
    return type supplies no parameter domain. Verification includes 22 public
    MCP calls (20 successful / two intentional invalid-input errors), two exact
    CLI/MCP Evidence comparisons and empty owned lineages. No code/CFG mutation
    or target execution. Native argument lowering, typed root/physical offset,
    closed code/context origin, argument flow and per-invocation mapping carrier
    remain open. Coverage ordering and shared-budget propagation regressions
    were fixed before the qualified retest; 124 affected source tests pass.
    See the [field-type report](field-tests/arc-field-types-2026-11-22.md).

    Open; actual Arc omission and owned compiler encoding controls retained.
    The anonymous Setting-to-key converter at `0x1005aa5e4` masks its input to
    16 bits, loads unsigned halfwords from `0x1036db410`, and dispatches relative
    to `0x1005aa61c` with scale 4. Public analysis retains 14 instructions/56 body
    bytes and zero recovered tables. The two selected entries for tags `0x31`
    and `0x32` can be checked directly and produce the exact preference keys;
    that selected derivation is not automatic recovery of all 297 cases.

    Existing item 37/55 signed-word profiles and the guarded byte/halfword
    decoder do not establish this unguarded input's enum identity. The mask
    permits 65,536 values; do not infer 297 from a neighboring table, equal
    helper bytes or a similar function. Owned 297-case Swift fixtures with
    RawRepresentable and manual String getters produce identical 594-byte
    tables. All 297 targets are statically checked against each fixture's
    symbol interval; the fixtures were not executed or passed through a new
    provider session. Arc's selected conformance-name query yields no matches
    while retaining 401 unresolved identities, so protocol absence is not
    established.

    A safe extension must bind the complete closure input type, exact nominal
    owner and selected code/context origin, then preserve unchanged argument
    flow. Keep its domain conditional on that invocation and the declared
    valid Swift input/default-selection premises. Owned optimized controls now
    show typed-enum, unchecked UInt16 and foreign-owner paths sharing helper
    code. Therefore one typed caller cannot justify the existing owner-wide
    CFG/table override. Implement an observation-only typed context first, or
    separately prove every entry's domain. Constructor output-pointer writes
    and an associated `Value` identity alone do not prove the constructor's
    declaration. That earlier typed-design pass left the enum-recovery class
    unchanged. The later prerequisite item 67 repairs hidden ABI frame escapes
    and qualifies the v10 profile with all 110 native cases; it does not close
    this typed-invocation gap. See the
    [Arc results](field-tests/arc-persistence-2026-11-21.md) and
    [bounded fixture/design](field-tests/arc-persistence-2026-11-20/halfword-fixture/DESIGN.md).

    The same pass identifies exact warning/interstitial keys and the selected
    NSUserDefaults read/write callback, separates `applyToWebContent` from
    storage, and identifies the default Memory/Firebase `BoostsStorage`
    conformances. These are semantic progress, not closure of full Arc,
    durable readback, account/sync or the other browser feature routes.

    The callback/local-store follow-up also encounters an 8-bit-masked
    unguarded halfword dispatch at `0x100d989e4`, reached with tag `0x32` by the
    typed StorableBoostsData factory. Item 65 now decodes the selected interior
    branch without admitting it as a function: filename `StorableBoostsData.json`,
    then path builder `0x100d98fd0`. The selected generic dependency resolves to
    `ApplicationPaths`, whose reflection includes `baseURL`. The next static
    pass now resolves the selected ordinary default to user-domain Application
    Support / Arc / StorableBoostsData.json, with conditional CLI and stored
    preference overrides. Active injection/current values remain unknown.
    Do not infer an enum input type or the separate Setting table's 297-case
    bound from that location tag. See the
    [default-path report](field-tests/arc-base-url-2026-11-21.md).
    Automatic context-scoped dispatch remains open alongside item 63. The [new report](field-tests/arc-callbacks-2026-11-21.md)
    closes editor save effects, getter decoding and conditional two-write
    control flow while retaining the remaining store/path and runtime gaps.


64. **Decode static Swift witness data alongside executable slots.** Done
    within ordinary local static-conformance layouts. The Arc `DependencyKey`
    witness's inherited-table entry and `TestDependencyKey.Value` entry were
    retained as unclassified partial slots. They now carry `requirement_flags`
    and optional typed `witness_data`, with exact owner/protocol/context
    locations and binary provenance; neither becomes a code target. Inherited
    tables require exact nominal ownership and a declared ordinary `Self`
    protocol constraint. Tagged complete symbolic names resolve non-generic
    associated nominal types. Metadata-based, compound/protocol-context,
    generic, external and unsupported encodings remain partial.

    Arc retesting explicitly binds `Value` to `UserDefaultsClient` descriptor
    `0x103d648c4`, without changing executable targets or broader discovery's
    401 unresolved identities. Both selected conformances have complete scoped
    witness coverage. **92 source tests / six files**, ten compiler variants,
    seven discovery comparisons, **40 public MCP replies**, two full CLI/MCP
    metadata comparisons and fast/build/docs/package gates pass. Earlier
    Evidence remains valid with the optional fields omitted. This supplies a
    missing identity fact for item 63, not its producer/type-flow repair. See
    [the exact scope and verification](field-tests/arc-witness-data-2026-11-21.md).


65. **Inspect valid unlisted native instructions without changing the CFG.**
    Done and verified for Ghidra ARM64/x86-64. Arc's selected switch interiors
    contain valid executable bytes but no Listing instructions, so the original
    instruction probe reported undecodable. `inspect_native_instruction` now
    accepts explicit `decode_unlisted: true` (CLI `--decode-unlisted`) and
    returns a detached byte interpretation with `decode_source` and
    `references_available`. Default behavior remains Listing-only. The decoder
    rejects data/instruction overlaps, misalignment, uninitialized/nonexecutable
    memory and cross-block encodings. It creates no Listing, function,
    ReferenceManager or CFG objects. Outgoing analyzed references remain
    unavailable for detached decodes; direct encoded flow is separate.

    **43 focused tests**, fast/build/docs/package gates, two real native
    fixtures (**44 MCP calls: 40 successful, four expected input rejections**),
    two exact CLI/MCP comparisons and **137/137 Arc replies** pass. The earlier
    typed-root session adds 20 calls (18 successful, two retained admission
    errors). Both Arc sessions close twice and all qualified lineages are
    verified empty. Arc's selected Setting function stays 14 instructions /
    56 body bytes; the selected interiors remain unlisted afterwards.
    Selected instruction bytes match the immutable original image. The
    Swift enum-recovery class is unchanged; its 102-case matrix was not rerun
    for this independent inspection primitive.

    The new path findings and typed-input counterexamples are recorded in
    [the report](field-tests/arc-unlisted-instructions-2026-11-21.md) and
    [verification](field-tests/arc-typed-dispatch-2026-11-21/retest-verification.json).
    The subsequent [default-directory trace](field-tests/arc-base-url-2026-11-21.md)
    resolves ordinary default construction and its override branches. Item 63,
    runtime dependency selection, store durability and broader Arc coverage
    remain open. This is an offline investigation; no Arc
    executable, fixture library, profile, account or service was used at runtime.


66. **Report an expired field recorder as incomplete, not completed.** Fixed
    in the new research harness (2026-11-22); no production REA+ defect or
    producer change. The first feature-metadata session retained 73 successful
    replies, then its continuation expired. The old recorder incorrectly
    summarized this as completed. Original outputs remain intact; current
    verification classifies that session as partial, with transport cleanup
    verified empty and no invented explicit-close calls. The new recorder
    throws and reports failure on expiration. A real target-free MCP check
    confirms expected nonzero exit / failed summary / zero targets and
    verified empty lineage. The completed follow-up has 236/236 replies,
    final export, two explicit closes and empty lineage. See the
    [report and verification](field-tests/arc-features-storage-2026-11-22.md).

    Arc findings from these 309 successful public replies also close the
    selected `featuresUsed` payload/completion gap: a plain array of seven
    possible labels, computed from the original model, goes through a separate
    awaited `setData:merge:completion:` request after primary model success.
    Its error propagates; two model-data merges are not the whole request
    count. Exact inclusion predicates and the color comparison simplification
    are source-bound in the independent review.

    The selected store expects version 0. Its fallback is a version-only
    diagnostic decode, not migration. Backup flags differ by caller; local
    enable save passes backup off and discards its save error. Timestamped
    copy/0600 permissions, empty selected retention schedule, and explicit
    `synchronizeAndReturnError:` before close/replacement are now traced.
    Actual I/O/durability, complete restore ordering/caller behavior, item 63
    and broader browser features remain open. Item 47's generic-call warning
    remains explicit; no unsafe blanket x21/CFG repair was introduced.

    **Restore/preview continuation (2026-11-22):** selected restore ordering is
    now closed: stable descending `date ?? Date.distantPast`, with equal keys
    retaining directory enumeration order. Prefix-based eligibility and the
    first successful decoded backup return are traced. Neither the leaf nor
    its queue callback requests a save; a higher invoking application caller
    and later writeback remain open. Exact suffix collection import identities
    also remain qualified.

    The selected preview field returns `WebContent?` for a
    `WebContentFrameIdentifier`. Exact metadata/ABI and saved pair flow bind
    protocol-witness dispatch. The observed Chromium target calls
    `captureViewport:` with an NSImage block; the selected Swift continuation
    payload is NSImage?. A second observed local implementation is a return
    stub. Partial discovery does not establish exhaustive implementations or
    runtime selection/pixels. See the
    [new report](field-tests/arc-restore-preview-2026-11-22.md) and its additive
    interpretation, which supersede those two earlier narrow gaps.

    **227/227 successful public replies** and **115 original-byte-matching
    instruction probes** verify. The 199-call first session correctly reports
    failed/partial after idle expiration; the fresh 28-call follow-up exports
    and closes twice. Both owned lineages are verified empty. Item 66 behaves
    correctly; no new production REA+ defect was established. Item 63,
    higher restore caller/writeback, full apply/UI/browser coverage and runtime
    I/O/durability remain open. No target was executed.


67. **Invalidate Swift enum spill proofs for hidden ABI frame arguments.**
    Done and verified within the existing recovery model (2026-11-22).
    Found while continuing item 63. Both historical frame-escape detection
    and post-call spill retention checked only X0-X7. An owned source-built
    fixture supplies the tag-spill address through X8 to a helper that writes
    65,536; v9 nevertheless publishes a 30-case unchanged-tag table. This is
    a reproduced producer defect, not an Arc behavior claim.

    One shared predicate now includes X0-X8, Swift self/context X20 and Swift
    async context X22 at unknown calls. The profile advances to
    `abi-signed-word-cfg-v10`. Seven immediate/retained-address negatives reject,
    and an X19 non-argument control still recovers all 30 cases. The verifier's
    stale duplicated-proof assertion was corrected to authenticate the shared
    table proof and each exact case link; original failed runs are retained.
    Build, 42 provider tests and fast/docs/package checks pass. The complete
    native matrix passes **110 cases (16 positive / 94 negative), 440 MCP
    replies and 14 CLI/MCP comparisons**, with empty owned lineage. The exact
    unchanged counterexample and fixed Arc are retested with **15/15 replies**,
    exports, two closes per session and empty lineages. Arc's existing 28-case
    reducer mappings / 10,072 body bytes remain intact. The Setting helper
    remains 14 instructions / 56 bytes / zero Swift tables. No fixture or Arc
    code was executed. This is a prerequisite safety repair; item 63's typed
    root, closure origin and invocation-scoped carrier remain open. See the
    [report and verification](field-tests/arc-frame-escape-2026-11-22.md).


68. **Preserve the C ABI return of imported Swift runtime allocation.** Done
    and verified while continuing item 63 (2026-11-23).
    In a Swift-compiler-spec Program, the exact libswiftCore allocator import
    is decompiled as if X0 still held its metadata input after the call.
    The Arc constructor consequently appears to write into metadata instead
    of the returned allocation. A source-built Swift caller using a Clang
    C declaration reproduces it; compiler IR and native instructions retain
    the real return flow. The producer now copies the installed Apple C model
    and applies the exact supported import signature. Optional public runtime
    signature observations retain identity, original/effective signatures,
    parameter/return registers and unknown memory effects. Original imported
    names or unchanged importer-owned labels establish identity; analyst labels
    cannot grant it. Explicit user/imported signatures and call-site overrides
    are preserved; wrong-library/local namesakes are unchanged. Verification:
    86 source tests, 28 final public calls, five exact CLI/MCP pairs, six real
    boundary probes, final Swift error-model coexistence and build/fast/docs/
    package checks. All 23 Arc allocations are corrected; original assembly,
    constructor body and reducer mappings are unchanged. Preserved first-runtime
    false authority, failed harness attempts and exact final receipts are in
    [the report](field-tests/arc-invocation-origin-2026-11-23.md).


69. **Preserve the C ABI return of imported Swift keypath construction.** Done
    and verified while continuing item 63 (2026-11-23). A source-built literal
    keypath reproduces the dropped X0 result: the old Program substitutes its
    pattern address for the returned object. The shared exact-import registry
    now models `swift_getKeyPath` with pointer inputs X0/X1 and pointer result
    X0, retains unknown memory effects and the item 68 identity/override
    exclusions, and publishes `swift-keypath-c-abi-v1`. The analysis-profile
    component advances to `swift-runtime-c-signatures-v2`. All eight Arc
    candidate-initializer returns are retained; 23 allocator results, reducer
    mappings/body and helper limits are unchanged. Verification: 86 source
    tests, 94 successful final-runtime MCP calls, four exact CLI/MCP pairs,
    six real boundary probes, stock Swift-error coexistence and build/fast/
    docs/package checks. Twelve historical snapshots authenticate. Qualified
    lineages are empty. Recorder expiration, two sandbox launch failures,
    missing frozen fixture and a verifier label typo remain honestly retained.
    This repairs return flow, not keypath type/origin or active dependency
    selection. See [the report](field-tests/arc-keypath-origin-2026-11-23.md).


70. **Inventory generic Swift field declarations independently of ABI lowering.**
    Done and verified (2026-11-23, item 63). The selected field reader formerly
    reused its nongeneric function-atom restriction for the declaration owner,
    retaining no name/fields for indexed `Dependency<Value>`. Declaration
    inventory now retains owner identity, optional `is_generic`, field records
    and complete raw manglings without substituting generic parameters or
    instantiating layout. The physical metadata reader independently rejects
    generic owners, including an owner-matching fabricated layout control.
    Generic structs/enums, same-name foreign owners, concrete closure fields,
    budget exhaustion and unindexed selectors are covered. Arc retains all
    five Dependency records; its type interpretation remains partial.
    Verification: 67 source tests, 55 final-runtime public MCP calls plus 18
    baseline calls, four exact CLI/MCP comparisons, build/fast/docs/package
    checks, empty owned lineages and thirteen historical snapshots. The stale
    Ghidra guide's v9 profile label now matches the existing v10 code. Native
    bridge/recovery/runtime-call implementations are unchanged. Specialization,
    actual captured-instance relation and field stability remain item 63 work.
    See [the report](field-tests/arc-generic-declarations-2026-11-23.md).


71. **Decode concrete flat Swift generic field applications.** Done and verified
    (2026-11-23, item 63). Optional `bound_generic_type` validates a complete
    flat argument list against the original top-level version-zero struct,
    module parent, ordinary key parameter flags/counts and absence of encoded
    requirements/packs. Signature and argument identities remain declaration-only;
    generic member substitution, instance layout and native ABI stay unresolved.
    Function/application records are mutually exclusive, and enum type arguments
    supply no function domain. Arc now decodes seven of eight Root applications,
    including exact Dependency<UserDefaultsClient>; `_mainQueue` remains partial.
    Source-built one/two-parameter, builtin/enum/same-name and boundary controls,
    plus three deliberate malformed derivatives, qualify arity and bounds.
    Verification: 78 source tests, 31 final public MCP calls plus 13 baseline,
    four exact CLI/MCP pairs, build/fast/docs/package checks, fourteen historical
    snapshots and empty owned lineages. Existing Root layout and Client closure
    declarations are unchanged. The generic metadata guard remains intact.
    Conditional default-path X0 forwarding is also authenticated from three
    retained public observations and eight exact native instructions; actual
    default selection and an invocation carrier remain open. See
    [the report](field-tests/arc-generic-applications-2026-11-23.md).


72. **Retain generic Swift member declaration templates.** Done and verified
    (2026-11-23, item 63). Optional `generic_member_type` preserves complete
    depth-zero parameter references and flat external symbolic applications
    under an exact checked top-level ordinary unconstrained owner signature.
    Import symbol/library/weak/addend and source/slot identities survive;
    external descriptor semantics remain explicitly unresolved. Three field
    interpretation forms are mutually exclusive; old omissions stay valid.
    Owned parameters 0/1/2 and KeyPath fields decode; constrained/nested/foreign
    owners, malformed parameter/closer/pack controls and budget exhaustion
    retain their uncertainty. A renamed external symbol grants no validated
    type semantics. Arc now exposes DependencyValues plus parameter 0 in the
    selected keyPath template. Joining exact Root application/signature yields
    a checked analyst declaration substitution to UserDefaultsClient, without
    automatic projection, physical layout, live-instance or invocation claims.
    Verification: 88 source tests, 41 final public MCP calls plus 18 baseline,
    four exact CLI/MCP pairs, build/fast/docs/package checks, fifteen historical
    snapshots and empty qualified lineages. Native bridge/recovery/runtime-call/
    profile and physical metadata sources are unchanged. Actual captured
    instance/stability and item 63's invocation carrier remain open. See
    [the report](field-tests/arc-member-templates-2026-11-23.md).


73. **Preserve valid controls in declared CBOR/MessagePack UTF-8 text.** Done
    and verified (2026-11-23, found during Arc item 63 verification). The owning
    typed producers now use strict UTF-8 with BOM/control preservation, while
    untyped bytes keep a printable-text heuristic. Owned definite/indefinite
    CBOR and MessagePack tree/strings cases pass; malformed UTF-8 and raw/
    Protobuf byte identity remain unchanged. The original Arc range retains
    its auto-CBOR interpretation and now exposes its NUL-containing text.
    Auto-detection ambiguity is explicit. See
    [the shared qualification](field-tests/blob-text-controls-2026-11-23.md).

74. **Separate blob decoder selection from the CLI output-format flag.** Done
    and verified (2026-11-23, exposed by item 73's public parity check). The old
    documented `--format cbor` collided with Incur's global output format.
    The command now owns `--blob-format`, mapping to the unchanged MCP/domain
    `format` input. A compiled regression verifies decoder selection with both
    JSON-output selectors; the guide is corrected. Combined verification:
    17 boundary tests pass/four optional skips, 64 successful retained MCP
    calls (16 final delivery), four exact full CLI/MCP pairs, 21 historical
    snapshots and build/fast/docs/package checks. Failed attempts are retained;
    Arc Client, invocation and durability unknowns remain open. See
    [the repair report](field-tests/blob-text-controls-2026-11-23.md).

75. **Select an indexed Objective-C class before metadata decode admission.**
    Done and verified (2026-11-24). Optional MCP `objc_class_name` / CLI
    `--objc-class-name` requires `facet: objc` and checks the complete local
    class index before decode admission. Exact raw names, aliases, unresolved
    identities and distinct admitted roots stay explicit. Selected classes,
    metaclasses and referenced protocols share the unchanged aggregate cap;
    unrelated standalone protocol/category inventories are outside this scope.
    Also fixed method-summary leakage between distinct same-name class objects.
    Arc's unfiltered 6,000-record result correctly stayed partial (320 protocol
    records / zero classes). The same budget now selects FIRApp: 1,960 identities
    checked, one root / two class-metaclass records / 45 methods. Two controller
    name negatives concern the ObjC index only; Swift metadata positively binds
    RestoreDataViewController. Owned small-budget, miss, alias, unknown-identity
    and same-name controls pass. Verification: 67 source tests, 2,207 public MCP
    calls (2,206 successful, one expected invalid request), six exact CLI/MCP
    Evidence pairs, build/fast/docs/package gates, 25 historical snapshots and
    eight verified empty owned lineages. One earlier CLI pass could not inspect
    lineage under the sandbox; it is retained beside the qualified repeat.
    The conditional controller action now reaches SyncEngine CloudKit deletion
    preparation, the local restore worker and a restart-helper request. Actual
    UI action installation, script contents, active Client and I/O outcomes
    remain Arc investigation work. See [the report](field-tests/arc-restore-ui-2026-11-24.md).
