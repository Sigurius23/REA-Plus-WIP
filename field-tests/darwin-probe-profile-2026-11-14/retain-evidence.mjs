import assert from "node:assert/strict";
import { createHash } from "node:crypto";
import fs from "node:fs/promises";
import path from "node:path";
import { fileURLToPath, pathToFileURL } from "node:url";

const directory = path.dirname(fileURLToPath(import.meta.url));
const repository = path.resolve(directory, "../../rea-local");
const runtime = path.join(repository, ".cache/arc-runtime-5628ef81");
const cache = path.join(repository, ".cache/darwin-stack-probe-increment-2026-11-14");
const retained = path.join(directory, "retained");
const hash = (bytes) => createHash("sha256").update(bytes).digest("hex");
const json = async (file) => JSON.parse(await fs.readFile(file, "utf8"));
const write = async (relative, bytes) => {
  const destination = path.join(directory, relative);
  await fs.mkdir(path.dirname(destination), { recursive: true });
  try {
    assert.equal(hash(await fs.readFile(destination)), hash(bytes), `Retained file changed: ${relative}`);
  } catch (error) {
    if (error.code !== "ENOENT") throw error;
    await fs.writeFile(destination, bytes, { flag: "wx" });
  }
};
const save = (relative, value) => write(relative, Buffer.from(JSON.stringify(value, null, 2) + "\n"));
const copy = async (source, relative) => write(relative, await fs.readFile(source));
const runtimeManifestPath = path.resolve(directory, "../arc-selector-v8-2026-11-15/runtime-manifest.json");
const runtimeManifest = await json(runtimeManifestPath);
assert.equal(runtimeManifest.source_commit, "5628ef81ce5144c9af3bdc11b1e3647a9035c368");
for (const file of runtimeManifest.files.filter((file) => file.path.startsWith("dist/domain/") && file.path.endsWith(".js")))
  assert.equal(hash(await fs.readFile(path.join(runtime, file.path))), file.sha256);
await copy(runtimeManifestPath, "retained/sources/v8-runtime-manifest.json");
const evidenceApi = await import(pathToFileURL(path.join(runtime, "dist/domain/evidence.js")));
const bundleApi = await import(pathToFileURL(path.join(runtime, "dist/domain/evidenceBundle.js")));
const freeze = await json(path.join(directory, "source-freeze-second.json"));
const sourceIdentities = [];
for (const identity of freeze.sources) {
  // Baseline selection is the only post-focused verifier change.
  const source = await fs.readFile(path.join(retained, "sources/focused", identity.path));
  assert.equal(hash(source), identity.sha256, `Focused source identity changed: ${identity.path}`);
  await write(`retained/sources/focused/${identity.path}`, source);
  sourceIdentities.push({ ...identity, retained_path: `retained/sources/focused/${identity.path}` });
}
const baselineVerifier = await fs.readFile(path.join(retained, "sources/baseline/verify-real-ghidra-swift-enum.mjs"));
const baselineIdentity = await json(path.join(directory, "verifier-baseline-identity.json"));
assert.equal(hash(baselineVerifier), baselineIdentity.sha256);
await write("retained/sources/baseline/verify-real-ghidra-swift-enum.mjs", baselineVerifier);
const resumedVerifier = await fs.readFile(path.join(runtime, "scripts/verify-real-ghidra-swift-enum.mjs"));
const resumedStart = await json(path.join(cache, "native-baseline-resumed-2026-11-15/run-start.json"));
assert.equal(hash(resumedVerifier), resumedStart.verifier.sha256);
await write("retained/sources/baseline-resumed/verify-real-ghidra-swift-enum.mjs", resumedVerifier);
assert.equal(hash(await fs.readFile(path.join(runtime, "bridge/ghidra/ReaGhidraSwiftEnumSwitches.java"))), freeze.sources[0].sha256);

