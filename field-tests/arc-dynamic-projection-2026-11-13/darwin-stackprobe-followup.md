# Installed Darwin stack-probe implementation

Follow-up to `design.md`, observed 2026-11-13. The earlier design/probe files and their hash manifest were not edited. This is supplemental local implementation analysis, not REA+ provider Evidence or observed Arc execution. No network, installation, target execution, provider run or production edit occurred.

## Result

The special preservation of X2, X8, X12 and SP is now supported by complete installed implementation bodies, not only by compiler caller behavior. Both the installed arm64 and arm64e pthread implementations contain the same 108 code bytes. Every normal-return path preserves those registers. The implementation can fault while checking/probing memory and does not itself allocate or adjust SP.

This proves the effect of the identified installed code. It does not prove that Arc's external import resolves to these exact bytes. The local cached libSystem/libcompiler_rt reexport chain names the expected pthread entry; the inspected pthread is a physical filesystem image. Its identity was not equated to the pthread image in the dyld cache or to an Arc runtime dependency. A producer accepting a named Darwin import as this special ABI still needs an explicit version/ABI policy, or an exact linked-implementation binding. Arbitrary BLR calls and arbitrary same-named imports remain unknown.

## Sources and identities

The installed `/usr/lib/system/libsystem_pthread.dylib` is a 494064-byte universal Mach-O with arm64, arm64e and x86_64 slices. File SHA-256:

```
0571f04d3545d307e4a1c1f674d16c3347c22e7e4c74dc4ffe93d62b4564f38b
```

The exact value above is copied from the follow-up JSON receipt, which also records the full slice identities and extraction offsets. The inspected machine reports macOS 26.5.2, build 25F84; the physical pthread image declares macOS/Catalyst minOS and SDK 26.5.

| Slice | LC_UUID | Entry / exclusive end | Exact body SHA-256 |
| --- | --- | --- | --- |
| arm64 | `1E522024-387B-3D18-81CA-F4559198954B` | `0x1a38` / `0x1aa4` | `ddd4554e5a02372157751809c47b011a319814d1d14770fff1fa1b9316b9fd31` |
| arm64e | `4F33683C-18C8-39A1-800B-2E3BD43BCC13` | `0x1c20` / `0x1c8c` | same |

Each body is 27 AArch64 instructions / 108 bytes, ending immediately before `_pthread_getspecific`. The raw bytes were independently obtained from the physical Mach-O section mapping and checked against `dyld_info -section_bytes` for arm64e. The function is exported as both `____chkstk_darwin` and `_thread_chkstk_darwin`.

The selected arm64 members `chkstk_darwin.S.o` (560 bytes) and `chkstk_darwin2.S.o` (448 bytes) were also read from three installed compiler-rt archives: CLT clang 14.0.0, CLT clang 17 and Xcode clang 21. Only those six tiny object members were extracted into ignored `rea-local/.cache/darwin-stackprobe-2026-11-13/`. Their complete `__text` contents agree across all three versions despite differing object hashes/build metadata:

- First member: 64-byte text SHA-256 `a215bfb56057874d8175a8b65945676ae2808b84acb1aaac3b5f7df32175e135`.
- Its 44-byte fallback probe at text offset 20: SHA-256 `13d3083c6d10e7ab49d73e93c6f1045f8a5d67ee8f22d8ddadef872528e17b2a`.
- Second member: four-byte branch with relocation, text SHA-256 `a7911cdfdc28e6a1867e359ba426081aacfa692fdeb3e978d2a68dd924fa8c3e`.

The first member's `___chkstk_darwin` loads a weak `____chkstk_darwin` through its GOT. If nonzero it tail-branches to that implementation; otherwise it branches to its own complete fallback. The second member defines `____chkstk_darwin` as a branch to that fallback. The fallback changes X9/X10/NZCV, reads a byte at each probed address, preserves SP and all other GPR/SIMD registers, and performs no stores. The first wrapper additionally writes X16. A nonzero weak target is not proven benign merely by extracting the wrapper.

## Complete installed arm64 body

Addresses are unslid image offsets. The arm64e body is byte-identical at the other entry offset.

```asm
0x1a38  stp   x10, x11, [sp, #-0x10]
0x1a3c  mrs   x10, TPIDRRO_EL0
0x1a40  ldur  x11, [x10, #-0x30]
0x1a44  subs  x11, sp, x11
0x1a48  b.hs  0x1a78
0x1a4c  ldur  x11, [x10, #-0x28]
0x1a50  mov   x10, sp
0x1a54  cmp   x10, x11
0x1a58  b.ls  0x1a78
0x1a5c  subs  x10, x10, x9
0x1a60  b.lo  0x1a74
0x1a64  cmp   x10, x11
0x1a68  b.lo  0x1a74
0x1a6c  ldp   x10, x11, [sp, #-0x10]
0x1a70  ret
0x1a74  ldur  x11, [x11, #-0x8]
0x1a78  mov   x10, sp
0x1a7c  cmp   x9, #0x1000
0x1a80  b.lo  0x1a98
0x1a84  sub   x10, x10, #0x1000
0x1a88  ldr   x11, [x10]
0x1a8c  sub   x9, x9, #0x1000
0x1a90  cmp   x9, #0x1000
0x1a94  b.hi  0x1a84
0x1a98  sub   x10, x10, x9
0x1a9c  ldr   x11, [x10]
0x1aa0  b     0x1a6c
```

