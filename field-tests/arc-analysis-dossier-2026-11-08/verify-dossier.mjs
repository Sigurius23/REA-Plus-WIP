import fs from "node:fs/promises";
import path from "node:path";
import assert from "node:assert/strict";
import { createHash } from "node:crypto";
import { fileURLToPath, pathToFileURL } from "node:url";

const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, "../..");
const { parseEvidence } = await import(
  pathToFileURL(path.join(root, "rea-local/dist/domain/evidence.js"))
);
const { parseEvidenceBundle } = await import(
  pathToFileURL(path.join(root, "rea-local/dist/domain/evidenceBundle.js"))
);
const { analysisErrorProjectionSchema } = await import(
  pathToFileURL(path.join(root, "rea-local/dist/contracts/errorSchemas.js"))
);
const read = async (name) => JSON.parse(await fs.readFile(path.join(directory, name), "utf8"));
const sha256 = (bytes) => createHash("sha256").update(bytes).digest("hex");
const pointer = (value, location) =>
  location
    ? location
        .split("/")
        .slice(1)
        .reduce((current, key) => current[key.replaceAll("~1", "/").replaceAll("~0", "~")], value)
    : value;
const index = await read("evidence-index.json");
const evidence = new Map();
const checked = [];

for (const [anchor, entry] of Object.entries(index.evidence_records)) {
  const bytes = await fs.readFile(path.join(root, entry.path));
  assert.equal(sha256(bytes), entry.file_sha256, `${anchor}: retained file digest`);
  const record = parseEvidence(pointer(JSON.parse(bytes), entry.json_pointer));
  assert.equal(record.evidence_id, entry.evidence_id, `${anchor}: canonical Evidence identity`);
  assert.equal(record.operation, entry.operation, `${anchor}: operation`);
  assert.equal(record.subject.digest.sha256, entry.subject_sha256, `${anchor}: subject`);
  assert.equal(record.provider.id, entry.provider, `${anchor}: provider`);
  assert.equal(record.authority, entry.authority, `${anchor}: authority`);
  assert.equal(record.confidence, entry.confidence, `${anchor}: confidence`);
  assert.equal(
    record.analysis_profile?.digest ?? null,
    entry.analysis_profile_digest,
    `${anchor}: profile`,
  );
  evidence.set(anchor, record);
  checked.push({ anchor, evidence_id: record.evidence_id, path: entry.path });
}
for (const name of index.supplemental_receipts) await fs.access(path.join(root, name));

const key = await read("codingkey-verification.json");
assert.equal(
  sha256(await fs.readFile(path.join(directory, "codingkey-seeds.tsv"))),
  key.source_preparation.seed_sha256,
);
for (const seed of key.source_preparation.seed_basis) {
  const pairs = evidence.get(seed.source).normalized_result.result.swift_resilient_witnesses;
  const selected = pairs.filter(
    (row) =>
      row.requirement_reference?.symbol === seed.requirement &&
      row.implementation_address === seed.address,
  );
  assert.equal(selected.length, 1, "exact named static requirement/witness pair");
  assert.equal(selected[0].runtime_witness_table, "not_instantiated");
  assert.equal(selected[0].conformance.address, seed.conformance);
  assert.equal(selected[0].record_ordinal, seed.record_ordinal);
}
const stringValue = (row) => {
  const low = Buffer.alloc(8);
  low.writeBigUInt64LE(BigInt(row.x0));
  const high = Buffer.alloc(8);
  high.writeBigUInt64LE(BigInt(row.x1));
  const length = Number((BigInt(row.x1) >> 56n) & 15n);
  assert.equal(length, row.length);
  return Buffer.concat([low, high]).subarray(0, length).toString("utf8");
};
for (const row of key.request_getter.results) assert.equal(stringValue(row), row.value);
assert.deepEqual(
  key.request_getter.results.map((row) => row.value),
  ["boostId", "type", "data"],
);
assert.equal(stringValue(key.payload_getter), "contents");
for (const [pseudo, machine, getter] of [
  ["E40", "E41", key.request_getter],
  ["E42", "E43", key.payload_getter],
]) {
  const instructions = evidence.get(machine).normalized_result;
  assert.equal(instructions.procedure.address, getter.address);
  assert.equal(instructions.procedure.body.total_bytes, getter.body_bytes);
  assert.equal(instructions.instructions.length, getter.instruction_count);
  assert.equal(evidence.get(pseudo).parameters.procedure, getter.address);
  for (const row of getter.results ?? [getter]) {
    const low = `0x${BigInt(row.x0).toString(16)}`;
    const high = `0x${BigInt(row.x1).toString(16)}`;
    assert.ok(
      evidence.get(pseudo).normalized_result.includes(low),
      `${pseudo}: String data immediate`,
    );
    assert.ok(
      evidence.get(pseudo).normalized_result.includes(high),
      `${pseudo}: String count immediate`,
    );
  }
}

