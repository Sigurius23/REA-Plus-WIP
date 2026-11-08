import { describe, expect, it } from "vitest";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";
import { AnalysisInputError } from "../domain/analysisErrorCore.js";

const base = 0x100000000n;
const provenance = { path: "/fixture/resilient.dylib", sha256: "a".repeat(64) };

/** Two mapped segments keep data addresses distinct from executable addresses. */
const fixture = (external = false) => {
  const bytes = Buffer.alloc(4096);
  const u32 = (at: number, value: number) => bytes.writeUInt32LE(value, at);
  const u64 = (at: number, value: bigint) => bytes.writeBigUInt64LE(value, at);
  const relative = (at: number, target: number) =>
    bytes.writeInt32LE(target - at, at);
  u32(0, 0xfeedfacf);
  u32(4, 0x0100000c);
  u32(16, external ? 4 : 2);
  u32(20, external ? 336 : 224);
  for (const [at, name, offset, count] of [
    [32, "__TEXT", 0, 0],
    [104, "__DATA", 0x800, 1],
  ] as const) {
    u32(at, 0x19);
    u32(at + 4, 72 + count * 80);
    bytes.write(name, at + 8);
    u64(at + 24, base + BigInt(offset));
    u64(at + 32, 0x800n);
    u64(at + 40, BigInt(offset));
    u64(at + 48, 0x800n);
    u32(at + 60, offset === 0 ? 5 : 3);
    u32(at + 64, count);
  }
  bytes.write("__swift5_proto", 176);
  bytes.write("__DATA", 192);
  u64(208, base + 0x900n);
  u64(216, 4n);
  u32(224, 0x900);
  relative(0x900, 0xa00);
  relative(0xa00, 0xb80);
  relative(0xa04, 0xc88);
  u32(0xa0c, 0x30008); // indirect nominal type, resilient + generic witness tails
  u32(0xa10, 1);
  relative(0xa14, 0xbc0);
  relative(0xa18, 0x500);
  u32(0xa1c, 0x10000); // two uint16 size/control words, not a requirement count
  relative(0xa24, 0xc40);
  u32(0xb00, 18);
  relative(0xb08, 0xc00);
  u32(0xb80, 3);
  relative(0xb88, 0xc20);
  u32(0xbc0, 2); // synchronous initializer requirement
  bytes.write("Request\0", 0xc00);
  bytes.write("DecodableFixture\0", 0xc20);
  u64(0xc88, base + 0xb00n);
  if (external) {
    // LC_DYLD_INFO_ONLY and a dependent dylib, using actual bind opcodes.
    u32(256, 0x80000022);
    u32(260, 48);
    u32(272, 0xf00);
    u32(304, 0xc);
    u32(308, 64);
    u32(312, 24);
    bytes.write("/usr/lib/swift/libswiftCore.dylib\0", 328);
    const bind = Buffer.concat([
      Buffer.from([0x11, 0x41]),
      Buffer.from("_$sSeMp\0"),
      Buffer.from([0x51, 0x60, 0x7d, 0x71, 0xf8, 0x08, 0x90, 0x41]),
      Buffer.from("_$sSe4fromxs7Decoder_p_tKcfCTq\0"),
      Buffer.from([0x71, 0x80, 0x09, 0x90, 0]),
    ]);
    u32(276, bind.length);
    bind.copy(bytes, 0xf00);
    relative(0xa00, 0xc78);
    u32(0xa00, bytes.readUInt32LE(0xa00) | 1);
    relative(0xa14, 0xc80);
    u32(0xa14, bytes.readUInt32LE(0xa14) | 1);
  }
  return bytes;
};

const inspect = (bytes: Buffer, maxRecords = 1000) =>
  decodeAppleDispatchMetadata(bytes, maxRecords, provenance, {
    facet: "swift-conformances",
  });
const coverage = (result: ReturnType<typeof inspect>) =>
  result.coverage.find(
    ({ facet }) => facet === "swift_resilient_witness_records",
  );

