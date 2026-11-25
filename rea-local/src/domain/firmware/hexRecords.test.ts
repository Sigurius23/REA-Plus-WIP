import { expect, it } from "vitest";
import {
  createHexRecordDecoder,
  detectHexRecordEncoding,
  type HexRecordCapacity,
} from "./hexRecords.js";
import {
  hexRecordsMetadataSchema,
  hexRecordRegionMetadataSchema,
} from "./hexRecordMetadata.js";
import type { HexRecordEncoding } from "./hexRecordSyntax.js";
import {
  INTEL_SPARSE_IMAGE,
  SREC_HEADER_IMAGE,
  intelHexRecord as ihex,
  srecRecord as srec,
  recordLines as lines,
} from "./hexRecords.fixture.js";

function decode(
  text: string,
  encoding: HexRecordEncoding = "intel-hex",
  options: { chunkBytes?: number; capacity?: Partial<HexRecordCapacity> } = {},
) {
  const bytes = Buffer.from(text, "latin1");
  const created = createHexRecordDecoder(encoding, bytes.length, {
    maxFileBytes: bytes.length,
    maxRuns: 1024,
    ...options.capacity,
  });
  if (!created.ok) return created;
  for (let i = 0; i < bytes.length; i += options.chunkBytes ?? 7) {
    const written = created.value.write(
      bytes.subarray(i, i + (options.chunkBytes ?? 7)),
    );
    if (!written.ok) return written;
  }
  return created.value.finish();
}
function image(
  text: string,
  encoding?: HexRecordEncoding,
  options?: Parameters<typeof decode>[2],
) {
  const result = decode(text, encoding, options);
  if (!result.ok) throw Error(result.error.message);
  hexRecordsMetadataSchema.parse(result.value.metadata);
  for (const region of result.value.regions)
    hexRecordRegionMetadataSchema.parse({
      kind: "hex-record-region",
      start_address: region.start,
      end_address: region.end,
      length: region.bytes.length,
      record_count: region.recordCount,
      first_line: region.firstLine,
      last_line: region.lastLine,
    });
  return result.value;
}
function failure(
  text: string,
  encoding?: HexRecordEncoding,
  options?: Parameters<typeof decode>[2],
) {
  const result = decode(text, encoding, options);
  if (result.ok) throw Error("Expected a rejected firmware record stream");
  return result.error;
}

it("decodes known Intel linear-address bytes into separate sparse ranges and keeps its declared start", () => {
  const decoded = image(INTEL_SPARSE_IMAGE);
  expect(
    decoded.regions.map(({ start, end, bytes }) => [
      start,
      end,
      Buffer.from(bytes).toString("hex"),
    ]),
  ).toEqual([
    [
      0x08000000,
      0x0800001f,
      Buffer.from(Array.from({ length: 32 }, (_, i) => i)).toString("hex"),
    ],
    [0x08000100, 0x08000103, "deadbeef"],
  ]);
  expect(decoded.metadata).toMatchObject({
    variant: "I32HEX",
    record_count: 6,
    data_record_count: 3,
    region_count: 2,
    data_bytes: 36,
    start_address: 0x08000101,
    start_address_record: "05",
    termination: "present",
    header_address: null,
    header_line: null,
  });
  expect(decoded.regions[0]).toMatchObject({
    recordCount: 2,
    firstLine: 2,
    lastLine: 3,
  });
  expect(decoded.limitations).toEqual([]);
});

it("keeps Intel segment-base, CS:IP and ignored EOF offset distinct, including mixed address declarations", () => {
  const decoded = image(
    lines(
      ihex(2, 0, [0x12, 0]),
      ihex(0, 0x2462, [0xa5]),
      ihex(3, 0, [0x10, 0, 0x12, 0x34]),
      ihex(5, 0, [0x12, 0x34, 0x56, 0x78]),
      ihex(1, 0x1234),
    ),
  );
  expect(decoded.regions).toMatchObject([
    { start: 0x14462, end: 0x14462, bytes: Uint8Array.of(0xa5) },
  ]);
  expect(decoded.metadata).toMatchObject({
    variant: "mixed",
    start_address: 0x12345678,
    start_segment_cs: 0x1000,
    start_segment_ip: 0x1234,
  });
  expect(decoded.terminated).toBe(true);
});

