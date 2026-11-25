import { createHash } from "node:crypto";
import {
  open,
  rename,
  unlink,
  writeFile,
  type FileHandle,
} from "node:fs/promises";
import { join } from "node:path";
import { buffer } from "node:stream/consumers";
import { setImmediate } from "node:timers/promises";
import { afterEach, expect, it, vi } from "vitest";
import { HexRecordArtifactReader } from "../../../src/artifacts/HexRecordArtifactReader.js";
import type { ArtifactEntry } from "../../../src/artifacts/ArtifactReader.js";
import { INTEL_SPARSE_IMAGE } from "../../../src/domain/firmware/hexRecords.fixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";

const controls = vi.hoisted(() => ({
  opened: undefined as
    | ((path: unknown, handle: FileHandle) => void)
    | undefined,
}));
vi.mock("node:fs/promises", async (importOriginal) => {
  const actual = await importOriginal<typeof import("node:fs/promises")>();
  return {
    ...actual,
    open: async (...args: Parameters<typeof actual.open>) => {
      const handle = await actual.open(...args);
      controls.opened?.(args[0], handle);
      return handle;
    },
  };
});
afterEach(() => {
  controls.opened = undefined;
  vi.restoreAllMocks();
});

async function fixture() {
  const root = await createTestTempDirectory("rea-hex-record-reader-");
  const path = join(root, "carrier.hex");
  await writeFile(path, INTEL_SPARSE_IMAGE);
  return { path, reader: new HexRecordArtifactReader(path, "intel-hex") };
}
async function entries(
  reader: HexRecordArtifactReader,
): Promise<ArtifactEntry[]> {
  const values = [];
  for await (const entry of reader.entries()) values.push(entry);
  return values;
}
const carrierHash = createHash("sha256")
  .update(INTEL_SPARSE_IMAGE)
  .digest("hex");
function latch() {
  let resolve!: () => void;
  const promise = new Promise<void>((done) => {
    resolve = done;
  });
  return { promise, resolve };
}
async function borrowed(path: string) {
  const handle = await open(path, "r");
  const reader = new HexRecordArtifactReader(path, "intel-hex", {
    handle,
    initial: await handle.stat(),
  });
  return { handle, reader };
}
function blockRead(handle: FileHandle) {
  const started = latch(),
    release = latch(),
    native = handle.read.bind(handle);
  let held = false;
  vi.spyOn(handle, "read").mockImplementation(async (...args) => {
    if (!held) {
      held = true;
      started.resolve();
      await release.promise;
    }
    return native(...args);
  });
  return { started, release };
}

it("exposes sparse region metadata and copies each emitted payload chunk so consumers cannot alter retained bytes", async () => {
  const { reader } = await fixture();
  try {
    const values = await entries(reader),
      entry = values[0];
    if (entry === undefined) throw Error("Expected the first firmware region");
    expect(values).toHaveLength(2);
    expect(entry).toMatchObject({
      byteOffset: null,
      declaredSize: 32,
      formatMetadata: {
        kind: "hex-record-region",
        start_address: 0x08000000,
        end_address: 0x0800001f,
      },
    });
    for await (const raw of await reader.open(entry)) {
      if (!Buffer.isBuffer(raw)) throw Error("Expected a binary chunk");
      raw.fill(0xff);
    }
    expect(await buffer(await reader.open(entry))).toEqual(
      Buffer.from(Array.from({ length: 32 }, (_, i) => i)),
    );
    expect(reader.formatMetadata()).toMatchObject({
      kind: "hex-records",
      region_count: 2,
      data_bytes: 36,
    });
  } finally {
    await reader.close();
  }
});

it("rejects forged source metadata and keeps returned entry copies independent of its owning inventory", async () => {
  const { reader } = await fixture();
  try {
    const [entry] = await entries(reader);
    // Text carriers declare record checksums, not a region SHA-256.
    expect(entry?.declaredSha256).toBeNull();
    if (entry?.formatMetadata?.kind !== "hex-record-region")
      throw Error("Expected firmware region metadata");
    await expect(
      reader.open({
        ...entry,
        formatMetadata: {
          ...entry.formatMetadata,
          length: entry.formatMetadata.length + 1,
        },
      }),
    ).rejects.toMatchObject({ reason: "integrity" });
    Reflect.set(entry.limitations, entry.limitations.length, "caller mutation");
    entry.formatMetadata.start_address++;
    await expect(reader.open(entry)).rejects.toMatchObject({
      reason: "integrity",
    });
    const [fresh] = await entries(reader);
    if (fresh === undefined) throw Error("Expected the unchanged source entry");
    expect(fresh.limitations).not.toContain("caller mutation");
    expect(fresh.formatMetadata).toMatchObject({ start_address: 0x08000000 });
    expect((await buffer(await reader.open(fresh))).length).toBe(32);
  } finally {
    await reader.close();
  }
});

