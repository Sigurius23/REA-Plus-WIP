# Installed singleton runtime: matched enum metadata identity

Completed 2026-11-15 from the bounded, retained 2026-11-14 extraction. This is supplemental static implementation analysis, not REA+ Evidence or observed execution. No provider, build, network, target/library execution, production edit or Git operation was used. All earlier copy/runtime receipts and the indexed design/probe baseline remain unchanged.

## Conclusion

For the inspected installed Swift runtime, the matched **non-generic enum** path returns the incomplete metadata pointer identified by descriptor+32 itself. It allocates cache-entry/synchronization objects, but does not allocate a replacement enum metadata instance. The successful completion path retains that pointer at cache-entry+8, invokes the descriptor's completion callback with it, publishes it to the public cache word, and returns it. The inspected state/wait helpers do not replace that metadata-value field.

This closes the singleton-instance identity obligation **conditionally for this identified implementation and matched shape**. It does not prove a generic Swift ABI rule, bind Arc to this OS runtime/architecture variant, or establish runtime execution. Cache validity, ordinary allocator/synchronization behavior, correct pointer authentication and normal successful completion are explicit conditions. Class, generic and other initialization paths have alternatives and are excluded.

Combined with `swift-runtime-vwt-followup.json`'s separate callback proof, the matched installed implementation preserves the incoming VWT pointer and initializeWithCopy slot for the observed callback flags/layout records. Thus, if this implementation operates on the recorded Arc instance, the resulting chain is:

```
descriptor D = 0x103d7b260
singleton record R = D+28
incomplete metadata M = 0x104627290
M[-8] -> VWT 0x104627200
VWT[+16] -> copy witness 0x1012b795c
```

The remaining connection is Arc's actual compatible runtime binding, followed by the producer's still-unimplemented dynamic-storage/typed-copy/SIMD proof and composed effect obligations. Arc switch recovery is not claimed fixed.

## Sources and exact scope

The installed cached image is `/usr/lib/swift/libswiftCore.dylib`, arm64e UUID `7669D858-D332-36C7-9C6C-4564FFBEA8D2`, VM base `0x193bb0000`. `dyld_info` identifies `_swift_getSingletonMetadata` at image+0xe38c. Its exact LC_FUNCTION_STARTS range is `[0x193bbe38c,0x193bbeaf0)`, 1892 bytes, SHA-256:

```
ca2336d596ed2d1be3139d2f608cb0c698d0d711d2ddbb22ca7da38a3a4ab1d9
```

Only checked cache mappings, previously authenticated header/load-command/function-starts metadata and selected function bodies were read. Fourteen complete bounded bodies were retained; their exact ranges, hashes, code bytes, instructions and relevant CFG edges are in `singleton-runtime-identity-followup.json`. Helpers' descriptive names are inferred roles, not recovered source names. LLDB decoded byte buffers in an empty architecture-only target; no process was created.

