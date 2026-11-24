import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),m=JSON.parse(await fs.readFile(out+'/runtime-qualified-manifest.json','utf8')),pkg=m.runtime_root;
const plan=JSON.parse(await fs.readFile(out+'/plan-final.json','utf8')),build=JSON.parse(await fs.readFile(out+'/owned-build.json','utf8'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const run=createVerifierRun(),records=[],execute=promisify(execFile);let failure;
try {
 for(const [label,args,operation] of [['owned-overview',['inspect',build.target],'binary_overview'],['owned-saved-function',['function',build.target,'rea_saved_project_annotation'],'analyze_function']]){
  const argv=[pkg+'/scripts/rea.mjs',...args,'--provider','ghidra','--json'];const r=await execute(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:390000,maxBuffer:32*1024*1024});
  await fs.writeFile(out+'/'+label+'.cli.json',r.stdout);await fs.writeFile(out+'/'+label+'.cli.stderr',r.stderr);
  const cli=parseEvidence(JSON.parse(r.stdout)),mcp=JSON.parse(await fs.readFile(out+'/mcp-final/'+label+'.evidence.json','utf8'));toolContract(operation).outputSchema.parse(cli);assert.deepEqual(cli,mcp);records.push({label,argv,evidence_id:cli.evidence_id,exact_evidence_equal:true});
 }
 for(const [label,overrides] of [['conflicting-seeds',{REA_GHIDRA_SEED_FILE:build.seed_path}],['missing-project',{REA_GHIDRA_PROJECT_PATH:build.project_path+'.missing.gpr'}]]){
  const argv=[pkg+'/scripts/rea.mjs','inspect',build.target,'--provider','ghidra','--json'];let reply;
  try{await execute(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,...overrides,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:390000,maxBuffer:32*1024*1024});assert.fail('Invalid project input unexpectedly succeeded');}
  catch(e){if(!e.stdout)throw e;reply=e;}
  await fs.writeFile(out+'/'+label+'.cli.json',reply.stdout);await fs.writeFile(out+'/'+label+'.cli.stderr',reply.stderr);
  const value=JSON.parse(reply.stdout),error=analysisErrorProjectionSchema.parse(value.error);assert.equal(error.code,'configuration_invalid');records.push({label,argv,overrides,expected_error:error.code});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(out+'/cli-verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',failure,records:records.length,lineage}));}
if(failure)process.exitCode=1;
