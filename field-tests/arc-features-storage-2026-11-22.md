# Arc: feature metadata and selected storage policy

This offline follow-up resolves the selected `featuresUsed` payload/completion
chain and substantial local-store policy: version validation, diagnostic
fallback decoding, backup naming/copying, caller flags and explicit file
synchronization. It does not establish runtime injection, successful I/O,
crash consistency, remote state or complete Arc coverage.

## Identity and implementation

Fixed Arc 1.172.1/build 90370 ARM64 SHA-256:
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Original DMG SHA-256:
`d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778`.
No Arc/helper/script, profile, account, service or fixture was run. The existing
qualified frozen runtime `.cache/arc-runtime-unlisted-2026-11-21` and its
1,869 files are unchanged; this follow-up makes no production REA+ edit.
Ghidra 12.1.4/JDK 27 use one-second bounded analysis and explicit source-checked
seeds. The profiles expand from 2,481 to 2,490 and 2,491 entries. These are
caller assertions corroborated against original LC_FUNCTION_STARTS and bounded
code references, not analyzer discoveries or complete function inventories.

## Feature metadata follows the model writes

After the final primary model merge succeeds, continuation `0x10117d64c`
loads the **original model** from parent+`0x58` into Swift-self X20, invokes
extractor `0x101160524`, and builds a one-entry dictionary keyed `featuresUsed`.
Public type bytes bind `[String]` and the String/array pair representation.
`0x101171dbc` converts the native values into an Any-valued dictionary;
Foundation bridges it to NSDictionary. The captured receiver flows from the
same parent document-reference slot through async setup `0x10117d914`.

Worker `0x10117d92c` sets W3=1 and calls the actual selector
**`setData:merge:completion:`**, then awaits the continuation. This is another
merge request with a plain feature-label array. It is not evidence of a
FieldValue union operation, an executed feature or an analytics endpoint.
The callback reuses the previously captured `0x10117d13c` error/continuation
adapter. Child resumes `0x10117da68/da9c` and parent resumes
`0x10117d7bc/d8c0` preserve successful return versus the captured error in X20.
Thus a feature-metadata error can be returned after the model merge has
succeeded. No rollback is constructed in this bounded completion chain;
upper-layer retry/error behavior and actual server results remain separate.

The selected request sequence is now:

| Local insertion result | Model-data merges | Following metadata merge |
| --- | --- | --- |
| Newly inserted ID | Temporary inactive model, then original model after first success | `featuresUsed`, after second success |
| Already present | Original model | `featuresUsed`, after its success |

This is a selected static sequence, not a global count of all writes. Errors
bypass later steps. The inactive temporary is not the final-state conclusion.

## Exact feature predicates

The extractor appends labels once each in order **css, js, font,
textTransform, textZoom, zaps, colorScheme**. It uses model data, not the outer
active flag or evidence that CSS/JS ran. Let P be its Swift-self input and
q=`u64(P+0x48)`. Under valid stable Swift storage and normal helper returns:

| Label | Exact selected predicate |
| --- | --- |
| css | q≠0 and CSS is nonempty after trimming edge whitespace/newlines |
| js | q≠0 and JS is nonempty after the same trim |
| font | q≠0 and `u64(P+0x28)≠0`; no nonblank-font test |
| textTransform | q≠0 and `u8(P+0x30)≠3` |
| textZoom | q≠0, `u8(P+0x40)≠1`, and integer `u64(P+0x38)≠100` |
| zaps | q≠0 and the collection-header word `u64(q+0x10)≠0` |
| colorScheme | q≠0 and `u8(P+0x68)≠3` |

Actual field-record pointers and offset vectors bind these fields. Raw String
pool order would swap zaps/colorScheme and must not be used. Fresh type bytes
show optional String css/js, optional BoostFont/BoostTextTransform/BoostTextZoom/
BoostColorScheme, and `[String]` zaps. Raw discriminators above remain the exact
claim; they are not guessed UI names, rendered colors or matched-element counts.

The apparently large color comparison simplifies exactly: its constructed
baseline writes byte+`0x18`=3, and the discriminator returns 1 iff that byte is
3. Both selected branches therefore decide using the input byte alone; nested
payload equality is unreachable for this baseline under the stated normal
memory/call premises. No full RGB comparison or additional helper query is
needed. The [independent predicate review](arc-features-used-2026-11-21/feature-predicate-review.md)
and its hashed JSON retain all branch/copy/math anchors and interpretation limits.

## Version and failed reads

The StorableBoostsData witness pattern identifies getter `0x100003ae8`
(return 0), policy getter `0x1004a9e48` (Swift empty array), and instance-version
getter `0x1004fe554` (word at self+0). The pattern's three inherited holes are
not runtime values. Public instantiator instructions `0x10118c918` write only
those holes at +8/+16/+24; the three selected getters are preserved under the
normal Swift witness-instantiation premise. No actual runtime table was read.

