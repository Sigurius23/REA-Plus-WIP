import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const root=path.dirname(fileURLToPath(import.meta.url));
const pkg=path.resolve(root,'../../../../rea-local');
const req=createRequire(path.join(pkg,'package.json'));
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {toolContract}=await import(pathToFileURL(path.join(pkg,'dist/contracts/toolContracts.js')));
const {parseEvidence}=await import(pathToFileURL(path.join(pkg,'dist/domain/evidence.js')));
const {parseEvidenceBundle}=await import(pathToFileURL(path.join(pkg,'dist/domain/evidenceBundle.js')));
const read=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const sha=bytes=>createHash('sha256').update(bytes).digest('hex');
const sourceSha=sha(await fs.readFile(path.join(root,'Fixture.swift')));
const runs=[];
for(const name of ['public','public-export','public-nodebug']){
 const dir=path.join(root,name);
 const catalog=await read(path.join(dir,'catalog.json'));
 const calls=await read(path.join(dir,'invocations.json'));
 const ajv=new Ajv2020({strict:false,validateFormats:false});
 let errors=0;
 for(const call of calls){
  const advertised=catalog.find(t=>t.name===call.name);assert.ok(advertised);
  assert.ok(ajv.validate(advertised.inputSchema,call.arguments),JSON.stringify(ajv.errors));
  assert.equal(call.thrown,null);
  const reply=await read(path.join(dir,call.reply));
  if(reply.isError){
   const error=JSON.parse(reply.content.find(c=>c.type==='text').text).error;
   assert.equal(call.name,'analyze_function');assert.equal(error.code,'resource_constraint');assert.equal(error.details.resource,'transport');errors++;continue;
  }
  const value=reply.structuredContent;
  assert.ok(ajv.validate(advertised.outputSchema,value),JSON.stringify(ajv.errors));
  toolContract(call.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(c=>c.type==='text').text),value);
  if(value.evidence_id)parseEvidence(value);
 }
 const summary=await read(path.join(dir,'summary.json'));
 assert.equal(summary.calls,calls.length);assert.equal(summary.errors,errors);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');
 assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 const overview=parseEvidence(await read(path.join(dir,'overview.evidence.json')));
 const flags=overview.limitations.find(l=>l.startsWith('Ghidra auto-analysis state:'));
 assert.ok(flags.includes('analysis_complete=true; analysis_timed_out=false'));
 const input=await read(path.join(dir,'inputs.json'));
 assert.equal(input.environment.REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS,undefined);
 assert.equal(input.environment.REA_GHIDRA_SEED_FILE,undefined);
 runs.push({directory:name,calls:calls.length,successful:calls.length-errors,expected_transport_errors:errors,recorder_status:summary.status,analysis_flags:flags,verifier_run:summary.verifier_run});
}
const variants=[];
for(const [dirName,buildFile] of [['public-export','build-receipt.json'],['public-nodebug','build-nodebug-receipt.json']]){
 const build=await read(path.join(root,buildFile));assert.equal(build.source_sha256,sourceSha);assert.equal(build.exit_code,0);
 const file=path.join(root,dirName,'evidence-bundle.json');
 const bundle=parseEvidenceBundle(await read(file));
 const evidence=bundle.records.find(r=>r.operation==='analyze_function');assert.ok(evidence);
 assert.equal(evidence.subject.digest.sha256,build.compiled_artifact.sha256);
 const n=evidence.normalized_result;
 const ranges=n.procedure.body.ranges.map(r=>[BigInt(r.start),BigInt(r.end)]);
 const tables=n.native_api.jump_tables.map(t=>({dispatch_address:t.dispatch_address,data_sources:t.data_sources,mappings:t.mappings.length,outside_body:t.mappings.filter(m=>!ranges.some(([a,z])=>a<=BigInt(m.target_address)&&BigInt(m.target_address)<=z))}));
 variants.push({directory:dirName,build_receipt:buildFile,compiled_artifact:build.compiled_artifact,evidence_id:evidence.evidence_id,bundle_bytes:(await fs.stat(file)).size,bundle_sha256:sha(await fs.readFile(file)),bundle_records:bundle.records.length,procedure:n.procedure,table_summaries:tables,all_recovered_targets_inside_body:tables.every(t=>t.outside_body.length===0),warnings:[...new Set(n.pseudocode.split('\n').filter(l=>l.includes('WARNING')).map(l=>l.trim()))],value_flow_truncated:n.native_value_flow.truncated});
}
const reproduced=variants.some(v=>!v.all_recovered_targets_inside_body);
const receipt={status:'passed',result:reproduced?'reproduced-targets-outside-body':'bounded-non-reproduction',source_sha256:sourceSha,scope:'One owned four-group/40-inner-case nested enum URL fixture, same source compiled with and without debug information. Public default-complete Ghidra; no case seeds, target or fixture execution.',runs,variants,caveats:['First recorder closed on an expected transport refusal before export. Exact failure and verified cleanup are retained under public/; same fixture was recaptured with a nonfatal refusal and real export under public-export/.','All reported body/mapping comparisons concern this exact installed compiler and provider, not Arc completeness or every nested-enum layout.','The fixture still reports jump-table sanity/truncation and decompiler warnings; body inclusion is not proof of exact source-level case mapping or executable correctness.','Compiled libraries remain at owned /private/tmp paths and are not publication artifacts. Rebuilding identical inputs need not reproduce Mach-O UUID/digests byte-for-byte.']};
await fs.writeFile(path.join(root,'verification-receipt.json'),JSON.stringify(receipt,null,2)+'\n');
console.log(JSON.stringify({status:receipt.status,result:receipt.result,calls:runs.reduce((a,r)=>a+r.calls,0),variants:variants.map(v=>({directory:v.directory,evidence_id:v.evidence_id,body_bytes:v.procedure.body.total_bytes,tables:v.table_summaries.length,all_targets_inside_body:v.all_recovered_targets_inside_body}))}));
