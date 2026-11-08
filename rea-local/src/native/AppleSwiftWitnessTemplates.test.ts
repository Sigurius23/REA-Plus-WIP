import { describe, expect, it } from "vitest";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";
import { swiftWitnessFixture } from "./AppleSwiftWitnessMetadata.fixture.js";

const base = 0x100000000n;
const provenance = { path: "/fixture/generic.dylib", sha256: "b".repeat(64) };
const relative = (bytes: Buffer, at: number, target: number) =>
  bytes.writeInt32LE(target - at, at);
const fixture = (external = false) => {
  const bytes = swiftWitnessFixture(external);
  bytes.writeUInt32LE(0x20008, 0xa0c);
  relative(bytes, 0xa08, 0xd00);
  bytes.writeUInt32LE(3, 0xb90); // three requirements, no signature prefix
  for (const [at, flags] of [
    [0xb98, 0],
    [0xba0, 0x31],
    [0xba8, 0x13],
  ] as const)
    bytes.writeUInt32LE(flags, at);
  bytes.writeUInt32LE(0x10004, 0xa10); // 4 template words, raw instantiation flag
  relative(bytes, 0xa14, 0x510);
  relative(bytes, 0xa18, 0xe00);
  bytes.writeBigUInt64LE(base + 0xa00n, 0xd00);
  bytes.writeBigUInt64LE(0n, 0xd08);
  bytes.writeBigUInt64LE(base + 0xc40n, 0xd10);
  bytes.writeBigUInt64LE(base + 0x508n, 0xd18);
  relative(bytes, 0xc40, 0x500);
  bytes.writeUInt32LE(32, 0xc44);
  return bytes;
};
const inspect = (bytes: Buffer, maxRecords = 1000) =>
  decodeAppleDispatchMetadata(bytes, maxRecords, provenance, {
    facet: "swift-conformances",
  });
const template = (bytes: Buffer) => inspect(bytes).swift_witness_templates?.[0];

describe("static generic Swift witness templates", () => {
  it("retains holes, async descriptors and executable targets separately from runtime slots", () => {
    const result = inspect(fixture());
    const record = result.swift_witness_templates?.[0];
    expect(record).toMatchObject({
      template_words: 4,
      extent_source: "generic_control",
      private_words: 0,
      instantiation_flag: true,
      runtime_witness_table: "not_observed",
      decode: { status: "decoded" },
    });
    expect(
      record?.entries.map((x) => [x.word_index, x.kind, x.target.address]),
    ).toEqual([
      [1, "hole", null],
      [2, "async_descriptor", "0x100000c40"],
      [3, "function", "0x100000508"],
    ]);
    expect(record?.entries[1]?.requirement_flags).toBe(0x31);
    expect(record?.entries[1]?.target.address).not.toBe("0x100000500");
    expect(result.swift_dispatch_slots).toEqual([]);
  });

  it("bounds an uncontrolled generic-type pattern using the local stable protocol only", () => {
    const bytes = fixture();
    bytes.writeUInt32LE(8, 0xa0c);
    bytes.writeUInt32LE(0x92, 0xb00);
    bytes.writeBigUInt64LE(base + 0x520n, 0xd20); // adjacent data is not another entry
    expect(template(bytes)).toMatchObject({
      template_words: 4,
      extent_source: "local_protocol",
      generic_control: null,
      entries: [{ word_index: 1 }, { word_index: 2 }, { word_index: 3 }],
    });
    bytes.writeUInt32LE(0x20003, 0xb80);
    expect(template(bytes)).toMatchObject({
      template_words: null,
      extent_source: "unresolved",
      entries: [],
      decode: {
        status: "partial",
        reason: expect.stringContaining("extent is unknown"),
      },
    });
  });

  it("uses the same retroactive/conditional/pack offsets as resilient-pair decoding", () => {
    const bytes = fixture();
    bytes.writeUInt32LE(0x01030148, 0xa0c);
    relative(bytes, 0xa10, 0xb20);
    bytes.writeUInt32LE(0x80, 0xa14);
    relative(bytes, 0xa18, 0xc00);
    bytes.writeInt32LE((0xc90 - 0xa1c) | 1, 0xa1c);
    bytes.writeBigUInt64LE(base + 0xb80n, 0xc90);
    bytes.writeUInt32LE(0x20001, 0xa20);
    bytes.writeUInt32LE(3, 0xa24);
    bytes.writeUInt32LE(1, 0xa28);
    relative(bytes, 0xa2c, 0xbc0);
    relative(bytes, 0xa30, 0x500);
    bytes.writeUInt32LE(0x10004, 0xa34);
    relative(bytes, 0xa38, 0x510);
    relative(bytes, 0xa3c, 0xe00);
    const result = inspect(bytes);
    expect(result.swift_resilient_witnesses?.[0]).toMatchObject({
      location: { address: "0x100000a2c" },
      implementation_address: "0x100000500",
      generic_witness_table: { address: "0x100000a34" },
    });
    expect(result.swift_witness_templates?.[0]).toMatchObject({
      generic_control: { address: "0x100000a34" },
      retroactive_context: { address: "0x100000b20" },
      conditional_requirement_count: 1,
      conditional_requirements: [
        {
          flags: 0x80,
          parameter: { address: "0x100000c00" },
          constraint: { address: "0x100000b80" },
          decode: { status: "decoded" },
        },
      ],
      conditional_pack_count: 1,
      conditional_packs: [{ kind: 1, index: 2, shape_class: 3, reserved: 0 }],
    });
    expect(
      result.relative_pointers.filter((x) => x.field.address === "0x100000a38"),
    ).toHaveLength(1);
    expect(
      result.relative_pointers.some(
        (x) => x.indirect_slot?.address === "0x100000c90",
      ),
    ).toBe(true);
    expect(result.swift_witness_templates?.[0]?.entries[1]).toMatchObject({
      requirement_flags: null,
      kind: "unresolved",
    });
  });
});

