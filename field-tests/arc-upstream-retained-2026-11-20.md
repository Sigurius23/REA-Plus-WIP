# Arc-focused upstream update and retest — 2026-11-20

The first bounded upstream slice is complete: native function summaries retain
the complete Evidence, then serve selected native pages. On the fixed Arc
reducer, MCP delivery falls from about **9.3 MB to 31,084 bytes**. Its retained
parent is exactly the historical baseline record
`ev_7820ea6368f520cd61483866fba5814ed0c4a1661bb9cc22d4c6f15a6806a139`.
All **28 switch mappings**, **10,072 body bytes**, **2,518 instructions** and
their complete proof remain unchanged.

## Baseline preservation

Before changing source, committed the existing Arc handoff, dossier, fixture
sources and retained text captures in **`d62dd2f4f826f20cc54bfa22bade6d4cf102799e`**.
The commit and annotated tag `arc-baseline-before-upstream-2026-11-20` were
pushed to the existing WIP repository. The checkpoint contains 1,993 selected
text files; [its manifest](arc-baseline-2026-11-20/manifest.json) binds the
pre-existing supporting materials. Input binaries, the user DMG, provider
projects, caches and the two large Rize JSONs remain local.

## Scope of the update

- `analyze_function` accepts opt-in `detail: "summary"` in a retaining MCP
  session. The full parent is recorded before summary delivery. Its exact
  retained ID selects the existing native facets without provider reanalysis.
- `detail` belongs to delivery; it is removed before provider dispatch and
  absent from the parent's parameters. Default complete delivery is unchanged.
- Summaries retain limitations and distinguish missing optional collections,
  unavailable value flow and unknown availability of empty legacy pseudocode.
  Counts describe retained rows, not complete behavior or coverage.
- The CLI accepts `function --detail summary --evidence-output <new-bundle>`.
  A new portable full bundle is required because the CLI session closes. An
  existing destination is refused before target admission; writes never
  overwrite it. Typed native and cleanup failures retain their existing path.
- The authored skill advances to version 44; the package still exposes
  **205 tools / six prompts**. Dependencies and native provider semantics are
  unchanged.

This adapts upstream's retained-function summary workflow to the existing REA+
contracts. The local complete default and unknown/null distinctions are
preserved. It does not import the whole upstream schema tree.

## Why Program persistence remains open

