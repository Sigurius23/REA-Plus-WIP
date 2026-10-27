# REA+ full gate — 2026-10-27

`npm run check:pr` completed with **exit 0** against the current working tree,
including the Android XAPK/JADX follow-ups, JavaScript per-file budget changes
and module-resolution follow-ups. No commit or push was performed.

## Results

- Typecheck, formatting, lint, unused-code checks and metadata checks passed.
  Lint reported 824 warnings and zero errors.
- **904 test files passed, 16 skipped; 8,408 tests passed, 274 skipped;
  zero failures.** The test phase took 1,264.69 seconds.
- The worker boundary suite passed all 9 tests, including sequential-source
  semantic retention; static-reserve unit tests passed all 5 cases.
- Previously flaky client-profile, process-progress, launcher and finalization
  suites passed in this full run. Cancellation commitments were not changed.
- `docs:check` passed. The completion ledger's `complete: false` describes its
  separate verification claims; it is not a gate failure or a claim of complete
  real-provider coverage.
- jscpd reported **2.50% duplicated lines**, below the 2.6% threshold.
- The TODO scan passed without tech-debt markers.

Optional provider integration suites remain opt-in and account for skips.
For example, the real radare2 DEX suite skipped all 3 tests without its
`REA_VERIFY_RADARE2_PATH` setting. This gate does not replace the separately
reported full-Rize run or the earlier real Android provider verification.

## Corrections required to clear the gate

The first attempts stopped on formatting in nine JavaScript source/test files,
then an IPC test-group callback exceeding the 150-line lint limit. The formatter
was applied only to those files. The IPC tests were split into two descriptive
groups without changing their assertions. The successful full run followed
these changes; no test timeout or resource limit was relaxed.

## Toolchain and retained output

The run used supported **Node 24.22.1** and installed **npm 10.9.2**. The exact
repository pins (Node 24.18.0 / npm 11.16.0) were unavailable locally. This is
the observed gate result under the stated toolchain, not verification under
those exact pins. Installed dependencies passed the repository lockfile check;
no replacement toolchain or dependencies were installed.

Raw output: [rea-check-pr-2026-10-27.log](rea-check-pr-2026-10-27.log),
4,175,598 bytes, SHA-256
`b3e0f014d6f7e5b42e93ea5128d32dec86ca4a40b459dfb7bd966d76d91ac0f2`.
The original run log remains at `/tmp/rea-check-pr-20261027-g10nsb3v.log`.
The 616 MiB Rize evidence was hashed in place, not copied or re-analyzed;
its size and digest are recorded in the Rize field-test report.
