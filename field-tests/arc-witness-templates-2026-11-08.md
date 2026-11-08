# Arc: static Swift witness templates

2026-11-08, Europe/Berlin. Source parent:
`e71672ec80cc9b63b6d24c20b9d2666905d200a5`. This repairs item **52** from the
[delegate/evaluator investigation](arc-dispatch-2026-11-06.md), following the
[conformance-discovery repair](arc-conformance-discovery-2026-11-08.md).

The target remains the supplied Arc **1.172.1 / build 90370** DMG and its
80,498,448-byte ARM64 slice, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The renewed [integrity receipt](arc-witness-templates-2026-11-08/target-integrity.json)
verifies the DMG, original executable, slice and all **1,113** extracted regular
files against the original commitments. Arc, its helpers and shipped scripts
were not executed. No UI, profile, account, service or runtime storage was
accessed. Owned compiler fixtures were compiled and inspected, never run;
binaries and compiler caches remain outside Git.

## Repair

`inspect_native_dispatch_metadata` now returns `swift_witness_templates` for
nonstatic conformances. It retains pattern/control addresses, raw words,
available requirement flags, pointer/bind identities, holes, encoded conditional
requirements and pack descriptors. Generic control copy size or a local stable
protocol bounds the pattern. Unknown extent never causes adjacent data to be
treated as another entry.

A shared tail reader accounts for retroactive, conditional, pack and resilient
prefixes. It preserves the existing resilient requirement/witness pairs while
decoding generic control pointers once per conformance. Header records, nested
entries/conditions/packs and relative pointers share the existing aggregate
record budget. Unknown flags, malformed spans, missing context and omitted
records retain partial coverage.

The layout follows the [Swift ABI metadata declarations](https://github.com/swiftlang/swift/blob/swift-5.9-RELEASE/include/swift/ABI/Metadata.h),
[flags](https://github.com/swiftlang/swift/blob/swift-5.9-RELEASE/include/swift/ABI/MetadataValues.h)
and [generic-context structures](https://github.com/swiftlang/swift/blob/swift-6.0-RELEASE/include/swift/ABI/GenericContext.h).
Conditional encodings are retained without evaluating generic arguments or
demangling symbolic type strings. The raw instantiation flag does not establish
an active runtime instance. Every template reports
`runtime_witness_table: "not_observed"`; template word indexes do not become
runtime dispatch slots.

## Arc result

Both the protocol-name query and the exact selected descriptor identify
`WebContentsAdaptor: SelectorPickerWebContents`, conformance **`0x10378c760`**,
pattern **`0x10431acb8`**. Its control data declares **4 words**, including the
conformance header. The three remaining words are now returned directly:

| Pattern word | Interpretation | Target |
| --- | --- | --- |
| 1 | Literal null/hole | None; runtime population is unobserved |
| 2 | Async descriptor, requirement flags `0x31` | `0x10378c758` |
| 3 | Synchronous function, requirement flags `0x13` | `0x1012fa5e0` |

The descriptor location is not reported as an executable function entry; its
async body and runtime invocation are separate questions. The pattern does not
populate `swift_dispatch_slots`. The generic private-storage target is outside
the file-backed image, so the template stays **partial** while retaining all
three independently valid words. No private storage was read.

With **10 records**, REA+ retains the pattern and its declared size, omits the
three entries, and explicitly reports `max_records_reached`. The editor's
separate UI-delegate query still returns its **76** ordinary static witness
slots and no generic-template record.

The unchanged original owned library, SHA-256
`c3c86ca90b8ffbca450cd0bc21b2e968d9e45fd55261616d02fa9d39f42145c8`,
now returns two entries within its **three-word** `OwnedAdaptor: OwnedSurface`
pattern: async descriptor `0xfc8` and synchronous target `0xa50`. The neighboring
word previously visible in an unrestricted byte read is not absorbed into the
pattern. Its original source/compiler receipts remain in the earlier capture.

## Verification

- **114 source tests passed** across eight files. Distinct boundary cases cover
  holes, aliases/binds, conditional/retroactive/pack offsets, unproved ordering,
  oversized spans, header mismatches, unknown flags, missing context, budgets,
  historical omission and application validation.
- The [real compiler verifier](arc-witness-templates-2026-11-08/apple-verification.json)
  passed **10** link/strip variants and **7** compiled CLI/MCP discovery queries.
  Generic and conditional Swift fixtures recover async descriptors and getters
  in stripped and unstripped images, with and without a generic control tail.
  Actual advertised schemas, named contracts, canonical Evidence and equal
  text/structured output were validated.
- [Capture verification](arc-witness-templates-2026-11-08/verification.json)
  passed **4 Arc CLI/MCP comparisons** of subjects, parameters and normalized
  results, plus the original owned-library check. Both Arc MCP sessions closed
  successfully with verified empty owned descendants. The second session uses
  the final build after review of missing retroactive-context handling; each
  session has **7 successful calls**, including export and close.
- The [audit](arc-witness-templates-2026-11-08/evidence-audit.json) authenticated
  **13** standalone records (**5** unique identities) and **2** four-record
  bundles, with no failures. Build, typecheck/lint, documentation and whitespace
  checks passed. No full `check:pr` or model-driven tool-selection evaluation
  is claimed.

Item **52 is complete within this static metadata scope**. Item **53**
(Ghidra disk-capacity diagnostics) remains open. Actual witness instantiation,
generic-condition satisfaction, async/coroutine execution and runtime dispatch
remain unobserved. Arc's command closure effects, bootstrap/injection,
persistence, rendering/coordinates and extension loading remain separate
research questions; this repair does not complete Arc's behavioral analysis.

Subsequent same-day update: item **53** is now repaired and verified in the
[disk-diagnostics report](arc-disk-diagnostics-2026-11-08.md). The observations
above describe the issue-52 build at capture time.
