import assert from "node:assert/strict";
import { execFile } from "node:child_process";
import { mkdtemp, rm } from "node:fs/promises";
import { tmpdir } from "node:os";
import { join } from "node:path";
import { fileURLToPath } from "node:url";
import { promisify } from "node:util";
import { Ajv2020 } from "ajv/dist/2020.js";
import { parseBinaryTarget } from "../../../dist/application/BinaryTargetResolver.js";
import { inspectAppleDispatchMetadata } from "../../../dist/native/AppleDispatchMetadata.js";
import {
  artifactCliEvidence,
  artifactMcpResult,
  withArtifactMcp,
} from "../../lib/artifact-e2e.mjs";
import { nativeDispatchMetadataResultSchema } from "../../../dist/domain/native/objcSwiftMetadata.js";
import { parseEvidence } from "../../../dist/domain/evidence.js";
import { toolContract } from "../../../dist/contracts/toolContracts.js";

if (process.platform !== "darwin")
  throw new Error(
    "Apple dispatch verification requires macOS with a host Objective-C compiler and Foundation SDK",
  );
const exec = promisify(execFile);
const source = (name) =>
  fileURLToPath(
    new URL(`../../../tests/conformance/native/${name}`, import.meta.url),
  );

/** Both link modes: legacy LC_DYLD_INFO binds and the default chained fixups. */
const LINK_MODES = [
  {
    mode: "dyld-info",
    flags: ["-Wl,-no_fixup_chains"],
    fixups: "LC_DYLD_INFO rebase opcodes were not decoded",
    swift: true,
  },
  { mode: "chained", flags: [], fixups: "chained fixups:", swift: true },
  // arm64e uses authenticated chained pointers (DYLD_CHAINED_PTR_ARM64E_*).
  ...(process.arch === "arm64"
    ? [
        {
          mode: "chained-arm64e",
          flags: ["-arch", "arm64e"],
          fixups: "chained fixups: DYLD_CHAINED_PTR_ARM64E",
          swift: false,
        },
      ]
    : []),
];

const fixupCoverage = (metadata) =>
  metadata.coverage.find(({ facet }) => facet === "pointer_fixups");

const inspect = async (path) => {
  const target = await parseBinaryTarget(path);
  if (!target.ok) throw target.error;
  return {
    target: target.value,
    metadata: (await inspectAppleDispatchMetadata(target.value, 5000)).result,
  };
};

const checkObjc = (metadata, mode) => {
  const fixture = metadata.objc_classes.find(
    ({ name, is_meta_class: meta }) => name === "ReaDispatchFixture" && !meta,
  );
  const category = metadata.objc_categories.find(
    ({ name }) => name === "ReaDispatchAdditions",
  );
  const objcCoverage = metadata.coverage.find(
    ({ facet }) => facet === "objc_class_method_ivar_metadata",
  );
  assert.equal(fixture?.is_meta_class, false);
  assert.equal(fixture?.is_root_class, false);
  assert.equal(
    fixture?.properties.find(({ name }) => name === "fixtureName")?.atomicity,
    "nonatomic",
  );
  assert.equal(
    fixture?.properties.find(({ name }) => name === "atomicValue")?.atomicity,
    "atomic",
  );
  for (const method of fixture.methods) {
    assert.equal(method.is_required, null);
    assert.equal(method.is_optional, null);
  }
  for (const property of fixture.properties)
    for (const attribute of property.attributes)
      assert.deepEqual(Object.keys(attribute).sort(), ["name", "value"]);
  const protocol = metadata.objc_protocols.find(
    ({ name }) => name === "ReaDispatchProtocol",
  );
  assert.equal(protocol?.methods[0]?.is_required, true);
  assert.equal(protocol?.methods[0]?.is_optional, false);
  assert.equal(protocol?.optional_methods[0]?.is_required, false);
  assert.equal(protocol?.optional_methods[0]?.is_optional, true);
  if (
    !metadata.objc_dispatch_implementations.some(
      (item) =>
        item.class_name === "ReaDispatchFixture" &&
        item.selector === "performAction:" &&
        item.implementation_address !== null,
    ) ||
    !metadata.objc_dispatch_implementations.some(
      (item) =>
        item.selector === "fixtureVersion" && item.method_type === "class",
    ) ||
    !metadata.objc_ivars.some(
      (item) => item.name === "state" && item.offset !== null,
    ) ||
    !metadata.objc_protocol_records.some(
      (protocol) =>
        protocol.name === "ReaDispatchProtocol" &&
        protocol.methods.some(
          (method) => method.selector === "performAction:",
        ) &&
        protocol.optional_methods.some(
          (method) => method.selector === "optionalFixtureValue",
        ),
    ) ||
    // The superclass lives in libobjc, so it comes from a bind fixup.
    fixture?.super_class !== "NSObject" ||
    fixture.decode.status !== "decoded" ||
    !fixture.properties.some(
      (property) =>
        property.name === "fixtureName" &&
        property.type_encoding === '@"NSString"' &&
        property.attributes.some(({ name }) => name === "C"),
    ) ||
    category?.class_name !== "NSString" ||
    category.class_source !== "external" ||
    !category.instance_methods.includes("reaFixtureLength") ||
    !metadata.objc_dispatch_implementations.some(
      (item) =>
        item.class_name === "NSString" &&
        item.category === "ReaDispatchAdditions" &&
        item.selector === "reaFixtureLength",
    ) ||
    objcCoverage?.status !== "complete" ||
    fixupCoverage(metadata)?.reason?.startsWith(mode.fixups) !== true ||
    (mode.mode === "dyld-info") !==
      (fixupCoverage(metadata)?.reason?.includes(
        "LC_DYLD_INFO bind opcodes",
      ) ===
        true)
  )
    throw new Error(
      `Apple metadata fixture drifted (${mode.mode}): ${JSON.stringify(metadata)}`,
    );
};

