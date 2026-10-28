import { expect, it } from "vitest";
import { analyzeJavaScriptStaticSource } from "../javascript/javascriptStaticAnalysis.js";
import { javascriptEndpointItems } from "./javascriptEndpointView.js";
import { analysisViewJavaScriptAnalysis } from "../../../tests/fixtures/analysisView.js";
import { createJavaScriptApplicationNode } from "../javascript/javascriptApplicationGraph.js";

it("retains exact expressions through aliases and materializes explicit choices without changing the template", () => {
  const analysis = analyzeJavaScriptStaticSource(
    "const url = `${process.env.API}/items/${id}`; const alias = url; fetch(alias);",
  );
  const endpoint = analysis.endpoints[0];
  expect(endpoint).toMatchObject({
    value: "{}/items/{}",
    template_parts: [
      { text: "" },
      { expression: "process.env.API" },
      { text: "/items/" },
      { expression: "id" },
      { text: "" },
    ],
  });
  const evidence =
    analysisViewJavaScriptAnalysis().graph.nodes[0]?.observations[0]?.evidence;
  if (evidence === undefined || endpoint === undefined)
    throw new Error("Missing fixture");
  const node = createJavaScriptApplicationNode({
    kind: "endpoint",
    identity: {
      strategy: "artifact-local-key",
      stability: "artifact-version",
      artifact_sha256: "a".repeat(64),
      namespace: "endpoint",
      key: "url",
    },
    observations: [
      {
        label: "URL",
        properties: {
          value: endpoint.value,
          template_parts: endpoint.template_parts ?? [],
        },
        evidence,
      },
    ],
  });
  expect(
    javascriptEndpointItems([node], {
      "process.env.API": "https://fixture.invalid",
      id: "0",
    }),
  ).toMatchObject([
    {
      template: "{}/items/{}",
      materialized_value: "https://fixture.invalid/items/0",
      materialization_status: "complete",
    },
  ]);
  expect(
    javascriptEndpointItems([node], {
      "process.env.API": "https://fixture.invalid",
    }),
  ).toMatchObject([
    { materialized_value: null, unresolved_expressions: ["id"] },
  ]);
  expect(endpoint.value).toBe("{}/items/{}");
});
