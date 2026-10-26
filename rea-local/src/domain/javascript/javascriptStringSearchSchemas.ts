import { z } from "zod";

import { artifactIntegrityPolicySchema } from "../artifactIntegrityPolicy.js";
import { localPathStringSchema } from "../localPath.js";
import { digestSchema } from "../digests.js";

/**
 * Caller intent for a static JavaScript string search: case-sensitive,
 * substring-based, and never executing the target.
 */
export const searchJavaScriptStringsInputSchema = z.strictObject({
  input_path: localPathStringSchema.describe(
    "Extracted application directory or .asar path; the target is never executed",
  ),
  query: z
    .string()
    .min(1)
    .describe(
      "Case-sensitive substring to find in JavaScript string constants or identifiers",
    ),
  scope: z
    .enum(["strings", "identifiers"])
    .optional()
    .describe(
      "Search string constants — string literals, directive literals and static template quasis (default) — or runtime identifier names",
    ),
  file_limit: z
    .number()
    .int()
    .positive()
    .max(8192)
    .optional()
    .describe(
      "Maximum JavaScript files to scan in application path order (default 256, cap 8192); raise to cover a whole small application",
    ),
  match_limit: z
    .number()
    .int()
    .positive()
    .max(8192)
    .optional()
    .describe(
      "Maximum returned matches in scan order (default 1024, cap 8192); further matches are counted and reported as omitted",
    ),
  integrity_policy: artifactIntegrityPolicySchema,
});

const matchSchema = z.strictObject({
  path: z.string().min(1).describe("Application-relative file path"),
  sha256: digestSchema.describe("Content digest of the containing file"),
  offset: z
    .number()
    .int()
    .nonnegative()
    .nullable()
    .describe(
      "Byte offset of the match start in the file text, or null when the parser reported no location",
    ),
  value: z.string().describe("Exact matched string value or identifier name"),
  kind: z
    .enum(["string", "template-part", "directive", "identifier"])
    .describe("Syntax surface that produced the match"),
});

/** Static scan result; locations key files by artifact digest and offset. */
export const searchJavaScriptStringsResultSchema = z.strictObject({
  query: z.string(),
  scope: z.enum(["strings", "identifiers"]),
  total_files: z
    .number()
    .int()
    .nonnegative()
    .describe("Inventoried, text-included JavaScript source files"),
  scanned_files: z
    .number()
    .int()
    .nonnegative()
    .describe("JavaScript files whose parsed syntax was searched"),
  parse_failures: z
    .number()
    .int()
    .nonnegative()
    .describe(
      "Selected JavaScript files whose text could not be parsed; their constants are not searched",
    ),
  skipped_files: z
    .number()
    .int()
    .nonnegative()
    .describe("JavaScript files not reached because of the file limit"),
  incomplete_text_files: z
    .number()
    .int()
    .nonnegative()
    .describe("JavaScript files whose bytes were not valid UTF-8 text"),
  matches: z.array(matchSchema),
  omitted_matches: z
    .number()
    .int()
    .nonnegative()
    .describe("Further matches beyond the match limit, in scan order"),
  coverage: z
    .enum(["complete", "partial"])
    .describe(
      "partial when parse failures, text gaps, or the file or match limit stopped the search; even a complete empty result does not prove absence, because only inventoried, UTF-8 JavaScript files with parseable syntax are searched",
    ),
});

/** Validated `search_javascript_strings` result payload. */
export type SearchJavaScriptStringsResult = z.infer<
  typeof searchJavaScriptStringsResultSchema
>;
