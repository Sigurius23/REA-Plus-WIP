import { createHash } from "node:crypto";
import { expect, it } from "vitest";
import { parseFitImage, type FitCapacity } from "./fitImage.js";
import {
  fitFixture,
  FIT_EMBEDDED,
  FIT_EXTERNAL,
  FIT_KERNEL,
  FIT_LATE_IMAGES,
} from "./fitImage.fixture.js";
import {
  cells,
  devicetreeFixture,
  dtString,
  type FixtureNode,
} from "./fdt.fixture.js";
import { fitMetadataSchema, fitImageMetadataSchema } from "./fitMetadata.js";
const capacity: FitCapacity = {
  maxElements: 65_536,
  maxTreeNodes: 65_536,
  maxTreeProperties: 262_144,
  maxTreeDepth: 256,
  maxMetadataBytes: 64 * 1024 * 1024,
  maxHashBytes: 1_073_741_824,
};
const decode = (bytes: Uint8Array, limits = capacity) => {
  const parsed = parseFitImage(bytes, limits);
  if (!parsed.ok) throw new Error(parsed.error.message);
  return parsed.value;
};
const simple = () =>
  fitFixture({
    images: [
      { name: "kernel", data: Buffer.from([1, 2, 3]), hashes: ["sha256"] },
    ],
  });
