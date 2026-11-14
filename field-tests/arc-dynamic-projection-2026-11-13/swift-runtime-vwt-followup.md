# Installed Swift runtime: conditional VWT preservation

Supplemental offline follow-up completed 2026-11-14. `copy-witness-followup.json` is now present and authenticates its promised Arc ranges, mapped instruction words, descriptor arithmetic, owned-ASM anchors and baseline hashes. Neither that earlier report nor the indexed design/probe baseline was changed for this runtime follow-up.

No provider, compiler/build, network, Arc/library execution or Git operation was used. LLDB only decoded copied byte buffers in an empty architecture-only target; `SBProcess.IsValid()` was false before and after decoding.

## Finding and limit

For the **identified installed runtime implementation**, Arc's observed callback arguments and static payload layout flags imply preservation of the incoming metadata[-8] VWT pointer and its initializeWithCopy slot at +16, conditional on valid metadata/authentication and normal return. Completion is not generally read-only: this initializer writes other VWT slots and layout fields, and other argument paths can clone the table or replace copy functions.

This is a conditional implementation proof. It does not bind Arc to this installed runtime image, prove that its singleton accessor passes the recorded incomplete metadata instance into completion, or close the copy witness's transitive nonescape/effect obligations. Arc's actual runtime initializeWithCopy target remains unproved until those connections are established.

## Availability and bounded extraction

No physical `libswiftCore.dylib`, `Metadata.h` or `Enum.cpp` runtime source was found in the checked installed Xcode/CLT Swift library/include locations. This is a bounded negative search, not a claim about every local directory.

The OS dyld cache does contain `/usr/lib/swift/libswiftCore.dylib`, arm64e UUID `7669D858-D332-36C7-9C6C-4564FFBEA8D2`. `dyld_info` names `_swift_initEnumMetadataMultiPayload` at image offset `0x4798`. The cached Mach-O header, LC_UUID, LC_ID_DYLIB and load commands independently match that identity at VM base `0x193bb0000`.

Only cache headers/mapping records, the 5736-byte Mach-O load-command table, its 28160-byte LC_FUNCTION_STARTS table and these three exact functions were read. No whole cache/image/text section was extracted:

| Role | Exact LC_FUNCTION_STARTS range | Bytes | SHA-256 |
| --- | --- | --- | --- |
| `swift_initEnumMetadataMultiPayload` | `[0x193bb4798,0x193bb4d04)` | 1388 | `cc2e4d9c122724080bcd6c758efb7ccc5d91458ba86ec3cff96ed0169a80c9f2` |
| Helper returning/cloning a VWT | `[0x193c15738,0x193c15aa8)` | 880 | `cce1887ced6eabda56b508b7b21eac539157b28ab79e506c20d6927b96399d75` |
| Common witness installer | `[0x193c2a134,0x193c2a524)` | 1008 | `e933e9c9b9466d0b23346393966e9d4ce4c7b055e7fe23de4119472c325d01a2` |

The code ranges map to `dyld_shared_cache_arm64e.01`; the function-starts table maps to `.04.dyldlinkedit`. Exact mappings, offsets, hashes, code bytes and complete instruction lists are in `swift-runtime-vwt-followup.json`. The role descriptions for the two nonexported helpers are derived from their instructions, not recovered source names.

## Incoming metadata[-8] is preserved for callback flag 0x100

The initializer's only calls are to the two helpers above. At `0x193bb4c34` it calls the first helper with X0 still the input metadata and X1 the input flags. For Arc the callback supplies W2=3, which follows the scalar three-layout path; that path does not overwrite X1 before this call. Arc's callback sets W1=0x100.

The helper loads/authenticates metadata[-8] into X20, then tests flag bit 8:

```asm
0x193c1574c  mov   x19, x0
0x193c15750  ldr   x16, [x19, #-8]!
...          authenticate x16; normal-return path only
0x193c15778  mov   x20, x16
0x193c1577c  tbnz  w1, #8, 0x193c15a88
...
0x193c15a88  mov   x0, x20
0x193c15a8c  b     0x193c15a98
...          restore own saved registers; return
```

With flag 0x100 this path returns the existing VWT and does not allocate, clone, replace metadata[-8], or call another function. The alternative bit-8-clear path allocates/copies a table and can store a replacement pointer into metadata[-8], so preservation cannot be generalized to arbitrary initializer flags.

Before that helper call, the initializer may write the payload-size word in metadata. It reads the high byte of descriptor word +20 as the word index. Arc's word is 0x02000003, so the destination is metadata+16, not metadata[-8]. This depends on the matched descriptor/backpointer identity. Authentication failure/BRK paths are not normal-return preservation paths.

## The initializeWithCopy slot is preserved for the known payload flags

`copy-witness-followup.json` authenticates Arc's first two static payload layout records at `0x103788c68` and `0x103788c80`. Each has flags **0x02230007**, including bit 16. Their sizes/strides are 33/40 and 156/160. The third layout is runtime-derived, but cannot undo the following fold.

For the three-layout path the initializer starts W14=1, then ANDs it with `((payload_flags & 0x10000) == 0)` for each payload (`0x193bb4a2c..0x193bb4a34`). Either known static flag forces W14 to zero regardless of the third layout. At `0x193bb4a58..0x193bb4a60`, that result sets W22=0x10000. Final flags OR W22 into the computed layout flags and store them at the stack layout record's +16 (`0x193bb4c78..0x193bb4c8c`). No later operation clears bit 16 before the installer call.

