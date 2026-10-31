import type { ExecutionOptions } from "../AnalysisProvider.js";
import { parsePathInput } from "../InlineReportService.js";
import type { FunctionEmulationPort } from "./FunctionEmulationPort.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import {
  AnalysisCancelledError,
  AnalysisOutputError,
} from "../../domain/analysisErrorCore.js";
import type { Evidence } from "../../domain/evidence.js";
import {
  emulateFunctionInputSchema,
  functionEmulationSchema,
  functionEmulationEvidence,
  emulationRegisterNames,
} from "../../domain/native/functionEmulation.js";
import { err, ok, type Result } from "../../domain/result.js";

/** Shared validation, conditional authority and Evidence identity for public CLI/MCP. */
export class FunctionEmulationService {
  constructor(readonly provider: FunctionEmulationPort) {}

  close(): Promise<void> {
    return this.provider.close();
  }

  async emulate(
    rawInput: unknown,
    options?: ExecutionOptions,
  ): Promise<Result<Evidence, AnalysisError>> {
    const operation = "emulate_function";
    if (options?.signal?.aborted)
      return err(new AnalysisCancelledError(operation));
    const parsed = parsePathInput(
      operation,
      emulateFunctionInputSchema,
      rawInput,
    );
    if (!parsed.ok) return parsed;
    const input = parsed.value;
    const result = await this.provider.emulate(input, options);
    if (!result.ok) return result;
    if (options?.signal?.aborted)
      return err(new AnalysisCancelledError(operation));
    const parsedOutput = functionEmulationSchema.safeParse(result.value);
    if (!parsedOutput.success)
      return err(
        new AnalysisOutputError(
          operation,
          "Emulation provider returned malformed observations.",
        ),
      );
    const output = parsedOutput.data;
    const equal = (a: unknown, b: unknown) =>
      JSON.stringify(a) === JSON.stringify(b);
    const names = emulationRegisterNames(input.architecture).sort();
    if (
      output.artifact.path !== input.path ||
      output.architecture !== input.architecture ||
      output.entry_address !== input.entry_address ||
      !equal(
        output.code_regions.map(({ sha256: _sha256, ...region }) => region),
        input.code_regions,
      ) ||
      !equal(
        output.memory_regions.map(
          ({ initial_sha256: _hash, ...region }) => region,
        ),
        input.memory_regions.map((r) => ({
          address: r.address,
          size: r.bytes_hex.length / 2,
          permissions: r.permissions,
        })),
      ) ||
      !equal(
        output.memory_observations.map(({ address, size }) => ({
          address,
          size,
        })),
        input.observe_memory,
      ) ||
      !equal(Object.keys(output.registers_before).sort(), names) ||
      !equal(Object.keys(output.registers_after).sort(), names) ||
      output.coverage.instructions_started > input.max_instructions ||
      output.coverage.unique_instructions > input.max_coverage_entries ||
      output.coverage.unique_instructions !==
        output.coverage.instructions.length ||
      output.coverage.instructions.reduce(
        (sum, item) => sum + item.visits,
        0,
      ) !== output.coverage.instructions_started ||
      new Set(output.coverage.instructions.map((item) => item.address)).size !==
        output.coverage.unique_instructions ||
      output.memory_observations.some((r) => {
        if (
          r.before_hex.length !== r.size * 2 ||
          r.after_hex.length !== r.size * 2
        )
          return true;
        let changed = 0;
        for (let i = 0; i < r.before_hex.length; i += 2)
          if (r.before_hex.slice(i, i + 2) !== r.after_hex.slice(i, i + 2))
            changed += 1;
        return changed !== r.changed_bytes;
      })
    )
      return err(
        new AnalysisOutputError(
          operation,
          "Emulation observations changed caller selections or violate coverage/memory invariants.",
        ),
      );
    return ok(functionEmulationEvidence(input, output, this.provider.identity));
  }
}
