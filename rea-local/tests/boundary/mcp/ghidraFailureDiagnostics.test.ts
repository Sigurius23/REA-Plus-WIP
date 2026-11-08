import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { expect, it } from "vitest";

import { logCliCommand } from "../../../src/cliLogging.js";
import { analysisErrorProjectionSchema } from "../../../src/contracts/errorSchemas.js";
import { GhidraRequestQueue } from "../../../src/ghidra/GhidraRequestQueue.js";
import {
  GhidraSessionError,
  bindGhidraSessionFailure,
} from "../../../src/ghidra/GhidraSessionError.js";
import { silentLogger } from "../../../src/logger.js";
import { ProviderCleanupError } from "../../../src/domain/providerCleanupError.js";
import { connectGhidraMcp } from "./ghidraMcpHarness.js";

it("preserves queue failure diagnostics through the provider, CLI adapter and SDK MCP transport", async () => {
  const token = "fixture-authentication-token";
  const cause = Object.assign(
    new TypeError(
      `Decode failed ${token}: /tmp/password-fixture http://localhost/secret?token=public-value`,
    ),
    { code: "EDECODE" },
  );
  const failure = bindGhidraSessionFailure(
    () => ({
      target_path: "/tmp/public-fixture",
      target_sha256: "a".repeat(64),
    }),
    (value) => value.replaceAll(token, "[REDACTED]"),
  );
  const queue = new GhidraRequestQueue(
    async () => {
      throw cause;
    },
    failure,
    () => Promise.resolve(),
  );
  const harness = await connectGhidraMcp(
    "ghidra-failure-diagnostics",
    (operation, input, options) => queue.run(operation, input, options ?? {}),
  );
  const previousExitCode = process.exitCode;
  try {
    const cli = await logCliCommand(silentLogger, "inspect", async () => {
      const result = await harness.session.execute("list_procedures", {});
      if (!result.ok) throw result.error;
      return result.value.result;
    });
    expect(process.exitCode).toBe(1);
    const parsed = analysisErrorProjectionSchema.parse(cli);
    expect(parsed).toMatchObject({
      code: "execution_failure",
      details: {
        diagnostics: {
          target_path: "/tmp/public-fixture",
          failure_kind: "protocol",
          failure_message:
            "Ghidra serial request execution rejected unexpectedly",
          failure_cause: {
            name: "TypeError",
            code: "EDECODE",
            message:
              "Decode failed [REDACTED]: /tmp/password-fixture http://localhost/secret?token=public-value",
          },
        },
      },
    });
    const mcp = await harness.mcp.callTool({
      name: "list_procedures",
      arguments: {},
    });
    expect(mcp.isError).toBe(true);
    expect(parseMcpToolError(mcp)).toMatchObject({ error: parsed });
    expect(mcp.content).toContainEqual(
      expect.objectContaining({
        type: "text",
        text: expect.stringContaining("EDECODE"),
      }),
    );
    expect(JSON.stringify(mcp)).not.toContain(token);
    expect(JSON.stringify(mcp)).not.toContain(cause.stack);
  } finally {
    process.exitCode = previousExitCode;
    await harness.close();
  }
}, 30_000);

it("preserves the public overview operation and bounded startup diagnostics through MCP", async () => {
  const failure = new GhidraSessionError(
    "timeout",
    "Startup deadline elapsed",
    {
      phase: "startup",
      stage: "awaiting-post-analysis-bridge",
      startup_timeout_ms: 900000,
      stdout: {
        text: "bounded captured import output",
        bytes: 28,
        retained_bytes: 28,
      },
      diagnostic_truncated: true,
    },
    { timeoutMs: 900000 },
  );
  const harness = await connectGhidraMcp(
    "startup-failure-diagnostics",
    undefined,
    { startupFailure: failure },
  );
  try {
    const reply = await harness.mcp.callTool({
      name: "binary_overview",
      arguments: {},
    });
    const error = parseMcpToolError(reply).error;
    expect(error).toMatchObject({
      code: "provider_timeout",
      retryable: false,
      details: {
        operation: "binary_overview",
        provider: "ghidra",
        provider_operation: "list_documents",
        phase: "startup",
        stage: "awaiting-post-analysis-bridge",
        timeout_ms: 900000,
        diagnostics: {
          diagnostic_truncated: true,
          stdout: { text: "bounded captured import output" },
        },
      },
    });
    expect(error.message).toContain("binary_overview");
    expect(error.message).not.toContain("smaller request");
    expect(error.remediation.action).toContain("REA_GHIDRA_STARTUP_TIMEOUT_MS");
    expect(error.remediation.action).toContain(
      "REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS",
    );
    expect(error.remediation.action).toContain("Unchanged settings");
  } finally {
    await harness.close();
  }
});

