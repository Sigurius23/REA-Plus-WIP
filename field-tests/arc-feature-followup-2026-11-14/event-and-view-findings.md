# Arc point filtering and SwiftUI body identity

**2026-11-14; Arc 1.172.1 / 90370**, ARM64 main SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The second batch completes **7/7 public calls**, exports four canonical Evidence
records, explicitly closes in **829 ms**, and records verified empty descendants.
No Arc binary, helper, shipped script or network behavior was executed.

The [audit](event-and-view-audit.json) authenticates all four records and their
bundle using the isolated **076c706c6** runtime. All **1,865 files** match its
[immutable manifest](frozen-runtime-manifest.json). It does not validate or
depend on the concurrently edited current Java tree. The
[machine-readable findings](event-and-view-findings.json) retain complete
Evidence IDs, file hashes and limitations.

## The callback stores the latest point before filtering

**`0x1012f0028`** receives two Double words and a flag byte. It obtains its state
object through `StateObject.wrappedValue`, using type accessor
**`0x1012e5260`** and conformance **`0x10378b278`**, previously identified as
`HoveredElementTracker: ObservableObject`. The returned object's coordinates at
**`+0x20/+0x28`** and flag at **`+0x30`** are replaced with the incoming values
before the movement filter runs. This is a selected static receiver route, not
an observed runtime instance. [Instructions][instructions], [pseudocode][pseudo].

When the incoming flag is **1**, the callback sends **four zero words plus flag
1** through a `Published` setter and returns without starting a new query. This
branch uses keypaths **`0x10378c010/0x10378c038`**. Their equivalence to the older
getter/publication keypaths is not inferred merely from similar value layouts.

For a present point, a previously absent point immediately reaches the task
starter. Otherwise the instructions compare old and new points after applying,
for finite coordinate values:

`Q(x) = 2 × roundTiesAwayFromZero(x / 2)`

Both coordinates undergo multiply-by-0.5, **`FRINTA`**, then doubling before
`CGPointEqualToPoint`. If both quantized points are equal, the task starter is
skipped; otherwise **`0x1012e4d6c`** is called. These are **coordinate units**;
the source coordinate space and physical pixel scale remain unknown. The
decompiler's integer-cast rendering loses the rounding semantics, so the
machine instructions govern this conclusion.

Incoming references identify a forwarding thunk **`0x1012f0174`**, jumping at
**`0x1012f017c`** into this callback. This advances the point-input route but
does not yet prove a specific hover/mouse event or identify the closure's
installation site. [Callback references][incoming].

## A named SwiftUI requirement selects the body witness

The exact type query recovers `BoostsEditorView`'s conformance to imported
**`_$s7SwiftUI4ViewMp`** at **`0x103789dc0`**. Its static resilient pair for
**`_$s7SwiftUI4ViewP4body4BodyQzvgTq`** selects **`0x1012d1ccc`**.
This is record **ordinal 5**, at **`0x103789dfc`**; ordinal 5 is not a populated
runtime witness slot. The record explicitly retains
**`runtime_witness_table: not_instantiated`**. Other imported associated-type
entries are not treated as executable body functions.
[Exact conformance][conformance].

This establishes the correct next function for view construction. Its body
instructions, drawing operations and visible output were not analyzed in this
second batch. Those remain separate from the nominal type or conformance name.

The frozen [five-call next batch](body-and-thunk.steps.json) requests instructions
and pseudocode for the body witness and forwarding thunk, plus the thunk's
incoming references. [Preparation](body-and-thunk-preparation.json) independently
validates **`0x1012f0174`** as an exact public function-start entry: its previous
entry is `0x1012f0170`, next `0x1012f0180`. Both selected entries already exist
in the captured 1,949-entry seed file. No request was executed by this
interpretation.

The point's physical event/coordinate source, final native drawing, durable
Boost persistence and broader Arc behavior remain open. This pass establishes
no additional REA+ product defect.

[instructions]: event-and-view-evidence/selector-new-starter-caller-instructions.evidence.json
[pseudo]: event-and-view-evidence/selector-new-starter-caller-pseudocode.evidence.json
[incoming]: event-and-view-evidence/selector-new-starter-caller-inputs.evidence.json
[conformance]: event-and-view-evidence/exact-boost-editor-view-conformances.evidence.json
