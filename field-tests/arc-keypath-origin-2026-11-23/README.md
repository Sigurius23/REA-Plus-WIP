# Item 69 repair / item 63 keypath and dependency trace

Read the [report](../arc-keypath-origin-2026-11-23.md) first, then
`qualification-verification.json` and `fact-index.json`.

- `fixture/`: source-built literal-keypath controls, compiler IR/assembly and
  private production-boundary probe. Binaries stay in ignored package cache.
- `runtime-final-manifest.json`: 1,872 frozen runtime files and source hashes;
  `freeze_runtime.py` creates the isolated ignored runtime once.
- `mcp-fixture-baseline/`: old-runtime reproduction; three controls, 18 calls.
- `mcp-fixture-qualified/`: fixed keypath and allocator controls, 36 calls.
- `mcp-arc-qualified/`: eight repaired keypath results and unchanged allocator,
  reducer, helper and selected-call behavior, 20 calls.
- `mcp-dependency/`, `mcp-default/`, `mcp-cache/`, `mcp-selection/`: exact
  fields/conformances, getter/setter, dependency/cache/context instructions.
- `mcp-final.mjs` and `plan-*.json`: named public tool calls, advertised schema
  validation, inline/exported Evidence and supervised teardown. Replays need
  new output directories; do not overwrite captures.
- `cli-verification.json`: four exact full-Evidence CLI/MCP comparisons.
- `probes-qualified/`: six real signature/identity protection checks, never
  normalized public Evidence.
- `swift-errors-qualified/`: stock verifier using the matching source package;
  its production files are checked against the frozen runtime manifest.
- `history-verification.json`: twelve previous snapshots authenticated against
  original commits where living files have changed.

`mcp/` correctly remains partial after recorder continuation expiration.
`mcp-fixture-final/` and `mcp-arc-final/` are the sandbox launch failures,
including unavailable lineage inspection. Qualified sessions all export,
close twice and have verified empty owned lineages. The failed frozen
Swift-error fixture lookup and first qualification-label failure also remain.
No success or cleanup claim is inferred from those attempts.

`locate_*.mjs` use the qualified old REA+ Mach-O readers for supplemental
original-byte candidate and fixup lookup. LC_FUNCTION_STARTS membership is not
declaration ownership or exhaustive reachability. Seeds remain caller
assertions and are explicitly reported in Evidence.

`verify_qualified.mjs` checks schemas, source/runtime/input hashes, exports,
positive/negative semantics, CLI pairs, probes, coexistence and cleanup.
`build_snapshot.py` creates the text-only checkpoint after notes are final.
No executable, provider project, fixture library, account/profile or live
runtime state is committed. No Arc/fixture code was executed. Item 63 and the
full Arc investigation remain open.
