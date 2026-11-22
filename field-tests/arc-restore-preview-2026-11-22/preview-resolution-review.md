# Preview dispatch: fresh type and frame resolution

This additive review closes the two raw-instruction gaps in [the retained-record checkpoint](preview-review.md) and binds the selected field's protocol/argument identities. The earlier Markdown and JSON remain byte-identical. Root collected the new public records; this reviewer made no provider, target/profile/service, production-edit or Git operation.

## What is now exact

The complete field mangling at `0x103bb708e` is `02e1a967005f70536702685567006300`. Its first indirect symbolic reference resolves through `0x104231a70` to protocol descriptor `0x103d3fa38`, named **WebContent**. Its second reference resolves through `0x10422c600` to nominal descriptor `0x103d64070`, named **WebContentFrameIdentifier**. Under native Swift mangling grammar the full field type is `(WebContentFrameIdentifier) -> (any WebContent)?`; the optional existential is the return type, not the argument.

The callback frame write is now physical: `0x1012aad68` stores incoming `X0/X1` directly to async frame `+0x78/+0x80`. Combined with the unchanged old captures, the selected path is:

1. Call the metadata-bound `ADKClient.getWebContents` field and receive its result pair.
2. Save that pair at parent frame `R+0x20/+0x28` and supply capture-context operand `R+0x10` to wrapper `0x1012bb1f8`.
3. The wrapper reads capture-context `+0x10/+0x18`, forwards the pair unchanged in `X0/X1` and branches to `0x1012aad50`.
4. The new entry stores those exact words at child async-frame `F+0x78/+0x80` before scheduling `0x1012aade8`.

This is a conditional static closure path. The dependency implementation and whether a runtime callee invokes the supplied closure are not observed.

The modern path is now physical too. The old `0x1012bb248` adapter forwards the saved pair as `X1/X2` to newly captured `0x1012ab17c`. That body puts the value in Swift-self `X20`, the second word in `X19`, obtains dynamic metadata separately through the reported `swift_getObjectType`, and loads the target from `[X19+0x2e8]` at `0x1012ab240`. The invocation passes callback `0x1012bb950` in `X0`, its continuation context in `X1`, dynamic metadata in `X2`, and the table word in `X3` at `0x1012ab258`.

This matches the old physical fallback sequence at `0x1012ab09c..0x1012ab0b4`. Its callback is `0x1012bb254`, now confirmed as a one-instruction branch to `0x1012bb2bc`. The modern and fallback callback pointers are distinct and must not be collapsed into one address merely because their purpose appears similar.

## Protocol layout and the remaining ABI-source boundary

The selected protocol header has raw flags `0x43`, two signature requirements and 130 ordinary requirement records. Its name is exactly `WebContent`, singular. The physical table displacement `0x2e8` is word 93. Under the native Swift witness-table convention of one conformance-descriptor header word, this corresponds to requirement index 92. Its exact record address is:

`0x103d3fa38 + 24 + 2*12 + 92*8 = 0x103d3fd48`.

That record contains flags `0x11` and a zero default-implementation displacement. It does not supply a method name or complete function signature. No screenshot method name, exact implementation address or active conformance is inferred from that offset.

The optional protocol-existential return, two-word result, object-type query and passing the second word as both lookup base and final call argument strongly support an object/witness pair under the class-constrained Swift existential ABI. The lookup base is distinct from the separately computed object metadata. An independent primary definition of `ProtocolClassConstraint` and `ProtocolContextDescriptorFlags.getClassConstraint` was not found in this reviewer's installed/retained sources. **The direction of the zero class-constraint bit remains pending primary-source authentication here.** The raw flags are not silently promoted into a proved class-bound declaration from remembered enum semantics.

Once that primary ABI binding is authenticated, the selected valid-return model supports naming the second word the `WebContent` protocol witness table and this call protocol-witness dispatch. It still does not select the runtime table's concrete conformance or implementation. The original review's “shape supports witness ABI” qualification is therefore strengthened by exact protocol identity and closed pair flow, while the primary class-constraint interpretation remains explicitly scoped.

The first signature record has raw flags `0x1f` and extra value zero; the second has raw flags `0x80`. Their exact bytes are retained in the JSON. Their layout/class meaning and inherited protocol target should be decoded only through the admitted ABI definitions and exact relative pointer, without name/order guesses.

## Declared image payload versus observed image

The selected continuation-result type reference at `0x103bd6bce` contains exactly `So7NSImageCSg`, the Swift mangling for optional Objective-C `NSImage`. The related checked-continuation mangling is separately retained. This establishes a declared type used by the selected continuation machinery; it does not establish a nonnil image, its pixels, successful callback invocation, storage success, a preview file or durable readback.

No further provider query is required to close the pair provenance. If the next question is a concrete target candidate, use an exact `WebContent` conformance/witness-table observation and map the already selected requirement; a same-named class or a presumed class-vtable offset is insufficient. Active runtime witness selection remains unknown.
