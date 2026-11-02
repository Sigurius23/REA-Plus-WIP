import { constants as bufferConstants } from "node:buffer";

/** Owned DataPack bytes, assembled independently of the production parser. */
export const chromiumDataPackFixture = (
  options: {
    version?: 4 | 5;
    encoding?: 0 | 1 | 2;
    resources?: readonly { id: number; bytes: Buffer }[];
    aliases?: readonly { id: number; targetId: number }[];
    padding?: readonly number[];
    trailing?: Buffer;
  } = {},
): Buffer => {
  const version = options.version ?? 5;
  const encoding = options.encoding ?? 1;
  if (version !== 4 && version !== 5)
    throw new RangeError("DataPack fixture version must be 4 or 5");
  unsignedInteger(encoding, 2, "encoding");

  const resources = [
    ...(options.resources ?? [
      { id: 4, bytes: Buffer.from("this is id 4") },
      { id: 6, bytes: Buffer.from("this is id 6") },
    ]),
  ].sort((left, right) => left.id - right.id);
  const aliases = [
    ...(options.aliases ??
      (version === 5 && options.resources === undefined
        ? [{ id: 10, targetId: 4 }]
        : [])),
  ].sort((left, right) => left.id - right.id);
  unsignedInteger(
    resources.length,
    version === 5 ? 0xffff : 0xffffffff,
    "resource count",
  );
  unsignedInteger(aliases.length, 0xffff, "alias count");
  if (version === 4 && aliases.length !== 0)
    throw new RangeError("DataPack v4 fixtures cannot contain aliases");

  const padding = fixturePadding(version, options.padding);

  const indices = new Map<number, number>();
  const ids = new Set<number>();
  resources.forEach(({ id, bytes }, index) => {
    unsignedInteger(id, 0xffff, "resource ID");
    if (ids.has(id))
      throw new RangeError(`Duplicate DataPack resource ID ${id}`);
    if (!Buffer.isBuffer(bytes))
      throw new TypeError(`DataPack resource ${id} bytes must be a Buffer`);
    ids.add(id);
    indices.set(id, index);
  });
  const aliasEntries = aliases.map(({ id, targetId }) => {
    unsignedInteger(id, 0xffff, "alias ID");
    unsignedInteger(targetId, 0xffff, "alias target ID");
    if (ids.has(id))
      throw new RangeError(`Duplicate DataPack resource ID ${id}`);
    const index = indices.get(targetId);
    if (index === undefined)
      throw new RangeError(
        `DataPack alias ${id} targets missing canonical ID ${targetId}`,
      );
    ids.add(id);
    return { id, targetIndex: index };
  });

  const trailing = options.trailing ?? Buffer.alloc(0);
  if (!Buffer.isBuffer(trailing))
    throw new TypeError("DataPack fixture trailing bytes must be a Buffer");
  const headerSize = version === 4 ? 9 : 12;
  const dataStart =
    headerSize + (resources.length + 1) * 6 + aliases.length * 4;
  let dataEnd = dataStart;
  for (const { bytes } of resources) {
    dataEnd += bytes.length;
    unsignedInteger(dataEnd, 0xffffffff, "resource end offset");
  }
  const length = dataEnd + trailing.length;
  unsignedInteger(length, bufferConstants.MAX_LENGTH, "fixture length");
  const output = Buffer.alloc(length);
  output.writeUInt32LE(version, 0);
  if (version === 4) {
    output.writeUInt32LE(resources.length, 4);
    output.writeUInt8(encoding, 8);
  } else {
    output.writeUInt8(encoding, 4);
    padding.forEach((byte, index) => output.writeUInt8(byte, 5 + index));
    output.writeUInt16LE(resources.length, 8);
    output.writeUInt16LE(aliases.length, 10);
  }

  let dataOffset = dataStart;
  resources.forEach(({ id, bytes }, index) => {
    const entryOffset = headerSize + index * 6;
    output.writeUInt16LE(id, entryOffset);
    output.writeUInt32LE(dataOffset, entryOffset + 2);
    bytes.copy(output, dataOffset);
    dataOffset += bytes.length;
  });
  const sentinelOffset = headerSize + resources.length * 6;
  output.writeUInt16LE(0, sentinelOffset);
  output.writeUInt32LE(dataEnd, sentinelOffset + 2);
  aliasEntries.forEach(({ id, targetIndex }, index) => {
    const aliasOffset = sentinelOffset + 6 + index * 4;
    output.writeUInt16LE(id, aliasOffset);
    output.writeUInt16LE(targetIndex, aliasOffset + 2);
  });
  trailing.copy(output, dataEnd);
  return output;
};

const fixturePadding = (
  version: 4 | 5,
  padding: readonly number[] | undefined,
): readonly number[] => {
  const count = version === 5 ? 3 : 0;
  const bytes = padding ?? Array<number>(count).fill(0);
  if (bytes.length !== count)
    throw new RangeError(
      "DataPack fixture padding must be three bytes for v5 or empty for v4",
    );
  for (const byte of bytes) unsignedInteger(byte, 0xff, "padding byte");
  return bytes;
};

const unsignedInteger = (
  value: number,
  maximum: number,
  name: string,
): void => {
  if (!Number.isSafeInteger(value) || value < 0 || value > maximum)
    throw new RangeError(
      `DataPack fixture ${name} must be an integer in 0..${maximum}`,
    );
};
