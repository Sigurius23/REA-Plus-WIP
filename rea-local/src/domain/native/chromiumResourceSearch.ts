import { z } from "zod";
import {
  chromiumResourcesSchema,
  inspectChromiumResourcesInputSchema,
} from "./chromiumResources.js";

const uint = z.number().int().min(0).max(0xffffffff);
const digest = z.string().regex(/^[a-f0-9]{64}$/u);
const range = z.strictObject({ offset: uint, bytes: uint });
const resource = chromiumResourcesSchema.shape.entries.element;

/** Literal bytes, never regexes; bounded canonical windows make coverage resumable. */
export const searchChromiumResourcesInputSchema = z.strictObject({
  path: inspectChromiumResourcesInputSchema.shape.path,
  query: z
    .string()
    .min(1)
    .max(4096)
    .refine(
      (s) =>
        Array.from(s).every((c) => {
          const point = c.codePointAt(0) ?? 0;
          return point < 0xd800 || point > 0xdfff;
        }),
      "Query must be well-formed Unicode",
    )
    .describe(
      "Case-sensitive literal, at most 4096 UTF-16 code units; no normalization",
    ),
  query_encoding: z
    .enum(["utf8", "utf16le"])
    .default("utf8")
    .describe(
      "Encoding of the needle, independent of pack encoding or payload validity",
    ),
  canonical_offset: uint.default(0),
  scan_limit: z.number().int().min(1).max(1024).default(256),
  match_limit: z.number().int().min(1).max(1024).default(64),
  max_file_bytes: inspectChromiumResourcesInputSchema.shape.max_file_bytes,
  max_resource_bytes:
    inspectChromiumResourcesInputSchema.shape.max_resource_bytes,
  max_total_decoded_bytes: z
    .number()
    .int()
    .min(1)
    .max(536870912)
    .default(67108864),
  expected_sha256: digest
    .optional()
    .describe("Reject a stale pack when continuing canonical pages"),
});

/** First literal occurrence per canonical payload; aliases share a single decode. */
export const chromiumResourceSearchSchema = z.strictObject({
  artifact: chromiumResourcesSchema.shape.artifact,
  format: z.literal("chromium-datapack"),
  version: chromiumResourcesSchema.shape.version,
  encoding: chromiumResourcesSchema.shape.encoding,
  canonical_resources: chromiumResourcesSchema.shape.canonical_resources,
  alias_resources: chromiumResourcesSchema.shape.alias_resources,
  query: z.strictObject({
    literal: z.string(),
    encoding: z.enum(["utf8", "utf16le"]),
    bytes: uint,
    sha256: digest,
  }),
  page: z.strictObject({
    canonical_offset: uint,
    scan_limit: uint,
    match_limit: uint,
    examined: uint,
    decoded: uint,
    next_canonical_offset: uint.nullable(),
    stop_reason: z.enum(["end", "scan_limit", "match_limit", "decoded_budget"]),
  }),
  budgets: z.strictObject({
    max_resource_bytes: uint,
    max_total_decoded_bytes: uint,
    observed_decoded_bytes: uint,
    charged_decoded_bytes: uint,
  }),
  matches: z
    .array(
      z.strictObject({
        entry: resource,
        identities: z
          .array(
            z.strictObject({
              resource_id: z.number().int().min(0).max(65535),
              table_location: range,
            }),
          )
          .max(65536),
        codec: z.enum(["none", "gzip", "chromium-brotli"]),
        decoded_bytes: uint,
        decoded_sha256: digest,
        byte_range: range,
        text: z
          .strictObject({
            encoding: z.enum(["utf8", "utf16le"]),
            utf16_offset: uint,
            utf16_length: uint,
            preview: z.string().max(512),
          })
          .nullable(),
      }),
    )
    .max(1024),
  skipped: z
    .array(
      z.strictObject({
        entry: resource,
        reason: z.enum(["resource_budget", "decode_failed"]),
        message: z.string(),
      }),
    )
    .max(1024),
  coverage: z.strictObject({
    index: z.literal("complete"),
    window: z.enum(["complete", "partial"]),
    pack: z.enum(["complete", "partial"]),
  }),
  limitations: z.array(z.string()),
});
export type SearchChromiumResourcesInput = z.output<
  typeof searchChromiumResourcesInputSchema
>;
export type ChromiumResourceSearch = z.output<
  typeof chromiumResourceSearchSchema
>;