const checkExternalSwift = (metadata) => {
  const external = metadata.relative_pointers.find(
    (item) =>
      item.external_reference?.symbol === "_$ss25ExpressibleByArrayLiteralMp",
  );
  assert.ok(external);
  assert.notEqual(external.field.address, external.indirect_slot?.address);
  assert.equal(typeof external.indirect_slot?.file_offset, "number");
  assert.deepEqual(external.target, { address: null, file_offset: null });
  assert.equal(
    external.external_reference.library?.endsWith("libswiftCore.dylib"),
    true,
  );
  assert.equal(external.external_reference.weak, false);
  assert.equal(external.external_reference.addend, "0");
  assert.equal(external.decode.status, "unsupported");
  const conformance = metadata.swift_conformances.find(
    (item) => item.type_name === "ReaArrayFixture",
  );
  assert.ok(conformance);
  assert.equal(conformance.protocol_name, null);
  assert.deepEqual(conformance.protocol_reference, external.external_reference);
  assert.equal(conformance.decode.status, "partial");
  assert.equal(typeof conformance.location.file_offset, "number");
};

const resilientOracle = async (path) => {
  const { stdout } = await exec("/usr/bin/nm", ["-n", path]);
  return ["ReaResilientBody", "ReaResilientRequest"].map((name) => {
    const lines = stdout
      .split("\n")
      .filter((line) =>
        new RegExp(`${name}[VO]SeAASe4from.*TW$`, "u").test(line),
      );
    assert.equal(
      lines.length,
      1,
      `Missing compiler witness oracle for ${name}`,
    );
    return {
      name,
      address: `0x${BigInt(`0x${lines[0].split(/\s+/u)[0]}`).toString(16)}`,
    };
  });
};

const checkResilientSwift = (metadata, oracle) => {
  for (const { name, address } of oracle) {
    const conformance = metadata.swift_conformances.find(
      (item) =>
        item.type_name === name &&
        item.protocol_reference?.symbol === "_$sSeMp",
    );
    assert.ok(conformance);
    assert.deepEqual(conformance.witness_table, {
      address: null,
      file_offset: null,
    });
    const records = metadata.swift_resilient_witnesses.filter(
      (item) => item.conformance.address === conformance.location.address,
    );
    assert.equal(records.length, 1);
    const [record] = records;
    assert.equal(record.record_ordinal, 0);
    assert.equal(Object.hasOwn(record, "slot_index"), false);
    assert.equal(
      record.requirement_reference.symbol,
      "_$sSe4fromxs7Decoder_p_tKcfCTq",
    );
    assert.equal(record.requirement_flags, null);
    assert.equal(record.implementation_address, address);
    assert.equal(record.implementation_kind, "executable_address");
    assert.equal(typeof record.implementation_location.file_offset, "number");
    assert.equal(record.runtime_witness_table, "not_instantiated");
    assert.equal(record.decode.status, "partial");
    assert.ok(record.generic_witness_table.address);
    assert.equal(record.evidence[0].artifact_sha256.length, 64);
  }
};

