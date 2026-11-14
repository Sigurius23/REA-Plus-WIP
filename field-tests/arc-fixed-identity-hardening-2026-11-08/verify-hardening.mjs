import fs from 'node:fs/promises';
import { createReadStream } from 'node:fs';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { fileURLToPath, pathToFileURL } from 'node:url';

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const { parseEvidence } = await import(pathToFileURL(root + '/rea-local/dist/domain/evidence.js'));
const { toolContract } = await import(pathToFileURL(root + '/rea-local/dist/contracts/toolContracts.js'));
const { analysisErrorProjectionSchema } = await import(pathToFileURL(root + '/rea-local/dist/contracts/errorSchemas.js'));
const { parseArtifactInventoryEvidence } = await import(pathToFileURL(root + '/rea-local/dist/domain/artifactInventoryEvidence.js'));
const { projectAppleApplication } = await import(pathToFileURL(root + '/rea-local/dist/domain/apple/appleApplication.js'));
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const hash = bytes => createHash('sha256').update(bytes).digest('hex');
const fileHash = async name => {
  const h = createHash('sha256');
  for await (const bytes of createReadStream(name)) h.update(bytes);
  return h.digest('hex');
};
const samePath = (left, right) => path.resolve(left).replace(/^\/private\/tmp\//, '/tmp/') === path.resolve(right).replace(/^\/private\/tmp\//, '/tmp/');
const index = await read('evidence-index.json');
const scope = await read('scope.json');
const findings = await read('findings.json');
const records = new Map();
for (const [label, item] of Object.entries(index.records)) {
  const bytes = await fs.readFile(path.join(root, item.path));
  assert.equal(hash(bytes), item.file_sha256, label + ': retained file digest');
  const e = parseEvidence(JSON.parse(bytes));
  toolContract(e.operation).outputSchema.parse(e);
  assert.equal(e.evidence_id, item.evidence_id, label + ': canonical Evidence identity');
  assert.equal(e.operation, item.operation);
  assert.equal(e.subject.digest.sha256, item.subject_sha256);
  assert.equal(e.provider.id, item.provider);
  assert.equal(e.authority, item.authority);
  assert.equal(e.confidence, item.confidence);
  assert.equal(e.analysis_profile?.digest ?? null, item.analysis_profile_digest);
  records.set(label, e);
}
assert.equal(records.size, 53);
const source = records.get('source-inventory');
const parsed = parseArtifactInventoryEvidence([source]);
assert.equal(parsed.inventory.complete, true);
assert.equal(parsed.inventory.manifest.root_sha256, scope.source_root_sha256);
assert.equal(scope.source_root_sha256, 'd1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778');
const projection = records.get('application-projection');
const nestedInventory = parseEvidence(source.normalized_result.substeps[0].evidence);
assert.equal(nestedInventory.operation, 'inventory_artifact');
assert.deepEqual(projection.normalized_result.source_evidence_ids, [nestedInventory.evidence_id]);
assert.deepEqual(projectAppleApplication({ inventory_evidence: [nestedInventory] }), projection.normalized_result);
assert.equal(projection.normalized_result.coverage.inventory_complete, true);
assert.equal(projection.normalized_result.bundles.length, 110);
assert.equal(projection.normalized_result.components.executables.length, 28);
assert.deepEqual(scope.components.map(x => x.inventory), projection.normalized_result.components.executables);
assert.equal(projection.normalized_result.components.privileged_helpers.length, 0);
assert.equal(projection.normalized_result.components.launchd_plists.length, 0);
const roles = {};
for (const b of projection.normalized_result.bundles) roles[b.role] = (roles[b.role] ?? 0) + 1;
assert.deepEqual(roles, scope.bundle_roles);
assert.deepEqual(roles, { application: 1, framework: 9, 'helper-application': 8, 'resource-bundle': 88, 'nested-application': 1, 'xpc-service': 2, 'plug-in': 1 });

const cli = await read('cli-verification.json');
assert.equal(cli.status, 'passed');
assert.equal(cli.target_executed, false);
assert.equal(cli.results.length, 50);
assert.equal(findings.signature_count, 28);
assert.equal(scope.components.length, 28);
assert.equal(scope.plists.length, 22);
const observedSignatureRows = [];
const signatureCommands = [
  ['/usr/bin/codesign', '-d', '--verbose=4', '$ARTIFACT'],
  ['/usr/bin/codesign', '-d', '-r-', '$ARTIFACT'],
  ['/usr/bin/codesign', '-d', '--entitlements', ':-', '$ARTIFACT'],
];
for (const c of scope.components) {
  const label = c.label + '-signature';
  const e = records.get(label), v = e.normalized_result;
  const raw = await read('cli/' + label + '.cli.json');
  assert.deepEqual(raw, e, label + ': complete CLI parity');
  assert.equal(e.operation, 'inspect_signature');
  assert.equal(e.subject.digest.sha256, c.inventory.sha256);
  assert.equal(e.subject.digest.sha256, c.sha256_before);
  assert.ok(samePath(e.subject.local_path, c.path));
  assert.equal(v.signed, true);
  assert.equal(v.team_identifier, 'S6N382Y83G');
  assert.deepEqual(v.authorities, ['Developer ID Application: The Browser Company of New York Inc. (S6N382Y83G)', 'Developer ID Certification Authority', 'Apple Root CA']);
  assert.equal(typeof v.designated_requirement, 'string');
  assert.deepEqual(v.provenance.map(p => p.command), signatureCommands);
  for (const p of v.provenance) assert.deepEqual(p.exit, { code: 0, signal: null });
  observedSignatureRows.push({ label, path: c.inventory.path, sha256: c.sha256_before, evidence_id: e.evidence_id, identifier: v.identifier, signed: v.signed, hardened_runtime: v.hardened_runtime, team_identifier: v.team_identifier, entitlements: v.entitlements });
}
assert.deepEqual(observedSignatureRows, findings.signature_rows);
assert.equal(observedSignatureRows.filter(x => x.hardened_runtime === true).length, 24);
assert.equal(observedSignatureRows.filter(x => x.hardened_runtime === false).length, 4);
assert.deepEqual(observedSignatureRows.filter(x => x.hardened_runtime === false).map(x => path.basename(x.path)), ['libaperitif.dylib', 'libvk_swiftshader.dylib', 'libvulkan.dylib', 'libswiftCompatibilitySpan.dylib']);
assert.deepEqual(observedSignatureRows.filter(x => x.entitlements?.['com.apple.security.cs.allow-jit'] === true).map(x => x.label), findings.jit_labels);
assert.deepEqual(findings.jit_labels, ['exec-03-signature', 'exec-04-signature', 'exec-06-signature', 'exec-07-signature']);
assert.deepEqual(observedSignatureRows.filter(x => x.entitlements?.['com.apple.security.cs.disable-library-validation'] === true).map(x => x.label), findings.disable_library_validation_labels);
assert.deepEqual(findings.disable_library_validation_labels, ['exec-05-signature', 'exec-08-signature']);
assert.deepEqual(observedSignatureRows.filter(x => x.entitlements === null).map(x => x.label), findings.null_entitlements_labels);
const main = records.get('exec-26-signature').normalized_result;
assert.equal(main.identifier, 'company.thebrowser.Browser');
assert.equal(main.hardened_runtime, true);
assert.deepEqual(main.entitlements['com.apple.developer.icloud-container-identifiers'], ['iCloud.net.arc.sidebar']);
assert.deepEqual(main.entitlements['com.apple.developer.icloud-services'], ['CloudKit']);
assert.deepEqual(main.entitlements['com.apple.developer.associated-domains'], ['webcredentials:arc.net']);
assert.deepEqual(main.entitlements['keychain-access-groups'], ['S6N382Y83G.company.thebrowser.browser.webauthn', 'S6N382Y83G.company.thebrowser.browser.auth']);
for (const name of ['com.apple.security.device.audio-input', 'com.apple.security.device.camera', 'com.apple.security.personal-information.location', 'com.apple.developer.web-browser.public-key-credential']) assert.equal(main.entitlements[name], true);
for (const name of ['com.apple.security.get-task-allow', 'com.apple.security.app-sandbox', 'com.apple.security.cs.allow-jit', 'com.apple.security.cs.disable-library-validation']) assert.equal(Object.hasOwn(main.entitlements, name), false);
const repeat = records.get('main-signature-repeat');
assert.equal(repeat.subject.digest.sha256, records.get('exec-26-signature').subject.digest.sha256);
const signatureAttributes = ({ provenance, ...attributes }) => attributes;
assert.deepEqual(signatureAttributes(repeat.normalized_result), signatureAttributes(main), 'separate app-target CLI and file-target CLI agree on displayed signature attributes; capture byte counts retain temporary-path differences');
assert.deepEqual(repeat.normalized_result.provenance.map(p => p.command), signatureCommands);
for (const p of repeat.normalized_result.provenance) assert.deepEqual(p.exit, { code: 0, signal: null });

for (const c of scope.plists) {
  const label = c.label + '-plist';
  const e = records.get(label), v = e.normalized_result;
  assert.deepEqual(await read('cli/' + label + '.cli.json'), e);
  assert.equal(e.operation, 'inspect_plist');
  assert.ok(samePath(e.parameters.path, c.path));
  assert.ok(samePath(v.source_path, c.path));
  // Explicit plist selection does not rebind the active executable context.
  assert.equal(e.subject.digest.sha256, '2e9f606a54ff12d7bdff4febccb2ae1beed540874b41cb5f5c935ffbc345c3d1');
  assert.deepEqual(findings.plist_rows.find(x => x.label === label), { label, bundle_path: c.bundle_path, role: c.role, source_path: v.source_path, source_sha256: c.sha256_before, evidence_id: e.evidence_id, context_subject_sha256: e.subject.digest.sha256, bundle: v.bundle });
}
const mainPlist = records.get('bundle-00-plist').normalized_result;
assert.deepEqual(mainPlist.bundle, { identifier: 'company.thebrowser.Browser', executable: 'Arc', name: 'Arc', version: '90370', short_version: '1.172.1' });
assert.equal(mainPlist.value.LSMinimumSystemVersion, '13.0.0');
assert.equal(mainPlist.value.NSPrincipalClass, 'Arc.BrowserApp');
assert.equal(mainPlist.value.NSAppTransportSecurity.NSAllowsArbitraryLoads, true);
assert.equal(mainPlist.value.LSFileQuarantineEnabled, true);
assert.deepEqual(mainPlist.value.CFBundleURLTypes.flatMap(x => x.CFBundleURLSchemes), ['mailto', 'https', 'http', 'arcBrowser']);
assert.equal(mainPlist.value.SUFeedURL, 'https://releases.arc.net/updates.xml');
assert.equal(mainPlist.value.SUEnableAutomaticChecks, true);
assert.equal(mainPlist.value.SUAutomaticallyUpdate, true);
assert.equal(mainPlist.value.SUScheduledCheckInterval, 28800);
assert.equal(typeof mainPlist.value.SUPublicEDKey, 'string');
assert.equal(records.get('bundle-01-plist').normalized_result.bundle.short_version, '157.0.8103.39');
assert.equal(records.get('bundle-13-plist').normalized_result.bundle.short_version, '2.9.4');
assert.equal(records.get('bundle-15-plist').normalized_result.value.NSAppTransportSecurity.NSAllowsArbitraryLoads, false);
for (let i = 2; i <= 9; i++) assert.equal(records.get(`bundle-${String(i).padStart(2, '0')}-plist`).normalized_result.value.LSUIElement, '1');
for (const row of cli.results) {
  assert.equal(row.exit_code, 0);
  assert.equal(row.evidence_id, records.get(row.label).evidence_id);
}

const failedReply = await read('capture/exec-00-open.reply.json');
assert.equal(failedReply.isError, true);
const failed = analysisErrorProjectionSchema.parse(JSON.parse(failedReply.content.find(x => x.type === 'text').text).error);
assert.equal(failed.code, 'capability_unavailable');
assert.equal(failed.category, 'unsupported_provider');
assert.ok(failed.details.rejections.some(r => r.provider_id === 'ghidra' && r.code === 'architecture_unsupported'));
const failedSummary = await read('capture/summary.json');
assert.equal(failedSummary.status, 'failed');
assert.equal(failedSummary.calls, 1);
assert.equal(failedSummary.errors, 1);
assert.equal(failedSummary.verifier_run.process_lineage.status, 'verified');
assert.deepEqual(failedSummary.verifier_run.process_lineage.descendants, []);

const inputs = [];
if (process.argv.includes('--check-inputs')) {
  for (const c of [...scope.components, ...scope.plists]) {
    const observed = await fileHash(c.path);
    assert.equal(observed, c.sha256_before, c.label + ': selected original input hash');
    inputs.push({ label: c.label, path: c.path, sha256_before: c.sha256_before, sha256_after: observed });
  }
}
const markdown = await fs.readFile(path.join(directory, '../arc-fixed-identity-hardening-2026-11-08.md'), 'utf8');
for (const match of markdown.matchAll(/\]\(([^)]+)\)/g)) if (!match[1].includes('://')) await fs.access(path.resolve(directory, '..', match[1]));
console.log(JSON.stringify({ status: 'passed', checked_at: new Date().toISOString(), authority: 'Canonical retained Evidence, named public contracts, CLI parity, authenticated inventory and explicit finding consistency; optional current-file hashes are supplemental integrity checks', target_executed: false, indexed_evidence: records.size, signature_observations: scope.components.length, plist_observations: scope.plists.length, public_cli_calls: cli.results.length, additional_main_cli_call: 1, signed: 28, hardened_runtime_true: 24, hardened_runtime_false: 4, runtime_observed: false, failed_mcp_open_calls: 1, failed_mcp_descendants: [], selected_inputs_rehashed: inputs.length, inputs }, null, 2));
