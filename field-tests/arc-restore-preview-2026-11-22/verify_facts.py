"""Authenticate the selected static findings; never execute the target."""
from pathlib import Path
import hashlib,json,struct
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
SHA='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
digest=lambda b:hashlib.sha256(b).hexdigest()
def path(label,followup=False):return OUT/('mcp-followup' if followup else 'mcp')/(label+'.evidence.json')
def evidence(p):return json.loads(p.read_text())
def value(label,followup=False):return evidence(path(label,followup))['normalized_result']
def raw(label,followup=False):return bytes.fromhex(value(label,followup)['bytes_hex'])
def text(label,followup=False):return raw(label,followup).split(b'\0')[0].decode()
assert text('web-contents-protocol-name')=='WebContent'
assert text('web-contents-argument-name')=='WebContentFrameIdentifier'
assert raw('get-web-contents-field-type').hex()=='02e1a967005f70536702685567006300'
assert raw('preview-image-optional-type-mangle')==b'So7NSImageCSg'
assert struct.unpack('<IIIIII',raw('web-contents-protocol-header'))[::3]==(0x43,2)
assert int.from_bytes(raw('web-contents-protocol-header')[16:20],'little')==130
assert 0x103d3fa38+24+2*12+92*8==0x103d3fd48
assert raw('preview-requirement-92')==bytes.fromhex('1100000000000000')
r=value('web-content-conformance-discovery')['result'];discovery=r['swift_conformance_discovery']
assert (discovery['index_entries'],discovery['examined'],discovery['matched'],discovery['admitted'])==(22066,22066,2,2)
assert discovery['unresolved']==19481
assert len(discovery['unresolved_records'])==944
assert any(c['facet']=='swift_conformance_index_discovery' and c['status']=='partial' for c in r['coverage'])
for conformance,owner,table,target in [(0x1036d31f8,'WebContentChromium: WebContent',0x104266700,0x10054bbf4),(0x1036d5b88,'StubWebContent: WebContent',0x104268a60,0x100006b90)]:
 assert any(p['field']['address']==hex(conformance) and p['target']['address']=='0x103d3fa38' for p in r['relative_pointers'])
 slot=next(s for s in r['swift_dispatch_slots'] if s['owner']==owner and s['slot_index']==93)
 assert slot['location']['address']==hex(table+0x2e8)
 assert slot['implementation_address']==hex(target) and slot['requirement_flags']==0x11
 assert slot['requirement'] is None
assert value('preview-witness-byte-0x100006b90')['raw_disassembly']=='ret'
assert value('preview-modern-callback-trampoline')['raw_disassembly']=='b 0x1012bb254'
assert text('chromium-preview-selector',True)=='captureViewport:'
assert text('chromium-preview-block-type',True)=='v16@?0@"NSImage"8'
assert int.from_bytes(raw('chromium-preview-selector-slot'),'little')==0x103fa501b
assert int.from_bytes(raw('chromium-preview-field-offset'),'little')==104
assert value('preview-witness-byte-0x10054bc14')['raw_disassembly']=='ldr x20,[x20, x8#0x0]'
assert value('preview-witness-byte-0x10054bc7c')['flow']['direct_destinations']==['0x103645e80']
assert value('preview-image-callback-byte-0x1004b9440')['raw_disassembly']=='ldp x22,x20,[x0, #0x20]'
assert value('preview-image-callback-byte-0x1004b945c')['raw_disassembly']=='blr x22'
assert text('chromium-field-name-7',True)=='webView'
assert raw('chromium-web-view-field-type',True).startswith(b'So14ArcWebContentsC\0')
assert raw('chromium-metadata-cache-slot',True)==b'\0'*8
for label in ['restore-reversed-collection-import','restore-slice-import','restore-file-creation-date-import']:assert value(label) is None
assert raw('restore-date-sequence-complete-mangle',True).hex()=='02b9a8680079025bb4680079414179535347474700'
assert text('restore-enumeration-selector')=='contentsOfDirectoryAtPath:error:'
assert text('restore-file-attributes-selector')=='attributesOfItemAtPath:error:'
assert text('restore-date-parser-selector')=='dateFromString:'
assert text('storable-file-name')=='StorableFile'
assert len(list((OUT/'mcp').glob('restore-residual-byte-*.evidence.json')))==44
abi=json.loads((OUT/'swift-abi-authority.json').read_text());assert digest((OUT/'swift-abi-authority.txt').read_bytes())==abi['excerpt_sha256']
assert abi['source_url']=='https://raw.githubusercontent.com/swiftlang/swift/main/include/swift/ABI/MetadataValues.h'
claims=[]
def claim(name,kind,paths):
 rows=[]
 for p in sorted(set(paths)):
  b=p.read_bytes();d=json.loads(b);assert d['subject']['digest']['sha256']==SHA
  rows.append(dict(path=str(p.relative_to(ROOT)),sha256=digest(b),evidence_id=d['evidence_id']))
 claims.append(dict(claim=name,kind=kind,sources=rows))
