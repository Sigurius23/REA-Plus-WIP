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
targets={0x100305ef0,0x1001ec218,0x1001ed314}; rows=[]
def note(va,target,kind):
    i=bisect.bisect_right(starts,va)-1
    rows.append(dict(address=hex(va),target=hex(target),kind=kind,preceding_lc_entry=hex(starts[i]),next_lc_entry=hex(starts[i+1]),lc_span_bytes=starts[i+1]-starts[i]))
va,n,off=text
for pos in range(0,n-4,4):
    pc=va+pos;w=struct.unpack_from('<I',b,off+pos)[0]
    if w&0x7c000000==0x14000000:
        imm=w&0x3ffffff
        if imm&(1<<25):imm-=1<<26
        target=pc+imm*4
        if target in targets:note(pc,target,'direct-BL' if w>>31 else 'direct-B')
    if w&0x9f000000==0x90000000:
        imm=((w>>5)&0x7ffff)<<2 | ((w>>29)&3)
        if imm&(1<<20):imm-=1<<21
        page=(pc&~4095)+imm*4096
        nextword=struct.unpack_from('<I',b,off+pos+4)[0]
        if nextword&0xffc00000==0x91000000 and (nextword>>5)&31==w&31:
            target=page+((nextword>>10)&4095)
            if target in targets:note(pc,target,'adjacent-ADRP-ADD')
record=dict(authority='Supplemental source-byte hints for public queries, not analyzer references, function ownership or exhaustive caller inventory',target_sha256=hashlib.sha256(b).hexdigest(),text=dict(address=hex(va),bytes=n,file_offset=off),targets=[hex(x) for x in sorted(targets)],candidates=rows)
(P/'restore-direct-call-selection.json').write_text(json.dumps(record,indent=2)+'\n')
print(json.dumps(rows))
