import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { createHash } from "node:crypto";
import { mkdir, mkdtemp, readFile, rm, writeFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { parseArgs, promisify } from "node:util";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { toolContract } from "../dist/contracts/toolContracts.js";
import { createVerifierRun, completeVerifierRun } from "./lib/verifier-run.mjs";

const { values } = parseArgs({ options: { "output-dir": { type: "string" } } });
assert(
  process.platform === "darwin" && process.arch === "arm64",
  "This owned compiler-shape lane requires macOS arm64",
);
assert(
  process.env.GHIDRA_INSTALL_DIR && process.env.JAVA_HOME,
  "Set the installed Ghidra and JDK paths; this verifier installs nothing",
);
const root = await mkdtemp(join(tmpdir(), "rea-swift-errors-"));
const output = values["output-dir"]
  ? resolve(values["output-dir"])
  : join(root, "receipts");
await mkdir(output);
const exec = promisify(execFile);
const run = createVerifierRun();
const source = fileURLToPath(
  new URL("../tests/conformance/ghidra/swift-errors.swift", import.meta.url),
);
const bridge = fileURLToPath(new URL("../bridge/ghidra", import.meta.url));
const probes = fileURLToPath(
  new URL("../tests/conformance/ghidra", import.meta.url),
);
const cli = fileURLToPath(new URL("./rea.mjs", import.meta.url));
const binary = join(root, "OwnedErrorABI.dylib");
const digest = (bytes) => createHash("sha256").update(bytes).digest("hex");
const save = (name, value) =>
  writeFile(join(output, name), JSON.stringify(value, null, 2) + "\n");
const environment = {
  PATH: process.env.PATH ?? "/usr/bin:/bin",
  JAVA_HOME: process.env.JAVA_HOME,
  GHIDRA_INSTALL_DIR: process.env.GHIDRA_INSTALL_DIR,
  REA_GHIDRA_STARTUP_TIMEOUT_MS: "330000",
  REA_LOG_LEVEL: "silent",
  REA_PROCESS_RUN_ID: run.run_id,
};
const commands = [];
async function command(program, args, label) {
  const result = await exec(program, args, {
    env: environment,
    timeout: 240000,
    maxBuffer: 16 * 1024 * 1024,
  });
  commands.push({ program, args, exit_code: 0 });
  await writeFile(join(output, label + ".log"), result.stdout + result.stderr);
  return result.stdout;
}
const client = new Client({ name: "swift-errors-verifier", version: "1" });
const transport = new StdioClientTransport({
  command: process.execPath,
  args: [cli, "mcp"],
  env: environment,
  stderr: "pipe",
});
let stderr = "";
transport.stderr?.on("data", (bytes) => {
  stderr += bytes.toString();
});
try {
  const compiler = await command("/usr/bin/swiftc", ["--version"], "compiler");
  await command(
    "/usr/bin/swiftc",
    [
      "-O",
      "-emit-library",
      "-module-name",
      "OwnedErrorABI",
      "-module-cache-path",
      join(root, "module-cache"),
      source,
      "-o",
      binary,
    ],
    "compile",
  );
  const original = await readFile(binary);
  const nm = await command("/usr/bin/nm", [binary], "symbols");
  const symbols = nm
    .split("\n")
    .map((line) => line.trim().split(/\s+/u))
    .filter((parts) => parts.length === 3);
  const witness = symbols.find(
    (parts) => parts[2].includes("SeAASe4from") && parts[2].endsWith("TW"),
  );
  assert(witness, "The compiler did not emit the owned Decodable witness");
  const address = "0x" + BigInt("0x" + witness[0]).toString(16);
  for (const [label, name] of [
    ["nonthrowing", "ownedNonthrowing"],
    ["callback", "ownedThrowingCallback"],
    ["context", "ownedMethodForThrowing"],
    ["async", "ownedAsyncThrowing"],
  ]) {
    const symbol = symbols.find(
      (parts) => parts[1].toLowerCase() === "t" && parts[2].includes(name),
    );
    assert(symbol, `Missing ${name}`);
    const expanded = await command(
      "/usr/bin/swift",
      ["demangle", "--compact", "--expand", "--", symbol[2]],
      label + "-demangle",
    );
    await writeFile(join(output, label + ".expanded.txt"), expanded);
  }
  const reports = [];
  for (const mode of ["positive", "override", "user-signature"]) {
    await command(
      join(environment.GHIDRA_INSTALL_DIR, "support/analyzeHeadless"),
      [
        root,
        mode + "-project",
        "-import",
        binary,
        "-scriptPath",
        bridge + ";" + probes,
        "-postScript",
        "ReaSwiftErrorProbe.java",
        bridge,
        address,
        mode,
        output,
        "-deleteProject",
      ],
      mode + "-ghidra",
    );
    const report = JSON.parse(
      await readFile(join(output, mode + ".probe.json"), "utf8"),
    );
    assert.equal(report.status, "passed"); // Headless Ghidra can exit zero after script failures.
    reports.push({ mode, ...report });
  }
  await client.connect(transport);
  const catalog = (await client.listTools()).tools;
  await save("catalog.json", catalog);
  const calls = [];
  async function call(name, args, label) {
    const advertised = catalog.find((tool) => tool.name === name);
    assert(advertised?.outputSchema);
    const ajv = new Ajv2020({ strict: false, validateFormats: false });
    assert(ajv.validateSchema(advertised.inputSchema));
    assert(ajv.validate(advertised.inputSchema, args));
    const reply = await client.callTool(
      { name, arguments: args },
      { timeout: 390000 },
    );
    await save(label + ".reply.json", reply);
    assert(!reply.isError, JSON.stringify(reply));
    assert(ajv.validateSchema(advertised.outputSchema));
    assert(
      ajv.validate(advertised.outputSchema, reply.structuredContent),
      JSON.stringify(ajv.errors),
    );
    const value = toolContract(name).outputSchema.parse(
      reply.structuredContent,
    );
    assert.deepEqual(
      JSON.parse(reply.content.find((block) => block.type === "text").text),
      value,
    );
    calls.push({ name, args, evidence_id: value.evidence_id ?? null });
    await save("invocations.json", calls);
    return value;
  }
  await call("open_binary", { path: binary, provider_id: "ghidra" }, "open");
  const evidence = await call(
    "analyze_function",
    { procedure: address },
    "owned-witness",
  );
  const dossier = evidence.normalized_result;
  assert(
    dossier.native_api.call_model_adjustments.some((item) =>
      item.original_symbol.includes("6decode_6forKey"),
    ),
  );
  assert(
    dossier.native_value_flow.operations.some(
      (item) => item.opcode === "CBRANCH",
    ),
  );
  assert(!dossier.pseudocode.includes("Removing unreachable block"));
  const cleanupSymbol = symbols.find(
    (parts) =>
      parts[1].toLowerCase() === "t" &&
      parts[2].includes("ownedDecodeWithCleanup"),
  );
  assert(cleanupSymbol);
  const cleanupAddress = "0x" + BigInt("0x" + cleanupSymbol[0]).toString(16);
  const cleanupEvidence = await call(
    "analyze_function",
    { procedure: cleanupAddress },
    "owned-cleanup",
  );
  assert(
    cleanupEvidence.normalized_result.native_api.call_model_adjustments.some(
      (item) => item.original_symbol.includes("JSONDecoderC6decode_4from"),
    ),
  );
  assert(
    !cleanupEvidence.normalized_result.pseudocode.includes(
      "Removing unreachable block",
    ),
  );
  await call(
    "export_evidence_bundle",
    { path: join(output, "evidence-bundle.json") },
    "export",
  );
  await call("close_binary", {}, "close");
  const text = await command(
    process.execPath,
    [cli, "function", binary, address, "--provider", "ghidra", "--json"],
    "cli-witness",
  );
  const cliEvidence = toolContract("analyze_function").outputSchema.parse(
    JSON.parse(text),
  );
  assert.deepEqual(
    cliEvidence,
    evidence,
    "Complete owned CLI/MCP Evidence differs",
  );
  assert.equal(digest(await readFile(binary)), digest(original));
  await save("verification.json", {
    status: "passed",
    compiler,
    source_sha256: digest(await readFile(source)),
    binary_sha256: digest(original),
    witness_address: address,
    target_executed: false,
    probes: reports,
    cli_mcp_exact_evidence: true,
    commands,
  });
} finally {
  await client.close();
  await transport.close();
  await writeFile(join(output, "stderr.log"), stderr);
  await save("cleanup.json", await completeVerifierRun(run));
  if (values["output-dir"]) await rm(root, { recursive: true, force: true });
}
console.log(JSON.stringify({ status: "passed", output }));
