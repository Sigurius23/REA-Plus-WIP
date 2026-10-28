# Test Plan: REA+ against Consensus web client (consensus.app)

**Date:** 2026-10-25
**Target:** https://consensus.app (web client only; no Android APK in scope)
**Reference:** `consensus-open-source-rebuild/web-app-observations.md` (2026-10-17 pass)

## Objective

Test REA+ against the Consensus web client in a clean-room, anonymous-visitor
pass. Two goals:

1. **Regression-verify** the four REA+ fixes that resulted from the 2026-10-17
   pass, using consensus.app as the target.
2. **Extend observation** into the chunks that only load on pages other than
   the homepage (`/search`, `/results`, paper pages, `/extract`, `/library`,
   `/pricing`), which the first pass explicitly did not cover.

## Boundaries (unchanged from the first pass)

- Anonymous visitor only: no login, no form submission, no search query, no
  Cloudflare challenge solving/spoofing/bypassing.
- Respect robots.txt `Crawl-delay: 1` (1 second between chunk fetches).
- Clean-room: no copying of Consensus code, assets, or private data; public
  client keys (Clerk, Statsig) are left out of recorded notes.
- Documented public API surface (`llms-full.txt`, `docs.consensus.app`) is the
  sanctioned source for request/response shapes; private `/api/` paths are
  recorded as paths only.

## Phase 1 — Environment preparation

1. Confirm current REA+ version and Node runtime:
   - `rea --version` (or `npx rea-agents@latest --version`)
   - Node 22.x (>=22.19), 24.x (>=24.11), or 26+
   - Run `rea update` if a global install is present.
2. Confirm a Chrome-family browser is available for browser observation
   (required for `capture-browser-scenario`).
3. Reuse the environment notes from the first pass: the machine may sit behind
   a TLS-inspecting proxy — this is deliberate, since it exercises the
   proxy-passthrough fix (Phase 2, step 4).

## Phase 2 — Regression-verify the four REA+ fixes

Each fix has a concrete, targetable acceptance check on consensus.app:

| # | Fix | Verification |
|---|-----|--------------|
| 1 | `analyze-web-bundle` reports template-literal / concatenated / variable-held endpoints | Re-analyze the `_app` chunk. Expected: endpoint count rises from 55 (literals only) to ~192, with `{}` placeholders for runtime expressions. |
| 2 | `analyze-javascript-application` analyzes sources smallest-first, with `--max-semantic-source-bytes` for oversized bundles | Re-run over the 12 homepage chunks with `--max-semantic-source-bytes 1M`. Expected: all 12 chunks get semantic graphs (previously 3 of 12 were starved); runtime near ~53 s instead of ~2 m 50 s. |
| 3 | `capture-browser-scenario` passes `HTTPS_PROXY`/`HTTP_PROXY`/`NO_PROXY` to launched browsers | Run a launch-mode capture against `https://consensus.app/` behind the TLS-inspecting proxy. Expected: page loads without `ERR_CERT_AUTHORITY_INVALID`. |
| 4 | `list-browser-targets` lists blank tabs | Start a fresh browser on `about:blank` and list targets. Expected: the blank tab appears with `origin: null`. |

**Record for each:** pass/fail, exact command or tool invocation, REA+
version, and any deviation in behavior.

## Phase 3 — Extend observation to uncovered page chunks

The first pass only loaded `/` (and attempted `/search/`). The chunk analysis
gap to close:

1. Anonymously load (one load each, via `capture-browser-scenario`):
   Route groups to sample:
   - `/search` and `/search/new` — search UI shape
   - `/results` — results surface
   - `/extract` and `/extract/[id]` — comparison-table UI (extraction_tables endpoints)
   - `/papers/...` — read-only paper page if one can be reached anonymously
   - `/library/...` and `/hub` — library surface (expected sign-in wall; record the wall)
   - `/pricing`, `/subscription` — pricing/billing surfaces
   - `/api-mcp` — developer/MCP product surface
   - `/llms-full.txt` (machine-readable; already read once on 2026-10-17)
2. Collect the chunks each page load fetches; fetch any new chunks once each,
   honoring `Crawl-delay: 1`.
3. Run `analyze-web-bundle` and `analyze-javascript-application`
   (with `--max-semantic-source-bytes 1M`) on the new chunks.
4. Map what is found:
   - Any new `/api/` endpoint paths or HTTP methods beyond the 145-path table
   - UI shapes behind known endpoint groups: search results, paper details,
     extraction tables, library/collections
   - New feature flags (Statsig gates) evaluated outside the homepage
   - Any state-management or route-level structure relevant to the rebuild
     design inputs
5. If a Cloudflare challenge appears, stop and record it — do not bypass.

## Phase 4 — Documented public API (sanctioned request/response shapes)

1. Re-read `https://consensus.app/llms-full.txt` and
   `https://docs.consensus.app/llms.txt`; diff against the 2026-10-17 notes.
2. Optionally, using the documented anonymous tier of the public MCP server
   (`https://mcp.consensus.app/mcp`, 3 papers per search, reduced fields):
   issue a small number of `search` calls to record real response shapes.
   Budget: a handful of requests, well under the documented 1 request/s.
3. Record response shapes found this way separately from
   client-side-inferred material, and keep provenance explicit.

## Phase 5 — Record results and file REA+ findings

1. Update `consensus-open-source-rebuild/web-app-observations.md`:
   - Add a dated section for this pass with the same
     observed / found / inferred labeling discipline.
   - Fold new endpoint/UI findings into the existing sections rather than
     duplicating them.
   - Update "Not answered by this pass" and "REA+ gaps" sections with results.
2. Any new REA+ defects discovered during the pass are recorded in the gaps
   section with reproduction steps, mirroring how the previous four were
   documented.
3. Keep `OPEN_TASKS.md` updated if this campaign has follow-on work
   (e.g., Android APK analysis remains pending until an APK is obtained).

## Success criteria

- All four REA+ fixes verified pass/fail with recorded evidence.
- At least the `/search`, `/results`, `/extract`, and `/pricing` route chunks
  analyzed, with their UI shapes documented against known endpoints.
- Any new REA+ gaps documented with reproduction steps.
- No scope violations: anonymous only, crawl-delay honored, no challenge
  bypass, clean-room discipline maintained.

## Out of scope
- Android APK analysis (no APK available; remains the README's pending
  milestone)
- Any logged-in observation or account-data capture
- Server-side internals beyond the documented public API
