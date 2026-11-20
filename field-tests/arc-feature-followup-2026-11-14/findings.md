# Arc selector event and content-construction findings

**2026-11-14; Arc 1.172.1 / build 90370.** The combined prepared batch completed
**18/18 public calls**, exported **15 Evidence records**, explicitly closed in
**837 ms**, and retained verified empty descendants. The fixed ARM64 main
remains SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Its profile digest is
`409d0a885cefe3a5ceb4106cb617b7a9a86aff9fac34d29f1bc43d137a028298`:
one-second initial analysis, 1,949 caller function seeds, stable partial Program.
Arc, helpers and shipped scripts were not executed.

The [audit](native-evidence-audit.json) authenticates all 15 standalone records
and their exported bundle. [findings.json](findings.json) retains exact Evidence
IDs, file hashes, derivations and remaining gaps. These additive findings do not
replace earlier captures or establish complete drawing, persistence or Arc
behavior.

## A new concrete caller precedes selector task scheduling

Incoming references to **`0x1012e4d6c`**, the conditional selector task starter,
retain nine references: four internal branches and five external references.
Three external code calls are identified:

| Source procedure | Call site | Interpretation |
| --- | --- | --- |
| `0x1012e5088` | `0x1012e5128` | Previously recovered successful value-publication path. |
| `0x1012e5148` | `0x1012e51dc` | Previously recovered alternate/error-publication path. |
| **`0x1012f0028`** | **`0x1012f014c`** | Newly identified non-publication caller; its input/event and point/status handling are the next concrete question. |

This narrows the event investigation to an actual code edge independently of
the unrecovered reducer switch. It does not yet identify a mouse/tracking event
or its coordinate space. [Starter references][starter-refs].

Getter **`0x1012e4cec`** has two retained incoming **DATA** references and no
recovered code consumer. The references are at `0x104628b90` in `__DATA` and
`0x104e88e56` in `__LINKEDIT`. Both queried keypath reference lists are empty.
These partial-Program results do not negate the previously observed getter and
publication use of the same keypaths, and do not prove no renderer exists.
[Getter references][getter-refs], [wrapped keypath][wrapped], [storage keypath][storage].

The header mapping supplies an important distinction: DATA references
**`0x104e88e56/57`** map to file offsets **`0x4bcce56/57`**, inside
**`LC_FUNCTION_STARTS [0x4baa480, 0x4c01648)`**. They describe linker-index
locations, not state objects, subscribers or UI consumers. The remaining
`__DATA` references preserve static metadata associations; they do not identify
a live receiver.

## Task creation is recovered; the initiating event remains open

**`0x1012f311c`** is a **668-byte** task-construction helper. It accepts optional
priority, captured operation/context and optional name inputs. Priority handling
uses flags `0x1c00`, optionally combined with a low-byte priority. If a captured
executor is available it constructs the associated task option. The helper
then selects unnamed or named task creation, retains the captured operation in
a wrapper and calls `_swift_task_create`. The selected starter passes zero in
both name words, so its observed route takes the **unnamed** branch using
wrapper descriptor **`0x10378c250`**. This describes scheduling machinery, not
the physical UI event. [Helper instructions][task-instructions],
[helper pseudocode][task-pseudo].

The loaded bytes at captured descriptor **`0x10378b2c0`**, interpreted as the
selected Swift async signed-relative-function/context-size pair, resolve to
**`0x1012e5444`** with context size **32**. The target also matches an exact
public `LC_FUNCTION_STARTS` entry. This is an explicit analyst ABI derivation;
the target body and the wrapper's invocation of it were not analyzed in this
batch. [Loaded descriptor bytes][descriptor].

## The editor's content value is BoostsEditorView

Accessor **`0x1012cd820`** returns cached singleton metadata through
**`0x104627f48`**, or asks `_swift_getSingletonMetadata` for descriptor
**`0x103d7b5f0`**. [Accessor instructions][content-instructions],
[pseudocode][content-pseudo].

