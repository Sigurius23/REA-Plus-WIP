# Arc 1.172.1 analysis dossier

Snapshot assembled **2026-11-08**, Europe/Berlin; fixed-version identity,
signed attributes and selector completion observations added **2026-11-09**.
Selector coordinate and cleanup follow-up verified **2026-11-13**.
Selector input filtering, candidate-query construction and visual composition
addendum added **2026-11-15**. Actual v9 reducer coverage, candidate commit/reset
and broader action entry-point observations added **2026-11-16**.
Retained-summary qualification and all 21 selected State names added
**2026-11-20**. Preference keys/default NSUserDefaults callback, Boost client
application/storage split and broader worker decisions added **2026-11-21**.
This dossier consolidates the supplied
**Arc 1.172.1 / build 90370 DMG** investigation. It is a coverage map and an
explanation of recovered implementation paths; full Arc behavior is **not yet
established**. Native analyses, resource searches and owned compiler tests have
answered several narrow questions, while complete reducer effects, durable persistence, surrounding
UI integration and broader browser subsystems remain open.

This snapshot uses retained observations only. Arc, its helpers and shipped
JavaScript were not executed in these offline passes. There are no observations
of a signed-in account, user profile, service response or live Arc UI. Source
built fixtures were compiled and statically inspected; their known source is
an oracle for tool verification, not evidence of Arc's runtime state.

## Target identity and evidence boundaries

| Input                       |       Bytes | SHA-256                                                            |
| --------------------------- | ----------: | ------------------------------------------------------------------ |
| Supplied DMG                | 462,320,856 | `d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778` |
| Universal main executable   | 167,563,024 | `3cb06fbc4736f01baa4e002fcf22fbfc230452925dee15d876b23f8c385f8e63` |
| Derived ARM64 main          |  80,498,448 | `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578` |
| Universal ArcCore carrier   | 507,526,464 | `aacb29669c253804ed263f5105a9869dcda0b6a083a58ef7b96bb10da4287dd5` |
| Derived ARM64 ArcCore       | 242,072,896 | `d5c04f2d2a6839cdd2360192950d06f4c085ff2aead2e7f10206b6e7fd7bd80e` |
| Main Chromium resource pack |  24,999,244 | `69989f28e4c839975fbde1c300b32cc58e1dff332729432ddbd21a26e753a49f` |

The retained app-plist receipt records bundle identifier
**`company.thebrowser.Browser`**. Public extraction commitments cover **1,113
regular files / 916,318,369 bytes**. The fresh extraction after temporary inputs
were cleared matches the earlier file commitments. See [original extraction][E01],
[fresh extraction][E35] and the
[identity/recovery receipt](arc-core-loader-2026-11-08/input-recovery.json).
These hashes establish artifact identity, not publisher authenticity.

Earlier reports on installed **1.171.0** remain historical. Their addresses,
resource IDs, thresholds and behavior are not transferred merely because a
feature has the same name. Exact Evidence IDs, artifact identities, operations,
profiles and file hashes for this dossier are in the
[evidence index](arc-analysis-dossier-2026-11-08/evidence-index.json).

Native observations often use explicit **1-, 15- or 60-second** analysis
policies and caller-selected entry seeds. A positive instruction or metadata
observation remains useful in a stable partial Program; an empty caller list
or missing function in that Program does not establish global absence.
Recovered pseudocode is decompiler output, not original Swift/C++ source.

## Recovered implementation layers

| Layer                      | What the evidence establishes                                                                                                                                                                                                                                  | Boundary                                                                                                                             |
| -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| Native editor UI/state     | The selected editor initializer creates a view store, SwiftUI state/observed-object storage, subscriptions and cached web-content/browser pairs. [E15][E15]                                                                                                    | This does not recover the whole window hierarchy or all Arc UI.                                                                      |
| Web-content bridge         | `WebContentChromium` implements the selected callback JavaScript route and weak UI-delegate storage. [E07][E07], [E12][E12]                                                                                                                                    | The concrete runtime object/factory choice is not observed.                                                                          |
| Native store/reducer       | The editor handoff reaches an installed send closure and captured store's generic send loop. A local `BoostsEditor: Reducer` conformance and reducer witness are identified. [E16][E16], [E18][E18], [E22][E22]                                                | The stored instance may be wrapped; static conformance alone is not an instance assignment. The v9 addendum recovers all 28 nested table/body cases conditionally; complete effects and stored binding remain partial. |
| Bundled selector source    | `ARC_BoostsEditor.bundle` contains a 11,068-byte `SelectorPicker.js`, retained in the fixed-version loose-script analysis. [E36][E36]                                                                                                                          | Source presence does not prove loading into a particular page/world.                                                                 |
| Native selector completion | Selected async entries schedule cached-source evaluation, continue after releasing a bootstrap error, and reach two `Published` value-update branches. An exact indexed hover-class query returns 17 vtable rows / two resolved targets. [E71][E71]–[E78][E78] | The selected input/state/drawing route is recovered in the selector addenda; concrete receiver, unsupported slots and live display remain unresolved.                               |
| Packed extension sources   | Public pack reads recover manifests and inert Google Docs/Slack/Web Store/Notion sources with exact resource identities. [E28][E28]–[E32][E32]                                                                                                                 | Three selected filename-to-ID mappings are corroborated below; activation remains unobserved.                                        |
| ArcCore native support     | Selected code supplies the manifest resource, brands it, parses/registers a component and conditionally reaches an activation handoff. [E26][E26], [E33][E33], [E65][E65]–[E69][E69]                                                                           | Runtime flags/overrides and activation remain unobserved; this is not complete recovery of ArcCore or Chromium.                      |

No global browser architecture or process-isolation claim is inferred solely
from framework names, imports or the package inventory.

## Feature coverage checklist

“Answered” below closes the stated narrow static question. “Partial” means a
route has useful recovered links but lacks a required decision, state effect or
output. “Unassessed” means this investigation has not traced that subsystem.

