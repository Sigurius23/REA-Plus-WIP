import { Ajv2020 } from "ajv/dist/2020.js";
import { expect, it, onTestFinished } from "vitest";
import { jsonObjectSchema } from "../../../src/domain/jsonValue.js";
import { parseEvidence } from "../../../src/domain/evidence.js";
import { GhidraSessionError } from "../../../src/ghidra/GhidraSessionError.js";
import { ok, err } from "../../../src/domain/result.js";
import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { connectGhidraMcp } from "./ghidraMcpHarness.js";
it("advertises masked memory search and preserves requested spelling while compiling exact bridge bytes", async () => {
  const { mcp, close, calls } = await connectGhidraMcp(
    "byte-search",
    async (name, input) => {
      expect(name).toBe("search_bytes");
      expect(input).toMatchObject({
        pattern: "a0000f",
        mask: "f0000f",
        limit: 1001,
        document: null,
      });
      return ok({
        matches: [
          {
            address: "0x10",
            segment: ".data",
            file_offset: null,
            procedure: null,
          },
        ],
        searched: {
          blocks: [{ segment: ".data", start: "0x10", end: "0x12", bytes: 3 }],
          bytes: 3,
          skipped_uninitialized: [],
          skipped_not_loaded: [],
          skipped_overlays: [],
        },
        complete: true,
        next_cursor: null,
      });
    },
  );
  onTestFinished(close);
  const contract = (await mcp.listTools()).tools.find(
    (t) => t.name === "search_bytes",
  );
  if (!contract) throw Error("Missing named contract");
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  const validInput = ajv.compile(jsonObjectSchema.parse(contract.inputSchema)),
    validOutput = ajv.compile(jsonObjectSchema.parse(contract.outputSchema));
  const query = { pattern: "A1\t?? bF", mask: "F0 ff 0F", limit: 1001 };
  expect(validInput(query)).toBe(true);
  const reply = await mcp.callTool({ name: "search_bytes", arguments: query });
  expect(reply.isError).not.toBe(true);
  expect(validOutput(reply.structuredContent)).toBe(true);
  expect(parseEvidence(reply.structuredContent).parameters).toEqual(query);
  expect(calls).toEqual(["search_bytes"]);
  const repeated = await mcp.callTool({
    name: "search_bytes",
    arguments: query,
  });
  expect(repeated.isError).not.toBe(true);
  expect(calls).toEqual(["search_bytes", "search_bytes"]);
  const bad = await mcp.callTool({
    name: "search_bytes",
    arguments: { pattern: "4 8" },
  });
  expect(bad.isError).toBe(true);
  expect(bad.content).toEqual(
    expect.arrayContaining([
      expect.objectContaining({
        type: "text",
        text: expect.stringContaining("pattern"),
      }),
    ]),
  );
  expect(calls).toHaveLength(2);
});
it("reports a cursor binding mismatch at the cursor without claiming a target change", async () => {
  const { mcp, close } = await connectGhidraMcp(
    "byte-search-cursor",
    async () =>
      err(
        new GhidraSessionError(
          "remote",
          "Byte search cursor does not match its bound context",
          {},
          { remoteCode: "byte_search_cursor_mismatch" },
        ),
      ),
  );
  onTestFinished(close);
  const reply = await mcp.callTool({
    name: "search_bytes",
    arguments: { pattern: "aa", cursor: "another-context" },
  });
  expect(parseMcpToolError(reply).error).toMatchObject({
    code: "invalid_request",
    details: {
      issues: [
        {
          path: ["cursor"],
          message: expect.stringContaining("differing component is unknown"),
        },
      ],
    },
  });
});

it("projects an explicit bridge disk-capacity failure with actionable remediation", async () => {
  const { mcp, close } = await connectGhidraMcp(
    "byte-search-capacity",
    async () =>
      err(
        new GhidraSessionError(
          "remote",
          "IOException: No space left on device",
          { phase: "startup" },
          { remoteCode: "disk_exhausted" },
        ),
      ),
  );
  onTestFinished(close);
  const reply = await mcp.callTool({
    name: "search_bytes",
    arguments: { pattern: "aa" },
  });
  expect(parseMcpToolError(reply).error).toMatchObject({
    code: "resource_constraint",
    details: {
      resource: "disk",
      resource_observation: { source: "bridge.remote_code", signal: "ENOSPC" },
    },
    remediation: { action: expect.stringContaining("Restore free space") },
  });
});
