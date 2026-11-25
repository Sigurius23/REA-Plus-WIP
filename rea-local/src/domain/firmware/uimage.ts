// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import { crc32 } from "node:zlib";
import { err, ok, type Result } from "../result.js";
import type { RegionDecodeFailure } from "./regionDecoder.js";
import type { UImageEntryMetadata, UImageMetadata } from "./uimageMetadata.js";
import { UIMAGE_ID_NAME_REGISTRY, uImageIdNames } from "./uimageNames.js";

export const UIMAGE_MAGIC = 0x27051956;
export const UIMAGE_HEADER_SIZE = 64;

export interface UImageRegion {
  readonly path: string;
  /** Actual carrier-file offset, independently of the declared load address. */
  readonly offset: number;
  readonly bytes: Uint8Array;
  readonly metadata: UImageEntryMetadata;
}
export interface UImageImage {
  readonly metadata: UImageMetadata;
  readonly regions: readonly UImageRegion[];
  readonly limitations: readonly string[];
  /** Exact disagreements; the adapter applies the caller's integrity policy. */
  readonly integrityFailures: readonly string[];
}
export interface UImageCapacity {
  /** All retained entries, including the full payload and every sub-image. */
  readonly maxElements: number;
}
const u32 = (bytes: Uint8Array, offset: number): number =>
  new DataView(bytes.buffer, bytes.byteOffset, bytes.byteLength).getUint32(
    offset,
  );
const hex32 = (value: number): string =>
  `0x${value.toString(16).padStart(8, "0")}`;
const malformed = (message: string): Result<never, RegionDecodeFailure> =>
  err({ kind: "format", message: `uImage is malformed: ${message}` });
const hasSizeTable = (type: number): boolean => type === 4 || type === 6;

/** Recognition does not certify header/data integrity or interpret the payload. */
export const hasUImageMagic = (prefix: Uint8Array): boolean =>
  prefix.length >= 4 && u32(prefix, 0) === UIMAGE_MAGIC;

interface SizeTable {
  readonly sizes: readonly number[];
  readonly bytes: number;
  readonly slack: number;
}
/** Admit each table entry before retaining it; the zero terminator is mandatory. */
const sizeTable = (
  payload: Uint8Array,
  maxElements: number,
): Result<SizeTable, RegionDecodeFailure> => {
  const sizes: number[] = [];
  let cursor = 0;
  for (;;) {
    if (cursor > payload.length - 4)
      return malformed(
        "multi-image size table has no zero terminator inside the payload",
      );
    const size = u32(payload, cursor);
    cursor += 4;
    if (size === 0) break;
    if (sizes.length + 1 >= maxElements)
      return err({
        kind: "limit",
        boundary: "capacity",
        message: `uImage entries (full payload plus sub-images) exceed max_firmware_elements=${String(maxElements)}`,
      });
    sizes.push(size);
  }
  let dataEnd = cursor;
  for (const [index, size] of sizes.entries()) {
    if (size > payload.length - dataEnd)
      return malformed(
        `multi-image sub-image ${String(index)} of ${String(size)} bytes overruns the ${String(payload.length)}-byte payload`,
      );
    dataEnd += index + 1 < sizes.length ? Math.ceil(size / 4) * 4 : size;
  }
  return ok({ sizes, bytes: cursor, slack: payload.length - dataEnd });
};

