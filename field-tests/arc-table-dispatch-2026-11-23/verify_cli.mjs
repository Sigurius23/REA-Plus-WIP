import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-final-manifest.json'),'utf8')),pkg=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const plan=JSON.parse(await fs.readFile(path.join(out,'plan.json'),'utf8'));
const run=createVerifierRun(),records=[];let failure;
try{
 for(const label of ['owned-direct','owned-indirect','owned-budget','arc-selected-indirect','arc-direct-input-unknown','owned-file-limit','owned-bad-format']){
  const step=plan.steps.find(s=>s.label===label),argv=[pkg+'/scripts/rea.mjs','inspect-native-table-dispatch',JSON.stringify(step.arguments),'--json'];
  let result,exit=0;
  try{result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:60000,maxBuffer:16*1024*1024});}catch(e){assert.equal(typeof e.code,'number');result=e;exit=e.code;}
  await fs.writeFile(path.join(out,label+'.cli.json'),result.stdout);await fs.writeFile(path.join(out,label+'.cli.stderr'),result.stderr);
  const cli=JSON.parse(result.stdout),mcp=JSON.parse(await fs.readFile(path.join(plan.output_dir,label+'.reply.json'),'utf8'));
  if(step.expect_success){assert.equal(exit,0);parseEvidence(cli);toolContract(step.name).outputSchema.parse(cli);assert.deepEqual(cli,mcp.structuredContent);}
  else{assert.notEqual(exit,0);assert.equal(mcp.isError,true);const text=mcp.content.find(x=>x.type==='text');assert.deepEqual({error:cli},JSON.parse(text.text));}
  records.push({label,argv,exit_code:exit,expected_success:step.expect_success,exact_evidence_or_error_equal:true,evidence_id:cli.evidence_id??null});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(path.join(out,'cli-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));}
if(failure)process.exitCode=1;
