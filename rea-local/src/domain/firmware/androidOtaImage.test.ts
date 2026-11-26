import { expect, it } from "vitest";
import { createHash } from "node:crypto";
import {
  parseAndroidOtaImage,
  hasAndroidOtaPayloadMagic,
} from "./androidOtaImage.js";
import {
  androidOtaPayloadMetadataSchema,
  androidOtaRegionMetadataSchema,
} from "./androidOtaMetadata.js";
import {
  androidOtaPayload,
  otaField as f,
  otaMessage as m,
  otaExtent,
  otaVarint,
} from "./androidOta.fixture.js";
const capacity = {
  maxElements: 65_536,
  maxMetadataBytes: 33_554_432,
  maxHashBytes: 1_073_741_824,
};
const parse = (b: Uint8Array) => {
  const r = parseAndroidOtaImage(b, capacity);
  if (!r.ok) throw Error(r.error.message);
  return r.value;
};
const op = (type: number, bytes?: Uint8Array) =>
  m(
    f(1, type),
    ...(bytes === undefined
      ? []
      : [
          f(2, 0),
          f(3, bytes.length),
          f(8, createHash("sha256").update(bytes).digest()),
        ]),
  );
const payload = (
  operations: Uint8Array[],
  rest: Uint8Array[] = [],
  blob = Buffer.from("DATA"),
) =>
  androidOtaPayload({
    manifest: m(
      f(13, m(f(1, "system"), ...operations.map((x) => f(8, x)), ...rest)),
    ),
    blob,
  });
