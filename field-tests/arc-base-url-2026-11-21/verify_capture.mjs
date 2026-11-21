import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async f=>JSON.parse(await fs.readFile(f,'utf8')),digest=b=>createHash('sha256').update(b).digest('hex');
const manifestPath=path.join(root,'field-tests/arc-typed-dispatch-2026-11-21/runtime-manifest.json'),manifest=await json(manifestPath),runtime=manifest.runtime_root;
const req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
const sha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(digest(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(digest(await fs.readFile(path.join(root,f.path))),f.sha256);
const sessions=[];
for(const directory of ['mcp','mcp-seeded','mcp-string']){
 const base=path.join(out,directory),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json'));
 assert.equal(summary.status,'completed');assert.equal(calls.length,summary.calls);assert.equal(summary.errors,directory==='mcp'?4:0);
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
  if(c.is_error){assert.ok(['0x100d9b4d0','0x100d9a538'].includes(c.arguments.procedure));continue;}
  const value=reply.structuredContent;assert.ok(value);assert.ok(validator(t.outputSchema)(value));toolContract(c.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),value);
  if(c.evidence_id){parseEvidence(value);assert.equal(value.evidence_id,c.evidence_id);assert.equal(value.subject.digest.sha256,sha);assert.deepEqual(value,records.get(c.evidence_id));assert.deepEqual(value,await json(path.join(base,c.reply.replace(/\.reply\.json$/,'.evidence.json'))));}
 }
 sessions.push({directory,calls:calls.length,successful:summary.successful,errors:summary.errors,explicit_close_twice:true,verified_empty_lineage:true,bundle_sha256:digest(await fs.readFile(path.join(base,'final.bundle.json')))});
}
const metadata=(await json(path.join(out,'mcp/application-paths-conformances.evidence.json'))).normalized_result.result;
assert.equal(metadata.swift_conformance_discovery.matched,2);assert.equal(metadata.swift_conformance_discovery.unresolved,401);
const value=metadata.swift_dispatch_slots.find(s=>s.witness_data?.kind==='associated_type').witness_data;assert.equal(value.type_name,'ApplicationPaths');assert.equal(value.context_descriptor.address,'0x103d648ec');
const implementations=metadata.swift_dispatch_slots.filter(s=>s.implementation_address!==null).map(s=>s.implementation_address);assert.deepEqual(implementations,['0x100d9b4d0','0x100d9b4d0','0x100d9a538']);
const overlay=await json(path.join(out,'overlay-receipt.json'));assert.equal(overlay.status,'passed');assert.equal(overlay.seed.entries,2481);assert.equal(digest(await fs.readFile(path.join(root,overlay.seed.path))),overlay.seed.sha256);
const result={status:'passed',target_sha256:sha,sessions,total_calls:sessions.reduce((n,s)=>n+s.calls,0),successful:sessions.reduce((n,s)=>n+s.successful,0),errors:4,frozen_runtime_files:manifest.files.length,runtime_manifest_sha256:digest(await fs.readFile(manifestPath)),production_sources_unchanged:true,application_paths_witness_targets:implementations,base_profile_entries:2463,focused_profile_entries:2481,added_source_verified_entries:18,target_executed:false,limits:['First-session admission errors are retained; they are not erased by later profile expansion.','Caller-selected seed origins are assertions corroborated against original indexed function starts, not analyzer discoveries.','Static default construction does not select runtime dependency injection or prove filesystem behavior.']};
await fs.writeFile(path.join(out,'capture-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify(result));
