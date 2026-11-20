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
const targetSha256 = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
const hash = value => createHash('sha256').update(value).digest('hex');
const anchors = {
  getter: 'field-tests/arc-dispatch-load-2026-11-09/arc-final-2026-11-13/hover-method-0.evidence.json',
  task_starter: 'field-tests/arc-dispatch-load-2026-11-09/arc-final-2026-11-13/hover-method-1.evidence.json',
  publish_success: 'field-tests/arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5088.evidence.json',
  publish_failure: 'field-tests/arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5148.evidence.json',
  selector_query: 'field-tests/arc-dispatch-load-2026-11-09/arc-final-2026-11-13/selector-next-stage.evidence.json',
  selector_success: 'field-tests/arc-selector-rendering-2026-11-09/query-return-2026-11-13/selector-success.evidence.json',
  selector_class: 'field-tests/arc-selector-rendering-2026-11-09/selection-after/arc-hover-class.evidence.json',
  editor_init: 'field-tests/arc-command-effects-2026-11-08/initialization/helper-0x1012d2e5c.evidence.json',
  browser_getter: 'field-tests/arc-command-effects-2026-11-08/methods/method-0x1012d3d8c.evidence.json',
  editor_ready_path: 'field-tests/arc-command-effects-2026-11-08/methods/method-0x1012d3598.evidence.json',
  header: 'field-tests/arc-dispatch-2026-11-06/native/macho-header-load-commands.evidence.json',
  function_starts: 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json',
};
const records = {}, references = {};
for (const [anchor, filename] of Object.entries(anchors)) {
  const raw = await fs.readFile(path.join(root, filename));
  const record = parseEvidence(JSON.parse(raw));
  assert.equal(record.subject.digest.sha256, targetSha256);
  records[anchor] = record;
  references[anchor] = { path: filename, evidence_id: record.evidence_id, file_sha256: hash(raw), operation: record.operation, authority: record.authority, confidence: record.confidence, subject_sha256: targetSha256, analysis_profile_digest: record.analysis_profile?.digest ?? null };
}
const pseudo = anchor => typeof records[anchor].normalized_result === 'string'
  ? records[anchor].normalized_result : records[anchor].normalized_result.pseudocode;
for (const anchor of ['getter', 'publish_success', 'publish_failure']) {
  assert.ok(pseudo(anchor).includes('UNK_10378b2c8'));
  assert.ok(pseudo(anchor).includes('UNK_10378b2f0'));
}
assert.ok(pseudo('getter').includes('param_1[3] = uStack_48'));
assert.ok(pseudo('getter').includes('*(undefined1 *)(param_1 + 4) = uStack_40'));
assert.ok(pseudo('task_starter').includes('&UNK_10378b2c0'));
assert.ok(pseudo('task_starter').includes('FUN_1012f311c'));
assert.ok(pseudo('task_starter').includes('unaff_x20 + 0x30'));
for (const [anchor, instruction] of [
  ['browser_getter', '0x1012d3dd0: bl 0x1004c6010'],
  ['browser_getter', '0x1012d3ddc: bl 0x1004ad574'],
  ['editor_init', '0x1012d2e88: bl 0x1012cd820'],
  ['editor_init', '0x1012d3108: bl 0x100aa47d0'],
]) assert.ok(records[anchor].normalized_result.assembly.includes(instruction));

const header = records.header.normalized_result;
assert.equal(header.complete, true);
const rawHeader = Buffer.from(header.bytes_hex, 'hex');
assert.equal(rawHeader.readUInt32LE(0), 0xfeedfacf);
let cursor = 32, imageBase, indexLength;
for (let i = 0; i < rawHeader.readUInt32LE(16); i++) {
  const kind = rawHeader.readUInt32LE(cursor), length = rawHeader.readUInt32LE(cursor + 4);
  if (kind === 0x19 && rawHeader.readBigUInt64LE(cursor + 40) === 0n && rawHeader.readBigUInt64LE(cursor + 48) > 0n) imageBase = rawHeader.readBigUInt64LE(cursor + 24);
  if (kind === 0x26) indexLength = rawHeader.readUInt32LE(cursor + 12);
  cursor += length;
}
assert.equal(imageBase, 0x100000000n);
assert.equal(records.function_starts.normalized_result.complete, true);
const encoded = Buffer.from(records.function_starts.normalized_result.bytes_hex, 'hex');
assert.equal(encoded.length, indexLength);
const starts = []; let current = imageBase, delta = 0n, shift = 0n;
for (const byte of encoded) {
  delta |= BigInt(byte & 127) << shift;
  if (byte & 128) { shift += 7n; continue; }
  if (!delta) break;
  current += delta; starts.push(current); delta = shift = 0n;
}
assert.equal(starts.length, 271299);
const functions = [
  ['0x1012e4cec', 'getter', 'Follow consumers of the published four-word-plus-flag value toward drawing.'],
  ['0x1012e4d6c', 'task_starter', 'Recover the initiating point/event updates and conditional task scheduling.'],
  ['0x1012f311c', 'task_starter', 'Trace how the captured task descriptor and self/point fields are invoked; do not assume the initiating UI event.'],
  ['0x1012cd820', 'editor_init', 'Identify the content value metadata used by editor initialization and its View body route.'],
  ['0x100aa47d0', 'editor_init', 'Identify the allocated hosting/content constructor and the concrete view type it receives.'],
  ['0x1004c6010', 'browser_getter', 'Identify the first object/type source used before obtaining the browser manager.'],
  ['0x1004ad574', 'browser_getter', 'Resolve the manager receiver for native slots +0x390/+0x3b0 on the selected editor path.'],
  ['0x1012d3598', 'editor_ready_path', 'Bind URL comparison and slot +0x1e8 handoff to named interface implementations, independent of reducer-case ownership.'],
].map(([entry, source, question]) => {
  const index = starts.indexOf(BigInt(entry)); assert.notEqual(index, -1);
  return { entry, question, source, source_evidence_id: records[source].evidence_id, public_lc_function_start: true, next_indexed_start: `0x${starts[index + 1].toString(16)}`, indexed_interval_bytes: Number(starts[index + 1] - starts[index]), interval_is_not_function_body_proof: true };
});

