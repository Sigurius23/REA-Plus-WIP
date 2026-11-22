# Swift ABI frame-escape qualification

Start with [the report](../arc-frame-escape-2026-11-22.md).
`qualification-verification.json` covers the complete 110-case native suite;
`retest-verification.json` covers the exact counterexample and fixed Arc.
Both authenticate the frozen runtime and source versions; all owned lineages
are verified empty. Binaries, modules, provider projects and caches are excluded.

`qualification/` retains exact textual originals. Its first run is the expected
v9 semantic counterexample (four successful MCP replies, not a passing test).
`native-full` is the partial v10 run with a stale verifier assertion after seven
successful negatives. `native-final` is the completed 110-case qualification,
with 440 MCP replies and 14 CLI/MCP comparisons. Canonical catalogs are
deduplicated by SHA-256; `qualification-index.json` maps every original path
to retained bytes. Compiler-only preparation is supplemental.

`mcp-reproduction/` retests the exact unchanged v9 counterexample with v10.
`mcp-arc/` uses the unchanged 2,506-entry profile and fixed original Arc image.
Its reducer call returns a summary and exports the complete source parent.
The first offline retest verifier's null-profile assumption is preserved in
`retest-verification-initial.log`; the corrected verifier authenticates that
parent rather than inventing a profile for the derived view.

Recheck the retained data with the pinned local runtime and original inputs:

```sh
node verify_qualification.mjs
node verify_retest.mjs
python3 verify_history.py
```

These verification commands start neither a provider nor a target. They need
the matching local frozen runtime/input to rehash them. `collect_qualification.py`
copies finished local run records without changing their bytes; fresh provider
qualification uses the production `verify:ghidra:swift-enum` lane. Use a new
output directory for reruns so earlier captures are preserved.

`source-checks.json` records ordinary gate outcomes and their authority. The
42-test/build command output was observed in the agent tool transcript; raw
fast/docs/package logs are retained. `build_snapshot.py` inventories shareable
UTF-8 text, changed source files and living documentation for review/staging.
Item 63's typed root, origin and observation-only context carrier remain open.
