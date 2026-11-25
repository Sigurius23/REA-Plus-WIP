/** FDT's declared structure, rather than a prefix window, owns FIT recognition. */
const FDT_MAGIC = 0xd00dfeed;
const WINDOW_BYTES = 64 * 1024;
const align4 = (value: number): number => Math.ceil(value / 4) * 4;
const word = (bytes: Uint8Array, offset: number): number =>
  new DataView(bytes.buffer, bytes.byteOffset, bytes.byteLength).getUint32(
    offset,
  );

/** Recognize only a top-level /images node. The full parser validates accepted candidates. */
export async function recognizeFitCarrier(
  prefix: Uint8Array,
  fileSize: number,
  readRange: (offset: number, length: number) => Promise<Uint8Array>,
): Promise<boolean> {
  if (prefix.length < 40 || word(prefix, 0) !== FDT_MAGIC) return false;
  const total = word(prefix, 4),
    version = word(prefix, 20);
  if (
    !Number.isSafeInteger(fileSize) ||
    total > fileSize ||
    total < 40 ||
    (version !== 16 && version !== 17)
  )
    return false;
  const start = word(prefix, 8),
    strings = word(prefix, 12);
  const end =
    version === 17
      ? start + word(prefix, 36)
      : strings > start
        ? strings
        : total;
  if (
    start < (version === 17 ? 40 : 36) ||
    start % 4 !== 0 ||
    end > total ||
    end < start
  )
    return false;
  let cached = prefix,
    cachedStart = 0;
  async function range(
    offset: number,
    length: number,
  ): Promise<Uint8Array | undefined> {
    if (offset < start || offset + length > end) return undefined;
    if (offset < cachedStart || offset + length > cachedStart + cached.length) {
      cachedStart = offset;
      cached = await readRange(offset, Math.min(WINDOW_BYTES, end - offset));
    }
    return offset + length <= cachedStart + cached.length
      ? cached.subarray(offset - cachedStart, offset - cachedStart + length)
      : undefined;
  }
  let cursor = start,
    depth = 0;
  while (cursor <= end - 4) {
    const tokenBytes = await range(cursor, 4);
    if (tokenBytes === undefined) return false;
    const token = word(tokenBytes, 0);
    if (token === 1) {
      let position = cursor + 4,
        length = 0,
        isImages = true;
      const images = [0x69, 0x6d, 0x61, 0x67, 0x65, 0x73];
      while (position < end) {
        const block = await range(position, 1);
        if (block === undefined) return false;
        const available = cached.subarray(position - cachedStart);
        const nul = available.indexOf(0);
        const count = nul < 0 ? available.length : nul;
        for (let index = 0; index < Math.min(count, 7); index++)
          if (available[index] !== images[length + index]) isImages = false;
        length += count;
        if (length > images.length) isImages = false;
        position += count;
        if (nul >= 0) break;
      }
      if (position >= end || (depth === 0 && length !== 0)) return false;
      if (depth === 1 && isImages && length === images.length) return true;
      depth++;
      cursor = align4(position + 1);
    } else if (token === 2) {
      if (--depth <= 0) return false;
      cursor += 4;
    } else if (token === 3) {
      if (depth < 1) return false;
      const property = await range(cursor, 12);
      if (property === undefined) return false;
      cursor = align4(cursor + 12 + word(property, 4));
      if (cursor > end) return false;
    } else if (token === 4) cursor += 4;
    else return false;
  }
  return false;
}
