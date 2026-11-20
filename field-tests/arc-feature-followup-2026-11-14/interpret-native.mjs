import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const req = createRequire(path.join(root, 'rea-local/package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(root, 'rea-local/dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(root, 'rea-local/dist/domain/evidenceBundle.js')));
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const hash = value => createHash('sha256').update(value).digest('hex');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
const native = new Map(), index = [];
for (const name of (await fs.readdir(path.join(directory, 'native-evidence'))).filter(name => name.endsWith('.evidence.json')).sort()) {
  const bytes = await fs.readFile(path.join(directory, 'native-evidence', name));
  const record = parseEvidence(JSON.parse(bytes));
  assert.equal(record.subject.digest.sha256, expected);
  native.set(name.replace('.evidence.json', ''), record);
  index.push({ path: `native-evidence/${name}`, evidence_id: record.evidence_id, file_sha256: hash(bytes), operation: record.operation, analysis_profile_digest: record.analysis_profile?.digest ?? null });
}
assert.equal(native.size, 15);
const bundle = parseEvidenceBundle(await read('native-evidence/evidence-bundle.json'));
assert.equal(bundle.records.length, 15);
assert.deepEqual(new Set(bundle.records.map(record => record.evidence_id)), new Set(index.map(row => row.evidence_id)));
const summary = await read('native-evidence/summary.json');
assert.equal(summary.calls, 18); assert.equal(summary.successful, 18); assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, 'verified'); assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const invocations = await read('native-evidence/invocations.json');
const close = invocations.find(row => row.name === 'close_binary'); assert.ok(close && !close.is_error && !close.thrown);
assert.ok(invocations.some(row => row.name === 'export_evidence_bundle' && !row.is_error));
const profile = native.get('hover-task-helper-pseudocode').analysis_profile;
assert.equal(profile.parameters.analysis_timeout_seconds, 1);
assert.equal(profile.parameters.analysis_seeds.entries.function, 1949);
assert.equal(hash(await fs.readFile(path.join(directory, 'merged-seeds.tsv'))), profile.parameters.analysis_seeds.sha256);

const getter = native.get('hover-value-getter-consumers').normalized_result;
assert.equal(getter.references.length, 2);
assert.ok(getter.references.every(row => row.kind.type === 'DATA' && row.source_procedure === null));
for (const key of ['hover-wrapped-keypath-users', 'hover-storage-keypath-users']) assert.deepEqual(native.get(key).normalized_result, []);
const starter = native.get('hover-task-starter-callers').normalized_result;
assert.equal(starter.references.length, 9);
const external = starter.references.filter(row => row.source_procedure?.address !== starter.procedure.address);
assert.equal(external.length, 5);
const calls = external.filter(row => row.kind.call);
assert.deepEqual(calls.map(row => [row.source_procedure.address, row.source_address]), [
  ['0x1012e5088', '0x1012e5128'], ['0x1012e5148', '0x1012e51dc'], ['0x1012f0028', '0x1012f014c'],
]);

const sourceIndex = await read('reference-index.json');
const prior = {};
for (const name of ['header', 'function_starts', 'task_starter', 'browser_getter']) {
  const entry = sourceIndex.references[name]; const bytes = await fs.readFile(path.join(root, entry.path));
  assert.equal(hash(bytes), entry.file_sha256);
  const record = parseEvidence(JSON.parse(bytes)); assert.equal(record.evidence_id, entry.evidence_id);
  prior[name] = record;
}
const header = Buffer.from(prior.header.normalized_result.bytes_hex, 'hex');
const segments = []; let cursor = 32, startsOffset, startsSize;
for (let i = 0; i < header.readUInt32LE(16); i++) {
  const kind = header.readUInt32LE(cursor), size = header.readUInt32LE(cursor + 4);
  if (kind === 0x19) segments.push({ name: header.subarray(cursor + 8, cursor + 24).toString('ascii').replace(/\0.*$/s, ''), address: header.readBigUInt64LE(cursor + 24), virtual_size: header.readBigUInt64LE(cursor + 32), file_offset: header.readBigUInt64LE(cursor + 40), file_size: header.readBigUInt64LE(cursor + 48) });
  if (kind === 0x26) { startsOffset = header.readUInt32LE(cursor + 8); startsSize = header.readUInt32LE(cursor + 12); }
  cursor += size;
}
const linkerReferences = ['0x104e88e56', '0x104e88e57'].map(source => {
  const address = BigInt(source);
  const segment = segments.find(row => address >= row.address && address < row.address + row.file_size); assert.ok(segment);
  const offset = Number(segment.file_offset + address - segment.address);
  assert.equal(segment.name, '__LINKEDIT'); assert.ok(offset >= startsOffset && offset < startsOffset + startsSize);
  return { source_address: source, segment: segment.name, file_offset: `0x${offset.toString(16)}`, within_lc_function_starts: true, feature_consumer_proved: false };
});
const data = native.get('hover-task-descriptor-and-keypath-bytes').normalized_result;
assert.equal(data.complete, true);
const raw = Buffer.from(data.bytes_hex, 'hex');
const descriptorOffset = Number(0x10378b2c0n - BigInt(data.address));
const displacement = raw.readInt32LE(descriptorOffset);
const descriptorTarget = 0x10378b2c0n + BigInt(displacement);
assert.equal(descriptorTarget, 0x1012e5444n); assert.equal(raw.readUInt32LE(descriptorOffset + 4), 32);
const starterAssembly = prior.task_starter.normalized_result.assembly;
for (const instruction of ['0x1012e4ea4: mov x0, #0x0', '0x1012e4ea8: mov x1, #0x0', '0x1012e4eb0: bl 0x1012f311c']) assert.ok(starterAssembly.includes(instruction));
const task = native.get('hover-task-helper-pseudocode').normalized_result;
for (const fragment of ['__sScP8rawValues5UInt8Vvg', '0x1c00', 'param_2 == 0', '_swift_task_create', 'UNK_10378c250']) assert.ok(task.includes(fragment));
const hostAssembly = native.get('helper-0x100aa47d0-instructions').normalized_result.instructions;
for (const instruction of ['0x100aa47f8: bl 0x100aa4b54', '0x100aa47fc: mov x20, x0', '0x100aa4818: blr x8', '0x100aa481c: mov x0, x20']) assert.ok(hostAssembly.includes(instruction));
assert.ok(native.get('helper-0x1004c6010-pseudocode').normalized_result.includes('_TtC3ADK14ADKApplication'));
assert.ok(native.get('helper-0x1004ad574-pseudocode').normalized_result.includes('_swift_once(0x1045a98a0,&DAT_1004ad550)'));
assert.ok(native.get('helper-0x1012cd820-pseudocode').normalized_result.includes('_swift_getSingletonMetadata(param_1,&DAT_103d7b5f0)'));

