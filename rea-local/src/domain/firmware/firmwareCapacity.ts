import { z } from "zod";
export interface FirmwareCapacity {
  readonly maxFileBytes: number;
  readonly maxRuns: number;
  readonly maxElements: number;
  readonly maxTreeNodes: number;
  readonly maxTreeProperties: number;
  readonly maxTreeDepth: number;
  readonly maxMetadataBytes: number;
  readonly maxHashBytes: number;
}

/** Allocation policy, not a format limit. DfuSe retains the file once; UF2/HEX also merge payload copies. */
const DEFAULT_FILE_BYTES = 128 * 1024 * 1024;
/** Bounds retained run metadata and the resulting artifact graph independently of payload bytes. */
const DEFAULT_RUNS = 65_536;
export const firmwareCapacityInputShape = {
  max_firmware_file_bytes: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "Firmware carrier-byte admission budget; default 134217728. Intel HEX/S-record payload arenas are at most half the carrier, UF2 arenas at most 476/512; merging temporarily copies payload. DfuSe retains one carrier and element views. uImage/FIT/ESP also retain one carrier with payload views. This resource policy applies to supported structured firmware formats.",
    ),
  max_firmware_runs: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "Intel HEX/S-record/UF2 run admission budget before address merging; default 65536. Bounds retained run metadata and derived regions. Only supported for Intel HEX, S-record and UF2.",
    ),
  max_firmware_elements: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "DfuSe declared elements (including empty), uImage payload/component entries, or FIT image entries; default 65536. Bounds element processing and derived graph entries before expansion. Supported for DfuSe, uImage and FIT.",
    ),
  max_firmware_tree_nodes: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "FIT FDT node admission budget; default 65536. Includes configuration/hash/signature nodes, before representation expansion.",
    ),
  max_firmware_tree_properties: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "FIT FDT property admission budget; default 262144. Only supported for FIT.",
    ),
  max_firmware_tree_depth: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "FIT FDT nesting admission budget; default 256. Only supported for FIT.",
    ),
  max_firmware_metadata_bytes: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "FIT/ESP-flash metadata admission budget; default 33554432. FIT charges tree/metadata expansion. Flash conservatively reserves locator/table metadata, region metadata and per-image output facts before expansion. Stored payload views do not consume this budget.",
    ),
  max_firmware_hash_bytes: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "FIT hash byte-work or ESP-flash conservative scan/image-hash work budget; default 1073741824. Flash charges locator reads, worst-case table MD5 prefixes, merged written/gap scans and three times each newly decoded image range. Identical range computations are reused. Admitted before work; only FIT/ESP-flash.",
    ),
};
export type FirmwareCapacityInput = {
  readonly max_firmware_file_bytes?: number | undefined;
  readonly max_firmware_runs?: number | undefined;
  readonly max_firmware_elements?: number | undefined;
  readonly max_firmware_tree_nodes?: number | undefined;
  readonly max_firmware_tree_properties?: number | undefined;
  readonly max_firmware_tree_depth?: number | undefined;
  readonly max_firmware_metadata_bytes?: number | undefined;
  readonly max_firmware_hash_bytes?: number | undefined;
};
export const resolveFirmwareCapacity = (
  input: FirmwareCapacityInput = {},
): FirmwareCapacity => ({
  maxFileBytes: input.max_firmware_file_bytes ?? DEFAULT_FILE_BYTES,
  maxRuns: input.max_firmware_runs ?? DEFAULT_RUNS,
  maxElements: input.max_firmware_elements ?? DEFAULT_RUNS,
  maxTreeNodes: input.max_firmware_tree_nodes ?? 65_536,
  maxTreeProperties: input.max_firmware_tree_properties ?? 262_144,
  maxTreeDepth: input.max_firmware_tree_depth ?? 256,
  maxMetadataBytes: input.max_firmware_metadata_bytes ?? 33_554_432,
  maxHashBytes: input.max_firmware_hash_bytes ?? 1_073_741_824,
});
