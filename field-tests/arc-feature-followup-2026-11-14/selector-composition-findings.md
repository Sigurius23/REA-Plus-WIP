# Selector callback binding and overlay composition

**2026-11-14; fixed Arc 1.172.1 / 90370 ARM64 main**, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
These observations come from phases 0–2 of the parent-owned persistent session.
That session is **still open in this receipt**; no final summary, close or
cleanup is claimed. [The audit](selector-composition-audit.json) authenticates
the three immutable phase bundles, containing **3, 7 and 11 cumulative records**,
and eight standalone body records. Their counts overlap and are not summed.
All **1,865 frozen 076 runtime files** match the manifest; no current Java/build
or target execution is used by this interpretation.

## The selector body installs the known point callback

The exact `SelectorPicker.body` witness **`0x1012f0388`** calls content builder
**`0x1012ee328`**. The latter obtains a `State.wrappedValue`, constructs a
SwiftUI **`_ValueActionModifier`**, and stores code **`0x1012f0174`** with a
capture of the selector view into that modifier's output. This connects state
value changes to the previously recovered thunk and point-filter callback
**`0x1012f0028`**; it is a concrete installation edge, beyond merely finding the
callback in the executable. [Witness instructions][picker-witness],
[builder instructions][picker-instructions], [pseudocode][picker-pseudo].

The builder also installs **`0x1012f0218`** with another captured context through
helper **`0x100b080a8`**, then applies **`ColorScheme.light`** to the selected
view composition. That local environment choice is established statically;
the screen's actual appearance is unobserved. The other helper's physical event
role remains untraced. It lies outside the current seed window, so its scoped
procedure-admission query is retained separately from function-body requests.

Visible selector content is delegated to **`0x1012ee7e8`**. Its drawing operations
remain the next question. The earlier filtering still means FRINTA rounding in
coordinate units, not physical pixels.

## The overlay constructs one of two content routes

The exact `BoostsEditorOverlayView.body` witness **`0x1012fa660`** calls
**`0x1012f9da0`**. The content builder reads a projected value through keypath
**`0x10378c7b8`**, invokes an incoming code/context pair with that value and
captures the result in a newly allocated **40-byte** helper. This establishes
data flow into the overlay's selector support; the concrete helper type is not
assigned here. [Witness instructions][overlay-witness],
[content instructions][overlay-instructions], [pseudocode][overlay-pseudo].

A second projected optional value, through **`0x10378c7d8`**, chooses the branch:

| Decision | Constructed route |
| --- | --- |
| Optional value absent | Project a raw byte through `0x10378c7f8`, then call **`0x1012f952c`** with that byte, the helper and callback **`0x1012faf3c`** plus captured overlay. |
| Optional value present | Construct a value containing that optional value, the helper and a `State` initialized to an empty array. |

The final `ConditionalContent` construction references known `SelectorPicker`
conformance **`0x10378be30`** and another conformance **`0x10378c1c0`**. This ties
the selector composition into the overlay but leaves the projected property's
meaning and the other branch's implementation open. Names such as a matcher,
selected selector or query result are not substituted for the untraced state.

## Next evidence

The frozen [eight-request continuation](selector-visual-and-input.steps.json)
follows the installed input callback **`0x1012f0218`**, overlay branch constructor
**`0x1012f952c`** and visual child **`0x1012ee7e8`** with instructions and
pseudocode. It separately queries **`0x100b080a8`** admission and retains 456
loaded bytes without requiring that the partial Program already has a function
there. [Preparation](selector-visual-and-input-preparation.json) validates exact
function starts, seed membership and actual catalog arguments. The three local
targets are seeded; the outside helper is not. No second provider was launched
or continuation file written by this interpretation.

[Machine-readable findings](selector-composition-findings.json) preserve exact
Evidence IDs, file/profile commitments and the open-session boundary. Physical
event production, final rectangle drawing, native window placement, durable
persistence and broader Arc behavior remain open.

[picker-witness]: persistent-selector-evidence/selector-view-SelectorPicker-body-instructions.evidence.json
[picker-instructions]: persistent-selector-evidence/selector-content-SelectorPicker-instructions.evidence.json
[picker-pseudo]: persistent-selector-evidence/selector-content-SelectorPicker-pseudocode.evidence.json
[overlay-witness]: persistent-selector-evidence/selector-view-BoostsEditorOverlayView-body-instructions.evidence.json
[overlay-instructions]: persistent-selector-evidence/selector-content-BoostsEditorOverlayView-instructions.evidence.json
[overlay-pseudo]: persistent-selector-evidence/selector-content-BoostsEditorOverlayView-pseudocode.evidence.json
