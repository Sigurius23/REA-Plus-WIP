import { z } from "zod";
const uint = z.number().int().nonnegative();
const uint32 = uint.max(0xffff_ffff);
const hex = z.string().regex(/^(?:[0-9a-f]{2})*$/u);
const fitSignatureSchema = z.strictObject({
  name: z.string(),
  algorithm: z.string().nullable(),
  algorithm_bytes_hex: hex.nullable(),
  value_hex: hex.nullable(),
  key_name_hint: z.string().nullable(),
  verified: z.literal(false),
});
const fitHashSchema = z.strictObject({
  name: z.string(),
  algorithm: z.string().nullable(),
  algorithm_bytes_hex: hex.nullable(),
  declared_hex: hex.nullable(),
  observed_hex: hex.nullable(),
  status: z.enum(["matches", "mismatched", "unverified"]),
});
const references = {
  kernel: z.array(z.string()),
  firmware: z.array(z.string()),
  fdt: z.array(z.string()),
  ramdisk: z.array(z.string()),
  loadables: z.array(z.string()),
};
/** Observed FIT declarations, not a verified boot selection or signature chain. */
export const fitMetadataSchema = z.strictObject({
  kind: z.literal("fit"),
  fdt_version: uint32,
  fdt_totalsize: uint32,
  external_data_base: uint,
  description: z.string().nullable(),
  timestamp: uint32.nullable(),
  address_cells: uint32.nullable(),
  default_configuration: z.string().nullable(),
  configurations: z.array(
    z.strictObject({
      name: z.string(),
      description: z.string().nullable(),
      ...references,
      unresolved_reference_count: uint,
      signature_count: uint,
      signatures_unreadable: uint,
      signature_algorithms: z.array(z.string()),
      signatures: z.array(fitSignatureSchema),
    }),
  ),
  examined_nodes: uint,
  examined_properties: uint,
  reservation_count: uint,
  overlapping_image_count: uint,
  unclaimed_ranges: z.array(z.strictObject({ offset: uint, length: uint })),
});
export type FitMetadata = z.infer<typeof fitMetadataSchema>;
/** One stored image range; declarations do not establish runtime load or entry behavior. */
export const fitImageMetadataSchema = z.strictObject({
  kind: z.literal("fit-image"),
  index: uint,
  name: z.string(),
  description: z.string().nullable(),
  type: z.string().nullable(),
  arch: z.string().nullable(),
  os: z.string().nullable(),
  compression: z.string().nullable(),
  load: z.string().nullable(),
  entry: z.string().nullable(),
  data_source: z.enum(["embedded", "data-offset", "data-position"]),
  declared_offset: uint.nullable(),
  overlap_earlier_image_index: uint.nullable(),
  image_data: z.string().nullable(),
  cipher_present: z.boolean(),
  cipher_algo: z.string().nullable(),
  unreadable_fields: z.array(z.string()),
  hash_algorithms: z.array(z.string()),
  hashes_verified: uint,
  hashes_mismatched: uint,
  hashes_unverified: uint,
  hashes: z.array(fitHashSchema),
  signature_count: uint,
  signatures_unreadable: uint,
  signature_algorithms: z.array(z.string()),
  signatures: z.array(fitSignatureSchema),
});
export type FitImageMetadata = z.infer<typeof fitImageMetadataSchema>;
