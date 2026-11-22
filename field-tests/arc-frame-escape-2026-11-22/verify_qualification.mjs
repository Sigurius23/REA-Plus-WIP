import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {execFileSync} from 'node:child_process';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const json=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const digest=b=>createHash('sha256').update(b).digest('hex');
const manifest=await json(path.join(out,'runtime-manifest.json')),runtime=manifest.runtime_root;
const req=createRequire(runtime+'/package.json');
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const {toolContract}=await import(pathToFileURL(runtime+'/dist/contracts/toolContracts.js'));
for(const r of manifest.files){const b=await fs.readFile(path.join(runtime,r.path));assert.equal(b.length,r.bytes);assert.equal(digest(b),r.sha256);}
for(const r of manifest.source_files)assert.equal(digest(await fs.readFile(path.join(root,r.path))),r.sha256);
const index=await json(path.join(out,'qualification-index.json'));
assert.equal(index.status,'passed');
for(const r of index.records){const b=await fs.readFile(path.join(root,r.path));assert.equal(b.length,r.bytes);assert.equal(digest(b),r.sha256);}
const map=new Map(index.records.map(r=>[path.join(root,r.source_path),r.path]));
const retained=p=>{const value=map.get(p);assert.ok(value,p);return path.join(root,value);};
const reports=[];
for(const [name,expectedOk,expectedCases,version] of [['baseline',false,0,'abi-signed-word-cfg-v9'],['native-full',false,7,'abi-signed-word-cfg-v10'],['native-final',true,110,'abi-signed-word-cfg-v10']]){
 const base=path.join(out,'qualification',name),summary=await json(path.join(base,'summary.json')),start=await json(path.join(base,'run-start.json'));
 assert.equal(summary.ok,expectedOk);assert.equal(summary.results.length,expectedCases);assert.equal(summary.target_executed,false);
 if(name==='native-final'){const inventory=await json(path.join(out,'case-inventory.json'));assert.equal(inventory.total,110);assert.deepEqual(summary.results.map(r=>r.label),inventory.labels);assert.deepEqual(summary.skipped,[]);}
 assert.equal(summary.process_lineage.status,'verified');assert.deepEqual(summary.process_lineage.descendants,[]);
 const source=name==='baseline'?execFileSync('git',['show','305e5acb0:rea-local/bridge/ghidra/ReaGhidraSwiftEnumSwitches.java'],{cwd:root}):await fs.readFile(path.join(root,'rea-local/bridge/ghidra/ReaGhidraSwiftEnumSwitches.java'));
 assert.equal(digest(source),start.producer.sha256);
 const schemas=new Map(),ajv=new Ajv2020({strict:false,validateFormats:false});
 const validate=s=>{assert.ok(ajv.validateSchema(s));if(s.$id&&schemas.has(s.$id)){const old=schemas.get(s.$id);assert.deepEqual(old.schema,s);return old.fn;}const fn=ajv.compile(s);if(s.$id)schemas.set(s.$id,{schema:s,fn});return fn;};
 let evidenceCount=0,negativeCases=0,positiveCases=0,cliCases=0;
 const observations=new Map();
 for(const r of summary.records){
  assert.equal(r.is_error,false);const reply=await json(retained(r.reply.path));assert.notEqual(reply.isError,true);
  const catalogRow=index.records.find(x=>x.kind==='catalog-alias'&&path.dirname(path.join(root,x.source_path))===path.dirname(r.reply.path));assert.ok(catalogRow);
  const catalog=await json(path.join(root,catalogRow.path)),t=catalog.find(t=>t.name===r.name);assert.ok(t);
  assert.ok(validate(t.inputSchema)(r.args));const e=reply.structuredContent;assert.ok(validate(t.outputSchema)(e));toolContract(r.name).outputSchema.parse(e);
  assert.deepEqual(JSON.parse(reply.content.find(b=>b.type==='text').text),e);
  if(e.evidence_id){parseEvidence(e);evidenceCount++;assert.equal(e.analysis_profile.parameters.swift_enum_switch_recovery,version);}
  if(r.name==='analyze_function')observations.set(r.label,e);
 }
 for(const r of summary.results){
  const e=observations.get(r.label);assert.ok(e);assert.equal(e.evidence_id,r.evidence_id);assert.equal(e.subject.digest.sha256,r.target.sha256);
  const v=e.normalized_result,tables=v.native_api.jump_tables.filter(t=>t.data_sources.some(s=>s.provenance==='rea-swift-enum-signed-word-table'));
  if(r.positive){
   positiveCases++;assert.equal(tables.length,1);const op=path.join(base,r.label,'oracle.json'),oracle=(await json(op)).oracle;
   assert.deepEqual(tables[0].mappings.map(({case_value,target_address})=>({case_value,target_address})),oracle.mappings.map(({case_value,target_address})=>({case_value,target_address})));
   assert.equal(tables[0].data_sources[0].entry_count,oracle.mappings.length);
  }else{negativeCases++;assert.deepEqual(tables,[]);}
  if(r.cli_parity){const cli=await json(path.join(base,r.label,'cli.json'));parseEvidence(cli);assert.equal(cli.evidence_id,e.evidence_id);cliCases++;}
 }
 assert.deepEqual(summary.records.slice(-1).map(r=>r.name),['close_binary']);
 if(name==='baseline'){
  assert.match(summary.error,/unsupported\/corrupt shape acquired a Swift ABI bound/);
  const e=observations.get('frame-escape-post-x8');assert.ok(e);
  const table=e.normalized_result.native_api.jump_tables.find(t=>t.data_sources.some(s=>s.provenance==='rea-swift-enum-signed-word-table'));
  assert.equal(table.mappings.length,30);
 }else if(name==='native-full')assert.match(summary.error,/AssertionError/);
 reports.push({name,classification:expectedOk?'completed':name==='baseline'?'expected-counterexample':'partial-stale-verifier-assertion',calls:summary.records.length,completed_cases:expectedCases,positive_cases:positiveCases,negative_cases:negativeCases,cli_cases:cliCases,evidence_records:evidenceCount,verified_empty_lineage:true,profile:version});
}
const packageLog=(await fs.readFile(path.join(out,'checks/package.log'),'utf8')).trim().split('\n');
const packaged=JSON.parse(packageLog.at(-1));assert.equal(packaged.verifier_run.process_lineage.status,'verified');assert.deepEqual(packaged.verifier_run.process_lineage.descendants,[]);
for(const name of ['docs-check.log','fast-check.log'])assert.match(await fs.readFile(path.join(out,'checks',name),'utf8'),/Tasks:.*successful/);
const result={status:'passed',runs:reports,frozen_runtime_files:manifest.files.length,package_verified_empty_lineage:true,fast_and_docs_gate_logs_authenticated:true,target_executed:false,limits:['The old producer counterexample is authenticated against the committed v9 Java source; the exact fixture bytes are retested separately through v10 MCP.','The first v10 run correctly rejected seven unsafe cases; the positive case recovered but its stale verifier assertion failed. Original records are preserved.','Native qualification checks producer boundaries and source-built controls, not completion of Arc or item63 typed closure provenance.']};
await fs.writeFile(path.join(out,'qualification-verification.json'),JSON.stringify(result,null,2)+'\n');console.log(JSON.stringify(result));
