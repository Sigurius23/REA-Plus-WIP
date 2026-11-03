import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { createHash } from "node:crypto";
import { readFile, writeFile } from "node:fs/promises";
import { join, resolve } from "node:path";
import { brotliCompressSync, gzipSync } from "node:zlib";
import { expect } from "vitest";
import { toolContract } from "../../../src/contracts/toolContracts.js";
import {
  chromiumResourceSearchSchema,
  type SearchChromiumResourcesInput,
  type ChromiumResourceSearch,
} from "../../../src/domain/native/chromiumResourceSearch.js";
import { chromiumDataPackFixture } from "../../../src/native/chromium/ChromiumResourcePack.fixture.js";
import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest, type TestCli } from "../../support/cli/cliFixture.js";

const contract = toolContract("search_chromium_resources");
const hash = (bytes: Buffer) =>
  createHash("sha256").update(bytes).digest("hex");
const brotli = (bytes: Buffer) => {
  const header = Buffer.alloc(8);
  header[0] = 0x1e;
  header[1] = 0x9b;
  header.writeUIntLE(bytes.length, 2, 6);
  return Buffer.concat([header, brotliCompressSync(bytes)]);
};
type Selection = Pick<SearchChromiumResourcesInput, "path" | "query"> &
  Partial<SearchChromiumResourcesInput>;

type Search = (
  selection: Selection,
  parity?: boolean,
) => Promise<ChromiumResourceSearch>;
type Fixture = {
  path: string;
  query: string;
  bytes: Buffer;
  all: ChromiumResourceSearch;
};

const publicSearch =
  (
    client: Client,
    cli: TestCli,
    inputValid: (value: unknown) => boolean,
    outputValid: (value: unknown) => boolean,
  ): Search =>
  async (selection, parity = false) => {
    expect(inputValid(selection)).toBe(true);
    const response = await client.callTool({
      name: contract.name,
      arguments: selection,
    });
    expect(response.isError).not.toBe(true);
    expect(outputValid(response.structuredContent)).toBe(true);
    const evidence = contract.outputSchema.parse(response.structuredContent);
    const text = response.content.find((block) => block.type === "text");
    if (text?.type !== "text") throw new Error("Missing MCP text Evidence");
    expect(JSON.parse(text.text)).toEqual(evidence);
    if (parity) {
      const flags = Object.entries(selection).flatMap(([key, value]) =>
        key === "path" || value === undefined
          ? []
          : ["--" + key.replaceAll("_", "-"), String(value)],
      );
      const result = await cli.run({
        arguments: [
          "search-chromium-resources",
          selection.path,
          ...flags,
          "--json",
        ],
      });
      expect(result.exitCode).toBe(0);
      expect(contract.outputSchema.parse(result.json)).toEqual(evidence);
    }
    return chromiumResourceSearchSchema.parse(evidence.normalized_result);
  };

const reject = async (
  client: Client,
  selection: Record<string, unknown>,
  field: string,
) => {
  const response = await client.callTool({
    name: contract.name,
    arguments: selection,
  });
  expect(
    contract.outputSchema.safeParse(response.structuredContent).success,
  ).toBe(false);
  const { error } = parseMcpToolError(response);
  expect(error).toMatchObject({
    code: "invalid_request",
    details: {
      operation: contract.name,
      issues: [expect.objectContaining({ path: [field] })],
    },
  });
  await client.ping();
};

