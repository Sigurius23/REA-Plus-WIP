import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { createHash } from "node:crypto";
import { writeFile } from "node:fs/promises";
import { join, resolve } from "node:path";
import { expect } from "vitest";

import { toolContract } from "../../../src/contracts/toolContracts.js";
import { javascriptApplicationAnalysisResultSchema } from "../../../src/domain/javascript/javascriptApplicationAnalysis.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest } from "../../support/cli/cliFixture.js";

cliTest(
  "retains actual syntax success and unresolved static facts through compiled CLI and MCP file views",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-static-coverage-");
    const source =
      "export function check(sender) { return sender.id !== expected; }";
    await writeFile(join(root, "dynamic.js"), source);
    await writeFile(join(root, "healthy.js"), "export const observed = 7;");
    const analyzed = await cli.run({
      arguments: ["analyze-javascript-application", root, "--json"],
      timeoutMs: 60_000,
    });
    expect(analyzed.exitCode).toBe(0);
    const cliParent = toolContract(
      "analyze_javascript_application",
    ).outputSchema.parse(analyzed.json);
    const result = javascriptApplicationAnalysisResultSchema.parse(
      cliParent.normalized_result,
    );
    expect(result.statistics.parse_failures).toBe(0);
    expect(result.graph.coverage.status).toBe("partial");
    const sender = result.graph.nodes
      .flatMap(({ observations }) => observations)
      .find(
        ({ properties }) =>
          properties.fact_kind === "sender-validation-candidate",
      );
    expect(sender?.evidence.coverage.status).toBe("partial");

    const client = new Client({ name: "static-coverage-e2e", version: "1" });
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [resolve("scripts/rea.mjs"), "mcp"],
      cwd: process.cwd(),
      env: { PATH: process.env.PATH ?? "" },
      stderr: "pipe",
    });
    transport.stderr?.on("data", () => undefined);
    try {
      await client.connect(transport);
      const response = await client.callTool({
        name: "analyze_javascript_application",
        arguments: { input_path: root },
      });
      expect(response.isError).not.toBe(true);
      const parent = toolContract(
        "analyze_javascript_application",
      ).outputSchema.parse(response.structuredContent);
      expect(parent.evidence_id).toBe(cliParent.evidence_id);

      // Both readers must project the recorded analysis, not parse these changed bytes.
      await writeFile(join(root, "dynamic.js"), "This source no longer parses");
      const view = {
        kind: "page",
        collection: "file_statuses",
        filter: "with-issues",
        offset: 0,
        limit: 10,
      };
      const expected = {
        file_status_summary: {
          files: 2,
          files_with_issues: 1,
          files_without_static_coverage_metadata: 0,
        },
        coverage: { total: 1, exhausted: true },
        items: [
          {
            path: "dynamic.js",
            sha256: createHash("sha256").update(source).digest("hex"),
            parse_status: "partial",
            syntax_parse_status: "complete",
            parse_error_count: 0,
            static_facts_status: "partial",
            unresolved_static_occurrences: 1,
            module_ir_status: "retained",
            module_ir_coverage: "complete",
            semantic_graph_status: "retained",
            issues: [
              expect.objectContaining({ operation: "analyze-static-facts" }),
            ],
          },
        ],
      };
      const page = await client.callTool({
        name: "inspect_analysis_view",
        arguments: {
          source: {
            kind: "retained-evidence",
            evidence_id: parent.evidence_id,
          },
          view,
        },
      });
      expect(page.isError).not.toBe(true);
      const pageEvidence = toolContract(
        "inspect_analysis_view",
      ).outputSchema.parse(page.structuredContent);
      expect(pageEvidence.normalized_result).toMatchObject(expected);

      const input = join(root, "view.json");
      await writeFile(
        input,
        JSON.stringify({
          source: { kind: "inline", evidence: cliParent },
          view,
        }),
      );
      const saved = await cli.run({
        arguments: ["inspect-analysis-view", input, "--json"],
      });
      expect(saved.exitCode).toBe(0);
      expect(saved.json).toMatchObject({ normalized_result: expected });
      await client.ping();
    } finally {
      await client.close();
      await transport.close();
    }
  },
  120_000,
);
