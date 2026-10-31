# HeyClicky-driven REA+ fixes — 2026-10-28

This records verification of OPEN_TASKS items 30–35 in numerical order. The
[original field test](heyclicky-macos-1.1.1.md) remains the pre-fix baseline.
HeyClicky stays closed; target services and user application data are outside
this offline work. No target binary is changed or added to Git.

## Item 30 — endpoint receiver provenance: done

The shared lexical pass now distinguishes recognized network APIs, keyed
collections and extension storage before endpoint extraction. It follows
statically supported aliases/projections and rejects proven authority after
visible assignments/member writes, ambiguous initialization and shadowing.
Chrome/browser storage retains `extension-storage`, area, API identity and key.
URL-shaped keys do not override the receiver identity.

Unknown custom clients such as `api.get("users")` remain candidates. Their
`network_receiver` is explicitly `unknown`, and their graph evidence is a
low-confidence inference. Recognized API identity is static information, not
proof that a request executes. Historical missing metadata is not reconstructed.
Worker serialization, captured-web findings and the endpoint view preserve it.

- Build succeeded; `check:fast` passed typecheck and lint.
- **37 focused tests passed** across five files, including real compiled
  CLI/MCP endpoint workflows, extension-storage/view coverage, template/value
  preservation, lexical shadowing, receiver mutations and cooperative traversal.
- New scoped HeyClicky analysis completed, six JavaScript files, zero parse
  failures, Evidence
  `ev_663f4ca8aa3f1be685fd17f1e77a659d26ba20b71df953478cf92c447f4a03b2`.
  All four former storage-key endpoints are now storage observations with the
  original local/session area. The endpoint collection contains one
  `content-type` candidate with unresolved receiver identity; it does not assert
  that a header lookup is a network operation.
- Raw retest: `/tmp/rea-heyclicky-30-heyclicky.json`.
  Test log: `/tmp/rea-heyclicky-30-focused.log`.
  Static checks: `/tmp/rea-heyclicky-30-check-fast.log`.

An initial fresh target retest did not execute because automatic approval
review reported a usage limit. Retrying through the same approval mechanism
after the reported reset succeeded. The sandbox/access boundary was preserved.

## Item 31 — browser/Electron provenance: done

Scripted HTML now has a generic `web-document` identity, with its source,
script-load links, locations and unresolved references preserved. Explicit
Electron roles remain separate. Runtime reconciliation can match an explicitly
supplied page/frame capture without changing the static document into Electron.

Sender-like checks now retain a generic facet and transport provenance.
Only supported inline Electron callback parameters and their exact immutable
aliases/projections enter the Electron facet. Chrome/browser callback senders
retain their own origin; shadows, reassignments, visible mutations and unresolved
helper argument flow do not acquire that authority. Every check still reports
unknown enforcement.

- Build, typecheck and lint passed. The affected 12-file lane verified 160
  tests and exposed two overly strict new nested artifact matchers. After
  correcting those matchers to preserve the valid `artifact_id`, all 23 HTML
  boundary checks passed; 162 distinct checks are covered by these runs.
- Real compiled CLI/MCP cases, Electron controls, sender aliases/projections,
  shadow/mutation cases, HTML/resource path matrices and runtime reconciliation
  were exercised. Logs: `/tmp/rea-heyclicky-31-focused.log`, its `.stderr`,
  and `/tmp/rea-heyclicky-31-html-final.log`.
- Fresh scoped HeyClicky analysis succeeded, Evidence
  `ev_a60c0e545a01f34677208b3f98ff53f4bb01bb97e27dc83714939474e88bc45b`:
  **two web documents, zero Electron roles, zero Electron sender checks**.
  One generic sender comparison retains `transport: "unknown"` and the exact
  `chrome.runtime.id` expression. Its `(...args) => handleMessage(...args)`
  forwarding is outside the admitted direct-callback provenance model.
  Raw Evidence: `/tmp/rea-heyclicky-31-heyclicky.json`.

