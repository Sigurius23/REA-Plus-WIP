import type { AndroidOtaPayloadMetadata as Metadata } from "./androidOtaMetadata.js";
import {
  otaMalformed as format,
  otaUint32 as uint32,
  otaDecimal as decimal,
  otaSigned as signed,
  otaBoolean as bool,
  type OtaWireField,
} from "./androidOtaWire.js";
type Partition = Metadata["partitions"][number];
type Operation = Partition["operations"][number];
type Extent = Operation["src_extents"][number];
type Info = NonNullable<Partition["new_partition_info"]>;
type Text = Partition["name"];
type Unknown = Metadata["unknown_fields"][number];
type Dynamic = NonNullable<Metadata["dynamic_partition_metadata"]>;
export interface AndroidOtaManifestContext {
  readonly element: () => void;
  readonly fields: (bytes: Uint8Array) => Iterable<OtaWireField>;
  readonly hex: (bytes: Uint8Array) => string;
  readonly text: (bytes: Uint8Array) => Text;
  readonly unknown: (field: OtaWireField) => Unknown;
}
const TYPES: Readonly<Record<number, string>> = {
  0: "REPLACE",
  1: "REPLACE_BZ",
  2: "MOVE",
  3: "BSDIFF",
  4: "SOURCE_COPY",
  5: "SOURCE_BSDIFF",
  6: "ZERO",
  7: "DISCARD",
  8: "REPLACE_XZ",
  9: "PUFFDIFF",
  10: "BROTLI_BSDIFF",
  11: "ZUCCHINI",
  12: "LZ4DIFF_BSDIFF",
  13: "LZ4DIFF_PUFFDIFF",
};
const missingWindow = (length: bigint) => ({
  file_offset: null,
  declared_length: length.toString(),
  stored_size: 0,
  availability: length === 0n ? ("empty" as const) : ("missing" as const),
});

