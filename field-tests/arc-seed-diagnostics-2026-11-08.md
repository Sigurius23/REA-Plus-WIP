# Ghidra seed-file diagnostics: item 54

Date: **2026-11-08**, Europe/Berlin. Source parent:
`5d194de15e0dc1aba06229fee0241659bd6a0338`.

The Arc follow-up exposed a diagnostic defect after a caller preparation error:
the configured seed file did not exist, but public `open_binary` returned generic
`execution_failure` with “Retry once” advice. The original reply is retained
unchanged in [the before receipt](arc-seed-diagnostics-2026-11-08/before-arc-open.reply.json).
The absent file was the caller's mistake; classifying it and recommending an
unchanged retry was the separate REA+ issue.

The seed-file reader now returns existing **`configuration_invalid`** errors for
missing, unresolvable, non-regular and oversized selected files. Details retain
the exact configured path and name **`REA_GHIDRA_SEED_FILE`**; remediation directs
the caller to select an existing regular seed file or unset the setting.
`retryable` remains **false**. Valid symlink resolution and the committed seed
snapshot remain supported.

Permission errors stay `access_denied`. Positive `ENOSPC` stays a disk
`resource_constraint` with capacity guidance. Incidental I/O/internal failures
remain provider failures. These distinctions are tested with injected errors;
no host permission denial or disk exhaustion was induced.

Verification:

- **29 source cases / two files** pass, including valid commitments/snapshots,
  malformed and missing selections, wrong file kinds, size bounds, permission,
  capacity and incidental failures.
- **Three actual CLI/MCP comparisons** pass on rebuilt code: owned missing
  file, owned selected directory, and the fixed Arc artifact with a missing
  file. Canonical error-schema checks require equal normalized errors, exact
  path/setting guidance and no unchanged-retry advice. See
  [public verification](arc-seed-diagnostics-2026-11-08/public-verification.json).
- The owned C fixture was compiled, never executed; both it and Arc retain their
  hashes. The three MCP sessions close successfully. Their three verified-empty
  lineage observations share one verifier identity; they are not three unique
  verifier runs or evidence that no child ever launched.
- Build, typecheck, uncached fast checks and built-documentation checks pass.
  No full `check:pr` rerun is claimed.

These are error receipts and source/public checks, not new analysis Evidence or
proof of Arc behavior. Item **54 is complete**; the fixed-layout Swift reducer
dispatch gap and the broader Arc investigation remain separate open work.
