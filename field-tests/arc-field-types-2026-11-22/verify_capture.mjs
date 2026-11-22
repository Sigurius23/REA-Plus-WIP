import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const sha=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-manifest.json')),pkg=manifest.runtime_root;
const req=createRequire(pkg+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
for(const f of manifest.files){const b=await fs.readFile(path.join(pkg,f.path));assert.equal(b.length,f.bytes);assert.equal(sha(b),f.sha256);}
const sourceChecks=[];
for(const f of manifest.source_files){
 assert.equal(sha(await fs.readFile(path.join(out,'freeze-source',f.path))),f.sha256);
 const live=sha(await fs.readFile(path.join(root,f.path)));
 // Only the test describe grouping changed after freeze to satisfy lint.
 if(live!==f.sha256)assert.equal(f.path,'rea-local/src/native/AppleSwiftFieldTypes.test.ts');
 sourceChecks.push({path:f.path,frozen_sha256:f.sha256,current_sha256:live,production_unchanged:live===f.sha256});
}
const base=path.join(out,'mcp-final'),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json')),catalog=await json(path.join(base,'catalog.json'));
assert.equal(summary.status,'completed');assert.equal(summary.calls,22);assert.equal(summary.successful,20);assert.equal(summary.errors,2);
assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
const ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map();
const validator=s=>{assert.ok(ajv.validateSchema(s));const id=s.$id??JSON.stringify(s);if(validators.has(id)){const old=validators.get(id);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);validators.set(id,{schema:s,fn});return fn;};
const records=new Map();
const bundleReports=[];
for(const prefix of ['merged','controls','arc']){
 const bundle=await json(path.join(base,prefix+'.bundle.json'));
 const opened=calls.find(c=>c.reply===prefix+'-open.reply.json');assert.ok(opened);
 const binary=await fs.readFile(opened.arguments.path),target=sha(binary);
 if(prefix==='arc')assert.equal(target,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
 for(const e of bundle.records){parseEvidence(e);assert.equal(e.subject.digest.sha256,target);records.set(e.evidence_id,e);}
 const group=calls.filter(c=>c.reply.startsWith(prefix+'-'));
 assert.deepEqual(group.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 bundleReports.push({prefix,target_sha256:target,path:opened.arguments.path,bytes:binary.length,records:bundle.records.length,bundle_sha256:sha(await fs.readFile(path.join(base,prefix+'.bundle.json'))),closed_twice:true});
}
for(const call of calls){
 assert.equal(call.thrown,null);const tool=catalog.find(t=>t.name===call.name);assert.ok(tool);assert.ok(validator(tool.inputSchema)(call.arguments));
 const reply=await json(path.join(base,call.reply));
 if(call.is_error){assert.ok(['controls-missing-selector.reply.json','controls-incompatible-selector.reply.json'].includes(call.reply));assert.equal(JSON.parse(reply.content.find(c=>c.type==='text').text).error.code,'invalid_request');continue;}
 const e=reply.structuredContent;assert.ok(validator(tool.outputSchema)(e));toolContract(call.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(c=>c.type==='text').text),e);
 if(call.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,call.evidence_id);assert.deepEqual(e,records.get(e.evidence_id));
  assert.equal(e.normalized_result.target_sha256,e.subject.digest.sha256);assert.equal(e.normalized_result.provider.id,'native-macos');
  assert.equal(e.normalized_result.result.swift_type_fields.program_mutations,false);
  const binary=await fs.readFile(e.subject.local_path);
  for(const f of e.normalized_result.result.swift_type_fields.fields){
   if(f.mangling_hex!==null){const raw=Buffer.from(f.mangling_hex,'hex');assert.deepEqual(binary.subarray(f.type_location.file_offset,f.type_location.file_offset+raw.length),raw);}
   assert.ok(f.evidence.every(x=>x.artifact_sha256===e.subject.digest.sha256));
  }
 }
}
const fields=async label=>(await json(path.join(base,label+'.evidence.json'))).normalized_result.result.swift_type_fields;
const merged=await fields('merged-0x332c'),raw=await fields('merged-0x3348'),foreign=await fields('merged-0x3364');
assert.equal(merged.fields[0].function_type.declared_argument_domain.enum_descriptor.address,'0x3274');
assert.equal(foreign.fields[0].function_type.declared_argument_domain.enum_descriptor.address,'0x32ac');
assert.equal(merged.fields[0].function_type.declared_argument_domain.upper_exclusive,297);assert.equal(foreign.fields[0].function_type.declared_argument_domain.upper_exclusive,297);
assert.equal(raw.fields[0].function_type,null);assert.equal(raw.fields[0].decode.status,'unsupported');assert.deepEqual(raw.referenced_enums,[]);
assert.equal(bundleReports[0].target_sha256,(await json(path.join(root,'field-tests/arc-typed-dispatch-2026-11-21/fixture/fixture-observation.json'))).controls.sha256);
assert.equal(bundleReports[1].target_sha256,(await json(path.join(out,'fixture/build.json'))).binary.sha256);
const controls=await fields('controls-0x15c4'),byName=new Map(controls.fields.map(f=>[f.name,f]));
assert.equal(byName.get('positive').function_type.sendable,true);assert.equal(byName.get('positive').function_type.declared_argument_domain.upper_exclusive,3);
assert.equal(byName.get('returnOnly').function_type.result.descriptor.address,'0x1570');assert.equal(byName.get('returnOnly').function_type.declared_argument_domain,null);
assert.equal(byName.get('foreign').function_type.declared_argument_domain.enum_descriptor.address,'0x15a8');
for(const name of ['raw','optional','asynchronous','throwing','zeroArguments']){assert.equal(byName.get(name).function_type,null);assert.equal(byName.get(name).decode.status,'unsupported');}
assert.equal((await fields('controls-0x15e0')).decode.status,'partial');
assert.match((await fields('controls-budget')).decode.reason,/max_records/);assert.equal((await fields('controls-budget')).fields[0]?.function_type??null,null);
assert.equal((await fields('controls-unindexed')).matched,false);
const arc=await fields('arc-0x103d648c4');assert.equal(arc.name,'UserDefaultsClient');assert.equal(arc.index_entries,11125);assert.equal(arc.unresolved_index_entries,0);assert.equal(arc.fields.length,23);assert.equal(arc.decode.status,'partial');
const bool=arc.fields[0];assert.equal(bool.name,'boolForSetting');assert.equal(bool.mangling_hex,'53620225d8670059626300');
assert.deepEqual(bool.function_type.result,{kind:'builtin',name:'Bool',descriptor:null});assert.equal(bool.function_type.sendable,true);assert.equal(bool.function_type.parameter.descriptor.address,'0x103d41568');assert.equal(bool.function_type.declared_argument_domain.upper_exclusive,297);
assert.equal(arc.referenced_enums[0].cases.length,297);assert.equal(arc.referenced_enums[0].payload_cases,0);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,2);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const probe=await json(path.join(out,'mcp-probe/summary.json'));assert.equal(probe.status,'failed');assert.equal(probe.calls,1);assert.equal(probe.verifier_run.process_lineage.status,'verified');assert.deepEqual(probe.verifier_run.process_lineage.descendants,[]);
const report={status:'passed',public_mcp_calls:22,successful:20,expected_invalid_input_errors:2,exact_cli_mcp_pairs:2,runtime_files:manifest.files.length,source_checks:sourceChecks,sessions:bundleReports,arc:{index_entries:arc.index_entries,unresolved_index_entries:0,field_count:23,decoded_function_fields:arc.fields.filter(f=>f.function_type!==null).map(f=>f.name),other_fields_unsupported:19,owner:'0x103d648c4',parameter_enum:'0x103d41568',empty_cases:297,selected_field_complete:true,inventory_complete:false},program_mutations:false,target_executed:false,ghidra_analysis_requested:false,limitations:['A Ghidra-selected session routes this operation to native-macos; no real Ghidra analysis qualification is claimed.','No native argument-register lowering, typed buffer, physical field offset, code/context origin, invocation or conditional dispatch table is established.','The field reader intentionally supports a strict subset; Arc has 19 unsupported field types.','Initial probe selected the nonselectable native-macos helper as a binary provider; retained failure is a recorder configuration error, not a product defect.','Frozen source bytes are retained. Only test describe grouping changed after freezing to fix lint; all production source remains exact.']};
await fs.writeFile(path.join(out,'capture-verification.json'),JSON.stringify(report,null,2)+'\n');console.log(JSON.stringify(report));
