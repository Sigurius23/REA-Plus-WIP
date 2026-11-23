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
const text=layout.sections.find(s=>s.name==='__text'),targets=new Set(stubs.map(s=>s.address)),groups=new Map();let ownerIndex=0;
for(let i=0;i+4<=text.size;i+=4){const address=text.address+BigInt(i);while(ownerIndex+1<functions.length&&functions[ownerIndex+1]<=address)ownerIndex++;const word=bytes.readUInt32LE(layout.offset(address,4));if((word&0xfc000000)!==(0x94000000|0))continue;let imm=word&0x3ffffff;if(imm>=0x2000000)imm-=0x4000000;const target='0x'+(address+BigInt(imm)*4n).toString(16);if(!targets.has(target))continue;const key='0x'+functions[ownerIndex].toString(16);if(!groups.has(key))groups.set(key,[]);groups.get(key).push('0x'+address.toString(16));}
const candidates=[...groups].map(([function_start,calls])=>({function_start,calls})).sort((a,b)=>b.calls.length-a.calls.length);
const record={scope:'Supplemental original-byte direct-call locator through qualified REA+ Mach-O readers; LC_FUNCTION_STARTS predecessors are candidates, not complete CFG or type ownership. Indirect calls and noncanonical stubs are not covered.',runtime_manifest:'../arc-invocation-origin-2026-11-23/runtime-final-manifest.json',input,sha256:sha,stubs,candidates};
await fs.writeFile(path.join(out,'candidates.json'),JSON.stringify(record,(_k,v)=>typeof v==='bigint'?'0x'+v.toString(16):v,2)+'\n');
console.log(JSON.stringify({stubs,groups:candidates.length,near_reducer:candidates.filter(c=>BigInt(c.function_start)>=0x101290000n&&BigInt(c.function_start)<0x1012b0000n),largest:candidates.slice(0,7)},(_k,v)=>typeof v==='bigint'?'0x'+v.toString(16):v));
