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
const bundle = parseEvidenceBundle(await read('persistent-selector-evidence/phase-0-bundle.json'));
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8')));
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seedText = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8');
const targets = [];
for (const [name, entry] of [['SelectorPicker', '0x1012f0388'], ['BoostsEditorOverlayView', '0x1012fa660']]) {
  const record = parseEvidence(await read(`persistent-selector-evidence/selector-discovery-${name}.evidence.json`)); assert.equal(record.subject.digest.sha256, expected);
  assert.ok(bundle.records.some(row => row.evidence_id === record.evidence_id));
  const row = record.normalized_result.result.swift_resilient_witnesses.find(row => row.requirement_reference?.symbol === '_$s7SwiftUI4ViewP4body4BodyQzvgTq');
  assert.ok(row); assert.equal(row.implementation_address, entry); assert.equal(row.runtime_witness_table, 'not_instantiated');
  const position = starts.indexOf(BigInt(entry)); assert.notEqual(position, -1); assert.ok(seedText.split('\n').includes(`${entry}\tfunction`));
  targets.push({ type_name: name, entry, source_evidence_id: record.evidence_id, conformance: row.conformance.address, requirement_symbol: row.requirement_reference.symbol, runtime_witness_table: row.runtime_witness_table, exact_lc_function_start: true, next_indexed_start: `0x${starts[position + 1].toString(16)}`, indexed_interval_bytes: Number(starts[position + 1] - starts[position]), interval_is_not_complete_body_proof: true });
}
const steps = targets.flatMap(row => [
  { name: 'read_function_instructions', arguments: { procedure: row.entry }, label: `selector-view-${row.type_name}-body-instructions` },
  { name: 'procedure_pseudo_code', arguments: { procedure: row.entry }, label: `selector-view-${row.type_name}-body-pseudocode` },
]);
const valueCatalog = await read('persistent-selector-evidence/catalog.json'), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('selector-views.steps.json', { authority: 'Prepared follow-up from exact importedSwiftUIbodyrequirement identities; no provider requests executed by this preparation', target_sha256: expected, execution: 'Parent owns continuation files. Append these steps to its existing persistent frozen076 session, using the captured merged seeds and actual advertised schemas. No final session cleanup is claimed while the session remains open.', steps });
await save('selector-views-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, frozen_source_commit: manifest.source_commit, phase_bundle: 'persistent-selector-evidence/phase-0-bundle.json', phase_bundle_records: bundle.records.length, session_finalized: false, source_function_index_evidence_id: index.evidence_id, targets, seed_sha256: createHash('sha256').update(seedText).digest('hex'), proposed_requests_schema_checked: 4, proposed_requests_executed: 0 });
console.log(JSON.stringify({ status: 'passed', targets: targets.map(row => row.entry), schema_checked_requests: 4, provider_calls_executed: 0, session_finalized: false }));
