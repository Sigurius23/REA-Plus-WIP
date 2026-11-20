# Selector source semantics and native correspondence

These are **direct source interpretations**, separately grounded in retained REA+ inventory and native Evidence. They are not automatic semantic conclusions from the inventory graph and do not represent DOM execution.

The source is the exact **11,068-byte** `ARC_BoostsEditor.bundle/Contents/Resources/SelectorPicker.js`, SHA-256 **`0e779dad9316f8b14cf4e1b20fa710240cd90bc9a9a1dd820df38ebd525d977d`**. Fixed-build producer Evidence **`ev_677a3886e3f284769a709bb6980c061b0c9435c07bd6ea3389d0acbdf1d68862`** in `field-tests/arc-retest-2026-11-06/javascript/producer-bundle.json` binds that asset and module to the recovered 1.172.1 resources. The fresh original extraction is the dossier's E35. The original temporary path is gone; the current installed file supplies **identical bytes**, verified by full digest, and is retained as `SelectorPicker.fixed-source.js.txt`. This uses byte identity, without transferring the installed app's version or native addresses. `selector-source-index.json` records canonical bundle validation, asset/module IDs and exact function ranges. The source is ASCII: byte offsets equal its single line's zero-based columns. Ranges below are `[start,end)`.

## Public functions and returned data

| Function / source range | Input and result | Missing/error behavior | Selected native counterpart |
| --- | --- | --- | --- |
| `getHoveredElement`, `[9562,9744)` | Point `{x,y}` → `document.elementFromPoint`; returns `{rect:{x,y,width,height},hash}` from that element's bounding rectangle and descriptive identity helper. | No hit returns **undefined**, not an empty rectangle or an array. There is no surrounding catch. | Flipped-view point State → rounded-bucket filter → reciprocal scalar point query → typed native completion → forward-scaled published rectangle. |
| `getSelectorCandidates`, `[9745,10871)` | Same hit test; derives candidate CSS selectors; returns **`[{selector,matches},…]`**. `matches` is the selector's whole-document match count. Internal scores and DOM references are omitted. | Missing hit or no retained candidate returns **[]**. Some internal query errors become zero matches; not every query is caught. | Selected tap locks its current rectangle and schedules **`getSelectorCandidates({x:…,y:…}, {})`**. Candidate response/selection consumer is the next native follow-up. |
| `rectsForSelector`, `[10872,11063)` | CSS selector String → `document.querySelectorAll`; returns one `{x:left,y:top,width,height}` per match in query order. | Valid no-match returns **[]**. Invalid CSS selector throws; this wrapper does not catch it. No source match-count or visibility cap is applied here. | Native JSON-serializes the selector argument, constructs **`rectsForSelector(<serialized String>)`**, decodes/scales rectangles, then accepts/retries and writes Spotlight's candidate State. |

The native candidate call's second `{}` argument is ignored by this particular **one-argument wrapper**. Its internal generator accepts an options object, but the wrapper invokes it with only the hit element, so the default output target15 is used. These source functions return ordinary objects/arrays/undefined; they do not themselves JSON-stringify the results. The selected native evaluator separately expects a String and decodes JSON. This correspondence does not establish the live execution page/world or bridge serialization for every failure case.

The hover `hash` helper `r`, `[166,429)`, concatenates **tagName, optional `#id`, classList entries in their current order and `@<index within parentElement.children>`**. It is a descriptive String, without ancestor identity or a cryptographic digest. It is not guaranteed globally unique or stable across DOM/class changes. The rectangle State/render routes traced here establish rectangle consumption; they do not establish a native consumer of this hash.

## Candidate terms, traversal and filtering

Selector-term helper `T`, `[4392,5950)`, creates terms for the clicked element and later visited relatives:

- ID and individual classes, with semantic scores based on known-word and gibberish heuristics.
- Attribute-name existence and exact value selectors, plus selected prefix/suffix variants when values contain whitespace, hyphen or slash separators. Attribute **values** pass through `CSS.escape` when `window.CSS` exists. ID/class terms are concatenated directly.
- `:first-child` and/or `:last-child`; an interior child instead gets `:nth-child(index+1)`.
- Lowercase tag name, distinguished as a predefined semantic tag, hyphenated custom element or ordinary tag.

Each initial candidate uses one of these terms as its original identifier. Refinement adds ancestor terms or descendant `:has` constraints; the source does not enumerate compound combinations of all classes on the clicked element.

The guarded query helper `t`, `[74,166)`, catches querySelectorAll exceptions and returns an empty array. Consequently an invalid generated term can receive zero matches and be discarded. The source does not generally validate/escape arbitrary ID/class terms before querying. Its match-count cache and identifier cache are fresh for each candidate request. Lazy `__arc_id` properties and `window.__arc_id_counter` provide page-local bookkeeping across calls; they are distinct from the hover `hash`. The generator also calls `console.log` on the selected element.

Ancestor/descendant expansion helpers occupy `[6375,8237)`. Ancestor identifiers prepend terms with descendant-space combinators; at immediate depth they also try a `>` variant. Descendant expansion uses **`:has(...)`**, considering elements at exact depths under the current lowest considered descendant; immediate-depth variants also try `>`. Only descendant identifier terms scoring at least0.5 are considered. Ancestor traversal stops when a parent is missing; the inert `document.body` read is not a body-stop condition. These are current-document/parentElement/children operations, without explicit cross-frame or shadow-root traversal.

