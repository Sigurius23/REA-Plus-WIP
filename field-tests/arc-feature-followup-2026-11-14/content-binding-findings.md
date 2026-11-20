# Arc content identity and deferred action binding

**2026-11-14; Arc 1.172.1 / 90370**, fixed main SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The completed builder-continuation batch records **15/15 public calls**, twelve
canonical Evidence records, explicit close in **786 ms** and verified empty
descendants. The [audit](content-binding-audit.json) authenticates those records
and their bundle using the content-verified frozen 076 runtime, with all
**1,865 manifest files** matching. No Arc execution or mutable current Java/build
validation was performed.

## The deferred callback produces a store action

Worker **`0x1012d14b4`** obtains the view-store object through captured-view
metadata, invokes the supplied callback into a stack buffer, copies the produced
value and hands it to the already recovered **`0x1008492c0`** send route.
[Worker instructions][worker], [pseudocode][worker-pseudo].

The selected callback **`0x1012d1ddc`** zeros offsets **`0x00..0x97`** and writes
**`0xb0000000`** at **`+0x98`**, producing the 156-byte value copied by that
worker. This closes the deferred closure's local action-production effect.
It does not identify the source action case or its reducer effects, and the
modifier/event that invokes the closure remains unproved.
[Callback instructions][callback].

## Loaded pointers corroborate the two content types

Six public loaded-byte reads resolve the earlier source-preparation candidates:

| Metadata argument | Loaded descriptor | Local type name |
| --- | --- | --- |
| `0x104317858` | `0x103d7b380` | `BoostsEditorCodeInputPanel` |
| `0x104318148` | `0x103d7b588` | `BoostsEditorInterstitial` |

Both metadata kinds are `0x200`; both nominal descriptors are structs. Their
signed-relative name fields reach separately read, exact UTF-8 names.
[Panel metadata][panel-metadata], [descriptor][panel-descriptor], [name][panel-name];
[interstitial metadata][interstitial-metadata], [descriptor][interstitial-descriptor],
[name][interstitial-name]. These are static content-type associations, not live
instances or proof that a particular branch was displayed.

The further child builder **`0x1012ce284`** delegates header/content construction
to **`0x1012ce534`** and **`0x1012ce7d4`**. Its selected layout uses center
horizontal alignment, spacing **15**, padding **18** on all edges, and a
top-aligned flexible frame with maximum height **+infinity**. Values are in
coordinate units; available size and final rendering remain unobserved.
[Child instructions][child], [pseudocode][child-pseudo].

## Direct selector and overlay entry points

To avoid expanding unrelated control branches, a checked fixed-image type-index
selection prepared exact identities for `SelectorPicker`,
`BoostsEditorOverlayView` and `BoostsEditorOverlayController`. Subsequent public
metadata observations identify these static SwiftUI body requirements:

| Type | Conformance | Body implementation |
| --- | --- | --- |
| `SelectorPicker` | `0x10378be30` | `0x1012f0388` |
| `BoostsEditorOverlayView` | `0x10378c668` | `0x1012fa660` |

Both retain `runtime_witness_table: not_instantiated`. The selected overlay
controller query resolves metadata word slot **29** to **`0x1012f8bdc`**; its
meaning is untraced, and the word slot is not a source method ordinal.
[Selector metadata][selector], [overlay metadata][overlay], [controller][controller].

The [phase-0 receipt](selector-discovery-findings.json) authenticates only those
three records and their phase bundle. The parent-owned persistent session is
still open in that receipt: **no final summary, close or cleanup is claimed**.
The validated [body request set](selector-views.steps.json) follows the two
actual implementations; the subsequent
[content request set](selector-content.steps.json) follows their positive
machine-call targets, **`0x1012ee328`** and **`0x1012f9da0`**. The latter's
[preparation](selector-content-preparation.json) authenticates the phase-1 bundle
and proves those direct calls, function-start entries and seed membership.

Final event registration, native overlay drawing and durable Boost persistence
remain open. [Machine-readable findings](content-binding-findings.json) preserve
the exact decisions and evidence identities without assigning unproved action
or modifier names.

[worker]: builder-continuation-evidence/builder-continuation-0x1012d14b4-instructions.evidence.json
[worker-pseudo]: builder-continuation-evidence/builder-continuation-0x1012d14b4-pseudocode.evidence.json
[callback]: builder-continuation-evidence/builder-continuation-0x1012d1ddc-instructions.evidence.json
[panel-metadata]: builder-continuation-evidence/candidate-0-metadata.evidence.json
[panel-descriptor]: builder-continuation-evidence/candidate-0-descriptor.evidence.json
[panel-name]: builder-continuation-evidence/candidate-0-type-name.evidence.json
[interstitial-metadata]: builder-continuation-evidence/candidate-1-metadata.evidence.json
[interstitial-descriptor]: builder-continuation-evidence/candidate-1-descriptor.evidence.json
[interstitial-name]: builder-continuation-evidence/candidate-1-type-name.evidence.json
[child]: builder-continuation-evidence/builder-continuation-0x1012ce284-instructions.evidence.json
[child-pseudo]: builder-continuation-evidence/builder-continuation-0x1012ce284-pseudocode.evidence.json
[selector]: persistent-selector-evidence/selector-discovery-SelectorPicker.evidence.json
[overlay]: persistent-selector-evidence/selector-discovery-BoostsEditorOverlayView.evidence.json
[controller]: persistent-selector-evidence/selector-discovery-overlay-controller.evidence.json
