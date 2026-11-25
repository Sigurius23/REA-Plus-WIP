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
const destination=out+'/hex-compatibility';await fs.mkdir(destination);const run=createVerifierRun(),records=[];let failure;
try{
 for(const label of ['intel-inspect','motorola-inspect','intel-budget']){
  const step=plan.steps.find(s=>s.label===label),file=label.startsWith('intel')?'intel.data':'motorola.data';
  const args=['inspect-artifact',prior+'/fixtures/'+file];for(const [key,value] of Object.entries(step.arguments))args.push('--'+key.replaceAll('_','-'),String(value));
  const result=await promisify(execFile)(process.execPath,[pkg+'/scripts/rea.mjs',...args,'--json'],{env:{PATH:process.env.PATH,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:60000,maxBuffer:32*1024*1024});
  await fs.writeFile(destination+'/'+label+'.json',result.stdout);await fs.writeFile(destination+'/'+label+'.stderr',result.stderr);
  const evidence=parseEvidence(JSON.parse(result.stdout));assert.deepEqual(evidence,await json(prior+'/mcp-records-qualified/'+label+'.evidence.json'));records.push({label,evidence_id:evidence.evidence_id,complete_historical_evidence_equal:true});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',records,failure:failure??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',calls:records.length,failure,lineage}));}
if(failure)process.exitCode=1;
