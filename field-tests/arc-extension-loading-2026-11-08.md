# Arc extension resources and loader candidates

Date: **2026-11-08**, Europe/Berlin. Source parent:
`5d194de15e0dc1aba06229fee0241659bd6a0338`. This independent offline pass
follows the extension-loading/name-substitution question from the
[Arc delegate report](arc-dispatch-2026-11-06.md). It uses the supplied
**Arc 1.172.1 / build 90370 DMG**, not the earlier installed build.

Arc, helpers and shipped scripts were never executed. No account, profile, UI,
service or target URL was accessed. No Ghidra session or implementation change
was made in this pass.

## Fixed-version resource findings

Four case-sensitive public pack searches each examine all **5,439 canonical
entries**, accounting for **382 aliases**, with complete contiguous windows and
no skipped entries. The pack SHA-256 remains
`69989f28e4c839975fbde1c300b32cc58e1dff332729432ddbd21a26e753a49f`.
The queries were `<APP_NAME>`, `chrome.tabs.onUpdated.addListener`,
`gdocs_script.js` and `ArcInternal`; the last has no matches within this pack.
These are selected literal searches, not an exhaustive feature inventory.

| Resource  | Observed material                        | Decoded bytes |
| --------- | ---------------------------------------- | ------------: |
| **15548** | Reading Mode Google Docs Helper manifest |         2,314 |
| **15558** | `<APP_NAME> Internal Extension` manifest |           769 |
| **15865** | Google Docs content-injection source     |           390 |
| **15866** | Google Docs canvas-annotation source     |         1,425 |
| **15901** | Slack/Web Store/Notion dispatch source   |         3,301 |

The current IDs differ from the earlier 1.171.0 material. The
[decoded-origin ledger](arc-extension-loading-2026-11-08/decoded-origins.json)
binds every materialized byte sequence to its public resource Evidence, original
pack offset/stored digest and decoded digest. Filenames such as
`resource-15865.js` are analyst choices, not recovered loader paths.

## Google Docs injection logic

Manifest **15548** declares MV3 content script `content.js` for
`https://docs.google.com/document*` and the corresponding sandbox host,
**all frames**, at **document_start**. It separately exposes `gdocs_script.js`
as a web-accessible resource for those two hosts.

Body **15865** creates a `script` element, sets its `src` through
`chrome.runtime.getURL('gdocs_script.js')`, then appends it to
`document.documentElement`.

Body **15866** calls its local `triggerDocsCanvasAnnotationMode` routine. Its
source has two branches:

- Without `chrome.runtime` or a runtime ID, it extracts the extension ID from
  `document.currentScript.src.split('/')[2]`, builds a write to
  `window['_docs_annotate_canvas_by_ext']`, creates a Trusted Types policy named
  **`gdocsPolicy`**, and passes the generated script through `createScript`
  before `eval`.
- With a runtime ID, it uses `chrome.runtime.id`, creates another script element,
  assigns the generated write to `innerHTML`, then appends the element.

This recovers the conditional source-level page-context injection mechanism.
It does not establish which branch succeeds on a real page, Trusted Types/CSP
outcomes, actual canvas accessibility output, component registration, or the
native filename-to-resource-ID association. The manifest and body association
remains a supported candidate until the native resource mapping is decoded.

Selected Evidence:

- Manifest: `ev_948b2885645807bb4584a72af3bcf98846446b040dacd60fad5b7015d1fa1c52`.
- Content source: `ev_d9885ca3d822cd67f0a1db3ff96ba29426a9b75b8fa24495cb39928a6e0b1121`.
- Canvas helper: `ev_66331e337b0bf2d14da2fac20cda4c9b529f43d8e1881334509d7c2939a94f38`.

## Internal extension and branding boundary

The stored **15558** manifest still names `<APP_NAME> Internal Extension`,
declares `background.js` as its MV3 service worker, uses split incognito mode,
and requests scripting/tabs with explicit Slack, Chrome Web Store and Notion
HTTPS host permissions.

Body **15901** uses `chrome.tabs.onUpdated`. Its source selects a site entry by
URL substring, inserts the selected CSS during loading, and requests script
execution for loading/complete events. The injected function's argument comes
from **`chrome.runtime.getManifest().name.split(" ")[0]`**. This confirms the
source of the runtime branding argument, not that its runtime value is `Arc`
or that `<APP_NAME>` was replaced.

