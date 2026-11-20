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
const body = parseEvidence(await read('selector-reopen-evidence/reopened-selector-0x1012f4464-instructions.evidence.json'));
const modifier = parseEvidence(await read('selector-reopen-evidence/reopened-selector-0x100b0b828-pseudocode.evidence.json'));
const descriptor = parseEvidence(await read('selector-reopen-evidence/selector-tap-task-descriptor.evidence.json'));
const bundle = parseEvidenceBundle(await read('selector-reopen-evidence/phase-1-bundle.json'));
for (const row of [body, modifier, descriptor]) { assert.equal(row.subject.digest.sha256, expected); assert.ok(bundle.records.some(record => record.evidence_id === row.evidence_id)); }
assert.ok(body.normalized_result.instructions.includes('0x1012f4488: bl 0x1012f3454'));
assert.ok(modifier.normalized_result.includes('1042acfa8'));
const rawDescriptor = Buffer.from(descriptor.normalized_result.bytes_hex, 'hex');
const tapEntry = BigInt(descriptor.normalized_result.address) + BigInt(rawDescriptor.readInt32LE(0));
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8')));
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seeds = await fs.readFile(path.join(directory, 'selector-reopen-seeds.tsv'), 'utf8');
const targets = [0x1012f3454n, tapEntry].map(entry => { const i = starts.indexOf(entry); assert.notEqual(i, -1); const text = `0x${entry.toString(16)}`; assert.ok(seeds.split('\n').includes(`${text}\tfunction`)); return { entry: text, exact_lc_start: true, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), interval_is_not_complete_body_proof: true }; });
const steps = [
  { name: 'read_bytes', arguments: { address: '0x1042acfa8', length: 32 }, label: 'exact-selector-tracking-modifier-metadata' },
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f3454' }, label: 'selector-spotlight-content-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f3454' }, label: 'selector-spotlight-content-pseudocode' },
];
const tapSteps = [
  { name: 'read_function_instructions', arguments: { procedure: targets[1].entry }, label: 'selector-tap-async-entry-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: targets[1].entry }, label: 'selector-tap-async-entry-pseudocode' },
];
const valueCatalog = await read('selector-reopen-evidence/catalog.json'), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of [...steps, ...tapSteps]) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('selector-modifier-and-drawing.steps.json', { authority: 'Prepared from admitted helper/body observations; not executed here', target_sha256: expected, execution: 'Parent owns persistent continuation files and final session handling. Use frozen076runtime and current1951seed profile; no new admission needed.', steps });
await save('selector-tap-async.steps.json', { authority: 'Optional follow-up from public loaded async descriptor and exact LC entry; not executed here', target_sha256: expected, execution: 'Append to parent-owned reopened session only when useful; no new code seed is required.', steps: tapSteps });
await save('selector-modifier-and-drawing-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, phase_bundle: 'selector-reopen-evidence/phase-1-bundle.json', phase_bundle_records: bundle.records.length, source_body_evidence_id: body.evidence_id, source_modifier_evidence_id: modifier.evidence_id, source_tap_descriptor_evidence_id: descriptor.evidence_id, tap_descriptor_target: targets[1].entry, tap_context_bytes: rawDescriptor.readUInt32LE(4), targets, seed_file: 'selector-reopen-seeds.tsv', seed_sha256: createHash('sha256').update(seeds).digest('hex'), proposed_primary_requests_schema_checked: 3, optional_tap_requests_schema_checked: 2, proposed_requests_executed: 0, reopened_session_finalized: false });
console.log(JSON.stringify({ status: 'passed', primary_requests: 3, optional_tap_requests: 2, targets: targets.map(row => row.entry), provider_calls_executed: 0 }));
