# Arc cache contexts and selected closure lifetime — 2026-11-24

The selected cache key/context comparison and the local post-getter ownership
window now have source-bound checks. This narrows item 63: live/test cache
entries are distinct, and destroying the temporary Client does not by itself
invalidate the retained closure pair under standard Swift ABI/ARC premises.
The concrete Client returned by the getter, earlier instance/keypath/copy
relations and a first-class typed invocation mapping remain open.

The fixed Arc 1.172.1/build 90370 arm64 input is unchanged: 80,498,448 bytes,
SHA-256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.
The previously qualified final blob runtime is used unchanged. Arc, helpers,
shipped JavaScript, profiles, accounts, UI and services were not launched or
accessed. Owned C was compiled and emulated only; explicit raw-memory replays
do not represent observed Arc cache contents or valid live Client objects.

## Cache identity and callback bridge

At `0x1006fd210`, the selected dictionary hashes the 64-bit key identity and
the low context byte. It uses the imported seeded Swift Hasher constructor,
UInt combine and finalize operations. Its seed comes from the supplied
header+0x28; this is distinct from the already recovered suite-name hash.
Neither an actual runtime seed nor a bucket placement is recovered here.

The tail beginning `0x1006fd27c` probes the occupancy bitmap and 16-byte key
records. It compares the record's word at +0 with the incoming identity and
its byte at +8 with the incoming context byte. A hash collision therefore
does not turn a different context or identity into a cache hit. The return
registers carry the slot in X0 and the found flag in W1. The bounded Program's
function body includes this tail across another LC_FUNCTION_STARTS entry;
that observation is not a new global function-boundary or type override.

The newly followed bridge makes the argument relationship explicit:

| Step | Source observation |
| --- | --- |
| Getter adapter `0x1006fbea4` | Saves incoming cache/key/context; stores the context byte at SP+0x40 |
| Operation capture | Supplies callback `0x1006fe650` with capture SP+0x10 to synchronous TaskLocal.withValue |
| Callback | Loads cache/key from capture+0x20, context byte from capture+0x30, metadata/witness from capture+0x10 |
| Cache selection | Calls `0x1006fc894` with those inputs; its lookup forwards identity/context to `0x1006fd210` |
| Test-context diagnostic wrapper | `0x1006fd194` reloads its saved context byte and calls the same adapter |

The earlier context metadata/policy binds live/preview/test to 0/1/2. Under
that selected valid-input route, the same key in test context cannot satisfy
a live-context lookup. This does not establish the contents of either entry.
The normal entry requests `lock`, and the shared normal exit requests
`unlock`; the lock's concrete class, abnormal paths and concurrency guarantees
are not inferred from these selector names.

The present-value cache setter at `0x1006fc050` forwards both key words to
`0x1006fdbf0`, whose existing source observations use the same pair lookup and
ordinary insertion/replacement branches. The absent-value route enters
`0x1006fcfbc`, probes the same pair, and on a hit copies out the stored value
before calling `0x100710288`. The latter bucket-removal/repair helper's full
effects remain unqueried; no whole-cache flush or complete rehash proof is
claimed. COW and generic witness side effects remain explicit premises.

## Bounded probe corroboration

An owned C reference represents only the observed raw offsets, not a recovered
Swift nominal declaration. Both it and Arc's admitted 120-byte probe receive
explicit synthetic headers, keys, bitmaps, hash 6 and eight-slot scale 3.

Seven pairs return the expected same slot/found values: live and test entries
for one identity, a preview miss, another identity after wraparound, an absent
identity, an empty table and a raw high-bit context-mask control. In the main
fixture, slots 6, 7 and 0 are occupied, so the comparison is tested through a
collision chain and wraparound. The high-bit control is not asserted to be a
valid Swift enum value. A deliberately full malformed table stops at the
200-instruction limit in both implementations; its unfinished registers are
not compared as returned results.

These experiments qualify the selected raw probe for these inputs. They do
not reconstruct an actual Hasher seed, generalize to every table scale or
simulate the whole DependencyValues runtime.