| Question                                                                                                          | Status                                   | Established result                                                                                                                                                                                                                            | Evidence still needed                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------- | ---------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| Which exact package/build is under analysis?                                                                      | Answered                                 | Fixed DMG, main/Core slices and regular-file commitments above.                                                                                                                                                                               | No additional identity evidence for these selected bytes.                                                                                       |
| Which local UI-delegate implementation handles Boost commands?                                                    | Answered, static assignment              | Editor delegate has substantive code; the frame's corresponding slot is a return stub. [E05][E05], [E06][E06], [E08][E08]                                                                                                                     | Runtime instance selection remains a separate question.                                                                                         |
| How does a decoded command reach native state dispatch?                                                           | Partial                                  | Weak delegate → editor → `_viewStore` → installed send closure → captured store send. [E04][E04], [E17][E17], [E18][E18]                                                                                                                      | Concrete stored reducer/wrapper binding and every command's state/effect path.                                                                  |
| What are the four command type strings?                                                                           | Answered, static derivation              | Fresh comparison constants encode `v2-load-css`, `v2-edit-css`, `v2-load-js`, `v2-edit-js`. [E03][E03]                                                                                                                                        | Actual submitted-message behavior is unobserved.                                                                                                |
| What are the exact JSON key spellings on 1.172.1?                                                                 | Answered, static witness implementations | Fresh metadata-selected getters return `boostId`, `type`, `data` and `contents`. [E38][E38]–[E43][E43]                                                                                                                                        | No additional spelling evidence; runtime witness population and submitted-message behavior remain unobserved.                                   |
| Which JavaScript evaluator does the selected selector route use?                                                  | Answered, selected implementation        | Callback `executeJavascript:reason:completion:` path, main-actor completion, String cast and JSON decode. [E11][E11]–[E14][E14]                                                                                                               | Runtime world, frame and concrete web-view instance.                                                                                            |
| How is the selector library supplied?                                                                             | Partial                                  | Resource loader/cache, async scheduling, cached-source forwarding and a caller that releases a bootstrap error before continuing are recovered. [E25][E25], [E72][E72]–[E75][E75]                                                             | The initiating event, next-stage implementation, concrete page/world, per-page lifetime and actual evaluation outcome.                          |
| Which point-state changes start a hover lookup? | Answered, selected static route | The bound State callback stores the latest optional point, clears the published rectangle for absent input, and otherwise skips lookup when both coordinates remain in the same two-unit rounded bucket. [S01][S01]–[S03][S03] | The native event producer and physical coordinate meaning remain separate questions. |
| How are points/rectangles transformed and drawn? | Partial | Flipped-view local input, reciprocal point-query scaling, forward rectangle-result scaling, State assignment and candidate shape/position/frame construction are recovered. [S21][S21]–[S27][S27], [S16][S16], [S17][S17] | Specific Chromium viewport/page/world correspondence, surrounding origin/clip/scroll, live scalar value, native window placement and actual rendered output. |
| How is native pointer tracking installed, updated and removed? | Answered, selected static route | Concrete NSViewRepresentable creates FlippedView and coordinator, installs its NSTrackingArea, updates weak view/enabled storage and removes tracking areas at teardown. [S21][S21]–[S25][S25] | Actual runtime view/event delivery is unobserved. |
| How are unready or failed rectangle queries handled? | Answered, selected static route | Up to five attempts with requested50ms sleeps; success replaces the drawing State, while exhaustion clears it. [S27][S27], [S29][S29], [S30][S30] | This does not establish every possible cancellation/evaluator failure path or elapsed runtime. |
| How is each Spotlight candidate shape/frame constructed? | Answered, selected static builder | Continuous RoundedRectangle corner sizes10/10, white Color, overlay blend mode, position at rectangle midpoint and centered frame enlarged by20 in each dimension. [S17][S17], [layout derivation](arc-selector-v8-2026-11-15/symbolic-layout-source-verification.json) | Surrounding coordinate system and actual rendering remain outside this narrow question. |
| What does a selected picker tap request and how is its result selected? | Answered, selected static result path | A guarded tap requests point-derived candidates; the native continuation filters match counts at 500, stores the array and selects its first candidate (or nil if empty). [S05][S05], [S07][S07], [S08][S08], [V02][V02], [V03][V03] | Actual live evaluation outcome and broader error presentation remain unobserved. |
| How is a candidate selector committed or reset? | Partial | The registered action invokes a captured callback with the selected selector, then resets locked-selection, candidate-array and selected-candidate State. [V04][V04], [V05][V05] | Concrete captured consumer and its end-to-end appendZap/storage effect. |
| Does the actual Boost reducer expose every nested dispatch case? | Answered, conditional static table/body coverage | The actual v9 export has all 28 targets/case labels, 10,072 owned bytes and 2,518 instructions, agreeing with the independently read table. [V01][V01] | Full case-effect semantics, pre-tag ownership/copy, runtime stored binding and reported throw/value-flow limitations remain. |
| How does editor browser/web-content state change?                                                                 | Partial                                  | Internal CSS/JS URL construction and conditional cache-release path are recovered. [E20][E20], [E21][E21]                                                                                                                                     | URL handlers, concrete manager methods and complete state transitions.                                                                          |
| How are Boost edits stored and restored? | Partial | Recovered update/appendZap/IDE branches reach a shared state-mutation and effect-composition helper; concrete async/dependency boundaries are identified. [V06][V06], [v9 feature ledger](arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/feature-findings-phase5.md) | Durable write/readback, concrete dependency consumer, failures and identity association remain unproved. |
| How does the Google Docs helper inject its page code?                                                             | Partial                                  | Manifest scopes, extension URL creation, appended script, conditional canvas-annotation script construction. [E28][E28]–[E30][E30]                                                                                                            | Actual native registration and page/CSP/Trusted Types outcomes.                                                                                 |
| How is the internal extension branded/registered?                                                                 | Partial                                  | First branding replacement, override-aware manifest read, parse, gated vector registration and conditional creation/identifier-check/activation handoff are traced. [E26][E26], [E44][E44]–[E49][E49], [E65][E65]–[E69][E69]                  | Remaining identifier helpers, runtime override/brand/policy state and actual activation or service-worker execution.                            |
| Sidebar/tabs/spaces/navigation and sidebar restoration? | Partial, selected entry points | nextSpace/reload forward actions through viewStore; switchToTab/sidebarToggle have exact native worker targets; exact RestoreSidebarDataFlow class/conformance implementations are selected. [V07][V07]–[V10][V10] | Worker decisions, final feature reducers/browser primitives, storage format/location, migration and restoration failures. |
| Account/sync, downloads/history, storage security and general browser networking? | Unassessed as end-to-end features | Package/type/resource observations may exist. | Entry points, decisions, state ownership, durable effects, outputs and failure paths for each subsystem. |
| Which component identities and signed attributes ship in this fixed build?                                        | Answered, selected static attributes     | All 28 inventory-selected Mach-O carriers have signature Evidence; 22 executable-bearing bundle plists identify the fixed version and declarations. 24 of 28 carriers, including the main, report hardened runtime. [E50][E50]–[E64][E64]     | Filesystem resource-seal/trust/notarization validation, independent universal-slice equivalence and actual runtime isolation remain unassessed. |

## Boost command path

For the selected static implementations, the recovered handoff is:

```mermaid
flowchart LR
    A[Chromium Boost callback] --> B[Swift JSON decoding]
    B --> C[Weak UI delegate]
    C --> D[BoostsEditorWindowContent]
    D --> E[Editor view store]
    E --> F[Installed send closure]
    F --> G[Captured store send loop]
    G --> H[Stored witness target unresolved]
```

The decoder's success path obtains the weak UI delegate and invokes offset
**`+0x100`**. Metadata and assignment code identify the editor's corresponding
slot as **`0x1012d2ddc` → `0x1012d2b84`**. The frame implementation at
**`0x100006b90`** returns immediately. The editor handler stops if its optional
Boost IDE object is absent; otherwise it translates one of four variants and
hands off its payload. [E04][E04]–[E08][E08]

The field originally called an unnamed dispatch object is **`_viewStore`** at
editor offset **`0x08`**. Initialization stores a constructor result there.
The view-store constructor installs **`0x1008ca400`** and context at **`+0x28`**;
that context retains the incoming store at **`+0x18`**. The closure reaches
**`0x1008c7c34` → `0x10088d940`**. The generic routine appends an action and calls
through a stored witness at **`0x10088de88`**. Its observed body has **806
instructions / 3,224 bytes**. The direct target resolver explicitly leaves that
call unresolved. High-pcode also retains truncation; complete machine listings
must not be substituted for complete value flow. [E15][E15]–[E19][E19]

New selected metadata identifies **`BoostsEditor: Reducer`**, conformance
**`0x103788ae8`**, table **`0x1046270d8`**, with a reduce witness at
**`0x1012a9870`** forwarding to **`0x1012a571c`**. This narrows the implementation
candidate without proving that the captured runtime store holds this exact
unwrapped table. In the historical Nov8 capture, the nested outlined tag helper **`0x1012b2860`**
preceded an unrecovered signed-word jump at **`0x1012a5bc8`**. The Nov16 v9
addendum supersedes that table/body gap for the selected reducer under its
explicit typed-snapshot assumptions; complete CSS/JavaScript effects remain
partial. [E22][E22]–[E24][E24], [V01][V01]

A later public byte read retains **112 bytes / all 28 signed words** in the
selected table. It agrees with the original 24-word prefix and removes that
read-coverage gap. Assigning those entries to the active child value still
requires the caller-type/projection proof; the read does not repair ownership
or establish every case effect. [Complete table read][E70]

The response helper **`0x100576028`** uses JSONEncoder and dispatches either
`sendResponse:jsonString:` or `sendErrorResponse:jsonString:`. The explicit
error variant and JSONEncoder-failure fallback follow different paths; they
must not be collapsed into one generic “error response” behavior. [E09][E09]

The fresh command-type constants are decoded in
[the small-String derivation](arc-analysis-dossier-2026-11-08/command-type-derivation.json).
Fresh `CodingKey.stringValue` requirement metadata selects request getter
**`0x10053c4ac`** and payload getter **`0x1004ca7a8`**. The request getter reads
a byte tag and returns small-String words for **`boostId`**, **`type`** and
**`data`**; the payload getter returns **`contents`**. Exact instructions and
pseudocode agree. This closes the former spelling caveat on the supplied
1.172.1 bytes. The static resilient records still say **`not_instantiated`**:
record ordinal 2 is not a populated runtime slot. The seeded, one-second
partial Program completed seven public calls without error, exported its
Evidence, closed successfully and retained an empty-descendant verifier receipt.
See [the getter derivation](arc-analysis-dossier-2026-11-08/codingkey-verification.json).
No command was sent. [E38][E38]–[E43][E43]

## Selector execution, geometry and lifecycle

`WebContentsAdaptor: SelectorPickerWebContents` is identified by metadata.
Its shipped four-word template retains a hole, async descriptor
**`0x10378c758`**, and scale getter **`0x1012fa5e0`**. The template is distinct
from an instantiated runtime witness table. [E10][E10], [E37][E37]

The selected async entry **`0x1012fa578`** switches through main-actor code to
**`0x1012fa3a0`**, handles missing web content and forwards into the shared
execution path. The selected implementation's callback closure reaches
**`0x100557874`**, then `JavaScriptExecuting` slot 2 and
**`0x10054eb6c` → `0x100548344`**. That code checks execution availability,
holds an `emitFreezingVote:` token and calls the native web view's
**`executeJavascript:reason:completion:`**. Completion is marshalled to the main
actor, then the selector continuation checks String presence/type and invokes
JSONDecoder. The distinct slot-3/DevTools async route is not substituted for this
callback route. [E11][E11]–[E14][E14]

