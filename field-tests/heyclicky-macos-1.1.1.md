# HeyClicky (macOS) 1.1.1: static REA+ field test

Recorded 2026-10-28. Target: `/Applications/HeyClicky.app`, build **66**,
bundle identifier `com.humansongs.clicky`. This investigation reads shipped
artifacts. HeyClicky, its helpers, extension and bundled Codex runtime were
not executed; no target service was contacted and no user application data
was read. Analysis utilities and an owned Ghidra process run separately.

## Identity and environment

| Item | Observation |
| --- | --- |
| REA+ | Local CLI/MCP 6.4.0; source checkout `895057282e` |
| Host tools | Node 24.22.1, existing Xcode/macOS utilities; Ghidra 12.1.4 with existing OpenJDK 27 |
| Shipped revision | `ClickyBuildInfo.plist`: `5c6081997` |
| Main binary | Universal Mach-O, x86_64 and arm64, 115,396,000 bytes |
| Main SHA-256 | `764a68a80f53de64a0e48a509d5a98737994f93e0888605e2de85b4028f3cb17` |
| Bundle inventory digest | `f0e768a522509880c791569baa1a3bd964bf682f64861f68bf56ebd49d572960` |
| Derived arm64 SHA-256 | `bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911` |

The arm64 input was derived with `lipo -thin arm64` into temporary storage.
It contains the original 55,971,232-byte slice at universal-file offset
59,424,768. Its metadata addresses and file offsets refer to that thin input;
they are not universal-file offsets. A post-analysis byte check matched all
**288 inventoried regular files**, including the original main binary.

## Workflows exercised

Public CLI calls covered `inspect-artifact`, `project-apple-application-graph`,
`inspect-plist`, `inspect-macho`, `inspect-signature`,
`trace-dylib-resolution`, `inspect-native-dispatch-metadata`,
`analyze-javascript-application`, `search-javascript-strings` and
`inspect-analysis-view`. Native deep analysis uses a persistent public MCP
connection so import is not repeated for every query.

- Artifact inventory succeeded: **395 content nodes, 408 occurrences and
  398 edges**; occurrences include 288 regular files and nine symlinks.
  No integrity contradictions were recorded.
- Apple application projection succeeded: **eight bundles**, native and
  JavaScript runtime families. Its **187 bridge candidates** mean content
  co-presence, not verified calls between each JavaScript/native pair.
- Mach-O inspection recovered both architecture spans, imports, load
  commands and a minimum macOS version of 14.2. Main-slice dependencies
  include AppKit, JavaScriptCore, WebKit, audio/screen-related frameworks
  and Sparkle. These declarations do not establish runtime use.
- Signing inspection recovered Developer ID metadata, team `2UDAY4J48G`,
  hardened-runtime flags and entitlements. The sandbox entitlement is false;
  JIT, audio input, camera and network-client entitlements are present.
  REA+'s signature operation reads metadata, not full trust/notarization.
  A separate host `codesign --verify --deep --strict --verbose=2` exited 0,
  reporting valid on disk and satisfaction of the designated requirement.
  No online revocation or notarization assessment was performed.
- arm64 dylib tracing examined **11 roots, 16 images and 166 edges**.
  Sparkle has a conditional in-bundle match; 165 edges remain undetermined,
  largely because absolute system paths/shared-cache contents are outside
  the target. Four x86_64-only runtime roots have no arm64 slice. Zero
  findings do not prove that every dependency will load.

The first worker/native utility attempts encountered compiler-cache denial
inside the execution sandbox. Repeating with authorized host access resolved
the process-ownership helper failure. Likewise, a sandboxed `codesign` check
reported an invalid signature, while the host check above succeeded. Neither
sandbox result is evidence that HeyClicky's shipped bytes are defective.

## JavaScript and extension results

The full resources pass selected **18 relevant files**, read 1,739,340 text
bytes, parsed **11 JavaScript files**, visited **176,696 AST nodes**, and
reported **zero syntax parse failures**. It produced 30 static findings.
Legacy `statistics.modules` is zero bundled registrations; the summary
separately reports **11 assets and 22 JavaScript-module nodes**, with 33
module-page entries. Zero bundled registrations does not mean absent code.

