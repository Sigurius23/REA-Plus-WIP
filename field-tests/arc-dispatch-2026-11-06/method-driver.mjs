import {createRequire} from 'node:module';
import fs from 'node:fs/promises';
import path from 'node:path';
import {pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const pkg='/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/rea-local';
const req=createRequire(pkg+'/package.json');
const {Client}=await import(pathToFileURL(req.resolve('@modelcontextprotocol/client')));
const {StdioClientTransport}=await import(pathToFileURL(req.resolve('@modelcontextprotocol/client/stdio')));
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const plan=JSON.parse(await fs.readFile(process.argv[2],'utf8'));
const out=plan.output_dir;await fs.mkdir(out,{recursive:true});
const save=(name,value)=>fs.writeFile(path.join(out,name),JSON.stringify(value,null,2)+'\n');
const run=createVerifierRun();
const transport=new StdioClientTransport({command:process.execPath,args:[pkg+'/scripts/rea.mjs','mcp'],env:{PATH:process.env.PATH??'/usr/bin:/bin',REA_LOG_LEVEL:'silent',REA_PROCESS_RUN_ID:run.run_id,...plan.environment},stderr:'pipe'});
let stderr='';transport.stderr?.on('data',b=>{stderr+=b.toString().slice(0,Math.max(0,2097152-stderr.length));});
const client=new Client({name:'rea-arc-offline-field-test',version:'1'});const ajv=new Ajv2020({strict:false,validateFormats:false});let calls=[],catalog=[];
// Identical content-addressed output schemas are shared by multiple tools.
// Compile one validator per identity, while rejecting divergent definitions.
const identifiedSchemas=new Map();
function validator(schema){
 assert.ok(ajv.validateSchema(schema));
 const id=typeof schema.$id==='string'?schema.$id:null;
 if(id!==null&&identifiedSchemas.has(id)){
  const retained=identifiedSchemas.get(id);assert.deepEqual(schema,retained.schema);
  return retained.validate;
 }
 const validate=ajv.compile(schema);
 if(id!==null)identifiedSchemas.set(id,{schema,validate});
 return validate;
}

async function expand(v){
 if(Array.isArray(v))return Promise.all(v.map(expand));
 if(v&&typeof v==='object'){
  if('$json_file' in v){let j=JSON.parse(await fs.readFile(v.$json_file,'utf8'));for(const k of v.select??[])j=j[k];return j;}
  return Object.fromEntries(await Promise.all(Object.entries(v).map(async([k,x])=>[k,await expand(x)])));
 }return v;
}
let fatal;
try{
 await client.connect(transport);catalog=(await client.listTools()).tools;await save('catalog.json',catalog);
 console.log(JSON.stringify({event:'connected',tools:catalog.length}));
 const phases=[plan.steps??[]];
 for(let phase=0;phase<phases.length;phase++){
 for(const step of phases[phase]){
  const name=step.name,args=await expand(step.arguments??{}),advertised=catalog.find(x=>x.name===name);assert.ok(advertised,name);
  assert.ok(validator(advertised.inputSchema)(args),JSON.stringify(ajv.errors));
  const started=Date.now();let reply,thrown;
  try{reply=await client.callTool({name,arguments:args},{timeout:step.timeout_ms??plan.timeout_ms??60000});}catch(e){thrown={name:e.name,message:e.message,code:e.code??null};}
  const label=step.label??`${calls.length}-${name}`;
  if(reply)await save(label+'.reply.json',reply);else await save(label+'.thrown.json',thrown);
  const row={name,arguments:args,reply:label+'.reply.json',elapsed_ms:Date.now()-started,is_error:reply?.isError===true,thrown:thrown??null};
  if(reply&&!reply.isError){
   const value=reply.structuredContent;assert.ok(value,'Missing structuredContent');assert.ok(validator(advertised.outputSchema)(value),JSON.stringify(ajv.errors));toolContract(name).outputSchema.parse(value);
   const block=reply.content.find(x=>x.type==='text');assert.deepEqual(JSON.parse(block.text),value);
   if(value.evidence_id){parseEvidence(value);row.evidence_id=value.evidence_id;await save(label+'.evidence.json',value);}
  }
  calls.push(row);await save('invocations.json',calls);console.log(JSON.stringify({event:'call',name,label,ms:row.elapsed_ms,error:row.is_error,thrown,evidence_id:row.evidence_id}));
  if(step.expect_success&&(reply?.isError||thrown))throw Error(`Required step failed ${name}`);
 }
 const nextFile=(plan.continuations??[])[phase];
 if(nextFile){console.log(JSON.stringify({event:'awaiting-continuation',path:nextFile}));let next;const end=Date.now()+(plan.idle_timeout_ms??180000);while(Date.now()<end){try{next=JSON.parse(await fs.readFile(nextFile,'utf8'));break;}catch(e){if(e.code!=='ENOENT')throw e;}await new Promise(r=>setTimeout(r,500));}if(next)phases.push(next.steps??[]);else console.log(JSON.stringify({event:'continuation-expired',path:nextFile}));}
 }
}catch(e){fatal={name:e.name,message:e.message,stack:e.stack};await save('fatal.json',fatal);console.log(JSON.stringify({event:'fatal',...fatal}));}
finally{
 await client.close();await transport.close();await fs.writeFile(path.join(out,'stderr.log'),stderr);
 const lineage=await completeVerifierRun(run);await save('summary.json',{status:fatal?'failed':'completed',tools:catalog.length,calls:calls.length,successful:calls.filter(x=>!x.is_error&&!x.thrown).length,errors:calls.filter(x=>x.is_error||x.thrown).length,verifier_run:lineage});console.log(JSON.stringify({event:'closed',lineage}));
}
if(fatal)process.exitCode=1;
