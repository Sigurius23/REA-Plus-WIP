# Arc selector activation and indexed Swift class recovery

Date: **2026-11-09**, Europe/Berlin. This pass follows selected selector
activation/completion paths in the supplied **Arc 1.172.1 / build 90370** and
repairs the separate Swift class-vtable admission gap recorded as item **56**.
Final native drawing, coordinate spaces and live page activation remain open.
Arc, helpers and shipped JavaScript were not executed.

The main ARM64 input is **80,498,448 bytes**, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
It is the previously verified slice of the fixed DMG; temporary-path recovery
does not change its identity. See the [Arc dossier](arc-analysis-dossier-2026-11-08.md).
The native pass uses the existing 1,940 caller-selected `LC_FUNCTION_STARTS`
entry hypotheses and a one-second initial analysis policy. Seeds are assertions;
the partial Program and absent references do not establish global coverage.
[Scope and seed commitment][scope].

## Selector activation and completion

The earlier source consumer **`0x1012e560c`** reads the once-cached
`SelectorPicker.js` String and forwards it to a captured async function. The
fresh adjacent entry **`0x1012e55f0`** stores its incoming arguments and schedules
that consumer through `_swift_task_switch`. Its continuation **`0x1012e56b8`**
deallocates the child task context, branches on returned X20, and schedules
**`0x1012e5714`** or **`0x1012e5758`**. The zero branch calls a value-cleanup
helper before resuming; the other branch resumes directly. These are selected
machine/decompiler observations, not a live evaluation result.
[Entry][entry], [bootstrap completion][bootstrap-completion].

A second selected caller, **`0x1012e4ec4`**, allocates a child task with
continuation **`0x1012e4f58`** and schedules the same bootstrap consumer. That
continuation explicitly calls **`_swift_errorRelease`** for a nonzero returned
error value, then allocates/schedules the next stage **`0x1012e5788`** in either
case. On this static path a bootstrap error is released and the enclosing
operation proceeds; a script-injection failure is not established as terminal.
The Nov13 follow-up below traces the next stage; the caller that starts this
operation remains unresolved. [Enclosing entry][enclosing-entry],
[continue after bootstrap][continue].

The next retained continuation **`0x1012e4fd4`** selects
**`0x1012e5088`** or **`0x1012e5148`** after the child task returns. The former
passes four eight-byte words and a flag through Combine's `Published` enclosing
instance setter. The latter passes four zero words and flag **1** through the
same keypaths. Both zero a field addressed through the global rendered as
`_status`; if its previous unsigned byte exceeds **1**, both call
**`0x1012e4d6c`** before resuming their caller. The received object's identity,
the complete meaning of the published value, and the visible rendering are
not established by these selected routines. [Completion routing][completion],
[value publication][publish], [alternate publication][publish-other].

The earlier reciprocal lookup scaling and DOM-rectangle source observations
remain useful. This pass does not close scroll/zoom/origin conversion, final
AppKit/SwiftUI drawing, concrete page/world selection or per-page lifetime.
It also does not infer that once-caching the source means installing it only
once in a page.

## Item 56: selecting the known class before decode admission

The broad public `swift-vtables` pass exhausted **20,000 aggregate admissions**
after retaining **5,097 slot rows / 507 owners** and **10,267 relative-pointer
records**. Its bounded class metadata stopped before the already-known
`HoveredElementTracker` descriptor **`0x103d7bcb4`**, established by the earlier
conformance's relative type reference. The result correctly reported partial
coverage. The missing capability was selecting this known class before spending
decode admission elsewhere, not an incorrect counter or proof of class absence.
[Retained broad result][before].

A source-built, never-executed three-class library reproduces the admission
problem. With **`max_records: 10`**, broad inspection retains four rows for
`BudgetFirst` and omits `BudgetTarget`. With **100**, it retains 15 rows across
all three classes. The owned binary is **55,752 bytes**, SHA-256
`9a4d69d773cfaedcd0aa74010ed5fc92934f2e7ef15e874579446631e45a9142`.
The source supplies the class/method oracle; it was not executed.
[Owned source][owned-source], [compiler/input receipt][owned-input],
[before captures][owned-before].

