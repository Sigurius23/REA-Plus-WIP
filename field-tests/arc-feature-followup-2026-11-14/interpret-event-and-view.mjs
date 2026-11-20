import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const hash = value => createHash('sha256').update(value).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestBytes = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json'));
const manifest = JSON.parse(manifestBytes);
assert.equal(manifest.source_commit, '076c706c6e06257190c5303fa8aec5de1d2e649f');
assert.equal(new Set(manifest.files.map(row => row.path)).size, manifest.files.length);
// Authenticate the isolated runtime, never the concurrently edited current Java tree.
for (let offset = 0; offset < manifest.files.length; offset += 32) {
  await Promise.all(manifest.files.slice(offset, offset + 32).map(async entry => {
    const filename = path.resolve(manifest.runtime_package, entry.path);
    assert.ok(filename.startsWith(`${path.resolve(manifest.runtime_package)}${path.sep}`));
    const bytes = await fs.readFile(filename);
    assert.equal(bytes.length, entry.bytes, entry.path);
    assert.equal(hash(bytes), entry.sha256, entry.path);
  }));
}
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const records = new Map(), references = [];
for (const name of (await fs.readdir(path.join(directory, 'event-and-view-evidence'))).filter(name => name.endsWith('.evidence.json')).sort()) {
  const raw = await fs.readFile(path.join(directory, 'event-and-view-evidence', name));
  const record = parseEvidence(JSON.parse(raw)); assert.equal(record.subject.digest.sha256, expected);
  records.set(name.replace('.evidence.json', ''), record);
  references.push({ path: `event-and-view-evidence/${name}`, evidence_id: record.evidence_id, file_sha256: hash(raw), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null });
}
assert.equal(records.size, 4);
const bundle = parseEvidenceBundle(await read('event-and-view-evidence/evidence-bundle.json'));
assert.equal(bundle.records.length, 4);
assert.deepEqual(new Set(bundle.records.map(record => record.evidence_id)), new Set(references.map(row => row.evidence_id)));
const summary = await read('event-and-view-evidence/summary.json');
assert.equal(summary.status, 'completed'); assert.equal(summary.calls, 7); assert.equal(summary.successful, 7); assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const invocations = await read('event-and-view-evidence/invocations.json');
const close = invocations.find(row => row.name === 'close_binary'); assert.ok(close && !close.is_error && !close.thrown);
assert.ok(invocations.some(row => row.name === 'export_evidence_bundle' && !row.is_error));
const instructionRecord = records.get('selector-new-starter-caller-instructions');
const instructions = instructionRecord.normalized_result.instructions;
for (const instruction of [
  '0x1012f0050: ldrb w25, [x0, #0x10]',
  '0x1012f0054: ldp x19, x20, [x1, #0x40]',
  '0x1012f0058: ldrb w21, [x1, #0x50]',
  '0x1012f0098: bl 0x103636724',
  '0x1012f009c: mov x20, x0',
  '0x1012f00a8: stp x24, x23, [x0, #0x20]',
  '0x1012f00ac: strb w25, [x0, #0x30]',
  '0x1012f00b0: cmp w25, #0x1',
  '0x1012f00bc: add x0, x0, #0x10',
  '0x1012f00cc: add x0, x0, #0x38',
  '0x1012f00f4: bl 0x103636088',
  '0x1012f0114: cmp w8, #0x1',
  '0x1012f0118: b.eq 0x1012f014c',
  '0x1012f011c: fmov v1.2D, #0x3fe0000000000000',
  '0x1012f0120: fmul v0.2D, v0.2D, v1.2D',
  '0x1012f0124: frinta v0.2D, v0.2D',
  '0x1012f0128: fadd v0.2D, v0.2D, v0.2D',
  '0x1012f0130: fmul v1.2D, v2.2D, v1.2D',
  '0x1012f0134: frinta v1.2D, v1.2D',
  '0x1012f0138: fadd v2.2D, v1.2D, v1.2D',
  '0x1012f0144: bl 0x10363dbc4',
  '0x1012f0148: cbnz w0, 0x1012f0150',
  '0x1012f014c: bl 0x1012e4d6c',
]) assert.ok(instructions.includes(instruction), instruction);
const pseudocode = records.get('selector-new-starter-caller-pseudocode').normalized_result;
assert.ok(pseudocode.includes('StateObjectV12wrappedValue'));
assert.ok(pseudocode.includes('_CGPointEqualToPoint'));
assert.ok(pseudocode.includes('UNK_10378c010') && pseudocode.includes('UNK_10378c038'));
const incoming = records.get('selector-new-starter-caller-inputs').normalized_result;
const codeEdges = incoming.references.filter(row => row.source_procedure?.address !== incoming.procedure.address && row.kind.flow);
assert.equal(codeEdges.length, 1); assert.equal(codeEdges[0].source_procedure.address, '0x1012f0174');
assert.equal(codeEdges[0].source_address, '0x1012f017c'); assert.equal(codeEdges[0].kind.type, 'UNCONDITIONAL_JUMP');
const conformanceRecord = records.get('exact-boost-editor-view-conformances');
const metadata = conformanceRecord.normalized_result.result;
assert.equal(metadata.swift_conformances.length, 1);
assert.equal(metadata.swift_conformances[0].type_name, 'BoostsEditorView');
assert.equal(metadata.swift_conformances[0].protocol_reference.symbol, '_$s7SwiftUI4ViewMp');
const body = metadata.swift_resilient_witnesses.filter(row => row.requirement_reference?.symbol === '_$s7SwiftUI4ViewP4body4BodyQzvgTq');
assert.equal(body.length, 1); assert.equal(body[0].record_ordinal, 5); assert.equal(body[0].implementation_address, '0x1012d1ccc');
assert.equal(body[0].runtime_witness_table, 'not_instantiated');
const prepared = await read('body-and-thunk-preparation.json'); assert.equal(prepared.status, 'passed'); assert.equal(prepared.proposed_requests_executed, 0);
assert.deepEqual(prepared.entries.map(row => row.entry), ['0x1012d1ccc', '0x1012f0174']);

