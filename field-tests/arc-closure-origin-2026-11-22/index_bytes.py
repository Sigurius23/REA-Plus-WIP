from pathlib import Path
import struct,json,hashlib,bisect
O=Path(__file__).resolve().parent;R=O.parents[1];p=R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64';b=p.read_bytes();assert hashlib.sha256(b).hexdigest()=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
ncmd=struct.unpack_from('<I',b,16)[0];cursor=32;text=None;starts=None;base=None
for _ in range(ncmd):
 kind,size=struct.unpack_from('<II',b,cursor);assert size>=8 and cursor+size<=len(b)
 if kind==0x19:
  segment=b[cursor+8:cursor+24].split(b'\0')[0]
  vm,fileoff=struct.unpack_from('<Q',b,cursor+24)[0],struct.unpack_from('<Q',b,cursor+40)[0]
  if segment==b'__TEXT':base=vm
  count=struct.unpack_from('<I',b,cursor+64)[0]
  for i in range(count):
   at=cursor+72+80*i;name=b[at:at+16].split(b'\0')[0]
   if segment==b'__TEXT' and name==b'__text':text=struct.unpack_from('<QQI',b,at+32)
 if kind==0x26:starts=struct.unpack_from('<II',b,cursor+8)
 cursor+=size
assert text and starts and base is not None
addr,length,offset=text;functions=[];at,end=starts[0],sum(starts);total=base
while at<end:
 value=0;shift=0
 while True:
  byte=b[at];at+=1;value|=(byte&127)<<shift
  if byte<128:break
  shift+=7;assert shift<64
 if value==0:break
 total+=value;functions.append(total)
matches=[]
for displacement in range(0,length-32,4):
 word=struct.unpack_from('<I',b,offset+displacement)[0]
 if word&0xffe0001f!=0x52800000:continue
 value=(word>>5)&65535
 if not(3<=value<297 and value&1):continue
 for step in range(1,7):
  after=struct.unpack_from('<I',b,offset+displacement+4*step)[0]
  if after&0xfffffc1f==0xd63f0000:
   address=addr+displacement;index=bisect.bisect_right(functions,address)-1
   matches.append({'address':hex(address),'value':value,'indirect_call':hex(address+4*step),'function_start':hex(functions[index]) if index>=0 else None,'function_start_authority':'LC_FUNCTION_STARTS predecessor, not complete CFG ownership','file_offset':offset+displacement,'bytes_hex':b[offset+displacement:offset+displacement+4*(step+1)].hex()});break
result={'scope':'Original __text MOVZ W0 odd immediate followed by BLR candidates; no reachability, type or ABI inference','sha256':hashlib.sha256(b).hexdigest(),'function_starts':len(functions),'text':{'address':hex(addr),'bytes':length,'file_offset':offset},'candidates':matches}
(O/'byte-call-candidates.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps({'candidates':len(matches),'function_starts':len(functions)}))
for x in matches[:30]:print(x['address'],x['value'],x['indirect_call'],x['function_start'])
