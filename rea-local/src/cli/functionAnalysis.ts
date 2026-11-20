import { lstat } from "node:fs/promises";
import { resolve } from "node:path";
import { inspectAnalysisViewValidated } from "../application/analysisView/AnalysisViewService.js";
import { writeEvidenceBundle } from "../application/EvidenceBundleFiles.js";
import { AnalysisInputError } from "../domain/analysisErrorCore.js";
import type { AnalysisError } from "../domain/analysisErrorBase.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import { evidenceSchema } from "../domain/evidence.js";
import { createEvidenceBundle } from "../domain/evidenceBundle.js";
import { EvidenceFileError } from "../domain/evidenceErrors.js";
import { jsonValueSchema, type JsonValue } from "../domain/jsonValue.js";
import { withCommandCancellation } from "./commandCancellation.js";

/** Preserve a portable full dossier before a one-shot CLI returns its summary. */
export const runCliFunctionAnalysis = async (
  run: (signal: AbortSignal) => Promise<JsonValue>,
  options: {
    readonly detail: "complete" | "summary";
    readonly evidenceOutput?: string | undefined;
  },
): Promise<JsonValue> =>
  withCommandCancellation(async (signal) => {
    if (options.detail === "summary" && options.evidenceOutput === undefined)
      return failure(
        new AnalysisInputError("analyze_function", undefined, [
          {
            path: ["evidence-output"],
            reason: "invalid_value",
            message:
              "CLI summary requires --evidence-output with a new bundle path so the complete dossier remains available after this process exits.",
          },
        ]),
      );
    const path =
      options.evidenceOutput === undefined
        ? undefined
        : resolve(options.evidenceOutput);
    if (path !== undefined) {
      try {
        await lstat(path);
        return failure(new EvidenceFileError("write", "exists", { path }));
      } catch (cause: unknown) {
        if (
          !(
            cause instanceof Error &&
            "code" in cause &&
            cause.code === "ENOENT"
          )
        )
          return failure(new EvidenceFileError("write", "io", { cause, path }));
      }
    }
    const output = await run(signal);
    if (path === undefined) return output;
    const evidence = evidenceSchema.safeParse(output);
    // Native failures and failed close keep their existing typed CLI result.
    if (!evidence.success) return output;
    const saved = await writeEvidenceBundle(
      createEvidenceBundle([evidence.data]),
      path,
      false,
      signal,
    );
    if (!saved.ok)
      return failure(saved.error.retainPartialObservation(evidence.data));
    if (options.detail === "complete") return output;
    const summary = inspectAnalysisViewValidated({
      source: { kind: "inline", evidence: evidence.data },
      view: { kind: "summary" },
    });
    return summary.ok
      ? jsonValueSchema.parse(summary.value)
      : failure(summary.error);
  });

const failure = (error: AnalysisError): JsonValue => ({
  error: "Function analysis delivery failed",
  ...projectAnalysisError(error),
});
