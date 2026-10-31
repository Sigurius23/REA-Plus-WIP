# HeyClicky native window and geometry follow-up — 2026-10-29

This pass follows the native implementation beyond the Objective-C thunks. It
recovers concrete screen, frame, panel-configuration and focus rules. It does
**not** complete the visible presentation state machine, SwiftUI drawing or
animation, or the policy selecting which display expands its content.

The input remains HeyClicky 1.1.1/build 66. The original executable SHA-256 is
`764a68a80f53de64a0e48a509d5a98737994f93e0888605e2de85b4028f3cb17`; the exact
55,971,232-byte arm64 slice SHA-256 is
`bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911`.
Both completed follow-up runs rechecked the original and slice and found their
bytes unchanged. During the static stages reported here, HeyClicky, its
helpers/extensions and bundled runtimes were not executed. No app services or
installed user settings/data were accessed in these stages.

The companion [JSON receipt](heyclicky-native-followup-2026-10-29.json) contains
the full Evidence IDs, profiles, raw paths, hashes, calls and remaining unknowns.
Raw replies are retained under
`/private/tmp/rea-heyclicky-native-followup-2026-10-29/`. Seventeen replies larger
than 1 MiB are now lossless `.json.gz` carriers. Their original SHA-256 and byte
identities are unchanged; `raw-json-archive-manifest.json` maps every original
path to its carrier, verifies streamed decompression, and records `gzip -dk`
restoration commands. Small receipts and schemas remain raw. This reclaimed
100,891,811 logical bytes (100,904,960 allocated bytes).

## Screen and frame rules

`0x10130edac` calls `NSScreen.screens`, obtains a display identifier through
`deviceDescription["NSScreenNumber"]` with a UInt32 conversion, and maintains
`notchInstancesByDisplayIdentifier`. For a usable identifier it updates an
existing instance through `0x101317934`, or creates one through `0x101316804`.
It orders out and removes entries for screens no longer enumerated. This
establishes per-display panels; the separate active-expansion/fullscreen
presentation policy remains only partly traced.

There are distinct outer-panel and visible-content frames. **820 points is
the outer transparent panel envelope's base width, not the collapsed notch's
visible width.** The instruction-backed outer envelope is:

```text
width  = 820 * s
height = min(900 * s, max(120, screen.frame.height - 80))
x      = screen.frame.midX - width / 2
y      = screen.frame.maxY - height
```

The size helper is `0x101319c20`; the origin helper is `0x101319d74`. Their
assembly is corroborated by wrappers calling named `CGRectGetHeight`,
`CGRectGetMidX` and `CGRectGetMaxY` externals, and the selector mapping proves
the screen read is `frame`, rather than `visibleFrame`.

`0x1012fbff0` computes the base notch measurement. Let `t` be
`screen.safeAreaInsets.top`, and let
`gap = auxiliaryTopRightArea.minX - auxiliaryTopLeftArea.maxX`:

| Condition | Base width | Base height |
| --- | ---: | ---: |
| Missing screen, or `t <= 1` | 60 | 8 |
| `t > 1`, both auxiliary areas available, and `gap > 80` | `ceil(gap) + 1 + 20` | `ceil(t) + 1` |
| `t > 1`, without that usable gap | 240 | `ceil(t) + 1` |

The upward rounding comes from the Swift `.up` enum identity and the ARM64
`FRINTP` branches. The decompiler's integer-cast renderings of rounding are not
the authority for these formulas.

`0x1012fd210` supplies `s`. When `t > 1`, it returns **1.0**. Otherwise the
code looks up `NSUserDefaults.standardUserDefaults.boolForKey("ClickyStreamMode")`:
true produces **1.5**, false produces **1.0**. The exact literal was recovered
through the seeded initializer `0x101227c78` and public `read_bytes` at
`0x102ed9ca0`. The installed setting's current value was not read.

A separate presentation-size routine, `0x101319e48`, supplies visible width
`W` and height `H`. `0x10131dad4` scales those dimensions and places them at:

```text
visible frame = (screen.midX - W*s/2, screen.maxY - H*s - delta, W*s, H*s)
delta         = 4*s when encoded presentation case 1 and t <= 1; otherwise 0
```

