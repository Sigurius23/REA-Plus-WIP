import {
  jsonObjectSchema,
  jsonValueSchema,
} from "../../../src/domain/jsonValue.js";
import { Client, InMemoryTransport } from "@modelcontextprotocol/client";
import { Ajv2020 } from "ajv/dist/2020.js";
import { expect, it, onTestFinished } from "vitest";
import { createServer } from "../../../src/server/createServer.js";
import { createTestBinarySession } from "../../fixtures/binarySession.js";
import { createEvidence, parseEvidence } from "../../../src/domain/evidence.js";
import { toolContract } from "../../../src/contracts/toolContracts.js";
import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { observed } from "../../fixtures/analysisExecution.js";
import { batchDecompileResult } from "../../../src/domain/native/batchDecompile.js";
async function connect() {
  const session = createTestBinarySession(() => {
    throw Error("Retained views must not start a provider");
  });
  const server = createServer({ kind: "session", session }),
    client = new Client({ name: "native-pages", version: "1" });
  onTestFinished(async () => {
    await client.close();
    await server.close();
    await session.close();
  });
  const [a, b] = InMemoryTransport.createLinkedPair();
  await server.connect(b);
  await client.connect(a);
  return { client, session };
}
it("uses advertised schemas to summarize and page retained inventories and batches without provider reads", async () => {
  const { client, session } = await connect(),
    catalog = (await client.listTools()).tools,
    contract = catalog.find((t) => t.name === "inspect_analysis_view");
  if (!contract) throw Error("Missing named contract");
  const ajv = new Ajv2020({ strict: false, validateFormats: false }),
    validInput = ajv.compile(jsonObjectSchema.parse(contract.inputSchema)),
    validOutput = ajv.compile(jsonObjectSchema.parse(contract.outputSchema));
  const identity = {
    status: "resolved" as const,
    address: "0x10",
    name: "canonical",
  };
  for (const [operation, result, view] of [
    [
      "list_names",
      [
        { address: "0x10", value: "first" },
        { address: "0x10", value: "second" },
      ],
      { kind: "native-inventory", offset: 1, limit: 1 },
    ],
    [
      "batch_decompile",
      batchDecompileResult([
        {
          address: "same",
          procedure: identity,
          status: "ok",
          pseudocode: "first",
        },
        {
          address: "same",
          procedure: identity,
          status: "unavailable",
          reason: "no_pseudocode",
        },
      ]),
      {
        kind: "batch-decompile",
        collection: "items",
        where: { indices: [1] },
        offset: 0,
        limit: 1,
      },
    ],
  ] as const) {
    const parent = createEvidence(
      { path: "/fixture/native", format: "elf", sha256: "a".repeat(64) },
      { id: "fixture", name: "Fixture", version: "1" },
      { operation, parameters: {}, result: jsonValueSchema.parse(result) },
    );
    const retained = session.recordEvidence(parent);
    if (!retained.ok) throw retained.error;
    for (const selection of [{ kind: "summary" }, view]) {
      const args = {
        source: { kind: "retained-evidence", evidence_id: parent.evidence_id },
        view: selection,
      };
      expect(validInput(args)).toBe(true);
      const reply = await client.callTool({
        name: "inspect_analysis_view",
        arguments: args,
      });
      expect(reply.isError).not.toBe(true);
      expect(validOutput(reply.structuredContent)).toBe(true);
      const evidence = parseEvidence(reply.structuredContent);
      toolContract("inspect_analysis_view").outputSchema.parse(evidence);
      expect(evidence.evidence_links).toEqual([parent.evidence_id]);
      expect(evidence.normalized_result).toMatchObject({
        parent_evidence_id: parent.evidence_id,
        artifact: { sha256: "a".repeat(64) },
        source_provider: parent.provider,
      });
    }
    await client.callTool({ name: "close_binary", arguments: {} });
    const expired = await client.callTool({
      name: "inspect_analysis_view",
      arguments: {
        source: { kind: "retained-evidence", evidence_id: parent.evidence_id },
        view,
      },
    });
    expect(expired.isError).toBe(true);
    const portable = await client.callTool({
      name: "inspect_analysis_view",
      arguments: { source: { kind: "inline", evidence: parent }, view },
    });
    expect(portable.isError).not.toBe(true);
  }
});
it("refuses summary without retention before invoking an expensive provider operation", async () => {
  let calls = 0;
  const server = createServer({
      kind: "fixed",
      analysis: {
        execute: async () => {
          calls++;
          return observed([]);
        },
      },
    }),
    client = new Client({ name: "native-no-retention", version: "1" });
  onTestFinished(async () => {
    await client.close();
    await server.close();
  });
  const [a, b] = InMemoryTransport.createLinkedPair();
  await server.connect(b);
  await client.connect(a);
  for (const name of [
    "list_names",
    "list_procedures",
    "list_strings",
    "search_procedures",
    "search_strings",
    "batch_decompile",
    "procedure_address",
    "procedure_callees",
    "procedure_callers",
    "resolve_containing_procedure",
    "get_call_graph",
  ]) {
    const reply = await client.callTool({
      name,
      arguments: name.startsWith("search_")
        ? { pattern: "selected", detail: "summary" }
        : name === "batch_decompile"
          ? { addresses: ["0x10"], detail: "summary" }
          : name === "get_call_graph"
            ? { address: "0x10", detail: "summary" }
            : name === "resolve_containing_procedure"
              ? { address: "0x10", detail: "summary" }
              : name.startsWith("procedure_")
                ? { procedure: "0x10", detail: "summary" }
                : { detail: "summary" },
    });
    expect(reply.isError).toBe(true);
    expect(parseMcpToolError(reply).error).toMatchObject({
      code: "capability_unavailable",
    });
  }
  expect(calls).toBe(0);
});

