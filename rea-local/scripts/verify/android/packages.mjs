import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { promisify } from "node:util";
import { mkdtemp, mkdir, readFile, writeFile, rm } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join, resolve } from "node:path";
import { createHash } from "node:crypto";
import {
  ZipReader,
  ZipWriter,
  Uint8ArrayReader,
  Uint8ArrayWriter,
} from "@zip.js/zip.js";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
import Ajv2020 from "ajv/dist/2020.js";

const execute = promisify(execFile);
const repository = resolve(import.meta.dirname, "../../..");
const required = (name) => {
  const value = process.env[name];
  assert.ok(value, `Set ${name} to an existing local tool`);
  return resolve(value);
};
const buildTools = required("REA_ANDROID_BUILD_TOOLS");
const platform = required("REA_ANDROID_PLATFORM_JAR");
const bundletool = required("REA_BUNDLETOOL_JAR");
const jadx = required("REA_JADX_MCP_JAR");
const javaHome = required("JAVA_HOME");
const root = await mkdtemp(join(tmpdir(), "rea-android-package-verification-"));
const environment = {
  ...process.env,
  REA_APKSIG_JAR: join(buildTools, "lib/apksigner.jar"),
};
const tool = async (command, args) =>
  execute(command, args, {
    env: environment,
    timeout: 120_000,
    maxBuffer: 4 * 1024 * 1024,
  });
const digest = (bytes) => createHash("sha256").update(bytes).digest("hex");
const zip = async (path, entries) => {
  const writer = new ZipWriter(new Uint8ArrayWriter());
  for (const [name, bytes] of entries)
    await writer.add(name, new Uint8ArrayReader(bytes));
  await writeFile(path, await writer.close());
};
const unzip = async (path) => {
  const reader = new ZipReader(new Uint8ArrayReader(await readFile(path)));
  try {
    const entries = [];
    for (const entry of await reader.getEntries())
      if (!entry.directory)
        entries.push([
          entry.filename,
          await entry.getData(new Uint8ArrayWriter()),
        ]);
    return entries;
  } finally {
    await reader.close();
  }
};
const cli = async (args) => {
  const result = await tool(process.execPath, [
    resolve(repository, "scripts/rea.mjs"),
    ...args,
    "--json",
  ]);
  return JSON.parse(result.stdout);
};

