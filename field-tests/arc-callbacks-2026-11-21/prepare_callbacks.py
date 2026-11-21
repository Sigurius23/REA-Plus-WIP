"""Source-bound query admission; neither target nor shipped scripts execute."""
import contextlib
import io
import json
from pathlib import Path
import runpy

OUT=Path(__file__).resolve().parent
ROOT=OUT.parents[1]
OLD=ROOT/'field-tests/arc-persistence-2026-11-20'
with contextlib.redirect_stdout(io.StringIO()):
    base=runpy.run_path(str(OLD/'worker-preparation/prepare_firebase_request_overlay.py'))
SHA=base['SHA']
boundary,descriptor,digest,write_once,source_references=(base[k] for k in ['boundary','descriptor','digest','write_once','source_references'])
prior_path=OLD/'worker-preparation/firebase-request-seeds-2296.tsv'
prior_bytes=prior_path.read_bytes()
assert digest(prior_bytes)=='acf93127aa3814707b34a12f58360eb60236d8b11fcb28c314c202db102837bf'
lines=prior_bytes.decode().splitlines()
prior={int(x.split('\t')[0],16) for x in lines}
assert len(lines)==len(set(lines))==len(prior)==2296
origins=[]
roots=set()
for entry,source_entry in [(0x10118374c,0x101183470),(0x101183754,0x101183470),(0x101183480,0x101180274),(0x101182d1c,0x101182c6c)]:
    source=OLD/f'mcp-firebase-2026-11-21/implementation-{hex(source_entry)}-procedure_pseudo_code.evidence.json'
    e=json.loads(source.read_text())
    assert e['subject']['digest']['sha256']==SHA
    assert f'{entry:x}' in e['normalized_result']
    origins.append({'entry':hex(entry),'source':{**descriptor(source),'evidence_id':e['evidence_id']},'kind':'public_callback_or_async_destination_literal'})
    roots.add(entry)
known,front=prior|roots,roots
levels=[];scanned=[];additional={}
for depth in [1,2,3]:
    found=set()
    for entry in sorted(front):
        checked,refs=source_references(entry)
        scanned.append({'depth':depth,'boundary':checked})
        for ref in refs:
            target=int(ref['target'],16)
            if target not in known:
                found.add(target)
                additional.setdefault(target,[]).append({'depth':depth,**ref})
    levels.append({'depth':depth,'additional_entries':len(found),'entries':list(map(hex,sorted(found)))})
    known|=found;front=found
assert len(known-prior)<256,'Review unexpectedly broad planning frontier before admission'
new_lines=sorted(lines+[hex(x)+'\tfunction' for x in known-prior],key=lambda x:int(x.split('\t')[0],16))
assert len(new_lines)==len(set(new_lines))==len(known)
seed=('\n'.join(new_lines)+'\n').encode()
seed_path=OUT/f'callback-seeds-{len(known)}.tsv'
write_once(seed_path,seed)
r={'status':'passed','target_sha256':SHA,'prior':{**descriptor(prior_path),'entries':2296},'seed':{**descriptor(seed_path),'entries':len(known)},'root_origins':origins,'root_boundaries':[boundary(a) for a in sorted(roots)],'reference_levels':levels,'scanned_intervals':scanned,'additional_targets':[{'entry':hex(a),'boundary':boundary(a),'source_origins':additional[a]} for a in sorted(additional)],'reproducer':descriptor(Path(__file__).resolve()),'limits':['Supplemental query planning, not execution, runtime injection or a completed call graph.','All addresses are exact original LC_FUNCTION_STARTS entries in executable file-backed __TEXT,__text; indexed interval bounds are not provider-owned body proofs.','B/BL/ADR/adjacent ADRP+ADD candidates are explicitly bounded to three planning levels. No neighborhood or indirect targets guessed.','Prior captures, seeds and production sources unchanged.']}
write_once(OUT/'callback-seed-receipt.json',(json.dumps(r,indent=2)+'\n').encode())
print(json.dumps({'status':'passed','seed':str(seed_path),'sha256':digest(seed),'entries':len(known),'added':len(known-prior),'levels':[(x['depth'],x['additional_entries']) for x in levels]}))
