import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const manifest=await json(out+'/runtime-qualified-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-owned-qualified.plan.json'),build=await json(out+'/owned-project.json');
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
async function expand(v){
 if(Array.isArray(v))return Promise.all(v.map(expand));
 if(v&&typeof v==='object'){
  if('$json_file' in v){let j=await json(v.$json_file);for(const k of v.select??[])j=j[k];return j;}
  return Object.fromEntries(await Promise.all(Object.entries(v).map(async([k,x])=>[k,await expand(x)])));
 }return v;
}
try{
 for(const label of ['all','cross','overlap-first','overlap-second','mask-first','mask-rest','overlay']){
  const step=plan.steps.find(s=>s.label===label),q=await expand(step.arguments),argv=['search-bytes',build.target,q.pattern,'--provider','ghidra'];
  for(const key of ['mask','start','end','limit','cursor'])if(q[key]!==undefined)argv.push('--'+key,String(q[key]));
  const evidence=await call(label,argv,'search_bytes');
  assert.deepEqual(evidence,await json(out+'/mcp-owned-qualified/'+label+'.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 }
 for(const [label,pattern,options] of [['invalid-pair','4 8',[]],['invalid-mask','aa',['--mask','ffff']],['unconstrained','????',[]]])
  await call(label,['search-bytes','/private/tmp/rea-byte-search-absent-target',pattern,...options],'search_bytes','invalid_request');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,failure:failure??null,lineage}));}
if(failure)process.exitCode=1;
