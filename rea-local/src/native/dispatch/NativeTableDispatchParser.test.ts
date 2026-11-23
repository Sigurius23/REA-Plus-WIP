import { createHash } from "node:crypto";
import { expect, it } from "vitest";
import { inspectNativeTableDispatchInputSchema } from "../../domain/native/nativeTableDispatch.js";
import { CPU, fatImage } from "../../artifacts/apple/MachoImage.fixture.js";
import { dispatchFixture } from "./NativeTableDispatch.fixture.js";
import { parseNativeTableDispatch } from "./NativeTableDispatchParser.js";

const inspect = (
  bytes: Buffer,
  extra: Record<string, unknown> = {},
  signal?: AbortSignal,
) =>
  parseNativeTableDispatch(
    bytes,
    {
      path: "/fixture/dispatch",
      sha256: createHash("sha256").update(bytes).digest("hex"),
      bytes: bytes.length,
    },
    inspectNativeTableDispatchInputSchema.parse({
      path: "/fixture/dispatch",
      entry_address: "0x1100",
      indices: [0, 1, 65535],
      call_address: "0x11c8",
      ...extra,
    }),
    signal,
  );

it("retains duplicate selected indices, preferred addresses and whole-container FAT offsets without asserting a typed domain", async () => {
  const bytes = Buffer.from(
    fatImage([{ cpu: CPU.arm64, bytes: dispatchFixture() }]),
  );
  const r = await inspect(bytes, { indices: [1, 0, 1] });
  expect(r.prefix.stop.kind).toBe("table-branch");
  expect(r.table).toMatchObject({
    address: "0x1300",
    target_anchor: "0x1120",
    input_register: "x0",
    index_mask: 65535,
  });
  expect(
    r.entries.map((e) => [e.index, e.target_address, e.entry_file_offset]),
  ).toEqual([
    [1, "0x1124", 0x1302],
    [0, "0x1120", 0x1300],
    [1, "0x1124", 0x1302],
  ]);
  expect(r.invocation).toMatchObject({
    link: "direct-to-entry",
    input_literal: "0x1",
    mapping_status: "conditional",
    mapping_index: 1,
  });
  expect(r).toMatchObject({
    typed_domain: null,
    all_entry_domain_proved: false,
    program_mutations: false,
  });
});

it.each([
  "store",
  "signed-load",
  "wrong-mask",
  "wrong-scale",
  "write-after-mask",
])("stops rather than inventing a table across %s", async (kind) => {
  const bytes = dispatchFixture();
  const [offset, word] =
    kind === "store"
      ? [0x104, 0xf90003e0]
      : kind === "signed-load"
        ? [0x110, 0x78a8792b]
        : kind === "wrong-mask"
          ? [0x100, 0x92401c08]
          : kind === "wrong-scale"
            ? [0x114, 0x8b0b054a]
            : [0x104, 0xd2800028];
  bytes.writeUInt32LE(word, offset);
  const r = await inspect(bytes);
  expect(r.table).toBeNull();
  expect(r.entries).toEqual([]);
  expect(r.invocation?.mapping_status).toBe("unresolved");
});

it("keeps table observations independent when indirect, wrong-target, unselected or bypassed calls cannot establish invocation mapping", async () => {
  for (const kind of [
    "indirect",
    "wrong-target",
    "unselected",
    "bypass",
  ] as const) {
    const bytes = dispatchFixture();
    if (kind === "indirect") bytes.writeUInt32LE(0xd63f02e0, 0x1c8);
    if (kind === "wrong-target") bytes.writeUInt32LE(0x97ffffcf, 0x1c8);
    if (kind === "bypass") bytes.writeUInt32LE(0x14000012, 0x180);
    const r = await inspect(
      bytes,
      kind === "unselected" ? { indices: [0] } : {},
    );
    expect(r.entries[0]?.status).toBe("mapped-target");
    expect(r.invocation?.mapping_status).toBe("unresolved");
    expect(r.invocation?.mapping_index).toBeNull();
    if (kind === "bypass")
      expect(r.invocation?.known_bypass?.address).toBe("0x1180");
    if (kind === "indirect")
      expect(r.invocation).toMatchObject({
        link: "indirect-unresolved",
        input_literal: "0x1",
        effective_index: 1,
      });
  }
});

it("preserves per-index failures and partial prefix budget rather than reporting an exhaustive table", async () => {
  const bytes = dispatchFixture();
  bytes.writeUInt16LE(65535, 0x302);
  const r = await inspect(bytes);
  expect(r.entries.map((e) => e.status)).toEqual([
    "mapped-target",
    "non-executable-target",
    "unmapped-entry",
  ]);
  const partial = await inspect(bytes, { max_instructions: 3 });
  expect(partial.prefix.stop).toMatchObject({
    kind: "instruction-budget",
    address: "0x110c",
  });
  expect(partial.table).toBeNull();
});

it("rejects writable source bytes, PAC slices, malformed maps and cancellation", async () => {
  const bytes = dispatchFixture();
  bytes.writeUInt32LE(7, 92);
  expect((await inspect(bytes)).prefix.stop.kind).toBe("unmapped-code");
  bytes.writeUInt32LE(2, 8);
  await expect(inspect(bytes)).rejects.toThrow(/arm64e/u);
  bytes.writeUInt32LE(0, 8);
  bytes.writeBigUInt64LE(999999n, 80);
  await expect(inspect(bytes)).rejects.toThrow(/Segment file range/u);
  await expect(
    inspect(dispatchFixture(), {}, AbortSignal.abort()),
  ).rejects.toThrow(/cancelled/u);
});
