import { decodeAndroidOtaManifest } from "./androidOtaManifest.js";
// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
// Wire semantics verified against AOSP update_metadata.proto blob 6d16da40e53720078b2e4f3689dbb296eb325bee:
// https://android.googlesource.com/platform/system/update_engine/+/refs/heads/main/update_metadata.proto
import { createHash } from "node:crypto";
import { err, ok, type Result } from "../result.js";
import type { RegionDecodeFailure } from "./regionDecoder.js";
import type {
  AndroidOtaPayloadMetadata as Metadata,
  AndroidOtaRegionMetadata as RegionMetadata,
} from "./androidOtaMetadata.js";
import {
  otaWireFields,
  otaUint32 as uint32,
  OtaWireMalformed,
  type OtaWireField,
} from "./androidOtaWire.js";
type Operation = Metadata["partitions"][number]["operations"][number];
type Text = Metadata["partitions"][number]["name"];
type Unknown = Metadata["unknown_fields"][number];
type SignatureFacts = Metadata["metadata_signatures"];
const LIMITATIONS = [
  "Only the CrAU v2 manifest, signatures and stored operation blobs are inspected/extracted; operation blobs are not partition images. No delta/replace/zero/discard operation is applied, and no compressed operation is decompressed.",
  "Metadata/payload signatures, source hashes and old/new partition hashes are declarations, not verified authenticity or reconstructed-image checks. No post-install program is executed.",
  "Operation names follow AOSP update_metadata.proto blob 6d16da40e53720078b2e4f3689dbb296eb325bee; unknown type codes and unknown protobuf fields are retained.",
];
export interface AndroidOtaImage {
  readonly metadata: Metadata;
  readonly regions: readonly {
    path: string;
    offset: number | null;
    bytes: Uint8Array;
    metadata: RegionMetadata;
  }[];
  readonly limitations: readonly string[];
  readonly integrityFailures: readonly string[];
}
export const hasAndroidOtaPayloadMagic = (bytes: Uint8Array): boolean =>
  bytes.length >= 4 &&
  bytes[0] === 67 &&
  bytes[1] === 114 &&
  bytes[2] === 65 &&
  bytes[3] === 85;
class Refusal extends Error {
  constructor(readonly failure: RegionDecodeFailure) {
    super(failure.message);
  }
}
const missingWindow = (length: bigint) => ({
  file_offset: null,
  declared_length: length.toString(),
  stored_size: 0,
  availability: length === 0n ? ("empty" as const) : ("missing" as const),
});

