# Upstream REA versus REA+ — 2026-11-18

## Result and scope

**Upstream has substantial additions that this REA+ checkout does not contain.**
This is a source comparison, not a provider qualification or an upstream merge.

- Local WIP commit: `70d5dd7d1e17b380420c7eb75c37abe1e189134a`, source in
  `rea-local/`, package version **6.4.0**. The package version does not describe
  the many subsequent local changes or establish an exact upstream fork point.
- Upstream: [morluto/rea](https://github.com/morluto/rea), isolated shallow clone
  at **`f7849cad3fe3bffb207b4dc30f34394978c20297`**, committed
  **2026-11-18T16:35:39Z**, subject `fix(elf): require sizes for declared Android
  RELR tables (#12067)`. Snapshot acquired on 2026-11-18.
- Upstream package version is **6.9.0**. Its changelog records releases 6.5–6.9
  after our recorded 6.4 changelog, with 6.9 dated November 11. The audited
  **main snapshot includes changes after that release**; do not treat all
  findings here as verified contents of the published npm package.
- Compared source contracts, reader/provider wiring, selected implementations,
  documentation, manifests and release notes. No dependency installation,
  source replacement, target execution, provider launch or test run was needed.
- Existing local research edits were preserved. The upstream checkout is
  disposable scratch at `/private/tmp/rea-upstream-audit-2026-11-18`.

The static inventory finds **205 local contract names, 260 upstream names,
175 shared names, 85 upstream-only names and 30 local-only names**. These
are names, not 85 independent new capabilities: several are lifecycle
operations, while some overlap with differently named local tools. The
constant-named `inspect_ntfs_journal` is included. Progressive MCP discovery
wrappers, selected-family exposure and runtime availability are outside these
counts. Local cached catalog metadata has 204 entries and predates
`search_chromium_resources`; it was used as a cross-check, not as the authority.

The complete name difference and definition locations are in
[comparison.json](upstream-rea-comparison-2026-11-18/comparison.json). Upstream
[contracts](https://github.com/morluto/rea/blob/f7849cad3fe3bffb207b4dc30f34394978c20297/src/contracts/toolContracts.ts)
and the
[changelog](https://github.com/morluto/rea/blob/f7849cad3fe3bffb207b4dc30f34394978c20297/CHANGELOG.md)
are the primary references.

## Confirmed additions absent locally

| Area | Upstream implementation | Local comparison and boundary |
| --- | --- | --- |
| Embedded containers | Readers for Intel HEX, Motorola S-record, U-Boot uImage/FIT, ESP app/flash images, UF2 and DfuSe; Android boot/vendor_boot and OTA payload readers. | These dedicated readers are absent locally. Our Binwalk/Unblob workflows remain useful but do not replace their structured container facts. Inspection/extraction does not establish correct CPU loading or device behavior. |
| Embedded native analysis | Explicit raw-image mapping for x86/x64, ARM A32, ARM64, NMOS 6502 and m68k; RISC-V ELF lanes; PowerPC ELF and GameCube/Wii DOL loading. | Local CPU families are x86/x64, ARM/ARM64, MIPS and Dalvik; there is no equivalent raw-image or RISC-V/PowerPC profile. Upstream MIPS also extends beyond our narrower ET_EXEC profile with bounded relocatable, soft-float, legacy and MIPS16 shared cases. |
| Hardware-related structure | `inspect_devicetree`, kernel module/build configuration inspection, ELF notes/dependencies/debug links and unwind-derived function ranges. | No equivalent first-class local operations. These inspect saved artifacts; they do not acquire firmware or operate a board. |
| Ghidra persistence and analysis | Verified copies of selected existing projects, opt-in owned Program checkpoints, analyzer configuration, analyzed-memory masked `search_bytes`, `decompile_all`, and more retained native pages. | We have immutable result snapshots, ephemeral metadata edits, `batch_decompile` and original-file `scan_byte_patterns`. Those are useful overlapping mechanisms, but not persisted Ghidra Program state or loaded-memory search. Checkpoint configuration is absent locally. |
| Native diagnostics and matching | Binary hardening/entropy, native exports/initializers, DWARF units, ELF tables, PE imports/load configuration/certificates, Apple IPS correlation, Windows shortcuts, and `match_native_functions`. | Named diagnostic operations are absent. Our `diff_binaries` already supplies function matching through a different workflow. Upstream matching can consume retained inventories and optional body reads without reopening/decompiling every function. |
| Providers and debugger sessions | Kuna provider, GNU-style objdump observations, unrestricted Rizin/Cutter commands, persistent GDB/Rizin debug and Frida sessions. | We already have Binary Ninja, radare2/Rizin deep analysis and one-shot Frida/Objection. Upstream adds different interfaces and session ownership, not the first local support for all of those underlying engines. GDB is Linux-only; mutation-capable commands have explicit session-retirement rules. |
| Standalone packages and games | PyInstaller, Node SEA, .NET single-file, Bun standalone and Deno compile readers; UnityFS, Godot 3 PCK, WeChat wxapkg and iNES readers. | Dedicated artifact readers are absent. Local Unity/Godot/game archive tools overlap in subject matter and need format-by-format comparison before replacing anything. Inventory does not imply source decompilation or execution. |
| Language and data artifacts | Go build metadata, cargo-auditable Rust metadata, Flutter build/Dart AOT inspection, Python pyc, Erlang BEAM, GPU code objects, GGUF/safetensors declarations, NuGet and Maven/Gradle metadata. | These named inspectors and their dedicated upstream modules are absent. Existing generic binary/JVM/blob inspection is not equivalent. Model inspection does not run inference; metadata support does not establish complete language decompilation. |
| Android | APK signature-scheme declarations and signer/digest/lineage facts, selected R8 mapping input, structured manifest components, static JNI candidate linking and expanded external DEX method references. | Local APK/XAPK/JADX/DEX improvements remain valuable. Local Android graph explicitly warns that ZIP inventory cannot see the APK Signing Block. Upstream signature inspection does not establish cryptographic authenticity, and static JNI candidates do not establish runtime registration. |
| Network, browser and recorded signals | General TShark capture/field/client inspection, sigrok decoder discovery/recording decoding, SQLite snapshots, OpenAPI/GraphQL contracts, static-versus-observed endpoint comparison and saved Playwright traces. | Local HTTP/network capture analysis, protocol-field inference and sigrok `.sr` decoding overlap; richer general field/discovery APIs are missing. These are saved-capture workflows, not live signal acquisition. |
| JavaScript/Electron | Exact `source_paths` selection, route inventory/views, V8 code-cache inspection, Electron fuse inspection and release-exposure composition. | Our path filtering, search, IPC resolution and per-file semantic budget work are separate implementations. Reconcile their semantics and evidence compatibility; do not replace them just because upstream has a similarly named feature. V8 cache inspection is not JavaScript source recovery. |
| Investigation ergonomics | Runtime inspection/update of analysis settings, guided workflow/guidance search, tool-family/progressive catalog selection, compact output schemas, investigation reset and expanded retained Evidence/view access. | Local environment/resource controls and Evidence infrastructure exist. The new public settings/discovery controls and several retained page formats are absent or materially different. |
| Environment reconstruction | Capture-derived agent environment export; desktop application inspection, build computers, captures, checkpoints, task checks/measurements and environment export. | This is an additional product area absent locally, not a prerequisite for the current Arc static investigation. It has its own host/dependency/runtime authority requirements. |
| Windows and forensic acquisition files | Offline NTFS MFT/USN journal inspection and broader ReFS path admission. | Dedicated acquisition-file readers and journal tool are absent. Journal inspection does not prove complete historical activity or acquire a live volume. |

Implementation anchors for the rows are recorded in the JSON inventory and in
upstream `src/artifacts/artifactFormats.ts`, `src/ghidra/Ghidra*Profile.ts`,
`src/contracts/`, and their corresponding `src/domain/` owners. Unlike tool
name differences, many new format readers reuse `inspect_artifact` and
`extract_artifact`, so tool counts understate format growth.

## Important hardware qualifications

The earlier hardware answer described **our local REA+**, not today's upstream.
Upstream now covers more firmware formats and CPU families. Several limits
remain visible in the actual audited source:

- [Raw ARM loading](https://github.com/morluto/rea/blob/f7849cad3fe3bffb207b4dc30f34394978c20297/docs/providers/raw-binary.md)
  still starts in **ARM A32 state** and uses the selected entry as the mapping
  base. Thumb-only Cortex-M images are explicitly unsupported. Do not count a
  proposed Cortex-M PR as an implemented, verified feature of this snapshot.
- [RISC-V](https://github.com/morluto/rea/blob/f7849cad3fe3bffb207b4dc30f34394978c20297/docs/providers/ghidra-riscv.md)
  is limited to documented little-endian ET_EXEC lanes: RV32/RV64 double-float
  declarations and a bounded RV32 ilp32 soft-float policy. Raw RISC-V,
  ET_REL/ET_DYN, ilp32f and unsupported extensions are not generally admitted.
- The current Ghidra provider admits **Xtensa and Hexagon families**. Xtensa
  uses header-selected language loading; this is not proof of a pinned,
  independently verified ESP calling convention. `arm64_32` recognition is
  likewise not a promise of general Ghidra support.
- ESP/UF2/FIT recognition is container inspection, not automatic execution,
  peripheral emulation or a complete board memory model. ESP8266 image variants
  remain outside the documented ESP image reader.
- Neither checkout exposes first-class OpenOCD/pyOCD/JTAG/SWD/flashrom control
  contracts in the inspected contract trees. Saved-recording decoding still
  does not provide autonomous physical camcorder testing.

The embedded roadmap issue is useful context, but its on-main/pending status
must be rechecked against these source files: its prose can lag implementation.

## Local capabilities to preserve

The 30 local-only tool names include general `emulate_function`, Chromium
DataPack inspection/search, JavaScript/Android literal search, protocol-field
inference, library identification, binary diffing, DRCOV, minidump/x64dbg,
several game/language readers, the external MCP bridge and one-shot mobile
instrumentation. Some have upstream alternatives, so absence of the same name
does not establish absence of every overlapping capability.

The Arc-specific Swift witness/class metadata, selected-table admission,
typed dynamic switch recovery, Darwin stack-probe modelling, chained-import
identity fixes and shared-proof response compaction are also local work that
must survive any reconciliation. The relevant bridge and profile files have
diverged. Shared tool names do not imply equivalent result schemas or proofs.

## Shared-system changes requiring review

Upstream also changes error/cancellation/cleanup ownership, caller identity,
retained views, JavaScript loader/alias analysis, archive bounds and native
table parsing. These are **review candidates**, not a claim that every
upstream bug is reproducible locally. Our items 57–61 already address important
ownership and native analysis defects through local implementations.

The latest upstream commit tightens declared Android RELR sizes. Include its
owner/parser tests in an ELF backport review; do not copy an isolated check
without the upstream relocation representation. Similarly, review retained
descriptor cleanup and mixed physical-failure/cancellation changes alongside
our local ownership fixes, rather than treating matching commit subjects as
proof of equivalence.

Compatibility work is material: upstream changed graph/Evidence identities,
unknown/null conventions, call-graph shapes, native value-flow limitations,
catalog/SDK adapters and settings semantics. Its production dependencies add
protobuf, MessagePack, CBOR, GraphQL, OpenPGP, SAX XML and formatting/token
libraries; Zod moves from 4.4.3 to 4.6.6 and Playwright from 1.58.2 to 1.64.1.
Node admission rises to `^22.23.4 || ^24.22.1 || >=26.12.1`; our selected
Node 24.22.1 already meets that requirement. This was a manifest comparison,
not a dependency vulnerability audit.

## Proposed integration order

These are open follow-ups in item 62, not changes made by this audit.

1. **Protect the fork and reconcile shared foundations.** Retain local public
   tools and Arc/Rize regression fixtures; establish contract/Evidence/profile
   migration rules. Review lifecycle, boundary validation and parser changes
   against current local ownership rather than importing the entire tree.
2. **Reduce Arc investigation cost.** Port owned Ghidra checkpoints/verified
   project copies and retained native pages with local Swift producer identity
   preserved. Qualify cold analysis, restore, annotation/save, cancellation,
   source mismatch and failed-cleanup paths on the installed Ghidra.
3. **Add offline firmware structure.** Port HEX/S-record, UF2/DfuSe,
   uImage/FIT/ESP and devicetree readers; include malformed ranges, integrity,
   sparse/overlapping addresses and extraction provenance checks.
4. **Add CPU lanes separately.** Raw-image loading, RISC-V policies, expanded
   MIPS, PowerPC/DOL each need their own admission/profile and real-provider
   verification. Do not advertise Cortex-M or full Xtensa ABI support by
   extending an architecture enum alone.
5. **Broaden application coverage.** Native diagnostics and lightweight
   matching, Android signatures/JNI/R8, standalone package readers, then
   language/data inspectors and network/browser/Electron views. Compare
   overlapping local tools before selecting the public interface.
6. **Optional new workflows.** Persistent debugger/instrumentation sessions,
   desktop/agent environments and Windows acquisition-file analysis can follow
   their actual use cases. They do not need to block Arc or firmware work.

No upstream tests were executed and no upstream support claim was promoted to
a locally verified capability. This audit is complete; the integration work
remains open.
