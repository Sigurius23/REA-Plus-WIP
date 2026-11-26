import { z } from "zod";
const uint = z.number().int().nonnegative();
const uint32 = uint.max(0xffff_ffff);
const decimal = z.string().regex(/^(?:0|[1-9][0-9]*)$/u);
const signedDecimal = z.string().regex(/^-?(?:0|[1-9][0-9]*)$/u);
const hex = z.string().regex(/^(?:[0-9a-f]{2})*$/u);
const text = z.strictObject({ value: z.string().nullable(), bytes_hex: hex });
const unknown = z.strictObject({
  field_number: uint32,
  wire_type: uint,
  encoded_field_hex: hex,
});
const hash = z.strictObject({
  declared_hex: hex.nullable(),
  observed_hex: hex.nullable(),
  status: z.enum(["absent", "valid", "invalid", "unavailable", "unverified"]),
});
const info = z.strictObject({
  size: decimal.nullable(),
  hash_hex: hex.nullable(),
  hash_verified: z.literal(false),
  unknown_fields: z.array(unknown),
});
const extent = z.strictObject({
  start_block: decimal.nullable(),
  num_blocks: decimal.nullable(),
  sparse_hole: z.boolean(),
  unknown_fields: z.array(unknown),
});
const window = {
  file_offset: uint.nullable(),
  declared_length: decimal,
  stored_size: uint,
  availability: z.enum(["empty", "missing", "truncated", "complete"]),
};
const operation = z.strictObject({
  index: uint,
  type_code: uint32,
  type_name: z.string().nullable(),
  path: z.string(),
  data_offset: decimal.nullable(),
  data_length: decimal.nullable(),
  src_length: decimal.nullable(),
  dst_length: decimal.nullable(),
  src_extents: z.array(extent),
  dst_extents: z.array(extent),
  data_sha256: hash,
  src_sha256_hex: hex.nullable(),
  src_hash_verified: z.literal(false),
  ...window,
  unknown_fields: z.array(unknown),
});
const partition = z.strictObject({
  index: uint,
  name: text,
  run_postinstall: z.boolean().nullable(),
  postinstall_path: text.nullable(),
  filesystem_type: text.nullable(),
  old_partition_info: info.nullable(),
  new_partition_info: info.nullable(),
  version: text.nullable(),
  estimate_cow_size: decimal.nullable(),
  merge_operations_hex: z.array(hex),
  operations: z.array(operation),
  partition_image_reconstructed: z.literal(false),
  reconstruction_requirements: z.strictObject({
    operation_application: z.literal(true),
    source_data: z.boolean(),
    decompression: z.boolean(),
    zero_fill: z.boolean(),
    discard_semantics: z.boolean(),
    unknown_operation_semantics: z.boolean(),
    declared_partition_size: z.boolean(),
  }),
  unknown_fields: z.array(unknown),
});
const signature = z.strictObject({
  version: uint32.nullable(),
  data_hex: hex.nullable(),
  unpadded_size: uint32.nullable(),
  verified: z.literal(false),
  unknown_fields: z.array(unknown),
});
const signatureFacts = z.strictObject({
  ...window,
  status: z.enum(["absent", "parsed", "truncated", "malformed"]),
  signatures: z.array(signature),
  unknown_fields: z.array(unknown),
  verified: z.literal(false),
});
const dynamic = z.strictObject({
  groups: z.array(
    z.strictObject({
      name: text,
      size: decimal.nullable(),
      partition_names: z.array(text),
      unknown_fields: z.array(unknown),
    }),
  ),
  snapshot_enabled: z.boolean().nullable(),
  vabc_enabled: z.boolean().nullable(),
  vabc_compression_param: text.nullable(),
  unknown_fields: z.array(unknown),
});
export const androidOtaPayloadMetadataSchema = z.strictObject({
  kind: z.literal("android-ota-payload"),
  magic: z.literal("CrAU"),
  major_version: z.literal(2),
  coverage: z
    .enum(["complete", "unknown"])
    .describe(
      "Stored carrier-byte coverage under the declared ranges; not reconstructed partition semantics or observed update/device behavior.",
    ),
  file_size: uint,
  manifest_offset: z.literal(24),
  manifest_size: uint,
  metadata_signature_size: uint32,
  blob_offset: uint,
  block_size: uint32,
  block_size_source: z.enum(["default", "declared"]),
  minor_version: uint32,
  payload_kind: z.enum(["full", "delta"]),
  max_timestamp: signedDecimal.nullable(),
  partial_update: z.boolean().nullable(),
  security_patch_level: text.nullable(),
  signatures_offset: decimal.nullable(),
  signatures_size: decimal.nullable(),
  metadata_signatures: signatureFacts,
  payload_signatures: signatureFacts,
  partitions: z.array(partition),
  dynamic_partition_metadata: dynamic.nullable(),
  apex_info: z.array(
    z.strictObject({
      package_name: text.nullable(),
      version: signedDecimal.nullable(),
      is_compressed: z.boolean().nullable(),
      decompressed_size: signedDecimal.nullable(),
      unknown_fields: z.array(unknown),
    }),
  ),
  unknown_fields: z.array(unknown),
  unclaimed_ranges: z.array(z.strictObject({ offset: uint, length: uint })),
  signatures_verified: z.literal(false),
  partition_images_reconstructed: z.literal(false),
});
export type AndroidOtaPayloadMetadata = z.infer<
  typeof androidOtaPayloadMetadataSchema
>;
/** Stored carrier bytes only. An operation blob is not a reconstructed partition image. */
export const androidOtaRegionMetadataSchema = z.strictObject({
  kind: z.literal("android-ota-region"),
  role: z.enum([
    "header",
    "manifest",
    "metadata-signatures",
    "payload-signatures",
    "operation-data",
  ]),
  partition_index: uint.nullable(),
  operation_index: uint.nullable(),
  operation_type: uint32.nullable(),
  ...window,
  data_sha256: hash.nullable(),
});
export type AndroidOtaRegionMetadata = z.infer<
  typeof androidOtaRegionMetadataSchema
>;
