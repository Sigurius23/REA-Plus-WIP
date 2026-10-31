# HeyClicky bundled agent runtime follow-up — 2026-10-29

REA+ recovered the native process-launch path and outbound notification writer.
The code builds `app-server` arguments, configures executable and streams,
constructs the environment, installs a termination handler, then checks
`launchAndReturnError:`. Notifications are serialized as JSON, terminated
with one LF byte and written to the child process's stdin. **Inbound
correlation, the complete initialize request, provider/authentication effects,
model selection and lifecycle callbacks remain partial.**

This is static analysis of HeyClicky **1.1.1 (66)**. During the static stages
reported here, no HeyClicky code, bundled runtime, helper, extension or
instruction document was executed; no target service or user application
data was read. The 55,971,232-byte
arm64 derivation has SHA-256
`bb98afe140170240037589647cbfe00099079655e9223ec87f7f702db3fb7911`.
Eight freshly hashed runtime files matched the earlier Resources manifest.
The [receipt](heyclicky-runtime-followup-2026-10-29.json) preserves raw
identities, Evidence, profiles, failed requests and remaining questions.

## Shipped runtime and native executable choice

`Contents/Resources/CodexRuntime/bin/codex:3–31` selects architecture via
`uname -m`: arm64 maps to `aarch64-apple-darwin`, x86_64 to
`x86_64-apple-darwin`, and other architectures error. It prefers executable
`vendor/<triple>/bin/codex`, falls back to `vendor/<triple>/codex/codex`,
and errors when neither exists. The corresponding `codex-path` or fallback
`path` directory is prepended to `PATH` when present.
`exec "${CODEX_BINARY}" "$@"` forwards supplied arguments.

Both package files declare **0.152.1**, layout version 1, variant `codex`,
entrypoint `bin/codex`, resources `codex-resources` and helper directory
`codex-path`. Primary binaries are 216,514,064 bytes (ARM64) and
234,849,296 bytes (x86_64); companion `codex-code-mode-host` files are
62,340,800 and 65,815,920 bytes. Headers and hashes were read without launch.
Full bundled engine internals were not analyzed.

The native preferred-resolution chain is recovered through
`0x101cc0934 → 0x101cae19c → 0x101cae1f4 → 0x101cae4d4`. It obtains
`NSBundle.mainBundle.resourceURL`, appends `CodexRuntime/bin`, checks that
base exists, then appends `codex` and checks executability. The runtime-name getter is `0x101ca51ac`, whose once
initializer is `0x101ca516c`. That initializer was absent from the bounded
Program, so a public 96-byte read was decoded inertly: it selects the
`CodexRuntime` literal, constructs a Swift string and stores it at the exact
global returned by the getter. Public bytes match the identified immutable
arm64 snapshot; the receipt separates this byte derivation from recovered
Ghidra function semantics and preserves the failed procedure request. If the preferred URL is unavailable, a guard at
`0x1001cfa04` controls a lookup helper for `codex`; that guard and
lookup internals remain untraced. Current settings and execution were not
observed.

## Launch decisions and state

The specification at `0x101cbed5c` builds arguments containing
`app-server`. A compatibility branch checks for sibling executable `node`
and examines up to the first 128 bytes of the selected script. If the first
UTF-8 line contains `/usr/bin/env node` or `/node`, it uses `node` with
script path followed by `app-server`; otherwise the selected executable
receives `app-server` directly.

The caller at `0x101cb8544`:

1. Sets executable URL, arguments and separate stdin/stdout/stderr.
2. Copies `NSProcessInfo.environment`, assigns `CODEX_HOME` from the home
   manager, prepends colon-joined launch-specification directories to `PATH`,
   then overlays `managedEnvironmentOverrides`.
3. Creates the protocol client using stdin/stdout and installs a termination
   handler.
4. Calls `launchAndReturnError:`. The false branch converts `NSError`;
   the successful branch starts the client read task and retains process,
   protocol client and stderr task.

