# Arc feature metadata / storage policy continuation

See [the report](../arc-features-storage-2026-11-22.md). This pass uses the
unchanged qualified frozen runtime, original Arc slice and bounded caller
seeds. Production REA+ source is unchanged.

`mcp/`: 236/236 successful replies, final bundle, two explicit closes, verified
empty lineage. The preceding `arc-features-used-2026-11-21/mcp/` has 73 successful
replies but is correctly classified partial because its continuation expired.
Its raw misleading 'completed' summary is preserved; the new verifier does not
invent close calls or investigation completion. Both owned lineages are empty.

`mcp-driver.mjs` corrects expiration to a thrown failure/failed summary.
`recorder-idle-check/` is a real target-free expected-failure qualification:
zero tool calls/targets, nonzero exit and verified empty lineage.

The independent predicate review is in the preceding directory. Its 28 source
records and markdown bytes are authenticated; root completed the storage review
and facts after worker quota limits. `fact-index.json` links selected findings
to exact current and historical Evidence. Raw byte-probe ranges are indexed
source intervals, not invented Ghidra-owned function bodies or runtime traces.

`verify_capture.mjs`, `verify_facts.py`, `verify_history.py` and
`verify_snapshot.py` recheck schemas/canonical records, bounded facts, historical
bytes and publication inventory without opening a provider. The original DMG,
binary slice, frozen caches, provider projects and unused pending plans are
excluded. Full Arc, runtime readback and durability remain incomplete.