## Item 32 — native facet budget ownership: done

The public CLI/MCP selector directs one unchanged aggregate `max_records`
budget to `all`, `objc`, `swift-conformances` or `swift-vtables`. Each family
owns its exhaustion status; later work cannot retroactively truncate a completed
family. Unselected families report `not_requested`.

- Build, typecheck/lint and 48 source tests passed.
- Ten real source-built Objective-C/Swift fixture variants passed, including
  legacy dyld-info, chained fixups, stripped symbols and arm64e Objective-C.
  Actual SDK-advertised schemas were validated through AJV and CLI/MCP
  selection/results compared. The first verifier incorrectly assumed an inline
  enum; it now checks the schema's semantics, including shared `$ref` definitions.
  Log: `/tmp/rea-heyclicky-32-real-fixtures-reviewed.stdout`.
- HeyClicky Swift-only requests recover **1,448 vtable slots** (Evidence
  `ev_9fa68f8aec71c8f4404bbb08b86659fb98afb49542e15bf531af6cbdbce3e36a`)
  and **17 decoded conformances / 102 witness slots**, examining all 4,036
  conformance entries (Evidence
  `ev_5bf1259492fc357196876293551f074c457e175467653218452f9d8952e647c4`).
  Unsupported Swift layouts and external references remain explicitly partial;
  this does not claim complete Swift recovery. Raw results are
  `/tmp/rea-heyclicky-32-heyclicky-{vtables,conformances}.json`.

## Item 33 — external Swift references: done

Swift indirect-relative decoding preserves the dyld bind union instead of
turning external/unsupported pointers into zero. Records separate the descriptor
field, intermediate slot, final file-backed target and external identity
(symbol, library, weak flag, decimal addend). External layouts remain unsupported;
partial conformances retain available local names, with external protocol/type
names null and bindings recorded separately. Historical absent fields stay absent.

- 40 source tests, build, typecheck/lint passed. The real verifier passed ten
  compiled source fixture variants with an `ExpressibleByArrayLiteral`
  conformance, including stripped dyld-info/chained binaries and actual CLI/MCP
  schema/result parity. Log: `/tmp/rea-heyclicky-33-real-fixtures-final.stdout`.
  Its first new assertion incorrectly required a static witness address;
  the real fixture proved that address can be absent, and the check now verifies
  retained conformance location without inventing a witness table.
- HeyClicky Evidence
  `ev_22deefe20166cc9a3288fd1399aebb6757181d1c8d249512e9b5b687e8bd1f7c`
  retains field `0x102dec794`, slot `0x10330df28`,
  `_$ss25ExpressibleByArrayLiteralMp` from
  `/usr/lib/swift/libswiftCore.dylib`, weak false / addend `0`, and local type
  `ReadingOptions`. Final target and decoded protocol name remain null.
- Additional preserved conformance facts consume the unchanged aggregate budget:
  this run examines/retains 3,329 conformances with 16,649 relative pointers and
  22 witness slots, explicitly partial with `max_records_reached`. The item 32
  counts above record its earlier verification, before this added retention.
  Raw result: `/tmp/rea-heyclicky-33-heyclicky-conformances.json`.

## Item 34 — syntax versus static-fact coverage: done

Fresh source/checkpoint and asset observations now include actual
`syntax_parse_status`, `static_facts_status` and
`unresolved_static_occurrences`. The latter counts discovery occurrences, not
unique facts; fatal parsing leaves it unknown. `parse_status` remains the legacy
aggregate for compatibility. Historical missing split metadata is `not-recorded`,
and an incomplete legacy aggregate does not by itself establish syntax failure.
Graph and observation coverage retain known static-fact gaps.

- 43 domain tests and 50 focused compiled CLI/MCP, worker checkpoint/recovery,
  artifact transfer and retained-view checks passed. Typecheck and targeted lint
  passed; test discovery found all 929 files exactly once. Logs:
  `/tmp/rea-heyclicky-34-focused.log`, `/tmp/rea-heyclicky-34-discovery.log`.
