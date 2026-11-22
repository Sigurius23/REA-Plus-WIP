"""Inventory shareable UTF-8 research; never stage original inputs or caches."""
from pathlib import Path
import hashlib,json
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
files=[ROOT/p for p in ['ARC_HANDOFF.md','OPEN_TASKS.md','field-tests/arc-analysis-dossier-2026-11-08.md','field-tests/arc-restore-preview-2026-11-22.md']]
for p in OUT.rglob('*'):
 if not p.is_file() or p.name=='snapshot-manifest.json' or p.name.endswith('.pending.json') or '__pycache__' in p.parts or p.suffix=='.pyc':continue
 assert not p.is_symlink(),str(p)
 assert p.name=='.gitignore' or p.suffix in {'.md','.json','.py','.mjs','.tsv','.txt','.log'},str(p)
 files.append(p)
records=[]
for p in sorted(set(files)):
 b=p.read_bytes();assert b'\0' not in b,str(p);b.decode('utf8')
 records.append(dict(path=str(p.relative_to(ROOT)),bytes=len(b),sha256=hashlib.sha256(b).hexdigest()))
result=dict(version=1,date='2026-11-22',target_sha256='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578',file_count=len(records),text_bytes=sum(r['bytes'] for r in records),files=records,exclusions=['This manifest itself','Unused *.pending.json plans and nonexistent late continuations','Original DMG/slice, binaries, caches and provider projects','The two existing large Rize JSONs'])
(OUT/'snapshot-manifest.json').write_text(json.dumps(result,indent=2)+'\n')
print(json.dumps(dict(files=len(records),text_bytes=result['text_bytes'],largest_file_bytes=max(r['bytes'] for r in records))))
