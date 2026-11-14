import assert from "node:assert/strict";
import { createHash } from "node:crypto";
import { execFileSync } from "node:child_process";
import fs from "node:fs/promises";
import path from "node:path";
import { fileURLToPath, pathToFileURL } from "node:url";

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, "../..");
const { parseEvidence } = await import(
  pathToFileURL(path.join(root, "rea-local/dist/domain/evidence.js"))
);
const { parseEvidenceBundle } = await import(
  pathToFileURL(path.join(root, "rea-local/dist/domain/evidenceBundle.js"))
);
const read = async (name) => JSON.parse(await fs.readFile(path.join(directory, name), "utf8"));
const hash = (bytes) => createHash("sha256").update(bytes).digest("hex");
const tables = (evidence) =>
  evidence.normalized_result.native_api.jump_tables.filter((table) =>
    table.data_sources.some((source) => source.provenance === "rea-swift-enum-signed-word-table"),
  );
const emptyLineage = (value) => {
  assert.equal(value.status, "verified");
  assert.deepEqual(value.descendants, []);
};

const full = await read("full-final/summary.json");
assert.equal(full.ok, true);
assert.equal(full.target_executed, false);
assert.equal(full.results.length, 44);
assert.equal(full.results.filter((row) => row.positive).length, 5);
assert.equal(full.results.filter((row) => row.cli_parity).length, 3);
assert.equal(full.records.length, 176);
assert.ok(full.records.every((row) => !row.is_error));
emptyLineage(full.process_lineage);
const retained = await read("full-final/retention.json");
for (const file of retained.files) {
  const bytes = await fs.readFile(path.join(directory, "full-final", file.path));
  assert.equal(bytes.length, file.bytes, file.path);
  assert.equal(hash(bytes), file.sha256, file.path);
}
for (const row of full.records) {
  const file = `${row.label}/${path.basename(row.reply.path)}`;
  const bytes = await fs.readFile(path.join(directory, "full-final", file));
  assert.equal(hash(bytes), row.reply.sha256, file);
  assert.notEqual(JSON.parse(bytes).isError, true);
}
const evidenceIds = new Set();
for (const row of full.results) {
  const observations = full.records.filter(
    (record) => record.label === row.label && record.name === "analyze_function",
  );
  assert.equal(observations.length, 1);
  const reply = await read(`full-final/${row.label}/${path.basename(observations[0].reply.path)}`);
  const evidence = parseEvidence(reply.structuredContent);
  evidenceIds.add(evidence.evidence_id);
  assert.equal(evidence.evidence_id, row.evidence_id);
  assert.equal(evidence.subject.digest.sha256, row.target.sha256);
  assert.equal(
    evidence.analysis_profile.parameters.swift_enum_switch_recovery,
    "abi-signed-word-cfg-v7",
  );
  if (row.positive) {
    const oracle = await read(`full-final/${row.label}/oracle.json`);
    assert.equal(tables(evidence).length, 1);
    assert.deepEqual(
      tables(evidence)[0].mappings.map(({ case_value, target_address }) => ({
        case_value,
        target_address,
      })),
      oracle.oracle.mappings.map(({ case_value, target_address }) => ({
        case_value,
        target_address,
      })),
    );
  } else assert.deepEqual(tables(evidence), []);
  if (row.cli_parity)
    assert.equal(
      parseEvidence(await read(`full-final/${row.label}/cli.json`)).evidence_id,
      evidence.evidence_id,
    );
}

