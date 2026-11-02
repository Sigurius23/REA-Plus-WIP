# Arc retest after publication — 2026-11-02

Items **38–40 pass a fresh offline Arc retest** after publication in
`3a3b6c438e7f580d8b9d9982b34197f2ecffb948` on `Sigurius23/REA-Plus-WIP/main`.
No new product defect was reproduced in this scope. REA+ now exposes the packed
resources and more native feature paths, while full Arc behavior remains
incomplete. The earlier [fix verification](arc-fixes-2026-11-02.md) records the
source tests and package gates; this report records the subsequent app run.

## Input and authority

The target remains `/Applications/Arc.app`, **1.171.0 / build 89666**,
`company.thebrowser.Browser`. Fresh public `inspect_artifact`, `inspect_plist`
and `inspect_macho` Evidence is retained under
[`identity/`](arc-retest-2026-11-02/identity/).

The original universal executable is **166,692,288 bytes**, SHA-256
`e82d2a4245b6239860e41a149cb31c0c030e35b383456544c81f21d45ee03376`.
Its identity matches the earlier field test before any prior address is reused.
Supplemental `/usr/bin/lipo` preparation produces the exact arm64 slice at
original offset **86,622,208**, length **80,070,080**, SHA-256
`085056cad2197ab3b87b6b54a5a0d36964c5d9e756ec451a5b6f0b478c8baae8`.
The original-to-slice relationship is recorded in
[`native/preparation.json`](arc-retest-2026-11-02/native/preparation.json).
Ghidra analyzes that derived slice; dispatch-metadata reads retain the original
universal-file identity and offsets.

All recovery uses shipped artifacts and the public CLI/MCP. Arc, its helpers
and shipped resource code were not executed. No UI, browser profile, account,
service or live endpoint was selected. Ghidra and REA+ workers run as analysis
tools. Source-text review and lipo preparation are explicitly supplemental.
The installed supported Node **24.22.1**, npm **10.9.2**, Ghidra **12.1.4** and
OpenJDK **27** were reused without installing a replacement toolchain.

## Chromium resources: item 39

The main pack has **5,414 canonical entries + 382 aliases = 5,796 IDs**.
Six public pages exhaust the index with unique sorted IDs, and every alias
matches its canonical payload range, hash and index. The scale pack confirms
**319 + 68** and the English locale pack **12,470 + 2,215**. Only the first
locale identity was paged; this is not an exhaustive locale-content review.

Twelve selected IDs were decoded. Among the useful recovered static assets:

- **14552:** HTML/JavaScript selects the missing-extension versus
  blocking-extension list and inserts entries as text nodes.
- **14565:** incognito-page code observes theme changes and updates background
  and theme CSS. The text preview is truncated; the complete returned decoded
  hex payload is retained and independently hash-checked.
- **14558 / 14548:** extension manifests declare the internal extension and a
  Google Docs Reading Mode helper. Permission and script-path declarations do
  not establish enabled integrations or executed scripts.
- **14633 / alias 14634:** Chromium Brotli decodes both to the same **1,213**
  vector-command text bytes. Their original filename and feature remain unknown.

ID **14544** returns exactly identical complete CLI/MCP Evidence. Stored-byte
selection fits an 800-byte policy while decoding the same entry correctly
refuses its 1,222-byte output. A 15-byte file cap and an absent ID return the
expected typed errors. Compression markers on unselected entries remain codec
candidates, not successful decompression claims.

The [resource findings](arc-retest-2026-11-02/resources/findings.md),
[capture summary](arc-retest-2026-11-02/resources/capture-summary.json) and
[finding ledger](arc-retest-2026-11-02/resources/finding-ledger.json) link the
complete public results to each observation. Numeric pack IDs carry no original
filename/MIME registry; resource-to-feature attribution remains partial.

## Loose JavaScript: item 40

