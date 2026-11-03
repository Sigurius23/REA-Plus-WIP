# Swift error-flow interpretation reproduction

`OwnedPayload.swift` is a 318-byte owned source with two explicitly throwing
Decoder calls. Installed Swift 6.3.3 compiled it; the dylib was never executed.
The metadata selector (`metadata.cli.evidence.json`) independently identifies
its Decodable witness. The public Ghidra capture has five successful calls,
no caller function seeds, a complete export, and verified empty descendants.

Witness Evidence
`ev_ed7af7ef81e435ae504cf6bfe8cb8aa37aaca115c22b3dd076dbf835f333343c`
shows these facts simultaneously:

- Assembly has `0xefc: cbz x21, 0xf3c` after the String decode call.
- Machine basic-block successors preserve error `0xf00` and success `0xf3c`.
  The output store at `0xf5c` lies on success.
- Pseudocode warns that `0xf00` is unreachable and has no second error guard
  around the output assignment. High p-code has no CBRANCH at `0xefc`.
- `native_value_flow.truncated` is false. This describes retention limits and
  does not establish semantic correctness. The reported convention is already
  `__swiftcall`, so a convention-name-only explanation is insufficient.

Swift's [calling-convention summary](https://github.com/swiftlang/swift/blob/main/docs/ABI/CallingConventionSummary.rst)
assigns the synchronous error return to x21. The observed loss is consistent
with incomplete throwing-call/error-register modeling; the exact upstream cause
is unproven. REA+ preserves the original assembly and machine CFG, which remain
available for corroboration. This is item 47, a Ghidra integration/interpretation
gap, not a loss of the entire machine CFG or a result-size truncation defect.

`reproduction-receipt.json` pins the source/artifact hashes, addresses and exact
scope. The analogous Arc payload decoder is retained separately at
`../native/payload-decoder.evidence.json`. Investigate the producing call model
and expose affected semantic uncertainty before using these decompiler-derived
paths as proof of success or failure behavior.
