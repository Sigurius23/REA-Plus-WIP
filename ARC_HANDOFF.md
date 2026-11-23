# Arc / REA+ handoff — updated 2026-11-23

## Start here

Continue the user's **offline Arc reverse-engineering investigation**. Work
autonomously, document actual REA+ problems in `OPEN_TASKS.md`, fix confirmed
problems, and publish completed work to the existing WIP repository. Do not
declare the full Arc investigation complete: reducer recovery is repaired,
but durable persistence and broader browser features still need tracing.

Repository root:

```text
/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3
```

Read `rea-local/AGENTS.md`,
`rea-local/.agents/skills/reverse-engineer-anything/SKILL.md` (current version 44),
`OPEN_TASKS.md`, and `field-tests/arc-analysis-dossier-2026-11-08.md`.
The REA skill explicitly requests independent delegation in step 6; use
distinct scopes when workers are available. Workers hit usage limits during
this run. Their written artifacts survive; do not depend on their chat memory.

**Do not launch Arc, its helpers or shipped JavaScript. Do not visit recorded
URLs, use accounts/profiles, submit requests to its services, or collect live
UI/runtime behavior.** Owned source fixtures were compiled and analyzed, never
executed. The earlier HeyClicky UI permission does not authorize Arc execution.

## Latest selected-index dispatch checkpoint (2026-11-23)

Read `field-tests/arc-table-dispatch-2026-11-23.md` and its final qualification,
CLI parity, runtime and snapshot manifests. New target-free
`inspect_native_table_dispatch` is implemented and qualified on an owned
source-built assembly fixture and the fixed Arc slice. It decodes selected
mask16/LDRH/scaled-target observations without changing a program CFG.

Arc indices 49/50 map to `0x1005ab4e8`/`0x1005aa834`. The actual call at
`0x1012ab840` retains X0=49 but stays `indirect-unresolved`; no invocation
mapping is installed. Direct call `0x100d910f0` reaches the selected helper,
but this narrow primitive has no adjacent literal at that call. No enum domain
or helper-wide count is inferred. A direct call with a supported literal suffix
can return a conditional singleton for an explicitly requested mapped index;
known direct bypasses withhold it, and indirect entry stays a named premise.

Final verification: 25 affected tests, 14 public MCP calls with two expected
errors, seven exact CLI/MCP Evidence/error pairs, 17 authenticated prior
snapshots, 1,881 final frozen runtime files and 25 source hashes. Build, fast,
docs, architecture and package checks pass. Initial qualification caught and
fixed misleading file-cap guidance; baseline artifacts/runtimes remain intact.

**Next:** continue the typed invocation join from the constructed-child route
below: exact active keypath/TaskLocal Client selection, actual stored code/context
origin and relevant instance/copy stability. The first observation-only carrier
is now implemented; full item 63 and full Arc analysis remain incomplete.
Do not install the reflected 297-case enum as a global helper bound. No Arc
runtime authority was added. The new tool needs no Ghidra process/session.

## Latest constructed-child / projection checkpoint (2026-11-23)

Read `field-tests/arc-instance-flow-2026-11-23.md`, qualification/fact index,
flow/child-route verification and snapshot manifest. This pass uses the
unchanged item 72 runtime; no production repair is claimed.

The selected wrapper's 18-instruction call-free store window writes incoming
keypath to indirect result+16. Root+496 follows only under the named later
copy/alias premises. Owned Swift IR/native controls corroborate projection's
indirect X8 result, root X0 and keypath X1. No C return model was applied.

The constructed Root is consumed as _IfLetReducer.child. Descriptor
`0x103d4d5d0` names seven fields; vector word 6 gives child ordinal 1's
uint32 metadata entry at +0x34. Its value stays dynamic. Distinguish parent
Reduce conformance `0x1036f45d0` from composition _IfLetReducer conformance
`0x1036f3c28`; their shipped patterns are not observed runtime witness tables.

Composition pattern word 4 -> `0x10087847c` -> `0x1008770c4` -> child helper
`0x10087794c`. The child address uses that dynamic +0x34 entry. Child metadata
and witness come from composition metadata+0x18/+0x28. Helper `0x100871440`
copies/takes that child into _DependencyKeyWritingReducer (`0x103d4d4c8`,
fields base/update). Helper `0x1008718c8` captures metadata/witness/Self/State/
Action and passes operation callback `0x1008719b4` to `0x10070d148` at
`0x10087194c`. If entered with this context, the callback loads witness+0x20
and dispatches saved Self. For exact Root metadata/witness this is slot 4
`0x1012a9870`, which calls reducer `0x1012a571c`. Update entry `0x1008716a4`
has a noncontiguous shared tail at `0x1008715b0`; preserve both body ranges.

Scope entry is now traced too: `0x10070d148` -> `0x10070d1ec` invokes the
update callback, skips the operation on nonzero X21, and passes the saved
operation/context to the standard synchronous TaskLocal.withValue import.
Trampoline `0x10071069c` unpacks that pair; `0x10070d2f8` sets X20 to its
context and invokes the original code at `0x10070d31c`. Import authenticity and
normal zero-error/ABI/storage semantics remain premises. Its later return-value
processing was not analyzed as part of this input-origin question.

**Historical next step (observation primitive now implemented above):** qualify
the typed invocation carrier with the existing typed/raw/foreign-owner controls. Preserve unresolved active Client
code/context and relevant stable instance/copy windows. Do not
repeat the keypath-word, projection ABI, composition field or final witness
load studies. Child state/action predicates, normal metadata/VWT/runtime ABI
and callback-entry/copy premises stay explicit. This is a conditional static
route, not a live event or proof of active TaskLocal/default Client selection.
Actual Client code/context, every later captured Root instance and full Arc
remain unresolved. Never install a helper-wide 297-case CFG override.

Verification: 117 successful new public calls, two exact CLI/MCP Evidence pairs,
sixteen authenticated older snapshots, unchanged 1,872-file runtime/six source
hashes and empty owned lineages. No fresh build/source suite/package/enum matrix
is claimed. One original full-image capture correctly failed for disk capacity
(two attempts: one open success / one disk error); it and its cleanup are
retained. Seven exact-byte catalog copies from this run were hardlinked without
losing content. The user freed space; 11 GiB was checked, and full-image retry
succeeded. No excerpt fallback exists. An automatic approval review usage-limit
failure was resolved by retrying the same reviewed action after continuation.

All sessions are closed. Source/compiled fixture code was never executed.
Workers remain unavailable. This follows local `370825a90`; no push was done.

## Previous generic member-template checkpoint (2026-11-23)

Read `field-tests/arc-member-templates-2026-11-23.md`, its fact index,
qualification/CLI/substitution receipts and snapshot manifest. Item 72 is done.
Optional `generic_member_type` retains complete depth-zero parameter references
and flat external symbolic applications under an exact checked top-level
ordinary unconstrained owner signature. Function, concrete application and
member template are mutually exclusive; historical omissions remain valid.
External descriptor semantics stay `unresolved-external`: a symbol name is
not validated external arity, constraints, authenticity or runtime binding.

Arc Dependency's keyPath field now retains import `_$ss7KeyPathCMn`, root
DependencyValues `0x103d46e58` and parameter 0 at `0x103d46d88`. Owner
`0x103d46d5c` and signature `0x103d46d78` match the selected Root application
exactly. `declaration-substitution.json` joins the two public Evidence records
and substitutes exact UserDefaultsClient `0x103d648c4` in a separate analyst
derivation. Under the standard Swift import-binding premise that describes
KeyPath<DependencyValues, UserDefaultsClient>. Automatic substitution, external
signature validation and generic physical layout remain unimplemented/unresolved.

**Continue item 63** at the actual constructor/captured-wrapper relation and
relevant keypath/Client field stability, followed by a first-class
observation-only invocation-domain/mapping carrier. Do not repeat the newly
closed declaration-template identity or conditional default X0 forwarding.
The imported type declaration does not prove the actual captured value or
active default target. Never install a helper-global 297-case override.

Frozen runtime: `rea-local/.cache/arc-runtime-member-templates-2026-11-23`,
1,872 files and six source/document hashes. Verification: 88 source tests,
41 final public MCP calls plus 18 baseline, four exact CLI/MCP pairs,
build/fast/docs/installed-package checks, fifteen historical snapshots and
empty qualified lineages. Six owned template fields, parameters 0/1/2,
constrained/nested/foreign boundaries, three malformed derivatives, a foreign
import identity control and budget degradation qualify the new interpretation.
The native bridge, enum recovery, runtime-call registry, Ghidra profile and
physical metadata adapter are unchanged. Metadata uses the Apple byte reader
in Ghidra-selected sessions; no new full decompiler/enum matrix is claimed.
Initial sandbox cleanup uncertainty, compile errors and control-preparation
failures are retained separately from final successful qualification. No Arc
or fixture code was executed. Workers remain unavailable. This follows local
`0ce5b24f5`; no push was performed. Full Arc remains incomplete.