const summary = await read("codingkey-getters/summary.json");
assert.equal(summary.status, "completed");
assert.equal(summary.calls, 7);
assert.equal(summary.successful, 7);
assert.equal(summary.errors, 0);
assert.equal(summary.verifier_run.process_lineage.status, "verified");
assert.deepEqual(summary.verifier_run.process_lineage.descendants, []);
const bundle = parseEvidenceBundle(await read("codingkey-getters/evidence-bundle.json"));
for (const anchor of ["E40", "E41", "E42", "E43"])
  assert.ok(
    bundle.records.some((record) => record.evidence_id === evidence.get(anchor).evidence_id),
  );

const mappings = await read("resource-path-derivation.json");
for (const row of mappings.mappings) {
  const table = evidence.get(row.table_evidence).normalized_result;
  const bytes = Buffer.from(table.bytes_hex, "hex");
  const offset = Number(BigInt(row.record_address) - BigInt(table.address));
  assert.equal(bytes.readBigUInt64LE(offset), BigInt(row.path_pointer));
  assert.equal(bytes.readUInt32LE(offset + 8), row.resource_id);
  const strings = evidence.get(row.path_evidence).normalized_result;
  const text = Buffer.from(strings.bytes_hex, "hex").subarray(
    Number(BigInt(row.path_pointer) - BigInt(strings.address)),
  );
  assert.equal(text.subarray(0, text.indexOf(0)).toString("utf8"), row.path);
}

const coreStages = [
  ["E65", "0x34b13e0"],
  ["E66", "0x34b14b4"],
  ["E67", "0x32f233c"],
  ["E68", "0x31e5204"],
];
for (const [anchor, address] of coreStages)
  assert.equal(evidence.get(anchor).parameters.procedure, address);
assert.ok(evidence.get("E65").normalized_result.includes("Failed to parse extension manifest."));
assert.ok(evidence.get("E66").normalized_result.includes("func_0x020122cc(0x3ed"));
assert.ok(evidence.get("E67").normalized_result.includes("func_0x032f406c"));
for (const callee of ["func_0x031e52b0", "func_0x02d8c700"])
  assert.ok(evidence.get("E68").normalized_result.includes(callee));
assert.equal(evidence.get("E69").normalized_result.address, "0xc9fa5fa");
assert.equal(
  Buffer.from(evidence.get("E69").normalized_result.bytes_hex, "hex").toString("utf8"),
  "key\0",
);
const completeTable = evidence.get("E70").normalized_result;
assert.equal(completeTable.address, "0x1012a7e74");
assert.equal(completeTable.complete, true);
assert.equal(completeTable.returned_bytes, 112);
assert.equal(Buffer.from(completeTable.bytes_hex, "hex").length / 4, 28);

const selectorIntegration = await read("selector-anchor-integration.json");
assert.deepEqual(
  selectorIntegration.preserved_anchors,
  Array.from({ length: 70 }, (_, index) => `E${String(index + 1).padStart(2, "0")}`),
);
const preservedPrefix = Object.fromEntries(
  selectorIntegration.preserved_anchors.map((anchor) => [anchor, index.evidence_records[anchor]]),
);
assert.equal(
  sha256(Buffer.from(JSON.stringify(preservedPrefix))),
  selectorIntegration.preserved_prefix_sha256,
  "E01–E70 entries preserved",
);
assert.deepEqual(Object.keys(selectorIntegration.appended_anchors), [
  "E71",
  "E72",
  "E73",
  "E74",
  "E75",
  "E76",
  "E77",
  "E78",
]);
for (const anchor of Object.keys(selectorIntegration.appended_anchors)) {
  assert.equal(index.evidence_records[anchor].path, selectorIntegration.appended_anchors[anchor]);
  assert.equal(
    evidence.get(anchor).subject.digest.sha256,
    index.target.arm64_main,
    "fixed 1.172.1 main input",
  );
}
const hoverClass = evidence.get("E71").normalized_result.result;
assert.deepEqual(hoverClass.swift_vtable_selection, {
  address: "0x103d7bcb4",
  index_entries: 11125,
  examined: 11125,
  matching_index_entries: 1,
  matched: true,
  unresolved: 0,
});
assert.equal(hoverClass.swift_dispatch_slots.length, 17);
assert.ok(hoverClass.swift_dispatch_slots.every((row) => row.owner === "HoveredElementTracker"));
const hoverTargets = hoverClass.swift_dispatch_slots
  .filter((row) => row.implementation_address !== null)
  .map((row) => ({ slot: row.slot_index, address: row.implementation_address }));
