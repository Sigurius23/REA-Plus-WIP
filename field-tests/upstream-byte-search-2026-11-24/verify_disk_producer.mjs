import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),pkg=root+'/rea-local';
const {ghidraJavaLaunch}=await import(pathToFileURL(pkg+'/dist/ghidra/GhidraJavaLaunch.js'));
const {spawnOwnedProviderProcess,withOwnedProviderProcessCleanup,ProviderProcessSupervisor}=await import(pathToFileURL(pkg+'/dist/process/ProviderProcess.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const cache='/private/tmp/rea-byte-search-disk-probe-v2-2026-11-25',execute=promisify(execFile),sha=b=>createHash('sha256').update(b).digest('hex');
await fs.mkdir(cache);for(const n of ['project','home','tmp'])await fs.mkdir(cache+'/'+n);
const prior=JSON.parse(await fs.readFile(out+'/owned-build.json','utf8')),source=prior.source,target=prior.target,run=createVerifierRun();let supervisor,failure;
try {
 const digest=sha(await fs.readFile(target));assert.equal(digest,prior.sha256);
 await fs.mkdir(cache+'/scripts');
 for(const name of await fs.readdir(pkg+'/bridge/ghidra'))if(name.endsWith('.java'))await fs.copyFile(pkg+'/bridge/ghidra/'+name,cache+'/scripts/'+name);
 await fs.copyFile(out+'/ReaDiskClassificationProbe.java',cache+'/scripts/ReaDiskClassificationProbe.java');
 const args=[cache+'/project','owned','-import',target,'-noanalysis','-scriptPath',cache+'/scripts','-postScript','ReaDiskClassificationProbe.java'];
 const environment={PATH:process.env.PATH,JAVA_HOME:process.env.JAVA_HOME,REA_PROCESS_RUN_ID:run.run_id};
 const command=await ghidraJavaLaunch({platform:process.platform,analyzeHeadlessPath:process.env.GHIDRA_INSTALL_DIR+'/support/analyzeHeadless',javaHome:process.env.JAVA_HOME,homeRoot:cache+'/home',tempRoot:cache+'/tmp',arguments:args,environment});
 const launch=withOwnedProviderProcessCleanup(await spawnOwnedProviderProcess({command:command.command,arguments:command.arguments,env:command.environment,runId:run.run_id,expectedCommand:command.command}));
 supervisor=new ProviderProcessSupervisor({...launch,ownsProcessLifetime:true},{maxDiagnosticBytes:8*1024*1024});
 assert.ok(await supervisor.waitForExit(330000),'Owned project build timed out');const state=supervisor.snapshot();
 await fs.writeFile(out+'/disk-probe.stdout.log',state.stdout.text);await fs.writeFile(out+'/disk-probe.stderr.log',state.stderr.text);
 assert.equal(state.exitCode,0,state.stdout.text+'\n'+state.stderr.text);assert.ok((state.stdout.text+'\n'+state.stderr.text).includes('REA_DISK_CLASSIFICATION '));
 await fs.writeFile(out+'/disk-probe.json',JSON.stringify({target,sha256:digest,source,source_sha256:sha(await fs.readFile(source)),project_path:cache+'/project/owned.gpr',program_name:'owned-target',fixture_script:out+'/ReaDiskClassificationProbe.java',fixture_script_sha256:sha(await fs.readFile(out+'/ReaDiskClassificationProbe.java')),headless_arguments:args,target_executed:false},null,2)+'\n');
} catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{const cleanup=await supervisor?.stop();const lineage=await completeVerifierRun(run);await fs.writeFile(out+'/disk-probe-verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,cleanup:cleanup??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',failure,lineage}));}
if(failure)process.exitCode=1;