A later consumer **`0x1012e560c`** calls `_swift_once` for source initializer
**`0x1012e626c`**, reads the cached String words and forwards them through a
captured async descriptor. This establishes source forwarding beyond merely
finding the bundled file. It does not establish which live page/world evaluates
it or that evaluation succeeds. Source filename/line constants used by the
native executor are debug context, not isolated-world identifiers. [E25][E25]

Retained async entry **`0x1012e55f0`** stores its incoming arguments and
schedules that cached-source consumer through `_swift_task_switch`. Its
continuation **`0x1012e56b8`** deallocates the child task context and selects
**`0x1012e5714`** or **`0x1012e5758`** according to returned X20. Another selected
caller **`0x1012e4ec4`** schedules the same consumer with continuation
**`0x1012e4f58`**. That continuation explicitly releases a nonzero error value
through `_swift_errorRelease`, then schedules **`0x1012e5788`** in either case.
On this selected path bootstrap failure is released and the enclosing operation
proceeds; the operation's initiating event and the next-stage body remain
untraced here. No live evaluation result is inferred. [E72][E72]–[E75][E75]

The retained next continuation **`0x1012e4fd4`** routes to
**`0x1012e5088`** or **`0x1012e5148`**. These pass four eight-byte words plus a
flag, or four zero words plus flag **1**, through Combine's `Published` enclosing
instance setter with the same keypaths. Both clear a field addressed through
the global rendered as `_status`; if its prior unsigned byte exceeds **1**,
they call **`0x1012e4d6c`**. These observations establish selected value-update
paths, not the complete value type, concrete receiver or visible rendering.
[E76][E76]–[E78][E78]

Exact indexed-class selection now establishes **`HoveredElementTracker`** at
descriptor **`0x103d7bcb4`** without spending admission on earlier classes.
The query examines **11,125 / 11,125** type-index entries, finds one matching
descriptor and no unresolved index identities, and retains **17 vtable rows**.
Only metadata word slots **21** → **`0x1012e4cec`** and **30** →
**`0x1012e4d6c`** resolve to native targets; the other 15 rows remain partial.
Word slots are not source method ordinals, and the unresolved rows are not all
labeled async. The second target agrees by address with the helper in the
publication paths; it does not prove the concrete runtime receiver. No class
metadata was instantiated. That utility retest did not analyze the target bodies;
the Nov13 native follow-up below does. See
[the selector report](arc-selector-rendering-2026-11-09.md).
[E71][E71]

The exact fixed-version JavaScript wrappers use `document.elementFromPoint`,
`getBoundingClientRect` and `document.querySelectorAll`. Hover output contains
rectangle components and a hash; `rectsForSelector` forwards `left`, `top`,
`width`, `height`. The candidate source filters matches at **100**. These are
analyst source observations bound to the recovered module's digest in
[the source-facts receipt](arc-analysis-dossier-2026-11-08/selector-source-facts.json),
not a complete semantic trace or DOM execution. [E36][E36]

The native scale getter defaults to **1.0** without web content and otherwise
reads a feature value through a virtual getter, converting Float to Double.
The selector request applies reciprocal scaling to lookup coordinates. The
final AppKit/SwiftUI overlay transform, drawing and event lifetime remain open.
An earlier installed-build native candidate threshold of 500 is not promoted
as a verified fixed-build threshold here.

Editor URL builder **`0x1012d3b04`** reads identifier/mode via view-store
keypaths. With an identifier, raw mode **1** selects `arc://boost/v2/js/`;
another admitted branch selects `arc://boost/v2/css/`; raw mode **2/3** produces
no URL. The URL route handlers remain unknown. A separate weak subscription
callback reaches **`0x1012d3478`**: with a live editor/native object and mode
2/3, it calls a manager slot and zeros/releases cached browser and web-content
pairs. That is a conditional static cleanup path, not an observed window close.
The separate Combine notification pipeline is not the command-send closure.
[E20][E20], [E21][E21]

## Packaged extensions and ArcCore boundary

Fixed-version manifests/sources are recovered from the main pack:

| Resource | Recovered material                                                                                                                            | Evidence   |
| -------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| 15548    | Google Docs helper manifest: document URLs, all frames, document_start and exposed `gdocs_script.js`                                          | [E28][E28] |
| 15865    | Creates an extension URL for `gdocs_script.js` and appends a script element                                                                   | [E29][E29] |
| 15866    | Builds the `_docs_annotate_canvas_by_ext` write, using runtime ID or currentScript URL; Trusted Types/eval or appended inline script branches | [E30][E30] |
| 15558    | `<APP_NAME> Internal Extension` MV3 manifest; background service worker and selected HTTPS host permissions                                   | [E31][E31] |
| 15901    | Slack/Web Store/Notion site dispatch; CSS/script requests and branding input from the first manifest-name word                                | [E32][E32] |

The selected pack searches examine all **5,439 canonical entries**, accounting
for **382 aliases**, but only for their selected literal queries. This is not
complete feature analysis of every resource. Fresh loaded native byte reads
corroborate **`reading_mode_gdocs_helper/content.js` → 15865** at
**`0xe1d2370`**, **`reading_mode_gdocs_helper/gdocs_script.js` → 15866** at
**`0xe1d2390`**, and **`arc_internal_extension/background.js` → 15901** at
**`0xe1d2430`**. Each record contains the retained path pointer and resource ID;
separate public byte reads retain the exact pointed-to strings. These close
three filename/body associations, while actual page/extension activation and Google Docs native
registration remain open. The
[byte derivation](arc-analysis-dossier-2026-11-08/resource-path-derivation.json)
records the offsets and decoding. [E46][E46]–[E49][E49]
The limited semantic traces explicitly remain partial, so the source-level
interpretations above are not mislabeled as complete semantic recovery.

The selected ArcCore function **`0x4448490`** requests resource **15558**, selects
`Arc` or `Dia` from a stored flag and passes `<APP_NAME>`/length 10 plus the
selected three-byte name to **`0x31e54dc`** before a handoff with
`arc_internal_extension` to **`0x34b133c`**. The replacement callee searches and
compares the supplied substring, moves the replacement and trailing bytes,
updates the size and returns after the first match. This establishes first
placeholder replacement on that selected call path. The resource-read helper
**`0x2299440`** first permits a virtual override, then falls back to the resource
lookup; the shipped pack is therefore not the only possible runtime source.
Actual chosen flag/override values remain unobserved. [E26][E26], [E44][E44], [E45][E45]

The handoff calls **`0x34b13e0`**, which retains a parse-failure branch logging
`Failed to parse extension manifest.`. On success **`0x34b14b4`** resolves a
relative root through path-service key **`0x3ed`**, obtains an identifier, applies
acceptance checks and appends a **72-byte** entry to its vector. The path-service
enum name and policy results are not inferred from their numeric values.
Under an owning-state flag, **`0x32f233c`** attempts construction, logs a failure
if no object is returned, compares the created object's identifier with the
stored identifier and hands it to **`0x32f406c`** on equality. This is a selected
conditional activation path in code, not observed activation. [E65][E65]–[E67][E67]

Identifier helper **`0x31e5204`** selects the manifest field **`key`**, calls
**`0x31e52b0`** and **`0x2d8c700`**, and preserves missing/invalid-input empty
results. Those untraced callees are not labeled with a decoding/hash algorithm
and no final extension ID is assigned. The full
[Core registration/resource report](arc-core-loader-2026-11-08.md) also retains
DataPack canonical/alias lookup, raw/gzip/Brotli conversion, resource-request
failure diagnostics and their selected ownership. The final loader session
completed **15/15 calls**, exported and explicitly closed with verified empty
descendants. Its **44-record/five-bundle** audit and 14 selected finding checks
do not close actual runtime flags, deeper activation effects, Google Docs native
registration or page/CSP/Trusted Types outcomes. [E68][E68], [E69][E69]

The separate function **`0x4446538`** contains native URL-loader decisions,
`[SentryTunnel]` logging and conditional extension-ID comparisons. Its source
unit name and nearby strings do not make it the manifest loader or establish
that its intercepted IDs belong to either recovered manifest. [E27][E27]

## Fixed-version component identity and signed attributes

The authenticated fixed-DMG Apple projection identifies one application root,
eight browser helper applications, nine frameworks, 88 resource bundles,
Sparkle's Updater and two XPC services, and a DockTile plug-in: **110 bundles**
under path conventions, containing **28 Mach-O executable candidates**.
These are packaged components, not observed processes or proved isolation
boundaries. The existing graph is reused rather than reinventoried. [E50][E50]

