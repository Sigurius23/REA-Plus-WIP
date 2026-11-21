# Arc: default local-store directory and overrides

The selected shipped default now yields the static formula:

**user-domain Application Support / Arc / StorableBoostsData.json**

On a conventional unsandboxed macOS home layout this is
`~/Library/Application Support/Arc/StorableBoostsData.json`. The actual URL
comes from Foundation/NSFileManager; no user home, sandbox mapping, active
injection, arguments, stored preferences or filesystem contents were observed.
This resolves the earlier default-directory construction gap. It does not
establish durable readback or complete Arc feature coverage.

## Fixed source and reused implementation

Arc 1.172.1/build 90370, original DMG SHA-256
`d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778`;
ARM64 slice SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The qualified runtime from pushed checkpoint `c59033f73ad050052c969a995fb981822bf5b1ad`
is unchanged: `.cache/arc-runtime-unlisted-2026-11-21`, 1,869 files. No
production edits or new provider-capability claim is made by this follow-up.

All analysis is offline. No Arc/helper/script, owned fixture, profile, account
or app service was used at runtime. Existing Ghidra 12.1.4/JDK 27 used bounded
one-second autoanalysis and explicit caller seeds. The initial profile still
omitted the newly selected witness functions; four admission errors remain
retained. Eighteen additional entries were admitted only after checking exact
original LC_FUNCTION_STARTS entries and bounded original code references.
This is analysis configuration, not a producer repair or an exhaustive
function inventory. [The planning receipt](arc-base-url-2026-11-21/overlay-receipt.json)
records all origins and boundaries.

## Default construction

Public static conformance metadata binds ApplicationPaths descriptor
`0x103d648ec` to DependencyKey/TestDependencyKey, including `Value =
ApplicationPaths`. Both selected ordinary requirement slots point to
`0x100d9b4d0`; that adapter branches to `0x100d9a51c`. The latter selects
once token `0x1045eeb20`, global value buffer `0x1047030a0` and initializer
`0x100d99c1c`, then uses shared getter `0x100d9a554`. A separate slot selects
`0x100d9a538` and its initializer `0x100d9a2b0`; that initializer constructs a
URL from `NSTemporaryDirectory()`. Slot flags alone are not used to invent
protocol getter names or full declarations.

The ordinary initializer obtains the ApplicationPaths metadata/value buffer
and calls `0x100d99c64` with its indirect result pointer. This recovered
1,556-byte builder constructs the selected base URL, optional log-file URL
and explicit-log flag. Its directory precedence is:

1. If the byte obtained via `0x1005a4e64` equals 1, examine command-line
   arguments for `--user-data-dir=...`. The helper appends `=` to the literal
   prefix, finds the first matching argument, removes the prefix and returns
   a nonempty suffix. The semantic classification of that gate is not yet
   established; this report does not call it a development/release flag.
2. If that route supplies no value, read the selected UserDefaults dependency's
   `stringForSetting` field with constant tag `0x10`. Under the shipped default
   implementation, its key is `customApplicationDataBaseURLPath`. A present
   value constructs a directory URL directly; it is not suffixed with `Arc`.
3. If neither supplies a value, call `0x100d99b20`, whose actual message stub
   selects `URLForDirectory:inDomain:appropriateForURL:create:error:` with
   directory 14, domain 1, appropriate URL null, create true. Installed Apple
   SDK declarations bind those constants to Application Support and user
   domain. Append the bundle-derived name from `0x1005adab8`.

The name helper reads `NSBundle.mainBundle.infoDictionary["CFBundleName"]`
as a String. If unavailable/wrongly typed, it uses the bundle URL, deletes its
extension and takes the last path component. Exact native small-String words
corroborate the `CFBundleName` key. The original DMG's plist supplies the valid
String **`Arc`**, so the selected ordinary fallback appends that name.

`--log-file=...` follows a separate path into `logFileURLOverride` and
`hasExplicitLogFilePath`. It does not replace the base-directory computation.
The ordinary returned ApplicationPaths value still follows the selected
construction/injection premises; static witnesses do not choose runtime
Dependency overrides.

## Exact override-key chain

The builder loads its selected Client closure at offset `0x30`, matching the
retained field metadata for `stringForSetting`, and invokes it with W0=16.
The earlier public default constructor writes code `0x100d92ed4` plus its
context at that offset. The new public adapter is precisely:

```text
0x100d92ed4: ldr x1, [x20, #0x10]
0x100d92ed8: b 0x100d911ec
```

Reader `0x100d911ec` preserves the input in X0 through its call to anonymous
String converter `0x1005aa5e4` at `0x100d91200`, bridges the result, and calls
the concrete `stringForKey:` selector. The selected table halfword is 12 at
`0x1036db430`; target `0x1005aa61c + 12*4 = 0x1005aa64c` loads the literal
at `0x1039d1610` and returns via `0x1005ab65c`. Its length is exactly 32:
`customApplicationDataBaseURLPath`.

This is a selected constant/default-implementation derivation. It does not
supply item 63's global enum-domain proof or show which value any installed
user currently has. The shared helper remains unsuitable for an owner-wide
297-case override from one typed caller.

## Plist and evidence provenance

Only the original DMG's 5,697-byte Info.plist was retrieved through the
existing read-only REA NativeDmgArtifactReader. This supplemental carrier
retrieval is explicitly separate from public analysis. It matched the earlier
extraction manifest's SHA-256
`2b2acc2969fd9cfe09ca8e3219b4ec2614cd2181756a5d29e1006e435da32358`.
The owned image was closed and its helper lineage verified empty; the original
DMG digest remained unchanged. The exact carrier bytes and command provenance
are retained in [plist-carrier.json](arc-base-url-2026-11-21/plist-carrier.json).
No complete app extraction or app execution was needed.

Public `inspect_plist` then decoded that explicit local carrier and returned
`CFBundleName = Arc`, identifier `company.thebrowser.Browser`, version 1.172.1,
build 90370. The complete normalized dictionary matches the exact retained
carrier bytes. The original XML file stays local; its exact bytes are replayable
from the text receipt. No supplemental conclusion was inserted into REA output.

[Capture verification](arc-base-url-2026-11-21/capture-verification.json)
validates all schemas, named contracts, text/structured agreement, canonical
Evidence/bundle membership, target identity, repeated closes and cleanup.
[The fact index](arc-base-url-2026-11-21/fact-index.json) binds selected
instruction/selector/metadata/SDK/plist claims to exact source records.
Three sessions made **163 public calls: 159 successful and four retained
initial admission errors**. The focused profile succeeds throughout. All
three sessions export and close twice with verified empty lineage.

## Remaining boundary

Default directory construction is now traced. Actual runtime dependency
selection, the CLI gate's semantic classification, current overrides, complete
error policy, backup/version/migration rules, fsync/durability and actual
readback remain open. Pseudocode retains Swift ABI/throwing warnings; assembly
anchors carry the selected argument and branch facts. Earlier path-builder
records also show directory checking/creation and their failure path. None is
observed filesystem behavior. Item 63 and the broader Arc feature routes
remain incomplete; no new REA+ defect was established in this follow-up.
