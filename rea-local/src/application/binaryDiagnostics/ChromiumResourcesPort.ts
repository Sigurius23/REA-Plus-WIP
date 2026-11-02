import type {
  AnalysisExecution,
  ExecutionOptions,
} from "../AnalysisProvider.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import type { InspectChromiumResourcesInput } from "../../domain/native/chromiumResources.js";
import type { Result } from "../../domain/result.js";

/** Stable artifact read and DataPack decoding without executing selected content. */
export interface ChromiumResourcesPort {
  inspect(
    input: InspectChromiumResourcesInput,
    options?: ExecutionOptions,
  ): Promise<Result<AnalysisExecution, AnalysisError>>;
}
