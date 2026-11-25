import canonicalize from "canonicalize";
import { createHash } from "node:crypto";
import type { Stats } from "node:fs";
import {
  link,
  lstat,
  mkdir,
  mkdtemp,
  open,
  readdir,
  realpath,
  rename,
  rmdir,
  unlink,
} from "node:fs/promises";
import { basename, dirname, join, resolve } from "node:path";
import { OwnedFileHandle } from "../../filesystem/OwnedFileHandle.js";
import { sameRegularFileState } from "../../filesystem/RegularFile.js";
import {
  withRegularFile,
  RegularFileCleanupFailure,
} from "../RegularFileRead.js";
import { readBoundedFileBytes } from "../../process/BoundedFileBytes.js";
import {
  decompileExportIdentitySchema,
  decompileExportRecordSchema,
  exportAddress,
  type DecompileExportIdentity,
  type DecompileExportRecord,
} from "../../domain/native/decompileDirectory.js";
import { EvidenceIntegrityError } from "../../domain/evidenceErrors.js";

export const exportHash = (value: string | Buffer) =>
  createHash("sha256").update(value).digest("hex");
export const exportIdentityHash = (identity: DecompileExportIdentity) =>
  exportHash(canonicalize(identity)!);
export const exportKey = (address: string) => {
  const a = exportAddress(address);
  return exportHash(
    a === null ? address : JSON.stringify([a.space, a.offset.toString(16)]),
  );
};
type Identity = { dev: number; ino: number };
type Stage = { directory: Identity | null; content: Identity | null };
interface PublicationOptions {
  readonly signal?: AbortSignal | undefined;
  /** Acknowledges verified publication even when subsequent cleanup fails. */
  readonly committed?: (() => void) | undefined;
}
const failure = (message: string) =>
  new EvidenceIntegrityError(`Decompile export: ${message}`);

/** Own only this run's staging/lock resources; committed output survives close. */
export class DecompileExportFiles {
  root = "";
  readonly latest = new Map<string, DecompileExportRecord>();
  readonly #directories = new Map<string, Identity>();
  readonly #handles = new Map<OwnedFileHandle, string>();
  readonly #stages = new Map<string, Stage>();
  #lock: { path: string; identity: Identity | null } | undefined;
  identityDigest = "";

  async prepare(
    path: string,
    resume: boolean,
    identity: DecompileExportIdentity,
  ) {
    const requested = resolve(path);
    this.root = join(await realpath(dirname(requested)), basename(requested));
    if (!resume) await mkdir(this.root, { mode: 0o700 });
    await this.#ownDirectory(this.root);
    const lock = join(this.root, ".rea-export-lock");
    // Do not infer stale ownership from a PID, timestamp or an absent process.
    await mkdir(lock, { mode: 0o700 });
    this.#lock = { path: lock, identity: null };
    this.#lock.identity = await directoryIdentity(lock);
    await this.assertDirectories();
    this.identityDigest = exportIdentityHash(identity);
    if (resume) {
      const existing = decompileExportIdentitySchema.parse(
        await this.readJson(join(this.root, "decompile-identity.json")),
      );
      if (exportIdentityHash(existing) !== this.identityDigest)
        throw failure(
          "resume target, provider, profile or layout does not match",
        );
      await this.#ownDirectory(join(this.root, "functions"));
      await this.#ownDirectory(join(this.root, "records"));
      await this.#loadRecords();
    } else {
      for (const name of ["functions", "records"]) {
        const directory = join(this.root, name);
        await mkdir(directory, { mode: 0o700 });
        await this.#ownDirectory(directory);
      }
      await this.publish(
        JSON.stringify(identity, null, 2) + "\n",
        join(this.root, "decompile-identity.json"),
        false,
      );
    }
  }

