import { mkdir, readFile, symlink, writeFile } from "node:fs/promises";
import { join } from "node:path";
import { afterEach, describe, expect, it, vi } from "vitest";
import { createTestTempDirectory } from "../../../fixtures/temporaryDirectory.js";
import { GhidraProjectFiles } from "../../../../src/ghidra/GhidraProjectSnapshot.js";
import { ghidraHeadlessArguments } from "../../../../src/ghidra/GhidraLauncher.js";
import { parseConfig } from "../../../../src/config/parseConfig.js";

const closeFault = vi.hoisted(() => ({ next: false }));
vi.mock("../../../../src/filesystem/RegularFile.js", async (original) => {
  const actual =
    await original<
      typeof import("../../../../src/filesystem/RegularFile.js")
    >();
  return {
    ...actual,
    openRegularFile: async (
      ...args: Parameters<typeof actual.openRegularFile>
    ) => {
      const handle = await actual.openRegularFile(...args);
      if (closeFault.next && args[0].endsWith("/records")) {
        closeFault.next = false;
        vi.spyOn(handle, "close")
          .mockRejectedValueOnce(new Error("owned close fault 1"))
          .mockRejectedValueOnce(new Error("owned close fault 2"));
      }
      return handle;
    },
  };
});
afterEach(() => {
  closeFault.next = false;
  vi.restoreAllMocks();
});

async function fixture() {
  const root = await createTestTempDirectory("rea-project-copy-");
  const source = join(root, "source"),
    destination = join(root, "runtime", "project");
  await mkdir(join(source, "selected.rep", "folder"), { recursive: true });
  await mkdir(destination, { recursive: true });
  await writeFile(join(source, "selected.gpr"), "marker");
  await writeFile(
    join(source, "selected.rep", "folder", "records"),
    "committed-data",
  );
  await writeFile(join(source, "unrelated.gpr"), "excluded-sibling");
  const files = new GhidraProjectFiles();
  const selection = await files.resolve(
    { path: join(source, "selected.gpr"), programName: "selected-program" },
    "/original/target",
  );
  return { root, source, destination, files, selection };
}

describe.skipIf(process.platform === "win32")(
  "verified existing Ghidra project copies",
  () => {
    it("retains failed descriptor cleanup through repeated owning close attempts", async () => {
      const f = await fixture();
      closeFault.next = true;
      await expect(
        f.files.fingerprint(f.source, "selected"),
      ).rejects.toMatchObject({ cleanupIncomplete: true });
      await expect(f.files.close()).rejects.toMatchObject({
        cleanupIncomplete: true,
      });
      await f.files.close();
      expect(await f.files.fingerprint(f.source, "selected")).toBe(
        f.selection.sha256,
      );
      await f.files.close();
    });
    it("copies only the committed pair and never edits its original", async () => {
      const f = await fixture();
      await f.files.copy(f.selection, f.destination);
      expect(await f.files.fingerprint(f.destination, "selected")).toBe(
        f.selection.sha256,
      );
      await expect(
        readFile(join(f.destination, "unrelated.gpr")),
      ).rejects.toMatchObject({ code: "ENOENT" });
      await writeFile(
        join(f.destination, "selected.rep", "folder", "records"),
        "private-edit",
      );
      expect(
        await readFile(
          join(f.source, "selected.rep", "folder", "records"),
          "utf8",
        ),
      ).toBe("committed-data");
      expect(await f.files.fingerprint(f.source, "selected")).toBe(
        f.selection.sha256,
      );
      await f.files.close();
    });
    it("refuses content changed after profile resolution", async () => {
      const f = await fixture();
      await writeFile(
        join(f.source, "selected.rep", "folder", "records"),
        "changed-data",
      );
      await expect(
        f.files.copy(f.selection, f.destination),
      ).rejects.toMatchObject({ _tag: "AnalysisArtifactChangedError" });
      await f.files.close();
    });
    it("does not follow a project symlink or overwrite an existing copy", async () => {
      const f = await fixture();
      await f.files.copy(f.selection, f.destination);
      await expect(
        f.files.copy(f.selection, f.destination),
      ).rejects.toMatchObject({ cause: { code: "ERR_FS_CP_EEXIST" } });
      await symlink(
        join(f.source, "unrelated.gpr"),
        join(f.source, "selected.rep", "link"),
      );
      await expect(
        f.files.fingerprint(f.source, "selected"),
      ).rejects.toMatchObject({ _tag: "ConfigurationError" });
      await f.files.close();
    });
    it("refuses overlapping runtime placement and a changed bridge commitment", async () => {
      const f = await fixture();
      const nested = join(f.source, "selected.rep", "private");
      await mkdir(nested);
      await expect(
        f.files.copy(f.selection, join(nested, "project")),
      ).rejects.toMatchObject({ _tag: "ConfigurationError" });
      await expect(
        f.files.copy(
          { ...f.selection, bridge_sha256: "0".repeat(64) },
          f.destination,
        ),
      ).rejects.toMatchObject({ _tag: "AnalysisArtifactChangedError" });
      await f.files.close();
    });
    it("honors cancellation before copying", async () => {
      const f = await fixture(),
        controller = new AbortController();
      controller.abort();
      await expect(
        f.files.copy(f.selection, f.destination, controller.signal),
      ).rejects.toMatchObject({ _tag: "AnalysisCancelledError" });
      await expect(
        readFile(join(f.destination, "selected.gpr")),
      ).rejects.toMatchObject({ code: "ENOENT" });
      await f.files.close();
    });
    it("uses exact -process selection with no auto-analysis or source import", async () => {
      const f = await fixture();
      const args = ghidraHeadlessArguments({
        existingProject: f.selection,
        projectRoot: f.destination,
        targetPath: "/original/target",
        bridgeScriptPath: "/scripts/ReaGhidraBridge.java",
        descriptorPath: "/runtime/session.json",
        ghidraLogPath: "/runtime/log",
        scriptLogPath: "/runtime/scriptlog",
      });
      expect(args.slice(0, 6)).toEqual([
        f.destination,
        "selected",
        "-process",
        "selected-program",
        "-noanalysis",
        "-readOnly",
      ]);
      expect(args).not.toContain("-import");
      expect(args).not.toContain("-deleteProject");
      expect(() =>
        ghidraHeadlessArguments({
          existingProject: f.selection,
          projectRoot: f.destination,
          targetPath: "/original/target",
          bridgeScriptPath: "/scripts/bridge.java",
          descriptorPath: "/runtime/session.json",
          ghidraLogPath: "/runtime/log",
          scriptLogPath: "/runtime/scriptlog",
          seedPath: "/seeds.tsv",
        }),
      ).toThrow("fresh import");
      await f.files.close();
    });
  },
);

it("validates project marker and exact Program selection through config", () => {
  const result = parseConfig({
    REA_GHIDRA_PROJECT_PATH: "/saved/project.gpr",
    REA_GHIDRA_PROGRAM_NAME: "program with spaces",
  });
  if (!result.ok) throw result.error;
  expect(result.value.ghidraExistingProject).toEqual({
    path: "/saved/project.gpr",
    programName: "program with spaces",
  });
  for (const env of [
    { REA_GHIDRA_PROJECT_PATH: "relative.gpr" },
    { REA_GHIDRA_PROJECT_PATH: "/saved/packed.gzf" },
    { REA_GHIDRA_PROGRAM_NAME: "program" },
    {
      REA_GHIDRA_PROJECT_PATH: "/saved/project.gpr",
      REA_GHIDRA_PROGRAM_NAME: "*",
    },
  ])
    expect(parseConfig(env).ok).toBe(false);
});