## Previous concrete generic application checkpoint (2026-11-23)

Read `field-tests/arc-generic-applications-2026-11-23.md`, its fact index,
qualification/CLI/forwarding receipts and snapshot manifest. Item 71 is done.
The selected field reader now has optional `bound_generic_type` for complete
flat concrete applications of top-level version-zero generic structs with
ordinary key parameters and no encoded requirements/packs. It checks the
original module/header/parameter identities and exact argument count. Shared
bounded atom/operator parsing preserves symbolic NULs and padding. Function
and application records are mutually exclusive. An enum generic argument
supplies no closure parameter domain. Interpretation stays declaration-only:
no member substitution, instantiated layout, live buffer or native ABI claim.

Arc Root has seven of eight applications decoded. Field 6 `_userDefaultsClient`
now binds wrapper `0x103d46d5c`, module Dependencies `0x103d46d50`, signature
`0x103d46d78` (one parameter / zero requirements / one key argument / flag
0x80), and exact Client argument `0x103d648c4`. MainQueue remains unsupported.
Root's 640-byte nongeneric layout/offsets and four supported Client closure
declarations are unchanged; the independent generic-layout refusal remains.

**Continue item 63** at generic member-template interpretation/substitution.
The keyPath member's symbolic reference `0x103b91e3d` binds imported class
`_$ss7KeyPathCMn` in libswiftCore; its raw mangling contains the generic value
parameter. This flat local-struct lane does not decode that foreign class
signature or substitute the selected Client into its template. Relevant
wrapper/keypath/Client stability and actual captured-instance/default relation
are still open, followed by a first-class observation-only invocation mapping.
Do not restart exact Root/wrapper/Client identities, constructor typed use,
protocol entry, keypath instantiation/default paths or the new application proof.

The local default X0 corridor is now separately authenticated in
`forwarding-verification.json`: adapter 0x100d92ebc changes X1 and branches to
0x100d910dc; the reader prefix preserves X0 through BL 0x100d910f0 to helper
0x1005aa5e4. Eight exact native encodings corroborate three reused qualified
public observations. If this exact default code path is selected, the observed
49 reaches the helper as 49. This is a conditional analyst derivation, not a
new automatic invocation/target proof or helper-global 297-case override.
Normal stable instruction/context/stack and no async-register interference
premises remain explicit; actual default selection is unobserved.

Frozen runtime: `rea-local/.cache/arc-runtime-generic-applications-2026-11-23`,
1,872 files. Verification: 78 source tests, 31 final public MCP calls plus
13 baseline, four exact CLI/MCP pairs and build/fast/docs/package checks.
Five owned positive and four unsupported-boundary cases, two parameters,
same-name arguments, enum non-domain behavior and budget degradation qualify.
Three deliberately malformed derivatives reject missing/extra arguments and
oversized signature bounds. Fourteen historical snapshots authenticate. All
owned lineages are verified empty. Native bridge/recovery/runtime-call/profile
and physical metadata reader code are unchanged; no new full enum or allocator
matrix is claimed. New field checks use the native Apple byte reader within
Ghidra-selected sessions, not new Ghidra algorithm verification. No Arc or
fixture code was executed. Workers remain unavailable. This follows local
`20235139d`; no new push was requested. Full Arc remains incomplete.

## Previous generic declaration / typed Root-use checkpoint (2026-11-23)

Read `field-tests/arc-generic-declarations-2026-11-23.md`, its fact index,
qualification, CLI parity and snapshot manifests. Item 70 is done. The native
field reader inventories generic struct/enum declarations separately from
its nongeneric function-atom interpretation. Optional `is_generic` retains the
original descriptor flag. Generic substitutions, requirements and instantiated
layout remain unresolved. Keep the physical metadata reader's new explicit
original-descriptor generic guard; it no longer relies on narrower owner
admission. A forged owner-matching metadata record is a negative control.

Arc Dependency `0x103d46d5c` now retains `initialValues`, `keyPath`, `file`,
`fileID`, `line`. Root field 6 still preserves raw Dependency<Client> mangling;
there is no new automatic specialization or generic instance layout support.
Owned generic structs/enums and same-name foreign owners remain distinct.
A concrete closure in a generic owner can decode independently, while generic
parameter types and native argument ABI remain unresolved.

New item 63 native trace: caller `0x10150478c` calls candidate initializer
`0x1012a5544` at `0x10150486c` with X8=SP+0x1680, then sends that source in X1
and exact Root metadata `0x104316db8` at caller stack+0x20 to `0x100876de8`
(call `0x10150490c`). The consumer saves source in X26, metadata in X28;
`0x100876ee8` uses VWT+0x20 with X1=source/X2=metadata. This is
**initializeWithTake**, not copy: VWT `0x104316d50`, slot `0x104316d70` ->
`0x1012b4074`, which sets W2=0x280 and tail-calls memcpy. Under normal VWT,
valid/live/disjoint storage and stable metadata, it is an operation-specific
typed constructor-output use. Intervening unknown calls/aliases still prevent
claiming unchanged constructor bytes or the exact later captured instance.

Public conformance `0x103788ae8` binds BoostsEditor:Reducer table `0x1046270d8`.
Slot 4 -> `0x1012a9870` copies 640 bytes from incoming X20 to SP, sets X20=SP
and calls `0x1012a571c` at `0x1012a98b4`. Slot 5 -> `0x1012a98d0` ends in
BRK at `0x1012a9984`; do not invent a reducing method from slot order. These
supply separate typed-use/protocol-entry anchors, not a complete instance flow.

**Continue item 63** at supported concrete generic specialization/substitution,
relevant unchanged keypath/Client windows, captured-instance/default relation,
argument forwarding and an observation-only invocation-domain/mapping carrier.
Do not restart generic declaration inventory, Root layout, keypath-return,
pattern selection, default witness targets or these typed-use anchors.
No helper-global 297-case override. Full Arc and browser/durability remain open.

Frozen runtime: `rea-local/.cache/arc-runtime-generic-declarations-2026-11-23`,
1,872 files. Verification: 67 source tests, 55 final-runtime public calls plus
18 baseline calls, four exact CLI/MCP pairs and build/fast/docs/package checks.
Thirteen historical snapshots authenticate. All owned lineages are verified
empty. Native bridge, enum recovery, Swift-error model, runtime-call registry
and Ghidra profile code are unchanged; no fresh full enum matrix is claimed.
The guide's stale v9 profile label is corrected to existing v10. Metadata field
checks use the native Apple reader; constructor/witness checks use real Ghidra
with its explicit one-second partial policy and caller-asserted seeds.
No target/fixture code was executed. Workers remain unavailable. This checkpoint
follows local `4da794cf7`; no new push was requested.

## Previous keypath / dependency-selection checkpoint (2026-11-23)

Read `field-tests/arc-keypath-origin-2026-11-23.md`, its `fact-index.json`,
`qualification-verification.json`, `cli-verification.json` and snapshot.
Item 69 is complete. The shared exact-import runtime registry preserves the
C pointer return of `swift_getKeyPath` (two pointer arguments, X0 result), with
unknown memory effects and the same identity/override protections as item 68.
The profile component is `swift-runtime-c-signatures-v2`; the public contract
is `swift-keypath-c-abi-v1`. Do not apply that C signature to Swift metadata
response imports such as `swift_getAssociatedTypeWitness`.

All eight keypath returns in candidate initializer `0x1012a5544` are retained.
It emits eight 80-byte Dependency wrappers and 640 output bytes; the seventh
uses pattern `0x103788708`, stored by Dependency.init at wrapper+16. This is
compatible with BoostsEditor field 6 at 480, but source paths and layout alone
do not prove constructor declaration ownership or actual captured Root origin.

Selected pattern root/leaf symbolic atoms bind `DependencyValues` descriptor
`0x103d46e58` and Client `0x103d648c4`. The external property descriptor
`0x10373ccb8` has a zero header, selecting local getter thunk `0x1012b283c` ->
`0x1003b5454`. It passes Client metadata `0x1042c8ac0` and TestDependencyKey
witness `0x1045ee8b0` to lookup `0x1006fb0c0`. Public conformances bind that
witness and the DependencyKey witness `0x1042c8348` exactly. The lookup checks
storage/casts/context, then its cache path is `0x1006fbea4` -> callback
`0x1006fe650` -> selector `0x1006fc894`. Cache-miss context 0 resolves the
DependencyKey slot 2 getter (`0x100d929a0` for this static conformance). Context
1 uses TestDependencyKey slot 2 (`0x100d8c154`, same global Client copy);
other valid context uses slot 3 (`0x100d8c1dc`, different closure construction).
Method names are absent; do not invent them or claim actual active selection.

