#!/usr/bin/env node
import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { createHash } from "node:crypto";
import { constants } from "node:fs";
import {
  copyFile,
  mkdir,
  mkdtemp,
  readFile,
  writeFile,
} from "node:fs/promises";
import { tmpdir } from "node:os";
import { join, resolve } from "node:path";
import { fileURLToPath } from "node:url";
import { parseArgs, promisify } from "node:util";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import { Ajv2020 } from "ajv/dist/2020.js";
import { toolContract } from "../dist/contracts/toolContracts.js";
import { createVerifierRun, completeVerifierRun } from "./lib/verifier-run.mjs";
import {
  swiftEnumOracle,
  swiftEnumNegativeCopies,
  swiftProjectionNegativeCopies,
} from "../tests/conformance/ghidra/swift-enum-oracle.mjs";
import {
  swiftProbeCases,
  swiftProbeAssembly,
  swiftProbeOracle,
  swiftProbePatch,
} from "../tests/conformance/ghidra/swift-stack-probe-fixtures.mjs";

import {
  swiftSnapshotCases,
  swiftSnapshotAssembly,
  swiftSnapshotOracle,
  swiftSnapshotPatch,
} from "../tests/conformance/ghidra/swift-dynamic-snapshot-fixtures.mjs";
import {
  swiftFrameEscapeCases,
  swiftFrameEscapeAssembly,
  swiftFrameEscapeOracle,
} from "../tests/conformance/ghidra/swift-frame-escape-fixtures.mjs";

const { values } = parseArgs({
  options: {
    "output-dir": { type: "string" },
    "compiler-oracle-only": { type: "boolean", default: false },
    "snapshot-only": { type: "boolean", default: false },
    "snapshot-case": { type: "string" },
    "probe-case": { type: "string" },
    "probe-only": { type: "boolean", default: false },
    "baseline-only": { type: "boolean", default: false },
    "baseline-start-at": { type: "string" },
    "escape-only": { type: "boolean", default: false },
    "escape-case": { type: "string" },
  },
});
assert.ok(
  [
    values["probe-only"],
    values["baseline-only"],
    values["snapshot-only"],
    values["escape-only"],
  ].filter(Boolean).length <= 1,
  "Select at most one of probe-only, baseline-only, snapshot-only, escape-only",
);
assert.ok(
  values["baseline-start-at"] === undefined || values["baseline-only"],
  "baseline-start-at requires baseline-only",
);
assert.ok(
  process.platform === "darwin" && process.arch === "arm64",
  "This compiler-shape lane requires macOS arm64 and the installed Swift compiler",
);
if (!values["compiler-oracle-only"])
  assert.ok(
    process.env.GHIDRA_INSTALL_DIR && process.env.JAVA_HOME,
    "Set installed Ghidra/JDK paths; this lane installs nothing",
  );
const root = values["output-dir"]
  ? resolve(values["output-dir"])
  : await mkdtemp(join(tmpdir(), "rea-swift-enum-proof-"));
if (values["output-dir"]) await mkdir(root); // Never overwrite earlier evidence.
const run = createVerifierRun();
const exec = promisify(execFile);
const digest = (bytes) => createHash("sha256").update(bytes).digest("hex");
const save = async (path, value) =>
  writeFile(path, JSON.stringify(value, null, 2) + "\n");
const identity = async (path) => {
  const bytes = await readFile(path);
  return { path, bytes: bytes.length, sha256: digest(bytes) };
};
const cli = fileURLToPath(new URL("./rea.mjs", import.meta.url));
const fixture = (name) =>
  fileURLToPath(
    new URL(`../tests/conformance/ghidra/${name}`, import.meta.url),
  );
