import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';

const root = path.dirname(fileURLToPath(import.meta.url));
const pkg = path.resolve(root, '../../../rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const json = async (p) => JSON.parse(await fs.readFile(p, 'utf8'));
const sha = (bytes) => createHash('sha256').update(bytes).digest('hex');
const record = async (name) => parseEvidence(await json(path.join(root, name + '.evidence.json')));
const bytes = (r) => Buffer.from(r.normalized_result.bytes_hex, 'hex');
const cstring = (r) => bytes(r).subarray(0, bytes(r).indexOf(0)).toString('utf8');
const stages = [];

for (const directory of ['.', 'context', 'case-code', 'longer-analysis']) {
  const dir = path.join(root, directory);
  const catalog = await json(path.join(dir, 'catalog.json'));
  const calls = await json(path.join(dir, 'invocations.json'));
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  for (const call of calls) {
    assert.equal(call.thrown, null);
    assert.equal(call.is_error, false);
    const advertised = catalog.find((t) => t.name === call.name);
    assert.ok(advertised, call.name);
    assert.ok(ajv.validateSchema(advertised.inputSchema));
    assert.ok(ajv.validate(advertised.inputSchema, call.arguments), JSON.stringify(ajv.errors));
    const reply = await json(path.join(dir, call.reply));
    assert.notEqual(reply.isError, true);
    const value = reply.structuredContent;
    assert.ok(ajv.validateSchema(advertised.outputSchema));
    assert.ok(ajv.validate(advertised.outputSchema, value), JSON.stringify(ajv.errors));
    toolContract(call.name).outputSchema.parse(value);
    assert.deepEqual(JSON.parse(reply.content.find((c) => c.type === 'text').text), value);
    if (value.evidence_id) parseEvidence(value);
  }
  const bundlePath = path.join(dir, 'evidence-bundle.json');
  const bundle = parseEvidenceBundle(await json(bundlePath));
  const summary = await json(path.join(dir, 'summary.json'));
  assert.equal(summary.status, 'completed');
  assert.equal(summary.successful, calls.length);
  assert.equal(summary.verifier_run.process_lineage.status, 'verified');
  assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
  const overview = await record(path.join(directory, 'overview'));
  const seconds = directory === 'longer-analysis' ? 300 : 60;
  assert.ok(overview.limitations.some((l) => l.includes('analysis_complete=false; analysis_timed_out=true; analysis_timeout_seconds=' + seconds + '.')));
  stages.push({ directory, calls: calls.length, bundle_records: bundle.records.length, bundle_sha256: sha(await fs.readFile(bundlePath)), verifier_run: summary.verifier_run });
}

// Validate the recorded arithmetic against the actual provider-defined layouts.
const contextLayout = (await record('context/context-descriptor-layout')).normalized_result;
assert.ok(contextLayout.fields.some((f) => f.name === 'Name' && f.offset_bytes === 8 && f.type_id.includes('relative')));
const fieldLayout = (await record('context/field-record-layout')).normalized_result;
assert.equal(fieldLayout.size_bytes, 12);
assert.ok(fieldLayout.fields.some((f) => f.name === 'FieldName' && f.offset_bytes === 8 && f.type_id.includes('relative')));
for (const derivation of (await json(path.join(root, 'context/descriptor-derivations.json'))).derivations) {
  assert.equal(BigInt(derivation.field_address) + BigInt(derivation.signed_relative_value), BigInt(derivation.derived_address));
}
assert.equal(cstring(await record('context/command-name-bytes')), 'BoostIDERequest');
assert.equal(cstring(await record('context/gallery-name-bytes')), 'AppAction');
const commandCases = [];
for (let i = 0; i < 4; i++) commandCases.push(cstring(await record('context/command-field-name-' + i)));
assert.deepEqual(commandCases, ['loadCSS', 'editCSS', 'loadJS', 'editJS']);
assert.equal(cstring(await record('context/gallery-field-name-32')), 'openExternalURL');

const table = await record('context/gallery-c4-table-entry');
assert.equal(bytes(table).readInt32LE(), 1412);
assert.equal(0x1005a4bd4 + bytes(table).readInt32LE(), 0x1005a5158);
const caseBytes = bytes(await record('case-code/case-bytes'));
let decoded = 0;
for (let i = 0; i < 28; i++) {
  const instruction = (await record('case-code/gallery-c4-case-' + i)).normalized_result;
  if (instruction.status !== 'decoded') continue;
  assert.equal(instruction.bytes, caseBytes.subarray(i * 4, i * 4 + 4).toString('hex'));
  decoded++;
}
assert.equal(decoded, 20);
const caseOverview = await record('case-code/overview');
assert.ok(caseOverview.limitations.some((l) => l.includes('1 code seeds decoded, 0 failed')));
const url = cstring(await record('case-code/gallery-c4-url'));
assert.equal(url, 'https://arc.net/boosts?ref=arc-app');
assert.equal(Buffer.byteLength(url), 34);
const selectors = {};
for (const label of ['window', 'related', 'order', 'candidate', 'probe', 'coordinate', 'parent']) selectors[label] = cstring(await record('context/selector-' + label + '-name'));
assert.deepEqual(selectors, { window: 'window', related: 'childWindows', order: 'orderedIndex', candidate: 'contentView', probe: 'hitTest:', coordinate: 'mouseLocationOutsideOfEventStream', parent: 'isDescendantOf:' });
assert.equal(cstring(await record('case-code/command-error-selector-name')), 'sendErrorResponse:jsonString:');
assert.equal(cstring(await record('case-code/command-result-selector-name')), 'sendResponse:jsonString:');
const baseline = (await record('gallery-payload-construction')).normalized_result.procedure.body;
const longer = (await record('longer-analysis/gallery-payload')).normalized_result.procedure.body;
assert.equal(baseline.total_bytes, 2100);
assert.equal(longer.total_bytes, 2932);
assert.equal(sha(await fs.readFile(path.join(root, 'caller-established-seeds.tsv'))), sha(await fs.readFile(path.join(root, 'longer-analysis/caller-established-seeds.tsv'))));

const receipt = {
  status: 'passed', observed_at: new Date().toISOString(), validator: 'Actual saved MCP schemas, current named contracts, canonical Evidence, bundle invariants, text/structured equality and recorded byte/layout arithmetic; no provider or target execution.',
  stages, mcp_calls: stages.reduce((n, s) => n + s.calls, 0), bundle_record_occurrences: stages.reduce((n, s) => n + s.bundle_records, 0),
  derived_claim_checks: { command_type: 'BoostIDERequest', command_cases: commandCases, action_type: 'AppAction', field_32: 'openExternalURL', gallery_case: '0xc4', case_destination: '0x1005a5158', decoded_instructions: decoded, gallery_url: url, sidebar_selector_literals: selectors, body_comparison: { seconds_60: baseline.total_bytes, seconds_300: longer.total_bytes, both_partial: true } },
  limits: ['Metadata names and selector meanings are analyst derivations from authenticated REA+ bytes/layouts; no automatic case-name semantic field is invented.', 'Code seeding defines instructions at a case block without asserting an independent function. The original 2100-byte, non-contiguous function body remains incomplete.', 'The first three Arc Programs remain partial at60seconds. The comparison remains partial at300seconds despite retaining more body code; it is not a completed-analysis control.', 'Closure runtime targets, final navigation, actual JSON values and UI events are not observed.'],
};
await fs.writeFile(path.join(root, 'verification-receipt.json'), JSON.stringify(receipt, null, 2) + '\n');
console.log(JSON.stringify({ status: receipt.status, mcp_calls: receipt.mcp_calls, bundle_record_occurrences: receipt.bundle_record_occurrences, url, commandCases }));
