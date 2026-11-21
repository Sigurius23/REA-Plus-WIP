"""Inventory this analysis-only text checkpoint, preserving the original carrier separately."""
from pathlib import Path
import hashlib,json
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
files=[ROOT/p for p in ['ARC_HANDOFF.md','OPEN_TASKS.md','field-tests/arc-analysis-dossier-2026-11-08.md','field-tests/arc-base-url-2026-11-21.md']]
for p in OUT.rglob('*'):
 if not p.is_file() or p.name in {'snapshot-manifest.json','Info.plist'} or p.name.endswith('.pending.json') or '__pycache__' in p.parts or p.suffix=='.pyc':continue
 assert not p.is_symlink(),str(p);assert p.name=='.gitignore' or p.suffix in {'.md','.json','.py','.mjs','.tsv','.log'},str(p);files.append(p)
records=[]
for p in sorted(set(files)):
 b=p.read_bytes();assert b'\0' not in b,str(p);b.decode('utf8');records.append({'path':str(p.relative_to(ROOT)),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()})
r={'version':1,'date':'2026-11-21','target_sha256':'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578','file_count':len(records),'text_bytes':sum(x['bytes'] for x in records),'files':records,'exclusions':['This manifest itself','Physical Info.plist carrier (exact bytes retained in plist-carrier.json)','Unused *.pending.json plans, caches and provider projects','Original DMG/slice and large Rize JSONs']}
(OUT/'snapshot-manifest.json').write_text(json.dumps(r,indent=2)+'\n');print(json.dumps({'files':len(records),'text_bytes':r['text_bytes'],'largest_file_bytes':max(x['bytes'] for x in records)}))
