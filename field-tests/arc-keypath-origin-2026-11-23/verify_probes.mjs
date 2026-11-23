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
const binaries=JSON.parse(await fs.readFile(path.join(out,'fixture/build.json'),'utf8')).binaries;
const output=path.join(out,'probes-qualified');await fs.mkdir(output);
const project=await fs.mkdtemp('/private/tmp/rea-allocator-probes-');
const hash=b=>createHash('sha256').update(b).digest('hex');
const run=createVerifierRun(),records=[];
let failure;
try{
 for(const mode of ['positive','override','user-signature','imported-signature','renamed-external','analyst-external']){
  const input=binaries.find(x=>x.label===(mode==='analyst-external'?'wrong-library':'trusted'));assert.equal(hash(await fs.readFile(input.path)),input.sha256);
  const program='/opt/homebrew/Cellar/ghidra/12.1.4/libexec/support/analyzeHeadless';
  const args=[project,mode,'-import',input.path,'-scriptPath',pkg+'/bridge/ghidra;'+path.join(out,'fixture'),'-postScript','ReaKeyPathContractProbe.java',pkg+'/bridge/ghidra',input.procedure,mode,output,'-deleteProject'];
  const result=await promisify(execFile)(program,args,{env:{PATH:process.env.PATH,JAVA_HOME:'/opt/homebrew/Cellar/openjdk/27/libexec/openjdk.jdk/Contents/Home',REA_PROCESS_RUN_ID:run.run_id},timeout:240000,maxBuffer:16*1024*1024});
  await fs.writeFile(path.join(output,mode+'.log'),result.stdout+result.stderr);
  const report=JSON.parse(await fs.readFile(path.join(output,mode+'.probe.json'),'utf8'));assert.equal(report.status,'passed');records.push({program,args,exit_code:0,...report});
 }
 for(const input of binaries)assert.equal(hash(await fs.readFile(input.path)),input.sha256);
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{
 const lineage=await completeVerifierRun(run);
 await fs.rm(project,{recursive:true,force:true});
 await fs.writeFile(path.join(output,'verification.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,binaries,script_sha256:hash(await fs.readFile(path.join(out,'fixture/ReaKeyPathContractProbe.java'))),target_executed:false,verifier_run:lineage},null,2)+'\n');
 console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,lineage}));
}
if(failure)process.exitCode=1;
