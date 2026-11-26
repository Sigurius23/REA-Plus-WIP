import type { ArtifactInventoryResult } from "../artifactGraph.js";
import type { JsonValue } from "../jsonValue.js";
import type { FirmwareFormatMetadata } from "./firmwareMetadata.js";
/** Compact integrity view; complete declarations and exact digests remain once in occurrence metadata. */
export function firmwareIntegrityObservation(
  metadata: FirmwareFormatMetadata | undefined,
  occurrences: ArtifactInventoryResult["occurrences"],
): Record<string, JsonValue> | undefined {
  if (metadata?.kind === "android-boot-image")
    return {
      format: "android-boot-image",
      image_kind: metadata.image_kind,
      header_version: metadata.header_version,
      coverage: metadata.coverage,
      avb_footer_present: metadata.avb_footer_present,
      header_id_verification: "unverified",
      signature_authentication: "unverified",
    };
  if (metadata?.kind === "android-ota-payload") {
    let operations = 0,
      valid = 0,
      invalid = 0,
      unavailable = 0;
    for (const partition of metadata.partitions)
      for (const operation of partition.operations) {
        operations++;
        if (operation.data_sha256.status === "valid") valid++;
        if (operation.data_sha256.status === "invalid") invalid++;
        if (operation.data_sha256.status === "unavailable") unavailable++;
      }
    return {
      format: "android-ota-payload",
      coverage: metadata.coverage,
      partitions: metadata.partitions.length,
      operations,
      operation_data_hashes_matching: valid,
      operation_data_hashes_mismatched: invalid,
      operation_data_hashes_unavailable: unavailable,
      partition_images_reconstructed: false,
      source_and_partition_hashes_verified: false,
      signature_authentication: "unverified",
    };
  }
  if (metadata?.kind === "esp-flash-image")
    return {
      format: "esp-flash-image",
      coverage: metadata.coverage,
      table_md5: metadata.partition_table.md5,
      table_md5_entries: metadata.partition_table.md5_entries,
      otadata: metadata.otadata,
      boot_selection: metadata.boot_selection,
      apps_examined: metadata.apps.length,
    };
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
