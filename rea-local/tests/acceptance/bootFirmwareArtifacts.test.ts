import { createHash } from "node:crypto";
import { join, resolve } from "node:path";
import { readFile, rm, writeFile } from "node:fs/promises";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { expect, onTestFinished } from "vitest";
import { cliTest } from "../support/cli/cliFixture.js";
import { createTestTempDirectory } from "../fixtures/temporaryDirectory.js";
import { parseMcpToolError } from "../fixtures/mcpToolError.js";
import {
  jsonObjectSchema,
  type JsonValue,
} from "../../src/domain/jsonValue.js";
import { parseEvidence } from "../../src/domain/evidence.js";
import { artifactInspectionResultSchema } from "../../src/domain/artifactInspection.js";
import {
  artifactInventoryResultSchema,
  artifactExtractionResultSchema,
} from "../../src/domain/artifactGraph.js";
import {
  uimageFile,
  uimageMultiPayload,
} from "../../src/domain/firmware/uimage.fixture.js";
import {
  FIT_EMBEDDED,
  FIT_EXTERNAL,
  FIT_LATE_IMAGES,
  fitFixture,
} from "../../src/domain/firmware/fitImage.fixture.js";
import { dtString } from "../../src/domain/firmware/fdt.fixture.js";
import {
  espImage,
  signedEspImage,
  ESP32C3_APP_SEGMENTS,
  esp8266Image,
} from "../../src/domain/firmware/espImage.fixture.js";
const sha = (bytes: Uint8Array) =>
  createHash("sha256").update(bytes).digest("hex");
