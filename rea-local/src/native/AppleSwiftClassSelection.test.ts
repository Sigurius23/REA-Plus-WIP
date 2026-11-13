import { describe, expect, it } from "vitest";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";

const base = 0x100000000n;
const provenance = { path: "/owned/classes.dylib", sha256: "a".repeat(64) };
const address = (offset: number) => `0x${(base + BigInt(offset)).toString(16)}`;
const fixture = () => {
  const bytes = Buffer.alloc(4096);
  const u32 = (offset: number, value: number) =>
    bytes.writeUInt32LE(value, offset);
  const u64 = (offset: number, value: bigint) =>
    bytes.writeBigUInt64LE(value, offset);
  const relative = (offset: number, target: number) =>
    bytes.writeInt32LE(target - offset, offset);
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
  u64(144, 12n);
  u32(152, 0x400);
  for (const [index, name] of ["First", "Middle", "Target"].entries()) {
    const descriptor = 0x500 + index * 0x100;
    relative(0x400 + index * 4, descriptor);
    u32(descriptor, 0x80000010);
    relative(descriptor + 8, 0xa00 + index * 32);
    u32(descriptor + 28, 16);
    u32(descriptor + 44, 14);
    u32(descriptor + 48, 1);
    relative(descriptor + 56, 0x900 + index * 16);
    bytes.write(`${name}\0`, 0xa00 + index * 32);
    u32(0x900 + index * 16, 0xd65f03c0);
  }
  return bytes;
};
const inspect = (bytes: Buffer, maximum: number, selected?: number) =>
  decodeAppleDispatchMetadata(bytes, maximum, provenance, {
    facet: "swift-vtables",
    ...(selected === undefined ? {} : { swiftClassAddress: address(selected) }),
  });
const coverage = (result: ReturnType<typeof inspect>) =>
  result.coverage.find(
    ({ facet }) => facet === "swift_class_vtable_descriptors",
  );

describe("indexed Swift class selection before vtable admission", () => {
  it("recovers a late indexed class under the same budget that admits only an earlier class broadly", () => {
    const bytes = fixture();
    const broad = inspect(bytes, 5);
    expect(broad.swift_dispatch_slots.map(({ owner }) => owner)).toEqual([
      "First",
    ]);
    const selected = inspect(bytes, 5, 0x700);
    expect(selected.swift_vtable_selection).toEqual({
      address: address(0x700),
      index_entries: 3,
      examined: 3,
      matching_index_entries: 1,
      matched: true,
      unresolved: 0,
    });
    expect(selected.swift_dispatch_slots).toMatchObject([
      { owner: "Target", implementation_address: address(0x920) },
    ]);
    expect(coverage(selected)).toMatchObject({
      status: "complete",
      examined: 1,
      decoded: 1,
      reason: expect.stringContaining("selected indexed Swift class"),
    });
    expect(
      selected.relative_pointers.some(
        ({ field }) => field.address === address(0x400),
      ),
    ).toBe(false);
  });

  it("proves indirect indexed aliases and decodes their one class only once", () => {
    const bytes = fixture();
    bytes.writeInt32LE(0x700 - 0x404, 0x404);
    bytes.writeInt32LE((0x450 - 0x408) | 1, 0x408);
    bytes.writeBigUInt64LE(base + 0x700n, 0x450);
    const selected = inspect(bytes, 6, 0x700);
    expect(selected.swift_vtable_selection).toMatchObject({
      matching_index_entries: 2,
      matched: true,
    });
    expect(selected.swift_dispatch_slots).toHaveLength(1);
    expect(
      selected.relative_pointers.find(
        ({ field }) => field.address === address(0x408),
      ),
    ).toMatchObject({
      indirect: true,
      indirect_slot: { address: address(0x450) },
      target: { address: address(0x700) },
      decode: { status: "decoded" },
    });
  });

  it("retains unresolved index identities without turning a match or nonmatch into global absence", () => {
    const bytes = fixture();
    bytes.writeInt32LE(0x7ffffffd, 0x400);
    const selected = inspect(bytes, 6, 0x700);
    expect(selected.swift_vtable_selection).toMatchObject({
      examined: 3,
      matched: true,
      unresolved: 1,
    });
    expect(selected.swift_dispatch_slots).toHaveLength(1);
    expect(coverage(selected)?.status).toBe("partial");
    expect(
      selected.relative_pointers.find(
        ({ field }) => field.address === address(0x400),
      )?.decode.status,
    ).toBe("partial");
    const absent = inspect(bytes, 6, 0xb00);
    expect(absent.swift_vtable_selection).toMatchObject({
      matched: false,
      unresolved: 1,
    });
    expect(coverage(absent)?.reason).toContain("prevent an absence claim");
  });

  it("does not decode an unindexed descriptor or an indexed non-class address", () => {
    const bytes = fixture();
    bytes.copy(bytes, 0xb00, 0x700, 0x740);
    expect(inspect(bytes, 100, 0xb00)).toMatchObject({
      swift_vtable_selection: { matched: false, examined: 3 },
      swift_dispatch_slots: [],
    });
    bytes.writeUInt32LE(17, 0x700);
    expect(inspect(bytes, 100, 0x700)).toMatchObject({
      swift_vtable_selection: { matched: false, examined: 3 },
      swift_dispatch_slots: [],
    });
  });

  it("keeps exact identity when the record budget cannot admit its class slots", () => {
    const selected = inspect(fixture(), 1, 0x700);
    expect(selected.swift_vtable_selection).toMatchObject({
      matched: true,
      examined: 3,
    });
    expect(selected.swift_dispatch_slots).toEqual([]);
    expect(selected.relative_pointers).toHaveLength(1);
    expect(coverage(selected)).toMatchObject({
      status: "partial",
      reason: expect.stringContaining("max_records_reached"),
    });
  });

  it("keeps unsupported generic class layouts explicit after indexed selection", () => {
    const bytes = fixture();
    bytes.writeUInt32LE(0x80000090, 0x700);
    const selected = inspect(bytes, 100, 0x700);
    expect(selected.swift_vtable_selection?.matched).toBe(true);
    expect(selected.swift_dispatch_slots).toEqual([]);
    expect(coverage(selected)).toMatchObject({
      status: "partial",
      reason: expect.stringContaining("Generic class"),
    });
  });
});

