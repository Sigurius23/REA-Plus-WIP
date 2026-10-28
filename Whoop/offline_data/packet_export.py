#!/usr/bin/env python3
"""Export stored WHOOP packet bytes from a stable, local Room v17 database."""

import argparse
from collections import Counter
from dataclasses import dataclass
import hashlib
import json
import math
import os
from pathlib import Path
import shutil
import sqlite3
import stat
import sys
import tempfile
import time


IDENTITY = "6e6c7540db7fb622e48555d647c1c077"
VERSION = 17
# name, declared type, NOT NULL, PK ordinal, default SQL. Column order is not
# compared: Room migrations can append columns in a different order.
SCHEMAS = {
    "table_metrics_data": [
        ("packet_revision", "INTEGER", 1, 0, None),
        ("timestamp", "INTEGER", 1, 1, None),
        ("packet_data", "BLOB", 1, 0, None),
        ("version_id", "INTEGER", 1, 0, None),
        ("frame_revision", "INTEGER", 1, 0, "1"),
    ],
    "sensor_data_packets": [
        ("timestamp", "INTEGER", 1, 1, None),
        ("packet_revision", "INTEGER", 1, 2, None),
        ("packet_data", "BLOB", 1, 0, None),
        ("version_id", "INTEGER", 1, 0, None),
    ],
    "console_packets": [
        ("id", "INTEGER", 1, 1, None),
        ("sequence_no", "INTEGER", 1, 0, "-1"),
        ("packet_time_stamp", "INTEGER", 1, 0, None),
        ("console_packets_metadata", "TEXT", 1, 0, None),
        ("received_packet_raw", "BLOB", 1, 0, None),
    ],
    "table_research_packets": [
        ("revision", "INTEGER", 1, 0, None),
        ("timestamp", "INTEGER", 1, 1, None),
        ("packetData", "BLOB", 1, 0, None),
        ("versionId", "INTEGER", 1, 0, None),
    ],
    "table_heart_data_versions": [
        ("version_id", "INTEGER", 1, 1, None),
        ("hardware_family", "INTEGER", 1, 0, None),
        ("pcba_revision", "INTEGER", 1, 0, None),
        ("optical_revision", "INTEGER", 1, 0, None),
        ("firmware_major", "INTEGER", 1, 0, None),
        ("firmware_minor", "INTEGER", 1, 0, None),
        ("firmware_build", "INTEGER", 1, 0, None),
        ("firmware_unreleased", "INTEGER", 1, 0, None),
        ("firmware_version", "TEXT", 1, 0, "''"),
        ("sigproc_major", "INTEGER", 1, 0, None),
        ("sigproc_minor", "INTEGER", 1, 0, None),
        ("sigproc_patch", "INTEGER", 1, 0, None),
        ("binary_version", "INTEGER", 1, 0, None),
        ("binary_flags", "INTEGER", 1, 0, None),
        ("strap_id", "TEXT", 1, 0, None),
    ],
}
ROOM_SCHEMA = [("id", "INTEGER", 0, 1, None), ("identity_hash", "TEXT", 0, 0, None)]
OPTIONAL = "table_heart_data_versions"
SUFFIXES = ("", "-wal", "-shm", "-journal")


class ExportError(Exception):
    pass


@dataclass(frozen=True)
class Limits:
    max_source_bytes: int = 512 * 1024 * 1024
    max_output_bytes: int = 512 * 1024 * 1024
    max_blob_bytes: int = 16 * 1024 * 1024
    max_text_bytes: int = 1024 * 1024
    max_rows: int = 250_000
    timeout_seconds: float = 120


def _metadata(st):
    return {"device": st.st_dev, "inode": st.st_ino, "size": st.st_size,
            "mtime_ns": st.st_mtime_ns, "ctime_ns": st.st_ctime_ns}


def _check_time(deadline):
    if time.monotonic() > deadline:
        raise ExportError("Time limit exceeded")


