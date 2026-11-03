import { searchChromiumResourcesInputSchema } from "../domain/native/chromiumResourceSearch.js";
import { z } from "incur";
import { resolve } from "node:path";
import {
  createRecordedCrashService,
  createBinaryLayoutService,
  createPeResourcesService,
  createFunctionEmulationService,
  createChromiumResourcesService,
  createChromiumResourceSearchService,
} from "../composition/binaryDiagnostics.js";
import { CLI_COMMANDS } from "../cliCommandNames.js";
import { logCliCommand } from "../cliLogging.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import type { Logger } from "pino";
import type { CliInstance } from "./types.js";
import { withCommandCancellation } from "./commandCancellation.js";
import { inspectPeResourcesInputSchema } from "../domain/native/peResources.js";
import { inspectChromiumResourcesInputSchema } from "../domain/native/chromiumResources.js";
import { parseCliJsonInput, resolveCliJsonPaths } from "../cliJsonInput.js";

/** Inspect operator-selected files through the same shared workflow as MCP. */
export const registerBinaryDiagnosticsCommands = (
  cli: CliInstance,
  logger: Logger,
  environment: Readonly<NodeJS.ProcessEnv>,
): void => {
  const search = createChromiumResourceSearchService();
  const shape = searchChromiumResourcesInputSchema.shape;
  cli.command(CLI_COMMANDS.searchChromiumResources, {
    description:
      "Search bounded decoded Chromium resource windows for literal byte candidates",
    args: z.object({ path: z.string().describe("Local Chromium .pak file") }),
    options: z.object({
      query: shape.query,
      queryEncoding: shape.query_encoding,
      canonicalOffset: shape.canonical_offset,
      scanLimit: shape.scan_limit,
      matchLimit: shape.match_limit,
      maxFileBytes: shape.max_file_bytes,
      maxResourceBytes: shape.max_resource_bytes,
      maxTotalDecodedBytes: shape.max_total_decoded_bytes,
      expectedSha256: shape.expected_sha256,
    }),
    run: ({ args, options }) =>
      withCommandCancellation((signal) =>
        logCliCommand(
          logger,
          CLI_COMMANDS.searchChromiumResources,
          async () => {
            const result = await search.search(
              {
                path: resolve(args.path),
                query: options.query,
                query_encoding: options.queryEncoding,
                canonical_offset: options.canonicalOffset,
                scan_limit: options.scanLimit,
                match_limit: options.matchLimit,
                max_file_bytes: options.maxFileBytes,
                max_resource_bytes: options.maxResourceBytes,
                max_total_decoded_bytes: options.maxTotalDecodedBytes,
                expected_sha256: options.expectedSha256,
              },
              { signal },
            );
            return result.ok
              ? result.value
              : projectAnalysisError(result.error);
          },
        ),
      ),
  });
  const chromium = createChromiumResourcesService();
  cli.command(CLI_COMMANDS.inspectChromiumResources, {
    description:
      "Inspect Chromium DataPack resource IDs, aliases and selected decoded bytes without executing them",
    args: z.object({ path: z.string().describe("Local Chromium .pak file") }),
    options: z.object({
      offset: inspectChromiumResourcesInputSchema.shape.offset,
      limit: inspectChromiumResourcesInputSchema.shape.limit,
      resourceId: inspectChromiumResourcesInputSchema.shape.resource_id,
      stored: z
        .boolean()
        .default(false)
        .describe(
          "Return stored bytes for the selected ID without decompression",
        ),
      maxFileBytes: inspectChromiumResourcesInputSchema.shape.max_file_bytes,
      maxResourceBytes:
        inspectChromiumResourcesInputSchema.shape.max_resource_bytes,
    }),
    run: ({ args, options }) =>
      withCommandCancellation((signal) =>
        logCliCommand(
          logger,
          CLI_COMMANDS.inspectChromiumResources,
          async () => {
            const result = await chromium.inspect(
              {
                path: resolve(args.path),
                offset: options.offset,
                limit: options.limit,
                resource_id: options.resourceId,
                decode: !options.stored,
                max_file_bytes: options.maxFileBytes,
                max_resource_bytes: options.maxResourceBytes,
              },
              { signal },
            );
            return result.ok
              ? result.value
              : projectAnalysisError(result.error);
          },
        ),
      ),
  });
  const emulation = createFunctionEmulationService(environment);
  cli.command(CLI_COMMANDS.emulateFunction, {
    description:
      "Evaluate explicit function state in a bounded emulator; accepts inline JSON or a JSON request file",
    args: z.object({
      inputJson: z.string().describe("Emulation request JSON or file path"),
    }),
    run: ({ args }) =>
      withCommandCancellation((signal) =>
        logCliCommand(logger, CLI_COMMANDS.emulateFunction, async () => {
          const input = await parseCliJsonInput(
            args.inputJson,
            "emulate_function",
          );
          if (!input.ok) return input.error;
          const result = await emulation.emulate(
            resolveCliJsonPaths(input.value, [["path"]]),
            { signal },
          );
          return result.ok ? result.value : projectAnalysisError(result.error);
        }),
      ),
  });
  const pe = createPeResourcesService();
  cli.command(CLI_COMMANDS.inspectPeResources, {
    description:
      "Inspect PE resource identities, payload ranges, hashes and icon-group relationships",
    args: z.object({ path: z.string().describe("Local PE32/PE32+ image") }),
    options: z.object({
      maxFileBytes: inspectPeResourcesInputSchema.shape.max_file_bytes,
      maxEntries: inspectPeResourcesInputSchema.shape.max_entries,
    }),
    run: ({ args, options }) =>
      withCommandCancellation((signal) =>
        logCliCommand(logger, CLI_COMMANDS.inspectPeResources, async () => {
          const result = await pe.inspect(
            {
              path: resolve(args.path),
              max_file_bytes: options.maxFileBytes,
              max_entries: options.maxEntries,
            },
            { signal },
          );
          return result.ok ? result.value : projectAnalysisError(result.error);
        }),
      ),
  });
  const service = createBinaryLayoutService(environment);
  cli.command(CLI_COMMANDS.inspectBinaryLayout, {
    description:
      "Inspect binary file/linked layout without executing the selected object",
    args: z.object({
      path: z.string().describe("Local ELF binary or relocatable object"),
    }),
    run: ({ args }) =>
      withCommandCancellation((signal) =>
        logCliCommand(logger, CLI_COMMANDS.inspectBinaryLayout, async () => {
          const result = await service.inspect(
            { path: resolve(args.path) },
            { signal },
          );
          return result.ok ? result.value : projectAnalysisError(result.error);
        }),
      ),
  });
  const recorded = createRecordedCrashService(environment);
  cli.command(CLI_COMMANDS.inspectRecordedCrash, {
    description:
      "Inspect supplied core registers/signals and optional debugger mapping evidence",
    args: z.object({ path: z.string().describe("Local Linux amd64 ELF core") }),
    options: z.object({
      debuggerContext: z
        .boolean()
        .default(false)
        .describe("Add BYO core-only GDB/pwndbg mapping candidates"),
    }),
    run: ({ args, options }) =>
      withCommandCancellation((signal) =>
        logCliCommand(logger, CLI_COMMANDS.inspectRecordedCrash, async () => {
          const result = await recorded.inspect(
            {
              path: resolve(args.path),
              include_debugger_context: options.debuggerContext,
            },
            { signal },
          );
          return result.ok ? result.value : projectAnalysisError(result.error);
        }),
      ),
  });
};
