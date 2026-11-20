# Selector point updates, tap transition and session settlement

**2026-11-15 analysis of fixed Arc 1.172.1 / 90370**, main SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The saved persistent run ended after phase 4. Its summary records **36 calls /
34 successes / two scoped admission errors**. Five exported phase bundles
contain **3, 7, 11, 18 and 28 cumulative records**, not 67 independent records.
[The audit](selector-tracking-settlement-audit.json) authenticates all 28 unique
standalone records and every bundle using the content-verified frozen 076
runtime; all **1,865 manifest files** match.

The recorder **expired while awaiting continuation 5**, finalized its client and
transport, and retained verified empty descendants at
**2026-11-14 13:35:37 UTC**. Its invocation list contains **no `close_binary`**.
This is not an explicit close receipt or proof of filesystem cleanup. Earlier
phase snapshots correctly described the session as open when exported; they
are preserved unchanged. [Summary][summary], [invocations][invocations], [log][log].

## The tracking callback writes the state consumed by the point filter

Thunk **`0x1012f14dc`** forwards to **`0x1012ef1f4`**. The folded worker reads an
incoming four-word value plus flag at **`+0x20`**. For a present value it copies
the first two words; for flag 1 it substitutes zero words. It writes those
words and the normalized absence flag through the selector's
`State.wrappedValue` setter. That is the state already bound through the value
modifier to **`0x1012f0174` → `0x1012f0028`** and its coordinate filter.
[Instructions][point-instructions], [pseudocode][point-pseudo].

This recovers the static update chain. It does not identify the incoming
four-word type, its physical event source or its coordinate space. Calling it
an observed mouse event or a physical-pixel position would exceed the evidence.

## A valid tap stores the current rectangle and starts follow-up work

The registered single-tap thunk **`0x1012f14e8`** forwards to
**`0x1012ef264`**. Its selected path requires the stored optional rectangle to
be absent, the current optional point to be present, and the tracker's published
rectangle to be present. It then stores that current rectangle in local `State`
and schedules a MainActor-associated task with captured view and point values,
using descriptor **`0x10378c0e0`**. The asynchronous operation's body and its
selection/result effects remain to be traced. [Tap pseudocode][tap].

Rectangle projection **`0x1012f161c`** tests the input word at **`+0x10`**.
When zero it outputs the captured four rectangle words with flag 0; otherwise
it zeros those words and sets flag 1. It also retains the input at output
`+0x28`. This is consistent with a fallback rectangle used while a caller-
initialized array is empty, but the array's element type and final drawing
remain unproved. [Projection instructions][projection].

## The publication and render patterns share a selected property identity

Public loaded bytes corroborate the wrapped-keypath relationship:

- Query publication pattern **`0x10378b2c8`** and render pattern
  **`0x10378c010`** reach the same root/value type references,
  **`0x103bde219/0x103bde211`**.
- The first reaches member descriptor **`0x103d7bd2c`** directly. The second
  reaches **`0x10422db30`**, whose loaded pointer is that same descriptor.
- The prior exact class metadata associates this descriptor with
  `HoveredElementTracker` getter **`0x1012e4cec`**.

This is an explicit selected-field ABI derivation, not a general automatic
keypath decoder. [Patterns][patterns], [loaded indirection][indirection],
[prior class metadata][class]. The new pattern's getter thunk resolves to
`0x1012f14d4`; its later captured branch reaches `0x1012e54d8`, so no direct
branch to `0x1012e4cec` is claimed here.

The other overlay branch is now named by an exact imported SwiftUI conformance:
**`SelectorSpotlight`**, conformance **`0x10378c1c0`**, body implementation
**`0x1012f4464`**. Its static resilient body requirement still says
`runtime_witness_table: not_instantiated`. A type name does not close its shape,
frame, stroke or position behavior. [Conformance][spotlight].

## Reopening once with explicit helper admission

The two errors are procedure-admission requests for **`0x100b080a8`** and
**`0x100b0b828`** outside the old seed set. Their initialized bytes were read
successfully. This is a partial-Program boundary, not absent artifact code or a
new product defect.

The [prepared reopen](selector-reopen-preparation.json) adds exactly those two
public function-start entries to a new **1,951-function** seed file, preserving
the original 1,949-entry seed commitment. Its [seven requests](selector-reopen.steps.json)
follow both helpers, the Spotlight body and the tap descriptor. Later
[modifier/drawing requests](selector-modifier-and-drawing.steps.json) continue
the admitted paths without another restart. No provider, target or current
source/build was run by this interpretation.

Final native tracking, overlay drawing/window placement, selection effects,
durable persistence and broader Arc behavior remain open. The
[machine-readable findings](selector-tracking-findings-2026-11-15.json) retain
complete Evidence IDs, hashes, raw decisions and the settlement distinction.

[summary]: persistent-selector-evidence/summary.json
[invocations]: persistent-selector-evidence/invocations.json
[log]: persistent-selector-run.log
[point-instructions]: persistent-selector-evidence/selector-tracking-0x1012f14dc-instructions.evidence.json
[point-pseudo]: persistent-selector-evidence/selector-tracking-0x1012f14dc-pseudocode.evidence.json
[tap]: persistent-selector-evidence/selector-tracking-0x1012f14e8-pseudocode.evidence.json
[projection]: persistent-selector-evidence/selector-tracking-0x1012f161c-instructions.evidence.json
[patterns]: persistent-selector-evidence/selector-render-keypath-patterns.evidence.json
[indirection]: persistent-selector-evidence/selector-render-keypath-indirect-member.evidence.json
[class]: ../arc-selector-rendering-2026-11-09/selection-after/arc-hover-class.evidence.json
[spotlight]: persistent-selector-evidence/exact-overlay-alternate-branch-conformance.evidence.json
