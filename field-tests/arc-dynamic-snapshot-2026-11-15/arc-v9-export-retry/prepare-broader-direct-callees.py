from pathlib import Path
import json,struct,hashlib
p=Path(__file__).resolve().parent;root=p.parents[2];prep=json.loads((p/'broader-state-restore-preparation.json').read_text());index_path=root/'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json';index=json.loads(index_path.read_text());encoded=bytes.fromhex(index['normalized_result']['bytes_hex']);cur=0x100000000;value=shift=0;starts=[]
for byte in encoded:
 value|=(byte&127)<<shift
 if byte&128:shift+=7;continue
 if not value:break
 cur+=value;starts.append(cur);value=shift=0
lookup=set(starts);prior=(p/'broader-state-restore-seeds-2044.tsv').read_bytes();assert hashlib.sha256(prior).hexdigest()==prep['new_seed_sha256'];seeds=set(int(x.split('\t')[0],16) for x in prior.decode().splitlines());input_path=root/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64';raw=input_path.read_bytes();sha=hashlib.sha256(raw).hexdigest();assert sha=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
segments=[];o=32
for _ in range(struct.unpack_from('<I',raw,16)[0]):
 cmd,size=struct.unpack_from('<II',raw,o)
 if cmd==0x19:segments.append(struct.unpack_from('<QQQQ',raw,o+24))
 o+=size
def offset(a,n):
 for vm,vs,fo,fs in segments:
  if vm<=a and a+n<=vm+fs:return fo+a-vm
 raise ValueError(hex(a))
targets={};intervals=[]
for hypothesis in prep['hypotheses']:
 a=int(hypothesis['entry'],16);end=int(hypothesis['next_lc_start'],16);size=end-a;off=offset(a,size);interval=raw[off:off+size];intervals.append({'entry':hex(a),'next_lc_start':hex(end),'bytes':size,'file_offset':off,'interval_sha256':hashlib.sha256(interval).hexdigest(),'complete_body_claimed':False})
 for pc in range(a,end,4):
  instruction=struct.unpack_from('<I',interval,pc-a)[0]
  if instruction&0x7c000000!=0x14000000:continue
  imm=instruction&0x3ffffff;imm=imm-(1<<26) if imm&(1<<25) else imm;target=pc+imm*4
  if target in seeds or target not in lookup or target>=0x103600000:continue
  targets.setdefault(target,[]).append({'source_interval_entry':hex(a),'pc':hex(pc),'instruction_word':hex(instruction),'opcode':'BL' if instruction>>31 else 'B','signed_displacement':imm*4})
assert len(targets)==18
rows=[]
for target,origins in sorted(targets.items()):
 i=starts.index(target);rows.append({'entry':hex(target),'next_lc_start':hex(starts[i+1]),'indexed_interval_bytes':starts[i+1]-target,'caller_checked_source_branches':origins,'future_public_role':'Unassigned; explicit caller preparation hypothesis only. Import/function body/runtime reachability are not inferred.'})
lines=[x for x in prior.decode().splitlines()]+[hex(a)+'\tfunction' for a in targets];lines.sort(key=lambda x:int(x.split('\t')[0],16));assert len(lines)==len(set(lines))==2062;seed=('\n'.join(lines)+'\n').encode()
for name,data in [('broader-direct-callee-seeds-2062.tsv',seed),('broader-direct-callee-preparation.json',(json.dumps({'authority':'Explicit analyst branch decoding in six public LC_FUNCTION_STARTS-bounded source intervals, SHA-checked original bytes. Additional entries are preparation hypotheses for later public body queries; not observed runtime call execution or complete interval-body evidence.','target_sha256':sha,'input_path':str(input_path),'source_lc_evidence_id':index['evidence_id'],'prior_seed_file':'broader-state-restore-seeds-2044.tsv','prior_seed_sha256':hashlib.sha256(prior).hexdigest(),'prior_seed_count':2044,'seed_file':'broader-direct-callee-seeds-2062.tsv','seed_sha256':hashlib.sha256(seed).hexdigest(),'seed_count':2062,'additional_direct_targets':18,'source_intervals':intervals,'targets':rows,'provider_calls_executed':0,'boundedness':'No recursion, no inferred indirect targets, no seeds for target bytes absent from the public LC_FUNCTION_STARTS index, and no external stub neighborhood admission. The six primary12 public requests remain unchanged.'},indent=2)+'\n').encode())]:
 out=p/name
 if out.exists():raise RuntimeError('Refusing to overwrite '+name)
 out.write_bytes(data)
print(json.dumps({'status':'passed','new_seeds':2062,'additional_targets':18,'source_interval_bytes':sum(x['bytes'] for x in intervals)}))
