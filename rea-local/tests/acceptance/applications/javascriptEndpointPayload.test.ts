import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { createHash } from "node:crypto";
import { mkdir, writeFile } from "node:fs/promises";
import { join, resolve } from "node:path";
import { expect } from "vitest";

import { toolContract } from "../../../src/contracts/toolContracts.js";
import { javascriptApplicationAnalysisResultSchema } from "../../../src/domain/javascript/javascriptApplicationAnalysis.js";
import { applicationVersionComparisonResultSchema } from "../../../src/domain/javascript/javascriptApplicationVersionComparisonSchemas.js";
import { applicationFeatureTraceResultSchema } from "../../../src/domain/javascript/javascriptFeatureTraceSchemas.js";
import { javaScriptSemanticTraceResultSchema } from "../../../src/domain/javascript/javascriptSemanticTraceSchemas.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { connectLocalToolsMcp } from "../../fixtures/localToolsMcp.js";
import { cliTest } from "../../support/cli/cliFixture.js";

cliTest(
  "keeps full endpoint evidence usable without copying large values into metadata",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-endpoint-payload-");
    const endpoint = `https://example.invalid/${"part/ğ".repeat(160_000)}`;
    const digestLookalike = `value-sha256:${createHash("sha256").update(JSON.stringify(endpoint)).digest("hex")}`;
    // UTF-8 replacement would conflate these distinct JavaScript strings.
    const surrogate = "\ud800".repeat(100);
    const replacement = "\ufffd".repeat(100);
    const values = [
      endpoint,
      digestLookalike,
      "/ok",
      "/ok",
      surrogate,
      replacement,
    ];
    const source = values
      .map((value) => `fetch(${JSON.stringify(value)});`)
      .join("\n");
    const sourcePath = join(root, "main.js");
    await writeFile(sourcePath, source);
    const cliResponse = await cli.run({
      arguments: [
        "analyze-javascript-application",
        root,
        "--artifact-format",
        "directory",
        "--json",
      ],
      timeoutMs: 60_000,
    });
    expect(cliResponse.exitCode).toBe(0);
    const cliEvidence = toolContract(
      "analyze_javascript_application",
    ).outputSchema.parse(cliResponse.json);

    const client = new Client({ name: "endpoint-payload-e2e", version: "1" });
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
        arguments: { input_path: root, format: "directory" },
      });
      expect(response.isError).not.toBe(true);
      const evidence = toolContract(
        "analyze_javascript_application",
      ).outputSchema.parse(response.structuredContent);
      expect(evidence.evidence_id).toBe(cliEvidence.evidence_id);
      const text = response.content.find((item) => item.type === "text");
      if (text?.type !== "text") throw new Error("Missing MCP text result");
      const textEvidence = toolContract(
        "analyze_javascript_application",
      ).outputSchema.parse(JSON.parse(text.text));
      expect(textEvidence.evidence_id).toBe(evidence.evidence_id);
      const result = javascriptApplicationAnalysisResultSchema.parse(
        evidence.normalized_result,
      );
      const endpoints = result.graph.nodes.filter(
        (node) => node.kind === "endpoint",
      );
      const nodeFor = (value: string) => {
        const node = endpoints.find((candidate) =>
          candidate.observations.some(
            ({ properties }) => properties.value === value,
          ),
        );
        if (node === undefined) throw new Error("Complete endpoint was lost");
        return node;
      };
      const endpointNode = nodeFor(endpoint);
      expect(
        new Set(
          [endpoint, digestLookalike, surrogate, replacement].map(
            (value) => nodeFor(value).node_id,
          ),
        ).size,
      ).toBe(4);
      const repeatedNode = nodeFor("/ok");
      expect(
        endpoints.filter((node) =>
          node.observations.some(
            ({ properties }) => properties.value === "/ok",
          ),
        ),
      ).toHaveLength(1);
      expect(repeatedNode.observations).toHaveLength(2);
      expect(repeatedNode.identity).toMatchObject({ key: "/ok" });
      expect(
        repeatedNode.observations.every(({ label }) => label === "/ok"),
      ).toBe(true);
      expect(endpointNode.identity).toMatchObject({
        artifact_sha256: createHash("sha256").update(source).digest("hex"),
      });
      expect(endpointNode.observations[0]?.evidence.location).toMatchObject({
        available: true,
        value: { kind: "source-range", source: "main.js" },
      });
      const requests = result.semantic_graph.nodes.filter(
        (node) =>
          node.kind === "request" && node.properties.endpoint === endpoint,
      );
      expect(requests).toHaveLength(1);

      await verifyEndpointWorkflows({
        client,
        evidenceId: evidence.evidence_id,
        endpoint,
        endpointNodeId: endpointNode.node_id,
        requestNodeIds: requests.map(({ node_id }) => node_id),
        root,
        source,
        sourcePath,
      });
      await client.ping();
    } finally {
      await client.close();
      await transport.close();
    }
  },
  120_000,
);

