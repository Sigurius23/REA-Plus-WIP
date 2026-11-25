import { createHash } from "node:crypto";
import { join } from "node:path";
import { readFile, rm, writeFile } from "node:fs/promises";
import { Client, InMemoryTransport } from "@modelcontextprotocol/client";
import { Ajv2020 } from "ajv/dist/2020.js";
import { expect, it, onTestFinished } from "vitest";
import { createServer } from "../../src/server/createServer.js";
import { ArtifactProvider } from "../../src/artifacts/ArtifactProvider.js";
import {
  artifactInventoryResultSchema,
  artifactExtractionResultSchema,
} from "../../src/domain/artifactGraph.js";
import { artifactInspectionResultSchema } from "../../src/domain/artifactInspection.js";
import { parseEvidence } from "../../src/domain/evidence.js";
import {
  jsonObjectSchema,
  type JsonValue,
} from "../../src/domain/jsonValue.js";
import {
  uf2Block,
  uf2File,
  UF2_FLAGS,
  RP2040_FAMILY,
  RP2350_ARM_S_FAMILY,
} from "../../src/domain/firmware/uf2.fixture.js";
import { dfuseFile } from "../../src/domain/firmware/dfuse.fixture.js";
import { createTestTempDirectory } from "../fixtures/temporaryDirectory.js";
import { createTestBinarySession } from "../fixtures/binarySession.js";
import { parseMcpToolError } from "../fixtures/mcpToolError.js";
import { cliTest } from "../support/cli/cliFixture.js";
async function fixture(text: Uint8Array, name = "carrier.data") {
  const root = await createTestTempDirectory("rea-firmware-mcp-"),
    path = join(root, name);
  await writeFile(path, text);
  const session = createTestBinarySession(new ArtifactProvider({}));
  const server = createServer({ kind: "session", session }),
    client = new Client({ name: "firmware-control", version: "1" });
  const [a, b] = InMemoryTransport.createLinkedPair();
  await server.connect(b);
  await client.connect(a);
  onTestFinished(async () => {
    await client.close();
    await server.close();
    const closed = await session.close();
    if (!closed.ok) throw closed.error;
  });
  const opened = await client.callTool({
    name: "open_binary",
    arguments: { path },
  });
  if (opened.isError) throw Error(JSON.stringify(parseMcpToolError(opened)));
  const call = (args: Record<string, JsonValue> = {}) =>
    client.callTool({ name: "inspect_artifact", arguments: args });
  const inventory = async (args: Record<string, JsonValue> = {}) => {
    const reply = await call(args);
    if (reply.isError) throw Error(JSON.stringify(parseMcpToolError(reply)));
    const evidence = parseEvidence(reply.structuredContent),
      inspection = artifactInspectionResultSchema.parse(
        evidence.normalized_result,
      );
    return {
      reply,
      evidence,
      inspection,
      inventory: artifactInventoryResultSchema.parse(
        inspection.substeps[0]!.evidence.normalized_result,
      ),
    };
  };
  return { root, path, client, call, inventory };
}

const sha256 = (bytes: Uint8Array) =>
  createHash("sha256").update(bytes).digest("hex");
const multiFamily = () =>
  uf2File([
    uf2Block({
      address: 0x1000,
      payload: [1, 2],
      blockNo: 0,
      numBlocks: 1,
      familyId: RP2040_FAMILY,
    }),
    uf2Block({
      address: 0x1000,
      payload: [1, 2],
      blockNo: 0,
      numBlocks: 1,
      familyId: RP2350_ARM_S_FAMILY,
    }),
  ]);
const dfu = (crc?: number) =>
  dfuseFile({
    imageSizeIncludesSuffix: true,
    ...(crc === undefined ? {} : { crc }),
    targets: [
      {
        alternateSetting: 3,
        name: "flash",
        elements: [
          { address: 0x8000000, data: [1, 2, 3] },
          { address: 0x8000001, data: [8] },
        ],
      },
      { alternateSetting: 7, name: "empty", elements: [] },
    ],
  });
