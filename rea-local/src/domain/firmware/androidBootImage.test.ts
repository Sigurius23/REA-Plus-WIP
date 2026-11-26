import { expect, it } from "vitest";
import {
  parseAndroidBootImage,
  hasAndroidBootImageMagic,
} from "./androidBootImage.js";
import {
  androidBootImageMetadataSchema,
  androidBootEntryMetadataSchema,
} from "./androidBootMetadata.js";
import {
  buildBootImage,
  buildVendorBootImage,
  appendAvbFooter,
  osVersionRaw,
} from "./androidBoot.fixture.js";
const capacity = { maxElements: 65536, maxMetadataBytes: 33554432 };
const parsed = (bytes: Uint8Array, limits = capacity) => {
  const result = parseAndroidBootImage(bytes, limits);
  if (!result.ok) throw Error(result.error.message);
  return result.value;
};
const failed = (bytes: Uint8Array, limits = capacity) => {
  const result = parseAndroidBootImage(bytes, limits);
  if (result.ok) throw Error("Expected refusal");
  return result.error;
};
const bytes = (text: string) => Buffer.from(text);
it.each([0, 1, 2, 3, 4] as const)(
  "retains v%i boot layout/source windows and unverified header declarations",
  (version) => {
    const input = buildBootImage({
      version,
      kernel: bytes("kernel"),
      ramdisk: Buffer.from([0x1f, 0x8b, 1, 2]),
      second: bytes("second"),
      recoveryDtbo: bytes("recovery"),
      dtb: bytes("dtb"),
      signature: bytes("signature"),
      osVersion: osVersionRaw(13, 1, 2, 2026, 11),
      name: "declared-board",
    });
    const image = parsed(input);
    expect(androidBootImageMetadataSchema.parse(image.metadata)).toEqual(
      image.metadata,
    );
    expect(image.metadata).toMatchObject({
      header_version: version,
      image_kind: "boot",
      coverage: "complete",
      page_size: version < 3 ? 2048 : 4096,
      os_version: "13.1.2",
      security_patch_level: "2026-11",
      avb_footer_present: false,
    });
    const expected =
      version === 0
        ? ["kernel", "ramdisk", "second"]
        : version === 1
          ? ["kernel", "ramdisk", "second", "recovery_dtbo"]
          : version === 2
            ? ["kernel", "ramdisk", "second", "recovery_dtbo", "dtb"]
            : version === 3
              ? ["kernel", "ramdisk"]
              : ["kernel", "ramdisk", "signature"];
    expect(image.regions.map((r) => r.path)).toEqual(expected);
    expect(image.regions[1]?.metadata.compression).toBe("gzip");
    for (const region of image.regions) {
      expect(androidBootEntryMetadataSchema.parse(region.metadata)).toEqual(
        region.metadata,
      );
      expect(region.bytes).toEqual(
        input.subarray(region.offset, region.offset + region.bytes.length),
      );
      expect(region.bytes.buffer).toBe(input.buffer);
    }
    expect(image.integrityFailures).toEqual([]);
    expect(image.limitations.join(" ")).toContain(
      "without cryptographic verification",
    );
  },
);
it("keeps invalid text and command-line boundary bytes without lossy decoding", () => {
  const input = buildBootImage({ version: 0, name: "测".repeat(6) });
  input.fill(0x41, 64, 575);
  input[575] = 0xc3;
  input.fill(0, 608, 1632);
  input[608] = 0xa9;
  const image = parsed(input);
  expect(image.metadata.name).toBeNull();
  expect(image.metadata.name_bytes_hex).toBe(
    input.subarray(48, 64).toString("hex"),
  );
  expect(image.metadata.cmdline).toBeNull();
  expect(image.metadata.extra_cmdline).toBeNull();
  expect(image.metadata.command_line).toBe("A".repeat(511) + "é");
  expect(image.metadata.header_bytes_hex).toBe(
    input.subarray(0, 1632).toString("hex"),
  );
});
it("retains a declared physical u64 address beyond JS-safe integers without rounding", () => {
  const input = buildBootImage({ version: 2, dtb: bytes("dtb") });
  input.writeBigUInt64LE(0xfedcba9876543210n, 1652);
  const image = parsed(input);
  expect(image.metadata.dtb_addr).toBeNull();
  expect(image.metadata.dtb_addr_hex).toBe("1032547698badcfe");
  expect(image.limitations.join(" ")).toContain(
    "exceeds safe-number precision",
  );
  expect(
    image.regions.find((r) => r.path === "dtb")?.metadata.load_address,
  ).toBeNull();
});
it("retains vendor v3 assembled section and v4 declarations including zero-size ramdisks", () => {
  const old = parsed(
    buildVendorBootImage({
      version: 3,
      ramdisk: bytes("combined"),
      dtb: bytes("dtb"),
    }),
  );
  expect(old.regions.map((r) => r.path)).toEqual(["vendor_ramdisk", "dtb"]);
  expect(old.metadata.vendor_ramdisk_entries).toEqual([]);
  const input = buildVendorBootImage({
      version: 4,
      ramdisks: [
        {
          name: "../unsafe",
          type: 99,
          bytes: bytes("first"),
          boardId: Buffer.alloc(64, 0x12),
        },
        { name: "empty", bytes: Buffer.alloc(0) },
      ],
      bootconfig: bytes("key=value\n"),
      dtb: bytes("dtb"),
    }),
    image = parsed(input);
  expect(image.metadata.vendor_ramdisk_entries).toMatchObject([
    {
      index: 0,
      size: 5,
      name: "../unsafe",
      ramdisk_type: 99,
      ramdisk_type_name: null,
      board_id_hex: "12".repeat(64),
    },
    { index: 1, size: 0, name: "empty" },
  ]);
  expect(image.regions.map((r) => r.path)).toEqual([
    "dtb",
    "bootconfig",
    "vendor_ramdisk/000000.bin",
    "vendor_ramdisk_table",
    "vendor_ramdisk_section",
  ]);
  expect(
    image.regions.find((r) => r.path === "vendor_ramdisk/000000.bin")?.metadata
      .load_address,
  ).toBeNull();
  expect(image.metadata.coverage).toBe("complete");
});
it("keeps overlapping vendor fragments as separate views and marks coverage unknown", () => {
  const input = buildVendorBootImage({
    version: 4,
    ramdisks: [
      { name: "same", bytes: bytes("AAAA") },
      { name: "same", bytes: bytes("BBBB") },
    ],
  });
  const tableAt = 8192;
  input.writeUInt32LE(0, tableAt + 108 + 4);
  const image = parsed(input);
  expect(image.metadata.coverage).toBe("unknown");
  expect(
    image.regions
      .filter((r) => r.metadata.role === "vendor-ramdisk")
      .map((r) => Buffer.from(r.bytes).toString()),
  ).toEqual(["AAAA", "AAAA"]);
  expect(
    Buffer.from(
      image.regions.find((r) => r.path === "vendor_ramdisk_section")!.bytes,
    ).toString(),
  ).toBe("AAAABBBB");
  expect(image.limitations.join(" ")).toContain("overlaps");
});
it("preserves extension bytes and accepts entry sizes beyond the old hidden cap", () => {
  const input = buildVendorBootImage({
    version: 4,
    entrySize: 5000,
    ramdisks: [{ bytes: bytes("R") }],
  });
  input[8192 + 4999] = 0xab;
  const image = parsed(input);
  expect(
    image.metadata.vendor_ramdisk_entries[0]?.extension_bytes_hex,
  ).toHaveLength((5000 - 108) * 2);
  expect(
    image.metadata.vendor_ramdisk_entries[0]?.extension_bytes_hex.endsWith(
      "ab",
    ),
  ).toBe(true);
  expect(image.metadata.coverage).toBe("unknown");
  expect(failed(input, { ...capacity, maxMetadataBytes: 70000 })).toMatchObject(
    { kind: "limit", message: expect.stringContaining("before table/header") },
  );
});
it("admits counts beyond 4096 but charges every empty declaration before table parsing", () => {
  const input = buildVendorBootImage({
    version: 4,
    ramdisks: Array.from({ length: 4097 }, () => ({ bytes: Buffer.alloc(0) })),
  });
  expect(parsed(input).metadata.vendor_ramdisk_entries).toHaveLength(4097);
  expect(failed(input, { ...capacity, maxElements: 4096 })).toMatchObject({
    kind: "limit",
    boundary: "capacity",
    message: expect.stringContaining("max_firmware_elements"),
  });
  expect(failed(input, { ...capacity, maxMetadataBytes: 65536 })).toMatchObject(
    { kind: "limit", message: expect.stringContaining("before table/header") },
  );
});
it("accepts large vendor header declarations under caller metadata policy", () => {
  const input = buildVendorBootImage({
    version: 3,
    headerSize: 1048577,
    ramdisk: bytes("R"),
  });
  const image = parsed(input);
  expect(image.metadata.header_size).toBe(1048577);
  expect(image.metadata.header_bytes_hex).toHaveLength(1048577 * 2);
  expect(image.metadata.coverage).toBe("unknown");
  expect(
    failed(input, { ...capacity, maxMetadataBytes: 3 * 1048576 }),
  ).toMatchObject({
    kind: "limit",
    message: expect.stringContaining("max_firmware_metadata_bytes"),
  });
});
it("preserves AVB footer and vbmeta stored bytes without asserting verification", () => {
  const input = appendAvbFooter(
      buildBootImage({ version: 4, signature: bytes("unsigned-signature") }),
      { vbmeta: bytes("unverified-vbmeta") },
    ),
    image = parsed(input);
  expect(image.metadata).toMatchObject({
    avb_footer_present: true,
    avb_footer_size: 64,
    avb_version_major: 1,
    avb_version_minor: 0,
  });
  expect(image.metadata.avb_footer_bytes_hex).toBe(
    input.subarray(input.length - 64).toString("hex"),
  );
  expect(image.regions.map((r) => r.path)).toContain("avb_vbmeta");
  expect(image.regions.map((r) => r.path)).toContain("avb_footer");
  expect(image.integrityFailures).toEqual([]);
});
it("recognizes a footer after present unpadded data instead of requiring imaginary final padding", () => {
  const full = buildBootImage({
    version: 3,
    kernel: bytes("K"),
    ramdisk: bytes("R"),
  });
  const input = appendAvbFooter(full.subarray(0, 8193), { vbmeta: bytes("V") });
  const image = parsed(input);
  expect(image.metadata.avb_footer_present).toBe(true);
  expect(image.regions.find((r) => r.path === "avb_vbmeta")?.offset).toBe(8193);
});
it("retains unexplained aligned trailing ranges as unknown", () => {
  const base = buildBootImage({ version: 0 });
  const input = Buffer.concat([base, bytes("unexplained")]),
    image = parsed(input);
  expect(image.metadata.coverage).toBe("unknown");
  expect(image.metadata.undescribed).toEqual([
    { offset: base.length, length: 11 },
  ]);
});
it("refuses truncated, unsupported, overlapping structural extents and metadata limits", () => {
  const input = buildBootImage({ version: 2, dtb: bytes("DTB") });
  expect(failed(input.subarray(0, 6146))).toMatchObject({
    kind: "format",
    message: expect.stringContaining("truncated"),
  });
  const newer = Buffer.from(input);
  newer.writeUInt32LE(5, 40);
  expect(failed(newer)).toMatchObject({ kind: "unsupported" });
  const overlap = Buffer.from(input);
  overlap.writeUInt32LE(4, 1632);
  overlap.writeBigUInt64LE(2048n, 1636);
  expect(failed(overlap)).toMatchObject({
    kind: "format",
    message: expect.stringContaining("overlaps"),
  });
  expect(failed(input, { ...capacity, maxMetadataBytes: 1 })).toMatchObject({
    kind: "limit",
    message: expect.stringContaining("before header"),
  });
  expect(failed(input, { ...capacity, maxElements: 1 })).toMatchObject({
    kind: "limit",
    message: expect.stringContaining("max_firmware_elements"),
  });
});
it("uses exact magic bytes and propagates cancellation", () => {
  expect(hasAndroidBootImageMagic(bytes("ANDROID!"))).toBe(true);
  expect(hasAndroidBootImageMagic(bytes("VNDRBOOT"))).toBe(true);
  const wrong = bytes("ANDROID!");
  wrong[0] = 0xc1;
  expect(hasAndroidBootImageMagic(wrong)).toBe(false);
  const abort = new AbortController();
  abort.abort(new Error("cancelled"));
  expect(() =>
    parseAndroidBootImage(
      buildBootImage({ version: 0 }),
      capacity,
      abort.signal,
    ),
  ).toThrow("cancelled");
});
