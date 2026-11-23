import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const manifest=JSON.parse(await fs.readFile(path.join(root,'field-tests/arc-closure-origin-2026-11-22/call-preparation-final-runtime-manifest.json'),'utf8')),runtime=manifest.runtime_root;
const {parseMachoLayout}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(runtime+'/dist/native/AppleMachoFixups.js'));
const input=path.join(root,'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),bytes=await fs.readFile(input),digest=createHash('sha256').update(bytes).digest('hex');
if(digest!=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578')throw Error('input identity');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);

const context=address=>{const at=layout.offset(address,24),parentWord=bytes.readInt32LE(at+4),nameWord=bytes.readInt32LE(at+8);let parent=parentWord===0?null:address+4n+BigInt(parentWord&~1);if(parent!==null&&(parentWord&1)){const pos=layout.offset(parent,8),decoded=fixups.decode(parent,bytes.readBigUInt64LE(pos));parent=decoded.kind==='rebase'?decoded.target:null;}const nameAddress=address+8n+BigInt(nameWord),nameAt=layout.offset(nameAddress,1),end=bytes.indexOf(0,nameAt);if(end<nameAt||end-nameAt>1024)throw Error('name boundary');return {address,file_offset:at,bytes_hex:bytes.subarray(at,at+24).toString('hex'),flags:bytes.readUInt32LE(at),parent,name:bytes.subarray(nameAt,end).toString('utf8'),accessor:address+12n+BigInt(bytes.readInt32LE(at+12))};};
const record={scope:'Supplemental direct original descriptor name through qualified REA+ Mach-O layout reader, not public generic type recovery',input,sha256:digest,dependency:context(0x103d46d5cn)};
await fs.writeFile(path.join(out,'dependency-owner-observation.json'),JSON.stringify(record,(_k,v)=>typeof v==='bigint'?'0x'+v.toString(16):v,2)+'\n');console.log(JSON.stringify(record,(_k,v)=>typeof v==='bigint'?'0x'+v.toString(16):v));
