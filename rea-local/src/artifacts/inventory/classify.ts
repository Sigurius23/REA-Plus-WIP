import { hasAndroidBootImageMagic } from "../../domain/firmware/androidBootImage.js";
import { hasAndroidOtaPayloadMagic } from "../../domain/firmware/androidOtaImage.js";
import { recognizeFitCarrier } from "../../domain/firmware/fitRecognition.js";
import { hasUImageMagic } from "../../domain/firmware/uimage.js";
import { recognizeEspImage } from "../../domain/firmware/espImage.js";
import { readFileHandleWindow } from "../../filesystem/readFileHandleWindow.js";
import { hasUf2Block } from "../../domain/firmware/uf2.js";
import {
  DFUSE_SUFFIX_BYTES,
  hasDfuSePrefix,
  isDfuSeFile,
} from "../../domain/firmware/dfuse.js";
import { sameRegularFileState } from "../../filesystem/RegularFile.js";
import type { FileHandle } from "node:fs/promises";
import type { Stats } from "node:fs";
import type { StableRegularFileDescriptor } from "../../filesystem/RegularFile.js";
import type { OwnedFileHandle } from "../../filesystem/OwnedFileHandle.js";

import { classifyArtifactContent } from "./ArtifactGraphConstruction.js";
import { ARTIFACT_CLASSIFICATION_PREFIX_BYTES } from "../ArtifactHash.js";
import type { ArtifactOccurrence } from "../../domain/artifactGraph.js";
import {
  hasZipSignature,
  isZipPackageFormat,
  zipPackageFormatForPath,
  type ZipPackageFormat,
} from "../../domain/zipPackageFormat.js";
import { abortIfNeeded } from "../ArtifactHash.js";
import { ArtifactReaderFailure } from "../ArtifactReader.js";
import type { ArtifactResourceOwner } from "../ArtifactResourceScope.js";
import type { HashResult } from "../ArtifactHash.js";
import {
  hashStableRootArtifactHandle,
  openRootArtifact,
} from "./hashStableRootArtifact.js";
import type { ArtifactInventoryOptions } from "./types.js";

interface RootClassification {
  readonly format: ArtifactOccurrence["artifact_format"];
  readonly digest: HashResult | null;
}

type RootInventoryClassification = RootClassification & {
  readonly rootSource: RootInventorySource | undefined;
};

/** The admitted descriptor and the single owner that can confirm its close. */
export interface RootInventorySource extends StableRegularFileDescriptor {
  readonly owner: OwnedFileHandle;
}

/** Classify and hash one file root through the same stable open descriptor. */
export const classifyAndHashRoot = async (
  path: string,
  directory: boolean,
  expectedMetadata: Stats,
  options: Pick<
    ArtifactInventoryOptions,
    "resourceScope" | "signal" | "firmwareFormat"
  >,
): Promise<RootClassification> => {
  return options.resourceScope.run(async () => {
    const result = await classifyAndHashRootForInventory(
      path,
      directory,
      expectedMetadata,
      options,
    );
    const rootSource = result.rootSource;
    if (rootSource !== undefined) {
      const owner: ArtifactResourceOwner = {
        kind: "file-handle",
        handle: rootSource.owner,
        resource: `root artifact descriptor for ${path}`,
      };
      const cleanupAttempt = await options.resourceScope.release(owner);
      if (cleanupAttempt.kind === "failed")
        throw ArtifactReaderFailure.withCleanup(
          cleanupAttempt.cause,
          ArtifactReaderFailure.cleanupObservation(
            cleanupAttempt.cause,
            owner.resource,
          ),
        );
    }
    return { format: result.format, digest: result.digest };
  });
};

