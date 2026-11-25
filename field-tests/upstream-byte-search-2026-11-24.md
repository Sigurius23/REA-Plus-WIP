# Analyzed-memory masked byte search — qualified 2026-11-25

Item 62 now includes search_bytes and CLI search-bytes. Work began November 24;
engine qualification finished November 25. The implementation selectively adapts
upstream f7849cad3fe3bffb207b4dc30f34394978c20297 to REA+'s existing providers,
Evidence, ownership, checkpoint and original-file identity rules.

## Behavior and boundary

The new read searches initialized byte-addressed analyzed memory, including
loader fixups. scan_byte_patterns remains an original-file scanner. A match is
not a defined string or evidence of runtime use. Optional masks select bits and
?? selects a whole-byte wildcard; one bit must remain constrained. Caller
spelling remains in Evidence. The shared TypeScript owner validates the grammar
and compiles canonical masked bytes for the private bridge, avoiding competing
whitespace/wildcard interpretations at the socket boundary.

Bounds are inclusive. Adjacent eligible initialized blocks form a contiguous
run; gaps and excluded blocks end it. Default searches exclude unloaded memory
and loaded overlays, listed separately; explicit bounds select their space.
Uninitialized blocks are always excluded. Matches retain start address, starting
block, observed containing procedure and a unique original-target file offset
or null. A start offset does not establish a contiguous original-file span or
that loaded bytes equal original bytes. Larger addressable units are refused.

Page limit defaults to 100 and follows the bridge's signed array-index bound,
not an arbitrary 1,000-match cap. Actual memory/deadline/transport admission is
separate. The limit bounds matches, not scan work. Page coverage includes the
lookahead used to find continuation and can overlap the next page; skipped-block
inventories describe the selected query and can repeat. complete exhausts only
eligible memory.

Cursors bind target, full profile, canonical masked pattern, bounds, document
and Program generation after bridge preparation. Limits may change between
pages and equivalent masked spellings can continue. Metadata edits invalidate
old cursors; search uses live provider reads so immutable snapshot replay cannot
bypass validation. A mismatch identifies cursor, leaves the differing component
unknown, and does not claim target bytes changed. CLI continuations across the
same verified project/profile were checked with complete Evidence parity.

Public effects declare possible provider launch and private filesystem writes.
The tool is Ghidra-only; no target execution authority is added. Naming the
memory definitions explicitly also fixes the earlier array-map representation's
loss of exact named contract types; schemas no longer depend on catalog position.

## Confirmed defects fixed during qualification

**Incorrect original-file coordinates.** The existing address_to_file_offset
returned offset 0 for an auxiliary six-byte FileBytes source. That coordinate
belonged to the auxiliary source, not the target. The owned reproduction is
retained in mcp-offset-before. Both search and the mapping tool now share a
source rule requiring the full immutable original target and one unique mapping.
The auxiliary mapping is explicitly refused; the genuine target header still
maps to zero, and a real function maps to 1,120. This fixes the producer rule
rather than rejecting zero or repairing rows downstream.

**ENOSPC hidden as a generic failure.** Running a cold Arc import alongside the
package update exhausted the host volume. The Arc bridge returned
bridge_exception with IOException: No space left on device, while the adapter
reported execution_failure. The bridge now classifies positive native I/O
capacity exceptions into disk_exhausted; the adapter maps that owned code to a
disk resource constraint with capacity remediation. It does not infer exhaustion
from arbitrary remote strings, filename text, stale logs or current free space.

The actual pre-fix Arc failure and failed package update remain captured. About
266 MiB of generated Turbo cache was reclaimed. The user explicitly approved
clearing /Users/sigur/.npm/_cacache; npm cache clean completed without removing
installed packages, and the volume then had about 6 GiB free. Serial Arc replay
and the release package gate passed. No other research inputs/evidence were
deleted. We did not deliberately fill the host volume to retest ENOSPC.

The controlled Java producer oracle covers four positive exception/cause cases
and six negatives, including misleading paths, other I/O errors and a cause
cycle. The public MCP boundary verifies the resulting resource projection. Its
first script-classpath attempt failed; isolating all required Java sources in
one disposable script directory fixed the verifier. Exit status alone would
have missed the Ghidra script failure, so its explicit oracle marker is required.
The earlier malformed-pattern test assumed every SDK refusal was JSON; it now
checks the SDK's validation response and absence of provider admission.

## Qualification

| Check | Result |
| --- | --- |
| Domain/provider tests | 84 passed |
| CLI/MCP boundary tests | 6 passed |
| Native disk-classification producer | 10 controlled cases passed |
| Release public MCP | 40 calls: 35 successes, 5 expected refusals |
| Release CLI | 10 calls: 7 exact MCP Evidence pairs, 3 pre-admission refusals |
| Frozen runtimes | Four generations of 1,896 files; source/deletion commitments retained |
| Package | Installation/update/skill readback; 207 tools and 6 prompts passed |
| Other gates | Type/lint, docs and discovery of all 971 tests passed |
| Existing evidence | 30 historical snapshots authenticated at original commits |

The owned fixture Program contains three adjacent two-byte blocks, an
uninitialized gap, an overlapping A1 sequence, a loaded overlay, unloaded OTHER
memory and an auxiliary FileBytes-backed block. It was prepared externally as
a known test oracle; all reported search/mapping results come from public REA+
CLI/MCP. The source-built target was reused from the previous study and never
executed. Its SHA-256 remains
7591fdfaf870b9c7ad2b398163b5c6cbb02cbc41c52273f232764b977882097a.

Public results prove cross-block matching, exclusion across gaps and an inclusive
end inside a signature, all four overlapping two-byte matches across three
pages, five masked matches across equivalent spellings, explicit overlay and
unloaded searches, exclusion inventories, correct source offsets, cursor binding
refusals and metadata-generation invalidation. Repeated identical mock-provider
queries are reobserved rather than replayed. The seven release CLI/MCP pairs
compare complete Evidence, including cross-process continuation.

Arc's fixed input remains SHA-256
6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578.
The new bridge creates a new profile/checkpoint namespace. Its 2,537 seeds and
one-second partial-analysis policy remain selected. Exact and masked queries
find the known reducer start; two pages reconstruct all 12 zero bytes in the
selected 128-byte window. The complete reducer normalized result equals the
previous study exactly: 10,072 bytes and 2,518 instructions. Its Evidence ID
changes because the committed bridge/profile changes; old IDs are not reused.

[The verification receipt](upstream-byte-search-2026-11-24/verification-qualified.json)
binds frozen source/runtime hashes, complete replies, bundles, fixtures,
expected refusals, source-offset regression, CLI parity, the Java producer and
owned process cleanup. Failed capacity runs remain failures rather than being
counted as successful analysis. The failed package attempt records workspace
cleanup but has no final lineage receipt; the successful release gate supplies
its own verified empty lineage. Research files are text; native targets,
databases/checkpoints, dist and dependencies remain outside Git.

## Limits and next work

Real-provider qualification is macOS Ghidra 12.1.4. Word-addressed memory and
other provider/host lanes were not exercised live. Other providers do not gain
support merely from the new contract. Independent live-model tool-selection
trials were not performed. Metadata and skipped memory remain qualified; byte
search does not make incomplete analysis complete.

Next upstream work is decompile_all / bulk export, followed by the other item 62
groups. Full Arc feature recovery and Client unknown revision 3 remain open.
Arc, its helpers and shipped JavaScript were not executed. No profiles, accounts,
UI, services or recovered URLs were used.
