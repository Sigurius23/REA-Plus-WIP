// Selectively adapted from upstream REA f7849cad3fe3bffb207b4dc30f34394978c20297.
import { createHash } from "node:crypto";
import { crc32 } from "node:zlib";
import { err, ok, type Result } from "../result.js";
import type { RegionDecodeFailure } from "./regionDecoder.js";
import {
  FitMetadataBudget,
  FitParseFailure,
  malformedFit,
  type FitCapacity,
} from "./fitFailure.js";
import {
  parseFdtStructure,
  type FdtNode,
  type FdtProperty,
  type FdtStructure,
} from "./fdtStructure.js";
import type { FitMetadata, FitImageMetadata } from "./fitMetadata.js";
export type { FitCapacity } from "./fitFailure.js";
export interface FitImageRegion {
  readonly path: string;
  readonly offset: number;
  readonly bytes: Uint8Array;
  readonly metadata: FitImageMetadata;
}
export interface FitImage {
  readonly metadata: FitMetadata;
  readonly regions: readonly FitImageRegion[];
  readonly limitations: readonly string[];
  readonly integrityFailures: readonly string[];
}
const HASH_BYTES = new Map([
  ["crc32", 4],
  ["md5", 16],
  ["sha1", 20],
  ["sha256", 32],
  ["sha384", 48],
  ["sha512", 64],
]);
const UTF8 = new TextDecoder("utf-8", { fatal: true, ignoreBOM: true });
const align4 = (value: number) => Math.ceil(value / 4) * 4;
interface Context {
  readonly bytes: Buffer;
  readonly tree: FdtStructure;
  readonly budget: FitMetadataBudget;
  readonly limitations: string[];
  readonly integrityFailures: string[];
  readonly digestCache: Map<string, string>;
  hashBytes: number;
}
const property = (node: FdtNode, name: string) => node.properties.get(name);
const raw = (context: Context, prop: FdtProperty) =>
  context.bytes.subarray(prop.offset, prop.offset + prop.length);
const hexProperty = (
  context: Context,
  prop: FdtProperty | undefined,
): string | null => {
  if (prop === undefined) return null;
  context.budget.charge(prop.length * 4);
  return raw(context, prop).toString("hex");
};
const limit = (
  context: Context,
  node: FdtNode,
  field: string,
  detail: string,
) => {
  context.budget.charge(
    (node.path.length + field.length + detail.length) * 2 + 64,
  );
  context.limitations.push(`${node.path}: ${field} ${detail}`);
};
const strings = (
  context: Context,
  node: FdtNode,
  name: string,
  single = false,
): string[] | null => {
  const prop = property(node, name);
  if (prop === undefined) return null;
  const bytes = raw(context, prop);
  let entries = 0;
  for (const byte of bytes) if (byte === 0) entries++;
  if (bytes.at(-1) !== 0 || entries === 0 || (single && entries !== 1)) {
    limit(
      context,
      node,
      name,
      "is not a NUL-terminated UTF-8 string" + (single ? "" : " list"),
    );
    return null;
  }
  context.budget.charge(bytes.length * 2 + entries * 32);
  try {
    return UTF8.decode(bytes.subarray(0, -1)).split("\0");
  } catch {
    limit(context, node, name, "contains invalid UTF-8");
    return null;
  }
};
const string = (context: Context, node: FdtNode, name: string): string | null =>
  strings(context, node, name, true)?.[0] ?? null;
