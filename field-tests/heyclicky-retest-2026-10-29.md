# HeyClicky fresh retest — 2026-10-29

Fresh analysis of installed **HeyClicky 1.1.1 (build 66)** reproduces the
original targeted checks for items 30–35. It also confirms an additional
regression introduced by item 30: chained Promise continuations inherit
browser-storage authority. **OPEN_TASKS item 36 is open.** This retest changes
notes only; no production fix, commit or push was made.

**Later follow-up on 2026-10-29:** item 36 is now fixed and verified by 43
focused tests plus a new shipped-extension run. Both false continuation facts
are gone. See the [fix receipt](heyclicky-36-verification-2026-10-29.json) and
[OPEN_TASKS](../OPEN_TASKS.md). The measurements and reproduction below record
the earlier retest before that fix.

## Input and execution scope

- Installed app: `/Applications/HeyClicky.app`, bundle `com.humansongs.clicky`.
- Main universal executable: **115,396,000 bytes**, SHA-256
  `764a68a80f53de64a0e48a509d5a98737994f93e0888605e2de85b4028f3cb17`.
- Fresh arm64 derivation: **55,971,232 bytes**, parent offset **59,424,768**,
  SHA-256 `bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911`.
  A stable source handle supplied the exact FAT slice; the derivation is a
  separately identified input within the existing 64 MiB snapshot limit.
- All **288 inventoried regular app files** match the final byte recheck.
  Separately, all **222 resource files / 691,837,272 bytes** match their
  before/after manifests. Original and derived executable digests also match.
- HeyClicky, its helpers, extension and bundled runtimes were not executed.
  No app services were contacted and no user application data was accessed.
  This was an offline static test using host analyzers.

REA+ used local dirty `main` at `895057282e98d809253abf6a49ff1bf1f59aee5f`.
Fresh `npm run build:cached` exited 0, compile key `5d30062d4450ed4b`.
Node, Ghidra 12.1.4 and OpenJDK 27 were the existing host installations;
no toolchain was installed. Long verification used a temporary `caffeinate -i`
assertion; persistent sleep settings were unchanged.

## Targeted controls

| Item | Fresh observation | Result and limit |
| --- | --- | --- |
| 30 — storage-key endpoints | The four original local/session storage keys remain storage getter facts, rather than network endpoints. | Original control holds; **new continuation regression below**. The sole endpoint candidate is `content-type`, with unknown receiver and low inference confidence. |
| 31 — Electron authority | Two generic web documents; zero Electron roles or sender checks; one generic sender comparison. | Holds. `sender.id !== chrome.runtime.id` retains unknown transport/enforcement. |
| 32 — native facet admission | All four explicit facet selections work with the 20,000 aggregate decode-admission budget. Swift-only requests recover useful results. | Holds; caps and unsupported layouts remain explicit. |
| 33 — external Swift identity | Exact descriptor field/slot retains its external bind, separate from a null final file-backed target. | Holds; external protocol layout remains unsupported. |
| 34 — syntax versus static facts | `background.js`: syntax complete, errors 0, static facts partial, one unresolved occurrence, retained IR complete. | Holds. The only file-status issue is `analyze-static-facts`. |
| 35 — useful bounded Ghidra analysis | Fresh main-binary MCP overview and five pseudocode requests succeed, plus frame-helper instructions. | Holds for the explicit bounded profile; analysis remains incomplete. |

### JavaScript/resources

Fresh public CLI invocations analyzed full Resources and scoped
`ClickyBrowserExtension/**`. Full scope: **11 JavaScript files / 18 relevant
files**, 1,739,340 text bytes, 176,696 visited AST nodes, 36 static findings,
zero parse failures, retained module IR for all 11 files. Scoped: **6 JavaScript
files / 9 relevant files**, zero parse failures. Analysis calls took **25.423 s**
and **7.685 s** respectively.

Full Evidence:
`ev_f006528bb14010cea6d5143aaf3a4b61451e491605b7394eba6d9c54076937dc`.
Scoped Evidence:
`ev_d1105abe4988de128b79b1441f5f31174bce5aad4a3cd85f50bdbee1f871a5e0`.

