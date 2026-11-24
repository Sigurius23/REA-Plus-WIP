// Selectively adapted from upstream f7849cad3; existing local observation shapes remain authoritative.
import { z } from "zod";
import { evidenceSchema, evidenceSubjectIdentity } from "../evidence.js";
import { digestSchema } from "../digests.js";
import { digestCanonicalValue } from "../canonicalDigest.js";
import { jsonValueSchema } from "../jsonValue.js";
import { analysisInputErrorFromIssues } from "../inputIssueProjection.js";
import type { AnalysisError } from "../analysisErrorBase.js";
import { err, ok, type Result } from "../result.js";
import { compareUnicodeCodePoints } from "../unicodeCodePointOrder.js";
import {
  nativeObservationSourceSchemas,
  nativeCallGraphNodeSchema,
  containingProcedureResolutionSchema,
  isNativeObservationOperation,
} from "../native/nativeObservation.js";
import type {
  AnalysisViewParent,
  AnalysisViewRequest,
  UnsignedAnalysisView,
} from "./analysisView.js";
import { analysisViewInputError } from "./analysisViewErrors.js";
import {
  pageViewCoverage,
  unavailableViewCoverage,
} from "./analysisViewCoverage.js";

const paging = {
  offset: z.number().int().nonnegative().default(0),
  limit: z.number().int().positive().default(64),
};
export const nativeObservationViewRequestSchema = z.strictObject({
  kind: z.literal("native-observation"),
  ...paging,
});
export const nativeContextViewRequestSchema = z.strictObject({
  kind: z.literal("native-context"),
  facet: z
    .enum(["overview", "analysis-profile", "limitations"])
    .default("overview"),
  ...paging,
});
const index = z.number().int().nonnegative();
const graphRowSchema = z.union([
  nativeCallGraphNodeSchema.options[0].extend({
    level: z.string(),
    source_index: index,
  }),
  nativeCallGraphNodeSchema.options[1].extend({
    level: z.string(),
    source_index: index,
  }),
  z.strictObject({
    level: z.string(),
    source_index: z.null(),
    status: z.literal("empty-level"),
  }),
]);
export const nativeObservationItemsSchema = z.discriminatedUnion("type", [
  z.strictObject({
    type: z.literal("addresses"),
    rows: z.array(z.strictObject({ source_index: index, address: z.string() })),
  }),
  z.strictObject({
    type: z.literal("resolutions"),
    rows: z.array(
      z.strictObject({
        source_index: index,
        record: containingProcedureResolutionSchema,
      }),
    ),
  }),
  z.strictObject({
    type: z.literal("graph-nodes"),
    rows: z.array(graphRowSchema),
  }),
]);
export const nativeObservationSummarySchema = z.strictObject({
  observations: index,
  discovery_coverage: z.literal("unknown"),
});
export const nativeSourceContextReferenceSchema = z.strictObject({
  materialization: z.literal("reference"),
  digest: digestSchema,
  evidence_limitation_count: index,
});
const sourceContextSchema = z.strictObject({
  subject: evidenceSchema.shape.subject,
  provider: evidenceSchema.shape.provider.nullable(),
  analysis_profile: evidenceSchema.shape.analysis_profile,
  authority: evidenceSchema.shape.authority.nullable(),
  environment: evidenceSchema.shape.environment,
  limitations: evidenceSchema.shape.limitations,
});
export const nativeContextItemsSchema = z.discriminatedUnion("type", [
  z.strictObject({
    type: z.literal("overview"),
    rows: z.array(
      z.strictObject({
        source_index: index,
        record: sourceContextSchema
          .omit({ analysis_profile: true, limitations: true })
          .extend({ analysis_profile_digest: digestSchema.nullable() }),
      }),
    ),
  }),
  z.strictObject({
    type: z.literal("analysis-profile"),
    rows: z
      .array(
        z.strictObject({
          source_index: index,
          record: evidenceSchema.shape.analysis_profile,
        }),
      )
      .nullable(),
  }),
  z.strictObject({
    type: z.literal("limitations"),
    rows: z.array(z.strictObject({ source_index: index, text: z.string() })),
  }),
]);

const selectedRows = <T>(
  values: readonly T[],
  view: { offset: number; limit: number },
) =>
  values
    .slice(view.offset, view.offset + view.limit)
    .map((value, i) => ({ source_index: view.offset + i, value }));

