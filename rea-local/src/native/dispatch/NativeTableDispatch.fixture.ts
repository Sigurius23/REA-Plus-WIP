/** Minimal initialized Mach-O for malformed/proof-boundary regressions. Not a real compiler claim. */
export const dispatchFixture = (): Buffer => {
  const bytes = Buffer.alloc(1024);
  bytes.writeUInt32LE(0xfeedfacf, 0);
  bytes.writeUInt32LE(0x0100000c, 4);
  bytes.writeUInt32LE(2, 12);
  bytes.writeUInt32LE(1, 16);
  bytes.writeUInt32LE(152, 20);
  const c = 32;
  bytes.writeUInt32LE(0x19, c);
  bytes.writeUInt32LE(152, c + 4);
  bytes.writeBigUInt64LE(0x1000n, c + 24);
  bytes.writeBigUInt64LE(1024n, c + 32);
  bytes.writeBigUInt64LE(1024n, c + 48);
  bytes.writeUInt32LE(5, c + 56);
  bytes.writeUInt32LE(5, c + 60);
  bytes.writeUInt32LE(1, c + 64);
  bytes.write("__text", c + 72);
  bytes.writeBigUInt64LE(0x1100n, c + 104);
  bytes.writeBigUInt64LE(0x100n, c + 112);
  // and x8,x0,#ffff; adrp x9,1000; add x9,x9,#300;
  // adr x10,1120; ldrh w11,[x9,x8,lsl1]; add x10,x10,x11,lsl2; br x10.
  [
    0x92403c08, 0x90000009, 0x910c0129, 0x100000aa, 0x7868792b, 0x8b0b094a,
    0xd61f0140,
  ].forEach((w, n) => bytes.writeUInt32LE(w, 0x100 + n * 4));
  bytes.writeUInt32LE(0xd65f03c0, 0x120);
  bytes.writeUInt32LE(0xd65f03c0, 0x124);
  bytes.writeUInt16LE(0, 0x300);
  bytes.writeUInt16LE(1, 0x302);
  // mov w0,#1; mov x20,x21; bl 1100.
  [0x52800020, 0xaa1503f4, 0x97ffffce].forEach((w, n) =>
    bytes.writeUInt32LE(w, 0x1c0 + n * 4),
  );
  return bytes;
};
