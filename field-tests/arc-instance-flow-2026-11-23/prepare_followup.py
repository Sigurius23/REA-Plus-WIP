from pathlib import Path
import json,struct,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1];j=lambda p:json.loads(p.read_text());h=lambda b:hashlib.sha256(b).hexdigest()
old=O/'seeds-instance.tsv';s=old.read_text();token='0x10000a520'
b=(R/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64').read_bytes();cursor=32;base=None;stream=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,cursor)
 if cmd==0x19 and b[cursor+8:cursor+24].rstrip(b'\0')==b'__TEXT':base=struct.unpack_from('<Q',b,cursor+24)[0]
 if cmd==0x26:off,length=struct.unpack_from('<II',b,cursor+8);stream=b[off:off+length]
 cursor+=size
assert stream is not None and base is not None
cursor=0;address=base;found=False
while cursor<len(stream):
 value=0;shift=0
 while True:
  v=stream[cursor];cursor+=1;value|=(v&127)<<shift
  if not v&128:break
  shift+=7;assert shift<64
 if value==0:break
 address+=value
 if address==int(token,16):found=True
assert found
added=[]
if not any(l.split('\t')[0]==token for l in s.splitlines()):s+=token+'\tfunction\n';added=[token]
new=O/'seeds-instance-followup.tsv';assert not new.exists();new.write_text(s)
(O/'followup-seed-preparation.json').write_text(json.dumps({'source':str(old.relative_to(R)),'source_sha256':h(old.read_bytes()),'result_sha256':h(new.read_bytes()),'added':added,'basis':'Observed direct call at 0x10000a9ec and exact LC_FUNCTION_STARTS match; caller-asserted seed only'},indent=2)+'\n')
q=j(O/'plan-arc.json');q['output_dir']=str(O/'mcp-arc-followup');q['environment']['REA_GHIDRA_SEED_FILE']=str(new);q['steps']=[q['steps'][0],{'name':'read_function_instructions','label':'metadata-inner-instructions','arguments':{'procedure':token},'expect_success':True},{'name':'analyze_function','label':'metadata-inner-summary','arguments':{'procedure':token,'detail':'summary'},'expect_success':True},{'name':'export_evidence_bundle','label':'arc-export','arguments':{'path':str(O/'mcp-arc-followup/final.bundle.json')},'expect_success':True},{'name':'close_binary','label':'arc-close1','arguments':{},'expect_success':True},{'name':'close_binary','label':'arc-close2','arguments':{},'expect_success':True}]
(O/'plan-arc-followup.json').write_text(json.dumps(q,indent=2)+'\n')
print('Prepared one observed metadata callee; existing overlay admission preserved')