const mapped = await read('content-type-mapped-bytes.json');
assert.equal(mapped.source_sha256, expected); assert.equal(mapped.descriptor.name, 'BoostsEditorView');
const original = await fs.readFile(path.join(root, mapped.source_path)); assert.equal(hash(original), expected);
assert.equal(original.length, mapped.source_bytes); assert.deepEqual(original.subarray(0, header.length), header);
const descriptor = original.subarray(mapped.descriptor.file_offset, mapped.descriptor.file_offset + 32);
assert.equal(descriptor.toString('hex'), mapped.descriptor.bytes_hex);
assert.equal(descriptor.readUInt32LE(0) & 31, 17);
assert.equal(0x103d7b5f0n + 8n + BigInt(descriptor.readInt32LE(8)), BigInt(mapped.descriptor.name_address));
assert.equal(original.subarray(mapped.descriptor.name_file_offset, mapped.descriptor.name_file_offset + mapped.descriptor.name.length).toString('utf8'), 'BoostsEditorView');

const encoded = Buffer.from(prior.function_starts.normalized_result.bytes_hex, 'hex');
assert.equal(encoded.length, startsSize);
const starts = []; let address = 0x100000000n, value = 0n, shift = 0n;
for (const byte of encoded) {
  value |= BigInt(byte & 127) << shift;
  if (byte & 128) { shift += 7n; continue; }
  if (!value) break;
  address += value; starts.push(address); value = shift = 0n;
}
const candidates = ['0x1012f0028', '0x1012e5444', '0x1004ad550', '0x100aa4b54'].map(entry => {
  const index = starts.indexOf(BigInt(entry)); assert.notEqual(index, -1);
  return { entry, public_lc_function_start: true, next_indexed_start: `0x${starts[index + 1].toString(16)}`, indexed_interval_bytes: Number(starts[index + 1] - starts[index]), body_extent_proved: false };
});
const steps = [
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f0028' }, label: 'selector-new-starter-caller-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f0028' }, label: 'selector-new-starter-caller-pseudocode' },
  { name: 'procedure_references', arguments: { procedure: '0x1012f0028', direction: 'incoming' }, label: 'selector-new-starter-caller-inputs' },
  { name: 'inspect_native_dispatch_metadata', arguments: { facet: 'swift-conformances', swift_conformance_filter: { type_name: 'BoostsEditorView' }, max_file_bytes: 100663296, max_records: 1000 }, label: 'exact-boost-editor-view-conformances' },
];
const catalog = await read('native-evidence/catalog.json');
const tools = Array.isArray(catalog) ? catalog : catalog.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of steps) { const tool = tools.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
await save('next-batch.steps.json', {
  authority: 'Proposed follow-up from retained results; not executed here', target_sha256: expected,
  preparation: 'Run only after the owning native implementation/build is frozen. Revalidate the actual advertised schemas. Existing merged seeds already cover 0x1012f0028; the exact name filter is a hypothesis derived from checked nominal identity, not proof of a View body implementation. Export Evidence and close/verify lineage in the owning recorder.',
  steps,
});
await save('native-evidence-audit.json', {
  status: 'passed', checked_at: new Date().toISOString(),
  authority: 'Read-only canonical Evidence/bundle validation and retained-file identity checks; no provider request, build or mutable Java/source commitment check',
  standalone_evidence: native.size, unique_evidence_ids: new Set(index.map(row => row.evidence_id)).size, bundles: 1, bundle_records: bundle.records.length,
  public_calls: 18, public_errors: 0, explicit_close_ms: close.elapsed_ms, verifier_descendants: [],
  proposed_next_requests_schema_checked: steps.length, proposed_next_requests_executed: 0,
  evidence: index,
});
await save('findings.json', {
  schema_version: 1, status: 'verified-with-open-feature-gaps', snapshot_date: '2026-11-14', target_sha256: expected,
  authority: 'Analyst interpretation of authenticated static provider observations plus explicitly marked checked original-file descriptor bytes; not Arc runtime behavior',
  session: { calls: 18, successful: 18, errors: 0, close_ms: close.elapsed_ms, exported_records: 15, verified_empty_descendants: true, profile_digest: profile.digest, initial_analysis_timeout_seconds: 1, analysis_complete: false, seed_functions: 1949, seed_sha256: profile.parameters.analysis_seeds.sha256 },
  selector_property: { getter: '0x1012e4cec', retained_incoming_references: 2, code_consumers_recovered: 0, metadata_reference: '0x104628b90', keypath_xrefs: { '0x10378b2c8': [], '0x10378b2f0': [] }, absence_proved: false },
  selector_task_starter: { address: '0x1012e4d6c', retained_incoming_references: 9, external_references: 5, external_code_calls: calls.map(row => ({ source_procedure: row.source_procedure.address, source_address: row.source_address, kind: row.kind.type })), newly_identified_non_publication_caller: '0x1012f0028', originating_ui_event_proved: false },
  linker_index_references: { lc_function_starts_file_range: { start: `0x${startsOffset.toString(16)}`, end_exclusive: `0x${(startsOffset + startsSize).toString(16)}` }, references: linkerReferences },
  task_execution: { helper: '0x1012f311c', body_bytes: 668, decision_inputs: ['optional task priority', 'captured executor availability', 'optional task-name String'], priority_flags: '0x1c00 with optional low-byte priority', selected_caller_name_words: ['0x0', '0x0'], selected_branch: 'unnamed task creation', selected_wrapper_descriptor: '0x10378c250', captured_operation_descriptor: { address: '0x10378b2c0', analyst_abi_interpretation: 'signed-relative async function pointer + context-size pair', displacement, target: '0x1012e5444', context_size: 32 }, concrete_event_or_drawing_proved: false },
  content_type: { metadata_accessor: '0x1012cd820', cache: '0x104627f48', nominal_descriptor: '0x103d7b5f0', analyst_mapped_nominal_name: 'BoostsEditorView', context_kind: 'struct', name_address: mapped.descriptor.name_address, field_descriptor: mapped.descriptor.field_descriptor_address, provenance_receipt: 'content-type-mapped-bytes.json', view_body_witness_recovered: false },
  host_adapter: { entry: '0x100aa47d0', body_bytes: 96, input: 'generic content argument plus implicit receiver', constructor_handoff: '0x100aa4b54', decision: 'class/receiver-dependent metadata for input cleanup', output: 'callee result preserved in X20 and returned in X0 after value-witness +8 cleanup of original input', concrete_host_type_proved: false },
  browser_access: { class_accessor: '0x1004c6010', observed_class_symbol: '_TtC3ADK14ADKApplication', class_address: '0x10455e7a8', cached_accessor: '0x1004ad574', once_token: '0x1045a98a0', initializer: '0x1004ad550', cached_object: '0x1045a98a8', output: 'retained cached object', manager_concrete_instance_type_proved: false, existing_dynamic_method_offsets: ['0x390', '0x3b0'], handler_or_storage_semantics_proved: false },
  next_candidate_function_starts: candidates,
  next_batch: { path: 'next-batch.steps.json', requests: steps.length, executed: false, question: 'Identify the actual caller input/event and the exact BoostsEditorView conformance/body route.' },
  final_drawing_proved: false, durable_persistence_proved: false, broader_arc_complete: false,
  limitations: ['All new provider records retain a one-second stable partial Program.', 'Empty keypath or procedure reference results do not prove global absence.', 'A DATA reference in LC_FUNCTION_STARTS is linker-index bookkeeping, not a UI consumer.', 'The checked original-file nominal name is analyst source preparation, not canonical provider Evidence or runtime metadata.', 'No production source, previous frozen plan/capture, dossier, OPEN_TASKS or Git state is modified by this interpretation.'],
  evidence: index,
});
console.log(JSON.stringify({ status: 'passed', canonical_evidence: native.size, bundle_records: bundle.records.length, new_code_caller: '0x1012f0028', content_nominal: 'BoostsEditorView', next_requests: steps.length, provider_calls_executed: 0 }));