// Reconstruct only the observed first-attempt gate, then verify its recorded
// source hash. No executable is reconstructed or copied.
const javaPath = "bridge/ghidra/ReaGhidraSwiftEnumSwitches.java";
const finalJava = await fs.readFile(path.join(retained, "sources/focused", javaPath), "utf8");
const firstGate = `    private boolean probePlaceholder(Address target) {
        if (uniqueProbeImport==null) return false;
        if (probeImports.containsKey(target)) return true;
        MemoryBlock block=program.getMemory().getBlock(target);
        if (block==null) return false;
        if (block.getName().equals("EXTERNAL") && (block.getFlags()&MemoryBlock.ARTIFICIAL)!=0) {
            Symbol[] symbols=program.getSymbolTable().getSymbols(target);
            return symbols.length==1 && symbols[0].getSource()==SourceType.IMPORTED &&
                symbols[0].getName().equals("___chkstk_darwin");
        }
        if (!block.getName().endsWith("__stubs")) return false;
        Function function=program.getFunctionManager().getFunctionAt(target);
        Function external=function==null || !function.isThunk()?null:function.getThunkedFunction(true);
        return external!=null && probeImports.containsKey(external.getEntryPoint());
    }

`;
const start = finalJava.indexOf("    private boolean probePlaceholder(Address target) {");
const end = finalJava.indexOf("    private ProbeTarget probeSlot(Address slot)", start);
assert.ok(start >= 0 && end > start);
const firstJava = Buffer.from(finalJava.slice(0, start) + firstGate + finalJava.slice(end));
const firstFreeze = await json(path.join(directory, "source-freeze.json"));
assert.equal(hash(firstJava), firstFreeze.sources.find((source) => source.path === javaPath).sha256);
await write(`retained/sources/first-attempt/${javaPath}`, firstJava);

