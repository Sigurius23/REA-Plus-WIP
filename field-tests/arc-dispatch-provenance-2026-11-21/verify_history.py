"""Keep old captures immutable while allowing the three living docs to advance."""
from pathlib import Path
import hashlib,json,subprocess
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
allowed={'ARC_HANDOFF.md','OPEN_TASKS.md','field-tests/arc-analysis-dossier-2026-11-08.md'}
result=[]
for directory,commit in [('arc-persistence-2026-11-20','a8b426fedc5bd67263bdbfe45a65428a19721cc6'),('arc-callbacks-2026-11-21','4f870986e5e4318635f7bff81531bfbe91d3e64c')]:
 manifest=ROOT/'field-tests'/directory/'snapshot-manifest.json';m=json.loads(manifest.read_text());updated=[];unchanged=0
 for r in m['files']:
  b=(ROOT/r['path']).read_bytes()
  if len(b)==r['bytes'] and hashlib.sha256(b).hexdigest()==r['sha256']:unchanged+=1;continue
  assert r['path'] in allowed,r['path'];historic=subprocess.check_output(['git','show',commit+':'+r['path']],cwd=ROOT)
  assert len(historic)==r['bytes'];assert hashlib.sha256(historic).hexdigest()==r['sha256'];updated.append(r['path'])
 result.append({'manifest':str(manifest.relative_to(ROOT)),'sha256':hashlib.sha256(manifest.read_bytes()).hexdigest(),'base_commit':commit,'total_files':len(m['files']),'unchanged_files':unchanged,'updated_living_documents_authenticated_at_base':updated})
(OUT/'history-verification.json').write_text(json.dumps({'status':'passed','snapshots':result},indent=2)+'\n');print(json.dumps({'status':'passed','snapshots':result}))
