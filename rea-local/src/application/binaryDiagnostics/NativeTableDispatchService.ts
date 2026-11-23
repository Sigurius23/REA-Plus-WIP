import type { ExecutionOptions } from "../AnalysisProvider.js";
import type { NativeTableDispatchPort } from "./NativeTableDispatchPort.js";
import type { AnalysisError } from "../../domain/analysisErrorBase.js";
import {
  AnalysisCancelledError,
  AnalysisOutputError,
} from "../../domain/analysisErrorCore.js";
import { createEvidence, type Evidence } from "../../domain/evidence.js";
import {
  inspectNativeTableDispatchInputSchema,
  nativeTableDispatchSchema,
  type InspectNativeTableDispatchInput,
  type NativeTableDispatch,
} from "../../domain/native/nativeTableDispatch.js";
import { parsePathInput } from "../InlineReportService.js";
import { err, ok, type Result } from "../../domain/result.js";

/** Shared strict CLI/MCP workflow; observations cannot silently change selection. */
export class NativeTableDispatchService {
  constructor(readonly provider: NativeTableDispatchPort) {}

  async inspect(
    raw: unknown,
    options?: ExecutionOptions,
  ): Promise<Result<Evidence, AnalysisError>> {
    const operation = "inspect_native_table_dispatch";
    if (options?.signal?.aborted)
      return err(new AnalysisCancelledError(operation));
    const input = parsePathInput(
      operation,
      inspectNativeTableDispatchInputSchema,
      raw,
    );
    if (!input.ok) return input;
    const result = await this.provider.inspect(input.value, options);
    if (!result.ok) return result;
    if (options?.signal?.aborted)
      return err(new AnalysisCancelledError(operation));
    const report = nativeTableDispatchSchema.safeParse(result.value);
    if (!report.success || !validDispatchReport(report.data, input.value))
      return err(
        new AnalysisOutputError(
          operation,
          "Native dispatch provider returned malformed output or changed caller selection.",
        ),
      );
    const value = report.data;
    return ok(
      createEvidence(
        {
          path: value.artifact.path,
          format: "mach-o",
          architecture: "arm64",
          sha256: value.artifact.sha256,
        },
        this.provider.identity,
        {
          operation,
          parameters: {
            path: input.value.path,
            entry_address: input.value.entry_address,
            indices: input.value.indices,
            max_file_bytes: input.value.max_file_bytes,
            max_instructions: input.value.max_instructions,
            ...(input.value.call_address === undefined
              ? {}
              : { call_address: input.value.call_address }),
          },
          result: value,
          confidence: "derived",
          limitations: value.limitations,
          locations: [{ kind: "artifact-path", path: value.artifact.path }],
        },
      ),
    );
  }
}

const validDispatchReport = (
  r: NativeTableDispatch,
  i: InspectNativeTableDispatchInput,
): boolean => {
  if (
    r.artifact.path !== i.path ||
    r.artifact.bytes > i.max_file_bytes ||
    BigInt(r.entry_address) !== BigInt(i.entry_address) ||
    JSON.stringify(r.requested_indices) !== JSON.stringify(i.indices) ||
    r.prefix.instructions.length > i.max_instructions
  )
    return false;
  if ((r.table !== null) !== (r.prefix.stop.kind === "table-branch"))
    return false;
  if (r.entries.length !== (r.table === null ? 0 : i.indices.length))
    return false;
  if (
    !r.prefix.instructions.every(
      (s, n) =>
        s.file_offset <= r.artifact.bytes - 4 &&
        BigInt(s.address) === BigInt(i.entry_address) + BigInt(n * 4),
    )
  )
    return false;
  if (
    !r.entries.every(
      (e, n) =>
        e.index === i.indices[n] &&
        (e.entry_file_offset === null
          ? e.status === "unmapped-entry" &&
            e.entry_bytes_hex === null &&
            e.entry_value === null &&
            e.target_address === null
          : e.entry_file_offset <= r.artifact.bytes - 2 &&
            e.entry_bytes_hex !== null &&
            e.entry_value !== null &&
            e.entry_value ===
              Number.parseInt(
                e.entry_bytes_hex.slice(2) + e.entry_bytes_hex.slice(0, 2),
                16,
              ) &&
            r.table !== null &&
            (e.target_address === null
              ? e.status === "address-overflow"
              : BigInt(e.target_address) ===
                BigInt(r.table.target_anchor) + BigInt(e.entry_value * 4))),
    )
  )
    return false;
  if (i.call_address === undefined) return r.invocation === null;
  const c = r.invocation;
  if (c === null || BigInt(c.call_address) !== BigInt(i.call_address))
    return false;
  if (
    ![
      ...c.preparation,
      ...(c.call_instruction === null ? [] : [c.call_instruction]),
      ...(c.known_bypass === null ? [] : [c.known_bypass]),
    ].every((s) => s.file_offset <= r.artifact.bytes - 4)
  )
    return false;
  const direct =
    c.link === "direct-to-entry" || c.link === "different-direct-target";
  if (
    direct !== (c.direct_target !== null) ||
    (direct && c.call_instruction === null)
  )
    return false;
  if (
    c.direct_target !== null &&
    (BigInt(c.direct_target) === BigInt(i.entry_address)) !==
      (c.link === "direct-to-entry")
  )
    return false;
  if (
    c.preparation.length > 0 !== (c.input_literal !== null) ||
    (c.input_literal === null) !== (c.effective_index === null)
  )
    return false;
  if (
    c.input_literal !== null &&
    c.effective_index !== Number(BigInt(c.input_literal) & 65535n)
  )
    return false;
  if (
    !c.preparation.every(
      (s, n) =>
        BigInt(s.address) ===
        BigInt(c.call_address) - BigInt((c.preparation.length - n) * 4),
    )
  )
    return false;
  if (
    c.call_instruction !== null &&
    BigInt(c.call_instruction.address) !== BigInt(c.call_address)
  )
    return false;
  if (c.mapping_status === "unresolved") return c.mapping_index === null;
  return (
    c.link === "direct-to-entry" &&
    c.direct_target !== null &&
    BigInt(c.direct_target) === BigInt(i.entry_address) &&
    c.preparation.length > 0 &&
    c.input_literal !== null &&
    c.effective_index === Number(BigInt(c.input_literal) & 65535n) &&
    c.mapping_index === c.effective_index &&
    c.known_bypass === null &&
    c.branch_scan?.completed === true &&
    r.entries.some(
      (e) => e.index === c.mapping_index && e.status === "mapped-target",
    )
  );
};
