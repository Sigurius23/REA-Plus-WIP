# Arc static metadata and argument-ABI boundary — 2026-11-22

Item 63 now has producer-backed **physical Client field offsets and VWT
identity**, plus a concrete conditional VWT-source anchor from static Ghidra
instructions. **Argument lowering and the full typed invocation remain open.**
The owned compiler controls confirm that a reflected closure's exact enum
parameter and case count cannot alone select direct value versus indirect
address passing. No Arc, helper or owned library was executed.

## Product change

`inspect_native_dispatch_metadata` / facet `swift-fields` accepts optional
`swift_metadata_address` (CLI `--swift-metadata-address`) alongside the required
exact `swift_type_address`. For an indexed nongeneric struct, it checks the
file-encoded metadata kind and descriptor backpointer before binding the
field-offset vector. It reads its base in pointer-sized words but its entries
as **uint32 byte offsets**. Wrong owners/kinds, incomplete VWT layout, invalid
extents/offsets and exhausted budgets remain partial. Generic/class/enum
metadata instance layouts are not supported by this new struct lane.

`static_metadata` retains source slots, absolute pointer/fixup/external bind
identity, field offsets, VWT size/stride/flags/alignment and the
`initializeWithCopy` slot target. Each record shares the existing aggregate
`max_records` budget. Its separate `swift_static_struct_layout` coverage counts
actually examined offset entries, rather than all declared entries after an
earlier stop. A missing copy target leaves the independently readable offsets
available and marks the layout result partial. Existing declaration facts
survive a failed metadata binding; default inventories and unselected metadata
queries omit the optional instance result and report not_requested coverage.

Complete decoded field functions now explicitly report
`argument_abi.status: unresolved`: reflection does not establish layout
resilience or abstraction lowering. No register bound, live typed buffer,
constructor signature, copying purity, post-copy stability, closure target or
helper-global CFG follows from this query. All metadata reads are observational;
no runtime metadata is instantiated and no target bytes are changed.

Primary ABI references: Swift's
[struct metadata implementation](https://github.com/swiftlang/swift/blob/main/include/swift/ABI/Metadata.h),
[value-witness definition](https://github.com/swiftlang/swift/blob/main/include/swift/ABI/ValueWitness.def),
[calling convention](https://github.com/swiftlang/swift/blob/main/docs/ABI/CallingConvention.rst)
and [ARM64 register summary](https://github.com/swiftlang/swift/blob/main/docs/ABI/CallingConventionSummary.rst).
The older TypeMetadata document marks its nominal-descriptor section outdated;
the implementation and owned compiler output supply the current field-vector
entry width. These references describe contracts, not observed target execution.

## Controlled ABI finding

Three source-built Swift 6.3.3 ARM64 libraries expose the same Client field
shape `@Sendable (Setting) -> Bool`, with a 297-case no-payload enum. Ordinary
and library-evolution/frozen builds invoke the closure with `i16`; the
library-evolution/nonfrozen build passes a pointer to a two-byte value. All
three enum descriptors have flags `0x52`. Owned LLVM IR records enum size and
stride 2 in each build; the Client metadata size/stride is 16 and field offset
0 throughout. Thus reflected shape/case count and current size alone do not
select the call ABI.

This does **not** assert that all metadata bytes agree. The owned enum VWT
flags are `0x00200001` in ordinary/frozen and `0x02200001` in the resilient
build. The extra `0x02000000` trait is retained; no general ABI rule or inverse
is inferred from this compiler-specific correlation. See
[the IR receipt](arc-closure-abi-2026-11-22/abi-control-layout.json).

The earlier merged typed/UInt16/foreign-owner image supplies a separate control:
its distinct Client metadata instances share copy target `0x2004`. The reader
still rejects selecting one owner with the other owner's metadata, retaining
its valid declaration but publishing no offsets for the mismatched instance.
The raw/imported field remains unsupported as a function type while its exact
struct layout can independently decode.

An inert malformed control changes only an owned library's copy-slot target,
preserving `DYLD_CHAINED_PTR_64_OFFSET` next/bind bits. The final reader reports
the null copy target as partial and retains field offset 0. A first unused
whole-word-zero draft would break the chain and was replaced by the
format-aware control before any provider use; both construction receipts are
retained. Neither patched library was executed or committed.

## Arc result and remaining chain

Exact original Arc SHA256 remains
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Metadata `0x1042c8ac0` points to exact owner `0x103d648c4`. Field vector
`0x1042c8ad0` yields all 23 offsets `0,16,...,352`. VWT `0x1042c8a58` records
size/stride 368 and copy target `0x100d97b04`. `boolForSetting` is at offset 0.
All 23 field records remain, with four complete supported function types and
19 unsupported types, as in the preceding field-type checkpoint. The selected
static metadata layout itself is fully decoded, while argument passing remains
unresolved and overall declaration coverage remains partial.

Fresh Ghidra reads retain the 15-instruction wrapper `0x100cce81c`,
118-instruction copy target and 34-instruction getter. The wrapper binds the
exact metadata argument and invokes VWT+16. The selected getter supplies the
local SP+`0x170` source. Under named normal-VWT/stable-metadata/valid-source
premises this is a concrete conditional typed source anchor. The copy body
writes the first pair before its first call, but later calls and the relevant
source/global code/context origins remain unproved. Read the
[analysis addendum](arc-closure-abi-2026-11-22/analysis-addendum.md) before
continuing; it records the exact instruction anchors and qualification.

The next step is to bind the selected call's actual ABI and relevant closure
code/context origin with closed memory windows, then unchanged argument flow
and an observation-only invocation-scoped mapping carrier. Reflection, size,
shared helper addresses and initialization candidates cannot supply a global
297-case table. Full Arc, broader browser/apply/UI behavior, higher restore
caller/writeback, active dependency choice, actual I/O/durability and pixels
remain open.

## Verification

[Final qualification](arc-closure-abi-2026-11-22/qualification-verification.json)
covers **41 public MCP calls: 39 successful and two intentional invalid
requests**, **three exact full-Evidence CLI/MCP comparisons**, schema conversion,
named contracts, text/structured equality, target digests, original uint32
field-offset/VWT bytes and export membership. Every artifact session exports
and closes twice. All MCP/CLI owned lineages are verified empty. The VWT summary
retains its complete `analyze_function` parent in the export; the verifier
checks that parent and its v10 profile. Metadata runs use the native-macos
reader; the selected instruction/function calls actually use Ghidra 12.1.4.
The bounded auto-analysis and caller-asserted 2,507 seeds remain explicit.
No new enum-recovery algorithm/profile or full 110-case engine qualification
is claimed; the Ghidra bridge is unchanged.

**136 source tests across eleven files**, build, typecheck/lint, generated-doc
checks and installed-package CLI/MCP verification pass. The final frozen runtime
has 1,871 files at
`rea-local/.cache/arc-runtime-closure-abi-final-2026-11-22`. All production source
hashes match exactly. Freeze-time source is retained; only test describe
grouping changed afterward to satisfy lint, followed by the full source/fast
checks. Two earlier completed 36-call captures and their runtime/source versions
are preserved, before the coverage-accounting and partial-fact refinements.
Their successful data is not relabeled as final qualification. Nine prior
historical snapshots authenticate against their original committed versions.
The full corpus was analyzed sequentially; no new independent worker review
is claimed because the previously reported worker quota remained unavailable.
