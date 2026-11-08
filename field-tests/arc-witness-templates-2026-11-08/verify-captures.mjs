import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath} from 'node:url';
import {createHash} from 'node:crypto';
import {artifactCliEvidence} from '../../rea-local/scripts/lib/artifact-e2e.mjs';
import {parseEvidence} from '../../rea-local/dist/domain/evidence.js';
import {parseEvidenceBundle} from '../../rea-local/dist/domain/evidenceBundle.js';
import {toolContract} from '../../rea-local/dist/contracts/toolContracts.js';
const directory=path.dirname(fileURLToPath(import.meta.url));
const plan=JSON.parse(await fs.readFile(path.join(directory,'mcp-final-plan.json'),'utf8'));
const target=plan.steps[0].arguments.path;
const sha256='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const countRecords=r=>r.swift_conformances.length+r.swift_dispatch_slots.length+r.relative_pointers.length+(r.swift_resilient_witnesses?.length??0)+(r.swift_witness_templates??[]).reduce((n,t)=>n+1+t.entries.length+t.conditional_requirements.length+t.conditional_packs.length,0)+(r.swift_conformance_discovery?.unresolved_records??[]).reduce((n,x)=>n+1+x.relative_pointers.length,0);
const checks=[];
for(const step of plan.steps.filter(x=>x.name==='inspect_native_dispatch_metadata')){
  const input=step.arguments;
  const args=['--facet','swift-conformances','--max-file-bytes',String(input.max_file_bytes),'--max-records',String(input.max_records)];
  if(input.swift_conformance_address)args.push('--swift-conformance-address',input.swift_conformance_address);
  const filter=input.swift_conformance_filter;
  if(filter?.protocol_name)args.push('--swift-protocol-name',filter.protocol_name);
  if(filter?.type_name)args.push('--swift-type-name',filter.type_name);
  const cli=parseEvidence(await artifactCliEvidence('inspect-native-dispatch-metadata',target,args));
  toolContract(step.name).outputSchema.parse(cli);
  await fs.writeFile(path.join(directory,step.label+'.cli.evidence.json'),JSON.stringify(cli,null,2)+'\n');
  const mcp=parseEvidence(JSON.parse(await fs.readFile(path.join(directory,'mcp-final',step.label+'.evidence.json'),'utf8')));
  assert.equal(cli.subject.digest.sha256,sha256);
  assert.deepEqual(cli.subject,mcp.subject);
  assert.deepEqual(cli.parameters,mcp.parameters);
  assert.deepEqual(cli.normalized_result,mcp.normalized_result);
  const r=mcp.normalized_result.result;
  assert.ok(countRecords(r)<=input.max_records);
  if(step.label==='editor-ui'){
    assert.equal(r.swift_conformances[0].type_name,'BoostsEditorWindowContent');
    assert.equal(r.swift_dispatch_slots.length,76);
    assert.deepEqual(r.swift_witness_templates,[]);
  } else {
    assert.deepEqual(r.swift_dispatch_slots,[]);
    assert.equal(r.swift_witness_templates.length,1);
    const t=r.swift_witness_templates[0];
    assert.equal(t.conformance.address,'0x10378c760');
    assert.equal(t.pattern.address,'0x10431acb8');
    assert.equal(t.template_words,4);
    assert.equal(t.extent_source,'generic_control');
    assert.equal(t.runtime_witness_table,'not_observed');
    assert.equal(t.private_data.file_offset,null);
    assert.equal(t.decode.status,'partial');
    if(input.max_records===10){
      assert.equal(t.entries.length,0);
      assert.match(t.decode.reason,/max_records_reached/);
    } else {
      assert.deepEqual(t.entries.map(e=>[e.word_index,e.kind,e.target.address]),[[1,'hole',null],[2,'async_descriptor','0x10378c758'],[3,'function','0x1012fa5e0']]);
      assert.equal(t.entries[1].requirement_flags,0x31);
      assert.equal(t.entries[2].requirement_flags,0x13);
    }
  }
  checks.push({label:step.label,cli_evidence_id:cli.evidence_id,mcp_evidence_id:mcp.evidence_id,subject_parameters_normalized_equal:true,aggregate_records:countRecords(r)});
}
const owned='/var/folders/6w/_phhjy192k51xm2k7dl_vzvr0000gn/T/rea-arc-generic-witness-_rw1oliv/OwnedGenericWitness.dylib';
const ownedHash=createHash('sha256').update(await fs.readFile(owned)).digest('hex');
assert.equal(ownedHash,'c3c86ca90b8ffbca450cd0bc21b2e968d9e45fd55261616d02fa9d39f42145c8');
const original=parseEvidence(await artifactCliEvidence('inspect-native-dispatch-metadata',owned,['--facet','swift-conformances','--swift-type-name','OwnedAdaptor']));
toolContract('inspect_native_dispatch_metadata').outputSchema.parse(original);
await fs.writeFile(path.join(directory,'original-owned.cli.evidence.json'),JSON.stringify(original,null,2)+'\n');
const t=original.normalized_result.result.swift_witness_templates[0];
assert.equal(t.template_words,3);
assert.equal(t.extent_source,'local_protocol');
assert.deepEqual(t.entries.map(e=>[e.kind,e.target.address]),[['async_descriptor','0xfc8'],['function','0xa50']]);
assert.equal(original.normalized_result.result.swift_dispatch_slots.length,0);
const summary=JSON.parse(await fs.readFile(path.join(directory,'mcp-final/summary.json'),'utf8'));
assert.equal(summary.status,'completed');assert.equal(summary.errors,0);
assert.equal(summary.verifier_run.process_lineage.status,'verified');
assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
const bundle=parseEvidenceBundle(JSON.parse(await fs.readFile(path.join(directory,'mcp-final/evidence-bundle.json'),'utf8')));
for(const c of checks)assert.ok(bundle.records.some(r=>r.evidence_id===c.mcp_evidence_id));
const receipt={status:'passed',checked_at:new Date().toISOString(),target_executed:false,target_sha256:sha256,comparison_scope:'Canonical Evidence authentication; equal subjects, parameters and normalized results across compiled CLI/MCP. No full-Evidence equality assertion.',checks,original_owned:{sha256:ownedHash,evidence_id:original.evidence_id,template_words:t.template_words,entries:t.entries.map(e=>({word_index:e.word_index,kind:e.kind,target:e.target}))},bundle_records:bundle.records.length,cleanup:summary.verifier_run};
await fs.writeFile(path.join(directory,'verification.json'),JSON.stringify(receipt,null,2)+'\n');
console.log(JSON.stringify({status:receipt.status,comparisons:checks.length,bundle_records:bundle.records.length,original_owned:'passed'}));
