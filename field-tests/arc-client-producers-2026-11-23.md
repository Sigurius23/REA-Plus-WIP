# Arc suite, context and dependency-store producers — 2026-11-23

The suite suffix and application gate are now traced; the cached test predicate
and generic dependency insertion/replacement paths also have native evidence.
These findings narrow item 63. They do not establish the concrete Client loaded
at `0x1012ab840`, relevant temporal memory stability, preference durability or
full application coverage.

The original fixed arm64 image is unchanged: SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`,
80,498,448 bytes, DMG version 1.172.1/build 90370. Public REA+ MCP captures use
the existing frozen table-dispatch runtime. No Arc host process, helper,
shipped JavaScript, profile, UI or service was used. Explicit function replays
run inside Unicorn; owned C was compiled and emulated, never host-executed.

## Suite selection

The initializer already traced at `0x1007ed3cc` requires the byte returned by
`0x1005a4e64` to equal one before parsing `--user-data-dir`. With a present
parsed value, it calls `0x1007ed818` on that String and appends its description
to `com.dia.instance.`. The prior initializer observations and parsing scope
remain authenticated in the preceding policy/base-URL checkpoints.

The hash begins at 5381 and processes UTF-8 bytes with
`h = (h * 33 + byte) modulo 2^64`. Empty input returns 5381. It is not Swift's
randomized Hasher. The imported metadata/witness used for description are
`_$ss6UInt64VN` and `_$ss6UInt64Vs23CustomStringConvertiblesWP` at original
bind slots `0x10423f510` and `0x10423f530`. Under the ordinary Swift standard
library binding, the suffix is the unsigned decimal hash. This study emulates
the hash, not the imported description or Foundation suite initializer.

Seven complete Arc replays match separately emulated source-built C and
independent integer arithmetic: empty, one ASCII byte, `/tmp/arc`, a 15-byte
small string, Unicode UTF-8, and the two original native literal strings
recovered previously. This exercises small/native storage and wrapping past
64 bits. `/tmp/arc` yields `0x1ae4e9c3755d4a`; empty yields `0x1505`.
The test inputs and all initialized stack/data mappings are explicit in
`hash-input-derivation.json` and the request files. Foreign String runtime
paths are not qualified. Omitting the native literal's data mapping stops at
`0x1007ed8f4` with `missing_memory`, before any implicit data synthesis.

The once initializer `0x1005a4c90` calls `0x1005a4cac`, then stores its Boolean
at `0x1046f7fa0`. That predicate obtains NSBundle.mainBundle.bundleIdentifier;
only when absent does it read NSProcessInfo.environment[`__CFBundleIdentifier`].
It returns whether the resulting identifier has prefix `company.thebrowser.dia`.
If neither source supplies an identifier, it enters a diagnostic trap path.
The source diagnostic reads “Unable to locate bundle identifier to determine
application type!”. The selector stubs, rebased selector slots, string bytes,
class imports and String.hasPrefix import have independent public observations.

The original package plist declares `company.thebrowser.Browser`, re-read
through public `inspect_plist` and checked against the earlier fixed-package
capture. With that identifier supplied normally by Foundation, this gate is
false: this shared Dia-specific user-data-dir/suite branch is not selected for
ordinary packaged Arc. This is a conditional static conclusion; no process
bundle identifier or environment was observed. Other preferences objects,
explicit dependency overrides and actual runtime bindings remain separate.

## Cached test predicate

The full instructions for `0x1006d4ca8` and its selected fallback show:

1. Presence of any of `XCTestBundlePath`, `XCTestConfigurationFilePath`, or
   `XCTestSessionIdentifier` in ProcessInfo.environment returns true. The code
   checks dictionary membership, not the content or truthiness of each value.
2. Otherwise it constructs a file URL from the first ProcessInfo.arguments
   entry, if available. A last path component equal to `xctest`, or a path
   extension equal to `xctest`, returns true under ordinary Foundation/String
   behavior. The inline comparison words encode exactly `xctest`.
3. Otherwise `0x1006cb748` looks up XCTestObservationCenter by NSClassFromString,
   obtains `sharedTestObservationCenter`, then `observers` through performSelector:.
   After the retained casts, it scans for class name `XCTestMisuseObserver` and
   obtains `currentTestCase`. A nonnil result makes the outer predicate true;
   absent class, selectors/results, cast failure, matching observer or current
   test case follows the retained nil/false paths. Invalid array invariants
   retain their trap paths. None of these runtime objects was fabricated or
   queried in the host environment.

This completes the selected static production route for the cached predicate.
The preceding context factory's preview/live/test precedence is unchanged;
current process context is not asserted.

## Generic store and Client setter references

The inner generic store `0x1006fde3c` obtains associated Value metadata, makes
its typed copy through the VWT, forms an existential value and passes the key
metadata plus the storage field at Self+8 to `0x1006fbf9c`. Its present-value
path invokes `swift_isUniquelyReferenced_nonNull_native`, then `0x1006fdabc`.
The latter looks up the key, handles capacity/COW paths, and either replaces an
existing 32-byte value through `0x1006faaf0` or writes the key, existential and
occupancy/count for a new slot. This supports ordinary same-key replacement;
it is not a complete proof about concurrent/reentrant mutation, allocator
aliasing, every custom VWT or cache invalidation outside this selected path.
The optional absent-value path remains distinct.

The Client setter has no direct caller in this bounded Program, but explicit
incoming references include thunk `0x1012b2840` and a data reference. Empty
`procedure_callers` must therefore not mean “no setter uses or overrides”.
The Program is seeded and its analysis deadline is one second; all missing
inventory remains unknown. Unlisted instruction decoding is read-only and
adds neither functions nor CFG edges. Selected linear windows include adjacent
entries; their labels do not grant whole-function ownership.

## Verification and recovered problems

- 796 public MCP attempts: 786 successful, ten expected missing-procedure
  errors for five unlisted helpers. Native decoding follows those failures;
  unchanged requests were not retried to claim completion.
- Three completed captures, four exact full CLI/MCP Evidence comparisons,
  15 emulator results (seven Arc/C pairs and one missing-memory control),
  696 original instruction-byte checks, and checked original/loader-fixed
  Program reads. Synthetic imported addresses are Program labels, not runtime
  pointers; imported symbol identities are checked against original fixups.
- The main final bundle contains 1,114 records including the preceding policy
  and hash imports. It retains both revisions of the same open Client-choice
  unknown; revision 2 adds store/predicate/reference support without resolving it.
  The separate exact-selector bundle is also retained.
- Frozen 1,881 runtime files and 25 source hashes remain unchanged. Twenty
  earlier snapshots authenticate. All four owned process lineages are empty.
  There was no new source/package gate for this evidence-only checkpoint.

Qualification initially expected printable bytes from the 17-byte selector
range, but auto-detection accepted it as CBOR. Its valid NUL-containing text
was then represented as `str-bytes`, producing an empty strings view. The
original reply is retained. A separate public read of the exact 16 selector
bytes recovers `performSelector:`; the verification recovery is explicit.
The typed CBOR/MessagePack text producer incorrectly applies a printable-text
heuristic to declared UTF-8 strings. This is newly recorded as item 73, with
an owned reproduction and repair next. Auto-detection ambiguity itself is
expected and is not being treated as a format-detection bug.

## Continue from here

Fix and qualify item 73, then continue relevant Client override/copy producers
and the selected invocation proof. Actual storage/cache contents, selected
closure code/context and temporal field stability are still required. Keep
`unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04`
open. Preference I/O/durability and broader browser-feature coverage remain
unfinished. Do not substitute ordinary packaged defaults for observed state.
