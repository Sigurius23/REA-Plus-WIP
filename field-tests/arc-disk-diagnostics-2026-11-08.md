# Arc: Ghidra disk-capacity diagnostics

2026-11-08, Europe/Berlin. Source parent:
`95a5d4e3f7b6b94c042d9abef003baa772803ab3`. This closes item **53**, found in
the [delegate/evaluator investigation](arc-dispatch-2026-11-06.md).

The supplied Arc **1.172.1 / build 90370** DMG remains the target. Its derived
ARM64 executable is **80,498,448 bytes**, SHA-256
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The renewed [integrity receipt](arc-disk-diagnostics-2026-11-08/target-integrity.json)
verifies the DMG, original executable, slice and all **1,113** extracted regular
files against the original commitments. Arc/helpers/shipped scripts were not
executed, and no application UI, profile, account or service was accessed.

## Repair

The provider now recognizes current structured `ENOSPC` and supported complete
Java disk-exhaustion exception lines during startup. It returns:

| Field | Result |
| --- | --- |
| Code/category | `resource_constraint` |
| Resource | `disk` |
| Retryable | `false` |
| Reported limits | `null`; no capacity amount or quota is inferred for this failure |
| Diagnostics | Original bounded, token-redacted data and truncation markers |
| Observation | Positive signal, source field and retained-text offset |

Unrelated advice, quoted target text, ambiguous I/O errors and stale startup
output during remote requests do not establish capacity failure. Cancellation
keeps precedence; incomplete cleanup still wraps the primary failure and retains
its diagnostics. Composed capacity errors preserve the public workflow operation
and provider operation separately. Resource kinds have one canonical definition
shared with the JavaScript worker failure schema.

Recovery guidance names restoring capacity on the reported runtime/project
volume and the optional `REA_GHIDRA_ANALYSIS_TIMEOUT_SECONDS` demand knob. It
states that reducing auto-analysis time does not reduce import storage or
guarantee a smaller project, and unchanged capacity/policy can reproduce the
failure. It no longer recommends an unchanged “Retry once.” See the
[provider guide](../rea-local/docs/ghidra-provider.md#disk-capacity-failures).

## Retained real failure

The original 60-second Arc binding emitted explicit
`java.io.IOException: No space left on device` lines, then exited before bridge
startup with process exit code **0**. The former public error was
`execution_failure` with generic retry advice. A nonzero process exit code is
therefore not a prerequisite for recognizing the captured failure.

[Reprojection](arc-disk-diagnostics-2026-11-08/retained-failure-reprojection.json)
passes the complete retained diagnostic through the compiled production provider
using recorded installation/client ports. It now returns disk capacity failure,
preserving **identical diagnostics and the original profile digest**. The source
reply's SHA-256 is recorded, and the original capture is unchanged.

This is recorded-producer replay, not a fresh ENOSPC experiment. It does not
start Ghidra, fill a filesystem, alter quota, or act on historical process IDs.

## Fresh healthy Arc check

A separate real **Ghidra 12.1.4 / JDK 27** run uses an explicitly selected
**one-second** auto-analysis policy and one established caller function seed.
`read_function_instructions` recovers the selected evaluator at
**`0x1012fa3a0`**: **89 instructions / 356 body bytes**, across its two observed
body ranges. The large enclosing address span is not treated as contiguous code.

[Verification](arc-disk-diagnostics-2026-11-08/healthy-verification.json) authenticates
the canonical Evidence, named output contract, exported bundle, target identity
and partial-analysis policy. The actual SDK recorder validates advertised
schemas and equal text/structured output. All **4 calls** pass, including export
and close; shutdown verifies empty owned descendants.

The Program remains explicitly partial (`analysis_complete=false`,
`analysis_timed_out=true`). This verifies the healthy path; it does not reproduce
disk exhaustion or establish that the original 60-second demand would now fit.

## Checks and remaining work

- **99 source cases passed**: classifier grammar/negative cases, domain error
  projection and fake-backed provider behavior.
- **6 SDK MCP boundary cases passed**, including CLI-adapter parity, both output
  streams, zero exit status, truncation preservation, public-operation rebinding,
  cleanup composition and stale remote errors. Ghidra failure ports are injected
  in these cases; they are not additional real-engine capacity events.
- **9 real worker-boundary cases passed** after sharing resource identities.
- Build, typecheck/lint, documentation and whitespace checks passed. The
  [capture audit](arc-disk-diagnostics-2026-11-08/evidence-audit.json) authenticates
  **1** standalone Evidence record and **1** bundle, with no failures. The replay
  error is validated against the canonical error schema, not labeled as fresh
  Evidence. No full `check:pr` or host-capacity stress test is claimed.

Item **53 is complete for the documented diagnostic forms**. Arc tool gaps
**38–53** are addressed within their recorded profiles. Its command closure
effects, bootstrap/injection, Boost persistence, overlay rendering/coordinates
and extension loading remain open research questions; full behavioral recovery
is not established by these repairs.
