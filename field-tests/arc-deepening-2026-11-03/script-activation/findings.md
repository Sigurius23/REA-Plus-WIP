# Script activation and continuation boundaries

The prior authenticated three-script parent was imported rather than reproduced.
New parameter traces for the tab-update callback retain 6 nodes / 6 relations
(tabId), 5 / 6 (change status), and 7 / 7 (tab object), with candidate edges
explicitly enabled. These are static influences and remain ambiguous.

Manifest 14548 limits the Reading Mode Google Docs Helper candidate to its
declared document URL patterns, includes frames, runs at document_start, and
exposes gdocs_script.js separately. Manifest 14558 describes an MV3 background
script with scripting/tabs permissions and explicit HTTPS hosts for Slack,
Chrome Web Store and Notion. These declarations do not prove runtime activation.
The script's site matching uses substrings, and its branding comes from the
first word of `getManifest().name`. The shipped name still includes `<APP_NAME>`;
native substitution and component-extension loader mapping remain unresolved.

The owned inert sources in `fixtures/` reproduce two useful continuation gaps:

- `known-return.js` retains a literal returned property and resolved local return
  flow, but the caller's `result.value` property loses that field provenance.
  `owned/known-return-parity.json` proves identical public CLI/MCP Evidence
  `ev_ec6c69ba88f8808cf2f8ebaaba61fce4bc4760c403ce24ed3c6ac3febeff424b`:
  backward output tracing has 2 nodes / 1 edge and no returned-field source.
  The forward trace reaches the call/result binding, then stops. This is item 45.
- `event-emitter.js` registers a named local handler on a Node EventEmitter.
  Event/registration/dispatch candidates exist, but listener-to-handler
  continuation is absent even with candidate traversal enabled. Exact CLI/MCP
  Evidence `ev_322778863d38b015f35d2b2d2c9da244bc410877e689a8c0c304c47811d3db3d`
  has 1 node / 0 edges. This is item 46. DOM and Chrome-specific event profiles
  are broader extensions, not separately counted regressions.

Direct callbacks and opaque consumers are kept as controls. The owned scripts
were parsed as text and never executed. Complete producer and trace records are
in `owned/producer-bundle.json` and `owned/evidence-bundle.json`. Three exact CLI/MCP comparisons are
retained. The corrected owned session completed 13/13 calls and verified empty
owned descendants. The initial compiler-cache denial and its original partial
observation remain in the first capture; it was resolved with an explicit
temporary module cache and appropriate host execution context.