assert.deepEqual(hoverTargets, [
  { slot: 21, address: "0x1012e4cec" },
  { slot: 30, address: "0x1012e4d6c" },
]);
assert.equal(
  hoverClass.swift_dispatch_slots.filter((row) => row.decode.status === "partial").length,
  15,
);
assert.ok(
  hoverClass.coverage.some(
    (row) => row.facet === "swift_class_vtable_descriptors" && row.status === "partial",
  ),
);
const selectorStages = [
  ["E72", "0x1012e55f0", ["FUN_1012e560c", "_swift_task_switch"]],
  ["E73", "0x1012e4ec4", ["FUN_1012e560c", "FUN_1012e4f58"]],
  ["E74", "0x1012e56b8", ["_swift_task_dealloc", "FUN_1012e5714", "FUN_1012e5758"]],
  ["E75", "0x1012e4f58", ["_swift_errorRelease", "FUN_1012e5788"]],
  ["E76", "0x1012e4fd4", ["FUN_1012e5088", "FUN_1012e5148"]],
  ["E77", "0x1012e5088", ["PublishedV18_enclosingInstance", "FUN_1012e4d6c", "_status) = 0;"]],
  ["E78", "0x1012e5148", ["PublishedV18_enclosingInstance", "FUN_1012e4d6c", "_status) = 0;"]],
];
for (const [anchor, address, observations] of selectorStages) {
  const record = evidence.get(anchor);
  assert.equal(record.parameters.procedure, address);
  for (const observation of observations)
    assert.ok(record.normalized_result.includes(observation), `${anchor}: ${observation}`);
}
assert.ok(evidence.get("E25").normalized_result.includes("_swift_once(0x104628c48,FUN_1012e626c)"));
const selectorDirectory = path.join(root, "field-tests/arc-selector-rendering-2026-11-09");
const selectorRead = async (name) =>
  JSON.parse(await fs.readFile(path.join(selectorDirectory, name), "utf8"));
const bootstrapSummary = await selectorRead("bootstrap/summary.json");
assert.deepEqual(
  [bootstrapSummary.calls, bootstrapSummary.successful, bootstrapSummary.errors],
  [25, 23, 2],
);
assert.equal(bootstrapSummary.verifier_run.process_lineage.status, "verified");
assert.deepEqual(bootstrapSummary.verifier_run.process_lineage.descendants, []);
const errorFromReply = (reply) =>
  analysisErrorProjectionSchema.parse(
    JSON.parse(reply.content.find((block) => block.type === "text").text).error,
  );
const bootstrapClose = errorFromReply(await selectorRead("bootstrap/close.reply.json"));
assert.equal(bootstrapClose.code, "cleanup_incomplete");
const vtableTransport = errorFromReply(await selectorRead("bootstrap/swift-vtables.reply.json"));
assert.equal(vtableTransport.code, "resource_constraint");
assert.equal(vtableTransport.details.resource, "transport");
const bootstrapBundle = parseEvidenceBundle(await selectorRead("bootstrap/evidence-bundle.json"));
assert.ok(
  bootstrapBundle.records.some(
    (record) => record.evidence_id === vtableTransport.details.reported_limits.evidence_id,
  ),
  "oversized result retained in exported bundle",
);
for (const [anchor] of selectorStages)
  assert.ok(
    bootstrapBundle.records.some(
      (record) => record.evidence_id === evidence.get(anchor).evidence_id,
    ),
  );
const selectorSummary = await selectorRead("selection-after/summary.json");
assert.deepEqual(
  [selectorSummary.calls, selectorSummary.successful, selectorSummary.errors],
  [17, 13, 4],
);
assert.equal(selectorSummary.verifier_run.process_lineage.status, "verified");
assert.deepEqual(selectorSummary.verifier_run.process_lineage.descendants, []);
assert.notEqual((await selectorRead("selection-after/close.reply.json")).isError, true);
assert.deepEqual(
  parseEvidence(await selectorRead("cli-final/arc-hover-class.evidence.json")),
  evidence.get("E71"),
);