Decoder `0x100dbc4ac` compares the decoded version word with expected 0.
Any mismatch constructs `StorableError.versionOutdated` with decoded/expected
values; it does not first determine which version is newer. On full-model
failure it tries `StorableVersion`, whose single reflected `version` field has
Swift Int type bytes `Si`. A different version can replace the original error
with the version diagnostic; failed fallback decoding releases that secondary
error and preserves the original. This is **diagnostic fallback decoding**,
not migration or reconstruction of model data.

Read helper `0x100dbf0d8` has physical error guards/dynamic casts omitted by its
qualified pseudocode. On selected supported error paths, flag bit 0 controls a
backup attempt, and the original error still leaves through X21. It does not
call the separate backup-restore helper in this path. Assembly and declared
Swift ABI assumptions carry this interpretation; the existing item 47
warnings remain applicable to unproved generic throwing calls.

The selected local enable-set helper reads with flag 1 and no optional callback.
Its error continuation `0x101182bd0` constructs an empty Set and proceeds to
insertion. The following selected save passes flag 0, bypassing that save's
create-backup branch; its returned error is released, while the precomputed
new-insertion Boolean is retained. Consequently a local read failure can lead
to a fresh enable Set/save attempt, and a local save failure does not prove the
subsequent remote model writes were stopped. Actual overwritten contents or
loss of prior IDs were not observed.

## Backups, permissions and the write path

Backup path builder `0x100dc1490` removes the original extension, appends the
formatted date as an extension, then re-appends the original extension. For
this selected JSON store the sibling is
`StorableBoostsData.<formatted-date>.json`. The default formatter's exact
format is `yyyy-MM-dd-HH-mm-ss-SSS`, with `en_US_POSIX` locale and a supplied
calendar. The captured selector is `setCalendar:`, not `setTimeZone:`; no fixed
UTC/timezone claim follows. Date/provider/formatter injection remains possible.

`0x100dbcd60` checks the original path and uses `copyItemAtURL:toURL:error:`
when it exists. Post-copy `0x100dc4684` applies `NSFilePosixPermissions=0x180`
(octal 0600) using `setAttributes:ofItemAtPath:error:`. Copy/attribute error
branches are caught/logged and yield an absent backup result. The missing-file
branch skips copying; a returned path alone is not proof a backup exists.

Generic maintenance enumerates backups before consulting the retention
schedule. The selected witness returns an empty schedule, so its calendar/
count policy loop is not entered. This is not a global absence of deletion
or a fixed retention guarantee for every Storable type. The separate candidate
restore helper `0x100dbe518` iterates enumerated eligible backups and returns a
successfully read value; its relation to the queue adapter is indirect, not a
direct B/BL. Restore invocation, complete ordering and caller writeback remain
outside the selected enable-set path.

The selected writer uses the previously traced sibling `.tmp-<UUID>` path,
file creation/write, **`synchronizeAndReturnError:`**, **`closeAndReturnError:`**,
and replacement API. These selector names are now bound through public stub,
slot and CString bytes. The captured success path requests synchronization
before close/replacement. Cleanup helper `0x100dbe40c` uses
`removeItemAtURL:error:` and releases its cleanup error. These are explicit
API requests, not observed successful writes, a proved fsync implementation,
directory synchronization, crash consistency or durable readback.

## Verification and recorder correction

Two analysis sessions made **309 public calls, all successful replies**.
The first's continuation expired after 73 calls. Its original recorder said
“completed”; the new verification correctly classifies it as **partial**, with
transport-owned cleanup and verified empty lineage, without inventing explicit
close calls. Its last export contains its retained records. The second made
236/236 successful calls, exported a final bundle, explicitly closed twice
and verified empty lineage. All decoded byte probes match original executable
bytes; schemas, named contracts, text/structured agreement, Evidence identity,
bundle membership, frozen runtime and independent review hashes are verified.

The recorder now throws/reports failure on idle expiration. A real target-free
MCP check deliberately expires: expected nonzero exit, failed summary, zero
analysis calls/targets, verified empty lineage. This is a field-harness fix,
not a REA+ runtime defect. Old captures/reviews remain unchanged. No native
producer, dependency or package source changed, so the previous 102-case matrix
and package gate were not rerun. See [capture verification](arc-storage-features-2026-11-22/capture-verification.json).

Remaining: item 63's typed-context producer, active injection and actual local/
remote readback, crash guarantees, complete restore ordering/caller behavior,
preview object method, final apply/UI effects and broader browser feature
routes. Full Arc analysis remains incomplete.
