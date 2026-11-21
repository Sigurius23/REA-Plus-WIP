"""Derive only byte-backed metadata bindings from retained public Evidence."""
import hashlib
import json
from pathlib import Path
import struct

OUT = Path(__file__).resolve().parent
SHA = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
sources = {}
def evidence(directory,label):
    file = OUT/directory/(label+'.evidence.json')
    record = json.loads(file.read_text())
    assert record['subject']['digest']['sha256'] == SHA
    sources[str(file.relative_to(OUT))] = {'evidence_id':record['evidence_id'],'sha256':hashlib.sha256(file.read_bytes()).hexdigest()}
    return record

def region(directory,label):
    record = evidence(directory,label)
    value = record['normalized_result']
    assert value['complete'] and value['returned_bytes'] == value['requested_bytes']
    data = bytes.fromhex(value['bytes_hex'])
    assert len(data) == value['returned_bytes']
    return int(value['address'],16),data,record['evidence_id']

def cstring(base,data,address):
    offset=address-base
    assert 0 <= offset < len(data)
    end=data.find(b'\0',offset)
    assert end >= offset
    return data[offset:end].decode('utf8')

def fields(directory,label,names_directory,names_label):
    base,data,eid = region(directory,label)
    name_base,name_data,name_eid=region(names_directory,names_label)
    size,count=struct.unpack_from('<HI',data,10)
    assert size==12 and len(data)==16+count*size
    result=[]
    for index in range(count):
        off=16+index*size
        flags,typeref,name=struct.unpack_from('<Iii',data,off)
        pointer=base+off+8+name
        result.append({'index':index,'name':cstring(name_base,name_data,pointer),'name_address':hex(pointer),'type_mangle_address':None if typeref==0 else hex(base+off+4+typeref),'flags':hex(flags)})
    return {'field_descriptor':hex(base),'record_count':count,'records':result,'field_record_evidence_id':eid,'name_bytes_evidence_id':name_eid}

metadata = {
 'UserDefaultsClient':fields('mcp','preferences-model-descriptor-field-records','mcp','user-defaults-field-names'),
 'BoostsClient':fields('mcp','async-client-type-mangle-context-1-descriptor-field-records','mcp-followup','boosts-client-field-names'),
 'BoostData':fields('mcp','state-boost-data-type-context-0-descriptor-field-records','mcp-followup','boost-data-field-names'),
 'BoostID':fields('mcp','state-boost-id-type-context-0-descriptor-field-records','mcp-followup','boost-id-field-names'),
 'ChangeStack':fields('mcp','state-change-stack-type-context-0-field-records','mcp-followup','change-stack-field-names'),
 'Setting':fields('mcp-defaults-2026-11-21','setting-case-records','mcp-defaults-2026-11-21','setting-all-case-names'),
}
base,data,eid=region('mcp-defaults-2026-11-21','user-defaults-static-metadata')
kind,descriptor=struct.unpack_from('<QQ',data)
assert kind==0x200 and descriptor==0x103d648c4
for record in metadata['UserDefaultsClient']['records']:
    record['instance_field_offset']=hex(struct.unpack_from('<I',data,16+record['index']*4)[0])
metadata['UserDefaultsClient']['field_offset_vector']={'metadata_address':hex(base),'word_offset':2,'evidence_id':eid}
base,data,eid=region('mcp-implementations-2026-11-21','boosts-client-static-metadata')
kind,descriptor=struct.unpack_from('<QQ',data)
assert kind==0x200 and descriptor==0x103d77a74
for record in metadata['BoostsClient']['records']:
    record['instance_field_offset']=hex(struct.unpack_from('<I',data,16+record['index']*4)[0])
metadata['BoostsClient']['field_offset_vector']={'metadata_address':hex(base),'word_offset':2,'evidence_id':eid}
assert metadata['BoostsClient']['records'][13]['instance_field_offset']=='0xd0'
base,data,eid=region('mcp-followup','user-defaults-setting-descriptor')
assert struct.unpack_from('<I',data)[0]&31==18
assert struct.unpack_from('<I',data,20)[0]&0xffffff==0
assert struct.unpack_from('<I',data,24)[0]==297
metadata['Setting']['descriptor']={'address':hex(base),'payload_cases':0,'empty_cases':297,'evidence_id':eid}
assert metadata['UserDefaultsClient']['records'][0]['name']=='boolForSetting'
assert metadata['UserDefaultsClient']['records'][0]['instance_field_offset']=='0x0'
assert metadata['UserDefaultsClient']['records'][10]['name']=='setBool'
assert metadata['UserDefaultsClient']['records'][10]['instance_field_offset']=='0xa0'
assert metadata['BoostsClient']['records'][13]['name']=='applyToWebContent'
assert metadata['Setting']['records'][49]['name']=='hasDismissedBoostsInterstitial'
assert metadata['Setting']['records'][50]['name']=='hasDismissedJSWarningBanner'
metadata['Setting']['selected_no_payload_tags']={'0x31':metadata['Setting']['records'][49],'0x32':metadata['Setting']['records'][50]}
result={'target_sha256':SHA,'authority':'Public read_bytes and retained field descriptors; signed-relative pointer arithmetic and metadata-selected field offsets.','metadata':metadata,'sources':sources,'limits':['Declarations and static offsets do not establish runtime dependency injection.','The setting mapping uses Swift no-payload enum declaration indices; selected key strings are independently verified in selected-preference-path.json.','BoostsClient index13 has observed static instance offset0xd0; runtime implementation selection remains separate.','No durable-write, network-send, or runtime-state claim follows from these type names.']}
(OUT/'metadata-bindings.json').write_text(json.dumps(result,indent=2)+'\n')
print(json.dumps({'status':'passed','types':len(metadata),'fields':sum(x['record_count'] for x in metadata.values()),'sources':len(sources),'output':'metadata-bindings.json'}))
