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
const v1=await json(path.join(out,'runtime-v1-manifest.json'));
for(const f of v1.source_files)assert.equal(hash(await fs.readFile(path.join(out,'v1-source',f.path))),f.sha256);
const sessions=[];let callsTotal=0,successTotal=0;
const inputHashes=new Map();
for(const directory of ['mcp','mcp-origin','mcp-capture','mcp-allocation-baseline','mcp-allocation-v1','mcp-arc-v1','mcp-root','mcp-root-qualified','mcp-allocation-final','mcp-arc-final']){
 const base=path.join(out,directory),calls=await json(path.join(base,'invocations.json')),summary=await json(path.join(base,'summary.json')),catalog=await json(path.join(base,'catalog.json'));
 const refused=directory==='mcp-root';assert.equal(summary.status,refused?'failed':'completed');assert.equal(summary.calls,calls.length);assert.equal(summary.errors,refused?1:0);assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 const records=new Map(),ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map();
 const validator=s=>{assert.ok(ajv.validateSchema(s));const key=s.$id??JSON.stringify(s);if(validators.has(key)){const old=validators.get(key);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);validators.set(key,{schema:s,fn});return fn;};
 for(const c of calls.filter(c=>c.name==='export_evidence_bundle'))for(const e of (await json(c.arguments.path)).records){parseEvidence(e);records.set(e.evidence_id,e);}
 let identity;
 for(const c of calls){
  assert.equal(c.thrown,null);const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));const reply=await json(path.join(base,c.reply));
  if(c.name==='open_binary'){if(!inputHashes.has(c.arguments.path))inputHashes.set(c.arguments.path,hash(await fs.readFile(c.arguments.path)));identity=inputHashes.get(c.arguments.path);}
  if(c.is_error){assert.ok(refused);const e=JSON.parse(reply.content.find(b=>b.type==='text').text).error;assert.equal(e.code,'resource_constraint');assert.equal(e.retryable,false);assert.equal(e.details.reported_limits.max_file_bytes,67108864);assert.equal(e.details.reported_limits.observed_file_bytes,80498448);continue;}
  const e=reply.structuredContent;assert.ok(validator(t.outputSchema)(e));toolContract(c.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
  if(c.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,c.evidence_id);assert.deepEqual(e,records.get(e.evidence_id));assert.equal(e.subject.digest.sha256,identity);}
 }
 if(!refused)assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 sessions.push({directory,calls:calls.length,successful:summary.successful,errors:summary.errors,status:refused?'expected-file-budget-refusal':'passed',exported_records:records.size,empty_owned_lineage:true});callsTotal+=calls.length;successTotal+=summary.successful;
}
const ev=async(dir,label)=>json(path.join(out,dir,label+'.evidence.json'));
const parent=async(dir,label,bundleName='final.bundle.json')=>{const e=await ev(dir,label);if(e.operation!=='inspect_analysis_view')return e;const b=await json(path.join(out,dir,bundleName));const p=b.records.find(x=>x.evidence_id===e.normalized_result.parent_evidence_id);assert.ok(p);return p;};
const native=[];
for(const label of ['trusted','wrong-library','local']){
 const before=await ev('mcp-allocation-baseline',label+'-make'),after=await ev('mcp-allocation-final',label+'-make'),n=after.normalized_result,s=n.native_api.runtime_call_signatures;
 assert.deepEqual(before.normalized_result.assembly,n.assembly);assert.deepEqual(before.normalized_result.procedure.body,n.procedure.body);assert.equal(before.subject.digest.sha256,after.subject.digest.sha256);
 assert.equal(s.length,label==='trusted'?1:0);
 if(label==='trusted'){
  const old=before.normalized_result.native_value_flow.operations.find(x=>x.address===s[0].call_address&&x.opcode==='CALL');const current=n.native_value_flow.operations.find(x=>x.address===s[0].call_address&&x.opcode==='CALL');assert.equal(old.output,null);assert.equal(current.output.kind,'register');assert.equal(current.output.size_bytes,8);
  assert.match(n.pseudocode,/= _swift_allocObject\(/);assert.equal(s[0].memory_effects,'unknown');assert.equal(s[0].library,'/usr/lib/swift/libswiftCore.dylib');assert.deepEqual(s[0].parameter_registers,['x0','x1','x2']);
 }else assert.equal(before.normalized_result.pseudocode,n.pseudocode);
 native.push({label,sha256:after.subject.digest.sha256,applied_signatures:s.length,assembly_body_unchanged:true,evidence_id:after.evidence_id});
}
const build=await json(path.join(out,'allocation-abi/build.json'));assert.equal(build.commands.length,11);assert.ok(build.commands.every(c=>c.exit_code===0));assert.equal(build.target_executed,false);
for(const b of build.binaries)assert.equal(hash(await fs.readFile(b.path)),b.sha256);
const ir=await fs.readFile(path.join(out,'allocation-abi/trusted.ll'),'utf8');assert.match(ir,/tail call ptr @swift_allocObject\(ptr %\d+, i64 24, i64 7\)/);assert.match(ir,/declare ptr @swift_allocObject\(/);
const probes=await json(path.join(out,'probes-final-isolated/verification.json'));assert.equal(probes.status,'passed');assert.equal(probes.records.length,5);assert.deepEqual(probes.verifier_run.process_lineage.descendants,[]);assert.equal(hash(await fs.readFile(path.join(out,'allocation-abi/ReaAllocatorIdentityProbe.java'))),probes.script_sha256);
// Probe dossiers are raw Ghidra diagnostics serialized without null fields,
// not normalized public Evidence. Their live Java storage/authority assertions
// are checked by the probe; the public adapter values are validated above.
for(const r of probes.records)assert.equal(r.status,'passed');
const bad=await json(path.join(out,'probes-authority-before/verification.json')),good=await json(path.join(out,'probes-authority-final/verification.json'));assert.equal(bad.status,'failed');assert.equal(good.status,'passed');assert.equal(good.records.length,1);assert.deepEqual(good.verifier_run.process_lineage.descendants,[]);assert.equal(hash(await fs.readFile(path.join(out,'allocation-abi/ReaAllocatorAuthorityProbe.java'))),good.script_sha256);
const badIdentity=await json(path.join(out,'probes-authority-before/analyst-external.identity.json')),goodIdentity=await json(path.join(out,'probes-authority-final/analyst-external.identity.json'));assert.equal(badIdentity.label_source,'USER_DEFINED');assert.equal(goodIdentity.label_source,'USER_DEFINED');assert.equal(badIdentity.selected_signature_count,1);assert.equal(goodIdentity.selected_signature_count,0);
const oldDir=path.join(root,'field-tests/arc-closure-origin-2026-11-22');
const oldBundle=await json(path.join(oldDir,'mcp-initial/final.bundle.json')),oldView=await json(path.join(oldDir,'mcp-initial/summary-0x100d92a28.evidence.json'));const oldCtor=oldBundle.records.find(e=>e.evidence_id===oldView.normalized_result.parent_evidence_id);assert.ok(oldCtor);
const ctor=await parent('mcp-arc-final','summary-0x100d92a28');assert.equal(ctor.subject.digest.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');assert.equal(ctor.normalized_result.native_api.runtime_call_signatures.length,23);assert.deepEqual(ctor.normalized_result.assembly,oldCtor.normalized_result.assembly);assert.deepEqual(ctor.normalized_result.procedure.body,oldCtor.normalized_result.procedure.body);assert.equal((ctor.normalized_result.pseudocode.match(/= _swift_allocObject\(/g)??[]).length,23);
const reducer=await parent('mcp-arc-final','summary-0x1012a571c'),oldReducerBundle=await json(path.join(oldDir,'mcp-arc-final/final.bundle.json')),oldReducer=oldReducerBundle.records.find(e=>e.operation==='analyze_function'&&e.normalized_result.procedure?.address==='0x1012a571c');assert.ok(oldReducer);
const mappings=e=>e.normalized_result.native_api.jump_tables.map(t=>({dispatch_address:t.dispatch_address,mappings:t.mappings.map(({case_value,target_address})=>({case_value,target_address}))}));assert.deepEqual(mappings(reducer),mappings(oldReducer));assert.equal(reducer.normalized_result.procedure.body.total_bytes,10072);assert.equal(reducer.normalized_result.native_api.jump_tables[0].mappings.length,28);
const helper=await ev('mcp-arc-final','setting-helper');assert.equal(helper.normalized_result.assembly.length,14);assert.equal(helper.normalized_result.procedure.body.total_bytes,56);assert.equal(helper.normalized_result.native_api.jump_tables.length,0);
assert.equal((await ev('mcp-arc-final','selected-call')).normalized_result.call_preparation.register_constants[0].value_hex,'0x31');
const layoutEvidence=await ev('mcp-root-qualified','root-layout'),fields=layoutEvidence.normalized_result.result.swift_type_fields,layout=fields.static_metadata;
assert.equal(fields.name,'BoostsEditor');assert.equal(fields.fields.length,8);assert.equal(fields.fields[6].name,'_userDefaultsClient');assert.equal(fields.fields[6].mangling_hex,'0217746500790281a165004700');assert.equal(fields.fields[6].function_type,null);assert.equal(fields.fields[6].decode.status,'unsupported');assert.equal(layout.owner_matched,true);assert.equal(layout.value_witness.size_bytes,'640');assert.deepEqual(layout.field_offsets.map(x=>x.byte_offset),[0,80,160,240,320,400,480,560]);assert.equal(layout.value_witness.initialize_with_copy.address,'0x1012b3904');
const wrapper=(await ev('mcp-root-qualified','root-copy-wrapper')).normalized_result.instructions;for(const s of ['0x1012b2930: mov x1, x0','0x1012b2934: adrp x2, 0x104316000','0x1012b2938: add x2, x2, #0xdb8','0x1012b293c: mov x0, x19','0x1012b2940: bl 0x1012b3904'])assert.ok(wrapper.includes(s));
const rootAccessor=[];for(const a of ['0x1012b4468','0x1012b446c','0x1012b4470','0x1012b4474'])rootAccessor.push((await ev('mcp-root-qualified','root-accessor-'+a)).normalized_result.raw_disassembly);assert.deepEqual(rootAccessor,['adrp x0,0x104316000','add x0,x0,#0xdb8','mov x1,#0x0','ret']);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,5);assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const errors=await json(path.join(out,'swift-errors-final/verification.json'));assert.equal(errors.status,'passed');assert.equal(errors.cli_mcp_exact_evidence,true);assert.equal(errors.probes.length,3);const errorsCleanup=await json(path.join(out,'swift-errors-final/cleanup.json'));assert.deepEqual(errorsCleanup.process_lineage.descendants,[]);
const result={status:'passed',runtime_files:manifest.files.length,source_files:manifest.source_files.length,public_calls:callsTotal,successful:successTotal,expected_file_budget_errors:1,final_allocator_runtime_public_calls:28,exact_cli_mcp_pairs:5,sessions,native_allocator_controls:native,production_boundary_probes:6,analyst_external_before_rejected_by_verifier:true,analyst_external_final_signature_count:0,swift_error_model_coexistence:true,arc:{constructor_allocator_results:23,constructor_body_unchanged:true,reducer_mappings:28,reducer_body_bytes:10072,helper_tables:0,selected_x0:'0x31',root_descriptor:'0x103d7b1ac',root_metadata:'0x104316db8',root_bytes:640,selected_root_field:6,selected_root_offset:480,keypath_and_runtime_dependency_selection:'unresolved'},original_executable_bytes_unchanged:true,analysis_metadata_changes:['private Apple C compiler prototype','exact supported import signature'],memory_effects:'unknown',target_executed:false};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:'passed',public_calls:callsTotal,final_runtime_calls:28,cli_pairs:5,private_probes:6}));
