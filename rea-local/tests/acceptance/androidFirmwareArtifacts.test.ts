import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { createHash } from "node:crypto";
import { readFile, rm, writeFile } from "node:fs/promises";
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
  buildBootImage,
  buildVendorBootImage,
  appendAvbFooter,
} from "../../src/domain/firmware/androidBoot.fixture.js";
import {
  androidOtaPayload,
  otaField,
  otaMessage,
  otaExtent,
} from "../../src/domain/firmware/androidOta.fixture.js";
const sha = (b: Uint8Array) => createHash("sha256").update(b).digest("hex");
async function connect() {
  const transport = new StdioClientTransport({
    command: process.execPath,
    args: [resolve("scripts/rea.mjs"), "mcp"],
    cwd: process.cwd(),
    env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
    stderr: "pipe",
  });
  const client = new Client({ name: "android-firmware-public", version: "1" });
  onTestFinished(async () => {
    try {
      await client.close();
    } finally {
      await transport.close();
    }
  });
  await client.connect(transport);
  const catalog = (await client.listTools()).tools;
  const call = (name: string, arguments_: Record<string, JsonValue> = {}) =>
    client.callTool({ name, arguments: arguments_ });
  const evidence = async (
    name: string,
    args: Record<string, JsonValue> = {},
  ) => {
    const reply = await call(name, args);
    if (reply.isError) throw Error(JSON.stringify(parseMcpToolError(reply)));
    const contract = catalog.find((t) => t.name === name)!;
    const ajv = new Ajv2020({ strict: false, validateFormats: false });
    expect(ajv.validateSchema(contract.inputSchema)).toBe(true);
    expect(
      ajv.compile(jsonObjectSchema.parse(contract.outputSchema))(
        reply.structuredContent,
      ),
    ).toBe(true);
    const text = reply.content.find((c) => c.type === "text");
    expect(text?.type === "text" ? JSON.parse(text.text) : null).toEqual(
      reply.structuredContent,
    );
    return parseEvidence(reply.structuredContent);
  };
  return { call, evidence };
}
const inventory = (e: ReturnType<typeof parseEvidence>) =>
  artifactInventoryResultSchema.parse(
    artifactInspectionResultSchema.parse(e.normalized_result).substeps[0]!
      .evidence.normalized_result,
  );
cliTest(
  "preserves Android boot/vendor ranges, AVB declarations and complete CLI/MCP Evidence",
  async ({ cli }) => {
    const dir = await createTestTempDirectory("rea-android-public-"),
      c = await connect();
    const cases = [
      {
        name: "boot-v2",
        bytes: buildBootImage({
          version: 2,
          kernel: Buffer.from("KERNEL"),
          ramdisk: Buffer.from([0x1f, 0x8b, 8, 1]),
          dtb: Buffer.from("DTB"),
          recoveryDtbo: Buffer.from("DTBO"),
        }),
        version: 2,
      },
      {
        name: "boot-v4",
        bytes: appendAvbFooter(
          buildBootImage({
            version: 4,
            kernel: Buffer.from("KERNEL"),
            ramdisk: Buffer.from("RAMDISK"),
            signature: Buffer.from("SIGNATURE"),
          }),
        ),
        version: 4,
      },
      {
        name: "vendor-v4",
        bytes: buildVendorBootImage({
          version: 4,
          ramdisks: [
            { name: "../odd", type: 1, bytes: Buffer.from("FIRST") },
            { name: "../odd", type: 3, bytes: Buffer.from("SECOND") },
          ],
          dtb: Buffer.from("DTB"),
          bootconfig: Buffer.from("cfg=yes\n"),
        }),
        version: 4,
      },
    ];
    for (const sample of cases) {
      const file = join(dir, sample.name + ".data");
      await writeFile(file, sample.bytes);
      expect((await c.call("open_binary", { path: file })).isError).not.toBe(
        true,
      );
      const e = await c.evidence("inspect_artifact"),
        graph = inventory(e),
        metadata = graph.occurrences.find(
          (o) => o.logical_path === ".",
        )!.format_metadata;
      expect(metadata).toMatchObject({
        kind: "android-boot-image",
        header_version: sample.version,
      });
      expect(graph.manifest.root_sha256).toBe(sha(sample.bytes));
      if (sample.name === "boot-v4")
        expect(metadata).toMatchObject({
          avb_footer_present: true,
          signature_size: 9,
        });
      if (sample.name === "vendor-v4") {
        expect(metadata).toMatchObject({
          vendor_ramdisk_table_entry_count: 2,
          vendor_ramdisk_entries: [
            { name: "../odd", ramdisk_type: 1 },
            { name: "../odd", ramdisk_type: 3 },
          ],
        });
        expect(
          graph.occurrences.filter((o) =>
            o.logical_path.startsWith("vendor_ramdisk/"),
          ),
        ).toHaveLength(2);
      }
      const result = await cli.run({
        arguments: ["inspect-artifact", file, "--json"],
      });
      expect(result.exitCode, result.stderr).toBe(0);
      expect(parseEvidence(result.json)).toEqual(e);
      const extracted = artifactExtractionResultSchema.parse(
        (await c.evidence("extract_artifact")).normalized_result,
      );
      onTestFinished(() =>
        rm(extracted.output_root, { recursive: true, force: true }),
      );
      for (const artifact of extracted.artifacts) {
        const b = await readFile(
            join(extracted.output_root, artifact.relative_path),
          ),
          loc = graph.occurrences.find(
            (o) => o.logical_path === artifact.relative_path,
          )!.source_location!;
        expect(b).toEqual(
          sample.bytes.subarray(loc.offset, loc.offset + loc.length),
        );
        expect(sha(b)).toBe(artifact.sha256);
      }
      expect(
        parseMcpToolError(
          await c.call("inspect_artifact", { max_firmware_elements: 1 }),
        ).error.code,
      ).toBe("resource_constraint");
      await writeFile(
        file,
        buildBootImage({ version: 3, kernel: Buffer.from("CHANGED") }),
      );
      expect(
        parseMcpToolError(
          await c.call("extract_artifact", {
            integrity_policy: "record-and-continue",
          }),
        ).error,
      ).toMatchObject({ details: { reason: "integrity" } });
      await c.call("close_binary");
    }
  },
  60_000,
);
const payload = (bad = false) =>
  androidOtaPayload({
    manifest: otaMessage(
      otaField(3, 4096),
      otaField(14, 9007199254740997n),
      otaField(
        13,
        otaMessage(
          otaField(1, "../partition"),
          otaField(
            7,
            otaMessage(otaField(1, 8192), otaField(2, Buffer.alloc(32))),
          ),
          otaField(
            8,
            otaMessage(
              otaField(1, 0),
              otaField(2, 0),
              otaField(3, 4),
              otaField(6, otaExtent(0, 1)),
              otaField(
                8,
                bad
                  ? Buffer.alloc(32)
                  : createHash("sha256").update("DATA").digest(),
              ),
            ),
          ),
          otaField(8, otaMessage(otaField(1, 6), otaField(6, otaExtent(1, 1)))),
        ),
      ),
    ),
  });
