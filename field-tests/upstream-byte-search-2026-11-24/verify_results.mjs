import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(out+'/runtime-release-manifest.json'),pkg=manifest.runtime_root;
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(pkg+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(pkg+'/dist/contracts/toolContracts.js'));
const runtimes=[];
for(const [name,sourceDirectory] of [['runtime-manifest.json','source-initial'],['runtime-qualified-manifest.json','source-qualified'],['runtime-final-manifest.json','source-final'],['runtime-release-manifest.json',null]]){
 const m=await json(out+'/'+name);
 for(const f of m.files){const b=await fs.readFile(path.join(m.runtime_root,f.path));assert.equal(b.length,f.bytes);assert.equal(sha(b),f.sha256,f.path);}
 for(const f of m.source_files){if(f.deleted){await assert.rejects(fs.stat(path.join(root,f.path)),{code:'ENOENT'});continue;}const b=await fs.readFile(path.join(sourceDirectory?path.join(out,sourceDirectory):root,f.path));assert.equal(sha(b),f.sha256,f.path);}
 runtimes.push({manifest:name,files:m.files.length,sources:m.source_files.length});
}
const counts={},lineages=[];
for(const [dir,errors] of [['mcp-owned-initial',3],['mcp-owned-qualified',3],['mcp-mutation',1],['mcp-arc',0],['mcp-offset-before',0],['mcp-owned-final',4],['mcp-mutation-final',1],['mcp-arc-final',1],['mcp-owned-release',4],['mcp-mutation-release',1],['mcp-arc-release',0]]){
 const summary=await json(out+'/'+dir+'/summary.json'),calls=await json(out+'/'+dir+'/invocations.json');
 assert.equal(summary.status,dir==='mcp-arc-final'?'failed':'completed');assert.equal(summary.errors,errors);assert.equal(summary.calls,calls.length);assert.equal(summary.tools,207);
 for(const row of calls){assert.equal(row.thrown,null);const reply=await json(out+'/'+dir+'/'+row.reply);
  if(reply.isError){assert.ok(['invalid-pattern','wrong-space','bad-cursor','stale','auxiliary-offset','bytes16'].some(label=>row.reply===label+'.reply.json'));continue;}
  toolContract(row.name).outputSchema.parse(reply.structuredContent);assert.deepEqual(JSON.parse(reply.content.find(x=>x.type==='text').text),reply.structuredContent);
  if(reply.structuredContent.evidence_id)parseEvidence(reply.structuredContent);
 }
 assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);lineages.push({directory:dir,...summary.verifier_run});counts[dir]={calls:summary.calls,successes:summary.successful,expected_refusals:dir==='mcp-arc-final'?0:errors,...(dir==='mcp-arc-final'?{historical_capacity_failures:1}:{})};
}
const evidence=async (dir,label)=>parseEvidence(await json(out+'/'+dir+'/'+label+'.evidence.json'));
const result=async (dir,label)=>(await evidence(dir,label)).normalized_result;
const addresses=value=>value.matches.map(m=>m.address);
const error=async (dir,label)=>JSON.parse((await json(out+'/'+dir+'/'+label+'.reply.json')).content.find(x=>x.type==='text').text).error;
for(const dir of ['mcp-owned-initial','mcp-owned-qualified','mcp-owned-final','mcp-owned-release']){
 const all=await result(dir,'all');assert.deepEqual(addresses(all),['0x60000000','0x60000500']);assert.equal(all.complete,true);
 assert.ok(all.searched.skipped_overlays.some(b=>b.segment==='overlay_test'));assert.ok(all.searched.skipped_not_loaded.some(b=>b.segment==='not_loaded'));assert.ok(all.searched.skipped_uninitialized.some(b=>b.segment==='gap_middle'));
 const cross=await result(dir,'cross');assert.deepEqual(addresses(cross),['0x60000000']);assert.deepEqual(cross.searched.blocks.map(b=>[b.segment,b.bytes]),[['cross_first',2],['cross_second',2],['cross_third',2]]);
 const end=await result(dir,'end-inside');assert.deepEqual(end.matches,[]);assert.equal(end.searched.bytes,5);assert.equal(end.complete,true);
 const gap=await result(dir,'gap');assert.deepEqual(gap.matches,[]);assert.equal(gap.searched.bytes,4);assert.deepEqual(gap.searched.skipped_uninitialized,[{segment:'gap_middle',start:'0x60000102',end:'0x60000103',bytes:2}]);
 const pages=await Promise.all(['overlap-first','overlap-second','overlap-final'].map(label=>result(dir,label)));
 assert.deepEqual(pages.flatMap(addresses),['0x60000300','0x60000301','0x60000302','0x60000303']);assert.deepEqual(pages.map(p=>p.complete),[false,false,true]);assert.deepEqual(pages.map(p=>p.searched.bytes),[3,4,2]);
 const masked=await Promise.all(['mask-first','mask-rest'].map(label=>result(dir,label)));assert.deepEqual(masked.flatMap(addresses),Array.from({length:5},(_,i)=>'0x'+(0x60000300+i).toString(16)));assert.equal(masked[1].complete,true);
 assert.deepEqual(addresses(await result(dir,'overlay')),['overlay_test:0x60000000']);assert.deepEqual(addresses(await result(dir,'unloaded')),['OTHER:0x60000400']);
 const auxiliary=await result(dir,'auxiliary');assert.equal(auxiliary.matches[0].file_offset,null);
 const start=await result(dir,'function-search'),offset=await result(dir,'function-offset');assert.equal(start.matches[0].file_offset,offset.file_offset);assert.equal(offset.file_offset,1120);assert.equal(start.matches[0].procedure.address,'0x100000460');
 for(const label of ['bad-cursor','wrong-space'])assert.equal((await error(dir,label)).code,'invalid_request');
 const cursor=await error(dir,'bad-cursor');assert.deepEqual(cursor.details.issues[0].path,['cursor']);assert.match(cursor.details.issues[0].message,/differing component is unknown/);
 const invalid=await json(out+'/'+dir+'/invalid-pattern.reply.json');assert.equal(invalid.isError,true);assert.match(invalid.content[0].text,/pattern/);
 const bundle=parseEvidenceBundle(await json(out+'/'+dir+'/final.bundle.json')),allEvidence=await evidence(dir,'all');assert.ok(bundle.records.some(r=>r.evidence_id===allEvidence.evidence_id));
}
const mutationFirst=await result('mcp-mutation-release','first'),mutationFresh=await result('mcp-mutation-release','fresh');assert.ok(mutationFirst.next_cursor);assert.equal(await result('mcp-mutation-release','rename'),true);assert.equal((await error('mcp-mutation-release','stale')).code,'invalid_request');assert.deepEqual((await error('mcp-mutation-release','stale')).details.issues[0].path,['cursor']);assert.equal(mutationFresh.matches[0].procedure.name,'rea_byte_cursor_label');assert.notEqual(mutationFirst.next_cursor,mutationFresh.next_cursor);
const arc=await evidence('mcp-arc-release','reducer'),old=parseEvidence(await json(root+'/field-tests/upstream-native-observations-2026-11-24/mcp-arc-final/arc-reducer.evidence.json'));assert.deepEqual(arc.normalized_result,old.normalized_result);assert.notEqual(arc.analysis_profile.digest,old.analysis_profile.digest);assert.notEqual(arc.evidence_id,old.evidence_id);
const at=0x1012a571c,bytes16=await result('mcp-arc-release','bytes16'),bytes128=await result('mcp-arc-release','bytes128'),memory=Buffer.from(bytes128.bytes_hex,'hex');assert.equal(memory.length,128);assert.equal(bytes16.returned_bytes,16);
assert.deepEqual(addresses(await result('mcp-arc-release','exact')),['0x'+at.toString(16)]);assert.equal((await result('mcp-arc-release','exact')).searched.bytes,10072);
const expectedMasked=[];for(let i=0;i<=memory.length-16;i++)if(memory.subarray(i,i+8).equals(memory.subarray(0,8)))expectedMasked.push('0x'+(at+i).toString(16));assert.deepEqual(addresses(await result('mcp-arc-release','mask')),expectedMasked);
const zeros=await Promise.all(['zero-first','zero-rest'].map(label=>result('mcp-arc-release',label))),expectedZeros=[...memory].flatMap((byte,i)=>byte===0?['0x'+(at+i).toString(16)]:[]);assert.equal(expectedZeros.length,12);assert.deepEqual(zeros.flatMap(addresses),expectedZeros);assert.equal(zeros[1].complete,true);
const offset=await result('mcp-arc-release','offset');assert.equal((await result('mcp-arc-release','exact')).matches[0].file_offset,offset.file_offset);
const owned=await json(out+'/owned-build.json'),project=await json(out+'/owned-project.json');assert.equal(sha(await fs.readFile(owned.target)),owned.sha256);assert.equal(sha(await fs.readFile(owned.source)),owned.source_sha256);assert.equal(sha(await fs.readFile(project.fixture_script)),project.fixture_script_sha256);assert.equal(sha(await fs.readFile(arc.subject.local_path)),arc.subject.digest.sha256);
assert.equal((await result('mcp-offset-before','auxiliary-offset')).file_offset,0);assert.equal((await error('mcp-owned-release','auxiliary-offset')).code,'invalid_request');assert.match((await error('mcp-owned-release','auxiliary-offset')).details.issues[0].message,/original-target source mappings/);assert.equal((await result('mcp-owned-release','target-header-offset')).file_offset,0);
const setup=await json(out+'/owned-setup-verification.json');assert.equal(setup.status,'passed');assert.equal(setup.verifier_run.process_lineage.status,'verified');assert.deepEqual(setup.verifier_run.process_lineage.descendants,[]);lineages.push({directory:'fixture-setup',...setup.verifier_run});
const cli=await json(out+'/cli-release/verification.json');assert.equal(cli.status,'passed');assert.equal(cli.records.filter(r=>r.exact_mcp_evidence_equal).length,7);assert.equal(cli.records.filter(r=>r.expected_error).length,3);assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);lineages.push({directory:'cli',...cli.verifier_run});
const packageText=await fs.readFile(out+'/package-release.log','utf8'),receipt=JSON.parse(packageText.trim().split('\n').at(-1));assert.equal(receipt.mcpTools,207);assert.equal(receipt.mcpPrompts,6);assert.equal(receipt.evidenceMcp,true);assert.equal(receipt.verifier_run.process_lineage.status,'verified');assert.deepEqual(receipt.verifier_run.process_lineage.descendants,[]);lineages.push({directory:'package',...receipt.verifier_run});
const capacityBefore=await error('mcp-arc-final','bytes16');assert.equal(capacityBefore.code,'execution_failure');assert.equal(capacityBefore.details.diagnostics.remote_code,'bridge_exception');assert.equal(capacityBefore.details.diagnostics.remote_message,'IOException: No space left on device');
const producer=await json(out+'/disk-probe-verification.json'),producerInput=await json(out+'/disk-probe.json');assert.equal(producer.status,'passed');assert.equal(producer.verifier_run.process_lineage.status,'verified');assert.deepEqual(producer.verifier_run.process_lineage.descendants,[]);lineages.push({directory:'disk-producer',...producer.verifier_run});
const producerLog=await fs.readFile(out+'/disk-probe.stdout.log','utf8'),match=/REA_DISK_CLASSIFICATION (\[[^\r\n]+\])/.exec(producerLog);assert.ok(match);const cases=JSON.parse(match[1]);assert.equal(cases.length,10);assert.ok(cases.every(c=>c.actual===c.expected));
const scriptRoot=producerInput.headless_arguments[producerInput.headless_arguments.indexOf('-scriptPath')+1];for(const f of manifest.files.filter(f=>f.path.startsWith('bridge/ghidra/')&&f.path.endsWith('.java'))){assert.equal(sha(await fs.readFile(path.join(scriptRoot,path.basename(f.path)))),f.sha256,f.path);}
const history=await json(out+'/history-verification.json');assert.equal(history.status,'passed');assert.equal(history.snapshots.length,30);
const verification={status:'passed',runtimes,counts,cli:{calls:cli.records.length,exact_pairs:7,pre_admission_refusals:3},arc:{normalized_reducer_unchanged:true,instruction_count:arc.normalized_result.instructions.length,old_evidence_id:old.evidence_id,new_evidence_id:arc.evidence_id,profile_changed:true,exact_matches:1,masked_matches:expectedMasked.length,zero_bytes_reconstructed:expectedZeros.length},historical_snapshots:30,lineages,target_executed:false};await fs.writeFile(out+'/verification-qualified.json',JSON.stringify(verification,null,2)+'\n');console.log(JSON.stringify({status:'passed',counts,cli:verification.cli,arc:verification.arc,lineages:lineages.length}));