  async #ownDirectory(path: string) {
    this.#directories.set(path, await directoryIdentity(path));
  }

  async assertDirectories() {
    for (const [path, expected] of this.#directories)
      await assertDirectory(path, expected);
    if (this.#lock !== undefined) {
      if (this.#lock.identity === null)
        throw failure("lock identity is unknown; cleanup remains owned");
      await assertDirectory(this.#lock.path, this.#lock.identity);
    }
  }

  async read<Value>(
    path: string,
    consume: Parameters<typeof withRegularFile<Value>>[1],
    signal?: AbortSignal,
  ): Promise<Value> {
    await this.assertDirectories();
    try {
      return await withRegularFile(path, consume, {
        symlinks: "reject",
        signal,
      });
    } catch (cause) {
      if (cause instanceof RegularFileCleanupFailure)
        this.#handles.set(cause.owner, path);
      throw cause;
    }
  }

  async readJson(path: string) {
    return this.read(path, async (handle, info) => {
      const bytes = await readBoundedFileBytes(handle, info.size);
      if (bytes === undefined) throw failure(`unreadable metadata: ${path}`);
      return JSON.parse(bytes.toString("utf8")) as unknown;
    });
  }

  async verifyFile(record: DecompileExportRecord, signal?: AbortSignal) {
    if (record.status !== "written" || record.file === undefined) return false;
    const expected = record.file;
    return this.read(
      this.bodyPath(record.procedure.address),
      async (handle, info) => {
        if (info.size !== expected.bytes) return false;
        const hash = createHash("sha256"),
          buffer = Buffer.allocUnsafe(64 * 1024);
        let position = 0;
        while (position < info.size) {
          signal?.throwIfAborted();
          const part = await handle.read(
            buffer,
            0,
            Math.min(buffer.length, info.size - position),
            position,
          );
          if (part.bytesRead === 0) return false;
          hash.update(buffer.subarray(0, part.bytesRead));
          position += part.bytesRead;
        }
        return hash.digest("hex") === expected.sha256;
      },
      signal,
    );
  }

  bodyPath(address: string) {
    return join(this.root, "functions", `${exportKey(address)}.c`);
  }

  async commit(record: DecompileExportRecord, onCommitted?: () => void) {
    const checked = decompileExportRecordSchema.parse(record),
      key = exportKey(checked.procedure.address);
    const path = join(
      this.root,
      "records",
      `${key}.${checked.attempt.toString()}.json`,
    );
    await this.publish(JSON.stringify(checked, null, 2) + "\n", path, false, {
      committed: () => {
        this.latest.set(key, checked);
        onCommitted?.();
      },
    });
  }

  async #loadRecords() {
    const entries = await readdir(join(this.root, "records"), {
      withFileTypes: true,
    });
    for (const entry of entries) {
      const match = /^([0-9a-f]{64})\.([1-9][0-9]*)\.json$/u.exec(entry.name);
      if (!entry.isFile() || match === null)
        throw failure("unexpected record path; existing output was preserved");
      const record = decompileExportRecordSchema.parse(
        await this.readJson(join(this.root, "records", entry.name)),
      );
      const key = exportKey(record.procedure.address);
      if (
        key !== match[1] ||
        (record.file !== undefined &&
          record.file.relative_path !== `functions/${key}.c`) ||
        record.attempt.toString() !== match[2] ||
        record.identity_sha256 !== this.identityDigest
      )
        throw failure("record identity does not match its filename/export");
      const previous = this.latest.get(key);
      if (previous === undefined || previous.attempt < record.attempt)
        this.latest.set(key, record);
    }
  }

  /** Atomic hard-link publication never overwrites bodies/attempts. Only the derived index is replaced. */
  async publish(
    text: string,
    destination: string,
    replace: boolean,
    options: PublicationOptions = {},
  ) {
    const { signal } = options;
    signal?.throwIfAborted();
    await this.assertDirectories();
    const stage = await mkdtemp(join(this.root, ".rea-export-stage-"));
    const stagedOwner: Stage = { directory: null, content: null };
    this.#stages.set(stage, stagedOwner);
    stagedOwner.directory = await directoryIdentity(stage);
    const staged = join(stage, "content");
    const owner = new OwnedFileHandle(await open(staged, "wx", 0o600));
    this.#handles.set(owner, staged);
    const admitted = await owner.handle.stat();
    if (!admitted.isFile())
      throw failure("staging content is not a regular file");
    stagedOwner.content = { dev: admitted.dev, ino: admitted.ino };
    await owner.handle.writeFile(text, "utf8");
    await owner.handle.sync();
    const ready = await owner.handle.stat();
    await owner.close();
    this.#handles.delete(owner);
    const expected = {
      bytes: Buffer.byteLength(text, "utf8"),
      sha256: exportHash(text),
    };
    await this.#verifyPublication(staged, ready, expected, {
      before: true,
      signal,
    });
    signal?.throwIfAborted();
    await this.assertDirectories();
    await assertDirectory(stage, stagedOwner.directory);
    if (replace) {
      const prior = await lstat(destination).catch((e: unknown) => {
        if (errorCode(e) === "ENOENT") return undefined;
        throw e;
      });
      if (prior !== undefined && (!prior.isFile() || prior.isSymbolicLink()))
        throw failure("index is not a regular file");
      await rename(staged, destination);
    } else await link(staged, destination);
    // A failed post-publication check does not authorize deleting/replacing output.
    // Hard-link/rename publication can change ctime; the stable read still binds
    // inode, extent, mode, mtime and digest and verifies ctime throughout its read.
    await this.#verifyPublication(destination, ready, expected, {
      before: false,
      committed: options.committed,
    });
    await this.#removeStage(stage);
    await this.assertDirectories();
  }

  async #verifyPublication(
    path: string,
    ready: Stats,
    expected: { bytes: number; sha256: string },
    options: PublicationOptions & { readonly before: boolean },
  ) {
    const { signal, before } = options;
    let verified: boolean;
    try {
      verified = await this.read(
        path,
        async (handle, info) => {
          if (
            !info.isFile() ||
            info.dev !== ready.dev ||
            info.ino !== ready.ino ||
            info.mode !== ready.mode ||
            info.mtimeMs !== ready.mtimeMs ||
            info.size !== ready.size ||
            info.size !== expected.bytes ||
            (before && !sameRegularFileState(ready, info))
          )
            return false;
          const hash = createHash("sha256"),
            buffer = Buffer.allocUnsafe(64 * 1024);
          let position = 0;
          while (position < info.size) {
            signal?.throwIfAborted();
            const chunk = await handle.read(
              buffer,
              0,
              Math.min(buffer.length, info.size - position),
              position,
            );
            if (chunk.bytesRead === 0) return false;
            hash.update(buffer.subarray(0, chunk.bytesRead));
            position += chunk.bytesRead;
          }
          return hash.digest("hex") === expected.sha256;
        },
        signal,
      );
    } catch (cause: unknown) {
      // withRegularFile has already verified the full stable read when its
      // completed outcome survives a later descriptor-close failure.
      if (
        cause instanceof RegularFileCleanupFailure &&
        cause.outcome.kind === "completed" &&
        cause.outcome.value === true
      )
        options.committed?.();
      throw cause;
    }
    if (!verified)
      throw failure(`published content identity or bytes changed: ${path}`);
    options.committed?.();
  }

  async #removeStage(path: string) {
    const expected = this.#stages.get(path);
    if (expected === undefined) return;
    if (expected.directory === null)
      throw failure(
        "staging directory identity is unknown; cleanup remains owned",
      );
    await assertDirectory(path, expected.directory);
    const content = join(path, "content");
    const info = await lstat(content).catch((e: unknown) => {
      if (errorCode(e) === "ENOENT") return undefined;
      throw e;
    });
    if (info !== undefined) {
      if (
        expected.content === null ||
        !info.isFile() ||
        info.dev !== expected.content.dev ||
        info.ino !== expected.content.ino
      )
        throw failure(
          "staging content identity changed; cleanup remains owned",
        );
      await unlink(content);
    }
    await rmdir(path);
    this.#stages.delete(path);
  }

  /** A failed close/removal leaves this same owner reachable through the session scope. */
  async close() {
    for (const [owner] of this.#handles) {
      await owner.close();
      this.#handles.delete(owner);
    }
    for (const [stage] of this.#stages) await this.#removeStage(stage);
    if (this.#lock !== undefined) {
      if (this.#lock.identity === null)
        throw failure("lock identity was not established");
      await assertDirectory(this.#lock.path, this.#lock.identity);
      await rmdir(this.#lock.path);
      this.#lock = undefined;
    }
  }
}

async function directoryIdentity(path: string): Promise<Identity> {
  const info = await lstat(path);
  if (!info.isDirectory() || info.isSymbolicLink())
    throw failure(`not a regular directory: ${path}`);
  return { dev: info.dev, ino: info.ino };
}
async function assertDirectory(path: string, expected: Identity) {
  const actual = await directoryIdentity(path);
  if (actual.dev !== expected.dev || actual.ino !== expected.ino)
    throw failure(`directory identity changed: ${path}`);
}
export const errorCode = (cause: unknown) =>
  typeof cause === "object" && cause !== null && "code" in cause
    ? cause.code
    : undefined;
