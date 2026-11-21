// Supplemental byte-carrier retrieval with the existing REA reader; the later
// public inspect_plist call owns interpretation. No target code is executed.
import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..'),runtime=path.join(root,'rea-local/.cache/arc-runtime-unlisted-2026-11-21');
const {NativeDmgArtifactReader}=await import(pathToFileURL(runtime+'/dist/artifacts/NativeDmgArtifactReader.js'));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(runtime+'/scripts/lib/verifier-run.mjs'));
const sha=b=>createHash('sha256').update(b).digest('hex'),dmg=path.join(root,'Arc-1.172.1-90370.dmg');
const expected='d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778',before=sha(await fs.readFile(dmg));assert.equal(before,expected);
const run=createVerifierRun(),reader=new NativeDmgArtifactReader(dmg,{PATH:process.env.PATH??'/usr/bin:/bin',REA_PROCESS_RUN_ID:run.run_id});
const logical='Arc-1.172.1-90370.dmg/Arc/Arc.app/Contents/Info.plist';let bytes,selected,receipt;
try{
 for await(const entry of reader.entries())if(entry.path===logical){assert.equal(entry.kind,'file');assert.equal(entry.declaredSize,5697);selected=entry;const chunks=[];let n=0;for await(const chunk of await reader.open(entry)){n+=chunk.length;assert.ok(n<=5697);chunks.push(chunk);}bytes=Buffer.concat(chunks);break;}
 assert.ok(bytes);assert.equal(bytes.length,5697);assert.equal(sha(bytes),'2b2acc2969fd9cfe09ca8e3219b4ec2614cd2181756a5d29e1006e435da32358');
 await fs.writeFile(path.join(out,'Info.plist'),bytes,{flag:'wx'});
}finally{
 await reader.close();const lineage=await completeVerifierRun(run);assert.equal(lineage.process_lineage.status,'verified');assert.deepEqual(lineage.process_lineage.descendants,[]);
 receipt={status:bytes?'passed':'failed',kind:'supplemental-byte-carrier-retrieval-not-public-analysis',source_dmg_sha256:before,source_logical_path:logical,selected_entry:selected??null,plist_bytes:bytes?.length,plist_sha256:bytes?sha(bytes):null,plist_bytes_hex:bytes?.toString('hex'),reader_provenance:reader.provenance(),reader_closed:true,verifier_run:lineage,target_executed:false};
 await fs.writeFile(path.join(out,'plist-carrier.json'),JSON.stringify(receipt,null,2)+'\n');
}
assert.equal(sha(await fs.readFile(dmg)),before);console.log(JSON.stringify({status:receipt.status,bytes:bytes.length,sha256:sha(bytes),reader_closed:true,verified_empty_lineage:true}));
