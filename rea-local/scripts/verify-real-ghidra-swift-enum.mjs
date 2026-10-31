#!/usr/bin/env node
import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { createHash } from "node:crypto";
import { mkdir, mkdtemp, readFile, writeFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { parseArgs, promisify } from "node:util";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { toolContract } from "../dist/contracts/toolContracts.js";
import { createVerifierRun, completeVerifierRun } from "./lib/verifier-run.mjs";
import {
  swiftEnumOracle,
  swiftEnumNegativeCopies,
} from "../tests/conformance/ghidra/swift-enum-oracle.mjs";

const { values } = parseArgs({
  options: {
    "output-dir": { type: "string" },
    "compiler-oracle-only": { type: "boolean", default: false },
  },
});
assert.ok(
  process.platform === "darwin" && process.arch === "arm64",
  "This compiler-shape lane requires macOS arm64 and the installed Swift compiler",
);
if (!values["compiler-oracle-only"])
  assert.ok(
    process.env.GHIDRA_INSTALL_DIR && process.env.JAVA_HOME,
    "Set installed Ghidra/JDK paths; this lane installs nothing",
  );
const root = values["output-dir"]
  ? resolve(values["output-dir"])
  : await mkdtemp(join(tmpdir(), "rea-swift-enum-proof-"));
if (values["output-dir"]) await mkdir(root); // Never overwrite earlier evidence.
const run = createVerifierRun();
const exec = promisify(execFile);
const digest = (bytes) => createHash("sha256").update(bytes).digest("hex");
const save = async (path, value) =>
  writeFile(path, JSON.stringify(value, null, 2) + "\n");
const identity = async (path) => {
  const bytes = await readFile(path);
  return { path, bytes: bytes.length, sha256: digest(bytes) };
};
const cli = fileURLToPath(new URL("./rea.mjs", import.meta.url));
const fixture = (name) =>
  fileURLToPath(
    new URL(`../tests/conformance/ghidra/${name}`, import.meta.url),
  );
const env = {
  PATH: process.env.PATH ?? "/usr/bin:/bin",
  JAVA_HOME: process.env.JAVA_HOME,
  GHIDRA_INSTALL_DIR: process.env.GHIDRA_INSTALL_DIR,
  REA_ANALYSIS_PROVIDER: "ghidra",
  REA_LOG_LEVEL: "silent",
  REA_GHIDRA_STARTUP_TIMEOUT_MS: "330000",
  REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS: "60",
  REA_PROCESS_RUN_ID: run.run_id,
};
const records = [];
const commands = [];
const results = [];
const compiler = (await exec("/usr/bin/swiftc", ["--version"])).stdout;
await save(join(root, "run-start.json"), {
  run,
  compiler,
  target_executed: false,
});

async function compile(payloads, empty, label) {
  const directory = join(root, label);
  await mkdir(directory);
  let text = await readFile(fixture("swift-enum-switch.swift"), "utf8");
  text = text
    .replace(/^    case payload(\d+)\(ReaPayload\)\n/gm, (line, index) =>
      Number(index) < payloads ? line : "",
    )
    .replace(/^    case empty(\d+)\n/gm, (line, index) =>
      Number(index) < empty ? line : "",
    )
    .replace(
      /^    case \.payload(\d+): return reaCase\d+\(value\)\n/gm,
      (line, index) => (Number(index) < payloads ? line : ""),
    )
    .replace(
      /^    case \.empty(\d+): return reaCase\d+\(value\)\n/gm,
      (_, index) =>
        Number(index) < empty
          ? `    case .empty${index}: return reaCase${payloads + Number(index)}(value)\n`
          : "",
    );
  const source = join(directory, "switch.swift");
  await writeFile(source, text);
  const module = join(directory, "ReaResilientPayload.swiftmodule");
  const library = join(directory, "libReaResilientPayload.dylib");
  const path = join(directory, "libReaSwiftRelativeSwitch.dylib");
  const common = [
    "-module-cache-path",
    join(root, "module-cache"),
    "-parse-as-library",
  ];
  for (const args of [
    [
      ...common,
      "-enable-library-evolution",
      "-module-name",
      "ReaResilientPayload",
      "-emit-module",
      "-emit-module-path",
      module,
      "-emit-library",
      "-o",
      library,
      fixture("swift-enum-payload.swift"),
    ],
    [
      ...common,
      "-I",
      directory,
      "-L",
      directory,
      "-lReaResilientPayload",
      "-Onone",
      "-module-name",
      "ReaSwiftRelativeSwitch",
      "-emit-library",
      "-Xlinker",
      "-undefined",
      "-Xlinker",
      "dynamic_lookup",
      "-o",
      path,
      source,
    ],
  ]) {
    const reply = await exec("/usr/bin/swiftc", args, {
      maxBuffer: 8 * 1024 * 1024,
    });
    commands.push({
      command: "/usr/bin/swiftc",
      args,
      stdout: reply.stdout,
      stderr: reply.stderr,
      exit_code: 0,
    });
  }
  const bytes = await readFile(path);
  const oracle = swiftEnumOracle(bytes, payloads, empty);
  await save(join(directory, "oracle.json"), {
    target_executed: false,
    source: await identity(source),
    binary: await identity(path),
    payloads,
    empty,
    oracle,
  });
  return { path, bytes, oracle, label, directory };
}

function check(result, oracle, positive) {
  const tables = result.native_api.jump_tables.filter((table) =>
    table.data_sources.some(
      (source) => source.provenance === "rea-swift-enum-signed-word-table",
    ),
  );
  if (!positive) {
    assert.deepEqual(
      tables,
      [],
      "An unsupported/corrupt shape acquired a Swift ABI bound",
    );
    return;
  }
  assert.equal(tables.length, 1);
  const table = tables[0];
  assert.equal(table.dispatch_address, `0x${oracle.dispatch.toString(16)}`);
  assert.deepEqual(
    table.mappings.map(({ case_value, target_address }) => ({
      case_value,
      target_address,
    })),
    oracle.mappings.map(({ case_value, target_address }) => ({
      case_value,
      target_address,
    })),
  );
  assert.deepEqual(table.default_targets, []);
  assert.equal(table.data_sources[0].entry_size_bytes, 4);
  assert.equal(table.data_sources[0].entry_count, oracle.mappings.length);
  for (const item of oracle.mappings) {
    assert.ok(
      result.procedure.body.ranges.some(
        ({ start, end }) =>
          BigInt(start) <= BigInt(item.target_address) &&
          BigInt(end) >= BigInt(item.target_address),
      ),
      "Case omitted from owning body",
    );
    assert.ok(
      result.pseudocode.includes(`_rea_case_${item.case_value}(`),
      "Case callee omitted from pseudocode",
    );
  }
  assert.ok(!result.pseudocode.includes("Could not recover jumptable"));
  assert.ok(
    table.mappings.every(
      ({ confidence, evidence }) =>
        confidence === "high" &&
        evidence.some(
          ({ source, detail }) =>
            source === "rea-swift-abi-instruction-and-memory" &&
            detail.includes("descriptor") &&
            detail.includes("unchanged tag"),
        ),
    ),
  );
}

async function inspect(target, positive, cliParity = false) {
  const { path, oracle, directory, label } = target;
  const before = digest(await readFile(path));
  const transport = new StdioClientTransport({
    command: process.execPath,
    args: [cli, "mcp"],
    env,
    stderr: "pipe",
  });
  const client = new Client({
    name: "swift-enum-switch-verifier",
    version: "1",
  });
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  let catalog, evidence, info;
  let stderr = "";
  transport.stderr?.on("data", (chunk) => {
    stderr += chunk
      .toString()
      .slice(0, Math.max(0, 1024 * 1024 - stderr.length));
  });
  const call = async (name, args = {}) => {
    const advertised = catalog.find((item) => item.name === name);
    assert.ok(advertised);
    assert.equal(ajv.validateSchema(advertised.inputSchema), true);
    assert.equal(
      ajv.validate(advertised.inputSchema, args),
      true,
      JSON.stringify(ajv.errors),
    );
    const started = Date.now();
    const reply = await client.callTool(
      { name, arguments: args },
      { timeout: 390000 },
    );
    const output = join(directory, `${records.length}-${name}.json`);
    await save(output, reply);
    records.push({
      label,
      name,
      args,
      duration_ms: Date.now() - started,
      reply: await identity(output),
      is_error: reply.isError === true,
    });
    await save(join(root, "invocations.json"), records);
    assert.notEqual(reply.isError, true, JSON.stringify(reply).slice(0, 4000));
    assert.equal(ajv.validateSchema(advertised.outputSchema), true);
    assert.equal(
      ajv.validate(advertised.outputSchema, reply.structuredContent),
      true,
      JSON.stringify(ajv.errors),
    );
    return toolContract(name).outputSchema.parse(reply.structuredContent);
  };
  try {
    await client.connect(transport);
    catalog = (await client.listTools()).tools;
    await save(join(directory, "catalog.json"), catalog);
    await call("open_binary", { path, provider_id: "ghidra" });
    // Observe the body before any decompiler query; repair must not be a lazy
    // side effect that changes the answer for the same observation parameters.
    info = await call("procedure_info", {
      procedure: `0x${oracle.entry.toString(16)}`,
    });
    evidence = await call("analyze_function", {
      procedure: `0x${oracle.entry.toString(16)}`,
    });
    assert.deepEqual(
      info.normalized_result.body,
      evidence.normalized_result.procedure.body,
    );
    check(evidence.normalized_result, oracle, positive);
    assert.equal(
      evidence.analysis_profile.parameters.swift_enum_switch_recovery,
      "abi-signed-word-cfg-v1",
    );
    assert.ok(
      evidence.limitations.some((text) =>
        text.includes("analysis_complete=true; analysis_timed_out=false"),
      ),
    );
  } finally {
    try {
      if (catalog) await call("close_binary");
    } finally {
      try {
        await client.close();
      } finally {
        await transport.close();
        await writeFile(join(directory, "stderr.txt"), stderr);
        assert.equal(
          digest(await readFile(path)),
          before,
          "Analysis modified fixture bytes",
        );
      }
    }
  }
  if (cliParity) {
    const reply = await exec(
      process.execPath,
      [
        cli,
        "function",
        path,
        `0x${oracle.entry.toString(16)}`,
        "--provider",
        "ghidra",
        "--json",
      ],
      { env, timeout: 390000, maxBuffer: 64 * 1024 * 1024 },
    );
    await writeFile(join(directory, "cli.json"), reply.stdout);
    const other = toolContract("analyze_function").outputSchema.parse(
      JSON.parse(reply.stdout),
    );
    check(other.normalized_result, oracle, true);
    assert.equal(
      other.evidence_id,
      evidence.evidence_id,
      "CLI/MCP Evidence identity drift",
    );
    assert.equal(digest(await readFile(path)), before);
  }
  results.push({
    label,
    positive,
    cli_parity: cliParity,
    target: await identity(path),
    evidence_id: evidence.evidence_id,
    body_bytes: evidence.normalized_result.procedure.body.total_bytes,
  });
  console.log(JSON.stringify(results.at(-1)));
}

let failure;
try {
  const large = await compile(18, 12, "thirty-cases");
  const small = await compile(8, 4, "twelve-cases");
  if (!values["compiler-oracle-only"]) {
    await inspect(large, true, true);
    await inspect(small, true);
    for (const [label, bytes] of Object.entries(
      swiftEnumNegativeCopies(large.bytes, large.oracle),
    )) {
      const directory = join(root, label);
      await mkdir(directory);
      const path = join(directory, "mutated.dylib");
      await writeFile(path, bytes);
      await inspect({ path, oracle: large.oracle, directory, label }, false);
    }
  }
} catch (error) {
  failure = error;
}
const lifecycle = await completeVerifierRun(run);
if (!values["compiler-oracle-only"] && !failure) {
  try {
    assert.equal(lifecycle.process_lineage.status, "verified");
    assert.deepEqual(lifecycle.process_lineage.descendants, []);
  } catch (error) {
    failure = error;
  }
}
await save(join(root, "summary.json"), {
  ok: !failure,
  compiler,
  commands,
  results,
  records,
  target_executed: false,
  process_lineage: lifecycle.process_lineage,
  error: failure ? String(failure.stack ?? failure) : null,
});
console.log(
  JSON.stringify({
    ok: !failure,
    root,
    results: results.length,
    process_lineage: lifecycle.process_lineage,
  }),
);
if (failure) throw failure;
