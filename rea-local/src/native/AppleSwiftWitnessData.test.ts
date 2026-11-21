import { describe, expect, it } from "vitest";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";
import { swiftWitnessFixture } from "./AppleSwiftWitnessMetadata.fixture.js";

const base = 0x100000000n;
const address = (offset: number) => `0x${(base + BigInt(offset)).toString(16)}`;
const fixture = () => {
  const bytes = swiftWitnessFixture();
  const relative = (at: number, target: number) =>
    bytes.writeInt32LE(target - at, at);
  const pointer = (at: number, target: number) =>
    bytes.writeBigUInt64LE(base + BigInt(target), at);
  bytes.writeUInt32LE(8, 0xa0c); // non-generic conformance, indirect nominal owner
  relative(0xa08, 0xd00);
  bytes.writeUInt32LE(1, 0xb8c); // Self: BaseProtocol signature constraint
  bytes.writeUInt32LE(0x80, 0xb98);
  relative(0xb9c, 0xc78);
  bytes.write("x\0", 0xc78);
  relative(0xba0, 0xb40);
  bytes.writeUInt32LE(3, 0xb90);
  relative(0xb94, 0xc50);
  bytes.write("Value\0", 0xc50);
  for (const [at, kind] of [
    [0xba4, 0],
    [0xbac, 7],
    [0xbb4, 3],
  ] as const)
    bytes.writeUInt32LE(kind, at);
  pointer(0xd00, 0xa00);
  pointer(0xd08, 0xd40); // inherited protocol witness table, not code
  pointer(0xd10, 0xe01); // mangled-name tag, not an instruction address
  pointer(0xd18, 0x500); // ordinary getter implementation
  pointer(0xd40, 0xa40);
  relative(0xa40, 0xb40);
  relative(0xa44, 0xc88);
  relative(0xa48, 0xd40);
  bytes.writeUInt32LE(8, 0xa4c);
  bytes.writeUInt32LE(3, 0xb40);
  relative(0xb48, 0xc60);
  bytes.write("BaseProtocol\0", 0xc60);
  bytes[0xe00] = 1;
  relative(0xe01, 0xb00);
  bytes[0xe05] = 0;
  return bytes;
};
const inspect = (bytes: Buffer, maximum = 1000) =>
  decodeAppleDispatchMetadata(
    bytes,
    maximum,
    { path: "/owned/witness-data.dylib", sha256: "a".repeat(64) },
    { facet: "swift-conformances", swiftConformanceAddress: address(0xa00) },
  );
const witnessCoverage = (result: ReturnType<typeof inspect>) =>
  result.coverage.find(
    ({ facet }) => facet === "swift_conformances_static_witness_slots",
  );

describe("static Swift witness data through the Mach-O reader", () => {
  it("separates inherited/associated data from executable slots and retains exact identity", () => {
    const result = inspect(fixture());
    expect(result.swift_dispatch_slots).toMatchObject([
      {
        requirement_flags: 0,
        implementation_address: null,
        decode: { status: "decoded" },
        witness_data: {
          kind: "base_protocol",
          witness_table: { address: address(0xd40) },
          conformance: { address: address(0xa40) },
          protocol_name: "BaseProtocol",
          type_descriptor: { address: address(0xb00) },
          type_name: "Request",
        },
      },
      {
        requirement_flags: 7,
        implementation_address: null,
        decode: { status: "decoded" },
        witness_data: {
          kind: "associated_type",
          name: "Value",
          representation: "mangled_name",
          pointer_target: address(0xe01),
          target: { address: address(0xe00) },
          context_descriptor: { address: address(0xb00) },
          type_name: "Request",
        },
      },
      {
        requirement_flags: 3,
        implementation_address: address(0x500),
        decode: { status: "decoded" },
      },
    ]);
    expect(result.swift_dispatch_slots[2]).not.toHaveProperty("witness_data");
    expect(witnessCoverage(result)).toMatchObject({ status: "complete" });
    expect(result.swift_dispatch_slots[1]?.evidence).toEqual(
      expect.arrayContaining([
        expect.objectContaining({
          location: { address: address(0xbac), file_offset: 0xbac },
        }),
        expect.objectContaining({
          location: { address: address(0xe00), file_offset: 0xe00 },
        }),
      ]),
    );
  });

  it("resolves an indirect symbolic context while preserving its pointer source", () => {
    const bytes = fixture();
    bytes[0xe00] = 2;
    bytes.writeInt32LE(0xe20 - 0xe01, 0xe01);
    bytes.writeBigUInt64LE(base + 0xb00n, 0xe20);
    const result = inspect(bytes);
    expect(result.swift_dispatch_slots[1]?.witness_data).toMatchObject({
      context_descriptor: { address: address(0xb00) },
      type_name: "Request",
    });
    expect(result.relative_pointers).toEqual(
      expect.arrayContaining([
        expect.objectContaining({
          field: { address: address(0xe01), file_offset: 0xe01 },
          indirect_slot: { address: address(0xe20), file_offset: 0xe20 },
        }),
      ]),
    );
  });
});

