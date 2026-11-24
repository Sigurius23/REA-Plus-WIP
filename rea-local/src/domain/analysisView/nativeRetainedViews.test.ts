import { expect, it } from "vitest";
import {
  analysisViewRequestSchema,
  projectAnalysisView,
  type AnalysisViewParent,
} from "./analysisView.js";
import { batchDecompileResult } from "../native/batchDecompile.js";
const provider = { id: "ghidra", name: "Ghidra", version: "12.1.4" };
function parent(
  operation: string,
  normalizedResult: unknown,
): AnalysisViewParent {
  return {
    evidenceId: "ev_" + "a".repeat(64),
    operation,
    normalizedResult,
    provider,
    parameters: { pattern: "selected" },
    artifact: null,
    limitations: ["Observed partial Program only"],
  };
}
function project(source: AnalysisViewParent, view: unknown) {
  const result = projectAnalysisView(
    source,
    analysisViewRequestSchema.parse(view),
  );
  if (!result.ok) throw result.error;
  return result.value;
}
it("pages same-address alternatives without losing original row identity or decoding caveats", () => {
  const rows = [
    {
      address: "0x10",
      value: "alias one",
      symbol: {
        primary: false,
        dynamic: false,
        external: false,
        type: "label",
        source: "analysis",
      },
    },
    { address: "0x10", value: "alias two" },
  ];
  const source = parent("list_names", rows),
    view = project(source, {
      kind: "native-inventory",
      offset: 1,
      limit: 1,
      fields: ["value", "value"],
    });
  expect(view).toMatchObject({
    artifact: null,
    source_provider: provider,
    source_parameters: { pattern: "selected" },
    rows: [{ source_index: 1, record: rows[1] }],
    coverage: { total: 2, next_offset: null, exhausted: true },
  });
  const strings = parent("search_strings", [
    {
      address: "0x20",
      value: "display",
      provider_value: "native truncated text",
      decoding: { available: false, reason: "typed bytes unavailable" },
      string: {
        encoding: "UTF-8",
        encoding_status: "inferred",
        termination: "missing",
        byte_length: 7,
      },
    },
  ]);
  expect(
    project(strings, { kind: "native-inventory", fields: ["value"], limit: 1 }),
  ).toMatchObject({
    rows: [
      {
        record: {
          value: "display",
          decoding: { available: false },
          string: { encoding_status: "inferred", termination: "missing" },
        },
      },
    ],
  });
});
it("reports empty inventory coverage without asserting complete discovery", () => {
  const source = parent("list_strings", []);
  expect(project(source, { kind: "summary" })).toMatchObject({
    summary: { row_count: 0, discovery_coverage: "unknown" },
    unknowns: expect.arrayContaining([
      "Source Evidence did not bind an artifact identity.",
    ]),
  });
  expect(
    project(source, { kind: "native-inventory", offset: 5, limit: 2 }),
  ).toMatchObject({
    rows: [],
    coverage: { status: "empty", total: 0, exhausted: true, next_offset: null },
  });
});
const identity = {
  status: "resolved" as const,
  address: "0x10",
  name: "resolved",
};
const batch = () =>
  parent(
    "batch_decompile",
    batchDecompileResult([
      {
        address: "same",
        procedure: identity,
        status: "ok",
        pseudocode: "A😀Z",
        limitations: ["first observation"],
      },
      {
        address: "same",
        procedure: identity,
        status: "unavailable",
        reason: "no_pseudocode",
        limitations: ["second observation"],
      },
      {
        address: "same",
        procedure: identity,
        status: "ok",
        pseudocode: "third",
      },
    ]),
  );
it("keeps duplicate batch selectors distinct and filters before paging", () => {
  const view = project(batch(), {
    kind: "batch-decompile",
    collection: "items",
    where: { addresses: ["same"], statuses: ["ok"] },
    offset: 1,
    limit: 1,
  });
  expect(view).toMatchObject({
    rows: [{ index: 2, address: "same", pseudocode_code_units: 5 }],
    coverage: { examined: 1, total: 2, next_offset: null },
  });
  if (view.kind !== "batch-decompile" || !view.rows)
    throw Error("rows unavailable");
  expect(view.rows[0]).not.toHaveProperty("pseudocode");
  expect(
    project(batch(), {
      kind: "batch-decompile",
      collection: "items",
      where: { indices: [] },
    }),
  ).toMatchObject({ rows: [], coverage: { total: 0 } });
  expect(project(batch(), { kind: "summary" })).toMatchObject({
    summary: {
      batch: { total: 3, succeeded: 2, failed: 1 },
      outcomes: { ok: 2, unavailable: 1, error: 0 },
    },
  });
});
it("pages Unicode text without splitting surrogate pairs and refuses unavailable bodies", () => {
  const source = batch(),
    first = project(source, {
      kind: "batch-decompile",
      collection: "pseudocode",
      index: 0,
      offset: 0,
      limit: 2,
    });
  expect(first).toMatchObject({
    item: { text: "A" },
    coverage: { next_offset: 1, total: 4 },
  });
  expect(
    project(source, {
      kind: "batch-decompile",
      collection: "pseudocode",
      index: 0,
      offset: 1,
      limit: 2,
    }),
  ).toMatchObject({ item: { text: "😀" }, coverage: { next_offset: 3 } });
  for (const view of [
    {
      kind: "batch-decompile",
      collection: "pseudocode",
      index: 0,
      offset: 2,
      limit: 2,
    },
    { kind: "batch-decompile", collection: "pseudocode", index: 1 },
  ])
    expect(
      projectAnalysisView(source, analysisViewRequestSchema.parse(view)),
    ).toMatchObject({ ok: false, error: { _tag: "AnalysisInputError" } });
});
it("rejects mismatched historical counters and incompatible parent/view combinations", () => {
  const source = batch(),
    raw = source.normalizedResult as ReturnType<typeof batchDecompileResult>;
  expect(
    projectAnalysisView(
      { ...source, normalizedResult: { ...raw, failed: 0 } },
      analysisViewRequestSchema.parse({ kind: "summary" }),
    ),
  ).toMatchObject({ ok: false, error: { _tag: "AnalysisInputError" } });
  expect(
    projectAnalysisView(
      parent("list_names", []),
      analysisViewRequestSchema.parse({
        kind: "batch-decompile",
        collection: "items",
      }),
    ),
  ).toMatchObject({ ok: false });
});

it("keeps selected batch pages independent of the full caller-selector list", () => {
  const source = {
    ...batch(),
    parameters: {
      addresses: Array.from({ length: 20000 }, (_, i) => `selector-${i}`),
    },
  };
  const view = project(source, {
    kind: "batch-decompile",
    collection: "items",
    where: { indices: [0] },
    limit: 1,
  });
  expect(view).toMatchObject({
    batch: { total: 3, succeeded: 2, failed: 1 },
    decompiling_provider: null,
  });
  expect(view).not.toHaveProperty("source_parameters");
  expect(JSON.stringify(view).length).toBeLessThan(2000);
});
