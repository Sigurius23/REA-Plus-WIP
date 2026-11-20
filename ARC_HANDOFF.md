# Arc / REA+ handoff — preserved 2026-11-20

## Start here

Continue the user's **offline Arc reverse-engineering investigation**. Work
autonomously, document actual REA+ problems in `OPEN_TASKS.md`, fix confirmed
problems, and publish completed work to the existing WIP repository. Do not
declare the full Arc investigation complete: reducer recovery is repaired,
but durable persistence and broader browser features still need tracing.

Repository root:

```text
/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3
```

Read `rea-local/AGENTS.md`,
`rea-local/.agents/skills/reverse-engineer-anything/SKILL.md` (version 43),
`OPEN_TASKS.md`, and `field-tests/arc-analysis-dossier-2026-11-08.md`.
The REA skill explicitly requests independent delegation in step 6; use
distinct scopes when workers are available. Workers hit usage limits during
this run. Their written artifacts survive; do not depend on their chat memory.

**Do not launch Arc, its helpers or shipped JavaScript. Do not visit recorded
URLs, use accounts/profiles, submit requests to its services, or collect live
UI/runtime behavior.** Owned source fixtures were compiled and analyzed, never
executed. The earlier HeyClicky UI permission does not authorize Arc execution.

## Pre-upstream preservation checkpoint (2026-11-20)

The user authorized saving the Arc baseline, then a focused integration of
upstream Ghidra persistence/retained results. Source remains pinned to
`70d5dd7d1e17b380420c7eb75c37abe1e189134a` at this checkpoint. The retained
text captures, reproducible sources, field reports and dossier are committed
together before provider changes. Their pre-integration digest inventory is
`field-tests/arc-baseline-2026-11-20/manifest.json`; the supplied DMG, cached
native slices, compiled fixtures, frozen runtimes and provider projects remain
local. No Arc code or shipped script has been executed.

Use the Git tag `arc-baseline-before-upstream-2026-11-20` to return to the saved
source/research state. The historic session outcomes and next semantic work
below still apply. Later integration notes must state which upstream features
actually passed local qualification. Broader upstream parity is a separate
backlog in item 62; it must not block the bounded Arc-focused update.

The following November 16 Git/publication account is historical; its source
commit is already pushed. This checkpoint saves the previously untracked
supporting material locally before integration.

## Git and approval state (historical November 16)

- Local `main` HEAD is **`70d5dd7d1e17b380420c7eb75c37abe1e189134a`**,
  `feat: recover dynamic Swift payload dispatch`.
- Its push to `Sigurius23/REA-Plus-WIP` **succeeded**:
  `325702b06..70d5dd7d1 main -> main`.
- A subsequent direct SSH `ls-remote` was **not executed**: automatic approval
  review hit its usage limit. The rejection explicitly said this was a review
  failure, **not a determination that the action was unsafe**. It reported a
  reset at 4:25 AM. Do not bypass that approval check with another execution
  route. Push acknowledgment exists; independent final remote readback does not.
- Only two tracked files remain modified: `OPEN_TASKS.md` and
  `field-tests/arc-analysis-dossier-2026-11-08.md`. Many **new field-test notes,
  captures and this handoff are untracked and not yet committed/pushed**.
- Some registry wording still says publication pending. The source fixes are
  already published in `70d5dd7d1`; the new supporting notes/captures are not.
  Reconcile this distinction before the documentation checkpoint.
- Prior pushed checkpoints: `325702b06` retained v8 proof/retest;
  `5628ef81c` introduced bounded Darwin probe effects;
  `076c706c6` repaired cleanup ownership across retries/startup rollback.

Git mutations/network verification use the normal approval mechanism. The
usual push command is:

```sh
GIT_SSH_COMMAND='ssh -o ConnectTimeout=20 -o BatchMode=yes' git push origin main
```

Never stage the supplied DMG, `.cache`, binaries, provider projects, modules,
or the two intentionally local large Rize JSONs. Source-built `.swift`, `.s`,
oracles, raw public replies and canonical text Evidence are appropriate proof
materials. Inspect staged blob sizes before pushing; GitHub's 100 MB file cap
and earlier LFS quota exhaustion matter here.

