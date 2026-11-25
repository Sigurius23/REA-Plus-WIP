from pathlib import Path
import subprocess,json,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1];manifest=O/'snapshot-manifest.json';assert not manifest.exists()
paths=set(p for p in O.rglob('*') if p.is_file());paths.add(O.with_suffix('.md'))
retired=[]
for row in json.loads((O/'runtime-qualified-manifest.json').read_text())['source_files']:
 p=R/row['path']
 if row.get('deleted'):assert not p.exists();retired.append(row['path'])
 else:paths.add(p)
for name in subprocess.check_output(['git','diff','--name-only'],cwd=R,text=True).splitlines():
 p=R/name
 if p.exists():paths.add(p)
 else:assert name in retired,name
records=[]
for p in sorted(paths):
 b=p.read_bytes();b.decode('utf8');assert len(b)<100*1024*1024
 records.append({'path':str(p.relative_to(R)),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()})
manifest.write_text(json.dumps({'version':1,'source_parent':subprocess.check_output(['git','rev-parse','HEAD'],cwd=R,text=True).strip(),'scope':'Intel HEX/S-record root decoding, artifact metadata/extraction, target format reconciliation and unchanged Arc Evidence','target_executed':False,'retired_source_paths':retired,'files':records},indent=2)+'\n')
print(json.dumps({'files':len(records),'bytes':sum(r['bytes'] for r in records),'largest':max(r['bytes'] for r in records),'retired':retired}))
