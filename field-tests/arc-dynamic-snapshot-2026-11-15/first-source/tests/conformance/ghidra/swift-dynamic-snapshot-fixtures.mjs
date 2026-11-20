import assert from "node:assert/strict";

/** Owned assembly shapes, never executed. Swift supplies metadata/getter/table;
 * the replaced entry uses a second-argument source and an unknown copy call.
 * Positive recovery is explicitly conditional on the typed call-site snapshot. */
export const swiftSnapshotCases = [
  { label: "snapshot-pairs", positive: true },
  { label: "snapshot-scalars", positive: true, change: "scalars" },
  {
    label: "snapshot-earlier-unknown-allocation",
    positive: true,
    change: "earlier",
  },
  { label: "snapshot-symbolic-probe", positive: true, change: "probe" },
  { label: "snapshot-pretag-escape", positive: true, change: "escape" },
  ...[
    "short-copy",
    "tail-offset",
    "vector-alias",
    "vector-s-alias",
    "source-change",
    "source-write",
    "unknown-store",
    "destination-overlap",
    "posttag-call",
    "wrong-case",
    "sp-pop",
    "stale-sp",
    "unknown-sp",
    "wrong-size-metadata",
    "unaligned-size",
    "zero-register-origin",
    "postgetter-call-escaped",
    "changed-got-store",
    "clobbered-x21",
    "mixed-case",
    "foreign-entry",
    "bypass",
  ].map((change) => ({ label: `snapshot-${change}`, positive: false, change })),
];

