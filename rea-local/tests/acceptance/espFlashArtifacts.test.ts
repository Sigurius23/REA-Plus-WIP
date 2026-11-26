import { uimageFile } from "../../src/domain/firmware/uimage.fixture.js";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { createHash } from "node:crypto";
import { readFile, writeFile, rm } from "node:fs/promises";
import { join, resolve } from "node:path";
import { expect, onTestFinished } from "vitest";
import { cliTest } from "../support/cli/cliFixture.js";
import { createTestTempDirectory } from "../fixtures/temporaryDirectory.js";
import { parseMcpToolError } from "../fixtures/mcpToolError.js";
import { parseEvidence } from "../../src/domain/evidence.js";
import { artifactInspectionResultSchema } from "../../src/domain/artifactInspection.js";
import {
  artifactInventoryResultSchema,
  artifactExtractionResultSchema,
} from "../../src/domain/artifactGraph.js";
import {
  jsonObjectSchema,
  type JsonValue,
} from "../../src/domain/jsonValue.js";
import {
  espFlashDump,
  partitionTable,
  otaData,
  otaRecord,
  TWO_OTA_PARTITIONS,
} from "../../src/domain/firmware/espFlash.fixture.js";
import {
  espImage,
  ESP32C3_APP_SEGMENTS,
  ESP32C3_BOOTLOADER_SEGMENTS,
} from "../../src/domain/firmware/espImage.fixture.js";
const sha = (bytes: Uint8Array) =>
  createHash("sha256").update(bytes).digest("hex");
const dump = (corrupt = false) =>
  espFlashDump({
    bootloader: {
      at: 0,
      bytes: espImage({ segments: ESP32C3_BOOTLOADER_SEGMENTS }),
    },
    table: partitionTable(TWO_OTA_PARTITIONS, {
      md5: corrupt ? "corrupt" : "valid",
    }),
    parts: [
      {
        at: 0xd000,
        bytes: otaData(
          otaRecord({ seq: 1, state: 2 }),
          otaRecord({ seq: 2, state: 2 }),
        ),
      },
      ...[0x10000, 0x20000, 0x30000].map((at) => ({
        at,
        bytes: espImage({ segments: ESP32C3_APP_SEGMENTS }),
      })),
    ],
  });
async function client() {
  const transport = new StdioClientTransport({
      command: process.execPath,
      args: [resolve("scripts/rea.mjs"), "mcp"],
      cwd: process.cwd(),
      env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
      stderr: "pipe",
    }),
    c = new Client({ name: "esp-flash-qualification", version: "1" });
  await c.connect(transport);
  onTestFinished(async () => {
    try {
      await c.close();
    } finally {
      await transport.close();
    }
  });
  const catalog = (await c.listTools()).tools;
  const call = (name: string, args: Record<string, JsonValue> = {}) =>
    c.callTool({ name, arguments: args });
  const evidence = async (
    name: string,
    args: Record<string, JsonValue> = {},
  ) => {
    const r = await call(name, args);
    if (r.isError) throw Error(JSON.stringify(parseMcpToolError(r)));
    const tool = catalog.find((t) => t.name === name)!,
      ajv = new Ajv2020({ strict: false, validateFormats: false });
    expect(ajv.validateSchema(tool.inputSchema)).toBe(true);
    expect(
      ajv.compile(jsonObjectSchema.parse(tool.outputSchema))(
        r.structuredContent,
      ),
    ).toBe(true);
    return parseEvidence(r.structuredContent);
  };
  return { call, evidence };
}
const inventory = (e: ReturnType<typeof parseEvidence>) =>
  artifactInventoryResultSchema.parse(
    artifactInspectionResultSchema.parse(e.normalized_result).substeps[0]!
      .evidence.normalized_result,
  );
