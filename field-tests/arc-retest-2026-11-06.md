# Arc DMG retest and items 45–50

Date: **2026-11-06**, Europe/Berlin. Source parent:
`14855891c323e641bf224f3b7d8ee6c61050e2c7`. This batch repairs the
[three gaps from the previous analysis](arc-deepening-2026-11-03.md), then
retests the fixed **Arc 1.172.1 / build 90370 DMG** supplied by the user.
It also fixes three issues found during that work: DMG extraction, quadratic
lookup of wide returned-object fields and package-verifier archive parsing.
The supplied version differs from the
earlier installed 1.171.0 target; addresses and pack IDs were recovered afresh.

Arc, its helpers and its shipped JavaScript were never executed. No Arc UI,
profile, account or service was accessed. No target URL was fetched. Owned
Swift error fixtures were compiled and analyzed without execution. The separate
source-built macOS-bundle verification lane includes owned C/dyld runtime oracles.

## Fixed target and extraction

| Input | Bytes | SHA-256 |
| --- | ---: | --- |
| User DMG | 462,320,856 | `d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778` |
| Original universal main executable | 167,563,024 | `3cb06fbc4736f01baa4e002fcf22fbfc230452925dee15d876b23f8c385f8e63` |
| Derived ARM64 slice | 80,498,448 | `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578` |
| Main Chromium resource pack | 24,999,244 | `69989f28e4c839975fbde1c300b32cc58e1dff332729432ddbd21a26e753a49f` |

**Item 48** was reproduced through public MCP: inventory admitted the DMG,
but extraction rejected `dmg` as unsupported. Extraction now reuses the native
read-only DMG reader and preserves its mount/detach provenance. The repaired
public extraction returns **1,113 regular files / 916,318,369 bytes**. Every
regular file was independently rehashed against its extraction commitment;
the original executable, derived slice and DMG were rechecked afterward.
Symlink traversal into `/Applications` is excluded. The ARM64 slice starts at
original-file offset **87,064,576**.

The source-built macOS-bundle lane independently verifies CLI/MCP extraction
commitments, executable bytes, Applications-symlink exclusion and detach.
The original failure is retained under `dmg/`; the repaired run is under
`dmg/after/`. Extraction Evidence:
`ev_fd69ae8848fcbfe71433c432153f647496d67c7844ac53dee466e5f9aa23a0b9`.
See [target identity](arc-retest-2026-11-06/dmg-target.json) and
[final integrity check](arc-retest-2026-11-06/target-integrity.json).

## JavaScript provenance and callbacks

**Item 45** adds optional producer facts for direct synchronous local calls
returning a fresh own-data object. A caller's own-field read or destructure can
now depend on the corresponding returned field. The owned known-value backward
trace grows from **2 nodes / 1 edge** to **5 nodes / 4 edges**, reaching the literal
under the default candidate filter. The forward field trace has **10 nodes /
9 edges**. This proves a dependency; it does not invent a caller constant or
implement a general JavaScript interpreter. Aliases, reassignment, accessors,
prototype returns, overlapping mutation, escapes and unsupported function forms
remain conservative. Legacy IR can omit the new facts.

Known-output Evidence:
`ev_78388b79d4c183b6619955b78c04def0ebc923504344428807a27113d43f60ee`.

**Item 46** adds exact local callback identity and `binds-handler` relations
for admitted EventEmitter, Chrome Event and direct document/window EventTarget
profiles. The owned listener trace grows from **1 node / 0 edges** to
**2 nodes / 1 edge**. Browser receiver/dispatch identity remains partial; binding
a handler does not prove invocation, forward event arguments, or turn a
registration into a static call. Dynamic/imported/reassigned callbacks and
spread-obscured positions stay unknown. Direct `document.body` listeners fall
outside the direct document/window profile.

The fresh Arc analysis covers three loose scripts (**30,640 bytes / 6,594 AST
nodes**) plus the selected packed body. It recovers **five callback
associations**: one loose EaselExportViewer window-resize callback and four
callbacks in the packed dispatcher (three DOMContentLoaded registrations and
one `chrome.tabs.onUpdated.addListener`). Each association is traceable to its
local function. The Chrome trace is
`ev_4faef45e16ceba17511f03fdd4b1ebc22685f4224dc4fad65630819c5a65afa2`.

