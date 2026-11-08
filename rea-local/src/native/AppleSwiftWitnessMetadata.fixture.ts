const base = 0x100000000n;

/** Two mapped segments keep data addresses distinct from executable addresses. */
export const swiftWitnessFixture = (external = false) => {
  const bytes = Buffer.alloc(4096);
  const u32 = (at: number, value: number) => bytes.writeUInt32LE(value, at);
  const u64 = (at: number, value: bigint) => bytes.writeBigUInt64LE(value, at);
  const relative = (at: number, target: number) =>
    bytes.writeInt32LE(target - at, at);
  u32(0, 0xfeedfacf);
  u32(4, 0x0100000c);
  u32(16, external ? 4 : 2);
  u32(20, external ? 336 : 224);
  for (const [at, name, offset, count] of [
    [32, "__TEXT", 0, 0],
    [104, "__DATA", 0x800, 1],
  ] as const) {
    u32(at, 0x19);
    u32(at + 4, 72 + count * 80);
    bytes.write(name, at + 8);
    u64(at + 24, base + BigInt(offset));
    u64(at + 32, 0x800n);
    u64(at + 40, BigInt(offset));
    u64(at + 48, 0x800n);
    u32(at + 60, offset === 0 ? 5 : 3);
    u32(at + 64, count);
  }
  bytes.write("__swift5_proto", 176);
  bytes.write("__DATA", 192);
  u64(208, base + 0x900n);
  u64(216, 4n);
  u32(224, 0x900);
  relative(0x900, 0xa00);
  relative(0xa00, 0xb80);
  relative(0xa04, 0xc88);
  u32(0xa0c, 0x30008); // indirect nominal type, resilient + generic witness tails
  u32(0xa10, 1);
  relative(0xa14, 0xbc0);
  relative(0xa18, 0x500);
  u32(0xa1c, 0x10000); // two uint16 size/control words, not a requirement count
  relative(0xa24, 0xc40);
  u32(0xb00, 18);
  relative(0xb08, 0xc00);
  u32(0xb80, 3);
  relative(0xb88, 0xc20);
  u32(0xbc0, 2); // synchronous initializer requirement
  bytes.write("Request\0", 0xc00);
  bytes.write("DecodableFixture\0", 0xc20);
  u64(0xc88, base + 0xb00n);
  if (external) {
    // LC_DYLD_INFO_ONLY and a dependent dylib, using actual bind opcodes.
    u32(256, 0x80000022);
    u32(260, 48);
    u32(272, 0xf00);
    u32(304, 0xc);
    u32(308, 64);
    u32(312, 24);
    bytes.write("/usr/lib/swift/libswiftCore.dylib\0", 328);
    const bind = Buffer.concat([
      Buffer.from([0x11, 0x41]),
      Buffer.from("_$sSeMp\0"),
      Buffer.from([0x51, 0x60, 0x7d, 0x71, 0xf8, 0x08, 0x90, 0x41]),
      Buffer.from("_$sSe4fromxs7Decoder_p_tKcfCTq\0"),
      Buffer.from([0x71, 0x80, 0x09, 0x90, 0]),
    ]);
    u32(276, bind.length);
    bind.copy(bytes, 0xf00);
    relative(0xa00, 0xc78);
    u32(0xa00, bytes.readUInt32LE(0xa00) | 1);
    relative(0xa14, 0xc80);
    u32(0xa14, bytes.readUInt32LE(0xa14) | 1);
  }
  return bytes;
};
