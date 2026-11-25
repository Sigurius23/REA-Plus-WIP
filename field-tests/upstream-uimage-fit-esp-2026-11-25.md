# uImage / FIT / standalone ESP integration — 2026-11-25

The next item-62 slice adds U-Boot legacy uImage, FIT and standalone ESP32-family
root carriers to existing artifact inspection/extraction, CLI and MCP. It
selectively adapts audited upstream REA
`f7849cad3fe3bffb207b4dc30f34394978c20297` on local parent
`381bf4d4a089d068f0456d03ff24ec78af3d763d`; it does not claim parity with later
upstream main or complete hardware/flash support.

uImage retains raw header/name/enum facts, pinned enum labels, timestamps, load/
entry/compression declarations and exact stored/computed header/payload CRCs.
Multi/script tables expose components alongside stored payload bytes, with real
carrier offsets, checked alignment/bounds and explicit slack/trailing coverage.
FIT validates the FDT and exposes inline/data-offset/data-position image ranges,
configuration/default references, unresolved names, exact supported hash facts,
signature declarations and unclassified carrier extents. Overlapping external
ranges remain separate; inconsistent explicit image-data ownership fails.
ESP preserves header/chip-table facts, segments/descriptors, checksum/appended
SHA-256, complete signature candidates and exact signature-slot CRC/digest facts.
Truncation, invalid signature candidates and undescribed trailing bytes leave
explicit unknown coverage. ESP8266 is explicitly unsupported.

## Problems found and solved

- Replaced the upstream prefix-only FIT recognition rule: the declared FDT
  structure is scanned using bounded windows while opaque data properties are
  skipped. A real public fixture puts `/images` after 8 KiB and is recognized.
- Replaced hidden component/image/hash/reference/decoded-byte ceilings with
  caller resource policies. Tree/name/list metadata is admitted before expansion.
  Shared ranges cache their digests; aggregate hash work is admitted before
  hashing. Review caught a misleading memory projection for that work budget;
  it now reports the existing CPU resource and truthful work/time remediation.
- Preserved CRC/hash disagreement facts under the existing strict/explicit
  untrusted-continuation policy. Unknown algorithms and signatures never acquire
  invented verification. Complete bad-CRC signature candidates retain their
  bytes and exact invalid facts rather than disappearing into prose.
- Reused the existing stable descriptor, bound SHA-256, copied stream and cleanup
  owner. Whole-carrier retention is explicitly byte-budgeted before allocation;
  payloads are views. Input growth, short reads and parser failure remain sticky,
  and finish cannot be reused. Nested metadata snapshots remain independent.
- Kept load/entry declarations separate from carrier offsets. Metadata and
  compact integrity observations retain format-specific checks without putting
  CRC/MD5 values into entry SHA-256 contradiction fields or repeating complete
  FIT configurations in inspection observations.

## Qualification

`verification.json` binds the frozen runtime (1,935 files) and changed sources.
Thirteen inert fixtures are independently constructed by Python struct/zlib/
hashlib, with exact hex/size/hash and expected stored payloads in
`fixture-receipt.json`. Binary inputs and outputs stay in owned temporary scratch;
Git retains text receipts and verified hex readback only.

- 249 selected tests pass across 18 files. They cover both new and existing
  firmware formats, real compiled CLI/stdio MCP, schema conversion, extraction,
  malformed input, cancellation/ownership, capacity, decoder lifetime, target
  snapshots and existing ZIP/Android-package/artifact controls. Source tests also
  exercise 4,097 uImage components, 1,025 FIT images and nine hashes beyond the
  former hidden caps, FDT v16/v17, 64-bit locators, overlap and digest reuse.
- 76 qualified MCP calls: 51 successful, 25 expected refusals. Actual advertised
  schemas, complete text/structured replies, named contracts and Evidence are
  checked; raw catalogs/replies/invocations/bundles are retained.
- 21 CLI calls: six complete current CLI/MCP Evidence pairs, eight complete
  historical HEX/S-record/UF2/DfuSe Evidence matches, four extraction manifest/
  file pairs and three expected refusals. Thirty file readbacks match independent
  expected payload hex, byte counts, source ranges and SHA-256.
- Arc's complete reducer Evidence remains exactly
  `ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45`:
  2,518 instructions / 10,072 bytes with the same fixed input, 2,537 seeds and
  one-second partial analysis policy. This was a warm-checkpoint static run.
- 34 historical snapshots authenticate unchanged captures or original living
  versions. Static, documentation, discovery (986 files) and package gates pass.
  The package still exposes 208 tools and six prompts. Owned process lineage is
  verified empty for qualification, compatibility, Arc and the package gate.

The first compiled test run caught an incorrect expected ESP fixture count (the
fixture has four segments plus one signature block); the assertion was corrected.
The first static gate found an unused copied fixture helper, which was removed.
An earlier focused-test directory selector was refused before any tests ran; exact
paths were then used. Initial logs remain separate from passing qualification.

## Remaining scope and authority

No payload is decompressed, decrypted or executed. Checksums/hashes establish
consistency, not publisher authenticity, trusted keys, eFuse policy or successful
boot. Signatures remain cryptographically unverified. Raw CPU/board loading,
peripheral models and device operations are separate. This macOS qualification
does not establish other hosts' workflows or complete devicetree interpretation.

Next: ESP flash-dump origin/layout, partition and OTA selection, then Android
boot/OTA and devicetree inspection. Recursive firmware expansion remains separate.
Full Arc feature/persistence analysis and Client unknown revision 3 remain open.
No Arc executable/helper/shipped JavaScript, account/profile, UI, service or
recorded URL was launched or used.
