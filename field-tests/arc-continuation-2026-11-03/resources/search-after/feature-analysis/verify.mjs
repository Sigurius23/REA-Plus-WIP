import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const root = path.dirname(fileURLToPath(import.meta.url));
const searchRoot = path.dirname(root);
const pkg = path.resolve(root, '../../../../../rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const { javascriptApplicationAnalysisResultSchema } = await import(pathToFileURL(path.join(pkg, 'dist/domain/javascript/javascriptApplicationAnalysis.js')));
const read = async p => JSON.parse(await fs.readFile(p, 'utf8'));
const hash = b => createHash('sha256').update(b).digest('hex');
const calls = await read(path.join(root, 'invocations.json'));
const catalog = await read(path.join(root, 'catalog.json'));
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const call of calls) {
  const tool = catalog.find(t => t.name === call.name);
  assert.ok(tool);
  assert.ok(ajv.validate(tool.inputSchema, call.arguments), JSON.stringify(ajv.errors));
  assert.equal(call.is_error, false);
  assert.equal(call.thrown, null);
  const reply = await read(path.join(root, call.reply));
  assert.notEqual(reply.isError, true);
  assert.ok(ajv.validate(tool.outputSchema, reply.structuredContent), JSON.stringify(ajv.errors));
  toolContract(call.name).outputSchema.parse(reply.structuredContent);
  assert.deepEqual(JSON.parse(reply.content.find(b => b.type === 'text').text), reply.structuredContent);
  if (reply.structuredContent.evidence_id) parseEvidence(reply.structuredContent);
}
const summary = await read(path.join(root, 'summary.json'));
assert.equal(summary.calls, 6);
assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, 'verified');
assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const bundles = [];
for (const name of ['initial-evidence-bundle.json', 'evidence-bundle.json']) {
  const bytes = await fs.readFile(path.join(root, name));
  const bundle = parseEvidenceBundle(JSON.parse(bytes));
  bundles.push({ file: name, records: bundle.records.length, bytes: bytes.length, sha256: hash(bytes) });
}
const final = parseEvidenceBundle(await read(path.join(root, 'evidence-bundle.json')));
const parent = final.records.find(e => e.evidence_id === 'ev_682b71d8ff5cbe32bfac2ca4d92963a4661ef4e59e0bc3b4c9abbd0d015911c5');
assert.ok(parent);
const app = javascriptApplicationAnalysisResultSchema.parse(parent.normalized_result);
assert.equal(app.statistics.relevant_files, 3);
assert.equal(app.statistics.parsed_javascript_files, 3);
assert.equal(app.statistics.text_bytes_read, 5116);
assert.equal(app.statistics.visited_ast_nodes, 932);
assert.equal(app.statistics.parse_failures, 0);
assert.equal(app.semantic_graph.nodes.length, 611);
assert.equal(app.semantic_graph.relations.length, 388);
assert.equal(app.semantic_graph.unknowns.length, 219);
assert.equal(app.semantic_graph.coverage.omitted_nodes, 0);
assert.equal(app.semantic_graph.coverage.omitted_relations, 0);
const provenance = await read(path.join(searchRoot, 'materialization-provenance.json'));
const inspect = catalog.find(t => t.name === 'inspect_chromium_resources');
for (const source of provenance) {
  const evidence = parseEvidence(await read(path.join(searchRoot, source.evidence_file)));
  assert.ok(ajv.validate(inspect.outputSchema, evidence), JSON.stringify(ajv.errors));
  toolContract('inspect_chromium_resources').outputSchema.parse(evidence);
  assert.equal(evidence.evidence_id, source.evidence_id);
  const r = evidence.normalized_result.resource;
  assert.deepEqual(r.entry, source.entry);
  const bytes = await fs.readFile(source.local_path);
  assert.equal(hash(bytes), source.decoded.sha256);
  assert.equal(bytes.length, source.decoded.bytes);
  assert.deepEqual(bytes, Buffer.from(r.bytes_hex, 'hex'));
  const filename = path.basename(source.local_path);
  const nodes = app.semantic_graph.nodes.filter(n => n.identity.module_path === filename);
  assert.ok(nodes.length > 0);
  assert.ok(nodes.every(n => n.identity.artifact_sha256 === source.decoded.sha256));
}
const ownedCli = parseEvidence(await read(path.join(searchRoot, 'owned-byte-search.cli.evidence.json')));
assert.deepEqual(ownedCli, parseEvidence(await read(path.join(searchRoot, 'owned-byte-search.evidence.json'))));
const traces = [];
for (const name of ['docs-trigger-callers', 'internal-injection-backward', 'slack-theme-forward']) {
  const e = parseEvidence(await read(path.join(root, `${name}.evidence.json`)));
  assert.ok(final.records.some(r => r.evidence_id === e.evidence_id));
  assert.equal(e.normalized_result.source_evidence_id, parent.evidence_id);
  assert.equal(e.normalized_result.coverage.status, 'partial');
  traces.push({ file: `${name}.evidence.json`, evidence_id: e.evidence_id, status: e.normalized_result.status, summary: e.normalized_result.summary, coverage: e.normalized_result.coverage });
}
const receipt = { status: 'passed', observed_at: new Date().toISOString(), calls: calls.length, tools: catalog.length, bundles, verifier_run: summary.verifier_run, parent_evidence_id: parent.evidence_id, statistics: app.statistics, semantic: { nodes: app.semantic_graph.nodes.length, relations: app.semantic_graph.relations.length, unknowns: app.semantic_graph.unknowns.length, coverage: app.semantic_graph.coverage.status }, materialized_sources: provenance.map(s => ({ resource_id: s.entry.resource_id, evidence_id: s.evidence_id, original_pack: s.pack, original_entry: s.entry, local_path: s.local_path, decoded: s.decoded })), owned_cli_mcp_evidence_equal: ownedCli.evidence_id, traces, caveats: ['Three selected decoded payloads are the complete current JS input; source and semantic coverage do not establish complete Arc app behavior.', 'The local .js filenames are explicit analyst choices. Matching embedded source references support feature attribution but do not recover a numeric-ID-to-original-filename registry.', 'All three traces are partial; source interpretation of browser APIs, dynamic property selection and generated eval text is supplemental and does not fill missing automatic graph paths.'] };
await fs.writeFile(path.join(root, 'verification-receipt.json'), JSON.stringify(receipt, null, 2) + '\n');
console.log(JSON.stringify({ status: receipt.status, calls: receipt.calls, sources: provenance.length, traces: traces.length }));
