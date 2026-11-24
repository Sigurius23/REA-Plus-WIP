// Adapted from upstream f7849cad3: selected-pair commitment and verified copy.
// Local descriptor ownership and error projection deliberately remain local.
import { createHash } from "node:crypto";
import { cp, lstat, mkdir, readdir, realpath, stat } from "node:fs/promises";
import { basename, dirname, isAbsolute, join, relative, sep } from "node:path";
import { fileURLToPath } from "node:url";
import { z } from "zod";
import type { GhidraProjectSelection } from "../config/ghidraExistingProject.js";
import { ghidraProgramNameSchema } from "../config/ghidraExistingProject.js";
import { ConfigurationError } from "../domain/configurationErrors.js";
import {
  AnalysisArtifactChangedError,
  AnalysisCancelledError,
  AnalysisAccessDeniedError,
  AnalysisResourceConstraintError,
} from "../domain/analysisErrorCore.js";
import { AnalysisError } from "../domain/analysisErrorBase.js";
import { ProviderAdapterError } from "../domain/providerAdapterError.js";
import { ProviderCleanupError } from "../domain/providerCleanupError.js";
import { OwnedFileHandle } from "../filesystem/OwnedFileHandle.js";
import {
  openRegularFile,
  RegularFileChangedError,
  sameRegularFileState,
  RegularFileAdmissionFailure,
} from "../filesystem/RegularFile.js";

const digest = z.string().regex(/^[a-f0-9]{64}$/u);
export const ghidraProjectCommitmentSchema = z.strictObject({
  configured_path: z.string().refine(isAbsolute),
  project_path: z.string().refine(isAbsolute),
  project_name: z
    .string()
    .min(1)
    .refine((name) => basename(name) === name && name !== "." && name !== ".."),
  program_name: ghidraProgramNameSchema,
  sha256: digest,
  bridge_sha256: digest,
});
export type GhidraProjectCommitment = z.infer<
  typeof ghidraProjectCommitmentSchema
>;
const pair = (name: string) => [`${name}.gpr`, `${name}.rep`] as const;
const active = (signal?: AbortSignal) => {
  if (signal?.aborted) throw new AnalysisCancelledError("open_binary");
};
const invalid = (message: string) =>
  new ConfigurationError(message, {
    settings: [{ setting: "REA_GHIDRA_PROJECT_PATH", constraint: message }],
  });
const contains = (parent: string, child: string) => {
  const rel = relative(parent, child);
  return (
    rel === "" ||
    (!isAbsolute(rel) && rel !== ".." && !rel.startsWith(`..${sep}`))
  );
};

export const ghidraProjectFileFailure = (
  operation: string,
  path: string,
  cause: unknown,
): AnalysisError => {
  if (cause instanceof AnalysisError) return cause;
  if (cause instanceof RegularFileChangedError)
    return new AnalysisArtifactChangedError(operation, path, cause.message, {
      cause,
    });
  const code: unknown =
    cause instanceof Error ? Reflect.get(cause, "code") : undefined;
  if (code === "EACCES" || code === "EPERM")
    return new AnalysisAccessDeniedError(operation, path, code, { cause });
  if (code === "ENOENT" || code === "ENOTDIR")
    return new ConfigurationError(
      `Selected Ghidra project entry is unavailable: ${path}`,
      {
        cause,
        settings: [
          {
            setting: "REA_GHIDRA_PROJECT_PATH",
            constraint:
              "Select an existing expanded project marker with its complete .rep directory",
          },
        ],
      },
    );
  if (code === "ENOSPC")
    return new AnalysisResourceConstraintError(
      operation,
      "disk",
      "Project snapshot encountered ENOSPC",
      null,
      {
        cause,
        remediationAction:
          "Free space for the verified private project copy. Unchanged capacity can reproduce this failure.",
      },
    );
  return new ProviderAdapterError("ghidra", operation, {
    cause,
    diagnostics: {
      path,
      reason:
        cause instanceof Error
          ? cause.message
          : "Project file operation failed",
    },
  });
};

/** Streaming project reads retain failed descriptor closes for an owning retry. */
export class GhidraProjectFiles {
  readonly #owners = new Map<OwnedFileHandle, string>();

  async close(): Promise<void> {
    for (const [owner, path] of this.#owners) {
      try {
        await owner.close();
        this.#owners.delete(owner);
      } catch (cause: unknown) {
        throw new ProviderCleanupError(
          "ghidra",
          [...this.#owners.values()],
          { reason: `Project descriptor could not be closed: ${path}` },
          { cause },
        );
      }
    }
  }

  async #hashFile(
    path: string,
    hash: ReturnType<typeof createHash>,
    signal?: AbortSignal,
    includeLength = true,
  ): Promise<void> {
    const handle = await openRegularFile(path, {
      symlinks: "reject",
      signal,
    }).catch((cause: unknown) => {
      if (cause instanceof RegularFileAdmissionFailure) {
        this.#owners.set(cause.owner, path);
        throw new ProviderCleanupError(
          "ghidra",
          [path],
          {
            reason:
              "Project file admission failed and its descriptor close remains unconfirmed",
          },
          { cause },
        );
      }
      throw cause;
    });
    const owner = new OwnedFileHandle(handle);
    this.#owners.set(owner, path);
    let primary: unknown;
    try {
      const initial = await handle.stat();
      if (!Number.isSafeInteger(initial.size) || initial.size < 0)
        throw invalid(`Unrepresentable project file size: ${path}`);
      if (includeLength) hash.update(String(initial.size) + "\n");
      const buffer = Buffer.allocUnsafe(64 * 1024);
      let offset = 0;
      while (offset < initial.size) {
        active(signal);
        const read = await handle.read(
          buffer,
          0,
          Math.min(buffer.length, initial.size - offset),
          offset,
        );
        if (read.bytesRead === 0) throw new RegularFileChangedError(path);
        hash.update(buffer.subarray(0, read.bytesRead));
        offset += read.bytesRead;
      }
      const [opened, current] = await Promise.all([handle.stat(), stat(path)]);
      if (
        !sameRegularFileState(initial, opened) ||
        !sameRegularFileState(initial, current)
      )
        throw new RegularFileChangedError(path);
      active(signal);
    } catch (cause: unknown) {
      primary = cause;
      throw cause;
    } finally {
      try {
        await owner.close();
        this.#owners.delete(owner);
      } catch (cause: unknown) {
        throw new ProviderCleanupError(
          "ghidra",
          [path],
          {
            reason:
              "Project descriptor cleanup failed; ownership retained for retry",
          },
          {
            cause:
              primary === undefined
                ? cause
                : new AggregateError(
                    [primary, cause],
                    "Project read and descriptor cleanup both failed",
                  ),
          },
        );
      }
    }
  }

