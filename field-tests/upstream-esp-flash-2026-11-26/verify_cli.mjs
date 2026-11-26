import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const manifest=await json(out+'/runtime-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-carriers.plan.json');
const files=new Map((await json(out+'/fixture-receipt.json')).files.map(row=>[row.name,row.path]));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const destination=out+'/cli';await fs.mkdir(destination);const run=createVerifierRun(),records=[],readbacks=[];let failure;
const hash=b=>createHash('sha256').update(b).digest('hex');
async function readback(evidence,label,sourceFile){
 const result=evidence.normalized_result,files=[];
 for(const artifact of result.artifacts){const content=await fs.readFile(path.join(result.output_root,artifact.relative_path));assert.equal(content.length,artifact.bytes_written);assert.equal(hash(content),artifact.sha256);files.push({...artifact,hex:content.toString('hex')});}
 readbacks.push({label,source_file:sourceFile,output_root:result.output_root,files});return files;
}
async function call(label,argv,operation,expectedCode){
 let result;try{result=await promisify(execFile)(process.execPath,[pkg+'/scripts/rea.mjs',...argv,'--json'],{env:{PATH:process.env.PATH,...plan.environment,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:60000,maxBuffer:32*1024*1024});assert.equal(expectedCode,undefined);}
 catch(e){if(expectedCode===undefined||!e.stdout)throw e;result=e;}
 await fs.writeFile(destination+'/'+label+'.json',result.stdout);await fs.writeFile(destination+'/'+label+'.stderr',result.stderr);
 const value=JSON.parse(result.stdout);if(expectedCode!==undefined){assert.equal(value.code,expectedCode);records.push({label,argv,expected_error:expectedCode});return value;}
 const evidence=parseEvidence(value);toolContract(operation).outputSchema.parse(evidence);records.push({label,argv,evidence_id:evidence.evidence_id});return evidence;
}
const cases=[['whole','whole.bin'],['erased-ota','erased-ota.bin'],['bad-md5','bad-md5.bin'],['no-md5','no-md5.bin'],['leading','leading.bin'],['scanned','scanned.bin'],['selected','whole.bin']];
function argvFor(label,file,operation){const step=plan.steps.find(s=>s.label===label),open=plan.steps.find(s=>s.label===label.replace(/-(inspect|extract)$/,'-open')),argv=[operation,files.get(file)];
 const selection=open.arguments;argv.push('--target-format',selection.format);for(const key of ['flash_offset','partition_table_offset'])if(selection[key]!==undefined)argv.push('--'+key.replaceAll('_','-'),selection[key]);
 for(const [key,value] of Object.entries(step.arguments))argv.push('--'+key.replaceAll('_','-'),String(value));return argv;}
try{
 for(const [label,file] of cases){
  const evidence=await call(label+'-inspect',argvFor(label+'-inspect',file,'inspect-artifact'),'inspect_artifact');
  assert.deepEqual(evidence,await json(out+'/mcp-carriers/'+label+'-inspect.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 }
 for(const [label,file] of [['whole','whole.bin'],['leading','leading.bin'],['scanned','scanned.bin'],['bad-md5','bad-md5.bin']]){
  const evidence=await call(label+'-extract',argvFor(label+'-extract',file,'extract-artifact'),'extract_artifact'),expected=await json(out+'/mcp-carriers/'+label+'-extract.evidence.json');
  const actual=evidence.normalized_result;assert.deepEqual(actual.manifest,expected.normalized_result.manifest);assert.deepEqual(actual.extraction_manifest,expected.normalized_result.extraction_manifest);assert.deepEqual(actual.artifacts,expected.normalized_result.artifacts);
  await readback(evidence,'cli-'+label,file);records.at(-1).normalized_manifest_and_files_equal=true;
 }
 let source;for(const step of plan.steps){if(step.name==='open_binary')source=step.arguments.path;if(step.name==='extract_artifact'&&step.expect_success)await readback(await json(out+'/mcp-carriers/'+step.label+'.evidence.json'),'mcp-'+step.label,path.basename(source));}
 await call('byte-refusal',['inspect-artifact',files.get('whole.bin'),'--target-format','esp-flash-image','--max-firmware-file-bytes','1'],'inspect_artifact','resource_constraint');
 await call('hash-work-refusal',['inspect-artifact',files.get('whole.bin'),'--target-format','esp-flash-image','--max-firmware-hash-bytes','1'],'inspect_artifact','resource_constraint');
 await call('md5-refusal',['inspect-artifact',files.get('bad-md5.bin'),'--target-format','esp-flash-image'],'inspect_artifact','artifact_operation_failed');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(out+'/extracted-readback.json',JSON.stringify(readbacks,null,2)+'\n');await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',records,failure:failure??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',calls:records.length,failure,lineage}));}
if(failure)process.exitCode=1;