The packed body was selected through six public bounded literal-search windows
covering all **5,439 canonical resources**, with **zero skips**; the pack also
contains **382 aliases**. The selected resource is **15901**, decoded to
**3,301 bytes**, SHA-256
`eef3ebab7af63e3a72df06882a8185732d3c6bf71c9575bd7a4ea9785baf01fd`.
The derived filename is an analyst choice, not a recovered original filename.
Its provenance retains the pack entry, stored range/hash and decoded digest.
The loose-script endpoint view has zero candidates in this scope; that is not
a claim that Arc has no network behavior.

[JavaScript CLI parity](arc-retest-2026-11-06/javascript/cli-parity.json)
records three exact complete-Evidence comparisons: known output, owned emitter
handler and Arc packed Chrome handler. Saved producer/final bundles retain
all three analysis parents, their IR, graph unknowns and trace results.

## Swift error-register modeling

**Item 47** fixes the producing call-effect model. Installed Ghidra's Swift
convention preserves x21 across calls, although synchronous Swift throws use
x21 for error returns. This can make a real error branch disappear from high
p-code and pseudocode even while machine instructions and CFG retain it.

REA+ now clones the existing convention inside its ephemeral Program and moves
only x21 from preserved to unknown after a proved synchronous throwing callee.
The proof uses the original symbol's expanded declaration signature. Function
types nested in callbacks, returns or generic constraints cannot qualify the
outer function; async and unsupported ABI-changing thunks do not qualify.
Caller prototype overrides and user signatures are preserved. The effect
belongs to the callee, so cleanup calls between decoding and the error check
do not prevent the repair. Source bytes, parameter/return storage and source
classification remain unchanged.

Public dossiers record the original symbol, demangler-output digest, exact
call/convention/register change and address space. Unproved effects remain
explicit control-flow uncertainties, carried into native value traces
independently of truncation. Demangling has subprocess, output, symbol, cache
and per-procedure budgets. No toolchain or global Ghidra installation is changed.
The current analysis profile is `proved-native-synchronous-callee-x21-v3`;
older snapshots are not reused under that profile.

The final [source-built verification](arc-retest-2026-11-06/swift-owned-v3/verification.json)
passes real-Ghidra positive, caller-override and user-signature modes. It proves
the original missing guard, restored high-p-code branch, retained error cleanup,
unchanged parameter/return storage and signature source, and nonthrowing,
throwing-callback, generic-context and async rejection controls. A separate
Foundation JSONDecoder fixture reproduces and fixes the intervening-cleanup
pattern. Actual public CLI/MCP witness Evidence matches exactly; the owned
cleanup function also passes public MCP contracts. Binaries and Ghidra projects
remain outside Git. Other architectures and host profiles remain unverified.

Fresh public Mach-O metadata recovers the payload Decodable witness at
`0x1004caa98` and request witness at `0x10053c56c`. Public assembly establishes
the request helper `0x10053cab0` and command helper `0x10053c700`; these four
entries are supplied as explicit caller seeds, with their provenance retained.
They are not claimed as automatic Ghidra discovery.

| Arc function | Final v3 result | Evidence |
| --- | --- | --- |
| Payload decoder `0x1004caa98` | Both error branches retained at `0x1004cab40` and `0x1004cab58`; two modeled calls, zero reported control-flow uncertainties. | `ev_39a755888baca922cc1753faeac569382a8c07bdd49422ab83eb4e5168df11c2` |
| Request helper `0x10053cab0` | Five modeled decoding calls and 13 conditional high-p-code branches; one unsupported-symbol uncertainty remains explicit. | `ev_726d2def61f385052a2187e95d1c310a8048738c800d62ebc4fec7432c822d49` |
| Command helper `0x10053c700` | JSONDecoder call is modeled despite intervening cleanup; branch `0x10053c7b0`, localized-error handling and response path are restored. Two unsupported-symbol uncertainties remain explicit. | `ev_75d2743fbca847e8d5aecdb6bdeffe82d3704189e88213d57d400f013133031f` |

The command helper's machine assembly and CFG are identical to the earlier
capture whose high p-code omitted that branch. Its success path still loads
the weak `uiDelegate` and invokes dispatch-table offset `0x100`; the concrete
receiver is unresolved. The error path now retains `_swift_getErrorValue`,
`localizedDescription`, response helper `0x100576028` and error release.
[Saved-result assertions](arc-retest-2026-11-06/native/final/findings.json)
authenticate the dossiers and compare branches, assembly and CFG. The v1
intermediate captures remain under `native/` and `native/followup/`; only
`native/final/` is the final v3 retest. The failed sandbox launch is retained
under `native/final-sandbox/`, followed by a successful host run and verified
empty process lineage.

