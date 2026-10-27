# Rize (macOS) 1.1.52: static REA+ pass

A third field test of REA+ — first on a **macOS Electron** desktop app — after
consensus.app and WHOOP Android. Everything here comes from the installed app
bundle as data. The app was never run, no request was sent to Rize, and
nothing was patched. Key values found in the app are recorded only as present.

## Source and target

| | |
| --- | --- |
| App | Rize, bundle `io.rize`, version 1.1.52 (`/Applications/Rize.app`) |
| Type | Electron (Electron Framework + Squirrel + 4 helper apps) |
| Packager | electron-forge; internal name `electron`, repo `git@github.com:rize-io/sol.git` |
| Analyzed with | `rea analyze-javascript-application`, REA+ 6.4.0 CLI from this repo |

Unusually, the shipped `Resources/app` directory contains the **complete,
unminified build tree**: full `src/` (main, preload, renderer, utils), both
webpack configs, `forge.config.js`, `jest.config.js`, `scripts/` (including CI
signing), `test/`, and the bundled `node_modules`. The webpack output
(`.webpack/`) is minified but keeps readable module ids and names. This makes
static recovery near-lossless.

| | |
| --- | --- |
| Evidence size | 539 MB (`field-tests/rize-macos-1.1.52/evidence.json`, sealed and hashed) |
| Statistics | 20,561 relevant files, 14,352 parsed JavaScript files, 7.61 M AST nodes, 46,350 findings, 28 parse failures |
| Electron | 9 browser windows, 17 contextBridge APIs, 109 IPC operations, 1 native addon binding |
| Coverage | application **partial** (result-budget limits), semantic **partial/truncated** |

Reported page write: analysis ran in a few minutes; the summary view (`summary-view.json`, via
`inspect-analysis-view`) projects to a few KB.

## Electron structure (from REA+ Evidence)

**Windows (9):** `sign_in`, `dashboard`, `blocker`, `online`, `rest`,
`preflight`, `shortcut`, `toaster`, `widget`. Each window has an `index.js` +
`preload.js`; the widget additionally uses a `widget_view` windowless view.

**Preload / contextBridge:** all 17 bridges go through one shared helper
(`src/utils/createPreload.js` — `contextBridge.exposeInMainWorld(namespace,
selectedFns)`), one namespace per preload module: `analytics`, `apollo`, `app`,
`auth`, `blocker`, `menu`, `notifier`, `online`, `permissions`, `preflight`,
`rest`, `sentry`, `shortcut`, `system`, `toaster`, `widget`, `windowManager`.

**IPC:** 109 operations — 58 main handlers, 38 renderer transmissions, 13
renderer listeners. The channel names come from `src/utils/ipcMessages.js` and
are all **dynamic** (template-composed) at the call sites REA+ inspected:
109 dynamic-channel operations, 0 literal channels, 0 paired renderer
transmissions, and **0 sender-validation observations**.

| IPC area | Count | Note |
| --- | --- | --- |
| dynamic_channel_operations | 109 | None resolved to literal channel names |
| main_handlers | 58 | `ipcMain.on(/once)` handlers |
| renderer_transmissions | 38 | `ipcRenderer.send/invoke/via bridge` |
| renderer_listeners | 13 | `ipcRenderer.on` listeners |
| sender_validation_observations | 0 | No explicit event-sender checks observed |

**Native addon:** one binding — Rize's fork of `active-win`
(`@rize-io/active-win` 8.1.1-beta.24), loaded by the main process to poll the
active window: `owner` (name, `bundleId`, path), `title`, and, for browsers,
the active tab URL — with `screenRecordingPermission: false` (title/AX only,
no window screenshot). This is the app's core data intake.

## Network surface

REA+'s endpoint extraction found the relative templates; the hosts are built
at runtime from build-time env (`src/utils/locations.js`, `forge.config.js`
loads `dotenv`), so exact hosts come from the source supplement (constant
search was done outside REA+ — gap 1 below):