describe("Swift static resilient witness records", () => {
  it("recovers a separate requirement/witness pair without inventing a runtime slot", () => {
    const result = inspect(fixture());
    expect(result.swift_dispatch_slots).toEqual([]);
    expect(result.swift_conformances[0]?.witness_table.address).toBeNull();
    expect(result.swift_resilient_witnesses).toMatchObject([
      {
        conformance: { address: "0x100000a00", file_offset: 0xa00 },
        type_name: "Request",
        protocol_name: "DecodableFixture",
        record_ordinal: 0,
        requirement: { address: "0x100000bc0", file_offset: 0xbc0 },
        requirement_flags: 2,
        requirement_reference: null,
        implementation_address: "0x100000500",
        implementation_location: { address: "0x100000500", file_offset: 0x500 },
        implementation_kind: "synchronous_function",
        generic_witness_table: { address: "0x100000a1c", file_offset: 0xa1c },
        runtime_witness_table: "not_instantiated",
        location: { address: "0x100000a14", file_offset: 0xa14 },
        decode: { status: "decoded" },
        evidence: [
          {
            artifact_path: provenance.path,
            artifact_sha256: provenance.sha256,
          },
        ],
      },
    ]);
    expect(result.swift_resilient_witnesses?.[0]).not.toHaveProperty(
      "slot_index",
    );
    expect(coverage(result)).toMatchObject({
      status: "complete",
      examined: 1,
      decoded: 1,
    });
  });

  it("retains imported protocol/requirement bind identity without guessing requirement flags", () => {
    const result = inspect(fixture(true));
    expect(result.swift_resilient_witnesses).toMatchObject([
      {
        protocol_name: null,
        protocol_reference: {
          symbol: "_$sSeMp",
          library: "/usr/lib/swift/libswiftCore.dylib",
          weak: true,
          addend: "-3",
        },
        requirement: { address: null, file_offset: null },
        requirement_reference: {
          symbol: "_$sSe4fromxs7Decoder_p_tKcfCTq",
          weak: true,
          addend: "-3",
        },
        requirement_flags: null,
        implementation_address: "0x100000500",
        implementation_kind: "executable_address",
        decode: {
          status: "partial",
          reason: expect.stringContaining("function kind are unavailable"),
        },
      },
    ]);
    expect(result.relative_pointers).toContainEqual(
      expect.objectContaining({
        field: { address: "0x100000a14", file_offset: 0xa14 },
        indirect_slot: { address: "0x100000c80", file_offset: 0xc80 },
        target: { address: null, file_offset: null },
      }),
    );
    expect(coverage(result)?.status).toBe("partial");
  });
});

