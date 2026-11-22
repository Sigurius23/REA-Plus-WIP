# Retained restore/preview evidence

Start with [the report](../arc-restore-preview-2026-11-22.md) and
[final additive interpretation](analysis-addendum.md). The independent initial
reviews and their resolutions preserve the premises/queries at their capture
times; the addendum resolves the subsequent ABI and concrete method findings.

`mcp/` is the 199-call session that expired waiting for continuation 8.
Its failed summary is correct; `phase-7.bundle.json` retains all its Evidence.
`phase-8.continue.json` arrived after expiration and was not executed there.
`plan-followup.json` explicitly selects those supplemental reads into
`mcp-followup/`; its 28 calls finish with final export and two closes. Both
summaries contain verified empty owned process lineages.

`prepare_overlay.py` records original function-index/code-reference query
planning and preserves the prior 2,491 entries, adding exactly 15. Seeded
function entries are caller assertions, not discovery or global CFG proof.
No production source or qualified frozen runtime was changed.

Recheck the retained evidence without launching a provider or target:

```sh
python3 verify_facts.py
node verify_capture.mjs
python3 verify_history.py
```

Use the pinned Node runtime and keep the local frozen runtime/input available.
`build_snapshot.py` inventories shareable UTF-8 research files and the three
updated living documents. It excludes binaries, caches, provider projects,
unused pending files, the manifest itself and the two existing Rize JSONs.
