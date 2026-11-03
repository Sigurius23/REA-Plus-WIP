# Static resilient-witness verification, 2026-11-03

The final compiled public CLI and MCP recover one static resilient
requirement/witness pair for Arc's `BoostIDERequest` conformance. The normalized
results and Evidence IDs are identical:
`ev_120f75645ad89abfcf445e088cfc59b3deb8e4e9595b11375d0da7e52ff010c8`.
See `arc-selected.cli.evidence.json`, `arc-selected.mcp.evidence.json` and
`arc-public-validation.json`.

The input remains `/Applications/Arc.app/Contents/MacOS/Arc`, original universal
SHA-256 `e82d2a4245b6239860e41a149cb31c0c030e35b383456544c81f21d45ee03376`.
The command uses the existing explicit file/admission policy:

```sh
node scripts/rea.mjs inspect-native-dispatch-metadata /Applications/Arc.app/Contents/MacOS/Arc --facet swift-conformances --swift-conformance-address 0x1036a9f58 --max-records 20000 --max-file-bytes 268435456 --json
```

| Recovered fact | Value |
| --- | --- |
| Owning conformance | `0x1036a9f58`, file offset `143941464` |
| Static pair location | `0x1036a9f6c`, file offset `143941484` |
| Record ordinal | `0`; no runtime slot index is assigned |
| Protocol bind | `_$sSeMp` |
| Requirement bind | `_$sSe4fromxs7Decoder_p_tKcfCTq` |
| Bind library | `/usr/lib/swift/libswiftCore.dylib`, weak `false`, addend `0` |
| Implementation | `0x100537e18`, file offset `92093976` |
| Implementation classification | `executable_address` |
| Generic-control location | `0x1036a9f74`, file offset `143941492` |
| Runtime witness table | `not_instantiated` |

Decode remains partial. Imported requirement flags/function kind are unavailable.
The generic PrivateData relative fact retains target `0x1046cfb90` with null file
offset; this reader does not inspect that runtime storage. The static pair is
independent of those unknowns. The result does not invent a function name,
signature, runtime table order, table size, or requirement count from an
external image. It does not establish the implementation's application-level
behavior.

The exact selector was justified by observed admission: the first unselected
20,000-record Arc run exhausted its budget before this conformance. Selection
is restricted to indexed, non-null `__swift5_proto` rel32 entries, and coverage
explicitly states that it concerns the selected descriptor. It does not claim
whole-image completeness or raise either limit.

## Negative public checks

- Unindexed address `0x1036a9f59`: CLI/MCP return matching Evidence
  `ev_9283b38d3298acfcd2309e9de832561b6b010d2908274abd9dd8acac273dc2f5`,
  `matched: false`, no conformance/pair records, and scoped partial coverage.
- Selector with `facet: objc`: CLI exits `1` and MCP returns `isError: true`,
  both `invalid_request` / `invalid_input`, naming the facet requirement.
- A missing `0x` prefix fails the advertised SDK-converted input schema.
- Advertised input/output schemas validate against JSON Schema 2020-12; both
  selected and unindexed structured outputs validate against the actual MCP
  output schema. Their normalized results match CLI exactly.

## Owned-fixture verification

`fixture-public-validation.json` records the final CLI/MCP run against the
source-owned Swift library, SHA-256
`3a67059ba4e47c4ea6e52e2c3aaffd432e02d02c66eb23c6d22d2c7971d328cd`.
It recovers 32 conformances and 80 static resilient pairs. `Body` and `Request`
Decodable pair addresses match the separate compiler/symbol oracle at `0xd60`
and `0x1190`. The shared Evidence ID is
`ev_d2306ad25df0f1d37f8f7cfd040f01c90a89961a8758b032e173538591f4137d`.
The unselected selector field remains omitted. Neither Arc nor the owned
library was executed.

The final source test pass is 55/55 across four files, including null-index
selection, scoped absence, unsupported flags, malformed/truncated spans,
non-executable/nil targets, unknown generic runtime storage, record admission
and historical omission. See `../source-validation.json`. The parent owns the
final broader build/gate and ten-variant `verify:apple-dispatch` receipt.

Known unsupported cases remain explicit: unproved conditional/pack/retroactive
tail layouts and flag bits, unavailable external requirement flags, and runtime
witness-table instantiation/ordering/storage. The pinned format references are
the Swift `swift-5.9-RELEASE` ABI headers recorded in `../../proposal.md`.
