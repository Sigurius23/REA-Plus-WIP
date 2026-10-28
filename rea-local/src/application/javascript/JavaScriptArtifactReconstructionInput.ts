import { z } from "zod";
import { artifactIntegrityPolicySchema } from "../../domain/artifactIntegrityPolicy.js";
import { javaScriptAnalysisResourceControlsSchema } from "../../domain/javascript/javascriptAnalysisResourceControls.js";
import { javascriptAnalysisPathScopeSchema } from "../../domain/javascript/javascriptAnalysisPathScope.js";

/** Local ASAR/directory reconstruction request. */
export const javascriptArtifactReconstructionInputSchema = z.strictObject({
  input_path: z.string().min(1),
  format: z.enum(["auto", "asar", "directory"]).default("auto"),
  integrity_policy: artifactIntegrityPolicySchema,
  ...javaScriptAnalysisResourceControlsSchema.shape,
  ...javascriptAnalysisPathScopeSchema.shape,
});

/** Parsed local reconstruction request. */
export type JavaScriptArtifactReconstructionInput = z.infer<
  typeof javascriptArtifactReconstructionInputSchema
>;