## Verified implementation — do not repeat the full matrix

Items **55, 60 and 61** are implemented and verified within their stated scope.

1. **v9 typed dynamic snapshot recovery.** A metadata-bound current-SP
   allocation, selected outer payload, all 156 SIMD byte origins, disjoint/live
   regions, pure getter, and closed getter-to-dispatch window recover the child
   switch. Explicit recursive-value/ABI/linkage/nonwrapping/stability premises
   remain. Earlier copy correctness, ownership and actual runtime binding are
   not proved.
2. **Original import admission.** Scan the bounded original chained-import
   table instead of spending 100,000 queries on unrelated relocations. Preserve
   raw names, unique original ordinal, zero import addends, loaded header,
   external identity and exact selected-slot checks. Reject normalized-name
   collisions and mixed unsupported binding carriers.
3. **Shared proof rendering.** Keep the complete roughly 11 KiB proof once at
   the table's data source; mapping evidence retains tag/name, word address and
   target and refers to that shared proof. This fixes unnecessary MCP response
   overflow without raising the budget or removing assumptions.

The recovery matrix passed **102 distinct real Ghidra cases: 15 positives,
87 rejections, 13 CLI/MCP comparisons**. Final owned descendants were verified
empty at `2026-11-15T13:26:31.461Z`.

Recovery-matrix Java SHA-256:

```text
9717688d73a8913fad46891c41a79b1babba5587202baeca7e8108a650c4df34
```

Current/published Java SHA-256 after the evidence-text-only follow-up:

```text
558e14b134d1236bb9101296efd0844db382d7b5428f459ef8330fe3be19ba48
```

The runtime diff proves the follow-up changes only mapping proof rendering;
all recovery code is unchanged. The 102-case matrix was not repeated for that
text change. A real unchanged-Arc comparison verifies identical mappings,
body, complete shared proof and limitations, with a successful inline reply.

Other checks passed: Java compilation; 42 profile source tests; formatting;
fast typecheck/lint; built-documentation checks; package smoke verification
with **205 tools / six prompts** and verified empty lineage. An initial
sandboxed package test failed on npm network/cache access; its authorized host
rerun passed. Both logs remain. Full `check:pr` is optional here and was not
rerun. Do not spend another hour repeating already-green native checks unless
a new semantic code change justifies it.

Proof root (`R` below):

```text
field-tests/arc-dynamic-snapshot-2026-11-15/
```

Read its companion report `field-tests/arc-dynamic-snapshot-2026-11-15.md`.
Important receipts:

- `R/evidence-audit.json`, `retention-index.json`, `text-manifest.json`:
  **212 unique Evidence records, 226 raw representations, five bundles;
  1,002 manifest entries / 243,417,192 bytes authenticated**.
- `R/retained/`: text-only final matrix plus separately labeled historical
  first positive/D-alias rejection; no binaries or projects.
- `R/final-source-freeze.json`, `final-source/`: exact 102-case producer and
  verifier snapshots. Verifier SHA starts `1930838735f94c3f`.
- `R/large-rebase-comparison.json`: unchanged 862,864-byte owned binary;
  v8 zero tables / 296 bytes → v9 24 exact mappings / 776 bytes. Both sessions
  explicitly close and verify empty lineage.
- `R/arc-v9-inline-retest/comparison.json` and `producer.diff`: current
  representation-only repair, same Arc facts, **9,298,190-byte serialized
  reply**, below the unchanged 10,485,760-byte budget; six successful calls,
  two explicit closes and empty owned lineage.
- `R/{package-final-host,docs-final,check-fast-final,source-tests}.log`.

Do not alter captured files or run a formatter across captures. New analysis,
corrections and manifests should be additive. Preserve failed attempts.

## Exact input and runtime

Original supplied package remains local/untracked:

```text
Arc-1.172.1-90370.dmg
SHA256 d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778
```

All current native findings concern this derived main ARM64 slice:

```text
rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64
80,498,448 bytes
SHA256 6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578
```

Do not transfer addresses from the older installed Arc 1.171.0 investigation.
The fixed 1.172.1 dossier records universal/Core identities as needed.

