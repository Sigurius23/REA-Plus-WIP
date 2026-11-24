import { jsonValueSchema } from "../jsonValue.js";
import { z } from "zod";
import { procedureIdentitySchema } from "../hopperValues.js";
import { analysisErrorProjectionSchema } from "../analysisErrorProjectionSchema.js";

/** Existing provider observations; paging must not reinterpret these facts. */
export const containingProcedureResolutionSchema = z.discriminatedUnion(
  "found",
  [
    z.object({
      query_address: z.string(),
      found: z.literal(true),
      procedure: procedureIdentitySchema,
    }),
    z.object({
      query_address: z.string(),
      found: z.literal(false),
      procedure: z.null(),
      reason: z.enum(["outside_segments", "not_in_procedure"]),
    }),
  ],
);
export const nativeAddressListSchema = z.array(z.string());
export const nativeCallGraphNodeSchema = z.discriminatedUnion("status", [
  z.object({
    address: z.string(),
    status: z.literal("ok"),
    calls: nativeAddressListSchema,
  }),
  z.object({
    address: z.string(),
    status: z.literal("error"),
    error: analysisErrorProjectionSchema,
  }),
]);
export const nativeCallGraphSchema = z.record(
  z.string(),
  z.array(nativeCallGraphNodeSchema),
);
export const NATIVE_PRIMITIVE_OBSERVATION_OPERATIONS = [
  "procedure_address",
  "procedure_callees",
  "procedure_callers",
  "resolve_containing_procedure",
] as const;
export const NATIVE_OBSERVATION_OPERATIONS = [
  ...NATIVE_PRIMITIVE_OBSERVATION_OPERATIONS,
  "xrefs",
  "get_call_graph",
] as const;
export type NativeObservationOperation =
  (typeof NATIVE_OBSERVATION_OPERATIONS)[number];
export const isNativeObservationOperation = (
  operation: string,
): operation is NativeObservationOperation =>
  NATIVE_OBSERVATION_OPERATIONS.some((name) => name === operation);
export const nativeObservationSourceSchemas = {
  procedure_address: z.string(),
  procedure_callees: nativeAddressListSchema,
  procedure_callers: nativeAddressListSchema,
  resolve_containing_procedure: containingProcedureResolutionSchema,
  xrefs: nativeAddressListSchema,
  get_call_graph: nativeCallGraphSchema,
};

/** Completed graph nodes remain observations when traversal cannot safely continue. */
export const nativeCallGraphPartialSchema = z.strictObject({
  kind: z.literal("native-call-graph-partial"),
  request: z.strictObject({
    address: z.string(),
    direction: z.enum(["forward", "backward"]),
  }),
  graph: nativeCallGraphSchema,
  pending_addresses: z.array(z.string()),
  complete: z.literal(false),
  source: z.strictObject({
    subject: jsonValueSchema,
    provider: jsonValueSchema,
    analysis_profile_digest: z.string().nullable(),
  }),
});
export type NativeCallGraphPartial = z.output<
  typeof nativeCallGraphPartialSchema
>;
