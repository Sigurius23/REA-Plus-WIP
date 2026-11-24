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
const sources=new Map();
for(const m of [manifest,await json(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'))])for(const row of m.source_files){assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256);sources.set(row.path,row.sha256);}
const artifact=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(artifact),digest=sha(bytes);
assert.equal(bytes.length,80498448);assert.equal(digest,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);
const derivation=await json(path.join(out,'replay-derivation.json'));assert.equal(derivation.artifact_sha256,digest);assert.equal(sha(await fs.readFile(path.join(out,'removal_reference.c'))),derivation.reference_source_sha256);
const records=new Map(),sessions=[],errors=[],programWords=[],bundleCounts={},omittedDecodes=[];let calls=0,success=0,nativeInstructions=0,rawReads=0,emulations=0;
async function checkEmulation(e){
 const r=e.normalized_result;assert.equal(e.confidence,'derived');const b=await fs.readFile(r.artifact.path),m=parseMachoLayout(b,'arm64');assert.equal(sha(b),r.artifact.sha256);assert.equal(e.subject.digest.sha256,r.artifact.sha256);
 assert.ok([digest,derivation.reference_sha256].includes(r.artifact.sha256));
 for(const c of e.parameters.code_regions)assert.equal(m.offset(BigInt(c.address),c.size),c.file_offset);
 for(const c of r.coverage.instructions){const address=BigInt(c.address),region=e.parameters.code_regions.find(z=>address>=BigInt(z.address)&&address+4n<=BigInt(z.address)+BigInt(z.size));assert.ok(region);const off=region.file_offset+Number(address-BigInt(region.address));assert.equal(b.subarray(off,off+c.bytes_hex.length/2).toString('hex'),c.bytes_hex);}
 emulations++;
}
for(const directory of ['mcp','mcp-policy-complete','mcp-replays']){
 const dir=path.join(out,directory),summary=await json(path.join(dir,'summary.json'));assert.equal(summary.status,'completed');assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push(summary.verifier_run);calls+=summary.calls;success+=summary.successful;
 const bundle=parseEvidenceBundle(await json(path.join(dir,'final.bundle.json'))),ids=new Set(bundle.records.map(e=>e.evidence_id));bundleCounts[directory]=bundle.records.length;
 for(const row of await json(path.join(dir,'invocations.json'))){
  assert.equal(row.thrown,null);const reply=await json(path.join(dir,row.reply));
  if(row.is_error){const error=JSON.parse(reply.content.find(x=>x.type==='text').text).error;assert.equal(directory,'mcp');assert.equal(error.code,'invalid_request');assert.match(error.details.issues[0].message,/No procedure exists/);assert.ok(['0x101180554','0x1011805a4'].includes(row.arguments.procedure));errors.push({directory,operation:row.name,arguments:row.arguments,error});continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),reply.structuredContent);
  if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent),r=e.normalized_result;assert.ok(ids.has(e.evidence_id));records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);
  if(directory!=='mcp-replays')assert.equal(e.subject.digest.sha256,digest);
  if(e.operation==='inspect_native_instruction'){
   if(r.status==='decoded'){const off=layout.offset(BigInt(r.address),r.length);assert.equal(bytes.subarray(off,off+r.length).toString('hex'),r.bytes);nativeInstructions++;}
   else {assert.equal(directory,'mcp');assert.equal(e.parameters.decode_unlisted,undefined);assert.equal(r.status,'undecodable');omittedDecodes.push(row.reply.replace(/\.reply\.json$/,''));}
  }
  if(e.operation==='read_bytes'){
   rawReads++;const address=BigInt(r.address),off=layout.offset(address,r.returned_bytes),seen=Buffer.from(r.bytes_hex,'hex'),original=bytes.subarray(off,off+seen.length);if(seen.equals(original))continue;assert.equal(seen.length%8,0);
   for(let i=0;i<seen.length;i+=8){const raw=original.readBigUInt64LE(i),value=seen.readBigUInt64LE(i);if(raw===value)continue;const decoded=fixups.decode(address+BigInt(i),raw);assert.equal(decoded.kind,'rebase');assert.equal(decoded.target,value);programWords.push({evidence_id:e.evidence_id,address:'0x'+(address+BigInt(i)).toString(16),original:'0x'+raw.toString(16),rebased:'0x'+value.toString(16)});}
  }
  if(e.operation==='emulate_function')await checkEmulation(e);
 }
}
const get=(d,l)=>{const e=records.get(d+'/'+l);assert.ok(e,d+'/'+l);return e;},result=(d,l)=>get(d,l).normalized_result;
assert.equal(errors.length,4);assert.equal(emulations,29);assert.equal(omittedDecodes.length,106);
const limitation=await json(path.join(out,'policy-listing-limitations.json'));assert.deepEqual(limitation.labels,omittedDecodes);
for(const label of omittedDecodes){const e=get('mcp-policy-complete',label);assert.equal(e.parameters.decode_unlisted,true);assert.equal(e.normalized_result.status,'decoded');}
const native=(l,s)=>{const e=records.get('mcp-policy-complete/'+l)??get('mcp',l);assert.equal(e.normalized_result.raw_disassembly,s);};
const line=(l,s)=>assert.ok(result('mcp',l).instructions.includes(s),s);
for(const [l,s] of [
 ['instructions-0x100710288','0x1007102e8: bl 0x10363b830'],['instructions-0x100710288','0x100710358: and x8, x0, x23'],
 ['instructions-0x100710288','0x1007103a4: ldr q0, [x9]'],['instructions-0x100710288','0x1007102f8: ldp q0, q1, [x9]'],
 ['instructions-0x10118374c','0x10118374c: b 0x10117f978'],['instructions-0x10117f978','0x10117f978: b 0x100a3d4b0'],
 ['instructions-0x101183754','0x101183754: b 0x101183480'],['instructions-0x101183480','0x101183480: b 0x101183510'],
 ['instructions-0x101180200','0x101180234: cbz x20, 0x10118024c'],['instructions-0x101180200','0x101180238: str x20, [x21, #0x170]'],
 ['instructions-0x101182d1c','0x101182d48: mov w1, #0x0'],['instructions-0x101182d1c','0x101182d4c: blr x9']])line(l,s);
