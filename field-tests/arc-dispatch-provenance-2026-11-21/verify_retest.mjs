import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-manifest.json'),'utf8')),runtime=manifest.runtime_root;
const req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const sha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const json=async f=>JSON.parse(await fs.readFile(f,'utf8'));
const digest=b=>createHash('sha256').update(b).digest('hex');
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(digest(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(digest(await fs.readFile(path.join(root,f.path))),f.sha256);
const oldRuntime=await json(path.join(root,'field-tests/arc-upstream-retained-2026-11-20/runtime-manifest.json'));
const oldFiles=new Map(oldRuntime.files.map(f=>[f.path,f.sha256])),newFiles=new Map(manifest.files.map(f=>[f.path,f.sha256]));
const runtimeDelta={changed:[...oldFiles.keys()].filter(p=>newFiles.has(p)&&oldFiles.get(p)!==newFiles.get(p)).sort(),added:[...newFiles.keys()].filter(p=>!oldFiles.has(p)).sort(),removed:[...oldFiles.keys()].filter(p=>!newFiles.has(p)).sort()};
assert.deepEqual(runtimeDelta.changed,['dist/domain/native/objcSwiftMetadata.js','dist/native/AppleDispatchMetadata.js','dist/native/AppleSwiftDispatchFacets.js']);assert.deepEqual(runtimeDelta.added,['dist/native/AppleSwiftWitnessData.js']);assert.deepEqual(runtimeDelta.removed,['bridge/unicorn/__pycache__/emulate.cpython-313.pyc']);
for(const f of oldRuntime.files.filter(f=>f.path.startsWith('bridge/ghidra/')))assert.equal(newFiles.get(f.path),f.sha256);
assert.match(await fs.readFile(path.join(out,'native-tests-qualified.log'),'utf8'),/Tests\s+92 passed \(92\)/);
assert.match(await fs.readFile(path.join(out,'check-fast-qualified.log'),'utf8'),/Tasks:\s+2 successful, 2 total/);
const sessions=[];
for(const directory of ['mcp','mcp-witness']){
 const base=path.join(out,directory),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json'));
 assert.equal(summary.status,'completed');assert.equal(calls.length,summary.calls);assert.equal(summary.errors,0);assert.equal(summary.successful,calls.length);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);
 const bundle=await json(path.join(base,'final.bundle.json')),records=new Map(bundle.records.map(r=>[r.evidence_id,r]));
 for(const r of records.values()){parseEvidence(r);assert.equal(r.subject?.digest.sha256,sha);}
 const catalog=await json(path.join(base,'catalog.json')),ajv=new Ajv2020({strict:false,validateFormats:false}),schemas=new Map(),labels=new Set();
 const validator=s=>{assert.ok(ajv.validateSchema(s));if(s.$id&&schemas.has(s.$id)){const old=schemas.get(s.$id);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);if(s.$id)schemas.set(s.$id,{schema:s,fn});return fn;};
 for(const c of calls){
  assert.equal(c.thrown,null);assert.equal(c.is_error,false);assert.ok(!labels.has(c.reply));labels.add(c.reply);
  const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));
  const reply=await json(path.join(base,c.reply)),value=reply.structuredContent;assert.ok(value);assert.ok(validator(t.outputSchema)(value));
  // Historical first-session schemas predate witness_data, but remain valid
  // inputs to the current named canonical contracts without rewriting them.
  toolContract(c.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),value);
  if(c.evidence_id){parseEvidence(value);assert.equal(value.evidence_id,c.evidence_id);assert.equal(value.subject.digest.sha256,sha);assert.deepEqual(value,records.get(c.evidence_id));assert.deepEqual(value,await json(path.join(base,c.reply.replace(/\.reply\.json$/,'.evidence.json'))));}
 }
 sessions.push({directory,calls:calls.length,successful:calls.length,errors:0,explicit_close_twice:true,verified_empty_lineage:true,bundle_sha256:digest(await fs.readFile(path.join(base,'final.bundle.json')))});
}
const resultOf=e=>e.normalized_result.result;
const dep=await json(path.join(out,'mcp-witness/DependencyKey.evidence.json')),test=await json(path.join(out,'mcp-witness/TestDependencyKey.evidence.json'));
const baseSlot=resultOf(dep).swift_dispatch_slots[0],valueSlot=resultOf(test).swift_dispatch_slots[0];
assert.equal(baseSlot.implementation_address,null);assert.equal(baseSlot.decode.status,'decoded');assert.equal(baseSlot.witness_data.kind,'base_protocol');assert.equal(baseSlot.witness_data.protocol_descriptor.address,'0x103d46dfc');assert.equal(baseSlot.witness_data.type_descriptor.address,'0x103d648c4');
assert.equal(valueSlot.implementation_address,null);assert.equal(valueSlot.decode.status,'decoded');assert.equal(valueSlot.witness_data.name,'Value');assert.equal(valueSlot.witness_data.context_descriptor.address,'0x103d648c4');assert.equal(valueSlot.witness_data.type_name,'UserDefaultsClient');
const parity=[];
for(const [label,evidence] of [['DependencyKey',dep],['TestDependencyKey',test]]){
 const cli=await json(path.join(out,`cli-${label}.json`));assert.equal(cli.ok,true);parseEvidence(cli.data);assert.equal(cli.data.subject.digest.sha256,sha);assert.deepEqual(resultOf(cli.data),resultOf(evidence));parity.push({label,complete_metadata_equal:true,cli_evidence_id:cli.data.evidence_id,mcp_evidence_id:evidence.evidence_id});
}
const before=await json(path.join(root,'field-tests/arc-persistence-2026-11-20/mcp/user-defaults-conformances.evidence.json')),after=await json(path.join(out,'mcp-witness/all-UserDefaultsClient.evidence.json'));
const codeTargets=r=>r.swift_dispatch_slots.map(s=>[s.owner,s.slot_index,s.implementation_address]);assert.deepEqual(codeTargets(resultOf(before)),codeTargets(resultOf(after)));
for(const field of ['index_entries','examined','matched','admitted','unresolved'])assert.equal(resultOf(before).swift_conformance_discovery[field],resultOf(after).swift_conformance_discovery[field]);
const broad=resultOf(after).swift_conformance_discovery;assert.equal(broad.matched,2);assert.equal(broad.unresolved,401);
const compilerLog=await fs.readFile(path.join(out,'apple-dispatch-check.log'),'utf8'),compiler=JSON.parse(compilerLog.trim().split('\n').filter(s=>s.startsWith('{')).at(-1));assert.equal(compiler.ok,true);assert.equal(compiler.target_executed,false);assert.equal(compiler.fixtures.length,10);assert.equal(compiler.conformance_discovery.length,7);assert.ok(compiler.conformance_discovery.every(x=>x.cli_mcp_equal));
const packageLog=await fs.readFile(path.join(out,'package-check-qualified.log'),'utf8'),pack=JSON.parse(packageLog.split('\n').find(s=>s.startsWith('{"verifier_run"')));assert.equal(pack.verifier_run.process_lineage.status,'verified');assert.deepEqual(pack.verifier_run.process_lineage.descendants,[]);assert.equal(pack.mcpTools,205);
const result={status:'passed',target_sha256:sha,sessions,total_mcp_calls:sessions.reduce((n,s)=>n+s.calls,0),cli_cases:parity,typed_witness_data:{base_protocol:baseSlot.witness_data,associated_type:valueSlot.witness_data},unchanged_executable_targets:true,broad_discovery:{matched:2,unresolved:401},compiler_fixture_variants:10,compiler_cli_mcp_discovery_cases:7,target_executed:false,package_verifier:{status:'passed',tools:205,verified_empty_lineage:true},frozen_runtime_files:manifest.files.length,runtime_delta:runtimeDelta,ghidra_bridge_unchanged:true,source_tests:92,limits:['The selected conformances decode completely; 401 broader identities remain unresolved.','Data identity does not reveal getter names/signatures or prove runtime dependency injection.','Item 63 input-type propagation and automatic unguarded-table recovery remain open.','The Ghidra native producer was not changed; its previous 102-case matrix was not repeated.']};
await fs.writeFile(path.join(out,'retest-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,mcp_calls:result.total_mcp_calls,cli_cases:parity.length,compiler_variants:10,source_tests:92,broad_unresolved:401}));