Pinned command environment (the login shell otherwise selects an older Node):

```sh
PATH=/Users/sigur/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/bin:/Applications/ChatGPT.app/Contents/Resources/codex-cli/codex-path:/usr/local/bin:/opt/homebrew/bin:/usr/bin:/bin
JAVA_HOME=/opt/homebrew/Cellar/openjdk/27/libexec/openjdk.jdk/Contents/Home
GHIDRA_INSTALL_DIR=/opt/homebrew/Cellar/ghidra/12.1.4/libexec
```

Node is 24.22.1; Ghidra 12.1.4; JDK 27. Install/upgrade nothing unrelated.
The package lives at `rea-local/`. Use relevant project scripts and installed
dependencies. Disk was about 9.4 GiB free at the last check; no user files were
deleted to obtain that space.

Frozen runtimes with existing locked `node_modules` symlink:

- `rea-local/.cache/arc-runtime-v9-9717688d`: old proof-rendering producer.
- `rea-local/.cache/arc-runtime-v9-compact-evidence`: current published producer.
- Each is authenticated by its corresponding `R/arc-v9-*/runtime-manifest.json`
  (1,865 files). Older v8 snapshots are also retained.

Do not change bridge Java or rebuild a runtime while a session using those
mutable files is active. Use immutable copies for concurrent investigations.

## Session settlement — no live session to inherit

The large working session `R/arc-v9-export-retry/` completed phases 0–7, then
its one-hour continuation wait expired. Latest summary:

- **99 calls / 90 successes / nine retained errors**.
- Nine errors are one expected large-response transport limit and eight
  explicit missing-function admission probes, not nine native feature failures.
- Final export is `evidence/phase-7-bundle.json`.
- No explicit `close_binary` occurred in this recorder. Client/transport
  shutdown verified empty owned descendants at
  **`2026-11-16T00:11:39.712Z`**.
- Do not try to reuse old tool session IDs (30794, 5994, 58276, etc.). Their
  processes ended. Reopen with a new output directory/plan when useful.

An earlier v8 selector close returned truthful `cleanup_incomplete` due to an
unreadable exiting process token (`sysctl_errno_22`). Later client shutdown
verified empty descendants; a later local check found its runtime directory
removed. Do not relabel the first close as successful or infer ownership loss.

## Actual Arc result and remaining limits

The repaired reducer `0x1012a571c` now has a contiguous **10,072-byte body**
(`0x1012a571c..0x1012a7e73`), **2,518 instructions**, and all **28 distinct
targets** at the switch `0x1012a5bc8`. All mappings agree with the independent
112-byte signed table at `0x1012a7e74` / anchor `0x1012a5bb8`.

Canonical full old-rendering record:

```text
R/arc-v9-export-retry/evidence/arc-reducer-v9.retained.evidence.json
ev_583079470e74897be835bc992f7970146808dc6ced3ae7dc423c29725672acc6
```

Current complete inline record:

```text
R/arc-v9-inline-retest/evidence/arc-reducer-inline.evidence.json
ev_7820ea6368f520cd61483866fba5814ed0c4a1661bb9cc22d4c6f15a6806a139
```

The first v9 recorder wrongly stopped on the response-budget error before
exporting. `arc-v9-export-retry` then exported retained canonical Evidence
immediately and continued smaller queries. This was an orchestration error;
the analysis itself completed. Preserve both attempts.

**Full assembly/body recovery is not complete high-level semantics.** Native
p-code is truncated at 3,000 operations, eight synchronous-throw sites remain
uncertain, and actual injected client/runtime instances are unobserved. A trace
page with no next cursor does not remove provider truncation/depth/unresolved
call limitations.

## Semantic work already available

The most useful current directory is `R/arc-v9-export-retry/`:

- `case-map.md/json`, `map_reducer_cases.py`, `case-map-audit.json`,
  `case-instructions/`: all 28 names/targets, decisions, visible writes,
  direct/indirect calls and effect boundaries. Its case CFG union covers
  2,029 caller instructions; prefix/other outer-action paths are separate.
