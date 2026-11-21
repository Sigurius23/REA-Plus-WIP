"""Admit observed storage/codec helpers; original-byte bounds only."""
import contextlib
import io
import json
from pathlib import Path
import runpy
OUT=Path(__file__).resolve().parent
ROOT=OUT.parents[1]
OLD=ROOT/'field-tests/arc-persistence-2026-11-20'
with contextlib.redirect_stdout(io.StringIO()):d=runpy.run_path(str(OUT/'prepare_editor_async.py'))
SHA=d['SHA'];boundary=d['boundary'];descriptor=d['descriptor'];digest=d['digest'];write_once=d['write_once'];refs=d['source_references']
prior_path=OUT/'editor-async-seeds-2308.tsv';prior_bytes=prior_path.read_bytes();assert digest(prior_bytes)=='8dd6f03b99094d7a592d4a7a8d05c529bbafb987dee3eec9b0594e54950c40d3'
lines=prior_bytes.decode().splitlines();prior={int(x.split()[0],16) for x in lines};roots=set();origins=[]
def literal(address,file):
 e=json.loads(file.read_text());assert e['subject']['digest']['sha256']==SHA;assert f'{address:x}' in str(e['normalized_result']);boundary(address);roots.add(address);origins.append({'entry':hex(address),'kind':'public_code_reference','source':{**descriptor(file),'evidence_id':e['evidence_id']}})
for a in [0x101169398,0x101166f08]:literal(a,OUT/'mcp/function-0x10115ae9c-read_function_instructions.evidence.json')
for a in [0x10115a958,0x10115b98c]:literal(a,OLD/'mcp-apply-store-2026-11-21/implementation-0x10117d25c-read_function_instructions.evidence.json')
literal(0x1011867b0,OLD/'mcp-firebase-2026-11-21/implementation-0x101182c6c-read_function_instructions.evidence.json')
for name in ['json-payload-conformances','conformances-StorableBoostsData']:
 file=OUT/'mcp'/(name+'.evidence.json');e=json.loads(file.read_text());assert e['subject']['digest']['sha256']==SHA;r=e['normalized_result']['result']
 for w in r['swift_resilient_witnesses']:
  a=w.get('implementation_address')
  if a:
   address=int(a,16);boundary(address);roots.add(address);origins.append({'entry':a,'kind':'public_resilient_witness_implementation','requirement_reference':w.get('requirement_reference'),'source':{**descriptor(file),'evidence_id':e['evidence_id']}})
 for pattern in r['swift_witness_templates']:
  for w in pattern['entries']:
   a=w.get('target',{}).get('address')
   if w['kind']=='function' and a:
    address=int(a,16);boundary(address);roots.add(address);origins.append({'entry':a,'kind':'public_witness_pattern_candidate','word_index':w['word_index'],'source':{**descriptor(file),'evidence_id':e['evidence_id']}})
known,front=prior|roots,roots;levels=[];scanned=[];additional={}
for depth in [1,2]:
 found=set()
 for a in sorted(front):
  b,targets=refs(a);scanned.append({'depth':depth,'boundary':b})
  for ref in targets:
   target=int(ref['target'],16)
   if target not in known:found.add(target);additional.setdefault(target,[]).append({'depth':depth,**ref})
 known|=found;front=found;levels.append({'depth':depth,'added':len(found),'entries':list(map(hex,sorted(found)))})
assert len(known-prior)<200,'Unexpected expansion; review the frontier'
new_lines=sorted(lines+[hex(a)+'\tfunction' for a in known-prior],key=lambda x:int(x.split()[0],16));assert len(new_lines)==len(set(new_lines))==len(known)
seed=('\n'.join(new_lines)+'\n').encode();seed_path=OUT/f'storage-detail-seeds-{len(known)}.tsv';write_once(seed_path,seed)
r={'status':'passed','target_sha256':SHA,'prior':descriptor(prior_path),'seed':{**descriptor(seed_path),'entries':len(known)},'root_origins':origins,'root_boundaries':[boundary(a) for a in sorted(roots)],'reference_levels':levels,'scanned_intervals':scanned,'additional_targets':[{'entry':hex(a),'boundary':boundary(a),'origins':additional[a]} for a in sorted(additional)],'reproducer':descriptor(Path(__file__).resolve()),'limits':['Supplemental source-bound planning only; no runtime witness instantiation, call graph completeness, target execution or persistence inferred.','Exact original executable LC entries only; two bounded direct/address reference levels; no guessed indirect targets.','Generic witness-pattern candidates retain their static status, not observed runtime slot ordering.']}
write_once(OUT/'storage-detail-seed-receipt.json',(json.dumps(r,indent=2)+'\n').encode());print(json.dumps({'seed':str(seed_path),'sha256':digest(seed),'entries':len(known),'added':len(known-prior),'roots':list(map(hex,sorted(roots)))}))
