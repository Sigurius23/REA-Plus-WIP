import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(root,'field-tests/blob-text-controls-2026-11-23/runtime-delivery-manifest.json')),runtime=manifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoFixups.js'));
for(const row of manifest.files){const b=await fs.readFile(path.join(runtime,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
const sources=new Map();for(const m of [manifest,await json(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'))])for(const row of m.source_files){assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256);sources.set(row.path,row.sha256);}
const bytes=await fs.readFile(path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64')),digest=sha(bytes);assert.equal(bytes.length,80498448);assert.equal(digest,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);
const records=new Map(),sessions=[],errors=[],rebases=[],bundleCounts={};let calls=0,successful=0,instructions=0,reads=0;
for(const [directory,bundleFile,status] of [['mcp','phase2.bundle.json','failed'],['mcp-complete','final.bundle.json','completed']]){
 const dir=path.join(out,directory),summary=await json(path.join(dir,'summary.json'));assert.equal(summary.status,status);assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push(summary.verifier_run);calls+=summary.calls;successful+=summary.successful;
 const bundle=parseEvidenceBundle(await json(path.join(dir,bundleFile))),ids=new Set(bundle.records.map(e=>e.evidence_id));bundleCounts[directory]=bundle.records.length;
 for(const row of await json(path.join(dir,'invocations.json'))){
  assert.equal(row.thrown,null);const reply=await json(path.join(dir,row.reply));
  if(row.is_error){const error=JSON.parse(reply.content.find(x=>x.type==='text').text).error;assert.equal(directory,'mcp-complete');assert.equal(error.code,'invalid_request');assert.match(error.details.issues[0].message,/No procedure exists/);assert.ok(['0x10118c268','0x10118c610'].includes(row.arguments.procedure));errors.push({operation:row.name,arguments:row.arguments,error});continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),reply.structuredContent);if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent),r=e.normalized_result;assert.equal(e.subject.digest.sha256,digest);assert.ok(ids.has(e.evidence_id));records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);
  if(e.operation==='inspect_native_instruction'){assert.equal(r.status,'decoded');assert.equal(bytes.subarray(layout.offset(BigInt(r.address),r.length),layout.offset(BigInt(r.address),r.length)+r.length).toString('hex'),r.bytes);instructions++;}
  if(e.operation==='read_bytes'){
   reads++;const a=BigInt(r.address),off=layout.offset(a,r.returned_bytes),seen=Buffer.from(r.bytes_hex,'hex'),original=bytes.subarray(off,off+seen.length);if(seen.equals(original))continue;assert.equal(seen.length%8,0);
   for(let i=0;i<seen.length;i+=8){const raw=original.readBigUInt64LE(i),value=seen.readBigUInt64LE(i);if(raw===value)continue;const d=fixups.decode(a+BigInt(i),raw);assert.equal(d.kind,'rebase');assert.equal(d.target,value);rebases.push({evidence_id:e.evidence_id,address:'0x'+(a+BigInt(i)).toString(16),raw:'0x'+raw.toString(16),rebased:'0x'+value.toString(16)});}
  }
 }
}
assert.equal(calls,308);assert.equal(successful,304);assert.equal(errors.length,4);
const get=(d,l)=>{const e=records.get(d+'/'+l);assert.ok(e,d+'/'+l);return e;},result=(d,l)=>get(d,l).normalized_result;
const native=(l,s)=>assert.equal(result('mcp-complete',l).raw_disassembly,s);
for(const [l,s] of [
 ['storable-default-getter-0x10118c29c','adrp x9,0x104706000'],['storable-default-getter-0x10118c2a0','add x9,x9,#0xba0'],
 ['store-live-copy-0x10118c384','adrp x9,0x104706000'],['store-live-copy-0x10118c3b8','stp q0,q1,[x8, #0x40]'],
 ['restore-control-0x1003060e8','blr x25'],['restore-control-0x1003060ec','cbz x21,0x10030616c'],
 ['restore-control-0x1003061d8','b.eq 0x10030630c'],['restore-control-0x1003062ac','blr x24'],['restore-control-0x1003062b0','cbz x21,0x100306328'],
 ['restore-control-0x10030637c','b.eq 0x1003064d4'],['restore-control-0x10030644c','blr x8'],['restore-control-0x100306454','cbz x21,0x100306494'],
 ['restore-control-0x10030648c','mov x21,#0x0'],['restore-control-0x1003064d8','ldrsw x20,[x8, #0x18]'],
 ['restore-control-0x1003064f8','bl 0x1017aac84'],['restore-control-0x100306514','blr x8'],['restore-control-0x10030659c','blr x8'],
 ['restore-control-0x1003065d0','cbz x21,0x1003065dc'],['restore-control-0x1003065f0','cmp w22,#0x1'],['restore-control-0x1003065f4','cset w0,ne'],
 ['sync-accessor-0x1017aaca4','adrp x1,0x103d8c000'],['sync-accessor-0x1017aaca8','add x1,x1,#0x4e8']])native(l,s);
const fields=l=>result('mcp-complete',l).result.swift_type_fields;
const windows=fields('windows-layout'),sidebar=fields('sidebar-model-fields'),store=fields('fields-0x103d65460'),record=fields('restore-record-fields');
assert.equal(windows.name,'StorableWindows');assert.equal(sidebar.name,'StorableSidebar');assert.equal(store.name,'StorableDataStore');assert.equal(record.name,'RestorableFile');assert.equal(record.fields[3].name,'url');
assert.deepEqual(store.fields.map(f=>f.name),['readSyncThrowing','saveSyncThrowing','deleteSync','deleteAllSync','restoreFromBackup','allStoredFiles']);assert.equal(store.is_generic,true);
assert.equal(sidebar.fields[2].name,'sidebarSyncState');assert.equal(sidebar.fields[2].mangling_hex,'02f7fc5400536700');assert.equal(fields('sync-state-fields').name,'ZoneSyncData');
assert.equal(windows.static_metadata.owner_matched,true);assert.equal(windows.static_metadata.kind_word,'0x200');assert.deepEqual(windows.static_metadata.field_offsets.map(f=>f.byte_offset),[0,8,24,32,48]);assert.equal(windows.fields[2].name,'windows');assert.equal(windows.static_metadata.value_witness.size_bytes,'49');assert.equal(windows.static_metadata.value_witness.stride_bytes,'56');
for(const f of windows.static_metadata.field_offsets){assert.equal(bytes.readUInt32LE(layout.offset(BigInt(f.source.address),4)),f.byte_offset);}
const header=Buffer.from(result('mcp-complete','binding-0x103db9d3c').bytes_hex,'hex');assert.equal(header.readUInt32LE(20),4);assert.equal(header.readUInt32LE(24),2);
const selected=result('mcp-complete','storable-class-methods').result.swift_vtable_selection;assert.equal(selected.matched,false);assert.equal(selected.matching_index_entries,0);assert.equal(selected.unresolved,0);
for(const a of ['0x104622168','0x1046221a8','0x1046221b0'])assert.deepEqual(result('mcp-complete','xrefs-'+a),[]);
const helper=result('mcp-complete','concrete-type-cache-helper').instructions;for(const s of ['0x100005158: ldr x9, [x1]','0x10000515c: asr x8, x9, #0x20','0x100005160: add x0, x1, w9, SXTW '])assert.ok(helper.includes(s));
const hints=await json(path.join(out,'symbolic-reference-selection.json'));
for(const h of hints.references){
 const ref=Buffer.from(result('mcp-complete','symbolic-slot-'+h.slot).bytes_hex,'hex');assert.equal(ref.readBigUInt64LE(),BigInt(h.descriptor));const raw=Buffer.from(result('mcp-complete','mangle-'+(h.mangle==='0x103b74478'?'0x1036b9308':'0x1036be730')).bytes_hex,'hex'),at=Number(BigInt(h.payload)-BigInt(h.mangle));assert.equal(raw[at-1],2);assert.equal(BigInt(h.payload)+BigInt(raw.readInt32LE(at)),BigInt(h.slot));
}
assert.deepEqual(hints.references.filter(h=>h.mangle==='0x103b74478').map(h=>h.descriptor),['0x103d46d5c','0x103d65460','0x103db9d3c']);assert.deepEqual(hints.references.filter(h=>h.mangle==='0x103b7448c').map(h=>h.descriptor),['0x103d46d5c','0x103d65460','0x103dc373c']);
const reused=await json(path.join(out,'reused-sources.json'));
for(const row of reused){const b=await fs.readFile(path.join(root,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);if(row.evidence_id){const e=parseEvidence(JSON.parse(b));assert.equal(e.evidence_id,row.evidence_id);assert.equal(e.subject.digest.sha256,digest);}}
const worker=parseEvidence(await json(path.join(root,'field-tests/arc-persistence-2026-11-20/mcp/restore-worker-c-instructions.evidence.json'))).normalized_result.instructions;
for(const s of ['0x100306428: ldr q0, [x19, #0x20]','0x100306430: stp x28, x9, [x19, #0x80]','0x100306438: stp x9, x24, [x19, #0x90]','0x100306440: strb w9, [x19, #0xa0]','0x100306448: mov w1, #0x1','0x10030650c: mov w1, #0x1','0x100306510: mov w2, #0x1','0x100306598: mov w1, #0x1','0x1003065ec: ldr w22, [x19, #0x48]'])assert.ok(worker.includes(s),s);
const emptySlot=0x10423f7c8n,emptyRaw=bytes.readBigUInt64LE(layout.offset(emptySlot,8)),empty=fixups.decode(emptySlot,emptyRaw);assert.equal(empty.kind,'bind');assert.equal(empty.symbol,'__swiftEmptyArrayStorage');
const schemaSummary=await json(path.join(out,'mcp-schema-control/summary.json'));assert.equal(schemaSummary.status,'failed');assert.equal(schemaSummary.calls,0);assert.equal(schemaSummary.verifier_run.process_lineage.status,'verified');assert.deepEqual(schemaSummary.verifier_run.process_lineage.descendants,[]);sessions.push(schemaSummary.verifier_run);
const events=(await fs.readFile(path.join(out,'schema-control.log'),'utf8')).trim().split('\n').map(s=>JSON.parse(s)),fatal=events.find(e=>e.event==='fatal'),schemaError=JSON.parse(fatal.message);assert.equal(schemaError[0].keyword,'additionalProperties');assert.equal(schemaError[0].params.additionalProperty,'path');
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,2);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);sessions.push(cli.verifier_run);
for(const row of cli.records){assert.equal(row.exact_evidence_equal,true);const e=parseEvidence(await json(path.join(out,row.label+'.cli.json')));assert.deepEqual(e,get('mcp-complete',row.label));}
const old=parseEvidenceBundle(await json(path.join(root,'field-tests/arc-cache-selection-2026-11-24/mcp-complete/final.bundle.json'))),unknown=old.unknowns.filter(u=>u.unknown_id==='unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04').sort((a,b)=>b.revision-a.revision)[0];assert.equal(unknown.revision,3);assert.equal(unknown.status,'open');
const receipt={status:'passed',mcp_calls:calls,successful_mcp_calls:successful,expected_missing_procedures:errors,initial_session_status:'failed-before-invalid-step-invocation',followup_status:'completed',schema_rejection_control:'expected failure, zero tool calls, precise additional-property error',bundles:bundleCounts,source_instruction_records_byte_checked:instructions,raw_reads:reads,loader_rebases:rebases,exact_cli_mcp_pairs:2,windows_offsets:windows.static_metadata.field_offsets.map(f=>({field:windows.fields[f.ordinal].name,byte_offset:f.byte_offset})),windows_size:49,windows_stride:56,empty_array_import:{slot:'0x10423f7c8',symbol:empty.symbol,authority:'supplemental original-file chained import; not substituted into public output'},frozen_runtime_files:manifest.files.length,current_source_hashes:sources.size,reused_sources:reused.length,retained_client_unknown:{revision:unknown.revision,status:unknown.status},owned_lineages:sessions,target_execution:false,new_product_defect:false,scope:'Conditional selected-file sidebar restore and write requests/error handling; generic automatic restore consumer, active injection, actual I/O and full UI remain open'};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:'passed',calls,successful,instructions,reads,exact_cli_pairs:2,bundles:bundleCounts}));
