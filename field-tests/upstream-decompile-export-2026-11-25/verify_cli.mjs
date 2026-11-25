import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const kind=process.argv[2];assert.ok(['owned','arc'].includes(kind));
const manifest=await json(out+'/runtime-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-'+kind+'.plan.json');
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const destination=out+'/cli-'+kind;await fs.mkdir(destination);
const run=createVerifierRun();let failure,record;
async function tree(root){
 const result=[];for(const entry of await fs.readdir(root,{withFileTypes:true})){
  const p=path.join(root,entry.name);if(entry.isDirectory())for(const [name,bytes] of await tree(p))result.push([entry.name+'/'+name,bytes]);
  else{assert.ok(entry.isFile());result.push([entry.name,await fs.readFile(p)]);}
 }return result.sort(([a],[b])=>a<b?-1:a>b?1:0);
}
try{
 const q=plan.steps.find(s=>s.label==='pair').arguments,target=plan.steps[0].arguments.path;
 const original=q.output_directory,archive=original+'-mcp';
 // Preserve the MCP export, then recreate the exact selected path for whole-Evidence parity.
 await fs.rename(original,archive);
 const argv=[pkg+'/scripts/rea.mjs','decompile-all',target,'--output',original,'--provider','ghidra'];
 for(const [key,flag] of [['address_start','address-start'],['address_end','address-end'],['name','name'],['limit','limit']])if(q[key]!==undefined)argv.push('--'+flag,String(q[key]));
 argv.push('--json');
 const result=await promisify(execFile)(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:390000,maxBuffer:32*1024*1024});
 await fs.writeFile(destination+'/pair.json',result.stdout);await fs.writeFile(destination+'/pair.stderr',result.stderr);
 const evidence=parseEvidence(JSON.parse(result.stdout));toolContract('decompile_all').outputSchema.parse(evidence);
 assert.deepEqual(evidence,await json(out+'/mcp-'+kind+'/pair.evidence.json'));
 const expected=await tree(archive),actual=await tree(original);assert.deepEqual(actual,expected);
 record={argv,evidence_id:evidence.evidence_id,exact_mcp_evidence_equal:true,export_files_equal:actual.length};
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',record:record??null,failure:failure??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',record,failure,lineage}));}
if(failure)process.exitCode=1;
