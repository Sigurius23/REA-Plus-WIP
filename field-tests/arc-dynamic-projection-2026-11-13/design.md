# Arc dynamic outer value and SIMD child projection

Status: offline design and owned compiler probes only. No producer code was edited, no Arc code was executed, and no new Arc switch recovery is claimed. The retained frozen-v7 reducer still reports no recovered jump table. This note is supplemental analysis; it does not populate REA+ Evidence fields.

## Observed route and provenance

All Arc records below identify arm64 image SHA-256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

| Fact | Retained Evidence |
| --- | --- |
| Reducer entry `0x1012a571c`; incoming action is X1, saved to X23 at `0x1012a5744`; initial fixed allocation is 0x9e0 bytes after the 0x60-byte save area, with X19 its base | `../arc-persistence-routes-2026-11-08/native/boost-reducer-instructions.evidence.json`, `ev_427c44e10e2a911991608c50c37c420fe140e6b7ca53a0e57dbaf76a2d80041e` |
| Frozen-v7 reducer remains without a jump-table record | `../arc-dispatch-load-2026-11-09/arc-v7-retest/boost-reducer.evidence.json`, `ev_b166ab4002022c3f66aacd74c2d2facb341d2e2bd1de75f01fd31ece6984cb9b` |
| Outer descriptor `0x103d7b260`: 3 payload, 1 empty; case 1 field name `view`, direct symbolic type reference resolves to `0x103d7b2a4` | `../arc-persistence-routes-2026-11-08/outer-type/{outer-enum-descriptor,outer-enum-field-records,outer-case-1-payload-type,inner-view-enum-descriptor}.evidence.json`; descriptor IDs `ev_1e84a9c82c6781a467be14872048320fa616fdcd58b50e2cf346adc9b17f98e4`, `ev_d7805eadf53ee1eda958896770856fdbb7dcab3abc2000d148e93987d4255563` |
| Child descriptor: 11 payload, 17 empty = 28; child VWT size 156, stride 160, getter `0x1012b2860` | `../arc-persistence-routes-2026-11-08/view-vwt/{view-fixed-metadata,view-fixed-value-witnesses}.evidence.json`, `ev_9ac635680f6e1f140893417e59d0955d852aa0e8c05a78a353cfc0cf92cde4a8`, `ev_9c1f2fdb1d52748754bbd5fc16b6653197b77c874ef5820075e29d7fcf327b88` |
| Getter is seven complete instructions and reads only `[0,4)` and `[152,156)` of X0 | `../arc-persistence-routes-2026-11-08/native/nested-action-tag-helper.evidence.json`, `ev_93d4b0e66bb0fcf03eafc5412aae2dbe3b0e84f810055b1719e3fb0f5a13d61b` |

The outer accessor is **cached/shared**, not static fixed metadata. The newly retained exact body at `0x1012b284c` binds X1 to cache `0x104627270`, X2 to outer descriptor `0x103d7b260`, and tail-branches to `0x100026010`. That helper checks the exact cache word, returns it with X1=0 when present, and otherwise calls the exact singleton-metadata import with the descriptor. This matches the existing shared accessor proof shape. The child has static fixed metadata; those identities must remain separate.

The initialized-file outer VWT has zero size/stride before singleton initialization (`ev_0215a74d8f1d0063634747a16e2b8b70367a8e36be178d7152550d49e4d039bd`). Zero is not an outer extent. No fixed outer allocation size should be invented from neighboring records or the child size.

The reducer obtains outer metadata into X27, loads its runtime VWT size N into X8, computes `L = (N+15)&~15` into X12, and makes three dynamic allocations of L. The final one is X25, which becomes SP at `0x1012a5a84`. It then calls the generic copy wrapper with X0=X23, X1=X25, X2=the same outer accessor. The exact outer runtime tag call is at `0x1012a5aa0`, with X0=X25 and X1=X27. Its tag-1 branch reaches the projection at `0x1012a5b14`. All byte loads for the selected child originate from that X25 value. The child getter receives X19+0x440 at `0x1012a5ba8`; the signed-word dispatch is `0x1012a5bc8`, table `0x1012a7e74`.

X25 is overwritten at `0x1012a5b94`, after all source loads. A value identity must bind to reaching definitions; a register-name match across the whole block is unsound.

## Newly closed helper facts

The root investigation collected these through the frozen-v7 public workflow with LC_FUNCTION_STARTS-verified extra procedure seeds. Their exact complete instruction bodies are retained under `native-helper-evidence/`.

