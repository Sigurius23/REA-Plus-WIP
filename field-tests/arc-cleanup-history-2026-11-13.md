# Cleanup history across failed attempts

Items **58–59**, investigated 2026-11-13–14. Both repairs are published in
`076c706c6e06257190c5303fa8aec5de1d2e649f`. Arc and its shipped code were never
executed. Native analysis used the supplied DMG's unchanged ARM64 main image.

## Confirmed ownership loss

The controlled host reproduction against the preceding compiled runtime first
reports `incomplete` with an unreadable detached child. After the launcher exits,
the second stop reports `verified-cleanup` while that child is still live and no
signal was sent. A fresh one-shot plan forgot the previously observed group.
The observed launcher exit then allowed the supervisor to accept false success.
[Before receipt](arc-cleanup-history-2026-11-13/before-host-seam.json).

The spawn boundary now creates one cleanup capability. Rollback, supervision
and subsequent closes share it, retaining candidate groups and original native
process identities. History never supplies signal authority: fresh matching
tokens, identities and membership remain required. A new group discovered during
validation forces an incomplete result and is retained for another attempt.
Unreadable, foreign, reused or migrated candidates cannot become permission to
signal. Fresh absence can settle them. Concurrent calls share the pending
attempt, rather than racing separate histories.

Ghidra normalizes injected launches before ownership-manifest rollback. Hopper,
LLDB, owned commands, JADX, radare2, the JavaScript worker, source-map codec,
Wakaru and firmware command owners preserve the same capability. Six optional
launcher fallbacks were also normalized once at supervisor acquisition; default
production spawns already supplied the capability. Windows job/tree behavior
retains its existing platform boundary.

Two real owned-Node Ghidra boundary cases exercise manifest-write failure before
supervisor creation, using both production spawn cleanup and a cap-less injected
launch. Repeated close retains a foreign-token detached child and the runtime
directory after the parent exits. Only separate child-specific ownership
verification/removal permits the final close to release the directory. These
fixtures establish the failure semantics; the ordinary Arc close below does
not reproduce a foreign detached child.

## Radare2 startup ownership

Review found a separate owner-loss path. `Radare2Pipe.start` waited for the
startup NUL before returning its handle. Its failure handler discarded an
incomplete `stop()` result, then threw before the client assigned the handle.
The client could consequently remove the private root despite failed cleanup.

Acquisition now returns the owned pipe before the client awaits protocol
readiness. The client retains the exact pipe through stream/handshake failures
and releases it through its normal retryable cleanup owner. The startup reply
is registered before stdout attachment, preserving buffered-output ordering.
The owned-Node regression fails before the repair because the private root is
already gone, then passes after the repair: timeout, repeated cleanup failure,
root retention, and eventual verified removal.
[Before log](radare2-startup-cleanup-2026-11-14/before.log),
[after log](radare2-startup-cleanup-2026-11-14/after.log).

## Verification

| Check                                    | Result                                                                                |
| ---------------------------------------- | ------------------------------------------------------------------------------------- |
| Initial ownership source suite           | 105 passed, one Linux-only identity skip, 11 files                                    |
| Final affected-consumer matrix           | 132 passed, three platform skips, 12 files                                            |
| Fast gate and built-documentation checks | Passed                                                                                |
| Packaged CLI/MCP                         | Passed; 205 tools, six prompts, verified empty owned lineage                          |
| Fresh real Arc Ghidra session            | 15/15 calls; explicit close 795 ms, repeated close 1 ms; verified empty owned lineage |
| Canonical retained Evidence              | 11 records, 11 unique identities, one authenticated bundle                            |

The consumer matrix overlaps the source suite; these are separate check scopes,
not additive test counts. The three final consumer skips are Linux-only firmware
executable/limiter configuration cases in `FirmwareCommand.test.ts`. Real-provider
verification covers installed Ghidra on macOS; the consumer fixtures do not
establish live Hopper, LLDB, JADX or radare2 engine behavior, or Linux firmware
execution. The complete
`check:pr` gate was not rerun.

- [Final consumer matrix](arc-cleanup-history-2026-11-13/consumer-boundaries-final-2026-11-14.log)
- [Final source commitments and check hashes](arc-cleanup-history-2026-11-13/final-verification-2026-11-14.json)
- [Arc invocations](arc-cleanup-history-2026-11-13/arc-retest-2026-11-14/invocations.json)
- [Arc summary and lineage](arc-cleanup-history-2026-11-13/arc-retest-2026-11-14/summary.json)
- [Canonical Evidence audit](arc-cleanup-history-2026-11-13/evidence-audit.json)

The first boundary run used a restricted sandbox and unpinned Node 22; it is
preserved separately and supplies no successful product verification. The host
rerun uses pinned Node 24. A later new-test assertion initially expected the
cleanup subclass name as its tagged error; the correct domain tag is
`ProviderAdapterError` with `cleanupIncomplete: true`. A test placement also
exceeded the lint callback line budget and was corrected. All failed attempts
remain retained alongside their final passing runs. A plan captured with npm's
console preamble is preserved as `.log`; its `.json` now contains only the
parsed plan, and the final artifact audit passes.

## Arc analysis boundary

The Arc image remains SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
This retest also retains seven exact copy/metadata helper analyses and loaded
VWT/descriptor bytes. Those observations extend the item 55 investigation;
they do not recover its dynamic-stack dispatch or prove transitive nonescape,
runtime metadata binding, complete persistence or final rendering. The Swift
producer remains `abi-signed-word-cfg-v7`; the preceding 44-case producer matrix
was not repeated for these process-ownership-only changes.
