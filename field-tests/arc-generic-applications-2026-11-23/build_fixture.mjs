import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),pkg=path.join(root,'rea-local');
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const cache=path.join(pkg,'.cache/arc-generic-applications-2026-11-23'),source=path.join(out,'fixture/Applications.swift'),binary=path.join(cache,'Applications.dylib');
await fs.mkdir(cache);const run=createVerifierRun(),commands=[];let failure;
const hash=b=>createHash('sha256').update(b).digest('hex');
const command=async(program,args)=>{const r=await promisify(execFile)(program,args,{env:{PATH:process.env.PATH,REA_PROCESS_RUN_ID:run.run_id},timeout:120000,maxBuffer:8*1024*1024});commands.push({program,args,exit_code:0,stdout:r.stdout,stderr:r.stderr});return r.stdout;};
try{
 const compiler=await command('/usr/bin/swiftc',['--version']);
 const args=['-target','arm64-apple-macos14.0','-O','-whole-module-optimization','-parse-as-library','-module-name','OwnedApplications','-module-cache-path',path.join(cache,'module-cache'),source];
 await command('/usr/bin/swiftc',[...args,'-emit-ir','-o',path.join(out,'fixture/Applications.ll')]);
 await command('/usr/bin/swiftc',[...args,'-emit-library','-o',binary]);
 const symbols=await command('/usr/bin/nm',['-nm',binary]);await fs.writeFile(path.join(out,'fixture/symbols.txt'),symbols);
 const descriptors=symbols.split('\n').filter(l=>l.includes(') external ')&&l.trim().endsWith('Mn')).map(l=>({address:'0x'+BigInt('0x'+l.split(' ')[0]).toString(16),symbol:l.trim().split(/\s+/).at(-1)}));assert.ok(descriptors.length>=8);
 const bytes=await fs.readFile(binary);await fs.writeFile(path.join(out,'fixture/build.json'),JSON.stringify({compiler,commands,binary:{path:binary,bytes:bytes.length,sha256:hash(bytes)},source_sha256:hash(await fs.readFile(source)),descriptors,target_executed:false},null,2)+'\n');
}catch(e){failure={name:e.name,message:e.message,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const cleanup=await completeVerifierRun(run);await fs.writeFile(path.join(out,'fixture/build-cleanup.json'),JSON.stringify({status:failure?'failed':'passed',failure:failure??null,verifier_run:cleanup},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',cleanup}));}
if(failure)process.exitCode=1;
