import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath, pathToFileURL} from 'node:url';

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const {parseEvidence} = await import(pathToFileURL(path.join(root, 'rea-local/dist/domain/evidence.js')));
const load = async relative => parseEvidence(JSON.parse(await fs.readFile(path.join(directory, relative), 'utf8')));
const branchAddresses = record => record.normalized_result.native_value_flow.operations
  .filter(operation => operation.opcode === 'CBRANCH').map(operation => operation.address);
const records = [];
for (const [label, expectedGuards, expectedAdjustments] of [
  ['command-helper', ['0x10053c7b0', '0x10053c844'], 1],
  ['payload-decoder', ['0x1004cab40', '0x1004cab58'], 2],
  ['request-decoder-helper', ['0x10053cb58', '0x10053cb78', '0x10053cbb8', '0x10053cc80', '0x10053cde4'], 5],
]) {
  const record = await load(`native/final/${label}.evidence.json`);
  const result = record.normalized_result;
  const branches = branchAddresses(record);
  for (const address of expectedGuards) {
    assert(branches.includes(address), `${label}: missing high-pcode branch ${address}`);
    assert(result.assembly.some(line => line.startsWith(address + ':') && /\bcb[n]?z\b/u.test(line)),
      `${label}: missing machine error guard ${address}`);
  }
  assert(!result.pseudocode.includes('Removing unreachable block'));
  assert.equal(result.native_api.call_model_adjustments.length, expectedAdjustments);
  for (const adjustment of result.native_api.call_model_adjustments) {
    assert.equal(adjustment.register, 'x21');
    assert.equal(adjustment.callee_address_space, 'EXTERNAL');
    assert.equal(adjustment.effective_effect, 'unknown-after-call');
  }
  records.push({label, evidence_id: record.evidence_id, procedure: result.procedure.address,
    body_bytes: result.procedure.body.total_bytes, branch_addresses: branches,
    modeled_call_addresses: result.native_api.call_model_adjustments.map(row => row.call_address),
    control_flow_uncertainties: result.native_value_flow.control_flow_uncertainties});
}
const before = await load('native/followup/command-helper.evidence.json');
const after = await load('native/final/command-helper.evidence.json');
assert(!branchAddresses(before).includes('0x10053c7b0'));
assert.deepEqual(after.normalized_result.assembly, before.normalized_result.assembly);
assert.deepEqual(after.normalized_result.basic_blocks, before.normalized_result.basic_blocks);
assert(after.normalized_result.pseudocode.includes('_swift_getErrorValue'));
assert(after.normalized_result.pseudocode.includes('localizedDescription'));
assert(after.normalized_result.pseudocode.includes('func_0x000100576028'));
const summary = JSON.parse(await fs.readFile(path.join(directory, 'native/final/summary.json'), 'utf8'));
assert.equal(summary.status, 'completed');
assert.equal(summary.verifier_run.process_lineage.status, 'verified');
assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const receipt = {status: 'passed', checked_at: new Date().toISOString(),
  scope: 'Saved public Arc v3 dossiers; static error-branch recovery, not target execution',
  command_before_evidence_id: before.evidence_id, command_after_evidence_id: after.evidence_id,
  machine_assembly_and_cfg_unchanged: true, command_error_branch_restored: true,
  localized_error_response_path_retained: true, records};
await fs.writeFile(path.join(directory, 'native/final/findings.json'), JSON.stringify(receipt, null, 2) + '\n');
console.log(JSON.stringify({status: receipt.status, procedures: records.length,
  command_error_branch_restored: true, modeled_calls: records.reduce((total, row) => total + row.modeled_call_addresses.length, 0)}));
