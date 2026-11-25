import { createHash } from "node:crypto";
import { expect, it } from "vitest";
import { hasUImageMagic, parseUImage } from "./uimage.js";
import {
  uImageMetadataSchema,
  uImageEntryMetadataSchema,
} from "./uimageMetadata.js";
import { uimageFile, uimageMultiPayload } from "./uimage.fixture.js";

const capacity = { maxElements: 65_536 };
const image = (bytes: Uint8Array, maxElements = capacity.maxElements) => {
  const result = parseUImage(bytes, { maxElements });
  if (!result.ok) throw Error(result.error.message);
  return result.value;
};
it("recognizes only the legacy magic, including nonzero-offset byte views", () => {
  const bytes = uimageFile();
  expect(hasUImageMagic(bytes.subarray(0, 3))).toBe(false);
  expect(hasUImageMagic(bytes.subarray(0, 4))).toBe(true);
  const padded = Buffer.concat([Buffer.from([0]), bytes]);
  expect(hasUImageMagic(padded.subarray(1))).toBe(true);
  expect(image(Uint8Array.from(padded).subarray(1)).metadata.crc_verified).toBe(
    true,
  );
  expect(hasUImageMagic(padded)).toBe(false);
});
it("retains raw and named header facts and matches an independent Python struct/zlib oracle", () => {
  const bytes = uimageFile(),
    decoded = image(bytes);
  // Independently computed with Python struct.pack('>7I4B32s', ...) and zlib.crc32.
  expect(createHash("sha256").update(bytes).digest("hex")).toBe(
    "16e69408532740309728fb3192464f8ca269c8d39bd35db31b4f995d19859e1f",
  );
  expect(decoded.metadata).toMatchObject({
    kind: "uimage",
    magic: 0x27051956,
    timestamp: 1700000000,
    timestamp_iso: "2023-11-14T22:13:20.000Z",
    payload_size: 13,
    load_address: 0x8000,
    entry_point: 0x8004,
    header_crc32: 0x4a88c99c,
    computed_header_crc32: 0x4a88c99c,
    data_crc32: 0x1eb9d2e6,
    computed_data_crc32: 0x1eb9d2e6,
    crc_verified: true,
    os: 5,
    os_name: "linux",
    arch: 2,
    arch_name: "arm",
    type: 2,
    type_name: "kernel",
    compression: 0,
    compression_name: "none",
    name: "test-kernel",
    sub_image_count: 0,
    size_table_bytes: 0,
    sub_image_slack_bytes: 0,
    trailing_bytes: 0,
    carrier_coverage: "complete-within-carrier",
  });
  expect(decoded.integrityFailures).toEqual([]);
  expect(decoded.regions).toEqual([
    {
      path: "payload.bin",
      offset: 64,
      bytes: Buffer.from("stored-kernel"),
      metadata: { kind: "uimage-entry", role: "payload", index: 0 },
    },
  ]);
  expect(uImageMetadataSchema.parse(decoded.metadata)).toEqual(
    decoded.metadata,
  );
  expect(uImageEntryMetadataSchema.parse(decoded.regions[0]!.metadata)).toEqual(
    decoded.regions[0]!.metadata,
  );
});
it("preserves unknown IDs without inventing architecture or decoding compressed payload bytes", () => {
  const payload = Uint8Array.from([0x1f, 0x8b, 1, 2]);
  const decoded = image(
    uimageFile({
      payload,
      arch: 250,
      os: 251,
      type: 252,
      compression: 253,
      loadAddress: 0xffffffff,
      entryPoint: 0x1234,
    }),
  );
  expect(decoded.metadata).toMatchObject({
    arch: 250,
    arch_name: "unknown",
    os: 251,
    os_name: "unknown",
    type: 252,
    type_name: "unknown",
    compression: 253,
    compression_name: "unknown",
    load_address: 0xffffffff,
    entry_point: 0x1234,
  });
  expect(Buffer.from(decoded.regions[0]!.bytes)).toEqual(Buffer.from(payload));
  const compressed = image(uimageFile({ payload, compression: 1 }));
  expect(compressed.metadata.compression_name).toBe("gzip");
  expect(Buffer.from(compressed.regions[0]!.bytes)).toEqual(
    Buffer.from(payload),
  );
  expect(compressed.limitations.join(" ")).toContain("not decompressed");
});
it("preserves all fixed-field name bytes, invalid UTF-8 and BOM content", () => {
  const raw = Uint8Array.from([0xe2, 0x82]);
  const invalid = image(uimageFile({ name: raw }));
  expect(invalid.metadata.name).toBeNull();
  expect(invalid.metadata.name_bytes_hex).toBe("e282" + "00".repeat(30));
  expect(invalid.limitations.join(" ")).toContain("not valid UTF-8");
  const afterNul = image(uimageFile({ name: Uint8Array.from([65, 0, 255]) }));
  expect(afterNul.metadata.name).toBe("A");
  expect(afterNul.metadata.name_bytes_hex).toBe("4100ff" + "00".repeat(29));
  expect(
    image(uimageFile({ name: Uint8Array.from([0xef, 0xbb, 0xbf, 65]) }))
      .metadata.name,
  ).toBe("\ufeffA");
  expect(image(uimageFile({ name: "a".repeat(32) })).metadata.name).toBe(
    "a".repeat(32),
  );
});
it.each([4, 6])(
  "splits type %i size-table components with nonfinal padding and real carrier offsets",
  (type) => {
    const parts = [Buffer.from("abc"), Buffer.from("defgh")];
    const payload = uimageMultiPayload(parts),
      decoded = image(uimageFile({ type, payload }));
    expect(decoded.metadata).toMatchObject({
      sub_image_count: 2,
      size_table_bytes: 12,
      sub_image_slack_bytes: 0,
    });
    expect(
      decoded.regions.map((r) => ({
        path: r.path,
        offset: r.offset,
        role: r.metadata.role,
        index: r.metadata.index,
        hex: Buffer.from(r.bytes).toString("hex"),
      })),
    ).toEqual([
      {
        path: "payload.bin",
        offset: 64,
        role: "payload",
        index: 0,
        hex: Buffer.from(payload).toString("hex"),
      },
      {
        path: "image-0.bin",
        offset: 76,
        role: "sub-image",
        index: 0,
        hex: "616263",
      },
      {
        path: "image-1.bin",
        offset: 80,
        role: "sub-image",
        index: 1,
        hex: "6465666768",
      },
    ]);
  },
);
it("keeps sub-image slack in the full payload and carrier trailing bytes explicit", () => {
  const payload = Buffer.concat([
    uimageMultiPayload([Buffer.from([1])]),
    Buffer.from([8, 9]),
  ]);
  const decoded = image(
    uimageFile({ type: 4, payload, trailing: Uint8Array.from([3, 4, 5]) }),
  );
  expect(decoded.metadata).toMatchObject({
    sub_image_slack_bytes: 2,
    trailing_bytes: 3,
    carrier_coverage: "unknown-trailing",
  });
  expect(decoded.regions.map((r) => r.bytes.length)).toEqual([11, 1]);
  expect(decoded.limitations.join(" ")).toContain(
    "represented only by payload.bin",
  );
  expect(decoded.limitations.join(" ")).toContain(
    "outside the extracted entries",
  );
});
it("preserves header and data CRC disagreements for explicit adapter policy, without certifying them", () => {
  const bytes = uimageFile({ declaredHeaderCrc32: 0, declaredDataCrc32: 0 });
  const decoded = image(bytes);
  expect(decoded.metadata).toMatchObject({
    header_crc32: 0,
    data_crc32: 0,
    crc_verified: false,
    computed_data_crc32: 0x1eb9d2e6,
  });
  expect(decoded.metadata.computed_header_crc32).not.toBe(0);
  expect(decoded.integrityFailures).toEqual([
    expect.stringMatching(
      /^uImage header CRC32 mismatch: declared 0x00000000, computed 0x[0-9a-f]{8}$/u,
    ),
    "uImage data CRC32 mismatch: declared 0x00000000, computed 0x1eb9d2e6",
  ]);
  expect(
    decoded.limitations.filter((v) => v.includes("observed-untrusted")),
  ).toHaveLength(2);
  const dataOnly = image(uimageFile({ declaredDataCrc32: 0 }));
  expect(dataOnly.metadata.header_crc32).toBe(
    dataOnly.metadata.computed_header_crc32,
  );
  expect(dataOnly.integrityFailures).toHaveLength(1);
  expect(decoded.regions[0]!.bytes).toEqual(Buffer.from("stored-kernel"));
});
it("admits payload plus sub-images before retaining excess entries and has no fixed 4096-component cap", () => {
  const plain = uimageFile();
  expect(image(plain, 1).regions).toHaveLength(1);
  const bytes = uimageFile({
    type: 4,
    payload: uimageMultiPayload(
      Array.from({ length: 4097 }, () => Uint8Array.from([1])),
    ),
  });
  expect(parseUImage(bytes, { maxElements: 4097 })).toMatchObject({
    ok: false,
    error: { kind: "limit", boundary: "capacity" },
  });
  const admitted = image(bytes, 4098);
  expect(admitted.metadata.sub_image_count).toBe(4097);
  expect(admitted.regions).toHaveLength(4098);
});
it("supports an empty ordinary payload and an explicitly terminated empty multi-image table", () => {
  const empty = image(uimageFile({ payload: new Uint8Array() }), 1);
  expect(empty.metadata).toMatchObject({
    payload_size: 0,
    data_crc32: 0,
    computed_data_crc32: 0,
    crc_verified: true,
  });
  expect(empty.regions[0]!.bytes).toHaveLength(0);
  const table = image(uimageFile({ type: 4, payload: new Uint8Array(4) }), 1);
  expect(table.metadata).toMatchObject({
    sub_image_count: 0,
    size_table_bytes: 4,
  });
  expect(table.regions).toHaveLength(1);
});
it.each([
  ["short header", new Uint8Array(63)],
  ["bad magic", new Uint8Array(64)],
  ["truncated payload", uimageFile({ declaredPayloadSize: 14 })],
  [
    "missing table terminator",
    uimageFile({ type: 4, payload: Uint8Array.from([0, 0, 0, 3, 65, 66, 67]) }),
  ],
  [
    "table component overrun",
    uimageFile({
      type: 4,
      payload: Uint8Array.from([0, 0, 0, 99, 0, 0, 0, 0, 1]),
    }),
  ],
  [
    "large unsigned component overrun",
    uimageFile({
      type: 6,
      payload: Uint8Array.from([0x80, 0, 0, 1, 0, 0, 0, 0]),
    }),
  ],
  [
    "terminator outside declared payload",
    uimageFile({
      type: 4,
      declaredPayloadSize: 4,
      payload: Uint8Array.from([0, 0, 0, 1, 0, 0, 0, 0, 1]),
    }),
  ],
  [
    "nonfinal padding missing",
    uimageFile({
      type: 4,
      payload: Uint8Array.from([0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 2]),
    }),
  ],
] as const)("refuses %s as a structural failure", (_name, bytes) => {
  expect(parseUImage(bytes, capacity)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
});
it.each([0, -1, 1.5, Number.MAX_SAFE_INTEGER + 1])(
  "refuses invalid maxElements=%s",
  (maxElements) => {
    expect(parseUImage(uimageFile(), { maxElements })).toMatchObject({
      ok: false,
      error: { kind: "format" },
    });
  },
);