for(const [l,s] of [
 ['ui-flag-init-0x100b3714c','b 0x100b372f8'],['e2e-flag-init-0x100b371b8','b 0x100b372f8'],
 ['unit-flag-init-0x100819450','bl 0x1006d4c48'],['unit-flag-init-0x100819454','ldrb w8,[x0]'],
 ['environment-one-0x100b37320','bl 0x10363f8ec'],['environment-one-0x100b37324','bl 0x10365aa40'],['environment-one-0x100b37334','bl 0x10364c140'],
 ['environment-one-0x100b373b8','cmp x22,#0x31'],['environment-one-0x100b373d0','mov w2,#0x31'],['environment-one-0x100b373dc','bl 0x10363c964'],
 ['environment-one-0x100b37414','strb w8,[x19]']])native(l,s);
function smallString(prefix){
 const words=new Map();
 for(const [key,e] of records){if(!key.startsWith('mcp-policy-complete/'+prefix+'-'))continue;
  const s=e.normalized_result.raw_disassembly,m=/^(mov|movk) (x[12]),#(0x[0-9a-f]+)(?:, LSL #(\d+))?$/.exec(s);if(!m)continue;
  const shift=BigInt(m[4]??0),mask=0xffffn<<shift,value=BigInt(m[3])<<shift;
  words.set(m[2],m[1]==='mov'?value:((words.get(m[2])??0n)&~mask)|value);
 }
 const b=Buffer.alloc(16);b.writeBigUInt64LE(words.get('x1'));b.writeBigUInt64LE(words.get('x2'),8);const length=b[15]&15;return b.subarray(0,length).toString('utf8');
}
assert.equal(smallString('ui-flag-init'),'ARC_UI_TESTS');assert.equal(smallString('e2e-flag-init'),'ARC_E2E_TESTS');
for(const [l,s] of [['backend-policy-0x100b3721c','tbnz w8,#0x0,0x100b3722c'],['backend-policy-0x100b37228','tbz w8,#0x0,0x100b37234'],['backend-policy-0x100b37250','strb w8,[x9, #0x4a]'],['getter-success-0x101180590','mov x20,#0x0'],['getter-error-0x1011805ec','ldr x20,[x22, #0x170]']])native(l,s);
for(const [l,s] of [['policy-bytes-0x103fc5279','processInfo'],['policy-bytes-0x103fae4cc','environment'],['snapshot-data-selector','data']])assert.equal(Buffer.from(result('mcp',l).bytes_hex,'hex').toString('utf8').split('\0')[0],s);
assert.match(result('mcp','policy-name-0x103638f38'),/unconditionallyBridgeFromObjectiveC/);assert.match(result('mcp','policy-name-0x10363c964'),/stringCompareWithSmolCheck/);
// Import names below are supplemental original-file fixup facts, never normalized API replacements.
const supplementalImports=[];
for(const [address,symbol] of [[0x104550fa0,'_OBJC_CLASS_$_NSProcessInfo'],[0x10423cfb8,'_$sSSN'],[0x10423cfc8,'_$sSSSHsWP']]){const a=BigInt(address),raw=bytes.readBigUInt64LE(layout.offset(a,8)),d=fixups.decode(a,raw);assert.equal(d.kind,'bind');assert.equal(d.symbol,symbol);supplementalImports.push({address:'0x'+a.toString(16),raw:'0x'+raw.toString(16),symbol,authority:'supplemental source-file chained fixup, not returned by address_name'});}
const pairs=[];
for(const row of derivation.cases){
 const label='arc-'+(row.kind==='decision'?'decision-':'isolated-')+row.name,actual=get('mcp-replays',label),r=actual.normalized_result;
 if(row.kind==='decision'){
  const owned=get('mcp-replays','owned-decision-'+row.name),o=owned.normalized_result;assert.equal(r.stop.reason,'caller_stop');assert.equal(r.stop.address,row.expected_pc);assert.equal(o.stop.reason,'function_return');assert.equal(BigInt(o.registers_after.x0),row.expected_move?1n:0n);assert.equal(r.memory_observations.length,0);assert.equal(o.memory_observations.length,0);pairs.push({case:row.name,kind:row.kind,actual:actual.evidence_id,owned:owned.evidence_id,expected_move:row.expected_move});
 }else{
  assert.equal(r.stop.reason,row.stop);const values=[r];let owned=null;
  if(row.stop==='function_return'){owned=get('mcp-replays','owned-isolated-'+row.name);assert.equal(owned.normalized_result.stop.reason,'function_return');values.push(owned.normalized_result);}
  else {assert.equal(r.stop.address,'0x1007102e8');assert.equal(r.stop.target,'0x10363b830');}
  for(const v of values){assert.equal(v.memory_observations.length,3);for(const [address,before,after] of [['0x60000000',row.header_before,row.header_after],['0x60001000',row.keys_hex,row.keys_hex],['0x60002000',row.values_hex,row.values_hex]]){const m=v.memory_observations.find(m=>m.address===address);assert.ok(m);assert.equal(m.before_hex,before);assert.equal(m.after_hex,after);}}
  pairs.push({case:row.name,kind:row.kind,actual:actual.evidence_id,owned:owned?.evidence_id??null,stop:row.stop});
 }
}
assert.equal(pairs.length,15);assert.equal(pairs.filter(p=>p.owned!==null).length,14);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);sessions.push(cli.verifier_run);
for(const row of cli.records){assert.equal(row.exit_code,0);assert.equal(row.exact_evidence_or_error_equal,true);const e=parseEvidence(await json(path.join(out,row.label+'.final.cli.json')));assert.deepEqual(e,get('mcp-replays',row.label));}
const reused=await json(path.join(out,'reused-sources.json'));
for(const row of reused){const b=await fs.readFile(path.join(root,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);if(row.evidence_id){const e=parseEvidence(JSON.parse(b));assert.equal(e.evidence_id,row.evidence_id);assert.equal(e.subject.digest.sha256,digest);}}
const constructor=parseEvidence(await json(path.join(root,reused[0].path))).normalized_result.instructions;
for(const s of ['0x101173a1c: bl 0x100b3728c','0x101173a24: cmp w8, #0x1','0x101173a28: b.ne 0x101173a7c','0x101173a74: add x8, x8, #0xdb8','0x101173b04: add x8, x8, #0xa30'])assert.ok(constructor.includes(s),s);
const bindings=await json(path.join(root,'field-tests/arc-persistence-2026-11-20/boost-storage-bindings.json'));for(const [name,witness] of [['BoostsStorageFirebaseImpl','0x104307a30'],['BoostsStorageMemoryImpl','0x104307db8']])assert.ok(bindings.storage_implementations.some(i=>i.type===name&&i.witness_table===witness));
const previous=parseEvidenceBundle(await json(path.join(root,'field-tests/arc-cache-selection-2026-11-24/mcp-complete/final.bundle.json'))),unknown=previous.unknowns.filter(u=>u.unknown_id==='unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04').sort((a,b)=>b.revision-a.revision)[0];assert.equal(unknown.revision,3);assert.equal(unknown.status,'open');assert.equal(unknown.resolution,null);
const seed=await json(path.join(out,'seed-receipt.json'));assert.equal(seed.source_sha256,digest);assert.equal(sha(await fs.readFile(path.join(out,'seeds.tsv'))),seed.seed_sha256);
const receipt={status:'passed',public_mcp_calls:calls,successful_mcp_calls:success,expected_missing_procedures:errors,completed_mcp_sessions:3,final_bundle_records:bundleCounts,source_instruction_bytes_checked:nativeInstructions,initial_listing_only_omissions:omittedDecodes.length,omissions_recovered_with_explicit_opt_in:true,raw_byte_reads:rawReads,checked_loader_rebases:programWords,supplemental_import_fixups:supplementalImports,emulation_code_regions_macho_mapped_and_visited_bytes_checked:true,public_emulations:emulations,removal_controls:pairs,exact_cli_mcp_pairs:cli.records.length,reused_sources:reused.length,frozen_runtime_files:manifest.files.length,current_source_hashes:sources.size,retained_unknown:{id:unknown.unknown_id,revision:unknown.revision,status:unknown.status},owned_lineages:sessions,target_host_execution:false,new_product_defect:false,scope:'Static bucket repair, supplied-hash/isolated raw controls, wrapper/async joins and cached backend test-policy; no runtime selection, Swift Hasher execution, durable I/O or typed invocation carrier'};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(receipt,null,2)+'\n');
console.log(JSON.stringify({status:receipt.status,calls,success,records:bundleCounts,nativeInstructions,emulations,pairs:cli.records.length,unknown_revision:unknown.revision}));