The encoded presentation case numbers have not been exhaustively mapped to
original Swift enum/source names. The large sizing routine reports an
unrecovered jump table and truncated high-p-code. Its many branch sizes do not
establish the full state machine, clipping shape or animation behavior.

## Panel creation and configuration

The creation routine resolves the metadata-backed `NotchPanel` subclass and
allocates it with style mask **0x80**, backing **2**, and defer **false**. The
local Apple SDK identifies these as borderless (`0`) plus nonactivating-panel
(`1 << 7`), and buffered backing (`2`). The constructor clears
`isTemporarilyRefusingKeyStatus` and passes the supplied rectangle/style/backing
arguments to its superclass initializer.

The same creation path then sets:

- `opaque = false`, clear background color, and `hasShadow = false`.
- `movable = false` and `movableByWindowBackground = false`.
- `hidesOnDeactivate = false` and `excludedFromWindowsMenu = true`.
- A content view containing a layer-backed hosted view, with file-URL drag
  registration and callback storage.

These selector identities were derived from public provider-read
`__objc_stubs`, `__objc_selrefs` and `__objc_methname` bytes. The derivation
matched 2,915 stub templates and retains exact source coordinates in
`resume/selector-map.json`. Representative selector stubs are `setOpaque:` at
`0x102dd7720`, `setHasShadow:` at `0x102dd6600`, `setCollectionBehavior:` at
`0x102dd4d00`, and `setLevel:` at `0x102dd6d00`.

Creation registers the panel with the overlay coordinator through
`0x101305e10`, passing boolean **1**. The stored flag selects integer **26** in
`0x101301454`; `0x1013065e0` sends `setLevel:` when the current level differs.
This establishes the creation/registration path, not every later level or
system-window interaction transition. A conditional `orderFrontRegardless`
path exists; no runtime visibility was observed.

The collection mask combines `canJoinAllSpaces` (1), `ignoresCycle` (64),
`fullScreenAuxiliary` (256), and either `transient` (8) or `stationary` (16)
according to `keepsNotchVisibleThroughMissionControl`. The constructor initially
clears that flag: the two resulting masks are 329 and 337 respectively.

Raw helper instructions resolve focus behavior that the thunk pseudocode left
uncertain: `0x1001cfa04` returns false for `canBecomeMainWindow`.
`0x10132fa58` returns the inverse of `isTemporarilyRefusingKeyStatus`, whose
decoded object offset is 8, for `canBecomeKeyWindow`.

## Public seed workflow and coverage

The unseeded bounded Program could read mapped bytes at metadata-backed
`0x101c66870` and `0x1017971e0`, but reported no containing procedure and
rejected function dossiers/instruction listings. This was resolved using the
already documented `REA_GHIDRA_SEED_FILE` workflow. It does not establish a
missing REA+ product capability.

The separate seeded profile applied six unnamed function seeds backed by
retained Swift metadata or explicit direct-call/callback observations. It
reported **six functions created, zero failed, zero unmapped**. The normalized
seed digest is
`099e48a138c3c1ee5c8bf582f1383184e5b3bec6165e228091c830298e45b3d3`;
the profile digest is
`f1cdc9b3a50b4baf8ee7ed2a09ccc2afe9f56e3da0414e39d034f7066ef5dda1`.
The raw TSV hash differs because its comment is excluded from canonical seeds.
Seeds remain caller assertions and do not recover original method names.

This pass also captured focused Codex client/process and drawing
engine/painter bodies for the parallel component follow-ups. The exact launch
owner `0x101cb8544`, initialized-message owner `0x101c00878`, drawing setup
`0x10177df10`, and evaluation wrapper `0x10178a1dc` were missing procedures
in that six-seed profile. Those failures remain preserved. The separate
219-seed closure stage below subsequently captured those entries successfully.

All Programs used Ghidra 12.1.4 with explicit **60-second** bounded analysis
and **330,000 ms** outer startup timeout. They remained stable partial Programs
with `analysis_complete=false` and `analysis_timed_out=true`. Both value traces
also report truncation and residual argument/call-depth unknowns. The formulas
above use corroborating raw instructions and external identities, not a claim
of complete cross-function value recovery.