| Thing | Value |
| --- | --- |
| GraphQL API | `${API_PROTOCOL}://${API_HOSTNAME}` `/v1/graphql` (Rails/GraphQL, `graphql-ruby-client`) |
| Magic-link auth | `{API}/auth/magic-link/request` uses the app's sign-in flow |
| Sign-out | `{API}/auth/sign_out` |
| Realtime | ActionCable at `{CABLE_PROTOCOL}://{CABLE_HOSTNAME}/cable`, JWT-authenticated `action-cable-react-jwt` |
| Telemetry | Amplitude (`api2.amplitude.com`, `api.eu.amplitude.com`) — a 32-hex project API key is embedded in the built main and in all nine renderer bundles (value recorded as present only). Flow: main-process device-id store, renderer event sends |
| Crash reporting | Sentry `@sentry/electron` 4.10.0 + `@sentry/react` 7.47.0 |
| Updates | Squirrel/auto-updater polling `https://update.electronjs.org` against a GitHub release repo from env (1 h interval) |
| Connectivity probe | `https://ipv4.icanhazip.com` (+ IPv6) |
| Web app | `${WEB_PROTOCOL}://${WEB_HOSTNAME}` (`app.rize.io` in production), loaded into windows |

**GraphQL operations in the renderer** — 13 queries (current user, tracking
state/rules, projects, calendar events, focus-quality score, entry-day
summary, most-recent Electron version, notification data), 13 mutations
(`BATCH_CREATE_TRACKING_EVENTS_V2`, session start/extend/stop, workblock and
project updates, notification snooze/mark-delivered, action-recommendation
update, user update), and 4 subscriptions (`TRACKING_STATE_UPDATED`,
`TRACKING_RULE_V2_UPDATED`, `NOTIFICATION_CREATED`,
`CURRENT_CALENDAR_EVENTS_UPDATED`). The full operation text remains in
`src/renderer/gql/`.

**CSP (runtime, `src/main/modules/security.js`)** is tight:
`default-src 'self'`, `connect-src 'self' api cable icanhazip`, `script-src
'self'`, `object-src 'none'`, with a CSP report URI from env. The *forge
metadata* CSP in `forge.config.js` is much looser (`'unsafe-eval'`,
`connect-src *`) but that constant sits in the unused build metadata, not the
runtime policy.

## Privacy-relevant behavior

- Tracking intake: active window (app name, bundle id, path, title, URL) polled
  through the native `active-win` fork every poll cycle in the main process.
- Local filtering: `trackingRuleMatcher` matches rules; URLs are normalized
  (`psl`), and events whose category is `do_not_track` are dropped before
  batching.
- Browser-privacy handling: incognito contexts null the **title** and, subject
  to a global "do not track URLs" flag, the **URL**.
- macOS permissions: `node-mac-permissions` checks and requests Accessibility
  (`getAuthStatus`, `askForAccessibilityAccess`); screen recording is
  deliberately not requested by `active-win`.
- Renderer-to-server: all network traffic proxies through the main process via
  IPC (`SEND_QUERY`/`SEND_MUTATION`/`SEND_REQUEST`), so the browser sessions
  themselves make no API calls.

## Shipped material that probably shouldn't ship

- `Resources/app/certificate.p12` — a CI macOS code-signing certificate,
  produced by `scripts/keychain.sh` from env (`CODE_SIGN_MACOS_CERT_P12`), got
  packaged into the shipped bundle. No password/key material was found in the
  app; the cert alone is not directly usable, but it does not belong in the
  distribution.
- A complete copy of the private source tree (`src/` with tests, build and
  signing scripts, and a `codegen.json`).

## How REA+ did

| Step | Tool | Result |
| --- | --- | --- |
| Electron app structure, windows, IPC, bridges | `analyze-javascript-application` | worked first try, no flags (evidence 539 MB) |
| Summary projection | `inspect-analysis-view` (summary view) | worked; ~KB from 539 MB |
| Storage/config facts | same Evidence observations | worked (device-id store, env-driven locations) |

