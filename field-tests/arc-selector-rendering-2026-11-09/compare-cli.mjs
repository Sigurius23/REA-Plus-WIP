import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import {execFile} from 'node:child_process';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
const directory=path.dirname(fileURLToPath(import.meta.url));
const pkg=path.resolve(directory,'../../rea-local');
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {analysisErrorProjectionSchema,analysisCliErrorEnvelopeSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const plan=JSON.parse(await fs.readFile(directory+'/selection-after-plan.json','utf8'));
const selected=new Set(['selected-100','selected-10','selected-budget-one','not-indexed','arc-hover-class','wrong-facet','conflicting-selectors','malformed-types','malformed-proto']);
const run=createVerifierRun();
const out=directory+'/cli-final';await fs.mkdir(out,{recursive:true});
const save=(name,value)=>fs.writeFile(path.join(out,name),JSON.stringify(value,null,2)+'\n');
const digest=async target=>createHash('sha256').update(await fs.readFile(target)).digest('hex');
const env={PATH:process.env.PATH??'/usr/bin:/bin',REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent',...plan.environment};
const results=[];let target;let failure;
try {
for(const step of plan.steps){
  if(step.name==='open_binary'){target=step.arguments.path;continue;}
  if(!selected.has(step.label))continue;
  const input=step.arguments;
  const args=[pkg+'/scripts/rea.mjs','inspect-native-dispatch-metadata',target,'--provider','ghidra','--facet',input.facet,'--json'];
  for(const [key,flag] of [['max_records','--max-records'],['max_file_bytes','--max-file-bytes'],['swift_class_address','--swift-class-address'],['swift_conformance_address','--swift-conformance-address']])
    if(input[key]!==undefined)args.push(flag,String(input[key]));
  for(const [key,flag] of [['protocol_name','--swift-protocol-name'],['type_name','--swift-type-name']])
    if(input.swift_conformance_filter?.[key]!==undefined&&input.swift_conformance_filter[key]!==null)args.push(flag,input.swift_conformance_filter[key]);
  const before=await digest(target);
  const started=Date.now();
  const cli=await new Promise(resolve=>execFile(process.execPath,args,{env,cwd:pkg,maxBuffer:16*1024*1024,timeout:120000},(error,stdout,stderr)=>resolve({exit_code:error===null?0:error.code,signal:error?.signal??null,stdout,stderr})));
  await save(step.label+'.cli.json',cli);
  const reply=JSON.parse(await fs.readFile(directory+'/selection-after/'+step.label+'.reply.json','utf8'));
  const value=JSON.parse(cli.stdout);
  let identity;
  if(reply.isError===true){
    assert.equal(cli.exit_code,1);
    const direct=analysisErrorProjectionSchema.safeParse(value);
    const envelope=direct.success?null:analysisCliErrorEnvelopeSchema.parse(value);
    const cliError=direct.success?direct.data:analysisErrorProjectionSchema.parse(Object.fromEntries(Object.entries(envelope).filter(([key])=>key!=='error')));
    const mcpError=analysisErrorProjectionSchema.parse(JSON.parse(reply.content.find(block=>block.type==='text').text).error);
    assert.deepEqual(cliError,mcpError);
    if(step.label.startsWith('malformed-'))assert.equal(cliError.retryable,false);
    identity={error_code:cliError.code,retryable:cliError.retryable};
  } else {
    assert.equal(cli.exit_code,0,cli.stderr);
    const evidence=parseEvidence(value);toolContract(step.name).outputSchema.parse(evidence);
    const mcp=parseEvidence(reply.structuredContent);assert.deepEqual(evidence,mcp);
    await save(step.label+'.evidence.json',evidence);
    identity={evidence_id:evidence.evidence_id};
  }
  assert.equal(await digest(target),before);
  results.push({label:step.label,target,target_sha256:before,input,elapsed_ms:Date.now()-started,cli_mcp_equal:true,target_unchanged:true,...identity});
  console.log(JSON.stringify(results.at(-1)));
}
assert.equal(results.length,selected.size);
} catch(error){failure=error;}
const lineage=await completeVerifierRun(run);
if(!failure){assert.equal(lineage.process_lineage.status,'verified');assert.deepEqual(lineage.process_lineage.descendants,[]);}
const result={status:failure?'failed':'passed',authority:'Actual public CLI compared with retained real SDK MCP; canonical named contract/Evidence or error-schema comparison; no target execution',cases:results,target_executed:false,verifier_run:lineage,error:failure?String(failure.stack??failure):null};
await fs.writeFile(directory+'/cli-verification-final.json',JSON.stringify(result,null,2)+'\n');
if(failure)throw failure;
