# Arc continuation: static witnesses, decoded-resource discovery and returned fields

Date: **2026-11-03** (Europe/Berlin). This continues the
[previous feature investigation](arc-feature-followup-2026-11-02.md).
Items **42–44** address independently reproduced offline analysis gaps. Arc and
its helpers were not launched; no profile/account/service state or target URLs
were accessed. Source-built fixtures were compiled and inspected, not executed.
Full Arc behavior remains incomplete.

## REA+ improvements

| Item | Change | Public verification |
| --- | --- | --- |
| 42 | Retain static resilient Swift requirement/witness pairs separately from instantiated table slots. Exact indexed-conformance selection avoids spending decode admission on unrelated records. | Arc `BoostIDERequest`, conformance `0x1036a9f58`, yields implementation `0x100537e18`; CLI/MCP Evidence is exactly `ev_120f75645ad89abfcf445e088cfc59b3deb8e4e9595b11375d0da7e52ff010c8`. |
| 43 | Search bounded canonical Chromium resource windows for literal decoded bytes, sharing the validated index and decoder with selected inspection. Preserve aliases, stored/decoded identities, byte matches, skips and cursors. | Four literal surveys each decode all **5,414 canonical resources**, **80,643,472 decoded bytes**, with zero skips. The owned 490-byte compressed/binary pack reproduces search independently of Arc; selected CLI/MCP Evidence matches. |
| 44 | Preserve returned-object field sources in optional semantic IR and project read → returned field → return aggregate using existing graph identities. | The unchanged known-value fixture now has **4 nodes / 3 resolved edges / 1 return sink**; both arrow forms and nested keys pass. Ten negative controls gain no false sink paths. Legacy imported traces remain identical. |

Item 42 initially erased valid static pairs when generic runtime private storage
was not file-backed. The final reader validates the complete file-backed tail,
retains independently recoverable pairs and records control-target uncertainty.
Imported requirement flags stay null, the Arc implementation is classified only
as an executable address, and runtime ordering/instantiation remain unknown.
An unindexed descriptor selector returns no records with explicit partial scope;
invalid facet/selector combinations fail. Whole-image coverage remains partial
at the original 20,000-record budget; the selector does not raise that budget.
See [native receipts](arc-continuation-2026-11-03/resilient/after/final/README.md).

Item 43 returns the first literal occurrence per matching canonical payload.
Needle encoding is independent of the pack's encoding hint: binary matches are
valid candidates. Alias identities share one decode. Strict lossless text ranges
are optional; decoded byte ranges and hashes are authoritative. Aggregate decode
exhaustion retains the blocked canonical cursor, and failed codec attempts charge
their admitted output reservation. Corrupt/oversized resources remain explicit
skips. Match-limit stops are partial window coverage. No filename, MIME type or
runtime use is inferred. The preview producer also keeps clipping boundaries
outside surrogate pairs. See [resource findings](arc-continuation-2026-11-03/resources/findings.md).

Item 44 does not change default candidate filtering. Old Arc traces hid alias
candidates by default; opting in exposes them with their uncertainty. The narrower
new defect was missing field provenance even for known static reads. Fresh Arc
analysis retains **21 returned-field slots, 16 in SelectorPicker**; DOM values
remain unknown. The complete new Arc parent is retained/exported when its inline
MCP reply exceeds the declared transport budget. See [return-field verification](arc-continuation-2026-11-03/returns/after/findings.md).

## Additional Arc findings

The new search locates actual inert code candidates beyond the earlier manifest:

- Resource **14865** is a 390-byte Google Docs injection wrapper referencing
  `chrome.runtime.getURL('gdocs_script.js')`. Resource **14866** is a 1,425-byte
  helper that obtains an extension identity and sets
  `_docs_annotate_canvas_by_ext`, with explicit Trusted Types/eval and injected
  script branches.
- Resource **14901** is a 3,301-byte tab-update dispatcher. Its source selects
  Slack, Chrome Web Store and Notion behavior by URL substring checks. It
  synchronizes Slack background with the computed color scheme, manages a Notion
  dark background, and changes Web Store notices/branding. Loading/complete
  conditions and inserted CSS/script choices remain visible in the source.