REA+ correctly resolved the entry-point (`package.json main` →
`.webpack/main/index.js`), inventoried 1,867 packages / 12k source modules /
3.6k source maps, and kept complete static facts on file nodes even where the
semantic budget truncated.

**Gaps seen (some already known from WHOOP):**

1. No constant/string search is exposed through REA+; the hosts, the Amplitude
   key and the `certificate.p12` reference were found with direct tree greps
   (same gap as WHOOP field test).
2. All IPC channel names are dynamic at the inspected call sites, so REA+
   could not pair renderer transmissions with main handlers (109 dynamic, 0
   paired). The channel table exists in `src/utils/ipcMessages.js`; pairing is
   a known limitation of channel-name coercion, not of Evidence.
3. Semantic graph truncated: 206,496 semantic unknowns, literal/call-flow
   families partially retained; heavy volumes (`node_modules`, minified main
   bundle) exceeded result budgets by design.
4. 28 parse failures (recorded per file in Evidence; un-itemized in this
   pass). Distinct from these are the 25,383 `analysis_failure` records with
   `resource_constraint`: semantic analysis was not started for the `.webpack`
   window bundles and heavy `node_modules` sources (complete static facts
   retained on the file nodes).
5. Manufactured URLs with runtime interpolation are retained as `{}`-hosted
   templates; the production env values were baked in at build and survive as
   bundle constants (e.g. the web host `app.rize.io`, the Amplitude endpoint
   literals), so completing them is constant-search work (limit 1), not
   runtime work.

## Follow-up pass: credentials at rest and debug surface

A second look at modules the first Evidence pass did not open:

- **Auth at rest.** `src/main/modules/auth.js` stores Devise-token-auth-style
  credentials — `access_token`, `client`, `uid`, `expiry`, `pid` — under the
  store key `authCredentials`, written through `electron-store` in plain JSON
  with no encryption layer anywhere in the store path, and additionally
  mirrors them into cookies (`setCookies`). All API calls then carry them as
  plain headers (`access-token`, `client`, `uid` via
  `src/utils/getAuthHeaders.js`). A store-transfer migration
  (`storeTransfer.js`) copies the same keys across store versions.
- **Devtools.** `src/main/modules/devTools.js` opens detached devtools on every
  window (and on BrowserView webContents) whenever the store flag
  `debugModeEnabled` is set at runtime — a toggle, not only an env/development
  gate; in development it additionally enables the inspect-element context
  menu. A `triggerError` hook manually raises errors (test path).
- **Full GraphQL schema shipped.** `src/renderer/gql/_schema.graphql` is the
  complete server SDL for the app's API, plus `codegen.json` for
  fragment-matcher generation — the full operation surface is recoverable
  without any capture.
- **Third-party IP echo.** The connectivity module contacts
  `ipv4.icanhazip.com`/IPv6, which sends the public IP to a third-party
  service alongside Amplitude and Sentry.

## What static analysis does and does not settle

Functionality was inferred from the architecture, and for this app that retains
nearly everything. Orchestration logic — poll cycle wiring, rule matching,
session state machines, blocker and rest flows — is deterministic source logic
fully present in `src/`, and static inference accurately recovers its branches,
handler wiring, and data flow. The residual unknowns split cleanly into two
classes:

**Inferable but not completed here (tooling gaps, fixable offline, tracked in
the gap registry).** The production host values, the complete IPC channel
pairing (via `src/utils/ipcMessages.js` constants), and semantic depth inside
the ten `.webpack` bundles are all present in the shipped artifacts; the
coverage limits above (constant search, dynamic-channel resolution, budget
allocation) are what stopped them. A repeat pass after those REA+ gap fixes
would close these without ever starting the app.

**Inherently outside static inference (verification questions, not
understanding questions):**

