# Arc editor save, JavaScript activation and local store — 2026-11-21

This offline continuation closes several concrete gaps in the selected Boost
path: the editor's save/create effects, Firebase getter decoding, local enable
membership, the two model-data writes for a newly enabled JavaScript Boost,
and the local store's JSON/file-writing implementation. These are static
selected-path findings. Full Arc, runtime injection, actual writes and durable
readback remain incomplete.

Input remains the fixed Arc 1.172.1/build 90370 ARM64 slice, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
No Arc executable, helper or shipped script was executed. No profile/account,
recorded URL or application service was accessed. Production REA+ source and
the qualified native bridge are unchanged from the prior retention pass.

## Editor to save/create/preview effects

The common mutation worker `0x1012abe5c` invokes the create helper
`0x1012a93b0` and conditional model-update helper `0x1012a9b80`. The latter
requires a Boost ID, reconstructs optional BoostData and replaces the State
model when present. When its incoming flag's bit 0 is clear, it constructs
save and preview effects. This establishes effect construction, not their
runtime ordering or completion. The flag is not assigned a universal UI name.

Three async descriptors are now checked against public bytes and their
original executable LC entry intervals:

| Descriptor | Entry and worker | Selected client field |
| --- | --- | --- |
| `0x103788e48` | `0x1012bb0f8` → `0x1012aa9a4` | BoostsClient field 6, `setBoostData`, offset `0x60` |
| `0x103788e58` | `0x1012bb17c` → `0x1012aab40` | ADKClient field 8, `getWebContents`, offset `0x80`; then BoostsClient field 11, `setLocalPreviewImage`, offset `0xb0` |
| `0x103788e90` | `0x1012bb414` → `0x1012a99a8` | BoostsClient field 3, `createBoost`, offset `0x30` |

The save worker passes the identifier and reconstructed model to the selected
closure pair. The create helper runs only without an existing ID and with a
URL host; it obtains a UUID string, updates State and constructs the create
effect. Static BoostType records identify cases `edited` and `installed`.

The preview path checks the returned web content, then passes a callback to
`setLocalPreviewImage`. Its MainActor continuation ultimately invokes captured
object-method slot `+0x2e8`. The concrete method and resulting image remain
unresolved; these captures do not prove pixels or a completed screenshot.

See the [instruction fact index](arc-callbacks-2026-11-21/fact-index.json),
[descriptor preparation receipt](arc-callbacks-2026-11-21/editor-async-seed-receipt.json)
and the original client metadata bindings in the
[preceding persistence report](arc-persistence-2026-11-21.md).

## Getter and wire representation

The Firebase callback forwards incoming callback errors through the throwing
continuation. With a snapshot, it calls its `data` selector, bridges the
resulting dictionary and invokes `0x10115ae9c`. A missing snapshot or a
converter-none result constructs `BoostsClientError.doesNotExist` (raw tag 1).
It must not be relabeled the Memory adapter's `invalidData` error.

The converter requires String `hostPattern` and String `data`. The latter is
JSON-decoded as the nested `BoostData.InternalData`, whose seven stored fields
are css, js, font, textTransform, textZoom, colorScheme and zaps. Primary JSON
decode failure returns none; an optional signature's decode failure instead
leaves a nil signature and continues constructing the model. Stored field
names alone do not establish every nested JSON coding key.

Outer `isActive` is parsed as a String: missing/wrong-type values default to
true; String `true` parses true and other Strings parse false. The encoder
`0x10115b98c` correspondingly builds String `true`/`false` and a JSON String
`data`, using JSONEncoder for the nested payload. Optional signature encoding
has its own failure path. These are selected codec rules, not a claim that
all schema versions, malformed inputs or migrations are understood.

## Local membership and two model-data writes

Physical instructions and fresh predicate/trim-helper bodies establish:

```text
returnedModel.isActive = parsedStoredIsActive
                         && (locallyEnabledID || !hasNonblankJS)
```

The predicate checks `InternalData.js` after trimming leading and trailing
Unicode scalars in `CharacterSet.whitespacesAndNewlines`. The getter passes
identifier membership in the locally enabled Set directly into the
converter. The local-read error continuation explicitly uses an empty Set.
Thus this selected error fallback does not treat a JS-bearing model as locally
enabled. The optional-data tag helper is separate from BoostType.

The selected setter first inserts the identifier into that Set when its
active/nonblank-JS guards hold. The Boolean result means **new insertion**;
it is not proof the local save succeeded. The local helper calls
`saveSyncThrowing` and releases a returned error at that boundary, retaining
the precomputed insertion result.

