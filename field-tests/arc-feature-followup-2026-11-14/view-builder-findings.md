# Arc editor composition and deferred body callback

**2026-11-14; Arc 1.172.1 / 90370.** This batch completes **7/7 public calls**,
exports four canonical Evidence records, explicitly closes in **689 ms**, and
retains verified empty descendants. Its fixed ARM64 main remains SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The [audit](view-builder-audit.json) authenticates the records and bundle using
the isolated 076 runtime; all **1,865 manifest files** match. This interpretation
starts no provider and does not depend on the edited current Java/build.

## What the selected builder constructs

The body delegate **`0x1012cd97c`** has a contiguous **2,312-byte** captured
body. It obtains a state object through **`0x1012d75e8`**, reads four words at
`+0xb0` through `+0xc8`, forwards them through **`0x1009b59d0`**, then constructs
a SwiftUI `Color` from an `NSColor`. The component meanings of the four words
remain untraced. [Instructions][builder-instructions], [pseudocode][builder-pseudo].

It calls child builder **`0x1012ce284`** and applies a selected frame with width
**183 coordinate units**, absent explicit height, and center alignment. This
is one constructed component, not evidence that the whole editor or overlay has
that width, and not a physical-pixel assertion.

The builder also retains two concrete conditional routes:

| Decision | Result retained in this function |
| --- | --- |
| Keypath `0x103789e38` yields a byte satisfying `(tag & 0xfe) == 2` | Selects the empty branch of a `ConditionalContent` construction. The test admits raw values 2 and 3. |
| Other first-conditional values | Initializes a local String `State` with `hello world`, constructs projected ViewStore/ObservedObject content, then selects the nonempty branch. This does not prove that literal appears in the UI. |
| A separately projected state flag equals 1 | Selects another empty conditional branch. |
| Other second-conditional values | Extracts an optional URL-derived value, captures callbacks `0x1012d222c/0x1012d2278`, and stores scalar **44** in the constructed value. The scalar's layout meaning is not assigned here. |

These decisions recover actual composition behavior without inventing source
enum-case names. The child view's controls, the URL action and any final overlay
rendering remain in the selected callees.

## The deferred closure points to a small worker and callback

Body closure **`0x1012d1dd0`** is three instructions. It materializes callback
**`0x1012d1ddc`** and tail-branches to capture unwrapper **`0x1012d2238`**.
The decompiled shared path reaches **`0x1012d14b4`**, supplying captured self at
its metadata-aligned context offset and that callback.
[Closure instructions][closure-instructions], [pseudocode][closure-pseudo].

This identifies a deferred action route. It does not yet identify an appearance,
change or hover modifier, or establish native window/overlay creation. Reading
the worker's decision and callback effect is the next functional question.

## Next trace and evidence boundaries

The frozen [six-call continuation](builder-continuation.steps.json) requests
instructions and pseudocode for **`0x1012ce284`**, **`0x1012d14b4`** and
**`0x1012d1ddc`**. [Preparation](builder-continuation-preparation.json) verifies
their exact public function-start entries, existing merged-seed membership and
arguments against the actual catalog. Their indexed intervals are 688, 140 and
40 bytes respectively; intervals are not complete body-ownership assertions.

A separately marked [type-candidate receipt](view-builder-type-candidates.json)
prepares possible names for the metadata arguments `0x104317858` and
`0x104318148`: `BoostsEditorCodeInputPanel` and `BoostsEditorInterstitial`.
Those names depend on an original-file chained-offset interpretation and still
require public loaded-pointer corroboration. They are not used as recovered
feature proof in these findings.

[findings.json](view-builder-findings.json) retains full Evidence IDs, hashes
and scoped decisions; [the interpreter](interpret-view-builder.mjs) reproduces
their consistency checks without a provider. The physical event source, final
native overlay drawing, durable persistence and broader Arc behavior remain
open. No additional REA+ product defect is established.

[builder-instructions]: view-builder-evidence/view-builder-0x1012cd97c-instructions.evidence.json
[builder-pseudo]: view-builder-evidence/view-builder-0x1012cd97c-pseudocode.evidence.json
[closure-instructions]: view-builder-evidence/view-builder-0x1012d1dd0-instructions.evidence.json
[closure-pseudo]: view-builder-evidence/view-builder-0x1012d1dd0-pseudocode.evidence.json
