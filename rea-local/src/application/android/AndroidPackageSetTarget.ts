import { lstat, realpath } from "node:fs/promises";
import { resolve } from "node:path";
import { DirectoryArtifactReader } from "../../artifacts/DirectoryArtifactReader.js";
import { hashReadable } from "../../artifacts/ArtifactHash.js";
import { digestCanonicalValue } from "../../domain/canonicalDigest.js";
import { AnalysisInputError } from "../../domain/analysisErrorCore.js";
import type { AndroidOperation } from "../../domain/android/androidAnalysis.js";
import type { BinaryTarget } from "../../domain/binaryTargetTypes.js";
import { compareUnicodeCodePoints } from "../../domain/unicodeCodePointOrder.js";

/** The directory target digest commits to selected APK names, byte counts and content hashes. */
export const resolveAndroidPackageSetTarget = async (
  path: string,
  operation: AndroidOperation,
  selection: readonly string[] | undefined,
  signal?: AbortSignal,
): Promise<Extract<BinaryTarget, { format: "apk-set" }> | null> => {
  const absolute = resolve(path);
  if (!(await lstat(absolute)).isDirectory()) return null;
  const root = await realpath(absolute);
  const reader = new DirectoryArtifactReader(root);
  const members: { name: string; sha256: string; bytes: number }[] = [];
  try {
    for await (const entry of reader.entries(signal, () => false)) {
      signal?.throwIfAborted();
      if (
        entry.kind !== "file" ||
        !entry.path.toLowerCase().endsWith(".apk") ||
        (selection !== undefined && !selection.includes(entry.path))
      )
        continue;
      const digest = await hashReadable(
        await reader.open(entry, signal),
        signal,
      );
      members.push({
        name: entry.path,
        sha256: digest.sha256,
        bytes: digest.bytes,
      });
    }
  } finally {
    await reader.close();
  }
  members.sort((a, b) => compareUnicodeCodePoints(a.name, b.name));
  if (
    members.length === 0 ||
    (selection !== undefined &&
      selection.some((name) => !members.some((member) => member.name === name)))
  )
    throw new AnalysisInputError(operation, undefined, [
      {
        path: ["path"],
        reason: "invalid_value",
        message:
          "A loose APK set must contain the selected regular top-level APK files; symlinks and nested APK paths are not admitted.",
      },
    ]);
  return {
    path: root,
    sha256: digestCanonicalValue({ format: "apk-set", members }),
    kind: "artifact",
    format: "apk-set",
    apkSetMembers: members,
  };
};
