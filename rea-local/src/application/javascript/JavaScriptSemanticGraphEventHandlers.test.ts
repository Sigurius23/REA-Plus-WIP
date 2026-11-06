import { expect, it } from "vitest";

import { graphForJavaScript as graphFor } from "../../../tests/fixtures/javascriptSemanticGraph.js";
import { analyzeJavaScriptSemantics } from "../../domain/javascript/javascriptSemanticAnalysis.js";
import { resolveJavaScriptSemanticEvidence } from "../../domain/javascript/javascriptSemanticGraph.js";
import { queryJavaScriptSemanticGraph } from "../../domain/javascript/javascriptSemanticQuery.js";

it("traces a listener to its named callback without claiming event execution", () => {
  const graph = graphFor(`
    import { EventEmitter } from 'node:events';
    const bus = new EventEmitter();
    function receive(value) { consume(value); }
    bus.on('owned-event', receive);
    bus.emit('owned-event', 'owned-value');
  `);
  const listener = graph.nodes.find(({ kind }) => kind === "listener");
  if (listener === undefined) throw new Error("Missing listener");
  const trace = queryJavaScriptSemanticGraph(graph, {
    seed: { kind: "semantic-node", node_id: listener.node_id },
    direction: "forward-influence",
  });
  expect(trace.nodes).toContainEqual(
    expect.objectContaining({ kind: "function", label: "receive" }),
  );
  const relation = trace.relations.find(
    ({ relation }) => relation === "binds-handler",
  );
  expect(relation).toMatchObject({
    resolution: "resolved",
    properties: { association: "local-callback-identity" },
  });
  if (relation === undefined) throw new Error("Missing callback association");
  expect(
    resolveJavaScriptSemanticEvidence(graph, relation.evidence),
  ).toMatchObject({
    authority: "static-relationship-inference",
    state: "inferred",
    limitations: [expect.stringContaining("does not prove runtime execution")],
  });
  expect(
    trace.nodes.some(({ properties }) => properties.value === "owned-value"),
  ).toBe(false);
});

it("separates exact Chrome/DOM callback identity from candidate registration", () => {
  const graph = graphFor(`
    function receive() {}
    chrome.tabs.onUpdated.addListener(receive);
    chrome.tabs.onUpdated.removeListener(receive);
    document.addEventListener('DOMContentLoaded', receive);
  `);
  expect(
    graph.relations.filter(({ relation }) => relation === "binds-handler"),
  ).toEqual([
    expect.objectContaining({
      resolution: "resolved",
      properties: expect.objectContaining({
        event_dispatch_resolution: "partial",
      }),
    }),
    expect.objectContaining({
      resolution: "resolved",
      properties: expect.objectContaining({
        event_dispatch_resolution: "partial",
      }),
    }),
  ]);
  expect(
    graph.relations
      .filter(({ relation }) => relation === "registers-listener")
      .every(({ resolution }) => resolution === "candidate"),
  ).toBe(true);
  expect(
    graph.nodes.filter(
      ({ kind, properties }) =>
        kind === "event" && properties.event_name === "chrome.tabs.onUpdated",
    ),
  ).toHaveLength(1);
  expect(
    graph.coverage.families.find(({ family }) => family === "event")?.status,
  ).toBe("partial");
});

it("records unresolved current callbacks without fabricating historical measurements", () => {
  const source = "bus.on('ready', external);";
  const ir = analyzeJavaScriptSemantics(source);
  const current = graphFor(source, ir);
  expect(current.unknowns).toContainEqual(
    expect.objectContaining({
      family: "event",
      relation_kinds: ["binds-handler"],
    }),
  );
  const legacy = graphFor(source, {
    ...ir,
    eventOperations: ir.eventOperations.map(
      ({ listenerTarget: _target, eventProfile: _profile, ...operation }) =>
        operation,
    ),
  });
  expect(
    legacy.unknowns.some(({ relation_kinds }) =>
      relation_kinds.includes("binds-handler"),
    ),
  ).toBe(false);
  expect(
    legacy.nodes.some(
      ({ properties }) =>
        "handler_resolution" in properties || "event_profile" in properties,
    ),
  ).toBe(false);
  expect(
    legacy.relations.some(({ relation }) => relation === "binds-handler"),
  ).toBe(false);
});