const writeback = [];
for (const label of ["retired_sp_writeback_tag_load", "retired_sp_writeback_tag_load_with_call"]) {
  const before = parseEvidence(await read(`sp-writeback-before/${label}-function.evidence.json`));
  const after = parseEvidence(await read(`sp-writeback-after/${label}-function.evidence.json`));
  assert.equal(before.subject.digest.sha256, after.subject.digest.sha256);
  assert.equal(tables(before).length, 1);
  assert.equal(tables(after).length, 0);
  writeback.push({
    label,
    sha256: after.subject.digest.sha256,
    before: before.evidence_id,
    after: after.evidence_id,
    before_body: before.normalized_result.procedure.body.total_bytes,
    after_body: after.normalized_result.procedure.body.total_bytes,
  });
}
for (const phase of ["sp-writeback-before", "sp-writeback-after"]) {
  const summary = await read(`${phase}/summary.json`);
  assert.equal(summary.status, "completed");
  assert.deepEqual([summary.calls, summary.successful, summary.errors], [7, 7, 0]);
  emptyLineage(summary.verifier_run.process_lineage);
  parseEvidenceBundle(await read(`${phase}/evidence-bundle.json`));
}

const arc = await read("arc-final-2026-11-13/summary.json");
assert.deepEqual([arc.calls, arc.successful, arc.errors], [20, 20, 0]);
assert.equal(arc.status, "completed");
emptyLineage(arc.verifier_run.process_lineage);
for (const name of ["close", "repeat-2-close", "repeat-3-close"])
  assert.notEqual((await read(`arc-final-2026-11-13/${name}.reply.json`)).isError, true);
for (const name of ["evidence-bundle.json", "repeat-2-bundle.json", "repeat-3-bundle.json"])
  parseEvidenceBundle(await read(`arc-final-2026-11-13/${name}`));
const reducer = parseEvidence(await read("arc-final-2026-11-13/boost-reducer.evidence.json"));
assert.equal(reducer.normalized_result.procedure.body.total_bytes, 2024);
assert.equal(reducer.normalized_result.procedure.body.span_bytes, 8608);
assert.equal(tables(reducer).length, 0);
const recovery = await read("arc-input-recovery-2026-11-13.json");
assert.equal(reducer.subject.digest.sha256, recovery.sha256);
const afterInput = await read("input-after-analysis-2026-11-13.json");
assert.equal(afterInput.sha256, recovery.sha256);
assert.equal(afterInput.unchanged, true);

// Historical source audit uses immutable Git objects rather than the current
// working tree, so later producer development does not rewrite these claims.
const commitments = await read("final-runtime-source-commitments-2026-11-13.json");
const cleanupFiles = new Set([
  "rea-local/src/process/ProcessOwnership.ts",
  "rea-local/src/process/ProviderProcess.ts",
  "rea-local/src/ghidra/GhidraLauncher.ts",
]);
const sourceRevisions = { swift: "f2cdb96ba", cleanup: "72fcdbe8c" };
for (const file of commitments.files) {
  const revision = cleanupFiles.has(file.path) ? sourceRevisions.cleanup : sourceRevisions.swift;
  const bytes = execFileSync("git", ["show", `${revision}:${file.path}`], {
    cwd: root,
    maxBuffer: 1024 * 1024,
  });
  assert.equal(hash(bytes), file.sha256, `${revision}:${file.path}`);
}
const runStart = await read("full-final/run-start.json");
assert.equal(
  runStart.producer.sha256,
  commitments.files.find((file) => file.path.endsWith("/ReaGhidraSwiftEnumSwitches.java")).sha256,
);
const result = {
  status: "passed",
  checked_at: new Date().toISOString(),
  authority:
    "Canonical retained Evidence, independent compiler-oracle comparisons and immutable source audit; no target execution or feature-completeness claim",
  swift_cases: 44,
  positive_cases: 5,
  rejection_controls: 39,
  mcp_calls: 176,
  cli_mcp_comparisons: 3,
  retained_files_authenticated: retained.files.length,
  unique_function_evidence: evidenceIds.size,
  source_revisions: sourceRevisions,
  writeback_same_input_comparisons: writeback,
  arc: {
    calls: 20,
    sessions: 3,
    explicit_closes: 3,
    reducer_body_bytes: 2024,
    reducer_span_bytes: 8608,
    recovered_nested_tables: 0,
    remaining_issue: 55,
  },
  owned_descendants: [],
  target_executed: false,
};
await fs.writeFile(
  path.join(directory, "final-verification.json"),
  JSON.stringify(result, null, 2) + "\n",
);
console.log(JSON.stringify(result));