The Arc input remains SHA-256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`. Descriptor fields, callback, metadata kind/backpointer, preinitialized VWT and owned-assembly comparison come from immutable `copy-witness-followup.json`, corroborated by the canonical public records listed in `swift-runtime-vwt-followup.json`.

## Matched descriptor and record selection

The conditions are descriptor kind 18, flags 0x10052 with generic bit 7 clear, initialization bits 16..17 equal to 1, metadata kind 0x201, descriptor backpointer equal to D, nonzero relative singleton fields and ABI-compatible correctly authenticated pointers. Request 0 is the successful complete-metadata request used by Arc's accessor/wrapper call sites.

The enum record helpers at `0x193c39238`, `0x193c39560`, `0x193c397e4`, `0x193c39ba8` and `0x193c39e64` account for generic/extra trailing records. With bit 7 clear, their extra counts are zero and their base is the aligned D+28. This matches the existing owned assembly's three singleton relative fields rather than assuming universal offsets.

For R=D+28, the runtime resolves:

```
C = R     + signed32(*(R))       // descriptor+28 cache relative field
M = (R+4) + signed32(*(R+4))     // descriptor+32 incomplete metadata field
F = (R+8) + signed32(*(R+8))     // descriptor+36 completion callback field
```

For Arc these are C=`0x104627270`, M=`0x104627290`, F=`0x1012b8550`. C's first word is the completed public metadata pointer; C+8 is a separate cache-entry pointer. Confusing those words would lose the identity argument.

## Instantiation returns M without replacing its VWT

The instantiation helper `[0x193c258f8,0x193c25a68)` receives R and the descriptor. The descriptor-kind test excludes its class/custom-instantiator route for kind 18. At `0x193c259a4..0x193c259a8` it resolves R+4 into X0=M. It then loads the metadata kind and uses unsigned arithmetic/flags to return immediately at `0x193c25a64` for kind 0x201. On this path there is no allocation, call, metadata write or VWT-header write after resolving M.

The alternative class branch includes a possible indirect tail call and class-specific VWT setup. Its existence is a concrete reason not to generalize this result to arbitrary descriptors or metadata kinds.

## Cache construction, completion and returned value

On a cold entry the singleton routine allocates a 16-byte cache entry E and a separate synchronization object. Those are control objects, not replacement enum metadata. A compare-and-swap publishes E at C+8; competing losers discard their unused control entry and await the winning E. Every winner for this matched stable descriptor resolves the same M.

After the instantiation helper returns M, `0x193bbeabc` stores X0=M at E+8. The cache state byte derives from the VWT incomplete flag. Completion driver `[0x193c40074,0x193c4083c)` loads E+8 once into X22, retaining M in a callee-saved register. Its descriptor helper `[0x193c00c24,0x193c00d24)` returns the descriptor backpointer from M+8 for kind 0x201. On the matched enum path it resolves F from R+8 and invokes F at `0x193c403b8` with X0=M.

The callback's X0/X1 result is interpreted as dependency/state information. It is not assigned to E+8. A nonzero dependency may defer completion or cause retries; a normal complete return does not choose a replacement metadata value.

After callback success, the dependency check at `0x193c334d8` dispatches through `0x193c33620`. For metadata kind 0x201 it reaches the descriptor, observes generic bit 7 clear, and returns no generic dependency. These paths read metadata/descriptor fields and operate on private traversal containers, rather than replacing M or its VWT.

On the complete path `0x193c407e4` release-stores X22=M to C's first word, marks completion, and commits state. At `0x193c40810..0x193c40814` the driver returns X1=0 and X0=[E+8], hence M. The outer singleton preserves that response through its cleanup and return.

The inspected auxiliary routines have distinct ownership:

- Await helper `[0x193c3fcd8,0x193c40074)` reads E+8 for its return or invokes the same completion driver. It does not store E+8.
- State-publication helper `[0x193c40934,0x193c40a7c)` writes E's state word and separate synchronization/dependency containers, not E+8.
- Commit helper `[0x193c4083c,0x193c40934)` likewise commits E's state word. Its stores to its second argument's +8 field clear a local synchronization context, not E's metadata field.

A warm complete cache returns the previously stored E+8, and the shared outer accessor's still-warmer C-first-word path returns the published M directly. This relies on a valid cache created by this matched protocol; an arbitrary prepopulated/corrupted cache is not authenticated by these instructions alone.

## VWT before and after the callback

The enum instantiation path above does not write M[-8]. The singleton/completion/wait/state paths inspect that pointer or metadata fields but do not explicitly replace it for the matched enum path. The known callback can modify metadata/VWT contents, so it must be analyzed separately.

The earlier runtime follow-up does that conditionally for the same installed image: callback flag 0x100 selects the existing-table branch, and static payload layout flags 0x02230007 force preservation of VWT+16. Other VWT slots and layout fields are updated. Composing those earlier conditions with the instance flow above establishes preservation for this path, not blanket VWT immutability.

## Assumptions and remaining boundary

- The runtime image/selected function variant must be the identified one or independently proved equivalent. The inspected image is arm64e; Arc's executable is arm64. Correct pointer-authentication/ABI interoperation is a condition, not an observed binding.
- Descriptor, relative fields, kind/backpointer and cache objects must be valid, stable and uncorrupted. Warm/concurrent entries must originate from the same matched protocol and descriptor; arbitrary cache tampering is excluded.
- Ordinary allocation, synchronization and disposal helpers must respect their supplied control-object bounds. Their implementation bodies were not expanded; this is not an all-effects proof of the runtime or operating system.
- The known completion callback and earlier VWT-preservation conditions must hold. Arbitrary callbacks can write metadata; callback identity cannot be inferred solely from a shared getter or type name.
- The conclusion is conditional on normal successful completion. Authentication failures, traps, faults, indefinite dependency waits and invalid states do not establish a returned metadata identity.

No broader runtime investigation is required to state the result: this installed matched path has no metadata-instance substitution step. The missing application-level connection is the actual Arc/runtime binding and the remaining producer/effect work, not an unexplained singleton pointer choice inside the inspected successful path.