The public input now accepts **`swift_class_address`**, exposed as CLI
**`--swift-class-address`**, only with **`facet: "swift-vtables"`** and without
conformance selectors. The reader scans the complete type index before admitting
that exact nominal class. Direct/indirect indexed identity, class kind and aliases
are checked; names are display values, and an arbitrary address or symbol-only
provider cannot substitute for indexed identity. Aliases do not duplicate slots.
The optional **`swift_vtable_selection`** separates index entries examined,
matching index aliases and unresolved identities from the class decode count.
Unresolved index identities prevent absence claims. Existing records may omit
this new selection field.

The same budget of **10** now selects four rows / three resolved implementations
for `BudgetTarget`; **100** retains five rows / four resolved implementations.
With a budget of **1**, the indexed identity/pointer remain observed but no slots
are admitted, and coverage remains partial. Unsupported generic/resilient/async
layouts remain unsupported; no runtime class metadata is instantiated.
[Selected owned result][selected], [tight budget][tight].

Review also found a malformed-input hazard in a full-index scan: a tiny image
could declare an enormous index section, causing repeated failed reads before
decode admission. The shared Apple metadata boundary now validates requested
`__swift5_types` and `__swift5_proto` index alignment, unsigned address range
and one complete file-backed mapped span **before enumeration**. It leaves empty
indexes and unrequested families alone. Two never-executed owned copies declare
an index size of **2^44** while remaining 55,752 bytes. Both now return
**`unsupported_target`**, **`retryable: false`**, with an intact-artifact remedy
stating that unchanged bytes reproduce the failure. No worst-case enumeration
was run. [Malformed input commitments][malformed-inputs],
[types rejection][malformed-types], [conformance rejection][malformed-proto].

## Fixed Arc retest

The exact-class query examines **11,125 / 11,125 type-index entries**, finds one
matching indexed descriptor and no unresolved index identities. It returns
**17 vtable rows** for `HoveredElementTracker`; **two** native targets resolve:

| Metadata word slot | Native target |
| -----------------: | ------------- |
|                 21 | `0x1012e4cec` |
|                 30 | `0x1012e4d6c` |

These indexes are metadata word offsets, not source method ordinals. The other
15 rows remain partial with the decoder's unresolved-layout reason; they are
not all labeled async methods. The selected family's coverage remains partial.
The second address agrees with the helper called by both retained publication
paths, an address association that does not prove the concrete runtime receiver.
Neither method body was newly analyzed in this utility retest. [Arc class result][arc].

## Verification and retained boundaries

- **151 source cases / seven files** pass in the final recorded source run,
  including selected identity, indirect aliases, unresolved/malformed indexes,
  non-class/unindexed addresses, tight budgets, unsupported layouts, conflicting
  selectors, empty/unrequested index scopes and existing provider cancellation
  behavior. The smaller earlier counts
  overlap this run and are not added to it.
- The final build succeeds. **Nine actual CLI/MCP comparisons** pass: five
  canonical Evidence comparisons and four canonical error-schema comparisons,
  including Arc and both malformed index copies. Targets retain their hashes;
  the CLI verifier ends with verified empty descendants.
- The later **`check:fast`** gate passes both tasks uncached. **`docs:check:built`**
  passes after regenerating its stale ignored completion manifest/ledger from
  the existing build. No runtime rebuild, provider client or target execution
  was needed for these final documentation checks. All ten existing
  implementation-source commitments still match; only a test-input formatting
  correction was needed. [Commitment check][commitments].
- The final MCP matrix makes **17 calls: 13 successful results and four expected
  rejections**, exports its bundle and closes successfully with no descendants.
  [CLI comparisons][cli], [MCP session][after-summary].

The original bootstrap session made 25 calls, retaining 23 successful results
and two boundaries. The broad vtable result exceeded the 10 MiB MCP response
budget; its complete record was exported and authenticated without repeating
the analysis. Explicit close returned **`cleanup_incomplete`** after an ownership
inspection failed with `sysctl_errno_22`; recorder shutdown subsequently verified
empty descendants. The original failure is preserved. Historical PIDs are not
live process identities and were not signalled. [Close receipt][close].

