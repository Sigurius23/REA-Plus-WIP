import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const manifest=await json(out+'/runtime-qualified-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-owned-qualified.plan.json'),build=await json(out+'/owned-build.json');
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
 const queries=[['address','procedure_address',{procedure:'0x100000460'}],['graph','get_call_graph',{address:'0x100000460',direction:'forward'}]];
 let graphParent;
 for(const [label,operation,parameters] of queries){
  const request=JSON.stringify({operation,parameters});
  const complete=await call(label+'-complete',['native-observation',build.target,request,'--provider','ghidra'],operation);
  assert.deepEqual(complete,await json(out+'/mcp-owned-qualified/'+label+'-complete.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
  const bundle=destination+'/'+label+'.bundle.json';
  const summary=await call(label+'-summary',['native-observation',build.target,request,'--provider','ghidra','--detail','summary','--evidence-output',bundle],'inspect_analysis_view');
  assert.deepEqual(summary,await json(out+'/mcp-owned-qualified/'+label+'-summary.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
  const parent=parseEvidenceBundle(await json(bundle)).records[0];assert.deepEqual(parent,complete);
  if(label==='graph')graphParent=parent;
 }
 for(const [label,view] of [['graph-page',{kind:'native-observation',offset:0,limit:1}],['graph-profile',{kind:'native-context',facet:'analysis-profile'}],['graph-caveats-first',{kind:'native-context',facet:'limitations',offset:0,limit:1}]]){
  const input=destination+'/'+label+'.input.json';await fs.writeFile(input,JSON.stringify({source:{kind:'inline',evidence:graphParent},view},null,2)+'\n');
  const value=await call(label,['inspect-analysis-view',input],'inspect_analysis_view');
  assert.deepEqual(value,await json(out+'/mcp-owned-qualified/'+label+'.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 }
 const request=JSON.stringify({operation:'procedure_address',parameters:{procedure:'selected'}});
 await call('missing-summary-output',['native-observation','/private/tmp/rea-native-observations-absent',request,'--detail','summary'],'inspect_analysis_view','invalid_request');
 await call('malformed-parameter',['native-observation','/private/tmp/rea-native-observations-absent',JSON.stringify({operation:'procedure_address',parameters:{procedure:42}})],'procedure_address','invalid_request');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,failure:failure??null,lineage}));}
if(failure)process.exitCode=1;
