import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const digest=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-manifest.json')),runtime=manifest.runtime_root,req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(digest(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(digest(await fs.readFile(path.join(root,f.path))),f.sha256);
const arcSha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const original=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64');assert.equal(digest(await fs.readFile(original)),arcSha);
const baseline=await json(path.join(out,'qualification/baseline/summary.json'));
const sourceRecord=baseline.records.find(r=>r.name==='analyze_function');assert.ok(sourceRecord);
const sourcePath=path.join(out,'qualification/baseline/frame-escape-post-x8',path.basename(sourceRecord.reply.path));
const before=(await json(sourcePath)).structuredContent;parseEvidence(before);
const fixtureSha=before.subject.digest.sha256;
const reports=[];
for(const [directory,sha,count] of [['mcp-reproduction',fixtureSha,7],['mcp-arc',arcSha,8]]){
 const base=path.join(out,directory),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json'));
 assert.equal(summary.status,'completed');assert.equal(summary.calls,count);assert.equal(calls.length,count);assert.equal(summary.errors,0);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 const bundle=await json(path.join(base,'final.bundle.json')),records=new Map(bundle.records.map(r=>[r.evidence_id,r]));
 for(const e of records.values()){parseEvidence(e);assert.equal(e.subject.digest.sha256,sha);}
 const catalog=await json(path.join(base,'catalog.json')),ajv=new Ajv2020({strict:false,validateFormats:false}),schemas=new Map();
 const validator=s=>{assert.ok(ajv.validateSchema(s));if(s.$id&&schemas.has(s.$id)){const old=schemas.get(s.$id);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);if(s.$id)schemas.set(s.$id,{schema:s,fn});return fn;};
 for(const c of calls){
  assert.equal(c.thrown,null);assert.equal(c.is_error,false);const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));
  const reply=await json(path.join(base,c.reply));assert.notEqual(reply.isError,true);const e=reply.structuredContent;assert.ok(validator(t.outputSchema)(e));toolContract(c.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
  if(c.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,c.evidence_id);assert.equal(e.subject.digest.sha256,sha);
   if(e.analysis_profile===null){assert.equal(e.operation,'inspect_analysis_view');assert.equal(e.provider.id,'rea-analysis-view');const parent=records.get(e.normalized_result.parent_evidence_id);assert.ok(parent);parseEvidence(parent);assert.equal(parent.operation,'analyze_function');assert.equal(parent.subject.digest.sha256,sha);assert.equal(parent.analysis_profile.parameters.swift_enum_switch_recovery,'abi-signed-word-cfg-v10');}
   else assert.equal(e.analysis_profile.parameters.swift_enum_switch_recovery,'abi-signed-word-cfg-v10');
   assert.deepEqual(e,records.get(c.evidence_id));assert.deepEqual(e,await json(path.join(base,c.reply.replace(/\.reply\.json$/,'.evidence.json'))));}
 }
 const opened=calls.find(c=>c.name==='open_binary');assert.equal(digest(await fs.readFile(opened.arguments.path)),sha);
 reports.push({directory,calls:count,successful:count,errors:0,explicit_close_twice:true,verified_empty_lineage:true,bundle_sha256:digest(await fs.readFile(path.join(base,'final.bundle.json')))});
}
const after=await json(path.join(out,'mcp-reproduction/analyze_function.evidence.json'));
const afterInfo=await json(path.join(out,'mcp-reproduction/procedure_info.evidence.json'));
assert.deepEqual(afterInfo.normalized_result.body,after.normalized_result.procedure.body);
const swiftTables=e=>e.normalized_result.native_api.jump_tables.filter(t=>t.data_sources.some(s=>s.provenance==='rea-swift-enum-signed-word-table'));
assert.equal(swiftTables(before)[0].mappings.length,30);assert.deepEqual(swiftTables(after),[]);assert.equal(after.subject.digest.sha256,fixtureSha);
const helper=await json(path.join(out,'mcp-arc/0x1005aa5e4-analyze_function.evidence.json'));
assert.deepEqual(swiftTables(helper),[]);assert.equal(helper.normalized_result.procedure.body.total_bytes,56);
const helperInstructions=await json(path.join(out,'mcp-arc/0x1005aa5e4-read_function_instructions.evidence.json'));assert.equal(helperInstructions.normalized_result.instructions.length,14);
const reducerSummary=await json(path.join(out,'mcp-arc/0x1012a571c-analyze_function.evidence.json'));
const reducerBundle=await json(path.join(out,'mcp-arc/final.bundle.json'));
const reducer=reducerBundle.records.find(e=>e.evidence_id===reducerSummary.normalized_result.parent_evidence_id);assert.ok(reducer);parseEvidence(reducer);assert.equal(reducer.operation,'analyze_function');
const previous=await json(path.join(root,'field-tests/arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/arc-reducer-v9.retained.evidence.json'));parseEvidence(previous);assert.equal(previous.subject.digest.sha256,arcSha);
const mapping=e=>swiftTables(e).map(t=>({dispatch_address:t.dispatch_address,mappings:t.mappings.map(({case_value,target_address})=>({case_value,target_address}))}));
assert.deepEqual(mapping(reducer),mapping(previous));assert.equal(swiftTables(reducer)[0].mappings.length,28);
const result={status:'passed',sessions:reports,public_calls:15,successful:15,fixture_sha256:fixtureSha,exact_fixture_bytes_unchanged:true,unsafe_fixture_tables_before:1,unsafe_fixture_tables_after:0,arc_sha256:arcSha,arc_setting_helper:{instructions:14,body_bytes:56,recovered_swift_tables:0},arc_reducer:{case_mappings:28,previous_mapping_equal:true,body_bytes:reducer.normalized_result.procedure.body.total_bytes},runtime_files:manifest.files.length,target_executed:false,limits:['Item63 remains open: the unguarded Setting helper has no automatic typed invocation proof or recovered 297-case table.','The established reducer mappings remain conditional static observations, not full case-effect or runtime recovery.','This verifies the safety repair and exact app regression targets; no Arc launch, account/profile/services, pixels or durability observed.']};
await fs.writeFile(path.join(out,'retest-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify(result));
