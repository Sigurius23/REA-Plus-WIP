import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-final-manifest.json'),'utf8')),pkg=manifest.runtime_root;
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const input=JSON.parse(await fs.readFile(path.join(out,'allocation-abi/identities.json'),'utf8')).find(x=>x.label==='trusted');
const output=path.join(out,'probes-final-five');await fs.mkdir(output);
const project=await fs.mkdtemp('/private/tmp/rea-allocator-probes-');
const hash=b=>createHash('sha256').update(b).digest('hex');
const before=hash(await fs.readFile(input.path));const run=createVerifierRun(),records=[];
let failure;
try{
 for(const mode of ['positive','override','user-signature','imported-signature','renamed-external']){
  const program='/opt/homebrew/Cellar/ghidra/12.1.4/libexec/support/analyzeHeadless';
  const args=[project,mode,'-import',input.path,'-scriptPath',pkg+'/bridge/ghidra;'+path.join(out,'allocation-abi'),'-postScript','ReaRuntimeAllocatorProbe.java',pkg+'/bridge/ghidra',input.make_address,mode,output,'-deleteProject'];
  const result=await promisify(execFile)(program,args,{env:{PATH:process.env.PATH,JAVA_HOME:'/opt/homebrew/Cellar/openjdk/27/libexec/openjdk.jdk/Contents/Home',REA_PROCESS_RUN_ID:run.run_id},timeout:240000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(output,mode+'.log'),result.stdout+result.stderr);
  const report=JSON.parse(await fs.readFile(path.join(output,mode+'.probe.json'),'utf8'));assert.equal(report.status,'passed');records.push({program,args,exit_code:0,...report});
 }
 assert.equal(hash(await fs.readFile(input.path)),before);
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{
 const lineage=await completeVerifierRun(run);
 await fs.rm(project,{recursive:true,force:true});
 await fs.writeFile(path.join(output,'verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,binary_sha256:before,script_sha256:hash(await fs.readFile(path.join(out,'allocation-abi/ReaRuntimeAllocatorProbe.java'))),target_executed:false,verifier_run:lineage},null,2)+'\n');
 console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));
}
if(failure)process.exitCode=1;
