import { parseAndroidBootImage } from "../domain/firmware/androidBootImage.js";
import { parseAndroidOtaImage } from "../domain/firmware/androidOtaImage.js";
import { parseEspFlashImage } from "../domain/firmware/espFlashImage.js";
import {
  resolveEspFlashSelection,
  type EspFlashSelectionInput,
} from "../domain/targetFormatSelection.js";
import { ok } from "../domain/result.js";
import { parseUImage } from "../domain/firmware/uimage.js";
import { parseFitImage } from "../domain/firmware/fitImage.js";
import { parseEspImage } from "../domain/firmware/espImage.js";
import { ESP_IMAGE_LIMITATIONS } from "../domain/firmware/espImageFacts.js";
import { ESP_SIGNATURE_BLOCK_BYTES } from "../domain/firmware/espImageStructures.js";
import {
  resolveFirmwareCapacity,
  type FirmwareCapacity,
} from "../domain/firmware/firmwareCapacity.js";
import type { ArtifactIntegrityPolicyName } from "../domain/artifactIntegrityPolicy.js";
import type { StableRegularFileDescriptor } from "../filesystem/RegularFile.js";
import {
  StoredFirmwareArtifactReader,
  STORED_FIRMWARE_SCOPE,
} from "./StoredFirmwareArtifactReader.js";

export function createStoredFirmwareReader(
  path: string,
  format:
    | "uimage"
    | "fit"
    | "esp-image"
    | "esp-flash-image"
    | "android-boot-image"
    | "android-ota-payload",
  admitted?: StableRegularFileDescriptor,
  capacity: FirmwareCapacity = resolveFirmwareCapacity(),
  integrity: ArtifactIntegrityPolicyName = "fail",
  selection: EspFlashSelectionInput = {},
) {
  return new StoredFirmwareArtifactReader(
    path,
    format,
    admitted,
    capacity,
    integrity,
    (bytes, signal) => {
      const parsed =
        format === "android-boot-image"
          ? parseAndroidBootImage(bytes, capacity, signal)
          : format === "android-ota-payload"
            ? parseAndroidOtaImage(bytes, capacity, signal)
            : format === "esp-flash-image"
              ? parseEspFlashImage(
                  bytes,
                  resolveEspFlashSelection(selection),
                  capacity,
                  signal,
                )
              : format === "uimage"
                ? parseUImage(bytes, capacity)
                : format === "fit"
                  ? parseFitImage(bytes, capacity)
                  : parseEspImage(bytes);
      if (!parsed.ok) return parsed;
      const image = parsed.value;
      const trust =
        image.integrityFailures.length === 0
          ? []
          : [
              "Carrier integrity disagreements were explicitly continued; carrier and derived bytes are observed-untrusted.",
            ];
      if ("regions" in image)
        return ok({
          ...image,
          limitations: [STORED_FIRMWARE_SCOPE, ...image.limitations, ...trust],
        });
      return ok({
        ...image,
        limitations: [
          STORED_FIRMWARE_SCOPE,
          ESP_IMAGE_LIMITATIONS.inventoryScope,
          ...image.limitations,
          ...trust,
        ],
        regions: [
          ...image.segments.map((segment) => ({
            path: `segment-${String(segment.metadata.index).padStart(2, "0")}.bin`,
            offset: segment.dataOffset,
            bytes: bytes.subarray(
              segment.dataOffset,
              segment.dataOffset + segment.availableLength,
            ),
            metadata: segment.metadata,
          })),
          ...image.signatureBlocks.map((block) => ({
            path: `signature-block-${String(block.metadata.index)}.bin`,
            offset: block.offset,
            bytes: bytes.subarray(
              block.offset,
              block.offset + ESP_SIGNATURE_BLOCK_BYTES,
            ),
            metadata: block.metadata,
          })),
        ],
      });
    },
  );
}
