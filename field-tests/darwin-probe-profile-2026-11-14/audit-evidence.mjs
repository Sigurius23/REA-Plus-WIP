import assert from "node:assert/strict";
import { createHash } from "node:crypto";
import fs from "node:fs/promises";
import path from "node:path";
import { fileURLToPath, pathToFileURL } from "node:url";

const directory = path.dirname(fileURLToPath(import.meta.url));
const repository = path.resolve(directory, "../../rea-local");
const runtime = path.join(repository, ".cache/arc-runtime-5628ef81");
const hash = (bytes) => createHash("sha256").update(bytes).digest("hex");
const read = (relative) => fs.readFile(path.join(directory, relative));
const json = async (relative) => JSON.parse(await read(relative));
const save = (relative, value) => fs.writeFile(path.join(directory, relative), JSON.stringify(value, null, 2) + "\n");
async function* files(root) {
  for (const entry of (await fs.readdir(root, { withFileTypes: true })).sort((a, b) => a.name.localeCompare(b.name))) {
    const file = path.join(root, entry.name);
    if (entry.isDirectory()) yield* files(file);
    else if (entry.isFile()) yield file;
    else throw new Error(`Unexpected non-file retention entry: ${file}`);
  }
}

const runtimeManifest = await json("retained/sources/v8-runtime-manifest.json");
assert.equal(runtimeManifest.source_commit, "5628ef81ce5144c9af3bdc11b1e3647a9035c368");
const validators = [];
for (const file of runtimeManifest.files.filter((file) => file.path.startsWith("dist/domain/") && file.path.endsWith(".js"))) {
  assert.equal(hash(await fs.readFile(path.join(runtime, file.path))), file.sha256);
  validators.push(file);
}
const { parseEvidence } = await import(pathToFileURL(path.join(runtime, "dist/domain/evidence.js")));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(runtime, "dist/domain/evidenceBundle.js")));
const index = await json("retention-index.json");
const standalone = [], bundles = [], raw = [], errors = [];
for await (const file of files(path.join(directory, "retained"))) {
  if (!file.endsWith(".json")) continue;
  const relative = path.relative(directory, file);
  const value = JSON.parse(await fs.readFile(file, "utf8"));
  if (file.endsWith(".evidence.json")) {
    const record = parseEvidence(value);
    assert.equal(record.analysis_profile.parameters.swift_enum_switch_recovery, "abi-signed-word-cfg-v8");
    assert.equal(record.analysis_profile.parameters.darwin_stack_probe_call_summary, "trusted-darwin-arm64-chkstk-v1");
    standalone.push({ path: relative, evidence_id: record.evidence_id, operation: record.operation });
  } else if (file.endsWith(".bundle.json")) {
    const bundle = parseEvidenceBundle(value);
    bundles.push({ path: relative, records: bundle.records.length });
  } else if (relative.includes("/raw/")) {
    if (value.isError === true) {
      const error = JSON.parse(value.content.find((content) => content.type === "text").text).error;
      errors.push({ path: relative, code: error.code, operation: error.details?.operation, timeout_ms: error.details?.timeout_ms });
    } else if (value.structuredContent?.evidence_id || value.evidence_id) {
      const record = parseEvidence(value.structuredContent ?? value);
      if (value.structuredContent) {
        const text = value.content.filter((content) => content.type === "text").map((content) => content.text).join("");
        assert.deepEqual(JSON.parse(text), record);
      }
      raw.push({ path: relative, evidence_id: record.evidence_id });
    }
  }
}
assert.equal(standalone.length, 144);
assert.equal(new Set(standalone.map((record) => record.evidence_id)).size, 138);
assert.equal(raw.length, 144);
assert.equal(bundles.length, 4);
assert.equal(bundles.reduce((count, bundle) => count + bundle.records, 0), 138);
assert.equal(errors.length, 1);
assert.equal(errors[0].code, "provider_timeout");
assert.equal(errors[0].timeout_ms, 330000);
const proofRuns = index.runs.filter((run) => run.name !== "first-attempt");
const outcomes = [];
for (const run of index.runs) {
  const summary = await json(run.summary);
  assert.equal(summary.process_lineage.status, "verified");
  assert.deepEqual(summary.process_lineage.descendants, []);
  assert.equal(summary.target_executed, false);
  const start = await json(run.summary.replace("summary.json", "run-start.json"));
  const expectedSource = run.name === "first-attempt"
    ? "29bb18eb23075e37514303ef6c4718ea440d7ee7aa05820fcf628f1d79d0d8d2"
    : "26bd8cb5419e36e31ab1ef6e4d71b72a15d6b701a80c9b34218fc374019e4039";
  assert.equal(start.producer.sha256, expectedSource);
  if (run.name !== "first-attempt") outcomes.push(...summary.results);
}
assert.equal(outcomes.length, 67);
assert.equal(new Set(outcomes.map((result) => result.label)).size, 67);
assert.equal(outcomes.filter((result) => result.positive).length, 7);
assert.equal(outcomes.filter((result) => !result.positive).length, 60);
assert.equal(outcomes.filter((result) => result.cli_parity).length, 5);
for (const source of index.source_identities)
  assert.equal(hash(await read(source.retained_path)), source.sha256);
