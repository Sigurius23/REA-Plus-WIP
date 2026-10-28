import { z } from "zod";
import type { JsonValue } from "../jsonValue.js";
import type { ApplicationCoverage } from "./javascriptApplicationEvidenceSchemas.js";

/** Shared operational defaults for the isolated source-analysis boundary. */
export const JAVASCRIPT_ANALYSIS_RESOURCE_DEFAULTS = {
  heapMb: 1024,
  timeoutMs: 300_000,
} as const;

/** Characterization of one parent's result-retention economy, per run. */
export interface JavaScriptAnalysisStaticReserveInput {
  /** Whole result budget the parent reserved at construction. */
  readonly result_budget_bytes: number;
  /** Compact static retention observed so far (checkpoint bytes, expanded). */
  readonly retained_static_bytes: number;
  /** How many sources those observations came from. */
  readonly observed_sources: number;
  /** Sources still to be read; undefined turns the reserve off entirely. */
  readonly sources_remaining: number | undefined;
}

/** Safety multiple on the observed mean per-source static cost. */
const STATIC_RESERVE_MEAN_MULTIPLE = 3;
/** Largest share of the whole result budget a reserve may claim. */
const STATIC_RESERVE_SHARE_NUMERATOR = 4;
const STATIC_RESERVE_SHARE_DENOMINATOR = 5;

/**
 * Budget held back so the sources after the current one can still retain
 * their compact static observations.
 *
 * Sizing that reserve from a fixed fraction of the whole budget starves the
 * boundary whenever per-source static facts are small relative to the budget:
 * the reserve alone exceeds what all future sources will ever cost, the
 * semantic offer reaches zero partway through the run, and every remaining
 * file silently loses its semantic module facts. Instead, size the reserve
 * from what this run has actually observed per source (a safety multiple
 * absorbs larger late sources) and cap it at the same fixed fraction, which
 * keeps the promise "all future compact static facts remain affordable"
 * without promising capacity the run will never use.
 */
export const javaScriptStaticObservationReserve = ({
  result_budget_bytes,
  retained_static_bytes,
  observed_sources,
  sources_remaining,
}: JavaScriptAnalysisStaticReserveInput): number => {
  if (sources_remaining === undefined || sources_remaining <= 0) return 0;
  const meanPerSource = retained_static_bytes / Math.max(1, observed_sources);
  const observedEstimate =
    sources_remaining * STATIC_RESERVE_MEAN_MULTIPLE * meanPerSource;
  return Math.min(
    Math.floor(
      (result_budget_bytes * STATIC_RESERVE_SHARE_NUMERATOR) /
        STATIC_RESERVE_SHARE_DENOMINATOR,
    ),
    Math.floor(observedEstimate),
  );
};

/** Project observed execution limits without inventing unmeasured values. */
export const javaScriptAnalysisCoverageLimits = (
  limits: Readonly<Record<string, JsonValue>> | null,
): ApplicationCoverage["limits"] => {
  const result: ApplicationCoverage["limits"] = [];
  for (const key of [
    "worker_heap_limit_bytes",
    "worker_process_memory_limit_bytes",
    "worker_timeout_ms",
    "parent_result_budget_bytes",
    "semantic_result_budget_bytes",
    "transfer_record_bytes",
    "transfer_file_bytes",
  ]) {
    const value = limits?.[key];
    if (typeof value !== "number" || !Number.isSafeInteger(value) || value < 0)
      continue;
    result.push({
      name: `javascript_analysis_${key}`,
      value,
      unit: key.endsWith("_ms") ? "milliseconds" : "bytes",
    });
  }
  return result;
};

/** Optional operational choices; omission keeps them out of Evidence parameters. */
export const javaScriptAnalysisResourceControlsSchema = z.strictObject({
  scan_shipped_material: z
    .boolean()
    .optional()
    .describe(
      "Opt-in filename/JavaScript-literal candidate scan. It does not prove secrecy, key validity or private-key presence.",
    ),
  max_heap_mb: z
    .number()
    .int()
    .min(128)
    .max(16_384)
    .optional()
    .describe(
      "Maximum V8 old-space heap in MiB for the isolated JavaScript source analyzer; defaults to 1024. This does not change the CLI/MCP process heap. When REA+ runs on Bun, which ignores V8 heap flags, Windows instead limits the analyzer's committed memory to this budget plus a 512 MiB runtime reserve; other Bun hosts enforce no limit.",
    ),
  analysis_timeout_ms: z
    .number()
    .int()
    .min(1)
    .max(2_147_483_647)
    .optional()
    .describe(
      "Maximum startup, analysis and transfer time per JavaScript source, in milliseconds; defaults to 300000. On timeout, return collected partial Evidence and stop the analysis.",
    ),
  max_semantic_source_bytes: z
    .number()
    .int()
    .min(1)
    .max(Number.MAX_SAFE_INTEGER)
    .optional()
    .describe(
      "Largest JavaScript source, in UTF-8 bytes, that gets semantic analysis. Larger sources, such as multi-megabyte vendor bundles, keep their static facts (imports, endpoints, storage, routes) and skip the semantic graph, which saves time and leaves result capacity for the other sources. Unlimited by default.",
    ),
});