## Capacity repair and verification

**Item 49** fixes repeated linear own-slot searches during wide returned-object
projection. A weakly owned index follows each immutable semantic container,
preserving first-slot, absence, array-length and unknown behavior. The existing
two **160,000-entry** return cases pass under their original **120-second**
test timeout; the wide case completes in **87.38 seconds**. Initial timeout
failures are retained. Complete IR can exceed the supported inline MCP frame
budget: the test accepts only that exact typed parent-bound transport stop,
exports and authenticates the complete Evidence bundle, then compares full
CLI/MCP records and all original assertions. The supported transport boundary
is not counted as an additional product defect.

**Item 50** repairs the package verifier's archive-selection boundary. A noisy
prepare hook printed `.git can't be found` before npm's filename, and the old
verifier used the entire stdout as the archive path. It now reads structured
npm pack metadata with lifecycle output piped separately, validates one archive
basename and verifies it exists. Prepare/prepack still execute. The existing
real-pack isolation test now runs a noisy prepare hook, checks its receipt,
reaches the intended package-metadata rejection and preserves a caller-owned
archive. The failed package refresh is retained in
`checks/package-lifecycle-output-failure.log`. This is a verification-tooling
defect rather than a new target-analysis defect.

Verification:

- **515 source tests / 14 files** passed, covering mutation/lifetime and callback
  controls, graphs, native trace uncertainty and Ghidra profile/schema behavior.
  After the final v3 refinement, the **87 native/profile cases / three files**
  were rerun successfully; these overlap the 515 rather than adding to it.
- **38 distinct public/boundary cases / seven files** pass across the initial
  public run, repaired two-case capacity rerun and noisy-hook package isolation
  case. The initial public run had one capacity failure; its later successful
  rerun is retained separately.
- Repository check, documentation generation/check, architecture guards,
  duplication check and isolated package verification passed. The package
  exposes **205 tools / six prompts**, includes the new Java helper and skill
  43, and passes isolated install/update/setup/uninstall and empty-lineage checks.
  The refreshed source check has **913 lint warnings / zero errors**,
  **1,965 module-boundary checks** and **1,542 architecture guards**;
  duplication is **2.48%**, below the existing 2.6% limit.
- The real source-built macOS-bundle lane passes. The final source-built Swift
  verification also passes its three real-Ghidra modes and public CLI/MCP checks.

Raw logs, failed attempts, inputs and complete captures live under
[`arc-retest-2026-11-06/`](arc-retest-2026-11-06/). The shared public recorder is
[`method-driver.mjs`](arc-deepening-2026-11-03/method-driver.mjs); it validates
actual advertised schemas with AJV, named output contracts and text/structured
equality. [Capture totals](arc-retest-2026-11-06/capture-summary.json) record
**60 shared-driver calls / 58 successes / two retained errors**. Those errors
are the original DMG extraction refusal and sandbox Ghidra launch failure,
both followed by successful repaired/host runs. Separate owned Swift runs
retain **14 MCP calls** across intermediate/final profiles; the final v3 run
has five. The four final exact CLI/MCP comparisons are three JavaScript traces
plus the source-built Swift witness.

[Evidence authentication](arc-retest-2026-11-06/evidence-audit.json) checks
**43 standalone records / 40 unique IDs / 12 complete bundles**. Final native,
artifact, selected-resource, JavaScript and owned Swift sessions close with
verified empty descendants. The resource-search session and failed sandbox
startup retain unavailable lineage observations; no verified-empty claim is
made for them. The initial package refresh's compiler timeout is retained in
`checks/package-compiler-timeout.log`; the compiler lookup was verified and
the final rerun keeps the same timeout, with idle sleep inhibited for the run.
Full `check:pr` was not rerun; generated completion metadata still
records broader unverified provider coverage.

## Remaining Arc questions

These repairs improve the tool's analysis; they do not establish complete Arc
behavior. Concrete evaluator and weak delegate receivers, final overlay
rendering and coordinate spaces, extension loader/name substitution, complete
Boost state transitions/persistence and unrelated Arc subsystems remain open.
Native Programs use an explicit **60-second** analysis budget and caller seeds;
procedure absence is not proof of source-code absence. Runtime dispatch and
target activation remain unobserved. Existing earlier-version findings keep
their earlier target identity and are not silently transferred to this DMG.
