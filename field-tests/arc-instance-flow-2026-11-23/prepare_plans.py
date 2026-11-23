from pathlib import Path
import json,struct,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1];P=R/'rea-local'
j=lambda p:json.loads(p.read_text());h=lambda b:hashlib.sha256(b).hexdigest()
previous=R/'field-tests/arc-member-templates-2026-11-23';manifest=j(previous/'runtime-final-manifest.json')
for r in manifest['files']:
 b=(Path(manifest['runtime_root'])/r['path']).read_bytes();assert h(b)==r['sha256']
(O/'runtime-reuse.json').write_text(json.dumps({'manifest':str((previous/'runtime-final-manifest.json').relative_to(R)),'manifest_sha256':h((previous/'runtime-final-manifest.json').read_bytes()),'runtime_root':manifest['runtime_root'],'runtime_files':len(manifest['files']),'unchanged_runtime':True},indent=2)+'\n')
build=j(O/'fixture/build.json');symbols=(O/'fixture/symbols.txt').read_text().splitlines();prefix='_$s15OwnedProjection'
selected={}
for label,needle in [('generic-project','7projectyq_x_s7KeyPathCyxq_Gtr0_lF'),('specialized-project','7projectyq_x_s7KeyPathCyxq_Gtr0_lFAA6ValuesV_AA6ClientVTg5'),('first','5firstyAA6ClientVAA6ValuesVF'),('second','6secondyAA6ClientVAA6ValuesVF'),('get','3getyAA6ClientVAA6ValuesV_AA10DependencyVyADGtF'),('rebind','6rebindyyAA10DependencyVyAA6ClientVGzF')]:
 line=next(l for l in symbols if l.split()[-1]==prefix+needle);selected[label]='0x'+format(int(line.split()[0],16),'x')
(O/'fixture/functions.json').write_text(json.dumps(selected,indent=2)+'\n')
env=j(previous/'plan-final.json')['environment']
def step(n,l,a):return {'name':n,'label':l,'arguments':a,'expect_success':True}
steps=[step('open_binary','owned-open',{'path':build['binary']['path'],'provider_id':'ghidra'})]
for label,address in selected.items():
 steps += [step('read_function_instructions',label+'-instructions',{'procedure':address}),step('analyze_function',label+'-summary',{'procedure':address,'detail':'summary'})]
steps += [step('export_evidence_bundle','owned-export',{'path':str(O/'mcp-owned/final.bundle.json')}),step('close_binary','owned-close1',{}),step('close_binary','owned-close2',{})]
(O/'plan-owned.json').write_text(json.dumps({'output_dir':str(O/'mcp-owned'),'environment':env,'timeout_ms':390000,'steps':steps},indent=2)+'\n')
# Confirm exact LC_FUNCTION_STARTS before extending the existing caller-asserted overlay.
arc=P/'.cache/arc-fixed-inputs-2026-11-13/Arc-arm64';b=arc.read_bytes();assert h(b)=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
offset=32;stream=None;base=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,offset)
 if cmd==0x19 and b[offset+8:offset+24].rstrip(b'\0')==b'__TEXT':base=struct.unpack_from('<Q',b,offset+24)[0]
 if cmd==0x26:off,length=struct.unpack_from('<II',b,offset+8);stream=b[off:off+length]
 offset+=size
assert stream is not None and base is not None
starts=[];cursor=0;address=base
while cursor<len(stream):
 value=0;shift=0
 while True:
  byte=stream[cursor];cursor+=1;value|=(byte&127)<<shift
  if not byte&128:break
  shift+=7;assert shift<64
 if value==0:break
 address+=value;starts.append(address)
new=[0x10000a9c8,0x100876f50]
for a in new:assert a in starts
old=R/'field-tests/arc-generic-declarations-2026-11-23/seeds-typed-consumer.tsv';seed=old.read_text();added=[]
for a in new:
 token=hex(a)
 if not any(l.split('\t')[0]==token for l in seed.splitlines()):seed+=token+'\tfunction\n';added.append(token)
(O/'seeds-instance.tsv').write_text(seed)
(O/'seed-preparation.json').write_text(json.dumps({'source':str(old.relative_to(R)),'source_sha256':h(old.read_bytes()),'result_sha256':h(seed.encode()),'source_lines':len(old.read_text().splitlines()),'result_lines':len(seed.splitlines()),'added':added,'verified_lc_function_starts':[hex(a) for a in new],'scope':'Caller-asserted exact LC start seeds; no runtime reachability or exhaustive xrefs'},indent=2)+'\n')
arcenv={**env,'REA_GHIDRA_SEED_FILE':str(O/'seeds-instance.tsv')}
steps=[step('open_binary','arc-open',{'path':str(arc),'provider_id':'ghidra'})]
for label,address in [('witness-metadata','0x10000a9c8'),('composition-metadata','0x100876f50')]:
 steps += [step('read_function_instructions',label+'-instructions',{'procedure':address}),step('analyze_function',label+'-summary',{'procedure':address,'detail':'summary'})]
for label,address in [('projection-call','0x1006fa618'),('projection-result','0x1006fa614'),('wrapper-keypath-save','0x1006fa290'),('wrapper-result-store','0x1006fa2d4')]:
 steps.append(step('inspect_native_instruction',label,{'address':address}))
steps += [step('export_evidence_bundle','arc-export',{'path':str(O/'mcp-arc/final.bundle.json')}),step('close_binary','arc-close1',{}),step('close_binary','arc-close2',{})]
(O/'plan-arc.json').write_text(json.dumps({'output_dir':str(O/'mcp-arc'),'environment':arcenv,'timeout_ms':390000,'steps':steps},indent=2)+'\n')
print(json.dumps({'owned_functions':selected,'added_arc_seeds':added,'runtime_files':len(manifest['files'])}))
