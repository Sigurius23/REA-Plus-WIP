import { writeFile } from "node:fs/promises";
import { join } from "node:path";

import { expect } from "vitest";

import { dataBlobSchema } from "../../../src/domain/blob/dataBlob.js";
import { parseEvidence } from "../../../src/domain/evidence.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { cliTest } from "../../support/cli/cliFixture.js";

cliTest(
  "selects a blob decoder independently of the CLI output format",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-blob-cli-");
    const path = join(root, "text.cbor");
    await writeFile(path, Buffer.from("63610062", "hex"));
    for (const output of [["--json"], ["--format", "json"]] as const) {
      const result = await cli.run({
        arguments: [
          "inspect-data-blob",
          path,
          "--blob-format",
          "cbor",
          "--view",
          "strings",
          ...output,
        ],
      });
      expect(result.exitCode, result.stdout + result.stderr).toBe(0);
      const evidence = parseEvidence(result.json);
      expect(evidence.operation).toBe("inspect_data_blob");
      const report = dataBlobSchema.parse(evidence.normalized_result);
      expect(report.format).toMatchObject({ name: "cbor", forced: true });
      expect(report.strings).toEqual([{ path: "$", offset: 0, value: "a\0b" }]);
    }
  },
);
