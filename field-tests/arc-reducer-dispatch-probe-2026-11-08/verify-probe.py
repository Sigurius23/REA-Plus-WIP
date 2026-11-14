import hashlib,json,re,struct
from datetime import datetime,timezone
from pathlib import Path

root=Path(__file__).resolve().parent
class Image:
    def __init__(self,path):
        self.bytes=Path(path).read_bytes();self.segments=[];p=32
        assert struct.unpack_from("<I",self.bytes)[0]==0xfeedfacf
        for _ in range(struct.unpack_from("<I",self.bytes,16)[0]):
            command,size=struct.unpack_from("<II",self.bytes,p)
            if command==0x19:self.segments.append(struct.unpack_from("<QQQQ",self.bytes,p+24))
            p+=size
    def offset(self,address,size=4):
        return next(f+address-v for v,s,f,z in self.segments if v<=address and address+size<=v+z)
    def data(self,address,size):
        p=self.offset(address,size);return self.bytes[p:p+size]
    def word(self,address):return struct.unpack("<I",self.data(address,4))[0]
    def pointer(self,address):return struct.unpack("<Q",self.data(address,8))[0]
    def relative(self,address):return address+struct.unpack("<i",self.data(address,4))[0]
def symbols(file):
    result={}
    for line in file.read_text().splitlines():
        parts=line.split()
        if len(parts)==3:result[parts[2]]=int(parts[0],16)
    return result
def symbol(items,suffix):
    found=[a for n,a in items.items() if n.endswith(suffix)];assert len(found)==1,suffix;return found[0]
def fixed_metadata(image,items,prefix):
    descriptor=symbol(items,prefix+"OMn");metadata=symbol(items,prefix+"ON");vwt=symbol(items,prefix+"OWV")
    flags=image.word(descriptor);assert flags&31==18 and flags&0x80==0 and (flags>>16)&3==0
    payloads=image.word(descriptor+20)&0xffffff;empty=image.word(descriptor+24)
    fields=image.relative(descriptor+16);assert image.word(fields+12)==payloads+empty
    for i in range(payloads+empty):assert (image.word(fields+16+i*12+4)!=0)==(i<payloads)
    assert image.pointer(metadata)==0x201 and image.pointer(metadata+8)==descriptor and image.pointer(metadata-8)==vwt
    return {"descriptor":hex(descriptor),"flags":hex(flags),"metadata":hex(metadata),"vwt":hex(vwt),"payloads":payloads,"empty":empty,"total_cases":payloads+empty,"size":image.pointer(vwt+64),"getter":image.pointer(vwt+88)}

fixed=json.loads((root/"fixed-layout-compilers.json").read_text());proofs=[]
for record in fixed["records"]:
    label=record["label"];image=Image(record["binary"]["path"]);assert hashlib.sha256(image.bytes).hexdigest()==record["binary"]["sha256"]
    items=symbols(root/(label+"-symbols.txt"));info=fixed_metadata(image,items,"0A5Child");assert (info["payloads"],info["empty"],info["size"])==(11,13,156)
    helper=0x104c if label=="fixed-optimized" else 0x187c;length=28 if label=="fixed-optimized" else 32
    getter=info.pop("getter");assert image.data(helper,length)==image.data(getter,length)
    info.update({"label":label,"binary":record["binary"],"declared_getter":hex(getter),"outlined_helper":hex(helper),"helper_bytes":image.data(helper,length).hex(),"outlined_matches_declared_getter":True});proofs.append(info)

ambiguous=json.loads((root/"ambiguous-compiler.json").read_text());image=Image(ambiguous["binary"]["path"]);assert hashlib.sha256(image.bytes).hexdigest()==ambiguous["binary"]["sha256"]
items=symbols(root/"ambiguous-symbols.txt");first=fixed_metadata(image,items,"10FixedChild");second=fixed_metadata(image,items,"10OtherChild")
assert (first["total_cases"],second["total_cases"])==(24,25)
word=image.word(second["getter"]);assert word>>26==5
displacement=word&0x3ffffff
if displacement&(1<<25):displacement-=1<<26
shared=second["getter"]+displacement*4;assert shared==first["getter"]
ambiguity={"binary":ambiguous["binary"],"authority":"owned compiler/linked-byte counterexample; not public REA+ Evidence or target execution","first":first,"second":second,"second_getter_direct_branch_target":hex(shared),"shared_body_bytes":image.data(shared,28).hex(),"conclusion":"Shared pure getEnumTag code does not identify a unique enum or total case count."}

checks=[];sessions=[]
for label,expected in [("onone",30),("fixed-onone",0),("fixed-optimized",0)]:
    directory=root/label;record=json.loads((directory/"reducer.evidence.json").read_text());d=record["normalized_result"];observed=set(int(x) for x in re.findall(r"probe_case_(\d+)",d["pseudocode"]));assert len(observed)==expected
    tables=d["native_api"]["jump_tables"]
    if label=="onone":
        assert len(tables)==1 and len(tables[0]["mappings"])==30
        assert tables[0]["data_sources"][0]["provenance"]=="rea-swift-enum-signed-word-table"
        assert "Could not recover jumptable" not in d["pseudocode"]
    else:assert not tables and "Could not recover jumptable" in d["pseudocode"]
    summary=json.loads((directory/"summary.json").read_text());assert summary["status"]=="completed" and summary["errors"]==0
    lineage=summary["verifier_run"]["process_lineage"];assert lineage["status"]=="verified" and lineage["descendants"]==[]
    sessions.append({"label":label,"calls":summary["calls"],"successful":summary["successful"],"verified_empty_descendants":True})
    checks.append({"label":label,"evidence_id":record["evidence_id"],"known_source_case_count":30 if label=="onone" else 24,"case_callees_in_pseudocode":len(observed),"tables":len(tables),"observed_body_bytes":d["procedure"]["body"]["total_bytes"],"observed_body_ranges":d["procedure"]["body"]["ranges"],"analysis_outcome":[x for x in record["limitations"] if "analysis_complete=" in x]})

# The optimized owned helper is also identical to the retained Arc helper's instructions.
arc_record=json.loads((root.parent/"arc-persistence-routes-2026-11-08/native/nested-action-tag-helper.evidence.json").read_text());own_record=json.loads((root/"fixed-optimized/tag-helper.evidence.json").read_text())
normalize=lambda lines:[line.split(": ",1)[1] for line in lines]
assert normalize(arc_record["normalized_result"]["assembly"])==normalize(own_record["normalized_result"]["assembly"])
(root/"fixed-layout-proof.json").write_text(json.dumps({"authority":"independent compiler-byte/metadata oracle; inputs are never executed","proofs":proofs,"ambiguity":ambiguity,"arc_instruction_match":{"source_evidence":arc_record["evidence_id"],"owned_evidence":own_record["evidence_id"],"identical_instructions":7}},indent=2)+"\n")
result={"status":"passed","checked_at":datetime.now(timezone.utc).isoformat(),"target_executed":False,"findings":checks,"sessions":sessions,"calls":sum(x["calls"] for x in sessions),"successes":sum(x["successful"] for x in sessions)}
(root/"verification.json").write_text(json.dumps(result,indent=2)+"\n");print(json.dumps({"status":"passed","calls":result["calls"],"source_controls":len(checks),"fixed_layout_ambiguity_proved":True}))
