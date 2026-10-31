# HeyClicky item 37 fix verification — 2026-10-30

**Item 37 is fixed and verified.** REA+ now recovers HeyClicky's 30-case notch
sizing dispatch from its own Ghidra analysis. It restores the case blocks to
the owning function and returns their mappings with explicit Swift ABI proof.
The whole app investigation remains incomplete.

The [machine-readable receipt](heyclicky-37-fix-verification-2026-10-30.json)
records source/input hashes, profiles, public calls, schemas, test results,
retained export identity, failure history and cleanup. Changes remain local,
uncommitted and unpushed. No app or fixture code was executed in this fix stage.

## Producing capability

The new Ghidra pass runs before queries are served on supported non-Windows
AArch64 little-endian Mach-O inputs. It follows direct Swift type records to a
non-generic enum descriptor, checks its reflection count/stride and payload
records, verifies its cached singleton accessor and exact `libswiftCore.dylib`
helper imports, and proves that the unchanged returned tag reaches the index.
The loaded cache address must equal the descriptor's initialization-cache
reference. These structures follow the
[Swift ABI metadata definitions](https://raw.githubusercontent.com/swiftlang/swift/main/include/swift/ABI/Metadata.h);
the local compiler fixtures independently verify the emitted layout and code.

It decodes signed 32-bit relative entries without requiring Ghidra to have
already found a jump table. It checks initialized bytes, aligned executable
destinations and independent function ownership, then transactionally adds
computed edges, disassembles the destinations and extends the existing body.
An automatically generated Ghidra switch override makes the cases available to
decompilation. No executable bytes or user application data are changed.

The public native API has a distinct `rea-swift-enum-signed-word-table` source.
Its evidence gives descriptor, cache, accessor, call and table addresses, case
tags and optional reflection names. Ghidra's “manually overridden” wording in
pseudocode describes this generated analysis metadata, not a human-supplied
mapping. The profile commits `abi-signed-word-cfg-v1` so older snapshots cannot
replay as the new recovery. Windows P0 retains its mutation boundary.

Unsupported/ambiguous layouts and exhausted budgets remain unrecovered. The
budgets are 4,096 cases, 100,000 CFG/reaching-definition work units per candidate
function and 256 nested queries. The proof assumes normal AArch64 ABI behavior
and private, non-escaped frame storage. It does not establish state reachability
or every high-level meaning of a case.

## Independent fixture verification

`npm run verify:ghidra:swift-enum` builds source-owned resilient-payload enums
with **30 and 12 cases**. A separate Mach-O/instruction oracle verifies the
compiler's actual unguarded runtime-tag plus `LDRSW` shape and each case callee.

- Both positive variants pass. The 30-case body grows from **176 to 1,320
  bytes**; the 12-case body is **672 bytes**. All case blocks and callees appear
  in the owning function and pseudocode.
- **16 negative variants** reject changed indices, mismatched counts/strides,
  wrong accessors/metadata calls, both cache-pointer mismatches, partial tag
  stores, escaped frame arguments (including a predecessor laid out after the
  dispatch), wide tag copies without proven zero-extension, unresolved/wrong-library imports, misaligned
  or non-code destinations, and short initialized table extents.
- **72 real MCP calls succeed**, with advertised schemas and canonical contracts
  validated. The 30-case CLI and MCP results have the **exact same Evidence ID**.
  Procedure metadata is checked before decompilation, so repair is not a lazy
  query side effect.
- All raw reply hashes and text/structured agreements match. Fixture bytes stay
  unchanged, and final token-verified lineage has no live descendants.

The small five-case trial emitted a comparison chain, so the independent oracle
correctly rejected it as a different shape. An earlier full suite's analysis
cases passed but its final lineage check was unavailable because an outer
`caffeinate` monitor lacked the run token. That run remains a failed verification;
the final suite runs without that wrapper and passes its cleanup checks.

The late-predecessor negative exposed a separate rejection-rule error during
review: physical address order is not execution order. The producer now walks
actual CFG ancestors. Register-width review also preserves unknown upper bits
of a 32-bit return until an explicit W-register write clears them. The final
18-variant suite verifies both refinements.

## HeyClicky retest through REA+

The unchanged target is **1.1.1 (66)**, original executable SHA-256
`764a68a80f53de64a0e48a509d5a98737994f93e0888605e2de85b4028f3cb17`.
The existing 55,971,232-byte arm64 input has SHA-256
`bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911`.
The 219 existing function seeds retain their original caller-assertion scope;
case counts, names, mappings and switch edges are recovered by REA+ itself.

First overview takes **92,046 ms**. Before decompilation, public procedure
metadata reports the sizing routine at `0x101319e48` as one **15,380-byte** body,
`0x101319e48..0x10131da5b`. The dossier contains **313 blocks** and the native API
returns all **30** case mappings at dispatch `0x10131a324`. They match the earlier
independent source-byte oracle. The missing-jump-table warning is gone; the
complete switch and case code now appear in pseudocode.

Native API Evidence:
`ev_79efeb4feb8108ca083e2a927e1e47f69ea80ad7b0fb190eed414c47b9640997`.
Complete direct-analysis Evidence:
`ev_bc6396b380ddabe9102f55693b15b02115facdf99db95ff294202391d6fc512c`.

The complete function exceeds MCP's inline receive budget. REA+ retains it and
returns a truthful transport constraint; its focused native-API view and public
`export_evidence_bundle` provide the result. The **10,141,215-byte**, 10-record
export authenticates successfully, including the exact referenced analysis.
Its API/body agree with the focused views. There were **11 public calls: ten
successes and one expected transport constraint**, not an analysis failure.
Public close takes **872 ms**; the driver exits 0; both inputs remain unchanged;
final token-verified lineage is empty.

Whole-Program auto-analysis still reports **incomplete/timed out at 60 seconds**,
and high-p-code output remains bounded. The repaired function's case coverage
does not complete all width/height decisions, animation, state reachability or
the rest of the app's features. Swift calling-convention/type reconstruction
warnings remain distinct from the instruction/metadata proof of these mappings.

## Workflow and repository checks

The authored REA+ skill now directs tool evaluations through owned reproduction,
producer correction and public CLI/MCP verification. Manual actions, external
parsers and UI tools stay supplemental and cannot count as REA+ recovery. The
native guide also explains retained export before closing a large-result
session. No live UI check was needed or performed for this correction.

**50 source tests** pass. `npm run check` passes types, lint, formatting, unused
code, metadata and architecture guards across 1,516 source files. Build and
documentation checks pass; duplication remains **2.49%**. The package file plan
includes the new helper. The earlier full repository gate predates items 36/37;
it was not rerun. Fresh real-provider coverage here is macOS arm64 with Ghidra
12.1.4, JDK 27 and Swift 6.3.3; no new Windows/Linux provider coverage is claimed.