Manifest Evidence:
`ev_59ebb6dc4cba813c18bf11508faf7bb90392bfabac8ed11c51a63839708316ba`.
Dispatcher Evidence:
`ev_b66f08826187307b7a2bab8fcb9281ad0db2ee15916867e292f33a4094a33271`.

The separate shipped web-content configuration was parsed as JSON and queried
for `extension`; no field/path/value matched that term. This bounded query does
not establish that the configuration has no influence on extension behavior.

## Native loader candidates are in ArcCore

The main ARM64 executable contains zero matches for the five selected exact
loader/placeholder byte patterns. In contrast, the universal **ArcCore** carrier
contains two `<APP_NAME>` and two `gdocs_script.js` matches, with related
`arc_internal_extension` literals. Its identity is:

`aacb29669c253804ed263f5105a9869dcda0b6a083a58ef7b96bb10da4287dd5`
— **507,526,464 bytes**.

Public raw string views retain these native candidates:

| Literal                                                         | Original carrier offset | Derived ARM64 preferred address |
| --------------------------------------------------------------- | ----------------------: | ------------------------------- |
| `../../arc/browser/extensions/arc_extensions_browser_client.cc` |             489,899,132 | `0xd60c47c`                     |
| `<APP_NAME>`                                                    |             489,899,356 | `0xd60c55c`                     |
| `arc_internal_extension`                                        |             489,899,371 | `0xd60c56b`                     |
| `reading_mode_gdocs_helper/content.js`                          |             489,119,300 | `0xd54de44`                     |
| `reading_mode_gdocs_helper/gdocs_script.js`                     |             489,119,337 | `0xd54de69`                     |
| `arc_internal_extension/background.js`                          |             489,119,496 | `0xd54df08`                     |

The placeholder's range also includes `extension_resource_loader`,
`request_path`, `resource_id`, `Wrong relative path` and
`request_resource_url`. These are concrete starting points for the next native
pass, not proof of replacement or control flow from string adjacency.

REA+'s native **inspect-macho CLI** identifies an ARM64 slice at carrier offset
**265,453,568**, length **242,072,896**, with `__TEXT` preferred address/file
offset **0**. The [derivation script and receipt](arc-extension-loading-2026-11-08/native-loader-candidates.json)
convert original offsets through that slice and segment mapping. Runtime slide,
actual call references and loader activation remain unobserved. The export
inventory is explicitly non-exhaustive; missing exported names are not global
absence claims.

Native-source-string Evidence:
`ev_a30c14784a0d110ebbf9037592d71a7423dd2affc93108dba23f44314c7b9e44`.
Resource-name-string Evidence:
`ev_51131c27ebcc52272abe05fe5203bb4d0c4e30c8c3dc708873882a0d7bcdeca9`.
Mach-O Evidence:
`ev_f7cc294baf63962dcbe298f5a4ece1998a4b60f3117e595e650c5bf6961b1945`.

## Analysis boundaries and verification

Fresh source analysis parses **3 JavaScript files / 932 AST nodes** with zero
parse failures, plus the two decoded JSON assets. Exact source material totals
**8,199 bytes**. This is static analysis of inert bytes; it executes no target
code.

Three initial application-feature traces have no matches at that graph layer.
They are preserved as no-match results, not application absence. Follow-up
queries use the actual semantic node IDs: branding forward influence and the
`eval` call's backward provenance each retain **1 node / 0 relations**, with
explicit **partial** coverage. These do not establish complete browser API,
runtime-value or dynamic-script semantics. The source-level conclusions above
are analyst interpretations of the complete public decoded source, separate
from those limited semantic traces.

- **42/42 public MCP calls** and **one native CLI inspection** succeed. Actual
  SDK schemas, named contracts and text/structured success output are checked.
  Both recorder sessions close with verified empty owned descendants.
- [Twenty-two finding checks](arc-extension-loading-2026-11-08/findings-verification.json)
  validate resource windows, exact materialization, source facts, partial
  boundaries and session cleanup. These are research assertions, not new
  implementation tests.
- The [canonical audit](arc-extension-loading-2026-11-08/evidence-audit.json)
  authenticates the retained Evidence and two exported bundles. The
  [integrity receipt](arc-extension-loading-2026-11-08/target-integrity.json)
  rechecks the fixed DMG, main executable/slice and all **1,113** extracted
  regular files.

No additional REA+ product defect is established. Component registration,
resource filename/ID mapping, native manifest substitution, actual activation
and browser-visible effects remain open. The next concrete native entry points
are the ArcCore loader literals and source-unit candidate above.
