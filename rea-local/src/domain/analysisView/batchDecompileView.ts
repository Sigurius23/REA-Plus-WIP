import { analysisProfileSchema } from "../analysisProfile.js";
import { analysisViewInputError } from "./analysisViewErrors.js";
import { analysisTextPage } from "./analysisViewText.js";
// Selective local adaptation of upstream f7849cad3 retained batch rows and text pages.
import { z } from "zod";
import {
  batchDecompileItemSchema,
  batchDecompileResultSchema,
} from "../native/batchDecompile.js";
import { analysisInputErrorFromIssues } from "../inputIssueProjection.js";
import { err, ok } from "../result.js";
import type {
  AnalysisViewParent,
  AnalysisViewRequest,
  UnsignedAnalysisView,
} from "./analysisView.js";
import {
  completeWithinViewCoverage,
  pageViewCoverage,
} from "./analysisViewCoverage.js";

export const batchDecompileViewRequestSchema = z.discriminatedUnion(
  "collection",
  [
    z.strictObject({
      kind: z.literal("batch-decompile"),
      collection: z.literal("items"),
      offset: z.number().int().nonnegative().default(0),
      limit: z.number().int().positive().default(64),
      where: z
        .strictObject({
          indices: z.array(z.number().int().nonnegative()).optional(),
          addresses: z.array(z.string()).optional(),
          procedure_addresses: z.array(z.string()).optional(),
          statuses: z.array(z.enum(["ok", "unavailable", "error"])).optional(),
        })
        .default({}),
      include_pseudocode: z.boolean().default(false),
    }),
    z.strictObject({
      kind: z.literal("batch-decompile"),
      collection: z.literal("pseudocode"),
      index: z.number().int().nonnegative(),
      offset: z.number().int().nonnegative().default(0),
      limit: z.number().int().positive().default(16384),
    }),
  ],
);
export const batchDecompileSummarySchema = z.strictObject({
  batch: z.strictObject({
    total: z.number().int().nonnegative(),
    succeeded: z.number().int().nonnegative(),
    failed: z.number().int().nonnegative(),
  }),
  outcomes: z.strictObject({
    ok: z.number().int().nonnegative(),
    unavailable: z.number().int().nonnegative(),
    error: z.number().int().nonnegative(),
  }),
  unknown_procedure_identity: z.number().int().nonnegative(),
  pseudocode_code_units: z.number().int().nonnegative(),
});
const itemVariants = batchDecompileItemSchema.options;
export const batchDecompileViewRowSchema = z.discriminatedUnion("status", [
  itemVariants[0].omit({ pseudocode: true }).extend({
    index: z.number().int().nonnegative(),
    pseudocode_code_units: z.number().int().positive(),
    pseudocode: z.string().min(1).optional(),
  }),
  itemVariants[1].extend({ index: z.number().int().nonnegative() }),
  itemVariants[2].extend({ index: z.number().int().nonnegative() }),
]);
export const batchTextPageSchema = z.strictObject({
  index: z.number().int().nonnegative(),
  address: z.string(),
  procedure: batchDecompileItemSchema.options[0].shape.procedure,
  text: z.string(),
  unit: z.literal("utf16-code-units"),
});
export function projectBatchDecompileView(
  parent: AnalysisViewParent,
  view: AnalysisViewRequest,
) {
  if (view.kind !== "summary" && view.kind !== "batch-decompile")
    return err(
      analysisViewInputError([
        {
          path: ["view"],
          reason: "invalid_value",
          message:
            "Batch decompilation supports summary and batch-decompile views",
        },
      ]),
    );
  const parsed = batchDecompileResultSchema.safeParse(parent.normalizedResult);
  if (!parsed.success)
    return err(
      analysisInputErrorFromIssues(
        "inspect_analysis_view",
        parsed.error.issues.map((issue) => ({
          ...issue,
          path: ["source", "normalized_result", ...issue.path],
        })),
        { source: { normalized_result: parent.normalizedResult } },
        { cause: parsed.error },
      ),
    );
  const upstream = analysisProfileSchema.safeParse(
    parent.analysisProfile?.parameters.upstream_analysis_profile,
  );
  const batch = parsed.data,
    common = {
      parent_evidence_id: parent.evidenceId,
      parent_operation: "batch_decompile" as const,
      parent_digest: parent.evidenceId.slice(3),
      artifact: parent.artifact ?? null,
      source_provider: parent.provider ?? null,
      source_analysis_profile_digest: parent.analysisProfile?.digest ?? null,
      batch: {
        total: batch.total,
        succeeded: batch.succeeded,
        failed: batch.failed,
      },
      decompiling_provider: upstream.success ? upstream.data.provider : null,
      limitations: [...parent.limitations],
      unknowns: [
        "The batch covers its explicit ordered selectors only; unavailable pseudocode and unknown procedure identity remain unresolved.",
        ...(parent.artifact == null
          ? ["Source Evidence did not bind an artifact identity."]
          : []),
      ],
    };
  if (view.kind === "summary")
    return ok({
      ...common,
      kind: "summary" as const,
      view,
      summary: {
        batch: {
          total: batch.total,
          succeeded: batch.succeeded,
          failed: batch.failed,
        },
        outcomes: {
          ok: batch.succeeded,
          unavailable: batch.items.filter(
            (item) => item.status === "unavailable",
          ).length,
          error: batch.items.filter((item) => item.status === "error").length,
        },
        unknown_procedure_identity: batch.items.filter(
          (item) => item.procedure.status === "unknown",
        ).length,
        pseudocode_code_units: batch.items.reduce(
          (n, item) => n + (item.status === "ok" ? item.pseudocode.length : 0),
          0,
        ),
      },
      coverage: completeWithinViewCoverage(
        batch.items.length,
        batch.items.length,
      ),
    } satisfies UnsignedAnalysisView);
  if (view.collection === "pseudocode") {
    const item = batch.items[view.index];
    if (item?.status !== "ok")
      return err(
        analysisViewInputError([
          {
            path: ["view", "index"],
            reason: "invalid_value",
            message:
              "Select an original batch index with successful pseudocode",
          },
        ]),
      );
    const selected = analysisTextPage(item.pseudocode, view.offset, view.limit);
    if (!selected.ok) return selected;
    return ok({
      ...common,
      kind: "batch-decompile" as const,
      view,
      item: {
        index: view.index,
        address: item.address,
        procedure: item.procedure,
        text: selected.value.item.text,
        unit: "utf16-code-units" as const,
      },
      coverage: selected.value.coverage,
    } satisfies UnsignedAnalysisView);
  }
  const filter = view.where,
    indices = filter.indices === undefined ? null : new Set(filter.indices),
    addresses =
      filter.addresses === undefined ? null : new Set(filter.addresses),
    procedures =
      filter.procedure_addresses === undefined
        ? null
        : new Set(filter.procedure_addresses),
    statuses = filter.statuses === undefined ? null : new Set(filter.statuses);
  const matching = batch.items
    .map((item, index) => ({ item, index }))
    .filter(
      ({ item, index }) =>
        (indices === null || indices.has(index)) &&
        (addresses === null || addresses.has(item.address)) &&
        (procedures === null ||
          (item.procedure.status === "resolved" &&
            procedures.has(item.procedure.address))) &&
        (statuses === null || statuses.has(item.status)),
    );
  const rows = matching
    .slice(view.offset, view.offset + view.limit)
    .map(({ item, index }) => {
      if (item.status !== "ok") return { ...item, index };
      const { pseudocode, ...rest } = item;
      return {
        ...rest,
        index,
        pseudocode_code_units: pseudocode.length,
        ...(view.include_pseudocode ? { pseudocode } : {}),
      };
    });
  return ok({
    ...common,
    kind: "batch-decompile" as const,
    view,
    rows,
    coverage: pageViewCoverage(view.offset, rows.length, matching.length),
  } satisfies UnsignedAnalysisView);
}
