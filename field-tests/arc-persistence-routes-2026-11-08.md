# Arc 1.172.1 Boost reducer and persistence-route follow-up

Snapshot: **2026-11-08**. These offline passes narrow the native Boost command,
reducer, type-metadata and selector-source routes in the supplied **Arc 1.172.1 /
build 90370 DMG**. They do **not** establish durable Boost persistence or complete
Arc behavior. Arc, its helpers and shipped JavaScript were not executed.

All observations in this directory concern the derived ARM64 main executable,
SHA-256 **`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`**.
The [analysis dossier](arc-analysis-dossier-2026-11-08.md) records the original
DMG, universal executable and extraction identities, and separates this build
from the earlier installed 1.171.0 investigation. Ghidra captures use version
12.1.4 and explicit one-second bounded analysis. Their positive bytes,
instructions and metadata are useful; missing functions, names or references
in a partial Program do not establish absence.

## Preparation and session outcomes

The initial selector-preparation script selected the zero-file-size
`__PAGEZERO` segment as its image base. Its count assertion failed before it
wrote the seed file, but the recorder had already started. The retained
[first open reply][initial-open] reports `execution_failure` during
`resolve_analysis_profile`, with `REA_GHIDRA_SEED_FILE` and `ENOENT` diagnostics.
Six following queries then report no active target. These seven calls provide
no native analysis Evidence. The preparation error was in orchestration; the
generic diagnostic itself was subsequently improved under
[item 54](arc-seed-diagnostics-2026-11-08.md). The original replies remain
unchanged. See [the correction receipt][corrections].

Corrected preparation chooses the **file-backed offset-zero segment**, checks
the selected artifact hash and retained header/index bytes, then decodes public
`LC_FUNCTION_STARTS` data. The receipt records **271,299 indexed starts** and
**1,940 selected entries** in `[0x1012a0000, 0x101300000)`, seed SHA-256
`5bf1f7d6c0d1a3d1fdc9e42b325af9b9d8a8954571996f3732d6fd83b8f75f7b`.
This range is a caller-selected investigation window, not a proven Swift module
boundary. The entries are caller assertions when imported into Ghidra, even
though their source bytes came from public artifact observations.
[The seed receipt][seed-provenance] retains the two complete source Evidence
IDs; [the check script][check] reproduces their decoding without needing the
historical temporary extraction path. The factory pass adds the explicitly
selected `0x10150478c` entry to make 1,941 seeds.

| Recorder directory   | Calls / successful / errors | Export and termination                                                                                                                                                                                  |
| -------------------- | --------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `native`             | 45 / 38 / 7                 | Phase-7 bundle exported. Continuation 8 expired while idle; driver finalized client/transport and recorded verified empty descendants. There is no explicit `close_binary` invocation in this recorder. |
| `factory`            | 9 / 9 / 0                   | Exported; explicit close; verified empty descendants.                                                                                                                                                   |
| `overlay-metadata`   | 6 / 6 / 0                   | Exported; explicit close; verified empty descendants.                                                                                                                                                   |
| `outer-type`         | 23 / 23 / 0                 | Exported; explicit close; verified empty descendants.                                                                                                                                                   |
| `codingkey-metadata` | 5 / 5 / 0                   | Exported; explicit close; verified empty descendants.                                                                                                                                                   |
| `view-vwt`           | 7 / 7 / 0                   | Exported; explicit close; verified empty descendants.                                                                                                                                                   |
| `outer-vwt`          | 7 / 3 / 4                   | Target selection succeeded; all four native reads failed at Ghidra startup. Empty bundle exported; explicit close; process lineage unavailable.                                                         |
| `outer-vwt-restored` | 7 / 7 / 0                   | Four Evidence records exported; explicit close; verified empty descendants.                                                                                                                             |

The recorder's `status: completed` means its control flow finished; it does not
turn failed calls into passes. The first `outer-vwt` attempt used the default
sandbox and Node 22. Its retained diagnostics say native launch failed; this is
not proof that the requested bytes were absent. Repeating under the approved
local Ghidra execution environment and supported Node 24 recovered all four
reads. The failed attempt and unavailable lineage remain retained, rather than
being rewritten as a product defect or a clean verifier result. Individual
summaries, invocation arrays, replies and driver logs support the table.

## Reducer identity and composition

Selected native metadata identifies **`BoostsEditor: Reducer`**, conformance
**`0x103788ae8`**, static witness table **`0x1046270d8`**. Its decoded table
slot **4** points to **`0x1012a9870`**, whose instructions call
**`0x1012a571c`** at **`0x1012a98b4`**. Slot **5** points to
**`0x1012a98d0`**: that body constructs a fatal assertion associated with
`ComposableArchitecture/Reducer.swift` and ends in a breakpoint. It is the
fatal Body fallback, not the command reducer implementation.
[Conformance][reducer-conformance], [reduce witness][reduce-witness],
[Body witness][body-witness].

