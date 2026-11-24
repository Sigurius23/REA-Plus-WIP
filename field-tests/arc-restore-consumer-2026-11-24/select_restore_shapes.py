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
rows=[]
va,n,off=text
for pos in range(0,n-4,4):
 w=struct.unpack_from('<I',b,off+pos)[0]
 if w&0xffc00000!=0xa9400000 or ((w>>15)&127)!=8:continue
 rt=w&31;rt2=(w>>10)&31;base=(w>>5)&31
 if rt2 not in [20,21] or rt>=31:continue
 for delta in range(4,min(132,n-pos),4):
  v=struct.unpack_from('<I',b,off+pos+delta)[0]
  if v==0xd63f0000|(rt<<5):
   pc=va+pos;i=bisect.bisect_right(starts,pc)-1
   rows.append(dict(load=hex(pc),call=hex(pc+delta),code_register='x'+str(rt),second_register='x'+str(rt2),base_register='x'+str(base),preceding_lc_entry=hex(starts[i]),next_lc_entry=hex(starts[i+1]),lc_span_bytes=starts[i+1]-starts[i]));break
record=dict(authority='Supplemental opcode-shape candidate hints only; offset64 and nearby BLR do not prove receiver type, field identity, reaching definitions or reachability',target_sha256=hashlib.sha256(b).hexdigest(),text=dict(address=hex(va),bytes=n,file_offset=off),candidates=rows)
(P/'restore-shape-selection.json').write_text(json.dumps(record,indent=2)+'\n')
print(json.dumps(rows))
