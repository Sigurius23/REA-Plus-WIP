from pathlib import Path
import json,hashlib
O=Path(__file__).resolve().parent.parent
record=json.loads((O/'null-copy-control-v2.json').read_text()) if (O/'null-copy-control-v2.json').exists() else json.loads((O/'fixture/null-copy-control-v2.json').read_text())
src=Path(record['source_path']);b=bytearray(src.read_bytes());assert hashlib.sha256(b).hexdigest()==record['source_sha256'];slot=record['patched_file_offset'];raw=int.from_bytes(b[slot:slot+8],'little');assert raw.to_bytes(8,'little').hex()==record['before_hex'];assert record['pointer_format']=='DYLD_CHAINED_PTR_64_OFFSET';assert raw>>63==0
# This format uses bits 0..43 for target/high8; preserve reserved/next/bind bits.
b[slot:slot+8]=(raw&~((1<<44)-1)).to_bytes(8,'little');assert hashlib.sha256(b).hexdigest()==record['target_sha256'];target=Path(record['target_path'])
if target.exists():assert target.read_bytes()==b
else:target.write_bytes(b)
print(json.dumps({'verified':True,'target_executed':False,'sha256':record['target_sha256']}))