## Complete CFG and effects

Block ranges below are offsets relative to the function entry; ends are exclusive. All direct successors remain within the 108-byte body. RET is the only external control transfer. There are no calls, indirect jumps, stores of pointer arguments to external memory, or unsupported instructions.

| Block | Successors |
| --- | --- |
| `[0x00,0x14)` | `0x40` if HS; `0x14` otherwise |
| `[0x14,0x24)` | `0x40` if LS; `0x24` otherwise |
| `[0x24,0x2c)` | `0x3c` if LO; `0x2c` otherwise |
| `[0x2c,0x34)` | `0x3c` if LO; `0x34` otherwise |
| `[0x34,0x3c)` | return |
| `[0x3c,0x40)` | `0x40` |
| `[0x40,0x4c)` | `0x60` if LO; `0x4c` otherwise |
| `[0x4c,0x60)` | `0x4c` if HI; `0x60` otherwise |
| `[0x60,0x6c)` | `0x34` |

Instruction-level register reads are X9, X10, X11, SP, X30, NZCV and TPIDRRO_EL0. Physical register writes are X9, X10, X11 and NZCV. On every normal-return path X10/X11 are reloaded from their saved values and SP never changes. Therefore only X9 and NZCV may differ on return. All X0..X8, X12..X30 and all SIMD/FP registers remain unchanged. The incoming BLR itself writes X30; that caller-side link effect remains part of the call model.

With S=incoming SP and T=TPIDRRO_EL0:

- The sole write is 16 bytes `[S-16,S)`, saving X10/X11. This is a red-zone scratch write with **no SP writeback**, not a new allocation. Those bytes are not restored to their previous contents.
- Return reads the same 16 bytes to restore X10/X11.
- It reads eight bytes at T-0x30 and conditionally T-0x28; one path reads eight bytes at the second loaded value minus 8. Interpreting these values as thread stack bounds is an inference; exact addresses and widths follow directly from the instructions.
- Probe paths read eight bytes at successive 4096-byte steps below S and at the final S-N, with N supplied in X9 in bytes. X9 is reduced in the loop. A zero/small N may still cause a read at/near S. These are reads, not writes or allocations.
- Loads can fault. The preservation claim is conditional on normal return and ordinary unmodified private stack scratch state. No runtime result, universal nonfaulting behavior or arbitrary-size allocation validity is claimed.

The compiler-rt fallback differs: no thread-state checks, no save/restore scratch store, one-byte probe reads, X10 left changed. It still preserves exactly the Arc-required X2/X8/X12 and SP. A conservative summary covering the extracted wrapper/fallback and inspected pthread body can preserve those required registers plus the normal callee-saved set, while treating other volatile state according to the specific path/binding. It must not label the probe memory-free or use it to prove allocation completion.

## Local linkage observations and remaining assumptions

`dyld_info` can inspect a selected cached image by its install path when no physical file exists. It reports:

1. `/usr/lib/libSystem.B.dylib`, arm64e UUID `BA6A669A-3BB9-3BC7-85E8-8F0C1E68351E`, reexports both `/usr/lib/system/libcompiler_rt.dylib` and `/usr/lib/system/libsystem_pthread.dylib`.
2. Selected cached libcompiler_rt, UUID `AA79151F-C19D-3C7C-92F8-B10F04D82C1C`, explicitly reexports `___chkstk_darwin` as `____chkstk_darwin` from libsystem_pthread.
3. The inspected **physical** pthread file exports `____chkstk_darwin` at the complete body above.

The SDK `.tbd` files independently name the triple-underscore compiler entry and four-underscore pthread entry. All underscore counts here are literal Mach-O symbol spellings; conflating them loses the wrapper/reexport distinction.

For Arc, retain the established exact import/GOT association at `0x104237440`, validate the import library/ordinal and reexports, and rule out another target through interposition or an overwritten GOT slot if claiming exact implementation binding. The snapshot design may instead adopt an explicit trusted Darwin probe ABI profile supported by these versioned installed implementations, with its external trust boundary clearly stated. The current local implementation is not automatically the implementation on every OS Arc can run on.

No full dyld cache was extracted. Only two small selected images were disassembled (libcompiler_rt text 11152 bytes and physical pthread text 43776 bytes), plus six tiny selected archive members. All binary excerpts remain ignored in `.cache`; the follow-up JSON retains hashes, exact function bytes/instructions, CFG/effects, command/source identities and paths. `design.md` and its earlier artifact index remain the dated baseline.
