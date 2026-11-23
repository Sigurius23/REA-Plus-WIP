"""Explicit malformed/identity derivatives; none are Swift compiler output or executed."""
from pathlib import Path
import json,hashlib
O=Path(__file__).resolve().parent;R=O.parents[1]
load=lambda p:json.loads(p.read_text())
fields=lambda label:load(O/'mcp-final'/(label+'.evidence.json'))['normalized_result']['result']['swift_type_fields']
build=load(O/'fixture/build.json');source=Path(build['binary']['path']);original=source.read_bytes()
assert hashlib.sha256(original).hexdigest()==build['binary']['sha256']
dep=fields('owned-dependency');key=next(f for f in dep['fields'] if f['name']=='keyPath');third=fields('owned-three')['fields'][0]
start=key['type_location']['file_offset'];raw=bytes.fromhex(key['mangling_hex']);assert original[start:start+len(raw)]==raw
cases=[]
def add(label,patches,selected,expect):
 b=bytearray(original)
 for at,value in patches:b[at:at+len(value)]=value
 changed=[{'file_offset':i,'before':x,'after':y} for i,(x,y) in enumerate(zip(original,b)) if x!=y]
 assert changed
 target=source.with_name(label+'.dylib');target.write_bytes(b)
 cases.append({'label':label,'path':str(target),'sha256':hashlib.sha256(b).hexdigest(),'bytes':len(b),'selected':selected,'expectation':expect,'changed_bytes':changed,'compiler_output':False,'executed':False})
assert bytes.fromhex(third['mangling_hex'])==b'q0_\0'
add('out-of-range-parameter',[(third['type_location']['file_offset']+1,b'1')],fields('owned-three')['address'],'reject')
assert raw[-2:]==b'G\0'
add('missing-closer',[(start+len(raw)-2,b'\0')],dep['address'],'reject')
parameter=key['generic_member_type']['owner_signature']['parameters'][0]['location']['file_offset']
add('nonordinary-parameter',[(parameter,b'\x81')],dep['address'],'reject')
# A descriptor-like import name alone must never imply a validated external type.
needle=b'_$ss7KeyPathCMn\0';assert original.count(needle)==2
add('foreign-import-identity',[(i,b'_$ss7FakeMapCMn\0') for i in range(len(original)) if original.startswith(needle,i)],dep['address'],'preserve-external-identity-only')
(O/'fixture/controls.json').write_text(json.dumps({'source':build['binary'],'scope':'Deliberate inert derivatives, not source-built valid Swift programs','records':cases},indent=2)+'\n')
plan=load(O/'plan-final.json');steps=[];out=O/'mcp-controls'
for r in cases:
 label=r['label'];steps += [
 {'name':'open_binary','label':label+'-open','arguments':{'path':r['path'],'provider_id':'ghidra'},'expect_success':True},
 {'name':'inspect_native_dispatch_metadata','label':label+'-fields','arguments':{'facet':'swift-fields','swift_type_address':r['selected'],'max_records':5000},'expect_success':True},
 {'name':'export_evidence_bundle','label':label+'-export','arguments':{'path':str(out/(label+'.bundle.json'))},'expect_success':True},
 {'name':'close_binary','label':label+'-close1','arguments':{},'expect_success':True},
 {'name':'close_binary','label':label+'-close2','arguments':{},'expect_success':True}]
(O/'plan-controls.json').write_text(json.dumps({'output_dir':str(out),'environment':plan['environment'],'timeout_ms':390000,'steps':steps},indent=2)+'\n')
print(json.dumps({'controls':len(cases)}))
