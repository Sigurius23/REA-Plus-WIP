import json,struct,bisect,hashlib
from pathlib import Path

root=Path(__file__).resolve().parent
prior=root.parent/"arc-dispatch-2026-11-06/native"
header=json.loads((prior/"macho-header-load-commands.evidence.json").read_text())["normalized_result"]
record=json.loads((prior/"function-start-index.evidence.json").read_text())
address=0x100000000;value=shift=0;main_starts=[]
for byte in bytes.fromhex(record["normalized_result"]["bytes_hex"]):
    value|=(byte&127)<<shift
    if byte&128:shift+=7;continue
    if value==0:break
    address+=value;main_starts.append(address);value=shift=0
layout_record=json.loads((root.parent/"arc-extension-loading-2026-11-08/core-macho.cli.json").read_text())["data"]
segments=layout_record["normalized_result"]["segments"]["items"]
section=next(s for segment in segments for s in segment["sections"]["items"] if s["name"]=="__unwind_info")
core=Path("/tmp/rea-arc-1.172.1-core-arm64.dylib").read_bytes()
assert hashlib.sha256(core).hexdigest()=="d5c04f2d2a6839cdd2360192950d06f4c085ff2aead2e7f10206b6e7fd7bd80e"
u=core[section["file_offset"]:section["file_offset"]+section["size"]]
version,_,_,_,_,idx,count=struct.unpack_from("<7I",u)
assert version==1
coarse=[struct.unpack_from("<III",u,idx+12*i) for i in range(count)]
core_starts=[]
for first,second in zip(coarse,coarse[1:]):
    begin,page,_=first;end=second[0]
    if page==0:continue
    kind,entry_offset,entry_count=struct.unpack_from("<IHH",u,page)
    assert kind in [2,3]
    for i in range(entry_count):
        if kind==2:entry=struct.unpack_from("<I",u,page+entry_offset+8*i)[0]
        else:entry=begin+(struct.unpack_from("<I",u,page+entry_offset+4*i)[0]&0xffffff)
        assert begin<=entry<end
        core_starts.append(entry)
core_starts=sorted(set(core_starts))
all_rows=[]
for mode in ["main","core"]:
    if mode=="main":
        binary=Path("/tmp/rea-extracted-6e261ab1-e59f-429d-aace-fd76dc4aa364/Arc-arm64").read_bytes();starts=main_starts;mapping=json.loads((root.parent/"arc-persistence-routes-2026-11-08/pointer-pattern-input.json").read_text());filename="main-pointer-patterns"
    else:binary=core;starts=core_starts;mapping=json.loads((root/"pointer-pattern-input.json").read_text());filename="core-pointer-patterns"
    scan=json.loads((root/"selectors"/(filename+".evidence.json")).read_text());rows=[];counts=[]
    for result in scan["normalized_result"]["results"]:
        parts=result["name"].rsplit("-",2);name,operation,_=parts;target=int(mapping["targets"][name],16)
        counts.append({"name":result["name"],"counted":result["total_matches"],"returned":len(result["matches"]),"counting_complete":result["complete"]})
        for match in result["matches"]:
            pc=int(match["address"],16);offset=match["file_offset"]
            if pc%4:continue
            word=struct.unpack_from("<I",binary,offset)[0];register=(word>>5)&31
            displacement=((word>>10)&4095)*(8 if operation in ["ldr","str"] else 1)
            for distance in range(4,65,4):
                if offset<distance:break
                adrp=struct.unpack_from("<I",binary,offset-distance)[0]
                if adrp&0x9f000000!=0x90000000 or adrp&31!=register:continue
                page_delta=(((adrp>>5)&0x7ffff)<<2)|((adrp>>29)&3)
                if page_delta&(1<<20):page_delta-=1<<21
                effective=((pc-distance)&~4095)+(page_delta<<12)+displacement
                if effective==target:
                    i=bisect.bisect_right(starts,pc)-1
                    rows.append({"name":name,"operation":operation,"target":hex(target),"adrp":hex(pc-distance),"use":hex(pc),"register":register,"candidate_entry":hex(starts[i]),"next_range":hex(starts[i+1]) if i+1<len(starts) else None,"entry_source":"LC_FUNCTION_STARTS" if mode=="main" else "compact-unwind range start; may be a subrange of a function","source_evidence":scan["evidence_id"]})
                break
    all_rows.append({"binary":mode,"counts":counts,"candidates":rows})
result={"authority":"analyst selector preparation from public pattern matches and immutable bytes, not automatic REA+ references or final function ownership", "limitations":["A matching prior ADRP/register is a candidate without a full clobber/control-flow proof", "Some patterns omit matches after the explicit max_matches cap; all counts are retained", "Compact unwind can contain multiple records for one function; its range starts are caller entry hypotheses requiring instruction validation"],"core_layout_evidence":layout_record["evidence_id"],"compact_unwind_records":len(core_starts),"binaries":all_rows}
(root/"pointer-selectors.json").write_text(json.dumps(result,indent=2)+"\n")
for item in all_rows:print(json.dumps({"binary":item["binary"],"candidates":item["candidates"]}))
