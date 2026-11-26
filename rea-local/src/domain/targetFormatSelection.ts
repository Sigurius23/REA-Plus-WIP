import { z } from "zod";
/** Caller-selected interpretation; omission preserves byte-based target detection. */
export const targetFormatHintSchema = z.enum(["dos-com", "esp-flash-image"]);
export type TargetFormatHint = z.infer<typeof targetFormatHintSchema>;
export const espFlashAddressSchema = z
  .string()
  .regex(
    /^0x[0-9a-fA-F]{1,8}$/u,
    "Expected a 32-bit 0x-prefixed hexadecimal flash address",
  );
export const espFlashSelectionInputSchema = z.strictObject({
  flash_offset: espFlashAddressSchema
    .exactOptional()
    .describe(
      "Flash address of the dump first byte. Only with format=esp-flash-image. Omission assumes zero; explicit zero stays a caller declaration. Original text is preserved.",
    ),
  partition_table_offset: espFlashAddressSchema
    .regex(
      /^0x(?:0{1,8}|[0-9a-fA-F]{1,5}000)$/u,
      "partition_table_offset must be a multiple of 0x1000",
    )
    .exactOptional()
    .describe(
      "Flash address of the partition table, aligned to 0x1000. Only with format=esp-flash-image; disables scanning. Original text is preserved.",
    ),
});
export type EspFlashSelectionInput = z.infer<
  typeof espFlashSelectionInputSchema
>;
export const resolveEspFlashSelection = (
  input: EspFlashSelectionInput = {},
) => ({
  ...(input.flash_offset === undefined
    ? {}
    : { flashOffset: Number.parseInt(input.flash_offset.slice(2), 16) }),
  ...(input.partition_table_offset === undefined
    ? {}
    : {
        partitionTableOffset: Number.parseInt(
          input.partition_table_offset.slice(2),
          16,
        ),
      }),
});
