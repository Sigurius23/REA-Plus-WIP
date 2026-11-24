import { jsonValueSchema } from "../jsonValue.js";
import { z } from "zod";
import { analysisErrorProjectionSchema } from "../analysisErrorProjectionSchema.js";
/** Identity facts attached to one requested batch selector. */
export const batchProcedureIdentitySchema = z.discriminatedUnion("status", [
  z.object({
    status: z.literal("resolved"),
    address: z.string().min(1).describe("Observed canonical procedure entry."),
    name: z
      .string()
      .nullable()
      .describe("Provider's entry label, or null when unavailable."),
    name_error: analysisErrorProjectionSchema.optional(),
  }),
  z.object({
    status: z.literal("unknown"),
    error: analysisErrorProjectionSchema,
  }),
]);

const common = {
  address: z.string(),
  procedure: batchProcedureIdentitySchema,
  limitations: z.array(z.string()).optional(),
};
export const batchDecompileItemSchema = z.discriminatedUnion("status", [
  z.object({
    ...common,
    status: z.literal("ok"),
    pseudocode: z.string().min(1),
  }),
  z.object({
    ...common,
    status: z.literal("unavailable"),
    reason: z.literal("no_pseudocode"),
  }),
  z.object({
    ...common,
    status: z.literal("error"),
    error: analysisErrorProjectionSchema,
  }),
]);
export const batchDecompileResultSchema = z
  .object({
    items: z.array(batchDecompileItemSchema),
    total: z.number().int().nonnegative(),
    succeeded: z.number().int().nonnegative(),
    failed: z.number().int().nonnegative(),
  })
  .superRefine((v, c) => {
    if (
      v.total !== v.items.length ||
      v.succeeded !== v.items.filter((i) => i.status === "ok").length ||
      v.failed !== v.total - v.succeeded
    )
      c.addIssue({
        code: "custom",
        message: "Batch counts disagree with the observed item outcomes",
      });
  });
export type BatchDecompileItem = z.output<typeof batchDecompileItemSchema>;
export type BatchDecompileResult = z.output<typeof batchDecompileResultSchema>;

export const batchDecompilePartialSchema = z.strictObject({
  kind: z.literal("native-batch-partial"),
  requested_addresses: z.array(z.string()),
  completed: z.number().int().nonnegative(),
  result: batchDecompileResultSchema,
  source: z.strictObject({
    subject: jsonValueSchema,
    provider: jsonValueSchema,
    analysis_profile_digest: z.string().nullable(),
  }),
});
export type BatchDecompilePartial = z.output<
  typeof batchDecompilePartialSchema
>;
export const batchDecompileResult = (
  items: BatchDecompileItem[],
): BatchDecompileResult => ({
  items,
  total: items.length,
  succeeded: items.filter((i) => i.status === "ok").length,
  failed: items.filter((i) => i.status !== "ok").length,
});
