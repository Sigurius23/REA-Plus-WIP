import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';

// Recorder validation only: this does not run providers or add recovery facts.
const root = path.dirname(fileURLToPath(import.meta.url));
const pkg = path.resolve(root, '../../rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle, createEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const json = async (p) => JSON.parse(await fs.readFile(p, 'utf8'));
const sha = (value) => createHash('sha256').update(value).digest('hex');
const relative = (p) => path.relative(root, p);
const write = (p, value) => fs.writeFile(p, JSON.stringify(value, null, 2) + '\n');
async function files(dir) {
  const out = [];
  for (const entry of await fs.readdir(dir, { withFileTypes: true })) {
    const p = path.join(dir, entry.name);
    if (entry.isDirectory()) out.push(...await files(p));
    else if (entry.isFile()) out.push(p);
  }
  return out.sort();
}
async function expand(value, dir) {
  if (Array.isArray(value)) return Promise.all(value.map((v) => expand(v, dir)));
  if (value && typeof value === 'object') {
    if ('$json_file' in value) {
      let resolved = await json(path.resolve(dir, value.$json_file));
      for (const key of value.select ?? []) resolved = resolved[key];
      return resolved;
    }
    return Object.fromEntries(await Promise.all(Object.entries(value).map(async ([k, v]) => [k, await expand(v, dir)])));
  }
  return value;
}

// The unseeded run closed after its continuation window. This is a selected
// record bundle, not an export of that session's full ledger or unknown graph.
const nativeRecords = [];
for (const p of await files(path.join(root, 'native'))) {
  if (path.dirname(p) === path.join(root, 'native') && p.endsWith('.evidence.json')) {
    const record = parseEvidence(await json(p));
    if (!p.endsWith('objc-max-records.cli.evidence.json')) nativeRecords.push(record);
  }
}
const selected = parseEvidenceBundle(createEvidenceBundle(nativeRecords));
await write(path.join(root, 'native/selected-records-bundle.json'), selected);

const all = await files(root);
const compaction = await json(path.join(root, 'input-compaction-receipt.json'));
for (const entry of compaction.files) {
  assert.equal(sha(await fs.readFile(path.join(root, entry.path))), entry.compacted_sha256);
  assert.equal(entry.exact_reconstruction_verified, true);
}
const standalone = [];
const bundles = [];
for (const p of all) {
  if (p.endsWith('.evidence.json') || (path.dirname(p) === path.join(root, 'identity') && p.endsWith('.json'))) {
    const record = parseEvidence(await json(p));
    standalone.push({ path: relative(p), evidence_id: record.evidence_id, bytes: (await fs.stat(p)).size, sha256: sha(await fs.readFile(p)) });
  } else if (p.endsWith('.json') && (p.includes('evidence-bundle') || p.endsWith('selected-records-bundle.json'))) {
    const value = await json(p);
    if (value.records) {
      const parsed = parseEvidenceBundle(value);
      bundles.push({ path: relative(p), records: parsed.records.length, evidence_ids: parsed.records.map((r) => r.evidence_id), sha256: sha(await fs.readFile(p)) });
    }
  }
}

const stages = [];
for (const p of all.filter((p) => p.endsWith('/invocations.json'))) {
  const dir = path.dirname(p);
  // Independent catalog instances can repeat $id values. Each stage has its
  // own AJV instance, matching the actual client sessions.
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  const catalog = await json(path.join(dir, 'catalog.json'));
  const calls = await json(p);
  let successful = 0;
  const errors = [];
  for (const call of calls) {
    const advertised = catalog.find((t) => t.name === call.name);
    assert.ok(advertised, call.name);
    const args = await expand(call.arguments, dir);
    assert.ok(ajv.validateSchema(advertised.inputSchema));
    assert.ok(ajv.validate(advertised.inputSchema, args), JSON.stringify(ajv.errors));
    assert.equal(call.thrown, null);
    const reply = await json(path.join(dir, call.reply));
    assert.equal(reply.isError === true, call.is_error);
    if (reply.isError) {
      errors.push({ tool: call.name, reply: call.reply });
      continue;
    }
    const value = reply.structuredContent;
    assert.ok(value);
    assert.ok(ajv.validateSchema(advertised.outputSchema));
    assert.ok(ajv.validate(advertised.outputSchema, value), JSON.stringify(ajv.errors));
    toolContract(call.name).outputSchema.parse(value);
    assert.deepEqual(JSON.parse(reply.content.find((c) => c.type === 'text').text), value);
    if (value.evidence_id) parseEvidence(value);
    successful++;
  }
  const summary = await json(path.join(dir, 'summary.json'));
  assert.equal(summary.calls, calls.length);
  assert.equal(summary.successful, successful);
  const lineage = summary.verifier_run.process_lineage;
  if (lineage.status === 'verified') assert.deepEqual(lineage.descendants, []);
  stages.push({ directory: relative(dir), calls: calls.length, successful, errors, lineage_status: lineage.status, run_id: summary.verifier_run.run_id });
}

const cliFiles = [
  'identity/inspect-artifact.json', 'identity/inspect-plist.json', 'identity/inspect-macho.json',
  'resources/selected-14544.cli.evidence.json', 'resources/selected-14559.cli.evidence.json',
  'native/objc-max-records.cli.evidence.json',
];
const cliAjv = new Ajv2020({ strict: false, validateFormats: false });
const catalog = await json(path.join(root, 'native/catalog.json'));
for (const name of cliFiles) {
  const value = parseEvidence(await json(path.join(root, name)));
  const advertised = catalog.find((t) => t.name === value.operation);
  assert.ok(advertised, value.operation);
  assert.ok(cliAjv.validate(advertised.outputSchema, value), JSON.stringify(cliAjv.errors));
  toolContract(value.operation).outputSchema.parse(value);
}

const integrity = await json(path.join(root, 'target-integrity.json'));
assert.equal(integrity.status, 'passed');
assert.deepEqual(integrity.mismatches, []);
const receipt = {
  status: 'passed', observed_at: new Date().toISOString(), source_commit: (await json(path.join(root, 'run-context.json'))).source_commit,
  scope: 'Retained public replies and losslessly referenced arguments revalidated against each actual catalog, named contracts, Evidence authentication, bundle invariants and text/structured equality; no providers rerun by this helper.',
  mcp_calls: stages.reduce((n, s) => n + s.calls, 0), mcp_successful: stages.reduce((n, s) => n + s.successful, 0),
  cli_outputs: cliFiles, standalone_evidence: standalone, bundles, stages,
  target_regular_files_unchanged: integrity.regular_files_checked,
  target_bytes_checked: integrity.bytes_checked,
  caveats: [
    'Five expected MCP errors: three resource-boundary refusals and two missing Ghidra procedures before seed recovery. One environmental JavaScript worker-startup error is preserved separately.',
    'The original native session expired its recorder continuation window; selected-records-bundle.json was assembled from its authenticated public records, not exported from a live ledger.',
    'The seeded native session exported its own real portable Evidence bundle and closed explicitly.',
    'Eight successful worker sessions have verified empty descendant snapshots. Failed sandbox startup and zero-operation discovery have unavailable OS lineage and are not counted as verified cleanup.',
    'Target integrity compares the prior 782 regular-file records; it does not prove the entire directory set, symlink targets or runtime state.',
  ],
};
await write(path.join(root, 'verification-receipt.json'), receipt);
console.log(JSON.stringify({ status: receipt.status, mcp_calls: receipt.mcp_calls, mcp_successful: receipt.mcp_successful, standalone_evidence: standalone.length, bundles: bundles.length, bundle_record_occurrences: bundles.reduce((n, b) => n + b.records, 0), cli_outputs: cliFiles.length, target_files: integrity.regular_files_checked }));