An explicit `**/*.js` scope beneath `Contents/Resources` covers exactly three
scripts, **30,640 text bytes / 6,594 AST nodes**. All three retain complete
syntax/static facts and module IR. The fresh parent is
`ev_2b912b006e85b86dad751b5e7bad554cbed02c7df215ac4379748a0bd400f44b`.

The endpoint view returns **zero candidates**. The `searchParams/get` read at
`EaselExportViewer.js:446` remains in the semantic graph, so omission did not
produce this correction. It does not imply that Arc has no network behavior.

Five focused public traces follow `DisableInlineLinks` beyond inventory:
helper callers resolve, and the local `url` binding reaches argument zero at
line 33 through three read/alias relations. Backward provenance stops at
`getAttribute`; callback targets, DOM calls and external `open` remain unknown.
All five traces are partial. The complete graph has **5,028 nodes / 4,948
relations / 1,503 unknowns**, with no reported node/relation omissions.

Supplemental inert source review corroborates the capture click listener,
anchor/ancestor lookup and `open(url, "_blank")` behavior. Those observations
are labeled separately and do not fill unresolved REA+ semantic fields. See the
[JavaScript findings](arc-retest-2026-11-02/javascript/findings.md) and
[source-review record](arc-retest-2026-11-02/javascript/supplemental-source-review.json).

## Native metadata and feature paths: item 38

The explicit **256 MiB** whole-file snapshot policy admits the original
universal executable. A 2,000-record Swift-vtable pass yields **659 dispatch
slots / 1,042 relative pointers**. The conformance pass yields **297 conformance
records**, with **49 decoded**, **163 dispatch slots** and **1,540 relative
pointers**. Unsupported layouts and budget limits remain explicit.

Objective-C passes at 2,000 and 5,000 records exhaust admission before class
records. A fresh public CLI pass at the advertised **20,000-record** maximum
recovers **871 class/metaclass records** (**436 class / 435 metaclass**),
**384 protocol records**, **3,052 method implementations** and **2,178 ivars**.
The source reader admits protocol records before classes under a shared budget;
the expanded policy demonstrates that the lower-budget empty class arrays do
not establish absence. This is not recorded as a new defect. Coverage remains
partial at the maximum, with unresolved ivar pointers and unrecovered category
coverage. The complete result is
[`objc-max-records.cli.evidence.json`](arc-retest-2026-11-02/native/objc-max-records.cli.evidence.json),
Evidence `ev_e38d620dbc1ec546c3157d2e3de18e28082af6f727808494935ac38693d6912f`.

Ghidra uses the explicit **60-second bounded analysis** profile. The settled
Program remains partial: `analysis_complete: false`,
`analysis_timed_out: true`. The first pass recovers the gallery entry/dispatch,
command entry and sidebar cursor routine, but two downstream addresses have
no recovered procedure. A second public run uses five function-entry seeds
derived from the first pass's actual instructions, with the original caller
Evidence IDs preserved in
[`seed-provenance.json`](arc-retest-2026-11-02/native/seeded/seed-provenance.json).
All **five functions are created**, and all five dossiers succeed. These are
caller-established entries, not claims of automatic Ghidra discovery.

| Path | Recovered result | Still unknown |
| --- | --- | --- |
| Gallery wrapper `0x100231fd8` → dispatcher `0x1001ecfa8` → callback `0x100231f00` | The wrapper supplies the callback. Its recovered 216-byte body accesses `_viewStore` and builds/sends an enum payload through another helper. | Concrete enum case name, final store handling and UI route. Decompiler register/type warnings remain. |
| Command entry `0x1005381a0` → helper `0x100537fac` | The 500-byte helper invokes `JSONDecoder.decode`, weakly loads `_uiDelegate` and conditionally invokes a function pointer at offset `0x100` in the delegate dispatch structure. | Concrete decoded type/command cases, dispatch target, authorization and observed outcomes. An unreachable-block warning remains. |
| Sidebar `cursorUpdate` path `0x1000cbd30` | Focused helper recovery resolves the `resizeLeftRightCursor` selector at `0x103635460`, the state-helper tail call and fallback accessor. | State-helper predicate, actual hit region, active runtime state and user-visible cursor changes. |

