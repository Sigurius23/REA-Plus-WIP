// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import { err, ok, type Result } from "../result.js";
import type { RegionDecodeFailure } from "./regionDecoder.js";
import {
  ANDROID_BOOT_MAGIC,
  VENDOR_BOOT_MAGIC,
  AVB_FOOTER_SIZE,
  parseAndroidBootHeader,
  parseVendorRamdiskTable,
  inspectAvbFooter,
  compressionFromPrefix,
  type AndroidBootComponentPlan,
  type AndroidBootParse,
  type AvbFooterFacts,
} from "./androidBootStructures.js";
import type {
  AndroidBootImageMetadata,
  AndroidBootImageEntryMetadata,
} from "./androidBootMetadata.js";

/** AOSP bootimg.h android16-release (blob 67ae349583e66424e5af0a3b7a386b42b6c958e0).
 * https://android.googlesource.com/platform/system/tools/mkbootimg/+/refs/heads/android16-release/include/bootimg/bootimg.h
 * Footer structure: https://android.googlesource.com/platform/external/avb/+/refs/heads/main/libavb/avb_footer.h
 * No signature, header id, AVB authentication or platform acceptance is verified.
 */
export const hasAndroidBootImageMagic = (bytes: Uint8Array): boolean => {
  if (bytes.length < 8) return false;
  const prefix = Buffer.from(bytes.buffer, bytes.byteOffset, 8);
  return (
    prefix.equals(Buffer.from(ANDROID_BOOT_MAGIC)) ||
    prefix.equals(Buffer.from(VENDOR_BOOT_MAGIC))
  );
};
export interface AndroidBootImage {
  readonly metadata: AndroidBootImageMetadata;
  readonly regions: readonly {
    readonly path: string;
    readonly offset: number;
    readonly bytes: Uint8Array;
    readonly metadata: AndroidBootImageEntryMetadata;
  }[];
  readonly limitations: readonly string[];
  readonly integrityFailures: readonly string[];
}
const roleNames: Readonly<Record<number, string>> = {
  0: "none",
  1: "platform",
  2: "recovery",
  3: "dlkm",
};
const text = (bytes: Buffer): string | null => {
  const at = bytes.indexOf(0);
  try {
    return new TextDecoder("utf-8", { fatal: true, ignoreBOM: true }).decode(
      at === -1 ? bytes : bytes.subarray(0, at),
    );
  } catch {
    return null;
  }
};
const extraPlan = (
  role:
    | AndroidBootComponentPlan["role"]
    | "vendor-ramdisk-section"
    | "vendor-ramdisk-table"
    | "vbmeta"
    | "avb-footer",
  path: string,
  offset: number,
  size: number,
) => ({
  role,
  path,
  offset,
  size,
  index: 0,
  loadAddress: null,
  ramdiskType: null,
  ramdiskTypeName: null,
  nameBytesHex: null,
  boardIdHex: null,
});
/** Inspect retained bytes without decompression, reconstruction or device access. */
export const parseAndroidBootImage = (
  input: Uint8Array,
  capacity: { readonly maxElements: number; readonly maxMetadataBytes: number },
  signal?: AbortSignal,
): Result<AndroidBootImage, RegionDecodeFailure> => {
  signal?.throwIfAborted();
  if (
    !Number.isSafeInteger(capacity.maxElements) ||
    capacity.maxElements < 1 ||
    !Number.isSafeInteger(capacity.maxMetadataBytes) ||
    capacity.maxMetadataBytes < 1
  )
    return err({
      kind: "format",
      message:
        "Android boot element/metadata budgets must be positive safe integers",
    });
  const limit = (
    message: string,
  ): Result<AndroidBootImage, RegionDecodeFailure> =>
    err({ kind: "limit", boundary: "capacity", message });
  // Fixed header field/hex and schema object expansion is bounded independently of carrier bytes.
  if (capacity.maxMetadataBytes < 32768)
    return limit(
      `Android boot exceeds max_firmware_metadata_bytes=${String(capacity.maxMetadataBytes)} before header expansion`,
    );
  const bytes = Buffer.from(input.buffer, input.byteOffset, input.byteLength);
  const parsed = parseAndroidBootHeader(bytes, bytes.length);
  if (!parsed.ok) return parsed;
  const header = parsed.value;
  const entryCount = header.vendorRamdiskTableEntryCount ?? 0;
  const entrySize = header.vendorRamdiskTableEntrySize ?? 0;
  // Every declaration counts, even a zero-byte ramdisk; metadata reservations precede all table loops.
  const declared =
    header.components.length +
    entryCount +
    (header.vendorRamdiskSection !== null &&
    header.headerVersion === 4 &&
    header.vendorRamdiskSection.size > 0
      ? 1
      : 0) +
    (header.tableRange === null ? 0 : 1);
  if (declared > capacity.maxElements)
    return limit(
      `Android boot declares ${String(declared)} elements, exceeding max_firmware_elements=${String(capacity.maxElements)}`,
    );
  // Raw hex contributes two characters per input byte. Reserve eight bytes per
  // source byte for UTF-16 storage plus serialized/copied output, and 4096 per
  // declaration for the root record, component facts and metadata snapshots.
  // Section/table/footer plans have a separate fixed reservation.
  const reserve =
    32768 +
    16384 +
    header.headerSize * 8 +
    entryCount * (4096 + entrySize * 8) +
    header.components.length * 4096;
  if (!Number.isSafeInteger(reserve) || reserve > capacity.maxMetadataBytes)
    return limit(
      `Android boot exceeds max_firmware_metadata_bytes=${String(capacity.maxMetadataBytes)} before table/header metadata expansion`,
    );
  let plans: (AndroidBootComponentPlan | ReturnType<typeof extraPlan>)[] = [
    ...header.components,
  ];
  const limitations = [
    ...header.limitations,
    "Stored component bytes are not decompressed or executed; compression labels observe leading magic only.",
    "Header id, v4 boot signature and AVB metadata are retained without cryptographic verification or trusted-key/platform acceptance.",
  ];
  if (header.dtbSize !== null && header.dtbAddr === null)
    limitations.push(
      "The declared DTB physical address exceeds safe-number precision; dtb_addr is unavailable and dtb_addr_hex retains its exact little-endian bytes.",
    );
  let tableUnknown =
    header.headerVersion === 4 &&
    header.vendorRamdiskSection !== null &&
    header.vendorRamdiskSection.size > 0 &&
    entryCount === 0;
  const vendorEntries: AndroidBootImageMetadata["vendor_ramdisk_entries"] = [];
  if (header.tableRange !== null && header.vendorRamdiskSection !== null) {
    const range = header.tableRange,
      section = header.vendorRamdiskSection;
    const table = bytes.subarray(range.offset, range.offset + range.size);
    const parsedTable = parseVendorRamdiskTable(table, {
      entryCount,
      entrySize,
      sectionOffset: section.offset,
      sectionSize: section.size,
      ...(signal === undefined ? {} : { signal }),
    });
    if (!parsedTable.ok) return parsedTable;
    for (const plan of parsedTable.value.components) plans.push(plan);
    plans.push(
      extraPlan(
        "vendor-ramdisk-table",
        "vendor_ramdisk_table",
        range.offset,
        range.size,
      ),
    );
    for (const limitation of parsedTable.value.limitations)
      limitations.push(limitation);
    tableUnknown = parsedTable.value.coverage === "unknown";
    for (let index = 0; index < entryCount; index++) {
      if ((index & 255) === 0) signal?.throwIfAborted();
      const row = table.subarray(index * entrySize, (index + 1) * entrySize),
        type = row.readUInt32LE(8);
      vendorEntries.push({
        index,
        size: row.readUInt32LE(0),
        offset: row.readUInt32LE(4),
        ramdisk_type: type,
        ramdisk_type_name: roleNames[type] ?? null,
        name: text(row.subarray(12, 44)),
        name_bytes_hex: row.subarray(12, 44).toString("hex"),
        board_id_hex: row.subarray(44, 108).toString("hex"),
        extension_bytes_hex: row.subarray(108).toString("hex"),
      });
    }
  }
  if (
    header.headerVersion === 4 &&
    header.vendorRamdiskSection !== null &&
    header.vendorRamdiskSection.size > 0
  ) {
    const section = header.vendorRamdiskSection;
    plans.push(
      extraPlan(
        "vendor-ramdisk-section",
        "vendor_ramdisk_section",
        section.offset,
        section.size,
      ),
    );
  }
  const footer = inspectAvbFooter({
    fileSize: bytes.length,
    dataEnd: header.dataEnd,
    imageEnd: header.imageEnd,
    headerOccupied: header.headerOccupied,
    components: [
      ...plans,
      ...(header.vendorRamdiskSection === null
        ? []
        : [header.vendorRamdiskSection]),
    ],
    tail:
      bytes.length - header.dataEnd >= AVB_FOOTER_SIZE
        ? bytes.subarray(bytes.length - AVB_FOOTER_SIZE)
        : null,
  });
  if (!footer.ok) return footer;
  const avb = footer.value;
  limitations.push(...avb.limitations);
  if (avb.present) {
    if (
      avb.vbmetaSize !== null &&
      avb.vbmetaOffset !== null &&
      avb.vbmetaSize > 0
    )
      plans.push(
        extraPlan("vbmeta", "avb_vbmeta", avb.vbmetaOffset, avb.vbmetaSize),
      );
    plans.push(
      extraPlan(
        "avb-footer",
        "avb_footer",
        bytes.length - AVB_FOOTER_SIZE,
        AVB_FOOTER_SIZE,
      ),
    );
    if (avb.versionMajor !== 1 || avb.versionMinor !== 0)
      limitations.push(
        "The AVB footer declares an unqualified version; raw fields are retained without validation of that version's semantics.",
      );
  }
  if (plans.length > capacity.maxElements)
    return limit(
      `Android boot exposes ${String(plans.length)} elements, exceeding max_firmware_elements=${String(capacity.maxElements)}`,
    );
  const rawHeader = bytes.subarray(0, header.headerSize).toString("hex");
  const undescribed: { offset: number; length: number }[] = [];
  // Standard header and per-component page padding are classified layout bytes. Larger gaps remain unknown.
  const spans = [
    { offset: 0, size: Math.min(header.headerOccupied, bytes.length) },
    ...plans,
  ]
    .map((r) => ({
      start: r.offset,
      end: Math.min(bytes.length, r.offset + r.size),
    }))
    .sort((a, b) => a.start - b.start || a.end - b.end);
  let covered = 0;
  for (const span of spans) {
    if (span.start > covered) {
      const pad = Math.min(
        bytes.length,
        Math.ceil(covered / header.pageSize) * header.pageSize,
      );
      if (span.start > pad)
        undescribed.push({ offset: pad, length: span.start - pad });
    }
    covered = Math.max(covered, span.end);
  }
  const padded = Math.min(
    bytes.length,
    Math.ceil(covered / header.pageSize) * header.pageSize,
  );
  if (padded < bytes.length)
    undescribed.push({ offset: padded, length: bytes.length - padded });
  const knownHeaderSize =
    header.imageKind === "boot"
      ? ([1632, 1648, 1660, 1580, 1584][header.headerVersion] ?? 0)
      : header.headerVersion === 3
        ? 2112
        : 2128;
  const unknown =
    undescribed.length > 0 ||
    header.headerSize !== knownHeaderSize ||
    tableUnknown ||
    (avb.present && (avb.versionMajor !== 1 || avb.versionMinor !== 0));
  if (undescribed.length > 0)
    limitations.push(
      "Carrier ranges outside the declared structures and their alignment padding remain undescribed.",
    );
  const regions = plans.map((plan) => ({
    path: plan.path,
    offset: plan.offset,
    bytes: input.subarray(plan.offset, plan.offset + plan.size),
    metadata: {
      kind: "android-boot-image-entry" as const,
      role: plan.role,
      index: plan.index,
      compression: compressionFromPrefix(
        bytes.subarray(plan.offset, plan.offset + Math.min(4, plan.size)),
      ),
      ramdisk_type: plan.ramdiskType,
      ramdisk_type_name: plan.ramdiskTypeName,
      load_address: plan.loadAddress,
      name_bytes_hex: plan.nameBytesHex,
      board_id_hex: plan.boardIdHex,
    },
  }));
  signal?.throwIfAborted();
  return ok({
    metadata: {
      ...toMetadata(header, avb, regions.length),
      coverage: unknown ? "unknown" : "complete",
      header_bytes_hex: rawHeader,
      dtb_addr_hex:
        header.dtbSize === null
          ? null
          : bytes
              .subarray(
                header.imageKind === "vendor-boot" ? 2104 : 1652,
                (header.imageKind === "vendor-boot" ? 2104 : 1652) + 8,
              )
              .toString("hex"),
      avb_footer_bytes_hex: avb.present
        ? bytes.subarray(bytes.length - AVB_FOOTER_SIZE).toString("hex")
        : null,
      vendor_ramdisk_entries: vendorEntries,
      undescribed,
    },
    regions,
    limitations,
    integrityFailures: [],
  });
};
const toMetadata = (
  header: AndroidBootParse,
  avb: AvbFooterFacts,
  componentCount: number,
): Omit<
  AndroidBootImageMetadata,
  | "coverage"
  | "header_bytes_hex"
  | "dtb_addr_hex"
  | "avb_footer_bytes_hex"
  | "vendor_ramdisk_entries"
  | "undescribed"
