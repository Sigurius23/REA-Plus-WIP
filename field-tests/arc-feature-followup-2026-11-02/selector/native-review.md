# Independent review of the native follow-up

Read-only review of the completed public records in `../native/`. No provider
was launched, no input was executed and no production/shared documentation was
edited. These interpretations distinguish decoded instructions from the
default, low-confidence decompiler signatures.

## Gallery payload and body coverage

Evidence `ev_8f2311e359556c225fafadf4f8e3c91a3122ca117a6d6ed0d992958587a3a129`
reports `0x1005a44b4` as a non-contiguous body with **2,100 bytes in five ranges**,
inside a **5,256-byte span**. Treating the whole span as recovered code would
overstate coverage. All ten typed mappings associated with dispatch
`0x1005a4ad4` point outside those reported body ranges; the first target,
`0x1005a4ad8`, follows the first range's end `0x1005a4ad7` immediately.
The pseudocode nevertheless displays ten cases and warns that its table
requires truncation. These are separate provider observations, not evidence
of complete case-body ownership.

More importantly, the prior gallery callback's assembly supplies **`w0=0xc4`**
at `0x100231f7c`, immediately before the call at `0x100231f80`. The helper's
instructions route that value to its *second* dispatch at `0x1005a4be0`, whose
target remains unresolved. The separately recovered ten-case table is not the
branch selected by this caller constant. No concrete gallery destination URL,
action case name or resulting navigation is established by the current body.

A narrow follow-up is already answerable through public tools: read the signed
32-bit entry at **`0x1005a5974`**, computed from table base `0x1005a5964` plus
`4 * (0xc4 - 0xc0)`. Add it to the observed relative base **`0x1005a4bd4`**,
then inspect the exact destination instruction and outgoing flow. Retain the
instruction/byte proof. A case block should not be seeded as an independent
function merely to make it decompile. If this becomes a product-recovery issue,
an owned compiler fixture is needed before changing body ownership/recovery.

A subsequent [owned fixture attempt](native-fixture/findings.md) checks a
related four-group/six-bit signed-word-table layout under default-complete
Ghidra, both with and without debug information. Both retain every returned
table target inside a contiguous 20,020-byte body. This is bounded
non-reproduction; it does not justify numbering a general recovery defect or
closing the Arc-specific partial-Program boundary.

The enum accessor record
`ev_6c2e77dcf3e861213d0404036dcb29c0b84a4926cbfadebd38eda1b85a3fe4ea`
also has a non-contiguous body: **68 total bytes**, not its roughly 48 MB span.
It calls `_swift_getSingletonMetadata` with descriptor `0x103d71abc`; the
descriptor's typed layout is available in
`ev_8fac0afd23a0c137402a520532005f48148ed5a8af222ebb068435bb3ef299e9`.
A typed descriptor layout does not decode the case names or field instances.

## Store send is a closure pair

Evidence `ev_f09f2dc69d79d5a1e59cccb781423af00523791aa567d0f08bedb97144d755ae`
contains the exact sequence:

```text
0x1008449d0: ldp x8, x20, [x20, #0x28]
0x1008449d4: blr x8
```

The strongest observation is loading a code pointer at offset **0x28** and its
context at **0x30**, then invoking that pair. This is consistent with a Swift
closure representation. It is not a demonstrated vtable or witness-table slot.
The concrete closure and subsequent state reducer remain unknown. Existing
public tools can follow incoming writes to the owning object's closure fields
or inspect its construction, once the owning object identity is established.
Reading a static word at the offset alone would not establish its runtime value.

## Command decoding and the omitted error branch

The witness accessor
`ev_023600793aa607a22dc0fe8fc3a56f6b51df819d5ae851f8fead41d501688c95`
loads its cache at `0x1045494b0`; if empty it invokes `_swift_getWitnessTable`
with conformance `0x1036a9f58` and metadata `0x1041fd9f0`, and stores returned
**x0** back with `stlr`. Its decompiler's `void` return and apparent assignment
of the descriptor pointer are not the machine-level return contract. The
caller forwards returned x0 as the JSONDecoder witness argument. The concrete
source command type remains unidentified: the metadata address has no exact
defined type (`ev_0c5df29c4ce7cbb4079d3e38209e6497a27f4f5f8a772bb650ce0c14990acc2e`).
The available conformance data type describes field layout, not field values.

The original `0x100537fac` dossier warns about an unreachable block and removes
the catch from its pseudocode. Its retained assembly still preserves the
important path: `cbz x21` at `0x10053805c` takes success; the other branch gets
`localizedDescription`, constructs a payload with byte **2** at stack offset
`0x68`, and calls `0x1005718fc` at `0x1005380a0`.

New Evidence `ev_e1619ef5265f57b312896ce3c70660d54ebcf457e3ad0a68a29fdc7675cfff3f`
shows that response routine invokes `JSONEncoder.encode`, bridges strings to
Objective-C and chooses call stub **`0x103637080`** for payload byte 2, otherwise
**`0x1036372e0`**. Decoding those two selector loads can identify the declared
callback names. The current record does not establish caller success, actual
error text or service behavior. Its contiguous body also includes a separate
looking witness-cache sequence at `0x100571db8`; avoid treating the full
1,276-byte body as one source-level error-handler statement sequence.

Public follow-up: inspect/read the conformance's actual 16 bytes and resolve
its recorded type reference with the correct flags; then inspect the resulting
descriptor. The returned metadata bytes already contain `0x103ce16e4` as their
second 64-bit word, a candidate descriptor address requiring format-aware
validation. Do not name a command type from that address alone.

## Sidebar predicate and signature confidence

Evidence `ev_6d474d497ba95e13cdee769971d4d18a8a1ec8103c5f91c464578ee54cf5f6f7`
reports a default, low-confidence `void(_NSZone*, _NSZone*, _NSZone*)` signature.
That is not a reliable description of the application API. The caller tests
the low return bit, and this routine materializes 0 and 1 on recovered return
paths (`0x1009f920c`, `0x1009f9158`). Its assembly treats **w1 bit zero as a
flag**, saves the x0 input and makes object messages from the x2 input. It
examines arrays/object equality and branches on results of selector stubs.
The supported claim is an object/state decision consumed as a low-bit result,
not a concrete mouse, occlusion or resize eligibility rule inferred from names.

The explicit `trace_native_values` result
`ev_1bb29bb4f9dc63cc31a8f477366f268e8b3846923f9548bcfd5520b19cfb0a57`
is truncated and carries many **call-depth-budget** unknowns (675 nodes / 768
edges / one decompilation). Increasing a whole-graph node limit alone would
not resolve those call targets. Root is following exact Objective-C selector
loads in the context session; those facts should be combined with these
branch instructions before giving the predicate a behavioral name. Focused
inspection of the concrete helper at each remaining call boundary is more
useful than a broad repeated trace.
