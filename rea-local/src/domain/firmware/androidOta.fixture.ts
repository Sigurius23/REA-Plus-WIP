import { createHash } from "node:crypto";
/** Independent source fixture wire encoder; no production decoder is used to construct inputs. */
export const otaVarint = (value: number | bigint): Uint8Array => {
  let n = BigInt.asUintN(64, BigInt(value));
  const bytes: number[] = [];
  do {
    const b = Number(n & 127n);
    n >>= 7n;
    bytes.push(b | (n === 0n ? 0 : 128));
  } while (n !== 0n);
  return Uint8Array.from(bytes);
};
export const otaMessage = (...parts: readonly Uint8Array[]): Uint8Array =>
  Buffer.concat(parts);
export const otaField = (
  field: number,
  value: number | bigint | Uint8Array | string,
): Uint8Array => {
  const wire = typeof value === "number" || typeof value === "bigint" ? 0 : 2;
  const bytes = typeof value === "string" ? Buffer.from(value) : value;
  return wire === 0
    ? otaMessage(otaVarint(field * 8), otaVarint(value as number | bigint))
    : otaMessage(
        otaVarint(field * 8 + 2),
        otaVarint((bytes as Uint8Array).length),
        bytes as Uint8Array,
      );
};
export const otaExtent = (
  start: bigint | number,
  blocks: bigint | number,
): Uint8Array => otaMessage(otaField(1, start), otaField(2, blocks));
export function androidOtaPayload(
  options: {
    manifest?: Uint8Array;
    blob?: Uint8Array;
    metadataSignatures?: Uint8Array;
    version?: bigint;
  } = {},
): Uint8Array {
  const manifest =
    options.manifest ??
    otaField(
      13,
      otaMessage(
        otaField(1, "system"),
        otaField(
          8,
          otaMessage(
            otaField(1, 0),
            otaField(2, 0),
            otaField(3, 4),
            otaField(6, otaExtent(0, 1)),
            otaField(8, createHash("sha256").update("DATA").digest()),
          ),
        ),
      ),
    );
  const signature = options.metadataSignatures ?? new Uint8Array();
  const header = Buffer.alloc(24);
  header.write("CrAU");
  header.writeBigUInt64BE(options.version ?? 2n, 4);
  header.writeBigUInt64BE(BigInt(manifest.length), 12);
  header.writeUInt32BE(signature.length, 20);
  return otaMessage(
    header,
    manifest,
    signature,
    options.blob ?? Buffer.from("DATA"),
  );
}
