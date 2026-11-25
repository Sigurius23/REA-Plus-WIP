import { expect, it } from "vitest";
import { z } from "zod";
import {
  bytePatternFields,
  byteSearchResultSchema,
  compileBytePattern,
  validateBytePattern,
} from "./bytePattern.js";
const input = z
  .strictObject(bytePatternFields)
  .superRefine(validateBytePattern);
it("compiles whole-byte wildcards and bit masks without changing caller input", () => {
  const requested = { pattern: "A1\t?? bF", mask: "F0 ff 0F" };
  expect(input.parse(requested)).toEqual(requested);
  expect(compileBytePattern(requested)).toEqual({
    pattern: "a0000f",
    mask: "f0000f",
  });
  expect(compileBytePattern({ pattern: "a1", mask: "f0" })).toEqual(
    compileBytePattern({ pattern: "af", mask: "f0" }),
  );
  expect(compileBytePattern({ pattern: "00" })).toEqual({
    pattern: "00",
    mask: "ff",
  });
});
it("rejects malformed pairs, pair-internal whitespace, length mismatches and unconstrained queries", () => {
  for (const [pattern, mask] of [
    ["", undefined],
    ["4", undefined],
    ["4?", undefined],
    ["4 8", undefined],
    [" aa", undefined],
    ["aa ", undefined],
    ["aa", "??"],
    ["aaaa", "ff"],
    ["??", undefined],
    ["aa ??", "00 ff"],
    ["aa", "00"],
  ]) {
    expect(input.safeParse({ pattern, mask }).success).toBe(false);
  }
  const long = "aa".repeat(20000);
  expect(input.parse({ pattern: long }).pattern).toBe(long);
});
const page = () => ({
  matches: [
    {
      address: "space%20one:0x10",
      segment: "chosen",
      file_offset: null,
      procedure: null,
    },
  ],
  searched: {
    blocks: [
      {
        segment: "chosen",
        start: "space%20one:0x10",
        end: "space%20one:0x1f",
        bytes: 16,
      },
    ],
    bytes: 16,
    skipped_uninitialized: [],
    skipped_not_loaded: [],
    skipped_overlays: [],
  },
  complete: true,
  next_cursor: null,
});
it("validates inclusive address-space coverage and explicit continuation before accepting observations", () => {
  expect(byteSearchResultSchema.parse(page()).searched.bytes).toBe(16);
  const cases = [page(), page(), page(), page(), page()];
  cases[0]!.matches[0]!.address = "space%20two:0x10";
  cases[1]!.searched.blocks[0]!.bytes = 15;
  cases[2]!.searched.bytes = 15;
  cases[3]!.complete = false;
  cases[4]!.matches[0]!.segment = "unrelated";
  for (const candidate of cases)
    expect(byteSearchResultSchema.safeParse(candidate).success).toBe(false);
});
