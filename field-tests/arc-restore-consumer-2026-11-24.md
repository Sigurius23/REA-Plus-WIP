# Arc selected-file sidebar restoration — 2026-11-24

The selected `RestoreSidebarDataFlow` worker now has a concrete read/write
interpretation: it reads a selected sidebar backup, attempts to clear saved
windows, clears the restored sidebar's `sidebarSyncState`, and requests a
sidebar save. Its Boolean follows whether backup data was obtained, not whether
the subsequent saves succeeded. This is conditional static recovery, not an
observed restore, a durability guarantee or completion of the whole browser.

The generic `restoreFromBackup` leaf studied earlier remains a separate route:
its higher application consumer is still unidentified. This pass must not be
read as joining that automatic first-good-backup helper to this selected-file
sidebar worker. Item 63's actual Client selection and typed invocation mapping
also remain open.

## Identity and evidence boundary

All findings concern the fixed Arc 1.172.1/build 90370 arm64 input, 80,498,448
bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, its helpers and shipped scripts were not executed. No UI, profile, account,
app service, ambient environment or app data was accessed. Production REA+
sources and the previously qualified frozen runtime are unchanged.

The method target `0x100305ef0` is bound to the exact RestoreSidebarDataFlow
class by the retained class-vtable Evidence. This does not identify the UI event
or prove that a live object enters it. Reused complete worker instructions,
fresh branch/byte observations and native reflection/layout records are joined
by an analyst under normal Swift ABI, valid typed storage, normal import
bindings and relevant stable copy-window premises. This is not an extra
normalized REA+ invocation proof.

## Two stores and the selected record

`0x1002d80d0` binds the input record to `RestorableFile`, descriptor
`0x103d38ce0`, with fields displayName, filename, toolTip and url. The worker
addresses the fourth field through its metadata offset vector, copies its URL
and constructs a present Optional URL for the first read request.

The captured wrappers have exact source-bound nested type references:

| Capture | Inner model | Nominal descriptor |
| --- | --- | --- |
| First Dependency/StorableDataStore | StorableSidebar | `0x103db9d3c` |
| Second Dependency/StorableDataStore | StorableWindows | `0x103dc373c` |

The shared outer nominal identities are Dependency `0x103d46d5c` and
StorableDataStore `0x103d65460`. Public original type-reference bytes, symbolic
slots and metadata records bind these identities. The type-cache helper's
instructions establish the signed relative pointer plus explicit byte-length
representation. The nested application is an analyst reading of those complete
bytes; the current flat generic field decoder does not automatically lower it.

The StorableDataStore declaration retains six fields in order:
readSyncThrowing, saveSyncThrowing, deleteSync, deleteAllSync, restoreFromBackup,
allStoredFiles. Their complete throwing/generic function signatures remain
unsupported by the current narrow function-type decoder. The constructor's six
16-byte thick closure pairs and the worker's copy/load offsets supply the
selected read/save interpretation under the explicit native Swift layout/ABI
premise; a field ordinal alone is not treated as a physical offset.

## Selected request sequence and errors

| Stage | Source-bound behavior | Failure/absence behavior |
| --- | --- | --- |
| Read chosen sidebar file | First store's read pair, Optional URL present, W1=1, X2=0; call at `0x1003060e8` | Nonzero X21 is released and converted to none. No decoded value returns false and bypasses later stages |
| Read current windows | Second store's read pair, Optional URL absent, W1=1, X2=0; call at `0x1003062ac` | Error or none skips its rewrite and continues to the sidebar stage |
| Rewrite current windows | When present, replace its windows collection with the imported Swift empty-array storage, preserving the other selected model bytes; save at `0x10030644c`, W1=1 | Save error is released; X21 is cleared and sidebar processing continues |
| Reset sidebar sync state | Destroy the old optional field, then store Optional.none through the value witness for ZoneSyncData | This is the local sidebarSyncState field, not a remote sync operation |
| Save restored sidebar | First store's save pair at `0x10030659c`, W1=1 | A save error is released; the final Boolean still follows the original sidebar-read tag |

The writer's W1=1 is recorded exactly. On the previously traced ordinary
StorableDataStore implementation it enables that save's backup branch. Active
dependency injection, actual selected store implementations and whether any
backup/write succeeds remain unobserved.

The input present/absent tag is saved in W22/the local frame and reloaded near
return. `0x1003065f0/5f4` compares it with one and returns `tag != 1`. The
windows-save and sidebar-save error branches do not replace that saved tag.
Consequently a present decoded backup can lead to a true return after caught
write errors. This is a recovered target behavior, not a newly found REA+
decoder bug or evidence that a failing save was executed.

