import { crc32 } from "node:zlib";

export interface UImageFixture {
  readonly payload?: Uint8Array;
  readonly name?: string | Uint8Array;
  readonly timestamp?: number;
  readonly loadAddress?: number;
  readonly entryPoint?: number;
  readonly os?: number;
  readonly arch?: number;
  readonly type?: number;
  readonly compression?: number;
  readonly declaredPayloadSize?: number;
  readonly declaredHeaderCrc32?: number;
  readonly declaredDataCrc32?: number;
  readonly trailing?: Uint8Array;
}
/** Deterministic inert carrier from the U-Boot legacy header layout. */
export const uimageFile = (fields: UImageFixture = {}): Uint8Array => {
  const payload = fields.payload ?? Buffer.from("stored-kernel");
  const header = Buffer.alloc(64);
  header.writeUInt32BE(0x27051956, 0);
  header.writeUInt32BE(fields.timestamp ?? 1700000000, 8);
  header.writeUInt32BE(fields.declaredPayloadSize ?? payload.length, 12);
  header.writeUInt32BE(fields.loadAddress ?? 0x8000, 16);
  header.writeUInt32BE(fields.entryPoint ?? 0x8004, 20);
  header.writeUInt32BE(fields.declaredDataCrc32 ?? crc32(payload), 24);
  header[28] = fields.os ?? 5;
  header[29] = fields.arch ?? 2;
  header[30] = fields.type ?? 2;
  header[31] = fields.compression ?? 0;
  const name =
    typeof fields.name === "string"
      ? Buffer.from(fields.name)
      : (fields.name ?? Buffer.from("test-kernel"));
  header.set(name.subarray(0, 32), 32);
  header.writeUInt32BE(fields.declaredHeaderCrc32 ?? crc32(header), 4);
  return Buffer.concat([header, payload, fields.trailing ?? new Uint8Array()]);
};
/** Size table, then nonfinal four-byte-aligned stored components. */
export const uimageMultiPayload = (
  parts: readonly Uint8Array[],
): Uint8Array => {
  const table = Buffer.alloc((parts.length + 1) * 4);
  for (const [index, part] of parts.entries())
    table.writeUInt32BE(part.length, index * 4);
  return Buffer.concat([
    table,
    ...parts.flatMap((part, index) => [
      part,
      Buffer.alloc(index + 1 < parts.length ? (4 - (part.length % 4)) % 4 : 0),
    ]),
  ]);
};
