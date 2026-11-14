# Arc 1.172.1: component identity and signed attributes

Synthesis and read-only verification: **2026-11-09**, Europe/Berlin. The capture
directory retains its original **2026-11-08** name. This pass uses only the
supplied **Arc 1.172.1 / build 90370 DMG** and its unchanged extracted files.
Arc, its helpers, update tools and JavaScript were **not executed**. No user
profile, account, service or installed-app state was inspected.

The selected offline question is answered: the fixed package's component
identities, displayed code-signature attributes and selected bundle declarations
are now recorded. This is not a trust verdict, a browser security assessment,
or completion of Arc's feature analysis.

## Inputs and component structure

The original DMG SHA-256 is
`d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778`.
The universal main carrier is
`3cb06fbc4736f01baa4e002fcf22fbfc230452925dee15d876b23f8c385f8e63`;
ArcCore is
`aacb29669c253804ed263f5105a9869dcda0b6a083a58ef7b96bb10da4287dd5`.
These are original universal carriers, distinct from the thinned inputs used
for native Ghidra investigations.

The existing [complete fixed-DMG inventory](arc-retest-2026-11-06/dmg/inventory.evidence.json)
and its [Apple application projection](arc-retest-2026-11-06/dmg/after/apple-projection.evidence.json)
are reused and authenticated rather than reinventoried. Projection Evidence
`ev_df7db5c68a6285d67290ff9dd65d5d1f2210cbf91cf48ccd5f4306c9452a3080`
has one application root and **110 path-convention bundles**: one main app,
nine frameworks, eight browser helper apps, 88 resource bundles, one nested
Sparkle Updater app, two XPC services and one DockTile plug-in. It identifies
**28 Mach-O executable candidates**, including libraries and standalone tools.
These are component counts, not observed running-process counts. Zero
privileged-helper and launchd-plist candidates means none recognized within
this inventory/profile; it does not establish that Arc never performs privileged
operations or creates runtime services.

The [scope](arc-fixed-identity-hardening-2026-11-08/scope.json) preserves exact
component paths and hashes, caller selections and the separate plist-source
identity caveat. Fresh extraction was already cross-checked against the original
**1,113 regular files / 916,318,369 bytes** in the parent investigation's
[input recovery receipt](arc-core-loader-2026-11-08/input-recovery.json).

## Displayed signatures and entitlements

All **28 selected Mach-O carriers** return `signed: true`, team identifier
**`S6N382Y83G`**, and the displayed authority chain **Developer ID Application:
The Browser Company of New York Inc. (S6N382Y83G)** → Developer ID Certification
Authority → Apple Root CA. Designated requirements, code-directory hashes,
algorithm fields, timestamps, entitlement results and command provenance remain
in each complete record below.

The reported hardened-runtime flag is **true for 24 carriers** and **false for
four library carriers**: `libaperitif.dylib`, `libvk_swiftshader.dylib`,
`libvulkan.dylib` and `libswiftCompatibilitySpan.dylib`. A library's displayed
flag does not establish the hardening or sandbox state of a process loading it.
The separate [main-app CLI observation](arc-fixed-identity-hardening-2026-11-08/main-signature.cli.json)
agrees with the file-target observation's normalized attributes.

The main executable's returned entitlement dictionary declares CloudKit and
`iCloud.net.arc.sidebar`, `webcredentials:arc.net`, production push/iCloud
settings, WebAuthn/browser credential capability, camera/audio-input/location
capabilities and the two keychain access groups ending in `.webauthn` and
`.auth`. Its dictionary contains no `get-task-allow`, `app-sandbox`, `allow-jit`
or `disable-library-validation` keys. Those are observations of this dictionary;
they do not establish actual permission grants, data contents, service use,
Chromium's runtime sandbox or debugger-attach success.

Both GPU and both Renderer helper variants declare `allow-jit: true`. The
ordinary Browser Helper and Browser Helper (Aperitif) declare
`disable-library-validation: true`. The two Alert helper dictionaries are
empty. Several library observations return `entitlements: null`; null is retained
and is not converted into an empty dictionary or absence claim. Repeated helper
identifiers are retained against distinct paths and digests; identifiers alone
do not uniquely select a helper.

