import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import { readStableArtifact } from "../../artifacts/readStableArtifact.js";
import type { NativeTableDispatchPort } from "../../application/binaryDiagnostics/NativeTableDispatchPort.js";
import type { ExecutionOptions } from "../../application/AnalysisProvider.js";
import { ArtifactOperationError } from "../../domain/artifactOperationError.js";
import {
  AnalysisAccessDeniedError,
  AnalysisArtifactChangedError,
  AnalysisCancelledError,
  AnalysisInputError,
  AnalysisResourceConstraintError,
} from "../../domain/analysisErrorCore.js";
import type { InspectNativeTableDispatchInput } from "../../domain/native/nativeTableDispatch.js";
import { err, ok } from "../../domain/result.js";
import { NATIVE_TABLE_DISPATCH_PROVIDER } from "../../application/InvestigationProviders.js";
import { parseNativeTableDispatch } from "./NativeTableDispatchParser.js";

/** Portable parser over one bounded, identity-checked regular file. */
export class NativeTableDispatchProvider implements NativeTableDispatchPort {
  readonly identity = NATIVE_TABLE_DISPATCH_PROVIDER;

  async inspect(
    input: InspectNativeTableDispatchInput,
    options?: ExecutionOptions,
  ) {
    try {
      const snapshot = await readStableArtifact(
        input.path,
        input.max_file_bytes,
        options?.signal,
      );
      return ok(
        await parseNativeTableDispatch(
          snapshot.bytes,
          {
            path: input.path,
            sha256: snapshot.sha256,
            bytes: snapshot.bytes.length,
          },
          input,
          options?.signal,
        ),
      );
    } catch (cause) {
      return err(nativeTableDispatchFailure(cause, input, options?.signal));
    }
  }
}

const nativeTableDispatchFailure = (
  cause: unknown,
  input: InspectNativeTableDispatchInput,
  signal: AbortSignal | undefined,
) => {
  const operation = "inspect_native_table_dispatch";
  if (signal?.aborted) return new AnalysisCancelledError(operation, { cause });

  if (cause instanceof ArtifactReaderFailure) {
    if (cause.reason === "limit")
      return new AnalysisResourceConstraintError(
        operation,
        "memory",
        cause.message,
        {
          max_file_bytes: input.max_file_bytes,
        },
        {
          cause,
          remediationAction:
            "Increase max_file_bytes enough to admit the selected artifact (supported maximum 512 MiB), or select a smaller artifact. Retrying the same artifact with unchanged max_file_bytes reproduces this failure; worker heap settings do not change this input cap.",
        },
      );
    if (cause.reason === "integrity")
      return new AnalysisArtifactChangedError(
        operation,
        input.path,
        cause.message,
        { cause },
      );
    if (cause.reason === "path" || cause.reason === "format")
      return new AnalysisInputError(operation, { cause }, [
        {
          path: ["path"],
          reason: "invalid_format",
          message: cause.message,
        },
      ]);
    if (cause.reason === "cancelled")
      return new AnalysisCancelledError(operation, { cause });
  }

  if (cause instanceof Error && "code" in cause) {
    if (cause.code === "EACCES" || cause.code === "EPERM")
      return new AnalysisAccessDeniedError(operation, input.path, cause.code, {
        cause,
      });
    if (cause.code === "ENOENT" || cause.code === "ENOTDIR")
      return new AnalysisInputError(operation, { cause }, [
        {
          path: ["path"],
          reason: "invalid_value",
          message: `Selected Mach-O image could not be read (${cause.code}): ${input.path}.`,
        },
      ]);
  }

  return new ArtifactOperationError(
    operation,
    cause instanceof ArtifactReaderFailure ? cause.reason : "io",
    undefined,
    cause instanceof Error
      ? cause.message
      : "Native dispatch artifact inspection failed.",
    { cause },
  );
};
