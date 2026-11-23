# Arc generic member templates — 2026-11-23

Item 72 is implemented and verified. REA+ now retains the wrapper's encoded
`keyPath` declaration as an external symbolic application with exact
`DependencyValues` and owner-parameter identities. Joining it to the selected
Root application yields a declaration-only UserDefaultsClient substitution.
Item 63 remains open for actual instance/stability and invocation mapping.

The fixed arm64 input remains 80,498,448 bytes, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
Arc, helpers, accounts/services and fixture libraries were not executed.

## Capability and interpretation boundary

The previous public reader inventories Dependency's fields and Root's concrete
application but leaves its generic member type uninterpreted. The baseline
reproduces this on both Arc and an owned source-built Swift fixture.

Optional `generic_member_type` now represents a complete depth-zero generic
parameter or flat external symbolic application. The shared signature reader
checks the original top-level version-zero struct, module context, ordinary key
parameters, zero requirements and zero pack flags. Each parameter index is
range-checked and retains its exact descriptor-byte location. The bounded
operator cursor handles `x`, `qz`, `q_` and numeric depth-zero indices, embedded
symbolic NUL bytes and alignment padding. Nested contexts/types, associated
types, constrained owners, packs and trailing operators remain unsupported.
The format follows the Swift [mangling grammar](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/docs/ABI/Mangling.rst).

An external application retains encoded argument syntax, symbol, library,
weak flag, addend, source and indirect slot. Its mandatory
`signature_validation: unresolved-external` means that external descriptor
kind, arity, constraints, authenticity and actual runtime binding were not
validated. No import name grants those facts. The foreign-import identity
control verifies this: a deliberately renamed `FakeMap` reference remains an
unresolved external application, without becoming a recognized KeyPath.

The existing function, concrete application and new member-template records
are mutually exclusive in both the named domain contract and advertised
JSON Schema. Historical records can omit the new optional field. Partial
attempts retain raw manglings and diagnostics; the aggregate record budget
is charged before signature/parameter/argument growth. No generic instance
layout, native ABI, live value or invocation domain is created.

## Arc result

The selected generic owner remains Dependency `0x103d46d5c`, signature
`0x103d46d78`, parameter byte `0x103d46d88`. Its keyPath field is ordinal 1,
raw mangling `0293d76a007902cdc26900784700` at `0x103b91e3c`.
The new record retains:

| Component | Observed declaration identity |
| --- | --- |
| External base | `_$ss7KeyPathCMn`, `/usr/lib/swift/libswiftCore.dylib`, nonweak, addend 0 |
| Symbolic reference source | `0x103b91e3d` |
| Import slot | `0x10423f5d0` |
| First argument | DependencyValues descriptor `0x103d46e58` |
| Second argument | Depth 0, index 0, source `0x103d46d88` |
| External signature validation | Unresolved |

Root field 6's existing application names the exact same owner and signature
and supplies UserDefaultsClient `0x103d648c4` as argument 0.
`declaration-substitution.json` checks both public Evidence identities, joins
those exact descriptors/signatures and substitutes that argument in a separate
analyst derivation. Under the standard Swift import-binding premise, this is
`KeyPath<DependencyValues, UserDefaultsClient>`; the standard [KeyPath declaration](https://raw.githubusercontent.com/swiftlang/swift/swift-5.9-RELEASE/stdlib/public/core/KeyPath.swift)
identifies its root/value parameters. The report does not assert that the
external runtime descriptor was loaded or authenticated. REA+ itself does not
yet perform automatic member substitution.

This declaration relationship agrees with the separately retained selected
keypath pattern root/leaf interpretation from item 69. It does not prove that
the actual captured wrapper contains that pattern/object or that its fields
are stable through intervening calls/aliases. Root remains 640 bytes with
physical offsets `0,80,...,560`; its seven supported concrete applications,
Client closure declarations and enum case declarations are unchanged. The
physical metadata reader still independently refuses generic owners.

## Qualification

The source-built fixture uses Swift 6.3.3, optimized whole-module arm64 macOS
14 output. It has a generic KeyPath field, bare parameters 0/1/2, two-parameter
application, and constrained/nested/same-name foreign-owner boundaries. The
qualified library is 45,416 bytes, SHA-256
`ad0aa83ea40f64d6fd082381fc79c420d6bdb40298d25265ce8cdea34d4cd8ad`.
Its source, compiler IR, symbols, commands and digest receipts are retained;
the binary and provider projects remain ignored.

- 88 source tests, build, fast, docs and installed-package checks pass.
- 41 final-runtime public MCP calls plus 18 baseline calls pass, with actual
  advertised schemas, named contracts, canonical Evidence, text/structure,
  input identity and exact exported-record checks.
- Four exact whole-Evidence CLI/MCP comparisons pass: owned template, Arc
  template, Root layout and generic-layout refusal. Contradictory function/
  template and concrete-application/template outputs fail both schema forms.
- Six owned template fields decode. Constrained, nested and same-name foreign
  owners remain raw/unsupported, and aggregate budget exhaustion stays partial.
- Three explicit malformed derivatives reject an out-of-range parameter,
  missing closer and nonordinary parameter. A fourth identity derivative
  preserves the foreign import with external validation unresolved. These
  deliberately changed files are not compiler output or executed programs.
- Fifteen earlier snapshots authenticate, using original committed versions
  of intentionally updated living files. All qualified fixture, MCP, CLI and
  package verifier lineages are verified empty.

The rebuilt runtime is frozen at
`rea-local/.cache/arc-runtime-member-templates-2026-11-23` (1,872 files),
with six source/document hashes. The native bridge, enum recovery, runtime-call
registry, Ghidra analysis profile and physical metadata reader are unchanged.
The new public metadata checks use the native Apple byte reader in
Ghidra-selected sessions; no new Ghidra decompilation or full enum matrix is
claimed. `qualification-verification.json`, `fact-index.json` and the snapshot
manifest identify the retained receipts.

Initial development failures remain recorded: the first fixture build could
not inspect process lineage inside the sandbox; its receipts are separate
from the final qualified build. Two nullable-boundary TypeScript errors were
fixed before freezing. The first control preparation assumed one symbol-string
copy, but there are two (dyld import and symbol table); both are now explicitly
modified and checked. The premature control driver failed before opening any
target. These harness/development failures are not new Arc behavior findings.

## Remaining work

Continue item 63 at the actual constructor/captured-wrapper relation and
relevant keypath/Client field stability. The declaration type relationship is
now available; do not repeat the same identity or default-forwarding studies.
Automatic member substitution is not implemented. A first-class observation-only
invocation domain/mapping carrier still needs qualification without installing
a helper-global 297-case bound. Higher restore caller/writeback, complete
apply/UI/browser coverage and runtime I/O/durability remain separate open work.
