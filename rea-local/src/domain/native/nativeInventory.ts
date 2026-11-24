// Selectively adapted from upstream f7849cad3; retain the local row contract.
import { z } from "zod";
import { analysisStringSchema } from "../hopperValues.js";
export const nativeAddressedValueSchema = z.object({
  address: z.string(),
  value: z.string(),
  symbol: z
    .object({
      primary: z.boolean(),
      dynamic: z.boolean(),
      external: z.boolean(),
      type: z.string(),
      source: z.enum(["default", "analysis", "ai", "imported", "user_defined"]),
    })
    .optional(),
  procedure: z
    .object({
      external: z.boolean(),
      thunk: z.boolean(),
      thunk_target: z.string().nullable(),
    })
    .optional(),
  string: z
    .object({
      encoding: z.string(),
      termination: z.enum(["missing", "present_or_not_required"]),
      byte_length: z.number().int().min(0),
    })
    .optional(),
});
export const NATIVE_INVENTORY_OPERATIONS = [
  "list_names",
  "list_procedures",
  "list_strings",
  "search_procedures",
  "search_strings",
] as const;
export type NativeInventoryOperation =
  (typeof NATIVE_INVENTORY_OPERATIONS)[number];
export const isNativeInventoryOperation = (
  name: string,
): name is NativeInventoryOperation =>
  NATIVE_INVENTORY_OPERATIONS.some((value) => value === name);
export const nativeInventoryRecordSchema = nativeAddressedValueSchema.extend({
  provider_value: analysisStringSchema.shape.provider_value,
  decoding: analysisStringSchema.shape.decoding,
  string: z.union([
    analysisStringSchema.shape.string,
    nativeAddressedValueSchema.shape.string,
  ]),
});
export const nativeInventoryRowsSchema = (
  operation: NativeInventoryOperation,
) =>
  z.array(
    operation === "list_strings" || operation === "search_strings"
      ? analysisStringSchema
      : nativeAddressedValueSchema,
  );
