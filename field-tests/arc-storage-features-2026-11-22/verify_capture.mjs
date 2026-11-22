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
for(const [directory,bundleName,classification] of [['arc-features-used-2026-11-21/mcp','phase-3.bundle.json','partial-idle-expired'],['arc-storage-features-2026-11-22/mcp','final.bundle.json','completed']]){
 const base=path.join(root,'field-tests',directory),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json'));
 assert.equal(summary.status,'completed');assert.equal(calls.length,summary.calls);assert.equal(summary.errors,0);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 if(classification==='completed')assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);else {assert.match(await fs.readFile(path.join(root,'field-tests/arc-features-used-2026-11-21/run.log'),'utf8'),/continuation-expired/);assert.ok(!calls.some(c=>c.name==='close_binary'));}
 const bundle=await json(path.join(base,bundleName)),records=new Map(bundle.records.map(r=>[r.evidence_id,r]));
 for(const r of records.values()){parseEvidence(r);assert.equal(r.subject?.digest.sha256,sha);}
 const catalog=await json(path.join(base,'catalog.json')),ajv=new Ajv2020({strict:false,validateFormats:false}),schemas=new Map(),labels=new Set();
 const validator=s=>{assert.ok(ajv.validateSchema(s));if(s.$id&&schemas.has(s.$id)){const old=schemas.get(s.$id);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);if(s.$id)schemas.set(s.$id,{schema:s,fn});return fn;};
 for(const c of calls){
  assert.equal(c.thrown,null);assert.ok(!labels.has(c.reply));labels.add(c.reply);
  const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));
  const reply=await json(path.join(base,c.reply));assert.equal(reply.isError===true,c.is_error);
  assert.equal(c.is_error,false);
  const value=reply.structuredContent;assert.ok(value);assert.ok(validator(t.outputSchema)(value));toolContract(c.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),value);
  if(c.evidence_id){parseEvidence(value);assert.equal(value.evidence_id,c.evidence_id);assert.equal(value.subject.digest.sha256,sha);assert.deepEqual(value,records.get(c.evidence_id));assert.deepEqual(value,await json(path.join(base,c.reply.replace(/\.reply\.json$/,'.evidence.json'))));}
 }
 sessions.push({directory,classification,recorder_status:summary.status,calls:calls.length,successful:summary.successful,errors:summary.errors,explicit_close_twice:classification==='completed',verified_empty_lineage:true,bundle_sha256:digest(await fs.readFile(path.join(base,bundleName)))});
}

assert.equal(sessions[0].calls,73);assert.equal(sessions[1].calls,236);
const idle=await json(path.join(out,'recorder-idle-check/summary.json')),fatal=await json(path.join(out,'recorder-idle-check/fatal.json'));assert.equal(idle.status,'failed');assert.equal(idle.calls,0);assert.match(fatal.message,/continuation expired/);assert.equal(idle.verifier_run.process_lineage.status,'verified');assert.deepEqual(idle.verifier_run.process_lineage.descendants,[]);
const reviewDir=path.join(root,'field-tests/arc-features-used-2026-11-21'),review=await json(path.join(reviewDir,'feature-predicate-review.json'));assert.equal(digest(await fs.readFile(path.join(reviewDir,'feature-predicate-review.md'))),review.markdown_sha256);
for(const source of review.sources){const b=await fs.readFile(path.join(root,source.path));assert.equal(digest(b),source.sha256);if(source.evidence_id){const e=JSON.parse(b.toString());parseEvidence(e);assert.equal(e.evidence_id,source.evidence_id);assert.equal(e.subject.digest.sha256,sha);}}
const binary=await fs.readFile(path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'));assert.equal(digest(binary),sha);const segments=[];let cursor=32;for(let i=0;i<binary.readUInt32LE(16);i++){const cmd=binary.readUInt32LE(cursor),size=binary.readUInt32LE(cursor+4);if(cmd===0x19)segments.push({vm:Number(binary.readBigUInt64LE(cursor+24)),off:Number(binary.readBigUInt64LE(cursor+40)),size:Number(binary.readBigUInt64LE(cursor+48))});cursor+=size;}
let probes=0;for(const f of await fs.readdir(path.join(out,'mcp'))){if(!f.endsWith('.evidence.json'))continue;const e=await json(path.join(out,'mcp',f));if(e.operation!=='inspect_native_instruction')continue;const v=e.normalized_result;assert.equal(v.status,'decoded');const a=Number(BigInt(v.address)),seg=segments.find(s=>s.vm<=a&&a+v.length<=s.vm+s.size);assert.ok(seg);assert.equal(binary.subarray(seg.off+a-seg.vm,seg.off+a-seg.vm+v.length).toString('hex'),v.bytes);probes++;}
const facts=await json(path.join(out,'fact-index.json'));assert.equal(facts.status,'passed');for(const claim of facts.claims)for(const source of claim.sources){const b=await fs.readFile(path.join(root,source.path));assert.equal(digest(b),source.sha256);const e=JSON.parse(b.toString());parseEvidence(e);assert.equal(e.evidence_id,source.evidence_id);assert.equal(e.subject.digest.sha256,sha);}
const result={status:'passed',target_sha256:sha,sessions,total_calls:309,successful:309,errors:0,first_session_partial_despite_successful_replies:true,recorder_expiry_fix:{expected_failure:true,calls:0,target_opened:false,verified_empty_lineage:true},predicate_review_source_records:review.sources.length,decoded_instruction_probes_matching_original_bytes:probes,frozen_runtime_files:manifest.files.length,production_sources_unchanged:true,target_executed:false,limits:['The first recorder status was misleading; original files are preserved and this receipt explicitly classifies the expired session as partial.','All analysis is static and conditional on selected shipped implementations/normal ABI premises; no runtime I/O, injection or durability observed.','The qualified instruction/native producers are unchanged; no new 102-case matrix or package run is claimed.']};
await fs.writeFile(path.join(out,'capture-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify(result));
