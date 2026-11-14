import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const { parseEvidence } = await import(pathToFileURL(path.join(root, 'rea-local/dist/domain/evidence.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const sha256 = bytes => createHash('sha256').update(bytes).digest('hex');
const records = [];
const evidence = async name => {
  const bytes = await fs.readFile(path.join(directory, `${name}.evidence.json`));
  const record = parseEvidence(JSON.parse(bytes));
  assert.equal(record.subject.digest.sha256, expected);
  records.push({ path: `${name}.evidence.json`, evidence_id: record.evidence_id, file_sha256: sha256(bytes) });
  return record;
};
const bytes = record => {
  const result = record.normalized_result;
  assert.equal(result.complete, true);
  const value = Buffer.from(result.bytes_hex, 'hex');
  assert.equal(value.length, result.returned_bytes);
  assert.equal(value.length, result.requested_bytes);
  return value;
};
const address = value => `0x${value.toString(16)}`;
const rel32 = (data, offset, base) => base + BigInt(offset) + BigInt(data.readInt32LE(offset));

// Reproduce caller-selected entries from retained public bytes without requiring
// the historical disposable extraction path used by prepare-local-seeds.py.
const header = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/macho-header-load-commands.evidence.json'), 'utf8')));
const starts = parseEvidence(JSON.parse(await fs.readFile(path.join(root, 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'), 'utf8')));
for (const record of [header, starts]) assert.equal(record.subject.digest.sha256, expected);
const h = bytes(header), s = bytes(starts);
assert.equal(h.readUInt32LE(0), 0xfeedfacf);
let cursor = 32, imageBase, startsLength;
for (let i = 0; i < h.readUInt32LE(16); i++) {
  const kind = h.readUInt32LE(cursor), length = h.readUInt32LE(cursor + 4);
  if (kind === 0x19 && h.readBigUInt64LE(cursor + 40) === 0n && h.readBigUInt64LE(cursor + 48) > 0n) imageBase = h.readBigUInt64LE(cursor + 24);
  if (kind === 0x26) startsLength = h.readUInt32LE(cursor + 12);
  cursor += length;
}
assert.equal(imageBase, 0x100000000n);
assert.equal(startsLength, s.length);
let current = imageBase, delta = 0n, shift = 0n;
const indexed = [];
for (const byte of s) {
  delta |= BigInt(byte & 127) << shift;
  if (byte & 128) { shift += 7n; continue; }
  if (delta === 0n) break;
  current += delta; indexed.push(current); delta = shift = 0n;
}
assert.equal(indexed.length, 271299);
const selected = indexed.filter(entry => entry >= 0x1012a0000n && entry < 0x101300000n);
assert.equal(selected.length, 1940);
const seedText = selected.map(entry => `${address(entry)}\tfunction\n`).join('');
assert.equal(seedText, await fs.readFile(path.join(directory, 'local-function-seeds.tsv'), 'utf8'));
const provenance = await read('local-seed-provenance.json');
assert.equal(sha256(seedText), provenance.seed_sha256);
assert.deepEqual(provenance.source_evidence, [header.evidence_id, starts.evidence_id]);
const factorySeeds = await fs.readFile(path.join(directory, 'factory-seeds.tsv'), 'utf8');
assert.equal(factorySeeds.trim().split('\n').length, 1941);
assert.ok(factorySeeds.includes('0x10150478c\tfunction\n'));
for (const line of seedText.trim().split('\n')) assert.ok(factorySeeds.includes(`${line}\n`));

const conformance = (await evidence('native/boost-editor-reducer-conformance')).normalized_result.result;
assert.equal(conformance.swift_conformances[0].type_name, 'BoostsEditor');
assert.equal(conformance.swift_conformances[0].protocol_name, 'Reducer');
assert.equal(conformance.swift_conformances[0].witness_table.address, '0x1046270d8');
const slot4 = conformance.swift_dispatch_slots.find(row => row.slot_index === 4);
const slot5 = conformance.swift_dispatch_slots.find(row => row.slot_index === 5);
assert.equal(slot4.implementation_address, '0x1012a9870');
assert.equal(slot5.implementation_address, '0x1012a98d0');
const reduce = (await evidence('native/boost-editor-reduce-witness')).normalized_result;
assert.ok(reduce.assembly.includes('0x1012a98b4: bl 0x1012a571c'));
const body = (await evidence('native/boost-editor-body-witness')).normalized_result;
assert.ok(body.pseudocode.includes('Fatal error') && body.pseudocode.includes('ComposableArchitecture/Reducer.swift'));
assert.ok(body.assembly.includes('0x1012a9984: brk 0x1'));
const factory = (await evidence('factory/boost-store-factory-instructions')).normalized_result;
for (const instruction of ['0x1015048ac: adrp x8, 0x104627000', '0x1015048b0: add x8, x8, #0xd8', '0x1015048b4: str x8, [sp, #0x30]']) assert.ok(factory.instructions.includes(instruction));

const outerRecord = await evidence('outer-type/outer-enum-descriptor');
const outer = bytes(outerRecord);
const outerBase = BigInt(outerRecord.normalized_result.address);
assert.equal(outerBase, 0x103d7b260n);
const outerPayload = outer.readUInt32LE(20) & 0xffffff, outerEmpty = outer.readUInt32LE(24);
assert.equal(outerPayload, 3); assert.equal(outerEmpty, 1);
const fieldsRecord = await evidence('outer-type/outer-enum-field-records');
const fields = bytes(fieldsRecord), fieldsBase = BigInt(fieldsRecord.normalized_result.address);
assert.equal(rel32(outer, 16, outerBase), fieldsBase);
assert.equal(fields.readUInt16LE(10), 12); assert.equal(fields.readUInt32LE(12), 4);
const outerCases = [];
for (let i = 0; i < 4; i++) {
  const row = 16 + i * 12;
  const name = await evidence(`outer-type/outer-case-${i}-name`);
  assert.equal(rel32(fields, row + 8, fieldsBase), BigInt(name.normalized_result.address));
  const text = bytes(name); outerCases.push(text.subarray(0, text.indexOf(0)).toString('utf8'));
}
assert.deepEqual(outerCases, ['delegate', 'view', '_internal', 'reloadBoost']);
const viewRef = await evidence('outer-type/outer-case-1-payload-type');
assert.equal(rel32(fields, 16 + 12 + 4, fieldsBase), BigInt(viewRef.normalized_result.address));
const viewRefBytes = bytes(viewRef); assert.equal(viewRefBytes[0], 1);
const childDescriptor = BigInt(viewRef.normalized_result.address) + 1n + BigInt(viewRefBytes.readInt32LE(1));
assert.equal(childDescriptor, 0x103d7b2a4n);
const childRecord = await evidence('outer-type/inner-view-enum-descriptor');
const child = bytes(childRecord); assert.equal(BigInt(childRecord.normalized_result.address), childDescriptor);
const childPayload = child.readUInt32LE(20) & 0xffffff, childEmpty = child.readUInt32LE(24);
assert.equal(childPayload, 11); assert.equal(childEmpty, 17);
const childFields = await evidence('outer-type/inner-view-field-records');
assert.equal(rel32(child, 16, childDescriptor), BigInt(childFields.normalized_result.address));
assert.equal(bytes(childFields).readUInt32LE(12), 28);
const childName = await evidence('outer-type/inner-view-type-name');
assert.equal(rel32(child, 8, childDescriptor), BigInt(childName.normalized_result.address));
assert.equal(bytes(childName).subarray(0, 10).toString('utf8'), 'ViewAction');

const metadataRecord = await evidence('view-vwt/view-fixed-metadata');
const metadata = bytes(metadataRecord);
const metadataStart = BigInt(metadataRecord.normalized_result.address);
assert.equal(metadataStart + 8n, 0x104317118n);
assert.equal(metadata.readBigUInt64LE(0), 0x104317098n);
assert.equal(metadata.readBigUInt64LE(8), 0x201n);
assert.equal(metadata.readBigUInt64LE(16), childDescriptor);
const vwtRecord = await evidence('view-vwt/view-fixed-value-witnesses');
const vwt = bytes(vwtRecord); assert.equal(BigInt(vwtRecord.normalized_result.address), metadata.readBigUInt64LE(0));
assert.equal(vwt.readBigUInt64LE(16), 0x1012b8738n);
assert.equal(vwt.readBigUInt64LE(88), 0x1012b2860n);
assert.equal(vwt.readBigUInt64LE(64), 156n); assert.equal(vwt.readBigUInt64LE(72), 160n);
const tagHelper = (await evidence('native/nested-action-tag-helper')).normalized_result;
assert.equal(tagHelper.procedure.address, address(vwt.readBigUInt64LE(88)));
assert.equal(tagHelper.assembly.length, 7);
assert.ok(tagHelper.assembly.includes('0x1012b2868: lsr w9, w9, #0x1c'));
assert.ok(tagHelper.assembly.includes('0x1012b286c: add w8, w8, #0xb'));
const owner = (await evidence('native/boost-reducer-info')).normalized_result.body;
assert.equal(owner.total_bytes, 2024); assert.equal(owner.span_bytes, 8608); assert.equal(owner.non_contiguous, true);
const listing = (await evidence('native/boost-reducer-instructions')).normalized_result.instructions;
assert.ok(listing.includes('0x1012a5ba8: bl 0x1012b2860'));
assert.ok(listing.includes('0x1012a5bc8: br x10'));
const pseudocode = (await evidence('native/boost-reducer-pseudocode')).normalized_result;
assert.ok(pseudocode.includes('Could not recover jumptable at 0x0001012a5bc8'));
const tableRecord = await evidence('native/nested-action-jump-table-bytes');
const table = bytes(tableRecord); assert.equal(table.length, 96);
const sampledTargets = Array.from({ length: table.length / 4 }, (_, i) => address(0x1012a5bb8n + BigInt(table.readInt32LE(i * 4))));
const completeTableRecord = await evidence('table-tail/nested-action-complete-table');
const completeTable = bytes(completeTableRecord);
assert.equal(completeTableRecord.normalized_result.address, tableRecord.normalized_result.address);
assert.equal(completeTable.length, 4 * (childPayload + childEmpty));
assert.deepEqual(completeTable.subarray(0, table.length), table);
const completeTargets = Array.from({length: childPayload + childEmpty}, (_, i) => address(0x1012a5bb8n + BigInt(completeTable.readInt32LE(i * 4))));
for (const target of completeTargets) {
  assert.equal(BigInt(target) % 4n, 0n);
  assert.ok(BigInt(target) >= 0x1012a571cn && BigInt(target) < 0x1012a78bcn);
}

const outerSingletonRecord = await evidence('outer-vwt-restored/outer-descriptor-singleton');
const outerSingleton = bytes(outerSingletonRecord);
const incompleteAddress = rel32(outerSingleton, 32, BigInt(outerSingletonRecord.normalized_result.address));
assert.equal(incompleteAddress, 0x104627290n);
const incompleteRecord = await evidence('outer-vwt-restored/outer-incomplete-metadata');
const incomplete = bytes(incompleteRecord);
assert.equal(BigInt(incompleteRecord.normalized_result.address) + 8n, incompleteAddress);
assert.equal(incomplete.readBigUInt64LE(0), 0x104627200n);
assert.equal(incomplete.readBigUInt64LE(8), 0x201n);
assert.equal(incomplete.readBigUInt64LE(16), outerBase);
const outerVwtRecord = await evidence('outer-vwt-restored/outer-value-witnesses');
const outerVwt = bytes(outerVwtRecord);
assert.equal(BigInt(outerVwtRecord.normalized_result.address), incomplete.readBigUInt64LE(0));
assert.equal(outerVwt.readBigUInt64LE(16), 0x1012b795cn);
assert.equal(outerVwt.readBigUInt64LE(64), 0n);
assert.equal(outerVwt.readBigUInt64LE(72), 0n);
const outerCopy = await evidence('outer-vwt-restored/outer-declared-copy-witness');
assert.equal(BigInt(outerCopy.normalized_result.address), outerVwt.readBigUInt64LE(16));
assert.equal(bytes(outerCopy).length, 768);

const sessions = [];
for (const [name, calls, successful, errors, explicitClose] of [['native', 45, 38, 7, false], ['factory', 9, 9, 0, true], ['overlay-metadata', 6, 6, 0, true], ['outer-type', 23, 23, 0, true], ['codingkey-metadata', 5, 5, 0, true], ['view-vwt', 7, 7, 0, true], ['outer-vwt-restored', 7, 7, 0, true], ['table-tail', 4, 4, 0, true]]) {
  const summary = await read(`${name}/summary.json`);
  assert.equal(summary.status, 'completed'); assert.equal(summary.calls, calls); assert.equal(summary.successful, successful); assert.equal(summary.errors, errors);
  assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
  const invocations = await read(`${name}/invocations.json`);
  assert.equal(invocations.some(row => row.name === 'close_binary'), explicitClose);
  if (explicitClose) assert.notEqual((await read(`${name}/close.reply.json`)).isError, true);
  sessions.push({ directory: name, calls, successful, errors, explicit_close_binary: explicitClose, verified_empty_descendants: true });
}
const failedOuter = await read('outer-vwt/summary.json');
assert.equal(failedOuter.calls, 7); assert.equal(failedOuter.successful, 3); assert.equal(failedOuter.errors, 4);
assert.equal(failedOuter.verifier_run.process_lineage.status, 'unavailable');
const failedOuterInvocations = await read('outer-vwt/invocations.json');
assert.equal(failedOuterInvocations.filter(row => row.name === 'read_bytes' && row.is_error).length, 4);
assert.ok(failedOuterInvocations.some(row => row.name === 'close_binary' && !row.is_error));
const failedOuterReply = await read('outer-vwt/outer-descriptor-singleton.reply.json');
const failedOuterError = JSON.parse(failedOuterReply.content.find(row => row.type === 'text').text).error;
assert.equal(failedOuterError.details.diagnostics.failure_kind, 'start');
sessions.push({ directory: 'outer-vwt', calls: 7, successful: 3, errors: 4, explicit_close_binary: true, verified_empty_descendants: false, lineage_status: 'unavailable', failure_kind: 'start', not_new_product_bug: true });
const nativeLog = await fs.readFile(path.join(directory, 'native-driver.log'), 'utf8');
assert.ok(nativeLog.includes('continuation-expired') && nativeLog.includes('continuation-8.json'));
const initialOpen = await read('native/open.reply.json'); assert.equal(initialOpen.isError, true);
const initialError = JSON.parse(initialOpen.content.find(row => row.type === 'text').text).error;
assert.equal(initialError.code, 'execution_failure');
assert.equal(initialError.details.operation, 'resolve_analysis_profile');
assert.equal(initialError.details.diagnostics.setting, 'REA_GHIDRA_SEED_FILE');
assert.ok(initialError.details.diagnostics.reason.includes('ENOENT'));
const initialCalls = (await read('native/invocations.json')).slice(0, 7);
assert.equal(initialCalls.filter(row => row.is_error).length, 7);

const findings = {
  status: 'passed', checked_at: new Date().toISOString(), target_sha256: expected,
  authority: 'Read-only canonical Evidence authentication and analyst consistency derivations from retained observations; no Arc execution, new native import or persistence verification',
  seed_provenance: { public_evidence: [header.evidence_id, starts.evidence_id], indexed_starts: indexed.length, selected_starts: selected.length, seed_sha256: sha256(seedText), factory_seed_count: 1941, caller_selected_range_is_not_module_boundary: true },
  reducer: { conformance: '0x103788ae8', witness_table: '0x1046270d8', reduce_slot: 4, reduce_witness: '0x1012a9870', implementation: '0x1012a571c', body_slot: 5, fatal_body_witness: '0x1012a98d0', composition_entry: '0x10150478c', exact_captured_store_binding: 'unproved' },
  outer_action: { descriptor: address(outerBase), payload_cases: outerPayload, empty_cases: outerEmpty, reflected_case_names: outerCases, view_payload_descriptor: address(childDescriptor) },
  outer_incomplete_metadata: { descriptor_singleton_relative_field_offset: 32, metadata: address(incompleteAddress), value_witness_table: address(incomplete.readBigUInt64LE(0)), initialize_with_copy: address(outerVwt.readBigUInt64LE(16)), retained_copy_bytes: bytes(outerCopy).length, pattern_size_and_stride_are_zero: true, runtime_singleton_instantiation_observed: false },
  child_view_action: { descriptor: address(childDescriptor), reflected_name: 'ViewAction', payload_cases: childPayload, empty_cases: childEmpty, total_cases: childPayload + childEmpty, metadata: '0x104317118', value_witness_table: '0x104317098', initialize_with_copy: address(vwt.readBigUInt64LE(16)), get_enum_tag: address(vwt.readBigUInt64LE(88)), value_size: Number(vwt.readBigUInt64LE(64)), stride: Number(vwt.readBigUInt64LE(72)), helper_instruction_count: tagHelper.assembly.length },
  recovery_boundary: { owner_body_bytes: owner.total_bytes, owner_span_bytes: owner.span_bytes, unrecovered_jump: '0x1012a5bc8', table_address: tableRecord.normalized_result.address, original_sampled_words: sampledTargets.length, reflected_cases: childPayload + childEmpty, signed_word_base: '0x1012a5bb8', sampled_targets: sampledTargets, complete_table_words: completeTargets.length, complete_table_targets: completeTargets, target_derivation_authority: 'Analyst arithmetic from public bytes and the reflected count; caller-type/projection proof remains required for automatic recovery', complete_28_case_recovery: false },
  sessions,
  initial_preparation: { absent_seed: true, retained_error_code: initialError.code, six_dependent_target_unavailable_errors: true, orchestration_error: true, original_replies_preserved: true, diagnostics_improved_later_in_item_54: true },
  native_idle_expiry: { continuation: 8, explicit_close_binary: false, driver_client_and_transport_finalization: true, verified_empty_descendants: true },
  durable_persistence_proved: false, broader_arc_complete: false,
  evidence: records,
};
await fs.writeFile(path.join(directory, 'findings.json'), `${JSON.stringify(findings, null, 2)}\n`);
console.log(JSON.stringify({ status: findings.status, selected_evidence: records.length, selected_seeds: selected.length, reducer_slots_checked: [4, 5], reflected_child_cases: childPayload + childEmpty, sampled_jump_words: sampledTargets.length, sessions: sessions.length, persistence_proved: false }));