function readObservation<Schema extends z.ZodType>(
  parent: AnalysisViewParent,
  schema: Schema,
): Result<z.output<Schema>, AnalysisError> {
  const parsed = schema.safeParse(parent.normalizedResult);
  return parsed.success
    ? ok(parsed.data)
    : err(
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
}

/** Page the retained source order, including explicit empty graph levels. */
function observationRows(
  parent: AnalysisViewParent,
  view: { offset: number; limit: number },
) {
  const operation = parent.operation;
  if (!isNativeObservationOperation(operation))
    throw Error("Native observation route mismatch");
  if (operation === "get_call_graph") {
    const parsed = readObservation(
      parent,
      nativeObservationSourceSchemas.get_call_graph,
    );
    if (!parsed.ok) return parsed;
    const graph = parsed.value;
    const rows: z.output<typeof graphRowSchema>[] = [];
    let total = 0;
    for (const level of Object.keys(graph).sort(compareUnicodeCodePoints)) {
      const nodes = graph[level]!;
      if (nodes.length === 0) {
        if (total >= view.offset && rows.length < view.limit)
          rows.push({ level, source_index: null, status: "empty-level" });
        total++;
      } else {
        const start = Math.max(0, view.offset - total);
        const end = Math.min(
          nodes.length,
          start + Math.max(0, view.limit - rows.length),
        );
        for (let i = start; i < end; i++)
          rows.push({ ...nodes[i]!, level, source_index: i });
        total += nodes.length;
      }
    }
    return ok({ total, items: { type: "graph-nodes" as const, rows } });
  }
  if (operation === "resolve_containing_procedure") {
    const parsed = readObservation(parent, containingProcedureResolutionSchema);
    if (!parsed.ok) return parsed;
    const record = parsed.value;
    return ok({
      total: 1,
      items: {
        type: "resolutions" as const,
        rows: selectedRows([record], view).map(({ source_index, value }) => ({
          source_index,
          record: value,
        })),
      },
    });
  }
  const parsed = readObservation(
    parent,
    operation === "procedure_address"
      ? nativeObservationSourceSchemas.procedure_address
      : nativeObservationSourceSchemas.xrefs,
  );
  if (!parsed.ok) return parsed;
  const addresses =
    typeof parsed.value === "string" ? [parsed.value] : parsed.value;
  return ok({
    total: addresses.length,
    items: {
      type: "addresses" as const,
      rows: selectedRows(addresses, view).map(({ source_index, value }) => ({
        source_index,
        address: value,
      })),
    },
  });
}

/** Retained facts reference complete source context without repeating its profile or caveat inventory. */
export function projectNativeObservationView(
  parent: AnalysisViewParent,
  view: AnalysisViewRequest,
) {
  if (
    !isNativeObservationOperation(parent.operation) ||
    (view.kind !== "summary" &&
      view.kind !== "native-observation" &&
      view.kind !== "native-context")
  )
    return err(
      analysisViewInputError([
        {
          path: ["view"],
          reason: "invalid_value",
          message:
            "Use summary, native-observation or native-context with this source.",
        },
      ]),
    );
  const selection = view.kind === "summary" ? { offset: 0, limit: 64 } : view;
  const selected = observationRows(parent, selection);
  if (!selected.ok) return selected;
  const context = sourceContextSchema.parse({
    subject: parent.subject ?? null,
    provider: parent.provider ?? null,
    analysis_profile: parent.analysisProfile ?? null,
    authority: parent.authority ?? null,
    environment: parent.environment ?? null,
    limitations: parent.limitations,
  });
  const source_context = {
    materialization: "reference" as const,
    digest: digestCanonicalValue(
      { ...context, subject: evidenceSubjectIdentity(context.subject) },
      "Native source context",
    ),
    evidence_limitation_count: context.limitations.length,
  };
  const common = {
    parent_evidence_id: parent.evidenceId,
    parent_operation: parent.operation,
    parent_digest: parent.evidenceId.slice(3),
    artifact: parent.artifact ?? null,
    source_provider: context.provider,
    source_analysis_profile_digest: context.analysis_profile?.digest ?? null,
    source_parameters: jsonValueSchema.parse(parent.parameters ?? null),
    source_context,
    limitations: [
      "Read native-context limitations for the complete source caveats; the retained parent remains authoritative.",
    ],
    unknowns: [
      "Pages exhaust recorded observations, not complete native discovery. Interpretation beyond these facts requires the source caveats.",
    ],
  };
  if (view.kind === "native-context") {
    let items: z.output<typeof nativeContextItemsSchema>, total: number;
    if (view.facet === "limitations") {
      total = context.limitations.length;
      items = {
        type: "limitations",
        rows: selectedRows(context.limitations, view).map(
          ({ source_index, value }) => ({ source_index, text: value }),
        ),
      };
    } else if (view.facet === "analysis-profile") {
      if (context.analysis_profile === null)
        return ok({
          ...common,
          kind: "native-context" as const,
          view,
          items: { type: "analysis-profile" as const, rows: null },
          coverage: unavailableViewCoverage(),
          unknowns: [
            "The source recorded no analysis profile; null is not an examined empty profile.",
          ],
        } satisfies UnsignedAnalysisView);
      total = 1;
      items = {
        type: "analysis-profile",
        rows: selectedRows([context.analysis_profile], view).map(
          ({ source_index, value }) => ({ source_index, record: value }),
        ),
      };
    } else {
      const {
        analysis_profile,
        limitations: _limitations,
        ...overview
      } = context;
      total = 1;
      items = {
        type: "overview",
        rows: selectedRows(
          [
            {
              ...overview,
              analysis_profile_digest: analysis_profile?.digest ?? null,
            },
          ],
          view,
        ).map(({ source_index, value }) => ({ source_index, record: value })),
      };
    }
    return ok({
      ...common,
      kind: "native-context" as const,
      view,
      items,
      coverage: pageViewCoverage(view.offset, items.rows?.length ?? 0, total),
    } satisfies UnsignedAnalysisView);
  }
  const page = selected.value;
  const observation = {
    ...common,
    items: page.items,
    summary: {
      observations: page.total,
      discovery_coverage: "unknown" as const,
    },
    coverage: pageViewCoverage(
      selection.offset,
      page.items.rows.length,
      page.total,
    ),
    ...(parent.operation === "xrefs"
      ? {
          unknowns: [
            ...common.unknowns,
            "Address rows do not establish reference kinds or runtime use; export the complete parent for any additional recorded provider details.",
          ],
        }
      : {}),
  };
  return view.kind === "summary"
    ? ok({
        ...observation,
        kind: "summary" as const,
        view,
      } satisfies UnsignedAnalysisView)
    : ok({
        ...observation,
        kind: "native-observation" as const,
        view,
      } satisfies UnsignedAnalysisView);
}