The audited upstream
[checkpoint admission](https://github.com/morluto/rea/blob/f7849cad3fe3bffb207b4dc30f34394978c20297/src/ghidra/GhidraProvider.ts#L540)
rejects analysis seeds, extensions and language/analyzer overrides. The current
Arc workflow explicitly uses a 2,038-entry seed overlay and the local Swift
producer. A direct stock checkpoint port cannot serve that workflow. Its
storage/lease implementation also depends on upstream resource-ownership
infrastructure absent from this checkout.

As agreed for changes requiring a broader migration, that port is deferred in
item 62. It needs seed-compatible profile identity, producer/source commitment,
save/restore qualification and truthful cleanup/recovery ownership. Result
snapshots and portable Evidence bundles do not save a Ghidra Program. No
automatic Program persistence or existing-project selection is advertised by
this slice.

## Verification

Host: macOS arm64, Node **24.22.3**, Ghidra **12.1.4**, existing JDK 27.
No engine or unrelated software was installed or upgraded.

- **44 focused tests / six files pass**, including an >10 MiB dossier,
  retained Unicode and instruction pages, default complete delivery, legacy
  unknowns, fixed-server refusal, producer validation, portable CLI export and
  destination refusal before target admission.
- Typecheck/lint, built documentation and metadata checks pass. Test discovery
  finds all **955 files exactly once**; this is discovery, not 955 passing tests.
- Isolated package install/update/CLI/MCP/setup verification passes:
  **205 tools / six prompts**, verified empty owned lineage.
- Real Arc MCP: **37/37 calls succeed**, advertised schemas validated with
  AJV2020 and canonical contracts, explicit first/repeat close succeed, and
  owned lineage is verified empty at `2026-11-20T20:37:17.418Z`.
- Real CLI: fresh offline reducer analysis, portable bundle export, identical
  CLI/MCP summary and source parent, **15,333 stdout bytes**, verified empty
  owned lineage at `2026-11-20T20:40:53.072Z`.
- [The verifier](arc-upstream-retained-2026-11-20/verify-results.mjs) authenticates
  32 standalone Evidence records, 37 replies, three bundles and all **1,868
  frozen runtime files**. Bundle record counts are 11 / 33 / 1.
- Native bridge SHA-256 remains
  `87bcc80b777c1ff15e0997f9cc132cd8444544158df6ed0b21677618e67970e2`;
  Swift switch producer SHA-256 remains
  `558e14b134d1236bb9101296efd0844db382d7b5428f459ef8330fe3be19ba48`.

The complete control call used the existing result snapshot and correctly adds
one limitation saying the provider was not rerun. That changes its Evidence ID
and raises its serialized reply to **9,298,362 bytes**. Its raw and normalized
results equal the retained parent; the fresh parent itself equals the saved
baseline. The five selected MCP pages are **30,912–82,334 bytes**. The response
budget remains **10,485,760 bytes**.

An initial CLI recorder failed before provider launch because it treated a
file URL pathname as a filesystem path containing spaces. The recorder now
uses `fileURLToPath`; its original failure log is retained. This was a verifier
error, not an REA+ analysis failure.

The previous 102-case Swift recovery matrix was not repeated: native analysis
code is unchanged. Full `check:pr` was not rerun. The current source and public
Arc workflows above establish this delivery slice's coverage.

Machine results, plans, raw replies, source selections and logs are under
[arc-upstream-retained-2026-11-20/](arc-upstream-retained-2026-11-20/), especially
[verification.json](arc-upstream-retained-2026-11-20/verification.json).

## Arc analysis resumed: selected State names

The same public MCP session reads the selected struct's field descriptor
`0x103eb510c`, its name and parent descriptor, then all 21 stored field names.
The selected context is **`BoostsEditor.State`**. The descriptor reports struct
kind 0, 12-byte records and 21 fields. Relative-pointer derivation follows
Swift's [reflection record layout](https://github.com/swiftlang/swift/blob/main/include/swift/RemoteInspection/Records.h),
with the shape and bounds checked against the returned bytes. Each name has
its own source-bound `read_bytes` Evidence.

The prior State descriptor observes field-vector word offset 2. Thus a key
`Fxx` below denotes a **hexadecimal metadata-vector byte offset**, with index
`(offset - 16) / 4`; it does not denote an instance's storage offset.

| Index | Trace key | Stored name |
| ---: | --- | --- |
| 0 | F10 | frameID |
| 1 | F14 | frameURL |
| 2 | F18 | modality |
| 3 | F1c | selectorPickerMode |
| 4 | F20 | showingAdvancedColorMapper |
| 5 | F24 | interstitialType |
| 6 | F28 | codeEditingWindowSize |
| 7 | F2c | css |
| 8 | F30 | js |
| 9 | F34 | font |
| 10 | F38 | textTransform |
| 11 | F3c | textZoom |
| 12 | F40 | zaps |
| 13 | F44 | colorScheme |
| 14 | F48 | type |
| 15 | F4c | boostID |
| 16 | F50 | boostData |
| 17 | F54 | changeStack |
| 18 | F58 | boostDataBeforeInteractiveUpdates |
| 19 | F5c | zapToPreview |
| 20 | F60 | hasDismissedJSWarningBanner |

See [state-field-bindings.json](arc-upstream-retained-2026-11-20/state-field-bindings.json)
for exact record/name/type addresses and supporting Evidence IDs. This binds
the earlier F24 and F60 traces to declaration names. Mangled field types,
runtime instance offsets, dependency implementations and durable storage
remain separate questions. No Arc executable or shipped JavaScript was run.