Composition entry **`0x10150478c`** materializes **`0x1046270d8`** and stores
the pointer at stack offset `+0x30`, among keypath, state and generic-composition
construction calls. This corroborates use of the identified witness in that
composition path. It does not yet connect that construction end to end to the
exact store instance captured by the editor view-store send closure. The
generic wrapper/instance binding remains unproved.
[Factory instructions][factory-instructions], [pseudocode][factory-pseudocode].

The selected reducer body currently contains **2,024 bytes** across
noncontiguous ranges spanning **8,608 bytes**. At **`0x1012a5ba8`** it calls
**`0x1012b2860`**, then uses the result to index signed words at
**`0x1012a7e74`**, adds each to base **`0x1012a5bb8`**, and branches at
**`0x1012a5bc8`**. The decompiler explicitly reports that it could not recover
this jump table. The original byte sample contains **96 bytes / 24 words**.
A **2026-11-09** public follow-up reads **112 bytes / all 28 words**, agrees with
the original prefix and closes cleanly. The checker retains both observations
and derives aligned destination candidates within the recorded span. Neither
these candidate addresses
nor the existing body ranges establish all case bodies or their effects.
[Body limits][reducer-info], [instructions][reducer-instructions],
[pseudocode][reducer-pseudocode], [original sample][table-bytes],
[complete table read][complete-table].

This is part of the fixed-layout Swift dispatch gap tracked as **item 55**.
The [owned dispatch probe](arc-reducer-dispatch-probe-2026-11-08.md) shows why a
helper's immediate constants or nearby words cannot safely supply the missing
case count. That repair still needs concrete caller type and value-copy,
projection and non-escape provenance before extending function ownership.

## Outer action and nested ViewAction metadata

The selected action metadata accessor **`0x1012b284c`** uses singleton cache
**`0x104627270`** and descriptor **`0x103d7b260`**. The reflected descriptor has
**three payload cases and one empty case**. Its field records and separately
retained names establish `delegate`, `view`, `_internal`, `reloadBoost`.
The `view` payload's symbolic type reference points to child enum descriptor
**`0x103d7b2a4`**. This association comes from signed-relative field/type
references, rather than proximity or a shared getter address.
[Accessor][outer-accessor], [outer descriptor][outer-descriptor],
[outer fields][outer-fields], [view type reference][view-reference].

The child name is **`ViewAction`**. Its descriptor records **11 payload cases /
17 empty cases = 28 total**, and the reflected field record independently
reports 28. This recovers the count and enclosing-type association; the capture
does not read all 28 case names and payload type definitions.
[Child descriptor][child-descriptor], [child fields][child-fields],
[child name][child-name].

Public loaded-memory reads then corroborate:

| Object                              | Address / value                                            |
| ----------------------------------- | ---------------------------------------------------------- |
| Child fixed metadata                | `0x104317118`; enum kind `0x201`; descriptor `0x103d7b2a4` |
| Child metadata's `[-8]` VWT pointer | `0x104317098`                                              |
| Child `initializeWithCopy` witness  | `0x1012b8738`                                              |
| Child `getEnumTag` witness          | `0x1012b2860`                                              |
| Child value size / stride           | **156 / 160 bytes**                                        |

The getter body is seven instructions. It reads a word at offset `0`, extracts
the high nibble of the word at `+0x98`, and selects that nibble or the first
word plus 11. Its **11** constant agrees with the reflected payload count; the
full **28** case count comes from the type descriptor, not that constant alone.
The original chained-pointer offset selectors were analyst hypotheses; the
loaded reads are the corroboration.
[Child metadata][child-metadata], [child VWT][child-vwt],
[getter instructions][tag-helper].

The restored outer reads resolve the descriptor's singleton relative field at
**`+32`** to incomplete metadata **`0x104627290`**, its preceding VWT pointer
to **`0x104627200`**, and `initializeWithCopy` to **`0x1012b795c`**. A 768-byte
read retains that copy implementation for the dispatch-proof follow-up.
The outer pattern's size and stride words are zero in the imported image; this
is incomplete metadata, not evidence of a zero-sized live action. No singleton
was instantiated or runtime memory inspected.
[Singleton descriptor][singleton-descriptor], [incomplete metadata][incomplete-metadata],
[outer VWT][outer-vwt], [copy bytes][outer-copy].

## Other recovered links and remaining feature questions

The selector-source consumer **`0x1012e560c`** invokes the source initializer
through `_swift_once`, reads cached String words at **`0x104707a90/98`**, and
forwards them through a captured async descriptor. This advances beyond source
inventory, while leaving consumer activation, concrete page/world, lifetime and
evaluation success unobserved. [Source consumer][source-consumer].

