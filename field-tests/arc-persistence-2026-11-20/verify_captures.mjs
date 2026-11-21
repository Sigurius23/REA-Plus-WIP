import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url));
const root=path.resolve(out,'../..');
const runtime=path.join(root,'rea-local/.cache/arc-runtime-retained-summary-2026-11-20');
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const sha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const digest=bytes=>createHash('sha256').update(bytes).digest('hex');
const json=async file=>JSON.parse(await fs.readFile(file,'utf8'));
const directories=process.argv.slice(2);
assert.ok(directories.length);
const sessions=[];
for(const dir of directories){
 const base=path.join(out,dir),summary=await json(path.join(base,'summary.json'));
 assert.equal(summary.status,'completed');
 assert.equal(summary.verifier_run.process_lineage.status,'verified');
 assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 const calls=await json(path.join(base,'invocations.json'));
 assert.equal(calls.length,summary.calls);
 const names=await fs.readdir(base);
 const bundleName=names.includes('final.bundle.json')?'final.bundle.json':names.filter(x=>/^phase-\d+\.bundle\.json$/.test(x)).sort((a,b)=>Number(a.match(/\d+/)[0])-Number(b.match(/\d+/)[0])).at(-1);
 assert.ok(bundleName);
 const bundleFile=path.join(base,bundleName),bundle=await json(bundleFile);
 const records=new Map();
 for(const record of bundle.records){parseEvidence(record);assert.equal(record.subject?.digest.sha256,sha);records.set(record.evidence_id,record);}
 const recoveries=[];
 for(const [index,call] of calls.entries()){
  if(!call.evidence_id)continue;
  const expected=records.get(call.evidence_id);assert.ok(expected,call.evidence_id);
  if(call.name==='analyze_function'&&call.arguments.detail==='summary'){assert.equal(expected.operation,'inspect_analysis_view');assert.equal(expected.normalized_result.parent_operation,'analyze_function');assert.ok(records.has(expected.normalized_result.parent_evidence_id));}
  else assert.equal(expected.operation,call.name);
  const evidenceFile=call.reply.replace(/\.reply\.json$/,'.evidence.json');
  const saved=await json(path.join(base,evidenceFile));parseEvidence(saved);
  if(saved.evidence_id!==call.evidence_id){
   // V1 reused two labels. The immutable full bundle still retains each
   // original Evidence record. Recover to new names; never alter the journal.
   const relative=`recovered-calls/call-${String(index).padStart(4,'0')}.evidence.json`;
   await fs.mkdir(path.join(base,'recovered-calls'),{recursive:true});
   const content=JSON.stringify(expected,null,2)+'\n';
   try{assert.equal(await fs.readFile(path.join(base,relative),'utf8'),content);}catch(error){if(error.code!=='ENOENT')throw error;await fs.writeFile(path.join(base,relative),content,{flag:'wx'});}
   recoveries.push({index,original_file:evidenceFile,expected_evidence_id:call.evidence_id,overwriting_evidence_id:saved.evidence_id,recovered_file:relative,sha256:digest(content)});
  }
 }
 sessions.push({directory:dir,calls:summary.calls,successful:summary.successful,errors:summary.errors,bundle:bundleName,bundle_sha256:digest(await fs.readFile(bundleFile)),unique_records:records.size,verified_empty_lineage:true,per_call_label_collisions:recoveries});
}
const result={status:'passed',target_sha256:sha,sessions,total_calls:sessions.reduce((a,x)=>a+x.calls,0),successful_calls:sessions.reduce((a,x)=>a+x.successful,0),expected_or_retained_errors:sessions.reduce((a,x)=>a+x.errors,0),limits:['Provider failures remain retained; successful transport is not feature completeness.','The expired second session used transport cleanup; it has verified empty lineage but no explicit close calls.','V1 duplicate-label artifacts were recovered from the authenticated full bundle; v2 rejects duplicate labels before invocation.']};
await fs.writeFile(path.join(out,'capture-verification.json'),JSON.stringify(result,null,2)+'\n');
console.log(JSON.stringify({status:result.status,sessions:sessions.length,calls:result.total_calls,successes:result.successful_calls,retained_errors:result.expected_or_retained_errors,recovered_label_collisions:sessions.reduce((a,x)=>a+x.per_call_label_collisions.length,0)}));
