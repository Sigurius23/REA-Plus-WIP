import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),hash=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-final-manifest.json')),runtime=manifest.runtime_root,req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(hash(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(hash(await fs.readFile(path.join(root,f.path))),f.sha256);
// The stock error verifier needs its source fixture, which is intentionally not
// in the frozen package. Authenticate every production file it used instead.
for(const f of manifest.files)assert.equal(hash(await fs.readFile(path.join(root,'rea-local',f.path))),f.sha256);
const sessions=[],inputHashes=new Map();let callsTotal=0,successTotal=0,finalCalls=0;
const directories=['mcp','mcp-pattern','mcp-fixture-baseline','mcp-fixture-final','mcp-arc-final','mcp-fixture-qualified','mcp-arc-qualified','mcp-dependency','mcp-default','mcp-cache','mcp-selection'];
for(const directory of directories){
 const base=path.join(out,directory),calls=await json(path.join(base,'invocations.json')),summary=await json(path.join(base,'summary.json')),catalog=await json(path.join(base,'catalog.json'));
 const sandbox=['mcp-fixture-final','mcp-arc-final'].includes(directory),idle=directory==='mcp';assert.equal(summary.status,sandbox||idle?'failed':'completed');assert.equal(summary.calls,calls.length);assert.equal(summary.errors,sandbox?1:0);
 const lineage=summary.verifier_run.process_lineage;assert.equal(lineage.status,sandbox?'unavailable':'verified');if(!sandbox)assert.deepEqual(lineage.descendants,[]);
 const records=new Map(),ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map();
 const validator=s=>{assert.ok(ajv.validateSchema(s));const key=s.$id??JSON.stringify(s);if(validators.has(key)){const old=validators.get(key);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);validators.set(key,{schema:s,fn});return fn;};
 for(const c of calls.filter(c=>c.name==='export_evidence_bundle'))for(const e of (await json(c.arguments.path)).records){parseEvidence(e);records.set(e.evidence_id,e);}
 let identity;
 for(const c of calls){
  assert.equal(c.thrown,null);const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));const reply=await json(path.join(base,c.reply));
  if(c.name==='open_binary'){if(!inputHashes.has(c.arguments.path))inputHashes.set(c.arguments.path,hash(await fs.readFile(c.arguments.path)));identity=inputHashes.get(c.arguments.path);}
  if(c.is_error){assert.ok(sandbox);const e=JSON.parse(reply.content.find(b=>b.type==='text').text).error;assert.equal(e.code,'execution_failure');assert.equal(e.details.diagnostics.failure_cause.name,'GhidraLaunchError');continue;}
  const e=reply.structuredContent;assert.ok(validator(t.outputSchema)(e));toolContract(c.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
  if(c.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,c.evidence_id);assert.deepEqual(e,records.get(e.evidence_id));assert.equal(e.subject.digest.sha256,identity);}
 }
 if(!sandbox&&!idle)assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 if(idle)assert.match((await json(path.join(base,'fatal.json'))).message,/continuation expired/);
 sessions.push({directory,calls:calls.length,successful:summary.successful,errors:summary.errors,status:sandbox?'sandbox-launch-failure':idle?'partial-recorder-idle-expiration':'passed',exported_records:records.size,lineage:lineage.status});callsTotal+=calls.length;successTotal+=summary.successful;
 if(['mcp-fixture-qualified','mcp-arc-qualified','mcp-dependency','mcp-default','mcp-cache','mcp-selection'].includes(directory))finalCalls+=calls.length;
}
const ev=async(dir,label)=>json(path.join(out,dir,label+'.evidence.json'));
const parent=async(dir,label,bundleName='final.bundle.json')=>{const e=await ev(dir,label);if(e.operation!=='inspect_analysis_view')return e;const b=await json(path.join(out,dir,bundleName));const p=b.records.find(x=>x.evidence_id===e.normalized_result.parent_evidence_id);assert.ok(p);return p;};
const controls=[];
for(const label of ['trusted','wrong-library','local']){
 const before=await ev('mcp-fixture-baseline',label+'-wrapper'),after=await ev('mcp-fixture-qualified',label+'-wrapper'),n=after.normalized_result,s=n.native_api.runtime_call_signatures;
 assert.deepEqual(before.normalized_result.assembly,n.assembly);assert.deepEqual(before.normalized_result.procedure.body,n.procedure.body);assert.equal(before.subject.digest.sha256,after.subject.digest.sha256);assert.equal(s.length,label==='trusted'?1:0);
 if(label==='trusted'){
  const old=before.normalized_result.native_value_flow.operations.find(x=>x.address===s[0].call_address&&x.opcode==='CALL'),current=n.native_value_flow.operations.find(x=>x.address===s[0].call_address&&x.opcode==='CALL');assert.equal(old.output,null);assert.equal(current.output.kind,'register');assert.equal(current.output.size_bytes,8);assert.equal(current.output.location,'register:0x4000');
  assert.match(n.pseudocode,/= _swift_getKeyPath\(/);assert.equal(s[0].contract,'swift-keypath-c-abi-v1');assert.equal(s[0].memory_effects,'unknown');assert.deepEqual(s[0].parameter_registers,['x0','x1']);
 }else assert.equal(before.normalized_result.pseudocode,n.pseudocode);
 const alloc=await ev('mcp-fixture-qualified','allocator-'+label+'-make'),oldAlloc=await json(path.join(root,'field-tests/arc-invocation-origin-2026-11-23/mcp-allocation-final',label+'-make.evidence.json'));
 assert.deepEqual(alloc.normalized_result.assembly,oldAlloc.normalized_result.assembly);assert.deepEqual(alloc.normalized_result.procedure.body,oldAlloc.normalized_result.procedure.body);assert.equal(alloc.normalized_result.pseudocode,oldAlloc.normalized_result.pseudocode);assert.deepEqual(alloc.normalized_result.native_api.runtime_call_signatures,oldAlloc.normalized_result.native_api.runtime_call_signatures);
 controls.push({label,sha256:after.subject.digest.sha256,keypath_signatures:s.length,allocator_behavior_preserved:true,assembly_and_body_unchanged:true,evidence_id:after.evidence_id});
}
const build=await json(path.join(out,'fixture/build.json'));assert.equal(build.commands.length,11);assert.ok(build.commands.every(c=>c.exit_code===0));assert.equal(build.target_executed,false);for(const b of build.binaries)assert.equal(hash(await fs.readFile(b.path)),b.sha256);
const ir=await fs.readFile(path.join(out,'fixture/trusted.ll'),'utf8');assert.match(ir,/tail call ptr @swift_getKeyPath\(ptr nonnull @keypath, ptr undef\)/);assert.match(ir,/declare ptr @swift_getKeyPath\(ptr, ptr\)/);
const probes=await json(path.join(out,'probes-qualified/verification.json'));assert.equal(probes.status,'passed');assert.equal(probes.records.length,6);assert.deepEqual(probes.verifier_run.process_lineage.descendants,[]);assert.equal(hash(await fs.readFile(path.join(out,'fixture/ReaKeyPathContractProbe.java'))),probes.script_sha256);
for(const r of probes.records)assert.equal(r.status,'passed');
const oldRoot=await parent('mcp','root-init-summary','phase1.bundle.json'),newRoot=await parent('mcp-arc-qualified','summary-0x1012a5544'),n=newRoot.normalized_result;
assert.deepEqual(n.assembly,oldRoot.normalized_result.assembly);assert.deepEqual(n.procedure.body,oldRoot.normalized_result.procedure.body);assert.equal(n.assembly.length,118);assert.equal(n.native_api.runtime_call_signatures.length,8);assert.equal((n.pseudocode.match(/= _swift_getKeyPath\(/g)??[]).length,8);
for(const s of n.native_api.runtime_call_signatures){assert.equal(s.contract,'swift-keypath-c-abi-v1');assert.equal(oldRoot.normalized_result.native_value_flow.operations.find(x=>x.address===s.call_address&&x.opcode==='CALL').output,null);assert.equal(n.native_value_flow.operations.find(x=>x.address===s.call_address&&x.opcode==='CALL').output.location,'register:0x4000');}
const previous=await json(path.join(root,'field-tests/arc-invocation-origin-2026-11-23/mcp-arc-final/final.bundle.json'));
const oldFor=a=>previous.records.find(e=>e.operation==='analyze_function'&&e.normalized_result.procedure?.address===a);
const ctor=await parent('mcp-arc-qualified','summary-0x100d92a28');assert.deepEqual(ctor.normalized_result.assembly,oldFor('0x100d92a28').normalized_result.assembly);assert.equal(ctor.normalized_result.native_api.runtime_call_signatures.length,23);assert.equal((ctor.normalized_result.pseudocode.match(/= _swift_allocObject\(/g)??[]).length,23);
const reducer=await parent('mcp-arc-qualified','summary-0x1012a571c'),mappings=e=>e.normalized_result.native_api.jump_tables.map(t=>({dispatch_address:t.dispatch_address,mappings:t.mappings.map(({case_value,target_address})=>({case_value,target_address}))}));assert.deepEqual(mappings(reducer),mappings(oldFor('0x1012a571c')));assert.equal(reducer.normalized_result.procedure.body.total_bytes,10072);assert.equal(reducer.normalized_result.native_api.jump_tables[0].mappings.length,28);
const helper=await ev('mcp-arc-qualified','setting-helper');assert.equal(helper.normalized_result.assembly.length,14);assert.equal(helper.normalized_result.procedure.body.total_bytes,56);assert.equal(helper.normalized_result.native_api.jump_tables.length,0);assert.equal((await ev('mcp-arc-qualified','selected-call')).normalized_result.call_preparation.register_constants[0].value_hex,'0x31');
// Derived pattern facts are an analyst interpretation of public bytes, never
// a runtime-object observation or an automatic helper-wide type/CFG proof.
const bytes=async(dir,label)=>Buffer.from((await ev(dir,label)).normalized_result.bytes_hex,'hex');
const pattern=await bytes('mcp','preference-keypath-pattern'),paddr=0x103788708n;
const relative=(b,base,offset)=>base+BigInt(offset)+BigInt(b.readInt32LE(offset));
assert.equal(pattern.length,48);assert.equal(relative(pattern,paddr,8),0x103bd65bfn);assert.equal(relative(pattern,paddr,12),0x103bd65f5n);assert.equal(pattern.readUInt32LE(20),0x80000018);assert.equal(pattern.readUInt32LE(24),0);assert.equal(pattern.readUInt32LE(32),0x02c00002);assert.equal(relative(pattern,paddr,28)-1n,0x104317698n);assert.equal(relative(pattern,paddr,40),0x1012b283cn);assert.equal(relative(pattern,paddr,44),0x1012b2840n);
assert.equal((await bytes('mcp-pattern','pattern-data-0x104317698')).readBigUInt64LE(0),0x10373ccb8n);assert.equal((await bytes('mcp-arc-qualified','data-0x10373ccb8')).readUInt32LE(0),0);
const rootType=(await ev('mcp-dependency','fields-0x103d46e58')).normalized_result.result.swift_type_fields;assert.equal(rootType.name,'DependencyValues');assert.deepEqual(rootType.fields.map(f=>f.name),['cachedValues','storage']);
const conformance=(await ev('mcp-dependency','key-conformance')).normalized_result.result;assert.equal(conformance.swift_conformances[0].type_name,'UserDefaultsClient');assert.equal(conformance.swift_conformances[0].protocol_name,'TestDependencyKey');assert.equal(conformance.swift_conformances[0].witness_table.address,'0x1045ee8b0');assert.equal(conformance.swift_dispatch_slots[0].witness_data.context_descriptor.address,'0x103d648c4');
const conformances=(await ev('mcp-default','client-conformances')).normalized_result.result;
assert.deepEqual(conformances.swift_conformances.map(c=>[c.location.address,c.protocol_name,c.witness_table.address]),[['0x10373cca8','TestDependencyKey','0x1045ee8b0'],['0x10373cd38','DependencyKey','0x1042c8348']]);
const live=conformances.swift_dispatch_slots.find(s=>s.owner==='UserDefaultsClient: DependencyKey'&&s.slot_index===2);assert.equal(live.implementation_address,'0x100d929a0');
const preview=(await ev('mcp-default','instructions-0x100d8c154')).normalized_result.instructions;assert.ok(preview.includes('0x100d8c168: mov x19, x8'));assert.ok(preview.includes('0x100d8c1a0: bl 0x10363f6a0'));
const callback=(await ev('mcp-cache','instructions-0x1006fe650')).normalized_result.instructions;assert.ok(callback.includes('0x1006fe664: bl 0x1006fc894'));
const selector=(await ev('mcp-selection','instructions-0x1006fc894')).normalized_result.instructions;
for(const line of ['0x1006fcb60: ands w8, w27, #0xff','0x1006fcb80: ldr x9, [x28, #0x10]','0x1006fcb94: bl 0x1036400b4','0x1006fcba0: ldp x1, x25, [x0, #0x8]','0x1006fcbe0: blr x25','0x1006fcc24: ldr x9, [x28, #0x18]'])assert.ok(selector.includes(line));
const facts=await json(path.join(out,'fact-index.json'));for(const record of facts.records){const b=await fs.readFile(path.join(root,record.path)),e=JSON.parse(b);assert.equal(hash(b),record.sha256);assert.equal(e.evidence_id,record.evidence_id);assert.equal(e.subject.digest.sha256,record.subject_sha256);}
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const errors=await json(path.join(out,'swift-errors-qualified/verification.json'));assert.equal(errors.status,'passed');assert.equal(errors.cli_mcp_exact_evidence,true);assert.equal(errors.probes.length,3);assert.deepEqual((await json(path.join(out,'swift-errors-qualified/cleanup.json'))).process_lineage.descendants,[]);
const priorManifest=await json(path.join(root,'field-tests/arc-invocation-origin-2026-11-23/runtime-final-manifest.json'));for(const p of ['bridge/ghidra/ReaGhidraSwiftEnumSwitches.java','bridge/ghidra/ReaGhidraSwiftErrorCalls.java'])assert.equal(manifest.files.find(f=>f.path===p).sha256,priorManifest.files.find(f=>f.path===p).sha256);
const history=await json(path.join(out,'history-verification.json'));assert.equal(history.snapshots.length,12);
const result={status:'passed',runtime_files:manifest.files.length,source_files:manifest.source_files.length,public_calls:callsTotal,successful:successTotal,expected_sandbox_errors:2,final_runtime_public_calls:finalCalls,sessions,controls,exact_cli_mcp_pairs:4,production_boundary_probes:6,swift_error_model_coexistence:true,historical_snapshots:12,arc:{initializer_keypath_results:8,initializer_instructions:118,initializer_body_unchanged:true,constructor_allocator_results:23,reducer_mappings:28,reducer_body_bytes:10072,helper_tables:0,selected_x0:'0x31',pattern:'0x103788708',root_descriptor:'0x103d46e58',root_name:'DependencyValues',leaf_descriptor:'0x103d648c4',external_property_descriptor:'0x10373ccb8',external_property_descriptor_header:0,local_getter_thunk:'0x1012b283c',local_getter:'0x1003b5454',lookup:'0x1006fb0c0',test_key_conformance:'0x10373cca8',test_key_witness:'0x1045ee8b0',dependency_key_conformance:'0x10373cd38',live_key_witness:'0x1042c8348',live_key_getter:'0x100d929a0',test_key_slot2_getter:'0x100d8c154',test_key_getter:'0x100d8c1dc',cache_callback:'0x1006fe650',cache_selector:'0x1006fc894',active_dependency_selection:'unresolved',invocation_mapping:'unimplemented'},original_executable_bytes_unchanged:true,memory_effects:'unknown',target_executed:false};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,public_calls:callsTotal,final_runtime_calls:finalCalls,cli_pairs:4,private_probes:6}));
