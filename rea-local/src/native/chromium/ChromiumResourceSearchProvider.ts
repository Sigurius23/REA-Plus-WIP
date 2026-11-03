import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import { readStableArtifact } from "../../artifacts/readStableArtifact.js";
import {
  createAnalysisExecution,
  type ExecutionOptions,
} from "../../application/AnalysisProvider.js";
import { artifactInspectorFailure } from "../../application/ArtifactInspection.js";
import type { ChromiumResourceSearchPort } from "../../application/binaryDiagnostics/ChromiumResourceSearchPort.js";
import { AnalysisError } from "../../domain/analysisErrorBase.js";
import {
  AnalysisResourceConstraintError,
  AnalysisInputError,
} from "../../domain/analysisErrorCore.js";
import type { SearchChromiumResourcesInput } from "../../domain/native/chromiumResourceSearch.js";
import { err, ok } from "../../domain/result.js";
import { searchChromiumResourcePack } from "./ChromiumResourceSearch.js";

const OPERATION = "search_chromium_resources";
const IDENTITY = {
  id: "chromium-datapack-reader",
  name: "REA+ Chromium resource reader",
  version: "1",
};
const fileFailure = artifactInspectorFailure({
  operation: OPERATION,
  formatErrors: [ArtifactReaderFailure, RangeError],
  notReadable: "Not a supported Chromium resource pack",
});

/** Portable stable-file adapter; codecs operate on bounded selected bytes only. */
export class ChromiumResourceSearchProvider implements ChromiumResourceSearchPort {
  async search(
    input: SearchChromiumResourcesInput,
    options?: ExecutionOptions,
  ) {
    try {
      const selected = await readStableArtifact(
        input.path,
        input.max_file_bytes,
        options?.signal,
      );
      if (
        input.expected_sha256 !== undefined &&
        input.expected_sha256 !== selected.sha256
      )
        return err(
          new AnalysisInputError(OPERATION, undefined, [
            {
              path: ["expected_sha256"],
              reason: "invalid_value",
              message:
                "Pack SHA-256 differs from the requested continuation identity.",
            },
          ]),
        );
      const report = await searchChromiumResourcePack(
        selected.bytes,
        {
          path: input.path,
          sha256: selected.sha256,
          bytes: selected.bytes.length,
        },
        input,
        options?.signal,
      );
      return ok(
        createAnalysisExecution(report, IDENTITY, {
          subject: {
            path: input.path,
            format: "file",
            sha256: selected.sha256,
          },
          locations: [{ kind: "artifact-path", path: input.path }],
          limitations: report.limitations,
        }),
      );
    } catch (cause) {
      if (cause instanceof AnalysisError) return err(cause);
      if (cause instanceof ArtifactReaderFailure && cause.reason === "limit")
        return err(
          new AnalysisResourceConstraintError(
            OPERATION,
            "file-size",
            cause.message,
            { max_file_bytes: input.max_file_bytes },
            {
              cause,
              remediationAction:
                "Raise max_file_bytes (CLI --max-file-bytes), up to 536870912, or select a smaller pack. Unchanged limits reproduce the refusal.",
            },
          ),
        );
      return err(fileFailure(input.path)(cause));
    }
  }
}
