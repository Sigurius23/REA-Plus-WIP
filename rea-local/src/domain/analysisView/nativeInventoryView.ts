import { analysisViewInputError } from "./analysisViewErrors.js";
// Selectively adapted from upstream f7849cad3; canonical local rows remain authoritative.
import { z } from "zod";
import { jsonValueSchema } from "../jsonValue.js";
import {
  nativeInventoryRecordSchema,
  nativeInventoryRowsSchema,
  isNativeInventoryOperation,
} from "../native/nativeInventory.js";
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

export const nativeInventoryViewRequestSchema = z.strictObject({
  kind: z.literal("native-inventory"),
  offset: z.number().int().nonnegative().default(0),
  limit: z.number().int().positive().default(64),
  fields: z
    .array(nativeInventoryRecordSchema.keyof())
    .optional()
    .describe(
      "Select recorded fields. address and source_index preserve identity; selecting value also retains string and decoding qualifications. Omit for all recorded fields.",
    ),
});
export const nativeInventorySummarySchema = z.strictObject({
  collection: z.enum(["names", "procedures", "strings"]),
  row_count: z.number().int().nonnegative(),
  discovery_coverage: z.literal("unknown"),
  selectable_fields: z.array(nativeInventoryRecordSchema.keyof()),
});
export const nativeInventoryViewRowSchema = z.strictObject({
  source_index: z.number().int().nonnegative(),
  record: nativeInventoryRecordSchema.partial().required({ address: true }),
});
export function projectNativeInventoryView(
  parent: AnalysisViewParent,
  view: AnalysisViewRequest,
) {
  if (
    !isNativeInventoryOperation(parent.operation) ||
    (view.kind !== "summary" && view.kind !== "native-inventory")
  )
    return err(
      analysisViewInputError([
        {
          path: ["view"],
          reason: "invalid_value",
          message:
            "Native inventories support summary and native-inventory views",
        },
      ]),
    );
  const parsed = nativeInventoryRowsSchema(parent.operation).safeParse(
    parent.normalizedResult,
  );
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
  const rows: z.output<typeof nativeInventoryRecordSchema>[] = parsed.data;
  const common = {
    parent_evidence_id: parent.evidenceId,
    parent_operation: parent.operation,
    parent_digest: parent.evidenceId.slice(3),
    artifact: parent.artifact ?? null,
    source_provider: parent.provider ?? null,
    source_analysis_profile_digest: parent.analysisProfile?.digest ?? null,
    source_parameters: jsonValueSchema.parse(parent.parameters ?? null),
    limitations: [...parent.limitations],
    unknowns: [
      "Counts and pages describe retained provider observations, not complete discovery. A missing match does not establish absence outside this inventory.",
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
        collection: parent.operation.includes("strings")
          ? ("strings" as const)
          : parent.operation === "list_names"
            ? ("names" as const)
            : ("procedures" as const),
        row_count: rows.length,
        discovery_coverage: "unknown" as const,
        selectable_fields: nativeInventoryRecordSchema.keyof().options,
      },
      coverage: completeWithinViewCoverage(rows.length, rows.length),
    } satisfies UnsignedAnalysisView);
  const fields =
      view.fields === undefined ? undefined : [...new Set(view.fields)],
    selected = rows.slice(view.offset, view.offset + view.limit);
  return ok({
    ...common,
    kind: "native-inventory" as const,
    view,
    rows: selected.map((record, index) => ({
      source_index: view.offset + index,
      record:
        fields === undefined
          ? record
          : {
              address: record.address,
              ...(fields.includes("value") && record.string !== undefined
                ? { string: record.string }
                : {}),
              ...(fields.includes("value") && record.decoding !== undefined
                ? { decoding: record.decoding }
                : {}),
              ...Object.fromEntries(
                fields
                  .filter((field) => Object.hasOwn(record, field))
                  .map((field) => [field, record[field]]),
              ),
            },
    })),
    coverage: pageViewCoverage(view.offset, selected.length, rows.length),
  } satisfies UnsignedAnalysisView);
}
