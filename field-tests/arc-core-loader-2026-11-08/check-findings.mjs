import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
const directory=path.dirname(fileURLToPath(import.meta.url));
const root=path.resolve(directory,'../..');
const {parseEvidence}=await import(pathToFileURL(root+'/rea-local/dist/domain/evidence.js'));
const records=[];
async function record(relative){
  const bytes=await fs.readFile(path.join(directory,relative));
  const evidence=parseEvidence(JSON.parse(bytes));
  records.push({path:relative,evidence_id:evidence.evidence_id,sha256:createHash('sha256').update(bytes).digest('hex')});
  return evidence.normalized_result;
}
const text=async relative=>{const value=await record(relative);assert.equal(typeof value,'string');return value;};
const brand=await text('native/brand-placeholder-substitution-pseudocode.evidence.json');
for(const expected of ['00003cc6','"<APP_NAME>"','"Arc"','"Dia"','"arc_internal_extension"','FUN_034b133c'])assert.ok(brand.includes(expected),expected);
const replacement=await text('followup-restored/branding-substring-helper-pseudocode.evidence.json');
assert.ok(replacement.includes('_memmove'));
const resource=await text('followup-restored/manifest-resource-read-pseudocode.evidence.json');
assert.ok(resource.includes('func_0x01d7f800')||resource.includes('FUN_01d7f800'));
const parse=await text('loader-region/manifest-json-parse.evidence.json');
assert.ok(parse.includes('Failed to parse extension manifest.'));
const registration=await text('loader-region/component-registration.evidence.json');
for(const expected of ['func_0x031e5204','func_0x032f233c','0x3ed'])assert.ok(registration.includes(expected),expected);
const activation=await text('loader-final/component-activation.evidence.json');
for(const expected of ['component_loader.cc','func_0x02b25d40','func_0x032f406c'])assert.ok(activation.includes(expected),expected);
const identifier=await text('loader-final/manifest-identifier.evidence.json');
assert.ok(identifier.includes('func_0x031e52b0')&&identifier.includes('func_0x02d8c700'));
const key=await record('loader-final/manifest-key-name.evidence.json');
assert.equal(Buffer.from(key.bytes_hex,'hex').toString(),'key\0');
const entry=await text('loader-final/datapack-entry-reader.evidence.json');
for(const expected of ['data_pack.cc','(ushort *)','uVar6 + 8','uVar6 + 2'])assert.ok(entry.includes(expected),expected);
const strings=await record('followup-restored/native-gdocs-resource-paths.evidence.json');
const stringBytes=Buffer.from(strings.bytes_hex,'hex');
for(const name of ['reading_mode_gdocs_helper/content.js','reading_mode_gdocs_helper/gdocs_script.js'])assert.ok(stringBytes.includes(Buffer.from(name+'\0')));
const mapping=await record('followup-restored/native-resource-mapping-table.evidence.json');
const mappingBytes=Buffer.from(mapping.bytes_hex,'hex'),mappingBase=BigInt(mapping.address);
for(const [address,pointer,id] of [[0xe1d2370n,0xd54de44n,15865],[0xe1d2390n,0xd54de69n,15866]]){
  const offset=Number(address-mappingBase);assert.equal(mappingBytes.readBigUInt64LE(offset),pointer);assert.equal(mappingBytes.readUInt32LE(offset+8),id);
}
const internal=await record('followup-restored/native-internal-background-mapping.evidence.json');
const internalBytes=Buffer.from(internal.bytes_hex,'hex'),offset=Number(0xe1d2430n-BigInt(internal.address));
assert.equal(internalBytes.readBigUInt64LE(offset),0xd54df08n);assert.equal(internalBytes.readUInt32LE(offset+8),15901);
const dataConversion=await text('loader-region/resource-bytes-to-string.evidence.json');
assert.ok(dataConversion.includes('GzipUncompress')&&dataConversion.includes('BrotliDecompress'));
const scan=await record('loader-final/gdocs-manifest-id-candidates.evidence.json');
assert.equal(scan.results.length,4);assert.ok(scan.results.every(item=>item.complete&&item.total_matches===0));
const sessions=[];
for(const name of ['selectors','native','followup','re-extraction','followup-restored','loader-region','loader-final']){
  const summary=JSON.parse(await fs.readFile(path.join(directory,name,'summary.json'),'utf8'));
  assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
  const calls=JSON.parse(await fs.readFile(path.join(directory,name,'invocations.json'),'utf8'));
  sessions.push({name,status:summary.status,calls:summary.calls,successful:summary.successful,errors:summary.errors,explicit_close:calls.some(item=>item.name==='close_binary'),run_id:summary.verifier_run.run_id});
}
assert.equal(sessions.find(item=>item.name==='loader-final').explicit_close,true);
assert.equal(sessions.find(item=>item.name==='native').errors,1);
assert.equal(sessions.find(item=>item.name==='loader-region').status,'failed');
const recovery=JSON.parse(await fs.readFile(path.join(directory,'input-recovery.json'),'utf8'));
const result={status:'passed',checked_at:new Date().toISOString(),authority:'Read-only canonical Evidence authentication and selected finding assertions; no target rerun, execution or trust validation',records,sessions,input_recovery_receipt:recovery,limits:['Caller-selected entries and partial native Programs are not global coverage.','Zero MOV-ID pattern matches do not exclude another registration path.','Registered/activation code does not establish runtime flag values, chosen overrides, enabled extensions or page execution.','Failed close and failed orchestration receipts remain failures.']};
await fs.writeFile(path.join(directory,'findings.json'),JSON.stringify(result,null,2)+'\n');
console.log(JSON.stringify({status:'passed',records:records.length,sessions:sessions.length}));