**Continue item 63** at generic wrapper/type representation and candidate
constructor ownership/use, then relevant keypath/Client stability through
aliases, unchanged argument forwarding and an observation-only invocation-domain
carrier. A conditional default-target path is now traced; active injected
values are not observed. Do not restart completed allocator, Root physical
layout, keypath-return, pattern or witness-target work. No helper-wide 297-case
CFG/type override. Broader browser and durability work remains open.

Frozen runtime: `rea-local/.cache/arc-runtime-keypath-abi-2026-11-23`, 1,872
files. Verification: 86 source tests, 94 successful final-runtime public MCP
calls, four exact CLI/MCP pairs, six real boundary probes, stock Swift-error
coexistence and build/fast/docs/package checks. Twelve historical snapshots
authenticate. All qualified lineages are empty. Arc retains 23 allocator
returns, 28 reducer mappings/10,072 bytes and the 14-instruction/56-byte helper
with zero tables. Original recorder expiration and sandbox launch failures
remain distinct from qualified success; read the report's harness notes.
No target or fixture library was executed. Workers remain unavailable.
This checkpoint follows local `a3b2505f8`; no new push was requested.

## Previous allocator / captured-origin checkpoint (2026-11-23)

Read `field-tests/arc-invocation-origin-2026-11-23.md`, its
`qualification-verification.json`, `cli-verification.json` and `fact-index.json`.
Item 68 is complete: exact supported libswiftCore `swift_allocObject` imports
now receive their declared C ABI, preserving X0 allocation results rather than
the metadata input. The helper copies the installed Apple C compiler prototype
into the private Swift Program; it supplies no memory-effect/noescape summary.
Public `native_api.runtime_call_signatures` retains assumptions and identities.
Wrong libraries, local namesakes, user/imported signatures, call-site overrides
and analyst-created external labels are protected. Do not apply the contract
from a display name or interpret the result as library authenticity/purity.

The actual constructor now retains all 23 allocation returns. Its assembly and
body are unchanged. Final verification: 86 source tests, 28 final-runtime public
MCP calls, five whole-Evidence CLI pairs, six production-boundary probes,
Swift error-model coexistence and build/fast/docs/package checks. Research and
baseline transports total 159 public calls (158 successes/one correct file-size
refusal). The first authority counterexample and harness failures remain
explicit. Archived Java sources under a script root caused stale probe classes;
the uniquely named final probe sources are authoritative. Private diagnostics
are not normalized public Evidence. All owned lineages are empty.

New item 63 facts: the reducer allocates a 0x2a0 context and copies 0x280 bytes
of its environment into context+0x10. Async descriptor `0x1037887f8` selects
`0x1012b3670`, which passes that environment to `0x1012ab2d0`; the entry stores
it at async frame+0x348, later used by the selected worker. Adjacent descriptor
`0x1037887f0` selects the entry itself, not this capture thunk.
Exact Root metadata `0x104316db8` -> `BoostsEditor` owner `0x103d7b1ac` has
size 640 and offsets `0,80,...,560`: field 6 `_userDefaultsClient` is at 480.
Its raw generic typeref at `0x103bd6880` matches the worker's type-instantiation
reference. Wrapper `0x1012b2920` passes source X24 and this exact metadata to
VWT copy target `0x1012b3904`; this is a conditional typed source anchor, not
proof of all intervening aliases or active dependency values.

**Continue item 63** at generic Dependency/keypath construction and
selected/default Client code/context origin, then field stability/forwarding
and observation-only invocation mapping. The captured Root and physical field
offset are now concrete; do not restart those steps. No helper-wide 297-case
type/CFG override. Reducer remains 28 mappings/10,072 bytes; Setting helper
14 instructions/56 bytes/zero tables. Full Arc remains incomplete.

Final runtime: `rea-local/.cache/arc-runtime-allocation-abi-final-2026-11-23`,
1,872 files. Eleven historical snapshots are authenticated. The enum recovery
class is unchanged; no new run of its 110-case matrix is claimed. No target,
helper or fixture library was executed. Workers remain unavailable due to quota.
This checkpoint and the previous four commits are local and unpushed.

## Previous selected call / origin checkpoint (2026-11-22)

Read `field-tests/arc-closure-origin-2026-11-22.md`, its `fact-index.json`,
`qualification-verification.json` and `cli-parity-verification.json`.
Do not restart completed field-type or physical-layout work. The new optional
instruction `call_preparation` is a conditional observed fallthrough suffix,
not full reaching state or an ABI/type/target resolver. Native MOVZ/MOVN and
logical MOV-equivalent encodings, including Ghidra's ORR spelling, determine
values; operand Scalars cannot distinguish a vector lane index from a constant.
Two failed experimental captures and source versions are retained; final
qualification passes all 20 semantic native controls.

Actual call `0x1012ab840` in `0x1012ab5c8` loads code/context from X22+0x10,
retains the context, destroys that same Client source through wrapper
`0x1000078a4`, sets W0=0x31 and X20=context, then BLR X23. The wrapper binds
metadata `0x1042c8ac0` / VWT+8 destroy. Its 13 instructions cover 52 bytes.
The source-type anchor requires normal VWT, valid live/disjoint storage and
selected-field stability across that window. Retain is not assumed pure.
The surrounding function uses an async frame; the selected closure's own
normal synchronous ABI remains a separately stated premise.

Enum accessor `0x1005ad394` returns metadata `0x10426d770`, bound exactly to
descriptor `0x103d41568`; VWT `0x10426d6f0` size/stride 2, flags 0x00200001,
alignment 2. Under the normal valid one-argument typed-closure premises,
X0=49 cannot be an aligned indirect enum pointer. This conditional selected
ABI discrimination does not bind the actual code/context to the default
constructor. Metadata `argument_abi` stays globally unresolved. Owned constant
49/50 controls still distinguish ordinary/frozen direct i16 from resilient
indirect storage. Exact import identities do not imply pure calls or immutable
dependency selection; the v10 hidden-argument safety rule is unchanged.

Final runtime: `rea-local/.cache/arc-runtime-call-preparation-final-2026-11-22`,
1,871 files. 67 final public MCP calls, five whole-Evidence CLI/MCP comparisons,
85 source tests and fast/build/docs/package checks pass. One earlier parity
attempt retained differing one-second measured outcomes; final fixture parity
uses the same 60-second policy. Arc remains explicitly partial at one second,
with 2,508 caller-asserted seeds. All completed lineages are empty. Reducer
mapping equality remains 28 / 10,072 bytes, Setting helper 14 / 56 / zero tables.
Ten historical snapshots are authenticated. No new run of the old 110-case
enum matrix is claimed. Independent workers remain unavailable due to quota.

**Next item 63 step:** close selected code/context origin and field stability,
then unchanged argument forwarding and an observation-only invocation mapping
carrier. Current positive facts are sufficient to narrow that task, not to
install a helper-wide 297-case bound. Full Arc remains open. This checkpoint
and the previous three commits are local and unpushed.

## Previous static metadata / ABI checkpoint (2026-11-22)

Read `field-tests/arc-closure-abi-2026-11-22.md`, its `analysis-addendum.md`,
`qualification-verification.json`, `abi-control-layout.json` and `fact-index.json`.
The metadata tool's optional `swift_metadata_address` now binds one static
nongeneric struct instance to the selected indexed owner. It decodes the
uint32 field-offset vector, VWT layout and copy-slot identity with separate
coverage. Shared helper identity cannot replace the owner backpointer; unknown
copy targets preserve independent offsets. Complete function declarations now
explicitly leave `argument_abi` unresolved.

Arc: metadata `0x1042c8ac0` -> owner `0x103d648c4`; vector `0x1042c8ad0` contains
23 offsets `0,16,...,352`; VWT `0x1042c8a58` size/stride 368 -> copy target
`0x100d97b04`. Thus boolForSetting is at physical offset 0. Fresh Ghidra reads
bind wrapper `0x100cce81c` to that metadata and VWT+16 call. Getter source is
SP+0x170 at `0x100d929f8`. Under normal VWT/stable metadata/valid source premises,
this is a concrete conditional source-type anchor, not a full invocation proof.
The copy body stores the first pair before its later calls; post-call stability
and relevant code/context origin remain unknown.

Owned 297-case controls demonstrate ordinary/frozen direct i16 versus resilient
indirect pointer closure passing despite the same reflected type/case count
and current enum size 2. Do not implement a direct-register lowerer from that
metadata alone. Enum VWT flags differ (0x00200001 / 0x02200001); no general ABI
rule is inferred from that one compiler-specific trait. The merged nominal
owners share copy helper 0x2004 and still fail a mismatched backpointer check.

