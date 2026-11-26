# Android boot / stored OTA integration — 2026-11-26

This item-62 slice adds Android boot v0–v4, vendor_boot v3/v4 and stored Android
OTA v2 inspection/extraction through the existing artifact tools, CLI and MCP.
It selectively adapts audited upstream REA
`f7849cad3fe3bffb207b4dc30f34394978c20297` on local parent
`d4a54894c46f3fac904e8fed8468633e833f1f59`. OTA partition reconstruction remains
open; stored operation blobs are not presented as rebuilt partition images.
This does not claim parity with later upstream main or complete device support.

Boot metadata retains raw headers, names/command lines, addresses, OS/patch fields,
vendor table declarations, board IDs/extensions, component compression magic,
v4 signatures and AVB footer/vbmeta ranges. Addresses are declarations, separate
from physical carrier locations. Unsafe-u64 boot load-address bytes survive with
a null numeric projection. Indexed vendor paths preserve arbitrary/duplicate
names without allowing names to control extraction destinations. Empty table
entries remain metadata; overlapping fragments and the complete stored vendor
section/table remain separate byte views.

OTA retains the header, protobuf manifest, parsed signature declarations and
ordered partitions/operations/extents, with exact decimal uint64/int64 values,
raw strings, unknown fields/groups and partial stored windows. Operation-data
SHA-256 checks do not become partition/source-image verification. Unknown
operation numbers remain explicit; the checked AOSP schema supplies labels 0–13.
No operation, postinstall path, decompressor or signature verifier is executed.

## Problems found and solved

- Replaced hidden upstream header/table/count/record caps with caller admission
  before field expansion, loops and derived entries. Empty declarations count.
  Metadata reserves account for raw hexadecimal/text fields and copied output;
  budget review increased raw-byte reservations to eight bytes per source byte.
  Vendor-table variadic array pushes were removed, avoiding an unrelated engine
  argument-count ceiling. OTA unknown groups use an iterative wire reader.
- Preserved all vendor declarations, raw names/board IDs/extension bytes and
  overlapping fragments. AVB discovery uses the actual declared data end, so a
  valid footer without optional final page padding is retained. Unknown coverage
  comes from structural facts, not prose or a lack of errors.
- Kept protobuf omission, explicit false, last scalar values and merging of
  repeated singular messages. Unknown wire fields and sparse-hole sentinels
  retain their original representation. Review reproduced a literal leading
  Unicode BOM being stripped from string values; decoding now preserves it,
  with a failing-before/passing-after regression and independent public fixture.
- Source/partition hashes remain declarations. Operation-data hashes reserve
  work before hashing and reuse identical ranges. Missing data reports an
  unavailable check/unknown coverage; non-32-byte hash declarations are retained
  without invented verification. Supported SHA disagreements use strict refusal
  or explicit observed-untrusted continuation.
- Reused the retained descriptor, source SHA-256, copied stream, cancellation and
  cleanup owner. Public changed-input controls for both formats refuse silently
  retargeting a session, including under untrusted continuation.

## Qualification

`verification.json` binds the frozen runtime (1,950 files) and 32 changed source/
document/test files. Twelve inert fixtures are independently built with Python
struct/hashlib and a small wire encoder, with exact input hex, SHA-256 and stored
range oracles. Binary inputs/outputs remain in temporary scratch; text receipts
and extracted byte readbacks are committed.

- 370 selected tests across 31 files pass, including new parser semantics, real
  compiled CLI/stdio MCP, existing firmware/DOS COM, snapshot identity, malformed
  input, cancellation/cleanup, budgets and changed-input controls. Source tests
  admit 4,097 vendor declarations/OTA partitions and deeply nested unknown groups
  beyond former fixed count/depth boundaries.
- 62 qualified MCP calls: 49 successful and 13 expected refusals. Actual advertised
  schemas, named contracts, complete text/structured replies and Evidence are
  validated; catalogs, replies, invocations and bundles are retained. Controls
  include carrier/element/metadata/hash budgets, irrelevant knobs, strict bad
  hashes, unsupported OTA v1 and malformed protobuf.
- 40 CLI calls: ten complete current CLI/MCP Evidence pairs, 21 complete historical
  HEX/S-record/UF2/DfuSe/uImage/FIT/ESP/flash Evidence matches, five extraction
  manifest/file pairs and four expected refusals. Eighty-nine file readbacks
  match independent expected hex, source intervals, lengths and SHA-256.
- Arc's complete reducer Evidence remains exactly
  `ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45`:
  2,518 instructions / 10,072 bytes under the same fixed input, 2,537 seeds and
  one-second partial analysis policy. This was a static warm-checkpoint run.
- 36 historical snapshots authenticate unchanged captures or original versions
  of updated living files. Static, docs, discovery (997 files) and package gates
  pass. The package exposes 208 tools and six prompts. Recorded qualification,
  CLI, compatibility, Arc and package lineages have no owned descendants.

Initial diagnostics are retained: a boot truncation assertion used a byte beyond
its intended component, the first public OTA assertion omitted the retained ZERO
operation, and the first static gate found a Markdown spacing issue. Those test/
format assertions were corrected. The BOM regression failed before its decoder
fix; the final 370-test run includes the repair. No production output was changed
to satisfy a mistaken expected fixture count.

## Remaining scope and authority

OTA coverage describes stored carrier bytes, not completed partition semantics.
The next slice is source-independent REPLACE/ZERO partition reconstruction with
explicit output-byte admission and source/compressed/delta refusal semantics,
then devicetree inspection. Legacy OTA v1 and historical pre-version boot-header
conventions remain outside this profile. Recursive expansion and raw CPU/board
loading remain separate. This macOS synthetic-fixture qualification does not
establish other hosts, a real firmware corpus, hardware boot/update behavior,
trusted keys, cryptographic authenticity or eFuse/rollback acceptance.

Primary layout/schema references are AOSP bootimg.h blob
`67ae349583e66424e5af0a3b7a386b42b6c958e0`, avb_footer.h blob
`e84826fa8f45fa08986d59a1f7250ef28d5a2bc8`, and update_metadata.proto blob
`6d16da40e53720078b2e4f3689dbb296eb325bee`. Links are in the firmware guide.
Full Arc features/persistence and Client unknown revision 3 remain open. No Arc
executable/helper/shipped JavaScript, account/profile, UI, service or recorded URL
was launched or used.
