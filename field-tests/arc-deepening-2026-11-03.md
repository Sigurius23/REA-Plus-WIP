# Arc analysis continuation and new REA+ issues

Date: **2026-11-03**, Europe/Berlin. Source parent: `cb8ed4db254e55b15dbfd49dc3d955074552a573`.
This pass continues the [prior report](arc-continuation-2026-11-03.md).
Arc, its helpers and its shipped JavaScript were not executed. No account,
profile or service state was accessed. Owned JavaScript was parsed as inert
text; owned Swift libraries were compiled and inspected, never launched.

## Progress on Arc

| Question | Result | Boundary |
| --- | --- | --- |
| What JSON keys does Boost IDE decode? | Exact static getter/initializer code establishes `boostId`, `type`, `data`; the payload key is `contents`. Existing decoder code distinguishes load/edit CSS/JS commands. | Boost lookup, concrete delegate handling and effects remain unresolved. |
| Does native code invoke the selector library? | Recovered routines build `getSelectorCandidates(...)` and `rectsForSelector(...)` and use a shared async evaluation/JSON-decoding bridge. | The concrete evaluator call is indirect; actual runtime activation is unobserved. |
| Where is SelectorPicker loaded? | Native code asks for SelectorPicker.js through Foundation resource lookup and caches its String. The matching shipped file is inside ARC_BoostsEditor.bundle. | Bundle fallback selection is static; actual selected URL was not observed. |
| What happens to selector results? | JavaScript exposes `{selector, matches}` and rectangle records. Native code filters candidate records at 500 and scales rectangle components on return. | JavaScript already filters matches at 100; coordinate-space identity and final rendering remain partial. |
| How are the new helpers activated? | Retained manifest scopes plus callback parameter traces refine Google Docs, Slack, Web Store and Notion conditions. | Extension loader mapping, name substitution and actual activation remain unknown. |
| Who receives Boost commands? | The `uiDelegate` protocol identity is verified as WebContentUIDelegate. | The concrete receiver and its assignment path remain unresolved. |

The wire-key result closes the earlier case-name versus actual-key-spelling
question. A representative derived shape is:

```json
{"boostId":"<string>","type":"v2-edit-css","data":{"contents":"<string>"}}
```

Other decoded command spellings are `v2-load-css`, `v2-edit-js` and `v2-load-js`.
No request was sent. The String-key conclusions use actual implementation
constants/comparisons, not enum labels alone. The `contents` getter needed an
explicit analyst interpretation of six fixed instructions from public bytes;
that is not presented as automatic REA+ String recovery. See
[wire-key findings](arc-deepening-2026-11-03/wire-keys/findings.md).

The selector path now connects native expression construction, JSON escaping,
async result handling and native result processing. The corresponding
[findings ledger](arc-deepening-2026-11-03/native/findings.md) identifies each
function and Evidence record. Function starts were derived from public Mach-O
table bytes and supplied as caller assertions to the existing seed workflow.
The 60-second Ghidra Programs remain partial; procedure absence before seeding
is not source-code absence. Two address-pattern candidates proved unrelated to
selector invocation and were discarded as such.

The Google Docs manifest narrows the helper to its declared document URLs,
frames and document_start timing. The internal extension's host permissions
cover Slack, Chrome Web Store and Notion. Its branding uses the first manifest
name word, while the stored name still includes `<APP_NAME>`; native substitution
is unresolved. Candidate-enabled callback parameter traces advance through local
uses but remain ambiguous. See [activation findings](arc-deepening-2026-11-03/script-activation/findings.md).

## Issues collected in OPEN_TASKS.md

**45 — Return-field provenance stops across an exact local call.** The owned
known-value fixture retains the literal return field, but tracing caller
`result.value` has only 2 nodes / 1 edge and no returned-field/literal source.
The forward field trace reaches the call/result binding and stops. This is a
field-sensitive continuation capability beyond item 44. Exact CLI/MCP Evidence
matches: `ev_ec6c69ba88f8808cf2f8ebaaba61fce4bc4760c403ce24ed3c6ac3febeff424b`.

**46 — Event listeners lack their locally resolvable handler continuation.**
An owned named callback registered on a Node EventEmitter produces registration
and dispatch candidates but no listener-to-handler path. The candidate-enabled
trace is 1 node / 0 edges, with exact CLI/MCP Evidence
`ev_322778863d38b015f35d2b2d2c9da244bc410877e689a8c0c304c47811d3db3d`.
DOM/Chrome-specific event modeling is a broader extension and is not counted
as two additional regressions.

**47 — Swift throwing-call guards can disappear from decompiler-derived flow.**
A source-built owned Decodable witness reproduces Arc's discrepancy: assembly
and machine CFG retain a post-call x21 guard, while pseudocode and high p-code
remove it. The reported convention is already `__swiftcall`; the exact upstream
cause remains open. REA+ preserves the assembly and machine CFG. This is an
interpretation/integration gap, not output truncation or loss of the whole CFG.
See the [owned reproduction](arc-deepening-2026-11-03/swift-error-abi/findings.md)
and receipt; witness Evidence is
`ev_ed7af7ef81e435ae504cf6bfe8cb8aa37aaca115c22b3dd076dbf835f333343c`.

A possible byte-search counting issue was **dismissed**: its schema explicitly
uses `complete` for counting up to 100,000 matches, separately from returned
`max_matches`. The owned repeated-marker fixture confirms that distinction.
No numbered issue was added. Native-macos provider selection and compiler-cache
failures were caller/environment issues, also retained without counting them
as product defects.

## Verification and remaining scope

No REA+ implementation source changed in this pass. The prior 189-test code
verification belongs to the published implementation batch; it was not rerun
for new research notes. This pass uses actual public CLI/MCP outputs, three
exact JavaScript CLI/MCP comparisons, source-built Swift reproduction, canonical
Evidence/bundle authentication and target identity checks.

[Capture summary](arc-deepening-2026-11-03/capture-summary.json) records 106 shared-driver
calls / 95 successes / 11 preserved errors. Most errors are procedure lookups
in partial Programs; the remaining failures are caller/environment boundaries.
Separate native CLI metadata inspections and parity calls are additional.
Native sessions and the successful owned-JavaScript session close with verified
empty descendants. Two historical sandboxed process-lineage snapshots were
unavailable and remain explicitly unverified.

[Evidence audit](arc-deepening-2026-11-03/evidence-audit.json) authenticates the
saved records and complete bundles. [Target integrity](arc-deepening-2026-11-03/target-integrity.json)
rechecks the original inventory of 782 regular files / 860,945,885 bytes.
Raw captures, failed attempts, selector preparation, caller seed provenance and
remaining unknowns are retained. Source-built binaries and Ghidra projects stay
outside Git.

Concrete evaluator/delegate targets, final overlay rendering/coordinate spaces,
extension loader/name substitution, full Boost state transitions and unrelated
Arc subsystems remain open. This is continued feature recovery, not complete
application understanding. Items 45–47 are recorded for repair and are not
claimed fixed by this pass.
