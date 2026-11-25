import type { ArtifactInventoryResult } from "../artifactGraph.js";
import type { JsonValue } from "../jsonValue.js";
import type { FirmwareFormatMetadata } from "./firmwareMetadata.js";
/** Compact integrity view; complete declarations and exact digests remain once in occurrence metadata. */
export function firmwareIntegrityObservation(
  metadata: FirmwareFormatMetadata | undefined,
  occurrences: ArtifactInventoryResult["occurrences"],
): Record<string, JsonValue> | undefined {
  if (metadata?.kind === "uimage")
    return {
      format: "uimage",
      algorithm: "crc32",
      header: {
        declared: metadata.header_crc32,
        computed: metadata.computed_header_crc32,
      },
      payload: {
        declared: metadata.data_crc32,
        computed: metadata.computed_data_crc32,
      },
      status: metadata.crc_verified ? "matches" : "mismatched",
      trust: metadata.crc_verified
        ? "checksum-consistent-not-authenticated"
        : "observed-untrusted",
    };
  if (metadata?.kind === "esp-image")
    return {
      format: "esp-image",
      checksum: metadata.checksum,
      appended_sha256: metadata.appended_sha256,
      signature_slots: metadata.signature_slots,
      signature_authentication: "unverified",
      coverage: metadata.coverage,
    };
  if (metadata?.kind === "fit") {
    let images = 0,
      verified = 0,
      mismatched = 0,
      unverified = 0,
      signatures = metadata.configurations.reduce(
        (sum, c) => sum + c.signature_count,
        0,
      );
    for (const occurrence of occurrences) {
      const image = occurrence.format_metadata;
      if (image?.kind !== "fit-image") continue;
      images++;
      verified += image.hashes_verified;
      mismatched += image.hashes_mismatched;
      unverified += image.hashes_unverified;
      signatures += image.signature_count;
    }
    return {
      format: "fit",
      images,
      hashes_matching: verified,
      hashes_mismatched: mismatched,
      hashes_unverified: unverified,
      configurations: metadata.configurations.length,
      signatures_declared: signatures,
      signature_authentication: "unverified",
    };
  }
  return undefined;
}
