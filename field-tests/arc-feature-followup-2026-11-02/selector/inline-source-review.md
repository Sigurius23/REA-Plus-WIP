# Item 41 inline-source review

Read-only review of the source-green item 41 diff. The pre-extension graphify
graph was queried first for ownership, using graph-vocabulary terms `source
identity range html script module document resolve omission worker count`.
That graph identifies the reconstruction/analysis, graph-document projection,
path-resolution and worker-protocol owners; the changed implementation itself
was then read directly. No build, gate or production edit was performed.

## Resolved finding

**[P2] Retain prepared HTML metadata when earlier source analysis interrupts — resolved.**

At the initial, pre-fix reviewed revision,
`rea-local/src/application/javascript/JavaScriptArtifactAnalysis.ts:278–285`
adds unexamined physical files after a timeout/cancellation with `file`, null
JavaScript/semantic results and an analysis failure, but omits the already
computed `prepared.html.get(file.path)`. The catch path at lines 245–255 has
the same omission for the current file. Normal HTML processing attaches that
metadata in `analyzeArtifactFileSteps`.

This loses a completed observation rather than an unexamined analysis result.
The preparation phase has already parsed every selected HTML document and
counted admitted, omitted and unterminated bodies. On interruption, parent
limitations still contain those counts, but the resulting file record does
not. `javascriptFileStatusView.ts:240–246` admits an HTML row only when its
`html_inline_sources` metadata exists and its body count is positive. The
compact page therefore drops the affected document and its known inline
admission/unsupported issues. The same missing metadata can also suppress the
inline-only document role in `JavaScriptArtifactGraphDocuments.ts`.

A deterministic in-memory probe of the compiled producing boundary confirms
the loss. Inputs are `a.js` followed by `b.html` containing two nonempty script
bodies; preparation uses `max_inline_scripts: 0`. A boundary stub returns
`AnalysisTimeoutError` on the first JavaScript source. The observed result is:

```json
{
  "prepared_html": {
    "inline_script_count": 2,
    "omitted_inline_scripts": 2,
    "inline_script_budget": 0
  },
  "result_files": [
    {"path": "a.js", "html": null, "failure": "provider_timeout"},
    {"path": "b.html", "html": null, "failure": "provider_timeout"}
  ]
}
```

The parent still says `b.html: 2 inline script bodies were not admitted by
max_inline_scripts (0)`. This probe verifies producing representation behavior;
it does not establish a real worker timeout, which was deliberately stubbed.
It executes REA+ analysis functions on inert owned strings, not the supplied
JavaScript.

The recommended correction was to preserve prepared HTML metadata on all
result-file construction paths and pin the resulting status row's admission
and unsupported-body observations across interruption.

### Resolution confirmed — 2026-11-03

Inspection confirms both interrupted constructors now read
`state.html.get(file.path)` and attach its existing map entry: the catch path
at current `JavaScriptArtifactAnalysis.ts:246–251`, and the unexamined-source
path at lines 282–287. The fix retains the original prepared representation;
it does not manufacture a new observation after interruption.

The two new parameterized boundary regressions in
`JavaScriptArtifactAnalysisOrder.test.ts` cover an earlier worker-result timeout
with omitted bodies and a throw immediately before the current HTML document,
including retention of its already observed unterminated body. Root reports
both failed before the correction and the final seven-file lane passes 166
tests; this reviewer inspected those test paths without rerunning a gate.

The actual public 1 ms timeout capture
`../resources/post-fix/interruption/timeout-html-statuses.evidence.json`,
Evidence `ev_d1c3bd5a2f3bafe61f8cb0cbf1911f8c67aeac4ecd7b3aaf68482b5fa37c949a`,
now includes `index.html` as an `html-document` row with both its analysis
failure and `admit-html-inline-scripts` issue, preserving **total 2 / omitted
2 / budget 0**. This observed public projection addresses the reported effect.

The counter documentation also now states that `parsed_inline_scripts` counts
retained parse outcomes, including failures recorded separately; this matches
the actual counting rule. The P2 is closed, with no remaining actionable
finding from this bounded review.

## Other reviewed areas

No additional actionable finding was identified in the checked paths:

- Derived sources have explicit logical URIs, body hashes and original HTML
  identity/range provenance; they are not invented physical inventory entries.
- Classic and module bodies select distinct parser source types, and classic
  source-module labels remain independent of Node-like syntax.
- Reconstruction statistics distinguish physical JavaScript files from inline
  units. The historical statistics schema preserves absent inline counts.
- Inline import, worker and source-map references use the original document
  and base context. Bare imports and Node require relationships are not
  resolved through fabricated inline filesystem paths.
- Worker requests bind URI/provenance and body/text hashes. The server verifies
  transferred byte length and UTF-16 range length before analysis.
- Normal-completion admission omissions and unterminated-body cases retain
  partial coverage and named limits. The finding above concerns interruption
  retention, not their normal path.

These are bounded source-review conclusions, not a claim that every HTML,
parser or provider behavior has been verified. Root owns the real public Arc,
legacy Evidence and gate verification.
