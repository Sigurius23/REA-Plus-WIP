"""Verify frozen sources/runtime, raw public replies, independent fixture bytes and compatibility."""
from pathlib import Path
import hashlib,json
O=Path(__file__).resolve().parent;R=O.parents[1]
load=lambda p:json.loads(p.read_text())
sha=lambda b:hashlib.sha256(b).hexdigest()
def file_sha(p):
 h=hashlib.sha256()
 with p.open('rb') as f:
  for chunk in iter(lambda:f.read(1024*1024),b''):h.update(chunk)
 return h.hexdigest()
def lineage(r):
 p=r['process_lineage'];assert p['status']=='verified' and p['descendants']==[]
def inventory(p):return load(p)['normalized_result']['substeps'][0]['evidence']['normalized_result']
def metadata(p):return next(x for x in inventory(p)['occurrences'] if x['logical_path']=='.')['format_metadata']
def error(p):return json.loads(next(x['text'] for x in load(p)['content'] if x['type']=='text'))['error']
m=load(O/'runtime-manifest.json');assert len(m['files'])==1917
for row in m['files']:
 p=Path(m['runtime_root'])/row['path'];assert p.stat().st_size==row['bytes'] and file_sha(p)==row['sha256'],str(p)
for row in m['source_files']:
 p=R/row['path']
 if row.get('deleted'):assert not p.exists()
 else:assert file_sha(p)==row['sha256'],str(p)
fixtures=load(O/'fixture-receipt.json');assert fixtures['target_executed'] is False
for row in fixtures['files']:
 b=bytes.fromhex(row['hex']);assert len(b)==row['bytes'] and sha(b)==row['sha256'];assert Path(row['path']).read_bytes()==b
lineages=[]
for name in ['mcp-carriers','mcp-carriers-qualified']:
 p=O/name;s=load(p/'summary.json');assert (s['status'],s['calls'],s['successful'],s['errors'])==('completed',36,24,12)
 if name.endswith('-qualified'):lineage(s['verifier_run']);lineages.append(s['verifier_run'])
 else:assert s['verifier_run']['process_lineage']['status']=='unavailable'
 plan=load(O/(name+'.plan.json'));rows=load(p/'invocations.json');assert len(rows)==len(plan['steps'])
 for expected,row in zip(plan['steps'],rows):
  assert expected['name']==row['name'] and expected['arguments']==row['arguments'];assert row['thrown'] is None
  assert expected['expect_success'] is (not row['is_error'])
  if row['name']=='open_binary':assert load(p/row['reply'])['structuredContent']['result']['sha256']==file_sha(Path(row['arguments']['path']))
 uf2=inventory(p/'uf2-inspect.evidence.json');meta=metadata(p/'uf2-inspect.evidence.json')
 assert (meta['main_flash_coverage'],meta['family_count'],meta['region_count'],meta['data_bytes'])==('complete-within-carrier',2,2,4)
 regions=[x for x in uf2['occurrences'] if x.get('format_metadata',{}).get('kind')=='uf2-region'];assert len(regions)==2
 assert regions[0]['artifact_id']==regions[1]['artifact_id'];assert {x['format_metadata']['family_id'] for x in regions}=={0xe48bff56,0xe48bff59}
 assert all(x['source_location'] is None for x in regions)
 partial=metadata(p/'partial-inspect.evidence.json')
 assert (partial['main_flash_coverage'],partial['trailing_bytes'],partial['invalid_block_count'],partial['missing_block_count'])==('unknown',1,1,1)
 assert (partial['not_main_flash_block_count'],partial['file_container_block_count'],partial['md5_block_count'],partial['extension_tag_block_count'])==(1,1,1,1)
 assert 'not decoded or verified' in ' '.join(inventory(p/'partial-inspect.evidence.json')['limitations'])
 dfu=inventory(p/'dfu-inspect.evidence.json');dm=metadata(p/'dfu-inspect.evidence.json')
 assert (dm['target_count'],dm['element_count'],dm['empty_element_count'],dm['overlapping_element_count'],dm['data_bytes'])==(2,3,1,1,4)
 assert dm['suffix_crc']==dm['computed_crc'];assert dm['targets'][0]['target_name']=='flash' and dm['targets'][1]['target_name']=='empty'
 assert dm['targets'][0]['name_field_hex'].startswith('666c61736800726177')
 elements=[x for x in dfu['occurrences'] if x.get('format_metadata',{}).get('kind')=='dfuse-element']
 assert [x['source_location'] for x in elements]==[{'offset':293,'length':3},{'offset':304,'length':1}]
 assert metadata(p/'legacy-inspect.evidence.json')['image_size']==dm['image_size']-16
 crc=load(p/'crc-inspect.evidence.json')['normalized_result'];cm=metadata(p/'crc-inspect.evidence.json')
 assert cm['suffix_crc']==0 and cm['computed_crc']!=0
 assert any(x['kind']=='integrity' and x['value'].get('algorithm')=='dfu-crc32' and x['value']['status']=='mismatched' and x['value']['trust']=='observed-untrusted' for x in crc['observations'])
 assert inventory(p/'crc-inspect.evidence.json')['integrity_contradictions']==[]
 assert 'observed-untrusted' in ' '.join(load(p/'crc-extract.evidence.json')['normalized_result']['limitations'])
 for label in ['uf2-bytes','uf2-runs','dfu-bytes','dfu-elements']:
  e=error(p/(label+'.reply.json'));assert e['code']=='resource_constraint';assert 'unchanged' in e['remediation']['action']
 for label in ['uf2-elements','dfu-runs']:assert error(p/(label+'.reply.json'))['code']=='invalid_request'
 for label in ['conflict-fail','conflict-record-and-continue','malformed-fail','malformed-record-and-continue']:
  e=error(p/(label+'.reply.json'));assert e['code']=='artifact_operation_failed' and e['details']['reason']=='format'
 for label in ['crc-strict','crc-extract-strict']:
  e=error(p/(label+'.reply.json'));assert e['code']=='artifact_operation_failed' and e['details']['reason']=='integrity';assert 'CRC mismatch' in json.dumps(e)
