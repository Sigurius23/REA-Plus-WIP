# Typed blob text and CLI decoder selection — 2026-11-23

Items 73 and 74 are repaired. Declared CBOR/MessagePack UTF-8 strings now retain
valid control characters, and the CLI selects a blob decoder with
`--blob-format` independently of its global output `--format`. MCP/domain
input `format` is unchanged.

## Original failures and repairs

The preceding Arc producer study selected the original 17 bytes at
`0x103fc3ba0`: `performSelector:` followed by NUL. That particular range is
also a complete CBOR text item, whose decoded value is `erformSelector:` plus
NUL. Auto-detection ambiguity is expected; it must not be confused with C-string
semantics. The separate exact 16-byte read in the Arc checkpoint establishes
the Objective-C selector.

The defect was inside typed text decoding: CBOR and MessagePack used the same
printable-only heuristic as untyped bytes. Valid UTF-8 containing NUL, Escape
or DEL became `str-bytes`, disappeared from the strings view, and lost the
format's declared text interpretation. Owned definite/indefinite CBOR and
MessagePack fixtures reproduce this through public MCP, independently of Arc.

`BlobTree.utf8Text` now performs strict UTF-8 decoding with BOM preservation.
Typed CBOR/MessagePack producers use it. A separate private printable-text
heuristic remains the owner of untyped-byte interpretation. Invalid UTF-8
still retains original hex as `str-bytes`; CBOR/MessagePack byte fields and
schema-less protobuf bytes keep their previous distinctions. No replacement
characters or text normalization are introduced.

Full CLI parity then exposed a second defect: the documented
`inspect-data-blob PATH --format cbor` is consumed by Incur's global output
formatter, which accepts output formats rather than blob decoders and rejects
`cbor`. The owning command now exposes the distinct `--blob-format` option and
maps it to the existing workflow input. The data-blob guide is corrected. A
compiled CLI regression verifies forced CBOR selection with both `--json` and
`--format json`. One canonical decoder flag is advertised.

## Public qualification

Four immutable MCP captures retain 64 successful calls: 16 baseline, 32 across
two preliminary fixed runtime snapshots, and 16 on the final delivery runtime.
Their 60 Evidence replies validate named contracts and the actual advertised
SDK-converted schemas; final bundles retain every reply. The original baseline
captures and unsuccessful CLI harness attempts are unchanged.

The final reader retains the complete owned control/Unicode text in tree and
strings views for all three typed encodings. Four malformed/untyped cases have
exactly unchanged Evidence. The original Arc range now yields the valid
NUL-containing CBOR text rather than an empty strings page; it still reports
CBOR, without relabeling that interpretation as an Objective-C selector.
Four full CLI/MCP Evidence pairs match, including forced text decoding,
malformed UTF-8 and the original Arc range.

The final immutable runtime contains 1,881 files and seven current source
hashes. Verification also checks all three preceding runtime snapshots, for
7,524 runtime-file checks total. Twenty-one earlier Arc snapshots authenticate;
new living documentation is checked at each preceding commit. Source changes
are confined to three blob producer files, the blob CLI command, two boundary
test files and the blob guide.

Seventeen compiled boundary tests pass; four optional external-tool checks are
skipped because those external tools were not configured. Build, fast
checks, generated-doc checks and package verification pass. Owned MCP, CLI and
package process-lineage receipts are empty. No Arc process, helper, shipped
JavaScript, profile, account, UI or service was accessed.

## Verification recovery

`verification-recovery.json` and the original logs retain these problems:

- The first test command used the source-only lane for a compiled boundary
  test. The focused boundary lane ran the actual tests.
- Adding cases exceeded a lint limit on one describe callback. The cases now
  form their own semantic test group; final typecheck/lint pass.
- One package attempt met an artifact lock, and its sandboxed retry could not
  reach npm. Sequential verification with approved access runs the pinned
  `skills@1.7.2` check inside its owned temporary workspace.
- The first CLI verifier used a JSON positional argument rather than the
  documented path/options form. Correcting that exposed the real output-format
  collision. An initial flag spelling assumption also failed the compiled
  regression; the final canonical flag passes both JSON-output variants.

These harness failures are preserved, rather than reported as successful
qualification. The second successful package run verifies the final CLI
repair; the earlier successful package run predates that repair.

## Remaining Arc work

The suite/context/store findings in the preceding checkpoint remain intact.
Actual Client/cache selection at the selected indirect closure call, relevant
instance and copy stability, a qualified typed invocation join, preference
I/O/durability and broader browser features remain open. The Client unknown's
latest retained revision is still open at revision 2. This blob repair does not
resolve it or claim full Arc coverage.