const checkSwift = (metadata, mode) => {
  checkExternalSwift(metadata);
  if (
    !metadata.swift_dispatch_slots.some(
      (slot) =>
        slot.table_kind === "class_vtable" &&
        slot.owner === "ReaVtableFixture" &&
        slot.decode.status === "decoded",
    )
  )
    throw new Error(
      `Swift class vtable fixture unavailable (${mode.mode}): ${JSON.stringify(metadata.coverage)}`,
    );
  if (
    !metadata.swift_conformances.some(
      (item) =>
        item.type_name === "ReaWitnessFixture" &&
        item.protocol_name === "ReaWitnessFixtureProtocol",
    ) ||
    !metadata.swift_dispatch_slots.some(
      (item) =>
        item.owner === "ReaWitnessFixture: ReaWitnessFixtureProtocol" &&
        item.implementation_address !== null,
    ) ||
    fixupCoverage(metadata)?.reason?.startsWith(mode.fixups) !== true ||
    (mode.mode === "dyld-info") !==
      (fixupCoverage(metadata)?.reason?.includes(
        "LC_DYLD_INFO bind opcodes",
      ) ===
        true)
  )
    throw new Error(
      `Swift metadata fixture drifted (${mode.mode}): ${JSON.stringify(metadata)}`,
    );
};

const checkSelectedSwiftFacet = (metadata, facet) => {
  if (facet === "swift-conformances") checkExternalSwift(metadata);
  const selected = facet === "swift-vtables" ? "class_vtable" : "witness_table";
  assert.equal(metadata.objc_classes.length, 0);
  assert.ok(
    metadata.swift_dispatch_slots.some((slot) => slot.table_kind === selected),
  );
  assert.ok(
    metadata.swift_dispatch_slots.every((slot) => slot.table_kind === selected),
  );
  assert.equal(
    metadata.coverage.find(
      ({ facet }) => facet === "objc_class_method_ivar_metadata",
    )?.status,
    "not_requested",
  );
  const other =
    facet === "swift-vtables"
      ? "swift_conformances_static_witness_slots"
      : "swift_class_vtable_descriptors";
  assert.equal(
    metadata.coverage.find(({ facet }) => facet === other)?.status,
    "not_requested",
  );
};