it.each(["stdout", "stderr"] as const)(
  "projects explicit disk exhaustion from %s consistently through CLI and MCP",
  async (stream) => {
    const text = "Caused by: java.io.IOException: No space left on device\n";
    const diagnostics = {
      phase: "startup",
      stage: "awaiting-post-analysis-bridge",
      runtime_root: "/tmp/owned-projected-runtime",
      exit_code: 0,
      diagnostic_truncated: true,
      [stream]: { text, bytes: 4000, retained_bytes: Buffer.byteLength(text) },
    };
    const failure = new GhidraSessionError(
      "process",
      "Ghidra exited before bridge startup",
      diagnostics,
    );
    const harness = await connectGhidraMcp(
      "disk-capacity-diagnostics",
      undefined,
      { startupFailure: failure },
    );
    const previousExitCode = process.exitCode;
    try {
      const cli = analysisErrorProjectionSchema.parse(
        await logCliCommand(silentLogger, "inspect", async () => {
          const result = await harness.session.execute("list_procedures", {});
          if (!result.ok) throw result.error;
          return result.value.result;
        }),
      );
      expect(cli).toMatchObject({
        code: "resource_constraint",
        category: "resource_constraint",
        retryable: false,
        details: {
          resource: "disk",
          reported_limits: null,
          provider_id: "ghidra",
          provider_operation: "list_procedures",
          diagnostics,
          resource_observation: {
            source: stream,
            signal: "java.io.IOException",
          },
        },
      });
      expect(cli.message).toContain("disk exhaustion");
      expect(cli.remediation.action).toContain("Restore free space");
      expect(cli.remediation.action).toContain(
        "REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS",
      );
      expect(cli.remediation.action).toContain("Unchanged capacity");
      expect(cli.remediation.action).not.toContain("Retry once");
      const reply = await harness.mcp.callTool({
        name: "list_procedures",
        arguments: {},
      });
      expect(reply.isError).toBe(true);
      expect(parseMcpToolError(reply).error).toEqual(cli);
      const overview = await harness.mcp.callTool({
        name: "binary_overview",
        arguments: {},
      });
      expect(parseMcpToolError(overview).error).toMatchObject({
        code: "resource_constraint",
        retryable: false,
        details: {
          operation: "binary_overview",
          provider_operation: "list_documents",
          diagnostics,
        },
      });
    } finally {
      process.exitCode = previousExitCode;
      await harness.close();
    }
  },
);

it("preserves capacity failure and incomplete cleanup together", async () => {
  const cleanup = new ProviderCleanupError("ghidra", ["owned-ghidra-process"], {
    reason: "cleanup unconfirmed",
  });
  const failure = new GhidraSessionError(
    "start",
    "Runtime write failed",
    { phase: "startup", failure_cause: { code: "ENOSPC" } },
    { cleanupFailure: cleanup },
  );
  const harness = await connectGhidraMcp("disk-capacity-cleanup", undefined, {
    startupFailure: failure,
  });
  try {
    const reply = await harness.mcp.callTool({
      name: "list_procedures",
      arguments: {},
    });
    expect(parseMcpToolError(reply).error).toMatchObject({
      code: "cleanup_incomplete",
      retryable: false,
      details: {
        diagnostics: {
          primary_error: {
            code: "resource_constraint",
            retryable: false,
            details: {
              resource: "disk",
              diagnostics: { failure_cause: { code: "ENOSPC" } },
            },
          },
          cleanup_error: { code: "cleanup_incomplete" },
        },
      },
    });
  } finally {
    await harness.close();
  }
});

it("keeps a remote request rejection distinct from stale startup capacity text", async () => {
  const failure = new GhidraSessionError(
    "remote",
    "Invalid address",
    {
      phase: "operation",
      stdout: { text: "java.io.IOException: No space left on device" },
    },
    { remoteCode: "invalid_request" },
  );
  const harness = await connectGhidraMcp("disk-capacity-stale", async () => ({
    ok: false,
    error: failure,
  }));
  try {
    const reply = await harness.mcp.callTool({
      name: "list_procedures",
      arguments: {},
    });
    expect(parseMcpToolError(reply).error.code).toBe("invalid_request");
  } finally {
    await harness.close();
  }
});
