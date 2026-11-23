import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json')),runtime=manifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoFixups.js'));
for(const row of manifest.files){const b=await fs.readFile(path.join(runtime,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
for(const row of manifest.source_files)assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256);
const artifact=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(artifact),digest=sha(bytes);assert.equal(digest,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);
const final=parseEvidenceBundle(await json(path.join(out,'mcp/final.bundle.json'))),ids=new Set(final.records.map(e=>e.evidence_id));
const records=new Map(),sessions=[],errors=[],programWords=[];let calls=0,successful=0,nativeInstructions=0,rawReads=0,emulations=0;
for(const directory of ['mcp','mcp-hash']){
 const dir=path.join(out,directory),summary=await json(path.join(dir,'summary.json'));assert.equal(summary.status,'completed');assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push(summary.verifier_run);calls+=summary.calls;successful+=summary.successful;
 for(const row of await json(path.join(dir,'invocations.json'))){
  assert.equal(row.thrown,null);const reply=await json(path.join(dir,row.reply));
  if(row.is_error){const e=JSON.parse(reply.content.find(c=>c.type==='text').text).error;assert.equal(e.code,'invalid_request');assert.match(e.details.issues[0].message,/No procedure exists/);errors.push({directory,operation:row.name,arguments:row.arguments,error:e});continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);
  if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent),r=e.normalized_result;assert.ok(ids.has(e.evidence_id),e.evidence_id);records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);
  if(e.operation==='inspect_native_instruction'&&r.status==='decoded'){
   const offset=layout.offset(BigInt(r.address),r.length);assert.equal(bytes.subarray(offset,offset+r.length).toString('hex'),r.bytes);nativeInstructions++;
  }
  if(e.operation==='inspect_data_blob'){
   assert.equal(r.file.sha256,digest);assert.equal(sha(bytes.subarray(r.range.offset,r.range.offset+r.range.length)),r.payload.sha256);
  }
  if(e.operation==='read_bytes'){
   const address=BigInt(r.address),offset=layout.offset(address,r.returned_bytes),observed=Buffer.from(r.bytes_hex,'hex'),original=bytes.subarray(offset,offset+observed.length);rawReads++;
   if(original.equals(observed))continue;
   assert.equal(observed.length%8,0);
   for(let at=0;at<observed.length;at+=8){const raw=original.readBigUInt64LE(at),value=observed.readBigUInt64LE(at);if(raw===value)continue;const decoded=fixups.decode(address+BigInt(at),raw);assert.notEqual(decoded.kind,'unsupported');if(decoded.kind==='rebase')assert.equal(decoded.target,value);programWords.push({evidence_id:e.evidence_id,address:'0x'+(address+BigInt(at)).toString(16),original_word:'0x'+raw.toString(16),program_word:'0x'+value.toString(16),fixup:decoded.kind,...(decoded.kind==='bind'?{symbol:decoded.symbol,library:decoded.library,synthetic_program_address:'not-a-runtime-address'}:{target:'0x'+decoded.target.toString(16)})});}
  }
  if(e.operation==='emulate_function'){
   const source=await fs.readFile(r.artifact.path);assert.equal(sha(source),r.artifact.sha256);assert.equal(e.confidence,'derived');
   for(const c of r.coverage.instructions){const at=BigInt(c.address),region=e.parameters.code_regions.find(z=>at>=BigInt(z.address)&&at+4n<=BigInt(z.address)+BigInt(z.size));assert.ok(region);const offset=region.file_offset+Number(at-BigInt(region.address));assert.equal(source.subarray(offset,offset+c.bytes_hex.length/2).toString('hex'),c.bytes_hex);}
   emulations++;
  }
 }
}
assert.equal(calls,794);assert.equal(successful,784);assert.equal(errors.length,10);assert.equal(emulations,15);assert.equal(final.records.length,1114);
const evidence=(d,l)=>{const e=records.get(d+'/'+l);assert.ok(e,d+'/'+l);return e;};const result=(d,l)=>evidence(d,l).normalized_result;
const instruction=(label,expected)=>assert.equal(result('mcp',label).raw_disassembly,expected);
const strings=label=>result('mcp',label).strings.map(x=>x.value);
for(const [label,value] of [['test-key-0x39d2960','XCTestBundlePath'],['test-key-0x39d2980','XCTestConfigurationFilePath'],['test-key-0x39d29a0','XCTestSessionIdentifier'],['gate-literal-0x39cdca0','__CFBundleIdentifier'],['gate-literal-0x39cdd40','company.thebrowser.dia'],['fallback-symbol','XCTestObservationCenter'],['selector-or-key-0x1039d2520','sharedTestObservationCenter'],['selector-or-key-0x1039d2540','XCTestMisuseObserver']])assert.equal(strings(label)[0],value);
assert.equal(result('mcp','name-0x103639964'),'_$sSS9hasPrefixySbSSF');
assert.equal(result('mcp','name-0x105018d00'),'_$ss6UInt64VN');assert.equal(result('mcp','name-0x105019100'),'_$ss6UInt64Vs23CustomStringConvertiblesWP');
for(const [slot,symbol,name] of [['0x10423f510','_$ss6UInt64VN','0x105018d00'],['0x10423f530','_$ss6UInt64Vs23CustomStringConvertiblesWP','0x105019100'],['0x104550f98','_OBJC_CLASS_$_NSBundle','0x105031500'],['0x104550fa0','_OBJC_CLASS_$_NSProcessInfo','0x105038700']]){
 const word=programWords.find(x=>x.address===slot);assert.ok(word);assert.equal(word.symbol,symbol);assert.equal(word.program_word,name);assert.equal(result('mcp','name-'+name),symbol);
}
const selectorChecks=[];
for(const [slot,va,text] of [['0x1045459d8','0x103fbd13d','mainBundle'],['0x104541230','0x103fa3afa','bundleIdentifier'],['0x104546910','0x103fc5279','processInfo'],['0x104542ed0','0x103fae4cc','environment']]){
 const n=result('mcp','gate-selector-slot-'+slot),target=Buffer.from(n.bytes_hex,'hex').readBigUInt64LE();assert.equal('0x'+target.toString(16),va);assert.equal(strings('exact-selector-'+va)[0],text);selectorChecks.push({slot,target:va,selector:text});
}
assert.equal(strings('perform-selector-literal').length,0);
const selectorCapture=await json(path.join(out,'mcp-selector/perform-selector-exact-bytes.evidence.json'));parseEvidence(selectorCapture);assert.equal(selectorCapture.normalized_result.strings[0].value,'performSelector:');assert.equal(selectorCapture.normalized_result.payload.sha256,sha(bytes.subarray(0x3fc3ba0,0x3fc3bb0)));
const selectorSession=await json(path.join(out,'mcp-selector/summary.json'));assert.equal(selectorSession.status,'completed');assert.equal(selectorSession.errors,0);assert.equal(selectorSession.verifier_run.process_lineage.status,'verified');assert.deepEqual(selectorSession.verifier_run.process_lineage.descendants,[]);sessions.push(selectorSession.verifier_run);
const plist=result('mcp','original-bundle-plist');assert.equal(plist.value.CFBundleIdentifier,'company.thebrowser.Browser');assert.equal(plist.value.CFBundleShortVersionString,'1.172.1');assert.equal(plist.value.CFBundleVersion,'90370');
const rawPlist=await fs.readFile(path.join(root,'field-tests/arc-base-url-2026-11-21/Info.plist'));const prior=await json(path.join(root,'field-tests/arc-base-url-2026-11-21/mcp-seeded/original-bundle-plist.evidence.json'));assert.deepEqual(plist,prior.normalized_result);assert.ok(rawPlist.length>0);
for(const [label,text] of [['gate-0x1005a4cd4','bl 0x103656d60'],['gate-0x1005a4ce4','bl 0x103644ec0'],['gate-0x1005a4cfc','cbz x20,0x1005a4d1c'],['gate-0x1005a4de4','bl 0x103639964'],['dictionary-store-0x1006fbff0','bl 0x1006fdabc'],['dictionary-assign-0x1006fdb74','b 0x1006faaf0'],['dictionary-assign-0x1006fdbb4','str x21,[x9, x0, LSL #0x3]'],['dictionary-assign-0x1006fdbc4','stp q0,q1,[x9]'],['test-fallback-0x1006cb78c','bl 0x10363dee8'],['test-fallback-0x1006cba88','b 0x1006cb9ec']])instruction(label,text);
const testInstructions=result('mcp','instructions-0x1006d4ca8').instructions;
for(const text of ['0x1006d5010: bl 0x1006cb748','0x1006d5044: bl 0x1036349fc','0x1006d50cc: bl 0x10363499c','0x1006d50a4: mov w0, #0x1'])assert.ok(testInstructions.includes(text));
assert.ok(result('mcp','client-setter-incoming').references.some(r=>r.source_address==='0x1012b2840'&&r.kind.jump));assert.deepEqual(result('mcp','procedure_callers-client-setter'),[]);
const derivation=await json(path.join(out,'hash-input-derivation.json'));assert.equal(derivation.source_sha256,digest);const hashResults=[];
for(const row of derivation.inputs){
 const data=Buffer.from(row.utf8_hex,'hex');let h=5381n;for(const byte of data)h=BigInt.asUintN(64,h*33n+BigInt(byte));assert.equal('0x'+h.toString(16),row.expected);
 for(const prefix of ['arc-hash-','owned-hash-']){const r=result('mcp-hash',prefix+row.name);assert.equal(r.stop.reason,'function_return');assert.equal(r.registers_after.x0,row.expected);}
 hashResults.push({...row,arc_evidence_id:evidence('mcp-hash','arc-hash-'+row.name).evidence_id,owned_evidence_id:evidence('mcp-hash','owned-hash-'+row.name).evidence_id});
}
const negative=result('mcp-hash','arc-hash-native49-unmapped');assert.equal(negative.stop.reason,'missing_memory');assert.equal(negative.stop.address,'0x1007ed8f4');assert.equal(negative.stop.target,'0x1039d11b0');
const priorBundle=parseEvidenceBundle(await json(path.join(root,'field-tests/arc-dependency-policy-2026-11-23/mcp-details/final.bundle.json')));for(const e of priorBundle.records)assert.ok(ids.has(e.evidence_id));
const priorUnknown=priorBundle.unknowns[0],latest=final.unknowns.filter(x=>x.unknown_id===priorUnknown.unknown_id).sort((a,b)=>b.revision-a.revision)[0];assert.equal(latest.status,'open');assert.equal(latest.revision,2);assert.equal(latest.question,priorUnknown.question);assert.equal(latest.previous_revision_digest,priorUnknown.revision_digest);assert.equal(latest.resolution,null);
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const receipt={status:'passed',public_calls:calls+2,successful_calls:successful+2,expected_unlisted_procedure_errors:errors,completed_sessions:3,final_bundle_records:final.records.length,unknown_revision_history:final.unknowns.map(u=>({id:u.unknown_id,status:u.status,revision:u.revision})),exact_cli_mcp_pairs:4,frozen_runtime_files:manifest.files.length,source_hashes:manifest.source_files.length,decoded_source_instructions_checked:nativeInstructions,program_byte_reads_checked:rawReads,loader_pointer_observations:programWords,selector_checks:selectorChecks,hash_replay_pairs:hashResults,missing_memory_control:negative.stop,owned_lineages:[...sessions,cli.verifier_run],target_executed_as_host_process:false,scope:'Static suite/hash/application gate/test predicate and generic-store producers; actual Client, temporal memory stability and full Arc remain open'};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:receipt.status,calls,source_instructions:nativeInstructions,retained_records:final.records.length,hash_pairs:hashResults.length}));
