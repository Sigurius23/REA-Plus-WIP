# WHOOP / REA+ field test and review — 24 October 2026

Update, 25 October: the two confirmed defects have been fixed and verified on the original XAPK. See [fixes and verification](FIXES.md). The findings below preserve the pre-fix investigation.

Tested the supplied WHOOP 5.473.0 APKPure XAPK with the local REA+ 6.4.0 build. Archive inspection, extraction, standalone APK inspection, class metadata, a concrete method's decompilation, resource paging, and XML exposure worked. Direct XAPK code analysis and one method's annotation projection failed reproducibly. No REA+ product code was changed.

All analysis was static. WHOOP was not installed or executed, and no WHOOP service was contacted. Output JSON files contain complete REA+ responses, including raw producer responses where returned. `runs.jsonl` records commands, selected configuration, exit status, and elapsed time. `run_cli.py` reproduces individual CLI calls; use absolute target paths because the CLI runs in `rea-local`.

## Review of the other agent's four leads

### 1. Annotation ClassCastException — confirmed bug; address it

Fresh reproduction: `inspect-android-method extracted/com.whoop.android.apk com.whoop.whooplabs.data.network.WhoopLabsApi abandonCampaign --overload-index 0` (with an absolute APK path).

`13-abandon-overload0.json` retains `execution_failure`, the successful `get_method_body` response, and this failed `get_annotation_values` response:

> class jadx.core.dex.info.FieldInfo cannot be cast to class jadx.api.plugins.input.data.IFieldRef

This is a defect in REA+'s Java bridge assumptions, not an unavoidable external-engine limitation. The actual configured `jadx-headless-mcp-0.7.1-all.jar` was inspected: its `FieldInfo` implements `IFieldInfoRef`, not `IFieldRef`. `MethodInfo` likewise does not implement `IMethodRef`, although a MethodInfo annotation failure was not independently reproduced.

Relevant current source:

- `rea-local/bridge/android/ReaJadxBridge.java:396`: unconditional field-reference cast; method-reference cast follows at line 401.
- `rea-local/src/android/JadxAnalysis.ts:387`: method-body request occurs before annotation retrieval at line 415.
- `rea-local/bridge/android/ReaJadxBridge.java:456`: method annotation retrieval reads live MethodNode attributes.
- `rea-local/bridge/android/ReaJadxBridge.java:149`: class annotations and static initializers are already snapshotted before code generation.

The other agent's proposed fix is incomplete as stated. Bytecode inspection of the configured JAR shows `ModVisitor` replacing literal annotation constants with `ENCODED_FIELD` values containing `FieldInfo` during code generation, including nested annotations and arrays. Merely adding an `instanceof FieldInfo` serialization branch can avoid the crash while exposing a decompiler-derived field reference as if it were the original encoded DEX literal.

Recommended correction: snapshot method annotations before code generation, consistent with class annotations; preserve original value semantics and normalize supported reference representations at the owning boundary. Verify results before and after method decompilation in the same session, nested/array values, overload selection, and the real WHOOP failing method. Do not claim a proposed fix completely resolves the failure until those paths pass. Existing fixture-based annotation tests do not establish this real engine mutation behavior.

### 2. APKPure base module detection — confirmed bug; address it

`03-xapk-direct.json` rejects the original supplied XAPK with `capability_unavailable`: the container must contain a readable top-level `base.apk`.

The actual outer manifest declares:

```json
{"package_name":"com.whoop.android","split_apks":[{"file":"com.whoop.android.apk","id":"base"},{"file":"config.xhdpi.apk","id":"config.xhdpi"},{"file":"config.armeabi_v7a.apk","id":"config.armeabi_v7a"}]}
```

`rea-local/src/android/AndroidXapkBundle.ts:123` checks only that `manifest.json` exists; it does not parse its base-module declaration. Lines 202–206 require the literal `base.apk`. Base identity is also assumed in sorting, composition, and limitation reporting, so changing the admission check alone is insufficient.

Recommended correction: resolve one validated base module from the manifest, preserve its original identity through composition and evidence, and reject missing, conflicting, or ambiguous declarations. Filename fallbacks should be unambiguous; do not silently choose among conflicting candidates. Add an APKPure-shaped fixture in addition to the existing `base.apk` fixtures.

For this specific bundle, extracting the base is a valid Java-code workaround: the two split APKs contain no DEX files. It does not cover their density resources or native code.

### 3. Class/package filter for string search — useful improvement, not a required correctness fix

The current CLI exposes `query` and `class_limit`, but no class/package selector (`src/cli/androidCommands.ts:65`). The bridge iterates its class index and calls the decompiler for each selected method (`bridge/android/ReaJadxBridge.java:268`). Default coverage is limited to 256 class identities, with an 8,192-class maximum; raising the count does not make decompilation cheap.

Filtering would make focused investigations substantially more useful. Apply filtering before spending the class budget and report matched/scanned/omitted coverage explicitly. Paging or a method-independent DEX constant index would address additional limitations. The claim that the bridge explicitly sorts classes alphabetically is too strong: it preserves the order returned by the engine; only methods are explicitly sorted there. The observed prefix from an earlier run should not be elevated into a guaranteed ordering contract.

No fresh long-running string sweep was performed in this review. The earlier reported 120-second failures remain historical evidence, not newly measured results. Do not interpret a partial zero-match scan as proof that a string is absent.

### 4. One-shot CLI latency — expected design; defer a daemon

