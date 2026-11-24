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
const cache='/private/tmp/rea-ghidra-projects-owned-2026-11-24-v4',execute=promisify(execFile),sha=b=>createHash('sha256').update(b).digest('hex');
await fs.mkdir(cache);for(const n of ['project','home','tmp'])await fs.mkdir(cache+'/'+n);
const source=out+'/owned.c',target=cache+'/owned-target',seeds=cache+'/seeds.tsv',run=createVerifierRun();let supervisor,failure;
try {
 const compiler=['-O0','-g',source,'-o',target];await execute('/usr/bin/clang',compiler,{timeout:60000});
 const symbols=await execute('/usr/bin/nm',['-n',target]);await fs.writeFile(out+'/owned.nm.txt',symbols.stdout);
 const line=symbols.stdout.split('\n').find(l=>l.endsWith(' _rea_project_value'));assert.ok(line);const address='0x'+line.trim().split(/\s+/)[0];
 await fs.writeFile(seeds,address+'\tfunction\trea_saved_project_fixture\n');
 const digest=sha(await fs.readFile(target));
 const args=[cache+'/project','owned','-import',target,'-scriptPath',pkg+'/bridge/ghidra;'+out,'-preScript','ReaGhidraApplySeeds.java',seeds,'-postScript','ReaProjectFixture.java',address];
 const environment={PATH:process.env.PATH,JAVA_HOME:process.env.JAVA_HOME,REA_PROCESS_RUN_ID:run.run_id};
 const command=await ghidraJavaLaunch({platform:process.platform,analyzeHeadlessPath:process.env.GHIDRA_INSTALL_DIR+'/support/analyzeHeadless',javaHome:process.env.JAVA_HOME,homeRoot:cache+'/home',tempRoot:cache+'/tmp',arguments:args,environment});
 const launch=withOwnedProviderProcessCleanup(await spawnOwnedProviderProcess({command:command.command,arguments:command.arguments,env:command.environment,runId:run.run_id,expectedCommand:command.command}));
 supervisor=new ProviderProcessSupervisor({...launch,ownsProcessLifetime:true},{maxDiagnosticBytes:8*1024*1024});
 assert.ok(await supervisor.waitForExit(330000),'Owned project build timed out');const state=supervisor.snapshot();
 await fs.writeFile(out+'/owned-project.stdout.log',state.stdout.text);await fs.writeFile(out+'/owned-project.stderr.log',state.stderr.text);
 assert.equal(state.exitCode,0,state.stdout.text+'\n'+state.stderr.text);assert.ok((state.stdout.text+'\n'+state.stderr.text).includes('REA_PROJECT_FIXTURE_READY '+digest));
 await fs.writeFile(out+'/owned-build.json',JSON.stringify({target,sha256:digest,source,source_sha256:sha(await fs.readFile(source)),compiler:['/usr/bin/clang',...compiler],address,project_path:cache+'/project/owned.gpr',program_name:'owned-target',seed_path:seeds,seed_sha256:sha(await fs.readFile(seeds)),headless_arguments:args,target_executed:false},null,2)+'\n');
} catch(e){failure={name:e.name,message:e.message,stack:e.stack};}
finally{const cleanup=await supervisor?.stop();const lineage=await completeVerifierRun(run);await fs.writeFile(out+'/owned-setup-verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,cleanup:cleanup??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',failure,lineage}));}
if(failure)process.exitCode=1;
