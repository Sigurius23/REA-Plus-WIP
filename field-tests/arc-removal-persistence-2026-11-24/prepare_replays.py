"""Explicit raw-memory/mid-block controls. Never run Arc or the owned binary."""
from pathlib import Path
import json,struct,hashlib,subprocess
P=Path(__file__).resolve().parent; R=P.parent.parent
arc=R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'
owned=R/'rea-local/.cache/arc-removal-persistence-2026-11-24/removal-reference'
b=owned.read_bytes();at=32;text=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,at)
 if cmd==0x19:
  for i in range(struct.unpack_from('<I',b,at+64)[0]):
   s=at+72+i*80
   if b[s:s+16].rstrip(b'\0')==b'__text': text=struct.unpack_from('<QQI',b,s+32)
 at+=size
assert text
va,size,fileoff=text
symbols={}
for line in subprocess.check_output(['/usr/bin/nm','-nm',str(owned)],text=True).splitlines():
 if line.endswith(' _choose_move'): symbols['choose_move']=int(line.split()[0],16)
 if line.endswith(' _isolated_remove'): symbols['isolated_remove']=int(line.split()[0],16)
assert len(symbols)==2
refcode=[dict(address=hex(va),file_offset=fileoff,size=size)]
steps=[];rows=[]
def save(label,request):
 p=P/(label+'.request.json');p.write_text(json.dumps(request,indent=2)+'\n')
 steps.append(dict(name='emulate_function',label=label,arguments={'$json_file':str(p)},expect_success=True))
def request(path,entry,code,registers,memory=None,observe=None,stops=None):
 return dict(path=str(path),architecture='arm64',entry_address=hex(entry),code_regions=code,initial_registers=registers,memory_regions=memory or [],observe_memory=observe or [],stop_addresses=stops or [],max_instructions=600,max_coverage_entries=600,timeout_ms=2000)
choices=[('left-edge',2,5,2),('right-edge',2,5,5),('below',2,5,1),('above',2,5,6),('wrap-upper',6,1,7),('wrap-lower',6,1,0),('wrap-outside',6,1,3),('single-hit',4,4,4),('single-miss',4,4,5),('negative-hash',6,1,(1<<64)-2)]
for name,start,hole,hashed in choices:
 mask=7;move=((hashed&mask)-start)&mask <= (hole-start)&mask
 code=[dict(address='0x100710358',file_offset=0x710358,size=40),dict(address='0x100710304',file_offset=0x710304,size=4),dict(address='0x100710380',file_offset=0x710380,size=4)]
 a=request(arc,0x100710358,code,dict(x0=hex(hashed),x22=hex(hole),x23=hex(mask),x28=hex(start)),stops=['0x100710304','0x100710380'])
 o=request(owned,symbols['choose_move'],refcode,dict(x0=hex(start),x1=hex(hole),x2=hex(hashed),x3=hex(mask)))
 save('arc-decision-'+name,a);save('owned-decision-'+name,o)
 rows.append(dict(kind='decision',name=name,start=start,hole=hole,hash=hex(hashed),mask=mask,expected_move=move,expected_pc='0x100710380' if move else '0x100710304'))
iso=[('only-zero',0,1,7),('only-seven',7,0x80,9),('isolated-with-other',6,0x44,15),('word24-wrap',3,8,0xffffffff)]
for name,hole,occupied,word24 in iso+[('cluster-external-stop',6,0xc0,11)]:
 header=bytearray(72);struct.pack_into('<qQ',header,0x10,occupied.bit_count(),6);header[0x20]=3;struct.pack_into('<I',header,0x24,word24)
 struct.pack_into('<QQQ',header,0x28,0x1234,0x60001000,0x60002000)
 bitmap=(((1<<64)-1)^0xff)|occupied;struct.pack_into('<Q',header,0x40,bitmap)
 keys=hashlib.shake_256(b'owned raw key bytes').digest(128);values=hashlib.shake_256(b'owned raw value bytes').digest(256)
 memory=[dict(address='0x60000000',bytes_hex=header.hex(),permissions='rw'),dict(address='0x60001000',bytes_hex=keys.hex(),permissions='r'),dict(address='0x60002000',bytes_hex=values.hex(),permissions='r'),dict(address='0x70000000',bytes_hex='00'*4096,permissions='rw')]
 observe=[dict(address='0x60000000',size=72),dict(address='0x60001000',size=128),dict(address='0x60002000',size=256)]
 a=request(arc,0x100710288,[dict(address='0x100710288',file_offset=0x710288,size=424)],dict(x0=hex(hole),x1='0x60000000',sp='0x70000800'),memory,observe)
 save('arc-isolated-'+name,a)
 if name=='cluster-external-stop':
  expected=bytes(header)
 else:
  o=request(owned,symbols['isolated_remove'],refcode,dict(x0='0x60000000',x1=hex(hole),sp='0x70000800'),memory,observe)
  save('owned-isolated-'+name,o)
  expected=bytearray(header);struct.pack_into('<q',expected,0x10,occupied.bit_count()-1);struct.pack_into('<I',expected,0x24,(word24+1)&0xffffffff);struct.pack_into('<Q',expected,0x40,bitmap&~(1<<hole))
 rows.append(dict(kind='isolated',name=name,hole=hole,occupied=hex(occupied),header_before=header.hex(),header_after=expected.hex(),keys_hex=keys.hex(),values_hex=values.hex(),stop='external_call' if name=='cluster-external-stop' else 'function_return'))
steps.append(dict(name='export_evidence_bundle',label='replay-export',arguments=dict(path=str(P/'mcp-replays/final.bundle.json')),expect_success=True))
(P/'replay-derivation.json').write_text(json.dumps(dict(authority='Explicit synthetic raw headers/bytes and after-hash register inputs, not live caches, valid Swift objects or recovered Hasher outputs',artifact_sha256=hashlib.sha256(arc.read_bytes()).hexdigest(),reference_source_sha256=hashlib.sha256((P/'removal_reference.c').read_bytes()).hexdigest(),reference_sha256=hashlib.sha256(b).hexdigest(),compiler_version=subprocess.check_output(['/usr/bin/clang','--version'],text=True),reference_symbols={k:hex(v) for k,v in symbols.items()},reference_text=dict(address=hex(va),size=size,file_offset=fileoff),cases=rows),indent=2)+'\n')
(P/'plan-replays.json').write_text(json.dumps(dict(output_dir=str(P/'mcp-replays'),environment=dict(REA_UNICORN_PYTHON=str(R/'rea-local/.cache/arc-dispatch-emulation-python-2026-11-23/bin/python')),steps=steps),indent=2)+'\n')
print('prepared',len(rows),'cases',len(steps)-1,'emulations')
