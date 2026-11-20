import { Client, InMemoryTransport } from "@modelcontextprotocol/client";
import { Ajv2020 } from "ajv/dist/2020.js";
import { expect, it, onTestFinished } from "vitest";
import { createServer } from "../../../src/server/createServer.js";
import { parseEvidence } from "../../../src/domain/evidence.js";
import { ghidraFunctionDossier } from "../../../src/domain/ghidraValues.fixture.js";
import { functionDossierSchema } from "../../../src/domain/hopperValues.js";
import { toolContract } from "../../../src/contracts/toolContracts.js";
import { observed } from "../../fixtures/analysisExecution.js";
import {
  createBinarySessionTargets,
  createTestBinarySession,
} from "../../fixtures/binarySession.js";
import { connect, closeEnhancedToolResources } from "./enhancedToolsHarness.js";
import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { ok } from "../../../src/domain/result.js";
import { analysisViewResultSchema } from "../../../src/domain/analysisView/analysisView.js";

it("retains a >10 MiB function, pages Unicode and instructions, and preserves complete Evidence identity", async () => {
  const dossier = functionDossierSchema.parse({
    ...functionDossierSchema.parse(ghidraFunctionDossier()),
    pseudocode: "X".repeat(11 * 1024 * 1024) + "😀tail",
    limitations: ["Retained synthetic provider limitation"],
  });
  let calls = 0;
  const session = createTestBinarySession(() => ({
    execute: async (operation, parameters) => {
      if (operation === "health") return observed({ ready: true });
      expect(operation).toBe("analyze_function");
      expect(parameters).toEqual({ procedure: "0x401000" });
      calls++;
      return observed(dossier);
    },
    close: async () => ok(null),
  }));
  const [path] = await createBinarySessionTargets();
  const opened = await session.open(path);
  if (!opened.ok) throw opened.error;
  const server = createServer({ kind: "session", session });
  const client = new Client({ name: "function-summary-test", version: "1" });
  onTestFinished(async () => {
    await client.close();
    await server.close();
    await session.close();
  });
  const [ct, st] = InMemoryTransport.createLinkedPair();
  await server.connect(st);
  await client.connect(ct);
  const advertised = (await client.listTools()).tools.find(
    (t) => t.name === "analyze_function",
  );
  if (advertised?.outputSchema === undefined)
    throw new Error("Missing function schema");
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  const inputSchema: Record<string, unknown> = advertised.inputSchema;
  const outputSchema: Record<string, unknown> = advertised.outputSchema;
  const arguments_ = { procedure: "0x401000", detail: "summary" };
  expect(ajv.validate(inputSchema, arguments_)).toBe(true);
  const response = await client.callTool({
    name: "analyze_function",
    arguments: arguments_,
  });
  expect(response.isError).not.toBe(true);
  expect(
    ajv.validate(outputSchema, response.structuredContent),
    JSON.stringify(ajv.errors),
  ).toBe(true);
  const summary = toolContract("analyze_function").outputSchema.parse(
    response.structuredContent,
  );
  expect(summary.operation).toBe("inspect_analysis_view");
  expect(summary.normalized_result).toMatchObject({
    kind: "summary",
    summary: {
      procedure: { address: "0x401000" },
      pseudocode: {
        code_units: dossier.pseudocode.length,
        unit: "utf16-code-units",
      },
    },
    limitations: expect.arrayContaining(dossier.limitations),
  });
  expect(JSON.stringify(response).length).toBeLessThan(16000);
  const normalized = analysisViewResultSchema.parse(summary.normalized_result);
  const parent = session.evidenceById(normalized.parent_evidence_id);
  if (parent === undefined)
    throw new Error("Complete dossier was not retained");
  expect(parseEvidence(parent).evidence_id).toBe(parent.evidence_id);
  expect(parent.parameters).toEqual({ procedure: "0x401000" });
  expect(parent.normalized_result).toEqual(dossier);
  for (const view of [
    { kind: "native", facet: "assembly", offset: 0, limit: 1 },
    { kind: "native", facet: "pseudocode", offset: 11 * 1024 * 1024, limit: 2 },
  ]) {
    const page = await client.callTool({
      name: "inspect_analysis_view",
      arguments: {
        source: { kind: "retained-evidence", evidence_id: parent.evidence_id },
        view,
      },
    });
    expect(page.isError).not.toBe(true);
    expect(JSON.stringify(page).length).toBeLessThan(16000);
    const parsed = parseEvidence(page.structuredContent);
    expect(parsed.normalized_result).toMatchObject(
      view.facet === "assembly"
        ? { item: dossier.assembly.slice(0, 1), coverage: { next_offset: 1 } }
        : {
            item: { text: "😀", unit: "utf16-code-units" },
            coverage: { examined: 2 },
          },
    );
  }
  expect(calls).toBe(1);
  const complete = await client.callTool({
    name: "analyze_function",
    arguments: { procedure: "0x401000" },
  });
  // The unchanged complete-delivery budget still refuses this large response.
  expect(complete.isError).toBe(true);
  expect(session.evidenceById(parent.evidence_id)).toEqual(parent);
});

it("refuses summary on a fixed server before running the provider", async () => {
  let calls = 0;
  onTestFinished(closeEnhancedToolResources);
  const client = await connect({
    execute: async () => {
      calls++;
      return observed(ghidraFunctionDossier());
    },
  });
  const response = await client.callTool({
    name: "analyze_function",
    arguments: { procedure: "0x401000", detail: "summary" },
  });
  expect(response.isError).toBe(true);
  expect(parseMcpToolError(response)).toMatchObject({
    error: { code: "capability_unavailable" },
  });
  expect(calls).toBe(0);
  const complete = await client.callTool({
    name: "analyze_function",
    arguments: { procedure: "0x401000" },
  });
  expect(complete.isError).not.toBe(true);
  expect(parseEvidence(complete.structuredContent).operation).toBe(
    "analyze_function",
  );
});
