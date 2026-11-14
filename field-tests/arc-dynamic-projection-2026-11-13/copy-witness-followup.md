# Outer singleton completion and preinitialized copy witness

Read-only supplemental follow-up, 2026-11-13. No provider, build, target/library execution, network, Git operation or production change occurred. Earlier indexed files remain unchanged. The retained Evidence is distinguished below from direct mapped-byte/disassembler observations.

## Answers

Yes: for descriptor `0x103d7b260`, the three singleton-initialization relative fields resolve to cache `0x104627270`, incomplete metadata `0x104627290`, and completion callback `0x1012b8550`. The incomplete metadata's header word at metadata minus 8 already identifies VWT `0x104627200`. That VWT's initializeWithCopy slot at +16 already identifies function `0x1012b795c`, despite its preinitialization size and stride both being zero.

The existing owned compiler assembly matches the complete descriptor shape and explicitly ties +32 to the metadata address and +36 to its completion callback. This is structural corroboration, not an assumption that every Swift descriptor has these fields unconditionally.

The copy target is a substantial enum copy witness, not memcpy. Its complete body is now available from the existing ignored Arc input. However, two obligations remain open: proving that metadata completion leaves the runtime VWT pointer/copy slot equal to the preinitialization candidate, and proving the candidate's complete transitive nonescape/effect behavior. The completion callback passes metadata to an external runtime initializer; its effect on VWT function slots is not established by these sources. The file's VWT/metadata are writable, so slot replacement cannot be excluded.

## Retained Evidence and relative-field arithmetic

All Arc observations bind image SHA-256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

| Source | Evidence ID |
| --- | --- |
| `../arc-persistence-routes-2026-11-08/outer-vwt-restored/outer-descriptor-singleton.evidence.json` | `ev_f049957c9e044cc8265933fd788db657145580bf8f9f247eaf6c72b4476997eb` |
| `outer-incomplete-metadata.evidence.json` in the same directory | `ev_560145eef65bae2c19294189484ae6b69b4c436cb9d4fe2b5d5c6c0cc6c7f841` |
| `outer-value-witnesses.evidence.json` | `ev_0215a74d8f1d0063634747a16e2b8b70367a8e36be178d7152550d49e4d039bd` |
| `outer-declared-copy-witness.evidence.json`, first 768 code bytes | `ev_daf14a62afce1a336d8a8e61a06370ab15e5ed6e731d37f3928cc87d09bc48e3` |

For D=`0x103d7b260`, each signed 32-bit relative displacement is based on its own slot:

| Descriptor offset | Slot | Stored displacement | Target |
| --- | --- | --- | --- |
| +28 | `0x103d7b27c` | `0x008abff4` | `0x104627270` cache |
| +32 | `0x103d7b280` | `0x008ac010` | `0x104627290` incomplete metadata |
| +36 | `0x103d7b284` | signed `-44838196` (`0xfd53d2cc`) | `0x1012b8550` callback |

The retained bytes at `0x104627288` begin with effective pointer `0x104627200`, then metadata kind `0x201`, then descriptor backpointer `0x103d7b260`. Thus `0x104627288` is the VWT header slot, not the metadata address returned by the descriptor's +32 relative field. The metadata address is eight bytes later.

The retained VWT has eight nonzero function pointers at offsets 0..56, zero size at +64 and zero stride at +72. Slot +16 is `0x1012b795c`; it is not inferred from a helper name. The newly retained complete generic wrapper at `0x10000828c` loads metadata[-8] then VWT+16 and calls it with destination/source/metadata, independently matching the owned compiler's initializeWithCopy call shape.

## Owned assembly match

`ArcSecondArgumentProjection.O.s` was already compiled and indexed before this follow-up; it was only read here. Its `FixedAction` descriptor has the same flags `0x10052`, payload-count/size-offset word `0x02000003`, empty count 1, then these three directives (symbol prefixes shortened):

```asm
.long FixedActionOMl - FixedActionOMn - 28
.long FixedActionOMf - FixedActionOMn - 16
.long FixedActionOMr - FixedActionOMn - 36
```

The second directive is stored at D+32, so its relative target is `FixedActionOMf+16`, not the start of the complete metadata storage symbol. That symbol starts with `.quad 0`, `.quad FixedActionOWV`, `.quad 0x201`, `.quad FixedActionOMn`, `.quad 0`. Therefore metadata is OMf+16 and metadata[-8] is the OWV pointer at OMf+8. The third directive resolves exactly to OMr.

The owned OWV preinitializes eight function slots, including `FixedActionOwcp` at +16, then zero size and stride. Its ordinary outlined copy wrapper invokes that slot. The completion callback OMr calls `_swift_initEnumMetadataMultiPayload` after forming an array of payload layouts. Arc's callback has the same observed call shape: metadata in X0, 0x100 in W1, 3 in W2, layout-pointer array in X3. No unverified meaning is assigned to flag 0x100 here.

## Exact Arc callback

The same ignored `rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64` image is 80498448 bytes and matches the retained SHA-256. Its validated `__TEXT` mapping has VM base `0x100000000`, file offset 0 and initialized size 69386240. LC_FUNCTION_STARTS contains exact callback and copy-witness entries and supplies their next function starts.

