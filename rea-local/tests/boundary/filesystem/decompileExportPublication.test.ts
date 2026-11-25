import { access, readdir, readFile } from "node:fs/promises";
import { basename, join } from "node:path";
import { afterEach, expect, it, onTestFinished, vi } from "vitest";
import { DecompileExportFiles } from "../../../src/application/native/DecompileExportFiles.js";
import { createAnalysisProfile } from "../../../src/domain/analysisProfile.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";

const faults = vi.hoisted(() => ({
  afterClose: false,
  afterLink: false,
  stageIdentity: false,
  stageRemoval: false,
}));

vi.mock("node:fs/promises", async (importOriginal) => {
  const fs = await importOriginal<typeof import("node:fs/promises")>();
  return {
    ...fs,
    open: async (...args: Parameters<typeof fs.open>) => {
      const handle = await fs.open(...args);
      if (faults.afterClose && String(args[0]).endsWith("/content")) {
        faults.afterClose = false;
        const close = handle.close.bind(handle);
        handle.close = async () => {
          await close();
          await fs.writeFile(args[0], "changed before verification");
        };
      }
      return handle;
    },
    link: async (...args: Parameters<typeof fs.link>) => {
      await fs.link(...args);
      if (faults.afterLink) {
        faults.afterLink = false;
        await fs.writeFile(args[1], "changed after publication");
      }
    },
    lstat: async (...args: Parameters<typeof fs.lstat>) => {
      if (
        faults.stageIdentity &&
        basename(String(args[0])).startsWith(".rea-export-stage-")
      ) {
        faults.stageIdentity = false;
        throw new Error("injected staging identity failure");
      }
      return fs.lstat(...args);
    },
    rmdir: async (...args: Parameters<typeof fs.rmdir>) => {
      if (
        faults.stageRemoval &&
        basename(String(args[0])).startsWith(".rea-export-stage-")
      ) {
        faults.stageRemoval = false;
        throw new Error("injected staging removal failure");
      }
      return fs.rmdir(...args);
    },
  };
});

afterEach(() => {
  faults.afterClose = false;
  faults.afterLink = false;
  faults.stageIdentity = false;
  faults.stageRemoval = false;
});

const fixture = async (unknownStage = false) => {
  const root = join(
    await createTestTempDirectory("rea-decompile-publish-"),
    "export",
  );
  const files = new DecompileExportFiles();
  onTestFinished(async () => {
    if (unknownStage)
      await expect(files.close()).rejects.toThrow(
        "staging directory identity is unknown",
      );
    else await files.close();
  });
  await files.prepare(root, false, {
    version: 1,
    target_sha256: "a".repeat(64),
    analysis_profile: createAnalysisProfile(
      { id: "fixture", name: "Fixture", version: "1" },
      {},
    ),
    layout: "address-sha256",
  });
  return { files, root, destination: files.bodyPath("0x10") };
};

it("publishes exact bytes and refuses replacing an existing function", async () => {
  const { files, root, destination } = await fixture();
  await files.publish("provider pseudocode", destination, false);
  await expect(
    files.publish("other body", destination, false),
  ).rejects.toMatchObject({ code: "EEXIST" });
  expect(await readFile(destination, "utf8")).toBe("provider pseudocode");
  await files.close();
  expect(
    (await readdir(root)).filter((p) => p.startsWith(".rea-export-")),
  ).toEqual([]);
});

it("rejects altered staging bytes before publication and cleans only its staging inode", async () => {
  const { files, root, destination } = await fixture();
  faults.afterClose = true;
  await expect(
    files.publish("provider pseudocode", destination, false),
  ).rejects.toThrow("identity or bytes changed");
  await expect(access(destination)).rejects.toMatchObject({ code: "ENOENT" });
  await files.close();
  expect(
    (await readdir(root)).filter((p) => p.startsWith(".rea-export-")),
  ).toEqual([]);
});

it("rejects a changed published body while preserving that committed output", async () => {
  const { files, destination } = await fixture();
  faults.afterLink = true;
  await expect(
    files.publish("provider pseudocode", destination, false),
  ).rejects.toThrow("identity or bytes changed");
  await files.close();
  expect(await readFile(destination, "utf8")).toBe("changed after publication");
});

it("retains unknown staging identity and lock without inferring ownership on cleanup retry", async () => {
  const { files, root, destination } = await fixture(true);
  faults.stageIdentity = true;
  await expect(
    files.publish("provider pseudocode", destination, false),
  ).rejects.toThrow("injected staging identity failure");
  await expect(files.close()).rejects.toThrow(
    "staging directory identity is unknown",
  );
  await access(join(root, ".rea-export-lock"));
  expect(
    (await readdir(root)).filter((p) => p.startsWith(".rea-export-stage-")),
  ).toHaveLength(1);
  await expect(access(destination)).rejects.toMatchObject({ code: "ENOENT" });
});

it("acknowledges a verified record exactly once before staging cleanup fails and preserves it through cleanup retry", async () => {
  const { files, root } = await fixture();
  const record = {
    identity_sha256: files.identityDigest,
    attempt: 1,
    procedure: { address: "0x20", value: "unavailable function" },
    status: "unavailable" as const,
    limitations: ["provider returned no pseudocode"],
    locations: [],
  };
  let committed = 0;
  faults.stageRemoval = true;
  await expect(
    files.commit(record, () => {
      committed++;
    }),
  ).rejects.toThrow("injected staging removal failure");
  expect(committed).toBe(1);
  expect([...files.latest.values()]).toEqual([record]);
  const [name] = await readdir(join(root, "records"));
  if (name === undefined) throw new Error("Expected the committed record");
  const path = join(root, "records", name);
  const before = await readFile(path, "utf8");
  expect(JSON.parse(before)).toEqual(record);
  await files.close();
  expect(await readFile(path, "utf8")).toBe(before);
  expect(committed).toBe(1);
  expect(
    (await readdir(root)).filter((p) => p.startsWith(".rea-export-")),
  ).toEqual([]);
});
