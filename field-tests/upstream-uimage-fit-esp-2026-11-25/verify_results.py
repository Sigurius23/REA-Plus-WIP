"""Verify frozen identity, real public protocol outcomes, stored bytes and historical compatibility."""
from pathlib import Path
import hashlib,json
O=Path(__file__).resolve().parent;R=O.parents[1]
load=lambda p:json.loads(p.read_text());sha=lambda b:hashlib.sha256(b).hexdigest()
def file_sha(p):
 h=hashlib.sha256()
 with p.open('rb') as f:
  for b in iter(lambda:f.read(1024*1024),b''):h.update(b)
 return h.hexdigest()
def lineage(r):assert r['process_lineage']['status']=='verified' and r['process_lineage']['descendants']==[]
def inv(label):return load(O/'mcp-carriers'/(label+'-inspect.evidence.json'))['normalized_result']['substeps'][0]['evidence']['normalized_result']
def meta(label):return next(x['format_metadata'] for x in inv(label)['occurrences'] if x['logical_path']=='.')
def error(label):return json.loads(next(x['text'] for x in load(O/'mcp-carriers'/(label+'.reply.json'))['content'] if x['type']=='text'))['error']
m=load(O/'runtime-manifest.json');assert len(m['files'])==1935
for row in m['files']:
 p=Path(m['runtime_root'])/row['path'];assert p.stat().st_size==row['bytes'] and file_sha(p)==row['sha256'],str(p)
for row in m['source_files']:assert file_sha(R/row['path'])==row['sha256'],row['path']
fixtures=load(O/'fixture-receipt.json');assert fixtures['target_executed'] is False and len(fixtures['files'])==13
by_file={row['name']:row for row in fixtures['files']}
for row in fixtures['files']:
 b=bytes.fromhex(row['hex']);assert len(b)==row['bytes'] and sha(b)==row['sha256'];assert Path(row['path']).read_bytes()==b
p=O/'mcp-carriers';s=load(p/'summary.json');assert (s['status'],s['calls'],s['successful'],s['errors'])==('completed',72,47,25);lineage(s['verifier_run']);lineages=[s['verifier_run']]
plan=load(O/'mcp-carriers.plan.json');rows=load(p/'invocations.json');assert len(rows)==len(plan['steps'])
source=None;inspection_sources={}
for expected,row in zip(plan['steps'],rows):
 assert expected['name']==row['name'] and expected['arguments']==row['arguments'];assert row['thrown'] is None and expected['expect_success'] is (not row['is_error'])
 if row['name']=='open_binary':
  source=Path(row['arguments']['path']).name
  assert load(p/row['reply'])['structuredContent']['result']['sha256']==by_file[source]['sha256']
 if row['name']=='inspect_artifact' and expected['expect_success']:inspection_sources[expected['label'].removesuffix('-inspect')]=source
for label,file in inspection_sources.items():
 inventory=inv(label);fixture=by_file[file];assert inventory['manifest']['root_sha256']==fixture['sha256']
 assert inventory['nodes'][next(i for i,n in enumerate(inventory['nodes']) if n['artifact_id']==inventory['manifest']['root_artifact_id'])]['format']==inventory['manifest']['root_format']
 assert inventory['integrity_contradictions']==[]
 for occurrence in inventory['occurrences']:
  if occurrence['logical_path']=='.':continue
  expected=fixture['expected_extractions'][occurrence['logical_path']];location=occurrence['source_location'];assert location is not None
  raw=bytes.fromhex(fixture['hex']);assert raw[location['offset']:location['offset']+location['length']].hex()==expected
u=meta('uimage');assert u['crc_verified'] and u['sub_image_count']==2 and u['payload_size']==len(bytes.fromhex(by_file['multi.uimg']['expected_extractions']['payload.bin']))
assert u['header_crc32']==u['computed_header_crc32'] and u['data_crc32']==u['computed_data_crc32'] and len(u['name_bytes_hex'])==64
assert meta('crc')['data_crc32']==0 and meta('crc')['computed_data_crc32']!=0 and not meta('crc')['crc_verified']
for label in ['fit','external','late']:
 fm=meta(label);assert fm['kind']=='fit' and fm['default_configuration']=='conf-1';assert fm['configurations'][0]['unresolved_reference_count']==1
 assert fm['configurations'][0]['signatures'][0]['verified'] is False
 images=[x['format_metadata'] for x in inv(label)['occurrences'] if x.get('format_metadata',{}).get('kind')=='fit-image']
 assert len(images)==2 and all(x['hashes_verified']==1 and x['hashes_mismatched']==0 for x in images)
 if label=='external':assert [x['data_source'] for x in images]==['data-offset','data-position']
