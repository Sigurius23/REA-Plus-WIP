# Concrete generic applications / conditional default forwarding

Read the [report](../arc-generic-applications-2026-11-23.md), then
`qualification-verification.json` and `fact-index.json`.

- `fixture/Applications.swift`, compiler IR, symbols and build/cleanup receipts
  describe the owned positive and negative controls. The library remains in
  ignored cache and was never executed.
- `mcp-baseline/` retains 13 previous-runtime public calls.
- `mcp-final/` retains 16 qualified public calls, full inline/exported Evidence,
  advertised schemas and verified cleanup. Both target sessions close twice.
- `mcp-malformed/` adds 15 successful calls on three deliberately malformed
  metadata derivatives. `fixture/malformed-controls.json` retains every changed
  byte and distinct digest; these derivatives are not compiler output.
- `runtime-final-manifest.json` authenticates the frozen ignored runtime.
  `freeze_runtime.py` creates it once; do not overwrite captures or runtimes.
- `plan-*.json`, `mcp-final.mjs` and `verify_cli.mjs` retain exact named tool and
  CLI inputs. `cli-verification.json` records four full-Evidence comparisons.
- `verify_qualified.mjs` checks source/runtime/input hashes, schema/contract
  parity, positive and boundary outcomes, old capture compatibility, contradictory
  role rejection, unchanged layout/function facts and empty owned lineages.
- `history-verification.json` authenticates fourteen earlier snapshots.
- `probe_header.mjs` is a supplemental original-byte layout probe, not public
  metadata recovery. Two draft variable-name collisions were corrected before
  the successful probe; they did not affect REA+ or any public capture.
- `verify_forwarding.mjs` authenticates three retained public observations and
  supplements them with eight exact native-encoding checks. Its resulting
  `forwarding-verification.json` is a conditional analyst relation, not an
  automatic invocation/target/domain proof. Original captures remain in their
  prior committed studies and are linked by path, digest and Evidence ID.

Field queries use the native Apple byte reader within Ghidra-selected sessions;
no new Ghidra code-recovery qualification is claimed. No target/fixture code,
provider database, account/profile or runtime state is executed or committed.
Raw producer logs retain their whitespace. Item 63 and full Arc remain open.
