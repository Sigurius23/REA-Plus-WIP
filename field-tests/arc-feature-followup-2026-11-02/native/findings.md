# Arc native feature follow-up

This pass follows the earlier caller-established Boost/gallery/sidebar paths
through public REA+ operations. The original universal executable and exact
arm64 slice retain the identities in `../run-context.json`. All three Ghidra
bindings use the explicit 60-second bounded profile and report
`analysis_complete=false; analysis_timed_out=true`. Counts and absence claims
apply to those stable partial Programs.

The root binding admits twelve function-entry assertions from prior call
Evidence. `context/` reads typed layouts, exact instructions and bytes;
`case-code/` adds one **code** seed at an instruction-established case target.
No case label is asserted to be an independent function. Inputs, provenance,
complete replies, actual schemas and three real session exports are retained.
No Arc executable, resource code, UI, account, profile or service was run.

## Gallery: a concrete URL and action

The earlier `openBoostGallery:` wrapper supplies callback `0x100231f00`.
That callback checks `_viewStore`, passes **`0xc4`** to helper `0x1005a44b4`,
then calls `_swift_storeEnumTagMultiPayload` with **`0x20`** before sending
through `0x1008449c4`. The earlier callback Evidence is
`ev_7c7c81951cf467efe48f85163f2744c4a02a1688396dcad625575aac7632b00e`.

The new helper dossier
`ev_8f2311e359556c225fafadf4f8e3c91a3122ca117a6d6ed0d992958587a3a129`
does not resolve the computed branch selected by `0xc4`. The ten separately
reported switch mappings belong to another dispatch. Its actual owning body
has **2,100 bytes in five ranges**, inside a 5,256-byte span; those ranges do
not include the case selected by this input. Pseudocode warnings and body
coverage remain visible.

The concrete branch can nevertheless be followed without inventing function
boundaries. Instructions select table entry `0x1005a5974`, whose public bytes
contain signed displacement **1,412**. Adding the observed base `0x1005a4bd4`
gives **`0x1005a5158`**. Initially that address has no defined instruction.
The existing code-seed workflow successfully defines code there. Twenty
instructions then show the string address, length **34**, a call to
Foundation's URL string initializer and its unwrap check. The exact returned
bytes at `0x1039a4c80` are:

```text
https://arc.net/boosts?ref=arc-app
```

This is a static input-to-URL derivation; the URL was not fetched. The case
seed leaves the original function's 2,100-byte body unchanged. It makes the
specific branch inspectable and does not claim a complete repaired switch.
The arithmetic, seed authority, instructions and URL bytes are retained in
`context/value-derivations.json`, `case-code/seed-provenance.json`, and the
`gallery-c4-*` records.

The callback's type accessor points to a typed enum descriptor. Its observed
context/field layouts and relative pointers lead to name **`AppAction`** and
field record **32**, **`openExternalURL`**. The metadata name records are
`ev_428c965ae25b09ffab6603c4ff696040470d8aab29a8b12eca6e45592661168b`
and `ev_625d2e928a6151b7e77ebeb9a3d5b1195241948d1c0480144f0cc5839e7cdcd2`.
Together with the callback's tag, these support the static interpretation that
the gallery callback constructs this URL and dispatches
`AppAction.openExternalURL`. This interpretation is analyst inference from
public bytes/layouts and instructions, not an invented automatic semantic field.

The final send helper
`ev_f09f2dc69d79d5a1e59cccb781423af00523791aa567d0f08bedb97144d755ae`
loads a code pointer at context offset **0x28** and its context at **0x30**, then
invokes them. This is consistent with a Swift closure pair. The concrete
runtime closure, subsequent reducer, window/browser choice and actual
navigation remain unresolved. A vtable/witness-slot claim would overstate it.

## Boost IDE: request cases and response boundary

The earlier `boostIDE:didRequestExecuteCommand:jsonString:` wrapper bridges
strings and calls `0x100537fac`. The helper calls `JSONDecoder.decode` with
metadata `0x1041fd9f0` and a witness returned by accessor `0x100538778`.
The new witness dossier
`ev_023600793aa607a22dc0fe8fc3a56f6b51df819d5ae851f8fead41d501688c95`
preserves its cache check and `_swift_getWitnessTable` call. Its decompiler's
default `void` return is not the reliable machine-level contract; the caller
uses the returned register.

Exact metadata bytes lead to the typed descriptor at `0x103ce16e4`. Public
Ghidra context/field layouts establish the relative-name interpretation, then
public byte reads recover **`BoostIDERequest`** and its four field labels:

- `loadCSS`
- `editCSS`
- `loadJS`
- `editJS`

