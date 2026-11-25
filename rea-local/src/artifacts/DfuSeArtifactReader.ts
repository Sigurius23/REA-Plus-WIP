import {
  createDfuSeDecoder,
  type DfuSeImage,
  type DfuSeCapacity,
} from "../domain/firmware/dfuse.js";
import type { RegionDecodeFailure } from "../domain/firmware/regionDecoder.js";
import { resolveFirmwareCapacity } from "../domain/firmware/firmwareCapacity.js";
import type { StableRegularFileDescriptor } from "../filesystem/RegularFile.js";
import type { ArtifactIntegrityPolicyName } from "../domain/artifactIntegrityPolicy.js";
import { ArtifactReaderFailure } from "./ArtifactReader.js";
import { DecodedRegionArtifactReader } from "./DecodedRegionArtifactReader.js";
import {
  firmwareDecodeFailure,
  firmwareRegionEntry,
  textAddress,
} from "./FirmwareRegionEntry.js";
export class DfuSeArtifactReader extends DecodedRegionArtifactReader<DfuSeImage> {
  readonly format = "dfuse";
  constructor(
    path: string,
    admitted?: StableRegularFileDescriptor,
    private readonly capacity: DfuSeCapacity = resolveFirmwareCapacity(),
    private readonly integrity: ArtifactIntegrityPolicyName = "fail",
  ) {
    super(path, admitted);
  }
  protected decoder(fileBytes: number) {
    return createDfuSeDecoder(fileBytes, this.capacity);
  }
  protected decodeFailure(failure: RegionDecodeFailure): never {
    return firmwareDecodeFailure(failure, {
      maxFileBytes: this.capacity.maxFileBytes,
      maxElements: this.capacity.maxElements,
    });
  }
  protected regions(image: DfuSeImage) {
    if (
      image.metadata.suffix_crc !== image.metadata.computed_crc &&
      this.integrity === "fail"
    )
      throw new ArtifactReaderFailure(
        "integrity",
        `DfuSe suffix CRC mismatch: declared ${textAddress(image.metadata.suffix_crc)}, computed ${textAddress(image.metadata.computed_crc)}. Select integrity_policy=record-and-continue to retain observed-untrusted element bytes.`,
      );
    return image.elements.map((element) => ({
      bytes: element.bytes,
      entry: firmwareRegionEntry(
        `target-${String(element.targetIndex)}/element-${String(element.elementIndex)}-${textAddress(element.address)}-${textAddress(element.address + element.bytes.length - 1)}.bin`,
        element.bytes.length,
        element.dataOffset,
        {
          kind: "dfuse-element",
          target_index: element.targetIndex,
          alternate_setting: element.alternateSetting,
          target_name: element.targetName,
          element_index: element.elementIndex,
          start_address: element.address,
          end_address: element.address + element.bytes.length - 1,
          length: element.bytes.length,
        },
        [
          "DfuSe-declared element load address and target alternate setting; not a CPU profile or observed device memory. Source location is the contiguous carrier payload interval.",
          ...image.limitations,
        ],
      ),
    }));
  }
}
