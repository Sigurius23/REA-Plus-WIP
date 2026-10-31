import type {
  AnalysisOperation,
  AnalysisOperationPort,
  ExecutionOptions,
} from "./AnalysisProvider.js";
import { AnalysisTimeoutError } from "../domain/analysisErrorCore.js";
import type { JsonValue } from "../domain/jsonValue.js";
import { compareUnicodeCodePoints } from "../domain/unicodeCodePointOrder.js";
import { err } from "../domain/result.js";

/** One composed request retains the limitations of every contributing provider observation. */
export class WorkflowEvidenceScope implements AnalysisOperationPort {
  readonly #limitations = new Set<string>();

  constructor(
    private readonly source: AnalysisOperationPort,
    private readonly operation: AnalysisOperation,
  ) {}

  limitations(): readonly string[] {
    return [...this.#limitations].sort(compareUnicodeCodePoints);
  }

  async execute(
    operation: AnalysisOperation,
    parameters: Readonly<Record<string, JsonValue>>,
    options?: ExecutionOptions,
  ) {
    const result = await this.source.execute(operation, parameters, options);
    if (result.ok) {
      for (const limitation of result.value.limitations)
        this.#limitations.add(limitation);
      return result;
    }
    if (
      result.error instanceof AnalysisTimeoutError &&
      result.error.context?.phase === "startup"
    ) {
      this.#limitations.add(
        `Provider ${result.error.context.providerId} startup failed at ${result.error.context.stage} during ${operation}; dependent workflow facts remain unknown.`,
      );
      return err(result.error.forOperation(this.operation));
    }
    return result;
  }
}
