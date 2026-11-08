import { describe, expect, it } from "vitest";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";
import { swiftWitnessFixture as fixture } from "./AppleSwiftWitnessMetadata.fixture.js";
import { AnalysisInputError } from "../domain/analysisErrorCore.js";

const base = 0x100000000n;
const provenance = { path: "/fixture/resilient.dylib", sha256: "a".repeat(64) };

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

  it.each([0x10048, 0x10100, 0x1030000])(
    "rejects malformed preceding tail spans for flags 0x%x",
    (flags) => {
      const bytes = fixture();
      bytes.writeUInt32LE((flags | 8) >>> 0, 0xa0c);
      const result = inspect(bytes);
      expect(result.swift_conformances).toHaveLength(1);
      expect(result.swift_resilient_witnesses).toEqual([]);
      expect(coverage(result)).toMatchObject({
        status: "partial",
        reason: expect.stringContaining("Unmapped"),
      });
    },
  );

  it.each([0x40000, 0x80000, 7])(
    "rejects unknown conformance flags 0x%x",
    (flags) => {
      const bytes = fixture();
      bytes.writeUInt32LE(flags | 0x10008, 0xa0c);
      expect(coverage(inspect(bytes))).toMatchObject({
        status: "partial",
        reason: expect.stringContaining("Unsupported conformance flags"),
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
