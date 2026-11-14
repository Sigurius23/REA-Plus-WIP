# Swift computed-switch suffix and foreign-entry repair

Started **2026-11-09**; follow-up **2026-11-10**, Europe/Berlin. This fixes independent control-flow
conditions encountered while investigating Arc's item **55**. It does not by
itself recover Arc's fixed-layout action type or its missing case effects.

The original recognizer required `LDRSW; ADD; BR` to be adjacent. Arc schedules
a simple `LDR X22,[X19,#0xa0]` between its destination addition and branch.
An owned source-built Swift fixture, reassembled with `LDR XZR,[SP]` in that
position, reproduced the restriction without changing any shipped Arc bytes.
Source, modified assembly, compiler commands and an independent linked-image
oracle are retained in [the capture directory](arc-dispatch-load-2026-11-09/).
None of the owned binaries or Arc was executed.

The producer now admits one simple non-writeback 64-bit integer load in that
position when it preserves the computed branch register and the suffix's owned
CFG edges agree. The enum bound still comes from the existing descriptor,
accessor, runtime tag call and unchanged-index proof. The added load supplies
no type, case count or extra ownership authority.

On the **same unchanged 53,984-byte fixture**, SHA-256
`91e13544d7169efc2f2f06a32d9b69f5fcea5db7600338d67c43f411d0692a03`:

| Observation                  | Swift tables | Case callees in pseudocode |  Owned body |
| ---------------------------- | -----------: | -------------------------: | ----------: |
| Before                       |            0 |                    0 of 30 |   180 bytes |
| After load-scheduling repair |            1 |                   30 of 30 | 1,324 bytes |

Both sessions exported their bundles, closed successfully and retained verified
empty-descendant receipts. [Before Evidence][before], [after Evidence][after].

## Foreign incoming flow

Read-only review found a second issue: the CFG's owned predecessor map excludes
known incoming flows from outside that function. Those flows are retained in
`foreignEntries`, but the matcher had not checked that set at each suffix
instruction. A separate exported function branching directly into the inserted
load reproduced a false table recovery: the new entry could reach `BR` without
the established destination calculation.

The producer now rejects known foreign incoming flows at **LDRSW, ADD, the
optional LDR, and BR**, covering the adjacent and scheduled-load variants.
On the same unchanged negative fixture, SHA-256
`633e1b9dd8bbf6d310b9b1d11f72fbbc9d4960d26a32d5851a4eeb08cb67ea93`,
the public result changes from **one incorrectly recovered table / 1,324-byte
body** to **zero such tables / 180-byte body**. Export, explicit close and
empty-descendant checks pass for both captures. [False recovery][foreign-before],
[repaired rejection][foreign-after].

These development captures include successive unreleased producer iterations
under profile label `abi-signed-word-cfg-v2`; the foreign-entry before/after
records therefore share that label/digest despite an explicitly changed Java
producer. They are controlled development comparisons, not an unchanged-code
reproducibility claim. The subsequent typed-projection profile supersedes v2;
the original captures remain immutable.

## Verification scope

The initial real Ghidra lane passes **20 fixture cases / 80 MCP calls**, with
two exact CLI/MCP Evidence comparisons: the existing 30-case and 12-case
positives, the new 30-case load-scheduling positive, a branch-register clobber
negative, and the 16 existing malformed/provenance rejection controls. This
lane preceded the review fix; its receipts remain separately named
`full-initial/`. The foreign-entry defect and repaired rejection are additional
real public sessions, not folded into that earlier passing count. The permanent
lane now includes the foreign-entry negative for subsequent aggregate runs.

The provider profile checks also pass **42 cases**. These tests verify recovery
and rejection on the owned shapes. Arc's dynamic stack allocation and inline
SIMD payload projection need additional type, copy and alias proofs; no broader
Arc completion follows from the suffix repair.

## Typed fixed-child copy

The producer also supports a bounded caller-type proof for an inline fixed
child enum. A dominating outer runtime tag must select one reflected payload
record. Its direct symbolic reference identifies the child descriptor; matching
reflection counts, static metadata back-pointer, value-witness size and complete
declared getter establish that child's valid tag range. The unchanged incoming
first argument must be copied in full by the exact `libSystem` `memcpy` import
into fixed private storage before the helper reads it.

Owned borrowing fixtures exercise two different selected outer tags and a foil
enum with a different total case count. Both selected variants recover **24
case callees / 736 observed bytes**. Shared helper code supplies no enum identity.
The metadata discovery admits an actual singleton-runtime caller with a checked
accessor back-pointer, including noncopyable enums omitted from the type index.
The fixed accessor may be the complete four-instruction constant form or its
five-instruction temporary/header-offset variant. Reflection kinds 2 and 3 keep
the same descriptor/count checks. [Initial probe and follow-up](arc-reducer-dispatch-probe-2026-11-08.md).

Review added independent checks for generic p-code write/opaque effects,
private write intervals, exact non-increasing SP on getter ancestors, stack-slot
lifetime, load destination/writeback and unresolved control paths. A predecrement
prologue validates against its post-instruction allocation. Deallocation and
reallocation cannot revive a retired spill. Unknown release/atomic/non-temporal
writes, unproved calls or computed exits reject the typed proof. Runtime-tag
candidate discovery and prefix walks share the CFG work budget.

