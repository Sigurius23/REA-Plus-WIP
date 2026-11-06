import hashlib
import json
from datetime import datetime, timezone
from pathlib import Path

root = Path(__file__).resolve().parent
identity = json.loads((root / "dmg-target.json").read_text())
extraction = Path(identity["app_root"]).parents[2]


def verify(path, size, digest):
    assert path.is_file() and not path.is_symlink(), str(path)
    assert path.stat().st_size == size, str(path)
    actual = hashlib.file_digest(path.open("rb"), "sha256").hexdigest()
    assert actual == digest, str(path)


for key in ["dmg_identity", "original", "slice"]:
    entry = identity[key]
    verify(Path(entry["path"]), entry["bytes"], entry["sha256"])
expected = {entry["path"] for entry in identity["files"]}
for entry in identity["files"]:
    verify(extraction / entry["path"], entry["bytes"], entry["sha256"])
materialized = extraction / next(iter(expected)).split("/")[0]
observed = {str(path.relative_to(extraction)) for path in materialized.rglob("*")
            if path.is_file() and not path.is_symlink()}
assert observed == expected, (observed - expected, expected - observed)
receipt = {
    "status": "passed", "checked_at": datetime.now(timezone.utc).isoformat(),
    "scope": "Fixed user DMG, derived ARM64 slice, original main executable, and all extracted regular files against the public extraction commitments",
    "extraction_evidence_id": identity["extraction_evidence_id"],
    "dmg_sha256": identity["dmg_identity"]["sha256"],
    "original_sha256": identity["original"]["sha256"],
    "slice_sha256": identity["slice"]["sha256"],
    "regular_files_verified": len(expected),
    "bytes_verified": sum(entry["bytes"] for entry in identity["files"]),
    "target_executed": False,
}
(root / "target-integrity.json").write_text(json.dumps(receipt, indent=2) + "\n")
print(json.dumps(receipt))
