import { z } from "zod";
const offset = z.number().int().nonnegative();
const uint32 = offset.max(0xffff_ffff);

export const dfuSeMetadataSchema = z.strictObject({
  kind: z.literal("dfuse"),
  image_size: uint32,
  target_count: uint32,
  element_count: offset,
  empty_element_count: offset,
  overlapping_element_count: offset,
  data_bytes: offset,
  device_version: uint32,
  product_id: uint32,
  vendor_id: uint32,
  suffix_crc: uint32,
  computed_crc: uint32,
  targets: z
    .array(
      z.strictObject({
        target_index: uint32,
        source_offset: offset,
        alternate_setting: offset.max(255),
        target_named: uint32.describe(
          "Raw bTargetNamed field; zero means unnamed.",
        ),
        target_name: z.string().nullable(),
        name_field_hex: z
          .string()
          .regex(/^[0-9a-f]{510}$/u)
          .describe(
            "All 255 source bytes, including bytes after the first NUL.",
          ),
        declared_size: uint32,
        declared_elements: uint32,
      }),
    )
    .max(255),
});
export type DfuSeMetadata = z.infer<typeof dfuSeMetadataSchema>;

/** One DfuSe element with its target's alternate setting and name. */
export const dfuSeElementMetadataSchema = z.strictObject({
  kind: z.literal("dfuse-element"),
  target_index: uint32,
  alternate_setting: uint32,
  target_name: z.string().nullable(),
  element_index: uint32,
  start_address: uint32,
  end_address: uint32,
  length: offset,
});