describe("Swift witness template boundaries", () => {
  it.each([0, 0x2000])(
    "keeps a missing/unmapped retroactive context partial (%i)",
    (target) => {
      const bytes = fixture();
      bytes.writeUInt32LE(0x20048, 0xa0c);
      if (target === 0) bytes.writeInt32LE(0, 0xa10);
      else relative(bytes, 0xa10, target);
      bytes.writeUInt32LE(0x10004, 0xa14);
      relative(bytes, 0xa18, 0x510);
      relative(bytes, 0xa1c, 0xe00);
      const record = template(bytes);
      expect(record?.entries).toHaveLength(3);
      expect(record?.decode).toMatchObject({
        status: "partial",
        reason: expect.stringContaining(
          "Retroactive context is missing or unresolved",
        ),
      });
    },
  );
  it.each(["oversized", "header", "unknown-flags"] as const)(
    "retains a %s pattern failure without guessing entries",
    (kind) => {
      const bytes = fixture();
      if (kind === "oversized") bytes.writeUInt32LE(0x1ffff, 0xa10);
      else if (kind === "header") bytes.writeBigUInt64LE(base + 0xa40n, 0xd00);
      else bytes.writeUInt32LE(0x60008, 0xa0c);
      expect(template(bytes)).toMatchObject({
        entries: [],
        decode: { status: "partial" },
      });
    },
  );

  it("retains imported word identity without promoting it to a local function", () => {
    const bytes = fixture(true);
    const size = bytes.readUInt32LE(276);
    const bind = Buffer.concat([
      bytes.subarray(0xf00, 0xf00 + size - 1),
      Buffer.from([0x71, 0x90, 0x0a, 0x90, 0]),
    ]);
    bytes.writeUInt32LE(bind.length, 276);
    bind.copy(bytes, 0xf00);
    expect(template(bytes)?.entries[1]).toMatchObject({
      kind: "unresolved",
      target: { address: null },
      target_reference: {
        symbol: "_$sSe4fromxs7Decoder_p_tKcfCTq",
        weak: true,
        addend: "-3",
      },
      decode: { status: "partial" },
    });
  });

  it.each([7, 9, 12, 18])(
    "shares the %i-record budget with every nested record",
    (budget) => {
      const result = inspect(fixture(), budget);
      const records = result.swift_witness_templates ?? [];
      const retained =
        result.swift_conformances.length +
        result.relative_pointers.length +
        result.swift_dispatch_slots.length +
        (result.swift_resilient_witnesses?.length ?? 0) +
        records.reduce(
          (n, x) =>
            n +
            1 +
            x.entries.length +
            x.conditional_requirements.length +
            x.conditional_packs.length,
          0,
        );
      expect(retained).toBeLessThanOrEqual(budget);
      if (budget < 12)
        expect(
          result.coverage.find(
            (x) => x.facet === "swift_witness_template_records",
          )?.status,
        ).toBe("partial");
    },
  );
});
