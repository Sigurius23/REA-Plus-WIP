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
import { parseEvidence } from "../dist/domain/evidence.js";
import { emulationMachOFunctions } from "../tests/conformance/native/function-emulation-oracle.mjs";
import { createVerifierRun, completeVerifierRun } from "./lib/verifier-run.mjs";
import {
  verifyEmulationLifecycle,
  verifyEmulationUnavailable,
} from "./verify/function-emulation-lifecycle.mjs";
import { analysisErrorProjectionSchema } from "../dist/contracts/errorSchemas.js";
import { systemProcessOwnershipHost } from "../dist/process/ProcessOwnershipObservation.js";
import { parseEvidenceBundle } from "../dist/domain/evidenceBundle.js";

const { values } = parseArgs({ options: { "output-dir": { type: "string" } } });
assert.equal(
  process.platform,
  "darwin",
  "This source-built compiler-oracle lane requires installed macOS clang; Linux host support needs its own real lane.",
);
assert.ok(
  process.env.REA_UNICORN_PYTHON?.startsWith("/"),
  "Set absolute REA_UNICORN_PYTHON; this lane installs nothing.",
);
const root = values["output-dir"]
  ? resolve(values["output-dir"])
  : await mkdtemp(join(tmpdir(), "rea-function-emulation-proof-"));
if (values["output-dir"]) await mkdir(root);
const run = createVerifierRun();
const exec = promisify(execFile);
const cli = fileURLToPath(new URL("./rea.mjs", import.meta.url));
const source = (name) =>
  fileURLToPath(
    new URL(
      `../tests/conformance/native/function-emulation.${name}`,
      import.meta.url,
    ),
  );
const digest = (bytes) => createHash("sha256").update(bytes).digest("hex");
const save = (path, value) =>
  writeFile(path, JSON.stringify(value, null, 2) + "\n");
const identity = async (path) => {
  const bytes = await readFile(path);
  return { path, bytes: bytes.length, sha256: digest(bytes) };
};
const environment = {
  PATH: process.env.PATH ?? "/usr/bin:/bin",
  REA_UNICORN_PYTHON: process.env.REA_UNICORN_PYTHON,
  REA_LOG_LEVEL: "silent",
  REA_PROCESS_RUN_ID: run.run_id,
  TMPDIR: join(root, "runtime"),
};
await mkdir(environment.TMPDIR, { mode: 0o700 });
const calls = [],
  results = [],
  commands = [];
const ajv = new Ajv2020({ strict: false, validateFormats: false });
const transport = new StdioClientTransport({
  command: process.execPath,
  args: [cli, "mcp"],
  env: environment,
  stderr: "pipe",
});
const client = new Client({
  name: "rea-function-emulation-conformance",
  version: "1",
});
let stderr = "",
  catalog;
