# Ghidra provider semantics

REA+ imports one target into an ephemeral Ghidra database. Linux/macOS support
read-only analysis and atomic function-name/entry-comment edits; Windows P0 is
read-only. Optional owned checkpoints preserve analysis metadata across sessions.
GUI controls are unavailable. Executable bytes remain unchanged.

## File-backed native decompilation

`decompile_all` exports analyzed procedures to individual pseudocode files.
Use `rea decompile-all ./program --output ./decompiled --limit 20 --provider
ghidra --json`, then continue with the same output and `--resume`. MCP requires
an absolute `output_directory`. Its parent must exist; a fresh export refuses
existing directories. `name` is a case-sensitive literal label filter;
`address_start`/`address_end` are inclusive entry bounds in one address space.
The limit counts attempts after verified files and recorded external functions
are skipped. Never-attempted functions precede retries.

The compact manifest includes target/profile identity, per-call counts,
inventory limitations and the index digest. `decompile-index.json` lists latest
function outcomes, caveats and source locations without pseudocode. Each written
record supplies its relative file path, SHA-256 and byte length. Immutable
attempt JSON files under `records/` retain earlier failures. Files contain exact
UTF-8 provider text and use address-derived SHA-256 filenames. Inventory-declared
external functions produce no file. A null body stays unavailable with no
inferred cause. `batch_decompile` remains the explicit ordered inline batch tool.

Resume requires the same known target SHA-256, provider and committed profile.
It hashes stored bodies and refuses changed/missing files. Unrecorded files stay
conflicts. Known session metadata mutations block export until the binary is reopened.
External database changes that leave the profile unchanged cannot be detected;
start a new export after such edits.
Cancellation/resource failures preserve committed output and report a partial
manifest. A crash can leave an orphan body or stale lock; neither is automatically
adopted or reclaimed. Failed cleanup remains owned for a later session close.
Directory identities are checked, but portable Node APIs cannot eliminate
syscall-boundary pathname races.

Only address-based layout is supported. No debug compilation-unit paths, body
ranges, original source, complete code discovery or independent-context retries
are inferred. Export reads do not add new pseudocode bodies to the session
ledger/snapshot; existing matching immutable observations may be reused. The
export workflow itself is never replayed from a snapshot.

## Inspect a saved project

On Linux/macOS, set `REA_GHIDRA_PROJECT_PATH` to an absolute expanded `.gpr`
marker and optionally `REA_GHIDRA_PROGRAM_NAME` to one exact Program in the
project root. The default Program name is the supplied target's basename.
Continue to supply the original executable to CLI/MCP; the bridge verifies the
saved Program's executable SHA-256 against that target.

REA+ hashes only the selected `.gpr`/`.rep` pair and the packaged bridge sources
into the analysis profile. It copies the pair into its private runtime, checks
the copy against that commitment, then uses `-process`, `-noanalysis` and
`-readOnly`. It never passes the original project to Ghidra. Symlinks,
non-regular entries, overlapping runtime placement and changed copies are
refused. A missing or changed project requires a corrected selection and a
fresh target binding; no fresh-import fallback occurs.

The original analysis completeness and import settings are unknown: handshake
`analysis_complete` / `analysis_timed_out` are explicitly null in this mode.
Saved seed reports remain historical metadata. Fresh seeds, extensions,
language/compiler overrides and analysis-timeout settings cannot be combined
with selected projects. Local bridge preparation runs on the private copy;
analyst annotation/name edits are unavailable. The supported target scope is
the existing Linux/macOS ELF/PE/thin Mach-O admission profile.

Restore `.grez` archives or import `.gzf` packed Programs into an expanded
project before selecting it. Selected-project inspection never updates saved
Programs; owned checkpoints use the separate workflow below.

