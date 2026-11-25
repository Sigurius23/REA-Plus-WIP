import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFile} from 'node:child_process';
import {promisify} from 'node:util';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url)),json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const manifest=await json(out+'/runtime-manifest.json'),pkg=manifest.runtime_root,plan=await json(out+'/mcp-records.plan.json');
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(pkg+'/scripts/lib/verifier-run.mjs'));
const destination=out+'/cli';await fs.mkdir(destination);const run=createVerifierRun(),records=[],readbacks=[];let failure;
const hash=b=>createHash('sha256').update(b).digest('hex');
async function readback(evidence,label){
 const result=evidence.normalized_result,files=[];
 for(const artifact of result.artifacts){const content=await fs.readFile(path.join(result.output_root,artifact.relative_path));assert.equal(content.length,artifact.bytes_written);assert.equal(hash(content),artifact.sha256);files.push({...artifact,hex:content.toString('hex')});}
 readbacks.push({label,output_root:result.output_root,files});return files;
}
async function call(label,argv,operation,expectedCode){
 let result;try{result=await promisify(execFile)(process.execPath,[pkg+'/scripts/rea.mjs',...argv,'--json'],{env:{PATH:process.env.PATH,...plan.environment,REA_PROCESS_RUN_ID:run.run_id,REA_LOG_LEVEL:'silent'},timeout:60000,maxBuffer:32*1024*1024});assert.equal(expectedCode,undefined);}
 catch(e){if(expectedCode===undefined||!e.stdout)throw e;result=e;}
 await fs.writeFile(destination+'/'+label+'.json',result.stdout);await fs.writeFile(destination+'/'+label+'.stderr',result.stderr);
 const value=JSON.parse(result.stdout);if(expectedCode!==undefined){assert.equal(value.code,expectedCode);records.push({label,argv,expected_error:expectedCode});return value;}
 const evidence=parseEvidence(value);toolContract(operation).outputSchema.parse(evidence);records.push({label,argv,evidence_id:evidence.evidence_id});return evidence;
}
try{
 for(const label of ['intel-inspect','motorola-inspect','intel-budget']){
  const step=plan.steps.find(s=>s.label===label),q=step.arguments,file=label.startsWith('intel')?'intel.data':'motorola.data';
  const argv=['inspect-artifact',out+'/fixtures/'+file];for(const [key,value] of Object.entries(q))argv.push('--'+key.replaceAll('_','-'),String(value));
  const evidence=await call(label,argv,'inspect_artifact');assert.deepEqual(evidence,await json(out+'/mcp-records/'+label+'.evidence.json'));records.at(-1).exact_mcp_evidence_equal=true;
 }
 for(const [label,file] of [['intel','intel.data'],['motorola','motorola.data']]){
  const evidence=await call(label+'-extract',['extract-artifact',out+'/fixtures/'+file],'extract_artifact'),expected=await json(out+'/mcp-records/'+label+'-extract.evidence.json');
  const actual=evidence.normalized_result;assert.deepEqual(actual.manifest,expected.normalized_result.manifest);assert.deepEqual(actual.extraction_manifest,expected.normalized_result.extraction_manifest);assert.deepEqual(actual.artifacts,expected.normalized_result.artifacts);await readback(evidence,'cli-'+label);await readback(expected,'mcp-'+label);records.at(-1).normalized_manifest_and_files_equal=true;
 }
 await readback(await json(out+'/mcp-records/duplicate-extract.evidence.json'),'mcp-duplicate');
 await call('byte-refusal',['inspect-artifact',out+'/fixtures/intel.data','--max-firmware-file-bytes','1'],'inspect_artifact','resource_constraint');
 await call('checksum-refusal',['inspect-artifact',out+'/fixtures/bad-checksum.hex','--integrity-policy','record-and-continue'],'inspect_artifact','artifact_operation_failed');
}catch(e){failure={name:e.name,message:e.message,stack:e.stack,stdout:e.stdout??null,stderr:e.stderr??null};}
finally{const lineage=await completeVerifierRun(run);await fs.writeFile(out+'/extracted-readback.json',JSON.stringify(readbacks,null,2)+'\n');await fs.writeFile(destination+'/verification.json',JSON.stringify({status:failure?'failed':'passed',records,failure:failure??null,verifier_run:lineage},null,2)+'\n');console.log(JSON.stringify({status:failure?'failed':'passed',calls:records.length,failure,lineage}));}
if(failure)process.exitCode=1;