it("sorts out-of-order ranges and counts identical overlap while rejecting conflicting writes", () => {
  const overlap = lines(
    ihex(0, 2, [3, 4]),
    ihex(0, 0, [1, 2, 3, 4]),
    ihex(1, 0),
  );
  const decoded = image(overlap);
  expect(decoded.regions).toMatchObject([
    {
      start: 0,
      end: 3,
      bytes: Uint8Array.of(1, 2, 3, 4),
      recordCount: 2,
      firstLine: 1,
      lastLine: 2,
    },
  ]);
  expect(decoded.metadata).toMatchObject({ data_bytes: 4, duplicate_bytes: 2 });
  expect(
    failure(lines(ihex(0, 0, [1, 2, 3, 4]), ihex(0, 2, [3, 0x99]))).message,
  ).toMatch(/0x00000003.*different values.*line 1.*0x04.*line 2.*0x99/u);
});

it("preserves partial-source facts without inventing EOF or filling gaps", () => {
  const decoded = image(INTEL_SPARSE_IMAGE.replace(":00000001FF\n", ""));
  expect(decoded.terminated).toBe(false);
  expect(decoded.regions).toHaveLength(2);
  expect(decoded.metadata.termination).toBe("absent");
  expect(decoded.limitations).toEqual([
    expect.stringMatching(/no termination record.*truncated/u),
  ]);
});

it("handles CRLF splits, lowercase, trailing blanks and maximum legal record lines", () => {
  const longest = ihex(
    0,
    0,
    Array.from({ length: 255 }, () => 0xaa),
  );
  expect(longest.length).toBe(521);
  const text = `\n${longest.toLowerCase()} \t\r\n${ihex(1, 0)}\r\n`;
  // Trailing whitespace on a maximum-length line is outside the profile's format bound.
  expect(failure(text).message).toMatch(/521/u);
  const decoded = image(
    `${longest.toLowerCase()}\r\n${ihex(1, 0)}`,
    undefined,
    { chunkBytes: 1 },
  );
  expect(decoded.metadata.data_bytes).toBe(255);
  expect(
    image(`\n${ihex(0, 0x30, [1])} \t\r\n${ihex(1, 0)}\r\n`).metadata
      .line_count,
  ).toBe(3);
});

it.each([
  ["checksum", ":04010000DEADBEEFC4\n", /line 1.*checksum.*0xc4.*0xc3/iu],
  ["odd hex", ":0000000\n", /odd number of hex digits/u],
  ["non-hex", ":00000001FG\n", /invalid character.*column 11/u],
  ["byte count", ":0200000001FD\n", /declares 2 data bytes.*line holds 1/u],
  ["fixed length", lines(ihex(4, 0, [8])), /04.*requires 2 data bytes/u],
  ["unknown type", lines(ihex(6, 0)), /unknown record type 06/u],
  [
    "reserved base address",
    lines(ihex(2, 1, [0x12, 0])),
    /requires address 0x0000/u,
  ],
  ["lone CR", ":00000001FF\r:00000001FF\n", /invalid character 0x0d/u],
  ["offset wrap", lines(ihex(0, 0xffff, [1, 2])), /wraps past 0xffff/u],
  [
    "20-bit overflow",
    lines(ihex(2, 0, [0xff, 0xff]), ihex(0, 0x20, [1])),
    /exceeds the 20-bit address/u,
  ],
  [
    "record after EOF",
    lines(ihex(1, 0), ihex(0, 0, [1])),
    /record follows the termination record/u,
  ],
  [
    "conflicting linear starts",
    lines(ihex(5, 0, [0, 0, 0, 1]), ihex(5, 0, [0, 0, 0, 2])),
    /start address.*conflicts/u,
  ],
  [
    "conflicting segment starts",
    lines(ihex(3, 0, [0, 1, 0, 2]), ihex(3, 0, [0, 1, 0, 3])),
    /start segment.*conflicts/u,
  ],
] as const)(
  "rejects Intel %s without a partial image",
  (_name, text, reason) => {
    expect(failure(text)).toMatchObject({
      kind: "format",
      message: expect.stringMatching(reason),
    });
  },
);

