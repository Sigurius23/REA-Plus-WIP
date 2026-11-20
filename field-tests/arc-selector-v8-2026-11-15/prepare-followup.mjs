import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url)), root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const manifestBytes = await fs.readFile(path.join(directory, 'runtime-manifest.json')), manifest = JSON.parse(manifestBytes);
for (let i = 0; i < manifest.files.length; i += 32) await Promise.all(manifest.files.slice(i, i + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const bundleBytes = await fs.readFile(path.join(directory, 'evidence/phase-0-bundle.json')), bundle = parseEvidenceBundle(JSON.parse(bundleBytes));
assert.equal(bundle.records.length, 8);
const filenames = (await fs.readdir(path.join(directory, 'evidence'))).filter(name => name.endsWith('.evidence.json'));
const records = {}, anchors = [];
for (const name of filenames) { const bytes = await fs.readFile(path.join(directory, 'evidence', name)), record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === record.evidence_id)); records[name] = record; anchors.push({ path: `evidence/${name}`, evidence_id: record.evidence_id, sha256: hash(bytes), operation: record.operation }); }
assert.equal(anchors.length, 8); assert.equal(new Set(anchors.map(row => row.evidence_id)).size, 8);
const metadata = records['exact-mouse-move-modifier-conformances.evidence.json'].normalized_result.result;
const witness = metadata.swift_resilient_witnesses.find(row => row.requirement_reference?.symbol === '_$s7SwiftUI12ViewModifierP4body7content4BodyQzAA01_cD8_ContentVyxG_tFTq');
assert.ok(witness); assert.equal(witness.implementation_address, '0x100b0c498'); assert.equal(witness.runtime_witness_table, 'not_instantiated');
const render = records['selector-render-query-0x1012f3660-instructions.evidence.json'];
assert.ok(render.normalized_result.instructions.includes('0x1012f36c8: add x8, x8, #0x6c8'));
const query = records['selector-render-query-0x1012e6bc8-instructions.evidence.json'];
for (const instruction of ['0x1012e6c44: add x8, x8, #0xfb0', '0x1012e6c48: sub x8, x8, #0x20']) assert.ok(query.normalized_result.instructions.includes(instruction));
assert.ok(records['selector-render-query-0x1012f44a0-pseudocode.evidence.json'].normalized_result.includes('UNK_10378c240'));
const indexPath = path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), index = parseEvidence(JSON.parse(await fs.readFile(indexPath, 'utf8')));
assert.equal(index.subject.digest.sha256, expected);
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seedBytes = await fs.readFile(render.analysis_profile.parameters.analysis_seeds.path); assert.equal(hash(seedBytes), render.analysis_profile.parameters.analysis_seeds.sha256);
const seedLines = seedBytes.toString('utf8').split('\n');
const targets = ['0x1012f46c8', '0x100b0c498'].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); return { entry, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), interval_is_not_complete_body_proof: true, explicit_seed: seedLines.includes(`${entry}\tfunction`) }; });
assert.equal(targets[0].explicit_seed, true); assert.equal(targets[1].explicit_seed, false); assert.equal(targets[1].indexed_interval_bytes, 192);
const steps = [
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f46c8' }, label: 'spotlight-render-closure-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f46c8' }, label: 'spotlight-render-closure-pseudocode' },
  { name: 'read_bytes', arguments: { address: '0x10378c240', length: 8 }, label: 'spotlight-string-task-descriptor' },
  { name: 'read_bytes', arguments: { address: '0x103a1dfb0', length: 48 }, label: 'tap-point-query-prefix' },
  { name: 'procedure_info', arguments: { procedure: '0x100b0c498' }, label: 'mouse-modifier-body-admission' },
  { name: 'read_bytes', arguments: { address: '0x100b0c498', length: 192 }, label: 'mouse-modifier-body-loaded-bytes' },
];
const valueCatalog = await read('evidence/catalog.json'), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of steps) { const tool = catalog.find(row => row.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = async (name, value) => { const output = path.join(directory, name); try { await fs.access(output); throw new Error(`Refusing to overwrite ${name}`); } catch (error) { if (error.code !== 'ENOENT') throw error; } await fs.writeFile(output, `${JSON.stringify(value, null, 2)}\n`); };
await save('next.steps.json', { authority: 'Prepared from the authenticated immutable-v8 phase-0 records; no public requests executed here', target_sha256: expected, execution: 'Parent owns the live persistent session and phase continuation. The modifier body has no explicit seed; its procedure_info may report missing admission. Loaded bytes remain a separate bounded observation. No provider restart requested.', steps });
await save('phase-0-audit.json', { status: 'passed', source_commit: manifest.source_commit, runtime_manifest_sha256: hash(manifestBytes), frozen_files_matched: manifest.files.length, bundle_sha256: hash(bundleBytes), unique_records: anchors.length, profile_digest: render.analysis_profile.digest, records: anchors, session_finalized: false, cleanup_claimed: false, current_java_or_build_used: false });
await save('next-preparation.json', { status: 'passed', target_sha256: expected, source_evidence_ids: anchors.map(row => row.evidence_id), source_function_index_evidence_id: index.evidence_id, targets, exact_body_requirement: witness.requirement_reference.symbol, static_witness_implementation: witness.implementation_address, runtime_witness_table: witness.runtime_witness_table, proposed_requests_schema_checked: steps.length, provider_calls_executed: 0 });
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, canonical_records: anchors.length, next_requests: steps.length, modifier_body_admitted: false }));
