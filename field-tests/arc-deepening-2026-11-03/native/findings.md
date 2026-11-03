# Native selector and Boost continuation

The original universal executable and the restored arm64 slice retain their
prior SHA-256 identities. Temporary databases were used; Arc was not launched.
The first session expired while waiting for a continuation and closed with
verified empty descendants. Later bindings make changed, focused requests.

## Selector entry recovery

Byte-pattern matches establish candidate ADD-immediate instructions, not full
references. Analyst ADRP/ADD calculations selected four sites. Public bytes and
the 355,872-byte LC_FUNCTION_STARTS table validate the indexed function entries;
`continuation-session/function-start-validation.json` retains that derivation.
Caller-supplied function seeds remain distinct from Ghidra discoveries.

Two header-biased candidates were not selector invocations: one is a SwiftUI
saturation control, and one uses a source-filename argument in an error path.
Their original candidate labels are historical hypotheses, not final findings.
The latter routine independently reveals the SelectorPicker.js loader.
No absence claim follows from retained byte-search candidates; some pattern
counts exceed their result retention cap. Schema `complete` describes counting.

## Established paths

- `0x1012df980` requests **SelectorPicker.js** using
  `URLForResource:withExtension:`, reads it as a Foundation String, and caches
  the two String words in globals. Dossier
  `selector-session/native-selector-candidates-request.evidence.json`,
  `ev_1d61040c01aa9f92aa97b453d85c029a129218c16908e71aabd49ac08b4a6525`.
  The installed matching resource is
  `Contents/Resources/ARC_BoostsEditor.bundle/Contents/Resources/SelectorPicker.js`,
  11,068 bytes, SHA-256
  `0e779dad9316f8b14cf4e1b20fa710240cd90bc9a9a1dd820df38ebd525d977d`.
  Bundle selection has several candidate locations; actual runtime resolution
  is not observed.
- `0x1012e02dc` builds the **getSelectorCandidates({x: ... , y: ...}, {})**
  expression, including Double-to-String conversion. Public literal region
  `ev_1a52b0e84fc90c7be60c236003318d703fed117c9445de70973277a68c7d98a7`
  and dossier `ev_727b8acf44439ac432598a9114390db0d6f6a24e57fbea07871cb1ff25923bac`
  corroborate the construction. A reciprocal scale factor is applied before
  lookup; its concrete getter/coordinate-space identity remains unresolved.
- `0x1012e06a0` builds **rectsForSelector(...)**, first passing the selector
  through the JSON-serialization helper `0x1012e09d4`. The assembly supplies
  option 4 to `dataWithJSONObject:options:error:`; the helper produces UTF-8
  text. Dossiers `ev_b1457ca393cac103af2902c334edfe7eeb8f542c77826899513b33d290814cc2`
  and `ev_3fb91c64f58fbac10de049359f6f91a2ead9de219dc03622a9e0d8ca61fdecca`
  preserve the code and error path.
- Both requests reach the async bridge `0x1012dfb14`. Its concrete evaluator is
  reached indirectly through a relative function descriptor, so the callee is
  not named by this pass. The return continuation `0x1012dfc04` accepts a String
  result, converts it to UTF-8 Data and invokes generic JSONDecoder decoding;
  non-String/missing results have an allocated-error path. Evidence
  `ev_06e04f392adadbacdabdaa210d55d3fcd1771e25efb1801e317cba509d58df66`.
- The native candidate result loop `0x1012e04e0` drops records whose integer
  member exceeds **500**, then returns the retained array
  (`ev_8809f34e5c44a79fa678d0f294f8dc51b611b0b2038bf34d5445c8efd48a22fb`).
  The shipped JavaScript's candidate shape is `{selector, matches}` and its
  own earlier filter is `matches <= 100`; these distinct filters should not be
  merged into one claimed application limit.
- `0x1012e0864` converts returned rectangle records using a helper that reads
  all four CGRect components and multiplies them by a scale factor
  (`ev_e056f9b180bde6dfb9fd736950f4ee3f90658127ba991152b8dc1ca36afcc177`,
  helper `ev_55517479bbc5f5742e26b07aa4df2b7fab2125d45b7cca2ab737dc016cf4b72f`).
  Final overlay rendering and concrete coordinate spaces remain unverified.

The public type-reference and descriptor reads identify the `uiDelegate` field's
WebContentUIDelegate protocol, with 76 requirements. Exact protocol/slot xrefs
and a bounded selector-preparation pass over the 21,959 indexed conformance
entries did not resolve a concrete receiver. That preparation tests only the
identified direct reference or slot and does not prove global conformance
absence. Delegate assignment, refined/inherited conformances and other images
remain potential continuation paths.

## Interpretation limits

Swift async continuations and indirect evaluator/receiver calls remain partial.
Pseudocode signatures lose some Swift register/tuple information; assembly is
retained for corroboration. The independent owned throwing-decoder reproduction
in `../swift-error-abi/` establishes item 47 and prevents treating simplified
pseudocode as complete success/failure semantics. No native process or source
script was executed to infer visible behavior.
