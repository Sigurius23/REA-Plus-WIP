# Arc macOS cleanup settlement

Investigation started **2026-11-09**, source verification completed
**2026-11-10**, Europe/Berlin. Tracks item **57**. The shared process owner now
allows a short, bounded exit transition to settle while retaining the original
cleanup candidates. Final public verification on **2026-11-13** completes
three Arc sessions with successful explicit closes.

## Observations and source diagnosis

Preserved public `close_binary` replies reported `cleanup_incomplete`:

| Capture                                                                                | Reported JVM PID | Ownership diagnostic | Exit code in reply |
| -------------------------------------------------------------------------------------- | ---------------: | -------------------- | ------------------ |
| [Arc dispatch retest](arc-dispatch-load-2026-11-09/arc-v6-retest/close.reply.json)     |            59022 | `sysctl_errno_22`    | `null`             |
| [Arc selector bootstrap](arc-selector-rendering-2026-11-09/bootstrap/close.reply.json) |            30262 | `sysctl_errno_22`    | `0`                |
| [Arc v7 retest](arc-dispatch-load-2026-11-09/arc-v7-retest/close.reply.json)           |            99032 | `sysctl_errno_22`    | `0`                |

These are historical observations. Neither PID nor its old runtime manifest
supplies present ownership authority. This investigation did not inspect or
signal any of these historical PIDs.

The later [dispatch verifier summary](arc-dispatch-load-2026-11-09/arc-v6-retest/summary.json)
reports a verified empty descendant list at `2026-11-09T14:35:09.950Z`.
That is a later point-in-time observation of the verifier tree. It does not
retroactively prove cleanup at the earlier close, exclude reparented processes,
or explain why the kernel returned EINVAL.

The local producing path explains a fixable false failure:

1. `GhidraClient.#cleanup` requests bridge shutdown, waits 500 ms for JVM exit,
   then invokes the shared supervisor.
2. The supervisor invokes Ghidra's owned process-group cleanup callback. A
   failed callback returns `incomplete` immediately; its existing later exit
   waits apply only after successful cleanup.
3. The original group validator read each ownership token once, followed by one
   immediate live-process snapshot for unavailable reads. An exiting JVM still
   present in that snapshot left a final failure even if it exited immediately
   afterward.

The Darwin helper returns the actual sysctl error and brackets token reads with
native start identities. There is no established native-parser defect here.
An exit transition is consistent with the receipts and the producing path;
the exact kernel cause of either historical EINVAL remains unknown. Persistent
EINVAL must continue to fail closed.

## Failed v7 retest and budget ownership

The first repair gave the retained cleanup plan a fixed 120 ms settlement
deadline. Its source suite passed 80 cases, with one Linux-only skip; those
[initial source tests](arc-cleanup-settlement-2026-11-09/source-tests-120ms.log)
and [initial source digests](arc-cleanup-settlement-2026-11-09/source-verification-120ms.json)
remain preserved.

The subsequent actual v7 Arc run still failed explicit close after about
639 ms: 500 ms of Ghidra exit grace plus the short ownership inspection window.
It completed eight of nine public calls, then stopped at close. The reply
records exit code zero, and its [later verifier summary](arc-dispatch-load-2026-11-09/arc-v7-retest/summary.json)
records an empty descendant list. These observations do not prove that the
candidate had already disappeared when the final liveness snapshot was taken.

Read-only source review found no snapshot cache. Each `listProcesses` launches
a new `ps`; `execFileOutput` executes a new child; the Darwin reader retains
only its compiled executable and invokes it afresh for each read. Swift's
before/after process snapshots are local calls to sysctl. A [production-host
freshness probe](arc-cleanup-settlement-2026-11-09/inspector-freshness.json)
confirmed three distinct observer PIDs, with each earlier observer absent from
the next snapshot. Those process-table calls took 34–38 ms each. The short
deadline therefore includes substantial inspection time, not just polling.
The historical EINVAL's exact kernel cause is still unknown.

The fixable configuration boundary is that the supervisor already owns a
1,000 ms kill grace, but previously could not supply it to the retained cleanup
plan. A first ownership failure returned before that existing resource-policy
budget could be used. The final repair forwards that caller-owned deadline
instead of adding another independent grace interval or retrying a failed plan
from an empty launcher snapshot.

## Implemented ownership rule

The repair is in `rea-local/src/process/ProcessOwnership.ts`,
`rea-local/src/process/ProviderProcess.ts`, and
`rea-local/src/ghidra/GhidraLauncher.ts`. The Ghidra client and native Swift
inspector are unchanged.

