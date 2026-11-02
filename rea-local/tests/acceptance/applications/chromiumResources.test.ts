import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { createHash } from "node:crypto";
import { readFile, writeFile } from "node:fs/promises";
import { join, resolve } from "node:path";
import { brotliCompressSync, gzipSync } from "node:zlib";
import { expect } from "vitest";
import { toolContract } from "../../../src/contracts/toolContracts.js";
import { chromiumResourcesSchema } from "../../../src/domain/native/chromiumResources.js";
import { chromiumDataPackFixture } from "../../../src/native/chromium/ChromiumResourcePack.fixture.js";
import { parseMcpToolError } from "../../fixtures/mcpToolError.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest, type TestCli } from "../../support/cli/cliFixture.js";

const contract = toolContract("inspect_chromium_resources");
const sha256 = (bytes: Buffer): string =>
  createHash("sha256").update(bytes).digest("hex");

type Selection = {
  readonly path: string;
  readonly offset?: number;
  readonly limit?: number;
  readonly resource_id?: number;
  readonly decode?: boolean;
  readonly max_resource_bytes?: number;
};

const parseResponse = (
  response: Awaited<ReturnType<Client["callTool"]>>,
  validate: (value: unknown) => boolean,
) => {
  expect(response.isError).not.toBe(true);
  expect(validate(response.structuredContent)).toBe(true);
  const evidence = contract.outputSchema.parse(response.structuredContent);
  const text = response.content.find(({ type }) => type === "text");
  if (text?.type !== "text") throw new Error("Missing MCP text Evidence");
  expect(JSON.parse(text.text)).toEqual(response.structuredContent);
  return {
    evidence,
    report: chromiumResourcesSchema.parse(evidence.normalized_result),
  };
};

type Inspect = (
  selection: Selection,
) => Promise<ReturnType<typeof parseResponse>>;

const expectPublicVersions = async (input: {
  readonly root: string;
  readonly cli: TestCli;
  readonly inspect: Inspect;
}) => {
  const utf16 = Buffer.from("Grüße", "utf16le");
  const v5 = chromiumDataPackFixture({
    padding: [1, 2, 3],
    trailing: Buffer.from("TAIL"),
  });
  // The final entry is a positional sentinel; its ID is preserved as evidence.
  v5.writeUInt16LE(42, 24);
  const cases = [
    {
      version: 4,
      bytes: chromiumDataPackFixture({
        version: 4,
        encoding: 2,
        resources: [
          { id: 4, bytes: utf16 },
          { id: 2, bytes: Buffer.alloc(0) },
        ],
      }),
      resourceId: 4,
      offset: 0,
      pageId: 2,
      total: 2,
      selected: utf16,
      text: "Grüße",
      encoding: "utf16le",
      alias: false,
      canonicalIndex: 1,
    },
    {
      version: 5,
      bytes: v5,
      resourceId: 10,
      offset: 1,
      pageId: 6,
      total: 3,
      selected: Buffer.from("this is id 4"),
      text: "this is id 4",
      encoding: "utf8",
      alias: true,
      canonicalIndex: 0,
    },
  ];
  for (const sample of cases) {
    const path = join(input.root, `version-${sample.version}.pak`);
    await writeFile(path, sample.bytes);
    const cli = await input.cli.run({
      arguments: [
        "inspect-chromium-resources",
        path,
        "--offset",
        String(sample.offset),
        "--limit",
        "1",
        "--resource-id",
        String(sample.resourceId),
        "--max-resource-bytes",
        "64",
        "--json",
      ],
    });
    expect(cli.exitCode).toBe(0);
    const cliEvidence = contract.outputSchema.parse(cli.json);
    const { evidence, report } = await input.inspect({
      path,
      offset: sample.offset,
      limit: 1,
      resource_id: sample.resourceId,
      max_resource_bytes: 64,
    });
    expect(evidence).toEqual(cliEvidence);
    expect(evidence).toMatchObject({
      confidence: "observed",
      subject: { digest: { sha256: sha256(sample.bytes) } },
    });
    expect(report).toMatchObject({
      artifact: {
        path,
        bytes: sample.bytes.length,
        sha256: sha256(sample.bytes),
      },
      version: sample.version,
      encoding: sample.encoding,
      canonical_resources: 2,
      alias_resources: sample.total - 2,
      page: {
        offset: sample.offset,
        limit: 1,
        returned: 1,
        total: sample.total,
        next_offset: sample.offset + 1,
      },
      coverage: { index: "complete", selected_resource: "complete" },
      resource: {
        entry: {
          resource_id: sample.resourceId,
          canonical_resource_id: 4,
          canonical_index: sample.canonicalIndex,
          alias: sample.alias,
          payload: {
            bytes: sample.selected.length,
            sha256: sha256(sample.selected),
          },
        },
        representation: "decoded",
        codec: "none",
        bytes: sample.selected.length,
        bytes_hex: sample.selected.toString("hex"),
        sha256: sha256(sample.selected),
        text_preview: sample.text,
        text_preview_truncated: false,
      },
    });
    expect(report.entries.map(({ resource_id }) => resource_id)).toEqual([
      sample.pageId,
    ]);
    if (sample.version === 4) expect(report.entries[0]?.payload.bytes).toBe(0);
    else
      expect(report.layout).toMatchObject({
        padding_hex: "010203",
        sentinel_id: 42,
        sentinel_offset: sample.bytes.length - 4,
        unclaimed_ranges: [{ offset: sample.bytes.length - 4, bytes: 4 }],
      });
    expect(await readFile(path)).toEqual(sample.bytes);
  }
};

