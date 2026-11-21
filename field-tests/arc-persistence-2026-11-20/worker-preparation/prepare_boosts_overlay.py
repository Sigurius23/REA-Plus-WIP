"""Bounded original-byte address planning from captured async descriptors."""
import contextlib
import io
import json
from pathlib import Path
import runpy
import struct
OUT=Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):
    d=runpy.run_path(str(OUT/'prepare_implementation_overlay.py'))
ROOT=d['ROOT'];base=d['base'];raw=d['original'];boundary=d['boundary'];digest=d['digest'];descriptor=d['descriptor'];write_once=d['write_once']
source=base/'mcp-implementations-2026-11-21/boosts-client-default-async-descriptors.evidence.json'
e=json.loads(source.read_text());assert e['subject']['digest']['sha256']==d['SHA']
n=e['normalized_result'];assert n['complete'];b=bytes.fromhex(n['bytes_hex']);a=int(n['address'],16)
assert b==raw[a-0x100000000:a-0x100000000+len(b)]
roots={a+i*16+struct.unpack_from('<i',b,i*16)[0]:i for i in [5,6,13,14]}
prior=d['seed_path'];old={int(line.split()[0],16) for line in prior.read_text().splitlines()}
added={};front=set(roots);visited=set()
for address,index in roots.items():added[address]={'interval':boundary(address),'origins':[{'kind':'async_relative_entry','index':index,'descriptor':hex(a+index*16),'evidence_id':e['evidence_id']} ]}
for depth in range(3):
    nxt=set()
    for address in sorted(front):
        region=boundary(address);off=region['file_offset'];length=region['indexed_interval_bytes']
        for i in range(0,length,4):
            word=struct.unpack_from('<I',raw,off+i)[0];pc=address+i;c=None;kind=None
            if word&0x7c000000==0x14000000:
                v=word&0x3ffffff
                if v&0x2000000:v-=0x4000000
                c=pc+v*4;kind='BL' if word&0x80000000 else 'B'
            elif word&0x9f000000 in (0x10000000,0x90000000):
                v=((word>>5)&0x7ffff)<<2|((word>>29)&3)
                if v&0x100000:v-=0x200000
                if word&0x9f000000==0x10000000:c=pc+v;kind='ADR'
                elif i+8<=length:
                    add=struct.unpack_from('<I',raw,off+i+4)[0]
                    if add&0xff800000==0x91000000 and (add>>5)&31==word&31:
                        c=(pc&~4095)+(v<<12)+(((add>>10)&4095)<<(12 if add&0x400000 else 0));kind='adjacent_ADRP_ADD'
            if c is None:continue
            try:interval=boundary(c)
            except AssertionError:continue
            added.setdefault(c,{'interval':interval,'origins':[]})['origins'].append({'kind':kind,'instruction':hex(pc),'depth':depth,'source_interval_sha256':region['interval_sha256']})
            nxt.add(c)
    visited|=front;front=nxt-visited
addresses=old|added.keys();seed=''.join(hex(x)+'\tfunction\n' for x in sorted(addresses)).encode();path=OUT/f'boosts-implementation-seeds-{len(addresses)}.tsv';write_once(path,seed)
receipt={'target_sha256':d['SHA'],'source':{**descriptor(source),'evidence_id':e['evidence_id']},'prior':descriptor(prior),'seed':{**descriptor(path),'entries':len(addresses)},'added':[{'address':hex(x),**added[x]} for x in sorted(added.keys()-old)],'planner_depths':[0,1,2],'remaining_frontier':list(map(hex,sorted(front))),'reproducer':descriptor(Path(__file__).resolve()),'limits':['Address planning only, not runtime reachability or selected dependency binding.','Exact executable original LC entries only; async entry decoding is static signed-relative arithmetic.']}
write_once(OUT/'boosts-overlay-receipt-2026-11-21.json',(json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'path':str(path),'entries':len(addresses),'sha256':digest(seed),'added':len(addresses-old)}))
