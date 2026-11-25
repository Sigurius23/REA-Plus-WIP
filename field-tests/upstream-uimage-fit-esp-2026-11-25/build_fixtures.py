"""Inert firmware builders independent of production parsers and TypeScript fixture helpers."""
from pathlib import Path
import hashlib,json,struct,tempfile,zlib
O=Path(__file__).resolve().parent;D=Path(tempfile.mkdtemp(prefix='rea-uboot-esp-fixtures-'))
be=lambda *xs:struct.pack('>'+str(len(xs))+'I',*xs)
le=lambda x:struct.pack('<I',x)
string=lambda s:s.encode()+b'\0'
align=lambda x:(x+3)//4*4
rows=[]
def save(name,blob,expected):
 p=D/name;p.write_bytes(blob);rows.append({'name':name,'path':str(p),'bytes':len(blob),'sha256':hashlib.sha256(blob).hexdigest(),'hex':blob.hex(),'expected_extractions':{k:v.hex() for k,v in expected.items()}})
def uimage(payload,kind=2,bad_crc=False,bad_size=False):
 h=bytearray(64);struct.pack_into('>7I',h,0,0x27051956,0,1700000000,0xffffffff if bad_size else len(payload),0x8000,0x8004,0 if bad_crc else zlib.crc32(payload))
 h[28:32]=bytes([5,2,kind,1]);h[32:44]=b'owned-kernel';struct.pack_into('>I',h,4,zlib.crc32(h));return bytes(h)+payload
parts=[b'\1\2\3',b'\4\5'];payload=be(3,2,0)+parts[0]+b'\0'+parts[1]
save('multi.uimg',uimage(payload,4),{'payload.bin':payload,'image-0.bin':parts[0],'image-1.bin':parts[1]})
save('bad-crc.uimg',uimage(b'\1\2\3',bad_crc=True),{'payload.bin':b'\1\2\3'})
save('bad-size.uimg',uimage(b'\1',bad_size=True),{})
def fdt(root):
 names={};strings=bytearray();body=bytearray()
 def walk(node):
  name,props,children=node;body.extend(be(1));body.extend(string(name));body.extend(bytes((-len(body))%4))
  for key,data in props:
   if key not in names:names[key]=len(strings);strings.extend(string(key))
   body.extend(be(3,len(data),names[key]));body.extend(data);body.extend(bytes((-len(body))%4))
  for child in children:walk(child)
  body.extend(be(2))
 walk(root);body.extend(be(9));head=be(0xd00dfeed,56+len(body)+len(strings),56,56+len(body),40,17,16,0,len(strings),len(body))
 return head+bytes(16)+bytes(body)+bytes(strings)
def hashnode(data,bad=False):return ('hash-1',[('algo',string('sha256')),('value',bytes(32) if bad else hashlib.sha256(data).digest())],[])
def fit(mode='inline',bad_hash=False,late=False,duplicate=False):
 data=[b'\1\2\3\4',b'\5\6'];
 def tree(base):
  children=[]
  for i,chunk in enumerate(data):
   props=[('data',chunk)] if mode=='inline' else ([('data-offset',be(0)),('data-size',be(len(chunk)))] if i==0 else [('data-position',be(base+4)),('data-size',be(len(chunk)))])
   props += [('type',string('kernel' if i==0 else 'flat_dt')),('arch',string('arm64')),('compression',string('none')),('load',be(0x8000+i*4))]
   if duplicate and i==0:props.append(('type',string('firmware')))
   children.append(('kernel' if i==0 else 'tree',props,[hashnode(chunk,bad_hash and i==0)]))
  config=('configurations',[('default',string('conf-1'))],[('conf-1',[('kernel',string('kernel')),('fdt',string('tree')),('loadables',string('missing'))],[('signature-1',[('algo',string('sha256,rsa2048')),('value',b'\1\2')],[])])])
  props=[('description',string('Owned FIT'))]+([('padding',bytes(8192))] if late else [])
  return fdt(('',props,[('images',[],children),config]))
 blob=tree(0)
 if mode!='inline':base=align(len(blob));blob=tree(base);blob+=bytes(base-len(blob))+b''.join(data)
 return blob,{'image-0000.bin':data[0],'image-0001.bin':data[1]}
for name,opts in [('inline.fit',{}),('external.fit',{'mode':'external'}),('late.fit',{'late':True}),('bad-hash.fit',{'bad_hash':True}),('bad-structure.fit',{'duplicate':True})]:
 b,e=fit(**opts);save(name,b,e if not opts.get('duplicate') else {})
def esp(bad_checksum=False):
 h=bytearray(24);struct.pack_into('<BBBBI',h,0,0xe9,2,2,0x20,0x40380000);h[8]=0xee;struct.pack_into('<H',h,12,5);struct.pack_into('<H',h,17,199);h[23]=1
 data=[b'\1\2\3\4',b'\5\6\7\10'];body=bytes(h)+le(0x3fc88000)+le(4)+data[0]+le(0x40380000)+le(4)+data[1]
 checksum=0xef
 for chunk in data:
  for byte in chunk:checksum^=byte
 body+=bytes(15-len(body)%16)+bytes([0 if bad_checksum else checksum]);body+=hashlib.sha256(body).digest()
 return body,{'segment-00.bin':data[0],'segment-01.bin':data[1]}
def signed(bad_crc=False):
 b,e=esp();padded=b+b'\xff'*((-len(b))%4096);block=bytearray(1216);block[0:3]=bytes([0xe7,2,0]);block[4:36]=hashlib.sha256(padded).digest();struct.pack_into('<I',block,1196,zlib.crc32(block[:1196])^(1 if bad_crc else 0));block=bytes(block)
 e['signature-block-0.bin']=block;return padded+block+b'\xff'*(4096-len(block)),e
b,e=signed();save('signed.esp',b,e)
b,e=signed(True);save('bad-signature.esp',b,e)
b,e=esp(True);save('bad-checksum.esp',b,e)
b,e=esp();save('partial.esp',b[:34],{'segment-00.bin':b[32:34]})
b=bytes([0xe9,1,0,0x20])+le(0x40100004)+le(0x40100000)+le(4)+b'\1\2\3\4';save('esp8266.bin',b,{})
(O/'fixture-receipt.json').write_text(json.dumps({'builder':'build_fixtures.py','scratch_root':str(D),'target_executed':False,'files':rows},indent=2)+'\n');print(json.dumps({'scratch_root':str(D),'files':len(rows)}))
