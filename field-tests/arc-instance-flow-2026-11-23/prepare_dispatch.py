"""Supplemental bounded branch locator; proposed roles remain caller-asserted until public inspection."""
from pathlib import Path
import json,struct,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1];j=lambda p:json.loads(p.read_text());h=lambda b:hashlib.sha256(b).hexdigest()
e=j(O/'mcp-iflet-conformance/iflet-conformance.evidence.json');v=e['normalized_result']['result'];template=v['swift_witness_templates'][0];entry=next(x for x in template['entries'] if x['word_index']==4);selected=int(entry['target']['address'],16)
b=(R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64').read_bytes();cursor=32;base=None;stream=None;segments=[]
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,cursor)
 if cmd==0x19:
  address,length,offset,filebytes=struct.unpack_from('<QQQQ',b,cursor+24);segments.append((address,filebytes,offset))
  if b[cursor+8:cursor+24].rstrip(b'\0')==b'__TEXT':base=address
 if cmd==0x26:off,length=struct.unpack_from('<II',b,cursor+8);stream=b[off:off+length]
 cursor+=size
assert stream is not None and base is not None
cursor=0;address=base;starts=[]
while cursor<len(stream):
 value=0;shift=0
 while True:
  v=stream[cursor];cursor+=1;value|=(v&127)<<shift
  if not v&128:break
  shift+=7;assert shift<64
 if value==0:break
 address+=value;starts.append(address)
assert selected in starts
stop=starts[starts.index(selected)+1];assert stop-selected<=4096
index=lambda a:next(offset+a-base for base,size,offset in segments if base<=a and a+4<=base+size)
branches=[]
for address in range(selected,stop,4):
 word=struct.unpack_from('<I',b,index(address))[0]
 if word>>26 not in (0x5,0x25):continue
 imm=word&0x3ffffff
 if imm>=0x2000000:imm-=0x4000000
 target=address+imm*4
 if target in starts:branches.append({'source':hex(address),'target':hex(target),'call':word>>26==0x25})
old=O/'seeds-instance-followup.tsv';s=old.read_text();added=[]
for a in [selected]+[int(r['target'],16) for r in branches]:
 token=hex(a)
 if not any(l.split('\t')[0]==token for l in s.splitlines()):s+=token+'\tfunction\n';added.append(token)
new=O/'seeds-child-dispatch.tsv';assert not new.exists();new.write_text(s)
(O/'child-dispatch-preparation.json').write_text(json.dumps({'source_evidence_id':e['evidence_id'],'source_evidence_sha256':h((O/'mcp-iflet-conformance/iflet-conformance.evidence.json').read_bytes()),'source_seed':str(old.relative_to(R)),'source_seed_sha256':h(old.read_bytes()),'seed_sha256':h(new.read_bytes()),'selected_pattern_word':4,'selected_function':hex(selected),'lc_extent':[hex(selected),hex(stop)],'direct_branch_candidates':branches,'added':added,'scope':'One exact LC-bounded immediate-branch hop; no recursive/indirect discovery or runtime instance claim'},indent=2)+'\n')
p=j(O/'plan-arc-followup.json');p['output_dir']=str(O/'mcp-child-dispatch');p['environment']['REA_GHIDRA_SEED_FILE']=str(new);p['steps']=[p['steps'][0]]
for address in [selected]+[int(r['target'],16) for r in branches]:
 p['steps'] += [{'name':'read_function_instructions','label':'instructions-'+hex(address),'arguments':{'procedure':hex(address)},'expect_success':True},{'name':'analyze_function','label':'summary-'+hex(address),'arguments':{'procedure':hex(address),'detail':'summary'},'expect_success':True}]
p['steps'] += [{'name':'export_evidence_bundle','label':'arc-export','arguments':{'path':str(O/'mcp-child-dispatch/final.bundle.json')},'expect_success':True},{'name':'close_binary','label':'arc-close1','arguments':{},'expect_success':True},{'name':'close_binary','label':'arc-close2','arguments':{},'expect_success':True}]
(O/'plan-child-dispatch.json').write_text(json.dumps(p,indent=2)+'\n');print(json.dumps({'selected':hex(selected),'branches':branches,'added':added}))
