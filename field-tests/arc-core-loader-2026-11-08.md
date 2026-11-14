# ArcCore component registration and resource loading

Investigation started **2026-11-08**; verification continued **2026-11-09**,
Europe/Berlin. This pass follows selected native extension paths in the supplied
**Arc 1.172.1 / build 90370 DMG**. Arc, helpers and shipped scripts were never
executed. The findings explain selected static implementations; they do not
establish which extensions were enabled in a running profile.

## Identity and analysis authority

The original DMG SHA-256 is
`d1d966face8fd0a0a6f7321bc50dbac633a3df1cea0c5afc8d43e2e43e12b778`.
The universal ArcCore carrier is **507,526,464 bytes**, SHA-256
`aacb29669c253804ed263f5105a9869dcda0b6a083a58ef7b96bb10da4287dd5`.
Its caller-derived ARM64 slice is **242,072,896 bytes**, SHA-256
`d5c04f2d2a6839cdd2360192950d06f4c085ff2aead2e7f10206b6e7fd7bd80e`.
Original bytes were not modified. See [slice derivation][slice].

Temporary extracted inputs disappeared while storage was being freed. A fresh
public REA+ extraction of the unchanged DMG re-established **1,113 regular
files / 916,318,369 bytes**, matching the earlier commitments. The exact slice
was rederived and rehashed; historical replies retain their original paths.
See [input recovery][recovery] and [fresh extraction][extraction]. The earlier
missing-input failures remain failures, not observations of a different build.

The Core has no `LC_FUNCTION_STARTS` index. Caller preparation decoded compact
unwind range starts from the immutable image and used selected direct-call
targets as entry hypotheses. A compact unwind range may be a subrange of one
function. One resource-loader entry was additionally selected from a
supplemental `llvm-objdump` prologue inspection, then corroborated through public
REA+ instructions. These are explicit caller seeds, not automatic REA+ function
discovery. [Selector preparation][selectors], [final seed provenance][seeds].

Native Programs use a **one-second** initial analysis policy, then selected
public operations. Positive instructions, loaded pointers and byte reads are
retained; missing references in these partial Programs cannot establish global
absence. Pseudocode is a reconstruction, with its original warnings preserved.

## Recovered native route

| Stage                  | Selected static observation                                                                                                                                                                                | Remaining boundary                                                                                                   |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| Manifest supply        | `0x4448490` requests ID **15558** through `0x2299440`. The latter permits a virtual resource override before its DataPack fallback.                                                                        | The actual runtime override and selected pack instance are unobserved.                                               |
| Branding               | A stored flag selects `Arc` or `Dia`; `0x31e54dc` replaces the **first** `<APP_NAME>` occurrence and updates String storage.                                                                               | The flag value is not observed. This is not a global replacement claim.                                              |
| Parse                  | `0x34b133c` calls `0x34b13e0`, whose failure path logs `Failed to parse extension manifest.` and returns no parsed result.                                                                                 | Parser arguments `0x34` and `200` retain their numeric identity; their complete semantics were not traced.           |
| Registration           | `0x34b14b4` resolves a relative root using path-service key `0x3ed`, derives an identifier from the manifest, applies acceptance checks, and appends a 72-byte entry to its vector.                        | The path-service enum name, runtime policy results and complete identifier algorithm remain unproved.                |
| Conditional activation | An owning-state flag invokes `0x32f233c`. It calls a construction helper, logs creation failure, compares the resulting identifier with the stored entry, and hands the object to `0x32f406c` on equality. | This reaches an activation handoff in code; no actual extension activation or service-worker execution was observed. |

The initial function passes **`arc_internal_extension`**, flag **0**, and the
branded manifest to the registration handoff. Under further stored-flag checks
it also supplies `web_chat` and `home_surface` from other stored strings. Their
presence in that branch does not establish that the Arc brand executes them.
[Branding caller][brand], [replacement helper][replacement],
[override-aware read][resource], [parse][parse], [registration][registration],
[activation][activation].

The identifier helper `0x31e5204` reads the manifest field **`key`**, calls
`0x31e52b0`, and then `0x2d8c700`; it returns an empty value on missing/invalid
input. The exact selected key bytes and helper calls are retained. This pass
does not label the two untraced helpers as a particular decoding/hash algorithm
or assign a final extension ID from them. [Identifier helper][identifier],
[field-name bytes][key].

## Resource paths and DataPack bytes

Public reads from Ghidra's loaded image resolve these path-pointer/ID tuples:

| Native row  | Exact path                                  | Resource ID |
| ----------- | ------------------------------------------- | ----------: |
| `0xe1d2370` | `reading_mode_gdocs_helper/content.js`      |       15865 |
| `0xe1d2390` | `reading_mode_gdocs_helper/gdocs_script.js` |       15866 |
| `0xe1d2430` | `arc_internal_extension/background.js`      |       15901 |

Separate byte reads preserve the pointed-to strings. The row spacing is an
observation, not a recovered C++ structure declaration. These tuples close the
three filename-to-packed-body associations in the
[extension-source report](arc-extension-loading-2026-11-08.md).
[Google Docs rows][mapping], [background row][internal-mapping],
[path strings][paths].

