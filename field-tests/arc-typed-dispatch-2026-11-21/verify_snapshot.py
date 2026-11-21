"""Authenticate the published text checkpoint; no target/provider execution."""
from pathlib import Path
import hashlib
import json
OUT=Path(__file__).resolve().parent
ROOT=OUT.parents[1]
manifest=json.loads((OUT/'snapshot-manifest.json').read_text())
assert manifest['target_sha256']=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
assert len(manifest['files'])==manifest['file_count']
paths=set()
for item in manifest['files']:
    assert item['path'] not in paths;paths.add(item['path'])
    p=ROOT/item['path'];data=p.read_bytes()
    assert len(data)==item['bytes'],str(p)
    assert hashlib.sha256(data).hexdigest()==item['sha256'],str(p)
    assert b'\0' not in data,str(p)
    data.decode('utf8')
assert sum(x['bytes'] for x in manifest['files'])==manifest['text_bytes']
print(json.dumps({'status':'passed','files':len(paths),'text_bytes':manifest['text_bytes'],'excludes':manifest['exclusions']}))
