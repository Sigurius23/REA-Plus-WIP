import { HopperCancelledError } from "../../domain/hopperErrors.js";
import { expect, it } from "vitest";
import { EnhancedTools } from "../EnhancedTools.js";
import {
  createAnalysisExecution,
  type AnalysisOperationPort,
} from "../AnalysisProvider.js";
import { AnalysisCancelledError } from "../../domain/analysisErrorCore.js";
import { ProviderCleanupError } from "../../domain/providerCleanupError.js";
import { projectAnalysisError } from "../../domain/analysisErrorProjection.js";
import { ok, err } from "../../domain/result.js";
import {
  batchDecompileResultSchema,
  batchDecompilePartialSchema,
} from "../../domain/native/batchDecompile.js";
const observe = (result: unknown, limitations: string[] = []) =>
  ok(
    createAnalysisExecution(
      result,
      { id: "fixture", name: "Fixture", version: "1" },
      {
        limitations,
        subject: {
          path: "/fixture/owned",
          sha256: "a".repeat(64),
          format: "elf",
        },
      },
    ),
  );
it("keeps one provider read active and retains each repeated selector's own null/body outcome", async () => {
  let active = 0,
    peak = 0,
    read = 0;
  const port: AnalysisOperationPort = {
    execute: async (name, args) => {
      active++;
      peak = Math.max(peak, active);
      await new Promise((resolve) => setImmediate(resolve));
      active--;
      if (name === "procedure_address") return observe("0x10");
      if (name === "address_name") return observe("canonical");
      if (name !== "procedure_pseudo_code") throw Error(String(args));
      read++;
      return observe(read === 2 ? null : `body ${read}`, [`caveat ${read}`]);
    },
  };
  const result = await new EnhancedTools(port).execute("batch_decompile", {
    addresses: ["same", "same", "same"],
  });
  if (!result.ok) throw result.error;
  expect(peak).toBe(1);
  expect(batchDecompileResultSchema.parse(result.value)).toMatchObject({
    total: 3,
    succeeded: 2,
    failed: 1,
    items: [
      { status: "ok", limitations: ["caveat 1"] },
      {
        status: "unavailable",
        reason: "no_pseudocode",
        limitations: ["caveat 2"],
      },
      { status: "ok", pseudocode: "body 3", limitations: ["caveat 3"] },
    ],
  });
});
for (const phase of [
  "procedure_address",
  "address_name",
  "procedure_pseudo_code",
] as const) {
  it(`retains completed facts and stops provider admission on cancellation/cleanup at ${phase}`, async () => {
    for (const outcome of ["cancelled", "hopper-cancelled", "cleanup"]) {
      const cleanup = outcome === "cleanup";
      let reads = 0,
        stopped = false;
      const port: AnalysisOperationPort = {
        execute: async (name) => {
          if (stopped) throw Error("Provider admission after retirement");
          if (reads === 1 && name === phase) {
            stopped = true;
            return err(
              cleanup
                ? new ProviderCleanupError("fixture", ["owned-provider"], {
                    reason: "cleanup unconfirmed",
                  })
                : outcome === "hopper-cancelled"
                  ? new HopperCancelledError()
                  : new AnalysisCancelledError(name),
            );
          }
          if (name === "procedure_address") return observe("0x10");
          if (name === "address_name") return observe("canonical");
          reads++;
          return observe("complete first body");
        },
      };
      const result = await new EnhancedTools(port).execute("batch_decompile", {
        addresses: ["first", "second", "unstarted"],
      });
      if (result.ok) throw Error("Expected interruption");
      const projected = projectAnalysisError(result.error),
        partial = batchDecompilePartialSchema.parse(
          projected.details?.partial_observation,
        );
      expect(partial).toMatchObject({
        requested_addresses: ["first", "second", "unstarted"],
        completed: 1,
        result: { total: 1, succeeded: 1, failed: 0 },
        source: { subject: { path: "/fixture/owned", sha256: "a".repeat(64) } },
      });
      expect(projected.code).toBe(cleanup ? "cleanup_incomplete" : "cancelled");
      expect(reads).toBe(1);
    }
  });
}
