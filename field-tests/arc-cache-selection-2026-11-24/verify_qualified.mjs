import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const runtimeManifest=await json(path.join(root,'field-tests/blob-text-controls-2026-11-23/runtime-delivery-manifest.json')),runtime=runtimeManifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoFixups.js'));
for(const row of runtimeManifest.files){const b=await fs.readFile(path.join(runtime,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
const sources=new Map();
for(const m of [runtimeManifest,await json(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'))])for(const row of m.source_files){assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256);sources.set(row.path,row.sha256);}
const artifact=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(artifact),digest=sha(bytes);assert.equal(digest,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);
const bundle=parseEvidenceBundle(await json(path.join(out,'mcp-complete/final.bundle.json'))),ids=new Set(bundle.records.map(e=>e.evidence_id)),records=new Map(),sessions=[],errors=[],programWords=[];let calls=0,success=0,nativeInstructions=0,rawReads=0;
function checkEmulation(e){
 const r=e.normalized_result;assert.equal(e.confidence,'derived');return fs.readFile(r.artifact.path).then(source=>{
  assert.equal(sha(source),r.artifact.sha256);assert.equal(e.subject.digest.sha256,r.artifact.sha256);const selectedLayout=parseMachoLayout(source,'arm64');for(const region of e.parameters.code_regions)assert.equal(selectedLayout.offset(BigInt(region.address),region.size),region.file_offset);
  for(const c of r.coverage.instructions){const address=BigInt(c.address),region=e.parameters.code_regions.find(z=>address>=BigInt(z.address)&&address+4n<=BigInt(z.address)+BigInt(z.size));assert.ok(region);const off=region.file_offset+Number(address-BigInt(region.address));assert.equal(source.subarray(off,off+c.bytes_hex.length/2).toString('hex'),c.bytes_hex);}
 });
}
for(const directory of ['mcp','mcp-complete','mcp-probe']){
 const dir=path.join(out,directory),summary=await json(path.join(dir,'summary.json'));assert.equal(summary.status,directory==='mcp'?'failed':'completed');assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push(summary.verifier_run);calls+=summary.calls;success+=summary.successful;
 for(const row of await json(path.join(dir,'invocations.json'))){
  assert.equal(row.thrown,null);const reply=await json(path.join(dir,row.reply));
  if(row.is_error){const e=JSON.parse(reply.content.find(x=>x.type==='text').text).error;if(directory==='mcp'){assert.equal(e.code,'configuration_invalid');assert.match(e.details.settings[0].constraint,/2536.*address/);}else{assert.equal(e.code,'invalid_request');assert.match(e.details.issues[0].message,/No procedure exists/);}errors.push({directory,operation:row.name,arguments:row.arguments,error:e});continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),reply.structuredContent);
  if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent),r=e.normalized_result;if(directory==='mcp-complete')assert.equal(e.subject.digest.sha256,digest);assert.ok(ids.has(e.evidence_id));records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);
  if(e.operation==='inspect_native_instruction'&&r.status==='decoded'){
   const off=layout.offset(BigInt(r.address),r.length);assert.equal(bytes.subarray(off,off+r.length).toString('hex'),r.bytes);nativeInstructions++;
  }
  if(e.operation==='read_bytes'){
   rawReads++;const address=BigInt(r.address),off=layout.offset(address,r.returned_bytes),seen=Buffer.from(r.bytes_hex,'hex'),original=bytes.subarray(off,off+seen.length);if(seen.equals(original))continue;assert.equal(seen.length%8,0);
   for(let i=0;i<seen.length;i+=8){const raw=original.readBigUInt64LE(i),value=seen.readBigUInt64LE(i);if(raw===value)continue;const decoded=fixups.decode(address+BigInt(i),raw);assert.equal(decoded.kind,'rebase');assert.equal(decoded.target,value);programWords.push({evidence_id:e.evidence_id,address:'0x'+(address+BigInt(i)).toString(16),original:'0x'+raw.toString(16),rebased:'0x'+value.toString(16)});}
  }
  if(e.operation==='emulate_function')await checkEmulation(e);
 }
}
assert.equal(calls,237);assert.equal(success,232);assert.equal(errors.length,5);assert.equal(nativeInstructions,172);assert.equal(bundle.records.length,1431);
const get=(d,l)=>{const e=records.get(d+'/'+l);assert.ok(e,d+'/'+l);return e;},result=(d,l)=>get(d,l).normalized_result;
const native=(l,s)=>assert.equal(result('mcp-complete',l).raw_disassembly,s);
const line=(l,s)=>assert.ok(result('mcp-complete',l).instructions.includes(s),s);
for(const [l,s] of [['instructions-0x1006fd210','0x1006fd240: mov x0, x22'],['instructions-0x1006fd210','0x1006fd248: and x0, x21, #0xff'],['instructions-0x1006fd210','0x1006fd2c0: cmp x14, x8'],['instructions-0x1006fd210','0x1006fd2c4: ccmp w10, w13, #0x0, eq'],['instructions-0x100cce81c','0x100cce82c: mov x1, x0'],['instructions-0x100cce81c','0x100cce840: mov x0, x19'],['instructions-0x1006fbea4','0x1006fbed0: mov x23, x1'],['instructions-0x1006fbea4','0x1006fbf10: strb w23, [sp, #0x40]'],['instructions-0x1006fbea4','0x1006fbf4c: add x2, sp, #0x10']])line(l,s);
for(const [l,s] of [['cache-callback-0x1006fe65c','ldp x0,x1,[x20, #0x20]'],['cache-callback-0x1006fe660','ldrb w2,[x20, #0x30]'],['cache-callback-0x1006fe664','bl 0x1006fc894'],['test-context-callback-0x1006fd1c4','ldrb w1,[x20, #0x30]'],['test-context-callback-0x1006fd1d4','bl 0x1006fbea4'],['cache-insert-0x1006fc0b0','bl 0x1006fdbf0'],['cache-remove-0x1006fcfdc','bl 0x1006fd210'],['cache-remove-0x1006fd014','bl 0x100710288']])native(l,s);
for(const [l,s] of [['name-0x1036404f8','_swift_retain'],['name-0x1036404e0','_swift_release'],['name-0x10363cf34','_$ss6HasherV5_seedABSi_tcfC'],['name-0x10363cf40','_$ss6HasherV8_combineyySuF'],['name-0x10363cf88','_$ss6HasherV9_finalizeSiyF']])assert.equal(result('mcp-complete',l),s);
assert.match(result('mcp-complete','diagnostic-tasklocal-import'),/TaskLocal.*withValue/);
for(const [l,s] of [['lock-selector-0x103fbcd70','lock'],['lock-selector-0x103fdab91','unlock']])assert.equal(Buffer.from(result('mcp-complete',l).bytes_hex,'hex').toString('utf8').split('\0')[0],s);
assert.equal(Buffer.from(result('mcp-complete','bytes-0x1042c8ab8').bytes_hex,'hex').readBigUInt64LE(),0x1042c8a58n);const vwt=Buffer.from(result('mcp-complete','bytes-0x1042c8a58').bytes_hex,'hex');assert.equal(vwt.readBigUInt64LE(8),0x100d97a34n);assert.equal(vwt.readBigUInt64LE(16),0x100d97b04n);
const copy=result('mcp-complete','instructions-0x100d97b04').instructions;assert.equal(copy.filter(x=>x.includes('0x1036404f8')).length,23);const destroy=[...records].filter(([k])=>k.startsWith('mcp-complete/client-destroy-')).map(([,e])=>e.normalized_result.raw_disassembly);assert.equal(destroy.filter(s=>s==='bl 0x1036404e0'||s==='b 0x1036404e0').length,23);
const worker=bundle.records.find(e=>e.evidence_id==='ev_bb4db1dd628917621eb420d96d44eda37c1d192a7f22f646f6a5400b7231277d');assert.ok(worker);const wi=worker.normalized_result.instructions;
for(const s of ['0x1012ab824: ldp x23, x21, [x22, #0x10]','0x1012ab82c: bl 0x1036404f8','0x1012ab834: bl 0x1000078a4','0x1012ab838: mov w0, #0x31','0x1012ab83c: mov x20, x21','0x1012ab840: blr x23','0x1012ab84c: bl 0x1036404e0'])assert.ok(wi.includes(s));
const reused=await json(path.join(out,'reused-sources.json'));for(const row of reused){const b=await fs.readFile(path.join(root,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);const e=parseEvidence(JSON.parse(b.toString('utf8')));assert.equal(e.evidence_id,row.evidence_id);assert.equal(e.subject.digest.sha256,digest);}
const helper=parseEvidence(await json(path.join(root,'field-tests/arc-closure-origin-2026-11-22/mcp-roots/instructions-0x1000078a4.evidence.json')));assert.equal(helper.evidence_id,'ev_a80f81eb3188fd1a20e633d7bec3be8a820a823283442720a87863b8f80d3543');assert.ok(helper.normalized_result.instructions.includes('0x1000078c0: ldr x8, [x8, #0x8]'));
const probe=await json(path.join(out,'probe-derivation.json')),cases=[];
for(const row of probe.cases){const actual=result('mcp-probe','arc-'+row.name),owned=result('mcp-probe','owned-'+row.name);for(const r of [actual,owned])assert.equal(r.stop.reason,row.expected_stop);
 if(row.expected_slot!==null){for(const r of [actual,owned]){assert.equal(BigInt(r.registers_after.x0),BigInt(row.expected_slot));assert.equal(BigInt(r.registers_after.x1),BigInt(row.expected_found));}}
 else for(const r of [actual,owned])assert.equal(r.coverage.instructions_started,200);
 cases.push({...row,actual:get('mcp-probe','arc-'+row.name).evidence_id,owned:get('mcp-probe','owned-'+row.name).evidence_id});}
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,6);assert.equal(cli.records.filter(r=>r.exact_evidence_or_error_equal).length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);sessions.push(cli.verifier_run);
const derivation=await json(path.join(out,'copy-derivation.json')),copyResults=[];
for(const [label,reason] of [['copy-prefix-explicit','caller_stop'],['copy-prefix-external','external_call']]){
 const e=parseEvidence(await json(path.join(out,label+'.final.cli.json')));toolContract('emulate_function').outputSchema.parse(e);await checkEmulation(e);const r=e.normalized_result;assert.equal(r.stop.reason,reason);assert.equal(r.stop.address,'0x100d97c04');assert.equal(r.memory_observations.length,1);const memory=r.memory_observations[0];assert.equal(memory.after_hex,derivation.source_bytes_hex);assert.equal(memory.changed_bytes,Buffer.from(derivation.source_bytes_hex,'hex').filter(x=>x!==0).length);assert.equal(r.coverage.instructions_started,64);copyResults.push({evidence_id:e.evidence_id,label,stop:r.stop,bytes:368,changed_bytes:memory.changed_bytes});
}
const unknown=bundle.unknowns.filter(u=>u.unknown_id==='unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04').sort((a,b)=>b.revision-a.revision)[0];assert.equal(unknown.revision,3);assert.equal(unknown.status,'open');assert.equal(unknown.resolution,null);assert.equal(bundle.unknowns.length,3);
const seed=await json(path.join(out,'seed-receipt-corrected.json'));assert.equal(sha(await fs.readFile(seed.corrected_seed_file)),seed.seed_sha256);assert.equal(seed.source_sha256,digest);
const receipt={status:'passed',public_mcp_calls:calls,successful_mcp_calls:success,configuration_rejection_and_expected_missing_procedures:errors,completed_mcp_sessions:2,failed_preanalysis_attempts:1,final_bundle_records:bundle.records.length,source_instructions_byte_checked:nativeInstructions,emulator_virtual_to_file_ranges_checked:true,raw_byte_reads:rawReads,checked_loader_rebases:programWords,cache_probe_pairs:cases,exact_cli_mcp_pairs:4,cli_only_copy_prefix_captures:copyResults,reused_source_records:reused,frozen_runtime_files:runtimeManifest.files.length,current_source_hashes:sources.size,retained_unknown:{id:unknown.unknown_id,revision:unknown.revision,status:unknown.status},owned_lineages:sessions,target_host_execution:false,new_product_defect:false,scope:'Conditional raw cache identity/context probe and selected local copy/ownership window; actual returned Client, pre-getter instance relations and typed invocation carrier remain open'};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:receipt.status,calls,success,records:bundle.records.length,nativeInstructions,pairs:4,unknown_revision:unknown.revision}));
