// Analyst derivations over public Evidence. No new automatic REA+ origin proof or target execution.
import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),hash=b=>createHash('sha256').update(b).digest('hex');
const reuse=await json(path.join(out,'runtime-reuse.json')),runtime=reuse.runtime_root;
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const arc=await fs.readFile(path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'));
const sha=hash(arc);assert.equal(sha,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(arc,'arm64'),sources=[],checks=[];
async function source(relative){const b=await fs.readFile(path.join(root,relative)),e=JSON.parse(b);parseEvidence(e);assert.equal(e.subject.digest.sha256,sha);sources.push({path:relative,sha256:hash(b),evidence_id:e.evidence_id});return e;}
const init=await source('field-tests/arc-keypath-origin-2026-11-23/mcp-arc-qualified/instructions-0x1006fa228.evidence.json');
const candidate=await source('field-tests/arc-generic-declarations-2026-11-23/mcp-constructor/candidate-instructions.evidence.json');
const caller=await source('field-tests/arc-generic-declarations-2026-11-23/mcp-constructor/caller-instructions.evidence.json');
const consumer=await source('field-tests/arc-generic-declarations-2026-11-23/mcp-typed-consumer/consumer-instructions.evidence.json');
const projection=await source('field-tests/arc-invocation-origin-2026-11-23/mcp/instructions-0x1006fa5bc.evidence.json');
const callback=await source('field-tests/arc-invocation-origin-2026-11-23/mcp/instructions-0x1006faab0.evidence.json');
const field=await source('field-tests/arc-member-templates-2026-11-23/mcp-final/arc-root-layout.evidence.json');
const word=a=>arc.readUInt32LE(layout.offset(BigInt(a),4));
const instructionMap=e=>new Map(e.normalized_result.instructions.map(s=>{const [address,...rest]=s.split(':');return [address,rest.join(':').trim()];}));
const imap=instructionMap(init),cmap=instructionMap(candidate),smap=instructionMap(consumer);
const encoded=a=>arc.subarray(layout.offset(BigInt(a),4),layout.offset(BigInt(a),4)+4).toString('hex');
function exact(e,address,text,expected){assert.equal(instructionMap(e).get(address),text);assert.equal(word(address),expected>>>0);checks.push({address,bytes:encoded(address),public_instruction:text});}
const mov=(rd,rn)=>(0xaa0003e0+(rn<<16)+rd)>>>0;
exact(init,'0x1006fa264','mov x28, x0',mov(28,0));
exact(init,'0x1006fa268','mov x19, x8',mov(19,8));
exact(projection,'0x1006fa5d4','mov x23, x0',mov(23,0));
exact(projection,'0x1006fa5d8','mov x22, x8',mov(22,8));
exact(projection,'0x1006fa60c','ldr x1, [x23, #0x10]',0xf9400000+(2<<10)+(23<<5)+1);
exact(projection,'0x1006fa610','add x0, sp, #0x10',0x91000000+(16<<10)+(31<<5));
exact(projection,'0x1006fa614','mov x8, x22',mov(8,22));
exact(callback,'0x1006faab8','ldp x1, x0, [x20, #0x10]',0xa9400000+(2<<15)+(20<<5)+1);
exact(consumer,'0x100876ed0','ldrsw x8, [x27, #0x34]',0xb9800000+(13<<10)+(27<<5)+8);
function branch(e,address,target,call){assert.equal(instructionMap(e).get(address),(call?'bl ':'b ')+target);const w=word(address);assert.equal(w>>>26,call?0x25:0x05);let imm=w&0x3ffffff;if(imm>=0x2000000)imm-=0x4000000;assert.equal(BigInt(address)+4n*BigInt(imm),BigInt(target));checks.push({address,bytes:encoded(address),target,call});}
branch(callback,'0x1006faabc','0x1006fa5bc',true);
branch(projection,'0x1006fa618','0x10364021c',true);
branch(candidate,'0x1012a569c','0x1036402b8',true);
branch(candidate,'0x1012a56c0','0x1006fa228',true);
branch(candidate,'0x1012a56cc','0x1036402b8',true);
branch(candidate,'0x1012a56f0','0x1006fa228',true);
branch(candidate,'0x1012a5700','0x10363f6a0',true);
// Interpret only the closed, call-free store/copy window. Unknown bytes stay
// symbolic. This never asserts padding or full-value initialization.
const window=[];for(let a=0x1006fa290n;a<=0x1006fa2d4n;a+=4n){const address='0x'+a.toString(16);assert.ok(imap.has(address));window.push({address,word:word(address),instruction:imap.get(address)});}
function outputKeyPath(program){
 const mem=new Map(),vectors=new Map(),regs=new Map();
 for(let n=0;n<31;n++)regs.set(n,Array.from({length:8},(_,i)=>`x${n}[${i}]`));
 const key=Array.from({length:8},(_,i)=>`incoming-keypath[${i}]`);regs.set(28,key);
 const base=n=>{assert.ok(n===31||n===19,'unsupported address base');return n===31?0x10000000:0x20000000;};
 const read=(a,n)=>Array.from({length:n},(_,i)=>mem.get(a+i)??`unknown[${a+i}]`);
 const write=(a,b)=>b.forEach((value,i)=>mem.set(a+i,value));const mask=(w,m)=>(w&m)>>>0;
 for(const r of program){const w=r.word,rt=w&31,rn=(w>>>5)&31,rt2=(w>>>10)&31;let im=(w>>>15)&127;if(im>=64)im-=128;
  if(mask(w,0xffc00000)===0xa9000000){write(base(rn)+im*8,[...regs.get(rt),...regs.get(rt2)]);}
  else if(mask(w,0xffc00000)===0xad400000){const a=base(rn)+im*16;vectors.set(rt,read(a,16));vectors.set(rt2,read(a+16,16));}
  else if(mask(w,0xffc00000)===0xad000000){assert.ok(vectors.has(rt)&&vectors.has(rt2));write(base(rn)+im*16,[...vectors.get(rt),...vectors.get(rt2)]);}
  else if(mask(w,0xffc00000)===0xf9000000){write(base(rn)+((w>>>10)&4095)*8,regs.get(rt));}
  else if(mask(w,0xffc00000)===0x39000000){write(base(rn)+((w>>>10)&4095),regs.get(rt).slice(0,1));}
  else if(mask(w,0xffc00000)===0x3dc00000){vectors.set(rt,read(base(rn)+((w>>>10)&4095)*16,16));}
  else if(mask(w,0xffc00000)===0x3d800000){assert.ok(vectors.has(rt));write(base(rn)+((w>>>10)&4095)*16,vectors.get(rt));}
  else throw Error('Unsupported instruction in store window '+r.address);
 }
 const actual=read(0x20000010,8);assert.deepEqual(actual,key);return actual;
}
const resultBytes=outputKeyPath(window),controls=[];
for(const [label,patch] of [
 ['wrong-keypath-register',p=>{p[0].word=(p[0].word&~31)|27;}],
 ['mixed-output-vector-pair',p=>{const r=p.at(-1);r.word=(r.word&~0x7c1f)|(1<<10);} ],
 ['missing-final-store',p=>p.pop()],
 ['unknown-instruction',p=>{p[3].word=0xd503201f;}],
]){const p=structuredClone(window);patch(p);assert.throws(()=>outputKeyPath(p));controls.push({label,result:'rejected',scope:'Sidecar derivation control, not a REA+ recovery regression'});}
for(const r of window)checks.push({address:r.address,bytes:encoded(r.address),public_instruction:r.instruction});
const rootFields=field.normalized_result.result.swift_type_fields;
assert.equal(rootFields.fields[6].name,'_userDefaultsClient');assert.equal(rootFields.static_metadata.field_offsets[6].byte_offset,480);
assert.equal(rootFields.fields[6].bound_generic_type.descriptor.address,'0x103d46d5c');assert.equal(rootFields.fields[6].bound_generic_type.arguments[0].descriptor.address,'0x103d648c4');
assert.equal(cmap.get('0x1012a56a0'),'add x8, x22, #0x1e0');assert.equal(cmap.get('0x1012a56d0'),'add x8, x22, #0x230');
assert.equal(cmap.get('0x1012a56f4'),'mov x1, sp');assert.equal(cmap.get('0x1012a56fc'),'mov w2, #0x280');
const composition=await source(path.relative(root,path.join(out,'mcp-composition/composition-fields.evidence.json')));
const descriptor=await source(path.relative(root,path.join(out,'mcp-composition/composition-descriptor.evidence.json')));
const fields=composition.normalized_result.result.swift_type_fields,raw=Buffer.from(descriptor.normalized_result.bytes_hex,'hex');
assert.equal(fields.name,'_IfLetReducer');assert.equal(fields.is_generic,true);assert.equal(fields.declared_field_count,7);assert.equal(fields.fields[1].name,'child');assert.equal(fields.fields[1].mangling_hex,'715f00');
assert.equal(raw.length,28);assert.equal(raw.readUInt32LE(20),7);assert.equal(raw.readUInt32LE(24),6);assert.equal(6*8+1*4,0x34);
assert.equal(smap.get('0x100876e50'),'bl 0x100876f50');assert.equal(smap.get('0x100876e54'),'mov x27, x0');assert.equal(smap.get('0x100876ee0'),'mov x1, x26');assert.equal(smap.get('0x100876ee4'),'mov x2, x28');assert.equal(smap.get('0x100876ee8'),'blr x9');
const result={status:'passed',interpretation:'Conditional analyst derivations over public REA+ observations with original-byte checks; not automatic origin recovery',input_sha256:sha,sources,checked_instructions:checks,store_window:{start:window[0].address,end:window.at(-1).address,instructions:window.length,call_free:true,relation:'On normal return, incoming X0 keypath pointer reaches indirect-result buffer +16 through X28, stack and vector copies',result_byte_origins:resultBytes,not_claimed:'Padding/full-value initialization, keypath object authenticity or later alias/field stability'},sidecar_controls:controls,constructed_root:{field_ordinal:6,field_name:'_userDefaultsClient',wrapper_offset:480,keypath_word_offset_within_wrapper:16,derived_root_keypath_word_offset:496,selected_pattern:'0x103788708',selected_wrapper_call:'0x1012a56c0',final_copy_call:'0x1012a5700',final_copy_bytes:640,premise:'Normal imported getKeyPath and memcpy contracts, valid private/disjoint buffers, preserved callee-saved registers, successful normal returns and no intervening writes through escaped aliases'},projection:{call:'0x1006fa618',runtime_entry:'0x10364021c',input_root:'SP+16 at projection wrapper',keypath:'incoming wrapper word +16',result_buffer:'incoming X8 preserved in X22',abi:'Owned compiler IR/native controls corroborate indirect X8 result, root X0 and keypath X1; no C return model applied',value_type:'Conditional UserDefaultsClient under exact typed keypath, valid-wrapper and import-binding premises'},composition:{descriptor:'0x103d4d5d0',name:fields.name,field_offset_vector_word_offset:6,child_ordinal:1,metadata_vector_entry_byte_offset:52,child_offset_value:'Runtime metadata value; not instantiated or assigned a numeric instance offset',source:'constructed Root at caller SP+0x1680',destination:'consumer output + dynamic child-field offset',typed_move_call:'0x100876ee8',type_anchor:'exact Root metadata and initializeWithTake witness retained at item70'},not_established:['Identity of every later captured Root across composed copies/aliases','Actual TaskLocal storage/cache/default selection, runtime keypath object or Client code/context','Automatic member substitution or context-scoped invocation-domain/mapping carrier','A helper-global enum bound or mutated CFG'],target_executed:false};
await fs.writeFile(path.join(out,'flow-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify({status:'passed',source_records:sources.length,checked_instructions:checks.length,closed_store_instructions:window.length,sidecar_controls:controls.length,composition_child_field:1}));
