import { z } from "zod";
export interface FirmwareCapacity {
  readonly maxFileBytes: number;
  readonly maxRuns: number;
  readonly maxElements: number;
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
      "Firmware carrier-byte admission budget; default 134217728. Intel HEX/S-record payload arenas are at most half the carrier, UF2 arenas at most 476/512; merging temporarily copies payload. DfuSe retains one carrier and element views. This resource policy applies to Intel HEX, S-record, UF2 and DfuSe.",
    ),
  max_firmware_runs: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "Intel HEX/S-record/UF2 run admission budget before address merging; default 65536. Bounds retained run metadata and derived regions. Not supported for DfuSe.",
    ),
  max_firmware_elements: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "DfuSe declared-element admission budget, including empty elements; default 65536. Bounds element processing and derived graph entries before expansion. Only supported for DfuSe.",
    ),
};
export type FirmwareCapacityInput = {
  readonly max_firmware_file_bytes?: number | undefined;
  readonly max_firmware_runs?: number | undefined;
  readonly max_firmware_elements?: number | undefined;
};
export const resolveFirmwareCapacity = (
  input: FirmwareCapacityInput = {},
): FirmwareCapacity => ({
  maxFileBytes: input.max_firmware_file_bytes ?? DEFAULT_FILE_BYTES,
  maxRuns: input.max_firmware_runs ?? DEFAULT_RUNS,
  maxElements: input.max_firmware_elements ?? DEFAULT_RUNS,
});
