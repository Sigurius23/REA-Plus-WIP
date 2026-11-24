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
const destination=path.join(out,'arc-cli-qualified');await fs.mkdir(destination);
const run=createVerifierRun(),records=[];let failure;
try{
 const plan=JSON.parse(await fs.readFile(path.join(out,'plan-arc-selected.json'),'utf8'));
 plan.steps.push(...JSON.parse(await fs.readFile(path.join(out,'arc-selected2.json'),'utf8')).steps);
 for(const label of ['arc-controller-selected','arc-indexed-firapp']){
  const index=plan.steps.findIndex(s=>s.label===label),step=plan.steps[index],opened=plan.steps.slice(0,index).reverse().find(s=>s.name==='open_binary'),a=step.arguments;
  const argv=[pkg+'/scripts/rea.mjs','inspect-native-dispatch-metadata',opened.arguments.path,'--provider','ghidra','--facet',a.facet,'--max-records',String(a.max_records),'--objc-class-name',a.objc_class_name,'--max-file-bytes',String(a.max_file_bytes),'--json'];
  const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:120000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(destination,label+'.cli.json'),result.stdout);await fs.writeFile(path.join(destination,label+'.cli.stderr'),result.stderr);
  const cli=parseEvidence(JSON.parse(result.stdout)),mcp=JSON.parse(await fs.readFile(path.join(plan.output_dir,label+'.evidence.json'),'utf8'));toolContract(step.name).outputSchema.parse(cli);assert.deepEqual(cli,mcp);records.push({label,argv,evidence_id:cli.evidence_id,exact_evidence_equal:true});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(path.join(destination,'arc-cli-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));}
if(failure)process.exitCode=1;
