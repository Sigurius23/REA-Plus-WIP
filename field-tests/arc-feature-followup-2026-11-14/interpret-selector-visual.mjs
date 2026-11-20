import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestRaw = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json')), manifest = JSON.parse(manifestRaw);
for (let i = 0; i < manifest.files.length; i += 32) await Promise.all(manifest.files.slice(i, i + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const bundle = parseEvidenceBundle(await read('persistent-selector-evidence/phase-3-bundle.json')); assert.equal(bundle.records.length, 18);
const names = ['selector-installed-input-callback-instructions', 'selector-installed-input-callback-pseudocode', 'overlay-selector-branch-construction-instructions', 'overlay-selector-branch-construction-pseudocode', 'selector-visual-child-instructions', 'selector-visual-child-pseudocode', 'selector-input-helper-loaded-bytes'];
const records = {}, anchors = [];
for (const name of names) { const filename = `persistent-selector-evidence/${name}.evidence.json`, bytes = await fs.readFile(path.join(directory, filename)), record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected); assert.ok(bundle.records.some(row => row.evidence_id === record.evidence_id)); records[name] = record; anchors.push({ path: filename, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null }); }
const callback = records['selector-installed-input-callback-instructions'].normalized_result;
assert.deepEqual(callback.instructions, ['0x1012f0218: ldp x2, x3, [x20, #0x10]', '0x1012f021c: add x1, x20, #0x20', '0x1012f0220: b 0x1012f0180']);
const callbackPseudo = records['selector-installed-input-callback-pseudocode'].normalized_result;
for (const fragment of ['StateObjectV12wrappedValue', '*(undefined8 *)(lVar5 + 0x10) = uVar6', '*(undefined8 *)(lVar5 + 0x18) = uVar2', '_swift_unknownObjectRetain(uVar6)']) assert.ok(callbackPseudo.includes(fragment), fragment);
const ctor = records['overlay-selector-branch-construction-pseudocode'].normalized_result;
for (const fragment of ['FUN_1012edfb8', 'StateV12wrappedValue', 'param_1[1] = param_3', 'param_1[3] = param_5', 'param_1[2] = param_4']) assert.ok(ctor.includes(fragment));
const visual = records['selector-visual-child-pseudocode'].normalized_result, visualCode = records['selector-visual-child-instructions'].normalized_result;
assert.equal(visualCode.procedure.body.total_bytes, 2572);
for (const fragment of ['ColorV5white', '0x3f847ae147ae147b', '0x000100b0b828', 'FUN_1012f14dc', 'onTapGesture5count7perform', 'FUN_1012f14e8', 'UNK_10378c010', 'UNK_10378c038', 'FUN_1012f161c', 'thunk_FUN_1012f16d0', 'FUN_1012f1600']) assert.ok(visual.includes(fragment), fragment);
assert.ok(visualCode.instructions.includes('0x1012eea78: bl 0x100b0b828'));
assert.ok(visualCode.instructions.includes('0x1012eed54: stp x8, x24, [x19, #0x1c0]'));
const opacity = Buffer.alloc(8); opacity.writeBigUInt64LE(0x3f847ae147ae147bn); assert.equal(opacity.readDoubleLE(), 0.01);
const bytes = records['selector-input-helper-loaded-bytes'].normalized_result; assert.equal(bytes.address, '0x100b080a8'); assert.equal(bytes.complete, true); assert.equal(bytes.returned_bytes, 456);
const admissionRaw = await fs.readFile(path.join(directory, 'persistent-selector-evidence/selector-input-helper-admission.reply.json'));
const admissionReply = JSON.parse(admissionRaw); assert.equal(admissionReply.isError, true);
const error = JSON.parse(admissionReply.content.find(block => block.type === 'text').text).error;
assert.equal(error.code, 'invalid_request'); assert.equal(error.details.operation, 'procedure_info');
assert.ok(error.details.issues.some(row => row.message.includes('No procedure exists at the requested address: 0x100b080a8')));
const prep = await read('selector-tracking-and-rect-preparation.json'); assert.equal(prep.proposed_requests_schema_checked, 11); assert.equal(prep.proposed_requests_executed, 0);
await save('selector-visual-findings.json', {
  schema_version: 1, snapshot_date: '2026-11-14', status: 'phase-3-authenticated-session-open', target_sha256: expected,
  authority: 'Static selected function observations and explicit admission boundary; no live event, app or rendered output execution',
  frozen_runtime: { source_commit: manifest.source_commit, manifest_sha256: hash(manifestRaw), files_matched: manifest.files.length, mutable_current_source_used: false },
  exported_phase: { phase: 3, cumulative_records: 18, new_standalone_success_records: 7, retained_admission_errors: 1, persistent_session_finalized: false, cleanup_claimed: false },
  adaptor_assignment_callback: { thunk: '0x1012f0218', thunk_bytes: 12, tail_worker: '0x1012f0180', decompiler_observed_route: 'StateObject.wrappedValue receiver; replace retained object/witness at+0x10/+0x18 and release prior object', writes_point_coordinates: false, caveat: 'The assignment effect is decompiler output folding the tail worker; this thunk body itself is only three forwarding instructions.' },
  selector_constructor: { entry: '0x1012f952c', input: 'raw configuration byte, adaptor/helper and selection callback/context', output: 'SelectorPicker value with stored raw byte/helper/callback and initialized State values', initial_point_flag: 1, point_initial_words: [0, 0], another_optional_rectangle_initial_flag: 1, deferred_state_object_entry: '0x1012edfb8', source_state_case_names_proved: false },
  visual_child: { entry: '0x1012ee7e8', body_bytes: 2572, input_surface: { color: 'white', opacity: 0.01 }, tracking_modifier: { helper: '0x100b0b828', selected_flags: [1, 1], callback: '0x1012f14dc', physical_event_semantics_proved: false }, tap_registration: { api: 'SwiftUI.View.onTapGesture(count:perform:)', count: 1, callback: '0x1012f14e8', callback_effect_untraced: true }, rectangle_source: { primary: 'optional rectangle from local State', fallback: 'HoveredElementTracker Published getter via keypaths0x10378c010/0x10378c038', absent_both: 'omit the selected rectangle component', relationship_to_query_publication_keypaths_proved: false }, present_rectangle: { capture: 'four rectangle words', geometry_callback: '0x1012f161c', state_initialization: 'empty array in constructed component', final_geometry_application_or_stroke_proved: false }, alternate_present_state: { count1_tap_callback: 'thunk0x1012f16d0', stored_callback: '0x1012f1600', state_effects_untraced: true } },
  outside_helper_boundary: { address: '0x100b080a8', admission_reply: 'persistent-selector-evidence/selector-input-helper-admission.reply.json', admission_reply_sha256: hash(admissionRaw), code: error.code, message: error.details.issues[0].message, in_initial_seed_file: false, loaded_bytes_retained: 456, original_mapped_bytes_absent: false, global_function_absence_proved: false, new_product_bug_claimed: false },
  next_batch: { path: 'selector-tracking-and-rect.steps.json', requests: 11, targets: prep.targets, proposed_requests_executed_by_this_interpretation: false },
  limitations: ['The persistent session remains open; no final summary, close or cleanup is inferred.', 'The query-publication keypaths and render keypaths need their selected member indirection corroborated before equating them.', 'Physical pointer input and the registered tap callback effects remain to be traced.', 'The captured rectangle component is constructed, but final stroke/frame/position behavior is not yet recovered.', 'Coordinates are not labeled physical pixels.', 'Persistence and broader Arc behavior remain unproved.'], evidence: anchors,
});
await save('selector-visual-audit.json', { status: 'passed', checked_at: new Date().toISOString(), frozen_runtime_files_matched: manifest.files.length, canonical_standalone_success_records: 7, cumulative_phase_bundle_records: 18, retained_admission_error_replies: 1, immutable_phase: 3, persistent_session_finalized: false, cleanup_claimed: false, evidence: anchors });
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, standalone_success_records: 7, cumulative_phase_records: 18, retained_admission_errors: 1, persistent_session_finalized: false }));
