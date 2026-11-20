import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url)), root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const manifest = await read('runtime-manifest.json');
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const evidenceDirectory = 'mouse-and-spotlight-reopen/evidence';
const bundleBytes = await fs.readFile(path.join(directory, evidenceDirectory, 'phase-0-bundle.json')), bundle = parseEvidenceBundle(JSON.parse(bundleBytes)); assert.equal(bundle.records.length, 10);
const anchors = [], records = {};
for (const name of (await fs.readdir(path.join(directory, evidenceDirectory))).filter(name => name.endsWith('.evidence.json'))) { const bytes = await fs.readFile(path.join(directory, evidenceDirectory, name)), record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === record.evidence_id)); records[name] = record; anchors.push({ path: `${evidenceDirectory}/${name}`, evidence_id: record.evidence_id, sha256: hash(bytes), operation: record.operation }); }
assert.equal(anchors.length, 10); assert.equal(new Set(anchors.map(row => row.evidence_id)).size, 10);
const task = records['modifier-drawing-0x1012f44f8-pseudocode.evidence.json']; assert.ok(task.normalized_result.includes('FUN_1012f3f54'));
const body = records['modifier-drawing-0x100b0c498-instructions.evidence.json']; assert.ok(body.normalized_result.instructions.includes('0x100b0c514: add x1, x1, #0xf88'));
const objcPath = 'field-tests/arc-dispatch-2026-11-06/objc-metadata.evidence.json', objcBytes = await fs.readFile(path.join(root, objcPath)), objc = parseEvidence(JSON.parse(objcBytes)); assert.equal(objc.subject.digest.sha256, expected);
const coordinator = objc.normalized_result.result.objc_classes.find(row => !row.is_meta_class && row.name === '_TtCVV5ARCUI17MouseMoveModifierP33_D363D456F83E5AC946BB5507AA378E6113Representable11Coordinator'); assert.ok(coordinator); assert.equal(coordinator.super_class, 'NSResponder');
const moved = coordinator.methods.find(row => row.selector === 'mouseMoved:'), exited = coordinator.methods.find(row => row.selector === 'mouseExited:'); assert.equal(moved.address, 0x100b0be48); assert.equal(exited.address, 0x100b0be98);
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8'))); assert.equal(index.subject.digest.sha256, expected);
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let current = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; current += value; starts.push(current); value = shift = 0n; }
const seedBytes = await fs.readFile(task.analysis_profile.parameters.analysis_seeds.path); assert.equal(hash(seedBytes), task.analysis_profile.parameters.analysis_seeds.sha256); const seedLines = seedBytes.toString('utf8').split('\n');
const targets = ['0x100b0be48', '0x100b0be98', '0x1012f3f54'].map(entry => { const i = starts.indexOf(BigInt(entry)); assert.notEqual(i, -1); assert.ok(seedLines.includes(`${entry}\tfunction`)); return { entry, next_indexed_start: `0x${starts[i + 1].toString(16)}`, indexed_interval_bytes: Number(starts[i + 1] - starts[i]), interval_is_not_complete_body_proof: true }; });
const steps = [...targets.flatMap(row => [{ name: 'read_function_instructions', arguments: { procedure: row.entry }, label: `event-result-${row.entry}-instructions` }, { name: 'procedure_pseudo_code', arguments: { procedure: row.entry }, label: `event-result-${row.entry}-pseudocode` }]), { name: 'read_bytes', arguments: { address: '0x103715f80', length: 96 }, label: 'mouse-modifier-body-type-references' }];
const valueCatalog = await read(`${evidenceDirectory}/catalog.json`), catalog = Array.isArray(valueCatalog) ? valueCatalog : valueCatalog.tools; const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of steps) { const tool = catalog.find(row => row.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = async (name, value) => { const output = path.join(directory, name); try { await fs.access(output); throw new Error(`Refusing to overwrite ${name}`); } catch (error) { if (error.code !== 'ENOENT') throw error; } await fs.writeFile(output, `${JSON.stringify(value, null, 2)}\n`); };
await save('event-and-result.steps.json', { authority: 'Prepared from authenticated immutable-v8 reopened phase-0 observations and retained fixed-input Objective-C metadata; no provider calls by preparation', target_sha256: expected, execution: 'Parent owns the current persistent session continuation. All native targets already exist in the2034seed set. Class/method identity does not establish a live instance or installed tracking area.', steps });
await save('event-and-result-preparation.json', { status: 'passed', target_sha256: expected, source_evidence: anchors, source_objc_metadata: { path: objcPath, sha256: hash(objcBytes), evidence_id: objc.evidence_id, class_name: coordinator.name, class_address: coordinator.location.address, superclass: coordinator.super_class, methods: [moved, exited] }, function_index_evidence_id: index.evidence_id, targets, seed_sha256: hash(seedBytes), proposed_requests_schema_checked: steps.length, provider_calls_executed: 0 });
await save('mouse-and-spotlight-phase-0-audit.json', { status: 'passed', source_commit: manifest.source_commit, bundle_sha256: hash(bundleBytes), cumulative_unique_records: 10, profile_digest: task.analysis_profile.digest, seed_count: task.analysis_profile.parameters.analysis_seeds.entries.function, records: anchors, current_java_or_build_used: false, session_finalized: false, cleanup_claimed: false });
console.log(JSON.stringify({ status: 'passed', canonical_records: anchors.length, requests: steps.length, targets: targets.map(row => row.entry) }));
