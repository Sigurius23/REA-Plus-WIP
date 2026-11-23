import { describe, expect, it } from "vitest";
import { AnalysisInputError } from "../domain/analysisErrorCore.js";
import { decodeAppleDispatchMetadata } from "./AppleDispatchMetadata.js";

const base = 0x100000000n;
const hex = (offset: number) => `0x${(base + BigInt(offset)).toString(16)}`;
const fixture = () => {
  const bytes = Buffer.alloc(4096);
  const u32 = (at: number, v: number) => bytes.writeUInt32LE(v, at);
  const u64 = (at: number, v: bigint) => bytes.writeBigUInt64LE(v, at);
  const rel = (at: number, to: number) => bytes.writeInt32LE(to - at, at);
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
  rel(0x400, 0x600);
  rel(0x404, 0x680);
  rel(0x408, 0x500);
  u32(0x500, 17);
  rel(0x508, 0xb00);
  rel(0x510, 0x800);
  u32(0x514, 1);
  bytes.write("Client\0", 0xb00);
  u32(0x808, 0x000c0000);
  u32(0x80c, 1);
  rel(0x814, 0xa00);
  rel(0x818, 0xb10);
  bytes.write("boolForSetting\0", 0xb10);
  for (const [descriptor, field, name] of [
    [0x600, 0x900, 0xb30],
    [0x680, 0x980, 0xb40],
  ]) {
    u32(descriptor!, 18);
    rel(descriptor! + 8, name!);
    rel(descriptor! + 16, field!);
    u32(descriptor! + 24, 3);
    bytes.write("Setting\0", name!);
    u32(field! + 8, 0x000c0002);
    u32(field! + 12, 3);
    for (let i = 0; i < 3; i++) {
      rel(field! + 16 + i * 12 + 8, 0xc00 + i * 16);
      bytes.write(`case${i}\0`, 0xc00 + i * 16);
    }
  }
  const type = (
    descriptor = 0x600,
    indirect = false,
    returned = false,
    suffix = "Ybc",
  ) => {
    bytes.fill(0, 0xa00, 0xa80);
    const at = returned ? 0xa00 : 0xa02;
    if (!returned) bytes.write("Sb", 0xa00);
    bytes[at] = indirect ? 2 : 1;
    rel(at + 1, indirect ? 0xd00 : descriptor);
    if (indirect) u64(0xd00, base + BigInt(descriptor));
    bytes.write((returned ? "Sb" : "") + suffix + "\0", at + 5);
  };
  type();
  return { bytes, rel, u32, u64, type };
};
const inspect = (bytes: Buffer, maximum = 200, selected = hex(0x500)) =>
  decodeAppleDispatchMetadata(
    bytes,
    maximum,
    { path: "/owned/fields.dylib", sha256: "a".repeat(64) },
    { facet: "swift-fields", swiftTypeAddress: selected },
  );
const field = (bytes: Buffer) => inspect(bytes).swift_type_fields!.fields[0]!;
const applicationFixture = (indirect = false, argument = "enum") => {
  const f = fixture();
  f.u32(0x700, 0x80 | 17);
  f.rel(0x704, 0x740);
  f.rel(0x708, 0xb60);
  f.bytes.write("Dependency\0", 0xb60);
  f.rel(0x748, 0xb80);
  f.bytes.write("Owned\0", 0xb80);
  f.bytes.writeUInt16LE(1, 0x724);
  f.bytes.writeUInt16LE(1, 0x728);
  f.bytes[0x72c] = 0x80;
  f.bytes.fill(0, 0xa00, 0xa80);
  f.bytes[0xa00] = indirect ? 2 : 1;
  f.rel(0xa01, indirect ? 0xd20 : 0x700);
  if (indirect) f.u64(0xd20, base + 0x700n);
  f.bytes.write("y", 0xa05);
  if (argument === "enum") {
    f.bytes[0xa06] = 1;
    f.rel(0xa07, 0x600);
    f.bytes.write("G\0", 0xa0b);
  } else f.bytes.write("SbG\0", 0xa06);
  return f;
};

