# Boost selector computation follow-up

Scope: shipped `SelectorPicker.js`, reused from authenticated parent
`ev_2b912b006e85b86dad751b5e7bad554cbed02c7df215ac4379748a0bd400f44b`.
The public `import_evidence_bundle` operation imports the prior portable
analysis; the producer was not repeated. Six focused semantic traces follow
the coordinate input, selected-element binding, helper call and returned
fields. All remain partial. No new product defect was reproduced.

## REA+ observations and inferences

The recorded source SHA-256 is
`0e779dad9316f8b14cf4e1b20fa710240cd90bc9a9a1dd820df38ebd525d977d`.
The semantic graph records property writes `getSelectorCandidates` at line 1,
column 9745 and `rectsForSelector` at column 10872. These are property
write observations, not CommonJS/ESM export records. The module's empty export
list therefore does not mean the named property writes are absent.

| Question | REA+ result | Evidence |
| --- | --- | --- |
| Does the coordinate argument reach the implementation? | The parameter at column 9783 reaches two resolved local reads at the x/y access sites. Values and DOM interpretation remain unknown. | `ev_da28f30a05a2fbb056d9eaed5c3f6e889147c146f64ff928bd7d672decabc51a` |
| Can the picked-element local be followed? | The binding at column 9790 reaches 43 resolved relations through ten functions, including read/alias, argument-to-parameter and capture edges. Its initializer remains an unsupported CallExpression value. | `ev_2b9a658b798d8f1544e3941f50cfa04fc7f6a3cbdf1f09f61f3f22594d6487da` |
| Is the candidate helper linked to a caller? | The anonymous helper at columns 9848–10776 has one resolved call site. Fourteen relevant unknowns retain dynamic property indexing, unsupported member calls and unresolved `Map` construction. | `ev_6ea308faf4417c8b5d6f362b0f74757b3e9ac51bb93fe82bb9cdcf2ca8025734` |
| Does the selector argument reach the DOM query boundary? | The rectangle function's parameter at column 10905 reaches its read and argument zero at the `querySelectorAll` call site. This is a static argument flow, not resolved browser execution. | `ev_53b43cfe89a4991440c54f986acfc53a1987c7123225d2a15fe552086b1892a8` |
| Does REA+ reconstruct complete return-value provenance? | Backward queries at the candidate and rectangle object return sites traverse only their seeds, with no dependency edges. Status remains ambiguous and coverage partial; empty unknown arrays do not close that gap. | `ev_0de814914b612737bac9a5acbefe4bb32645821389ade09ac2c4981e2a228a19`, `ev_f01b3b6a92f3e72bc1be1b0e0ced4601092e2403234e490a9da8df69682e824f` |

The retained parent also records property reads `elementFromPoint`,
`querySelectorAll`, `getBoundingClientRect`, `selector`, `matches`, `left`,
`top`, `width` and `height` at exact ranges. `semantic-index.json` is a
harness projection of that authenticated graph, not additional parsing or
recovery. The helper/callback and DOM return boundaries were actually attempted
through public traces. This source is a computation library; no listener
registration relation is present in its semantic graph. That bounded graph
observation does not prove that native code never invokes the library.

## Supplemental inert-source contract

Raw source review is explicitly separate from REA+ recovery. Exact excerpts,
code-unit ranges, original path and hash are retained in
`supplemental-source-review.json`. This review establishes the shipped text:

- `window.getSelectorCandidates({x,y})` calls `document.elementFromPoint`.
  Missing elements return `[]`. Candidate selector strings are generated and
  deduplicated, candidates with more than 100 matches are filtered, selected
  candidates sort by ascending match count, and the result contains
  `{selector,matches}` pairs.
- `window.rectsForSelector(selector)` queries all matching elements and maps
  their `getBoundingClientRect` values to `{x:left,y:top,width,height}`.

These text observations explain the intended input/output contract but do not
fill missing REA+ return-shape or DOM semantic fields. No selected DOM element,
selector quality, actual rectangle, coordinate transform, visible overlay or
user interaction was measured. Injection timing and the native caller/rendering
path require evidence outside this worker's scope.

## Verification

Eight public calls succeed: one portable-bundle import, six traces and one real
export. Each validates its actual advertised input/output JSON schemas, named
contract, text/structured equality and canonical Evidence. The export contains
14 authenticated records, including the imported parent and earlier results;
this is not 14 newly produced analyses. The source hash is unchanged. The
worker closes its MCP client/transport and reports verified ownership with an
empty live-descendant snapshot.

`verification-receipt.json` records the exact queries, counts, unknowns, bundle
hash and cleanup result. Re-run the recording-only audit from the repository
root with:

```sh
node field-tests/arc-feature-followup-2026-11-02/selector/verify-recordings.mjs
```

This validates existing records without executing providers or Arc. No
production code, shared registry, commit or push was changed by this worker.
