# Arc bucket removal and persistence backend policy — 2026-11-24

The selected bucket-removal helper is now traced, and the default BoostsStorage
constructor's previously unnamed Memory/Firebase predicate is classified.
Memory is selected for UI/e2e test flags equal to String `1`, or the cached
XCTest predicate; otherwise this constructor selects Firebase. These are static
conditional rules. The app's actual environment, selected instance and completed
I/O remain unobserved. Item 63 and the full Arc investigation remain open.

The fixed Arc 1.172.1/build 90370 arm64 input remains 80,498,448 bytes with SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, helpers, shipped JavaScript, profiles, accounts, UI and services were not
executed or accessed. Owned C was compiled and replayed only inside the bounded
emulator. No imported Swift/Objective-C operation was emulated or mocked.

## Selected bucket repair

Public instructions cover 424 bytes at `0x100710288`. This is the helper called
by the already traced same-key/context removal route after it copies out the
removed value. X0 supplies the hole and X1 the raw dictionary header. The
routine uses the scale byte at header+0x20, occupancy bitmap at +0x40, 16-byte
key records through +0x30 and 32-byte values through +0x38.

If the following bucket is empty, the routine reaches final bookkeeping without
hashing or moving another entry. Otherwise it calls imported
`_HashTable.previousHole(before:)` at `0x10363b830`, advances to the cluster start,
then examines occupied following buckets. For each candidate it hashes the raw
identity word and context byte using the same seeded Swift Hasher operations
as lookup; header+0x28 supplies the seed.

At `0x100710358..37c`, the ideal bucket is the finalized hash masked by the table
mask. A candidate moves when its ideal bucket lies in the circular inclusive
interval from cluster start to current hole. The move copies the 16-byte key
and 32-byte value and makes the candidate the new hole. At the end, the routine
clears the final hole's occupancy bit, subtracts one from count at +0x10 and
increments the 32-bit word at +0x24 with wrapping arithmetic. A signed count
overflow trap remains. The selected code does not implement a global flush.

