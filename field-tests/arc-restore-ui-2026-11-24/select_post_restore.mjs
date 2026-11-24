// Original-byte selection hints only; public REA+ replies remain the findings.
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-final-manifest.json'),'utf8'));
const {parseMachoLayout}=await import(pathToFileURL(manifest.runtime_root+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(manifest.runtime_root+'/dist/native/AppleMachoFixups.js'));
const b=await fs.readFile(root+'/rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),layout=parseMachoLayout(b,'arm64'),fixups=parsePointerFixups(b,layout.fixups,layout.segments,layout.baseAddress),steps=[],hints=[];
const hex=n=>'0x'+n.toString(16);
function step(name,label,args){steps.push({name,label,arguments:args,expect_success:true});}
function insn(a,label){step('inspect_native_instruction',label+'-'+hex(a),{address:hex(a),decode_unlisted:true});}
function read(a,n,label){step('read_bytes',label,{address:hex(a),length:n});}
const stubs=[0x103648900n,0x103644f40n,0x103644ec0n,0x10366a440n,0x103660e60n,0x1036696c0n,0x10366be80n,0x103666360n,0x103662080n,0x103642240n,0x1036653a0n,0x10366f1a0n];
for(const a of stubs){
 const off=layout.offset(a,8),w=b.readUInt32LE(off),v=b.readUInt32LE(off+4);assert.equal(w&0x9f000000,0x90000000|0);assert.equal(v>>>22,0x3e5);
 let imm=BigInt(((w>>>5)&0x7ffff)*4+((w>>>29)&3));if(imm&(1n<<20n))imm-=1n<<21n;
 const slot=(a&~4095n)+imm*4096n+BigInt((v>>>10)&4095)*8n,raw=b.readBigUInt64LE(layout.offset(slot,8)),d=fixups.decode(slot,raw);assert.equal(d.kind,'rebase');
 const ptr=d.target,strOff=layout.offset(ptr,1),end=b.indexOf(0,strOff);assert.ok(end>strOff&&end-strOff<512);
 hints.push({stub:hex(a),slot:hex(slot),raw:hex(raw),target:hex(ptr),selector_hint:b.toString('utf8',strOff,end)});
 insn(a,'objc-stub');insn(a+4n,'objc-stub');read(slot,8,'objc-slot-'+hex(a));read(ptr,end-strOff+1,'objc-selector-'+hex(a));
}
for(const [a,n,label] of [[0x1001edef0n,140,'task-thunk'],[0x1001ed63cn,12,'ui-action-getter'],[0x10227b218n,0,'relaunch-command']]){
 if(n)for(let i=0;i<n;i+=4)insn(a+BigInt(i),label);
}
for(const [a,n,label] of [[0x103a6a8c0n,40,'relaunch-missing-url-text'],[0x103a6a8f0n,32,'relaunch-error-text'],[0x103a6a910n,56,'relaunch-source-file'],[0x1039d16a0n,36,'relaunch-preference-key'],[0x104551088n,8,'main-bundle-class'],[0x104551010n,8,'preferences-class'],[0x104550fa8n,8,'application-class']])read(a,n,label);
step('export_evidence_bundle','arc-selected3-export',{path:path.join(out,'mcp-arc-selected','phase3.bundle.json')});
await fs.writeFile(path.join(out,'post-restore-selection.json'),JSON.stringify({authority:'Supplemental original-byte selection hints; not public normalized findings',hints},null,2)+'\n');
await fs.writeFile(path.join(out,'arc-selected3.json'),JSON.stringify({steps},null,2)+'\n');
console.log(JSON.stringify({steps:steps.length,hints}));