def _read_file(path, deadline, max_bytes, destination=None):
    """Hash with stable file identity; optional private staged copy, never writes source."""
    fd = os.open(path, os.O_RDONLY | os.O_NOFOLLOW | os.O_NONBLOCK)
    try:
        before = os.fstat(fd)
        if not stat.S_ISREG(before.st_mode):
            raise ExportError(f"Not a regular file: {path}")
        if before.st_size > max_bytes:
            raise ExportError("Source size limit exceeded")
        digest = hashlib.sha256()
        total = 0
        output = None
        try:
            if destination is not None:
                output = os.fdopen(os.open(destination, os.O_WRONLY | os.O_CREAT | os.O_EXCL, 0o600), "wb")
            while True:
                _check_time(deadline)
                chunk = os.read(fd, 1024 * 1024)
                if not chunk:
                    break
                total += len(chunk)
                if total > max_bytes:
                    raise ExportError("Source size limit exceeded")
                digest.update(chunk)
                if output is not None:
                    output.write(chunk)
        finally:
            if output is not None:
                output.close()
        after = os.fstat(fd)
        if _metadata(before) != _metadata(after) or total != before.st_size:
            raise ExportError(f"Source changed while reading: {path}")
        if _metadata(os.stat(path, follow_symlinks=False)) != _metadata(before):
            raise ExportError(f"Source was replaced while reading: {path}")
        return {**_metadata(before), "sha256": digest.hexdigest()}
    finally:
        os.close(fd)


def _snapshot(source, limits, deadline):
    files = {}
    remaining = limits.max_source_bytes
    for suffix in SUFFIXES:
        path = Path(str(source) + suffix)
        try:
            item = _read_file(path, deadline, remaining)
        except FileNotFoundError:
            if not suffix:
                raise ExportError("Source database is missing")
            files[suffix] = None
            continue
        if suffix == "-journal" and item["size"]:
            raise ExportError("Nonempty rollback journal: acquire a stable, closed database first")
        remaining -= item["size"]
        files[suffix] = item
    return files


def _stage(source, directory, limits, deadline):
    before = _snapshot(source, limits, deadline)
    staged = directory / "snapshot.sqlite"
    for suffix in ("", "-wal"):
        if before[suffix] is not None:
            copied = _read_file(Path(str(source) + suffix), deadline,
                                limits.max_source_bytes, Path(str(staged) + suffix))
            if copied != before[suffix]:
                raise ExportError("Source changed before/during copy")
    if _snapshot(source, limits, deadline) != before:
        raise ExportError("Source or sidecars changed during acquisition")
    return staged, before


def _quoted(name):
    return '"' + name.replace('"', '""') + '"'


def _validate_table(db, name, expected, tables):
    table = tables.get(name)
    if table is None or table[2] != "table" or table[4] or table[5]:
        raise ExportError(f"Missing or incompatible ordinary table: {name}")
    columns = db.execute(f"PRAGMA table_xinfo({_quoted(name)})").fetchall()
    actual = [(row[1], row[2].upper(), row[3], row[5], row[4]) for row in columns]
    if any(row[6] for row in columns) or sorted(actual) != sorted(expected):
        raise ExportError(f"Incompatible columns/defaults/primary key: {name}")
    if db.execute(f"PRAGMA foreign_key_list({_quoted(name)})").fetchone():
        raise ExportError(f"Unexpected foreign key: {name}")
    if any(row[3] != "pk" for row in db.execute(f"PRAGMA index_list({_quoted(name)})")):
        raise ExportError(f"Unexpected index: {name}")
    if db.execute("SELECT 1 FROM sqlite_schema WHERE type='trigger' AND tbl_name=?", (name,)).fetchone():
        raise ExportError(f"Unexpected trigger: {name}")
    return [{"name": c[0], "type": c[1], "not_null": bool(c[2]),
             "primary_key_position": c[3], "default_sql": c[4]} for c in actual]


