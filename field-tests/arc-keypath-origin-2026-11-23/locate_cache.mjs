import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(root,'field-tests/arc-invocation-origin-2026-11-23/runtime-final-manifest.json'),'utf8')),runtime=manifest.runtime_root;
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoFixups.js'));
const input=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(input),sha=createHash('sha256').update(bytes).digest('hex');
if(sha!=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578')throw Error('identity');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress),stubs=[];
for(const section of layout.sections.filter(s=>s.name==='__stubs'))for(let i=0;i+12<=section.size;i+=12){
 const address=section.address+BigInt(i),at=layout.offset(address,12),a=bytes.readUInt32LE(at),b=bytes.readUInt32LE(at+4),c=bytes.readUInt32LE(at+8);
 if((a&0x9f00001f)!==(0x90000010|0)||(b&0xffc003ff)!==(0xf9400210|0)||c!==0xd61f0200)continue;
 let imm=((a>>>5)&0x7ffff)*4+((a>>>29)&3);if(imm>=0x100000)imm-=0x200000;
 const slot=(address&~4095n)+BigInt(imm)*4096n+BigInt((b>>>10)&4095)*8n;
 try{const decoded=fixups.decode(slot,bytes.readBigUInt64LE(layout.offset(slot,8)));if(decoded.kind==='bind'&&decoded.symbol.includes('swift_getKeyPath'))stubs.push({address:'0x'+address.toString(16),slot:'0x'+slot.toString(16),decoded});}catch{}
}
const commands=bytes.readUInt32LE(16);let at=32,starts;
for(let i=0;i<commands;i++){const kind=bytes.readUInt32LE(at),size=bytes.readUInt32LE(at+4);if(size<8||at+size>bytes.length)throw Error('command bounds');if(kind===0x26)starts=[bytes.readUInt32LE(at+8),bytes.readUInt32LE(at+12)];at+=size;}
if(!starts)throw Error('starts');let cursor=starts[0],end=starts[0]+starts[1],current=layout.baseAddress;const functions=[];
while(cursor<end){let value=0n,shift=0n;for(;;){if(cursor>=end||shift>=64n)throw Error('ULEB bounds');const b=bytes[cursor++];value|=BigInt(b&127)<<shift;if(b<128)break;shift+=7n;}if(value===0n)break;current+=value;functions.push(current);}

const selected=['0x1003b5454','0x100ccc400','0x1006fb0c0','0x1006fb4c0','0x1006fbea4','0x100d8c154','0x100d8c1dc','0x1006d4234','0x1006fe650'];
const result={input,sha256:sha,scope:'Supplemental original-byte LC_FUNCTION_STARTS membership and fixup lookup; public evidence follows separately.',function_entries:selected.map(a=>({address:a,is_lc_function_start:functions.includes(BigInt(a))})),slots:['0x1045ee8b0','0x1045ee8b8','0x1045ee8c0','0x1045ee8c8','0x1045ee8d0','0x1045ee8d8'].map(a=>({address:a,decoded:fixups.decode(BigInt(a),bytes.readBigUInt64LE(layout.offset(BigInt(a),8)))}))};
await fs.writeFile(path.join(out,'cache-locator.json'),JSON.stringify(result,(_k,v)=>typeof v==='bigint'?'0x'+v.toString(16):v,2)+'\n');
if(!result.function_entries.every(f=>f.is_lc_function_start))throw Error('Not declared entries');
const source=await fs.readFile(path.join(root,'field-tests/arc-invocation-origin-2026-11-23/seeds-origin.tsv'),'utf8');
await fs.writeFile(path.join(out,'seeds-cache.tsv'),[...new Set(source.trim().split('\n').concat(selected.map(a=>a+'\tfunction')))].sort().join('\n')+'\n');
console.log(JSON.stringify(result,(_k,v)=>typeof v==='bigint'?'0x'+v.toString(16):v));