/** Decode manifest semantics; wire/metadata/record admission is owned by the caller context. */
export function decodeAndroidOtaManifest(
  bytes: Uint8Array,
  out: Metadata,
  context: AndroidOtaManifestContext,
): void {
  const { element, fields, hex, text, unknown } = context;
  const info = (b: Uint8Array, old: Info | null): Info => {
    const out: Info = old ?? {
      size: null,
      hash_hex: null,
      hash_verified: false,
      unknown_fields: [],
    };
    for (const f of fields(b))
      if (f.field === 1 && f.wire === 0) out.size = decimal(f);
      else if (f.field === 2 && f.wire === 2) out.hash_hex = hex(f.bytes);
      else out.unknown_fields.push(unknown(f));
    return out;
  };
  const extent = (b: Uint8Array): Extent => {
    element();
    const out: Extent = {
      start_block: null,
      num_blocks: null,
      sparse_hole: false,
      unknown_fields: [],
    };
    for (const f of fields(b))
      if (f.field === 1 && f.wire === 0) {
        out.start_block = decimal(f);
        out.sparse_hole = f.integer === 0xffff_ffff_ffff_ffffn;
      } else if (f.field === 2 && f.wire === 0) out.num_blocks = decimal(f);
      else out.unknown_fields.push(unknown(f));
    return out;
  };
  const operation = (
    b: Uint8Array,
    index: number,
    partition: number,
  ): Operation => {
    element();
    let type: number | null = null;
    const out: Operation = {
      index,
      type_code: 0,
      type_name: null,
      path: `partitions/${String(partition).padStart(4, "0")}/operation-${String(index).padStart(6, "0")}.bin`,
      data_offset: null,
      data_length: null,
      src_length: null,
      dst_length: null,
      src_extents: [],
      dst_extents: [],
      data_sha256: {
        declared_hex: null,
        observed_hex: null,
        status: "absent",
      },
      src_sha256_hex: null,
      src_hash_verified: false,
      ...missingWindow(0n),
      unknown_fields: [],
    };
    for (const f of fields(b)) {
      if (f.field === 1 && f.wire === 0) {
        type = uint32(f);
        if (type > 0x7fff_ffff)
          format("InstallOperation type is a negative/out-of-range int32 enum");
      } else if (f.wire === 0 && f.field === 2) out.data_offset = decimal(f);
      else if (f.wire === 0 && f.field === 3) out.data_length = decimal(f);
      else if (f.wire === 2 && f.field === 4)
        out.src_extents.push(extent(f.bytes));
      else if (f.wire === 0 && f.field === 5) out.src_length = decimal(f);
      else if (f.wire === 2 && f.field === 6)
        out.dst_extents.push(extent(f.bytes));
      else if (f.wire === 0 && f.field === 7) out.dst_length = decimal(f);
      else if (f.wire === 2 && f.field === 8)
        out.data_sha256.declared_hex = hex(f.bytes);
      else if (f.wire === 2 && f.field === 9) out.src_sha256_hex = hex(f.bytes);
      else out.unknown_fields.push(unknown(f));
    }
    if (type === null) format("InstallOperation is missing its required type");
    out.type_code = type;
    out.type_name = TYPES[type] ?? null;
    return out;
  };
  const partition = (b: Uint8Array, index: number): Partition => {
    element();
    let name: Text | null = null;
    const out: Partition = {
      index,
      name: { value: null, bytes_hex: "" },
      run_postinstall: null,
      postinstall_path: null,
      filesystem_type: null,
      old_partition_info: null,
      new_partition_info: null,
      version: null,
      estimate_cow_size: null,
      merge_operations_hex: [],
      operations: [],
      partition_image_reconstructed: false,
      reconstruction_requirements: {
        operation_application: true,
        source_data: false,
        decompression: false,
        zero_fill: false,
        discard_semantics: false,
        unknown_operation_semantics: false,
        declared_partition_size: false,
      },
      unknown_fields: [],
    };
    for (const f of fields(b)) {
      if (f.field === 1 && f.wire === 2) name = text(f.bytes);
      else if (f.field === 2 && f.wire === 0) out.run_postinstall = bool(f);
      else if (f.field === 3 && f.wire === 2)
        out.postinstall_path = text(f.bytes);
      else if (f.field === 4 && f.wire === 2)
        out.filesystem_type = text(f.bytes);
      else if (f.field === 6 && f.wire === 2)
        out.old_partition_info = info(f.bytes, out.old_partition_info);
      else if (f.field === 7 && f.wire === 2)
        out.new_partition_info = info(f.bytes, out.new_partition_info);
      else if (f.field === 8 && f.wire === 2)
        out.operations.push(operation(f.bytes, out.operations.length, index));
      else if (f.field === 17 && f.wire === 2) out.version = text(f.bytes);
      else if (f.field === 18 && f.wire === 2) {
        element();
        out.merge_operations_hex.push(hex(f.bytes));
      } else if (f.field === 19 && f.wire === 0)
        out.estimate_cow_size = decimal(f);
      else out.unknown_fields.push(unknown(f));
    }
    if (name === null)
      format("PartitionUpdate is missing its required partition_name");
    out.name = name;
    return out;
  };
  const group = (b: Uint8Array): Dynamic["groups"][number] => {
    element();
    let name: Text | null = null;
    const out: Dynamic["groups"][number] = {
      name: { value: null, bytes_hex: "" },
      size: null,
      partition_names: [],
      unknown_fields: [],
    };
    for (const f of fields(b))
      if (f.field === 1 && f.wire === 2) name = text(f.bytes);
      else if (f.field === 2 && f.wire === 0) out.size = decimal(f);
      else if (f.field === 3 && f.wire === 2) {
        element();
        out.partition_names.push(text(f.bytes));
      } else out.unknown_fields.push(unknown(f));
    if (name === null)
      format("DynamicPartitionGroup is missing its required name");
    out.name = name;
    return out;
  };
  const dynamic = (b: Uint8Array, old: Dynamic | null): Dynamic => {
    const out: Dynamic = old ?? {
      groups: [],
      snapshot_enabled: null,
      vabc_enabled: null,
      vabc_compression_param: null,
      unknown_fields: [],
    };
    for (const f of fields(b))
      if (f.field === 1 && f.wire === 2) out.groups.push(group(f.bytes));
      else if (f.field === 2 && f.wire === 0) out.snapshot_enabled = bool(f);
      else if (f.field === 3 && f.wire === 0) out.vabc_enabled = bool(f);
      else if (f.field === 4 && f.wire === 2)
        out.vabc_compression_param = text(f.bytes);
      else out.unknown_fields.push(unknown(f));
    return out;
  };
  const apex = (b: Uint8Array): Metadata["apex_info"][number] => {
    element();
    const out: Metadata["apex_info"][number] = {
      package_name: null,
      version: null,
      is_compressed: null,
      decompressed_size: null,
      unknown_fields: [],
    };
    for (const f of fields(b))
      if (f.field === 1 && f.wire === 2) out.package_name = text(f.bytes);
      else if (f.field === 2 && f.wire === 0) out.version = signed(f);
      else if (f.field === 3 && f.wire === 0) out.is_compressed = bool(f);
      else if (f.field === 4 && f.wire === 0) out.decompressed_size = signed(f);
      else out.unknown_fields.push(unknown(f));
    return out;
  };
  for (const f of fields(bytes)) {
    if (f.field === 3 && f.wire === 0) {
      out.block_size = uint32(f);
      out.block_size_source = "declared";
      if (out.block_size === 0) format("manifest block_size is zero");
    } else if (f.field === 4 && f.wire === 0)
      out.signatures_offset = decimal(f);
    else if (f.field === 5 && f.wire === 0) out.signatures_size = decimal(f);
    else if (f.field === 12 && f.wire === 0) out.minor_version = uint32(f);
    else if (f.field === 13 && f.wire === 2)
      out.partitions.push(partition(f.bytes, out.partitions.length));
    else if (f.field === 14 && f.wire === 0) out.max_timestamp = signed(f);
    else if (f.field === 15 && f.wire === 2)
      out.dynamic_partition_metadata = dynamic(
        f.bytes,
        out.dynamic_partition_metadata,
      );
    else if (f.field === 16 && f.wire === 0) out.partial_update = bool(f);
    else if (f.field === 17 && f.wire === 2) out.apex_info.push(apex(f.bytes));
    else if (f.field === 18 && f.wire === 2)
      out.security_patch_level = text(f.bytes);
    else out.unknown_fields.push(unknown(f));
  }
  out.payload_kind = out.minor_version === 0 ? "full" : "delta";
  for (const p of out.partitions) {
    p.reconstruction_requirements = {
      operation_application: true,
      source_data: p.operations.some(
        (o) =>
          o.src_extents.length > 0 ||
          [2, 3, 4, 5, 9, 10, 11, 12, 13].includes(o.type_code),
      ),
      decompression: p.operations.some((o) =>
        [1, 8, 10, 12, 13].includes(o.type_code),
      ),
      zero_fill: p.operations.some((o) => o.type_code === 6),
      discard_semantics: p.operations.some((o) => o.type_code === 7),
      unknown_operation_semantics: p.operations.some(
        (o) => o.type_name === null,
      ),
      declared_partition_size:
        p.new_partition_info?.size !== null &&
        p.new_partition_info?.size !== undefined,
    };
  }
}
