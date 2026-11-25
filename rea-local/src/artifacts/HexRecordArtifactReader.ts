import {
  createHexRecordDecoder,
  type HexRecordImage,
  type HexRecordCapacity,
} from "../domain/firmware/hexRecords.js";
import type { HexRecordEncoding } from "../domain/firmware/hexRecordSyntax.js";
import type { RegionDecodeFailure } from "../domain/firmware/regionDecoder.js";
import { resolveFirmwareCapacity } from "../domain/firmware/firmwareCapacity.js";
import type { StableRegularFileDescriptor } from "../filesystem/RegularFile.js";
import { DecodedRegionArtifactReader } from "./DecodedRegionArtifactReader.js";
import {
  firmwareDecodeFailure,
  firmwareRegionEntry,
  textAddress,
} from "./FirmwareRegionEntry.js";
/** Sparse text records; address gaps never become zero bytes. */
export class HexRecordArtifactReader extends DecodedRegionArtifactReader<HexRecordImage> {
  constructor(
    path: string,
    readonly format: HexRecordEncoding,
    admitted?: StableRegularFileDescriptor,
    private readonly capacity: HexRecordCapacity = resolveFirmwareCapacity(),
  ) {
    super(path, admitted);
  }
  protected decoder(fileBytes: number) {
    return createHexRecordDecoder(this.format, fileBytes, this.capacity);
  }
  protected decodeFailure(failure: RegionDecodeFailure): never {
    return firmwareDecodeFailure(failure, {
      maxFileBytes: this.capacity.maxFileBytes,
      maxRuns: this.capacity.maxRuns,
    });
  }
  protected regions(image: HexRecordImage) {
    return image.regions.map((region) => ({
      bytes: region.bytes,
      entry: firmwareRegionEntry(
        `${textAddress(region.start)}-${textAddress(region.end)}.bin`,
        region.bytes.length,
        null,
        {
          kind: "hex-record-region",
          start_address: region.start,
          end_address: region.end,
          length: region.bytes.length,
          record_count: region.recordCount,
          first_line: region.firstLine,
          last_line: region.lastLine,
        },
        [
          "Decoded firmware address range; not a contiguous carrier-file interval, CPU profile or observed device memory.",
          ...image.limitations,
        ],
      ),
    }));
  }
}
