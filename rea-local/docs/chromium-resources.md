# Chromium resource packs

`inspect_chromium_resources` / `rea inspect-chromium-resources` reads one explicit
local Chromium DataPack v4/v5. It requires no active binary, browser, engine or
installation. It does not execute scripts or contact URLs.

```sh
rea inspect-chromium-resources /artifacts/resources.pak --limit 32 --json
rea inspect-chromium-resources /artifacts/resources.pak --resource-id 100 --json
rea inspect-chromium-resources /artifacts/resources.pak --resource-id 100 --stored --json
```

The corresponding MCP input is:

```json
{
  "path": "/artifacts/resources.pak",
  "offset": 0,
  "limit": 32,
  "resource_id": 100,
  "decode": true,
  "max_file_bytes": 67108864,
  "max_resource_bytes": 1048576
}
```

Omit `resource_id` to inventory only. Pages use ascending numeric resource IDs,
including aliases. The complete declared index is validated before paging;
`page.next_offset` identifies a continuation. Each returned identity preserves
its own table location, canonical target, stored range/hash and compression
candidate. Alias targets are canonical-table indices, not other aliases.

A selected ID returns complete `resource.bytes_hex`, byte count and SHA-256.
These describe stored bytes with `decode:false` (CLI `--stored`), or decoded
bytes otherwise. Gzip and Chromium-envelope Brotli are supported. Unselected
payloads are not decompressed. Gzip's trailer size is a last-member modulo size,
not a promised total for concatenated members. Brotli's envelope size is checked
against both the budget and actual decoded length; trailing compressed input is
rejected. Markers alone do not establish valid compression. Outer compressed
pack wrappers are outside this initial profile.

Pack encoding is a hint: binary resources can occur in a text pack. The optional
strict UTF-8/UTF-16LE preview is at most 4,096 code units; the complete hex bytes
remain authoritative. No filenames, MIME types or feature names are invented.
To analyze extracted JavaScript, write those exact decoded bytes to a caller-
selected new file, retain the pack/ID/decoded digest relationship, then analyze
that inert file. An analyst-chosen filename is an assumption, not recovered
metadata.

The default stable file budget is 64 MiB, selectable through `max_file_bytes`
(CLI `--max-file-bytes`) up to 512 MiB. Both stored and decoded selected content
are bounded by `max_resource_bytes` (CLI `--max-resource-bytes`), default 1 MiB,
maximum 8 MiB. Declared sizes are checked before decoding; native codecs enforce
output bounds. Large complete Evidence can exceed MCP transport: use the
returned retained reference and `export_evidence_bundle` rather than repeating
analysis. These are snapshot/output limits, not an RSS guarantee.

The strict index profile checks sorted unique IDs, direct alias bounds,
nondecreasing payload offsets, and no index/payload overlap. It preserves
nonzero padding, a positional sentinel's raw ID, empty resources, and unclaimed
ranges before data or after the sentinel. Index completeness says nothing about
runtime loading, rendering, or complete application behavior. Unsupported,
malformed, changed, cancelled and resource-limited requests retain typed errors.

Format references: Chromium's [GRIT reader/writer](https://chromium.googlesource.com/chromium/src/tools/grit/+/refs/heads/main/grit/format/data_pack.py),
[DataPack implementation](https://chromium.googlesource.com/chromium/src/+/refs/heads/main/ui/base/resource/data_pack.cc),
and [resource compression producer](https://raw.githubusercontent.com/chromium/chromium/main/tools/grit/grit/node/base.py).
Validation choices above describe REA+'s profile, not every Chromium reader.
