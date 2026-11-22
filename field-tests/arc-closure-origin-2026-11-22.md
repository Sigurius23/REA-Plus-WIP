# Arc: selected closure call preparation and origin boundary

Offline continuation of item 63 on **2026-11-22**, Europe/Berlin. This pass adds
source-bound call-preparation observations to REA+ and finds an actual odd-tag
closure call. The complete invocation proof and automatic context-scoped
297-case dispatch remain open. Arc, its helpers and its shipped JavaScript were
not run. Owned controls were compiled and statically inspected, never executed.

The fixed ARM64 input remains 80,498,448 bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
All public captures retain their actual provider profiles, partial-analysis
limits and caller-asserted seeds. The new seed file adds the exact enum accessor
to the prior selection: 2,508 function entries. Empty bounded xrefs are not
evidence that a global has no other writers.

## Product change and defects found during qualification

`inspect_native_instruction` now optionally returns `call_preparation` for
listed AArch64 calls. It recognizes a directly preceding constant move,
optionally separated by one nonclobbering integer register move. Results retain
the original source words, addresses, disassembly, canonical X0–X7 register,
definition address and 32/64-bit write width. A W-register assignment includes
zero extension. MOVZ, MOVN and MOV-equivalent logical immediates are decoded
from the native words. Known entries bypassing the definition, clobbers,
unsupported preparations and detached decode remain unresolved. Other
architectures return an explicit unsupported result for this pattern.

The scope is `observed-fallthrough-suffix`: these are conditional static
instruction semantics, not observed runtime arguments, full reaching state,
reachability, ABI/type inference, target resolution or a hidden-argument model.
The operation changes no Listing facts, function types or CFG overrides. It
does not add an analysis tool or mutate original executable bytes. The profile
component is `ghidra-aarch64-mov-call-preparation-v1`; the existing enum engine
remains `abi-signed-word-cfg-v10`.

Two defects in the new implementation were caught and fixed before completion:

1. Ghidra exposed the scalar lane index in `mov x0,v1.d[0]`. Treating its scalar
   token as an assigned immediate falsely produced X0=0. The final producer
   validates the native encoding and computes the full value instead of using
   operand-scalar presence. The failed 12-case capture and frozen source remain
   in `mcp-preparation/`, `initial-source/` and `baseline-verification.json`
   below `arc-closure-origin-2026-11-22/call-preparation/` as applicable.
2. Ghidra prints three supported logical-immediate encodings as `orr` with a
   zero-register source, rather than the MOV alias. The old mnemonic/operand
   count gate omitted them. The producer now relies on validated encodings;
   rotated and repeated logical masks are checked independently. The failed
   intermediate 20-case capture, `pre-alias-source/`, `alias-verification.json`
   and exact instruction probe are preserved. An interim progress update
   overstated this run as 20/20 before independent verification; its actual
   result was 17/20, and only the final capture passes all 20.

These were defects discovered while qualifying a new capability; historical
released instruction records did not claim these call-preparation constants.

## Actual Arc call and typed source anchor

The original-byte candidate scan found a selected call inside `0x1012ab5c8`:

```text
0x1012ab818: add x8, x22, #0x10
0x1012ab81c: add x20, x22, #0x2e0
0x1012ab820: bl 0x1006fa470
0x1012ab824: ldp x23, x21, [x22, #0x10]
0x1012ab828: mov x0, x21
0x1012ab82c: bl 0x1036404f8
0x1012ab830: add x0, x22, #0x10
0x1012ab834: bl 0x1000078a4
0x1012ab838: mov w0, #0x31
0x1012ab83c: mov x20, x21
0x1012ab840: blr x23
0x1012ab844: mov x20, x0
```

The selected result is later tested at `0x1012ab910` with `tbz w20,#0,...`.
This surrounding function uses an async frame in X22; the selected closure's
own normal synchronous ABI is a separately stated premise, not inferred from
that surrounding function's ABI. The final public tool reports X0=0x31 with
the exact source instructions at `0x1012ab838` and `0x1012ab83c`.

Wrapper `0x1000078a4` has 13 instructions / 52 bytes. It sets X1 to exact
Client metadata `0x1042c8ac0`, loads its VWT through metadata−8 and calls slot
+8 with X0 still the selected buffer. Under the normal Swift VWT contract this
is destroy of that exact Client source. The existing independently bound
layout has field 0 at byte offset 0, and its complete reflected declaration
is `@Sendable (ArcUserDefaultSettings) -> Bool`.

This yields a **conditional source-type anchor** for the loaded code/context
pair. It requires a valid live, disjoint Client buffer, stable selected field
between the pair load and destroy, trusted normal VWT/metadata identity, and
ordinary preserved-register/call contracts. The preceding retain is not
assumed pure. The new tool does not manufacture those memory premises from
the instruction suffix or from a runtime import's name.

## Exact enum layout and conditional ABI discrimination

