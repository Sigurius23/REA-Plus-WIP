import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const hash = value => createHash('sha256').update(value).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestBytes = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json'));
const manifest = JSON.parse(manifestBytes);
for (let offset = 0; offset < manifest.files.length; offset += 32) await Promise.all(manifest.files.slice(offset, offset + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
async function recordsIn(subdirectory) {
  const records = {}, anchors = [];
  for (const name of (await fs.readdir(path.join(directory, subdirectory))).filter(name => name.endsWith('.evidence.json')).sort()) {
    const bytes = await fs.readFile(path.join(directory, subdirectory, name)); const record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected);
    records[name.replace('.evidence.json', '')] = record; anchors.push({ path: `${subdirectory}/${name}`, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null });
  }
  return { records, anchors };
}
const { records, anchors } = await recordsIn('builder-continuation-evidence'); assert.equal(anchors.length, 12);
const bundle = parseEvidenceBundle(await read('builder-continuation-evidence/evidence-bundle.json')); assert.equal(bundle.records.length, 12);
assert.deepEqual(new Set(bundle.records.map(row => row.evidence_id)), new Set(anchors.map(row => row.evidence_id)));
const summary = await read('builder-continuation-evidence/summary.json'); assert.equal(summary.calls, 15); assert.equal(summary.successful, 15); assert.equal(summary.errors, 0); assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const calls = await read('builder-continuation-evidence/invocations.json'); const close = calls.find(row => row.name === 'close_binary'); assert.ok(close && !close.is_error && !close.thrown);
const code = name => records[`builder-continuation-${name}-instructions`].normalized_result;
const worker = code('0x1012d14b4');
for (const instruction of ['0x1012d14d8: ldrsw x8, [x0, #0x1c]', '0x1012d14e0: ldr x20, [x8, #0x8]', '0x1012d14e8: blr x19', '0x1012d1524: bl 0x1008492c0']) assert.ok(worker.instructions.includes(instruction));
const action = code('0x1012d1ddc'); assert.equal(action.procedure.body.total_bytes, 40);
for (const instruction of ['0x1012d1ddc: str xzr, [x0, #0x90]', '0x1012d1df8: mov w8, #0xb0000000', '0x1012d1dfc: str w8, [x0, #0x98]']) assert.ok(action.instructions.includes(instruction));
const child = code('0x1012ce284'); assert.equal(child.procedure.body.total_bytes, 688);
for (const instruction of ['0x1012ce328: bl 0x1012ce534', '0x1012ce368: mov x8, #0x402e000000000000', '0x1012ce394: bl 0x1012ce7d4', '0x1012ce3a0: fmov d0, 0x4032000000000000', '0x1012ce3f4: mov x8, #0x7ff0000000000000']) assert.ok(child.instructions.includes(instruction));
const childPseudo = records['builder-continuation-0x1012ce284-pseudocode'].normalized_result;
for (const fragment of ['HorizontalAlignmentV6center', 'EdgeO3SetV3all', 'EdgeInsetsV4_all', 'AlignmentV3top', '_FlexFrameLayout']) assert.ok(childPseudo.includes(fragment));
const loadedTypes = [];
for (const [ordinal, metadataAddress, descriptorAddress, typeName, nameAddress] of [[0, '0x104317858', '0x103d7b380', 'BoostsEditorCodeInputPanel', '0x103788fc0'], [1, '0x104318148', '0x103d7b588', 'BoostsEditorInterstitial', '0x103789940']]) {
  const metadata = records[`candidate-${ordinal}-metadata`].normalized_result, descriptor = records[`candidate-${ordinal}-descriptor`].normalized_result, name = records[`candidate-${ordinal}-type-name`].normalized_result;
  for (const value of [metadata, descriptor, name]) assert.equal(value.complete, true);
  const m = Buffer.from(metadata.bytes_hex, 'hex'), d = Buffer.from(descriptor.bytes_hex, 'hex'), n = Buffer.from(name.bytes_hex, 'hex');
  assert.equal(metadata.address, metadataAddress); assert.equal(m.readBigUInt64LE(0), 0x200n); assert.equal(m.readBigUInt64LE(8), BigInt(descriptorAddress));
  assert.equal(descriptor.address, descriptorAddress); assert.equal(d.readUInt32LE(0) & 31, 17);
  assert.equal(BigInt(descriptor.address) + 8n + BigInt(d.readInt32LE(8)), BigInt(nameAddress)); assert.equal(name.address, nameAddress);
  assert.equal(n.subarray(0, n.indexOf(0)).toString('utf8'), typeName);
  loadedTypes.push({ metadata: metadataAddress, descriptor: descriptorAddress, name_address: nameAddress, name: typeName, context_kind: 'struct', loaded_pointer_and_relative_name_corroborated: true });
}
const phaseBundle = parseEvidenceBundle(await read('persistent-selector-evidence/phase-0-bundle.json'));
const phaseAnchors = [], bodies = [];
for (const name of ['SelectorPicker', 'BoostsEditorOverlayView']) {
  const filename = `persistent-selector-evidence/selector-discovery-${name}.evidence.json`, bytes = await fs.readFile(path.join(directory, filename)), record = parseEvidence(JSON.parse(bytes));
  assert.equal(record.subject.digest.sha256, expected); assert.ok(phaseBundle.records.some(row => row.evidence_id === record.evidence_id));
  const witness = record.normalized_result.result.swift_resilient_witnesses.find(row => row.requirement_reference?.symbol === '_$s7SwiftUI4ViewP4body4BodyQzvgTq'); assert.ok(witness); assert.equal(witness.runtime_witness_table, 'not_instantiated');
  bodies.push({ type_name: name, conformance: witness.conformance.address, body_requirement: witness.requirement_reference.symbol, implementation: witness.implementation_address, runtime_witness_table: witness.runtime_witness_table });
  phaseAnchors.push({ path: filename, evidence_id: record.evidence_id, file_sha256: hash(bytes) });
}
const controllerName = 'persistent-selector-evidence/selector-discovery-overlay-controller.evidence.json';
const controllerRaw = await fs.readFile(path.join(directory, controllerName)), controller = parseEvidence(JSON.parse(controllerRaw));
assert.ok(phaseBundle.records.some(row => row.evidence_id === controller.evidence_id));
const resolved = controller.normalized_result.result.swift_dispatch_slots.filter(row => row.implementation_address);
assert.equal(resolved.length, 1); assert.equal(resolved[0].slot_index, 29); assert.equal(resolved[0].implementation_address, '0x1012f8bdc');
phaseAnchors.push({ path: controllerName, evidence_id: controller.evidence_id, file_sha256: hash(controllerRaw) });
const preparation = await read('selector-views-preparation.json'); assert.equal(preparation.proposed_requests_schema_checked, 4); assert.equal(preparation.session_finalized, false);
const common = { snapshot_date: '2026-11-14', target_sha256: expected, authority: 'Static shipped-artifact observations authenticated using the content-verified frozen076runtime; no runtime feature or current-source validation', frozen_runtime: { source_commit: manifest.source_commit, manifest_sha256: hash(manifestBytes), files_matched: manifest.files.length, mutable_current_source_used: false } };
await save('content-binding-findings.json', { ...common, status: 'verified-with-open-trigger-and-native-overlay', session: { calls: 15, successful: 15, errors: 0, standalone_evidence: 12, exported_bundle_records: 12, explicit_close_ms: close.elapsed_ms, verified_empty_descendants: true }, loaded_types: loadedTypes, deferred_body_action: { worker: '0x1012d14b4', receiver: 'view-store object obtained through captured-view metadata field offset', callback: '0x1012d1ddc', output_value_bytes: 156, zero_bytes: { start: '0x0', end_exclusive: '0x98' }, marker: { offset: '0x98', uint32: '0xb0000000' }, handoff: '0x1008492c0', source_action_case_or_trigger_name_proved: false, reducer_effects_proved: false }, child_content: { entry: '0x1012ce284', header_builder: '0x1012ce534', content_builder: '0x1012ce7d4', horizontal_alignment: 'center', spacing: 15, padding: { edges: 'all', amount: 18 }, flexible_frame: { alignment: 'top', maximum_height: '+infinity' }, units: 'coordinate units; no physical-pixel assertion', hover_callback_registration_proved: false }, evidence: anchors, broader_arc_complete: false });
await save('content-binding-audit.json', { status: 'passed', checked_at: new Date().toISOString(), frozen_runtime_manifest_sha256: hash(manifestBytes), frozen_runtime_files_matched: manifest.files.length, standalone_evidence: 12, unique_evidence_ids: new Set(anchors.map(row => row.evidence_id)).size, bundle_records: 12, calls: 15, errors: 0, explicit_close_ms: close.elapsed_ms, verifier_descendants: [], evidence: anchors });
await save('selector-discovery-findings.json', { ...common, status: 'phase-0-authenticated-session-still-open', authority: 'This receipt authenticates exactly the retained phase0 metadata records and phase0 bundle; it does not read or claim a final persistent-session summary or cleanup', phase_bundle: 'persistent-selector-evidence/phase-0-bundle.json', phase_bundle_records: phaseBundle.records.length, selected_bodies: bodies, selected_controller: { descriptor: '0x103d7c418', resolved_metadata_word_slot: 29, target: '0x1012f8bdc', meaning_untraced: true, runtime_instance_observed: false }, next_batch: { path: 'selector-views.steps.json', requests: 4, exact_lc_entries_and_schema_validated: true, executed_by_this_interpretation: false }, persistent_session_finalized: false, cleanup_claimed: false, evidence: phaseAnchors });
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, completed_session_evidence: 12, completed_session_calls: 15, phase0_records: phaseBundle.records.length, selected_bodies: bodies.map(row => row.implementation), persistent_session_finalized: false }));