cliTest(
  "keeps browser storage, sender checks and page roles distinct from network and Electron authority",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-endpoint-receivers-");
    const app = join(root, "app");
    await mkdir(app);
    await writeFile(
      join(app, "main.js"),
      `
    import axios from 'axios';
    chrome.storage.local.get('https://example.invalid/stored-key');
    const local = chrome.storage.local;
    local.get('/users');
    const {session} = browser.storage;
    session.get('profileId');
    fetch('/known');
    axios.get('/imported');
    api.get('users');
    chrome.runtime.onMessage.addListener((message, sender) => sender.id === 'extension-id');
    function unrelated(event) { return event.sender.id === 'generic'; }
  `,
    );
    await writeFile(
      join(app, "popup.html"),
      '<script src="./main.js"></script>',
    );
    const response = await cli.run({
      arguments: ["analyze-javascript-application", app, "--json"],
      timeoutMs: 60_000,
    });
    expect(response.exitCode).toBe(0);
    const evidence = toolContract(
      "analyze_javascript_application",
    ).outputSchema.parse(response.json);
    const result = javascriptApplicationAnalysisResultSchema.parse(
      evidence.normalized_result,
    );
    expect(
      result.graph.nodes.filter((node) => node.kind === "web-document"),
    ).toHaveLength(1);
    expect(
      result.graph.nodes.filter((node) => node.kind === "electron-renderer"),
    ).toEqual([]);
    expect(result.summary.sender_validation_observations).toBe(0);
    expect(
      result.graph.nodes
        .flatMap((node) => node.observations)
        .filter((o) => o.properties.fact_kind === "sender-validation-candidate")
        .map((o) => o.properties),
    ).toEqual(
      expect.arrayContaining([
        expect.objectContaining({
          transport: "browser-extension",
          expected: expect.objectContaining({ value: "extension-id" }),
          enforcement: "unknown",
        }),
        expect.objectContaining({
          transport: "unknown",
          expected: expect.objectContaining({ value: "generic" }),
          enforcement: "unknown",
        }),
      ]),
    );
    const endpoints = result.graph.nodes
      .filter((node) => node.kind === "endpoint")
      .flatMap((node) => node.observations);
    expect(endpoints.map((o) => o.properties.value).sort()).toEqual([
      "/imported",
      "/known",
      "users",
    ]);
    expect(endpoints.find((o) => o.properties.value === "users")).toMatchObject(
      {
        properties: { network_receiver: { status: "unknown", identity: null } },
        evidence: { state: "inferred", confidence: "low" },
      },
    );
    const storage = result.graph.nodes
      .filter((node) => node.kind === "storage")
      .flatMap((node) => node.observations.map((o) => o.properties));
    expect(storage).toEqual(
      expect.arrayContaining([
        expect.objectContaining({
          storage_kind: "extension-storage",
          area: "local",
          name: "https://example.invalid/stored-key",
          api: "chrome.storage.local",
        }),
        expect.objectContaining({
          storage_kind: "extension-storage",
          area: "local",
          name: "/users",
        }),
        expect.objectContaining({
          storage_kind: "extension-storage",
          area: "session",
          name: "profileId",
        }),
      ]),
    );
    const input = join(root, "view.json");
    await writeFile(
      input,
      JSON.stringify({
        source: { kind: "inline", evidence },
        view: { kind: "page", collection: "endpoints", offset: 0, limit: 16 },
      }),
    );
    const viewResponse = await cli.run({
      arguments: ["inspect-analysis-view", input, "--json"],
      timeoutMs: 60_000,
    });
    expect(viewResponse.exitCode).toBe(0);
    const view = toolContract("inspect_analysis_view").outputSchema.parse(
      viewResponse.json,
    );
    expect(view.normalized_result).toMatchObject({
      items: expect.arrayContaining([
        expect.objectContaining({
          template: "users",
          network_receiver: { status: "unknown", identity: null },
        }),
        expect.objectContaining({
          template: "/known",
          network_receiver: { status: "recognized-network", identity: "fetch" },
        }),
        expect.objectContaining({
          template: "/imported",
          network_receiver: { status: "recognized-network", identity: "axios" },
        }),
      ]),
    });
  },
  120_000,
);

