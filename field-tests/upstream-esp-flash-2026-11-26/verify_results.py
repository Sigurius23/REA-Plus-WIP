"""Verify frozen identity, public protocol outcomes, stored ranges and historical compatibility."""
from pathlib import Path
import hashlib,json,struct,zlib
O=Path(__file__).resolve().parent;R=O.parents[1]
load=lambda p:json.loads(p.read_text());sha=lambda b:hashlib.sha256(b).hexdigest()
def file_sha(p):
 h=hashlib.sha256()
 with p.open('rb') as f:
  for b in iter(lambda:f.read(1024*1024),b''):h.update(b)
 return h.hexdigest()
def lineage(r):assert r['process_lineage']['status']=='verified' and r['process_lineage']['descendants']==[]
def inventory(label):return load(O/'mcp-carriers'/(label+'-inspect.evidence.json'))['normalized_result']['substeps'][0]['evidence']['normalized_result']
def meta(label):return next(x['format_metadata'] for x in inventory(label)['occurrences'] if x['logical_path']=='.')
def error(label):return json.loads(next(x['text'] for x in load(O/'mcp-carriers'/(label+'.reply.json'))['content'] if x['type']=='text'))['error']
m=load(O/'runtime-manifest.json');assert len(m['files'])==1943
for row in m['files']:
 p=Path(m['runtime_root'])/row['path'];assert p.stat().st_size==row['bytes'] and file_sha(p)==row['sha256'],str(p)
for row in m['source_files']:assert file_sha(R/row['path'])==row['sha256'],row['path']
fixtures=load(O/'fixture-receipt.json');assert fixtures['target_executed'] is False and len(fixtures['files'])==6
by_file={row['name']:row for row in fixtures['files']}
for row in fixtures['files']:
 b=bytes.fromhex(row['hex']);assert len(b)==row['bytes'] and sha(b)==row['sha256'];assert Path(row['path']).read_bytes()==b
 for expected in row['expected_regions'].values():
  start=expected['physical_offset'];assert start is not None;assert b[start:start+len(bytes.fromhex(expected['hex']))].hex()==expected['hex']
p=O/'mcp-carriers';s=load(p/'summary.json');assert (s['status'],s['calls'],s['successful'],s['errors'])==('completed',35,29,6);lineage(s['verifier_run']);lineages=[s['verifier_run']]
plan=load(O/'mcp-carriers.plan.json');rows=load(p/'invocations.json');assert len(rows)==len(plan['steps'])
source=None;inspection_sources={};selection={}
for expected,row in zip(plan['steps'],rows):
 assert expected['name']==row['name'] and expected['arguments']==row['arguments'];assert row['thrown'] is None and expected['expect_success'] is (not row['is_error'])
 if row['name']=='open_binary':
  source=Path(row['arguments']['path']).name;selection={k:v for k,v in row['arguments'].items() if k in ['flash_offset','partition_table_offset']}
  opened=load(p/row['reply'])['structuredContent']['result'];assert opened['sha256']==by_file[source]['sha256'] and opened['esp_flash_selection']==selection
 if row['name']=='inspect_artifact' and expected['expect_success']:
  label=expected['label'].removesuffix('-inspect');inspection_sources[label]=source
  assert load(p/(label+'-inspect.evidence.json'))['subject']['esp_flash_selection']==selection
for label,file in inspection_sources.items():
 g=inventory(label);fixture=by_file[file];assert g['manifest']['root_sha256']==fixture['sha256'] and g['manifest']['root_format']=='esp-flash-image'
 assert g['integrity_contradictions']==[];assert len(g['occurrences'])==1+len(fixture['expected_regions'])
 for occurrence in g['occurrences']:
  if occurrence['logical_path']=='.':continue
  expected=fixture['expected_regions'][occurrence['logical_path']];location=occurrence['source_location'];assert location=={'offset':expected['physical_offset'],'length':len(bytes.fromhex(expected['hex']))}
  raw=bytes.fromhex(fixture['hex']);assert raw[location['offset']:location['offset']+location['length']].hex()==expected['hex']
  fm=occurrence['format_metadata'];assert fm['declared_file_offset']==expected['declared_offset'] and fm['stored_offset']==expected['stored_offset'] and fm['stored_size']==location['length']
  if fm['kind']=='esp-flash-partition':assert len(bytes.fromhex(fm['label_bytes_hex']))==16
 fm=meta(label);assert fm['coverage']==('unknown' if label=='leading' else 'complete') and fm['boot_selection']['running_partition']=='unknown'
 assert len(fm['boot_selection']['assumptions'])>=(1 if label=='bad-md5' else 5)
 origin=fm['flash_offset']['value'];table_offset=fm['partition_table']['flash_address']-origin;raw=bytes.fromhex(fixture['hex'])
 for md5 in fm['partition_table']['md5_entries']:
  at=md5['entry_offset'];assert md5['computed']==hashlib.md5(raw[table_offset:table_offset+at]).hexdigest();assert md5['matches'] is (md5['computed']==md5['stored'])
 for record in fm['otadata']['records']:
  assert record['computed_crc']==(zlib.crc32(struct.pack('<I',record['ota_seq']),0xffffffff)&0xffffffff)
  assert record['crc_matches'] is (record['crc']==record['computed_crc'])
