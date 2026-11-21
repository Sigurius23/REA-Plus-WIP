# Arc preference persistence and Boost application — 2026-11-21

This continues the offline Arc 1.172.1/build 90370 investigation after the retained
summary update. The selected warning/interstitial preference path is now bound
to named settings, exact key strings and NSUserDefaults read/write methods.
Boost edit application is distinguished from storage; the default client exposes
both memory and Firebase storage implementations. The full Arc investigation
remains incomplete.

Arc, its helpers and shipped scripts were never launched. No account/profile,
service request or live UI was used. The owned compiler fixtures were never
executed. All addresses below belong to fixed main ARM64 SHA256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The supplied DMG identity remains the one in the main dossier.

## What the new metadata establishes

The dependency getter at `0x1006fa470` uses Swift TaskLocal get/withValue.
Its generic wrapper is `Dependency`; calling this getter alone does not imply
storage. Public symbolic-reference bytes and exact descriptor names identify:

- `UserDefaultsClient` for the editor's preference reader/writer.
- `BoostsClient` for the shared mutation helper's async worker.
- `AnalyticsClient` for the conditional companion helper previously considered
  a possible storage path.
- `AnyPublisher<Never,Never>` for the selected publisher typeref.

[Metadata bindings](arc-persistence-2026-11-20/metadata-bindings.json) retain
53 stored-field names across five selected types and all 297 `Setting` enum
case names, with field/name Evidence IDs and signed-relative addresses. The
prior 21 `BoostsEditor.State` names remain in the November 20 retention report.
The new selected types include `BoostData`, `BoostID` and `ChangeStack`.
Names are observations of metadata; they do not establish runtime injection.

## Warning and interstitial preferences

`UserDefaultsClient` has 23 stored closure fields. Its descriptor's field-vector
word offset 2 and the static metadata at `0x1042c8ac0` give actual instance
field offsets: `boolForSetting` is field 0/offset 0; `setBool` is field 10/offset
`0xa0`. This corroborates the existing reader and writer instruction slots;
it does not rely solely on assuming every closure occupies 16 bytes.

The shared closure signature references the exact pure enum descriptor at
`0x103d41568`: zero payload cases and 297 empty cases. The selected cases are:

| Argument | Enum case and exact key | Selected table target |
| --- | --- | --- |
| `0x31` | `hasDismissedBoostsInterstitial` | `0x1005ab4e8` |
| `0x32` | `hasDismissedJSWarningBanner` | `0x1005aa834` |

The existing reducer initializes its warning State by reading tag `0x32` and
masking the returned Bool. Its dismissal/completion branches request true for
these tags. Those reducer observations now have concrete names.

The exact selected default path is:

1. `UserDefaultsClient: DependencyKey` static witness candidate `0x100d929a0`
   performs once initialization through `0x100d90ebc` and copies 368 bytes.
2. Initializer `0x100d91000` selects `NSUserDefaults.initWithSuiteName:` for a
   nonnil configured suite, otherwise `standardUserDefaults`. The suite
   configuration's source and installed-profile path remain unbound.
3. Constructor `0x100d92a28` installs closure code/context pairs, including
   reader `0x100d92ebc` and writer `0x100d92f0c`, capturing that defaults object.
4. The reader adapter reaches `0x100d910dc`, converts the Setting to an NSString
   key and calls the `boolForKey:` selector.
5. The writer constructs a captured callback `0x100d932b4`. Its instructions
   load the defaults receiver, Bool and UInt16 Setting; the shared body at
   `0x100d917ac` converts the key, masks Bool to one bit and calls
   `setBool:forKey:` with that key.

[Selected-key derivation](arc-persistence-2026-11-20/selected-preference-path.json)
independently checks the two UInt16 table words 947/134, selected ADRP/ADD
literal addresses, relative branch tails, exact straight-line String return
forms and UTF8 lengths 30/27. No target execution or CPU emulation was needed.
The literal keys match the metadata names. It checks only those two concrete
inputs; it is not a general recovery of the anonymous converter.

The writer's publisher/callback construction is observed. Invocation timing,
subscription, selected runtime dependency, filesystem flush and readback from
an installed profile are not observed. In particular, this is a statically
identified NSUserDefaults API path, not a claim that this analysis performed
a durable write.

## Boost state application and storage

The static `BoostsClient` metadata at `0x1043071c0` binds 17 closure offsets.
Field 13 is `applyToWebContent` at `0xd0`; field 14 is `applyToAllWebContents`.
The shared editor worker loads the client at context+`0x10` and its async code
pair at context+`0xe0`/`0xe8`. This matches the `applyToWebContent` field rather
than a save operation. The conditional companion client's name is
`AnalyticsClient`; that route is not evidence of durable storage either.

The default constructor installs async descriptors at `0x10377e778` onward.
The selected field 5/6/13/14 descriptors derive entries `0x101178704`,
`0x101178770`, `0x101178ac0`, `0x101178b40`. Field 5/6 (`boostData` /
`setBoostData`) dispatch through a captured `BoostsStorage` existential.
Exact selected static conformance tables identify both
`BoostsStorageMemoryImpl` and `BoostsStorageFirebaseImpl`. A byte predicate in
the constructor chooses the branch; that predicate has not been assigned a
named environment. The default's existence does not select a branch at runtime.

Metadata-selected captured classes are `BoostsImageCacheImpl` and
`BoostsWebContentHelperImpl`. The application entries obtain the main actor
executor. The selected single/all application resumes are exact LC starts
`0x1011880fc` and `0x101188c58`; the initial shorter bodies only contained setup.
Their later explicit admission preserves that extent distinction.

