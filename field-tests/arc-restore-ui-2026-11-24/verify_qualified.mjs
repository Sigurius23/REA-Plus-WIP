import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createRequire} from 'node:module';
import {createHash} from 'node:crypto';
import {execFileSync} from 'node:child_process';
import assert from 'node:assert/strict';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8')),sha=b=>createHash('sha256').update(b).digest('hex');
const old=await json(root+'/field-tests/blob-text-controls-2026-11-23/runtime-delivery-manifest.json'),final=await json(out+'/runtime-final-manifest.json');
const {parseEvidence}=await import(pathToFileURL(final.runtime_root+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(final.runtime_root+'/dist/domain/evidenceBundle.js'));
const {toolContract}=await import(pathToFileURL(final.runtime_root+'/dist/contracts/toolContracts.js'));
const {parseMachoLayout}=await import(pathToFileURL(final.runtime_root+'/dist/native/AppleMachoSelection.js'));
const {parsePointerFixups}=await import(pathToFileURL(final.runtime_root+'/dist/native/AppleMachoFixups.js'));
const req=createRequire(final.runtime_root+'/package.json'),{Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
for(const m of [old,final])for(const row of m.files){const b=await fs.readFile(path.join(m.runtime_root,row.path));assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);}
const oldSources=new Map(),currentSources=new Map();
for(const m of [old,await json(root+'/field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json')])for(const row of m.source_files){
 const historic=execFileSync('git',['show',final.source_parent+':'+row.path],{cwd:root,maxBuffer:16*1024*1024});assert.equal(sha(historic),row.sha256);oldSources.set(row.path,row.sha256);currentSources.set(row.path,row.sha256);
}
for(const row of final.source_files)currentSources.set(row.path,row.sha256);
for(const [p,d] of currentSources)assert.equal(sha(await fs.readFile(path.join(root,p))),d,p);
const bytes=await fs.readFile(root+'/rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'),digest=sha(bytes);assert.equal(bytes.length,80498448);assert.equal(digest,'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578');
const layout=parseMachoLayout(bytes,'arm64'),fixups=parsePointerFixups(bytes,layout.fixups,layout.segments,layout.baseAddress);
const owned=await json(out+'/owned-build.json');assert.equal(sha(await fs.readFile(out+'/'+owned.source)),owned.source_sha256);assert.equal(sha(await fs.readFile(owned.artifact)),owned.artifact_sha256);assert.equal(owned.host_execution,false);
const original=await fs.readFile(owned.artifact),ownedLayout=parseMachoLayout(original,'arm64'),variants=await json(out+'/owned-index-variants.json');
for(const row of variants.variants){const b=await fs.readFile(row.path);assert.equal(sha(b),row.sha256);const at=ownedLayout.offset(BigInt(row.slot),8);assert.equal(b.readBigUInt64LE(at),BigInt(row.replacement_word));const restored=Buffer.from(b);restored.writeBigUInt64LE(BigInt(row.original_word),at);assert.deepEqual(restored,original);}
const records=new Map(),sessions=[],lineageLimits=[],bundles={},errors=[],relocations=[];let calls=0,successful=0,instructions=0,reads=0;
const get=(dir,label)=>{const e=records.get(dir+'/'+label);assert.ok(e,dir+'/'+label);return e;},result=(dir,label)=>get(dir,label).normalized_result;
function lineage(run){assert.equal(run.process_lineage.status,'verified');assert.deepEqual(run.process_lineage.descendants,[]);sessions.push(run);}
for(const [directory,bundleFile,runtime] of [['mcp','final.bundle.json',old.runtime_root],['mcp-owned','final.bundle.json',final.runtime_root],['mcp-arc-selected','final.bundle.json',final.runtime_root]]){
 const dir=out+'/'+directory,summary=await json(dir+'/summary.json');assert.equal(summary.status,'completed');lineage(summary.verifier_run);calls+=summary.calls;successful+=summary.successful;
 const ajv=new Ajv2020({strict:false,validateFormats:false}),validators=new Map();
 function validate(schema,value){const key=JSON.stringify(schema);if(!validators.has(key)){assert.ok(ajv.validateSchema(schema));validators.set(key,ajv.compile(schema));}const v=validators.get(key);assert.ok(v(value),JSON.stringify(v.errors));}
 const catalog=await json(dir+'/catalog.json');assert.equal(catalog.length,206);const contract=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
 const bundle=parseEvidenceBundle(await json(dir+'/'+bundleFile)),ids=new Set(bundle.records.map(e=>e.evidence_id));bundles[directory]=bundle.records.length;
 for(const row of await json(dir+'/invocations.json')){
  assert.equal(row.thrown,null);const advertised=catalog.find(t=>t.name===row.name);assert.ok(advertised);validate(advertised.inputSchema,row.arguments);
  const reply=await json(dir+'/'+row.reply);
  if(row.is_error){assert.equal(directory,'mcp-owned');assert.equal(row.name,'inspect_native_dispatch_metadata');const error=JSON.parse(reply.content.find(c=>c.type==='text').text).error;assert.equal(error.code,'invalid_request');errors.push({directory,arguments:row.arguments,error});continue;}
  validate(advertised.outputSchema,reply.structuredContent);contract.toolContract(row.name).outputSchema.parse(reply.structuredContent);assert.deepEqual(JSON.parse(reply.content.find(c=>c.type==='text').text),reply.structuredContent);
  if(!row.evidence_id)continue;
  const e=parseEvidence(reply.structuredContent),r=e.normalized_result;assert.ok(ids.has(e.evidence_id));records.set(directory+'/'+row.reply.replace(/\.reply\.json$/,''),e);
  if(directory==='mcp-owned')continue;
  assert.equal(e.subject.digest.sha256,digest);
  if(e.operation==='inspect_native_instruction'){assert.equal(r.status,'decoded');const at=layout.offset(BigInt(r.address),r.length);assert.equal(bytes.subarray(at,at+r.length).toString('hex'),r.bytes);instructions++;}
  if(e.operation==='read_bytes'){
   reads++;const a=BigInt(r.address),seen=Buffer.from(r.bytes_hex,'hex'),at=layout.offset(a,seen.length),original=bytes.subarray(at,at+seen.length);assert.equal(r.complete,true);if(seen.equals(original))continue;assert.equal(seen.length%8,0);
   for(let i=0;i<seen.length;i+=8){const raw=original.readBigUInt64LE(i),word=seen.readBigUInt64LE(i);if(raw===word)continue;const d=fixups.decode(a+BigInt(i),raw);assert.ok(['bind','rebase'].includes(d.kind));if(d.kind==='rebase')assert.equal(d.target,word);
    relocations.push({evidence_id:e.evidence_id,address:'0x'+(a+BigInt(i)).toString(16),raw:'0x'+raw.toString(16),program_word:'0x'+word.toString(16),kind:d.kind,...(d.kind==='bind'?{symbol:d.symbol,library:d.library,qualification:'Original import identity checked; Program external address retained without asserting external memory contents'}:{target_checked:true})});
   }
  }
 }
}
assert.equal(calls,2207);assert.equal(successful,2206);assert.equal(errors.length,1);
const arcBaseline=parseEvidence(await json(out+'/objc.cli.json')).normalized_result.result;assert.equal(arcBaseline.objc_classes.length,0);assert.equal(arcBaseline.objc_protocol_records.length,320);assert.ok(arcBaseline.coverage.some(c=>c.status==='partial'&&c.reason?.includes('max_records')));
const fir=result('mcp-arc-selected','arc-indexed-firapp').result;assert.deepEqual(fir.objc_class_selection,{name:'FIRApp',index_entries:1960,examined:1960,matching_index_entries:1,matched:true,unresolved:0,admitted_classes:1});assert.equal(fir.objc_classes.length,2);assert.equal(fir.objc_dispatch_implementations.length,45);
for(const label of ['arc-controller-selected','arc-controller-plain-name']){const r=result('mcp-arc-selected',label).result;assert.equal(r.objc_class_selection.matching_index_entries,0);assert.equal(r.objc_class_selection.examined,1960);assert.equal(r.objc_class_selection.unresolved,0);assert.equal(r.objc_classes.length,0);}
for(const [label,matched,unknown,admitted] of [['owned-selected',1,0,1],['owned-missing',0,0,0],['owned-alias',2,0,1],['owned-unknown',1,1,1]]){const s=result('mcp-owned',label).result.objc_class_selection;assert.equal(s.index_entries,2);assert.equal(s.examined,2);assert.equal(s.matching_index_entries,matched);assert.equal(s.unresolved,unknown);assert.equal(s.admitted_classes,admitted);}
assert.equal(result('mcp-owned','owned-unknown').result.coverage.find(c=>c.facet==='objc_class_method_ivar_metadata').status,'partial');
assert.deepEqual(result('mcp-owned','owned-unfiltered').result,parseEvidence(await json(out+'/owned-baseline.cli.json')).normalized_result.result);
const n=(label,expected)=>assert.equal(result('mcp',label).raw_disassembly,expected);
for(const [label,expected] of [['restore-ui-action-0x1001ed234','adrp x3,0x1036b6000'],['restore-ui-action-0x1001ed24c','bl 0x1004095b8'],['restore-origin-b-0x1001ed440','bl 0x100305ef0'],['restore-after-preparation-0x1001ed564','bl 0x100305ef0'],['reset-continuation-0x10227abf8','bl 0x10227b218'],['reset-continuation-0x10227ad5c','bl 0x10366be80']])n(label,expected);
for(const [stub,name] of [['0x10366be80','terminate:'],['0x103660e60','setBool:forKey:'],['0x103642240','addOperation:'],['0x1036653a0','setModifyRecordZonesCompletionBlock:']])assert.equal(Buffer.from(result('mcp-arc-selected','objc-selector-'+stub).bytes_hex,'hex').toString('utf8').replace(/\0$/,''),name);
assert.equal(Buffer.from(result('mcp-arc-selected','command-selector-0x103656060').bytes_hex,'hex').toString('utf8').replace(/\0$/,''),'launchAndReturnError:');
const controller=result('mcp','restore-controller-class').result.swift_dispatch_slots;assert.ok(controller.some(s=>s.owner==='RestoreDataViewController'&&s.implementation_address==='0x1001ecfe4'));
const pairs=[];
for(const [receipt,cliDir,mcpDir] of [['owned-cli-verification.json',out,'mcp-owned'],['arc-cli-qualified/arc-cli-verification.json',out+'/arc-cli-qualified','mcp-arc-selected']]){
 const v=await json(out+'/'+receipt);assert.equal(v.status,'passed');lineage(v.verifier_run);
 for(const row of v.records){assert.equal(row.exact_evidence_equal,true);const e=parseEvidence(await json(cliDir+'/'+row.label+'.cli.json'));toolContract(e.operation).outputSchema.parse(e);assert.deepEqual(e,get(mcpDir,row.label));pairs.push({label:row.label,evidence_id:e.evidence_id,exact_evidence_equal:true});}
}
assert.equal(pairs.length,6);
for(const file of ['objc-cli-receipt.json','owned-baseline-receipt.json']){const v=await json(out+'/'+file);assert.equal(v.status,'passed');lineage(v.verifier_run);}
const limited=await json(out+'/arc-cli-verification.json');assert.equal(limited.status,'passed');assert.equal(limited.verifier_run.process_lineage.status,'unavailable');lineageLimits.push(limited.verifier_run);
const packageText=await fs.readFile(out+'/package.log','utf8'),packageReport=JSON.parse(packageText.trim().split('\n').at(-1));assert.equal(packageReport.cli,true);assert.equal(packageReport.mcpTools,206);lineage(packageReport.verifier_run);
const testText=await fs.readFile(out+'/tests.log','utf8');assert.match(testText,/67 passed/);
for(const [file,pattern] of [['build.log',/3 successful/],['check-fast.log',/2 successful/],['docs-check.log',/6 successful/]])assert.match(await fs.readFile(out+'/'+file,'utf8'),pattern);
const seed=await json(out+'/seed-receipt.json');assert.equal(sha(await fs.readFile(out+'/seeds.tsv')),seed.sha256);assert.equal(sha(await fs.readFile(seed.source)),seed.sha256);
const reused=await json(out+'/reused-sources.json'),findings=await json(out+'/finding-index.json');
const fixtureDigests=new Set([owned.artifact_sha256,...variants.variants.map(v=>v.sha256)]);
for(const row of [...reused,...findings.findings.flatMap(f=>f.sources)]){const b=await fs.readFile(root+'/'+row.path);assert.equal(b.length,row.bytes);assert.equal(sha(b),row.sha256);if(row.evidence_id){const e=parseEvidence(JSON.parse(b));assert.equal(e.evidence_id,row.evidence_id);if(row.path.includes('/mcp-owned/'))assert.ok(fixtureDigests.has(e.subject.digest.sha256));else assert.equal(e.subject.digest.sha256,digest);}}
const taskDescriptor=result('mcp-arc-selected','restore-task-descriptor'),taskBytes=Buffer.from(taskDescriptor.bytes_hex,'hex');assert.equal(BigInt(taskDescriptor.address)+BigInt(taskBytes.readInt32LE()),0x1001edef0n);
const retained=await json(out+'/retained-client-unknown.json'),oldBundle=parseEvidenceBundle(await json(root+'/'+retained.source)),unknown=oldBundle.unknowns.filter(u=>u.unknown_id===retained.unknown.unknown_id).sort((a,b)=>b.revision-a.revision)[0];assert.deepEqual(unknown,retained.unknown);assert.equal(unknown.revision,3);assert.equal(unknown.status,'open');
const receipt={status:'passed',mcp_calls:calls,successful_mcp_calls:successful,expected_errors:errors,bundles,source_instruction_records_byte_checked:instructions,raw_reads:reads,loader_relocations:relocations,exact_cli_mcp_pairs:pairs,old_frozen_runtime_files:old.files.length,new_frozen_runtime_files:final.files.length,baseline_source_hashes_authenticated_at_parent:oldSources.size,current_source_hashes:currentSources.size,reused_sources:reused.length,finding_groups:findings.findings.length,retained_client_unknown:{revision:unknown.revision,status:unknown.status},arc_selector:{baseline_protocol_records:320,baseline_classes:0,max_records:6000,full_index:1960,selected_name:'FIRApp',selected_classes:2,selected_methods:45,controller_index_negatives_scoped:true},source_tests:67,checks:['build:cached','check:fast','docs:check','verify:package'],owned_lineages:sessions,retained_lineage_limitations:lineageLimits,target_execution:false,scope:'Indexed Objective-C selector plus conditional controller restore/preparation/restart requests; no actual UI event, active injection, disk durability or cloud effects established'};
await fs.writeFile(out+'/qualification-verification.json',JSON.stringify(receipt,null,2)+'\n');console.log(JSON.stringify({status:'passed',calls,successful,instructions,reads,pairs:pairs.length,verified_lineages:sessions.length,retained_lineage_limits:lineageLimits.length}));
