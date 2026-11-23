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
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(hash(b),f.sha256);assert.equal(hash(await fs.readFile(path.join(root,'rea-local',f.path))),f.sha256);}
for(const f of manifest.source_files)assert.equal(hash(await fs.readFile(path.join(root,f.path))),f.sha256);
const previous=await json(path.join(root,'field-tests/arc-keypath-origin-2026-11-23/runtime-final-manifest.json'));
const unchanged=['bridge/ghidra/ReaGhidraBridge.java','bridge/ghidra/ReaGhidraSwiftEnumSwitches.java','bridge/ghidra/ReaGhidraSwiftErrorCalls.java','bridge/ghidra/ReaGhidraRuntimeCalls.java','dist/ghidra/GhidraAnalysisProfile.js'];
for(const p of unchanged)assert.equal(manifest.files.find(f=>f.path===p).sha256,previous.files.find(f=>f.path===p).sha256);
const sessions=[],inputHashes=new Map();let total=0,finalCalls=0;
for(const directory of ['mcp-baseline','mcp-final','mcp-constructor','mcp-typed-consumer','mcp-move','mcp-reduce-witness']){
 const base=path.join(out,directory),calls=await json(path.join(base,'invocations.json')),summary=await json(path.join(base,'summary.json')),catalog=await json(path.join(base,'catalog.json'));
 assert.equal(summary.status,'completed');assert.equal(summary.errors,0);assert.equal(summary.calls,calls.length);assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 const records=new Map(),ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map();
 const validator=s=>{assert.ok(ajv.validateSchema(s));const key=s.$id??JSON.stringify(s);if(validators.has(key)){const old=validators.get(key);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);validators.set(key,{schema:s,fn});return fn;};
 for(const c of calls.filter(c=>c.name==='export_evidence_bundle'))for(const e of (await json(c.arguments.path)).records){parseEvidence(e);records.set(e.evidence_id,e);}
 let identity;
 for(let i=0;i<calls.length;i++){
  const c=calls[i];assert.equal(c.thrown,null);assert.equal(c.is_error,false);const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));
  if(c.name==='open_binary'){if(i>0)assert.deepEqual(calls.slice(i-2,i).map(c=>c.name),['close_binary','close_binary']);if(!inputHashes.has(c.arguments.path))inputHashes.set(c.arguments.path,hash(await fs.readFile(c.arguments.path)));identity=inputHashes.get(c.arguments.path);}
  const reply=await json(path.join(base,c.reply)),e=reply.structuredContent;assert.ok(validator(t.outputSchema)(e));toolContract(c.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
  if(c.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,c.evidence_id);assert.deepEqual(e,records.get(e.evidence_id));assert.equal(e.subject.digest.sha256,identity);}
 }
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);total+=calls.length;if(directory!=='mcp-baseline')finalCalls+=calls.length;sessions.push({directory,calls:calls.length,exported_records:records.size,status:'passed',empty_owned_lineage:true});
}
const ev=async(d,label)=>json(path.join(out,d,label+'.evidence.json'));
const fields=async(d,label)=>(await ev(d,label)).normalized_result.result.swift_type_fields;
for(const label of ['owned-10DependencyVMn','owned-14GenericClosureVMn','owned-11GenericEnumOMn','owned-foreign-dependency','arc-dependency']){
 const before=await fields('mcp-baseline',label),after=await fields('mcp-final',label);assert.equal(before.matched,true);assert.equal(before.name,null);assert.deepEqual(before.fields,[]);assert.equal(after.is_generic,true);assert.ok(after.name);assert.ok(after.fields.length>0);assert.equal(after.program_mutations,false);assert.equal(after.decode.status,'partial');
}
const dependency=await fields('mcp-final','arc-dependency');assert.equal(dependency.name,'Dependency');assert.equal(dependency.descriptor.address,'0x103d46d5c');assert.equal(dependency.declared_field_count,5);assert.deepEqual(dependency.fields.map(f=>f.name),['initialValues','keyPath','file','fileID','line']);assert.equal(dependency.fields[1].mangling_hex,'0293d76a007902cdc26900784700');assert.ok(dependency.fields.every(f=>f.function_type===null));assert.deepEqual(dependency.referenced_enums,[]);
const concrete=await fields('mcp-final','owned-14GenericClosureVMn');assert.equal(concrete.fields[0].mangling_hex,'7800');assert.equal(concrete.fields[0].function_type,null);assert.equal(concrete.fields[1].function_type.parameter.descriptor.address,'0x2b6c');assert.equal(concrete.fields[1].function_type.declared_argument_domain.upper_exclusive,3);assert.equal(concrete.fields[1].function_type.argument_abi.status,'unresolved');
const foreign=await fields('mcp-final','owned-foreign-dependency'),owned=await fields('mcp-final','owned-10DependencyVMn');assert.equal(foreign.name,owned.name);assert.notEqual(foreign.descriptor.address,owned.descriptor.address);assert.deepEqual(foreign.fields.map(f=>f.name),['other']);
for(const label of ['owned-generic-layout-rejected','arc-generic-layout-rejected']){
 const f=await fields('mcp-final',label),s=f.static_metadata;assert.equal(f.is_generic,true);assert.equal(f.fields.length,5);assert.equal(s.owner_matched,false);assert.equal(s.kind_word,null);assert.deepEqual(s.field_offsets,[]);assert.deepEqual(s.pointers,[]);assert.equal(s.value_witness,null);assert.match(s.decode.reason,/specialization evidence/);
}
const truncated=await fields('mcp-final','owned-truncated');assert.equal(truncated.is_generic,true);assert.equal(truncated.declared_field_count,5);assert.equal(truncated.fields.length,1);assert.match(truncated.decode.reason,/max_records_reached/);
const unindexed=await fields('mcp-final','owned-unindexed');assert.equal(unindexed.matched,false);assert.equal(unindexed.is_generic,null);assert.deepEqual(unindexed.fields,[]);
for(const label of ['owned-6ClientVMn','owned-4RootVMn','arc-root','arc-client']){
 const before=await fields('mcp-baseline',label),after=await fields('mcp-final',label);assert.equal(after.is_generic,false);assert.equal(before.descriptor.address,after.descriptor.address);assert.deepEqual(after.fields.map(({decode,...f})=>f),before.fields.map(({decode,...f})=>f));assert.deepEqual(after.referenced_enums,before.referenced_enums);
}
const build=await json(path.join(out,'fixture/build.json'));assert.equal(hash(await fs.readFile(build.binary.path)),build.binary.sha256);assert.equal(hash(await fs.readFile(path.join(out,'fixture/Declarations.swift'))),build.source_sha256);assert.equal(build.target_executed,false);assert.ok(build.commands.every(c=>c.exit_code===0));assert.deepEqual((await json(path.join(out,'fixture/build-cleanup.json'))).verifier_run.process_lineage.descendants,[]);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const layout=(await fields('mcp-typed-consumer','root-layout')).static_metadata;assert.equal(layout.owner_matched,true);assert.equal(layout.value_witness.size_bytes,'640');assert.deepEqual(layout.field_offsets.map(f=>f.byte_offset),[0,80,160,240,320,400,480,560]);
const oldLayout=(await json(path.join(root,'field-tests/arc-invocation-origin-2026-11-23/mcp-root-qualified/root-layout.evidence.json'))).normalized_result.result.swift_type_fields.static_metadata;assert.deepEqual(layout,oldLayout);
const conformance=(await ev('mcp-typed-consumer','root-conformance')).normalized_result.result;assert.equal(conformance.swift_conformances[0].type_name,'BoostsEditor');assert.equal(conformance.swift_conformances[0].protocol_name,'Reducer');assert.equal(conformance.swift_conformances[0].witness_table.address,'0x1046270d8');assert.equal(conformance.swift_dispatch_slots.find(s=>s.slot_index===5).implementation_address,'0x1012a98d0');
const instructions=async(d,label)=>(await ev(d,label)).normalized_result.instructions;
const caller=await instructions('mcp-constructor','caller-instructions');for(const line of ['0x101504864: add x8, sp, #0x1, LSL #12','0x101504868: add x8, x8, #0x680','0x10150486c: bl 0x1012a5544','0x1015048b8: adrp x8, 0x104316000','0x1015048bc: add x8, x8, #0xdb8','0x1015048c0: stp x8, x0, [sp, #0x20]','0x1015048f0: add x1, sp, #0x1, LSL #12','0x1015048f4: add x1, x1, #0x680','0x10150490c: bl 0x100876de8'])assert.ok(caller.includes(line));
const consumer=await instructions('mcp-typed-consumer','consumer-instructions');for(const line of ['0x100876e04: add x29, sp, #0xe0','0x100876e18: mov x26, x1','0x100876e38: ldp x21, x28, [x29, #0x28]','0x100876ed4: ldur x9, [x28, #-0x8]','0x100876ed8: ldr x9, [x9, #0x20]','0x100876ee0: mov x1, x26','0x100876ee4: mov x2, x28','0x100876ee8: blr x9'])assert.ok(consumer.includes(line));
const move=await json(path.join(out,'move-locator.json'));assert.equal(move.move_slot,'0x104316d70');assert.equal(move.target.target,'0x1012b4074');assert.equal(Buffer.from((await ev('mcp-move','move-slot')).normalized_result.bytes_hex,'hex').readBigUInt64LE(0),0x1012b4074n);
const moved=await instructions('mcp-move','move-witness-instructions');assert.deepEqual(moved,['0x1012b4074: mov w2, #0x280','0x1012b4078: b 0x10363f6a0']);
const reduced=await instructions('mcp-reduce-witness','slot4-instructions');for(const line of ['0x1012a9894: mov x0, sp','0x1012a9898: mov x1, x20','0x1012a989c: mov w2, #0x280','0x1012a98a0: bl 0x10363f6a0','0x1012a98a4: mov x20, sp','0x1012a98b4: bl 0x1012a571c'])assert.ok(reduced.includes(line));
const trapped=await instructions('mcp-move','reducer-witness-instructions');assert.ok(trapped.includes('0x1012a9984: brk 0x1'));
const constructorBundle=await json(path.join(out,'mcp-constructor/final.bundle.json'));const ctor=constructorBundle.records.find(e=>e.operation==='analyze_function'&&e.normalized_result.procedure.address==='0x1012a5544');assert.ok(ctor);assert.equal(ctor.normalized_result.native_api.runtime_call_signatures.length,8);
assert.deepEqual((await ev('mcp-constructor','candidate-callers')).normalized_result,['0x10150478c']);
const facts=await json(path.join(out,'fact-index.json'));for(const f of facts.records){const b=await fs.readFile(path.join(root,f.path)),e=JSON.parse(b);assert.equal(hash(b),f.sha256);assert.equal(e.evidence_id,f.evidence_id);assert.equal(e.subject.digest.sha256,f.subject_sha256);}
const history=await json(path.join(out,'history-verification.json'));assert.equal(history.snapshots.length,13);
const result={status:'passed',runtime_files:manifest.files.length,source_files:manifest.source_files.length,public_calls:total,final_runtime_public_calls:finalCalls,cli_mcp_exact_pairs:4,sessions,source_tests:67,generic_declaration_inventory:true,generic_function_parameters_unresolved:true,generic_static_layout_refused:true,unchanged_native_analysis_sources:unchanged,historical_snapshots:13,arc:{dependency_descriptor:'0x103d46d5c',declared_fields:dependency.fields.map(f=>f.name),generic_specialization:'unresolved',candidate_initializer:'0x1012a5544',constructor_caller:'0x10150478c',initializer_call:'0x10150486c',typed_consumer:'0x100876de8',typed_consumer_call:'0x10150490c',root_metadata:'0x104316db8',root_bytes:640,root_reducer_witness:'0x1046270d8',consumer_source:'caller SP+0x1680',consumer_root_take_call:'0x100876ee8',root_move_witness:'0x1012b4074',root_reducer_slot4:'0x1012a9870',root_reducer_call:'0x1012a98b4',root_slot5_trap:'0x1012a9984',keypath_returns_retained:8,actual_captured_instance_origin:'unresolved',field_stability:'unresolved',invocation_mapping:'unimplemented'},target_executed:false};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:'passed',public_calls:total,final_runtime_calls:finalCalls,cli_pairs:4}));