The bulk worker checks `URL.host` against the stored two-word String and
skips nonmatching entries. It iterates `0xa0`-byte change records. Selected
branches construct `:user`, `:font`, `:textTransform` and `:zaps` identifiers;
font/text-transform templates exclude `i`, `.material-symbols-outlined` and
`.material-icons`. Tag 1 is a no-op in that loop. Other branches request zoom
or numeric/color-related interface operations. The exact CSS suffix for zaps
is ` { display: none !important; }`. The worker review retains raw tag/slot
numbers where source enum identities or concrete interface methods are not
bound. These are requested application operations, not observed page changes.

### Selected storage request and error boundaries

The selected Firebase setter builds `collectionWithPath:("boosts")` followed
by `documentWithPath:(identifier)`. Its ordinary branch bridges a Swift
dictionary to NSDictionary and calls `setData:merge:completion:` with merge
flag 1 and an Objective-C completion block. Block `0x10117d13c` resumes the
Swift continuation normally for a nil callback error; for a nonnil error it
retains/wraps that error and uses `swift_continuation_throwingResumeWithError`.
The Swift resume tests the saved error and takes distinct success/error paths.
These identify request construction and callback handling; no service was
contacted and no remote write was observed.

The getter builds the same collection/document path. Both recovered request
constructors invoke `getDocumentWithCompletion:` and install a captured
completion block. The subsequent getter result callbacks/decoding remain
unqueried, and the alternative setter branch still uses captured hooks and
a returned-set mutation. Do not label that alternate branch a remote delete
or assume all writes take the ordinary merge path.

The memory implementation looks up and updates a captured dictionary, then
emits a tagged value through another helper. Exact enum metadata at
`0x104307298` / descriptor `0x103d77a90` binds `BoostsClientError` cases:
`alreadyExists`, `doesNotExist`, `signedOut`, `invalidData`. The selected setter's
lookup miss allocates `doesNotExist`; the getter allocates `doesNotExist` for a
miss and `invalidData` for an absent/failed reconstruction. The exact async
error-return instructions are retained; synchronous error-register assumptions
are not transferred to these continuation returns. The Firebase callback
error wrapper has different metadata and is not relabeled `BoostsClientError`.

[Storage bindings](arc-persistence-2026-11-20/boost-storage-bindings.json),
[worker review](arc-persistence-2026-11-20/boost-worker-followup-2026-11-21.md)
and the [Firebase leaf review](arc-persistence-2026-11-20/firebase-leaf-review-2026-11-21.md) preserve the source references. The
editor commit/event-to-`setBoostData` link, complete encoding/decoding, alternate
setter effects, active dependency selection and actual remote/local readback
still need work.

## Broader browser workers

The tab worker accepts an NSMenuItem, reads its `tag`, admits 1–9 and encodes 9
as the special zero-plus-flag payload before sending a store action. The
sidebar worker reads a State keypath, negates the resulting byte and sends
through the same closure-based store send. These bodies improve the decision
trace but do not identify the final browser reducer effects.

The selected restore witness returns the small string `Sidebar`. One restore
worker memoizes a dependency-returned filtered array. Another hands a value to
a hierarchical text formatter; that formatter is not a recovered restore/write
operation. Error-register branches remain present in instructions even where
the decompiler removed blocks. No restore success/failure or storage format is
claimed from these wrappers.

## REA+ gap and qualification

New open item 63 records the unguarded halfword converter at `0x1005aa5e4`:
14 instructions,56 recovered body bytes and zero recovered tables, although
selected original table entries and branches exist. The `0xffff` mask permits
65536 values; it cannot establish the 297-case bound. Existing signed-word
Swift recovery and guarded byte/halfword recovery do not cover this input
provenance profile. Zero recovered tables does not mean no physical table.

Two [source-owned 297-case fixtures](arc-persistence-2026-11-20/halfword-fixture/DESIGN.md)
compile to the same pattern and identical 594-byte tables, with and without
RawRepresentable conformance. Their 21-file manifest and static binary checks
pass. They reproduce the encoding, not a fresh provider failure on the
fixtures. Automatic recovery needs a proved witness/type path or the selected
typed-field → constructor → adapter → converter flow; shape or neighboring
bytes cannot replace input identity. Production recovery was not changed.

All public replies were schema/canonical-contract checked by the harness.
[Capture verification](arc-persistence-2026-11-20/capture-verification.json)
records **373 public calls across seven sessions: 330 successful replies and
43 retained procedure-admission errors**, canonical bundle hashes and verified
empty owned lineages. Those errors belong to earlier partial Programs; they
are not 43 feature failures or 373 passing checks. The second session's continuation expired; transport
cleanup still verified an empty lineage, with no explicit close calls. Two v1
label collisions were recovered from its complete bundle without changing the
journal. Harness v2 rejects label reuse before invocation and existing output
directories. No REA+ source files or frozen runtime were changed; the prior 102
Swift cases and 44 delivery tests were not repeated for this research-only pass.

Remaining work includes editor-to-save linkage, complete Boost encoding/result
decoding, alternate setter effects and actual write/readback,
selected runtime dependency/binding, final sidebar/tab reducers, complete
restore behavior, and the unassessed account/sync, history/download and general
network/security feature routes. This report does not mark full Arc complete.


Verification reproducer (Node 24.22.3 from the qualified local runtime):

```sh
node field-tests/arc-persistence-2026-11-20/verify_captures.mjs mcp mcp-followup mcp-defaults-2026-11-21 mcp-implementations-2026-11-21 mcp-boosts-2026-11-21 mcp-apply-store-2026-11-21 mcp-firebase-2026-11-21
```

All intermediate seed reproductions pass, including the 2093 receipt replay
and the 2216/2236/2279/2296 planners. Native Java source bytes still match the
qualified frozen runtime; `native-source-identity.json` records both digests.
The snapshot manifest excludes binaries, caches, unused drafts and itself.
