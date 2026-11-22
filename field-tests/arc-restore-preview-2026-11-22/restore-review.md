# Independent retained restore review — 2026-11-22

The retained restore leaf returns the first eligible, successfully decoded value **in its supplied array order**. That is not yet a newest-first proof or a restored-filesystem-state claim. No application restore caller or subsequent writeback is established by these records.

Only retained Evidence and authenticated original bytes were read. No provider, Arc/helper/script, fixture, profile, account or service was run. Normal valid Swift storage and the ARM64 Swift ABI are explicit premises: context/self X20, result X8 and the physically checked throwing-error X21. Item 47 remains relevant to generic throwing calls.

## Constructed route and missing callback

`0x100db8d80` writes `(0x100dba020, implementation-object)` at result+0x40. The thunk branches to `0x100dbb45c`. The typed Boost factory copies all 96 bytes into global `0x104622168`, placing this constructed pair at `0x1046221a8/0x1046221b0`. This binds a shipped static implementation, not active dependency selection or execution. E07 `ev_38d5e65fde9eb015377ffb2061b97d2ee4d1fce2f2597c370e1637c11706dcf3`; E08 `ev_c2435fd03f21505d359724d31be9a78875a5bd3d35c786b31667a0150f43f1d1`; E09 `ev_1d9aaeece2e14bd3403a045f1ec3c85fb85e912c2df0ae5c33112d7a7b32617e`.

`0x100dbb45c` captures its implementation object and incoming X0, forwards the original indirect Optional result buffer, and supplies callback `0x100dc4378` to `Dispatch.sync`. Its relation to the restore leaf is indirect. The callback body is an exact public next-query boundary. Supplemental original bytes show a 44-byte wrapper with only a direct call to `0x100dbe518`; that observation remains planning evidence until public capture. E05 `ev_574739b8a208e8314f5c6ac68c9eb3e839e1c397de3a617fc33a09c3048c3316`; E06 `ev_04c892073e74038e60f096169f205c8bda851d1341bd4057b96eee4c7d6a485e`.

## Enumeration and ordering

`0x100dbe848` derives the parent URL/base filename and invokes Objective-C stub `0x103647a40` with an error-out pointer. A nonnil result is bridged to `[String]`. Candidate URLs and present parsed records are appended in increasing input-array order; parser `0x100dc1658` decides record construction. The helper then passes comparator `0x100dc1ff8` into `0x100dc2270` with an inout array. The sort/comparator bodies and file-record provenance remain missing here, so the returned order is unresolved. E01 `ev_940da8e92222ecc39a9c759b222b195cc8b9a883a72b16144722755fa9e6f693`.

The nil enumeration branch (`0x100dbee1c–0x100dbee60`) converts its NSError, calls `swift_willThrow`, releases that error and returns an empty array. Unexpected parser/sort errors instead reach `brk` paths (`0x100dbf0b0/0x100dbf0cc`). The qualified pseudocode removes those paths; it cannot substitute for the instructions. E01 `ev_940da8e92222ecc39a9c759b222b195cc8b9a883a72b16144722755fa9e6f693`; E02 `ev_ef2d6962c735fb403198beb13d261f0dad2fe48e65024923fe71ace1c0b768a5`.

Supplemental original bytes identify the enumeration selector as `contentsOfDirectoryAtPath:error:` through slot `0x104541d10` and CString `0x103fa7f0a`; capture these publicly before promoting that name. This selector alone would still not establish the final sorted order.

## Restore loop and writeback boundary

`0x100dbe518` starts index 0 and advances upward. It loads a flag offset through record metadata+0x14 and skips records whose flag bit 0 is clear. Eligible candidates call `0x100dbf0d8` with W1=0 and forwarded decoder-info. At `0x100dbe73c` a nonzero X21 goes through error release, Optional.none formation and X21=0, then the loop continues. This catch path is removed from pseudocode. E03 `ev_aeaf21f64b1be2bfb13dd717f4f3118087b93dc2266c06bf446eab0b628fbccf`; E04 `ev_30a640ca86609f21aaae04f6b2cba13a56185b8158ae6cada71a1929cae6b87a`.

The first present result takes `0x100dbe7f0`: value-witness moves copy the decoded value into the original result pointer and set the Optional tag present. Empty/exhausted arrays return none. The leaf constructs no save/file-replacement request. Its return value therefore does not prove writeback; the invoking caller is a separate missing boundary. Ordinary readImpl handles selected failures with backup/error logic rather than calling this restore leaf in its retained body. This is a bounded observation, not global nonuse. E03 `ev_aeaf21f64b1be2bfb13dd717f4f3118087b93dc2266c06bf446eab0b628fbccf`; E10 `ev_61dab22712b6c2fc573a48e50b7589ea63909b27ef55028d9c19fbbe88c8e1c2`.

## Exact next public queries

1. `read_function_instructions` / `procedure_pseudo_code` for `0x100dc4378`, `0x100dc1658`, `0x100dc1ff8`, `0x100dc2270` and `0x100db84f4` (callback, parser, comparator, sorting, record metadata).
2. `read_bytes` on `0x103647a40` length 32, then `0x104541d10` length 8 and `0x103fa7f0a` length 33 to bind the enumeration selector.
3. `procedure_references` with direction `incoming` for `0x100dba020` and `0x100dbb45c`. Static xrefs may leave indirect field invocation unresolved; only a provenance-bound invoking caller can establish later writeback.

## Source authentication

All 10 Evidence records match their immutable snapshot entries, saved structured/text replies, successful invocation journals and exported bundle records. Their target SHA-256 and seed profile hashes were checked. The exact ARM64 input SHA-256 was recomputed as `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`. The adjacent JSON contains every source path, full hash, Evidence ID, bundle/reply/journal binding, instruction anchors and original-byte planning ranges. This authenticates retained bytes; it does not establish successful I/O or semantic completeness.