Selectors are corroborated by earlier public `read_bytes` captures and
`resume/selector-map.json`: `setExecutableURL:`, `setArguments:`,
`setStandardInput:`, `setStandardOutput:`, `setStandardError:`,
`setEnvironment:`, `setTerminationHandler:` and
`launchAndReturnError:`. These code paths do not establish successful
execution, authentication or a particular user's environment values.

| Native evidence | Entry | Evidence ID |
| --- | --- | --- |
| Launch caller | `0x101cb8544` | `ev_a2c2d8ef8fa80058c5f8ffe562395578994dea447bf957c1aea9e30f39b6b21b` |
| Launch specification | `0x101cbed5c` | `ev_68321fc99196a162f03b118144636dee8104e86e27b5c241ec72ba25541a8d0a` |
| Executable resolver | `0x101cc0934` | `ev_e7c67c1dc8be6ef5e80bbae68f78ed5a678e9c1ef3f69de98ea4ce28b498a201` |
| Runtime base resolver | `0x101cae4d4` | `ev_a258802f8726f50c5f4766213e0693905cb531182552a5168bac9bb643032bdf` |

Earlier initializers connect
`0x101d164f8 → 0x101cb8030 → 0x101cb8078` with manager state and
`0x101c66870 → 0x101c668c0` with protocol state. Decoded ivars corroborate
process/client/task ownership, the pipes, initial request ID 1,
pending-request/projection dictionaries and closed flag. Recovered
`FUN_…` names and Swift decompiler artifacts are preserved as such.

## Outbound protocol and initialization continuation

Notification helper `0x101c62d44` constructs `method` and optional
`params`, then calls writer `0x101c6cf98`; it inserts no request ID in
that helper. The writer checks `isClosed`, serializes with
`NSJSONSerialization.dataWithJSONObject:options:error:`, appends byte
`0x0A`, obtains `stdinPipe.fileHandleForWriting`, and calls Foundation
`NSFileHandle.write(contentsOf:)`. Closed-state and serialization-failure
branches return failure; writing also has a Swift error path.

Instruction Evidence corroborates the LF claim beyond pseudocode: Data at
`x29-0x50`/`x29-0x48` is addressed through `x20` before
`mov w0,#0xa` at `0x101c6d374` and the append call at `0x101c6d378`.
The same Data reloads at `0x101c6d3c0`/`0x101c6d3c8`, is copied into
the DataProtocol argument and written at `0x101c6d400`. Helper
`0x101681640` appends exactly its supplied byte. This establishes outbound
JSON-plus-LF on this path; inbound framing, response correlation, delivery
and strict JSON-RPC 2.0 conformance remain unproved.

| Native evidence | Entry | Evidence ID |
| --- | --- | --- |
| Notification dictionary | `0x101c62d44` | `ev_f79c6c71998e94bf79fabcf5099505bbb18e010c3b3435ef816a376c2dae0132` |
| Serialization/stdin writer | `0x101c6cf98` | `ev_2accaeb610f619684f5985d0c6a3eaf3aba5b4f5607354bc9df02fb6d5432dae` |
| One-byte append | `0x101681640` | `ev_fbe439e148b20936fff2a035748ef6b7969d517fcd5bb246c6415e4c40cc5e39` |
| Writer instructions | `0x101c6cf98` | `ev_bfdc1aa92a7a8ed44547c5ef46eaabbd78b4313a5fa6144a69e3d085bcca7aaa` |
| Initialize continuation | `0x101c00878` | `ev_d9dd76a7abb7928d5b1e2d3d97c1fdd3ea25df64e5280dcc33fcd5eba283ddad` |

The continuation logs an initialize-response value, passes `initialized`
to the notification helper, checks cancellation, then branches on
`_codexAPIKeyProvider`. Its absent-provider branch calls
`0x101bfa0e4(1)` and logs ready; the provider branch invokes an async
closure with continuation `0x101c00e78`. Those effects do not establish
authentication success. The initialize-request owner `0x101bffdd8`
still returned “No procedure exists” in this bounded Program; the request
payload and complete handshake remain open.

