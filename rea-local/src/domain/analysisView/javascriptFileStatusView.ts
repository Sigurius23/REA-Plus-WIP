import type { JsonValue } from "../jsonValue.js";
import { jsonValueSchema } from "../jsonValue.js";
import type { JavaScriptApplicationAnalysisResult } from "../javascript/javascriptApplicationAnalysis.js";
import {
  applicationCoverageSchema,
  type ApplicationCoverage,
} from "../javascript/javascriptApplicationEvidenceSchemas.js";
import type { ApplicationNode } from "../javascript/javascriptApplicationGraphSchemas.js";
import { compareUnicodeCodePoints } from "../unicodeCodePointOrder.js";
import { pageViewCoverage } from "./analysisViewCoverage.js";
import type {
  AnalysisViewParent,
  AnalysisViewRequest,
  UnsignedAnalysisView,
} from "./analysisView.js";

type FilePage = Extract<
  Extract<AnalysisViewRequest, { kind: "page" }>,
  { collection: "file_statuses" }
>;
type JsonObject = Record<string, JsonValue>;
type Issue = {
  operation: string;
  code: string | null;
  message: string | null;
  limits: ApplicationCoverage["limits"];
  node_id: string;
  observation_id: string;
};
type FileStatus = {
  node_id: string;
  observation_id: string;
  path: string;
  sha256: string | null;
  text_status: string | null;
  parse_status: string | null;
  module_ir_status: string;
  module_ir_coverage: string | null;
  semantic_graph_status: string;
  issues: Issue[];
};

const object = (value: JsonValue | undefined): JsonObject | undefined =>
  value !== null && typeof value === "object" && !Array.isArray(value)
    ? value
    : undefined;
const text = (value: JsonValue | undefined): string | null =>
  typeof value === "string" ? value : null;
const retention = (value: JsonValue | undefined): string =>
  value === "retained" || value === "not-retained" || value === "partial"
    ? value
    : "not-recorded";
const fileKey = (sha256: string | null, path: string): string =>
  JSON.stringify([sha256, path]);
type Observation = ApplicationNode["observations"][number];
const sha256 = (
  node: ApplicationNode,
  observation: Observation,
): string | null =>
  observation.evidence.artifact.available
    ? observation.evidence.artifact.sha256
    : node.identity.strategy === "content-digest"
      ? node.identity.sha256
      : null;

/** Index recorded operational failures, without copying their captured output. */
const fileIssues = (
  nodes: readonly ApplicationNode[],
): ReadonlyMap<string, Issue[]> => {
  const result = new Map<string, Issue[]>();
  for (const node of nodes) {
    if (node.kind !== "unknown") continue;
    for (const observation of node.observations) {
      const { properties, evidence } = observation;
      const path = text(properties.path);
      const operation = text(properties.operation);
      if (
        path === null ||
        operation === null ||
        ![
          "analyze-javascript-source",
          "parse-javascript",
          "project-javascript-application",
        ].includes(operation)
      )
        continue;
      const failure = object(properties.analysis_failure);
      const key = fileKey(sha256(node, observation), path);
      const entries = result.get(key) ?? [];
      entries.push({
        operation,
        code: text(failure?.code),
        message: text(failure?.message) ?? text(properties.limitation),
        limits: evidence.coverage.limits,
        node_id: node.node_id,
        observation_id: observation.observation_id,
      });
      result.set(key, entries);
    }
  }
  return result;
};

const addStatusIssues = (row: FileStatus, properties: JsonObject): void => {
  const add = (
    operation: string,
    message: string,
    limits: Issue["limits"] = [],
  ) => {
    if (row.issues.some((issue) => issue.operation === operation)) return;
    row.issues.push({
      operation,
      code: null,
      message,
      limits,
      node_id: row.node_id,
      observation_id: row.observation_id,
    });
  };
  if (row.text_status !== null && row.text_status !== "included")
    add("read-javascript-text", row.text_status);
  if (row.parse_status === "partial" || row.parse_status === "failed")
    add(
      "parse-javascript",
      `Recorded syntax parse status is ${row.parse_status}.`,
    );
  if (row.module_ir_status === "not-retained" && row.issues.length === 0)
    add(
      "retain-module-ir",
      "Module IR was not retained; no more specific reason was recorded.",
    );
  if (
    row.module_ir_coverage === "partial" ||
    row.module_ir_coverage === "failed"
  ) {
    const coverage = applicationCoverageSchema.safeParse({
      status: "partial",
      truncated: false,
      omitted_count: null,
      limits: object(properties.module_ir_coverage)?.limits ?? [],
    });
    add(
      "analyze-module-ir",
      `Recorded module IR coverage is ${row.module_ir_coverage}.`,
      coverage.success ? coverage.data.limits : [],
    );
  }
  if (row.semantic_graph_status === "partial") {
    const budget = properties.semantic_graph_node_budget;
    add(
      "project-semantic-graph",
      "The file's semantic graph projection was truncated.",
      typeof budget === "number" && Number.isSafeInteger(budget) && budget >= 0
        ? [
            {
              name: "semantic_graph_file_node_budget",
              value: budget,
              unit: "items",
            },
          ]
        : [],
    );
  } else if (
    row.semantic_graph_status === "not-retained" &&
    row.issues.length === 0
  )
    add(
      "project-semantic-graph",
      "The file's semantic graph projection was not retained.",
    );
};

