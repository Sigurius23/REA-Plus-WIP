# HeyClicky notch state metadata follow-up — 2026-10-30

**Thirty `NotchLiveEvent` cases and their indexed branch destinations are now
recovered from the shipped arm64 bytes.** The case count has independent Swift
metadata authority. The destinations identify code to follow; this pass does
not recover their sizes, transitions, reachability or display behavior.

This is a supplemental inert Mach-O parser pass, linked to existing public REA+
byte replies. It creates no new REA+ Evidence and starts no provider or target.
The app's separate authorized UI check has a different scope. No app settings,
user application data, prompts or jobs were used here.

## Source and metadata checks

The thin source is **55,971,232 bytes**, SHA-256
`bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911`.
Its file-backed Mach-O segments are parsed before translating addresses; all
name and table reads are bounded to initialized file bytes. The companion
[JSON](heyclicky-notch-state-followup-2026-10-30.json) records source offsets,
raw descriptor/record bytes, region hashes and the private parser identity.

At `0x1031ac770`, the enum descriptor's relative name is `NotchLiveEvent`.
The word at +20 is `0x02000012`: the low 24 bits give **18 payload cases**,
while its high byte is the payload-size metadata offset. The +24 word gives
**12 empty cases**, for **30 total**. This follows the upstream
[Swift enum descriptor layout](https://raw.githubusercontent.com/swiftlang/swift/main/include/swift/ABI/Metadata.h).

The relative pointer at descriptor +16 resolves to FieldDescriptor
`0x103203c14`: kind **2** (enum), record stride **12**, field count **30**.
All 30 field names are readable UTF-8 strings. The first 18 type references are
non-null and the last 12 are null. Payload types are retained as addresses;
symbolic mangled type strings were not decoded as ordinary C strings. The
[Swift reflection-record definitions](https://raw.githubusercontent.com/swiftlang/swift/main/include/swift/RemoteInspection/Records.h)
distinguish those two kinds of string.

The case record order has a compiler/runtime basis: Swift emits payload records
before empty records, and reflection indexes that same field sequence by the
enum tag to obtain its case name. See the
[reflection emitter](https://raw.githubusercontent.com/swiftlang/swift/main/lib/IRGen/GenReflection.cpp)
and [runtime mirror](https://raw.githubusercontent.com/swiftlang/swift/main/stdlib/public/runtime/ReflectionMirror.cpp).
These upstream `main` sources were checked on 2026-10-30; they are not pinned to
the target's compiler or the installed runtime version.

## Dispatch mapping

The already captured instruction chain calls stub `0x102dc5474`, propagates
its return to the index, loads `LDRSW x9,[x10,x11,LSL #2]`, adds the signed
entry to anchor `0x10131a318`, then branches at `0x10131a324`.
An independent parse of this file's stub/indirect-symbol table resolves that
stub to `_swift_getEnumCaseMultiPayload`. Metadata accessor `0x101228b70`
loads descriptor `0x1031ac770` on its cold path; its called stub resolves to
`_swift_getSingletonMetadata`. The saved assembly traces that accessor result
to the metadata argument of the enum helper.

The generic helper returns payload case tags followed by payload-count plus
empty-case index. Thus, assuming a valid value of this Swift enum, metadata
bounds the selector to **0..29** without a local compare. This is a static
ABI-supported inference, not a live enum observation. See the
[Swift multi-payload helper](https://raw.githubusercontent.com/swiftlang/swift/main/stdlib/public/runtime/Enum.cpp).

Each destination below is computed as
`0x10131a318 + signed_LE32(0x10131da5c + 4*index)`. All are aligned and lie in
file-backed executable `__TEXT` sections. The 120-byte table ends at the next
independently analyzed function `0x10131dad4`; that agreement corroborates the
metadata count and does not define it.

| Index | Metadata case name                 | Payload reference | Decoded destination |
| ----- | ---------------------------------- | ----------------- | ------------------- |
| 0     | `activityCustomStatus`             | yes               | `0x10131a770`       |
| 1     | `dictation`                        | yes               | `0x10131acfc`       |
| 2     | `agentMultiActivity`               | yes               | `0x10131a484`       |
| 3     | `handoffSent`                      | yes               | `0x10131b1d8`       |
| 4     | `handoffQueued`                    | yes               | `0x10131b1d4`       |
| 5     | `dictionaryWordLearned`            | yes               | `0x10131bfc8`       |
| 6     | `dictationCopiedToClipboard`       | yes               | `0x10131c460`       |
| 7     | `voiceReplyMutedCopiedToClipboard` | yes               | `0x10131c530`       |
| 8     | `microphoneTrouble`                | yes               | `0x10131c2dc`       |
| 9     | `documentFolderAccessDenied`       | yes               | `0x10131c168`       |
| 10    | `appUpdated`                       | yes               | `0x10131c098`       |
| 11    | `meetingCountdown`                 | yes               | `0x10131b670`       |
| 12    | `clickyUpdate`                     | yes               | `0x10131b784`       |
| 13    | `onboardingTutorialResume`         | yes               | `0x10131bb94`       |
| 14    | `integrationConnected`             | yes               | `0x10131afe4`       |
| 15    | `skillPinned`                      | yes               | `0x10131c794`       |
| 16    | `restingMark`                      | yes               | `0x10131c710`       |
| 17    | `agentPeek`                        | yes               | `0x10131baa0`       |
| 18    | `activityListening`                | no                | `0x10131a400`       |
| 19    | `activityThinking`                 | no                | `0x10131a404`       |
| 20    | `activitySpeaking`                 | no                | `0x10131a408`       |
| 21    | `agentTask`                        | no                | `0x10131a328`       |
| 22    | `integrationSuggestion`            | no                | `0x10131b278`       |
| 23    | `sidecarLearningSuggestion`        | no                | `0x10131b558`       |
| 24    | `spotifyVoiceTip`                  | no                | `0x10131b5e4`       |
| 25    | `onboardingTutorialInvite`         | no                | `0x10131bf0c`       |
| 26    | `morningSuggestions`               | no                | `0x10131bc98`       |
| 27    | `introHatchPeek`                   | no                | `0x10131ae0c`       |
| 28    | `introSkillPing`                   | no                | `0x10131af04`       |
| 29    | `dockedIdle`                       | no                | `0x10131c600`       |

Case names describe shipped metadata. They do not prove that every named
feature is enabled, reachable or presented to the user. Destination blocks still
need instruction and state/data-flow recovery before assigning geometry or
transition behavior.

## Existing REA+ results and the automatic recovery gap

The existing `analyze_function` result for `0x101319e48`
(`ev_f378e1a6df289284d2ce2b7a28b124bbc916cb5994eef9aed0c7b214d1a9defe`)
reports `native_api.jump_tables=[]`. Its body contains three ranges totaling
5,696 bytes within a 15,376-byte span; the case region
`0x10131a328..0x10131c8f3` is omitted. The bounded Program was incomplete.
A larger pcode output cap cannot restore those missing instructions.

Source inspection finds a specific boundary: the bridge only processes tables
already returned by `HighFunction.getJumpTables()`. Its supplementary AArch64
relative-table recognizer supports byte/halfword loads, and requires a local
unsigned compare/guard. This case instead uses signed 32-bit `LDRSW` entries and
a bound supplied by Swift enum metadata. Those are separate requirements;
simply adding a mnemonic would not recover this example safely.

The proposed regression needs both a guarded signed-32 assembly fixture and a
compiled Swift mixed-payload fixture with independently defined case markers.
Wrong helper imports, unrelated descriptors, malformed counts/strides and
changed index values must retain unknown mappings. The JSON records the
acceptance criteria. No producer change or new provider test ran in this pass.

## Evidence and limitations

- Public descriptor bytes:
  `ev_4a2efc7768d595e889c9567be3a52f18c0c49c7e4229d7ad6fa5733500936ac7`.
- Public table bytes:
  `ev_1db99ae5f87b4ea5dc486b5507fd1bbc38acec91e202e931d4760ef2eb81908e`.
  Both saved reply regions exactly equal the current hash-identified source
  bytes. Their profile is
  `9d767b19f3309990487caf9039fe04860ed266f921d78225574c5e75ceb24c77`;
  its 60-second analysis timed out and remained incomplete.
- Accessor assembly:
  `ev_515ec47310cc3c7fb0bfd0affd49e5144bc296e24608c68ee97e64e9354200c7`.
- [Private supplemental receipt](/private/tmp/rea-heyclicky-enum-recovery-2026-10-30/receipt.json)
  is 38,285 bytes, SHA-256
  `56493f6b58f177fa364236068daed500ce9ef6abc2ea5d61cedeabca8c0bb119`. It is an inert parser receipt,
  not a replacement for the interrupted provider session's missing finalization
  or cleanup evidence.

The target bytes were read and not modified. Only these two new report files
and private reproducibility files were written. Nothing was committed or pushed.

## Subsequent correction

Item 37 was fixed and verified after this diagnostic pass. REA+ now recovers the
30-case mapping and owning body itself; this report retains the original
observations and scope. See the
[fix verification](heyclicky-37-fix-verification-2026-10-30.md).