const catalogCopies = new Map();
const runIndex = [];
for (const [name, cacheName] of [["first-attempt", "native-first"], ["focused", "native-second"], ["baseline-prefix", "native-baseline"], ["baseline-resumed", "native-baseline-resumed-2026-11-15"]]) {
  const sourceRoot = path.join(cache, cacheName);
  const summary = await json(path.join(sourceRoot, "summary.json"));
  assert.equal(summary.process_lineage.status, "verified");
  assert.deepEqual(summary.process_lineage.descendants, []);
  assert.equal(summary.target_executed, false);
  assert.equal(summary.ok, ["focused", "baseline-resumed"].includes(name));
  if (name === "focused") assert.equal(summary.results.length, 23);
  if (name === "baseline-prefix") assert.equal(summary.results.length, 7);
  if (name === "baseline-resumed") assert.equal(summary.results.length, 37);
  for (const file of ["summary.json", "run-start.json", "invocations.json"])
    await copy(path.join(sourceRoot, file), `retained/runs/${name}/${file}`);
  const recordsById = new Map();
  const cases = [];
  const labels = [...new Set(summary.records.map((record) => record.label))];
  for (const label of labels) {
    const sourceCase = path.join(sourceRoot, label);
    const prefix = `retained/runs/${name}/${label}`;
    const result = summary.results.find((result) => result.label === label);
    let oracle;
    for (const file of ["oracle.json", "switch.swift", "switch.s", "stderr.txt"]) {
      try {
        await copy(path.join(sourceCase, file), `${prefix}/${file}`);
        if (file === "oracle.json") oracle = await json(path.join(sourceCase, file));
      } catch (error) { if (error.code !== "ENOENT") throw error; }
    }
    const catalog = await fs.readFile(path.join(sourceCase, "catalog.json"));
    const catalogHash = hash(catalog);
    const catalogPath = `retained/catalogs/${catalogHash}.json`;
    if (!catalogCopies.has(catalogHash)) {
      await write(catalogPath, catalog);
      catalogCopies.set(catalogHash, catalogPath);
    }
    const captured = [];
    for (const invocation of summary.records.filter((record) => record.label === label)) {
      const filename = path.basename(invocation.reply.path);
      const bytes = await fs.readFile(path.join(sourceCase, filename));
      assert.equal(hash(bytes), invocation.reply.sha256);
      assert.equal(bytes.length, invocation.reply.bytes);
      await write(`${prefix}/raw/${filename}`, bytes);
      const reply = JSON.parse(bytes);
      if (!["procedure_info", "analyze_function"].includes(invocation.name)) continue;
      if (reply.isError === true) continue; // The preserved timeout has no successful Evidence.
      const record = evidenceApi.parseEvidence(reply.structuredContent);
      const text = reply.content.filter((content) => content.type === "text").map((content) => content.text).join("");
      assert.deepEqual(JSON.parse(text), record);
      assert.equal(record.subject.digest.sha256, oracle?.binary.sha256 ?? result?.target.sha256);
      assert.equal(record.analysis_profile.parameters.swift_enum_switch_recovery, "abi-signed-word-cfg-v8");
      assert.equal(record.analysis_profile.parameters.darwin_stack_probe_call_summary, "trusted-darwin-arm64-chkstk-v1");
      const evidencePath = `${prefix}/${invocation.name}.evidence.json`;
      await save(evidencePath, record);
      recordsById.set(record.evidence_id, record);
      captured.push({ operation: invocation.name, evidence_id: record.evidence_id, path: evidencePath });
    }
    const cli = path.join(sourceCase, "cli.json");
    try {
      const bytes = await fs.readFile(cli);
      const record = evidenceApi.parseEvidence(JSON.parse(bytes));
      assert.equal(record.evidence_id, captured.find((item) => item.operation === "analyze_function").evidence_id);
      await write(`${prefix}/raw/cli.json`, bytes);
      await save(`${prefix}/cli.evidence.json`, record);
      captured.push({ operation: "cli-function", evidence_id: record.evidence_id, path: `${prefix}/cli.evidence.json` });
    } catch (error) { if (error.code !== "ENOENT") throw error; }
    cases.push({ label, completed: result !== undefined, oracle: oracle === undefined ? null : `${prefix}/oracle.json`, binary_identity: oracle?.binary ?? result?.target ?? null, catalog: { sha256: catalogHash, path: catalogPath }, evidence: captured });
  }
  // Offline authenticated bundle assembly from already captured public replies;
  // this is not a claim that export_evidence_bundle was invoked in these runs.
  const bundle = bundleApi.createEvidenceBundle([...recordsById.values()]);
  bundleApi.parseEvidenceBundle(bundle);
  const bundlePath = `retained/runs/${name}/captured-records.bundle.json`;
  await write(bundlePath, Buffer.from(bundleApi.serializeEvidenceBundle(bundle)));
  runIndex.push({ name, summary: `retained/runs/${name}/summary.json`, passed: summary.results.length, completed_cases: cases.length, unique_records: recordsById.size, bundle: bundlePath, bundle_origin: "offline canonical assembly of captured public Evidence; not a public bundle-export call", cases });
}
for (const file of ["build.log", "compiler-chained-final.log", "javac.log", "javac-second.log", "source-tests.log", "typecheck.log", "lint.log", "format.log", "source-freeze.json", "source-freeze-second.json", "verifier-focused-identity.json", "verifier-baseline-identity.json", "combined-native-verification-2026-11-15.json", "check-fast-final-2026-11-15.log", "docs-check-built-final-2026-11-15.log", "package-verification-2026-11-15.log"])
  await copy(path.join(directory, file), `retained/checks/${file}`);
for (const [source, destination] of [["native-first.log", "first-attempt.log"], ["native-second.log", "focused.log"], ["native-baseline.log", "baseline-prefix.log"], ["native-baseline-resumed-2026-11-15.log", "baseline-resumed.log"], ["loaded-got-diagnostic.log", "loaded-got-diagnostic-setup-failure.log"], ["loaded-got-diagnostic-second.log", "loaded-got-diagnostic.log"]])
  await copy(path.join(directory, source), `retained/diagnostics/${destination}`);
for (const file of ["debug-probe.mjs", "diagnostic/ProbeBindingDebug.java", "diagnostic-result.json"])
  await copy(path.join(cache, file), `retained/diagnostics/${file}`);
await fs.writeFile(path.join(directory, "retention-index.json"), JSON.stringify({ authority: "Text-only retention of completed static owned-fixture workflows; source and Evidence copies only", source_commit: runtimeManifest.source_commit, excluded: ["executable binaries", "compiled modules/classes", "module caches", "Ghidra projects", "mutable working production sources"], source_identities: sourceIdentities, catalogs_deduplicated_by_sha256: catalogCopies.size, runs: runIndex }, null, 2) + "\n");
console.log(JSON.stringify({ status: "retained", runs: runIndex.map(({name, passed, unique_records}) => ({name, passed, unique_records})), catalogs: catalogCopies.size }));
