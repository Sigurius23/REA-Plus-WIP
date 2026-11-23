# Generic declarations and conditional typed Root use

Read the [report](../arc-generic-declarations-2026-11-23.md), then
`qualification-verification.json` and `fact-index.json`.

- `fixture/Declarations.swift`, compiler IR, symbols and `build.json` describe
  the owned generic/nongeneric controls. The compiled library stays in ignored
  cache and was never executed. Build cleanup is verified separately.
- `mcp-baseline/`: old runtime's explicit generic-owner refusal, 18 calls.
- `mcp-final/`: generic declarations, same-name identities, concrete closure,
  budget/unindexed controls and layout refusal, 21 calls.
- `mcp-constructor/`, `mcp-typed-consumer/`, `mcp-move/` and
  `mcp-reduce-witness/`: real Ghidra caller, typed move and exact protocol-slot
  instructions/analyses; source locations and normal-runtime premises remain
  distinct from actual instance identity or alias stability.
- `runtime-final-manifest.json` authenticates the frozen ignored runtime.
  `freeze_runtime.py` creates it once; `mcp-final.mjs` uses that exact path.
- `plan-*.json` retain exact named public tool inputs and environment allowlist.
  Replays require new output directories; do not overwrite captures.
- `cli-verification.json` retains four full-Evidence CLI/MCP comparisons.
- `verify_qualified.mjs` validates schemas, source/runtime/input hashes,
  subject and export identity, positive/negative outcomes and cleanup.
- `history-verification.json` authenticates thirteen earlier snapshots,
  resolving changed living files against their original commits.

`locate_*.mjs` are explicitly supplemental original-byte B/BL, LC_FUNCTION_STARTS
and fixup lookups using already qualified REA+ Mach-O readers. They are not
automatic declaration ownership, exhaustive references or runtime provenance.
Public instructions/metadata corroborate the selected facts separately. Seeds
are caller assertions and remain identified in Evidence.

The first fields-only sessions use the native Apple reader; they do not claim
new Ghidra algorithm verification. Later constructor/witness sessions use the
installed Ghidra under an explicitly partial one-second policy. All sessions
export, close targets twice and finish with verified empty owned lineages.
Raw logs and producer text retain their original whitespace. No executable,
project database, account/profile or runtime state is committed. Item 63 and
the broader Arc investigation remain open.
