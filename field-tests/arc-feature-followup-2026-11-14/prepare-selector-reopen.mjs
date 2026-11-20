import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url)), root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const manifest = await read('frozen-runtime-manifest.json');
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const bundle = parseEvidenceBundle(await read('persistent-selector-evidence/phase-4-bundle.json')); assert.equal(bundle.records.length, 28);
const conformance = parseEvidence(await read('persistent-selector-evidence/exact-overlay-alternate-branch-conformance.evidence.json'));
assert.equal(conformance.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === conformance.evidence_id));
const body = conformance.normalized_result.result.swift_resilient_witnesses.find(row => row.requirement_reference?.symbol === '_$s7SwiftUI4ViewP4body4BodyQzvgTq');
assert.ok(body); assert.equal(body.type_name, 'SelectorSpotlight'); assert.equal(body.implementation_address, '0x1012f4464'); assert.equal(body.runtime_witness_table, 'not_instantiated');
const startsPath = 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json';
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, startsPath), 'utf8'))); assert.equal(index.subject.digest.sha256, expected); assert.equal(index.normalized_result.complete, true);
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const originalSeeds = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8');
const extras = ['0x100b080a8', '0x100b0b828'];
const targets = [...extras, body.implementation_address].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); return { entry, exact_lc_function_start: true, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), originally_seeded: originalSeeds.split('\n').includes(`${entry}\tfunction`), interval_is_not_complete_body_proof: true }; });
assert.ok(targets.slice(0, 2).every(row => !row.originally_seeded)); assert.equal(targets[2].originally_seeded, true);
const seedLines = new Set(originalSeeds.trim().split('\n')); for (const entry of extras) seedLines.add(`${entry}\tfunction`);
const merged = [...seedLines].sort((a, b) => BigInt(a.split('\t')[0]) < BigInt(b.split('\t')[0]) ? -1 : 1).join('\n') + '\n';
assert.equal(seedLines.size, 1951);
const steps = [
  ...targets.map(row => row.entry).flatMap(entry => [
    { name: 'read_function_instructions', arguments: { procedure: entry }, label: `reopened-selector-${entry}-instructions` },
    { name: 'procedure_pseudo_code', arguments: { procedure: entry }, label: `reopened-selector-${entry}-pseudocode` },
  ]),
  { name: 'read_bytes', arguments: { address: '0x10378c0e0', length: 8 }, label: 'selector-tap-task-descriptor' },
];
const valueCatalog = await read('persistent-selector-evidence/catalog.json'), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await fs.writeFile(path.join(directory, 'selector-reopen-extra-seeds.tsv'), extras.map(entry => `${entry}\tfunction\n`).join(''));
await fs.writeFile(path.join(directory, 'selector-reopen-seeds.tsv'), merged);
await save('selector-reopen.steps.json', { authority: 'Prepared follow-up from admitted public function-index starts and exact SelectorSpotlight body requirement; no proposed requests executed here', target_sha256: expected, execution: 'Parent owns a single clean reopened frozen076 binding. Configure REA_GHIDRA_SEED_FILE to selector-reopen-seeds.tsv (1951functions), retain bounded policy and record its new profile. The original1949seedfile and exported records remain untouched. Append open/export/close and verifier lineage handling in the parent recorder.', steps });
await save('selector-reopen-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, frozen_source_commit: manifest.source_commit, prior_phase_bundle: 'persistent-selector-evidence/phase-4-bundle.json', prior_phase_bundle_records: bundle.records.length, body_conformance_evidence_id: conformance.evidence_id, body_requirement: body.requirement_reference.symbol, body_runtime_witness_table: body.runtime_witness_table, function_index: { path: startsPath, evidence_id: index.evidence_id }, targets, original_seed_file: 'merged-seeds.tsv', original_seed_sha256: hash(originalSeeds), new_seed_file: 'selector-reopen-seeds.tsv', new_seed_functions: seedLines.size, new_seed_sha256: hash(merged), added_function_entries: extras, proposed_requests_schema_checked: steps.length, proposed_requests_executed: 0 });
console.log(JSON.stringify({ status: 'passed', new_seed_functions: seedLines.size, added_entries: extras, code_targets: targets.map(row => row.entry), schema_checked_requests: steps.length, provider_calls_executed: 0 }));
