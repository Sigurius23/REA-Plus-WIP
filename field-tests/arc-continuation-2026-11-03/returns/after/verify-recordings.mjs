import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { execFileSync } from 'node:child_process';
const out = path.dirname(fileURLToPath(import.meta.url));
const repo = path.resolve(out, '../../../..');
const pkg = path.join(repo, 'rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const read = async p => JSON.parse(await fs.readFile(p, 'utf8'));
const evidence = async (dir, name) => parseEvidence(await read(path.join(out, dir, name + '.evidence.json')));
const sha = bytes => createHash('sha256').update(bytes).digest('hex');
const stages = [], successes = [], errors = [];
for (const directory of ['.', 'session', 'traces']) {
  const dir = path.join(out, directory), catalog = await read(path.join(dir, 'catalog.json'));
  const calls = await read(path.join(dir, 'invocations.json'));
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  for (const call of calls) {
    assert.equal(call.thrown, null);
    const advertised = catalog.find(t => t.name === call.name); assert.ok(advertised);
    assert.ok(ajv.validateSchema(advertised.inputSchema));
    assert.ok(ajv.validate(advertised.inputSchema, call.arguments), JSON.stringify(ajv.errors));
    const reply = await read(path.join(dir, call.reply));
    if (call.is_error) {
      assert.equal(reply.isError, true);
      const error = JSON.parse(reply.content.find(x => x.type === 'text').text).error;
      errors.push({ directory, reply: call.reply, code: error.code, message: error.message, details: error.details });
      continue;
    }
    assert.notEqual(reply.isError, true);
    const value = reply.structuredContent;
    assert.ok(ajv.validateSchema(advertised.outputSchema));
    assert.ok(ajv.validate(advertised.outputSchema, value), JSON.stringify(ajv.errors));
    toolContract(call.name).outputSchema.parse(value);
    assert.deepEqual(JSON.parse(reply.content.find(c => c.type === 'text').text), value);
    if (value.evidence_id) successes.push(parseEvidence(value).evidence_id);
  }
  const summary = await read(path.join(dir, 'summary.json'));
  assert.equal(summary.verifier_run.process_lineage.status, 'verified');
  assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
  stages.push({ directory, calls: summary.calls, successful: summary.successful, errors: summary.errors, status: summary.status, verifier_run: summary.verifier_run });
}
assert.equal(stages.at(-1).status, 'completed'); assert.equal(stages.at(-1).errors, 0);
assert.deepEqual(errors.map(e => e.code), ['resource_constraint', 'invalid_request']);
assert.equal(errors[0].details.reported_limits.boundary, 'mcp-response');
assert.match(errors[1].details.issues[0].message, /Multiple modules have path/);
const bundleFiles = ['session/producer-evidence-bundle.json', 'traces/evidence-bundle.json'];
const bundles = [];
for (const file of bundleFiles) {
  const bytes = await fs.readFile(path.join(out, file));
  const value = parseEvidenceBundle(JSON.parse(bytes));
  bundles.push({ path: file, bytes: bytes.length, sha256: sha(bytes), records: value.records.length, value });
}
const finalIds = new Set(bundles.at(-1).value.records.map(e => e.evidence_id));
for (const id of successes) assert.ok(finalIds.has(id), 'Success absent from final complete export: ' + id);
assert.ok(finalIds.has(errors[0].details.reported_limits.evidence_id));
const traceStats = n => ({ nodes: n.nodes.length, relations: n.relations.length, candidates: n.relations.filter(r => r.resolution === 'candidate').length, unknowns: n.unknowns.length, expected_sinks: n.expected_match_node_ids.length });
const known = await evidence('session', 'known-analysis');
const old = parseEvidence(await read(path.join(out, '../known/analysis.evidence.json')));
assert.equal(known.normalized_result.root_artifact_sha256, old.normalized_result.root_artifact_sha256);
const returnShapeFacts = application => application.normalized_result.graph.nodes.flatMap(n => n.observations).filter(o => o.properties.semantic_role === 'export-return-shapes').map(o => o.properties);
assert.deepEqual(returnShapeFacts(known), returnShapeFacts(old));
const newArrows = await evidence('session', 'arrows-unknown-analysis');
const oldArrows = parseEvidence(await read(path.join(out, '../fixture-analysis.evidence.json')));
assert.deepEqual(returnShapeFacts(newArrows), returnShapeFacts(oldArrows));
const knownGraph = known.normalized_result.semantic_graph;
const knownOutput = knownGraph.nodes.find(n => n.kind === 'property-slot' && n.properties.return_site_id !== undefined);
assert.ok(knownOutput);
const knownBytes = await fs.readFile(path.join(out, '../fixture-known/known.js'));
assert.equal(knownOutput.identity.artifact_sha256, sha(knownBytes));
const sourceSlice = (text, range) => {
  const lines = text.split('\n');
  assert.equal(range.start.line, range.end.line);
  return lines[range.start.line - 1].slice(range.start.column, range.end.column);
};
assert.equal(sourceSlice(knownBytes.toString('utf8'), knownOutput.identity.source_range), 'output: input.value');
const knownReadEdge = knownGraph.relations.find(r => r.target_node_id === knownOutput.node_id && r.relation === 'defines');
assert.ok(knownReadEdge);
const knownRead = knownGraph.nodes.find(n => n.node_id === knownReadEdge.source_node_id);
assert.equal(sourceSlice(knownBytes.toString('utf8'), knownRead.identity.source_range), 'input.value');
const oldTrace = await evidence('session', 'legacy-field-forward');
assert.deepEqual(oldTrace, parseEvidence(await read(path.join(out, '../known/field-forward.evidence.json'))));
assert.ok(!old.normalized_result.semantic_graph.nodes.some(n => n.properties.return_site_id !== undefined));
const knownTrace = await evidence('traces', 'known-field-forward');
assert.deepEqual(traceStats(knownTrace.normalized_result), { nodes: 4, relations: 3, candidates: 0, unknowns: 0, expected_sinks: 1 });
const cli = parseEvidence(await read(path.join(out, 'cli-known.evidence.json')));
assert.deepEqual(cli, knownTrace); assert.equal((await fs.readFile(path.join(out, 'cli-known.stderr.log'))).length, 0);
const positiveNames = ['arrow-explicit', 'arrow-implicit', 'nested'];
const negativeNames = ['overwrite', 'spread', 'computed-unknown', 'computed-literal', 'getter-output', 'getter-input', 'mutation', 'prototype', 'transform', 'call-transform'];
const controls = await evidence('session', 'controls-analysis');
const cg = controls.normalized_result.semantic_graph;
assert.equal(cg.coverage.truncated, false); assert.equal(cg.coverage.omitted_nodes, 0); assert.equal(cg.coverage.omitted_relations, 0);
const cases = [];
for (const name of [...positiveNames, ...negativeNames]) {
  const e = await evidence('traces', 'control-' + name + '-forward');
  const n = e.normalized_result, positive = positiveNames.includes(name);
  assert.equal(n.expected_match_node_ids.length, positive ? 1 : 0);
  assert.ok(n.relations.every(r => r.resolution === 'resolved'));
  const fields = cg.nodes.filter(node => node.identity.module_path === name + '.js' && node.properties.return_site_id !== undefined);
  assert.equal(fields.length, 1);
  cases.push({ name, positive, evidence_id: e.evidence_id, ...traceStats(n), field: fields[0] });
}
assert.equal(cases.find(c => c.name === 'nested').field.properties.property_pointer, '/a~1b~0c');
for (const name of ['computed-literal', 'getter-output', 'transform', 'call-transform'])
  assert.equal(cases.find(c => c.name === name).field.properties.source_status, 'unsupported');
for (const name of ['spread', 'computed-unknown'])
  assert.equal(cases.find(c => c.name === name).field.properties.source_status, 'ambiguous');
for (const name of ['getter-input', 'mutation', 'prototype']) {
  const field = cases.find(c => c.name === name).field;
  assert.equal(field.properties.value_status, 'unknown');
  assert.ok(cg.unknowns.some(u => u.node_id === field.node_id));
  assert.ok(!cg.relations.some(r => r.target_node_id === field.node_id && r.relation === 'defines' && r.resolution === 'resolved'));
}
for (const name of ['overwrite', 'spread', 'computed-unknown', 'computed-literal', 'getter-output', 'transform', 'call-transform']) {
  const field = cases.find(c => c.name === name).field;
  const incoming = cg.relations.filter(r => r.target_node_id === field.node_id && r.relation === 'defines');
  const nodes = new Map(cg.nodes.map(n => [n.node_id, n]));
  assert.ok(incoming.every(r => !nodes.get(r.source_node_id)?.label.startsWith('read:')));
}
const unknownArrows = [];
for (const form of ['explicit', 'implicit']) {
  const d = await evidence('traces', 'unknown-' + form + '-backward-default');
  const c = await evidence('traces', 'unknown-' + form + '-backward-candidates');
  assert.ok(d.normalized_result.relations.every(r => r.resolution === 'resolved'));
  assert.ok(c.normalized_result.relations.some(r => r.resolution === 'candidate' && r.relation === 'defines'));
  assert.ok(d.normalized_result.unknowns.length > 0 && c.normalized_result.unknowns.length > 0);
  unknownArrows.push({ form, default: { evidence_id: d.evidence_id, ...traceStats(d.normalized_result) }, opt_in: { evidence_id: c.evidence_id, ...traceStats(c.normalized_result) } });
}
const arcSummary = await evidence('session', 'arc-analysis');
const arc = bundles[0].value.records.find(r => r.evidence_id === arcSummary.normalized_result.parent_evidence_id); assert.ok(arc);
const arcOld = parseEvidenceBundle(await read(path.join(repo, 'field-tests/arc-retest-2026-11-02/javascript/evidence-bundle.json'))).records.find(e => e.evidence_id === 'ev_2b912b006e85b86dad751b5e7bad554cbed02c7df215ac4379748a0bd400f44b');
assert.equal(arc.normalized_result.root_artifact_sha256, arcOld.normalized_result.root_artifact_sha256);
assert.equal(arc.normalized_result.statistics.parsed_javascript_files, 3);
assert.equal(arc.normalized_result.semantic_graph.coverage.truncated, false);
assert.equal(arc.normalized_result.semantic_graph.coverage.omitted_nodes, 0);
assert.equal(arc.normalized_result.semantic_graph.coverage.omitted_relations, 0);
const arcFields = arc.normalized_result.semantic_graph.nodes.filter(n => n.properties.return_site_id !== undefined);
assert.equal(arcFields.length, 21);
const selectorFields = arcFields.filter(n => n.identity.module_path.endsWith('/SelectorPicker.js')); assert.equal(selectorFields.length, 16);
const unsupported = selectorFields.filter(n => ['rect', 'hash'].includes(n.label));
assert.equal(unsupported.length, 2);
for (const field of unsupported) {
  assert.equal(field.properties.source_status, 'unsupported');
  assert.ok(!arc.normalized_result.semantic_graph.relations.some(r => r.target_node_id === field.node_id && r.relation === 'defines'));
}
const arcQueries = [];
for (const label of ['candidate', 'rectangle']) {
  const d = await evidence('traces', 'arc-' + label + '-default'), c = await evidence('traces', 'arc-' + label + '-candidates');
  assert.ok(d.normalized_result.relations.every(r => r.resolution === 'resolved'));
  assert.ok(c.normalized_result.relations.some(r => r.resolution === 'candidate'));
  assert.ok(d.normalized_result.unknowns.length > 0 && c.normalized_result.unknowns.length > 0);
  arcQueries.push({ label, default: { evidence_id: d.evidence_id, ...traceStats(d.normalized_result) }, opt_in: { evidence_id: c.evidence_id, ...traceStats(c.normalized_result) } });
}
const sources = [];
for (const dir of [path.join(out, '../fixture-known'), path.join(out, '../fixture'), path.join(out, 'fixture-controls')]) {
  for (const name of (await fs.readdir(dir)).filter(n => n.endsWith('.js')).sort()) {
    const file = path.join(dir, name), bytes = await fs.readFile(file);
    sources.push({ path: path.relative(repo, file), bytes: bytes.length, sha256: sha(bytes) });
  }
}
for (const node of arc.normalized_result.graph.nodes.filter(n => n.kind === 'javascript-asset')) {
  const relative = node.observations.find(o => typeof o.properties.path === 'string').properties.path;
  const file = path.join('/Applications/Arc.app/Contents/Resources', relative), bytes = await fs.readFile(file);
  assert.equal(sha(bytes), node.identity.sha256);
  sources.push({ path: file, bytes: bytes.length, sha256: sha(bytes) });
}
const producerFiles = ['src/domain/javascript/javascriptSemanticIr.ts', 'src/domain/javascript/javascriptSemanticValues.ts', 'src/domain/javascript/javascriptSemanticReturns.ts', 'src/javascript/analysis/JavaScriptAnalysisWorkerSchemas.ts', 'src/application/javascript/JavaScriptSemanticGraphReturnProjection.ts', 'src/domain/javascript/javascriptSemanticQuery.ts', 'dist/domain/javascript/javascriptSemanticValues.js', 'dist/application/javascript/JavaScriptSemanticGraphReturnProjection.js', 'dist/javascript/analysis/JavaScriptAnalysisWorkerSchemas.js'];
const producer = [];
for (const relative of producerFiles) producer.push({ path: relative, sha256: sha(await fs.readFile(path.join(pkg, relative))) });
const receipt = {
  status: 'passed', checked_at: new Date().toISOString(), head: execFileSync('git', ['rev-parse', 'HEAD'], { cwd: repo, encoding: 'utf8' }).trim(), node: process.version,
  mcp_calls: stages.reduce((s, n) => s + n.calls, 0), mcp_successful: stages.reduce((s, n) => s + n.successful, 0), retained_caller_boundary_errors: errors,
  stages, bundles: bundles.map(({ value, ...rest }) => rest), complete_export_covers_all_successful_evidence: true,
  cli_outputs: 1, exact_cli_mcp_evidence_id: cli.evidence_id, legacy: { original_parent: old.evidence_id, exact_trace: oldTrace.evidence_id, no_backfilled_fields: true },
  known: { parent: known.evidence_id, trace: knownTrace.evidence_id, ...traceStats(knownTrace.normalized_result) }, controls: cases, unknown_arrows: unknownArrows,
  arc: { parent: arc.evidence_id, summary: arcSummary.evidence_id, files: 3, return_fields: arcFields.length, selector_return_fields: selectorFields.length, queries: arcQueries, unsupported_callback_outputs: unsupported.map(n => ({ node_id: n.node_id, label: n.label, properties: n.properties })) },
  sources, producer_files_at_verification: producer,
  scope: [
    'Inert static analysis only. No Arc/fixture JavaScript, UI, DOM, profile, account, endpoint or service execution.',
    'New field slots and direct source-expression contributions are projected from newly produced owning IR. Old imported Evidence is not backfilled.',
    'A source_status complete marker means the direct selected expression is retained; unknown values still use candidate defines relations, excluded by default.',
    'Arithmetic/call transforms and computed output keys have no invented copied-value edge. Existing coarse candidate aliases are unchanged.',
    'Historical worker IR omission is pinned by source tests; the public module item is graph metadata and does not expose the complete worker IR.',
    'Arc DOM-dependent values, call transformations, unsupported nested output expressions and runtime rendering remain explicit unknowns.',
    'The first response-budget attempt and the caller path-ambiguity mistake are retained and recovered through summary/export and exact returned node IDs; they are not counted as successful calls.'
  ]
};
await fs.writeFile(path.join(out, 'verification-receipt.json'), JSON.stringify(receipt, null, 2) + '\n');
console.log(JSON.stringify({ status: receipt.status, mcp_calls: receipt.mcp_calls, mcp_successful: receipt.mcp_successful, retained_boundary_errors: errors.length, final_bundle_records: bundles.at(-1).records, known: receipt.known, positive_controls: positiveNames.length, negative_controls: negativeNames.length, arc_parent: arc.evidence_id, cli_exact: cli.evidence_id }));
