import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { writeFile } from "node:fs/promises";
import { join, resolve } from "node:path";
import { expect } from "vitest";

import { toolContract } from "../../../src/contracts/toolContracts.js";
import { javascriptApplicationAnalysisResultSchema } from "../../../src/domain/javascript/javascriptApplicationAnalysis.js";
import { javaScriptSemanticTraceResultSchema } from "../../../src/domain/javascript/javascriptSemanticTraceSchemas.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest } from "../../support/cli/cliFixture.js";

cliTest(
  "traces proved local-call own fields through identical public CLI/MCP Evidence while escaped results remain unknown",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-call-result-fields-");
    const factory =
      "function known(){return {value:'owned-value'};} const result=known();";
    await writeFile(
      join(root, "known.js"),
      `${factory} const output=result.value; consume(output);`,
    );
    await writeFile(
      join(root, "escaped.js"),
      `${factory} change(result); const output=result.value; consume(output);`,
    );
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [resolve("scripts/rea.mjs"), "mcp"],
      cwd: process.cwd(),
      env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
      stderr: "pipe",
    });
    transport.stderr?.on("data", () => undefined);
    const client = new Client({
      name: "call-result-fields-acceptance",
      version: "1",
    });
    const analyze = toolContract("analyze_javascript_application");
    const trace = toolContract("trace_javascript_semantics");
    try {
      await client.connect(transport);
      const advertised = (await client.listTools()).tools;
      const ajv = new Ajv2020({ strict: false, validateFormats: false });
      const validators = new Map(
        [analyze.name, trace.name].map((name) => {
          const tool = advertised.find((item) => item.name === name);
          if (tool?.outputSchema === undefined)
            throw new Error(`Missing advertised schemas for ${name}`);
          const schema: Record<string, unknown> = tool.outputSchema;
          expect(ajv.validateSchema(tool.inputSchema)).toBe(true);
          expect(ajv.validateSchema(schema)).toBe(true);
          return [
            name,
            {
              input: ajv.compile(tool.inputSchema),
              output: ajv.compile(schema),
            },
          ] as const;
        }),
      );
      const analysisInput = { input_path: root, format: "directory" };
      expect(validators.get(analyze.name)?.input(analysisInput)).toBe(true);
      const produced = await client.callTool({
        name: analyze.name,
        arguments: analysisInput,
      });
      expect(produced.isError).not.toBe(true);
      expect(
        validators.get(analyze.name)?.output(produced.structuredContent),
      ).toBe(true);
      const parent = analyze.outputSchema.parse(produced.structuredContent);
      const parentText = produced.content.find(
        (block) => block.type === "text",
      );
      if (parentText?.type !== "text")
        throw new Error("Missing producer text Evidence");
      expect(JSON.parse(parentText.text)).toEqual(parent);
      const cliProduced = await cli.run({
        arguments: [
          "analyze-javascript-application",
          root,
          "--artifact-format",
          "directory",
          "--json",
        ],
      });
      expect(cliProduced.exitCode).toBe(0);
      expect(analyze.outputSchema.parse(cliProduced.json)).toEqual(parent);
      const graph = javascriptApplicationAnalysisResultSchema.parse(
        parent.normalized_result,
      ).semantic_graph;
      for (const [path, hasSource] of [
        ["known.js", true],
        ["escaped.js", false],
      ] as const) {
        const seed = graph.nodes.find(
          (node) =>
            node.kind === "binding" &&
            node.label === "output" &&
            node.identity.module_path === path,
        );
        if (seed === undefined)
          throw new Error(`Missing ${path} output binding`);
        const input = {
          application: parent,
          query: {
            seed: { kind: "semantic-node", node_id: seed.node_id },
            direction: "backward-provenance",
          },
        };
        expect(validators.get(trace.name)?.input(input)).toBe(true);
        const response = await client.callTool({
          name: trace.name,
          arguments: input,
        });
        expect(response.isError).not.toBe(true);
        expect(
          validators.get(trace.name)?.output(response.structuredContent),
        ).toBe(true);
        const evidence = trace.outputSchema.parse(response.structuredContent);
        const text = response.content.find((block) => block.type === "text");
        if (text?.type !== "text")
          throw new Error("Missing trace text Evidence");
        expect(JSON.parse(text.text)).toEqual(evidence);
        const result = javaScriptSemanticTraceResultSchema.parse(
          evidence.normalized_result,
        );
        expect(
          result.nodes.some(
            (node) =>
              node.kind === "literal" &&
              node.properties.value === "owned-value",
          ),
        ).toBe(hasSource);
        if (hasSource)
          expect(
            result.relations.some(
              (relation) =>
                relation.relation === "reads-property" &&
                relation.resolution === "resolved" &&
                typeof relation.properties.return_site_id === "string",
            ),
          ).toBe(true);
        const cliTrace = await cli.run({
          arguments: [
            "trace-javascript-semantics",
            JSON.stringify(input),
            "--json",
          ],
        });
        expect(cliTrace.exitCode).toBe(0);
        expect(trace.outputSchema.parse(cliTrace.json)).toEqual(evidence);
      }
      await client.ping();
    } finally {
      try {
        await client.close();
      } finally {
        await transport.close();
      }
    }
  },
  120_000,
);
