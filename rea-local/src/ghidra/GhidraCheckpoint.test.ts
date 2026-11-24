import { afterEach, describe, expect, it, vi } from "vitest";
import * as fs from "node:fs/promises";
import { join } from "node:path";
import { tmpdir } from "node:os";
import {
  ghidraCheckpointFailure,
  GhidraCheckpoint,
} from "./GhidraCheckpoint.js";
import { GhidraProjectFiles } from "./GhidraProjectSnapshot.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import { parseConfig } from "../config/parseConfig.js";

const roots: string[] = [],
  owners = new Set<GhidraCheckpoint>();
afterEach(async () => {
  vi.restoreAllMocks();
  for (const owner of owners) {
    await owner.close();
    owners.delete(owner);
  }
  for (const root of roots.splice(0))
    await fs.rm(root, { recursive: true, force: true });
});
async function fixture() {
  const root = await fs.mkdtemp(join(tmpdir(), "rea-checkpoint-test-"));
  roots.push(root);
  const directory = join(root, "checkpoints"),
    program = join(root, "export.gzf");
  const files = new GhidraProjectFiles(),
    bridge = await files.bridgeDigest();
  await files.close();
  await fs.writeFile(program, "owned packed Program stand-in");
  const resolve = (profile = "b".repeat(64), signal?: AbortSignal) =>
    GhidraCheckpoint.resolve(
      directory,
      "a".repeat(64),
      profile,
      bridge,
      new Set(),
      signal,
    );
  const selection = await resolve(),
    owner = new GhidraCheckpoint(selection);
  owners.add(owner);
  return { root, directory, program, selection, owner, resolve };
}
describe.skipIf(process.platform === "win32")(
  "owned checkpoint publication",
  () => {
    it("publishes an identified partial Program and restores a verified private copy", async () => {
      const f = await fixture();
      await f.owner.acquire("owned-run");
      await f.owner.publish(f.program, false);
      const warm = await f.resolve();
      expect(warm.source?.analysis_complete).toBe(false);
      expect(warm.source?.sha256).toMatch(/^[a-f0-9]{64}$/u);
      await f.owner.close();
      const restored = new GhidraCheckpoint(warm);
      owners.add(restored);
      await restored.acquire("warm-run");
      const copy = join(f.root, "private.gzf");
      expect(await restored.snapshot(copy)).toMatchObject({
        path: copy,
        analysis_complete: false,
      });
      expect(await fs.readFile(copy, "utf8")).toBe(
        await fs.readFile(f.program, "utf8"),
      );
    });
    it("excludes a second publisher and never removes another owner's lease", async () => {
      const f = await fixture();
      await f.owner.acquire("first");
      const second = new GhidraCheckpoint(f.selection);
      owners.add(second);
      await expect(second.acquire("second")).rejects.toThrow("already owned");
      await second.close();
      await expect(
        fs.lstat(join(f.directory, f.selection.key, "publisher.lock")),
      ).resolves.toBeDefined();
      await f.owner.close();
      await second.acquire("second");
    });
    it("refuses a stale profile after publication instead of silently using new state", async () => {
      const f = await fixture();
      await f.owner.acquire("first");
      await f.owner.publish(f.program, true);
      await f.owner.close();
      const stale = new GhidraCheckpoint(f.selection);
      owners.add(stale);
      await expect(stale.acquire("stale")).rejects.toMatchObject({
        _tag: "AnalysisArtifactChangedError",
      });
    });
    it("isolates changed analysis/seed commitments in a different key", async () => {
      const f = await fixture();
      await f.owner.acquire("first");
      await f.owner.publish(f.program, true);
      const changed = await f.resolve("c".repeat(64));
      expect(changed.key).not.toBe(f.selection.key);
      expect(changed.source).toBeNull();
    });
    it("rejects a corrupt blob without falling back to fresh import", async () => {
      const f = await fixture();
      await f.owner.acquire("first");
      await f.owner.publish(f.program, true);
      const warm = await f.resolve();
      await fs.appendFile(
        join(f.directory, f.selection.key, warm.source!.file),
        "corrupt",
      );
      await expect(f.resolve()).rejects.toThrow("SHA-256");
    });
    it("rejects a malformed or traversing manifest", async () => {
      const f = await fixture();
      await f.owner.acquire("first");
      await f.owner.publish(f.program, true);
      const path = join(f.directory, f.selection.key, "current.json"),
        manifest = JSON.parse(await fs.readFile(path, "utf8"));
      manifest.source.file = "../foreign.gzf";
      await fs.writeFile(path, JSON.stringify(manifest));
      await expect(f.resolve()).rejects.toThrow("manifest is invalid");
    });
    it("refuses cancellation before acquiring or publishing resources", async () => {
      const f = await fixture(),
        signal = AbortSignal.abort();
      await expect(f.owner.acquire("cancelled", signal)).rejects.toMatchObject({
        _tag: "AnalysisCancelledError",
      });
      await expect(fs.lstat(f.directory)).rejects.toMatchObject({
        code: "ENOENT",
      });
      await f.owner.acquire("run");
      await expect(
        f.owner.publish(f.program, true, signal),
      ).rejects.toMatchObject({ _tag: "AnalysisCancelledError" });
      expect((await f.resolve()).source).toBeNull();
    });
    it("retains failed staging cleanup and lease ownership until retry", async () => {
      const f = await fixture();
      await f.owner.acquire("run");
      const selected = join(f.directory, f.selection.key);
      // A conflicting directory is an actual OS rename failure, not a fake publisher.
      await fs.mkdir(join(selected, "current.json"));
      await expect(f.owner.publish(f.program, true)).rejects.toBeDefined();
      const staged = (await fs.readdir(selected)).find((name) =>
        name.endsWith(".gzf"),
      );
      expect(staged).toBeDefined();
      const blocked = join(selected, staged!);
      await fs.rm(blocked);
      await fs.mkdir(blocked);
      await fs.writeFile(join(blocked, "fault"), "owned test fault");
      await expect(f.owner.close()).rejects.toMatchObject({
        cleanupIncomplete: true,
      });
      const second = new GhidraCheckpoint(f.selection);
      owners.add(second);
      await expect(second.acquire("second")).rejects.toThrow("already owned");
      await fs.rm(blocked, { recursive: true });
      await f.owner.close();
      expect(await fs.readdir(selected)).toEqual(["current.json"]);
    });
    it("keeps only the current immutable Program after consecutive publications", async () => {
      const f = await fixture();
      await f.owner.acquire("run");
      await f.owner.publish(f.program, true);
      const initial = await f.resolve();
      await fs.appendFile(f.program, "edited");
      await f.owner.publish(f.program, true);
      const edited = await f.resolve();
      expect(edited.source?.sha256).not.toBe(initial.source?.sha256);
      expect(
        (await fs.readdir(join(f.directory, f.selection.key))).filter((x) =>
          x.endsWith(".gzf"),
        ),
      ).toEqual([edited.source?.file]);
    });
    it("validates opt-in configuration without changing the default", () => {
      const base = parseConfig({});
      expect(base.ok && base.value.ghidraCheckpointDir).toBeUndefined();
      expect(parseConfig({ REA_GHIDRA_CHECKPOINT_DIR: "relative" }).ok).toBe(
        false,
      );
      expect(
        parseConfig({
          REA_GHIDRA_CHECKPOINT_DIR: "/tmp/checkpoints",
          REA_GHIDRA_PROJECT_PATH: "/tmp/saved.gpr",
        }).ok,
      ).toBe(false);
      const enabled = parseConfig({
        REA_GHIDRA_CHECKPOINT_DIR: "/tmp/checkpoints",
      });
      expect(enabled.ok && enabled.value.ghidraCheckpointDir).toBe(
        "/tmp/checkpoints",
      );
    });
  },
);

