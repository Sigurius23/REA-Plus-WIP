import json, struct
from pathlib import Path

root = Path(__file__).resolve().parent
def load(name):
    return json.loads((root / "discovery" / (name + ".evidence.json")).read_text())

methods = load("editor-own-method-descriptors")
image = load("editor-class-vtable-context")
nominal = load("editor-nominal-descriptor")
observed = methods["normalized_result"]
base = int(observed["address"], 16)
words = bytes.fromhex(observed["bytes_hex"])
image_bytes = bytes.fromhex(image["normalized_result"]["bytes_hex"])
image_base = int(image["normalized_result"]["address"], 16)
rows = []
for index in range(5):
    pos = index * 8
    flags, displacement = struct.unpack_from("<Ii", words, pos)
    entry = base + pos + 4 + displacement
    assert entry % 4 == 0
    slot = 0x104572e00 + index * 8
    stored_entry = struct.unpack_from("<Q", image_bytes, slot-image_base)[0]
    assert entry == stored_entry
    rows.append({"method_index":index,"raw_flags":hex(flags),"descriptor":hex(base+pos),"entry":hex(entry),"matching_stored_pointer":hex(slot)})
nominal_bytes=bytes.fromhex(nominal["normalized_result"]["bytes_hex"])
accessor_field=int(nominal["normalized_result"]["address"],16)+12
accessor=accessor_field+struct.unpack_from("<i",nominal_bytes,12)[0]
seeded = [line.split("\t")[0] for line in (root/"method-seeds.tsv").read_text().splitlines()]
assert seeded == [row["entry"] for row in rows] + [hex(accessor)]
result={"authority":"analyst derivation from retained public loaded bytes; entries are caller assertions, not new automatic REA+ function discoveries", "assumptions":["Five method records selected from the class descriptor's stored vtable count and corroborated against five stored function pointers", "Signed relative implementation fields are relative to their own four-byte field", "Stored metadata is not an observed runtime class instance"], "source_evidence":[methods["evidence_id"],image["evidence_id"],nominal["evidence_id"]], "metadata_accessor":hex(accessor),"methods":rows,"seed_file_matches":True}
(root/"selected-editor-methods.json").write_text(json.dumps(result,indent=2)+"\n")
print(json.dumps({"methods":len(rows),"seed_file_matches":True}))
