"""Authenticate narrative/review sources, admission profiles and frozen runtime."""
from pathlib import Path
import hashlib,json,subprocess
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
SHA='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
digest=lambda b:hashlib.sha256(b).hexdigest()
reviews=['js-activation-review.json','js-activation-final.json','js-activation-resolution.json','js-activation-two-writes.json'];bindings=0
for name in reviews+['fact-index.json']:
 j=json.loads((OUT/name).read_text());assert j['target_sha256']==SHA
 sources=j.get('sources',[])+[s for f in j.get('facts',[]) for s in f['sources']]
 for s in sources:
  f=ROOT/s['path'];data=f.read_bytes();assert digest(data)==s['sha256'],str(f)
  r=json.loads(data);assert r['evidence_id']==s['evidence_id'];assert r['subject']['digest']['sha256']==SHA;bindings+=1
manifest=json.loads((ROOT/'field-tests/arc-upstream-retained-2026-11-20/runtime-manifest.json').read_text());runtime=Path(manifest['runtime_root'])
for r in manifest['files']:
 b=(runtime/r['path']).read_bytes();assert len(b)==r['bytes'];assert digest(b)==r['sha256'],r['path']
seed_receipts=[]
for name in ['callback-seed-receipt.json','editor-async-seed-receipt.json','storage-detail-seed-receipt.json','storage-profile-receipt.json','store-finish-receipt.json','store-callers-receipt.json','storage-leaf-receipt.json','storage-io-receipt.json']:
 p=OUT/name
 assert p.exists(),str(p)
 j=json.loads(p.read_text());assert j['target_sha256']==SHA
 s=j.get('seed')
 if s:
  f=Path(s['path']);f=f if f.is_absolute() else ROOT/f
  b=f.read_bytes();assert digest(b)==s['sha256'];assert len(b.decode().splitlines())==s['entries'];seed_receipts.append(name)
# The previous manifest also includes three living documents. Authenticate their
# historic bytes from the exact published checkpoint and keep captures immutable.
old=ROOT/'field-tests/arc-persistence-2026-11-20/snapshot-manifest.json';m=json.loads(old.read_text())
base='a8b426fedc5bd67263bdbfe45a65428a19721cc6'
living={'ARC_HANDOFF.md','OPEN_TASKS.md','field-tests/arc-analysis-dossier-2026-11-08.md'}
updated=[];unchanged=0
for r in m['files']:
 b=(ROOT/r['path']).read_bytes()
 if len(b)!=r['bytes'] or digest(b)!=r['sha256']:
  assert r['path'] in living,r['path']
  historic=subprocess.check_output(['git','show',base+':'+r['path']],cwd=ROOT)
  assert len(historic)==r['bytes'];assert digest(historic)==r['sha256'],r['path']
  updated.append({'path':r['path'],'checkpoint_sha256':r['sha256'],'current_sha256':digest(b)})
 else:unchanged+=1
input_file=ROOT/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64';assert digest(input_file.read_bytes())==SHA
result={'status':'passed','target_sha256':SHA,'source_bindings':bindings,'reviews':reviews,'facts':7,'frozen_runtime_files':len(manifest['files']),'prior_snapshot':{'path':str(old.relative_to(ROOT)),'sha256':digest(old.read_bytes()),'files':len(m['files']),'text_bytes':m['text_bytes'],'status':'authenticated','base_commit':base,'unchanged_files':unchanged,'updated_living_documents':updated},'seed_receipts':seed_receipts,'limits':['Source authentication does not independently establish semantic correctness.','Cached original input and frozen runtime are intentionally absent from Git; this verifier requires them locally.','Portable text integrity can be checked with verify_snapshot.py.']}
(OUT/'source-verification.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps(result))
