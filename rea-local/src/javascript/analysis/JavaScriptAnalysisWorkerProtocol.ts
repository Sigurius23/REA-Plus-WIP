import { z } from "zod";
import { jsonValueSchema } from "../../domain/jsonValue.js";
import { digestSchema } from "../../domain/digests.js";
import { JAVASCRIPT_ANALYSIS_RESOURCE_DEFAULTS } from "../../domain/javascript/javascriptAnalysisResourceControls.js";
import { javaScriptAnalysisTransferDescriptorSchema } from "./JavaScriptAnalysisTransfer.js";
import { javaScriptInlineSourceUri } from "../../domain/javascript/javascriptInlineSourceIdentity.js";

/** Independent worker execution budget; source length is not an admission rule. */
export const JAVASCRIPT_ANALYSIS_WORKER_DEFAULTS = {
  ...JAVASCRIPT_ANALYSIS_RESOURCE_DEFAULTS,
  checkpointBytes: 8 * 1024 * 1024,
  protocolBytes: 64 * 1024,
} as const;

const sourcePoint = z.strictObject({
  line: z.number().int().min(1),
  column: z.number().int().min(0),
});
const inlineSource = z
  .strictObject({
    html_path: z.string(),
    html_sha256: digestSchema,
    html_inventory_artifact_id: z.string(),
    script_kind: z.enum(["classic", "module"]),
    base_href: z.string().nullable(),
    start_offset: z.number().int().nonnegative(),
    end_offset: z.number().int().nonnegative(),
    offset_encoding: z.literal("utf16-code-units"),
    source_range: z.strictObject({ start: sourcePoint, end: sourcePoint }),
  })
  .refine(
    (value) => value.end_offset > value.start_offset,
    "Inline body range must be nonempty",
  );

/** Caller-selected artifact identity, separate from the decoded source-text digest. */
export const javaScriptWorkerRequestSchema = z
  .strictObject({
    id: z.uuid(),
    scan_shipped_material: z.boolean().optional(),
    node_budget: z.number().int().min(0).max(20_000),
    text_sha256: digestSchema,
    file: z
      .strictObject({
        path: z.string(),
        sha256: digestSchema,
        container_sha256: digestSchema,
        bytes: z.number().int().nonnegative(),
        inventory_artifact_id: z.string().nullable(),
        inline_source: inlineSource.optional(),
        kind: z.literal("javascript"),
        unpacked: z.boolean(),
      })
      .refine(
        (file) =>
          (file.inline_source === undefined) ===
          (file.inventory_artifact_id !== null),
        "Derived sources require inline provenance and no invented inventory artifact",
      ),
  })
  .refine(
    (request) =>
      request.file.inline_source === undefined ||
      (request.file.path ===
        javaScriptInlineSourceUri(request.file.inline_source) &&
        request.file.sha256 === request.text_sha256),
    "Inline source identity must commit its exact body and declared HTML range",
  );

/** Parent admission after validated static observations have been retained. */
export const javaScriptWorkerAdmissionSchema = z.strictObject({
  id: z.uuid(),
  semantic_result_budget_bytes: z.number().int().nonnegative(),
});

const identity = { id: z.uuid() };

/** Control frames never contain AST, full IR, graph rows or source text. */
export const javaScriptWorkerMessageSchema = z.discriminatedUnion("kind", [
  z.strictObject({
    kind: z.literal("ready"),
    // Null when the worker runtime (Bun) does not enforce V8 heap flags.
    heap_limit_bytes: z.number().int().positive().nullable(),
  }),
  z.strictObject({
    kind: z.literal("phase"),
    ...identity,
    phase: z.enum(["parse", "static", "semantic", "projection", "transfer"]),
  }),
  z.strictObject({
    kind: z.literal("static"),
    ...identity,
    bytes: z.number().int().nonnegative(),
    sha256: digestSchema,
  }),
  z.strictObject({
    kind: z.literal("complete"),
    ...identity,
    descriptor: javaScriptAnalysisTransferDescriptorSchema.nullable(),
  }),
  z.strictObject({
    kind: z.literal("failure"),
    ...identity,
    reason: z.enum(["resource", "output", "io"]),
    resource: z.enum(["memory", "cpu", "file-size", "transport"]).nullable(),
    limits: z.record(z.string(), jsonValueSchema).nullable(),
    message: z.string(),
  }),
]);

/** One decoded control frame from the independently owned worker. */
export type JavaScriptWorkerMessage = z.output<
  typeof javaScriptWorkerMessageSchema
>;
