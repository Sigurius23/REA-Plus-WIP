import { expect, it } from "vitest";
import { err, ok } from "../result.js";
import { createRetainedFirmwareDecoder } from "./retainedFirmwareDecoder.js";
it("rejects byte admission before parsing and owns a copy across input chunks", () => {
  expect(
    createRetainedFirmwareDecoder(2, 1, () => {
      throw Error("Must not parse");
    }),
  ).toMatchObject({
    ok: false,
    error: { kind: "limit", boundary: "file-size" },
  });
  const decoder = createRetainedFirmwareDecoder(3, 3, (bytes) => ok(bytes));
  if (!decoder.ok) throw Error("Admission");
  const chunk = Uint8Array.from([1, 2]);
  decoder.value.write(chunk);
  chunk[0] = 9;
  decoder.value.write(Uint8Array.from([3]));
  expect(decoder.value.finish()).toEqual(ok(Uint8Array.from([1, 2, 3])));
  expect(decoder.value.finish()).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
  expect(decoder.value.write(chunk)).toMatchObject({
    ok: false,
    error: { kind: "format" },
  });
});
it("keeps growth, short-read and parser failures sticky", () => {
  for (const mode of ["growth", "short", "parse"]) {
    const d = createRetainedFirmwareDecoder(1, 1, () =>
      err({ kind: "format" as const, message: "bad structure" }),
    );
    if (!d.ok) throw Error("Admission");
    const result =
      mode === "growth"
        ? d.value.write(new Uint8Array(2))
        : mode === "parse"
          ? (d.value.write(new Uint8Array(1)), d.value.finish())
          : d.value.finish();
    expect(result).toMatchObject({ ok: false });
    expect(d.value.finish()).toEqual(result);
    expect(d.value.write(new Uint8Array())).toEqual(result);
  }
});