describe("Swift resilient witness boundaries", () => {
  it("accepts a supported resilient tail without generic control data", () => {
    const bytes = fixture();
    bytes.writeUInt32LE(0x10008, 0xa0c);
    const result = inspect(bytes);
    expect(result.swift_resilient_witnesses?.[0]).toMatchObject({
      generic_witness_table: null,
      implementation_address: "0x100000500",
      decode: { status: "decoded" },
    });
    expect(coverage(result)?.status).toBe("complete");
  });

  it.each([0x10048, 0x10100, 0x1030000, 0x80010000])(
    "rejects unproved tail flags 0x%x",
    (flags) => {
      const bytes = fixture();
      bytes.writeUInt32LE((flags | 8) >>> 0, 0xa0c);
      const result = inspect(bytes);
      expect(result.swift_conformances).toHaveLength(1);
      expect(result.swift_resilient_witnesses).toEqual([]);
      expect(coverage(result)).toMatchObject({
        status: "partial",
        reason: expect.stringContaining(
          "Unsupported resilient conformance flags",
        ),
      });
    },
  );

  it.each([0xffffffff, 189])(
    "rejects a declared pair span or generic tail outside the mapping (count %i)",
    (count) => {
      const bytes = fixture();
      bytes.writeUInt32LE(count, 0xa10);
      const result = inspect(bytes);
      expect(result.swift_resilient_witnesses).toEqual([]);
      expect(coverage(result)).toMatchObject({
        status: "partial",
        reason: expect.stringContaining("Unmapped"),
      });
    },
  );

  it.each([0, 0xc00, 0x2000])(
    "rejects a nil, non-executable or unmapped implementation (%i)",
    (target) => {
      const bytes = fixture();
      bytes.writeInt32LE(target === 0 ? 0 : target - 0xa18, 0xa18);
      const record = inspect(bytes).swift_resilient_witnesses?.[0];
      expect(record).toMatchObject({
        implementation_address: null,
        implementation_kind: "unresolved",
        decode: { status: "partial" },
      });
    },
  );

  it.each([0, 0x21, 7, 0x81, 0x10002, 0x80000002])(
    "does not classify unsupported requirement flags %i as a function",
    (flags) => {
      const bytes = fixture();
      bytes.writeUInt32LE(flags, 0xbc0);
      expect(inspect(bytes).swift_resilient_witnesses?.[0]).toMatchObject({
        requirement_flags: flags,
        implementation_address: null,
        implementation_kind: "unresolved",
        decode: { status: "partial" },
      });
    },
  );

  it("retains static pairs when generic private storage is not file-backed", () => {
    const bytes = fixture();
    bytes.writeInt32LE(0x2000, 0xa24);
    const result = inspect(bytes);
    expect(result.swift_resilient_witnesses?.[0]).toMatchObject({
      implementation_address: "0x100000500",
      generic_witness_table: { address: "0x100000a1c", file_offset: 0xa1c },
      runtime_witness_table: "not_instantiated",
      decode: {
        status: "partial",
        reason: expect.stringContaining("private data is not file-backed"),
      },
    });
    expect(result.relative_pointers).toContainEqual(
      expect.objectContaining({
        field: { address: "0x100000a24", file_offset: 0xa24 },
        target: { address: "0x100002a24", file_offset: null },
        decode: expect.objectContaining({ status: "partial" }),
      }),
    );
    expect(coverage(result)).toMatchObject({
      status: "partial",
      reason: expect.stringContaining("private data is not file-backed"),
    });
  });

  it("keeps a missing requirement partial even if the witness points into executable bytes", () => {
    const bytes = fixture();
    bytes.writeInt32LE(0, 0xa14);
    const result = inspect(bytes);
    expect(result.swift_resilient_witnesses?.[0]).toMatchObject({
      requirement: { address: null, file_offset: null },
      requirement_flags: null,
      implementation_kind: "executable_address",
      decode: {
        status: "partial",
        reason: expect.stringContaining("Missing resilient requirement"),
      },
    });
    expect(coverage(result)?.status).toBe("partial");
  });

  it("shares max_records with conformances and relative pointers and labels exhaustion", () => {
    const result = inspect(fixture(), 8);
    const admitted =
      result.swift_conformances.length +
      result.relative_pointers.length +
      (result.swift_resilient_witnesses?.length ?? 0);
    expect(admitted).toBeLessThanOrEqual(8);
    expect(result.swift_resilient_witnesses).toEqual([]);
    expect(coverage(result)).toMatchObject({
      status: "partial",
      reason: expect.stringContaining("max_records_reached"),
    });
  });

  it("omits the unrequested family", () => {
    const result = decodeAppleDispatchMetadata(fixture(), 1000, provenance, {
      facet: "objc",
    });
    expect(result).not.toHaveProperty("swift_resilient_witnesses");
    expect(coverage(result)?.status).toBe("not_requested");
  });
});

it("keeps an unsupported generic instantiator independent of the static implementation", () => {
  const bytes = fixture();
  bytes.writeInt32LE(0xc00 - 0xa20, 0xa20);
  const result = inspect(bytes);
  expect(result.swift_resilient_witnesses?.[0]).toMatchObject({
    implementation_address: "0x100000500",
    runtime_witness_table: "not_instantiated",
    decode: {
      status: "partial",
      reason: expect.stringContaining(
        "instantiator target is unresolved or non-executable",
      ),
    },
  });
});