for label in ['uf2-inspect','partial-inspect','dfu-inspect','legacy-inspect','crc-inspect']:
 assert load(O/'mcp-carriers'/(label+'.evidence.json'))==load(O/'mcp-carriers-qualified'/(label+'.evidence.json'))
cli=load(O/'cli/verification.json');assert cli['status']=='passed' and len(cli['records'])==12
assert sum(r.get('exact_mcp_evidence_equal',False) for r in cli['records'])==5
assert sum(r.get('normalized_manifest_and_files_equal',False) for r in cli['records'])==4
lineage(cli['verifier_run']);lineages.append(cli['verifier_run'])
for row in cli['records']:
 if row.get('exact_mcp_evidence_equal'):assert load(O/'cli'/(row['label']+'.json'))==load(O/'mcp-carriers-qualified'/(row['label']+'.evidence.json'))
readbacks=load(O/'extracted-readback.json');assert len(readbacks)==8 and sum(len(r['files']) for r in readbacks)==14
for r in readbacks:
 expected=['0102','0102'] if 'uf2' in r['label'] else ['01'] if 'partial' in r['label'] else ['010203','08']
 assert sorted(f['hex'] for f in r['files'])==sorted(expected)
 for f in r['files']:
  b=bytes.fromhex(f['hex']);assert sha(b)==f['sha256'] and len(b)==f['bytes_written']
compat=load(O/'hex-compatibility/verification.json');assert compat['status']=='passed' and len(compat['records'])==3
lineage(compat['verifier_run']);lineages.append(compat['verifier_run'])
for row in compat['records']:assert load(O/'hex-compatibility'/(row['label']+'.json'))==load(R/'field-tests/upstream-hex-records-2026-11-25/mcp-records-qualified'/(row['label']+'.evidence.json'))
arc=load(O/'mcp-arc/summary.json');assert (arc['calls'],arc['successful'],arc['errors'])==(4,4,0);lineage(arc['verifier_run']);lineages.append(arc['verifier_run'])
current=load(O/'mcp-arc/reducer.evidence.json');prior=load(R/'field-tests/upstream-hex-records-2026-11-25/mcp-arc-qualified/reducer.evidence.json');assert current==prior
assert current['evidence_id']=='ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45' and len(current['normalized_result']['instructions'])==2518
h=load(O/'history-verification.json');assert h['status']=='passed' and len(h['snapshots'])==33
package=json.loads(next(line for line in reversed((O/'package.log').read_text().splitlines()) if line.startswith('{"verifier_run"')));assert package['mcpTools']==208 and package['mcpPrompts']==6;lineage(package['verifier_run']);lineages.append(package['verifier_run'])
assert '129 passed' in (O/'tests.log').read_text();assert 'Architecture guards passed' in (O/'check.log').read_text()
report={'status':'passed','runtime_files':len(m['files']),'source_commitments':len(m['source_files']),'qualified_mcp':{'calls':40,'successes':28,'expected_refusals':12},'initial_firmware_capture':{'calls':36,'outcomes_identical':True,'process_lineage':'unavailable inside sandbox; preserved and superseded by qualified capture'},'cli_calls':15,'cli_full_evidence_pairs':5,'historical_hex_full_evidence_pairs':3,'extraction_manifest_file_pairs':4,'verified_readback_files':14,'arc':{'complete_evidence_unchanged':True,'evidence_id':current['evidence_id'],'instruction_count':2518},'historical_snapshots':33,'lineages':lineages,'target_executed':False}
(O/'verification.json').write_text(json.dumps(report,indent=2)+'\n');print(json.dumps({k:v for k,v in report.items() if k!='lineages'}))