const fileRows = (
  analysis: JavaScriptApplicationAnalysisResult,
): FileStatus[] => {
  const issues = fileIssues(analysis.graph.nodes);
  const rows: FileStatus[] = [];
  for (const node of analysis.graph.nodes) {
    if (node.kind !== "javascript-asset") continue;
    for (const observation of node.observations) {
      if (
        observation.evidence.extractor.operation !== "inventory-relevant-file"
      )
        continue;
      const { properties } = observation;
      const path = text(properties.path);
      if (path === null) continue;
      const digest = sha256(node, observation);
      const row: FileStatus = {
        node_id: node.node_id,
        observation_id: observation.observation_id,
        path,
        sha256: digest,
        text_status: text(properties.text_status),
        parse_status: text(properties.parse_status),
        module_ir_status: retention(properties.module_ir_status),
        module_ir_coverage: text(object(properties.module_ir_coverage)?.status),
        semantic_graph_status: retention(properties.semantic_graph_status),
        issues: [...(issues.get(fileKey(digest, path)) ?? [])],
      };
      addStatusIssues(row, properties);
      rows.push(row);
    }
  }
  return rows.sort(
    (a, b) =>
      compareUnicodeCodePoints(a.path, b.path) ||
      compareUnicodeCodePoints(a.observation_id, b.observation_id),
  );
};

/** Compact file diagnostics derived only from retained, source-bound observations. */
export const projectJavaScriptFileStatusPage = (
  parent: AnalysisViewParent,
  analysis: JavaScriptApplicationAnalysisResult,
  view: FilePage,
): UnsignedAnalysisView => {
  const rows = fileRows(analysis);
  const withIssues = rows.filter((row) => row.issues.length > 0);
  const selected = view.filter === "all" ? rows : withIssues;
  const page = selected.slice(view.offset, view.offset + view.limit);
  const missingMetadata = rows.filter(
    (row) =>
      row.module_ir_status === "not-recorded" ||
      row.semantic_graph_status === "not-recorded",
  ).length;
  const parentLimitations = new Set([
    ...parent.limitations,
    ...analysis.limitations,
    ...analysis.graph.limitations,
    ...analysis.semantic_graph.limitations,
  ]);
  return {
    kind: "page",
    view,
    items: page.map((row) => jsonValueSchema.parse(row)),
    file_status_summary: {
      files: rows.length,
      files_with_issues: withIssues.length,
      files_without_retention_metadata: missingMetadata,
      parent_limitation_count: parentLimitations.size,
    },
    coverage: pageViewCoverage(view.offset, page.length, selected.length),
    parent_evidence_id: parent.evidenceId,
    parent_operation: "analyze_javascript_application",
    parent_digest: parent.evidenceId.slice(3),
    artifact: {
      path: analysis.input_path,
      sha256: analysis.root_artifact_sha256,
    },
    limitations: [
      "This page projects recorded JavaScript file observations; no source was read or analyzed again.",
      "Parent limitations, raw static/semantic facts and captured diagnostics remain in the parent Evidence; they are not repeated in this compact view.",
      "The with-issues filter selects recorded failures or incomplete file coverage; an empty page does not establish complete analysis.",
    ],
    unknowns: [
      ...(rows.length === 0
        ? [
            "No inventoried JavaScript file observations were recorded; file analysis coverage cannot be inferred.",
          ]
        : []),
      `Parent application coverage is ${analysis.graph.coverage.status}; semantic coverage is ${analysis.semantic_graph.coverage.status}.`,
      `${String(missingMetadata)} files lack module-IR or semantic-projection retention metadata; their missing statuses are not recorded, not successful.`,
    ],
  };
};
