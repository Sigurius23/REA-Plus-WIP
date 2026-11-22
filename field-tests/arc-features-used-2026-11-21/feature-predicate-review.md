# Feature inclusion predicates

The selected extractor `0x101160524` builds labels in this exact order: **css, js, font, textTransform, textZoom, zaps, colorScheme**. Each label is appended at most once. These are static inclusion rules for its input representation, not observed stored features, runtime rendering or completed persistence.

The companion [JSON](feature-predicate-review.json) authenticates the canonical input records and records every branch/store anchor. No provider, target/fixture execution, production edit or Git operation was performed by this review.

Let `P` be incoming Swift-self `X20`, `u8/u64` denote unsigned byte/word reads, and `q = u64(P + 0x48)`. The helper at `0x101159224` returns `min(q,0xffffffff)+1` modulo 32 bits, so its result equals **1 exactly when `q == 0`**. This is the common absence gate. Calling it an Optional-none discriminator requires the selected value's type/ABI; the raw gate needs no guessed enum name. Predicates below assume ordinary valid, stable Swift storage and normal returns from the retained helper/import paths. Without that stability premise, each load is a fact at its individual instruction time.

| Output label | Exact inclusion predicate |
| --- | --- |
| css | `q != 0 && !Blank(words at P+0/P+8)` |
| js | `q != 0 && !Blank(words at P+0x10/P+0x18)` |
| font | `q != 0 && u64(P+0x28) != 0` |
| textTransform | `q != 0 && u8(P+0x30) != 3` |
| textZoom | `q != 0 && u8(P+0x40) != 1 && u64(P+0x38) != 100` |
| zaps | `q != 0 && u64(q+0x10) != 0` |
| colorScheme | `q != 0 && u8(P+0x68) != 3` |

`Blank` is precisely bit zero of helper `0x101159ec4`'s result. For an absent parent the extractor supplies zero String words and receives true, so CSS/JS are omitted. This helper also returns true when its incoming second word is zero. Otherwise it obtains `CharacterSet.whitespacesAndNewlines`, runs the generic helper `0x10080fc90`, constructs a String from the resulting Substring and compares the representation's length with zero. The generic helper's retained instructions scan forward and backward using Unicode scalar indexing and CharacterSet membership, retaining the interior slice. Under the retained Swift/Foundation import ABI this supports **empty after trimming leading/trailing whitespace and newlines**, rather than merely “non-nil String.” It is not a CSS/JS parser or an execution test. The direct low-level helper predicate remains the exact claim independently of that API interpretation.

The font path does not run `Blank`. In particular, it should not be described as a nonblank/nonempty font test. The transform path tests raw byte 3; the zoom path tests byte 1 plus integer word 100, not a floating-point equality. The zaps path tests the header word at pointer `q + 0x10`, conventionally a Swift collection count, not the number of matching webpage elements. Exact Optional case names and semantic “disabled/default” values are not inferred from these numbers alone.

## Metadata binding and the field-order trap

Retained bytes identify the nongeneric struct descriptor `0x103d77978` as `InternalData`, with a retained nominal ancestor `BoostData`. Its field descriptor is `0x103eb25f8`; static metadata `0x104306a00` has kind `0x200`, points back to that exact descriptor, and uses declared field-vector word offset 2. Signed field-record name pointers and actual offsets give:

| Index | Name | Instance offset | Type mangling |
| ---: | --- | --- | --- |
| 0 | css | `0x0` | `0x103bd12ac` |
| 1 | js | `0x10` | `0x103bd12ac` |
| 2 | font | `0x20` | `0x103bd12b2` |
| 3 | textTransform | `0x30` | `0x103bd12ba` |
| 4 | textZoom | `0x38` | `0x103bd12c2` |
| 5 | zaps | `0x48` | `0x103bd12d2` |
| 6 | colorScheme | `0x50` | `0x103bd12ca` |

The reflection String pool happens to place `colorScheme` before `zaps`. Zipping that pool's string order with metadata offsets would swap the two fields. The signed pointers in each record, rather than pool order, bind the names above. This metadata establishes field identity/layout; the extractor's exact formal outer Optional type is not inferred from its anonymous name.

## The large color comparison collapses to one byte test

The helper `0x10115923c` is a complete 40-byte routine with only stores and a return. It initializes a 154-byte representation to zero except for byte `+0x18`, which is **3**: `MOV W8,#3; STP XZR,X8,[X0,#0x10]`. Its final vector store at `+0x8a` covers through byte `+0x99`; overlaps affect only already-zero bytes.

The main routine takes input bytes `[P+0x50,P+0xea)` into the selected color representation `A` when the common parent gate passes. If the gate fails it initializes `A` with this same helper. It independently creates comparison baseline `B` with the helper at `0x101160880`. The vector copies preserve `A+0x18` and `B+0x18` while moving them to `SP+0x280` and `SP+0x320` respectively.

The complete read-only discriminator `0x101164904` returns 0 for input byte `t <= 2`, and `t - 2` for `t >= 3`. Its result equals **1 iff `t == 3`**. This follows from the actual W-register arithmetic and signed conditional select, and was independently checked as arithmetic for all 256 possible bytes without executing target code.

Consequently `D(B) == 1` on both paths:

- If `D(A) == 1`, instructions `0x101160918..0x101160928` test the same known baseline and omit the label.
- If `D(A) != 1`, `0x101160960..0x10116096c` again tests the known baseline and falls directly into the append block at `0x101160970`.

Thus the second tag decoder `0x101163360`, payload comparison `0x101161674`, and its nested call `0x1011614b4` are **unreachable for this constructed baseline** under the stated normal helper/memory semantics. A full nested-color equality query is unnecessary for this inclusion question. The result is exactly parent gate present plus `u8(P+0x50+0x18) != 3`. It is not an RGB comparison, a theme name, a count of changed channels or proof that any displayed color differs from a visual default.

For completeness, the retained second tag helper returns 0 for byte 0/1 and `t-1` for `t>=2`; it equals 1 iff `t==2`. The unused payload comparison checks three floating-point values, a low Boolean bit and further tagged payload structure. Those facts do not change this extractor's simplified rule and do not establish color semantics.

## Limits and remaining queries

The seven label literals are constructed directly in instruction immediates and stored into the result array. Allocation, capacity and copy-on-write branches arrange the result buffer; they do not add further feature predicates on normal return. The result says nothing about active dependency injection, actual model instances, storage success, durable readback, DOM effects, CSS/JS validity or color appearance.

A bounded public read of the field type manglings at `0x103bd12ac` through approximately `0x103bd12d7` can strengthen the descriptions of Optional/String/collection cases. Any symbolic references should then be followed only at their exact selected descriptor/indirect slot. No further nested color-payload helper is needed to establish the inclusion predicate. This review has not run those queries.
