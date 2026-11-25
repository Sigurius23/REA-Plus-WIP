import { AnalysisResourceConstraintError } from "../domain/analysisErrorCore.js";
import type { FirmwareFormatMetadata } from "../domain/firmware/firmwareMetadata.js";
import type { RegionDecodeFailure } from "../domain/firmware/regionDecoder.js";
import { ArtifactReaderFailure, type ArtifactEntry } from "./ArtifactReader.js";
export const textAddress = (address: number): string =>
  `0x${address.toString(16).padStart(8, "0")}`;
export const firmwareRegionEntry = (
  path: string,
  length: number,
  byteOffset: number | null,
  formatMetadata: FirmwareFormatMetadata,
  limitations: readonly string[],
): ArtifactEntry => ({
  path,
  adapterKey: path,
  kind: "file",
  declaredSize: length,
  compressedSize: null,
  byteOffset,
  executable: false,
  encrypted: false,
  declaredSha256: null,
  unpacked: false,
  limitations,
  formatMetadata,
});
export const firmwareDecodeFailure = (
  failure: RegionDecodeFailure,
  capacity: {
    readonly maxFileBytes: number;
    readonly maxRuns?: number;
    readonly maxElements?: number;
  },
): never => {
  if (failure.kind === "limit") {
    const limits = {
      max_firmware_file_bytes: capacity.maxFileBytes,
      ...(capacity.maxRuns === undefined
        ? {}
        : { max_firmware_runs: capacity.maxRuns }),
      ...(capacity.maxElements === undefined
        ? {}
        : { max_firmware_elements: capacity.maxElements }),
    };
    throw new AnalysisResourceConstraintError(
      "decode_firmware_records",
      failure.boundary === "file-size" ? "file-size" : "memory",
      failure.message,
      limits,
      {
        remediationAction: `Increase the applicable caller input (${Object.keys(limits).join(", ")}) within available memory. Repeating unchanged limits reproduces the refusal.`,
      },
    );
  }
  throw new ArtifactReaderFailure("format", failure.message);
};
