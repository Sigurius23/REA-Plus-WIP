import assert from "node:assert/strict";

const signed = (value, bits) =>
  value & (2 ** (bits - 1)) ? value - 2 ** bits : value;
const address = (value) => `0x${value.toString(16)}`;

/** Independent linked-image decoder. Neither REA+ nor Ghidra defines this oracle. */
export function swiftEnumOracle(bytes, payloads, empty) {
  assert.equal(bytes.readUInt32LE(0), 0xfeedfacf);
  const sections = [];
  const symbols = [];
  const strings = {};
  let symtab;
  let indirect;
  for (let index = 0, at = 32; index < bytes.readUInt32LE(16); index++) {
    const command = bytes.readUInt32LE(at);
    if (command === 0x19) {
      for (let section = 0; section < bytes.readUInt32LE(at + 64); section++) {
        const start = at + 72 + section * 80;
        sections.push({
          name: bytes
            .subarray(start, start + 16)
            .toString()
            .split("\0")[0],
          address: Number(bytes.readBigUInt64LE(start + 32)),
          size: Number(bytes.readBigUInt64LE(start + 40)),
          offset: bytes.readUInt32LE(start + 48),
          flags: bytes.readUInt32LE(start + 64),
          indirect_start: bytes.readUInt32LE(start + 68),
          stub_size: bytes.readUInt32LE(start + 72),
        });
      }
    }
    if (command === 2)
      symtab = {
        offset: bytes.readUInt32LE(at + 8),
        count: bytes.readUInt32LE(at + 12),
        strings: bytes.readUInt32LE(at + 16),
      };
    if (command === 0xb) indirect = bytes.readUInt32LE(at + 56);
    at += bytes.readUInt32LE(at + 4);
  }
  assert.ok(symtab && indirect);
  const offset = (location, length = 4) => {
    const section = sections.find(
      (item) =>
        (item.flags & 0xff) !== 1 &&
        location >= item.address &&
        location + length <= item.address + item.size,
    );
    assert.ok(section, `Oracle address ${address(location)} has no file bytes`);
    const at = section.offset + location - section.address;
    assert.ok(at + length <= bytes.length);
    return at;
  };
  const word = (location) => bytes.readUInt32LE(offset(location));
  const relative = (location) => location + bytes.readInt32LE(offset(location));
  const string = (at) => bytes.subarray(at, bytes.indexOf(0, at)).toString();
  for (let index = 0; index < symtab.count; index++) {
    const at = symtab.offset + index * 16;
    const nameOffset = symtab.strings + bytes.readUInt32LE(at);
    const name = string(nameOffset);
    symbols.push({ name, address: Number(bytes.readBigUInt64LE(at + 8)) });
    strings[name] = nameOffset;
  }
  const symbol = (suffix) => {
    const matches = symbols.filter(({ name }) => name.endsWith(suffix));
    assert.equal(
      matches.length,
      1,
      `Missing unique compiler symbol: ${suffix}`,
    );
    return matches[0].address;
  };
  const entry = symbol("03reacD0ySiAA0A9LiveEventO_SitF");
  const accessor = symbol("0A9LiveEventOMa");
  const descriptor = symbol("0A9LiveEventOMn");
  const stubSymbol = (target) => {
    const section = sections.find(
      (item) =>
        item.name === "__stubs" &&
        target >= item.address &&
        target < item.address + item.size,
    );
    assert.ok(section, `No compiler stub at ${address(target)}`);
    assert.equal((target - section.address) % section.stub_size, 0);
    const index =
      section.indirect_start + (target - section.address) / section.stub_size;
    return symbols[bytes.readUInt32LE(indirect + index * 4)].name;
  };
  const callTarget = (location) => {
    const instruction = word(location);
    assert.equal(instruction >>> 26, 0x25, "Expected a compiler-emitted BL");
    return location + signed(instruction & 0x3ffffff, 26) * 4;
  };
  const dispatches = [];
  for (let at = entry + 40; at < accessor; at += 4) {
    if (
      word(at) === 0xd61f0100 &&
      word(at - 4) === 0x8b090108 &&
      word(at - 8) === 0xb8ab7949
    )
      dispatches.push(at);
  }
  assert.equal(
    dispatches.length,
    1,
    "Compiler did not emit the required LDRSW shape",
  );
  const dispatch = dispatches[0];
  const tagCall = dispatch - 40;
  assert.equal(
    stubSymbol(callTarget(tagCall)),
    "_swift_getEnumCaseMultiPayload",
  );
  assert.equal(word(tagCall + 4), 0x11000008); // ADD W8,W0,#0
  assert.equal(word(tagCall + 8), 0x2a0803e8); // MOV W8,W8
  const pageAt = dispatch - 20;
  const pageWord = word(pageAt);
  assert.equal((pageWord & 0x9f00001f) >>> 0, 0x9000000a);
  const page =
    (pageAt & ~4095) +
    signed((((pageWord >>> 5) & 0x7ffff) << 2) | ((pageWord >>> 29) & 3), 21) *
      4096;
  const addWord = word(pageAt + 4);
  assert.equal((addWord & 0xffc003ff) >>> 0, 0x9100014a);
  const table = page + ((addWord >>> 10) & 0xfff);
  const adrAt = dispatch - 12;
  const adr = word(adrAt);
  assert.equal((adr & 0x9f00001f) >>> 0, 0x10000008);
  const anchor =
    adrAt + signed((((adr >>> 5) & 0x7ffff) << 2) | ((adr >>> 29) & 3), 21);
  assert.equal(word(descriptor) & 31, 18);
  assert.equal(relative(descriptor + 12), accessor);
  assert.equal(word(descriptor + 20) & 0xffffff, payloads);
  assert.equal(word(descriptor + 24), empty);
  const fields = relative(descriptor + 16);
  assert.equal(bytes.readUInt16LE(offset(fields + 8)), 2);
  assert.equal(bytes.readUInt16LE(offset(fields + 10)), 12);
  assert.equal(word(fields + 12), payloads + empty);
  const mappings = [];
  for (let index = 0; index < payloads + empty; index++) {
    const record = fields + 16 + index * 12;
    const expected =
      index < payloads ? `payload${index}` : `empty${index - payloads}`;
    assert.equal(string(offset(relative(record + 8), 1)), expected);
    assert.equal(word(record + 4) !== 0, index < payloads);
    const target = anchor + bytes.readInt32LE(offset(table + index * 4));
    assert.equal(target % 4, 0);
    assert.equal(stubSymbol(callTarget(target + 4)), `_rea_case_${index}`);
    mappings.push({
      case_value: index,
      target_address: address(target),
      field_name: expected,
    });
  }
  const accessorCalls = [];
  for (let at = entry; at < tagCall; at += 4)
    if (word(at) >>> 26 === 0x25 && callTarget(at) === accessor)
      accessorCalls.push(at);
  assert.equal(accessorCalls.length, 1);
  return {
    entry,
    accessor,
    descriptor,
    fields,
    dispatch,
    table,
    anchor,
    tagCall,
    accessorCall: accessorCalls[0],
    mappings,
    sections,
    strings,
    offsets: {
      changed_index: offset(tagCall + 4),
      partial_tag_store: offset(tagCall + 12),
      descriptor_count: offset(descriptor + 24),
      descriptor_accessor: offset(descriptor + 12),
      descriptor_cache: offset(descriptor + 28),
      accessor_cache_load: offset(accessor + 20),
      field_stride: offset(fields + 10),
      table: offset(table),
      table_page: offset(pageAt),
      table_add: offset(pageAt + 4),
      wrong_metadata_call: offset(accessorCalls[0]),
      accessor_request: offset(accessorCalls[0] - 4),
    },
  };
}

