# Intel HEX and Motorola S-record — 2026-11-25

Item 62's first structured firmware-reader slice is implemented: selected root
Intel HEX and Motorola S-record carriers now use open_binary, inspect_artifact
and extract_artifact. This selectively adapts the audited upstream
f7849cad3fe3bffb207b4dc30f34394978c20297 decoder to local artifact identity,
Evidence, filesystem admission, extraction and cleanup rules. No additional
tool, external parser dependency or device authority is introduced.

## Supported behavior

Recognition needs a complete checksum-valid first record at byte zero; names
alone do not establish the format. The streaming decoder supports Intel 00–05
and Motorola S0/1/2/3/5/6/7/8/9, LF/CRLF and a final unterminated line. Lengths,
checksums, fixed record fields and address bounds are checked before regions
are exposed. Unsupported record types, conflicting overlaps and records after
termination refuse the carrier. Identical overlaps are counted; gaps stay
unwritten. Intel data records crossing the 16-bit offset boundary are refused
because supported producers disagree on wrapping.

Root occurrence format_metadata retains variant, counts, header, termination
and declared start fields. Linear starts and CS:IP remain declarations. S0
header address/line are retained separately from data load ranges. The
[SRecord manual](https://srecord.sourceforge.net/reference-1.65.pdf) describes
that address as normally zero and count records as covering preceding data;
neither justifies dropping nonzero headers or treating an earlier count as a
final-file certificate. The decoder checks cumulative preceding counts, retains
the declaration's line and qualifies later data or multiple declarations.
[Keil's Intel HEX guide](https://www.keil.com/support/docs/1584/default.htm)
also distinguishes declared starts from data placement and ignores the EOF
address field. These interpretations are pinned by independent known vectors
and explicit controls; they do not infer a processor or observe execution.

Decoded address-contiguous regions are regular child artifacts, named by
inclusive start/end, with contributing record counts and line spans. Their
carrier-file source_location is null. Equal payloads at distinct addresses
share content identity while retaining separate occurrence metadata. Inventory
hashes are observed digests; these carriers do not declare region SHA-256s.
Extraction rebinds the carrier digest and uses existing fresh-output,
containment, hash and cleanup checks. No holes are synthesized as zero bytes.
Missing termination retains data with an explicit truncation caveat; an EOF-only
carrier has zero decoded regions, rather than an invented empty payload.

Optional max_firmware_file_bytes / max_firmware_runs control arena and run
admission. Defaults are 134217728 carrier bytes and 65536 discontiguous record
runs. Payload storage is at most half the carrier, with another payload copy
during merging; graph/metadata cost is additional. These are explicit resource
policies, not format limits. Refusals report resource_constraint and name the
caller setting to change; unchanged limits reproduce the refusal. Other active
formats refuse these settings instead of silently ignoring them. CLI exposes
the corresponding --max-firmware-file-bytes / --max-firmware-runs options.

This is root-carrier decoding. Nested firmware members may be classified but
are not recursively decoded; select their extracted carrier explicitly. BOMs,
leading blanks, arbitrary comments, vendor extensions, board maps, CPU/raw-image
loading and device acquisition/flashing remain outside this slice. Existing
Binwalk/Unblob workflows remain separate.

## Repairs and review findings

The target-format vocabulary had separate lifecycle, Evidence and snapshot
lists. Initial integration calls exposed lifecycle output admission lagging
behind the new target formats; source review also found supported APKS/AAB/
APK-set missing from that output list. One typed, exhaustive target-format owner
now supplies all three consumers while preserving legacy Evidence aliases.
Public AAB/APKS controls verify the existing admission paths.

Owned controls caught late digest binding accepting an already decoded image,
a cancelled concurrent waiter losing cancellation, and removed carriers losing
their integrity-change classification. The reader now retains its decoded
carrier digest, rechecks caller state, and narrowly types disappearing/replaced
carrier paths. Payload streams copy bytes; forged metadata and caller mutations
cannot alter the retained image. Borrowed descriptors stay with their owner,
and failed owned close remains reachable for cleanup retry.

The imported decoder is sticky after failure and refuses reuse after finish;
a rejected write cannot turn into a later successful partial image. The
resource boundary also preserves typed capacity failures rather than projecting
whole-file refusal as a truncated artifact result. S0 and count scopes retain
observed fields instead of applying unsupported format restrictions.

A final provenance correction leaves declaredSha256 empty on decoded entries:
the old development implementation put a computed digest there. Actual observed
hashes remain in graph nodes and extraction. The two affected source versions
are archived; both runtime generations and captures remain intact. All public
inspection Evidence is identical across this correction.

## Qualification

| Check | Final result |
| --- | --- |
| Selected suites | 82 tests passed across eight files |
| Domain / reader controls | 44 / 10 passed within that total |
| Public firmware MCP | 39 calls: 33 successful, six expected refusals |
| Arc MCP regression | Four successful calls; complete reducer Evidence unchanged |
| CLI | Seven calls: three full Evidence pairs, two extraction manifest/file pairs, two expected refusals |
| Extraction readback | Eight files across five exports match expected bytes/hashes |
| Frozen runtimes | Two generations of 1,907 files and 31 source commitments |
| Historical captures | 32 snapshots authenticated at their original versions |
| Other gates | check, docs:check and discovery of all 976 tests passed |
| Final package gate | Installation/update/skills, 208 tools, six prompts and verified empty lineage passed |

The final public runs cover sparse Intel data plus a declared odd start,
Motorola header/count/start, equal payloads at separate addresses, missing
termination, nonzero S0 address, preceding-count scope, EOF-only input, bad
checksums, conflicting writes and offset wrap. record-and-continue does not
bypass malformed record checks. Raised budgets succeed after lower limits
refuse. CLI/MCP inspection compares complete Evidence, not just payloads;
extraction comparisons explicitly allow their different temporary destinations.
Known fixture payloads are checked independently of the decoder's output hash.

Arc's fixed target, 2,537 seeds and original one-second partial-analysis policy
remain selected. Its complete reducer Evidence is exactly the earlier
ev_1bea31a590d22c0700ef16b5f4f6d0444fff488bb873e1a73b31e8767677ba45,
including the 10,072-byte / 2,518-instruction result, profile and caveats. This
regression does not advance broader Arc feature recovery or make its partial
Program complete. No Arc/helper/shipped JavaScript, device, account, profile,
UI or service was executed or used.

The [verification receipt](upstream-hex-records-2026-11-25/verification.json) binds runtime/source versions, inert fixture carriers,
MCP/CLI replies, nested inventory Evidence, readback, expected refusals, history
and owned process cleanup. Native targets/databases/dist/dependencies stay
outside Git; extracted binary readback is retained as inert hexadecimal text.
Early failed integration expectations and the historical verifier's missing
prior-source allowlist are saved separately from final successful checks.

Live filesystem/CLI/MCP scope is macOS. Linux/Windows host lanes, independent
model-selection trials, device behavior and raw CPU loading were not qualified.
UF2/DfuSe, uImage/FIT/ESP, Android boot/OTA and devicetree remain open in item 62.
