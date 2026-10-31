import type { JavaScriptStaticAnalysis } from "./javascriptStaticAnalysisTypes.js";

/** Preserve historical aggregate coverage without upgrading known syntax or fact gaps. */
export const hasCompleteJavaScriptStaticCoverage = (
  analysis: JavaScriptStaticAnalysis,
): boolean =>
  analysis.parse_status === "complete" &&
  analysis.parse_error_count === 0 &&
  (analysis.syntax_parse_status === undefined ||
    analysis.syntax_parse_status === "complete") &&
  (analysis.static_facts_status === undefined ||
    analysis.static_facts_status === "complete") &&
  (analysis.unresolved_static_occurrences === undefined ||
    analysis.unresolved_static_occurrences === 0);
