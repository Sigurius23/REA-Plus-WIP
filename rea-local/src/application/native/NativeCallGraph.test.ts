import { projectAnalysisError } from "../../domain/analysisErrorProjection.js";
import { expect, it } from "vitest";
import { EnhancedTools } from "../EnhancedTools.js";
import { createAnalysisExecution } from "../AnalysisProvider.js";
import {
  AnalysisCancelledError,
  AnalysisOutputError,
} from "../../domain/analysisErrorCore.js";
import { HopperCancelledError } from "../../domain/hopperErrors.js";
import { ProviderCleanupError } from "../../domain/providerCleanupError.js";
import { nativeCallGraphPartialSchema } from "../../domain/native/nativeObservation.js";
import { ok, err } from "../../domain/result.js";
const observe = (result: unknown) =>
  ok(
    createAnalysisExecution(
      result,
      { id: "fixture", name: "Fixture", version: "1" },
      {
        limitations: ["Retained prefix caveat"],
        subject: { path: "/fixture", sha256: "a".repeat(64), format: "elf" },
      },
    ),
  );
it("stops graph admission on cancellation or unsafe cleanup and retains observed nodes and pending identities", async () => {
  for (const error of [
    new AnalysisCancelledError("procedure_callees"),
    new HopperCancelledError(),
    new ProviderCleanupError("fixture", ["provider"], {
      reason: "cleanup unconfirmed",
    }),
  ]) {
    const calls: string[] = [];
    const result = await new EnhancedTools({
      execute: async (name, args) => {
        if (name === "procedure_address") return observe("0x1");
        calls.push(String(args.procedure));
        if (args.procedure === "0x1") return observe(["0x2", "0x3"]);
        if (args.procedure === "0x2") return err(error);
        throw Error("Admission after interrupted provider");
      },
    }).execute("get_call_graph", { address: "selected", direction: "forward" });
    if (result.ok) throw Error("Expected typed interruption");
    expect(calls).toEqual(["0x1", "0x2"]);
    expect(
      nativeCallGraphPartialSchema.parse(
        projectAnalysisError(result.error).details?.partial_observation,
      ),
    ).toMatchObject({
      graph: { "0": [{ address: "0x1", status: "ok", calls: ["0x2", "0x3"] }] },
      pending_addresses: ["0x2", "0x3"],
      complete: false,
      source: {
        provider: { id: "fixture" },
        limitations: ["Retained prefix caveat"],
        subject: { path: "/fixture" },
      },
    });
  }
});
it("retains ordinary node errors and continues other admitted graph branches", async () => {
  const result = await new EnhancedTools({
    execute: async (name, args) =>
      name === "procedure_address"
        ? observe("0x1")
        : args.procedure === "0x1"
          ? observe(["0x2", "0x3"])
          : args.procedure === "0x2"
            ? err(new AnalysisOutputError(name, "unavailable node"))
            : observe([]),
  }).execute("get_call_graph", { address: "selected", direction: "forward" });
  if (!result.ok) throw result.error;
  expect(result.value).toMatchObject({
    "1": [
      { address: "0x2", status: "error" },
      { address: "0x3", status: "ok", calls: [] },
    ],
  });
});