Use [installation](installation.md#ghidra) for supported hosts, prerequisites,
configuration, startup deadlines, resource controls, and cleanup recovery.
[Windows P0](windows-ghidra-p0.md) has its own admission and lifecycle boundary;
[NativeAOT observations](ghidra-nativeaot.md) include a built-in read-only PE
snapshot parser and a separate optional annotation extension. Check the
[release boundary](installation.md#released-package-and-main) when using npm.

See [import language and analysis seeds](installation.md#ghidra-import-language-and-analysis-seeds)
to override the header-detected language or seed analysis.

Provider selection and profile identity follow
[MCP contracts](mcp-contracts.md#identity-and-discovery). One deep
provider stays bound to the target; runtime failure never selects another
provider automatically. The contracts below describe Ghidra observations,
not equivalence with another engine's pseudocode or analysis database.

## Owned checkpoints

Set `REA_GHIDRA_CHECKPOINT_DIR=/absolute/private/directory` to save the initial
Program and each acknowledged annotation/name edit. This opt-in mode supports
Linux/macOS ELF, PE and thin Mach-O, including explicit seeds, import language
and bounded auto-analysis. Existing-project mode, Windows, special loaders and
optional analysis extensions are currently refused in checkpoint mode.

The directory is private to the current user (mode 0700). Each target SHA-256,
complete analysis profile (including seed content), Ghidra version and packaged
bridge-source digest selects a separate checkpoint. A restored profile also
commits the exact packed Program SHA-256 and original analysis-completion flag.
Restoration imports a verified private copy with `-noanalysis`; it does not
reapply seed names or turn a timed-out analysis into a complete one. Seed
reports describe the original analysis that produced the saved Program.

Only one publisher can own a checkpoint at once. It exports into its private
runtime, syncs an immutable blob and manifest, then replaces `current.json`
atomically. Annotation `effects.persists_after_close` becomes true only after
publication succeeds. A failed export/publication is an error: an in-memory
edit may have committed while persistence remains unconfirmed. Cached reads
are retired at mutation admission; subsequent provider reads refuse the
unconfirmed-save state until close and reopen. Close retries
owned descriptor, staging and lease cleanup. The original executable and
caller-selected saved projects are never written.

After cancellation or another retirement, reopen the target to resolve the
saved generation. Reusing an older profile refuses changed state rather than
silently restoring it. Corrupt or stale checkpoints never fall back to a fresh
import. A crashed owner can leave `publisher.lock`; automatic stale-lock
reclamation is deliberately unsupported. Preserve the directory and verify
that its publisher has stopped before manually removing that lock, or select
a new checkpoint directory. Checkpoints consume disk space and are not Git
artifacts or portable evidence bundles.

## Disk-capacity failures

Explicit local `ENOSPC` failures and supported Java `No space left on device`
exception lines during startup produce `resource_constraint` with
`details.resource: "disk"` and `retryable: false`. The error retains the provider
operation, target/profile/runtime coordinates, bounded token-redacted diagnostics
and their truncation markers. `resource_observation` identifies the positive
signal and its source; character offsets are UTF-16 positions in the retained
diagnostic text.
No free-space amount or quota is inferred. Unrelated text, ambiguous I/O failures
and stale startup output during a remote request do not establish disk exhaustion.
Cancellation and incomplete cleanup retain their own semantics.

Restore capacity on the volume containing the reported runtime/project before
reopening the target. Explicitly lowering `REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS`
may reduce auto-analysis demand; it does not reduce import storage requirements
or guarantee a smaller project. Unchanged capacity and analysis policy can
reproduce the failure. Composed workflows retain their public operation and the
provider's internal operation separately.

## Admitted inventory semantics

| Concern          | Ghidra contract                                                                                                                                                                                                                                                                                                                                                 |
| ---------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Program identity | One `analyzeHeadless` import produces exactly one Program; `list_documents` therefore returns exactly one name.                                                                                                                                                                                                                                                 |
| Addresses        | Default memory uses lowercase `0x` hexadecimal. Non-default and external spaces use `<percent-encoded-space>:0x<hex>` and remain round-trippable. The handshake commits image base and default address-space name.                                                                                                                                              |
| Symbols          | `list_names` includes address-bearing memory and external symbols, including dynamic symbols, while excluding variable and no-address namespace records. Each item reports primary, dynamic, external, symbol type, and source facts.                                                                                                                           |
| Procedures       | Both non-external and external functions are listed. A local thunk remains distinct from its resolved target; exact and qualified name lookup fails on ambiguity rather than guessing.                                                                                                                                                                          |
| Strings          | Only Ghidra-defined string `Data` is observed. Items report charset, byte length, and whether a required null terminator is missing. The API cannot distinguish a present terminator from fixed/Pascal layouts when no terminator is missing, so that state is named `present_or_not_required`.                                                                 |
| Memory           | Memory-block end addresses are exclusive. Read/write/execute, initialization, overlay, address space, and image base are direct Ghidra observations.                                                                                                                                                                                                            |
| Inventory        | Procedure, symbol, and string listings plus searches return the complete matching collection in one response; callers do not provide offsets or result-count limits.                                                                                                                                                                                            |
| Search           | Literal and Java-regex searches return every match in the immutable provider-defined inventory; string search does not cover every text sequence in artifact bytes. Search waits for a reply or caller cancellation; there are no caller-supplied offsets or result-count limits.                                                                               |
| Analysis state   | The default profile serves completed auto-analysis. Explicit `REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS` admits a stable partial Program after bounded auto-analysis, with exact policy/budget handshake and actual state in provider/composed Evidence. Established operations wait for their reply or caller cancellation; there is no fixed response-size ceiling. |

String-search completeness applies only to Ghidra-defined string `Data`. Packed
or undefined literals, including Rust strings, may be absent; an empty result
does not prove text is absent. Both list and search Evidence carry this
limitation. When an address is known, use `read_bytes` and `xrefs` to inspect
bytes and references.

## Admitted function-analysis semantics

| Concern                 | Ghidra contract                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| ----------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Decompiler lifetime     | One persistent `DecompInterface` is opened for the imported Program and disposed during bridge shutdown. Native decompilation has no fixed per-function deadline. External functions or functions without bodies return `null`; cancellation and native failure remain distinct.                                                                                                                                                                                                                                                                                                                                           |
| Serialization           | A FIFO sends one Program request at a time. Caller cancellation removes queued work promptly and is passed to active socket waits. This is an adapter safety commitment, not a claim that every Ghidra API is thread-safe.                                                                                                                                                                                                                                                                                                                                                                                                 |
| Function identity       | Every function result carries the entry address and Ghidra FunctionManager classification for external, thunk, and resolved thunk target. These are observations, not proof that unresolved targetless calls have been recovered.                                                                                                                                                                                                                                                                                                                                                                                          |
| Assembly and pseudocode | Assembly is complete Ghidra Listing text; pseudocode is Ghidra decompiler output. Neither is original source, and cross-provider comparison never treats Hopper and Ghidra text as equal or unequal semantic facts.                                                                                                                                                                                                                                                                                                                                                                                                        |
| Instruction fast path   | `read_function_instructions` returns every raw Listing instruction for the requested function without invoking the decompiler or whole-program name/string inventories.                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| Calls and references    | Callers/callees contain only resolved functions. Reference edges preserve exact ReferenceManager type and call/jump/data/read/write/indirect/computed/conditional/terminal/external facts. Targetless computed flow remains unknown. Synthetic entry-point references without actionable memory sources are omitted explicitly.                                                                                                                                                                                                                                                                                            |
| CFG                     | Dossiers use `BasicBlockModel` and retain only non-call successors inside the function body. CFG topology is address-normalized for comparison; provider-specific block construction remains a declared difference.                                                                                                                                                                                                                                                                                                                                                                                                        |
| P-code value flow       | Function dossiers include up to 3,000 high-p-code operations, at most 64 inputs per operation, and 12,000 def-use edges. Results identify memory reads/writes, branches, and calls by p-code opcode, and mark decompiler-dead operations. Large results report truncation, an omitted-operation lower bound, and known omitted-input/edge counts. The dossier is an intra-function graph; `trace_native_values` composes derived parameter/argument and return/output dependencies across resolved calls. It does not resolve memory aliasing, call side effects, runtime behavior, persistent state, or business meaning. |
| Result extent           | Function instruction scans and native API boundary observations remain complete. P-code flow is the explicit bounded exception; its count fields distinguish exact retained counts from lower-bound or known-omitted counts. Caller cancellation and provider failures remain distinct.                                                                                                                                                                                                                                                                                                                                    |

Function extents and instruction completeness refer to Ghidra's analyzed body.
An inferred no-return call can terminate that body before subsequent bytes.
Pseudocode, assembly, procedure info, instruction windows, and dossiers report
observed terminal call sites in Evidence limitations, including resolved callee
names, addresses, and FunctionManager flags when available. Instruction windows
and dossiers also retain these warnings in their result limitations. An
unresolved callee or unestablished terminal-flow basis remains explicit. These
observations qualify the analysis; they do not prove that a no-return flag is
incorrect or recover excluded code. Analysis profiles version this observation
contract so older snapshots cannot replay unqualified results.

On non-Windows hosts, the ephemeral import repair clears no-return flags on the
known returning external ABI names `malloc`, `__tls_get_addr`, `memcpy`, `memset`,
`strlen`, and `__errno_location`. This relies on their expected ABI behavior;
external implementations are not inspected. The repair re-disassembles affected
terminal calls and refits their owning functions, preserving independent function
entries. If a recovered caller reveals a decoded return, its propagated no-return
flag and affected callers are repaired in the same pass. Unknown imports and
genuine no-return imports keep their flags. Analysis profiles version this repair
so snapshots produced before it are not reused. Windows P0 does not run it.

### Swift synchronous throwing calls

For supported non-Windows ARM64 little-endian Mach-O Swift Programs, REA+ can
correct the error-register effects of a proved synchronous throwing callee.
Ghidra's Swift convention preserves x21 across calls; synchronous Swift throws
use x21 as an error return. Preserving it can incorrectly remove a subsequent
error guard from pseudocode and high p-code, even when the machine CFG retains it.

The repair requires an original Swift symbol whose expanded outer function type
declares `throws` without `async`. The effect belongs to the callee and remains
valid when callers copy the error register or run cleanup before checking it. It
clones the existing convention inside the ephemeral Program and changes only
x21 from preserved to unknown after the proved callee. Parameters, return types,
storage rules and executable bytes remain unchanged. Explicit caller prototype
overrides and user signatures are preserved. The native API result records
`call_model_adjustments`, including the original symbol, demangled signature,
output digest, call address and exact convention/effect change.

The proof reads the native declaration's own signature, excluding function types
inside generic constraints, callbacks and return values. Only admitted native
function/initializer and dispatch/static wrapper layouts qualify; Objective-C or
other ABI-changing thunks remain unsupported rather than inheriting the original
declaration's Swift error-return convention.

Expanded demangling uses the installed `/usr/bin/swift` or caller-selected
`GHIDRA_SWIFT_DEMANGLER`, without installing a toolchain. Symbol, output, cache
and subprocess deadline budgets bound this optional analysis; unavailable or
unproved guarded calls retain `control_flow_uncertainties` and limitations.
`trace_native_values` carries these uncertainties forward independently of
truncation. An empty retained operation-omission count does not prove semantic
correctness. This profile is verified on macOS arm64; other hosts remain
unverified. Historical dossiers can omit the new optional facets.

### Swift enum dispatch recovery

On non-Windows hosts, AArch64 little-endian Mach-O imports also run a
source-immutable Swift enum switch pass before serving queries. It supports
signed 32-bit `LDRSW` relative tables whose index comes unchanged from the exact
`libswiftCore.dylib` import `swift_getEnumCaseMultiPayload`. The bound comes from
the matching non-generic enum descriptor and reflection field count. A verified
cached singleton accessor joins that descriptor to the call's metadata argument;
its cache address must match the descriptor's initialization-cache reference.
Enum names or the distance to neighboring code cannot establish the bound.
Descriptors may be indexed or identified by an actual singleton-runtime call
inside the complete supported `-Onone` accessor shape. The latter requires the
descriptor's accessor back-pointer to match; it supports noncopyable outer enums
that the compiler omits from the type index. Reflection field kinds 2 and 3 are
admitted only with matching enum counts and the supported twelve-byte records.
The additional accessor-discovery walk is bounded to 100,000 reference probes.

Reaching definitions must agree on every incoming path. Modified indices,
ambiguous metadata, escaped frame storage, unsupported accessor layouts, invalid
destinations and short initialized table extents remain unrecovered. The pass
tracks frame escape along CFG predecessors regardless of physical block order.
It also requires an explicit 32-bit zero-extending write before using a returned
32-bit tag as a 64-bit index; wide copies alone do not prove the upper bits.
Unknown-call frame escape and post-call spill invalidation include X0–X8,
Swift self/context in X20 and Swift async context in X22. A callee-saved
register can still carry an ABI input; X19 is not classified as an argument
merely because it holds a frame address. The recovery profile is
`abi-signed-word-cfg-v10`. This register check does not establish a general
typed invocation, constructor ownership or arbitrary callee memory purity.
The pass
uses budgets of 4,096 cases, 100,000 CFG/reaching-definition work units per candidate
function and 256 nested queries; these are recovery budgets, not Swift format
limits. It assumes the normal AArch64 ABI and private, non-escaped frame storage.
The original runtime-tag route retains that private-frame assumption for
entry-relative spills when a dynamic SP value is unknown; it rejects known
stack transitions that retire a queried slot. This is not the exact all-path
stack-liveness proof required by the fixed-payload route below.
Unsupported SP-writing loads kill spill facts even when their loaded result
is discarded; a known writeback pop cannot use the dynamic-allocation fallback.
The signed-word suffix also permits one simple non-writeback 64-bit integer
load between destination addition and `BR`, when it leaves the branch register
unchanged and both intervening CFG edges have a single predecessor. Loads that
overwrite the destination, write back their base, or introduce another incoming
edge remain unsupported. These suffix checks apply to both supported tag routes.
Known incoming flows from outside the owner also reject each instruction in
the suffix, including the branch itself; owned predecessor counts alone cannot
establish the reaching definitions on those paths.

A bounded fixed-payload route also accepts a dominating runtime outer-enum tag
whose CFG selects one reflected payload type. A direct symbolic reflection
reference must identify a non-generic fixed enum; its field count, static metadata
back-pointer, value-witness size and complete declared tag getter must agree.
The unchanged incoming first argument must reach that getter through one exact
whole-value `libSystem` `memcpy` into a statically bounded private frame interval
on every path. Unknown calls, escaping frame addresses, overlapping later writes,
ambiguous outer cases, unsupported reflection forms and dynamic stack intervals
reject recovery. Shared or equal getter code never selects a type or case count.
The complete reachable prefix rejects unmodeled memory effects (including
release/atomic/non-temporal writes), writes outside the live private frame and
unresolved control transfers. Getter ancestors require exact, non-increasing
SP; deallocation followed by reallocation cannot revive earlier spill facts.
Load writeback cannot substitute a loaded value for its updated base register.
The fixed child value is limited to 4,096 bytes as a recovery budget. Only the
complete four-instruction constant accessor or its five-instruction temporary-
register/header-offset variant is admitted; its returned metadata must point
back to the reflected child descriptor. Indirect payload fields and unknown
field flags are rejected before inline copying is considered.
The separate `swift-dynamic-typed-snapshot-v1` lane supports a straight-line
entry-to-runtime-tag prefix followed by checked selected-case SIMD projection
paths. This is conditional on a recursively valid active outer value at that
exact tag call, stable ABI metadata and imported-call/GOT bindings, normal
nonwrapping monotonic stack allocation, live/disjoint regions, and a stable
post-tag window without asynchronous interference. The tag reader does not
validate or initialize the payload. Earlier unknown calls, copies and escapes
are allowed; their memory history is discarded. This proves neither pre-tag
nonescape nor copy/retention/ownership correctness or later lifetime semantics.

Its independent forward domain preserves SP on normal-return calls, kills
volatile and Swift-error X21 facts, and retains only register identities. Earlier
unsigned SUB allocations supply monotonic upper bounds; the final current-SP
allocation must be exactly align16(N), where N is VWT+64 of the identical proved
outer metadata value passed to the tag reader. SP increases, stale restores and
unknown SP definitions reject the lane. The descriptor's selected direct child
and its static metadata/VWT/getter establish type and size. Every child byte
must have the corresponding source origin through supported Q LDR/LDUR/LDP and
STR/STUR/STP operations. Matching overlapping tails are allowed; source writes,
unknown aliases, calls or SP changes after the tag, cycles, foreign entries and
bypasses reject recovery. A separate straight-line getter-to-dispatch check
rejects calls, SP changes, foreign/bypass entries and unmodeled stores so that
escaped aliases cannot invalidate a later tag spill. The snapshot proof has its own per-table assumptions;
it does not relax the fixed-copy proof above. Other copy-witness paths remain
unsupported.

The versioned `trusted-darwin-arm64-chkstk-v1` effect policy additionally admits
the literal imported Mach-O symbol `___chkstk_darwin` from the system install
names `/usr/lib/libSystem.B.dylib` or `/usr/lib/system/libcompiler_rt.dylib`.
Direct calls require that exact external or a verified three-instruction import
stub. The indirect lane requires an adjacent `ADRP X16; LDR X16; BLR X16` chain
with one incoming path through its load and a unique imported pointer-slot
binding. Local functions, lookalike names, other underscore counts and foreign
libraries receive no special effects. The existing complete private-prefix
proof must exclude unknown calls, visible import-slot writes and foreign flows.
The first profile admits only successfully applied eight-byte Ghidra chained
binds (`0x8888`) with the exact symbol and one retained positive library ordinal.
That ordinal must select the same full system install name in the original
bounded Mach-O load-command order; the loaded pointer and its unique default
data reference must agree with the imported external association. Classic
bindings that discard the ordinal, conflicting same-name library ordinals and
ambiguous or changed pointer targets remain unsupported.

Global same-name ordinal identity is checked in the bounded original Mach-O
chained import table, independently of the number of unrelated loaded rebases.
All entries with the literal raw name must agree on one positive library ordinal.
The original header/load commands must agree with the loaded image and have one
unambiguous original carrier. Formats 1/2/3 with uncompressed symbol names are
supported. The per-slot applied relocation, loaded pointer/reference and unique
imported external checks still apply. Mixed classic binding or external/section
relocation carriers remain unsupported. Nonzero import-table addends for the
exact probe name are rejected because Ghidra 12.1.4's loaded pointer does not
attest those dyld destinations. Raw names that only normalize to the literal
probe name cannot establish its import identity.

On normal return this narrow summary preserves X2, X8, X12 and SP in addition
to ordinary callee-saved handling. Other volatile registers, including X9,
X10, X16, X17 and X30, and condition flags remain unknown. The probe can read
stack/thread state and fault. Its possible 16-byte scratch write immediately
below the incoming SP is modeled explicitly; it must be disjoint from any
retained spill or copied child interval. An unknown SP rejects this summary,
including when the original scalar-spill route could otherwise use its legacy
dynamic-SP assumption. The summary neither allocates storage nor proves that
allocation completed.

This is an explicit trusted Darwin ABI assumption, supported by inspected
versioned implementations, rather than a byte binding to the OS image a target
will load. Recovery provenance records admitted call/import/slot identities,
the scratch interval and that limitation. It does not establish Arc's runtime
binding or prove typed-copy correctness. The snapshot lane separately permits symbolic-SP
probe preservation under stable import bindings; visible non-stack prefix writes
disable those effects, and all pre-tag scratch memory is discarded.

Verified destinations receive computed-flow references and are disassembled into
the existing function body without stealing independent function entries. The
ephemeral database receives a generated Ghidra switch override before any
observation. Ghidra can call this a “manually overridden” switch in pseudocode;
REA+ identifies it as derived analysis metadata. The native API reports
`rea-swift-enum-signed-word-table` provenance, the descriptor/accessor/call/table
addresses, ABI case tags and optional reflection names. No default is invented
for values outside the valid enum. This recovers control flow, not state
reachability, original source declarations or every Swift calling convention.

The analysis profile commits `swift_enum_switch_recovery:
"abi-signed-word-cfg-v10"` and `darwin_stack_probe_call_summary:
"trusted-darwin-arm64-chkstk-v1"`, plus `swift_dynamic_typed_snapshot:
"swift-dynamic-typed-snapshot-v1"` for supported targets. Earlier snapshots cannot replay
as this recovery. Windows P0 retains its no-database-mutation boundary.

`npm run verify:ghidra` compiles the versioned C oracle into debug and stripped
host-native targets (x86-64/AArch64 ELF on Linux or Mach-O on macOS), plus a native
DWARF 4 type-layout object. It proves the admitted operations, external functions, resolved thunks, exports, stripped-name
behavior, direct and targetless indirect calls, typed references, strings/xrefs,
multi-block CFG, bounded p-code def-use/effect links, semantic enhanced workflows, cancellation, startup deadlines,
serialized concurrency, malformed-target rejection, profile identity, and
process/project cleanup against real Ghidra 12.1.4. Unit fixtures separately
cover startup deadlines, process exit, queued cancellation, and malformed wire
output.

`npm run verify:ghidra:cross-format` adds AArch64 ELF, x86-64 PE, and x86-64
Mach-O target coverage. It requires `clang`, LLD, and `lld-link`; set
`REA_CLANG`, `REA_LLD`, or `REA_LLD_LINK` to select them. The verifier checks
these tools before compilation. Keeping this matrix separate lets Linux
host/provider acceptance run with only the host compiler.

`npm run verify:ghidra:windows` checks source-owned native x86-64 PE applications;
`-- --x86` selects x86 and `-- --dll` selects DLLs, and the flags can be combined.
These lanes check all 25 read-only operations, target/snapshot/import SHA-256 linkage,
and project, endpoint, process, and runtime cleanup. The independent native
lane checks DACLs, handle admission, cancellation, and Job Object lifecycle.
`npm run verify:ghidra:windows:package` packs and installs REA+ into an isolated
prefix, then checks ordinary-user CLI/MCP operations against canonical contracts.
It accepts the same architecture and DLL flags and verifies the selected PE role
in the analysis profile.
All lanes require matching native controls; package startup alone establishes
only package compatibility.

## Retained native inventories and batches

`list_names`, `list_procedures`, `list_strings`, `search_procedures` and
`search_strings` accept `detail: "summary"`. Complete inline output remains
the default. A summary retains the complete parent Evidence and returns its
`normalized_result.parent_evidence_id`; use `inspect_analysis_view` with
`view: {kind:"native-inventory", offset:0, limit:64}` to read source-order rows.
Rows retain `source_index`, including distinct aliases at one address. Optional
`fields` projects recorded fields; `value` keeps string/decoding qualifications.
Counts describe the retained provider inventory, not all program objects.

`batch_decompile` keeps explicit selectors and observed canonical procedure
identity separate. Reads run sequentially within the batch. Null pseudocode
returns `status:"unavailable", reason:"no_pseudocode"`; an invalid value is
an error. Each item keeps its own observation's caveats. Cancellation or
cleanup uncertainty stops admission and preserves any completed prefix in
`details.partial_observation` with its request and source identity.

Summary delivery retains the full batch. Select
`view: {kind:"batch-decompile", collection:"items", offset:0, limit:64}`.
Optional `where` filters `indices`, `addresses`, `procedure_addresses` and
`statuses` before pagination; an explicit empty selection matches no items.
Original batch indices keep duplicate selectors distinct. Rows omit bodies
unless `include_pseudocode:true`. Page one successful body with
`{kind:"batch-decompile", collection:"pseudocode", index:0, offset:0, limit:4096}`.
Text pages count UTF-16 code units and never split a surrogate pair.

CLI equivalents are `rea native-inventory <path> --kind procedures`,
`rea search <path> <pattern> --kind procedures`, and
`rea batch-decompile <path> '{"addresses":["symbol","0x1234"]}'`.
For summary add `--detail summary --evidence-output /new/complete.bundle.json`.
The bundle is written before the one-shot process returns its summary.
A new output path is required; existing files are preserved. Use
`rea inspect-analysis-view` with inline Evidence loaded from that bundle to
read later pages without reopening a provider. MCP references expire when
the session is cleared; exported/inline Evidence remains portable.

## Retained native observations and source context

`procedure_address`, `procedure_callees`, `procedure_callers`,
`resolve_containing_procedure` and `get_call_graph` accept `detail: "summary"`.
Complete delivery remains the default. Summary delivery retains the complete
parent before returning up to 64 recorded observations and its Evidence ID.
Use that parent with `inspect_analysis_view` and
`{"kind":"native-observation","offset":64,"limit":64}` to continue.
Retained `xrefs` parents also support these views; its existing tool input stays
unchanged. Address-only rows never acquire reference kinds or runtime meaning.

Array positions retain `source_index`; duplicate addresses stay separate.
Graph pages sort level keys by Unicode code point and preserve row order inside
each level. Their identity is parent + level + source_index. A recorded empty
level has `status:"empty-level"` and `source_index:null`; summary observation
counts include these markers. Failed nodes preserve their typed errors.
Exhaustion describes the retained observations, not exhaustive native discovery.
Existing graph results have no dedicated relationship-coverage field; a view
does not invent one.

Each page carries `source_context.digest` and a source caveat count rather than
repeating the whole profile or limitation inventory. Read the same parent's
`native-context` view with facet `overview`, `analysis-profile` or `limitations`.
Overview identifies its recorded subject, provider, authority, environment and
profile digest. Limitations pages preserve original indices, order and repeats.
An unavailable profile has `items.rows:null`, `coverage.status:"unavailable"`,
`total:null`, no next offset and `exhausted:false`; stop paging it and read its
unknowns. This differs from an examined empty caveat list. Context digests use
the same semantic subject identity as Evidence; selected display-path aliases
remain visible but do not change that commitment. Read source caveats before
interpreting the observations.

The CLI shares these contracts and the same projector:

```sh
rea native-observation /absolute/target '{"operation":"procedure_callees","parameters":{"procedure":"selected_symbol"}}' --provider ghidra --detail summary --evidence-output /absolute/new.bundle.json --json
```

It also accepts a JSON file. `operation` selects one of the six native read
operations above (including `xrefs`); `parameters` uses its named MCP input.
CLI summary requires a new complete Evidence bundle before provider admission.
Use `inspect-analysis-view` with its portable parent after the process exits.
No new MCP tool names or provider operations are needed.

Call-graph traversal stops admitting provider work on cancellation, unsafe
cleanup, resource/configuration failure or startup timeout. A typed failure
preserves completed nodes, pending addresses and available source identity;
ordinary node errors remain recorded and other branches can continue. Workflow
revision 2 separates these interruption semantics from historical graph replay.

## Masked search of analyzed memory

`search_bytes` and CLI `rea search-bytes PATH 'de ad ?? ?? be ef' --provider ghidra`
search initialized byte-addressed memory after loading, including loader fixups.
This differs from `scan_byte_patterns`, which scans original artifact bytes.
A byte match establishes neither a string object nor runtime use.

Patterns contain hexadecimal pairs or whole-byte `??` wildcards. Whitespace is
allowed only between complete pairs, with no leading/trailing whitespace. An
optional equal-length hexadecimal mask selects bits; `a0` with mask `f0`
matches a0 through af. Wildcard bytes remain unconstrained even under an explicit
mask. At least one bit must be constrained. Caller spelling remains in Evidence;
the shared pattern owner sends canonical masked bytes across the private bridge.

Optional start/end addresses are inclusive and select one address space. A
match must fit wholly inside the selection. Without bounds, loaded non-overlay
blocks are eligible; skipped unloaded and loaded-overlay blocks are listed
separately (a block in both categories is listed once as unloaded). Explicitly
bound an overlay or unloaded space to inspect it. Uninitialized blocks are never
searched. Adjacent eligible initialized blocks form one contiguous run, so a
match may cross their boundary; gaps and excluded blocks end the run. Larger
addressable units are explicitly unsupported rather than counted as bytes.

Matches identify their start address, starting block, containing analyzed
procedure when observed, and a unique original-target file offset or null.
An auxiliary FileBytes object's local offset is not an original-target offset.
The existing address_to_file_offset tool uses the same exact-target source
identity rule and explicitly refuses such mappings. A genuine target header
can still have offset zero.
The starting offset does not imply that the complete match is contiguous in the
original file or that loader-adjusted memory equals file bytes.

`limit` selects a result page (default 100), not a work/byte budget. The hard
count bound follows the bridge's signed array index; actual memory, deadline and
transport admission remain separate. Use narrower bounds for a smaller search.
`searched.blocks` and its byte count describe this page, including a lookahead
match used to discover continuation. Page coverage may therefore overlap the
next page. Exclusion arrays describe the selected query's skipped blocks and
can repeat across pages. `complete` means no more matches in eligible memory;
it does not claim that skipped memory or unknown runtime state was examined.

Continue by reusing the same query with `cursor: next_cursor`; the page limit
may change. Cursors bind target, full analysis profile, canonical masked pattern,
bounds, document and the Program generation after bridge preparation. Equivalent
masked spellings can continue the same query. Metadata edits invalidate earlier
cursors. A binding mismatch identifies cursor as the issue, leaves the differing
component unknown and directs a new search or the original unchanged context.
Never describe it as proof that the executable changed. Reopening a different
project/checkpoint generation requires starting over. Original target bytes are
never modified, and the ordinary Ghidra cancellation/cleanup owner remains in
charge of interrupted reads.

CLI options are `--mask`, `--start`, `--end`, `--limit` and `--cursor`; malformed
patterns are refused before opening the target. CLI and MCP share query semantics
and Evidence. This tool is currently Ghidra-only; other providers retain their
existing explicit capability unavailability.

Native disk failures reported by the bridge carry an explicit disk_exhausted
code. REA+ projects that as a disk resource constraint with capacity remediation;
arbitrary remote error text and stale startup logs do not establish exhaustion.
This includes failures while publishing the first owned checkpoint before the
first requested read completes.
