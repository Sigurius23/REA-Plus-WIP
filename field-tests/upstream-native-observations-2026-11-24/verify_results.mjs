import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const qualified=await json(out+'/runtime-final-manifest.json'),pkg=qualified.runtime_root;
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(pkg+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const runtimes=[];
for(const [name,initial] of [['runtime-manifest.json',true],['runtime-qualified-manifest.json',false],['runtime-final-manifest.json',false]]){
 const m=await json(out+'/'+name);
 for(const f of m.files){const b=await fs.readFile(path.join(m.runtime_root,f.path));assert.equal(b.length,f.bytes);assert.equal(sha(b),f.sha256,f.path);}
 for(const f of m.source_files){const sourceRoot=initial?out+'/source-initial':name==='runtime-qualified-manifest.json'&&f.path==='rea-local/src/cli/nativeObservationCommands.ts'?out+'/source-qualified':root;const b=await fs.readFile(path.join(sourceRoot,f.path));assert.equal(sha(b),f.sha256,f.path);}
 runtimes.push({manifest:name,files:m.files.length,sources:m.source_files.length});
}
const counts={},lineages=[];
for(const dir of ['mcp-owned','mcp-arc','mcp-portable','mcp-owned-qualified','mcp-arc-qualified','mcp-portable-qualified','mcp-arc-final']){
 const summary=await json(out+'/'+dir+'/summary.json');assert.equal(summary.status,'completed');
 const calls=await json(out+'/'+dir+'/invocations.json');assert.equal(calls.length,summary.calls);assert.equal(summary.errors,dir.includes('portable')?1:0);
 for(const row of calls){assert.equal(row.thrown,null);const reply=await json(out+'/'+dir+'/'+row.reply);
  if(reply.isError){assert.equal(dir.includes('portable'),true);assert.equal(row.name,'inspect_analysis_view');assert.equal(JSON.parse(reply.content.find(x=>x.type==='text').text).error.code,'invalid_request');continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);
  assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),reply.structuredContent);
  if(reply.structuredContent.evidence_id)parseEvidence(reply.structuredContent);
 }
 counts[dir]={calls:summary.calls,successes:summary.successful,expected_refusals:summary.errors};
 const lineage=summary.verifier_run.process_lineage;
 if(dir!=='mcp-portable'){assert.equal(lineage.status,'verified');assert.deepEqual(lineage.descendants,[]);}
 lineages.push({directory:dir,...summary.verifier_run});
}
const observations={};
for(const kind of ['owned','arc']){
 const dir=out+'/mcp-'+kind+'-qualified',bundle=parseEvidenceBundle(await json(dir+'/final.bundle.json'));
 for(const label of ['address','callees','callers','containment','xrefs',...(kind==='owned'?['graph']:[])]){
  const parent=parseEvidence(await json(dir+'/'+label+'-complete.evidence.json'));
  assert.ok(bundle.records.some(r=>r.evidence_id===parent.evidence_id));
  const summary=parseEvidence(await json(dir+'/'+label+'-summary.evidence.json')).normalized_result;
  assert.equal(summary.parent_evidence_id,parent.evidence_id);assert.deepEqual(summary.source_parameters,parent.parameters);
  assert.equal(summary.source_context.evidence_limitation_count,parent.limitations.length);
  const overview=(await json(dir+'/'+label+'-overview.evidence.json')).normalized_result;
  assert.deepEqual(overview.source_context,summary.source_context);
  assert.deepEqual(overview.items.rows[0].record,{subject:parent.subject,provider:parent.provider,authority:parent.authority,environment:parent.environment,analysis_profile_digest:parent.analysis_profile?.digest??null});
  const profile=(await json(dir+'/'+label+'-profile.evidence.json')).normalized_result;
  assert.deepEqual(profile.items.rows[0].record,parent.analysis_profile);
  const first=(await json(dir+'/'+label+'-caveats-first.evidence.json')).normalized_result,rest=(await json(dir+'/'+label+'-caveats-rest.evidence.json')).normalized_result;
  assert.equal(rest.coverage.exhausted,true);assert.deepEqual([...first.items.rows,...rest.items.rows].map(r=>r.text),parent.limitations);
  const page=(await json(dir+'/'+label+'-page.evidence.json')).normalized_result;
  assert.deepEqual(page.items.rows,summary.items.rows.slice(0,1));
  if(['callees','callers','xrefs'].includes(label))assert.deepEqual(summary.items.rows,parent.normalized_result.slice(0,64).map((address,source_index)=>({source_index,address})));
  observations[kind+'-'+label]=summary.summary.observations;
 }
 const outside=(await json(dir+'/outside.evidence.json')).normalized_result;assert.equal(outside.found,false);assert.equal(outside.reason,'outside_segments');assert.equal(outside.procedure,null);
}
const arc=await json(out+'/mcp-arc-qualified/callees-complete.evidence.json'),summary=(await json(out+'/mcp-arc-qualified/callees-summary.evidence.json')).normalized_result,tail=(await json(out+'/mcp-portable-qualified/callees-tail.evidence.json')).normalized_result;
assert.equal(tail.parent_evidence_id,arc.evidence_id);assert.equal(tail.coverage.total,70);assert.equal(tail.coverage.exhausted,true);
assert.deepEqual([...summary.items.rows,...tail.items.rows],arc.normalized_result.map((address,source_index)=>({source_index,address})));
const reducer=await json(out+'/mcp-arc-qualified/arc-reducer.evidence.json'),oldReducer=await json(root+'/field-tests/upstream-native-pages-2026-11-24/mcp-arc-qualified/arc-reducer-instructions.evidence.json');
assert.deepEqual(reducer,oldReducer);assert.equal(reducer.subject.digest.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
assert.deepEqual(await json(out+'/mcp-arc-final/arc-reducer.evidence.json'),reducer);assert.deepEqual(await json(out+'/mcp-arc-final/callees-summary.evidence.json'),await json(out+'/mcp-arc-qualified/callees-summary.evidence.json'));
const before=await json(out+'/runtime-qualified-manifest.json'), after=await json(out+'/runtime-final-manifest.json');const changed=after.files.filter(f=>before.files.find(p=>p.path===f.path)?.sha256!==f.sha256).map(f=>f.path);assert.ok(changed.length>0);assert.ok(changed.every(p=>p.startsWith('dist/cli/nativeObservationCommands.')));
const fixture=await json(out+'/owned-build.json');assert.equal(sha(await fs.readFile(fixture.source)),fixture.source_sha256);assert.equal(sha(await fs.readFile(fixture.target)),fixture.sha256);
assert.equal(sha(await fs.readFile(reducer.subject.local_path)),reducer.subject.digest.sha256);
const cli=[];
for(const dir of ['cli','cli-qualified','cli-final']){const receipt=await json(out+'/'+dir+'/verification.json');assert.equal(receipt.status,'passed');assert.equal(receipt.records.filter(r=>r.exact_mcp_evidence_equal).length,7);assert.equal(receipt.records.filter(r=>r.expected_error).length,dir==='cli-final'?3:2);assert.equal(receipt.verifier_run.process_lineage.status,'verified');assert.deepEqual(receipt.verifier_run.process_lineage.descendants,[]);cli.push({directory:dir,calls:receipt.records.length,exact_pairs:7});lineages.push({directory:dir,...receipt.verifier_run});}
for(const name of ['package-initial.log','package-qualified.log','package-final.log']){const text=await fs.readFile(out+'/'+name,'utf8'),receipt=JSON.parse(text.trim().split('\n').at(-1));assert.equal(receipt.mcpTools,206);assert.equal(receipt.mcpPrompts,6);assert.equal(receipt.evidenceMcp,true);assert.equal(receipt.verifier_run.process_lineage.status,'verified');assert.deepEqual(receipt.verifier_run.process_lineage.descendants,[]);lineages.push({directory:name,...receipt.verifier_run});}
const history=await json(out+'/history-verification.json');assert.equal(history.status,'passed');assert.equal(history.snapshots.length,29);
const result={status:'passed',runtimes,counts,cli,observations,arc_reducer_evidence_id:reducer.evidence_id,arc_callees_reconstructed:70,historical_snapshots:history.snapshots.length,lineages,initial_sandbox_lineage_unknown:'mcp-portable could not inspect OS lineage; the qualified repeat verifies an empty lineage',target_executed:false};
await fs.writeFile(out+'/verification-qualified.json',JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,counts,cli,historical_snapshots:29}));