const env = {
  PATH: process.env.PATH ?? "/usr/bin:/bin",
  JAVA_HOME: process.env.JAVA_HOME,
  GHIDRA_INSTALL_DIR: process.env.GHIDRA_INSTALL_DIR,
  REA_ANALYSIS_PROVIDER: "ghidra",
  REA_LOG_LEVEL: "silent",
  REA_GHIDRA_STARTUP_TIMEOUT_MS: "330000",
  REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS: "60",
  REA_PROCESS_RUN_ID: run.run_id,
};
const catalogs = new Map();
async function retainCatalog(catalog, directory) {
  const bytes = Buffer.from(JSON.stringify(catalog, null, 2) + "\n"),
    sha256 = digest(bytes);
  let retained = catalogs.get(sha256);
  if (retained === undefined) {
    const folder = join(root, "catalogs");
    await mkdir(folder, { recursive: true });
    const path = join(folder, `${sha256}.json`);
    await writeFile(path, bytes, { flag: "wx" });
    retained = { path, bytes: bytes.length, sha256 };
    catalogs.set(sha256, retained);
  }
  // FICLONE requests independent APFS copy-on-write file bytes; Node falls
  // back to a full copy on filesystems that do not support reflinks.
  await copyFile(
    retained.path,
    join(directory, "catalog.json"),
    constants.COPYFILE_FICLONE | constants.COPYFILE_EXCL,
  );
}
const records = [];
const commands = [];
const results = [];
const skipped = [];
let startAt = values["baseline-start-at"];
const compiler = (await exec("/usr/bin/swiftc", ["--version"])).stdout;
await save(join(root, "run-start.json"), {
  run,
  compiler,
  producer: await identity(
    fileURLToPath(
      new URL(
        "../bridge/ghidra/ReaGhidraSwiftEnumSwitches.java",
        import.meta.url,
      ),
    ),
  ),
  target_executed: false,
  baseline_start_at: startAt ?? null,
  verifier: await identity(fileURLToPath(import.meta.url)),
  selection: values["escape-only"]
    ? "abi-frame-escape"
    : values["snapshot-only"]
      ? "dynamic-typed-snapshot"
      : values["probe-only"]
        ? "darwin-probe-effects"
        : values["baseline-only"]
          ? "baseline-swift-enum-matrix"
          : "complete-swift-enum-matrix",
});