transport.stderr?.on("data", (chunk) => {
  stderr += chunk.toString().slice(0, Math.max(0, 1_048_576 - stderr.length));
});
async function call(name, args, expectedError = false) {
  const advertised = catalog.find((tool) => tool.name === name);
  assert.ok(advertised);
  assert.equal(ajv.validateSchema(advertised.inputSchema), true);
  if (!expectedError)
    assert.equal(
      ajv.validate(advertised.inputSchema, args),
      true,
      JSON.stringify(ajv.errors),
    );
  const reply = await client.callTool(
    { name, arguments: args },
    { timeout: 60_000 },
  );
  const path = join(root, `reply-${calls.length}-${name}.json`);
  await save(path, reply);
  calls.push({
    name,
    args,
    reply: await identity(path),
    is_error: reply.isError === true,
  });
  await save(join(root, "invocations.json"), calls);
  assert.equal(
    reply.isError === true,
    expectedError,
    JSON.stringify(reply).slice(0, 5000),
  );
  if (expectedError) {
    const text = reply.content.find((item) => item.type === "text").text;
    if (text.startsWith("{"))
      analysisErrorProjectionSchema.parse(JSON.parse(text).error);
    else
      assert.match(
        text,
        /^Input validation error: Invalid arguments for tool emulate_function:/,
      );
    return reply;
  }
  assert.equal(ajv.validateSchema(advertised.outputSchema), true);
  assert.equal(
    ajv.validate(advertised.outputSchema, reply.structuredContent),
    true,
    JSON.stringify(ajv.errors),
  );
  const parsed = toolContract(name).outputSchema.parse(reply.structuredContent);
  const text = reply.content.find((item) => item.type === "text");
  assert.deepEqual(JSON.parse(text.text), reply.structuredContent);
  return parsed;
}
const bits = (number) => {
  const b = Buffer.alloc(8);
  b.writeDoubleLE(number);
  return `0x${b.readBigUInt64LE().toString(16)}`;
};
try {
  await client.connect(transport);
  catalog = (await client.listTools()).tools;
  await save(join(root, "catalog.json"), catalog);
  for (const architecture of ["arm64", "x86_64"]) {
    const path = join(root, architecture);
    const args = [
      "-target",
      `${architecture}-apple-macos14`,
      "-O1",
      "-fno-stack-protector",
      "-ffp-contract=off",
      "-fno-builtin",
      "-nostdlib",
      "-lSystem",
      "-Wl,-e,_rea_arithmetic",
      "-Wl,-no_uuid",
      source("c"),
      source("S"),
      "-o",
      path,
    ];
    const compiled = await exec("/usr/bin/clang", args);
    commands.push({
      command: "/usr/bin/clang",
      args,
      stdout: compiled.stdout,
      stderr: compiled.stderr,
    });
    const initialIdentity = await identity(path);
    const functions = emulationMachOFunctions(await readFile(path));
    await save(join(root, `${architecture}-oracle.json`), {
      target_host_executed: false,
      binary: initialIdentity,
      functions: Object.fromEntries(functions),
    });
    const arm = architecture === "arm64",
      returnRegister = arm ? "x0" : "rax";
    const registers = (a = 0n, b = 0n) =>
      arm
        ? {
            x0: `0x${a.toString(16)}`,
            x1: `0x${b.toString(16)}`,
            sp: "0x700007f0",
          }
        : {
            rdi: `0x${a.toString(16)}`,
            rsi: `0x${b.toString(16)}`,
            rsp: "0x700007f0",
          };
    const base = (name, a = 0n, b = 0n, helpers = []) => ({
      path,
      architecture,
      entry_address: functions.get(`_rea_${name}`).address,
      code_regions: [name, ...helpers].map((n) => functions.get(`_rea_${n}`)),
      initial_registers: registers(a, b),
      memory_regions: [
        {
          address: "0x70000000",
          bytes_hex: "00".repeat(2048),
          permissions: "rw",
        },
      ],
      timeout_ms: 1000,
    });
    async function scenario(label, request, check, cliParity = false) {
      const evidence = parseEvidence(await call("emulate_function", request));
      assert.equal(evidence.confidence, "derived");
      assert.equal(evidence.authority, "controlled-replay");
      assert.equal(evidence.subject.digest.sha256, initialIdentity.sha256);
      check(evidence.normalized_result);
      if (cliParity) {
        const inputPath = join(root, `${architecture}-${label}-request.json`);
        await save(inputPath, request);
        const output = await exec(
          process.execPath,
          [cli, "emulate-function", inputPath, "--json"],
          { env: environment, maxBuffer: 8 * 1024 * 1024 },
        );
        const cliEvidence = parseEvidence(JSON.parse(output.stdout));
        await writeFile(
          join(root, `${architecture}-${label}-cli.json`),
          output.stdout,
        );
        assert.equal(
          cliEvidence.evidence_id,
          evidence.evidence_id,
          "CLI/MCP Evidence identity must match exactly",
        );
      }
      results.push({
        architecture,
        label,
        evidence_id: evidence.evidence_id,
        stop: evidence.normalized_result.stop,
        coverage: evidence.normalized_result.coverage.instructions_started,
        cli_parity: cliParity,
      });
      await save(join(root, "results.json"), results);
    }
    const returned = (expected) => (r) => {
      assert.equal(r.stop.reason, "function_return");
      assert.equal(BigInt(r.registers_after[returnRegister]), expected);
    };
    await scenario(
      "arithmetic",
      base("arithmetic", 9n, 4n),
      returned((9n * 7n + 4n) ^ 0x5an),
      true,
    );
    await scenario("choose-small", base("choose", 3n), returned(12n));
    await scenario("choose-large", base("choose", 19n), returned(14n));
    const stored = base("store", 0x71000000n, 4n);
    stored.memory_regions.push({
      address: "0x71000000",
      bytes_hex: "00".repeat(32),
      permissions: "rw",
    });
    stored.observe_memory = [{ address: "0x71000000", size: 32 }];
    await scenario(
      "store",
      stored,
      (r) => {
        returned(22n)(r);
        const after = Buffer.from(r.memory_observations[0].after_hex, "hex");
        assert.deepEqual(
          [0, 8, 16, 24].map((p) => after.readBigUInt64LE(p)),
          [1n, 4n, 7n, 10n],
        );
      },
      true,
    );
    await scenario(
      "nested",
      base("nested", 17n, 0n, ["helper"]),
      returned((17n ^ 0x35n) + 9n),
    );
    await scenario(
      "indirect-internal",
      base("indirect", BigInt(functions.get("_rea_helper").address), 17n, [
        "helper",
      ]),
      returned((17n ^ 0x35n) + 2n),
    );
    await scenario("external", base("external", 17n), (r) => {
      assert.equal(r.stop.reason, "external_call");
      assert.equal(r.stop.phase, "before_instruction");
      assert.equal(r.stop.target, functions.get("_rea_opaque").address);
    });
    await scenario(
      "indirect-external",
      base("indirect", 0x73000000n, 17n),
      (r) => {
        assert.equal(r.stop.reason, "external_call");
        assert.equal(r.stop.target, "0x73000000");
      },
    );
    const floating = base("float");
    Object.assign(
      floating.initial_registers,
      arm ? { q0: bits(2.5), q1: bits(4) } : { xmm0: bits(2.5), xmm1: bits(4) },
    );
    await scenario("float", floating, (r) => {
      assert.equal(r.stop.reason, "function_return");
      assert.equal(
        BigInt(r.registers_after[arm ? "q0" : "xmm0"]) & ((1n << 64n) - 1n),
        BigInt(bits(6.5)),
      );
    });
    await scenario("missing-memory", base("store", 0x71000000n, 1n), (r) => {
      assert.equal(r.stop.reason, "missing_memory");
      assert.equal(r.stop.access, "write");
    });
    const padding = base("store", 0x71000008n, 1n);
    padding.memory_regions.push({
      address: "0x71000000",
      bytes_hex: "00".repeat(8),
      permissions: "rw",
    });
    await scenario("page-padding", padding, (r) =>
      assert.equal(r.stop.reason, "missing_memory"),
    );
    const readonly = structuredClone(stored);
    readonly.memory_regions[1].permissions = "r";
    await scenario("readonly", readonly, (r) => {
      assert.equal(r.stop.reason, "memory_permission");
      assert.equal(
        r.memory_observations[0].before_hex,
        r.memory_observations[0].after_hex,
      );
    });
    await scenario(
      "instructions",
      { ...base("forever"), max_instructions: 7 },
      (r) => {
        assert.equal(r.stop.reason, "instruction_limit");
        assert.equal(r.coverage.instructions_started, 7);
      },
    );
    await scenario(
      "time",
      { ...base("forever"), max_instructions: 1_000_000, timeout_ms: 1 },
      (r) => assert.equal(r.stop.reason, "time_limit"),
    );
    await scenario(
      "coverage",
      { ...base("arithmetic", 2n, 3n), max_coverage_entries: 1 },
      (r) => {
        assert.equal(r.stop.reason, "coverage_limit");
        assert.equal(r.coverage.unique_instructions, 1);
      },
    );
    const stopped = base("arithmetic");
    stopped.stop_addresses = [stopped.entry_address];
    await scenario("caller-stop", stopped, (r) => {
      assert.equal(r.stop.reason, "caller_stop");
      assert.equal(r.coverage.instructions_started, 0);
    });
    const zeroEntry = base("arithmetic", 9n, 4n);
    zeroEntry.entry_address = "0x0";
    zeroEntry.code_regions = zeroEntry.code_regions.map((r) => ({
      ...r,
      address: "0x0",
    }));
    await scenario("zero-entry", zeroEntry, returned((9n * 7n + 4n) ^ 0x5an));
    await scenario("invalid", base("invalid"), (r) =>
      assert.equal(r.stop.reason, "unsupported_instruction"),
    );
    await scenario("syscall", base("syscall"), (r) => {
      assert.equal(r.stop.reason, "unsupported_instruction");
      assert.equal(r.coverage.instructions_started, 0);
    });
    const tls = base("tls");
    tls.memory_regions.push({
      address: "0x0",
      bytes_hex: "00".repeat(8),
      permissions: "r",
    });
    await scenario("tls-not-synthesized", tls, (r) => {
      assert.equal(r.stop.reason, "unsupported_instruction");
      assert.equal(r.coverage.instructions_started, 0);
    });
    await scenario("unmodeled-cpu-state", base("unmodeled"), (r) => {
      assert.equal(r.stop.reason, "unsupported_instruction");
      assert.equal(r.coverage.instructions_started, 0);
    });
    await call(
      "emulate_function",
      {
        ...base("arithmetic"),
        code_regions: [
          functions.get("_rea_arithmetic"),
          functions.get("_rea_arithmetic"),
        ],
      },
      true,
    );
    await call(
      "emulate_function",
      { ...base("arithmetic"), initial_registers: { imaginary: "0x1" } },
      true,
    );
    await call(
      "emulate_function",
      {
        ...base("arithmetic"),
        memory_regions: [
          {
            address: functions.get("_rea_arithmetic").address,
            bytes_hex: "00",
            permissions: "rw",
          },
        ],
      },
      true,
    );
    await call(
      "emulate_function",
      {
        ...base("arithmetic"),
        code_regions: [
          {
            ...functions.get("_rea_arithmetic"),
            file_offset: initialIdentity.bytes,
          },
        ],
      },
      true,
    );
    if (arm) {
      await verifyEmulationLifecycle({
        client,
        root,
        environment,
        base,
        call,
        save,
        identity,
        calls,
      });
      await verifyEmulationUnavailable({
        root,
        environment,
        cli,
        request: base("arithmetic", 2n, 3n),
        save,
        identity,
        calls,
      });
      await save(join(root, "invocations.json"), calls);
    }
    assert.deepEqual(
      await identity(path),
      initialIdentity,
      "Original source-built target changed",
    );
  }
  await call("get_evidence_bundle", {
    detail: "summary",
    filters: { operation: "emulate_function" },
  });
  const exportPath = join(root, "evidence-bundle.json");
  await call("export_evidence_bundle", { path: exportPath });
  const bundle = parseEvidenceBundle(
    JSON.parse(await readFile(exportPath, "utf8")),
  );
  assert.equal(bundle.records.length, results.length + 1); // plus post-cancellation recovery
  assert.ok(
    results.every((result) =>
      bundle.records.some(
        (record) => record.evidence_id === result.evidence_id,
      ),
    ),
  );
} finally {
  await client.close();
  await systemProcessOwnershipHost.close?.();
  await writeFile(join(root, "server-stderr.log"), stderr);
  await save(join(root, "compiler-commands.json"), commands);
}
const completed = await completeVerifierRun(run);
await save(join(root, "summary.json"), {
  status:
    completed.process_lineage.status === "verified" &&
    completed.process_lineage.descendants.length === 0
      ? "passed"
      : "failed-lineage",
  target_host_executed: false,
  sources: [await identity(source("c")), await identity(source("S"))],
  cases: results,
  mcp_calls: calls.length,
  verifier_run: completed,
});
assert.equal(completed.process_lineage.status, "verified");
assert.deepEqual(completed.process_lineage.descendants, []);
process.stdout.write(
  JSON.stringify({
    status: "passed",
    root,
    cases: results.length,
    mcp_calls: calls.length,
    verifier_run: completed,
  }) + "\n",
);
