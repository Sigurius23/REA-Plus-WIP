# Common mutation helper follow-up

Additional canonical sources: `ev_d2f78c6461c8559c7a9fa9915ec643b02776abcce6bf904f62622214fe38cf80` and `ev_990a8245bafaea79842636984505daa123b134af9357cdc17623647d0dba6a81`. These narrow the helper boundary left open by the caller-only [28-case map](case-map.md).

`0x1012abe5c` applies a container of160-byte update-like elements to the state, then builds several returned work values. The caller’s “one model container” shape should therefore be read as update/mutation-like values until their nominal type is decoded. It is not sufficient evidence of a complete Boost object.

|Observed stage|Assembly anchors|Interpretation / boundary|
|---|---|---|
|entry-bindings|`0x1012abe84`, `0x1012abe88`, `0x1012abe8c`, `0x1012abe90`|Entry W2 flag, X1 update-container, X0 state address, X8 output address are separately saved. Decompiler four-argument C signature is not the physical ABI.|
|direct-state-write|`0x1012ac074`, `0x1012ac078`|Clear F(0x48) before iterating.|
|container-loop|`0x1012ac07c`, `0x1012ac11c`, `0x1012ac120`, `0x1012ac198`|Read count at container+0x10; entries begin+0x20, advance by0xa0; call classifier0x101165e98.|
|state-field-dispatch|`0x1012ac0a8`, `0x1012ac1c0`, `0x1012ac1c4`, `0x1012ac1e4`, `0x1012ac24c`, `0x1012ac294`, `0x1012ac31c`, `0x1012ac324`, `0x1012ac328`, `0x1012ac33c`|Classification0/1/2 targets pair fields F(0x2c/0x30/0x34);3 targets byte F(0x38);4 targets word+byte F(0x3c);5 copies large F(0x44);remaining branch targets reference-like F(0x40). Values pass through helper0x100006b90; its payload contract is not proved here.|
|shared-helper-call|`0x1012ac3bc`|Call0x1012a93b0(state, output): same target as parent boostIDEAppeared. It is also reached after ordinary mutations, so its role cannot be inferred from the appearance case name alone.|
|always-constructed-async-work|`0x1012ac448`, `0x1012ac4ac`, `0x1012ac4bc`, `0x1012ac4d4`, `0x1012ac4d8`, `0x1012ac4dc`, `0x1012ac500`|Request state copy through typed helper, capture input update-container handle and0x280 environment bytes, construct task/run-style value via0x100598344 with descriptor candidate0x103788e38. Actual body, scheduling and persistence unproved.|
|flag-dependent-constructed-work|`0x1012ac524`, `0x1012ac528`, `0x1012ac590`, `0x1012ac594`, `0x1012ac5a8`|If flag bit0 is clear, construct another task-style value via0x10059803c with executable code pointer0x1012baef4 and captured state/environment. Strong focused deferred-work boundary; not yet a proven save operation.|
|history-or-state-helper|`0x1012ac61c`, `0x1012ac628`, `0x1012ac62c`|Call0x1012a9b80(state, flag&1, output). Body required before assigning undo grouping/persistence semantics.|
|conditional-delegate-emission|`0x1012ac6b0`, `0x1012ac6b4`, `0x1012ac6b8`|With flag bit0 clear, scan update entries for classifier5; if found, append Just/AnyPublisher outer tag0/inner tag4/value2 to constructed result collection. Nominal delegate/navigation names remain unbound.|
|effect-combination|`0x1012ac848`, `0x1012ac854`|Call0x1012acd58 then0x1012ad570 to combine constructed results. Actual subscription/ordering/cancellation requires helper contracts.|

The highest-value next executable query is `0x1012baef4`; the always-created async path is supplied through data address `0x103788e38`, whose entry must first be resolved from checked descriptor bytes. `0x1012a9b80` receives state plus the normalized flag and is the next history/coalescing boundary. None of these callsites alone proves a file/preferences/network write, concrete instance, or lifetime.

[common-mutation-followup.json](common-mutation-followup.json) retains exact source hashes and instruction text for every anchor.