it("decodes S0/S1/S5/S9 facts and keeps opaque header bytes separate from text", () => {
  const decoded = image(SREC_HEADER_IMAGE, "srec");
  expect(decoded.metadata).toMatchObject({
    variant: "S19",
    header_text: "HDR",
    header_address: 0,
    header_line: 1,
    header_hex: "484452",
    declared_data_record_count: 2,
    declared_data_record_count_line: 4,
    start_address_record: "S9",
    start_address: 0,
    data_bytes: 32,
  });
  expect(decoded.regions).toMatchObject([{ start: 0, end: 31 }]);
  expect(
    image(lines(srec(0, 0, [0x48, 0, 0xff]), srec(9, 0)), "srec").metadata,
  ).toMatchObject({ header_hex: "4800ff", header_text: null });
});

it("preserves a nonzero S0 header address and source line without treating it as a data load address", () => {
  const decoded = image(
    lines(
      srec(0, 0x7fff, [0x48, 0x44, 0x52]),
      srec(1, 0x30, [0xde, 0xad]),
      srec(9, 0x30),
    ),
    "srec",
  );
  expect(decoded.metadata).toMatchObject({
    header_address: 0x7fff,
    header_line: 1,
    header_hex: "484452",
    header_text: "HDR",
    start_address: 0x30,
  });
  expect(decoded.regions).toMatchObject([
    { start: 0x30, end: 0x31, bytes: Uint8Array.of(0xde, 0xad) },
  ]);
  expect(decoded.limitations).toEqual([]);
});

it.each([
  [2, 6, 8, 0x123456, "S28"],
  [3, 6, 7, 0x89abcdef, "S37"],
] as const)(
  "decodes S%d with a count and matching termination width",
  (dataType, countType, endType, address, variant) => {
    const decoded = image(
      lines(
        srec(dataType, address, [0xde, 0xad]),
        srec(countType, 1),
        srec(endType, address),
      ),
      "srec",
    );
    expect(decoded.metadata).toMatchObject({
      variant,
      start_address: address,
      declared_data_record_count: 1,
    });
    expect(decoded.regions).toMatchObject([
      { start: address, end: address + 1, bytes: Uint8Array.of(0xde, 0xad) },
    ]);
  },
);

it("accepts later S-record data while qualifying a declaration that covered its preceding prefix", () => {
  const decoded = image(
    lines(srec(1, 0, [1]), srec(5, 1), srec(1, 1, [2]), srec(9, 0)),
    "srec",
  );
  expect(decoded.metadata).toMatchObject({
    data_record_count: 2,
    declared_data_record_count: 1,
    declared_data_record_count_line: 2,
  });
  expect(decoded.regions).toMatchObject([{ start: 0, end: 1 }]);
  expect(decoded.limitations).toEqual([
    expect.stringMatching(
      /line 2.*1 preceding data records.*does not certify.*2 data records/u,
    ),
  ]);
  const multiple = image(
    lines(srec(1, 0, [1]), srec(5, 1), srec(1, 1, [2]), srec(6, 2), srec(9, 0)),
    "srec",
  );
  expect(multiple.metadata).toMatchObject({
    declared_data_record_count: 2,
    declared_data_record_count_line: 4,
  });
  expect(multiple.limitations).toEqual([
    expect.stringMatching(/Multiple count declarations.*cumulative preceding/u),
  ]);
});

it("keeps missing termination, mixed widths and width mismatch explicit", () => {
  const decoded = image(
    lines(srec(1, 0, [1]), srec(2, 0x10000, [2]), srec(7, 0)),
    "srec",
  );
  expect(decoded.metadata.variant).toBe("mixed");
  expect(decoded.limitations).toEqual([
    expect.stringMatching(/termination S7.*S1, S2/u),
  ]);
  expect(image(lines(srec(1, 0, [1])), "srec")).toMatchObject({
    terminated: false,
    limitations: [expect.stringMatching(/no termination record/u)],
  });
});

