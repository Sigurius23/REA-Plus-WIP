# Firmware analysis

REA+ accepts **Binwalk 3.1.x** for region inspection and **Unblob 26.6.x** for
explicit extraction. The report parsers are verified with Binwalk 3.1.0 and
Unblob 26.6.4. Another build on those lines is accepted, the observed version
is reported, and a limitation records that the parser was not verified against
that build. This first firmware milestone is verified on Linux x64.
No device, root privilege, mount, emulation or execution of extracted programs
is needed. Arbitrary firmware bytes do not pass native executable admission;
select a returned ELF separately for supported Ghidra analysis.

## Intel HEX and Motorola S-record

Use the built-in artifact workflow for these text carriers; no Binwalk, Unblob
or native engine is required:

```sh
rea inspect-artifact ./firmware.hex --json
rea extract-artifact ./firmware.srec --json
```

In MCP, open the carrier with `open_binary`, then call `inspect_artifact` or
`extract_artifact`. Recognition requires a complete checksum-valid first record
at byte zero, independently of its filename. LF/CRLF lines and a final line
without a newline are supported. BOMs, leading blank lines, arbitrary comments
and vendor record extensions are outside this recognition profile. Other
already-recognized package formats keep their existing admission precedence.

The root occurrence's `format_metadata` reports encoding/variant, record and
payload counts, duplicate bytes, termination, header and declared start facts.
Intel types 00–05 and Motorola S0/1/2/3/5/6/7/8/9 are decoded. S0 header address
and source line are retained; that address is not a load address. An S5/S6 count
is checked against cumulative preceding data records at its own line, with an
explicit caveat when later records or multiple declarations make it unsuitable
as a final-file count certificate. CS:IP and linear starts remain declarations,
not observed execution or inferred processor settings.

Each child is an address-contiguous region with inclusive bounds, contributing
record count and line span. Identical overlaps are counted; conflicting writes
are refused. Gaps stay unwritten and produce separate files. Equal region
payloads can share a content node while keeping distinct occurrence addresses.
`source_location` is null: decoded addresses are not carrier-file offsets.
Checksums, data lengths and address bounds are checked for the whole carrier
before regions are exposed. A missing terminator preserves decoded data with an
explicit truncation caveat. Intel data records crossing the 16-bit offset boundary
are refused because supported producer interpretations disagree on wrapping.
Checksums establish record consistency, not authenticity or safe device use.

`extract_artifact` materializes the regions into its returned new temporary
directory, using existing containment/hash/cleanup checks. The carrier is never
modified. This slice decodes a selected root carrier; firmware members nested
inside other packages can be classified but are not recursively decoded.
Select their extracted carrier explicitly for a new inspection. Raw CPU loading,
board memory maps, peripheral models, device acquisition and flashing are
separate capabilities.

Optional `max_firmware_file_bytes` and `max_firmware_runs` inputs control decoder
allocation and retained run metadata. Defaults are 134217728 carrier bytes and
65536 address-discontiguous record runs. The payload arena is at most half the
carrier size and merging temporarily needs another payload copy; graph/metadata
cost is additional. These are resource policies, not format limits. CLI accepts
`--max-firmware-file-bytes` and `--max-firmware-runs`. Limits fail before the
allocation/admission they control, report `resource_constraint`, and name the
knob to change. Unchanged limits reproduce the refusal. The run knob also applies to UF2 and the byte knob to DfuSe; unrelated active
formats refuse these knobs rather than ignoring them. The schema, source
Evidence and exported bundle retain explicit caller choices.

