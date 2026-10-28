import { z } from "incur";
import { javaScriptAnalysisResourceControlsSchema } from "./domain/javascript/javascriptAnalysisResourceControls.js";

/** Accept an agent-selected browser observation duration without an artificial ceiling. */
export const observationDuration = (fallback: number, minimum = 0) =>
  z
    .number()
    .int()
    .min(minimum)
    .default(fallback)
    .describe("Observation duration in milliseconds");

/** Shared passive browser origin options. */
export const browserScopeOptions = {
  allowedOrigins: z
    .array(z.string().min(1))
    .optional()
    .describe("Optional exact-origin filter"),
};

export const browserPageInspectionOptions = z.object({
  ...browserScopeOptions,
  observationMs: observationDuration(500),
  includeAccessibilityText: z
    .boolean()
    .default(false)
    .describe("Include accessibility text"),
  includeConsoleText: z
    .boolean()
    .default(false)
    .describe("Include console message text"),
  includeJsonBodyShapes: z
    .boolean()
    .default(false)
    .describe("Include structural shapes of JSON response bodies"),
  includeWebsocketShapes: z
    .boolean()
    .default(false)
    .describe("Include structural shapes of WebSocket payloads"),
  includeScriptSources: z
    .boolean()
    .default(false)
    .describe("Include JavaScript source text"),
  includeStorageKeys: z
    .boolean()
    .default(false)
    .describe("Include storage key names without values"),
  includeStorageFingerprints: z
    .boolean()
    .default(false)
    .describe("Include content-derived storage fingerprints"),
});

export const electronPageInspectionOptions = z.object({
  observationMs: observationDuration(100),
  includeScriptSources: z
    .boolean()
    .default(false)
    .describe("Include JavaScript source text"),
});

export const javascriptApplicationOptions = z.object({
  scanShippedMaterial:
    javaScriptAnalysisResourceControlsSchema.shape.scan_shipped_material,
  maxHeapMb: javaScriptAnalysisResourceControlsSchema.shape.max_heap_mb,
  analysisTimeoutMs:
    javaScriptAnalysisResourceControlsSchema.shape.analysis_timeout_ms,
  maxSemanticSourceBytes:
    javaScriptAnalysisResourceControlsSchema.shape.max_semantic_source_bytes,
  pathsInclude: z
    .array(z.string().min(1))
    .optional()
    .describe(
      "Artifact-relative glob paths that must match to be analyzed; repeat for more. Without it every path is analyzed. '*' and '?' match within one segment, '**' crosses segments",
    ),
  pathsExclude: z
    .array(z.string().min(1))
    .optional()
    .describe(
      "Artifact-relative glob paths that are skipped even when included; repeat for more",
    ),
  artifactFormat: z
    .enum(["auto", "asar", "directory"])
    .default("auto")
    .describe("Application artifact format"),
  integrityPolicy: z
    .enum(["fail", "record-and-continue"])
    .default("fail")
    .describe("Behavior when declared application integrity does not match"),
});