The full semantic graph explicitly truncates two large drawing/Three
projections at the recorded 100,000 total / 20,000 per-file node ceilings.
Complete syntax or retained IR does not imply a complete semantic graph.
Module pages contain **33 full / 23 scoped entries**, distinguishing assets
and modules. A path-only background selector correctly reported ambiguity;
the exact module node-ID retry succeeded. Fresh public string search found
one `com.heyclicky.browser` match, scanning all 11 sources with complete search
coverage. Opt-in shipped-material scans returned zero candidates under their
limited rules; that does not establish absence of secrets.

There were **18 public CLI invocations: 17 successes and one expected
ambiguous-selector response**, with no unexpected command failure. Views came
from the exact newly saved portable Evidence. No fresh JavaScript MCP parity
claim is made.

### New regression — item 36

The scoped output contains nine storage observations, including **at least two
false continuation observations**, marked exact observed AST facts:

- `ClickyBrowserExtension/background.js:187:7–114`: `call:then`.
- `ClickyBrowserExtension/popup.js:248:0–130`: `call:catch`.

These continuations operate on the result of `chrome.storage.local.get(...)`;
they are not storage-area methods. The four original storage-key endpoint
corrections remain valid, but not every storage observation is correct.

The inert, source-owned fixture below was analyzed through the public CLI
without executing it:

```javascript
chrome.storage.local.get('alpha').then(value => value);
chrome.storage.session.get('beta').then(value => value).catch(() => {});
```

It produces two valid getter records plus two false continuation records,
Evidence `ev_5f9d7550ce39e84be2373f318ee81169d2565554902330f316ec8cef009679ec`.
The compact receipt preserves the exact records and source ranges.

Source inspection corroborates the public output: the producer in
`rea-local/src/domain/javascript/javascriptCallReceiverFacts.ts:464` stores
facts by `node.start`; the consumer in
`rea-local/src/domain/javascript/javascriptStaticAnalysisCalls.ts:259` looks
up the same key. Nested getter and continuation calls share a start offset,
but have different ends. The inner getter's receiver authority is therefore
reused for an outer continuation. This is an exact-call identity collision.

The false continuations were already present in the first item 30 output
(`ev_663f4ca8aa3f1be685fd17f1e77a659d26ba20b71df953478cf92c447f4a03b2`)
and item 34 output, while the pre-fix baseline had zero storage observations.
Item 30's receiver-fact generalization introduced these false storage
observations; the start-only indexing pattern already existed in the older
`.open` classifier. This is a newly discovered regression on unchanged app source.
A future fix should use exact AST node identity or complete source ranges for
receiver facts, migrate all consumers including captured-web analysis, and
cover nested calls with identical starts. Filtering continuation names alone
would leave the underlying collision unresolved. **No fix was implemented in
this retest.**

### Native metadata and bundle context

Ten fresh public CLI invocations exited 0. All four selections used
`max_records:20000` on the identified arm64 input:

| Facet | Retained result | Coverage |
| --- | --- | --- |
| `all` | 656 class-list entries / 1,312 class and metaclass records; 4,372 ivars; 3,934 Objective-C implementations; 48 Swift conformances; zero Swift slots | Aggregate cap reached before vtables; unresolved class metadata stays partial. |
| `objc` | Same Objective-C counts; 7,868 relative pointers | No record cap reached; unresolved metadata partial; Swift families `not_requested`. |
| `swift-conformances` | 3,329 entries examined/retained; five descriptors marked decoded; 22 witness slots; 16,649 relative pointers | Aggregate cap reached; other families `not_requested`. |
| `swift-vtables` | All 4,055 Swift type entries examined; 1,448 slots / 1,176 resolved implementations | No cap reached; unsupported layouts keep coverage partial. Type entries are not vtable counts. |

The conformance numbers match the post-item-33 retention scope. The earlier
item-32-only result (4,036 examined / 17 decoded / 102 witness slots) preceded
additional partial-fact retention and is not the matching budget comparison.

The exact item-33 assertion passed: descriptor field `0x102dec794`, indirect
slot `0x10330df28`, symbol `_$ss25ExpressibleByArrayLiteralMp`, library
`/usr/lib/swift/libswiftCore.dylib`, weak false, decimal addend `0`. The final
file-backed target is null and external layout unsupported. Local type
`ReadingOptions` remains separate from the null decoded protocol name.

