import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import {fileURLToPath,pathToFileURL} from 'node:url';
const root=path.dirname(fileURLToPath(import.meta.url));
const pkg=path.resolve(root,'../../../rea-local');
const req=createRequire(path.join(pkg,'package.json'));
const {Ajv2020}=await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const {toolContract}=await import(pathToFileURL(path.join(pkg,'dist/contracts/toolContracts.js')));
const {parseEvidence}=await import(pathToFileURL(path.join(pkg,'dist/domain/evidence.js')));
const {parseEvidenceBundle}=await import(pathToFileURL(path.join(pkg,'dist/domain/evidenceBundle.js')));
const read=async p=>JSON.parse(await fs.readFile(p,'utf8'));
const sha=bytes=>createHash('sha256').update(bytes).digest('hex');
const stages=[];
for(const name of ['.','known']){
 const dir=path.resolve(root,name);
 const catalog=await read(path.join(dir,'catalog.json'));
 const calls=await read(path.join(dir,'invocations.json'));
 const ajv=new Ajv2020({strict:false,validateFormats:false});
 const evidenceIds=[];
 for(const call of calls){
  assert.equal(call.thrown,null);assert.equal(call.is_error,false);
  const advertised=catalog.find(t=>t.name===call.name);assert.ok(advertised);
  assert.ok(ajv.validate(advertised.inputSchema,call.arguments),JSON.stringify(ajv.errors));
  const reply=await read(path.join(dir,call.reply));
  assert.equal(reply.isError===true,false);
  const value=reply.structuredContent;
  assert.ok(ajv.validate(advertised.outputSchema,value),JSON.stringify(ajv.errors));
  toolContract(call.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find(c=>c.type==='text').text),value);
  if(value.evidence_id)evidenceIds.push(parseEvidence(value).evidence_id);
 }
 const file=path.join(dir,'evidence-bundle.json');
 const bundle=parseEvidenceBundle(await read(file));
 const summary=await read(path.join(dir,'summary.json'));
 assert.equal(summary.status,'completed');assert.equal(summary.errors,0);
 assert.equal(summary.verifier_run.process_lineage.status,'verified');
 assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);
 stages.push({directory:name,calls:calls.length,new_evidence_ids:evidenceIds,bundle_records:bundle.records.length,bundle_sha256:sha(await fs.readFile(file)),verifier_run:summary.verifier_run});
}
const cli=parseEvidence(await read(path.join(root,'cli-field.evidence.json')));
const mcp=parseEvidence(await read(path.join(root,'explicit-field-forward.evidence.json')));
assert.deepEqual(cli,mcp);
const first=parseEvidence(await read(path.join(root,'fixture-analysis.evidence.json')));
const known=parseEvidence(await read(path.join(root,'known/analysis.evidence.json')));
const knownForward=parseEvidence(await read(path.join(root,'known/field-forward.evidence.json')));
assert.equal(knownForward.normalized_result.nodes.length,2);
assert.equal(knownForward.normalized_result.relations.length,1);
assert.deepEqual(knownForward.normalized_result.unknowns,[]);
assert.deepEqual(knownForward.normalized_result.expected_match_node_ids,[]);
const shapes=known.normalized_result.graph.nodes.flatMap(n=>n.observations).filter(o=>o.properties.semantic_role==='export-return-shapes');
assert.equal(shapes.length,1);
assert.deepEqual(shapes[0].properties.static_return_shapes[0].fields,[{path:'/output',presence:'present',state:'literal',value:'known',reason:null}]);
const sources=[];
for(const relative of ['fixture/returns.js','fixture-known/known.js']){
 const source=await fs.readFile(path.join(root,relative));
 const parent=relative.startsWith('fixture-known')?known:first;
 const sourceHash=sha(source);
 assert.ok(parent.normalized_result.semantic_graph.nodes.every(n=>n.identity.artifact_sha256===sourceHash));
 sources.push({path:relative,bytes:source.length,sha256:sourceHash});
}
const producerSources=[];
for(const relative of ['src/domain/javascript/javascriptSemanticReturns.ts','src/domain/javascript/javascriptSemanticCallableResults.ts','src/domain/javascript/javascriptSemanticQuery.ts','src/domain/javascript/javascriptSemanticQuerySchemas.ts','src/application/javascript/JavaScriptSemanticGraphFlowProjection.ts','src/application/javascript/JavaScriptSemanticGraphBuilder.ts','src/domain/javascript/javascriptExportReturnShapeProjection.ts'])producerSources.push({path:relative,sha256:sha(await fs.readFile(path.join(pkg,relative)))});
const receipt={status:'passed',mcp_calls:stages.reduce((a,s)=>a+s.calls,0),mcp_successful:stages.reduce((a,s)=>a+s.calls,0),cli_outputs:1,cli_mcp_exact_evidence_id:cli.evidence_id,stages,sources,producer_sources_at_review:producerSources,classification:{previous_zero_edge_queries:'candidate relations excluded by default; not missing return sites',return_shapes:'explicit/implicit exported arrows retain output own-property inventory',arc_dom_boundary:'still unknown; candidate traversal does not resolve DOM calls or rendering',field_sensitive_return_flow:'not represented: known local input.value read does not reach a return field/aggregate even with candidates; exported shape independently retains literal known'},limits:['Static inference only; no Arc, fixture JavaScript, DOM, UI, profile, endpoint or service execution.','Known field-forward trace has no matching return-site sink; this is a companion graph projection limit, not absence of the known returned property.','Public producer and trace Evidence remain unchanged; no source implementation or shared registry changes were made.']};
await fs.writeFile(path.join(root,'verification-receipt.json'),JSON.stringify(receipt,null,2)+'\n');
console.log(JSON.stringify({status:receipt.status,mcp_calls:receipt.mcp_calls,cli_exact:cli.evidence_id,bundle_records:stages.map(s=>s.bundle_records)}));