it("returns exact stored ranges and SHA facts, never a reconstructed partition hash", () => {
  const bytes = payload(
    [op(0, Buffer.from("DATA"))],
    [f(7, m(f(1, 4096), f(2, Buffer.alloc(32, 0xff))))],
  );
  const image = parse(bytes);
  expect(androidOtaPayloadMetadataSchema.parse(image.metadata)).toEqual(
    image.metadata,
  );
  expect(image.metadata.partitions[0]?.new_partition_info).toMatchObject({
    size: "4096",
    hash_hex: "ff".repeat(32),
    hash_verified: false,
  });
  expect(image.metadata.partitions[0]?.operations[0]?.data_sha256.status).toBe(
    "valid",
  );
  expect(image.integrityFailures).toEqual([]);
  expect(image.regions.map((r) => r.path)).toEqual([
    "header.bin",
    "manifest.pb",
    "metadata-signatures.pb",
    "partitions/0000/operation-000000.bin",
  ]);
  for (const region of image.regions) {
    expect(androidOtaRegionMetadataSchema.parse(region.metadata)).toEqual(
      region.metadata,
    );
    if (region.offset !== null)
      expect(region.bytes).toEqual(
        bytes.subarray(region.offset, region.offset + region.bytes.length),
      );
  }
  expect(image.metadata.partition_images_reconstructed).toBe(false);
});
it("retains ZERO/source-copy/compressed/unknown operations and empty blobs as declarations", () => {
  const image = parse(
    payload([op(6), m(op(4), f(4, otaExtent(4, 2))), op(1), op(999)]),
  );
  const p = image.metadata.partitions[0]!;
  expect(
    p.operations.map((o) => [o.type_code, o.type_name, o.stored_size]),
  ).toEqual([
    [6, "ZERO", 0],
    [4, "SOURCE_COPY", 0],
    [1, "REPLACE_BZ", 0],
    [999, null, 0],
  ]);
  expect(p.reconstruction_requirements).toMatchObject({
    operation_application: true,
    source_data: true,
    decompression: true,
    zero_fill: true,
    unknown_operation_semantics: true,
    declared_partition_size: false,
  });
  expect(
    image.regions
      .filter((r) => r.metadata.role === "operation-data")
      .every((r) => r.offset === null && r.bytes.length === 0),
  ).toBe(true);
});
it("preserves exact uint64 declarations and sparse-hole distinction beyond JS safe integers", () => {
  const huge = 0xffff_ffff_ffff_ffffn;
  const image = parse(
    payload(
      [m(op(0), f(2, huge), f(3, huge), f(6, otaExtent(huge, huge)))],
      [f(7, f(1, huge))],
    ),
  );
  const o = image.metadata.partitions[0]!.operations[0]!;
  expect(o.data_offset).toBe(huge.toString());
  expect(o.availability).toBe("missing");
  expect(o.src_extents).toEqual([]);
  expect(o.dst_extents[0]).toMatchObject({
    start_block: huge.toString(),
    num_blocks: huge.toString(),
    sparse_hole: true,
  });
  expect(image.metadata.coverage).toBe("unknown");
});
it("merges repeated singular message fields and preserves scalar last-value semantics", () => {
  const info = m(f(7, f(1, 32)), f(7, f(2, Buffer.from("abc"))));
  const image = parse(payload([op(6)], [info]));
  expect(image.metadata.partitions[0]!.new_partition_info).toMatchObject({
    size: "32",
    hash_hex: "616263",
  });
  const manifest = m(f(3, 1), f(3, 4096), f(15, f(2, 1)), f(15, f(3, 0)));
  const second = parse(androidOtaPayload({ manifest, blob: new Uint8Array() }));
  expect(second.metadata.block_size).toBe(4096);
  expect(second.metadata.dynamic_partition_metadata).toMatchObject({
    snapshot_enabled: true,
    vabc_enabled: false,
  });
});
it("retains raw unknown fields/groups, invalid UTF-8 names and signed int64 facts", () => {
  const unknown = m(otaVarint(100 * 8 + 3), f(2, 1), otaVarint(100 * 8 + 4));
  const manifest = m(
    f(14, 0xffff_ffff_ffff_ffffn),
    f(13, m(f(1, Uint8Array.of(0xff)), f(8, m(op(14), f(100, 1))))),
    unknown,
  );
  const image = parse(androidOtaPayload({ manifest, blob: new Uint8Array() }));
  expect(image.metadata.max_timestamp).toBe("-1");
  expect(image.metadata.partitions[0]!.name).toEqual({
    value: null,
    bytes_hex: "ff",
  });
  expect(image.metadata.unknown_fields[0]?.encoded_field_hex).toBe(
    Buffer.from(unknown).toString("hex"),
  );
  expect(image.metadata.partitions[0]!.operations[0]!.type_name).toBe(null);
});
it("keeps invalid operation data SHA facts for the shared strict/continue policy", () => {
  const image = parse(
    payload([m(op(0, Buffer.from("DATA")), f(8, Buffer.alloc(32)))]),
  );
  expect(image.metadata.partitions[0]!.operations[0]!.data_sha256.status).toBe(
    "invalid",
  );
  expect(image.integrityFailures).toHaveLength(1);
});
it("retains partial operation blobs without hashing a truncated range as the complete data", () => {
  const image = parse(payload([m(op(0, Buffer.from("DATA")), f(3, 8))]));
  const o = image.metadata.partitions[0]!.operations[0]!;
  expect(o).toMatchObject({
    stored_size: 4,
    availability: "truncated",
    data_sha256: { status: "unavailable", observed_hex: null },
  });
  expect(image.regions.at(-1)?.bytes).toEqual(Buffer.from("DATA"));
  expect(image.integrityFailures).toEqual([]);
});
it("parses signature facts without authentication and keeps malformed signature bytes", () => {
  const signature = m(
    f(1, m(f(1, 1), f(2, "sig"), Uint8Array.of(29, 3, 0, 0, 0))),
  );
  const image = parse(androidOtaPayload({ metadataSignatures: signature }));
  expect(image.metadata.metadata_signatures).toMatchObject({
    status: "parsed",
    verified: false,
    signatures: [
      { version: 1, data_hex: "736967", unpadded_size: 3, verified: false },
    ],
  });
  const malformed = parse(
    androidOtaPayload({ metadataSignatures: Uint8Array.of(0x0a, 0x80) }),
  );
  expect(malformed.metadata.metadata_signatures.status).toBe("malformed");
  expect(
    malformed.regions.find((r) => r.path === "metadata-signatures.pb")?.bytes,
  ).toEqual(Buffer.from([0x0a, 0x80]));
});
it("admission refuses metadata/record/hash work before expansion", () => {
  const bytes = androidOtaPayload();
  for (const key of [
    "maxElements",
    "maxMetadataBytes",
    "maxHashBytes",
  ] as const) {
    const r = parseAndroidOtaImage(bytes, { ...capacity, [key]: 1 });
    expect(r).toMatchObject({
      ok: false,
      error: {
        kind: "limit",
        boundary: key === "maxHashBytes" ? "cpu" : "capacity",
      },
    });
  }
});
it("reuses identical data hashes without reserving the same byte work twice", () => {
  const image = parseAndroidOtaImage(
    payload([op(0, Buffer.from("DATA")), op(0, Buffer.from("DATA"))]),
    { ...capacity, maxHashBytes: 4 },
  );
  if (!image.ok) throw Error(image.error.message);
  expect(
    image.value.metadata.partitions[0]!.operations.every(
      (o) => o.data_sha256.status === "valid",
    ),
  ).toBe(true);
});
it("rejects unsupported/truncated headers and malformed protobuf without invented defaults", () => {
  expect(hasAndroidOtaPayloadMagic(Uint8Array.of(67, 114, 65, 85))).toBe(true);
  expect(
    parseAndroidOtaImage(androidOtaPayload({ version: 1n }), capacity),
  ).toMatchObject({ ok: false, error: { kind: "unsupported" } });
  for (const manifest of [
    Uint8Array.of(0x1a, 0x80),
    m(f(13, f(1, "x")), Uint8Array.of(0)),
    f(13, m(f(1, "x"), f(8, f(2, 1)))),
    f(3, 0),
    Uint8Array.of(0x1b, 0x24),
  ])
    expect(
      parseAndroidOtaImage(androidOtaPayload({ manifest }), capacity),
    ).toMatchObject({ ok: false, error: { kind: "format" } });
  const b = androidOtaPayload();
  expect(parseAndroidOtaImage(b.subarray(0, 23), capacity)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
});
it("honors cancellation rather than converting it into format failure", () => {
  const controller = new AbortController();
  controller.abort(new Error("stop"));
  expect(() =>
    parseAndroidOtaImage(androidOtaPayload(), capacity, controller.signal),
  ).toThrow("stop");
});
it("admits more than the old 4096 partition ceiling when the caller admits its representation", () => {
  const manifest = m(
    ...Array.from({ length: 4097 }, (_, i) => f(13, f(1, String(i)))),
  );
  const image = parse(androidOtaPayload({ manifest, blob: new Uint8Array() }));
  expect(image.metadata.partitions).toHaveLength(4097);
});

it("iteratively retains deeply nested unknown groups within the admitted metadata budget", () => {
  const open = otaVarint(100 * 8 + 3),
    close = otaVarint(100 * 8 + 4);
  const raw = m(
    ...Array.from({ length: 12000 }, () => open),
    ...Array.from({ length: 12000 }, () => close),
  );
  const image = parse(
    androidOtaPayload({ manifest: raw, blob: new Uint8Array() }),
  );
  expect(image.metadata.unknown_fields[0]?.encoded_field_hex).toBe(
    Buffer.from(raw).toString("hex"),
  );
  expect(
    parseAndroidOtaImage(
      androidOtaPayload({ manifest: raw, blob: new Uint8Array() }),
      { ...capacity, maxMetadataBytes: 65536 },
    ),
  ).toMatchObject({ ok: false, error: { kind: "limit" } });
});

it("preserves a literal leading Unicode BOM in protobuf strings", () => {
  const name = "\ufeffsystem";
  const image = parse(
    androidOtaPayload({ manifest: f(13, f(1, name)), blob: new Uint8Array() }),
  );
  expect(image.metadata.partitions[0]?.name).toEqual({
    value: name,
    bytes_hex: Buffer.from(name).toString("hex"),
  });
});
