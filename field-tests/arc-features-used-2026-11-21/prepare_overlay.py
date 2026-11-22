"""Supplemental query planning from exact original function starts and public targets."""
from pathlib import Path
import hashlib,json,struct,bisect
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];INPUT=ROOT/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'
SHA='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';b=INPUT.read_bytes();digest=lambda x:hashlib.sha256(x).hexdigest();assert digest(b)==SHA
segments=[];p=32;carrier=None;section=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,p)
 if cmd==0x19:
  name=b[p+8:p+24].rstrip(b'\0');vm,vs,fo,fs=struct.unpack_from('<QQQQ',b,p+24);segments.append((vm,fo,fs))
  if name==b'__TEXT':base=vm
  for i in range(struct.unpack_from('<I',b,p+64)[0]):
   q=p+72+i*80
   if b[q:q+16].rstrip(b'\0')==b'__text' and b[q+16:q+32].rstrip(b'\0')==b'__TEXT':section=struct.unpack_from('<QQI',b,q+32)
 if cmd==0x26:carrier=struct.unpack_from('<II',b,p+8)
 p+=size
assert carrier and section
starts=[];p,end=carrier[0],sum(carrier);a=base
while p<end:
 value=shift=0
 while True:
  c=b[p];p+=1;value|=(c&127)<<shift;shift+=7;assert shift<=64
  if c<128:break
 if not value:break
 a+=value;starts.append(a)
assert starts==sorted(set(starts))
startset=set(starts)
def original(a,n):
 hit=[fo+a-vm for vm,fo,fs in segments if vm<=a and a+n<=vm+fs];assert len(hit)==1;return b[hit[0]:hit[0]+n]
def boundary(a):
 assert a in startset,hex(a);i=bisect.bisect_left(starts,a);e=starts[i+1];sv,sz,so=section;assert sv<=a<e<=sv+sz;raw=original(a,e-a)
 return {'entry':hex(a),'next_indexed_entry':hex(e),'file_offset':so+a-sv,'bytes':len(raw),'sha256':digest(raw)}
def signed(x,bits):return x-(1<<bits) if x&(1<<(bits-1)) else x
def references(a):
 bound=boundary(a);raw=original(a,bound['bytes']);refs=[];words=list(struct.unpack('<'+'I'*(len(raw)//4),raw))
 for i,w in enumerate(words):
  pc=a+4*i;target=None;kind=None
  if w&0x7c000000==0x14000000:target=pc+(signed(w&0x3ffffff,26)<<2);kind='original-BL' if w&0x80000000 else 'original-B'
  elif w&0x9f000000==0x10000000:target=pc+signed(((w>>5)&0x7ffff)<<2|((w>>29)&3),21);kind='original-ADR-code-candidate'
  elif w&0x9f000000==0x90000000 and i+1<len(words):
   v=words[i+1];reg=w&31
   if v&0xff800000==0x91000000 and (v>>5)&31==reg and v&31==reg:
    target=(pc&~4095)+(signed(((w>>5)&0x7ffff)<<2|((w>>29)&3),21)<<12)+(((v>>10)&4095)<<(12 if v&(1<<22) else 0));kind='original-adjacent-ADRP-ADD-code-candidate'
  if target in startset:refs.append({'at':hex(pc),'target':hex(target),'kind':kind})
 return bound,refs

source=ROOT/'field-tests/arc-callbacks-2026-11-21/mcp-finish/function-0x10117d64c-read_function_instructions.evidence.json';record=json.loads(source.read_text());assert record['subject']['digest']['sha256']==SHA
pseudo=source.with_name(source.name.replace('read_function_instructions','procedure_pseudo_code'));pr=json.loads(pseudo.read_text());assert pr['subject']['digest']['sha256']==SHA
roots=[0x101160524,0x10116dc54,0x10117d748,0x10117d914,0x10117d92c];origins=[]
for a in roots:
 bound=boundary(a);assert f'{a:x}' in json.dumps(record['normalized_result']) or f'{a:x}' in pr['normalized_result'];origins.append({'entry':hex(a),'boundary':bound,'instruction_evidence':record['evidence_id'],'instruction_source_sha256':digest(source.read_bytes()),'pseudocode_evidence':pr['evidence_id'],'pseudocode_source_sha256':digest(pseudo.read_bytes()),'kind':'public-direct-code-or-async-continuation-candidate'})
prior=ROOT/'field-tests/arc-base-url-2026-11-21/application-paths-seeds-2481.tsv';lines=prior.read_text().splitlines();known={int(x.split('\t')[0],16) for x in lines};front=set(roots);known|=front;levels=[];scanned=[]
for depth in [1,2]:
 found=set()
 for a in sorted(front):
  bound,refs=references(a);scanned.append({'depth':depth,'interval':bound,'references':refs});found|={int(x['target'],16) for x in refs}-known
 known|=found;front=found;levels.append({'depth':depth,'additional_entries':list(map(hex,sorted(found)))})
assert len(known)-len(lines)<128
new=sorted(set(lines)|{hex(a)+'\tfunction' for a in known},key=lambda x:int(x.split('\t')[0],16));data=('\n'.join(new)+'\n').encode();seed=OUT/f'features-used-seeds-{len(new)}.tsv';seed.write_bytes(data)
receipt={'status':'passed','target_sha256':SHA,'original_function_start_entries':len(starts),'seed':{'path':str(seed.relative_to(ROOT)),'entries':len(new),'sha256':digest(data)},'prior_seed_sha256':digest(prior.read_bytes()),'root_origins':origins,'levels':levels,'scanned':scanned,'provider_calls':0,'target_executed':False,'limits':['Supplemental admission planning, not provider-owned complete function bodies or semantic execution.','Two bounded original reference levels; only exact LC_FUNCTION_STARTS entries in original file-backed text admitted.','No neighborhood or unresolved indirect target admission; old captures and production source unchanged.']}
(OUT/'overlay-receipt.json').write_text(json.dumps(receipt,indent=2)+'\n');print(json.dumps({'status':'passed','entries':len(new),'added':len(new)-len(lines),'seed':str(seed)}))
