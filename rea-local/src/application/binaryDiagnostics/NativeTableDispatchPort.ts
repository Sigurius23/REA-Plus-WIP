import type {
  ExecutionOptions,
  ProviderIdentity,
} from "../AnalysisProvider.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import type {
  InspectNativeTableDispatchInput,
  NativeTableDispatch,
} from "../../domain/native/nativeTableDispatch.js";
import type { Result } from "../../domain/result.js";

/** Stable file snapshot and native byte decoding boundary. */
export interface NativeTableDispatchPort {
  readonly identity: ProviderIdentity;
  inspect(
    input: InspectNativeTableDispatchInput,
    options?: ExecutionOptions,
  ): Promise<Result<NativeTableDispatch, AnalysisError>>;
}
