import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { createHash } from "node:crypto";
import { mkdir, mkdtemp, readFile, writeFile } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { parseArgs, promisify } from "node:util";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { parseEvidence } from "../../../dist/domain/evidence.js";
import { toolContract } from "../../../dist/contracts/toolContracts.js";
import {
  createVerifierRun,
  completeVerifierRun,
} from "../../lib/verifier-run.mjs";
const exec = promisify(execFile);
const { values } = parseArgs({ options: { "output-dir": { type: "string" } } });
assert.equal(
  process.platform,
  "darwin",
  "Source compiler fixture requires macOS",
);
assert.ok(
  process.env.GHIDRA_INSTALL_DIR && process.env.JAVA_HOME,
  "Use existing Ghidra/JDK; nothing is installed",
);
const out = values["output-dir"]
  ? resolve(values["output-dir"])
  : await mkdtemp(join(tmpdir(), "rea-unlisted-"));
if (values["output-dir"]) await mkdir(out);
const source = fileURLToPath(
  new URL(
    "../../../tests/conformance/ghidra/unlisted-instructions.S",
    import.meta.url,
  ),
);
const cli = fileURLToPath(new URL("../../rea.mjs", import.meta.url));
const digest = (bytes) => createHash("sha256").update(bytes).digest("hex");
const save = (file, value) =>
  writeFile(file, JSON.stringify(value, null, 2) + "\n");
