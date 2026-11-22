# Arc selected Swift field types — 2026-11-22

Item 63 now has a reusable **selected reflection field-type inspection** step.
The fixed Arc artifact's exact `UserDefaultsClient.boolForSetting` declaration
is `@Sendable (ArcUserDefaultSettings) -> Bool`, with nominal parameter
descriptor `0x103d41568`, zero payload cases and 297 empty cases. This is a
conditional declaration-domain fact. **Item 63 and full Arc analysis remain
open:** this does not establish a machine argument-register domain, typed
buffer, physical field offset, closure code/context origin or invocation.

## Product change

The existing `inspect_native_dispatch_metadata` operation gains opt-in facet
`swift-fields`, requiring exact `swift_type_address` (CLI
`--swift-type-address`). It scans the complete validated `__swift5_types`
index before admitting the selected nongeneric struct/enum. Exact direct and
indirect identity, matching count and unresolved index count remain explicit.
The default `all` inventory excludes this explicit declaration query, preserving
its previous family ordering and budget behavior. Class/conformance selectors
cannot combine with it; symbol-only fallback cannot satisfy the selection.

`swift_type_fields` preserves field ordinals, record locations, raw flags,
names, complete mangling bytes and per-field decode states. The byte scanner
skips complete relative/absolute symbolic payloads when finding the terminating
NUL; it interprets only supported direct/indirect local nominal references in
read-only mapped storage. Signed-relative/dyld identity and evidence reuse the
existing metadata boundary. Function parsing requires the complete supported
result/parameter/optional Sendable/native thick function grammar. Async,
throwing, optional, tuple, generic, other conventions, unrecognized operators,
external type identities and trailing operators remain unsupported.

The zero-payload enum reader is separate from existing payload-based CFG
recovery. Before declaring `[0,N)` case ordinals, it checks the exact parameter
descriptor, no generic context, zero packed payload information, positive empty
count, reflection kind/stride/count and every no-payload case record. Records,
case names and relative pointers share `max_records`; exhaustion is partial.
An enum only in the result supplies no parameter domain. Descriptor identity
is never replaced by a displayed name, count or shared helper address.
`program_mutations` is false. Field ordinals are not physical instance offsets.
Historical Evidence may omit this capability.