async function publicClient() {
  const transport = new StdioClientTransport({
    command: process.execPath,
    args: [resolve("scripts/rea.mjs"), "mcp"],
    cwd: process.cwd(),
    env: { PATH: process.env.PATH ?? "", REA_LOG_LEVEL: "silent" },
    stderr: "pipe",
  });
  const client = new Client({
    name: "boot-firmware-qualification",
    version: "1",
  });
  await client.connect(transport);
  onTestFinished(async () => {
    try {
      await client.close();
    } finally {
      await transport.close();
    }
  });
  const catalog = (await client.listTools()).tools,
    ajv = new Ajv2020({ strict: false, validateFormats: false });
  const validators = new Map<string, ReturnType<typeof ajv.compile>>();
  const call = (name: string, args: Record<string, JsonValue> = {}) =>
    client.callTool({ name, arguments: args });
  const evidence = async (
    name: string,
    args: Record<string, JsonValue> = {},
  ) => {
    const result = await call(name, args);
    if (result.isError) throw Error(JSON.stringify(parseMcpToolError(result)));
    let validate = validators.get(name);
    if (validate === undefined) {
      const tool = catalog.find((t) => t.name === name)!;
      expect(ajv.validateSchema(tool.inputSchema)).toBe(true);
      validate = ajv.compile(jsonObjectSchema.parse(tool.outputSchema));
      validators.set(name, validate);
    }
    expect(validate(result.structuredContent)).toBe(true);
    return parseEvidence(result.structuredContent);
  };
  return { call, evidence };
}
cliTest(
  "inspects and extracts uImage/FIT/ESP through compiled CLI and real stdio MCP with exact Evidence parity",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-boot-public-");
    const f = await publicClient();
    const samples: {
      name: string;
      format: string;
      bytes: Uint8Array;
      count: number;
      args: Record<string, JsonValue>;
    }[] = [
      {
        name: "multi",
        format: "uimage",
        bytes: uimageFile({
          type: 4,
          compression: 1,
          payload: uimageMultiPayload([
            Buffer.from([1, 2, 3]),
            Buffer.from([4, 5]),
          ]),
        }),
        count: 3,
        args: { max_firmware_elements: 3 },
      },
      {
        name: "embedded",
        format: "fit",
        bytes: FIT_EMBEDDED,
        count: 2,
        args: { max_firmware_elements: 2 },
      },
      {
        name: "external",
        format: "fit",
        bytes: FIT_EXTERNAL,
        count: 2,
        args: { max_firmware_tree_nodes: 32 },
      },
      {
        name: "late",
        format: "fit",
        bytes: FIT_LATE_IMAGES,
        count: 1,
        args: {},
      },
      {
        name: "esp",
        format: "esp-image",
        bytes: signedEspImage(espImage({ segments: ESP32C3_APP_SEGMENTS }), [
          "rsa",
        ]),
        count: 5,
        args: {},
      },
    ];
    for (const sample of samples) {
      const path = join(root, sample.name + ".data");
      await writeFile(path, sample.bytes);
      const opened = await f.call("open_binary", { path });
      expect(opened.isError).not.toBe(true);
      const evidence = await f.evidence("inspect_artifact", sample.args),
        inspection = artifactInspectionResultSchema.parse(
          evidence.normalized_result,
        ),
        inventory = artifactInventoryResultSchema.parse(
          inspection.substeps[0]!.evidence.normalized_result,
        );
      expect(inventory.manifest.root_format).toBe(sample.format);
      expect(inventory.manifest.root_sha256).toBe(sha(sample.bytes));
      expect(
        inventory.nodes.find(
          (n) => n.artifact_id === inventory.manifest.root_artifact_id,
        )?.format,
      ).toBe(sample.format);
      const regions = inventory.occurrences.filter(
        (o) => o.logical_path !== ".",
      );
      expect(regions).toHaveLength(sample.count);
      const argv = ["inspect-artifact", path];
      for (const [key, value] of Object.entries(sample.args))
        argv.push("--" + key.replaceAll("_", "-"), String(value));
      const run = await cli.run({ arguments: [...argv, "--json"] });
      expect(run.exitCode, run.stderr).toBe(0);
      expect(parseEvidence(run.json)).toEqual(evidence);
      const extracted = artifactExtractionResultSchema.parse(
        (await f.evidence("extract_artifact", sample.args)).normalized_result,
      );
      onTestFinished(() =>
        rm(extracted.output_root, { recursive: true, force: true }),
      );
      expect(extracted.manifest).toEqual(inventory.manifest);
      expect(extracted.artifacts).toHaveLength(sample.count);
      for (const file of extracted.artifacts) {
        const bytes = await readFile(
          join(extracted.output_root, file.relative_path),
        );
        const region = regions.find(
          (o) => o.logical_path === file.relative_path,
        )!;
        expect(sha(bytes)).toBe(file.sha256);
        expect(region.source_location).not.toBeNull();
        const range = region.source_location!;
        expect(bytes).toEqual(
          Buffer.from(
            sample.bytes.subarray(range.offset, range.offset + range.length),
          ),
        );
      }
      if (sample.format === "uimage")
        expect(regions[0]?.format_metadata?.kind).toBe("uimage-entry");
      if (sample.format === "esp-image") {
        const rootMeta = inventory.occurrences[0]?.format_metadata;
        expect(rootMeta).toMatchObject({
          kind: "esp-image",
          coverage: "complete",
          checksum: { status: "valid" },
          appended_sha256: { status: "valid" },
        });
        expect(extracted.limitations.join(" ")).toContain(
          "not cryptographically verified",
        );
      }
      if (sample.format === "fit" && sample.name !== "late")
        expect(
          inventory.occurrences.find(
            (o) => o.format_metadata?.kind === "fit-image",
          )?.format_metadata,
        ).toMatchObject({ hashes_mismatched: 0 });
      await f.call("close_binary");
    }
  },
  60_000,
);
cliTest(
  "keeps strict/continued integrity, unknown coverage, resource knobs and malformed/unsupported boundaries truthful",
  async () => {
    const root = await createTestTempDirectory("rea-boot-public-refusals-");
    const f = await publicClient();
    const cases = [
      { name: "crc", bytes: uimageFile({ declaredDataCrc32: 0 }) },
      {
        name: "fit-hash",
        bytes: fitFixture({
          images: [
            {
              name: "kernel",
              data: Buffer.from([1, 2, 3]),
              children: [
                {
                  name: "hash-1",
                  properties: {
                    algo: dtString("sha256"),
                    value: Buffer.alloc(32),
                  },
                },
              ],
            },
          ],
        }),
      },
      {
        name: "esp-checksum",
        bytes: espImage({ segments: ESP32C3_APP_SEGMENTS, checksum: 0 }),
      },
    ];
    for (const sample of cases) {
      const path = join(root, sample.name);
      await writeFile(path, sample.bytes);
      expect((await f.call("open_binary", { path })).isError).not.toBe(true);
      expect(
        parseMcpToolError(await f.call("inspect_artifact")).error,
      ).toMatchObject({ details: { reason: "integrity" } });
      expect(
        parseMcpToolError(await f.call("extract_artifact")).error,
      ).toMatchObject({ details: { reason: "integrity" } });
      const inspection = artifactInspectionResultSchema.parse(
        (
          await f.evidence("inspect_artifact", {
            integrity_policy: "record-and-continue",
          })
        ).normalized_result,
      );
      expect(inspection.limitations.join(" ")).toContain("observed-untrusted");
      const result = artifactExtractionResultSchema.parse(
        (
          await f.evidence("extract_artifact", {
            integrity_policy: "record-and-continue",
          })
        ).normalized_result,
      );
      onTestFinished(() =>
        rm(result.output_root, { recursive: true, force: true }),
      );
      expect(result.limitations.join(" ")).toContain("observed-untrusted");
      await f.call("close_binary");
    }
    const fit = join(root, "fit-budget");
    await writeFile(fit, FIT_EMBEDDED);
    await f.call("open_binary", { path: fit });
    for (const key of [
      "max_firmware_file_bytes",
      "max_firmware_elements",
      "max_firmware_tree_nodes",
      "max_firmware_tree_properties",
      "max_firmware_tree_depth",
      "max_firmware_metadata_bytes",
      "max_firmware_hash_bytes",
    ]) {
      const error = parseMcpToolError(
        await f.call("inspect_artifact", { [key]: 1 }),
      ).error;
      expect(error).toMatchObject({ code: "resource_constraint" });
      expect(JSON.stringify(error)).toContain(key);
      if (key === "max_firmware_hash_bytes")
        expect(error).toMatchObject({ details: { resource: "cpu" } });
    }
    expect(
      parseMcpToolError(
        await f.call("inspect_artifact", { max_firmware_runs: 1 }),
      ).error,
    ).toMatchObject({ code: "invalid_request" });
    await f.call("close_binary");
    const truncated = espImage({ segments: ESP32C3_APP_SEGMENTS }).subarray(
        0,
        100,
      ),
      partial = join(root, "partial");
    await writeFile(partial, truncated);
    await f.call("open_binary", { path: partial });
    const inventory = artifactInventoryResultSchema.parse(
      artifactInspectionResultSchema.parse(
        (await f.evidence("inspect_artifact")).normalized_result,
      ).substeps[0]!.evidence.normalized_result,
    );
    expect(
      inventory.occurrences.find((o) => o.logical_path === ".")
        ?.format_metadata,
    ).toMatchObject({ kind: "esp-image", coverage: "unknown" });
    await f.call("close_binary");
    const old = join(root, "8266");
    await writeFile(old, esp8266Image());
    await f.call("open_binary", { path: old });
    const unavailable = parseMcpToolError(
      await f.call("inspect_artifact"),
    ).error;
    expect(unavailable).toMatchObject({ details: { reason: "unavailable" } });
    expect(JSON.stringify(unavailable)).toContain("ESP8266");
    await f.call("close_binary");
    const malformed = join(root, "bad-uimage");
    await writeFile(malformed, uimageFile({ declaredPayloadSize: 0xffffffff }));
    await f.call("open_binary", { path: malformed });
    for (const integrity_policy of ["fail", "record-and-continue"])
      expect(
        parseMcpToolError(
          await f.call("inspect_artifact", { integrity_policy }),
        ).error,
      ).toMatchObject({ details: { reason: "format" } });
  },
  60_000,
);
