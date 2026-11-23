import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url));
const manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-final-manifest.json'),'utf8')),pkg=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const run=createVerifierRun(),records=[];let failure;
try{
 for(const [name,label] of [['allocation-final','trusted-make'],['allocation-final','wrong-library-make'],['allocation-final','local-make'],['arc-final','summary-0x100d92a28'],['root-qualified','root-layout']]){
  const plan=JSON.parse(await fs.readFile(path.join(out,'plan-'+name+'.json'),'utf8'));
  let steps=plan.steps;
  if(name==='root-qualified')steps=steps.concat(JSON.parse(await fs.readFile(path.join(out,'root-qualified-phase-1.json'),'utf8')).steps);
  const step=steps.find(s=>s.label===label),opened=steps.slice(0,steps.indexOf(step)).findLast(s=>s.name==='open_binary');assert.ok(step&&opened);
  const argv=[pkg+'/scripts/rea.mjs'];let mcp;
  if(step.name==='analyze_function'){
   argv.push('function',opened.arguments.path,step.arguments.procedure,'--provider','ghidra','--json');
   mcp=JSON.parse(await fs.readFile(path.join(plan.output_dir,label+'.evidence.json'),'utf8'));
   if(mcp.operation==='inspect_analysis_view'){
    const bundle=JSON.parse(await fs.readFile(path.join(plan.output_dir,'final.bundle.json'),'utf8'));mcp=bundle.records.find(e=>e.evidence_id===mcp.normalized_result.parent_evidence_id);assert.ok(mcp);
   }
  }else{
   argv.push('inspect-native-dispatch-metadata',opened.arguments.path,'--provider','ghidra','--facet','swift-fields','--swift-type-address',step.arguments.swift_type_address,'--swift-metadata-address',step.arguments.swift_metadata_address,'--max-file-bytes',String(step.arguments.max_file_bytes),'--json');
   mcp=JSON.parse(await fs.readFile(path.join(plan.output_dir,label+'.evidence.json'),'utf8'));
  }
  const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:180000,maxBuffer:24*1024*1024});
  await fs.writeFile(path.join(out,label+'.cli.json'),result.stdout);await fs.writeFile(path.join(out,label+'.cli.stderr'),result.stderr);
  const cli=JSON.parse(result.stdout);parseEvidence(cli);toolContract(step.name).outputSchema.parse(cli);assert.deepEqual(cli,mcp);
  records.push({label,argv,evidence_id:cli.evidence_id,exact_evidence_equal:true});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{
 const lineage=await completeVerifierRun(run);await fs.writeFile(path.join(out,'cli-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));
}
if(failure)process.exitCode=1;
