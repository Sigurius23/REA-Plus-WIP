"""Real SQLite fixtures; no device data, network, or target application needed."""

from dataclasses import replace
import hashlib
import json
import os
from pathlib import Path
import sqlite3
import stat
import tempfile
import unittest
from unittest.mock import patch

import packet_export as exporter


# Kept independently of the exporter descriptors: copied from Room create SQL.
DDL = """
CREATE TABLE table_metrics_data (packet_revision INTEGER NOT NULL, timestamp INTEGER NOT NULL, packet_data BLOB NOT NULL, version_id INTEGER NOT NULL, frame_revision INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(timestamp));
CREATE TABLE sensor_data_packets (timestamp INTEGER NOT NULL, packet_revision INTEGER NOT NULL, packet_data BLOB NOT NULL, version_id INTEGER NOT NULL, PRIMARY KEY(timestamp, packet_revision));
CREATE TABLE console_packets (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sequence_no INTEGER NOT NULL DEFAULT -1, packet_time_stamp INTEGER NOT NULL, console_packets_metadata TEXT NOT NULL, received_packet_raw BLOB NOT NULL);
CREATE TABLE table_research_packets (revision INTEGER NOT NULL, timestamp INTEGER NOT NULL, packetData BLOB NOT NULL, versionId INTEGER NOT NULL, PRIMARY KEY(timestamp));
CREATE TABLE room_master_table (id INTEGER PRIMARY KEY, identity_hash TEXT);
INSERT INTO room_master_table VALUES (42, '6e6c7540db7fb622e48555d647c1c077');
PRAGMA user_version=17;
"""
HEART_DDL = """
CREATE TABLE table_heart_data_versions (version_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, hardware_family INTEGER NOT NULL, pcba_revision INTEGER NOT NULL, optical_revision INTEGER NOT NULL, firmware_major INTEGER NOT NULL, firmware_minor INTEGER NOT NULL, firmware_build INTEGER NOT NULL, firmware_unreleased INTEGER NOT NULL, firmware_version TEXT NOT NULL DEFAULT '', sigproc_major INTEGER NOT NULL, sigproc_minor INTEGER NOT NULL, sigproc_patch INTEGER NOT NULL, binary_version INTEGER NOT NULL, binary_flags INTEGER NOT NULL, strap_id TEXT NOT NULL);
"""


def file_state(source):
    result = {}
    for suffix in exporter.SUFFIXES:
        path = Path(str(source) + suffix)
        if path.exists():
            st = path.stat()
            result[suffix] = (st.st_ino, st.st_size, st.st_mtime_ns, st.st_ctime_ns,
                              hashlib.sha256(path.read_bytes()).hexdigest())
    return result


