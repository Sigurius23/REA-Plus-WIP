# Arc selector drawing and URL handoff follow-up

Prepared **2026-11-14** from retained **Arc 1.172.1 / 90370** observations.
Target ARM64 main SHA-256:
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
This preparation starts no provider and executes no Arc binary, helper,
JavaScript or network request. The proposed calls have not been run here.

The shortest independent route to a feature answer is to follow the **published
selector result into its native consumers**, and the **point updates into the
task starter**. Both can progress while item 55's reducer ownership proof is
unfinished. The optional second batch follows content construction and the
already recovered editor URL handoff; it does not claim those helpers implement
storage. Durable Boost write/readback remains unproved.

## First batch: result consumer and initiating event

Three selected routines use the **same two keypath patterns**:
`0x10378b2c8` and `0x10378b2f0`. Getter **`0x1012e4cec`** reads a four-word
value plus flag through Combine's enclosing-instance getter; publications
**`0x1012e5088`** and **`0x1012e5148`** write through that same pair. This is a
concrete property route to follow, rather than searching unrelated view names.
The selected success continuation scales four returned scalar components and
sets flag 0, while the failure publication uses zero words and flag 1. The
concrete property type, receiver and drawing remain separate proof obligations.
[Getter][getter], [success publication][publish], [failure publication][publish-other],
[query success][query-success].

Task starter **`0x1012e4d6c`** checks status, a captured object and a value flag.
Its admitted path captures object/point/self fields and passes descriptor
**`0x10378b2c0`** to **`0x1012f311c`**. Following the starter's actual callers
and that descriptor can identify the initiating event without depending on a
reducer switch. The observed fields alone do not establish that the point is in
screen, window or view coordinates. [Task starter][task].

The frozen [seven-call batch](first-batch.steps.json) asks:

| Request | Exact question / next decision |
| --- | --- |
| Incoming `procedure_references` for `0x1012e4cec` | Which positive code or metadata references consume the published value? Resolve each actionable code reference's containing procedure, then inspect its value use. |
| `xrefs` for `0x10378b2c8` and `0x10378b2f0` | Which accessor, subscriber or view-body references share this exact property route? Distinguish code references from metadata/data references. |
| `read_bytes(0x10378b2b0, 128)` | Retain the selected async descriptor and keypath bytes together, resolving their actual accessor/type references before assigning property names. Adjacent bytes are not automatically one structure. |
| Incoming `procedure_references` for `0x1012e4d6c` | Which actual caller writes/schedules a new point? Trace that caller's event input, status changes and cancellation/repeat policy. |
| Instructions and pseudocode for `0x1012f311c` | How is the descriptor/context invoked, and which selected continuation receives the object/point/self captures? Generic task creation is not itself a UI event. |

For a positive property consumer, the next feature evidence should show the
four components entering a rectangle/frame/path operation, its coordinate
conversion, then a concrete SwiftUI/AppKit view or layer operation. Trace the
flag's absent/error path too. For an event producer, show the source point,
receiver and any origin/scale conversion. A method name or `View` conformance
alone does not close drawing. An empty reference result in a one-second partial
Program does not prove no consumer exists; preserve it and narrow the known
keypath/descriptor route instead.

## Optional small helpers: content construction and internal URL route

These calls are already present in retained machine instructions. Their exact
entries also occur in the authenticated fixed-version `LC_FUNCTION_STARTS`
index. The [optional eight-call batch](optional-helper-batch.steps.json)
requests instructions and pseudocode for four small entry intervals:

| Entry | Existing call site | Concrete next question |
| --- | --- | --- |
| `0x1012cd820` | Editor initializer call `0x1012d2e88` | Which content value metadata is used to construct the view state? Resolve its actual nominal type and body witness, then follow that body toward the selector-value consumer. |
| `0x100aa47d0` | Editor initializer call `0x1012d3108` after allocation | Which hosting/content constructor receives that value, and where is the resulting native view attached? Do not name the host class until its metadata/callee is identified. |
| `0x1004c6010` | Browser getter call `0x1012d3dd0` | Which object/type source feeds manager acquisition on this selected route? |
| `0x1004ad574` | Browser getter calls `0x1012d3ddc` and `0x1012d3e30` | What concrete manager receiver precedes slots `+0x390` and `+0x3b0`, and can its static class metadata bind those implementations? |

The last two feed **`0x1012d3598`**'s ready-content path, which compares the
desired internal Boost URL with a current URL and conditionally invokes a
captured interface's **`+0x1e8`** slot. Resolve the concrete interface and named
implementation before calling this a navigation or load operation. That would
provide an independent route into `arc://boost/v2/js/` or `/css/` handling.
It is not yet a storage write. A persistence result still requires the actual
handler/content source, durable write, identity association and reload/readback,
including errors. [Editor initializer][editor-init], [browser getter][browser],
[ready-content path][ready].

## Seed and request preparation

[candidate-targets.json](candidate-targets.json) records all eight exact entries,
their next indexed starts and source Evidence IDs. Indexed intervals are **not
proof of complete function body ownership**. All primary batch code entries and
`0x1012cd820` fall within the existing caller-selected 1,940-entry window.
The three optional helpers outside it are in
[additional-seeds.tsv](additional-seeds.tsv). Merge those into the chosen
verified seed set and record the actual merged count/hash; the entries remain
caller assertions rather than automatic Ghidra discoveries.

The batch files contain `steps` only. Bind them to the current verified main
slice, retain the bounded profile and source preparation, validate against the
session's actual advertised schemas, then export canonical Evidence and close
with verifier lineage. They do not assume a historical temporary input still
exists. The retained Nov13 catalog was used for preliminary input validation.

Read-only preparation can be repeated with:

```sh
node field-tests/arc-feature-followup-2026-11-14/prepare-plan.mjs
```

The [validation receipt](validation.json) records **12 canonical Evidence
anchors**, **eight exact indexed function starts**, **15 schema-checked proposed
requests** and **zero executed provider calls**. The
[reference index](reference-index.json) retains complete Evidence IDs, artifact
and profile identities, paths and file hashes. No implementation, baseline,
OPEN_TASKS or Git state was changed by this preparation.

[getter]: ../arc-dispatch-load-2026-11-09/arc-final-2026-11-13/hover-method-0.evidence.json
[publish]: ../arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5088.evidence.json
[publish-other]: ../arc-selector-rendering-2026-11-09/bootstrap/bootstrap-prefix-0x1012e5148.evidence.json
[query-success]: ../arc-selector-rendering-2026-11-09/query-return-2026-11-13/selector-success.evidence.json
[task]: ../arc-dispatch-load-2026-11-09/arc-final-2026-11-13/hover-method-1.evidence.json
[editor-init]: ../arc-command-effects-2026-11-08/initialization/helper-0x1012d2e5c.evidence.json
[browser]: ../arc-command-effects-2026-11-08/methods/method-0x1012d3d8c.evidence.json
[ready]: ../arc-command-effects-2026-11-08/methods/method-0x1012d3598.evidence.json