const address = (
  context: Context,
  node: FdtNode,
  name: string,
): string | null => {
  const prop = property(node, name);
  if (prop === undefined) return null;
  if (prop.length !== 4 && prop.length !== 8) {
    limit(context, node, name, "is not a 1- or 2-cell address");
    return null;
  }
  const value =
    prop.length === 4
      ? BigInt(context.bytes.readUInt32BE(prop.offset))
      : context.bytes.readBigUInt64BE(prop.offset);
  return `0x${value.toString(16)}`;
};
const uint32 = (
  context: Context,
  node: FdtNode,
  name: string,
): number | null => {
  const prop = property(node, name);
  if (prop === undefined) return null;
  if (prop.length !== 4) {
    limit(context, node, name, "is not a 32-bit cell");
    return null;
  }
  return context.bytes.readUInt32BE(prop.offset);
};
const locatingCell = (
  context: Context,
  node: FdtNode,
  prop: FdtProperty,
): number => {
  if (prop.length !== 4 && prop.length !== 8)
    return malformedFit(
      `${node.path}: ${prop.name} is not a 1- or 2-cell integer`,
    );
  const value =
    prop.length === 4
      ? BigInt(context.bytes.readUInt32BE(prop.offset))
      : context.bytes.readBigUInt64BE(prop.offset);
  if (value > BigInt(Number.MAX_SAFE_INTEGER))
    return malformedFit(
      `${node.path}: ${prop.name} exceeds exact integer range`,
    );
  return Number(value);
};
const rangeOf = (
  context: Context,
  node: FdtNode,
): {
  offset: number;
  length: number;
  data_source: FitImageMetadata["data_source"];
  declared_offset: number | null;
} => {
  const sources = ["data", "data-offset", "data-position"].flatMap((name) => {
    const p = property(node, name);
    return p === undefined ? [] : [p];
  });
  const source = sources[0];
  if (sources.length !== 1 || source === undefined)
    return malformedFit(
      `${node.path}: expected exactly one data, data-offset or data-position property`,
    );
  if (source.name === "data")
    return {
      offset: source.offset,
      length: source.length,
      data_source: "embedded",
      declared_offset: null,
    };
  const declared = locatingCell(context, node, source),
    size = property(node, "data-size");
  if (size === undefined)
    return malformedFit(`${node.path}: external data needs data-size`);
  const length = locatingCell(context, node, size),
    offset =
      source.name === "data-offset"
        ? align4(context.tree.totalsize) + declared
        : declared;
  if (
    !Number.isSafeInteger(offset) ||
    offset < context.tree.totalsize ||
    length > context.bytes.length - offset
  )
    return malformedFit(
      `${node.path}: external image range lies outside the carrier or overlaps the devicetree`,
    );
  return {
    offset,
    length,
    data_source: source.name as "data-offset" | "data-position",
    declared_offset: declared,
  };
};
const signatureFacts = (
  context: Context,
  node: FdtNode,
): Pick<
  FitImageMetadata,
  | "signature_count"
  | "signatures_unreadable"
  | "signature_algorithms"
  | "signatures"
> => {
  const children = context.tree.children.get(node.path) ?? [];
  const signatures: FitImageMetadata["signatures"] = [];
  for (const child of children) {
    if (!child.name.startsWith("signature")) continue;
    context.budget.charge(128);
    signatures.push({
      name: child.name,
      algorithm: string(context, child, "algo"),
      algorithm_bytes_hex: hexProperty(context, property(child, "algo")),
      value_hex: hexProperty(context, property(child, "value")),
      key_name_hint: string(context, child, "key-name-hint"),
      verified: false,
    });
  }
  if (signatures.length > 0)
    limit(
      context,
      node,
      "signature declarations",
      "are retained but cryptographic signatures and trusted-key policy are not verified",
    );
  return {
    signature_count: signatures.length,
    signatures_unreadable: signatures.filter((s) => s.algorithm === null)
      .length,
    signature_algorithms: signatures.flatMap((s) =>
      s.algorithm === null ? [] : [s.algorithm],
    ),
    signatures,
  };
};
const hashFacts = (
  context: Context,
  node: FdtNode,
  data: Buffer,
  offset: number,
): Pick<
  FitImageMetadata,
  | "hashes"
  | "hash_algorithms"
  | "hashes_verified"
  | "hashes_mismatched"
  | "hashes_unverified"
