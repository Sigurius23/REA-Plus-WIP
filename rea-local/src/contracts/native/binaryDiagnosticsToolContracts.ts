import {
  searchChromiumResourcesInputSchema,
  chromiumResourceSearchSchema,
} from "../../domain/native/chromiumResourceSearch.js";
import {
  inspectRecordedCrashInputSchema,
  recordedCrashSchema,
} from "../../domain/native/recordedCrash.js";
import {
  inspectBinaryLayoutInputSchema,
  binaryLayoutSchema,
} from "../../domain/native/binaryLayout.js";
import {
  analysisDetailOutputSchemaOf,
  analysisDetailSchema,
} from "../analysisDetail.js";
import type { ToolContract } from "../toolContractTypes.js";
import {
  inspectChromiumResourcesInputSchema,
  chromiumResourcesSchema,
} from "../../domain/native/chromiumResources.js";
import { toolContractMetadata } from "../toolEffects.js";
import { evidenceResultOf } from "../toolOutputSchemaPrimitives.js";
import {
  inspectPeResourcesInputSchema,
  peResourcesSchema,
} from "../../domain/native/peResources.js";
import {
  emulateFunctionInputSchema,
  functionEmulationSchema,
} from "../../domain/native/functionEmulation.js";

/** Caller-selected delivery of completed binary layout Evidence. */
export const inspectBinaryLayoutRequestSchema =
  inspectBinaryLayoutInputSchema.extend({ detail: analysisDetailSchema });

