# JavaScript activation — final retained follow-up

The selected read path constructs:

```text
BoostData.isActive = parsedStoredIsActive && (locallyEnabled || !hasNonblankJS)
```

The register expression is `(w21 & (savedIncomingW1 | ~w20)) & 1` at `0x10115b69c..0x10115b6b4`. Stored `isActive` is a String: missing/wrong-type values default true, exact String `true` parses true and other Strings parse false. Callback Set membership is passed directly in converter `w1`; the initial review records those physical instructions and source hashes.

The newly captured `0x101159db4` **directly** implements the present `InternalData.js` predicate rather than forwarding to `0x10115a958`. It reads the String words at self+`0x10`/+`0x18`, returns false for nil, obtains `CharacterSet.whitespacesAndNewlines`, uses the generic String/Substring pipeline and returns whether the resulting String length is nonzero. The setter predicate `0x10115a958` adds the optional-data tag gate before the same pipeline. The exact generic String operation `0x10080fc90` remains a narrow corroboration gap; trimming is strongly inferred. Fresh predicate instruction Evidence: `ev_85e6ac5c3244f5604392ebc5620caa33bf625362af2d5f2fcc2796a853c51355`.

Fresh static metadata at `0x104308070` gives `StorableBoostsData` field offsets0 and8. Together with the prior exact field records/names, this binds the captured second word to `locallyEnabledBoostIDs` at offset`0x8`. Evidence: `ev_d1995c11b69b6f690abdf70f084d2fb6c80bd2307408817705b418b2122d89c1`.

The previously unresolved local-read error fallback is now explicit. `0x10117fec8` tests `x21`, releases the error and schedules `0x10117ff84`. That fresh resume loads `swiftEmptySetSingleton`, stores it at async parent+`0x150`, captures it for the callback, then constructs the same checked continuation/remote-get path. Thus this selected local-read failure proceeds with an empty locally-enabled Set; the subsequent converter suppresses active JavaScript-bearing data. This closes an initial review gap, without changing the initial capture or note. Error-resume Evidence: `ev_5d5a31e211528da6685e1ee71b8f59bd9654541c092979438c29f805f53be641`.

Local enabling is a preliminary step before the Firebase merge path. `0x10117d3d8` saves the returned **insert flag** from `w0` at parent+`0xe8` and schedules `0x10117d424`. Both flag branches serialize a model, join at `0x10117d4d4`, pass `w1=1` and raw-branch to async setup `0x10117cd20` at `0x10117d4f8`. That setup reaches the previously captured merge-write worker `0x10117cd3c`. Therefore the local-enable branch is not an exclusive alternative to Firebase writing. Branch instruction Evidence: `ev_c808f2a87d30e301b712fa3b6a02c3126bf554aec308b1baf62f3f190bce09cb`.

There is a meaningful difference between the branches. Insert flag1 calls `0x101158eb0` with the original model in `x20`, a temporary output model in `x8` and `w0=0`, then serializes that temporary and installs completion `0x10117d4fc`. Other flag values serialize the original model and install `0x10117d5d8`. The transformed field remains unassigned until `0x101158eb0` is read; naming it from `w0=0` alone would overstate the evidence.

For the latter completion, `0x10117d5d8` saves asynchronous error `x20` at parent+`0xc8`. Zero schedules `0x10117d64c`, which builds a `featuresUsed` update and another async operation; nonzero schedules `0x10117d86c`. The error resume reloads the saved object into `x20` and branches to the caller continuation. The insert1 sibling `0x10117d4fc` remains next. Completion Evidence: `ev_b33539edac95c6958618ec106b60da61db79ddfd18462adc3e33b11a7069cdfa`; error-resume Evidence: `ev_7aa2c7fb764b91a4a4dcd8c4d9a11ae9fbc8496eb752fbbcdae20601024dbece`.

The selected interface is `BoostsClient.setBoostData`, field6/offset`0x60`, distinct from `applyToWebContent`, field13. These are static dependency/adapter and request-construction facts. No active injected instance, completed local/remote write, durable readback or JavaScript execution was observed. Root owns the live session's export, close and cleanup.

Next public bodies: `0x101158eb0`, `0x10117d4fc`, and the narrow String-operation corroboration at `0x10080fc90`. The JSON companion authenticates the fresh replies and preserves the earlier review hash.