const nativeFollowup = await read("native-selector-followup-2026-11-13.json");
const preservedNativePrefix = Object.fromEntries(
  nativeFollowup.preserved_anchors.map((anchor) => [anchor, index.evidence_records[anchor]]),
);
assert.equal(
  sha256(Buffer.from(JSON.stringify(preservedNativePrefix))),
  nativeFollowup.preserved_prefix_sha256,
  "E01–E78 entries preserved",
);
for (const [anchor, filename] of Object.entries(nativeFollowup.appended_anchors))
  assert.equal(index.evidence_records[anchor].path, filename);
for (const [anchor, address] of [
  ["E79", "0x1012e4cec"],
  ["E80", "0x1012e4d6c"],
  ["E81", "0x1012e5788"],
  ["E82", "0x100958330"],
  ["E84", "0x1012e58e4"],
  ["E85", "0x1012a571c"],
  ["E87", "0x1012e5948"],
  ["E88", "0x1012e59e4"],
]) {
  assert.equal(evidence.get(anchor).parameters.procedure, address);
  assert.equal(evidence.get(anchor).subject.digest.sha256, index.target.arm64_main);
}
assert.ok(
  evidence.get("E79").normalized_result.pseudocode.includes("PublishedV18_enclosingInstance"),
);
const hoveredStart = evidence.get("E80").normalized_result.pseudocode;
assert.ok(hoveredStart.includes("FUN_1012f311c"));
assert.ok(hoveredStart.includes("_status) = 1"));
assert.ok(hoveredStart.includes("_status) = 2"));
const queryStage = evidence.get("E81").normalized_result;
assert.ok(queryStage.assembly.includes("0x1012e57c0: fdiv d0, d1, d0"));
assert.ok(queryStage.assembly.includes("0x1012e57d4: bl 0x100958330"));
const geometry = evidence.get("E82").normalized_result;
assert.deepEqual(geometry.callees.map((row) => row.name).sort(), [
  "_CGRectGetHeight",
  "_CGRectGetMinX",
  "_CGRectGetMinY",
  "_CGRectGetWidth",
]);
assert.equal(geometry.assembly.filter((line) => line.includes(": fmul ")).length, 4);
const prefix = evidence.get("E83").normalized_result;
assert.equal(prefix.address, "0x103a1df70");
assert.equal(prefix.complete, true);
assert.equal(
  Buffer.from(prefix.bytes_hex, "hex").subarray(0, 22).toString("utf8"),
  "getHoveredElement({x: ",
);
for (const target of ["FUN_1012e5948", "FUN_1012e59e4"])
  assert.ok(evidence.get("E84").normalized_result.pseudocode.includes(target));
const successfulQuery = evidence.get("E87").normalized_result;
for (const instruction of [
  "0x1012e5998: bl 0x100958330",
  "0x1012e59b4: stp d8, d9, [x21]",
  "0x1012e59b8: stp d10, d11, [x21, #0x10]",
  "0x1012e59bc: strb wzr, [x21, #0x20]",
  "0x1012e59c4: mov x20, #0x0",
])
  assert.ok(successfulQuery.assembly.includes(instruction));
assert.equal(evidence.get("E88").normalized_result.procedure.body.total_bytes, 12);
const finalReducer = evidence.get("E85").normalized_result;
assert.equal(finalReducer.procedure.body.total_bytes, 2024);
assert.equal(finalReducer.procedure.body.span_bytes, 8608);
assert.equal(
  finalReducer.native_api.jump_tables.filter((table) =>
    table.data_sources.some((source) => source.provenance === "rea-swift-enum-signed-word-table"),
  ).length,
  0,
);
const finalDirectory = path.join(
  root,
  "field-tests/arc-dispatch-load-2026-11-09/arc-final-2026-11-13",
);
const finalSummary = JSON.parse(
  await fs.readFile(path.join(finalDirectory, "summary.json"), "utf8"),
);
assert.deepEqual([finalSummary.calls, finalSummary.successful, finalSummary.errors], [20, 20, 0]);
assert.equal(finalSummary.verifier_run.process_lineage.status, "verified");
assert.deepEqual(finalSummary.verifier_run.process_lineage.descendants, []);
for (const name of ["close", "repeat-2-close", "repeat-3-close"])
  assert.notEqual(
    JSON.parse(await fs.readFile(path.join(finalDirectory, name + ".reply.json"), "utf8")).isError,
    true,
  );
