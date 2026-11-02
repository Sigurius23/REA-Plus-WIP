# Arc loose JavaScript retest — 2026-11-02

Fresh public REA+ MCP capture at `3a3b6c438e7f580d8b9d9982b34197f2ecffb948` confirms item 40 on the explicitly selected shipped loose JavaScript. No new JavaScript decoder regression was reproduced.

## Boundary and verification

Input: `/Applications/Arc.app/Contents/Resources`, `paths_include: ["**/*.js"]`, summary first. Exactly three selected files were parsed: `SelectorPicker.js`, `DisableInlineLinks.js`, `EaselExportViewer.js`. REA+ considered 28 relevant entries, excluded 25 by the explicit glob, read 30,640 text bytes, and visited 6,594 AST nodes. It recorded three JavaScript assets and three source module roles; the legacy `statistics.modules: 0` counts bundled registrations.

The complete parent Evidence is `ev_2b912b006e85b86dad751b5e7bad554cbed02c7df215ac4379748a0bd400f44b`, exported in `evidence-bundle.json`. Root scoped artifact SHA-256: `4d142dda279872263953d0bb0eb8b0ef64d2d41f1e7cda865c442795d6a6a2bd`. The source file hashes before/after match (`verification-receipt.json`).

All 19 successful public calls used the actual 204-tool catalog, AJV 2020 schema validation, named output contracts, text/structured-content equality, and canonical Evidence validation. Independently revalidating every record in four bundles authenticated 23 record occurrences. The full producer ran once successfully; later sessions imported its complete portable Evidence and did not repeat analysis. `host-plan.json`, its continuations, `feature-plan.json`, `feature-follow-plan.json`, `invocations.json`, all complete replies, complete Evidence, and the captured `driver-input.mjs` preserve inputs and results.

The initial sandbox attempt failed during worker startup because swiftc could not write the macOS clang module cache. Its exact error and partial reference are kept in `sandbox-attempt/`; that reference was not promoted to successful coverage and the error is environmental. Host execution resolved this observed prerequisite. All three successful sessions closed and reported verified empty live-descendant snapshots; these are point-in-time shutdown checks. No Arc host, UI, profile, account, service, or shipped resource was launched or executed.

Publication recording note: repeated complete input Evidence in the two feature-session invocation arrays is losslessly referenced with `$json_file`/`select`, relative to each invocation file. Complete public replies and Evidence are unchanged. The root `input-compaction-receipt.json` retains hashes and exact parsed-JSON reconstruction checks, and `verify-recordings.mjs` re-expands these inputs for schema validation.

## Findings linked to Evidence

| Question | Result | Evidence |
| --- | --- | --- |
| Are all three selected loose scripts parsed and retained? | Answered. Syntax and static facts complete; no parse errors, unresolved static occurrences, or file issues. Each has recorded complete retained module IR and retained semantic projection. | `ev_70f9e66114521846bd4889e6d6df89d977cf913dbc29cd02423cb0be8e3864f3` (`file-statuses.evidence.json`) |
| Did item 40 remove the query-collection false endpoint? | Answered within this scope. Endpoint page is empty. The underlying `searchParams/get` property read remains in the exported semantic graph at `EaselExportViewer.js:446`, node `jsrg_node_60c5304b5fe71c08e89d4b41abb4428fa3a627b24afd0bf7efa9759be02fa08e`; the source was not omitted to obtain the empty result. | `ev_fd6ec7691dca88d9103eb496fa32aa2b519cb53714b88bd39c2a8face8429b2f` (`endpoints.evidence.json`), complete parent |
| Can a useful feature be followed beyond inventory? | Partially answered through exported semantic IR and focused public traces; see below. | Complete parent and five trace Evidence records in `feature-views/` and `feature-follows/` |
| Does an empty scoped endpoint page prove Arc has no network behavior? | Unresolved and outside this claim. Only three loose scripts were selected. Arbitrary network-client positive fixtures were not rerun in this branch. | Explicit input glob and parent limitations |

The module page is exhausted at six distinct role entries: `ev_b0c045ee189729d133faf0be01c74d095da68085bee50c0d2b5fd1a4668b2eed`. Exact source-module IDs were inspected, then exact asset IDs; all returned item views are preserved. Normal successful item views expose module identity/metadata rather than an original-source listing. The exported semantic IR supplies 5,028 nodes and 4,948 relations for the feature work.

## Feature: redirect an inline link to a new tab

**REA+ recovered observations and inferences:** `DisableInlineLinks.js` contains `handler` at lines 20–36 and `ancestorMatching` at lines 3–11. The callers trace resolves two calls to the helper, at lines 23–26 and its recursive call at line 8 (`ev_ba9b0212e969c28fa3a189d7c04dee8f25ba68df1b1e349c57c3f66c1c656a89`). It leaves the callback `matching` unresolved. The semantic graph observes property reads `e.target`, `parentElement`, `tagName`, `hasAttribute`, `getAttribute`, `preventDefault`, and `stopPropagation` at source ranges. These names and relationships are syntax facts or conservative static inferences, not observed execution.

The `url` binding at line 29 is read at line 30 and flows into argument 0 at line 33 via three resolved read/alias relations (`ev_535fdc91f7338b1e93e85429081c94c5bff69517047a769205465b9a32e332c6`). Backward provenance stops explicitly at the unsupported `getAttribute` CallExpression (`ev_786c48388cd75e16da32006d3fc3dad851fa5da4076bc2fc5bc58ff903254648`). The handler trace reports unresolved DOM calls and `open` (`ev_7830f18aa6ab8ee472a43be203dea06be7d621a2cfddd5dda6adecb55f3e7edd`). The event-parameter forward trace returns its local reads but leaves event value provenance unknown (`ev_3105f9dd2e078ac2d17b65e26e4a08465a5f1bfac7da4a30420a84eecf0c6ce5`). All five traces have partial coverage. Their exact queries and full unknowns are retained.

**Supplemental raw-source corroboration, not REA+ recovery:** Inert text review confirms the script replaces a prior capture click listener saved under `window._arc_forceLinksToOpenInNewTab`, searches for a clicked anchor or ancestor with `href`, and for a nonempty value calls `preventDefault`, `stopPropagation`, then `open(url, "_blank")`. It also confirms `embedURL` uses `url.searchParams.get("v")` as a YouTube identifier, after a URL constructor try/catch whose catch returns null. The selected ranges and classification are recorded in `supplemental-source-review.json`; these facts do not fill missing REA+ fields.

## Coverage still unknown

Application inventory coverage is complete **for the explicit glob**. Overall semantic coverage is unknown, with 1,503 recorded unknowns; no semantic nodes or relations are reported omitted by a resource cap. DOM event registration, dynamic/callback targets, external `open`, and `getAttribute` return semantics remain conservative unknowns, and static analysis does not observe clicks or new tabs. These attempted boundaries match the declared semantic limits and are not presented as new bugs. No runtime verification was requested or performed.