/** Offline binary diagnostics are independent of macOS process/UI providers. */
export const BINARY_DIAGNOSTICS_TOOL_CONTRACTS = [
  {
    name: "search_chromium_resources",
    ...toolContractMetadata("search_chromium_resources"),
    kind: "native-provider",
    description:
      "Search decoded Chromium DataPack v4/v5 resource bytes for a case-sensitive literal without executing resources or launching a browser. Query encoding encodes the needle only; binary payloads remain candidates. Returns the first occurrence per matching canonical payload, exact decoded byte ranges/hashes, original stored ranges, all alias identities, and optional lossless text ranges. Validates the index once and decodes each admitted canonical resource once. Bounded canonical windows, per-resource/aggregate decode budgets, explicit skips and a stable next cursor preserve partial coverage. Use expected_sha256 when resuming. No original filename, MIME type or runtime use is inferred. Cancellation returns a typed error; no active target or external engine is required.",
    inputSchema: searchChromiumResourcesInputSchema,
    outputSchema: evidenceResultOf(chromiumResourceSearchSchema),
    examples: [
      {
        title: "Find candidate resources containing a literal",
        input: { path: "/artifacts/resources.pak", query: "content.js" },
      },
    ],
  },
  {
    name: "inspect_chromium_resources",
    ...toolContractMetadata("inspect_chromium_resources"),
    kind: "native-provider",
    description:
      "Inspect a stable local Chromium DataPack v4/v5 (.pak) without launching a browser. Validates the complete bounded numeric index and direct aliases, then returns an ID-ordered page with original table/payload offsets, stored-byte SHA-256 and compression candidates. Select resource_id for complete bounded stored or decoded bytes, decoded SHA-256 and an optional text preview. Gzip and Chromium-envelope Brotli are decoded only for that selected ID; decode:false preserves stored bytes. No filenames/MIME types are invented, resources are never executed, and outer gzip packs are unsupported. Padding/sentinel/unclaimed ranges are preserved. Large complete Evidence uses retained export; no active target, engine or installation is required.",
    inputSchema: inspectChromiumResourcesInputSchema,
    outputSchema: evidenceResultOf(chromiumResourcesSchema),
    examples: [
      {
        title: "Inventory a Chromium resource pack",
        input: { path: "/artifacts/resources.pak" },
      },
      {
        title: "Read one original resource ID",
        input: { path: "/artifacts/resources.pak", resource_id: 100 },
      },
    ],
  },
  {
    name: "emulate_function",
    ...toolContractMetadata("emulate_function"),
    kind: "native-provider",
    description:
      "Evaluate one concrete function state in a bounded CPU emulator, without launching the selected artifact or invoking host OS services. Supply an absolute original artifact path, arm64/x86_64 entry address, explicit file-offset code mappings, initial canonical registers, fully initialized memory and selected memory observations. Returns effective initial/final registers including SIMD bit patterns, selected memory changes, instruction-entry coverage and an explicit stop reason. Stops before external calls or the outer return and at missing/protected memory, unsupported runtime instructions and instruction/time/coverage limits. No automatic loader, relocation, ABI stack, runtime, TLS, imported-call stubs or argument inference; unspecified registers are modeled as zero with effective values recorded. Evidence is derived conditional replay and preserves artifact/engine hashes and assumptions, not observed app behavior. Initial macOS/Linux profile requires caller-supplied REA_UNICORN_PYTHON with Unicorn 2.1.2 and Capstone 5.0.6; no installation is performed.",
    inputSchema: emulateFunctionInputSchema,
    outputSchema: evidenceResultOf(functionEmulationSchema),
    examples: [
      {
        title: "Evaluate an explicitly mapped arm64 function",
        input: {
          path: "/artifacts/program",
          architecture: "arm64",
          entry_address: "0x1000",
          code_regions: [{ address: "0x1000", file_offset: 4096, size: 16 }],
          initial_registers: { x0: "0x2", x1: "0x3" },
        },
      },
    ],
  },
  {
    name: "inspect_pe_resources",
    ...toolContractMetadata("inspect_pe_resources"),
    kind: "native-provider",
    description:
      "Inspect one explicit local PE32/PE32+ image's complete bounded type/name/language resource tree without executing it or opening a disassembler. Returns numeric IDs versus original UTF-16 names, directory/data-entry file locations, payload RVA/file ranges, complete SHA-256 hashes and static RT_GROUP_ICON image-resource candidates. Language fallback, image decoding and actual shell/window loading remain unobserved. Reads a stable regular file; malformed or ambiguous mappings, non-identical overlapping ranges and exhausted budgets return no partial success. Portable on supported Node hosts; no Windows SDK or engine installation required.",
    inputSchema: inspectPeResourcesInputSchema,
    outputSchema: evidenceResultOf(peResourcesSchema),
    examples: [
      {
        title: "Inspect PE resource identities and icon relationships",
        input: { path: "/artifacts/application.exe" },
      },
    ],
  },
  {
    name: "inspect_binary_layout",
    ...toolContractMetadata("inspect_binary_layout"),
    kind: "native-provider",
    description:
      "Inspect an explicit local binary without launching it as a host process. Returns file-backed section/segment ranges, linked addresses, original symbol/REL/RELA table identities, complete encoded RELR tables and upstream-derived offsets with unknown per-word locations/addends, raw name bytes, dependency/interpreter names and static mitigation inferences inline with artifact SHA-256 Evidence. Initial profile: ELF64 x86-64 little-endian EXEC/DYN/REL on Linux x64 via caller-supplied Python with unchanged pwntools 4.15.0, pyelftools 0.33 and Unicorn 2.1.2. Runtime addresses/library paths, overall relocation inventory completeness and complete derived GOT/PLT coverage remain unknown. Zero executable entry values mean absence; relocatable entries are not applicable. Upstream can emulate PLT instructions with Unicorn for derived static maps. Uses bounded complete output and owned temporary files/processes; malformed, unsupported or oversized objects return no partial success. Select detail summary to retain the complete layout Evidence in this session and receive only its summary view, then inspect sections, symbols, mitigations or linkage with inspect_analysis_view.",
    inputSchema: inspectBinaryLayoutRequestSchema,
    outputSchema: analysisDetailOutputSchemaOf(binaryLayoutSchema),
    examples: [
      {
        title: "Inspect ELF linked and file layout",
        input: { path: "/artifacts/application.elf" },
      },
      {
        title: "Retain the complete layout and return its summary view",
        input: { path: "/artifacts/application.elf", detail: "summary" },
      },
    ],
  },
  {
    name: "inspect_recorded_crash",
    ...toolContractMetadata("inspect_recorded_crash"),
    kind: "native-provider",
    description:
      "Inspect a supplied Linux ELF64 amd64 little-endian core without launching its target or attaching to any live PID. Returns all recorded segments, raw note owners/descriptors and source ranges, every Linux CORE PRSTATUS thread/register and SIGINFO fields inline with SHA-256 Evidence. Historical PID is recorded metadata; current process/file identity, note coverage and signal-thread associations stay unknown. Optionally add derived core-only GDB/pwndbg mapping candidates through explicit BYO configuration; zero map flags mean unknown permissions. Uses the same stable snapshot for both stages, bounded complete output and owned cleanup. Initial Linux x64 profile: unchanged pwntools 4.15.0/pyelftools 0.33/Unicorn 2.1.2; optional unchanged pwndbg 2026.09.15. No implicit executable/library pairing, GDB command language, host configuration changes or dependency installation.",
    inputSchema: inspectRecordedCrashInputSchema,
    outputSchema: evidenceResultOf(recordedCrashSchema),
    examples: [
      {
        title: "Inspect recorded registers and signal evidence",
        input: { path: "/artifacts/crash.core" },
      },
      {
        title: "Add core-only debugger mapping candidates",
        input: {
          path: "/artifacts/crash.core",
          include_debugger_context: true,
        },
      },
    ],
  },
] as const satisfies readonly ToolContract[];
