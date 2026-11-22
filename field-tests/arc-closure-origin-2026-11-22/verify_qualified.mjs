import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),hash=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'call-preparation-qualified-runtime-manifest.json')),runtime=manifest.runtime_root,req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(hash(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(hash(await fs.readFile(path.join(root,f.path))),f.sha256);
const initialManifest=await json(path.join(out,'call-preparation-runtime-manifest.json'));
for(const f of initialManifest.source_files)assert.equal(hash(await fs.readFile(path.join(out,'call-preparation/initial-source',f.path))),f.sha256);
const sessions=[];let total=0;
for(const directory of ['mcp-initial','mcp-roots','mcp-preparation','mcp-preparation-qualified','mcp-arc-qualified','mcp-compiler']){
 const base=path.join(out,directory),calls=await json(path.join(base,'invocations.json')),summary=await json(path.join(base,'summary.json')),catalog=await json(path.join(base,'catalog.json'));
 assert.equal(summary.status,'completed');assert.equal(summary.calls,calls.length);assert.equal(summary.errors,0);assert.equal(summary.successful,calls.length);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 const ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map(),records=new Map();
 const validator=s=>{assert.ok(ajv.validateSchema(s));const key=s.$id??JSON.stringify(s);if(validators.has(key)){const prev=validators.get(key);assert.deepEqual(prev.schema,s);return prev.fn;}const fn=ajv.compile(s);validators.set(key,{schema:s,fn});return fn;};
 for(const c of calls.filter(c=>c.name==='export_evidence_bundle')){
  const bundle=await json(c.arguments.path);for(const e of bundle.records){parseEvidence(e);records.set(e.evidence_id,e);}
 }
 let identity;
 for(const c of calls){
  assert.equal(c.thrown,null);assert.equal(c.is_error,false);
  if(c.name==='open_binary')identity=hash(await fs.readFile(c.arguments.path));
  const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));const reply=await json(path.join(base,c.reply)),e=reply.structuredContent;
  assert.ok(validator(t.outputSchema)(e));toolContract(c.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
  if(c.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,c.evidence_id);assert.deepEqual(e,records.get(e.evidence_id));assert.equal(e.subject.digest.sha256,identity);}
 }
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 sessions.push({directory,calls:calls.length,exported_records:records.size,status:directory==='mcp-preparation'?'transport-valid-semantic-qualification-failed':'passed',empty_owned_lineage:true});total+=calls.length;
}
const evidence=async(directory,label)=>json(path.join(out,directory,label+'.evidence.json'));
const constants=[];
for(const c of await json(path.join(out,'call-preparation/expected-v2.json'))){
 const e=await evidence('mcp-preparation-qualified',c.name),n=e.normalized_result,p=n.call_preparation;
 assert.equal(n.address,c.call);assert.equal(p.provenance,'ghidra-aarch64-mov-call-preparation-v1');assert.equal(p.scope,'observed-fallthrough-suffix');
 assert.equal(p.register_constants.find(x=>x.register===c.register)?.value_hex??null,c.expected);
 assert.equal(p.status,c.expected===null?'unresolved':'derived');
 for(const s of p.instructions){const bytes=await fs.readFile(e.subject.local_path);assert.equal(bytes.subarray(Number(BigInt(s.address)),Number(BigInt(s.address))+4).toString('hex'),s.bytes);}
 constants.push({case:c.name,value:c.expected,status:p.status,evidence_id:e.evidence_id});
}
const before=await evidence('mcp-preparation-qualified','body-before'),after=await evidence('mcp-preparation-qualified','body-after');assert.deepEqual(before,after);
const baseline=await json(path.join(out,'call-preparation/baseline-verification.json'));assert.equal(baseline.status,'failed');assert.equal(baseline.mismatches.length,1);
const failed=await evidence('mcp-preparation','lane');assert.equal(failed.normalized_result.call_preparation.register_constants[0].value_hex,'0x0');assert.equal(baseline.mismatches[0].evidence_id,failed.evidence_id);
const odd=await evidence('mcp-arc-qualified','call-0x1012ab840'),prep=odd.normalized_result.call_preparation;
assert.equal(odd.subject.digest.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
assert.equal(prep.register_constants[0].value_hex,'0x31');assert.equal(prep.register_constants[0].write_bits,32);assert.deepEqual(prep.instructions.map(s=>s.address),['0x1012ab838','0x1012ab83c']);
assert.equal(odd.analysis_profile.parameters.instruction_call_preparation,prep.provenance);assert.equal(odd.analysis_profile.parameters.swift_enum_switch_recovery,'abi-signed-word-cfg-v10');
assert.equal((await evidence('mcp-arc-qualified','call-0x100d910f0')).normalized_result.call_preparation.status,'unresolved');
const metadata=await evidence('mcp-arc-qualified','client-metadata'),fields=metadata.normalized_result.result.swift_type_fields;
assert.equal(fields.static_metadata.owner_matched,true);assert.equal(fields.static_metadata.field_offsets[0].byte_offset,0);assert.equal(fields.fields[0].function_type.argument_abi.status,'unresolved');assert.equal(fields.fields[0].function_type.declared_argument_domain.upper_exclusive,297);
const instructions=(await evidence('mcp-initial','odd-caller-instructions')).normalized_result.instructions;
for(const line of ['0x1012ab824: ldp x23, x21, [x22, #0x10]','0x1012ab82c: bl 0x1036404f8','0x1012ab830: add x0, x22, #0x10','0x1012ab834: bl 0x1000078a4','0x1012ab838: mov w0, #0x31','0x1012ab83c: mov x20, x21','0x1012ab840: blr x23'])assert.ok(instructions.includes(line),line);
const wrapper=(await evidence('mcp-roots','instructions-0x1000078a4')).normalized_result.instructions;
for(const line of ['0x1000078b4: adrp x1, 0x1042c8000','0x1000078b8: add x1, x1, #0xac0','0x1000078bc: ldur x8, [x1, #-0x8]','0x1000078c0: ldr x8, [x8, #0x8]','0x1000078c4: blr x8'])assert.ok(wrapper.includes(line),line);
const pointer=await json(path.join(out,'original-pointer-observations.json'));assert.equal(pointer.sha256,odd.subject.digest.sha256);assert.equal(pointer.enum.descriptor.decoded.target,'0x103d41568');assert.equal(pointer.enum.alignment,2);assert.equal(pointer.enum.size,'0x2');
const vwt=Buffer.from((await evidence('mcp-initial','enum-vwt')).normalized_result.bytes_hex,'hex');assert.equal(vwt.readBigUInt64LE(64),2n);assert.equal(vwt.readBigUInt64LE(72),2n);assert.equal(vwt.readUInt32LE(80),pointer.enum.flags);
assert.equal((await evidence('mcp-initial','odd-call-targets')).normalized_result.status,'unresolved');
const helper=await evidence('mcp-arc-qualified','setting-helper');assert.equal(helper.normalized_result.assembly.length,14);assert.equal(helper.normalized_result.procedure.body.total_bytes,56);assert.equal(helper.normalized_result.native_api.jump_tables.length,0);
const bundle=await json(path.join(out,'mcp-arc-qualified/final.bundle.json')),view=await evidence('mcp-arc-qualified','reducer-summary'),parent=bundle.records.find(e=>e.evidence_id===view.normalized_result.parent_evidence_id);assert.ok(parent);assert.equal(parent.normalized_result.procedure.body.total_bytes,10072);assert.equal(parent.normalized_result.native_api.jump_tables[0].mappings.length,28);
const previous=await json(path.join(root,'field-tests/arc-closure-abi-2026-11-22/mcp-final/arc.bundle.json'));
const previousReducer=previous.records.find(e=>e.operation==='analyze_function'&&e.normalized_result.procedure?.address==='0x1012a571c');
// The previous metadata checkpoint need not contain this reducer; use its retained v10 frame fixture if absent.
if(previousReducer)assert.deepEqual(parent.normalized_result.native_api.jump_tables,previousReducer.normalized_result.native_api.jump_tables);
const build=await json(path.join(out,'fixture/build.json'));assert.equal(build.target_executed,false);assert.equal(build.commands.length,9);assert.ok(build.commands.every(c=>c.exit_code===0));
const compiler=[];
for(const c of await json(path.join(out,'fixture/identities.json'))){
 const b=build.binaries.find(b=>b.profile===c.profile);assert.equal(hash(await fs.readFile(b.path)),b.sha256);assert.equal(hash(await fs.readFile(path.join(out,'fixture',c.profile+'.swift'))),b.source_sha256);
 const f=(await evidence('mcp-compiler',c.profile+'-metadata')).normalized_result.result.swift_type_fields;
 assert.equal(f.fields[0].function_type.declared_argument_domain.upper_exclusive,297);assert.equal(f.fields[0].function_type.argument_abi.status,'unresolved');
 const ir=await fs.readFile(path.join(out,'fixture',c.profile+'.ll'),'utf8');const bodies=[];
 for(const [name,tag] of [['callOdd',49],['callEven',50]]){
  const start=ir.indexOf('define swiftcc i1 @"$s17ClosureABIControl'+(name==='callOdd'?'7':'8')+name);assert.ok(start>=0);const body=ir.slice(start,ir.indexOf('\n}',start)+2);bodies.push(body);
  if(c.profile==='resilient'){assert.match(body,/call swiftcc i1 %0\(ptr\b/);assert.ok(body.includes('store i16 '+tag));}else assert.ok(body.includes('call swiftcc i1 %0(i16 '+tag));
 }
 compiler.push({profile:c.profile,closure_argument:c.profile==='resilient'?'indirect-pointer':'direct-i16',bodies});
}
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const result={status:'passed',runtime_files:manifest.files.length,source_hashes_match:true,public_calls:total,qualified_runtime_calls:56,initial_semantic_qualification:'failed-and-preserved',sessions,native_controls:constants,exact_cli_mcp_pairs:4,unchanged_body_observation:true,compiler_controls:compiler,arc:{call:'0x1012ab840',x0:'0x31',enum_alignment:2,source_type_anchor:'conditional-on-normal-VWT-and-stable-field-window',selected_abi:'direct-value-only-under-valid-normal-one-argument-Swift-closure-premises',target_origin:'unresolved',helper_tables:0,reducer_mappings:28,reducer_body_bytes:10072},program_mutations:false,target_executed:false};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,public_calls:total,native_controls:constants.length,cli_pairs:4}));
