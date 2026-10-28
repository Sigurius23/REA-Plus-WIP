# JavaScript file-status inspection — 2026-10-27

Item **22(c)** is implemented through the shared `inspect_analysis_view`
workflow and its existing CLI/MCP adapters. No new analysis tool or execution
authority was introduced. No commit or push was performed by this pass.

## Behavior

Select a page with `collection: "file_statuses"`, nonnegative `offset` and
positive `limit`. `filter: "with-issues"` is the default; `"all"` includes
files without recorded issues. Retained Evidence references require the same
MCP connection; portable CLI requests use inline complete Evidence.

Rows carry exact file paths, SHA-256, asset/observation IDs, text/parse status,
module-IR retention/coverage, semantic projection status and source-bound
operational errors/limits. Identical-content aliases remain separate rows,
and failures attach by both path and digest. Sorting is by Unicode code-point
path order, then observation ID. Page coverage counts the filtered rows;
`file_status_summary` separately reports observed file/issue/metadata counts.

The producer now records worker projection outcomes and its actual offered
node budget. Retained module IR is distinct from a complete graph projection.
Older Evidence retains its recorded errors but missing retention fields remain
`not-recorded`. The compact view omits raw static/semantic payloads, captured
output and large parent limitation strings; their count and parent reference
remain available. An empty issue page does not establish complete analysis.

## Verification

- **53 tests passed across 7 files:** domain projection and legacy metadata,
  alias identity, stable pagination/digests, collection-specific schema rules,
  the real compiled CLI producer and inspection workflow, retained MCP
  inspection and actual SDK-advertised JSON Schema validation. The CLI test
  changes the input after analysis and still verifies the original recorded
  SHA-256. The existing memory-limit/recovery MCP tests also exercise the new
  page without copying thousands of raw findings.
- **16 additional tests passed:** module-root discovery and imported IPC
  resolution, including deep ASTs and exhaustion of the actual walk budget.
- `npm run check` passed: types, formatting, lint (827 warnings, zero errors),
  unused code, metadata, module boundaries and architecture guards.
- `docs:generate` and `docs:check` passed. jscpd remained **2.50%**.
- `git diff --check` passed.

The run used Node 24.22.1 and npm 10.9.2. It did not rerun the full suite or
the full-Rize analysis, and did not re-import/copy its 616 MiB Evidence file.
The earlier 904-file full gate describes the prior tree, not these new edits.

## Integration corrections

Concurrent path-filtering work initially blocked builds with comment syntax,
unsafe string indexing and a mandatory new statistics member. The comment
text/indexing were corrected; historical and scoped statistics now use two
strict JSON-safe variants, preserving omission in older Evidence without
inventing an unfiltered scope. A glob test now follows the declared
zero-segment semantics and retains explicit negative include cases.

The architecture check found a pre-existing custom recursive AST walk in
module-root discovery. It now uses shared `childNodes` with an iterative stack,
enforcing its walk budget before further traversal and dropping collected
candidates on exhaustion. Its regressions above passed. These checks do not
establish full-Rize IPC pairing or close item 28.

Final raw logs remain local:

- `/tmp/rea-file-status-focused-final.log` — 53 focused tests.
- `/tmp/rea-file-status-module-roots.log` — 16 related regressions.
- `/tmp/rea-file-status-static.log` — static and architecture checks.
- `/tmp/rea-file-status-docs.log` — generated documentation and checks.
- `/tmp/rea-file-status-jscpd.log` — duplicate-code measurement.

## Final integration verification (2026-10-28)

These changes are included in the combined offline-backlog verification. The
final reviewed full `check:pr` passed 912 files / 8,442 tests, with 16 files / 274 tests
skipped and zero failures; docs and jscpd (2.50%) passed. The full-suite caveat
above describes the earlier focused run. See the
[combined report](rea-offline-backlog-2026-10-27.md).