The grammar and no-payload ordinal interpretation follow the primary Swift
[Mangling specification](https://github.com/swiftlang/swift/blob/main/docs/ABI/Mangling.rst)
and [Type Layout specification](https://github.com/swiftlang/swift/blob/main/docs/ABI/TypeLayout.rst).
Native argument lowering remains separate: declaration case ordinals do not
establish the contents of a register at a selected machine instruction.

## Owned controls and Arc result

The previously retained optimized `TypedClientControls` image shares executable
constructor/adapter/reader/helper bodies across typed, UInt16 and foreign-owner
paths. Public queries now distinguish its exact declarations:

- Primary: descriptor `0x3274`, 297-case declared parameter domain.
- UInt16: imported type identity remains unsupported, with no published enum
  domain. The owned source supplies the UInt16 interpretation; the producer does
  not guess it from a symbol spelling.
- Foreign: descriptor `0x32ac`, independently 297 cases, never conflated with
  Primary despite the same displayed nested name/count.

New owned `FieldControls.swift` was compiled with Swift 6.3.3 for ARM64 macOS14
and inspected as inert bytes. Its positive Sendable field has a three-case
Primary domain; its enum-return-only field has none; its Foreign input keeps
the other descriptor. Raw imported, optional, async, throwing and zero-argument
fields stay unsupported. Generic owner selection stays partial. No owned
fixture was loaded or executed.

Arc identity is unchanged:
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The reader examines 11,125 index entries, with zero unresolved identities for
this selection. It retains all 23 `UserDefaultsClient` field records. Four
supported complete function types are decoded: `boolForSetting`,
`doubleForSetting`, `integerForSetting`, and `exists`. Nineteen field types
remain explicitly unsupported, so overall selected-field coverage is partial.
The selected `boolForSetting` field itself is complete:

| Fact | Exact identity |
| --- | --- |
| Owner descriptor | `0x103d648c4` |
| Field ordinal / record | 0 / `0x103e97300` |
| Complete type bytes at `0x103bb3220` | `53620225d8670059626300` |
| Parameter enum | `0x103d41568` / `ArcUserDefaultSettings` |
| Pure-enum case count | 0 payload / 297 empty |

Only the first terminating NUL belongs to the mangling; adjacent section
padding from earlier wider byte reads is not part of its function type.

## Verification and limits

See the [capture verifier](arc-field-types-2026-11-22/qualification-verification.json),
[fact index](arc-field-types-2026-11-22/fact-index.json),
[public invocation journal](arc-field-types-2026-11-22/mcp-qualified/invocations.json)
and [CLI parity receipt](arc-field-types-2026-11-22/cli-qualified-verification.json).
The 22-call MCP run has 20 successful calls and two intentional
`invalid_request` / `invalid_input` selector errors. Both compiled CLI
comparisons match the entire MCP Evidence exactly, including its ID. Every
successful reply passes advertised JSON Schema, named contract and text versus
structured equality checks. Evidence parses, belongs to its final export,
authenticates target bytes, and retains original field mangling bytes. Each
artifact session exports and explicitly closes twice; MCP and CLI owned process
lineages are verified empty.

These are **real public metadata-reader workflows**, not new Ghidra engine
qualification. A Ghidra-selected public session routes this operation to the
`native-macos` binary reader. No Ghidra analysis operation or target execution
was requested. The previous item 67 native qualification remains historical;
its 110-case engine suite was not repeated because no Ghidra recovery code
changed here.

The qualified frozen runtime has 1,870 files at
`rea-local/.cache/arc-runtime-field-types-qualified-2026-11-22`. Every qualified
source and runtime hash matches exactly. The earlier runtime, source snapshots,
22-call capture and two CLI replies are retained separately. Regression testing
caught coverage-row displacement and missing propagation of the new field
budget to shared pointer coverage. The producer now returns the new coverage
row to be appended after the existing rows, and the shared coverage owner sees
field-budget exhaustion. The existing metadata regression and an explicit
field-budget assertion pass. The corrected public capture/CLI parity were
repeated against a fresh qualified freeze. The initial test describe grouping
also exceeded the lint line limit, and the existing vtable coverage fixtures
needed the new required budget key; both test layouts were corrected. No
previous completed study's captures, manifests or review was modified.

The source regression suite passes **124 tests across ten files** (121 in the
main affected-reader sweep, three existing vtable coverage tests). Build,
typecheck/lint and generated-doc checks pass. Package verification also exercises
the installed CLI/MCP and its cleanup. The original package attempt was blocked
by sandbox registry access and retried with the existing pinned verifier.
The initial MCP probe mistakenly requested the nonselectable `native-macos`
helper as `open_binary`'s provider; its correctly failed run and empty lineage
are retained. The final probe uses supported Ghidra selection. An initial
capture-verifier expectation confused public error code `invalid_request` with
category `invalid_input`; its failed source/log are retained and the verifier
now checks the actual contract. Historical-source authentication also required
using each prior checkpoint's committed source version after these intentional
source edits; eight prior snapshots now authenticate without alteration. These are qualification harness corrections,
not additional product defects.

The next item 63 work remains native argument lowering, an exact typed root
and physical selected field offset, relevant code/context origin with closed
memory windows, unchanged argument forwarding and an observation-only
per-invocation mapping carrier. A selected declaration cannot justify a global
297-case JumpTable/CFG override for the shared helper. Higher restore
caller/writeback, broader apply/UI/browser paths, active runtime dependencies,
actual I/O/readback, durability and pixels remain open. Arc, its helpers and
shipped JavaScript were not launched; no account/profile/service/UI was used.
