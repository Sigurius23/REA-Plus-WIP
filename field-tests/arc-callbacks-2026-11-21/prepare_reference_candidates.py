"""Supplemental instruction-address planning, not provider xrefs or reachability."""
import bisect
import contextlib
import io
import json
from pathlib import Path
import runpy
import struct
OUT=Path(__file__).resolve().parent
ROOT=OUT.parents[1]
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_editor_async.py'))
env=d['env'];raw=env['raw'];boundary=d['boundary'];descriptor=d['descriptor'];digest=d['digest'];write_once=d['write_once']
targets={}
for label in ['storage-dependency-b-typeref-mangle-context-1-descriptor','storage-dependency-b-typeref-mangle-context-2-descriptor']:
 p=OUT/'mcp'/(label+'.evidence.json');e=json.loads(p.read_text());assert e['subject']['digest']['sha256']==d['SHA'];targets[int(e['normalized_result']['address'],16)]={'kind':'nominal_descriptor','source':{**descriptor(p),'evidence_id':e['evidence_id']}}
p=ROOT/'field-tests/arc-persistence-2026-11-20/mcp-implementations-2026-11-21/implementation-0x1011738b4-procedure_pseudo_code.evidence.json';e=json.loads(p.read_text());assert e['subject']['digest']['sha256']==d['SHA']
for a in [0x10377e690,0x10377e6c0,0x10377e6f0,0x10377e720]:
 assert f'{a:x}' in e['normalized_result'];targets[a]={'kind':'dependency_keypath_pattern_role_unassigned','source':{**descriptor(p),'evidence_id':e['evidence_id']}}
text=next(s for s in env['sections'] if s['segment']=='__TEXT' and s['section']=='__text');start=int(text['vm_start'],16);end=int(text['vm_end_exclusive'],16);file_start=text['file_start']
assert file_start+end-start<=len(raw)
candidates=[]
for off in range(file_start,file_start+end-start-4,4):
 word=struct.unpack_from('<I',raw,off)[0];pc=start+off-file_start;target=None;words=[word];kind=None
 if word&0x9f000000==0x10000000:
  v=((word>>5)&0x7ffff)*4+((word>>29)&3);v-=1<<21 if v&(1<<20) else 0;target=pc+v;kind='ADR'
 elif word&0x9f000000==0x90000000:
  z=struct.unpack_from('<I',raw,off+4)[0]
  if z&0xff800000==0x91000000 and (z>>5)&31==word&31:
   v=((word>>5)&0x7ffff)*4+((word>>29)&3);v-=1<<21 if v&(1<<20) else 0;target=(pc&~4095)+(v<<12)+(((z>>10)&4095)<<(12 if z&(1<<22) else 0));words.append(z);kind='adjacent_ADRP_ADD'
 if target not in targets:continue
 index=bisect.bisect_right(env['starts'],pc)-1
 if index<0:continue
 entry=env['starts'][index];b=boundary(entry)
 if pc+4*len(words)>int(b['next_lc_start_exclusive'],16):continue
 candidates.append({'target':hex(target),'pc':hex(pc),'kind':kind,'words':list(map(hex,words)),'entry':hex(entry),'boundary':b})
r={'status':'passed','target_sha256':d['SHA'],'targets':[{ 'address':hex(a),**x} for a,x in sorted(targets.items())],'source_section':text,'source_section_sha256':digest(raw[file_start:file_start+end-start]),'candidates':candidates,'reproducer':descriptor(Path(__file__).resolve()),'limits':['Original-byte constant-address candidates, not analyzed provider xrefs or observed code reachability.','Only ADR and immediately adjacent ADRP+ADD are examined; instructions with intervening definitions remain unexamined.','Every containing interval is an exact executable LC start. Provider instructions must corroborate instruction boundaries and semantic roles before using candidates as a call path.','Keypath pattern roles are deliberately unassigned; code labels from exploratory requests are not type bindings.']}
write_once(OUT/'reference-candidates.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'candidates':len(candidates),'entries':list(map(hex,sorted({int(x['entry'],16) for x in candidates}))),'by_target':{hex(a):sum(x['target']==hex(a) for x in candidates) for a in targets}}))