const expectCandidates = async (root: string, search: Search) => {
  const query = "gdocs_script.js";
  const plain = Buffer.from(`{"script":"${query}"}`);
  const gzipBody = Buffer.from(`prefix ${query} ${query}`);
  const brotliBody = Buffer.from(query);
  const binary = Buffer.concat([
    Buffer.from([0xff, 0]),
    Buffer.from(query),
    Buffer.from([0xff]),
  ]);
  const payloads = [
    plain,
    gzipSync(gzipBody),
    brotli(brotliBody),
    binary,
    Buffer.from("gdocs_scriptXjs GDOCS_SCRIPT.JS"),
  ];
  const bytes = chromiumDataPackFixture({
    encoding: 0,
    resources: [7, 42, 43, 91, 100].map((id, index) => ({
      id,
      bytes: payloads[index]!,
    })),
    aliases: [{ id: 4242, targetId: 42 }],
  });
  const path = join(root, "helpers.pak");
  await writeFile(path, bytes);
  const all = await search({ path, query, max_resource_bytes: 128 }, true);
  expect(all.artifact).toEqual({
    path,
    bytes: bytes.length,
    sha256: hash(bytes),
  });
  expect(all.query).toEqual({
    literal: query,
    encoding: "utf8",
    bytes: query.length,
    sha256: hash(Buffer.from(query)),
  });
  expect(
    all.matches.map((match) => [
      match.entry.resource_id,
      match.codec,
      match.byte_range.offset,
    ]),
  ).toEqual([
    [7, "none", 11],
    [42, "gzip", 7],
    [43, "chromium-brotli", 0],
    [91, "none", 2],
  ]);
  expect(all.matches[1]?.identities).toEqual([
    { resource_id: 42, table_location: { offset: 18, bytes: 6 } },
    { resource_id: 4242, table_location: { offset: 48, bytes: 4 } },
  ]);
  expect(all.matches[3]?.text).toBeNull();
  expect(all.coverage).toEqual({
    index: "complete",
    window: "complete",
    pack: "complete",
  });
  expect(all.page).toMatchObject({
    examined: 5,
    decoded: 5,
    next_canonical_offset: null,
    stop_reason: "end",
  });
  for (const [index, body] of [plain, gzipBody, brotliBody, binary].entries()) {
    const match = all.matches[index]!;
    expect(match.decoded_bytes).toBe(body.length);
    expect(match.decoded_sha256).toBe(hash(body));
    expect(
      bytes.subarray(
        match.entry.payload.offset,
        match.entry.payload.offset + match.entry.payload.bytes,
      ),
    ).toEqual(payloads[index]);
    expect(match.entry.payload.sha256).toBe(hash(payloads[index]!));
  }

  return { path, query, bytes, all };
};
const expectPaging = async ({ path, query, all }: Fixture, search: Search) => {
  const first = await search({ path, query, match_limit: 1 });
  expect(first.page).toMatchObject({
    examined: 1,
    next_canonical_offset: 1,
    stop_reason: "match_limit",
  });
  expect(first.coverage.pack).toBe("partial");
  expect(first.coverage.window).toBe("partial");
  const second = await search(
    {
      path,
      query,
      canonical_offset: 1,
      scan_limit: 1,
      expected_sha256: all.artifact.sha256,
    },
    true,
  );
  expect(second.matches.map((match) => match.entry.resource_id)).toEqual([42]);
  expect(second.page).toMatchObject({
    examined: 1,
    next_canonical_offset: 2,
    stop_reason: "scan_limit",
  });
  const tail = await search({
    path,
    query,
    canonical_offset: 2,
    expected_sha256: all.artifact.sha256,
  });
  expect(tail.matches.map((match) => match.entry.resource_id)).toEqual([
    43, 91,
  ]);
  expect(tail.page.next_canonical_offset).toBeNull();
  expect(tail.coverage.pack).toBe("partial");
  const blocked = await search(
    {
      path,
      query,
      canonical_offset: 1,
      max_resource_bytes: 128,
      max_total_decoded_bytes: 127,
    },
    true,
  );
  expect(blocked.page).toMatchObject({
    examined: 0,
    decoded: 0,
    next_canonical_offset: 1,
    stop_reason: "decoded_budget",
  });
  expect(blocked.budgets.charged_decoded_bytes).toBe(0);
  expect(blocked.coverage).toMatchObject({
    window: "partial",
    pack: "partial",
  });
  const admitted = await search({
    path,
    query,
    canonical_offset: 1,
    scan_limit: 1,
    max_resource_bytes: 128,
    max_total_decoded_bytes: 128,
  });
  expect(admitted.matches[0]?.entry.resource_id).toBe(42);
  expect(admitted.page.next_canonical_offset).toBe(2);
};
const expectText = async (root: string, query: string, search: Search) => {
  const utf16Path = join(root, "utf16.pak");
  await writeFile(
    utf16Path,
    chromiumDataPackFixture({
      version: 4,
      encoding: 2,
      resources: [
        { id: 1, bytes: Buffer.from(`\ufeff😀${query}`, "utf16le") },
        {
          id: 2,
          bytes: Buffer.concat([
            Buffer.from([0]),
            Buffer.from(query, "utf16le"),
          ]),
        },
      ],
    }),
  );
  const utf16 = await search(
    { path: utf16Path, query, query_encoding: "utf16le" },
    true,
  );
  expect(utf16.version).toBe(4);
  expect(utf16.matches[0]).toMatchObject({
    byte_range: { offset: 6, bytes: query.length * 2 },
    text: {
      utf16_offset: 3,
      utf16_length: query.length,
      preview: `\ufeff😀${query}`,
    },
  });
  expect(utf16.matches[1]).toMatchObject({
    byte_range: { offset: 1, bytes: query.length * 2 },
    text: null,
  });
};
const expectPartial = async (root: string, query: string, search: Search) => {
  const brokenPath = join(root, "partial.pak");
  await writeFile(
    brokenPath,
    chromiumDataPackFixture({
      resources: [
        { id: 1, bytes: gzipSync(Buffer.alloc(10000, 65)) },
        { id: 2, bytes: Buffer.from([0x1f, 0x8b]) },
        { id: 3, bytes: Buffer.from(query) },
        { id: 4, bytes: Buffer.alloc(129) },
      ],
    }),
  );
  const partial = await search(
    {
      path: brokenPath,
      query,
      max_resource_bytes: 128,
      max_total_decoded_bytes: 512,
    },
    true,
  );
  expect(partial.matches.map((match) => match.entry.resource_id)).toEqual([3]);
  expect(
    partial.skipped.map((skip) => [skip.entry.resource_id, skip.reason]),
  ).toEqual([
    [1, "resource_budget"],
    [2, "decode_failed"],
    [4, "resource_budget"],
  ]);
  expect(partial.budgets).toMatchObject({
    observed_decoded_bytes: query.length,
    charged_decoded_bytes: 256 + query.length,
  });
  expect(partial.page).toMatchObject({
    examined: 4,
    decoded: 1,
    next_canonical_offset: null,
  });
  expect(partial.coverage).toEqual({
    index: "complete",
    window: "partial",
    pack: "partial",
  });
};
const expectRefusals = async (
  root: string,
  { path, query, bytes, all }: Fixture,
  search: Search,
  client: Client,
) => {
  expect(await readFile(path)).toEqual(bytes);
  const changed = Buffer.from(bytes);
  changed[changed.length - 1] = 0;
  await writeFile(path, changed);
  await reject(
    client,
    {
      path,
      query,
      canonical_offset: 1,
      expected_sha256: all.artifact.sha256,
    },
    "expected_sha256",
  );
  await writeFile(path, bytes);
  const badIndex = Buffer.from(bytes);
  badIndex.writeUInt16LE(7, 18);
  const invalidPath = join(root, "invalid.pak");
  await writeFile(invalidPath, badIndex);
  await reject(client, { path: invalidPath, query }, "path");
  // SDK input refinement runs before the handler and returns plain text.
  const malformedQuery = await client.callTool({
    name: contract.name,
    arguments: { path, query: "\ud800" },
  });
  expect(malformedQuery.isError).toBe(true);
  expect(
    malformedQuery.content.some(
      (block) => block.type === "text" && block.text.includes("query"),
    ),
  ).toBe(true);
  const recovered = await search({
    path,
    query,
    expected_sha256: all.artifact.sha256,
  });
  expect(recovered.matches.map((match) => match.entry.resource_id)).toEqual([
    7, 42, 43, 91,
  ]);
  expect(await readFile(path)).toEqual(bytes);
};