Complete Evidence was written to disk; the summary, module, file-status,
endpoint and shipped-material views all succeeded against that saved record.
The full semantic graph is partial at its **100,000-node ceiling**. The
per-file view identifies truncated semantic projections for
`clicky-draw-engine.js` and `clicky-three.js`, each with a 20,000-node
per-file budget. All 11 files retained complete module IR.

A second pass explicitly selected `ClickyBrowserExtension/**`: nine relevant
files, **six JavaScript files**, 19,856 AST nodes and zero syntax failures.
It retained **13,086 semantic nodes and 10,395 relations** with **zero omitted
nodes/relations and no truncation**. Its 4,600 unresolved semantic facts still
prevent a completeness claim. Scoping removes budget omissions without
resolving arbitrary dynamic behavior. The graph resolves both named
`background.js` imports (`BrowserBridge`, `ModelView`) to `core.mjs`; the
selected background-module view also succeeds without rerunning analysis.

`search-javascript-strings` examined all 11 JavaScript files and recovered
`com.heyclicky.browser` at byte offset **1,740** in
`ClickyBrowserExtension/background.js`; no files or matches were omitted.
The material scan found zero candidates under its filename/hex-literal rules
across those 11 files. This does not inspect every binary/plist format or
establish absence of credentials.

Direct review of the shipped resources supplements REA+ observations:

| Area | Shipped source evidence and interpretation |
| --- | --- |
| Browser bridge | MV3 extension 0.6.3; `background.js:33–55` connects to `com.heyclicky.browser`, negotiates protocol 1, and exchanges command/result messages. `background.js:1` imports `BrowserBridge` and `ModelView` from `core.mjs`. |
| Browser operations | `core.mjs:467–554,932–941` validates HTTP(S), refuses private tabs, manages tab ownership and uses Chrome debugger APIs. Actions include snapshots, screenshots, input, extraction and file operations. These are source paths, not observed executions. |
| JavaScript evaluation | `core.mjs:842–849` refuses password fields for its typed-input operation; `:855–868` separately accepts caller-supplied JavaScript for `Runtime.evaluate`. The input guard alone is not a general browser-policy guarantee. |
| Drawing | `clicky-draw-native.js` exports `__drainRender` and `clickyCanvas`; its header describes JavaScriptCore/Core Animation integration. Effective native consumption requires separate corroboration. |
| Bundled agent runtime | Package metadata declares Codex 0.152.1. The text launcher chooses an architecture-specific executable. Those executables were inventoried, not run or exhaustively decompiled. |
| Integration documentation | Shipped skill text describes intended behavior. `ATTRIBUTION.md:8–12` says some onboarding skill activation is not implemented; the document may be stale. Existence of a skill file does not prove an active integration. |

## Native metadata and deep analysis

Direct dispatch inspection of the universal file failed truthfully at the
**64 MiB input-snapshot budget**. Ghidra also explicitly rejects universal
Mach-O import because it cannot enforce a selected architecture there.
The changed, digest-linked arm64 input above admits both workflows.

On the thin slice, dispatch inspection at the maximum public
`max_records:20000` recovered **1,312 class/metaclass records from 656 class-list
entries**, 4,372 ivar records and 3,934 Objective-C implementation records.
Do not describe 1,312 as unique classes. Coverage is partial: the shared
record budget and unresolved ivar offsets prevent exhaustive recovery.

Swift conformance inspection examined only **96 of 4,036 entries**, decoded
zero conformances, and reached **zero of 4,055 Swift type entries supplied to
the vtable decoder** before the shared budget expired. The type table also
contains non-class types; 4,055 is not a count of vtables. Independent
section-size checks establish those entry counts. These zeros do not
establish absent Swift metadata. Generic,
resilient, async/coroutine and other unadmitted layouts also remain unsupported.

The main-slice Ghidra session opened lazily in 2,738 ms. Its first
`binary_overview {}` failed after **903,183 ms** at the explicitly configured
**900,000 ms** startup limit, with `provider_timeout`. No overview, procedure
search or pseudocode was produced from the main executable. A bounded JVM
thread sample showed Ghidra's `DecompilerSwitchAnalyzer` active. The owned
session closed successfully and the thin input digest was unchanged. This is
a failed deep-analysis case, not a successful whole-app decompilation.