async function compile(
  payloads,
  empty,
  label,
  dispatchLoad = false,
  foreignSuffix = false,
  projectionCase,
  probe,
  snapshot,
  escape,
) {
  const directory = join(root, label);
  await mkdir(directory);
  let text = await readFile(
    fixture(
      projectionCase === undefined
        ? "swift-enum-switch.swift"
        : "swift-enum-fixed-projection.swift",
    ),
    "utf8",
  );
  if (projectionCase !== undefined) {
    assert.equal(payloads, 11);
    assert.equal(empty, 13);
    assert.ok(projectionCase === 0 || projectionCase === 1);
    if (projectionCase === 1) {
      const before = "    case child(FixedChild)\n    case load(ReaPayload)";
      assert.ok(text.includes(before), "Missing owned outer-case declarations");
      text = text.replace(
        before,
        "    case load(ReaPayload)\n    case child(FixedChild)",
      );
    }
  } else
    text = text
      .replace(/^    case payload(\d+)\(ReaPayload\)\n/gm, (line, index) =>
        Number(index) < payloads ? line : "",
      )
      .replace(/^    case empty(\d+)\n/gm, (line, index) =>
        Number(index) < empty ? line : "",
      )
      .replace(
        /^    case \.payload(\d+): return reaCase\d+\(value\)\n/gm,
        (line, index) => (Number(index) < payloads ? line : ""),
      )
      .replace(
        /^    case \.empty(\d+): return reaCase\d+\(value\)\n/gm,
        (_, index) =>
          Number(index) < empty
            ? `    case .empty${index}: return reaCase${payloads + Number(index)}(value)\n`
            : "",
      );
  const source = join(directory, "switch.swift");
  await writeFile(source, text);
  const module = join(directory, "ReaResilientPayload.swiftmodule");
  const library = join(directory, "libReaResilientPayload.dylib");
  const path = join(directory, "libReaSwiftRelativeSwitch.dylib");
  const common = [
    "-module-cache-path",
    join(root, "module-cache"),
    "-parse-as-library",
  ];
  for (const args of [
    [
      ...common,
      "-enable-library-evolution",
      "-module-name",
      "ReaResilientPayload",
      "-emit-module",
      "-emit-module-path",
      module,
      "-emit-library",
      "-o",
      library,
      fixture("swift-enum-payload.swift"),
    ],
    [
      ...common,
      "-I",
      directory,
      "-L",
      directory,
      "-lReaResilientPayload",
      "-Onone",
      "-module-name",
      "ReaSwiftRelativeSwitch",
      "-emit-library",
      "-Xlinker",
      "-undefined",
      "-Xlinker",
      "dynamic_lookup",
      "-o",
      path,
      source,
    ],
  ]) {
    const reply = await exec("/usr/bin/swiftc", args, {
      maxBuffer: 8 * 1024 * 1024,
    });
    commands.push({
      command: "/usr/bin/swiftc",
      args,
      stdout: reply.stdout,
      stderr: reply.stderr,
      exit_code: 0,
    });
  }
  let additionalTagSuffixBytes = 0;
  if (
    dispatchLoad ||
    probe !== undefined ||
    snapshot !== undefined ||
    escape !== undefined
  ) {
    const assembly = join(directory, "switch.s");
    const args = [
      ...common,
      "-I",
      directory,
      "-Onone",
      "-module-name",
      "ReaSwiftRelativeSwitch",
      "-emit-assembly",
      "-o",
      assembly,
      source,
    ];
    const reply = await exec("/usr/bin/swiftc", args, {
      maxBuffer: 8 * 1024 * 1024,
    });
    commands.push({ command: "/usr/bin/swiftc", args, ...reply, exit_code: 0 });
    const original = await readFile(assembly, "utf8");
    const start = original.indexOf(
      probe === undefined && snapshot === undefined
        ? "_$s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF:"
        : "_$s22ReaSwiftRelativeSwitch11fixedReduceySiAA11FixedActionO_SitF:",
    );
    assert.ok(start >= 0, "Missing owned switch assembly entry");
    const end = original.indexOf(".cfi_endproc", start);
    assert.ok(end > start);
    const body = original.slice(start, end);
    assert.equal([...body.matchAll(/\tbr\tx8\n/g)].length, 1);
    // Reassemble owned source; never patch the caller's shipped artifact.
    const transformed =
      escape !== undefined
        ? swiftFrameEscapeAssembly(body, escape)
        : snapshot !== undefined
          ? swiftSnapshotAssembly(body, snapshot)
          : probe === undefined
            ? null
            : swiftProbeAssembly(body, probe);
    if (escape !== undefined)
      additionalTagSuffixBytes = transformed.tagSuffixBytes;
    let modified =
      transformed === null
        ? original.slice(0, start) +
          body.replace(
            /\tbr\tx8\n/,
            (foreignSuffix ? "Lrea_foreign_suffix_read:\n" : "") +
              "\tldr\txzr, [sp]\n\tbr\tx8\n",
          ) +
          original.slice(end)
        : original.slice(0, start) +
          transformed.body +
          original.slice(end) +
          transformed.suffix;
    if (foreignSuffix)
      modified +=
        "\n\t.section\t__TEXT,__text,regular,pure_instructions\n" +
        "\t.globl\t_rea_foreign_suffix_entry\n\t.p2align\t2\n_rea_foreign_suffix_entry:\n" +
        "\tb\tLrea_foreign_suffix_read\n";
    await writeFile(assembly, modified);
    const sdk = (
      await exec("/usr/bin/xcrun", ["--show-sdk-path"])
    ).stdout.trim();
    const extraLibraries = [];
    if (["foreign-library", "library-collision"].includes(probe?.change)) {
      const foreign = join(directory, "foreign.s");
      await writeFile(
        foreign,
        probe.change === "foreign-library"
          ? ".text\n.globl ___chkstk_darwin\n.p2align 2\n___chkstk_darwin:\nret\n"
          : ".text\n.globl _rea_foreign_probe_slot\n.p2align 2\n_rea_foreign_probe_slot:\nret\n",
      );
      const foreignArgs = [
        "--sdk",
        "macosx",
        "clang",
        "-dynamiclib",
        "-arch",
        "arm64",
        "-Wl,-install_name,/rea/foreign/libSystem.B.dylib",
        "-o",
        join(directory, "libReaForeignProbe.dylib"),
        foreign,
      ];
      const linked = await exec("/usr/bin/xcrun", foreignArgs);
      commands.push({
        command: "/usr/bin/xcrun",
        args: foreignArgs,
        ...linked,
        exit_code: 0,
      });
      extraLibraries.push("-lReaForeignProbe");
    }
    const linkArgs = [
      "--sdk",
      "macosx",
      "clang",
      "-dynamiclib",
      ...((probe === undefined && snapshot === undefined) ||
      probe?.change === "classic-binding"
        ? []
        : ["-Wl,-fixup_chains"]),
      "-arch",
      "arm64",
      "-Wl,-undefined,dynamic_lookup",
      "-L",
      directory,
      ...extraLibraries,
      "-L",
      join(sdk, "usr/lib/swift"),
      "-lReaResilientPayload",
      "-o",
      path,
      assembly,
    ];
    const linked = await exec("/usr/bin/xcrun", linkArgs, {
      maxBuffer: 8 * 1024 * 1024,
    });
    commands.push({
      command: "/usr/bin/xcrun",
      args: linkArgs,
      ...linked,
      exit_code: 0,
    });
  }
  let bytes = await readFile(path);
  let oracle = swiftEnumOracle(
    bytes,
    payloads,
    empty,
    dispatchLoad,
    projectionCase !== undefined,
    probe !== undefined,
    snapshot !== undefined,
    additionalTagSuffixBytes,
  );
  if (escape !== undefined)
    oracle.escape = swiftFrameEscapeOracle(bytes, oracle, escape);
  if (probe !== undefined) {
    bytes = swiftProbePatch(bytes, oracle, probe);
    await writeFile(path, bytes);
    oracle = swiftEnumOracle(bytes, payloads, empty, dispatchLoad, true, true);
    oracle.probe = swiftProbeOracle(bytes, oracle, probe);
  }
  if (snapshot !== undefined) {
    bytes = swiftSnapshotPatch(bytes, oracle, snapshot);
    await writeFile(path, bytes);
    oracle = swiftEnumOracle(
      bytes,
      payloads,
      empty,
      dispatchLoad,
      true,
      false,
      true,
    );
    oracle.snapshot = swiftSnapshotOracle(bytes, oracle, snapshot);
  }
  if (projectionCase !== undefined)
    assert.equal(oracle.projection.selected.index, projectionCase);
  await save(join(directory, "oracle.json"), {
    target_executed: false,
    source: await identity(source),
    binary: await identity(path),
    payloads,
    empty,
    oracle,
  });
  return { path, bytes, oracle, label, directory };
}