The overlay metadata pass found no selected conformance records for the queried
overlay/shelf controller names. It recovered an imported `ObservableObject`
conformance for `HoveredElementTracker`, with runtime witness storage still
unobserved. These results do not recover overlay drawing or prove that the
queried controllers lack other implementations. The fixed-version CodingKey
metadata selects the request/payload `stringValue` witnesses; the small getter
verification is retained separately in the
[dossier](arc-analysis-dossier-2026-11-08.md#boost-command-path) and confirms
`boostId`, `type`, `data`, `contents`. It does not populate runtime witness tables.

Still required for the persistence question: bind the concrete composed reducer
to the captured store, safely recover the missing branch ownership and case
effects, trace CSS/JavaScript URL handlers and command mutations into a storage
write, then trace their reload/readback and failure paths. The empty prefix
reference lists in a bounded Program do not eliminate those handlers. Final
selector coordinates, native overlay rendering and broader Arc browser
subsystems remain separate open work.

## Retained verification

From the repository root, using the existing built REA+ domain validators:

```sh
node field-tests/arc-persistence-routes-2026-11-08/audit-evidence.mjs
node field-tests/arc-persistence-routes-2026-11-08/check-findings.mjs
```

The [canonical audit][audit] passes **76 standalone / 76 unique Evidence
records and 9 bundles**. The [findings check][findings] authenticates and hashes
26 selected records, reproduces the 1,940 public-byte-derived seeds, checks
reducer slots 4/5, resolves the outer/child reflected associations and both
VWT chains, preserves the original 24-word sample and complete 28-word read as
separate observations, and retains all nine session
outcomes. These are read-only artifact consistency checks, not new native
analyses, proof that an app feature ran, or a complete Arc result.

[initial-open]: arc-persistence-routes-2026-11-08/native/open.reply.json
[corrections]: arc-persistence-routes-2026-11-08/analyst-corrections.json
[seed-provenance]: arc-persistence-routes-2026-11-08/local-seed-provenance.json
[check]: arc-persistence-routes-2026-11-08/check-findings.mjs
[reducer-conformance]: arc-persistence-routes-2026-11-08/native/boost-editor-reducer-conformance.evidence.json
[reduce-witness]: arc-persistence-routes-2026-11-08/native/boost-editor-reduce-witness.evidence.json
[body-witness]: arc-persistence-routes-2026-11-08/native/boost-editor-body-witness.evidence.json
[factory-instructions]: arc-persistence-routes-2026-11-08/factory/boost-store-factory-instructions.evidence.json
[factory-pseudocode]: arc-persistence-routes-2026-11-08/factory/boost-store-factory-pseudocode.evidence.json
[reducer-info]: arc-persistence-routes-2026-11-08/native/boost-reducer-info.evidence.json
[reducer-instructions]: arc-persistence-routes-2026-11-08/native/boost-reducer-instructions.evidence.json
[reducer-pseudocode]: arc-persistence-routes-2026-11-08/native/boost-reducer-pseudocode.evidence.json
[table-bytes]: arc-persistence-routes-2026-11-08/native/nested-action-jump-table-bytes.evidence.json
[complete-table]: arc-persistence-routes-2026-11-08/table-tail/nested-action-complete-table.evidence.json
[outer-accessor]: arc-persistence-routes-2026-11-08/outer-type/outer-action-metadata-accessor-instructions.evidence.json
[outer-descriptor]: arc-persistence-routes-2026-11-08/outer-type/outer-enum-descriptor.evidence.json
[outer-fields]: arc-persistence-routes-2026-11-08/outer-type/outer-enum-field-records.evidence.json
[view-reference]: arc-persistence-routes-2026-11-08/outer-type/outer-case-1-payload-type.evidence.json
[child-descriptor]: arc-persistence-routes-2026-11-08/outer-type/inner-view-enum-descriptor.evidence.json
[child-fields]: arc-persistence-routes-2026-11-08/outer-type/inner-view-field-records.evidence.json
[child-name]: arc-persistence-routes-2026-11-08/outer-type/inner-view-type-name.evidence.json
[child-metadata]: arc-persistence-routes-2026-11-08/view-vwt/view-fixed-metadata.evidence.json
[child-vwt]: arc-persistence-routes-2026-11-08/view-vwt/view-fixed-value-witnesses.evidence.json
[tag-helper]: arc-persistence-routes-2026-11-08/native/nested-action-tag-helper.evidence.json
[singleton-descriptor]: arc-persistence-routes-2026-11-08/outer-vwt-restored/outer-descriptor-singleton.evidence.json
[incomplete-metadata]: arc-persistence-routes-2026-11-08/outer-vwt-restored/outer-incomplete-metadata.evidence.json
[outer-vwt]: arc-persistence-routes-2026-11-08/outer-vwt-restored/outer-value-witnesses.evidence.json
[outer-copy]: arc-persistence-routes-2026-11-08/outer-vwt-restored/outer-declared-copy-witness.evidence.json
[source-consumer]: arc-persistence-routes-2026-11-08/factory/selector-library-injection-pseudocode.evidence.json
[audit]: arc-persistence-routes-2026-11-08/evidence-audit.json
[findings]: arc-persistence-routes-2026-11-08/findings.json
