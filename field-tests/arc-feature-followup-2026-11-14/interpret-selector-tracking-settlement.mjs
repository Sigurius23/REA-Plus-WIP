import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url)), root = path.resolve(directory, '../..');
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestBytes = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json')), manifest = JSON.parse(manifestBytes);
for (let i = 0; i < manifest.files.length; i += 32) await Promise.all(manifest.files.slice(i, i + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const records = {}, anchors = [];
for (const name of (await fs.readdir(path.join(directory, 'persistent-selector-evidence'))).filter(name => name.endsWith('.evidence.json')).sort()) {
  const filename = `persistent-selector-evidence/${name}`, bytes = await fs.readFile(path.join(directory, filename)), record = parseEvidence(JSON.parse(bytes));
  assert.equal(record.subject.digest.sha256, expected); records[name.replace('.evidence.json', '')] = record;
  anchors.push({ path: filename, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null });
}
assert.equal(anchors.length, 28); assert.equal(new Set(anchors.map(row => row.evidence_id)).size, 28);
const bundles = [];
for (const [phase, count] of [[0, 3], [1, 7], [2, 11], [3, 18], [4, 28]]) { const bytes = await fs.readFile(path.join(directory, `persistent-selector-evidence/phase-${phase}-bundle.json`)), bundle = parseEvidenceBundle(JSON.parse(bytes)); assert.equal(bundle.records.length, count); for (const record of bundle.records) assert.ok(anchors.some(row => row.evidence_id === record.evidence_id)); bundles.push({ phase, records: count, file_sha256: hash(bytes) }); }
const summary = await read('persistent-selector-evidence/summary.json'), invocations = await read('persistent-selector-evidence/invocations.json');
assert.equal(summary.status, 'completed'); assert.equal(summary.calls, 36); assert.equal(summary.successful, 34); assert.equal(summary.errors, 2);
assert.equal(invocations.length, 36); assert.equal(invocations.some(row => row.name === 'close_binary'), false);
assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const logBytes = await fs.readFile(path.join(directory, 'persistent-selector-run.log')), log = logBytes.toString('utf8');
assert.ok(log.includes('"event":"continuation-expired"') && log.includes('persistent-selector-phase-5.json'));
const code = name => records[name].normalized_result;
const trackingInstructions = code('selector-tracking-0x1012f14dc-instructions').instructions;
assert.deepEqual(trackingInstructions, ['0x1012f14dc: ldp x2, x3, [x20, #0x10]', '0x1012f14e0: add x1, x20, #0x20', '0x1012f14e4: b 0x1012ef1f4']);
const tracking = code('selector-tracking-0x1012f14dc-pseudocode');
for (const fragment of ['*(char *)(param_1 + 4)', 'uStack_58 = param_1[1]', 'uStack_60 = *param_1', 'StateV12wrappedValuexvs']) assert.ok(tracking.includes(fragment));
const tap = code('selector-tracking-0x1012f14e8-pseudocode');
for (const fragment of ['if (cStack_d0 ==', 'if ((char)uStack_f0 !=', 'UNK_10378c010', 'UNK_10378c038', 'StateV12wrappedValuexvs', 'FUN_1012f311c(0,0,puVar3,&UNK_10378c0e0']) assert.ok(tap.includes(fragment), fragment);
const rect = code('selector-tracking-0x1012f161c-instructions').instructions;
for (const instruction of ['0x1012f1624: ldr x9, [x0, #0x10]', '0x1012f1628: cmp x9, #0x0', '0x1012f1638: and v2.16B, v0.16B, v2.16B', '0x1012f1640: cset w9, ne', '0x1012f1644: stp q0, q2, [x8]', '0x1012f1648: strb w9, [x8, #0x20]', '0x1012f164c: str x0, [x8, #0x28]']) assert.ok(rect.includes(instruction));
const newKeypath = code('selector-render-keypath-patterns'), memberSlot = code('selector-render-keypath-indirect-member');
assert.equal(newKeypath.complete, true); assert.equal(memberSlot.complete, true);
const newBytes = Buffer.from(newKeypath.bytes_hex, 'hex'), slotBytes = Buffer.from(memberSlot.bytes_hex, 'hex');
const oldRecord = parseEvidence(await read('native-evidence/hover-task-descriptor-and-keypath-bytes.evidence.json'));
const oldValue = oldRecord.normalized_result, oldBytes = Buffer.from(oldValue.bytes_hex, 'hex').subarray(Number(0x10378b2c8n - BigInt(oldValue.address)));
const oldBase = 0x10378b2c8n, newBase = BigInt(newKeypath.address), relative = (bytes, offset, base) => base + BigInt(offset) + BigInt(bytes.readInt32LE(offset));
const oldRoot = relative(oldBytes, 8, oldBase), oldValueType = relative(oldBytes, 12, oldBase), oldMember = relative(oldBytes, 28, oldBase);
assert.equal(relative(newBytes, 8, newBase), oldRoot); assert.equal(relative(newBytes, 12, newBase), oldValueType);
assert.equal(relative(newBytes, 28, newBase), BigInt(memberSlot.address)); assert.equal(slotBytes.readBigUInt64LE(0), oldMember); assert.equal(oldMember, 0x103d7bd2cn);
const getterThunk = relative(newBytes, 32, newBase); assert.equal(getterThunk, 0x1012f14d4n);
const classPath = 'field-tests/arc-selector-rendering-2026-11-09/selection-after/arc-hover-class.evidence.json';
const classRecord = parseEvidence(JSON.parse(await fs.readFile(path.join(root, classPath), 'utf8')));
const classGetter = classRecord.normalized_result.result.swift_dispatch_slots.find(row => row.location.address === '0x103d7bd2c'); assert.ok(classGetter); assert.equal(classGetter.implementation_address, '0x1012e4cec');
const alternate = records['exact-overlay-alternate-branch-conformance'], alt = alternate.normalized_result.result;
assert.equal(alt.swift_conformances[0].type_name, 'SelectorSpotlight');
const body = alt.swift_resilient_witnesses.find(row => row.requirement_reference?.symbol === '_$s7SwiftUI4ViewP4body4BodyQzvgTq'); assert.ok(body); assert.equal(body.implementation_address, '0x1012f4464'); assert.equal(body.runtime_witness_table, 'not_instantiated');
const errors = [];
for (const name of ['selector-input-helper-admission', 'selector-tracking-helper-admission']) { const reply = await read(`persistent-selector-evidence/${name}.reply.json`); assert.equal(reply.isError, true); const error = JSON.parse(reply.content.find(row => row.type === 'text').text).error; assert.equal(error.code, 'invalid_request'); assert.ok(error.details.issues[0].message.includes('No procedure exists at the requested address')); errors.push({ reply: `persistent-selector-evidence/${name}.reply.json`, code: error.code, message: error.details.issues[0].message, scope: 'not admitted as a function in the stable partial Program; loaded bytes exist' }); }
const prep = await read('selector-reopen-preparation.json'); assert.equal(prep.new_seed_functions, 1951); assert.equal(prep.proposed_requests_schema_checked, 7);
await save('selector-tracking-findings-2026-11-15.json', {
  schema_version: 1, snapshot_date: '2026-11-15', target_sha256: expected, status: 'phases-3-and-4-authenticated-prior-session-expired',
  authority: 'Static source-selected observations and explicitly marked keypath ABI derivation, authenticated using frozen076runtime; no live event, target execution or mutable-source check',
  frozen_runtime: { source_commit: manifest.source_commit, manifest_sha256: hash(manifestBytes), files_matched: manifest.files.length },
  prior_session: { calls: 36, successful: 34, errors: 2, cumulative_evidence: 28, phase_bundles: bundles, continuation_expired: 5, explicit_close_binary: false, recorder_finalization: 'client/transport shutdown', verified_empty_descendants: true, observed_at: summary.verifier_run.process_lineage.observed_at, log_sha256: hash(logBytes), cleanup_or_filesystem_removal_proved: false },
  point_state_producer: { thunk: '0x1012f14dc', worker: '0x1012ef1f4', input: 'four words plus flag byte at0x20; physical type/coordinate source unproved', present_input: 'first two words copied into pointState; flag0', absent_input: 'zero point words and flag1', output: 'SwiftUI.State.wrappedValue setter for the point value already bound to callback0x1012f0174', complete_static_update_chain_recovered: true, physical_mouse_event_proved: false },
  tap_transition: { registered_count: 1, thunk: '0x1012f14e8', worker: '0x1012ef264', preconditions: ['stored optional rectangle absent', 'current optional point present', 'tracker published rectangle present'], state_effect: 'copy current tracker rectangle into stored rectangle State', subsequent_effect: 'schedule MainActor-associated task with captured view and point', task_descriptor: '0x10378c0e0', async_operation_body_not_yet_recovered: true },
  rectangle_model_projection: { entry: '0x1012f161c', input_word_test: 'input+0x10 ==0', zero_case: 'output captured four rectangle words and flag0', nonzero_case: 'output zero rectangle words and flag1', also_retained: 'input object/array storage at output+0x28 with following flag0', input_count_interpretation: 'consistent with caller State initialized to an empty Array; element type unproved', final_drawing_or_coordinate_conversion: false },
  keypath_member_derivation: { authority: 'Analyst interpretation of selected relative fields and public loaded indirection, not an automatic general keypath decoder', query_wrapped_pattern: '0x10378b2c8', render_wrapped_pattern: '0x10378c010', shared_root_type_reference: `0x${oldRoot.toString(16)}`, shared_value_type_reference: `0x${oldValueType.toString(16)}`, direct_member_descriptor: `0x${oldMember.toString(16)}`, indirect_member_slot: memberSlot.address, indirect_loaded_value: `0x${slotBytes.readBigUInt64LE(0).toString(16)}`, getter_implementation_from_prior_class_metadata: classGetter.implementation_address, prior_class_evidence_id: classRecord.evidence_id, render_getter_thunk_candidate: `0x${getterThunk.toString(16)}`, conclusion: 'the selected wrapped patterns identify the same computed property under the stated ABI interpretation', raw_getter_thunk_instruction_corroboration_pending: true },
  alternate_overlay: { type_name: 'SelectorSpotlight', conformance: '0x10378c1c0', body_requirement: body.requirement_reference.symbol, body: body.implementation_address, runtime_witness_table: body.runtime_witness_table, drawing_body_unread: true },
  scoped_admission_errors: errors,
  next_reopen: { steps: 'selector-reopen.steps.json', requests: 7, seed_file: 'selector-reopen-seeds.tsv', seed_functions: 1951, added_exact_lc_entries: prep.added_function_entries, original_seed_file_unchanged: true, proposed_requests_executed_by_this_interpretation: false },
  remaining: ['physical tracking/input helper implementation', 'tap async operation and selection result effects', 'SelectorSpotlight shape/frame/stroke/position output', 'native window placement and coordinate space', 'durable Boost write/readback and broader Arc features'],
  evidence: anchors,
});
await save('selector-tracking-settlement-audit.json', { status: 'passed', checked_at: new Date().toISOString(), frozen_runtime_files_matched: manifest.files.length, standalone_evidence: 28, unique_evidence_ids: 28, phase_bundles: bundles, calls: 36, successful: 34, retained_admission_errors: 2, explicit_close_binary: false, continuation_expired: 5, verifier_descendants: [], filesystem_cleanup_proved: false, evidence: anchors });
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, canonical_evidence: 28, calls: 36, successful: 34, errors: 2, explicit_close: false, verified_descendants: 0, spotlight_body: body.implementation_address }));
