import { z } from "zod";

const uint = z.number().int().min(0).max(0xffffffff);
const id = z.number().int().min(0).max(65535);
const digest = z.string().regex(/^[a-f0-9]{64}$/u);
const range = z.strictObject({ offset: uint, bytes: uint });

/** Bounded offline DataPack index and optional selected resource contents. */
export const inspectChromiumResourcesInputSchema = z.strictObject({
  path: z
    .string()
    .min(1)
    .describe("Absolute path to an unwrapped Chromium DataPack v4/v5"),
  offset: uint
    .default(0)
    .describe("Resource identities to skip in ascending numeric ID order"),
  limit: z.number().int().min(1).max(1024).default(64),
  resource_id: id
    .optional()
    .describe("Exact resource ID or alias whose complete bytes to read"),
  decode: z
    .boolean()
    .default(true)
    .describe(
      "Decode recognized gzip/Chromium Brotli for the selected resource only; false returns stored bytes",
    ),
  max_file_bytes: z.number().int().min(15).max(536870912).default(67108864),
  max_resource_bytes: z
    .number()
    .int()
    .min(1)
    .max(8388608)
    .default(1048576)
    .describe(
      "Maximum stored and decoded selected resource bytes; checked before bounded decompression",
    ),
});

const entry = z.strictObject({
  resource_id: id,
  canonical_resource_id: id,
  alias: z.boolean(),
  canonical_index: uint,
  table_location: range,
  payload: range.extend({ sha256: digest }),
  compression: z.strictObject({
    kind: z.enum([
      "none",
      "gzip-candidate",
      "chromium-brotli-envelope",
      "truncated-brotli-envelope",
    ]),
    declared_decoded_bytes: z
      .number()
      .int()
      .min(0)
      .max(281474976710655)
      .nullable(),
    gzip_last_member_isize: uint.nullable(),
  }),
});

/** Original numeric identities and ranges; filenames and runtime use remain unknown. */
export const chromiumResourcesSchema = z.strictObject({
  artifact: z.strictObject({
    path: z.string().min(1),
    bytes: uint,
    sha256: digest,
  }),
  format: z.literal("chromium-datapack"),
  version: z.union([z.literal(4), z.literal(5)]),
  encoding: z.enum(["binary", "utf8", "utf16le"]),
  canonical_resources: z.number().int().min(0).max(65536),
  alias_resources: id,
  layout: z.strictObject({
    header_bytes: uint,
    padding_hex: z.string(),
    metadata_end: uint,
    sentinel_id: id,
    sentinel_offset: uint,
    unclaimed_ranges: z.array(range),
  }),
  page: z.strictObject({
    offset: uint,
    limit: uint,
    returned: uint,
    total: uint,
    next_offset: uint.nullable(),
  }),
  entries: z.array(entry).max(1024),
  resource: z
    .strictObject({
      entry,
      representation: z.enum(["stored", "decoded"]),
      codec: z.enum(["none", "gzip", "chromium-brotli"]),
      bytes: uint,
      sha256: digest,
      bytes_hex: z
        .string()
        .max(16777216)
        .regex(/^[0-9a-f]*$/u)
        .refine((value) => value.length % 2 === 0),
      text_preview: z.string().max(4096).nullable(),
      text_preview_truncated: z.boolean(),
    })
    .nullable(),
  coverage: z.strictObject({
    index: z.literal("complete"),
    selected_resource: z.enum(["not_requested", "complete"]),
  }),
  limitations: z.array(z.string()),
});

export type InspectChromiumResourcesInput = z.output<
  typeof inspectChromiumResourcesInputSchema
>;
export type ChromiumResources = z.output<typeof chromiumResourcesSchema>;
export type ChromiumResourceEntry = ChromiumResources["entries"][number];
