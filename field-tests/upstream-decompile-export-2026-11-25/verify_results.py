"""Verify export artifacts, immutable runtime/source, parity and prior Arc observations."""
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
runtime=load(OUT/'runtime-manifest.json');runtime_path=Path(runtime['runtime_root'])
for f in runtime['files']:
 p=runtime_path/f['path'];assert p.stat().st_size==f['bytes'] and file_sha(p)==f['sha256'],str(p)
for f in runtime['source_files']:
 p=ROOT/f['path'];assert file_sha(p)==f['sha256'],str(p)
owned=load(OUT/'owned-build.json');assert file_sha(Path(owned['target']))==owned['sha256'];assert file_sha(Path(owned['source']))==owned['source_sha256'];assert owned['target_executed'] is False
counts={};exports={};lineages=[]
for kind,expected in [('owned',(10,9,1)),('arc',(8,8,0))]:
 p=OUT/('mcp-'+kind);summary=load(p/'summary.json');assert summary['status']=='completed'
 assert (summary['calls'],summary['successful'],summary['errors'])==expected
 lineage(summary['verifier_run']);lineages.append(summary['verifier_run'])
 calls=load(p/'invocations.json');assert len(calls)==expected[0];counts[kind]={'calls':expected[0],'successes':expected[1],'expected_refusals':expected[2]}
 retention=load(p/'body-retention.reply.json')['structuredContent']['result'];assert retention['matching_records']==0 and retention['records']==[]
 bundle=load(p/'final.bundle.json');assert not any(r['operation']=='procedure_pseudo_code' for r in bundle['records'])
 cli=load(OUT/('cli-'+kind)/'verification.json');assert cli['status']=='passed' and cli['record']['exact_mcp_evidence_equal'];assert cli['record']['export_files_equal']==4;lineage(cli['verifier_run']);lineages.append(cli['verifier_run'])
 assert load(OUT/('cli-'+kind)/'pair.json')==load(p/'pair.evidence.json')
 for directory,label in [('pair-export','pair'),('pair-export-mcp','pair'),('bulk-export','resume')]:
  e=load(p/(label+'.evidence.json'))['normalized_result'];data=(p/directory/'decompile-index.json').read_bytes();assert sha(data)==e['index_sha256']
  index=json.loads(data);assert index['identity']==e['identity'];assert len(index['functions'])<=e['counts']['unique_procedures']
  functions=[]
  for record in index['functions']:
   if record['status']=='written':
    f=p/directory/record['file']['relative_path'];b=f.read_bytes();assert len(b)==record['file']['bytes'] and sha(b)==record['file']['sha256'];functions.append(str(f.relative_to(OUT)))
  assert not (p/directory/'.rea-export-lock').exists();assert not list((p/directory).glob('.rea-export-stage-*'))
  exports[kind+'/'+directory]={'latest_records':len(index['functions']),'written_files':functions}
original=load(ROOT/'field-tests/upstream-byte-search-2026-11-24/mcp-arc-release/reducer.evidence.json')
current=load(OUT/'mcp-arc/reducer.evidence.json');assert current['normalized_result']==original['normalized_result'];assert len(current['normalized_result']['instructions'])==2518
op=json.loads(json.dumps(original['analysis_profile']['parameters']));np=json.loads(json.dumps(current['analysis_profile']['parameters']));assert op['checkpoint']['source'] is None;assert np['checkpoint']['source']['analysis_complete'] is False
np['checkpoint']['source']=None;assert np==op
assert file_sha(ROOT/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64')=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
old_pages=[]
for f in (ROOT/'field-tests/upstream-native-pages-2026-11-24/mcp-arc-final').glob('arc-batch-code-*.evidence.json'):
 v=load(f)['normalized_result'];old_pages.append((v['view']['offset'],v['item']['text']))
old_pages.sort();offset=0
for start,text in old_pages:assert start==offset;offset+=len(text.encode('utf-16-le'))//2
assert len(old_pages)==16 and offset==63696
index=load(OUT/'mcp-arc/bulk-export/decompile-index.json');body=(OUT/'mcp-arc/bulk-export'/index['functions'][0]['file']['relative_path']).read_text();assert body==''.join(text for _,text in old_pages)
assert load(OUT/'mcp-arc/pair.evidence.json')['normalized_result']['counts']['inventory_rows']==11330
assert load(OUT/'mcp-owned/resume.evidence.json')['normalized_result']['counts']['skipped']==4
history=load(OUT/'history-verification.json');assert history['status']=='passed' and len(history['snapshots'])==31
package=(OUT/'package.log').read_text();assert '"descendants":[]' in package and 'MCP' in package
report={'status':'passed','runtime_files':len(runtime['files']),'source_files':len(runtime['source_files']),'mcp':counts,'cli_exact_evidence_pairs':2,'cli_export_file_pairs':8,'unretained_pseudocode_records':True,'exports':exports,'arc':{'inventory_rows':11330,'pseudocode_utf16_code_units':63696,'prior_pages':16,'normalized_reducer_unchanged':True,'instruction_count':2518,'old_evidence_id':original['evidence_id'],'new_evidence_id':current['evidence_id'],'profile_change':'restored checkpoint generation replaces prior source:null'},'historical_snapshots':31,'lineages':lineages,'target_executed':False}
(OUT/'verification.json').write_text(json.dumps(report,indent=2)+'\n');print(json.dumps({k:report[k] for k in ['status','runtime_files','source_files','mcp','cli_exact_evidence_pairs','historical_snapshots','arc']}))