`inspect_signature` reads a digest-verified private Mach-O snapshot and uses
three display commands (`codesign -d --verbose=4`, `-d -r-` and
`-d --entitlements :-`). It does **not** validate the filesystem-bound bundle
resource seal, certificate trust/revocation, notarization or current Gatekeeper
acceptance. The default-architecture display is not independent verification of
both universal slices. The returned authority strings are displayed signed
attributes, not a fresh publisher-authenticity determination.

| Selected carrier                     | Hardened-runtime flag | Complete public Evidence                                                                         |
| ------------------------------------ | --------------------- | ------------------------------------------------------------------------------------------------ |
| `ArcCore`                            | `true`                | [exec-00-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-00-signature.evidence.json) |
| `Browser Helper (Alerts)`            | `true`                | [exec-01-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-01-signature.evidence.json) |
| `Browser Helper (Aperitif Alerts)`   | `true`                | [exec-02-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-02-signature.evidence.json) |
| `Browser Helper (Aperitif GPU)`      | `true`                | [exec-03-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-03-signature.evidence.json) |
| `Browser Helper (Aperitif Renderer)` | `true`                | [exec-04-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-04-signature.evidence.json) |
| `Browser Helper (Aperitif)`          | `true`                | [exec-05-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-05-signature.evidence.json) |
| `Browser Helper (GPU)`               | `true`                | [exec-06-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-06-signature.evidence.json) |
| `Browser Helper (Renderer)`          | `true`                | [exec-07-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-07-signature.evidence.json) |
| `Browser Helper`                     | `true`                | [exec-08-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-08-signature.evidence.json) |
| `app_mode_loader`                    | `true`                | [exec-09-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-09-signature.evidence.json) |
| `libaperitif.dylib`                  | `false`               | [exec-10-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-10-signature.evidence.json) |
| `libvk_swiftshader.dylib`            | `false`               | [exec-11-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-11-signature.evidence.json) |
| `libvulkan.dylib`                    | `false`               | [exec-12-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-12-signature.evidence.json) |
| `FirebaseFirestoreInternal`          | `true`                | [exec-13-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-13-signature.evidence.json) |
| `Lottie`                             | `true`                | [exec-14-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-14-signature.evidence.json) |
| `Sentry`                             | `true`                | [exec-15-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-15-signature.evidence.json) |
| `Autoupdate`                         | `true`                | [exec-16-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-16-signature.evidence.json) |
| `Sparkle`                            | `true`                | [exec-17-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-17-signature.evidence.json) |
| `Updater`                            | `true`                | [exec-18-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-18-signature.evidence.json) |
| `Downloader`                         | `true`                | [exec-19-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-19-signature.evidence.json) |
| `Installer`                          | `true`                | [exec-20-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-20-signature.evidence.json) |
| `absl`                               | `true`                | [exec-21-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-21-signature.evidence.json) |
| `grpc`                               | `true`                | [exec-22-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-22-signature.evidence.json) |
| `grpcpp`                             | `true`                | [exec-23-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-23-signature.evidence.json) |
| `libswiftCompatibilitySpan.dylib`    | `false`               | [exec-24-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-24-signature.evidence.json) |
| `openssl_grpc`                       | `true`                | [exec-25-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-25-signature.evidence.json) |
| `Arc`                                | `true`                | [exec-26-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-26-signature.evidence.json) |
| `DockTilePlugIn`                     | `true`                | [exec-27-signature](arc-fixed-identity-hardening-2026-11-08/cli/exec-27-signature.evidence.json) |

## Bundle declarations

All **22 selected executable-bearing bundle plists** were parsed through the
public CLI. The main plist declares identifier `company.thebrowser.Browser`,
executable `Arc`, version **90370 / 1.172.1**, principal class
`Arc.BrowserApp` and minimum macOS **13.0.0**. It declares handlers for `mailto`,
`https`, `http` and `arcBrowser`, PDF/HTML/XHTML document viewing, the DockTile
plug-in, AppleScript support and website camera/microphone/location descriptions.
These are declarations, not observations of handler installation or API use.

