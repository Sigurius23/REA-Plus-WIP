import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {spawn} from 'node:child_process';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
const directory=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(directory,'../..');
const {parseEvidence}=await import(pathToFileURL(root+'/rea-local/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(root+'/rea-local/dist/contracts/toolContracts.js'));
const plan=JSON.parse(await fs.readFile(directory+'/plan.json','utf8'));
const out=directory+'/cli';await fs.mkdir(out,{recursive:true});let target;const results=[];
for(const step of plan.steps){
 if(step.name==='open_binary'){target=step.arguments.path;continue;}
 if(!['inspect_signature','inspect_plist'].includes(step.name))continue;
 const args=[root+'/rea-local/scripts/rea.mjs',step.name.replaceAll('_','-'),target];
 if(step.name==='inspect_plist'&&step.arguments.path)args.push('--relative-path',step.arguments.path);
 args.push('--json');const start=Date.now();
 const reply=await new Promise((resolve,reject)=>{const child=spawn(process.execPath,args,{env:{PATH:process.env.PATH,REA_LOG_LEVEL:'silent'},stdio:['ignore','pipe','pipe']});let stdout='',stderr='';child.stdout.on('data',b=>stdout+=b);child.stderr.on('data',b=>stderr+=b);child.once('error',reject);child.once('close',(code,signal)=>resolve({code,signal,stdout,stderr}));});
 await fs.writeFile(path.join(out,step.label+'.cli.json'),reply.stdout);await fs.writeFile(path.join(out,step.label+'.stderr.log'),reply.stderr);
 assert.equal(reply.code,0,step.label+': '+reply.stderr);const record=parseEvidence(JSON.parse(reply.stdout));toolContract(step.name).outputSchema.parse(record);await fs.writeFile(path.join(out,step.label+'.evidence.json'),JSON.stringify(record,null,2)+'\n');
 const selected=await fs.readFile(record.subject.local_path);assert.equal(createHash('sha256').update(selected).digest('hex'),record.subject.digest.sha256);
 results.push({label:step.label,operation:step.name,evidence_id:record.evidence_id,subject:record.subject,elapsed_ms:Date.now()-start,exit_code:reply.code});console.log(step.label,record.evidence_id);await fs.writeFile(directory+'/cli-verification.json',JSON.stringify({status:'in_progress',authority:'actual public CLI, named contract and canonical Evidence authentication; original selected subject rehashed after each observation',target_executed:false,results},null,2)+'\n');
}
await fs.writeFile(directory+'/cli-verification.json',JSON.stringify({status:'passed',authority:'actual public CLI, named contract and canonical Evidence authentication; original selected subject rehashed after each observation',target_executed:false,results},null,2)+'\n');
