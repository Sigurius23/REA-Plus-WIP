# Arc 1.171.0 — offline REA+ field test

**Fix follow-up:** Items 38–40 are now fixed and retested. The observations below
retain the original pre-fix scope and failures; see the
[fix verification](arc-fixes-2026-11-02.md) for current capability and Evidence.

Recorded **2026-11-02** against `/Applications/Arc.app`, build **89666**,
identifier `company.thebrowser.Browser`. REA+ source: `9636c6860758f0e2e9b47acaf8b0951584ac3eff`,
local CLI/MCP **6.4.0** with the existing Node **24.22.1**, Ghidra **12.1.4**
and JDK **27**. The existing test-only Python environment supplies Unicorn
**2.1.2** / Capstone **5.0.6** for emulation; no dependency or host toolchain
was installed or upgraded.

**The field test is complete; analysis of the whole application is not.**
Arc, ArcCore and their helpers were not launched as host programs. No browser
profile, account, history, cookies, UI session or target service was selected.
The analysis utilities, isolated JavaScript worker and owned Ghidra process ran.
Two selected machine-code routines ran inside the bounded emulator without OS
or imported-call forwarding.

## Identity and input integrity

| Input | Bytes | SHA-256 |
| --- | ---: | --- |
| Original universal `Contents/MacOS/Arc` | 166,692,288 | `e82d2a4245b6239860e41a149cb31c0c030e35b383456544c81f21d45ee03376` |
| Derived arm64 main executable | 80,070,080 | `085056cad2197ab3b87b6b54a5a0d36964c5d9e756ec451a5b6f0b478c8baae8` |

The universal executable contains x86-64 and arm64. REA+'s Mach-O inspection
reports the arm64 slice at original file offset **86,622,208**. Supplemental
`lipo -thin arm64` preparation wrote a separate temporary file; its complete
bytes match that original range. This preparation is not counted as REA+
semantic recovery. Ghidra addresses/file offsets bind to the thin input;
emulation instead reads the original universal file with explicitly translated
file offsets. [Preparation receipt](arc-macos-2026-11-02/preparation.json).

A final re-read matched **all 782 inventoried regular files**, totaling
**860,945,885 bytes**, against their original inventory hashes and sizes. There
were **zero mismatches**. This does not verify symlink targets or runtime state.
[Integrity receipt](arc-macos-2026-11-02/target-integrity.json).

## Workflows and observations

Public CLI/MCP workflows exercised artifact inventory, Apple application
projection, plist/Mach-O/signature inspection, dylib resolution, scoped JavaScript
analysis and views, literal/identifier search, native procedure searches,
function dossiers, address-to-file mapping, emulation, retained bundle summaries,
export and native-session close.

- **Bundle inventory:** 1,193 content nodes, 1,305 occurrences and 1,272 edges;
  782 regular files, 491 directories and 32 symlinks. The inspection retained no
  integrity contradictions. Inventory Evidence:
  `ev_6e17893a3d3fd94940143f867d8bb2a9161e65fc99ee2f094bbd1210c29ea378`.
- **Apple projection:** 110 path-convention bundles: one main application,
  one nested application, eight helper applications, two XPC services, nine
  frameworks, one plug-in and 88 resource bundles. The 84 bridge candidates
  are co-presence hypotheses, not recovered calls or runtime loading. Projection:
  `ev_81694fde75a799ef01b658a55c25c494656e15ebef5aa83f991b4050817bd0a4`.
- **Declared architecture:** the main plist names `Arc.BrowserApp` as principal
  class; native searches recover `Arc`/`ADK` Swift/Objective-C classes, including
  `WebContentChromium`. ArcCore's plist declares **156.0.8078.74** and an SCM
  revision. This supports a native front end and Chromium-facing core boundary;
  it does not reconstruct the core's full implementation. Main metadata declares
  minimum macOS **13.0** and an updater feed/automatic-check configuration.
  These are shipped declarations, not observed update behavior.
- **Signing metadata:** identifier `company.thebrowser.Browser`, team
  `S6N382Y83G`, Developer ID authority chain and hardened-runtime flag were read.
  The entitlements include camera/audio/location, CloudKit and keychain groups.
  These declarations do not establish effective permissions, trust,
  notarization or runtime access; no independent trust assessment was performed.
