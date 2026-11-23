# Arc concrete generic field types — 2026-11-23

Item 71 is implemented and verified. REA+ now represents Root field 6 as the
declared specialization `Dependencies.Dependency<UserDefaultsClient>`, with
exact descriptor, module, signature and argument identities. Item 63 remains
open for member substitution, instance/field stability and invocation mapping.

The fixed arm64 input remains 80,498,448 bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, helpers, accounts/services and compiled fixture libraries were not run.

## Producing capability

The previous generic declaration inventory retained every Root field's raw
mangling but could not represent its concrete type application. A source-built
Swift fixture reproduces the limitation before the repair. It includes a
one-parameter wrapper, two-parameter pair, builtin and enum arguments, same-name
foreign argument types, and nested, optional and constrained negatives.

The selected `swift-fields` reader now emits optional `bound_generic_type`
for a complete supported application. It checks the original version-zero
generic struct descriptor, top-level module parent, trailing generic context
header, ordinary key type parameter flags, zero encoded requirements/pack flags
and matching flat argument count. Its arguments are supported nongeneric
nominal or builtin atoms. Signature and parameter locations, module identity
and source evidence are retained. Nested contexts/arguments, constraints,
packs, unrecognized conventions and trailing operators remain unsupported.

This is a declaration representation. It does not instantiate metadata,
substitute types into generic members, determine generic instance offsets/size,
choose native argument lowering, prove a live typed buffer or identify code
targets. The physical metadata reader's independent generic-owner refusal from
item 70 remains unchanged.

The format follows Swift's [mangling grammar](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/docs/ABI/Mangling.rst),
[type/generic context headers](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/include/swift/ABI/Metadata.h),
[generic signature header](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/include/swift/ABI/GenericContext.h)
and [parameter flags](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/include/swift/ABI/MetadataValues.h).
The two relative pointer words preceding the generic base header are not
executed or used to instantiate metadata.

Function and application parsing share one bounded atom/operator cursor. It
preserves embedded NULs inside symbolic displacements, skips alignment padding
and requires the complete terminal form. Function and generic-application
records are mutually exclusive in both the domain and advertised JSON Schema.
An enum used as a generic argument supplies no closure parameter domain. The
existing shared record budget charges signature, parameter and argument records
before growth; an incomplete application publishes no partial type assertion.

## Arc retest

Seven of eight BoostsEditor field applications now decode:

| Field | Concrete Dependency argument |
| --- | --- |
| `_adkClient` | `ADKClient` |
| `_analyticsClient` | `AnalyticsClient` |
| `_boostsClient` | `BoostsClient` |
| `_date` | `DateGenerator` |
| `_mainQueue` | Unsupported generic argument shape; raw mangling retained |
| `_pasteboardClient` | `PasteboardClient` |
| `_userDefaultsClient` | `UserDefaultsClient` |
| `_uuid` | `UUIDGenerator` |

Every decoded wrapper binds generic descriptor `0x103d46d5c` and module
`Dependencies` at `0x103d46d50`. Selected field 6 retains raw bytes
`0217746500790281a165004700`; its sole argument binds exactly to Client
descriptor `0x103d648c4`. Its signature at `0x103d46d78` has one parameter,
zero encoded requirements, one key argument, zero flags and parameter flag
`0x80`. The application remains `interpretation: declaration-only`.

Root's existing nongeneric metadata still has size 640 and offsets
`0,80,...,560`. Client's four supported closure declarations and 297-case
enum argument declaration remain unchanged; native argument ABI stays
unresolved. No generic argument creates a helper-wide input bound or CFG edge.

The next concrete type boundary is the wrapper's `keyPath` member. Its
symbolic reference at `0x103b91e3d` binds imported class descriptor
`_$ss7KeyPathCMn` from `/usr/lib/swift/libswiftCore.dylib`. The retained raw
member mangling still contains a generic parameter. This reader does not decode
that foreign class template or substitute the selected Client argument into
it. That is an explicit remaining step, not proof that no KeyPath type exists.

## Conditional default-path argument forwarding

Existing qualified public instructions already cover the default adapter and
reader. They were reused rather than opening another duplicate Ghidra session.
`verify_forwarding.mjs` checks their subject/Evidence identities and supplements
them with exact original-byte AArch64 checks over eight instructions.

Adapter `0x100d92ebc` loads X1 from context+16 and branches to reader
`0x100d910dc`. That reader's prefix stores callee-saved registers, sets X29,
saves X1 in X19 and calls helper `0x1005aa5e4` at `0x100d910f0`. None of these
instructions writes X0. Thus, under exact entry into this default path and
normal execution of the stable prefix, X0 reaches the helper unchanged. If the
actual selected invocation chooses this code path, its separately observed 49
reaches this helper as 49.

This is a conditional analyst derivation from retained REA+ observations, with
supplemental original-byte checks. It is not a new automatic invocation trace
or proof that the actual call uses the default code/context. Valid context and
stack, stable image semantics and no asynchronous register interference remain
premises. Active dependency selection, alias/field stability and native enum
lowering remain separate. `forwarding-verification.json` names these limits.

## Verification and remaining work

`qualification-verification.json` validates 1,872 frozen runtime files, six
source/document files, input identities, advertised JSON Schema 2020-12,
named contracts, text/structured parity and exported Evidence.

- 78 affected source tests, build, fast, docs and installed-package checks pass.
- 31 successful final-runtime MCP calls and 13 baseline calls export and close
  both targets twice, with verified empty owned lineages.
- Four exact complete-Evidence CLI/MCP comparisons pass. The converted schema
  and named domain contract reject a contradictory function/application record.
- Five owned positive applications decode; four supported-boundary negatives
  remain raw/unsupported. Two parameters, same-name argument identity, enum
  argument non-domain behavior and record-budget degradation are covered.
  Three deliberate metadata derivatives reject missing/extra arguments and an
  oversized signature; the latter fails mapped bounds before parameter-array
  growth. These are malformed controls, not compiler output.
- Fourteen previous snapshots authenticate. Native bridge, enum recovery,
  runtime-call registry, Ghidra profile and physical metadata reader code are
  unchanged. No fresh full enum matrix or 23-allocation regression is claimed.

These new field checks exercise REA+'s native Apple byte reader in
Ghidra-selected sessions, not a changed Ghidra decompiler algorithm. The
supplemental header probe helped identify the layout but never fills public
REA+ result fields. The owned library was compiled and analyzed, never run.

Continue item 63 at generic member-template interpretation/substitution,
relevant unchanged keypath/Client windows and the actual captured-instance/
default relation. The local default forwarding corridor is checked; it still
needs to be joined to a first-class invocation-domain/mapping observation.
Do not apply a helper-wide 297-case override. Full Arc, broader browser,
writeback, readback, durability and UI questions remain incomplete.