const verifyConformanceDiscovery = async (client, path, advertised, ajv) => {
  const validateInput = ajv.compile(advertised.inputSchema);
  for (const filter of [
    {},
    { protocol_name: null, type_name: null },
    { protocol_name: "" },
    { type_name: "", extra: true },
  ])
    assert.equal(
      validateInput({
        facet: "swift-conformances",
        swift_conformance_filter: filter,
      }),
      false,
    );
  const checks = [];
  for (const [protocol, type, expected] of [
    ["ReaWitnessFixtureProtocol", null, "ReaWitnessFixture"],
    [null, "ReaWitnessFixture", "ReaWitnessFixture"],
    ["ReaWitnessFixtureProtocol", "ReaWitnessFixture", "ReaWitnessFixture"],
    [null, "ReaArrayFixture", "ReaArrayFixture"],
    [null, "MissingType", null],
  ]) {
    const input = {
      facet: "swift-conformances",
      max_records: 64,
      swift_conformance_filter: { protocol_name: protocol, type_name: type },
    };
    assert.equal(
      validateInput(input),
      true,
      JSON.stringify(validateInput.errors),
    );
    const options = ["--facet", "swift-conformances", "--max-records", "64"];
    if (protocol !== null) options.push("--swift-protocol-name", protocol);
    if (type !== null) options.push("--swift-type-name", type);
    const cli = parseEvidence(
      await artifactCliEvidence(
        "inspect-native-dispatch-metadata",
        path,
        options,
      ),
    );
    const response = await client.callTool({
      name: advertised.name,
      arguments: input,
    });
    assert.notEqual(response.isError, true, JSON.stringify(response));
    assert.equal(
      ajv.validate(advertised.outputSchema, response.structuredContent),
      true,
      JSON.stringify(ajv.errors),
    );
    toolContract(advertised.name).outputSchema.parse(
      response.structuredContent,
    );
    const mcp = parseEvidence(response.structuredContent);
    assert.deepEqual(
      JSON.parse(response.content.find(({ type }) => type === "text").text),
      mcp,
    );
    assert.deepEqual(mcp.normalized_result, cli.normalized_result);
    assert.deepEqual(mcp.parameters, cli.parameters);
    const metadata = nativeDispatchMetadataResultSchema.parse(
      mcp.normalized_result,
    ).result;
    const discovery = metadata.swift_conformance_discovery;
    assert.ok(discovery);
    assert.equal(discovery.examined, discovery.index_entries);
    assert.equal(discovery.matched, expected === null ? 0 : 1);
    assert.deepEqual(
      metadata.swift_conformances.map(({ type_name }) => type_name),
      expected === null ? [] : [expected],
    );
    if (type === "ReaArrayFixture")
      assert.ok(metadata.swift_conformances[0].protocol_reference?.symbol);
    if (expected === null) assert.equal(discovery.unresolved, 0);
    checks.push({
      filter: discovery.filter,
      matched: discovery.matched,
      unresolved: discovery.unresolved,
      examined: discovery.examined,
      cli_mcp_equal: true,
    });
  }
  return checks;
};

