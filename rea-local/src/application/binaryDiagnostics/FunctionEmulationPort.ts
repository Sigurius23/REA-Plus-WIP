import type {
  ExecutionOptions,
  ProviderIdentity,
} from "../AnalysisProvider.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import type {
  EmulateFunctionInput,
  FunctionEmulation,
} from "../../domain/native/functionEmulation.js";
import type { Result } from "../../domain/result.js";

/** One concrete CPU experiment, independent of an active disassembler or app process. */
export interface FunctionEmulationPort {
  readonly identity: ProviderIdentity;
  emulate(
    input: EmulateFunctionInput,
    options?: ExecutionOptions,
  ): Promise<Result<FunctionEmulation, AnalysisError>>;
  close(): Promise<void>;
}
