import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
const directory=path.dirname(fileURLToPath(import.meta.url));
const root=path.resolve(directory,'../..');
const {parseEvidence}=await import(pathToFileURL(path.join(root,'rea-local/dist/domain/evidence.js')));
const json=async relative=>JSON.parse(await fs.readFile(path.join(directory,relative),'utf8'));
const evidence=async relative=>parseEvidence(await json(relative));
const checks=[];
const check=(name,action)=>{action();checks.push(name);};
const sha=bytes=>createHash('sha256').update(bytes).digest('hex');
const frame=await evidence('ui-delegate-conformance-6632.evidence.json');
const editor=await evidence('ui-delegate-conformance-10138.evidence.json');
const metadata=e=>e.normalized_result.result;
check('selected_concrete_delegate_types',()=>{
 assert.equal(metadata(frame).swift_conformances[0].type_name,'WebContentFrame');
 assert.equal(metadata(editor).swift_conformances[0].type_name,'BoostsEditorWindowContent');
 assert.equal(metadata(frame).swift_conformances[0].protocol_name,'WebContentUIDelegate');
 assert.equal(metadata(editor).swift_conformances[0].protocol_name,'WebContentUIDelegate');
 assert.equal(metadata(frame).swift_dispatch_slots.find(s=>s.slot_index===32).implementation_address,'0x100006b90');
 assert.equal(metadata(editor).swift_dispatch_slots.find(s=>s.slot_index===32).implementation_address,'0x1012d2ddc');
});
const index=await evidence('implementation/complete-conformance-index.evidence.json');
const indexBytes=Buffer.from(index.normalized_result.bytes_hex,'hex');
const selectors=await json('conformance-selector-preparation.json');
check('complete_index_and_protocol_aliases',()=>{
 assert.equal(indexBytes.length,88264);assert.equal(indexBytes.length/4,22066);
 for(const row of selectors.candidates){
  const field=BigInt(index.normalized_result.address)+BigInt(row.index*4);
  assert.equal(field+BigInt(indexBytes.readInt32LE(row.index*4)),BigInt(row.conformance_descriptor));
 }
});
for(const ordinal of [6632,10138]){
 const alias=await evidence(`implementation/ui-delegate-protocol-alias-${ordinal}.evidence.json`);
 check(`protocol_alias_${ordinal}`,()=>assert.equal(Buffer.from(alias.normalized_result.bytes_hex,'hex').readBigUInt64LE(),0x103d408a4n));
}
const stub=await evidence('implementation/frame-command-stub-instructions.evidence.json');
check('frame_command_has_only_return',()=>assert.deepEqual(stub.normalized_result.instructions,['0x100006b90: ret']));
const assignment=await evidence('resolved/boost-editor-delegate-assignment.evidence.json');
check('editor_installs_witness_and_caches_content',()=>{
 const a=assignment.normalized_result.assembly;
 assert(a.some(line=>line.startsWith('0x1012d3d38: adrp x1,')));
 assert(a.some(line=>line.startsWith('0x1012d3d3c: add x1, x1, #0x718')));
 assert(assignment.normalized_result.pseudocode.includes('_webContent'));
});
const setter=await evidence('seeded/chromium-ui-delegate-setter.evidence.json');
check('weak_object_and_witness_storage',()=>{
 assert(setter.normalized_result.pseudocode.includes('_swift_unknownObjectWeakAssign'));
 assert(setter.normalized_result.pseudocode.includes('*(undefined8 *)(lVar1 + 8) = param_2'));
});
const cstr=e=>Buffer.from(e.normalized_result.bytes_hex,'hex').toString('utf8').split('\0')[0];
for(const [relative,expected] of [
 ['seeded/response-success-selector-name.evidence.json','sendErrorResponse:jsonString:'],
 ['seeded/response-other-selector-name-corrected.evidence.json','sendResponse:jsonString:'],
 ['backend/chromium-command-context-getter-selector-name.evidence.json','boostIDE'],
 ['backend/chromium-execution-frame-getter-selector-name.evidence.json','devTools'],
 ['backend/chromium-execution-context-getter-selector-name.evidence.json','emitFreezingVote:'],
 ['submission/callback-javascript-submission-selector-name.evidence.json','executeJavascript:reason:completion:'],
]){const e=await evidence(relative);check(`selector_${expected}`,()=>assert.equal(cstr(e),expected));}
const submit=await evidence('backend/javascript-validated-submit.evidence.json');
check('selector_uses_callback_protocol_slot_2',()=>assert(submit.normalized_result.pseudocode.includes('param_10 + 0x10')));
const done=await evidence('completion/javascript-main-actor-completion.evidence.json');
check('completion_zero_status_forwards_zero_pair',()=>{
 const c=done.normalized_result.pseudocode;
 assert(c.includes("== '\\0'"));assert(c.includes('uVar1 = 0;'));assert(c.includes('uVar2 = 0;'));
 assert(c.includes('unaff_x20 + 0x10'));
});
const decode=await evidence('return-2026-11-08/selector-return-0x1012e64f0.evidence.json');
check('fixed_version_string_check_json_decode_and_error',()=>{
 const c=decode.normalized_result.pseudocode;
 assert(c.includes('_swift_dynamicCast'));assert(c.includes('JSONDecoderC6decode'));
 assert(c.includes('_swift_allocError'));assert(c.includes('_swift_willThrow'));
 assert.equal(decode.subject.digest.sha256,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
});
const owned=await evidence('owned/metadata.evidence.json');
const ownedMcp=await evidence('owned/mcp/generic-witness-metadata.evidence.json');
const compiler=await json('owned/compiler-receipt.json');
const inputs=await json('owned/inputs.json');
check('owned_generic_witness_boundary_reproduced',()=>{
 const r=metadata(owned);
 assert.equal(r.swift_conformances[0].type_name,'OwnedAdaptor');
 assert.equal(r.swift_conformances[0].protocol_name,'OwnedSurface');
 assert.equal(r.swift_conformances[0].decode.status,'partial');
 assert.equal(r.swift_dispatch_slots.length,0);
 assert.deepEqual(owned.normalized_result,ownedMcp.normalized_result);
 assert.equal(compiler.target_executed,false);
});
assert.equal(sha(await fs.readFile(inputs.source)),compiler.source_sha256);
assert.equal(sha(await fs.readFile(inputs.output_binary)),compiler.binary_sha256);
assert.equal(owned.subject.digest.sha256,compiler.binary_sha256);
checks.push('owned_source_and_binary_hashes_rechecked');
const comparisons=await json('cli-mcp-comparison.json');
check('normalized_cli_mcp_equality_preserves_profile_difference',()=>{
 assert.equal(comparisons.length,4);
 for(const row of comparisons){assert.equal(row.normalized_result_equal,true);assert.equal(row.exact_evidence_equal,false);assert.deepEqual(row.differing_fields,['analysis_profile','evidence_id']);}
});
const failures=await json('evaluator/selector-evaluator-main-actor.reply.json');
const failure=JSON.parse(failures.content[0].text).error;
check('explicit_disk_failure_has_generic_public_classification',()=>{
 assert.equal(failure.code,'execution_failure');assert(JSON.stringify(failure).includes('No space left on device'));
});
await fs.writeFile(path.join(directory,'findings-verification.json'),JSON.stringify({status:'passed',checked_at:new Date().toISOString(),authority:'Saved public Evidence authentication and specific finding checks; not target execution or a new implementation test suite',checks},null,2)+'\n');
process.stdout.write(JSON.stringify({status:'passed',checks:checks.length})+'\n');
