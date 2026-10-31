// Independent linked Mach-O symbol/file-range oracle for source-built fixtures.
// This parser is verification infrastructure; production takes explicit ranges.
import assert from "node:assert/strict";
export function emulationMachOFunctions(bytes) {
  assert.equal(bytes.readUInt32LE(0), 0xfeedfacf);
  const cpu = bytes.readUInt32LE(4);
  assert.ok([0x100000c, 0x1000007].includes(cpu));
  let cursor = 32;
  let symtab;
  const sections = [];
  for (let i = 0; i < bytes.readUInt32LE(16); ++i) {
    const command = bytes.readUInt32LE(cursor),
      size = bytes.readUInt32LE(cursor + 4);
    assert.ok(size >= 8 && cursor + size <= bytes.length);
    if (command === 0x19) {
      for (let j = 0; j < bytes.readUInt32LE(cursor + 64); ++j) {
        const p = cursor + 72 + j * 80;
        sections.push({
          name: bytes
            .subarray(p, p + 16)
            .toString()
            .replace(/\0.*$/s, ""),
          address: bytes.readBigUInt64LE(p + 32),
          size: Number(bytes.readBigUInt64LE(p + 40)),
          offset: bytes.readUInt32LE(p + 48),
        });
      }
    } else if (command === 2)
      symtab = {
        offset: bytes.readUInt32LE(cursor + 8),
        count: bytes.readUInt32LE(cursor + 12),
        strings: bytes.readUInt32LE(cursor + 16),
      };
    cursor += size;
  }
  assert.ok(symtab);
  const functions = [];
  for (let i = 0; i < symtab.count; ++i) {
    const p = symtab.offset + i * 16;
    if ((bytes[p + 4] & 0xe) !== 0xe) continue;
    const section = sections[bytes[p + 5] - 1];
    if (section?.name !== "__text") continue;
    const start = symtab.strings + bytes.readUInt32LE(p);
    const name = bytes.subarray(start, bytes.indexOf(0, start)).toString();
    const address = bytes.readBigUInt64LE(p + 8);
    if (
      address < section.address ||
      address >= section.address + BigInt(section.size)
    )
      continue;
    functions.push({
      name,
      address: `0x${address.toString(16)}`,
      file_offset: section.offset + Number(address - section.address),
      section,
    });
  }
  functions.sort((a, b) => a.file_offset - b.file_offset);
  return new Map(
    functions
      .filter((f) => f.name.startsWith("_rea_"))
      .map((f) => {
        const next = functions.find(
          (candidate) =>
            candidate.file_offset > f.file_offset &&
            candidate.section === f.section,
        );
        return [
          f.name,
          {
            address: f.address,
            file_offset: f.file_offset,
            size:
              (next?.file_offset ?? f.section.offset + f.section.size) -
              f.file_offset,
          },
        ];
      }),
  );
}
