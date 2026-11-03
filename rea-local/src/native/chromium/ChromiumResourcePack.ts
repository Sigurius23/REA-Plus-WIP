import { createHash } from "node:crypto";
import { brotliDecompressSync, gunzipSync } from "node:zlib";
import { setImmediate } from "node:timers/promises";
import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import {
  AnalysisCancelledError,
  AnalysisInputError,
  AnalysisOutputError,
  AnalysisResourceConstraintError,
} from "../../domain/analysisErrorCore.js";
import type {
  ChromiumResources,
  ChromiumResourceEntry,
  InspectChromiumResourcesInput,
} from "../../domain/native/chromiumResources.js";

const OPERATION = "inspect_chromium_resources";
const fail = (message: string): never => {
  throw new ArtifactReaderFailure("format", message);
};
const hash = (bytes: Buffer) =>
  createHash("sha256").update(bytes).digest("hex");
const capacity = (input: InspectChromiumResourcesInput) =>
  new AnalysisResourceConstraintError(
    OPERATION,
    "memory",
    "Selected stored or decoded resource exceeds max_resource_bytes",
    { max_resource_bytes: input.max_resource_bytes },
    {
      remediationAction:
        "Raise max_resource_bytes (CLI --max-resource-bytes), up to 8388608, or inspect the index without selecting content. Unchanged limits reproduce the refusal.",
    },
  );
const cancelled = (signal?: AbortSignal, operation = OPERATION) => {
  if (signal?.aborted) throw new AnalysisCancelledError(operation);
};

const compression = (bytes: Buffer): ChromiumResourceEntry["compression"] => {
  if (bytes[0] === 0x1f && bytes[1] === 0x8b)
    return {
      kind: "gzip-candidate",
      declared_decoded_bytes: null,
      gzip_last_member_isize:
        bytes.length >= 18 ? bytes.readUInt32LE(bytes.length - 4) : null,
    };
  if (bytes[0] === 0x1e && bytes[1] === 0x9b)
    return {
      kind:
        bytes.length < 8
          ? "truncated-brotli-envelope"
          : "chromium-brotli-envelope",
      declared_decoded_bytes: bytes.length < 8 ? null : bytes.readUIntLE(2, 6),
      gzip_last_member_isize: null,
    };
  return {
    kind: "none",
    declared_decoded_bytes: null,
    gzip_last_member_isize: null,
  };
};

/** Shared bounded byte decoder; callers own budget accounting and failures. */
export const decodeChromiumResource = (
  stored: Buffer,
  item: ChromiumResourceEntry,
  maxBytes: number,
  refuseCapacity: () => never,
  operation: string,
  decode = true,
): { bytes: Buffer; codec: "none" | "gzip" | "chromium-brotli" } => {
  if (stored.length > maxBytes) throw refuseCapacity();
  let bytes = stored;
  let codec: NonNullable<ChromiumResources["resource"]>["codec"] = "none";
  if (decode && item.compression.kind !== "none") {
    if (item.compression.kind === "truncated-brotli-envelope")
      fail("Truncated Chromium Brotli resource envelope");
    if (
      item.compression.declared_decoded_bytes !== null &&
      item.compression.declared_decoded_bytes > maxBytes
    )
      throw refuseCapacity();
    try {
      if (item.compression.kind === "gzip-candidate") {
        bytes = gunzipSync(stored, {
          maxOutputLength: maxBytes,
        });
        codec = "gzip";
      } else {
        const decoded: unknown = brotliDecompressSync(stored.subarray(8), {
          maxOutputLength: maxBytes,
          info: true,
        });
        if (
          typeof decoded !== "object" ||
          decoded === null ||
          !("buffer" in decoded) ||
          !Buffer.isBuffer(decoded.buffer) ||
          !("engine" in decoded) ||
          typeof decoded.engine !== "object" ||
          decoded.engine === null ||
          !("bytesWritten" in decoded.engine)
        )
          throw new AnalysisOutputError(
            operation,
            "Node Brotli decoder did not return consumed-input evidence",
          );
        if (decoded.engine.bytesWritten !== stored.length - 8)
          fail("Trailing bytes after the selected Brotli stream");
        bytes = decoded.buffer;
        codec = "chromium-brotli";
      }
    } catch (cause) {
      if (
        cause instanceof AnalysisOutputError ||
        cause instanceof ArtifactReaderFailure
      )
        throw cause;
      if (
        cause instanceof Error &&
        "code" in cause &&
        cause.code === "ERR_BUFFER_TOO_LARGE"
      )
        throw refuseCapacity();
      fail(
        `Selected resource compression candidate failed decoding: ${cause instanceof Error ? cause.message : String(cause)}`,
      );
    }
    if (
      codec === "chromium-brotli" &&
      bytes.length !== item.compression.declared_decoded_bytes
    )
      fail(
        "Chromium Brotli decoded length differs from its six-byte declared size",
      );
  }
  if (bytes.length > maxBytes) throw refuseCapacity();
  return { bytes, codec };
};