cliTest.for(["CLI", "stdio MCP"] as const)(
  "keeps chained call receiver ownership exact through %s",
  async (surface, { cli }) => {
    const root = await createTestTempDirectory("rea-receiver-call-identity-");
    await writeFile(
      join(root, "app.js"),
      `
      import axios from 'axios';
      const local = chrome.storage.local;
      local.get('alpha').then(value => value);
      const {session} = browser.storage;
      session?.get('beta')?.then(value => value).catch(() => {});
      chrome.storage.local.get('gamma').get('/outer-storage');
      new Map().get('map-key')?.get('/outer-keyed');
      axios.get('/inner-network').get('/outer-network');
      `,
    );
    let document: unknown;
    if (surface === "CLI") {
      const response = await cli.run({
        arguments: ["analyze-javascript-application", root, "--json"],
      });
      expect(response.exitCode, response.stderr).toBe(0);
      document = response.json;
    } else {
      const { call } = await connectLocalToolsMcp();
      const response = await call("analyze_javascript_application", {
        input_path: root,
      });
      expect(response.isError, JSON.stringify(response)).not.toBe(true);
      document = response.structuredContent;
    }
    const evidence = toolContract(
      "analyze_javascript_application",
    ).outputSchema.parse(document);
    const { graph } = javascriptApplicationAnalysisResultSchema.parse(
      evidence.normalized_result,
    );
    const storage = graph.nodes
      .filter(({ kind }) => kind === "storage")
      .flatMap(({ observations }) =>
        observations.map(({ properties }) => properties),
      );
    expect(storage).toHaveLength(3);
    expect(storage.map(({ name }) => name).sort()).toEqual([
      "alpha",
      "beta",
      "gamma",
    ]);
    expect(
      storage.every(
        ({ mechanism }) =>
          typeof mechanism === "string" && mechanism.endsWith(".get"),
      ),
    ).toBe(true);
    const endpoints = graph.nodes
      .filter(({ kind }) => kind === "endpoint")
      .flatMap(({ observations }) => observations);
    expect(endpoints.map(({ properties }) => properties.value).sort()).toEqual([
      "/inner-network",
      "/outer-keyed",
      "/outer-network",
      "/outer-storage",
    ]);
    expect(
      endpoints.find(({ properties }) => properties.value === "/inner-network"),
    ).toMatchObject({
      properties: {
        network_receiver: { status: "recognized-network", identity: "axios" },
      },
    });
    for (const observation of endpoints.filter(
      ({ properties }) => properties.value !== "/inner-network",
    ))
      expect(observation).toMatchObject({
        properties: { network_receiver: { status: "unknown", identity: null } },
        evidence: { state: "inferred", confidence: "low" },
      });
  },
);

