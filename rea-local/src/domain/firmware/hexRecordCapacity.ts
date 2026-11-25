import { z } from "zod";
import type { HexRecordCapacity } from "./hexRecords.js";

/** Allocation/output policy, not a firmware-format limit. At most half the carrier is payload. */
const DEFAULT_FILE_BYTES = 128 * 1024 * 1024;
/** Bounds retained run metadata and the resulting artifact graph independently of payload bytes. */
const DEFAULT_RUNS = 65_536;
export const hexRecordCapacityInputShape = {
  max_firmware_file_bytes: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "Intel HEX/S-record carrier-byte admission budget; default 134217728. The decoder retains at most half as payload and temporarily another payload copy while merging. This is a resource policy, not a format limit. Only supported for these active firmware formats.",
    ),
  max_firmware_runs: z
    .number()
    .int()
    .positive()
    .exactOptional()
    .describe(
      "Intel HEX/S-record address-discontiguous record-run admission budget; default 65536. Bounds run metadata and derived regions before graph expansion. Only supported for these active firmware formats.",
    ),
};
export type HexRecordCapacityInput = {
  readonly max_firmware_file_bytes?: number | undefined;
  readonly max_firmware_runs?: number | undefined;
};
export const resolveHexRecordCapacity = (
  input: HexRecordCapacityInput = {},
): HexRecordCapacity => ({
  maxFileBytes: input.max_firmware_file_bytes ?? DEFAULT_FILE_BYTES,
  maxRuns: input.max_firmware_runs ?? DEFAULT_RUNS,
});
