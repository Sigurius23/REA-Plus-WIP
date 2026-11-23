from pathlib import Path
import json,struct,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1];j=lambda p:json.loads(p.read_text());h=lambda b:hashlib.sha256(b).hexdigest()
p=O/'mcp-scope-entry/instructions-0x10070d148.evidence.json';e=j(p)
targets=[('0x10070d150','0x10070d1ec')]
for site,target in targets:assert site+': bl '+target in e['normalized_result']['instructions']
b=(R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64').read_bytes();cursor=32;base=None;stream=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,cursor)
 if cmd==0x19 and b[cursor+8:cursor+24].rstrip(b'\0')==b'__TEXT':base=struct.unpack_from('<Q',b,cursor+24)[0]
 if cmd==0x26:off,length=struct.unpack_from('<II',b,cursor+8);stream=b[off:off+length]
 cursor+=size
assert stream is not None and base is not None
cursor=0;address=base;starts=set()
while cursor<len(stream):
 value=0;shift=0
 while True:
  v=stream[cursor];cursor+=1;value|=(v&127)<<shift
  if not v&128:break
  shift+=7;assert shift<64
 if value==0:break
 address+=value;starts.add(address)
old=O/'seeds-scope-entry.tsv';s=old.read_text();added=[]
for _,target in targets:
 assert int(target,16) in starts
 if not any(l.split('\t')[0]==target for l in s.splitlines()):s+=target+'\tfunction\n';added.append(target)
seed=O/'seeds-scope-body.tsv';assert not seed.exists();seed.write_text(s)
(O/'scope-body-preparation.json').write_text(json.dumps({'source_evidence_id':e['evidence_id'],'source_evidence_path':str(p.relative_to(R)),'source_evidence_sha256':h(p.read_bytes()),'source_seed':str(old.relative_to(R)),'source_seed_sha256':h(old.read_bytes()),'seed_sha256':h(seed.read_bytes()),'added':added,'observed_calls':[{'site':a,'target':b} for a,b in targets],'lc_starts_verified':[b for a,b in targets],'scope':'Exact observed direct calls and original LC starts; caller-asserted seeds only'},indent=2)+'\n')
plan=j(O/'plan-child-entry.json');plan['output_dir']=str(O/'mcp-scope-body');plan['environment']['REA_GHIDRA_SEED_FILE']=str(seed);plan['steps']=[plan['steps'][0]]
for _,target in targets:
 plan['steps'] += [{'name':'read_function_instructions','label':'instructions-'+target,'arguments':{'procedure':target},'expect_success':True},{'name':'analyze_function','label':'summary-'+target,'arguments':{'procedure':target,'detail':'summary'},'expect_success':True}]
plan['steps'] += [{'name':'export_evidence_bundle','label':'arc-export','arguments':{'path':str(O/'mcp-scope-body/final.bundle.json')},'expect_success':True},{'name':'close_binary','label':'arc-close1','arguments':{},'expect_success':True},{'name':'close_binary','label':'arc-close2','arguments':{},'expect_success':True}]
(O/'plan-scope-body.json').write_text(json.dumps(plan,indent=2)+'\n');print(added)
