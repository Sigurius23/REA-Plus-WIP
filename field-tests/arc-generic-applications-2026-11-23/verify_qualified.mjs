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
const previous=await json(path.join(root,'field-tests/arc-generic-declarations-2026-11-23/runtime-final-manifest.json'));
const unchanged=['bridge/ghidra/ReaGhidraBridge.java','bridge/ghidra/ReaGhidraSwiftEnumSwitches.java','bridge/ghidra/ReaGhidraRuntimeCalls.java','dist/ghidra/GhidraAnalysisProfile.js','dist/native/AppleSwiftStructMetadata.js'];
for(const p of unchanged)assert.equal(manifest.files.find(f=>f.path===p).sha256,previous.files.find(f=>f.path===p).sha256);
const sessions=[],inputHashes=new Map();let total=0,finalCalls=0,conflictRejected=false;
for(const directory of ['mcp-baseline','mcp-final','mcp-malformed']){
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
 if(directory==='mcp-final'){
  const e=await json(path.join(base,'owned-root.evidence.json')),client=await json(path.join(base,'arc-client.evidence.json')),f=client.normalized_result.result.swift_type_fields.fields.find(f=>f.name==='boolForSetting');
  const bad=structuredClone(e);bad.normalized_result.result.swift_type_fields.fields[0].function_type=f.function_type;
  assert.equal(validator(catalog.find(t=>t.name==='inspect_native_dispatch_metadata').outputSchema)(bad),false);assert.equal(toolContract('inspect_native_dispatch_metadata').outputSchema.safeParse(bad).success,false);conflictRejected=true;
 }
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);total+=calls.length;if(directory!=='mcp-baseline')finalCalls+=calls.length;sessions.push({directory,calls:calls.length,exported_records:records.size,status:'passed',empty_owned_lineage:true});
}
const ev=async(d,label)=>json(path.join(out,d,label+'.evidence.json'));
const fields=async(d,label)=>(await ev(d,label)).normalized_result.result.swift_type_fields;
const owned=await fields('mcp-final','owned-root'),oldOwned=await fields('mcp-baseline','owned-root'),byName=new Map(owned.fields.map(f=>[f.name,f]));
assert.equal(owned.fields.length,9);assert.ok(oldOwned.fields.every(f=>f.function_type===null&&!Object.hasOwn(f,'bound_generic_type')));
for(const name of ['client','boolean','pair','enumArgument','foreignArgument']){const f=byName.get(name);assert.equal(f.decode.status,'decoded');assert.equal(f.function_type,null);assert.equal(f.bound_generic_type.interpretation,'declaration-only');assert.equal(f.bound_generic_type.module.name,'OwnedApplications');assert.ok(f.bound_generic_type.signature.parameters.every(p=>p.flags===128));}
for(const name of ['foreignOwner','optional','nested','constrained']){const f=byName.get(name);assert.equal(f.bound_generic_type,null);assert.equal(f.function_type,null);assert.equal(f.decode.status,'unsupported');assert.ok(f.mangling_hex);}
assert.match(byName.get('foreignOwner').decode.reason,/parent contexts/);assert.match(byName.get('constrained').decode.reason,/requirements/);
const arg0=byName.get('client').bound_generic_type.arguments[0],foreign=byName.get('foreignArgument').bound_generic_type.arguments[0];assert.equal(arg0.name,'Client');assert.equal(foreign.name,'Client');assert.notEqual(arg0.descriptor.address,foreign.descriptor.address);
assert.deepEqual(byName.get('boolean').bound_generic_type.arguments,[{kind:'builtin',name:'Bool',descriptor:null}]);
const pair=byName.get('pair').bound_generic_type;assert.equal(pair.signature.parameter_count,2);assert.equal(pair.signature.key_argument_count,2);assert.deepEqual(pair.signature.parameters.map(p=>p.index),[0,1]);assert.equal(pair.arguments[0].name,'Bool');assert.equal(pair.arguments[1].descriptor.address,arg0.descriptor.address);
assert.equal(byName.get('enumArgument').bound_generic_type.arguments[0].name,'Setting');assert.deepEqual(owned.referenced_enums,[]);assert.equal(owned.program_mutations,false);
const truncated=await fields('mcp-final','owned-truncated');assert.match(truncated.decode.reason,/max_records/);assert.ok(truncated.fields.every(f=>f.function_type===null&&f.bound_generic_type===null));
const arc=await fields('mcp-final','arc-root'),oldArc=await fields('mcp-baseline','arc-root');assert.equal(arc.fields.length,8);assert.equal(arc.fields.filter(f=>f.bound_generic_type!==null).length,7);assert.equal(arc.fields[4].name,'_mainQueue');assert.equal(arc.fields[4].decode.status,'unsupported');
assert.deepEqual(arc.fields.map(({bound_generic_type,decode,...f})=>f),oldArc.fields.map(({decode,...f})=>f));
const selected=arc.fields[6];assert.equal(selected.name,'_userDefaultsClient');assert.equal(selected.function_type,null);assert.equal(selected.mangling_hex,'0217746500790281a165004700');
const application=selected.bound_generic_type;assert.equal(application.descriptor.address,'0x103d46d5c');assert.equal(application.module.name,'Dependencies');assert.equal(application.module.descriptor.address,'0x103d46d50');assert.equal(application.arguments[0].descriptor.address,'0x103d648c4');assert.equal(application.signature.location.address,'0x103d46d78');assert.equal(application.signature.parameter_count,1);assert.equal(application.signature.requirement_count,0);assert.equal(application.signature.key_argument_count,1);assert.equal(application.signature.parameters[0].flags,128);assert.deepEqual(arc.referenced_enums,[]);
const client=await fields('mcp-final','arc-client'),oldClient=await fields('mcp-baseline','arc-client');assert.deepEqual(client.fields.map(({bound_generic_type,decode,...f})=>f),oldClient.fields.map(({decode,...f})=>f));assert.deepEqual(client.referenced_enums,oldClient.referenced_enums);assert.equal(client.fields[0].function_type.argument_abi.status,'unresolved');assert.equal(client.fields[0].function_type.declared_argument_domain.upper_exclusive,297);
const layout=(await fields('mcp-final','arc-root-layout')).static_metadata,oldLayout=(await json(path.join(root,'field-tests/arc-generic-declarations-2026-11-23/mcp-typed-consumer/root-layout.evidence.json'))).normalized_result.result.swift_type_fields.static_metadata;assert.deepEqual(layout,oldLayout);assert.equal(layout.value_witness.size_bytes,'640');assert.deepEqual(layout.field_offsets.map(f=>f.byte_offset),[0,80,160,240,320,400,480,560]);
const rejected=await fields('mcp-final','arc-generic-layout-refused');assert.equal(rejected.fields.length,5);assert.equal(rejected.is_generic,true);assert.equal(rejected.static_metadata.owner_matched,false);assert.equal(rejected.static_metadata.kind_word,null);assert.deepEqual(rejected.static_metadata.field_offsets,[]);assert.match(rejected.static_metadata.decode.reason,/specialization evidence/);
const malformed=await json(path.join(out,'fixture/malformed-controls.json'));assert.equal(malformed.records.length,3);
for(const r of malformed.records){const b=await fs.readFile(r.path);assert.equal(hash(b),r.sha256);assert.ok(r.changed_bytes.length>0&&r.changed_bytes.length<=4);const f=(await fields('mcp-malformed',r.label+'-root')).fields.find(f=>f.name===(r.label==='extra-argument'?'pair':'client'));assert.equal(f.bound_generic_type,null);assert.equal(f.function_type,null);assert.equal(f.decode.status,'unsupported');if(r.label==='overlarge-signature')assert.match(f.decode.reason,/mapped|range|outside/i);}
const build=await json(path.join(out,'fixture/build.json'));assert.equal(hash(await fs.readFile(build.binary.path)),build.binary.sha256);assert.equal(hash(await fs.readFile(path.join(out,'fixture/Applications.swift'))),build.source_sha256);assert.equal(build.target_executed,false);assert.ok(build.commands.every(c=>c.exit_code===0));assert.deepEqual((await json(path.join(out,'fixture/build-cleanup.json'))).verifier_run.process_lineage.descendants,[]);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const forwarding=await json(path.join(out,'forwarding-verification.json'));assert.equal(forwarding.status,'passed');assert.equal(forwarding.checked_instructions.length,8);assert.equal(forwarding.relation.unchanged,true);
const facts=await json(path.join(out,'fact-index.json'));for(const r of facts.records){const b=await fs.readFile(path.join(root,r.path)),e=JSON.parse(b);assert.equal(hash(b),r.sha256);assert.equal(e.evidence_id,r.evidence_id);assert.equal(e.subject.digest.sha256,r.subject_sha256);}
const history=await json(path.join(out,'history-verification.json'));assert.equal(history.snapshots.length,14);
const result={status:'passed',runtime_files:manifest.files.length,source_files:manifest.source_files.length,source_tests:78,public_calls:total,final_runtime_public_calls:finalCalls,cli_mcp_exact_pairs:4,sessions,contradictory_function_application_schema_rejected:conflictRejected,owned:{decoded_applications:5,unsupported_applications:4,multiple_parameter_arguments:true,same_name_argument_identity_preserved:true,enum_argument_supplies_no_function_domain:true,budget_degradation:true,malformed_metadata_derivatives:3},arc:{root_fields:8,decoded_applications:7,selected_field:6,generic_descriptor:application.descriptor.address,module:application.module.name,argument_descriptor:application.arguments[0].descriptor.address,member_substitution:'unimplemented',instantiated_generic_layout:'unresolved',native_abi:'unresolved',root_layout_unchanged:true,existing_closure_declarations_unchanged:true,conditional_default_path_x0_forwarding:'verified analyst derivation',active_default_target:'unresolved',invocation_mapping:'unimplemented'},unchanged_native_analysis_sources:unchanged,historical_snapshots:14,target_executed:false};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:'passed',public_calls:total,final_runtime_calls:finalCalls,cli_pairs:4}));
