import { createHash } from "node:crypto";
import { writeFile } from "node:fs/promises";
import { join } from "node:path";
import { brotliCompressSync, gzipSync } from "node:zlib";
import { describe, expect, it } from "vitest";
import { createChromiumResourceSearchService } from "../../../src/composition/binaryDiagnostics.js";
import { chromiumResourceSearchSchema } from "../../../src/domain/native/chromiumResourceSearch.js";
import { chromiumDataPackFixture } from "../../../src/native/chromium/ChromiumResourcePack.fixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";

const brotli = (bytes: Buffer) => {
  const header = Buffer.alloc(8);
  header[0] = 0x1e;
  header[1] = 0x9b;
  header.writeUIntLE(bytes.length, 2, 6);
  return Buffer.concat([header, brotliCompressSync(bytes)]);
};
const materialize = async (
  resources: { id: number; bytes: Buffer }[],
  encoding: 0 | 1 | 2 = 1,
) => {
  const path = join(
    await createTestTempDirectory("rea-resource-search-"),
    "resources.pak",
  );
  await writeFile(
    path,
    chromiumDataPackFixture({
      encoding,
      resources,
      aliases: [{ id: 99, targetId: resources[0]!.id }],
    }),
  );
  return path;
};
const search = async (input: object) => {
  const result = await createChromiumResourceSearchService().search(input);
  if (!result.ok) throw result.error;
  return chromiumResourceSearchSchema.parse(result.value.normalized_result);
};

describe("decoded Chromium resource search boundary", () => {
  it("finds gzip, Brotli and binary candidates once per canonical resource with original aliases", async () => {
    const path = await materialize(
      [
        { id: 1, bytes: gzipSync(Buffer.from("prefix content.js content.js")) },
        { id: 2, bytes: brotli(Buffer.from("content.js")) },
        {
          id: 3,
          bytes: Buffer.concat([
            Buffer.from([0xff]),
            Buffer.from("content.js"),
          ]),
        },
      ],
      0,
    );
    const r = await search({
      path,
      query: "content.js",
      max_resource_bytes: 128,
    });
    expect(
      r.matches.map((m) => [m.entry.resource_id, m.codec, m.byte_range.offset]),
    ).toEqual([
      [1, "gzip", 7],
      [2, "chromium-brotli", 0],
      [3, "none", 1],
    ]);
    expect(r.matches[0]?.identities.map((i) => i.resource_id)).toEqual([1, 99]);
    expect(r.matches[2]?.text).toBeNull();
    expect(r.coverage.pack).toBe("complete");
    expect(r.page).toMatchObject({
      examined: 3,
      decoded: 3,
      next_canonical_offset: null,
    });
  });

  it("preserves UTF16 BOM/astral offsets and rejects unaligned text proof while retaining byte matches", async () => {
    const path = await materialize(
      [
        { id: 1, bytes: Buffer.from("\ufeff😀content.js", "utf16le") },
        {
          id: 2,
          bytes: Buffer.concat([
            Buffer.from([0]),
            Buffer.from("content.js", "utf16le"),
          ]),
        },
      ],
      2,
    );
    const r = await search({
      path,
      query: "content.js",
      query_encoding: "utf16le",
    });
    expect(r.matches[0]).toMatchObject({
      byte_range: { offset: 6, bytes: 20 },
      text: { utf16_offset: 3, utf16_length: 10 },
    });
    expect(r.matches[1]).toMatchObject({
      byte_range: { offset: 1 },
      text: null,
    });
  });

  it("resumes canonical windows and match limits without skipping a resource", async () => {
    const path = await materialize(
      [1, 2, 3].map((id) => ({ id, bytes: Buffer.from("hit") })),
    );
    const first = await search({ path, query: "hit", match_limit: 1 });
    expect(first.page).toMatchObject({
      examined: 1,
      next_canonical_offset: 1,
      stop_reason: "match_limit",
    });
    const next = await search({
      path,
      query: "hit",
      canonical_offset: 1,
      scan_limit: 1,
      expected_sha256: first.artifact.sha256,
    });
    expect(next.matches[0]?.entry.resource_id).toBe(2);
    expect(next.page).toMatchObject({
      next_canonical_offset: 2,
      stop_reason: "scan_limit",
    });
    expect(next.coverage.pack).toBe("partial");
    const stale = await createChromiumResourceSearchService().search({
      path,
      query: "hit",
      expected_sha256: "0".repeat(64),
    });
    if (stale.ok) throw new Error("Expected stale identity rejection");
    expect(stale.error._tag).toBe("AnalysisInputError");
  });
});

