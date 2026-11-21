"""Source-bound candidate scan of Swift associated-type reflection records."""
import hashlib,json,struct
from pathlib import Path
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
input_file=ROOT/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64';raw=input_file.read_bytes();SHA=hashlib.sha256(raw).hexdigest();assert SHA=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
assert struct.unpack_from('<II',raw)==(0xfeedfacf,0x100000c)
sections=[];o=32
for _ in range(struct.unpack_from('<I',raw,16)[0]):
 cmd,size=struct.unpack_from('<II',raw,o);assert size>=8 and o+size<=len(raw)
 if cmd==0x19:
  ns=struct.unpack_from('<I',raw,o+64)[0];assert 72+80*ns<=size
  for j in range(ns):
   p=o+72+80*j;name,seg,addr,sz,fo=struct.unpack_from('<16s16sQQI',raw,p);sections.append({'name':name.rstrip(b'\0').decode(),'segment':seg.rstrip(b'\0').decode(),'address':addr,'size':sz,'file_offset':fo})
 o+=size

def offset(a,n=1):
 hits=[s for s in sections if s['address']<=a and a+n<=s['address']+s['size'] and s['file_offset']+a-s['address']+n<=len(raw)];assert len(hits)==1,(hex(a),n)
 s=hits[0];return s['file_offset']+a-s['address']
def word(a):return struct.unpack_from('<i',raw,offset(a,4))[0]
def rel(a):return a+word(a)
def symbolic(a):
 begin=offset(a);p=begin
 while p-begin<512:
  v=raw[p]
  if v==0:break
  if 1<=v<=0x17:p+=5
  elif 0x18<=v<=0x1f:p+=9
  else:p+=1
 assert p-begin<512
 blob=raw[begin:p+1];first=None
 if blob[0] in (1,2):
  d=struct.unpack_from('<i',blob,1)[0];t=a+1+d
  first={'tag':blob[0],'field':hex(a+1),'displacement':d,'target':hex(t)}
  if blob[0]==2:
   first['indirect_slot']=hex(t);first['target']=hex(struct.unpack_from('<Q',raw,offset(t,8))[0])
 return {'address':hex(a),'bytes_hex':blob.hex(),'first_context_reference_candidate':first}
s=next(s for s in sections if s['name']=='__swift5_assocty');at=s['address'];end=at+s['size'];examined=0;matches=[];unsupported=[]
while at<end:
 p=offset(at,16);a,b,count,rs=struct.unpack_from('<iiII',raw,p);assert rs==8 and count<65536 and at+16+count*rs<=end
 conforming=symbolic(at+a);protocol=symbolic(at+4+b);first=conforming['first_context_reference_candidate'];examined+=1
 if first and first['target']=='0x103d648c4':
  records=[]
  for i in range(count):
   r=at+16+rs*i;nameaddr=rel(r);fo=offset(nameaddr);last=raw.index(0,fo);name=raw[fo:last].decode();records.append({'record_address':hex(r),'name_address':hex(nameaddr),'name':name,'substituted_type':symbolic(rel(r+4))})
  matches.append({'address':hex(at),'bytes_hex':raw[p:p+16+count*rs].hex(),'conforming_type':conforming,'protocol_type':protocol,'records':records})
 at+=16+count*rs
assert at==end
result={'kind':'original-byte-associated-type-candidates','target_sha256':SHA,'input':str(input_file),'section':s,'section_sha256':hashlib.sha256(raw[s['file_offset']:s['file_offset']+s['size']]).hexdigest(),'examined':examined,'selected_nominal_descriptor':'0x103d648c4','matches':matches,'reproducer':{'path':str(Path(__file__).relative_to(ROOT)),'sha256':hashlib.sha256(Path(__file__).read_bytes()).hexdigest()},'format_source':'https://github.com/swiftlang/swift/blob/main/include/swift/RemoteInspection/Records.h','limits':['Query-planning candidates from original bytes, not public provider observations.','Only conforming names whose first symbolic context resolves to the exact selected descriptor are selected; other manglings are not classified.','Raw indirect pointer words are not generalized dyld chained-fixup decoding. Selected candidates require public corroboration.','Reflection association does not prove active injection or anonymous constructor return identity.']}
(OUT/'associated-type-candidates.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps({'examined':examined,'matches':len(matches),'addresses':[x['address'] for x in matches]}))
