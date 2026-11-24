import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const manifest=await json(out+'/runtime-final-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-final.plan.json');
const target=plan.steps[0].arguments.path,destination=out+'/cli-final';await fs.mkdir(destination);
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const run=createVerifierRun(),execute=promisify(execFile),records=[];let failure;
const sha=b=>createHash('sha256').update(b).digest('hex');
async function call(label,args,operation,overrides={},expectedError){
 const argv=[pkg+'/scripts/rea.mjs',...args,'--provider','ghidra','--json'];let r;
 try{r=await execute(process.execPath,argv,{env:{PATH:process.env.PATH,...plan.environment,...overrides,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:390000,maxBuffer:32*1024*1024});assert.equal(expectedError,undefined,'Expected refusal unexpectedly succeeded');}
 catch(e){if(!expectedError||!e.stdout)throw e;r=e;}
 await fs.writeFile(destination+'/'+label+'.json',r.stdout);await fs.writeFile(destination+'/'+label+'.stderr',r.stderr);
 const value=JSON.parse(r.stdout);
 if(expectedError){const {error:display,...projection}=value;assert.equal(display,'Analysis failed');analysisErrorProjectionSchema.parse(projection);assert.equal(projection.code,expectedError);records.push({label,argv,overrides,expected_error:expectedError});return projection;}
 const e=parseEvidence(value);toolContract(operation).outputSchema.parse(e);records.push({label,argv,overrides,evidence_id:e.evidence_id});return e;
}
try{
 const parity=await call('function-parity',['function',target,'rea_checkpoint_saved'],'analyze_function');
 assert.deepEqual(parity,await json(out+'/mcp-final/saved-readback.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 const annotation=await call('cli-persisted-comment',['annotate-native-function',target,'rea_checkpoint_saved','--comment','persisted by CLI checkpoint'],'annotate_native_function');
 assert.equal(annotation.normalized_result.effects.persists_after_close,true);assert.equal(annotation.normalized_result.annotations.comment,'persisted by CLI checkpoint');
 const readback=await call('cli-comment-reopened',['function',target,'rea_checkpoint_saved'],'analyze_function');assert.ok(JSON.stringify(readback.normalized_result).includes('persisted by CLI checkpoint'));
 assert.notEqual(readback.analysis_profile.parameters.checkpoint.source.sha256,annotation.analysis_profile.parameters.checkpoint.source.sha256);
 const seed=out+'/owned-other-seeds.tsv';await fs.writeFile(seed,'0x100000328\tfunction\trea_other_checkpoint_seed\n');
 const other=await call('changed-seed',['function',target,'0x100000328'],'analyze_function',{REA_GHIDRA_SEED_FILE:seed});
 assert.equal(other.normalized_result.procedure.name,'rea_other_checkpoint_seed');assert.equal(other.analysis_profile.parameters.checkpoint.source,null);
 assert.notEqual(other.analysis_profile.parameters.checkpoint.key,parity.analysis_profile.parameters.checkpoint.key);
 const bad='/private/tmp/rea-ghidra-checkpoint-owned-2026-11-24-corrupt-final';await fs.cp(plan.environment.REA_GHIDRA_CHECKPOINT_DIR,bad,{recursive:true,force:false,errorOnExist:true});
 const key=parity.analysis_profile.parameters.checkpoint.key,current=await json(path.join(bad,key,'current.json')),blob=path.join(bad,key,current.source.file);await fs.appendFile(blob,Buffer.from([0]));
 await fs.writeFile(out+'/corrupt-input.json',JSON.stringify({directory:bad,key,original_sha256:current.source.sha256,corrupted_sha256:sha(await fs.readFile(blob)),target_executed:false},null,2)+'\n');
 await call('corrupt-refusal',['function',target,'rea_checkpoint_saved'],'analyze_function',{REA_GHIDRA_CHECKPOINT_DIR:bad},'configuration_invalid');
 await call('incompatible-mode',['function',target,'rea_checkpoint_saved'],'analyze_function',{REA_GHIDRA_PROJECT_PATH:'/private/tmp/rea-ghidra-projects-owned-2026-11-24-v4/project/owned.gpr'},'configuration_invalid');
 const post={...plan,output_dir:out+'/mcp-cli-readback',steps:[plan.steps[0],{name:'analyze_function',label:'cli-comment-readback',arguments:{procedure:'rea_checkpoint_saved'},expect_success:true},{name:'export_evidence_bundle',label:'post-cli-bundle',arguments:{path:out+'/mcp-cli-readback/final.bundle.json'},expect_success:true},{name:'close_binary',label:'post-cli-close',arguments:{},expect_success:true}]};await fs.writeFile(out+'/mcp-cli-readback.plan.json',JSON.stringify(post,null,2)+'\n');
 const corrupt={...plan,environment:{...plan.environment,REA_GHIDRA_CHECKPOINT_DIR:bad},output_dir:out+'/mcp-corrupt',steps:[{...plan.steps[0],label:'corrupt-open',expect_success:false},{name:'close_binary',label:'corrupt-close',arguments:{},expect_success:true}]};await fs.writeFile(out+'/mcp-corrupt.plan.json',JSON.stringify(corrupt,null,2)+'\n');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',failure:failure??null,records,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',records:records.length,failure:failure??null,lineage}));}
if(failure)process.exitCode=1;
