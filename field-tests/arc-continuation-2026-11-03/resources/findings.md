# Arc shipped HTML and decoded-pack search — 2026-11-03

The expanded shipped-source scope finds a working Easel collection sort/filter
body and a YouTube HTML template that needs runtime substitution. The owned pack first confirmed the missing decoded-resource search primitive
(item 43); the new public operation is now verified and located three real Arc
helper code candidates.
No Arc/resource code, UI, account, profile or service was executed or accessed.

## New shipped-source scope

The retained original inventory identifies four HTML files beneath
`/Applications/Arc.app/Contents/Resources`: `Credits.html` (438,551 bytes),
`EaselExportCollection.html` (7,211), `EaselExportViewer.html` (504) and
`YouTubePlayer.html` (3,814). Their exact paths/hashes and the unchanged three
JavaScript sources are in [source-selection.json](source-selection.json).
All seven file hashes match that inventory before and after this pass.

This is one new producer scope, `**/*.js` plus `**/*.html`; the earlier producer
covered three JavaScript files only. Parent Evidence
`ev_4bd3435d5db25662dfbff419a96fd2fa44ee7d95a395bf8329e31502f5d3afa1`
records **7 selected / 21 excluded relevant files**, **480,720 bytes**,
**3 physical JavaScript files / 2 inline parse outcomes / 6,793 AST nodes**.
One inline body fails parsing, so application coverage stays partial. Semantic
coverage remains unknown: **5,164 nodes / 5,061 relations / 1,551 unknowns**,
with no resource-based node/relation omissions.

## Easel collection: partially answered

The 1,145-byte classic body in `EaselExportCollection.html` parses completely,
with retained IR and semantic projection. Its derived URI maps to exact original
HTML UTF-16 offsets `[6038,7183)`, SHA-256
`073e34aa181d8eb55c968c240579add6738a0d6ba252419da2ba05906e01a7d7`.

Supplemental, hash-verified inert source review describes `refresh`: it sorts
titles with base-sensitivity `localeCompare`, otherwise descending numeric
dataset values with zero fallback; filters all/shared/non-shared rows; reapplies
the row order and empty-state visibility. The source registers two `change`
callbacks and contains no explicit initial `refresh` call. This explanation is
derived from source bytes, not an observed browser run or a claim that REA+
automatically proved the entire DOM behavior.

The focused public traces preserve the actual attempted boundaries:

| Trace | Result | Evidence |
| --- | --- | --- |
| Sort-key influence | 7 nodes / 8 relations across 2 functions; dynamic calls/property access and unknown value remain. | `ev_8b620b54b1317aff7c1f5e6906ecf34069debb2cd34b6be5a7e742d7c9e6c61e` |
| Filter influence | 4 nodes / 4 relations across 2 functions; unknown value and dynamic call remain. | `ev_208b665cb9e7b459e786c1627b6fa76fa50d848e02f94a88b20fdb8b9ff8b637` |
| Refresh callers | Function retained, zero resolved caller relations, 3 dynamic-call boundaries. Zero resolved callers does not prove no caller. | `ev_89de39e74d6c1750876fe5a7c59d298ee8900f9ca0461a267beee0ca10b99103` |

All three traces are partial. Native export population, actual dataset values,
initial DOM state, browser callback dispatch and rendered outcome remain open.

## YouTube template: unresolved before expansion

The 2,531-byte classic body in `YouTubePlayer.html` is retained by identity and
range `[1256,3787)`, but its raw source contains a literal `%@` format token as
the second `window.YT.Player` argument. A comment explicitly says runtime
replaces that argument. Supplemental source review identifies the token and
range; automatic analysis truthfully reports syntax failure and unretained IR.
It does not establish that the app's generated JavaScript is broken.

The source text also defines `youtubeplayer://` event URLs, but their native
navigation handling, actual player options and template expansion were not
traced. These remain supplemental source observations, not recovered semantic
fields. [supplemental-source-review.json](supplemental-source-review.json) keeps
that distinction and the verified source identities. The public module/status
records preserve the failed template rather than inventing a replacement value.

## Search need before item 43

The captured 204-tool catalog offers only ID/offset/decode/byte limits for
`inspect_chromium_resources`; it has no decoded-content query. The dedicated
search operation is absent. The existing JavaScript string search intentionally
scans zero JavaScript files in a directory containing only a pack, so its empty
result does not search or exclude packed content.

