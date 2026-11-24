// Selective adaptation of upstream f7849cad3: atomic packed-Program publication.
// Local ownership, seeded profiles and original analysis status remain explicit.
import { createHash, randomUUID } from "node:crypto";
import { constants } from "node:fs";
import {
  copyFile,
  lstat,
  mkdir,
  open,
  realpath,
  rename,
  rm,
  rmdir,
} from "node:fs/promises";
import { basename, dirname, isAbsolute, join, resolve } from "node:path";
import { z } from "zod";
import { ConfigurationError } from "../domain/configurationErrors.js";
import {
  AnalysisArtifactChangedError,
  AnalysisCancelledError,
  AnalysisResourceConstraintError,
  AnalysisAccessDeniedError,
} from "../domain/analysisErrorCore.js";
import { AnalysisError } from "../domain/analysisErrorBase.js";
import { ProviderAdapterError } from "../domain/providerAdapterError.js";
import { ProviderCleanupError } from "../domain/providerCleanupError.js";
import { OwnedFileHandle } from "../filesystem/OwnedFileHandle.js";
import {
  openRegularFile,
  RegularFileAdmissionFailure,
  sameRegularFileState,
} from "../filesystem/RegularFile.js";
import { GhidraProjectFiles } from "./GhidraProjectSnapshot.js";

const digest = z.string().regex(/^[a-f0-9]{64}$/u);
const sourceSchema = z.strictObject({
  file: z.string().regex(/^program-[a-f0-9-]{36}\.gzf$/u),
  sha256: digest,
  analysis_complete: z.boolean(),
});
const manifestSchema = z.strictObject({
  version: z.literal(1),
  target_sha256: digest,
  base_profile_digest: digest,
  bridge_sha256: digest,
  source: sourceSchema,
});
export const ghidraCheckpointSelectionSchema = z.strictObject({
  configured_directory: z.string().refine(isAbsolute),
  directory: z.string().refine(isAbsolute),
  key: digest,
  target_sha256: digest,
  base_profile_digest: digest,
  bridge_sha256: digest,
  source: sourceSchema.nullable(),
});
export type GhidraCheckpointSelection = z.infer<
  typeof ghidraCheckpointSelectionSchema
>;
export interface GhidraPackedProgram {
  readonly path: string;
  readonly sha256: string;
  readonly analysis_complete: boolean;
}
const active = (signal?: AbortSignal) => {
  if (signal?.aborted) throw new AnalysisCancelledError("open_binary");
};
const missing = (cause: unknown) =>
  cause instanceof Error && Reflect.get(cause, "code") === "ENOENT";
const invalid = (reason: string, cause?: unknown) =>
  new ConfigurationError(
    `Ghidra checkpoint: ${reason}. Preserve the directory and reopen the target after correcting the setting or selecting a new REA_GHIDRA_CHECKPOINT_DIR.`,
    {
      cause,
      settings: [{ setting: "REA_GHIDRA_CHECKPOINT_DIR", constraint: reason }],
    },
  );
export function ghidraCheckpointFailure(
  operation: string,
  path: string,
  cause: unknown,
): AnalysisError {
  if (cause instanceof AnalysisError) return cause;
  const code: unknown =
    cause instanceof Error ? Reflect.get(cause, "code") : undefined;
  if (code === "ENOSPC")
    return new AnalysisResourceConstraintError(
      operation,
      "disk",
      "Ghidra checkpoint encountered ENOSPC",
      null,
      {
        cause,
        remediationAction: `Free space for the private Ghidra export and checkpoint publication at ${path}, then reopen the target. Persistence of an edit can be unconfirmed; unchanged capacity can reproduce the failure.`,
      },
    );
  if (
    (code === "EACCES" || code === "EPERM") &&
    operation === "checkpoint_program"
  )
    return new ProviderAdapterError("ghidra", operation, {
      cause,
      userMessage: `Ghidra checkpoint publication was denied write access at ${path}. Edit persistence is unconfirmed. Restore write access to the checkpoint directory, then close and reopen the target; unchanged permissions reproduce this failure.`,
      diagnostics: {
        boundary: "checkpoint-write",
        path,
        system_code: code,
        persistence: "unconfirmed",
      },
    });
  if (code === "EACCES" || code === "EPERM")
    return new AnalysisAccessDeniedError(operation, path, code, { cause });
  if (code === "ENOENT" || code === "ENOTDIR")
    return invalid(`Selected checkpoint file is unavailable at ${path}`, cause);
  return new ProviderAdapterError("ghidra", operation, {
    cause,
    diagnostics: {
      path,
      reason:
        cause instanceof Error ? cause.message : "Checkpoint operation failed",
    },
  });
}
// A not-yet-created root can have an existing symlinked parent (/tmp on macOS).
// Canonicalize that parent without creating any checkpoint during discovery.
async function canonicalDirectory(path: string): Promise<string> {
  try {
    return await realpath(path);
  } catch (cause: unknown) {
    if (!missing(cause)) throw cause;
    return join(await canonicalDirectory(dirname(path)), basename(path));
  }
}
async function privateDirectory(path: string): Promise<void> {
  await mkdir(path, { recursive: true, mode: 0o700 });
  const info = await lstat(path);
  if (
    !info.isDirectory() ||
    (info.mode & 0o077) !== 0 ||
    info.uid !== process.getuid?.()
  )
    throw invalid(
      `Checkpoint directory must be a private, current-user-owned directory: ${path}`,
    );
}