> => ({
  kind: "android-boot-image",
  image_kind: header.imageKind,
  magic: header.magic,
  header_version: header.headerVersion,
  page_size: header.pageSize,
  header_size: header.headerSize,
  os_version_raw: header.osVersionRaw,
  os_version: header.osVersion,
  security_patch_level: header.securityPatchLevel,
  name: header.name,
  name_bytes_hex: header.nameBytesHex,
  cmdline: header.cmdline,
  cmdline_bytes_hex: header.cmdlineBytesHex,
  extra_cmdline: header.extraCmdline,
  extra_cmdline_bytes_hex: header.extraCmdlineBytesHex,
  command_line: header.commandLine,
  header_digest_hex: header.headerDigestHex,
  kernel_addr: header.kernelAddr,
  ramdisk_addr: header.ramdiskAddr,
  second_addr: header.secondAddr,
  tags_addr: header.tagsAddr,
  dtb_addr: header.dtbAddr,
  kernel_size: header.kernelSize,
  ramdisk_size: header.ramdiskSize,
  second_size: header.secondSize,
  recovery_dtbo_size: header.recoveryDtboSize,
  recovery_dtbo_offset: header.recoveryDtboOffset,
  dtb_size: header.dtbSize,
  signature_size: header.signatureSize,
  vendor_ramdisk_size: header.vendorRamdiskSize,
  vendor_ramdisk_table_entry_count: header.vendorRamdiskTableEntryCount,
  vendor_ramdisk_table_entry_size: header.vendorRamdiskTableEntrySize,
  bootconfig_size: header.bootconfigSize,
  avb_footer_present: avb.present,
  avb_footer_size: avb.footerSize,
  avb_version_major: avb.versionMajor,
  avb_version_minor: avb.versionMinor,
  avb_original_image_size: avb.originalImageSize,
  avb_vbmeta_offset: avb.vbmetaOffset,
  avb_vbmeta_size: avb.vbmetaSize,
  component_count: componentCount,
});