1. **Server-side truth.** `_schema.graphql` is the client's contract, not
   proof the deployed server honors it — response shapes, version drift, and
   whether the server actually enforces the ActionCable JWT are another
   machine's behavior.
2. **Event interleaving under real input.** Every branch, including error
   paths, is enumerable in source, but which branch reality takes is a
   function of the actual data; static analysis enumerates paths, it does not
   select one.
3. **Timing effects.** Timer handles and poll intervals are statically
   identified, but their actual firing under OS throttling, load, and sleep is
   empirical.

That list is complete: an Electron scenario capture would confirm these three
and nothing else.

## Not done

- Running the app, capturing its live traffic, or exercising the GraphQL API
  (mirroring the prior field tests' offline constraints).
- macOS codesign/notarization verification of the bundle itself.

## Re-test note (2026-10-27, item 22a ordering fix)

Same `git` tree, same command, after the budget-ordering fix (application
sources admitted to the semantic pass before vendor modules). Progress with
evidence-backed numbers:

- Application sources now reach semantic projection first: 312 files projected
  IR (previously 1,693, vendor-weighted). The intended trade per gap-registry
  item 22(a); total vendor semantic depth shrinks accordingly.
- The dynamic-channel resolver now executes against IR-backed modules (it
  previously never ran: zero findings had any projected IR). All attempts for
  Rize still fail closed, so pairing stays **109 dynamic / 0 paired**: each
  attempt ends `origin-null` or `provider-null` because the channel constants
  bind through **bare specifiers** (`utils/ipcMessages`) that webpack resolves
  against its extra module directories — tracked as item 28, unchanged.
- The larger `src/main/modules/*` files still skip semantics: the 100k-node
  global ceiling exhausts inside the ~280-file application tree (item 22(b)).

Nothing else in this document was re-verified in this pass.

## Re-test note (2026-10-27, item 22(b) per-file semantic budgets)

Same `git` tree, same command, after replacing the run-wide semantic
kill-switch with per-file degradation:

- The parent reserves observed-cost capacity for static-child results
  (`javaScriptStaticObservationReserve`) and the worker projects module IR
  against per-file node budgets; a file that exhausts its budget is recorded
  as a per-file resource-constraint record instead of aborting every
  remaining observer. The result-budget throw, the dead marker field and the
  run-wide break rule are removed.
- Full-Rize confirmation on the rebuilt dist: exit 0, complete evidence,
  **zero interruption records**, `semantic-files=2,739` (1,693 before (a);
  312 under (a) alone).
- IR now covers **all 48 of 48** `src/main/modules/*` files, including the
  batches that skipped semantics in every previous pass (toaster, blocker,
  windowManager, dashboard, rest, sessionTimer, …). The 100k-node ceiling no
  longer terminates semantic analysis for the application tree.
- The IPC channel picture is unchanged: **109 dynamic / 0 paired**, attempts
  still fail closed at `origin-null`/`provider-null` because the constants
  bind through bare specifiers webpack resolves via `resolve.modules`
  (item 28). With IR now present for the main-process modules, item 28 is
  the only remaining blocker for this pairing.

Verification evidence: `/tmp/rize-22b-final.json` (~616 MiB; not persisted
into `field-tests/`), **641,747,714 bytes**, SHA-256
`730b7e19f017e6f2177fb7a0fc0b6526e53494123a5656256f965d94ce171c1a`.
The size and digest were independently checked on 2026-10-27 without copying
or re-running the analysis. Nothing else in this document was re-verified in
this pass.

## Artifacts

- `field-tests/rize-macos-1.1.52/evidence.json` — full REA+ Evidence (539 MB).
- `field-tests/rize-macos-1.1.52/summary-view.json` — projected summary view input.
- `field-tests/rize-macos-1.1.52/analysis.log` — REA+ progress log (3.9 MB).

Reproduce with:
`node rea-local/scripts/rea.mjs analyze-javascript-application
"/Applications/Rize.app/Contents/Resources/app" --json`
