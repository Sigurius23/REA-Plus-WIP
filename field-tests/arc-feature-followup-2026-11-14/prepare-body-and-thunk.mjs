import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const manifest = await read('frozen-runtime-manifest.json');
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const conformance = parseEvidence(await read('event-and-view-evidence/exact-boost-editor-view-conformances.evidence.json'));
assert.equal(conformance.subject.digest.sha256, expected);
const body = conformance.normalized_result.result.swift_resilient_witnesses.find(row => row.requirement_reference?.symbol === '_$s7SwiftUI4ViewP4body4BodyQzvgTq');
assert.equal(body.implementation_address, '0x1012d1ccc'); assert.equal(body.runtime_witness_table, 'not_instantiated');
const incoming = parseEvidence(await read('event-and-view-evidence/selector-new-starter-caller-inputs.evidence.json'));
const thunk = incoming.normalized_result.references.find(row => row.source_address === '0x1012f017c');
assert.equal(thunk.source_procedure.address, '0x1012f0174'); assert.equal(thunk.kind.type, 'UNCONDITIONAL_JUMP'); assert.equal(thunk.target_address, '0x1012f0028');
const sourceIndexPath = 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json';
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, sourceIndexPath), 'utf8')));
assert.equal(index.subject.digest.sha256, expected); assert.equal(index.normalized_result.complete, true);
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n;
const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const entries = ['0x1012d1ccc', '0x1012f0174'].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); return { entry, exact_indexed_start: true, previous_indexed_start: `0x${starts[i - 1].toString(16)}`, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), interval_is_not_complete_body_proof: true }; });
assert.equal(entries[1].previous_indexed_start, '0x1012f0170');
const steps = [
  { name: 'read_function_instructions', arguments: { procedure: '0x1012d1ccc' }, label: 'boost-editor-view-body-witness-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012d1ccc' }, label: 'boost-editor-view-body-witness-pseudocode' },
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f0174' }, label: 'selector-point-input-thunk-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f0174' }, label: 'selector-point-input-thunk-pseudocode' },
  { name: 'procedure_references', arguments: { procedure: '0x1012f0174', direction: 'incoming' }, label: 'selector-point-input-thunk-callers' },
];
const catalogValue = await read('event-and-view-evidence/catalog.json'); const catalog = Array.isArray(catalogValue) ? catalogValue : catalogValue.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const seedText = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8');
for (const row of entries) assert.ok(seedText.split('\n').includes(`${row.entry}\tfunction`));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('body-and-thunk.steps.json', { authority: 'Prepared follow-up from static imported requirement identity and positive caller reference; no runtime witness instantiation or proposed request execution', target_sha256: expected, execution: 'Use the frozen076 runtime and actual advertised schemas; the existing verified merged seed file contains both entries. Append open/export/close and verify lineage in the owning recorder.', steps });
await save('body-and-thunk-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), frozen_source_commit: manifest.source_commit, target_sha256: expected, source_conformance_evidence_id: conformance.evidence_id, body_requirement: body.requirement_reference.symbol, body_implementation: body.implementation_address, runtime_witness_table: body.runtime_witness_table, source_caller_evidence_id: incoming.evidence_id, source_function_index: { path: sourceIndexPath, evidence_id: index.evidence_id }, indexed_starts: starts.length, entries, existing_seed_sha256: createHash('sha256').update(seedText).digest('hex'), proposed_requests_schema_checked: steps.length, proposed_requests_executed: 0 });
console.log(JSON.stringify({ status: 'passed', entries: entries.map(row => row.entry), schema_checked_requests: steps.length, provider_calls_executed: 0 }));
