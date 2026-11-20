"""Derive bounded follow-up reads only from the recorded public byte replies."""
from pathlib import Path
import json
import struct

root = Path(__file__).resolve().parent
out = root / "mcp"
target = "6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578"


def read(label):
    evidence = json.loads((out / (label + ".evidence.json")).read_text())
    assert evidence["operation"] == "read_bytes"
    assert evidence["subject"]["digest"]["sha256"] == target
    result = evidence["normalized_result"]
    assert result["complete"]
    data = bytes.fromhex(result["bytes_hex"])
    assert len(data) == result["returned_bytes"] == result["requested_bytes"]
    return evidence, result, data


evidence, observed, data = read("state-fields")
base = int(observed["address"], 16)
assert base == 0x103EB510C
kind, size, count = struct.unpack_from("<HHI", data, 8)
assert (kind, size, count) == (0, 12, 21), (kind, size, count)
assert len(data) == 16 + size * count
fields = []
steps = []
for index in range(count):
    offset = 16 + size * index
    flags, type_relative, name_relative = struct.unpack_from("<Iii", data, offset)
    assert name_relative != 0
    record = base + offset
    name_address = record + 8 + name_relative
    type_address = None if type_relative == 0 else record + 4 + type_relative
    # Prior State descriptor Evidence observes a field-offset-vector word offset 2.
    metadata_offset = 8 * 2 + 4 * index
    fields.append({
        "index": index,
        "record_address": hex(record),
        "flags": flags,
        "name_address": hex(name_address),
        "mangled_type_address": None if type_address is None else hex(type_address),
        "metadata_vector_byte_offset": metadata_offset,
        "trace_field_key": "F" + format(metadata_offset, "x"),
        "instance_storage_offset": None,
    })
    steps.append({"name": "read_bytes", "arguments": {"address": hex(name_address), "length": 96},
                  "label": "state-field-name-" + str(index), "expect_success": True})

parent_evidence, parent, parent_bytes = read("state-parent")
parent_base = int(parent["address"], 16)
parent_flags = struct.unpack_from("<I", parent_bytes)[0]
assert parent_flags & 0x1F in (16, 17, 18)
parent_name = parent_base + 8 + struct.unpack_from("<i", parent_bytes, 8)[0]
steps.append({"name": "read_bytes", "arguments": {"address": hex(parent_name), "length": 96},
              "label": "state-parent-name", "expect_success": True})
steps.extend([
    {"name": "export_evidence_bundle", "arguments": {"path": str(out / "final.bundle.json")},
     "label": "export-final", "expect_success": True},
    {"name": "close_binary", "arguments": {}, "label": "close-first", "expect_success": True},
    {"name": "close_binary", "arguments": {}, "label": "close-confirm", "expect_success": True},
])
prepared = {
    "authority": "Derived relative-pointer selections from public read_bytes Evidence; no target execution",
    "layout_reference": "https://github.com/swiftlang/swift/blob/main/include/swift/RemoteInspection/Records.h",
    "target_sha256": target,
    "descriptor_evidence_id": evidence["evidence_id"],
    "parent_evidence_id": parent_evidence["evidence_id"],
    "kind": kind, "record_size": size, "count": count,
    "fields": fields,
    "limitations": ["Mangled type targets are not decoded here.",
                    "Metadata vector indices are not runtime instance storage offsets.",
                    "Field names have not been observed until their follow-up read succeeds."],
}
(root / "state-field-read-preparation.json").write_text(json.dumps(prepared, indent=2) + "\n")
destination = root / "field-names.continue.json"
temporary = root / "field-names.continue.tmp"
temporary.write_text(json.dumps({"final": True, "steps": steps}, indent=2) + "\n")
temporary.replace(destination)
print(json.dumps({"fields": count, "continuation_calls": len(steps), "status": "prepared"}))