A separately marked [original-file byte receipt](content-type-mapped-bytes.json)
checks the persistent target's complete SHA-256 and retained header bytes,
maps this descriptor through the file-backed segment, and resolves its local
signed-relative name field. It is a **struct** named **`BoostsEditorView`**;
the name is at **`0x103789d60`**, field descriptor at **`0x103eb5758`**.
This is analyst source preparation, not new provider Evidence or runtime
metadata instantiation. It gives a specific type for the next public conformance
query; a `View.body` witness and its visible output remain unrecovered.

The **96-byte** adapter **`0x100aa47d0`** forwards the input to
**`0x100aa4b54`**, preserves that callee's result in X20, invokes value-witness
`+8` cleanup on the original input using receiver-dependent metadata, then
returns the saved result in X0. The instructions establish this result flow more
clearly than the incomplete decompiled signature. The concrete host class and
actual view attachment still require the constructor body.
[Adapter instructions][host-instructions], [pseudocode][host-pseudo].

## Browser access is narrowed to a cached accessor

**`0x1004c6010`** obtains the **`ADK.ADKApplication` class** through
`_objc_opt_self`; the class operand is **`0x10455e7a8`**.
**`0x1004ad574`** checks once-token **`0x1045a98a0`**, calls initializer
**`0x1004ad550`** if needed, and returns a retained object cached at
**`0x1045a98a8`**. [Class accessor][application], [cached accessor][cached].

The earlier browser getter calls this accessor before dynamic slots `+0x390`
and `+0x3b0`. The once initializer remains untraced, so the cached object's
concrete instance type and those methods' implementation identities remain
unproved. This batch does not recover the internal URL handler or a storage
write. It identifies precise small callees for that later route, rather than
assigning storage behavior from a class or helper name.

## Smallest next batch

The frozen [four-call follow-up](next-batch.steps.json) requests instructions,
pseudocode and incoming references for **`0x1012f0028`**, then an exact
`swift-conformances` query for **`BoostsEditorView`**. This pursues the actual
event-producing caller and the content type's body implementation together.
The code entry is already in the selected seed range and independently matches
the authenticated function-start index; next indexed start is
`0x1012f0170`. That 328-byte interval is not a complete function-body claim.
All four input objects validate against this batch's actual advertised catalog.

No new provider requests were made while preparing this interpretation. The
check can be repeated using the existing built domain validators:

```sh
node field-tests/arc-feature-followup-2026-11-14/interpret-native.mjs
```

It reads retained records and the fixed input, without a Java/source commitment
check or provider launch. Final coordinate conversion and drawing, durable
Boost write/readback, concrete store binding and broader browser behavior
remain open. No additional REA+ defect is established by these results.

[starter-refs]: native-evidence/hover-task-starter-callers.evidence.json
[getter-refs]: native-evidence/hover-value-getter-consumers.evidence.json
[wrapped]: native-evidence/hover-wrapped-keypath-users.evidence.json
[storage]: native-evidence/hover-storage-keypath-users.evidence.json
[task-instructions]: native-evidence/hover-task-helper-instructions.evidence.json
[task-pseudo]: native-evidence/hover-task-helper-pseudocode.evidence.json
[descriptor]: native-evidence/hover-task-descriptor-and-keypath-bytes.evidence.json
[content-instructions]: native-evidence/helper-0x1012cd820-instructions.evidence.json
[content-pseudo]: native-evidence/helper-0x1012cd820-pseudocode.evidence.json
[host-instructions]: native-evidence/helper-0x100aa47d0-instructions.evidence.json
[host-pseudo]: native-evidence/helper-0x100aa47d0-pseudocode.evidence.json
[application]: native-evidence/helper-0x1004c6010-pseudocode.evidence.json
[cached]: native-evidence/helper-0x1004ad574-pseudocode.evidence.json
