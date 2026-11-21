"""Bind selected static storage witnesses, async entries and error cases."""
from derive_bindings import OUT,SHA,evidence,region,cstring
import json
import struct
m='mcp-boosts-2026-11-21'
implementations=[]
for prefix,expected in [('boosts-other-store-witness','BoostsStorageFirebaseImpl'),('boosts-memory-store-witness','BoostsStorageMemoryImpl')]:
    e=evidence(m,prefix+'-conformance');r=e['normalized_result']['result'];assert len(r['swift_conformances'])==1
    c=r['swift_conformances'][0];assert c['type_name']==expected and c['protocol_name']=='BoostsStorage'
    label='firebase-store-set-and-get-descriptors' if expected.endswith('FirebaseImpl') else 'memory-store-set-and-get-descriptors'
    base,data,eid=region(m,label)
    selected=[]
    for index,method in [(0,'setBoostData'),(1,'boostData')]:
        offset=index*8;rel,size=struct.unpack_from('<iI',data,offset)
        selected.append({'method_binding':method,'source_client_field_index':6 if index==0 else 5,'witness_byte_offset':'0x18' if index==0 else '0x20','descriptor':hex(base+offset),'async_entry':hex(base+offset+rel),'context_size_word':size})
    implementations.append({'type':expected,'protocol':'BoostsStorage','conformance_address':c['location']['address'],'witness_table':c['witness_table']['address'],'conformance_evidence_id':e['evidence_id'],'descriptor_evidence_id':eid,'selected':selected})
m='mcp-apply-store-2026-11-21'
base,data,eid=region(m,'boost-client-error-static-metadata');kind,desc=struct.unpack_from('<QQ',data);assert kind==0x201 and desc==0x103d77a90
_,descdata,deid=region(m,'boost-client-error-descriptor');assert struct.unpack_from('<I',descdata)[0]&31==18;assert struct.unpack_from('<I',descdata,20)[0]&0xffffff==0;assert struct.unpack_from('<I',descdata,24)[0]==4
_,name,neid=region(m,'boost-client-error-name');assert name.split(b'\0')[0]==b'BoostsClientError'
a,records,feid=region(m,'boost-client-error-case-records');n,names,meid=region(m,'boost-client-error-case-names');assert struct.unpack_from('<HI',records,10)==(12,4)
cases=[]
for i in range(4):
    off=16+i*12;flags,typeref,name=struct.unpack_from('<Iii',records,off);assert typeref==0
    cases.append({'tag':i,'name':cstring(n,names,a+off+8+name)})
assert [x['name'] for x in cases]==['alreadyExists','doesNotExist','signedOut','invalidData']
selectors=[]
for label,wanted in [('firebase-collection-message-stub-selector-slot-name','collectionWithPath:'),('firebase-document-message-stub-selector-slot-name','documentWithPath:')]:
    a,data,se=region(m,label);assert data.split(b'\0')[0].decode()==wanted;selectors.append({'selector':wanted,'address':hex(a),'evidence_id':se})
m='mcp-firebase-2026-11-21'
request_selectors=[]
for label,wanted in [('firebase-write-selector-name','setData:merge:completion:'),('firebase-read-selector-name','getDocumentWithCompletion:')]:
    a,data,se=region(m,label);assert data.split(b'\0')[0].decode()==wanted;request_selectors.append({'selector':wanted,'address':hex(a),'evidence_id':se})
result={'target_sha256':SHA,'storage_implementations':implementations,'error_enum':{'type':'BoostsClientError','metadata_address':hex(base),'descriptor':hex(desc),'cases':cases,'evidence_ids':[eid,deid,neid,feid,meid]},'firebase_message_selectors':selectors,'limits':['Method labels follow the selected BoostsClient field5/6 adapters and witness offsets, not guessed requirement order.','Async entries are static signed-relative pointers; runtime witness installation and actual requests are unobserved.','Error case names alone do not prove which path throws; use retained instruction branches and async error-register conventions.']}
(OUT/'boost-storage-bindings.json').write_text(json.dumps(result,indent=2)+'\n')
(OUT/'firebase-request-bindings.json').write_text(json.dumps({'target_sha256':SHA,'request_selectors':request_selectors,'limits':['Selectors and request construction do not establish request execution, remote success or installed state.']},indent=2)+'\n')
print(json.dumps({'status':'passed','implementations':[x['type'] for x in implementations],'errors':cases}))
