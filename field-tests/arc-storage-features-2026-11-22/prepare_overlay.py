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


prior=ROOT/'field-tests/arc-features-used-2026-11-21/features-used-seeds-2490.tsv';data=prior.read_bytes();known={int(x.split('\t')[0],16) for x in data.decode().splitlines()};a=0x100dbe518;bound=boundary(a);parent=0x100dbb45c;pb,refs=references(parent)
lines=data.decode().splitlines();lines.append(hex(a)+'\tfunction');lines=sorted(set(lines),key=lambda x:int(x.split('\t')[0],16));result=('\n'.join(lines)+'\n').encode();assert len(lines)==2491
p=OUT/'storage-policy-seeds-2491.tsv';p.write_bytes(result);receipt={'status':'passed','target_sha256':SHA,'prior_seed_sha256':digest(data),'seed':{'path':str(p.relative_to(ROOT)),'sha256':digest(result),'entries':2491},'added_entry':bound,'parent':pb,'original_parent_references':refs,'authority':'Supplemental storage-review query candidate at an exact original indexed function start. The supplied parent is not a direct B/BL origin; its relation to restore must be checked in new public observations. No provider discovery or active restore selection claimed.','target_executed':False};(OUT/'overlay-receipt.json').write_text(json.dumps(receipt,indent=2)+'\n');print(json.dumps({'status':'passed','entries':2491,'added':hex(a)}))
