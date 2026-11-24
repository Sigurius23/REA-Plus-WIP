# Owned Ghidra checkpoints — 2026-11-24

Item 62 now has an opt-in native checkpoint workflow. Set
`REA_GHIDRA_CHECKPOINT_DIR` to an absolute private directory (0700), then use
ordinary CLI/MCP native analysis. REA+ saves initial analysis and each
acknowledged metadata edit. A new session restores a verified private packed
Program without auto-analysis. Source executables and caller-selected saved
projects remain unchanged.

This selectively adapts upstream `f7849cad3fe3bffb207b4dc30f34394978c20297`;
it does not replace the local provider, ownership framework or Arc fixes.

## Identity and ownership

The target SHA-256, full base analysis profile and packaged Java bridge digest
select a checkpoint. The base includes Ghidra version, seeds, language and
bounded-analysis policy. A warm profile additionally binds the selected packed
Program filename/hash and original analysis-completion flag. The bridge stores
and verifies that flag inside the Program; restoration cannot turn the original
timeout into completed analysis or reapply original seed names over edits.

One publisher owns an exclusive private directory lease. It exports into the
owned runtime, syncs the immutable blob and manifest, replaces `current.json`
atomically and syncs its directory. Publication and failed descriptor/staging
cleanup retain their owners. A successfully published annotation reports
`effects.persists_after_close=true`. Default ephemeral annotations still report
false. Failed export/publication can follow an already committed in-memory
edit, so success and persistence are never inferred from mutation alone.

After retirement, reopen to resolve saved state. A stale profile refuses a
changed checkpoint; corrupt state never falls back to fresh import. Automatic
crashed-owner lock reclamation is intentionally unsupported: preserve a stale
`publisher.lock` until the publisher is independently confirmed stopped, or use
a different directory. No PID-only ownership inference is used.

## Problems found and fixed

- Snapshot invalidation previously followed only successful mutations. A
  committed edit whose publication failed could therefore leave stale cached
  reads. Snapshots now retire when a mutation is admitted; the checkpoint
  client latches publication failure until close/reopen. A regression covers
  a committed edit with a failed acknowledgement.
- Public errors initially described a publication EACCES as read access and
  could flatten typed checkpoint capacity/configuration context. Final errors
  preserve the checkpoint-write boundary, system code and unconfirmed
  persistence, with the public operation and truthful remediation. ENOSPC keeps
  its disk classification and does not recommend an unchanged retry.
- Discovery of an absent root below a symlinked parent could disagree with the
  canonical directory created at startup (macOS `/tmp`). Canonical parent
  resolution now happens without creating storage during discovery; the
  original configured spelling remains in the profile. The final real owned
  run uses `/tmp`, while its admitted storage resolves under `/private/tmp`.
- Checkpoint admission now uses the existing startup cancellation/deadline
  projection and retains nested failed-close resource coordinates.

The raw `mcp-publication-refusal` capture preserves the earlier misleading
error. `mcp-publication-refusal-final` proves the corrected behavior. Its
controlled write-permission failure refuses the edit acknowledgement and the
next read. After permission repair and close/reopen, the former saved name and
instructions return exactly; the unconfirmed rename is absent.

## Qualification

| Check | Result |
| --- | --- |
| Source/domain/composition tests | 118 passed |
| Lifecycle/launcher/project boundary tests | 57 passed, 1 Windows-only skip |
| Final frozen-runtime public MCP | 36 calls: 33 successes, 3 expected refusals |
| All preserved MCP generations | 86 calls: 81 successes, 5 expected refusals |
| Public CLI | 6 calls: 4 successes, 2 expected configuration refusals |
| CLI/MCP | Two complete Evidence records match exactly |
| Historical evidence | 27 prior snapshots authenticated against their original commits |
| Build/type/lint/docs/package | Passed; packaged catalog contains 206 tools |
| Owned process cleanup | 12 captured verifier lineages are verified empty |

The owned fixture is the previously source-built C executable documented in
[the prior study](upstream-ghidra-projects-2026-11-24/owned-build.json), SHA-256
`5506701a7de07d89c2ba3dde0b0893da146364812d818882c6af288bd77f039c`.
It was analyzed, never launched. A seeded function was renamed/commented,
closed and restored. Both MCP and CLI edits survive reopening. Changing seed
content/path selects new analysis rather than restoring the earlier annotation.
Corrupt packed bytes and incompatible checkpoint/project configuration are
explicit refusals. Original executable and source hashes were rechecked.

The Arc input remains the fixed arm64 slice, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`,
with the existing 2,537-function seed overlay and one-second analysis budget.
Cold and restored normalized results match exactly: the reducer at
`0x1012a571c` has 10,072 bytes and 2,518 instructions. Both report the original
partial analysis. The final cold query including initial publication took
57.0 seconds; the restored query took 10.4 seconds on this run. These timings
are observations, not a general speed guarantee.

Four frozen runtime generations and their source/runtime hashes preserve the
qualification sequence. `runtime-final-manifest.json` binds the final 22
changed/new source files and 1,884 packaged files. See
[the verification receipt](upstream-ghidra-checkpoints-2026-11-24/verification-final.json)
and its replay script, raw replies, bundles, CLI outputs and test logs. Packed
Programs and disposable provider projects remain local, outside Git; this
text evidence is not a portable Ghidra database.

## Remaining scope

Linux/macOS ELF/PE/thin Mach-O with seeds, language overrides and bounded
analysis is qualified. Optional analysis extensions, Windows and special
loaders are refused in checkpoint mode. Automatic route refresh after
retirement and automatic stale-lock recovery are separate work. Remaining
upstream native inventory/batch pages are next in item 62.

Arc itself, its helpers and shipped JavaScript were not launched. No profiles,
accounts, UI, services or recovered URLs were used. This improves repeated
static analysis; the broader Arc feature investigation and Client unknown
revision 3 remain open.
