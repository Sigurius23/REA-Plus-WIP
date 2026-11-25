# UF2 / DfuSe integration — 2026-11-25

The next item-62 firmware slice is complete: selected root UF2 and DfuSe carriers
work through existing `open_binary`, `inspect_artifact` and `extract_artifact`
workflows and the CLI. No new tool, external decoder or device access is needed.
This is selective integration of audited upstream REA
`f7849cad3fe3bffb207b4dc30f34394978c20297`, based on local parent
`acb1d18e0607110ac12015d0a730e69c16b514b3`; it is not a claim about later upstream main.

UF2 retains separate address spaces per family, numbered-block completeness,
invalid/skipped/trailing counts, duplicate bytes and registry-name provenance.
The explicit `main_flash_coverage` stays unknown when numbering, invalid blocks,
trailing bytes or unreconstructed file containers leave gaps. Family IDs and
load addresses do not prove CPU/device identity. Reassembled regions have no
invented carrier offset. DfuSe retains target names/alternate settings, raw name
fields (including padding), empty declarations, overlapping separate elements,
and actual element payload carrier offsets. Both producer size variants are
checked against the real carrier bounds.

## Corrections made during integration

- Replaced the upstream fixed file/region ceilings with explicit caller byte/run/
  element resource budgets. UF2 admits run metadata before merging/allocating
  merged ranges; DfuSe counts empty declarations against element admission.
- Made decoder failures sticky, prohibited write/finish after completion, and
  checked both growth and short reads against the admitted size. Stable source,
  bound SHA-256, stream copies and retained cleanup ownership share the existing
  reader implementation rather than duplicating it for each carrier.
- Enforced DfuSe suffix CRC disagreement using the existing fail/continue policy.
  Continued bytes carry observed-untrusted limitations. Exact CRC pairs are
  committed in occurrence metadata and inspection integrity observations;
  entry SHA-256 contradiction records retain their original meaning.
- Preserved empty-target metadata and copied nested metadata at the reader
  boundary. Caller-forged family/source-offset entry facts are refused.
- Preserved complete historical HEX/S-record Evidence after refactoring their
  reader. Root and lifecycle/Evidence/snapshot format vocabularies include the
  new formats; CLI/MCP budgets retain caller choices and reject irrelevant knobs.

## Verification

`verification.json` binds 1,917 frozen runtime files and 37 source commitments.
`fixture-receipt.json` records seven inert inputs as exact hex, size and SHA-256;
`build_fixtures.py` constructs them independently with Python struct/zlib.
Actual binary inputs and extracted binary payloads remain in owned temporary
scratch, outside Git. Their verified readback is preserved as hex JSON.

- 129 tests pass across 12 selected files: decoders, malformed/capacity/lifetime
  cases, stable reader ownership, public CLI/MCP, extraction, schemas, target
  snapshots, existing ZIP/Android-package controls and artifact MCP boundaries.
- Qualified MCP: 40 calls, 28 successful and 12 expected refusals. All advertised
  schemas are validated after SDK conversion; full raw replies, invocations,
  bundles and catalogs are retained. The first 36-call firmware capture also
  passed but process lineage was unavailable inside the sandbox. It is preserved;
  the rerun and Arc capture verify empty owned process lineage.
- 15 CLI calls: five complete current CLI/MCP Evidence pairs, three complete
  historical HEX/S-record Evidence matches, four extraction manifest/file pairs,
  three expected CLI refusals and 14 verified extracted-file readbacks.
- The complete Arc reducer Evidence exactly equals the previous published record:
  `ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45`,
  2,518 instructions / 10,072 bytes. The fixed input, 2,537 seeds and one-second
  partial analysis policy are unchanged; this was a warm-checkpoint static run.
- 33 historical snapshots authenticate at their original commits; no old captures
  are rewritten. Static checks, documentation, discovery (980 test files) and
  package verification pass. The package still exposes 208 tools and six prompts;
  package/CLI/MCP/Arc process lineages verify no owned descendants remain.

The initial focused test run exposed two incorrect test expectations for the
existing public error code (`invalid_request`); those assertions were corrected.
The first static gate stopped on formatting; final formatting/checks pass. Both
initial logs remain beside final logs, separate from qualification results.

## Remaining scope

UF2 file-container reconstruction, MD5 verification and extension-tag decoding
remain unsupported and explicitly reported. Root decoding does not add recursive
firmware expansion, raw CPU loading, a board memory map, acquisition or flashing.
No Arc executable/helper/shipped JavaScript, account/profile, UI, service or
recorded URL was launched or used. Other hosts are not qualified by this macOS
run. Full Arc feature/persistence analysis and Client unknown revision 3 remain
open. The next firmware block is uImage/FIT/ESP, followed by Android boot/OTA and
devicetree; separately qualified CPU lanes remain open too.