Its ATS dictionary has `NSAllowsArbitraryLoads: true`, while the selected
Sparkle Downloader plist has that property set to false. This does not trace
which requests use Foundation/ATS versus Chromium networking. The main plist
also declares `LSFileQuarantineEnabled: true`; quarantine behavior on actual
files was not tested.

The stored update settings name `https://releases.arc.net/updates.xml`, enable
automatic checks/updates, specify **28,800 seconds** and include `SUPublicEDKey`.
The URL was not fetched and no update was started. ArcCore/helper plists declare
**157.0.8103.39**; Sparkle's framework/Updater/XPC plists declare **2.9.4**. These
are the selected plist version fields, not an independent upstream-source or
patch-level verification. All eight helper plists retain `LSUIElement: "1"` as
a string. The two Sparkle services declare application XPC service types;
Downloader also specifies `NSRunLoop`, and Installer declares
`JoinExistingSession: true`. Static declarations do not prove runtime launch,
IPC callers or service behavior.

For these explicit-path plist calls, Evidence's subject remains the native
context selected by the CLI (`DockTilePlugIn`). The requested plist is identified
by `parameters.path` and `normalized_result.source_path`. Its exact input hash is
in the separate scope and before/after integrity receipt; the context subject's
digest must **not** be presented as the selected plist's digest. All 22 source
plists are separately rehashed by the optional input-integrity verification.

| Bundle                                   | Role               | Complete public plist Evidence                                                         |
| ---------------------------------------- | ------------------ | -------------------------------------------------------------------------------------- |
| `Arc.app`                                | application        | [bundle-00](arc-fixed-identity-hardening-2026-11-08/cli/bundle-00-plist.evidence.json) |
| `ArcCore.framework`                      | framework          | [bundle-01](arc-fixed-identity-hardening-2026-11-08/cli/bundle-01-plist.evidence.json) |
| `Browser Helper (Alerts).app`            | helper-application | [bundle-02](arc-fixed-identity-hardening-2026-11-08/cli/bundle-02-plist.evidence.json) |
| `Browser Helper (Aperitif Alerts).app`   | helper-application | [bundle-03](arc-fixed-identity-hardening-2026-11-08/cli/bundle-03-plist.evidence.json) |
| `Browser Helper (Aperitif GPU).app`      | helper-application | [bundle-04](arc-fixed-identity-hardening-2026-11-08/cli/bundle-04-plist.evidence.json) |
| `Browser Helper (Aperitif Renderer).app` | helper-application | [bundle-05](arc-fixed-identity-hardening-2026-11-08/cli/bundle-05-plist.evidence.json) |
| `Browser Helper (Aperitif).app`          | helper-application | [bundle-06](arc-fixed-identity-hardening-2026-11-08/cli/bundle-06-plist.evidence.json) |
| `Browser Helper (GPU).app`               | helper-application | [bundle-07](arc-fixed-identity-hardening-2026-11-08/cli/bundle-07-plist.evidence.json) |
| `Browser Helper (Renderer).app`          | helper-application | [bundle-08](arc-fixed-identity-hardening-2026-11-08/cli/bundle-08-plist.evidence.json) |
| `Browser Helper.app`                     | helper-application | [bundle-09](arc-fixed-identity-hardening-2026-11-08/cli/bundle-09-plist.evidence.json) |
| `FirebaseFirestoreInternal.framework`    | framework          | [bundle-10](arc-fixed-identity-hardening-2026-11-08/cli/bundle-10-plist.evidence.json) |
| `Lottie.framework`                       | framework          | [bundle-11](arc-fixed-identity-hardening-2026-11-08/cli/bundle-11-plist.evidence.json) |
| `Sentry.framework`                       | framework          | [bundle-12](arc-fixed-identity-hardening-2026-11-08/cli/bundle-12-plist.evidence.json) |
| `Sparkle.framework`                      | framework          | [bundle-13](arc-fixed-identity-hardening-2026-11-08/cli/bundle-13-plist.evidence.json) |
| `Updater.app`                            | nested-application | [bundle-14](arc-fixed-identity-hardening-2026-11-08/cli/bundle-14-plist.evidence.json) |
| `Downloader.xpc`                         | xpc-service        | [bundle-15](arc-fixed-identity-hardening-2026-11-08/cli/bundle-15-plist.evidence.json) |
| `Installer.xpc`                          | xpc-service        | [bundle-16](arc-fixed-identity-hardening-2026-11-08/cli/bundle-16-plist.evidence.json) |
| `absl.framework`                         | framework          | [bundle-17](arc-fixed-identity-hardening-2026-11-08/cli/bundle-17-plist.evidence.json) |
| `grpc.framework`                         | framework          | [bundle-18](arc-fixed-identity-hardening-2026-11-08/cli/bundle-18-plist.evidence.json) |
| `grpcpp.framework`                       | framework          | [bundle-19](arc-fixed-identity-hardening-2026-11-08/cli/bundle-19-plist.evidence.json) |
| `openssl_grpc.framework`                 | framework          | [bundle-20](arc-fixed-identity-hardening-2026-11-08/cli/bundle-20-plist.evidence.json) |
| `DockTilePlugIn.plugin`                  | plug-in            | [bundle-21](arc-fixed-identity-hardening-2026-11-08/cli/bundle-21-plist.evidence.json) |

