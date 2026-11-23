import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),reuse=JSON.parse(await fs.readFile(path.join(out,'runtime-reuse.json'),'utf8')),pkg=reuse.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const run=createVerifierRun(),records=[];let failure;
try{
 for(const [file,label] of [['plan-composition.json','composition-fields'],['plan-iflet-conformance.json','iflet-conformance']]){
  const plan=JSON.parse(await fs.readFile(path.join(out,file),'utf8')),step=plan.steps.find(s=>s.label===label),opened=plan.steps.find(s=>s.name==='open_binary'),a=step.arguments;
  const argv=[pkg+'/scripts/rea.mjs','inspect-native-dispatch-metadata',opened.arguments.path,'--provider','ghidra','--facet',a.facet,'--max-records',String(a.max_records),'--max-file-bytes',String(a.max_file_bytes),'--json'];
  argv.push(a.swift_type_address?'--swift-type-address':'--swift-conformance-address',a.swift_type_address??a.swift_conformance_address);
  const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:120000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(out,label+'.cli.json'),result.stdout);await fs.writeFile(path.join(out,label+'.cli.stderr'),result.stderr);
  const cli=JSON.parse(result.stdout),mcp=JSON.parse(await fs.readFile(path.join(plan.output_dir,label+'.evidence.json'),'utf8'));parseEvidence(cli);toolContract(step.name).outputSchema.parse(cli);assert.deepEqual(cli,mcp);records.push({label,argv,evidence_id:cli.evidence_id,exact_evidence_equal:true});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(path.join(out,'cli-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));}
if(failure)process.exitCode=1;
