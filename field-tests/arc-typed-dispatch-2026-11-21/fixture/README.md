# Typed-client halfword controls

These owned Swift libraries were compiled and inspected statically. **No fixture was loaded or executed, and no REA+/Ghidra session was launched.** They prepare positive and adversarial controls for item63; they do not qualify an implemented producer repair.

Reproduce with `python3 build_fixture.py`, then `python3 verify_fixture.py` from this directory (or pass their full paths). `commands.json` records every compiler/static-tool command. The compiler is Apple Swift6.3.3, ARM64 macOS14 target, `-O -whole-module-optimization`. Dylibs, the module cache and the full optional LLVM IR stay local/ignored. Sources, assembly, symbol/disassembly oracles, exact fixup bindings and hash receipts are retained.

## Positive source and metadata

`PositiveOnly.swift` supplies a one-field `TypedClient`: `boolForSetting: (Primary.Setting297) -> Bool`. The `FactoryKey` associated `Value` is exactly `TypedClient`. Its ordinary static witness returns the constructor's code/context pair through its indirect result. The constructor returns a thick closure capturing a Receiver; the adapter forwards the Setting input unchanged in `x0` to a reader, and that reader calls the private String switch without changing `x0`.

The linked positive image has enum descriptor`0x2fb4` (parent Primary`0x2f98`), zero payload cases,297 empty cases and297 reflected records. Client descriptor`0x3034`, field descriptor`0x3e88` and static metadata`0x8170` bind its sole closure at offset0. Its complete type bytes at`0x2284`, `5362012d0d000063`, resolve directly to that exact enum descriptor. The witness table at`0xc0c0` has a tagged associated-type name at`0x2249` resolving to the same client descriptor and executable make witness`0xcd8`.

The adapter is`0x1e88`: `mov x1,x20; b reader0xc90`. The reader's only pre-dispatch argument move is `mov x20,x1`; the input `x0` reaches String switch`0xcfc` unchanged. The switch masks16 bits and reads unsigned halfwords from`0x1f18`, anchored at`0xd24`, scaled by4. **297 comes from the exact pure-enum descriptor and owned valid-input contract, not the mask/table extent.** All297 targets are distinct, aligned and inside the checked dispatcher symbol interval.

`BoxedPositive.swift` adds a second dynamic capture so the compiler emits Arc-like boxed context. Constructor`0x1b74` allocates a25-byte object, stores Receiver at+`0x10` and UInt8 salt at+`0x18`, then returns adapter`0x1f50` plus the allocated context. Adapter`0x1f50` loads only `x1` from context+`0x10` and `w2` from+`0x18`, then branches to reader`0xce0`. The reader preserves Setting`x0` through its call to switch`0xd64`. Exact client/enum descriptors are`0x3108`/`0x3088`; this is a separate nominal identity from the other module. Its table at`0x1ff0`, anchor`0xd8c`, has the identical594 bytes and297 checked targets.

## Adversarial source paths

`TypedClientControls.swift` contains the positive path plus:

- `WrongInputClient.boolForSetting: (UInt16) -> Bool`, which performs an unchecked owned-source `unsafeBitCast` before reaching the same converter. A closure-field proof starting from UInt16 cannot infer a valid297-case enum. Do not execute this control.
- `WrongOwnerClient.boolForSetting: (Foreign.Setting297) -> Bool`. Primary.Setting297 descriptor`0x3274` and Foreign.Setting297 descriptor`0x32ac` have the same displayed nested name and297 cases, but distinct parents/nominal identities. Binding Foreign's field to Primary must fail. A separately established Foreign route can legitimately have its own297 bound; this is an ownership-mismatch control, not an assertion that every Foreign analysis must reject.

The optimizer **merged all three source readers/converters**. Positive and Foreign constructor/adapter/witness names alias identical code; their adapters at`0x1ff0` branch to the UInt16 adapter`0x1fb0`, which forwards to reader`0xcd0` and dispatcher`0xd3c`. The metadata field types remain distinct: positive symbolic context`0x3274`; UInt16 imported nominal identity at cell`0x8028`; Foreign context`0x32ac`. Thus shared bodies, a preferred symbol spelling, matching names/counts and identical table bytes cannot replace a selected typed path. A recovered297 table must remain conditional on the selected valid typed closure input and nominal owner; it must not silently type all callers of the shared helper.

## Stripping and qualification boundary

The positive-only and merged-control stripped copies retain byte-identical `__text`, while private reader/dispatcher symbols disappear. Compiler symbols are retained only as a source-owned oracle; they are not required names in a future anonymous-dispatch recovery lane.

`FactoryKey` requirement flags identify associated-type/function roles, but do not encode the full `make(receiver:)` signature. The owned source and compiler symbol oracle establish that signature in these controls. Item64's static `Value` identity is useful but does not by itself prove an arbitrary Arc constructor signature/field assignment. Root must qualify metadata/constructor ownership, code/context pair flow, supported closure ABI, unchanged argument forwarding and all table arithmetic through public producer results. These fixtures do not establish active runtime default selection, closure execution, valid inputs from unchecked UInt16 callers, durable effects or Arc feature completion.

`fixture-observation.json` retains exact bytes, symbolic references, rebases, descriptors, each of the891 ordinal mappings across three builds, physical instruction excerpts, stripped-image checks and explicit remaining holes. The module identities are independent; addresses are linked image-relative VM addresses, not observed load addresses. Production code and old captures are unchanged.
