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
roots=[0x100d9b4d0,0x100d9a538,0x100d9a51c,0x100d9a554,0x100d99c1c,0x100d9a2b0,0x10007e670,0x100005068]
origins=[]
for a in roots:
 boundary(a);matches=[]
 for f in sorted((OUT/'mcp').glob('*.evidence.json')):
  d=json.loads(f.read_text());v=d['normalized_result'];needle=hex(a)
  if d['operation']=='inspect_native_instruction' and needle in json.dumps(v.get('flow',{})):matches.append({'path':str(f.relative_to(ROOT)),'evidence_id':d['evidence_id'],'kind':'direct-decoded-flow'})
  elif d['operation']=='inspect_native_dispatch_metadata' and any(s['implementation_address']==needle for s in v['result']['swift_dispatch_slots']):matches.append({'path':str(f.relative_to(ROOT)),'evidence_id':d['evidence_id'],'kind':'static-witness-target'})
 if a in [0x100d99c1c,0x100d9a2b0]:
  prefix,first,texts=('default-flow-',0x100d9a52c,['adrp x4,0x100d99000','add x4,x4,#0xc1c']) if a==0x100d99c1c else ('witness-bytes-',0x100d9a548,['adrp x4,0x100d9a000','add x4,x4,#0x2b0'])
  for off,text in enumerate(texts):
   f=OUT/'mcp'/(prefix+hex(first+4*off)+'.evidence.json');raw=f.read_bytes();d=json.loads(raw);assert d['normalized_result']['raw_disassembly']==text
   matches.append({'kind':'public-adjacent-ADRP-ADD-code-address-candidate','source':str(f.relative_to(ROOT)),'evidence_id':d['evidence_id'],'sha256':digest(raw),'not_signature_or_role_proof':True})
 assert matches,hex(a);origins.append({'entry':hex(a),'boundary':boundary(a),'public_origins':matches})
prior=ROOT/'field-tests/arc-callbacks-2026-11-21/storage-io-seeds-2463.tsv';lines=prior.read_text().splitlines();known={int(x.split('\t')[0],16) for x in lines};front=set(roots);known|=front;levels=[];scanned=[]
for depth in [1,2]:
 found=set()
 for a in sorted(front):
  bound,refs=references(a);scanned.append({'depth':depth,'interval':bound,'references':refs});found|={int(x['target'],16) for x in refs}-known
 known|=found;front=found;levels.append({'depth':depth,'additional_entries':list(map(hex,sorted(found)))})
assert len(known)-len(lines)<128
new=sorted(set(lines)|{hex(a)+'\tfunction' for a in known},key=lambda x:int(x.split('\t')[0],16));data=('\n'.join(new)+'\n').encode();seed=OUT/f'application-paths-seeds-{len(new)}.tsv';seed.write_bytes(data)
receipt={'status':'passed','target_sha256':SHA,'original_function_start_entries':len(starts),'function_starts_carrier':{'file_offset':carrier[0],'bytes':carrier[1],'sha256':digest(b[carrier[0]:sum(carrier)])},'seed':{'path':str(seed.relative_to(ROOT)),'entries':len(new),'sha256':digest(data)},'prior_seed_sha256':digest(prior.read_bytes()),'root_origins':origins,'levels':levels,'scanned':scanned,'provider_calls':0,'target_executed':False,'limits':['Supplemental admission planning; exact original indexed intervals are not provider-owned function body proofs.','Two bounded reference levels only; code-address candidates do not establish semantic roles.','No guessed neighborhood/indirect targets, profile/runtime selection or target execution.']}
(OUT/'overlay-receipt.json').write_text(json.dumps(receipt,indent=2)+'\n');print(json.dumps({'status':'passed','entries':len(new),'added':len(new)-len(lines),'seed':str(seed)}))
