# Arc: allocator ABI repair and captured dependency origin

Offline continuation on **2026-11-23**, Europe/Berlin. Item 68's allocator-return
defect is fixed and verified. Item 63 gains a concrete captured-environment path
and exact reducer field layout; its selected dependency/keypath, final closure
origin and invocation mapping remain incomplete. Arc, helpers, shipped scripts
and the owned fixture libraries were not executed.

The fixed ARM64 input remains 80,498,448 bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Prior captures were reused, and new public observations retain the explicit
one-second partial Ghidra policy and the previous 2,508 caller-asserted seeds.
The original source bytes are unchanged.

## Confirmed defect and repair, item 68

Under the Swift compiler specification, Ghidra treated the exact
`swift_allocObject` import as a void/unknown call with no X0 result. Arc's
constructor consequently appeared to write captured objects into metadata:

```c
puVar1 = &metadata;
_swift_allocObject(&metadata, 24, 7);
*(puVar1 + 16) = object;
```

An owned Swift caller using a Clang C declaration reproduces this mistake.
Its independent compiler IR calls a pointer-returning C function, while the
baseline HighFunction CALL has no output. The native instructions use the real
returned X0. This is a decompiler call-model defect, not evidence of metadata
corruption by Arc.

The new producer helper `ReaGhidraRuntimeCalls.java` handles only the exact
supported external libswiftCore allocator import on non-Windows AppleSilicon
Mach-O Programs using the Swift compiler specification. It copies the installed
language's Apple C prototype into the private Program and applies the declared
three-argument/pointer-return signature. The
[official runtime declaration](https://github.com/swiftlang/swift/blob/main/include/swift/Runtime/RuntimeFunctions.def)
specifies C calling convention and unknown memory effects for this operation.
The repair does not infer pure calls, noescape, allocation success or library
authenticity.

The public `native_api.runtime_call_signatures` observations retain call/callee
addresses, import/library identity, original/effective signatures, the private
C model, X0 return, X0/X1/X2 parameters and unknown memory effects. The profile
component is `swift-alloc-object-c-abi-v1`. Historical records may omit the
optional observations. Other runtime functions are not assigned this signature.
User/imported signatures and call-site overrides retain their authority.

Identity comes from an original imported name or an unchanged importer-owned
label. Local namesakes, wrong libraries and analyst-created external labels
cannot grant this contract. The first implementation's fallback to a function's
display name was tightened during qualification. An analyst-created external
in the supported library namespace reproduced a false adjustment in the first
runtime and receives none in the final runtime.

The final Arc constructor now shows **23 allocation results** correctly:

```c
puVar1 = _swift_allocObject(&metadata, 24, 7);
*(puVar1 + 16) = object;
```

The constructor's complete assembly and body are equal to the retained
baseline. Its output declaration, lifetime, aliases, field stability and active
dependency choice are not proved by fixing these return values. Other inferred
Swift aggregate types in pseudocode remain decompiler observations.

## Captured environment and field origin, item 63

The selected preference call at `0x1012ab840` is reached through a captured
reducer environment, rather than a direct call to the default Client factory.
The retained reducer and new focused reads establish this conditional path:

1. Reducer `0x1012a571c`, at `0x1012a5e14..0x1012a5e88`, allocates a 0x2a0-byte
   context, copies 0x280 bytes from X24 into allocation+0x10, stores two further
   captured words, and passes async descriptor `0x1037887f8` and that context
   to the selected effect construction helper.
2. Descriptor `0x1037887f8` has a signed relative entry to `0x1012b3670`, with
   context size 0x20. The adjacent descriptor `0x1037887f0` instead selects
   `0x1012ab2d0`, with context size 0x3f0. Confusing these two records would
   select the wrong upstream xref query.
3. Thunk `0x1012b3670` sets X2=its captured X20+0x10 before tail-branching to
   `0x1012ab2d0`. That entry stores X2 at async-frame+0x348. Its continuation
   chain reaches `0x1012ab5c8` after the selected async result succeeds.
4. The worker loads that stored environment and copies the 80-byte wrapper
   beginning at environment+0x1e0 into its local dependency buffer. TaskLocal
   access through `0x1006fa470` supplies a Client result; field zero then
   supplies the code/context called with X0=49.

The exact `BoostsEditor` owner descriptor is **0x103d7b1ac**. Its accessor
`0x1012b4468` returns static metadata **0x104316db8**. Public metadata binds the
descriptor backpointer, 640-byte size and eight physical offsets:

| Ordinal | Field | Byte offset |
| --- | --- | ---: |
| 0 | `_adkClient` | 0 |
| 1 | `_analyticsClient` | 80 |
| 2 | `_boostsClient` | 160 |
| 3 | `_date` | 240 |
| 4 | `_mainQueue` | 320 |
| 5 | `_pasteboardClient` | 400 |
| 6 | `_userDefaultsClient` | 480 |
| 7 | `_uuid` | 560 |

The selected ordinal-6 type bytes are
`0217746500790281a165004700`, exactly at typeref `0x103bd6880` used by the
worker's generic-instantiation token. Original symbolic-reference slots
resolve to `Dependency` descriptor `0x103d46d5c` and Client descriptor
`0x103d648c4`; this direct parser supplement is explicitly distinguished from
public type recovery. Public output preserves the entire mangling and marks
its generic shape unsupported.

The reducer also invokes copy wrapper `0x1012b2920` with source X24. That wrapper
sets X2 to exact metadata `0x104316db8` and calls `0x1012b3904`, the copy role
independently bound in that metadata's VWT. Under the normal VWT/copy contract,
valid source and stable relevant copy window, this is a conditional typed
source anchor for the captured `BoostsEditor` environment. It is stronger than
identifying the wrapper by a guessed size or field ordinal.

The selected keypath projection wrapper remains `0x1006fa5bc`; it passes the
captured keypath to imported `swift_getAtKeyPath`. The
[Swift keypath ABI document](https://github.com/swiftlang/swift/blob/main/docs/ABI/KeyPaths.md)
distinguishes compiler-emitted patterns from instantiated runtime objects;
runtime object layout is not a general static-file layout contract. This pass
does not infer the keypath's Value or target getter merely from a pointer at
wrapper+0x10. Generic wrapper interpretation, its construction and current
TaskLocal/default selection remain open.

The already recovered default adapter/reader preserves the selected argument
into converter `0x1005aa5e4`. Binding this actual Client's code/context to that
adapter and preserving its relevant memory/version window are still required
before connecting this invocation to the converter. No helper-global 297-case
type, table bound or CFG override is installed.

## Qualification and preserved failures

The final 1,872-file runtime and 11 relevant source hashes are authenticated in
`runtime-final-manifest.json`. Three public source-built fixtures cover the real
libswiftCore import, wrong-library namesake and local namesake. The latter two
retain identical pseudocode. For the true import, HighFunction gains the
eight-byte register return, independently checked as X0 in a live Ghidra probe.

Final verification comprises **28 public MCP calls on the final allocator
runtime**, **five exact whole-Evidence CLI/MCP comparisons**, **six production
boundary probes**, **86 source tests**, and build/fast/docs/package checks. The
existing real Swift error-model lane also passes against final source: positive
and cleanup error guards, explicit overrides, imported runtime calls, expanded
tree exclusions, public MCP and exact CLI parity. The enum recovery class is
unchanged; the older 110-case enum matrix was not repeated.

Across the research, baseline and qualification sessions, **159 public calls**
retain 158 successes and one expected file-budget refusal. The initial root
metadata plan omitted the larger file policy; its explicit 64-MiB refusal was
correct. A new plan admits the 80.5-MB artifact with 128 MiB. All advertised
schemas, named contracts, text/structured parity, source identities, export
membership, repeated closes and empty owned lineages are checked. Private
probe diagnostics are not fabricated public Evidence or normalized adapter
values. See `qualification-verification.json` and `cli-verification.json`.

The first runtime, baseline artifacts and failed qualification attempts remain
preserved. Early probe assertions counted all allocator calls in a function
rather than the selected call; archived Java classes in the script tree also
caused stale probe versions to run. Unique final probe names isolate the actual
revised source. A renamed original import correctly retains its original
identity and does not reproduce the authority defect; the isolated
analyst-created external does. A separate attempted authority fixture reused an
existing imported location and was invalid. These harness failures are not
reported as additional product defects. The first probe project path also hit
Ghidra's rejection of dot-prefixed project path elements and was moved to owned
temporary storage. The final verifier stopped applying normalized schemas to
raw null-omitting probe diagnostics; actual public replies remain validated in
full. Failed receipts/logs are retained, not relabeled as passes.

The reducer retains all **28 mappings / 10,072 body bytes**, with exact
case/target equality to the prior capture. The Setting helper remains
**14 instructions / 56 bytes / zero recovered tables**. The actual call's X0=49
preparation remains unchanged. Eleven prior snapshots and their historical
living source versions are authenticated without rewriting old evidence.
Worker quota remained unavailable; review and verification were sequential.

Item 68 is complete. Next for item 63: bind the captured generic keypath and
selected/default Client to the existing adapter, close relevant field stability
and forwarding, and implement an observation-only invocation mapping carrier.
Actual runtime dependency injection, durable behavior and broader Arc features
remain unverified. This checkpoint is local and does not imply a push.