The adjacent worker `0x100305b70` reads the selected file and, on a present
value, passes it to the already traced hierarchical text formatter. That
preview/description route is distinct from the save sequence above. Its UI
presentation, exact returned text and user trigger remain unobserved.

## Windows layout and sidebar sync reset

Native metadata at `0x1043e69b0` binds StorableWindows to its exact descriptor,
with the following original uint32 field-offset vector:

| Field | Byte offset |
| --- | ---: |
| version | 0 |
| sidebarViewPreferences | 8 |
| windows | 24 |
| lastFocusedSpaceID | 32 |
| platformData | 48 |

The value witness records size 49, stride 56 and alignment 8. The worker builds
the next 49-byte value from the displayed old bytes, placing the empty-array
pointer at +24; it preserves the selected bytes at the other field ranges.
The empty-array identity is checked against the original chained import and
kept explicitly supplemental, rather than replacing a null public symbol
lookup. Neither metadata nor these copies establish an actual runtime value.

StorableSidebar's declaration has four fields: version, sidebar,
sidebarSyncState and firebaseSyncState. Its original header declares four
fields and field-offset-vector word offset 2. At `0x1003064d8`, the worker
loads vector entry metadata+0x18: ordinal 2, not a literal instance offset.
It destroys that field, obtains ZoneSyncData metadata through `0x1017aac84`
and stores the absent optional tag through its value witness. The field's
symbolic type independently binds that exact ZoneSyncData descriptor
`0x103d8c4e8`. The selected code resets sidebarSyncState; it does not explicitly
reset the separately declared firebaseSyncState field.

## Generic automatic restore search boundary

Fresh indexed references again connect `0x100dbe518` to queue callback
`0x100dc4378`, its wrapper `0x100dbb45c` and thunk `0x100dba020`. The previously
retained factory places this closure pair at result+0x40 for restoreFromBackup.
Those wrapper/leaf bodies were already known and are not counted as new
restoration recovery.

Source-byte selection and fresh public unlisted decoding additionally follow
the selected Boost store's global/default copy accessors at `0x10118c268`,
`0x10118c320`, `0x10118c360` and `0x10118c610`. They connect the factory's
96-byte global `0x104622168` to a further global `0x104706ba0` and copied
indirect results, retaining six contexts. This does not establish actual
dependency selection or identify an invocation of restoreFromBackup.
Recorder labels for these accessors are analyst labels, not recovered source
method names or proof of a test-context role.

The partial Program's three exact data xref queries return empty lists; they
do not establish absence of source users. A supplemental __text opcode scan
records 106 offset-64/nearby-indirect-call shapes, which are only candidates:
they do not prove receiver type, reaching definitions, function ownership or
restoration behavior. No exhaustive caller or nonuse claim is made. The
selected-file worker above uses read/save fields, not the restoreFromBackup
field; their routes stay separate.

## Problems encountered and verification

The first recorder session retains 44 successful calls, then fails before a
tool invocation because the analyst supplied an unsupported path argument to
the active-target metadata operation. Its phase-2 export and failed summary
remain intact. The corrected plan reuses active-target arguments in a new
session. A separate wrong class-selector hint reports no indexed class match;
it supplies no class implementation and is not a decoder failure.

The recorder's validation-error message had read the Ajv instance's errors
instead of the compiled validator's errors, yielding an unhelpful null message.
The copied continuation recorder fixes that diagnostic. A target-free invalid
input control now reports additionalProperty=path, fails before any tool call
and closes with an empty owned lineage. The old recorder/capture are preserved.
This is a field-harness correction, not a product source change.

[Qualification](arc-restore-consumer-2026-11-24/qualification-verification.json)
checks **308 MCP calls / 304 successful**, with four retained missing-procedure
errors for two global accessors. Explicit unlisted decoding recovers their
selected original bytes without adding functions or CFG edges. **246 decoded
instruction records**, **16 raw byte reads**, loader-applied rebases and the
Windows physical offsets verify. Two complete public CLI/MCP metadata Evidence
pairs are exactly equal. All four verifier lineages end with no owned
descendants, including the intentional schema failure and CLI run.

The unchanged runtime's 1,881 files and 32 current source hashes verify.
[History verification](arc-restore-consumer-2026-11-24/history-verification.json)
authenticates 24 earlier snapshots and original living-file versions. Product
tests/build/package gates were not rerun for this research/harness checkpoint.
No new product defect was established. Raw captures, caller mistakes, source
selection hints, reused Evidence hashes and the manifest remain reviewable.

Still open: actual Client/backend/store selection; the invocation-scoped typed
carrier (Client unknown stays revision 3/open); a higher consumer of the
generic automatic backup helper; the selected restore UI trigger and in-memory
post-save behavior; actual I/O, readback/durability and wider browser features.