- **Dylib tracing:** explicit arm64 root `Contents/MacOS/Arc` yielded five
  images and 199 edges: one resolved, three conditional and 195 undetermined.
  The reported traversal coverage is complete for that selected root/profile.
  Absolute system/shared-cache paths are outside the analyzed root, and finding
  zero warnings does not prove every load will succeed.

## JavaScript and resources

The explicit `**/*.js` scope under `Contents/Resources` selected **three of 28
considered relevant files**, read **30,640 bytes**, parsed all three JavaScript
files and visited **6,594 AST nodes**, with zero syntax failures. It covered
`SelectorPicker.js`, `DisableInlineLinks.js` and `EaselExportViewer.js`.
All three asset statuses retain complete static facts and module IR. The module
page contains six identities: three assets and three source-module nodes.
Legacy `statistics.modules = 0` counts bundled registrations, not source modules.

The semantic graph retained **5,028 nodes / 4,948 relations**, with zero budget
omissions and **1,503 explicit unknowns**. Its overall status is `unknown`;
complete parsing is not complete behavioral recovery. No Electron IPC/window
boundaries were found in this selected scope. The summary, module page,
file-status page and exact SelectorPicker module item all returned validated
public Evidence. A `postMessage` runtime-identifier search scanned all three
files and returned no matches; that scope does not promise member-property
search or absence of a native bridge.

Parent analysis:
`ev_24946305687f9c42b94a919dd282095d17918d12bf2bcbc96a8c255f7b61078a`.
[Complete JavaScript Evidence](arc-macos-2026-11-02/javascript.evidence.json).

The one network candidate is `v` from `url.searchParams.get("v")`, with
**low confidence** and explicitly **unknown receiver identity**. Supplemental
source review finds `new URL(videoURL)` inside a mutable try/catch binding before
that call. Owned public-MCP fixtures show the immutable `const` form suppresses
the query-key candidate, while the mutable shape retains it. Both preserve an
exact recognized `fetch("https://example.invalid/control")` positive control.
The fixture JavaScript was analyzed as inert text; its URL was not fetched.
This is the conservative fallback documented in item 30, with a useful receiver
refinement now recorded as **40**, rather than an exact network claim or storage
regression. [Fixture revisions](arc-macos-2026-11-02/fixture-source-history.json).

ArcCore's resources include `resources.pak` (**24,824,807 bytes**), scale packs
and locale packs. Paths and hashes are inventoried, but no inner entries were
recovered. Chromium DataPack is a **format hypothesis from package context**,
not a decoded result. The attempted game-archive operation correctly rejects the
file outside its supported game formats. A dedicated identification/inventory
capability is follow-up **39**.

## Native code and concrete emulation

Ghidra used an immutable arm64 input, a separately declared **60-second bounded
analysis profile** and **330,000 ms startup budget**. Its final observations
explicitly report `analysis_complete=false`, `analysis_timed_out=true`; the
stable partial Program exposed 64 segments, 34,296 procedure entries and 213,501
string entries. These counts describe the partial database, not an exhaustive
original-function/string inventory.

Literal procedure searches returned 19 BrowserApp, 253 Sidebar and 37 Boost
matches. Five complete selected function dossiers returned pseudocode, assembly,
body ranges, references, call relationships and the available native facts:

| Selected function | Address | Body bytes | Established scope |
| --- | --- | ---: | --- |
| Main entry | `0x100003138` | 436 | Startup pseudocode and calls, including Swift/Objective-C and environment setup; startup not executed |
| SidebarDragRegionWindow `canBecomeKeyWindow` | `0x10000b2e4` | 8 | `mov w0, #0; ret` |
| SidebarDragRegionWindow `canBecomeMainWindow` | `0x10000b2ec` | 8 | `mov w0, #0; ret` |
| AppDelegate `openBoostGallery:` | `0x100231fd8` | 12 | Tail-call wrapper into `0x1001ecfa8`; does not close the gallery feature trace |
| WebContentChromium `boostIDE:didRequestExecuteCommand:jsonString:` | `0x1005381a0` | 168 | String bridging and helper call at `0x100537fac`; command implementation not traced to completion |

