# Final supplemental interpretation — 2026-11-22

This addendum follows the independent restore/preview reviews without changing
their saved bytes. Their earlier pending questions remain historical. Root
completed the official ABI binding and concrete preview-method queries after
the reviewers reached their usage limits. All findings concern the immutable
Arc 1.172.1/build 90370 ARM64 input, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

## Preview witness and concrete operation

The complete selected `ADKClient.getWebContents` field has type
`(WebContentFrameIdentifier) -> (any WebContent)?`. Public symbolic references
bind the exact protocol descriptor `0x103d3fa38`, rather than a same-name
guess. Raw instructions close the returned pair's path through the saved
capture and child async frame to both handlers. The second word is distinct
from separately obtained object metadata.

The official Swift ABI definitions resolve the independent review's final
class-constraint premise: protocol kind-specific bit zero has the
class-constraint enum's zero value for a class-bound protocol. The selected
descriptor's kind-specific flags are zero. Under the ordinary native Swift
ABI and valid returned storage, the pair is object/witness, and `+0x2e8` is
protocol-witness dispatch. Requirement index 92 has flags `0x11`, indicating
an instance method, with no default target. These flags supply neither its
source name nor its whole signature. See the [official ABI header](https://github.com/swiftlang/swift/blob/main/include/swift/ABI/MetadataValues.h)
and the local [retrieval/hash receipt](swift-abi-authority.json). This does not
identify Arc's exact compiler source revision.

Public native metadata binds two observed local conformances to that exact
protocol descriptor:

| Conformance | Witness table | Word 93 / byte +0x2e8 target |
| --- | --- | --- |
| WebContentChromium | `0x104266700` | `0x10054bbf4` |
| StubWebContent | `0x104268a60` | `0x100006b90` |

The Chromium target loads an object using the stored offset value 104,
captures the supplied Swift callback/context in an Objective-C block, and
calls **`captureViewport:`** with that block. Stub, selector-slot and CString
observations bind the selector; it is not a method name inferred from witness
position. The block's exact signature is `v16@?0@"NSImage"8`. Its invoke body
`0x1004b942c` forwards the image argument to the captured Swift callback.
The selected checked-continuation payload is separately bound as `NSImage?`.

The modern callback `0x1012bb950` now has public byte evidence for its branch
to `0x1012bb254`, which branches to `0x1012bb2bc`. Their addresses remain
distinct even though these paths converge. The Stub target is just `ret` and
contains no callback invocation. Neither static alternative establishes the
implementation actually selected at runtime, callback delivery or pixels.

The 5,000-record discovery budget admits both named matches after examining
all 22,066 index entries, but identity processing is partial: 19,481 entries
remain unclassified and 944 unresolved records are retained. This is not an
exhaustive list of implementations. Exact pointer identities and the selected
word 93 are positively decoded despite broader partial coverage.

Additional class reflection binds field 7 as `webView: ArcWebContents`.
However, the class metadata cache is zero in this nonexecuted Program; this
pass does not bind its field-offset vector to the specific receiver load.
The selector/block/callback conclusions do not depend on promoting that field
name into a proved concrete receiver assignment.

## Restore rule and remaining boundary

The independent [restore resolution](restore-resolution.md) establishes a
stable descending sort of `date ?? Date.distantPast`, preserving directory
enumeration order for equal normalized keys. Date selection prefers the
formatter parse and then a creation-date attribute. Nil does not necessarily
sort below every possible real Date: an actual `distantPast` ties with nil.
There is no lexical filename or modification-time tie-break in the comparator.

Eligibility uses the original basename as a prefix and marks a candidate as
backup when its basename after deleting one extension differs. Date validity
does not itself exclude an eligible backup. The selected restore leaf tries
eligible sorted records, discards each read error, and returns the first
present successfully decoded value, otherwise none. Its queue callback adds
no save. A higher invoking application caller and later writeback remain open.

The complete suffix-collection mangling is now retained in public Evidence,
including its terminator. The three `address_name` queries for imported
collection/attribute slots return null. They do not authenticate imported type
identities. Exact character-order interpretation of this suffix construction
therefore stays qualified; the sort/date-fallback conclusions above do not
require that additional type interpretation.

## Capture and tool findings

The first session has 199 successful replies, then a continuation timeout;
the corrected recorder accurately reports failure/partial completion. Its
phase-7 export contains all its Evidence. The late phase-8 plan did not run
there. A fresh 28-call session performs the supplemental reads, final export
and two explicit closes. Both owned process lineages are verified empty.

No new production REA+ defect is established here. Item 66's timeout fix
behaves as intended. Null symbols and partial metadata budgets are retained
as limited observations. Production sources and the qualified frozen runtime
are unchanged. The source-check/package/native-matrix results from earlier
code checkpoints are not presented as newly rerun results.

The [fact index](fact-index.json), [capture verification](capture-verification.json)
and [historical snapshot verification](history-verification.json) bind these
claims to exact source records. Arc, its helpers and shipped scripts were
never executed; no accounts, profiles, services or UI were used.
