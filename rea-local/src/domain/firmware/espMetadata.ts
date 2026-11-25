import { z } from "zod";
const offset = z.number().int().nonnegative();
const uint32 = offset.max(0xffff_ffff);

const uint8 = z.number().int().min(0).max(0xff);
const uint16 = z.number().int().min(0).max(0xffff);
const sha256Hex = z.string().regex(/^[0-9a-f]{64}$/u);
const byteRange = z.strictObject({ offset, length: offset });

/** Derived from `chip_id` through the cited table. */
const espChipFactsSchema = z.strictObject({
  target: z.string(),
  isa: z.enum(["xtensa", "riscv"]),
  source: z.string(),
});

/**
 * `esp_app_desc_t` fields, as ESP-IDF names them; strings stop at NUL. A field
 * the file cuts off is null; `observed_length` says where the descriptor ends.
 */
const espAppDescriptorSchema = z.strictObject({
  kind: z.literal("app"),
  offset,
  /** Descriptor bytes the file holds, at most the 256 of `esp_app_desc_t`. */
  observed_length: z.int().min(4).max(256),
  secure_version: uint32.nullable(),
  version: z.string().nullable(),
  project_name: z.string().nullable(),
  time: z.string().nullable(),
  date: z.string().nullable(),
  idf_ver: z.string().nullable(),
  app_elf_sha256: sha256Hex.nullable(),
  min_efuse_blk_rev_full: uint16.nullable(),
  max_efuse_blk_rev_full: uint16.nullable(),
  /**
   * ESP-IDF's value: the MMU page size as a base-2 logarithm (16 is 64 KiB);
   * 0 in images built before ESP-IDF v5.4.
   */
  mmu_page_size: uint8.nullable(),
  /**
   * The byte ESP-IDF v6.1 names `spi_flash_mode`, as stored; REA does not
   * interpret it. Releases that reserve this byte leave it zero.
   */
  spi_flash_mode: uint8.nullable(),
});

/** `esp_bootloader_desc_t` fields, as ESP-IDF names them. */
const espBootloaderDescriptorSchema = z.strictObject({
  kind: z.literal("bootloader"),
  offset,
  secure_version: uint8,
  version: uint32,
  idf_ver: z.string().nullable(),
  date_time: z.string().nullable(),
});

/**
 * ESP32-family image facts. `header` and the descriptor fields are observed;
 * the descriptor kind, `chip`, the integrity statuses and the trailing-byte
 * ranges are derived.
 */
export const espImageMetadataSchema = z.strictObject({
  kind: z.literal("esp-image"),
  coverage: z.enum(["complete", "unknown"]),
  signature_slots: z
    .array(
      z.strictObject({
        index: uint8.max(2),
        offset,
        observed_length: offset.max(1216),
        magic: uint8.nullable(),
        stored_crc32: uint32.nullable(),
        computed_crc32: uint32.nullable(),
        status: z.enum([
          "valid",
          "invalid",
          "truncated",
          "erased",
          "unrecognized",
        ]),
      }),
    )
    .max(3),
  /** `esp_image_header_t` fields, as ESP-IDF names them. */
  header: z.strictObject({
    segment_count: uint8.max(16),
    spi_mode: uint8,
    spi_speed: uint8,
    spi_size: uint8,
    entry_addr: uint32,
    wp_pin: uint8,
    spi_pin_drv: z.string().regex(/^[0-9a-f]{6}$/u),
    chip_id: uint16,
    min_chip_rev: uint8,
    min_chip_rev_full: uint16,
    max_chip_rev_full: uint16,
    reserved: z.string().regex(/^[0-9a-f]{8}$/u),
    hash_appended: z.boolean(),
  }),
  /** Derived from `chip_id` through the cited table; null for unknown IDs. */
  chip: espChipFactsSchema.nullable(),
  checksum: z.strictObject({
    offset: offset.nullable(),
    stored: uint8.nullable(),
    computed: uint8.nullable(),
    status: z.enum(["valid", "invalid", "unavailable"]),
  }),
  /** The SHA-256 the header's `hash_appended` adds after the checksum. */
  appended_sha256: z.strictObject({
    offset: offset.nullable(),
    stored: sha256Hex.nullable(),
    computed: sha256Hex.nullable(),
    status: z.enum(["valid", "invalid", "unavailable", "not-appended"]),
  }),
  /** End of the checksum block and any digest; null when truncated before it. */
  image_end: offset.nullable(),
  /** Derived sector boundary containing complete candidate signature blocks; CRC validity is separate. */
  signature_sector_offset: offset.nullable(),
  /** Bytes after the image that no padding, signature or erased flash describes. */
  undescribed_trailing: z.array(byteRange),
  /** Its kind classifies the image as an app or a bootloader. */
  descriptor: z
    .discriminatedUnion("kind", [
      espAppDescriptorSchema,
      espBootloaderDescriptorSchema,
    ])
    .nullable(),
  /**
   * Unknown in standalone image parsing. Flash origin and partition selection
   * require separate flash-layout evidence, not an inferred default offset.
   */
  flash_dump: z
    .strictObject({ flash_offset: uint32, table_file_offset: offset })
    .nullable(),
});
export type EspImageMetadata = z.infer<typeof espImageMetadataSchema>;

/** One header-declared segment; `data_len` is declared, not available. */
export const espImageSegmentMetadataSchema = z.strictObject({
  kind: z.literal("esp-image-segment"),
  index: uint8.max(15),
  load_addr: uint32,
  data_len: uint32,
  header_offset: offset,
  /** ESP-IDF's cold-boot `should_map` and `should_load`; derived. */
  classification: z.enum(["mapped", "loaded", "not-loaded", "unknown"]),
});
export type EspImageSegmentMetadata = z.infer<
  typeof espImageSegmentMetadataSchema
>;

/** One complete candidate Secure Boot v2 block with 0xE7 magic. CRC consistency is independent of signature authenticity. */
export const espImageSignatureBlockMetadataSchema = z.strictObject({
  kind: z.literal("esp-image-signature-block"),
  /** Slot in the signature sector, 0 to 2. */
  index: uint8.max(2),
  version: uint8,
  scheme: z.enum(["rsa", "ecdsa"]).nullable(),
  /** Third block byte for ECDSA: 0 selects SHA-256, 1 SHA-384. */
  sha_version: uint8.nullable(),
  curve_id: uint8.nullable(),
  digest_algorithm: z.enum(["sha256", "sha384"]).nullable(),
  image_digest: z
    .string()
    .regex(/^(?:[0-9a-f]{64}|[0-9a-f]{96})$/u)
    .nullable(),
  /** Whether `image_digest` equals the digest of the bytes before the sector. */
  image_digest_matches: z.boolean().nullable(),
  /** SHA-256 of the block's public key, the value eFuse key digests hold. */
  public_key_sha256: sha256Hex.nullable(),
  /** REA checks no key, signature or eFuse. */
  signature_status: z.literal("unverified"),
  computed_image_digest: z
    .string()
    .regex(/^(?:[0-9a-f]{64}|[0-9a-f]{96})$/u)
    .nullable(),
  crc32: z.strictObject({
    stored: uint32,
    computed: uint32,
    status: z.enum(["valid", "invalid"]),
  }),
});
export type EspImageSignatureBlockMetadata = z.infer<
  typeof espImageSignatureBlockMetadataSchema
>;