The original runtime-tag route retains its documented normal-ABI private-frame
assumption when dynamic SP is unknown. Its known live bounds still reject retired
slots. That compatibility assumption does not become the new route's all-path
liveness proof. A stricter development iteration rejected the older 30-case
control; that failed run remains under `full-v5-compatibility-rejected/`.
Both fixed-child controls passed that iteration separately. The first sandboxed
launch rejection and an invalid local probe argument are also retained as
orchestration failures, without counting them as product successes.

The broader development profile **v6** passes **42 cases / 168 MCP calls** and
three exact CLI/MCP Evidence comparisons, with empty owned descendants. Its
receipts and source hash are retained under `full-v6-complete/`. Earlier v4
results remain separate development observations under `full-v4-development/`.

## Retired-stack writeback regression

Further review found that an unsupported SP-writing load returned an unknown
SP. The older compatibility fallback could then retain a spill across a
statically identifiable pop. Two owned mutations reproduce this through real
public REA+: one pops immediately before reloading the tag; the other inserts
an ordinary call after the pop. Both wrongly acquire one Swift table under v6.
Their observed bodies are **1,320** and **1,272 bytes**, respectively.

The with-call control relocates the suffix and overwrites the first original
case instruction. It tests rejection of an unsafe bound; it does not preserve
or verify all original case-callee semantics. Independent assembler encodings
and linked-image disassembly are retained with the inputs' hashes.
[Before captures](arc-dispatch-load-2026-11-09/sp-writeback-before/),
[input commitments](arc-dispatch-load-2026-11-09/sp-writeback-inputs.json).

Profile **`abi-signed-word-cfg-v7`** kills spill facts across unsupported
SP-writing definitions, including discarded-result writeback loads. Ordinary
dynamic `MOV SP` compatibility remains scoped to the original route. The final
44-case matrix includes both new negative controls. The same unchanged owned
inputs now return **zero recovered Swift tables**, with bodies **176** and
**180 bytes**. Both after sessions close successfully, and the recorder verifies
empty owned descendants. [After captures](arc-dispatch-load-2026-11-09/sp-writeback-after/).

The final **2026-11-13** run passes **44 cases / 176 MCP calls**, with **five
positive shapes, 39 rejection controls and three exact CLI/MCP Evidence identity
comparisons**. The complete retained results are in `full-final/`; the successful
Nov10 run's pass log remains historical because its disposable detailed outputs
were cleared before archival. The replacement run uses an ignored workspace
cache, with all 284 selected JSON/log/source files copied and hash-committed.
Compiled binaries and compiler caches remain local.

[Final consistency verification](arc-dispatch-load-2026-11-09/final-verification.json)
authenticates those retained files, every recorded MCP reply hash, all 44
canonical function results, compiler-oracle comparisons, same-input writeback
comparisons and matching immutable Git source objects. The producer source hash
is **`90cf96704a13feaa2562d6545598d76516ad48ac0c52ddad2a2e3b2e90a183ba`**,
published in **`f2cdb96ba`**. The directory-wide audit authenticates **321
standalone / 320 unique Evidence records and 13 bundles**, including historical
iterations. These broader counts are not additional final fixture cases.

The 42 profile source tests, fast gate, built-documentation checks and package
verification pass. [Gate logs](arc-dispatch-load-2026-11-09/checks/).

## Arc boundary

The unchanged fixed-build Arc reducer still reports **2,024 observed bytes /
8,608-byte span** and no recovered nested Swift table. Its incoming action uses
the second argument, metadata-sized dynamic allocations, an outlined copy route
and inline SIMD projection. Those differ from the bounded first-argument,
fixed-frame `memcpy` proof. Issue **55** remains open for that exact Arc shape.

The v6 Arc session returns its selected code, getter, hover-method and complete
28-word table observations and exports them. Its close reports
`cleanup_incomplete` on a transient `sysctl_errno_22`; subsequent shutdown records
verified empty descendants. The first v7 Arc retest has the same cleanup
boundary. Neither run is described as a successful explicit close. See the
[separate cleanup investigation](arc-cleanup-settlement-2026-11-09.md).

After the final cleanup repair, the **Nov13 Arc pass completes 20/20 calls over
three cleanly closed sessions**, exports three bundles and verifies empty owned
descendants. The same 80,498,448-byte main slice was re-derived from the supplied
DMG after temporary inputs were cleared; its SHA-256 remains
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
This successful lifecycle retest still leaves the reducer's dynamic projection
unrecovered. [Final Arc summary](arc-dispatch-load-2026-11-09/arc-final-2026-11-13/summary.json).

[before]: arc-dispatch-load-2026-11-09/before/function.evidence.json
[after]: arc-dispatch-load-2026-11-09/after/function.evidence.json
[foreign-before]: arc-dispatch-load-2026-11-09/foreign-before/function.evidence.json
[foreign-after]: arc-dispatch-load-2026-11-09/foreign-after/function.evidence.json