Fresh public CLI inspections cover all 28 selected Mach-O carriers and 22
executable-bearing bundle plists. All displayed signatures name team
**`S6N382Y83G`** and the Browser Company's Developer ID authority. The main
executable reports hardened runtime; the flag is true for **24 of 28 carriers**
and false for four supporting library carriers. A library flag does not establish
the sandbox or hardening of the process that loads it. The full matrix and
all exact identities are in the [scoped hardening report](arc-fixed-identity-hardening-2026-11-08.md)
and its [finding rows](arc-fixed-identity-hardening-2026-11-08/findings.json).
[E51][E51], [E56][E56]–[E59][E59], [E63][E63]

The main entitlement dictionary declares CloudKit/container identity,
webcredentials, WebAuthn and two keychain groups, camera, audio-input and location
capabilities. Both GPU and both Renderer variants declare `allow-jit`; the two
generic browser helper variants declare `disable-library-validation`. Null
entitlement results remain unknown rather than empty dictionaries. These are
signed declarations, not actual permission grants, service use or Chromium
sandbox observations. Separate main-app and file-target reads agree on displayed
signature attributes; command-capture byte counts retain their different
temporary-path lengths. [E51][E51], [E53][E53]–[E55][E55], [E64][E64]

The main plist declares **1.172.1 / 90370**, minimum macOS **13.0.0**,
`Arc.BrowserApp`, `mailto`/`https`/`http`/`arcBrowser` handlers and a stored Sparkle
update URL/key with automatic-check/update settings. No update URL was fetched.
Its ATS dictionary allows arbitrary loads; Downloader's selected dictionary
does not. This does not trace which browser requests use ATS. Sparkle's selected
Updater/XPC declarations remain distinct from observed service behavior.
[E52][E52], [E60][E60]–[E62][E62]

The signature operation displays a digest-verified Mach-O snapshot and does not
validate bundle resource seals, certificate trust/revocation, notarization or
current Gatekeeper acceptance. Default-architecture display does not prove both
universal slices equivalent. Explicit plist calls retain the native context as
Evidence subject while naming the selected plist in `parameters.path` and
`source_path`; their input hashes are separate scope/integrity receipts. The
[hardening verification](arc-fixed-identity-hardening-2026-11-08/verification.json)
authenticates 53 retained records and 50 successful utility calls plus the extra
main-app observation, checks claimed fields/counts and separately rehashes all
50 selected inputs. The initial universal-Ghidra binding failure remains in its
original receipt; utility CLI routing recovered without executing the target.

## Tool gaps and completion criteria

Items **38–54** are repaired within their recorded tool profiles. That does
not close app features automatically. Item **55** is an owned reproduced
fixed-layout Swift dispatch extension gap; the existing resilient 30-case
control remains valid. A bounded private-copy profile now recovers both owned
24-case fixtures. Arc's dynamic outer allocation and SIMD projection remain
unrecovered: the final v7 observation still has **2,024 body bytes across an
8,608-byte span**, with no derived nested table. [Fresh boundary][E85].
A second enum can share/fold the getter while having a different total case
count. A safe repair needs caller-type and copy/projection/non-escape provenance;
helper bytes or neighboring table words cannot supply a case count. See
[the probe](arc-reducer-dispatch-probe-2026-11-08.md).

The seed-file diagnostic repair (54) has 29 source cases and three actual
CLI/MCP comparisons, including Arc. These error checks establish actionable
configuration diagnostics, not new app behavior. See
[the repair report](arc-seed-diagnostics-2026-11-08.md). Test counts from the
separate reports overlap and are not summed into a global “all passed” count.

Item **56** is complete for exact indexed nominal-class selection before
vtable decode admission, with shared index-span validation before full-index
enumeration. Its fixed Arc query above is independently recovered by matching
CLI/MCP results. Unsupported rows remain partial; this metadata capability does
not close the final selector drawing or lifetime questions. See
[the repair/retest report](arc-selector-rendering-2026-11-09.md). [E71][E71]

The fresh selected vtable methods give two further static links. **`0x1012e4cec`**
reads a Combine `Published` value and copies four words plus a flag to its output.
**`0x1012e4d6c`** checks the byte addressed through the global displayed as
`_status`, an optional object at receiver `+0x10`, and a flag at `+0x30`.
Its admitted branch writes status **1** and captures the object/value/self for
an async task; the alternate branch writes status **2**. Concrete runtime
receiver identity and the complete meanings of these fields remain unobserved.
[Published getter][E79], [guarded task start][E80].

The bootstrap's next stage **`0x1012e5788`** calls the captured scale getter,
computes its reciprocal, and passes the captured point with zero width/height
to **`0x100958330`**. That helper calls `CGRectGetMinX`, `CGRectGetMinY`,
`CGRectGetWidth` and `CGRectGetHeight`, multiplies each by the factor and returns
four scalar register results. Its decompiled single-result signature omits
part of this aggregate return; the instruction sequence establishes these facts.
The caller assembles **`getHoveredElement({x: …, y: …})`** from the retained
22-byte prefix, formatted scaled coordinates, `, y: ` and `})`, then dispatches
through its captured async evaluator. [Query stage][E81], [geometry helper][E82],
[literal prefix][E83].

Continuation **`0x1012e58e4`** deallocates its child context, releases the query
String, stores the returned error register, and schedules **`0x1012e5948`** for
zero or **`0x1012e59e4`** otherwise. The success branch calls the scale getter
again, scales the returned rectangle with the same helper, stores four scalar
results and flag **0**, clears X20 and resumes. The error branch resumes without
that success write. This closes the selected query's reciprocal input scaling
and forward result scaling; runtime scale values, page/world selection,
remaining coordinate spaces and final drawing stay open.
[Query completion][E84], [success result][E87], [error continuation][E88].

The final public Arc pass completes **20/20 calls across three sessions**,
exports three bundles and explicitly closes each target successfully. A further
**5/5-call** selector-return pass also exports and closes cleanly. The shared
cleanup repair retains process/group candidates while spending the supervisor's
existing grace deadline; persistent ownership uncertainty still fails closed.
Earlier failed closes retain their original status. See the
[cleanup repair](arc-cleanup-settlement-2026-11-09.md).

Temporary inputs were cleared again before this follow-up. A fresh public DMG
extraction and an explicit ARM64-header slice derivation recover the same main
hash into an ignored workspace cache. [New extraction][E86],
[input recovery receipt](arc-dispatch-load-2026-11-09/arc-input-recovery-2026-11-13.json).

The recorded native analyses also preserve capacity and cleanup uncertainty.
One ArcCore close reported `cleanup_incomplete`; a later fresh absence check
and manual removal of that run's disposable workspace are retained separately.
The original error is not rewritten as a successful close. See
[the cleanup receipt](arc-core-loader-2026-11-08/manual-cleanup.json).

For each remaining feature, completion requires a traced entry/input, relevant
decisions, concrete state/effect implementation, its output and failure paths.
The immediate order is: prove/fix the reducer dispatch shape and retest its
case bodies; close CSS/JavaScript URL handlers and durable Boost persistence;
finish remaining identifier/activation effects and Google Docs native registration;
then finish the initiating selector event, page activation, remaining coordinate
spaces and rendering. Broader browser subsystems require their
own entries and end-to-end traces. Missing runtime values may remain explicit
assumptions; they must not be replaced with invented observations.

## Selector addendum: 2026-11-15

This addendum extends the historical E01–E88 snapshot with separately indexed
**S01–S10** observations. The earlier Evidence index and its 88-record audit
remain unchanged. The new anchor file is
[selector-addendum-index-2026-11-15.json](arc-analysis-dossier-2026-11-08/selector-addendum-index-2026-11-15.json).
The detailed retained reports are the
[point/filter and tap trace](arc-feature-followup-2026-11-14/selector-tracking-findings-2026-11-15.md),
[lifecycle/helper follow-up](arc-feature-followup-2026-11-14/selector-reopen-findings-2026-11-15.md),
[v8 selector phase 0](arc-selector-v8-2026-11-15/findings-phase-0.md) and
[v8 selector phase 1](arc-selector-v8-2026-11-15/findings-phase-1.md).

`SelectorPicker` content binds a SwiftUI point State change to the capture
adapter `0x1012f0174`, then `0x1012f0028`. The worker records the latest point
before filtering. An absent point publishes an absent rectangle. A present
point starts lookup if there was no previous point or the two quantized
coordinates differ. Machine instructions give the quantizer as
**`Q(x) = 2 × FRINTA(x / 2)`**, with ties rounded away from zero. These are
coordinate units; physical pixels are not established. The producer adapter
`0x1012f14dc` forwards to `0x1012ef1f4`, which projects a four-word optional
input to the optional point and writes that State. [S01][S01]–[S03][S03]

