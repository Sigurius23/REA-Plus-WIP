# Swift fixed-layout reducer dispatch probe

Date: **2026-11-08**, Europe/Berlin. Source parent:
`5d194de15e0dc1aba06229fee0241659bd6a0338`.

This owned compiler probe tests the omission observed in Arc's nested Boost
reducer at **`0x1012a5bc8`**. The selected Arc helper at **`0x1012b2860`** reads
the tag from a fixed-layout payload and spill representation; the initial
`abi-signed-word-cfg-v1` recovery accepts a narrower runtime-tag/accessor profile.
This is an extension gap, not a regression of that existing profile.

Owned Swift inputs were compiled with **Apple Swift 6.3.3**, then inspected
through real public REA+ SDK MCP with **Ghidra 12.1.4 / JDK 27**. Neither the owned
functions nor Arc was executed. Compiler commands, source/binary hashes, original
disassembly and symbols are retained in the [capture directory](arc-reducer-dispatch-probe-2026-11-08/).
Binaries remain outside Git.

## Public producer observations

| Owned input                        | Independent source/layout oracle                                   | Public REA+ result                                                                                                                      |
| ---------------------------------- | ------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------- |
| Resilient nested enum, `-Onone`    | 18 payload + 12 empty cases; signed 32-bit table                   | All **30** distinct case callees, one 30-entry recovered table, complete **2,168-byte** observed body                                   |
| Fixed-layout nested enum, `-Onone` | 11 payload + 13 empty cases; signed 32-bit table                   | **0/24** case callees, no recovered table, **336-byte** observed body within a larger enclosing span; explicit unrecovered-jump warning |
| Fixed-layout nested enum, `-O`     | 24 cases; byte table; exact seven-instruction Arc tag-helper shape | **0/24** case callees, no recovered table, **252-byte** observed body; explicit unrecovered-jump warning                                |

Each Program reports completed auto-analysis under the selected 15-second
policy. The fixed-layout omissions therefore are not explained by the original
Arc run's partial auto-analysis deadline. The optimized byte-table form remains
outside this investigation's proposed signed-word repair scope.

Selected Evidence:

- Existing-profile control:
  `ev_4af3105133069806545e6531873d64f1ff74a0501a1e5372c18a3b7a26891ba1`.
- Fixed-layout signed-word omission:
  `ev_0c52188dd6120d84919d92ff9dae9f70735abab2d2b17aa52a7a5eeae632be4a`.
- Fixed-layout optimized omission:
  `ev_c5213af17731022f18f97034da28a07fa379dd5254e746128884df80bf44af93`.

The [verification receipt](arc-reducer-dispatch-probe-2026-11-08/verification.json)
checks the retained output against known case counts, table metadata and body
ranges. All **19 public calls** succeed across three sessions, each closing with
verified empty owned descendants. These are static analysis observations, not
runtime result oracles.

## Why the helper alone cannot bound the switch

The [metadata/helper proof](arc-reducer-dispatch-probe-2026-11-08/fixed-layout-proof.json)
retains a non-generic fixed enum descriptor, its static metadata back-pointer,
value-witness table and declared `getEnumTag` entry. Its declared payload/empty
counts agree with its reflection field count and 156-byte value size. The owned
optimized helper's seven instructions equal Arc's retained helper instructions.

A second owned source, `Ambiguous.swift`, is a counterexample to treating that
helper as an enum identity: two local enums with **24** and **25** total cases
share the same 11-payload tag implementation. One declared getter branches to
the other getter's body. Matching the direct address or complete helper bytes
cannot distinguish their valid total tag ranges. This counterexample is
compiler/linked-byte evidence; it was not executed or presented as a separate
public Ghidra analysis.

## Required recovery proof

A safe extension must establish the **caller input's enum identity**. For the
Arc shape, a possible route is the metadata-backed outer enum tag, its selected
active case and reflected payload type, followed through proved value copies
and projection to the inner helper argument. The proof must also retain frame
privacy: an earlier unproved call can retain a frame pointer and invalidate
later spill assumptions. Recognizing a pure tag helper does not waive that
condition.

The proposed recovery remains limited to validated signed 32-bit tables,
metadata/field-count agreement, bounded complete helper bodies, unchanged
32-bit tags and the existing target/body ownership checks. Shared/folded getters,
unsupported payload manglings, uncertain aliases and unknown call effects must
remain rejected. Table length and neighboring symbols must not supply a count.

No REA+ implementation change or successful repair was claimed by this initial
probe. The following bounded implementation experiment supersedes that status
for one owned copy shape; Arc's exact projection remains an open dependency.

## Follow-up: typed private-copy recovery, 2026-11-09

A separate borrowing/noncopyable outer enum fixture makes the caller's type
and its fixed frame copy explicit. Its two inline child enums deliberately
have different total case counts while sharing the tag representation. The
producer first binds the selected outer tag to a direct reflected payload
descriptor, then validates that child's metadata, value-witness size, declared
getter and exact full `memcpy` into private frame storage. Equal helper bodies
do not choose the type or case count.

Two concrete compiler formats blocked the first experiments: a noncopyable
outer enum can be absent from `__swift5_types`, and a fixed child's constant
metadata accessor can use a five-instruction temporary/header-offset form.
The supported discovery follows an actual singleton-runtime caller and checks
the descriptor's accessor back-pointer; it does not search for names or guess
from neighboring bytes. Reflection kinds 2 and 3 retain matching-count checks.

The unchanged early 67,448-byte owned input, SHA-256
`36a71dc09b3c228d8c1b0b710c3dfe7f44326e602a80dc03c30921dbb0661029`,
changes from zero recovered tables / 256 observed bytes to one table with all
24 case callees / 736 observed bytes. See
[the retained typed observation](arc-reducer-dispatch-probe-2026-11-08/borrowed-after-accessors/reducer.evidence.json).
Earlier failed development attempts are retained separately.

Review then tightened write effects, frame lifetime, load writeback and unknown
control flow. A stricter development pass also rejected the old dynamic-stack
control, so it is retained as a compatibility failure, not reported as a green
aggregate run. The final profile distinguishes the old runtime-tag lane's
documented private-frame assumption from the new lane's exact, non-increasing
stack proof. See the [implementation and regression report](arc-dispatch-load-2026-11-09.md)
for final verification and its precise boundary.

Arc's selected reducer still uses dynamic stack allocation and inline SIMD
projection rather than this exact private `memcpy` shape. Recovering an owned
fixture therefore does not close issue **55** or establish Arc's case effects,
durable persistence or readback.

The final read-only audit authenticates **42 standalone / 33 unique Evidence
records and 10 bundles**, including the separately retained development attempts.
The installed-engine v7 matrix passes **44 cases / 176 MCP calls / three CLI
comparisons** in the linked implementation report. The newer
[Arc-shaped probe](arc-dynamic-projection-2026-11-13/design.md) reproduces the
remaining second-argument, dynamic-stack and SIMD pattern; its conditional
156-byte audit and eight altered controls remain supplemental rather than
public recovery.
