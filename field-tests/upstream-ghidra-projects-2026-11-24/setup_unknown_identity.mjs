import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),pkg=root+'/rea-local',cache='/private/tmp/rea-ghidra-project-unknown-2026-11-24-v2';
const build=JSON.parse(await fs.readFile(out+'/owned-build.json','utf8'));
const {GhidraProjectFiles}=await import(pathToFileURL(pkg+'/dist/ghidra/GhidraProjectSnapshot.js'));
const {ghidraJavaLaunch}=await import(pathToFileURL(pkg+'/dist/ghidra/GhidraJavaLaunch.js'));
const {spawnOwnedProviderProcess,withOwnedProviderProcessCleanup,ProviderProcessSupervisor}=await import(pathToFileURL(pkg+'/dist/process/ProviderProcess.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
await fs.mkdir(cache);for(const name of ['project','home','tmp'])await fs.mkdir(cache+'/'+name);
const files=new GhidraProjectFiles(),run=createVerifierRun();let supervisor,failure;
try{
 const selected=await files.resolve({path:build.project_path,programName:build.program_name},build.target);await files.copy(selected,cache+'/project');
 const args=[cache+'/project','owned','-process',build.program_name,'-noanalysis','-scriptPath',out,'-postScript','ReaProjectClearIdentity.java'];
 const c=await ghidraJavaLaunch({platform:process.platform,analyzeHeadlessPath:process.env.GHIDRA_INSTALL_DIR+'/support/analyzeHeadless',javaHome:process.env.JAVA_HOME,homeRoot:cache+'/home',tempRoot:cache+'/tmp',arguments:args,environment:{PATH:process.env.PATH,JAVA_HOME:process.env.JAVA_HOME,REA_PROCESS_RUN_ID:run.run_id}});
 const launch=withOwnedProviderProcessCleanup(await spawnOwnedProviderProcess({command:c.command,arguments:c.arguments,env:c.environment,runId:run.run_id,expectedCommand:c.command}));supervisor=new ProviderProcessSupervisor({...launch,ownsProcessLifetime:true},{maxDiagnosticBytes:8*1024*1024});
 assert.ok(await supervisor.waitForExit(330000));const s=supervisor.snapshot();await fs.writeFile(out+'/unknown-setup.stdout.log',s.stdout.text);await fs.writeFile(out+'/unknown-setup.stderr.log',s.stderr.text);assert.equal(s.exitCode,0);assert.ok((s.stdout.text+s.stderr.text).includes('REA_PROJECT_IDENTITY_REMOVED'));
 assert.equal(await files.fingerprint(selected.project_path,selected.project_name),selected.sha256);
 await fs.writeFile(out+'/unknown-identity-control.json',JSON.stringify({source_project:build.project_path,source_sha256:selected.sha256,project_path:cache+'/project/owned.gpr',project_sha256:await files.fingerprint(cache+'/project','owned'),program_name:build.program_name,transformation:'Verified private copy; owned script removes executable SHA-256; original project and target unchanged',headless_arguments:args,target_executed:false},null,2)+'\n');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{await files.close();const cleanup=await supervisor?.stop(),lineage=await completeVerifierRun(run);await fs.writeFile(out+'/unknown-setup-verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,cleanup:cleanup??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',failure,lineage}));}
if(failure)process.exitCode=1;
