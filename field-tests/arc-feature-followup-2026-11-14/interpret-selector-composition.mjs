import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestBytes = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json')), manifest = JSON.parse(manifestBytes);
for (let i = 0; i < manifest.files.length; i += 32) await Promise.all(manifest.files.slice(i, i + 32).map(async row => { const bytes = await fs.readFile(path.join(manifest.runtime_package, row.path)); assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const bundles = [];
for (const [phase, count] of [[0, 3], [1, 7], [2, 11]]) { const raw = await fs.readFile(path.join(directory, `persistent-selector-evidence/phase-${phase}-bundle.json`)); const bundle = parseEvidenceBundle(JSON.parse(raw)); assert.equal(bundle.records.length, count); for (const record of bundle.records) assert.equal(record.subject.digest.sha256, expected); bundles.push({ phase, records: bundle.records.length, file_sha256: hash(raw), bundle }); }
const finalIDs = new Set(bundles[2].bundle.records.map(row => row.evidence_id));
for (const earlier of bundles.slice(0, 2)) for (const record of earlier.bundle.records) assert.ok(finalIDs.has(record.evidence_id));
const recordNames = [
  'selector-view-SelectorPicker-body-instructions', 'selector-view-SelectorPicker-body-pseudocode',
  'selector-view-BoostsEditorOverlayView-body-instructions', 'selector-view-BoostsEditorOverlayView-body-pseudocode',
  'selector-content-SelectorPicker-instructions', 'selector-content-SelectorPicker-pseudocode',
  'selector-content-BoostsEditorOverlayView-instructions', 'selector-content-BoostsEditorOverlayView-pseudocode',
];
const records = {}, anchors = [];
for (const name of recordNames) { const filename = `persistent-selector-evidence/${name}.evidence.json`, bytes = await fs.readFile(path.join(directory, filename)), record = parseEvidence(JSON.parse(bytes)); assert.equal(record.subject.digest.sha256, expected); assert.ok(finalIDs.has(record.evidence_id)); records[name] = record; anchors.push({ path: filename, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null }); }
const code = name => records[name].normalized_result;
assert.ok(code('selector-view-SelectorPicker-body-instructions').instructions.includes('0x1012f03d4: bl 0x1012ee328'));
assert.ok(code('selector-view-BoostsEditorOverlayView-body-instructions').instructions.includes('0x1012fa6b4: bl 0x1012f9da0'));
const selector = code('selector-content-SelectorPicker-pseudocode'), selectorInstructions = code('selector-content-SelectorPicker-instructions');
for (const fragment of ['SwiftUI20_ValueActionModifier', 'StateV12wrappedValuexvg', 'puVar7[3] = FUN_1012f0174', 'puVar7[4] = puVar6', 'FUN_1012f0218', '0x000100b080a8', 'ViewPAAE11colorSchemeyQr', 'ColorSchemeO5light']) assert.ok(selector.includes(fragment), fragment);
assert.ok(selectorInstructions.instructions.includes('0x1012ee654: add x1, x1, #0x218'));
assert.ok(selectorInstructions.instructions.includes('0x1012ee678: bl 0x100b080a8'));
const overlay = code('selector-content-BoostsEditorOverlayView-pseudocode'), overlayInstructions = code('selector-content-BoostsEditorOverlayView-instructions');
for (const fragment of ['UNK_10378c7b8', 'UNK_10378c7d8', 'UNK_10378c7f8', 'if (lStack_3b8 == 0)', 'FUN_1012f952c', 'FUN_1012faf3c', 'swiftEmptyArrayStorage', 'UNK_10378be30']) assert.ok(overlay.includes(fragment), fragment);
assert.ok(overlayInstructions.instructions.some(line => line.endsWith(': bl 0x1012f952c')));
const prep = await read('selector-visual-and-input-preparation.json'); assert.equal(prep.proposed_requests_schema_checked, 8); assert.equal(prep.proposed_requests_executed, 0);
const facts = {
  schema_version: 1, snapshot_date: '2026-11-14', status: 'phases-0-through-2-authenticated-session-open', target_sha256: expected,
  authority: 'Static shipped-artifact observations in immutable exported phases; no physical UI event, live page or rendered output observation',
  frozen_runtime: { source_commit: manifest.source_commit, manifest_sha256: hash(manifestBytes), files_matched: manifest.files.length, current_java_or_build_used: false },
  phase_bundles: bundles.map(({ bundle, ...row }) => row), cumulative_unique_evidence_records: finalIDs.size,
  persistent_session_finalized: false, final_summary_read_or_cleanup_claimed: false,
  body_delegation: [
    { type: 'SelectorPicker', witness: '0x1012f0388', witness_body_bytes: code('selector-view-SelectorPicker-body-instructions').procedure.body.total_bytes, call_site: '0x1012f03d4', content: '0x1012ee328', content_body_bytes: selectorInstructions.procedure.body.total_bytes },
    { type: 'BoostsEditorOverlayView', witness: '0x1012fa660', witness_body_bytes: code('selector-view-BoostsEditorOverlayView-body-instructions').procedure.body.total_bytes, call_site: '0x1012fa6b4', content: '0x1012f9da0', content_body_bytes: overlayInstructions.procedure.body.total_bytes },
  ],
  selector_composition: {
    visual_child: '0x1012ee7e8', alignment: 'center',
    value_change_route: { wrapper: 'SwiftUI._ValueActionModifier', input: 'State.wrappedValue two-word-plus-flag value', installed_code: '0x1012f0174', installed_context: 'captured view plus generic words', tail_callback: '0x1012f0028', callback_binding_recovered: true, physical_point_producer_proved: false },
    other_input_modifier: { helper: '0x100b080a8', callback: '0x1012f0218', exact_callback_materialization: '0x1012ee654', helper_call: '0x1012ee678', role_untraced: true, helper_in_current_seed_file: false },
    environment: { color_scheme: 'light', scope: 'selected selector view composition', actual_screen_appearance_observed: false },
    final_rectangle_drawing_proved: false,
  },
  overlay_composition: { input_factory: 'code/context at view+0x10/+0x18 invoked with state-projected value from keypath0x10378c7b8', allocated_helper: { metadata_accessor: '0x1012faa08', bytes: 40, captured_factory_result_and_zero_field: true, concrete_type_not_named_here: true }, selector_decision: { keypath: '0x10378c7d8', null_optional_branch: 'project byte via0x10378c7f8 then call0x1012f952c with helper and callback0x1012faf3c/captured overlay', present_optional_branch: 'construct value containing selected optional value, helper and State initialized to an empty array', selector_conformance_reference: '0x10378be30', raw_state_source_case_names_proved: false }, physical_window_or_final_drawing_proved: false },
  next_batch: { path: 'selector-visual-and-input.steps.json', requests: 8, exact_lc_start_checks: prep.targets, proposed_requests_executed_by_this_interpretation: false },
  limitations: ['The session stays parent-owned and open; this receipt authenticates exported phases only.', 'A value-action modifier binds state changes to the callback but does not establish the physical event source.', 'The other helper is outside the current caller-seed window; its procedure admission is a scoped query, not an absence or product-bug claim.', 'Overlay branch state values remain unnamed until their projections and callbacks are traced.', 'All coordinate rounding remains in coordinate units, with no physical-pixel assertion.', 'Durable persistence and broader Arc behavior remain unproved.'], evidence: anchors,
};
await save('selector-composition-findings.json', facts);
await save('selector-composition-audit.json', { status: 'passed', checked_at: new Date().toISOString(), authority: 'Content-verified frozen076runtime and immutable phase bundle/standalone Evidence validation; no provider launch or session-finalization check', frozen_runtime_files_matched: manifest.files.length, standalone_body_records: 8, cumulative_unique_phase_records: finalIDs.size, bundles_checked: 3, phase_record_counts: bundles.map(row => row.records), persistent_session_finalized: false, cleanup_claimed: false, evidence: anchors });
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, standalone_body_records: 8, cumulative_phase_records: finalIDs.size, callback_binding: '0x1012f0174', persistent_session_finalized: false }));