cliTest(
  "keeps OTA operation blobs distinct from partitions and enforces integrity, work and identity",
  async ({ cli }) => {
    const dir = await createTestTempDirectory("rea-ota-public-"),
      file = join(dir, "payload.data"),
      bytes = payload(),
      c = await connect();
    await writeFile(file, bytes);
    await c.call("open_binary", { path: file });
    const e = await c.evidence("inspect_artifact"),
      graph = inventory(e);
    expect(graph.manifest.root_format).toBe("android-ota-payload");
    expect(
      graph.occurrences.find((o) => o.logical_path === ".")!.format_metadata,
    ).toMatchObject({
      kind: "android-ota-payload",
      max_timestamp: "9007199254740997",
      partition_images_reconstructed: false,
      signatures_verified: false,
      partitions: [
        {
          name: { value: "../partition" },
          partition_image_reconstructed: false,
          new_partition_info: { hash_verified: false },
          operations: [
            { type_code: 0, data_sha256: { status: "valid" } },
            { type_code: 6 },
          ],
        },
      ],
    });
    const result = await cli.run({
      arguments: ["inspect-artifact", file, "--json"],
    });
    expect(result.exitCode, result.stderr).toBe(0);
    expect(parseEvidence(result.json)).toEqual(e);
    const extracted = artifactExtractionResultSchema.parse(
      (await c.evidence("extract_artifact")).normalized_result,
    );
    onTestFinished(() =>
      rm(extracted.output_root, { recursive: true, force: true }),
    );
    expect(
      await readFile(
        join(extracted.output_root, "partitions/0000/operation-000000.bin"),
      ),
    ).toEqual(Buffer.from("DATA"));
    expect(
      await readFile(
        join(extracted.output_root, "partitions/0000/operation-000001.bin"),
      ),
    ).toEqual(Buffer.alloc(0));
    expect(
      extracted.artifacts.some((a) => a.relative_path.endsWith(".img")),
    ).toBe(false);
    for (const [key, resource] of [
      ["max_firmware_file_bytes", "file-size"],
      ["max_firmware_metadata_bytes", "memory"],
      ["max_firmware_elements", "memory"],
      ["max_firmware_hash_bytes", "cpu"],
    ])
      expect(
        parseMcpToolError(await c.call("inspect_artifact", { [key!]: 1 }))
          .error,
      ).toMatchObject({ code: "resource_constraint", details: { resource } });
    await c.call("close_binary");
    await writeFile(file, payload(true));
    await c.call("open_binary", { path: file });
    for (const operation of ["inspect_artifact", "extract_artifact"])
      expect(parseMcpToolError(await c.call(operation)).error).toMatchObject({
        details: { reason: "integrity" },
      });
    const continued = inventory(
      await c.evidence("inspect_artifact", {
        integrity_policy: "record-and-continue",
      }),
    );
    expect(continued.limitations.join(" ")).toContain("observed-untrusted");
    expect(
      continued.occurrences.find((o) => o.logical_path === ".")!
        .format_metadata,
    ).toMatchObject({
      partitions: [
        {
          operations: [
            { data_sha256: { status: "invalid" } },
            { type_code: 6 },
          ],
        },
      ],
    });
    await writeFile(file, bytes);
    expect(
      parseMcpToolError(
        await c.call("inspect_artifact", {
          integrity_policy: "record-and-continue",
        }),
      ).error,
    ).toMatchObject({ details: { reason: "integrity" } });
  },
  60_000,
);
