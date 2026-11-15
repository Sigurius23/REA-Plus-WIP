# Bounded Darwin probe call effects, v8

The static owned-fixture proof passed **67 distinct cases: seven positives and
60 rejections, with five public CLI/MCP comparisons**. Ghidra 12.1.4 used JDK 27
on macOS ARM64. Each contributing run finished with verified empty owned
descendants. No supplied application or library code was executed.

The implementation is in commit `5628ef81ce5144c9af3bdc11b1e3647a9035c368`.
The verified Java SHA-256 is
`26bd8cb5419e36e31ab1ef6e4d71b72a15d6b701a80c9b34218fc374019e4039`.
The profile identifies `abi-signed-word-cfg-v8` and the normal-return ABI
assumption `trusted-darwin-arm64-chkstk-v1`. Historical authentication uses
captured source snapshots and the Git-authenticated frozen v8 runtime, rather
than the working tree, where v9 development has begun.

The summary admits the exact imported `___chkstk_darwin` symbol only after an
applied chained binding, retained library ordinal, original Mach-O load-command
order, full system install name, loaded pointer and imported external agree.
Direct import stubs and the bounded adjacent X16 GOT call sequence are covered.
Ghidra's DEFAULT-source placeholder Function is accepted only when its thunk
reaches that canonical imported external. Local/lookalike names, foreign
libraries, conflicting same-name library ordinals, classic bindings and changed
targets receive no special effects.

On normal return the policy preserves X2, X8, X12 and SP plus ordinary
callee-saved handling. Other volatile registers and flags remain unknown. The
possible 16-byte scratch write below incoming SP is modeled; unknown SP,
retired frames, escapes, overlapping writes and unsupported calls fail closed.
This neither allocates storage nor proves nonfaulting execution, interposition
absence or Arc's runtime binding. It does not recover Arc's dynamic-stack
inline-SIMD dispatch. The independent Arc retest is recorded separately.

The proof combined three runs with unchanged verified Java: focused probe
23, baseline prefix seven, then the remaining 37 baseline cases. The prefix
stopped on a **330-second Ghidra startup timeout** while querying
`projection_unknown_field_flags`; stdout was empty and diagnostics contained
only the JVM banner/options. Its failure, close reply and verified empty
lineage remain retained. The resumed run explicitly skipped the seven completed
labels and passed the remaining 37. The interrupted prefix is not represented
as an all-green run.

An earlier native attempt passed the direct positive but rejected the GOT
positive. A read-only loaded-Program diagnostic showed the imported data
placeholder had become a DEFAULT Function thunk. The corrected canonical
thunk binding then passed both positives and all rejection cases. The earlier
source hash, public replies and diagnostics remain retained; this attempt does
not contribute to the final 67 cases. The first supplemental diagnostic also
preserves its invalid hidden-project-path setup failure.

Java compilation, 42 focused source tests, typecheck, formatting and lint passed
(lint with warnings). Root also recorded passing final fast, built-documentation
and package checks. These are separate from the real native-case proof.

The [retention index](darwin-probe-profile-2026-11-14/retention-index.json)
links captured owned sources, assembly/oracles, exact raw public replies,
standalone canonical Evidence and per-run bundles. Bundles were assembled
offline from captured replies; no public bundle-export call is claimed. One
identical advertised catalog is retained once by digest. Executables, compiled
modules/classes, module caches and Ghidra projects are excluded.

The [canonical audit](darwin-probe-profile-2026-11-14/evidence-audit.json)
authenticates 144 standalone records and raw Evidence representations, including
six historical CLI captures, representing 138 unique Evidence IDs across four
bundles. The final three proof runs account for five CLI comparisons; the sixth
belongs to the earlier failed attempt. The
[text manifest](darwin-probe-profile-2026-11-14/text-manifest.json) hashes every
retained text file and this report. The
[combined native receipt](darwin-probe-profile-2026-11-14/retained/checks/combined-native-verification-2026-11-15.json)
preserves the exact per-run counts, hashes and resume caveat.
