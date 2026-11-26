"""Build inert flash dumps with independent Python struct/hashlib/zlib layout/CRC operations."""
from pathlib import Path
import hashlib,json,struct,tempfile,zlib
O=Path(__file__).resolve().parent;D=Path(tempfile.mkdtemp(prefix='rea-esp-flash-fixtures-'))
PARTS=[('nvs',1,2,0x9000,0x4000),('otadata',1,0,0xd000,0x2000),('phy_init',1,1,0xf000,0x1000),('factory',0,0,0x10000,0x10000),('ota_0',0,0x10,0x20000,0x10000),('ota_1',0,0x11,0x30000,0x10000)]
def image(chip=5):
 h=bytearray(24);struct.pack_into('<BBBBI',h,0,0xe9,1,2,0x20,0x40380000);h[8]=0xee;struct.pack_into('<H',h,12,chip);struct.pack_into('<H',h,17,199);h[23]=1
 data=b'\1\2\3\4';b=bytes(h)+struct.pack('<II',0x40380000,len(data))+data;b+=bytes(15-len(b)%16)+bytes([0xef^1^2^3^4]);return b+hashlib.sha256(b).digest()
def table(parts,bad=False,md5=True):
 b=b''.join(struct.pack('<HBBII16sI',0x50aa,t,st,off,size,label.encode().ljust(16,b'\0'),0) for label,t,st,off,size in parts)
 if md5:
  digest=bytearray(hashlib.md5(b).digest());digest[0]^=0xff if bad else 0;b+=b'\xeb\xeb'+b'\xff'*14+bytes(digest)
 return b+b'\xff'*(0x1000-len(b))
def record(seq,state=2,bad=False):
 prefix=struct.pack('<I',seq);crc=zlib.crc32(prefix,0xffffffff)&0xffffffff
 return prefix+b'\xff'*20+struct.pack('<II',state,crc^(1 if bad else 0))
def dump(parts=PARTS,table_at=0x8000,origin=0,size=0x40000,bad_md5=False,erased=False,md5=True):
 b=bytearray(b'\xff'*size);boot=image(0 if origin==0x1000 else 5);boot_at=0x1000 if origin==0x1000 else 0;b[boot_at:boot_at+len(boot)]=boot
 b[table_at:table_at+0x1000]=table(parts,bad_md5,md5)
 for label,t,st,off,length in parts:
  if t==0:b[off:off+len(image())]=image()
 if not erased:
  ota=next((p for p in parts if p[1:3]==(1,0)),None)
  if ota:
   off=ota[3];b[off:off+32]=record(1);b[off+0x1000:off+0x1020]=record(2)
 return bytes(b)[origin:]
rows=[]
def save(name,b,open_args,regions):
 p=D/name;p.write_bytes(b);rows.append({'name':name,'path':str(p),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest(),'hex':b.hex(),'open_args':open_args,'expected_regions':regions})
def regions(parts,table_at=0x8000,origin=0,boot_at=0):
 raw={'bootloader.bin':(boot_at-origin,table_at-boot_at),'partition-table.bin':(table_at-origin,0x1000)}
 raw.update({'partitions/'+label+'.bin':(off-origin,size) for label,_,_,off,size in parts})
 return {name:{'declared_offset':off,'length':size} for name,(off,size) in raw.items()}
base={'format':'esp-flash-image'}
save('whole.bin',dump(),base,regions(PARTS))
save('erased-ota.bin',dump(erased=True),base,regions(PARTS))
save('bad-md5.bin',dump(bad_md5=True),base,regions(PARTS))
save('no-md5.bin',dump(md5=False),{**base,'partition_table_offset':'0x8000'},regions(PARTS))
lead=[('prefix',1,2,0,0x2000),*PARTS]
save('leading.bin',dump(parts=lead,origin=0x1000),{**base,'flash_offset':'0x00001000','partition_table_offset':'0x8000'},regions(lead,origin=0x1000,boot_at=0x1000))
# Move data partitions beyond the custom table while preserving two OTA slots.
custom=[('otadata',1,0,0xc000,0x2000),('factory',0,0,0x10000,0x10000),('ota_0',0,0x10,0x20000,0x10000),('ota_1',0,0x11,0x30000,0x10000)]
save('scanned.bin',dump(parts=custom,table_at=0xa000),base,regions(custom,table_at=0xa000))
for row in rows:
 b=bytes.fromhex(row['hex'])
 for value in row['expected_regions'].values():
  start=max(0,min(len(b),value['declared_offset']));end=max(start,min(len(b),value['declared_offset']+value['length']));value['stored_offset']=max(0,-value['declared_offset']);value['physical_offset']=start if end>start else None;value['hex']=b[start:end].hex()
(O/'fixture-receipt.json').write_text(json.dumps({'builder':'build_fixtures.py','scratch_root':str(D),'target_executed':False,'files':rows},indent=2)+'\n');print(json.dumps({'files':len(rows),'scratch_root':str(D)}))
