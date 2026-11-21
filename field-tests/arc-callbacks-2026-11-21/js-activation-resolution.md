# JavaScript activation — phase2 resolution

The new replies resolve the two substantive gaps in the earlier reviews: the model transformation before a newly enabled identifier is merged, and the exact String operation behind the JS predicate. Earlier reviews and captures are unchanged.

`0x101158eb0` reconstructs a `BoostData` output and assigns **`isActive` from input `w0 & 1`**. Physical inputs are source address `x20`, output address `x8`, and the new active bit in `w0`. It saves `w0` at `0x101158ed4`; `0x1011591a0..1ac` obtains the metadata-vector offset at key`0x2c`, masks the saved bit and writes the selected output byte. The prior exact field records bind key`0x2c` to field7 `isActive`. Evidence: `ev_b949738433a2f0094f280273edc9b4ab38ee405b3b7dfa00f1fbbb6768c9b121`.

Consequently, the newly inserted-ID branch in `0x10117d424` calls this routine with **`w0=0`**, serializes the resulting model and reaches the same Firebase merge setup as the already-present branch. The already-present branch serializes the original model. Both join at `0x10117d4d4` and raw-branch to `0x10117cd20` with `w1=1`, reaching the previously captured merge-write worker. This is a selected serialized/merge input with `isActive=false`; it does not prove the final remote state after all later continuations or writes. The routine reconstructs fields, so no claim is made that every other byte is unchanged. Caller Evidence: `ev_c808f2a87d30e301b712fa3b6a02c3126bf554aec308b1baf62f3f190bce09cb`.

`0x10080fc90` now directly establishes **trimming at both ends**. Its physical input is a generic String-like value address in `x20`, the CharacterSet address in `x0`, String metadata in `x1`, and its conformance witness in `x2`. Leading and trailing loops fetch Unicode scalars, test `CharacterSet.contains`, and advance/retreat while the scalars belong to that set. The helper returns the resulting bounded Substring. The two callers supply `CharacterSet.whitespacesAndNewlines`, convert the Substring to String and test nonzero length. Therefore the inspected predicate is a nonblank-JavaScript-content test, with the optional-data/nil gates separately established earlier. It does not validate JavaScript syntax or observe execution. Trim Evidence: `ev_c84eea95dfecef650fdcc75ce52ec4ac6bcdd453279c19ca76a4c1fa6d9b9867`. Cached String-witness setup `0x10115aa74`: `ev_8e764d7a0aebab238a17ffa577ed13cdeb3caee983be297557cee477163687a3`.

The read rule is now fully bound for these selected static paths:

```text
isActiveOut = parsedStoredIsActive && (locallyEnabled || !hasNonblankJS)
```

The stored flag is parsed from String `true` (missing/wrong-String-type defaults true). Set membership flows directly into converter `w1`. The previously captured local-read error continuation supplies an empty Set, so that fallback suppresses active JavaScript-bearing data. The setter's local-enable insertion is a preliminary step, not an exclusive alternative to remote merge construction.

The inserted branch's merge completion `0x10117d4fc` saves incoming asynchronous error `x20` at parent+`0xb0`, cleans up child data, and schedules `0x10117d570` on zero or `0x10117d818` on nonzero. Evidence: `ev_5c96d5e945b80ac069d98bc1771b40b27ac02c02a02b9e3d33bfc7e8b990c795`. These two final continuations are still separate gaps; the sibling noninserted error path cannot substitute for them.

The JSON companion hashes all eight fresh source records and both prior review JSONs. This review launched neither provider nor target and changed no captures/source. Active dependency injection, actual local/remote execution, successful persistence, final readback and visible JavaScript effects remain unobserved.
