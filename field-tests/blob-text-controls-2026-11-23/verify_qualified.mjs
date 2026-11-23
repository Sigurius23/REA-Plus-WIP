import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const delivery=await json(path.join(out,'runtime-delivery-manifest.json')),runtime=delivery.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
let runtimeFiles=0;
for(const manifest of [await json(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json')),await json(path.join(out,'runtime-final-manifest.json')),await json(path.join(out,'runtime-qualified-manifest.json')),delivery]){
 for(const row of manifest.files){const b=await fs.readFile(path.join(manifest.runtime_root,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);runtimeFiles++;}
}
for(const row of delivery.source_files)assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256,row.path);
const fixture=await json(path.join(out,'fixtures.json'));
for(const f of fixture.fixtures)assert.equal((await fs.readFile(f.path)).toString('hex'),f.bytes_hex);
const sessions=[],records=new Map();let calls=0,evidenceReplies=0;
for(const directory of ['mcp-baseline','mcp-final','mcp-qualified','mcp-delivery']){
 const dir=path.join(out,directory),summary=await json(path.join(dir,'summary.json'));assert.equal(summary.status,'completed');assert.equal(summary.calls,16);assert.equal(summary.errors,0);assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push(summary.verifier_run);calls+=summary.calls;
 const bundle=parseEvidenceBundle(await json(path.join(dir,'final.bundle.json')));
 for(const row of await json(path.join(dir,'invocations.json'))){
  assert.equal(row.is_error,false);assert.equal(row.thrown,null);const reply=await json(path.join(dir,row.reply));toolContract(row.name).outputSchema.parse(reply.structuredContent);assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),reply.structuredContent);
  if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent);assert.ok(bundle.records.some(x=>x.evidence_id===e.evidence_id));assert.equal(e.operation,'inspect_data_blob');const r=e.normalized_result,source=await fs.readFile(r.file.path);assert.equal(sha(source),r.file.sha256);assert.equal(source.length,r.file.bytes);assert.equal(sha(source.subarray(r.range.offset,r.range.offset+r.range.length)),r.payload.sha256);
  records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);evidenceReplies++;
 }
}
assert.equal(calls,64);assert.equal(evidenceReplies,60);
const get=(d,l)=>{const e=records.get(d+'/'+l);assert.ok(e,d+'/'+l);return e;};const result=(d,l)=>get(d,l).normalized_result;
const comparisons=[];
for(const label of ['cbor-controls','cbor-indefinite','msgpack-controls']){
 const before=result('mcp-baseline',label+'-tree');assert.equal(before.tree[0].type,'str-bytes');assert.equal(result('mcp-baseline',label+'-strings').strings.length,0);
 for(const directory of ['mcp-final','mcp-qualified','mcp-delivery']){
  const tree=result(directory,label+'-tree'),strings=result(directory,label+'-strings');assert.equal(tree.tree[0].type,'string');assert.equal(tree.tree[0].value,fixture.expected_text);assert.equal(tree.tree[0].length,tree.payload.bytes);assert.deepEqual(strings.strings,[{path:'$',offset:0,value:fixture.expected_text}]);
 }
 comparisons.push({label,before:get('mcp-baseline',label+'-strings').evidence_id,after:get('mcp-delivery',label+'-strings').evidence_id});
}
for(const label of ['cbor-invalid','msgpack-invalid','cbor-bytes','protobuf-bytes']){
 for(const view of ['tree','strings'])for(const directory of ['mcp-final','mcp-qualified','mcp-delivery'])assert.deepEqual(get(directory,label+'-'+view),get('mcp-baseline',label+'-'+view));
 assert.deepEqual(result('mcp-delivery',label+'-strings').strings,[]);
}
const before=result('mcp-baseline','arc-original-selector'),after=result('mcp-delivery','arc-original-selector');assert.equal(before.format.name,'cbor');assert.equal(after.format.name,'cbor');assert.deepEqual(before.strings,[]);assert.equal(after.strings[0].value,'erformSelector:\0');assert.equal(after.file.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const cli=await json(path.join(out,'cli-delivery-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);sessions.push(cli.verifier_run);
for(const filename of ['cli-verification.json','cli-qualified-verification.json']){const x=await json(path.join(out,filename));assert.equal(x.status,'failed');assert.equal(x.verifier_run.process_lineage.status,'verified');assert.deepEqual(x.verifier_run.process_lineage.descendants,[]);sessions.push(x.verifier_run);}
const tests=await fs.readFile(path.join(out,'tests-qualified.log'),'utf8');assert.match(tests,/17 passed \| 4 skipped/);
for(const [filename,regex] of [['build-delivery.log',/3 successful/],['docs-delivery.log',/6 successful/],['check-fast-delivery.log',/2 successful/]])assert.match(await fs.readFile(path.join(out,filename),'utf8'),regex);
const packageLog=await fs.readFile(path.join(out,'package-delivery.log'),'utf8'),packageReceipt=JSON.parse(packageLog.trim().split('\n').at(-1));assert.equal(packageReceipt.mcpTools,206);assert.equal(packageReceipt.cli,true);assert.equal(packageReceipt.verifier_run.process_lineage.status,'verified');assert.deepEqual(packageReceipt.verifier_run.process_lineage.descendants,[]);sessions.push(packageReceipt.verifier_run);
const receipt={status:'passed',public_mcp_calls:calls,successful_mcp_calls:calls,evidence_replies:evidenceReplies,complete_mcp_captures:4,baseline_calls:16,preliminary_fixed_calls:32,final_delivery_calls:16,exact_cli_mcp_pairs:4,retained_failed_cli_harness_attempts:2,typed_text_comparisons:comparisons,unchanged_malformed_and_untyped_cases:4,arc_before:get('mcp-baseline','arc-original-selector').evidence_id,arc_after:get('mcp-delivery','arc-original-selector').evidence_id,runtime_files_checked:runtimeFiles,final_runtime_files:delivery.files.length,source_files:delivery.source_files,tests:{passed:17,skipped_optional_external_tools:4},gates:['build:cached','check:fast','docs:check','verify:package'],owned_lineages:sessions,target_executed:false,scope:'CBOR/MessagePack declared-text controls and collision-free CLI decoder selection; Arc instance, closure and durability unknowns unchanged'};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:receipt.status,calls,exact_pairs:4,runtime_files:runtimeFiles,tests_passed:17}));
