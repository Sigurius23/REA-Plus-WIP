# Broader Arc feature batch proposal

This is a **prepared batch, not executed feature analysis**. It concerns the supplied **Arc 1.172.1 / 90370 ARM64 main**, SHA-256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`. The app-wide dossier still leaves these broader feature implementations open. No 1.171.0 native addresses or names are transferred, and no new provider, build, target execution or capability was started.

`preparation.json` authenticates the fixed-input Objective-C metadata and public LC_FUNCTION_STARTS Evidence using immutable validators, then selects four actual Objective-C action implementations. It separately records a checked-original-source class descriptor proposal for the restoration class. Names/fields alone remain entry-point evidence, not feature recovery.

## Admission and execution

- `broader-action-seeds-2038.tsv` is an additive overlay of the unchanged 2,034-entry selector seed file and the four exact LC-indexed action entries below. Every new entry was absent from that seed file. Current Ghidra function admission was not queried; the loader may already have defined some Objective-C methods. Applying the overlay on the next chosen v9 import avoids assuming their admission. It does not establish their complete function bodies or downstream helpers.
- `batch-draft.steps.json` contains **11** read-only requests: one narrow string search, one exact-address class-vtable proposal, one exact local-name conformance discovery and four instruction/pseudocode pairs.
- `restore-class-pointer.steps.json` is one additional **8-byte public pointer read**, prepared for root to inspect before choosing the proposed class query. Expected loaded pointer is `0x103d3916c`; this is a prediction, not an already observed public result.
- All arguments pass the retained advertised schemas. Root must revalidate against the actual v9 catalog and owns provider opening, sequencing, export and cleanup. If reusing a Program without confirmed method admission, run the discovery prefix and check admission before the eight code requests. Missing admission/empty string results in a partial Program do not establish absent code or features.

The descriptor proposal is explicit: shipped class metadata **`0x1045a1d80`**, description field **`+64` → `0x1045a1dc0`**, encoded chained-offset word **`0x50000003d3916c`**, nominal descriptor **`0x103d3916c`**, local name **RestoreSidebarDataFlow**, and type-index entry **`0x103f77230` / ordinal381** agree in the separately hash-checked original file. These are analyst Swift/Apple ABI derivations. The public pointer read and indexed metadata query supply independent corroboration; the draft does not silently promote them to observed native metadata.

## Discriminating questions

| Request / fixed-build anchor | What the result should distinguish | Required next evidence |
| --- | --- | --- |
| `search_strings` regex over **SidebarViewController, BrowserWindow, SpacesMainMenuProvider, sidebarStorableDataStore, RestoreSidebarDataFlow, restorableFiles** | Find exact defined string addresses for related source paths, diagnostics and storage/type names. Terms already occur in retained class/ivar metadata; no storage filename or unseen reducer type is guessed. | Follow actual returned string references to code and compare with method/state routes. A name match alone does not prove a feature or filesystem operation. |
| Exact class-vtable proposal **`0x103d3916c`** | Recover the restoration class's reflected fields, available method/async slot targets and metadata limitations. This class has concrete shipped `_sidebarStorableDataStore`, `_windowsStore` and lazy-restorable-files dependencies. | Follow named/identified native targets to serializer/path, read/write and failure effects; bind those dependencies to a constructed instance. Unsupported slots remain unknown. |
| Exact type-name conformance discovery **RestoreSidebarDataFlow** | Determine whether a local/imported protocol supplies a run/restore/observable entry and any static named witness. No protocol name is guessed. | Follow actual requirement identities/implementations. Zero admitted conformances with unresolved discovery records does not prove absence; no runtime witness population is inferred. |
| **BrowserWindow.switchToTab:** → **`0x10014fc14`** | How the sender becomes a tab/window-content identifier or index, which guards reject it, and whether the route dispatches an action or directly changes selection. | Follow the captured store/reducer or browser callee into selected-tab state and visible content; test close/history/persistence separately. |
| **BrowserWindow.nextSpace:** → **`0x100150114`** | Whether app Space cycling sends a store action or invokes native window/workspace selection; identify the mode/tag and actual callee. | Trace the selected Space identity, tab collection/filtering and content transition; previous-space and other profiles remain separate paths. |
| **BrowserNavigationButtons.handleSidebarToggle:** → **`0x10043ef5c`** | Which state/availability guards and store action or direct mutation change sidebar visibility. | Trace reducer effect/visibility ownership and resulting view construction, including applicable window mode. |
| **BrowserNavigationButtons.handleReload:** → **`0x10043efc0`** | Which selected browser/tab/adaptor receives reload, mode flags and missing-content handling. | Follow the actual navigation primitive and its completion/error path; back, forward, forced reload and URL submission are not inferred. |

The indexed intervals are **12, 8, 100 and 8 bytes**, respectively, up to the next LC_FUNCTION_STARTS entry. These are not complete-body proofs. Short wrappers can tail into larger Swift workers; the paired pseudocode should identify those, while direct worker instructions remain a follow-up if not already retained.

## Source anchors and existing state boundaries

The canonical fixed-input Objective-C source is `field-tests/arc-dispatch-2026-11-06/objc-metadata.evidence.json`, Evidence **`ev_6d16449d9c6d64f6260141eb5e973a155bd37757c6a552d1490cb61de90917e6`**. It reports these shipped fields:

| Class metadata | Fields / shipped offsets |
| --- | --- |
| BrowserWindow **`0x104557310`** | `store +8`, `viewStore +16` |
| SidebarViewController **`0x10455b0a8`** | `store +24`, `viewStore +32` |
| BrowserNavigationButtons **`0x10455dc70`** | `store +8`, `viewStore +16` |
| RestoreSidebarDataFlow **`0x1045a1d80`** | `_sidebarStorableDataStore +16` /80 bytes; `_windowsStore +96` /80 bytes; lazy `_restorableFiles +176` /8 bytes |

Offsets and names are shipped metadata observations; empty type encodings do not identify the concrete generic store/reducer or a live object. An 80-byte dependency field is not described as a simple object pointer. `preparation.json` records each source location, field size, decode status, artifact hash and file hash. Its public function-index anchor verifies all four function starts and their next indexed entries. The original fixed-build native input itself was hashed before the descriptor derivation.

This batch would begin behavior recovery for sidebar/tabs/Spaces/navigation and narrow persistence entry points. It will not by itself prove tab/Space storage, sidebar restoration, session semantics, browsing history, sync, complete navigation, durable Boost writes/readback or any live app behavior. No new capability is proposed: string search, exact indexed metadata and bounded native procedure queries are existing public routes. A capability issue should be raised only if an observed result actually blocks the required next evidence.
