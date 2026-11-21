# JavaScript activation — two model-data merges

The newly inserted local-ID path constructs **two sequential model-data merges**, not a final inactive model. First it serializes a reconstructed model with `isActive=false`. If that merge completes without an error, it then serializes the **original captured model** and enters the same merge request path again. The previous resolution note deliberately left these final continuations open; the new leaf replies close that control-flow gap without changing older notes or captures.

The original model address is retained at async parent+`0x58`. In `0x10117d424`, `0x10117d450` loads that address into `x20` as the source of `0x101158eb0`; the distinct temporary output address comes from parent+`0x70` into `x8`, with `w0=0`. That helper reconstructs the output and assigns its `isActive` byte from `w0 & 1`. The first serializer call at `0x10117d46c` uses the temporary.

The new success continuation `0x10117d570` establishes the second model source directly: `0x10117d588` loads **parent+`0x58` into serializer self register `x20`**, then `0x10117d590` calls `0x10115b98c`. It preserves the serializer result at parent+`0xb8`, installs completion `0x10117d5d8`, sets `w1=1`, and raw-branches to shared async setup `0x10117cd20` at `0x10117d5d4`. That setup reaches the already captured Firebase merge worker `0x10117cd3c`. It does not select the parent+`0x70` temporary for this second serialization. Fresh instruction Evidence: `ev_4e68c699bed4434f9f92c5c5dc0e4b74fd7a9d5de6e67cff038eb59d6dd9a67e`.

| Path | First model-data request | Following model-data request |
| --- | --- | --- |
| Newly inserted ID | Reconstructed `isActive=false` model; completion `0x10117d4fc` | Original parent+`0x58` model, only after no-error first completion; completion `0x10117d5d8` |
| Already-present ID | Original parent+`0x58` model; completion `0x10117d5d8` | This selected path omits the temporary-model request. |

First-merge completion `0x10117d4fc` stores asynchronous error `x20` at parent+`0xb0`. Zero selects `0x10117d570`; nonzero selects the newly captured terminal error resume `0x10117d818`. That resume reloads **parent+`0xb0` into `x20` at `0x10117d840`** and branches to the parent continuation at `0x10117d868` after cleanup. Thus the observed first-error path bypasses the second merge. Fresh error-resume Evidence: `ev_ef254905e5f9a03aeb210d78c1521767d1936d38fc4f529fc26914b071cc022b`.

For the second merge, the prior `0x10117d5d8` stores error `x20` at parent+`0xc8`; `0x10117d86c` reloads that word into `x20` and branches to the caller continuation. No-error second completion proceeds to `0x10117d64c`, which separately constructs a `featuresUsed` update. Therefore “two model-data merges” is not a total count of every later possible write.

The pointer/ABI facts come from physical instructions; incidental decompiler variable names are not used to choose the second model. The JSON companion hashes the four fresh leaf records and seven supporting records, and preserves the prior resolution hash. These are static request construction and completion branches. No actual dependency injection, service execution, successful durable writes, server ordering, final persisted value or JavaScript effects were observed. In particular, **the inactive temporary must not be presented as the final persisted state**.