This matches the broad circular-move organization in the public
[Swift HashTable implementation](https://github.com/swiftlang/swift/blob/main/stdlib/public/core/HashTable.swift).
That source is a reference, not an authenticated version of Arc's linked Swift
runtime. The owned reference formula was derived from the retained native
branches; it is not a reconstruction of the complete Swift dictionary.

## Explicit raw controls

The source-built [C reference](arc-removal-persistence-2026-11-24/removal_reference.c)
models the selected move predicate and isolated bookkeeping. All code regions
are checked against each artifact's Mach-O virtual-to-file mappings, and every
visited instruction's bytes are authenticated.

| Control | Public results | What it establishes |
| --- | --- | --- |
| Ten supplied-hash decisions | Ten Arc/C pairs agree | Inclusive interval endpoints, misses, wraparound and a raw high-bit hash control |
| Four isolated removals | Four Arc/C pairs reach the outer return | Exact bitmap/count/word+0x24 updates; other key/value bytes unchanged, including a wrapping word+0x24 |
| Occupied-next-bucket control | Arc stops at external call `0x1007102e8` to `0x10363b830` | Runtime helper is not executed; header/keys/values remain unchanged before that boundary |

The ten Arc decision controls start at the after-hash block with explicit raw
registers and stop at either branch marker. They are not whole-function returns
or recovered Hasher results. The four full isolated calls receive synthetic
eight-slot headers and arbitrary key/value bytes, not live caches or valid
managed Swift objects. Their retained high unused bitmap bits are explicit
inputs. No full collision-cluster removal, runtime Hasher, COW, ARC, concurrency
or every-scale proof is claimed. Requests and exact inputs live in
`replay-derivation.json` and `*.request.json` beside the raw MCP/CLI replies.

## Getter wrapper and async return joins

The previously listed callback frontiers join the existing getter analysis:

| Route | Selected observation |
| --- | --- |
| `0x10118374c` → `0x10117f978` → `0x100a3d4b0` | Objective-C block wrapper loads Swift code/context at block+0x20/+0x28, retains the context and two incoming objects, calls with snapshot/error in X0/X1 and context in X20, then releases them |
| `0x101183754` → `0x101183480` → `0x101183510` | Capture adapter forwards the continuation payload, captured Set and identifier words to `0x101180780` |
| Common callback `0x101180780` | Incoming error takes throwing resume first; nil snapshot or converter-none constructs the bound `doesNotExist` tag1; success uses returning resume |
| Async continuation `0x101180200` | Tests X20, saves a nonzero error at frame+0x170 and schedules error exit `0x1011805a4`; zero schedules success exit `0x101180554` |
| Final exits | Success clears X20 before returning to the parent continuation; error restores saved X20. Both perform their displayed cleanup |

The callback uses the snapshot's `data` selector, bridges a dictionary and passes
identifier membership in the captured Set to `0x10115ae9c`. Its codec, primary
decode failure, optional signature failure and activation algebra were already
recovered in [the November 21 callback checkpoint](arc-callbacks-2026-11-21.md).
They are reused findings, not new codec recovery. These selected bodies do not
request an `exists` or cache-origin property; the provenance of the supplied
snapshot/error remains unknown. Incoming error is forwarded without asserting a
specific NSError subtype or server response.

The alternate continuation `0x101182d1c` invokes the captured local save callback
with W1=0 and releases the saved error when present. `0x101182d7c` returns its
precomputed byte, not save success. This corroborates the existing local-enable
setter analysis in the November 21/22 reports; it is not a remote delete path or
newly demonstrated persistence guarantee. Synchronous X21 and async X20 error
conventions remain distinct.

## Default Memory/Firebase policy

The authenticated constructor `0x1011738b4` calls `0x100b3728c` at `0x101173a1c`,
loads the returned byte and compares it with one. The true branch installs the
previously bound Memory witness table `0x104307db8`; the other branch installs
Firebase witness `0x104307a30`. That constructor/conformance binding is reused
from the retained November 20/21 evidence.

The new selected initializers establish this cached policy:

```text
Memory = (environment["ARC_UI_TESTS"] == "1")
      || cachedXCTestPredicate
      || (environment["ARC_E2E_TESTS"] == "1")
Firebase = otherwise, on this default-constructor route
```

`0x100b37128` and `0x100b37190` build the exact small Swift strings
`ARC_UI_TESTS` and `ARC_E2E_TESTS`, then call shared initializer `0x100b372f8`.
Public stub/selector reads bind `processInfo` and `environment`. The helper
bridges the resulting dictionary, looks up the supplied key, and compares the
value with String `1`, including the general String equality fallback. Missing
keys or another value produce false; merely setting either variable is
insufficient. Original-file chained fixups independently bind NSProcessInfo
and String metadata as explicitly supplemental facts; null `address_name`
responses for those slots are preserved, not replaced with inferred names.

`0x100819448` copies the result of `0x1006d4c48`, the already recovered cached
XCTest predicate. The latter checks the named XCTest environment keys, argv[0]'s
test-bundle path/extension and a fallback XCTest observation/current-test route;
it is not an unconditional true return. The three branches short-circuit in
UI flag → XCTest → e2e flag order. Separate once tokens cache the inputs and the
combined byte at `0x1046f904a`.

No ambient environment, argv, XCTest object, app account or service was queried.
These facts classify one default constructor and do not prove that the running
application uses that constructor, lacks overrides, selects Firebase, sends a
request, or persists a successful save.

## Verification and encountered limits

[Qualification](arc-removal-persistence-2026-11-24/qualification-verification.json)
passes with **420 MCP attempts / 416 successful**, three completed sessions and
**29 emulations**. Four expected missing-procedure responses for the getter's
two async exits are retained; explicit unlisted decoding recovers those exits.
**213 decoded instruction records** match original bytes; public raw reads and
loader-applied rebases are checked separately. **Four full CLI/MCP Evidence
pairs** are exactly equal. All four verifier lineages, including the CLI run,
end with no owned descendants.

The final policy batch initially omitted `decode_unlisted`. REA+ correctly
returned 106 undecodable observations for absent Listing instructions. A new
recorded session explicitly opted in and recovered all 106 without defining
functions, references or CFG edges. Both batches and the caller mistake remain
in the snapshot. A successful reply alone was not treated as decoded code.
Caller-selected LC_FUNCTION_STARTS bounds remain hints, not an exhaustive
function inventory or reachability proof. No product defect was established.

The unchanged frozen runtime's **1,881 files** and **32 current source hashes**
verify. [History authentication](arc-removal-persistence-2026-11-24/history-verification.json)
checks **23 earlier snapshots** and their original living-file versions.
Production code is unchanged; source tests/build/package gates were not rerun
for this evidence/documentation checkpoint. The new snapshot contains text
captures and source only, not the Arc or compiled fixture binaries.

## Remaining work

The former generic “unqueried persistence callbacks” frontier was stale: codec
and local-enable semantics already existed. This report adds the selected
wrapper/return joins and classifies the previously unnamed backend predicate.
It supersedes those living next-step notes without rewriting historical
captures or claiming a second recovery of the same codec.

The Client-choice Evidence unknown remains **revision 3 / open** in the prior
cache-selection bundle. This adjacent backend work does not identify the
actual Client returned to the selected worker. Remaining priorities are the
relevant earlier constructor/keypath/copy instance relations, concrete override/
cache/default selection and a first-class invocation-scoped typed mapping;
then higher restore callers/writeback, completed persistence/durability and
broader browser/apply/UI feature coverage. Full-cluster runtime removal remains
outside these bounded controls. No expanded target-execution authority is assumed.
