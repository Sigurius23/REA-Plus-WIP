"""Reconstruct the intermediate overlay from its preserved literal origins."""
import contextlib
import hashlib
import io
import json
from pathlib import Path
import runpy
OUT=Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_2069.py'))
r=json.loads((OUT/'next-overlay-receipt-2026-11-21.json').read_text());assert r['target_sha256']==d['SHA']
old=OUT/'broader-direct-callee-seeds-2069.tsv';rows=set(old.read_text().splitlines());assert hashlib.sha256(old.read_bytes()).hexdigest()==r['prior_seed_sha256']
for item in r['additions']:
    assert d['boundary'](int(item['address'],16))==item['boundary']
    for origin in item['sources']:
        e=json.loads((d['ROOT']/origin['file']).read_text());assert e['evidence_id']==origin['evidence_id'];assert e['subject']['digest']['sha256']==d['SHA']
        if 'literal' in origin:assert origin['literal'] in e['normalized_result']
        else:assert any(s['owner']==origin['owner'] and s['slot_index']==origin['slot_index'] and s['implementation_address']==item['address'] for s in e['normalized_result']['result']['swift_dispatch_slots'])
    line=item['address']+'\tfunction';assert line not in rows;rows.add(line)
expected=''.join(x+'\n' for x in sorted(rows,key=lambda x:int(x.split()[0],16))).encode();actual=(OUT/'broader-direct-callee-seeds-2093.tsv').read_bytes();assert actual==expected;assert len(rows)==r['entries']==2093;assert hashlib.sha256(actual).hexdigest()==r['sha256']
print(json.dumps({'status':'passed','entries':len(rows),'sha256':r['sha256']}))