const combined = await json("retained/checks/combined-native-verification-2026-11-15.json");
assert.equal(combined.distinct_cases, outcomes.length);
assert.equal(combined.cli_mcp_comparisons, 5);
const audit = {
  status: "passed", checked_at: new Date().toISOString(),
  authority: "Read-only canonical Evidence authentication and retained-text identity checks; not a provider rerun",
  source_commit: runtimeManifest.source_commit,
  producer_sha256: combined.producer_sha256,
  validator_runtime: ".cache/arc-runtime-5628ef81", validator_files_authenticated: validators.length,
  completed_proof: { distinct_cases: 67, positives: 7, rejections: 60, cli_mcp_comparisons: 5, runs_with_verified_empty_lineage: proofRuns.length },
  canonical_coverage: { standalone_records: standalone.length, unique_evidence_ids: 138, authenticated_raw_evidence: raw.length, bundles: bundles.length, bundle_records: 138 },
  failed_prefix: { retained: true, completed_cases: 7, failed_case: "projection_unknown_field_flags", timeout_ms: 330000, resumed_cases: 37, all_green_prefix: false },
  prior_native_attempt: { retained: true, completed_cases: 1, failed_case: "probe-got", cause: "Ghidra DEFAULT Function thunk representation rejected by the original imported-label gate", contributes_to_final_67: false },
  bundle_origin: "Offline canonical assembly from captured public replies; no public export_evidence_bundle call is claimed",
  errors, standalone, bundles,
};
await save("evidence-audit.json", audit);

const selected = ["retain-evidence.mjs", "audit-evidence.mjs", "retention-index.json", "evidence-audit.json"];
for await (const file of files(path.join(directory, "retained"))) selected.push(path.relative(directory, file));
const report = path.resolve(directory, "../darwin-probe-profile-2026-11-14.md");
selected.push(path.relative(directory, report));
const manifest = [];
for (const relative of selected.sort()) {
  const bytes = await read(relative);
  new TextDecoder("utf-8", { fatal: true }).decode(bytes);
  manifest.push({ path: path.relative(path.dirname(directory), path.join(directory, relative)), bytes: bytes.length, sha256: hash(bytes) });
}
await save("text-manifest.json", {
  status: "passed", base_directory: "field-tests", source_commit: runtimeManifest.source_commit,
  scope: "Retained immutable v8 text package, audit scripts/index/result and sibling report; excludes this self-referential manifest and mutable top-level/root-owned logs",
  file_count: manifest.length, total_bytes: manifest.reduce((count, file) => count + file.bytes, 0), files: manifest,
});
console.log(JSON.stringify({ status: audit.status, completed_proof: audit.completed_proof, canonical_coverage: audit.canonical_coverage, manifest_files: manifest.length, manifest_bytes: manifest.reduce((count, file) => count + file.bytes, 0) }));
