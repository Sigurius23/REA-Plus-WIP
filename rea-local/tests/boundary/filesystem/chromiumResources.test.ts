import { symlink, writeFile } from "node:fs/promises";
import { join } from "node:path";
import { describe, expect, it } from "vitest";
import { createChromiumResourcesService } from "../../../src/composition/binaryDiagnostics.js";
import { chromiumDataPackFixture } from "../../../src/native/chromium/ChromiumResourcePack.fixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";

describe("Chromium resource stable-file boundary", () => {
  it("preserves empty resources, ID zero, nonzero padding, aliases and unclaimed bytes", async () => {
    const root = await createTestTempDirectory("rea-chromium-layout-");
    const path = join(root, "resources.pak");
    await writeFile(
      path,
      chromiumDataPackFixture({
        resources: [
          { id: 0, bytes: Buffer.alloc(0) },
          { id: 4, bytes: Buffer.from("known") },
        ],
        aliases: [{ id: 10, targetId: 4 }],
        padding: [1, 2, 3],
        trailing: Buffer.from("tail"),
      }),
    );
    const result = await createChromiumResourcesService().inspect({
      path,
      resource_id: 10,
    });
    if (!result.ok) throw result.error;
    expect(result.value.normalized_result).toMatchObject({
      canonical_resources: 2,
      alias_resources: 1,
      entries: [
        { resource_id: 0, payload: { bytes: 0 } },
        { resource_id: 4 },
        { resource_id: 10, alias: true, canonical_resource_id: 4 },
      ],
      layout: { padding_hex: "010203", unclaimed_ranges: [{ bytes: 4 }] },
      resource: {
        bytes_hex: Buffer.from("known").toString("hex"),
        text_preview: "known",
      },
    });
  });

  it("keeps binary resources inert inside a UTF16 pack and distinguishes selected text", async () => {
    const root = await createTestTempDirectory("rea-chromium-encoding-");
    const path = join(root, "locale.pak");
    const service = createChromiumResourcesService();
    await writeFile(
      path,
      chromiumDataPackFixture({
        encoding: 2,
        resources: [
          { id: 1, bytes: Buffer.from("π😀", "utf16le") },
          { id: 2, bytes: Buffer.from([0xff]) },
        ],
      }),
    );
    for (const [resource_id, text_preview] of [
      [1, "π😀"],
      [2, null],
    ] as const) {
      const result = await service.inspect({ path, resource_id });
      if (!result.ok) throw result.error;
      expect(result.value.normalized_result).toMatchObject({
        resource: { text_preview },
      });
    }
  });

  it("returns typed file, budget and cancellation errors", async () => {
    const root = await createTestTempDirectory("rea-chromium-acquisition-");
    const path = join(root, "resources.pak"),
      alias = join(root, "alias.pak");
    await writeFile(path, chromiumDataPackFixture());
    await symlink(path, alias);
    const service = createChromiumResourcesService();
    for (const candidate of [root, alias, join(root, "missing.pak")]) {
      const result = await service.inspect({ path: candidate });
      if (result.ok) throw new Error("Expected acquisition error");
      expect(result.error._tag).toBe("AnalysisInputError");
    }
    for (const input of [
      { path, max_file_bytes: 15 },
      { path, resource_id: 10, max_resource_bytes: 4 },
    ]) {
      const result = await service.inspect(input);
      if (result.ok) throw new Error("Expected budget refusal");
      expect(result.error._tag).toBe("AnalysisResourceConstraintError");
    }
    const result = await service.inspect(
      { path },
      { signal: AbortSignal.abort() },
    );
    if (result.ok) throw new Error("Expected cancellation");
    expect(result.error._tag).toBe("AnalysisCancelledError");
  });
});
