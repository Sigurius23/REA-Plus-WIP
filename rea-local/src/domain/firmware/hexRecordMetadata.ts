import { z } from "zod";

const offset = z.number().int().nonnegative();
const uint32 = offset.max(0xffff_ffff);

/** Whole-carrier record facts. Declared starts are not proved execution entries. */
export const hexRecordsMetadataSchema = z.strictObject({
  kind: z.literal("hex-records"),
  encoding: z.enum(["intel-hex", "srec"]),
  variant: z
    .enum(["I8HEX", "I16HEX", "I32HEX", "S19", "S28", "S37", "mixed"])
    .nullable(),
  line_count: offset,
  record_count: offset,
  data_record_count: offset,
  data_bytes: offset,
  duplicate_bytes: offset,
  region_count: offset,
  lowest_address: uint32.nullable(),
  highest_address: uint32.nullable(),
  termination: z.enum(["present", "absent"]),
  start_address: uint32.nullable(),
  start_address_record: z.enum(["05", "S7", "S8", "S9"]).nullable(),
  start_segment_cs: offset.max(0xffff).nullable(),
  start_segment_ip: offset.max(0xffff).nullable(),
  header_address: offset
    .max(0xffff)
    .nullable()
    .describe(
      "Observed S0 header address field, normally zero; this is not a data-region load address.",
    ),
  header_line: offset.positive().nullable(),
  header_hex: z
    .string()
    .regex(/^(?:[0-9a-f]{2}){0,252}$/u)
    .nullable(),
  header_text: z.string().nullable(),
  declared_data_record_count: uint32
    .nullable()
    .describe(
      "Last observed S5/S6 count of cumulative preceding data records at its own line; not a certification of the final file total.",
    ),
  declared_data_record_count_line: offset.positive().nullable(),
});
export type HexRecordsMetadata = z.infer<typeof hexRecordsMetadataSchema>;

/** An address-contiguous decoded range, not a contiguous carrier-file interval. */
export const hexRecordRegionMetadataSchema = z
  .strictObject({
    kind: z.literal("hex-record-region"),
    start_address: uint32,
    end_address: uint32.describe("Inclusive last decoded address."),
    length: offset.positive(),
    record_count: offset.positive(),
    first_line: offset.positive(),
    last_line: offset.positive(),
  })
  .superRefine((value, context) => {
    if (value.end_address !== value.start_address + value.length - 1)
      context.addIssue({
        code: "custom",
        path: ["end_address"],
        message: "Region length must match inclusive address bounds",
      });
    if (value.last_line < value.first_line)
      context.addIssue({
        code: "custom",
        path: ["last_line"],
        message: "Last contributing line precedes the first",
      });
  });
export const hexRecordFormatMetadataSchema = z.discriminatedUnion("kind", [
  hexRecordsMetadataSchema,
  hexRecordRegionMetadataSchema,
]);
export type HexRecordFormatMetadata = z.infer<
  typeof hexRecordFormatMetadataSchema
>;
