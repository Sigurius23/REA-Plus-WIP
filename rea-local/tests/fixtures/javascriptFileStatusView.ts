import type { JsonValue } from "../../src/domain/jsonValue.js";
import {
  createJavaScriptApplicationGraph,
  createJavaScriptApplicationNode,
} from "../../src/domain/javascript/javascriptApplicationGraph.js";
import {
  analysisViewBindJavaScriptGraphs,
  analysisViewJavaScriptAnalysis,
} from "./analysisView.js";

const failedSyntax: Record<string, JsonValue> = {
  parse_status: "failed",
  syntax_parse_status: "failed",
  parse_error_count: 1,
  static_facts_status: "failed",
  unresolved_static_occurrences: null,
  module_ir_status: "not-retained",
  semantic_graph_status: "not-retained",
};

/** Recorded aliases, failures, partial projections and missing historical metadata. */
export const javascriptFileStatusAnalysis = (
  legacyProperties: Record<string, JsonValue> = {},
) => {
  const base = analysisViewJavaScriptAnalysis();
  const evidence = base.graph.nodes[0]?.observations[0]?.evidence;
  if (evidence === undefined) throw new Error("Missing view fixture evidence");
  const observed = (
    path: string,
    digest: string,
    properties: Record<string, JsonValue> = {},
  ) => ({
    label: path,
    properties: {
      path,
      text_status: "included",
      parse_status: "complete",
      module_ir_status: "retained",
      module_ir_coverage: { status: "complete", limits: [] },
      semantic_graph_status: "retained",
      ...properties,
    },
    evidence: {
      ...evidence,
      artifact: {
        available: true as const,
        artifact_id: `art_${digest}`,
        sha256: digest,
      },
      location: {
        available: true as const,
        value: { kind: "artifact-path" as const, path },
      },
    },
  });
  const asset = (
    path: string,
    character: string,
    properties: Record<string, JsonValue> = {},
  ) => {
    const digest = character.repeat(64);
    return createJavaScriptApplicationNode({
      kind: "javascript-asset",
      identity: {
        strategy: "content-digest",
        stability: "global-exact",
        sha256: digest,
      },
      observations: [observed(path, digest, properties)],
    });
  };
  const digest = "b".repeat(64);
  const aliases = createJavaScriptApplicationNode({
    kind: "javascript-asset",
    identity: {
      strategy: "content-digest",
      stability: "global-exact",
      sha256: digest,
    },
    observations: [
      observed("blocked.js", digest, {
        module_ir_status: "not-retained",
        semantic_graph_status: "not-retained",
        static_analysis: { source: "PRIVATE_STATIC_SENTINEL".repeat(1000) },
      }),
      observed("alias/blocked.js", digest),
    ],
  });
  const failure = createJavaScriptApplicationNode({
    kind: "unknown",
    identity: {
      strategy: "artifact-local-key",
      stability: "artifact-version",
      artifact_sha256: digest,
      namespace: "static-parse-scope",
      key: "analyze-javascript-source:blocked.js",
    },
    observations: [
      {
        label: "blocked.js parse scope",
        properties: {
          path: "blocked.js",
          operation: "analyze-javascript-source",
          analysis_failure: {
            code: "resource_constraint",
            message: "Source byte limit exceeded",
            captured_output: "PRIVATE_CAPTURE_SENTINEL",
          },
        },
        evidence: {
          ...observed("blocked.js", digest).evidence,
          limitations: ["Source byte limit exceeded"],
          coverage: {
            status: "partial",
            truncated: false,
            omitted_count: null,
            limits: [
              { name: "max_semantic_source_bytes", value: 16, unit: "bytes" },
            ],
          },
        },
      },
    ],
  });
  const nodes = [
    ...base.graph.nodes,
    aliases,
    failure,
    asset("healthy.js", "c"),
    asset("legacy.js", "d", {
      module_ir_status: null,
      module_ir_coverage: null,
      semantic_graph_status: null,
      ...legacyProperties,
    }),
    asset("invalid.js", "e", failedSyntax),
    asset("partial.js", "f", {
      module_ir_coverage: {
        status: "partial",
        limits: [
          {
            name: "javascript_semantic_expression_depth",
            value: 64,
            unit: "depth",
          },
        ],
      },
      semantic_graph_status: "partial",
      semantic_graph_node_budget: 7,
    }),
  ];
  const { graph_id: _graphId, ...graphInput } = base.graph;
  const graph = createJavaScriptApplicationGraph({
    ...graphInput,
    nodes,
    edges: [],
    coverage: {
      status: "partial",
      truncated: false,
      omitted_count: null,
      limits: [],
    },
    limitations: ["PRIVATE_LIMITATION_SENTINEL".repeat(1000)],
  });
  return analysisViewBindJavaScriptGraphs(
    { ...base, limitations: ["PRIVATE_PARENT_SENTINEL".repeat(1000)] },
    graph,
  );
};