Fresh inventory: **395 nodes / 408 occurrences / 398 edges**, zero integrity
contradictions. Apple projection: eight bundles, native/JavaScript runtime
families and **187 candidate content-co-presence bridges**, not observed calls.
The arm64 dylib trace has 11 roots / 16 images / 166 edges: one conditional
Sparkle resolution, 165 undetermined edges, four x86_64-only roots and zero
findings. Dependencies remain partially unresolved. Signature metadata retains
team `2UDAY4J48G`, hardened runtime and entitlements; no fresh full signature,
notarization or trust validation was performed.

### Fresh Ghidra MCP session and notch methods

The actual MCP input/output schemas and canonical output contracts validated
for all **10 successful calls**. The explicit profile used
`bounded-autoanalysis-v1`, **60 seconds** cooperative analysis and a
**330,000 ms** outer startup timeout. The fresh `binary_overview` call took
**111,559 ms**; the entire driver took **116,776 ms**. Resulting state is
`analysis_complete:false`, `analysis_timed_out:true`.

The stable partial Program contains **19,880 procedures / 60,845 defined
strings / 59 memory blocks**. These are partial Program inventories, not
complete app counts. Overview Evidence is
`ev_d76fc7bdc571e6a2dc8eedfc354308cb6b7edd6be8d5f2f0d997da96296f1a49`.
Content-addressed IDs can equal prior results; new invocation times, raw replies
and the fresh derived input establish this run's freshness.

| Address | Fresh inspection |
| --- | --- |
| `0x10132f900` | `NotchPanel.constrainFrameRect:toScreen:` thunk, 813 characters of pseudocode; same result as the prior bounded pass. |
| `0x10132f8c8` | Frame helper: pseudocode and all 14 instructions in the 56-byte body. Instructions preserve `d0`–`d3`, supporting a frame pass-through inference alongside the wrapper. |
| `0x10132f9f4` | `NotchPanel.canBecomeKeyWindow` thunk calling `FUN_10132fa58`. |
| `0x10132fac0` | `NotchPanel.canBecomeMainWindow` thunk calling `FUN_1001cfa04`. |
| `0x10132fd18` | Panel initializer thunk calling `FUN_10132fbf8`. |

Swift/Objective-C calling conventions remain uncertain. The helper's decompiled
`void` signature is not authoritative; the Boolean methods' displayed casts do
not establish actual return values. This inspection does not establish the
notch-positioning formula, window level, animation behavior or original Swift
source. The original 903,183 ms complete-only failure remains a failed pass in
the baseline report. This fresh main run used MCP; no fresh main CLI/MCP parity
claim is made.

Close succeeded and input hashes stayed unchanged. The generic verifier's
initial final-lineage snapshot was **unavailable**, because one descendant's
run token did not match. A separate provider snapshot had identified the
Ghidra launcher/decompiler before close. A later read-only host `ps` check
found all four known verifier/helper/provider/decompiler PIDs absent. This
follow-up establishes those known PIDs exited; it does not rewrite the earlier
unavailable snapshot as a verified empty descendant set.

## Evidence and verification

The [compact receipt](heyclicky-retest-2026-10-29.json) preserves source hashes,
profiles, command counts, exact fixture observations, Evidence IDs, coverage
counts, pseudocode and raw-file hashes. Raw full captures remain local:

- `/private/tmp/rea-heyclicky-retest-2026-10-29-js-nv6c54ep/`
- `/private/tmp/rea-heyclicky-retest-2026-10-29-a1uqjww5/native-metadata/`
- `/private/tmp/rea-heyclicky-retest-2026-10-29-a1uqjww5/ghidra/`

The prior full repository gate passed **913 files / 8,474 tests**, with
**16 files / 274 tests skipped**, on 2026-10-29. It did not cover item 36.
Production code was unchanged during this retest, so that gate was not rerun
for these notes. Receipt JSON, referenced hashes and whitespace checks were
verified separately. No target binary, provider database or large raw capture
was added to Git. The existing user-local Rize Evidence files were untouched.
