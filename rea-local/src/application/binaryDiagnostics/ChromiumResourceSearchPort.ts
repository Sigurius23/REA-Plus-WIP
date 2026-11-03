import type {
  AnalysisExecution,
  ExecutionOptions,
} from "../AnalysisProvider.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import type { Result } from "../../domain/result.js";
import type { SearchChromiumResourcesInput } from "../../domain/native/chromiumResourceSearch.js";

/** Stable offline resource literal search, independent of selected inspection. */
export interface ChromiumResourceSearchPort {
  search(
    input: SearchChromiumResourcesInput,
    options?: ExecutionOptions,
  ): Promise<Result<AnalysisExecution, AnalysisError>>;
}