| Helper | What its complete body proves | Remaining semantic dependency |
| --- | --- | --- |
| `0x10000828c`, `typed-copy-helper.evidence.json`, `ev_33b5907c2eeb46f39210686e6369178188743a7d4f39bb5123a12e912d12027b` | Saves X1 as destination and X0 as source; sets request X0=0; invokes accessor X2; takes metadata[-8] VWT and slot +16; invokes that witness with X0=destination, X1=source, X2=metadata; returns destination. Its own stores are local prologue saves. | The actual incoming accessor identity must be proved across intervening stack probes. Slot +16 must be interpreted using the Swift initializeWithCopy ABI contract, including destination extent and nonescape. The wrapper does not prove a raw memcpy or transitive witness implementation effects. |
| `0x100005134`, `mangled-metadata-helper.evidence.json`, `ev_c126270179c2011ba75772792afe74c0d6e92c9a35fd52b3f7a24887b1081177` | Reads the X0 cache word. A nonzero even word returns; otherwise decodes signed relative start and signed length from the X1 record, calls exact `_swift_getTypeByMangledNameInContext` with X2=X3=0, and caches X0. | Validate the call-site cache and encoded record are initialized and global. Returned metadata semantics use the exact runtime import contract; an arbitrary similarly shaped function is not a metadata accessor. |
| `0x100026010`, `shared-cached-accessor.evidence.json`, `ev_127d0eb75c45d1d2696c4b0f4ebd39702e380d00ab1b5616c4909134a48109e7` | Complete warm/cold paths for the shared cached metadata helper. | Existing singleton import binding and descriptor/cache correspondence checks. |
| `0x1012b284c`, `outer-action-accessor.evidence.json`, `ev_e1b8ce229fa69ee517b62b0a6ad22f3f7cd22caf576bb0147b7261dc98bedfae` | Exactly binds the outer descriptor and cache to that shared helper. | No new static outer-metadata accessor variant is needed for this Arc route. |

Earlier raw reads of outer copy witness `0x1012b795c` and child copy witness `0x1012b8738` are bounded byte windows, not complete transitive effect proofs. Do not label their arbitrary indirect callees pure. A typed-copy primitive can instead state its explicit Swift ABI reliance, just as the existing runtime-tag primitive does; if that reliance is outside the supported producer policy, the route remains unknown until a complete witness/effect proof is added.

## Minimum supported shape

Two designs are possible. Prefer the local runtime snapshot lane if its assumptions are made explicit and verified by negative controls. It avoids requiring the action to be input register 0, and avoids proving original input-to-copy value lineage. It does **not** remove stack bounds, source/destination separation, escape, metadata, or post-tag memory-effect obligations.

1. Bind the exact runtime tag call to the outer descriptor through the existing verified cached accessor. Give its object pointer a reaching-definition identity at that call. Under the existing valid Swift enum ABI assumption, this creates a typed outer snapshot at that address. Do not derive its type from a shared getter.
2. Prove every path reaching the child getter is dominated by this runtime call and selects exactly reflected outer payload case 1. Reject bypasses, mixed cases, foreign entries and unresolved relevant control flow.
3. Resolve the case's direct reflection reference to the fixed child descriptor. Validate child metadata backpointer, VWT, size 156 and the complete getter body. Preserve the type's count 28 from descriptor/reflection. The shared getter code supplies neither identity nor count.
4. Prove source and child destination are disjoint live caller-private intervals, using symbolic stack allocation facts below. The source's payload bytes remain unchanged from the tag call through all loads. No unknown post-tag call or write may be omitted.
5. Track SIMD bytes through the selected block. Each final child byte j in `[0,156)` must come from the runtime snapshot's source byte j. The complete child getter reads only the checked child span. The current Arc copy covers all 156 bytes, so a first implementation can retain the stronger whole-child requirement.
6. Preserve the unsigned W0 return semantics, W8 zero extension, signed table words and ADR anchor proof already used by the producer. Only after all proofs may the existing repair transaction run.

The alternative keeps the existing stronger input-lineage policy. Add incoming identities X0..X7 (distinct identities, not equivalent inputs), a verified typed-copy wrapper summary, symbolic allocations, and SIMD byte provenance. Arc then binds incoming X1 through X23 to the same typed destination. X8 is an indirect-result ABI register and should not become an ordinary input accidentally. This alternative needs more provenance facts than the snapshot lane but is compatible with its byte proof.