/** Classify a root and retain its admitted ZIP descriptor for child inventory. */
export const classifyAndHashRootForInventory = async (
  path: string,
  directory: boolean,
  expectedMetadata: Stats,
  options: Pick<
    ArtifactInventoryOptions,
    "resourceScope" | "signal" | "firmwareFormat"
  >,
): Promise<RootInventoryClassification> => {
  if (directory)
    return { format: "directory", digest: null, rootSource: undefined };
  const ownedHandle = await openRootArtifact(
    path,
    options.resourceScope,
    options.signal,
  );
  const handle = ownedHandle.handle;
  const owner: ArtifactResourceOwner = {
    kind: "file-handle",
    handle: ownedHandle,
    resource: `root artifact descriptor for ${path}`,
  };
  let outcome:
    | {
        readonly kind: "completed";
        readonly value: RootInventoryClassification;
      }
    | { readonly kind: "failed"; readonly cause: unknown };
  try {
    const initial = await handle.stat();
    if (!sameRegularFileState(expectedMetadata, initial))
      throw new ArtifactReaderFailure(
        "integrity",
        `Root artifact changed before inventory: ${path}`,
      );
    const format =
      options.firmwareFormat ??
      (await classifyRootFormat(path, handle, options.signal));
    const digest = await hashStableRootArtifactHandle(
      path,
      handle,
      initial,
      options.signal,
    );
    const retainSource =
      isZipPackageFormat(format) ||
      format === "mach-o-universal" ||
      format === "intel-hex" ||
      format === "srec" ||
      format === "uf2" ||
      format === "dfuse" ||
      format === "uimage" ||
      format === "fit" ||
      format === "android-boot-image" ||
      format === "android-ota-payload" ||
      format === "esp-image" ||
      format === "esp-flash-image";
    outcome = {
      kind: "completed",
      value: {
        format,
        digest,
        rootSource: retainSource
          ? { handle, initial, owner: ownedHandle }
          : undefined,
      },
    };
  } catch (cause: unknown) {
    outcome = { kind: "failed", cause };
  }
  if (outcome.kind === "failed" || outcome.value.rootSource === undefined) {
    const cleanupAttempt = await options.resourceScope.release(owner);
    if (cleanupAttempt.kind === "failed")
      throw ArtifactReaderFailure.withCleanup(
        outcome.kind === "failed" ? outcome.cause : cleanupAttempt.cause,
        ArtifactReaderFailure.cleanupObservation(
          cleanupAttempt.cause,
          owner.resource,
        ),
      );
  }
  if (outcome.kind === "failed") throw outcome.cause;
  return outcome.value;
};

const classifyRootFormat = async (
  path: string,
  handle: FileHandle,
  signal?: AbortSignal,
): Promise<ArtifactOccurrence["artifact_format"]> => {
  const magic = Buffer.alloc(ARTIFACT_CLASSIFICATION_PREFIX_BYTES);
  const observed = await handle.read(magic, 0, magic.length, 0);
  const prefix = magic.subarray(0, observed.bytesRead);
  const fileSize = (await handle.stat()).size;
  if (hasAndroidBootImageMagic(prefix)) return "android-boot-image";
  if (hasAndroidOtaPayloadMagic(prefix)) return "android-ota-payload";
  if (hasUImageMagic(prefix)) return "uimage";
  if (recognizeEspImage(prefix, fileSize) !== undefined) return "esp-image";
  if (
    await recognizeFitCarrier(prefix, fileSize, (offset, length) =>
      readFileHandleWindow(handle, offset, length, () => abortIfNeeded(signal)),
    )
  )
    return "fit";

  if (hasUf2Block(prefix)) return "uf2";
  if (hasDfuSePrefix(prefix)) {
    const size = (await handle.stat()).size;
    if (size >= DFUSE_SUFFIX_BYTES) {
      const suffix = Buffer.alloc(DFUSE_SUFFIX_BYTES);
      const tail = await handle.read(
        suffix,
        0,
        suffix.length,
        size - suffix.length,
      );
      if (tail.bytesRead === suffix.length && isDfuSeFile(prefix, suffix, size))
        return "dfuse";
    }
  }
  const lower = path.toLowerCase();
  if (hasZipSignature(prefix)) return zipRootPackageFormat(lower);
  if (
    lower.endsWith(".pkg") &&
    prefix.subarray(0, 4).toString("ascii") === "xar!"
  )
    return "pkg";
  if (lower.endsWith(".dmg") && (await hasKolyTrailer(handle))) return "dmg";
  // ASAR is chosen from its header pickle; any other suffix is a role hint.
  return classifyArtifactContent(path, prefix, (await handle.stat()).size)
    .format;
};

/** App Pack is a verified ZIP root role; nested .app members retain their observed format. */
const zipRootPackageFormat = (lower: string): ZipPackageFormat =>
  lower.endsWith(".app")
    ? "app-pack"
    : (zipPackageFormatForPath(lower) ?? "zip");

const hasKolyTrailer = async (handle: FileHandle): Promise<boolean> => {
  const size = (await handle.stat()).size;
  if (size < 512) return false;
  const trailer = Buffer.alloc(4);
  const read = await handle.read(trailer, 0, trailer.length, size - 512);
  return read.bytesRead === 4 && trailer.toString("ascii") === "koly";
};