const fixtures = async () => {
  const manifest = join(root, "AndroidManifest.xml");
  await writeFile(
    manifest,
    '<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="org.rea.packagefixture" android:versionCode="1" android:versionName="1"><uses-sdk android:minSdkVersion="21" android:targetSdkVersion="28"/><application android:hasCode="true"/></manifest>',
  );
  const classes = join(root, "classes");
  const dexRoot = join(root, "dex");
  await mkdir(classes);
  await mkdir(dexRoot);
  const source = join(root, "Cap.java");
  await writeFile(
    source,
    `package org.rea.packagefixture; public class Cap {${Array.from({ length: 4100 }, (_, i) => `public static String m${i}(){return "fixture-${i}";}`).join("\n")}}`,
  );
  await tool(join(javaHome, "bin/javac"), [
    "--release",
    "8",
    "-d",
    classes,
    source,
  ]);
  await tool(join(javaHome, "bin/java"), [
    "-cp",
    jadx,
    "com.android.tools.r8.D8",
    "--min-api",
    "21",
    "--output",
    dexRoot,
    join(classes, "org/rea/packagefixture/Cap.class"),
  ]);
  const apk = join(root, "base.apk");
  await tool(join(buildTools, "aapt2"), [
    "link",
    "-I",
    platform,
    "--manifest",
    manifest,
    "-o",
    apk,
  ]);
  const manifestEntries = await unzip(apk);
  const dex = await readFile(join(dexRoot, "classes.dex"));
  await zip(apk, [...manifestEntries, ["classes.dex", dex]]);
  const key = join(root, "fixture.jks");
  await tool(join(javaHome, "bin/keytool"), [
    "-genkeypair",
    "-keystore",
    key,
    "-storepass",
    "fixture-only",
    "-keypass",
    "fixture-only",
    "-alias",
    "fixture",
    "-keyalg",
    "RSA",
    "-validity",
    "1",
    "-dname",
    "CN=REA owned fixture",
  ]);
  const sign = async (path) =>
    tool(join(javaHome, "bin/java"), [
      "-jar",
      environment.REA_APKSIG_JAR,
      "sign",
      "--ks",
      key,
      "--ks-pass",
      "pass:fixture-only",
      "--key-pass",
      "pass:fixture-only",
      path,
    ]);
  await sign(apk);
  const split = join(root, "config.en.apk");
  await zip(split, manifestEntries);
  await sign(split);
  const apks = join(root, "fixture.apks");
  await zip(apks, [
    ["splits/base-master.apk", await readFile(apk)],
    ["splits/config.en.apk", await readFile(split)],
    ["alternatives/other.apk", await readFile(apk)],
  ]);
  const loose = join(root, "loose");
  await mkdir(loose);
  await writeFile(join(loose, "base.apk"), await readFile(apk));
  await writeFile(join(loose, "config.en.apk"), await readFile(split));
  const tampered = join(root, "tampered.apk");
  await zip(tampered, [
    ...(await unzip(apk)).filter(([name]) => name !== "classes.dex"),
    ["classes.dex", Buffer.concat([dex, Buffer.from([0])])],
  ]);
  const proto = join(root, "proto.apk");
  await tool(join(buildTools, "aapt2"), [
    "link",
    "--proto-format",
    "-I",
    platform,
    "--manifest",
    manifest,
    "-o",
    proto,
  ]);
  const module = join(root, "base-module.zip");
  await zip(module, [
    ...(await unzip(proto)).map(([name, bytes]) => [
      name === "AndroidManifest.xml" ? `manifest/${name}` : name,
      bytes,
    ]),
    ["dex/classes.dex", dex],
  ]);
  const aab = join(root, "fixture.aab");
  await tool(join(javaHome, "bin/java"), [
    "-jar",
    bundletool,
    "build-bundle",
    `--modules=${module}`,
    `--output=${aab}`,
  ]);
  return {
    apk,
    split,
    apks,
    loose,
    tampered,
    aab,
    dex: join(dexRoot, "classes.dex"),
  };
};
const jumboFixture = async (apk) => {
  const sourceRoot = join(root, "jumbo-source");
  const classes = join(root, "jumbo-classes");
  const output = join(root, "jumbo-dex");
  await mkdir(sourceRoot);
  await mkdir(classes);
  await mkdir(output);
  const sources = [];
  for (let part = 0; part < 5; part++) {
    const source = join(sourceRoot, `Jumbo${part}.java`);
    const methods = Array.from(
      { length: 30 },
      (_, group) =>
        `public static String[] m${group}(){return new String[]{${Array.from({ length: 500 }, (_, index) => `"aaaa-fixture-${part}-${group}-${index}"`).join(",")}};}`,
    ).join("\n");
    await writeFile(
      source,
      `package org.rea.packagefixture; public class Jumbo${part} {${methods}}`,
    );
    sources.push(source);
  }
  const probe = join(sourceRoot, "JumboProbe.java");
  await writeFile(
    probe,
    'package org.rea.packagefixture; public class JumboProbe {public static String sentinel(){return "zzzz-fixture-jumbo";}}',
  );
  sources.push(probe);
  await tool(join(javaHome, "bin/javac"), [
    "--release",
    "8",
    "-d",
    classes,
    ...sources,
  ]);
  await tool(join(javaHome, "bin/java"), [
    "-cp",
    jadx,
    "com.android.tools.r8.D8",
    "--min-api",
    "21",
    "--output",
    output,
    ...Array.from({ length: 5 }, (_, i) =>
      join(classes, `org/rea/packagefixture/Jumbo${i}.class`),
    ),
    join(classes, "org/rea/packagefixture/JumboProbe.class"),
  ]);
  const target = join(root, "jumbo.apk");
  await zip(target, [
    ...(await unzip(apk)).filter(
      ([name]) => name !== "classes.dex" && !name.startsWith("META-INF/"),
    ),
    ["classes.dex", await readFile(join(output, "classes.dex"))],
  ]);
  return { path: target, dex: join(output, "classes.dex") };
};

