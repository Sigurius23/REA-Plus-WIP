"""Independent inert AOSP-layout fixtures; never execute boot or OTA contents."""
from pathlib import Path
import hashlib,json,struct,tempfile
O=Path(__file__).resolve().parent;D=Path(tempfile.mkdtemp(prefix='rea-android-firmware-fixtures-'))
rows=[];PAGE=4096
align=lambda n:(n+PAGE-1)//PAGE*PAGE
u32=lambda b,o,n:struct.pack_into('<I',b,o,n)
u64=lambda b,o,n:struct.pack_into('<Q',b,o,n)
def save(name,b,expect):
 p=D/name;p.write_bytes(b);rows.append({'name':name,'path':str(p),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest(),'hex':b.hex(),'expect':expect})
def boot(version):
 legacy=version<3;head={0:1632,1:1648,2:1660,3:1580,4:1584}[version];h=bytearray(PAGE);h[:8]=b'ANDROID!';u32(h,40,version)
 kernel=b'kernel!';ramdisk=b'\x1f\x8b\x08ramdisk';parts=[('kernel',PAGE,kernel),('ramdisk',PAGE*2,ramdisk)];end=PAGE*3
 if legacy:
  for at,n in [(8,len(kernel)),(12,0x10008000),(16,len(ramdisk)),(20,0x11000000),(24,0),(28,0),(32,0x10000100),(36,PAGE),(44,(14<<25)|(26<<4)|11)]:u32(h,at,n)
  h[48:55]=b'field-1';h[64:77]=b'console=ttyS0';h[576:608]=bytes(range(32));h[608:613]=b'extra'
  if version>=1:
   dtbo=b'DTBO';u32(h,1632,len(dtbo));u64(h,1636,end);u32(h,1644,head);parts.append(('recovery_dtbo',end,dtbo));end+=PAGE
  if version>=2:
   dtb=b'\xd0\x0d\xfe\xedDTB';u32(h,1648,len(dtb));u64(h,1652,(1<<53)+7);parts.append(('dtb',end,dtb));end+=PAGE
 else:
  for at,n in [(8,len(kernel)),(12,len(ramdisk)),(16,(14<<25)|(26<<4)|11),(20,head)]:u32(h,at,n)
  h[44:57]=b'console=ttyS0'
  if version==4:
   signature=b'BOOT-SIGN';u32(h,1580,len(signature));parts.append(('signature',end,signature));end+=PAGE
 b=bytearray(end);b[:PAGE]=h
 for _,at,data in parts:b[at:at+len(data)]=data
 if version==4:
  vbmeta=b'AVB0'+bytes(range(28));original=end;footer_at=end+PAGE-64;b.extend(bytes(PAGE));b[end:end+len(vbmeta)]=vbmeta
  footer=struct.pack('>4sIIQQQ28s',b'AVBf',1,0,original,end,len(vbmeta),bytes(28));b[footer_at:footer_at+64]=footer
  parts += [('avb_vbmeta',end,vbmeta),('avb_footer',footer_at,footer)]
 return bytes(b),{'format':'android-boot-image','version':version,'image_kind':'boot','regions':{name:{'offset':at,'hex':data.hex()} for name,at,data in parts}}
def vendor(version):
 h=bytearray(PAGE);h[:8]=b'VNDRBOOT';u32(h,8,version);u32(h,12,PAGE);u32(h,16,0x10008000);u32(h,20,0x11000000)
 fragments=[b'\x1f\x8b\x08AAAAA',b'\x04\x22\x4d\x18BBBB'];section=b''.join(fragments);u32(h,24,len(section));h[28:41]=b'vendor=field1';u32(h,2076,0x10000100);h[2080:2087]=b'vendor1';u32(h,2096,2112 if version==3 else 2128)
 dtb=b'\xd0\x0d\xfe\xedDTB';u32(h,2100,len(dtb));u64(h,2104,0x1_0000_1000)
 parts=[('dtb',PAGE*2,dtb)];end=PAGE*3
 if version==3:parts.append(('vendor_ramdisk',PAGE,section))
 else:
  table=b''
  for i,data in enumerate(fragments):
   name=(b'../odd' if i==0 else b'ramdisk-0').ljust(32,b'\0');table+=struct.pack('<III32s16I4s',len(data),sum(map(len,fragments[:i])),i+1,name,*range(i,i+16),b'\x11\x22\x33\x44')
   parts.append((f'vendor_ramdisk/{i:06}.bin',PAGE+sum(map(len,fragments[:i])),data))
  config=b'field.config=yes\n';u32(h,2112,len(table));u32(h,2116,2);u32(h,2120,112);u32(h,2124,len(config))
  parts += [('vendor_ramdisk_section',PAGE,section),('vendor_ramdisk_table',end,table),('bootconfig',end+PAGE,config)];end+=PAGE*2
 b=bytearray(end);b[:PAGE]=h;b[PAGE:PAGE+len(section)]=section
 for _,at,data in parts:b[at:at+len(data)]=data
 return bytes(b),{'format':'android-boot-image','version':version,'image_kind':'vendor-boot','regions':{name:{'offset':at,'hex':data.hex()} for name,at,data in parts}}
