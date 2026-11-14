"""Independent linked-image/type oracle plus actual public baseline assertions.

Neither Ghidra's inferred function bounds nor helper equality selects the type.
The outer descriptor's reflected payload reference selects the fixed child.
The fixture is compiled/inspected only, never executed.
"""
import hashlib
import json
import re
import struct
from pathlib import Path

root = Path(__file__).resolve().parent
compilers = json.loads((root / "hybrid-compilers.json").read_text())
identity = next(x for x in compilers["binaries"] if x["path"].endswith("hybrid-onone.dylib"))
image = Path(identity["path"]).read_bytes()
assert hashlib.sha256(image).hexdigest() == identity["sha256"]
assert len(image) == identity["bytes"]
assert struct.unpack_from("<I", image)[0] == 0xfeedfacf
segments = []
at = 32
for _ in range(struct.unpack_from("<I", image, 16)[0]):
    command, size = struct.unpack_from("<II", image, at)
    if command == 0x19:
        segments.append(struct.unpack_from("<QQQQ", image, at + 24))
    at += size


def data(address, size):
    file_offset = next(f + address - v for v, _, f, z in segments if v <= address and address + size <= v + z)
    return image[file_offset:file_offset + size]


def word(address):
    return struct.unpack("<I", data(address, 4))[0]


def pointer(address):
    return struct.unpack("<Q", data(address, 8))[0]


def relative(address):
    return address + struct.unpack("<i", data(address, 4))[0]


symbols = {}
for line in (root / "hybrid-onone-symbols.txt").read_text().splitlines():
    parts = line.split()
    if len(parts) == 3:
        symbols[parts[2]] = int(parts[0], 16)


def symbol(suffix):
    matches = [address for name, address in symbols.items() if name.endswith(suffix)]
    assert len(matches) == 1, suffix
    return matches[0]


outer = symbol("11FixedActionOMn")
child = symbol("10FixedChildOMn")
metadata = symbol("10FixedChildON")
witness = symbol("10FixedChildOWV")
assert (word(outer) & 31, (word(outer) >> 16) & 3) == (18, 1)
assert (word(outer + 20) & 0xffffff, word(outer + 24)) == (3, 1)
outer_fields = relative(outer + 16)
assert word(outer_fields + 12) == 4
payload_reference = relative(outer_fields + 20)
assert data(payload_reference, 1) == b"\x01" and data(payload_reference + 5, 1) == b"\x00"
assert relative(payload_reference + 1) == child
assert (word(child) & 31, (word(child) >> 16) & 3) == (18, 0)
assert (word(child + 20) & 0xffffff, word(child + 24)) == (11, 13)
child_fields = relative(child + 16)
assert word(child_fields + 12) == 24
assert pointer(metadata) == 0x201 and pointer(metadata + 8) == child
assert pointer(metadata - 8) == witness and pointer(witness + 64) == 156
getter = pointer(witness + 88)
assert data(getter, 32) == data(0x1ad4, 32)

directory = root / "hybrid-onone-native"
evidence = json.loads((directory / "reducer.evidence.json").read_text())
observed = evidence["normalized_result"]
assert observed["procedure"]["address"] == "0x13b4"
assert not set(re.findall(r"probe_case_(\d+)", observed["pseudocode"]))
assert observed["native_api"]["jump_tables"] == []
assert "Could not recover jumptable" in observed["pseudocode"]
summary = json.loads((directory / "summary.json").read_text())
assert summary["status"] == "completed" and summary["calls"] == summary["successful"] == 7
assert summary["verifier_run"]["process_lineage"]["status"] == "verified"
assert summary["verifier_run"]["process_lineage"]["descendants"] == []
result = {
    "status": "passed",
    "authority": "independent linked-image/reflection oracle and real public REA+ baseline; not target execution or a successful repair",
    "target_executed": False,
    "binary": identity,
    "outer_descriptor": hex(outer),
    "outer_payloads": 3,
    "outer_empty_cases": 1,
    "selected_outer_case": 0,
    "direct_symbolic_payload_reference": hex(payload_reference),
    "child_descriptor": hex(child),
    "child_fields": hex(child_fields),
    "child_payloads": 11,
    "child_empty_cases": 13,
    "child_total_cases": 24,
    "child_metadata": hex(metadata),
    "child_vwt": hex(witness),
    "child_size_bytes": 156,
    "declared_getter": hex(getter),
    "outlined_helper": "0x1ad4",
    "helper_matches_declared_getter_bytes": 32,
    "baseline_evidence": evidence["evidence_id"],
    "case_callees": 0,
    "recovered_tables": 0,
    "body_bytes": observed["procedure"]["body"]["total_bytes"],
    "body_span_bytes": observed["procedure"]["body"]["span_bytes"],
    "public_calls": 7,
    "verified_empty_descendants": True,
}
(root / "hybrid-verification.json").write_text(json.dumps(result, indent=2) + "\n")
print(json.dumps({key: result[key] for key in ("status", "baseline_evidence", "child_total_cases", "case_callees", "recovered_tables")}))