The newly traced parent continuations distinguish two paths:

1. **New insertion:** `0x10117d424` reconstructs a temporary BoostData copy
   through `0x101158eb0(w0=0)`, which assigns `isActive=false`. It serializes
   that temporary and starts a Firebase merge. If that merge succeeds,
   `0x10117d570` serializes the **original model**, then starts the second
   merge. A first-merge error bypasses the second and is forwarded.
2. **Already present:** the same branch serializes the original immediately
   and uses the common completion `0x10117d5d8`.

Both primary model-data merges use the previously verified `boosts/<ID>`
merge-write worker. The common completion forwards its error or builds a
subsequent `featuresUsed` update. The latter update's full effects remain
open. The inactive temporary is therefore **not** a conclusion about final
persisted state. No request was submitted and no remote result was observed.

The independent reviews retain their earlier uncertainties and progressively
resolve them in separate, source-hashed files:
[initial](arc-callbacks-2026-11-21/js-activation-review.md),
[follow-up](arc-callbacks-2026-11-21/js-activation-final.md),
[predicate/transform resolution](arc-callbacks-2026-11-21/js-activation-resolution.md),
and [two-write resolution](arc-callbacks-2026-11-21/js-activation-two-writes.md).
Read the last note for the latest ordered-write interpretation.

## Local store implementation and remaining boundaries

The selected dependency is `StorableDataStore<StorableBoostsData>`.
Static metadata places `version` at offset 0 and `locallyEnabledBoostIDs` at
8. A bounded original-byte caller scan of the generic factory retains all
28 direct-call candidate owners; exact StorableBoostsData metadata address
formation selects `0x10118c418` for this investigation. This is a typed static
factory candidate, not selection of the live injected instance.

The factory captures a `StorableDataStoreImpl` object and six closure pairs.
The class contains URL/name, queue, JSON encoder/decoder, date formatter and
date-provider fields. Constructor `0x100dbb534` creates its queue and a
pretty-printing JSONEncoder. Read/save wrappers use synchronous queue calls.
The read path reaches `Data(contentsOf:)` and JSONDecoder. The save path
reaches JSONEncoder and `0x100dc4860`: a sibling `.tmp-<UUID>` URL, a file-handle
write and `NSFileManager.replaceItemAt` call. An attributes dictionary includes
`NSFilePosixPermissions = 0x180` (octal 0600). Unnamed Objective-C stubs in this
path remain unnamed; symbol lookup returning `SUB_...` does not identify their
selectors. No fsync, crash consistency or durability guarantee is inferred.

The exact Boost store location remains open. The factory passes tag `0x32` to
`0x100d989e4`, which masks to 8 bits and uses another unguarded halfword
dispatch. Public bytes for the selected table entry are retained; querying its
interior target as a standalone procedure returns an admission error. Its
input type and complete dispatch are not proved by the tag. This is related
to the existing item 63 coverage boundary, not evidence that the distinct
297-case Setting table has been recovered. Version validation, fallback
migration, backup behavior and detailed read/write error policies also remain
incomplete.

## Verification and capture outcome

Five fresh public MCP sessions made **354 calls: 352 successful replies and
two retained admission-error replies** for the same interior branch target.
Four sessions exported final bundles and closed twice. The fifth stopped
before a duplicated query label could be invoked: a field-test plan mistake,
not a REA+ failure. Its 71 completed replies remain saved; six records after
its last bundle are authenticated independently through their original public
replies. All five owned process lineages are verified empty.

The [capture verifier](arc-callbacks-2026-11-21/verify_captures.mjs) validates
advertised schemas, named contracts, canonical Evidence, content/structured
agreement, target identity, journals and cleanup. It reports the failed
orchestration session explicitly; successful calls are not feature completion.
The [machine result](arc-callbacks-2026-11-21/capture-verification.json) records
these distinctions. The earlier 829-file persistence checkpoint was verified before these
documentation updates. Its 826 capture/support files remain unchanged; three
living documents are updated here, with their historic manifest bytes
authenticated from published commit `a8b426fedc`. No production code changed, so the native
102-case producer matrix and unrelated package checks were not repeated.

Still open: the store location and detailed persistence policies; concrete
preview method; remaining apply/runtime effects; warning callback timing;
typed unguarded dispatch recovery (item 63); final browser feature reducers;
account/sync, history/downloads and broader network/security analysis. The
[handoff](../ARC_HANDOFF.md) preserves the next exact boundaries. Upstream
parity is separately tracked in item 62.