def varint(n):
 b=bytearray()
 while n>=128:b.append((n&127)|128);n>>=7
 b.append(n);return bytes(b)
def v(n,x):return varint(n<<3)+varint(x)
def d(n,b):return varint((n<<3)|2)+varint(len(b))+b
def extent(start,blocks):return v(1,start)+v(2,blocks)
def ota(bad=False,wide=False):
 blob=b'HELLO'+b'COMP!!'+b'???';sig=d(1,d(2,b'payload-signature'));meta=d(1,d(2,b'metadata-signature'))
 op0=v(1,0)+v(2,(1<<53)+1 if wide else 0)+v(3,5)+d(6,extent(0,1))+d(8,bytes(32) if bad else hashlib.sha256(blob[:5]).digest())
 op1=v(1,6)+d(6,extent(1,1));op2=v(1,4)+d(4,extent((1<<64)-1,1))+d(6,extent(2,1))+d(9,bytes(32))
 op3=v(1,8)+v(2,5)+v(3,6)+d(6,extent(3,1))+d(8,hashlib.sha256(blob[5:11]).digest())
 op4=v(1,14)+v(2,11)+v(3,3)+d(6,extent(4,1))+d(8,hashlib.sha256(blob[11:]).digest())
 partition=d(1,b'\xef\xbb\xbfsystem/../odd')+v(2,0)+d(7,v(1,5*PAGE)+d(2,bytes(32)))+b''.join(d(8,op) for op in [op0,op1,op2,op3,op4])
 dynamic=d(1,d(1,b'main')+v(2,5*PAGE)+d(3,b'\xef\xbb\xbfsystem/../odd'))+v(2,1)+v(3,0)+d(4,b'custom')
 manifest=v(3,PAGE)+v(4,len(blob))+v(5,len(sig))+v(12,9)+d(13,partition)+v(14,(1<<53)+5)+d(15,dynamic)+v(16,0)+d(18,b'2026-11-05')+v(100,(1<<63)+7)
 header=struct.pack('>4sQQI',b'CrAU',2,len(manifest),len(meta));off=len(header)+len(manifest)+len(meta);b=header+manifest+meta+blob+sig
 regions={'header.bin':{'offset':0,'hex':header.hex()},'manifest.pb':{'offset':24,'hex':manifest.hex()},'metadata-signatures.pb':{'offset':24+len(manifest),'hex':meta.hex()},'payload-signatures.pb':{'offset':off+len(blob),'hex':sig.hex()}}
 for i,start,length in [(0,0,5),(1,0,0),(2,0,0),(3,5,6),(4,11,3)]:
  regions[f'partitions/0000/operation-{i:06}.bin']={'offset':None if wide and i==0 else off+start,'hex':'' if wide and i==0 else blob[start:start+length].hex()}
 return b,{'format':'android-ota-payload','bad_hash':bad,'wide_offset':wide,'regions':regions,'blob_offset':off}
for version in range(5):
 b,e=boot(version);save(f'boot-v{version}.bin',b,e)
for version in [3,4]:
 b,e=vendor(version);save(f'vendor-v{version}.bin',b,e)
for name,kwargs in [('ota.bin',{}),('ota-bad-hash.bin',{'bad':True}),('ota-wide-offset.bin',{'wide':True})]:
 b,e=ota(**kwargs);save(name,b,e)
save('ota-v1.bin',struct.pack('>4sQQ',b'CrAU',1,0),{'format':'android-ota-payload','refusal':'unsupported'})
save('ota-malformed.bin',struct.pack('>4sQQI',b'CrAU',2,2,0)+b'\x6a\x80',{'format':'android-ota-payload','refusal':'format'})
(O/'fixture-receipt.json').write_text(json.dumps({'target_executed':False,'scratch_root':str(D),'builder':'build_fixtures.py','files':rows},indent=2)+'\n');print(json.dumps({'files':len(rows),'scratch_root':str(D)}))