it("retains stored inline images, complete hash facts, configuration references and unverified signatures", () => {
  const parsed = decode(FIT_EMBEDDED),
    first = parsed.regions[0]!;
  expect(parsed.regions).toHaveLength(2);
  expect(first.path).toBe("image-0000.bin");
  expect(first.bytes).toEqual(FIT_KERNEL);
  expect(first.metadata).toMatchObject({
    kind: "fit-image",
    name: "kernel",
    type: "kernel",
    arch: "arm64",
    compression: "none",
    load: "0x40200000",
    entry: "0x40200000",
    data_source: "embedded",
    hashes_verified: 6,
    hashes_mismatched: 0,
    hashes_unverified: 0,
  });
  expect(
    first.metadata.hashes.find((hash) => hash.algorithm === "sha256"),
  ).toMatchObject({
    status: "matches",
    declared_hex: createHash("sha256").update(FIT_KERNEL).digest("hex"),
    observed_hex: createHash("sha256").update(FIT_KERNEL).digest("hex"),
  });
  expect(parsed.metadata).toMatchObject({
    default_configuration: "conf-1",
    configurations: [
      {
        kernel: ["kernel"],
        fdt: ["fdt-1"],
        signature_count: 1,
        signatures: [{ algorithm: "sha256,rsa2048", verified: false }],
      },
    ],
  });
  expect(parsed.limitations.join(" ")).toContain("cryptographic signatures");
  expect(parsed.integrityFailures).toEqual([]);
  expect(fitMetadataSchema.safeParse(parsed.metadata).success).toBe(true);
  expect(fitImageMetadataSchema.safeParse(first.metadata).success).toBe(true);
});
it.each([16, 17])(
  "reads full v%i FIT structure and external aligned offsets",
  (version) => {
    for (const mode of ["offset", "position"] as const) {
      const data = Buffer.from([1, 2, 3]),
        file = fitFixture({
          images: [{ name: "kernel", data, hashes: ["crc32", "sha256"] }],
          mode,
          version,
          align: 64,
        }),
        parsed = decode(file),
        region = parsed.regions[0]!;
      expect(region.metadata.data_source).toBe(
        mode === "offset" ? "data-offset" : "data-position",
      );
      expect(region.offset).toBe(
        Math.ceil(parsed.metadata.fdt_totalsize / 4) * 4,
      );
      expect(file.subarray(region.offset, region.offset + data.length)).toEqual(
        data,
      );
      expect(region.bytes).toEqual(data);
    }
  },
);
it("preserves 64-bit address values and accepts safe two-cell external locators", () => {
  const image = (offset: number) =>
    devicetreeFixture({
      name: "",
      children: [
        {
          name: "images",
          children: [
            {
              name: "wide",
              properties: {
                "data-position": cells(0, offset),
                "data-size": cells(0, 3),
                load: cells(0x12345678, 0xabcdef01),
                entry: cells(0xffffffff, 0xffffffff),
              },
            },
          ],
        },
      ],
    });
  const fdt = image(0),
    bytes = Buffer.concat([image(fdt.length), Buffer.from([4, 5, 6])]),
    parsed = decode(bytes),
    region = parsed.regions[0]!;
  expect(region.offset).toBe(fdt.length);
  expect(region.metadata).toMatchObject({
    load: "0x12345678abcdef01",
    entry: "0xffffffffffffffff",
    declared_offset: fdt.length,
  });
  expect(region.bytes).toEqual(Buffer.from([4, 5, 6]));
});
it.each(["data-position", "data-size"])(
  "refuses unsafe 64-bit %s rather than rounding",
  (name) => {
    const file = devicetreeFixture({
      name: "",
      children: [
        {
          name: "images",
          children: [
            {
              name: "bad",
              properties: {
                "data-position": cells(0),
                "data-size": cells(0),
                [name]: cells(0x200000, 0),
              },
            },
          ],
        },
      ],
    });
    expect(parseFitImage(file, capacity)).toMatchObject({
      ok: false,
      error: {
        kind: "format",
        message: expect.stringContaining("exact integer"),
      },
    });
  },
);
it("retains hash mismatches and malformed digest lengths for policy enforcement by the caller", () => {
  for (const value of [Buffer.alloc(32), Buffer.from([0])]) {
    const file = fitFixture({
      images: [
        {
          name: "kernel",
          data: Buffer.from([1]),
          children: [
            { name: "hash-1", properties: { algo: dtString("sha256"), value } },
          ],
        },
      ],
    });
    const parsed = decode(file);
    expect(parsed.integrityFailures).toHaveLength(1);
    expect(parsed.regions[0]!.metadata.hashes[0]).toEqual({
      name: "hash-1",
      algorithm: "sha256",
      algorithm_bytes_hex: dtString("sha256").toString("hex"),
      declared_hex: value.toString("hex"),
      observed_hex: createHash("sha256")
        .update(Buffer.from([1]))
        .digest("hex"),
      status: "mismatched",
    });
    expect(parsed.limitations.join(" ")).toContain("observed-untrusted");
  }
});
it("counts unsupported hash/signature declarations without pretending to verify them", () => {
  const parsed = decode(
      fitFixture({
        images: [
          {
            name: "a",
            data: Buffer.alloc(0),
            children: [
              {
                name: "hash-1",
                properties: {
                  algo: dtString("future-hash"),
                  value: Buffer.from([9]),
                },
              },
              {
                name: "hash-2",
                properties: {
                  algo: Buffer.from([0xff, 0]),
                  value: Buffer.from([8]),
                },
              },
              {
                name: "signature-1",
                properties: {
                  value: Buffer.from([7]),
                  "key-name-hint": dtString("key"),
                },
              },
            ],
          },
        ],
      }),
    ),
    meta = parsed.regions[0]!.metadata;
  expect(meta.hashes_unverified).toBe(2);
  expect(meta.hashes_verified).toBe(0);
  expect(meta.hashes[1]).toMatchObject({
    algorithm: null,
    algorithm_bytes_hex: "ff00",
    declared_hex: "08",
    status: "unverified",
  });
  expect(meta.signatures).toEqual([
    {
      name: "signature-1",
      algorithm: null,
      algorithm_bytes_hex: null,
      value_hex: "07",
      key_name_hint: "key",
      verified: false,
    },
  ]);
  expect(meta.signatures_unreadable).toBe(1);
  expect(parsed.integrityFailures).toEqual([]);
});
it("preserves unresolved configuration references and a missing default", () => {
  const configurations: FixtureNode = {
    name: "configurations",
    properties: { default: dtString("absent") },
    children: [
      {
        name: "conf",
        properties: {
          kernel: dtString("missing"),
          loadables: Buffer.from("kernel\0missing\0"),
        },
      },
    ],
  };
  const parsed = decode(
    fitFixture({
      images: [{ name: "kernel", data: Buffer.alloc(0) }],
      configurations,
    }),
  );
  expect(parsed.metadata.default_configuration).toBe("absent");
  expect(parsed.metadata.configurations[0]).toMatchObject({
    kernel: ["missing"],
    loadables: ["kernel", "missing"],
    unresolved_reference_count: 2,
  });
  expect(parsed.limitations.join(" ")).toContain("unresolved");
});
it("uses safe deterministic filenames while preserving declaration names and stored compression", () => {
  const data = Buffer.from([0x1f, 0x8b, 1]);
  const parsed = decode(
    fitFixture({
      images: [
        { name: "..", data, properties: { compression: dtString("gzip") } },
      ],
    }),
  );
  expect(parsed.regions[0]!.path).toBe("image-0000.bin");
  expect(parsed.regions[0]!.metadata.name).toBe("..");
  expect(parsed.regions[0]!.metadata.compression).toBe("gzip");
  expect(parsed.regions[0]!.bytes).toEqual(data);
});
it("requires one unambiguous data source and a bounded external extent", () => {
  for (const properties of [
    { "data-offset": cells(0) },
    { "data-position": cells(0) },
  ]) {
    expect(
      parseFitImage(
        fitFixture({
          images: [{ name: "a", data: Buffer.from([1]), properties }],
        }),
        capacity,
      ),
    ).toMatchObject({ ok: false, error: { kind: "format" } });
  }
  const missingSize = devicetreeFixture({
    name: "",
    children: [
      {
        name: "images",
        children: [{ name: "a", properties: { "data-offset": cells(0) } }],
      },
    ],
  });
  expect(parseFitImage(missingSize, capacity)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
  const truncated = Buffer.from(FIT_EXTERNAL).subarray(
    0,
    FIT_EXTERNAL.length - 1,
  );
  expect(parseFitImage(truncated, capacity)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
});
it("retains external overlaps separately and validates explicit image-data links", () => {
  const data = Buffer.from([1, 2]);
  const unlinked = fitFixture({
    mode: "offset",
    images: [
      { name: "one", data },
      { name: "two", data, properties: { "data-offset": cells(0) } },
    ],
  });
  const overlapping = decode(unlinked);
  expect(overlapping.metadata.overlapping_image_count).toBe(1);
  expect(overlapping.regions[1]!.metadata.overlap_earlier_image_index).toBe(0);
  expect(overlapping.regions.map((region) => region.bytes)).toEqual([
    data,
    data,
  ]);
  const linked = fitFixture({
    mode: "offset",
    images: [
      { name: "one", data },
      {
        name: "two",
        data,
        properties: { "data-offset": cells(0), "image-data": dtString("one") },
      },
    ],
  });
  expect(decode(linked).regions).toHaveLength(2);
  const wrong = fitFixture({
    images: [
      { name: "one", data },
      {
        name: "two",
        data: Buffer.from([3, 4]),
        properties: { "image-data": dtString("one") },
      },
    ],
  });
  expect(parseFitImage(wrong, capacity)).toMatchObject({
    ok: false,
    error: {
      kind: "format",
      message: expect.stringContaining("does not match"),
    },
  });
});
it("enforces explicit entry/tree/depth/decoded metadata budgets and permits a raised policy", () => {
  for (const changed of [
    { maxElements: 1 },
    { maxTreeNodes: 1 },
    { maxTreeProperties: 1 },
    { maxTreeDepth: 1 },
    { maxMetadataBytes: 1 },
  ]) {
    expect(
      parseFitImage(FIT_EMBEDDED, { ...capacity, ...changed }),
    ).toMatchObject({
      ok: false,
      error: { kind: "limit", boundary: "capacity" },
    });
  }
  expect(decode(FIT_EMBEDDED).regions).toHaveLength(2);
});
it("has no fixed eight-hash or 1024-image ceiling", () => {
  const data = Buffer.alloc(0),
    many = fitFixture({
      images: Array.from({ length: 1025 }, (_, index) => ({
        name: `img-${String(index)}`,
        data,
        hashes: index === 0 ? Array.from({ length: 9 }, () => "sha256") : [],
      })),
    });
  const parsed = decode(many);
  expect(parsed.regions).toHaveLength(1025);
  expect(parsed.regions[0]!.metadata.hashes_verified).toBe(9);
});
it("validates duplicate node/property identity and all FDT token extents", () => {
  const duplicateNode = devicetreeFixture({
    name: "",
    children: [
      { name: "images", children: [{ name: "same" }, { name: "same" }] },
    ],
  });
  const duplicateProperty = devicetreeFixture({
    name: "",
    children: [
      {
        name: "images",
        children: [
          {
            name: "a",
            properties: { data: Buffer.from([1]) },
            repeatedProperties: [["data", Buffer.from([2])]],
          },
        ],
      },
    ],
  });
  for (const bytes of [duplicateNode, duplicateProperty])
    expect(parseFitImage(bytes, capacity)).toMatchObject({
      ok: false,
      error: { kind: "format" },
    });
  for (const mutate of [
    (b: Buffer) => b.writeUInt32BE(0xfffffff0, 8),
    (b: Buffer) => b.writeUInt32BE(0xfffffff0, 32),
    (b: Buffer) => b.writeUInt32BE(0xffffffff, b.readUInt32BE(8)),
    (b: Buffer) => b.writeUInt32BE(b.length + 1, 4),
  ]) {
    const bytes = simple();
    mutate(bytes);
    expect(parseFitImage(bytes, capacity)).toMatchObject({
      ok: false,
      error: { kind: "format" },
    });
  }
});
it("rejects plain device trees and missing FDT_END/reservation termination", () => {
  expect(parseFitImage(devicetreeFixture(), capacity)).toMatchObject({
    ok: false,
    error: { kind: "format", message: expect.stringContaining("/images") },
  });
  const noEnd = simple();
  noEnd.writeUInt32BE(4, noEnd.readUInt32BE(8) + noEnd.readUInt32BE(36) - 4);
  expect(parseFitImage(noEnd, capacity)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
  const noReservationEnd = simple();
  noReservationEnd.fill(0xff, 56, 72);
  expect(parseFitImage(noReservationEnd, capacity)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
});

it("admits aggregate hash work and reuses digest computation for the same algorithm/range", () => {
  const bytes = fitFixture({
    mode: "offset",
    images: [
      {
        name: "one",
        data: Buffer.from([1, 2, 3]),
        hashes: ["sha256", "sha256"],
      },
      {
        name: "two",
        data: Buffer.from([1, 2, 3]),
        hashes: ["sha256"],
        properties: { "data-offset": cells(0), "image-data": dtString("one") },
      },
    ],
  });
  expect(parseFitImage(bytes, { ...capacity, maxHashBytes: 2 })).toMatchObject({
    ok: false,
    error: {
      kind: "limit",
      message: expect.stringContaining("max_firmware_hash_bytes"),
    },
  });
  expect(
    decode(bytes, { ...capacity, maxHashBytes: 3 }).regions.map(
      (region) => region.metadata.hashes_verified,
    ),
  ).toEqual([2, 1]);
});

it("parses all structure bytes when /images lies beyond the old prefix probe", () => {
  expect(
    FIT_LATE_IMAGES.indexOf(Buffer.concat([cells(1), dtString("images")])),
  ).toBeGreaterThan(4096);
  expect(decode(FIT_LATE_IMAGES).regions[0]!.bytes).toEqual(
    Buffer.from([1, 2, 3]),
  );
});
it("retains unclaimed carrier extents without treating them as absent", () => {
  const bytes = Buffer.concat([simple(), Buffer.from([7, 8])]),
    parsed = decode(bytes);
  expect(parsed.metadata.unclaimed_ranges).toEqual([
    { offset: bytes.length - 2, length: 2 },
  ]);
  expect(parsed.limitations.join(" ")).toContain("unclassified");
});