const chromiumBrotli = (decoded: Buffer): Buffer => {
  const header = Buffer.alloc(8);
  header[0] = 0x1e;
  header[1] = 0x9b;
  header.writeUIntLE(decoded.length, 2, 6);
  return Buffer.concat([header, brotliCompressSync(decoded)]);
};

const expectCompressedSelections = async (input: {
  readonly root: string;
  readonly cli: TestCli;
  readonly inspect: Inspect;
}) => {
  const gzipText = Buffer.from("gzip roundtrip ".repeat(32));
  const brotliText = Buffer.from("Brotli roundtrip ".repeat(32));
  const gzip = gzipSync(gzipText);
  const brotli = chromiumBrotli(brotliText);
  const bytes = chromiumDataPackFixture({
    resources: [
      { id: 40, bytes: brotli },
      { id: 20, bytes: gzip },
    ],
    aliases: [{ id: 30, targetId: 20 }],
  });
  const path = join(input.root, "compressed.pak");
  await writeFile(path, bytes);
  const inventory = await input.inspect({ path });
  expect(inventory.report.resource).toBeNull();
  expect(inventory.report.coverage.selected_resource).toBe("not_requested");
  expect(
    inventory.report.entries.map(({ resource_id }) => resource_id),
  ).toEqual([20, 30, 40]);
  expect(inventory.report.entries[0]?.compression).toEqual({
    kind: "gzip-candidate",
    declared_decoded_bytes: null,
    gzip_last_member_isize: gzipText.length,
  });
  expect(inventory.report.entries[2]?.compression).toEqual({
    kind: "chromium-brotli-envelope",
    declared_decoded_bytes: brotliText.length,
    gzip_last_member_isize: null,
  });
  for (const sample of [
    { id: 30, canonical: 20, codec: "gzip", stored: gzip, decoded: gzipText },
    {
      id: 40,
      canonical: 40,
      codec: "chromium-brotli",
      stored: brotli,
      decoded: brotliText,
    },
  ]) {
    const { report } = await input.inspect({
      path,
      resource_id: sample.id,
      max_resource_bytes: 1024,
    });
    expect(report.resource).toMatchObject({
      entry: {
        resource_id: sample.id,
        canonical_resource_id: sample.canonical,
        payload: { bytes: sample.stored.length, sha256: sha256(sample.stored) },
      },
      representation: "decoded",
      codec: sample.codec,
      bytes: sample.decoded.length,
      bytes_hex: sample.decoded.toString("hex"),
      sha256: sha256(sample.decoded),
      text_preview: sample.decoded.toString(),
    });
  }
  const stored = await input.inspect({
    path,
    resource_id: 40,
    decode: false,
    max_resource_bytes: 1024,
  });
  expect(stored.report.resource).toMatchObject({
    representation: "stored",
    codec: "none",
    bytes: brotli.length,
    bytes_hex: brotli.toString("hex"),
    sha256: sha256(brotli),
  });
  const cli = await input.cli.run({
    arguments: [
      "inspect-chromium-resources",
      path,
      "--resource-id",
      "40",
      "--stored",
      "--max-resource-bytes",
      "1024",
      "--json",
    ],
  });
  expect(cli.exitCode).toBe(0);
  expect(contract.outputSchema.parse(cli.json)).toEqual(stored.evidence);
  expect(await readFile(path)).toEqual(bytes);
};

