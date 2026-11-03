import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';

// Recorder/range validation only. It does not rerun an analysis producer.
const here = path.dirname(fileURLToPath(import.meta.url));
const root = path.dirname(here);
const repo = path.resolve(root, '../../..');
const pkg = path.join(repo, 'rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const { javascriptApplicationAnalysisResultSchema } = await import(pathToFileURL(path.join(pkg, 'dist/domain/javascript/javascriptApplicationAnalysis.js')));
const read = async (p) => JSON.parse(await fs.readFile(p, 'utf8'));
const hash = (input) => createHash('sha256').update(input).digest('hex');
const save = (p, value) => fs.writeFile(p, JSON.stringify(value, null, 2) + '\n');
async function expanded(value) {
  if (Array.isArray(value)) return Promise.all(value.map(expanded));
  if (value && typeof value === 'object') {
    if ('$json_file' in value) {
      let result = await read(value.$json_file);
      for (const key of value.select ?? []) result = result[key];
      return result;
    }
    return Object.fromEntries(await Promise.all(Object.entries(value).map(async ([key, item]) => [key, await expanded(item)])));
  }
  return value;
}
const stages = [];
for (const dir of [root, path.join(root, 'post-fix'), here]) {
  const calls = await read(path.join(dir, 'invocations.json'));
  const catalog = await read(path.join(dir, 'catalog.json'));
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  for (const call of calls) {
    const advertised = catalog.find((tool) => tool.name === call.name);
    assert.ok(advertised, call.name);
    const args = await expanded(call.arguments);
    assert.ok(ajv.validate(advertised.inputSchema, args), JSON.stringify(ajv.errors));
    assert.equal(call.thrown, null);
    assert.equal(call.is_error, false);
    const reply = await read(path.join(dir, call.reply));
    assert.notEqual(reply.isError, true);
    const value = reply.structuredContent;
    assert.ok(ajv.validate(advertised.outputSchema, value), JSON.stringify(ajv.errors));
    toolContract(call.name).outputSchema.parse(value);
    assert.deepEqual(JSON.parse(reply.content.find((block) => block.type === 'text').text), value);
    if (value.evidence_id) parseEvidence(value);
  }
  const summary = await read(path.join(dir, 'summary.json'));
  assert.equal(summary.calls, calls.length);
  assert.equal(summary.errors, 0);
  assert.equal(summary.verifier_run.process_lineage.status, 'verified');
  assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
  stages.push({ directory: path.relative(root, dir) || '.', calls: calls.length, successes: calls.length, verifier_run: summary.verifier_run });
}

const bundles = [];
for (const name of ['baseline-evidence-bundle.json', 'second-evidence-bundle.json', 'evidence-bundle.json', 'post-fix/evidence-bundle.json', 'post-fix-feature-traces/evidence-bundle.json']) {
  const file = path.join(root, name);
  const bundle = parseEvidenceBundle(await read(file));
  for (const record of bundle.records) {
    if (record.operation === 'analyze_javascript_application')
      assert.deepEqual(javascriptApplicationAnalysisResultSchema.parse(record.normalized_result), record.normalized_result);
  }
  bundles.push({ path: name, records: bundle.records.length, bytes: (await fs.stat(file)).size, sha256: hash(await fs.readFile(file)) });
}

const beforeBundle = await read(path.join(root, 'baseline-evidence-bundle.json'));
const before = beforeBundle.records.find((record) => record.evidence_id === 'ev_0bb7473227c2bbd3308ed8bc0314c08b913e174a0f6e30d75fe08cc73b5e5b66');
const after = parseEvidence(await read(path.join(root, 'post-fix/arc-pages.evidence.json')));
assert.equal(after.evidence_id, 'ev_e8918659b78760ed5c067ec4ea2cafdd2e51b4d07b05ea2aa14ca54467f952d3');
const application = javascriptApplicationAnalysisResultSchema.parse(after.normalized_result);
assert.equal(before.normalized_result.root_artifact_sha256, application.root_artifact_sha256);
assert.equal(before.normalized_result.statistics.parsed_javascript_files, 0);
assert.equal(before.normalized_result.statistics.visited_ast_nodes, 0);
assert.equal('parsed_inline_scripts' in before.normalized_result.statistics, false);
assert.equal(application.statistics.parsed_javascript_files, 0);
assert.equal(application.statistics.parsed_inline_scripts, 3);
assert.equal(application.statistics.visited_ast_nodes, 222);

const materialization = await read(path.join(root, 'materialization-provenance.json'));
const point = (text, offset) => {
  const lines = text.slice(0, offset).split(/\r\n|\r|\n/u);
  return { line: lines.length, column: lines.at(-1).length };
};
const bodyOffset = (text, location) => {
  const lines = text.split(/\r\n|[\r\n\u2028\u2029]/u);
  assert.ok(location.line >= 1 && location.line <= lines.length);
  assert.ok(location.column >= 0 && location.column <= lines[location.line - 1].length);
  const starts = [0];
  for (const match of text.matchAll(/\r\n|[\r\n\u2028\u2029]/gu)) starts.push(match.index + match[0].length);
  return starts[location.line - 1] + location.column;
};
const bodies = new Map();
for (const node of application.graph.nodes) {
  if (node.kind !== 'javascript-asset') continue;
  for (const observation of node.observations) {
    if (observation.evidence.extractor.operation !== 'derive-html-inline-source') continue;
    const props = observation.properties;
    const origin = props.inline_source;
    assert.ok(origin);
    assert.equal(props.inventory_artifact_id, null);
    assert.equal(origin.offset_encoding, 'utf16-code-units');
    const source = materialization.records.find((record) => path.basename(record.materialized_file) === origin.html_path);
    assert.ok(source);
    const original = parseEvidence(await read(path.resolve(repo, source.source_evidence_file)));
    const raw = Buffer.from(original.normalized_result.resource.bytes_hex, 'hex');
    const html = raw.toString('utf8');
    assert.deepEqual(Buffer.from(html, 'utf8'), raw);
    assert.deepEqual(await fs.readFile(path.join(root, source.materialized_file)), raw);
    assert.equal(hash(raw), origin.html_sha256);
    const body = html.slice(origin.start_offset, origin.end_offset);
    assert.equal(hash(Buffer.from(body, 'utf8')), observation.evidence.artifact.sha256);
    assert.equal(Buffer.byteLength(body), props.bytes);
    assert.deepEqual({ start: point(html, origin.start_offset), end: point(html, origin.end_offset) }, origin.source_range);
    bodies.set(props.path, { body, html, source, origin, body_sha256: observation.evidence.artifact.sha256, body_bytes: props.bytes });
  }
}
assert.equal(bodies.size, 3);
let rangedNodes = 0;
for (const node of application.semantic_graph.nodes) {
  const body = bodies.get(node.identity.module_path);
  assert.ok(body, node.identity.module_path);
  assert.equal(node.identity.artifact_sha256, body.body_sha256);
  const range = node.identity.source_range;
  if (range !== null) {
    assert.ok(bodyOffset(body.body, range.start) <= bodyOffset(body.body, range.end));
    rangedNodes++;
  }
}

const seedProvenance = await read(path.join(here, 'seed-provenance.json'));
const seedRanges = Object.fromEntries(Object.entries(seedProvenance.seeds).map(([key, node]) => {
  const source = bodies.get(node.identity.module_path);
  const start = source.origin.start_offset + bodyOffset(source.body, node.identity.source_range.start);
  const end = source.origin.start_offset + bodyOffset(source.body, node.identity.source_range.end);
  return [key, { node_id: node.node_id, html_path: source.origin.html_path, html_source_range: { start: point(source.html, start), end: point(source.html, end) }, html_utf16_offsets: { start, end }, source_text: key === 'onload' ? null : source.html.slice(start, end) }];
}));
assert.equal(seedRanges.missing.source_text, 'missingExtensions');
assert.equal(seedRanges.theme.source_text, 'themeData');
const rangeAudit = { status: 'passed', parent_evidence_id: after.evidence_id, offset_encoding: 'utf16-code-units', body_digest_encoding: 'UTF-8 original text without newline normalization', semantic_nodes_checked: application.semantic_graph.nodes.length, ranged_semantic_nodes_checked: rangedNodes, bodies: [...bodies.entries()].map(([uri, item]) => ({ logical_uri: uri, body_bytes: item.body_bytes, body_sha256: item.body_sha256, inline_source: item.origin, packed_resource: { evidence_id: item.source.source_evidence_id, pack: item.source.source_pack, entry: item.source.entry, decoded_html_sha256: item.source.decoded_sha256 } })), focused_seed_ranges: seedRanges };
await save(path.join(here, 'source-range-audit.json'), rangeAudit);

const traces = [];
for (const name of ['missing-extensions-forward', 'missing-extensions-backward', 'theme-data-forward', 'onload-callers']) {
  const evidence = parseEvidence(await read(path.join(here, `${name}.evidence.json`)));
  assert.equal(evidence.normalized_result.source_evidence_id, after.evidence_id);
  assert.equal(evidence.normalized_result.coverage.status, 'partial');
  traces.push({ name, evidence_id: evidence.evidence_id, status: evidence.normalized_result.status, summary: evidence.normalized_result.summary, coverage: evidence.normalized_result.coverage });
}
const cli = parseEvidence(await read(path.join(root, 'post-fix/owned-html.cli.evidence.json')));
assert.deepEqual(cli, await read(path.join(root, 'post-fix/owned-html.evidence.json')));
const receipt = { status: 'passed', observed_at: new Date().toISOString(), scope: 'Public captured replies, current and legacy JS records, exact body/HTML maps and retained-parent traces; no producer rerun or target execution by this auditor.', stages, mcp_calls: stages.reduce((n, stage) => n + stage.calls, 0), mcp_successes: stages.reduce((n, stage) => n + stage.successes, 0), bundles, before_html_parent: before.evidence_id, after_html_parent: after.evidence_id, unchanged_input_root_sha256: application.root_artifact_sha256, before_statistics: before.normalized_result.statistics, after_statistics: application.statistics, source_range_audit: 'post-fix-feature-traces/source-range-audit.json', traces, owned_cli_mcp_exact_evidence_id: cli.evidence_id, caveats: ['All four feature traces are partial; getValue, DOM effects, callback dispatch and native theme backend remain unobserved or unresolved.', 'Body source URIs and materialized HTML filenames are analyst/tool logical identities, not recovered resource filenames or runtime URLs.', 'The resource pack range describes compressed bytes; body UTF-16 ranges refer to decoded HTML, not one-to-one compressed offsets.', 'This receipt authenticates five retained bundles including imported/repeated records; bundle record occurrences are not new analysis operations. Source/package gates remain owned by the root follow-up report.'] };
await save(path.join(root, 'verification-receipt.json'), receipt);
console.log(JSON.stringify({ status: receipt.status, calls: receipt.mcp_calls, successes: receipt.mcp_successes, bundles: bundles.length, bodies: bodies.size, ranged_nodes_checked: rangedNodes, seed_ranges: seedRanges }));