## Tool routing, verification and remaining boundaries

The first MCP plan selected the universal ArcCore carrier with `provider_id:
ghidra`. It stopped at `open_binary` with the advertised
`capability_unavailable` / `unsupported_provider` result: that deep provider
requires a thinned Mach-O to enforce the selected architecture. This is a caller
routing failure, not a new product defect. The original
[error](arc-fixed-identity-hardening-2026-11-08/capture/exec-00-open.reply.json),
[fatal recorder result](arc-fixed-identity-hardening-2026-11-08/capture/fatal.json)
and [verified-empty descendant receipt](arc-fixed-identity-hardening-2026-11-08/capture/summary.json)
remain unchanged. No signature observation was produced by that failed plan.

The recovery uses the advertised utility CLI, which does not require a deep
analysis binding. [The capture script](arc-fixed-identity-hardening-2026-11-08/capture-cli.mjs)
and [CLI verification](arc-fixed-identity-hardening-2026-11-08/cli-verification.json)
retain **50 successful calls: 28 signatures and 22 plists**, plus the separate
successful main-app signature call. Complete CLI JSON matches each saved Evidence
record; named public output contracts and canonical Evidence identities validate.
The CLI observations are independent utility runs, not a fabricated single MCP
session or exported bundle.

The [53-record index](arc-fixed-identity-hardening-2026-11-08/evidence-index.json)
includes the 50 observations, separate main observation, reused source inventory
and application projection. [Finding rows](arc-fixed-identity-hardening-2026-11-08/findings.json)
retain null/empty distinctions, every component identity and exact group members.
The [verification receipt](arc-fixed-identity-hardening-2026-11-08/verification.json)
authenticates those records and checks CLI parity, public contracts, inventory
projection, claimed fields/counts, route failure semantics, links and all 50
currently selected file hashes. The verifier reads targets without modifying
or executing them:

```sh
PATH='/Users/sigur/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/bin:/usr/local/bin:/opt/homebrew/bin:/usr/bin:/bin' node field-tests/arc-fixed-identity-hardening-2026-11-08/verify-hardening.mjs --check-inputs
```

Omit `--check-inputs` to authenticate retained evidence and derivations after
those temporary inputs are no longer available. Input rehashing compares the
same fixed file bytes at the recorded boundaries; it does not prove continuous
filesystem immutability between observations. Neither verification mode reruns
Arc. No new REA+ correctness bug was reproduced within this scope. Runtime
process isolation, permissions, updater decisions, notarization/trust and actual
feature behavior remain separate questions.