const expectRefusal = async (
  client: Client,
  arguments_: Record<string, unknown>,
  code: "invalid_request" | "resource_constraint",
) => {
  const response = await client.callTool({
    name: contract.name,
    arguments: arguments_,
  });
  expect(response.isError).toBe(true);
  expect(
    contract.outputSchema.safeParse(response.structuredContent).success,
  ).toBe(false);
  const { error } = parseMcpToolError(response);
  expect(error).toMatchObject({ code, details: { operation: contract.name } });
  await client.ping();
  return error;
};

const expectRefusalsAndRecovery = async (input: {
  readonly root: string;
  readonly client: Client;
  readonly inspect: Inspect;
}) => {
  const valid = chromiumDataPackFixture();
  const aliasBounds = Buffer.from(valid);
  aliasBounds.writeUInt16LE(2, 32);
  const duplicate = Buffer.from(valid);
  duplicate.writeUInt16LE(4, 18);
  const overlap = Buffer.from(valid);
  overlap.writeUInt32LE(12, 14);
  for (const [name, bytes] of [
    ["truncated", valid.subarray(0, 8)],
    ["alias-bounds", aliasBounds],
    ["duplicate-id", duplicate],
    ["metadata-overlap", overlap],
  ] as const) {
    const path = join(input.root, `${name}.pak`);
    await writeFile(path, bytes);
    const error = await expectRefusal(
      input.client,
      { path, limit: 1 },
      "invalid_request",
    );
    expect(error).toMatchObject({
      category: "invalid_input",
      details: { issues: [{ path: ["path"] }] },
    });
  }

  const expanded = Buffer.alloc(4096, 65);
  for (const [name, compressed] of [
    ["gzip-budget", gzipSync(expanded)],
    ["brotli-budget", chromiumBrotli(expanded)],
  ] as const) {
    expect(compressed.length).toBeLessThan(64);
    const path = join(input.root, `${name}.pak`);
    await writeFile(
      path,
      chromiumDataPackFixture({ resources: [{ id: 1, bytes: compressed }] }),
    );
    await input.inspect({ path, max_resource_bytes: 64 });
    const error = await expectRefusal(
      input.client,
      { path, resource_id: 1, max_resource_bytes: 64 },
      "resource_constraint",
    );
    expect(error).toMatchObject({
      category: "resource_constraint",
      details: {
        resource: "memory",
        reported_limits: { max_resource_bytes: 64 },
      },
    });
    expect(error.remediation.action).toContain("max_resource_bytes");
  }

  const malformedPath = join(input.root, "bad-gzip.pak");
  const wrongSize = chromiumBrotli(Buffer.from("known"));
  wrongSize.writeUIntLE(6, 2, 6);
  for (const [name, payload] of [
    ["brotli-wrong-size", wrongSize],
    [
      "brotli-trailing",
      Buffer.concat([chromiumBrotli(Buffer.from("known")), Buffer.from([1])]),
    ],
  ] as const) {
    const path = join(input.root, `${name}.pak`);
    await writeFile(
      path,
      chromiumDataPackFixture({ resources: [{ id: 1, bytes: payload }] }),
    );
    await expectRefusal(
      input.client,
      { path, resource_id: 1 },
      "invalid_request",
    );
  }
  const marker = Buffer.from([0x1f, 0x8b]);
  await writeFile(
    malformedPath,
    chromiumDataPackFixture({ resources: [{ id: 1, bytes: marker }] }),
  );
  const raw = await input.inspect({
    path: malformedPath,
    resource_id: 1,
    decode: false,
  });
  expect(raw.report.resource).toMatchObject({
    bytes_hex: "1f8b",
    representation: "stored",
    codec: "none",
  });
  await expectRefusal(
    input.client,
    { path: malformedPath, resource_id: 1 },
    "invalid_request",
  );

  const recoveryPath = join(input.root, "recovery.pak");
  await writeFile(recoveryPath, valid);
  const absent = await expectRefusal(
    input.client,
    { path: recoveryPath, resource_id: 65535 },
    "invalid_request",
  );
  expect(absent).toMatchObject({
    details: { issues: [{ path: ["resource_id"], reason: "invalid_value" }] },
  });
  const schemaRejected = await input.client.callTool({
    name: contract.name,
    arguments: { path: recoveryPath, extra: true },
  });
  expect(schemaRejected.isError).toBe(true);
  // SDK input validation precedes the handler and may return plain text.
  expect(
    schemaRejected.content.some(
      (block) => block.type === "text" && block.text.includes("extra"),
    ),
  ).toBe(true);
  const recovered = await input.inspect({
    path: recoveryPath,
    resource_id: 10,
  });
  expect(recovered.report.resource).toMatchObject({
    entry: { resource_id: 10, canonical_resource_id: 4, alias: true },
    text_preview: "this is id 4",
  });
  expect(await readFile(recoveryPath)).toEqual(valid);
};