Final runtime: `rea-local/.cache/arc-runtime-closure-abi-final-2026-11-22`,
1,871 files. Verification: 136 tests, build/fast/docs/package; 41 public MCP
calls (39 successes/two intentional invalid requests), three exact CLI/MCP
comparisons, final exports and empty lineages. Metadata uses native-macos;
selected Ghidra calls use v10 plus 2,507 caller-asserted seeds. No bridge change
or repeat of the 110-case engine matrix. Earlier captures/source versions and
nine historical snapshots are preserved/authenticated. Only test grouping
changed after the final freeze for lint; all production source hashes match.

**Continue item 63** with selected ABI and closed code/context origin, then
unchanged forwarding and an observation-only invocation carrier. Physical field
offsets and the conditional VWT-source anchor are now available; do not restart
that metadata work or silently turn the source premise into a global type.
Full Arc and the broader runtime/durability limits remain open. No target was
executed. This checkpoint and the previous two local commits are not pushed.

## Latest selected field-type checkpoint (2026-11-22)

Read `field-tests/arc-field-types-2026-11-22.md`, its `qualification-verification.json`
and `fact-index.json`. Item 63 has a completed **field-type inspection step**,
not a completed typed invocation proof. The existing metadata operation adds
opt-in `swift-fields` with required exact `swift_type_address`; `all` inventories
retain their previous scope. Exact complete supported symbolic field function
shapes and pure-enum declaration ordinals are observation-only, with false
`program_mutations`. Field ordinals are not physical offsets.

Arc's exact `boolForSetting` declaration is now producer-bound as
`@Sendable (ArcUserDefaultSettings) -> Bool`, enum descriptor `0x103d41568`,
zero payload / 297 empty cases. The full index scan examines 11,125 entries
with no unresolved identity for this selection. All 23 fields are retained;
four supported functions decode, nineteen types remain unsupported. The owned
merged typed/UInt16/foreign-owner controls keep nominal identities separate;
return-only enums supply no parameter domain. New compiler controls also pin
unsupported optional/async/throwing/zero-argument/generic shapes.

The public MCP run has 20 successful calls and two intentional invalid-input
errors; two CLI runs match exact Evidence. Exports, schema/Evidence/raw-byte
verification, two closes per session and empty lineages pass. This operation
uses the native-macos byte reader inside Ghidra-selected public sessions;
no Ghidra analysis or fixture/Arc execution was requested. The frozen runtime
has 1,870 files at `rea-local/.cache/arc-runtime-field-types-qualified-2026-11-22`.
All qualified production/test source hashes match. The earlier runtime/captures
and recorder/verifier failures remain separate and preserved. Regression tests
caught and fixed coverage ordering/field-budget propagation before the qualified
public retest. There are 124 affected source tests; fast/build/docs/package checks
pass, including installed CLI/MCP and empty package-verifier lineage. Eight prior
snapshots authenticate against their original committed source versions.

**Continue item 63** with native ABI argument lowering, exact typed root and
physical field offset, closed memory-window code/context origin, ordered
argument forwarding and an observation-only invocation mapping carrier. Never
install a helper-global bound/JumpTable override from this declaration alone.
The earlier v10/110-case safety qualification remains valid historical evidence;
this independent reader did not change Ghidra recovery code or repeat it.
All broader Arc/runtime/durability limits below remain. Changes in this
checkpoint and local `60c75d904` have not been pushed.

## Latest ABI frame-escape safety checkpoint (2026-11-22)

Read `field-tests/arc-frame-escape-2026-11-22.md` and its
`qualification-verification.json`, `retest-verification.json` and
`qualification-index.json`. The previous restore/preview checkpoint is pushed
as `305e5acb0fa1`. All owned sessions below are closed with verified empty
lineage. The new frozen runtime is
`rea-local/.cache/arc-runtime-frame-escape-final-2026-11-22` (1,869 files).

Continuing item 63 reproduced a prerequisite bug. At unknown calls, both
historical frame escape and post-call spill retention checked only X0-X7.
An owned linked fixture passes the tag-spill address through X8 to a writer
that stores 65,536; v9 nevertheless publishes a 30-case unchanged-tag bound.
One shared predicate now includes X0-X8, Swift self/context X20 and async
context X22. The source/profile changes are `abi-signed-word-cfg-v10`.
The X19 non-argument control still recovers all 30 cases. This is item 67;
it does not establish item 63's typed invocation context or closure origin.

Verification: build, 42 provider tests, fast/docs/package checks; the complete
**110-case native suite (16 positive / 94 negative)**, **440 MCP replies** and
**14 CLI/MCP comparisons**. The exact unchanged counterexample and fixed Arc
are retested with **15/15 replies**, final exports and two explicit closes per
session. The counterexample's v10 result has no REA+ Swift-bound table. Arc's
existing reducer mappings remain **28 cases / 10,072 body bytes**; the Setting
helper remains **14 instructions / 56 bytes / zero recovered Swift tables**.
The large reducer uses summary plus its exported complete parent, not an
oversized inline retry. Its derived view correctly has no source profile;
the verifier authenticates the exact parent's v10 profile instead.

Original failed/partial runs are preserved and classified explicitly. The
first v10 trial rejected all seven unsafe controls; its positive control
recovered correctly but a stale duplicated-proof verifier assertion failed.
That assertion now checks the shared proof plus each case's exact link. No
old capture/review was edited. A first offline retest-verifier assumption about
the derived view's profile was also corrected, with its failed log retained.

**Next remains item 63:** complete symbolic closure-field type parsing and
normal ABI lowering; exact typed root and selected code/context origin with
closed memory windows; an observation-only per-invocation domain/mapping
carrier. Do not populate a helper-global type or JumpTable override from one
typed caller. The earlier owned merged typed/UInt16/foreign-owner fixtures
remain decisive negatives. Worker usage limits prevented a new independent
typed-context review; continue sequentially unless workers become available.
Full Arc, higher restore caller/writeback, broader apply/UI/browser paths and
runtime dependencies/I/O/pixels remain open. No selected target was executed.

## Latest restore/preview checkpoint (2026-11-22)

Read `field-tests/arc-restore-preview-2026-11-22.md`, then the directory's
`analysis-addendum.md`, `capture-verification.json` and `fact-index.json`.
The preceding feature/storage checkpoint is pushed as `a7fd989921b1`.
Production source and the 1,869-file frozen runtime are unchanged. All owned
sessions are closed with verified empty lineage.

Restore ordering is now a stable descending sort of
`date ?? Date.distantPast`; equal keys retain directory enumeration order.
The classifier uses the original basename prefix and a separate backup flag;
date validity is not an exclusion. The selected leaf returns the first
eligible successfully decoded value, discards per-candidate read errors and
does not request a save. Its now-captured queue callback also adds no save.
A higher invoking application caller and later writeback remain unknown.
Exact suffix collection typing stays qualified: the complete mangling is
retained, but the selected imported-slot name queries returned null.

Preview's field type is `(WebContentFrameIdentifier) -> (any WebContent)?`.
Exact descriptor identity, pair flow and the official Swift ABI bind the
`+0x2e8` call as protocol-witness dispatch. Two observed local conformances
map word 93 to Chromium `0x10054bbf4` and Stub `0x100006b90`. The former calls
`captureViewport:` with an NSImage block and forwards its image argument to
the supplied Swift callback. The selected continuation payload is NSImage?.
The latter is a return stub. Modern/fallback callbacks converge through
distinct trampoline addresses. Discovery is partial and runtime selection,
callback delivery and image pixels are unobserved. Reflected
`webView: ArcWebContents` is not promoted into a proved receiver-field mapping.

Verification: 227/227 successful public replies, 115 original-byte-matching
instruction probes, advertised/named schemas, Evidence/export membership,
four preserved review artifacts and all frozen runtime/source hashes. The
199-call first session expired and correctly reports failed/partial; its
late continuation did not run. The fresh 28-call follow-up exports, closes
twice and verifies empty lineage. Item 66 behaves correctly; no new production
defect or native producer qualification is claimed. Old captures/reviews are
unchanged; the addendum resolves the earlier review's pending ABI premise.

Next: item 63's safe invocation-scoped typed-context producer; complete
apply/UI effects and broader browser routes; selected higher restore
caller/writeback. Active injected dependencies, actual I/O, durability and
pixels remain unobserved. Full Arc is not complete. The previous checkpoint's
restore-ordering and unnamed preview-slot gaps are superseded by this section.

## Latest feature/storage checkpoint (2026-11-22)

Read `field-tests/arc-features-storage-2026-11-22.md` and
`field-tests/arc-storage-features-2026-11-22/{capture-verification,fact-index}.json`.
The prior directory checkpoint is pushed as `8e48a0914d6d`. Production source
and the 1,869-file frozen runtime are unchanged; this is research plus a field
recorder correction, not a new native producer qualification. All owned
sessions are closed and lineages verified empty.

