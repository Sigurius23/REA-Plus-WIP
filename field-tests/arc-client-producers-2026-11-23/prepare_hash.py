"""Explicit replay inputs and owned source reference. No target host execution."""
from pathlib import Path
import json,struct,hashlib
P=Path(__file__).resolve().parent; R=P.parent.parent
arc=R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'
owned=R/'rea-local/.cache/arc-client-producers-2026-11-23/owned-hash'
b=owned.read_bytes(); off=32; section=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,off)
 if cmd==0x19:
  for i in range(struct.unpack_from('<I',b,off+64)[0]):
   s=off+72+i*80
   if b[s:s+16].rstrip(b'\0')==b'__text': section=struct.unpack_from('<QQI',b,s+32)
 off+=size
assert section is not None
va,size,fileoff=section
assert va==0x100000310
inputs=[]
for name,text in [('empty',''),('ascii','a'),('path','/tmp/arc'),('small15','abcdefghijklmno'),('unicode','ärç/🐍')]:
 data=text.encode(); assert len(data)<=15
 raw=data.ljust(15,b'\0')+bytes([0xe0|len(data)])
 x0,x1=struct.unpack('<QQ',raw)
 inputs.append((name,data,x0,x1,[]))
ab=arc.read_bytes()
for name,count,x0,x1,addr in [('native49',30,0xd00000000000001e,0x80000001039d1190,0x1039d11b0),('native50',27,0xd00000000000001b,0x80000001039d1170,0x1039d1190)]:
 data=ab[addr-0x100000000:addr-0x100000000+count]
 inputs.append((name,data,x0,x1,[dict(address=hex(addr),bytes_hex=data.hex(),permissions='r')]))
steps=[]; rows=[]
def save(name,request):
 f=P/(name+'.request.json');f.write_text(json.dumps(request,indent=2)+'\n')
 steps.append(dict(name='emulate_function',label=name,arguments={'$json_file':str(f)},expect_success=True))
for name,data,x0,x1,memory in inputs:
 reference=5381
 for byte in data: reference=(reference*33+byte)&((1<<64)-1)
 rows.append(dict(name=name,utf8_hex=data.hex(),text=data.decode(),expected=hex(reference),arc_x0=hex(x0),arc_x1=hex(x1)))
 req=dict(path=str(arc),architecture='arm64',entry_address='0x1007ed818',code_regions=[dict(address='0x1007ed818',file_offset=0x7ed818,size=392)],initial_registers=dict(x0=hex(x0),x1=hex(x1),sp='0x70001000'),memory_regions=[dict(address='0x70000000',bytes_hex='00'*8192,permissions='rw'),*memory],max_instructions=10000,max_coverage_entries=1000,timeout_ms=2000)
 save('arc-hash-'+name,req)
 owned_req=dict(path=str(owned),architecture='arm64',entry_address=hex(va),code_regions=[dict(address=hex(va),file_offset=fileoff,size=size)],initial_registers=dict(x0='0x60000000',x1=hex(len(data)),sp='0x70001000'),memory_regions=[dict(address='0x60000000',bytes_hex=(data or b'\0').hex(),permissions='r'),dict(address='0x70000000',bytes_hex='00'*8192,permissions='rw')],max_instructions=10000,max_coverage_entries=1000,timeout_ms=2000)
 save('owned-hash-'+name,owned_req)
 if name=='native49':
  negative=dict(req,memory_regions=req['memory_regions'][:1]);save('arc-hash-native49-unmapped',negative)
steps.append(dict(name='export_evidence_bundle',label='hash-export',arguments=dict(path=str(P/'mcp-hash/final.bundle.json')),expect_success=True))
(P/'hash-input-derivation.json').write_text(json.dumps(dict(authority='Caller-selected explicit Swift String representations and original literal bytes; source-built C is independently emulated; Python arithmetic is supplemental QA, not REA+ output.',source_sha256=hashlib.sha256(ab).hexdigest(),owned_sha256=hashlib.sha256(b).hexdigest(),owned_code_region=dict(address=hex(va),file_offset=fileoff,size=size),inputs=rows),indent=2,ensure_ascii=False)+'\n')
(P/'plan-hash.json').write_text(json.dumps(dict(output_dir=str(P/'mcp-hash'),environment=dict(REA_UNICORN_PYTHON=str(R/'rea-local/.cache/arc-dispatch-emulation-python-2026-11-23/bin/python')),steps=steps),indent=2)+'\n')
print('prepared',len(rows),'input pairs and one missing-memory control')
