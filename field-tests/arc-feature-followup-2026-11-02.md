# Arc feature follow-up — 2026-11-02–03

This investigation continues from published retest `d4bf47b75`, following
concrete gallery, Boost IDE, sidebar, selector and packed-page questions.
The native pass establishes the gallery's URL/action and the IDE's request
case names and response boundary. The packed HTML pass exposed and then fixed
the offline inline-source capability gap tracked as **item 41** in `OPEN_TASKS.md`.
Full application analysis remains incomplete.

The scope is shipped artifacts only. Arc, its helpers and resource code were
not launched or executed; no UI, profile, account, target service or endpoint
was selected. URLs below are observed strings, not contacted services.
Owned compiler fixtures are source-built analysis inputs and are not executed.

## Feature findings

| Question | Result | Basis and boundary |
| --- | --- | --- |
| What does the gallery callback dispatch? | Statically derived: `AppAction.openExternalURL` with `https://arc.net/boosts?ref=arc-app`. | Original callback, enum/field layouts and public bytes, concrete input `0xc4`, signed-word branch entry and successfully code-seeded instructions. The runtime closure and final navigation remain unknown. |
| Which request cases reach the Boost IDE decoder? | Metadata names `BoostIDERequest` and `loadCSS`, `editCSS`, `loadJS`, `editJS`; the wrapper/helper reaches `JSONDecoder.decode`. | Public typed layouts/bytes and call instructions. These case names are not asserted to be JSON wire keys or proof of applied code. |
| Is there a decode-error response path? | The assembly retains the branch omitted by pseudocode; a JSON-encoding response helper selects `sendErrorResponse:jsonString:` or `sendResponse:jsonString:`. | Exact error-register branch, payload byte 2 and decoded Objective-C selector pointers. Actual messages and callbacks were not observed. |
| What feeds the sidebar cursor decision? | The low-bit decision follows window/child-window ordering and view hit testing, including `contentView`, `mouseLocationOutsideOfEventStream`, `hitTest:` and `isDescendantOf:`. | Exact message stubs/slots and branch instructions. The default decompiler signature is low-confidence; geometry, ordering/exclusion helpers and live cursor state are incomplete. |
| What can the selector library's inputs be traced through? | Coordinates reach local reads; a selected-element binding reaches 43 relations across ten functions; a selector argument reaches `querySelectorAll`. | Six focused public semantic traces reuse the prior complete parent. All are partial; DOM returns, full result provenance and native invocation/rendering remain unresolved. |
| Can REA+ directly analyze the packed HTML's inline bodies? | Yes, in the new bounded profile: three derived bodies / 222 AST nodes / three retained module IRs. | Original HTML identity/ranges and distinct classic/module modes remain explicit. Source ranges map back to decoded pack entries; runtime DOM behavior remains unknown. |

## Native evidence and recovery limits

The original universal executable remains SHA-256
`e82d2a4245b6239860e41a149cb31c0c030e35b383456544c81f21d45ee03376`.
The exact arm64 slice remains
`085056cad2197ab3b87b6b54a5a0d36964c5d9e756ec451a5b6f0b478c8baae8`.
The input/provenance boundary is in
[`run-context.json`](arc-feature-followup-2026-11-02/run-context.json).

Three native sessions complete **138 successful public calls** and export
**126 authenticated record occurrences**. All use the explicit 60-second
bounded profile and remain stable partial Programs. Public schemas, named
contracts, text/structured equality, canonical Evidence and the quoted
byte/layout arithmetic pass the
[recorder audit](arc-feature-followup-2026-11-02/native/verification-receipt.json).
All sessions close with verified ownership and empty descendant snapshots.

A fourth comparison raises the analysis policy from 60 to **300 seconds**, with
the same twelve function-seed bytes and no case-code seed. It observes **48,244
procedures / 213,501 defined strings**; the gallery body grows from 2,100 to
**2,932 bytes**, but the selected computed dispatch remains unresolved and the
Program still reports incomplete/timed-out analysis. This is a larger partial
observation, not a completed control or a production repair. Its six successful
calls and two-record real export bring the native audit to **144 calls / 128
bundle record occurrences** across four verified-cleanup sessions. See
[`longer-analysis/`](arc-feature-followup-2026-11-02/native/longer-analysis/).

The gallery helper still has only **2,100 bytes in five owned body ranges**.
Its separately reported switch targets and displayed pseudocode do not imply
complete case ownership. For the actual caller constant, public bytes derive
the target `0x1005a5158`; a **code** seed makes twenty instructions inspectable
without inventing a case-entry function. That local recovery establishes the
URL construction but leaves the original body and other cases incomplete.
See the [native findings](arc-feature-followup-2026-11-02/native/findings.md)
and [independent interpretation review](arc-feature-followup-2026-11-02/selector/native-review.md).

A related optimized Swift enum fixture, with and without debug information,
does **not reproduce** the Arc body gap under default-complete, unseeded
Ghidra. Both reported owning bodies contain **20,020 contiguous bytes** and all
returned table targets. This does not close Arc's partial analysis or prove
perfect switch mapping: warnings and mapping counts differing from the source
case count are retained. Its **17 calls / 14 successes / three expected
transport refusals**, complete analysis flags, actual exports and verified
cleanup are documented in the
[fixture report](arc-feature-followup-2026-11-02/selector/native-fixture/findings.md).
No general body-recovery defect is numbered from that non-reproduction.

## Selector library

The selector worker imports the existing authenticated portable parent rather
than repeating source analysis. Eight public calls succeed, including six
focused traces and a real export. Its fourteen-record bundle includes eight
imported records. The original source digest stays unchanged and owned
descendants are empty after close.

