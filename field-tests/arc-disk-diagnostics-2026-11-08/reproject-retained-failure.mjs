import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
import {GhidraProvider} from '../../rea-local/dist/ghidra/GhidraProvider.js';
import {GhidraSessionError} from '../../rea-local/dist/ghidra/GhidraSessionError.js';
import {parseConfig} from '../../rea-local/dist/config/parseConfig.js';
import {parseBinaryTarget} from '../../rea-local/dist/application/BinaryTargetResolver.js';
import {projectAnalysisError} from '../../rea-local/dist/domain/analysisErrorProjection.js';
import {analysisErrorProjectionSchema} from '../../rea-local/dist/contracts/errorSchemas.js';
import {silentLogger} from '../../rea-local/dist/logger.js';
const directory=path.dirname(fileURLToPath(import.meta.url));
const source=path.resolve(directory,'../arc-dispatch-2026-11-06/evaluator/selector-evaluator-main-actor.reply.json');
const bytes=await fs.readFile(source);
const response=JSON.parse(bytes.toString('utf8'));
const original=JSON.parse(response.content.find(x=>x.type==='text').text).error;
const diagnostics=original.details.diagnostics;
assert.equal(original.code,'execution_failure');
assert.equal(diagnostics.failure_kind,'process');
const target=await parseBinaryTarget(diagnostics.target_path);
if(!target.ok)throw target.error;
assert.equal(target.value.sha256,diagnostics.target_sha256);
const settings=JSON.parse(await fs.readFile(path.resolve(directory,'../arc-dispatch-2026-11-06/evaluator/inputs.json'),'utf8'));
const config=parseConfig(settings.environment);
if(!config.ok)throw config.error;
const failure=new GhidraSessionError(diagnostics.failure_kind,diagnostics.failure_message,diagnostics);
let starts=0,closes=0;
// This is recorded-producer replay through the compiled production provider.
// Installation and client ports are recorded adapters; no JVM or target is run.
const provider=new GhidraProvider(config.value,silentLogger,{}, {
  platform:process.platform,architecture:process.arch,
  readText:()=>`application.version=${diagnostics.provider_version}\n`,
  executable:()=>true,
  probeJava:()=>({version:'27',major:27,home:settings.environment.JAVA_HOME,bits:64,runtime:'jdk'}),
},()=>({
  start:async()=>{starts++;return {ok:false,error:failure};},
  callTool:async()=>{throw new Error('Unexpected call after failed startup');},
  close:async()=>{closes++;return {ok:true,value:null};},
}));
const profile=await provider.resolveAnalysisProfile(target.value);
if(!profile.ok)throw profile.error;
assert.ok(profile.value.profile);
const client=provider.createClient(target.value,profile.value.profile);
let projected;
try{
  const result=await client.execute('analyze_function',{procedure:'0x1012fa3a0'});
  if(result.ok)throw new Error('Expected replayed startup failure');
  projected=analysisErrorProjectionSchema.parse(projectAnalysisError(result.error));
  assert.equal(projected.code,'resource_constraint');
  assert.equal(projected.category,'resource_constraint');
  assert.equal(projected.retryable,false);
  assert.equal(projected.details.resource,'disk');
  assert.equal(projected.details.reported_limits,null);
  assert.deepEqual(projected.details.diagnostics,diagnostics);
  assert.match(projected.remediation.action,/Restore free space/);
  assert.match(projected.remediation.action,/REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS/);
  assert.match(projected.remediation.action,/Unchanged capacity/);
  assert.doesNotMatch(projected.remediation.action,/Retry once/);
}finally{
  const closed=await client.close();if(!closed.ok)throw closed.error;
}
const receipt={
  status:'passed',checked_at:new Date().toISOString(),
  authority:'Recorded real Ghidra failure reprojected through the compiled production provider with recorded installation/client ports; not a fresh disk-exhaustion run',
  fresh_ghidra_started:false,target_executed:false,
  source:path.relative(directory,source),source_sha256:createHash('sha256').update(bytes).digest('hex'),
  target_sha256:target.value.sha256,original_code:original.code,
  recorded_profile_digest:diagnostics.profile_digest,replay_profile_digest:profile.value.profile.digest,
  diagnostics_equal:true,client_port_starts:starts,client_port_closes:closes,
  projection:projected,
};
await fs.writeFile(path.join(directory,'retained-failure-reprojection.json'),JSON.stringify(receipt,null,2)+'\n');
console.log(JSON.stringify({status:receipt.status,code:projected.code,resource:projected.details.resource,retryable:projected.retryable,diagnostics_equal:true,profile_equal:receipt.recorded_profile_digest===receipt.replay_profile_digest}));
