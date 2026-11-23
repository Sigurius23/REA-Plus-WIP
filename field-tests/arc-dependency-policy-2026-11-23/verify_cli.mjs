import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),manifest=JSON.parse(await fs.readFile(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'),'utf8')),runtime=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(runtime+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const plan=JSON.parse(await fs.readFile(path.join(out,'plan-details.json'),'utf8')),run=createVerifierRun(),records=[];let failure;
try{
 for(const [label,address] of [['scope-value-fields','0x103d4d188'],['navigation-key-fields','0x103d4d1e4']]){
  const argv=[runtime+'/scripts/rea.mjs','inspect-native-dispatch-metadata',plan.steps[0].arguments.path,'--provider','ghidra','--facet','swift-fields','--swift-type-address',address,'--max-records','20000','--max-file-bytes','100663296','--json'];
  const r=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:120000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(out,label+'.cli.json'),r.stdout);await fs.writeFile(path.join(out,label+'.cli.stderr'),r.stderr);
  const cli=JSON.parse(r.stdout),mcp=JSON.parse(await fs.readFile(path.join(out,'mcp-details',label+'.evidence.json'),'utf8'));parseEvidence(cli);toolContract('inspect_native_dispatch_metadata').outputSchema.parse(cli);assert.deepEqual(cli,mcp);records.push({label,argv,evidence_id:cli.evidence_id,exact_complete_evidence_equal:true});
 }
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(path.join(out,'cli-verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));}
if(failure)process.exitCode=1;