const selectedContent = (
  stored: Buffer,
  item: ChromiumResourceEntry,
  encoding: ChromiumResources["encoding"],
  input: InspectChromiumResourcesInput,
): NonNullable<ChromiumResources["resource"]> => {
  const { bytes, codec } = decodeChromiumResource(
    stored,
    item,
    input.max_resource_bytes,
    () => {
      throw capacity(input);
    },
    OPERATION,
    input.decode,
  );
  let text: string | null = null;
  if (encoding !== "binary") {
    try {
      text = new TextDecoder(encoding === "utf8" ? "utf-8" : "utf-16le", {
        fatal: true,
      }).decode(bytes);
    } catch {
      /* The pack encoding permits binary resources. */
    }
  }
  return {
    entry: item,
    representation: input.decode ? "decoded" : "stored",
    codec,
    bytes: bytes.length,
    sha256: hash(bytes),
    bytes_hex: bytes.toString("hex"),
    text_preview: text?.slice(0, 4096) ?? null,
    text_preview_truncated: (text?.length ?? 0) > 4096,
  };
};

/** One validated index snapshot, shared by inspection and canonical search. */
export const indexChromiumResourcePack = async (
  bytes: Buffer,
  signal?: AbortSignal,
  operation = OPERATION,
) => {
  cancelled(signal, operation);
  if (bytes.length < 4) fail("Truncated Chromium DataPack header");
  const version = bytes.readUInt32LE(0);
  if (version !== 4 && version !== 5)
    return fail(
      "Expected an unwrapped Chromium DataPack v4/v5; outer gzip/other wrappers are unsupported",
    );
  const header = version === 4 ? 9 : 12;
  if (bytes.length < header) fail("Truncated Chromium DataPack header");
  const count = version === 4 ? bytes.readUInt32LE(4) : bytes.readUInt16LE(8);
  const aliases = version === 4 ? 0 : bytes.readUInt16LE(10);
  const encodingValue = bytes[version === 4 ? 8 : 4];
  if (encodingValue === undefined || encodingValue > 2)
    return fail("Unsupported Chromium DataPack encoding");
  const encoding = (["binary", "utf8", "utf16le"] as const)[encodingValue];
  if (encoding === undefined)
    return fail("Unsupported Chromium DataPack encoding");
  if (count + aliases > 65536)
    fail("Resource identities exceed the unique uint16 ID space");
  const aliasStart = header + (count + 1) * 6;
  const metadataEnd = aliasStart + aliases * 4;
  if (metadataEnd > bytes.length)
    fail("Truncated Chromium resource index or aliases");
  const canonical: {
    id: number;
    offset: number;
    end: number;
    at: number;
    index: number;
  }[] = [];
  const rows: { id: number; index: number; at: number; alias: boolean }[] = [];
  const ids = new Set<number>();
  let previousId = -1;
  let previousOffset = metadataEnd;
  for (let index = 0; index <= count; index++) {
    if (index % 1024 === 0) {
      await setImmediate();
      cancelled(signal, operation);
    }
    const at = header + index * 6,
      id = bytes.readUInt16LE(at),
      offset = bytes.readUInt32LE(at + 2);
    if (offset < previousOffset || offset > bytes.length)
      fail("Resource offsets overlap metadata, decrease or exceed the file");
    if (index < count) {
      if (id <= previousId)
        fail("Canonical resource IDs must be unique and sorted");
      canonical.push({
        id,
        offset,
        end: bytes.readUInt32LE(at + 8),
        at,
        index,
      });
      rows.push({ id, index, at, alias: false });
      ids.add(id);
      previousId = id;
    }
    previousOffset = offset;
  }
  previousId = -1;
  for (let index = 0; index < aliases; index++) {
    if (index % 1024 === 0) {
      await setImmediate();
      cancelled(signal, operation);
    }
    const at = aliasStart + index * 4,
      id = bytes.readUInt16LE(at),
      target = bytes.readUInt16LE(at + 2);
    if (id <= previousId || ids.has(id) || target >= count)
      fail(
        "Alias IDs must be sorted, unique and point directly to a canonical table entry",
      );
    ids.add(id);
    rows.push({ id, index: target, at, alias: true });
    previousId = id;
  }
  rows.sort((a, b) => a.id - b.id);
  const hashes = new Map<number, string>();
  const entry = (row: (typeof rows)[number]): ChromiumResourceEntry => {
    const target = canonical[row.index];
    if (!target) return fail("Missing canonical resource entry");
    const stored = bytes.subarray(target.offset, target.end);
    let sha256 = hashes.get(row.index);
    if (sha256 === undefined) {
      sha256 = hash(stored);
      hashes.set(row.index, sha256);
    }
    return {
      resource_id: row.id,
      canonical_resource_id: target.id,
      alias: row.alias,
      canonical_index: row.index,
      table_location: { offset: row.at, bytes: row.alias ? 4 : 6 },
      payload: { offset: target.offset, bytes: stored.length, sha256 },
      compression: compression(stored),
    };
  };
  const firstOffset = canonical[0]?.offset ?? previousOffset;
  const unclaimed = [];
  if (firstOffset > metadataEnd)
    unclaimed.push({ offset: metadataEnd, bytes: firstOffset - metadataEnd });
  if (previousOffset < bytes.length)
    unclaimed.push({
      offset: previousOffset,
      bytes: bytes.length - previousOffset,
    });
  return {
    format: "chromium-datapack",
    version: version as 4 | 5,
    encoding,
    canonical_resources: count,
    alias_resources: aliases,
    layout: {
      header_bytes: header,
      padding_hex: version === 5 ? bytes.subarray(5, 8).toString("hex") : "",
      metadata_end: metadataEnd,
      sentinel_id: bytes.readUInt16LE(header + count * 6),
      sentinel_offset: previousOffset,
      unclaimed_ranges: unclaimed,
    },
    canonical,
    rows,
    entry,
  };
};

