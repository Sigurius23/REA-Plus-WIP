# Retained native inventory and batch pages — 2026-11-24

Item 62 now includes retained delivery for five native inventories/searches and
explicit decompilation batches. Complete inline delivery remains the default.
The implementation selectively adapts upstream
`f7849cad3fe3bffb207b4dc30f34394978c20297`; it preserves local provider,
checkpoint, Swift/Arc, Evidence and resource ownership behavior.

## What changed

`list_names`, `list_procedures`, `list_strings`, `search_procedures` and
`search_strings` accept `detail: "summary"`. The complete parent Evidence is
retained before its summary is delivered. `inspect_analysis_view` supports
`kind:"native-inventory"` with source-order pagination and optional fields.
`source_index` distinguishes even same-address alternatives; selecting value
also retains recorded string/decoding qualifications. Counts describe retained
provider observations; discovery coverage remains unknown.

`batch_decompile` supports complete/summary delivery and `batch-decompile`
item/body views. Filters apply before pagination; original indices preserve
duplicate selectors. Successful rows omit full bodies unless explicitly
requested. Indexed text pages use UTF-16 code units and avoid surrogate splits.
Each page identifies the complete batch and its committed decompiling provider.
It does not repeat the complete selector array, which could itself make a
one-row page too large. The original request remains in the retained parent.

Batch reads now admit one provider operation at a time. Original selectors,
canonical entries and entry-label failures remain separate. Null pseudocode
is `unavailable/no_pseudocode`; invalid or empty output is an error. Each item
keeps its own observation's caveats. Cancellation (including Hopper's typed
cancellation), startup/capacity failure and unconfirmed cleanup stop admission.
When available, completed-prefix facts retain the request and source identity
in the typed error's partial observation. Existing upstream partial observations
are preserved. Batch workflow revision 3 separates these semantics from older
replay identities; historical error outcomes are not reinterpreted.

CLI `native-inventory`, `batch-decompile` and existing `search` share complete
and summary delivery. Summary requires a new `--evidence-output` bundle before
provider admission; that full source survives process exit. The former
function-only delivery helper was replaced by the shared retained-analysis
owner. Canonical inventory/error schemas now have domain owners; shared
projection errors/text paging avoid additional runtime import cycles.

## Problems confirmed and solved

- The previous batch producer used unbounded Promise.all admission, discarded
  per-item observation caveats and converted null pseudocode into an output
  error. Ordered reads, explicit unavailable outcomes and retained caveats fix
  those representation/ownership problems. Real Ghidra's external puts function
  qualifies the null case. Cancellation and cleanup fixtures cover interruption
  during resolution, name lookup and pseudocode reads, with no further provider
  admission and a retained completed prefix.
- Native inventories and batches previously lacked summary/page delivery.
  Retained full parents, source indices and portable readback now provide it
  through the existing Evidence workflow rather than a second catalog/tool.
- The package verifier copied every tracked index entry even when its working
  file had been intentionally deleted during the CLI-helper rename. Its
  tracked-only snapshot now excludes Git-reported deletions. An unexpected
  disappearance after that observation still fails; ENOENT is not swallowed.
  `package-initial-failure.log` preserves the failure, and two full package
  verification receipts prove the correction before committing the rename.

The first Arc recorder configuration selected a 262,144-byte response budget,
which is below the supported 10 MiB minimum. It was rejected before tool
connection/analysis (zero calls, verified empty lineage). That was a test-input
error, not a product defect. The accepted run uses 10,485,760 bytes; the complete
procedure reply also succeeds. No artificial transport failure is claimed.

## Qualification

| Check | Result |
| --- | --- |
| Source/domain/service/composition tests | 107 passed |
| CLI/MCP boundary tests | 27 passed |
| Qualified public MCP | 47 calls: 46 successes, 1 expected unavailable-body view refusal |
| All completed public MCP generations | 158 calls: 154 successes, 4 expected body-view refusals |
| Qualified CLI | 8 calls: 6 successes, 2 pre-admission input refusals |
| CLI/MCP parity | Six complete Evidence records match exactly, including portable page readback |
| Frozen runtimes | Three generations, 1,892 packaged files each; final source/deletion commitments verified |
| Existing evidence | 28 historical snapshots authenticated against original commits |
| Process cleanup | 12 captured verifier lineages verified empty |
| Other checks | Type/lint/module boundaries, docs, build, package and discovery of all 967 tests passed |

The owned C fixture calls puts and defines a function returning input*7+3.
Clang compiled it for static analysis only. Its source/compiler receipt is
[owned-build.json](upstream-native-pages-2026-11-24/owned-build.json).
Target SHA-256: `7591fdfaf870b9c7ad2b398163b5c6cbb02cbc41c52273f232764b977882097a`.
The four-item batch keeps the function twice, the external function as
unavailable, and the missing selector as an error. Summaries resolve to the
same complete parent identity; concatenated body pages reproduce its text.
CLI complete output, summaries and portable views match MCP Evidence exactly.
Original source/target hashes were rechecked. The fixture was never executed.

The fixed Arc arm64 input remains SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Its existing verified checkpoint preserves 2,537 function seeds and the original
one-second partial analysis. The inventory contains **11,330 retained procedure
rows**; this is not exhaustive discovery of Arc functions. The complete SDK
reply occupies **7,926,542 UTF-8 JSON bytes**, versus **13,156 bytes** for its
summary (compact serialization, excluding the JSON-RPC envelope). Both fit the
supported 10 MiB budget; pagination provides selective consumption.

The reducer batch yields two successful duplicate selections and one explicit
missing-selector error. All **63,696 UTF-16 code units** reconstruct exactly
from **16 pages**, with the Ghidra identity and original batch index retained.
The independent instruction read still returns **10,072 bytes / 2,518
instructions**, with an Evidence record exactly equal to the previous checkpoint
study's warm reducer read. No native bridge or executable bytes changed.

The authoritative [verification receipt](upstream-native-pages-2026-11-24/verification-qualified.json)
binds runtime/source hashes, raw replies, exported complete parents, typed
refusals, exact parity, sizes and empty lineages. The checked-in snapshot is
text evidence; native binaries, Ghidra projects/checkpoints, dist and dependencies
remain local and outside Git.

## Limits and next work

Real provider qualification is macOS Ghidra 12.1.4. Other provider/host executions
and independent live-model tool-selection trials were not performed. Unicode,
missing identity, duplicate-address rows, counter consistency and interruption
controls are fixture-backed. Transport limits still apply to a single large
row/body or caveat set; field selection, text paging and complete portable
bundles remain available.

Other native-observation/context views, analyzed-memory search_bytes and
all-functions decompilation/export remain separate upstream work. Firmware
readers, additional CPU lanes, checkpoint extensions/automatic retirement
refresh/stale-lock recovery and the other item 62 groups remain open.

Arc, its helpers and shipped JavaScript were not executed. No profiles,
accounts, UI, services or recovered URLs were used. Full Arc analysis and
Client unknown revision 3 remain open; this slice improves static inspection.