A separate browser-host test succeeded on an arm64 derivation of
`Contents/Helpers/ClickyBrowserHost`:

| Input | SHA-256 and provenance |
| --- | --- |
| Original universal helper, 207,728 bytes | `5fb7e18d994bbdcb9d1d380e492fc8cf38e28efd58dea0b470db48027714965c` |
| Derived arm64 helper, 109,424 bytes | `57df5ec91fd804279fda1d46a6cd577375bf006396a3a7b4f49bd22a3d6cb179`; exact original span at offset 98,304 |

Its Ghidra overview completed in **27,829 ms**, reporting **318 procedures,
632 defined strings and 32 segment/block records**. Two public
`analyze_function` calls returned schema-validated dossiers:

- **`arm64::$writeMessage`, `0x100003a38`**, 600 body bytes, 3,713 pseudocode
  characters. Static calls and instructions show `NSJSONSerialization`, an
  output lock and two standard-output writes: a four-byte length header
  followed by the JSON payload. Assembly at `0x100003bc0–0x100003bc8` forms
  the four-byte buffer; the call at `0x100003bec` writes it. Evidence:
  `ev_d4bd40b68d8a3ebb11f6f3a077db7a9bfe1b9ae804ee234baf21f1227e7664e6`.
- **`arm64::$readExactly`, `0x100002678`**, 420 body bytes, 2,090 pseudocode
  characters. Its dossier shows `NSFileHandle` reads, `Data.append` and an
  incoming call from entry `0x100000e30`. Evidence:
  `ev_79dd53c24b8fdfc6aa7828a26dea9c4204545b9499566e0f2a0e31000f959ead`.

This supports the inferred native-message framing used by the browser bridge.
The pseudocode includes removed-block and Swift type-reconstruction warnings;
it is not original source. No runtime exchange was observed. Helper success
does not establish main-executable coverage. Both owned sessions and transports
closed, original main/helper hashes remained unchanged, and the timed-out
main analyzer and its observed decompiler children were confirmed absent.

## Notch interface: mechanism recovered, layout still partial

A focused follow-up reused the existing dispatch and Mach-O Evidence; no new
app execution or expensive Ghidra import was performed.

- **Observed:** `HeyClicky.NotchPanel` subclasses AppKit's `NSPanel`. Its
  class metadata is at `0x1033f3190`; implementations include
  `constrainFrameRect:toScreen:` at `0x10132f900`, `canBecomeKeyWindow` at
  `0x10132f9f4`, `canBecomeMainWindow` at `0x10132fac0`, and its content-rect
  initializer at `0x10132fd18`. Their bodies were not decompiled here.
- **Observed:** `NotchPanelContentView : NSView` has a `hostingView` field,
  hit-testing and file-drop handlers. `NotchWindowManager : NSObject` stores
  instances by display identifier and fields for screen/Space changes,
  Mission Control, fullscreen probes, hover dwell and a sticky hit rectangle.
- **Observed names, inferred state model:** `NotchPanelViewState` records
  visible size, notch screen origin, floating-sliver/fullscreen-suppression
  state and content scale. `NotchPresenter` records hover/expansion, text
  input, replies, attachments, chat, voice-pill phases and collapse tasks.
  Names do not establish the actual transition logic or current runtime values.
- **Supporting binary facts:** imports include `NSHostingView` and
  `NSScreen.auxiliaryTopLeftArea`/`auxiliaryTopRightArea`; the binary also
  contains the `safeAreaInsets` selector. These are not yet attributed to a
  particular positioning function.

The supported architectural interpretation is a custom native AppKit panel
positioned near the notch, with separate presentation and per-display state.
SwiftUI content inside that panel is strongly suggested by hosting metadata
and imports; the specific hosting call still needs corroboration. Exact
coordinates, notch-width fallback, window style/level, Space behavior and
animation constants remain unknown. The field test therefore maps major
capabilities and UI components without claiming full feature recovery or a
faithful recreation of the notch implementation.

## REA+ issues discovered

