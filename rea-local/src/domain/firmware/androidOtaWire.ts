/** Minimal protobuf wire framing. Unknown groups are skipped iteratively, without recursive stack growth. */
export interface OtaWireField {
  readonly field: number;
  readonly wire: number;
  readonly raw: Uint8Array;
  readonly bytes: Uint8Array;
  readonly integer: bigint | null;
}
export class OtaWireMalformed extends Error {}
export function* otaWireFields(
  bytes: Uint8Array,
  admit: () => void,
): Generator<OtaWireField> {
  let at = 0;
  const integer = (): bigint => {
    let value = 0n;
    for (let shift = 0; shift < 70; shift += 7) {
      const b = bytes[at++];
      if (b === undefined)
        throw new OtaWireMalformed("truncated protobuf varint");
      if (shift === 63 && b > 1)
        throw new OtaWireMalformed("protobuf varint exceeds uint64");
      value |= BigInt(b & 127) << BigInt(shift);
      if (b < 128) return value;
    }
    throw new OtaWireMalformed("unterminated protobuf varint");
  };
  const tag = (): { field: number; wire: number } => {
    const v = integer();
    if (v > 0xffff_ffffn || v >> 3n === 0n)
      throw new OtaWireMalformed("invalid protobuf field tag");
    return { field: Number(v >> 3n), wire: Number(v & 7n) };
  };
  const value = (wire: number): { data: Uint8Array; n: bigint | null } => {
    const start = at;
    if (wire === 0) {
      const n = integer();
      return { data: bytes.subarray(start, at), n };
    }
    if (wire === 1 || wire === 5) {
      at += wire === 1 ? 8 : 4;
      if (at > bytes.length)
        throw new OtaWireMalformed("truncated fixed-width protobuf field");
      return { data: bytes.subarray(start, at), n: null };
    }
    if (wire === 2) {
      const length = integer();
      if (length > BigInt(bytes.length - at))
        throw new OtaWireMalformed("truncated length-delimited protobuf field");
      const begin = at;
      at += Number(length);
      return { data: bytes.subarray(begin, at), n: null };
    }
    throw new OtaWireMalformed("invalid protobuf wire type");
  };
  while (at < bytes.length) {
    admit();
    const start = at,
      t = tag();
    let payload: Uint8Array, n: bigint | null;
    if (t.wire === 3) {
      const groupStart = at,
        stack = [t.field];
      while (stack.length > 0) {
        admit();
        const nested = tag();
        if (nested.wire === 3) stack.push(nested.field);
        else if (nested.wire === 4) {
          if (stack.pop() !== nested.field)
            throw new OtaWireMalformed("mismatched protobuf end group");
        } else value(nested.wire);
      }
      payload = bytes.subarray(groupStart, at);
      n = null;
    } else {
      const v = value(t.wire);
      payload = v.data;
      n = v.n;
    }
    yield { ...t, raw: bytes.subarray(start, at), bytes: payload, integer: n };
  }
}

export function otaMalformed(message: string): never {
  throw new OtaWireMalformed(message);
}
export const otaUint32 = (field: OtaWireField): number => {
  if (field.integer === null || field.integer > 0xffff_ffffn)
    return otaMalformed("protobuf uint32 is out of range");
  return Number(field.integer);
};
export const otaDecimal = (f: OtaWireField): string =>
  f.integer?.toString() ?? otaMalformed("protobuf uint64 is absent");
export const otaSigned = (f: OtaWireField): string =>
  f.integer === null
    ? otaMalformed("protobuf int64 is absent")
    : BigInt.asIntN(64, f.integer).toString();
export const otaBoolean = (f: OtaWireField): boolean => f.integer !== 0n;
