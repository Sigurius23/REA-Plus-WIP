import { expect, it } from "vitest";
import {
  analysisViewRequestSchema,
  projectAnalysisView,
  type AnalysisViewParent,
} from "./analysisView.js";
import { projectAnalysisError } from "../analysisErrorProjection.js";
import { AnalysisOutputError } from "../analysisErrorCore.js";
import { createAnalysisProfile } from "../analysisProfile.js";
const provider = { id: "fixture", name: "Fixture", version: "1" };
const source = (
  operation: string,
  normalizedResult: unknown,
): AnalysisViewParent => ({
  evidenceId: "ev_" + "a".repeat(64),
  operation,
  normalizedResult,
  provider,
  subject: {
    name: "selected",
    local_path: "/selected",
    digest: { sha256: "b".repeat(64) },
    format: "elf",
    architecture: null,
  },
  authority: "shipped-artifact",
  environment: null,
  analysisProfile: createAnalysisProfile(provider, { fixture: true }),
  parameters: { procedure: "chosen" },
  artifact: { path: "/selected", sha256: "b".repeat(64) },
  limitations: ["first", "first", "last"],
});
function project(parent: AnalysisViewParent, view: unknown) {
  const result = projectAnalysisView(
    parent,
    analysisViewRequestSchema.parse(view),
  );
  if (!result.ok) throw result.error;
  return result.value;
}
it("preserves duplicate addresses, negative containment and retained-only exhaustion", () => {
  for (const operation of ["procedure_callers", "procedure_callees", "xrefs"]) {
    const parent = source(operation, ["EXTERNAL:0x1", "0x20", "0x20"]);
    expect(
      project(parent, { kind: "native-observation", offset: 1, limit: 2 }),
    ).toMatchObject({
      items: {
        type: "addresses",
        rows: [
          { source_index: 1, address: "0x20" },
          { source_index: 2, address: "0x20" },
        ],
      },
      summary: { observations: 3, discovery_coverage: "unknown" },
      coverage: { exhausted: true, total: 3 },
    });
  }
  const negative = {
    query_address: "0xff",
    found: false,
    procedure: null,
    reason: "outside_segments",
  };
  expect(
    project(source("resolve_containing_procedure", negative), {
      kind: "summary",
    }),
  ).toMatchObject({
    items: {
      type: "resolutions",
      rows: [{ source_index: 0, record: negative }],
    },
  });
  expect(
    project(source("procedure_address", "EXTERNAL:0x1"), {
      kind: "native-observation",
      offset: 1,
    }),
  ).toMatchObject({
    items: { rows: [] },
    coverage: { total: 1, exhausted: true, next_offset: null },
  });
});
it("pages graph levels canonically while preserving failed nodes and empty levels", () => {
  const error = projectAnalysisError(
    new AnalysisOutputError("procedure_callees", "missing"),
  );
  const parent = source("get_call_graph", {
    "😀": [],
    "\ue000": [{ address: "same", status: "error", error }],
    "2": [],
    "10": [{ address: "same", status: "ok", calls: ["a", "a"] }],
  });
  expect(
    project(parent, { kind: "native-observation", offset: 1, limit: 3 }),
  ).toMatchObject({
    items: {
      type: "graph-nodes",
      rows: [
        { level: "2", source_index: null, status: "empty-level" },
        { level: "\ue000", source_index: 0, status: "error", error },
        { level: "😀", source_index: null, status: "empty-level" },
      ],
    },
    coverage: { total: 4, examined: 3, exhausted: true },
  });
});
it("keeps source context identity semantic and exposes exact profile and repeated caveats separately", () => {
  const parent = source("procedure_callers", ["0x1"]),
    summary = project(parent, { kind: "summary" });
  const alias = project(
    {
      ...parent,
      subject: { ...parent.subject!, name: "alias", local_path: "/alias" },
      artifact: { ...parent.artifact!, path: "/alias" },
    },
    { kind: "summary" },
  );
  expect(summary.source_context).toEqual(alias.source_context);
  expect(JSON.stringify(summary)).not.toContain('"fixture":true');
  expect(
    project(parent, {
      kind: "native-context",
      facet: "limitations",
      offset: 1,
      limit: 2,
    }),
  ).toMatchObject({
    items: {
      rows: [
        { source_index: 1, text: "first" },
        { source_index: 2, text: "last" },
      ],
    },
    coverage: { total: 3 },
  });
  expect(
    project(parent, { kind: "native-context", facet: "analysis-profile" }),
  ).toMatchObject({
    items: { rows: [{ source_index: 0, record: parent.analysisProfile }] },
  });
  const missing = project(
    { ...parent, analysisProfile: null },
    { kind: "native-context", facet: "analysis-profile" },
  );
  expect(missing).toMatchObject({
    items: { rows: null },
    coverage: {
      status: "unavailable",
      total: null,
      exhausted: false,
      next_offset: null,
    },
  });
  expect(
    project(
      { ...parent, limitations: [] },
      { kind: "native-context", facet: "limitations" },
    ),
  ).toMatchObject({
    items: { rows: [] },
    coverage: { status: "empty", total: 0, exhausted: true },
  });
});
it("rejects malformed observations and incompatible selections rather than inventing empty facts", () => {
  for (const [parent, view] of [
    [source("xrefs", [42]), { kind: "native-observation" }],
    [
      source("get_call_graph", { "0": [{ address: "x", status: "ok" }] }),
      { kind: "summary" },
    ],
    [source("list_names", []), { kind: "native-context" }],
    [source("procedure_address", "0x1"), { kind: "native-inventory" }],
  ] as const) {
    expect(
      projectAnalysisView(parent, analysisViewRequestSchema.parse(view)),
    ).toMatchObject({ ok: false, error: { _tag: "AnalysisInputError" } });
  }
});
