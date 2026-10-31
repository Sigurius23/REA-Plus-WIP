# HeyClicky feature and design analysis dossier — updated 2026-10-30

**Analysis remains incomplete.** The original request is to understand
HeyClicky's features, inner workings and notch design. Tool regressions,
component inventories and selected function traces do not finish that task.
This ledger now incorporates the native, browser-host, runtime, lifecycle and
limited live UI follow-ups. Earlier static captures retain their offline scope.

A feature is answered when its entry/input, decisions, state changes,
implementation and result are traced with supporting evidence. Source-derived
rules and observed runtime behavior have separate authority. An open row below
identifies unfinished tracing or an actual boundary; it is not automatically a
REA+ defect.

## What is now established

- **Notch placement:** native instructions distinguish an 820-point base-width
  transparent outer envelope from visible content. They establish per-display
  instances, safe-area/gap/fallback measurements, rounding and scale, top-center
  placement, level 26, Space flags and key/main-window policy. The visible
  state's selector and all 30 case blocks are now recovered by REA+; the full
  interpretation of their width/height decisions remains open.
- **Limited UI behavior:** the authorized CUA check observed the small notch,
  Settings expanding within its envelope and a controlled Escape collapse.
  After the user opened text mode, accessibility explicitly confirmed input
  focus. Escape then removed that focus while leaving the Chat panel expanded.
  Pure hover remains unverified; the earlier locked-Mac block is resolved.
- **Browser path:** extension hello/command → ownership and tab queues → 24
  operations → Chrome tab/debugger actions → settled snapshot/model deltas →
  same-ID result. The native helper checks its caller origin, frames JSON and
  uses configured loopback JSON-RPC `browser_poll`/`browser_reply` requests.
  Main-app admission and profile-selection handlers still need tracing.
- **Drawing path:** scanner/incremental session → marks/actions → geometry and
  layout → speech pacing → painter/motion → synthetic DOM → JSON render ops.
  Native code constructs/evaluates its JavaScript context, installs HOST,
  invokes `__drainRender`, parses JSON, dispatches operations and updates layers
  within disabled-action CATransactions. Complete callback, 3D and audio
  semantics remain open.
- **Agent process path:** native code selects the bundled/fallback executable,
  supplies `app-server` arguments, overlays environment entries, wires pipes
  and launches a Foundation Process. Outbound JSON is serialized, terminated
  with LF and written to stdin. The full initialize packet, incoming response
  correlation and session lifetime remain partial.
- **Lifecycle:** termination explicitly cancels nine Swift tasks and eight
  Combine subscriptions, then clears selected owned handles and permission
  state. URL input is checked and routed per URL through a gate and handler/
  fallback. Initializer captures establish voice, auth and history ownership;
  they do not establish those features' end-to-end behavior.
- **Tool corrections:** item 37 now restores the signed-word Swift enum switch
  and owning body through REA+ itself. Two positive compiler fixtures and 16
  rejection variants pass 72 MCP calls, with exact 30-case CLI/MCP parity. The
  app retest yields all 30 mappings and a 15,380-byte body. Item 36 uses exact
  AST call identity. Thirty domain and
  13 compiled CLI/MCP/worker tests pass; a fresh shipped-extension analysis
  removes both false storage continuations and retains the four correct getter
  keys/areas. All 222 resource hashes match. The earlier full repository gate
  predates that focused correction.

Detailed findings and receipts:

- [Native window geometry and focus](heyclicky-native-followup-2026-10-29.md)
- [Notch enum and dispatch mapping](heyclicky-notch-state-followup-2026-10-30.md)
- [Limited live UI check](heyclicky-ui-check-2026-10-30.md)
- [Browser operation and presentation source](heyclicky-browser-followup-2026-10-29.md)
- [Native browser-host transport](heyclicky-browser-host-followup-2026-10-29.md)
- [Drawing engine](heyclicky-drawing-engine-followup-2026-10-29.md)
- [Native drawing consumption](heyclicky-drawing-native-followup-2026-10-29.md)
- [Agent runtime integration](heyclicky-runtime-followup-2026-10-29.md)
- [Lifecycle and initial state](heyclicky-lifecycle-followup-2026-10-30.md)
- [Item 37 fix verification](heyclicky-37-fix-verification-2026-10-30.md)
- [Item 36 verification](heyclicky-36-verification-2026-10-29.json)
- [Machine-readable question ledger](heyclicky-analysis-dossier-2026-10-29.json)

## Feature checklist