describe("concrete flat generic field applications", () => {
  it("retains complete generic declaration/argument identity without creating a function domain", () => {
    const result = inspect(applicationFixture().bytes).swift_type_fields!,
      value = result.fields[0]!;
    expect(value).toMatchObject({
      function_type: null,
      bound_generic_type: {
        kind: "bound-generic-struct",
        name: "Dependency",
        descriptor: { address: hex(0x700) },
        module: { name: "Owned", descriptor: { address: hex(0x740) } },
        arguments: [{ kind: "nominal", descriptor: { address: hex(0x600) } }],
        signature: {
          parameter_count: 1,
          requirement_count: 0,
          key_argument_count: 1,
          parameters: [{ index: 0, flags: 128 }],
        },
        interpretation: "declaration-only",
      },
      decode: { status: "decoded" },
    });
    expect(result.referenced_enums).toEqual([]);
    expect(result.program_mutations).toBe(false);
  });
  it("supports indirect references and builtin arguments", () => {
    const value = field(applicationFixture(true, "bool").bytes);
    expect(value.bound_generic_type?.arguments).toEqual([
      { kind: "builtin", name: "Bool", descriptor: null },
    ]);
    expect(value.function_type).toBeNull();
  });
  it.each([
    [
      "requirements",
      (f: ReturnType<typeof fixture>) => f.bytes.writeUInt16LE(1, 0x726),
    ],
    [
      "pack flag",
      (f: ReturnType<typeof fixture>) => f.bytes.writeUInt16LE(1, 0x72a),
    ],
    [
      "non-key parameter",
      (f: ReturnType<typeof fixture>) => {
        f.bytes[0x72c] = 0;
      },
    ],
    [
      "parameter count mismatch",
      (f: ReturnType<typeof fixture>) => f.bytes.writeUInt16LE(2, 0x724),
    ],
    ["version", (f: ReturnType<typeof fixture>) => f.u32(0x700, 0x180 | 17)],
    ["nested parent", (f: ReturnType<typeof fixture>) => f.u32(0x740, 18)],
    [
      "trailing optional",
      (f: ReturnType<typeof fixture>) => f.bytes.write("GSg\0", 0xa0b),
    ],
    [
      "missing closer",
      (f: ReturnType<typeof fixture>) => {
        f.bytes[0xa0b] = 0;
      },
    ],
  ] as const)("rejects %s while retaining raw mangling", (_name, change) => {
    const f = applicationFixture();
    change(f);
    const value = field(f.bytes);
    expect(value.bound_generic_type).toBeNull();
    expect(value.function_type).toBeNull();
    expect(value.mangling_hex).not.toBeNull();
    expect(value.decode.status).toBe("unsupported");
  });
  it("does not publish a generic application when its shared record budget is exhausted", () => {
    const result = inspect(applicationFixture().bytes, 8);
    expect(result.swift_type_fields!.fields[0]!).toMatchObject({
      bound_generic_type: null,
      function_type: null,
      decode: { status: "unsupported" },
    });
    expect(result.swift_type_fields!.decode.reason).toContain("max_records");
    expect(result.relative_pointers.length).toBeLessThanOrEqual(8);
    expect(result.swift_type_fields!.referenced_enums).toEqual([]);
  });
});

describe("selected symbolic Swift closure field declarations", () => {
  it("finds a late indexed owner before admission and decodes complete Sendable function shape", () => {
    const f = fixture(),
      result = inspect(f.bytes),
      observation = result.swift_type_fields!;
    expect(observation).toMatchObject({
      matched: true,
      index_entries: 3,
      matching_index_entries: 1,
      name: "Client",
      declared_field_count: 1,
      program_mutations: false,
      decode: { status: "decoded" },
    });
    expect(observation.fields[0]).toMatchObject({
      ordinal: 0,
      record: { address: hex(0x810) },
      name: "boolForSetting",
      function_type: {
        sendable: true,
        result: { kind: "builtin", name: "Bool" },
        parameter: { kind: "nominal", descriptor: { address: hex(0x600) } },
        declared_argument_domain: {
          lower_inclusive: 0,
          upper_exclusive: 3,
          enum_descriptor: { address: hex(0x600) },
        },
      },
    });
    expect(observation.referenced_enums[0]?.cases.map((c) => c.name)).toEqual([
      "case0",
      "case1",
      "case2",
    ]);
    expect(result.swift_dispatch_slots).toEqual([]);
    expect(
      result.coverage.find((c) => c.facet === "swift_type_fields")?.status,
    ).toBe("complete");
  });
  it("uses signed indirect symbolic identity despite embedded NULs", () => {
    const f = fixture();
    f.type(0x600, true);
    expect(field(f.bytes)).toMatchObject({
      mangling_hex: expect.stringContaining("02"),
      function_type: {
        parameter: { descriptor: { address: hex(0x600) } },
        declared_argument_domain: { upper_exclusive: 3 },
      },
    });
    expect(
      inspect(f.bytes).relative_pointers.some(
        (p) => p.indirect_slot?.address === hex(0xd00),
      ),
    ).toBe(true);
  });
  it("keeps same-name/count enums distinct", () => {
    const f = fixture();
    f.type(0x680);
    expect(
      field(f.bytes).function_type?.declared_argument_domain?.enum_descriptor
        .address,
    ).toBe(hex(0x680));
  });
  it("does not turn a result enum into an argument domain", () => {
    const f = fixture();
    f.type(0x600, false, true, "c");
    expect(field(f.bytes).function_type).toMatchObject({
      result: { descriptor: { address: hex(0x600) } },
      parameter: { name: "Bool" },
      declared_argument_domain: null,
    });
  });
  it("does not turn UInt16 input into an enum contract", () => {
    const f = fixture();
    f.bytes.fill(0, 0xa00, 0xa80);
    f.bytes.write("Sbs6UInt16Vc\0", 0xa00);
    expect(field(f.bytes).function_type).toMatchObject({
      parameter: { kind: "builtin", name: "UInt16" },
      declared_argument_domain: null,
    });
  });
  it.each(["Yac", "YbcSg", "Kc", "XB", "zYbc", "yG", "_SbtYbc"])(
    "rejects unsupported complete shape %s without publishing a partial argument proof",
    (suffix) => {
      const f = fixture();
      f.type(0x600, false, false, suffix);
      expect(field(f.bytes)).toMatchObject({
        function_type: null,
        decode: { status: "unsupported" },
      });
    },
  );
});

