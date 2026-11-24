import { join } from "node:path";
import { readFile, writeFile, access } from "node:fs/promises";
import { expect, it } from "vitest";
import { runCliRetainedAnalysis } from "../../../src/cli/retainedAnalysis.js";
import { createEvidence } from "../../../src/domain/evidence.js";
import { readEvidenceBundle } from "../../../src/application/EvidenceBundleFiles.js";
import { ghidraFunctionDossier } from "../../../src/domain/ghidraValues.fixture.js";
import { jsonValueSchema } from "../../../src/domain/jsonValue.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest } from "../../support/cli/cliFixture.js";

it("saves the complete source record and returns the same portable native summary", async () => {
  const root = await createTestTempDirectory("rea-function-delivery-");
  const path = join(root, "complete.bundle.json");
  const parent = createEvidence(
    { path: "/fixture/native", format: "mach-o", sha256: "a".repeat(64) },
    { id: "ghidra", name: "Ghidra", version: "12.1.4" },
    {
      operation: "analyze_function",
      parameters: { procedure: "0x401000" },
      result: ghidraFunctionDossier(),
      limitations: ["Provider limitation"],
    },
  );
  const result = await runCliRetainedAnalysis(
    async () => jsonValueSchema.parse(parent),
    { detail: "summary", evidenceOutput: path },
  );
  expect(result).toMatchObject({
    operation: "inspect_analysis_view",
    normalized_result: {
      kind: "summary",
      parent_evidence_id: parent.evidence_id,
      limitations: expect.arrayContaining(["Provider limitation"]),
    },
  });
  const bundle = await readEvidenceBundle(path);
  if (!bundle.ok) throw bundle.error;
  expect(bundle.value.records).toEqual([parent]);
  let calls = 0;
  const refused = await runCliRetainedAnalysis(
    async () => {
      calls++;
      return jsonValueSchema.parse(parent);
    },
    { detail: "summary", evidenceOutput: path },
  );
  expect(refused).toMatchObject({
    code: "invalid_request",
    details: expect.objectContaining({ reason: "exists" }),
  });
  expect(calls).toBe(0);
  expect(JSON.parse(await readFile(path, "utf8"))).toEqual(bundle.value);
});

it("preserves a native failure without writing an incomplete bundle", async () => {
  const root = await createTestTempDirectory("rea-function-failure-");
  const path = join(root, "absent.json");
  const original = { error: "Native analysis failed", code: "provider_error" };
  expect(
    await runCliRetainedAnalysis(async () => original, {
      detail: "summary",
      evidenceOutput: path,
    }),
  ).toEqual(original);
  await expect(access(path)).rejects.toMatchObject({ code: "ENOENT" });
});

cliTest(
  "requires a portable bundle for function summary before opening the target",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-function-summary-cli-");
    const result = await cli.run({
      arguments: [
        "function",
        join(root, "missing-native"),
        "0x401000",
        "--detail",
        "summary",
        "--json",
      ],
      environment: { HOME: root, XDG_CONFIG_HOME: root, XDG_CACHE_HOME: root },
    });
    expect(result.exitCode).toBe(1);
    expect(result.json).toMatchObject({
      code: "invalid_request",
      details: {
        issues: [expect.objectContaining({ path: ["evidence-output"] })],
      },
    });
  },
);

cliTest(
  "refuses an existing evidence destination before target admission",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-function-existing-cli-");
    const path = join(root, "existing.json");
    await writeFile(path, "preserve me");
    const result = await cli.run({
      arguments: [
        "function",
        join(root, "missing-native"),
        "0x401000",
        "--detail",
        "summary",
        "--evidence-output",
        path,
        "--json",
      ],
      environment: { HOME: root, XDG_CONFIG_HOME: root, XDG_CACHE_HOME: root },
    });
    expect(result.exitCode).toBe(1);
    expect(result.json).toMatchObject({
      code: "invalid_request",
      details: expect.objectContaining({ reason: "exists" }),
    });
    expect(await readFile(path, "utf8")).toBe("preserve me");
  },
);
