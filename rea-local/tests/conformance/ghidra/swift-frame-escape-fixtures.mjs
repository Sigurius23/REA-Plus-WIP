import assert from "node:assert/strict";

/** Owned assembly controls. Compile and analyze only; never execute. */
export const swiftFrameEscapeCases = [
  ...[8, 20, 22, 0].map((register) => ({
    label: `frame-escape-post-x${register}`,
    register,
    phase: "post",
    positive: false,
  })),
  ...[8, 20, 22].map((register) => ({
    label: `frame-escape-pre-x${register}`,
    register,
    phase: "pre",
    positive: false,
  })),
  {
    label: "frame-nonargument-x19",
    register: 19,
    phase: "post",
    positive: true,
  },
];

const replaceOnce = (text, pattern, replacement) => {
  assert.equal([...text.matchAll(new RegExp(pattern.source, "g"))].length, 1);
  return text.replace(pattern, replacement);
};

export function swiftFrameEscapeAssembly(body, spec) {
  const register = `x${spec.register}`;
  const saved = spec.register >= 19;
  const setup =
    (saved ? `\tstur\t${register}, [x29, #-216]\n` : "") +
    `\tsub\t${register}, x29, #24\n`;
  const restore = saved ? `\tldur\t${register}, [x29, #-216]\n` : "";
  const helper =
    spec.phase === "pre" ? "_rea_frame_capture" : "_rea_frame_write";
  const transfer = setup + `\tbl\t${helper}\n` + restore;
  // Keep the compiler's tag conversion/spill intact. The inserted post-tag
  // call can overwrite the live spill through the ABI input or a retained
  // address. X19 is a non-argument control, whose helper only returns.
  if (spec.phase === "pre")
    body = replaceOnce(
      body,
      /(\tldur\tx1, \[x29, #-40\][^\n]*\n\tldur\tx0, \[x29, #-32\][^\n]*\n\tbl\t_swift_getEnumCaseMultiPayload\n)/,
      transfer + "$1",
    );
  const post = spec.phase === "pre" ? "\tbl\t_rea_frame_write\n" : transfer;
  body = replaceOnce(body, /(\tstur\tx8, \[x29, #-24\][^\n]*\n)/, "$1" + post);
  const writer = spec.positive
    ? "\tret\n"
    : spec.phase === "pre"
      ? "\tadrp\tx9, _rea_frame_address@PAGE\n\tldr\tx9, [x9, _rea_frame_address@PAGEOFF]\n\tmov\tx10, #65536\n\tstr\tx10, [x9]\n\tret\n"
      : `\tmov\tx9, #65536\n\tstr\tx9, [${register}]\n\tret\n`;
  const capture =
    spec.phase === "pre"
      ? `\t.globl _rea_frame_capture\n\t.p2align 2\n_rea_frame_capture:\n\tadrp\tx9, _rea_frame_address@PAGE\n\tstr\t${register}, [x9, _rea_frame_address@PAGEOFF]\n\tret\n`
      : "";
  return {
    body,
    tagSuffixBytes: spec.phase === "pre" ? 4 : saved ? 16 : 8,
    suffix:
      "\n.section __TEXT,__text,regular,pure_instructions\n" +
      capture +
      "\t.globl _rea_frame_write\n\t.p2align 2\n_rea_frame_write:\n" +
      writer +
      (spec.phase === "pre"
        ? "\n.data\n.p2align 3\n_rea_frame_address:\n.quad 0\n"
        : ""),
  };
}

/** Linked bytes independently bind the source writer and exact call sites. */
export function swiftFrameEscapeOracle(bytes, oracle, spec) {
  const offset = (address) => {
    const s = oracle.sections.find(
      (s) => s.address <= address && address + 4 <= s.address + s.size,
    );
    assert.ok(s);
    return s.offset + address - s.address;
  };
  const word = (address) => bytes.readUInt32LE(offset(address));
  const symbol = (name) => {
    const matches = oracle.symbols.filter((s) => s.name === name);
    assert.equal(matches.length, 1, name);
    return matches[0].address;
  };
  const calls = [];
  for (let pc = oracle.entry; pc < oracle.dispatch; pc += 4) {
    const w = word(pc);
    if (w >>> 26 !== 0x25) continue;
    let delta = w & 0x3ffffff;
    if (delta & 0x2000000) delta -= 0x4000000;
    const target = pc + delta * 4;
    if (
      target === symbol("_rea_frame_write") ||
      (spec.phase === "pre" && target === symbol("_rea_frame_capture"))
    )
      calls.push({ address: pc, target });
  }
  assert.equal(calls.length, spec.phase === "pre" ? 2 : 1);
  assert.ok(calls.at(-1).address > oracle.tagCall);
  if (spec.phase === "pre") assert.ok(calls[0].address < oracle.tagCall);
  const direct = calls[0].address;
  assert.equal(
    word(direct - 4),
    (0xd1000000 | (24 << 10) | (29 << 5) | spec.register) >>> 0,
  );
  const writer = symbol("_rea_frame_write");
  if (spec.positive) assert.equal(word(writer), 0xd65f03c0);
  else {
    const at = writer + (spec.phase === "pre" ? 8 : 0);
    assert.equal(word(at), spec.phase === "pre" ? 0xd2a0002a : 0xd2a00029);
    assert.equal(
      word(at + 4),
      spec.phase === "pre"
        ? 0xf900012a
        : (0xf9000009 | (spec.register << 5)) >>> 0,
    );
    assert.equal(word(at + 8), 0xd65f03c0);
  }
  return {
    ...spec,
    calls,
    writer,
    overwritten_value: spec.positive ? null : 65536,
    target_executed: false,
    scope:
      "Source-owned ABI escape/control; linked writer can invalidate the runtime-tag domain. X19 is a callee-saved non-argument control.",
  };
}
