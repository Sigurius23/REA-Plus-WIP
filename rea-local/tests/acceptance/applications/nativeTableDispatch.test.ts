import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { readFile, writeFile } from "node:fs/promises";
import { join, resolve } from "node:path";
import { expect } from "vitest";
import { toolContract } from "../../../src/contracts/toolContracts.js";
import { parseEvidence } from "../../../src/domain/evidence.js";
import { dispatchFixture } from "../../../src/native/dispatch/NativeTableDispatch.fixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { cliTest } from "../../support/cli/cliFixture.js";

cliTest(
  "retains source-bound selected dispatch indices through compiled CLI and stdio MCP without an active target",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-dispatch-acceptance-");
    const path = join(root, "dispatch");
    const bytes = dispatchFixture();
    await writeFile(path, bytes);
    const input = {
      path,
      entry_address: "0x00001100",
      indices: [1, 0, 65535, 1],
      call_address: "0x000011C8",
    };
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [resolve("scripts/rea.mjs"), "mcp"],
      cwd: process.cwd(),
      env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
      stderr: "pipe",
    });
    const client = new Client({ name: "dispatch-acceptance", version: "1" });
    const contract = toolContract("inspect_native_table_dispatch");
    try {
      await client.connect(transport);
      const advertised = (await client.listTools()).tools.find(
        (t) => t.name === contract.name,
      );
      if (advertised?.outputSchema === undefined)
        throw new Error("Missing advertised output schema");
      const inputSchema: Record<string, unknown> = advertised.inputSchema;
      const outputSchema: Record<string, unknown> = advertised.outputSchema;
      const ajv = new Ajv2020({ strict: false, validateFormats: false });
      expect(ajv.validateSchema(inputSchema)).toBe(true);
      expect(ajv.validateSchema(outputSchema)).toBe(true);
      expect(ajv.validate(inputSchema, input)).toBe(true);
      expect(ajv.validate(inputSchema, { ...input, typed_domain: 297 })).toBe(
        false,
      );
      const cliResult = await cli.run({
        arguments: [
          "inspect-native-table-dispatch",
          JSON.stringify(input),
          "--json",
        ],
      });
      expect(cliResult.exitCode).toBe(0);
      const reply = await client.callTool({
        name: contract.name,
        arguments: input,
      });
      expect(reply.isError).not.toBe(true);
      expect(
        ajv.validate(outputSchema, reply.structuredContent),
        JSON.stringify(ajv.errors),
      ).toBe(true);
      const evidence = contract.outputSchema.parse(reply.structuredContent);
      parseEvidence(evidence);
      expect(evidence).toEqual(cliResult.json);
      expect(evidence.confidence).toBe("derived");
      expect(evidence.parameters).toMatchObject(input);
      expect(evidence.normalized_result).toMatchObject({
        requested_indices: input.indices,
        typed_domain: null,
        all_entry_domain_proved: false,
        program_mutations: false,
        invocation: { mapping_status: "conditional", mapping_index: 1 },
      });
      const text = reply.content.find((c) => c.type === "text");
      if (text?.type !== "text") throw new Error("Missing Evidence text");
      expect(JSON.parse(text.text)).toEqual(evidence);
      const retained = await client.callTool({
        name: "get_evidence_bundle",
        arguments: {},
      });
      expect(JSON.stringify(retained.structuredContent)).toContain(
        evidence.evidence_id,
      );
      for (const bad of [
        { ...input, path: "relative" },
        { ...input, indices: [-1] },
        { ...input, max_file_bytes: 32 },
        { ...input, extra: true },
      ]) {
        const rejected = await client.callTool({
          name: contract.name,
          arguments: bad,
        });
        expect(rejected.isError).toBe(true);
        if ("max_file_bytes" in bad)
          expect(parseMcpToolError(rejected)).toMatchObject({
            error: {
              retryable: false,
              remediation: {
                action: expect.stringContaining("unchanged max_file_bytes"),
              },
              details: { reported_limits: { max_file_bytes: 32 } },
            },
          });
      }
      const partial = await client.callTool({
        name: contract.name,
        arguments: { ...input, max_instructions: 2 },
      });
      expect(
        contract.outputSchema.parse(partial.structuredContent)
          .normalized_result,
      ).toMatchObject({
        table: null,
        entries: [],
        prefix: { stop: { kind: "instruction-budget" } },
      });
      const unsupportedPath = join(root, "unsupported");
      await writeFile(unsupportedPath, Buffer.from("unsupported artifact"));
      expect(
        (
          await client.callTool({
            name: contract.name,
            arguments: { ...input, path: unsupportedPath },
          })
        ).isError,
      ).toBe(true);
      expect(await readFile(path)).toEqual(bytes);
      await client.ping();
    } finally {
      try {
        await client.close();
      } finally {
        await transport.close();
      }
    }
  },
  30_000,
);
