import { createRequire } from "node:module";
import { fileURLToPath, pathToFileURL } from "node:url";
import { spawn } from "node:child_process";
import fs from "node:fs/promises";
import path from "node:path";
import assert from "node:assert/strict";

const root = path.dirname(fileURLToPath(import.meta.url));
const plan = JSON.parse(await fs.readFile(path.join(root, "plan.json"), "utf8"));
const manifest = JSON.parse(await fs.readFile(plan.runtime_manifest, "utf8"));
const runtime = manifest.runtime_root;
const req = createRequire(path.join(runtime, "package.json"));
const { createVerifierRun, completeVerifierRun } = await import(pathToFileURL(path.join(runtime, "scripts/lib/verifier-run.mjs")));
const { parseEvidence } = await import(pathToFileURL(path.join(runtime, "dist/domain/evidence.js")));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(runtime, "dist/domain/evidenceBundle.js")));
const { inspectAnalysisView } = await import(pathToFileURL(path.join(runtime, "dist/application/analysisView/AnalysisViewService.js")));
const { Ajv2020 } = await import(pathToFileURL(req.resolve("ajv/dist/2020.js")));
const run = createVerifierRun();
const out = path.join(root, "cli");
await fs.mkdir(out);
const bundlePath = path.join(out, "function.bundle.json");
const arguments_ = [path.join(runtime, "scripts/rea.mjs"), "function", plan.steps[0].arguments.path,
  "0x1012a571c", "--provider", "ghidra", "--detail", "summary", "--evidence-output", bundlePath, "--json"];
let stdout = "", stderr = "", result, failure;
const started = Date.now();
try {
  const child = spawn(process.execPath, arguments_, {
    cwd: runtime,
    env: { PATH: process.env.PATH, HOME: process.env.HOME, REA_LOG_LEVEL: "silent", REA_PROCESS_RUN_ID: run.run_id, ...plan.environment },
    stdio: ["ignore", "pipe", "pipe"],
  });
  child.stdout.on("data", chunk => { stdout += chunk; });
  child.stderr.on("data", chunk => { stderr += chunk; });
  const status = await new Promise((resolve, reject) => { child.once("error", reject); child.once("close", (code, signal) => resolve({ code, signal })); });
  await fs.writeFile(path.join(out, "stdout.json"), stdout);
  await fs.writeFile(path.join(out, "stderr.log"), stderr);
  assert.equal(status.code, 0, stderr.slice(-2000));
  const summary = parseEvidence(JSON.parse(stdout));
  const bundle = parseEvidenceBundle(JSON.parse(await fs.readFile(bundlePath, "utf8")));
  assert.equal(bundle.records.length, 1);
  const parent = bundle.records[0];
  assert.equal(parent.operation, "analyze_function");
  assert.equal(summary.normalized_result.parent_evidence_id, parent.evidence_id);
  assert.ok(!Object.hasOwn(parent.parameters, "detail"));
  const projected = inspectAnalysisView({ source: { kind: "inline", evidence: parent }, view: { kind: "summary" } });
  if (!projected.ok) throw projected.error;
  assert.deepEqual(projected.value, summary);
  const catalog = JSON.parse(await fs.readFile(path.join(root, "mcp/catalog.json"), "utf8"));
  const schema = catalog.find(t => t.name === "analyze_function").outputSchema;
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  assert.ok(ajv.validate(schema, summary), JSON.stringify(ajv.errors));
  assert.equal(parent.normalized_result.procedure.body.total_bytes, 10072);
  assert.equal(parent.normalized_result.native_api.jump_tables[0].mappings.length, 28);
  result = { status: "passed", arguments: arguments_, elapsed_ms: Date.now() - started,
    parent_evidence_id: parent.evidence_id, summary_evidence_id: summary.evidence_id,
    stdout_bytes: Buffer.byteLength(stdout), portable_records: bundle.records.length,
    shared_projection_equal: true, native_body_bytes: 10072, native_mappings: 28 };
} catch (cause) {
  failure = cause;
  result = { status: "failed", elapsed_ms: Date.now() - started, error: { name: cause.name, message: cause.message } };
} finally {
  result.verifier_run = await completeVerifierRun(run);
  await fs.writeFile(path.join(out, "verification.json"), JSON.stringify(result, null, 2) + "\n");
}
console.log(JSON.stringify(result));
if (failure) process.exitCode = 1;
