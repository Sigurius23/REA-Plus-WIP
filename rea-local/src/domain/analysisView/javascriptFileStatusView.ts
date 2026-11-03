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
  source_kind: "physical-file" | "html-document" | "html-inline-script";
  html_inline_scripts?: {
    total: number;
    omitted: number;
    unsupported: number;
    budget: number | null;
  };
  sha256: string | null;
  text_status: string | null;
  parse_status: string | null;
  syntax_parse_status: string;
  parse_error_count: number | null;
  static_facts_status: string;
  unresolved_static_occurrences: number | null;
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
const count = (value: JsonValue | undefined): number | null =>
  typeof value === "number" && Number.isSafeInteger(value) && value >= 0
    ? value
    : null;
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

type AddStatusIssue = (
  operation: string,
  message: string,
  limits?: Issue["limits"],
) => void;

const addSyntaxAndStaticIssues = (
  row: FileStatus,
  add: AddStatusIssue,
): void => {
  if (
    row.syntax_parse_status === "partial" ||
    row.syntax_parse_status === "failed"
  )
    add(
      "parse-javascript",
      `Recorded syntax parse status is ${row.syntax_parse_status}.`,
    );
  if (
    row.static_facts_status === "partial" ||
    (row.static_facts_status === "failed" &&
      row.syntax_parse_status !== "failed")
  )
    add(
      "analyze-static-facts",
      `Recorded static-fact coverage is ${row.static_facts_status}.${
        row.unresolved_static_occurrences === null
          ? " The unresolved-occurrence count is unknown."
          : ` ${String(row.unresolved_static_occurrences)} unresolved discovery occurrences were recorded.`
      }`,
    );
  if (
    row.syntax_parse_status === "not-recorded" &&
    (row.parse_status === "partial" || row.parse_status === "failed") &&
    !row.issues.some((issue) => issue.operation === "parse-javascript")
  )
    add(
      "analyze-static-facts",
      `Legacy aggregate parse_status is ${row.parse_status}; syntax and static-fact causes were not recorded separately.`,
    );
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
  addSyntaxAndStaticIssues(row, add);
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
    if (node.kind !== "javascript-asset" && node.kind !== "artifact") continue;
    for (const observation of node.observations) {
      if (
        observation.evidence.extractor.operation !==
          "inventory-relevant-file" &&
        observation.evidence.extractor.operation !== "derive-html-inline-source"
      )
        continue;
      const { properties } = observation;
      const html = object(properties.html_inline_sources);
      const isHtml =
        properties.file_kind === "html" &&
        html !== undefined &&
        (count(html.inline_script_count) ?? 0) > 0;
      if (node.kind !== "javascript-asset" && !isHtml) continue;
      const path = text(properties.path);
      if (path === null) continue;
      const digest = sha256(node, observation);
      const row: FileStatus = {
        node_id: node.node_id,
        observation_id: observation.observation_id,
        path,
        source_kind: isHtml
          ? "html-document"
          : observation.evidence.extractor.operation ===
              "derive-html-inline-source"
            ? "html-inline-script"
            : "physical-file",
        sha256: digest,
        text_status: text(properties.text_status),
        parse_status: text(properties.parse_status),
        syntax_parse_status: isHtml
          ? "not-applicable"
          : (text(properties.syntax_parse_status) ?? "not-recorded"),
        parse_error_count: count(properties.parse_error_count),
        static_facts_status: isHtml
          ? "not-applicable"
          : (text(properties.static_facts_status) ?? "not-recorded"),
        unresolved_static_occurrences: count(
          properties.unresolved_static_occurrences,
        ),
        module_ir_status: isHtml
          ? "not-applicable"
          : retention(properties.module_ir_status),
        module_ir_coverage: text(object(properties.module_ir_coverage)?.status),
        semantic_graph_status: isHtml
          ? "not-applicable"
          : retention(properties.semantic_graph_status),
        issues: [...(issues.get(fileKey(digest, path)) ?? [])],
      };
      if (isHtml && html !== undefined) {
        const omitted = count(html.omitted_inline_scripts) ?? 0;
        const budget = count(html.inline_script_budget);
        const unsupported = Array.isArray(html.inline_scripts)
          ? html.inline_scripts.filter(
              (script) => object(script)?.terminated === false,
            ).length
          : 0;
        row.html_inline_scripts = {
          total: count(html.inline_script_count) ?? 0,
          omitted,
          unsupported,
          budget,
        };
        if (omitted > 0)
          row.issues.push({
            operation: "admit-html-inline-scripts",
            code: "resource_constraint",
            message: `${String(omitted)} inline bodies were omitted by max_inline_scripts (${String(budget)}). Raise that policy to inspect them; unchanged limits reproduce the omission.`,
            limits:
              budget === null
                ? []
                : [
                    {
                      name: "javascript_inline_scripts",
                      value: budget,
                      unit: "items",
                    },
                  ],
            node_id: node.node_id,
            observation_id: observation.observation_id,
          });
        if (unsupported > 0)
          row.issues.push({
            operation: "parse-html-inline-script",
            code: null,
            message: `${String(unsupported)} unterminated inline JavaScript bodies are unsupported and were not analyzed.`,
            limits: [],
            node_id: node.node_id,
            observation_id: observation.observation_id,
          });
      } else addStatusIssues(row, properties);
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
  const physicalRows = rows.filter(
    (row) => row.source_kind !== "html-inline-script",
  );
  const inlineRows = rows.filter(
    (row) => row.source_kind === "html-inline-script",
  );
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
  const missingStaticMetadata = rows.filter(
    (row) =>
      row.syntax_parse_status === "not-recorded" ||
      row.static_facts_status === "not-recorded",
  ).length;
  return {
    kind: "page",
    view,
    items: page.map((row) => jsonValueSchema.parse(row)),
    file_status_summary: {
      files: physicalRows.length,
      files_with_issues: physicalRows.filter((row) => row.issues.length > 0)
        .length,
      files_without_retention_metadata: physicalRows.filter(
        (row) =>
          row.module_ir_status === "not-recorded" ||
          row.semantic_graph_status === "not-recorded",
      ).length,
      files_without_static_coverage_metadata: physicalRows.filter(
        (row) =>
          row.syntax_parse_status === "not-recorded" ||
          row.static_facts_status === "not-recorded",
      ).length,
      inline_scripts: inlineRows.length,
      inline_scripts_with_issues: inlineRows.filter(
        (row) => row.issues.length > 0,
      ).length,
      inline_scripts_without_retention_metadata: inlineRows.filter(
        (row) =>
          row.module_ir_status === "not-recorded" ||
          row.semantic_graph_status === "not-recorded",
      ).length,
      inline_scripts_without_static_coverage_metadata: inlineRows.filter(
        (row) =>
          row.syntax_parse_status === "not-recorded" ||
          row.static_facts_status === "not-recorded",
      ).length,
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
      "source_kind distinguishes physical-file, html-document and derived html-inline-script rows. HTML rows report admission/unsupported bodies; body IR and syntax statuses belong to separate logical sources. Summary files counts physical rows, while inline_scripts counts derived bodies.",
      "Parent limitations, raw static/semantic facts and captured diagnostics remain in the parent Evidence; they are not repeated in this compact view.",
      "The with-issues filter selects recorded failures or incomplete file coverage; an empty page does not establish complete analysis.",
      "parse_status is a legacy aggregate. Only explicit syntax_parse_status establishes the syntax outcome; absent syntax/static-fact metadata remains not-recorded.",
    ],
    unknowns: [
      ...(rows.length === 0
        ? [
            "No inventoried JavaScript file observations were recorded; file analysis coverage cannot be inferred.",
          ]
        : []),
      `Parent application coverage is ${analysis.graph.coverage.status}; semantic coverage is ${analysis.semantic_graph.coverage.status}.`,
      `${String(missingMetadata)} source units lack module-IR or semantic-projection retention metadata; their missing statuses are not recorded, not successful.`,
      `${String(missingStaticMetadata)} source units lack separate syntax or static-fact coverage metadata; legacy aggregate status does not identify a syntax failure.`,
    ],
  };
};
