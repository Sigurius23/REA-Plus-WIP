# Retained native observations and source context — 2026-11-24

Item 62 now includes retained views for procedure addresses, callers, callees,
containing-procedure resolution, xrefs and call graphs. This selectively adapts
upstream f7849cad3fe3bffb207b4dc30f34394978c20297 to the existing local result
shapes and Evidence/profile ownership. No provider bridge or target bytes changed.

## Behavior

Four primitive relationship/resolution tools and get_call_graph accept detail
summary; complete remains default. Complete Evidence is retained before the
summary returns its first 64 recorded observations. inspect_analysis_view adds
native-observation pages and native-context overview, full analysis-profile and
limitations pages. Retained xrefs records support the same views with their
existing producer input unchanged. Counts describe retained observations, not
complete native discovery; untyped addresses do not gain reference kinds.

Array source_index preserves duplicates. Graph identity is parent + original
level + source_index; levels sort by Unicode code point and rows retain their
original order. Empty levels are explicit markers and failed nodes retain
original typed errors. Existing local graphs do not record upstream's newer
relationship-coverage representation, so this port does not invent it or a
result-limitations collection that the local producer never recorded.

Source-context digests follow Evidence's semantic subject identity while
responses preserve selected display paths. Context pages recover exact subject,
provider, authority, environment, full profile and ordered/repeated caveats.
Fact pages reference that context rather than copying its whole profile/caveat
inventory. Read the source caveats before interpreting the recorded facts.
An unrecorded profile has null rows and unavailable coverage with an unknown
total, no continuation and exhausted false. An observed empty caveat list has
numeric zero and exhausted true. Existing historical view shapes remain valid.

The new native-observation CLI uses the same named read contracts and projector.
Summary requires a new portable complete Evidence bundle before provider
admission. Delivery belongs to --detail; nested parameters.detail is rejected
explicitly rather than silently ignored. Portable pages require no live engine.

## Confirmed issues and repairs

- Call-graph traversal previously flattened cancellation and unsafe cleanup into
  ordinary node errors and could continue admitting reads. It now stops on
  cancellation (including Hopper's typed form), resource/configuration failure,
  startup timeout or unconfirmed cleanup. Typed failures retain completed graph
  nodes, pending addresses, source identity and observed caveats. Ordinary node
  errors remain local to their branches. Existing upstream partial observations
  retain ownership. Workflow revision 2 separates the new interruption semantics.
- CLI coverage metadata still labeled the recently added native inventory and
  batch commands MCP-only. The named command aliases and intentional MCP-only
  inventory now agree with actual registrations; its boundary check passes.
- Review caught the new CLI's nested delivery ambiguity. Final preflight rejects
  that misplaced input before opening even a nonexistent target.

## Verification and retained evidence

- 79 source/domain/application tests and 22 CLI/MCP boundary tests passed
  (101 selected tests). Controls include negative containment, duplicate rows,
  empty/failed graph levels, Unicode ordering, unknown versus empty profiles,
  context identity across display aliases, malformed/incompatible views and
  generic/Hopper cancellation or unsafe cleanup with projected partial facts.
- The qualified core runtime completed 88 public MCP calls: 87 successes and
  one expected incompatible-view refusal. The final runtime's additional four
  Arc calls all passed. Advertised inputs/outputs, canonical contracts, text /
  structured parity, complete parent retention and bundle export are checked.
- Seven complete CLI/MCP Evidence pairs match exactly: address and graph
  complete/summary plus portable graph, profile and caveat pages. Final CLI
  also proves three pre-admission invalid-input refusals (10 calls total).
- Three frozen runtimes contain 1,895 files each. The final change affects only
  the CLI input-validation module and its map; the verifier checks that all
  provider/MCP implementation files match the qualified core runtime. Earlier
  source versions and captures remain preserved rather than overwritten.
- Type/lint, build, docs and package checks passed. Test discovery accounts for
  all 969 files exactly once. Three package receipts preserve installation,
  update, skill readback, 206 MCP tools, six prompts and owned cleanup.
- 29 historical snapshots are authenticated against their original commits.
  The qualified-core plus final runs verify eight empty process lineages.

The initial sandboxed CLI JavaScript-worker check timed out; the unchanged case
passed with its required subprocess access. The initial portable-only recorder
could not inspect OS lineage and recorded it as unavailable. Its qualified
repeat verifies an empty lineage. These are recorded qualifications, not Arc
or provider defects. The first new MCP fixture assertion also assumed two
caveats before accounting for Evidence's automatic unbound-subject caveat; the
assertion now compares the actual complete parent's caveat count.

The owned C fixture and compiler receipt are reused from the previous inventory
study. Its bytes remain SHA-256
7591fdfaf870b9c7ad2b398163b5c6cbb02cbc41c52273f232764b977882097a.
It was compiled for static analysis and never executed as a host program.

Arc's fixed arm64 input remains SHA-256
6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578.
The existing verified Program retains its 2,537 seeds and original one-second
partial-analysis state. The reducer has 70 recorded callees; its 64-row summary
plus six-row continuation reconstructs the full retained list exactly. One
caller and two xref source addresses remain recorded, without runtime meaning.
Its instruction Evidence is exactly the previous study's record:
ev_55fbf993b7a8aadcc8bca2bd6e73189b3d8a79bc8e2efddd23d579f1351fed64
(10,072 bytes / 2,518 instructions).

[The verification receipt](upstream-native-observations-2026-11-24/verification-qualified.json)
binds runtime/source hashes, complete replies, CLI parity, portable readback,
parent caveats, exact Arc regression and lineage results. All checked-in
material is text. Native targets, databases, checkpoints, dist and dependencies
remain outside Git. Real provider qualification is macOS Ghidra 12.1.4; other
providers' interruption controls are fixture-backed, and live-model tool
selection was not evaluated.

## Remaining work

Analyzed-memory search_bytes, decompile_all / export and the other item 62
integration groups remain open. Checkpoint extensions and automatic refresh /
stale-lock recovery keep their earlier qualifications. Full Arc feature
recovery and Client unknown revision 3 remain open. This slice qualifies native
inspection delivery; it does not establish complete Arc understanding.

Arc, its helpers and shipped JavaScript were not executed. No profiles,
accounts, UI, services or recovered URLs were used.