describe("Swift metadata index extents", () => {
  it.each([
    ["oversized", base + 0x400n, 1n << 44n],
    ["unmapped", base + 0x1000n, 12n],
    ["truncated", base + 0xff8n, 12n],
    ["wrapping", 0xfffffffffffffffen - 2n, 12n],
    ["misaligned", base + 0x400n, 10n],
  ] as const)(
    "rejects a %s type-index span before full scanning under a one-record budget",
    (_, start, length) => {
      const bytes = fixture();
      bytes.writeBigUInt64LE(start, 136);
      bytes.writeBigUInt64LE(length, 144);
      expect(() => inspect(bytes, 1, 0x700)).toThrow(/Swift metadata index/);
    },
  );

  it("applies the same full-span guard before conformance-name discovery", () => {
    const bytes = fixture();
    bytes.fill(0, 104, 120);
    bytes.write("__swift5_proto", 104);
    bytes.writeBigUInt64LE(1n << 44n, 144);
    expect(() =>
      decodeAppleDispatchMetadata(bytes, 1, provenance, {
        facet: "swift-conformances",
        swiftConformanceFilter: {
          protocol_name: "OwnedProtocol",
          type_name: null,
        },
      }),
    ).toThrow(/Swift metadata index __swift5_proto.*file-backed/);
  });

  it("does not inspect an unrequested index and admits a genuinely empty index", () => {
    const bytes = fixture();
    bytes.writeBigUInt64LE(1n << 44n, 144);
    const objc = decodeAppleDispatchMetadata(bytes, 1, provenance, {
      facet: "objc",
    });
    expect(coverage(objc)?.status).toBe("not_requested");
    const conformance = decodeAppleDispatchMetadata(bytes, 1, provenance, {
      facet: "swift-conformances",
    });
    expect(coverage(conformance)?.status).toBe("not_requested");
    bytes.writeBigUInt64LE(0n, 136);
    bytes.writeBigUInt64LE(0n, 144);
    expect(inspect(bytes, 1, 0x700).swift_vtable_selection).toMatchObject({
      examined: 0,
      matched: false,
      unresolved: 0,
    });
  });
});
