import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(root,'field-tests/blob-text-controls-2026-11-23/runtime-delivery-manifest.json'),'utf8')),pkg=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const plan=JSON.parse(await fs.readFile(path.join(out,'plan.json'),'utf8')),artifact=plan.steps[0].arguments.path;
const run=createVerifierRun(),argv=[pkg+'/scripts/rea.mjs','inspect-native-dispatch-metadata',artifact,'--provider','ghidra','--facet','objc','--max-records','6000','--max-file-bytes','134217728','--json'];let failure,evidence;
try{
 const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id},timeout:120000,maxBuffer:96*1024*1024});
 await fs.writeFile(path.join(out,'objc.cli.json'),result.stdout);await fs.writeFile(path.join(out,'objc.cli.stderr'),result.stderr);
 evidence=parseEvidence(JSON.parse(result.stdout));toolContract('inspect_native_dispatch_metadata').outputSchema.parse(evidence);
}catch(e){failure={name:e.name,message:e.message,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(path.join(out,'objc-cli-receipt.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,argv,evidence_id:evidence?.evidence_id??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',evidence_id:evidence?.evidence_id,lineage}));}
if(failure)process.exitCode=1;
