"""Bind both runtime generations to their actual sources and verify public firmware facts."""
from pathlib import Path
import hashlib,json
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
load=lambda p:json.loads(p.read_text())
sha=lambda b:hashlib.sha256(b).hexdigest()
def file_sha(p):
 h=hashlib.sha256()
 with p.open('rb') as f:
  for chunk in iter(lambda:f.read(1024*1024),b''):h.update(chunk)
 return h.hexdigest()
def lineage(receipt):
 p=receipt['process_lineage'];assert p['status']=='verified' and p['descendants']==[]
def error(p):return json.loads(next(x['text'] for x in load(p)['content'] if x['type']=='text'))['error']
def inventory(p):return load(p)['normalized_result']['substeps'][0]['evidence']['normalized_result']
def metadata(p):return next(x for x in inventory(p)['occurrences'] if x['logical_path']=='.')['format_metadata']
versions=[]
for name in ['runtime-manifest.json','runtime-qualified-manifest.json']:
 m=load(OUT/name);base=Path(m['runtime_root']);assert len(m['files'])==1907
 for f in m['files']:p=base/f['path'];assert p.stat().st_size==f['bytes'] and file_sha(p)==f['sha256'],str(p)
 historical=[]
 for f in m['source_files']:
  p=ROOT/f['path']
  if file_sha(p)!=f['sha256']:
   p=OUT/'source-initial'/f['path'];historical.append(f['path'])
  assert file_sha(p)==f['sha256'],str(p)
 versions.append({'manifest':name,'files':len(m['files']),'sources':len(m['source_files']),'archived_sources':historical})
carriers=load(OUT/'fixture-inputs.json');assert carriers['target_executed'] is False
for name,text in carriers['carriers'].items():assert (OUT/'fixtures'/name).read_text()==text
lineages=[];calls={}
for suffix in ['', '-qualified']:
 p=OUT/('mcp-records'+suffix);summary=load(p/'summary.json');assert summary['status']=='completed' and (summary['calls'],summary['successful'],summary['errors'])==(39,33,6);lineage(summary['verifier_run']);lineages.append(summary['verifier_run']);calls[p.name]={'calls':39,'successful':33,'expected_refusals':6}
 for row in load(p/'invocations.json'):
  if row['name']=='open_binary':assert load(p/row['reply'])['structuredContent']['result']['sha256']==file_sha(Path(row['arguments']['path']))
 intel=metadata(p/'intel-inspect.evidence.json');assert (intel['encoding'],intel['data_bytes'],intel['region_count'],intel['start_address'],intel['termination'])==('intel-hex',36,2,0x08000101,'present')
 motorola=metadata(p/'motorola-inspect.evidence.json');assert (motorola['encoding'],motorola['data_bytes'],motorola['header_address'],motorola['header_hex'],motorola['declared_data_record_count'])==('srec',32,0,'484452',2)
 assert metadata(p/'header-address-inspect.evidence.json')['header_address']==0x1234
 late=metadata(p/'late-count-inspect.evidence.json');assert (late['data_record_count'],late['declared_data_record_count'],late['declared_data_record_count_line'])==(2,1,2)
 assert metadata(p/'incomplete-inspect.evidence.json')['termination']=='absent'
 assert 'may be truncated' in ' '.join(inventory(p/'incomplete-inspect.evidence.json')['limitations'])
 assert metadata(p/'empty-inspect.evidence.json')['region_count']==0 and len(inventory(p/'empty-inspect.evidence.json')['occurrences'])==1
 dup=[r for r in inventory(p/'duplicate-inspect.evidence.json')['occurrences'] if r['logical_path']!='.'];assert len(dup)==2 and dup[0]['artifact_id']==dup[1]['artifact_id'];assert dup[0]['format_metadata']['start_address']!=dup[1]['format_metadata']['start_address']
 for label in ['intel-inspect','motorola-inspect','duplicate-inspect']:
  for r in inventory(p/(label+'.evidence.json'))['occurrences']:
   if r['logical_path']!='.':assert r['source_location'] is None and r['format_metadata']['kind']=='hex-record-region'
 for label,resource in [('intel-byte-refusal','file-size'),('intel-run-refusal','memory')]:
  e=error(p/(label+'.reply.json'));assert e['code']=='resource_constraint' and e['details']['resource']==resource;assert 'unchanged' in e['remediation']['action']
 for label in ['bad-checksum-inspect','checksum-bypass-refusal','conflict-inspect','offset-wrap-inspect']:
  e=error(p/(label+'.reply.json'));assert e['code']=='artifact_operation_failed' and e['details']['reason']=='format'
 cli=load(OUT/('cli'+suffix)/'verification.json');assert cli['status']=='passed' and len(cli['records'])==7;assert sum(r.get('exact_mcp_evidence_equal',False) for r in cli['records'])==3;lineage(cli['verifier_run']);lineages.append(cli['verifier_run'])
 for label in ['intel-inspect','motorola-inspect','intel-budget']:assert load(OUT/('cli'+suffix)/(label+'.json'))==load(p/(label+'.evidence.json'))
 readbacks=load(OUT/('extracted-readback'+suffix+'.json'));assert len(readbacks)==5 and sum(len(r['files']) for r in readbacks)==8
 for r in readbacks:
  for f in r['files']:
   b=bytes.fromhex(f['hex']);assert sha(b)==f['sha256'] and len(b)==f['bytes_written']
   if 'intel' in r['label']:assert b in [bytes(range(32)),bytes.fromhex('deadbeef')]
   elif 'motorola' in r['label']:assert b==bytes(range(32))
   else:assert b==bytes([1,2])
 arc=OUT/('mcp-arc'+suffix);s=load(arc/'summary.json');assert (s['calls'],s['successful'],s['errors'])==(4,4,0);lineage(s['verifier_run']);lineages.append(s['verifier_run'])
 prior=load(ROOT/'field-tests/upstream-decompile-export-2026-11-25/mcp-arc/reducer.evidence.json');current=load(arc/'reducer.evidence.json');assert current==prior and len(current['normalized_result']['instructions'])==2518
for label in ['intel-inspect','motorola-inspect','duplicate-inspect','incomplete-inspect','late-count-inspect','header-address-inspect','empty-inspect','intel-budget']:
 assert load(OUT/'mcp-records'/(label+'.evidence.json'))==load(OUT/'mcp-records-qualified'/(label+'.evidence.json'))
h=load(OUT/'history-verification.json');assert h['status']=='passed' and len(h['snapshots'])==32
package=(OUT/'package-qualified.log').read_text();receipt=json.loads(next(line for line in reversed(package.splitlines()) if line.startswith('{"verifier_run"')));assert receipt['mcpTools']==208 and receipt['mcpPrompts']==6;lineage(receipt['verifier_run']);lineages.append(receipt['verifier_run'])
report={'status':'passed','runtimes':versions,'mcp_firmware':calls,'qualified_mcp':{'calls':43,'successes':37,'expected_refusals':6},'cli_calls':7,'cli_full_evidence_pairs':3,'extraction_comparison':'two CLI/MCP manifest/file pairs plus duplicate-payload readback','verified_readback_files':8,'provenance_fix_preserves_all_inspection_evidence':True,'arc':{'complete_evidence_unchanged':True,'evidence_id':current['evidence_id'],'instruction_count':2518},'historical_snapshots':32,'lineages':lineages,'target_executed':False}
(OUT/'verification.json').write_text(json.dumps(report,indent=2)+'\n');print(json.dumps({k:report[k] for k in ['status','qualified_mcp','cli_calls','cli_full_evidence_pairs','verified_readback_files','arc','historical_snapshots']}))
