import assert from "node:assert/strict";
import { resolve } from "node:path";
import { createReadStream } from "node:fs";
import { createHash } from "node:crypto";
import { performance } from "node:perf_hooks";
import { Client } from "@modelcontextprotocol/client";
import { StdioClientTransport } from "@modelcontextprotocol/client/stdio";
const path = resolve(process.argv[2] ?? "");
assert.ok(process.argv[2], "Supply an owned APK path");
const timeout = Number(
  process.env.REA_ANDROID_MEASUREMENT_TIMEOUT_MS ?? 600000,
);
const scanMode = process.env.REA_ANDROID_MEASUREMENT_MODE ?? "decompiled";
const repeats = Number(process.env.REA_ANDROID_MEASUREMENT_REPEATS ?? 2);
const limit = Number(process.env.REA_ANDROID_MEASUREMENT_CLASS_LIMIT ?? 8192);
const hash = async () => {
  const digest = createHash("sha256");
  for await (const chunk of createReadStream(path)) digest.update(chunk);
  return digest.digest("hex");
};
const before = await hash();
const client = new Client({
  name: "rea-android-string-measurement",
  version: "1",
});
const transport = new StdioClientTransport({
  command: process.execPath,
  args: [resolve(import.meta.dirname, "../../rea.mjs"), "mcp"],
  env: { ...process.env },
  stderr: "pipe",
});
const records = [];
try {
  await client.connect(transport);
  for (let index = 0; index < repeats; index++) {
    process.stderr.write(
      `Starting scan ${index + 1}/${repeats}; class_limit=${limit}, deadline=${timeout}ms\n`,
    );
    const started = performance.now();
    const reply = await client.callTool(
      {
        name: "search_android_strings",
        arguments: {
          path,
          query: "rea_offline_measurement_no_match_20261027",
          class_limit: limit,
          analysis_timeout_ms: timeout,
          scan_mode: scanMode,
        },
      },
      { timeout: timeout + 30000 },
    );
    const value =
      reply.structuredContent ??
      JSON.parse(reply.content.find((entry) => entry.type === "text").text);
    records.push({
      index: index + 1,
      elapsed_ms: Math.round(performance.now() - started),
      is_error: reply.isError === true,
      result: value,
    });
    process.stderr.write(
      `Finished scan ${index + 1}: ${JSON.stringify(value.normalized_result === undefined ? { code: value.error?.code, details: value.error?.details?.timeout_ms } : { scanned_classes: value.normalized_result.scanned_classes, scanned_methods: value.normalized_result.scanned_methods, skipped_methods: value.normalized_result.skipped_methods, coverage: value.normalized_result.coverage })}\n`,
    );
  }
} finally {
  await client.close();
}
assert.equal(await hash(), before, "Original APK changed");
console.log(
  JSON.stringify(
    {
      path,
      sha256: before,
      class_limit: limit,
      scan_mode: scanMode,
      analysis_timeout_ms: timeout,
      records,
    },
    null,
    2,
  ),
);
