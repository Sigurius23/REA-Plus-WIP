import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(out,'runtime-final-manifest.json'),'utf8'));
const {parseMachoLayout}=await import(pathToFileURL(manifest.runtime_root+'/dist/native/AppleMachoSelection.js'));
const build=JSON.parse(await fs.readFile(path.join(out,'fixture/build.json'),'utf8')),original=await fs.readFile(build.binary.path),hash=b=>createHash('sha256').update(b).digest('hex');assert.equal(hash(original),build.binary.sha256);
const layout=parseMachoLayout(original,'arm64'),dependency=BigInt(build.descriptors.find(d=>d.symbol.endsWith('10DependencyVMn')&&!d.symbol.includes('Foreign')).address),pair=BigInt(build.descriptors.find(d=>d.symbol.endsWith('4PairVMn')).address);
const cache=path.dirname(build.binary.path),records=[];
for(const [label,descriptor,count,extra] of [['missing-argument',dependency,2,true],['extra-argument',pair,1,false],['overlarge-signature',dependency,65535,false]]){
 const bytes=Buffer.from(original),base=layout.offset(descriptor,48);bytes.writeUInt16LE(count,base+36);bytes.writeUInt16LE(count,base+40);if(extra)bytes[base+45]=128;
 const changes=[];for(let i=0;i<bytes.length;i++)if(bytes[i]!==original[i])changes.push({file_offset:i,before:original[i],after:bytes[i]});assert.ok(changes.length>0&&changes.length<=4);
 const file=path.join(cache,label+'.dylib');await fs.writeFile(file,bytes,{flag:'wx'});records.push({label,path:file,sha256:hash(bytes),bytes:bytes.length,source_binary_sha256:build.binary.sha256,descriptor:'0x'+descriptor.toString(16),changed_bytes:changes,kind:'deliberately malformed metadata derivative, not compiler output'});
}
await fs.writeFile(path.join(out,'fixture/malformed-controls.json'),JSON.stringify({records,target_executed:false},null,2)+'\n');console.log(JSON.stringify({controls:records.length,target_executed:false}));