async function validate(
  f: Awaited<ReturnType<typeof fixture>>,
  name: string,
  value: unknown,
) {
  const tool = (await f.client.listTools()).tools.find(
    (tool) => tool.name === name,
  )!;
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  expect(ajv.validateSchema(tool.inputSchema)).toBe(true);
  expect(ajv.validateSchema(jsonObjectSchema.parse(tool.outputSchema))).toBe(
    true,
  );
  expect(ajv.compile(jsonObjectSchema.parse(tool.outputSchema))(value)).toBe(
    true,
  );
}
async function extraction(
  f: Awaited<ReturnType<typeof fixture>>,
  args: Record<string, JsonValue> = {},
) {
  const reply = await f.client.callTool({
    name: "extract_artifact",
    arguments: args,
  });
  if (reply.isError) throw Error(JSON.stringify(parseMcpToolError(reply)));
  await validate(f, "extract_artifact", reply.structuredContent);
  const result = artifactExtractionResultSchema.parse(
    parseEvidence(reply.structuredContent).normalized_result,
  );
  onTestFinished(() =>
    rm(result.output_root, { recursive: true, force: true }),
  );
  for (const artifact of result.artifacts) {
    const bytes = await readFile(
      join(result.output_root, artifact.relative_path),
    );
    expect(sha256(bytes)).toBe(artifact.sha256);
    expect(bytes.length).toBe(artifact.bytes_written);
  }
  return result;
}
for (const { format, bytes, args, flags } of [
  {
    format: "uf2",
    bytes: multiFamily,
    args: { max_firmware_runs: 2 },
    flags: ["--max-firmware-runs", "2"],
  },
  {
    format: "dfuse",
    bytes: dfu,
    args: { max_firmware_elements: 2 },
    flags: ["--max-firmware-elements", "2"],
  },
])
  cliTest(
    `retains ${format} metadata, advertised schemas, whole CLI/MCP Evidence parity and extracted bytes`,
    async ({ cli }) => {
      const carrier = bytes(),
        f = await fixture(carrier, "carrier.bin");
      const { reply, evidence, inspection, inventory } =
        await f.inventory(args);
      await validate(f, "inspect_artifact", reply.structuredContent);
      expect(inventory.manifest.root_format).toBe(format);
      expect(inventory.manifest.root_sha256).toBe(sha256(carrier));
      const root = inventory.occurrences.find((o) => o.logical_path === ".")!;
      expect(root.artifact_kind).toBe("container");
      expect(
        inventory.nodes.find((n) => n.artifact_id === root.artifact_id)?.format,
      ).toBe(format);
      expect(inspection.next_probes[0]?.operation).toBe("extract_artifact");
      const run = await cli.run({
        arguments: ["inspect-artifact", f.path, ...flags, "--json"],
      });
      expect(run.exitCode, run.stderr).toBe(0);
      expect(parseEvidence(run.json)).toEqual(evidence);
      const result = await extraction(f, args);
      expect(result.manifest).toEqual(inventory.manifest);
      expect(result.artifacts).toHaveLength(2);
      const regions = inventory.occurrences.filter(
        (o) =>
          o.format_metadata?.kind ===
          (format === "uf2" ? "uf2-region" : "dfuse-element"),
      );
      expect(regions).toHaveLength(2);
      if (format === "uf2") {
        expect(regions[0]?.artifact_id).toBe(regions[1]?.artifact_id);
        expect(regions.map((o) => o.source_location)).toEqual([null, null]);
        expect(new Set(regions.map((o) => o.logical_path)).size).toBe(2);
        expect(regions.map((o) => o.format_metadata)).toEqual(
          expect.arrayContaining([
            expect.objectContaining({
              family_id: RP2040_FAMILY,
              family_name: "RP2040",
              start_address: 0x1000,
            }),
            expect.objectContaining({
              family_id: RP2350_ARM_S_FAMILY,
              family_name: "RP2350_ARM_S",
              start_address: 0x1000,
            }),
          ]),
        );
      } else {
        expect(root.format_metadata).toMatchObject({
          kind: "dfuse",
          overlapping_element_count: 1,
          targets: [
            expect.objectContaining({
              target_name: "flash",
              alternate_setting: 3,
            }),
            expect.objectContaining({
              target_name: "empty",
              declared_elements: 0,
            }),
          ],
        });
        expect(regions.map((o) => o.source_location)).toEqual([
          { offset: 293, length: 3 },
          { offset: 304, length: 1 },
        ]);
        expect(inspection.observations).toContainEqual(
          expect.objectContaining({
            kind: "integrity",
            value: expect.objectContaining({
              algorithm: "dfu-crc32",
              status: "matches",
            }),
          }),
        );
      }
    },
  );
