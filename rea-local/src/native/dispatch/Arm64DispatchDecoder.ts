/** Restricted symbolic decoder for a straight-line unsigned-halfword dispatch prefix. */
export type DispatchValue =
  | { kind: "input"; register: number }
  | { kind: "constant"; value: bigint }
  | { kind: "index"; register: number }
  | { kind: "halfword"; register: number; table: bigint }
  | { kind: "target"; register: number; table: bigint; anchor: bigint }
  | { kind: "unknown" };

export const matches = (word: number, mask: number, value: number): boolean =>
  (word & mask) >>> 0 === value;
export const signed = (value: number, bits: number): bigint =>
  BigInt(value >= 2 ** (bits - 1) ? value - 2 ** bits : value);

/** Decode ARM's logical immediate, rejecting reserved encodings. */
const logicalImmediate = (word: number): bigint | null => {
  const width = word >>> 31 ? 64 : 32;
  const n = (word >>> 22) & 1;
  const immr = (word >>> 16) & 63;
  const imms = (word >>> 10) & 63;
  const len = 31 - Math.clz32((n << 6) | (~imms & 63));
  if (len < 1 || (width === 32 && (n !== 0 || len > 5))) return null;
  const size = 2 ** len,
    levels = size - 1;
  const s = imms & levels,
    r = immr & levels;
  if (s === levels) return null;
  const mask = (1n << BigInt(size)) - 1n;
  const ones = (1n << BigInt(s + 1)) - 1n;
  const rotated = ((ones >> BigInt(r)) | (ones << BigInt(size - r))) & mask;
  let result = 0n;
  for (let shift = 0; shift < width; shift += size)
    result |= rotated << BigInt(shift);
  return result;
};

/** Unknown instructions stop analysis, including writes to unrelated registers. */
export const decodeDispatchInstruction = (
  word: number,
  pc: bigint,
  registers: DispatchValue[],
): {
  operation: string;
  branch?: Extract<DispatchValue, { kind: "target" }>;
} | null => {
  const rd = word & 31,
    rn = (word >>> 5) & 31,
    rm = (word >>> 16) & 31;
  const read = (r: number): DispatchValue =>
    r === 31
      ? { kind: "constant", value: 0n }
      : (registers[r] ?? { kind: "unknown" });
  const write = (v: DispatchValue) => {
    if (rd !== 31) registers[rd] = v;
  };
  if (matches(word, 0xfffffc1f, 0xd61f0000)) {
    const value = read(rn);
    return value.kind === "target"
      ? { operation: "BR computed table target", branch: value }
      : null;
  }
  if (word === 0xd503201f) return { operation: "NOP" };
  if (
    matches(word, 0xffe0ffe0, 0xaa0003e0) ||
    matches(word, 0xffe0ffe0, 0x2a0003e0)
  ) {
    const value = read(rm);
    if (!(word >>> 31) && value.kind === "target") return null;
    write(
      value.kind === "constant" && !(word >>> 31)
        ? { kind: "constant", value: BigInt.asUintN(32, value.value) }
        : value,
    );
    return { operation: "MOV register" };
  }
  const movz = matches(word, 0x7f800000, 0x52800000);
  const movk = matches(word, 0x7f800000, 0x72800000);
  if (movz || movk) {
    const width = word >>> 31 ? 64 : 32,
      shift = ((word >>> 21) & 3) * 16;
    if (shift >= width) return null;
    const immediate = BigInt((word >>> 5) & 65535) << BigInt(shift);
    const previous = read(rd);
    write(
      movz
        ? { kind: "constant", value: immediate }
        : previous.kind === "constant"
          ? {
              kind: "constant",
              value: BigInt.asUintN(
                width,
                (previous.value & ~(65535n << BigInt(shift))) | immediate,
              ),
            }
          : { kind: "unknown" },
    );
    return { operation: movz ? "MOVZ constant" : "MOVK constant" };
  }
  if (
    matches(word, 0x9f000000, 0x90000000) ||
    matches(word, 0x9f000000, 0x10000000)
  ) {
    const page = word >>> 31;
    const immediate = signed(
      (((word >>> 5) & 0x7ffff) << 2) | ((word >>> 29) & 3),
      21,
    );
    write({
      kind: "constant",
      value: BigInt.asUintN(
        64,
        page ? (pc & ~4095n) + immediate * 4096n : pc + immediate,
      ),
    });
    return { operation: page ? "ADRP address" : "ADR address" };
  }
  if (matches(word, 0xff800000, 0x91000000) && rn !== 31 && rd !== 31) {
    const value = read(rn);
    write(
      value.kind === "constant"
        ? {
            kind: "constant",
            value: BigInt.asUintN(
              64,
              value.value +
                BigInt((word >>> 10) & 4095) * (word & 0x400000 ? 4096n : 1n),
            ),
          }
        : { kind: "unknown" },
    );
    return { operation: "ADD immediate" };
  }
  if (
    matches(word, 0x7f800000, 0x12000000) &&
    logicalImmediate(word) === 65535n
  ) {
    const value = read(rn);
    write(
      value.kind === "input" || value.kind === "index"
        ? { kind: "index", register: value.register }
        : value.kind === "constant"
          ? { kind: "constant", value: value.value & 65535n }
          : { kind: "unknown" },
    );
    return { operation: "AND index mask 0xffff" };
  }
  if (matches(word, 0xffe0fc00, 0x78607800)) {
    const base = read(rn),
      at = read(rm);
    write(
      base.kind === "constant" && at.kind === "index" && rn !== 31
        ? { kind: "halfword", register: at.register, table: base.value }
        : { kind: "unknown" },
    );
    return { operation: "LDRH indexed unsigned halfword" };
  }
  if (matches(word, 0xffe0fc00, 0x8b000800)) {
    const base = read(rn),
      delta = read(rm);
    write(
      base.kind === "constant" && delta.kind === "halfword"
        ? {
            kind: "target",
            register: delta.register,
            table: delta.table,
            anchor: base.value,
          }
        : { kind: "unknown" },
    );
    return { operation: "ADD table value LSL #2" };
  }
  return null;
};

/** A BL writes X30; its direct callee is derived from the signed immediate. */
export const directCallTarget = (word: number, pc: bigint): bigint | null =>
  matches(word, 0xfc000000, 0x94000000)
    ? BigInt.asUintN(64, pc + signed(word & 0x3ffffff, 26) * 4n)
    : null;

/** Direct branches considered by the suffix bypass check; indirect entry remains unknown. */
export const directBranchTarget = (word: number, pc: bigint): bigint | null => {
  if (matches(word, 0x7c000000, 0x14000000))
    return BigInt.asUintN(64, pc + signed(word & 0x3ffffff, 26) * 4n);
  if (
    matches(word, 0xff000010, 0x54000000) ||
    matches(word, 0x7e000000, 0x34000000)
  )
    return BigInt.asUintN(64, pc + signed((word >>> 5) & 0x7ffff, 19) * 4n);
  if (matches(word, 0x7e000000, 0x36000000))
    return BigInt.asUintN(64, pc + signed((word >>> 5) & 0x3fff, 14) * 4n);
  return null;
};
