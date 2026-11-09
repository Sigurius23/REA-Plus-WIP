import { afterEach, expect, it, vi } from "vitest";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import { analysisErrorProjectionSchema } from "../contracts/errorSchemas.js";
import { resolveGhidraAnalysisSeeds } from "./GhidraAnalysisSeeds.js";

const { realpathFailure } = vi.hoisted(() => ({
  realpathFailure: vi.fn(),
}));
vi.mock("node:fs/promises", async (original) => ({
  ...(await original<typeof import("node:fs/promises")>()),
  realpath: realpathFailure,
}));
afterEach(() => realpathFailure.mockReset());

const selected = "/selected/owned-seed-fixture.tsv";

it.each(["EACCES", "EPERM"] as const)(
  "retains %s as host access denial rather than invalid configuration",
  async (systemCode) => {
    const cause = Object.assign(new Error("Read permission denied"), {
      code: systemCode,
    });
    realpathFailure.mockRejectedValueOnce(cause);
    const result = await resolveGhidraAnalysisSeeds(selected);
    if (result.ok) throw new Error("Expected access denial");
    expect(result.error.cause).toBe(cause);
    expect(
      analysisErrorProjectionSchema.parse(projectAnalysisError(result.error)),
    ).toMatchObject({
      code: "access_denied",
      retryable: false,
      details: {
        operation: "resolve_analysis_profile",
        path: selected,
        system_code: systemCode,
        boundary: "filesystem-read",
      },
    });
  },
);

it("preserves a positive ENOSPC observation as disk capacity failure", async () => {
  const cause = Object.assign(new Error("Host has no space left"), {
    code: "ENOSPC",
  });
  realpathFailure.mockRejectedValueOnce(cause);
  const result = await resolveGhidraAnalysisSeeds(selected);
  if (result.ok) throw new Error("Expected capacity failure");
  expect(result.error.cause).toBe(cause);
  const error = analysisErrorProjectionSchema.parse(
    projectAnalysisError(result.error),
  );
  expect(error).toMatchObject({
    code: "resource_constraint",
    retryable: false,
    details: {
      operation: "resolve_analysis_profile",
      resource: "disk",
      reported_limits: null,
      diagnostics: {
        setting: "REA_GHIDRA_SEED_FILE",
        path: selected,
        system_code: "ENOSPC",
      },
    },
  });
  expect(error.remediation.action).toContain("Unchanged capacity");
});

it.each([
  Object.assign(new Error("Incidental filesystem I/O failure"), {
    code: "EIO",
  }),
  new TypeError("Unexpected internal failure"),
])("does not recategorize an incidental failure: %s", async (cause) => {
  realpathFailure.mockRejectedValueOnce(cause);
  const result = await resolveGhidraAnalysisSeeds(selected);
  if (result.ok) throw new Error("Expected provider failure");
  expect(result.error.cause).toBe(cause);
  expect(projectAnalysisError(result.error)).toMatchObject({
    code: "execution_failure",
    details: {
      diagnostics: {
        setting: "REA_GHIDRA_SEED_FILE",
        path: selected,
        reason: cause.message,
      },
    },
  });
});