/** Validate the entire declared index before paging; selected payloads remain inert bytes. */
export const parseChromiumResourcePack = async (
  bytes: Buffer,
  artifact: ChromiumResources["artifact"],
  input: InspectChromiumResourcesInput,
  signal?: AbortSignal,
): Promise<ChromiumResources> => {
  const index = await indexChromiumResourcePack(bytes, signal);
  const { rows, entry, canonical, encoding } = index;
  const entries = rows
    .slice(input.offset, input.offset + input.limit)
    .map(entry);
  let resource: ChromiumResources["resource"] = null;
  if (input.resource_id !== undefined) {
    const row = rows.find((row) => row.id === input.resource_id);
    if (!row)
      throw new AnalysisInputError(OPERATION, undefined, [
        {
          path: ["resource_id"],
          reason: "invalid_value",
          message: "Resource ID is absent from the complete declared index.",
        },
      ]);
    const target = canonical[row.index];
    if (
      target !== undefined &&
      target.end - target.offset > input.max_resource_bytes
    )
      throw capacity(input);
    const selected = entry(row);
    resource = selectedContent(
      bytes.subarray(
        selected.payload.offset,
        selected.payload.offset + selected.payload.bytes,
      ),
      selected,
      encoding,
      input,
    );
  }
  cancelled(signal);
  return {
    artifact,
    format: "chromium-datapack",
    version: index.version,
    encoding,
    canonical_resources: index.canonical_resources,
    alias_resources: index.alias_resources,
    layout: index.layout,
    page: {
      offset: input.offset,
      limit: input.limit,
      returned: entries.length,
      total: rows.length,
      next_offset:
        input.offset + entries.length < rows.length
          ? input.offset + entries.length
          : null,
    },
    entries,
    resource,
    coverage: {
      index: "complete",
      selected_resource: resource === null ? "not_requested" : "complete",
    },
    limitations: [
      "Numeric resource IDs have no embedded filenames, MIME types or runtime feature attribution.",
      "This strict index profile requires sorted, unique resource IDs and no payload/metadata overlap. Padding and unclaimed bytes are preserved; the sentinel is positional.",
      "Unselected compression markers are candidates only. Only the selected payload is decoded, within stored/output byte limits; unknown encodings remain bytes.",
      "Gzip decoding validates its members; the inventory ISIZE is the last member's modulo-2^32 size, not a total-size assertion for concatenated gzip.",
      "Complete index or selected bytes do not establish execution, rendering or application behavior.",
    ],
  };
};
