import { readFile, readdir, writeFile, symlink } from "node:fs/promises";
import { join } from "node:path";
import { Client, InMemoryTransport } from "@modelcontextprotocol/client";
import { expect, it, onTestFinished } from "vitest";
import { createServer } from "../../src/server/createServer.js";
import { ArtifactResourceScope } from "../../src/artifacts/ArtifactResourceScope.js";
import {
  createAnalysisExecution,
  type AnalysisOperationPort,
} from "../../src/application/AnalysisProvider.js";
import { createAnalysisProfile } from "../../src/domain/analysisProfile.js";
import {
  AnalysisCancelledError,
  AnalysisOutputError,
} from "../../src/domain/analysisErrorCore.js";
import { ok, err } from "../../src/domain/result.js";
import { parseEvidence } from "../../src/domain/evidence.js";
import { decompileDirectoryManifestSchema } from "../../src/domain/native/decompileDirectory.js";
import { exportKey } from "../../src/application/native/DecompileExportFiles.js";
import { createTestTempDirectory } from "../fixtures/temporaryDirectory.js";
import { parseMcpToolError } from "../fixtures/mcpToolError.js";
import type { JsonValue } from "../../src/domain/jsonValue.js";

const provider = { id: "owned", name: "Owned", version: "1" };
const profile = createAnalysisProfile(provider, {
  fixture: "directory-export",
});
const observe = (result: unknown, sha256 = "a".repeat(64)) =>
  ok(
    createAnalysisExecution(result, provider, {
      subject: { path: "/owned/input", sha256, format: "elf" },
      analysisProfile: profile,
      limitations: ["Fixture analysis is partial"],
      locations: [{ kind: "address", address: "0x10" }],
    }),
  );
const inventory = [
  { address: "0x10", value: "unavailable" },
  { address: "0x20", value: "first body" },
  { address: "0x30", value: "failed" },
  {
    address: "0x40",
    value: "external",
    procedure: { external: true, thunk: false, thunk_target: null },
  },
  { address: "0x50", value: "last body" },
  { address: "0x0020", value: "alias body" },
];
async function fixture(custom?: AnalysisOperationPort["execute"]) {
  const root = await createTestTempDirectory("rea-decompile-directory-"),
    resources = new ArtifactResourceScope();
  const reads: string[] = [];
  const analysis: AnalysisOperationPort = {
    resourceScope: resources,
    execute: async (name, args, options) => {
      if (name === "procedure_pseudo_code") {
        reads.push(String(args.procedure));
        expect(options?.retention).toBe("transient");
      }
      if (custom !== undefined) return custom(name, args, options);
      if (name === "list_procedures") return observe(inventory);
      if (name !== "procedure_pseudo_code") throw Error(`Unexpected ${name}`);
      if (args.procedure === "0x10") return observe(null);
      if (args.procedure === "0x30")
        return err(new AnalysisOutputError(name, "owned function failure"));
      return observe(`int ${String(args.procedure)}() { return 7; }\n`);
    },
  };
  const server = createServer({ kind: "fixed", analysis }),
    client = new Client({ name: "export-control", version: "1" });
  const [a, b] = InMemoryTransport.createLinkedPair();
  await server.connect(b);
  await client.connect(a);
  onTestFinished(async () => {
    await client.close();
    await server.close();
    await resources.close();
  });
  const output = join(root, "export");
  const call = (input: Record<string, JsonValue>) =>
    client.callTool({
      name: "decompile_all",
      arguments: { output_directory: output, ...input },
    });
  const result = async (input: Record<string, JsonValue>) => {
    const reply = await call(input);
    if (reply.isError === true)
      throw Error(JSON.stringify(parseMcpToolError(reply).error));
    return decompileDirectoryManifestSchema.parse(
      parseEvidence(reply.structuredContent).normalized_result,
    );
  };
  return { root, output, call, result, reads, client };
}

it("exports file-backed outcomes, skips verified bytes and makes limit/resume progress before retrying failures", async () => {
  const f = await fixture();
  const first = await f.result({ limit: 1 });
  expect(first.counts).toMatchObject({
    inventory_rows: 6,
    unique_procedures: 5,
    selected: 5,
    unavailable: 1,
    remaining: 4,
  });
  const second = await f.result({ resume: true, limit: 1 });
  expect(second.counts).toMatchObject({ written: 1, remaining: 4 });
  const third = await f.result({ resume: true });
  expect(third.counts).toMatchObject({
    skipped: 1,
    written: 1,
    failed: 1,
    unavailable: 1,
    external: 1,
    remaining: 0,
  });
  expect(f.reads).toEqual(["0x10", "0x20", "0x30", "0x50", "0x10"]);
  const index = JSON.parse(await readFile(third.index_path, "utf8"));
  expect(JSON.stringify(index)).not.toContain("return 7");
  expect(index.functions).toHaveLength(5);
  expect(index.functions[0]).toMatchObject({
    status: "unavailable",
    attempt: 2,
    limitations: ["Fixture analysis is partial"],
    locations: [{ kind: "address", address: "0x10" }],
  });
  expect(await readdir(join(f.output, "records"))).toHaveLength(6);
  expect(
    await readFile(
      join(f.output, "functions", `${exportKey("0x20")}.c`),
      "utf8",
    ),
  ).toContain("return 7");
  expect(await readdir(f.output)).not.toContain(".rea-export-lock");
});