- The public test changes source bytes after analysis and proves both CLI and
  MCP views keep the original source-bound statuses.
- Fresh HeyClicky Evidence
  `ev_4c070e70954eb6b540beb6c5a73e5b7acb2b8b3289751c164b2b17ca1fcfe995`
  has six JavaScript files, zero parse failures and exactly one file with issues.
  `background.js` has syntax complete / zero errors, static facts partial / one
  unresolved occurrence, and complete retained module IR. Its file-status page
  reports `analyze-static-facts`, with no `parse-javascript` issue.
  Raw Evidence: `/tmp/rea-heyclicky-34-heyclicky.json`; retained view:
  `/tmp/rea-heyclicky-34-file-statuses.json`.

## Item 35 — useful bounded Ghidra analysis and truthful startup diagnostics: done

`REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS` explicitly selects a separate bounded
profile. Default complete-only admission is unchanged. The bridge must echo the
exact budget and may serve a partial Program after auto-analysis has settled
and its transaction has closed. Ghidra requests cooperative cancellation at the
analysis deadline; the outer `REA_GHIDRA_STARTUP_TIMEOUT_MS` still bounds import,
analysis settlement, repairs, bridge setup and readiness. The supported seconds
range is 1–2,147,483: Ghidra 12.1.4 multiplies seconds by 1000 as a signed Java
integer, so larger accepted Java integers would overflow its timer.

Every provider observation retains measured completion/timeout flags. Composed
workflows now retain upstream limitations in deterministic order, and their
profile revision prevents older unqualified composed records replaying as the
new contract. Exact recorded primitives remain reusable without inventing
missing historical flags. An atomic expected-handshake-object check prevents
results after a restart from inheriting the previous launch's analysis state,
even when the session's configured run UUID is reused.

Startup timeout errors retain the public operation, provider operation, startup
stage and bounded redacted diagnostics. Remediation names the real settings and
reopen requirement; unchanged startup retry is not promised to succeed. Errors
no longer tell `binary_overview {}` to shrink nonexistent request-size arguments.

- Source/config/error/workflow checks passed; affected process/MCP lane passed
  **60 checks with one host-specific skip**. The strengthened identity/wire
  cases and provider checks also passed after their fixture expectations were
  updated. Snapshot regression lanes passed **52 checks**. Full static `check`
  passed typecheck, lint, formatting, unused-code checks, metadata and architecture
  guards. Logs: `/tmp/rea-heyclicky-35-*.log`,
  `/tmp/rea-heyclicky-final-static.log`.
- Real source-built C fixtures passed both default and bounded profiles,
  including actual advertised schema checks and **exact CLI/MCP Evidence parity**.
  Both finished analysis; their budgets/profiles remain distinct. Initial
  overviews took 14,985 ms and 12,914 ms, including MCP setup. A first verifier
  assumed an undecorated C symbol; it now resolves the source-owned procedure
  from the actual inventory. Successful records:
  `/tmp/rea-heyclicky-35-fixtures-reviewed/summary.json`.
- **HeyClicky main now returns useful deep-provider results.** The same arm64
  derivation with a 60-second cooperative analysis budget returned its initial
  overview in **143,433 ms from MCP startup**, with **19,880 procedures,
  60,845 defined strings and 59 memory blocks**. These are inventories of the
  resulting partial Program, not complete app counts. Measured state is
  `analysis_complete:false`, `analysis_timed_out:true`, budget 60 seconds.
  Overview Evidence:
  `ev_d76fc7bdc571e6a2dc8eedfc354308cb6b7edd6be8d5f2f0d997da96296f1a49`.
- Ghidra returned 813 characters of pseudocode for
  `NotchPanel.constrainFrameRect:toScreen:` at `0x10132f900`, Evidence
  `ev_7c470bbfbe079494b46111270e48d1225e31bb93bf2d820943ea9ca7854a447d`.
  This Objective-C thunk calls `FUN_10132f8c8`; calling convention/register
  warnings remain. It does **not** establish the original Swift source or the
  notch geometry formula. Main retest used MCP; the fixture lane covers CLI.
