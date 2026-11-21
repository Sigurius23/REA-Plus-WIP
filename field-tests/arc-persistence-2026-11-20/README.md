# Arc persistence and application trace — 2026-11-20–21

Continuation of the fixed Arc 1.172.1/build 90370 offline investigation, using
main ARM64 SHA256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, its helpers and shipped scripts were never launched. No account, profile,
service request or live UI was used. Compiler fixtures were never executed.

The current report is [the November 21 persistence report](../arc-persistence-2026-11-21.md).
Start with `metadata-bindings.json`, `selected-preference-path.json`,
`capture-verification.json` and the worker review. Historical preparation notes
under `worker-preparation/` describe the inputs before these public sessions;
their missing-body statements are superseded by each fresh successful capture.

Public captures are separated by session and seed profile:

- `mcp/`: initial 2063 admission, dependency descriptors and broader workers.
- `mcp-followup/`:2069 admission, client fields, witnesses and setting identity.
- `mcp-defaults-2026-11-21/`:2093 admission,297 Setting cases and static offsets.
- `mcp-implementations-2026-11-21/`:2216 admission, concrete default closures,
  NSUserDefaults selectors and two selected converter branches.
- `mcp-boosts-2026-11-21/`: 2236 admission, Boost storage/application boundaries.
- `mcp-apply-store-2026-11-21/`: 2279 admission, concrete application/storage
  resumes, collection/document selectors and exact error enum.
- `mcp-firebase-2026-11-21/`: 2296 admission, merge-write request/callback
  and read-request constructors.

`plan.json` and the other `*.plan.json` retain all environment choices and
continuation paths. Each output directory contains the actual advertised
catalog, arguments, replies, canonical Evidence, complete bundles and final
owned-process lineage. Missing procedures in these partial Programs are
retained observations, never proof of absence from Arc.

`method-driver.mjs` is the unchanged v1 used for the first four sessions.
Two labels in its implementation session were reused for different reads;
the full bundle preserved both original records. `verify_captures.mjs` recovers
the displaced per-call Evidence to new names and records the collisions without
altering the original journal. `method-driver-v2.mjs` rejects duplicate/unsafe
labels before invocation and refuses an existing output directory. It is used
for later sessions. This is a field-harness correction, not an REA+ provider fix.

`mcp-followup/` expired while awaiting the next phase. Transport shutdown still
completed with a verified empty owned lineage. It has no explicit close calls;
the other finished sessions preserve both first and idempotent close results.

Recheck offline metadata and concrete key derivations with:

```sh
python3 field-tests/arc-persistence-2026-11-20/derive_bindings.py
python3 field-tests/arc-persistence-2026-11-20/derive_preference_keys.py
python3 field-tests/arc-persistence-2026-11-20/derive_storage_bindings.py
```

`verify_captures.mjs` reparses retained canonical Evidence and binds every
successful Evidence-bearing invocation to its full bundle. Pass the session
directory names explicitly; the final report records that exact command.
The source-owned halfword fixtures have their own reproducible compiler/static
verification receipt and manifest. Their `.dylib`, objects and module cache stay
local and excluded from Git. Production code and the qualified native bridge
were not changed by this analysis pass.
