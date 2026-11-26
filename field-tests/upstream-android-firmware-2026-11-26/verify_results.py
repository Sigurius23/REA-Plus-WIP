"""Verify final frozen code, complete public Evidence, independent stored-byte oracle and compatibility."""
from pathlib import Path
import hashlib,json,sys
O=Path(__file__).resolve().parent;R=O.parents[1]
load=lambda p:json.loads(p.read_text());sha=lambda b:hashlib.sha256(b).hexdigest()
def file_sha(p):
 h=hashlib.sha256()
 with p.open('rb') as f:
  for b in iter(lambda:f.read(1024*1024),b''):h.update(b)
 return h.hexdigest()
def lineage(r):assert r['process_lineage']['status']=='verified' and r['process_lineage']['descendants']==[]
def evidence(label):return load(O/'mcp-carriers'/(label+'-inspect.evidence.json'))
def inv(label):return evidence(label)['normalized_result']['substeps'][0]['evidence']['normalized_result']
def meta(label):return next(x['format_metadata'] for x in inv(label)['occurrences'] if x['logical_path']=='.')
def error(label):return json.loads(next(x['text'] for x in load(O/'mcp-carriers'/(label+'.reply.json'))['content'] if x['type']=='text'))['error']
m=load(O/'runtime-manifest.json')
for row in m['files']:
 p=Path(m['runtime_root'])/row['path'];assert p.stat().st_size==row['bytes'] and file_sha(p)==row['sha256'],str(p)
for row in m['source_files']:assert file_sha(R/row['path'])==row['sha256'],row['path']
fixtures=load(O/'fixture-receipt.json');assert fixtures['target_executed'] is False and len(fixtures['files'])==12
by_file={row['name']:row for row in fixtures['files']}
for row in fixtures['files']:
 b=bytes.fromhex(row['hex']);assert len(b)==row['bytes'] and sha(b)==row['sha256'] and Path(row['path']).read_bytes()==b
 for region in row['expect'].get('regions',{}).values():
  if region['offset'] is not None:assert b[region['offset']:region['offset']+len(bytes.fromhex(region['hex']))].hex()==region['hex']
p=O/'mcp-carriers';s=load(p/'summary.json');assert (s['status'],s['calls'],s['successful'],s['errors'])==('completed',58,45,13);lineage(s['verifier_run']);lineages=[s['verifier_run']]
plan=load(O/'mcp-carriers.plan.json');rows=load(p/'invocations.json');assert len(rows)==len(plan['steps']);source=None;inspections={}
for expected,row in zip(plan['steps'],rows):
 assert expected['name']==row['name'] and expected['arguments']==row['arguments'];assert row['thrown'] is None and expected['expect_success'] is (not row['is_error'])
 if row['name']=='open_binary':
  source=Path(row['arguments']['path']).name;opened=load(p/row['reply'])['structuredContent']['result'];assert opened['sha256']==by_file[source]['sha256'] and opened['format']==by_file[source]['expect']['format']
 if row['name']=='inspect_artifact' and expected['expect_success']:inspections[expected['label'].removesuffix('-inspect')]=source
for label,name in inspections.items():
 g=inv(label);fixture=by_file[name];assert g['manifest']['root_sha256']==fixture['sha256'] and g['manifest']['root_format']==fixture['expect']['format'];assert g['integrity_contradictions']==[]
 expected=fixture['expect']['regions'];observed={o['logical_path']:o for o in g['occurrences'] if o['logical_path']!='.'};assert observed.keys()==expected.keys(),(label,observed.keys(),expected.keys())
 assert 'esp_flash_selection' not in evidence(label)['subject']
 for path,region in expected.items():
  loc=observed[path]['source_location'];n=len(bytes.fromhex(region['hex']))
  if n==0:assert loc is None
  else:assert loc=={'offset':region['offset'],'length':n}
 fm=meta(label);assert fm['kind']==fixture['expect']['format']
 if fm['kind']=='android-boot-image':
  assert fm['header_version']==fixture['expect']['version'] and fm['image_kind']==fixture['expect']['image_kind']
  header=bytes.fromhex(fm['header_bytes_hex']);assert bytes.fromhex(fixture['hex'])[:len(header)]==header
 else:
  assert fm['max_timestamp']=='9007199254740997' and fm['signatures_verified'] is False and fm['partition_images_reconstructed'] is False
  part=fm['partitions'][0];assert part['name']['value']=='\ufeffsystem/../odd' and part['name']['bytes_hex']=='\ufeffsystem/../odd'.encode().hex()
  assert part['new_partition_info']['hash_verified'] is False and part['run_postinstall'] is False and part['partition_image_reconstructed'] is False
  ops=part['operations'];assert [o['type_code'] for o in ops]==[0,6,4,8,14] and ops[4]['type_name'] is None
  assert ops[2]['src_extents'][0]['start_block']=='18446744073709551615' and ops[2]['src_extents'][0]['sparse_hole'] is True and ops[2]['src_hash_verified'] is False
  assert ops[0]['data_sha256']['status']==('invalid' if fixture['expect']['bad_hash'] else 'unavailable' if fixture['expect']['wide_offset'] else 'valid')
  for i in [3,4]:assert ops[i]['data_sha256']['status']=='valid' and ops[i]['data_sha256']['observed_hex']==sha(bytes.fromhex(expected[ops[i]['path']]['hex']))
  for key in ['metadata_signatures','payload_signatures']:assert fm[key]['status']=='parsed' and fm[key]['verified'] is False and len(fm[key]['signatures'])==1
  assert any(x['field_number']==100 for x in fm['unknown_fields']) and fm['partial_update'] is False
  assert fm['dynamic_partition_metadata']['vabc_enabled'] is False