The post-model `featuresUsed` write is now closed as a selected static chain:
original model -> feature-label array -> dictionary -> separate awaited
`setData:merge:completion:` with merge 1. It uses the same document receiver;
its error forwards after primary model success. Labels in order: css, js,
font, textTransform, textZoom, zaps, colorScheme. Read the independent predicate
review for exact gates/field offsets. The color baseline makes nested payload
comparison unreachable for this question. These labels do not prove execution
or rendering, and the feature request is additional to the two model merges.

The selected StorableBoostsData contract expects version 0. `StorableVersion`
fallback improves error diagnosis; it does not migrate payloads. Local enable
read failure proceeds from an empty Set; its save passes backup flag 0 and
releases a save error, retaining the insertion result. Read backup attempts
can still leave the original error. Backup names insert a formatted date
before .json; format yyyy-MM-dd-HH-mm-ss-SSS. Public bytes bind POSIX locale,
setCalendar (not setTimeZone), copy/0600 attributes, synchronization, close and
best-effort temporary removal. The selected retention schedule is empty.
Do not claim runtime fsync, crash consistency, every generic backup policy or
a selected restore caller; ordering/writeback remain qualified.

Two sessions total 309/309 successful replies. The first expired after 73 and
is correctly classified partial despite its original recorder's 'completed'
summary; cleanup is verified. The second has 236 replies, final export and two
explicit closes. New harness expiration is verified as a real target-free
expected failure. This field-recording defect is item 66. The independent
predicate review was saved before worker quota limits; root completed storage
queries/interpretation and verification without a formal storage-agent report.

Next: item 63's safe typed-context producer; preview method slot +0x2e8; final
apply/UI effects, browser reducers, restore ordering/caller behavior and other
broader feature routes. Runtime dependency selection and actual local/remote
readback remain unobserved. Earlier 'featuresUsed full effects' and broad
no-sync/version-policy gaps below are superseded by this section/report.

## Latest default-directory checkpoint (2026-11-21)

Read `field-tests/arc-base-url-2026-11-21.md`, plus its capture verification
and fact index. Item 65's code/evidence is pushed as `c59033f73ad0`; this
follow-up changes research/docs only and reuses its qualified frozen runtime.
All sessions below are closed; no provider or owned DMG mount remains live.

The selected shipped ordinary default constructs **user-domain Application
Support / Arc / StorableBoostsData.json**. `URLForDirectory` uses directory 14,
domain 1, create true; exact installed SDK constants and public selector
bytes bind the API. NSBundle `CFBundleName` supplies `Arc`, verified by public
`inspect_plist` on exact original-DMG plist bytes. Its 5,697-byte hash matches
the old extraction manifest. Supplemental byte retrieval uses the existing
owned read-only reader, closes it and verifies empty helper lineage.

Precedence: when a classifier byte equals 1, a nonempty first matching
`--user-data-dir=...` suffix can override; otherwise the selected Client
`stringForSetting` tag 0x10 can provide `customApplicationDataBaseURLPath`.
Then the user-domain Application Support/bundle-name fallback applies. The
stored preference route is tied to the actual default adapter/reader and
`stringForKey:` selector, not its field name alone. `--log-file` sets a
separate optional log URL/flag. The classifier's semantic name is still
unknown; do not label it development/release merely from the current plist.

Three new sessions: 163 calls, 159 successful/four initial admission errors.
The later profile adds exactly 18 original function-start/code-reference
entries (2,481 total); both later sessions succeed throughout. All export,
close twice and verify empty lineage. Production code is unchanged; no new
native matrix/package run was needed for this analysis-only follow-up.

Next independently useful questions: trace the post-write `featuresUsed`
update; inspect local version/migration/backup/error/durability policy; prove
the remaining typed-context carrier for item 63; then continue the broader
browser feature routes. Actual injected runtime dependencies, current
arguments/preferences, filesystem readback and full Arc remain unproved.
The earlier default-directory gap below is superseded by this section.

## Latest detached-instruction checkpoint (2026-11-21)

Read `field-tests/arc-unlisted-instructions-2026-11-21.md` and
`field-tests/arc-typed-dispatch-2026-11-21/retest-verification.json` first.
The prior witness-data checkpoint is pushed as `d647436b459d`.
Item 65 adds explicit unlisted byte decoding to the instruction probe; it
creates no function/Listing/CFG/reference objects. The frozen runtime is
`rea-local/.cache/arc-runtime-unlisted-2026-11-21` (1,869 files). All sessions
from this checkpoint are closed with verified empty lineage.

Verification: 43 focused tests; fast/build/docs/package gates; ARM64/x86-64
native fixtures with 44 MCP calls (four expected input rejections), two exact
CLI/MCP cases; 137/137 current Arc replies. An earlier typed-root session
made 20 calls, 18 successful and two retained admission errors. The enum
recovery class is unchanged; the 102-case matrix was not repeated.

The selected location tag `0x32` produces `StorableBoostsData.json`. Its branch
`0x100d98aa0 -> 0x100d98ad0 -> 0x100d98f68 -> 0x100d98fd0` is now represented
by public instruction Evidence, without changing the old function body.
The last helper appends the filename to its supplied URL, obtains the parent
URL when the flag is zero, checks existence with NSFileManager and creates
missing directories with intermediates enabled. Failure builds a fatal-error
message at ApplicationPaths.swift line 383. This is selected static code,
not observed filesystem behavior. The factory's generic dependency is exactly
`Dependency<ApplicationPaths>`; reflected field zero is `baseURL`. Trace its
actual construction/default/injected value next before assigning a full path.
Do not call an equal-size UserDefaultsClient value the location dependency.

Item 63 remains open. The owned optimized controls merge typed enum, unchecked
UInt16 and same-name foreign enum callers into one helper. A typed caller does
not establish a global domain for that shared helper. Start with an
observation-only per-invocation proof carrier; do not install the existing
owner-wide JumpTable override based on one closure's type. The design review
and source/assembly oracles are retained in the new directory. The exact
UserDefaultsClient VWT wrapper binds a conditional source snapshot under the
normal Swift ABI/valid-source premise; it does not prove a constructor's
signature, origin across unknown writes or active default selection.

## Latest witness-data repair (2026-11-21)

The callback checkpoint below is pushed as `4f870986e`. Read
`field-tests/arc-witness-data-2026-11-21.md` and
`field-tests/arc-dispatch-provenance-2026-11-21/retest-verification.json` next.
Item 64 adds structured inherited/associated witness data to the native byte
reader and optional canonical row fields. It resolves the exact inherited
TestDependencyKey table and `Value = UserDefaultsClient` descriptor
`0x103d648c4`. Code targets and broader discovery's 401 unknown identities are
unchanged. Unsupported data encodings retain partial facts.

The typed-data repair passes 92 source tests, fast/build/docs/package checks,
ten real compiler variants, seven discovery comparisons, 40/40 public MCP
replies and two exact Arc CLI/MCP cases. Both new MCP sessions export/close
cleanly; the package verifier's lineage is also verified empty. No live session
remains. Native Ghidra Java/recovery is unchanged; do not rerun its 102-case
matrix solely for this byte-reader change.

The new frozen runtime is
`rea-local/.cache/arc-runtime-witness-data-2026-11-21` (1,868 files, source
hashes in the new manifest). The prior retention runtime and all original
captures remain intact. Seed profile `storage-io-seeds-2463.tsv` is unchanged.
Item 63 still needs typed field/constructor/adapter provenance and owned
producer controls; getter names/signatures are not inferred from requirement
kind or slot order. The unrelated location-dispatch input is still unresolved.
Do not treat the new associated-type identity as complete table recovery or
runtime injection proof. Continue the exact boundaries listed below.

## Latest callback/local-store checkpoint (2026-11-21)

Read `field-tests/arc-callbacks-2026-11-21.md` and its `fact-index.json`,
`capture-verification.json`, `source-verification.json` and independent
`js-activation-two-writes.md` first. They supersede older "getter decoding",
"alternate setter" and "editor save trigger" gaps below. Earlier reviews and
captures remain immutable; later notes resolve their uncertainties separately.

The editor constructs `createBoost`/`setBoostData`/preview effects. The selected
converter computes `storedActive && (localID || !nonblankJS)`; a local-read
error supplies an empty Set. New local insertion is not save success. It
causes two primary model-data merges: inactive temporary, then original model
only after the first succeeds. Both errors forward. A following `featuresUsed`
update still needs tracing. Do not describe the temporary's inactive flag as
final persisted state.

The typed `StorableDataStore<StorableBoostsData>` factory `0x10118c418` reaches
`StorableDataStoreImpl`, synchronous queue wrappers and JSON/file I/O. The
writer uses a sibling `.tmp-<UUID>` URL and replacement API. Exact location,
version/migration, backup/error policy, fsync and durability remain unresolved.
Its location helper `0x100d989e4` masks to 8 bits and uses an unguarded halfword
dispatch with selected tag `0x32`; this is distinct from the 297-case Setting
converter. Neither input type nor full dispatch is proved. Existing item 63
remains open. Generic unknown throwing closures remain outside item 47's
proved named synchronous-callee profile; do not alter their x21 semantics by
assumption.

