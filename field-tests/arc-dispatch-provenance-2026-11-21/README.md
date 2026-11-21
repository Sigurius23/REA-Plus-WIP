# Arc witness provenance and static-data repair

Start with [the report](../arc-witness-data-2026-11-21.md) and
`retest-verification.json`. The preceding callback checkpoint is published in
`4f870986e`; its captures and frozen runtime remain intact.

- `mcp/`: 33 successful public observations of protocol/type bytes, constructor
  and reader forwarding on the prior frozen runtime. All final records export;
  both closes succeed and owned lineage is verified empty.
- `mcp-witness/`: seven successful rebuilt-decoder operations, including three
  native metadata queries; final export, two closes and verified empty lineage.
- `cli-DependencyKey.json` / `cli-TestDependencyKey.json`: full CLI envelopes
  exactly matching the selected MCP metadata. The source input was not executed.
- `runtime-manifest.json`: 1,868 frozen runtime files and exact changed-source
  hashes. `freeze_runtime.py` requires a new destination and never edits the
  prior runtime. `mcp-witness-driver.mjs` changes only its frozen-runtime root
  from the retained v2 driver; both validate actual advertised schemas and
  named contracts before journaling.
- `associated-type-candidates.json`: a restricted, original-byte planning scan
  with no selected reflection-section records. It is not proof that the
  associated type is absent; actual identity is bound through the witness word.

Qualification receipts are `native-tests-qualified.log` (92 cases),
`check-fast-qualified.log`, `build-qualified.log`, `docs-check.log`,
`apple-dispatch-check.log` (ten compiler variants/seven discovery comparisons)
and `package-check-qualified.log`. The `*-failure.log` and
`*-network-unavailable.log` files retain intermediate attempts, not final
qualification. The initial package retry required its pinned registry test
package and used a disposable cache; successful cleanup is in the final log.

With the frozen runtime and source available:

```sh
node field-tests/arc-dispatch-provenance-2026-11-21/verify_retest.mjs
```

This authenticates public replies, schemas/contracts, canonical Evidence,
bundles, target identity, runtime/source hashes, code-target preservation,
CLI/MCP equality and owned cleanup. It deliberately leaves the 401 broader
unknown identities and item 63's missing type-flow/recovery work explicit.

Portable text integrity, without a provider or target:

```sh
python3 field-tests/arc-dispatch-provenance-2026-11-21/verify_snapshot.py
```

All plans contain executed queries and exact output paths; a fresh run requires
new output directories and unique labels. The original executable, compiled
fixtures, frozen runtimes, provider projects and dependency caches stay local.
No Arc code or shipped script was executed, and no application service was
contacted. Native Ghidra recovery is unchanged.