const reports = [];
let client;
try {
  const inputs = await fixtures();
  const good = await cli([
    "inspect-android-package",
    inputs.apk,
    "--verify-signatures",
  ]);
  assert.equal(
    good.normalized_result.signature_verification.status,
    "verified",
  );
  assert.deepEqual(
    good.normalized_result.signature_verification.members[0].schemes,
    { v1: true, v2: true, v3: true, v31: false },
  );
  assert.equal(
    good.normalized_result.signature_verification.members[0].sha256,
    digest(await readFile(inputs.apk)),
  );
  reports.push({
    case: "signed-apk-cli",
    signature: good.normalized_result.signature_verification,
  });
  const invalid = await cli([
    "inspect-android-package",
    inputs.tampered,
    "--verify-signatures",
  ]);
  assert.equal(
    invalid.normalized_result.signature_verification.status,
    "invalid",
  );
  reports.push({
    case: "tampered-apk-cli",
    signature: invalid.normalized_result.signature_verification,
  });
  client = new Client({
    name: "rea-android-package-verification",
    version: "1",
  });
  await client.connect(
    new StdioClientTransport({
      command: process.execPath,
      args: [resolve(repository, "scripts/rea.mjs"), "mcp"],
      env: environment,
      stderr: "pipe",
    }),
  );
  const catalog = await client.listTools();
  const advertised = catalog.tools.find(
    (entry) => entry.name === "inspect_android_package",
  );
  assert.ok(advertised);
  const ajv = new Ajv2020({ strict: false });
  const validInput = ajv.compile(advertised.inputSchema);
  const stringTool = catalog.tools.find(
    (entry) => entry.name === "search_android_strings",
  );
  assert.ok(stringTool);
  const validStringInput = ajv.compile(stringTool.inputSchema);
  assert.ok(
    validStringInput({
      path: inputs.apk,
      query: "fixture",
      scan_mode: "dex",
      class_limit: 2147483647,
    }),
  );
  // The object-root presentation combines property alternatives; the runtime
  // contract enforces the relationship between scan mode and class capacity.
  const rejectedModeLimit = await client.callTool({
    name: "search_android_strings",
    arguments: { path: inputs.apk, query: "fixture", class_limit: 10000 },
  });
  assert.equal(rejectedModeLimit.isError, true);
  assert.ok(
    !validStringInput({
      path: inputs.apk,
      query: "fixture",
      scan_mode: "unknown",
    }),
  );
  const request = async (name, input) => {
    const reply = await client.callTool(
      { name, arguments: input },
      {
        timeout: 180_000,
      },
    );
    assert.ok(!reply.isError, JSON.stringify(reply));
    return (
      reply.structuredContent ??
      JSON.parse(reply.content.find((entry) => entry.type === "text").text)
    );
  };
  const selection = {
    path: inputs.apks,
    verify_signatures: true,
    apk_members: ["splits/base-master.apk", "splits/config.en.apk"],
    base_apk: "splits/base-master.apk",
  };
  assert.ok(validInput(selection), ajv.errorsText(validInput.errors));
  for (const invalid of [
    "../outside.apk",
    "./base.apk",
    "splits/../base.apk",
    "splits/./base.apk",
    "splits//base.apk",
    "/base.apk",
    "splits\\base.apk",
    "nul\x00.apk",
  ]) {
    assert.ok(!validInput({ ...selection, apk_members: [invalid] }), invalid);
    assert.ok(!validInput({ ...selection, base_apk: invalid }), invalid);
  }
  const selected = await request("inspect_android_package", selection);
  assert.equal(
    selected.normalized_result.signature_verification.status,
    "verified",
  );
  assert.equal(
    selected.normalized_result.signature_verification.members.length,
    2,
  );
  assert.equal(
    selected.normalized_result.signature_verification.signer_consistency,
    "same-signers",
  );
  reports.push({
    case: "selected-apks-mcp",
    signature: selected.normalized_result.signature_verification,
  });
  const directory = await request("inspect_android_package", {
    path: inputs.loose,
    verify_signatures: true,
  });
  assert.equal(directory.subject.format, "apk-set");
  assert.equal(
    directory.normalized_result.signature_verification.members.length,
    2,
  );
  reports.push({
    case: "loose-set-mcp",
    signature: directory.normalized_result.signature_verification,
  });
  const converted = await request("inspect_android_package", {
    path: inputs.aab,
  });
  assert.equal(converted.subject.format, "aab");
  assert.equal(
    converted.normalized_result.package_name,
    "org.rea.packagefixture",
  );
  assert.ok(
    converted.limitations.some((limitation) =>
      limitation.includes("universal mode"),
    ),
  );
  reports.push({
    case: "aab-mcp",
    subject: converted.subject,
    limitations: converted.limitations,
  });
  const capped = await request("search_android_strings", {
    path: inputs.apk,
    query: "not-a-fixture-match",
    class_limit: 8192,
  });
  assert.equal(capped.normalized_result.scanned_methods, 4096);
  assert.equal(capped.normalized_result.method_cap_skipped_methods, 5);
  assert.equal(capped.normalized_result.method_cap_skipped_classes, 1);
  assert.equal(capped.normalized_result.coverage, "partial");
  reports.push({
    case: "real-method-cap-mcp",
    result: capped.normalized_result,
  });
  const raw = await request("search_android_strings", {
    path: inputs.apk,
    query: "fixture-4099",
    scan_mode: "dex",
    class_limit: 10000,
  });
  assert.equal(raw.normalized_result.scan_mode, "dex");
  assert.equal(raw.normalized_result.scanned_methods, 4101);
  assert.equal(raw.normalized_result.method_cap_skipped_methods, 0);
  assert.equal(raw.normalized_result.skipped_methods, 0);
  assert.equal(raw.normalized_result.coverage, "complete");
  const match = raw.normalized_result.matches[0];
  assert.equal(match.representation, "dex");
  assert.equal(match.method_name, "m4099");
  assert.ok(match.dex_location.input_file_offset > 0);
  assert.ok(
    [0x1a, 0x1b].includes(
      (await readFile(inputs.dex))[match.dex_location.input_file_offset],
    ),
    "Reported raw offset must point at a const-string opcode in the independent DEX fixture",
  );
  reports.push({ case: "raw-dex-mcp", result: raw.normalized_result });
  const jumbo = await jumboFixture(inputs.apk);
  const jumboResult = await request("search_android_strings", {
    path: jumbo.path,
    query: "zzzz-fixture-jumbo",
    scan_mode: "dex",
    class_limit: 100000,
  });
  assert.equal(jumboResult.normalized_result.skipped_methods, 0);
  assert.equal(jumboResult.normalized_result.coverage, "complete");
  assert.equal(jumboResult.normalized_result.matches.length, 1);
  const jumboMatch = jumboResult.normalized_result.matches[0];
  assert.equal(
    (await readFile(jumbo.dex))[jumboMatch.dex_location.input_file_offset],
    0x1b,
    "Independent fixture must use const-string/jumbo at the reported offset",
  );
  reports.push({
    case: "raw-dex-jumbo-mcp",
    result: jumboResult.normalized_result,
  });
  console.log(
    JSON.stringify(
      {
        status: "passed",
        tool_sha256: {
          jadx: digest(await readFile(jadx)),
          apksig: digest(await readFile(environment.REA_APKSIG_JAR)),
          bundletool: digest(await readFile(bundletool)),
        },
        reports,
      },
      null,
      2,
    ),
  );
} finally {
  await client?.close();
  await rm(root, { recursive: true, force: true });
}