const root = await mkdtemp(join(tmpdir(), "rea-dispatch-"));
const discoveryChecks = [];
let report;
try {
  const results = [];
  for (const mode of LINK_MODES) {
    const objcPath = join(root, `fixture-${mode.mode}`);
    await exec("/usr/bin/xcrun", [
      "clang",
      "-O2",
      "-framework",
      "Foundation",
      ...mode.flags,
      source("dispatch.m"),
      "-o",
      objcPath,
    ]);
    for (const variant of ["symbols", "stripped"]) {
      if (variant === "stripped")
        await exec("/usr/bin/strip", ["-x", objcPath]);
      const { target, metadata } = await inspect(objcPath);
      checkObjc(metadata, mode);
      if (mode.mode === "chained" && variant === "stripped") {
        const cli = await artifactCliEvidence(
          "inspect-native-dispatch-metadata",
          objcPath,
        );
        const cliResult = nativeDispatchMetadataResultSchema.parse(
          cli.normalized_result,
        );
        assert.equal(cliResult.target_sha256, target.sha256);
        checkObjc(cliResult.result, mode);
        await withArtifactMcp(objcPath, async (client) => {
          const mcpResult = nativeDispatchMetadataResultSchema.parse(
            await artifactMcpResult(client, "inspect_native_dispatch_metadata"),
          );
          assert.equal(mcpResult.target_sha256, target.sha256);
          checkObjc(mcpResult.result, mode);
          assert.deepEqual(mcpResult.result, cliResult.result);
        });
      }
      results.push({
        variant: `objc-${mode.mode}-${variant}`,
        target_sha256: target.sha256,
        classes: metadata.objc_classes.length,
        categories: metadata.objc_categories.length,
        implementations: metadata.objc_dispatch_implementations.length,
        fixups: fixupCoverage(metadata)?.reason,
      });
    }
    if (!mode.swift) continue;
    const swiftPath = join(root, `libReaWitnessFixture-${mode.mode}.dylib`);
    await exec("/usr/bin/xcrun", [
      "swiftc",
      "-emit-library",
      "-O",
      "-module-cache-path",
      join(root, "swift-module-cache"),
      ...mode.flags
        .map((flag) => flag.replace(/^-Wl,/u, "-Xlinker\0"))
        .flatMap((flag) => flag.split("\0")),
      source("dispatch.swift"),
      "-o",
      swiftPath,
    ]);
    // Compiler symbols are a supplemental oracle, never metadata recovery.
    const oracle = await resilientOracle(swiftPath);
    for (const variant of ["symbols", "stripped"]) {
      if (variant === "stripped")
        await exec("/usr/bin/strip", ["-x", swiftPath]);
      const { target, metadata } = await inspect(swiftPath);
      checkSwift(metadata, mode);
      checkResilientSwift(metadata, oracle);
      if (mode.mode === "chained" && variant === "stripped") {
        await withArtifactMcp(swiftPath, async (client) => {
          const { tools } = await client.listTools();
          const advertised = tools.find(
            ({ name }) => name === "inspect_native_dispatch_metadata",
          );
          assert.ok(advertised);
          const ajv = new Ajv2020({ strict: false, validateFormats: false });
          assert.equal(ajv.validateSchema(advertised.inputSchema), true);
          assert.equal(ajv.validateSchema(advertised.outputSchema), true);
          // The SDK shares enum definitions through local $refs. Verify the
          // advertised semantics instead of assuming an inline enum layout.
          const validateInput = ajv.compile(advertised.inputSchema);
          assert.equal(validateInput({}), true);
          for (const facet of [
            "all",
            "objc",
            "swift-conformances",
            "swift-vtables",
          ])
            assert.equal(
              validateInput({ facet }),
              true,
              JSON.stringify(validateInput.errors),
            );
          for (const facet of ["swift-witnesses", "", 0, null])
            assert.equal(validateInput({ facet }), false);
          assert.equal(
            validateInput({ facet: "swift-vtables", unexpected: true }),
            false,
          );
          assert.equal(
            validateInput({ facet: "swift-vtables", max_records: 0 }),
            false,
          );
          assert.equal(
            validateInput({ facet: "swift-vtables", max_records: 20001 }),
            false,
          );
          assert.equal(
            validateInput({ facet: "swift-vtables", max_records: 20000 }),
            true,
          );
          for (const facet of ["swift-conformances", "swift-vtables"]) {
            assert.equal(ajv.validate(advertised.inputSchema, { facet }), true);
            const cli = await artifactCliEvidence(
              "inspect-native-dispatch-metadata",
              swiftPath,
              ["--facet", facet],
            );
            const cliResult = nativeDispatchMetadataResultSchema.parse(
              cli.normalized_result,
            );
            assert.equal(cli.parameters.facet, facet);
            assert.equal(cliResult.target_sha256, target.sha256);
            checkSelectedSwiftFacet(cliResult.result, facet);
            if (facet === "swift-conformances")
              checkResilientSwift(cliResult.result, oracle);
            const response = await client.callTool({
              name: "inspect_native_dispatch_metadata",
              arguments: { facet },
            });
            assert.notEqual(response.isError, true, JSON.stringify(response));
            assert.equal(
              ajv.validate(advertised.outputSchema, response.structuredContent),
              true,
              JSON.stringify(ajv.errors),
            );
            const mcpResult = nativeDispatchMetadataResultSchema.parse(
              response.structuredContent.normalized_result,
            );
            checkSelectedSwiftFacet(mcpResult.result, facet);
            if (facet === "swift-conformances")
              checkResilientSwift(mcpResult.result, oracle);
            assert.deepEqual(mcpResult, cliResult);
          }
          discoveryChecks.push(
            ...(await verifyConformanceDiscovery(
              client,
              swiftPath,
              advertised,
              ajv,
            )),
          );
        });
      }
      results.push({
        variant: `swift-${mode.mode}-${variant}`,
        target_sha256: target.sha256,
        conformances: metadata.swift_conformances.length,
        slots: metadata.swift_dispatch_slots.length,
        resilient_records: metadata.swift_resilient_witnesses.length,
        resilient_compiler_oracle: oracle,
        fixups: fixupCoverage(metadata)?.reason,
      });
    }
  }
  report = {
    ok: true,
    target_executed: false,
    fixtures: results,
    conformance_discovery: discoveryChecks,
  };
} finally {
  await rm(root, { recursive: true, force: true });
}
process.stdout.write(`${JSON.stringify(report)}\n`);
