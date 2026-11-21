# Arc static Swift witness data — repair and retest, 2026-11-21

REA+ now exposes inherited-protocol and associated-type witness data alongside
executable witness slots. This closes a concrete metadata-decoding gap found
while pursuing item 63's typed-input proof. It does **not** implement unguarded
halfword-switch recovery or complete the Arc investigation.

The fixed Arc 1.172.1/build 90370 ARM64 input remains SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
No Arc code, shipped script, account/profile or application service was used.
Source-built verifier fixtures were compiled and inspected without execution.
The preceding callback/local-store checkpoint is pushed as `4f870986e`.

## Observed gap and resulting behavior

Previously, two data entries were retained as partial, unclassified witness
slots. That was a truthful limitation, not an erroneous executable target.
Fresh public bytes now corroborate their roles:

| Slot | Requirement kind | Decoded static identity |
| --- | --- | --- |
| `0x1042c8350` | Base protocol, flags 0 | Table `0x1045ee8b0`, conformance `0x10373cca8`, protocol `TestDependencyKey` at `0x103d46dfc`; exact owner `UserDefaultsClient` at `0x103d648c4` |
| `0x1045ee8b8` | Associated type, flags 7 | `Value`; tagged pointer `0x103bb305b`, mangling at `0x103bb305a`, indirect context cell `0x104230a08`, same nominal descriptor `0x103d648c4` |

The new optional `swift_dispatch_slots[].witness_data` distinguishes these
representations. `requirement_flags`, exact locations, pointer provenance and
binary Evidence accompany the result. Data rows have no executable
implementation address. Historical Evidence may omit the new fields and
remains parseable without rewriting.

The byte reader checks an inherited table's conformance header and exact
nominal owner, then proves its protocol appears in an ordinary `Self`
constraint in the owning protocol signature. Matching display names are
insufficient. Protocol signatures are cached within one inspection, avoiding
repeated signature scans across slots/conformances.

Associated-type decoding admits a complete direct/indirect symbolic reference
to a non-generic nominal descriptor. The original tagged pointer and target
are retained. Metadata-representation types, protocol-context/compound
manglings, generic substitutions, unknown data flags, external/encoded pointers
and malformed names remain partial. A failed data decode preserves the
observed role/target when available and does not discard later slots.

This uses the existing tool and native byte-reader boundary. Ghidra Java,
function-summary delivery and enum-switch recovery are unchanged.

## Source and interpretation premises

The relevant public ABI definitions are Swift's
[protocol descriptors and requirement records](https://github.com/swiftlang/swift/blob/main/include/swift/ABI/Metadata.h),
[requirement kinds and the associated-type mangled-name tag](https://github.com/swiftlang/swift/blob/main/include/swift/ABI/MetadataValues.h),
and [associated-type reflection records](https://github.com/swiftlang/swift/blob/main/include/swift/RemoteInspection/Records.h).
These define representation; actual Arc addresses and values come from the
retained original bytes and public replies.

A bounded original-byte reflection-section scan examined 4,112 descriptors
without selecting a first-context match for this nominal descriptor. Its
limited negative result does not establish absence of associated-type
identity. The decisive evidence came from the static witness word instead.
The scan receipt preserves its selection restriction and pointer caveats.

The getter requirement's complete signature/name is not encoded by the flags
used here. `Value = UserDefaultsClient` and the existing argument-forwarding
instructions improve the ownership chain, but do not alone supply a general
producer proof from typed closure field through constructor and adapter into
the anonymous enum/string helper. Item 63 stays open; the mask does not supply
a 297-case bound. Runtime dependency selection remains unobserved.

## Qualification

- **92 source tests across six files pass**, including ten focused witness-data
  cases. They cover direct/indirect identity, same-name/different-owner and
  missing-Self rejection, unsupported manglings, metadata representation,
  unmapped targets, names/flags and generic substitutions.
- **Typecheck/lint, cached build, built-doc checks and package verification pass.**
  The package check initially lacked registry access for its pinned skills test
  dependency; its retry used a disposable cache and passed with empty owned
  lineage. Intermediate development logs remain labeled separately.
- The existing **real Apple metadata lane passes ten compiler/link/strip
  variants and seven CLI/MCP discovery comparisons**, without fixture execution.
- **40/40 fresh public MCP replies pass** across two sessions: 33 raw/type-flow
  observations on the previous frozen runtime and seven rebuilt-decoder
  operations. Both final bundles export, both sessions close twice and both
  owned lineages are verified empty.
- **Two fresh Arc CLI cases exactly equal their MCP metadata results.** Both
  exact selected conformances now have complete scoped witness coverage.
  Executable targets are unchanged. Broader discovery remains two matches and
  **401 unresolved identities**, as before.

The [machine retest](arc-dispatch-provenance-2026-11-21/retest-verification.json)
checks canonical Evidence, actual advertised schemas/contracts, journals,
bundle membership, CLI parity, unchanged code targets and cleanup. The
[frozen runtime manifest](arc-dispatch-provenance-2026-11-21/runtime-manifest.json)
contains 1,868 files and binds the changed production sources. The old frozen
runtime remains intact. The Ghidra producer's prior 102-case matrix was not
repeated because that producer did not change.

## Remaining Arc work

Item 63 still requires typed closure/constructor provenance propagation and
owned positive/negative controls before automatic unguarded recovery. The
separate location dispatcher still blocks the exact local-store path.
Version/migration/backup policies, remaining `featuresUsed` effects, concrete
preview method, final browser reducers, account/sync, history/downloads and
broader networking/security remain incomplete. See
[OPEN_TASKS](../OPEN_TASKS.md) and [the updated handoff](../ARC_HANDOFF.md).
