import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async f=>JSON.parse(await fs.readFile(f,'utf8'));
const digest=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-manifest.json')),runtime=manifest.runtime_root;
const req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const sha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(digest(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(digest(await fs.readFile(path.join(root,f.path))),f.sha256);
const prior=await json(path.join(root,'field-tests/arc-dispatch-provenance-2026-11-21/runtime-manifest.json'));
const oldFiles=new Map(prior.files.map(f=>[f.path,f.sha256])),newFiles=new Map(manifest.files.map(f=>[f.path,f.sha256]));
for(const f of prior.files.filter(f=>f.path.startsWith('bridge/ghidra/')&&f.path!=='bridge/ghidra/ReaGhidraBridge.java'))assert.equal(newFiles.get(f.path),f.sha256);
assert.notEqual(newFiles.get('bridge/ghidra/ReaGhidraBridge.java'),oldFiles.get('bridge/ghidra/ReaGhidraBridge.java'));
const sessions=[];
for(const directory of ['mcp','mcp-byte']){
 const base=path.join(out,directory),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json'));
 assert.equal(summary.status,'completed');assert.equal(calls.length,summary.calls);assert.equal(summary.errors,directory==='mcp'?2:0);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 const bundle=await json(path.join(base,'final.bundle.json')),records=new Map(bundle.records.map(r=>[r.evidence_id,r]));
 for(const r of records.values()){parseEvidence(r);assert.equal(r.subject?.digest.sha256,sha);}
 const catalog=await json(path.join(base,'catalog.json')),ajv=new Ajv2020({strict:false,validateFormats:false}),schemas=new Map(),labels=new Set();
 const validator=s=>{assert.ok(ajv.validateSchema(s));if(s.$id&&schemas.has(s.$id)){const old=schemas.get(s.$id);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);if(s.$id)schemas.set(s.$id,{schema:s,fn});return fn;};
 for(const c of calls){
  assert.equal(c.thrown,null);assert.ok(!labels.has(c.reply));labels.add(c.reply);
  const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));
  const reply=await json(path.join(base,c.reply));assert.equal(reply.isError===true,c.is_error);
  if(c.is_error){assert.ok(c.arguments.procedure==='0x100d97b04');continue;}
  const value=reply.structuredContent;assert.ok(value);assert.ok(validator(t.outputSchema)(value));toolContract(c.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),value);
  if(c.evidence_id){parseEvidence(value);assert.equal(value.evidence_id,c.evidence_id);assert.equal(value.subject.digest.sha256,sha);assert.deepEqual(value,records.get(c.evidence_id));assert.deepEqual(value,await json(path.join(base,c.reply.replace(/\.reply\.json$/,'.evidence.json'))));}
 }
 sessions.push({directory,calls:calls.length,successful:summary.successful,errors:summary.errors,explicit_close_twice:true,verified_empty_lineage:true,bundle_sha256:digest(await fs.readFile(path.join(base,'final.bundle.json')))});
}
const ev=async label=>json(path.join(out,'mcp-byte',label+'.evidence.json'));
const val=async label=>(await ev(label)).normalized_result;
assert.deepEqual(await val('setting-body-before'),await val('setting-body-after'));
assert.equal((await val('setting-body-before')).instructions.length,14);
assert.equal((await val('setting-body-before')).procedure.body.total_bytes,56);
for(const [first,last] of [['setting-branch-default','unlisted-default-after-0x1005ab4e8'],['storage-branch-default','unlisted-default-after-0x100d98aa0']]){
 const a=await val(first),b=await val(last);assert.equal(a.status,'undecodable');assert.equal(b.status,'undecodable');assert.equal(b.decode_source,null);assert.equal(b.references_available,false);
}
const branchLabels=['setting-branch-0x1005ab4e8','setting-branch-0x1005ab4ec','setting-branch-0x1005ab4f0',...Array.from({length:6},(_,i)=>'setting-return-0x'+(0x1005ab7c8+4*i).toString(16)),'storage-branch-0x100d98aa0','storage-branch-0x100d98aa4','storage-branch-0x100d98aa8',...Array.from({length:5},(_,i)=>'storage-selected-tail-0x'+(0x100d98ad0+4*i).toString(16)),...Array.from({length:10},(_,i)=>'storage-filename-tail-0x'+(0x100d98f68+4*i).toString(16))];
// Corroborate instruction interpretation against immutable original __TEXT bytes,
// not against loader-fixed pointer slots (which intentionally have different bytes).
const input=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),binary=await fs.readFile(input);assert.equal(digest(binary),sha);
const segments=[];let cursor=32;for(let i=0;i<binary.readUInt32LE(16);i++){const cmd=binary.readUInt32LE(cursor),size=binary.readUInt32LE(cursor+4);if(cmd===0x19)segments.push({vm:Number(binary.readBigUInt64LE(cursor+24)),off:Number(binary.readBigUInt64LE(cursor+40)),size:Number(binary.readBigUInt64LE(cursor+48))});cursor+=size;}
for(const label of branchLabels){const v=await val(label);assert.equal(v.status,'decoded');assert.equal(v.decode_source,'unlisted_program_bytes');assert.equal(v.references_available,false);assert.deepEqual(v.references,[]);assert.equal(v.procedure,null);const a=Number(BigInt(v.address)),s=segments.find(s=>s.vm<=a&&a+v.length<=s.vm+s.size);assert.ok(s);assert.equal(binary.subarray(s.off+a-s.vm,s.off+a-s.vm+v.length).toString('hex'),v.bytes);}
assert.deepEqual((await val('storage-branch-0x100d98aa8')).flow.direct_destinations,['0x100d98ad0']);
assert.deepEqual((await val('storage-selected-tail-0x100d98ae0')).flow.direct_destinations,['0x100d98f68']);
assert.deepEqual((await val('storage-filename-tail-0x100d98f8c')).flow.direct_destinations,['0x100d98fd0']);
const bytes=async l=>Buffer.from((await val(l)).bytes_hex,'hex');
assert.equal((await bytes('storage-selected-table-word')).readUInt16LE(),4);assert.equal(0x100d98a90+4*4,0x100d98aa0);
assert.equal((await bytes('storage-path-component')).subarray(0,23).toString(),'StorableBoostsData.json');
assert.equal((await bytes('setting-preference-key')).subarray(0,30).toString(),'hasDismissedBoostsInterstitial');
for(const [label,value] of [['path-selector-create-directory','createDirectoryAtURL:withIntermediateDirectories:attributes:error:'],['path-selector-exists','fileExistsAtPath:isDirectory:'],['path-selector-default-manager','defaultManager'],['application-paths-field-name-0','baseURL'],['dependency-type-name-0x10373d1c0','ApplicationPaths']])assert.equal((await bytes(label)).toString().split('\0')[0],value);
assert.equal(await val('path-msgsend-symbol'),'_objc_msgSend');
const fixture=await json(path.join(out,'byte-qualification-v3/verification.json'));assert.equal(fixture.status,'passed');assert.equal(fixture.cases.length,2);assert.equal(fixture.cases.reduce((n,c)=>n+c.calls,0),44);assert.equal(fixture.cases.reduce((n,c)=>n+c.expected_rejections,0),4);assert.ok(fixture.cases.every(c=>c.cli_mcp_equal&&c.listing_and_body_unchanged&&!c.target_executed));assert.equal(fixture.verifier_run.process_lineage.status,'verified');assert.deepEqual(fixture.verifier_run.process_lineage.descendants,[]);
for(const [file,pattern] of [['instruction-focused-tests.log',/Tests\s+43 passed \(43\)/],['check-fast-release.log',/Tasks:\s+2 successful, 2 total/],['build-qualified.log',/Tasks:\s+3 successful, 3 total/],['docs-check.log',/Tasks:\s+6 successful, 6 total/]])assert.match(await fs.readFile(path.join(out,file),'utf8'),pattern);
const packageLog=await fs.readFile(path.join(out,'package-check.log'),'utf8'),pack=JSON.parse(packageLog.split('\n').find(s=>s.startsWith('{"verifier_run"')));assert.equal(pack.verifier_run.process_lineage.status,'verified');assert.deepEqual(pack.verifier_run.process_lineage.descendants,[]);assert.equal(pack.mcpTools,205);
const facts={status:'passed',target_sha256:sha,sessions,total_arc_mcp_calls:sessions.reduce((n,s)=>n+s.calls,0),arc_successful:sessions.reduce((n,s)=>n+s.successful,0),arc_errors:2,frozen_runtime_files:manifest.files.length,source_tests:43,owned_native_matrix:{calls:44,successful:40,expected_rejections:4,cli_mcp_cases:2,target_executed:false,verified_empty_lineage:true},unlisted_selected_path_instructions:branchLabels.length,original_instruction_bytes_equal:true,setting_body_and_default_listing_unchanged:true,selected_filename:'StorableBoostsData.json',selected_preference_key:'hasDismissedBoostsInterstitial',path_builder:'0x100d98fd0',path_dependency:'ApplicationPaths',selected_base_directory:'unresolved',item63:'open-context-scoped-type-proof-required',swift_enum_recovery_class_unchanged:true,package_verifier:{status:'passed',tools:205,verified_empty_lineage:true},target_executed:false,limits:['Static source-bound selected paths are not runtime observations.','Detached decoding adds no Listing/function/reference/CFG objects.','The typed ApplicationPaths dependency is identified; its injected value and baseURL construction remain unresolved.','One selected enum caller cannot authorize an owner-wide CFG override for shared helpers.','Earlier fixture/field attempts remain retained failures; only byte-qualification-v3 is the passing native lane.']};
await fs.writeFile(path.join(out,'retest-verification.json'),JSON.stringify(facts,null,2)+'\n');console.log(JSON.stringify(facts));
