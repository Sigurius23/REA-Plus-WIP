"""Authenticate selected static path facts; no provider or target execution."""
from pathlib import Path
import hashlib,json,plistlib,re
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];MCP=OUT/'mcp-seeded'
sha=lambda b:hashlib.sha256(b).hexdigest()
def evidence(label):return json.loads((MCP/(label+'.evidence.json')).read_text())
def value(label):return evidence(label)['normalized_result']
def instructions(label):return value(label)['instructions']
def observed_bytes(label):return bytes.fromhex(value(label)['bytes_hex'])
def include(label,lines):
 actual=instructions(label)
 for line in lines:assert line in actual,(label,line)
include('0x100d99b20-read_function_instructions',['0x100d99b70: mov w2, #0xe','0x100d99b74: mov w3, #0x1','0x100d99b78: mov x4, #0x0','0x100d99b7c: mov w5, #0x1','0x100d99b80: bl 0x103641180'])
include('default-builder-read_function_instructions',['0x100d99e0c: mov w0, #0x10','0x100d99e14: blr x21','0x100d99e28: cbz x20, 0x100d99e4c','0x100d99e54: bl 0x100d99b20','0x100d99e78: bl 0x1005adab8'])
for label,expected in [('application-support-selector','URLForDirectory:inDomain:appropriateForURL:create:error:'),('bundle-url-selector','bundleURL'),('bundle-info-selector','infoDictionary'),('main-bundle-selector','mainBundle'),('base-setting-key-literal','customApplicationDataBaseURLPath')]:assert observed_bytes(label).split(b'\0')[0].decode()==expected
assert observed_bytes('base-setting-tag10-word')==b'\x0c\x00';assert 0x1005aa61c+12*4==0x1005aa64c
assert value('base-setting-branch-0x1005aa654')['flow']['direct_destinations']==['0x1005ab65c']
assert value('base-setting-return-0x1005ab66c')['raw_disassembly']=='add x0,x8,#0x4'
assert value('base-setting-return-0x1005ab664')['raw_disassembly']=='mov x8,#0x1c'
assert len('customApplicationDataBaseURLPath')==32
# Complete native small-String words corroborated against physical MOV/MOVK text.
include('0x1005adab8-read_function_instructions',['0x1005adb80: mov x0, #0x4643','0x1005adb84: movk x0, #0x7542, LSL #16','0x1005adb88: movk x0, #0x646e, LSL #32','0x1005adb8c: movk x0, #0x656c, LSL #48','0x1005adb90: mov x1, #0x614e','0x1005adb94: movk x1, #0x656d, LSL #16','0x1005adb98: movk x1, #0xec00, LSL #48'])
include('0x1007ed0d4-read_function_instructions',['0x1007ed0d8: mov x0, #0x2d2d','0x1007ed0dc: movk x0, #0x7375, LSL #16','0x1007ed0e0: movk x0, #0x7265, LSL #32','0x1007ed0e4: movk x0, #0x642d, LSL #48','0x1007ed0e8: mov x1, #0x7461','0x1007ed0ec: movk x1, #0x2d61, LSL #16','0x1007ed0f0: movk x1, #0x6964, LSL #32','0x1007ed0f4: movk x1, #0xef72, LSL #48'])
def small(a,b):return (a.to_bytes(8,'little')+b.to_bytes(8,'little')[:7])[:(b>>56)&15].decode()
assert small(0x656c646e75424643,0xec000000656d614e)=='CFBundleName';assert small(0x642d726573752d2d,0xef7269642d617461)=='--user-data-dir'
carrier=json.loads((OUT/'plist-carrier.json').read_text());raw=bytes.fromhex(carrier['plist_bytes_hex']);assert len(raw)==5697;assert sha(raw)==carrier['plist_sha256']=='2b2acc2969fd9cfe09ca8e3219b4ec2614cd2181756a5d29e1006e435da32358';assert carrier['reader_closed'];assert carrier['verifier_run']['process_lineage']['status']=='verified';assert carrier['verifier_run']['process_lineage']['descendants']==[]
plist=value('original-bundle-plist')['value'];assert plistlib.loads(raw)==plist;assert plist['CFBundleName']=='Arc';assert plist['CFBundleIdentifier']=='company.thebrowser.Browser';assert plist['CFBundleShortVersionString']=='1.172.1';assert plist['CFBundleVersion']=='90370'
header=Path('/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/System/Library/Frameworks/Foundation.framework/Headers/NSPathUtilities.h');text=header.read_text();sdk=[]
for name,n in [('NSApplicationSupportDirectory',14),('NSUserDomainMask',1)]:
 found=[(i+1,l) for i,l in enumerate(text.splitlines()) if re.search(r'\b'+name+r'\s*=\s*'+str(n)+r'\b',l)];assert len(found)==1;sdk.append({'name':name,'value':n,'line':found[0][0],'source_line':found[0][1]})