function check(result, oracle, positive) {
  const tables = result.native_api.jump_tables.filter((table) =>
    table.data_sources.some(
      (source) => source.provenance === "rea-swift-enum-signed-word-table",
    ),
  );
  if (!positive) {
    assert.deepEqual(
      tables,
      [],
      "An unsupported/corrupt shape acquired a Swift ABI bound",
    );
    return;
  }
  assert.equal(tables.length, 1);
  const table = tables[0];
  assert.equal(table.dispatch_address, `0x${oracle.dispatch.toString(16)}`);
  assert.deepEqual(
    table.mappings.map(({ case_value, target_address }) => ({
      case_value,
      target_address,
    })),
    oracle.mappings.map(({ case_value, target_address }) => ({
      case_value,
      target_address,
    })),
  );
  assert.deepEqual(table.default_targets, []);
  if (oracle.snapshot !== undefined) {
    assert.ok(
      table.limitations.some(
        (text) =>
          text.includes("swift-dynamic-typed-snapshot-v1") &&
          text.includes("recursively valid") &&
          text.includes("stable checked post-tag window"),
      ),
    );
    assert.ok(
      !table.limitations.some((text) =>
        text.includes("private non-escaped frame storage"),
      ),
    );
    assert.ok(
      table.data_sources.some((source) =>
        source.evidence.some(
          ({ detail }) =>
            detail.includes("preceding copy/witness correctness") &&
            detail.includes("all 156 bytes"),
        ),
      ),
    );
  }
  if (oracle.probe !== undefined) {
    assert.ok(
      table.limitations.some(
        (text) =>
          text.includes("trusted-darwin-arm64-chkstk-v1") &&
          text.includes("normal return"),
      ),
    );
    for (const call of oracle.probe.calls)
      assert.ok(
        table.data_sources.some((source) =>
          source.evidence.some(
            ({ detail }) =>
              detail.includes(`0x${call.address.toString(16)}`) &&
              detail.includes("16-byte scratch write") &&
              detail.includes("No allocation or exact runtime binding"),
          ),
        ),
      );
  }
  assert.equal(table.data_sources[0].entry_size_bytes, 4);
  assert.equal(table.data_sources[0].entry_count, oracle.mappings.length);
  for (const item of oracle.mappings) {
    assert.ok(
      result.procedure.body.ranges.some(
        ({ start, end }) =>
          BigInt(start) <= BigInt(item.target_address) &&
          BigInt(end) >= BigInt(item.target_address),
      ),
      "Case omitted from owning body",
    );
    assert.ok(
      result.pseudocode.includes(`_rea_case_${item.case_value}(`),
      "Case callee omitted from pseudocode",
    );
  }
  assert.ok(!result.pseudocode.includes("Could not recover jumptable"));
  assert.ok(
    table.mappings.every(
      ({ confidence, evidence }) =>
        confidence === "high" &&
        evidence.some(
          ({ source, detail }) =>
            source === "rea-swift-abi-instruction-and-memory" &&
            detail.includes("descriptor") &&
            detail.includes("unchanged tag"),
        ),
    ),
  );
}

