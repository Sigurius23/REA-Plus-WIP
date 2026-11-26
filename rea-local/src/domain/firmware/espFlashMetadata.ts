import { z } from "zod";
import {
  espImageMetadataSchema,
  espImageSegmentMetadataSchema,
  espImageSignatureBlockMetadataSchema,
} from "./espMetadata.js";
const offset = z.number().int().nonnegative();
const uint32 = offset.max(0xffff_ffff);
const uint8 = offset.max(255);
const completeOrUnknownCoverageSchema = z.enum(["complete", "unknown"]);
const byteRange = z.strictObject({ offset, length: offset });
const storedWindow = {
  declared_file_offset: z.number().int(),
  stored_offset: offset.nullable(),
  stored_size: offset,
  availability: z.enum(["empty", "missing", "truncated", "complete"]),
};
export const espFlashRegionMetadataSchema = z.strictObject({
  kind: z.literal("esp-flash-region"),
  role: z.enum(["bootloader", "partition-table"]),
  flash_address: uint32,
  size: offset,
  ...storedWindow,
});
export const espFlashPartitionMetadataSchema = z.strictObject({
  kind: z.literal("esp-flash-partition"),
  ...storedWindow,
  label_bytes_hex: z.string().regex(/^[0-9a-f]{32}$/u),
  /** Position among the table's partition entries. */
  index: uint8,
  /** The label up to its first NUL; null when it is not UTF-8. */
  label: z.string().nullable(),
  /** The label's bytes up to its first NUL in hex, when it is not UTF-8. */
  label_hex: z
    .string()
    .regex(/^(?:[0-9a-f]{2}){1,16}$/u)
    .nullable(),
  type: uint8,
  subtype: uint8,
  /** `gen_esp32part.py` names; null for values it does not name. */
  type_name: z.string().nullable(),
  subtype_name: z.string().nullable(),
  flash_address: uint32,
  size: uint32,
  encrypted: z.boolean(),
  readonly: z.boolean(),
  /** Flag bits other than `encrypted` and `readonly`, which ESP-IDF ignores. */
  unknown_flags: uint32,
  /**
   * Observed in the bytes the dump holds, from the partition's start: the
   * first byte that is not 0xFF and just past the last, null when every byte
   * is erased, and how many bytes are not 0xFF. All null for a partition the
   * dump holds none of.
   */
  written_offset: uint32.nullable(),
  written_end: uint32.nullable(),
  written_bytes: uint32.nullable(),
});

/** ESP image facts for a region of a dump; offsets are relative to the region. */
export const espFlashImageFactsSchema = z.strictObject({
  /** An ESP image, erased flash, or bytes that are not one, such as ciphertext. */
  status: z.enum(["esp-image", "erased", "unrecognized", "unavailable"]),
  image: espImageMetadataSchema.nullable(),
  segments: z.array(espImageSegmentMetadataSchema),
  signature_blocks: z.array(espImageSignatureBlockMetadataSchema),
  coverage: completeOrUnknownCoverageSchema.nullable(),
  limitations: z.array(z.string()),
});

const espOtaRecordSchema = z.strictObject({
  index: z.union([z.literal(0), z.literal(1)]),
  ota_seq: uint32,
  seq_label: z.string().regex(/^[0-9a-f]{40}$/u),
  ota_state: uint32,
  state_name: z
    .enum(["new", "pending-verify", "valid", "invalid", "aborted", "undefined"])
    .nullable(),
  crc: uint32,
  computed_crc: uint32,
  /** CRC-32 of `ota_seq` seeded with 0xFFFFFFFF, as the bootloader checks it. */
  crc_matches: z.boolean(),
  valid: z.boolean(),
});

/**
 * An ESP flash dump: where it sits in flash, its bootloader, partition table,
 * partitions and OTA data. Entries are the table's partitions; app and
 * bootloader regions carry their ESP image facts here.
 */
export const espFlashImageMetadataSchema = z.strictObject({
  kind: z.literal("esp-flash-image"),
  coverage: completeOrUnknownCoverageSchema.describe(
    "Byte coverage within the selected layout; not complete payload semantics or observed device behavior.",
  ),
  /** Flash address of the file's first byte: 0 unless the caller gave one. */
  flash_offset: z.strictObject({
    value: uint32,
    source: z.enum(["default", "caller"]),
  }),
  /** From the bootloader's `chip_id`; null without a located bootloader. */
  chip: espImageMetadataSchema.shape.chip,
  /**
   * The image at its chip's ROM offset, through the partition table; `path`
   * is its entry.
   */
  bootloader: z
    .strictObject({
      path: z.string(),
      flash_address: uint32,
      region_size: offset,
      facts: espFlashImageFactsSchema,
    })
    .nullable(),
  partition_table: z.strictObject({
    flash_address: uint32,
    /** 0x8000, the caller's offset, or a scan for a verified MD5 (derived). */
    method: z.enum(["default", "caller", "scan"]),
    partition_count: uint8,
    md5_entries: z.array(
      z.strictObject({
        entry_offset: offset,
        stored: z.string().regex(/^[0-9a-f]{32}$/u),
        computed: z.string().regex(/^[0-9a-f]{32}$/u),
        matches: z.boolean(),
      }),
    ),
    md5: z.strictObject({
      status: z.enum(["valid", "invalid", "absent"]),
      stored: z
        .string()
        .regex(/^[0-9a-f]{32}$/u)
        .nullable(),
      computed: z
        .string()
        .regex(/^[0-9a-f]{32}$/u)
        .nullable(),
    }),
  }),
  /** ESP image facts for each app partition the dump holds, by its entry. */
  apps: z.array(
    z.strictObject({
      path: z.string(),
      partition_index: uint8,
      facts: espFlashImageFactsSchema,
    }),
  ),
  /** The otadata partition the bootloader uses: the last one declared. */
  otadata: z
    .strictObject({
      partition_index: uint8,
      /** The records the dump holds, at most one per sector. */
      records: z.array(espOtaRecordSchema).max(2),
    })
    .nullable(),
  /**
   * The app the bootloader would select, derived for every table under the
   * stated assumptions. `basis` names the branch: `otadata`,
   * `factory-fallback` and `ota_0-fallback` from the otadata records,
   * `no-otadata` for a table without otadata (the factory index), `none`
   * for the bootloader's INVALID_INDEX, after which it resets, and
   * `unknown` when the dump lacks a record the bootloader reads.
   * `partition_index` is null when the table declares no partition for the
   * selected slot or fallback.
   */
  boot_selection: z.strictObject({
    basis: z.enum([
      "otadata",
      "factory-fallback",
      "ota_0-fallback",
      "no-otadata",
      "none",
      "unknown",
    ]),
    active_record: z.union([z.literal(0), z.literal(1)]).nullable(),
    slot: uint8.nullable(),
    partition_index: uint8.nullable(),
    assumptions: z.array(z.string()),
    /** Rollback, anti-rollback and load fallback decide it at boot. */
    running_partition: z.literal("unknown"),
  }),
  /**
   * Ranges outside every described region, each from a byte that is not
   * erased flash to the end of its gap.
   */
  undescribed: z.array(byteRange),
});
export type EspFlashImageMetadata = z.infer<typeof espFlashImageMetadataSchema>;
