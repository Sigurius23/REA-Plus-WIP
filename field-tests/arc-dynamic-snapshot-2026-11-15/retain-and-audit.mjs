import assert from "node:assert/strict";
import { createHash } from "node:crypto";
import fs from "node:fs/promises";
import path from "node:path";
import { fileURLToPath, pathToFileURL } from "node:url";

const directory=path.dirname(fileURLToPath(import.meta.url));
const repository=path.resolve(directory,"../../rea-local");
const cache=path.join(repository,".cache/dynamic-snapshot-2026-11-15");
const runtime=path.join(repository,".cache/arc-runtime-5628ef81");
const hash=(bytes)=>createHash("sha256").update(bytes).digest("hex");
const json=async(file)=>JSON.parse(await fs.readFile(file,"utf8"));
const plan=await json(path.join(directory,"retention-plan.json"));
if (!process.argv.includes("--finalize-settled")) {
  console.log(JSON.stringify({status:"prepared_not_finalized",requires:"Parent-confirmed settlement, then --finalize-settled",plan:"retention-plan.json"}));
  process.exit(0);
}
const runs=[];
for (const name of [...plan.historical_runs,plan.final_run]) {
  const root=path.join(cache,name),summary=await json(path.join(root,"summary.json")),start=await json(path.join(root,"run-start.json"));
  assert.equal(summary.ok,true,`${name} did not finish successfully`);
  assert.equal(summary.target_executed,false);
  assert.equal(summary.process_lineage.status,"verified");
  assert.deepEqual(summary.process_lineage.descendants,[]);
  if(name===plan.final_run) {
    assert.equal(summary.results.length,102);
    assert.equal(new Set(summary.results.map((result)=>result.label)).size,102);
    assert.equal(summary.results.filter((result)=>result.positive).length,15);
    assert.equal(summary.results.filter((result)=>!result.positive).length,87);
    assert.equal(summary.results.filter((result)=>result.cli_parity).length,13);
    assert.equal(start.producer.sha256,plan.final_producer_sha256);
    assert.equal(start.verifier.sha256,plan.final_verifier_sha256);
  } else {
    assert.equal(summary.results.length,1);
    assert.equal(start.producer.sha256,"38fd6289974cb1a63ed35768cbab1bea6fb65969b7e49f4e99279cca7366ddbf");
    assert.equal(start.verifier.sha256,"119549ca425255dc8439a9ba449f46e3123c84756511354ab048f5052e87436b");
  }
  runs.push({name,root,summary,start});
}
// All settlement checks precede any retention mutation.
const write=async(relative,bytes)=>{
  const destination=path.join(directory,relative);await fs.mkdir(path.dirname(destination),{recursive:true});
  try {assert.equal(hash(await fs.readFile(destination)),hash(bytes),`Existing retention changed: ${relative}`);}
  catch(error) {if(error.code!=="ENOENT")throw error;await fs.writeFile(destination,bytes,{flag:"wx"});}
};
const save=(relative,value)=>write(relative,Buffer.from(JSON.stringify(value,null,2)+"\n"));
const saveAudit=(relative,value)=>fs.writeFile(path.join(directory,relative),JSON.stringify(value,null,2)+"\n");
const copy=async(source,relative)=>write(relative,await fs.readFile(source));
const sourceProof=[];
for(const [folder,freezeName] of [["first-source","first-source-freeze.json"],["final-source","final-source-freeze.json"]]) {
  const freeze=await json(path.join(directory,freezeName));
  for(const identity of Array.isArray(freeze)?freeze:freeze.files) {
    const relative=`${folder}/${identity.path}`,bytes=await fs.readFile(path.join(directory,relative));
    assert.equal(hash(bytes),identity.sha256);
    if(identity.bytes!==undefined)assert.equal(bytes.length,identity.bytes);
    sourceProof.push({...identity,retained_path:relative});
  }
}
const validatorManifestPath=path.resolve(directory,"../arc-selector-v8-2026-11-15/runtime-manifest.json");
const validatorManifest=await json(validatorManifestPath);
assert.equal(validatorManifest.source_commit,"5628ef81ce5144c9af3bdc11b1e3647a9035c368");
const validators=validatorManifest.files.filter((file)=>file.path.startsWith("dist/domain/")&&file.path.endsWith(".js"));
for(const identity of validators)assert.equal(hash(await fs.readFile(path.join(runtime,identity.path))),identity.sha256);
await copy(validatorManifestPath,"retained/validator-runtime-manifest.json");
const {parseEvidence}=await import(pathToFileURL(path.join(runtime,"dist/domain/evidence.js")));
const {createEvidenceBundle,parseEvidenceBundle,serializeEvidenceBundle}=await import(pathToFileURL(path.join(runtime,"dist/domain/evidenceBundle.js")));
const recordsById=new Map(),catalogs=new Map(),runIndex=[];
let nativeRawEvidence=0;
const retainEvidence=async(value)=>{
  const record=parseEvidence(value),bytes=Buffer.from(JSON.stringify(record,null,2)+"\n");
  // Equal semantic IDs may retain different local-path envelopes. Preserve
  // each distinct envelope and deduplicate only identical retained bytes.
  const relative=`retained/evidence/${record.evidence_id}-${hash(bytes)}.evidence.json`;
  await write(relative,bytes);recordsById.set(record.evidence_id,record);return {path:relative,evidence_id:record.evidence_id,operation:record.operation};
};
for(const {name,root,summary,start} of runs) {
  const prefix=`retained/runs/${name}`;
  for(const file of ["summary.json","run-start.json","invocations.json"])await copy(path.join(root,file),`${prefix}/${file}`);
  const runRecords=new Map(),cases=[];
  for(const result of summary.results) {
    const sourceCase=path.join(root,result.label),casePrefix=`${prefix}/${result.label}`,evidence=[];
    for(const file of ["oracle.json","switch.swift","switch.s","stderr.txt"]) {
      try {await copy(path.join(sourceCase,file),`${casePrefix}/${file}`);}
      catch(error){if(error.code!=="ENOENT")throw error;}
    }
    const catalog=await fs.readFile(path.join(sourceCase,"catalog.json")),catalogHash=hash(catalog),catalogPath=`retained/catalogs/${catalogHash}.json`;
    if(!catalogs.has(catalogHash)){await write(catalogPath,catalog);catalogs.set(catalogHash,catalogPath);}
    for(const invocation of summary.records.filter((record)=>record.label===result.label)) {
      const filename=path.basename(invocation.reply.path),bytes=await fs.readFile(path.join(sourceCase,filename));
      assert.equal(hash(bytes),invocation.reply.sha256);assert.equal(bytes.length,invocation.reply.bytes);
      await write(`${casePrefix}/raw/${filename}`,bytes);
      const reply=JSON.parse(bytes);assert.notEqual(reply.isError,true);
      if(!["procedure_info","analyze_function"].includes(invocation.name))continue;
      const record=parseEvidence(reply.structuredContent);
      nativeRawEvidence++;
      const text=reply.content.filter((content)=>content.type==="text").map((content)=>content.text).join("");assert.deepEqual(JSON.parse(text),record);
      assert.equal(record.subject.digest.sha256,result.target.sha256);
      assert.equal(record.analysis_profile.parameters.swift_enum_switch_recovery,"abi-signed-word-cfg-v9");
      assert.equal(record.analysis_profile.parameters.swift_dynamic_typed_snapshot,"swift-dynamic-typed-snapshot-v1");
      evidence.push(await retainEvidence(record));runRecords.set(record.evidence_id,record);
    }
    if(result.cli_parity) {
      const bytes=await fs.readFile(path.join(sourceCase,"cli.json")),record=parseEvidence(JSON.parse(bytes));
      nativeRawEvidence++;
      assert.equal(record.evidence_id,evidence.find((item)=>item.operation==="analyze_function").evidence_id);
      await write(`${casePrefix}/raw/cli.json`,bytes);evidence.push({...await retainEvidence(record),operation:"cli-function"});
    }
    cases.push({label:result.label,positive:result.positive,cli_parity:result.cli_parity,target:result.target,catalog:{path:catalogPath,sha256:catalogHash},evidence});
  }
  const bundle=createEvidenceBundle([...runRecords.values()]);parseEvidenceBundle(bundle);
  const bundlePath=`${prefix}/captured-records.bundle.json`;
  await write(bundlePath,Buffer.from(serializeEvidenceBundle(bundle)));
  runIndex.push({name,historical:name!==plan.final_run,passed_cases:summary.results.length,producer:start.producer,verifier:start.verifier,process_lineage:summary.process_lineage,summary:`${prefix}/summary.json`,bundle:bundlePath,bundle_origin:"offline canonical assembly from captured public Evidence; not a public export call",cases});
}
const existing=[],publicRecords=new Map();
for(const folder of ["large-rebase-before","large-rebase-after"]) {
  const root=path.join(directory,folder),summary=await json(path.join(root,"evidence/summary.json"));
  assert.equal(summary.status,"completed");assert.equal(summary.errors,0);
  assert.equal(summary.verifier_run.process_lineage.status,"verified");assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
  const bundle=parseEvidenceBundle(await json(path.join(root,"evidence/bundle.json")));
  for(const record of bundle.records){parseEvidence(record);publicRecords.set(record.evidence_id,record);}
  for(const stem of ["large-rebase-info","large-rebase-analysis"]) {
    const record=parseEvidence(await json(path.join(root,"evidence",`${stem}.evidence.json`)));
    const reply=await json(path.join(root,"evidence",`${stem}.reply.json`));
    assert.notEqual(reply.isError,true);
    assert.deepEqual(parseEvidence(reply.structuredContent),record);
    assert.deepEqual(JSON.parse(reply.content.filter((content)=>content.type==="text").map((content)=>content.text).join("")),record);
    assert.deepEqual(bundle.records.find((item)=>item.evidence_id===record.evidence_id),record);
  }
  const analysis=bundle.records.find((record)=>record.operation==="analyze_function");
  const tables=analysis.normalized_result.native_api.jump_tables.filter((table)=>table.data_sources.some((source)=>source.provenance==="rea-swift-enum-signed-word-table"));
  existing.push({path:folder,bundle_records:bundle.records.length,analysis_evidence_id:analysis.evidence_id,target_sha256:analysis.subject.digest.sha256,tables:tables.length,mappings:tables[0]?.mappings.length??0,body_bytes:analysis.normalized_result.procedure.body.total_bytes,process_lineage:summary.verifier_run.process_lineage});
}
const comparison=await json(path.join(directory,"large-rebase-comparison.json"));
assert.equal(comparison.status,"passed");assert.equal(comparison.before_tables,0);assert.equal(comparison.after_tables,1);assert.equal(comparison.exact_case_mappings,24);
assert.equal(existing[0].analysis_evidence_id,comparison.before_evidence_id);assert.equal(existing[1].analysis_evidence_id,comparison.after_evidence_id);
for(const item of existing)assert.equal(item.target_sha256,comparison.same_target_sha256);
assert.equal(existing[0].tables,0);assert.equal(existing[1].tables,1);assert.equal(existing[1].mappings,24);
assert.equal(existing[0].body_bytes,comparison.before_body_bytes);assert.equal(existing[1].body_bytes,comparison.after_body_bytes);
const final=runIndex.find((run)=>!run.historical),finalResults=final.cases;
const allIds=new Set([...recordsById.keys(),...publicRecords.keys()]);
assert.equal(recordsById.size,208);assert.equal(nativeRawEvidence,222);assert.equal(publicRecords.size,4);assert.equal(allIds.size,212);
await saveAudit("retention-index.json",{authority:"Settled static owned-fixture workflows, authenticated frozen sources and canonical public Evidence",predecessor_commit:plan.predecessor_commit,source_proofs:sourceProof,validator_runtime:".cache/arc-runtime-5628ef81",validator_domain_files:validators.length,native_catalogs:catalogs.size,runs:runIndex,existing_public_captures:existing,excluded:plan.excluded});
await saveAudit("evidence-audit.json",{status:"passed",checked_at:new Date().toISOString(),authority:"Read-only canonical Evidence/manifest authentication after captured runs settled; no provider rerun",final:{distinct_cases:finalResults.length,positives:finalResults.filter((item)=>item.positive).length,rejections:finalResults.filter((item)=>!item.positive).length,cli_comparisons:finalResults.filter((item)=>item.cli_parity).length,producer_sha256:final.producer.sha256,verifier_sha256:final.verifier.sha256,process_lineage:final.process_lineage},historical_runs:runIndex.filter((run)=>run.historical).map(({name,passed_cases,producer,verifier,process_lineage})=>({name,passed_cases,producer,verifier,process_lineage})),canonical_coverage:{native_unique_records:recordsById.size,native_raw_representations:nativeRawEvidence,native_bundles:runIndex.length,existing_public_unique_records:publicRecords.size,total_unique_records:allIds.size,total_bundles:runIndex.length+existing.length,total_raw_representations:nativeRawEvidence+4},existing_public_captures:existing,large_rebase_comparison:comparison,bundle_origin:"Native bundles assembled offline; existing large-rebase bundles came from recorded public export calls"});
async function* files(root){for(const entry of await fs.readdir(root,{withFileTypes:true})){const file=path.join(root,entry.name);if(entry.isDirectory())yield*files(file);else if(entry.isFile())yield file;else throw new Error(`Non-file in retention scope: ${file}`);}}
const selected=["retention-plan.json","retain-and-audit.mjs","retention-index.json","evidence-audit.json","first-source-freeze.json","final-source-freeze.json","large-rebase-comparison.json"];
for(const folder of ["retained","first-source","final-source","large-rebase-before","large-rebase-after"])
  for await(const file of files(path.join(directory,folder)))selected.push(path.relative(directory,file));
const manifest=[];
for(const relative of selected.sort()) {
  const bytes=await fs.readFile(path.join(directory,relative));new TextDecoder("utf-8",{fatal:true}).decode(bytes);
  manifest.push({path:relative,bytes:bytes.length,sha256:hash(bytes)});
}
await saveAudit("text-manifest.json",{status:"passed",scope:"Retained text, authenticated source snapshots, existing large-rebase public captures and audit files; excludes mutable top-level logs, root report and this manifest itself",files:manifest,total_bytes:manifest.reduce((count,file)=>count+file.bytes,0)});
console.log(JSON.stringify({status:"passed",final_cases:finalResults.length,canonical_native_records:recordsById.size,manifest_files:manifest.length}));