The first CLI comparison harness incorrectly asserted that every error must have
`retryable: false`. Existing wrong-facet/conflicting-input errors use
`invalid_request` with `retryable: true`; their CLI/MCP results already agreed.
The verifier assertion was corrected for malformed-artifact errors only, and
the complete final matrix passed. The failed harness receipt/log remain separate
from that final verification; this was a verifier mistake, not a product defect.

Read-only authentication/checks can be repeated without the temporary targets:

```sh
node field-tests/arc-selector-rendering-2026-11-09/audit-evidence.mjs
node field-tests/arc-selector-rendering-2026-11-09/check-findings.mjs
```

The audit authenticates **42 standalone / 33 unique Evidence records and four
bundles**. The findings checker authenticates/hashes 13 selected records, checks
the retained full vtable record against its exported bundle, validates the nine
comparisons and preserves the three MCP session outcomes. These checks do not
run Arc or establish complete selector rendering or full application behavior.

## Native query follow-up, 2026-11-13

The recovered methods are now inspected through the native provider. The first
reads the published four-word value plus flag. The second conditionally starts
an async task after checking its status byte, optional object and value flag;
the admitted branch sets status 1, and the alternate branch sets status 2.
These static paths do not establish the concrete runtime receiver.

Next stage `0x1012e5788` obtains the captured scale, divides 1.0 by it and
scales the incoming zero-size rectangle with `0x100958330`. The helper's
instructions call the four `CGRectGet*` functions and return four multiplied
scalar results, despite its incomplete decompiled single-result signature.
The caller formats the exact command **`getHoveredElement({x: …, y: …})`** and
dispatches through the captured async evaluator.

Completion `0x1012e58e4` selects `0x1012e5948` for a zero error register and
`0x1012e59e4` otherwise. Success obtains the scale again, scales the returned
rectangle forward, writes its four scalar values plus flag 0, clears X20 and
resumes. The error continuation resumes without that success write. This
recovers the selected request/result scaling pair; remaining coordinate-space
mapping, page/world identity and final native drawing stay open.

The final primary Arc pass completes **20/20 calls over three sessions**,
exports three bundles and explicitly closes each target. The return-continuation
pass completes **5/5**, exports and closes. All these verifier lineages report
empty owned descendants. Source is unchanged at the fixed main SHA-256 above;
the final pass uses one additional `LC_FUNCTION_STARTS`-verified geometry-helper
seed (1,941 total), while the return pass uses the separately declared helper
seed set. The selected records and exact instruction checks are consolidated as
**E79–E88** in the [dossier](arc-analysis-dossier-2026-11-08.md), whose verifier
also preserves the earlier failed close and transport boundary.

[scope]: arc-selector-rendering-2026-11-09/scope.json
[entry]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-adjacent-0x1012e55f0.evidence.json
[bootstrap-completion]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-adjacent-0x1012e56b8.evidence.json
[enclosing-entry]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e4ec4.evidence.json
[continue]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e4f58.evidence.json
[completion]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e4fd4.evidence.json
[publish]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5088.evidence.json
[publish-other]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5148.evidence.json
[before]: arc-selector-rendering-2026-11-09/bootstrap/swift-vtables.retained.evidence.json
[owned-source]: arc-selector-rendering-2026-11-09/owned/VtableBudget.swift
[owned-input]: arc-selector-rendering-2026-11-09/owned/input.json
[owned-before]: arc-selector-rendering-2026-11-09/owned/capture/evidence-bundle.json
[selected]: arc-selector-rendering-2026-11-09/selection-after/selected-100.evidence.json
[tight]: arc-selector-rendering-2026-11-09/selection-after/selected-budget-one.evidence.json
[malformed-inputs]: arc-selector-rendering-2026-11-09/index-malformed-inputs.json
[malformed-types]: arc-selector-rendering-2026-11-09/selection-after/malformed-types.reply.json
[malformed-proto]: arc-selector-rendering-2026-11-09/selection-after/malformed-proto.reply.json
[arc]: arc-selector-rendering-2026-11-09/selection-after/arc-hover-class.evidence.json
[cli]: arc-selector-rendering-2026-11-09/cli-verification-final.json
[after-summary]: arc-selector-rendering-2026-11-09/selection-after/summary.json
[close]: arc-selector-rendering-2026-11-09/bootstrap/close.reply.json
[commitments]: arc-selector-rendering-2026-11-09/source-commitment-check.json
