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
    "posttag-sp-pop",
    "unresolved-outer-exit",
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
          ? "\tldr\txzr, [x16, ___chkstk_darwin@GOTPAGEOFF]\n\tadrp\tx16, ___chkstk_darwin@GOTPAGE\n"
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
  if (spec.change === "posttag-sp-pop")
    copy += "\tadd\tsp, sp, #16\n\tsub\tsp, sp, #16\n";
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
  let end =
    "Lrea_snapshot_exit:\n\tmov\tsp, x19\n\tldp\tx19, x25, [sp, #224]\n\tldp\tx28, x27, [sp, #240]\n\tldp\tx29, x30, [sp, #256]\n\tadd\tsp, sp, #272\n\tret\n";
  if (spec.change === "unresolved-outer-exit")
    end = "Lrea_snapshot_exit:\n\tbr\tx28\n";
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
  const words = [];
  for (let at = oracle.entry; at < oracle.dispatch; at += 4)
    words.push({ address: at, word: word(at) });
  const unique = (expected, description) => {
    const found = words.filter((item) => item.word === expected);
    assert.equal(found.length, 1, description);
    return found[0].address;
  };
  const mutations = [];
  const exact = (expected, description) =>
    mutations.push({
      address: unique(expected, description),
      word: expected,
      description,
    });
  if (spec.positive) {
    assert.equal(
      word(oracle.entry + 24),
      0xaa0103fc,
      "Second argument copied to X28",
    );
    assert.equal(
      word(oracle.accessorCall - 4),
      0xd2800000,
      "Complete metadata request zero",
    );
    for (const [offset, expected] of [
      [4, 0xaa0003fb],
      [8, 0xf85f8008],
      [12, 0xf9402108],
    ])
      assert.equal(
        word(oracle.accessorCall + offset),
        expected,
        "Metadata X27 -> VWT[-8] -> size[64]",
      );
    const align = unique(0x927ced4c, "AND X12,X10,#-16");
    assert.equal(word(align - 4), 0x91003d0a, "ADD X10,X8,#15");
    assert.equal(word(align + 4), 0xcb2c63f9, "SUB X25,SP,X12");
    assert.equal(word(align + 8), 0x9100033f, "MOV SP,X25");
  }
  if (spec.change === "unresolved-outer-exit") {
    const branch = word(runtime + 8),
      raw = (branch >>> 5) & 0x7ffff;
    const exit = runtime + 8 + (raw >= 0x40000 ? raw - 0x80000 : raw) * 4;
    assert.equal(
      word(exit),
      0xd61f0380,
      "Excluded outer exit has unresolved BR X28",
    );
    mutations.push({
      address: exit,
      word: word(exit),
      description:
        "unresolved computed outer exit can bypass selected-case proof",
    });
  }
  const mutationWords = {
    "vector-alias": [0x9e6703e0, "FMOV D0,XZR clobbers Q0"],
    "vector-s-alias": [0x1e2703e0, "FMOV S0,WZR clobbers Q0"],
    "source-change": [0xaa1c03f9, "MOV X25,X28 changes source"],
    "source-write": [0xf900033f, "STR XZR,[X25] modifies snapshot source"],
    "unknown-store": [0xf900039f, "STR XZR,[X28] writes unknown alias"],
    "destination-overlap": [
      0xaa1903e9,
      "MOV X9,X25 directs stores into source",
    ],
    "posttag-sp-pop": [
      0x910043ff,
      "ADD SP,SP,#16 after tag changes source lifetime",
    ],
    "sp-pop": [0x910043ff, "ADD SP,SP,#16 retires storage"],
    "stale-sp": [0x9100027f, "MOV SP,X19 restores stale stack"],
    "unknown-sp": [0x9100039f, "MOV SP,X28 installs unknown stack"],
    "wrong-size-metadata": [
      0xf9402388,
      "LDR X8,[X28,#64] has wrong size origin",
    ],
    "unaligned-size": [0xaa0803ec, "MOV X12,X8 omits alignment"],
    "zero-register-origin": [0xaa1903ff, "MOV XZR,X25 discards pointer"],
  };
  if (mutationWords[spec.change]) exact(...mutationWords[spec.change]);
  if (spec.change === "zero-register-origin")
    exact(0xaa1f03f9, "MOV X25,XZR reads immutable zero");
  if (spec.change === "postgetter-call-escaped") {
    assert.equal(
      word(oracle.tagCall + 8),
      0xb9001a68,
      "STR W8,[X19,#24] tag spill",
    );
    assert.equal(
      word(oracle.tagCall + 12) >>> 26,
      0x25,
      "Unknown call crosses escaped tag spill",
    );
    assert.equal(
      word(oracle.tagCall + 16),
      0xb9401a6b,
      "LDR W11,[X19,#24] reloads spill",
    );
    mutations.push({
      address: oracle.tagCall + 12,
      word: word(oracle.tagCall + 12),
      description: "post-getter call across escaped spill",
    });
  }
  if (spec.change === "mixed-case")
    assert.equal(
      word(runtime + 8) & 15,
      12,
      "B.GT admits outer cases zero and one",
    );
  if (spec.change === "foreign-entry")
    assert.equal(
      oracle.symbols.filter((item) => item.name === "_rea_snapshot_foreign")
        .length,
      1,
    );
  if (spec.change === "bypass")
    assert.equal(
      words.filter((item) => (item.word & 0xff00001f) >>> 0 === 0xb500001c)
        .length,
      1,
      "CBNZ X28 bypasses tag",
    );
  const probeCalls = [];
  for (const item of words.filter((item) => item.word === 0xd63f0200)) {
    const at = item.address,
      pageAt = at - 8,
      page = word(pageAt),
      load = word(at - 4);
    assert.equal(
      (page & 0x9f00001f) >>> 0,
      0x90000010,
      "Adjacent probe ADRP X16",
    );
    assert.equal(
      (load & 0xffc003ff) >>> 0,
      0xf9400210,
      "Adjacent probe LDR X16",
    );
    const rawDelta = ((page >>> 5) & 0x7ffff) * 4 + ((page >>> 29) & 3);
    const delta =
      (rawDelta >= 0x100000 ? rawDelta - 0x200000 : rawDelta) * 4096;
    const slot =
      Math.floor(pageAt / 4096) * 4096 + delta + ((load >>> 10) & 4095) * 8;
    const section = oracle.sections.find(
      (section) =>
        slot >= section.address && slot + 8 <= section.address + section.size,
    );
    assert.ok(section);
    const pointer = bytes.readBigUInt64LE(
      section.offset + slot - section.address,
    );
    assert.equal(pointer >> 63n, 1n);
    assert.equal(oracle.chained.format, 1);
    const index = Number(pointer & 0xffffffn);
    assert.ok(index < oracle.chained.count);
    const imported = bytes.readUInt32LE(oracle.chained.imports + 4 * index);
    const start = oracle.chained.strings + (imported >>> 9);
    assert.equal(
      bytes.subarray(start, bytes.indexOf(0, start)).toString(),
      "___chkstk_darwin",
    );
    assert.equal(
      oracle.libraries[(imported & 255) - 1],
      "/usr/lib/libSystem.B.dylib",
    );
    probeCalls.push({
      address: at,
      slot,
      symbol: "___chkstk_darwin",
      library: "/usr/lib/libSystem.B.dylib",
    });
    if (spec.change === "changed-got-store") {
      const store = word(at - 12);
      assert.equal(
        (store & 0xffc003ff) >>> 0,
        0xf900021f,
        "Changed GOT store precedes intact adjacent probe chain",
      );
      assert.equal(
        (store >>> 10) & 4095,
        (load >>> 10) & 4095,
        "Store changes the exact probe slot",
      );
      mutations.push({
        address: at - 12,
        word: store,
        description: "visible GOT store before intact import chain",
      });
    }
  }
  assert.equal(
    probeCalls.length,
    ["probe", "changed-got-store"].includes(spec.change) ? 1 : 0,
  );
  const sourceBytes = Array.from({ length: 156 }, () => null);
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
    } else if ([0x9e6703e0, 0x1e2703e0].includes(instruction))
      registers.delete(0); // FMOV D0/XZR or S0/WZR aliases Q0
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
    byte_origins: spec.positive ? sourceBytes : null,
    encoded_q_offset_map: sourceBytes,
    offset_map_semantics: spec.positive
      ? "Full origins conditional on independently checked X25 source and X19+64 destination identities and snapshot assumptions"
      : "Structural Q-load/store offsets only; pointer identity, interference and control mutations are separately recorded, so these are not semantic byte origins",
    verified_mutations: mutations,
    probe_calls: probeCalls,
    vector_load_addresses: loads,
    target_executed: false,
  };
}