assert bytes.fromhex(by_file['late.fit']['hex']).index(bytes.fromhex('00000001696d6167657300'))>8192
hashes=[x['format_metadata'] for x in inv('hash')['occurrences'] if x.get('format_metadata',{}).get('kind')=='fit-image'];assert hashes[0]['hashes_mismatched']==1 and hashes[0]['hashes'][0]['declared_hex']=='00'*32
esp=meta('esp');assert esp['header']['segment_count']==2 and esp['coverage']=='complete' and esp['checksum']['status']=='valid' and esp['appended_sha256']['status']=='valid'
assert esp['signature_slots'][0]['status']=='valid' and esp['signature_slots'][0]['stored_crc32']==esp['signature_slots'][0]['computed_crc32']
signature=meta('signature');assert signature['coverage']=='unknown' and signature['signature_slots'][0]['status']=='invalid' and signature['signature_slots'][0]['stored_crc32']!=signature['signature_slots'][0]['computed_crc32']
assert meta('checksum')['checksum']['status']=='invalid' and meta('checksum')['appended_sha256']['status']=='valid'
assert meta('partial')['coverage']=='unknown' and meta('partial')['checksum']['status']=='unavailable'
for label in ['crc','hash','signature','checksum']:
 assert 'observed-untrusted' in ' '.join(inv(label)['limitations'])
 for suffix in ['-strict','-extract-strict']:assert error(label+suffix)['details']['reason']=='integrity'
for key in ['max_firmware_file_bytes','max_firmware_elements','max_firmware_tree_nodes','max_firmware_tree_properties','max_firmware_tree_depth','max_firmware_metadata_bytes','max_firmware_hash_bytes']:
 e=error('fit-'+key);assert e['code']=='resource_constraint' and key in json.dumps(e) and 'unchanged' in e['remediation']['action']
assert error('fit-max_firmware_hash_bytes')['details']['resource']=='cpu'
for label in ['uimage-max_firmware_runs','fit-max_firmware_runs','esp-elements']:assert error(label)['code']=='invalid_request'
for prefix in ['bad-size','bad-structure']:
 for suffix in ['fail','record-and-continue']:assert error(prefix+'-'+suffix)['details']['reason']=='format'
assert error('8266-refusal')['details']['reason']=='unavailable' and 'ESP8266' in json.dumps(error('8266-refusal'))
cli=load(O/'cli/verification.json');assert cli['status']=='passed' and len(cli['records'])==13;assert sum(r.get('exact_mcp_evidence_equal',False) for r in cli['records'])==6;assert sum(r.get('normalized_manifest_and_files_equal',False) for r in cli['records'])==4;lineage(cli['verifier_run']);lineages.append(cli['verifier_run'])
for row in cli['records']:
 if row.get('exact_mcp_evidence_equal'):assert load(O/'cli'/(row['label']+'.json'))==load(p/(row['label']+'.evidence.json'))
readbacks=load(O/'extracted-readback.json');assert len(readbacks)==14 and sum(len(r['files']) for r in readbacks)==30
for row in readbacks:
 expected=by_file[row['source_file']]['expected_extractions'];assert {f['relative_path']:f['hex'] for f in row['files']}==expected
 for f in row['files']:
  b=bytes.fromhex(f['hex']);assert len(b)==f['bytes_written'] and sha(b)==f['sha256']
compat=load(O/'compatibility/verification.json');assert compat['status']=='passed' and len(compat['records'])==8;lineage(compat['verifier_run']);lineages.append(compat['verifier_run'])
for row in compat['records']:assert load(O/'compatibility'/(row['label']+'.json'))==load(Path(row['expected']))
arc=load(O/'mcp-arc/summary.json');assert (arc['calls'],arc['successful'],arc['errors'])==(4,4,0);lineage(arc['verifier_run']);lineages.append(arc['verifier_run'])
current=load(O/'mcp-arc/reducer.evidence.json');assert current==load(R/'field-tests/upstream-uf2-dfuse-2026-11-25/mcp-arc/reducer.evidence.json');assert current['evidence_id']=='ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45' and len(current['normalized_result']['instructions'])==2518
history=load(O/'history-verification.json');assert history['status']=='passed' and len(history['snapshots'])==34
package=json.loads(next(line for line in reversed((O/'package.log').read_text().splitlines()) if line.startswith('{"verifier_run"')));assert package['mcpTools']==208 and package['mcpPrompts']==6;lineage(package['verifier_run']);lineages.append(package['verifier_run'])
assert '249 passed' in (O/'tests.log').read_text() and 'Architecture guards passed' in (O/'check.log').read_text()
report={'status':'passed','runtime_files':len(m['files']),'source_commitments':len(m['source_files']),'qualified_mcp':{'calls':76,'successes':51,'expected_refusals':25},'cli_calls':21,'cli_full_evidence_pairs':6,'historical_firmware_full_evidence_pairs':8,'extraction_manifest_file_pairs':4,'verified_readback_files':30,'arc':{'complete_evidence_unchanged':True,'evidence_id':current['evidence_id'],'instruction_count':2518},'historical_snapshots':34,'lineages':lineages,'target_executed':False}
(O/'verification.json').write_text(json.dumps(report,indent=2)+'\n');print(json.dumps({k:v for k,v in report.items() if k!='lineages'}))
