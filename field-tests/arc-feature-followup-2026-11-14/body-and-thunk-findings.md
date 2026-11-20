# Arc view-body delegation and point-input capture

**2026-11-14; Arc 1.172.1 / 90370.** The third batch completes **8/8 public
calls**, exports five canonical Evidence records, explicitly closes in
**1,111 ms**, and records verified empty descendants. The fixed main SHA-256
remains `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The [findings receipt](body-and-thunk-findings.json) authenticates the records
and bundle with the isolated 076 runtime; all **1,865 manifest files** match.
No provider or mutable current Java/build was used by this interpretation.

## The body witness constructs child output and captures self

The exact imported SwiftUI body witness **`0x1012d1ccc`** has a **256-byte**
captured body. It obtains `Alignment.center`, saves the caller's output-buffer
address from X8 into X19, then uses metadata-derived field offsets to assemble
the returned value. [Instructions][body-instructions], [pseudocode][body-pseudo].

The substantive child construction is delegated to **`0x1012cd97c`**, called
at **`0x1012d1d38`** with an output address derived from that buffer. The witness
then copies self through `0x10000828c`, allocates a capture context sized using
self's value metadata, and moves the copied value through `0x1000082d0`.
Another output field receives code pointer **`0x1012d1dd0`**, its capture context
and two zero words.

This establishes a concrete child-builder and captured-closure route. The
alignment getter alone does not identify a particular container, and a stored
closure pointer alone does not identify an `onAppear`, `onChange` or hover
modifier. The actual child view composition, modifier meaning and rendering
remain to be read in those selected callees.

## The input thunk forwards the point and captured value

The point-input thunk **`0x1012f0174`** is exactly three instructions:

```text
ldp x2, x3, [x20, #0x10]
add x1, x20, #0x20
b 0x1012f0028
```

It preserves incoming X0, supplies captured-value address `context+0x20` in X1,
loads two additional words in X2/X3, and tail-jumps into the previously recovered
point-filtering callback. Its pseudocode folds the larger callback into this
small forwarding body; that folded text is not proof that the thunk owns the
callback's machine ranges. [Thunk instructions][thunk-instructions],
[pseudocode][thunk-pseudo].

Incoming references retain only DATA source **`0x104e88fb8`**. They do not recover
the closure's installation site or a physical event producer. The earlier
two-unit filtering conclusion remains **FRINTA rounding in coordinate units**;
no physical-pixel interpretation is added. [Incoming references][thunk-refs].

The frozen [four-call next batch](view-builder.steps.json) requests instructions
and pseudocode for **`0x1012cd97c`** and **`0x1012d1dd0`**, following actual
body output and capture edges. [Preparation](view-builder-preparation.json)
checks both exact public function-start entries and their presence in the
captured merged seed file, then validates all four arguments against the actual
third-batch catalog. Their indexed intervals are 2,312 and 12 bytes respectively;
those intervals are not complete body-ownership claims.

The [reproducible interpretation](interpret-body-and-thunk.mjs) runs no provider
and leaves prior findings and captures unchanged. Final drawing, the event's
origin/coordinate space, durable persistence and complete Arc behavior remain
open. No additional REA+ product defect is established.

[body-instructions]: body-and-thunk-evidence/boost-editor-view-body-witness-instructions.evidence.json
[body-pseudo]: body-and-thunk-evidence/boost-editor-view-body-witness-pseudocode.evidence.json
[thunk-instructions]: body-and-thunk-evidence/selector-point-input-thunk-instructions.evidence.json
[thunk-pseudo]: body-and-thunk-evidence/selector-point-input-thunk-pseudocode.evidence.json
[thunk-refs]: body-and-thunk-evidence/selector-point-input-thunk-callers.evidence.json
