import { isAbsolute } from "node:path";
import { z } from "zod";
import { digestSchema } from "../digests.js";
import { analysisProfileSchema } from "../analysisProfile.js";
import { localPathStringSchema } from "../localPath.js";
import { analysisErrorProjectionSchema } from "../analysisErrorProjectionSchema.js";
import { nativeAddressedValueSchema } from "./nativeInventory.js";
import { evidenceLocationSchema } from "../evidence.js";
import type { JsonValue } from "../jsonValue.js";

/** Numeric coordinates preserve address-space identity; display spelling stays separate. */
export const exportAddress = (value: string) => {
  const matched = /^(?:(.+):)?0x([0-9a-f]+)$/iu.exec(value);
  return matched === null
    ? null
    : {
        space: matched[1] ?? "",
        offset: BigInt(`0x${matched[2]}`),
      };
};
const boundSchema = z
  .string()
  .min(1)
  .refine((v) => exportAddress(v) !== null, "Use 0xoffset or space:0xoffset");
export const decompileDirectoryInputSchema = z
  .strictObject({
    output_directory: localPathStringSchema
      .refine(isAbsolute, "Use an absolute output directory")
      .describe(
        "New absolute directory with an existing parent; resume requires an existing matching export. Symlink output directories are refused.",
      ),
    resume: z.boolean().default(false),
    name: z
      .string()
      .min(1)
      .optional()
      .describe(
        "Case-sensitive literal substring of an observed procedure label.",
      ),
    address_start: boundSchema
      .optional()
      .describe("Inclusive lower entry-address bound."),
    address_end: boundSchema
      .optional()
      .describe(
        "Inclusive upper entry-address bound in the same address space.",
      ),
    limit: z
      .number()
      .int()
      .positive()
      .optional()
      .describe(
        "Maximum new or failed functions to attempt this call, after verified files and external functions are skipped. Resume prioritizes never-attempted functions.",
      ),
  })
  .superRefine((input, ctx) => {
    const a =
      input.address_start === undefined
        ? null
        : exportAddress(input.address_start);
    const b =
      input.address_end === undefined ? null : exportAddress(input.address_end);
    if (
      a !== null &&
      b !== null &&
      (a.space !== b.space || a.offset > b.offset)
    )
      ctx.addIssue({
        code: "custom",
        path: ["address_end"],
        message: "Bounds must use the same address space in increasing order",
      });
  });
export type DecompileDirectoryInput = z.output<
  typeof decompileDirectoryInputSchema
>;

export const decompileExportIdentitySchema = z.strictObject({
  version: z.literal(1),
  target_sha256: digestSchema,
  analysis_profile: analysisProfileSchema,
  layout: z.literal("address-sha256"),
});
export type DecompileExportIdentity = z.output<
  typeof decompileExportIdentitySchema
>;

/** Each attempt is committed separately, so an interrupted write cannot tear an earlier attempt. */
export const decompileExportRecordSchema = z
  .strictObject({
    identity_sha256: digestSchema,
    attempt: z.number().int().positive(),
    procedure: nativeAddressedValueSchema,
    status: z.enum(["written", "unavailable", "error", "external"]),
    file: z
      .strictObject({
        relative_path: z.string().regex(/^functions\/[0-9a-f]{64}\.c$/u),
        sha256: digestSchema,
        bytes: z.number().int().nonnegative(),
      })
      .optional(),
    error: analysisErrorProjectionSchema.optional(),
    limitations: z.array(z.string()),
    locations: z.array(evidenceLocationSchema),
  })
  .superRefine((v, ctx) => {
    if (
      (v.status === "written") !== (v.file !== undefined) ||
      (v.status === "error") !== (v.error !== undefined)
    )
      ctx.addIssue({
        code: "custom",
        message: "Export status disagrees with its file/error facts",
      });
  });
export type DecompileExportRecord = z.output<
  typeof decompileExportRecordSchema
>;

const count = z.number().int().nonnegative();
export const decompileDirectoryManifestSchema = z
  .strictObject({
    output_directory: z.string(),
    index_path: z.string(),
    index_sha256: digestSchema.nullable(),
    identity: decompileExportIdentitySchema,
    counts: z.strictObject({
      inventory_rows: count,
      unique_procedures: count,
      selected: count,
      skipped: count,
      written: count,
      unavailable: count,
      failed: count,
      external: count,
      remaining: count,
    }),
    resume: z.boolean(),
    inventory_limitations: z.array(z.string()),
    limitations: z.array(z.string()),
  })
  .superRefine((v, ctx) => {
    const c = v.counts;
    if (
      c.selected !==
        c.skipped +
          c.written +
          c.unavailable +
          c.failed +
          c.external +
          c.remaining ||
      c.selected > c.unique_procedures ||
      c.unique_procedures > c.inventory_rows
    )
      ctx.addIssue({
        code: "custom",
        message: "Export counts disagree with examined coverage",
      });
  });
export type DecompileDirectoryManifest = z.output<
  typeof decompileDirectoryManifestSchema
>;
export type DecompileDirectoryPartial = {
  readonly kind: "native-decompile-export-partial";
  readonly manifest: DecompileDirectoryManifest;
  readonly interruption?: JsonValue;
};

/** Observed labels are filtered before aliases collapse to one canonical address. */
export function selectExportProcedures(
  rows: z.output<typeof nativeAddressedValueSchema>[],
  input: DecompileDirectoryInput,
) {
  const key = (address: string) => {
    const coordinate = exportAddress(address);
    return coordinate === null
      ? address
      : `${coordinate.space}:0x${coordinate.offset.toString(16)}`;
  };
  const selected = new Map<
    string,
    z.output<typeof nativeAddressedValueSchema>
  >();
  const start =
    input.address_start === undefined
      ? null
      : exportAddress(input.address_start);
  const end =
    input.address_end === undefined ? null : exportAddress(input.address_end);
  for (const row of rows) {
    const address = exportAddress(row.address);
    if (input.name !== undefined && !row.value.includes(input.name)) continue;
    if (
      (start !== null &&
        (address === null ||
          address.space !== start.space ||
          address.offset < start.offset)) ||
      (end !== null &&
        (address === null ||
          address.space !== end.space ||
          address.offset > end.offset))
    )
      continue;
    if (!selected.has(key(row.address))) selected.set(key(row.address), row);
  }
  return {
    unique: new Set(rows.map((r) => key(r.address))).size,
    procedures: [...selected.values()].sort((a, b) => {
      const x = exportAddress(a.address),
        y = exportAddress(b.address);
      if (x !== null && y !== null && x.space === y.space)
        return x.offset < y.offset ? -1 : x.offset > y.offset ? 1 : 0;
      return key(a.address) < key(b.address)
        ? -1
        : key(a.address) > key(b.address)
          ? 1
          : 0;
    }),
  };
}
