import { createHash } from "node:crypto";
import { expect, it } from "vitest";
import { NativeTableDispatchService } from "./NativeTableDispatchService.js";
import { NATIVE_TABLE_DISPATCH_PROVIDER } from "../InvestigationProviders.js";
import { inspectNativeTableDispatchInputSchema } from "../../domain/native/nativeTableDispatch.js";
import { parseNativeTableDispatch } from "../../native/dispatch/NativeTableDispatchParser.js";
import { dispatchFixture } from "../../native/dispatch/NativeTableDispatch.fixture.js";
import { ok } from "../../domain/result.js";

const input = {
  path: "/fixture/dispatch",
  entry_address: "0x1100",
  indices: [1],
  call_address: "0x11c8",
};
const observation = () => {
  const bytes = dispatchFixture();
  return parseNativeTableDispatch(
    bytes,
    {
      path: input.path,
      sha256: createHash("sha256").update(bytes).digest("hex"),
      bytes: bytes.length,
    },
    inspectNativeTableDispatchInputSchema.parse(input),
  );
};

it.each(["path", "indices", "source-range", "target", "indirect-mapping"])(
  "rejects provider corruption of %s before retaining Evidence",
  async (kind) => {
    const report = await observation();
    if (kind === "path") report.artifact.path = "/other";
    if (kind === "indices") report.requested_indices = [0];
    if (kind === "source-range")
      report.prefix.instructions[0]!.file_offset = report.artifact.bytes;
    if (kind === "target") report.entries[0]!.target_address = "0x1300";
    if (kind === "indirect-mapping")
      report.invocation!.link = "indirect-unresolved";
    const service = new NativeTableDispatchService({
      identity: NATIVE_TABLE_DISPATCH_PROVIDER,
      inspect: () => Promise.resolve(ok(report)),
    });
    expect(await service.inspect(input)).toMatchObject({
      ok: false,
      error: { _tag: "AnalysisOutputError" },
    });
  },
);

it("rejects malformed selections and cancellation before or after the provider completes", async () => {
  const report = await observation();
  const controller = new AbortController();
  let calls = 0;
  const service = new NativeTableDispatchService({
    identity: NATIVE_TABLE_DISPATCH_PROVIDER,
    inspect: () => {
      calls++;
      controller.abort();
      return Promise.resolve(ok(report));
    },
  });
  expect(await service.inspect({ ...input, indices: [-1] })).toMatchObject({
    ok: false,
    error: { _tag: "AnalysisInputError" },
  });
  expect(await service.inspect({ ...input, path: "relative" })).toMatchObject({
    ok: false,
    error: { _tag: "AnalysisInputError" },
  });
  expect(
    await service.inspect(input, { signal: AbortSignal.abort() }),
  ).toMatchObject({ ok: false, error: { _tag: "AnalysisCancelledError" } });
  expect(calls).toBe(0);
  expect(
    await service.inspect(input, { signal: controller.signal }),
  ).toMatchObject({ ok: false, error: { _tag: "AnalysisCancelledError" } });
  expect(calls).toBe(1);
});
