import {
  createUf2Decoder,
  type Uf2Image,
  type Uf2Capacity,
} from "../domain/firmware/uf2.js";
import type { RegionDecodeFailure } from "../domain/firmware/regionDecoder.js";
import { resolveFirmwareCapacity } from "../domain/firmware/firmwareCapacity.js";
import type { StableRegularFileDescriptor } from "../filesystem/RegularFile.js";
import { DecodedRegionArtifactReader } from "./DecodedRegionArtifactReader.js";
import {
  firmwareDecodeFailure,
  firmwareRegionEntry,
  textAddress,
} from "./FirmwareRegionEntry.js";
export class Uf2ArtifactReader extends DecodedRegionArtifactReader<Uf2Image> {
  readonly format = "uf2";
  constructor(
    path: string,
    admitted?: StableRegularFileDescriptor,
    private readonly capacity: Uf2Capacity = resolveFirmwareCapacity(),
  ) {
    super(path, admitted);
  }
  protected decoder(fileBytes: number) {
    return createUf2Decoder(fileBytes, this.capacity);
  }
  protected decodeFailure(failure: RegionDecodeFailure): never {
    return firmwareDecodeFailure(failure, {
      maxFileBytes: this.capacity.maxFileBytes,
      maxRuns: this.capacity.maxRuns,
    });
  }
  protected regions(image: Uf2Image) {
    return image.regions.map((region) => ({
      bytes: region.bytes,
      entry: firmwareRegionEntry(
        `${region.familyId === null ? "no-family" : `family-${textAddress(region.familyId)}`}/${textAddress(region.start)}-${textAddress(region.end)}.bin`,
        region.bytes.length,
        null,
        {
          kind: "uf2-region",
          family_id: region.familyId,
          family_name: region.familyName,
          start_address: region.start,
          end_address: region.end,
          length: region.bytes.length,
          block_count: region.blockCount,
          first_file_block: region.firstFileBlock,
          last_file_block: region.lastFileBlock,
        },
        [
          "Decoded UF2 main-flash address range; not a contiguous carrier-file interval, CPU profile or observed device memory. Family names are registry labels, not device identification.",
          ...image.limitations,
        ],
      ),
    }));
  }
}
