"""Supplemental immutable-byte selection hints; not normalized REA+ findings."""
from pathlib import Path
import struct, json, bisect, hashlib
P=Path(__file__).resolve().parent; R=P.parents[1]
b=(R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64').read_bytes()
assert hashlib.sha256(b).hexdigest()=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
at=32; text=None; starts_data=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
    cmd,size=struct.unpack_from('<II',b,at)
    if cmd==0x19:
        for i in range(struct.unpack_from('<I',b,at+64)[0]):
            s=at+72+i*80
            if b[s:s+16].rstrip(b'\0')==b'__text':text=struct.unpack_from('<QQI',b,s+32)
    if cmd==0x26:
        off,n=struct.unpack_from('<II',b,at+8);starts_data=b[off:off+n]
    at+=size
assert text and starts_data
starts=[]; value=shift=0;cur=0x100000000
for c in starts_data:
    value|=(c&127)<<shift
    if c&128:shift+=7
    else:
        if value==0:break
        cur+=value;starts.append(cur);value=shift=0
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_ARM
md=Cs(CS_ARCH_ARM64,CS_MODE_ARM);rows=[]
va,n,off=text
for pos in range(0,n-32,4):
 w=struct.unpack_from('<I',b,off+pos)[0]
 if w&0xffc00000!=0xf9400000 or ((w>>10)&4095)!=19:continue
 rt=w&31
 if rt>=31:continue
 for delta in range(4,28,4):
  call=struct.unpack_from('<I',b,off+pos+delta)[0]
  if call != 0xd63f0000|(rt<<5):continue
  pc=va+pos;i=bisect.bisect_right(starts,pc)-1
  after=list(md.disasm(b[off+pos+delta+4:off+pos+delta+20],pc+delta+4))
  boolean=[dict(address=hex(x.address),mnemonic=x.mnemonic,operands=x.op_str) for x in after if x.mnemonic in ['tbz','tbnz','cbz','cbnz','cmp'] and (x.op_str.startswith('w0,') or x.op_str.startswith('x0,'))]
  rows.append(dict(load=hex(pc),call=hex(pc+delta),register='x'+str(rt),base_register='x'+str((w>>5)&31),preceding_lc_entry=hex(starts[i]),next_lc_entry=hex(starts[i+1]),lc_span_bytes=starts[i+1]-starts[i],following_boolean_candidates=boolean));break
record=dict(authority='Supplemental immutable-byte query hints only; slot shape does not prove metadata identity, dataflow, reachability, or complete callers',target_sha256=hashlib.sha256(b).hexdigest(),text=dict(address=hex(va),bytes=n,file_offset=off),candidates=rows)
(P/'vtable-caller-selection.json').write_text(json.dumps(record,indent=2)+'\n')
selected=[x for x in rows if x['following_boolean_candidates']]
print(json.dumps(dict(candidates=len(rows),boolean_candidates=selected)))
