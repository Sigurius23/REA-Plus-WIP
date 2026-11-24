import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),m=JSON.parse(await fs.readFile(out+'/runtime-qualified-manifest.json','utf8')),pkg=m.runtime_root;
const plan=JSON.parse(await fs.readFile(out+'/plan-final.json','utf8')),build=JSON.parse(await fs.readFile(out+'/owned-build.json','utf8'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const previous=JSON.parse(await fs.readFile(out+'/cli-verification.json','utf8')),run=createVerifierRun(),records=[],execute=promisify(execFile);let failure;
try {
 assert.equal(previous.records.length,2);
 for(const row of previous.records){const cli=parseEvidence(JSON.parse(await fs.readFile(out+'/'+row.label+'.cli.json','utf8'))),mcp=JSON.parse(await fs.readFile(out+'/mcp-final/'+row.label+'.evidence.json','utf8'));assert.deepEqual(cli,mcp);records.push(row);}
 for(const [label,overrides] of [['qualified-conflicting-seeds',{REA_GHIDRA_SEED_FILE:build.seed_path}],['qualified-missing-project',{REA_GHIDRA_PROJECT_PATH:build.project_path+'.missing.gpr'}]]){
  const argv=[pkg+'/scripts/rea.mjs','inspect',build.target,'--provider','ghidra','--json'];let reply;
  try{await execute(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,...overrides,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:390000,maxBuffer:32*1024*1024});assert.fail('Invalid input unexpectedly succeeded');}
  catch(e){if(!e.stdout)throw e;reply=e;}
  await fs.writeFile(out+'/'+label+'.cli.json',reply.stdout);await fs.writeFile(out+'/'+label+'.cli.stderr',reply.stderr);
  const {error:display,...projection}=JSON.parse(reply.stdout);assert.equal(display,'Analysis failed');const error=analysisErrorProjectionSchema.parse(projection);assert.equal(error.code,'configuration_invalid');records.push({label,argv,overrides,expected_error:error.code});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(out+'/cli-qualified-verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,original_pair_run:previous.verifier_run,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',failure,records:records.length,lineage}));}
if(failure)process.exitCode=1;