The visual child installs tracking on a white view with opacity **0.01** and
a single-tap callback. The tap worker requires no stored rectangle plus a
present point/current published rectangle; it stores that rectangle and
schedules a task. The selected task stage transforms its point using the
reciprocal adaptor-supplied Double and constructs
**`getSelectorCandidates({x: …, y: …}, {})`** before handing the String through
the selected adaptor execution path. This closes String construction, not
candidate response or selection effects. [S04][S04], [S05][S05],
[S07][S07], [S08][S08]

The shared helper `0x100b080a8` attaches appearance and value-change actions;
its `0x1012f0218` callback assigns the tracker adaptor. It is not the physical
point callback. A separate concrete tracking modifier is corroborated as
**`MouseMoveModifier: SwiftUI.ViewModifier`**, with static `body(content:)`
implementation **`0x100b0c498`**. Its imported protocol layout remains partial
and the runtime witness table is **not instantiated**. The newly selected
body is outside the earlier caller seeds; its event implementation is still
being traced with an explicitly expanded admission profile. [S06][S06],
[S09][S09]

The overlay's alternate branch is `SelectorSpotlight`. Its body delegates
through `0x1012f3454` and a render capture adapter to worker
**`0x1012f3734`**. Retained folded pseudocode constructs **BlendMode.color**,
a **RadialGradient** from black colors with opacity constants **0.245** and
**0.5**, and a State-backed **ForEach** with child **`0x1012f3b80`**. Direct
worker instructions and the child remain the next evidence for final radius,
candidate shape/frame/mask and placement. A separate String lifecycle
callback schedules task **`0x1012f44f8`**, whose selection result and State
effect remain untraced here. These are static view constructions, without a
live UI observation. [S10][S10]

This addendum does not close durable Boost persistence, native window
placement, every reducer effect or the broader Arc feature checklist. Native
observations use either frozen076 or immutable-v8 profiles as recorded by
their respective receipts; they are not described as one unchanged profile.

### Native event and candidate drawing follow-up

A second, separately authenticated selector index adds **S11–S20** without
changing either the historical E01–E88 index or S01–S10:
[selector-native-drawing-index-2026-11-15.json](arc-analysis-dossier-2026-11-08/selector-native-drawing-index-2026-11-15.json).
Detailed outcomes and session settlement are in
[the drawing receipt](arc-selector-v8-2026-11-15/mouse-and-spotlight-findings-phase-0.md),
[event receipt](arc-selector-v8-2026-11-15/mouse-and-spotlight-findings-phase-1.md)
and [phase-2 receipt](arc-selector-v8-2026-11-15/mouse-and-spotlight-findings-phase-2.md).

Retained fixed-input Objective-C metadata identifies the private nested
**MouseMoveModifier.Representable.Coordinator: NSResponder**, with
`mouseMoved:` at **`0x100b0be48`** and `mouseExited:` at
**`0x100b0be98`**. The moved method reaches **`0x100b0bd20`**. With a live weak
view, enabled flag and callback, its selected worker emits the point's two
Double components, each component divided by a view-dependent rectangle's
width/height, and present flag0. The exited method emits four zero words and
absent flag1 when enabled and the callback exists. These concrete methods
match the selected picker adapter's representation. The remaining setup
question is how the representable installs the coordinator and tracking area;
actual NSResponder delivery is unobserved. Objective-C stub selector bindings
are also still needed before assigning exact coordinate-space/property names.
[S11][S11]–[S14][S14]

The selected `Representable` conformance at **`0x103715f98`** is to imported
**SwiftUI.View**, not NSViewRepresentable. Its named static `_makeView`,
`_makeViewList` and `body` targets are **`0x100b0c3d4`**,
**`0x100b0c424`** and **`0x100b0c474`**. Their runtime witness table is
uninstantiated. The next trace follows those View bridges to native setup
rather than renaming their requirements. [S15][S15]

The Spotlight gradient is distinct from the candidate shapes. Direct
instructions and the selected imported API ABI give gradient center
**(0.5,0.5)**, start radius **1**, and end radius **GeometryProxy.size.width**;
its two black opacity constants are **0.245** and **0.5**. The separate
candidate builder constructs a continuous **RoundedRectangle with corner
sizes10/10**, white Color and **overlay blend mode**. It stores rectangle
midX/midY in the following modifier payload and constructs a centered frame
with width/height each enlarged by **20 coordinate units**. Concrete midpoint
modifier type corroboration remains pending; no physical pixel or live
appearance assertion follows. [S16][S16], [S17][S17]

The String-change route proceeds through **`0x1012f3f54`** to
**`0x1012e6f8c`**. That stage passes its input through **`0x1012e72c0`**. Its
zero-result path returns an empty Array; the other path formats a query and
hands it to the selected adaptor execution route. The literal, helper's
escaping/validation and outer consumer **`0x1012f3fb4`** are the immediate
next evidence for rectangle State updates. [S18][S18], [S19][S19]

The admitted modifier body **`0x100b0c498`** now corroborates its Boolean
environment gate and captured-content/callback construction. The investigation
used an explicitly expanded **2,034-entry** seed set, not a retry of the
previous 1,951-entry profile. That session retained24 canonical records,
completed28/28 calls, expired while awaiting another continuation, and
verified empty owned descendants. It issued no explicit `close_binary`.
The phase-2 audit retains the exact run identity and observation time.
[S20][S20]

### Selected static rectangle-display route: final v8 receipt

The [final setup/scaling/retry report](arc-selector-v8-2026-11-15/tracking-and-state-findings-final.md)
and [audit](arc-selector-v8-2026-11-15/tracking-and-state-final-audit.json)
close several previously pending links. Separate **S21–S30** sources are in
[selector-installation-index-2026-11-15.json](arc-analysis-dossier-2026-11-08/selector-installation-index-2026-11-15.json).
All earlier indexes remain unchanged.

Exact **Representable: NSViewRepresentable** metadata selects native
make/update/dismantle/coordinator implementations. The constructor creates
**ARCUI.FlippedView**, whose exact metadata-selected `isFlipped` getter returns
true. It installs an NSTrackingArea with the coordinator owner, zero rectangle,
nil userInfo, and raw options **0x623** on the selected byte1 construction.
Public stub/selector reads corroborate installation and teardown operations.
The alternate raw flag branch is **0x6a3**. A separately retained local AppKit
SDK constant derivation maps the selected bits to entered/exited, moved,
active-in-key-window, visible-rect and mouse-drag tracking; the alternate adds
ActiveAlways. Neither sets AssumeInside. Update changes weak-view/enabled
storage; dismantle clears the weak view and removes tracking areas.
[S21][S21]–[S25][S25], [S28][S28]

Event coordinates are explicitly **event.locationInWindow →
view.convertPoint:fromView:nil** on the flipped local view. The additional
payload fractions divide by its bounds dimensions. The picker uses the
converted point, then reciprocal adaptor-supplied scalar for DOM lookup.
Rectangle-query success **0x1012e7150** multiplies every returned rectangle's
four components by the adaptor-supplied scalar before the State consumer.
This closes the selected conversion/scaling path, while a particular live
Chromium viewport, surrounding origin/clip/scroll, evaluated page/world and
actual scalar meaning remain separate questions. [S24][S24]–[S26][S26]

Serialized selector input feeds **rectsForSelector**; successful nonempty
results other than a single CGRect.zero reach the same State read by the
Spotlight candidate loop. The retry counter starts at0. Empty/single-zero and
the selected error route request50ms sleep, then increment; at5 the worker
clears the candidate State and returns, otherwise it repeats the query.
There are at most five attempts on this path. Sleep-error release joins the
same next-attempt stage; this is not a global cancellation claim. No elapsed
time was measured. [S27][S27], [S29][S29], [S30][S30]

The separate symbolic-layout source derivation matches public loaded mangles
and resolves the candidate modifier chain as **ShapeView<RoundedRectangle,
Color> → BlendModeEffect → PositionLayout → FrameLayout**. Thus the recovered
midpoint payload is specifically a position modifier. It also resolves the
tracking body as **BackgroundModifier<Representable>**. This is explicitly
analyst decoding of symbolic/chained-bind source fields, not an automatic
general type decoder or runtime metadata observation. See the
[byte agreement and derivation receipt](arc-selector-v8-2026-11-15/symbolic-layout-source-verification.json).

