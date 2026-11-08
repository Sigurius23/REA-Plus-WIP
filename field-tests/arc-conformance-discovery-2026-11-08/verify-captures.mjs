import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import {fileURLToPath} from 'node:url';
import path from 'node:path';
import {artifactCliEvidence} from '../../rea-local/scripts/lib/artifact-e2e.mjs';
import {parseEvidence} from '../../rea-local/dist/domain/evidence.js';
import {parseEvidenceBundle} from '../../rea-local/dist/domain/evidenceBundle.js';
import {toolContract} from '../../rea-local/dist/contracts/toolContracts.js';
const directory=path.dirname(fileURLToPath(import.meta.url));
const plan=JSON.parse(await fs.readFile(path.join(directory,'mcp-final-plan.json'),'utf8'));
const target=plan.steps[0].arguments.path;
const sha256='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const checks=[];
for(const step of plan.steps.filter(({name})=>name==='inspect_native_dispatch_metadata')){
  const input=step.arguments;
  const args=['--facet','swift-conformances','--max-file-bytes',String(input.max_file_bytes),'--max-records',String(input.max_records)];
  const filter=input.swift_conformance_filter;
  if(filter.protocol_name)args.push('--swift-protocol-name',filter.protocol_name);
  if(filter.type_name)args.push('--swift-type-name',filter.type_name);
  const cli=parseEvidence(await artifactCliEvidence('inspect-native-dispatch-metadata',target,args));
  toolContract(step.name).outputSchema.parse(cli);
  await fs.writeFile(path.join(directory,step.label+'.cli.evidence.json'),JSON.stringify(cli,null,2)+'\n');
  const mcp=parseEvidence(JSON.parse(await fs.readFile(path.join(directory,'mcp-final',step.label+'.evidence.json'),'utf8')));
  assert.equal(cli.subject.digest.sha256,sha256);
  assert.deepEqual(cli.subject,mcp.subject);
  assert.deepEqual(cli.parameters,mcp.parameters);
  assert.deepEqual(cli.normalized_result,mcp.normalized_result);
  const result=mcp.normalized_result.result;
  const discovery=result.swift_conformance_discovery;
  assert.equal(discovery.index_entries,22066);
  assert.equal(discovery.examined,22066);
  const expected={
    'ui-protocol':[2,2,['0x103744f38','0x10378a2a0']],
    'adaptor-protocol':[1,1,['0x10378c760']],
    'editor-type':[4,4,null],
    'editor-and-protocol':[1,1,['0x10378a2a0']],
    'absent-type':[0,0,[]],
    'ui-protocol-budget-16':[2,1,['0x103744f38']],
  }[step.label];
  assert.equal(discovery.matched,expected[0]);
  assert.equal(discovery.admitted,expected[1]);
  if(expected[2])assert.deepEqual(result.swift_conformances.map(({location})=>location.address),expected[2]);
  assert.equal(result.coverage.find(({facet})=>facet==='swift_conformance_index_discovery').status,'partial');
  assert.ok(discovery.unresolved>0,'Unresolved imports/layouts must not become an absence claim');
  const admitted=result.swift_conformances.length+result.relative_pointers.length+result.swift_dispatch_slots.length+(result.swift_resilient_witnesses?.length??0)+discovery.unresolved_records.reduce((n,x)=>n+1+x.relative_pointers.length,0);
  assert.ok(admitted<=input.max_records,`${step.label}: ${admitted} > ${input.max_records}`);
  checks.push({label:step.label,cli_evidence_id:cli.evidence_id,mcp_evidence_id:mcp.evidence_id,subject_parameters_normalized_equal:true,index_entries:discovery.index_entries,examined:discovery.examined,matched:discovery.matched,admitted:discovery.admitted,unresolved:discovery.unresolved,unresolved_retained:discovery.unresolved_records.length,aggregate_records:admitted});
}
const summary=JSON.parse(await fs.readFile(path.join(directory,'mcp-final/summary.json'),'utf8'));
assert.equal(summary.status,'completed');
assert.equal(summary.errors,0);
assert.equal(summary.verifier_run.process_lineage.status,'verified');
assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
const bundle=parseEvidenceBundle(JSON.parse(await fs.readFile(path.join(directory,'mcp-final/evidence-bundle.json'),'utf8')));
for(const check of checks)assert.ok(bundle.records.some(({evidence_id})=>evidence_id===check.mcp_evidence_id));
const receipt={status:'passed',checked_at:new Date().toISOString(),target_sha256:sha256,target_executed:false,comparison_scope:'Canonical Evidence authentication; equal subjects, parameters and normalized results across compiled CLI/MCP. No assertion of full Evidence identity equality.',bundle_records:bundle.records.length,checks,cleanup:summary.verifier_run};
await fs.writeFile(path.join(directory,'verification.json'),JSON.stringify(receipt,null,2)+'\n');
console.log(JSON.stringify({status:receipt.status,comparisons:checks.length,bundle_records:bundle.records.length}));
