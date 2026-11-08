# Arc: protocol/type conformance discovery repair

2026-11-08, Europe/Berlin. Source parent:
`618f58d3df4229db8287b1c7968748258a64ba2b`. This repairs item **51** from the
[delegate/evaluator investigation](arc-dispatch-2026-11-06.md).

The supplied Arc **1.172.1 / build 90370** DMG remains the target. The derived
ARM64 executable is **80,498,448 bytes**, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The renewed [integrity check](arc-conformance-discovery-2026-11-08/target-integrity.json)
verifies the DMG, original executable, derived slice and all **1,113** extracted
regular files against the original extraction commitments. No Arc/helper/script
was executed; there was no UI, profile, account, service or network access by
the analysis. Owned Objective-C/Swift fixtures were compiled and inspected,
never run. Binaries and compiler caches remain outside Git.

## Change

`inspect_native_dispatch_metadata` now accepts `swift_conformance_filter` with
an exact local `protocol_name`, `type_name`, or both. Both constraints are ANDed.
CLI exposes `--swift-protocol-name` and `--swift-type-name`. The filter requires
`facet: "swift-conformances"` and cannot accompany an exact conformance address.
Symbol-only fallback cannot satisfy binary discovery.

Identity discovery scans the complete conformance index before admitting
matching witness decodes. It uses the existing relative-pointer/fixup reader,
so distinct indirect alias slots resolve to the same underlying protocol.
Known matches receive admission before uncertain identities. The result records
index entries examined, matches, admitted decode attempts, unresolved identities
and bounded unresolved records with pointer/bind evidence. Those records and
their pointers consume the same aggregate `max_records` budget. Retained
selector memory is bounded by that budget; the scan still counts all entries.

Names are case-sensitive local metadata names, without a module-uniqueness
claim. Imported or malformed requested identities remain unknown. A known
mismatching requested constraint excludes a row even when another identity is
unknown. Index selection and witness decoding have separate coverage; neither
an empty match list nor a fully examined index establishes global absence
while requested identities remain unresolved.

## Arc retest

All six queries examine **22,066** index entries. The first five use a
512-record aggregate budget; the last deliberately uses 16.

| Query | Known matches | Admitted decodes | Unresolved identities |
| --- | ---: | ---: | ---: |
| Protocol `WebContentUIDelegate` | 2 | 2 | 19,481 |
| Protocol `SelectorPickerWebContents` | 1 | 1 | 19,481 |
| Type `BoostsEditorWindowContent` | 4 | 4 | 401 |
| Editor type AND UI-delegate protocol | 1 | 1 | 32 |
| Deliberately missing type name | 0 | 0 | 401 |
| UI-delegate protocol, 16 records | 2 | 1 | 19,481 |

The two UI-delegate descriptors are **`0x103744f38`** (`WebContentFrame`) and
**`0x10378a2a0`** (`BoostsEditorWindowContent`). The selector adaptor is
**`0x10378c760`** (`WebContentsAdaptor: SelectorPickerWebContents`). The editor
also conforms locally to `WebContentNavigationDelegate`,
`WebContentOverscrollDelegate` and `MovableWindowContent`. These are now
discovered by public name queries, without supplemental descriptor preparation.
The tiny-budget result preserves both known matches while admitting only the
first decode; omitted decodes are not silently reported as absent.

The unresolved counts are intentional limitations: most protocol names live
outside this image, and some type-reference layouts remain unsupported. The
missing-type query therefore does **not** prove absence from every conformance.
The selector adaptor's runtime-instantiated witness template still has no
decoded dispatch slots; that is the separate open item **52**.

[Verification](arc-conformance-discovery-2026-11-08/verification.json) authenticates
all six CLI/MCP Evidence pairs, compares subjects, parameters and normalized
results, checks the specific descriptor addresses/counts and aggregate budgets,
and authenticates the exported six-record bundle. This artifact-only profile
has no upstream Ghidra analysis profile; it is not a whole-image decompilation.
The final MCP session has **9 successful calls**, including export and close,
and verified empty owned descendants.

The initial recorder plan used the nonexistent name `export_evidence` after
six successful reads. Its local catalog assertion failed, and shutdown verified
empty descendants. The corrected plan uses `export_evidence_bundle`; the first
plan and failure are retained under `mcp/`, with the final run under `mcp-final/`.
This was a caller error, not an additional REA+ defect. Real CLI/MCP comparison
also caught a new filter-default parameter mismatch during implementation; the
CLI now preserves the same explicit null defaults, and all comparisons pass.

## Verification and remaining work

- **99 source tests passed** across seven files: metadata readers/fixups,
  historical omission, late-match admission, indirect aliases, exact-name
  intersection, uncertainty, and application validation/fallback behavior.
- The [real Apple verifier](arc-conformance-discovery-2026-11-08/apple-verification.json)
  passed **10** compiler/link/strip variants and **5** new compiled CLI/MCP
  discovery queries on an owned stripped Swift library. Actual advertised
  schemas, named contracts, canonical Evidence and text/structured equality
  were checked. The missing-type fixture has fully classified identities and
  zero matches; imported protocol bind identity survives a type-only query.
- Build, typecheck/lint, generated-documentation checks and final whitespace
  checks passed. The compiler verifier keeps Swift's module cache under its
  owned temporary directory. No full `check:pr` or model-driven tool-selection
  evaluation is claimed.
- The [capture audit](arc-conformance-discovery-2026-11-08/evidence-audit.json)
  authenticated **18** standalone records (**6** unique Evidence identities,
  shared across CLI and both MCP runs) and **1** six-record bundle, with no
  failures.

Item **51 is complete within this static metadata profile**. Items **52**
(generic witness templates) and **53** (Ghidra disk-capacity diagnostics)
remain open. Arc's command closure effects, bootstrap/injection, persistence,
overlay rendering/coordinates and extension loading remain separate research
questions; this repair does not establish complete Arc behavior.