The final export contains **71 canonical records**, checked with all1,865
immutable runtime manifest files. Recorder status remains **failed**:
**78 calls / 77 successes / one close error**. The explicit close returned
**cleanup_incomplete**, with an ownership-read `sysctl_errno_22` for candidate
6891. Later client shutdown verified empty owned descendants at
**2026-11-15T12:32:42.752Z**. This does not turn the earlier close into a success
or establish filesystem cleanup. The public close diagnostic also records
**329,896 loader fixed-up chained pointers**. All identities, hashes and
source diagnostics are preserved in the final audit.

The [direct selector-source interpretation](arc-selector-v8-2026-11-15/selector-source-semantics.md)
now maps hit testing, descriptive hash, ancestor/descendant selector refinement,
semantic/style ranking, sampling and failure results to these native paths.
The retained11,068-byte source has the exact fixed-build digest
**0e779dad9316f8b14cf4e1b20fa710240cd90bc9a9a1dd820df38ebd525d977d**,
bound by E36. Its output candidate fields are only selector/matches. The
100-match generator filter does not cap rectsForSelector, and target15 is a
sampling policy rather than a hard count cap. Hover no-hit returns undefined;
candidate no-hit returns an empty array; invalid rectangle-query CSS can throw.
The native single-zero-rectangle readiness test is not a source-generated error
sentinel. The [source index](arc-selector-v8-2026-11-15/selector-source-index.json)
separates digest-bound source ranges and analyst semantics from public tool
observations; no shipped JavaScript was executed. [E36][E36]

The remaining separate tap candidate-selection path has a prepared six-call
follow-up for the parent-owned v9 retest. It is not executed by this receipt.
Broader Arc subsystems and durable Boost persistence remain open.

## Actual v9 feature addendum: 2026-11-16

The [phase 5 report and nine-question ledger](arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/feature-findings-phase 5.md)
record actual fixed-version Arc results from byte-frozen v9 producer `9717688d…`.
This supersedes the older selected reducer table/body gap: the exported
`analyze_function` now owns **10,072 contiguous bytes / 2,518 instructions** and
all **28** dispatch targets and pseudocode case labels. Every signed table word
agrees with the independent public 112-byte read. The [reproducible coverage
receipt](arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/reducer-coverage-observation.json)
preserves exact profile/seed identity and the actual Evidence operation. [V01][V01]

This recovery remains conditional on a recursively valid active outer value at
the runtime tag call, stable ABI/import bindings, valid disjoint nonwrapping
stack regions, a stable checked post-tag window and trusted Darwin stack-probe
normal-return effects. Pre-tag copy/ownership/nonescape, later lifetime and live
reachability remain unproved. Native value flow is truncated at 3,000 operations,
and eight synchronous-throw uncertainty sites remain reported. Complete table
coverage does not establish all case effects or the exact captured runtime
store binding.

The selected candidate success path now reaches State: it preserves candidates
whose match count is at most 500, then stores the array and selects its first
triple or the nil value. This is distinct from the shipped source's at-most-100
match-count filter and ascending ordering; those source semantics come from an
[inert source interpretation](arc-selector-v8-2026-11-15/selector-source-semantics.md),
not a live DOM run. The registered candidate action invokes a captured consumer
with the selected selector and then clears locked selection, candidate-array
and selected-candidate State. The exact consumer is still a boundary; an
end-to-end `appendZap` or durable write claim would exceed these observations.
[V02][V02]–[V05][V05]

The actual reducer's `update`, `appendZap` and Boost IDE mutation branches converge
on a shared state/effect helper. Concrete follow-ups now identify an async worker
and a conditional dependency callback, but no complete durable write/readback
path has been established. [V06][V06]

Broader browser tracing has started with behavior rather than inventory alone:
`nextSpace:` and `handleReload:` forward selected actions through static
`viewStore` field bindings; `switchToTab:` and sidebar toggle reach exact native
workers requiring additional partial-Program admission. Exact
`RestoreSidebarDataFlow` metadata selects three class-vtable implementations and
one `RestoreDataFlow` static witness. Seven remaining class implementation
relative words are zero; they are not asserted as concrete async methods.
Runtime witness population, final tab/space/sidebar/navigation effects and
durable restoration remain partial. [V07][V07]–[V10][V10]

The [new anchor index](arc-analysis-dossier-2026-11-08/v9-feature-index-2026-11-16.json)
keeps V01–V10 separate from historical E01–E88 and earlier selector S01–S30.
The phase 5 receipt does not claim final session cleanup; later settlement is a
separate observation. Earlier response-budget failures and captures are retained
unchanged. This is progress toward the broader analysis, not a full-Arc
completion claim.

## Evidence index

References **E01–E88** resolve to the exact retained files below. The
[machine-readable index](arc-analysis-dossier-2026-11-08/evidence-index.json)
records their complete Evidence IDs, artifact/profile identities and file
hashes. It does not add new analysis authority. The small getter verification
is a new static native pass; the synthesis and byte derivations do not execute
Arc or add runtime authority. The retained
[verification receipt](arc-analysis-dossier-2026-11-08/verification.json) authenticates
88 unique indexed Evidence records and their file hashes, the exported four-record
getter bundle, the exact metadata/getter links and the three native path/ID
derivations. The separate hardening verifier checks the full 28-carrier/22-plist matrix.
The dossier verifier also checks the selected hover-class rows, bootstrap and
publication links, local Markdown references and retained session outcomes.
The getter session closed cleanly; the separate bootstrap session's transport
boundary and `cleanup_incomplete` remain explicit despite verified empty
descendants after shutdown. This is an artifact consistency check, not feature
completion.

