import { open } from "node:fs/promises";
import { join } from "node:path";
import { describe, expect, it } from "vitest";
import { NativeMacOSProvider } from "../../../../src/native/NativeMacOSProvider.js";
import { projectAnalysisError } from "../../../../src/domain/analysisErrorProjection.js";
import {
  NativeFixtureRunner,
  nativeMachoTargetForFile,
} from "../../../fixtures/nativeCommands.js";
import { createTestTempDirectory } from "../../../fixtures/temporaryDirectory.js";

describe("Apple metadata whole-file snapshot policy", () => {
  it.each([false, true])(
    "admits an explicitly budgeted large Mach-O (universal=%s) and preserves identity/cancellation",
    async (universal) => {
      const root = await createTestTempDirectory("rea-dispatch-snapshot-");
      const path = join(root, "large-metadata.bin");
      const size = 70 * 1024 * 1024;
      const slice = universal ? 4096 : 0;
      const header = Buffer.alloc(slice + 32);
      if (universal) {
        header.writeUInt32BE(0xcafebabe, 0);
        header.writeUInt32BE(1, 4);
        header.writeUInt32BE(0x100000c, 8);
        header.writeUInt32BE(slice, 16);
        header.writeUInt32BE(size - slice, 20);
        header.writeUInt32BE(12, 24);
      }
      header.writeUInt32LE(0xfeedfacf, slice);
      header.writeUInt32LE(0x100000c, slice + 4);
      header.writeUInt32LE(2, slice + 12);
      const file = await open(path, "w");
      try {
        await file.write(header);
        await file.truncate(size);
      } finally {
        await file.close();
      }
      const target = await nativeMachoTargetForFile(path);
      const client = new NativeMacOSProvider(
        {},
        new NativeFixtureRunner(),
        "darwin",
      ).createClient(target);
      try {
        const refused = await client.execute(
          "inspect_native_dispatch_metadata",
          {
            facet: "swift-vtables",
          },
        );
        if (refused.ok) throw new Error("Expected the unchanged default limit");
        expect(projectAnalysisError(refused.error)).toMatchObject({
          code: "resource_constraint",
          retryable: false,
          remediation: { action: expect.stringContaining("--max-file-bytes") },
          details: {
            resource: "file-size",
            reported_limits: {
              max_file_bytes: 67108864,
              observed_file_bytes: size,
            },
          },
        });
        const admitted = await client.execute(
          "inspect_native_dispatch_metadata",
          {
            facet: "swift-vtables",
            max_file_bytes: size,
          },
        );
        if (!admitted.ok) throw admitted.error;
        expect(admitted.value.result).toMatchObject({
          target_sha256: target.sha256,
        });
        const cancelled = await client.execute(
          "inspect_native_dispatch_metadata",
          { max_file_bytes: size },
          { signal: AbortSignal.abort() },
        );
        if (cancelled.ok) throw new Error("Expected cancellation");
        expect(cancelled.error._tag).toBe("AnalysisCancelledError");

        const changed = await open(path, "r+");
        try {
          await changed.write(Buffer.from([1]), 0, 1, size - 1);
        } finally {
          await changed.close();
        }
        const stale = await client.execute("inspect_native_dispatch_metadata", {
          max_file_bytes: size,
        });
        if (stale.ok)
          throw new Error("Expected changed input identity rejection");
        expect(stale.error._tag).toBe("EvidenceIntegrityError");
      } finally {
        await client.close();
      }
    },
  );
});
