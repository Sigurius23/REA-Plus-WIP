# HeyClicky Swift switch reproduction — 2026-10-30

**The automatic switch-recovery gap is reproduced on a small source-owned
fixture with complete Ghidra auto-analysis.** This separates the missing native
case bodies from HeyClicky's bounded main-analysis timeout. No production fix
was made in this lane.

The fixture uses a resilient imported payload type, an enum with **18 payload
cases and 12 empty cases**, and 30 distinct external case callees. Installed
Apple Swift **6.3.3**, driver 1.148.6, compiles it at `-Onone` to the same
relevant arm64 shape observed in HeyClicky:

```asm
bl      _swift_getEnumCaseMultiPayload
add     w8, w0, #0
mov     w8, w8
stur    x8, [x29, #-24]
ldur    x11, [x29, #-24]
adrp    x10, table@PAGE
add     x10, x10, table@PAGEOFF
adr     x8, branch_base
ldrsw   x9, [x10, x11, lsl #2]
add     x8, x8, x9
br      x8
```

There is no local comparison guard. A separate `-O` compile emits a byte table
and an instruction-offset scale; that variant is retained and is **not** counted
as an exact `LDRSW` reproduction.

## Independent oracle

The linked fixture is **54,000 bytes**, SHA-256
`1440cfcb01c542159fc671273dd6929bf0bc7439360cc089533e88cb3d03c749`.
The compiler assembly and independently decoded linked-image bytes establish:

- Function entry `0x878`; runtime tag call `0x8fc`; dispatch `0x924`.
- Table `0xda0`; branch base `0x918`; signed little-endian 32-bit entries.
- Enum descriptor `0x3514` contains `0x02000012`: 18 payload cases; its empty
  count is 12. Field descriptor `0x3648` has enum kind 2, 12-byte records and
  30 fields in source order.
- Every one of the 30 table targets reaches its corresponding source-declared
  case callee. Target addresses are aligned and verified against the independent
  LLVM disassembly and raw branch words.

The case count comes from the source enum and descriptor, never the distance to
another symbol. The compact receipt embeds both Swift sources, complete compile
commands, compiler/source/binary hashes, the 30-case oracle and raw-file identities.
Generated binaries and module-cache data remain under private temporary storage.

## Actual REA+ result

One real Ghidra **12.1.4** MCP run made **8 public calls; all succeeded** and
passed advertised input/output schemas and canonical contracts. The overview
returned in **14,009 ms** with 92 procedures, 151 defined strings and 21 memory
segments. The measured state was `analysis_complete=true`,
`analysis_timed_out=false`, with an explicit 60-second analysis setting.

`analyze_function`, Evidence
`ev_81d68d4bf8692a82e26e6b5cf0fd81ee8fea095ab3dd4f7c37bef948a5743a28`,
returns `native_api.jump_tables: []`. Function metadata, Evidence
`ev_2d645aee103f06810d746159e694e73c1d4c4d391c2a3e4b127a4b3c2ccc78cc`,
contains only **`0x878..0x927`, 176 bytes, one basic block**. All 30 independently
known case destinations start after that body.

Pseudocode Evidence
`ev_d6d4f7df6fb481f55a6179dd77ea187fb67638c394ff88b3e814e0dae5420842`
explicitly warns that the jump table could not be recovered because of too many
branches and treats the indirect branch as a call. It omits the case bodies.
Completing Ghidra auto-analysis therefore does not imply complete semantic
recovery.

The bridge currently enumerates only Ghidra's recovered jump tables. Its
supplementary relative decoder also requires existing recovered targets,
accepts only byte/halfword entries and requires a local unsigned comparison
guard. Adding `LDRSW` alone would leave the other two gates unchanged.

A fix needs a separately verified bound authority, recovery without an existing
HighFunction jump table, and explicit body/control-flow repair if pseudocode
coverage is claimed. The exact runtime call, matching metadata and unchanged
selector flow must be proved; nearby byte lengths cannot supply a bound.
Existing public byte and instruction tools still support manual investigation.
Code seeds can decode destinations, but cannot declare a switch relationship or
turn a case block into an independent function.

## Scope and retained evidence

Public close completed in **435 ms**; the driver exited 0; fixture bytes stayed
unchanged. The verifier's final token-verified point-in-time lineage contained
no live descendants. No fixture or target code ran. This was an **MCP-only**
reproduction; no fresh CLI parity is claimed, and HeyClicky was not reimported.
The linked fixture deliberately retains external case-callee references through
dynamic lookup and was never loaded.

[Compact receipt](heyclicky-switch-reproduction-2026-10-30.json) records the full
profile, input/output identities and lifecycle facts. Raw source, compiler
outputs, oracle and all eight replies remain at
`/private/tmp/rea-swift-switch-fixture-s46qvr6w/`.

## Subsequent correction

Item 37 was fixed and verified after this diagnostic pass. REA+ now recovers the
30-case mapping and owning body itself; this report retains the original
observations and scope. See the
[fix verification](heyclicky-37-fix-verification-2026-10-30.md).