The seeded dossiers are complete public records under
[`native/seeded/`](arc-retest-2026-11-02/native/seeded/). They establish static
code paths; the remaining types, indirect targets and feature boundaries are
not inferred from naming alone. No emulator or target-runtime check was run.

## Verification and recording integrity

Retained captures contain **69 MCP calls: 63 successes, five expected errors
and one environmental error**. The expected errors are three resource-boundary
checks and two missing Ghidra procedures before seed recovery. The initial
JavaScript sandbox startup failed because swiftc could not write its clang
module cache; the exact error and partial reference are preserved. Host
execution resolved that prerequisite. Its failed result is not promoted to
successful analysis coverage.

The root [verification receipt](arc-retest-2026-11-02/verification-receipt.json)
revalidates every retained successful call against its actual advertised
input/output schemas and named contract, text/structured equality and Evidence
authentication. It authenticates **58 standalone records**, **six bundles / 39
record occurrences**, and **six retained CLI outputs**. The retained
20,000-record CLI invocation exits zero and repeats an earlier exploratory read
with the same Evidence ID. The other five retained CLI outputs are the three
identity checks and two resource selections.

The first native recorder closed after its continuation window, without a
live-ledger export. Its nine authenticated public records are assembled into
[`selected-records-bundle.json`](arc-retest-2026-11-02/native/selected-records-bundle.json),
explicitly a selected-record bundle. The seeded run performs an actual public
export and explicit close; its seven-record export is separately authenticated.
Standalone metadata Evidence whose original-file subject differs from the
active thin slice remains preserved outside that target-filtered export.

Eight successful worker sessions report verified ownership with empty live
descendant snapshots after close. The sandbox startup and zero-operation
resource discovery had unavailable OS lineage and are not counted as verified
cleanup. These snapshots do not assert perpetual process absence.

Two recorder envelopes originally repeated complete input Evidence eight times.
Their arguments are now lossless `$json_file`/`select` references to durable
complete records. Re-expansion was checked for exact parsed-JSON equality
before replacement; original/compacted hashes and the temporary raw backups
are recorded in the
[compaction receipt](arc-retest-2026-11-02/input-compaction-receipt.json).
Complete Evidence, public replies and source bytes were unchanged by this
recording compaction. This avoids committing a redundant invocation file above
GitHub's regular-file limit.

Final integrity re-reads all **782 previously inventoried regular files /
860,945,885 bytes**, with **zero mismatches** against the original field test.
The [integrity record](arc-retest-2026-11-02/target-integrity.json) does not claim
complete directory-set, symlink-target or runtime-state verification.

Run the recorder audit from the repository root with the supported Node:

```sh
node field-tests/arc-retest-2026-11-02/verify-recordings.mjs
```

This helper validates recordings and rewrites its own receipt/selected bundle;
it does not rerun providers. Public invocation inputs, actual catalogs, full
replies, original driver input and bounded-profile settings remain alongside
the results. The fix batch's 77 source tests / 11 files, source/docs/package
gates and pre-publication `check:fast` remain recorded in the earlier fix
report. This retest introduces no production changes and does not claim a new
full `check:pr` run.

## Remaining investigation

Items 38–40 remain done; this pass adds no new numbered REA+ issue. Full Arc
feature/design analysis is still open: only selected Boost/sidebar paths,
three loose scripts and twelve packed-resource selections were examined in
depth. Large parts of native code and Chromium, indirect runtime targets,
resource routing, feature flags, animation/layout, account/network behavior
and persistence are not established. The bounded metadata and partial Ghidra
coverage must remain visible in any subsequent feature claim.
