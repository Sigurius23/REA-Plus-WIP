import json,struct,hashlib
from pathlib import Path

root=Path(__file__).resolve().parent
prior=root.parent/"arc-dispatch-2026-11-06/native"
header=json.loads((prior/"macho-header-load-commands.evidence.json").read_text())
index=json.loads((prior/"function-start-index.evidence.json").read_text())
expected="6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578"
for record in [header,index]:
    assert record["subject"]["digest"]["sha256"]==expected
    assert record["normalized_result"]["complete"]
image=Path("/tmp/rea-extracted-6e261ab1-e59f-429d-aace-fd76dc4aa364/Arc-arm64").read_bytes()
assert hashlib.sha256(image).hexdigest()==expected
raw=bytes.fromhex(header["normalized_result"]["bytes_hex"])
assert struct.unpack_from("<I",raw)[0]==0xfeedfacf
position=32;segments=[];command=None
for _ in range(struct.unpack_from("<I",raw,16)[0]):
    kind,size=struct.unpack_from("<II",raw,position)
    if kind==0x19: segments.append(struct.unpack_from("<QQQQ",raw,position+24))
    if kind==0x26: command=struct.unpack_from("<II",raw,position+8)
    position+=size
assert command is not None
offset,length=command
entry_data=bytes.fromhex(index["normalized_result"]["bytes_hex"])
assert len(entry_data)==length and image[offset:offset+length]==entry_data
assert image[:len(raw)]==raw
text=[x for x in segments if x[2]==0 and x[3]>0][0][0]
address=text;value=shift=0;entries=[]
for byte in entry_data:
    value|=(byte&127)<<shift
    if byte&128: shift+=7;continue
    if value==0: break
    address+=value;entries.append(address);value=shift=0
selected=[address for address in entries if 0x1012a0000<=address<0x101300000]
assert len(selected)==1940
seed=''.join(f'{address:#x}\tfunction\n' for address in selected)
(root/"local-function-seeds.tsv").write_text(seed)
receipt={"authority":"caller seed preparation from previously authenticated public LC_FUNCTION_STARTS bytes; not automatic Ghidra discoveries or a module boundary", "target_sha256":expected,"source_evidence":[header["evidence_id"],index["evidence_id"]],"source_bytes_match":True,"selected_range":{"start":"0x1012a0000","end_exclusive":"0x101300000"},"indexed_starts":len(entries),"selected_starts":len(selected),"seed_sha256":hashlib.sha256(seed.encode()).hexdigest()}
(root/"local-seed-provenance.json").write_text(json.dumps(receipt,indent=2)+"\n")
print(json.dumps(receipt))
