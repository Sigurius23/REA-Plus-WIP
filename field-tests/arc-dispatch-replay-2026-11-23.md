# Arc selected helper output replay — 2026-11-23

REA+ now has complete **conditional function replays** for the two selected
preference-key paths. This supplements the new selected-index dispatch primitive;
it does not identify the Client closure invoked by Arc's actual BLR X23.

No production code changed after `b3acb5f00`. The frozen runtime and 25 source
hashes from the [dispatch checkpoint](arc-table-dispatch-2026-11-23.md) remain
unchanged. Arc was not launched as a host program; no profile, UI, helper,
shipped JavaScript or service was used. Machine instructions ran only inside
the existing bounded emulator capability, with explicit code/data/register
inputs and no host/import forwarding.

## Setup and bounds

The earlier temporary emulator environment no longer existed. An isolated
project-cache Python environment now supplies exactly Unicorn 2.1.2 and
Capstone 5.0.6; no system interpreter or installed application was changed.
Unicorn's native library was built for this Mac. The installer log, version
receipt and each replay's interpreter/native-library digests are retained.
This is a test environment supplied through `REA_UNICORN_PYTHON`, not an
automatic dependency installer added to REA+.

Source-owned assembly controls were replayed first. Inputs 0 and 1 return X0=10
and X0=20 at the outer return boundary, agreeing with the fixture source.
For Arc, the prior public table observation supplies four exact read-only
bytes for indices 49/50 at `0x1036db472`. The first request explicitly admits
4,096 original code bytes starting at helper `0x1005aa5e4`. Other initial
registers use the emulator's recorded zero defaults; no stack, object, runtime,
TLS or imported-call stub is synthesized.

Both initial Arc paths reached their predicted table targets, then stopped
before fetching shared code outside that selected range: `0x1005ab7c8` and
`0x1005ab800`. These are successful partial observations, not product failures.
The completed requests additionally admit only 128 original bytes at
`0x1005ab7c8`, covering those observed tails. Every executed instruction is
verified against the explicit original file ranges. The first boundary-stop
captures remain intact.

## Results

Both completed Arc paths reach `function_return` before caller transfer, after
22 instruction entries. Source artifact SHA-256 remains
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

| Explicit X0 input | Final X0 | Final X1 | Return boundary | Associated literal bytes |
| --- | --- | --- | --- | --- |
| 49 | `0xd00000000000001e` | `0x80000001039d1190` | `0x1005ab7dc` | `hasDismissedBoostsInterstitial` (30 bytes) |
| 50 | `0xd00000000000001b` | `0x80000001039d1170` | `0x1005ab814` | `hasDismissedJSWarningBanner` (27 bytes) |

The earlier bounded states retain X8=`0x1039d11b0` / `0x1039d1190` immediately
before their shared tails. The completed return X1 is exactly
`(that address - 32) | (1 << 63)`. Separate public `inspect_data_blob` calls
read the corresponding original literal ranges, with complete artifact hashes.
The verifier binds the selected range, byte count and string to those returned
words. The engine itself reports registers, coverage and stop reasons; it does
not supply a Swift return-type interpretation. Associating these words with
Swift string keys is an analyst derivation from the executed code and captured
literal bytes under the stated preferred mapping, distinct from observed app
behavior or a proof of the indirect callee.

Complete replay Evidence:

- 49: [ev_f494ffbda8f84bfe79e7a950908b5ea39161c598364ec96ce2123bfd8addc6bc](arc-dispatch-replay-2026-11-23/mcp-complete/arc-49.evidence.json).
- 50: [ev_273943762475fc65560032924f8783649d42aaca1a9924f94a27a719b6561b14](arc-dispatch-replay-2026-11-23/mcp-complete/arc-50.evidence.json).

Literal Evidence:

- 49: [ev_3ae95fd2b2a4e9d91f55a1332ab74f4a8de32f56fe6ddb44d9d40ad763a5aba4](arc-dispatch-replay-2026-11-23/mcp-literals/literal-49.evidence.json).
- 50: [ev_8634f07e2bff23feb7b8071a99dc154c4e9c024cedac6345a094b0e4996f0e31](arc-dispatch-replay-2026-11-23/mcp-literals/literal-50.evidence.json).

## Verification and limits

[Qualification](arc-dispatch-replay-2026-11-23/qualification-verification.json)
checks 13 successful public MCP calls across three completed sessions, ten
Evidence records including the original partial results, all source instruction
bytes, both literal ranges, exact return words, four completed replay returns,
all 1,881 frozen runtime files and 25 source hashes. Four complete emulator
Evidence records also match the CLI exactly. Three exported bundles retain
all contributing records. All four owned verifier process lineages are empty.
[Historical checks](arc-dispatch-replay-2026-11-23/history-verification.json)
authenticate eighteen earlier snapshots, including `b3acb5f00`.

No new REA+ defect was reproduced. The mapping-boundary stops are expected
results of explicitly bounded inputs. The emulator dependency environment was
restored independently; the verified product source/build/package results in
the preceding checkpoint remain applicable. No new source suite or package
gate is claimed for this evidence-only follow-up.

Item 63 remains open for actual active Client/default selection, exact stored
code/context origin and relevant instance/copy stability. These replays answer
what the selected helper produces for two explicit inputs. They do not prove
that Arc's actual call enters it, that those preferences are persisted or read
on a live path, or that the full Arc feature/persistence analysis is complete.