The format references are [Keil's Intel HEX guide](https://www.keil.com/support/docs/1584/default.htm)
and the [SRecord project's format manual](https://srecord.sourceforge.net/reference-1.65.pdf).
The current filesystem/CLI/MCP qualification was run on macOS; it does not
establish a board's behavior or native analysis of raw firmware regions.

## UF2 and DfuSe carriers

These binary carriers use the same built-in workflow without external tools:

```sh
rea inspect-artifact ./firmware.uf2 --max-firmware-runs 65536 --json
rea inspect-artifact ./firmware.dfu --max-firmware-elements 65536 --json
rea extract-artifact ./firmware.dfu --json
```

UF2 recognition requires a complete first 512-byte block with all three magic
numbers. Main-flash bytes are grouped by declared family ID and address; separate
families never merge. Identical overlaps are counted, conflicting writes fail,
and gaps remain separate. Region paths include the family ID, including a
separate `no-family` space. Family names come from the revisioned registry named
in root metadata; they do not identify an attached device. Numbering facts retain
missing, repeated, out-of-order and ambiguous-copy counts. Invalid later blocks
and trailing bytes leave explicit unknown `main_flash_coverage`. Not-main-flash payloads are
counted and excluded. File-container blocks are counted without reconstructing
their files. MD5 and extension tags are counted, **not decoded or verified**.
UF2 region `source_location` is null because payloads are reassembled; load
addresses are not carrier offsets.

DfuSe recognition checks both its version-1 prefix and DFU 1.1a suffix. The parser
checks target/element sizes and address bounds, retaining each nonempty element
separately even when addresses overlap. Metadata preserves all targets, including
empty ones, their alternate settings, names and the complete raw name fields.
Each element retains its actual contiguous carrier payload offset separately
from its declared load address. Both known `DFUImageSize` variants (including or
excluding the suffix) are accepted after actual file and target bounds agree.

The DfuSe suffix CRC is calculated over the carrier except its final four-byte
CRC field. A mismatch fails inspection/extraction by default. Explicit
`integrity_policy: "record-and-continue"` (CLI `--integrity-policy
record-and-continue`) retains the exact declared/computed CRC pair in root
`format_metadata`, an `integrity` observation in inspection, and
`observed-untrusted` limitations on the carrier, derived elements and extraction.
The existing `integrity_contradictions` array describes entry SHA-256
disagreements; CRC values never occupy SHA-256 fields. A matching CRC establishes
consistency, not authenticity.

`max_firmware_file_bytes` also applies to UF2/DfuSe (default 134217728).
`max_firmware_runs` bounds UF2 retained runs **before** address merging (default
65536), so reverse-ordered blocks may need a larger run budget even when they
finally merge. `max_firmware_elements` bounds all DfuSe declarations, including
empty elements (default 65536). Irrelevant format knobs are refused. UF2 payload
storage is at most 476/512 of the admitted carrier plus a temporary merge copy;
DfuSe retains one carrier and element views. Graph and metadata storage are
additional. The same source identity, cancellation, containment and cleanup
rules apply as for text firmware. Root-carrier decoding does not add recursive
firmware decoding, CPU selection, board operation or flashing.

Format references: [Microsoft UF2 specification](https://github.com/microsoft/uf2),
[ST UM0391](https://community.st.com/ysqtg83639/attachments/ysqtg83639/stm32-mcu-products-forum/41233/1/UM0391.pdf),
and [dfu-util's producer](https://github.com/TexasInstruments/dfu-util/blob/master/dfuse-pack.py).

## U-Boot uImage/FIT and ESP32-family images

These root carriers also use `open_binary` plus `inspect_artifact` and
`extract_artifact`, or the equivalent CLI commands. Stored compression/cipher
bytes are preserved; no decompression, decryption or execution is performed.
Each extracted range has its real carrier offset, separately from any declared
load/entry address. Names and architecture IDs/labels do not establish device
identity, a valid load map or observed execution.

uImage retains the 64-byte header, raw name field, enum IDs and pinned name-table
revision, load/entry declarations, timestamps and exact header/payload CRC pairs.
Multi-image/script size tables produce separate component files alongside the
complete payload. Component alignment, truncation and size overruns are checked;
slack/trailing bytes remain explicit unknown coverage. `max_firmware_elements`
counts the payload entry plus every component, without a hidden 4096-image cap.

FIT validates the FDT structure, reservation/string extents and unique node/
property identity, then exposes `/images` inline or external data ranges.
`data-position` is absolute; `data-offset` is relative to the aligned FDT end.
Safe one/two-cell locators are supported. Overlapping ranges remain separate
with explicit metadata. Inconsistent `image-data` ownership declarations fail.
Configurations/default references and unresolved names survive. Supported
CRC32/MD5/SHA1/SHA256/SHA384/SHA512 hashes retain declared/computed values; unknown
algorithms and signature declarations remain unverified. Neither stored hashes
nor signatures establish trusted boot selection. Recognition scans the declared
FDT structure in bounded windows, skips opaque property data, and finds `/images`
after the former 4-KiB window. Plain DTBs are outside this FIT workflow.

ESP32-family images retain header/chip-table facts, segment ranges, descriptor
fields, XOR checksum, appended SHA-256 and Secure Boot v2 signature candidates.
Exact signature-slot CRC and image-digest facts are separate from cryptographic
signature authentication, which is **not performed**. Complete candidates with
bad CRCs remain inspectable under explicit untrusted continuation. Truncated
segments and undescribed trailing ranges preserve unknown coverage. ESP8266
8-byte-header images are explicitly unsupported. Flash origin, partition/OTA
selection, eFuse policy, peripheral state and boot readiness remain unknown.

The existing `integrity_policy` applies to supported CRC/hash disagreements:
default `fail` refuses; explicit `record-and-continue` retains exact facts and
observed-untrusted limitations. Format-specific checks stay in occurrence
metadata and compact inspection integrity observations, separately from entry
SHA-256 disagreement records. Malformed structure is refused under either policy.

All three formats admit a retained carrier before allocation using
`max_firmware_file_bytes` (default 134217728). FIT/uImage also use
`max_firmware_elements` (65536). FIT adds independently controlled tree nodes
(65536), properties/reservations (262144), nesting depth (256), metadata bytes
(33554432) and aggregate supported-hash byte work (1073741824). The inputs are
`max_firmware_tree_nodes`, `max_firmware_tree_properties`,
`max_firmware_tree_depth`, `max_firmware_metadata_bytes` and
`max_firmware_hash_bytes`; CLI spells underscores as hyphens. Admission happens
before the controlled expansion/work. Repeated algorithm/range digests are
reused. Hash-work refusals report a CPU resource constraint; metadata/tree
refusals report memory. These are caller policies, not format ceilings. Raising
a budget accepts its memory/work cost; unchanged limits reproduce the refusal.
Irrelevant knobs are rejected. Payload views share one retained carrier;
metadata, graph, serialization and output file storage are additional.

References: [U-Boot image declarations](https://github.com/u-boot/u-boot/blob/ece349ade2973e220f524ce59e59711cc919263f/include/image.h),
[FIT format](https://docs.u-boot.org/en/v2024.07/usage/fit/source_file_format.html),
[ESP image format](https://docs.espressif.com/projects/esptool/en/latest/esp32s2/advanced-topics/firmware-image-format.html)
and [Secure Boot v2](https://docs.espressif.com/projects/esp-idf/en/latest/esp32/security/secure-boot-v2.html).

## Caller-supplied tools

Provide existing tools using absolute executable paths, scoped to your shell:

```sh
export REA_BINWALK_COMMAND=/absolute/path/to/binwalk
export REA_UNBLOB_COMMAND=/absolute/path/to/unblob
```

REA+ does not install these tools, their dependencies or system packages. It
checks the tool's `--version` banner when executing a request. Binwalk must
print `binwalk <version>` and Unblob must print the version alone. Inspection and
extraction have independent prerequisites; one does not require the other.
Both require util-linux `prlimit`, normally `/usr/bin/prlimit`; override its
absolute path with `REA_FIRMWARE_PRLIMIT_COMMAND` if needed.

REA+ retains at most 8 MiB of combined stdout and stderr per command. Exceeding
that diagnostic budget stops analysis with an explicit truncated-output error;
child process limits do not bound parent-side pipe retention. Completed commands
drain their output streams before recording diagnostics. Failed worker cleanup
retains the worker and workspace for retry before another request or at shutdown.

Unblob needs the external extractor for the selected format on its inherited
`PATH`: for example, `debugfs` for ext2/ext3/ext4. Its default Landlock sandbox
and skip rules stay enabled. Sandbox startup failures remain actionable errors;
REA+ does not retry with `--no-sandbox`. Missing extractors reported in a valid
analysis report retain partial results and dependency names inline.

Upstream sources are preserved unmodified as optional pinned submodules:

```sh
git submodule update --init third_party/binwalk third_party/unblob
```

Normal REA+ builds and npm packages do not include or build these sources or
engine binaries. See [upstream provenance](https://github.com/morluto/rea/blob/main/third_party/README.md).

## CLI and MCP

```sh
rea inspect-firmware-regions /path/to/firmware.bin
rea extract-firmware /path/to/firmware.bin /path/to/new-output
rea extract-firmware /path/to/firmware.bin /path/to/selected-output \
  --offset 64 --length 4096 --max-depth 3
```

The corresponding MCP tools accept the same intent:

```json
{
  "name": "inspect_firmware_regions",
  "arguments": { "path": "/path/to/firmware.bin" }
}
```

```json
{
  "name": "extract_firmware",
  "arguments": {
    "path": "/path/to/firmware.bin",
    "output_directory": "/path/to/new-output",
    "range": { "offset": 64, "length": 4096 },
    "max_depth": 3
  }
}
```

Both return Evidence with the original path and SHA-256, raw producer reports,
actual executable path/digest, version and limitations. Binwalk signature UUIDs
and Unblob blob IDs are producer-local identities; compare content hashes and
source ranges across runs. A matching version does not attest an installed
build's source revision, so that field remains unknown.

### Interpret the results

- Region offsets refer to bytes in the original firmware. `reported_size`
  preserves Binwalk's output; `size_basis=provider_reported_validation_unknown`
  reflects that Binwalk can replace unknown lengths with the next signature or
  EOF before serialization. Neither a signature nor its confidence byte proves
  a valid partition, encryption or runtime behavior.
- Extraction returns regular file paths, independently verified SHA-256 values,
  producer hashes when available, chunks, diagnostics and task derivations.
  Unblob's task report is unordered; REA+ resolves relationships by paths and
  blob IDs. Logical references use `$input`, `$output`, or `$output/<relative-path>`
  so a real file named `$input` stays distinct from the original input.
  Chunk offsets belong to the task's input file. Only chunks in the
  selected input have a known `root_file_range`, adjusted by the selected offset.
- Decompressed children have unknown original byte ranges and runtime addresses.
  Task lineage does not establish a byte-for-byte mapping through decompression.
- `partial` marks unknown/encrypted chunks, reported extraction problems,
  unpublished links/special files or reached depth limits. `complete` means the
  engine finished its configured extraction without those reported conditions;
  default skip rules and format coverage still apply. It does not establish
  complete firmware reconstruction.
- The destination must be absent, absolute, with an existing parent. Publication
  uses exclusive, symlink-resistant writes and durable digest readback. Existing
  destinations are never overwritten. This is not an atomic directory rename:
  a new tree can be visible while files are written. Failed uncommitted output
  is rolled back. Symlinks and special files are recorded without publication;
  empty directories, ownership and executable permission bits are not reproduced.

Select a verified native child for the existing tools:

```json
{
  "name": "open_binary",
  "arguments": {
    "path": "/path/from/extraction/usr/bin/program",
    "provider_id": "ghidra"
  }
}
```

Then use `analyze_function`, `inspect_native_api` or the other native primitives.
Native architecture and executable validation still apply. This milestone does
not add MIPS/PPC/RISC-V decompilation, raw flash load profiles, bootloader/device
tree semantics, vulnerability scanning, emulation or hardware runtime capture.

## Resource and lifecycle policy

- Nonempty regular firmware inputs: at most **128 MiB**, copied and hashed into
  a private workspace before analysis. No in-place source modification.
- One queued heavy operation per provider instance; Binwalk one thread and
  Unblob one worker. No automatic parallel extraction engines.
- **120-second** deadline; inherited **1 GiB per-process address-space** limit,
  120 CPU seconds and zero core-dump allowance through `prlimit`.
- JSON reports: at most **8 MiB** and valid UTF-8; malformed encoding and
  oversized reports fail without repairing or truncating producer data.
  Diagnostic output is bounded with exact captured byte counts.
- Default staging budget: **256 MiB** and **10,000 entries**, configurable using
  `max_output_bytes` / `max_output_files` (CLI `--max-output-bytes` /
  `--max-output-files`). Depth defaults to 3, allowed range 1–10.

Staging budgets are polled and rechecked after exit; short-lived overshoot is
possible. The inherited file-size limit bounds each file, not total storage;
address-space limits are per process, not an aggregate memory quota. Worker
count is not CPU affinity for every external extractor. These limits do not
claim cgroup/container containment. Cancellation cleans the owned process group
before removing its workspace; uncertain cleanup retains resources and blocks
further operations in that provider instance.

## Verification

Generate small public, source-derived fixtures into ignored `_reference/`:

```sh
npm run fixtures:firmware
npm run verify:firmware
```

Fixture generation requires existing Python 3 and a host C compiler (`cc`);
override with `REA_FIRMWARE_PYTHON` / `REA_FIRMWARE_CC`. The independent oracle
records gzip offset/length and extracted file hashes. Real verification checks
CLI/MCP, full-file and selected-range extraction, unknown chunks, depth limits,
content parity and unchanged source bytes. No binary fixture is committed.

Additional lanes are explicit, so the base lane stays small:

```sh
# Existing mke2fs and debugfs required; put debugfs on the scoped PATH.
REA_FIRMWARE_VERIFY_EXT4=1 npm run fixtures:firmware
REA_FIRMWARE_VERIFY_EXT4=1 npm run verify:firmware

# Existing Ghidra 12.1.x and its declared JDK required.
REA_FIRMWARE_VERIFY_GHIDRA=1 npm run verify:firmware
```

`REA_FIRMWARE_MKE2FS_COMMAND` selects the optional ext4 fixture producer.
`REA_FIRMWARE_FIXTURE_ROOT` selects generated data storage.
`REA_FIRMWARE_TEST_ENTRYPOINT` can select an isolated installed npm package's
`scripts/rea.mjs` to verify the packaged CLI/MCP workflow. Real coverage here is
generated gzip/USTAR/ext4 with a Linux x64 ELF child; SquashFS, UBIFS, proprietary
firmware, other hosts and architectures remain unverified.
