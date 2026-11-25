import { join } from "node:path";
import { writeFile } from "node:fs/promises";
import { buffer } from "node:stream/consumers";
import { expect, it } from "vitest";
import { Uf2ArtifactReader } from "../../../src/artifacts/Uf2ArtifactReader.js";
import { DfuSeArtifactReader } from "../../../src/artifacts/DfuSeArtifactReader.js";
import {
  uf2Block,
  RP2040_FAMILY,
} from "../../../src/domain/firmware/uf2.fixture.js";
import { dfuseFile } from "../../../src/domain/firmware/dfuse.fixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";

it("snapshots UF2 family/address metadata and refuses caller-forged entry facts", async () => {
  const root = await createTestTempDirectory("rea-uf2-reader-");
  const path = join(root, "carrier");
  await writeFile(
    path,
    uf2Block({
      address: 0x1000,
      payload: [1, 2],
      blockNo: 0,
      numBlocks: 1,
      familyId: RP2040_FAMILY,
    }),
  );
  const reader = new Uf2ArtifactReader(path);
  try {
    const entries = [];
    for await (const entry of reader.entries()) entries.push(entry);
    const entry = entries[0]!;
    if (entry.formatMetadata?.kind !== "uf2-region")
      throw Error("Missing UF2 metadata");
    const forged = {
      ...entry,
      formatMetadata: { ...entry.formatMetadata, family_id: 0 },
    };
    await expect(reader.open(forged)).rejects.toMatchObject({
      reason: "integrity",
    });
    expect(await buffer(await reader.open(entry))).toEqual(Buffer.from([1, 2]));
  } finally {
    await reader.close();
  }
});
it("copies nested DfuSe target metadata and preserves source offset in entry validation", async () => {
  const root = await createTestTempDirectory("rea-dfuse-reader-");
  const path = join(root, "carrier");
  await writeFile(
    path,
    dfuseFile({
      targets: [
        {
          alternateSetting: 9,
          name: "original",
          elements: [{ address: 8, data: [3] }],
        },
      ],
    }),
  );
  const reader = new DfuSeArtifactReader(path);
  try {
    const entries = [];
    for await (const entry of reader.entries()) entries.push(entry);
    const metadata = reader.formatMetadata();
    if (metadata?.kind !== "dfuse") throw Error("Missing DfuSe metadata");
    metadata.targets[0]!.target_name = "mutated";
    expect(reader.formatMetadata()).toMatchObject({
      targets: [expect.objectContaining({ target_name: "original" })],
    });
    const entry = entries[0]!;
    expect(entry.byteOffset).toBe(293);
    await expect(
      reader.open({ ...entry, byteOffset: 8 }),
    ).rejects.toMatchObject({ reason: "integrity" });
    expect(await buffer(await reader.open(entry))).toEqual(Buffer.from([3]));
  } finally {
    await reader.close();
  }
});
