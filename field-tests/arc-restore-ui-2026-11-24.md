# Arc: selected restore action, CloudKit preparation and restart requests

Date: 2026-11-24. This continues the [selected-file worker checkpoint](arc-restore-consumer-2026-11-24.md).
REA+ item 75 is repaired and qualified. The Arc results are conditional static
analysis; Arc, its helpers and shipped scripts were never run. No profile,
account, CloudKit service, recorded URL or live UI was used.

## Input and authority

The fixed thin arm64 executable has 80,498,448 bytes and SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Both captures use the unchanged caller-supplied 2,537-function seed overlay,
Ghidra 12.1.4 and a one-second autoanalysis budget. Seeds and supplemental
original-byte scans select questions; they do not establish provider-owned
function boundaries, exhaustive incoming references or runtime observations.

The first Arc capture uses the unchanged frozen blob-control runtime. The
second Arc capture and owned controls use the rebuilt, separately frozen
Objective-C-selector runtime. Each has 1,881 authenticated files. The old
32 source hashes are checked at parent `274e3ee0b11addadf084e40d43c5f2c57f638334`;
44 merged current source hashes are checked against the current tree.
Neither frozen delivery was edited after capture began.

Public calls, complete replies, Evidence, actual SDK catalog schemas, export
bundles and journals are retained in [the capture directory](arc-restore-ui-2026-11-24/).
[The finding ledger](arc-restore-ui-2026-11-24/finding-index.json) identifies
the observations used by each conclusion. These joins are analyst reasoning
under normal Swift/Objective-C ABI, valid receiver/metadata and value-witness
premises; REA+ has not automatically recovered an executed typed call graph.

## Selected controller path

Public Swift vtable selection binds descriptor `0x103d3776c` to
`RestoreDataViewController`, including implementation `0x1001ecfe4` at word
offset 56. A metadata word offset is not a source method ordinal or name.
The metadata accessor at `0x1001edb84` independently uses that descriptor.

The initialization body starting at `0x1001ec218` creates a
`RestoreSidebarDataFlow` object through metadata accessor `0x100306704`,
installs two dependency wrappers, and stores the flow with a witness pointer
in a box installed in the controller. The flow class descriptor is
`0x103d3916c`; its selected restore worker remains `0x100305ef0`.
This construction is static evidence, not an observed controller instance.

The selected handler `0x1001ecfe4` checks an Optional selected RestorableFile
and a second boxed-flow property. An absent selection or missing box returns
without creating the task. Otherwise it copies the selected value/box into
a task context and calls the task helper at `0x1004095b8`, using async
descriptor `0x1036b6df8`. The captured closure thunk at `0x1001edef0` branches
to `0x1001ed2a8`, which schedules continuation `0x1001ed314` on the MainActor.
The small getter at `0x1001ed63c` returns the handler address.

The continuation has two visible lanes:

- A conditional dynamic cast to RestoreSidebarDataFlow succeeds: construct a
  `SyncEngine`, await its preparation entry `0x101754868`, then the resumed
  controller path calls worker `0x100305ef0` at `0x1001ed564`.
- The conditional cast fails: the code projects the original box and directly
  calls that worker at `0x1001ed440` without the selected preparation call.

The cast flags and branches are retained literally. Compiler specialization
or source-level polymorphism is not inferred from this unusual combination.
The actual lane, selected backup and installed dependency instances are unknown.

Both worker-result branches request the same restart helper only when the
worker returns true. The preceding checkpoint establishes that this Boolean
tracks backup-read presence, while Windows/sidebar save errors are caught.
Consequently, entry into the restart path does **not** prove both writes
succeeded. No source-level button title, final action installation, actual
click, focus state or complete UI behavior is established here.

## Preparation before the local restore

Descriptor `0x103d8bda4` and metadata accessor `0x101758394` bind the created
class to `SyncEngine`. The asynchronous entry schedules `0x101754888`.
Its continuation label contains `removeCloudKitZone(metadata:)`; the captured
callback setup at `0x10174b388` provides stronger corroboration than the label:

- It constructs `CKModifySubscriptionsOperation` with an empty save array and
  a delete-ID array derived from the selected zone name plus `.subscription`.
- It constructs `CKModifyRecordZonesOperation` with an empty save array and
  the selected zone-ID array as the deletion input.
- Public selector bytes bind `setDatabase:`, `setQualityOfService:`,
  `setModifyRecordZonesCompletionBlock:` and both `addOperation:` requests.

These are conditional operation-construction/enqueue requests. The selected
zone identity, active container/database, network request, completion outcome,
cloud-side deletion and task resumption are not observed. The subscription
operation's independent completion is not proved by the zone callback.

## Restart helper request and failures

The true-result path enters `0x10227a774` and MainActor continuation
`0x10227a838`. Public Objective-C selector-slot reads bind the application
lookup to `currentApplication`, `bundleURL` and `bundleIdentifier`, preferences
to `standardUserDefaults` / `setBool:forKey:`, and the later exit request to
`sharedApplication` / `terminate:`.

With bundle details present, it sets
`restartClientServiceShouldBeAllowed` to true, obtains the bundle path and
command-line arguments, and calls `0x10227b218`. This helper looks up
`arc_restart_helper.sh`, prepares file attributes, sets a process executable
URL to `/bin/bash`, builds `-c` and a command containing the script path,
bundle identifier/path and joined arguments, then requests
`launchAndReturnError:`. The command includes a background/disown suffix.
The imported bridges, exact instructions, selector strings and script-name
bytes are preserved; the script contents were not recovered in this checkpoint.

