# Boost IDE wire keys

The public conformance selector identifies the CodingKey string getter at
`0x100537d58` and initializer at `0x100537da4` in the immutable Arc image.
Metadata Evidence: `ev_9d50fff65fa905fea69af8137ef48634f9c5c87895b20eeedd41e4d848bd6031`.
The getter dossier is `../native/coding-key-string-getter.evidence.json`
(`ev_89b27c5d0976204abf9cf0877bd1565bdd608139cf1765b0d5e47c4310a8fe88`).
For valid enum ordinals 0, 1 and 2 it returns immediate words whose little-endian
UTF-8 payloads are **boostId**, **type**, and **data**. This is static instruction
interpretation, not merely a reading of declared enum case names.

The initializer delegates to `0x100538248`. Its dossier
`../native/continuation-session/coding-key-init-helper.evidence.json`
(`ev_be956ece0478bcc7723fae99f1c75fbf060be3ab2fcb6abcc11a059af068ac8b`)
compares those same full String values, using the standard String comparison
fallback, and yields the three cases or the optional failure representation.

The payload's CodingKey conformance is `0x1036a3b08`; its string getter is
`0x1004ca35c`. Exact metadata is in `payload-key-conformance.cli.evidence.json`.
The partial Ghidra Program has no procedure there. The public 24-byte read
`ev_3940cb2b9d9270ed91326a35aa9ffaac19ad77a8d1e91d99976e173b92babe51`
and the explicit six-instruction analyst derivation in
`payload-key-byte-derivation.json` establish the constant **contents** String.
No disassembler discovery or runtime evaluation is claimed for that derivation.

Combined with the earlier request decoder and payload String decoder, the
statically derived message shape has String `boostId`, one of the four command
names (`v2-load-css`, `v2-edit-css`, `v2-load-js`, `v2-edit-js`), and
`data.contents` as a String. No message was submitted. Subsequent Boost lookup,
concrete delegate handling, persistence and visible effects remain unresolved.

An owned Swift enum deliberately uses raw values different from case names
(`OwnedWireKeys.swift`). It was compiled and its metadata inspected, never
executed. Its compiler symbols are supplemental oracles. Emulation was not used:
the earlier temporary Python environment no longer exists and the checked
existing Python has neither required module; no dependency was installed.
The attempted `open_binary` selection of `native-macos` was a caller routing
mistake, retained under `mcp/`, not a product defect.
