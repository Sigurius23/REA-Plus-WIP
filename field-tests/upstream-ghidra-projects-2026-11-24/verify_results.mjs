import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const initial=await json(out+'/runtime-final-manifest.json'),final=await json(out+'/runtime-qualified-manifest.json'),pkg=final.runtime_root;
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(pkg+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const {GhidraProjectFiles}=await import(pathToFileURL(pkg+'/dist/ghidra/GhidraProjectSnapshot.js'));
const {parseMachoLayout}=await import(pathToFileURL(pkg+'/dist/native/AppleMachoSelection.js'));
for(const m of [initial,final])for(const row of m.files){const b=await fs.readFile(m.runtime_root+'/'+row.path);assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
const scope=await json(out+'/test-platform-scope.json');assert.equal(sha(await fs.readFile(out+'/project-test-at-capture.txt')),scope.capture_sha256);
for(const row of final.source_files)assert.equal(sha(await fs.readFile(root+'/'+row.path)),row.path===scope.path?scope.current_sha256:row.sha256,row.path);
const build=await json(out+'/owned-build.json'),ownedBytes=await fs.readFile(build.target);assert.equal(sha(ownedBytes),build.sha256);assert.equal(sha(await fs.readFile(build.source)),build.source_sha256);assert.equal(build.target_executed,false);
const mismatch=await json(out+'/owned-mismatch-control.json'),derived=await fs.readFile(mismatch.path);assert.equal(sha(derived),mismatch.sha256);assert.deepEqual(derived,Buffer.concat([ownedBytes,Buffer.from([0])]));
const records=new Map(),errors=[],lineages=[],counts={};let calls=0,successful=0;
function lineage(run){assert.equal(run.process_lineage.status,'verified');assert.deepEqual(run.process_lineage.descendants,[]);lineages.push(run);}
const specs=[['mcp','final.bundle.json','capability_unavailable'],['mcp-changed',null,'execution_failure'],['mcp-wrong-target',null,'execution_failure'],['mcp-final','final.bundle.json','capability_unavailable'],['mcp-changed-final',null,'artifact_changed'],['mcp-wrong-target-final',null,'configuration_invalid'],['mcp-cold','final.bundle.json',null],['mcp-arc-regression','final.bundle.json',null]];
for(const [directory,bundleName,errorCode] of specs){
 const dir=out+'/'+directory,s=await json(dir+'/summary.json');assert.equal(s.status,'completed');lineage(s.verifier_run);calls+=s.calls;successful+=s.successful;counts[directory]={calls:s.calls,successful:s.successful,errors:s.errors};
 const bundle=bundleName===null?null:parseEvidenceBundle(await json(dir+'/'+bundleName)),ids=new Set(bundle?.records.map(e=>e.evidence_id)??[]);let seenErrors=0;
 for(const row of await json(dir+'/invocations.json')){
  assert.equal(row.thrown,null);const r=await json(dir+'/'+row.reply);
  if(row.is_error){const e=analysisErrorProjectionSchema.parse(JSON.parse(r.content.find(c=>c.type==='text').text).error);assert.equal(e.code,errorCode);errors.push({directory,operation:row.name,code:e.code,details:e.details});seenErrors++;continue;}
  toolContract(row.name).outputSchema.parse(r.structuredContent);assert.deepEqual(JSON.parse(r.content.find(c=>c.type==='text').text),r.structuredContent);
  if(!row.evidence_id)continue;const e=parseEvidence(r.structuredContent);assert.ok(ids.has(e.evidence_id));records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);
  assert.equal(e.subject.digest.sha256,directory==='mcp-arc-regression'?'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578':build.sha256);
 }
 assert.equal(seenErrors,errorCode===null?0:1);
}
assert.equal(calls,51);assert.equal(successful,45);assert.equal(errors.length,6);
const result=(d,l)=>{const e=records.get(d+'/'+l);assert.ok(e,d+'/'+l);return e.normalized_result;};
const fn=result('mcp-final','owned-saved-function');assert.equal(fn.procedure.name,'rea_saved_project_annotation');assert.equal(fn.procedure.body.total_bytes,32);assert.equal(result('mcp-final','owned-saved-instructions').instructions.length,8);
assert.equal(result('mcp-final','owned-saved-search').length,1);assert.equal(result('mcp-cold','cold-saved-name').length,0);assert.equal(result('mcp-cold','cold-original-name').length,1);
const finalEvidence=records.get('mcp-final/owned-saved-function'),selection=finalEvidence.analysis_profile.parameters.existing_project;
assert.equal(finalEvidence.analysis_profile.parameters.original_analysis,'unknown');assert.ok(finalEvidence.limitations.some(t=>t.includes('analysis_complete=null; analysis_timed_out=null')));
const files=new GhidraProjectFiles();assert.equal(await files.fingerprint(selection.project_path,selection.project_name),selection.sha256);assert.equal(await files.bridgeDigest(),selection.bridge_sha256);await files.close();
const word=result('mcp-final','owned-source-word'),layout=parseMachoLayout(ownedBytes,'arm64'),at=layout.offset(BigInt(word.address),4);assert.equal(word.bytes_hex,ownedBytes.subarray(at,at+4).toString('hex'));
const arc=records.get('mcp-arc-regression/arc-seeded-reducer'),oldArc=parseEvidence(await json(root+'/field-tests/arc-restore-ui-2026-11-24/mcp/restore-ui-action-0x1001ecfe4.evidence.json'));
assert.deepEqual(arc.analysis_profile,oldArc.analysis_profile);assert.equal(arc.normalized_result.procedure.body.total_bytes,10072);assert.equal(arc.normalized_result.instructions.length,2518);
assert.ok(arc.limitations.some(t=>t.includes('stable partial Program')));assert.equal(arc.analysis_profile.parameters.analysis_seeds.entries.function,2537);
const cli=await json(out+'/cli-qualified-verification.json');assert.equal(cli.status,'passed');lineage(cli.original_pair_run);lineage(cli.verifier_run);assert.equal(cli.records.length,4);
for(const row of cli.records.filter(r=>r.evidence_id)){assert.equal(row.exact_evidence_equal,true);assert.deepEqual(parseEvidence(await json(out+'/'+row.label+'.cli.json')),records.get('mcp-final/'+row.label));}
for(const prefix of ['initial-','attempt2-','attempt3-','']){const s=await json(out+'/'+prefix+'owned-setup-verification.json');assert.equal(s.status,prefix?'failed':'passed');lineage(s.verifier_run);assert.equal(s.cleanup.status,'verified-cleanup');}
const packageText=await fs.readFile(out+'/package-qualified.log','utf8'),pack=JSON.parse(packageText.trim().split('\n').at(-1));assert.equal(pack.cli,true);assert.equal(pack.mcpTools,206);lineage(pack.verifier_run);
assert.match(await fs.readFile(out+'/tests-qualified.log','utf8'),/108 passed/);assert.match(await fs.readFile(out+'/test-platform-qualified.log','utf8'),/8 passed/);
for(const [f,p] of [['check-fast-qualified.log',/2 successful/],['docs-check-qualified.log',/6 successful/]])assert.match(await fs.readFile(out+'/'+f,'utf8'),p);
const history=await json(out+'/history-verification.json');assert.equal(history.status,'passed');assert.equal(history.snapshots.length,26);
const receipt={status:'passed',mcp_calls:calls,successful_mcp_calls:successful,counts,expected_refusals:errors,final_runtime_mcp_calls:32,final_runtime_successes:29,exact_cli_mcp_evidence_pairs:2,cli_configuration_controls:2,source_tests:{passed:108,platform_skips:1,final_posix_scope_cases:8},frozen_runtimes:{initial_files:initial.files.length,final_files:final.files.length},current_sources:final.source_files.length,test_only_platform_scope:scope,owned_source_sha256:build.sha256,project_sha256:selection.sha256,project_source_unchanged:true,bridge_sha256:selection.bridge_sha256,arc_regression:{same_profile:true,function_bytes:10072,instructions:2518,seed_functions:2537,analysis_seconds:1},historical_snapshots:26,owned_lineages:lineages,target_execution:false,scope:'Verified selected-project copies only; automatic checkpoint publication remains open'};
await fs.writeFile(out+'/verification.json',JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:'passed',calls,successful,final_calls:32,cli_pairs:2,verified_lineages:lineages.length}));
