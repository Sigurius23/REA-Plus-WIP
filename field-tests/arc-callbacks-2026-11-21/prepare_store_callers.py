"""Bounded direct-reference planning for one storage-class referring function."""
import bisect
import contextlib
import io
import json
from pathlib import Path
import runpy
import struct
OUT=Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_store_finish.py'))
a=d['a'];env=a['env'];raw=env['raw'];prior_path=d['seed_path'];prior_bytes=prior_path.read_bytes();lines=prior_bytes.decode().splitlines();prior={int(x.split()[0],16) for x in lines};target=0x100db8d80
assert any(x['entry']==hex(target) for x in d['candidates'])
section=d['section'];start=int(section['vm_start'],16);end=int(section['vm_end_exclusive'],16);first=section['file_start'];candidates=[];roots=set()
for off in range(first,first+end-start,4):
 w=struct.unpack_from('<I',raw,off)[0]
 if w&0x7c000000!=0x14000000:continue
 pc=start+off-first;v=w&0x3ffffff;v-=1<<26 if v&(1<<25) else 0
 if pc+v*4!=target:continue
 i=bisect.bisect_right(env['starts'],pc)-1
 if i<0:continue
 checked=a['boundary'](env['starts'][i]);roots.add(int(checked['entry'],16));candidates.append({'pc':hex(pc),'word':hex(w),'target':hex(target),'entry':checked['entry'],'boundary':checked})
assert len(roots)<64,'Review large caller frontier'
all_candidates=candidates
meta_source=OUT/'mcp-storage/function-0x10118ca0c-read_function_instructions.evidence.json'
meta_record=json.loads(meta_source.read_text());assert meta_record['subject']['digest']['sha256']==a['SHA']
assert meta_record['normalized_result']['instructions'][:2]==['0x10118ca0c: adrp x0, 0x104308000','0x10118ca10: add x0, x0, #0x70']
selected_metadata=0x104308070
selected=[]
for item in all_candidates:
 b=item['boundary'];entry=int(item['entry'],16);off=b['file_offset'];size=b['indexed_interval_bytes'];matches=[]
 for j in range(0,size-4,4):
  w,z=struct.unpack_from('<II',raw,off+j);pc=entry+j;t=None
  if w&0x9f000000==0x10000000:
   v=((w>>5)&0x7ffff)*4+((w>>29)&3);v-=1<<21 if v&(1<<20) else 0;t=pc+v
  elif w&0x9f000000==0x90000000 and z&0xff800000==0x91000000 and (z>>5)&31==w&31:
   v=((w>>5)&0x7ffff)*4+((w>>29)&3);v-=1<<21 if v&(1<<20) else 0;t=(pc&~4095)+(v<<12)+(((z>>10)&4095)<<(12 if z&(1<<22) else 0))
  if t==selected_metadata:matches.append({'pc':hex(pc),'words':[hex(w),hex(z)]})
 if matches:selected.append({**item,'typed_metadata_candidates':matches})
roots={int(x['entry'],16) for x in selected}
error_source=OUT.parent/'arc-persistence-2026-11-20/mcp-firebase-2026-11-21/implementation-0x10117fec8-read_function_instructions.evidence.json'
error_record=json.loads(error_source.read_text());assert error_record['subject']['digest']['sha256']==a['SHA']
_,ref_candidates=a['source_references'](0x10117fec8)
error_refs=[x for x in ref_candidates if x['target']=='0x10117ff84'];assert error_refs
for ref in error_refs:assert any(line.startswith(ref['pc']+':') for line in error_record['normalized_result']['instructions'])
roots.add(0x10117ff84)
known,front=prior|roots,roots;levels=[];additional={}
for depth in [1,2]:
 found=set()
 for entry in sorted(front):
  _,refs=a['source_references'](entry)
  for ref in refs:
   t=int(ref['target'],16)
   if t not in known:found.add(t);additional.setdefault(t,[]).append({'depth':depth,**ref})
 known|=found;front=found;levels.append({'depth':depth,'added':len(found),'entries':list(map(hex,sorted(found)))})
assert len(known-prior)<256
new=sorted(lines+[hex(x)+'\tfunction' for x in known-prior],key=lambda x:int(x.split()[0],16));assert len(new)==len(set(new))==len(known);seed=('\n'.join(new)+'\n').encode();seed_path=OUT/f'store-callers-seeds-{len(known)}.tsv';a['write_once'](seed_path,seed)
r={'target_sha256':a['SHA'],'prior':{**a['descriptor'](prior_path),'entries':len(prior)},'seed':{**a['descriptor'](seed_path),'entries':len(known)},'selected_target':hex(target),'target_origin':a['descriptor'](OUT/'store-finish-receipt.json'),'source_section':section,'source_section_sha256':a['digest'](raw[first:first+end-start]),'all_direct_candidates':all_candidates,'candidates':selected,'selected_metadata':hex(selected_metadata),'metadata_origin':{**a['descriptor'](meta_source),'evidence_id':meta_record['evidence_id']},'local_read_error_root':{'entry':'0x10117ff84','source':{**a['descriptor'](error_source),'evidence_id':error_record['evidence_id']},'references':error_refs},'reference_levels':levels,'additional_targets':[{'entry':hex(x),'boundary':a['boundary'](x),'origins':additional[x]} for x in sorted(additional)],'reproducer':a['descriptor'](Path(__file__).resolve()),'limits':['Direct instruction-reference candidates only, not actual reachability or selected factory/runtime binding.','Candidate instruction boundaries and roles need provider corroboration.','Exact executable LC intervals and two bounded source-reference levels; other branch/address forms unexamined.']}
a['write_once'](OUT/'store-callers-receipt.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'seed':str(seed_path),'sha256':a['digest'](seed),'entries':len(known),'added':len(known-prior),'all_candidate_count':len(all_candidates),'selected_entries':list(map(hex,sorted(roots)))}))
