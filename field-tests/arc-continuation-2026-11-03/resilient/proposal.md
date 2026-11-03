# Static resilient-witness records: diagnosis and proposed scope

The current reader intentionally excludes this layout; this is a capability
extension, not evidence of a regression. The owned `Fixture.swift` is compiled
with installed Swift 6.3.3 into a 119,552-byte arm64 dylib and never executed.
Its public CLI result is
`ev_efe27afbf92a693385842f0400a7050597de9f82f406fb6d2e975df7bb508449`.
The result retains 32 conformances and zero static witness slots. `Body` and
`Request` both retain imported `_$sSeMp` identities and partial conformance
coverage. Neither exposes its implementation.

Supplemental compiler/symbol verification, kept separate from REA+ recovery,
shows one resilient record for each conformance, flags `0x30000` and a null
static table pattern. The implementation fields point to the emitted
Decodable witness thunks at `0xd60` and `0x1190`. Source, commands, compiler and
artifact digests are in `build-receipt.json`; the supplemental oracle is in
`compiler-oracle.json`. Arc has the related nonconditional indirect-type form,
flags `0x30008`, at `0x1036a9f58`.

## Format and representation

The [Swift 5.9 ABI declaration](https://github.com/swiftlang/swift/blob/swift-5.9-RELEASE/include/swift/ABI/Metadata.h)
defines resilient requirement/implementation pairs independently of runtime
table ordering. A header supplies their count, and optional generic-witness
control data follows them. The
[conformance flags](https://github.com/swiftlang/swift/blob/swift-5.9-RELEASE/include/swift/ABI/MetadataValues.h)
determine these tails. The current Swift header retains this family. Runtime
instantiation is a separate operation and will not be performed.

Proposed public addition: optional `swift_resilient_witnesses`, preserving
omission in historical records. Each item identifies its owning conformance,
type/protocol names or imported references, record ordinal, requirement field
and local/imported identity, nullable descriptor flags, implementation target
and file-backed region classification, record location, decode state and
source Evidence. Ordinals do not claim runtime witness slots. Imported
requirements do not invent a count or flags for the unavailable protocol.

The first profile admits only a known, nonconditional/nonretroactive tail
layout. Unknown flags/layouts remain unsupported. It validates the declared
pair span and optional generic-control tail before walking records, and uses
the existing relative-pointer/fixup reader and shared admission budget. Nil,
unmapped, malformed and unsupported records retain meaningful partial coverage.
The static conformance record is retained even when its runtime table is not
materialized. Its null `witness_table` is not replaced by a guessed table.

## Ownership

`AppleSwiftDispatchFacets.ts` currently returns early after recording the
static-table failure reason. A dedicated native helper will parse the separate
tail before that return. It returns its own decode facts to the existing
`AppleDispatchCoverage.ts` owner. The domain schema gains the optional array;
other providers and historical results can continue omitting it. The broad
runtime/generic unsupported statement will distinguish this newly supported
static subset.

Focused boundary coverage will include actual fixture recovery, imported
requirement identities, invalid flags/counts/ranges/pointers, record exhaustion,
and historical schema preservation. CLI/MCP schema and exact Evidence parity
follow after a coordinated build, then a real Arc retest at its existing
explicit byte/record policy. No record cap is silently raised. Exact selection
will be proposed separately only if that measured admission blocks the known
Arc descriptor.

## Implementation and source verification

The approved representation is implemented in
`rea-local/src/native/AppleSwiftResilientWitnesses.ts`, attached to the binary
conformance producer before its static-table bailout. Coverage remains owned by
`AppleDispatchCoverage.ts`. The optional domain array preserves historical
omission; unselected inspection also omits it. The admitted flag mask is
`0x30038`, with only direct/indirect nominal-type reference kinds admitted by
the conformance producer. Conditional requirements, pack/retroactive prefixes,
synthesized flags and unknown flag bits are rejected rather than skipped by a
guessed byte count. The entire declared pair span and optional twelve-byte
generic control tail are validated before any pair is emitted. All records and
relative pointers share the caller's unchanged admission cap.

The ABI reference is explicitly `swift-5.9-RELEASE`; relative-function-pointer
selection follows that release's
[TargetLayout.h](https://github.com/swiftlang/swift/blob/swift-5.9-RELEASE/include/swift/ABI/TargetLayout.h)
and [Runtime/Config.h](https://github.com/swiftlang/swift/blob/swift-5.9-RELEASE/include/swift/Runtime/Config.h)
for the supported 64-bit Mach-O profile. Missing external requirement flags
never imply the function encoding/kind of a current Swift ABI. Such records
retain an executable address with partial decode, not a synthesized function
identity. Runtime table construction and ordering remain unobserved.

Source checks: 55/55 tests pass across the new twenty-four malformed/identity/budget
cases, existing binary-reader/vtable cases and domain compatibility. Scoped
lint on the new producer/test files has no warnings/errors; the existing
larger native owners retain their pre-existing complexity warnings. The
existing source-built `verify:apple-dispatch` lane now includes Decodable
struct/enum fixtures, a supplemental compiler-symbol oracle, stripping, both
fixup families and SDK-converted CLI/MCP output parity. Final compiled Arc and
owned-fixture CLI/MCP verification now passes; see
`after/final/README.md` and its raw Evidence/receipts. The parent owns the final
broader gate and ten-variant lane receipt. Source tests alone do not verify the
compiled public workflows.

## Observed admission and private-storage corrections

The first compiled full-image Arc pass at the unchanged 20,000-record policy
exhausted admission before the Boost conformance. This justified an exact
`swift_conformance_address` selector, requiring the conformance facet. It scans
only the image's indexed `__swift5_proto` rel32 cells before decode admission;
it does not treat arbitrary addresses as metadata. Null rel32 cells do not
establish membership. Results include an optional address/matched selection,
and Swift facet coverage explicitly states the selected-descriptor scope.
An unmatched descriptor is partial, with no decoded descriptor. Historical
unselected results omit this new selection field. The original universal
artifact, byte budget and aggregate admission policy are retained.

The first selected CLI capture, `after/arc-selected.cli.evidence.json`
(`ev_7a1c2b01b73d96fba90811f9307ef742f20c4d7bc299e935c5d73e9601c28718`),
reached BoostIDERequest but exposed a flaw in the initial tail validation:
the file-backed generic-control tail refers to private storage at
`0x1046cfb90`, whose bytes are unavailable to this file-backed reader. The
initial implementation rejected the entire tail and emitted no static pair.
That failure is preserved as historical evidence, not described as success.

The corrected producer validates the full declared control span and preserves
raw relative facts, while making unresolved generic privateData/instantiator
targets partial limitations on the independent static pair. No runtime storage
is synthesized or instantiated. A dedicated file-backed-control/unbacked-data
fixture and malformed/truncated-span fixtures cover this distinction. Local
requirement flags are conservatively restricted to the proved low five bits;
unproved upper flags cannot promote a target to a synchronous function.

The first built tiny-fixture CLI/MCP verification is preserved in
`after/fixture-public-validation.json`: 80 static pairs, exact normalized
parity and valid SDK-converted input/output schemas, Evidence
`ev_d2306ad25df0f1d37f8f7cfd040f01c90a89961a8758b032e173538591f4137d`.
This first-build record is retained separately. The final refresh is under
`after/final/` and retains the same fixture Evidence ID, exact CLI/MCP parity and
compiler-oracle addresses, without executing the library. The final Arc result
does change: it now retains the static Boost pair while preserving runtime
private-storage and imported-requirement uncertainty, Evidence
`ev_120f75645ad89abfcf445e088cfc59b3deb8e4e9595b11375d0da7e52ff010c8`.

The scoped structural source graph is in
`/private/tmp/rea-resilient-native-architecture` (nine files, 128 nodes / 234
edges); it is auxiliary architecture context, not target facts.