async function inspect(target, positive, cliParity = false) {
  const { path, oracle, directory, label } = target;
  if (startAt !== undefined) {
    if (label !== startAt) {
      skipped.push(label);
      return;
    }
    startAt = undefined;
  }
  const before = digest(await readFile(path));
  const transport = new StdioClientTransport({
    command: process.execPath,
    args: [cli, "mcp"],
    env,
    stderr: "pipe",
  });
  const client = new Client({
    name: "swift-enum-switch-verifier",
    version: "1",
  });
  const ajv = new Ajv2020({ strict: false, validateFormats: false });
  let catalog, evidence, info;
  let stderr = "";
  transport.stderr?.on("data", (chunk) => {
    stderr += chunk
      .toString()
      .slice(0, Math.max(0, 1024 * 1024 - stderr.length));
  });
  const call = async (name, args = {}) => {
    const advertised = catalog.find((item) => item.name === name);
    assert.ok(advertised);
    assert.equal(ajv.validateSchema(advertised.inputSchema), true);
    assert.equal(
      ajv.validate(advertised.inputSchema, args),
      true,
      JSON.stringify(ajv.errors),
    );
    const started = Date.now();
    const reply = await client.callTool(
      { name, arguments: args },
      { timeout: 390000 },
    );
    const output = join(directory, `${records.length}-${name}.json`);
    await save(output, reply);
    records.push({
      label,
      name,
      args,
      duration_ms: Date.now() - started,
      reply: await identity(output),
      is_error: reply.isError === true,
    });
    await save(join(root, "invocations.json"), records);
    assert.notEqual(reply.isError, true, JSON.stringify(reply).slice(0, 4000));
    assert.equal(ajv.validateSchema(advertised.outputSchema), true);
    assert.equal(
      ajv.validate(advertised.outputSchema, reply.structuredContent),
      true,
      JSON.stringify(ajv.errors),
    );
    return toolContract(name).outputSchema.parse(reply.structuredContent);
  };
  try {
    await client.connect(transport);
    catalog = (await client.listTools()).tools;
    await retainCatalog(catalog, directory);
    await call("open_binary", { path, provider_id: "ghidra" });
    // Observe the body before any decompiler query; repair must not be a lazy
    // side effect that changes the answer for the same observation parameters.
    info = await call("procedure_info", {
      procedure: `0x${oracle.entry.toString(16)}`,
    });
    evidence = await call("analyze_function", {
      procedure: `0x${oracle.entry.toString(16)}`,
    });
    assert.deepEqual(
      info.normalized_result.body,
      evidence.normalized_result.procedure.body,
    );
    check(evidence.normalized_result, oracle, positive);
    assert.equal(
      evidence.analysis_profile.parameters.swift_enum_switch_recovery,
      "abi-signed-word-cfg-v10",
    );
    assert.ok(
      evidence.limitations.some((text) =>
        text.includes("analysis_complete=true; analysis_timed_out=false"),
      ),
    );
  } finally {
    try {
      if (catalog) await call("close_binary");
    } finally {
      try {
        await client.close();
      } finally {
        await transport.close();
        await writeFile(join(directory, "stderr.txt"), stderr);
        assert.equal(
          digest(await readFile(path)),
          before,
          "Analysis modified fixture bytes",
        );
      }
    }
  }
  if (cliParity) {
    const reply = await exec(
      process.execPath,
      [
        cli,
        "function",
        path,
        `0x${oracle.entry.toString(16)}`,
        "--provider",
        "ghidra",
        "--json",
      ],
      { env, timeout: 390000, maxBuffer: 64 * 1024 * 1024 },
    );
    await writeFile(join(directory, "cli.json"), reply.stdout);
    const other = toolContract("analyze_function").outputSchema.parse(
      JSON.parse(reply.stdout),
    );
    check(other.normalized_result, oracle, true);
    assert.equal(
      other.evidence_id,
      evidence.evidence_id,
      "CLI/MCP Evidence identity drift",
    );
    assert.equal(digest(await readFile(path)), before);
  }
  results.push({
    label,
    positive,
    cli_parity: cliParity,
    target: await identity(path),
    evidence_id: evidence.evidence_id,
    body_bytes: evidence.normalized_result.procedure.body.total_bytes,
  });
  console.log(JSON.stringify(results.at(-1)));
}