assert meta('whole')['flash_offset']=={'source':'default','value':0}
assert meta('whole')['boot_selection']['partition_index']==5 and meta('whole')['boot_selection']['active_record']==1
assert meta('selected')['flash_offset']=={'source':'caller','value':0} and meta('selected')['partition_table']['method']=='caller'
assert load(p/'selected-inspect.evidence.json')['evidence_id']!=load(p/'whole-inspect.evidence.json')['evidence_id']
assert meta('leading')['flash_offset']=={'source':'caller','value':4096}
assert meta('scanned')['partition_table']['method']=='scan' and meta('scanned')['partition_table']['flash_address']==0xa000
assert meta('no-md5')['partition_table']['md5']['status']=='absent' and meta('no-md5')['partition_table']['method']=='caller'
assert meta('bad-md5')['partition_table']['md5']['status']=='invalid' and 'observed-untrusted' in ' '.join(inventory('bad-md5')['limitations'])
assert meta('erased-ota')['boot_selection']['basis']=='factory-fallback'
for record in meta('erased-ota')['otadata']['records']:assert record['ota_seq']==record['crc']==0xffffffff and record['computed_crc']==0x2144df1c and not record['valid']
for name in ['inspect_artifact','extract_artifact']:assert error('bad-md5-strict-'+name)['details']['reason']=='integrity'
for key in ['max_firmware_file_bytes','max_firmware_metadata_bytes','max_firmware_hash_bytes']:
 e=error('whole-'+key);assert e['code']=='resource_constraint' and key in json.dumps(e) and 'unchanged' in e['remediation']['action']
assert error('whole-max_firmware_hash_bytes')['details']['resource']=='cpu' and error('whole-max_firmware_runs')['code']=='invalid_request'
cli=load(O/'cli/verification.json');assert cli['status']=='passed' and len(cli['records'])==14;assert sum(r.get('exact_mcp_evidence_equal',False) for r in cli['records'])==7;assert sum(r.get('normalized_manifest_and_files_equal',False) for r in cli['records'])==4;lineage(cli['verifier_run']);lineages.append(cli['verifier_run'])
for row in cli['records']:
 if row.get('exact_mcp_evidence_equal'):assert load(O/'cli'/(row['label']+'.json'))==load(p/(row['label']+'.evidence.json'))
readbacks=load(O/'extracted-readback.json');assert len(readbacks)==10 and sum(len(r['files']) for r in readbacks)==78
for row in readbacks:
 expected=by_file[row['source_file']]['expected_regions'];assert {f['relative_path']:f['hex'] for f in row['files']}=={k:v['hex'] for k,v in expected.items()}
 for f in row['files']:
  b=bytes.fromhex(f['hex']);assert len(b)==f['bytes_written'] and sha(b)==f['sha256']
compat=load(O/'compatibility/verification.json');assert compat['status']=='passed' and len(compat['records'])==14;lineage(compat['verifier_run']);lineages.append(compat['verifier_run'])
for row in compat['records']:assert load(O/'compatibility'/(row['label']+'.json'))==load(Path(row['expected']))
arc=load(O/'mcp-arc/summary.json');assert (arc['calls'],arc['successful'],arc['errors'])==(4,4,0);lineage(arc['verifier_run']);lineages.append(arc['verifier_run'])
current=load(O/'mcp-arc/reducer.evidence.json');assert current==load(R/'field-tests/upstream-uimage-fit-esp-2026-11-25/mcp-arc/reducer.evidence.json');assert current['evidence_id']=='ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45' and len(current['normalized_result']['instructions'])==2518
history=load(O/'history-verification.json');assert history['status']=='passed' and len(history['snapshots'])==35
package=json.loads(next(line for line in reversed((O/'package.log').read_text().splitlines()) if line.startswith('{"verifier_run"')));assert package['mcpTools']==208 and package['mcpPrompts']==6;lineage(package['verifier_run']);lineages.append(package['verifier_run'])
assert '336 passed' in (O/'tests.log').read_text() and 'Architecture guards passed' in (O/'check.log').read_text()
assert 'Discovered all 994 test files exactly once' in (O/'discovery.log').read_text() and 'successful' in (O/'docs.log').read_text()
report={'status':'passed','runtime_files':len(m['files']),'source_commitments':len(m['source_files']),'qualified_mcp':{'calls':39,'successes':33,'expected_refusals':6},'cli_calls':28,'cli_full_evidence_pairs':7,'historical_firmware_full_evidence_pairs':14,'extraction_manifest_file_pairs':4,'verified_readback_files':78,'arc':{'complete_evidence_unchanged':True,'evidence_id':current['evidence_id'],'instruction_count':2518},'historical_snapshots':35,'lineages':lineages,'target_executed':False}
(O/'verification.json').write_text(json.dumps(report,indent=2)+'\n');print(json.dumps({k:v for k,v in report.items() if k!='lineages'}))
