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
const spotlight = parseEvidence(await read('selector-reopen-evidence/selector-spotlight-content-instructions.evidence.json'));
const tap = parseEvidence(await read('selector-reopen-evidence/selector-tap-async-entry-pseudocode.evidence.json'));
const bundle = parseEvidenceBundle(await read('selector-reopen-evidence/phase-2-bundle.json'));
for (const record of [spotlight, tap]) { assert.equal(record.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === record.evidence_id)); }
assert.ok(spotlight.normalized_result.instructions.includes('0x1012f349c: bl 0x1012f3660'));
assert.ok(spotlight.normalized_result.instructions.includes('0x1012f3590: add x1, x1, #0x4a0'));
assert.ok(tap.normalized_result.includes('FUN_1012e6bc8'));
const namePreparation = await read('tracking-modifier-name-preparation.json'); assert.equal(namePreparation.candidate_name, 'MouseMoveModifier');
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8')));
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seeds = await fs.readFile(path.join(directory, 'selector-reopen-seeds.tsv'), 'utf8');
const targets = ['0x1012f3660', '0x1012f44a0', '0x1012e6bc8'].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); assert.ok(seeds.split('\n').includes(`${entry}\tfunction`)); return { entry, exact_lc_start: true, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), interval_is_not_complete_body_proof: true }; });
const steps = [
  { name: 'inspect_native_dispatch_metadata', arguments: { facet: 'swift-conformances', swift_conformance_filter: { type_name: 'MouseMoveModifier' }, max_file_bytes: 100663296, max_records: 1000 }, label: 'exact-mouse-move-modifier-conformances' },
  ...targets.flatMap(row => [
    { name: 'read_function_instructions', arguments: { procedure: row.entry }, label: `selector-render-query-${row.entry}-instructions` },
    { name: 'procedure_pseudo_code', arguments: { procedure: row.entry }, label: `selector-render-query-${row.entry}-pseudocode` },
  ]),
];
const valueCatalog = await read('selector-reopen-evidence/catalog.json'), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('selector-render-and-query.steps.json', { authority: 'Prepared from Spotlight content edges and tap async target; no requests executed here', target_sha256: expected, execution: 'Parent owns reopened persistent continuations. Existing1951seeds contain all native code targets. Exact name query corroborates a checked-source candidate; do not claim native type identity or physical event behavior from the candidate alone. Export phases; no session-finalization claim here.', steps });
await save('selector-render-and-query-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, source_evidence_ids: [spotlight.evidence_id, tap.evidence_id], phase_bundle: 'selector-reopen-evidence/phase-2-bundle.json', phase_bundle_records: bundle.records.length, source_name_preparation: 'tracking-modifier-name-preparation.json', targets, provenance_note: 'Spotlight child/callback come from machine instructions; tap work target is retained folded async pseudocode, not a direct call in the entry instruction body.', source_function_index_evidence_id: index.evidence_id, seed_sha256: createHash('sha256').update(seeds).digest('hex'), proposed_requests_schema_checked: steps.length, proposed_requests_executed: 0, reopened_session_finalized: false });
console.log(JSON.stringify({ status: 'passed', schema_checked_requests: steps.length, code_targets: targets.map(row => row.entry), provider_calls_executed: 0 }));
