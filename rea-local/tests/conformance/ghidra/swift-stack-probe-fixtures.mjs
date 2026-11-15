import assert from "node:assert/strict";

/** Source-owned assembly variants. None of these functions are executed. */
export const swiftProbeCases = [
  { label: "probe-direct", mode: "direct", positive: true },
  { label: "probe-got", mode: "got", positive: true },
  {
    label: "probe-unrelated-rebases",
    mode: "direct",
    positive: true,
    change: "unrelated-rebases",
  },
  {
    label: "probe-normalized-import-collision",
    mode: "got",
    positive: false,
    change: "normalized-import-collision",
  },
  ...[2, 3].flatMap((format) => [
    {
      label: `probe-import-format${format}-zero`,
      mode: "got",
      positive: true,
      importsFormat: format,
      importAddend: 0,
    },
    {
      label: `probe-import-format${format}-nonzero`,
      mode: "got",
      positive: false,
      importsFormat: format,
      importAddend: 16,
    },
  ]),
  ...[
    "local-name",
    "foreign-library",
    "library-collision",
    "classic-binding",
    "lookalike-name",
    "four-underscores",
    "target-overwrite",
    "mixed-target-entry",
    "got-write",
    "unknown-call",
    "unknown-sp",
    "retired-frame",
    "copy-overwrite",
    "old-flags",
    "clobbered-x2",
    "clobbered-x8",
    "clobbered-x12",
    "volatile-x10",
    "volatile-x16",
    "volatile-x17",
    "volatile-x30",
  ].map((change) => ({
    label: `probe-${change}`,
    mode:
      change.startsWith("volatile-") ||
      ["local-name", "lookalike-name"].includes(change)
        ? "direct"
        : "got",
    positive: false,
    change,
  })),
];

const replaceOnce = (text, pattern, replacement) => {
  assert.equal([...text.matchAll(new RegExp(pattern.source, "g"))].length, 1);
  return text.replace(pattern, replacement);
};