let failure;
try {
  const large =
    values["snapshot-only"] || values["escape-only"]
      ? null
      : await compile(18, 12, "thirty-cases");
  const small =
    values["snapshot-only"] || values["escape-only"]
      ? null
      : await compile(8, 4, "twelve-cases");
  const dispatchLoad =
    values["snapshot-only"] || values["escape-only"]
      ? null
      : await compile(18, 12, "dispatch-load", true);
  const foreignSuffix =
    values["snapshot-only"] || values["escape-only"]
      ? null
      : await compile(18, 12, "dispatch-foreign-entry", true, true);
  const projected =
    values["snapshot-only"] || values["escape-only"]
      ? null
      : await compile(11, 13, "fixed-projection-case-zero", false, false, 0);
  const projectedOne =
    values["snapshot-only"] || values["escape-only"]
      ? null
      : await compile(11, 13, "fixed-projection-case-one", false, false, 1);
  const probes = [];
  if (
    !values["baseline-only"] &&
    !values["snapshot-only"] &&
    !values["escape-only"]
  )
    for (const probe of swiftProbeCases.filter(
      (item) => !values["probe-case"] || item.label === values["probe-case"],
    ))
      probes.push(await compile(11, 13, probe.label, false, false, 0, probe));
  assert.ok(!values["probe-case"] || probes.length === 1, "Unknown probe-case");
  const snapshots = [];
  if (
    !values["baseline-only"] &&
    !values["probe-only"] &&
    !values["escape-only"]
  )
    for (const snapshot of swiftSnapshotCases.filter(
      (item) =>
        !values["snapshot-case"] || item.label === values["snapshot-case"],
    ))
      snapshots.push(
        await compile(
          11,
          13,
          snapshot.label,
          false,
          false,
          1,
          undefined,
          snapshot,
        ),
      );
  assert.ok(
    !values["snapshot-case"] || snapshots.length === 1,
    "Unknown snapshot-case",
  );
  const escapes = [];
  if (
    !values["baseline-only"] &&
    !values["probe-only"] &&
    !values["snapshot-only"]
  )
    for (const escape of swiftFrameEscapeCases.filter(
      (item) => !values["escape-case"] || item.label === values["escape-case"],
    ))
      escapes.push(
        await compile(
          18,
          12,
          escape.label,
          false,
          false,
          undefined,
          undefined,
          undefined,
          escape,
        ),
      );
  assert.ok(
    !values["escape-case"] || escapes.length === 1,
    "Unknown escape-case",
  );
  if (!values["compiler-oracle-only"]) {
    for (const escape of escapes)
      await inspect(
        escape,
        escape.oracle.escape.positive,
        escape.oracle.escape.positive,
      );
    for (const snapshot of snapshots)
      await inspect(
        snapshot,
        snapshot.oracle.snapshot.positive,
        snapshot.oracle.snapshot.positive,
      );
    for (const probe of probes)
      await inspect(
        probe,
        probe.oracle.probe.positive,
        probe.oracle.probe.positive,
      );
    if (
      !values["probe-only"] &&
      !values["snapshot-only"] &&
      !values["escape-only"]
    ) {
      await inspect(large, true, true);
      await inspect(small, true);
      await inspect(dispatchLoad, true, true);
      await inspect(foreignSuffix, false);
      await inspect(projected, true, true);
      await inspect(projectedOne, true);
      for (const [label, bytes] of Object.entries(
        swiftProjectionNegativeCopies(projected.bytes, projected.oracle),
      )) {
        const directory = join(root, label);
        await mkdir(directory);
        const path = join(directory, "mutated.dylib");
        await writeFile(path, bytes);
        await inspect(
          { path, oracle: projected.oracle, directory, label },
          false,
        );
      }
      const clobbered = Buffer.from(dispatchLoad.bytes);
      clobbered.writeUInt32LE(
        0xf94003e8,
        dispatchLoad.oracle.offsets.dispatch_load,
      );
      const directory = join(root, "dispatch-load-clobber");
      await mkdir(directory);
      const path = join(directory, "mutated.dylib");
      await writeFile(path, clobbered);
      await inspect(
        {
          path,
          oracle: dispatchLoad.oracle,
          directory,
          label: "dispatch-load-clobber",
        },
        false,
      );
      for (const [label, bytes] of Object.entries(
        swiftEnumNegativeCopies(large.bytes, large.oracle),
      )) {
        const directory = join(root, label);
        await mkdir(directory);
        const path = join(directory, "mutated.dylib");
        await writeFile(path, bytes);
        await inspect({ path, oracle: large.oracle, directory, label }, false);
      }
    }
  }
  assert.equal(
    startAt,
    undefined,
    "Requested baseline start case was not found",
  );
} catch (error) {
  failure = error;
}
const lifecycle = await completeVerifierRun(run);
if (!values["compiler-oracle-only"] && !failure) {
  try {
    assert.equal(lifecycle.process_lineage.status, "verified");
    assert.deepEqual(lifecycle.process_lineage.descendants, []);
  } catch (error) {
    failure = error;
  }
}
await save(join(root, "summary.json"), {
  ok: !failure,
  compiler,
  commands,
  results,
  skipped,
  records,
  catalogs: [...catalogs.values()],
  target_executed: false,
  process_lineage: lifecycle.process_lineage,
  error: failure ? String(failure.stack ?? failure) : null,
});
console.log(
  JSON.stringify({
    ok: !failure,
    root,
    results: results.length,
    process_lineage: lifecycle.process_lineage,
  }),
);
if (failure) throw failure;
