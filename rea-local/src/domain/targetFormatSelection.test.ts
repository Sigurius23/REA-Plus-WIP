import { expect, it } from "vitest";
import { snapshotTarget, snapshotMatchesTarget } from "./analysisSnapshot.js";
import { createEvidence, parseEvidence } from "./evidence.js";
import type { BinaryTarget } from "./binaryTargetTypes.js";
import { openBinaryInputSchema } from "../contracts/sessionLifecycleInputs.js";
it("binds raw flash interpretation choices into snapshot and Evidence identity", () => {
  const target: BinaryTarget = {
    path: "/tmp/flash.bin",
    sha256: "a".repeat(64),
    kind: "archive",
    format: "esp-flash-image",
    espFlashSelection: { flash_offset: "0x00001000" },
  };
  const changed: BinaryTarget = {
    ...target,
    espFlashSelection: { flash_offset: "0x0" },
  };
  expect(snapshotTarget(target).esp_flash_selection).toEqual({
    flash_offset: "0x00001000",
  });
  expect(snapshotMatchesTarget(snapshotTarget(target), changed)).toBe(false);
  const provider = { id: "artifact", name: "Artifact", version: null };
  const evidence = createEvidence(target, provider, {
    operation: "test",
    parameters: {},
    result: { same: true },
  });
  expect(parseEvidence(evidence).subject?.esp_flash_selection).toEqual({
    flash_offset: "0x00001000",
  });
  expect(
    createEvidence(changed, provider, {
      operation: "test",
      parameters: {},
      result: { same: true },
    }).evidence_id,
  ).not.toBe(evidence.evidence_id);
});
it("rejects unused or misaligned flash selectors and preserves explicit zero", () => {
  expect(
    openBinaryInputSchema.safeParse({ path: "/tmp/a", flash_offset: "0x0" })
      .success,
  ).toBe(false);
  expect(
    openBinaryInputSchema.safeParse({
      path: "/tmp/a",
      format: "esp-flash-image",
      partition_table_offset: "0x8001",
    }).success,
  ).toBe(false);
  expect(
    openBinaryInputSchema.parse({
      path: "/tmp/a",
      format: "esp-flash-image",
      flash_offset: "0x00000000",
    }).flash_offset,
  ).toBe("0x00000000");
});