Two expansion configurations independently start from the original clicked-element seed list, then their outputs are unioned by selector text, retaining the first encountered candidate:

| Pass | Steps | Candidates-per-step target | Ancestor depths per expansion | Descendant depths per expansion |
| --- | ---: | ---: | ---: | ---: |
| Broad ancestor pass | 1 | 90 | 1–8 | None |
| Combined refinement pass | 3 | 12 | 1–3 | 1–2 |

Each step expands previously unexpanded retained selectors, combines them with the accumulated list and prunes through helper `n`. The depth and iteration settings constrain the search pattern; they do not cap DOM breadth, seed terms, query cost or elapsed time. The search does not enumerate every possible CSS selector. After deduplication, the wrapper removes a candidate when **the clicked element's own subtree contains a matching descendant**: `t(candidate.selector, clickedElement).length` must be0. This is not the global match count and does not require global uniqueness. It separately retains only candidates whose cached global match count is **at most100**. Earlier pruning removes zero-match candidates.

## Semantic ranking and sampling

The source contains explicit weights, not a learned ranking model:

| Term/value feature | Score |
| --- | ---: |
| ID/class containing a listed familiar substring | +1 |
| Other ID/class | −0.5; gibberish −1 |
| Semantic tag / custom-element tag / ordinary tag | +0.5 / +1 / −0.1 |
| Positional pseudo-class | −0.1 |
| `aria-label` / `tabindex` / `role` / `data-testid` / `href` value | +0.8 / +0.5 / +0.5 / +1 / +0.6 |
| Other attribute value / gibberish value / attribute-name-only | +0.3 / −1 / −0.1 |
| Added immediate `>` variant | −0.1 |

Known-word matching is substring-based. The gibberish helper `l`, `[1961,2463)`, tests digit count, mixed-case trailing uppercase, long chunks between vowel/separator boundaries and a fixed list of unlikely letter pairs. Attribute values classified as gibberish are penalized before special attribute-name weights. Combined-selector scores add the component scores and immediate-combinator penalty.

Sampling helper `n`, `[429,1182)`, first removes zero-match candidates and sorts by descending supplied score. If the remaining length is within the requested target, it returns that list. Otherwise it groups candidates by **log10(match count)**, using `min(target,20)` bins and retaining the first `ceil(target/binCount)` entries per bucket. There is **no final slice to the requested target**. Boundary/degenerate buckets can produce a different count, so `outputCandidates:15` is a sampling target rather than an enforced exact maximum. This is a static reading of the formula; no candidate/DOM test was executed.

Final ranking additionally gives **+20** to selectors whose matches all share the same six-property computed-style signature: **fontFamily, fontSize, color, backgroundColor, textDecoration and fontWeight**. At most one match is automatically homogeneous. Helpers `O/w` are `[8237,8608)`; this is not comparison of every CSS property or rectangle geometry. After sampling, the returned candidates are sorted by **ascending match count**, rather than by final score. More semantic/style-consistent selectors influence retention; fewer global matches determine displayed list order on this source path.

## How source results reach the native display decisions

The native literal prefix for `getSelectorCandidates` is public Evidence **`ev_103f15ad54bd63e88796e8bac5d5f25299a57071253f1e26be2a90c83199b449`**. It matches the one global source function by name and point shape; no options behavior is inferred from the extra argument. Native return/selection handling remains the prepared six-call v9 follow-up. Expected wire fields are only `selector` String and `matches` count.

The rectangle literal is public Evidence **`ev_c2fd730ca2cd54416ab5d887a17707943baca75b583badf6588c969dfd408587`**; native selector serialization is **`ev_a27c3032d308718c79c8cf5664d4e307914d7e620f8fb2747b829771a5a975a7`**, with public Objective-C selector bindings in the final audit. Serialization prepares a JavaScript String argument; it does not turn invalid CSS into a valid selector.

Native rectangle success **`0x1012e7150`**, Evidence **`ev_729e8ad0a36acc690270552185fb756cd8b98248a138dc67924e3c8e487b9302`**, applies the adaptor scalar to all four components before the outer State consumer. The latter accepts a nonempty array except a **single CGRect.zero**. That zero-rectangle special case is a **native readiness heuristic**; the source does not manufacture an explicit zero-rectangle error sentinel. A DOM-reported zero rectangle can reach it. The count>1 branch does not apply this single-rectangle equality test to every member.

Empty/single-zero and the selected execution-error route enter the previously established five-attempt path with requested50ms sleeps, then clear the State on exhaustion. The valid source no-match result and a source exception are distinct events which converge on this native display policy. This does not establish every executor/decoder error classification. Source `rectsForSelector` has no visibility cap or100-match restriction, so its result array can differ substantially from the candidate-generator counts.

The resulting State feeds the separately recovered SwiftUI **white continuous RoundedRectangle → overlay blend → midpoint PositionLayout → enlarged centered FrameLayout**, beside the radial-gradient component. These source/native links explain intended input, decision and output paths. They do not demonstrate actual page injection, a particular frame/world, viewport origin/scroll alignment, live scale values, successful DOM queries or visible rendering. No shipped JavaScript was executed, and no provider, network or build was started for this interpretation.
