import { z } from "zod";
import {
  ArtifactReaderFailure,
  type ArtifactEntry,
  type ArtifactReader,
} from "../artifacts/ArtifactReader.js";
import { streamChunkToBuffer } from "../artifacts/StreamBytes.js";

/** Bound the decompressed JSON before buffering and allocating its object tree. */
const MAXIMUM_MANIFEST_BYTES = 1024 * 1024;
const manifestSchema = z.object({
  package_name: z.string().min(1).optional(),
  split_apks: z
    .array(z.object({ id: z.string().min(1), file: z.string().min(1) }))
    .optional(),
});

/** Resolve source identity once; never rename a declared base to base.apk. */
export const resolveXapkBaseName = async (
  reader: ArtifactReader,
  manifest: ArtifactEntry,
  memberNames: readonly string[],
  signal: AbortSignal,
): Promise<string | undefined> => {
  const text = await readManifest(reader, manifest, signal);
  let value: unknown;
  try {
    value = JSON.parse(text);
  } catch (cause: unknown) {
    throw invalidManifest("must contain valid UTF-8 JSON", cause);
  }
  const parsed = manifestSchema.safeParse(value);
  if (!parsed.success)
    throw invalidManifest("has invalid package_name or split_apks metadata");
  const { package_name: packageName, split_apks: splits } = parsed.data;
  const names = new Set(memberNames);
  const ids = new Set<string>();
  const files = new Set<string>();
  let declaredBase: string | undefined;
  for (const split of splits ?? []) {
    signal.throwIfAborted();
    if (ids.has(split.id) || files.has(split.file))
      throw invalidManifest(
        "contains duplicate module IDs or file declarations",
      );
    ids.add(split.id);
    files.add(split.file);
    if (!names.has(split.file))
      throw invalidManifest(
        `declares ${JSON.stringify(split.file)}, which is not a readable top-level APK member`,
      );
    if (split.id === "base") declaredBase = split.file;
  }
  if (declaredBase !== undefined) return declaredBase;

  // Legacy bundles can omit split declarations. Accept only one filename
  // candidate, and never override an explicit non-base module declaration.
  const candidates = [
    ...new Set([
      ...(packageName === undefined ? [] : [`${packageName}.apk`]),
      "base.apk",
    ]),
  ].filter((name) => names.has(name) && !files.has(name));
  if (candidates.length > 1)
    throw invalidManifest(
      "has ambiguous base APK filenames; declare one module with id base",
    );
  return candidates[0];
};

const readManifest = async (
  reader: ArtifactReader,
  entry: ArtifactEntry,
  signal: AbortSignal,
): Promise<string> => {
  if (entry.encrypted)
    throw invalidManifest("must be readable without decryption");
  const size = entry.declaredSize;
  if (size === null || !Number.isSafeInteger(size) || size < 0)
    throw invalidManifest("has an unusable declared size");
  if (size > MAXIMUM_MANIFEST_BYTES)
    throw invalidManifest(
      `exceeds the ${MAXIMUM_MANIFEST_BYTES}-byte JSON memory budget`,
    );
  const stream = await reader.open(entry, signal);
  const chunks: Buffer[] = [];
  let received = 0;
  try {
    for await (const chunk of stream) {
      signal.throwIfAborted();
      const bytes = streamChunkToBuffer(chunk);
      received += bytes.length;
      if (received > size || received > MAXIMUM_MANIFEST_BYTES)
        throw invalidManifest(
          "grew beyond its declared size or JSON memory budget",
        );
      chunks.push(bytes);
    }
    signal.throwIfAborted();
    if (received !== size)
      throw invalidManifest("does not match its declared size");
    try {
      return new TextDecoder("utf-8", { fatal: true }).decode(
        Buffer.concat(chunks),
      );
    } catch (cause: unknown) {
      throw invalidManifest("must contain valid UTF-8 JSON", cause);
    }
  } finally {
    stream.destroy();
  }
};

const invalidManifest = (
  reason: string,
  cause?: unknown,
): ArtifactReaderFailure =>
  new ArtifactReaderFailure("integrity", `XAPK manifest.json ${reason}.`, {
    cause,
  });
