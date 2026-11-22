import { describe, expect, it } from "vitest";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";

const base = 0x100000000n;
const hex = (n: number) => `0x${(base + BigInt(n)).toString(16)}`;
const fixture = () => {
  const bytes = Buffer.alloc(4096);
  const u32 = (p: number, n: number) => bytes.writeUInt32LE(n, p);
  const u64 = (p: number, n: bigint) => bytes.writeBigUInt64LE(n, p);
  const rel = (p: number, n: number) => bytes.writeInt32LE(n - p, p);
  u32(0, 0xfeedfacf);
  u32(4, 0x0100000c);
  u32(12, 6);
  u32(16, 1);
  u32(20, 152);
  u32(32, 0x19);
  u32(36, 152);
  bytes.write("__TEXT", 40);
  u64(56, base);
  u64(64, 4096n);
  u64(80, 4096n);
  u32(88, 7);
  u32(92, 5);
  u32(96, 1);
  bytes.write("__swift5_types", 104);
  bytes.write("__TEXT", 120);
  u64(136, base + 0x400n);
  u64(144, 8n);
  u32(152, 0x400);
  for (const [descriptor, metadata, name] of [
    [0x500, 0x800, 0xb00],
    [0x540, 0x900, 0xb20],
  ] as const) {
    rel(descriptor === 0x500 ? 0x400 : 0x404, descriptor);
    u32(descriptor, 17);
    rel(descriptor + 8, name);
    bytes.write(descriptor === 0x500 ? "Owner\0" : "Other\0", name);
    rel(descriptor + 16, 0x600);
    u32(descriptor + 20, 3);
    u32(descriptor + 24, 2);
    u64(metadata, 0x200n);
    u64(metadata + 8, base + BigInt(descriptor));
    u64(metadata - 8, base + 0xa00n);
    [0, 16, 32].forEach((value, i) => u32(metadata + 16 + i * 4, value));
  }
  u32(0x608, 0x000c0000);
  u32(0x60c, 3);
  for (let i = 0; i < 3; i++) {
    rel(0x614 + i * 12, 0xc00);
    rel(0x618 + i * 12, 0xd00 + i * 16);
    bytes.write(`field${i}\0`, 0xd00 + i * 16);
  }
  bytes.write("SbSbYbc\0", 0xc00);
  u64(0xa10, base + 0xe00n);
  u64(0xa40, 48n);
  u64(0xa48, 48n);
  u32(0xa50, 7);
  u32(0xe00, 0xd65f03c0);
  return { bytes, u32, u64 };
};
const inspect = (
  bytes: Buffer,
  maximum = 100,
  owner = 0x500,
  metadata = 0x800,
) =>
  decodeAppleDispatchMetadata(
    bytes,
    maximum,
    { path: "/owned/layout.dylib", sha256: "a".repeat(64) },
    {
      facet: "swift-fields",
      swiftTypeAddress: hex(owner),
      swiftMetadataAddress: hex(metadata),
    },
  );
const layout = (bytes: Buffer) =>
  inspect(bytes).swift_type_fields!.static_metadata!;

