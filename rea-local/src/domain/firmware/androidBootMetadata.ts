// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import { z } from "zod";
const offset = z.number().int().nonnegative().max(Number.MAX_SAFE_INTEGER);
const uint32 = offset.max(0xffffffff);
const hex = z.string().regex(/^(?:[0-9a-f]{2})*$/u);
/**
 * Android boot and vendor_boot header facts. Addresses, names, and the
 * command line are declarations from the image. The digest, v4 signature,
 * and AVB footer are recorded and not verified.
 */
export const androidBootImageMetadataSchema = z.strictObject({
  kind: z.literal("android-boot-image"),
  image_kind: z.enum(["boot", "vendor-boot"]),
  magic: z.enum(["ANDROID!", "VNDRBOOT"]),
  header_version: z.number().int().min(0).max(4),
  page_size: uint32.positive(),
  header_size: offset,
  os_version_raw: uint32.nullable(),
  os_version: z
    .string()
    .regex(/^\d{1,3}\.\d{1,3}\.\d{1,3}$/u)
    .nullable(),
  security_patch_level: z
    .string()
    .regex(/^\d{4}-\d{2}$/u)
    .nullable(),
  name: z.string().nullable(),
  name_bytes_hex: z
    .string()
    .regex(/^[0-9a-f]{32}$/u)
    .nullable(),
  cmdline: z.string().nullable(),
  cmdline_bytes_hex: z
    .string()
    .regex(/^(?:[0-9a-f]{1024}|[0-9a-f]{3072}|[0-9a-f]{4096})$/u),
  extra_cmdline: z.string().nullable(),
  extra_cmdline_bytes_hex: z
    .string()
    .regex(/^[0-9a-f]{2048}$/u)
    .nullable(),
  command_line: z.string().nullable(),
  header_digest_hex: z
    .string()
    .regex(/^[0-9a-f]{64}$/u)
    .nullable(),
  kernel_addr: uint32.nullable(),
  ramdisk_addr: uint32.nullable(),
  second_addr: uint32.nullable(),
  tags_addr: uint32.nullable(),
  dtb_addr: offset.nullable(),
  kernel_size: uint32.nullable(),
  ramdisk_size: uint32.nullable(),
  second_size: uint32.nullable(),
  recovery_dtbo_size: uint32.nullable(),
  recovery_dtbo_offset: offset.nullable(),
  dtb_size: uint32.nullable(),
  signature_size: uint32.nullable(),
  vendor_ramdisk_size: uint32.nullable(),
  vendor_ramdisk_table_entry_count: uint32.nullable(),
  vendor_ramdisk_table_entry_size: uint32.nullable(),
  bootconfig_size: uint32.nullable(),
  avb_footer_present: z.boolean(),
  avb_footer_size: z.literal(64).nullable(),
  avb_version_major: uint32.nullable(),
  avb_version_minor: uint32.nullable(),
  avb_original_image_size: offset.nullable(),
  avb_vbmeta_offset: offset.nullable(),
  avb_vbmeta_size: offset.nullable(),
  component_count: uint32,
  coverage: z.enum(["complete", "unknown"]),
  header_bytes_hex: hex,
  /** Stored little-endian u64 bytes, including values outside safe-number precision. */
  dtb_addr_hex: z
    .string()
    .regex(/^[0-9a-f]{16}$/u)
    .nullable(),
  avb_footer_bytes_hex: z
    .string()
    .regex(/^[0-9a-f]{128}$/u)
    .nullable(),
  vendor_ramdisk_entries: z.array(
    z.strictObject({
      index: uint32,
      size: uint32,
      offset: uint32,
      ramdisk_type: uint32,
      ramdisk_type_name: z.string().nullable(),
      name: z.string().nullable(),
      name_bytes_hex: z.string().regex(/^[0-9a-f]{64}$/u),
      board_id_hex: z.string().regex(/^[0-9a-f]{128}$/u),
      extension_bytes_hex: hex,
    }),
  ),
  undescribed: z.array(z.strictObject({ offset, length: offset })),
});
export type AndroidBootImageMetadata = z.infer<
  typeof androidBootImageMetadataSchema
>;

/** One stored boot-image component. Compression is a leading-magic observation. */
export const androidBootEntryMetadataSchema = z.strictObject({
  kind: z.literal("android-boot-image-entry"),
  role: z.enum([
    "kernel",
    "ramdisk",
    "second",
    "recovery-dtbo",
    "dtb",
    "vendor-ramdisk",
    "vendor-ramdisk-section",
    "vendor-ramdisk-table",
    "vbmeta",
    "avb-footer",
    "bootconfig",
    "signature",
  ]),
  index: uint32,
  compression: z.enum(["gzip", "lz4", "zstd"]).nullable(),
  ramdisk_type: uint32.nullable(),
  ramdisk_type_name: z.string().nullable(),
  load_address: offset.nullable(),
  name_bytes_hex: z
    .string()
    .regex(/^[0-9a-f]{64}$/u)
    .nullable(),
  board_id_hex: z
    .string()
    .regex(/^[0-9a-f]{128}$/u)
    .nullable(),
});
export type AndroidBootImageEntryMetadata = z.infer<
  typeof androidBootEntryMetadataSchema
>;