Callback `[0x1012b8550,0x1012b85c8)` is 120 bytes, SHA-256 `ffa63d0757d05714c7d7be866f8402b337e0c556c0a78f9ec9ecd97683f5d251`.

It saves the metadata argument, puts layout pointers `0x103788c68` and `0x103788c80` in a private three-entry array, requests metadata from accessor `0x1012b76ac` with request 0x13f, and checks returned X1 against 0x3f. On the ready path it adds the third layout pointer as returned metadata[-8]+64, then calls `0x1036403a8`. The exact Mach-O indirect-symbol entry names that thunk `_swift_initEnumMetadataMultiPayload`. Success returns X0=X1=0; the dependency path returns X1=0x3f. Its own stores target only its stack array/saves.

Directly mapped scalar bytes at the two static layout pointers corroborate payload layout sizes/strides 33/40 and 156/160. The 156/160 pair matches the reflected fixed child. The third layout remains runtime-derived. These do not provide a numeric completed outer size.

The callback itself contains no explicit VWT-slot writes, but the external initializer receives metadata that can lead to the mutable VWT. Its implementation/effect contract was not part of this read-only scope. Consequently:

- There is no proof here that completion changes the copy pointer.
- There is also no proof here that completion preserves that pointer or metadata[-8].
- Passing a metadata address to an initializer is not evidence that its VWT function fields are immutable.

## Exact preinitialization copy target

Function `[0x1012b795c,0x1012b7d54)` is 1016 bytes / 254 fixed-width instructions, SHA-256 `cb93a8e067e4b3061a33ac4d70a5d802d8ecba5625bec6e1e58c826ab7ff9444`. Its first 768 bytes exactly equal the retained copy-witness byte record. Supplemental bounded disassembly now covers the remaining 248 bytes too. The disassembler's distant nearest-symbol heading is not treated as the function's name; ownership comes from LC_FUNCTION_STARTS and exact address bounds.

It saves metadata in X20, source in X22, destination in X19, and calls exact `_swift_getEnumCaseMultiPayload(source,metadata)`. Its paths differ:

| Source outer tag | Observed behavior |
| --- | --- |
| 0 | Loads the 33-byte payload, calls value helper `0x1012b7558`, copies it, stores outer tag 0 |
| 1 | Loads/duplicates the full 156-byte fixed child by value, calls helper `0x1012b759c`, copies the 156 bytes to destination, stores outer tag 1 |
| 2 | Performs additional metadata/layout queries, optional-payload handling, direct field copies/retains, indirect value-witness calls, then stores outer tag 2 |
| Other valid tag | Tail-calls exact memcpy with runtime outer VWT size |

In particular, tag-1 storage covers offsets 0..155 and the final runtime tag store receives X0=destination, X1=outer metadata, W2=1. This is a typed enum copy implementation with reference-management work, not a pure byte-copy primitive.

The tag-1 helper `0x1012b759c` has complete LC_FUNCTION_STARTS range `[0x1012b759c,0x1012b76ac)`, 272 bytes. It switches on the copied child's tag bits, performs `_swift_bridgeObjectRetain` and other value-oriented calls/tail calls, and uses the witness's private argument area for large by-value data. Its further targets include `0x10002efe0` and `0x1011659bc`. The observed explicit argument flow on the outer tag-1 path forwards flattened payload contents, rather than the original outer source/destination addresses, to this helper. That is useful partial evidence but not a complete transitive nonescape proof.

The full outer witness also has other branches passing destination-derived addresses to indirect witnesses. No all-path purity or nonescape conclusion follows by examining only its tag-1 byte stores. To use a case-restricted summary, the producer must additionally prove which witness paths can produce the later observed outer tag 1, preserve memory effects/aliases along them, and justify every relevant runtime/deep-helper effect. None of those obligations is replaced by the fact that VWT+16 is the initializeWithCopy slot.

## Chained-pointer and mutation limits

The Arc input has LC_DYLD_CHAINED_FIXUPS. The relevant `__DATA` chained-starts record reports pointer format 6 and 16384-byte pages. Raw file words are encoded, for example:

```
VWT+16 raw file word:        0x00010000012b795c
metadata[-8] raw file word:  0x0020000004627200
```

Those are not literal absolute addresses. Effective targets above come from retained Ghidra loaded-byte Evidence; this follow-up did not silently mask/decode arbitrary chained-pointer words. Mapped instruction bytes and scalar layout records were read only after segment/file-bound validation. Both VWT and incomplete metadata lie in initialized `__DATA` with read/write initial and maximum protections (3), so file placement supplies no immutability proof.

The next missing proof is therefore concrete: establish the singleton completion/runtime initializer's treatment of metadata[-8] and VWT function slots, then bind the actual completed initializeWithCopy target and prove its relevant transitive effects. Until then `0x1012b795c` is a verified preinitialization candidate, and item 55/Arc recovery remains open. New observations and exact ranges, source hashes, field arithmetic, ASM line anchors and unresolved calls are retained in `copy-witness-followup.json`; binary/cache artifacts remain ignored locally.
