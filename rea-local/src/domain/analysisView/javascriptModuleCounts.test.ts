import { expect, it } from "vitest";
import {
  analysisViewJavaScriptEvidence,
  analysisViewJavaScriptAnalysis,
} from "../../../tests/fixtures/analysisView.js";
import { projectAnalysisView } from "./analysisView.js";

it("distinguishes recovered registrations from the module page and graph kinds", () => {
  const analysis = analysisViewJavaScriptAnalysis();
  const evidence = analysisViewJavaScriptEvidence(analysis);
  const parent = {
    evidenceId: evidence.evidence_id,
    operation: evidence.operation,
    normalizedResult: evidence.normalized_result,
    limitations: evidence.limitations,
  };
  const summary = projectAnalysisView(parent, { kind: "summary" });
  const page = projectAnalysisView(parent, {
    kind: "page",
    collection: "modules",
    offset: 0,
    limit: 999,
  });
  if (
    !summary.ok ||
    summary.value.kind !== "summary" ||
    !("module_counts" in summary.value.summary) ||
    !page.ok
  )
    throw new Error("Expected JavaScript views");
  expect(summary.value.summary.module_counts.bundler_module_registrations).toBe(
    analysis.statistics.modules,
  );
  expect(summary.value.summary.module_counts.module_page_entries).toBe(
    page.value.coverage.total,
  );
  expect(
    summary.value.summary.module_counts.module_page_entries,
  ).toBeGreaterThan(analysis.statistics.modules);
});