Five sessions: 354 calls, 352 successful replies, two retained procedure
admission errors for one interior branch target. One plan accidentally reused
a label; the driver stopped before invocation. Its 71 completed records and
failed status remain retained; six records follow its last bundle. The
verifier authenticates them from original public replies without claiming a
complete bundle. The other four sessions export final bundles and close twice.
**All five owned lineages are verified empty; no live session remains.**
The prior manifest is unchanged: its 826 capture/support files still match;
three living documents now have new revisions and their historic bytes are
authenticated from published `a8b426fedc`. All 1,868 frozen-runtime files match.
No production source changed, so no new native producer qualification is
claimed. Current complete source-bound profile is
`storage-io-seeds-2463.tsv` with receipt/reproducer in the new directory.

Continue with: (1) exact store location/input-type provenance and item 63's
owned positive/negative controls, (2) remaining `featuresUsed` and detailed
local-store policy/error continuations, (3) preview object-method `+0x2e8`,
then final browser reducers and the existing broader feature checklist. Use
actual catalog schemas and unique labels checked against the whole journal
before writing a continuation. Reuse frozen runtime
`rea-local/.cache/arc-runtime-retained-summary-2026-11-20` and a new output
folder; preserve all old journals. Remain offline and publish mature evidence.

## Pre-upstream preservation checkpoint (2026-11-20)

The user authorized saving the Arc baseline, then a focused integration of
upstream Ghidra persistence/retained results. Source remains pinned to
`70d5dd7d1e17b380420c7eb75c37abe1e189134a` at this checkpoint. The retained
text captures, reproducible sources, field reports and dossier are committed
together before provider changes. Their pre-integration digest inventory is
`field-tests/arc-baseline-2026-11-20/manifest.json`; the supplied DMG, cached
native slices, compiled fixtures, frozen runtimes and provider projects remain
local. No Arc code or shipped script has been executed.

Use the Git tag `arc-baseline-before-upstream-2026-11-20` to return to the saved
source/research state. The historic session outcomes and next semantic work
below still apply. Later integration notes must state which upstream features
actually passed local qualification. Broader upstream parity is a separate
backlog in item 62; it must not block the bounded Arc-focused update.

The following November 16 Git/publication account is historical; its source
commit is already pushed. This checkpoint saves the previously untracked
supporting material locally before integration.

## Focused upstream continuation (2026-11-20)

Baseline commit `d62dd2f4f826f20cc54bfa22bade6d4cf102799e` and tag
`arc-baseline-before-upstream-2026-11-20` are pushed. The first selective
upstream slice adds opt-in native function summary delivery and portable CLI
bundles, preserving the native bridge and v9 producer exactly. See
`field-tests/arc-upstream-retained-2026-11-20.md` and its machine verification.
All 44 focused tests, fast/docs/package checks, 37 real MCP calls and one fresh
CLI case pass; both real-provider lineages are verified empty.

The first new summary's parent equals the saved historical full Arc Evidence
record, including the 28 mappings and 10,072-byte body. Summary mode is a
delivery choice, absent from the parent's parameters. Use it for selected
native pages. CLI summary requires a new `--evidence-output` bundle path.
Automatic Ghidra Program checkpoints remain open because upstream's stock
profile rejects our seeds/extensions and requires separate ownership/profile
integration. Do not silently remove the seed overlay to enable it.

The selected State name, parent and all 21 stored names are now read through
public tools. `field-tests/arc-upstream-retained-2026-11-20/state-field-bindings.json`
maps declaration indices and trace keys to names with Evidence IDs. Runtime
instance offsets and durable writes are still unproved. Current frozen runtime:
`rea-local/.cache/arc-runtime-retained-summary-2026-11-20`; its manifest records
1,868 files. Actual verification Node is 24.22.3, Ghidra 12.1.4, existing JDK 27.

## Persistence continuation (2026-11-21)

The next public sessions are retained in
`field-tests/arc-persistence-2026-11-20/`; the current report is
`field-tests/arc-persistence-2026-11-21.md`. Use `metadata-bindings.json`,
`selected-preference-path.json` and `capture-verification.json` first. They
supersede the older claim below that the preference client/key names and
NSUserDefaults route are unproved. Actual runtime injection and disk readback
remain unobserved.

`Dependency<UserDefaultsClient>` uses field 0 `boolForSetting` at instance
offset 0 and field 10 `setBool` at `0xa0`, independently verified in static
metadata. Exact Setting descriptor `0x103d41568` has 0 payload/297 empty cases.
Tags `0x31`/`0x32` are `hasDismissedBoostsInterstitial` /
`hasDismissedJSWarningBanner`; two selected table branches independently
return those exact key strings. The selected default conformance candidate
reaches NSUserDefaults suite-or-standard initialization and `boolForKey:` /
`setBool:forKey:` through captured closures. Publisher callback invocation and
flush are not observed. The new retained helper scripts recheck these facts.

The shared mutation async dependency is `BoostsClient`; its observed static
field 13 offset `0xd0` is `applyToWebContent`. Conditional companion dependency
is `AnalyticsClient`. Neither should remain labeled a proved durable save.
Default field 5/6 route through `BoostsStorage`; exact conformance identities
are `BoostsStorageMemoryImpl` and `BoostsStorageFirebaseImpl`, selected by an
unnamed byte predicate. Captured helper classes include `BoostsImageCacheImpl`
and `BoostsWebContentHelperImpl`. Application entries use the main actor.

New item 63 records a real unsupported automatic-recovery profile: anonymous
converter `0x1005aa5e4` has an unguarded UInt16 relative table. It still reports
14 instructions/56 owned bytes/0 recovered tables. The mask does not prove
the 297-case bound. Two source-owned compiler fixtures reproduce its encoding,
with/without RawRepresentable, and show why pattern similarity cannot identify
input type. The producer remains unchanged pending a typed witness/closure
provenance proof and controls. Do not mark 63 fixed from the two concrete
selected-branch derivations. See `halfword-fixture/DESIGN.md`.

The initial shorter application body missed resume `0x1011880fc`; both this and
`0x101188c58` are exact LC starts and now have a narrow source-checked overlay.
The latest seed is
`worker-preparation/firebase-request-seeds-2296.tsv`, SHA256
`acf93127aa3814707b34a12f58360eb60236d8b11fcb28c314c202db102837bf`.
The final public session is `mcp-firebase-2026-11-21/`. Check its actual
summary and new review before repeating admission. Earlier missing-function
replies belong to partial Programs, not absence from Arc.

Harness v2 rejects reused labels and existing output directories. Two v1 label
collisions were recovered from the full immutable bundle without changing the
journal. One followup continuation expired but transport cleanup verified an
empty lineage. No Arc code was launched; no production/native recovery source
changed. Fixture binaries/caches and original target/evidence exclusions remain
local. Publish text captures, sources and updated notes together after final
verification; do not stage the DMG, dylibs, projects or caches.

The seven sessions retain 373 public calls: 330 successful replies and 43
procedure-admission errors from earlier partial Programs. Canonical Evidence
and final empty owned lineages verify. The Firebase ordinary branch constructs
`boosts`/identifier, calls `setData:merge:completion:` (merge 1), and propagates
the callback error or normal completion. Both read-request constructors call
`getDocumentWithCompletion:`. Next inspect getter callbacks `0x10118374c`,
`0x101183754`, `0x101183480` and alternate setter resume `0x101182d1c`; they are
not in the latest 2296 overlay. Verify and add only justified entries before
replay. Exact `BoostsClientError` names now bind Memory raw tags 1/3 to
`doesNotExist`/`invalidData`; do not apply them to the separate Firebase error
wrapper. The editor-to-save linkage, encoding/decoding, alternate setter,
readback and broader browser features remain open.

## Git and approval state (historical November 16)

- Local `main` HEAD is **`70d5dd7d1e17b380420c7eb75c37abe1e189134a`**,
  `feat: recover dynamic Swift payload dispatch`.
- Its push to `Sigurius23/REA-Plus-WIP` **succeeded**:
  `325702b06..70d5dd7d1 main -> main`.
- A subsequent direct SSH `ls-remote` was **not executed**: automatic approval
  review hit its usage limit. The rejection explicitly said this was a review
  failure, **not a determination that the action was unsafe**. It reported a
  reset at 4:25 AM. Do not bypass that approval check with another execution
  route. Push acknowledgment exists; independent final remote readback does not.
- Only two tracked files remain modified: `OPEN_TASKS.md` and
  `field-tests/arc-analysis-dossier-2026-11-08.md`. Many **new field-test notes,
  captures and this handoff are untracked and not yet committed/pushed**.