const at = (value) => `0x${value.toString(16)}`;
const run = createVerifierRun();
const cases = [];
let lineage;
try {
  for (const architecture of ["arm64", "x86_64"]) {
    const directory = join(out, architecture);
    await mkdir(directory);
    const binary = join(directory, "fixture.dylib"),
      seed = join(directory, "seeds.tsv");
    await exec("/usr/bin/xcrun", [
      "clang",
      "-arch",
      architecture,
      "-dynamiclib",
      source,
      "-o",
      binary,
    ]);
    const original = await readFile(binary),
      hash = digest(original);
    const { stdout } = await exec("/usr/bin/nm", ["-n", binary]);
    await writeFile(join(directory, "symbols.txt"), stdout);
    const symbol = (name) => {
      const found = stdout
        .split("\n")
        .find((line) => line.trim().endsWith(` ${name}`));
      assert.ok(found, name);
      return BigInt(`0x${found.trim().split(/\s+/u)[0]}`);
    };
    const entry = symbol("_rea_unlisted_entry"),
      listed = symbol("_rea_listed_entry");
    const move = entry + (architecture === "arm64" ? 4n : 2n),
      ret = move + (architecture === "arm64" ? 4n : 5n);
    const call = ret + (architecture === "arm64" ? 4n : 1n),
      jump = call + (architecture === "arm64" ? 8n : 6n);
    await writeFile(seed, `${at(entry)}\tfunction\n${at(listed)}\tfunction\n`);
    const env = {
      PATH: process.env.PATH ?? "/usr/bin:/bin",
      JAVA_HOME: process.env.JAVA_HOME,
      GHIDRA_INSTALL_DIR: process.env.GHIDRA_INSTALL_DIR,
      REA_ANALYSIS_PROVIDER: "ghidra",
      REA_LOG_LEVEL: "silent",
      REA_PROCESS_RUN_ID: run.run_id,
      REA_GHIDRA_STARTUP_TIMEOUT_MS: "330000",
      REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS: "1",
      REA_GHIDRA_SEED_FILE: seed,
    };
    const transport = new StdioClientTransport({
      command: process.execPath,
      args: [cli, "mcp"],
      env,
      stderr: "pipe",
    });
    let stderr = "";
    transport.stderr?.on("data", (chunk) => {
      stderr += chunk.toString();
    });
    const client = new Client({ name: "rea-unlisted-verifier", version: "1" });
    const calls = [],
      ajv = new Ajv2020({ strict: false, validateFormats: false }),
      schemas = new Map();
    let catalog;
    const compile = (schema) => {
      assert.ok(ajv.validateSchema(schema));
      if (schema.$id && schemas.has(schema.$id)) {
        const old = schemas.get(schema.$id);
        assert.deepEqual(schema, old.schema);
        return old.fn;
      }
      const fn = ajv.compile(schema);
      if (schema.$id) schemas.set(schema.$id, { schema, fn });
      return fn;
    };
    const invoke = async (name, args, label, success = true) => {
      const advertised = catalog.find((tool) => tool.name === name);
      assert.ok(advertised);
      if (success) assert.ok(compile(advertised.inputSchema)(args));
      const reply = await client.callTool(
        { name, arguments: args },
        { timeout: 390000 },
      );
      await save(join(directory, `${label}.reply.json`), reply);
      calls.push({
        name,
        arguments: args,
        label,
        is_error: reply.isError === true,
      });
      await save(join(directory, "invocations.json"), calls);
      if (!success) {
        assert.equal(reply.isError, true);
        return reply;
      }
      assert.notEqual(reply.isError, true, JSON.stringify(reply));
      const value = reply.structuredContent;
      assert.ok(value);
      assert.ok(compile(advertised.outputSchema)(value));
      toolContract(name).outputSchema.parse(value);
      assert.deepEqual(
        JSON.parse(reply.content.find((block) => block.type === "text").text),
        value,
      );
      if (value.evidence_id) {
        parseEvidence(value);
        assert.equal(value.subject.digest.sha256, hash);
        await save(join(directory, `${label}.evidence.json`), value);
      }
      return value.normalized_result ?? value;
    };
    try {
      await client.connect(transport);
      catalog = (await client.listTools()).tools;
      await save(join(directory, "catalog.json"), catalog);
      await invoke(
        "open_binary",
        { path: binary, provider_id: "ghidra" },
        "open",
      );
      const before = await invoke(
        "read_function_instructions",
        { procedure: at(entry) },
        "body-before",
      );
      const absent = await invoke(
        "inspect_native_instruction",
        { address: at(move) },
        "default-before",
      );
      assert.equal(absent.status, "undecodable");
      assert.equal(absent.decode_source, null);
      for (const [label, address, kind] of [
        ["move", move, "fallthrough"],
        ["return", ret, "return"],
        ["call", call, "call"],
        ["jump", jump, "jump"],
      ]) {
        const value = await invoke(
          "inspect_native_instruction",
          { address: at(address), decode_unlisted: true },
          label,
        );
        assert.equal(value.status, "decoded");
        assert.equal(value.decode_source, "unlisted_program_bytes");
        assert.equal(value.references_available, false);
        assert.deepEqual(value.references, []);
        assert.equal(value.procedure, null);
        assert.equal(value.flow.kind, kind);
        assert.ok(
          value.flow.classification_evidence.some((fact) =>
            fact.source.startsWith("ghidra-byte-decoder"),
          ),
        );
        if (kind === "call" || kind === "jump")
          assert.deepEqual(value.flow.direct_destinations, [at(move)]);
      }
      const existing = await invoke(
        "inspect_native_instruction",
        { address: at(entry), decode_unlisted: true },
        "existing",
      );
      assert.equal(existing.decode_source, "listing");
      assert.equal(existing.references_available, true);
      const interior = await invoke(
        "inspect_native_instruction",
        { address: at(entry + 1n), decode_unlisted: true },
        "interior",
      );
      assert.equal(interior.status, "not-instruction-boundary");
      assert.equal(interior.decode_source, null);
      for (const [label, address] of [
        ["data", symbol("_rea_data")],
        ["uninitialized", symbol("_rea_uninitialized")],
        ["outside", 0xffffffffffff0000n],
      ]) {
        const value = await invoke(
          "inspect_native_instruction",
          { address: at(address), decode_unlisted: true },
          label,
        );
        assert.notEqual(value.status, "decoded");
        assert.equal(value.decode_source, null);
      }
      if (architecture === "x86_64") {
        const segments = await invoke("list_segments", {}, "segments");
        const tail = entry + 4095n;
        assert.ok(
          segments.some(
            (segment) =>
              segment.executable &&
              segment.initialized &&
              BigInt(segment.end) === tail + 1n &&
              BigInt(segment.start) <= tail,
          ),
          "Truncation control must be at the actual executable Program block end, not section padding",
        );
        for (const [label, address] of [
          ["overlap", listed - 4n],
          ["truncated", tail],
        ]) {
          const value = await invoke(
            "inspect_native_instruction",
            { address: at(address), decode_unlisted: true },
            label,
          );
          assert.notEqual(value.status, "decoded");
          assert.equal(value.decode_source, null);
        }
      } else {
        const value = await invoke(
          "inspect_native_instruction",
          { address: at(move + 1n), decode_unlisted: true },
          "unaligned",
        );
        assert.equal(value.status, "undecodable");
        assert.equal(value.decode_source, null);
      }
      await invoke(
        "inspect_native_instruction",
        { address: at(move), decode_unlisted: "true" },
        "invalid-boolean",
        false,
      );
      await invoke(
        "resolve_native_call_targets",
        { address: at(call), decode_unlisted: true },
        "unsupported-call-option",
        false,
      );
      assert.deepEqual(
        await invoke(
          "inspect_native_instruction",
          { address: at(move) },
          "default-after",
        ),
        absent,
      );
      assert.deepEqual(
        await invoke(
          "read_function_instructions",
          { procedure: at(entry) },
          "body-after",
        ),
        before,
      );
      const targets = await invoke(
        "resolve_native_call_targets",
        { address: at(call) },
        "targets-after",
      );
      assert.equal(targets.status, "unavailable");
      const cliArgs = [
        cli,
        "inspect-native-instruction",
        binary,
        at(move),
        "--decode-unlisted",
        "--provider",
        "ghidra",
        "--format",
        "json",
        "--full-output",
      ];
      const cliResult = await exec(process.execPath, cliArgs, {
        env,
        timeout: 390000,
        maxBuffer: 16 * 1024 * 1024,
      });
      const envelope = JSON.parse(cliResult.stdout);
      assert.equal(envelope.ok, true);
      parseEvidence(envelope.data);
      await save(join(directory, "cli.evidence.json"), envelope.data);
      const selected = JSON.parse(
        await readFile(join(directory, "move.evidence.json"), "utf8"),
      );
      assert.deepEqual(
        envelope.data.normalized_result,
        selected.normalized_result,
      );
      await invoke(
        "export_evidence_bundle",
        { path: join(directory, "final.bundle.json") },
        "export",
      );
      await invoke("close_binary", {}, "close-first");
      await invoke("close_binary", {}, "close-idempotent");
      assert.equal(digest(await readFile(binary)), hash);
      cases.push({
        architecture,
        target_sha256: hash,
        calls: calls.length,
        expected_rejections: 2,
        cli_mcp_equal: true,
        listing_and_body_unchanged: true,
        target_executed: false,
      });
    } finally {
      await client.close();
      await transport.close();
      await writeFile(join(directory, "stderr.log"), stderr);
    }
  }
} finally {
  lineage = await completeVerifierRun(run);
  await save(join(out, "verifier-run.json"), lineage);
}
assert.equal(lineage.process_lineage.status, "verified");
assert.deepEqual(lineage.process_lineage.descendants, []);
const result = {
  status: "passed",
  cases,
  verifier_run: lineage,
  target_executed: false,
};
await save(join(out, "verification.json"), result);
console.log(JSON.stringify(result));