cliTest(
  "preserves explicit flash origin, layout/OTA facts, stored extraction and complete CLI/MCP Evidence",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-flash-public-"),
      path = join(root, "dump.bin"),
      bytes = dump();
    await writeFile(path, bytes);
    const c = await client();
    const opened = await c.call("open_binary", {
      path,
      format: "esp-flash-image",
    });
    expect(opened.isError).not.toBe(true);
    const e = await c.evidence("inspect_artifact"),
      graph = inventory(e),
      meta = graph.occurrences.find(
        (o) => o.logical_path === ".",
      )?.format_metadata;
    expect(e.subject?.esp_flash_selection).toEqual({});
    expect(graph.manifest.root_format).toBe("esp-flash-image");
    expect(graph.manifest.root_sha256).toBe(sha(bytes));
    expect(meta).toMatchObject({
      kind: "esp-flash-image",
      flash_offset: { source: "default", value: 0 },
      boot_selection: {
        basis: "otadata",
        active_record: 1,
        partition_index: 5,
        running_partition: "unknown",
      },
    });
    const run = await cli.run({
      arguments: [
        "inspect-artifact",
        path,
        "--target-format",
        "esp-flash-image",
        "--json",
      ],
    });
    expect(run.exitCode, run.stderr).toBe(0);
    expect(parseEvidence(run.json)).toEqual(e);
    const result = artifactExtractionResultSchema.parse(
      (await c.evidence("extract_artifact")).normalized_result,
    );
    onTestFinished(() =>
      rm(result.output_root, { recursive: true, force: true }),
    );
    expect(result.artifacts).toHaveLength(8);
    for (const a of result.artifacts) {
      const b = await readFile(join(result.output_root, a.relative_path)),
        occ = graph.occurrences.find(
          (o) => o.logical_path === a.relative_path,
        )!;
      expect(sha(b)).toBe(a.sha256);
      expect(b).toEqual(
        bytes.subarray(
          occ.source_location!.offset,
          occ.source_location!.offset + occ.source_location!.length,
        ),
      );
    }
    await c.call("open_binary", {
      path,
      format: "esp-flash-image",
      flash_offset: "0x00000000",
      partition_table_offset: "0x8000",
    });
    const selected = await c.evidence("inspect_artifact");
    expect(selected.subject?.esp_flash_selection).toEqual({
      flash_offset: "0x00000000",
      partition_table_offset: "0x8000",
    });
    expect(selected.evidence_id).not.toBe(e.evidence_id);
    expect(
      inventory(selected).occurrences.find((o) => o.logical_path === ".")
        ?.format_metadata,
    ).toMatchObject({
      flash_offset: { source: "caller" },
      partition_table: { method: "caller" },
    });
    const selectedCli = await cli.run({
      arguments: [
        "inspect-artifact",
        path,
        "--target-format",
        "esp-flash-image",
        "--flash-offset",
        "0x00000000",
        "--partition-table-offset",
        "0x8000",
        "--json",
      ],
    });
    expect(selectedCli.exitCode, selectedCli.stderr).toBe(0);
    expect(parseEvidence(selectedCli.json)).toEqual(selected);
  },
  60_000,
);
cliTest(
  "retains leading partial data, strict/continued integrity, capacity diagnostics and changed-input refusal",
  async () => {
    const root = await createTestTempDirectory("rea-flash-public-failures-"),
      path = join(root, "dump.bin"),
      c = await client();
    const full = espFlashDump({
        table: partitionTable([
          { label: "prefix", type: 1, subtype: 2, offset: 0, size: 0x2000 },
        ]),
      }),
      partial = full.subarray(0x1000);
    await writeFile(path, partial);
    await c.call("open_binary", {
      path,
      format: "esp-flash-image",
      flash_offset: "0x1000",
      partition_table_offset: "0x8000",
    });
    const graph = inventory(await c.evidence("inspect_artifact")),
      part = graph.occurrences.find(
        (o) => o.logical_path === "partitions/prefix.bin",
      )!;
    expect(part.source_location).toEqual({ offset: 0, length: 0x1000 });
    expect(part.format_metadata).toMatchObject({
      stored_offset: 0x1000,
      declared_file_offset: -0x1000,
      availability: "truncated",
    });
    await c.call("close_binary");
    await writeFile(path, dump(true));
    await c.call("open_binary", { path, format: "esp-flash-image" });
    for (const name of ["inspect_artifact", "extract_artifact"])
      expect(parseMcpToolError(await c.call(name)).error).toMatchObject({
        details: { reason: "integrity" },
      });
    const untrusted = await c.evidence("inspect_artifact", {
      integrity_policy: "record-and-continue",
    });
    expect(inventory(untrusted).limitations.join(" ")).toContain(
      "observed-untrusted",
    );
    for (const [key, resource] of [
      ["max_firmware_hash_bytes", "cpu"],
      ["max_firmware_metadata_bytes", "memory"],
      ["max_firmware_file_bytes", "file-size"],
    ])
      expect(
        parseMcpToolError(await c.call("inspect_artifact", { [key!]: 1 }))
          .error,
      ).toMatchObject({ code: "resource_constraint", details: { resource } });
    const changed = dump();
    changed[0x9000] = (changed[0x9000] ?? 0) ^ 1;
    await writeFile(path, changed);
    for (const name of ["inspect_artifact", "extract_artifact"])
      expect(
        parseMcpToolError(
          await c.call(name, { integrity_policy: "record-and-continue" }),
        ).error,
      ).toMatchObject({ details: { reason: "integrity" } });
    await c.call("close_binary");
    await writeFile(path, uimageFile({ payload: Buffer.from([1]) }));
    await c.call("open_binary", { path });
    await writeFile(path, uimageFile({ payload: Buffer.from([2]) }));
    for (const name of ["inspect_artifact", "extract_artifact"])
      expect(
        parseMcpToolError(
          await c.call(name, { integrity_policy: "record-and-continue" }),
        ).error,
      ).toMatchObject({ details: { reason: "integrity" } });
  },
  60_000,
);
