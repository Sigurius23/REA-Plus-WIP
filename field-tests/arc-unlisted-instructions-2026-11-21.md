# Arc: selected storage path and detached instruction decoding

REA+ now inspects valid unlisted Ghidra instruction bytes without changing the
analysis database. This closes item 65. The selected Arc local-store filename
is **`StorableBoostsData.json`**. Its base directory and item 63's automatic
context-scoped enum dispatch remain open; full Arc analysis is not complete.

## Identity and scope

Arc 1.172.1/build 90370, original DMG SHA-256
`d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778`.
Selected immutable ARM64 slice: 80,498,448 bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

No Arc executable/helper/script, owned fixture library, browser profile,
account or service was used at runtime. Owned source fixtures were compiled
and inspected statically. Ghidra 12.1.4/JDK 27 used the unchanged caller-seeded
2,463-function profile, one-second bounded autoanalysis. Missing references,
procedures and types in this stable partial Program remain unknown.

The [frozen runtime manifest](arc-typed-dispatch-2026-11-21/runtime-manifest.json)
binds 1,869 runtime files and exact edited producer/contract/CLI sources to
parent checkpoint `d647436b459d46749f852149933b45e82f7b5e2f`. Earlier runtimes,
reviews and captures remain unchanged. The bridge instruction probe changed;
`ReaGhidraSwiftEnumSwitches.java` and other native recovery helpers did not.

## Actual gap and repair

The selected switch interiors at `0x1005ab4e8` and `0x100d98aa0` have executable
bytes but no Listing instructions. The original instruction probe therefore
returned undecodable; admitting either interior as a standalone procedure is
also unjustified. The new explicit `decode_unlisted: true` argument (CLI
`--decode-unlisted`) decodes a detached instruction using the Program's
language/context. Omission or false preserves Listing-only behavior.

Results expose `decode_source` (`listing`, `unlisted_program_bytes`, or null)
and `references_available`. Detached direct encoded flow/p-code is labeled
separately. Its outgoing analyzed references are unavailable; an empty array
is not evidence of their absence. Existing incoming ReferenceManager
observations stay separate. Older Evidence can omit the new output fields.

The operation rejects uninitialized/nonexecutable memory, alignment failures,
defined instruction/data overlaps and instructions crossing a memory block.
It applies no instructions, functions, references or CFG edges. It does not
prove reachability, a selected runtime CPU mode or an exhaustive switch domain.
`resolve_native_call_targets` does not accept the new argument.

## Arc selected-path observations

The typed StorableBoostsData factory `0x10118c418` obtains a generic dependency
value, passes tag `0x32` to `0x100d989e4` and uses its URL result for the generic
store constructor. Exact symbolic references in the factory descriptor
`0x10377f2e0` resolve `Dependency<ApplicationPaths>`: descriptor identities
`0x103d46d5c` and `0x103d648ec`. Reflected ApplicationPaths fields are `baseURL`,
`hasExplicitLogFilePath` and `logFileURLOverride`. This is a separate dependency
from the earlier UserDefaultsClient; their equal-layout or anonymous getters
cannot substitute for exact identity.

The location helper masks to 8 bits and loads an unsigned halfword. The selected
word at `0x10373d094` is 4, giving `0x100d98a90 + 4*4 = 0x100d98aa0`.
The public detached instructions now establish this selected sequence:

| Address | Selected effect |
| --- | --- |
| `0x100d98aa0..aa8` | Load literal address `0x1039ed1d0`, branch to `0x100d98ad0`. |
| `0x100d98ad0..ae0` | Construct Swift String length 23, branch to `0x100d98f68`. |
| `0x100d98f68..f8c` | Complete String words, restore original result pointer, set flag 0, tail-branch to `0x100d98fd0`. |

Public bytes at `0x1039ed1d0` are exactly `StorableBoostsData.json`. The selected
Swift String words are X0=`0xd000000000000017`, X1=`0x80000001039ed1b0`.
The path builder copies its supplied URL, appends the nonempty filename, and
with flag 0 obtains `deletingLastPathComponent()` for the directory check.
Its actual message stubs load `defaultManager`,
`fileExistsAtPath:isDirectory:` (null isDirectory pointer), and
`createDirectoryAtURL:withIntermediateDirectories:attributes:error:`
(intermediates 1, attributes null). Their tail target is `_objc_msgSend`.
Directory creation failure converts the NSError, constructs a message and
calls assertion failure for `ApplicationPaths/ApplicationPaths.swift`, line
383, followed by BRK. Assembly controls this account; pseudocode retains its
explicit Swift ABI/throwing uncertainties.

