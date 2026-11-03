import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';

const root = path.dirname(fileURLToPath(import.meta.url));
const repo = path.resolve(root, '../../..');
const pkg = path.join(repo, 'rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const { javascriptApplicationAnalysisResultSchema } = await import(pathToFileURL(path.join(pkg, 'dist/domain/javascript/javascriptApplicationAnalysis.js')));
const read = async (p) => JSON.parse(await fs.readFile(p, 'utf8'));
const hash = (bytes) => createHash('sha256').update(bytes).digest('hex');
const save = (p, value) => fs.writeFile(p, JSON.stringify(value, null, 2) + '\n');

const calls = await read(path.join(root, 'invocations.json'));
const catalog = await read(path.join(root, 'catalog.json'));
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const call of calls) {
  const tool = catalog.find((tool) => tool.name === call.name);
  assert.ok(tool);
  assert.ok(ajv.validate(tool.inputSchema, call.arguments), JSON.stringify(ajv.errors));
  assert.equal(call.is_error, false);
  assert.equal(call.thrown, null);
  const reply = await read(path.join(root, call.reply));
  assert.notEqual(reply.isError, true);
  const value = reply.structuredContent;
  assert.ok(ajv.validate(tool.outputSchema, value), JSON.stringify(ajv.errors));
  toolContract(call.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find((item) => item.type === 'text').text), value);
  if (value.evidence_id) parseEvidence(value);
}
const summary = await read(path.join(root, 'summary.json'));
assert.equal(summary.calls, calls.length);
assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, 'verified');
assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const bundles = [];
for (const name of ['initial-evidence-bundle.json', 'views-evidence-bundle.json', 'evidence-bundle.json']) {
  const file = path.join(root, name);
  const bundle = parseEvidenceBundle(await read(file));
  bundles.push({ path: name, records: bundle.records.length, bytes: (await fs.stat(file)).size, sha256: hash(await fs.readFile(file)) });
}
const bundle = await read(path.join(root, 'evidence-bundle.json'));
const parent = parseEvidence(bundle.records.find((record) => record.evidence_id === 'ev_4bd3435d5db25662dfbff419a96fd2fa44ee7d95a395bf8329e31502f5d3afa1'));
const app = javascriptApplicationAnalysisResultSchema.parse(parent.normalized_result);
assert.deepEqual(app.statistics, { relevant_files: 7, nested_asar_containers: 0, text_bytes_read: 480720, invalid_utf8_files: 0, parsed_javascript_files: 3, visited_ast_nodes: 6793, findings: 2, modules: 0, parse_failures: 1, parsed_inline_scripts: 2, paths_scope: { paths_include: ['**/*.js', '**/*.html'], paths_exclude: [], considered_files: 28, selected_files: 7, excluded_files: 21 } });
assert.equal(app.graph.coverage.status, 'partial');
assert.equal(app.semantic_graph.coverage.omitted_nodes, 0);
assert.equal(app.semantic_graph.coverage.omitted_relations, 0);
const selection = await read(path.join(root, 'source-selection.json'));
for (const source of selection.selected_files) {
  const bytes = await fs.readFile(source.path);
  assert.equal(bytes.length, source.bytes);
  assert.equal(hash(bytes), source.sha256);
}

const sourceReview = [];
const point = (text, offset) => {
  const lines = text.slice(0, offset).split(/\r\n|\r|\n/u);
  return { line: lines.length, column: lines.at(-1).length };
};
for (const node of app.graph.nodes) {
  if (node.kind !== 'javascript-asset') continue;
  for (const observation of node.observations) {
    if (observation.evidence.extractor.operation !== 'derive-html-inline-source') continue;
    const props = observation.properties;
    const origin = props.inline_source;
    assert.ok(origin);
    const htmlBytes = await fs.readFile(path.join(app.input_path, origin.html_path));
    const html = htmlBytes.toString('utf8');
    const body = html.slice(origin.start_offset, origin.end_offset);
    assert.equal(hash(htmlBytes), origin.html_sha256);
    assert.equal(hash(Buffer.from(body)), observation.evidence.artifact.sha256);
    assert.equal(Buffer.byteLength(body), props.bytes);
    assert.deepEqual({ start: point(html, origin.start_offset), end: point(html, origin.end_offset) }, origin.source_range);
    const placeholder = body.indexOf('%@');
    sourceReview.push({
      authority: 'Supplemental inert source interpretation after exact digest/range verification; not automatic REA+ behavior recovery.',
      logical_source: props.path, body_sha256: observation.evidence.artifact.sha256,
      body_bytes: props.bytes, inline_source: origin,
      parse_status: props.parse_status,
      findings: origin.html_path.includes('EaselExportCollection')
        ? ['A classic IIFE reads easels/empty/sort/filter elements and registers change callbacks.', 'refresh sorts title with localeCompare(sensitivity=base), otherwise descending numeric dataset values with zero fallback; filters all/shared/non-shared rows, reapplies DOM order and empty-state display.', 'The source registers two change handlers but contains no explicit initial refresh call. Native export population, initial DOM state, actual callback dispatch and visible result remain unknown.']
        : ['The source contains a literal Objective-C %@ format token as the second window.YT.Player argument and explicitly comments that runtime replaces it.', 'The parser failure is truthful for the raw template; supplied player options and native template expansion have not been observed.', 'Source defines youtubeplayer:// event URLs, but these are supplemental text observations; no JavaScript IR or native navigation-delegate attribution was recovered for this failed body.'],
      placeholder: placeholder < 0 ? null : { token: '%@', decoded_html_utf16_offset: origin.start_offset + placeholder, source_point: point(html, origin.start_offset + placeholder), source_context: body.slice(Math.max(0, placeholder - 55), placeholder + 35) },
    });
  }
}
assert.equal(sourceReview.length, 2);
assert.equal(sourceReview.filter((row) => row.parse_status === 'failed').length, 1);
await save(path.join(root, 'supplemental-source-review.json'), sourceReview);