## Source/destination separation and stack liveness

Let B be X19, the initial fixed-frame base. The fixed child interval is `[B+0x440, B+0x4dc)`, entirely inside `[B,B+0x9e0)`. Let P be SP immediately before the last allocation; require P <= B. The last allocation must be tied to the same outer metadata used by the runtime tag call:

```
N = VWTSize(outer_metadata)
L = align16(N)
S = P - L                 // final X25 and SP
N <= L, without arithmetic wrap
S + N <= P <= B < B+0x440
```

Thus source `[S,S+N)` cannot overlap the child. Merely knowing S<=B is insufficient without an extent or an equivalent separation fact. Direct reflected inline payload layout must establish that the selected child's 156 bytes fit within N. The ABI layout assumption also needs to cover inline payload position zero and outer spare-tag bits ignored by the child getter; an indirect field or unsupported layout must reject.

Use symbolic allocation terms, not a fabricated numeric outer size. An initial constant frame anchor and a monotonic SP upper bound are sufficient for earlier unrelated allocations; the final allocation additionally needs exact N/L identity. Keep allocation IDs and extents distinct. A restored or increased SP can retire a dynamic region; it cannot silently fall back to the old negative-offset spill approximation. Prove the fixed child remains live at every store and at the getter.

The repeated indirect calls resolve through the exact Darwin `___chkstk_darwin` GOT slot `0x104237440`. The caller relies on preservation of X2, X8 and X12 across particular probes. Generic volatile-register handling correctly loses those facts. A new summary must bind the exact import/relocation and its special ABI, preserve only proved registers, and describe probe memory effects. Neither BLR spelling nor a source operand in a familiar slot proves a benign call. The current retained helper set does **not** contain the implementation or an authoritative local contract for this stack-probe import; own compiler output corroborates reliance on preservation but does not independently prove the implementation. Keep this remaining trust boundary explicit.

Unknown allocation sizes must not allocate host buffers. Bound symbolic expressions and graph work independently of target sizes. Reject overflow/underflow in constant calculations and retain an explicit normal, nonwrapping stack-allocation ABI assumption for runtime-sized terms.

## Escape and memory effects before the snapshot

The current producer rejects all unknown prefix calls. Do not silently drop that rule while adding snapshot identity. A strict first extension can require every prefix call to have a verified summary (metadata accessors/helpers, the exact stack probe, and typed initializeWithCopy wrapper). Such summaries may have real global, metadata-cache and heap/reference-count effects; they need only establish the private-stack facts used here.

A more general scoped alias rule could admit an ordinary-ABI call with unknown other effects only if no caller-frame capability reaches it and no earlier store/call published such a capability. This is an explicit new proof rule, not a declaration that the call is read-only. Analyze all prefix paths. Preserve unknown non-frame effects in the result. Unknown/opaque writes and ambiguous pointer arguments remain unknown.

Treat any pointer derived from the caller's fixed **or dynamic** frame as a potential capability to the frame unless a proved region/typed ABI contract bounds its use. The generic copy wrapper receives S, so its nonescape/extent obligation survives even in the snapshot design. A wrapper body matching the instructions above can forward a typed initializeWithCopy contract for the exact bound metadata; an unknown wrapper cannot. Copies/retains of reference-valued payload fields are not automatically escapes of S itself. Copy witness semantic effects must remain distinct from byte-for-byte memcpy effects.

Reject a prior call or external-memory store that can publish the child interval, fixed-frame anchor or an unbounded frame-derived pointer. Private spills of those pointers remain owned. Earlier writes to a child span may be overwritten by a complete projection, but earlier pointer publication cannot be repaired merely by overwriting its contents. Explicitly assume no concurrent writes to an unescaped private frame.

## SIMD representation

Track a loaded vector as 16 byte origins `(snapshot_id, source_offset + byte)`, tied to the source memory version at the load. Handle Q-register LDR/LDUR and two 16-byte outputs of LDP; STR/STUR/STP apply exact byte widths. Canonicalize Q/D/S/H/B/V aliases so a partial vector write kills or updates affected provenance. An unsupported vector instruction must not preserve stale bytes.

Arc uses overlapping tail loads/stores at offset 140. Overlap is sound when the final byte origins agree, so a simplistic ban on overlap would reject a valid projection. An offset or tail-width mismatch must fail. Stores into a separate private copy `[B+0x4e0,... )` must not be confused with the selected destination. Loads are read-only for the source, but intervening writes/calls still require alias/effect checking. At CFG joins, all feasible incoming byte states must agree; no latest-address-order approximation.

