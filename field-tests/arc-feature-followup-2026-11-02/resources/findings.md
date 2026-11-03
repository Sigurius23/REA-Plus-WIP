# Arc packed HTML: before/after and feature follow-up

The missing inline-HTML capability is closed in the current working tree.
REA+ now parses the three script bodies in the exact two retained Arc HTML
resources directly, without the earlier manual `.mjs` extraction step. The
blocked-extension and theme paths are still **partially answered**: their source
and local data flow are available, while browser callbacks, DOM effects and
native-supplied values remain unresolved. No target code was executed.

## Same inputs, different recovered coverage

The input remains the two analyst-named `materialized-inputs/resource-14552.html`
and `resource-14565.html` files, **15,171 bytes**. Their bytes are the complete
decoded payloads returned by REA+ for the original main pack, SHA-256
`1ed7f6a099ad73f24fbe562cf6f5a287dbb534f2a3cb81a366a463cc5ab4a35b`.
The [materialization provenance](materialization-provenance.json) retains pack
identity, numeric resource ID, compressed payload range/hash, decoded HTML
digest and chosen input filename. These names are not recovered pack filenames.

| Capture | HTML/script coverage |
| --- | --- |
| Before: `ev_0bb7473227c2bbd3308ed8bc0314c08b913e174a0f6e30d75fe08cc73b5e5b66` | Two HTML files read; zero JavaScript files parsed, zero AST nodes, no inline-body IR. The historical result has no `parsed_inline_scripts` field; omission is not a measured zero. |
| After: `ev_e8918659b78760ed5c067ec4ea2cafdd2e51b4d07b05ea2aa14ca54467f952d3` | Same physical input digest, two files and 15,171 bytes; **zero physical JavaScript files / three parsed inline bodies / 222 AST nodes**, with **151 semantic nodes / 58 relations / 62 unknowns**. |

The owned 117-byte HTML reproduction also changes from zero recovered endpoints
to one recognized `fetch('/owned-inline-only')` candidate and twelve AST nodes,
while keeping physical JavaScript count zero and reporting one inline body.
The identical standalone JavaScript was already recovered before the extension.
This was a new offline capability, not a regression or a false semantic-complete
claim: the earlier semantic coverage was explicitly unknown. Root-owned
`post-fix/` captures also verify CLI/MCP exact Evidence parity, zero-body budget
and unterminated-body diagnostics, and unchanged import/trace of old Evidence.

## Source identity is preserved

The direct analysis yields these logical bodies:

| Resource | Kind | UTF-8 body bytes | UTF-16 range in decoded HTML |
| --- | --- | ---: | --- |
| 14552 | classic | 1,182 | `[1500, 2682)` |
| 14565 | classic | 189 | `[1213, 1402)` |
| 14565 | module | 634 | `[10336, 10970)` |

Each uses an explicit `rea-inline-script://...` URI, body digest and null
inventory artifact ID. Metadata and `maps_to` relationships identify its actual
HTML path/digest/inventory ID and original body range. These URIs are logical
source identities, not filesystem members or contacted URLs. Body AST locations
are relative to that logical body. The
[range audit](post-fix-feature-traces/source-range-audit.json) checks all three
body hashes/lengths and all **142 ranged semantic nodes**, and maps the focused
seeds back to exact decoded HTML locations:

- `missingExtensions` binding: resource 14552, **line 74, columns 8–25**,
  HTML UTF-16 offsets `[2279,2296)`.
- Theme callback parameter `themeData`: resource 14565, **line 383,
  columns 36–45**, offsets `[10699,10708)`.
- Blocked-page onload function: resource 14552, **73:16–82:1**.

Offsets and columns count UTF-16 units; body digests hash exact UTF-8 text with
original line endings. The compressed pack range does not give a one-to-one
compressed offset for an HTML/AST character.

## Feature: show missing versus blocking extensions

The previously returned resource-14552 source bytes describe an onload handler
that obtains `missingExtensions`, checks whether it is nonempty, unhides the
matching container and passes the list to a helper. Otherwise it selects the
blocking-extension container and list. The helper source creates list items
and appends extension labels as text nodes. This explanation is derived from
REA+'s returned source bytes; it is not a claim that REA+ automatically proves
the whole DOM/control-flow behavior or that Arc displayed the page.

The new direct HTML parent supports these focused public traces:

| Question | Direct REA+ result | Evidence |
| --- | --- | --- |
| Where does the local missing-extension binding flow? | Four nodes and three resolved read/alias relations reach argument zero of the helper call. Coverage remains partial. | `ev_aa9787eb7f87009aa33f0209b883aa2ebc333731c2ad0057340d7d048a1d2df3` |
| What produces its value? | Backward provenance reaches the local variable relation, then explicitly stops at `unknown-value`. It does not model `loadTimeData.getValue` return semantics. | `ev_fbcb1279415ad4f8258164c8d56ece40cf989698a0a0ff18f74c4ebfcd51ccaa` |
| Does the browser call this onload handler? | The callers query retains the function and six dynamic-call boundaries; zero resolved caller relations do not prove no caller. | `ev_3fa474573b33cda742e05d7513784abef86f66cd4fa15aebe02fec5a73ed4892` |

Arc's page-selection route, supplied lists, callback invocation and rendered
result remain unknown. This feature is **partially answered**.

## Feature: refresh the packaged incognito theme

The returned resource-14565 source bytes contain an initial stylesheet
cache-busting assignment, a load listener, a `theme-changed` subscription and
`chrome.send('observeThemeChanges')`. The callback reads
`themeData.hasCustomBackground` and updates a document attribute and theme CSS
URL. This is static shipped source, with Chrome-internal imports retained as
external references; nothing was fetched or observed running.

The direct parent trace from the actual `themeData` parameter reaches its local
read (**two nodes / one resolved relation**) but keeps `unknown-value` and
partial coverage:
`ev_68c59230d479b2f5a82a70e5af946cb3ebada68467e421a2de0b17abf049b0aa`.
It does not establish the supplied theme object, listener dispatch, DOM effects,
native theme handler or active Arc configuration. This feature is also
**partially answered**; the new parser capability does not close these runtime
or external-API boundaries.

## Recording and remaining scope

The feature session imports the new portable parent and runs **four traces**;
it does not rerun `analyze_javascript_application`. All **seven calls** succeed,
validate actual advertised schemas/named contracts and text/structured equality,
then export a complete bundle and close with verified empty owned descendants.
The [receipt](verification-receipt.json) independently revalidates **45 successful
MCP calls** across the original resource session, root post-fix session and this
feature session, five retained bundles, current/legacy JS result shapes,
source-range identity and root-owned CLI/MCP equality. Imported/repeated bundle
records are not new producer operations. Source/package gates are recorded by
the root follow-up report, not inferred from these counts.

Earlier extracted `.mjs` fallback inputs and their traces remain historical,
explicitly supplemental preparation. Current feature conclusions use the new
HTML-derived parent. The five bounded extra resource selections identified a
placeholder, alternative static pages and CSS; they did not recover numeric-ID
mapping for the declared internal-extension or Google Docs helper scripts.
Those implementations, active integrations, resource routing and the broader
Arc app remain open. This trace pass adds no further confirmed source issue.

To repeat only the recorder audit, without a producer or target launch:

```sh
node field-tests/arc-feature-followup-2026-11-02/resources/post-fix-feature-traces/verify.mjs
```
