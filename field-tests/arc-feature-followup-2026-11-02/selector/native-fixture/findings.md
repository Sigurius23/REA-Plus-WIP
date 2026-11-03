# Owned nested-enum fixture: bounded non-reproduction

The Arc jump-table/body gap was **not reproduced** in this bounded owned
fixture. This does not establish Arc completeness or justify a new general
REA+ defect claim.

`Fixture.swift` defines four outer payload groups with 40 inner cases each,
returning distinct literal `Foundation.URL` values. The installed Apple Swift
6.3.3 compiler builds the same source with `-O -g -emit-library`, then one
justified adjustment removes `-g` to check that debug information is not the
reason body ranges stay complete. Compiler/source/artifact identities and all
flags are retained in the two build receipts. Both compiled dylibs remain in
owned `/private/tmp`; neither was executed or selected as application code.

Public REA+ Ghidra runs use its **default complete-analysis policy**, with no
`REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS` and no seed file. Both measured outcomes
report `analysis_complete=true; analysis_timed_out=false`.

| Build | Function / reported body | Evidence | Result |
| --- | --- | --- | --- |
| Optimized with debug | `0xc1c..0x5a4f`, contiguous **20,020 bytes** | `ev_a55cd6bd0e5b5d58b1152e37bcd1314eb96a97a983e8f127b8b298498b43dbf7` | Four signed-word tables; every returned target is inside the body. |
| Same source without debug | `0xc24..0x5a57`, contiguous **20,020 bytes** | `ev_dd96b0b8c078d042788aa3fb426bce9c373e14eb92fd8f0ece82cadbe7252902` | Same body-inclusion result for all four tables. |

The debug build's actual public instruction record shows the relevant family:
`ubfx w9,w1,#0x6,#0x2` selects the outer group, then six-bit indexing and
`LDRSW`/base-add/`BR` dispatch select inner cases. This is a related layout to
Arc's byte high-bit split; it is not byte-for-byte the same program or compiler
output. Arc subtracts `0xc0` on the caller's unresolved second-table path;
this fixture masks six bits.

The fixture still reports jump-table sanity/truncation and decompiler warnings.
Its four returned mapping counts are 40, 64, 62 and 62 despite the source's
40 inner cases per group. This check establishes body inclusion only, not exact
source-level case counts, complete type recovery or executable correctness.
No case labels were seeded as independent functions and no body was repaired.

## Capture recovery and verification

The first recorder treated an expected MCP transport constraint as fatal and
closed before export. That exact failed recording and verified cleanup remain
in `public/`. The same debug fixture was recaptured once under `public-export/`
with the refusal treated as nonfatal, followed by a real public export and
explicit close. The no-debug adjustment likewise exports before close under
`public-nodebug/`. Each transport error states the operation completed and its
full Evidence remained in the live ledger; each exported dossier authenticates.

The three retained runs contain **17 public calls / 14 successes / three
expected transport errors**. Their successful replies validate the actual
advertised schemas, named contracts, text/structured equality and canonical
Evidence. Both exported portable bundles authenticate; all three runs report
verified ownership with empty live-descendant snapshots. The recorder failure
is not a product regression or an analysis timeout.

`verification-receipt.json` records body ranges, exact table sources, returned
mapping counts, warnings, compiler identities and run outcomes. The audit can
be repeated from the repository root without launching a provider:

```sh
node field-tests/arc-feature-followup-2026-11-02/selector/native-fixture/verify-recordings.mjs
```

The remaining Arc-specific question is why its bounded partial Program omits
the second dispatch's case code and reports other mapped targets outside its
body. This fixture does not answer that question and does not show that the
same issue survives completed Arc analysis.