def _inspect(db):
    version = db.execute("PRAGMA user_version").fetchone()[0]
    if version != VERSION:
        raise ExportError(f"Unsupported user_version {version}; only v17 is supported, no migration is performed")
    tables = {row[1]: row for row in db.execute("PRAGMA table_list") if row[0] == "main"}
    _validate_table(db, "room_master_table", ROOM_SCHEMA, tables)
    identity = db.execute("SELECT identity_hash FROM room_master_table WHERE id=42").fetchone()
    if identity != (IDENTITY,):
        raise ExportError("Unsupported Room identity hash (including legacy identity)")
    schema = {}
    for name, expected in SCHEMAS.items():
        if name == OPTIONAL and name not in tables:
            continue
        schema[name] = _validate_table(db, name, expected, tables)
    if db.execute("PRAGMA quick_check(1)").fetchone() != ("ok",):
        raise ExportError("SQLite quick_check failed")
    ignored = sorted(n for n in tables if n not in schema and n != "room_master_table" and not n.startswith("sqlite_"))
    return schema, ignored


def _json_bytes(value):
    return (json.dumps(value, sort_keys=True, ensure_ascii=True, allow_nan=False, separators=(",", ":")) + "\n").encode("ascii")


class _Output:
    def __init__(self, root, limits):
        self.root, self.limits, self.bytes = root, limits, 0

    def write(self, handle, content):
        self.bytes += len(content)
        if self.bytes > self.limits.max_output_bytes:
            raise ExportError("Output size limit exceeded")
        handle.write(content)

    def create(self, name):
        return os.fdopen(os.open(self.root / name, os.O_WRONLY | os.O_CREAT | os.O_EXCL, 0o600), "wb")


def _export_table(db, name, output, deadline, remaining_rows):
    columns = SCHEMAS[name]
    order = [c[0] for c in sorted(columns, key=lambda c: c[3]) if c[3]]
    sql = f"SELECT {','.join(_quoted(c[0]) for c in columns)} FROM {_quoted(name)} ORDER BY {','.join(_quoted(c) for c in order)}"
    digest, revisions, versions = hashlib.sha256(), Counter(), Counter()
    count = total_blob_bytes = 0
    minimum = maximum = None
    blob_minimum = blob_maximum = None
    version_column = next((c[0] for c in columns if c[0] in ("version_id", "versionId")), None)
    ndjson = name + ".ndjson"
    with output.create(ndjson) as handle:
        for row in db.execute(sql):
            _check_time(deadline)
            count += 1
            if count > remaining_rows:
                raise ExportError("Row limit exceeded")
            record = {}
            for column, value in zip(columns, row):
                key, kind = column[:2]
                expected = {"INTEGER": int, "TEXT": str, "BLOB": bytes}[kind]
                if type(value) is not expected:
                    raise ExportError(f"NULL or wrong SQLite value type in {name}.{key}")
                if kind == "INTEGER":
                    record[key] = str(value)
                elif kind == "TEXT":
                    if len(value.encode("utf-8")) > output.limits.max_text_bytes:
                        raise ExportError(f"Text size limit exceeded: {name}.{key}")
                    record[key] = value
                else:
                    if len(value) > output.limits.max_blob_bytes:
                        raise ExportError(f"BLOB size limit exceeded: {name}.{key}")
                    blob_hash = hashlib.sha256(value).hexdigest()
                    blob_path = f"blobs/{blob_hash}.bin"
                    if not (output.root / blob_path).exists():
                        with output.create(blob_path) as blob:
                            output.write(blob, value)
                    record[key] = {"path": blob_path, "sha256": blob_hash, "byte_length": len(value)}
                    total_blob_bytes += len(value)
                    blob_minimum = len(value) if blob_minimum is None else min(blob_minimum, len(value))
                    blob_maximum = len(value) if blob_maximum is None else max(blob_maximum, len(value))
            timestamp = next((row[i] for i, c in enumerate(columns) if c[0] in ("timestamp", "packet_time_stamp")), None)
            if timestamp is not None:
                minimum = timestamp if minimum is None else min(minimum, timestamp)
                maximum = timestamp if maximum is None else max(maximum, timestamp)
            if name == "table_metrics_data":
                revisions[(record["frame_revision"], record["packet_revision"])] += 1
            elif name in ("sensor_data_packets", "table_research_packets"):
                revisions[(record.get("packet_revision", record.get("revision")),)] += 1
            if version_column is not None:
                versions[record[version_column]] += 1
            line = _json_bytes(record)
            digest.update(line)
            output.write(handle, line)
    revision_counts, warnings = [], []
    for key, amount in sorted(revisions.items()):
        labels = ("frame_revision", "packet_revision") if len(key) == 2 else (("revision",) if name == "table_research_packets" else ("packet_revision",))
        revision_counts.append({**dict(zip(labels, key)), "row_count": amount})
        if name == "table_metrics_data":
            known = key in {(str(f), str(r)) for f, r in ((1, 9), (1, 12), (1, 18), (1, 24), (2, 1))}
        elif name == "sensor_data_packets":
            known = key[0] in ("25", "26")
        else:
            known = key[0] in ("7", "10", "11", "20", "21")
        if not known:
            warnings.append(f"{name}: revision {','.join(key)} outside observed app dispatch/upload selections; bytes preserved without decoding")
    return {"path": ndjson, "sha256": digest.hexdigest(), "row_count": count,
            "packet_blob_bytes_including_duplicates": total_blob_bytes,
            "blob_byte_length_min": blob_minimum, "blob_byte_length_max": blob_maximum,
            "timestamp_min": None if minimum is None else str(minimum),
            "timestamp_max": None if maximum is None else str(maximum),
            "timestamp_unit": "milliseconds" if name != OPTIONAL else None,
            "revision_counts": revision_counts,
            "version_counts": [{version_column: version, "row_count": amount}
                               for version, amount in sorted(versions.items(), key=lambda item: int(item[0]))]}, warnings


