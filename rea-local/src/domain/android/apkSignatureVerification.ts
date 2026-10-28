import { z } from "zod";
import { digestSchema } from "../digests.js";

export const apkSignatureMemberSchema = z.strictObject({
  name: z.string(),
  sha256: digestSchema,
  verified: z.boolean(),
  schemes: z.strictObject({
    v1: z.boolean(),
    v2: z.boolean(),
    v3: z.boolean(),
    v31: z.boolean(),
  }),
  signer_certificates_sha256: z.array(digestSchema),
  errors: z.array(z.string()),
  warnings: z.array(z.string()),
});
/** Cryptographic facet from Android's apksig, independent of decompiler declarations. */
export const apkSignatureVerificationSchema = z.strictObject({
  authority: z.literal("android-apksig"),
  status: z.enum(["verified", "invalid"]),
  verifier_jar_sha256: digestSchema,
  members: z.array(apkSignatureMemberSchema).min(1),
  signer_consistency: z.enum(["same-signers", "different-signers", "unknown"]),
  limitations: z.array(z.string()),
});
