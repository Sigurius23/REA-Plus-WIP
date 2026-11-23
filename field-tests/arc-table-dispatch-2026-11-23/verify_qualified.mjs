import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const sha=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-final-manifest.json')),runtime=manifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const summary=await json(path.join(out,'mcp-final/summary.json'));
assert.equal(summary.status,'completed');assert.equal(summary.calls,14);assert.equal(summary.successful,12);assert.equal(summary.errors,2);
assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
for(const r of manifest.files){const b=await fs.readFile(path.join(runtime,r.path));assert.equal(b.length,r.bytes);assert.equal(sha(b),r.sha256,r.path);}
for(const r of manifest.source_files)assert.equal(sha(await fs.readFile(path.join(root,r.path))),r.sha256,r.path);
const baseline=await json(path.join(out,'runtime-baseline-manifest.json'));
for(const r of baseline.files){const b=await fs.readFile(path.join(baseline.runtime_root,r.path));assert.equal(b.length,r.bytes);assert.equal(sha(b),r.sha256,r.path);}
const fixture=await json(path.join(out,'fixture-build.json'));assert.equal(sha(await fs.readFile(fixture.source)),fixture.source_sha256);assert.equal(sha(await fs.readFile(fixture.artifact)),fixture.artifact_sha256);
const plan=await json(path.join(out,'plan-final.json')),calls=await json(path.join(out,'mcp-final/invocations.json')),verified=[];
const artifacts=new Map();
const evidence=async label=>json(path.join(out,'mcp-final',label+'.evidence.json'));
for(const c of calls){
 const step=plan.steps.find(s=>s.label+'.reply.json'===c.reply);assert.ok(step);
 if(c.is_error){assert.ok(['owned-file-limit','owned-bad-format'].includes(step.label));continue;}
 if(c.name!=='inspect_native_table_dispatch')continue;
 const e=await evidence(step.label);parseEvidence(e);toolContract(c.name).outputSchema.parse(e);
 const r=e.normalized_result;assert.equal(e.confidence,'derived');assert.equal(r.artifact.path,step.arguments.path);assert.equal(r.artifact.sha256,e.subject.digest.sha256);assert.deepEqual(r.requested_indices,step.arguments.indices);
 assert.equal(r.typed_domain,null);assert.equal(r.all_entry_domain_proved,false);assert.equal(r.program_mutations,false);
 let bytes=artifacts.get(r.artifact.path);if(!bytes){bytes=await fs.readFile(r.artifact.path);artifacts.set(r.artifact.path,bytes);assert.equal(sha(bytes),r.artifact.sha256);assert.equal(bytes.length,r.artifact.bytes);}
 const source=[...r.prefix.instructions,...(r.invocation?.preparation??[]),...(r.invocation?.call_instruction?[r.invocation.call_instruction]:[]),...(r.invocation?.known_bypass?[r.invocation.known_bypass]:[])];
 for(const s of source)assert.equal(bytes.subarray(s.file_offset,s.file_offset+4).toString('hex'),s.bytes_hex);
 for(const entry of r.entries)if(entry.entry_file_offset!==null){const at=entry.entry_file_offset;assert.equal(bytes.subarray(at,at+2).toString('hex'),entry.entry_bytes_hex);assert.equal(bytes.readUInt16LE(at),entry.entry_value);if(entry.target_address!==null)assert.equal(BigInt(entry.target_address),BigInt(r.table.target_anchor)+BigInt(entry.entry_value*4));}
 const proof={artifact:r.artifact,entry_address:r.entry_address,requested_indices:r.requested_indices,prefix:r.prefix,table:r.table,entries:r.entries,invocation:r.invocation,assumptions:r.assumptions,limitations:r.limitations};
 assert.equal(sha(JSON.stringify(proof)),r.observation_id);
 verified.push({label:step.label,evidence_id:e.evidence_id,observation_id:r.observation_id});
}
const direct=(await evidence('owned-direct')).normalized_result;assert.deepEqual(direct.requested_indices,[1,0,1,65535]);assert.deepEqual(direct.entries.map(e=>e.target_address),['0x100000338','0x100000330','0x100000338',null]);assert.equal(direct.invocation.mapping_status,'conditional');assert.equal(direct.invocation.mapping_index,1);assert.equal(direct.invocation.branch_scan.scope,'immutable-__text-only');
for(const label of ['owned-indirect','owned-bypass','owned-different','owned-unselected','owned-unmapped-call']){const r=(await evidence(label)).normalized_result;assert.equal(r.invocation.mapping_status,'unresolved');assert.equal(r.invocation.mapping_index,null);}
assert.equal((await evidence('owned-bypass')).normalized_result.invocation.known_bypass.address,'0x100000378');
assert.equal((await evidence('owned-budget')).normalized_result.prefix.stop.kind,'instruction-budget');
assert.equal((await evidence('owned-unsupported')).normalized_result.prefix.stop.kind,'unsupported-instruction');
const arc=(await evidence('arc-selected-indirect')).normalized_result;assert.equal(arc.artifact.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');assert.equal(arc.prefix.instructions.length,14);assert.equal(arc.table.address,'0x1036db410');assert.equal(arc.table.target_anchor,'0x1005aa61c');assert.deepEqual(arc.entries.map(e=>[e.index,e.entry_bytes_hex,e.target_address]),[[49,'b303','0x1005ab4e8'],[50,'8600','0x1005aa834']]);assert.equal(arc.invocation.link,'indirect-unresolved');assert.equal(arc.invocation.input_literal,'0x31');assert.equal(arc.invocation.effective_index,49);assert.equal(arc.invocation.mapping_status,'unresolved');assert.equal(arc.invocation.mapping_index,null);
const adapter=(await evidence('arc-direct-input-unknown')).normalized_result;assert.equal(adapter.invocation.link,'direct-to-entry');assert.equal(adapter.invocation.input_literal,null);assert.equal(adapter.invocation.mapping_status,'unresolved');
const budgetReply=await json(path.join(out,'mcp-final/owned-file-limit.reply.json'));const budget=JSON.parse(budgetReply.content.find(x=>x.type==='text').text).error;assert.equal(budget.retryable,false);assert.match(budget.remediation.action,/unchanged max_file_bytes/);assert.deepEqual(budget.details.reported_limits,{max_file_bytes:32});
const bundle=parseEvidenceBundle(await json(path.join(out,'mcp-final/final.bundle.json')));assert.equal(bundle.records.length,verified.length);for(const row of verified)assert.ok(bundle.records.some(e=>e.evidence_id===row.evidence_id));
const cli=await json(path.join(out,'cli-final-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,7);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const report={status:'passed',runtime_files:manifest.files.length,source_files:manifest.source_files.length,baseline_runtime_files:baseline.files.length,public_mcp_calls:summary.calls,successful_mcp_calls:summary.successful,expected_error_calls:summary.errors,exact_cli_mcp_pairs:cli.records.length,retained_records:bundle.records.length,source_bytes_verified:true,target_executed:false,typed_domain_inference:false,indirect_arc_link:'unresolved',verified};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(report,null,2)+'\n');console.log(JSON.stringify({status:report.status,records:verified.length,runtime_files:report.runtime_files}));