const firstSteps = [
  { name: 'procedure_references', arguments: { procedure: '0x1012e4cec', direction: 'incoming' }, label: 'hover-value-getter-consumers' },
  { name: 'xrefs', arguments: { address: '0x10378b2c8' }, label: 'hover-wrapped-keypath-users' },
  { name: 'xrefs', arguments: { address: '0x10378b2f0' }, label: 'hover-storage-keypath-users' },
  { name: 'read_bytes', arguments: { address: '0x10378b2b0', length: 128 }, label: 'hover-task-descriptor-and-keypath-bytes' },
  { name: 'procedure_references', arguments: { procedure: '0x1012e4d6c', direction: 'incoming' }, label: 'hover-task-starter-callers' },
  { name: 'read_function_instructions', arguments: { procedure: '0x1012f311c' }, label: 'hover-task-helper-instructions' },
  { name: 'procedure_pseudo_code', arguments: { procedure: '0x1012f311c' }, label: 'hover-task-helper-pseudocode' },
];
const helperSteps = ['0x1012cd820', '0x100aa47d0', '0x1004c6010', '0x1004ad574'].flatMap(entry => [
  { name: 'read_function_instructions', arguments: { procedure: entry }, label: `helper-${entry}-instructions` },
  { name: 'procedure_pseudo_code', arguments: { procedure: entry }, label: `helper-${entry}-pseudocode` },
]);
const catalogPath = 'field-tests/arc-dispatch-load-2026-11-09/arc-final-2026-11-13/catalog.json';
const catalogRaw = await fs.readFile(path.join(root, catalogPath));
const catalogValue = JSON.parse(catalogRaw);
const catalog = Array.isArray(catalogValue) ? catalogValue : catalogValue.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of [...firstSteps, ...helperSteps]) {
  const advertised = catalog.find(tool => tool.name === step.name); assert.ok(advertised);
  const validate = ajv.compile(advertised.inputSchema);
  assert.ok(validate(step.arguments), `${step.name}: ${JSON.stringify(validate.errors)}`);
}
const additionalSeeds = ['0x1004ad574', '0x1004c6010', '0x100aa47d0'].map(entry => `${entry}\tfunction\n`).join('');
const scope = {
  target_version: 'Arc 1.172.1 / 90370', target_sha256: targetSha256,
  authority: 'Analyst follow-up preparation from authenticated retained Evidence; the proposed requests have not been executed',
  schema_basis: { path: catalogPath, file_sha256: hash(catalogRaw), note: 'Revalidate against the actual advertised catalog of the new session before issuing calls.' },
  source_preparation: 'Use the verified current ARM64 main slice and preferred retained seed set; merge additional-seeds.tsv if running the optional four-helper batch, and record the actual merged hash. Public function starts are caller seed hypotheses, not automatic discoveries or complete body extents.',
  execution: 'Append steps to an authorized local Ghidra session; these steps-only files do not open a target, start a provider or authorize any target execution. Export canonical Evidence and close/verify lineage in the owning recorder.',
};
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('reference-index.json', { target_sha256: targetSha256, references });
await save('candidate-targets.json', { ...scope, functions, data: [
  { address: '0x10378b2c0', source: 'task_starter', question: 'Resolve the static async descriptor passed to the task helper; no runtime task observation.' },
  { address: '0x10378b2c8', source: 'getter', question: 'Follow wrapped-property keypath references and identify its accessor/consumer implementations.' },
  { address: '0x10378b2f0', source: 'getter', question: 'Follow backing Published-storage keypath references; prove property/type identity before naming its visible representation.' },
  { address: '0x103d7bcb4', source: 'selector_class', question: 'Retain exact indexed HoveredElementTracker identity when interpreting its vtable and property consumers; no metadata instantiation.' },
] });
await save('first-batch.steps.json', { ...scope, steps: firstSteps });
await save('optional-helper-batch.steps.json', { ...scope, steps: helperSteps });
await fs.writeFile(path.join(directory, 'additional-seeds.tsv'), additionalSeeds);
await save('validation.json', {
  status: 'passed', checked_at: new Date().toISOString(), target_sha256: targetSha256,
  authority: 'Read-only Evidence authentication, file hashes, retained literal/instruction checks, public-byte function-start derivation and request-schema validation; no proposed native requests were executed',
  canonical_evidence: Object.keys(records).length, indexed_function_starts: starts.length,
  exact_candidate_function_starts: functions.length, proposed_requests_schema_checked: firstSteps.length + helperSteps.length,
  first_batch_requests: firstSteps.length, optional_helper_requests: helperSteps.length,
  additional_seed_count: 3, additional_seed_sha256: hash(additionalSeeds),
  captured_source_call_instruction_checks: 4,
  keypath_pair_present_in_getter_and_both_publications: true,
  proposed_provider_calls_executed: 0, target_execution: false,
});
console.log(JSON.stringify({ status: 'passed', canonical_evidence: Object.keys(records).length, candidate_starts: functions.length, schema_checked_requests: firstSteps.length + helperSteps.length, provider_calls_executed: 0 }));
