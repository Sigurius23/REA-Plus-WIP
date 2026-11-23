# Arc dependency and default-selection policy — 2026-11-23

Item 63 advances through **static selection policy**, with a concrete alternate
bool implementation. The actual Client code/context loaded at `0x1012ab840`
remains unresolved. No production source changed after `98bd69a11`.

All analysis used the fixed arm64 artifact, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, helpers, shipped JavaScript, profiles, UI and services were not used at
runtime. The owned Ghidra processes analyzed immutable source snapshots with
one-second autoanalysis and explicit caller seeds. This is not live state.

## Effective dependency values

[The policy index](arc-dependency-policy-2026-11-23/selection-policy.json)
links each interpretation to public Evidence. Existing wrapper, merge,
projection, lookup and default-reader records were reused unchanged, with
nineteen records imported into the final session.

In wrapper getter `0x1006fa470`, captured values come from the wrapper's first
two words; a separate TaskLocal get supplies current values. The copy helper
`0x100008168` forwards its second input as destination and its first as source
to the metadata's value-witness slot +0x10. The getter uses this to copy
captured storage before calling merge helper `0x1006fa7b4` with current storage.
Its callback `0x1006fa77c` copies an entry unchanged. The existing-key path
assigns that entry through `0x1006faaf0`; new-key insertion is separate.

Under ordinary value-witness, dictionary/COW and synchronous TaskLocal
semantics, the resulting rule is **current entries replace matching captured
entries**. The installed projection values reuse the captured cache object
and the merged storage. This is an analyst derivation from native instructions,
not a new normalized REA+ memory-flow field or a proof of arbitrary witness,
COW, alias or reentrant side effects.

The downstream lookup first accepts a stored Client value when its cast
succeeds. Otherwise it resolves context and checks its default-value cache.
A valid cached value precedes factory selection. Cache mutation has its own
guards; unconditional population or immutable runtime contents are not claimed.

## Context selection

`0x1006fc4b4` stores the byte returned by `0x1006fc4d0` in a once-initialized
global. Public indexed reflection independently names `DependencyContext` with
cases `live`, `preview`, `test`; native branches bind the following choices:

| Factory input/predicate | Returned mode |
| --- | --- |
| `SWIFT_DEPENDENCIES_CONTEXT == "live"` | 0 |
| Same key equals `"preview"` | 1 |
| Same key equals `"test"` | 2 |
| Missing/unrecognized override, `XCODE_RUNNING_FOR_PREVIEWS == "1"` | 1 |
| Remaining fallback, cached test predicate nonzero | 2 |
| Remaining fallback, cached test predicate zero | 0 |

The full producer of the cached test predicate was not traced. The factory's
inputs are runtime environment values; none were read from the current host.
An explicit stored context can precede this global factory. Physical metadata
binding for enums remains outside the existing struct-only reader: it reports
partial binding while retaining the indexed declaration and case names. No
helper-wide input domain follows from this context enum.

## The surrounding scope selects a navigation dependency

The child helper constructs keypath pattern `0x1036f3c00`. Its tagged nominal
references, through slots `0x10422e110` and `0x104231530`, bind the retained
DependencyValues descriptor and NavigationIDPath descriptor `0x103d4d188`.
Under the normal matching keypath format, its local getter/setter thunks at
`0x100876f5c` / `0x100876f60` branch to `0x10085b0d4` / `0x10085b18c`.

Those accessors use key metadata `0x10428b940`, descriptor `0x103d4d1e4`
(`NavigationIDPathKey`) and TestDependencyKey table `0x1045c82f0`. Public
conformance data binds `Value = NavigationIDPath` and the inherited witness
identity. UserDefaultsClient uses separate metadata `0x1042c8ac0` and witness
`0x1045ee8b0`.

This identifies the observed scope's selected key. It supplies no general
noninterference proof: the inner generic store at `0x1006fde3c`, indirect
witness effects and every later instance/copy window remain separate questions.

## Default bool behavior has a real alternative

For the retained local Client conformances and ordinary matching runtime
registration, the cache-miss selections are:

| Context | Selected getter path | First bool closure |
| --- | --- | --- |
| live / 0 | DependencyKey getter `0x100d929a0` | Copies the global Client |
| preview / 1 | TestDependencyKey slot 2, `0x100d8c154` | Copies the same global Client |
| test / 2 | TestDependencyKey slot 3, `0x100d8c1dc` | Code `0x100003b60`, nil context |

Missing runtime conformance/cast paths and diagnostics remain visible in the
selector; the local static table does not establish runtime registration.
The test-default constructor installs `0x100003b60` in its first closure pair.
Public decoding shows `MOV W0,#0; RET`: under the retained Bool signature,
that closure returns false and does not consult the Setting table.

Consequently, a valid Client and literal input 49 alone do not link the actual
indirect call to the shared table helper. Explicit overrides and cache contents
add further choices. The actual-call table observation still returns
`indirect-unresolved`, with no invocation mapping installed.

## The global Client's preferences object

Initializer `0x100d91000` reads an optional suite string. When present it attempts
the selector `initWithSuiteName:`; absence or a nil result takes the
`standardUserDefaults` selector path. Both selector-reference pointers and their
literal bytes are retained. This is the static intended choice under ordinary
Objective-C message-stub/binding semantics, not observed Foundation behavior.

The optional suite initializer `0x1007ed3cc` shares the previously recorded gate
byte and `--user-data-dir` argument route. Its constructed string starts with
**`com.dia.instance.`**. The suffix transformation at `0x1007ed818` was not
established in this pass. The gate is not labeled a development/release flag.
No active suite name, preference domain, actual reads/writes or durability is
inferred. The earlier local JSON-store directory remains a separate route.

## Verification and limitations

[Qualification](arc-dependency-policy-2026-11-23/qualification-verification.json)
validates 337 public attempts: 335 successful replies and two missing-procedure
errors across one failed partial capture and two completed captures. The first
bounded Program lacked a follow-up function; three added seeds were checked
against original LC_FUNCTION_STARTS. The generic store's inner function remains
unlisted in the selected Program. These are explicit analysis-admission limits,
not new confirmed product defects. The existing unlisted-instruction tool
supplied bounded source observations without adding CFG edges or functions.

Two complete metadata Evidence records match CLI/MCP exactly. The final export
retains **335 records and one explicit open unknown**:
`unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04`.
All four owned verifier process lineages are empty. Frozen runtime (1,881 files)
and 25 source hashes remain unchanged; nineteen earlier snapshots authenticate.
No new source suite, full enum matrix, package gate or runtime claim is made.

The verifier checks 261 decoded instruction observations against original source
bytes, selected native branches, reused record digests and exported references.
Ghidra Program reads include loader-applied rebases/binds: original encoded
words are retained and selected rebases checked with the qualified native
pointer reader. Synthetic bound target addresses remain unverified and are not
used to establish policy ownership. The first aborted ledger was not exported;
its successful reply files remain partial and are not counted as final retained
coverage. An initial verifier accounting error was corrected and documented.

No new REA+ producer defect was established. Active Client selection, relevant
instance/copy stability, a qualified typed invocation join, deeper generic-store
and test-predicate effects, preference I/O/durability and broader Arc features
remain open. The new policy distinguishes these unresolved inputs from the
recovered ordinary default branches.