cliTest(
  "discovers decoded pack candidates through real MCP and identical CLI Evidence, preserving bounded resumable coverage",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-resource-search-public-");
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [resolve("scripts/rea.mjs"), "mcp"],
      cwd: process.cwd(),
      env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
      stderr: "pipe",
    });
    const client = new Client({
      name: "resource-search-acceptance",
      version: "1",
    });
    try {
      await client.connect(transport);
      const advertised = (await client.listTools()).tools.find(
        ({ name }) => name === contract.name,
      );
      if (advertised?.outputSchema === undefined)
        throw new Error("Resource search must advertise both schemas");
      const ajv = new Ajv2020({ strict: false, validateFormats: false });
      const outputSchema: Record<string, unknown> = advertised.outputSchema;
      expect(ajv.validateSchema(advertised.inputSchema)).toBe(true);
      expect(ajv.validateSchema(outputSchema)).toBe(true);
      const inputValid = ajv.compile(advertised.inputSchema);
      const outputValid = ajv.compile(outputSchema);
      expect(inputValid({ path: join(root, "pack.pak"), query: "x" })).toBe(
        true,
      );
      for (const input of [
        { path: join(root, "pack.pak"), query: "" },
        { path: join(root, "pack.pak"), query: "x", scan_limit: 1025 },
        { path: join(root, "pack.pak"), query: "x", query_encoding: "ascii" },
        { path: join(root, "pack.pak"), query: "x", regex: true },
      ])
        expect(inputValid(input)).toBe(false);
      const session = await client.callTool({
        name: "binary_session",
        arguments: {},
      });
      expect(session.structuredContent).toMatchObject({
        result: {
          open: false,
          tool_availability: expect.arrayContaining([
            expect.objectContaining({ name: contract.name, available: true }),
          ]),
        },
      });

      const search = publicSearch(client, cli, inputValid, outputValid);
      const fixture = await expectCandidates(root, search);
      await expectPaging(fixture, search);
      await expectText(root, fixture.query, search);
      await expectPartial(root, fixture.query, search);
      await expectRefusals(root, fixture, search, client);
    } finally {
      try {
        await client.close();
      } finally {
        await transport.close();
      }
    }
  },
  90_000,
);
