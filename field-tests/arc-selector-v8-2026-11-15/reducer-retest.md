# Arc reducer retest with bounded Darwin effects

The unchanged Arc 1.172.1 ARM64 slice was analyzed through public MCP using
an isolated runtime built from `5628ef81ce5144c9af3bdc11b1e3647a9035c368`.
Its runtime manifest and exact plan are retained in this directory. The
supplied application and its libraries were not executed.

The `analyze_function` call for `0x1012a571c` succeeds under
`abi-signed-word-cfg-v8` and `trusted-darwin-arm64-chkstk-v1`. Canonical
Evidence `ev_68c2128bcc96a0f626bbdb19b0efe5487162ac33c33c8499a168885f7939e5fc`
still reports 2,024 observed function bytes across an 8,608-byte span, with
three noncontiguous ranges and no recovered nested switch. The input SHA-256
is `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

This confirms the bounded probe summary alone does not recover Arc's dynamic
stack source and inline SIMD payload projection. Item 55 remains open. The
v9 typed snapshot implementation is a separate, unfinished capability change;
its assumptions and verification must not be attributed to this receipt.

The session also supplied independent selector queries. It completed 19
public calls: 18 successes and one expected missing-procedure admission
rejection for an unseeded modifier body. Final bundle export and explicit
`close_binary` succeeded. The verifier observed empty owned descendants at
`2026-11-15T10:33:05.984Z`; its summary is retained with the public replies.
The modifier body was then admitted in a separate session using an additive
seed list, without changing this capture or the original seed file.

Receipt: [canonical result](evidence/arc-reducer-v8.evidence.json).