- Some registry wording still says publication pending. The source fixes are
  already published in `70d5dd7d1`; the new supporting notes/captures are not.
  Reconcile this distinction before the documentation checkpoint.
- Prior pushed checkpoints: `325702b06` retained v8 proof/retest;
  `5628ef81c` introduced bounded Darwin probe effects;
  `076c706c6` repaired cleanup ownership across retries/startup rollback.

Git mutations/network verification use the normal approval mechanism. The
usual push command is:

```sh
GIT_SSH_COMMAND='ssh -o ConnectTimeout=20 -o BatchMode=yes' git push origin main
```

Never stage the supplied DMG, `.cache`, binaries, provider projects, modules,
or the two intentionally local large Rize JSONs. Source-built `.swift`, `.s`,
oracles, raw public replies and canonical text Evidence are appropriate proof
materials. Inspect staged blob sizes before pushing; GitHub's 100 MB file cap
and earlier LFS quota exhaustion matter here.

## Verified implementation — do not repeat the full matrix

Items **55, 60 and 61** are implemented and verified within their stated scope.

1. **v9 typed dynamic snapshot recovery.** A metadata-bound current-SP
   allocation, selected outer payload, all 156 SIMD byte origins, disjoint/live
   regions, pure getter, and closed getter-to-dispatch window recover the child
   switch. Explicit recursive-value/ABI/linkage/nonwrapping/stability premises
   remain. Earlier copy correctness, ownership and actual runtime binding are
   not proved.
2. **Original import admission.** Scan the bounded original chained-import
   table instead of spending 100,000 queries on unrelated relocations. Preserve
   raw names, unique original ordinal, zero import addends, loaded header,
   external identity and exact selected-slot checks. Reject normalized-name
   collisions and mixed unsupported binding carriers.
3. **Shared proof rendering.** Keep the complete roughly 11 KiB proof once at
   the table's data source; mapping evidence retains tag/name, word address and
   target and refers to that shared proof. This fixes unnecessary MCP response
   overflow without raising the budget or removing assumptions.

The recovery matrix passed **102 distinct real Ghidra cases: 15 positives,
87 rejections, 13 CLI/MCP comparisons**. Final owned descendants were verified
empty at `2026-11-15T13:26:31.461Z`.

Recovery-matrix Java SHA-256:

```text
9717688d73a8913fad46891c41a79b1babba5587202baeca7e8108a650c4df34
```

Current/published Java SHA-256 after the evidence-text-only follow-up:

```text
558e14b134d1236bb9101296efd0844db382d7b5428f459ef8330fe3be19ba48
```

The runtime diff proves the follow-up changes only mapping proof rendering;
all recovery code is unchanged. The 102-case matrix was not repeated for that
text change. A real unchanged-Arc comparison verifies identical mappings,
body, complete shared proof and limitations, with a successful inline reply.

Other checks passed: Java compilation; 42 profile source tests; formatting;
fast typecheck/lint; built-documentation checks; package smoke verification
with **205 tools / six prompts** and verified empty lineage. An initial
sandboxed package test failed on npm network/cache access; its authorized host
rerun passed. Both logs remain. Full `check:pr` is optional here and was not
rerun. Do not spend another hour repeating already-green native checks unless
a new semantic code change justifies it.

Proof root (`R` below):

```text
field-tests/arc-dynamic-snapshot-2026-11-15/
```

Read its companion report `field-tests/arc-dynamic-snapshot-2026-11-15.md`.
Important receipts:

- `R/evidence-audit.json`, `retention-index.json`, `text-manifest.json`:
  **212 unique Evidence records, 226 raw representations, five bundles;
  1,002 manifest entries / 243,417,192 bytes authenticated**.
- `R/retained/`: text-only final matrix plus separately labeled historical
  first positive/D-alias rejection; no binaries or projects.
- `R/final-source-freeze.json`, `final-source/`: exact 102-case producer and
  verifier snapshots. Verifier SHA starts `1930838735f94c3f`.
- `R/large-rebase-comparison.json`: unchanged 862,864-byte owned binary;
  v8 zero tables / 296 bytes → v9 24 exact mappings / 776 bytes. Both sessions
  explicitly close and verify empty lineage.
- `R/arc-v9-inline-retest/comparison.json` and `producer.diff`: current
  representation-only repair, same Arc facts, **9,298,190-byte serialized
  reply**, below the unchanged 10,485,760-byte budget; six successful calls,
  two explicit closes and empty owned lineage.
- `R/{package-final-host,docs-final,check-fast-final,source-tests}.log`.

Do not alter captured files or run a formatter across captures. New analysis,
corrections and manifests should be additive. Preserve failed attempts.

## Exact input and runtime

Original supplied package remains local/untracked:

```text
Arc-1.172.1-90370.dmg
SHA256 d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778
```

All current native findings concern this derived main ARM64 slice:

```text
rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64
80,498,448 bytes
SHA256 6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578
```

Do not transfer addresses from the older installed Arc 1.171.0 investigation.
The fixed 1.172.1 dossier records universal/Core identities as needed.

Pinned command environment (the login shell otherwise selects an older Node):

```sh
PATH=/Users/sigur/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/bin:/Applications/ChatGPT.app/Contents/Resources/codex-cli/codex-path:/usr/local/bin:/opt/homebrew/bin:/usr/bin:/bin
JAVA_HOME=/opt/homebrew/Cellar/openjdk/27/libexec/openjdk.jdk/Contents/Home
GHIDRA_INSTALL_DIR=/opt/homebrew/Cellar/ghidra/12.1.4/libexec
```

Node is 24.22.1; Ghidra 12.1.4; JDK 27. Install/upgrade nothing unrelated.
The package lives at `rea-local/`. Use relevant project scripts and installed
dependencies. Disk was about 9.4 GiB free at the last check; no user files were
deleted to obtain that space.

Frozen runtimes with existing locked `node_modules` symlink:

- `rea-local/.cache/arc-runtime-v9-9717688d`: old proof-rendering producer.
- `rea-local/.cache/arc-runtime-v9-compact-evidence`: current published producer.
- Each is authenticated by its corresponding `R/arc-v9-*/runtime-manifest.json`
  (1,865 files). Older v8 snapshots are also retained.

Do not change bridge Java or rebuild a runtime while a session using those
mutable files is active. Use immutable copies for concurrent investigations.

## Session settlement — no live session to inherit

The large working session `R/arc-v9-export-retry/` completed phases 0–7, then
its one-hour continuation wait expired. Latest summary:

- **99 calls / 90 successes / nine retained errors**.
- Nine errors are one expected large-response transport limit and eight
  explicit missing-function admission probes, not nine native feature failures.
- Final export is `evidence/phase-7-bundle.json`.
- No explicit `close_binary` occurred in this recorder. Client/transport
  shutdown verified empty owned descendants at
  **`2026-11-16T00:11:39.712Z`**.
- Do not try to reuse old tool session IDs (30794, 5994, 58276, etc.). Their
  processes ended. Reopen with a new output directory/plan when useful.

An earlier v8 selector close returned truthful `cleanup_incomplete` due to an
unreadable exiting process token (`sysctl_errno_22`). Later client shutdown
verified empty descendants; a later local check found its runtime directory
removed. Do not relabel the first close as successful or infer ownership loss.

## Actual Arc result and remaining limits

The repaired reducer `0x1012a571c` now has a contiguous **10,072-byte body**
(`0x1012a571c..0x1012a7e73`), **2,518 instructions**, and all **28 distinct
targets** at the switch `0x1012a5bc8`. All mappings agree with the independent
112-byte signed table at `0x1012a7e74` / anchor `0x1012a5bb8`.

Canonical full old-rendering record:

```text
R/arc-v9-export-retry/evidence/arc-reducer-v9.retained.evidence.json
ev_583079470e74897be835bc992f7970146808dc6ced3ae7dc423c29725672acc6
```

Current complete inline record:

```text
R/arc-v9-inline-retest/evidence/arc-reducer-inline.evidence.json
ev_7820ea6368f520cd61483866fba5814ed0c4a1661bb9cc22d4c6f15a6806a139
```

The first v9 recorder wrongly stopped on the response-budget error before
exporting. `arc-v9-export-retry` then exported retained canonical Evidence
immediately and continued smaller queries. This was an orchestration error;
the analysis itself completed. Preserve both attempts.

**Full assembly/body recovery is not complete high-level semantics.** Native
p-code is truncated at 3,000 operations, eight synchronous-throw sites remain
uncertain, and actual injected client/runtime instances are unobserved. A trace
page with no next cursor does not remove provider truncation/depth/unresolved
call limitations.

## Semantic work already available

The most useful current directory is `R/arc-v9-export-retry/`:

- `case-map.md/json`, `map_reducer_cases.py`, `case-map-audit.json`,
  `case-instructions/`: all 28 names/targets, decisions, visible writes,
  direct/indirect calls and effect boundaries. Its case CFG union covers
  2,029 caller instructions; prefix/other outer-action paths are separate.
- `common-mutation-followup.md/json`: the 702-instruction apply-like helper.
- `feature-findings-phase5.md/json`, `feature-findings-phase6.md/json`,
  `feature-phase-*-audit.json`: scoped findings and canonical provenance.
- All phase 7 records exist, but their new State/dependency facts are not yet
  fully integrated into the human findings.

Selector work lives under `field-tests/arc-selector-v8-2026-11-15/` and its
earlier `field-tests/arc-feature-followup-2026-11-14/` directory. It establishes:

- A flipped AppKit tracking view, setup/update/removal, exact tracking options,
  view-local point conversion and additional normalized point coordinates.
- Point filtering rounds to two coordinate units; do not call those physical
  pixels. Hover queries use reciprocal scale; returned rectangles scale forward.
- Native hover/selection State, SwiftUI radial-gradient spotlight and padded
  rounded candidate rectangles. No live viewport/page/world mapping is claimed.
- Candidate JS generator filters global matches ≤100; the native result
  consumer separately filters ≤500. Sampling target 15 is not a hard result cap.
- First candidate selection, commit through a captured callback, then reset of
  locked rectangle/candidate array/selected candidate. Root caller binding and
  durable effects still need completion.
- `selector-source-semantics.md/json`, index and inert source copy: exact
  11,068-byte source hash matches fixed-build producer Evidence. Shipped JS was
  never executed. Native single-zero-rectangle retry is a readiness heuristic,
  not a dedicated JS error sentinel. Invalid CSS in rect lookup can throw.

The dossier preserves historical E01–E88, adds separate S01–S30 and V01–V10
anchors. Do not rewrite old indices to describe new observations.

## Exact next work, in priority order

### 1. Continue State type and dependency bindings

The reducer's metadata accessor `0x1012b05e8` is fully captured (20 bytes/five
instructions); it passes cache `0x104627168` and descriptor `0x103d7b238` to
shared helper `0x100026010`. The returned metadata is used for the state field
vector. Phase 7 already captured its 40-byte descriptor and 16-byte cache.

Straight signed-relative decoding of canonical
`ev_74b6d6c45c4a63111a9c5725ac62c5fbe15b2c9de7e5217f2915f8b9273168fa`
gives:

| Field                           | Value                                                    |
| ------------------------------- | -------------------------------------------------------- |
| flags                           | `0x10051` (supported non-generic struct/singleton shape) |
| parent descriptor               | `0x103d7b1ac`                                            |
| name bytes                      | `0x103788b96`                                            |
| declared accessor               | `0x1012b05e8` (agrees)                                   |
| field descriptor                | `0x103eb510c`                                            |
| field count                     | **21**                                                   |
| field-offset-vector word offset | **2**                                                    |
| singleton cache                 | `0x104627168` (agrees; captured zero/uninitialized)      |
| incomplete metadata             | `0x104627198`                                            |
| completion callback             | `0x1012b7014`                                            |

The November 20 pass now observes name `State`, parent `BoostsEditor`, the
21-record field descriptor and every stored name. For this matched shape,
field index for metadata key `k` is `(k - 8*2)/4`, subject to alignment/range
checks; the key suffix is hexadecimal. F24 is index 5 `interstitialType`;
F60 is index 20 `hasDismissedJSWarningBanner`. F50/F54/F58 identify `boostData`,
`changeStack` and `boostDataBeforeInteractiveUpdates`. See the exact binding
JSON above. Next resolve mangled field types, dependency implementations and
actual write/readback primitives. Metadata-vector indices do not prove runtime
instance offsets or durable storage.

Preferences lead: initialize reads raw key `0x32`; dismissJSWarningBanner
writes the corresponding flag and invokes writer `(1,0x32)`; completeInterstitial
uses writer `(1,0x31)`. This is not yet proof of UserDefaults or disk I/O.
Public metadata-helper instructions derive typeref reads at
`0x103bd6880`/12 bytes and `0x103bd688e`/14 bytes; both are now captured in
phase 5. Generic dependency getter `0x1006fa470` and publisher wrapper
`0x100596e80` are missing-function admission observations, not analyzed bodies.

### 2. Continue mutation/effect-to-storage tracing

`0x1012abe5c` applies update-like values to state fields, constructs deferred
work and combines effects. Do not call these full persisted Boost objects
without the type binding.

- Async descriptor `0x103788e38` → code `0x1012bab24` → worker `0x1012ac974`.
- Worker filters changes, invokes an async dependency via typeref
  `0x103788d18`, and continues at `0x1012acc18` (phase 7 captured).
- Conditional callback `0x1012baef4` → `0x1012acc70`: optional identifier must
  be nonnil; it obtains another dependency via typeref `0x1037887e8`, builds a
  discriminator-bearing value with `0x1012bb304`, then invokes the closure.
- `0x1012a9b80`, `0x1012a93b0`, `0x1012acd58` were also captured. Consult
  actual records/case report rather than re-querying them blindly.

Resolve client types/default implementations and actual write/readback
primitives. Effect construction alone does not establish execution or durable
storage. Injection and lifetime uncertainty must remain explicit.

### 3. Reopen once with prepared broader seeds and query the missing workers

Current preparation files, all immutable/additive:

- `broader-state-restore-seeds-2044.tsv`: old 2038 plus six observed missing
  workers: tab `0x10014fa64`, sidebar `0x10043a2fc`, Restore class targets
  `0x100305344`, `0x100305b70`, `0x100305ef0`, witness `0x100306724`.
- `broader-direct-callee-seeds-2062.tsv`: adds 18 immediate B/BL targets from
  six checked-source/LC-bounded bodies. No recursive or indirect guessing.
- `prepare-broader-direct-callees.py` and receipts reproduce this source
  preparation. It is a caller-asserted seed overlay; public follow-ups must
  still corroborate roles.
- `broader-state-restore-reopen.steps.json`: twelve prepared instruction/pseudo
  requests, validated against the actual v9 catalog.

**2062 includes `0x1006fa470` but not `0x100596e80`.** The previous worker hit
quota before creating the requested 2063 overlay. Add the latter only after
checking its exact LC start/bounds; preserve the old seed files. Include its
instruction/pseudo pair and the getter pair in the next batch.

Use the **compact-evidence frozen runtime** and a new output directory/plan.
Reuse the existing method-driver pattern, actual named tool schemas and
AJV2020/canonical Evidence checks. Plans for older runs contain absolute paths;
update outputs/continuation paths before executing. Set bounded one-second Arc
autoanalysis, 330-second startup allowance and 390-second call timeout as in
the existing plans. Explicitly export before closing and perform a second
idempotent close if appropriate; retain any first-close failure honestly.

The broader fixed-build findings so far are only entry-point/static handoffs:
`BrowserWindow.nextSpace:` constructs raw tag `0x18`; navigation reload uses
`0x30`; both reach generic send `0x1008492c0`. Imported receiver-offset words
are 16, agreeing with declared viewStore fields; no live object inspected.
Tab/sidebar workers remain untraced.

Restore class descriptor `0x103d3916c`, from metadata `0x1045a1d80`, is publicly
corroborated; conformance is `RestoreSidebarDataFlow:RestoreDataFlow`.
Seven class implementation words are zero: **do not invent seven async code
targets or call this a capability defect**. Three static witness entries point
to shared stub `0x103640168`; its bytes/identity probe are already in phase 5.
Read the actual result before interpreting it.

### 4. Complete reporting and publish supporting material

The prior native fixes are pushed in `70d5dd7d1`; supporting material is now
saved/pushed in `d62dd2f4f` and its recovery tag. Keep the current retention
implementation and its field-test report together when publishing. Preserve
failures, source hashes, profile limits and current schema/coverage distinctions.
Do not stage still mutable session journals or reformat captures.

Sidebar/tabs/spaces/navigation, durable storage, account/sync, history/downloads,
general networking and security are not all answered end to end. Keep the
feature checklist honest. A package inventory, successful decompilation or
passing regression is not completion of an app feature.

## Copyable continuation instruction

> Read `ARC_HANDOFF.md`, repository instructions and the REA+ skill. Continue
> the offline Arc investigation from the latest witness-data repair, callback/local-store checkpoint
> and source-bound 2,463-entry profile. The two-write JS activation route is now
> traced; exact local-store path/policies, preview method and wider browser
> features remain open. Item 63 needs proved input-type provenance and owned
> controls before production recovery changes. All sessions are closed and the
> new witness-data runtime is frozen; Ghidra recovery remains unchanged. Preserve original evidence, fix confirmed
> tool bugs, update OPEN_TASKS/dossier and push mature work to the existing WIP
> repo. Never launch Arc, shipped scripts or application service requests.