[E01]: arc-retest-2026-11-06/dmg/after/extraction.evidence.json
[E02]: arc-retest-2026-11-06/native/final/payload-decoder.evidence.json
[E03]: arc-retest-2026-11-06/native/final/request-decoder-helper.evidence.json
[E04]: arc-retest-2026-11-06/native/final/command-helper.evidence.json
[E05]: arc-dispatch-2026-11-06/ui-delegate-conformance-10138.evidence.json
[E06]: arc-dispatch-2026-11-06/resolved/boost-editor-delegate-assignment.evidence.json
[E07]: arc-dispatch-2026-11-06/seeded/chromium-ui-delegate-setter.evidence.json
[E08]: arc-dispatch-2026-11-06/implementation/boost-editor-command-implementation.evidence.json
[E09]: arc-dispatch-2026-11-06/native/command-response-helper.evidence.json
[E10]: arc-dispatch-2026-11-06/resolved/adaptor-conformance.evidence.json
[E11]: arc-dispatch-2026-11-06/backend/javascript-validated-submit.evidence.json
[E12]: arc-dispatch-2026-11-06/submission/chromium-javascript-callback-entry.evidence.json
[E13]: arc-dispatch-2026-11-06/completion/javascript-main-actor-completion.evidence.json
[E14]: arc-dispatch-2026-11-06/return-2026-11-08/selector-return-0x1012e64f0.evidence.json
[E15]: arc-command-effects-2026-11-08/initialization/helper-0x1012d2e5c.evidence.json
[E16]: arc-command-effects-2026-11-08/dispatch/dispatch-0x1008c784c.evidence.json
[E17]: arc-command-effects-2026-11-08/send/send-0x1008ca400.evidence.json
[E18]: arc-command-effects-2026-11-08/core/store-send-core.evidence.json
[E19]: arc-command-effects-2026-11-08/core/stored-reducer-call-targets.evidence.json
[E20]: arc-command-effects-2026-11-08/initialization/helper-0x1012d3b04.evidence.json
[E21]: arc-command-effects-2026-11-08/initialization/helper-0x1012d4dc0.evidence.json
[E22]: arc-persistence-routes-2026-11-08/native/boost-editor-reducer-conformance.evidence.json
[E23]: arc-persistence-routes-2026-11-08/native/boost-editor-reduce-witness.evidence.json
[E24]: arc-persistence-routes-2026-11-08/native/boost-reducer-pseudocode.evidence.json
[E25]: arc-persistence-routes-2026-11-08/factory/selector-library-injection-pseudocode.evidence.json
[E26]: arc-core-loader-2026-11-08/native/brand-placeholder-substitution-pseudocode.evidence.json
[E27]: arc-core-loader-2026-11-08/native/component-extension-loader-pseudocode.evidence.json
[E28]: arc-extension-loading-2026-11-08/discovery/entry-15548.evidence.json
[E29]: arc-extension-loading-2026-11-08/discovery/entry-15865.evidence.json
[E30]: arc-extension-loading-2026-11-08/discovery/entry-15866.evidence.json
[E31]: arc-extension-loading-2026-11-08/discovery/entry-15558.evidence.json
[E32]: arc-extension-loading-2026-11-08/discovery/entry-15901.evidence.json
[E33]: arc-extension-loading-2026-11-08/core-macho.cli.json
[E34]: arc-retest-2026-11-06/dmg/inventory.evidence.json
[E35]: arc-core-loader-2026-11-08/re-extraction/extract.evidence.json
[E36]: arc-retest-2026-11-06/javascript/producer-bundle.json
[E37]: arc-witness-templates-2026-11-08/mcp-final/adaptor-exact.evidence.json
[E38]: arc-persistence-routes-2026-11-08/codingkey-metadata/request-codingkey-conformance.evidence.json
[E39]: arc-persistence-routes-2026-11-08/codingkey-metadata/payload-codingkey-conformance.evidence.json
[E40]: arc-analysis-dossier-2026-11-08/codingkey-getters/request-key-string-getter-pseudocode.evidence.json
[E41]: arc-analysis-dossier-2026-11-08/codingkey-getters/request-key-string-getter-instructions.evidence.json
[E42]: arc-analysis-dossier-2026-11-08/codingkey-getters/payload-key-string-getter-pseudocode.evidence.json
[E43]: arc-analysis-dossier-2026-11-08/codingkey-getters/payload-key-string-getter-instructions.evidence.json
[E44]: arc-core-loader-2026-11-08/followup-restored/branding-substring-helper-pseudocode.evidence.json
[E45]: arc-core-loader-2026-11-08/followup-restored/manifest-resource-read-pseudocode.evidence.json
[E46]: arc-core-loader-2026-11-08/followup-restored/native-resource-mapping-table.evidence.json
[E47]: arc-core-loader-2026-11-08/followup-restored/native-gdocs-resource-paths.evidence.json
[E48]: arc-core-loader-2026-11-08/followup-restored/native-internal-background-mapping.evidence.json
[E49]: arc-core-loader-2026-11-08/followup-restored/native-internal-background-path.evidence.json
[E50]: arc-retest-2026-11-06/dmg/after/apple-projection.evidence.json
[E51]: arc-fixed-identity-hardening-2026-11-08/cli/exec-26-signature.evidence.json
[E52]: arc-fixed-identity-hardening-2026-11-08/cli/bundle-00-plist.evidence.json
[E53]: arc-fixed-identity-hardening-2026-11-08/cli/exec-06-signature.evidence.json
[E54]: arc-fixed-identity-hardening-2026-11-08/cli/exec-07-signature.evidence.json
[E55]: arc-fixed-identity-hardening-2026-11-08/cli/exec-08-signature.evidence.json
[E56]: arc-fixed-identity-hardening-2026-11-08/cli/exec-10-signature.evidence.json
[E57]: arc-fixed-identity-hardening-2026-11-08/cli/exec-11-signature.evidence.json
[E58]: arc-fixed-identity-hardening-2026-11-08/cli/exec-12-signature.evidence.json
[E59]: arc-fixed-identity-hardening-2026-11-08/cli/exec-24-signature.evidence.json
[E60]: arc-fixed-identity-hardening-2026-11-08/cli/bundle-15-plist.evidence.json
[E61]: arc-fixed-identity-hardening-2026-11-08/cli/bundle-16-plist.evidence.json
[E62]: arc-fixed-identity-hardening-2026-11-08/cli/bundle-14-plist.evidence.json
[E63]: arc-fixed-identity-hardening-2026-11-08/cli/exec-00-signature.evidence.json
[E64]: arc-fixed-identity-hardening-2026-11-08/main-signature.cli.json
[E65]: arc-core-loader-2026-11-08/loader-region/manifest-json-parse.evidence.json
[E66]: arc-core-loader-2026-11-08/loader-region/component-registration.evidence.json
[E67]: arc-core-loader-2026-11-08/loader-final/component-activation.evidence.json
[E68]: arc-core-loader-2026-11-08/loader-final/manifest-identifier.evidence.json
[E69]: arc-core-loader-2026-11-08/loader-final/manifest-key-name.evidence.json
[E70]: arc-persistence-routes-2026-11-08/table-tail/nested-action-complete-table.evidence.json
[E71]: arc-selector-rendering-2026-11-09/selection-after/arc-hover-class.evidence.json
[E72]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-adjacent-0x1012e55f0.evidence.json
[E73]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e4ec4.evidence.json
[E74]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-adjacent-0x1012e56b8.evidence.json
[E75]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e4f58.evidence.json
[E76]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e4fd4.evidence.json
[E77]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5088.evidence.json
[E78]: arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5148.evidence.json
[E79]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/hover-method-0.evidence.json
[E80]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/hover-method-1.evidence.json
[E81]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/selector-next-stage.evidence.json
[E82]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/point-scale-helper.evidence.json
[E83]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/selector-query-string-prefix.evidence.json
[E84]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/selector-query-completion.evidence.json
[E85]: arc-dispatch-load-2026-11-09/arc-final-2026-11-13/boost-reducer.evidence.json
[E86]: arc-dispatch-load-2026-11-09/re-extraction-2026-11-13/extract.evidence.json
[E87]: arc-selector-rendering-2026-11-09/query-return-2026-11-13/selector-success.evidence.json
[E88]: arc-selector-rendering-2026-11-09/query-return-2026-11-13/selector-error.evidence.json


<!-- S01–S10 belong to the Nov15 selector addendum, not the historical E01–E88 index. -->
[S01]: arc-feature-followup-2026-11-14/event-and-view-evidence/selector-new-starter-caller-instructions.evidence.json
[S02]: arc-feature-followup-2026-11-14/persistent-selector-evidence/selector-content-SelectorPicker-instructions.evidence.json
[S03]: arc-feature-followup-2026-11-14/persistent-selector-evidence/selector-tracking-0x1012f14dc-pseudocode.evidence.json
[S04]: arc-feature-followup-2026-11-14/persistent-selector-evidence/selector-visual-child-instructions.evidence.json
[S05]: arc-feature-followup-2026-11-14/persistent-selector-evidence/selector-tracking-0x1012f14e8-pseudocode.evidence.json
[S06]: arc-feature-followup-2026-11-14/selector-reopen-evidence/reopened-selector-0x100b080a8-pseudocode.evidence.json
[S07]: arc-selector-v8-2026-11-15/evidence/selector-render-query-0x1012e6bc8-instructions.evidence.json
[S08]: arc-selector-v8-2026-11-15/evidence/tap-point-query-prefix.evidence.json
[S09]: arc-selector-v8-2026-11-15/evidence/exact-mouse-move-modifier-conformances.evidence.json
[S10]: arc-selector-v8-2026-11-15/evidence/spotlight-render-closure-pseudocode.evidence.json

[S11]: arc-dispatch-2026-11-06/objc-metadata.evidence.json
[S12]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/event-result-0x100b0be48-pseudocode.evidence.json
[S13]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/event-result-0x100b0be98-pseudocode.evidence.json
[S14]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/tracking-setup-0x100b0bd20-instructions.evidence.json
[S15]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/exact-candidate-representable-conformance.evidence.json
[S16]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/modifier-drawing-0x1012f3734-instructions.evidence.json
[S17]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/modifier-drawing-0x1012f3b80-pseudocode.evidence.json
[S18]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/tracking-setup-0x1012e6f8c-pseudocode.evidence.json
[S19]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/event-result-0x1012f3f54-pseudocode.evidence.json
[S20]: arc-selector-v8-2026-11-15/mouse-and-spotlight-reopen/evidence/modifier-drawing-0x100b0c498-instructions.evidence.json

[S21]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/exact-native-representable-conformance.evidence.json
[S22]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/tracking-area-0x100b0c740-instructions.evidence.json
[S23]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/tracking-area-0x100b0c8f0-pseudocode.evidence.json
[S24]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/tracking-view-class-accessor-loaded-bytes.evidence.json
[S25]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/tracking-flipped-view-getter.evidence.json
[S26]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/tracking-area-0x1012e7150-instructions.evidence.json
[S27]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/tracking-area-0x1012f43a4-pseudocode.evidence.json
[S28]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/native-install-0x100b0ca50-pseudocode.evidence.json
[S29]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/native-install-0x1012f4024-pseudocode.evidence.json
[S30]: arc-selector-v8-2026-11-15/tracking-and-state-reopen/evidence/representable-state-0x1012e72c0-pseudocode.evidence.json

[V01]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/arc-reducer-v9.retained.evidence.json
[V02]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/candidate-selection-0x1012e6dcc-pseudocode.evidence.json
[V03]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/tap-completion-0x1012ef734-pseudocode.evidence.json
[V04]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/commit-effect-0x1012f1658-pseudocode.evidence.json
[V05]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/commit-effect-0x1012efae4-instructions.evidence.json
[V06]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/boost-mutation-shared-helper-pseudocode.evidence.json
[V07]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/broader-action-0x100150114-pseudocode.evidence.json
[V08]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/broader-action-0x10043efc0-pseudocode.evidence.json
[V09]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/exact-sidebar-restoration-class.evidence.json
[V10]: arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence/exact-sidebar-restoration-conformances.evidence.json

