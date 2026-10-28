# Offline packet inventory and export

`packet_export.py` inventories four packet tables from an **already acquired, stable local** `persistent_packet_db`. It exports the exact stored BLOBs and row metadata, plus `table_heart_data_versions` when present. It does not access a device or network, run the app, decode sensor values, or calculate scores. No real user database was available during development; verification uses synthetic SQLite databases.

Requires Python 3.11+ with SQLite 3.37+. It uses only the Python standard library.

## Run

Run from this directory. Replace the input path with an existing local database; keep its captured `-wal` alongside it under the original filename. The output directory must not already exist. Its parent must exist.

```sh
mkdir -p artifacts
python3 packet_export.py /path/to/acquired/persistent_packet_db artifacts/capture-001
python3 -m unittest -v test_packet_export
```

`artifacts/` and `__pycache__/` are ignored locally. Exports may contain device identifiers and raw console metadata; output directories are created with permissions `0700` and files with `0600` (subject to a more restrictive umask). The tool never uploads them.

## Supported schema

The accepted schema comes from the static decompilation of WHOOP Android **5.473.0**, XAPK SHA-256 `f6adb497107e62f1fd49ac140ea9125450cd5d3fb90c2ad409c1d2d7233af148`:

- [Room create SQL](../whoop-src/sources/com/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl.java), lines 93–98, and version/identity declaration at line 556.
- Database name: [C32928j.java](../whoop-src/sources/sr2/C32928j.java), line 266.

It requires `PRAGMA user_version = 17` and Room identity row 42 equal to `6e6c7540db7fb622e48555d647c1c077`. It separately validates names, declared column types, nullability, defaults and primary-key positions; it rejects views, virtual/generated tables, foreign keys and unexpected indexes/triggers in the selected tables. A matching hash and schema **do not establish the source app's authenticity or version**. This is validation of the selected export schema, not full Room schema validation.

All other versions, including v16, and the alternate/legacy Room hash `c0f462397688da90d9dc22c8c3d1de88` are explicitly rejected. No migration or repair is attempted. The four packet tables are mandatory. Heart metadata is optional; its absence produces a warning, and incompatible heart columns produce an error.

| Table | Primary key | Other preserved columns |
| --- | --- | --- |
| `table_metrics_data` | `timestamp` | `packet_revision`, `packet_data`, `version_id`, `frame_revision` (default 1) |
| `sensor_data_packets` | `timestamp`, `packet_revision` | `packet_data`, `version_id` |
| `console_packets` | `id` | `sequence_no` (default -1), `packet_time_stamp`, `console_packets_metadata`, `received_packet_raw` |
| `table_research_packets` | `timestamp` | `revision`, `packetData`, `versionId` |
| `table_heart_data_versions` | `version_id` | `hardware_family`, `pcba_revision`, `optical_revision`, `firmware_major`, `firmware_minor`, `firmware_build`, `firmware_unreleased`, `firmware_version`, `sigproc_major`, `sigproc_minor`, `sigproc_patch`, `binary_version`, `binary_flags`, `strap_id` |

Heart/version IDs are preserved, not automatically joined or treated as SQL foreign keys. Other tables, including `table_rev2_raw_data`, `table_rev2_data_settings`, firmware, memfault and battery-pack packets, are **not exported** and appear in `unexported_tables`. This is a selected packet export, not a complete raw-data export.

## Source preservation and consistency

1. Open the original database and existing `-wal`, `-shm`, `-journal` as byte streams only. Hash each file and record identity, size, modification time and change time. Reject symlinks/nonregular files and any nonempty rollback journal, conservatively including an inactive nonempty journal.
2. Copy only the database and WAL into an owned private temporary directory, verifying copy hashes. Rehash the original set and reject any change or sidecar appearance/disappearance. SHM is recorded but not copied; SQLite builds its own staged WAL index.
3. Open **only the staged database** using SQLite `mode=ro`, with `query_only=ON`, `trusted_schema=OFF` and a read transaction. Validate the selected schema and run `quick_check(1)`. Do not use `immutable=1`, which would miss WAL contents.
4. Export, then recheck the originals again. Publish `manifest.json` last as the completion marker. On failure, remove only the output directory created by this invocation; an existing output directory is never reused or removed. Temporary staged files are cleaned up.

Use a stable capture, not a database still being written. Hash checks detect changes during this run; they cannot prove the earlier acquisition was consistent or determine whether a missing WAL was omitted before the tool ran. SQLite decides which WAL frames are committed/valid; the tool performs no recovery of uncommitted or orphaned data. It reads originals without writing or checkpointing them; normal filesystem access-time updates from reads are outside the checked metadata. Cancellation/process death or a cleanup failure can leave an incomplete directory without a manifest; do not treat it as a successful export.

