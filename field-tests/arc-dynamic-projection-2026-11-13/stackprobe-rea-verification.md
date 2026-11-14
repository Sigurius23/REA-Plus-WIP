# Public verification of the installed stack probe

Date: **2026-11-13**, Europe/Berlin. This follows the separately retained
[local implementation proof](darwin-stackprobe-followup.md). It validates a
selected installed OS dependency, without establishing Arc's runtime binding.

The ARM64 slice of `/usr/lib/system/libsystem_pthread.dylib` was copied into
an ignored workspace cache after checking the original and slice hashes.
Public REA+ with Ghidra 12.1.4 / JDK 27 inspected the declared export at
`0x1a38`, then read its 108 bytes. Neither the library nor Arc was executed.

The recorded function has **108 body bytes, 27 instructions, nine basic blocks
and no direct callees**. Its code SHA-256 is
`ddd4554e5a02372157751809c47b011a319814d1d14770fff1fa1b9316b9fd31`,
matching the independent local derivation exactly. The selected slice SHA-256
is `43756d45392a07e265a4a2a772fa30e992dc048069be110c49c959462a864877`.

The five-call public pass exports its two-record bundle, closes successfully
and reports verified empty owned descendants.
[Function Evidence](stackprobe-rea-evidence/installed-stackprobe.evidence.json),
[byte Evidence](stackprobe-rea-evidence/installed-stackprobe-bytes.evidence.json),
[verification receipt](stackprobe-rea-verification.json).

The normal-return preservation proof remains a derivation from the complete
instruction/CFG observations: X2/X8/X12 and SP are unchanged, X10/X11 are saved
and restored through `[SP−16,SP)`, and X9/NZCV may change. Thread-state and stack
reads may fault. The archive wrapper and nominal reexport chain have their own
recorded effects and binding limits. This does not add a producer call summary,
recover Arc's reducer cases or prove which OS image a running Arc process uses.