describe("Swift field declaration boundaries", () => {
  it("retains generic owner declarations without lowering generic parameter types", () => {
    const f = fixture();
    f.u32(0x500, 0x80 | 17);
    f.bytes.fill(0, 0xa00, 0xa80);
    f.bytes.write("x\0", 0xa00);
    expect(inspect(f.bytes).swift_type_fields).toMatchObject({
      matched: true,
      name: "Client",
      kind: "struct",
      is_generic: true,
      declared_field_count: 1,
      fields: [
        {
          name: "boolForSetting",
          mangling_hex: "7800",
          function_type: null,
          decode: { status: "unsupported" },
        },
      ],
      referenced_enums: [],
      decode: { status: "partial" },
    });
  });
  it("can decode a concrete closure declaration owned by a generic type", () => {
    const f = fixture();
    f.u32(0x500, 0x80 | 17);
    const result = inspect(f.bytes).swift_type_fields!;
    expect(result.is_generic).toBe(true);
    expect(result.fields[0]!.function_type!.parameter.descriptor!.address).toBe(
      hex(0x600),
    );
    expect(result.fields[0]!.function_type!.argument_abi!.status).toBe(
      "unresolved",
    );
  });
  it("rejects generic identities, payload cases and count disagreement", () => {
    const generic = fixture();
    generic.u32(0x600, 0x80 | 18);
    expect(field(generic.bytes).function_type).toBeNull();
    const payload = fixture();
    payload.u32(0x614, 1);
    expect(
      field(payload.bytes).function_type?.declared_argument_domain,
    ).toBeNull();
    const mismatch = fixture();
    mismatch.u32(0x90c, 4);
    expect(field(mismatch.bytes).function_type).toBeNull();
  });
  it("rejects writable symbolic strings and malformed index extents", () => {
    const writable = fixture();
    writable.u32(92, 7);
    expect(field(writable.bytes).decode.reason).toContain("read-only");
    const invalid = fixture();
    invalid.u64(144, 0x100000000n);
    expect(() => inspect(invalid.bytes)).toThrow(/index/iu);
  });
  it("preserves unknown index coverage and never decodes an unindexed nominal", () => {
    const f = fixture();
    f.u32(0x400, 0x7ffffffd);
    expect(inspect(f.bytes).swift_type_fields).toMatchObject({
      matched: true,
      unresolved_index_entries: 1,
      decode: { status: "partial" },
    });
    expect(inspect(f.bytes, 200, hex(0x700)).swift_type_fields).toMatchObject({
      matched: false,
      fields: [],
      decode: { status: "partial" },
    });
  });
  it("does not allocate an enum case vector or invent a domain after admission exhaustion", () => {
    const result = inspect(fixture().bytes, 11);
    expect(result.swift_type_fields).toMatchObject({
      referenced_enums: [],
      decode: {
        status: "partial",
        reason: expect.stringContaining("max_records"),
      },
    });
    expect(result.swift_type_fields?.fields[0]?.function_type).toBeNull();
    expect(result.relative_pointers.length).toBeLessThanOrEqual(11);
    expect(
      result.coverage.find((c) => c.facet === "binary_relative_pointers"),
    ).toMatchObject({ status: "partial", reason: "max_records_reached" });
  });
  it("requires an explicit compatible selector and leaves all inventories opt-in", () => {
    const f = fixture();
    expect(() =>
      decodeAppleDispatchMetadata(
        f.bytes,
        100,
        { path: "/x", sha256: "a".repeat(64) },
        { facet: "swift-fields" },
      ),
    ).toThrow(AnalysisInputError);
    expect(() =>
      decodeAppleDispatchMetadata(
        f.bytes,
        100,
        { path: "/x", sha256: "a".repeat(64) },
        { facet: "all", swiftTypeAddress: hex(0x500) },
      ),
    ).toThrow(AnalysisInputError);
    const all = decodeAppleDispatchMetadata(f.bytes, 100, {
      path: "/x",
      sha256: "a".repeat(64),
    });
    expect(all.swift_type_fields).toBeUndefined();
    expect(
      all.coverage.find((c) => c.facet === "swift_type_fields")?.status,
    ).toBe("not_requested");
  });
});