| Question                               | Current evidence                                                                                                             | Still needed                                                                                             |
| -------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| Shipped components and activation      | Bundle/resource map; eight Apple bundles; three concrete inter-component paths                                               | Remaining activation/ownership; 187 co-presence bridges remain candidates                                |
| Browser commands, state and feedback   | Source path traced across 24 operations                                                                                      | Main-app admission and runtime exchange                                                                  |
| Popup and browser cursor design        | Popup/CSS/toolbar/cursor and reduced-motion source paths                                                                     | Actual browser rendering and interaction                                                                 |
| Browser native-host routing            | Origin/hello checks; framed JSON; loopback HTTP/JSON-RPC polling and replies                                                 | Main server authorization, profile selection and queue admission                                         |
| Notch position and size                | Host/base/scale/placement formulas; panel flags; all 30 sizing cases and owning body recovered by REA+                       | Trace all W/H decisions through recovered cases/helpers; active-display and full-screen expansion policy |
| Notch interaction and transitions      | Native focus policy; observed Settings expansion/collapse and text-input focus; Chat Escape removes focus without collapsing | Hover/leave, hit-testing, remaining states, clipping and animation                                       |
| Drawing program to geometry/output     | Selected scanner/session/geometry/pacing/painter/drain paths traced                                                          | Complete piece coverage where relevant and runtime output                                                |
| Native drawing bridge                  | JSContext setup/evaluation/HOST; drain → JSON operation dispatch → layers                                                    | Complete callbacks, isolation, detailed helpers, audio and 3D                                            |
| Agent runtime integration              | Native executable choice, arguments/env/pipes/launch, outbound LF framing                                                    | Full initialization, incoming framing/correlation, auth and turn/session lifetime                        |
| Voice and dictation                    | Controller/client initial state, constants and shortcut declarations                                                         | Actual capture, transcription, VAD, transport, cancellation and timing                                   |
| Conversations, jobs, notes and lessons | History initial state; extension storage operations                                                                          | Native fetch/paging and persistence ownership, formats, paths and migrations                             |
| Auth, permissions and integrations     | Auth initial state and gated URL route                                                                                       | Callback validation, keychain/tokens, sign-in/out/refresh, permission and integration paths              |
| Startup, updates and recovery          | Launch/termination/URL chains and explicit cancellation                                                                      | Startup predicates, called shutdown helpers, recovery and updater decisions                              |
| Other native feature surfaces          | Metadata candidates for workspace/document/lesson/overlay/take-over                                                          | Concrete entry-to-result implementation paths                                                            |
| Installed app behavior                 | Authorized limited UI check; version, Settings/Escape, text focus and Chat Escape observed                                   | Pure hover and wider runtime corroboration                                                               |

## Automatic-analysis gap 37 is fixed

The visible sizing routine at `0x101319e48` uses an unguarded Swift runtime
case index and signed 32-bit relative table. Its independently recovered enum
metadata established 30 cases; Ghidra originally omitted the case region and
reported no table. The [source-owned reproduction](heyclicky-switch-reproduction-2026-10-30.md)
confirmed that failure even with complete auto-analysis.

REA+ now joins the descriptor, declared cache/accessor, exact runtime helper and
unchanged tag flow, then restores computed edges and the existing body before
serving queries. Its native API emits all 30 mappings with distinct ABI proof;
this is no longer a manual-parser substitute for REA+ recovery. The final app
pass has **15,380 body bytes and 313 blocks**, with the missing-switch warning
gone. Full retained Evidence authenticates and agrees with the focused API and
body views. The [fix report](heyclicky-37-fix-verification-2026-10-30.md) records
72 fixture MCP calls, exact CLI/MCP parity, the app transport/export result and
verified cleanup. [OPEN_TASKS item 37](../OPEN_TASKS.md) is done.

These are recovered mappings and case code, not a complete interpretation of
all branch sizes, transitions, clipping or animation. Other metadata-backed
functions were followed with the existing configured seed workflow; seeds
retain their distinct caller-assertion scope. The source of the case bound and
switch edges is the new REA+ producer, with explicit supported forms/budgets.

## Evidence, configuration and scope

The Objective-C inventory contains **322 non-metaclass records matching the
first-party `_TtC9HeyClicky` namespace**. That is a metadata record count, not a
feature or completeness count. The bundled runtime manifests declare **0.152.1**
on both architectures. Its model catalog has **14 entries**, nine `list` and
five `hide`; these are declarations, not selected models or available services.

`Info.plist` declares `clicky`/`heyclicky` URL schemes, `LSUIElement:true`,
macOS 14.2 minimum, microphone/speech/screen/document usage strings and a Sparkle
feed/key. Declarations alone do not prove each permission or network path is
used. Shipped instruction documents were treated as artifact data.

The earlier native saved-evidence audit validated **170 replies: 157 successes and
13 preserved errors**, including closure's **46/44/2**. Seventeen earlier raw
replies were losslessly archived with verified original hashes and restoration
instructions. Closure lacks its original final session/close, summary and
verifier cleanup receipt. Later hash validation cannot reconstruct that history.
The [native report](heyclicky-native-followup-2026-10-29.md) preserves those limits.
Item 37's new provider passes and cleanup are recorded separately in its fix receipt.

All static stages remain offline: no target execution, service access or user
application-data reads during those stages. The separate CUA pass selected the
running app and read its UI under explicit authorization; a fresh launch was
not proven and app-initiated network activity was not captured. No prompts or
jobs were submitted, preferences changed, or account/permission operations
performed. Incidental account identity was not exported. No commit or push was
made; fixes and reports remain local.
