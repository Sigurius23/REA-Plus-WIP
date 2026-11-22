# Arc restore and preview follow-up — 2026-11-22

Two selected static gaps are now closed: **backup restore ordering** and the
**Chromium preview capture operation**. This is progress on the fixed Arc
1.172.1/build 90370 DMG investigation, not completion of the whole browser.

Restore sorts by descending `date ?? Date.distantPast`, stably preserving
directory enumeration order for equal keys. It returns the first eligible
backup that decodes successfully. It does not construct a filename tie-break,
and neither the selected restore leaf nor its queue callback requests a save.
A higher invoking application caller and any later writeback remain open.

Preview's selected client field returns `WebContent?` for a
`WebContentFrameIdentifier`. Its result pair reaches a protocol witness call;
two observed local conformances bind the exact protocol descriptor. The
Chromium implementation calls **`captureViewport:`**, passing a block whose
signature declares an `NSImage` argument and forwards it to the Swift callback.
The selected continuation payload is `NSImage?`. The other observed
implementation is a return stub. Active implementation selection and actual
image pixels are unobserved.

Read the [final supplemental interpretation](arc-restore-preview-2026-11-22/analysis-addendum.md)
first. It resolves the earlier independent preview review's pending Swift ABI
premise using the [official Swift ABI header](https://github.com/swiftlang/swift/blob/main/include/swift/ABI/MetadataValues.h)
and the [retrieval receipt](arc-restore-preview-2026-11-22/swift-abi-authority.json).
It also preserves narrower boundaries: partial conformance discovery, the
unbound concrete receiver field, suffix collection imports, runtime dependency
selection, higher restore callers and writeback.

Verification covers **227/227 successful public MCP replies** across two
sessions. The first session correctly reports partial/failure after its idle
timeout; all 199 replies and its final available export remain intact. The
fresh follow-up has 28 replies, final export, two explicit closes and verified
empty owned lineage. Both lineages are verified empty. Advertised schemas,
named canonical contracts, Evidence IDs, target identity, exported membership,
original instruction bytes and unchanged runtime/source hashes are rechecked.
See [capture verification](arc-restore-preview-2026-11-22/capture-verification.json),
[fact index](arc-restore-preview-2026-11-22/fact-index.json) and
[historical verification](arc-restore-preview-2026-11-22/history-verification.json).

No new production defect was established. Item 66's recorder correction handles
the timeout accurately. Production sources and the 1,869-file frozen runtime
are unchanged; no new producer/package/native-matrix qualification is claimed.
Arc, its helpers and shipped scripts were not executed.

Still open: item 63's safe invocation-scoped typed dispatch, complete apply/UI
effects and broader browser routes, selected higher restore caller/writeback,
active dependencies and actual I/O/pixels. Earlier captures and independent
reviews remain byte-identical; the new interpretation is additive.
