import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url));
const manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-manifest.json'),'utf8'));
const pkg=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const plan=JSON.parse(await fs.readFile(path.join(out,'plan-final.json'),'utf8'));
const run=createVerifierRun(),records=[];
let failure;
try {
 for (const label of ['merged-0x332c','arc-0x103d648c4']) {
  const call=plan.steps.find(s=>s.label===label),index=plan.steps.indexOf(call);
  const opened=plan.steps.slice(0,index).findLast(s=>s.name==='open_binary');
  const argv=[pkg+'/scripts/rea.mjs','inspect-native-dispatch-metadata',opened.arguments.path,'--provider','ghidra','--facet','swift-fields','--swift-type-address',call.arguments.swift_type_address,'--max-file-bytes',String(call.arguments.max_file_bytes),'--json'];
  const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:120000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(out,label+'.cli.json'),result.stdout);await fs.writeFile(path.join(out,label+'.cli.stderr'),result.stderr);
  const cli=JSON.parse(result.stdout),mcp=JSON.parse(await fs.readFile(path.join(out,'mcp-final',label+'.evidence.json'),'utf8'));
  parseEvidence(cli);toolContract('inspect_native_dispatch_metadata').outputSchema.parse(cli);
  assert.deepEqual(cli,mcp);
  records.push({label,argv,exact_evidence_equal:true,evidence_id:cli.evidence_id});
 }
} catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally {
 const lineage=await completeVerifierRun(run);
 await fs.writeFile(path.join(out,'cli-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');
 console.log(JSON.stringify({failure,records:records.length,lineage}));
}
if(failure)process.exitCode=1;