/** Corrupt owned copies only; the independent source oracle above stays unchanged. */
export function swiftEnumNegativeCopies(original, oracle) {
  const patch = (mutate) => {
    const bytes = Buffer.from(original);
    mutate(bytes);
    return bytes;
  };
  const { offsets: at } = oracle;
  const shortTable = oracle.sections.find(({ name }) => name === "__text");
  const target = shortTable.address + shortTable.size - 4;
  const pageAt = oracle.dispatch - 20;
  const pages = ((target & ~4095) - (pageAt & ~4095)) / 4096;
  const encoded = pages & 0x1fffff;
  return {
    changed_index: patch((b) =>
      b.writeUInt32LE(
        (b.readUInt32LE(at.changed_index) + 1024) >>> 0,
        at.changed_index,
      ),
    ),
    wide_tag_without_zero_extension: patch((b) => {
      b.writeUInt32LE(
        (b.readUInt32LE(at.changed_index) | 0x80000000) >>> 0,
        at.changed_index,
      );
      b.writeUInt32LE(
        (b.readUInt32LE(at.changed_index + 4) | 0x80000000) >>> 0,
        at.changed_index + 4,
      );
    }),
    mismatched_count: patch((b) =>
      b.writeUInt32LE(
        b.readUInt32LE(at.descriptor_count) + 1,
        at.descriptor_count,
      ),
    ),
    unsupported_stride: patch((b) => b.writeUInt16LE(16, at.field_stride)),
    wrong_accessor: patch((b) =>
      b.writeInt32LE(
        oracle.entry - (oracle.descriptor + 12),
        at.descriptor_accessor,
      ),
    ),
    mismatched_descriptor_cache: patch((b) =>
      b.writeInt32LE(
        b.readInt32LE(at.descriptor_cache) + 8,
        at.descriptor_cache,
      ),
    ),
    mismatched_accessor_cache: patch((b) =>
      b.writeUInt32LE(
        (b.readUInt32LE(at.accessor_cache_load) + 1024) >>> 0,
        at.accessor_cache_load,
      ),
    ),
    wrong_metadata_call: patch((b) =>
      b.writeUInt32LE(
        (0x94000000 |
          (((oracle.tagCall - oracle.accessorCall) / 4) & 0x3ffffff)) >>>
          0,
        at.wrong_metadata_call,
      ),
    ),
    partial_tag_store: patch((b) =>
      b.writeUInt32LE(
        (b.readUInt32LE(at.partial_tag_store) & ~0x40000000) >>> 0,
        at.partial_tag_store,
      ),
    ),
    escaped_frame_argument: patch((b) =>
      b.writeUInt32LE(0x910003e0, at.accessor_request),
    ), // MOV X0,SP
    late_escaped_frame_argument: patch((b) => {
      // Move an unknown call with a frame argument to a CFG predecessor laid
      // out after the tag/dispatch. The original first case supplies owned
      // space; its existing BL still names the independent source case callee.
      const late = Number(BigInt(oracle.mappings[0].target_address));
      const text = oracle.sections.find(
        (s) => late >= s.address && late < s.address + s.size,
      );
      const start = text.offset + late - text.address;
      const branch = (from, to, call = false) =>
        ((call ? 0x94000000 : 0x14000000) | (((to - from) / 4) & 0x3ffffff)) >>>
        0;
      b.writeUInt32LE(
        branch(oracle.accessorCall - 4, late),
        at.accessor_request,
      );
      b.writeUInt32LE(0xd503201f, at.wrong_metadata_call); // NOP old BL
      b.writeUInt32LE(0x910003e0, start); // MOV X0,SP
      b.writeUInt32LE(0xd2800000, start + 8); // MOV X0,#0
      b.writeUInt32LE(branch(late + 12, oracle.accessor, true), start + 12);
      b.writeUInt32LE(branch(late + 16, oracle.accessorCall + 4), start + 16);
    }),
    unresolved_runtime: patch((b) => {
      const start = oracle.strings._swift_getEnumCaseMultiPayload;
      b[start + 18] = 88;
    }),
    wrong_runtime_library: patch((b) => {
      const index = b.indexOf(Buffer.from("libswiftCore.dylib"));
      assert.ok(index >= 0);
      b.write("libswiftFake.dylib", index);
    }),
    misaligned_target: patch((b) =>
      b.writeInt32LE(b.readInt32LE(at.table) + 2, at.table),
    ),
    noncode_target: patch((b) =>
      b.writeInt32LE(oracle.descriptor - oracle.anchor, at.table),
    ),
    short_initialized_table: patch((b) => {
      b.writeUInt32LE(
        (0x9000000a | ((encoded & 3) << 29) | ((encoded >>> 2) << 5)) >>> 0,
        at.table_page,
      );
      b.writeUInt32LE(
        (0x9100014a | ((target & 4095) << 10)) >>> 0,
        at.table_add,
      );
    }),
  };
}
