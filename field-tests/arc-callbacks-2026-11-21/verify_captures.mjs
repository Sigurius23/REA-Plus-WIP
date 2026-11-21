import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const runtime=path.join(root,'rea-local/.cache/arc-runtime-retained-summary-2026-11-20');
const req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const sha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const digest=bytes=>createHash('sha256').update(bytes).digest('hex');
const json=async f=>JSON.parse(await fs.readFile(f,'utf8'));
const sessions=[];
for(const dir of ['mcp','mcp-storage','mcp-finish','mcp-leaf','mcp-io']){
 const base=path.join(out,dir),summary=await json(path.join(base,'summary.json'));
 const failed=dir==='mcp-finish';assert.equal(summary.status,failed?'failed':'completed');
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 if(failed){const fatal=await json(path.join(base,'fatal.json'));assert.equal(fatal.name,'AssertionError');assert.equal(fatal.message,'Duplicate call label: function-0x100d989e4-read_function_instructions');}
 const calls=await json(path.join(base,'invocations.json'));assert.equal(calls.length,summary.calls);
 assert.equal(calls.filter(c=>!c.is_error&&!c.thrown).length,summary.successful);
 assert.equal(calls.filter(c=>c.is_error||c.thrown).length,summary.errors);
 const catalog=await json(path.join(base,'catalog.json')),ajv=new Ajv2020({strict:false,validateFormats:false}),knownSchemas=new Map();
 const validate=s=>{assert.ok(ajv.validateSchema(s));const id=typeof s.$id==='string'?s.$id:null;if(id&&knownSchemas.has(id)){const old=knownSchemas.get(id);assert.deepEqual(s,old.schema);return old.fn;}const fn=ajv.compile(s);if(id)knownSchemas.set(id,{schema:s,fn});return fn;};
 const names=await fs.readdir(base);const bundleName=names.includes('final.bundle.json')?'final.bundle.json':names.filter(x=>/^phase-\d+\.bundle\.json$/.test(x)).sort((a,b)=>Number(a.match(/\d+/)[0])-Number(b.match(/\d+/)[0])).at(-1);
 assert.ok(bundleName);const bundleFile=path.join(base,bundleName),bundle=await json(bundleFile),records=new Map();
 for(const r of bundle.records){parseEvidence(r);assert.equal(r.subject?.digest.sha256,sha);records.set(r.evidence_id,r);}
 const labels=new Set(),unbundled=[],retainedErrors=[];
 for(const [index,c] of calls.entries()){
  assert.ok(!labels.has(c.reply),c.reply);labels.add(c.reply);
  const advertised=catalog.find(x=>x.name===c.name);assert.ok(advertised);assert.ok(validate(advertised.inputSchema)(c.arguments));
  assert.equal(c.thrown,null);const reply=await json(path.join(base,c.reply));assert.equal(reply.isError===true,c.is_error);
  if(c.is_error){retainedErrors.push({index,name:c.name,arguments:c.arguments,reply:c.reply});continue;}
  const value=reply.structuredContent;assert.ok(value);assert.ok(validate(advertised.outputSchema)(value));toolContract(c.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),value);
  if(c.evidence_id){
   const evidenceFile=c.reply.replace(/\.reply\.json$/,'.evidence.json'),saved=await json(path.join(base,evidenceFile));parseEvidence(saved);assert.deepEqual(saved,value);assert.equal(saved.evidence_id,c.evidence_id);assert.equal(saved.subject?.digest.sha256,sha);
   if(c.name==='analyze_function'&&c.arguments.detail==='summary'){assert.equal(saved.operation,'inspect_analysis_view');assert.equal(saved.normalized_result.parent_operation,'analyze_function');assert.ok(records.has(saved.normalized_result.parent_evidence_id));}else assert.equal(saved.operation,c.name);
   if(records.has(c.evidence_id))assert.deepEqual(records.get(c.evidence_id),saved);else{assert.ok(failed);unbundled.push({index,evidence_file:evidenceFile,evidence_id:c.evidence_id,sha256:digest(await fs.readFile(path.join(base,evidenceFile)))});}
  }
 }
 if(!failed){assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);assert.ok(calls.slice(-2).every(c=>!c.is_error&&!c.thrown));}
 else assert.equal(unbundled.length,6);
 sessions.push({directory:dir,status:summary.status,calls:summary.calls,successful:summary.successful,errors:summary.errors,bundle:bundleName,bundle_sha256:digest(await fs.readFile(bundleFile)),unique_records:records.size,verified_empty_lineage:true,explicit_close_twice:!failed,per_call_label_collisions:0,records_after_last_bundle:unbundled,retained_errors:retainedErrors});
}
const result={status:'passed',target_sha256:sha,sessions,total_calls:sessions.reduce((n,s)=>n+s.calls,0),successful_calls:sessions.reduce((n,s)=>n+s.successful,0),retained_errors:sessions.reduce((n,s)=>n+s.errors,0),failed_orchestration_sessions:1,limits:['Public reply success is not feature or runtime completeness.','The finish session stopped before invoking a duplicated label; all 71 completed calls remain saved. Six records after its last bundle are independently retained and authenticated through their original public replies.','The failed session has verified transport cleanup, without explicit close calls; the other four sessions close twice.','A selected interior branch target was queried as a procedure and rejected; that admission error is retained, not a provider bug.']};
await fs.writeFile(path.join(out,'capture-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,calls:result.total_calls,successful:result.successful_calls,retained_errors:result.retained_errors,sessions:sessions.length,verified_empty_lineages:sessions.length,failed_orchestration_sessions:result.failed_orchestration_sessions}));
