const hexByte = (value: number): string =>
  value.toString(16).padStart(2, "0").toUpperCase();
const checksum = (bytes: readonly number[], complement: 0 | 1) => {
  const sum = bytes.reduce((a, b) => a + b, 0);
  return (complement === 0 ? -sum : ~sum) & 255;
};

/** Source-owned records independent of the decoding implementation. */
export const intelHexRecord = (
  type: number,
  address: number,
  data: readonly number[] = [],
): string => {
  const fields = [
    data.length,
    (address >>> 8) & 255,
    address & 255,
    type,
    ...data,
  ];
  return `:${[...fields, checksum(fields, 0)].map(hexByte).join("")}`;
};
export const srecRecord = (
  type: number,
  address: number,
  data: readonly number[] = [],
): string => {
  const width =
    type === 2 || type === 6 || type === 8
      ? 3
      : type === 3 || type === 7
        ? 4
        : 2;
  const addr = Array.from(
    { length: width },
    (_, i) => Math.floor(address / 256 ** (width - i - 1)) & 255,
  );
  const fields = [width + data.length + 1, ...addr, ...data];
  return `S${type.toString()}${[...fields, checksum(fields, 1)].map(hexByte).join("")}`;
};
export const recordLines = (...records: string[]) => records.join("\n") + "\n";

/** Known checksum-bearing vectors, independent of the record builders above. */
export const INTEL_SPARSE_IMAGE = recordLines(
  ":020000040800F2",
  ":10000000000102030405060708090A0B0C0D0E0F78",
  ":10001000101112131415161718191A1B1C1D1E1F68",
  ":04010000DEADBEEFC3",
  ":0400000508000101ED",
  ":00000001FF",
);
export const SREC_HEADER_IMAGE = recordLines(
  "S00600004844521B",
  "S1130000000102030405060708090A0B0C0D0E0F74",
  "S1130010101112131415161718191A1B1C1D1E1F64",
  "S5030002FA",
  "S9030000FC",
);