## Model resources, coverage and remaining paths

`ClickyCodexModelCatalog.json` contains **14 descriptors**, nine marked
`list` and five `hide`. The receipt retains slugs, labels, defaults and
declared capabilities without copying instruction bodies. Descriptors do
not establish selection, account availability or service use. Packaged
`AGENTS.md`, `codex.md` and `ClickyModelInstructions.md` were inert
content. Configuration fragments such as `model_provider = "clicky"`,
`approval_policy = "never"` and `sandbox_mode = "danger-full-access"`
remain native literal candidates until producing/use paths are traced.

The six-seed profile's failed owner queries remain retained. A new
**219-entry** profile, digest
`9d767b19f3309990487caf9039fe04860ed266f921d78225574c5e75ceb24c77`,
admitted all 219 function seeds and recovered the owners/helpers above.
Seeds are caller assertions with declared function-start, metadata or call
provenance. Auto-analysis still reached its explicit 60-second deadline;
missing functions/references/types remain unknown. Successful captures do
not establish whole-binary completeness.

Remaining offline work is specific: initialize request and provider-result
continuation, read-task parsing and request-ID matching, thread/turn
dispatch, termination/stale-exit/stderr/reconnect callbacks, fallback policy,
and catalog/instruction/provider selection. Exact anchors and actual failed
requests are retained. These paths are not treated as absent behavior or
automatically as a missing REA+ capability. Runtime integration remains
partial.

## Interrupted closure stage and saved-evidence audit

Closure saved **46 replies: 44 successes and two preserved `invalid_request`
errors**. The errors are the initialize-request owner `0x101bffdd8` and
runtime-name initializer `0x101ca516c`; the latter's successful byte read and
literal/store derivation remain distinct from its failed procedure request.
The launch owner, initialized-message owner, launch specification and outbound
writer captures above remain successful static observations. The same stage
captured drawing context/resource setup, evaluation and host installation,
as retained in the
[drawing-native follow-up](heyclicky-drawing-native-followup-2026-10-29.md).

Current `closure/invocations.json` is **26,143 bytes**, SHA-256
`586f0397f8a3b11089b38aea3b0bad48275090d97d45ca6d7052ae49b07adc10`.
It replaces the earlier 40-call ledger snapshot in the current reference;
the JSON receipt preserves that earlier snapshot identity as history. The
last saved reply is #046, requested at `2026-10-29T20:38:36.876Z`.
Final public `binary_session`, `close_binary`, summary, stderr and final
verifier-lineage receipts were not recorded before interruption. Closure
driver/process state and original cleanup history remain unverified by the
audit. Earlier close/known-PID observations belong to their earlier stages.

The [saved-evidence audit](/private/tmp/rea-heyclicky-closure-audit-2026-10-30-07MVJW/audit.json)
validated the combined **170 native replies: 157 successes and 13 preserved
errors**, including all 46 closure replies. Raw lengths/hashes, advertised
inputs/success outputs, canonical success contracts and text/structured
agreement passed. All 17 archive carriers/decompressed identities, the
219-seed commitment/provenance sources and current original/derived input
hashes also matched. The 130,006-byte receipt SHA-256 is
`6f1393cff8e46076672456806f13fe68f39053e100cbd11d97f9289f8fea9fde`;
it records Node 22.17.0 and the existing compiled contracts used. Later input
hash equality does not create missing original final verification or cleanup.

Raw records are under
`/private/tmp/rea-heyclicky-native-followup-2026-10-29/`. Large replies may
be losslessly gzip-archived; the receipt links the manifest, original
identities, physical carriers, verified decompressed lengths and restore
commands. Earlier close/known-PID observations retain their original
scope. They do not upgrade unavailable generic lineage into verified
descendant coverage. Closure replies remain raw and are outside the existing
17-carrier archive manifest; their original identities are retained in the
invocation ledger and audit.