class PacketExportTests(unittest.TestCase):
    def setUp(self):
        self.temporary = tempfile.TemporaryDirectory()
        self.addCleanup(self.temporary.cleanup)
        self.root = Path(self.temporary.name)
        self.source = self.root / "persistent_packet_db"
        self.output = self.root / "export"

    def database(self, *, heart=True):
        db = sqlite3.connect(self.source)
        db.executescript(DDL + (HEART_DDL if heart else ""))
        db.commit()
        return db

    def rows(self, table, output=None):
        return [json.loads(line) for line in ((output or self.output) / (table + ".ndjson")).read_text().splitlines()]

    def assert_rejected(self, match, limits=exporter.Limits()):
        before = file_state(self.source)
        with self.assertRaisesRegex(exporter.ExportError, match):
            exporter.export_database(self.source, self.output, limits)
        self.assertEqual(before, file_state(self.source))
        self.assertFalse(self.output.exists())

    def test_exact_bytes_integers_metadata_order_and_determinism(self):
        metadata = '{ "strapId": "fixture-only", "extra": [1, 2], "unicode": "µ" }\n'
        blob = b"\x00\xff\x01\x00"
        with self.database() as db:
            db.executemany("INSERT INTO table_metrics_data VALUES(?,?,?,?,?)", [
                (777, 9007199254740993, blob, 11, 1), (9, -1, blob, 11, 1)])
            db.executemany("INSERT INTO sensor_data_packets VALUES(?,?,?,?)", [(4, 26, b"", 11), (4, 25, blob, 11)])
            db.execute("INSERT INTO table_research_packets VALUES(?,?,?,?)", (7, 8, blob, 11))
            db.execute("INSERT INTO console_packets VALUES(?,?,?,?,?)", (1, -1, 16, metadata, blob))
            db.execute("INSERT INTO table_heart_data_versions VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                       (11, 5, 1, 2, 3, 4, 5, 0, "3.4.5", 1, 2, 3, 4, 0, "fixture-only"))
        db.close()
        before = file_state(self.source)
        manifest = exporter.export_database(self.source, self.output)
        self.assertEqual(before, file_state(self.source))
        rows = self.rows("table_metrics_data")
        self.assertEqual([row["timestamp"] for row in rows], ["-1", "9007199254740993"])
        self.assertEqual(rows[1]["frame_revision"], "1")
        self.assertEqual(rows[1]["version_id"], "11")
        descriptor = rows[0]["packet_data"]
        self.assertEqual((self.output / descriptor["path"]).read_bytes(), blob)
        self.assertEqual(descriptor["sha256"], hashlib.sha256(blob).hexdigest())
        self.assertEqual(self.rows("console_packets")[0]["console_packets_metadata"], metadata)
        self.assertEqual([r["packet_revision"] for r in self.rows("sensor_data_packets")], ["25", "26"])
        self.assertEqual(self.rows("table_heart_data_versions")[0]["firmware_build"], "5")
        self.assertEqual(len(list((self.output / "blobs").iterdir())), 2)
        self.assertTrue(any("777" in warning for warning in manifest["warnings"]))
        self.assertEqual(manifest["source_files"][self.source.name]["sha256"], before[""][-1])
        self.assertEqual(manifest["user_version"], 17)
        self.assertFalse(manifest["room_identity_is_authenticity_proof"])
        self.assertEqual(manifest["tables"]["table_metrics_data"]["version_counts"], [{"version_id": "11", "row_count": 2}])
        self.assertEqual(manifest["tables"]["sensor_data_packets"]["blob_byte_length_min"], 0)
        self.assertEqual(manifest["tables"]["sensor_data_packets"]["blob_byte_length_max"], len(blob))
        other = self.root / "second"
        exporter.export_database(self.source, other)
        for path in self.output.glob("*.ndjson"):
            self.assertEqual(path.read_bytes(), (other / path.name).read_bytes())
        for path in self.output.rglob("*"):
            self.assertEqual(stat.S_IMODE(path.stat().st_mode), 0o700 if path.is_dir() else 0o600)
        self.assertEqual(stat.S_IMODE(self.output.stat().st_mode), 0o700)

    def test_uncheckpointed_wal_and_only_staged_sqlite_open(self):
        db = self.database()
        self.addCleanup(db.close)
        db.execute("PRAGMA journal_mode=WAL")
        db.execute("PRAGMA wal_autocheckpoint=0")
        db.execute("INSERT INTO sensor_data_packets VALUES(?,?,?,?)", (123, 25, b"committed-wal-only", 9))
        db.commit()
        self.assertGreater(Path(str(self.source) + "-wal").stat().st_size, 32)
        before = file_state(self.source)
        calls, statements = [], []
        real_connect = sqlite3.connect

        def checked_connect(path, **kwargs):
            calls.append(path)
            self.assertNotIn(str(self.source), path)
            self.assertTrue(path.endswith("?mode=ro"))
            connection = real_connect(path, **kwargs)
            connection.set_trace_callback(statements.append)
            return connection

        with patch.object(exporter.sqlite3, "connect", side_effect=checked_connect):
            manifest = exporter.export_database(self.source, self.output)
        self.assertEqual(len(calls), 1)
        self.assertIn("PRAGMA query_only=ON", statements)
        self.assertIn("PRAGMA trusted_schema=OFF", statements)
        self.assertIn("BEGIN", statements)
        self.assertEqual(before, file_state(self.source))
        self.assertEqual(self.rows("sensor_data_packets")[0]["timestamp"], "123")
        self.assertEqual(manifest["source_files"][self.source.name + "-wal"]["sha256"], before["-wal"][-1])
        self.assertEqual(manifest["source_files"][self.source.name + "-shm"]["sha256"], before["-shm"][-1])

    def test_optional_heart_absent_and_unexported_tables_listed(self):
        db = self.database(heart=False)
        db.execute("CREATE TABLE unrelated (value TEXT)")
        db.commit()
        db.close()
        result = exporter.export_database(self.source, self.output)
        self.assertNotIn("table_heart_data_versions", result["tables"])
        self.assertEqual(result["unexported_tables"], ["unrelated"])
        self.assertTrue(any("absent" in text for text in result["warnings"]))

    def test_legacy_version_rejected_without_migration(self):
        db = self.database()
        db.execute("PRAGMA user_version=16")
        db.close()
        self.assert_rejected("Unsupported user_version 16")

    def test_legacy_identity_rejected(self):
        with self.database() as db:
            db.execute("UPDATE room_master_table SET identity_hash='c0f462397688da90d9dc22c8c3d1de88'")
        db.close()
        self.assert_rejected("Unsupported Room identity")

    def test_missing_column_rejected(self):
        db = self.database()
        db.execute("ALTER TABLE table_metrics_data DROP COLUMN frame_revision")
        db.close()
        self.assert_rejected("Incompatible columns")

    def test_optional_heart_incompatible_schema_rejected(self):
        db = self.database()
        db.execute("ALTER TABLE table_heart_data_versions ADD COLUMN surprise TEXT")
        db.close()
        self.assert_rejected("Incompatible columns")

    def test_view_cannot_impersonate_table(self):
        db = self.database()
        db.executescript("DROP TABLE table_research_packets; CREATE VIEW table_research_packets AS SELECT 7 revision, 1 timestamp, x'00' packetData, 1 versionId;")
        db.close()
        self.assert_rejected("ordinary table")

    def test_dynamic_wrong_value_type_rejected(self):
        with self.database() as db:
            db.execute("INSERT INTO table_metrics_data VALUES('not-an-integer',1,x'00',1,1)")
        db.close()
        self.assert_rejected("wrong SQLite value type")

    def test_null_despite_notnull_schema_rejected(self):
        # Deliberately inconsistent test fixture: permit NULL, insert it, restore
        # declared schema without rewriting the page. quick_check must reject it.
        db = self.database()
        original = db.execute("SELECT sql FROM sqlite_schema WHERE name='table_metrics_data'").fetchone()[0]
        for sql, insert in ((original.replace("packet_data BLOB NOT NULL", "packet_data BLOB"), True), (original, False)):
            db.execute("PRAGMA writable_schema=ON")
            db.execute("UPDATE sqlite_schema SET sql=? WHERE name='table_metrics_data'", (sql,))
            version = db.execute("PRAGMA schema_version").fetchone()[0]
            db.execute(f"PRAGMA schema_version={version + 1}")
            db.commit()
            db.close()
            db = sqlite3.connect(self.source)
            if insert:
                db.execute("INSERT INTO table_metrics_data VALUES(9,1,NULL,1,1)")
                db.commit()
        db.close()
        self.assert_rejected("quick_check failed|NULL or wrong")

    def test_nonempty_rollback_journal_rejected(self):
        self.database().close()
        journal = Path(str(self.source) + "-journal")
        journal.write_bytes(b"nonempty journal, conservatively rejected")
        self.assert_rejected("Nonempty rollback journal")

    def test_source_or_sidecar_change_during_copy_rejected(self):
        self.database().close()
        original = exporter._read_file

        def changing_read(path, deadline, limit, destination=None):
            result = original(path, deadline, limit, destination)
            if destination is not None:
                Path(str(self.source) + "-wal").write_bytes(b"simulated external writer")
            return result

        with patch.object(exporter, "_read_file", side_effect=changing_read):
            with self.assertRaisesRegex(exporter.ExportError, "changed during acquisition"):
                exporter.export_database(self.source, self.output)
        self.assertFalse(self.output.exists())

    def test_existing_output_is_never_removed(self):
        self.database().close()
        self.output.mkdir()
        marker = self.output / "keep"
        marker.write_bytes(b"user content")
        with self.assertRaises(FileExistsError):
            exporter.export_database(self.source, self.output)
        self.assertEqual(marker.read_bytes(), b"user content")

    def test_limits_remove_partial_output_and_do_not_touch_source(self):
        with self.database() as db:
            db.execute("INSERT INTO console_packets VALUES(1,-1,1,'{}',?)", (b"a" * 100,))
            db.execute("INSERT INTO table_metrics_data VALUES(9,2,?,1,1)", (b"b" * 100,))
        db.close()
        for limits, message in [
            (replace(exporter.Limits(), max_source_bytes=1), "Source size"),
            (replace(exporter.Limits(), max_blob_bytes=10), "BLOB size"),
            (replace(exporter.Limits(), max_output_bytes=101), "Output size"),
            (replace(exporter.Limits(), max_rows=1), "Row limit"),
            (replace(exporter.Limits(), max_text_bytes=1), "Text size"),
        ]:
            with self.subTest(message=message):
                self.assert_rejected(message, limits)

    def test_nonfinite_time_limits_rejected(self):
        self.database().close()
        for value in (float("nan"), float("inf"), float("-inf")):
            with self.subTest(timeout=value):
                self.assert_rejected("finite", replace(exporter.Limits(), timeout_seconds=value))

    def test_unsupported_runtime_rejected_before_output(self):
        self.database().close()
        with patch.object(exporter.sys, "version_info", (3, 10, 12)):
            self.assert_rejected("Python 3.11")
        with patch.object(exporter.sqlite3, "sqlite_version_info", (3, 36, 0)):
            self.assert_rejected("SQLite 3.37")

    def test_large_blob_limit_is_clamped_to_sqlite_limit(self):
        self.database().close()
        exporter.export_database(self.source, self.output, replace(exporter.Limits(), max_blob_bytes=2 ** 64))
        self.assertTrue((self.output / "manifest.json").is_file())

    def test_manifest_publication_failure_removes_own_output(self):
        self.database().close()
        before = file_state(self.source)
        with patch.object(exporter.os, "replace", side_effect=OSError("simulated publication failure")):
            with self.assertRaisesRegex(OSError, "publication failure"):
                exporter.export_database(self.source, self.output)
        self.assertFalse(self.output.exists())
        self.assertEqual(before, file_state(self.source))

    def test_source_symlink_rejected(self):
        self.database().close()
        alias = self.root / "alias"
        alias.symlink_to(self.source)
        with self.assertRaisesRegex(exporter.ExportError, "symlink"):
            exporter.export_database(alias, self.output)
        self.assertFalse(self.output.exists())


if __name__ == "__main__":
    unittest.main()
