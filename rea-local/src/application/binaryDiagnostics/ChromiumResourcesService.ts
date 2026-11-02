import type { ExecutionOptions } from "../AnalysisProvider.js";
import { inspectInlineReport, parsePathInput } from "../InlineReportService.js";
import type { ChromiumResourcesPort } from "./ChromiumResourcesPort.js";
import {
  chromiumResourcesSchema,
  inspectChromiumResourcesInputSchema,
  type ChromiumResources,
  type InspectChromiumResourcesInput,
} from "../../domain/native/chromiumResources.js";

const OPERATION = "inspect_chromium_resources";
const matchesSelection = (
  r: ChromiumResources,
  i: InspectChromiumResourcesInput,
): boolean => {
  const inside = (range: { offset: number; bytes: number }) =>
    range.offset <= r.artifact.bytes - range.bytes;
  const total = r.canonical_resources + r.alias_resources;
  const count = Math.min(i.limit, Math.max(0, total - i.offset));
  return (
    r.artifact.bytes <= i.max_file_bytes &&
    r.layout.metadata_end <= r.artifact.bytes &&
    r.layout.sentinel_offset <= r.artifact.bytes &&
    r.layout.unclaimed_ranges.every(inside) &&
    r.page.offset === i.offset &&
    r.page.limit === i.limit &&
    r.page.total === total &&
    r.page.returned === count &&
    r.entries.length === count &&
    r.page.next_offset ===
      (i.offset + count < total ? i.offset + count : null) &&
    r.entries.every(
      (e) =>
        inside(e.payload) &&
        inside(e.table_location) &&
        e.canonical_index < r.canonical_resources,
    ) &&
    (i.resource_id === undefined
      ? r.resource === null && r.coverage.selected_resource === "not_requested"
      : r.resource !== null &&
        r.resource.entry.resource_id === i.resource_id &&
        inside(r.resource.entry.payload) &&
        inside(r.resource.entry.table_location) &&
        r.resource.entry.payload.bytes <= i.max_resource_bytes &&
        r.resource.bytes <= i.max_resource_bytes &&
        r.resource.bytes_hex.length === r.resource.bytes * 2 &&
        r.resource.representation === (i.decode ? "decoded" : "stored") &&
        (i.decode ||
          (r.resource.codec === "none" &&
            r.resource.bytes === r.resource.entry.payload.bytes &&
            r.resource.sha256 === r.resource.entry.payload.sha256)) &&
        r.coverage.selected_resource === "complete")
  );
};

/** Shared selection validation and conditional-free static byte Evidence for CLI/MCP. */
export class ChromiumResourcesService {
  constructor(readonly provider: ChromiumResourcesPort) {}
  inspect(rawInput: unknown, options?: ExecutionOptions) {
    return inspectInlineReport(
      {
        operation: OPERATION,
        parseInput: (raw) =>
          parsePathInput(OPERATION, inspectChromiumResourcesInputSchema, raw),
        reportSchema: chromiumResourcesSchema,
        matchesSelection,
        inputPath: (i) => i.path,
        reportPath: (r) => r.artifact.path,
        reportSha256: (r) => r.artifact.sha256,
        malformedMessage:
          "Chromium resource reader changed identity, selection or bounded content invariants.",
        confidence: "observed",
      },
      (input, invocation) => this.provider.inspect(input, invocation),
      rawInput,
      options,
    );
  }
}
