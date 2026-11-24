import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const manifest=await json(out+'/runtime-qualified-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-owned-qualified.plan.json'),build=await json(out+'/owned-build.json');
const batchArgs=plan.steps.find(s=>s.label==='batch-complete').arguments;
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(pkg+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const destination=out+'/cli-qualified';await fs.mkdir(destination);
const execute=promisify(execFile),run=createVerifierRun(),records=[];let failure;
async function call(label,args,operation,expectedCode){
 const argv=[pkg+'/scripts/rea.mjs',...args,'--json'];let result;
 try{result=await execute(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:390000,maxBuffer:32*1024*1024});assert.equal(expectedCode,undefined,'Expected CLI refusal succeeded');}
 catch(e){if(!expectedCode||!e.stdout)throw e;result=e;}
 await fs.writeFile(destination+'/'+label+'.json',result.stdout);await fs.writeFile(destination+'/'+label+'.stderr',result.stderr);
 const parsed=JSON.parse(result.stdout);
 if(expectedCode){const {error:display,...projection}=parsed;assert.equal(typeof display,'string');analysisErrorProjectionSchema.parse(projection);assert.equal(projection.code,expectedCode);records.push({label,argv,expected_error:expectedCode});return projection;}
 const evidence=parseEvidence(parsed);toolContract(operation).outputSchema.parse(evidence);records.push({label,argv,evidence_id:evidence.evidence_id});return evidence;
}
try{
 const inventoryBundle=destination+'/inventory.bundle.json',batchBundle=destination+'/batch.bundle.json';
 const complete=await call('inventory-complete',['native-inventory',build.target,'--kind','procedures','--provider','ghidra'],'list_procedures');assert.deepEqual(complete,await json(out+'/mcp-owned-qualified/procedures-complete.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 const summary=await call('inventory-summary',['native-inventory',build.target,'--kind','procedures','--provider','ghidra','--detail','summary','--evidence-output',inventoryBundle],'inspect_analysis_view');assert.deepEqual(summary,await json(out+'/mcp-owned-qualified/procedures-summary.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 const batch=await call('batch-complete',['batch-decompile',build.target,JSON.stringify({addresses:batchArgs.addresses}),'--provider','ghidra'],'batch_decompile');assert.deepEqual(batch,await json(out+'/mcp-owned-qualified/batch-complete.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 const batchSummary=await call('batch-summary',['batch-decompile',build.target,JSON.stringify({addresses:batchArgs.addresses}),'--provider','ghidra','--detail','summary','--evidence-output',batchBundle],'inspect_analysis_view');assert.deepEqual(batchSummary,await json(out+'/mcp-owned-qualified/batch-summary.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 const inventoryParent=parseEvidenceBundle(await json(inventoryBundle)).records[0],batchParent=parseEvidenceBundle(await json(batchBundle)).records[0];assert.deepEqual(inventoryParent,complete);assert.deepEqual(batchParent,batch);
 for(const [label,parent,view] of [['portable-inventory-page',inventoryParent,{kind:'native-inventory',offset:0,limit:64}],['portable-batch-text',batchParent,{kind:'batch-decompile',collection:'pseudocode',index:0,offset:0,limit:12}]]){
  const input=destination+'/'+label+'.input.json';await fs.writeFile(input,JSON.stringify({source:{kind:'inline',evidence:parent},view},null,2)+'\n');
  const value=await call(label,['inspect-analysis-view',input],'inspect_analysis_view');
  assert.deepEqual(value,await json(out+'/mcp-owned-qualified/'+(label==='portable-inventory-page'?'procedures-page':'batch-code-first')+'.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 }
 await call('missing-summary-output',['native-inventory','/private/tmp/rea-native-pages-does-not-exist','--detail','summary'],'inspect_analysis_view','invalid_request');
 await call('malformed-batch',['batch-decompile','/private/tmp/rea-native-pages-does-not-exist','{"addresses":[42]}'],'batch_decompile','invalid_request');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,failure:failure??null,lineage}));}
if(failure)process.exitCode=1;
