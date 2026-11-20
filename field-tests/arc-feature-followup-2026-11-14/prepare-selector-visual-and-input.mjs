import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url)), root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const manifest = await read('frozen-runtime-manifest.json');
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const record = parseEvidence(await read('persistent-selector-evidence/selector-content-SelectorPicker-instructions.evidence.json'));
const bundle = parseEvidenceBundle(await read('persistent-selector-evidence/phase-2-bundle.json'));
assert.equal(record.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === record.evidence_id));
const lines = record.normalized_result.instructions;
const childCall = lines.find(line => line.endsWith(': bl 0x1012ee7e8'));
const inputCall = lines.find(line => line.endsWith(': bl 0x100b080a8'));
assert.ok(childCall); assert.ok(inputCall);
assert.ok(lines.includes('0x1012ee654: add x1, x1, #0x218'));
const overlayRecord = parseEvidence(await read('persistent-selector-evidence/selector-content-BoostsEditorOverlayView-instructions.evidence.json'));
assert.ok(bundle.records.some(row => row.evidence_id === overlayRecord.evidence_id));
assert.ok(overlayRecord.normalized_result.instructions.some(line => line.endsWith(': bl 0x1012f952c')));
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8')));
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seeds = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8');
const targets = ['0x1012f0218', '0x1012f952c', '0x1012ee7e8', '0x100b080a8'].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); return { entry, exact_lc_function_start: true, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), in_current_seed_file: seeds.split('\n').includes(`${entry}\tfunction`), interval_is_not_complete_body_proof: true }; });
assert.ok(targets.slice(0, 3).every(row => row.in_current_seed_file)); assert.equal(targets[3].in_current_seed_file, false);
const steps = [
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f0218' }, label: 'selector-installed-input-callback-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f0218' }, label: 'selector-installed-input-callback-pseudocode' },
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f952c' }, label: 'overlay-selector-branch-construction-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f952c' }, label: 'overlay-selector-branch-construction-pseudocode' },
  { name: 'read_function_instructions', arguments: { procedure: '0x1012ee7e8' }, label: 'selector-visual-child-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012ee7e8' }, label: 'selector-visual-child-pseudocode' },
  { name: 'procedure_info', arguments: { procedure: '0x100b080a8' }, label: 'selector-input-helper-admission' },
  { name: 'read_bytes', arguments: { address: '0x100b080a8', length: 456 }, label: 'selector-input-helper-loaded-bytes' },
];
const valueCatalog = await read('persistent-selector-evidence/catalog.json'), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('selector-visual-and-input.steps.json', { authority: 'Prepared follow-up from concrete selector-content assembly; not executed by this preparation', target_sha256: expected, execution: 'Parent owns persistent continuations. Keep the current session; admission query for the outside-seed helper may retain an explicit partial-Program boundary. Do not require its success or assign the LC interval as function ownership. If absent, retain bytes and use a separate explicitly seeded binding only if needed.', steps });
await save('selector-visual-and-input-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, source_evidence_ids: [record.evidence_id, overlayRecord.evidence_id], source_calls: [childCall, inputCall], selected_callback: '0x1012f0218', phase_bundle: 'persistent-selector-evidence/phase-2-bundle.json', phase_bundle_records: bundle.records.length, targets, source_function_index_evidence_id: index.evidence_id, seed_sha256: createHash('sha256').update(seeds).digest('hex'), proposed_requests_schema_checked: 8, proposed_requests_executed: 0, persistent_session_finalized: false });
console.log(JSON.stringify({ status: 'passed', targets: targets.map(row => row.entry), schema_checked_requests: 8, provider_calls_executed: 0, persistent_session_finalized: false }));
