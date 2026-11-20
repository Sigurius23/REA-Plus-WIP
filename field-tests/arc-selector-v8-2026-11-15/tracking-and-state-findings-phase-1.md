# Native coordinate bindings and candidate State consumer

`tracking-and-state-phase-1-audit.json` authenticates **31 cumulative canonical records**, including nineteen new observations. It separately verifies each Objective-C stub's instruction bytes, loaded selector pointer and exact selector string. The native analysis still uses immutable v8 and the same 2,034 seeds. Session finalization is not claimed by this export receipt.

The public bindings close the earlier coordinate-name caveat:

| Stub | Loaded selector slot | Exact selector |
| --- | --- | --- |
| `0x103656a60` | `0x104545918` | `locationInWindow` |
| `0x103647be0` | `0x104541d78` | `convertPoint:fromView:` |
| `0x103644b40` | `0x104541150` | `bounds` |
| `0x103649180` | `0x1045422e0` | `dataWithJSONObject:options:error:` |

The coordinator's moved-event worker therefore reads the event's **window location**, converts it through the live view with **`fromView:nil`**, and forwards the resulting **view-local point**. Its other two payload Double words are **local x / bounds.width** and **local y / bounds.height**. The selected picker consumes the first two words; it does not use the normalized pair. This identifies the conversion call and its inputs. It does not by itself establish a top-left origin, flip behavior, DOM coordinate equivalence, screen coordinates or physical pixels. The twelve bounded `objc-binding-{0,1,2,3}-{stub,selector-slot,selector-name}.evidence.json` records and their Evidence IDs are indexed in the phase-1 audit.

Witness factory `0x100b0ca50` reads a cache and, when empty, calls `swift_getWitnessTable` with **conformance `0x103715fe8`** and concrete metadata **`0x1042ad030`**, then caches the result. This publicly corroborates the preceding checked-source address derivation. The exact indexed conformance query names **Representable: SwiftUI.NSViewRepresentable**. Static imported requirement pairs identify **makeNSView → `0x100b0c33c`**, **updateNSView → `0x100b0c344`**, **dismantleNSView → `0x100b0c34c`** and **makeCoordinator → `0x100b0c354`**. The runtime witness table remains uninstantiated in this metadata observation; the factory's code describes obtaining one during execution and does not show an actual instance. Sources: `native-install-0x100b0ca50-pseudocode.evidence.json` (`ev_1d5dcb22cb1375a370b122592ec88378118e3e4eaca6613a9d4bddb38e7f0338`) and `exact-native-representable-conformance.evidence.json` (`ev_8ed2dd32a86d8ab9d9aba96829604f422ed8b15f7156fa3bb464cb70473532d8`).

Success consumer **`0x1012f4024`** inspects the returned rectangle array. It accepts a nonempty array except for the special case of **exactly one rectangle equal to CGRect.zero**. On acceptance it copies each four-word rectangle into an array and calls **the same SwiftUI.State setter** whose metadata/cache and captured state are consumed by the Spotlight `ForEach` getter. Thus this selected route closes **selector String → rectangle-query dispatch → result consumer → candidate State → per-rectangle drawing construction**. Inner query decoding/transformation is still a separate boundary. Source: `native-install-0x1012f4024-{instructions,pseudocode}.evidence.json`, pseudocode `ev_1823f1e02ba3d86e0289fc0620b24f2426c3fed69c400448ae34c0961983adea`.

The empty-array/single-zero path calls `Task.sleep(nanoseconds: 50_000_000)` and installs continuation **`0x1012f4344`**. The error consumer **`0x1012f41b4`** starts from the shared empty array and uses the same decision/sleep path. This does not yet establish unlimited polling, cancellation handling or a final State clear: the sleep continuation is the next target. Source: `native-install-0x1012f41b4-pseudocode.evidence.json` (`ev_c060c76939649e9b6677007806c4aeb7e87ccba32af79a63b3fc8c6fad28b82d`).

The next ten prepared requests in `view-and-retry.steps.json` follow the four native representable requirement implementations and sleep continuation. `rectangle-query-return.optional.steps.json` additionally follows the inner rectangle-query return, to establish any result scaling before State assignment. All code entries are in the current seed set; no additional import is needed. Static setup, coordinate flip/DOM alignment and retry/cancellation remain open, as do durable Boost persistence and broader Arc subsystems.
