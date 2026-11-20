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
const source = parseEvidence(await read('persistent-selector-evidence/selector-visual-child-instructions.evidence.json'));
const bundle = parseEvidenceBundle(await read('persistent-selector-evidence/phase-3-bundle.json'));
assert.equal(source.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === source.evidence_id));
const instructions = source.normalized_result.instructions;
for (const instruction of ['0x1012eea50: add x2, x2, #0x4dc', '0x1012eea78: bl 0x100b0b828', '0x1012eeb0c: add x1, x1, #0x4e8', '0x1012eed50: add x8, x8, #0x61c']) assert.ok(instructions.includes(instruction));
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8')));
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seeds = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8');
const targets = ['0x1012f14dc', '0x1012f14e8', '0x1012f161c', '0x100b0b828'].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); return { entry, exact_lc_function_start: true, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), in_current_seed_file: seeds.split('\n').includes(`${entry}\tfunction`), interval_is_not_function_body_proof: true }; });
assert.ok(targets.slice(0, 3).every(row => row.in_current_seed_file)); assert.equal(targets[3].in_current_seed_file, false); assert.equal(targets[3].indexed_interval_bytes, 164);
const steps = [
  ...targets.slice(0, 3).flatMap(row => [
    { name: 'read_function_instructions', arguments: { procedure: row.entry }, label: `selector-tracking-${row.entry}-instructions` },
    { name: 'procedure_pseudo_code', arguments: { procedure: row.entry }, label: `selector-tracking-${row.entry}-pseudocode` },
  ]),
  { name: 'read_bytes', arguments: { address: '0x10378c010', length: 80 }, label: 'selector-render-keypath-patterns' },
  { name: 'read_bytes', arguments: { address: '0x10422db30', length: 8 }, label: 'selector-render-keypath-indirect-member' },
  { name: 'procedure_info', arguments: { procedure: '0x100b0b828' }, label: 'selector-tracking-helper-admission' },
  { name: 'read_bytes', arguments: { address: '0x100b0b828', length: 164 }, label: 'selector-tracking-helper-loaded-bytes' },
  { name: 'inspect_native_dispatch_metadata', arguments: { facet: 'swift-conformances', swift_conformance_address: '0x10378c1c0', max_file_bytes: 100663296, max_records: 1000 }, label: 'exact-overlay-alternate-branch-conformance' },
];
const catalogValue = await read('persistent-selector-evidence/catalog.json'), catalog = Array.isArray(catalogValue) ? catalogValue : catalogValue.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('selector-tracking-and-rect.steps.json', { authority: 'Prepared requests from selected callback installation and rectangle-value use; no requests executed by this preparation', target_sha256: expected, execution: 'Parent owns persistent continuations. Retain optional admission failure for the outside-seed helper; do not require its success or restart the main session. Public keypath bytes/indirection must corroborate any member-identity derivation. Export phases; no final cleanup is claimed by this plan.', steps });
await save('selector-tracking-and-rect-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, source_visual_instruction_evidence_id: source.evidence_id, phase_bundle: 'persistent-selector-evidence/phase-3-bundle.json', phase_bundle_records: bundle.records.length, targets, source_function_index_evidence_id: index.evidence_id, seed_sha256: createHash('sha256').update(seeds).digest('hex'), proposed_requests_schema_checked: steps.length, proposed_requests_executed: 0, persistent_session_finalized: false });
console.log(JSON.stringify({ status: 'passed', schema_checked_requests: steps.length, code_targets: targets.map(row => row.entry), provider_calls_executed: 0, persistent_session_finalized: false }));