const endpoints = parseEvidence(await read(path.join(root, 'endpoints.evidence.json')));
assert.deepEqual(endpoints.normalized_result.items, []);
const status = parseEvidence(await read(path.join(root, 'file-statuses.evidence.json')));
assert.ok(status.normalized_result.items.some((row) => row.source_kind === 'html-inline-script' && row.parse_status === 'failed' && row.issues.some((issue) => issue.operation === 'parse-javascript')));
const fixture = await read(path.join(root, 'owned-search-fixture.json'));
const pack = await fs.readFile(fixture.file.path);
assert.equal(hash(pack), fixture.file.sha256);
const index = parseEvidence(await read(path.join(root, 'owned-pack-index.evidence.json'))).normalized_result;
assert.equal(index.resource, null);
assert.equal(index.canonical_resources, 4);
assert.equal(index.alias_resources, 1);
for (const id of [7, 42, 43, 91]) {
  const selected = parseEvidence(await read(path.join(root, `owned-selected-${id}.evidence.json`))).normalized_result.resource;
  const bytes = Buffer.from(selected.bytes_hex, 'hex');
  assert.equal(hash(bytes), selected.sha256);
  assert.equal(bytes.length, selected.bytes);
  if (id !== 91) assert.ok(selected.text_preview.includes(fixture.query));
  else assert.equal(selected.text_preview, null);
}
const existingSearch = parseEvidence(await read(path.join(root, 'owned-existing-js-search.evidence.json'))).normalized_result;
assert.equal(existingSearch.scanned_files, 0);
assert.deepEqual(existingSearch.matches, []);
assert.equal('query' in catalog.find((tool) => tool.name === 'inspect_chromium_resources').inputSchema.properties, false);
assert.equal(catalog.some((tool) => tool.name === 'search_chromium_resources'), false);
const rejected = await read(path.join(root, 'owned-search-unadvertised.cli.invocation.json'));
assert.equal(rejected.exit_code, 1);
assert.match(await fs.readFile(path.join(root, rejected.stdout), 'utf8'), /Unknown flag: --query/u);

const traces = [];
for (const name of ['easel-sort-key-forward', 'easel-filter-forward', 'easel-refresh-callers']) {
  const evidence = parseEvidence(await read(path.join(root, `${name}.evidence.json`)));
  assert.equal(evidence.normalized_result.source_evidence_id, parent.evidence_id);
  assert.equal(evidence.normalized_result.coverage.status, 'partial');
  traces.push({ name, evidence_id: evidence.evidence_id, status: evidence.normalized_result.status, summary: evidence.normalized_result.summary, coverage: evidence.normalized_result.coverage });
}
const receipt = { status: 'passed', observed_at: new Date().toISOString(), scope: 'All captured public calls and saved schemas, canonical Evidence/bundles, seven selected shipped files, inline body mappings, and the owned decoded-literal search need. No producer rerun by this auditor.', calls: calls.length, successful: calls.length, errors: 0, verifier_run: summary.verifier_run, bundles, parent_evidence_id: parent.evidence_id, statistics: app.statistics, semantic: { nodes: app.semantic_graph.nodes.length, relations: app.semantic_graph.relations.length, unknowns: app.semantic_graph.unknowns.length, coverage: app.semantic_graph.coverage.status }, selected_files_unchanged: selection.selected_files.length, inline_bodies: sourceReview.map(({ logical_source, body_sha256, body_bytes, inline_source, parse_status }) => ({ logical_source, body_sha256, body_bytes, inline_source, parse_status })), traces, search_gap: { confirmed: true, current_catalog_tools: catalog.length, chromium_query_advertised: false, dedicated_search_advertised: false, unsupported_cli_query_exit: rejected.exit_code, selected_fixture_text_ids: [7, 42, 43], alias_id: 4242, binary_candidate_id: 91, existing_js_search_scanned_files: 0 }, caveats: ['The seven-file producer is a new scope (four HTML files plus the three previously analyzed JS files); it is not complete Arc app analysis.', 'The YouTube raw template is not valid JavaScript before runtime substitution; its failure and unretained IR remain explicit.', 'All three Easel traces remain partial. Source-text interpretation stays supplemental and does not fill automatic trace fields.', 'The owned pack demonstrates a missing decoded-search capability; its synthetic numeric IDs do not identify Arc filenames.'] };
await save(path.join(root, 'verification-receipt.json'), receipt);
console.log(JSON.stringify({ status: receipt.status, calls: receipt.calls, bundles: bundles.length, inline_bodies: sourceReview.length, placeholder: sourceReview.find((item) => item.placeholder)?.placeholder, search_gap: true }));