Pseudocode contains calling-convention/type/reconstruction warnings, preserved
in the complete records. The direct dispatch-metadata reader separately rejects
the main file under its **64 MiB whole-file cap**, even when selecting one facet;
this is follow-up **38**. The cap also excludes the 80 MB thin file by the
reader's admission rule; thinning is not a remedy for this Arc input.

Two original-file emulation experiments use the source-backed eight-byte
sidebar bodies, translated original file offsets **86,668,004** and **86,668,012**,
explicit initial `x0=0xdeadbeef`, `x1=0x123456`, no data/stack mappings, and
16-instruction / 16-coverage / 1,000 ms budgets. Both stop at `function_return`
**before the outer RET**, with **x0 = 0** after one started `mov` instruction.
Both source parameters are ignored by these bodies; no real receiver object,
Cocoa dispatch or installed window behavior is claimed.

| Model | MCP/CLI Evidence ID |
| --- | --- |
| Key-window predicate | `ev_857b717cd44d87d40bc33c6fcf17481fc714f83ceed94d5d7ad8541ea013469e` |
| Main-window predicate | `ev_db6185891165d56f35e715170cb3fc0768488394f89d2130ae5fb988134dec07` |

The **entire CLI and MCP Evidence objects match exactly** for each experiment.
This reuses the engine profile already checked against source-built known-result
fixtures in item 16; it is not a new claim of hardware/runtime equivalence.
[Input derivations](arc-macos-2026-11-02/emulation/derivation.json).

## Verification accounting and retained failures

- **38 actual MCP tool calls:** 33 successful replies, validated against their
  actual advertised input/output JSON Schemas, canonical contracts and
  text/structured equality; five captured client request timeouts.
- **14 public CLI calls:** nine successful observations, three sandboxed native
  utility launch failures, the explicit metadata-cap refusal and the correctly
  unsupported game-pack refusal. Non-successes are retained, not counted as
  passing tool observations.
- The initial native harness gave provider queries only the SDK's **60-second
  client timeout**, too short for this import. Five calls timed out. The next
  phase uses **390,000 ms** and succeeds on the same selected artifact/profile.
  These harness timeouts are not filed as a new REA+ bug or hidden as passes.
- The first sandboxed `inspect-macho`, `inspect-plist` and `inspect-signature`
  calls failed at native utility launch (`reason: io`, tool `file`). Host-access
  repeats succeeded. The exact underlying sandbox cause was not separately
  established here; this does not indicate defective Arc bytes.
- Native, focused-worker and emulation verifiers closed with **verified empty
  owned descendant lineages**. The catalog/projection/read-only-view runs in
  the restricted sandbox report lineage observation **unavailable**, not
  verified empty. CLI processes returned their recorded exit outcomes.
- No REA+ implementation was changed. The full product test suite and package
  gates were not rerun for this documentation/artifact-only field test.

Complete unique Evidence, exported bundles, input derivations, owned fixture
source revisions, target hashes, advertised tool schemas and compact call
receipts are retained under [the artifact directory](arc-macos-2026-11-02).
Large duplicate transport replies, repeated catalogs and expanded wire-argument
logs were moved to the explicitly indexed temporary directory in
[raw retention](arc-macos-2026-11-02/raw-retention.json). They can disappear;
the substantive complete Evidence and source revisions above remain durable.
Compact receipts use explicit file references to the original input Evidence;
the reference notation is not a literal MCP request or altered Evidence.

The final [verification receipt](arc-macos-2026-11-02/verification.json) records
schema/authentication checks, parity, target integrity and call accounting.
This turn leaves local, uncommitted field-test records and `OPEN_TASKS.md`
updates; it does not commit or push them. The two existing large Rize files were
not changed.

## What remains unresolved

This test does not recover the whole Chromium core, decode the packed resources,
close the Boosts/Easel/sidebar feature paths, determine Spaces/tab-state
persistence, reconstruct sync/auth/update behavior, observe network exchanges or
verify live UI behavior. Several of those questions have further static paths
available; a successful wrapper dossier is not a tool limitation or a completed
feature trace. Follow-ups **38–40** identify the measured tool boundaries and
candidate-quality refinement, without claiming they explain every missing fact.
