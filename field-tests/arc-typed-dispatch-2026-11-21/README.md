# Arc typed dispatch / detached instruction checkpoint

See [the report](../arc-unlisted-instructions-2026-11-21.md) for findings and
limits. Item 65 is qualified; item 63 remains open.

- `fixture/`: source-owned static positive/adversarial controls. Their text
  manifest authenticates 29 files; compiled libraries and module cache stay
  local. These do not qualify an implemented typed-dispatch producer.
- `typed-input-design-review.*`: independent review of exact typed-root and
  context requirements. Its original source hashes remain immutable; later
  edited files are authenticated against checkpoint d647436b in the new
  history receipt.
- `mcp/`: 20-call typed-root session, 18 successes/two admission errors.
- `mcp-byte/`: 137-call current decoder/Arc session, all successful.
- `byte-qualification-v3/`: final ARM64/x86-64 native qualification, 44 calls
  including four expected input rejections, plus two CLI/MCP comparisons.
- `byte-qualification/` and `byte-qualification-v2/`: retained development
  failures; their green subcases are not the final lane.
- `runtime-manifest.json`: frozen runtime/source identities; binary runtime
  remains in local `.cache/arc-runtime-unlisted-2026-11-21`.
- `verify_retest.mjs`, `verify_history.py`, `verify_snapshot.py`: reproducible
  capture/schema/fact, historical-byte and text-publication authentication.
  They do not execute the target or reopen a provider.

`retest-verification.json` and `history-verification.json` record successful
checks. `snapshot-manifest.json` lists only shareable text; the original DMG,
compiled libraries/objects, provider projects, caches and large Rize evidence
are excluded. The two Arc sessions and final qualification/package lineages
are verified empty. Full Arc recovery remains incomplete.