- `common-mutation-followup.md/json`: the 702-instruction apply-like helper.
- `feature-findings-phase5.md/json`, `feature-findings-phase6.md/json`,
  `feature-phase-*-audit.json`: scoped findings and canonical provenance.
- All phase 7 records exist, but their new State/dependency facts are not yet
  fully integrated into the human findings.

Selector work lives under `field-tests/arc-selector-v8-2026-11-15/` and its
earlier `field-tests/arc-feature-followup-2026-11-14/` directory. It establishes:

- A flipped AppKit tracking view, setup/update/removal, exact tracking options,
  view-local point conversion and additional normalized point coordinates.
- Point filtering rounds to two coordinate units; do not call those physical
  pixels. Hover queries use reciprocal scale; returned rectangles scale forward.
- Native hover/selection State, SwiftUI radial-gradient spotlight and padded
  rounded candidate rectangles. No live viewport/page/world mapping is claimed.
- Candidate JS generator filters global matches ≤100; the native result
  consumer separately filters ≤500. Sampling target 15 is not a hard result cap.
- First candidate selection, commit through a captured callback, then reset of
  locked rectangle/candidate array/selected candidate. Root caller binding and
  durable effects still need completion.
- `selector-source-semantics.md/json`, index and inert source copy: exact
  11,068-byte source hash matches fixed-build producer Evidence. Shipped JS was
  never executed. Native single-zero-rectangle retry is a readiness heuristic,
  not a dedicated JS error sentinel. Invalid CSS in rect lookup can throw.

The dossier preserves historical E01–E88, adds separate S01–S30 and V01–V10
anchors. Do not rewrite old indices to describe new observations.

## Exact next work, in priority order

### 1. Finish State-property and dependency bindings from already captured data

The reducer's metadata accessor `0x1012b05e8` is fully captured (20 bytes/five
instructions); it passes cache `0x104627168` and descriptor `0x103d7b238` to
shared helper `0x100026010`. The returned metadata is used for the state field
vector. Phase 7 already captured its 40-byte descriptor and 16-byte cache.

Straight signed-relative decoding of canonical
`ev_74b6d6c45c4a63111a9c5725ac62c5fbe15b2c9de7e5217f2915f8b9273168fa`
gives:

| Field                           | Value                                                    |
| ------------------------------- | -------------------------------------------------------- |
| flags                           | `0x10051` (supported non-generic struct/singleton shape) |
| parent descriptor               | `0x103d7b1ac`                                            |
| name bytes                      | `0x103788b96`                                            |
| declared accessor               | `0x1012b05e8` (agrees)                                   |
| field descriptor                | `0x103eb510c`                                            |
| field count                     | **21**                                                   |
| field-offset-vector word offset | **2**                                                    |
| singleton cache                 | `0x104627168` (agrees; captured zero/uninitialized)      |
| incomplete metadata             | `0x104627198`                                            |
| completion callback             | `0x1012b7014`                                            |

Next obtain the name/parent identity and field-descriptor header/records, then
names. For this matched shape, field index for metadata key `k` is
`(k - 8*2)/4`, subject to alignment/range checks. For example F24→index5,
F60→index20. **Names have not yet been read; do not guess them.** Runtime
offset values being uninitialized does not prevent mapping the declared field
vector indices to names.

Preferences lead: initialize reads raw key `0x32`; dismissJSWarningBanner
writes the corresponding flag and invokes writer `(1,0x32)`; completeInterstitial
uses writer `(1,0x31)`. This is not yet proof of UserDefaults or disk I/O.
Public metadata-helper instructions derive typeref reads at
`0x103bd6880`/12 bytes and `0x103bd688e`/14 bytes; both are now captured in
phase 5. Generic dependency getter `0x1006fa470` and publisher wrapper
`0x100596e80` are missing-function admission observations, not analyzed bodies.

### 2. Continue mutation/effect-to-storage tracing

`0x1012abe5c` applies update-like values to state fields, constructs deferred
work and combines effects. Do not call these full persisted Boost objects
without the type binding.

- Async descriptor `0x103788e38` → code `0x1012bab24` → worker `0x1012ac974`.
- Worker filters changes, invokes an async dependency via typeref
  `0x103788d18`, and continues at `0x1012acc18` (phase 7 captured).