it("fails a DfuSe CRC mismatch by default and preserves the exact pair and untrusted status under explicit continuation", async () => {
  const f = await fixture(dfu(0));
  for (const name of ["inspect_artifact", "extract_artifact"]) {
    const reply = await f.client.callTool({ name, arguments: {} });
    expect(parseMcpToolError(reply).error).toMatchObject({
      details: { reason: "integrity" },
    });
    expect(JSON.stringify(reply)).toContain("CRC mismatch");
  }
  const args = { integrity_policy: "record-and-continue" };
  const { inventory, inspection } = await f.inventory(args);
  const root = inventory.occurrences.find((o) => o.logical_path === ".")!;
  expect(root.format_metadata).toMatchObject({ kind: "dfuse", suffix_crc: 0 });
  expect(inventory.integrity_contradictions).toEqual([]); // SHA-256 entry disagreements only.
  expect(inspection.observations).toContainEqual(
    expect.objectContaining({
      kind: "integrity",
      value: expect.objectContaining({
        algorithm: "dfu-crc32",
        declared_crc32: 0,
        status: "mismatched",
        trust: "observed-untrusted",
      }),
    }),
  );
  expect(inventory.limitations.join(" ")).toContain("observed-untrusted");
  const result = await extraction(f, args);
  expect(result.limitations.join(" ")).toContain("observed-untrusted");
  expect(result.manifest).toEqual(inventory.manifest);
});
it("retains partial UF2 coverage for skipped invalid/file-container and unverified tagged blocks", async () => {
  const f = await fixture(
    Buffer.concat([
      uf2File([
        uf2Block({
          address: 0,
          payload: [1],
          blockNo: 0,
          numBlocks: 4,
          flags: UF2_FLAGS.md5 | UF2_FLAGS.extensionTags,
        }),
        uf2Block({
          address: 2,
          payload: [2],
          blockNo: 1,
          numBlocks: 4,
          flags: UF2_FLAGS.notMainFlash,
        }),
        uf2Block({
          address: 3,
          payload: [3],
          blockNo: 2,
          numBlocks: 4,
          flags: UF2_FLAGS.fileContainer,
        }),
        uf2Block({
          address: 4,
          payload: [4],
          blockNo: 3,
          numBlocks: 4,
          magics: [0, 0, 0],
        }),
      ]),
      Buffer.from([42]),
    ]),
  );
  const { inventory } = await f.inventory();
  expect(
    inventory.occurrences.find((o) => o.logical_path === ".")?.format_metadata,
  ).toMatchObject({
    kind: "uf2",
    main_flash_coverage: "unknown",
    invalid_block_count: 1,
    trailing_bytes: 1,
    file_container_block_count: 1,
    not_main_flash_block_count: 1,
    md5_block_count: 1,
    extension_tag_block_count: 1,
    missing_block_count: 1,
    data_bytes: 1,
  });
  expect(inventory.limitations.join(" ")).toContain("not decoded or verified");
  expect((await extraction(f)).artifacts).toHaveLength(1);
});
it.each(["uf2", "dfuse"])(
  "enforces %s caller budgets and rejects irrelevant format knobs",
  async (format) => {
    const f = await fixture(format === "uf2" ? multiFamily() : dfu());
    for (const args of [
      { max_firmware_file_bytes: 1 },
      format === "uf2"
        ? { max_firmware_runs: 1 }
        : { max_firmware_elements: 1 },
    ]) {
      const error = parseMcpToolError(await f.call(args)).error;
      expect(error).toMatchObject({ code: "resource_constraint" });
      expect(JSON.stringify(error)).toContain(Object.keys(args)[0]);
    }
    expect(
      parseMcpToolError(
        await f.call(
          format === "uf2"
            ? { max_firmware_elements: 1 }
            : { max_firmware_runs: 1 },
        ),
      ).error,
    ).toMatchObject({ code: "invalid_request" });
  },
);
it("refuses conflicting UF2 writes and malformed DfuSe structure under both integrity policies", async () => {
  const conflict = uf2File(
    [1, 2].map((value) =>
      uf2Block({ address: 0, payload: [value], blockNo: 0, numBlocks: 1 }),
    ),
  );
  const malformed = dfuseFile({
    targets: [
      {
        alternateSetting: 0,
        declaredSize: 0,
        elements: [{ address: 0, data: [1] }],
      },
    ],
  });
  for (const bytes of [conflict, malformed]) {
    const f = await fixture(bytes);
    for (const integrity_policy of ["fail", "record-and-continue"]) {
      expect(
        parseMcpToolError(await f.call({ integrity_policy })).error,
      ).toMatchObject({ details: { reason: "format" } });
    }
  }
});
