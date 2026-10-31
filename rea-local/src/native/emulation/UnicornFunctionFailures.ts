import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import { AnalysisError } from "../../domain/analysisErrorBase.js";
import {
  AnalysisAccessDeniedError,
  AnalysisArtifactChangedError,
  AnalysisCancelledError,
  AnalysisCapabilityUnavailableError,
  AnalysisInputError,
  AnalysisOutputError,
  AnalysisResourceConstraintError,
  AnalysisTimeoutError,
} from "../../domain/analysisErrorCore.js";
import { ProviderAdapterError } from "../../domain/providerAdapterError.js";
import { ProviderCleanupError } from "../../domain/providerCleanupError.js";
import {
  FUNCTION_EMULATION_LIMITS,
  type EmulateFunctionInput,
} from "../../domain/native/functionEmulation.js";
import { OwnedCommandFailure } from "../../process/OwnedCommand.js";

/** Preserve input, resource, interruption and lifecycle authority at the engine boundary. */
export const unicornFailure = (
  cause: unknown,
  phase: string,
  input: EmulateFunctionInput,
  provider: string,
  signal?: AbortSignal,
): AnalysisError => {
  const operation = "emulate_function";
  if (cause instanceof AnalysisError) return cause;
  if (cause instanceof OwnedCommandFailure) {
    const capturedOutput =
      cause.snapshot === null
        ? undefined
        : {
            stdout: cause.snapshot.stdout.text,
            stderr: cause.snapshot.stderr.text,
            truncated: cause.snapshot.diagnosticTruncated === true,
            exit_code: cause.snapshot.exitCode ?? null,
            signal: cause.snapshot.signal ?? null,
          };
    if (cause.cleanupFailure !== null)
      return new ProviderCleanupError(
        provider,
        cause.resources,
        { reason: cause.cleanupFailure },
        { operation, cause },
      );
    if (cause.reason === "cancelled")
      return new AnalysisCancelledError(operation, {
        cause,
        ...(capturedOutput === undefined ? {} : { capturedOutput }),
      });
    if (cause.reason === "timeout")
      return new AnalysisTimeoutError(operation, input.timeout_ms + 15_000, {
        cause,
        ...(capturedOutput === undefined ? {} : { capturedOutput }),
      });
    if (cause.reason === "output-limit")
      return new AnalysisOutputError(operation, cause.message, {
        cause,
        ...(capturedOutput === undefined ? {} : { capturedOutput }),
      });
    return new ProviderAdapterError(provider, operation, {
      cause,
      diagnostics: { phase },
      ...(capturedOutput === undefined ? {} : { capturedOutput }),
    });
  }
  if (signal?.aborted) return new AnalysisCancelledError(operation, { cause });
  if (cause instanceof ArtifactReaderFailure) {
    if (cause.reason === "integrity")
      return new AnalysisArtifactChangedError(
        operation,
        input.path,
        cause.message,
        { cause },
      );
    if (cause.reason === "limit")
      return new AnalysisResourceConstraintError(
        operation,
        "memory",
        cause.message,
        { ...FUNCTION_EMULATION_LIMITS },
        { cause },
      );
    if (cause.reason === "cancelled")
      return new AnalysisCancelledError(operation, { cause });
    return new AnalysisInputError(operation, { cause }, [
      { path: ["path"], reason: "invalid_format", message: cause.message },
    ]);
  }
  if (cause instanceof Error && "code" in cause) {
    if (cause.code === "EPERM" || cause.code === "EACCES")
      return new AnalysisAccessDeniedError(operation, input.path, cause.code, {
        cause,
      });
    if (cause.code === "ENOENT" || cause.code === "ENOTDIR")
      return new AnalysisInputError(operation, { cause }, [
        {
          path: [phase === "configuration" ? "REA_UNICORN_PYTHON" : "path"],
          reason: "invalid_value",
          message: cause.message,
        },
      ]);
  }
  if (
    typeof cause === "object" &&
    cause !== null &&
    "reason" in cause &&
    "message" in cause &&
    typeof cause.message === "string"
  ) {
    if (cause.reason === "unavailable")
      return new AnalysisCapabilityUnavailableError(
        provider,
        operation,
        cause.message,
      );
    if (cause.reason === "input")
      return new AnalysisInputError(operation, undefined, [
        { path: [], reason: "invalid_value", message: cause.message },
      ]);
    if (cause.reason === "resource")
      return new AnalysisResourceConstraintError(
        operation,
        "memory",
        cause.message,
        { ...FUNCTION_EMULATION_LIMITS },
      );
  }
  return new ProviderAdapterError(provider, operation, {
    cause,
    userMessage:
      cause instanceof Error
        ? cause.message
        : typeof cause === "object" && cause !== null && "message" in cause
          ? String(cause.message)
          : "Emulation engine failed.",
    diagnostics: { phase },
  });
};
