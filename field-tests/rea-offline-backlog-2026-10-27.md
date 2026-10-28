# REA+ offline backlog verification — 2026-10-27

Verification started 2026-10-27; final review continued on 2026-10-28.

This batch completes OPEN_TASKS items 19–29 within the static scopes below,
including the prior path-filter and per-file-status work (21 / 22c). No target
app, device, live service or emulator was run. Large Rize Evidence files remain
local; compact measured records are linked here.

## Android package and signature lane

`node scripts/verify/android/packages.mjs` passed all eight real CLI/MCP cases:
signed APK, tampered APK, explicit nested `.apks` selection, loose APK directory,
AAB universal conversion, decompiled method cap, raw const-string and jumbo
const-string. The MCP lane validates SDK-advertised input schemas and runtime
mode-dependent class limits. Source-owned keys and binary fixtures are temporary
and removed after the lane. [Complete compact record](rea-android-packages-2026-10-27.json).

The 4,101-method fixture reports 4,096 scanned / 5 cap omissions / partial in
`decompiled` mode, versus 4,101 scanned / zero omissions / complete in `dex`
mode. Independently generated DEX bytes contain opcode `0x1a` or `0x1b` at the
reported raw match location. The separate 75,000-string fixture verifies a real
`const-string/jumbo` (`0x1b`) at byte offset 1,222,748. Raw DEX does not use Java
code generation or the upstream decompiled-class LRU cache.

The original user-supplied WHOOP XAPK also passed opt-in public CLI signature
verification for all three original members, with the same certificate hash
`4ff1dac8482cce1e121eb197969f8634ba3408ee16a17197d4bbfcdb6db9c8e2`.
[Compact WHOOP signature record](whoop-signatures-2026-10-27.json). The base
reports verified v3; the two splits report verified v1/v2/v3 under their manifest
minimum-SDK policies. These verifier flags record schemes actually verified,
not an inventory proving the absence of every other scheme.

APK verification has its own `android-apksig` authority and JAR SHA-256. The
signed fixture verifies v1/v2/v3, the altered fixture is invalid, and selected
split members report the same signers. v3.1 capability is reported but a positive
v3.1 fixture was not exercised. Publisher identity, trust/revocation, v4 sidecars,
AAB signatures and device installability are not established. AAB conversion
covers universal fused modules, not every dynamic/device-specific variant.

Tools used, without installing or changing a host toolchain:

- JDK 21.0.12.1, Android SDK Build Tools 36.0.0 / platform 36.
- JADX headless MCP 0.7.1, SHA-256
  `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75`.
- apksigner JAR, SHA-256
  `3716d9311e55d2b0918a2fd9d54ba9e406c5f6abeea700b287f11259bc163dec`.
- Google bundletool 1.18.3, SHA-256
  `a099cfa1543f55593bc2ed16a70a7c67fe54b1747bb7301f37fdfd6d91028e29`;
  authenticated against the official release asset digest and held only in
  temporary test storage. REA+ requires an explicitly configured local JAR.

## WHOOP production scan measurement

Base APK SHA-256:
`db865d60f13ebc8537a37775a65f7137c9ea38e4ff5716ec1564d476f31e699d`.
The benchmark checks the original digest before and after. It uses one public
MCP connection, an explicit 4 GiB JVM heap, 600,000 ms total deadline, exact
no-match query and `scan_mode: "dex", class_limit: 2147483647`.

| Measurement | Cold | Warm |
| --- | ---: | ---: |
| Elapsed milliseconds | 17,702 | 709 |
| Scanned class identities | 83,390 | 83,390 |
| Scanned methods | 510,417 | 510,417 |
| Unreadable methods | 3 | 3 |
| Method-cap omissions | 0 | 0 |
| Coverage | partial | partial |

[Full compact Evidence for both scans](whoop-dex-scan-2026-10-27.json).
The provider's top-level load count is 47,244; the scan includes inner-class
identities. These are provider identities, not a claim about the number of
original unique class definitions. Two equal counts do not establish universal
skip-count stability. `/usr/bin/time -l` reported maximum RSS of 3,638,460,416 bytes (20.11 s
wall time). This rusage value does not establish a simultaneous process-tree
memory peak; configured JVM heap is a separate measure.

