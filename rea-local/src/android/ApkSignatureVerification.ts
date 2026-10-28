import { isAbsolute } from "node:path";
import { AnalysisCapabilityUnavailableError } from "../domain/analysisErrorCore.js";
import {
  apkSignatureMemberSchema,
  apkSignatureVerificationSchema,
} from "../domain/android/apkSignatureVerification.js";
import { hashStableFile } from "../filesystem/StableFileHash.js";
import type { AndroidOperation } from "../domain/android/androidAnalysis.js";
import type { JadxToolPort } from "./JadxAnalysis.js";

export interface ApkSignatureContext {
  readonly jar: { readonly path: string; readonly sha256: string };
  readonly members: readonly {
    readonly name: string;
    readonly path: string;
    readonly sha256: string;
  }[];
}
/** Resolve only an explicitly supplied verifier; no SDK acquisition or host configuration changes. */
export const resolveApkSignatureJar = async (
  environment: Readonly<Record<string, string | undefined>>,
  operation: AndroidOperation,
  signal: AbortSignal,
) => {
  const path = environment.REA_APKSIG_JAR;
  if (path === undefined || !isAbsolute(path))
    throw new AnalysisCapabilityUnavailableError(
      "android-apksig",
      operation,
      "Signature verification requires REA_APKSIG_JAR pointing to an absolute Android SDK Build Tools apksigner.jar path.",
    );
  return { path, sha256: (await hashStableFile(path, signal)).sha256 };
};

/** Use the existing owned JVM transport; the loaded verifier has its own recorded identity. */
export const verifyApkSignatures = async (
  tools: JadxToolPort,
  context: ApkSignatureContext,
) => {
  const members = [];
  for (const member of context.members) {
    const raw = await tools.json("rea_verify_apk_signature", {
      path: member.path,
      verifier_jar: context.jar.path,
    });
    members.push(
      apkSignatureMemberSchema.parse({
        ...rawObject(raw),
        name: member.name,
        sha256: member.sha256,
      }),
    );
  }
  const known = members.every(
    (member) => member.verified && member.signer_certificates_sha256.length > 0,
  );
  const signers = new Set(
    members.map((member) =>
      JSON.stringify([...member.signer_certificates_sha256].sort()),
    ),
  );
  return apkSignatureVerificationSchema.parse({
    authority: "android-apksig",
    status: members.every((member) => member.verified) ? "verified" : "invalid",
    verifier_jar_sha256: context.jar.sha256,
    members,
    signer_consistency: known
      ? signers.size === 1
        ? "same-signers"
        : "different-signers"
      : "unknown",
    limitations: [
      "Verifies original APK member bytes under each manifest's minimum-SDK policy. It does not verify the composed analysis image, publisher identity, certificate trust/revocation, app-store provenance or device installability. APK v4 sidecar signatures are not supplied.",
    ],
  });
};
const rawObject = (value: unknown): Record<string, unknown> =>
  typeof value === "object" && value !== null && !Array.isArray(value)
    ? (value as Record<string, unknown>)
    : {};
