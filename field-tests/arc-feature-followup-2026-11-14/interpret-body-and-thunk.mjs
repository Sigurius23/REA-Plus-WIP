import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const manifestRaw = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json'));
const manifest = JSON.parse(manifestRaw);
for (let offset = 0; offset < manifest.files.length; offset += 32) await Promise.all(manifest.files.slice(offset, offset + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const records = {}, anchors = [];
for (const filename of (await fs.readdir(path.join(directory, 'body-and-thunk-evidence'))).filter(name => name.endsWith('.evidence.json')).sort()) {
  const bytes = await fs.readFile(path.join(directory, 'body-and-thunk-evidence', filename));
  const record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected);
  records[filename.replace('.evidence.json', '')] = record;
  anchors.push({ path: `body-and-thunk-evidence/${filename}`, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null });
}
assert.equal(anchors.length, 5);
const bundle = parseEvidenceBundle(await read('body-and-thunk-evidence/evidence-bundle.json'));
assert.equal(bundle.records.length, 5); assert.deepEqual(new Set(bundle.records.map(row => row.evidence_id)), new Set(anchors.map(row => row.evidence_id)));
const summary = await read('body-and-thunk-evidence/summary.json');
assert.equal(summary.calls, 8); assert.equal(summary.successful, 8); assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const invocations = await read('body-and-thunk-evidence/invocations.json');
const close = invocations.find(row => row.name === 'close_binary'); assert.ok(close && !close.is_error && !close.thrown);
const body = records['boost-editor-view-body-witness-instructions'].normalized_result;
for (const instruction of ['0x1012d1d10: bl 0x103638a7c', '0x1012d1d38: bl 0x1012cd97c', '0x1012d1d50: bl 0x10000828c', '0x1012d1d84: bl 0x1000082d0', '0x1012d1da8: add x9, x9, #0xdd0', '0x1012d1dac: stp x9, x20, [x8]', '0x1012d1db0: stp xzr, xzr, [x8, #0x10]']) assert.ok(body.instructions.includes(instruction));
assert.ok(records['boost-editor-view-body-witness-pseudocode'].normalized_result.includes('SwiftUI9AlignmentV6center'));
const thunk = records['selector-point-input-thunk-instructions'].normalized_result;
assert.deepEqual(thunk.instructions, ['0x1012f0174: ldp x2, x3, [x20, #0x10]', '0x1012f0178: add x1, x20, #0x20', '0x1012f017c: b 0x1012f0028']);
const incoming = records['selector-point-input-thunk-callers'].normalized_result;
assert.equal(incoming.references.length, 1); assert.equal(incoming.references[0].kind.type, 'DATA'); assert.equal(incoming.references[0].source_address, '0x104e88fb8');
const startsSource = 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json';
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, startsSource), 'utf8')));
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n;
const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const targets = ['0x1012cd97c', '0x1012d1dd0'].map(entry => { const position = starts.indexOf(BigInt(entry)); assert.notEqual(position, -1); return { entry, exact_lc_function_start: true, next_indexed_start: `0x${starts[position + 1].toString(16)}`, indexed_interval_bytes: Number(starts[position + 1] - starts[position]), interval_is_not_complete_body_proof: true }; });
const seedText = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8'); for (const row of targets) assert.ok(seedText.split('\n').includes(`${row.entry}\tfunction`));
const steps = targets.flatMap(row => [
  { name: 'read_function_instructions', arguments: { procedure: row.entry }, label: `view-builder-${row.entry}-instructions` },
  { name: 'procedure_pseudo_code', arguments: { procedure: row.entry }, label: `view-builder-${row.entry}-pseudocode` },
]);
const catalogValue = await read('body-and-thunk-evidence/catalog.json'); const catalog = Array.isArray(catalogValue) ? catalogValue : catalogValue.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of steps) { const advertised = catalog.find(tool => tool.name === step.name); assert.ok(advertised); const validate = ajv.compile(advertised.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('view-builder.steps.json', { authority: 'Prepared next requests from concrete body instructions; no requests executed by this preparation', target_sha256: expected, execution: 'Use the frozen076 runtime, existing verified merged seeds and actual advertised schemas. Export and close/verify lineage in the owning recorder.', steps });
await save('view-builder-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), frozen_runtime_manifest_sha256: hash(manifestRaw), frozen_runtime_files_matched: manifest.files.length, source_body_instruction_evidence: records['boost-editor-view-body-witness-instructions'].evidence_id, source_function_index: { path: startsSource, evidence_id: index.evidence_id }, targets, existing_seed_sha256: hash(seedText), schema_checked_requests: 4, executed_requests: 0 });
await save('body-and-thunk-findings.json', {
  schema_version: 1, snapshot_date: '2026-11-14', target_sha256: expected, status: 'verified-with-open-builder-and-binding',
  authority: 'Static captured observations authenticated using content-verified frozen076runtime; not runtime drawing or physical event observations',
  frozen_runtime: { manifest_sha256: hash(manifestRaw), matched_files: manifest.files.length, source_commit: manifest.source_commit, mutable_current_source_used: false },
  session: { calls: 8, successful: 8, errors: 0, canonical_records: 5, explicit_close_ms: close.elapsed_ms, verified_empty_descendants: true },
  body_witness: { entry: '0x1012d1ccc', body_bytes: body.procedure.body.total_bytes, output_buffer_register: 'X8 saved to X19', operations: ['obtain SwiftUI Alignment.center', 'call0x1012cd97c into a metadata-offset child output field', 'copy self through0x10000828c', 'allocate captured self context', 'move copy through0x1000082d0', 'install closure0x1012d1dd0/context and two zero words into metadata-offset output field'], child_builder: '0x1012cd97c', captured_closure: '0x1012d1dd0', concrete_view_composition_or_modifier_kind_proved: false, drawing_proved: false },
  point_input_thunk: { entry: '0x1012f0174', body_bytes: 12, instruction_count: 3, context_register: 'X20', extra_words_loaded_at: '0x10/0x18 intoX2/X3', captured_value_argument: 'X1 = context+0x20', incoming_point_argument: 'X0 preserved', tail_target: '0x1012f0028', installed_ui_callback_proved: false },
  thunk_incoming_references: { records: 1, source: '0x104e88fb8', kind: 'DATA', concrete_closure_installation_site_recovered: false, physical_event_source_proved: false },
  next_batch: { path: 'view-builder.steps.json', requests: 4, targets, question: 'Recover actual child-view construction and meaning of the captured modifier/closure installed by the body witness.', executed_by_this_interpretation: false },
  limitations: ['Stable one-second partial Program; an empty code-caller set is not absence proof.', 'The point thunk pseudocode folds the tail-called callback; its own body is exactly three instructions.', 'Alignment.center alone does not establish a particular container type.', 'A stored closure pointer is not sufficient to name an onAppear, onChange or hover modifier.', 'Coordinate filtering remainsFRINTA rounding in coordinate units; no physical-pixel or final drawing assertion.', 'Durable persistence and broader Arc behavior remain unproved.'],
  evidence: anchors,
});
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, canonical_evidence: anchors.length, child_builder: '0x1012cd97c', captured_closure: '0x1012d1dd0', next_schema_checked_requests: 4, executed_provider_calls: 0 }));
