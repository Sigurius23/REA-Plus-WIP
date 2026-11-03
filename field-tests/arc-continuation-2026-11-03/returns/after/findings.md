# Item 44: return-field provenance, compiled public verification

The new producer connects a statically known input property to its returned own field and return site. It preserves direct expression provenance without treating a newly constructed returned object as an alias of an input. Unknown values and unsupported transforms remain bounded.

This is the after-fix companion to [the original diagnosis](../findings.md). Those earlier records are unchanged. No Arc or fixture JavaScript, UI, DOM, profile, account, endpoint, or service was executed.

## Public result

| Question | Recorded result |
| --- | --- |
| Same known fixture and source bytes | Fresh parent `ev_2585ac7f494dfbe8a5f0ebfd7de8fa53fd3351439e90b1d21a0fe1ef99fee582`; `/value` → read expression → returned `/output` → return site, **4 nodes / 3 resolved relations / 1 matching sink / 0 unknowns** with the default filter. |
| CLI/MCP parity | Complete Evidence is exactly equal: `ev_88b9c237a599a074c252d9c2f9118078df1099a518b29fc46b122faeb5f66a6f`. See `cli-known-input.json`, `cli-known.evidence.json`, and `traces/known-field-forward.evidence.json`. |
| Explicit block arrow; implicit object arrow | Each known input reaches one return sink through 4 nodes / 3 resolved relations. |
| Nested known input path and escaped output key | `/nested/value` reaches returned `/a~1b~0c` and one return sink. |
| Ten negative controls | **0 matching return sinks** from the selected input slot by default: overwritten property, later unknown spread, later unknown computed key, computed literal output key, getter overwrite, getter input, mutation, prototype mutation, arithmetic transform, call transform. |
| Unknown parameter arrows | Explicit and implicit forms retain unknown returned values. Their default backward queries show 2 nodes / 1 resolved relation; opt-in queries show 11 nodes / 10 relations, including 3 candidates. No default filtering changed. |
| Legacy bundle import | Original known parent is preserved without new returned slots. Its trace is exactly unchanged: `ev_2f82510c5afb6d2c03a0532c40015cff6e7f3b1f90cbbe56d0017da8bc04497a` (2 nodes / 1 relation / 0 matching sinks). |

The arithmetic control is particularly useful: the existing value evaluator recovers the returned literal `3`, but the field is `source_status: unsupported` and has no fabricated direct copied-value edge from `input.value`. `String(input.value)` likewise stays unsupported. A recovered value does not establish an unimplemented dependency transformation.

`source_status: complete` records the selected direct source expression. It does **not** assert that its value is known. Getter, mutation, prototype mutation, unknown parameter and DOM-dependent values retain candidate source-to-field edges and explicit unknowns. A default forward trace through a discarded expression may have no unknown of its own because the unsupported returned field is not reachable; the parent graph retains the field's source status/reason and unknown record.

## Fresh Arc producer

The actual installed three loose scripts were analyzed again as inert input, with `paths_include: ["**/*.js"]`:

- Complete parent: `ev_67fed6fbda38209cdd71c1d664d78436c718b34f890849c9f6244ce6b8dbaffc`.
- Public summary: `ev_80d0510d14c6fd1cfcc1ea19466042cffdf57bbad4ef3200e52f62c48b1a2259`.
- Root identity remains `4d142dda279872263953d0bb0eb8b0ef64d2d41f1e7cda865c442795d6a6a2bd`, matching the prior Arc parent.
- 3 scripts, 30,640 source bytes, zero semantic node/relation omissions; 21 new return-owned field slots overall, including 16 in `SelectorPicker.js`.

The existing exact candidate-result seed now has explicit `selector` and `matches` fields. The coordinate-result seed has explicit `x`, `y`, `width` and `height` fields with candidate contributions from the selected `left`, `top`, `width` and `height` property-read expressions. This records where those fields come from while retaining their unknown values.

| Existing Arc seed | Default backward query | Candidate opt-in backward query |
| --- | --- | --- |
| Candidate result | 3 nodes / 2 relations / 0 candidates / 2 unknowns (`ev_a041c32f8b1ee08b28a6343f87ba795d8615e7b492c081c8870e9ed4868c0823`) | 11 nodes / 11 relations / 6 candidates / 5 unknowns (`ev_533bc2b66bc98d5ecfe7ff6adaa03cb6a14710ad2543b9ddd2249af488ca3ed8`) |
| Rectangle coordinates | 5 nodes / 4 relations / 0 candidates / 4 unknowns (`ev_5ae00f96ec78740a0290461720ba9d560b7a9c787c7240d8d60d669940930e5c`) | 20 nodes / 22 relations / 13 candidates / 9 unknowns (`ev_e75483064115afb2950602c6a6726dff6fd99e39b64ab4094d05d654731120f0`) |

The callback's `rect` and `hash` outputs are unsupported call expressions. Their return-owned fields are retained with explicit source reasons, and no copied dependency is invented. DOM operation results and rendering remain unknown. These improvements do not establish the app's live behavior or complete the unresolved native/DOM boundary.

## Representation and compatibility

The canonical object evaluator chooses the selected field expression in the same pass that establishes object values and overwrite/invalidation semantics. It retains optional `fieldSources` on each direct object return. The worker schema transfers that optional field without defaulting historical omission to an empty inventory. The semantic graph uses existing property-slot identities and `defines` relations; it does not reconstruct field dependencies from report text or add an abstract evaluator. Exact returned field paths and expression ranges are preserved.

The public module item exposes graph metadata, not the complete worker IR. Historical worker-IR omission and both arrow representations are pinned by the source tests; public legacy compatibility here is proved by importing the old complete bundle and obtaining exactly its original trace. Imported old Evidence is never silently backfilled with new producer facts.

Source lane before this public run: 7 files / 144 tests passed; full typecheck passed; scoped lint/format/whitespace checks passed. The public source/compiled hashes and recording validation are in `verification-receipt.json`.

## Recorded attempts and cleanup

All complete public replies, advertised schemas, durable arguments, Evidence, exports, and owned lineage receipts are retained:

- `./`: 6 calls, 5 successes. The initial complete-inline Arc response exceeded MCP's declared 10 MiB receive budget. The analysis was complete and retained; this response is preserved in `arc-analysis.reply.json`.
- `session/`: 9 calls, 8 successes. Recovery used `detail: summary` and immediately exported all complete producer Evidence. A subsequent caller selected ambiguous `known.js` by path; the tool correctly returned the exact possible node IDs. This is preserved in `known-module.reply.json`.
- `traces/`: corrected import, exact node-ID module views, traces, and complete export, **34/34 successful calls**. `evidence-bundle.json` retains 40 records and covers every unique successful Evidence record from all three attempts, including the complete Arc parent.
- CLI: one successful trace, exact MCP parity, empty stderr.

The two earlier attempts are counted as boundary/caller errors, not passes or new REA defects. All three MCP clients/transports were closed and all three owned lineage reports are verified with empty descendant inventories. No production code or shared task registry was edited during this public verification.
