# Swift frame-argument safety repair — 2026-11-22

Continuing Arc item 63 reproduced a prerequisite producer defect: REA+'s
enum-table recovery could retain a saved tag after an unknown call received
its stack address through **X8**, the indirect-result register. The repair is
implemented and verified through the complete native matrix and fixed-Arc
retesting. Item 63 and full Arc remain incomplete.

The owned source-built fixture has a 30-case enum. After its runtime tag is
saved, a helper receives the spill address in X8 and writes 65,536 there.
The linked-byte oracle authenticates that writer and the exact call. The v9
public MCP result nevertheless publishes a 30-case table, claiming unchanged
tag provenance. No fixture was executed: the counterexample is established
from owned source, linked instructions and the incorrect public observation.

Both historical escape detection and post-call spill retention checked only
X0–X7. A shared predicate now includes X0–X8, Swift self/context X20 and Swift
async context X22. These special register roles follow the
[official Swift calling-convention summary](https://github.com/swiftlang/swift/blob/main/docs/ABI/CallingConventionSummary.rst).
A callee-saved register can still carry a call input. X19 is a separate
non-argument control and remains recoverable. The analysis profile advances
to `abi-signed-word-cfg-v10`, so changed proof semantics get a new identity.

The controls cover immediate writes and an address retained before tag
production, then overwritten afterwards. X0 supplies an ordinary argument
negative. The X19 control recovers all 30 cases with CLI/MCP Evidence identity
parity. Seven unsafe controls reject. The completed native suite passes all
**110 cases: 16 positive and 94 negative**, including the existing 102-case
regression set. Its **440 public MCP replies** and **14 CLI/MCP comparisons**
pass, with verified empty owned lineage.

The first v10 qualification also found a stale verifier assertion. Production
retains the full type/value proof once on the table's data source and links
each case to it; the test still expected the full proof on every case. It now
checks the shared proof and each exact tag, word address, target and source
link. Original failed records remain intact. This correction changes the
verifier, not the production Evidence format.

Build, 42 provider tests, fast/docs checks and isolated package verification
pass. The exact original counterexample is retested without changing its
bytes: v9 publishes one unsafe 30-case table; v10 publishes no REA+ Swift-bound
table. The fixed Arc ARM64 input retains the established reducer's **28 case
mappings and 10,072 body bytes**. Its anonymous Setting helper remains
**14 instructions / 56 bytes / zero recovered Swift tables**. These two
sessions have **15/15 successful MCP replies**, final exports, two closes each
and verified empty lineages. The large reducer uses the qualified summary and
retained-parent export route; its source profile is authenticated on the parent,
while the derived view correctly has a null analysis profile.

Read [qualification verification](arc-frame-escape-2026-11-22/qualification-verification.json),
[exact fixture/Arc retest](arc-frame-escape-2026-11-22/retest-verification.json),
[source/hash mappings](arc-frame-escape-2026-11-22/qualification-index.json)
and [historical verification](arc-frame-escape-2026-11-22/history-verification.json).
The expected v9 counterexample and partial first v10 harness run remain intact;
they are not counted as completed successful qualification runs. An initial
offline retest verifier incorrectly assumed a profile on a derived view; its
log is retained and verification now authenticates the exact retained parent.
Binaries, module caches and provider projects are excluded.

This safety repair does not establish typed constructor ownership, closure
code/context origin, a complete symbolic function type, or the actual enum
input contract of Arc's anonymous Setting helper. Item 63 still needs that
invocation-scoped evidence. No global enum type or CFG override is inferred
from a single typed caller. Arc, helpers, shipped scripts, accounts, profiles
and services were not executed or used.