export function swiftProbeAssembly(body, spec) {
  const symbol =
    spec.change === "four-underscores"
      ? "____chkstk_darwin"
      : spec.change === "lookalike-name"
        ? "___chkstk_darwin_lookalike"
        : "___chkstk_darwin";
  const call = (index) => {
    let result = "\tmov\tx9, #0\n";
    if (index === 0 && spec.change === "unknown-sp")
      result += "\tsub\tsp, sp, x0\n";
    if (index === 0 && spec.change === "retired-frame")
      result += "\tadd\tsp, sp, #16\n";
    if (index === 0 && spec.change === "unknown-call")
      result += "\tbl\t_rea_case_0\n";
    if (spec.mode === "direct") result += `\tbl\t${symbol}\n`;
    else {
      if (index === 0 && spec.change === "got-write")
        result += `\tadrp\tx16, ${symbol}@GOTPAGE\n\tldr\txzr, [x16, ${symbol}@GOTPAGEOFF]\n`;
      if (index === 0 && spec.change === "mixed-target-entry")
        result += "\tcbnz\tx0, Lrea_probe_mixed\n";
      result += `\tadrp\tx16, ${symbol}@GOTPAGE\n\tldr\tx16, [x16, ${symbol}@GOTPAGEOFF]\n`;
      if (index === 0 && spec.change === "target-overwrite")
        result += "\tmov\tx16, x0\n";
      if (index === 0 && spec.change === "mixed-target-entry")
        result += "Lrea_probe_mixed:\n";
      result += "\tblr\tx16\n";
    }
    if (index === 0 && spec.change === "retired-frame")
      result += "\tsub\tsp, sp, #16\n";
    return result;
  };
  const metadata = spec.change?.startsWith("volatile-")
    ? spec.change.slice("volatile-".length)
    : "x2";
  body = replaceOnce(
    body,
    /(\tbl\t_\$s22ReaSwiftRelativeSwitch11FixedActionOMa\n)\tmov\tx1, x0\n/,
    `$1\tmov\t${metadata}, x0\n${call(0)}${spec.change === "clobbered-x2" ? "\tmov\tx2, #0\n" : ""}\tmov\tx1, ${metadata}\n`,
  );
  body = replaceOnce(
    body,
    /(\tmov\tw8, #156[^\n]*\n)(\tmov\tx2, x8\n)/,
    `$1${call(1)}\tldr\tx1, [sp, #40]\n\tadd\tx0, sp, #64\n${spec.change === "clobbered-x8" ? "\tmov\tx8, #0\n" : ""}$2`,
  );
  body = replaceOnce(
    body,
    /\tbl\t_memcpy\n\tldr\tx0, \[sp, #16\][^\n]*\n/,
    `\tbl\t_memcpy\n\tldr\tx12, [sp, #16]\n${call(2)}${spec.change === "clobbered-x12" ? "\tmov\tx12, #0\n" : ""}${spec.change === "copy-overwrite" ? "\tstr\txzr, [sp, #64]\n" : ""}\tmov\tx0, x12\n`,
  );
  if (spec.change === "old-flags")
    body = replaceOnce(
      body,
      /\tcbz\tw0, ([^\n]+)\n/,
      `\tmov\tw8, w0\n\tcmp\tw8, #0\n${call(3)}\tb.eq\t$1\n`,
    );
  return {
    body,
    suffix: ["local-name", "lookalike-name"].includes(spec.change)
      ? `\n\t.section __TEXT,__text,regular,pure_instructions\n\t.globl ${symbol}\n\t.p2align 2\n${symbol}:\n\tret\n`
      : spec.change === "unrelated-rebases"
        ? "\n.data\n.p2align 3\n.globl _rea_unrelated_rebase_anchor\n_rea_unrelated_rebase_anchor:\n.quad 0\n.globl _rea_unrelated_rebases\n_rea_unrelated_rebases:\n.rept 100001\n.quad _rea_unrelated_rebase_anchor\n.endr\n"
        : spec.change === "library-collision"
          ? "\n.section __TEXT,__text,regular,pure_instructions\n.globl _rea_collision_import\n.p2align 2\n_rea_collision_import:\nadrp x16, _rea_foreign_probe_slot@GOTPAGE\nldr x16, [x16, _rea_foreign_probe_slot@GOTPAGEOFF]\nret\n"
          : "",
  };
}

/** Turn the owned linked GOT load into an exact slot write, retaining relocation bits. */
export function swiftProbePatch(bytes, oracle, spec) {
  if (spec.change === "normalized-import-collision")
    return normalizedImportCollision(bytes, oracle);
  if (spec.importsFormat !== undefined)
    return repackOwnedChainedImports(bytes, oracle, spec);
  if (spec.change === "library-collision") {
    const result = Buffer.from(bytes);
    const { chained, symbols } = oracle;
    assert.equal(
      chained.format,
      1,
      "Owned collision uses four-byte chained import records",
    );
    const records = [];
    for (let i = 0; i < chained.count; i++) {
      const offset = chained.imports + i * 4;
      const word = result.readUInt32LE(offset);
      const start = chained.strings + (word >>> 9);
      records.push({
        offset,
        word,
        name: result.subarray(start, result.indexOf(0, start)).toString(),
      });
    }
    const probe = records.find((r) => r.name === "___chkstk_darwin");
    const foreign = records.find((r) => r.name === "_rea_foreign_probe_slot");
    assert.ok(
      probe && foreign && (probe.word & 0xff) !== (foreign.word & 0xff),
    );
    result.writeUInt32LE(
      ((probe.word & 0xfffffe00) | (foreign.word & 0x1ff)) >>> 0,
      foreign.offset,
    );
    const oldSymbol = symbols.find((s) => s.name === "_rea_foreign_probe_slot");
    const probeSymbol = symbols.find((s) => s.name === "___chkstk_darwin");
    assert.ok(oldSymbol && probeSymbol);
    result.writeUInt32LE(probeSymbol.string_index, oldSymbol.record_offset);
    return result;
  }
  if (spec.change !== "got-write") return bytes;
  const result = Buffer.from(bytes);
  const section = oracle.sections.find(
    (s) => oracle.entry >= s.address && oracle.tagCall < s.address + s.size,
  );
  const matches = [];
  for (let at = oracle.entry; at < oracle.tagCall; at += 4) {
    const offset = section.offset + at - section.address;
    const word = result.readUInt32LE(offset);
    if ((word & 0xffc003ff) >>> 0 === 0xf940021f)
      matches.push({ offset, word });
  }
  assert.equal(matches.length, 1, "Owned XZR GOT-load marker");
  result.writeUInt32LE(
    (matches[0].word & ~0x00400000) >>> 0,
    matches[0].offset,
  );
  return result;
}

/** Repack only an owned linked image's import records. Pointer chains retain
 * their indices; append the new LINKEDIT payload instead of shifting code/data.
 * The image is analyzed statically; no signature/executability claim is made. */
function repackOwnedChainedImports(bytes, oracle, spec) {
  assert.equal(oracle.chained.format, 1);
  assert.ok([2, 3].includes(spec.importsFormat));
  const original = bytes.subarray(
    oracle.chained.offset,
    oracle.chained.offset + oracle.chained.size,
  );
  const oldImports = oracle.chained.imports - oracle.chained.offset,
    oldStrings = oracle.chained.strings - oracle.chained.offset;
  assert.ok(
    oldImports >= 28 && oldStrings >= oldImports + oracle.chained.count * 4,
  );
  const width = spec.importsFormat === 2 ? 8 : 16,
    imports = (oldImports + 7) & ~7,
    strings = imports + oracle.chained.count * width;
  const payload = Buffer.alloc(strings + original.length - oldStrings);
  original.copy(payload, 0, 0, oldImports);
  payload.writeUInt32LE(imports, 8);
  payload.writeUInt32LE(strings, 12);
  payload.writeUInt32LE(spec.importsFormat, 20);
  original.copy(payload, strings, oldStrings);
  let selected = 0;
  for (let index = 0; index < oracle.chained.count; index++) {
    const record = original.readUInt32LE(oldImports + 4 * index),
      nameOffset = record >>> 9;
    const name = original
      .subarray(
        oldStrings + nameOffset,
        original.indexOf(0, oldStrings + nameOffset),
      )
      .toString();
    const addend = name === "___chkstk_darwin" ? spec.importAddend : 0;
    if (name === "___chkstk_darwin") selected++;
    if (spec.importsFormat === 2) {
      payload.writeUInt32LE(record, imports + width * index);
      payload.writeInt32LE(addend, imports + width * index + 4);
    } else {
      const rawOrdinal = record & 255,
        ordinal = rawOrdinal >= 128 ? rawOrdinal - 256 : rawOrdinal;
      const header =
        BigInt(ordinal & 0xffff) |
        (BigInt((record >>> 8) & 1) << 16n) |
        (BigInt(nameOffset) << 32n);
      payload.writeBigUInt64LE(header, imports + width * index);
      payload.writeBigInt64LE(BigInt(addend), imports + width * index + 8);
    }
  }
  assert.equal(selected, 1);
  return appendOwnedFixups(bytes, payload);
}

/** Keep the used chain index, replace its raw name by the space lookalike,
 * and add one unused literal import with the identical library ordinal. */
function normalizedImportCollision(bytes, oracle) {
  assert.equal(oracle.chained.format, 1);
  const original = bytes.subarray(
    oracle.chained.offset,
    oracle.chained.offset + oracle.chained.size,
  );
  const oldImports = oracle.chained.imports - oracle.chained.offset,
    oldStrings = oracle.chained.strings - oracle.chained.offset;
  const names = original.subarray(oldStrings),
    lookalike = Buffer.from("___chkstk darwin\0", "ascii");
  const imports = (oldImports + 7) & ~7,
    count = oracle.chained.count + 1,
    strings = imports + count * 4;
  const payload = Buffer.alloc(strings + names.length + lookalike.length);
  original.copy(payload, 0, 0, oldImports);
  payload.writeUInt32LE(imports, 8);
  payload.writeUInt32LE(strings, 12);
  payload.writeUInt32LE(count, 16);
  names.copy(payload, strings);
  lookalike.copy(payload, strings + names.length);
  let selected = null;
  for (let index = 0; index < oracle.chained.count; index++) {
    const record = original.readUInt32LE(oldImports + 4 * index),
      start = oldStrings + (record >>> 9);
    const name = original
      .subarray(start, original.indexOf(0, start))
      .toString();
    payload.writeUInt32LE(record, imports + 4 * index);
    if (name === "___chkstk_darwin") {
      assert.equal(selected, null);
      selected = record;
      payload.writeUInt32LE(
        ((names.length << 9) | (record & 0x1ff)) >>> 0,
        imports + 4 * index,
      );
    }
  }
  assert.notEqual(selected, null);
  payload.writeUInt32LE(selected, imports + 4 * (count - 1));
  return appendOwnedFixups(bytes, payload);
}

function appendOwnedFixups(bytes, payload) {
  const appended = (bytes.length + 7) & ~7,
    result = Buffer.alloc(appended + payload.length);
  bytes.copy(result);
  payload.copy(result, appended);
  let commandFound = false,
    linkeditFound = false;
  for (let index = 0, at = 32; index < result.readUInt32LE(16); index++) {
    const command = result.readUInt32LE(at),
      size = result.readUInt32LE(at + 4);
    if (command === 0x80000034) {
      assert.equal(commandFound, false);
      commandFound = true;
      result.writeUInt32LE(appended, at + 8);
      result.writeUInt32LE(payload.length, at + 12);
    }
    if (
      command === 0x19 &&
      result
        .subarray(at + 8, at + 24)
        .toString()
        .split("\0")[0] === "__LINKEDIT"
    ) {
      assert.equal(linkeditFound, false);
      linkeditFound = true;
      const file = Number(result.readBigUInt64LE(at + 40));
      assert.ok(file <= bytes.length);
      const length = result.length - file;
      result.writeBigUInt64LE(BigInt(length), at + 48);
      result.writeBigUInt64LE(
        BigInt(Math.ceil(length / 16384) * 16384),
        at + 32,
      );
    }
    at += size;
  }
  assert.ok(commandFound && linkeditFound);
  return result;
}

/** Independent bounded traversal of original owned-image chained starts.
 * Count every chain slot, including unrelated local rebases, without Ghidra. */
function originalChainedPointerCount(bytes, oracle) {
  const segments = [];
  for (let index = 0, at = 32; index < bytes.readUInt32LE(16); index++) {
    const command = bytes.readUInt32LE(at),
      size = bytes.readUInt32LE(at + 4);
    assert.ok(size >= 8 && at + size <= bytes.length);
    if (command === 0x19)
      segments.push({
        vm: Number(bytes.readBigUInt64LE(at + 24)),
        file: Number(bytes.readBigUInt64LE(at + 40)),
        fileSize: Number(bytes.readBigUInt64LE(at + 48)),
      });
    at += size;
  }
  assert.equal(segments[0].vm, 0, "Owned dylib has zero image base");
  const start =
    oracle.chained.offset + bytes.readUInt32LE(oracle.chained.offset + 4);
  const count = bytes.readUInt32LE(start);
  assert.equal(count, segments.length);
  const visited = new Set();
  let rebases = 0,
    binds = 0;
  for (let index = 0; index < count; index++) {
    const relative = bytes.readUInt32LE(start + 4 + 4 * index);
    if (!relative) continue;
    const info = start + relative,
      extent = bytes.readUInt32LE(info),
      pageSize = bytes.readUInt16LE(info + 4),
      format = bytes.readUInt16LE(info + 6),
      pages = bytes.readUInt16LE(info + 20),
      segment = segments[index];
    assert.ok([2, 6].includes(format));
    assert.ok(
      pageSize > 0 &&
        extent >= 22 + pages * 2 &&
        info + extent <= oracle.chained.offset + oracle.chained.size,
    );
    assert.equal(Number(bytes.readBigUInt64LE(info + 8)), segment.vm);
    const chain = (page, head) => {
      let displacement = page * pageSize + head;
      while (true) {
        assert.ok(
          displacement >= page * pageSize &&
            displacement + 8 <= (page + 1) * pageSize &&
            displacement + 8 <= segment.fileSize,
        );
        const file = segment.file + displacement;
        assert.ok(file + 8 <= bytes.length && !visited.has(file));
        visited.add(file);
        assert.ok(visited.size <= Math.floor(bytes.length / 4));
        const raw = bytes.readBigUInt64LE(file);
        if (raw >> 63n) binds++;
        else rebases++;
        const next = Number((raw >> 51n) & 0xfffn);
        if (!next) break;
        displacement += next * 4;
      }
    };
    for (let page = 0; page < pages; page++) {
      const head = bytes.readUInt16LE(info + 22 + page * 2);
      if (head === 0xffff) continue;
      if (!(head & 0x8000)) chain(page, head);
      else
        for (let extra = head & 0x7fff; ; extra++) {
          assert.ok(22 + extra * 2 + 2 <= extent);
          const value = bytes.readUInt16LE(info + 22 + extra * 2);
          chain(page, value & 0x7fff);
          if (value & 0x8000) break;
        }
    }
  }
  return {
    total: visited.size,
    rebases,
    binds,
    formats: [2, 6],
    target_executed: false,
  };
}

/** Decode the independently linked import/GOT identity and actual call encodings. */
export function swiftProbeOracle(bytes, oracle, spec) {
  const offset = (at, length = 4) => {
    const section = oracle.sections.find(
      (s) =>
        at >= s.address &&
        at + length <= s.address + s.size &&
        (s.flags & 0xff) !== 1,
    );
    assert.ok(section, "Probe instruction has file-backed bytes");
    return section.offset + at - section.address;
  };
  const word = (at) => bytes.readUInt32LE(offset(at));
  const signed = (value, bits) =>
    value & (2 ** (bits - 1)) ? value - 2 ** bits : value;
  const slotSymbol = (slot) => {
    const section = oracle.sections.find(
      (s) =>
        [6, 7].includes(s.flags & 0xff) &&
        slot >= s.address &&
        slot + 8 <= s.address + s.size,
    );
    assert.ok(section, "Probe loads an indirect-symbol pointer section");
    const index = bytes.readUInt32LE(
      oracle.indirect_table +
        4 * (section.indirect_start + (slot - section.address) / 8),
    );
    const symbol = oracle.symbols[index];
    assert.ok(symbol, "Pointer slot has a declared symbol");
    if (spec.change === "classic-binding") {
      assert.equal(
        oracle.chained,
        undefined,
        "Classic control has no chained import command",
      );
      return {
        slot,
        symbol: symbol.name,
        library: oracle.libraries[(symbol.description >>> 8) - 1] ?? null,
      };
    }
    const format = oracle.chained.format;
    assert.ok([1, 2, 3].includes(format));
    const raw = bytes.readBigUInt64LE(offset(slot, 8));
    assert.equal(raw >> 63n, 1n, "GOT slot is a chained import bind");
    assert.equal(
      (raw >> 24n) & 0xffn,
      0n,
      "Probe import has no embedded pointer addend",
    );
    const importIndex = Number(raw & 0xffffffn);
    assert.ok(importIndex < oracle.chained.count);
    const width = format === 1 ? 4 : format === 2 ? 8 : 16,
      at = oracle.chained.imports + importIndex * width;
    const imported = bytes.readUInt32LE(at);
    const nameOffset =
      format === 3 ? Number(bytes.readBigUInt64LE(at) >> 32n) : imported >>> 9;
    const ordinal = format === 3 ? imported & 0xffff : imported & 255;
    const importAddend =
      format === 1
        ? 0
        : format === 2
          ? bytes.readInt32LE(at + 4)
          : Number(bytes.readBigInt64LE(at + 8));
    const start = oracle.chained.strings + nameOffset;
    const rawName = bytes.subarray(start, bytes.indexOf(0, start)).toString();
    assert.equal(
      rawName,
      spec.change === "normalized-import-collision"
        ? "___chkstk darwin"
        : symbol.name,
    );
    assert.equal(
      ordinal,
      symbol.description >>> 8,
      "Raw chained ordinal agrees with independent symbol table",
    );
    if (spec.importsFormat !== undefined) {
      assert.equal(format, spec.importsFormat);
      assert.equal(importAddend, spec.importAddend);
    } else assert.equal(importAddend, 0);

    return {
      slot,
      symbol: symbol.name,
      library: oracle.libraries[ordinal - 1] ?? null,
      raw_import_name: rawName,
      imports_format: format,
      import_addend: importAddend,
    };
  };
  const got = (pageAt) => {
    const page = word(pageAt),
      load = word(pageAt + 4);
    assert.equal((page & 0x9f00001f) >>> 0, 0x90000010);
    assert.equal((load & 0xffc003ff) >>> 0, 0xf9400210);
    const displacement =
      signed(((page >>> 5) & 0x7ffff) * 4 + ((page >>> 29) & 3), 21) * 4096;
    return slotSymbol(
      Math.floor(pageAt / 4096) * 4096 +
        displacement +
        ((load >>> 10) & 0xfff) * 8,
    );
  };
  const calls = [];
  for (let at = oracle.entry; at < oracle.tagCall; at += 4) {
    const instruction = word(at);
    if (instruction === 0xd63f0200) {
      const pageAt =
        spec.change === "target-overwrite" && calls.length === 0
          ? at - 12
          : at - 8;
      calls.push({ address: at, form: "got-blr", ...got(pageAt) });
    } else if (instruction >>> 26 === 0x25) {
      const target = at + signed(instruction & 0x3ffffff, 26) * 4;
      const local = oracle.symbols.find(
        (s) => s.address === target && s.name.startsWith("___chkstk_darwin"),
      );
      const stub = oracle.sections.find(
        (s) =>
          s.name === "__stubs" &&
          target >= s.address &&
          target < s.address + s.size,
      );
      if (local)
        calls.push({
          address: at,
          form: "local-bl",
          symbol: local.name,
          library: null,
        });
      else if (stub) {
        const index = bytes.readUInt32LE(
          oracle.indirect_table +
            4 *
              (stub.indirect_start + (target - stub.address) / stub.stub_size),
        );
        if (oracle.symbols[index]?.name.startsWith("___chkstk_darwin"))
          calls.push({ address: at, form: "direct-bl", ...got(target) });
      }
    }
  }
  assert.equal(calls.length, spec.change === "old-flags" ? 4 : 3);
  if (spec.positive)
    for (const call of calls) {
      assert.equal(call.symbol, "___chkstk_darwin");
      assert.equal(call.library, "/usr/lib/libSystem.B.dylib");
    }
  if (spec.change === "foreign-library")
    assert.ok(
      calls.every((call) => call.library === "/rea/foreign/libSystem.B.dylib"),
    );
  if (spec.change === "library-collision") {
    assert.equal(oracle.chained.format, 1);
    const ordinals = new Set();
    for (let i = 0; i < oracle.chained.count; i++) {
      const word = bytes.readUInt32LE(oracle.chained.imports + i * 4);
      const start = oracle.chained.strings + (word >>> 9);
      if (
        bytes.subarray(start, bytes.indexOf(0, start)).toString() ===
        "___chkstk_darwin"
      )
        ordinals.add(word & 0xff);
    }
    assert.deepEqual([...ordinals].map((n) => oracle.libraries[n - 1]).sort(), [
      "/rea/foreign/libSystem.B.dylib",
      "/usr/lib/libSystem.B.dylib",
    ]);
  }
  if (spec.change === "normalized-import-collision") {
    const selected = [];
    for (let index = 0; index < oracle.chained.count; index++) {
      const imported = bytes.readUInt32LE(oracle.chained.imports + 4 * index),
        start = oracle.chained.strings + (imported >>> 9);
      const name = bytes.subarray(start, bytes.indexOf(0, start)).toString();
      if (["___chkstk_darwin", "___chkstk darwin"].includes(name))
        selected.push({ name, ordinal: imported & 255 });
    }
    assert.equal(selected.length, 2);
    assert.deepEqual(
      new Set(selected.map((item) => item.name)),
      new Set(["___chkstk_darwin", "___chkstk darwin"]),
    );
    assert.equal(selected[0].ordinal, selected[1].ordinal);
  }
  let originalChainedPointers;
  if (spec.change === "unrelated-rebases") {
    originalChainedPointers = originalChainedPointerCount(bytes, oracle);
    assert.ok(
      originalChainedPointers.rebases >= 100001 &&
        originalChainedPointers.total > 100000,
      "Unrelated local chain slots exceed the old global scan budget",
    );
  }
  return {
    original_chained_pointers: originalChainedPointers,
    profile: "trusted-darwin-arm64-chkstk-v1",
    ...spec,
    calls,
    target_executed: false,
  };
}