restore=json.loads((OUT/'restore-resolution.json').read_text())
claim('Stable descending normalized-Date ordering, prefix eligibility and first successful decoded backup; no save in selected leaf/callback','Independent static instruction/ABI derivation; normal-return premises retained',[ROOT/s['path'] for s in restore['source_index']])
preview=json.loads((OUT/'preview-resolution-review.json').read_text())
claim('Exact WebContent optional existential and argument identity; closed pair flow and NSImage optional continuation type','Independent static metadata/instruction derivation; class-constraint premise resolved by separate official ABI receipt',[ROOT/s['path'] for s in preview['sources']])
claim('Two observed local conformance slot93 targets with exact protocol descriptor identity','Public partial discovery; not exhaustive or runtime selection',[path('web-content-conformance-discovery'),path('web-contents-protocol-header'),path('preview-requirement-92')])
claim('Chromium selected slot calls captureViewport: with NSImage block then forwards the callback; stub returns directly','Conditional implementation trace, no image/pixels observed',list((OUT/'mcp').glob('preview-witness-byte-*.evidence.json'))+list((OUT/'mcp').glob('preview-image-callback-byte-*.evidence.json'))+list((OUT/'mcp').glob('preview-objc-stub-byte-*.evidence.json'))+[path('chromium-preview-selector-slot'),path('chromium-preview-selector',True),path('chromium-preview-block-type',True),path('chromium-preview-field-offset'),path('preview-modern-callback-trampoline')])
claim('Reflected field7 is webView:ArcWebContents; concrete receiver mapping remains qualified','Metadata fact; the runtime class metadata cache is zero in the Program',[path('web-content-chromium-class-header'),path('chromium-fields',True),path('chromium-field-name-7',True),path('chromium-web-view-field-type',True),path('chromium-metadata-cache-slot',True)])
claim('Full restore suffix mangling retained, but imported type identities are not bound by address_name','Explicit partial observation, not a positive nested-type claim',[path('restore-date-sequence-typeref'),path('restore-date-sequence-complete-mangle',True),path('restore-reversed-collection-import'),path('restore-slice-import'),path('restore-file-creation-date-import')])
result=dict(status='passed',date='2026-11-22',target_sha256=SHA,claims=claims,target_executed=False,limitations=['Static code and normal Swift ABI/storage premises; no active dependency, runtime object, chosen backup, disk writeback, image pixels or service result observed.','Initial independent reviews and their additive resolutions are immutable; the separate root addendum authenticates the remaining class-bit premise and concrete preview implementation.','Unchanged producer; item63 typed invocation context, broader apply/UI/browser routes and selected higher restore caller remain open.'])
(OUT/'fact-index.json').write_text(json.dumps(result,indent=2)+'\n');print(json.dumps(dict(status='passed',claims=len(claims),source_bindings=sum(len(c['sources']) for c in claims))))
