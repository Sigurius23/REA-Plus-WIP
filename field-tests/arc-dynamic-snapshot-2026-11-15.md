# Dynamic Swift payload projection and probe-import admission

Status: **recovery and response repairs verified, 2026-11-15**. The v9
recovery matrix passes all 102 cases and 13 CLI/MCP comparisons. Arc now
recovers all 28 exact switch targets and a contiguous 10,072-byte function.
An evidence-text follow-up also restores its complete inline MCP response.
These close the bounded tool gaps; case effects, persistence and app-wide Arc
feature recovery remain separate work. No supplied app, library or shipped
script was executed.

## What the new representation proves

The new lane begins with a typed snapshot at an exact Swift runtime outer-tag
call. It does not infer correct initialization from an unknown earlier copy.
Its explicit premises are a recursively valid active outer value at that
call's normal return, stable ABI metadata and imported-call/GOT bindings,
ordinary nonwrapping monotonic stack allocation, live source/destination until
the pure child getter, and no asynchronous interference through dispatch.

Within those premises, a separate forward register/stack domain proves:

- The current SP is the last allocation, whose `align16(N)` extent comes from
  the same outer metadata value's VWT size used at the tag call. Earlier
  unknown extents supply only monotonic upper bounds.
- All paths reaching the child getter select one reflected direct outer
  payload case. The existing forward analysis still rejects unresolved outer
  exits; a backward ancestor window cannot discard an unknown incoming flow.
- The fixed destination is live and disjoint from the dynamic source. Inline
  Q-register loads/stores account for all 156 bytes, including the overlapping
  tail at offset 140. Register aliases and conflicting writes kill origins.
- The declared child metadata, value size and complete pure getter agree.
  Shared getter bytes never establish the child's identity or case count.
- A separate getter-to-dispatch window rejects unknown calls, SP changes,
  foreign/bypass entries and unmodeled stores, including effects on previously
  escaped aliases of a spilled tag.

Earlier memory history is discarded. The result does not establish preceding
copy/witness correctness, pre-tag nonescape, ownership, retention, later
lifetime behavior, actual runtime binding or source-level case effects.

Review caught and repaired draft false-recovery paths involving a zero-register
forgery, Ghidra's `zN` base aliases for partial SIMD writes, an escaped tag spill
across a later call, and an unresolved outer exit excluded by the backward
window. Each has an owned rejection control. These draft findings were caught
before publishing this implementation.

## Probe identity without unrelated relocation admission

The v8 import lookup exhausted its 100,000-record budget over all relocations.
The [original-byte count](arc-dynamic-snapshot-2026-11-15/probe-import-count.json)
finds 329,896 Arc chained pointers but only 8,039 import records. Public Ghidra
[loader diagnostics](arc-dynamic-snapshot-2026-11-15/arc-loader-chain-count.json)
independently report 329,896 discovered/fixed-up pointers. Installed Ghidra
source adds a relocation for each fixup; this is not a direct live
relocation-table query.

The replacement checks bounded original chained-import records, the identical
loaded header/load commands, one exact raw name and positive original library
ordinal. It retains unique imported external identity and the selected applied
slot, exact ordinal, loaded pointer and reference checks. Mixed classic
bindings, external/section relocations, normalized raw-name collisions and
nonzero format 2/3 import addends reject the summary. The addend guard accounts
for Ghidra 12.1.4 parsing but omitting those import-table addends when applying
the pointer.

An unchanged owned image containing 100,111 chained pointers reproduces the
admission gap. Public MCP results change from **zero tables / 296 function
bytes under v8** to **one table with all 24 exact mappings / 776 bytes under
v9**. Both five-call sessions export, explicitly close and verify empty owned
lineage. The binary SHA-256 is
`82f36c50bc5d4cae470f0926d991e0e13432e5c11406322320f84562915df5d5`.
See the [comparison](arc-dynamic-snapshot-2026-11-15/large-rebase-comparison.json).

## Verification boundary

The 102-case recovery-matrix Java SHA-256 is:
`9717688d73a8913fad46891c41a79b1babba5587202baeca7e8108a650c4df34`.
The [source freeze](arc-dynamic-snapshot-2026-11-15/final-source-freeze.json)
records the uncommitted implementation against predecessor `325702b06`.
Java compilation, the cached runtime build, 42 profile source tests, formatting
and the final fast gate passed. The earlier first positive and D-register
clobber rejection are preliminary native records under the earlier producer;
they do not substitute for final-profile coverage.

The final serial run passes **102 distinct cases: 15 positives and 87
rejections**, comprising 29 dynamic snapshot, 29 probe and 44 prior baseline
cases. All 13 selected CLI/MCP comparisons pass and the final owned lineage is
verified empty. Compiler/oracle artifacts alone are not native verification. Catalog bytes are retained per identity and cloned into each
case on APFS, preserving the advertised catalog without duplicate storage.

The [canonical audit](arc-dynamic-snapshot-2026-11-15/evidence-audit.json)
passes: 212 unique records, 226 raw Evidence representations and five bundles,
including the separately labeled historical attempts and unchanged large-rebase
comparison. All 1,002 [manifest](arc-dynamic-snapshot-2026-11-15/text-manifest.json)
entries matched on readback. Binaries, modules, caches and provider projects
stay outside Git. The full `check:pr` gate was not rerun.

## Actual Arc recovery and inline response

Canonical `analyze_function` Evidence
`ev_583079470e74897be835bc992f7970146808dc6ced3ae7dc423c29725672acc6`
recovers all 28 signed-table destinations, matching the independent 112-byte
capture. The body covers `0x1012a571c..0x1012a7e73`, all 10,072 bytes and
2,518 instructions; all targets are owned and covered. Pseudocode contains all
28 cases. [Coverage receipt](arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/reducer-coverage-observation.json).
This does not make the high-p-code trace complete: its 3,000-operation provider
limit and eight synchronous-throw uncertainties remain explicit.

That complete analysis initially exceeded the 10 MiB MCP response budget. The
first recorder incorrectly stopped before exporting retained Evidence. The
next session exported it through the public tool and continued smaller queries;
both attempts remain unchanged in this directory.

The shared roughly 11 KiB type/byte/ABI proof was repeated in every mapping as
well as its table data source. The follow-up keeps each mapping's tag/name,
word address and target evidence, referring to the full proof already owned
by that data source. This changes evidence text only; the recovery code is
unchanged. Java SHA-256 is now
`558e14b134d1236bb9101296efd0844db382d7b5428f459ef8330fe3be19ba48`.
The [runtime diff](arc-dynamic-snapshot-2026-11-15/arc-v9-inline-retest/producer.diff)
and manifest authenticate the single changed file.

The same Arc bytes now return full inline Evidence
`ev_7820ea6368f520cd61483866fba5814ed0c4a1661bb9cc22d4c6f15a6806a139`:
serialized reply **9,298,190 bytes**, below the unchanged 10,485,760-byte budget.
Exact body/mappings, full shared proof and limitations agree with the exported
result. Both explicit closes succeed and descendants are verified empty.
[Comparison](arc-dynamic-snapshot-2026-11-15/arc-v9-inline-retest/comparison.json).
The 102-case matrix was not repeated for this rendering-only change. Java
compilation, package smoke verification (205 tools / six prompts), fast and
built-documentation checks pass. An earlier sandboxed package attempt failed
on npm network/cache access; the authorized host rerun passes and both logs
are retained.
