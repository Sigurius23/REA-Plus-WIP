# Preview pair and dispatch review: retained-record checkpoint

The selected pair is the **two-word result of the closure stored in `ADKClient.getWebContents`**, passed into the preview callback's capture context. The old raw records do not yet close its next store into async-frame `+0x78/+0x80`, and the field's complete type bytes were not queried in this checkpoint. The later calling sequence strongly supports a class-constrained protocol witness call, but it is insufficient to declare a class vtable or identify a specific protocol/conformance without that type binding.

This is a conditional static review of the old immutable captures. Root is separately collecting the missing bodies and field type; none of those fresh records is represented as read here. The companion [JSON](preview-review.json) authenticates all 22 canonical source records and exact metadata/instruction deductions. No provider, target/profile/service execution, production edit or Git operation was performed. Received source checkpoint `a7fd989921b1341644055efea8a48e95e60ab0df` was not independently queried through Git.

## Exact field and closure binding

The retained descriptor `0x103d66548` names `ADKClient`. It is a nongeneric struct with 136 fields and field-offset-vector word offset 2. Static metadata `0x1042d0ed0` has kind `0x200`, points back to that descriptor, and places field 8 at instance offset `0x80`. Field descriptor `0x103e9950c`, record 8 at `0x103e9957c`, points to `getWebContents` at `0x103e04ddb` and its **unread complete type mangling `0x103bb708e`**. The next field's type begins `0x103bb709e`; a 16-byte read is the first precise missing type query.

Let `R` be the parent async frame in `X22` at `0x1012aab40`. The code resolves the selected dependency into `R+0x30`, loads the pair at `R+0xb0` into `X23/X20`, and calls `BLR X23` at `0x1012aabc4`. Since `0x30+0x80=0xb0`, the selected pair corresponds to the metadata-bound closure field. Its inputs are the two words loaded earlier from `R+0xa68/+0xa70`. The call's result words `X0/X1` are preserved into `X21/X19` at `0x1012aabc8/+0x4`. Only the first result word is tested for zero at `0x1012aabdc`.

On the nonzero branch, `STP X21,X19,[R,#0x20]` at `0x1012aac38` stores both result words. The supplied callback descriptor is `0x103788e68`, and its context operand is `R+0x10` at `0x1012aac70`. That descriptor's signed relative entry resolves exactly to wrapper `0x1012bb1f8`; its second word is 32, an async function's required context/frame-size word, **not a proved closure-capture allocation extent**.

Wrapper `0x1012bb1f8` loads `[captureContext+0x10/+0x18]`, moves those words to `X0/X1` and tail-branches to `0x1012aad50`. Under the selected native closure invocation with context `R+0x10`, these addresses are `R+0x20/+0x28`: precisely the saved result pair. Static supply of this callback does not prove the runtime implementation invokes it or selects the same dependency.

## The async-frame gap and two later uses

The old raw wrapper body is 80 bytes and ends at `0x1012bb247`. It does not contain the tail target `0x1012aad50`. Its pseudocode reconstructs an allocation and stores at async-frame `+0x78/+0x80`, but those are **decompiler corroboration**, not instructions present in that record's body. A bounded raw query at `0x1012aad50` is the minimal missing store proof. Do not silently extend the wrapper's raw coverage using its pseudocode.

Let `F` be the later async frame. `0x1012aade8` physically reads its pair at `F+0x78/+0x80`, saves it across a MainActor operation and copies the pair to `F+0x60/+0x68`. The modern checked-continuation branch supplies wrapper `0x1012bb248` with context operand `F+0x50`. That wrapper's complete raw body is only 8 bytes: `LDP X1,X2,[X20,#0x10]; B 0x1012ab17c`. For that selected closure ABI/context, it forwards `F+0x60/+0x68`. The full call sequence shown in its pseudocode belongs to the tail target's reconstruction. Raw `0x1012ab17c` is needed before claiming a physical modern-path table call.

The fallback handler `0x1012aaf6c` has complete retained instructions. It directly loads `F+0x78/+0x80` into `X20/X21`. Define these words as `O` and `W` without assigning their types yet. It separately calls the import reported as `swift_getObjectType` on `O`, preserving the returned dynamic metadata in `X25`. It then performs:

| Call role | Exact instruction fact |
| --- | --- |
| Lookup base | `W`, loaded from frame `+0x80`; not the dynamic metadata result |
| Target | `u64(W+0x2e8)` at `0x1012ab09c` |
| Swift-self | `X20 = O`, preserved from frame `+0x78` |
| Explicit arguments | `X0 = 0x1012bb254`, `X1 = newly allocated continuation context` |
| Additional arguments | `X2 = dynamic metadata from getObjectType(O)`, `X3 = W` |
| Invocation | `BLR X8` at `0x1012ab0b4` |

The callback pointer is raw address `0x1012bb254`; a generated thunk name in pseudocode is not the argument's address. The captured continuation setup does not establish an image result or pixels.

## Class vtable versus witness table

An object loaded into Swift-self plus a distinct second word used both as the dispatch table and an explicit final argument, with separately derived Self metadata, is consistent with a **class-constrained existential `(object, witness table)`** and protocol-witness calling convention. It is not the ordinary evidence for a class-vtable load from the object's metadata. In particular, the table at `W` must not be relabeled the metadata returned in `X25`.

That is currently an ABI interpretation, not a complete exact-type proof. A manually constructed pair, other fat representation or unbound ABI cannot be excluded from instruction shape alone. The unread `getWebContents` function type must bind the returned nominal/protocol context first. If it resolves to a class-constrained existential, decode its exact protocol descriptor and requirement layout before treating `+0x2e8` as a witness slot or naming a requirement. Do not infer a method name from the offset or guess a witness-table header/requirement index from `0x2e8/8` alone.

Even that protocol binding would not select a concrete runtime witness table, implementation, object instance or captured image. Exact conformance metadata can nominate static implementation candidates; active dependency injection and the actual object's conformance remain conditional.

## Minimal next reads

1. Root's fresh `read_function_instructions(0x1012aad50)` closes the pair's async-frame store provenance. The unrelated parent resume `0x1012aad10` is not the minimal callback-entry query.
2. `read_bytes(0x103bb708e,16)` supplies the complete selected field type. Follow only its actual symbolic context reference/indirect slot, then the resulting descriptor. Preserve generic/external/unresolved forms as unknown.
3. If the context is a protocol, request its exact descriptor/name/signature and class constraint, then its requirement layout. Only then map the physical `+0x2e8` lookup to a requirement role/name when encoded. A protocol slot with unknown signature stays unknown.
4. Root's fresh `read_function_instructions(0x1012ab17c)` can corroborate the modern path. `0x1012bb254` can clarify the callback forwarding if needed, but it does not itself identify the dispatch table.

The missing field bytes, their context descriptor and fresh tail bodies are deliberately absent from this checkpoint. Earlier captures remain unchanged. Actual pixels and runtime dispatch selection remain unknown.
