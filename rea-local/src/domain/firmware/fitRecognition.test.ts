import { expect, it } from "vitest";
import { recognizeFitCarrier } from "./fitRecognition.js";
const words = (...values: number[]) => {
  const b = Buffer.alloc(values.length * 4);
  values.forEach((v, i) => b.writeUInt32BE(v, i * 4));
  return b;
};
const begin = (name: string) => {
  const b = Buffer.from(name + "\0");
  return Buffer.concat([words(1), b, Buffer.alloc((4 - (b.length % 4)) % 4)]);
};
function carrier(structure: Buffer, version = 17) {
  const header = words(
    0xd00dfeed,
    56 + structure.length,
    56,
    56 + structure.length,
    40,
    version,
    16,
    0,
    0,
    structure.length,
  );
  return Buffer.concat([header, Buffer.alloc(16), structure]);
}
it("finds /images beyond the old prefix window while skipping opaque property payloads", async () => {
  const padding = Buffer.alloc(1024 * 1024);
  const file = carrier(
    Buffer.concat([
      begin(""),
      words(3, padding.length, 0),
      padding,
      begin("images"),
      words(2, 2, 9),
    ]),
  );
  const requests: { offset: number; length: number }[] = [];
  expect(
    await recognizeFitCarrier(
      file.subarray(0, 524),
      file.length,
      async (offset, length) => {
        requests.push({ offset, length });
        return file.subarray(offset, offset + length);
      },
    ),
  ).toBe(true);
  expect(requests.every((row) => row.length <= 65536)).toBe(true);
  expect(requests.reduce((sum, row) => sum + row.length, 0)).toBeLessThan(1024);
});
it.each([16, 17])(
  "accepts version %i and keeps ordinary/non-top-level devicetrees distinct",
  async (version) => {
    for (const [nodes, expected] of [
      [Buffer.concat([begin("images"), words(2)]), true],
      [Buffer.concat([begin("board"), begin("images"), words(2, 2)]), false],
    ] as const) {
      const file = carrier(
        Buffer.concat([begin(""), nodes, words(2, 9)]),
        version,
      );
      expect(
        await recognizeFitCarrier(file, file.length, async () => {
          throw Error("Unexpected read");
        }),
      ).toBe(expected);
    }
  },
);
it("refuses out-of-range properties, unterminated names and unsupported versions", async () => {
  for (const file of [
    carrier(Buffer.concat([begin(""), words(3, 0xffffffff, 0)])),
    carrier(Buffer.concat([begin(""), words(1), Buffer.from("images")])),
    carrier(Buffer.concat([begin(""), begin("images"), words(2, 2, 9)]), 18),
  ]) {
    expect(
      await recognizeFitCarrier(
        file,
        file.length,
        async () => new Uint8Array(),
      ),
    ).toBe(false);
  }
});
it("preserves read/cancellation failures instead of turning them into a negative recognition", async () => {
  const file = carrier(
    Buffer.concat([
      begin(""),
      Buffer.alloc(4096, 0),
      begin("images"),
      words(2, 2, 9),
    ]),
  );
  const error = new Error("cancelled owner");
  await expect(
    recognizeFitCarrier(file.subarray(0, 40), file.length, async () => {
      throw error;
    }),
  ).rejects.toBe(error);
});