describe("file-encoded Swift struct metadata identity and offsets", () => {
  it("binds the owner backpointer and reads uint32 entries from a word-offset vector", () => {
    const result = inspect(fixture().bytes),
      observation = result.swift_type_fields!.static_metadata!;
    expect(observation).toMatchObject({
      kind_word: "0x200",
      owner_matched: true,
      field_offset_vector: { address: hex(0x810) },
      field_offset_vector_word_offset: 2,
      field_offset_entry_bytes: 4,
      value_witness: {
        size_bytes: "48",
        stride_bytes: "48",
        alignment_bytes: 8,
        initialize_with_copy: { address: hex(0xe00) },
      },
      decode: { status: "decoded" },
    });
    expect(
      observation.field_offsets.map((f) => [
        f.ordinal,
        f.byte_offset,
        f.source.address,
      ]),
    ).toEqual([
      [0, 0, hex(0x810)],
      [1, 16, hex(0x814)],
      [2, 32, hex(0x818)],
    ]);
    expect(observation.pointers.map((p) => p.role)).toEqual([
      "nominal_descriptor",
      "value_witness_table",
      "initialize_with_copy",
    ]);
    expect(
      result.swift_type_fields!.fields[0]!.function_type!.argument_abi,
    ).toMatchObject({ status: "unresolved" });
    expect(
      result.coverage.find((c) => c.facet === "swift_static_struct_layout")
        ?.status,
    ).toBe("complete");
  });
  it("never replaces owner identity with shared VWT/copy helper identity", () => {
    const f = fixture();
    const other = inspect(f.bytes, 100, 0x540, 0x900).swift_type_fields!
      .static_metadata!;
    expect(other.owner_matched).toBe(true);
    expect(other.value_witness!.initialize_with_copy!.address).toBe(hex(0xe00));
    const wrong = inspect(f.bytes, 100, 0x500, 0x900).swift_type_fields!
      .static_metadata!;
    expect(
      inspect(f.bytes, 100, 0x500, 0x900).coverage.find(
        (c) => c.facet === "swift_static_struct_layout",
      ),
    ).toMatchObject({ examined: 0, decoded: 0, status: "partial" });
    expect(wrong).toMatchObject({
      owner_matched: false,
      field_offsets: [],
      decode: {
        status: "partial",
        reason: expect.stringContaining("backpointer"),
      },
    });
  });
  it("preserves reflection facts when selected metadata has the wrong kind", () => {
    const f = fixture();
    f.u64(0x800, 0x201n);
    const result = inspect(f.bytes);
    expect(result.swift_type_fields!.fields).toHaveLength(3);
    expect(result.swift_type_fields!.static_metadata).toMatchObject({
      kind_word: "0x201",
      owner_matched: false,
      field_offsets: [],
      decode: { status: "partial" },
    });
  });
  it.each([0, 1])(
    "rejects absent/header-overlapping vector word offset %d",
    (offset) => {
      const f = fixture();
      f.u32(0x518, offset);
      expect(layout(f.bytes)).toMatchObject({
        field_offsets: [],
        decode: {
          status: "partial",
          reason: expect.stringContaining("vector"),
        },
      });
    },
  );
  it("rejects incomplete or inconsistent VWT layout without declaring field offsets", () => {
    const f = fixture();
    f.u32(0xa50, 0x400007);
    expect(layout(f.bytes)).toMatchObject({
      field_offsets: [],
      decode: {
        status: "partial",
        reason: expect.stringContaining("Incomplete"),
      },
    });
    const bad = fixture();
    bad.u64(0xa48, 1n);
    expect(layout(bad.bytes)).toMatchObject({
      field_offsets: [],
      decode: { status: "partial", reason: expect.stringContaining("stride") },
    });
  });
  it("keeps pointer targets but rejects null/unmapped witnesses and closure-field overrun", () => {
    const nullVwt = fixture();
    nullVwt.u64(0x7f8, 0n);
    expect(layout(nullVwt.bytes).pointers[1]).toMatchObject({
      target: { address: "0x0" },
      decode: { status: "partial" },
    });
    const unmapped = fixture();
    unmapped.u64(0xa10, base + 0x2000n);
    expect(layout(unmapped.bytes).decode.status).toBe("partial");
    const overrun = fixture();
    overrun.u32(0x810, 40);
    expect(layout(overrun.bytes)).toMatchObject({
      field_offsets: [],
      decode: { status: "partial", reason: expect.stringContaining("closure") },
    });
  });
  it("retains admitted offsets and marks common pointer coverage partial after budget exhaustion", () => {
    const result = inspect(fixture().bytes, 19),
      observation = result.swift_type_fields!.static_metadata!;
    expect(observation.field_offsets).toHaveLength(1);
    expect(observation.decode).toMatchObject({
      status: "partial",
      reason: "max_records_reached",
    });
    expect(
      result.coverage.find((c) => c.facet === "binary_relative_pointers"),
    ).toMatchObject({ status: "partial", reason: "max_records_reached" });
  });
  it("keeps optional metadata capability unmeasured unless explicitly selected", () => {
    const result = decodeAppleDispatchMetadata(
      fixture().bytes,
      100,
      { path: "/x", sha256: "a".repeat(64) },
      { facet: "swift-fields", swiftTypeAddress: hex(0x500) },
    );
    expect(result.swift_type_fields!.static_metadata).toBeUndefined();
    expect(
      result.coverage.find((c) => c.facet === "swift_static_struct_layout")
        ?.status,
    ).toBe("not_requested");
  });
});