## State declaration binding follow-up (2026-11-20)

The Arc-focused upstream delivery pass also advances the existing offline
State investigation. These are additional U01–U03 anchors, separate from the
historical E/S/V inventories.

- **U01 — selected context and records.** Public bytes name the selected
  context `State` and its parent `BoostsEditor`. Its field descriptor at
  `0x103eb510c` reports struct kind 0, 12-byte records and 21 fields. See the
  [State name](arc-upstream-retained-2026-11-20/mcp/state-name.evidence.json),
  [parent name](arc-upstream-retained-2026-11-20/mcp/state-parent-name.evidence.json)
  and [field records](arc-upstream-retained-2026-11-20/mcp/state-fields.evidence.json).
- **U02 — stored names.** All 21 names are now individually read through
  public `read_bytes`. They include `css`, `js`, `font`, `zaps`, `colorScheme`,
  `boostID`, `boostData`, `changeStack`, `boostDataBeforeInteractiveUpdates`
  and `hasDismissedJSWarningBanner`. The
  [binding inventory](arc-upstream-retained-2026-11-20/state-field-bindings.json)
  records every record/name/type address and supporting Evidence ID.
- **U03 — earlier metadata keys.** With the already observed vector word
  offset 2, hexadecimal trace key F24 binds declaration index 5
  `interstitialType`, while F60 binds index 20 `hasDismissedJSWarningBanner`.
  F50/F54/F58 identify `boostData`, `changeStack` and
  `boostDataBeforeInteractiveUpdates`. These are metadata-vector index
  bindings; runtime instance offsets, field types, dependency implementations
  and durable write/readback behavior remain unresolved.

The same pass verifies **37/37 real MCP calls and one fresh CLI case** with
empty owned lineages. Compact delivery references the exact historical full
Arc record, preserving all 28 mappings and the 10,072-byte analyzed body.
See the [update/retest](arc-upstream-retained-2026-11-20.md) and
[machine verification](arc-upstream-retained-2026-11-20/verification.json).
This extends the selected editor path; broader Arc feature coverage remains
partial.


## Preference and Boost continuation (2026-11-21)

[The new report](arc-persistence-2026-11-21.md) binds the warning/interstitial
preference route to `Dependency<UserDefaultsClient>`, observed reader/writer
instance offsets 0/`0xa0`, Setting tags `0x31`/`0x32`, and the exact keys
`hasDismissedBoostsInterstitial` / `hasDismissedJSWarningBanner`. The selected
default initializer captures suite-or-standard NSUserDefaults; reader and
writer callback reach `boolForKey:` / `setBool:forKey:`. Runtime dependency
selection, publisher callback timing, filesystem flush and installed-profile
readback remain unobserved.

This supersedes the earlier absence of concrete preference client/key names;
it does not close general Boost storage. The shared mutation worker's client
field at `0xd0` is `BoostsClient.applyToWebContent`; the conditional companion
is `AnalyticsClient`. Exact default storage conformances identify
`BoostsStorageMemoryImpl` and `BoostsStorageFirebaseImpl`. Application helpers
include `BoostsWebContentHelperImpl`; selected bulk code checks URL.host and
constructs style/font/text-transform/zap operations. The report and fresh
worker review preserve the remaining indirect targets and identity limits.

New item 63 retains an unsupported unguarded halfword converter with 14 initial
instructions/56 recovered bytes and zero recovered tables. Two concrete input
branches are independently verified, while generic input-type provenance and
all-case recovery remain open. Source-owned 297-case encoding controls prevent
assuming a type/bound from the mask or identical table shapes. Production
recovery was not changed. The previous conditional 28-case reducer recovery
and its fixture qualifications remain unchanged.

The tab worker now has a source-bound NSMenuItem.tag 1–9 decision and special 9
encoding. Sidebar toggling reads a keypath byte and sends its negation. Selected
restore wrappers and textual formatting are recovered; final feature reducers,
durable restoration, account/sync, history/downloads and general browser
network/security behavior remain outside complete coverage.

The selected Firebase ordinary setter is now traced to collection `boosts`,
identifier-selected document and `setData:merge:completion:` with merge 1;
its block propagates a callback error or normal continuation. Both selected
read constructors invoke `getDocumentWithCompletion:`. Exact Memory errors
are `BoostsClientError.doesNotExist` / `.invalidData`. Getter result decoding,
alternative setter effects, the editor's save trigger and actual remote/local
readback remain open. All seven new owned lineages are verified empty; 330 of
373 public replies succeeded, with 43 retained earlier admission errors.


## Editor save, JS activation and local-store follow-up (2026-11-21)

The [callback/local-store report](arc-callbacks-2026-11-21.md) supersedes the
remaining absence of an editor save trigger, selected getter decoding and
alternate setter control flow in the preceding section. Editor mutation
constructs effects using BoostsClient `createBoost`, `setBoostData` and
`setLocalPreviewImage`, with source-bound async descriptors. The preview
callback's concrete object-method slot remains unresolved.

The selected converter returns `isActive = storedActive && (localID ||
!nonblankJS)`. Caught local-read errors use an empty ID Set. Newly inserted IDs
first serialize an inactive model copy, merge it, then serialize and merge
the original only after first success. Both primary merge-error paths forward
an error. A subsequent `featuresUsed` update remains only partly traced;
these are request-construction facts, not observed requests or final state.

The typed StorableBoostsData factory now reaches generic synchronous queue
wrappers, JSON decoding/encoding and sibling temporary-file replacement code.
Exact store location, version/migration/backup policy and durable readback
remain open. Another masked unguarded halfword dispatch on the location path
is retained under the existing item 63 coverage boundary. Production source
is unchanged; the previous native qualification remains scoped as before.

Five sessions made 354 public calls: 352 successful replies and two retained
admission errors. One field-test plan stopped on a duplicate label before
invoking it; that session remains failed, with original public records and
verified cleanup retained. All five owned lineages are verified empty. The
[canonical verification](arc-callbacks-2026-11-21/capture-verification.json),
[source authentication](arc-callbacks-2026-11-21/source-verification.json) and
[static fact index](arc-callbacks-2026-11-21/fact-index.json) preserve these
limits. Full Arc feature coverage remains incomplete.


## Static witness identity repair (2026-11-21)

The [new decoder/retest](arc-witness-data-2026-11-21.md) resolves two previously
partial data slots: the inherited TestDependencyKey table and its associated
`Value = UserDefaultsClient`, with exact descriptor `0x103d648c4`. These are
static typed identities, with no executable implementation address. Original
code targets are unchanged; two selected conformances now decode completely,
while broader discovery still retains 401 unknown identities.

This is a qualified REA+ improvement (item 64): 92 source tests, fast/build/
docs/package gates, ten compiler variants, seven discovery comparisons, 40
public MCP calls and two exact Arc CLI/MCP metadata cases pass. All relevant
owned lineages are verified empty. The field report preserves unsupported
encoding limits and intermediate qualification attempts.

The associated-type alias advances the ownership chain without supplying the
anonymous getter's full signature, typed constructor/closure propagation,
item 63 producer repair, actual runtime injection or durable storage. Native
Ghidra Java/recovery is unchanged. Full Arc coverage remains incomplete.


## Detached instruction inspection and selected store filename (2026-11-21)

[Item 65's qualified decoder](arc-unlisted-instructions-2026-11-21.md) now
exposes valid unlisted switch-interior instructions through explicit opt-in,
with separate byte provenance and outgoing-reference availability. It creates
no Listing/function/CFG objects. The selected Setting helper remains at
14 instructions/56 body bytes after probing. ARM64/x86-64 fixture checks,
CLI/MCP parity, 43 focused tests and fast/build/docs/package checks pass.
The two new Arc sessions made 157 calls: 155 successful, two retained earlier
admission errors. Both export and explicitly close twice; cleanup is verified.

The local store's selected filename is `StorableBoostsData.json`, reached via
location tag `0x32`. Its common path builder appends that filename to a supplied
URL, checks the parent when its flag is zero and creates missing directories
with intermediates enabled; the failure path constructs a fatal error.
The factory selects `Dependency<ApplicationPaths>`, whose reflection includes
`baseURL`. The actual constructed/injected base directory, full store path,
backup/migration policy, durable readback and runtime injection remain open.

Owned optimized Swift controls show why item 63 cannot use one typed caller
for a global CFG override: enum, unchecked UInt16 and foreign-owner inputs
share the same implementation. A context-scoped observation carrier and exact
input/origin proof are still needed. The existing enum-recovery producer is
unchanged. Full Arc feature coverage remains incomplete; no target was run.
