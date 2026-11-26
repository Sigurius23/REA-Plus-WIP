# ESP flash layout / partition / OTA integration — 2026-11-26

This item-62 slice adds explicit ESP32-family flash-dump interpretation through
existing artifact inspection/extraction, CLI and MCP. It selectively adapts
upstream REA `f7849cad3fe3bffb207b4dc30f34394978c20297` on local parent
`3d168a1c2816466c8244a451e61b6777c3af4532`. It does not claim parity with later
upstream main or complete firmware/device analysis.

`format=esp-flash-image` / `--target-format esp-flash-image` selects this
interpretation. Optional flash-origin and sector-aligned table addresses retain
the caller's exact hexadecimal strings. Omission preserves ordinary byte-based
target detection. The layout reports default/caller origins, default/caller/
MD5-verified scanned tables, all partition declarations and actual stored windows.
MD5 declarations/computations, raw label bytes, flags, OTA records and conditional
boot selection remain inline. App and bootloader facts reuse standalone ESP
parsing. Running partition is always unknown.

## Problems found and solved

- All partition declarations survive, including leading partial and wholly
  missing ranges. Signed declaration-relative offsets are separate from physical
  carrier offsets and the available window within a partition. Extraction copies
  only present bytes; it never fabricates missing prefixes or erased padding.
- Original origin/table selectors now bind target/session status, cached snapshots
  and Evidence identity. Explicit zero differs from omitted zero. Reopening the
  same bytes with different choices cannot reuse another interpretation's result.
  The target-format owner now covers both DOS COM and explicit flash selection;
  flash is not mislabeled as an executable format.
- Erased/unset OTA records naturally have stored CRC `ffffffff` versus computed
  `2144df1c`. They remain invalid selection records and permit conditional
  factory fallback; strict inspection no longer mistakes erased storage for a
  corrupt programmed record. Programmed CRC disagreements still use strict or
  explicit untrusted-continuation policy. Every table MD5 candidate is retained,
  including duplicate/invalid entries.
- File retention, locator/table metadata, region/image metadata expansion, table
  hashing, scans and image work are admitted before their cost. Overlapping
  regions share byte scans and repeated image ranges share decoding. Repeated
  metadata still consumes its own reservation. Caller limits yield typed memory/
  file/CPU refusals with truthful remediation; cancellation reaches the decoder.
- Public changed-input controls exposed silent firmware retargeting after open.
  All structured firmware roots now compare the active target SHA-256 against
  their stable observed carrier before decoder allocation. Untrusted continuation
  does not authorize a changed target. The existing descriptor/stream/cleanup
  owner remains responsible for all outcomes.

## Qualification

The frozen runtime contains 1,943 files; its manifest also commits changed
sources. Six inert fixtures use independent Python struct/hashlib/zlib layout,
image checksums, MD5 and OTA CRC computations. Text receipts preserve exact
input hex, source SHA-256 and expected stored ranges. Binary inputs/outputs stay
in temporary scratch. `verify_results.py` checks source/runtime commitments,
complete public Evidence, metadata computations, readbacks and compatibility.

- 336 selected tests across 28 files pass. Coverage includes real compiled CLI/
  stdio MCP, explicit interpretation/identity, firmware/DOS COM compatibility,
  malformed input, partial coverage, cancellation, cleanup and resource limits.
- 39 qualified MCP calls: 33 successful and six expected refusals, including
  file/metadata/work budgets, an inapplicable run budget and strict MD5 failures.
  Actual advertised schemas, named contracts, complete text/structured replies
  and Evidence are validated; catalogs, replies, invocations and bundles remain.
- 28 CLI calls: seven complete current CLI/MCP Evidence matches, 14 complete
  historical HEX/S-record/UF2/DfuSe/uImage/FIT/ESP Evidence matches, four extraction
  manifest/file pairs and three expected refusals. The 78 extracted file readbacks
  match independent fixture hex, byte counts, carrier ranges and SHA-256.
- Arc's complete reducer Evidence remains exactly
  `ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45`:
  2,518 instructions / 10,072 bytes with the same fixed input, 2,537 seeds and
  one-second partial analysis policy. This was a warm-checkpoint static run.
- 35 historical snapshots authenticate unchanged captures and original versions
  of updated living files. Static, docs, discovery (994 files) and package gates
  pass. The package exposes 208 tools and six prompts. Qualification, CLI,
  compatibility, Arc and package process lineages verify no owned descendants.

Initial diagnostics remain separate: copied layout tests expected omitted
leading partitions and overclaimed complete coverage; assertions were corrected
for retained declarations/unknown coverage. Type checks caught archive helper
constructors missing the newly required context and a type-only import; those
were corrected. Review found a cancellation signal not forwarded into the decoder
and fixed it. The first recorder CLI attempt used abbreviated labels absent from
its plan; its partial output and failure receipt remain under `cli-initial`.
The recorder was corrected and all 14 current CLI calls then passed. A result
verifier's initial blanket assumption-count assertion was narrowed to account for
invalid-table refusal; no production result was changed for that assertion.

## Remaining scope and authority

Coverage describes examined stored bytes under the chosen layout, not complete
payload semantics or successful device boot. OTA selection is conditional on the
recorded rollback, anti-rollback, load fallback, GPIO and configuration assumptions.
Checksums/hashes establish consistency, not publisher authentication. No payload
is decrypted, decompressed, emulated or executed; encrypted flags and signature
facts do not establish trusted keys or eFuse policy. ESP8266, real device/peripheral
behavior and other host workflows remain unqualified by this macOS run.

Next: Android boot/OTA, then devicetree inspection. UF2 file-container/MD5/tag
interpretation, recursive expansion and raw CPU/board loading remain separate.
Full Arc features/persistence and Client unknown revision 3 remain open. No Arc
executable/helper/shipped JavaScript, account/profile, UI, service or recorded URL
was launched or used.
