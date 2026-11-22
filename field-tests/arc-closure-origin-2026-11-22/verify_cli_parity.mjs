import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url));
const manifest=JSON.parse(await fs.readFile(path.join(out,'call-preparation-final-runtime-manifest.json'),'utf8'));
const pkg=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const run=createVerifierRun(),records=[];
let failure;
try {
 for (const [name,label] of [['preparation-parity','separated'],['preparation-parity','lane'],['preparation-parity','negative_w'],['preparation-parity','logical64'],['arc-final','call-0x1012ab840']]) {
  const plan=JSON.parse(await fs.readFile(path.join(out,'plan-'+name+'.json'),'utf8'));
  const call=plan.steps.find(s=>s.label===label),index=plan.steps.indexOf(call);
  const opened=plan.steps.slice(0,index).findLast(s=>s.name==='open_binary');
  const argv=[pkg+'/scripts/rea.mjs','inspect-native-instruction',opened.arguments.path,call.arguments.address,'--provider','ghidra','--json'];
  const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:180000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(out,label+'.parity.cli.json'),result.stdout);
  await fs.writeFile(path.join(out,label+'.parity.cli.stderr'),result.stderr);
  const cli=JSON.parse(result.stdout),mcp=JSON.parse(await fs.readFile(path.join(out,'mcp-'+name,label+'.evidence.json'),'utf8'));
  parseEvidence(cli);toolContract('inspect_native_instruction').outputSchema.parse(cli);assert.deepEqual(cli,mcp);
  records.push({label,argv,exact_evidence_equal:true,evidence_id:cli.evidence_id});
 }
} catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally {
 const lineage=await completeVerifierRun(run);
 await fs.writeFile(path.join(out,'cli-parity-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');
 console.log(JSON.stringify({failure,records:records.length,lineage}));
}
if(failure)process.exitCode=1;