describe("Chromium literal match preview provenance", () => {
  it("keeps both preview edges on whole characters without changing exact match ranges or payload hashes", async () => {
    const prefix = "😀" + "b".repeat(127);
    const body = prefix + "hit" + "c".repeat(380) + "😀tail";
    for (const encoding of ["utf8", "utf16le"] as const) {
      const bytes = Buffer.from(body, encoding);
      const path = await materialize(
        [{ id: 1, bytes }],
        encoding === "utf8" ? 1 : 2,
      );
      const r = await search({ path, query: "hit", query_encoding: encoding });
      expect(r.matches).toHaveLength(1);
      expect(r.matches[0]).toMatchObject({
        decoded_bytes: bytes.length,
        decoded_sha256: createHash("sha256").update(bytes).digest("hex"),
        byte_range: {
          offset: Buffer.byteLength(prefix, encoding),
          bytes: Buffer.byteLength("hit", encoding),
        },
        text: {
          encoding,
          utf16_offset: 129,
          utf16_length: 3,
          preview: "b".repeat(127) + "hit" + "c".repeat(380),
        },
      });
      expect(r.matches[0]?.text?.preview.length).toBe(510);
    }
  });
});

describe("Chromium resource search budget and input boundaries", () => {
  it("keeps aggregate-blocked cursors unchanged and reports codec failures and per-entry omissions", async () => {
    const path = await materialize([
      { id: 1, bytes: gzipSync(Buffer.from("hit")) },
      { id: 2, bytes: Buffer.from([0x1f, 0x8b, 0, 0]) },
      { id: 3, bytes: Buffer.alloc(129) },
    ]);
    const blocked = await search({
      path,
      query: "hit",
      max_resource_bytes: 128,
      max_total_decoded_bytes: 127,
    });
    expect(blocked.page).toMatchObject({
      examined: 0,
      next_canonical_offset: 0,
      stop_reason: "decoded_budget",
    });
    const r = await search({
      path,
      query: "hit",
      max_resource_bytes: 128,
      max_total_decoded_bytes: 256,
    });
    expect(r.matches).toHaveLength(1);
    expect(r.skipped.map((s) => s.reason)).toEqual([
      "decode_failed",
      "resource_budget",
    ]);
    expect(r.budgets).toMatchObject({
      observed_decoded_bytes: 3,
      charged_decoded_bytes: 131,
    });
    expect(r.coverage).toMatchObject({ window: "partial", pack: "partial" });
  });

  it("bounds decompression before output allocation and charges failed expansion", async () => {
    const path = await materialize([
      { id: 1, bytes: gzipSync(Buffer.alloc(10000, 65)) },
    ]);
    const r = await search({
      path,
      query: "A",
      max_resource_bytes: 128,
      max_total_decoded_bytes: 128,
    });
    expect(r.matches).toEqual([]);
    expect(r.skipped[0]?.reason).toBe("resource_budget");
    expect(r.budgets).toMatchObject({
      observed_decoded_bytes: 0,
      charged_decoded_bytes: 128,
    });
  });

  it("retains literal case and rejects malformed query, files and cancellation through typed results", async () => {
    const path = await materialize([
      { id: 1, bytes: Buffer.from("Content.js") },
    ]);
    expect((await search({ path, query: "content.js" })).matches).toEqual([]);
    for (const input of [
      { path, query: "" },
      { path, query: "\ud800" },
      { path, query: "x", scan_limit: 1025 },
      { path: "/absent/resources.pak", query: "x" },
    ]) {
      const result = await createChromiumResourceSearchService().search(input);
      if (result.ok) throw new Error("Expected invalid input");
      expect(result.error._tag).toBe("AnalysisInputError");
    }
    const result = await createChromiumResourceSearchService().search(
      { path, query: "x" },
      { signal: AbortSignal.abort() },
    );
    if (result.ok) throw new Error("Expected cancellation");
    expect(result.error._tag).toBe("AnalysisCancelledError");
  });
});
