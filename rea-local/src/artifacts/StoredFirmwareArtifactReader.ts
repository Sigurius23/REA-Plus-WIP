import {
  DecodedRegionArtifactReader,
  type DecodedFirmwareImage,
} from "./DecodedRegionArtifactReader.js";
import { ArtifactReaderFailure } from "./ArtifactReader.js";
import type { FirmwareFormatMetadata } from "../domain/firmware/firmwareMetadata.js";
import type { FirmwareCapacity } from "../domain/firmware/firmwareCapacity.js";
import type { ArtifactIntegrityPolicyName } from "../domain/artifactIntegrityPolicy.js";
import type { RegionDecodeFailure } from "../domain/firmware/regionDecoder.js";
import type { Result } from "../domain/result.js";
import type { StableRegularFileDescriptor } from "../filesystem/RegularFile.js";
import { createRetainedFirmwareDecoder } from "../domain/firmware/retainedFirmwareDecoder.js";
import {
  firmwareDecodeFailure,
  firmwareRegionEntry,
} from "./FirmwareRegionEntry.js";

export interface StoredFirmwareImage extends DecodedFirmwareImage {
  readonly regions: readonly {
    readonly path: string;
    readonly offset: number | null;
    readonly bytes: Uint8Array;
    readonly metadata: FirmwareFormatMetadata;
  }[];
  readonly integrityFailures: readonly string[];
}
export const STORED_FIRMWARE_SCOPE =
  "Stored firmware bytes; load/entry/architecture/compression are file declarations, not observed execution or device identity. Payloads are not decompressed.";
/** New stored-carrier formats share the proven source, stream and cleanup owner. */
export class StoredFirmwareArtifactReader extends DecodedRegionArtifactReader<StoredFirmwareImage> {
  constructor(
    path: string,
    readonly format: "uimage" | "fit" | "esp-image" | "esp-flash-image",
    admitted: StableRegularFileDescriptor | undefined,
    private readonly capacity: FirmwareCapacity,
    private readonly integrity: ArtifactIntegrityPolicyName,
    private readonly parse: (
      bytes: Uint8Array,
      signal?: AbortSignal,
    ) => Result<StoredFirmwareImage, RegionDecodeFailure>,
  ) {
    super(path, admitted);
  }
  protected decoder(fileBytes: number, signal?: AbortSignal) {
    return createRetainedFirmwareDecoder(
      fileBytes,
      this.capacity.maxFileBytes,
      (bytes) => this.parse(bytes, signal),
    );
  }
  protected decodeFailure(failure: RegionDecodeFailure): never {
    return firmwareDecodeFailure(failure, {
      maxFileBytes: this.capacity.maxFileBytes,
      ...(["esp-image", "esp-flash-image"].includes(this.format)
        ? {}
        : { maxElements: this.capacity.maxElements }),
      ...(!["fit", "esp-flash-image"].includes(this.format)
        ? {}
        : {
            maxMetadataBytes: this.capacity.maxMetadataBytes,
            maxHashBytes: this.capacity.maxHashBytes,
          }),
      ...(this.format !== "fit"
        ? {}
        : {
            maxTreeNodes: this.capacity.maxTreeNodes,
            maxTreeProperties: this.capacity.maxTreeProperties,
            maxTreeDepth: this.capacity.maxTreeDepth,
          }),
    });
  }
  protected regions(image: StoredFirmwareImage) {
    if (image.integrityFailures.length > 0 && this.integrity === "fail")
      throw new ArtifactReaderFailure(
        "integrity",
        `${this.format} has ${String(image.integrityFailures.length)} integrity disagreement(s): ${image.integrityFailures.slice(0, 4).join("; ")}${image.integrityFailures.length > 4 ? "; further disagreements are available under explicit continuation" : ""}. Select integrity_policy=record-and-continue to retain observed-untrusted payload bytes and complete format metadata.`,
      );
    return image.regions.map((region) => ({
      bytes: region.bytes,
      entry: firmwareRegionEntry(
        region.path,
        region.bytes.length,
        region.offset,
        region.metadata,
        [
          STORED_FIRMWARE_SCOPE,
          ...(image.integrityFailures.length === 0
            ? []
            : [
                "Carrier integrity disagreements were explicitly continued; derived bytes are observed-untrusted. Exact checks remain in format metadata.",
              ]),
        ],
      ),
    }));
  }
}
