# Arc callback and local-store checkpoint

Read [the report](../arc-callbacks-2026-11-21.md), then `fact-index.json`,
`capture-verification.json` and `source-verification.json`. Source bindings
preserve original public Evidence IDs and file hashes. These static selected
paths do not establish runtime injection, completed effects or durable state.

The four independent `js-activation-*.md/json` reviews are successive immutable
notes. Read `js-activation-two-writes.md` for the latest interpretation: the
new-insertion path merges an inactive temporary and, after success, merges
the original model. Earlier named gaps are resolved by later bodies, without
rewriting the earlier reviews.

## Sessions

- `mcp`: editor effects, getter/codec and static metadata, 137 successful calls.
- `mcp-storage`: predicate/Set, codec and store metadata, 97 successful calls.
- `mcp-finish`: typed factory/continuations, 71 successful calls before a
  duplicate-label assertion stopped the field-test driver. The session remains
  **failed**, with verified cleanup. Six call records follow its last bundle;
  their Evidence and original public replies remain retained separately.
- `mcp-leaf`: source-bound store closures and primary merge exits, including
  two retained admission-error replies for one unadmitted interior branch.
- `mcp-io`: source-bound JSON read/write helpers and file replacement code.

The aggregate is 354 public calls, 352 successful replies and two retained
admission errors. Four sessions export final bundles and close twice; all
five owned lineages are verified empty. A failed field-test plan, unadmitted
interior target and unnamed ObjC stubs are not new REA+ regressions.

## Reproduction and integrity

`mcp-driver.mjs` is the unchanged v2 field recorder: it checks actual catalog
schemas, canonical named contracts, content/structured agreement and Evidence
before journaling replies; duplicate labels are rejected before invocation.
Executed plans and continuation files retain exact inputs and query order.
For a fresh run, choose a new output directory, update all continuation/export
paths and preflight labels against the whole journal. Never rerun a plan into
an existing capture directory. Binary input and provider projects stay local.

`prepare_*.py` scripts and receipts derive additive seed admissions from the
fixed original executable's LC entries and bounded direct/address-reference
frontiers, corroborated by selected public instructions. They plan queries;
they do not establish runtime reachability. The latest 2,463-entry seed is
`storage-io-seeds-2463.tsv`. Earlier receipt paths are retained and verified.

With the original slice and frozen runtime available locally:

```sh
node field-tests/arc-callbacks-2026-11-21/verify_captures.mjs
python3 field-tests/arc-callbacks-2026-11-21/verify_sources.py
```

The first command validates all public replies, bundle membership or explicit
post-bundle records, errors and cleanup; the second authenticates 92 semantic
source bindings, eight seed receipts, the fixed input and 1,868 runtime files.
It authenticates the old 829-file checkpoint: 826 unchanged capture/support
files and three historical living-document versions from published commit
`a8b426fedc`. The current versions of those documents belong to this snapshot.

Portable text integrity, requiring no target or provider:

```sh
python3 field-tests/arc-callbacks-2026-11-21/verify_snapshot.py
```

`snapshot-manifest.json` excludes itself, unused pending plans, compiled code,
provider projects/caches, the original DMG/slice and the existing large Rize
JSONs. No production source changed in this checkpoint. No broader regression
or feature-completion claim is inferred from these checks.