it("selects one indexed conformance before unrelated admission and labels absent descriptors", () => {
  const bytes = fixture();
  // A second index entry precedes the desired conformance and is intentionally malformed.
  bytes.writeBigUInt64LE(8n, 216);
  bytes.writeInt32LE(0, 0x900);
  bytes.writeInt32LE(0xa00 - 0x904, 0x904);
  const selected = decodeAppleDispatchMetadata(bytes, 20, provenance, {
    facet: "swift-conformances",
    swiftConformanceAddress: "0x100000a00",
  });
  expect(selected.swift_conformance_selection).toEqual({
    address: "0x100000a00",
    matched: true,
  });
  expect(selected.swift_conformances).toHaveLength(1);
  expect(coverage(selected)?.reason).toContain(
    "limited to the selected indexed conformance",
  );
  expect(selected.swift_resilient_witnesses?.[0]?.implementation_address).toBe(
    "0x100000500",
  );
  const absent = decodeAppleDispatchMetadata(bytes, 20, provenance, {
    facet: "swift-conformances",
    swiftConformanceAddress: "0x100000a04",
  });
  expect(absent.swift_conformance_selection?.matched).toBe(false);
  expect(absent.swift_conformances).toEqual([]);
  expect(coverage(absent)).toMatchObject({
    status: "partial",
    reason: expect.stringContaining("not indexed"),
  });
  const nullEntry = decodeAppleDispatchMetadata(bytes, 20, provenance, {
    facet: "swift-conformances",
    swiftConformanceAddress: "0x100000900",
  });
  expect(nullEntry.swift_conformance_selection?.matched).toBe(false);
  expect(nullEntry.swift_conformances).toEqual([]);
  expect(coverage(nullEntry)).toMatchObject({
    status: "partial",
    reason: expect.stringContaining("not indexed"),
  });
  expect(() =>
    decodeAppleDispatchMetadata(bytes, 20, provenance, {
      facet: "objc",
      swiftConformanceAddress: "0x100000a00",
    }),
  ).toThrow(AnalysisInputError);
});

const discovered = (
  bytes: Buffer,
  filter = {
    protocol_name: "DecodableFixture",
    type_name: null as string | null,
  },
  maxRecords = 100,
) =>
  decodeAppleDispatchMetadata(bytes, maxRecords, provenance, {
    facet: "swift-conformances",
    swiftConformanceFilter: filter,
  });
const discoveryCoverage = (result: ReturnType<typeof discovered>) =>
  result.coverage.find(
    ({ facet }) => facet === "swift_conformance_index_discovery",
  );