assert meta('boot-v2')['dtb_addr'] is None and meta('boot-v2')['dtb_addr_hex']==bytes.fromhex(by_file['boot-v2.bin']['hex'])[1652:1660].hex()
b4=meta('boot-v4');assert b4['signature_size']==9 and b4['avb_footer_present'] is True and b4['avb_footer_bytes_hex']==by_file['boot-v4.bin']['hex'][-128:] and b4['avb_vbmeta_size']==32
v4=meta('vendor-v4');assert v4['vendor_ramdisk_table_entry_count']==2 and [r['name'] for r in v4['vendor_ramdisk_entries']]==['../odd','ramdisk-0'] and all(r['extension_bytes_hex']=='11223344' for r in v4['vendor_ramdisk_entries'])
assert meta('ota-wide-offset')['coverage']=='unknown' and meta('ota-wide-offset')['partitions'][0]['operations'][0]['data_offset']=='9007199254740993'
assert 'observed-untrusted' in ' '.join(inv('ota-bad-hash')['limitations'])
for label in ['ota-bad-hash-strict-inspect','ota-bad-hash-strict-extract']:assert error(label)['details']['reason']=='integrity'
for key in ['max_firmware_file_bytes','max_firmware_elements','max_firmware_metadata_bytes']:
 e=error('boot-v0-'+key);assert e['code']=='resource_constraint' and key in json.dumps(e) and 'unchanged' in e['remediation']['action']
assert error('ota-max_firmware_hash_bytes')['details']['resource']=='cpu'
for label in ['boot-v0-max_firmware_tree_depth','boot-v0-max_firmware_hash_bytes','ota-max_firmware_runs']:assert error(label)['code']=='invalid_request'
assert error('ota-v1-inspect')['details']['reason']=='unavailable' and error('ota-malformed-inspect')['details']['reason']=='format'
if '--semantic-only' in sys.argv:
 print(json.dumps({'status':'passed','phase':'source-runtime-and-mcp-semantics','inspections':len(inspections)}));raise SystemExit(0)
cli=load(O/'cli/verification.json');assert cli['status']=='passed' and len(cli['records'])==19;assert sum(r.get('exact_mcp_evidence_equal',False) for r in cli['records'])==10;assert sum(r.get('normalized_manifest_and_files_equal',False) for r in cli['records'])==5;lineage(cli['verifier_run']);lineages.append(cli['verifier_run'])
for row in cli['records']:
 if row.get('exact_mcp_evidence_equal'):assert load(O/'cli'/(row['label']+'.json'))==load(p/(row['label']+'.evidence.json'))
readbacks=load(O/'extracted-readback.json');assert len(readbacks)==15 and sum(len(r['files']) for r in readbacks)==89
for row in readbacks:
 expected=by_file[row['source_file']]['expect']['regions'];assert {f['relative_path']:f['hex'] for f in row['files']}=={k:v['hex'] for k,v in expected.items()},row['label']
 for f in row['files']:
  b=bytes.fromhex(f['hex']);assert len(b)==f['bytes_written'] and sha(b)==f['sha256']
compat=load(O/'compatibility/verification.json');assert compat['status']=='passed' and len(compat['records'])==21;lineage(compat['verifier_run']);lineages.append(compat['verifier_run'])
for row in compat['records']:assert load(O/'compatibility'/(row['label']+'.json'))==load(Path(row['expected']))
arc=load(O/'mcp-arc/summary.json');assert (arc['calls'],arc['successful'],arc['errors'])==(4,4,0);lineage(arc['verifier_run']);lineages.append(arc['verifier_run'])
current=load(O/'mcp-arc/reducer.evidence.json');assert current==load(R/'field-tests/upstream-esp-flash-2026-11-26/mcp-arc/reducer.evidence.json');assert current['evidence_id']=='ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45' and len(current['normalized_result']['instructions'])==2518
history=load(O/'history-verification.json');assert history['status']=='passed' and len(history['snapshots'])==36
package=json.loads(next(line for line in reversed((O/'package.log').read_text().splitlines()) if line.startswith('{"verifier_run"')));assert package['mcpTools']==208 and package['mcpPrompts']==6;lineage(package['verifier_run']);lineages.append(package['verifier_run'])
assert '370 passed' in (O/'tests.log').read_text() and 'Architecture guards passed' in (O/'check.log').read_text()
report={'status':'passed','runtime_files':len(m['files']),'source_commitments':len(m['source_files']),'qualified_mcp':{'calls':62,'successes':49,'expected_refusals':13},'cli_calls':40,'cli_full_evidence_pairs':10,'historical_firmware_full_evidence_pairs':21,'extraction_manifest_file_pairs':5,'verified_readback_files':89,'arc':{'complete_evidence_unchanged':True,'evidence_id':current['evidence_id'],'instruction_count':2518},'historical_snapshots':36,'lineages':lineages,'target_executed':False,'partition_images_reconstructed':False}
(O/'verification.json').write_text(json.dumps(report,indent=2)+'\n');print(json.dumps({k:v for k,v in report.items() if k!='lineages'}))
