import { expect, it } from "vitest";
import { javascriptFileStatusAnalysis } from "../../../tests/fixtures/javascriptFileStatusView.js";
import {
  analysisViewJavaScriptEvidence,
  analysisViewLayoutEvidence,
} from "../../../tests/fixtures/analysisView.js";
import {
  projectAnalysisView,
  inspectAnalysisViewInputSchema,
} from "./analysisView.js";

const view = (filter: "all" | "with-issues", offset = 0, limit = 20) => ({
  kind: "page" as const,
  collection: "file_statuses" as const,
  filter,
  offset,
  limit,
});
const project = (
  filter: "all" | "with-issues",
  offset = 0,
  limit = 20,
  analysis = javascriptFileStatusAnalysis(),
) => {
  const evidence = analysisViewJavaScriptEvidence(analysis);
  const result = projectAnalysisView(
    {
      evidenceId: evidence.evidence_id,
      operation: evidence.operation,
      normalizedResult: evidence.normalized_result,
      limitations: evidence.limitations,
    },
    view(filter, offset, limit),
  );
  if (!result.ok) throw result.error;
  if (result.value.kind !== "page") throw new Error("Expected file page");
  return result.value;
};

it("pages recorded issues with limits while omitting raw facts, captured output and parent prose", () => {
  const result = project("with-issues", 0, 1);
  expect(result).toMatchObject({
    kind: "page",
    coverage: { total: 3, examined: 1, next_offset: 1, exhausted: false },
    file_status_summary: {
      files: 7,
      files_with_issues: 3,
      files_without_retention_metadata: 2,
    },
    items: [
      {
        path: "blocked.js",
        module_ir_status: "not-retained",
        issues: [
          {
            code: "resource_constraint",
            limits: [
              { name: "max_semantic_source_bytes", value: 16, unit: "bytes" },
            ],
          },
        ],
      },
    ],
  });
  expect(JSON.stringify(result)).not.toContain("PRIVATE_");
  expect(JSON.stringify(result).length).toBeLessThan(6000);
  const empty = project("with-issues", 99, 1);
  expect(empty).toMatchObject({
    items: [],
    coverage: { total: 3, status: "empty", exhausted: true, next_offset: null },
  });
});

it("keeps byte-identical file aliases separate and does not transfer a path's failure to its alias", () => {
  const result = project("all", 0, 2);
  expect(result.items).toMatchObject([
    { path: "alias/blocked.js", issues: [] },
    { path: "blocked.js", issues: [{ code: "resource_constraint" }] },
  ]);
  const [alias, original] = result.items as {
    node_id: string;
    observation_id: string;
    sha256: string;
  }[];
  expect(alias?.node_id).toBe(original?.node_id);
  expect(alias?.sha256).toBe(original?.sha256);
  expect(alias?.observation_id).not.toBe(original?.observation_id);
});

it("distinguishes missing historical metadata, syntax failure and partial semantic projection", () => {
  const result = project("all");
  expect(result.items).toEqual(
    expect.arrayContaining([
      expect.objectContaining({
        path: "legacy.js",
        syntax_parse_status: "not-recorded",
        static_facts_status: "not-recorded",
        parse_error_count: null,
        unresolved_static_occurrences: null,
        module_ir_status: "not-recorded",
        semantic_graph_status: "not-recorded",
        issues: [],
      }),
      expect.objectContaining({
        path: "invalid.js",
        parse_status: "failed",
        issues: [expect.objectContaining({ operation: "parse-javascript" })],
      }),
      expect.objectContaining({
        path: "partial.js",
        module_ir_status: "retained",
        semantic_graph_status: "partial",
        issues: [
          expect.objectContaining({
            operation: "analyze-module-ir",
            limits: [
              {
                name: "javascript_semantic_expression_depth",
                value: 64,
                unit: "depth",
              },
            ],
          }),
          expect.objectContaining({
            operation: "project-semantic-graph",
            limits: [
              {
                name: "semantic_graph_file_node_budget",
                value: 7,
                unit: "items",
              },
            ],
          }),
        ],
      }),
    ]),
  );
  expect(project("all").view_digest).toBe(result.view_digest);
});

it("does not reinterpret a historical aggregate partial status as a syntax failure", () => {
  const result = project(
    "all",
    0,
    20,
    javascriptFileStatusAnalysis({ parse_status: "partial" }),
  );
  expect(result.items).toContainEqual(
    expect.objectContaining({
      path: "legacy.js",
      parse_status: "partial",
      syntax_parse_status: "not-recorded",
      static_facts_status: "not-recorded",
      unresolved_static_occurrences: null,
      issues: [
        expect.objectContaining({
          operation: "analyze-static-facts",
          message:
            "Legacy aggregate parse_status is partial; syntax and static-fact causes were not recorded separately.",
        }),
      ],
    }),
  );
});

it("validates collection-specific filters and rejects file pages for native layout parents", () => {
  const parent = analysisViewLayoutEvidence();
  const source = { kind: "retained-evidence", evidence_id: parent.evidence_id };
  expect(
    inspectAnalysisViewInputSchema.parse({
      source,
      view: { kind: "page", collection: "file_statuses", offset: 0, limit: 1 },
    }).view,
  ).toMatchObject({ filter: "with-issues" });
  expect(
    inspectAnalysisViewInputSchema.safeParse({
      source,
      view: { ...view("all"), collection: "modules" },
    }).success,
  ).toBe(false);
  const result = projectAnalysisView(
    {
      evidenceId: parent.evidence_id,
      operation: parent.operation,
      normalizedResult: parent.normalized_result,
      limitations: parent.limitations,
    },
    view("all"),
  );
  expect(result).toMatchObject({
    ok: false,
    error: { _tag: "AnalysisInputError" },
  });
});