/** Decode one admitted carrier as stored bytes. No decompression, loading or execution. */
export const parseUImage = (
  bytes: Uint8Array,
  capacity: UImageCapacity,
): Result<UImageImage, RegionDecodeFailure> => {
  if (!Number.isSafeInteger(capacity.maxElements) || capacity.maxElements < 1)
    return malformed("maxElements must be a positive safe integer");
  if (bytes.length < UIMAGE_HEADER_SIZE)
    return malformed(
      `header is truncated: ${String(bytes.length)} bytes, expected 64`,
    );
  if (!hasUImageMagic(bytes))
    return malformed("magic does not match 0x27051956");
  const payloadSize = u32(bytes, 12);
  if (payloadSize > bytes.length - UIMAGE_HEADER_SIZE)
    return malformed(
      `payload is truncated: header declares ${String(payloadSize)} bytes, but only ${String(bytes.length - UIMAGE_HEADER_SIZE)} follow the header`,
    );
  const payload = bytes.subarray(
    UIMAGE_HEADER_SIZE,
    UIMAGE_HEADER_SIZE + payloadSize,
  );
  const type = bytes[30] ?? 0;
  const table = hasSizeTable(type)
    ? sizeTable(payload, capacity.maxElements)
    : ok({ sizes: [] as readonly number[], bytes: 0, slack: 0 });
  if (!table.ok) return table;
  const zeroedHeader = Uint8Array.from(bytes.subarray(0, UIMAGE_HEADER_SIZE));
  zeroedHeader.fill(0, 4, 8);
  const headerCrc = u32(bytes, 4),
    computedHeaderCrc = crc32(zeroedHeader);
  const dataCrc = u32(bytes, 24),
    computedDataCrc = crc32(payload);
  const integrityFailures: string[] = [];
  if (headerCrc !== computedHeaderCrc)
    integrityFailures.push(
      `uImage header CRC32 mismatch: declared ${hex32(headerCrc)}, computed ${hex32(computedHeaderCrc)}`,
    );
  if (dataCrc !== computedDataCrc)
    integrityFailures.push(
      `uImage data CRC32 mismatch: declared ${hex32(dataCrc)}, computed ${hex32(computedDataCrc)}`,
    );
  const nameBytes = bytes.subarray(32, 64),
    nul = nameBytes.indexOf(0);
  let name: string | null;
  try {
    name = new TextDecoder("utf-8", { fatal: true, ignoreBOM: true }).decode(
      nameBytes.subarray(0, nul < 0 ? 32 : nul),
    );
  } catch {
    name = null;
  }
  const timestamp = u32(bytes, 8);
  const os = bytes[28] ?? 0,
    arch = bytes[29] ?? 0,
    compression = bytes[31] ?? 0;
  const trailing = bytes.length - UIMAGE_HEADER_SIZE - payloadSize;
  const metadata: UImageMetadata = {
    kind: "uimage",
    magic: UIMAGE_MAGIC,
    timestamp,
    timestamp_iso: new Date(timestamp * 1000).toISOString(),
    payload_size: payloadSize,
    load_address: u32(bytes, 16),
    entry_point: u32(bytes, 20),
    header_crc32: headerCrc,
    computed_header_crc32: computedHeaderCrc,
    data_crc32: dataCrc,
    computed_data_crc32: computedDataCrc,
    crc_verified: integrityFailures.length === 0,
    os,
    arch,
    type,
    compression,
    ...uImageIdNames(os, arch, type, compression),
    id_name_registry: UIMAGE_ID_NAME_REGISTRY,
    name,
    name_bytes_hex: Buffer.from(nameBytes).toString("hex"),
    sub_image_count: table.value.sizes.length,
    size_table_bytes: table.value.bytes,
    sub_image_slack_bytes: table.value.slack,
    trailing_bytes: trailing,
    carrier_coverage:
      trailing === 0 ? "complete-within-carrier" : "unknown-trailing",
  };
  const regions: UImageRegion[] = [
    {
      path: "payload.bin",
      offset: UIMAGE_HEADER_SIZE,
      bytes: payload,
      metadata: { kind: "uimage-entry", role: "payload", index: 0 },
    },
  ];
  let offset = UIMAGE_HEADER_SIZE + table.value.bytes;
  for (const [index, size] of table.value.sizes.entries()) {
    regions.push({
      path: `image-${String(index)}.bin`,
      offset,
      bytes: bytes.subarray(offset, offset + size),
      metadata: { kind: "uimage-entry", role: "sub-image", index },
    });
    offset +=
      index + 1 < table.value.sizes.length ? Math.ceil(size / 4) * 4 : size;
  }
  return ok({
    metadata,
    regions,
    integrityFailures,
    limitations: [
      "U-Boot header architecture, load and entry addresses are declarations; no CPU, runtime mapping or execution was observed. Stored payloads were not decompressed or interpreted.",
      ...(name === null
        ? [
            "uImage name is not valid UTF-8; its complete fixed-field bytes are retained and its text is unknown.",
          ]
        : []),
      ...(hasSizeTable(type)
        ? [
            "Multi/script sub-images are split from the size table; payload.bin also retains the complete stored payload, including the table and padding.",
          ]
        : []),
      ...(table.value.slack === 0
        ? []
        : [
            `${String(table.value.slack)} byte(s) inside the declared payload follow the final sub-image and remain represented only by payload.bin.`,
          ]),
      ...(trailing === 0
        ? []
        : [
            `${String(trailing)} byte(s) follow the declared uImage payload; their meaning is unknown and they are outside the extracted entries.`,
          ]),
      ...integrityFailures.map(
        (failure) =>
          `${failure}. Carrier and derived payload bytes are observed-untrusted.`,
      ),
    ],
  });
};