/** Own every descriptor, staging path and exclusive publisher until confirmed release. */
export class GhidraCheckpoint {
  readonly #files = new GhidraProjectFiles();
  readonly #handles = new Map<OwnedFileHandle, string>();
  readonly #pendingRemoval = new Set<string>();
  #lease: { path: string; dev: number | null; ino: number | null } | undefined;
  #source: GhidraCheckpointSelection["source"] = null;
  constructor(readonly selection: GhidraCheckpointSelection) {}

  static async resolve(
    directory: string,
    targetSha256: string,
    baseProfileDigest: string,
    bridgeSha256: string,
    retainedOwners: Set<GhidraCheckpoint>,
    signal?: AbortSignal,
  ): Promise<GhidraCheckpointSelection> {
    for (const owner of retainedOwners) {
      await owner.close();
      retainedOwners.delete(owner);
    }
    active(signal);
    if (!isAbsolute(directory))
      throw invalid("Checkpoint directory must be absolute");
    const canonical = await canonicalDirectory(resolve(directory));
    const key = createHash("sha256")
      .update(JSON.stringify([targetSha256, baseProfileDigest, bridgeSha256]))
      .digest("hex");
    const selection: GhidraCheckpointSelection = {
      configured_directory: directory,
      directory: canonical,
      key,
      target_sha256: targetSha256,
      base_profile_digest: baseProfileDigest,
      bridge_sha256: bridgeSha256,
      source: null,
    };
    const owner = new GhidraCheckpoint(selection);
    retainedOwners.add(owner);
    try {
      return { ...selection, source: await owner.#readSource(signal) };
    } finally {
      await owner.close();
      retainedOwners.delete(owner);
    }
  }

  get #directory(): string {
    return join(this.selection.directory, this.selection.key);
  }
  get packedProgram(): GhidraPackedProgram | undefined {
    return this.#source === null
      ? undefined
      : {
          path: join(this.#directory, this.#source.file),
          sha256: this.#source.sha256,
          analysis_complete: this.#source.analysis_complete,
        };
  }

  async #readSource(
    signal?: AbortSignal,
  ): Promise<GhidraCheckpointSelection["source"]> {
    active(signal);
    const path = join(this.#directory, "current.json");
    const handle = await openRegularFile(path, {
      symlinks: "reject",
      signal,
    }).catch((cause: unknown) => {
      if (cause instanceof RegularFileAdmissionFailure)
        this.#handles.set(cause.owner, path);
      if (missing(cause)) return undefined;
      throw cause;
    });
    if (handle === undefined) return null;
    const owner = new OwnedFileHandle(handle);
    this.#handles.set(owner, path);
    let parsed: z.infer<typeof manifestSchema>;
    try {
      const initial = await handle.stat();
      // This fixed-size manifest contains only hashes, a UUID basename and booleans.
      if (initial.size > 1024)
        throw invalid(
          "Checkpoint manifest exceeds its schema's representable size",
        );
      const bytes = Buffer.alloc(initial.size + 1);
      const read = await handle.read(bytes, 0, bytes.length, 0);
      if (read.bytesRead !== initial.size)
        throw invalid("Checkpoint manifest changed while being read");
      parsed = manifestSchema.parse(
        JSON.parse(bytes.subarray(0, initial.size).toString("utf8")),
      );
      if (!sameRegularFileState(initial, await handle.stat()))
        throw invalid("Checkpoint manifest changed while being read");
    } catch (cause: unknown) {
      throw invalid("Checkpoint manifest is invalid", cause);
    } finally {
      await owner.close();
      this.#handles.delete(owner);
    }
    if (
      parsed.target_sha256 !== this.selection.target_sha256 ||
      parsed.base_profile_digest !== this.selection.base_profile_digest ||
      parsed.bridge_sha256 !== this.selection.bridge_sha256
    )
      throw invalid(
        "Checkpoint target, analysis profile or bridge identity does not match",
      );
    if (
      (await this.#files.hashPackedProgram(
        join(this.#directory, parsed.source.file),
        signal,
      )) !== parsed.source.sha256
    )
      throw invalid(
        "Checkpoint packed Program does not match its recorded SHA-256",
      );
    return parsed.source;
  }

  async snapshot(
    destination: string,
    signal?: AbortSignal,
  ): Promise<GhidraPackedProgram | undefined> {
    const packed = this.packedProgram;
    if (packed === undefined) return undefined;
    await copyFile(packed.path, destination, constants.COPYFILE_EXCL);
    if (
      (await this.#files.hashPackedProgram(destination, signal)) !==
      packed.sha256
    )
      throw new AnalysisArtifactChangedError(
        "open_binary",
        packed.path,
        "Packed Program changed before its private snapshot was verified",
      );
    return { ...packed, path: destination };
  }

  async acquire(runId: string, signal?: AbortSignal): Promise<void> {
    active(signal);
    if (
      (await this.#files.bridgeDigest(signal)) !== this.selection.bridge_sha256
    )
      throw new AnalysisArtifactChangedError(
        "open_binary",
        this.selection.directory,
        "Bridge sources changed after checkpoint selection; reopen the target",
      );
    await privateDirectory(this.selection.directory);
    if ((await realpath(this.selection.directory)) !== this.selection.directory)
      throw invalid("Checkpoint directory identity changed after selection");
    await privateDirectory(this.#directory);
    const path = join(this.#directory, "publisher.lock");
    try {
      await mkdir(path, { mode: 0o700 });
    } catch (cause: unknown) {
      throw invalid(
        `Checkpoint publisher is already owned or its lock is unavailable (${path}); no PID-based stale-lock recovery is attempted`,
        cause,
      );
    }
    this.#lease = { path, dev: null, ino: null };
    const info = await lstat(path);
    this.#lease = { path, dev: info.dev, ino: info.ino };
    await this.#write(
      join(path, "owner.json"),
      JSON.stringify({ run_id: runId }),
    );
    const current = await this.#readSource(signal);
    if (JSON.stringify(current) !== JSON.stringify(this.selection.source))
      throw new AnalysisArtifactChangedError(
        "open_binary",
        this.#directory,
        "Checkpoint generation changed after profile selection; reopen the target",
      );
    this.#source = current;
  }

  /** Export is private to this run. Publication acknowledges a fully synced immutable blob. */
  async publish(
    path: string,
    analysisComplete: boolean,
    signal?: AbortSignal,
  ): Promise<void> {
    active(signal);
    if (this.#lease === undefined)
      throw invalid("Checkpoint publisher does not own a lease");
    const file = `program-${randomUUID()}.gzf`,
      destination = join(this.#directory, file);
    this.#pendingRemoval.add(destination);
    await copyFile(path, destination, constants.COPYFILE_EXCL);
    const handle = await open(destination, "r+");
    const owner = new OwnedFileHandle(handle);
    this.#handles.set(owner, destination);
    await handle.sync();
    await owner.close();
    this.#handles.delete(owner);
    const source = {
      file,
      sha256: await this.#files.hashPackedProgram(destination, signal),
      analysis_complete: analysisComplete,
    };
    const temporary = join(this.#directory, `manifest-${randomUUID()}.json`);
    this.#pendingRemoval.add(temporary);
    await this.#write(
      temporary,
      JSON.stringify({
        version: 1,
        target_sha256: this.selection.target_sha256,
        base_profile_digest: this.selection.base_profile_digest,
        bridge_sha256: this.selection.bridge_sha256,
        source,
      }) + "\n",
    );
    active(signal);
    await rename(temporary, join(this.#directory, "current.json"));
    this.#pendingRemoval.delete(temporary);
    this.#pendingRemoval.delete(destination);
    if (this.#source !== null)
      this.#pendingRemoval.add(join(this.#directory, this.#source.file));
    this.#source = source;
    // Sync the directory after making the new manifest visible. On failure the
    // current blob remains retained; cleanup must never unlink its referent.
    const directoryHandle = await open(this.#directory, "r"),
      directoryOwner = new OwnedFileHandle(directoryHandle);
    this.#handles.set(directoryOwner, this.#directory);
    await directoryHandle.sync();
    await directoryOwner.close();
    this.#handles.delete(directoryOwner);
    await this.#cleanupStaging();
  }

  async #write(path: string, value: string): Promise<void> {
    const handle = await open(path, "wx", 0o600),
      owner = new OwnedFileHandle(handle);
    this.#handles.set(owner, path);
    await handle.writeFile(value);
    await handle.sync();
    await owner.close();
    this.#handles.delete(owner);
  }
  async #cleanupStaging(): Promise<void> {
    for (const path of this.#pendingRemoval) {
      await rm(path, { force: true });
      this.#pendingRemoval.delete(path);
    }
  }
  async close(): Promise<void> {
    try {
      for (const [owner] of this.#handles) {
        await owner.close();
        this.#handles.delete(owner);
      }
      await this.#files.close();
      await this.#cleanupStaging();
      if (this.#lease !== undefined) {
        const lease = this.#lease,
          info = await lstat(lease.path);
        if (
          lease.dev === null ||
          lease.ino === null ||
          info.dev !== lease.dev ||
          info.ino !== lease.ino ||
          !info.isDirectory()
        )
          throw invalid(
            "Checkpoint publisher lock identity changed; refusing to remove it",
          );
        await rm(join(lease.path, "owner.json"), { force: true });
        await rmdir(lease.path);
        this.#lease = undefined;
      }
    } catch (cause: unknown) {
      throw new ProviderCleanupError(
        "ghidra",
        [
          ...this.#handles.values(),
          ...this.#pendingRemoval,
          ...(this.#lease === undefined ? [] : [this.#lease.path]),
          ...(cause instanceof AnalysisError ? cause.cleanupResources : []),
        ],
        { reason: "Checkpoint cleanup remains owned for retry" },
        { cause },
      );
    }
  }
}
