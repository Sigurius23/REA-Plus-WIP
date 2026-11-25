"""Build inert firmware data independently from the production decoder/test fixture helpers."""
from pathlib import Path
import hashlib,json,struct,tempfile,zlib
O=Path(__file__).resolve().parent
D=Path(tempfile.mkdtemp(prefix='rea-uf2-dfuse-fixtures-'))
def block(address,data,number,count,family=None,flags=0,valid=True):
 b=bytearray(512);flags|=0x2000 if family is not None else 0
 struct.pack_into('<8I',b,0,0x0a324655 if valid else 0,0x9e5d5157,flags,address,len(data),number,count,family or 0)
 b[32:32+len(data)]=data;struct.pack_into('<I',b,508,0x0ab16f30);return bytes(b)
def target(alt,name,elements,bad_size=False):
 body=b''.join(struct.pack('<II',address,len(data))+data for address,data in elements)
 prefix=struct.pack('<6sBI255sII',b'Target',alt,1,name.ljust(255,b'\0'),0 if bad_size else len(body),len(elements))
 return prefix+body
def dfu(legacy=False,bad_crc=False,bad_size=False):
 targets=target(3,b'flash\0raw',[(0x8000000,b'\1\2\3'),(0x8000001,b'\10'),(0,b'')],bad_size)+target(7,b'empty',[])
 prefix=struct.pack('<5sBIB',b'DfuSe',1,11+len(targets)+(0 if legacy else 16),2)
 suffix=struct.pack('<4H3sB',0xffff,0xdf11,0x483,0x11a,b'UFD',16)
 body=prefix+targets+suffix;crc=(~zlib.crc32(body))&0xffffffff
 return body+struct.pack('<I',0 if bad_crc else crc)
files={
 'families.uf2':block(0x1000,b'\1\2',0,1,0xe48bff56)+block(0x1000,b'\1\2',0,1,0xe48bff59),
 'partial.uf2':block(0,b'\1',0,4,flags=0xc000)+block(2,b'\2',1,4,flags=1)+block(3,b'\3',2,4,flags=0x1000)+block(4,b'\4',3,4,valid=False)+b'*',
 'conflict.uf2':block(0,b'\1',0,1)+block(0,b'\2',0,1),
 'valid.dfu':dfu(),'legacy.dfu':dfu(legacy=True),'bad-crc.dfu':dfu(bad_crc=True),'bad-size.dfu':dfu(bad_size=True),
}
rows=[]
for name,b in files.items():
 p=D/name;p.write_bytes(b);rows.append({'name':name,'path':str(p),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest(),'hex':b.hex()})
(O/'fixture-receipt.json').write_text(json.dumps({'builder':'build_fixtures.py','scratch_root':str(D),'target_executed':False,'files':rows},indent=2)+'\n')
print(json.dumps({'scratch_root':str(D),'files':len(rows)}))