The reproducible [owned fixture](owned-search-fixture.json) is a 490-byte
DataPack v5 with four canonical resources and one alias. Public selections
prove that the same known manifest script literal, `gdocs_script.js`, appears in
the manifest and gzip/Brotli implementation-like payloads. It also occurs as
encoded bytes in a non-UTF8 binary payload; that is a legitimate byte-search
candidate, not a filename or text-type claim. The original inspect CLI rejects `--query`
with exit 1 and `Unknown flag: --query`. This is a missing analyst capability,
not a compression regression. The fixture's chosen numeric IDs do not map to
real Arc filenames.

Item 43 now supplies `search_chromium_resources` /
`search-chromium-resources`. It reuses the validated index and bounded decoder,
searches each admitted canonical payload once, retains aliases and exact decoded
byte ranges/hashes, and keeps skips and pagination explicit. Query encoding
describes the literal needle; invalid text and binary payloads remain legitimate
byte candidates. No numeric-ID guessing was used to discover the helper code
below.

## Initial diagnostic verification

[verification-receipt.json](verification-receipt.json) authenticates all **20
successful public MCP calls**, actual advertised schemas/named contracts,
text/structured equality, three portable bundles, the seven selected file
hashes and both inline maps. The exported parent is reused for views/traces;
the producer is not repeated. Owned shutdown reports verified empty descendants.
The unsupported CLI flag is recorded separately from successful analysis calls.
Source code and shared task-registry changes are outside this diagnostic capture.

The tiny binary fixture stays in `/private/tmp`; its durable builder is
[create-search-need.mjs](create-search-need.mjs). Re-run only the recorder audit
with `node field-tests/arc-continuation-2026-11-03/resources/verify.mjs`.


## Item 43 public retest: search coverage and candidates

The rebuilt catalog advertises **205 tools**, including the new dedicated search.
The exact same 490-byte fixture now returns IDs **7, 42, 43 and 91**. Alias 4242
is attached to canonical 42 without a second result/decode; the invalid-UTF8
binary candidate 91 remains present with null text proof. Complete CLI Evidence
matches MCP Evidence exactly:
`ev_e0801171506fd88917d188454aa921f2a7b7f1d11c452acdf68e51117af91c0b`.

Four case-sensitive UTF8 literal searches covered every canonical payload in
Arc's pinned `resources.pak` (SHA-256
`1ed7f6a099ad73f24fbe562cf6f5a287dbb534f2a3cb81a366a463cc5ab4a35b`).
Each query joins six contiguous canonical pages: **5,414 examined / 5,414 decoded,
80,643,472 decoded bytes, zero skips**. Each page retains partial whole-pack
coverage; the recorder explicitly joins the same-hash, gap-free pages. Limits
were 8 MiB per stored/decoded payload and 512 MiB decoded work per search page.
This is complete byte-query coverage of that pack, not complete Arc behavior.

| Literal | Candidate IDs | Interpretation |
| --- | --- | --- |
| `gdocs_script.js` | 14548, 14865, 14866 | Known manifest plus two small code bodies. |
| `content.js` | 14548, 52953, 63531 | Known manifest, unrelated DevTools string and Boost template content. A filename substring alone does not identify an implementation. |
| `background.js` | 14558, 14867, 18398, 63531 | Several distinct manifests plus Boost templates; no automatic filename attribution. |
| `app.slack.com` | 14558, 14901 | Internal-extension manifest and a code body with all three declared site patterns. |

[search-after/verification-receipt.json](search-after/verification-receipt.json)
authenticates all **29 public calls**, two exported bundles and independent
bounded byte/range/hash checks of all 13 distinct matched payloads (four owned,
nine Arc). Its page Evidence IDs and exact inputs remain durable. The new
acceptance journey also passed: actual SDK/AJV contracts, five complete CLI/MCP
Evidence comparisons, gzip/Brotli/binary/alias semantics, literal negatives,
UTF16 BOM/astral/unaligned byte matching, cursor/budget/stale-hash behavior,
malformed input, codec failures, omissions and recovery. See
[acceptance-receipt.json](search-after/acceptance-receipt.json).
A subsequent producer review fixed previews that split an astral character at
either bounded edge. Seven real-filesystem boundary scenarios now pass,
including both UTF8/UTF16LE encodings with unchanged payload digests and exact
match ranges. The source correction is recorded in
[preview-correction-receipt.json](search-after/preview-correction-receipt.json);
final package/source gates remain with the coordinating owner.

## Recovered helper feature paths

