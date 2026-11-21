# JavaScript activation — retained instruction review

The outer dictionary converter `0x10115ae9c` writes this Boolean to `BoostData.isActive`:

```text
parsedStoredIsActive && (locallyEnabled || !predicateResult)
```

This algebra is observed directly. The predicate is returned by `0x101159db4`; connecting that wrapper to the inspected JavaScript predicate is a pending targeted query. When that connection holds, JavaScript-bearing data requires its identifier in the local enable Set; data without JavaScript uses the parsed stored flag.

The critical instructions are `0x10115b69c..0x10115b6b4`: load the original incoming `w1`, ORN with the predicate result saved in `w20`, AND with parsed `isActive` in `w21`, mask bit0, store through the metadata-vector key `0x2c`. The input flag was preserved at `0x10115af64`. These are three independent values; decompiler temporaries assigned to intervening release or cast results do not redefine them. Instruction Evidence: `ev_4c006d9059fb2af2a634c3fb492f3ab140409e116eaf68f3517f2f64b34637f5`.

The stored `isActive` field is parsed as a **String**. A missing key or failed String cast defaults to true (`0x10115b648` → `0x10115b67c`). Exact String `true` uses a two-word fast comparison; other representations go through Swift String equality at `0x10115b95c`, whose return is saved into `w21`. Other Strings yield false. No native Bool cast is observed in this selected branch.

The incoming local-enable flag is a Set membership result. Callback `0x101180780` receives captured Set storage in `x3` and identifier String words in `x4/x5`, calls `0x100250910`, saves return `x0` in `x25`, then sets converter `w1 = w25 & 1` at `0x1011808c8`. The converter receives dictionary `x0` and result address `x8`. The Set lookup returns1 only on an equal String, and0 on empty/probe miss. Evidence: callback `ev_c96dcd548e286d8bc453fbe19901c185bb710e4fcab8be3e926aaf87d4858458`; lookup `ev_dea92a8dd27379ddf34941e36a3931d3c4ac811c3141c4bbe8a104a5aa203852`.

Metadata names the local field `StorableBoostsData.locallyEnabledBoostIDs`. The success path of `0x10117fec8` preserves the returned second word at async frame+`0x148`; `0x1011800bc` selects it or `swiftEmptySetSingleton` and captures it for the callback. The exact thunk `0x101183510` forwards that captured Set in `x3`. This is static typed/capture binding, not an observed runtime store instance.

The predicate `0x10115a958` loads `InternalData.js` at self+`0x10`/+`0x18`. It returns0 if optional-data tag helper `0x101159224` returns1 or the second String word is zero. Otherwise it obtains `CharacterSet.whitespacesAndNewlines`, passes the String through `0x10080fc90`, converts the Substring result and tests its resulting length. This strongly supports a nonblank-JavaScript predicate; the exact generic String operation is a remaining corroboration query. `BoostData.data` is `InternalData?`, supported by its symbolic type bytes and the observed InternalData descriptor/name/static field vector. Predicate instructions: `ev_eaaa235e7a1fc8b6649fbb78817e3376d8c2e5fe72b348576f91517b80f5f7f5`.

The tag helper reads **self+`0x48`**, unsigned-clamps the loaded 64-bit word to `0xffffffff`, and adds1 in `w0`. This is the optional-data tag path, not a `BoostType` getter. Raw helper Evidence: `ev_aa68ac9d3558d7bbb84286b2c965d0a61b78e1d9d5053f6dda05add8b2ad2da9`. Valid typed values are assumed; arbitrary corrupt values are not validated by this interpretation.

`0x1011867b0` inserts an identifier into a Set: `x20` points to its storage word, `x0` is the returned-member output address and `x1/x2` the identifier. Existing-member path returns0; insertion stores updated storage and returns1. The return is an **insert flag**, not save success. The selected Firebase setter requires `isActive == 1` and the predicate result before scheduling `0x10117d3d8`; that continuation's flag consumption and local store write remain next. Set-insert Evidence: `ev_fa5a12c715e514d1c7bc4cb7d6f29ea47cd0697ee7e8fb2abd2e80fdefa62ee5`.

Required-field/primary JSON decode failures return `Optional<BoostData>.none`; primary JSON errors are released. Optional signature decode failure instead yields a nil signature and keeps constructing the model. In the getter callback, incoming errors resume a throwing continuation; nil document/converter-none constructs the previously bound `BoostsClientError.doesNotExist` raw tag1. Separately, physical instructions in `0x10117fec8` distinguish successful local read → `0x1011800bc` from error → `0x10117ff84`; the decompiler omitted that branch. Do not infer that a local-read error automatically becomes an empty Set.

Next public bodies: `0x101159db4`, `0x10080fc90`, `0x10115aa74`, `0x10117d3d8`, `0x10117d5d8`, `0x10117ff84`. The JSON companion authenticates sources, records exact register flows and keeps these gaps separate. No target/provider was launched by this reviewer; no actual dependency injection, JavaScript execution, completed request or durable readback is established.
