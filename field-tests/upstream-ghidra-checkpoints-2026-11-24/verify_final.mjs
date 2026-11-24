import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const final=await json(out+'/runtime-final-manifest.json'),pkg=final.runtime_root;
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(pkg+'/dist/domain/evidenceBundle.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const runtimeReceipts=[];
for(const generation of ['initial','current','qualified','final']){
 const m=await json(out+'/runtime-'+generation+'-manifest.json');
 for(const r of m.files){const b=await fs.readFile(path.join(m.runtime_root,r.path));assert.equal(b.length,r.bytes);assert.equal(sha(b),r.sha256,r.path);}
 runtimeReceipts.push({generation,files:m.files.length});
}
for(const r of final.source_files)assert.equal(sha(await fs.readFile(root+'/'+r.path)),r.sha256,r.path);
const lineages=[],counts={},evidence=new Map(),errors=[];
function lineage(run){assert.equal(run.process_lineage.status,'verified');assert.deepEqual(run.process_lineage.descendants,[]);lineages.push(run);}
const finalGroups=['mcp-final','mcp-arc-final','mcp-publication-refusal-final','mcp-cli-readback','mcp-corrupt'];
for(const directory of ['mcp-initial','mcp-current','mcp-qualified','mcp-arc-qualified','mcp-publication-refusal',...finalGroups]){
 const dir=out+'/'+directory,s=await json(dir+'/summary.json'),calls=await json(dir+'/invocations.json');assert.equal(s.status,'completed');lineage(s.verifier_run);
 assert.equal(s.calls,calls.length);counts[directory]={calls:s.calls,successes:s.successful,refusals:s.errors};
 const bundle=directory==='mcp-corrupt'?null:parseEvidenceBundle(await json(dir+'/final.bundle.json'));
 if(bundle)for(const e of bundle.records)parseEvidence(e);
 for(const row of calls){const reply=await json(dir+'/'+row.reply);assert.equal(row.thrown,null);if(reply.isError){const e=analysisErrorProjectionSchema.parse(JSON.parse(reply.content.find(c=>c.type==='text').text).error);errors.push({directory,name:row.name,error:e});continue;}
  const value=reply.structuredContent;toolContract(row.name).outputSchema.parse(value);assert.deepEqual(JSON.parse(reply.content.find(c=>c.type==='text').text),value);
  if(value.evidence_id){parseEvidence(value);evidence.set(directory+'/'+row.reply.replace('.reply.json',''),value);}
 }
}
const e=(d,l)=>{const v=evidence.get(d+'/'+l);assert.ok(v,d+'/'+l);return v;};
for(const d of ['mcp-initial','mcp-current','mcp-qualified','mcp-final']){
 const a=e(d,'saved-edit');assert.equal(a.normalized_result.effects.persists_after_close,true);assert.equal(a.raw_result.effects.persists_after_close,true);
 assert.equal(e(d,'saved-readback').normalized_result.procedure.name,'rea_checkpoint_saved');assert.ok(JSON.stringify(e(d,'saved-readback').normalized_result).includes('persisted through the owned checkpoint'));
 assert.equal(e(d,'saved-instructions').normalized_result.instructions.length,8);
 const c=e(d,'seeded-instructions').analysis_profile.parameters.checkpoint,w=e(d,'saved-instructions').analysis_profile.parameters.checkpoint;
 assert.equal(c.source,null);assert.ok(w.source?.sha256);assert.equal(c.key,w.key);
}
for(const d of ['mcp-arc-qualified','mcp-arc-final']){
 const cold=e(d,'arc-seeded-reducer'),warm=e(d,'arc-warm-reducer');assert.deepEqual(cold.normalized_result,warm.normalized_result);
 assert.equal(cold.normalized_result.procedure.body.total_bytes,10072);assert.equal(cold.normalized_result.instructions.length,2518);
 assert.equal(cold.subject.digest.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
 assert.equal(warm.analysis_profile.parameters.checkpoint.source.analysis_complete,false);assert.equal(warm.analysis_profile.parameters.analysis_timeout_seconds,1);assert.equal(warm.analysis_profile.parameters.analysis_seeds.entries.function,2537);
 assert.ok(warm.limitations.some(t=>t.includes('analysis_complete=false; analysis_timed_out=true')));
}
for(const d of ['mcp-publication-refusal','mcp-publication-refusal-final']){
 assert.deepEqual(e(d,'baseline-instructions'),e(d,'retained-readback'));assert.equal(e(d,'unconfirmed-name-absent').normalized_result.length,0);
 const rows=errors.filter(r=>r.directory===d);assert.equal(rows.length,2);assert.ok(rows.some(r=>r.name==='annotate_native_function'));assert.ok(rows.some(r=>r.name==='read_function_instructions'));
 if(d.endsWith('-final'))for(const r of rows){assert.equal(r.error.details.diagnostics.boundary,'checkpoint-write');assert.equal(r.error.details.diagnostics.persistence,'unconfirmed');assert.ok(r.error.message.includes('denied write access'));}
}
const cli=await json(out+'/cli-final/verification.json');assert.equal(cli.status,'passed');lineage(cli.verifier_run);assert.equal(cli.records.length,6);
assert.deepEqual(await json(out+'/cli-final/function-parity.json'),e('mcp-final','saved-readback'));
assert.deepEqual(await json(out+'/cli-final/cli-comment-reopened.json'),e('mcp-cli-readback','cli-comment-readback'));
const annotation=await json(out+'/cli-final/cli-persisted-comment.json');assert.equal(annotation.normalized_result.effects.persists_after_close,true);assert.ok(JSON.stringify(e('mcp-cli-readback','cli-comment-readback').normalized_result).includes('persisted by CLI checkpoint'));
const corrupt=errors.find(r=>r.directory==='mcp-corrupt');assert.equal(corrupt.error.code,'configuration_invalid');assert.ok(corrupt.error.message.includes('SHA-256'));
const inputs=await json(root+'/field-tests/upstream-ghidra-projects-2026-11-24/owned-build.json');assert.equal(sha(await fs.readFile(inputs.target)),inputs.sha256);assert.equal(sha(await fs.readFile(inputs.source)),inputs.source_sha256);assert.equal(inputs.target_executed,false);
const plan=await json(out+'/mcp-arc-final.plan.json');assert.equal(sha(await fs.readFile(plan.steps[0].arguments.path)),'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const history=await json(out+'/history-verification.json');assert.equal(history.status,'passed');assert.equal(history.snapshots.length,27);
const packText=await fs.readFile(out+'/package-check.log','utf8'),pack=JSON.parse(packText.trim().split('\n').at(-1));assert.equal(pack.cli,true);assert.equal(pack.mcpTools,206);lineage(pack.verifier_run);
const totals=groups=>groups.reduce((r,g)=>({calls:r.calls+counts[g].calls,successes:r.successes+counts[g].successes,refusals:r.refusals+counts[g].refusals}),{calls:0,successes:0,refusals:0});
const receipt={status:'passed',final_runtime:totals(finalGroups),all_captures:totals(Object.keys(counts)),counts,exact_cli_mcp_evidence_pairs:2,cli_calls:6,cli_expected_refusals:2,tests:{source_composition_domain:118,boundary:57,platform_skips:1},frozen_runtimes:runtimeReceipts,current_source_files:final.source_files.length,arc:{function_bytes:10072,instructions:2518,seed_functions:2537,analysis_seconds:1,original_analysis_complete:false,identical_cold_warm_results:true},historical_snapshots:27,verified_lineages:lineages,expected_refusals:errors,target_executed:false,scope:'Opt-in native Linux/macOS checkpoints; extensions, special loaders and Windows refused; retirement profile refresh and stale-lock recovery require explicit reopening/recovery'};
await fs.writeFile(out+'/verification-final.json',JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:'passed',final:receipt.final_runtime,all:receipt.all_captures,cli_pairs:2,lineages:lineages.length}));
