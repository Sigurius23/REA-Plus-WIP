import fs from "node:fs/promises";
import path from "node:path";
import { fileURLToPath, pathToFileURL } from "node:url";
import assert from "node:assert/strict";
import { createHash } from "node:crypto";

const root = path.dirname(fileURLToPath(import.meta.url));
const load = async p => JSON.parse(await fs.readFile(p, "utf8"));
const manifest = await load(path.join(root, "runtime-manifest.json"));
const { parseEvidence } = await import(pathToFileURL(path.join(manifest.runtime_root, "dist/domain/evidence.js")));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(manifest.runtime_root, "dist/domain/evidenceBundle.js")));
const hash = bytes => createHash("sha256").update(bytes).digest("hex");
for (const row of manifest.files) {
  const bytes = await fs.readFile(path.join(manifest.runtime_root, row.path));
  assert.equal(bytes.length, row.bytes); assert.equal(hash(bytes), row.sha256);
}
const mcp = path.join(root, "mcp");
let evidenceRecords = 0, replies = 0;
for (const name of await fs.readdir(mcp)) {
  if (name.endsWith(".evidence.json")) { parseEvidence(await load(path.join(mcp, name))); evidenceRecords++; }
  if (name.endsWith(".reply.json")) {
    const reply = await load(path.join(mcp, name)); assert.ok(!reply.isError);
    const text = reply.content.find(x => x.type === "text");
    assert.deepEqual(JSON.parse(text.text), reply.structuredContent); replies++;
  }
}
const initial = parseEvidenceBundle(await load(path.join(mcp, "initial.bundle.json")));
const final = parseEvidenceBundle(await load(path.join(mcp, "final.bundle.json")));
const cliBundle = parseEvidenceBundle(await load(path.join(root, "cli/function.bundle.json")));
const summary = parseEvidence(await load(path.join(mcp, "reducer-summary.evidence.json")));
const parentId = summary.normalized_result.parent_evidence_id;
const parent = initial.records.find(r => r.evidence_id === parentId);
assert.ok(parent);
const historical = parseEvidence(await load(path.join(root, "../arc-dynamic-snapshot-2026-11-15/arc-v9-inline-retest/evidence/arc-reducer-inline.evidence.json")));
assert.deepEqual(parent, historical);
assert.deepEqual(cliBundle.records, [parent]);
const cliSummary = parseEvidence(await load(path.join(root, "cli/stdout.json")));
assert.deepEqual(cliSummary, summary);
const complete = parseEvidence(await load(path.join(mcp, "reducer-complete.evidence.json")));
assert.deepEqual(complete.parameters, parent.parameters);
assert.deepEqual(complete.normalized_result, parent.normalized_result);
assert.deepEqual(complete.raw_result, parent.raw_result);
const replay = "Loaded from a local REA+ analysis snapshot; this call did not re-run the provider.";
assert.deepEqual(complete.limitations, [...parent.limitations, replay]);
for (const label of ["assembly-page", "pseudocode-page", "value-flow-page", "native-api", "procedure"]) {
  const page = parseEvidence(await load(path.join(mcp, label + ".evidence.json")));
  assert.equal(page.normalized_result.parent_evidence_id, parentId);
}
const mcpResult = await load(path.join(mcp, "summary.json"));
assert.equal(mcpResult.successful, 37); assert.equal(mcpResult.errors, 0);
assert.equal(mcpResult.verifier_run.process_lineage.status, "verified");
assert.deepEqual(mcpResult.verifier_run.process_lineage.descendants, []);
const cliResult = await load(path.join(root, "cli/verification.json"));
assert.equal(cliResult.status, "passed");
assert.equal(cliResult.verifier_run.process_lineage.status, "verified");
assert.deepEqual(cliResult.verifier_run.process_lineage.descendants, []);
const bindings = await load(path.join(root, "state-field-bindings.json"));
assert.equal(bindings.fields.length, 21);
assert.equal(bindings.fields[5].name, "interstitialType");
assert.equal(bindings.fields[5].trace_field_key, "F24");
assert.equal(bindings.fields[20].name, "hasDismissedJSWarningBanner");
assert.equal(bindings.fields[20].trace_field_key, "F60");
const wireBytes = async label => Buffer.byteLength(JSON.stringify(await load(path.join(mcp, label + ".reply.json"))));
const result = {
  status: "passed", node: process.version, runtime_files_verified: manifest.files.length,
  native_provider: parent.provider, parent_evidence_id: parentId,
  native_parent_equals_saved_baseline: true, cli_and_mcp_summaries_equal: true,
  native_body_bytes: parent.normalized_result.procedure.body.total_bytes,
  switch_mappings: parent.normalized_result.native_api.jump_tables[0].mappings.length,
  mcp_summary_wire_bytes: await wireBytes("reducer-summary"),
  mcp_complete_replay_wire_bytes: await wireBytes("reducer-complete"),
  cli_stdout_bytes: cliResult.stdout_bytes,
  complete_replay_additional_limitation: replay,
  page_wire_bytes: Object.fromEntries(await Promise.all(["assembly-page", "pseudocode-page", "value-flow-page", "native-api", "procedure"].map(async n => [n, await wireBytes(n)]))),
  authenticated_standalone_evidence_records: evidenceRecords, authenticated_replies: replies,
  authenticated_bundles: 3, bundle_records: [initial.records.length, final.records.length, cliBundle.records.length],
  mcp_calls: 37, cli_cases: 1, owned_lineage_verified_empty: true,
  state_field_names_observed: 21,
  boundaries: ["Native analysis and recovery code unchanged; only function delivery added.",
    "Snapshot replay adds a truthful limitation and therefore has a different Evidence ID.",
    "Stored field-vector indices do not establish runtime instance offsets or durable storage.",
    "No Arc executable or shipped JavaScript was executed."]
};
await fs.writeFile(path.join(root, "verification.json"), JSON.stringify(result, null, 2) + "\n");
console.log(JSON.stringify(result));