> => {
  const hashes: FitImageMetadata["hashes"] = [];
  for (const child of context.tree.children.get(node.path) ?? []) {
    if (!child.name.startsWith("hash")) continue;
    context.budget.charge(128);
    const algorithm = string(context, child, "algo"),
      expected = algorithm === null ? undefined : HASH_BYTES.get(algorithm),
      value = property(child, "value");
    const declared = hexProperty(context, value);
    let observed: string | null = null,
      status: "matches" | "mismatched" | "unverified" = "unverified";
    if (expected !== undefined && value !== undefined && algorithm !== null) {
      const key = `${algorithm}:${String(offset)}:${String(data.length)}`;
      const cached = context.digestCache.get(key);
      if (cached !== undefined) observed = cached;
      else {
        if (
          data.length >
          context.budget.capacity.maxHashBytes - context.hashBytes
        )
          context.budget.limit(
            "max_firmware_hash_bytes",
            context.budget.capacity.maxHashBytes,
            "cpu",
          );
        context.budget.charge(key.length * 2 + expected * 4 + 128);
        context.hashBytes += data.length;
        observed =
          algorithm === "crc32"
            ? crc32(data).toString(16).padStart(8, "0")
            : createHash(algorithm).update(data).digest("hex");
        context.digestCache.set(key, observed);
      }
      status =
        value.length === expected && declared === observed
          ? "matches"
          : "mismatched";
      if (status === "mismatched") {
        context.budget.charge(
          (node.path.length +
            child.name.length +
            algorithm.length +
            (declared?.length ?? 7) +
            observed.length +
            128) *
            4,
        );
        const message = `${node.path}/${child.name}: ${algorithm} mismatch; declared ${declared ?? "missing"}, observed ${observed}`;
        context.integrityFailures.push(message);
        context.limitations.push(
          `${message}. Stored image bytes are observed-untrusted.`,
        );
      }
    } else
      limit(
        context,
        child,
        "hash declaration",
        "has an unsupported/missing algorithm or value and remains unverified",
      );
    hashes.push({
      name: child.name,
      algorithm,
      algorithm_bytes_hex: hexProperty(context, property(child, "algo")),
      declared_hex: declared,
      observed_hex: observed,
      status,
    });
  }
  return {
    hashes,
    hash_algorithms: hashes.flatMap((h) =>
      h.algorithm === null ? [] : [h.algorithm],
    ),
    hashes_verified: hashes.filter((h) => h.status === "matches").length,
    hashes_mismatched: hashes.filter((h) => h.status === "mismatched").length,
    hashes_unverified: hashes.filter((h) => h.status === "unverified").length,
  };
};
const image = (
  context: Context,
  node: FdtNode,
  index: number,
): FitImageRegion => {
  context.budget.charge(512);
  const range = rangeOf(context, node),
    unreadable: string[] = [];
  const field = <T>(
    name: string,
    reader: (context: Context, node: FdtNode, name: string) => T | null,
  ): T | null => {
    const value = reader(context, node, name);
    if (value === null && property(node, name) !== undefined)
      unreadable.push(name);
    return value;
  };
  const data = context.bytes.subarray(
      range.offset,
      range.offset + range.length,
    ),
    cipher = (context.tree.children.get(node.path) ?? []).find(
      (n) => n.name === "cipher",
    );
  const imageData = string(context, node, "image-data");
  if (property(node, "image-data") !== undefined && imageData === null)
    return malformedFit(`${node.path}: image-data is not one UTF-8 string`);
  const cipherAlgo =
    cipher === undefined ? null : string(context, cipher, "algo");
  if (
    cipher !== undefined &&
    cipherAlgo === null &&
    property(cipher, "algo") !== undefined
  )
    unreadable.push("cipher_algo");
  const metadata: FitImageMetadata = {
    kind: "fit-image",
    index,
    name: node.name,
    description: field("description", string),
    type: field("type", string),
    arch: field("arch", string),
    os: field("os", string),
    compression: field("compression", string),
    load: field("load", address),
    entry: field("entry", address),
    data_source: range.data_source,
    declared_offset: range.declared_offset,
    overlap_earlier_image_index: null,
    image_data: imageData,
    cipher_present: cipher !== undefined,
    cipher_algo: cipherAlgo,
    unreadable_fields: unreadable,
    ...hashFacts(context, node, data, range.offset),
    ...signatureFacts(context, node),
  };
  if (cipher !== undefined)
    limit(
      context,
      node,
      "cipher declaration",
      "is retained; stored bytes are not decrypted",
    );
  return {
    path: `image-${String(index).padStart(4, "0")}.bin`,
    offset: range.offset,
    bytes: data,
    metadata,
  };
};
const validateLinks = (images: readonly FitImageRegion[]) => {
  const byName = new Map(images.map((image) => [image.metadata.name, image]));
  for (const image of images) {
    const targetName = image.metadata.image_data;
    if (targetName === null) continue;
    const target = byName.get(targetName);
    if (target === undefined || target.metadata.image_data !== null)
      return malformedFit(
        `/images/${image.metadata.name}: image-data must name an existing unchained image`,
      );
    const embedded = image.metadata.data_source === "embedded",
      targetEmbedded = target.metadata.data_source === "embedded";
    if (
      embedded !== targetEmbedded ||
      image.bytes.length !== target.bytes.length ||
      (embedded
        ? !Buffer.from(
            image.bytes.buffer,
            image.bytes.byteOffset,
            image.bytes.length,
          ).equals(target.bytes)
        : image.offset !== target.offset)
    )
      return malformedFit(
        `/images/${image.metadata.name}: data does not match its image-data target`,
      );
  }
  const external = images
    .filter(
      (image) =>
        image.metadata.data_source !== "embedded" && image.bytes.length > 0,
    )
    .sort((a, b) => a.offset - b.offset || a.metadata.index - b.metadata.index);
  let reach: FitImageRegion | undefined;
  for (const image of external) {
    if (reach !== undefined && image.offset < reach.offset + reach.bytes.length)
      image.metadata.overlap_earlier_image_index = reach.metadata.index;
    if (
      reach === undefined ||
      image.offset + image.bytes.length > reach.offset + reach.bytes.length
    )
      reach = image;
  }
};
const configurations = (
  context: Context,
  images: readonly FitImageRegion[],
): Pick<FitMetadata, "default_configuration" | "configurations"> => {
  const parent = context.tree.byPath.get("/configurations");
  if (parent === undefined)
    return { default_configuration: null, configurations: [] };
  const names = new Set(images.map((image) => image.metadata.name)),
    entries: FitMetadata["configurations"] = [];
  for (const child of context.tree.children.get(parent.path) ?? []) {
    context.budget.charge(256);
    const refs = {
      kernel: strings(context, child, "kernel") ?? [],
      firmware: strings(context, child, "firmware") ?? [],
      fdt: strings(context, child, "fdt") ?? [],
      ramdisk: strings(context, child, "ramdisk") ?? [],
      loadables: strings(context, child, "loadables") ?? [],
    };
    let unresolved = 0;
    for (const list of Object.values(refs))
      for (const name of list) if (!names.has(name)) unresolved++;
    if (unresolved > 0)
      limit(
        context,
        child,
        "image references",
        `include ${String(unresolved)} unresolved names`,
      );
    entries.push({
      name: child.name,
      description: string(context, child, "description"),
      ...refs,
      unresolved_reference_count: unresolved,
      ...signatureFacts(context, child),
    });
  }
  const selected = string(context, parent, "default");
  if (selected !== null && !entries.some((entry) => entry.name === selected))
    limit(context, parent, "default", `names no configuration: ${selected}`);
  return { default_configuration: selected, configurations: entries };
};
/** Decode a bounded whole-carrier snapshot without decompression, execution or signature trust. */
export const parseFitImage = (
  bytes: Uint8Array,
  capacity: FitCapacity,
): Result<FitImage, RegionDecodeFailure> => {
  try {
    if (
      [
        capacity.maxElements,
        capacity.maxTreeNodes,
        capacity.maxTreeProperties,
        capacity.maxTreeDepth,
        capacity.maxMetadataBytes,
        capacity.maxHashBytes,
      ].some((value) => !Number.isSafeInteger(value) || value < 1)
    )
      return err({
        kind: "format",
        message: "FIT budgets must be positive safe integers",
      });
    const buffer = Buffer.from(
        bytes.buffer,
        bytes.byteOffset,
        bytes.byteLength,
      ),
      budget = new FitMetadataBudget(capacity),
      tree = parseFdtStructure(buffer, budget);
    const root = tree.byPath.get("/"),
      imagesNode = tree.byPath.get("/images");
    if (root === undefined || imagesNode === undefined)
      return malformedFit("/images node is missing");
    const nodes = tree.children.get(imagesNode.path) ?? [];
    if (nodes.length > capacity.maxElements)
      budget.limit("max_firmware_elements", capacity.maxElements);
    const context: Context = {
      bytes: buffer,
      tree,
      budget,
      limitations: [],
      integrityFailures: [],
      digestCache: new Map(),
      hashBytes: 0,
    };
    budget.charge(nodes.length * 8);
    const regions = nodes.map((node, index) => image(context, node, index));
    validateLinks(regions);
    const overlaps = regions.filter(
      (region) => region.metadata.overlap_earlier_image_index !== null,
    ).length;
    if (overlaps > 0) {
      budget.charge(512);
      context.limitations.push(
        `${String(overlaps)} FIT image ranges overlap an earlier external range in address order; each remains a separate entry, including declared image-data shares. No payload bytes were merged.`,
      );
    }
    budget.charge((regions.length + 1) * 32);
    const unclaimed: { offset: number; length: number }[] = [],
      ordered = regions
        .filter(
          (region) =>
            region.metadata.data_source !== "embedded" &&
            region.bytes.length > 0,
        )
        .sort((a, b) => a.offset - b.offset);
    let end = tree.totalsize;
    for (const region of ordered) {
      if (region.offset > end)
        unclaimed.push({ offset: end, length: region.offset - end });
      end = Math.max(end, region.offset + region.bytes.length);
    }
    if (end < buffer.length)
      unclaimed.push({ offset: end, length: buffer.length - end });
    if (unclaimed.length > 0) {
      budget.charge(512);
      context.limitations.push(
        `${String(unclaimed.length)} carrier range(s), including possible alignment padding, lie outside the FIT devicetree and declared image ranges; their bytes remain unclassified.`,
      );
    }
    const metadata: FitMetadata = {
      kind: "fit",
      fdt_version: tree.version,
      fdt_totalsize: tree.totalsize,
      external_data_base: align4(tree.totalsize),
      description: string(context, root, "description"),
      timestamp: uint32(context, root, "timestamp"),
      address_cells: uint32(context, root, "#address-cells"),
      ...configurations(context, regions),
      examined_nodes: tree.nodes.length,
      examined_properties: tree.propertyCount,
      reservation_count: tree.reservationCount,
      overlapping_image_count: overlaps,
      unclaimed_ranges: unclaimed,
    };
    return ok({
      metadata,
      regions,
      limitations: [
        "FIT properties are stored declarations; compression/cipher payloads are extracted as stored. Hash consistency does not authenticate a publisher or prove boot behavior. Device-tree bindings, overlays and boot selection are not evaluated.",
        ...context.limitations,
      ],
      integrityFailures: context.integrityFailures,
    });
  } catch (cause) {
    if (cause instanceof FitParseFailure) return err(cause.failure);
    throw cause;
  }
};