it.each([
  [
    "count mismatch",
    lines(srec(1, 0, [1]), srec(5, 2)),
    /declares 2 data records.*1 precede/u,
  ],
  ["reserved S4", "S4030000FC\n", /reserved record type S4/u],
  [
    "second header",
    lines(srec(0, 0, [1]), srec(0, 0, [1])),
    /second S0 header/u,
  ],
  [
    "termination data",
    lines(srec(9, 0, [1])),
    /does not fit its 2-byte address and checksum/u,
  ],
  ["S1 address overflow", lines(srec(1, 0xffff, [1, 2])), /crosses 0xffff/u],
  [
    "S2 address overflow",
    lines(srec(2, 0xffffff, [1, 2])),
    /crosses 0xffffff/u,
  ],
  [
    "S3 address overflow",
    lines(srec(3, 0xffffffff, [1, 2])),
    /crosses 0xffffffff/u,
  ],
  ["checksum", "S9030000FD\n", /checksum.*0xfd.*0xfc/u],
  ["length", "S104000001\n", /byte count.*declares 4 bytes.*line holds 3/u],
] as const)("rejects S-record %s", (_name, text, reason) => {
  expect(failure(text, "srec")).toMatchObject({
    kind: "format",
    message: expect.stringMatching(reason),
  });
});

it("enforces caller-selected file and run capacities before excess allocation/admission", () => {
  expect(
    createHexRecordDecoder("intel-hex", 1024, {
      maxFileBytes: 1023,
      maxRuns: 1,
    }),
  ).toMatchObject({
    ok: false,
    error: {
      kind: "limit",
      boundary: "file-size",
      message: expect.stringContaining("max_firmware_file_bytes=1023"),
    },
  });
  const text = lines(ihex(0, 0, [1]), ihex(0, 2, [2]), ihex(1, 0));
  expect(failure(text, undefined, { capacity: { maxRuns: 1 } })).toMatchObject({
    kind: "limit",
    boundary: "capacity",
    message: expect.stringContaining("max_firmware_runs"),
  });
  expect(
    image(text, undefined, { capacity: { maxRuns: 2 } }).regions,
  ).toHaveLength(2);
  expect(
    createHexRecordDecoder("srec", 0, { maxFileBytes: -1, maxRuns: 0 }),
  ).toMatchObject({
    ok: false,
    error: { kind: "limit", boundary: "capacity" },
  });
});

it("cannot turn a refused stream into a successful image by finishing or appending after failure", () => {
  const text = ":0300300002337A1E\n:00000001FE\n";
  const created = createHexRecordDecoder("intel-hex", text.length, {
    maxFileBytes: text.length,
    maxRuns: 2,
  });
  if (!created.ok) throw Error(created.error.message);
  const failed = created.value.write(Buffer.from(text));
  if (failed.ok) throw Error("Expected checksum refusal");
  expect(created.value.finish()).toEqual(failed);
  expect(created.value.write(Buffer.from(":00000001FF\n"))).toEqual(failed);
  const valid = createHexRecordDecoder("intel-hex", 11, {
    maxFileBytes: 11,
    maxRuns: 0,
  });
  if (!valid.ok) throw Error(valid.error.message);
  const written = valid.value.write(Buffer.from(":00000001FF"));
  if (!written.ok) throw Error(written.error.message);
  const finished = valid.value.finish();
  if (!finished.ok) throw Error(finished.error.message);
  expect(valid.value.finish()).toMatchObject({
    ok: false,
    error: {
      kind: "format",
      message: expect.stringContaining("already finished"),
    },
  });
});

it("accepts the S-record line maximum and the last 32-bit Intel byte without address-span allocation", () => {
  const longest = srec(
    1,
    0,
    Array.from({ length: 252 }, () => 0xa5),
  );
  expect(longest.length).toBe(514);
  expect(
    image(longest + "\r\n", "srec", { chunkBytes: 1 }).metadata.data_bytes,
  ).toBe(252);
  expect(failure(longest + "0\n", "srec").message).toMatch(/514/u);
  const last = image(
    lines(ihex(4, 0, [0xff, 0xff]), ihex(0, 0xffff, [0x42]), ihex(1, 0)),
  );
  expect(last.regions).toMatchObject([
    { start: 0xffffffff, end: 0xffffffff, bytes: Uint8Array.of(0x42) },
  ]);
});

it.each([
  [INTEL_SPARSE_IMAGE, "intel-hex"],
  [SREC_HEADER_IMAGE, "srec"],
  [":00000001FF", "intel-hex"],
  ["\n:00000001FF\n", undefined],
  ["\ufeff:00000001FF\n", undefined],
  [":00000001FE\n", undefined],
  ["S-not firmware", undefined],
  ["", undefined],
] as const)(
  "recognizes only a checksum-valid record at byte zero (%j)",
  (text, expected) => {
    expect(detectHexRecordEncoding(Buffer.from(text))).toBe(expected);
  },
);