## Verification and cleanup

The original three stages cover **124 raw replies: 113 successes and 11 preserved
errors**. Raw lengths/SHA-256, advertised input/output schemas and canonical
success contracts were validated. `first-session-validation.json` covers the
initial 52 replies; `followup-validation.json` covers the later 39 and 33.

The initial 52-call run was interrupted by an approval-review usage-limit
failure before public close/final lineage was recorded. On resume, exec session
17373 no longer existed and a host process snapshot found no old analysis
processes. This later absence does not establish the original cleanup history.

The resume and six-seed sessions successfully called public `close_binary`; the seeded
driver exited 0. Their generic final verifier lineage remains **unavailable**
because of descendant run-token mismatches. Separate later receipts confirm
their recorded known PIDs were absent. The earlier verified provider-launch
snapshots, unavailable generic final observations, and later PID absence remain
distinct in the JSON receipt.

## Interrupted 219-seed closure stage and later audit

A later static stage under `closure/` admitted **219 unnamed function seeds**:
198 entries with declared-function-start/direct-call provenance plus 21
distinct metadata-backed entries. Public observations report **219 functions
created, zero already present, zero failed and zero outside initialized
memory**. These are caller assertions; no source names are supplied. The
normalized seed digest is
`df7e9aa469bb740381b35f210b4ad7bd4784a690468eaf0234748a1b6525bbbd`;
the Ghidra profile digest is
`9d767b19f3309990487caf9039fe04860ed266f921d78225574c5e75ceb24c77`.
The commented 4,692-byte TSV has separate raw SHA-256
`1de864253daddbb824c1ebd7a82cf01ba670c47a1209887dc7046873df816040`.
Analysis remained incomplete and timed out at its explicit 60-second limit.

This stage saved **46 replies: 44 successes and two preserved `invalid_request`
errors**. Successful dossiers include the launch owner `0x101cb8544`,
initialized-message owner `0x101c00878`, drawing setup `0x10177df10`,
evaluation wrapper `0x10178a1dc` and host installation `0x101781e30`.
The errors are procedure requests at `0x101bffdd8` and `0x101ca516c`.
The latter's later successful byte read supports a literal/store derivation;
it does not change the failed procedure request. The
[runtime](heyclicky-runtime-followup-2026-10-29.md) and
[drawing](heyclicky-drawing-native-followup-2026-10-29.md) follow-ups retain
the recovered paths and remaining limits.

The last saved reply is #046, requested at `2026-10-29T20:38:36.876Z`.
Final public `binary_session`, `close_binary`, summary, stderr and final
verifier-lineage receipts were not recorded before interruption. Closure
driver/process state and original cleanup history remain unverified by this
audit. Earlier successful closes and PID observations belong to their own
stages. The Swift enum-name search uses a composed workflow profile over
this Ghidra profile; its zero matches are limited by retained mangled procedure
names and do not prove the enum is absent.

Adding closure gives **170 saved replies: 157 successes and 13 preserved
errors**. The independent
[saved-evidence audit](/private/tmp/rea-heyclicky-closure-audit-2026-10-30-07MVJW/audit.json)
verified every raw length/SHA-256, advertised input/success output, canonical
success contract and text/structured agreement using fresh AJV2020 validators.
Its 130,006-byte receipt SHA-256 is
`6f1393cff8e46076672456806f13fe68f39053e100cbd11d97f9289f8fea9fde`;
the receipt records Node 22.17.0 and the existing compiled contracts used.
All 17 gzip carriers and decompressed identities were also rechecked. Closure
replies remain raw and are outside that archive manifest.

The current closure invocation ledger is 26,143 bytes, SHA-256
`586f0397f8a3b11089b38aea3b0bad48275090d97d45ca6d7052ae49b07adc10`.
Both input hashes matched again during the later audit. This later equality
does not supply missing original final verification or cleanup receipts.

Only this report and its JSON companion were added to the repository. No
production code, task registry, executable bytes, commit or push was changed.