for (const name of ["evidence-bundle.json", "repeat-2-bundle.json", "repeat-3-bundle.json"])
  parseEvidenceBundle(JSON.parse(await fs.readFile(path.join(finalDirectory, name), "utf8")));
const returnSummary = await selectorRead("query-return-2026-11-13/summary.json");
assert.deepEqual([returnSummary.calls, returnSummary.successful, returnSummary.errors], [5, 5, 0]);
assert.equal(returnSummary.verifier_run.process_lineage.status, "verified");
assert.deepEqual(returnSummary.verifier_run.process_lineage.descendants, []);
const recovery = JSON.parse(
  await fs.readFile(
    path.join(root, "field-tests/arc-dispatch-load-2026-11-09/arc-input-recovery-2026-11-13.json"),
    "utf8",
  ),
);
assert.equal(recovery.extraction_evidence_id, evidence.get("E86").evidence_id);
assert.equal(recovery.sha256, index.target.arm64_main);
assert.equal(recovery.source_sha256, index.target.universal_main);
assert.equal(recovery.source_offset, 87064576);

const markdown = await fs.readFile(
  path.join(directory, "../arc-analysis-dossier-2026-11-08.md"),
  "utf8",
);
const definitions = new Map(
  [...markdown.matchAll(/^\[(E\d+)\]: (.+)$/gm)].map((match) => [match[1], match[2]]),
);
assert.deepEqual(
  [...definitions.keys()].sort(),
  Object.keys(index.evidence_records).sort(),
  "every indexed anchor has one Markdown definition",
);
for (const anchor of markdown.matchAll(/\[[^\]\n]+\]\[(E\d+)\]/g))
  assert.ok(definitions.has(anchor[1]), `defined Markdown anchor ${anchor[1]}`);
for (const [anchor, target] of definitions) {
  assert.equal(
    `field-tests/${target}`,
    index.evidence_records[anchor].path,
    `${anchor}: Markdown/index agreement`,
  );
  await fs.access(path.join(directory, "..", target));
}
for (const match of markdown.matchAll(/\]\(([^)]+)\)/g)) {
  if (!match[1].includes("://")) await fs.access(path.resolve(directory, "..", match[1]));
}

const out = {
  status: "passed",
  checked_at: new Date().toISOString(),
  authority:
    "Read-only canonical Evidence authentication, retained-file hash checks and explicit analyst derivation consistency; not a rerun of Arc or a feature-completeness claim",
  indexed_evidence: checked.length,
  unique_evidence_ids: new Set(checked.map((row) => row.evidence_id)).size,
  getter_bundle_records: bundle.records.length,
  metadata_selected_getters: 2,
  decoded_keys: ["boostId", "type", "data", "contents"],
  native_path_resource_pairs: mappings.mappings.length,
  markdown_evidence_definitions: definitions.size,
  selected_core_registration_stages: coreStages.map(([anchor, address]) => ({ anchor, address })),
  selected_hover_class: {
    index_entries: 11125,
    slot_rows: 17,
    resolved_targets: hoverTargets,
    unresolved_slot_rows: 15,
    cli_mcp_equal: true,
  },
  selected_selector_stages: selectorStages.map(([anchor, address]) => ({ anchor, address })),
  native_query_followup: {
    public_calls: 20,
    sessions: 3,
    explicit_closes: 3,
    return_public_calls: 5,
    input_query: "getHoveredElement({x: …, y: …})",
    input_scale: "reciprocal getter",
    result_scale: "fresh getter",
    reducer_body_bytes: 2024,
    reducer_span_bytes: 8608,
    reducer_recovered_tables: 0,
  },
  selector_bootstrap: {
    public_calls: bootstrapSummary.calls,
    errors: bootstrapSummary.errors,
    explicit_close: bootstrapClose.code,
    transport_boundary: vtableTransport.details.resource,
    shutdown_descendants: bootstrapSummary.verifier_run.process_lineage.descendants,
  },
  selector_class_matrix: {
    public_calls: selectorSummary.calls,
    successful: selectorSummary.successful,
    expected_rejections: selectorSummary.errors,
    verifier_descendants: selectorSummary.verifier_run.process_lineage.descendants,
  },
  getter_public_calls: summary.calls,
  getter_public_errors: summary.errors,
  getter_verifier_descendants: summary.verifier_run.process_lineage.descendants,
  evidence: checked,
};
await fs.writeFile(path.join(directory, "verification.json"), `${JSON.stringify(out, null, 2)}\n`);
console.log(JSON.stringify({ ...out, evidence: undefined }));
