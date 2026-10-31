import { z } from "zod";

/** Default absolute deadline for Ghidra import, analysis, bridge, and readiness. */
export const DEFAULT_GHIDRA_STARTUP_TIMEOUT_MS = 330_000;

// Node schedules delays above this signed 32-bit boundary as a 1 ms timer.
const MAX_TIMER_DELAY_MS = 2_147_483_647;

/** Parse the optional setting without reading the ambient process environment. */
export const ghidraStartupTimeoutSchema = z
  .string()
  .regex(/^[1-9]\d*$/u, "must be a positive decimal integer")
  .transform(Number)
  .pipe(z.number().int().min(1).max(MAX_TIMER_DELAY_MS))
  .default(DEFAULT_GHIDRA_STARTUP_TIMEOUT_MS);

// Ghidra 12.1.4 multiplies seconds by 1000 as a signed Java int before scheduling.
const MAX_GHIDRA_ANALYSIS_TIMEOUT_SECONDS = 2_147_483;
export const ghidraAnalysisTimeoutValueSchema = z
  .number()
  .int()
  .min(1)
  .max(MAX_GHIDRA_ANALYSIS_TIMEOUT_SECONDS);

/** Explicit per-file auto-analysis bound, safe for Ghidra's millisecond conversion. */
export const ghidraAnalysisTimeoutSecondsSchema = z
  .string()
  .regex(/^[1-9]\d*$/u, "must be a positive decimal integer")
  .transform(Number)
  .pipe(ghidraAnalysisTimeoutValueSchema);