it("filters aliases before collapsing canonical addresses and rejects malformed bounds before inventory admission", async () => {
  const f = await fixture();
  const selected = await f.result({
    name: "alias",
    address_start: "0x20",
    address_end: "0x20",
  });
  expect(selected.counts).toMatchObject({
    selected: 1,
    written: 1,
    unique_procedures: 5,
  });
  expect(f.reads).toEqual(["0x0020"]);
  const bad = await f.call({
    address_start: "space:0x10",
    address_end: "other:0x20",
    resume: true,
  });
  expect(bad.isError).toBe(true);
  expect(f.reads).toHaveLength(1);
});

it("preserves changed files and refuses a mismatching target instead of overwriting an export", async () => {
  let target = "a".repeat(64);
  const f = await fixture(async (name) =>
    name === "list_procedures"
      ? observe([{ address: "0x20", value: "body" }], target)
      : observe("owned body", target),
  );
  await f.result({});
  const path = join(f.output, "functions", `${exportKey("0x20")}.c`);
  await writeFile(path, "changed by caller");
  const conflict = await f.call({ resume: true });
  expect(parseMcpToolError(conflict).error).toMatchObject({
    code: "evidence_integrity_mismatch",
  });
  expect(await readFile(path, "utf8")).toBe("changed by caller");
  target = "b".repeat(64);
  const mismatch = await f.call({ resume: true });
  expect(parseMcpToolError(mismatch).error).toMatchObject({
    code: "evidence_integrity_mismatch",
  });
  expect(f.reads).toEqual(["0x20"]);
});

it("retains the committed prefix after provider cancellation and resumes without repeating its completed function", async () => {
  let cancel = true;
  const f = await fixture(async (name, args) => {
    if (name === "list_procedures")
      return observe([
        { address: "0x10", value: "first" },
        { address: "0x20", value: "second" },
      ]);
    return args.procedure === "0x20" && cancel
      ? err(new AnalysisCancelledError(name))
      : observe("completed body");
  });
  const interrupted = parseMcpToolError(await f.call({})).error;
  expect(interrupted).toMatchObject({
    code: "cancelled",
    details: {
      partial_observation: {
        kind: "native-decompile-export-partial",
        manifest: { counts: { written: 1, remaining: 1 } },
      },
    },
  });
  const index = JSON.parse(
    await readFile(join(f.output, "decompile-index.json"), "utf8"),
  );
  expect(index.functions).toHaveLength(1);
  cancel = false;
  expect((await f.result({ resume: true })).counts).toMatchObject({
    skipped: 1,
    written: 1,
    remaining: 0,
  });
  expect(f.reads).toEqual(["0x10", "0x20", "0x20"]);
});

it("refuses symlink directories and source changes, retaining earlier output without crossing the selected boundary", async () => {
  let changed = false;
  const f = await fixture(async (name) =>
    name === "list_procedures"
      ? observe([{ address: "0x10", value: "body" }])
      : observe("body", changed ? "b".repeat(64) : "a".repeat(64)),
  );
  changed = true;
  const mismatch = await f.call({});
  expect(parseMcpToolError(mismatch).error).toMatchObject({
    code: "evidence_integrity_mismatch",
  });
  const alias = join(f.root, "alias");
  await symlink(f.output, alias, "dir");
  const refused = await f.client.callTool({
    name: "decompile_all",
    arguments: { output_directory: alias, resume: true },
  });
  expect(parseMcpToolError(refused).error).toMatchObject({
    code: "evidence_integrity_mismatch",
  });
  expect(await readdir(join(f.output, "functions"))).toEqual([]);
});

it("refuses a competing exporter while the first owns its directory", async () => {
  let entered!: () => void, release!: () => void;
  const started = new Promise<void>((resolve) => {
    entered = resolve;
  });
  const wait = new Promise<void>((resolve) => {
    release = resolve;
  });
  const f = await fixture(async (name) => {
    if (name === "list_procedures")
      return observe([{ address: "0x10", value: "body" }]);
    entered();
    await wait;
    return observe("Unicode body 🦉\n");
  });
  const first = f.result({});
  await started;
  try {
    const competing = await f.call({ resume: true });
    expect(competing.isError).toBe(true);
    expect(f.reads).toEqual(["0x10"]);
  } finally {
    release();
  }
  expect((await first).counts.written).toBe(1);
  const body = join(f.output, "functions", `${exportKey("0x10")}.c`);
  expect(await readFile(body, "utf8")).toBe("Unicode body 🦉\n");
  expect((await f.result({ resume: true })).counts.skipped).toBe(1);
});

it("preserves unrecorded bodies and commits conflict outcomes rather than adopting caller content", async () => {
  const f = await fixture();
  await f.result({ limit: 1 });
  const body = join(f.output, "functions", `${exportKey("0x20")}.c`);
  await writeFile(body, "caller-owned file");
  const resumed = await f.result({ resume: true, limit: 1 });
  expect(resumed.counts).toMatchObject({ written: 0, failed: 1 });
  expect(await readFile(body, "utf8")).toBe("caller-owned file");
  const index = JSON.parse(await readFile(resumed.index_path, "utf8"));
  expect(
    index.functions.find(
      (r: { procedure: { address: string } }) => r.procedure.address === "0x20",
    ),
  ).toMatchObject({
    status: "error",
    error: { code: "evidence_integrity_mismatch" },
  });
});