describe("Swift conformance identity discovery before decode admission", () => {
  it("finds a late match without decoding the preceding unrelated entries", () => {
    const bytes = fixture();
    bytes.writeBigUInt64LE(64n, 216);
    bytes.writeInt32LE(0xb40 - 0xa40, 0xa40);
    bytes.writeInt32LE(0xc88 - 0xa44, 0xa44);
    bytes.writeUInt32LE(8, 0xa4c);
    bytes.writeUInt32LE(3, 0xb40);
    bytes.writeInt32LE(0xc60 - 0xb48, 0xb48);
    bytes.write("OtherProtocol\0", 0xc60);
    for (let i = 0; i < 15; i++)
      bytes.writeInt32LE(0xa40 - (0x900 + i * 4), 0x900 + i * 4);
    bytes.writeInt32LE(0xa00 - 0x93c, 0x93c);
    const result = discovered(bytes, undefined, 20);
    expect(
      result.swift_conformances.map(({ protocol_name }) => protocol_name),
    ).toEqual(["DecodableFixture"]);
    expect(result.swift_conformance_discovery).toMatchObject({
      index_entries: 16,
      examined: 16,
      matched: 1,
      admitted: 1,
      unresolved: 0,
    });
    expect(discoveryCoverage(result)).toMatchObject({
      status: "complete",
      examined: 16,
    });
    expect(
      result.relative_pointers.some(
        ({ target }) => target.address === "0x100000a40",
      ),
    ).toBe(false);
  });

  it("resolves distinct indirect aliases and ANDs exact names", () => {
    const bytes = fixture();
    bytes.writeBigUInt64LE(8n, 216);
    bytes.writeInt32LE(0xa40 - 0x904, 0x904);
    bytes.writeInt32LE((0xc90 - 0xa00) | 1, 0xa00);
    bytes.writeInt32LE((0xc98 - 0xa40) | 1, 0xa40);
    bytes.writeBigUInt64LE(base + 0xb80n, 0xc90);
    bytes.writeBigUInt64LE(base + 0xb80n, 0xc98);
    bytes.writeInt32LE(0xc88 - 0xa44, 0xa44);
    bytes.writeUInt32LE(8, 0xa4c);
    const result = discovered(bytes, {
      protocol_name: "DecodableFixture",
      type_name: "Request",
    });
    expect(
      result.swift_conformances.map(({ location }) => location.address),
    ).toEqual(["0x100000a00", "0x100000a40"]);
    expect(
      result.relative_pointers
        .filter(({ indirect_slot }) => indirect_slot !== null)
        .map(({ indirect_slot }) => indirect_slot?.address),
    ).toEqual(expect.arrayContaining(["0x100000c90", "0x100000c98"]));
    expect(result.swift_conformance_discovery).toMatchObject({
      matched: 2,
      unresolved: 0,
    });
    const absent = discovered(bytes, {
      protocol_name: "decodablefixture",
      type_name: "Request",
    });
    expect(absent.swift_conformances).toEqual([]);
    expect(absent.swift_conformance_discovery).toMatchObject({
      examined: 2,
      matched: 0,
      unresolved: 0,
    });
    expect(discoveryCoverage(absent)?.status).toBe("complete");
  });

  it("prioritizes known matches over uncertain entries and reports omitted identities", () => {
    const bytes = fixture();
    bytes.writeBigUInt64LE(12n, 216);
    bytes.writeInt32LE(0, 0x900);
    bytes.writeInt32LE(0xf80 - 0x904, 0x904);
    bytes.writeInt32LE(0xa00 - 0x908, 0x908);
    const result = discovered(bytes, undefined, 1);
    expect(result.swift_conformances).toHaveLength(1);
    expect(result.swift_conformance_discovery).toMatchObject({
      examined: 3,
      matched: 1,
      admitted: 1,
      unresolved: 2,
      unresolved_records: [],
    });
    expect(discoveryCoverage(result)?.status).toBe("partial");
    expect(coverage(result)?.reason).toContain("max_records_reached");
  });

  it("preserves imported bind identity and excludes only a known mismatching requested name", () => {
    const bytes = fixture(true);
    const result = discovered(bytes);
    expect(result.swift_conformance_discovery).toMatchObject({
      examined: 1,
      matched: 0,
      unresolved: 1,
    });
    expect(
      result.swift_conformance_discovery?.unresolved_records[0]
        ?.relative_pointers,
    ).toEqual(
      expect.arrayContaining([
        expect.objectContaining({
          indirect_slot: { address: "0x100000c78", file_offset: 0xc78 },
          external_reference: {
            symbol: "_$sSeMp",
            library: "/usr/lib/swift/libswiftCore.dylib",
            weak: true,
            addend: "-3",
          },
        }),
      ]),
    );
    expect(discoveryCoverage(result)?.status).toBe("partial");
    const excluded = discovered(bytes, {
      protocol_name: "DecodableFixture",
      type_name: "OtherType",
    });
    expect(excluded.swift_conformance_discovery).toMatchObject({
      matched: 0,
      unresolved: 0,
    });
    expect(discoveryCoverage(excluded)?.status).toBe("complete");
    expect(() =>
      decodeAppleDispatchMetadata(bytes, 20, provenance, {
        facet: "swift-conformances",
        swiftConformanceAddress: "0x100000a00",
        swiftConformanceFilter: {
          protocol_name: "DecodableFixture",
          type_name: null,
        },
      }),
    ).toThrow(AnalysisInputError);
  });
});
