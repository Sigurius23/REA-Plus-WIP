import assert from "node:assert/strict";
import { readdir } from "node:fs/promises";
import { execFile } from "node:child_process";
import { promisify } from "node:util";
import { join } from "node:path";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { UnicornFunctionProvider } from "../../dist/native/emulation/UnicornFunctionProvider.js";
import { FunctionEmulationService } from "../../dist/application/binaryDiagnostics/FunctionEmulationService.js";
import { PrivateRuntimeRoot } from "../../dist/process/PrivateRuntimeRoot.js";
import { projectAnalysisError } from "../../dist/domain/analysisErrorProjection.js";
import { analysisErrorProjectionSchema } from "../../dist/contracts/errorSchemas.js";
import { parseEvidence } from "../../dist/domain/evidence.js";
import { spawnOwnedProviderProcess } from "../../dist/process/ProviderProcess.js";
import { cleanupOwnedProcessGroup } from "../../dist/process/ProcessOwnership.js";

const delay = (ms) => new Promise((resolve) => setTimeout(resolve, ms));
const errorOf = (reply) => {
  assert.equal(reply.isError, true);
  return analysisErrorProjectionSchema.parse(
    JSON.parse(reply.content.find((item) => item.type === "text").text).error,
  );
};

/** Actual MCP cancellation/capacity and real-engine observations under injected root-cleanup failure. */
export async function verifyEmulationLifecycle({
  client,
  root,
  environment,
  base,
  call,
  save,
  identity,
  calls,
}) {
  const controller = new AbortController();
  const request = {
    ...base("forever"),
    max_instructions: 1_000_000,
    timeout_ms: 30_000,
  };
  let settled = false;
  const pending = client
    .callTool(
      { name: "emulate_function", arguments: request },
      { signal: controller.signal, timeout: 60_000 },
    )
    .then(
      (reply) => {
        settled = true;
        return { reply };
      },
      (error) => {
        settled = true;
        return { error: String(error) };
      },
    );
  let observedWorker;
  try {
    // Observe a real private engine request before cancelling; this does not
    // assert which target instruction was active at that exact instant.
    const deadline = Date.now() + 10_000;
    let launched = false;
    while (!settled && Date.now() < deadline) {
      const roots = (await readdir(environment.TMPDIR)).filter((name) =>
        name.startsWith("rea-function-emulation-"),
      );
      if (roots.length === 1) {
        const files = await readdir(join(environment.TMPDIR, roots[0]));
        if (files.includes("request.json")) {
          const requestPath = join(
            environment.TMPDIR,
            roots[0],
            "request.json",
          );
          const snapshot = await promisify(execFile)(
            "ps",
            ["-axo", "pid=,ppid=,pgid=,command="],
            { env: environment },
          );
          const line = snapshot.stdout
            .split("\n")
            .find(
              (line) =>
                line.includes(requestPath) &&
                line.includes("/bridge/unicorn/emulate.py"),
            );
          const match = line?.match(/^\s*(\d+)\s+(\d+)\s+(\d+)\s+(.+)$/);
          if (match) {
            observedWorker = {
              pid: Number(match[1]),
              parent_pid: Number(match[2]),
              process_group: Number(match[3]),
              command: match[4],
            };
            launched = true;
            break;
          }
        }
      }
      await delay(20);
    }
    assert.equal(
      launched,
      true,
      "No in-flight owned engine request was observed",
    );
    const capacity = await call(
      "emulate_function",
      base("arithmetic", 2n, 3n),
      true,
    );
    assert.equal(errorOf(capacity).code, "resource_constraint");
    controller.abort();
    const outcome = await pending;
    assert.ok(
      "error" in outcome || errorOf(outcome.reply).code === "cancelled",
    );
    const receipt = join(root, "mcp-cancellation.json");
    await save(receipt, {
      request,
      outcome,
      exact_instruction_progress_observed: false,
      observed_worker: observedWorker,
    });
    calls.push({
      name: "emulate_function",
      args: request,
      cancelled: true,
      reply: await identity(receipt),
      is_error: true,
    });
    const cleanupDeadline = Date.now() + 10_000;
    while (
      Date.now() < cleanupDeadline &&
      (await readdir(environment.TMPDIR)).some((name) =>
        name.startsWith("rea-function-emulation-"),
      )
    )
      await delay(20);
    assert.equal(
      (await readdir(environment.TMPDIR)).some((name) =>
        name.startsWith("rea-function-emulation-"),
      ),
      false,
    );
    const recovered = parseEvidence(
      await call("emulate_function", base("arithmetic", 2n, 3n)),
    );
    assert.equal(recovered.normalized_result.stop.reason, "function_return");
  } finally {
    controller.abort();
    await pending;
  }

  let refusal = true;
  const provider = new UnicornFunctionProvider(
    environment,
    undefined,
    async () => {
      const runtime = await PrivateRuntimeRoot.create({
        parent: environment.TMPDIR,
        prefix: "rea-function-emulation-cleanup-",
      });
      return {
        path: runtime.path,
        close: async () => {
          if (refusal) {
            refusal = false;
            throw new Error(
              "Controlled fixture: temporary-root cleanup refused once",
            );
          }
          await runtime.close();
        },
      };
    },
  );
  const service = new FunctionEmulationService(provider);
  try {
    const first = await service.emulate(base("arithmetic", 2n, 3n));
    assert.equal(first.ok, false);
    assert.equal(first.error.cleanupIncomplete, true);
    const retained = parseEvidence(first.error.partialObservation);
    assert.equal(retained.normalized_result.stop.reason, "function_return");
    assert.equal(
      BigInt(retained.normalized_result.registers_after.x0),
      (2n * 7n + 3n) ^ 0x5an,
    );
    const cleanupError = projectAnalysisError(first.error);
    await save(join(root, "injected-root-cleanup.json"), {
      injection:
        "root-removal refusal after real engine success; not a real OS permission failure",
      error: cleanupError,
    });
    const second = await service.emulate(base("arithmetic", 2n, 3n));
    if (!second.ok) throw second.error;
    assert.equal(second.value.evidence_id, retained.evidence_id);
  } finally {
    await service.close();
  }

  // A completed engine reply also survives an unverified process cleanup.
  // The refusal is injected; the underlying worker and ownership are real.
  let processRefusal = true;
  const processProvider = new UnicornFunctionProvider(
    environment,
    async (options) => {
      const launched = await spawnOwnedProviderProcess(options);
      return {
        ...launched,
        cleanup: async () => {
          if (processRefusal) {
            processRefusal = false;
            return {
              cleaned: false,
              reason: "Controlled fixture: process cleanup refused once",
            };
          }
          return cleanupOwnedProcessGroup(launched.ownership);
        },
      };
    },
  );
  const processService = new FunctionEmulationService(processProvider);
  try {
    const first = await processService.emulate(base("arithmetic", 2n, 3n));
    assert.equal(first.ok, false);
    assert.equal(first.error.cleanupIncomplete, true);
    const retained = parseEvidence(first.error.partialObservation);
    assert.equal(retained.normalized_result.stop.reason, "function_return");
    await save(join(root, "injected-process-cleanup.json"), {
      injection:
        "controlled refusal after real engine completion; not an OS failure",
      error: projectAnalysisError(first.error),
    });
    const second = await processService.emulate(base("arithmetic", 2n, 3n));
    if (!second.ok) throw second.error;
    assert.equal(second.value.evidence_id, retained.evidence_id);
  } finally {
    await processService.close();
  }
}

/** Missing configuration/dependency stays a typed unavailable error, never a success. */
export async function verifyEmulationUnavailable({
  root,
  environment,
  cli,
  request,
  save,
  identity,
  calls,
}) {
  const emptyEnvironment = join(root, "no-engine-python");
  await promisify(execFile)(
    environment.REA_UNICORN_PYTHON,
    ["-m", "venv", "--without-pip", emptyEnvironment],
    { env: environment },
  );
  for (const [label, python] of [
    ["unconfigured", ""],
    ["missing-package", join(emptyEnvironment, "bin", "python")],
  ]) {
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [cli, "mcp"],
      env: { ...environment, REA_UNICORN_PYTHON: python },
      stderr: "pipe",
    });
    const client = new Client({ name: `rea-emulation-${label}`, version: "1" });
    try {
      await client.connect(transport);
      const reply = await client.callTool(
        { name: "emulate_function", arguments: request },
        { timeout: 60_000 },
      );
      assert.equal(errorOf(reply).code, "capability_unavailable");
      const path = join(root, `${label}.json`);
      await save(path, reply);
      calls.push({
        name: "emulate_function",
        args: request,
        configuration: label,
        reply: await identity(path),
        is_error: true,
      });
    } finally {
      await client.close();
    }
  }
}
