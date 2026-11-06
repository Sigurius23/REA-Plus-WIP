import { writeFile } from "node:fs/promises";
import { join } from "node:path";
import { expect } from "vitest";

import { toolContract } from "../../../src/contracts/toolContracts.js";
import { javascriptApplicationAnalysisResultSchema } from "../../../src/domain/javascript/javascriptApplicationAnalysis.js";
import { javaScriptSemanticTraceResultSchema } from "../../../src/domain/javascript/javascriptSemanticTraceSchemas.js";
import { connectLocalToolsMcp } from "../../fixtures/localToolsMcp.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest } from "../../support/cli/cliFixture.js";

cliTest(
  "retains local event callbacks through public CLI/MCP Evidence while dispatch and unsupported handlers stay unknown",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-event-handlers-");
    const scenarios = {
      "emitter.js":
        "import {EventEmitter} from 'node:events'; const bus=new EventEmitter(); function receive(value){consume(value);} bus.on('owned-event',receive); bus.emit('owned-event','owned-value');",
      "chrome.js":
        "chrome.tabs.onUpdated.addListener((tabId,status,tab)=>consume(tabId,status,tab));",
      "dom.js":
        "function receive(event){consume(event);} document.addEventListener('DOMContentLoaded',receive);",
      "changed.js":
        "let receive=()=>{}; receive=unknown; bus.on('owned-event',receive);",
    };
    for (const [path, source] of Object.entries(scenarios))
      await writeFile(join(root, path), source);
    const mcp = await connectLocalToolsMcp();
    const analyze = toolContract("analyze_javascript_application");
    const trace = toolContract("trace_javascript_semantics");
    const analysisResponse = await mcp.call(analyze.name, {
      input_path: root,
      format: "directory",
    });
    expect(analysisResponse.isError).not.toBe(true);
    const parent = analyze.outputSchema.parse(
      analysisResponse.structuredContent,
    );
    const parentText = analysisResponse.content.find(
      ({ type }) => type === "text",
    );
    if (parentText?.type !== "text")
      throw new Error("Missing producer text Evidence");
    expect(JSON.parse(parentText.text)).toEqual(parent);
    const cliParent = await cli.run({
      arguments: [
        "analyze-javascript-application",
        root,
        "--artifact-format",
        "directory",
        "--json",
      ],
    });
    expect(cliParent.exitCode).toBe(0);
    expect(analyze.outputSchema.parse(cliParent.json)).toEqual(parent);
    const graph = javascriptApplicationAnalysisResultSchema.parse(
      parent.normalized_result,
    ).semantic_graph;
    for (const path of Object.keys(scenarios)) {
      const listener = graph.nodes.find(
        (node) =>
          node.kind === "listener" && node.identity.module_path === path,
      );
      if (listener === undefined) throw new Error(`Missing ${path} listener`);
      const input = {
        application: parent,
        query: {
          seed: { kind: "semantic-node", node_id: listener.node_id },
          direction: "forward-influence",
          allowed_relations: ["binds-handler"],
        },
      };
      const response = await mcp.call(trace.name, input);
      expect(response.isError).not.toBe(true);
      const evidence = trace.outputSchema.parse(response.structuredContent);
      const text = response.content.find(({ type }) => type === "text");
      if (text?.type !== "text") throw new Error("Missing trace text Evidence");
      expect(JSON.parse(text.text)).toEqual(evidence);
      const result = javaScriptSemanticTraceResultSchema.parse(
        evidence.normalized_result,
      );
      const known = path !== "changed.js";
      expect(result.nodes.some(({ kind }) => kind === "function")).toBe(known);
      expect(
        result.relations.filter(({ relation }) => relation === "binds-handler"),
      ).toHaveLength(known ? 1 : 0);
      expect(
        result.nodes.some(
          ({ properties }) => properties.value === "owned-value",
        ),
      ).toBe(false);
      if (!known)
        expect(result.unknowns).toContainEqual(
          expect.objectContaining({ relation_kinds: ["binds-handler"] }),
        );
      if (path === "chrome.js" || path === "dom.js") {
        expect(result.relations[0]?.properties.event_dispatch_resolution).toBe(
          "partial",
        );
        expect(
          graph.relations.some(
            ({ relation, target_node_id, resolution }) =>
              relation === "registers-listener" &&
              target_node_id === listener.node_id &&
              resolution === "candidate",
          ),
        ).toBe(true);
      }
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
    await mcp.client.ping();
  },
  120_000,
);
