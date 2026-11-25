import { z } from "zod";
const offset = z.number().int().nonnegative();
const uint32 = offset.max(0xffff_ffff);
const byte = offset.max(255);

/** Stored header facts and computed CRCs; declaration and verified execution stay separate. */
export const uImageMetadataSchema = z.strictObject({
  kind: z.literal("uimage"),
  magic: z.literal(0x27051956),
  timestamp: uint32,
  timestamp_iso: z.string(),
  payload_size: uint32,
  load_address: uint32,
  entry_point: uint32,
  header_crc32: uint32,
  computed_header_crc32: uint32,
  data_crc32: uint32,
  computed_data_crc32: uint32,
  crc_verified: z.boolean(),
  os: byte,
  os_name: z.string(),
  arch: byte,
  arch_name: z.string(),
  type: byte,
  type_name: z.string(),
  compression: byte,
  compression_name: z.string(),
  id_name_registry: z.string(),
  name: z.string().nullable(),
  name_bytes_hex: z.string().regex(/^[0-9a-f]{64}$/u),
  sub_image_count: uint32,
  size_table_bytes: offset,
  sub_image_slack_bytes: offset,
  trailing_bytes: offset,
  carrier_coverage: z.enum(["complete-within-carrier", "unknown-trailing"]),
});
export type UImageMetadata = z.infer<typeof uImageMetadataSchema>;

/** One stored payload or table-declared sub-image; offsets are real carrier ranges. */
export const uImageEntryMetadataSchema = z.strictObject({
  kind: z.literal("uimage-entry"),
  role: z.enum(["payload", "sub-image"]),
  index: uint32,
});
export type UImageEntryMetadata = z.infer<typeof uImageEntryMetadataSchema>;