/** All regions are exact retained carrier-byte views, never reconstructed partition images. */
export function parseAndroidOtaImage(
  bytes: Uint8Array,
  capacity: {
    maxElements: number;
    maxMetadataBytes: number;
    maxHashBytes: number;
  },
  signal?: AbortSignal,
): Result<AndroidOtaImage, RegionDecodeFailure> {
  try {
    for (const n of Object.values(capacity))
      if (!Number.isSafeInteger(n) || n < 1)
        return err({
          kind: "format",
          message: "OTA budgets must be positive safe integers",
        });
    signal?.throwIfAborted();
    if (!hasAndroidOtaPayloadMagic(bytes))
      return err({
        kind: "format",
        message: "Android OTA payload magic mismatch: expected CrAU",
      });
    if (bytes.length < 12)
      return err({
        kind: "format",
        message: "Android OTA payload version header is truncated",
      });
    const view = new DataView(bytes.buffer, bytes.byteOffset, bytes.byteLength),
      version = view.getBigUint64(4, false);
    if (version !== 2n)
      return err({
        kind: "unsupported",
        message: `Android OTA payload major version ${String(version)} is unsupported; version 2 only`,
      });
    if (bytes.length < 24)
      return err({
        kind: "format",
        message: "Android OTA payload v2 header is truncated",
      });
    const size = view.getBigUint64(12, false),
      metadataSignatureSize = view.getUint32(20, false);
    if (size > BigInt(bytes.length - 24))
      return err({
        kind: "format",
        message:
          "Android OTA manifest is truncated or its declared size exceeds the carrier",
      });
    const manifestSize = Number(size),
      manifestEnd = 24 + manifestSize,
      blobOffset = manifestEnd + metadataSignatureSize;
    let usedMetadata = 0,
      elements = 0,
      hashWork = 0;
    const metadata = (n: number) => {
      if (n > capacity.maxMetadataBytes - usedMetadata)
        throw new Refusal({
          kind: "limit",
          boundary: "capacity",
          message: `Android OTA exceeds max_firmware_metadata_bytes=${String(capacity.maxMetadataBytes)}`,
        });
      usedMetadata += n;
    };
    const element = () => {
      signal?.throwIfAborted();
      if (elements >= capacity.maxElements)
        throw new Refusal({
          kind: "limit",
          boundary: "capacity",
          message: `Android OTA exceeds max_firmware_elements=${String(capacity.maxElements)}`,
        });
      elements++;
      metadata(512);
    };
    const field = () => {
      signal?.throwIfAborted();
      metadata(128);
    };
    const fields = (b: Uint8Array) => otaWireFields(b, field);
    const hex = (b: Uint8Array) => {
      metadata(b.length * 8);
      return Buffer.from(b.buffer, b.byteOffset, b.byteLength).toString("hex");
    };
    const text = (b: Uint8Array): Text => {
      const raw = hex(b);
      let value: string | null;
      try {
        value = new TextDecoder("utf-8", {
          fatal: true,
          ignoreBOM: true,
        }).decode(b);
      } catch {
        value = null;
      }
      return { value, bytes_hex: raw };
    };
    const unknown = (f: OtaWireField): Unknown => ({
      field_number: f.field,
      wire_type: f.wire,
      encoded_field_hex: hex(f.raw),
    });
    metadata(4096);
    const emptySignatures = (): SignatureFacts => ({
      ...missingWindow(0n),
      status: "absent",
      signatures: [],
      unknown_fields: [],
      verified: false,
    });
    const out: Metadata = {
      kind: "android-ota-payload",
      magic: "CrAU",
      major_version: 2,
      coverage: "complete",
      file_size: bytes.length,
      manifest_offset: 24,
      manifest_size: manifestSize,
      metadata_signature_size: metadataSignatureSize,
      blob_offset: blobOffset,
      block_size: 4096,
      block_size_source: "default",
      minor_version: 0,
      payload_kind: "full",
      max_timestamp: null,
      partial_update: null,
      security_patch_level: null,
      signatures_offset: null,
      signatures_size: null,
      metadata_signatures: emptySignatures(),
      payload_signatures: emptySignatures(),
      partitions: [],
      dynamic_partition_metadata: null,
      apex_info: [],
      unknown_fields: [],
      unclaimed_ranges: [],
      signatures_verified: false,
      partition_images_reconstructed: false,
    };
    decodeAndroidOtaManifest(bytes.subarray(24, manifestEnd), out, {
      element,
      fields,
      hex,
      text,
      unknown,
    });
    const regions: AndroidOtaImage["regions"][number][] = [],
      claimed: { start: number; end: number }[] = [],
      limitations: string[] = [...LIMITATIONS],
      integrityFailures: string[] = [];
    const window = (start: bigint, length: bigint) => {
      if (length === 0n)
        return {
          ...missingWindow(length),
          file_offset: start <= BigInt(bytes.length) ? Number(start) : null,
        };
      if (start >= BigInt(bytes.length)) return missingWindow(length);
      const offset = Number(start),
        available = Number(
          length < BigInt(bytes.length - offset)
            ? length
            : BigInt(bytes.length - offset),
        );
      return {
        file_offset: offset,
        declared_length: length.toString(),
        stored_size: available,
        availability:
          BigInt(available) === length
            ? ("complete" as const)
            : ("truncated" as const),
      };
    };
    const region = (
      path: string,
      role: RegionMetadata["role"],
      start: bigint,
      length: bigint,
      part: number | null = null,
      op: Operation | null = null,
    ) => {
      element();
      const w = window(start, length),
        data =
          w.file_offset === null
            ? new Uint8Array()
            : bytes.subarray(w.file_offset, w.file_offset + w.stored_size);
      regions.push({
        path,
        offset: w.stored_size === 0 ? null : w.file_offset,
        bytes: data,
        metadata: {
          kind: "android-ota-region",
          role,
          partition_index: part,
          operation_index: op?.index ?? null,
          operation_type: op?.type_code ?? null,
          ...w,
          data_sha256: op?.data_sha256 ?? null,
        },
      });
      if (w.stored_size > 0 && w.file_offset !== null)
        claimed.push({
          start: w.file_offset,
          end: w.file_offset + w.stored_size,
        });
      if (w.availability === "truncated" || w.availability === "missing")
        out.coverage = "unknown";
      return w;
    };
    region("header.bin", "header", 0n, 24n);
    region("manifest.pb", "manifest", 24n, size);
    const signatures = (
      path: string,
      role: "metadata-signatures" | "payload-signatures",
      start: bigint,
      length: bigint,
    ): SignatureFacts => {
      const w = region(path, role, start, length);
      const result: SignatureFacts = {
        ...w,
        status:
          length === 0n
            ? "absent"
            : w.availability === "complete"
              ? "parsed"
              : "truncated",
        signatures: [],
        unknown_fields: [],
        verified: false,
      };
      if (
        length === 0n ||
        w.availability !== "complete" ||
        w.file_offset === null
      )
        return result;
      try {
        for (const f of fields(
          bytes.subarray(w.file_offset, w.file_offset + w.stored_size),
        )) {
          if (f.field !== 1 || f.wire !== 2) {
            result.unknown_fields.push(unknown(f));
            continue;
          }
          element();
          const s: SignatureFacts["signatures"][number] = {
            version: null,
            data_hex: null,
            unpadded_size: null,
            verified: false,
            unknown_fields: [],
          };
          for (const n of fields(f.bytes))
            if (n.field === 1 && n.wire === 0) s.version = uint32(n);
            else if (n.field === 2 && n.wire === 2) s.data_hex = hex(n.bytes);
            else if (n.field === 3 && n.wire === 5)
              s.unpadded_size = new DataView(
                n.bytes.buffer,
                n.bytes.byteOffset,
                4,
              ).getUint32(0, true);
            else s.unknown_fields.push(unknown(n));
          result.signatures.push(s);
        }
      } catch (e) {
        if (!(e instanceof OtaWireMalformed)) throw e;
        result.status = "malformed";
        limitations.push(
          `${role} protobuf is malformed; stored bytes remain available and signatures remain unverified.`,
        );
        out.coverage = "unknown";
      }
      return result;
    };
    out.metadata_signatures = signatures(
      "metadata-signatures.pb",
      "metadata-signatures",
      BigInt(manifestEnd),
      BigInt(metadataSignatureSize),
    );
    if (out.signatures_offset !== null && out.signatures_size !== null)
      out.payload_signatures = signatures(
        "payload-signatures.pb",
        "payload-signatures",
        BigInt(blobOffset) + BigInt(out.signatures_offset),
        BigInt(out.signatures_size),
      );
    else if (out.signatures_offset !== null || out.signatures_size !== null)
      limitations.push(
        "Only one payload signature offset/size is declared; AOSP treats signatures as unsupported when either declaration is absent.",
      );
    const digests = new Map<string, string>();
    for (const p of out.partitions)
      for (const op of p.operations) {
        signal?.throwIfAborted();
        const length = BigInt(op.data_length ?? "0"),
          start = BigInt(blobOffset) + BigInt(op.data_offset ?? "0");
        const w = window(start, length);
        Object.assign(op, w);
        const declared = op.data_sha256.declared_hex;
        if (declared === null || declared === "")
          op.data_sha256.status = "absent";
        else if (declared.length !== 64) {
          op.data_sha256.status = "unverified";
          limitations.push(
            `Partition ${String(p.index)} operation ${String(op.index)} declares a non-32-byte data SHA-256; retained without invented verification.`,
          );
        } else if (w.availability !== "complete" && w.availability !== "empty")
          op.data_sha256.status = "unavailable";
        else {
          const key = `${String(start)}:${String(length)}`;
          let observed = digests.get(key);
          if (observed === undefined) {
            if (length > BigInt(capacity.maxHashBytes - hashWork))
              throw new Refusal({
                kind: "limit",
                boundary: "cpu",
                message: `Android OTA exceeds max_firmware_hash_bytes=${String(capacity.maxHashBytes)}`,
              });
            hashWork += Number(length);
            const data =
              w.file_offset === null
                ? new Uint8Array()
                : bytes.subarray(w.file_offset, w.file_offset + w.stored_size);
            observed = createHash("sha256").update(data).digest("hex");
            digests.set(key, observed);
          }
          op.data_sha256.observed_hex = observed;
          op.data_sha256.status = observed === declared ? "valid" : "invalid";
          if (observed !== declared)
            integrityFailures.push(
              `Partition ${String(p.index)} operation ${String(op.index)} data SHA-256 mismatch: declared ${declared}, observed ${observed}`,
            );
        }
        region(op.path, "operation-data", start, length, p.index, op);
        if (op.availability === "missing" || op.availability === "truncated")
          limitations.push(
            `Partition ${String(p.index)} operation ${String(op.index)} blob is ${op.availability}; only stored bytes are exposed.`,
          );
      }
    claimed.sort((a, b) => a.start - b.start || a.end - b.end);
    let end = 0;
    for (const c of claimed) {
      if (c.start > end) {
        metadata(128);
        out.unclaimed_ranges.push({ offset: end, length: c.start - end });
      }
      end = Math.max(end, c.end);
    }
    if (end < bytes.length) {
      metadata(128);
      out.unclaimed_ranges.push({ offset: end, length: bytes.length - end });
    }
    if (out.unclaimed_ranges.length > 0) {
      out.coverage = "unknown";
      limitations.push(
        "Carrier ranges outside the header/manifest/signature/operation declarations remain unclaimed; no padding or payload semantics are inferred.",
      );
    }
    return ok({ metadata: out, regions, limitations, integrityFailures });
  } catch (cause) {
    if (cause instanceof Refusal) return err(cause.failure);
    if (cause instanceof OtaWireMalformed)
      return err({
        kind: "format",
        message: `Android OTA protobuf/layout is malformed: ${cause.message}`,
      });
    throw cause;
  }
}