const trackedConformancePath = 'field-tests/arc-persistence-routes-2026-11-08/overlay-metadata/type-HoveredElementTracker.evidence.json';
const trackedConformance = parseEvidence(JSON.parse(await fs.readFile(path.join(root, trackedConformancePath), 'utf8')));
assert.equal(trackedConformance.subject.digest.sha256, expected);
assert.ok(trackedConformance.normalized_result.result.swift_conformances.some(row => row.type_name === 'HoveredElementTracker' && row.location.address === '0x10378b278'));
const facts = {
  schema_version: 1, snapshot_date: '2026-11-14', status: 'verified-with-open-origin-and-rendering', target_sha256: expected,
  authority: 'Static shipped-artifact observations authenticated with the isolated076runtime; instruction-level analyst interpretation, not target execution',
  frozen_runtime: { source_commit: manifest.source_commit, manifest: 'frozen-runtime-manifest.json', manifest_sha256: hash(manifestBytes), runtime_package: manifest.runtime_package, matched_files: manifest.files.length, current_tree_java_or_build_used: false },
  session: { calls: 7, successful: 7, errors: 0, evidence_records: 4, explicit_close_ms: close.elapsed_ms, verified_empty_descendants: true, analysis_profile_digest: instructionRecord.analysis_profile.digest, initial_analysis_timeout_seconds: 1, analysis_complete: false },
  point_callback: {
    entry: '0x1012f0028', body_bytes: instructionRecord.normalized_result.procedure.body.total_bytes,
    input_layout: { coordinate_double_offsets: ['0x0', '0x8'], flag_byte_offset: '0x10' },
    context_state_object_layout: { words: ['0x40', '0x48'], flag_byte: '0x50' },
    receiver: { selected_route: 'StateObject.wrappedValue using accessor0x1012e5260 and conformance0x10378b278', prior_conformance_type: 'HoveredElementTracker', prior_conformance_evidence_id: trackedConformance.evidence_id, runtime_instance_observed: false },
    point_write: { coordinate_offsets: ['0x20', '0x28'], flag_offset: '0x30', occurs_before_filtering: true },
    absent_input_branch: { flag_value: 1, output: 'Published setter with four zero words and flag1', keypaths: ['0x10378c010', '0x10378c038'], starts_query: false, equivalence_to_previous_keypath_pair_proved: false },
    present_input_branch: { prior_flag1: 'call task starter', prior_point_present: 'compare quantized old/new coordinates; skip starter when equal', quantization_for_finite_coordinates: 'Q(x) = 2 * roundTiesAwayFromZero(x / 2)', rounding_basis: 'FRINTA instructions; decompiler integer cast is not authoritative', units: 'coordinate units; physical pixels not established', unequal_output: 'call0x1012e4d6c' },
    origin_edge: { source_entry: '0x1012f0174', jump_site: '0x1012f017c', target: '0x1012f0028', kind: 'UNCONDITIONAL_JUMP' },
    physical_event_or_coordinate_space_proved: false,
  },
  view_body: { type_name: 'BoostsEditorView', protocol_bind: '_$s7SwiftUI4ViewMp', conformance: '0x103789dc0', requirement_bind: body[0].requirement_reference.symbol, record_ordinal: body[0].record_ordinal, record_location: body[0].location.address, implementation: body[0].implementation_address, runtime_witness_table: body[0].runtime_witness_table, ordinal_is_runtime_slot: false, body_instructions_analyzed: false, drawing_output_proved: false },
  next_batch: { path: 'body-and-thunk.steps.json', requests: 5, instructions_and_pseudocode: ['0x1012d1ccc', '0x1012f0174'], incoming_references: ['0x1012f0174'], exact_lc_entry_checks: prepared.entries, executed_by_this_interpretation: false },
  final_drawing_proved: false, persistence_proved: false, broader_arc_complete: false,
  limitations: ['Stable partial Program, not complete reference discovery.', 'Point quantization is stated in coordinate units and for finite coordinate values.', 'The absent-input setter uses new keypath pattern addresses; equivalence to the earlier getter/publication pair is not assumed.', 'Imported SwiftUI requirement identity identifies a static body witness implementation, not an instantiated runtime witness slot.', 'The initial event source and body effects remain to be traced.'],
  evidence: references,
};
await save('event-and-view-findings.json', facts);
await save('event-and-view-audit.json', { status: 'passed', checked_at: new Date().toISOString(), authority: 'Canonical captured Evidence/bundle authentication using content-verified frozen076runtime; no provider or mutable-source validation', frozen_runtime_manifest_sha256: hash(manifestBytes), frozen_runtime_files_checked: manifest.files.length, standalone_evidence: records.size, unique_evidence_ids: new Set(references.map(row => row.evidence_id)).size, bundles: 1, bundle_records: 4, public_calls: 7, public_errors: 0, explicit_close_ms: close.elapsed_ms, verifier_descendants: [], proposed_provider_calls_executed: 0, evidence: references });
console.log(JSON.stringify({ status: 'passed', frozen_runtime_files: manifest.files.length, canonical_evidence: records.size, body_witness: body[0].implementation_address, input_thunk: codeEdges[0].source_procedure.address, provider_calls_executed: 0 }));
