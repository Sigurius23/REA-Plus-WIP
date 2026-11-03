import { expect, it } from "vitest";
import { graphForJavaScript as graphFor } from "../../../tests/fixtures/javascriptSemanticGraph.js";
import { queryJavaScriptSemanticGraph } from "../../domain/javascript/javascriptSemanticQuery.js";
import { analyzeJavaScriptSemantics } from "../../domain/javascript/javascriptSemanticAnalysis.js";

it.each([
  "function known(){const input = {value:'known'}; return {output:input.value};}",
  "const known = () => {const input = {value:'known'}; return {output:input.value};};",
  "const input = {value:'known'}; const known = () => ({output:input.value});",
])(
  "connects known property reads to their returned own fields by default: %s",
  (source) => {
    const graph = graphFor(source);
    const input = graph.nodes.find(
      (n) => n.kind === "property-slot" && n.label === "value",
    );
    if (!input) throw new Error("Missing input slot");
    const result = queryJavaScriptSemanticGraph(graph, {
      seed: { kind: "semantic-node", node_id: input.node_id },
      direction: "forward-influence",
      expected: { role: "sink", classes: ["return-site"] },
    });
    expect(result.expected_match_node_ids).toHaveLength(1);
    expect(result.nodes).toContainEqual(
      expect.objectContaining({
        kind: "property-slot",
        label: "output",
        properties: expect.objectContaining({
          property_pointer: "/output",
          value_status: "literal",
        }),
      }),
    );
    expect(result.relations.every((r) => r.resolution === "resolved")).toBe(
      true,
    );
  },
);

it.each([
  "{output: input.value, output:'replacement'}",
  "{output: input.value, ...unknown}",
  "{output: input.value, [unknown]:'replacement'}",
  "{output: input.value, get output(){return 1}}",
  "{['output']: input.value}",
])("does not link a discarded or unsupported source to %s", (object) => {
  const graph = graphFor(
    `function known(){const input = {value:'known'}; return ${object};}`,
  );
  const read = graph.nodes.find((n) => n.label === "read:/value");
  const field = graph.nodes.find(
    (n) =>
      n.kind === "property-slot" && n.properties.return_site_id !== undefined,
  );
  expect(field).toBeDefined();
  expect(
    graph.relations.some(
      (r) =>
        r.source_node_id === read?.node_id &&
        r.target_node_id === field?.node_id,
    ),
  ).toBe(false);
});

it("preserves nested input paths and exact output JSON-pointer keys", () => {
  const graph = graphFor(
    "function known(){const input = {nested:{value:'known'}}; return {'a/b~c':input.nested.value};}",
  );
  const input = graph.nodes.find(
    (n) =>
      n.kind === "property-slot" &&
      n.properties.property_pointer === "/nested/value",
  );
  if (!input) throw new Error("Missing nested input slot");
  const result = queryJavaScriptSemanticGraph(graph, {
    seed: { kind: "semantic-node", node_id: input.node_id },
    direction: "forward-influence",
    expected: { role: "sink", classes: ["return-site"] },
  });
  expect(result.expected_match_node_ids).toHaveLength(1);
  expect(
    result.nodes.some(
      (n) =>
        n.properties.property_pointer === "/a~1b~0c" &&
        n.properties.return_site_id !== undefined,
    ),
  ).toBe(true);
});

it.each([
  "const input = {get value(){return 'secret'}};",
  "const input = {value:'known'}; input.value = change();",
  "const input = {value:'known'}; Object.setPrototypeOf(input, unknown);",
])("preserves unknown value/confidence for %s", (initializer) => {
  const graph = graphFor(
    `function known(){${initializer} return {output:input.value};}`,
  );
  const field = graph.nodes.find(
    (n) =>
      n.kind === "property-slot" && n.properties.return_site_id !== undefined,
  );
  expect(field?.properties.value_status).not.toBe("literal");
  expect(
    graph.relations.some(
      (r) =>
        r.target_node_id === field?.node_id &&
        r.relation === "defines" &&
        r.resolution === "resolved",
    ),
  ).toBe(false);
  expect(graph.unknowns.some((u) => u.node_id === field?.node_id)).toBe(true);
});

it("keeps candidate filtering and historical source semantics unchanged", () => {
  const source = "const result = input => ({output:input.value});";
  const ir = analyzeJavaScriptSemantics(source);
  const graph = graphFor(source, ir);
  const returned = graph.nodes.find((n) => n.kind === "return-site");
  if (!returned) throw new Error("Missing return");
  const query = queryJavaScriptSemanticGraph(graph, {
    seed: { kind: "semantic-node", node_id: returned.node_id },
    direction: "backward-provenance",
  });
  expect(query.relations.every((r) => r.resolution === "resolved")).toBe(true);
  expect(
    graph.relations.some(
      (r) =>
        r.target_node_id === returned.node_id &&
        r.relation === "aliases" &&
        r.resolution === "candidate",
    ),
  ).toBe(true);
  const legacy = {
    ...ir,
    callables: ir.callables.map((c) => ({
      ...c,
      returnSites: c.returnSites.map(
        ({ fieldSources: _fields, ...site }) => site,
      ),
    })),
  };
  const historical = graphFor(source, legacy);
  expect(
    historical.nodes.some((n) => n.properties.return_site_id !== undefined),
  ).toBe(false);
});
