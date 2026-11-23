import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const manifestPath=path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'),manifest=await json(manifestPath),runtime=manifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const row of manifest.files){const b=await fs.readFile(path.join(runtime,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
for(const row of manifest.source_files)assert.equal(sha(await fs.readFile(path.join(root,row.path))),row.sha256);
const derivation=await json(path.join(out,'input-derivation.json'));assert.equal(sha(await fs.readFile(manifestPath)),derivation.runtime_manifest_sha256);
const versions=await json(path.join(out,'engine-versions.json'));assert.equal(versions.unicorn,'2.1.2');assert.equal(versions.capstone,'5.0.6');
const records=new Map(),sourceFiles=new Map();let calls=0;const sessions=[];
for(const directory of ['mcp','mcp-complete','mcp-literals']){
 const p=path.join(out,directory),summary=await json(path.join(p,'summary.json'));assert.equal(summary.status,'completed');assert.equal(summary.errors,0);assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);calls+=summary.calls;sessions.push(summary.verifier_run);
 const invocations=await json(path.join(p,'invocations.json'));const bundle=parseEvidenceBundle(await json(path.join(p,'final.bundle.json')));
 for(const row of invocations){
  if(!row.evidence_id)continue;
  const label=row.reply.replace(/\.reply\.json$/,''),e=await json(path.join(p,label+'.evidence.json'));parseEvidence(e);toolContract(row.name).outputSchema.parse(e);assert.ok(bundle.records.some(x=>x.evidence_id===e.evidence_id));records.set(directory+'/'+label,e);
  if(row.name!=='emulate_function')continue;
  const r=e.normalized_result;assert.equal(e.confidence,'derived');assert.equal(r.artifact.sha256,e.subject.digest.sha256);let bytes=sourceFiles.get(r.artifact.path);if(!bytes){bytes=await fs.readFile(r.artifact.path);sourceFiles.set(r.artifact.path,bytes);assert.equal(sha(bytes),r.artifact.sha256);}
  for(const c of r.coverage.instructions){const at=BigInt(c.address),region=e.parameters.code_regions.find(z=>at>=BigInt(z.address)&&at+4n<=BigInt(z.address)+BigInt(z.size));assert.ok(region);const offset=region.file_offset+Number(at-BigInt(region.address));assert.equal(bytes.subarray(offset,offset+c.bytes_hex.length/2).toString('hex'),c.bytes_hex);}
 }
}
assert.equal(calls,13);assert.equal(records.size,10);
const get=(d,n)=>records.get(d+'/'+n).normalized_result;
for(const [index,value] of [[0,'0xa'],[1,'0x14']]){const r=get('mcp-complete','owned-'+index);assert.equal(r.stop.reason,'function_return');assert.equal(r.registers_after.x0,value);}
const findings=[];
for(const [index,key,count,x0,x1,ret] of [[49,'hasDismissedBoostsInterstitial',30,'0xd00000000000001e','0x80000001039d1190','0x1005ab7dc'],[50,'hasDismissedJSWarningBanner',27,'0xd00000000000001b','0x80000001039d1170','0x1005ab814']]){
 const short=get('mcp','arc-'+index),long=get('mcp-complete','arc-'+index),literal=get('mcp-literals','literal-'+index);
 assert.equal(short.stop.reason,'control_flow_escape');assert.equal(long.stop.reason,'function_return');assert.equal(long.stop.address,ret);assert.equal(long.coverage.instructions_started,22);
 assert.equal(long.registers_after.x0,x0);assert.equal(long.registers_after.x1,x1);assert.deepEqual(short.coverage.instructions,long.coverage.instructions.slice(0,short.coverage.instructions.length));
 assert.equal(BigInt(x1),(BigInt(short.registers_after.x8)-32n)|(1n<<63n));
 const literalAddress=BigInt(short.registers_after.x8);assert.equal(BigInt(literal.range.offset),literalAddress-0x100000000n);assert.equal(literal.range.length,count);assert.equal(Buffer.byteLength(key),count);assert.equal(literal.file.sha256,long.artifact.sha256);assert.equal(literal.strings.length,1);assert.equal(literal.strings[0].value,key);assert.equal(literal.strings[0].offset,0);
 const bytes=sourceFiles.get(long.artifact.path);assert.equal(bytes.subarray(literal.range.offset,literal.range.offset+count).toString('utf8'),key);
 findings.push({index,return_words:{x0,x1},return_boundary:ret,literal_address:'0x'+literalAddress.toString(16),literal_file_offset:literal.range.offset,literal_bytes:count,literal:key,replay_evidence_id:records.get('mcp-complete/arc-'+index).evidence_id,literal_evidence_id:records.get('mcp-literals/literal-'+index).evidence_id,interpretation:'Conditional helper result with explicit captured bytes/state; actual BLR X23 callee remains unproved.'});
}
const cli=await json(path.join(out,'cli-verification.json'));assert.equal(cli.status,'passed');assert.equal(cli.records.length,4);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const result={status:'passed',public_mcp_calls:calls,evidence_records:records.size,exact_cli_mcp_pairs:4,final_replay_returns:4,initial_arc_boundary_stops:2,runtime_files:manifest.files.length,source_hashes:manifest.source_files.length,source_bytes_verified:true,arc_executed_as_host:false,indirect_callee_resolved:false,findings,owned_lineages:[...sessions,cli.verifier_run]};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:result.status,calls,findings:findings.length}));
