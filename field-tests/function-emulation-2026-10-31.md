# Function emulation — item 16 verification, 2026-10-31

**The initial bounded function-emulation capability is implemented and verified.**
`emulate_function` and `rea emulate-function` share one service and Evidence
contract. They accept original file/code ranges, arm64/x86-64 entry addresses,
canonical register bit patterns, fully initialized memory and selected output
ranges. Results carry effective initial/final registers, selected memory changes,
instruction-entry coverage and an explicit stop reason.

This is a new general capability, separate from pwntools' existing use of Unicorn
for selected PLT inference. It does not launch the selected binary as a host
process or silently supply an OS, loader, ABI stack, imports, TLS or Swift runtime.
The [guide](../rea-local/docs/function-emulation.md) documents inputs, assumptions,
supported register state, resource budgets and caller-supplied dependencies.

## Real-engine verification

The source-owned C/assembly inputs compile into two linked Mach-O fixtures, one
arm64 and one x86-64. An independent symbol/file-range parser selects their
original bytes; source formulas and expected stores supply the result oracle.
Neither compiled fixture is launched as a host executable.

- **42 scenarios pass:** integer arithmetic, both branch outcomes, stores and
  sums, floating-point bit patterns, admitted nested/indirect calls, caller stops,
  entry at zero, and explicit runtime/memory/permission/coverage/time boundaries.
- **57 actual MCP invocations:** 45 successful replies (43 emulation Evidence
  records plus two retained-bundle operations), eight expected invalid-input
  rejections, two unavailable configurations, one concurrent-capacity refusal
  and one client cancellation. The SDK suppresses a cancelled request's reply;
  its captured outcome is an abort, not a success.
- All 45 successful replies validate the actual advertised input/output schemas,
  canonical output contracts and text/structured agreement. Six SDK input
  rejections are plain validation text; handler errors use canonical JSON errors.
- **Four source CLI/MCP comparisons match exact Evidence IDs**: arithmetic and
  selected memory stores on both target architectures. A real isolated installed
  package independently reproduces the same arm64 arithmetic Evidence and ships
  the byte-identical Python bridge.
- An observed live worker is cancelled through public MCP; owned temporary files
  disappear and a fresh experiment succeeds. The concurrent request is refused
  without replacing the active one. Cleanup retains unique run-token, original
  parent and process-group authorization.
- Controlled process/root cleanup refusals occur after real engine completion.
  Each preserves the completed Evidence, retains its cleanup owner and succeeds
  on retry with the same Evidence identity. These are test injections, not claims
  of real OS permission failures.
- Original fixture hashes remain unchanged. Final fixture, package, installed
  emulation and app verifier lineages are **verified empty**.

Known results include `(9*7+4)^0x5a = 25`, the store sequence `1,4,7,10` with
sum `22`, and `2.5+4 = 6.5` represented by exact floating-point bits. Timed-out
runs intentionally do not promise repeatable instruction counts or Evidence IDs.

The tested environment is macOS arm64, supported Node 24.22.1/npm 10.9.2, and a
disposable caller-selected Python 3.13.3 environment with Unicorn 2.1.2 and
Capstone 5.0.6. Native library, launcher and live interpreter file hashes are in
the Evidence. The process/resource profile also has a Linux path; no Linux-host
or Windows real-engine claim follows from these macOS runs.

## Producing-boundary corrections

Real fixtures exposed and pinned several necessary boundaries during development:

- The pinned Python API requires separate valid/invalid memory-hook registrations.
- Stopping inside a valid-write hook can still finish the write. Native page
  protection now enforces immutability; input rejects shared pages with conflicting
  write permissions. Logical guards reject access to undeclared padding.
- Unicorn can report a sentinel instruction size for invalid x86 opcodes. The
  adapter decodes only admitted bytes before trusting that size.
- macOS framework Python can exec a different image from its launcher. The two
  identities are now recorded separately; command text is not substituted for
  per-run ownership proof when cancelling the worker.
- Segment prefixes on alignment NOPs do not imply a TLS read. The guard rejects
  actual FS/GS-dependent operations and unrepresented CPU state, while preserving
  NOP/LEA address-only behavior.

These failures are retained as development history in the companion receipt.
They do not count as final passes. Aggregate mapped bytes are checked before the
page-permission index allocates; inherited tighter kernel limits are preserved.
No target syscall or imported call is forwarded to the host.

## HeyClicky trials

The installed HeyClicky 1.1.1/build 66 executable still has SHA-256
`764a68a80f53de64a0e48a509d5a98737994f93e0888605e2de85b4028f3cb17`.
External `lipo` preparation reproduces the prior 55,971,232-byte arm64 artifact,
SHA-256 `bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911`.
That derivation is artifact preparation, not REA+ semantic recovery.