These are declared enum-case names, not established wire JSON keys or proof of
successful CSS/JavaScript application. Their full Evidence is in
`context/command-name-bytes.evidence.json` and
`context/command-field-name-{0,1,2,3}.evidence.json`. The pointer calculations
and layout checks are explicit in `context/descriptor-derivations.json`,
`context/value-derivations.json` and `verify-recordings.mjs`.

The caller assembly also retains a decode-error branch removed from its
pseudocode: after the error-register test, it obtains `localizedDescription`,
builds a payload with byte **2** and invokes `0x1005718fc`. The response helper
`ev_e1619ef5265f57b312896ce3c70660d54ebcf457e3ad0a68a29fdc7675cfff3f`
uses `JSONEncoder.encode`, bridges strings, and selects one of two Objective-C
stubs based on that byte. Exact stub/slot/string observations resolve them to
**`sendErrorResponse:jsonString:`** and **`sendResponse:jsonString:`**
(`ev_0c6efeeb4b04c6198a448ec2a6f614b59dca2723fa8a3532c2cea9ef48ec3e49`,
`ev_c1d201cde92ec360d1f8cebf931d296ca6dedf2af1b6baef0fc68f50bde791f5`).
This establishes a static response boundary, not an observed response.

Concrete request decoding rules, associated payload types, delegate target at
offset `0x100`, command implementations and actual error text remain open.
The decompiler's unreachable-block and calling-convention warnings are not
discarded in favor of a source-like summary.

## Sidebar: window and hit-test decisions

The existing cursor routine calls an eight-byte helper, which moves its
context into an argument register and tail-calls `0x1009f8cdc`. Its return low
bit chooses between the recovered `resizeLeftRightCursor` path and the
fallback. The new state-helper record
`ev_6d474d497ba95e13cdee769971d4d18a8a1ec8103c5f91c464578ee54cf5f6f7`
has a default, low-confidence `void/_NSZone*` signature. Assembly actually
materializes boolean values consumed by the caller; the signature does not
establish the original application API.

Public instruction/slot/byte observations identify these messages within the
decision: **`window`**, **`childWindows`**, **`orderedIndex`**, **`contentView`**,
**`mouseLocationOutsideOfEventStream`**, **`hitTest:`** and
**`isDescendantOf:`**. The assembly retains window collection/filtering,
object comparisons, an input flag and branches on the returned hit-test/view
results. This supports a window/view hit-test interpretation, rather than a
generic settings flag. Exact window ordering, exclusions and runtime hit
regions are not established by selector names alone.

Three metadata-established methods (`init`, `layout`, `updateLayer`) are also
inspected. Their wrappers lead to additional helpers; they do not expose full
layout or styling decisions. The focused value trace is explicitly partial,
with call-depth unknowns. No cursor appearance, geometry or live pointer
interaction was measured.

## Attempted recovery boundary and verification

A related owned Swift nested-enum fixture tests the suspected general
case/body gap. With and without debug information, **default-complete**,
unseeded Ghidra produces a contiguous **20,020-byte** body and all returned
signed-word table targets lie within it. This is a **non-reproduction** of the
Arc owning-body gap; it does not establish a general REA+ defect or a regression
of item 37. The fixture still has switch warnings, and perfect source recovery
is not claimed. Source, compiler flags and authentic exports are in
[`../selector/native-fixture/`](../selector/native-fixture/).

The recorder-only audit validates **138 successful public calls**, three
actual exported bundles, advertised schemas/named contracts, canonical
Evidence and text/structured equality. It checks the quoted byte/layout
arithmetic, field labels, concrete case instructions and URL. All three native
sessions close with verified ownership and empty live-descendant snapshots.
See `verification-receipt.json`; run with:

```sh
node field-tests/arc-feature-followup-2026-11-02/native/verify-recordings.mjs
```

This report distinguishes successful individual observations from complete
feature recovery. Runtime closure/delegate values, remaining native helpers,
layout/animation and final UI/network effects are still unknown.

## Longer-analysis comparison — 2026-11-03

A fourth binding uses the same twelve function-seed bytes, no case-code seed,
and raises auto-analysis to **300 seconds** (startup allowance 600 seconds).
It observes 48,244 procedures / 213,501 defined strings and a **2,932-byte**
gallery body, compared with 2,100 at 60 seconds. The Program still reports
`analysis_complete=false; analysis_timed_out=true`; its second computed
dispatch remains unresolved. More body code is retained, but this does not
establish completed analysis or a generally reproducible recovery bug.

Six further successful calls export two records and close with verified empty
descendants. `verify-recordings.mjs` now includes this comparison: **144 calls /
128 bundle record occurrences**, with separate 60-/300-second limits. The
comparison input, seed digest and complete results are in `longer-analysis/`.