- Exact pack/ID/stored-range/decoded-hash maps authenticate the three materialized
  files. Together they parse as **3 files / 5,116 bytes / 932 AST nodes**. Three
  automatic semantic traces remain partial. The original filename-to-ID loader
  mapping, actual runtime activation and visible outcomes are not established.

Native follow-up recovers the `BoostIDERequest` Decodable witness → decoder path.
The decoder's immediate small-string comparisons derive command values
`v2-edit-css`, `v2-load-css`, `v2-edit-js` and `v2-load-js`; these are analyst
instruction/pseudocode derivations, not an automatic string inventory. Public
metadata bytes independently show declared `CodingKeys` cases `boostId`, `type`
and `data`, plus a `BoostIDEData.contents` String field. The raw-value getter and
runtime message binding have not been verified, so case names are not promoted
to proven wire-key spellings.

The public bytes also retain all 15 `WebContentChromium` field names, including
`uiDelegate`. Open/close/command helpers call distinct offsets through a weak
delegate; its concrete receiver remains unresolved. The Boost editor layout
helper uses 183×588 dimensions in one statically observed mode, centered frames,
scaling/anchor/opacity operations. This does not establish every visible layout
or state transition. See [verified metadata derivation](arc-continuation-2026-11-03/native/fields/retry/verified-field-derivation.json).

The metadata selectors were partly prepared from supplemental original bytes,
then checked against complete public REA+ reads. That preparation is explicitly
retained and is not presented as automatic REA+ recovery. Ghidra's 60-second
Program remains partial, as did the earlier 300-second comparison.

## Verification and retained limits

- `npm run check`: six tasks pass, zero errors, 907 warnings; module boundaries
  and **1,539 architecture guards** pass.
- Final focused run: **189 tests / 16 files**, including actual CLI/MCP search
  and existing selected-resource workflows. Earlier owned source lanes retain
  their separate 55-test native and 144-test JavaScript receipts.
- `npm run verify:apple-dispatch`: all ten symbol-bearing/stripped, dyld-info,
  chained-fixup and arm64e variants pass. Swift fixtures retain 56 resilient
  records and implementation addresses checked against compiler symbols.
- Documentation checks pass; duplicate lines remain **2.48%**. Full
  `check:pr` was not rerun. Supported Node 24.22.1/npm 10.9.2 were used; the
  unavailable exact pins were not installed.
- Isolated package verification passes **205 tools / six prompts**, packaged
  skill 42, installation/update, CLI/MCP Evidence and owned cleanup. The log is
  recorded in
  `arc-continuation-2026-11-03/checks/verify-package.log`. The first sandboxed
  attempt lacked npm registry access; the authorized retry passed. `HUSKY=0` applies only
  to that verifier: this package directory has no local `.git`, and Husky's
  prepare diagnostic otherwise contaminates the verifier's captured pack name.
- Canonical Evidence authentication and complete-bundle checks are in
  [the audit](arc-continuation-2026-11-03/evidence-audit.json). Raw replies,
  arguments, actual catalogs, errors and recovery attempts remain retained. The
  shared driver retains 200 calls / 196 successes across 11 sessions; four
  caller, transport or lifecycle errors are preserved separately. Native SDK
  parity checks and automated verifier calls are additional, not included in
  that count.
- All **782 regular Arc files / 860,945,885 bytes** match the prior inventory,
  with no added or missing regular paths. See
  [target integrity](arc-continuation-2026-11-03/target-integrity.json).

One sandboxed native startup failed and could not inspect its process lineage;
the successful retry retained its own receipts. A repository check was then
incorrectly overlapped with public sessions: its compile prerequisite removed
the runtime before a test-lint error stopped the build. The explicit native
close reported an ownership-token cleanup warning during that disruption.
Final client cleanup and an independent recheck confirm no remaining descendant,
no current child PID, and no remaining temporary runtime directory. The original
errors remain intact; see [cleanup recheck](arc-continuation-2026-11-03/native/fields/retry/cleanup-recheck.json).
Subsequent builds/checks and final public sessions were coordinated sequentially.

## Remaining investigation

Native selector-library invocation, concrete delegate receiver/caller paths,
raw wire-key conversion, complete Boost state/rendering behavior and unrelated
Arc subsystems remain open. Candidate content and static reachability do not
prove execution. These are bounded investigation questions; no additional
numbered REA+ defect is claimed without reproduction.
