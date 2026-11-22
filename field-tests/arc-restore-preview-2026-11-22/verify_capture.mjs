import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const digest=b=>createHash('sha256').update(b).digest('hex');
const sha='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const manifest=await json(path.join(root,'field-tests/arc-typed-dispatch-2026-11-21/runtime-manifest.json'));
const runtime=manifest.runtime_root,req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const f of manifest.files){const b=await fs.readFile(path.join(runtime,f.path));assert.equal(b.length,f.bytes);assert.equal(digest(b),f.sha256);}
for(const f of manifest.source_files)assert.equal(digest(await fs.readFile(path.join(root,f.path))),f.sha256);
const sessions=[];
for(const [directory,bundleName,classification,count] of [['mcp','phase-7.bundle.json','partial-idle-expired',199],['mcp-followup','final.bundle.json','completed',28]]){
 const base=path.join(out,directory),summary=await json(path.join(base,'summary.json')),calls=await json(path.join(base,'invocations.json'));
 assert.equal(calls.length,count);assert.equal(summary.calls,count);assert.equal(summary.successful,count);assert.equal(summary.errors,0);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 if(classification==='completed'){assert.equal(summary.status,'completed');assert.deepEqual(calls.slice(-2).map(c=>c.name),['close_binary','close_binary']);}
 else {assert.equal(summary.status,'failed');assert.match((await json(path.join(base,'fatal.json'))).message,/continuation expired/);assert.match(await fs.readFile(path.join(out,'run.log'),'utf8'),/continuation-expired/);assert.ok(!calls.some(c=>c.name==='close_binary'));assert.ok(!calls.some(c=>c.reply==='chromium-preview-selector.reply.json'));}
 const bundle=await json(path.join(base,bundleName)),records=new Map(bundle.records.map(r=>[r.evidence_id,r]));
 for(const e of records.values()){parseEvidence(e);assert.equal(e.subject.digest.sha256,sha);}
 const catalog=await json(path.join(base,'catalog.json')),ajv=new Ajv2020({strict:false,validateFormats:false}),schemas=new Map(),labels=new Set();
 const validator=s=>{assert.ok(ajv.validateSchema(s));if(s.$id&&schemas.has(s.$id)){const old=schemas.get(s.$id);assert.deepEqual(s,old.schema);return old.fn;}const fn=ajv.compile(s);if(s.$id)schemas.set(s.$id,{schema:s,fn});return fn;};
 for(const c of calls){
  assert.equal(c.thrown,null);assert.equal(c.is_error,false);assert.ok(!labels.has(c.reply));labels.add(c.reply);
  const t=catalog.find(t=>t.name===c.name);assert.ok(t);assert.ok(validator(t.inputSchema)(c.arguments));
  const reply=await json(path.join(base,c.reply));assert.notEqual(reply.isError,true);const value=reply.structuredContent;
  assert.ok(validator(t.outputSchema)(value));toolContract(c.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),value);
  if(c.evidence_id){parseEvidence(value);assert.equal(value.evidence_id,c.evidence_id);assert.equal(value.subject.digest.sha256,sha);assert.deepEqual(value,records.get(c.evidence_id));assert.deepEqual(value,await json(path.join(base,c.reply.replace(/\.reply\.json$/,'.evidence.json'))));}
 }
 sessions.push({directory,classification,recorder_status:summary.status,calls:count,successful:count,errors:0,explicit_close_twice:classification==='completed',verified_empty_lineage:true,bundle_sha256:digest(await fs.readFile(path.join(base,bundleName)))});
}
const reviewed=[];
for(const name of ['restore-review','preview-review','restore-resolution','preview-resolution-review']){
 const review=await json(path.join(out,name+'.json')),md=await fs.readFile(path.join(out,name+'.md'));
 if(review.markdown_sha256)assert.equal(digest(md),review.markdown_sha256);
 const sources=review.sources??review.source_index;
 for(const s of sources){const b=await fs.readFile(path.join(root,s.path));assert.equal(digest(b),s.sha256,s.path);const e=JSON.parse(b.toString());parseEvidence(e);assert.equal(e.evidence_id,s.evidence_id);assert.equal(e.subject.digest.sha256,sha);if(s.operation)assert.equal(e.operation,s.operation);}
 reviewed.push({name,source_records:sources.length,json_sha256:digest(await fs.readFile(path.join(out,name+'.json'))),markdown_sha256:digest(md)});
}
assert.equal(reviewed[0].json_sha256,'02cc91e8ef56e7f681648d580c9faa0cb9679cc3e3355825be93226344c7a5a7');
assert.equal(reviewed[0].markdown_sha256,'70dd414b169a7f9baa7bcd470bf71e73e219524142bc31d5c404f379868bcbc0');
assert.equal(reviewed[1].json_sha256,'a90d31505c3b4b60791ce4cf7de353ca68eaa181901b9f1196ad19581fbec268');
assert.equal(reviewed[1].markdown_sha256,'d302e114e39585d73f1705b0ecf8636a3741cf6e1bbfa7f7b5763a7a380a3899');
const binary=await fs.readFile(path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'));assert.equal(digest(binary),sha);
const segments=[];let cursor=32;for(let i=0;i<binary.readUInt32LE(16);i++){const cmd=binary.readUInt32LE(cursor),size=binary.readUInt32LE(cursor+4);if(cmd===0x19)segments.push({vm:Number(binary.readBigUInt64LE(cursor+24)),off:Number(binary.readBigUInt64LE(cursor+40)),size:Number(binary.readBigUInt64LE(cursor+48))});cursor+=size;}
let probes=0;for(const dir of ['mcp','mcp-followup'])for(const f of await fs.readdir(path.join(out,dir))){if(!f.endsWith('.evidence.json'))continue;const e=await json(path.join(out,dir,f));if(e.operation!=='inspect_native_instruction')continue;const v=e.normalized_result;assert.equal(v.status,'decoded');const a=Number(BigInt(v.address)),s=segments.find(s=>s.vm<=a&&a+v.length<=s.vm+s.size);assert.ok(s);assert.equal(binary.subarray(s.off+a-s.vm,s.off+a-s.vm+v.length).toString('hex'),v.bytes);probes++;}
const facts=await json(path.join(out,'fact-index.json'));assert.equal(facts.status,'passed');for(const claim of facts.claims)for(const source of claim.sources){const b=await fs.readFile(path.join(root,source.path));assert.equal(digest(b),source.sha256);const e=JSON.parse(b.toString());parseEvidence(e);assert.equal(e.evidence_id,source.evidence_id);assert.equal(e.subject.digest.sha256,sha);}
const abi=await json(path.join(out,'swift-abi-authority.json'));assert.equal(digest(await fs.readFile(path.join(out,'swift-abi-authority.txt'))),abi.excerpt_sha256);
const result={status:'passed',target_sha256:sha,sessions,total_calls:227,successful:227,errors:0,reviews:reviewed,decoded_instruction_probes_matching_original_bytes:probes,frozen_runtime_files:manifest.files.length,production_sources_unchanged:true,target_executed:false,limits:['The first session expired with 199 successful replies; it is partial, not completed. Its last export contains all successful Evidence records. Late phase-8 plan was not executed there.','The second session closes twice; both point-in-time owned lineages are verified empty.','Runtime witness selection, image pixels, filesystem results and writeback were not observed.','The qualified native producers are unchanged; no new 102-case matrix or package qualification is claimed.']};
await fs.writeFile(path.join(out,'capture-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify(result));
