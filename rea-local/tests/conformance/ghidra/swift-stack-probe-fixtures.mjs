import assert from "node:assert/strict";

/** Source-owned assembly variants. None of these functions are executed. */
export const swiftProbeCases = [
  { label: "probe-direct", mode: "direct", positive: true },
  { label: "probe-got", mode: "got", positive: true },
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
      : spec.change === "library-collision"
        ? "\n.section __TEXT,__text,regular,pure_instructions\n.globl _rea_collision_import\n.p2align 2\n_rea_collision_import:\nadrp x16, _rea_foreign_probe_slot@GOTPAGE\nldr x16, [x16, _rea_foreign_probe_slot@GOTPAGEOFF]\nret\n"
        : "",
  };
}

/** Turn the owned linked GOT load into an exact slot write, retaining relocation bits. */
export function swiftProbePatch(bytes, oracle, spec) {
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
    assert.equal(
      oracle.chained.format,
      1,
      "Owned probe uses four-byte chained imports",
    );
    const raw = bytes.readBigUInt64LE(offset(slot, 8));
    assert.equal(raw >> 63n, 1n, "GOT slot is a chained import bind");
    assert.equal(
      (raw >> 24n) & 0xffn,
      0n,
      "Probe import has no pointer addend",
    );
    const importIndex = Number(raw & 0xffffffn);
    assert.ok(importIndex < oracle.chained.count);
    const imported = bytes.readUInt32LE(
      oracle.chained.imports + importIndex * 4,
    );
    const start = oracle.chained.strings + (imported >>> 9);
    assert.equal(
      bytes.subarray(start, bytes.indexOf(0, start)).toString(),
      symbol.name,
    );
    assert.equal(
      imported & 0xff,
      symbol.description >>> 8,
      "Raw chained ordinal agrees with the independent symbol table",
    );
    return {
      slot,
      symbol: symbol.name,
      library: oracle.libraries[(imported & 0xff) - 1] ?? null,
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
  return {
    profile: "trusted-darwin-arm64-chkstk-v1",
    ...spec,
    calls,
    target_executed: false,
  };
}
