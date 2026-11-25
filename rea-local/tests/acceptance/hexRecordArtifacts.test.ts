import { createHash } from "node:crypto";
import { join } from "node:path";
import { readFile, rm, writeFile } from "node:fs/promises";
import { Client, InMemoryTransport } from "@modelcontextprotocol/client";
import { Ajv2020 } from "ajv/dist/2020.js";
import { ZipWriter, Uint8ArrayWriter, TextReader } from "@zip.js/zip.js";
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
  INTEL_SPARSE_IMAGE,
  SREC_HEADER_IMAGE,
  intelHexRecord,
  srecRecord,
  recordLines,
} from "../../src/domain/firmware/hexRecords.fixture.js";
import { createTestTempDirectory } from "../fixtures/temporaryDirectory.js";
import { createTestBinarySession } from "../fixtures/binarySession.js";
import { parseMcpToolError } from "../fixtures/mcpToolError.js";

async function fixture(text: string | Buffer, name = "carrier.data") {
  const root = await createTestTempDirectory("rea-hex-mcp-"),
    path = join(root, name);
  await writeFile(path, text);
  const session = createTestBinarySession(new ArtifactProvider({}));
  const server = createServer({ kind: "session", session }),
    client = new Client({ name: "hex-record-control", version: "1" });
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

it.each([
  {
    encoding: "intel-hex",
    text: INTEL_SPARSE_IMAGE,
    count: 2,
    bytes: 36,
    start: 0x08000101,
  },
  { encoding: "srec", text: SREC_HEADER_IMAGE, count: 1, bytes: 32, start: 0 },
])(
  "inspects and extracts $encoding sparse regions with full source/metadata and advertised schemas",
  async ({ encoding, text, count, bytes, start }) => {
    const f = await fixture(text);
    const { reply, inventory, inspection } = await f.inventory();
    expect(inventory.manifest.root_format).toBe(encoding);
    const root = inventory.occurrences.find((o) => o.logical_path === ".");
    expect(root?.format_metadata).toMatchObject({
      kind: "hex-records",
      encoding,
      data_bytes: bytes,
      region_count: count,
      start_address: start,
      termination: "present",
    });
    expect(root?.artifact_kind).toBe("container");
    const regions = inventory.occurrences.filter((o) => o.logical_path !== ".");
    expect(regions).toHaveLength(count);
    for (const region of regions) {
      expect(region.source_location).toBeNull();
      expect(region.format_metadata?.kind).toBe("hex-record-region");
    }
    expect(inspection.next_probes).toEqual([
      expect.objectContaining({ operation: "extract_artifact" }),
    ]);
    const catalog = (await f.client.listTools()).tools,
      contract = catalog.find((t) => t.name === "inspect_artifact")!;
    const validate = new Ajv2020({
      strict: false,
      validateFormats: false,
    }).compile(jsonObjectSchema.parse(contract.outputSchema));
    expect(validate(reply.structuredContent)).toBe(true);
    const result = await f.client.callTool({
      name: "extract_artifact",
      arguments: {},
    });
    if (result.isError) throw Error(JSON.stringify(parseMcpToolError(result)));
    const extraction = artifactExtractionResultSchema.parse(
      parseEvidence(result.structuredContent).normalized_result,
    );
    onTestFinished(() =>
      rm(extraction.output_root, { recursive: true, force: true }),
    );
    expect(extraction.artifacts).toHaveLength(count);
    expect(extraction.manifest).toEqual(inventory.manifest);
    for (const artifact of extraction.artifacts) {
      const content = await readFile(
        join(extraction.output_root, artifact.relative_path),
      );
      expect(content.length).toBe(artifact.bytes_written);
      expect(createHash("sha256").update(content).digest("hex")).toBe(
        artifact.sha256,
      );
      const occurrence = regions.find(
        (o) => o.logical_path === artifact.relative_path,
      )!;
      const meta = occurrence.format_metadata;
      if (meta?.kind !== "hex-record-region")
        throw Error("Missing region metadata");
      expect(content.length).toBe(meta.end_address - meta.start_address + 1);
    }
  },
);

it("deduplicates equal payload bytes without losing distinct region address identity and marks missing termination", async () => {
  const f = await fixture(
    recordLines(
      intelHexRecord(0, 0x100, [1, 2]),
      intelHexRecord(0, 0x200, [1, 2]),
    ),
  );
  const { inventory } = await f.inventory();
  const regions = inventory.occurrences.filter((o) => o.logical_path !== ".");
  expect(regions.map((o) => o.artifact_id)).toEqual([
    regions[0]!.artifact_id,
    regions[0]!.artifact_id,
  ]);
  expect(regions.map((o) => o.format_metadata)).toEqual([
    expect.objectContaining({ start_address: 0x100, end_address: 0x101 }),
    expect.objectContaining({ start_address: 0x200, end_address: 0x201 }),
  ]);
  expect(
    inventory.occurrences.find((o) => o.logical_path === ".")?.format_metadata,
  ).toMatchObject({ termination: "absent" });
  expect(inventory.limitations.join(" ")).toContain("may be truncated");
});

it("enforces caller byte/run capacity before decoding and can proceed with an increased budget", async () => {
  const f = await fixture(INTEL_SPARSE_IMAGE);
  for (const args of [
    { max_firmware_file_bytes: 1 },
    { max_firmware_runs: 1 },
  ]) {
    const refused = parseMcpToolError(await f.call(args)).error;
    expect(refused).toMatchObject({ code: "resource_constraint" });
    expect(JSON.stringify(refused)).toContain(Object.keys(args)[0]);
  }
  const { inventory } = await f.inventory({
    max_firmware_file_bytes: Buffer.byteLength(INTEL_SPARSE_IMAGE),
    max_firmware_runs: 2,
  });
  expect(inventory.occurrences).toHaveLength(3);
});

it.each([
  [
    "checksum",
    recordLines(
      intelHexRecord(4, 0, [8, 0]),
      ":0100000001FF",
      intelHexRecord(1, 0),
    ),
  ],
  [
    "overlap",
    recordLines(
      intelHexRecord(0, 0, [1, 2]),
      intelHexRecord(0, 1, [3]),
      intelHexRecord(1, 0),
    ),
  ],
  [
    "post-termination",
    recordLines(srecRecord(1, 0, [1]), srecRecord(9, 0), srecRecord(1, 1, [2])),
  ],
])(
  "refuses malformed %s carriers even with record-and-continue",
  async (_reason, text) => {
    const f = await fixture(text);
    for (const integrity_policy of ["fail", "record-and-continue"]) {
      const result = await f.call({ integrity_policy });
      expect(result.isError).toBe(true);
      expect(parseMcpToolError(result).error).toMatchObject({
        details: { reason: "format" },
      });
    }
  },
);

it("preserves S-record count scope and empty decoded coverage without claiming execution or final-file count certification", async () => {
  const f = await fixture(
    recordLines(
      srecRecord(1, 0, [1]),
      srecRecord(5, 1),
      srecRecord(1, 2, [2]),
      srecRecord(9, 0),
    ),
  );
  const { inventory } = await f.inventory();
  expect(
    inventory.occurrences.find((o) => o.logical_path === ".")?.format_metadata,
  ).toMatchObject({
    data_record_count: 2,
    declared_data_record_count: 1,
    declared_data_record_count_line: 2,
  });
  expect(inventory.limitations.join(" ")).toContain(
    "does not certify the final total",
  );
  const empty = await fixture(recordLines(intelHexRecord(1, 0)));
  expect((await empty.inventory()).inventory.occurrences).toHaveLength(1);
});

it.each(["aab", "apks"])(
  "keeps %s target opening compatible and refuses unrelated firmware budgets",
  async (extension) => {
    const zip = new ZipWriter(new Uint8ArrayWriter());
    await zip.add("declared.txt", new TextReader("archive-only control"));
    const f = await fixture(
      Buffer.from(await zip.close()),
      `control.${extension}`,
    );
    const budget = await f.call({ max_firmware_runs: 1 });
    expect(parseMcpToolError(budget).error).toMatchObject({
      code: "invalid_request",
      details: {
        issues: [expect.objectContaining({ path: ["max_firmware_runs"] })],
      },
    });
    expect((await f.inventory()).inventory.manifest.root_format).toBe(
      extension,
    );
  },
);