The public semantic graph observes the `getSelectorCandidates` and
`rectsForSelector` property writes and traces selected argument/local-binding
flows. It does not reconstruct the complete returned object shapes or resolve
DOM execution. Separately labeled inert source review records the intended
candidate `{selector,matches}` and rectangle `{x,y,width,height}` contracts.
Those supplemental findings do not fill REA+ fields. Exact traces, ranges,
unknowns and verification are in the
[selector findings](arc-feature-followup-2026-11-02/selector/findings.md).

Native literal searches find `rectsForSelector(` and
`getSelectorCandidates({x: `, but public xref queries at both the string
addresses and their candidate Swift-string headers return no references in
the partial Program. This attempted boundary remains unresolved; matching
names alone do not establish injection, native invocation or a rendered overlay.

## Offline HTML capability: item 41

The exact decoded resources 14552 and 14565 contain nonempty inline JavaScript
bodies. The pre-fix public offline analysis reads the two HTML documents but
returns zero parsed JavaScript files / AST nodes. An owned **117-byte HTML /
identical 68-byte body** pair reproduces the difference: the standalone body
has **12 AST nodes** and the declared `/owned-inline-only` fetch candidate.
The prior guide advertises external HTML script links rather than inline-body
recovery, so this is a capability extension, not a regression or a claim that
the old producer falsely reported complete semantics.

**Item 41 is fixed and verified on 2026-11-03.** One prepared-source owner
retains each body independently, with original HTML digest/inventory identity,
UTF-16 offsets/range, document base and classic/module kind. A logical
`rea-inline-script://` URI is not a physical inventory entry. Both syntax and
semantic locations refer to that body, with explicit maps back to the original
document. Unicode/BOM/line-ending and duplicate-body identities are tested.
Physical-file statistics remain separate from `parsed_inline_scripts`; parsing
results include retained failures, which remain separately visible in statuses.
Historical counters are not fabricated when absent from old Evidence.

Inline imports and source-map references resolve from the document/base,
rather than the logical URI. Browser bare-specifier/import-map and Node binding
authority stay unknown. Data blocks, external-source fallback bodies, comments,
templates and foreign script bodies are not silently analyzed as active inline
programs. Classic/module scheduling and shared globals remain unobserved.

The run-wide `max_inline_scripts` / CLI `--max-inline-scripts` policy defaults
to **1,000**. Zero retains selection/omission metadata without admitting bodies.
Coverage and the `file_statuses` page distinguish physical files, HTML documents
and derived scripts, including explicit omission and unterminated-body issues.
Review caught an interruption-retention edge; both result-construction paths
now preserve already known HTML metadata. Two deterministic regressions fail
before that fix and pass afterward. A real one-millisecond timeout retains the
HTML row with both failure and **two known omitted bodies**, then the same
server successfully analyzes Arc's pages. Its
[public timeout receipt](arc-feature-followup-2026-11-02/resources/post-fix/interruption/verification-receipt.json)
records five successes and one expected timeout across six calls.

The unchanged **15,171-byte / two-document** Arc input now produces **three
inline bodies** (two classic, one module), **222 AST nodes**, zero parse failures
and three complete retained module IRs. All three body digests/ranges and **142
ranged semantic nodes** are checked against the exact decoded HTML. The new
parent is `ev_e8918659b78760ed5c067ec4ea2cafdd2e51b4d07b05ea2aa14ca54467f952d3`.
It remains byte-identical after the interruption fix. Four focused traces reuse
it without reanalysis: extension-list values reach a helper argument and theme
data reaches its local read; dynamic DOM/callback/value boundaries remain
partial. See the [resource findings](arc-feature-followup-2026-11-02/resources/findings.md)
and [range audit](arc-feature-followup-2026-11-02/resources/post-fix-feature-traces/source-range-audit.json).

## Final verification and publication scope

- **166 source tests / seven files pass.** The initial sandboxed lane could not
  write the existing Swift ownership-helper module cache; the final complete
  lane passes with the observed host prerequisite. The interruption regressions'
  red/green logs are retained.
- `npm run check` passes all six tasks plus architecture guards across **1,531
  source files**; lint reports **900 warnings / zero errors**. Documentation
  checks pass all six tasks; duplication remains **2.48%**.
- Isolated `verify:package` passes install/update, CLI/MCP and cleanup checks,
  **204 tools / six prompts**, and packaged skill **41**. It runs with
  `HUSKY=0` for the isolated verifier process: this checkout's package
  directory has no local `.git`, so its prepare hook otherwise prints a warning
  that pollutes the captured `npm pack` filename. No host
  toolchain was installed or upgraded.
- Two exact CLI/MCP comparisons cover default inline analysis and the explicit
  zero-budget option. The public old-parent import/trace preserves its original
  authenticated trace ID, demonstrating saved Evidence remains usable.
- Final integrity re-reads **782 previously inventoried regular files /
  860,945,885 bytes**, with zero mismatches. This does not assert complete
  directory-set, symlink-target or runtime-state verification.

Raw inputs, actual catalogs, complete public replies, portable exports, source
identities and recorder-only validators remain under
[`arc-feature-followup-2026-11-02/`](arc-feature-followup-2026-11-02/).
The independent [source review](arc-feature-followup-2026-11-02/selector/inline-source-review.md)
records the resolved retention issue. The full `check:pr` gate was not rerun.
The two existing large Rize JSONs are outside this publication batch.

## Remaining questions

The static gallery URL/action and IDE declaration/response boundaries are
established within the stated inference limits. The runtime action closure,
command delegate/implementations, request encoding details, selector-to-native
rendering bridge, full sidebar layout/animation, resource routing and most
application subsystems remain open. This pass must not be presented as complete
Arc feature/design recovery.