it.skipIf(process.platform === "win32")(
  "canonicalizes an absent checkpoint root beneath a symlinked parent",
  async () => {
    const f = await fixture(),
      alias = join(f.root, "alias");
    await fs.symlink(f.root, alias, "dir");
    const files = new GhidraProjectFiles(),
      bridge = await files.bridgeDigest();
    await files.close();
    const selected = await GhidraCheckpoint.resolve(
      join(alias, "new-checkpoints"),
      "a".repeat(64),
      "b".repeat(64),
      bridge,
      new Set(),
    );
    expect(selected.directory).toBe(
      join(await fs.realpath(f.root), "new-checkpoints"),
    );
    const owner = new GhidraCheckpoint(selected);
    owners.add(owner);
    await owner.acquire("aliased-root");
    await owner.publish(f.program, true);
  },
);

// Distinct failure semantics: a publication-capacity error must not recommend
// changing an analysis-time knob or hide an already-committed in-memory edit.
it("projects checkpoint capacity failures with truthful persistence remediation", () => {
  const error = ghidraCheckpointFailure(
    "checkpoint_program",
    "/owned/checkpoints",
    Object.assign(new Error("full"), { code: "ENOSPC" }),
  );
  expect(error).toMatchObject({ _tag: "AnalysisResourceConstraintError" });
  const projected = projectAnalysisError(error);
  expect(projected).toMatchObject({ code: "resource_constraint" });
  expect(JSON.stringify(projected)).toContain(
    "Persistence of an edit can be unconfirmed",
  );
  expect(JSON.stringify(projected)).toContain("unchanged capacity");
});
