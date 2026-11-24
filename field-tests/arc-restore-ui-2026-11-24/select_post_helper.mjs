// Source-byte hints are retained separately from the public replies they select.
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const m=JSON.parse(await fs.readFile(path.join(out,'runtime-final-manifest.json'),'utf8'));
const {parseMachoLayout}=await import(pathToFileURL(m.runtime_root+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(m.runtime_root+'/dist/native/AppleMachoFixups.js'));
const b=await fs.readFile(root+'/rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),l=parseMachoLayout(b,'arm64'),f=parsePointerFixups(b,l.fixups,l.segments,l.baseAddress),bounds=JSON.parse(await fs.readFile(path.join(out,'post-helper-selection.json'),'utf8')).rows[0],a=BigInt(bounds.address),n=bounds.lc_span_bytes,steps=[];
const hex=x=>'0x'+x.toString(16),calls=new Set(),strings=new Map(),selectors=[];
const step=(name,label,args)=>steps.push({name,label,arguments:args,expect_success:true});
for(let i=0;i<n;i+=4)step('inspect_native_instruction','relaunch-command-'+hex(a+BigInt(i)),{address:hex(a+BigInt(i)),decode_unlisted:true});
for(let i=0;i<n;i+=4){
 const pc=a+BigInt(i),off=l.offset(pc,4),w=b.readUInt32LE(off);
 if((w&0xfc000000)===(0x94000000|0)){let imm=BigInt(w&0x3ffffff);if(imm&(1n<<25n))imm-=1n<<26n;calls.add(pc+imm*4n);}
 if((w&0x9f000000)===(0x90000000|0)&&i+4<n){const v=b.readUInt32LE(off+4);if((v&0xffc00000)!==(0x91000000|0)||((v>>>5)&31)!==(w&31))continue;
  let imm=BigInt(((w>>>5)&0x7ffff)*4+((w>>>29)&3));if(imm&(1n<<20n))imm-=1n<<21n;
  const p=(pc&~4095n)+imm*4096n+BigInt((v>>>10)&4095);let o;try{o=l.offset(p,1);}catch{continue;}if(o===null||o===undefined)continue;
  const e=b.indexOf(0,o);if(e>o&&e-o<8192&&b.subarray(o,e).every(c=>c===10||c===9||c>=32&&c<=126))strings.set(hex(p),{bytes:e-o+1,text_hint:b.toString('utf8',o,e)});
 }
}
for(const target of calls){
 step('address_name','command-name-'+hex(target),{address:hex(target)});
 const o=l.offset(target,8),w=b.readUInt32LE(o),v=b.readUInt32LE(o+4);
 if((w&0x9f000000)!==(0x90000000|0)||v>>>22!==0x3e5||(w&31)!==1||(v&31)!==1||((v>>>5)&31)!==1)continue;
 let imm=BigInt(((w>>>5)&0x7ffff)*4+((w>>>29)&3));if(imm&(1n<<20n))imm-=1n<<21n;
 const slot=(target&~4095n)+imm*4096n+BigInt((v>>>10)&4095)*8n,raw=b.readBigUInt64LE(l.offset(slot,8)),d=f.decode(slot,raw);if(d.kind!=='rebase')continue;
 const p=d.target,so=l.offset(p,1),end=b.indexOf(0,so);assert.ok(end>so&&end-so<512);
 selectors.push({stub:hex(target),slot:hex(slot),target:hex(p),selector_hint:b.toString('utf8',so,end)});
 for(const x of [target,target+4n])step('inspect_native_instruction','command-stub-'+hex(x),{address:hex(x),decode_unlisted:true});
 step('read_bytes','command-slot-'+hex(target),{address:hex(slot),length:8});step('read_bytes','command-selector-'+hex(target),{address:hex(p),length:end-so+1});
}
for(const [address,s] of strings)step('read_bytes','command-text-'+address,{address,length:s.bytes});
for(const [label,address] of [['running-application-class','0x105039000'],['user-defaults-class','0x10503d700'],['app-class','0x105030d00']])step('address_name',label,{address});
step('export_evidence_bundle','arc-final-export',{path:path.join(out,'mcp-arc-selected','final.bundle.json')});
for(let i=1;i<=2;i++)step('close_binary','arc-final-close-'+i,{});
await fs.writeFile(path.join(out,'post-helper-details-selection.json'),JSON.stringify({authority:'Supplemental source-byte query hints only',calls:[...calls].map(hex),strings:Object.fromEntries(strings),selectors},null,2)+'\n');
await fs.writeFile(path.join(out,'arc-selected4.json'),JSON.stringify({steps,final:true},null,2)+'\n');
console.log(JSON.stringify({steps:steps.length,strings:Object.fromEntries(strings),selectors}));