One cleanup call retains a single plan containing its discovered groups,
token-verified identities where available, and the original PID-to-group map.
Unavailable token reads can be retried every **40 ms** within the supervisor's
existing `killGraceMs` budget (**1,000 ms** by default). Its absolute deadline
flows through the Ghidra cleanup callback into that same retained plan. Planning,
pre-signal validation, subsequent exit waits, and the existing successful-cleanup
retry all consume the same deadline. No extra full grace window is appended.
Invalid, non-finite deadlines and invalid stop-grace durations fail before
cleanup can poll indefinitely.

Standalone cleanup callers that do not supply a supervisor deadline retain the
original **120 ms** default. A caller-supplied deadline is not also cut short by
an independent three-attempt limit. The bound applies to added polling waits;
existing operating-system inspection calls retain their own timeouts and can
exceed that deadline in wall time.

An unavailable observation settles only when a fresh live-process snapshot
excludes that PID, or a later read supplies the matching token. Every readable
token mismatch remains final. Persistent unreadability, identity uncertainty,
and process-table failures retain their existing conservative failure behavior.

The same plan survives the wait. A known detached descendant is still validated
and cleaned after its launcher exits; an unowned or unreadable surviving
descendant keeps cleanup incomplete. A known PID changing process groups causes
a conservative failure, so an exiting root cannot hide a migrating descendant.

If an unavailable read settles during pre-signal validation, the owner refreshes
group membership and validates it again before signaling. This prevents the
settlement wait from authorizing a signal using the earlier membership snapshot.
One refresh is allowed; repeated instability fails closed. Exit alone never
authorizes resource release or direct process signaling.

## Source verification

The new `ProcessOwnership.settlement.test.ts` exercises ten deterministic race
cases through the production cleanup entry point and its host seam:

- Planning and pre-signal exit transitions retain an owned detached group.
- Foreign and unreadable detached survivors retain cleanup failure.
- Descendant group migration during either phase retains uncertainty.
- Fresh pre-signal membership rejects a replacement PID with a different token.
- Multiple groups share one deadline, and persistent EINVAL remains incomplete.
- A readable token mismatch is not retried into a later success.
- An unbounded caller deadline fails before process inspection.

`ProviderProcessCleanup.test.ts` adds six source cases. A root exiting at
240 ms, beyond the old cutoff, can settle within a selected 500 ms stop grace
while its known detached group is still handled. A still-unreadable detached
survivor remains incomplete at that same deadline despite root exit code zero.
Other cases prove remaining-budget use across cleanup and exit waits, the
existing default 1,000 ms policy, and rejection of invalid grace durations.

The existing liveness aggregation test now verifies complete member-read batches
without fixing the implementation to exactly one batch and two snapshots.
All other ownership, identity, malformed-boundary, and cancellation coverage
was retained.

On macOS arm64 with Node **24.22.1**:

| Check                                          | Result                                    | Receipt                                                               |
| ---------------------------------------------- | ----------------------------------------- | --------------------------------------------------------------------- |
| Nine process-ownership/supervisor source files | **89 passed, 1 skipped**                  | [Source test log](arc-cleanup-settlement-2026-11-09/source-tests.log) |
| `npm run typecheck`                            | Passed                                    | [Typecheck log](arc-cleanup-settlement-2026-11-09/typecheck.log)      |
| Targeted `oxlint`                              | Passed; 13 owner-size/complexity warnings | [Lint log](arc-cleanup-settlement-2026-11-09/lint.log)                |
| Targeted `oxfmt --check`                       | Passed                                    | [Formatting log](arc-cleanup-settlement-2026-11-09/format.log)        |

The skipped source case reads Linux `/proc` start identities and is unavailable
on this macOS host. All new settlement and supervisor cases ran. Source digests and
host identity are retained in [source-verification.json](arc-cleanup-settlement-2026-11-09/source-verification.json).

The repository's [focused boundary plan](arc-cleanup-settlement-2026-11-09/boundary-plan.log)
requires a build for `tests/boundary/process/providerProcess.test.ts`. That
boundary run, the Ghidra client boundary's added deadline-propagation assertions,
and a real Arc retest of the final deadline wiring are handed back to the parent
verification task after its combined runtime build. This source investigation
did not build or clean `dist`, start a provider client, change Java, commit, or
push. Passing these deterministic races establishes the repair's ownership
semantics; it does not establish that every real Ghidra exit finishes within
the settlement budget.

## Final source review: cleanup sweep deadline