cliTest(
  "inspects Chromium packs through compiled CLI and real stdio MCP with bounded decoding and recovery",
  async ({ cli }) => {
    const root = await createTestTempDirectory(
      "rea-chromium-resource-acceptance-",
    );
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [resolve("scripts/rea.mjs"), "mcp"],
      cwd: process.cwd(),
      env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
      stderr: "pipe",
    });
    const client = new Client({
      name: "chromium-resource-acceptance",
      version: "1",
    });
    try {
      await client.connect(transport);
      const advertised = (await client.listTools()).tools.find(
        ({ name }) => name === contract.name,
      );
      if (advertised?.outputSchema === undefined)
        throw new Error(
          "Chromium resources must advertise input and output schemas",
        );
      const ajv = new Ajv2020({ strict: false, validateFormats: false });
      const outputSchema: Record<string, unknown> = advertised.outputSchema;
      expect(ajv.validateSchema(advertised.inputSchema)).toBe(true);
      expect(ajv.validateSchema(outputSchema)).toBe(true);
      const validateInput = ajv.compile(advertised.inputSchema);
      const validateOutput = ajv.compile(outputSchema);
      expect(
        validateInput({
          path: join(root, "sample.pak"),
          resource_id: 10,
          decode: false,
        }),
      ).toBe(true);
      expect(
        validateInput({ path: join(root, "sample.pak"), extra: true }),
      ).toBe(false);
      expect(
        validateInput({ path: join(root, "sample.pak"), resource_id: 65536 }),
      ).toBe(false);
      const session = await client.callTool({
        name: "binary_session",
        arguments: {},
      });
      expect(session.structuredContent).toMatchObject({
        result: {
          open: false,
          tool_availability: expect.arrayContaining([
            expect.objectContaining({
              name: contract.name,
              available: true,
              reason: "available",
            }),
          ]),
        },
      });
      const inspect: Inspect = async (selection) =>
        parseResponse(
          await client.callTool({ name: contract.name, arguments: selection }),
          validateOutput,
        );
      await expectPublicVersions({ root, cli, inspect });
      await expectCompressedSelections({ root, cli, inspect });
      await expectRefusalsAndRecovery({ root, client, inspect });
    } finally {
      try {
        await client.close();
      } finally {
        await transport.close();
      }
    }
  },
  60_000,
);
