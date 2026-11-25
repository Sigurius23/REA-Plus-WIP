import { z } from "zod";
const offset = z.number().int().nonnegative();
const uint32 = offset.max(0xffff_ffff);

export const uf2MetadataSchema = z.strictObject({
  kind: z.literal("uf2"),
  main_flash_coverage: z.enum(["complete-within-carrier", "unknown"]),
  block_count: offset,
  trailing_bytes: offset,
  invalid_block_count: offset,
  flash_block_count: offset,
  not_main_flash_block_count: offset,
  file_container_block_count: offset,
  md5_block_count: offset,
  extension_tag_block_count: offset,
  family_count: offset,
  /** The registry revision REA's region `family_name` values come from. */
  family_name_registry: z.string(),
  numbering_group_count: offset,
  missing_block_count: offset,
  ambiguous_numbering_group_count: offset,
  repeated_block_count: offset,
  out_of_order_block_count: offset,
  block_number_out_of_range_count: offset,
  region_count: offset,
  data_bytes: offset,
  duplicate_bytes: offset,
});
export type Uf2Metadata = z.infer<typeof uf2MetadataSchema>;

/** One family's address-contiguous region; file blocks are zero-based positions. */
export const uf2RegionMetadataSchema = z.strictObject({
  kind: z.literal("uf2-region"),
  family_id: uint32.nullable(),
  /** REA's label for `family_id`, from `family_name_registry`; not file content. */
  family_name: z.string().nullable(),
  start_address: uint32,
  end_address: uint32,
  length: offset,
  block_count: offset,
  first_file_block: offset,
  last_file_block: offset,
});