`src/cli/androidCommands.ts:26` explicitly closes the provider after each operation. `src/android/JadxProvider.ts` retains matching sessions within a live provider, with 60-second idle retirement. The current MCP workflow already provides the appropriate persistent-process route.

Fresh successful package/class/method CLI operations took approximately 21–31 seconds each on this host. One retained load response reports 21,499 ms loading the APK. Documentation directing iterative investigations to MCP is justified; a new CLI daemon is optional scope, not needed to fix this WHOOP test. No fresh persistent-MCP timing comparison was performed.

## Fresh test results

| Operation | Result | Seconds | Evidence/output |
|---|---|---:|---|
| Inspect original XAPK archive | Pass | 2.6 | `02-xapk-inventory.json` |
| Inspect original XAPK as Android package | Fails: literal `base.apk` requirement | 1.1 | `03-xapk-direct.json` |
| Extract XAPK with REA+ | Pass; five files | 2.2 | `04-xapk-extraction.json` |
| Inspect extracted base package | Pass | 30.5 | `09-base-package.json` |
| Inspect overloaded method without selector | Correctly rejects ambiguity and lists both overloads | 28.9 | `10-abandon-campaign.json` |
| Decode resource page at offset 2000, include XML | Pass; partial string page explicitly reported | 12.8 | `11-resources.json` |
| Inspect WhoopLabsApi class | Pass; annotations and complete value coverage | 28.1 | `12-class-inventory.json` |
| Inspect abandonCampaign overload 0 | Fails: annotation ClassCastException | 26.9 | `13-abandon-overload0.json` |
| Decompile DeadBatteryWorker.j | Pass; Java body available, no smali fallback | 21.1 | `14-decompile-worker.json` |

The last operation recovered the battery-notification worker as a decompiler representation, not original source or observed runtime behavior.

Resource decoding returned entries 2000–3999 from 5,226 parsed strings and all 15 exposed `res/xml` files, including `res/xml/certificates.xml`. It reports 8 nested-markup strings omitted. Thus the older report's missing resource-paging and XML-exposure gaps are no longer current. This one page does not constitute complete string coverage. The resource Evidence has an artifact-identity limitation at the general evidence layer even though its normalized target includes the verified APK SHA-256; retain that distinction.

## Identity and cross-checks

- REA+ package version: 6.4.0; repository HEAD observed: `d9041681818e23f8e8c7a10cbb15b447813cfcab`.
- Node 24.22.1; OpenJDK 21.0.12.1; configured JADX MCP 0.7.1; Apktool 3.0.3; explicit JADX heap 4,096 MiB.
- Configured engine JAR SHA-256: `6e5eacf500b64292bfb73c49797c1958f6ee44646e43e868039ae7feb573ff75`.
- XAPK: 88,340,305 bytes; SHA-256 `f6adb497107e62f1fd49ac140ea9125450cd5d3fb90c2ad409c1d2d7233af148`.
- Base APK: 58,671,602 bytes; SHA-256 `db865d60f13ebc8537a37775a65f7137c9ea38e4ff5716ec1564d476f31e699d`.
- REA+ identifies `com.whoop.android`, version 5.473.0 / 618174, min SDK 28, target SDK 36, 47,244 top-level classes and resource_count 4,957. Signature verification is `not_performed`.
- Independent ZIP and DEX-header inspection found 11 DEX files containing 83,367 class definitions. This is a different count from JADX's top-level class inventory.
- Independent inspection found 17 ARM32 native libraries in the armeabi-v7a split and bundled nRF52840-named DFU firmware in the base. These were inventoried, not semantically reverse engineered in this pass.
- CRC checks passed for the XAPK, three nested APKs, and firmware ZIP. CRC and hashes do not verify publisher signatures.
- REA+ extraction was copied into this report's `extracted/` directory and every file rechecked against the extraction Evidence hash.

## Environment and scope limits

The first package/resource attempts were blocked by sandbox denial of writes to the macOS Swift compiler module cache. Setting cache environment variables did not resolve the helper's invocation. Authorized escalated retries succeeded with the same package and engine. This was a host execution constraint, not the APK or Java bridge annotation defect. The failed attempts remain available in files 05–08. File 01 records a harness-relative-path mistake and is excluded from product findings.

No product fixes, APK patches, signature verification, live device analysis, network capture, WHOOP requests, or full native/firmware reverse engineering were performed. The recommendation is to fix leads 1 and 2, prioritize lead 3 when improving large-app string investigations, and use/document existing MCP session reuse before considering lead 4's daemon proposal.

## Evidence ledger

- Package identity: `ev_793acc302883c1de9eb057e0e16afeed0d759debe5a37dbc04de2e72a050479c` (`09-base-package.json`).
- Resource page and XML: `ev_7c72e28e9ccb35664dd62c52ca2bd1dc1fcbf8941c2eedcb1b50038e65147ec2` (`11-resources.json`).
- Class metadata: `ev_690bdd77d3a7d9c28fb871b59b17415c7bd326de538711f352728d674ce25ca1` (`12-class-inventory.json`).
- Concrete method decompilation: `ev_4b34f182f21873e6a6f2dc003f926b9aa400f11c5d8200847914813a897f4f52` (`14-decompile-worker.json`).
- Failures have error records and partial observations where available, not successful Evidence IDs. Source-review recommendations are inferences supported by the cited implementation and configured JAR, distinct from those runtime observations.
