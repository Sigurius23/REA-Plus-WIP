# Arc selected-index dispatch observations — 2026-11-23

Item 63 remains **partial**. REA+ can now derive selected halfword-table targets
through a public, read-only CLI/MCP primitive. Actual Client selection and the
indirect call's code/context origin remain unresolved.

## Problem and repair

The earlier investigation retained the table instructions and conditional typed
source route, but no public producer could return selected targets without an
owner-wide jump-table/CFG repair. A caller's input or a reflected 297-case enum
cannot establish a global bound on this shared helper.

New `inspect_native_table_dispatch` accepts an original absolute Mach-O path,
preferred prefix entry, explicit index selections and an optional call address.
The shared service preserves selections in Evidence; the native adapter reads
one bounded stable snapshot and decodes a restricted straight-line arm64
16-bit-mask / unsigned-halfword / anchor-plus-entry-times-four branch. It stops
at unsupported instructions. Code, table entries and targets require unique,
initialized, read-only mappings; code/targets also require executable alignment.
arm64e/PAC and other architectures are unsupported.

The result retains exact instruction/entry bytes and whole-container offsets,
artifact SHA-256, a content-bound observation ID, per-index mapping failures,
assumptions and unresolved edges. Requested duplicates/order survive. No enum
identity, exhaustive extent, case meaning, function body ownership or runtime
reachability is inferred; no CFG or program database is changed.

An optional exact direct BL with an adjacent supported literal preparation can
produce a conditional singleton for a requested mapped index. Known direct
branches bypassing the literal withhold it. That scan covers immutable `__text`
sections only; suffix execution and absence of intervening indirect entry remain
premises. An indirect call retains observed preparation without a callee link.
The CLI accepts the identical input as inline JSON or a request file.

Qualification also exposed misleading file-cap remediation inherited from the
PE adapter pattern. The new adapter now names `max_file_bytes`, its 512 MiB
supported ceiling and the unchanged-retry failure explicitly; unrelated worker
heap settings are not presented as a remedy. `retryable` stays false. Baseline
captures and the final frozen runtime are retained separately.

## Owned qualification

[Assembly source](../rea-local/tests/fixtures/native/table-dispatch.s) was built
with the installed Apple compiler, linked with libSystem, and inspected, never
executed. The first scratch link omitted libSystem and failed; the retained
[build recipe/receipt](arc-table-dispatch-2026-11-23/fixture-build.json) records
the successful explicit link. An early scratch CLI request selected the case
body instead of the helper entry and returned an unsupported-prefix result;
qualification uses the checked symbol addresses from the source build.

Artifact: 17,408 bytes, SHA-256
`cb6eee639b34a02109de1ce4d1e2b8fbbc9b08cd69fd9cc2f0d964b6f3cb85a8`.

- Explicit indices 0 and 1 map to the source-owned case addresses
  `0x100000330` and `0x100000338`. Index 65535 is unmapped. Duplicates remain.
- The direct-call suffix at `0x100000340` gives a conditional singleton for 1.
- Indirect, different-target, bypassed, unselected and unmapped call controls
  retain no invocation mapping. Unsupported and budget-limited prefixes retain
  their partial instructions. Invalid formats and file caps return typed errors.
- Strict public schemas reject caller-supplied type-domain claims. Module
  controls cover signed loads, wrong masks/scales, overwritten indices, stores,
  writable code, PAC, malformed mappings, cancellation and FAT source offsets.

## Arc result

Input is the unchanged fixed arm64 slice, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The 14-instruction prefix at `0x1005aa5e4` establishes table `0x1036db410`,
anchor `0x1005aa61c`, original input X0 and the encoded 16-bit mask.

| Selected index | Original entry bytes | Unsigned entry | Derived target |
| --- | --- | --- | --- |
| 49 | `b303` | 947 | `0x1005ab4e8` |
| 50 | `8600` | 134 | `0x1005aa834` |

[Selected indirect-call Evidence](arc-table-dispatch-2026-11-23/mcp-final/arc-selected-indirect.evidence.json):
`ev_0c26d3756f1b173e70926165bbc6ea9519a3b0c8a6527f70baeb7a5e14a30e35`.
The actual `0x1012ab840` instruction is BLR X23. Its adjacent literal is X0=49,
but `link=indirect-unresolved`, `mapping_status=unresolved`, and `mapping_index`
is null. This does not assert that the selected helper is that callee.

[Default reader call Evidence](arc-table-dispatch-2026-11-23/mcp-final/arc-direct-input-unknown.evidence.json):
`ev_f43ea6f35312d1ef7f016e787f13cb66474500cd03f02bde881f43cf1cc58cb7`.
At `0x100d910f0`, the direct BL reaches the selected entry, but this narrow
primitive does not establish an adjacent literal; no singleton follows. The
previous checked adapter/X0-forwarding route remains a separate conditional
analyst composition.

## Verification and retained artifacts

- [Final MCP plan](arc-table-dispatch-2026-11-23/plan-final.json): 14 calls,
  12 successful replies and two expected errors; 206 advertised tools. Ten
  complete Evidence records survive [bundle export](arc-table-dispatch-2026-11-23/mcp-final/final.bundle.json).
- [CLI parity](arc-table-dispatch-2026-11-23/cli-final-verification.json): five
  exact complete-Evidence comparisons and two exact error comparisons.
- [Qualification verifier](arc-table-dispatch-2026-11-23/qualification-verification.json)
  checks source bytes, target arithmetic, artifact hashes, observation IDs,
  controls, retained records, 1,881 frozen runtime files, 25 source files and
  the unchanged baseline runtime. Both final owned process lineages are empty.
- 25 affected tests passed across parser, service, Mach-O and public acceptance
  coverage. The final acceptance rerun adds the explicit file-cap remediation
  assertion and preserves original padded/uppercase address parameters.
- Build, final typecheck/lint, generated documentation, architecture guards and
  packed-package verification pass; logs are retained in the checkpoint.
- [Historical verification](arc-table-dispatch-2026-11-23/history-verification.json)
  authenticates seventeen earlier snapshots, resolving intentionally updated
  living documentation/source against each recorded commit.

Named direct public calls are qualified. Independent model trials for broad
natural-language tool discovery were not run; schema validity alone does not
establish agent selection performance.

No Arc process, helper, shipped JavaScript, profile, UI or service was used.
The owned fixture was not executed. Build products and frozen runtimes remain
in ignored cache directories; only textual sources/evidence are checkpointed.

## Remaining work

The selected-index observation carrier is implemented. Item 63's **typed
invocation proof** is still open: bind the actual stored Client code/context to
the default adapter under exact keypath/TaskLocal selection and retained
instance/copy/stability premises. Only then compose the actual call's input
with the selected helper without converting it into a helper-global 297-case
bound. The [constructed-child checkpoint](arc-instance-flow-2026-11-23.md) and
the retained typed-input design review remain the starting evidence for that
join. Full Arc feature/persistence recovery remains incomplete.