## Client copy and local ownership

Public original metadata reads bind the Client VWT at `0x1042c8a58`: destroy
slot +8 points to `0x100d97a34`; initializeWithCopy slot +16 points to
`0x100d97b04`. Original chained pointer words and loader-applied rebases are
checked separately. The reused declaration binds the exact Client and its
23 physical closure fields.

Copy adapter `0x100cce81c` receives source first and destination second, then
passes destination/source/Client metadata to that VWT copy. The selected copy
routine writes all 368 bytes before its first external retain and subsequently
contains 23 retain calls. Two public CLI replays use explicit arbitrary source
bytes and private initialized destination/stack regions: the first stops at
an explicit caller address; the second stops before the external retain at
`0x100d97c04`. Both destinations match all 368 input bytes after 64 instruction
entries. Only 367 bytes change because one supplied byte already equals zero.
The copies do not complete ARC initialization or execute any imported runtime
routine, and the arbitrary inputs are not claimed to be valid Swift closures.

At the actual worker, the retained native sequence is:

1. `0x1012ab824` loads code/context into X23/X21 from the getter's output.
2. `0x1012ab82c` calls swift_retain on that context.
3. `0x1012ab834` invokes `0x1000078a4`, which dispatches the exact Client's VWT
   destroy slot. The selected destroy body releases all 23 context fields;
   it does not explicitly write X21 or X23.
4. `0x1012ab838/83c/840` sets argument 49, restores Swift context X20 from X21,
   then calls X23. After invocation, `0x1012ab84c` releases the saved context.

With valid delivered Client storage, ordinary Swift ownership, standard runtime
bindings and calling conventions, the saved pair survives these intervening
calls and the extra retain protects its context while the temporary Client is
destroyed. This is a local ownership/register derivation, not a blanket claim
of memory purity. Mutable captured contents, earlier Root/wrapper copies,
which value the getter delivered, or which custom override might be installed
are not determined by it. No helper-wide enum domain or CFG mutation follows.

## Qualification and recovery

`qualification-verification.json` checks 237 public MCP attempts: 232 successful
calls, one rejected caller seed file and four expected missing-procedure
queries in the bounded Program. Two captures complete; the rejected seed
attempt fails before native analysis. The corrected seed is a new file with
its own source-bound receipt, preserving the original invalid TSV and error.
Use `plan-complete.json` and `seeds-cache-corrected.tsv` for the corrected
request; `plan.json` records the rejected input.
Unlisted native decoding answers the selected cache-insert question; the
exploratory `0x1006fc700` query was not promoted into a discovered function.

The final main bundle has 1,431 records and retains all three revisions of the
same open Client unknown. Four complete CLI/MCP probe Evidence pairs agree.
The two copy-prefix results are standalone CLI Evidence, explicitly separate
from that bundle. Eighteen emulator results comprise fourteen normal probe
returns, two budget stops and two copy-prefix stops.

Verification checks 172 decoded original instruction words, original/loader
pointer reads, emulator instruction bytes, 1,881 unchanged frozen runtime
files, 32 current source hashes, three hashed reused public records and 22
historical snapshots. All four owned process lineages are empty. No production
REA+ code changed, so the preceding source/build/package gates remain historical
and were not rerun or counted as new tests.

The first verification incorrectly expected the old destructor-adapter record
inside one imported bundle. That record belongs to a separate original capture.
The corrected verifier authenticates that exact unchanged public file through
`reused-sources.json` and the historical snapshot. The failed receipt remains
in `qualification.log`; recovery is recorded separately. These are field-harness
corrections, not newly discovered REA+ defects.

## Continue

The Client-choice unknown stays open at revision 3:
`unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04`.
Keep concrete returned storage/cache/factory state distinct from the now checked
raw context partition and local post-getter window. Continue earlier instance/
keypath/copy inputs and the typed invocation carrier; the full bucket-removal
helper and independently answerable persistence callbacks are concrete static
follow-ups. Actual preference I/O/durability and broader browser features are
still unfinished. No new runtime authority was added.