`audit_arc_projection.py` independently checks the single retained straight-line projection block under stated assumptions. It establishes conditional byte coverage, not the assumptions or the full producer result. Its output `arc-projection-byte-audit.json` reports all 156 byte origins correct and rejects 8 altered controls: wrong tail source, wrong tail destination, missing tail, unknown call, unsupported vector clobber, unknown branch, pointer-name reuse after X25 reassignment, and an overlapping wrong-byte store.

## Required public-workflow controls for a producer change

These are proposed controls; the supplemental byte audit is not a substitute for running them through the changed public workflow.

| Axis | Positive | Independent rejection/control |
| --- | --- | --- |
| Type binding | Outer case 1 reflects 28-case child | Same getter used by a 29-case decoy; wrong backpointer, descriptor, field or indirect field cannot transfer identity/count |
| Runtime snapshot | Runtime object and projection source are the same reaching value | Pointer reassigned before a load, another object copied, or source modified after the tag call |
| Case domain | Exactly case 1 reaches child getter | Wrong selected case, union of cases, bypass edge, foreign entry, or unresolved relevant exit |
| Stack separation | Final allocation tied to same outer N, source end <= fixed base | Source overlaps child; L<N; mismatched metadata size; unknown sign/overflow; retired allocation or SP increase |
| Pre-tag escape | Only proved, bounded nonescaping use of private pointers | Publish child/base/dynamic pointer through an unknown call or external store, including before the final initialization |
| Post-tag effects | Only proven private writes and pure loads before getter | Unknown call, opaque store, aliasing source write, or destination overwrite after its last correct copy |
| SIMD provenance | Full 156 bytes, including consistent overlap | Missing byte, wrong source/destination offset, wrong pair width, partial vector alias clobber, merged inconsistent byte states |
| Typed copy summary | Exact bound accessor and VWT +16 initializeWithCopy | Wrong incoming accessor, +8 destroy/+24 assign slot, swapped source/destination, hidden extra call/store, missing restore, unknown branch |
| Stack probe summary | Exact imported Darwin probe and proved preserved registers | Similar BLR from another GOT slot, wrong import library/name, overwritten X2/X8/X12, ambiguous target |
| Dispatch | W0 copied to W8, signed 32-bit words and correct anchor | Uncleared X0 upper bits, wrong element width/signedness/anchor, table truncation and out-of-owned-body targets |

## Owned compiler probe

`ArcSecondArgumentProjection.swift` derives from the repository-owned fixed projection fixture. It changes the action to ordinary Copyable, places it in the second argument, selects child at outer tag 1, uses 11+17 child cases, and retains a separate 11+18 child whose getter can be merged. `ResilientPayload.swift` is a small owned module compiled with library evolution. The source is not Arc source.

Apple Swift 6.3.3 (`swiftlang-6.3.3.1.3`, target arm64 macOS 26) produced:

- `-Onone`: second-argument action spill, dynamic outer allocation, typed copy, runtime outer tag, memcpy(156), outlined child tag, signed-word dispatch.
- `-O`: second-argument action saved in X21, cached outer metadata, dynamic outer allocation and typed initializeWithCopy wrapper, tag-1 branch, Q-register copy of 156 bytes into fixed storage, and the same complete seven-instruction child getter used by both the 28-case and 29-case child types. Its dispatch table is byte-sized under this compiler.
- `O.word.s`: explicitly owned transformation of only that optimized dispatch from a byte table to a signed 32-bit relative table. It preserves 28 labels and places the ADR anchor on the ADR instruction, matching the existing supported dispatch shape. This is a transformed probe, not claimed untouched compiler output.

`compile_probe.py` records exact commands/tool identity and hashes in `compile-manifest.json`; both optimized objects were assembled and disassembled with the installed toolchain. No linked probe, Arc process or object code was executed. No REA+ provider was run by this offline lane. The native helper Evidence in the sibling directory was supplied by the root's separately scoped public-workflow run.

The next concrete producer increment is therefore a typed runtime snapshot plus symbolic stack separation and byte provenance, with explicit stack-probe and typed-copy effect summaries. The static-outer-accessor idea is unnecessary for observed Arc. The full Arc path remains open until these obligations are implemented and verified through public CLI/MCP recovery, then the reducer is rerun.
