# Restore ordering and eligibility resolution — 2026-11-22

The selected restore path uses a **stable descending sort of `date ?? Date.distantPast`**, then returns the first eligible backup that decodes successfully. This is a static normal-return conclusion, not an observed chosen backup or restored disk state. Equal keys retain directory enumeration order; no filename tie-break is constructed.

This review uses fresh public helpers plus the original enumeration/restore instructions. The earlier `restore-review.md/json` remain unchanged. All conclusions presume valid stable Swift storage, the traced ARM64 Swift calling convention, ordinary Comparable and value-witness/array-move behavior, and normal helper returns.

## Record eligibility and date

Public metadata binds `StorableFile` and fields `url`, `isBackup`, `date`. The descriptor has three fields and a field-offset vector at metadata word 2. Code addresses `isBackup` through `i32(metadata+0x14)` and `date` through `i32(metadata+0x18)`; these are vector entries, not literal runtime instance offsets.

Let `B = originalURL.deletingPathExtension().lastPathComponent`, and let N be a candidate's last component. `0x100dc1658` returns a record only when `N.hasPrefix(B)`. For an accepted URL it sets `isBackup` when the candidate's last component **after deleting one extension differs from B**. No extra extension, separator or successful-date requirement appears in this classifier. For example, `StorableBoostsDataX.json` satisfies this classifier when B is `StorableBoostsData`; this illustrates the predicate, not an observed file. [S01, S05, S18–S22]

Date helper `0x100dc1814` first calls `0x100dc124c` with the candidate URL and the implementation's formatter. That helper deletes the final extension, scans the last component backward to a period and constructs a String for the publicly bound `dateFromString:` selector. Exact character order of that collection-derived String still needs its nested type/import binding; the concrete next-query addresses are in JSON. If this parse yields nil, the helper calls `attributesOfItemAtPath:error:`, retrieves `NSFileCreationDate` and casts the value to Date. Missing/wrongly typed attributes or attribute-read failure produce nil, releasing the error. Date validity does not itself decide `isBackup`. [S06–S09, A0–A2, K0–K2, T0–T2]

The first-stage parsed date takes precedence over the creation-date fallback. It is therefore inaccurate to call this a modification-time sort, or to assume every accepted candidate has a date parsed from its filename.

## Comparator, sort and ties

`0x100dc1ff8` materializes the first record's optional date at X23, the second at X22, replacing each nil with `Date.distantPast`. It calls imported `>` with X0=X23 and X1=X22 at `0x100dc2224`, and returns bit 0. No filename or `isBackup` value participates. Equal normalized dates compare false in both directions. Nil can tie with an actual `distantPast`, so “all nil dates are unconditionally last” is stronger than this code. [S10, S11]

The physical sorting paths establish stability:

| Stage | Observed decision | Effect on equal keys |
| --- | --- | --- |
| Insertion (`0x100dc2b88` and run extension) | Swap only when comparator(current, previous) is true | No equal-key swap |
| Run normalization (`0x100dc23b4`) | Reverse only a run whose adjacent comparisons are all strictly true | Reversed runs contain no equal keys |
| Forward merge (`0x100dc3104`) | Compare right head with left head; false selects left | Earlier run stays first |
| Backward merge (`0x100dc3104`) | Compare right tail with left tail; false selects right for the later slot | Earlier run still stays first |
| Residual helper (`0x100dc36dc`) | Order-preserving overlapping/disjoint Swift array moves, or no-op | Preserves residual sequence |

The dispatcher merges adjacent indexed runs. Insertion and merge branches therefore compose to descending normalized-Date order with stable equal-key order, under the stated normal-return/copy semantics. The 44 residual-helper probes, including its normal return and bounds traps, match original instruction bytes. [S12–S17, R00–R43]

`0x100dbe848` appends accepted candidates in directory-array order before sorting. Public stub/slot/CString bytes now bind `contentsOfDirectoryAtPath:error:`. Filtering is order preserving, so equal-date restore candidates retain their relative position in that returned sequence. The actual sequence was not observed; code supplies no lexical tie-break. “Newest first” is safe only if explicitly defined by this normalized date key, not by filename, mtime or observed filesystem age. [S01, D0–D2]

## Callback and writeback limit

The public callback `0x100dc4378` loads `(implementation, argument)` from capture+0x10/+0x18, sets Swift self X20 and calls `0x100dbe518`, preserving the indirect result buffer. It restores incoming X21 after the call. This closes the indirect queue-adapter route. The callback adds no save request. [S03, S04]

The restore leaf scans the sorted array from index 0, skips `isBackup == false`, and reads eligible records with backup-on-error flag 0. Per-candidate read errors are released before trying the next; the first present decoded value returns, or none if exhausted. No store writeback is constructed within this leaf/callback route. A selected invoking application caller and any later writeback remain unknown, and no actual restored state was observed. [S02, S04]

## Authentication and remaining query

Every used source's full SHA-256, Evidence ID, target/profile identity, original saved reply, successful invocation row and exported bundle binding is recorded in `restore-resolution.json`. Old Evidence additionally matches its immutable snapshot. Pointer-slot bytes are explicitly distinguished from original chained-fixup words; all instruction probes and unchanged metadata/String bytes match the exact original ARM64 input. This authenticates the retained sources, not execution.

For exact first-stage suffix typing, publicly read `0x10373f2e8` (8 bytes), `0x103bb3e4e` (21 bytes), and bind import slots `0x10423e708` / `0x10423f2b0`. Supplemental original bytes indicate a double-reversed collection; this review does not promote that shape inference to a public typed fact. Higher-level restore callers/writeback remain a separate query boundary.

Principal Evidence: S01 `ev_940da8e92222ecc39a9c759b222b195cc8b9a883a72b16144722755fa9e6f693`; S02 `ev_aeaf21f64b1be2bfb13dd717f4f3118087b93dc2266c06bf446eab0b628fbccf`; S04 `ev_e7a9bf5c07e9fee3d1b7a4b75297c07db668561a8c9936e2eedd374f0b67fd32`; S05 `ev_aace9d31b261a38c2b706ab85996dacd43581188c30d68e5b3e46b146c0ffd7c`; S06 `ev_195b71866f44566f7a48f401a00d83b8fd3931ee8061927f46704143234de450`; S08 `ev_bd64f31fc6a5397a420be887ef7e05e892f70b1f0bec18cbb3f9f1a1719a654c`; S10 `ev_5b71dac69f1a19cc8f9617e7cd0568da7ae84f453b418c9c5c18cf41f5a39b62`; S13 `ev_4c4a48a3bf0fc2fb1e3d5d382713198dd91ae1fc9f9abfb281ab711c0a84886e`; S14 `ev_a69fdc172652c99bac4475374e68a148e2bdfafcb3d90958908a3f69e7cc3565`; S16 `ev_f9911b623e337c371a88e63d47b7ea693db563f6741967d5ffd01e59f0ae333a`.