Fresh public bounded-Ghidra calls recover procedure bodies/assembly, map their
addresses to original file offsets and compare every admitted code byte with the
file. Three caller seeds use previously established entries from the unchanged
app. They remain caller assertions, not new symbol discoveries. Ghidra retains
its explicit 60-second partial-analysis scope; it is closed before emulation.
The sizing body still has **15,380 bytes**, preserving item 37's recovered region.

The selected final lineage has **25 MCP calls**: 18 initial static/model calls,
then seven final emulation/retention calls using the saved public static ranges.
A final source CLI/MCP comparison matches exactly. Earlier intermediate replay
runs remain separate rather than inflating final coverage.

| Experiment | Outcome | Evidence |
| --- | --- | --- |
| main-window | x0 = 0 at outer return | `ev_2eeea70c07970568e959d5f3e2a0f29467025b34f562145e6351f500af2aeae8` |
| key-window (flag 0) | missing_memory at `0x10132fa70` → `0x10343b260` | `ev_87078a1fb2b93a6ab73b66e536b85251f297a3ef72a8699a2b33e6453ad7129e` |
| key-window (flag 1) | missing_memory at `0x10132fa70` → `0x10343b260` | `ev_a06566659e68a7ab51bc8bf986fd86b4973ac974e51736ab442b58b695915755` |
| notch-sizing | missing_memory at `0x101319e60` → `0x103397d28` | `ev_7496d90711de2b6550cb2a0dd7e875d00080a7cefe538ce0de5bb1d78ec0be1d` |
| key-window-explicit-ivar-offset | external_call at `0x10132fa90` → `0x102dc52d0` | `ev_27d183b3f3fb9583636eb48cb737bdb408d3259fe737d0c39a605159ee0fccba` |

The main-window routine at `0x1001cfa04` is the previously mapped eligibility
method; its name here is an analyst label backed by the prior investigation.
The whole 28-byte routine reaches the return boundary with `x0=0`. This
corroborates a concrete false result, not observed Cocoa dispatch or UI behavior.

The two key-window flag inputs stop before property evaluation because the
ivar-offset global at `0x10343b260` is missing. The sizing routine stops at
`0x103397d28`; neither run establishes a completed return value. In the additional
controlled experiment, setting the former global explicitly to `8` exposes the
call at `0x10132fa90` to `0x102dc52d0`, outside admitted code. **That value is a
model input assumption, not an observed installed-runtime value.** No call stub
is supplied, and no complete focus or layout result is claimed.

HeyClicky, its helpers and runtimes were not launched as host processes. These
checks do not drive its UI, submit jobs/prompts, contact app services or read
account/settings data. Full feature/design analysis remains incomplete.

## Required checks and retained evidence

- **79 source/contract tests pass**: 60 checks across six source test files and
  19 compiled MCP contract checks across five files.
- `npm run check` passes types, lint (880 warnings, zero errors), formatting,
  unused-code/metadata checks, module boundaries and 1,522-source architecture
  guards. Documentation passes all six tasks, including localized README links.
- Duplication is **2.48%**, below the existing threshold.
- Full isolated `verify:package` passes install/update, CLI/MCP, setup/rollback,
  the Skills bundle, 203-tool catalog and verified cleanup. `npm pack --dry-run`
  includes all 1,573 planned files and the exact current emulation helper.
- An actual installed-package emulation matches source Evidence
  `ev_540cd4bc9f23d2a5860fa8e33a8d8c1afe2109da16ae906a1946cc41fc1b9c4c`.
- The full repository `check:pr` suite and live model-selection trials were not
  rerun. Schema/catalog checks do not establish model tool-selection quality.

Durable repository artifacts:

- [Fixture Evidence bundle](function-emulation-2026-10-31/evidence-bundle.json):
  43 complete authenticated records, about 464 KiB.
- [HeyClicky Evidence bundle](heyclicky-function-emulation-2026-10-31/evidence-bundle.json):
  five complete conditional model records, about 58 KiB.
- [Original static observations](heyclicky-function-emulation-2026-10-31/source-observations.json):
  twelve unchanged public Ghidra Evidence records, about 387 KiB. This selection
  is not itself a portable Evidence bundle; each contained record authenticates
  independently.
- [Compact verification receipt](function-emulation-2026-10-31.json): compiler
  commands/oracles, scope, hashes, outcomes, cleanup injections, package checks,
  raw-path references and source state.

Raw RPC/log files and compiled temporary fixtures can disappear; the complete
small bundles and selected static records above no longer depend solely on those
paths. The two existing large Rize JSONs remain untouched. Item 16's new changes
are local and uncommitted; no commit or push was performed in this task.
