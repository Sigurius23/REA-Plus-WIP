"""Supplemental original-format validation of caller seeds and linear windows."""
from pathlib import Path
import hashlib,json,struct
O=Path(__file__).resolve().parent;R=O.parents[1]
b=(R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64').read_bytes()
assert hashlib.sha256(b).hexdigest()=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
assert struct.unpack_from('<II',b)==(0xfeedfacf,0x100000c)
at=32;base=None;table=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 kind,size=struct.unpack_from('<II',b,at);assert size>=8 and at+size<=len(b)
 if kind==0x19 and b[at+8:at+24].split(b'\0')[0]==b'__TEXT':base=struct.unpack_from('<Q',b,at+24)[0]
 if kind==0x26:table=(at,*struct.unpack_from('<II',b,at+8))
 at+=size
assert base is not None and table is not None
command,offset,length=table;cursor=offset;address=base;starts=[]
while cursor<offset+length:
 delta=0;shift=0
 while True:
  assert cursor<offset+length and shift<64
  c=b[cursor];cursor+=1;delta|=(c&127)<<shift
  if c<128:break
  shift+=7
 if delta==0:break
 address+=delta;starts.append(address)
receipt=json.loads((O/'seed-membership.json').read_text());assert receipt['decoded_starts']==len(starts)
assert receipt['command_offset']==command and receipt['table_offset']==offset and receipt['table_bytes']==length
assert receipt['table_sha256']==hashlib.sha256(b[offset:offset+length]).hexdigest()
for row in receipt['selected']:assert int(row['address'],16) in starts and row['is_lc_function_start']
windows=json.loads((O/'linear-observation-windows.json').read_text())['windows']
for row in windows:
 entry=int(row['entry'],16);next_entry=starts[starts.index(entry)+1]
 assert int(row['next_encoded_entry'],16)==next_entry and row['bytes']==next_entry-entry
result={'status':'passed','authority':receipt['authority'],'function_starts':len(starts),'new_seed_memberships':len(receipt['selected']),'linear_windows':len(windows),'complete_function_ownership_inferred':False}
(O/'seed-verification.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps(result))
