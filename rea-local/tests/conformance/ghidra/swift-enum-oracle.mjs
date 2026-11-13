import assert from "node:assert/strict";

const signed = (value, bits) =>
  value & (2 ** (bits - 1)) ? value - 2 ** bits : value;
const address = (value) => `0x${value.toString(16)}`;

/** Independent linked-image decoder. Neither REA+ nor Ghidra defines this oracle. */
export function swiftEnumOracle(
  bytes,
  payloads,
  empty,
  dispatchLoad = false,
  projection = false,
) {
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
  const entry = symbol(
    projection
      ? "11fixedReduceySiAA11FixedActionO_SitF"
      : "03reacD0ySiAA0A9LiveEventO_SitF",
  );
  const accessor = symbol(projection ? "10FixedChildOMa" : "0A9LiveEventOMa");
  const descriptor = symbol(projection ? "10FixedChildOMn" : "0A9LiveEventOMn");
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
      (!dispatchLoad || word(at - 4) === 0xf94003ff) &&
      word(at - (dispatchLoad ? 8 : 4)) === 0x8b090108 &&
      word(at - (dispatchLoad ? 12 : 8)) === 0xb8ab7949
    )
      dispatches.push(at);
  }
  assert.equal(
    dispatches.length,
    1,
    "Compiler did not emit the required LDRSW shape",
  );
  const dispatch = dispatches[0];
  const gap = dispatchLoad ? 4 : 0;
  const tagCall = dispatch - 40 - gap;
  if (projection) assert.equal(callTarget(tagCall), symbol("10FixedChildOWOg"));
  else
    assert.equal(
      stubSymbol(callTarget(tagCall)),
      "_swift_getEnumCaseMultiPayload",
    );
  assert.equal(word(tagCall + 4), 0x11000008); // ADD W8,W0,#0
  assert.equal(word(tagCall + 8), 0x2a0803e8); // MOV W8,W8
  const pageAt = dispatch - 20 - gap;
  const pageWord = word(pageAt);
  assert.equal((pageWord & 0x9f00001f) >>> 0, 0x9000000a);
  const page =
    (pageAt & ~4095) +
    signed((((pageWord >>> 5) & 0x7ffff) << 2) | ((pageWord >>> 29) & 3), 21) *
      4096;
  const addWord = word(pageAt + 4);
  assert.equal((addWord & 0xffc003ff) >>> 0, 0x9100014a);
  const table = page + ((addWord >>> 10) & 0xfff);
  const adrAt = dispatch - 12 - gap;
  const adr = word(adrAt);
  assert.equal((adr & 0x9f00001f) >>> 0, 0x10000008);
  const anchor =
    adrAt + signed((((adr >>> 5) & 0x7ffff) << 2) | ((adr >>> 29) & 3), 21);
  assert.equal(word(descriptor) & 31, 18);
  assert.equal(relative(descriptor + 12), accessor);
  assert.equal(word(descriptor + 20) & 0xffffff, payloads);
  assert.equal(word(descriptor + 24), empty);
  const fields = relative(descriptor + 16);
  assert.equal(bytes.readUInt16LE(offset(fields + 8)), projection ? 3 : 2);
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
  let projectionInfo;
  let boundAccessor = accessor;
  if (projection) {
    const outer = symbol("11FixedActionOMn");
    boundAccessor = symbol("11FixedActionOMa");
    assert.equal(word(outer) & 31, 18);
    assert.equal((word(outer) >>> 16) & 3, 1);
    assert.equal(word(outer + 20) & 0xffffff, 3);
    assert.equal(word(outer + 24), 1);
    const outerFields = relative(outer + 16);
    assert.equal(word(outerFields + 12), 4);
    const selected = [];
    for (let index = 0; index < 3; index++) {
      const record = outerFields + 16 + index * 12;
      const mangled = relative(record + 4);
      if (
        bytes[offset(mangled, 6)] === 1 &&
        bytes[offset(mangled + 5, 1)] === 0 &&
        relative(mangled + 1) === descriptor
      ) {
        assert.equal(
          word(record),
          0,
          "Inline field has no indirect/unknown flags",
        );
        selected.push({ index, record, mangled });
      }
    }
    assert.equal(selected.length, 1);
    const metadata = symbol("10FixedChildON");
    const witness = symbol("10FixedChildOWV");
    const pointer = (at) => Number(bytes.readBigUInt64LE(offset(at, 8)));
    assert.equal((word(descriptor) >>> 16) & 3, 0);
    assert.equal(pointer(metadata), 0x201);
    assert.equal(pointer(metadata + 8), descriptor);
    assert.equal(pointer(metadata - 8), witness);
    assert.equal(pointer(witness + 64), 156);
    const declaredGetter = pointer(witness + 88);
    const calledGetter = callTarget(tagCall);
    assert.deepEqual(
      bytes.subarray(
        offset(declaredGetter, 32),
        offset(declaredGetter, 32) + 32,
      ),
      bytes.subarray(offset(calledGetter, 32), offset(calledGetter, 32) + 32),
    );
    const importedCalls = (symbol) => {
      const result = [];
      for (let at = entry; at < tagCall; at += 4)
        if (word(at) >>> 26 === 0x25) {
          const target = callTarget(at);
          if (
            sections.some(
              (s) =>
                s.name === "__stubs" &&
                target >= s.address &&
                target < s.address + s.size,
            ) &&
            stubSymbol(target) === symbol
          )
            result.push(at);
        }
      assert.equal(result.length, 1, symbol);
      return result[0];
    };
    const runtime = importedCalls("_swift_getEnumCaseMultiPayload");
    const memcpy = importedCalls("_memcpy");
    assert.equal((word(memcpy - 8) & 0xffe0001f) >>> 0, 0x52800008); // MOV W8,#156
    assert.equal((word(memcpy - 8) >>> 5) & 0xffff, 156);
    assert.equal(word(memcpy - 4), 0xaa0803e2); // MOV X2,X8
    assert.equal((word(memcpy - 16) & 0xffc003ff) >>> 0, 0x910003e0); // ADD X0,SP,#buffer
    assert.equal((word(memcpy - 20) & 0xffc003ff) >>> 0, 0xf94003e1); // LDR X1,[SP,#input]
    assert.equal((word(entry) & 0xffc003ff) >>> 0, 0xd10003ff); // fixed SUB SP,SP,#frame
    const frameSize = (word(entry) >>> 10) & 0xfff;
    const destinationOffset = (word(memcpy - 16) >>> 10) & 0xfff;
    assert.ok(destinationOffset + 156 <= frameSize);
    projectionInfo = {
      outer,
      outerFields,
      selected: selected[0],
      metadata,
      witness,
      declaredGetter,
      calledGetter,
      runtime,
      memcpy,
      frameSize,
      destinationOffset,
    };
  }
  const accessorCalls = [];
  for (let at = entry; at < tagCall; at += 4)
    if (word(at) >>> 26 === 0x25 && callTarget(at) === boundAccessor)
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
    projection: projectionInfo,
    offsets: {
      dispatch_load: offset(dispatch - 4),
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
      ...(projectionInfo
        ? {
            payload_reference: offset(projectionInfo.selected.mangled, 6),
            payload_flags: offset(projectionInfo.selected.record),
            metadata_backpointer: offset(projectionInfo.metadata + 8, 8),
            copy_size: offset(projectionInfo.memcpy - 8),
            copy_source: offset(projectionInfo.memcpy - 20),
            copy_destination_cache: offset(projectionInfo.memcpy - 12),
            getter_destination: offset(projectionInfo.memcpy + 4),
            child_store: offset(tagCall - 4),
            outer_branch: offset(projectionInfo.runtime + 8),
            escaped_move: offset(entry + 0x18),
            escaped_call: offset(entry + 0x1c),
          }
        : {}),
    },
  };
}

