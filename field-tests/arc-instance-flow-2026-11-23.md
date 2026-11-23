# Arc constructed child, dependency scope and projection — 2026-11-23

Item 63 now has a conditional static route from the constructed BoostsEditor
through its surrounding reducer composition and dependency-writing scope to
the known reducer entry. The selected keypath's output-word assignment and
projection ABI are also checked. This pass uses the unchanged item 72 runtime;
no new production REA+ defect or code repair is claimed.

The fixed arm64 Arc input remains 80,498,448 bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, helpers, shipped scripts, services and owned fixture code were not run.

## Constructed keypath and projection

Candidate constructor `0x1012a5544` instantiates pattern `0x103788708` and
passes the returned object in X0 to wrapper initialization `0x1006fa228` at
`0x1012a56c0`, with result buffer SP+0x1e0. The wrapper saves that pointer in
X28 and the indirect result address in X19 before its TaskLocal call.

The complete call-free window `0x1006fa290..0x1006fa2d4` writes the saved
keypath pointer to result+16 through stack and vector copies. The sidecar
checks all 18 original instruction encodings and tracks symbolic byte origins.
Unknown bytes remain unknown; it does not assert padding or full-value
initialization. Four negative sidecar controls reject a wrong source register,
mixed vector pair, missing final store and unsupported instruction. These
controls qualify the analyst derivation, not a new REA+ recovery algorithm.

Root field 6 is the already bound Dependency<UserDefaultsClient>, at byte
480. Under normal getKeyPath/memcpy/value-witness contracts, valid private
buffers and the relevant unchanged windows, the selected construction therefore
places this pointer at Root+496. The later eighth initialization and final
640-byte copy are explicitly retained; the 18-instruction proof is not a
blanket no-alias or call-purity proof across them.

Projection wrapper `0x1006fa5bc` preserves incoming result X8 in X22, obtains
its keypath from incoming wrapper+16, passes root storage in X0 and keypath
in X1, restores X8 and calls `swift_getAtKeyPath` at `0x1006fa618`.
An owned Swift 6.3.3 arm64 fixture corroborates that intrinsic's indirect
result convention: compiler IR declares a Swift-convention void call with an
`sret` pointer, and the native specialization sets X8 to its result buffer,
X0 to root storage and X1 to the keypath before the call. The generic wrapper
tail-branches to the same import. This agrees with Swift's
[keypath projection definition](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/stdlib/public/core/KeyPath.swift).
No C X0-return model is applied to this Swift operation.

Under the exact typed keypath, valid-wrapper and standard import-binding
premises, normal projection writes a UserDefaultsClient to that selected
result buffer. It does not select a default Client or authenticate a loaded
keypath object. The prior TaskLocal/storage/cache/default analysis remains
necessary. The fixture's two different keypaths share projection code; its
separate mutable-wrapper control demonstrates why code identity alone cannot
establish value stability. That deliberately mutable control is not evidence
of a writable keyPath property or rebinding API in Arc.

## Where the constructed child goes

Public declaration inspection identifies `_IfLetReducer`, descriptor
`0x103d4d5d0`, with seven fields: parent, child, toChildState, toChildAction,
fileID, line and `_navigationIDPath`. Its encoded field-offset vector begins
at metadata word 6. Child ordinal 1 therefore uses the uint32 vector entry
at metadata+0x34. This identifies the entry, not its runtime offset value.

The observed metadata accessor `0x100876f50` supplies this exact descriptor.
Consumer `0x100876de8` loads the dynamic child offset from that entry and
uses the supplied exact Root metadata/VWT initializeWithTake with source
X26 at `0x100876ee8`. The caller supplied that source as its constructed Root
at SP+0x1680 and result storage at SP+0x1168. No generic metadata instance or
numeric generic child offset was fabricated.

The surrounding parent and composition witnesses are distinct:

| Descriptor | Public conformance | Retained pattern |
| --- | --- | --- |
| `0x1036f45d0` | Reduce: Reducer | `0x1045c9130` |
| `0x1036f3c28` | _IfLetReducer: Reducer | `0x1045c8bb8` |

The first query's historical label says `composition-conformance`; its actual
result is the parent Reduce conformance. It is kept unchanged. The subsequent
separate query establishes the _IfLetReducer conformance. Neither shipped
pattern is reported as an observed instantiated generic witness table.

## Conditional child dispatch back to BoostsEditor

The composition pattern's word 4 points to `0x10087847c`, which branches to
`0x1008770c4`. That body calls child routine `0x10087794c`. The relevant
metadata and value route is now explicit:

| Link | Source-bound observation |
| --- | --- |
| Child type / witness | Composition metadata+0x18 / +0x28; saved separately |
| Child address | Composition Self plus dynamic child offset from metadata+0x34 |
| Scope construction | `0x10087800c` calls `0x100871440` with that Self in X20, Child metadata in X2 and witness in X3 |
| Base value | The helper uses the Child VWT copy/take and writes that value at its result base |
| Scope declaration | `_DependencyKeyWritingReducer`, descriptor `0x103d4d4c8`, fields `base` and `update` |
| Operation capture | `0x1008718c8` saves Child metadata, witness, scope Self, State and Action pointers |
| Scoped operation | `0x10087194c` supplies update callback `0x100871964` and operation callback `0x1008719b4` to `0x10070d148` |
| Witness dispatch | Operation callback loads the saved Child metadata/witness, sets X20 to saved Self and calls witness+0x20 at `0x1008719d8` |
| Exact Root target | For the retained Root instantiation, witness `0x1046270d8` slot 4 is `0x1012a9870`, which copies Self and calls reducer `0x1012a571c` |

This joins the previously separate constructor/typed-child and protocol-entry
anchors as a conditional static path. It retains normal ABI, valid storage,
metadata/witness, copy and field-stability premises. The stored operation
callback must be entered with the constructed context, and the child
state/action branch predicates must hold. Helper `0x10070d148` forwards to `0x10070d1ec`. That body calls the supplied
update with copied DependencyValues, and skips the operation when X21 is
nonzero. On the zero-error path it passes the saved operation/code context to
the imported synchronous TaskLocal.withValue through trampoline `0x10071069c`.
That trampoline unpacks the saved code/context and calls `0x10070d2f8`, which
sets X20 to that context and invokes the original operation at `0x10070d31c`.
The imported symbol is retained exactly in `scope-entry-verification.json`.
Under the standard [TaskLocal.withValue contract](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/stdlib/public/Concurrency/TaskLocal.swift),
the supplied operation runs within the bound dependency scope. Import binding,
valid storage and the zero-error branch remain premises, not observed runtime
facts. The helper's later post-operation processing is outside this input-flow
study. No live event, callback execution or identity of every later
captured Root instance is claimed.

The scope constructor stores update code `0x1008716a4`; that entry and its
shared tail call the writable-keypath setter with captured keypath/value
inputs. Its Ghidra body is correctly noncontiguous and includes the shared
tail at `0x1008715b0`. It is not reduced to only instructions after its entry.
This supports the dependency-writing design. It does not prove that the
specific UserDefaultsClient field is overridden or that a default is selected.

The normal callback route reaches the previously analyzed Root effect-capture
code. Relevant unchanged copy windows, actual TaskLocal/default selection and
the selected Client's actual code/context still prevent an unconditional
invocation-to-default-helper claim. A first-class invocation-only mapping
carrier remains unimplemented. No helper-wide 297-case bound or CFG override
is justified by this route.

## Verification and resource recovery

`qualification-verification.json` checks **117 successful new public MCP
calls**, named contracts, actual advertised JSON Schemas, canonical Evidence,
text/structure parity, input digests and exact exported records. Two metadata
queries also match complete CLI Evidence exactly. All successful sessions
export and close twice; all owned fixture/MCP/CLI lineages are verified empty.

The frozen item 72 runtime's 1,872 files and six source/document hashes still
match. Sixteen historical snapshots authenticate. This analysis pass makes
no new build, source-test, package-gate, full enum-matrix or runtime claim;
those earlier qualifications remain historical. Source built fixture IR,
symbols, commands and digests are retained; its library is 57,496 bytes,
SHA-256 `7a48a0e247e87ad803b7caaea5a9514c4c3a097998eb8e2ff96d8a0bc910fc87`.

`flow-verification.json` authenticates nine reused/new public records and
34 instruction checks. `child-route-verification.json` authenticates eleven
records and 64 source-bound instruction anchors, including six independently
checked final callback encodings. `scope-entry-verification.json` checks the
scope/update guard and saved-operation bridge, with four independently checked
trampoline/call encodings. These are explicitly analyst derivations,
not extra normalized REA+ fields. Partial autoanalysis and caller-asserted
LC-verified seeds remain visible; none imply exhaustive caller discovery.

The first child-witness capture contains two public attempts: open succeeded,
then Ghidra correctly reported disk exhaustion. The error is preserved,
`retryable: false`, with truthful capacity remediation, no export and a
verified empty lineage; its temporary runtime root is gone. Seven identical
catalog copies from this closed run were physically deduplicated by verified
hardlinks, preserving every path and byte. After the user freed space, about
11 GiB was available and the original full-image capture succeeded in a new
directory. **No excerpt fallback was created.** An earlier automatic review
usage-limit failure did not execute the action; the same reviewed action was
approved on continuation. See `environment-recovery.json`.

Continue with the observation-only invocation-domain/mapping carrier using
the existing typed/raw/foreign-owner controls, retaining unresolved active
Client code/context and relevant instance/copy windows. Scope callback entry
is now traced under the explicit zero-error/standard-library premises. Do not repeat the
closed keypath-word, projection ABI, composition-field or final witness-load
studies. Higher restore caller/writeback, full apply/UI/browser coverage and
runtime I/O/durability remain separate open work.
