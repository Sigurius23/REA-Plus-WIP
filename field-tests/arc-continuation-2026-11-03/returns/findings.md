# Return-flow diagnosis — 2026-11-03

The earlier SelectorPicker zero-edge return traces did **not** establish a
missing-return producer bug. Both return sites already have candidate incoming
relations, which the default query excludes. Enabling that supported option
recovers their coarse input provenance. A separate, narrower limitation remains:
the companion semantic graph does not represent returned-object field
dependencies, even when the source property and returned value are statically
known. Shapes and field-sensitive provenance are different outputs.

## 1. Prior Arc queries: candidate filtering

The original complete parent is reused without reanalysis:
`ev_2b912b006e85b86dad751b5e7bad554cbed02c7df215ac4379748a0bd400f44b`.
The two original return seeds are unchanged. Their retained graph already
contains two candidate `aliases` edges into the `{selector,matches}` return
site, and four into the rectangle return site.

The actual query contract defaults `include_ambiguous_dynamic_edges` to false.
`javascriptSemanticQuery.ts:128–132` filters every candidate relation, including
these static return aliases, before traversal. The option's name is broader in
effect than dynamic calls alone. The original results correctly report
ambiguous/partial status and a candidate-relations limitation; their empty
unknown arrays are not completeness claims.

Public queries with that option explicitly true produce:

| Arc seed | Result | Evidence |
| --- | --- | --- |
| Candidate result, columns 10822–10867 | 5 nodes / 5 relations; 2 candidate aliases retained | `ev_d7aad640fdbf4bb99d973800eb31f1e3c4fab4aaa0a10bf3316609ca02c2c8cc` |
| Rectangle result, columns 11005–11059 | 8 nodes / 10 relations; candidate relations retained | `ev_6e6f5735cf8bb8a3b26b6596559b27dbf7cf2241e4eef3a3c59a5724216f2f78` |

Both remain ambiguous and partial. The candidate query reaches the `e` input
parameter; the rectangle query reaches the local `t` binding whose initializer
is `getBoundingClientRect`. Its unsupported CallExpression value remains an
actual boundary. No DOM return, field value, callback execution, rectangle or
visible rendering has been observed.

## 2. Explicit and implicit object returns are retained

The inert owned `fixture/returns.js` supplies explicit block-arrow and implicit
arrow object returns, an identifier-return control and a bound-object variant.
It is parsed, never executed. Public application Evidence is
`ev_05c2bb952e648e4c981e0776720d30dcd0d0fb19fed90c1171d8afc93d33ec92`.

Both object-return arrows retain an exported return shape with `/output`
**present**, complete property inventory and an explicitly unknown field value.
The input parameter is not a known constant; this is not a lost property or
missing implicit-arrow return. The bound-object variant truthfully reports
possible reference mutation rather than inventing a literal value.

The explicit/implicit return-site queries each return only the seed by default,
then **8 nodes / 7 relations** with candidates enabled. The simple
`input => input` control returns **8 nodes / 7 resolved relations** by default.
This matches the producer's deliberate alias rule: direct returned identifiers
can be resolved identity aliases, whereas references embedded inside an object
literal are conservative candidate aliases to the aggregate.

## 3. A field-sensitive projection is not present

To remove the unknown-parameter and DOM confounds, `fixture-known/known.js`
contains only:

```js
export function known() {
  const input = { value: "known" };
  return { output: input.value };
}
```

The public producer
`ev_1d40297e3298503fe2de5923c2fadf027a7635de0ec6992259722cff4c6eb75d`
recovers `/output` with the literal value **`"known"`** and complete own-property
inventory. The companion graph records the input `/value` slot as **present /
literal**. Nevertheless, a forward query from that exact property-slot node,
with candidates enabled and an expected return-site sink, reaches only the
slot and its read expression: **2 nodes / 1 resolved relation / zero unknowns /
no matching sink**. Evidence:
`ev_2f82510c5afb6d2c03a0532c40015cff6e7f3b1f90cbbe56d0017da8bc04497a`.
The whole-return backward query instead reaches the aggregate input binding
through a candidate alias; it does not retain the property path:
`ev_490423b35e466024aafc52984e2ad64d5019174a60ff51537e9090ef04960fe4`.

The first fixture also has no `output` property-slot seed in its semantic graph,
despite its application graph's retained `/output` return-shape observations.
That is a representation/capability boundary in the companion data-flow graph,
not evidence that `/output` is absent or that return-shape analysis failed.
All query coverage remains partial and the full graph reports no resource
omissions; increasing a node budget or including candidates cannot supply this
missing field-specific relation.

## Producing ownership and possible design

The existing architecture graph was queried for ownership; it contains only
limited pre-extension source/module context. The following conclusions come
from the actual producing implementation, not invented graph edges:

- `javascriptSemanticCallableResults.ts` already collects explicit returns and
  implicit arrow bodies while excluding nested callable returns.
- `javascriptSemanticReturns.ts:55–68` retains each return value's constant
  lattice and only gives a direct identifier an `identityReferenceLocation`.
  `JavaScriptSemanticReturnSite` has no per-return-field dependency record.
- `JavaScriptSemanticGraphFlowProjection.ts:204–220` links identifier-reference
  nodes inside the return range to the whole return site, using candidate
  aliases except for the direct identifier case. It does not link a member-read
  expression to a returned property or preserve output property paths.
- `JavaScriptSemanticGraphBuilder.ts:532–540` creates return-site nodes without
  projecting their known return-value shape. Export return shapes are projected
  separately by `javascriptExportReturnShapeProjection.ts`.

No default-query behavior should be changed merely to make the original Arc
trace larger. In particular, candidate aliases must not become resolved whole
object identity aliases. A workflow improvement can first teach the existing
candidate option when a trace reports ambiguity with no traversed edges.

If field-sensitive return provenance is the desired capability, implement it
at the return producer and graph projection owner: retain explicit output
JSON-pointer paths, source expression/property-reference ranges, and the value
or uncertainty already known for each own returned field. Project typed
return-field dependencies rather than treating the aggregate return object as
identical to its input. Reuse existing shape flattening and node/edge budget
ownership; report omitted fields explicitly. A useful first profile can cover
direct static-key object returns for both arrow forms, while computed keys,
spreads, mutation and dynamic calls retain their existing uncertainty.

Internal/non-exported callbacks would additionally benefit from projecting
their already retained return shape onto return-site nodes. That is an additive
projection; the current exported-callable shape result is already correct.
No production change, new numbered issue or shared-document edit is made by
this diagnosis.

## Verification and limits

Two sessions complete **17/17 public MCP calls** with actual catalog schemas,
named output contracts, canonical Evidence validation and text/structured
equality. Both perform real portable exports and report verified ownership
with empty live descendants after closing their clients/transports. The
explicit input-field forward trace also returns exactly identical complete
public CLI/MCP Evidence:
`ev_ecd2d84bbb69ba12caa4b763b1fcfe991647da715d0f0aab62460e7777a9dd8b`.

`verification-receipt.json` authenticates both exported bundles, fixture hashes,
the CLI parity result and the reviewed producer-source hashes. `inputs.json`
and both continuation files retain exact queries. This pass does not execute
Arc, fixture JavaScript, UI, DOM, profiles, endpoints or services. No real
runtime result or complete application understanding is established.

## After-fix verification

This diagnosis is a preserved pre-fix snapshot. Item 44 is now implemented and its compiled public verification is recorded in [after/findings.md](after/findings.md), with fresh Arc producer Evidence, controls, exact CLI/MCP parity, unchanged legacy traces, complete exports and cleanup receipts.
