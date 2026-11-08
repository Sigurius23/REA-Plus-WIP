import json, struct
from pathlib import Path

root=Path(__file__).resolve().parent
rows=[]
for label in ["send-closure-bytes","state-sink-bytes"]:
    record=json.loads((root/"dispatch"/(label+".evidence.json")).read_text())
    observed=record["normalized_result"]
    data=bytes.fromhex(observed["bytes_hex"])
    base=int(observed["address"],16)
    candidates=[]
    for offset in range(0,len(data),4):
        word=struct.unpack_from("<I",data,offset)[0]
        if word & 0x7c000000 == 0x14000000:
            displacement=word & 0x3ffffff
            if displacement & (1<<25): displacement-=1<<26
            link=bool(word & 0x80000000)
            candidates.append({"address":hex(base+offset),"word":hex(word),"kind":"BL" if link else "B","target":hex(base+offset+4*displacement)})
            if not link: break
        if word==0xd65f03c0: break
    rows.append({"source_evidence":record["evidence_id"],"label":label,"branch_candidates":candidates})
result={"authority":"analyst AArch64 immediate-branch selector derivation from retained public bytes; not automatic call-target recovery","sources":rows}
(root/"closure-branch-selectors.json").write_text(json.dumps(result,indent=2)+"\n")
assert rows[0]["branch_candidates"][-1]["target"]=="0x1008c7c34"
assert rows[1]["branch_candidates"][-1]["target"]=="0x1008c7ce8"
print(json.dumps({"selected_direct_branches":2}))