The supplied/default/injected ApplicationPaths value and its `baseURL`
construction are not yet traced. **Do not turn the filename into a full
absolute path.** This static code does not prove any directory was accessed,
created, persisted or read back. Backup, migration, durability, active
injection and full feature behavior remain unresolved.

The selected Setting branch also publicly corroborates
`hasDismissedBoostsInterstitial`: literal `0x1039d11b0`, return tail
`0x1005ab7c8`, length 30. Adjacent instructions captured past unconditional
branches are bounded byte observations, not additional executed steps.

Key records are in [mcp-byte/](arc-typed-dispatch-2026-11-21/mcp-byte/):
`storage-selected-table-word`, `storage-path-component`,
`storage-path-builder-read_function_instructions`, `path-selector-*`,
`storage-factory-dependency-mangle`, `dependency-symbolic-slot-*`,
`dependency-type-name-*`, and `application-paths-*` Evidence files.
The [verification receipt](arc-typed-dispatch-2026-11-21/retest-verification.json)
binds exact captures and original selected instruction bytes.

## Item 63: counterexample and next representation

The [owned compiler controls](arc-typed-dispatch-2026-11-21/fixture/README.md)
include a typed 297-case closure, an Arc-like boxed capture, an unchecked
UInt16 input and a distinct same-name Foreign enum. Swift merges their
constructors/adapters/readers/converter implementations in the adversarial
build while preserving different metadata field types. Shared code, table
bytes, displayed names or a typed caller cannot globally constrain every
caller of that helper to the Primary enum's 297 values.

The [independent design review](arc-typed-dispatch-2026-11-21/typed-input-design-review.md)
therefore recommends an **observation-only typed invocation context**. The
current recovery installs owner-wide JumpTable/CFG overrides; a limitation
string cannot make those mutations conditional. A new context must bind the
exact typed buffer, full closure input type/ABI, nominal enum descriptor,
code/context origin, unchanged argument flow, domain, mappings and named
validity/default-selection assumptions. Partial chains must retain missing
facts. The existing mask admits 65,536 values; it does not establish 297.

The new public typed-root observations corroborate the exact Client VWT:
wrapper `0x100cce81c` binds metadata `0x1042c8ac0`, loads VWT `0x1042c8a58`,
and calls slot +16=`0x100d97b04`. Under normal Swift VWT ABI and a recursively
valid source premise at that exact operation, the selected stack source is a
typed Client snapshot. This is not a proof of the constructor's declaration,
copy purity, origin across unknown writes or active runtime default selection.
The keypath route still needs its exact Value identity. No global halfword
repair was added. The emulator environment previously named in notes is no
longer present; no emulator run or dependency installation was performed.

## Qualification and retained failures

- 43 focused tests across two files pass; fast typecheck/lint, cached build,
  docs and complete package verification pass. Package discovery retains 205
  tools; its owned lineage is verified empty.
- Real owned ARM64/x86-64 native fixtures: 44 public MCP calls, 40 successful
  and four expected input rejections; two exact CLI/MCP comparisons. They
  check MOV/RET/CALL/JMP, old defaults, direct-flow provenance, existing code,
  interior/data/overlap/alignment/memory/block boundaries, schema rejection,
  unchanged function bodies and repeated close. No fixture was executed.
- Current Arc decoder session: **137/137** replies succeed. Earlier typed-root
  session: **20 calls, 18 successful, two retained admission errors** for the
  unseeded copy witness. Both export, explicitly close twice and verify empty
  process lineage. Total Arc calls: **157, 155 successful, two errors**.
- The selected Setting body remains 14 instructions/56 bytes. Both interior
  addresses are still undecodable with default Listing-only inspection after
  opt-in reads. Selected decoded instructions match immutable original bytes.
- The first native lane exposed an exact-key bridge validation mistake; it
  was fixed before final qualification. The second lane's x86 truncation
  fixture still had mapped padding, so its bytes validly decoded SLDT. The
  final fixture puts the incomplete encoding at the actual executable block
  end. Failed attempts and cleanup receipts remain retained; only
  `byte-qualification-v3` counts as the passing native matrix.

The earlier 102-case Swift enum-recovery matrix was not repeated: that producer
class is unchanged. The changed instruction bridge has the new real-provider
qualification above. Current byte decoding is qualified for Ghidra ARM64 and
x86-64; other provider/language combinations are not newly established.
