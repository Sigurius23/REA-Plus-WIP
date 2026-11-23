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
const previous=await json(path.join(root,'field-tests/arc-generic-applications-2026-11-23/runtime-final-manifest.json'));
const unchanged=['bridge/ghidra/ReaGhidraBridge.java','bridge/ghidra/ReaGhidraSwiftEnumSwitches.java','bridge/ghidra/ReaGhidraRuntimeCalls.java','dist/ghidra/GhidraAnalysisProfile.js','dist/native/AppleSwiftStructMetadata.js'];
for(const p of unchanged)assert.equal(manifest.files.find(f=>f.path===p).sha256,previous.files.find(f=>f.path===p).sha256);
const sessions=[],inputHashes=new Map();let total=0,finalCalls=0,conflictRejected=false;
for(const directory of ['mcp-baseline','mcp-final','mcp-controls']){
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
  const original=await json(path.join(base,'owned-dependency.evidence.json'));
  const validatorOutput=validator(catalog.find(t=>t.name==='inspect_native_dispatch_metadata').outputSchema);
  const client=await json(path.join(base,'arc-client.evidence.json'));
  for(const kind of ['function','application']){
   const bad=structuredClone(original),field=bad.normalized_result.result.swift_type_fields.fields[0];
   if(kind==='function')field.function_type=client.normalized_result.result.swift_type_fields.fields.find(f=>f.name==='boolForSetting').function_type;
   else field.bound_generic_type=(await json(path.join(base,'arc-root.evidence.json'))).normalized_result.result.swift_type_fields.fields[6].bound_generic_type;
   assert.equal(validatorOutput(bad),false);assert.equal(toolContract('inspect_native_dispatch_metadata').outputSchema.safeParse(bad).success,false);
  }
  conflictRejected=true;
 }
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);total+=calls.length;if(directory!=='mcp-baseline')finalCalls+=calls.length;sessions.push({directory,calls:calls.length,exported_records:records.size,status:'passed',empty_owned_lineage:true});
}
const ev=async(d,label)=>json(path.join(out,d,label+'.evidence.json'));
const fields=async(d,label)=>(await ev(d,label)).normalized_result.result.swift_type_fields;
const owned=await fields('mcp-final','owned-dependency'),baseline=await fields('mcp-baseline','owned-dependency');
assert.ok(baseline.fields.every(f=>!Object.hasOwn(f,'generic_member_type')&&f.decode.status==='unsupported'));
assert.ok(owned.fields.every(f=>f.generic_member_type&&f.decode.status==='decoded'&&f.function_type===null&&f.bound_generic_type===null));
const key=owned.fields.find(f=>f.name==='keyPath').generic_member_type;
assert.equal(key.type.kind,'external-symbolic-application');assert.equal(key.type.reference.symbol,'_$ss7KeyPathCMn');assert.equal(key.type.signature_validation,'unresolved-external');assert.equal(key.type.arguments[0].name,'Values');assert.equal(key.type.arguments[1].index,0);
const two=await fields('mcp-final','owned-two');assert.deepEqual(two.fields.slice(0,2).map(f=>f.generic_member_type.type.index),[0,1]);assert.deepEqual(two.fields[2].generic_member_type.type.arguments.map(a=>a.index),[0,1]);
const three=await fields('mcp-final','owned-three');assert.equal(three.fields[0].generic_member_type.type.index,2);
for(const label of ['owned-constrained','owned-foreign','owned-nested']){
 const f=await fields('mcp-final',label);assert.ok(f.fields.every(f=>f.generic_member_type===null&&f.decode.status==='unsupported'));assert.ok(f.fields.every(f=>f.mangling_hex));
}
const limited=await fields('mcp-final','owned-truncated');assert.equal(limited.decode.status,'partial');assert.match(limited.decode.reason,/max_records/);assert.ok(limited.fields.every(f=>!f.generic_member_type));
const controls=await json(path.join(out,'fixture/controls.json'));assert.equal(controls.records.length,4);
for(const control of controls.records){
 const b=await fs.readFile(control.path);assert.equal(hash(b),control.sha256);assert.equal(b.length,control.bytes);assert.equal(control.compiler_output,false);assert.equal(control.executed,false);
 const f=await fields('mcp-controls',control.label+'-fields'),member=f.fields.find(f=>f.name===(control.label==='out-of-range-parameter'?'value':'keyPath'));
 if(control.expectation==='reject'){assert.equal(member.generic_member_type,null);assert.equal(member.decode.status,'unsupported');}
 else {assert.equal(member.generic_member_type.type.reference.symbol,'_$ss7FakeMapCMn');assert.equal(member.generic_member_type.type.signature_validation,'unresolved-external');assert.equal(member.function_type,null);assert.equal(member.bound_generic_type,null);}
 const original=await fs.readFile(controls.source.path);const differences=[];for(let i=0;i<b.length;i++)if(b[i]!==original[i])differences.push({file_offset:i,before:original[i],after:b[i]});assert.deepEqual(differences,control.changed_bytes);
}
const rootFields=await fields('mcp-final','arc-root'),dep=await fields('mcp-final','arc-dependency');
assert.equal(rootFields.fields.length,8);assert.equal(rootFields.fields.filter(f=>f.bound_generic_type).length,7);assert.equal(dep.fields.length,5);
const app=rootFields.fields[6].bound_generic_type,member=dep.fields.find(f=>f.name==='keyPath').generic_member_type;
assert.equal(app.descriptor.address,'0x103d46d5c');assert.equal(app.arguments[0].descriptor.address,'0x103d648c4');assert.deepEqual(member.owner,app.descriptor);assert.deepEqual(member.owner_signature,app.signature);assert.equal(member.type.reference.symbol,'_$ss7KeyPathCMn');assert.equal(member.type.reference.library,'/usr/lib/swift/libswiftCore.dylib');assert.equal(member.type.arguments[0].descriptor.address,'0x103d46e58');assert.equal(member.type.arguments[1].index,0);assert.equal(member.type.arguments[1].parameter.address,app.signature.parameters[0].location.address);assert.equal(member.type.signature_validation,'unresolved-external');
const strip=f=>{const g=structuredClone(f);delete g.generic_member_type;return g;};
for(const label of ['arc-root','arc-client']){
 const before=await fields('mcp-baseline',label),after=await fields('mcp-final',label);
 assert.deepEqual(after.fields.map(strip),before.fields);
 assert.deepEqual(after.referenced_enums,before.referenced_enums);
}
const layout=(await fields('mcp-final','arc-root-layout')).static_metadata,oldLayout=(await json(path.join(root,'field-tests/arc-generic-applications-2026-11-23/mcp-final/arc-root-layout.evidence.json'))).normalized_result.result.swift_type_fields.static_metadata;assert.deepEqual(layout,oldLayout);assert.equal(layout.value_witness.size_bytes,'640');assert.deepEqual(layout.field_offsets.map(f=>f.byte_offset),[0,80,160,240,320,400,480,560]);
const refusal=(await fields('mcp-final','arc-generic-layout-refused')).static_metadata;assert.equal(refusal.owner_matched,false);assert.equal(refusal.kind_word,null);assert.deepEqual(refusal.field_offsets,[]);assert.match(refusal.decode.reason,/specialization evidence/);
const build=await json(path.join(out,'fixture/build.json'));assert.equal(hash(await fs.readFile(build.binary.path)),build.binary.sha256);assert.equal(hash(await fs.readFile(path.join(out,'fixture/MemberTemplates.swift'))),build.source_sha256);assert.equal(build.target_executed,false);assert.ok(build.commands.every(c=>c.exit_code===0));assert.equal((await json(path.join(out,'fixture/build-cleanup.json'))).verifier_run.process_lineage.status,'verified');assert.deepEqual((await json(path.join(out,'fixture/build-cleanup.json'))).verifier_run.process_lineage.descendants,[]);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const facts=[];
for(const label of ['arc-root','arc-dependency','arc-client','arc-root-layout','arc-generic-layout-refused']){
 const file=path.join(out,'mcp-final',label+'.evidence.json'),b=await fs.readFile(file),e=JSON.parse(b);
 facts.push({path:path.relative(root,file),sha256:hash(b),evidence_id:e.evidence_id,subject_sha256:e.subject.digest.sha256});
}
const rootEvidence=await ev('mcp-final','arc-root'),depEvidence=await ev('mcp-final','arc-dependency');
const relation={status:'derived-declaration-only',basis:[rootEvidence.evidence_id,depEvidence.evidence_id],owner:app.descriptor,owner_signature:app.signature,field_ordinal:1,external_application:structuredClone(member.type),substitutions:[]};
relation.external_application.arguments=member.type.arguments.map(a=>{if(a.kind!=='generic-parameter')return a;assert.equal(a.depth,0);assert.deepEqual(a.parameter,app.signature.parameters[a.index].location);const replacement=app.arguments[a.index];assert.ok(replacement);relation.substitutions.push({parameter:a,argument:replacement});return replacement;});
relation.limitations=['This analyst composition joins exact owner and signature identities from retained public Evidence. REA+ does not perform automatic member substitution.','External descriptor kind, arity, constraints, authenticity and runtime binding remain unresolved. Interpreting the imported symbol as the standard Swift KeyPath requires that binding premise.','No instantiated generic layout, actual captured instance, alias/field stability, active default target, native ABI or invocation domain follows.'];
await fs.writeFile(path.join(out,'declaration-substitution.json'),JSON.stringify(relation,null,2)+'\n');
await fs.writeFile(path.join(out,'fact-index.json'),JSON.stringify({records:facts},null,2)+'\n');
const history=await json(path.join(out,'history-verification.json'));assert.equal(history.snapshots.length,15);
const result={status:'passed',runtime_files:manifest.files.length,source_files:manifest.source_files.length,source_tests:88,public_calls:total,final_runtime_public_calls:finalCalls,cli_mcp_exact_pairs:4,sessions,mutually_exclusive_interpretations_schema_rejected:conflictRejected,owned:{decoded_template_fields:6,generic_parameter_indices:[0,1,2],constrained_nested_foreign_owners_rejected:true,budget_degradation:true,deliberate_negative_derivatives:3,foreign_symbol_identity_control:true},arc:{selected_wrapper:member.owner.address,keypath_root_descriptor:member.type.arguments[0].descriptor.address,parameter_index:0,derived_value_descriptor:app.arguments[0].descriptor.address,member_substitution:'verified analyst declaration composition; not automated',external_signature:'unresolved',generic_layout:'unresolved',native_abi:'unresolved',root_layout_unchanged:true,existing_closure_declarations_unchanged:true,actual_captured_instance_and_stability:'unresolved',invocation_mapping:'unimplemented'},unchanged_native_analysis_sources:unchanged,historical_snapshots:15,target_executed:false};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:'passed',public_calls:total,final_runtime_calls:finalCalls,cli_pairs:4}));
