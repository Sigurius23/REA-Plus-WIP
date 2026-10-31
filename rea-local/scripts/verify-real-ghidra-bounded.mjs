#!/usr/bin/env node
import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { createHash } from "node:crypto";
import { createReadStream } from "node:fs";
import { mkdir, mkdtemp, rm, writeFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { parseArgs, promisify } from "node:util";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { toolContract } from "../dist/contracts/toolContracts.js";
import { ghidraAnalysisTimeoutSecondsSchema } from "../dist/config/ghidraStartupTimeout.js";
import { createVerifierRun, completeVerifierRun } from "./lib/verifier-run.mjs";

const { values } = parseArgs({
  options: {
    target: { type: "string" },
    procedure: { type: "string" },
    "analysis-seconds": { type: "string", default: "60" },
    "expect-partial": { type: "boolean", default: false },
    "output-dir": { type: "string" },
    cli: { type: "boolean", default: false },
  },
});
const budget = ghidraAnalysisTimeoutSecondsSchema.parse(
  values["analysis-seconds"],
);
assert.ok(
  process.env.GHIDRA_INSTALL_DIR && process.env.JAVA_HOME,
  "Set GHIDRA_INSTALL_DIR and JAVA_HOME to an installed Ghidra and JDK",
);
assert.equal(
  Boolean(values.target),
  Boolean(values.procedure),
  "Supply target and procedure together",
);
const output = values["output-dir"] && resolve(values["output-dir"]);
if (output) await mkdir(output); // Never overwrite an earlier verification capture.
const run = createVerifierRun();
const cliPath = fileURLToPath(new URL("./rea.mjs", import.meta.url));
const execute = promisify(execFile);
const root = await mkdtemp(join(tmpdir(), "rea-ghidra-bounded-"));
const hash = async (path) => {
  const digest = createHash("sha256");
  for await (const bytes of createReadStream(path)) digest.update(bytes);
  return digest.digest("hex");
};
const save = async (name, value) => {
  if (output)
    await writeFile(
      join(output, `${name}.json`),
      `${JSON.stringify(value, null, 2)}\n`,
    );
};
const environment = (seconds) => ({
  PATH: process.env.PATH ?? "/usr/bin:/bin",
  JAVA_HOME: process.env.JAVA_HOME,
  GHIDRA_INSTALL_DIR: process.env.GHIDRA_INSTALL_DIR,
  REA_ANALYSIS_PROVIDER: "ghidra",
  REA_LOG_LEVEL: "silent",
  REA_GHIDRA_STARTUP_TIMEOUT_MS: "330000",
  REA_PROCESS_RUN_ID: run.run_id,
  ...(seconds === undefined
    ? {}
    : { REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS: String(seconds) }),
});
const measuredState = (evidence) => {
  const matches = evidence.limitations
    .map((text) =>
      /analysis_complete=(true|false); analysis_timed_out=(true|false)(?:; analysis_timeout_seconds=(\d+))?\./u.exec(
        text,
      ),
    )
    .filter(Boolean);
  assert.equal(
    matches.length,
    1,
    "Evidence must retain one measured provider analysis state",
  );
  const [, complete, timedOut, seconds] = matches[0];
  assert.notEqual(complete, timedOut);
  return {
    analysis_complete: complete === "true",
    analysis_timed_out: timedOut === "true",
    analysis_timeout_seconds: seconds === undefined ? null : Number(seconds),
  };
};

async function inspect(path, procedure, seconds, name, includeCli) {
  const before = await hash(path);
  const client = new Client({ name: "ghidra-bounded-verifier", version: "1" });
  const transport = new StdioClientTransport({
    command: process.execPath,
    args: [cliPath, "mcp"],
    env: environment(seconds),
    stderr: "pipe",
  });
  let stderr = Buffer.alloc(0);
  let stderrBytes = 0;
  transport.stderr?.on("data", (chunk) => {
    stderrBytes += chunk.length;
    stderr = Buffer.concat([
      stderr,
      chunk.subarray(0, Math.max(0, 8 * 1024 * 1024 - stderr.length)),
    ]);
  });
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  let advertised;
  let overview;
  let pseudocode;
  let session;
  let opened = false;
  const call = async (operation, arguments_ = {}) => {
    const reply = await client.callTool(
      { name: operation, arguments: arguments_ },
      { timeout: 390000 },
    );
    await save(`${name}.${operation}`, reply);
    assert.notEqual(
      reply.isError,
      true,
      `${operation} failed; inspect retained output in ${output ?? "the verifier stderr"}`,
    );
    const schema = advertised.find(
      (tool) => tool.name === operation,
    )?.outputSchema;
    assert.ok(schema, `Missing advertised ${operation} output schema`);
    assert.equal(
      ajv.validate(schema, reply.structuredContent),
      true,
      JSON.stringify(ajv.errors),
    );
    return toolContract(operation).outputSchema.parse(reply.structuredContent);
  };
  const started = performance.now();
  let duration;
  let failure;
  const cleanup = [];
  try {
    await client.connect(transport);
    advertised = (await client.listTools()).tools;
    for (const operation of [
      "open_binary",
      "binary_overview",
      "procedure_pseudo_code",
      "search_procedures",
      "binary_session",
      "close_binary",
    ]) {
      const tool = advertised.find(({ name }) => name === operation);
      assert.ok(tool);
      assert.equal(ajv.validateSchema(tool.inputSchema), true);
      assert.equal(ajv.validateSchema(tool.outputSchema), true);
    }
    await call("open_binary", { path, provider_id: "ghidra" });
    opened = true;
    overview = await call("binary_overview");
    duration = Math.round(performance.now() - started);
    assert.ok(overview.normalized_result.procedure_count > 0);
    const state = measuredState(overview);
    assert.equal(state.analysis_timeout_seconds, seconds ?? null);
    if (seconds === undefined) assert.equal(state.analysis_complete, true);
    if (values["expect-partial"]) assert.equal(state.analysis_timed_out, true);
    if (state.analysis_timed_out)
      assert.ok(
        overview.limitations.some((text) =>
          text.includes("stable partial Program"),
        ),
      );
    if (!values.target) {
      const candidates = await call("search_procedures", {
        pattern: procedure,
        mode: "literal",
        case_sensitive: true,
      });
      assert.equal(
        candidates.normalized_result.length,
        1,
        "Source fixture procedure must resolve uniquely from the actual inventory",
      );
      procedure = candidates.normalized_result[0].address;
    }
    pseudocode = await call("procedure_pseudo_code", { procedure });
    assert.equal(typeof pseudocode.normalized_result, "string");
    assert.ok(pseudocode.normalized_result.length > 0);
    assert.deepEqual(measuredState(pseudocode), state);
    session = await call("binary_session");
    const profile = session.result.analysis_provider_binding.analysis_profile;
    assert.equal(profile.parameters.analysis_timeout_seconds, seconds);
    assert.equal(
      profile.parameters.analysis_policy,
      seconds === undefined ? undefined : "bounded-autoanalysis-v1",
    );
    assert.equal(session.result.sha256, before);
  } catch (cause) {
    failure = cause;
  } finally {
    if (opened) {
      try {
        await call("close_binary");
      } catch (cause) {
        cleanup.push(cause);
      }
    }
    try {
      await client.close();
    } catch (cause) {
      cleanup.push(cause);
    }
    try {
      await transport.close();
    } catch (cause) {
      cleanup.push(cause);
    }
    await save(`${name}.stderr`, {
      text: stderr.toString("utf8"),
      observed_bytes: stderrBytes,
      retained_bytes: stderr.length,
      truncated: stderrBytes > stderr.length,
    });
  }
  assert.equal(await hash(path), before, "Target bytes changed");
  if (failure || cleanup.length)
    throw new AggregateError(
      [...(failure ? [failure] : []), ...cleanup],
      "Ghidra bounded verification or cleanup failed",
    );
  if (includeCli) {
    const reply = await execute(
      process.execPath,
      [cliPath, "inspect", path, "--provider", "ghidra", "--json"],
      {
        env: environment(seconds),
        timeout: 390000,
        maxBuffer: 32 * 1024 * 1024,
      },
    );
    const evidence = toolContract("binary_overview").outputSchema.parse(
      JSON.parse(reply.stdout),
    );
    await save(`${name}.cli-overview`, evidence);
    assert.deepEqual(evidence.normalized_result, overview.normalized_result);
    assert.deepEqual(measuredState(evidence), measuredState(overview));
    assert.equal(evidence.evidence_id, overview.evidence_id);
  }
  return {
    target_sha256: before,
    analysis_profile: session.result.analysis_provider_binding.analysis_profile,
    first_overview_ms: duration,
    state: measuredState(overview),
    overview: overview.normalized_result,
    overview_evidence_id: overview.evidence_id,
    pseudocode_evidence_id: pseudocode.evidence_id,
    pseudocode_characters: pseudocode.normalized_result.length,
    cli_parity: includeCli,
    target_executed: false,
  };
}

let reports;
try {
  if (values.target)
    reports = [
      await inspect(
        resolve(values.target),
        values.procedure,
        budget,
        "target",
        values.cli,
      ),
    ];
  else {
    const fixture = join(root, "inventory");
    await execute(process.env.REA_CC ?? "cc", [
      "-g",
      "-O1",
      fileURLToPath(
        new URL("../tests/conformance/ghidra/inventory.c", import.meta.url),
      ),
      "-o",
      fixture,
    ]);
    reports = [
      await inspect(
        fixture,
        "rea_ghidra_inventory_leaf",
        undefined,
        "default",
        true,
      ),
      await inspect(
        fixture,
        "rea_ghidra_inventory_leaf",
        budget,
        "bounded",
        true,
      ),
    ];
    assert.notEqual(
      reports[0].analysis_profile.digest,
      reports[1].analysis_profile.digest,
    );
  }
} finally {
  await rm(root, { recursive: true, force: true });
}
const report = {
  ok: true,
  provider: "ghidra",
  target_executed: false,
  reports,
  verifier_run: await completeVerifierRun(run),
};
await save("summary", report);
console.log(JSON.stringify(report));
