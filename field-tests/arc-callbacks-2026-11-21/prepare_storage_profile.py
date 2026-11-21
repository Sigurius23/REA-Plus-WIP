"""Join bounded original-reference candidates into the storage follow-up profile."""
import contextlib
import io
import json
from pathlib import Path
import runpy
OUT=Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_storage_detail.py'))
# Reuse the already validated source-reference decoder via the prerequisite.
with contextlib.redirect_stdout(io.StringIO()):a=runpy.run_path(str(OUT/'prepare_editor_async.py'))
prior_path=d['seed_path'];prior_bytes=prior_path.read_bytes();lines=prior_bytes.decode().splitlines();prior={int(x.split()[0],16) for x in lines};roots=set();origins=[]
for name in ['reference-candidates.json','accessor-candidates.json']:
 p=OUT/name;r=json.loads(p.read_text());assert r['target_sha256']==d['SHA']
 for c in r['candidates']:
  entry=int(c['entry'],16);assert a['boundary'](entry)==c['boundary'];roots.add(entry);origins.append({'entry':hex(entry),'candidate':c,'source':a['descriptor'](p)})
 if name=='accessor-candidates.json':
  for target in r['targets']:
   entry=int(target['entry'],16);a['boundary'](entry);roots.add(entry);origins.append({'entry':hex(entry),'source':a['descriptor'](p),'kind':'typed_nominal_metadata_accessor'})
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
new_lines=sorted(lines+[hex(x)+'\tfunction' for x in known-prior],key=lambda x:int(x.split()[0],16));assert len(new_lines)==len(set(new_lines))==len(known)
seed=('\n'.join(new_lines)+'\n').encode();seed_path=OUT/f'storage-profile-seeds-{len(known)}.tsv';a['write_once'](seed_path,seed)
r={'target_sha256':d['SHA'],'prior':{**a['descriptor'](prior_path),'entries':len(prior)},'seed':{**a['descriptor'](seed_path),'entries':len(known)},'root_origins':origins,'root_boundaries':[a['boundary'](x) for x in sorted(roots)],'reference_levels':levels,'additional_targets':[{'entry':hex(t),'boundary':a['boundary'](t),'origins':additional[t]} for t in sorted(additional)],'reproducer':a['descriptor'](Path(__file__).resolve()),'limits':['Planning candidates only; public provider instructions must corroborate boundaries and roles.','Two bounded reference levels, no guessed indirect targets or complete call-graph claim.','The original artifact, prior captures and production sources remain unchanged.']}
a['write_once'](OUT/'storage-profile-receipt.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'entries':len(known),'added':len(known-prior),'path':str(seed_path),'sha256':a['digest'](seed)}))
