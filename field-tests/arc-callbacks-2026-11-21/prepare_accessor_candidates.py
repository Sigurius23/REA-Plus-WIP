"""Exact direct-branch planning for the two selected metadata accessors."""
import bisect
import contextlib
import io
import json
from pathlib import Path
import runpy
import struct
OUT=Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_editor_async.py'))
env=d['env'];raw=env['raw'];targets={}
for label in ['storage-dependency-b-typeref-mangle-context-1-descriptor','storage-dependency-b-typeref-mangle-context-2-descriptor']:
 p=OUT/'mcp'/(label+'.evidence.json');e=json.loads(p.read_text());assert e['subject']['digest']['sha256']==d['SHA'];n=e['normalized_result'];a=int(n['address'],16);b=bytes.fromhex(n['bytes_hex']);assert struct.unpack_from('<I',b)[0]&31==17;target=a+12+struct.unpack_from('<i',b,12)[0];d['boundary'](target);targets[target]={'descriptor':hex(a),'source':{**d['descriptor'](p),'evidence_id':e['evidence_id']}}
text=next(s for s in env['sections'] if s['segment']=='__TEXT' and s['section']=='__text');start=int(text['vm_start'],16);end=int(text['vm_end_exclusive'],16);first=text['file_start'];candidates=[]
for off in range(first,first+end-start,4):
 w=struct.unpack_from('<I',raw,off)[0]
 if w&0x7c000000!=0x14000000:continue
 pc=start+off-first;imm=w&0x3ffffff;imm-=1<<26 if imm&(1<<25) else 0;target=pc+imm*4
 if target not in targets:continue
 i=bisect.bisect_right(env['starts'],pc)-1
 if i<0:continue
 b=d['boundary'](env['starts'][i]);assert pc<int(b['next_lc_start_exclusive'],16);candidates.append({'pc':hex(pc),'word':hex(w),'target':hex(target),'entry':b['entry'],'boundary':b})
r={'target_sha256':d['SHA'],'targets':[{'entry':hex(a),**v} for a,v in targets.items()],'candidates':candidates,'source_section':text,'source_section_sha256':d['digest'](raw[first:first+end-start]),'reproducer':d['descriptor'](Path(__file__).resolve()),'limits':['Supplemental original-byte branch candidates, not provider xrefs, runtime reachability or factory identity.','All code references must be corroborated by provider instructions before semantic use.']}
d['write_once'](OUT/'accessor-candidates.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'targets':list(map(hex,targets)),'candidates':len(candidates),'entries':sorted({x['entry'] for x in candidates})}))
