# Arc keypath return repair and dependency selection — 2026-11-23

Item 69 is repaired and verified. Item 63 advances through the selected
keypath and dependency lookup, but its invocation-domain carrier remains open.
The fixed DMG-derived arm64 input is unchanged: SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`,
80,498,448 bytes. Arc, its helpers, accounts, services and compiled fixture
libraries were not executed.

## Confirmed REA+ defect and repair

An owned Swift literal keypath reproduces a missing return value. Compiler IR
declares and calls `swift_getKeyPath` with two pointer inputs and a pointer
result. The old Ghidra Swift Program instead records a CALL with null output
and reconstructs the pattern address as the keypath stored in a wrapper.
The actual native instructions store the returned X0. The frozen baseline and
source-built controls are retained in `arc-keypath-origin-2026-11-23/fixture/`
and `mcp-fixture-baseline/`.

The existing exact-import owner now has one registry for allocator and keypath
contracts. It reuses the installed Apple C prototype for the supported
libswiftCore import, sets pointer arguments in X0/X1 and pointer result in X0,
and reports `swift-keypath-c-abi-v1` in optional public
`native_api.runtime_call_signatures`. The allocator contract retains its
three-register shape. The analysis profile advances to
`swift-runtime-c-signatures-v2`. Historical omissions remain accepted.

The declared C signature comes from Swift's
[runtime function definitions](https://raw.githubusercontent.com/swiftlang/swift/main/include/swift/Runtime/RuntimeFunctions.def).
This supplies calling-convention information; memory effects remain unknown.
It establishes neither library authenticity nor successful instantiation,
purity, noescape, keypath type/getter identity or a closed dependency origin.

Original imported identity, or an unchanged importer-owned label, must match
the supported library. Mutable display names cannot grant a contract. The
same identity check owns preparation and subsequent observations. Wrong-library
and local namesakes remain unchanged. Six real production-boundary probes
verify the positive case, call-site override, user/imported signature,
renamed external and analyst-created external protections. These probes are
private raw Ghidra diagnostics; the public Evidence is validated separately.

## New Arc evidence

The eight-wrapper candidate initializer at `0x1012a5544` has 118 instructions.
It constructs eight keypaths, calls `Dependency.init` (`0x1006fa228`) with
80-byte output slots, and copies 640 bytes to its incoming X8 result buffer.
The seventh pattern is `0x103788708`, passed at `0x1012a569c`; its returned X0
reaches the wrapper initializer at `0x1012a56c0`. The wrapper stores that
keypath at offset 16. All eight returns are now retained in public analysis.
Assembly and function body are unchanged.

This matches the previously recovered eight-field `BoostsEditor` layout and
its field 6 `_userDefaultsClient` at offset 480. It does **not** prove that
every captured Root came through this candidate initializer, identify its
declaration solely from the embedded source path, or prove that a wrapper
stayed unchanged through all aliases. Those premises remain explicit.

Public byte reads bind the selected pattern:

| Observation | Value |
| --- | --- |
| Root tagged mangled-name reference | `0x103bd65bf`, name at `0x103bd65be` |
| Root descriptor / public name | `0x103d46e58` / `DependencyValues` |
| Leaf tagged mangled-name reference | `0x103bd65f5`, name at `0x103bd65f4` |
| Leaf descriptor | `0x103d648c4`, `UserDefaultsClient` |
| Pattern buffer header | `0x80000018`, 24 component bytes |
| External property slot -> descriptor | `0x104317698` -> `0x10373ccb8` |
| External descriptor header | zero, trivial descriptor |
| Local computed candidate | `0x02c00002` |
| Getter thunk -> implementation | `0x1012b283c` -> `0x1003b5454` |
| Setter thunk -> implementation | `0x1012b2840` -> `0x100ccc400` |

The tagged references are not plain accessor pointers. The full first
symbolic nominal atoms terminate before the following names. Qualified Mach-O
fixup lookup supplies the slot targets; public field queries independently
name the exact indexed descriptors. `DependencyValues` retains two reflected
fields, `cachedValues` and `storage`; their unsupported function-type decoding
remains partial.

The external descriptor must be checked before selecting a local candidate.
The zero header selects the local getter under the normal matching runtime
format. This interpretation follows Swift's
[keypath pattern walker](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/stdlib/public/core/KeyPath.swift)
and [ABI constants](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/stdlib/public/SwiftShims/swift/shims/KeyPath.h).
It is an analyst derivation from public bytes, not a new automatic keypath
facet or an observation of an instantiated runtime object. The pattern's cache
reference is not itself evidence of a live object.

The getter passes exact Client metadata `0x1042c8ac0` and witness table
`0x1045ee8b0` to generic dependency lookup `0x1006fb0c0`. Public conformance
inspection binds that witness to `UserDefaultsClient: TestDependencyKey`,
descriptor `0x10373cca8`; associated `Value` resolves to the same Client
descriptor. A second exact conformance, `0x10373cd38`, binds
`UserDefaultsClient: DependencyKey` to table `0x1042c8348`.

The lookup first checks stored values and dynamic casts. Otherwise it selects
a context from storage or a lazily initialized global. The default/cache path
is `0x1006fbea4` -> callback `0x1006fe650` -> selector `0x1006fc894`.
The callback forwards the captured metadata, witness and context byte. The
selector checks its cache before choosing a witness getter:

| Cache-miss context | Observed selection |
| --- | --- |
| byte 0 | Runtime conformance lookup for `DependencyKey`; slot 2 getter, `0x100d929a0` for the retained static Client conformance |
| byte 1 | `TestDependencyKey` slot 2, `0x100d8c154` |
| other valid context branch | `TestDependencyKey` slot 3, `0x100d8c1dc` |

The slot-2 Test getter also copies 368 bytes from the existing global Client
`0x104702f28`, after the same once initializer `0x100d90ebc`. Its slot-3 getter
constructs a different set of closures. Requirement method names are absent
from these public slots, so branch behavior is retained without inventing them.
Cache hits, explicit overrides, cast outcomes, live state and intervening field
stability remain unresolved. This is a conditional default-target chain,
not proof that the actual selected invocation uses that target.

Generic pseudocode still has unmodeled imported metadata-response signatures
and stack-probe conventions. The branch derivation uses the retained native
instructions. In particular, `swift_getAssociatedTypeWitness` returns a Swift
metadata response; it must not acquire this repair's C pointer-result contract.
The [runtime declaration](https://raw.githubusercontent.com/swiftlang/swift/main/include/swift/Runtime/RuntimeFunctions.def)
distinguishes those ABIs. No new general metadata-response support is claimed.

## Verification and limits

`qualification-verification.json` validates frozen runtime/source hashes,
advertised JSON Schema 2020-12 inputs/outputs, named contracts, text/structured
parity, public Evidence identity, subject digests and exported records.

- 86 affected source tests; build, fast, documentation and installed-package
  checks pass.
- 94 successful final-runtime MCP calls across fixtures and Arc. All qualified
  sessions export, close twice and have verified empty owned lineages.
- Four exact whole-Evidence CLI/MCP comparisons, six production-boundary
  probes, and the stock Swift-error coexistence lane pass. The latter adds its
  own exact CLI/MCP comparison and three probes.
- All 23 allocator results remain corrected. Arc's reducer retains the same
  28 case/target mappings and 10,072 body bytes. The Setting helper stays at
  14 instructions / 56 bytes / zero recovered tables; selected X0 stays 49.
- Twelve historical snapshots authenticate. Enum recovery and Swift-error
  implementation sources are unchanged; no new 110-case enum-matrix run is
  claimed.

All retained research attempts total 139 calls: 137 successes and two sandbox
Ghidra launch failures. The initial recorder has valid exported observations
but correctly remains failed/partial after its continuation expired. The two
sandbox failures could not inspect process lineage; they establish no provider
success or cleanup proof. Fresh permitted runs completed with empty lineages.
The first stock error-verifier attempt lacked the fixture in the frozen
package; the completed run uses the source package with every production file
authenticated against the frozen runtime. A verifier label typo was corrected;
its failed log remains. None of these harness failures is reported as a new
REA+ defect.

Continue item 63 at generic wrapper/type representation, candidate constructor
ownership and relevant unchanged keypath/Client fields. Then preserve unchanged
argument forwarding and implement the observation-only invocation-domain
carrier. Keep the valid Swift input and default-selection assumptions explicit;
do not install a helper-wide 297-case type/CFG override from this one context.
Broader browser/apply/UI routes, higher restore/writeback, real readback,
durability and pixels remain outside this checkpoint.