- Conditional callback `0x1012baef4` → `0x1012acc70`: optional identifier must
  be nonnil; it obtains another dependency via typeref `0x1037887e8`, builds a
  discriminator-bearing value with `0x1012bb304`, then invokes the closure.
- `0x1012a9b80`, `0x1012a93b0`, `0x1012acd58` were also captured. Consult
  actual records/case report rather than re-querying them blindly.

Resolve client types/default implementations and actual write/readback
primitives. Effect construction alone does not establish execution or durable
storage. Injection and lifetime uncertainty must remain explicit.

### 3. Reopen once with prepared broader seeds and query the missing workers

Current preparation files, all immutable/additive:

- `broader-state-restore-seeds-2044.tsv`: old 2038 plus six observed missing
  workers: tab `0x10014fa64`, sidebar `0x10043a2fc`, Restore class targets
  `0x100305344`, `0x100305b70`, `0x100305ef0`, witness `0x100306724`.
- `broader-direct-callee-seeds-2062.tsv`: adds 18 immediate B/BL targets from
  six checked-source/LC-bounded bodies. No recursive or indirect guessing.
- `prepare-broader-direct-callees.py` and receipts reproduce this source
  preparation. It is a caller-asserted seed overlay; public follow-ups must
  still corroborate roles.
- `broader-state-restore-reopen.steps.json`: twelve prepared instruction/pseudo
  requests, validated against the actual v9 catalog.

**2062 includes `0x1006fa470` but not `0x100596e80`.** The previous worker hit
quota before creating the requested 2063 overlay. Add the latter only after
checking its exact LC start/bounds; preserve the old seed files. Include its
instruction/pseudo pair and the getter pair in the next batch.

Use the **compact-evidence frozen runtime** and a new output directory/plan.
Reuse the existing method-driver pattern, actual named tool schemas and
AJV2020/canonical Evidence checks. Plans for older runs contain absolute paths;
update outputs/continuation paths before executing. Set bounded one-second Arc
autoanalysis, 330-second startup allowance and 390-second call timeout as in
the existing plans. Explicitly export before closing and perform a second
idempotent close if appropriate; retain any first-close failure honestly.

The broader fixed-build findings so far are only entry-point/static handoffs:
`BrowserWindow.nextSpace:` constructs raw tag `0x18`; navigation reload uses
`0x30`; both reach generic send `0x1008492c0`. Imported receiver-offset words
are 16, agreeing with declared viewStore fields; no live object inspected.
Tab/sidebar workers remain untraced.

Restore class descriptor `0x103d3916c`, from metadata `0x1045a1d80`, is publicly
corroborated; conformance is `RestoreSidebarDataFlow:RestoreDataFlow`.
Seven class implementation words are zero: **do not invent seven async code
targets or call this a capability defect**. Three static witness entries point
to shared stub `0x103640168`; its bytes/identity probe are already in phase 5.
Read the actual result before interpreting it.

### 4. Complete reporting and publish supporting material

Source fixes are pushed. Update stale publication wording in the registry to
`70d5dd7d1`; commit/push mature notes, reproducible sources and retained text
Evidence after review becomes available. Preserve all failures, source hashes,
profile limits, and current schema/coverage distinctions. Do not stage still
mutable session journals or reformat captures.

Sidebar/tabs/spaces/navigation, durable storage, account/sync, history/downloads,
general networking and security are not all answered end to end. Keep the
feature checklist honest. A package inventory, successful decompilation or
passing regression is not completion of an app feature.

## Copyable continuation instruction

> Read `ARC_HANDOFF.md` in this repository, then the repository instructions and
> REA+ skill. Continue the offline Arc semantic analysis from the captured phase
> 7 State/dependency facts and the prepared broader seed overlay. Source fixes
> 55/60/61 are already pushed and verified; do not rerun their 102-case matrix.
> Finish persistence and browser-feature traces, fix newly confirmed bugs, keep
> OPEN_TASKS and the dossier accurate, and publish mature notes/captures when
> normal approval review is available. Never launch Arc or shipped scripts.
