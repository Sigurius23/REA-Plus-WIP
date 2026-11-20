import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const manifestBytes = await fs.readFile(path.join(directory, 'frozen-runtime-manifest.json'));
const manifest = JSON.parse(manifestBytes);
for (let offset = 0; offset < manifest.files.length; offset += 32) await Promise.all(manifest.files.slice(offset, offset + 32).map(async entry => { const bytes = await fs.readFile(path.join(manifest.runtime_package, entry.path)); assert.equal(bytes.length, entry.bytes); assert.equal(hash(bytes), entry.sha256); }));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_package, 'dist/domain/evidenceBundle.js')));
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const records = {}, anchors = [];
for (const name of (await fs.readdir(path.join(directory, 'view-builder-evidence'))).filter(name => name.endsWith('.evidence.json')).sort()) {
  const bytes = await fs.readFile(path.join(directory, 'view-builder-evidence', name)); const record = parseEvidence(JSON.parse(bytes));
  assert.equal(record.subject.digest.sha256, expected); records[name.replace('.evidence.json', '')] = record;
  anchors.push({ path: `view-builder-evidence/${name}`, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null });
}
assert.equal(anchors.length, 4);
const bundle = parseEvidenceBundle(await read('view-builder-evidence/evidence-bundle.json')); assert.equal(bundle.records.length, 4);
assert.deepEqual(new Set(bundle.records.map(record => record.evidence_id)), new Set(anchors.map(row => row.evidence_id)));
const summary = await read('view-builder-evidence/summary.json'); assert.equal(summary.calls, 7); assert.equal(summary.successful, 7); assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const invocations = await read('view-builder-evidence/invocations.json'); const close = invocations.find(row => row.name === 'close_binary'); assert.ok(close && !close.is_error && !close.thrown);
const body = records['view-builder-0x1012cd97c-instructions'].normalized_result;
const pseudo = records['view-builder-0x1012cd97c-pseudocode'].normalized_result;
assert.equal(body.procedure.body.total_bytes, 2312); assert.equal(body.procedure.body.non_contiguous, false);
for (const instruction of ['0x1012cdb1c: bl 0x1012d75e8', '0x1012cdb20: ldp d8, d9, [x0, #0xb0]', '0x1012cdb24: ldp d10, d11, [x0, #0xc0]', '0x1012cdb3c: bl 0x1009b59d0', '0x1012cdb74: bl 0x1012ce284', '0x1012cdbfc: b.ne 0x1012cdc68', '0x1012cdc04: bl 0x1012d21ac', '0x1012cde0c: cmp w20, #0x1']) assert.ok(body.instructions.includes(instruction), instruction);
for (const fragment of ['SwiftUI5ColorVyACSo7NSColor', 'SwiftUI12_FrameLayoutV5width6height9alignment', '0x4066e00000000000', '(abStack_290[0] & 0xfe) == 2', 'FUN_1012d222c', 'FUN_1012d2278', '0x4046000000000000']) assert.ok(pseudo.includes(fragment), fragment);
const closure = records['view-builder-0x1012d1dd0-instructions'].normalized_result;
assert.deepEqual(closure.instructions, ['0x1012d1dd0: adrp x0, 0x1012d1000', '0x1012d1dd4: add x0, x0, #0xddc', '0x1012d1dd8: b 0x1012d2238']);
const closurePseudo = records['view-builder-0x1012d1dd0-pseudocode'].normalized_result;
assert.ok(closurePseudo.includes('FUN_1012d14b4') && closurePseudo.includes('FUN_1012d1ddc'));
const doubleWord = value => { const b = Buffer.alloc(8); b.writeBigUInt64LE(BigInt(value)); return b.readDoubleLE(); };
assert.equal(doubleWord('0x4066e00000000000'), 183); assert.equal(doubleWord('0x4046000000000000'), 44);