def export_database(source, destination, limits=Limits()):
    """Create a NEW private output directory. The source is only opened as bytes."""
    if any(value <= 0 for value in vars(limits).values()) or not math.isfinite(limits.timeout_seconds):
        raise ExportError("All limits must be positive and timeout must be finite")
    if sys.version_info < (3, 11):
        raise ExportError("Python 3.11 or newer is required")
    if sqlite3.sqlite_version_info < (3, 37, 0):
        raise ExportError("SQLite 3.37 or newer is required")
    source = Path(source).absolute()
    destination = Path(destination).absolute()
    if source.is_symlink():
        raise ExportError("Source database must not be a symlink")
    source = source.resolve(strict=True)
    destination = destination.parent.resolve(strict=True) / destination.name
    deadline = time.monotonic() + limits.timeout_seconds
    owned = None
    try:
        # mkdir is exclusive: never reuse, merge with, or remove an existing output.
        destination.mkdir(mode=0o700)
        owned = _metadata(destination.stat())
        (destination / "blobs").mkdir(mode=0o700)
        output = _Output(destination, limits)
        with tempfile.TemporaryDirectory(prefix="whoop-packets-") as temporary:
            staged, originals = _stage(source, Path(temporary), limits, deadline)
            # Do not use immutable=1: it would skip WAL recovery/visibility.
            db = sqlite3.connect(staged.as_uri() + "?mode=ro", uri=True, timeout=1)
            try:
                db.execute("PRAGMA query_only=ON")
                db.execute("PRAGMA trusted_schema=OFF")
                length_limit = min(db.getlimit(sqlite3.SQLITE_LIMIT_LENGTH),
                                   limits.max_blob_bytes + 2 * limits.max_text_bytes + 65536)
                db.setlimit(sqlite3.SQLITE_LIMIT_LENGTH, length_limit)
                db.set_progress_handler(lambda: int(time.monotonic() > deadline), 1000)
                db.execute("BEGIN")
                schema, ignored = _inspect(db)
                inventory, warnings = {}, []
                if OPTIONAL not in schema:
                    warnings.append("table_heart_data_versions is absent; version metadata cannot be resolved")
                total_rows = 0
                for name in sorted(schema):
                    item, notices = _export_table(db, name, output, deadline, limits.max_rows - total_rows)
                    inventory[name] = item
                    total_rows += item["row_count"]
                    warnings.extend(notices)
                db.rollback()
            finally:
                db.close()
            if _snapshot(source, limits, deadline) != originals:
                raise ExportError("Source or sidecars changed before export completed")
            manifest = {
                "format": "whoop-offline-packets-v1", "exporter_version": "1.0",
                "source_path": str(source), "source_files": {
                    source.name + suffix: item for suffix, item in originals.items()},
                "source_verification": "SHA-256, identity, size, mtime and ctime matched before copying, after copying, and before manifest publication",
                "sqlite_runtime": sqlite3.sqlite_version, "user_version": VERSION,
                "room_identity_hash": IDENTITY, "room_identity_is_authenticity_proof": False,
                "expected_schema_source": {
                    "application": "WHOOP Android 5.473.0 static decompile",
                    "xapk_sha256": "f6adb497107e62f1fd49ac140ea9125450cd5d3fb90c2ad409c1d2d7233af148",
                    "source": "whoop-src/sources/com/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl.java",
                    "create_tables_lines": "93-98", "delegate_line": 556,
                    "scope": "Four selected packet tables and optional table_heart_data_versions; not a full database or all raw-data export",
                },
                "validated_schema": schema, "unexported_tables": ignored,
                "tables": inventory, "warnings": warnings, "limits": vars(limits),
                "integer_encoding": "All database INTEGER values are decimal strings; inventory counts are JSON numbers",
                "blob_encoding": "Exact stored bytes; SHA-256 named files; identical BLOBs share a file",
                "interpretation": "Raw timestamp columns use app milliseconds; no sensor decoding, calibration, sampling rates, or derived scores",
                "consistency_scope": "Stable byte-copy acquisition with staged SQLite WAL handling and quick_check; not a live-database backup or proof of original capture consistency",
            }
            # The completion marker is the final file published. Failure removes
            # only the directory this invocation successfully created.
            with output.create(".manifest.tmp") as handle:
                output.write(handle, _json_bytes(manifest))
            os.replace(destination / ".manifest.tmp", destination / "manifest.json")
            return manifest
    except BaseException:
        if owned is not None:
            try:
                current = destination.lstat()
                if stat.S_ISDIR(current.st_mode) and (current.st_dev, current.st_ino) == (owned["device"], owned["inode"]):
                    shutil.rmtree(destination)
            except OSError:
                pass
        raise


def main(argv=None):
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("database", type=Path, help="stable local persistent_packet_db, with its captured -wal alongside it")
    parser.add_argument("output", type=Path, help="new output directory; parent must exist")
    for field, value in vars(Limits()).items():
        parser.add_argument("--" + field.replace("_", "-"), type=float if field == "timeout_seconds" else int, default=value)
    args = parser.parse_args(argv)
    try:
        limits = Limits(**{field: getattr(args, field) for field in vars(Limits())})
        manifest = export_database(args.database, args.output, limits)
    except sqlite3.Error as error:
        # SQLite's text decoding errors can include a fragment of source data.
        print(f"Export failed: staged SQLite read rejected ({type(error).__name__}); no completed export", file=sys.stderr)
        return 1
    except (ExportError, OSError, ValueError) as error:
        print(f"Export failed: {error}", file=sys.stderr)
        return 1
    print(f"Exported {sum(t['row_count'] for t in manifest['tables'].values())} rows to {args.output / 'manifest.json'}")
    for warning in manifest["warnings"]:
        print(f"Warning: {warning}", file=sys.stderr)
    return 0


if __name__ == "__main__":
    sys.exit(main())
