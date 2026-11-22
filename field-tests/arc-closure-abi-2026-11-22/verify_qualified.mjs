import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),hash=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-qualified-manifest.json')),runtime=manifest.runtime_root,req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(hash(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(hash(await fs.readFile(path.join(root,f.path))),f.sha256);
const base=path.join(out,'mcp-qualified'),calls=await json(path.join(base,'invocations.json')),summary=await json(path.join(base,'summary.json')),catalog=await json(path.join(base,'catalog.json'));
assert.equal(summary.status,'completed');assert.equal(summary.calls,36);assert.equal(summary.successful,34);assert.equal(summary.errors,2);assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
const records=new Map(),sessions=[];
for(const prefix of ['ordinary','resilient','frozen','merged','arc']){
 const bundle=await json(path.join(base,prefix+'.bundle.json')),open=calls.find(c=>c.reply===prefix+'-open.reply.json'),bytes=await fs.readFile(open.arguments.path),sha=hash(bytes);
 for(const e of bundle.records){parseEvidence(e);assert.equal(e.subject.digest.sha256,sha);records.set(e.evidence_id,e);}
 const group=calls.filter(c=>c.reply.startsWith(prefix+'-'));assert.deepEqual(group.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 sessions.push({prefix,path:open.arguments.path,sha256:sha,bytes:bytes.length,bundle_records:bundle.records.length,closed_twice:true});
}
assert.equal(sessions.at(-1).sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map();
const validator=s=>{assert.ok(ajv.validateSchema(s));const key=s.$id??JSON.stringify(s);if(validators.has(key)){const prev=validators.get(key);assert.deepEqual(prev.schema,s);return prev.fn;}const fn=ajv.compile(s);validators.set(key,{schema:s,fn});return fn;};
for(const c of calls){
 assert.equal(c.thrown,null);const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));const reply=await json(path.join(base,c.reply));
 if(c.is_error){assert.ok(['bad-facet.reply.json','missing-owner.reply.json'].includes(c.reply));const err=JSON.parse(reply.content.find(b=>b.type==='text').text).error;assert.equal(err.code,'invalid_request');assert.equal(err.category,'invalid_input');continue;}
 const e=reply.structuredContent;assert.ok(validator(t.outputSchema)(e));toolContract(c.name).outputSchema.parse(e);assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
 if(c.evidence_id){parseEvidence(e);assert.equal(e.evidence_id,c.evidence_id);assert.deepEqual(e,records.get(e.evidence_id));}
}
const evidence=async label=>json(path.join(base,label+'.evidence.json'));
const fields=async label=>(await evidence(label)).normalized_result.result.swift_type_fields;
const profiles=await json(path.join(out,'fixture/identities.json')),build=await json(path.join(out,'fixture/build.json'));
assert.equal(build.target_executed,false);assert.equal(build.commands.length,9);assert.ok(build.commands.every(c=>c.exit_code===0));
const abiControls=[];
for(const profile of profiles){
 const e=await evidence(profile.label+'-metadata'),f=e.normalized_result.result.swift_type_fields,m=f.static_metadata;
 const binary=await fs.readFile(profile.path);assert.equal(hash(binary),build.binaries.find(b=>b.profile===profile.label).sha256);
 assert.equal(e.normalized_result.provider.id,'native-macos');assert.equal(m.owner_matched,true);assert.equal(m.decode.status,'decoded');assert.deepEqual(m.field_offsets.map(x=>x.byte_offset),[0]);assert.equal(m.value_witness.size_bytes,'16');
 assert.equal(f.fields[0].function_type.sendable,true);assert.equal(f.fields[0].function_type.declared_argument_domain.upper_exclusive,297);assert.equal(f.fields[0].function_type.argument_abi.status,'unresolved');assert.equal(f.referenced_enums[0].descriptor.address,profile.enum);
 const flags=binary.readUInt32LE(f.referenced_enums[0].descriptor.file_offset);assert.equal(flags,0x52);
 const text=await fs.readFile(path.join(out,'fixture',profile.label+'.ll'),'utf8'),start=text.indexOf('define swiftcc i1 @"$s17ClosureABIControl6invoke');assert.ok(start>=0);const body=text.slice(start,text.indexOf('\n}',start)+2);
 const call=/call swiftcc i1 %0\((i16|ptr)\b/.exec(body);assert.ok(call);assert.equal(call[1],profile.label==='resilient'?'ptr':'i16');
 abiControls.push({profile:profile.label,enum_descriptor_flags:flags,cases:297,reflected_sendable:true,reflected_result:'Bool',value_witness_size:'16',field_offset:0,owned_ir_argument:call[1],argument_abi:'unresolved',invoke_ir:body});
}
const typed=await fields('merged-TypedClient'),foreign=await fields('merged-WrongOwnerClient'),wrong=await fields('merged-wrong-owner');
assert.equal(typed.static_metadata.value_witness.initialize_with_copy.address,foreign.static_metadata.value_witness.initialize_with_copy.address);assert.equal(wrong.static_metadata.owner_matched,false);assert.deepEqual(wrong.static_metadata.field_offsets,[]);assert.match(wrong.static_metadata.decode.reason,/backpointer/);
const wrongCoverage=(await evidence('merged-wrong-owner')).normalized_result.result.coverage.find(c=>c.facet==='swift_static_struct_layout');assert.equal(wrongCoverage.examined,0);assert.equal(wrongCoverage.decoded,0);
const budget=await evidence('ordinary-budget');assert.equal(budget.normalized_result.result.swift_type_fields.decode.status,'decoded');assert.equal(budget.normalized_result.result.swift_type_fields.static_metadata.decode.status,'partial');assert.equal(budget.normalized_result.result.swift_type_fields.static_metadata.field_offsets.length,0);assert.match(budget.normalized_result.result.swift_type_fields.static_metadata.decode.reason,/max_records/);assert.equal(budget.normalized_result.result.coverage.find(c=>c.facet==='swift_static_struct_layout').examined,0);assert.equal(budget.normalized_result.result.coverage.find(c=>c.facet==='binary_relative_pointers').status,'partial');
const arcEvidence=await evidence('arc-metadata'),arc=arcEvidence.normalized_result.result.swift_type_fields,layout=arc.static_metadata,original=await fs.readFile(arcEvidence.subject.local_path);
assert.equal(layout.owner_matched,true);assert.equal(layout.decode.status,'decoded');assert.equal(layout.kind_word,'0x200');assert.equal(layout.field_offset_entry_bytes,4);assert.equal(layout.field_offset_vector_word_offset,2);assert.equal(layout.field_offset_vector.address,'0x1042c8ad0');assert.deepEqual(layout.field_offsets.map(f=>f.byte_offset),Array.from({length:23},(_,i)=>i*16));assert.equal(layout.value_witness.location.address,'0x1042c8a58');assert.equal(layout.value_witness.size_bytes,'368');assert.equal(layout.value_witness.stride_bytes,'368');assert.equal(layout.value_witness.initialize_with_copy.address,'0x100d97b04');
for(const item of layout.field_offsets)assert.equal(original.readUInt32LE(item.source.file_offset),item.byte_offset);
assert.equal(original.readBigUInt64LE(layout.location.file_offset),0x200n);assert.equal(original.readBigUInt64LE(layout.value_witness.location.file_offset+64).toString(),'368');assert.equal(original.readBigUInt64LE(layout.value_witness.location.file_offset+72).toString(),'368');
assert.equal(arc.fields.length,23);assert.equal(arc.decode.status,'partial');assert.equal(arc.fields[0].function_type.argument_abi.status,'unresolved');assert.equal(arc.fields[0].function_type.declared_argument_domain.upper_exclusive,297);
const unselected=await fields('arc-declaration-only');assert.equal(unselected.static_metadata,undefined);assert.equal((await evidence('arc-declaration-only')).normalized_result.result.coverage.find(c=>c.facet==='swift_static_struct_layout').status,'not_requested');
const wrapper=await evidence('arc-instructions-0x100cce81c');assert.equal(wrapper.provider.id,'ghidra');assert.equal(wrapper.analysis_profile.parameters.swift_enum_switch_recovery,'abi-signed-word-cfg-v10');
const anchors=['0x100cce82c: mov x1, x0','0x100cce830: adrp x2, 0x1042c8000','0x100cce834: add x2, x2, #0xac0','0x100cce838: ldur x8, [x2, #-0x8]','0x100cce83c: ldr x8, [x8, #0x10]','0x100cce840: mov x0, x19','0x100cce844: blr x8'];for(const a of anchors)assert.ok(wrapper.normalized_result.instructions.includes(a));
const copy=await evidence('arc-instructions-0x100d97b04'),getter=await evidence('arc-instructions-0x100d929a0');assert.ok(copy.normalized_result.instructions.includes('0x100d97b34: stp q0, q1, [x19]'));assert.ok(copy.normalized_result.instructions.includes('0x100d97c04: bl 0x1036404f8'));assert.ok(getter.normalized_result.instructions.includes('0x100d929f0: add x0, sp, #0x170'));assert.ok(getter.normalized_result.instructions.includes('0x100d929f8: bl 0x100cce81c'));
const view=await evidence('arc-copy-summary');const parent=view.operation==='inspect_analysis_view'?records.get(view.normalized_result.parent_evidence_id):view;assert.ok(parent);assert.equal(parent.operation,'analyze_function');assert.equal(parent.analysis_profile.parameters.swift_enum_switch_recovery,'abi-signed-word-cfg-v10');assert.equal(parent.subject.digest.sha256,arcEvidence.subject.digest.sha256);
const cli=await json(path.join(out,'cli-qualified-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,3);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const result={status:'passed',mcp_calls:36,successful:34,expected_invalid_requests:2,exact_cli_mcp_comparisons:3,runtime_files:manifest.files.length,sessions,abi_controls:abiControls,shared_helper_does_not_bind_owner:true,measured_partial_coverage:true,arc:{metadata:'0x1042c8ac0',owner:'0x103d648c4',field_offsets:layout.field_offsets.map(f=>f.byte_offset),value_witness:'0x1042c8a58',initialize_with_copy:'0x100d97b04',size:368,stride:368,argument_abi:'unresolved',wrapper_instructions:wrapper.normalized_result.instructions.length,copy_instructions:copy.normalized_result.instructions.length,getter_instructions:getter.normalized_result.instructions.length},target_executed:false,limitations:['Reflection, current value-witness size and a nominal descriptor do not prove direct versus indirect argument passing; controlled compiler outputs demonstrate both.','Static metadata binds field offsets and VWT identity, not a live source buffer, constructor signature, closure code/context origin, VWT purity, post-copy stability or runtime dependency selection.','The selected normal-VWT source snapshot is a conditional analyst derivation from exact metadata and wrapper instructions, not an automatic complete invocation-context producer.','No helper-global 297-case CFG/table override is created; item63 remains open.']};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,mcp_calls:36,cli_pairs:3,runtime_files:manifest.files.length}));
