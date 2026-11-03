import { createHash } from "node:crypto";
import type { ExecutionOptions } from "../AnalysisProvider.js";
import { inspectInlineReport, parsePathInput } from "../InlineReportService.js";
import type { ChromiumResourceSearchPort } from "./ChromiumResourceSearchPort.js";
import {
  chromiumResourceSearchSchema,
  searchChromiumResourcesInputSchema,
  type ChromiumResourceSearch,
  type SearchChromiumResourcesInput,
} from "../../domain/native/chromiumResourceSearch.js";

const operation = "search_chromium_resources";
const matchesSelection = (
  r: ChromiumResourceSearch,
  i: SearchChromiumResourcesInput,
): boolean => {
  const needle = Buffer.from(i.query, i.query_encoding);
  const start = Math.min(i.canonical_offset, r.canonical_resources);
  const next = start + r.page.examined;
  const inside = (range: { offset: number; bytes: number }) =>
    range.offset <= r.artifact.bytes - range.bytes;
  const indices = [
    ...r.matches.map((m) => m.entry.canonical_index),
    ...r.skipped.map((s) => s.entry.canonical_index),
  ];
  return (
    r.artifact.bytes <= i.max_file_bytes &&
    (i.expected_sha256 === undefined ||
      r.artifact.sha256 === i.expected_sha256) &&
    r.query.literal === i.query &&
    r.query.encoding === i.query_encoding &&
    r.query.bytes === needle.length &&
    r.query.sha256 === createHash("sha256").update(needle).digest("hex") &&
    r.page.canonical_offset === i.canonical_offset &&
    r.page.scan_limit === i.scan_limit &&
    r.page.match_limit === i.match_limit &&
    (r.page.stop_reason === "end"
      ? next === r.canonical_resources
      : next < r.canonical_resources) &&
    (r.page.stop_reason !== "scan_limit" || r.page.examined === i.scan_limit) &&
    (r.page.stop_reason !== "match_limit" ||
      r.matches.length === i.match_limit) &&
    r.page.examined <= i.scan_limit &&
    next <= r.canonical_resources &&
    r.page.decoded + r.skipped.length === r.page.examined &&
    r.page.next_canonical_offset ===
      (next < r.canonical_resources ? next : null) &&
    r.matches.length <= i.match_limit &&
    r.matches.length <= r.page.decoded &&
    r.budgets.max_resource_bytes === i.max_resource_bytes &&
    r.budgets.max_total_decoded_bytes === i.max_total_decoded_bytes &&
    r.budgets.observed_decoded_bytes <= r.budgets.charged_decoded_bytes &&
    r.budgets.charged_decoded_bytes <= i.max_total_decoded_bytes &&
    new Set(indices).size === indices.length &&
    indices.every((n) => n >= start && n < next) &&
    [...r.matches, ...r.skipped].every(
      (m) =>
        inside(m.entry.payload) &&
        inside(m.entry.table_location) &&
        !m.entry.alias,
    ) &&
    r.matches.every(
      (m) =>
        m.decoded_bytes <= i.max_resource_bytes &&
        m.entry.payload.bytes <= i.max_resource_bytes &&
        m.byte_range.bytes === r.query.bytes &&
        m.byte_range.offset <= m.decoded_bytes - m.byte_range.bytes &&
        new Set(m.identities.map((a) => a.resource_id)).size ===
          m.identities.length &&
        m.identities.some(
          (a) =>
            a.resource_id === m.entry.resource_id &&
            a.table_location.offset === m.entry.table_location.offset &&
            a.table_location.bytes === m.entry.table_location.bytes,
        ) &&
        m.identities.every((a) => inside(a.table_location)),
    ) &&
    r.coverage.window ===
      (r.skipped.length === 0 &&
      (r.page.stop_reason === "end" || r.page.stop_reason === "scan_limit")
        ? "complete"
        : "partial") &&
    r.coverage.pack ===
      (i.canonical_offset === 0 &&
      next === r.canonical_resources &&
      r.coverage.window === "complete"
        ? "complete"
        : "partial")
  );
};

/** Shared selection and identity validation for both public adapters. */
export class ChromiumResourceSearchService {
  constructor(readonly provider: ChromiumResourceSearchPort) {}
  search(rawInput: unknown, options?: ExecutionOptions) {
    return inspectInlineReport(
      {
        operation,
        parseInput: (raw) =>
          parsePathInput(operation, searchChromiumResourcesInputSchema, raw),
        reportSchema: chromiumResourceSearchSchema,
        matchesSelection,
        inputPath: (i) => i.path,
        reportPath: (r) => r.artifact.path,
        reportSha256: (r) => r.artifact.sha256,
        malformedMessage:
          "Chromium resource search changed identity, selection or coverage invariants.",
        confidence: "observed",
      },
      (input, invocation) => this.provider.search(input, invocation),
      rawInput,
      options,
    );
  }
}