Public selections recovered three gzip payloads as inert bytes. The analyst-
chosen `resource-*.js` names do not claim original filenames.
[materialization-provenance.json](search-after/materialization-provenance.json)
retains each original pack hash, canonical ID/index, table and stored payload
range/hash, decoded digest and standalone Evidence. The three materialized
inputs exactly match those decoded bytes.

- **14865, 390 bytes:** creates a script element, obtains
  `chrome.runtime.getURL('gdocs_script.js')`, then appends it to the document
  element. Selection Evidence:
  `ev_f9bc1acd60f417e15fdc6753812a02f70272ff20531bab6349fcb9a3e19f17d2`.
- **14866, 1,425 bytes:** defines and calls
  `triggerDocsCanvasAnnotationMode`. If `chrome.runtime` or its ID is absent,
  it parses the extension ID from `document.currentScript.src`, creates a
  Trusted Types policy and evaluates generated source assigning
  `window['_docs_annotate_canvas_by_ext']`. The other branch takes the runtime
  ID and appends an inline script making that assignment. Source comments
  describe the purpose as enabling annotated Canvas for accessibility; actual
  Docs rendering and policy success were not observed. Selection Evidence:
  `ev_663d89bfdf21071389033813ceb4613228e542f604fe76353a557aea1adfe14f`.
- **14901, 3,301 bytes:** registers `chrome.tabs.onUpdated`; chooses a site
  entry with `tab.url.includes(entry.url)`, inserts that entry's CSS during
  `loading`, and invokes its script during `loading` or `complete`. It passes
  the first token of the runtime manifest name as a branding argument. The
  site's three cases match the internal manifest's Slack, Web Store and Notion
  host patterns, supporting a candidate association with that extension.
  Selection Evidence:
  `ev_e94fe7973bd80616410a44ba886f7e7003c45ad2826c0de18d10b4e360e6f9d8`.

The Slack case synchronizes body background to computed `colorScheme` using
`#0D0F0E` or `#F6F6F5`, initially and after body-class mutations. The Notion case
sets `#191919` for dark mode only when the inline background is empty, remembers
its own assignment and clears it when leaving dark mode. Both install a window
function guard and defer initialization to DOMContentLoaded when necessary.
The Web Store case suppresses specific Chrome-only notices/dialogs, replaces
Chrome text in selected buttons with the branding argument, and repeats cleanup
through a bounded timer plus mutation observers. These are hash-verified source
interpretations; the sites were never loaded and the scripts were never run.

The focused public producer parsed **3/3 JavaScript files, 5,116 bytes and 932 AST
nodes**, with no parse failure. Retained parent
`ev_682b71d8ff5cbe32bfac2ca4d92963a4661ef4e59e0bc3b4c9abbd0d015911c5`
contains **611 semantic nodes / 388 relations / 219 unknowns**, without resource
omissions. Complete syntax coverage concerns these three inputs only.

| Public trace | Actual boundary | Evidence |
| --- | --- | --- |
| Docs trigger callers | Two nodes / one direct caller relation; seven dynamic/eval boundaries remain. | `ev_cdb3b08ab0be50d272cc2dd80f47f00d8c32f5f940f08a7f94081fbdb8863316` |
| Internal executeScript backward | The call-site seed is retained; no backward relations were resolved. Browser API arguments and dynamic site selection were not proved end to end. | `ev_6fb1e97a82a5932afdb4998286b71011953d881e0bd7b1182ea9be5240844475` |
| Slack computed-style forward | The call-site seed is retained with ambiguous status and no forward relations. This is not automatic proof of the color-to-style path. | `ev_c83f8ebab3f79f669605759cca685e1b91b7ed153d55e31ea60237e432058ea9` |

All three traces remain **partial**. Their exact seeds, outputs and source
identities are preserved in
[feature-analysis/verification-receipt.json](search-after/feature-analysis/verification-receipt.json)
(**6 public calls**, two authentic portable bundles, three byte-identical input
maps, verified empty owned descendants). Supplemental source interpretation is
kept separate from missing automatic graph relationships.

Remaining unknowns include the native/component loader's actual ID-to-file
binding, enabled extensions/flags, runtime script worlds and policy outcomes,
actual tab events/DOM/CSS state and external-site behavior. The earlier raw
YouTube template still needs its native expansion context. The selected
payloads parse and the decoded queries succeed; this does not convert static
or unsupported boundaries into a complete Arc behavior claim. No target
execution or network request was used. Nothing in this lane was committed or
pushed.