  /** Hash a packed Program without buffering it or losing failed-close ownership. */
  async hashPackedProgram(path: string, signal?: AbortSignal): Promise<string> {
    const hash = createHash("sha256");
    await this.#hashFile(path, hash, signal, false);
    return hash.digest("hex");
  }

  async #visit(
    root: string,
    name: string,
    visit: (path: string, directory: boolean) => Promise<void>,
    signal?: AbortSignal,
  ): Promise<void> {
    const walk = async (path: string): Promise<void> => {
      active(signal);
      const info = await lstat(join(root, path));
      if (!info.isFile() && !info.isDirectory())
        throw invalid(
          `Project contains a symlink or non-regular entry: ${join(root, path)}`,
        );
      await visit(path, info.isDirectory());
      if (info.isDirectory())
        for (const child of (await readdir(join(root, path))).sort())
          await walk(join(path, child));
    };
    const [marker, data] = await Promise.all(
      pair(name).map((p) => lstat(join(root, p))),
    );
    if (!marker?.isFile() || !data?.isDirectory())
      throw invalid(
        `Project requires a regular ${name}.gpr and a ${name}.rep directory`,
      );
    for (const entry of pair(name)) await walk(entry);
  }

  async fingerprint(
    root: string,
    name: string,
    signal?: AbortSignal,
  ): Promise<string> {
    const hash = createHash("sha256");
    await this.#visit(
      root,
      name,
      async (path, directory) => {
        hash.update(
          JSON.stringify([
            path.split(sep).join("/"),
            directory ? "directory" : "file",
          ]) + "\n",
        );
        if (!directory) await this.#hashFile(join(root, path), hash, signal);
      },
      signal,
    );
    return hash.digest("hex");
  }

  /** Bind the exact local bridge sources that will interpret the saved Program. */
  async bridgeDigest(signal?: AbortSignal): Promise<string> {
    const directory = fileURLToPath(
      new URL("../../bridge/ghidra/", import.meta.url),
    );
    const hash = createHash("sha256");
    for (const name of (await readdir(directory))
      .filter((n) => n.endsWith(".java"))
      .sort()) {
      hash.update(name + "\n");
      await this.#hashFile(join(directory, name), hash, signal);
    }
    return hash.digest("hex");
  }

  async resolve(
    selection: GhidraProjectSelection,
    targetPath: string,
    signal?: AbortSignal,
  ): Promise<GhidraProjectCommitment> {
    await this.close();
    active(signal);
    const marker = await lstat(selection.path);
    if (!marker.isFile()) throw invalid("Select a regular .gpr project marker");
    const root = await realpath(dirname(selection.path)),
      name = basename(selection.path, ".gpr");
    return {
      configured_path: selection.path,
      project_path: root,
      project_name: name,
      program_name: ghidraProgramNameSchema.parse(
        selection.programName ?? basename(targetPath),
      ),
      sha256: await this.fingerprint(root, name, signal),
      bridge_sha256: await this.bridgeDigest(signal),
    };
  }

  /** The caller project is never passed to Ghidra; only its verified private copy. */
  async copy(
    selection: GhidraProjectCommitment,
    destination: string,
    signal?: AbortSignal,
  ): Promise<void> {
    try {
      await this.#copy(selection, destination, signal);
    } catch (cause: unknown) {
      throw ghidraProjectFileFailure(
        "open_binary",
        selection.project_path,
        cause,
      );
    }
  }

  async #copy(
    selection: GhidraProjectCommitment,
    destination: string,
    signal?: AbortSignal,
  ): Promise<void> {
    active(signal);
    const source = await realpath(selection.project_path),
      runtime = await realpath(dirname(destination));
    if (
      pair(selection.project_name).some(
        (p) =>
          contains(join(source, p), runtime) ||
          contains(runtime, join(source, p)),
      )
    )
      throw invalid("Selected project overlaps the private runtime directory");
    if ((await this.bridgeDigest(signal)) !== selection.bridge_sha256)
      throw new AnalysisArtifactChangedError(
        "open_binary",
        selection.project_path,
        "Local bridge changed after project profile selection; reopen the target",
      );
    await this.#visit(
      source,
      selection.project_name,
      async (path, directory) => {
        if (directory) await mkdir(join(destination, path), { mode: 0o700 });
        else
          await cp(join(source, path), join(destination, path), {
            dereference: false,
            errorOnExist: true,
            force: false,
          });
        active(signal);
      },
      signal,
    );
    if (
      (await this.fingerprint(destination, selection.project_name, signal)) !==
      selection.sha256
    )
      throw new AnalysisArtifactChangedError(
        "open_binary",
        selection.project_path,
        "Selected project content differs from its committed profile; when it changed is unknown",
      );
  }
}
