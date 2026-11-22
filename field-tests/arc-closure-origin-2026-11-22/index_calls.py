from pathlib import Path
import json,re,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1];target='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
seen=set();matches=[];files=0;large=[]
for directory in sorted((R/'field-tests').glob('arc-*')):
 if not directory.is_dir() or directory==O:continue
 for p in sorted(directory.rglob('*.json')):
  if not (p.name.endswith('.evidence.json') or 'bundle' in p.name):continue
  if p.stat().st_size>32*1024*1024:large.append(str(p.relative_to(R)));continue
  try:j=json.loads(p.read_text())
  except (UnicodeDecodeError,json.JSONDecodeError):continue
  records=j.get('records',[]) if isinstance(j,dict) else []
  if isinstance(j,dict) and 'evidence_id' in j:records=[j]
  files+=1
  for e in records:
   if not isinstance(e,dict) or e.get('evidence_id') in seen:continue
   subject=e.get('subject') or {}
   if not isinstance(subject,dict) or (subject.get('digest') or {}).get('sha256')!=target:continue
   seen.add(e['evidence_id']);r=e.get('normalized_result',{})
   if not isinstance(r,dict):continue
   assembly=r.get('assembly') or (r.get('instructions') if e.get('operation')=='read_function_instructions' else None)
   if not isinstance(assembly,list):continue
   for i,line in enumerate(assembly):
    m=re.search(r': mov w0, #0x([0-9a-f]+)$',line)
    if not m:continue
    value=int(m.group(1),16)
    if not(0<value<297 and value&1):continue
    after=assembly[i+1:i+7]
    if not any(': blr ' in s for s in after):continue
    matches.append({'path':str(p.relative_to(R)),'evidence_id':e['evidence_id'],'procedure':(r['procedure'].get('address') if isinstance(r.get('procedure'),dict) else r.get('procedure')),'value':value,'context':assembly[max(0,i-10):i+7]})
result={'scope':'retained odd-X0 indirect-call candidates; no field ownership or selected ABI proof inferred','artifact_sha256':target,'json_files_examined':files,'unique_records':len(seen),'skipped_over_32MiB':large,'matches':matches}
(O/'odd-call-candidates.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps({'files':files,'records':len(seen),'matches':len(matches),'skipped':len(large)}))
for m in matches[:20]:print(m['procedure'],m['value'],' | '.join(m['context'][-9:]))
