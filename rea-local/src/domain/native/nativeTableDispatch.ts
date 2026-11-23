import { z } from "zod";

const address = z.string().regex(/^0x[0-9a-fA-F]{1,16}$/);
const uint = z.number().int().min(0).max(Number.MAX_SAFE_INTEGER);
const index = z.number().int().min(0).max(65535);
const instruction = z.strictObject({
  address,
  file_offset: uint,
  bytes_hex: z.string().regex(/^[0-9a-f]{8}$/),
  operation: z.string(),
});

/** Explicit index observations, independent of an inferred enum or function body. */
export const inspectNativeTableDispatchInputSchema = z.strictObject({
  path: z.string().min(1).describe("Absolute original Mach-O artifact path"),
  entry_address: address.describe(
    "Preferred arm64 virtual address of the straight-line dispatch prefix",
  ),
  indices: z
    .array(index)
    .min(1)
    .max(65536)
    .describe(
      "Explicit selected indices; not a claimed exhaustive input domain",
    ),
  call_address: address
    .optional()
    .describe(
      "Optional call instruction to check against this entry; indirect callees remain unresolved",
    ),
  max_file_bytes: z.number().int().min(32).max(536870912).default(67108864),
  max_instructions: z
    .number()
    .int()
    .min(1)
    .max(65536)
    .default(128)
    .describe("Prefix instruction budget, at most 256 KiB of source code"),
});

/** Byte-derived targets do not install CFG edges or establish a Swift type domain. */
export const nativeTableDispatchSchema = z.strictObject({
  artifact: z.strictObject({
    path: z.string(),
    sha256: z.string().regex(/^[0-9a-f]{64}$/),
    bytes: uint,
  }),
  architecture: z.literal("arm64"),
  entry_address: address,
  requested_indices: z.array(index).min(1).max(65536),
  observation_id: z.string().regex(/^[0-9a-f]{64}$/),
  prefix: z.strictObject({
    instructions: z.array(instruction).max(65536),
    stop: z.strictObject({
      kind: z.enum([
        "table-branch",
        "unsupported-instruction",
        "unmapped-code",
        "instruction-budget",
      ]),
      address,
      detail: z.string(),
    }),
  }),
  table: z
    .strictObject({
      address,
      target_anchor: address,
      input_register: z.string().regex(/^x(?:[0-9]|[12][0-9]|30)$/),
      index_mask: z.literal(65535),
      entry_bytes: z.literal(2),
      index_scale: z.literal(2),
      target_scale: z.literal(4),
      entry_signed: z.literal(false),
    })
    .nullable(),
  entries: z
    .array(
      z.strictObject({
        index,
        status: z.enum([
          "mapped-target",
          "unmapped-entry",
          "non-executable-target",
          "address-overflow",
        ]),
        entry_file_offset: uint.nullable(),
        entry_bytes_hex: z
          .string()
          .regex(/^[0-9a-f]{4}$/)
          .nullable(),
        entry_value: index.nullable(),
        target_address: address.nullable(),
      }),
    )
    .max(65536),
  invocation: z
    .strictObject({
      call_address: address,
      call_instruction: instruction.nullable(),
      link: z.enum([
        "direct-to-entry",
        "different-direct-target",
        "indirect-unresolved",
        "not-call",
        "unmapped-call",
      ]),
      direct_target: address.nullable(),
      preparation: z.array(instruction).max(2),
      input_literal: address.nullable(),
      effective_index: index.nullable(),
      known_bypass: instruction.nullable(),
      branch_scan: z
        .strictObject({
          scope: z.literal("immutable-__text-only"),
          instructions_examined: uint,
          completed: z.boolean(),
        })
        .nullable(),
      mapping_status: z.enum(["conditional", "unresolved"]),
      mapping_index: index.nullable(),
    })
    .nullable(),
  typed_domain: z.null(),
  all_entry_domain_proved: z.literal(false),
  program_mutations: z.literal(false),
  assumptions: z.array(z.string()),
  limitations: z.array(z.string()),
});

export type InspectNativeTableDispatchInput = z.infer<
  typeof inspectNativeTableDispatchInputSchema
>;
export type NativeTableDispatch = z.infer<typeof nativeTableDispatchSchema>;
export type DispatchInstruction =
  NativeTableDispatch["prefix"]["instructions"][number];
