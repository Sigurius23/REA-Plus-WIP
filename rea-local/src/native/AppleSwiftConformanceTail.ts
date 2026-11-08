import type {
  createSwiftRelativeReader,
  SwiftDispatchReaders,
} from "./AppleSwiftDispatchFacets.js";

/** Swift 5.9 Metadata.h trailing-object order; no runtime control code is invoked. */
export const createSwiftConformanceTailReader = (input: {
  readers: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
}) => {
  const { readers: read, relative } = input;
  const parse = (descriptor: bigint, flags: number) => {
    if ((flags & ~0xff03fff8) !== 0)
      throw new TypeError(
        "Unsupported conformance flags or preceding tail layout",
      );
    let cursor = descriptor + 16n;
    const retroactive = (flags & 0x40) === 0 ? null : cursor;
    if (retroactive !== null) {
      read.offset(cursor, 4);
      cursor += 4n;
    }
    const conditionalCount = (flags >>> 8) & 255;
    const conditional = cursor;
    if (conditionalCount > 0) read.offset(cursor, conditionalCount * 12);
    cursor += BigInt(conditionalCount * 12);
    const packCount = flags >>> 24;
    const packs = cursor;
    if (packCount > 0) read.offset(cursor, packCount * 8);
    cursor += BigInt(packCount * 8);
    let count = 0;
    if ((flags & 0x10000) !== 0) {
      count = read.u32(cursor);
      read.offset(cursor, 4 + count * 8);
      cursor += 4n;
    }
    const resilient = cursor;
    cursor += BigInt(count * 8);
    const generic = (flags & 0x20000) === 0 ? null : cursor;
    let control = null;
    if (generic !== null) {
      read.offset(generic, 12);
      const packed = read.u32(generic);
      const instantiator = relative.resolve(generic + 4n);
      const privateData = relative.resolve(generic + 8n);
      control = {
        words: packed & 0xffff,
        privateWords: packed >>> 17,
        instantiationFlag: (packed & 0x10000) !== 0,
        instantiator,
        privateData,
        instantiatorLocation: relative.inspect(generic + 4n).record.target,
        privateDataLocation: relative.inspect(generic + 8n).record.target,
      };
    }
    return {
      retroactive,
      conditional,
      conditionalCount,
      packs,
      packCount,
      resilient,
      count,
      generic,
      control,
    };
  };
  const cache = new Map<bigint, ReturnType<typeof parse>>();
  return (descriptor: bigint, flags: number) => {
    const retained = cache.get(descriptor);
    if (retained !== undefined) return retained;
    const tail = parse(descriptor, flags);
    cache.set(descriptor, tail);
    return tail;
  };
};
export type SwiftConformanceTailReader = ReturnType<
  typeof createSwiftConformanceTailReader
>;