- Target digest stayed unchanged, close succeeded, the owned runtime was removed,
  and the token-verified final lineage observation had no live descendants.
  Raw replies: `/tmp/rea-heyclicky-35-main/`. The original 903,183 ms failed
  complete-only pass remains a failure in the baseline report.

A [compact verification receipt](heyclicky-fix-verification-2026-10-28.json)
preserves exact raw-file hashes, Evidence IDs, profiles, counts and the focused
pseudocode. Raw full Evidence remains local; no target binaries are added to Git.

## Final repository gate — passed 2026-10-29

The first attempt stopped at an unused synchronous sender-origin wrapper, which
was removed without changing the production cooperative path. Full static
checks then passed. The next full run, recorded at
`/tmp/rea-heyclicky-final-check-pr-reviewed.log`, exited 1 after 2,505.36 seconds:
899 files / 8,459 tests passed, 14 files / 15 tests failed, and 16 files /
274 tests were skipped. Thirteen failures were timing deadlines during repeated
host sleep; two were canonical/translated README link-parity checks caused by a
new link target. That link was corrected while keeping the bounded-setting text.

All **15 exact failed cases passed** on the approved host in 74.27 seconds,
with existing time budgets and one worker. Log:
`/tmp/rea-heyclicky-final-failed-subset-host.log`. An earlier sandboxed rerun
could not compile the native process-ownership helper in three cases because
clang ModuleCache writes were denied; those cases passed with host access.

The fresh full gate **passed (exit 0) on 2026-10-29**: **913 files / 8,474 tests
passed**, **16 files / 274 tests skipped**, zero failures. The test phase took
1,000.69 seconds. Typecheck, lint (865 warnings, zero errors), resolved module
boundaries, formatting, unused code, package metadata, documentation/generated
contracts, jscpd (**2.49% duplicated lines**) and tech-debt scanning passed.
Provider skips do not establish real-provider coverage; the matching real
Apple/Ghidra lanes are recorded separately above.

Final log: `/tmp/rea-heyclicky-final-check-pr-awake.log`. Its exact size and
SHA-256 are in the compact receipt. The command's temporary idle-sleep assertion
ended with it; persistent sleep settings were unchanged.

## Local Evidence storage maintenance

The host volume filled during this work. A redundant generated 130 MB view
request and reproducible build cache were removed. Four intermediate Rize
Evidence files were losslessly gzip-archived, verified by streaming the
decompressed bytes against each original SHA-256, then their redundant raw
copies retired. The final Rize Evidence and all HeyClicky captures remain raw.
The [archive manifest](rea-local-evidence-archive-2026-10-28.json) records
original/archive paths, byte counts, hashes and restoration commands. No user
source, target binary or unique Evidence content was discarded.

All six HeyClicky-driven items (30–35) are implemented and verified within the
scopes above. The full repository gate passed on 2026-10-29.
Nothing in this batch has been committed or pushed.

## Fresh retest follow-up — 2026-10-29

The [fresh installed-app retest](heyclicky-retest-2026-10-29.md) reproduces the
original six checks and obtains additional partial notch-panel inspection.
It also confirms a regression introduced by item 30: receiver facts keyed only
by a call's start offset leak storage authority into chained `.then`/`.catch`
calls. This is now **open item 36** in [OPEN_TASKS.md](../OPEN_TASKS.md).
The earlier passing gate did not cover this case. This follow-up changes notes
only; the regression has not yet been fixed.

A subsequent implementation on the same date fixes item 36 with exact AST
call identity across static and captured-web analysis. Thirty domain and 13
compiled CLI/MCP/worker tests pass; the new shipped-extension result retains
seven storage facts and no false continuations. See the
[fix receipt](heyclicky-36-verification-2026-10-29.json). The earlier full gate
predates this focused correction; it was not rerun. App-feature investigation
continues separately from these tool checks.