describe("unsupported or malformed witness data", () => {
  it("rejects an inherited table for a different owner even when names match", () => {
    const bytes = fixture();
    bytes.writeInt32LE(0xc90 - 0xa44, 0xa44);
    bytes.writeBigUInt64LE(base + 0xb20n, 0xc90);
    bytes.writeUInt32LE(18, 0xb20);
    bytes.writeInt32LE(0xc00 - 0xb28, 0xb28);
    const result = inspect(bytes);
    expect(result.swift_dispatch_slots[0]).toMatchObject({
      implementation_address: null,
      decode: {
        status: "partial",
        reason: expect.stringContaining("different nominal type"),
      },
      witness_data: { type_descriptor: { address: address(0xb20) } },
    });
    expect(result.swift_dispatch_slots[2]?.implementation_address).toBe(
      address(0x500),
    );
    expect(witnessCoverage(result)?.status).toBe("partial");
  });

  it.each([0xff, 0x53])(
    "retains unsupported associated mangling prefix %i without inventing a type",
    (prefix) => {
      const bytes = fixture();
      bytes[0xe00] = prefix;
      expect(inspect(bytes).swift_dispatch_slots[1]).toMatchObject({
        implementation_address: null,
        decode: { status: "partial" },
        witness_data: { representation: "mangled_name", type_name: null },
      });
    },
  );

  it("rejects an inherited table not declared by the owner's Self signature", () => {
    const bytes = fixture();
    bytes.write("q\0", 0xc78);
    expect(inspect(bytes).swift_dispatch_slots[0]).toMatchObject({
      decode: {
        status: "partial",
        reason: expect.stringContaining("ordinary Self constraint"),
      },
      implementation_address: null,
    });
  });

  it("retains metadata-representation identity as unknown rather than executable code", () => {
    const bytes = fixture();
    bytes.writeBigUInt64LE(base + 0xe00n, 0xd10);
    expect(inspect(bytes).swift_dispatch_slots[1]).toMatchObject({
      implementation_address: null,
      decode: {
        status: "partial",
        reason: expect.stringContaining("Metadata-based"),
      },
      witness_data: {
        representation: "metadata",
        target: { address: address(0xe00) },
        type_name: null,
      },
    });
  });

  it("retains an unmapped associated pointer and continues later slots", () => {
    const bytes = fixture();
    bytes.writeBigUInt64LE(base + 0x2001n, 0xd10);
    const result = inspect(bytes);
    expect(result.swift_dispatch_slots[1]).toMatchObject({
      decode: { status: "partial" },
      witness_data: {
        target: { address: address(0x2000), file_offset: null },
        type_name: null,
      },
    });
    expect(result.swift_dispatch_slots[2]?.implementation_address).toBe(
      address(0x500),
    );
  });

  it("rejects missing/mismatched names and reserved data flags", () => {
    const bytes = fixture();
    bytes.write("Wrong Extra\0", 0xc50);
    expect(inspect(bytes).swift_dispatch_slots[1]?.decode).toMatchObject({
      status: "partial",
      reason: expect.stringContaining("names do not match"),
    });
    bytes.writeUInt32LE(0x27, 0xbac);
    const slot = inspect(bytes).swift_dispatch_slots[1];
    expect(slot?.decode.status).toBe("partial");
    expect(slot).not.toHaveProperty("witness_data");
    expect(slot?.implementation_address).toBeNull();
  });

  it("rejects generic context substitutions instead of treating the declaration as a concrete type", () => {
    const bytes = fixture();
    bytes[0xe00] = 1;
    bytes.writeInt32LE(0xb20 - 0xe01, 0xe01);
    bytes.writeUInt32LE(0x92, 0xb20);
    bytes.writeInt32LE(0xc00 - 0xb28, 0xb28);
    expect(inspect(bytes).swift_dispatch_slots[1]).toMatchObject({
      decode: {
        status: "partial",
        reason: expect.stringContaining("generic substitutions"),
      },
      witness_data: {
        context_descriptor: { address: address(0xb20) },
        type_name: null,
      },
    });
  });
});