The common installer receives this layout record in X0 and the returned VWT in X1. Its complete bit-16-set path is:

```asm
0x193c2a134  ldr   w8, [x0, #16]
0x193c2a138  tbnz  w8, #16, 0x193c2a1b0
...
0x193c2a1b0  tbnz  w8, #20, 0x193c2a1d0
...          if bit20 clear: sign a fixed function pointer
0x193c2a1cc  str   x16, [x1, #32]
0x193c2a1d0  ret
```

It either returns directly or changes only VWT+32. It makes no calls on this path and does not store to VWT+16. Its bit-16-clear paths do contain stores to +16, so the static payload flags are a necessary proof fact, not incidental metadata.

After this helper returns, the initializer itself writes signed function pointers to VWT+48 and +56 and layout data to +64..+87. None overlaps +16. Therefore the identified implementation preserves the incoming initializeWithCopy slot for this callback/layout shape while replacing other slots. If its incoming VWT is the recorded `0x104627200`, its +16 candidate remains `0x1012b795c` after this initializer returns normally.

## Fresh public corroboration of Arc facts

The root investigation supplied a fresh successful public Ghidra run under `../arc-cleanup-history-2026-11-13/arc-retest-2026-11-14/`. This offline lane did not start that provider. Its canonical records bind the same Arc SHA-256 and agree with the prior supplemental range/slot observations:

| Canonical record | Evidence ID | Corroboration |
| --- | --- | --- |
| `outer-copy-witness` | `ev_1ed019e240e7b9baeb818304c50a36ed34a1fba936a55af9c72ca90619484a94` | Complete 1016-byte witness at `0x1012b795c` |
| `outer-completion-callback` | `ev_f6500148a0d447c15cf50dbafc6b3f1128f7408ed48f7dd81114dc01b049158c` | Complete 120-byte callback and exact initializer import |
| `view-value-retain-helper` | `ev_2d69de371a051caea4d8e0c31b09cf4b6adf4b75facb225a06a30db03e6a34ef` | Complete 272-byte by-value helper, exact objc/bridge retain imports |
| `internal-action-accessor` | `ev_b4370aea4643657c95e44522aadec1722265ca781c885a75bcea47742d04eea8` | Exact 20-byte cached accessor |
| `delegate-value-retain-helper` | `ev_0fef7626f7082d3c57691ec4638a08f9a04589cc62fd7f062f00a2473cf5d20b` | Exact 68-byte value helper |
| `outer-preinitialization-vwt` | `ev_598818d738bbdae7ccd5bfcabe1274b1f0d086520e64e9d7781e5b37184a380e` | Same preinitialization +16 target and zero size/stride |
| `outer-descriptor` | `ev_1ea45fc1d380f7e370fef0b584ea5548edc4e6110fcc34c39f30997eb0b430f9` | Same singleton relative fields |

Two additional records close the previously unexamined internal tail targets:

- `view-retain-callee-one`, `ev_7c71fa9652359b600d1fd93317c69b887711cd40cd0f2dc1cfc52799cf7ed2b2`: `[0x10002efe0,0x10002eff8)`, 24 bytes. It inspects the low byte of W2, then either returns or moves X1 to X0 and tail-branches to exact `_swift_bridgeObjectRetain`.
- `view-retain-callee-two`, `ev_d27c61b4cb0aa6a6c239f44fac0e4ec8eaa9e2543bc8f38b34bcbf541336664d`: `[0x1011659bc,0x1011659e8)`, 44 bytes. It inspects the copied by-value tag byte in its incoming argument area, then returns or selects a value argument for the same exact bridge-retain tail branch.

Neither small helper has a store or an indirect call. Their complete public ranges and instruction-address coverage match LC_FUNCTION_STARTS in the authenticated Arc input. The outer witness's tag-1 path forwards copied payload values rather than its outer source/destination addresses; the 272-byte helper's direct stores stay in its private/incoming argument area. This removes two internal unknown-code boundaries, while retaining the actual reference-count/heap effects of `_objc_retain` and `_swift_bridgeObjectRetain`. It is not a purity or memcpy claim. A private-frame nonescape conclusion still needs the valid ownership/no-frame-capability assumptions for those value arguments and the relevant runtime import contracts.

## Still open

- Arc's exact dependency/runtime implementation binding is unknown. The current OS image is arm64e with pointer authentication; the Arc executable is arm64. No universal cross-version Swift implementation claim is made.
- The singleton machinery's choice/identity of the metadata instance supplied to completion was not analyzed here. Preserving an incoming pointer does not prove which instance arrived.
- The newly corroborated internal tail helpers are closed, but their runtime retain operations and the valid ownership/no-frame-capability assumptions still need to be composed into an explicit case-restricted nonescape rule. Other outer-copy branches have additional indirect witnesses.
- Memory races, invalid metadata, authentication failures and faults are outside the normal-return conditional proof.

The receipt retains all decisive instruction anchors and proof conditions, plus abstract negative controls: clearing callback flag bit 8 reaches a replacement-pointer path, and clearing bit 16 in every payload layout can reach copy-slot replacement paths. Those are static control-flow counterexamples to an unconditional preservation rule, not executed runtime tests. Item 55/Arc recovery remains open.