The fallback `0x1d7f800` searches resource delegates/loaded packs and calls
`0x962984`. That selected DataPack reader searches six-byte canonical entries
and four-byte alias entries, follows an alias to its canonical entry, checks
adjacent offsets against the mapped file extent and returns a bounded byte
span or a missing result. Its diagnostics name `ui/base/resource/data_pack.cc`.
`0x1d7f9c0` then distinguishes raw bytes, gzip and the selected Brotli header
path; the corresponding decompression labels are present. These code paths
corroborate the pack format; they do not observe a runtime pack selection.
[Entry lookup][lookup], [DataPack entry reader][entry],
[byte conversion][conversion].

The selected resource-request implementation `0x4444f4c` contains a missing
resource path that records `extension_id`, `request_path`, `resource_id` under
`extension_resource_loader` / `Missing bundled resource`. The separate relative
path implementation `0x4446094` records `request_resource_url` under
`Wrong relative path`. Their retained instructions corroborate the selected
owners. Decompiler parameter/type uncertainties remain; these diagnostics alone
do not prove a successful request. [Resource request][request],
[request instructions][request-instructions], [relative path][relative].

The nearby `0x4446538` is a distinct URL-loader/SentryTunnel path. Its extension
ID comparisons are not silently assigned to either recovered manifest. A
complete selected MOV-immediate search for manifest ID **15548** in registers
W0–W3 returned zero matches. This is a bounded pattern result, not evidence that
the Google Docs manifest is never registered. [Selected ID search][gdocs-search].

## Verification and retained failures

The final loader session completed **15/15 public calls**, exported its bundle,
closed successfully and retained a verified empty-descendant receipt. The full
directory audit authenticates **44 standalone / 44 unique Evidence records
and five bundles**. The findings checker authenticates and hashes 14 selected
records, checks the three native resource mappings and selected code facts,
and preserves all seven session outcomes. These counts overlap earlier reports
and are not summed into a global test total.

```sh
node field-tests/arc-core-loader-2026-11-08/audit-evidence.mjs
node field-tests/arc-core-loader-2026-11-08/check-findings.mjs
```

The first Core session completed its reads but returned `cleanup_incomplete`
on close. A later ownership/absence check and removal of that run's disposable
workspace are retained separately; no historical PID was signalled and the
failed close is not rewritten. [Manual cleanup receipt][cleanup].

Two other sessions reached their idle continuation deadlines and therefore
have driver shutdown/empty-descendant receipts without an explicit successful
`close_binary`. A later loader-region driver tried the unadvertised name
`procedure_instructions`; its own catalog assertion stopped before sending
that call. The valid earlier observations are retained, and the final session
uses advertised `read_function_instructions`. Missing temporary inputs and
these caller orchestration errors are not new REA+ product defects.

This pass materially advances internal-extension registration and resource
association. Actual registration flags, remaining identifier helpers, deeper
activation effects, Google Docs native registration and page/CSP/Trusted Types
outcomes remain open. The reducer/projection repair, Boost persistence and final
selector rendering are independent outstanding questions.

[slice]: arc-core-loader-2026-11-08/slice-derivation.json
[recovery]: arc-core-loader-2026-11-08/input-recovery.json
[extraction]: arc-core-loader-2026-11-08/re-extraction/extract.evidence.json
[selectors]: arc-core-loader-2026-11-08/pointer-selectors.json
[seeds]: arc-core-loader-2026-11-08/loader-final-seed-provenance.json
[brand]: arc-core-loader-2026-11-08/native/brand-placeholder-substitution-pseudocode.evidence.json
[replacement]: arc-core-loader-2026-11-08/followup-restored/branding-substring-helper-pseudocode.evidence.json
[resource]: arc-core-loader-2026-11-08/followup-restored/manifest-resource-read-pseudocode.evidence.json
[parse]: arc-core-loader-2026-11-08/loader-region/manifest-json-parse.evidence.json
[registration]: arc-core-loader-2026-11-08/loader-region/component-registration.evidence.json
[activation]: arc-core-loader-2026-11-08/loader-final/component-activation.evidence.json
[identifier]: arc-core-loader-2026-11-08/loader-final/manifest-identifier.evidence.json
[key]: arc-core-loader-2026-11-08/loader-final/manifest-key-name.evidence.json
[mapping]: arc-core-loader-2026-11-08/followup-restored/native-resource-mapping-table.evidence.json
[internal-mapping]: arc-core-loader-2026-11-08/followup-restored/native-internal-background-mapping.evidence.json
[paths]: arc-core-loader-2026-11-08/followup-restored/native-gdocs-resource-paths.evidence.json
[lookup]: arc-core-loader-2026-11-08/loader-region/resource-entry-lookup.evidence.json
[entry]: arc-core-loader-2026-11-08/loader-final/datapack-entry-reader.evidence.json
[conversion]: arc-core-loader-2026-11-08/loader-region/resource-bytes-to-string.evidence.json
[request]: arc-core-loader-2026-11-08/loader-final/bundled-resource-loader.evidence.json
[request-instructions]: arc-core-loader-2026-11-08/loader-final/bundled-resource-loader-instructions.evidence.json
[relative]: arc-core-loader-2026-11-08/loader-region/bundled-resource-relative-path.evidence.json
[gdocs-search]: arc-core-loader-2026-11-08/loader-final/gdocs-manifest-id-candidates.evidence.json
[cleanup]: arc-core-loader-2026-11-08/manual-cleanup.json