it("validates native observation/context schemas, retained/portable parity and caveats without a provider", async () => {
  const { client, session } = await connect();
  const contract = (await client.listTools()).tools.find(
    (t) => t.name === "inspect_analysis_view",
  );
  if (!contract) throw Error("Missing named contract");
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  const input = ajv.compile(jsonObjectSchema.parse(contract.inputSchema)),
    output = ajv.compile(jsonObjectSchema.parse(contract.outputSchema));
  for (const [operation, result] of [
    ["procedure_address", "EXTERNAL:0x1"],
    ["procedure_callees", ["0x2", "0x2"]],
    ["procedure_callers", []],
    ["xrefs", ["0x3"]],
    [
      "resolve_containing_procedure",
      {
        query_address: "0x10",
        found: false,
        procedure: null,
        reason: "not_in_procedure",
      },
    ],
    [
      "get_call_graph",
      { "0": [{ address: "0x1", status: "ok", calls: [] }], "1": [] },
    ],
  ] as const) {
    const parent = createEvidence(
      undefined,
      { id: "fixture", name: "Fixture", version: "1" },
      {
        operation,
        parameters: { selected: "unchanged" },
        result: jsonValueSchema.parse(result),
        limitations: ["partial analysis", "second caveat"],
      },
    );
    const saved = session.recordEvidence(parent);
    if (!saved.ok) throw saved.error;
    for (const view of [
      { kind: "summary" },
      { kind: "native-observation", offset: 0, limit: 1 },
      { kind: "native-context", facet: "overview" },
      { kind: "native-context", facet: "analysis-profile" },
      { kind: "native-context", facet: "limitations", offset: 1, limit: 1 },
    ]) {
      const args = {
        source: { kind: "retained-evidence", evidence_id: parent.evidence_id },
        view,
      };
      expect(input(args)).toBe(true);
      const reply = await client.callTool({
        name: "inspect_analysis_view",
        arguments: args,
      });
      expect(reply.isError).not.toBe(true);
      expect(output(reply.structuredContent)).toBe(true);
      const evidence = parseEvidence(reply.structuredContent);
      expect(evidence).toMatchObject({
        evidence_links: [parent.evidence_id],
        normalized_result: {
          source_provider: parent.provider,
          source_context: {
            evidence_limitation_count: parent.limitations.length,
          },
        },
      });
      const portable = await client.callTool({
        name: "inspect_analysis_view",
        arguments: { source: { kind: "inline", evidence: parent }, view },
      });
      expect(portable.structuredContent).toEqual(reply.structuredContent);
    }
  }
});