claims=[]
for name,kind,labels in [('default directory API','observed',['0x100d99b20-read_function_instructions','application-support-selector']),('bundle-derived suffix','observed',['0x1005adab8-read_function_instructions','bundle-info-selector','bundle-url-selector','main-bundle-selector','original-bundle-plist']),('preference override','selected-path derivation',['default-builder-read_function_instructions','base-setting-tag10-word','base-setting-key-literal']),('conditional CLI override','selected-path derivation',['default-builder-read_function_instructions','0x1007ed0d4-read_function_instructions'])]:
 claims.append({'claim':name,'kind':kind,'sources':[{'path':str((MCP/(l+'.evidence.json')).relative_to(ROOT)),'sha256':sha((MCP/(l+'.evidence.json')).read_bytes()),'evidence_id':evidence(l)['evidence_id']} for l in labels]})
string_dir=OUT/'mcp-string'
string_evidence=lambda l:json.loads((string_dir/(l+'.evidence.json')).read_text())
reader=string_evidence('0x100d911ec-read_function_instructions')['normalized_result']['instructions']
assert reader[:6]==['0x100d911ec: stp x22, x21, [sp, #-0x30]!','0x100d911f0: stp x20, x19, [sp, #0x10]','0x100d911f4: stp x29, x30, [sp, #0x20]','0x100d911f8: add x29, sp, #0x20','0x100d911fc: mov x19, x1','0x100d91200: bl 0x1005aa5e4']
assert string_evidence('string-setting-adapter')['normalized_result']['instructions']==['0x100d92ed4: ldr x1, [x20, #0x10]','0x100d92ed8: b 0x100d911ec']
assert bytes.fromhex(string_evidence('string-for-key-selector')['normalized_result']['bytes_hex']).split(b'\0')[0]==b'stringForKey:'
ctor_path=ROOT/'field-tests/arc-dispatch-provenance-2026-11-21/mcp/function-0x100d92a28-read_function_instructions.evidence.json';ctor=json.loads(ctor_path.read_text());asm=ctor['normalized_result']['instructions']
for line in ['0x100d92d00: adrp x8, 0x100d92000','0x100d92d04: add x9, x8, #0xed4','0x100d92d08: ldr x8, [sp, #0x50]','0x100d92d0c: stp x9, x8, [x20, #0x30]']:assert line in asm
claims.append({'claim':'default string reader binding','kind':'selected-default-construction derivation; no active injection proof','sources':[{'path':str(ctor_path.relative_to(ROOT)),'sha256':sha(ctor_path.read_bytes()),'evidence_id':ctor['evidence_id']}]+[{'path':str((string_dir/(l+'.evidence.json')).relative_to(ROOT)),'sha256':sha((string_dir/(l+'.evidence.json')).read_bytes()),'evidence_id':string_evidence(l)['evidence_id']} for l in ['string-setting-adapter','0x100d911ec-read_function_instructions','string-for-key-selector','0x1007ed6e4-read_function_instructions']]})
r={'status':'passed','target_sha256':'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578','default_formula':'user-domain Application Support / Arc / StorableBoostsData.json','preference_override_key':'customApplicationDataBaseURLPath','conditional_cli_argument':'--user-data-dir=...','cli_gate':'byte returned via 0x1005a4e64 equals 1; semantic classification not established here','bundle_name':'Arc','original_plist_sha256':sha(raw),'sdk_header':{'path':str(header),'sha256':sha(header.read_bytes()),'selected_constants':sdk},'claims':claims,'target_executed':False,'limits':['The formula is conditional on the selected shipped default and successful API paths. Runtime injection, preferences, arguments, sandbox mapping and filesystem contents are not observed.','--log-file sets a separate optional log URL/flag; it does not replace the selected base-directory calculation.','Directory/error-path and storage-write traces do not prove durability, backup/migration policy or successful readback.','Item 63 automatic typed-context halfword recovery remains open.']}
(OUT/'fact-index.json').write_text(json.dumps(r,indent=2)+'\n');print(json.dumps({'status':'passed','default_formula':r['default_formula'],'claims':len(claims)}))