it("leaves a borrowed descriptor open when it closes the reader and every outstanding region stream", async () => {
  const { path, reader: unused } = await fixture();
  await unused.close();
  const { handle, reader } = await borrowed(path);
  const close = vi.spyOn(handle, "close");
  try {
    const [entry] = await entries(reader);
    if (entry === undefined) throw Error("Missing region");
    const stream = await reader.open(entry);
    stream.on("error", () => undefined);
    await reader.close();
    expect(stream.destroyed).toBe(true);
    expect(stream.closed).toBe(true);
    expect(close).not.toHaveBeenCalled();
    expect((await handle.stat()).isFile()).toBe(true);
    await expect(reader.open(entry)).rejects.toMatchObject({
      reason: "unavailable",
    });
  } finally {
    await reader.close();
    await handle.close();
  }
});

it.each(["replace", "mutate", "remove"] as const)(
  "rejects carrier %s after the initial decode",
  async (change) => {
    const { path, reader } = await fixture();
    try {
      const [entry] = await entries(reader);
      if (entry === undefined) throw Error("Missing region");
      if (change === "replace") {
        await rename(path, `${path}.old`);
        await writeFile(path, INTEL_SPARSE_IMAGE);
      } else if (change === "mutate")
        await writeFile(path, INTEL_SPARSE_IMAGE + "\n");
      else await unlink(path);
      await expect(reader.open(entry)).rejects.toMatchObject({
        reason: "integrity",
      });
    } finally {
      await reader.close();
    }
  },
);

it("checks a digest bound after unbound preparation instead of trusting a cached image", async () => {
  const { reader } = await fixture();
  try {
    await entries(reader);
    await expect(reader.prepareContainer("0".repeat(64))).rejects.toMatchObject(
      { reason: "integrity" },
    );
  } finally {
    await reader.close();
  }
  const second = await fixture();
  try {
    await entries(second.reader);
    await second.reader.prepareContainer(carrierHash);
  } finally {
    await second.reader.close();
  }
});

it("honors cancellation of a waiter without cancelling the caller that owns the shared preparation", async () => {
  const { path, reader: unused } = await fixture();
  await unused.close();
  const { handle, reader } = await borrowed(path),
    gate = blockRead(handle);
  const first = reader.prepareContainer(carrierHash);
  await gate.started.promise;
  const controller = new AbortController();
  const second = reader.prepareContainer(carrierHash, controller.signal).then(
    () => null,
    (cause: unknown) => cause,
  );
  controller.abort();
  gate.release.resolve();
  try {
    await first;
    expect(await second).toMatchObject({ reason: "cancelled" });
    expect(await entries(reader)).toHaveLength(2);
  } finally {
    gate.release.resolve();
    await reader.close();
    await handle.close();
  }
});

it("settles an in-flight preparation before close releases descriptor ownership", async () => {
  const { path, reader: unused } = await fixture();
  await unused.close();
  const { handle, reader } = await borrowed(path),
    gate = blockRead(handle);
  const pending = entries(reader).then(
    () => null,
    (cause: unknown) => cause,
  );
  await gate.started.promise;
  let closed = false;
  const closing = reader.close().then(() => {
    closed = true;
  });
  await setImmediate();
  expect(closed).toBe(false);
  gate.release.resolve();
  try {
    expect(await pending).toMatchObject({ reason: "unavailable" });
    await closing;
    expect((await handle.stat()).isFile()).toBe(true);
  } finally {
    gate.release.resolve();
    await closing;
    await reader.close();
    await handle.close();
  }
});

it("retains its owned descriptor after a failed close so the next cleanup attempt can release it", async () => {
  const { path, reader } = await fixture();
  let descriptor: FileHandle | undefined,
    attempts = 0,
    blocked = true;
  controls.opened = (openedPath, handle) => {
    if (openedPath !== path) return;
    descriptor = handle;
    const native = handle.close.bind(handle);
    vi.spyOn(handle, "close").mockImplementation(async () => {
      attempts++;
      if (blocked) throw Error("owned close temporarily unavailable");
      await native();
    });
  };
  try {
    await entries(reader);
    await expect(reader.close()).rejects.toThrow(
      "owned close temporarily unavailable",
    );
    expect(descriptor?.fd).toBeGreaterThanOrEqual(0);
    expect(attempts).toBe(1);
    blocked = false;
    await reader.close();
    expect(descriptor?.fd).toBe(-1);
    expect(attempts).toBe(2);
  } finally {
    blocked = false;
    await reader.close();
  }
});
