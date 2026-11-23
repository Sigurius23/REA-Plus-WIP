// Analyst derivation over retained public instructions, with supplemental
// original-byte verification through the already qualified REA+ Mach-O reader.
// This is not a new automatic REA+ invocation/value-flow observation.
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),hash=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-final-manifest.json'));
const {parseMachoLayout}=await import(pathToFileURL(manifest.runtime_root+'/dist/native/AppleMachoSelection.js'));
const {parseEvidence}=await import(pathToFileURL(manifest.runtime_root+'/dist/domain/evidence.js'));
const input=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(input),sha=hash(bytes);assert.equal(sha,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),sources=[];
for(const relative of ['field-tests/arc-dispatch-provenance-2026-11-21/mcp/function-0x100d92ebc-read_function_instructions.evidence.json','field-tests/arc-dispatch-provenance-2026-11-21/mcp/function-0x100d910dc-read_function_instructions.evidence.json','field-tests/arc-closure-origin-2026-11-22/mcp-arc-final/call-0x100d910f0.evidence.json']){
 const b=await fs.readFile(path.join(root,relative)),e=JSON.parse(b);parseEvidence(e);assert.equal(e.subject.digest.sha256,sha);sources.push({path:relative,sha256:hash(b),evidence_id:e.evidence_id,evidence:e});
}
const adapter=sources[0].evidence.normalized_result.instructions,reader=sources[1].evidence.normalized_result.instructions;
assert.deepEqual(adapter,['0x100d92ebc: ldr x1, [x20, #0x10]','0x100d92ec0: b 0x100d910dc']);
assert.deepEqual(reader.slice(0,6),['0x100d910dc: stp x22, x21, [sp, #-0x30]!','0x100d910e0: stp x20, x19, [sp, #0x10]','0x100d910e4: stp x29, x30, [sp, #0x20]','0x100d910e8: add x29, sp, #0x20','0x100d910ec: mov x19, x1','0x100d910f0: bl 0x1005aa5e4']);
const word=a=>bytes.readUInt32LE(layout.offset(BigInt(a),4));
const checked=[];
for(const [address,expected,writes] of [
 ['0x100d92ebc',0xf9400000+(2<<10)+(20<<5)+1,['x1']],
 ['0x100d910dc',0xa9800000+(((-6)&127)<<15)+(21<<10)+(31<<5)+22,['sp']],
 ['0x100d910e0',0xa9000000+(2<<15)+(19<<10)+(31<<5)+20,[]],
 ['0x100d910e4',0xa9000000+(4<<15)+(30<<10)+(31<<5)+29,[]],
 ['0x100d910e8',0x91000000+(32<<10)+(31<<5)+29,['x29']],
 ['0x100d910ec',0xaa0003e0+(1<<16)+19,['x19']],
]){assert.equal(word(address),expected>>>0);assert.ok(!writes.includes('x0'));checked.push({address,bytes:bytes.subarray(layout.offset(BigInt(address),4),layout.offset(BigInt(address),4)+4).toString('hex'),register_writes:writes});}
for(const [address,target,call] of [['0x100d92ec0','0x100d910dc',false],['0x100d910f0','0x1005aa5e4',true]]){
 const w=word(address);assert.equal(w>>>26,call?0x25:0x05);let imm=w&0x3ffffff;if(imm>=0x2000000)imm-=0x4000000;assert.equal(BigInt(address)+BigInt(imm)*4n,BigInt(target));checked.push({address,branch_target:target,register_writes:call?['x30']:[]});
}
const call=sources[2].evidence.normalized_result;assert.equal(call.bytes,bytes.subarray(layout.offset(0x100d910f0n,4),layout.offset(0x100d910f0n,4)+4).toString('hex'));assert.deepEqual(call.flow.direct_destinations,['0x1005aa5e4']);
const result={status:'passed',interpretation:'conditional analyst derivation, not automatic invocation provenance',input_sha256:sha,sources:sources.map(({evidence,...r})=>r),checked_instructions:checked,relation:{from:'X0 at exact default adapter entry 0x100d92ebc',to:'X0 at helper entry 0x1005aa5e4 through 0x100d910f0',unchanged:true,context_branch_changes:'Adapter changes X1 from context; reader saves X1 in X19. Neither changes X0 before the helper call.',conditional_selected_value:'If the actual selected call uses this default code path, its separately observed X0=49 reaches this helper as 49.'},premises:['Exact entry at the identified default adapter and normal execution through its fixed reader prefix','Stable image bytes/common load slide, normal AArch64 instruction semantics and no asynchronous register interference','Valid readable context and valid private stack stores; normal completion of the prefix'],not_established:['Actual active default target/code-context selection','Client field/alias stability or actual captured-instance identity','Native enum argument lowering, a full invocation-domain carrier or helper-global type/CFG bounds'],target_executed:false};
await fs.writeFile(path.join(out,'forwarding-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:'passed',instructions:checked.length,public_sources:sources.length,invocation_target:'unresolved'}));
