"""Original-byte admission for the synchronous local JSON write helper."""
import contextlib,io,json,runpy
from pathlib import Path
OUT=Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_storage_leaf.py'))
a=d['a'];prior_path=d['seed_path'];prior_bytes=prior_path.read_bytes();lines=prior_bytes.decode().splitlines();prior={int(x.split()[0],16) for x in lines}
sources=[('0x100dbc6c4',[0x100dbc858]),('0x100dbf0d8',[0x100dbc4ac])]
roots=set();origins=[]
for entry,targets in sources:
 p=OUT/'mcp-leaf'/f'function-{entry}-read_function_instructions.evidence.json';j=json.loads(p.read_text());assert j['subject']['digest']['sha256']==a['SHA'];_,refs=a['source_references'](int(entry,16))
 for t in targets:
  matched=[r for r in refs if r['target']==hex(t)];assert matched,(entry,hex(t))
  for r in matched:assert any(x.startswith(r['pc']+':') for x in j['normalized_result']['instructions'])
  roots.add(t);origins.append({'entry':hex(t),'source':{**a['descriptor'](p),'evidence_id':j['evidence_id']},'references':matched,'boundary':a['boundary'](t)})
known,front=prior|roots,roots;levels=[];additional={}
for depth in [1,2]:
 found=set()
 for entry in sorted(front):
  _,refs=a['source_references'](entry)
  for r in refs:
   t=int(r['target'],16)
   if t not in known:found.add(t);additional.setdefault(t,[]).append({'depth':depth,**r})
 known|=found;front=found;levels.append({'depth':depth,'added':len(found),'entries':list(map(hex,sorted(found)))})
assert len(known-prior)<128
new=sorted(lines+[hex(x)+'\tfunction' for x in known-prior],key=lambda x:int(x.split()[0],16));seed=('\n'.join(new)+'\n').encode();seed_path=OUT/f'storage-io-seeds-{len(known)}.tsv';a['write_once'](seed_path,seed)
r={'target_sha256':a['SHA'],'prior':{**a['descriptor'](prior_path),'entries':len(prior)},'seed':{**a['descriptor'](seed_path),'entries':len(known)},'roots':origins,'reference_levels':levels,'additional_targets':[{'entry':hex(x),'boundary':a['boundary'](x),'origins':additional[x]} for x in sorted(additional)],'reproducer':a['descriptor'](Path(__file__).resolve()),'limits':['Instruction-reference planning, not runtime execution.','Only exact executable LC entries and two bounded reference levels.']}
a['write_once'](OUT/'storage-io-receipt.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'seed':str(seed_path),'entries':len(known),'added':len(known-prior),'sha256':a['digest'](seed)}))