## Export format

Each selected table has a `<table>.ndjson` file ordered by its primary key. Every row retains the exact database column names. All SQLite INTEGER values become **decimal strings**, including timestamps, revisions, version IDs, sequence numbers and hardware/firmware fields. This preserves 64-bit integers through JavaScript/JSON consumers. Text remains text, including the console metadata's whitespace and any unknown JSON keys; it is not parsed or normalized. Invalid UTF-8, NULLs or wrong SQLite storage types are rejected rather than coerced.

Each BLOB is replaced in the row by a descriptor:

```json
{"byte_length":4,"path":"blobs/<sha256>.bin","sha256":"<sha256>"}
```

The `.bin` contains the exact stored bytes. Identical BLOBs share one hash-named file; rows remain distinct. Empty BLOBs are preserved. DAO bindings store `ByteBuffer.array()` and reconstruct with `ByteBuffer.wrap()`: [metrics](../whoop-src/sources/mu0/C25953e.java) lines 44–49/92, [sensor](../whoop-src/sources/hu0/C17642c.java) lines 38–43, [research](../whoop-src/sources/qu0/C30624c.java) lines 39–44, and [console](../whoop-src/sources/yt0/C39767f.java) lines 47–57. The exporter does not remove framing or reinterpret those bytes.

The manifest records source and sidecar SHA-256/metadata, expected-schema provenance, actual validated columns, SQLite runtime, limits, unexported tables, row-file hashes, row counts, raw timestamp ranges, BLOB length ranges, revision counts, and counts by `version_id`/`versionId`. Counts and BLOB lengths are JSON numbers; database INTEGER values remain strings. NDJSON and blob names are deterministic for the same rows. Source paths, filesystem metadata, runtime and options can make manifests differ.

The app uses milliseconds for the exported timestamp columns. See [C14554a.java](../whoop-src/sources/fk2/C14554a.java) lines 208–209, sensor insertion [C16935a.java](../whoop-src/sources/h52/C16935a.java) line 87, research insertion [C39263b.java](../whoop-src/sources/y62/C39263b.java) line 143, metrics ingestion [C0919g.java](../whoop-src/sources/ai2/C0919g.java) lines 161/167 and persistence [C36966a.java](../whoop-src/sources/w92/C36966a.java) lines 911/935, and console consumption [C16226a.java](../whoop-src/sources/gv0/C16226a.java) line 303. Raw integers are retained; no timezone conversion or claim about device clock accuracy is made. Embedded timestamps inside arbitrary packet bytes remain uninterpreted.

Unknown revisions are exported with warnings. The comparison sets are observations from this app, not protocol specifications: metrics frame 1 revisions 9/12/18/24 and frame 2 type 1 ([ingest selection](../whoop-src/sources/bi2/AbstractC3289e.java) line 15; [frame mapping](../whoop-src/sources/lt0/InterfaceC24730g.java) lines 54–61/94–101); sensor uploader revisions 25/26 ([C21342c.java](../whoop-src/sources/j52/C21342c.java) line 255); research wrapper revisions 7/10/11/20/21 ([AbstractC27120h.java](../whoop-src/sources/nt0/AbstractC27120h.java) lines 40–56). Console has no revision column in this schema. No score, sampling rate or calibrated sensor interpretation follows from these revision numbers.

## Bounds and checks

Defaults are 512 MiB total original files, 512 MiB output, 16 MiB per BLOB, 1 MiB UTF-8 per text value, 250,000 total exported rows, and a cooperative 120-second processing limit. Staging space is additional to the output bound. Adjust with `--max-source-bytes`, `--max-output-bytes`, `--max-blob-bytes`, `--max-text-bytes`, `--max-rows`, and `--timeout-seconds`; see `--help`. SQLite's own row-length ceiling still applies. Timeout checks run between file chunks/rows and in SQLite's progress callback; they do not interrupt a blocked operating-system read.

The unittest suite creates real tiny SQLite databases. It checks committed uncheckpointed WAL visibility, staged-only SQLite opens, original DB/WAL/SHM hashes and metadata, exact BLOBs and large integers, composite-key order, metadata text, deterministic NDJSON, private output permissions, optional heart metadata, legacy versions/identity, malformed schema and NULL/storage types, rollback journals, concurrent sidecar changes, limits, existing-output preservation, and cleanup if final manifest publication fails.