These are new findings from this field test, not unfinished Rize work.
They are tracked as **OPEN_TASKS items 30–35**; this investigation does not
change REA+ implementation code.

1. **Network endpoint provenance (#30).** All four endpoint-view results are
   Chrome storage keys: `clickyTabs`, `profileId` and two `cursorOverlay`
   occurrences. Source locations are `background.js:11,30,187` and
   `popup.js:248`. The suffix-based `.get` recognizer incorrectly promotes
   `chrome.storage.*.get` to a network endpoint.
2. **Electron provenance (#31).** `sender.id !== chrome.runtime.id` at
   `background.js:137` enters the Electron sender-validation facet. The
   extension's HTML pages also acquire two `electron-renderer` roles. These
   are ordinary Chrome-extension facts; generic web/native-messaging
   classifications should preserve them without asserting Electron.
3. **Native facet budgeting (#32).** Objective-C metadata consumes the one
   shared record budget before Swift vtables. The public cap is 20,000;
   callers cannot select a Swift facet or page/allocate records to it.
   Keep omissions explicit and make important facets independently inspectable.
4. **External Swift protocol identity (#33).** The known bind
   `_$ss25ExpressibleByArrayLiteralMp` in `/usr/lib/swift/libswiftCore.dylib`
   is discarded into zero at indirect pointer field `0x10330df28`, from
   descriptor field `0x102dec794`. The decoder then reports an unmapped `0x0`
   rather than the known external reference. Preserve symbol/library identity
   and truthful unsupported external-layout status.
5. **Parse-status meaning (#34).** `background.js` has zero syntax errors and
   complete retained IR, yet the unresolved expected sender expression makes
   `parse_status` partial. The file-status view calls that a partial
   *syntax* parse. Separate syntax success from unresolved semantic facts.
6. **Large native import and timeout guidance (#35).** Main-slice Ghidra
   startup exceeded the configured 15 minutes. The error identifies internal
   `list_documents` and recommends a smaller request, despite the public
   overview taking no size argument. Report the actual import/startup phase,
   the applicable deadline knob and truthful retry semantics; investigate
   useful bounded inspection without silently weakening analysis coverage.

## Evidence and limits

The companion [compact record](heyclicky-macos-1.1.1.json) contains Evidence
IDs, original identities, counts, coverage, raw-file digests and paths.
Complete raw outputs remain under `/tmp/rea-heyclicky-2026-10-28/`, including
the approximately 130 MB full JavaScript Evidence, 22 MB scoped Evidence and
11 MB metadata Evidence. Neither target binaries nor large Evidence are added
to Git by this field test.

This is an offline tooling test, not full source recovery or a runtime/security
audit of HeyClicky. Server behavior, effective permissions, live traffic,
authentication flows, browser/native-host registration and runtime enforcement
remain unverified. The app's embedded service declarations do not prove that
the deployed services honor them. The repository's prior full gate is not
repeated for report-only changes.


## Retest note — 2026-10-28, REA+ items 30–35

The [fix report](heyclicky-fixes-2026-10-28.md) supersedes the six tool defects
above within its recorded scope. The original failed main-binary Ghidra pass
remains a failure; a newly explicit bounded-analysis profile now returns a
useful, stable **partial** Program for the same arm64 derivation. MCP startup
through first overview took 143,433 ms with a 60-second cooperative analysis
budget. The resulting Program reports 19,880 procedures, 60,845 defined strings
and 59 blocks, with `analysis_complete:false` / `analysis_timed_out:true`.

The notch panel's `constrainFrameRect:toScreen:` Objective-C thunk at
`0x10132f900` now has Ghidra pseudocode, including a call to the Swift helper
at `0x10132f8c8`. Calling-convention/register warnings remain; the actual frame
formula, window level, animations and complete feature behavior are still
unverified. This resolves the inspection blocker without claiming full app
reconstruction. No HeyClicky process or service was run. Input bytes are
unchanged and final owned-process lineage was verified empty.

The [compact receipt](heyclicky-fix-verification-2026-10-28.json) preserves the
new Evidence IDs, exact raw-file hashes and focused pseudocode. The complete
raw main retest remains at `/tmp/rea-heyclicky-35-main/`.