interface EndpointWorkflowInput {
  readonly client: Client;
  readonly evidenceId: string;
  readonly endpoint: string;
  readonly endpointNodeId: string;
  readonly requestNodeIds: readonly string[];
  readonly root: string;
  readonly source: string;
  readonly sourcePath: string;
}

const verifyEndpointWorkflows = async ({
  client,
  evidenceId,
  endpoint,
  endpointNodeId,
  requestNodeIds,
  root,
  source,
  sourcePath,
}: EndpointWorkflowInput): Promise<void> => {
  const application = {
    kind: "retained-evidence",
    evidence_id: evidenceId,
  };
  const featureResponse = await client.callTool({
    name: "trace_application_feature",
    arguments: {
      application,
      seed: {
        kind: "string",
        value: endpoint,
        match: "exact",
        case_sensitive: true,
      },
    },
  });
  expect(featureResponse.isError).not.toBe(true);
  const featureEvidence = toolContract(
    "trace_application_feature",
  ).outputSchema.parse(featureResponse.structuredContent);
  const feature = applicationFeatureTraceResultSchema.parse(
    featureEvidence.normalized_result,
  );
  expect(feature.seed_matches.map(({ node_id }) => node_id)).toContain(
    endpointNodeId,
  );

  const traceResponse = await client.callTool({
    name: "trace_javascript_semantics",
    arguments: {
      application,
      query: {
        seed: { kind: "endpoint", value: endpoint },
        direction: "backward-provenance",
      },
    },
  });
  expect(traceResponse.isError).not.toBe(true);
  const traceEvidence = toolContract(
    "trace_javascript_semantics",
  ).outputSchema.parse(traceResponse.structuredContent);
  const trace = javaScriptSemanticTraceResultSchema.parse(
    traceEvidence.normalized_result,
  );
  expect(trace.seed_node_ids).toEqual(requestNodeIds);
  expect(
    trace.nodes.some((node) => node.properties.endpoint === endpoint),
  ).toBe(true);

  await writeFile(sourcePath, `// next artifact version\n${source}`);
  const nextResponse = await client.callTool({
    name: "analyze_javascript_application",
    arguments: { input_path: root, format: "directory" },
  });
  expect(nextResponse.isError).not.toBe(true);
  const nextEvidence = toolContract(
    "analyze_javascript_application",
  ).outputSchema.parse(nextResponse.structuredContent);
  const next = javascriptApplicationAnalysisResultSchema.parse(
    nextEvidence.normalized_result,
  );
  const nextEndpoint = next.graph.nodes.find(
    (node) =>
      node.kind === "endpoint" &&
      node.observations.some(({ properties }) => properties.value === endpoint),
  );
  if (nextEndpoint === undefined) throw new Error("Next endpoint was lost");
  const comparisonResponse = await client.callTool({
    name: "compare_application_versions",
    arguments: {
      left: application,
      right: {
        kind: "retained-evidence",
        evidence_id: nextEvidence.evidence_id,
      },
    },
  });
  expect(comparisonResponse.isError).not.toBe(true);
  const comparisonEvidence = toolContract(
    "compare_application_versions",
  ).outputSchema.parse(comparisonResponse.structuredContent);
  const comparison = applicationVersionComparisonResultSchema.parse(
    comparisonEvidence.normalized_result,
  );
  expect(comparison.items).toContainEqual(
    expect.objectContaining({
      node_kind: "endpoint",
      left_node_id: endpointNodeId,
      right_node_id: nextEndpoint.node_id,
      match: expect.objectContaining({
        status: "matched",
        basis: "semantic-key",
      }),
    }),
  );
};
