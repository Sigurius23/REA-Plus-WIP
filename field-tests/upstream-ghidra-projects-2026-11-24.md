# Upstream integration: verified Ghidra project copies

Date: 2026-11-24. Item 62's selected-project slice is implemented. This adapts
`GhidraProjectSnapshot.ts`, configuration and launch semantics from audited
upstream commit `f7849cad3fe3bffb207b4dc30f34394978c20297` to the existing REA+
profile, error and process-ownership infrastructure. It does not import the
upstream resource framework or replace local Swift producers.

## Behavior

`REA_GHIDRA_PROJECT_PATH` selects an absolute expanded `.gpr` marker;
`REA_GHIDRA_PROGRAM_NAME` optionally selects one exact root Program, defaulting
to the supplied executable's basename. CLI and MCP use the same configuration
and profile resolution. The supported provider scope is Linux/macOS native
ELF/PE/thin Mach-O; this run qualifies macOS arm64 with Ghidra 12.1.4.

The profile commits the selected marker/`.rep` contents and all packaged Java
bridge sources. The launcher copies only that project pair into its private
runtime and verifies the copy before Ghidra starts. Unrelated sibling projects
are excluded. Symlinks, non-regular entries, overlapping runtime placement,
changed snapshots and incompatible import-time overrides are refused.

Ghidra receives `-process <exact-program> -noanalysis -readOnly` for the private
copy. The original project is never passed to Ghidra. Local bridge preparation
runs on the copy; analyst annotation/name operations are unavailable. The
original Program's auto-analysis completeness and settings remain unknown:
handshake completeness/timeout are null in this mode, with explicit Evidence
limitations. Saved seed reports remain historical metadata, not newly applied
seeds. Ordinary ephemeral imports retain their previous boolean handshake.

The bridge compares the saved Program's declared executable SHA-256 with the
supplied executable. Missing/invalid saved identity is distinguished from a
proven mismatch. This checks the declared origin association; it does not
authenticate the creator or prove that saved Program memory was never edited.
The complete project digest identifies the selected saved state separately.

Descriptor close failures retain their owner for retry. Failed launch/copy
cleanup uses the existing client and process supervisor; private roots remain
owned until cleanup is confirmed. No PID-only cleanup mechanism was added.

## Owned controls and Arc regression

The source-built C fixture was compiled and imported into a new owned project.
The actual seed script records its historical outcome; a post-analysis script
adds the distinctive saved function name. CLI/MCP recover that name, a 32-byte
function body and eight instructions. A cold import finds the original function
and does not find the saved annotation, demonstrating that the selected-project
workflow uses saved state. Two full CLI/MCP Evidence records match exactly.

An owned post-admission file change is refused as `artifact_changed`. The
control adds/removes one explicit fixture file; the original content digest is
restored afterward. A binary derivative with exactly one appended zero byte is
refused as a project/target configuration mismatch. A separately copied project
with its executable identity cleared is refused as unavailable identity, without
claiming a different executable. Missing markers and conflicting fresh seeds
also produce configuration errors. Mutation requests are refused.

The fixed Arc SHA-256 remains
`6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The final runtime still accepts the 2,537-function seed overlay and one-second
analysis policy. Its selected reducer retains the contiguous 10,072-byte body
and 2,518 instructions under the same profile as the preceding Arc checkpoint.
This is a regression check, not a new typed Client or full Arc feature proof.
Arc, helpers and fixture executables were never run.

## Problems found and corrected

- The initial port flattened a changed-project exception inside the launch
  wrapper. The public stale-input control reproduced generic execution failure
  and unsuitable retry advice. The owning client now preserves typed analysis
  errors from its known launch wrapper; the control reports `artifact_changed`.
- The first wrong-target path terminated before the authenticated bridge could
  explain its refusal. The bridge now returns a specific configuration error
  and preserves both expected/observed identities when available.
- Identity absence must not become mismatch. The installed SDK returns the
  literal `unknown` after its SHA property is cleared. The final guard retains
  this unavailable case separately; the owned derivative verifies the behavior.
- Fixture setup initially used a hidden `.cache` path rejected by Ghidra, then
  made incorrect assumptions about analyzer renaming/duplicate seed labels.
  Fresh compatible fixture generations and a unique post-analysis annotation
  corrected those harness attempts. A missing-identity fixture assertion was
  also corrected from null to the actual SDK getter behavior.
- The first CLI negative-control parser expected MCP's nested error envelope;
  CLI returns the existing flat projection. The corrected controls validate
  that actual shape. Initial captures and failed logs remain intact.

These corrections belong to this integration; they do not create new claims
that the previously released REA+ already supported saved-project selection.

## Verification

- 108 source/boundary tests pass, with one Windows-only skip. The new filesystem
  scenarios explicitly skip Windows, where this provider mode is unavailable.
  Repeated descriptor-close faults, cancellation, source changes and cleanup
  ownership are covered. The final eight filesystem/config cases also pass.
- Final runtime: 36 public MCP calls, 32 successful and four expected refusals;
  two exact CLI/MCP Evidence pairs and two CLI configuration controls. Across
  retained integration stages: 87 MCP calls, 77 successful and ten refusals.
  Each successful response is checked against advertised SDK-converted schemas,
  its named contract, text/structured parity and Evidence/bundle membership.
- Build, typecheck/lint, documentation and isolated package verification pass.
  The package still exposes 206 tools and six prompts. Host tools were Node
  24.22.3, npm 10.9.2, existing JDK 27 and Ghidra 12.1.4; none was upgraded.
- Three immutable runtime generations retain 1,883 files each. The final
  manifest binds all 18 changed/new source files. Earlier runtime/source
  commitments and a test-only platform-scope adjustment remain documented.
- Twenty-six earlier snapshots are reauthenticated. Recorded verifier runs
  report verified empty owned descendant sets at observation time; this does
  not claim they never launched children. Linux and Windows engine behavior
  were not exercised.

Raw plans, replies, bundles, manifests, attempts and machine receipts are in
[the capture directory](upstream-ghidra-projects-2026-11-24/).
The final checks are `verify_current.mjs`, `verification-current.json`,
`runtime-current-manifest.json`, `current-cli/cli-verification.json`,
`tests-identity-qualified.log`, `package-current.log` and the history receipt.

## Remaining integration

Automatic owned checkpoint publication is still open. It needs a seed-compatible
saved-state commitment, exclusive publication ownership, restore/save and
retirement semantics. This slice inspects already saved projects; it does not
save an active REA+ Program or recover earlier deleted ephemeral Arc projects.
Other upstream native pages and item 62's broader additions remain separate.
