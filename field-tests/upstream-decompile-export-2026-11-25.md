# Native file-backed decompilation — 2026-11-25

Item 62's decompile_all / bulk-export review and selective integration are
complete. Upstream's audited implementation at f7849cad3fe3bffb207b4dc30f34394978c20297
adds a distinct outcome: function files and a small manifest rather than an
in-memory batch of pseudocode. REA+ now supplies that outcome through
decompile_all and CLI decompile-all, using the local session, Evidence and
cleanup owners. This is a selective implementation, not an upstream tree merge.

## Behavior

The workflow selects the provider's analyzed procedure inventory, with an
optional literal name filter, inclusive entry-address bounds and a per-call
attempt limit. Aliases participate in filtering before canonical coordinates
collapse. New functions precede recorded failures on resume. Inventory-declared
external functions produce no file. Null pseudocode stays unavailable; ordinary
per-function errors remain individual records. Cancellation, configuration,
startup, resource and unsafe-cleanup failures stop admission.

A fresh absolute output directory must be absent and have an existing parent.
It contains an identity header, functions/, immutable attempt records/ and a
derived decompile-index.json. The index keeps exact labels, coordinates,
locations, source caveats, file hashes/lengths and outcomes, without pseudocode.
The manifest returns counts, identity, index path/digest and limitations inline.
Function filenames use SHA-256 of the canonical entry coordinate; records
supply their relative paths. Bodies preserve UTF-8 provider text, not source
files or inferred compilation units.

Resume requires known and matching target SHA-256, provider and committed
profile. It hashes stored bodies and refuses changed/missing files. Unrecorded
files remain conflicts, never adopted or overwritten. Completed output survives
failure. A body published before its attempt record can remain an orphan after
a crash; this is explicit. A crash can also leave a stale exclusive lock, which
is not automatically reclaimed. Immutable attempts avoid a torn append journal.
The index is the latest derived view and is rewritten by subsequent calls;
earlier manifest hashes describe their earlier views.

Session-owned resources retain descriptors, staging and directory locks until
release succeeds. Staged/published file identity, extent and digest are checked;
post-publication failure does not authorize deleting committed output. A
verified record updates the completed prefix before later cleanup can fail.
Directory identities are checked around operations, with the documented Node
syscall-boundary pathname-race limit.

Transient export reads can reuse existing immutable observations but do not add
new pseudocode bodies to the ledger/snapshot. The export workflow never replays
a snapshot. Known session metadata mutations block export until reopen, including
mutations admitted during an in-flight read. A checkpointed reopen can bind the
saved generation. External/untracked database edits that leave the profile
unchanged cannot be detected; callers must choose a new export after such edits.

The initial slice implements address layout. Upstream independent-context retry
and requested debug-layout fallback were not copied: local providers do not
expose the corresponding typed failure/compilation-unit facts. batch_decompile
continues to serve explicit ordered selectors, repeated entries and inline
retained bodies.

## Verification

| Check | Result |
| --- | --- |
| Selected suites | 50 tests passed across six files |
| Real Ghidra MCP | 18 calls: 17 successes, one expected existing-directory refusal |
| Real CLI | Two complete Evidence pairs; all eight export files identical |
| Runtime snapshot | 1,899 files and 27 source commitments |
| Arc pseudocode | All 63,696 code units equal the earlier 16 retained pages |
| Arc instructions | Complete normalized reducer unchanged: 2,518 instructions / 10,072 bytes |
| Existing evidence | 31 historical snapshots authenticated |
| Gates | check, docs:check, 973-file test discovery and verify:package passed |
| Installed package | 208 tools, six prompts, setup/update/skill checks and empty owned lineage |

Real-engine scope is macOS Ghidra 12.1.4. The source-built owned target was
reused without executing or recompiling it; its SHA-256 remains
7591fdfaf870b9c7ad2b398163b5c6cbb02cbc41c52273f232764b977882097a.
Its entire four-entry inventory exports three bodies and one external entry.
Limited calls advance through new entries; the final resume skips all four.
The retained-pseudocode summary reports zero matching records, confirmed against
the complete exported Evidence bundle.

Arc retains the exact fixed target SHA-256
6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578,
2,537 seeds and original one-second partial-analysis policy. The inventory has
11,330 entries; this qualification selects the known reducer, rather than
decompiling every Arc procedure. The restored checkpoint remains partial.
The new reducer Evidence is
ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45.
Its normalized result exactly equals the earlier
ev_0ce685855002b648c93adabdad1131098db098d95498e881e4f56186a5046b94.
Only the profile's checkpoint source changes, from null on the previous cold
import to the verified saved generation on restore; new Evidence identity is
therefore expected. CLI and MCP use the same restored context and match fully.

The [verification receipt](upstream-decompile-export-2026-11-25/verification.json)
checks runtime/source hashes, actual target identities, output/index digests,
retention, complete CLI/MCP equality, historical artifacts and empty verifier
lineages. The raw plans, replies, bundles, output text and scripts are retained.
Native binaries, Ghidra databases/checkpoints, dist and dependencies stay outside
Git. Arc, helpers, shipped JavaScript, accounts, profiles, UI and services were
not executed or used.

## Problems encountered and addressed

Development checks caught a lost resource scope in the MCP progress wrapper,
unsafe assumptions about staged-file identity and completed-prefix loss after
successful publication followed by cleanup failure. All were fixed at their
owning boundaries and exercised through public MCP or filesystem controls.
Session tests also pin 64 sequential transient reads without retained body
records, cleanup retry and mutation admission/in-flight refusal. Initial captures
and corrected runs remain separate; mistaken error-code expectations were test
corrections, not product failures.

The broader check gate found an unused analysis-view error re-export; its owner
remains intact and the unused alias was removed. An exploratory cleanup suite
also had two Hopper startup failures before its tested behavior, including a
direct Hopper start independent of the session. Its log is retained; those
cases are not counted as passes or real-Hopper qualification. The final selected
50-test suite and real-Ghidra/public export lanes pass. Other hosts/providers and
independent live-model tool-selection trials remain unverified.

This closes the selected bulk-export integration block, not full Arc feature
recovery or all upstream additions. Item 62's separately listed checkpoint
extensions/host work, firmware readers/CPU lanes and other tool families remain
open. Arc's Client-selection unknown revision 3, durable persistence and broader
browser feature tracing remain open.