export function swiftProjectionNegativeCopies(original, oracle) {
  const { offsets: at, projection: p } = oracle;
  assert.equal(
    p.selected.index,
    0,
    "Mutation offsets require the case-zero owned fixture",
  );
  const patch = (mutate) => {
    const bytes = Buffer.from(original);
    mutate(bytes);
    return bytes;
  };
  const branch = (from, to, call = false) =>
    ((call ? 0x94000000 : 0x14000000) | (((to - from) / 4) & 0x3ffffff)) >>> 0;
  assert.equal(original.readUInt32LE(at.copy_destination_cache), 0xf9000be0);
  assert.equal(original.readUInt32LE(at.getter_destination), 0xf9400be0);
  assert.equal(original.readUInt32LE(at.child_store), 0xf9001fe8);
  return {
    projection_indirect_field: patch((b) =>
      b.writeUInt32LE(1, at.payload_flags),
    ),
    projection_unknown_field_flags: patch((b) =>
      b.writeUInt32LE(0x80000000, at.payload_flags),
    ),
    projection_unsupported_reference: patch((b) => {
      b[at.payload_reference] = 2;
    }),
    projection_wrong_metadata_backpointer: patch((b) =>
      b.writeBigUInt64LE(BigInt(p.outer), at.metadata_backpointer),
    ),
    projection_short_copy: patch((b) =>
      b.writeUInt32LE((0x52800008 | (152 << 5)) >>> 0, at.copy_size),
    ),
    projection_changed_source: patch((b) =>
      b.writeUInt32LE(0x910103e1, at.copy_source),
    ), // ADD X1,SP,#64
    projection_child_clobber: patch((b) =>
      b.writeUInt32LE(0xf90023e8, at.child_store),
    ), // STR X8,[SP,#64]
    // Encodings checked by the installed Apple assembler, not executed.
    projection_release_store_clobber: patch((b) =>
      b.writeUInt32LE(0xc89ffc08, at.child_store),
    ), // STLR X8,[X0]
    projection_non_temporal_pair_clobber: patch((b) =>
      b.writeUInt32LE(0xa8002008, at.child_store),
    ), // STNP X8,X8,[X0]
    projection_write_above_private_frame: patch((b) => {
      b.writeUInt32LE(0xf9009be0, at.copy_destination_cache); // STR X0,[SP,#0x130]
      b.writeUInt32LE(0x910103e0, at.getter_destination); // ADD X0,SP,#64
    }),
    projection_writeback_stack_load: patch((b) => {
      b.writeUInt32LE(0xf90073e0, at.copy_destination_cache); // STR X0,[SP,#0xe0]
      b.writeUInt32LE(0xf94073e0, at.getter_destination); // LDR X0,[SP,#0xe0]
      b.writeUInt32LE(0xf84e0ff1, at.getter_destination + 4); // LDR X17,[SP,#0xe0]!
      b.writeUInt32LE(0xd503201f, at.child_store);
    }),
    projection_deallocated_then_reallocated: patch((b) => {
      b.writeUInt32LE(0x910383ff, at.getter_destination + 4); // ADD SP,SP,#0xe0
      b.writeUInt32LE(0xd10383ff, at.child_store); // SUB SP,SP,#0xe0
    }),
    projection_unresolved_outer_exit: patch((b) =>
      b.writeUInt32LE(0xd61f02a0, at.outer_branch + 4),
    ), // BR X21 can re-enter the copy/getter path with another outer tag.
    projection_changed_index: patch((b) =>
      b.writeUInt32LE(
        (b.readUInt32LE(at.changed_index) + 1024) >>> 0,
        at.changed_index,
      ),
    ),
    projection_wide_index: patch((b) => {
      b.writeUInt32LE(
        (b.readUInt32LE(at.changed_index) | 0x80000000) >>> 0,
        at.changed_index,
      );
      b.writeUInt32LE(
        (b.readUInt32LE(at.changed_index + 4) | 0x80000000) >>> 0,
        at.changed_index + 4,
      );
    }),
    projection_no_unique_outer_case: patch((b) =>
      b.writeUInt32LE(branch(p.runtime + 8, p.memcpy - 20), at.outer_branch),
    ),
    projection_same_conditional_successors: patch((b) => {
      b.writeUInt32LE(0x34000020, at.outer_branch); // CBZ W0,next instruction
      b.writeUInt32LE(
        branch(p.runtime + 12, p.memcpy - 20),
        at.outer_branch + 4,
      );
    }),
    projection_frame_escape: patch((b) => {
      const firstCase = Number(BigInt(oracle.mappings[0].target_address));
      const section = oracle.sections.find(
        (s) => firstCase >= s.address && firstCase < s.address + s.size,
      );
      const callOffset = section.offset + firstCase + 4 - section.address;
      const instruction = b.readUInt32LE(callOffset);
      assert.equal(instruction >>> 26, 0x25);
      const callee = firstCase + 4 + signed(instruction & 0x3ffffff, 26) * 4;
      b.writeUInt32LE(0x910003e0, at.escaped_move); // MOV X0,SP
      b.writeUInt32LE(
        branch(oracle.entry + 0x1c, callee, true),
        at.escaped_call,
      );
    }),
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
  const adr = (register, from, to) => {
    const delta = to - from;
    assert.ok(Number.isInteger(delta) && delta >= -1048576 && delta < 1048576);
    return (
      (0x10000000 |
        ((delta & 3) << 29) |
        (((delta >> 2) & 0x7ffff) << 5) |
        register) >>>
      0
    );
  };
  const writebackRetirement = (withCall) =>
    patch((b) => {
      const start = at.changed_index + 4;
      const words = [0xf81e83a8, 0xd10083bf, 0xf84307ff];
      if (withCall) {
        const first = Number(BigInt(oracle.mappings[0].target_address));
        const section = oracle.sections.find(
          (s) => first >= s.address && first < s.address + s.size,
        );
        const call = original.readUInt32LE(
          section.offset + first + 4 - section.address,
        );
        assert.equal(call >>> 26, 0x25);
        const callee = first + 4 + signed(call & 0x3ffffff, 26) * 4;
        words.push(
          (0x94000000 |
            (((callee - (oracle.tagCall + 20)) / 4) & 0x3ffffff)) >>>
            0,
        );
      }
      words.push(0xf85e83ab); // LDUR X11,[X29,#-24]
      const tableAdr = oracle.tagCall + 8 + words.length * 4;
      words.push(adr(10, tableAdr, oracle.table));
      if (withCall) {
        const anchorAdr = oracle.tagCall + 8 + words.length * 4;
        words.push(
          adr(8, anchorAdr, oracle.anchor),
          0xb8ab7949,
          0x8b090108,
          0xd61f0100,
        );
      }
      words.forEach((word, index) => b.writeUInt32LE(word, start + index * 4));
    });
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
    retired_frame_tag_store: patch((b) =>
      b.writeUInt32LE(0x910003bf, at.changed_index + 4),
    ), // MOV SP,X29 retires the subsequent entry-relative tag spill.
    retired_sp_writeback_tag_load: writebackRetirement(false),
    retired_sp_writeback_tag_load_with_call: writebackRetirement(true),
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
