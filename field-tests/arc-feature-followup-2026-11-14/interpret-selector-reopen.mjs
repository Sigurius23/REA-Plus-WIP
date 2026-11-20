import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestBytes = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json')), manifest = JSON.parse(manifestBytes);
for (let i = 0; i < manifest.files.length; i += 32) await Promise.all(manifest.files.slice(i, i + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const bundles = [];
for (const [phase, count] of [[0, 7], [1, 8], [2, 13]]) { const raw = await fs.readFile(path.join(directory, `selector-reopen-evidence/phase-${phase}-bundle.json`)), bundle = parseEvidenceBundle(JSON.parse(raw)); assert.equal(bundle.records.length, count); bundles.push({ phase, records: count, sha256: hash(raw), bundle }); }
const filenames = [
  ...['0x100b080a8', '0x100b0b828', '0x1012f4464'].flatMap(entry => [`reopened-selector-${entry}-instructions`, `reopened-selector-${entry}-pseudocode`]),
  'selector-tap-task-descriptor', 'published-rectangle-getter-thunk', 'exact-selector-tracking-modifier-metadata',
  'selector-spotlight-content-instructions', 'selector-spotlight-content-pseudocode', 'selector-tap-async-entry-instructions', 'selector-tap-async-entry-pseudocode',
];
const records = {}, anchors = [];
for (const name of filenames) { const filename = `selector-reopen-evidence/${name}.evidence.json`, bytes = await fs.readFile(path.join(directory, filename)), record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected); assert.ok(bundles[2].bundle.records.some(row => row.evidence_id === record.evidence_id)); records[name] = record; anchors.push({ path: filename, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null }); }
assert.equal(anchors.length, 13); assert.equal(new Set(anchors.map(row => row.evidence_id)).size, 13);
for (const row of bundles) for (const record of row.bundle.records) assert.ok(anchors.some(anchor => anchor.evidence_id === record.evidence_id));
const life = records['reopened-selector-0x100b080a8-pseudocode'].normalized_result;
for (const fragment of ['_AppearanceActionModifier', 'ViewPAAE8onAppear7perform', 'DAT_100b08400', 'ViewPAAE8onChange2of7perform']) assert.ok(life.includes(fragment));
const modifier = records['reopened-selector-0x100b0b828-pseudocode'].normalized_result;
for (const fragment of ['UNK_103715dc0', 'ViewPAAE8modifiery', 'UNK_1042acfa8']) assert.ok(modifier.includes(fragment));
const getter = records['published-rectangle-getter-thunk'].normalized_result; assert.deepEqual(getter.instructions, ['0x1012f14d4: b 0x1012e54d8']);
const metadata = records['exact-selector-tracking-modifier-metadata'].normalized_result; assert.equal(metadata.complete, true); assert.equal(metadata.address, '0x1042acfa8'); const m = Buffer.from(metadata.bytes_hex, 'hex'); assert.equal(m.readBigUInt64LE(0), 0x200n); assert.equal(m.readBigUInt64LE(8), 0x103d5c1c4n);
const spotlight = records['selector-spotlight-content-pseudocode'].normalized_result, spotlightInstructions = records['selector-spotlight-content-instructions'].normalized_result.instructions;
for (const fragment of ['SwiftUI6ZStack', 'FUN_1012f3660', 'FUN_1012f44a0', 'PTR___sSSN']) assert.ok(spotlight.includes(fragment));
assert.ok(spotlightInstructions.includes('0x1012f349c: bl 0x1012f3660'));
assert.ok(records['reopened-selector-0x1012f4464-instructions'].normalized_result.instructions.includes('0x1012f4488: bl 0x1012f3454'));
const tapDescriptor = records['selector-tap-task-descriptor'].normalized_result; assert.equal(tapDescriptor.complete, true); const tapBytes = Buffer.from(tapDescriptor.bytes_hex, 'hex'); const tapTarget = BigInt(tapDescriptor.address) + BigInt(tapBytes.readInt32LE(0)); assert.equal(tapTarget, 0x1012f176cn); assert.equal(tapBytes.readUInt32LE(4), 32);
const tapInstructions = records['selector-tap-async-entry-instructions'].normalized_result.instructions; assert.ok(tapInstructions.includes('0x1012f17f8: b 0x1012ef5bc'));
const tap = records['selector-tap-async-entry-pseudocode'].normalized_result; assert.ok(tap.includes('FUN_1012e6bc8') && tap.includes('FUN_1012ef654'));
const profile = records['reopened-selector-0x100b080a8-instructions'].analysis_profile;
assert.equal(profile.parameters.analysis_seeds.entries.function, 1951);
assert.equal(hash(await fs.readFile(path.join(directory, 'selector-reopen-seeds.tsv'))), profile.parameters.analysis_seeds.sha256);
await save('selector-reopen-findings-2026-11-15.json', {
  schema_version: 1, snapshot_date: '2026-11-15', status: 'reopened-phases-0-through-2-authenticated-session-open', target_sha256: expected,
  authority: 'Static selected function and loaded metadata observations authenticated using frozen076runtime; no live appearance, pointer input or rendered output observation',
  frozen_runtime: { source_commit: manifest.source_commit, manifest_sha256: hash(manifestBytes), files_matched: manifest.files.length, current_java_or_build_used: false },
  phases: bundles.map(({ bundle, ...row }) => row), cumulative_unique_records: 13, session_finalized: false, cleanup_claimed: false,
  changed_admission: { seed_file: 'selector-reopen-seeds.tsv', function_seeds: 1951, seed_sha256: profile.parameters.analysis_seeds.sha256, profile_digest: profile.digest, added_entries: ['0x100b080a8', '0x100b0b828'], both_helpers_now_observed_functions: true, unchanged_retry_claimed: false },
  appearance_and_value_change: { helper: '0x100b080a8', operations: ['capture initial generic value/callback', 'attachonAppear via wrapper0x100b08400', 'attachonChange(of:perform:) via supplied callback'], selector_role: 'install/update the adaptor object assignment route through0x1012f0218', physical_pointer_callback: false, wrapper_body_untraced: true },
  tracking_modifier: { helper: '0x100b0b828', data: 'callback/context, two flags, keypath0x103715dc0 and finalflag0', operation: 'SwiftUI.View.modifier', metadata: '0x1042acfa8', loaded_kind: 'struct0x200', loaded_nominal_descriptor: '0x103d5c1c4', name_candidate_source: 'tracking-modifier-name-preparation.json', candidate_name: 'MouseMoveModifier', public_name_and_body_conformance_pending: true },
  rectangle_getter_bridge: { entry: '0x1012f14d4', instruction: getter.instructions[0], target: '0x1012e54d8', direct_branch_to0x1012e4cec_claimed: false, member_identity_derivation: 'selector-tracking-findings-2026-11-15.json' },
  spotlight: { body_witness: '0x1012f4464', content: '0x1012f3454', container: 'SwiftUI.ZStack', render_child: '0x1012f3660', string_lifecycle: { helper: '0x100b080a8', observed_type: 'Swift.String', callback: '0x1012f44a0' }, shape_frame_stroke_and_query_effects_untraced: true },
  tap_async: { descriptor: tapDescriptor.address, function: '0x1012f176c', context_size: 32, direct_tail_worker: '0x1012ef5bc', folded_selected_work_stage: '0x1012e6bc8', folded_return_continuation: '0x1012ef654', captures_point_and_view: true, candidate_query_and_state_results_untraced: true },
  next_requests: { path: 'selector-render-and-query.steps.json', requests: 7, native_entries: ['0x1012f3660', '0x1012f44a0', '0x1012e6bc8'], metadata_exact_name: 'MouseMoveModifier', executed_by_this_interpretation: false },
  limitations: ['This new session is separate from the expired36-call session; only immutable exported phases are authenticated here.', 'The lifecycle helper does not establish physical input tracking.', 'Public loaded metadata gives the modifier descriptor; its candidate local name still awaits the exact conformance query.', 'Getter bridge54d8 must not be rewritten as a direct call to old getter4cec.', 'Tapworkstage derives from folded async pseudocode; the entry itself directly tails ef5bc.', 'Final drawing, native window placement, persistence and broader Arc features remain unproved.'], evidence: anchors,
});
await save('selector-reopen-phase-audit.json', { status: 'passed', checked_at: new Date().toISOString(), authority: 'Content-verified frozen076runtime and immutable phase validation; no final session or current-source check', frozen_runtime_files_matched: manifest.files.length, standalone_evidence: 13, unique_records: 13, bundles_checked: 3, phase_record_counts: [7, 8, 13], session_finalized: false, cleanup_claimed: false, evidence: anchors });
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, cumulative_phase_records: 13, helper_seeds: 1951, getter_bridge: '0x1012e54d8', session_finalized: false }));