If this launch path returns without a Swift error, the caller requests
`terminate:nil`. A caught error produces the `Unable to run restart helper`
message and resets the preference to false. Missing bundle details follow a
separate error path. There is also a test-predicate/logging lane, which is not
treated as proof that every test invocation skips the later helper request.

This establishes an attempted external restart mechanism, not a successful
script execution, process exit/relaunch, persisted restore or updated UI.

## REA+ item 75: focus before decode admission

Arc's original unfiltered `facet: objc`, `max_records: 6000` result contains
320 protocol records and zero classes. Standalone protocol decoding spent
the aggregate record budget first, and coverage correctly reports partial.
That was a missing focus capability, not a false class-absence/counting bug.

MCP now accepts optional `objc_class_name`; CLI exposes `--objc-class-name`.
It requires `facet: objc` and matches the exact case-sensitive raw name in
local `__objc_classlist` identities. A complete identity pass precedes decode
admission, without retaining an unbounded list of matches. A second immutable
pass decodes distinct matching classes, metaclasses and referenced protocols.
Standalone protocols and category inventories are outside this selected scope.
The aggregate record cap is unchanged, and identity/decode uncertainty remains
explicit. There is no symbol-only fallback for the selector.

Optional `objc_class_selection` reports `name`, `index_entries`, `examined`,
`matching_index_entries`, `matched`, `unresolved` and `admitted_classes`.
The full file-backed class-index extent/alignment is checked before scanning;
unknown identities cannot become negative matches. Coverage states the selected
scope. A separate class-summary defect found in the touched producer is also
fixed: distinct same-name class objects retain their own methods, using the
local implementation slice instead of a global name filter.

| Public retest | Budget | Result |
| --- | ---: | --- |
| Arc, unfiltered baseline | 6,000 | 320 protocol records, zero classes, partial |
| Arc, exact `FIRApp` | 6,000 | All 1,960 identities examined; one root admitted, two class/metaclass records, 45 method implementations |
| Arc, `_TtC3Arc25RestoreDataViewController` or plain name | 6,000 | All 1,960 identities examined, zero matches, zero unresolved identities; scoped negative |
| Owned fixture, unfiltered baseline | 24 | Unrelated protocol consumes admission; zero classes |
| Owned fixture, exact target | 24 | Target plus metaclass and its methods retained |
| Owned alias-index derivative | 24 | Two matching entries; one distinct root admitted |
| Owned unmapped-index derivative | 24 | One match plus one unresolved identity; partial retained |

The controller remains positively established through Swift metadata. Its two
name negatives concern the Objective-C class index only; the selector does not
claim to discover runtime-instantiated Swift Objective-C metadata.

## Verification and retained attempts

The qualified run contains 2,207 public MCP calls: 2,206 successful replies
and one expected invalid-request control for the wrong facet/name combination.
Every successful reply is checked against its actual SDK-converted JSON Schema,
named contract, Evidence parser where applicable, text/structured parity and
bundle membership. All 2,023 native instruction records and 53 raw reads are
checked against the original Mach-O; 28 loader-applied rebases are checked
separately. Fourteen imported Program words
retain their original bind identity without claiming external memory contents.

Six complete CLI/MCP Evidence pairs match: four owned controls plus Arc's
positive and negative selections. The first Arc CLI comparison passed but
could not inspect process lineage because the sandbox denied `ps`; that
capture remains intact. The separate qualified repeat has a verified empty
owned lineage. Eight qualified verifier runs, including package verification,
report no live owned descendants at observation time.

All 67 focused source tests, `build:cached`, `check:fast`, `docs:check` and the
full `verify:package` gate pass. The package verifier checks installation,
update/setup, CLI/MCP and the packaged skill. The bridge and Swift recovery
implementations are unchanged. The new owned dylib was compiled and analyzed,
never host-run; its alias/unknown derivatives change exactly one declared index
word each and retain every other byte.

Twenty-five historical snapshot manifests are reauthenticated, including
changed living files at their original commits. The current snapshot includes
raw captures, source edits, scripts, logs, receipts and these notes; frozen
runtime builds and fixture binaries stay in ignored cache directories.

The initial qualification script used the wrong handler instruction address
for one assertion; `qualification-initial.log` is retained and the assertion
now points to the captured `0x1001ed24c` call. The first expanded ledger check
also incorrectly required the Arc digest on owned-fixture records; the corrected
check uses each fixture's authenticated identity, and its failed log survives.
During development, an assertion
against a generic validation message was corrected to inspect structured
issues, and an unavailable prettier command was replaced by repository oxfmt.
Those are analyst/development attempts, not additional product defects.

## Remaining Arc questions

Follow the final UI action installation and the matching shipped restart script
from the fixed package, then the generic automatic `restoreFromBackup` consumer.
Actual Client/backend selection, captured-instance stability and typed invocation
mapping remain open at the existing Client unknown revision 3. Actual disk
durability, cloud outcomes and broader browser features remain unverified.
Do not repeat the completed indexed selector work or substitute live execution
for those offline evidence questions.
