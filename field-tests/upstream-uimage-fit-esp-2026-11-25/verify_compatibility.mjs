import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.dirname(path.dirname(out)),prior=root+'/field-tests/upstream-hex-records-2026-11-25';
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),pkg=(await json(out+'/runtime-manifest.json')).runtime_root;
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const plan=await json(prior+'/mcp-records-qualified.plan.json');
const destination=out+'/compatibility';await fs.mkdir(destination);const run=createVerifierRun(),records=[];let failure;
try{
 const cases=[];
 for(const label of ['intel-inspect','motorola-inspect','intel-budget']){
  const step=plan.steps.find(s=>s.label===label),file=label.startsWith('intel')?'intel.data':'motorola.data';
  cases.push({label,source_path:prior+'/fixtures/'+file,args:step.arguments,expected:prior+'/mcp-records-qualified/'+label+'.evidence.json'});
 }
 const firmware=root+'/field-tests/upstream-uf2-dfuse-2026-11-25',firmwarePlan=await json(firmware+'/mcp-carriers-qualified.plan.json');
 let source;for(const step of firmwarePlan.steps){if(step.name==='open_binary')source=step.arguments.path;if(['uf2-inspect','partial-inspect','dfu-inspect','legacy-inspect','crc-inspect'].includes(step.label))cases.push({label:step.label,source_path:source,args:step.arguments,expected:firmware+'/mcp-carriers-qualified/'+step.label+'.evidence.json'});}
 for(const item of cases){
  const args=['inspect-artifact',item.source_path];for(const [key,value] of Object.entries(item.args))args.push('--'+key.replaceAll('_','-'),String(value));
  const result=await promisify(execFile)(process.execPath,[pkg+'/scripts/rea.mjs',...args,'--json'],{env:{PATH:process.env.PATH,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:60000,maxBuffer:32*1024*1024});
  await fs.writeFile(destination+'/'+item.label+'.json',result.stdout);await fs.writeFile(destination+'/'+item.label+'.stderr',result.stderr);
  const evidence=parseEvidence(JSON.parse(result.stdout));assert.deepEqual(evidence,await json(item.expected));records.push({label:item.label,expected:item.expected,evidence_id:evidence.evidence_id,complete_historical_evidence_equal:true});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',records,failure:failure??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',calls:records.length,failure,lineage}));}
if(failure)process.exitCode=1;
