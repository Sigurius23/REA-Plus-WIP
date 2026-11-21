"""Follow observed continuations plus exact storage-class accessor callers."""
import bisect
import contextlib
import io
import json
from pathlib import Path
import runpy
import struct
OUT=Path(__file__).resolve().parent
ROOT=OUT.parents[1]
with contextlib.redirect_stdout(io.StringIO()):base=runpy.run_path(str(OUT/'prepare_storage_profile.py'))
a=base['a'];env=a['env'];raw=env['raw'];SHA=a['SHA'];boundary=a['boundary'];descriptor=a['descriptor'];digest=a['digest'];write_once=a['write_once']
prior_path=base['seed_path'];prior_bytes=prior_path.read_bytes();lines=prior_bytes.decode().splitlines();prior={int(x.split()[0],16) for x in lines};roots=set();origins=[]
for entry,p in [(0x101159db4,OUT/'mcp/function-0x10115ae9c-read_function_instructions.evidence.json'),(0x10117d3d8,ROOT/'field-tests/arc-persistence-2026-11-20/mcp-apply-store-2026-11-21/implementation-0x10117d25c-procedure_pseudo_code.evidence.json'),(0x10117d5d8,ROOT/'field-tests/arc-persistence-2026-11-20/mcp-apply-store-2026-11-21/implementation-0x10117d25c-procedure_pseudo_code.evidence.json')]:
 e=json.loads(p.read_text());assert e['subject']['digest']['sha256']==SHA;assert f'{entry:x}' in str(e['normalized_result']);boundary(entry);roots.add(entry);origins.append({'entry':hex(entry),'kind':'public_code_destination','source':{**descriptor(p),'evidence_id':e['evidence_id']}})
p=OUT/'mcp-storage/candidate-storage-class-descriptor.evidence.json';e=json.loads(p.read_text());assert e['subject']['digest']['sha256']==SHA;n=e['normalized_result'];b=bytes.fromhex(n['bytes_hex']);address=int(n['address'],16);assert struct.unpack_from('<I',b)[0]&31==16;target=address+12+struct.unpack_from('<i',b,12)[0];boundary(target);roots.add(target);origins.append({'entry':hex(target),'kind':'nominal_class_metadata_accessor','source':{**descriptor(p),'evidence_id':e['evidence_id']}})
section=next(s for s in env['sections'] if s['segment']=='__TEXT' and s['section']=='__text');start=int(section['vm_start'],16);end=int(section['vm_end_exclusive'],16);first=section['file_start'];candidates=[]
for off in range(first,first+end-start,4):
 word=struct.unpack_from('<I',raw,off)[0]
 if word&0x7c000000!=0x14000000:continue
 pc=start+off-first;v=word&0x3ffffff;v-=1<<26 if v&(1<<25) else 0
 if pc+v*4!=target:continue
 i=bisect.bisect_right(env['starts'],pc)-1
 if i<0:continue
 checked=boundary(env['starts'][i]);roots.add(int(checked['entry'],16));candidates.append({'pc':hex(pc),'word':hex(word),'target':hex(target),'entry':checked['entry'],'boundary':checked})
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
new=sorted(lines+[hex(t)+'\tfunction' for t in known-prior],key=lambda x:int(x.split()[0],16));assert len(new)==len(set(new))==len(known);seed=('\n'.join(new)+'\n').encode();seed_path=OUT/f'store-finish-seeds-{len(known)}.tsv';write_once(seed_path,seed)
r={'target_sha256':SHA,'prior':{**descriptor(prior_path),'entries':len(prior)},'seed':{**descriptor(seed_path),'entries':len(known)},'root_origins':origins,'accessor_reference_candidates':candidates,'source_section':section,'source_section_sha256':digest(raw[first:first+end-start]),'root_boundaries':[boundary(t) for t in sorted(roots)],'reference_levels':levels,'additional_targets':[{'entry':hex(t),'boundary':boundary(t),'origins':additional[t]} for t in sorted(additional)],'reproducer':descriptor(Path(__file__).resolve()),'limits':['Source-bound planning only; every candidate needs public instruction corroboration before semantic use.','Only exact B/BL references to one selected metadata accessor were searched globally; no completeness claim about other address forms or reachability.','Two bounded source-reference levels; exact executable LC entries, no neighborhood or indirect-target guessing.']}
write_once(OUT/'store-finish-receipt.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'seed':str(seed_path),'sha256':digest(seed),'entries':len(known),'added':len(known-prior),'class_accessor_callers':[x['entry'] for x in candidates],'roots':list(map(hex,sorted(roots)))}))
