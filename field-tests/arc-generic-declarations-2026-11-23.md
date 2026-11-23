# Arc generic field inventory and typed constructor use — 2026-11-23

Item 70 extends the selected field reader to generic declarations while retaining
the existing ABI and physical-layout boundaries. Item 63 also gains a concrete
constructor-use and protocol-entry trace. Its specialization, active instance,
field-stability and invocation-mapping questions remain open.

The fixed arm64 input remains SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`,
80,498,448 bytes. Arc, its helpers and the owned fixture library were not run.

## REA+ capability and safety boundary

The old field reader used the nongeneric function-atom restriction to admit the
selected declaration owner. Consequently it reported an indexed match but no
name or fields for `Dependency<Value>`. A source-built Swift fixture reproduces
that limitation for generic structs, a generic enum and a same-name nested
foreign owner. This was an explicit unsupported capability, not a counter bug
or evidence that these declarations had no fields.

Declaration inventory now has its own admission rule. `swift-fields` accepts
an exact indexed struct/enum owner, retains its descriptor name, field count,
field records and complete raw symbolic manglings, and reports optional
`is_generic` from the descriptor flag. Historical Evidence may omit it.
Generic parameters, requirements, substitutions and instantiated layout are
not resolved. A concrete supported closure declaration can be read even when
its owner is generic; a function involving an unresolved generic type still
cannot supply a parameter-domain proof.

The distinction follows Swift's
[context-descriptor generic flag and generic context](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/include/swift/ABI/Metadata.h)
and [generic signature representation](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/include/swift/ABI/GenericContext.h).
Reading a declaration does not instantiate its metadata or determine how a
specialized value is laid out or passed.

The physical struct-metadata reader previously relied on the declaration
reader's narrow admission. It now checks the original descriptor's generic
flag explicitly and refuses generic binding before publishing metadata kind,
owner match, VWT or offsets. A fabricated owner-matching metadata record in a
module test verifies this guard, while public fixture/Arc requests retain the
generic declarations and return the specialization limitation. Existing
nongeneric metadata behavior and strict function-atom admission remain intact.

The documentation's stale enum-recovery profile label was also corrected from
v9 to the already implemented v10. The enum-recovery implementation did not
change.

## Retest results

Public Arc Evidence now identifies generic `Dependency` at `0x103d46d5c` and
retains all five fields:

| Ordinal | Name | Raw symbolic type |
| --- | --- | --- |
| 0 | `initialValues` | `02ebc2690000` |
| 1 | `keyPath` | `0293d76a007902cdc26900784700` |
| 2 | `file` | `0255c26a0000` |
| 3 | `fileID` | `0255c26a0000` |
| 4 | `line` | `537500` |

Its type interpretation remains partial. These are declaration ordinals, not
byte offsets. The concrete `Dependency<UserDefaultsClient>` specialization
is still retained as raw mangling in Root field 6; no substitution or generic
instance-offset proof has been invented.

Owned controls verify that a generic parameter remains raw `7800` (`x` plus
terminator), a concrete `@Sendable (Setting) -> Bool` field retains its exact
three-case declared argument domain and unresolved argument ABI, generic enum
payload/case declarations survive, and same-name owners retain distinct
descriptor identities. Unindexed selections return no invented owner/fields.
An eight-record budget retains one admitted field and explicit partial
coverage. Nongeneric Client/Root field facts are unchanged.

## Constructor-use and reducer-entry evidence

A supplemental original-byte B/BL scan located one direct call to candidate
initializer `0x1012a5544`, at `0x10150486c` in `0x10150478c`. This is a bounded
direct-branch locator, not exhaustive reachability. Public Ghidra instructions,
callers, references and analyses corroborate the candidate call. Seeds retain
their caller-asserted status.

The resulting typed-use chain is concrete:

| Link | Observation |
| --- | --- |
| Candidate output | Caller passes X8 = SP+`0x1680` at `0x10150486c` |
| Consumer source | The same address reaches X1 at call `0x10150490c` to `0x100876de8` |
| Root metadata | Caller stack+`0x20` contains exact `0x104316db8` |
| Consumer carrier | Callee saves source X1 in X26 and loads that metadata into X28 |
| Typed move | `0x100876ee8` calls metadata VWT+`0x20`, with source X26 and metadata X28 |
| Witness identity | Root VWT `0x104316d50`, slot `0x104316d70` -> `0x1012b4074` |
| Native operation | That witness sets W2=`0x280` and tail-branches to the imported memcpy stub |

The slot is `initializeWithTake`, not `initializeWithCopy`. Swift's
[value-witness definition](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/include/swift/ABI/ValueWitness.def)
places it after the first four function entries and defines a move that
invalidates its source. This is a conditional typed source anchor under normal
VWT/memcpy contracts, valid live storage, stable metadata, successful normal
returns and disjoint source/destination. It does not establish unchanged
constructor bytes across intervening aliasing calls, source declaration
ownership, or the identity of the actual later captured Root instance.

The caller also passes witness `0x1046270d8`. Public exact conformance inspection
binds it to `BoostsEditor: Reducer`, descriptor `0x103788ae8`. Its two function
slots must be distinguished by code:

- Slot 4 (`0x1012a9870`) copies 640 bytes from incoming X20 to private SP,
  sets X20 to that buffer and calls known reducer `0x1012a571c` at
  `0x1012a98b4`.
- Slot 5 (`0x1012a98d0`) constructs a diagnostic and ends in BRK at
  `0x1012a9984`. Its public requirement name is null; its slot number must not
  be used to invent a reducing method.

This supplies an independent conditional protocol-entry anchor for the Root
consumed by the reducer. It does not join every composed value to the specific
effect capture. The previously traced selected keypath/default-client path
remains conditional on active dependency selection and relevant field stability.

## Verification and next work

`qualification-verification.json`, `fact-index.json` and the exported bundles
retain exact facts, identities and limits. The frozen runtime has 1,872 files
and seven authenticated changed source/document files.

- 67 affected source tests, build, fast, documentation and installed-package
  checks pass.
- 55 successful final-runtime public MCP calls and 18 baseline calls validate
  advertised input/output JSON Schema 2020-12, named contracts, text/structured
  parity, Evidence/subject hashes and exports. Every target closes twice; all
  owned lineages are verified empty.
- Four exact complete-Evidence CLI/MCP comparisons pass, including generic
  declaration and generic-layout refusal on Arc.
- Thirteen prior snapshots authenticate. Native bridge, enum recovery,
  Swift-error model, exact runtime-call registry and Ghidra profile sources
  are unchanged. The candidate still retains eight keypath returns. No new
  full enum-matrix or 23-allocation regression run is claimed.

Field-facet checks use REA+'s native Apple byte reader within Ghidra-selected
sessions; the constructor/witness captures use real Ghidra 12.1.4 analysis.
Its one-second analysis policy yields a stable partial Program, not exhaustive
reference discovery. Missing callers and runtime values remain unknown.

Continue item 63 at supported concrete generic specialization/substitution,
then the relevant unchanged keypath/Client fields and actual captured-instance
relation. Preserve unchanged argument forwarding and implement an
observation-only invocation-domain/mapping carrier. Keep valid Swift input and
default-selection premises explicit. No helper-wide 297-case override is
justified by this one conditional context. Broader browser, writeback,
readback, durability and UI questions remain open.
