# WHOOP fixes — 25 October 2026

Both confirmed failures from [the field test](REPORT.md) are fixed in the local REA+ build. The supplied XAPK now opens directly, and the previously failing `WhoopLabsApi.abandonCampaign` overload 0 returns its original annotation values successfully.

## Changes

- XAPK admission parses the outer `manifest.json` and resolves the base from `split_apks` / `id: "base"`. It preserves the selected filename through composition and Evidence. Legacy bundles can use one unambiguous `<package_name>.apk` or `base.apk`; duplicate, missing, conflicting, malformed, and oversized declarations are rejected before creating an analysis image. The manifest reader has a 1 MiB decompressed memory budget.
- The Java bridge snapshots method annotations with the other parsed metadata before any code generation. Subsequent requests therefore return original literals rather than the field references JADX may substitute during decompilation.
- End-to-end verification exposed an additional annotation schema defect: DEX booleans were declared as integers. The schema now accepts actual booleans and rejects numeric substitutes. Both `true` and `false` have regression coverage.
- The real-engine regression compiles a small source-owned Java fixture to DEX using the installed JDK and D8 already inside the pinned JADX JAR. It checks strings, integers, booleans, enum references, nested annotations, arrays, and overload identity before and after decompilation and forced regeneration. It also proves the fixture actually triggers JADX's live replacement of literals with `FieldInfo`.
- Android documentation and the authored REA+ skill reference describe the supported APKPure layout and method annotation preservation.

## WHOOP verification

Both requests used the original `WHOOP_5.473.0_APKPure.xapk`, not a renamed or repackaged input.

| Operation | Result | Time | Output |
|---|---|---:|---|
| `inspect-android-package` | `com.whoop.android` 5.473.0, 47,244 top-level classes, 11 merged DEX entries | 33.9 s | [15-fixed-xapk-package.json](15-fixed-xapk-package.json) |
| `inspect-android-method … WhoopLabsApi abandonCampaign --overload-index 0` | Complete annotation values; no ClassCastException | 36.5 s | [17-fixed-xapk-abandon.json](17-fixed-xapk-abandon.json) |

The method's retained annotation values are:

```json
{
  "hasBody": { "kind": "boolean", "value": true },
  "method": { "kind": "string", "value": "DELETE" },
  "path": { "kind": "string", "value": "/research-service/v2/research/campaigns/{campaignId}" }
}
```

The method is abstract, so `body_status: "not_available"` is the correct result. The annotation is a static declaration, not an executed request. The intermediate failure in `16-fixed-xapk-abandon.json` exposed the boolean schema defect and is retained for the audit trail.

Evidence IDs:

- Package: `ev_568ed8b47b0d03ab52329e9873091d23ff7b1fe707438adc404e6e6597326e3f`.
- Method: `ev_b773dcd370ef0c7a67c8831b8e094657f1723b47bca96a332edd5be841c24dbc`.
- Both bind to the original XAPK SHA-256 `f6adb497107e62f1fd49ac140ea9125450cd5d3fb90c2ad409c1d2d7233af148`.

## Checks

- 56 focused XAPK/JADX boundary tests passed, including malformed manifests, overloads, annotation booleans, cancellation, and retained-session cleanup. [Log](fix-boundary-tests.log).
- 7 Android MCP tests passed, including actual advertised output-schema validation. [Log](fix-mcp-schema-tests.log).
- `npm run check` passed: typechecking, lint, formatting, unused-code checks, module boundaries, metadata, and architecture guards. Existing repository lint warnings remain. [Log](fix-static-checks.log).
- `npm run docs:check` passed. [Log](fix-docs-check.log).
- The complete real Android provider suite passed on macOS with the pinned JADX MCP 0.7.1 engine: all six CLI operations, CLI/MCP parity, the real annotation regression, SIGTERM/disconnect cleanup, invalid-selector recovery, and unavailable Java/JRE/engine recovery. The fixture APK stayed unchanged and was never executed. [Log](fix-real-android.log).

The local runtime was rebuilt. An already-running REA+ MCP server must restart to load the rebuilt runtime. No WHOOP code was executed or patched, and no service was contacted. String-search filtering and a CLI daemon remain outside these two fixes.

Earlier verification attempts encountered macOS sandbox helper restrictions and host disk exhaustion. The focused reruns above passed with the required host access; they did not require changes to the supplied APK. The redundant temporary extraction from the original test was removed after checking its preserved copy under `extracted/` against every recorded hash.