Independent source review found one remaining budget gap: cleanup-driven token
sweeps still used their own three 40 ms retry waits before group validation,
even when the caller's absolute deadline had expired. The cleanup owner now
passes the same deadline through `scanTokenOwnedProcesses` and
`settleUnreadableTokenCandidates`. Sweep settlement and later group validation
consume one budget; an expired deadline schedules no polling wait. Unresolved
candidates remain available for final liveness classification and conservative
failure. Standalone `verifyNoTokenOwnedProcesses` sweeps retain their existing
three-attempt policy.

Two additional host-seam regressions cover the gap. An already-expired cleanup
sweep returns an unreadable ownership failure without advancing fake time or
signaling. A launcher that remains unreadable until its exit at 200 ms can
settle beyond the old cutoff; its retained detached survivor then consumes the
remainder of the same 500 ms deadline and stays incomplete when its token is
persistently unreadable.

The final nine-file source run reports **91 passed, 1 skipped**; all twelve
settlement cases and six supervisor cleanup cases ran. The Linux-only identity
case remains the named skip. Typecheck and changed-file formatting passed.
Changed-file lint passed with zero errors and seven size, complexity, and
parameter-count warnings. These results supersede the earlier source counts
above; their original logs and digests remain preserved.

- [Final source tests](arc-cleanup-settlement-2026-11-09/source-tests-sweep-deadline.log)
- [Final typecheck](arc-cleanup-settlement-2026-11-09/typecheck-sweep-deadline.log)
- [Changed-file lint](arc-cleanup-settlement-2026-11-09/lint-sweep-deadline.log)
- [Changed-file formatting](arc-cleanup-settlement-2026-11-09/format-sweep-deadline.log)
- [Final source digests](arc-cleanup-settlement-2026-11-09/source-verification-sweep-deadline.json)

## Final built and public verification, 2026-11-13

The combined build passes **70 boundary tests across three files**, with one
Windows-only launcher case skipped on macOS. These cross the real process and
Ghidra callback/protocol boundaries using owned fixtures; they are separate
from the installed-engine Arc observations. The updated deadline-propagation
assertions run in the Ghidra client boundary.
[Boundary log](arc-cleanup-settlement-2026-11-09/final-boundaries-2026-11-13.log).

The unchanged Arc ARM64 input completes **20/20 public calls across three
sessions**, exports three Evidence bundles and explicitly closes all three
targets successfully. Observed close times are **470, 441 and 519 ms**.
The final verifier reports an empty owned descendant list. A separate
selector-return pass completes **5/5** and a native helper pass **7/7**; both
export and close successfully. Arc and its helpers were not executed.
[Primary invocations](arc-dispatch-load-2026-11-09/arc-final-2026-11-13/invocations.json),
[primary summary](arc-dispatch-load-2026-11-09/arc-final-2026-11-13/summary.json),
[helper summary](arc-dynamic-projection-2026-11-13/native-helper-evidence/summary.json).

Those public receipts do not identify the historical EINVAL kernel state or
record whether settlement polling was needed during these successful closes.
The deterministic race cases establish the retry and ownership rules; the
public runs establish that the repaired built workflow closes the actual Arc
input successfully. The earlier 120 ms attempt and its failed close remain
preserved under `arc-v7-retest/`.

The fast gate, built-documentation checks and package CLI/MCP verification
also pass. Package verification ends with verified empty owned descendants.
The implementation is published in **`72fcdbe8c`**, following Swift producer
**`f2cdb96ba`** and class selector **`8a5efd668`**.
[Fast gate](arc-cleanup-settlement-2026-11-09/final-check-fast-2026-11-13.log),
[package verification](arc-cleanup-settlement-2026-11-09/final-package-2026-11-13.log).

A further **23 tests across three fixture boundary files** pass for Hopper
cleanup retry, Hopper launcher ownership and LLDB tracer cleanup consumers of
the shared supervisor. These use owned Node fixtures and do not launch Hopper,
LLDB or Arc. [Consumer regressions](arc-cleanup-settlement-2026-11-09/consumer-cleanup-regressions.log).

## Cross-attempt review, 2026-11-13

The deadline repair above retains candidates within one cleanup attempt. Final
review separately reproduced loss of a detached candidate across attempts:
after an incomplete stop, the launcher exits and the next fresh plan can
incorrectly report success while the child survives. The successful Arc closes
above do not exercise that failure. Item **58** tracks the launch-owned cleanup
capability and repeated-close/rollback regressions in
`field-tests/arc-cleanup-history-2026-11-13/`. The source and public observations
above remain historical verification of `72fcdbe8c`.
