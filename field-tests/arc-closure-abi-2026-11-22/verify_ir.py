from pathlib import Path
import re,json,hashlib
O=Path(__file__).resolve().parent;profiles=[]
for label in ['ordinary','resilient','frozen']:
 p=O/'fixture'/(label+'.ll');text=p.read_text();row=next(x for x in text.splitlines() if x.startswith('@"$s17ClosureABIControl7SettingOWV" ='))
 m=re.search(r'i64 (\d+), i64 (\d+), i32 (\d+), i32 (\d+)',row);assert m
 size,stride,flags,extra=map(int,m.groups());assert size==stride==2
 start=text.index('define swiftcc i1 @"$s17ClosureABIControl6invoke');body=text[start:text.index('\n}',start)+2]
 passing=re.search(r'call swiftcc i1 %0\((i16|ptr)\b',body).group(1);assert passing==('ptr' if label=='resilient' else 'i16')
 profiles.append({'profile':label,'ir_path':str(p.relative_to(O)),'ir_sha256':hashlib.sha256(p.read_bytes()).hexdigest(),'enum_size':size,'enum_stride':stride,'enum_vwt_flags':flags,'enum_vwt_flags_hex':hex(flags),'extra_inhabitants':extra,'argument_type':passing})
assert profiles[0]['enum_vwt_flags']==profiles[2]['enum_vwt_flags'];assert profiles[1]['enum_vwt_flags']!=profiles[0]['enum_vwt_flags']
result={'status':'passed','profiles':profiles,'limits':['This disproves lowering from reflected function shape/case counts or current size alone. It does not assert all metadata is byte-identical: the enum VWT flags differ.','The resilient control sets 0x02000000 in addition to the other flags. No general passing rule or inverse is inferred from this compiler-specific observation.','Owned IR is a compiler oracle; no target/library was executed.']}
(O/'abi-control-layout.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps(result))
