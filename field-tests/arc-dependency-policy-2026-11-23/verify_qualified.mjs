import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const manifestPath=path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'),manifest=await json(manifestPath),runtime=manifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoFixups.js'));
for(const row of manifest.files){const b=await fs.readFile(path.join(runtime,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
for(const row of manifest.source_files)assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256);
const artifact=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(artifact),digest=sha(bytes);assert.equal(digest,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);
const records=new Map(),completeIds=new Set(),sessions=[],errors=[],programWords=[];let calls=0,successful=0,nativeInstructions=0,rawReads=0;
for(const directory of ['mcp','mcp-final','mcp-details']){
 const dir=path.join(out,directory),summary=await json(path.join(dir,'summary.json'));assert.equal(summary.status,directory==='mcp'?'failed':'completed');assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push(summary.verifier_run);calls+=summary.calls;successful+=summary.successful;
 for(const row of await json(path.join(dir,'invocations.json'))){
  assert.equal(row.thrown,null);const reply=await json(path.join(dir,row.reply));
  if(row.is_error){const e=JSON.parse(reply.content.find(c=>c.type==='text').text).error;assert.equal(e.code,'invalid_request');assert.match(e.details.issues[0].message,/No procedure exists/);errors.push({directory,operation:row.name,arguments:row.arguments,error:e});continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);
  if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent);assert.equal(e.subject?.digest.sha256,digest);records.set(e.evidence_id,e);if(directory!=='mcp')completeIds.add(e.evidence_id);const r=e.normalized_result;
  if(e.operation==='inspect_native_instruction'&&r.status==='decoded'){
   const offset=layout.offset(BigInt(r.address),r.length);assert.equal(bytes.subarray(offset,offset+r.length).toString('hex'),r.bytes);nativeInstructions++;
  }
  if(e.operation==='read_bytes'){
   const address=BigInt(r.address),offset=layout.offset(address,r.returned_bytes),observed=Buffer.from(r.bytes_hex,'hex'),original=bytes.subarray(offset,offset+observed.length);rawReads++;
   if(original.equals(observed))continue;
   assert.equal(observed.length%8,0);
   for(let at=0;at<observed.length;at+=8){const raw=original.readBigUInt64LE(at),value=observed.readBigUInt64LE(at);if(raw===value)continue;const decoded=fixups.decode(address+BigInt(at),raw);assert.notEqual(decoded.kind,'unsupported');if(decoded.kind==='rebase')assert.equal(decoded.target,value);programWords.push({evidence_id:e.evidence_id,address:'0x'+(address+BigInt(at)).toString(16),original_word:'0x'+raw.toString(16),program_word:'0x'+value.toString(16),fixup:decoded.kind,...(decoded.kind==='bind'?{symbol:decoded.symbol,library:decoded.library,program_binding_identity:'unverified-unused-in-policy-proof'}:{target:'0x'+decoded.target.toString(16)})});}
  }
 }
}
assert.equal(calls,337);assert.equal(successful,335);assert.equal(errors.length,2);
const reused=await json(path.join(out,'reused-sources.json'));assert.equal(reused.length,19);
for(const row of reused){const b=await fs.readFile(path.join(root,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);const e=parseEvidence(JSON.parse(b.toString('utf8')));assert.equal(e.evidence_id,row.evidence_id);records.set(e.evidence_id,e);completeIds.add(e.evidence_id);}
const evidence=async(d,l)=>parseEvidence(await json(path.join(out,d,l+'.evidence.json')));
const result=async(d,l)=>(await evidence(d,l)).normalized_result;
const checks=[];
const line=async(d,l,text)=>{const e=await evidence(d,l);assert.ok(e.normalized_result.instructions.includes(text),text);checks.push({evidence_id:e.evidence_id,instruction:text});};
for(const [label,text] of [
 ['instructions-0x1006fc4d0','0x1006fc5c8: mov w21, #0x0'],['instructions-0x1006fc4d0','0x1006fc644: mov w21, #0x1'],['instructions-0x1006fc4d0','0x1006fc6a4: mov w21, #0x2'],
 ['instructions-0x100008168','0x100008194: mov x0, x19'],['instructions-0x100008168','0x100008198: mov x1, x20'],['instructions-0x100008168','0x10000819c: blr x8'],
 ['instructions-0x10087794c','0x100877f3c: adrp x0, 0x1036f3000'],['instructions-0x10087794c','0x100877f40: add x0, x0, #0xc00'],['instructions-0x10087794c','0x100877f44: bl 0x1036402b8'],['instructions-0x10087794c','0x10087800c: bl 0x100871440'],
 ['instructions-0x100d91000','0x100d91058: bl 0x103652dc0'],['instructions-0x100d91000','0x100d91068: cbnz x19, 0x100d91084'],['instructions-0x100d91000','0x100d91074: bl 0x10366a440'],
])await line('mcp-final',label,text);
const fields=(await result('mcp-final','context-fields')).result.swift_type_fields;assert.equal(fields.name,'DependencyContext');assert.deepEqual(fields.fields.map(x=>x.name),['live','preview','test']);assert.equal(fields.static_metadata.decode.status,'partial');
assert.equal((await result('mcp-final','context-override-key')).strings[0].value,'SWIFT_DEPENDENCIES_CONTEXT');assert.equal((await result('mcp-final','preview-flag-key')).strings[0].value,'XCODE_RUNNING_FOR_PREVIEWS');
const key=(await result('mcp-details','navigation-key-fields')).result.swift_type_fields,value=(await result('mcp-details','scope-value-fields')).result.swift_type_fields;assert.equal(key.name,'NavigationIDPathKey');assert.equal(key.descriptor.address,'0x103d4d1e4');assert.equal(value.name,'NavigationIDPath');assert.equal(value.descriptor.address,'0x103d4d188');
const conf=(await result('mcp-details','navigation-conformance-TestDependencyKey')).result;assert.equal(conf.swift_conformances.length,1);assert.equal(conf.swift_conformances[0].witness_table.address,'0x1045c82f0');assert.ok(conf.swift_dispatch_slots.some(s=>s.witness_data?.kind==='associated_type'&&s.witness_data.type_name==='NavigationIDPath'&&s.witness_data.context_descriptor.address==='0x103d4d188'));
const base=(await result('mcp-details','navigation-conformance-DependencyKey')).result;assert.ok(base.swift_dispatch_slots.some(s=>s.witness_data?.kind==='base_protocol'&&s.witness_data.type_descriptor.address==='0x103d4d1e4'&&s.witness_data.witness_table.address==='0x1045c82f0'));
for(const [label,text] of [['test-bool-0x100003b60','mov w0,#0x0'],['test-bool-0x100003b64','ret']])assert.equal((await result('mcp-details',label)).raw_disassembly,text);
for(const [label,text] of [['defaults-suite-selector','initWithSuiteName:'],['defaults-standard-selector','standardUserDefaults']])assert.equal(Buffer.from((await result('mcp-details',label)).bytes_hex,'hex').toString('utf8').split('\0')[0],text);
assert.equal((await result('mcp-details','suite-name-prefix')).strings[0].value,'com.dia.instance.');
const selected=await result('mcp-details','actual-call-table-observation');assert.equal(selected.invocation.link,'indirect-unresolved');assert.equal(selected.invocation.mapping_index,null);assert.equal(selected.invocation.effective_index,49);
const bundle=parseEvidenceBundle(await json(path.join(out,'mcp-details/final.bundle.json')));assert.equal(bundle.records.length,335);assert.equal(bundle.unknowns.length,1);const unknown=bundle.unknowns[0];assert.equal(unknown.status,'open');assert.equal(unknown.domain,'arc.closure-provenance');assert.ok(unknown.supporting_evidence_ids.includes((await evidence('mcp-details','actual-call-table-observation')).evidence_id));
for(const id of completeIds)assert.ok(bundle.records.some(e=>e.evidence_id===id),id);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,2);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const receipt={status:'passed',public_calls:calls,successful_calls:successful,expected_unlisted_procedure_errors:errors,completed_sessions:2,failed_partial_sessions:1,final_bundle_records:bundle.records.length,retained_unknown:{id:unknown.unknown_id,status:unknown.status,question:unknown.question},exact_cli_mcp_pairs:2,reused_records:reused.length,frozen_runtime_files:manifest.files.length,source_hashes:manifest.source_files.length,decoded_source_instructions_checked:nativeInstructions,program_byte_reads_checked:rawReads,loader_pointer_observations:programWords,native_branch_checks:checks,owned_lineages:[...sessions,cli.verifier_run],target_executed:false,scope:'Static selection policy and conditional key identities; active Client, generic store effects and full Arc remain unresolved'};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:receipt.status,calls,source_instructions:nativeInstructions,retained_records:bundle.records.length,unknown:unknown.unknown_id}));
