from pathlib import Path
import subprocess,json,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1]
manifest=O/'snapshot-manifest.json';assert not manifest.exists()
paths=set(p for p in O.rglob('*') if p.is_file())
paths.add(O.with_suffix('.md'))
for name in subprocess.check_output(['git','diff','--name-only'],cwd=R,text=True).splitlines():paths.add(R/name)
for name in ['rea-local/src/native/AppleSwiftStructMetadata.ts','rea-local/src/native/AppleSwiftStructMetadata.test.ts']:paths.add(R/name)
records=[]
for p in sorted(paths):
 b=p.read_bytes();b.decode('utf-8') # This checkpoint intentionally retains textual artifacts only.
 assert len(b)<100*1024*1024
 records.append({'path':str(p.relative_to(R)),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()})
record={'version':1,'scope':'Item63 static Client metadata layout and conditional VWT-source anchor; argument ABI and invocation origin remain unresolved','source_parent':subprocess.check_output(['git','rev-parse','HEAD'],cwd=R,text=True).strip(),'target_executed':False,'files':records}
manifest.write_text(json.dumps(record,indent=2)+'\n');print(json.dumps({'files':len(records),'bytes':sum(r['bytes'] for r in records),'largest':max(r['bytes'] for r in records)}))