export function swiftSnapshotAssembly(body, spec) {
  const getter = body.indexOf(
    "\tbl\t_$s22ReaSwiftRelativeSwitch10FixedChildOWOg\n",
  );
  assert.ok(getter > 0);
  let tail = body
    .slice(getter)
    .replace(/\tstr\tx8, \[sp, #24\][^\n]*\n/, "\tnop\n")
    .replace(/\tldr\tx11, \[sp, #24\][^\n]*\n/, "\tmov\tx11, x8\n")
    .replace(
      /(LBB\d+_\d+:\n)(\tldr\tx0, \[sp, #32\]) /g,
      "$1\tmov\tsp, x19\n$2 ",
    )
    .replace(/(\tadd\tsp, sp, #272\n)/, "\tldp\tx19, x25, [sp, #224]\n$1");
  assert.ok(tail.includes("\tnop\n") && tail.includes("\tmov\tx11, x8\n"));
  if (spec.change === "postgetter-call-escaped")
    tail = tail
      .replace("\tmov\tw8, w8\n", "\tstr\tw8, [x19, #24]\n")
      .replace("\tnop\n", "\tbl\t_rea_snapshot_escape\n")
      .replace("\tmov\tx11, x8\n", "\tldr\tw11, [x19, #24]\n");
  const metadata = spec.change === "clobbered-x21" ? "x21" : "x27";
  let prefix =
    body.slice(0, body.indexOf("\t.cfi_startproc")) +
    `\t.cfi_startproc
\tsub\tsp, sp, #272
\tstp\tx19, x25, [sp, #224]
\tstp\tx28, x27, [sp, #240]
\tstp\tx29, x30, [sp, #256]
\tadd\tx29, sp, #256
\tmov\tx19, sp
\tmov\tx28, x1
\tstr\tx0, [x19, #32]
`;
  if (["earlier", "probe", "changed-got-store"].includes(spec.change))
    prefix +=
      "\tbl\t_rea_snapshot_unknown_extent\n\tsub\tx8, sp, x0\n\tmov\tsp, x8\n";
  prefix += `\tmov\tx0, #0
\tbl\t_$s22ReaSwiftRelativeSwitch11FixedActionOMa
\tmov\t${metadata}, x0
\tldur\tx8, [x0, #-8]
\tldr\tx8, [x8, #64]
\tadd\tx10, x8, #15
\tand\tx12, x10, #-16
`;
  if (["probe", "changed-got-store"].includes(spec.change))
    prefix = prefix.replace(
      "\tadd\tx10, x8, #15\n",
      "\tadrp\tx16, ___chkstk_darwin@GOTPAGE\n" +
        (spec.change === "changed-got-store"
          ? "\tldr\txzr, [x16, ___chkstk_darwin@GOTPAGEOFF]\n"
          : "") +
        "\tldr\tx16, [x16, ___chkstk_darwin@GOTPAGEOFF]\n\tblr\tx16\n\tadd\tx10, x8, #15\n",
    );
  if (spec.change === "wrong-size-metadata")
    prefix = prefix.replace(
      "\tldr\tx8, [x8, #64]\n",
      "\tldr\tx8, [x28, #64]\n",
    );
  if (spec.change === "unaligned-size")
    prefix = prefix.replace("\tand\tx12, x10, #-16\n", "\tmov\tx12, x8\n");
  prefix += `\tsub\tx25, sp, x12
\tmov\tsp, x25
`;
  if (spec.change === "sp-pop")
    prefix += "\tadd\tsp, sp, #16\n\tsub\tsp, sp, #16\n";
  if (spec.change === "stale-sp") prefix += "\tmov\tsp, x19\n\tmov\tsp, x25\n";
  if (spec.change === "unknown-sp") prefix += "\tmov\tsp, x28\n";
  if (["escape", "postgetter-call-escaped"].includes(spec.change))
    prefix += "\tadd\tx0, x19, #64\n\tbl\t_rea_snapshot_escape\n";
  prefix += `\tmov\tx0, x28
\tmov\tx1, x25
\tbl\t_rea_snapshot_unknown_copy
\tmov\tx0, x25
\tmov\tx1, ${metadata}
\tbl\t_swift_getEnumCaseMultiPayload
\tcmp\tw0, #${spec.change === "wrong-case" ? 0 : 1}
\tb.ne\tLrea_snapshot_exit
`;
  let copy = "Lrea_snapshot_projection:\n\tadd\tx9, x19, #64\n";
  if (spec.change === "destination-overlap")
    copy = "Lrea_snapshot_projection:\n\tmov\tx9, x25\n";
  if (spec.change === "posttag-call") copy += "\tbl\t_rea_snapshot_escape\n";
  if (spec.change === "zero-register-origin")
    copy += "\tmov\txzr, x25\n\tmov\tx25, xzr\n";
  if (spec.change === "source-change") copy += "\tmov\tx25, x28\n";
  if (spec.change === "source-write") copy += "\tstr\txzr, [x25]\n";
  if (spec.change === "unknown-store") copy += "\tstr\txzr, [x28]\n";
  for (let at = 0; at < 128; at += 32) {
    if (spec.change === "scalars")
      copy += `\tldr\tq0, [x25, #${at}]\n\tldr\tq1, [x25, #${at + 16}]\n\tstr\tq0, [x9, #${at}]\n\tstr\tq1, [x9, #${at + 16}]\n`;
    else copy += `\tldp\tq0, q1, [x25, #${at}]\n\tstp\tq0, q1, [x9, #${at}]\n`;
  }
  copy += "\tldr\tq0, [x25, #128]\n\tstr\tq0, [x9, #128]\n";
  if (spec.change !== "short-copy")
    copy +=
      `\tldur\tq0, [x25, #${spec.change === "tail-offset" ? 139 : 140}]\n` +
      (spec.change === "vector-alias"
        ? "\tfmov\td0, xzr\n"
        : spec.change === "vector-s-alias"
          ? "\tfmov\ts0, wzr\n"
          : "") +
      "\tstur\tq0, [x9, #140]\n";
  copy += "\tadd\tx0, x19, #64\n";
  if (spec.change === "mixed-case")
    prefix = prefix.replace(
      "\tb.ne\tLrea_snapshot_exit\n",
      "\tb.gt\tLrea_snapshot_exit\n",
    );
  let suffix = "";
  if (spec.change === "foreign-entry")
    suffix +=
      "\n.text\n.globl _rea_snapshot_foreign\n.p2align 2\n_rea_snapshot_foreign:\n\tb\tLrea_snapshot_projection\n";
  if (spec.change === "bypass")
    prefix = prefix.replace(
      "\tmov\tx0, x25\n",
      "\tcbnz\tx28, Lrea_snapshot_projection\n\tmov\tx0, x25\n",
    );
  // All outer alternatives return through a separate non-projection path.
  const end =
    "Lrea_snapshot_exit:\n\tmov\tsp, x19\n\tldp\tx19, x25, [sp, #224]\n\tldp\tx28, x27, [sp, #240]\n\tldp\tx29, x30, [sp, #256]\n\tadd\tsp, sp, #272\n\tret\n";
  return { body: prefix + copy + tail + end, suffix };
}

/** Source-owned linked mutation: preserve exact GOT relocation/offset and turn
 * its unique marker LDR XZR into a visible STR XZR before the probe load. */
export function swiftSnapshotPatch(bytes, oracle, spec) {
  if (spec.change !== "changed-got-store") return bytes;
  const result = Buffer.from(bytes),
    matches = [];
  const section = oracle.sections.find(
    (s) => oracle.entry >= s.address && oracle.tagCall < s.address + s.size,
  );
  for (let at = oracle.entry; at < oracle.tagCall; at += 4) {
    const offset = section.offset + at - section.address,
      word = result.readUInt32LE(offset);
    if ((word & 0xffc003ff) >>> 0 === 0xf940021f)
      matches.push({ offset, word });
  }
  assert.equal(matches.length, 1);
  result.writeUInt32LE(
    (matches[0].word & ~0x00400000) >>> 0,
    matches[0].offset,
  );
  return result;
}

export function swiftSnapshotOracle(bytes, oracle, spec) {
  const offset = (at) => {
    const section = oracle.sections.find(
      (s) =>
        at >= s.address &&
        at + 4 <= s.address + s.size &&
        (s.flags & 0xff) !== 1,
    );
    assert.ok(section);
    return section.offset + at - section.address;
  };
  const word = (at) => bytes.readUInt32LE(offset(at));
  const expected = [0xd10443ff, 0xa90e67f3, 0xa90f6ffc, 0xa9107bfd];
  for (let n = 0; n < expected.length; n++)
    assert.equal(
      word(oracle.entry + n * 4),
      expected[n],
      "Owned fixed-frame prologue",
    );
  const runtime = oracle.projection.runtime;
  if (spec.positive)
    assert.equal(word(runtime + 12), 0x91010269, "ADD X9,X19,#64");
  assert.equal(
    word(runtime - 8),
    0xaa1903e0,
    "Tag source is the last allocation X25",
  );
  assert.equal(
    word(runtime - 4),
    spec.change === "clobbered-x21" ? 0xaa1503e1 : 0xaa1b03e1,
  );
  assert.equal(
    word(runtime + 4),
    spec.change === "wrong-case" ? 0x7100001f : 0x7100041f,
  );
  const sourceBytes = new Array(156).fill(null);
  const loads = [];
  // Independently decode only the admitted Q load/store encodings from linked bytes.
  const registers = new Map();
  for (let at = runtime + 12; at < oracle.tagCall; at += 4) {
    const instruction = word(at),
      top = instruction >>> 22;
    const rt = instruction & 31,
      rn = (instruction >>> 5) & 31;
    if ((instruction & 0xffc00000) >>> 0 === 0xad400000) {
      const raw = (instruction >>> 15) & 127,
        displacement = (raw >= 64 ? raw - 128 : raw) * 16;
      const rt2 = (instruction >>> 10) & 31;
      assert.equal(rn, 25);
      registers.set(
        rt,
        Array.from({ length: 16 }, (_, j) => displacement + j),
      );
      registers.set(
        rt2,
        Array.from({ length: 16 }, (_, j) => displacement + 16 + j),
      );
      loads.push(at);
    } else if (
      (instruction & 0xffc00000) >>> 0 === 0x3dc00000 ||
      (instruction & 0xffe00c00) >>> 0 === 0x3cc00000
    ) {
      const unsigned = top === 0x3dc00000 >>> 22;
      const raw = (instruction >>> 12) & 511;
      const displacement = unsigned
        ? ((instruction >>> 10) & 4095) * 16
        : raw >= 256
          ? raw - 512
          : raw;
      assert.equal(rn, 25);
      registers.set(
        rt,
        Array.from({ length: 16 }, (_, j) => displacement + j),
      );
      loads.push(at);
    } else if ((instruction & 0xffc00000) >>> 0 === 0xad000000) {
      if (spec.positive) assert.equal(rn, 9);
      const raw = (instruction >>> 15) & 127,
        displacement = (raw >= 64 ? raw - 128 : raw) * 16;
      for (const [r, d] of [
        [rt, displacement],
        [(instruction >>> 10) & 31, displacement + 16],
      ])
        for (let j = 0; j < 16; j++)
          sourceBytes[d + j] = registers.get(r)?.[j] ?? null;
    } else if (
      (instruction & 0xffc00000) >>> 0 === 0x3d800000 ||
      (instruction & 0xffe00c00) >>> 0 === 0x3c800000
    ) {
      if (spec.positive) assert.equal(rn, 9);
      const unsigned = top === 0x3d800000 >>> 22,
        raw = (instruction >>> 12) & 511;
      const displacement = unsigned
        ? ((instruction >>> 10) & 4095) * 16
        : raw >= 256
          ? raw - 512
          : raw;
      for (let j = 0; j < 16; j++)
        sourceBytes[displacement + j] = registers.get(rt)?.[j] ?? null;
    } else if (instruction === 0x9e6703e0) registers.delete(0); // FMOV D0,XZR aliases Q0
  }
  if (spec.positive)
    assert.deepEqual(
      sourceBytes,
      Array.from({ length: 156 }, (_, j) => j),
    );
  return {
    profile: "swift-dynamic-typed-snapshot-v1",
    positive: spec.positive,
    change: spec.change ?? null,
    source_register: "x25",
    incoming_source_register: "x1",
    destination_fixed_offset: 64,
    byte_origins: sourceBytes,
    vector_load_addresses: loads,
    target_executed: false,
  };
}