The decompiled mode timed out at the default 120 s and on both requests with
an explicit 600 s deadline / 8,192-class limit / 4 GiB heap. The two longer
requests elapsed 602,000 / 600,346 ms. `/usr/bin/time -l` reported maximum RSS of 4,526,915,584 bytes.
[Retained timeout observations](whoop-decompiled-scan-2026-10-27.json).
A timeout retires the engine, so this is not evidence of a completed warm
source-generation scan, cache-eviction behavior or stable decompiler skip counts.
Raw mode avoids that path. Neither representation covers every DEX string-pool,
annotation or resource entry; unreadable methods make coverage partial.

## Rize production CLI retest (2026-10-28)

The final compiled CLI analyzed `/Applications/Rize.app/Contents/Resources/app`
with explicit `--paths-exclude 'node_modules/**' --paths-exclude '**/*.map'
and `--scan-shipped-material`. Exit 0, Evidence
`ev_73c06cfb7cca9d3fc8d7631ef051e2823ecb9870b9ef834f751333a9977b2dae`.
[Compact summary and graph counts](rize-offline-summary-2026-10-27.json).
Full Evidence remains `/tmp/rea-backlog-rize-final-reviewed.json`; it is not committed.

- Scope: 415 of 20,561 files selected, 393 parsed JavaScript files, zero parse
  failures, 2,206,989 visited AST nodes.
- IPC: 149 operation observations, 56 literal channel names, 39 dynamic
  operations, 78 renderer transmissions, **52 paired**, zero ambiguous and
  zero unpaired literal transmissions. Static pairing does not prove runtime
  invocation, exposure, registration order or reachability.
- Bridge helpers: 38 observations carry helper candidates, with 58 candidate
  member occurrences. Shipped source and bundled code can repeat a candidate;
  these are not 58 verified unique runtime exports. Observed exposed members
  remain zero rather than promoting candidates into observations.
- The legacy `statistics.modules` is 1,935 recovered bundler registrations.
  The graph independently has 4,624 JavaScript-module nodes and 388 asset nodes;
  the summary view now names these distinct quantities and its module page.
- Shipped material: one extension candidate and 17 hex-literal candidates were
  emitted; 10 literal candidates were not expanded under per-file result
  budgets. All 393 admitted JS files supplied worker scan metadata. Overall
  material-scan coverage remains partial; values are not copied or classified
  as secrets, private keys or usable credentials.

This scoped run supersedes earlier zero-pairing results for these admitted
flows. It does not replace earlier full-vendor semantic-budget measurements.
Dynamic and unsupported expressions remain unknown.

## Repository verification

Finalized **2026-10-28** on the reviewed source.

- **`npm run check:pr` passed end to end, exit 0:** **912 files / 8,442 tests
  passed; 16 files / 274 tests skipped; zero failures**. The test phase took
  **1,065.46 s**. All 11 main tasks and all six documentation tasks completed.
  Lint reported 852 warnings and zero errors. jscpd remained **2.50%**, below
  the 2.6% limit; tech-debt scanning found no markers.
- `check:ci` passed, including architecture guards across 1,509 source files.
  Test discovery found all 928 files exactly once.
- Real Android verification passed all eight CLI/MCP fixture cases. WHOOP
  production raw scans and original-member signatures passed as scoped above.
  Optional providers skipped by the suite are not real-provider verification.
- Focused public-boundary checks covered 61 Android/process/view tests, 24
  catalog/Android tests, 17 cancellation/resource/helper tests, and the final
  25 worker/cancellation/view tests. These sets overlap; they are not an
  additional aggregate test count.
- The gate exposed and verified fixes for partial-Evidence cancellation recovery
  and portable APK-member path patterns. The final helper review additionally
  excludes stale object-alias initializers and distinguishes prototype setters
  from own shorthand properties. Their real-worker regression passed both
  focused checks and the final complete suite.
- Raw final gate log: `/tmp/rea-backlog-check-pr-reviewed.log`, SHA-256
  `7af5836820a78fdf9171cfa799b553e6ac4c356ffb36aa246b24b6e110b5c27f`. Large target Evidence and private inputs are not committed.

Node 24.22.1 / npm 10.9.2 were available locally. Exact repository pins
(Node 24.18.0 / npm 11.16.0) were unavailable and no replacement toolchain was
installed. Windows real-provider lifecycle checks remain outside this host's
verification. Device/traffic/strap work, an owned Consensus HAR, optional
Consensus research and paused function emulation retain their separate status.