const functionIndexPath = 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json';
const index = parseEvidence(JSON.parse(await fs.readFile(path.join(root, functionIndexPath), 'utf8'))); assert.equal(index.subject.digest.sha256, expected); assert.equal(index.normalized_result.complete, true);
const encoded = Buffer.from(index.normalized_result.bytes_hex, 'hex'); let address = 0x100000000n, value = 0n, shift = 0n; const starts = [];
for (const byte of encoded) { value |= BigInt(byte & 127) << shift; if (byte & 128) { shift += 7n; continue; } if (!value) break; address += value; starts.push(address); value = shift = 0n; }
const targets = [
  ['0x1012ce284', 'Direct child builder at call0x1012cdb74; recover concrete controls, overlay/event modifiers and output composition.'],
  ['0x1012d14b4', 'Decompiler-selected worker reached through capture unwrapper0x1012d2238; identify its decision and invocation of the passed callback.'],
  ['0x1012d1ddc', 'Callback address materialized by closure0x1012d1dd0; identify the deferred state/UI action.'],
].map(([entry, question]) => { const position = starts.indexOf(BigInt(entry)); assert.notEqual(position, -1); return { entry, question, exact_lc_function_start: true, next_indexed_start: `0x${starts[position + 1].toString(16)}`, indexed_interval_bytes: Number(starts[position + 1] - starts[position]), interval_is_not_function_body_proof: true }; });
const seeds = await fs.readFile(path.join(directory, 'merged-seeds.tsv'), 'utf8'); for (const target of targets) assert.ok(seeds.split('\n').includes(`${target.entry}\tfunction`));
const steps = targets.flatMap(target => [
  { name: 'read_function_instructions', arguments: { procedure: target.entry }, label: `builder-continuation-${target.entry}-instructions` },
  { name: 'procedure_pseudo_code', arguments: { procedure: target.entry }, label: `builder-continuation-${target.entry}-pseudocode` },
]);
const catalogValue = await read('view-builder-evidence/catalog.json'); const catalog = Array.isArray(catalogValue) ? catalogValue : catalogValue.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false }); for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }

// These are source-preparation hypotheses, deliberately separate from public
// loaded pointer observations. The low36 interpretation needs corroboration.
const mappedSource = await read('content-type-mapped-bytes.json');
const original = await fs.readFile(path.join(root, mappedSource.source_path)); assert.equal(hash(original), expected);
const headerPath = 'field-tests/arc-dispatch-2026-11-06/native/macho-header-load-commands.evidence.json';
const headerEvidence = parseEvidence(JSON.parse(await fs.readFile(path.join(root, headerPath), 'utf8')));
const header = Buffer.from(headerEvidence.normalized_result.bytes_hex, 'hex'); assert.deepEqual(original.subarray(0, header.length), header);
const segments = []; let cursor = 32;
for (let i = 0; i < header.readUInt32LE(16); i++) { if (header.readUInt32LE(cursor) === 0x19) segments.push({ vm: header.readBigUInt64LE(cursor + 24), file_offset: header.readBigUInt64LE(cursor + 40), file_size: header.readBigUInt64LE(cursor + 48) }); cursor += header.readUInt32LE(cursor + 4); }
const mappedRead = (address, count) => { const s = segments.find(s => address >= s.vm && address + BigInt(count) <= s.vm + s.file_size); assert.ok(s); const offset = Number(s.file_offset + address - s.vm); return { bytes: original.subarray(offset, offset + count), file_offset: offset }; };
const candidates = [0x104317858n, 0x104318148n].map(address => {
  const raw = mappedRead(address, 32); assert.equal(raw.bytes.readBigUInt64LE(0), 0x200n);
  const chained = raw.bytes.readBigUInt64LE(8), descriptor = 0x100000000n + (chained & ((1n << 36n) - 1n));
  const d = mappedRead(descriptor, 32); assert.equal(d.bytes.readUInt32LE(0) & 31, 17);
  const nameAddress = descriptor + 8n + BigInt(d.bytes.readInt32LE(8)); const name = mappedRead(nameAddress, 128); const length = name.bytes.indexOf(0); assert.ok(length > 0);
  return { metadata_address: `0x${address.toString(16)}`, raw_metadata_bytes: raw.bytes.toString('hex'), raw_chained_descriptor_word: `0x${chained.toString(16)}`, candidate_descriptor: `0x${descriptor.toString(16)}`, candidate_descriptor_bytes: d.bytes.toString('hex'), name_address: `0x${nameAddress.toString(16)}`, candidate_name: name.bytes.subarray(0, length).toString('utf8'), loaded_pointer_corroboration_required: true };
});
await save('view-builder-type-candidates.json', { authority: 'Analyst source-preparation hypotheses from checked original bytes; not public provider Evidence, loaded pointer interpretation or runtime type observation', source_sha256: expected, header_evidence_id: headerEvidence.evidence_id, interpretation: 'Assume local chained-pointer offset low36bits plus preferred image base; verify through public loaded metadata reads before promoting these names.', candidates });
await save('builder-continuation.steps.json', { authority: 'Proposed follow-up from concrete builder/closure handoffs, not executed here', target_sha256: expected, execution: 'Use frozen076 runtime, existing verified merged seeds and actual advertised schemas. Append open/export/close with lineage verification in the owning recorder.', steps });
await save('builder-continuation-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected, frozen_runtime_manifest_sha256: hash(manifestBytes), frozen_runtime_files_matched: manifest.files.length, source_evidence: anchors, function_index: { path: functionIndexPath, evidence_id: index.evidence_id }, targets, seed_sha256: hash(seeds), proposed_requests_schema_checked: steps.length, proposed_requests_executed: 0 });
await save('view-builder-audit.json', { status: 'passed', checked_at: new Date().toISOString(), authority: 'Canonical static Evidence/bundle validation with content-verified frozen076runtime; no provider launch or current source/build check', frozen_runtime_manifest_sha256: hash(manifestBytes), frozen_runtime_files_matched: manifest.files.length, standalone_evidence: 4, unique_evidence_ids: new Set(anchors.map(row => row.evidence_id)).size, bundle_records: 4, public_calls: 7, public_errors: 0, explicit_close_ms: close.elapsed_ms, verifier_descendants: [], evidence: anchors });
await save('view-builder-findings.json', {
  schema_version: 1, snapshot_date: '2026-11-14', status: 'verified-with-open-event-registration-and-overlay', target_sha256: expected,
  authority: 'Static shipped-artifact observations; named type candidates are separately marked source-preparation hypotheses',
  frozen_runtime: { manifest_sha256: hash(manifestBytes), matched_files: manifest.files.length, source_commit: manifest.source_commit, current_java_or_build_used: false },
  session: { calls: 7, successful: 7, errors: 0, canonical_records: 4, explicit_close_ms: close.elapsed_ms, verified_empty_descendants: true },
  builder: { entry: '0x1012cd97c', body_bytes: 2312, color_route: { state_accessor: '0x1012d75e8', captured_four_word_offsets: ['0xb0', '0xb8', '0xc0', '0xc8'], conversion_helper: '0x1009b59d0', output: 'SwiftUI.Color constructed from NSColor', rgba_or_other_component_meaning_proved: false }, primary_child_builder: '0x1012ce284', selected_frame: { width: 183, width_absent_flag: 0, height_word: 0, height_absent_flag: 1, alignment: 'center', units: 'coordinate units; physical pixels not established' }, first_conditional: { state_keypath: '0x103789e38', raw_test: '(tag&0xfe)==2', test_values: [2, 3], admitted_empty_branch: true, other_branch: 'local hello-world String State initialization and projected ViewStore/ObservedObject content', visible_hello_world_text_proved: false, candidate_metadata_argument: '0x104317858' }, second_conditional: { state_field_flag1_yields_empty: true, other_branch: 'extract optional URL-derived value; build captured callbacks and scalar44', callback_entries: ['0x1012d222c', '0x1012d2278'], scalar44_field_meaning_proved: false, candidate_metadata_argument: '0x104318148' }, actual_hover_callback_registration_or_drawing_proved: false },
  deferred_body_closure: { entry: '0x1012d1dd0', own_body_bytes: 12, selected_callback_address: '0x1012d1ddc', tail_target: '0x1012d2238', decompiler_selected_worker: '0x1012d14b4', worker_argument: 'captured self at metadata-aligned context offset, plus selected callback', concrete_modifier_kind_or_callback_effect_proved: false },
  type_hypotheses: { receipt: 'view-builder-type-candidates.json', candidate_names: candidates.map(row => row.candidate_name), loaded_pointer_corroboration_required: true, used_as_feature_proof: false },
  next_batch: { path: 'builder-continuation.steps.json', requests: 6, targets, executed_by_this_interpretation: false },
  limitations: ['Stable one-second partial Program.', 'A local State initializer is not proof of displayed text.', 'Conditional flag/enum tests are retained without inventing source case names.', 'Frame width is stated in coordinate units; the scalar44 field is not assigned an unverified layout role.', 'The child component and deferred callback must be traced before claiming event installation or overlay drawing.', 'Durable persistence and broader Arc behavior remain unproved.'], evidence: anchors,
});
console.log(JSON.stringify({ status: 'passed', frozen_files: manifest.files.length, canonical_evidence: 4, next_requests: 6, next_targets: targets.map(row => row.entry), provider_calls_executed: 0 }));