Descriptor `0x103d41568` has a signed relative accessor to `0x1005ad394`.
The accessor returns metadata `0x10426d770`, whose kind is 0x201 and exact
descriptor backpointer is `0x103d41568`. Its VWT `0x10426d6f0` has size 2,
stride 2 and flags 0x00200001, including alignment 2. Original file words,
fixup decoding and public loaded-byte observations are retained separately.
`original-pointer-observations.json` explicitly identifies its supplemental
direct REA parser read; it is not fabricated public MCP or runtime Evidence.

Given the valid, normal one-argument synchronous Swift closure contract for
the selected typed field, X0=49 cannot be an aligned indirect pointer to this
enum. This discriminates direct value passing **under those premises for this
selected call**. It does not select a helper-global type or prove that the
closure code equals the default implementation. The declaration's generic
`argument_abi` therefore remains unresolved in metadata output.

Source-built 297-case controls make this boundary concrete. Swift 6.3.3,
ARM64 macOS 14, optimized whole-module builds compile `callOdd` and `callEven`
for the same reflected sendable closure shape:

| Build | Owned IR and native observation |
| --- | --- |
| Ordinary | Direct i16 49 / 50; native X0 immediate |
| Frozen | Direct i16 49 / 50; native X0 immediate |
| Resilient | Aligned storage containing i16 49 / 50; native X0 points to storage |

An even constant alone supplies no alignment contradiction. These controls
demonstrate the selected distinction; they do not establish a general ABI
lowering rule from reflected shape, case count, current size or one flag bit.

## Constructor and dependency-origin boundary

The examined constructor `0x100d92a28` writes the default field-0 pair including
code `0x100d92ebc`, then the other pairs through offset 0x160, before its later
retain calls. Exact import-slot observations identify `_swift_allocObject`,
`_objc_retain`, `_memcpy` and `_swift_once`, including source slots, libraries,
weak flags and addends. Public normalized import names and supplemental exact
fixup-slot reads remain distinct representations.

The official Swift runtime declaration of
[`swift_allocObject`](https://github.com/swiftlang/swift/blob/main/include/swift/Runtime/RuntimeFunctions.def)
uses a normal C-call signature with three explicit arguments and a direct
pointer return. Import identity and a known signature do not establish pure
memory effects, closed aliases, immutable dependency selection or every global
writer. No v10 frame-escape rule was relaxed from an import name. The selected
getter may use dependency injection; the actual call target remains unresolved
in public call-target output.

The original-byte scanner and earlier captured-instruction index are candidate
locators only. Their bounded inventories, including the six setter-like
constant-one candidates, do not prove reachability or absence of other calls.

## Verification and remaining work

The final source is bound to the 1,871-file frozen runtime in
`call-preparation-final-runtime-manifest.json`. Final real-provider captures
contain **67 successful public MCP calls**: 29 native-control, nine Arc,
21 compiler-control and eight parity-control calls. **20/20 native semantic controls** pass, covering
direct/indirect calls, W/X zero extension, signed and shifted constants,
logical masks, another argument register, clobbers/aliases, known bypasses,
entry at the definition, MOVK and vector-lane exclusions. **Five full CLI/MCP
Evidence comparisons** cover separation, lane exclusion, W zero extension,
logical immediates and the actual Arc call. Original bytes and the selected
before/after function-body observation are unchanged.

The final helper analysis still has 14 instructions / 56 bytes and zero
recovered Setting tables. The retained reducer parent keeps all 28 mappings
and 10,072 body bytes, with exact case/target equality to the prior v10 capture.
All public input/output schemas, named contracts, text/structured equality,
Evidence identities, subject digests, export membership, repeated closes and
empty owned process lineages are independently checked. The same checks cover
the research and earlier experimental transports; their semantic failures stay
explicit. One exact CLI comparison failed because the one-second fixture
analysis completed in one run and timed out in the other. Both differing
Evidence records and the failed receipt are retained. The final four fixture
comparisons use the same 60-second policy in both adapters; the Arc comparison
retains its explicit one-second partial policy. No observed limits are stripped
to force equality. See `qualification-verification.json` and
`cli-parity-verification.json`.

85 affected source tests and build/fast/docs/package checks pass. The enum
recovery class is unchanged, so this pass does not claim a new run of the
earlier 110-case enum engine matrix. Ten prior snapshots and historical living
source versions are authenticated without rewriting old captures. Independent
agent review was unavailable because the worker quota was exhausted; this pass
uses sequential source review and the retained independent assertions.

Remaining item 63 work is to close selected code/context origin and relevant
field stability, preserve unchanged argument forwarding into the selected
converter, then implement an observation-only per-invocation mapping carrier.
Do not install a helper-wide 297-case CFG/type override from this call. Full Arc
coverage, actual dependency selection, durable runtime behavior and broader
browser subsystems remain open. This checkpoint is committed locally; it does
not imply a push or runtime verification.
