import { randomUUID } from "node:crypto";
import { ZipArtifactReader } from "../artifacts/ZipArtifactReader.js";
import { mkdir } from "node:fs/promises";
import { isAbsolute, join } from "node:path";
import { hashStableFile } from "../filesystem/StableFileHash.js";
import {
  AnalysisCapabilityUnavailableError,
  AnalysisInputError,
} from "../domain/analysisErrorCore.js";
import type { AndroidOperation } from "../domain/android/androidAnalysis.js";
import { runOwnedCommand } from "../process/OwnedCommand.js";
import {
  snapshotAndroidEngine,
  snapshotAndroidTarget,
} from "./AndroidTargetSnapshot.js";
import { composeAndroidXapkBundle } from "./AndroidXapkBundle.js";
import type { JadxConfiguration } from "./JadxConfiguration.js";

/** Bundletool is explicitly configured and acquired as immutable tool bytes per session. */
export const resolveAndroidBundletoolJar = async (
  environment: Readonly<Record<string, string | undefined>>,
  operation: AndroidOperation,
  signal: AbortSignal,
) => {
  const path = environment.REA_BUNDLETOOL_JAR;
  if (path === undefined || !isAbsolute(path))
    throw new AnalysisCapabilityUnavailableError(
      "android-bundletool",
      operation,
      "AAB admission requires REA_BUNDLETOOL_JAR pointing to an absolute Google bundletool-all JAR. No tool is downloaded or installed by REA+.",
    );
  return { path, sha256: (await hashStableFile(path, signal)).sha256 };
};

/** Generate only a universal analysis APK, with temporary signing/configuration isolated in the owned root. */
export const composeAndroidAppBundle = async (
  target: { readonly path: string; readonly sha256: string },
  tool: { readonly path: string; readonly sha256: string },
  java: JadxConfiguration,
  environment: Readonly<Record<string, string | undefined>>,
  root: string,
  operation: AndroidOperation,
  signal: AbortSignal,
) => {
  const bundle = await snapshotAndroidTarget(
    target.path,
    target.sha256,
    root,
    operation,
    signal,
    "target.aab",
  );
  await verifyAabCapacity(bundle, operation, signal);
  const jar = await snapshotAndroidEngine(
    tool.path,
    tool.sha256,
    root,
    operation,
    signal,
    "bundletool.jar",
  );
  const buildHome = join(root, "bundletool-home");
  const temporary = join(root, "bundletool-tmp");
  await mkdir(buildHome);
  await mkdir(temporary);
  const output = join(root, "generated.apks");
  const result = await runOwnedCommand(
    {
      runId: `rea-bundletool-${randomUUID()}`,
      command: java.java,
      arguments: [
        ...java.jvmArguments,
        `-Duser.home=${buildHome}`,
        `-Djava.io.tmpdir=${temporary}`,
        "-jar",
        jar.path,
        "build-apks",
        `--bundle=${bundle}`,
        `--output=${output}`,
        "--mode=universal",
      ],
      cwd: root,
      hostEnvironment: {
        ...environment,
        ANDROID_USER_HOME: join(buildHome, ".android"),
        ANDROID_PREFS_ROOT: buildHome,
        TMPDIR: temporary,
        TMP: temporary,
        TEMP: temporary,
      },
      signal,
    },
    { timeoutMs: 120_000, diagnosticBytes: 2 * 1024 * 1024 },
  );
  if (result.exitCode !== 0)
    throw new AnalysisInputError(operation, undefined, [
      {
        path: ["path"],
        reason: "invalid_format",
        message:
          "Bundletool could not convert the selected AAB to a universal analysis APK.",
      },
    ]);
  const snapshot = await composeAndroidXapkBundle(
    { path: output, sha256: (await hashStableFile(output, signal)).sha256 },
    root,
    operation,
    signal,
    false,
    {
      format: "apks",
      apk_members: ["universal.apk"],
      base_apk: "universal.apk",
    },
  );
  return {
    ...snapshot,
    limitations: [
      ...snapshot.limitations,
      `AAB source SHA-256 ${target.sha256} was converted by bundletool JAR SHA-256 ${jar.sha256} in universal mode. Only fused modules are represented; non-fused/on-demand/device-specific coverage is unknown. Generated signing is temporary analysis packaging and does not authenticate the original AAB or publisher.`,
    ],
  };
};

/** The composed analysis APK uses ZIP32; refuse oversized source expansion before invoking bundletool. */
const verifyAabCapacity = async (
  path: string,
  operation: AndroidOperation,
  signal: AbortSignal,
): Promise<void> => {
  const reader = new ZipArtifactReader(path, "aab", undefined, undefined);
  let bytes = 0;
  try {
    for await (const entry of reader.entries(signal)) {
      signal.throwIfAborted();
      if (entry.kind !== "file") continue;
      if (
        entry.encrypted ||
        entry.declaredSize === null ||
        !Number.isSafeInteger(entry.declaredSize) ||
        entry.declaredSize < 0
      )
        throw new AnalysisInputError(operation, undefined, [
          {
            path: ["path"],
            reason: "invalid_format",
            message:
              "AAB entries must be readable and have usable declared sizes.",
          },
        ]);
      bytes += entry.declaredSize;
      if (bytes >= 4 * 1024 * 1024 * 1024)
        throw new AnalysisInputError(operation, undefined, [
          {
            path: ["path"],
            reason: "out_of_range",
            message:
              "AAB declared expansion exceeds the ZIP32 analysis image's 4 GiB capacity.",
          },
        ]);
    }
  } finally {
    await reader.close();
  }
};
