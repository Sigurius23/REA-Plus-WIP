import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';

const root = path.dirname(fileURLToPath(import.meta.url));
const pkg = path.resolve(root, '../../../../../rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const json = async (p) => JSON.parse(await fs.readFile(p, 'utf8'));
const catalog = await json(path.join(root, 'catalog.json'));
const calls = await json(path.join(root, 'invocations.json'));
const ajv = new Ajv2020({ strict: false, validateFormats: false });
let error;
for (const call of calls) {
  const advertised = catalog.find((t) => t.name === call.name);
  assert.ok(advertised);
  assert.ok(ajv.validate(advertised.inputSchema, call.arguments), JSON.stringify(ajv.errors));
  assert.equal(call.thrown, null);
  const reply = await json(path.join(root, call.reply));
  if (reply.isError) {
    assert.equal(call.reply, 'timeout-with-known-html.reply.json');
    error = JSON.parse(reply.content.find((c) => c.type === 'text').text).error;
    assert.equal(error.code, 'provider_timeout');
    assert.equal(error.details.timeout_ms, 1);
    continue;
  }
  const value = reply.structuredContent;
  assert.ok(ajv.validate(advertised.outputSchema, value), JSON.stringify(ajv.errors));
  toolContract(call.name).outputSchema.parse(value);
  assert.deepEqual(JSON.parse(reply.content.find((c) => c.type === 'text').text), value);
  if (value.evidence_id) parseEvidence(value);
}
assert.ok(error);
const bundlePath = path.join(root, 'evidence-bundle.json');
const bundle = parseEvidenceBundle(await json(bundlePath));
parseEvidenceBundle(await json(path.join(root, 'before-view-bundle.json')));
const partial = bundle.records.find((r) => r.evidence_id === error.details.partial_observation.evidence_id);
assert.ok(partial);
assert.equal(partial.parameters.analysis_timeout_ms, 1);
assert.equal(partial.parameters.max_inline_scripts, 0);
const view = parseEvidence(await json(path.join(root, 'timeout-html-statuses.evidence.json')));
const html = view.normalized_result.items.find((row) => row.path === 'index.html');
assert.ok(html);
assert.equal(html.source_kind, 'html-document');
assert.equal(html.html_inline_scripts.total, 2);
assert.equal(html.html_inline_scripts.omitted, 2);
assert.ok(html.issues.some((i) => i.operation === 'admit-html-inline-scripts'));
assert.ok(html.issues.some((i) => i.operation === 'analyze-javascript-source'));
const arc = parseEvidence(await json(path.join(root, 'arc-pages-final.evidence.json')));
assert.equal(arc.evidence_id, 'ev_e8918659b78760ed5c067ec4ea2cafdd2e51b4d07b05ea2aa14ca54467f952d3');
assert.equal(arc.normalized_result.statistics.parsed_inline_scripts, 3);
assert.equal(arc.normalized_result.statistics.visited_ast_nodes, 222);
const summary = await json(path.join(root, 'summary.json'));
assert.equal(summary.calls, 6);
assert.equal(summary.successful, 5);
assert.equal(summary.errors, 1);
assert.equal(summary.verifier_run.process_lineage.status, 'verified');
assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const receipt = {
  status: 'passed', observed_at: new Date().toISOString(), calls: 6, successes: 5, expected_timeouts: 1,
  partial_evidence_id: partial.evidence_id, status_view_evidence_id: view.evidence_id,
  known_html_omissions_retained: html.html_inline_scripts, final_arc_evidence_id: arc.evidence_id,
  final_bundle_records: bundle.records.length, bundle_sha256: createHash('sha256').update(await fs.readFile(bundlePath)).digest('hex'),
  verifier_run: summary.verifier_run,
  scope: 'Public 1ms worker timeout with a0 inline policy; retained parent and compact page keep already observed HTML omissions, then the same server successfully analyzes the exact Arc pages. No target code execution.',
};
await fs.writeFile(path.join(root, 'verification-receipt.json'), JSON.stringify(receipt, null, 2) + '\n');
console.log(JSON.stringify({ status: receipt.status, calls: receipt.calls, successes: receipt.successes, retained_omissions: html.html_inline_scripts.omitted }));
