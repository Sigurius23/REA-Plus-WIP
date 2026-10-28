import { resolveAndroidPackageSetTarget } from "./AndroidPackageSetTarget.js";
import { AnalysisError as ExpectedAnalysisError } from "../../domain/analysisErrorBase.js";
import { BinaryTargetError } from "../../domain/configurationErrors.js";
import type { AndroidAnalysisPort } from "./AndroidAnalysisPort.js";
import type { ExecutionOptions } from "../AnalysisProvider.js";
import { parseBinaryTarget } from "../BinaryTargetResolver.js";
import {
  androidRequestSchema,
  type AndroidOperation,
} from "../../domain/android/androidAnalysis.js";
import {
  AnalysisCancelledError,
  AnalysisInputError,
} from "../../domain/analysisErrorCore.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import { createEvidence, type Evidence } from "../../domain/evidence.js";
import { jsonObjectSchema } from "../../domain/jsonValue.js";
import { err, ok, type Result } from "../../domain/result.js";

/** Shared CLI/MCP admission, execution and Evidence composition for Android. */
export class AndroidAnalysisService {
  constructor(readonly provider: AndroidAnalysisPort) {}

  /** Inspect a caller-selected APK and retain producing-provider provenance inline. */
  async execute(
    operation: AndroidOperation,
    input: unknown,
    options?: ExecutionOptions,
  ): Promise<Result<Evidence, AnalysisError>> {
    if (options?.signal?.aborted === true)
      return err(new AnalysisCancelledError(operation));
    const request = androidRequestSchema.safeParse({ operation, input });
    if (!request.success)
      return err(new AnalysisInputError(operation, { cause: request.error }));
    let directory;
    try {
      directory = await resolveAndroidPackageSetTarget(
        request.data.input.path,
        operation,
        request.data.input.apk_members,
        options?.signal,
      );
    } catch (cause: unknown) {
      return err(
        cause instanceof ExpectedAnalysisError
          ? cause
          : new BinaryTargetError(
              request.data.input.path,
              "Android target could not be read",
              { cause },
            ),
      );
    }
    const target =
      directory === null
        ? await parseBinaryTarget(
            request.data.input.path,
            options?.signal === undefined ? {} : { signal: options.signal },
          )
        : ok(directory);
    if (!target.ok) return target;
    const executed = await this.provider.execute(
      target.value,
      request.data,
      options,
    );
    if (!executed.ok) return executed;
    const execution = executed.value;
    return ok(
      createEvidence(execution.subject ?? target.value, execution.provider, {
        operation,
        parameters: jsonObjectSchema.parse(request.data.input),
        result: execution.result,
        rawResult: execution.rawResult,
        limitations: execution.limitations,
        locations: execution.locations,
        confidence:
          operation === "inspect_android_method" ? "derived" : "observed",
      }),
    );
  }
}
