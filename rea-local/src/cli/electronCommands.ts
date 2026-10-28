import { Cli, z } from "incur";

import { logCliCommand } from "../cliLogging.js";
import {
  inspectElectronPageInputSchema,
  listElectronTargetsInputSchema,
} from "../domain/javascript/electronObservation.js";
import { electronActiveObservationInputSchema } from "../domain/javascript/electronActiveObservation.js";
import { AnalysisInputError } from "../domain/analysisErrorCore.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import { projectInputIssues } from "../domain/inputIssueProjection.js";
import type { JsonValue } from "../domain/jsonValue.js";
import type { Logger } from "pino";
import { CLI_COMMANDS } from "../cliCommandNames.js";
import { parseCliJsonInput, resolveCliJsonPaths } from "../cliJsonInput.js";
import {
  electronPageInspectionOptions,
  javascriptApplicationOptions,
} from "../cliObservationOptions.js";
import {
  runCliJavaScriptApplicationAnalysis,
  runCliJavaScriptStringSearch,
} from "./javascriptApplicationAnalysis.js";
import { withCommandCancellation } from "./commandCancellation.js";

/** Register CLI equivalents of the Electron MCP tools. */
export const registerElectronCommands = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
  environment: Readonly<Record<string, string | undefined>>,
): void => {
  registerElectronObservationCommands(cli, logger);
  registerElectronActiveCommand(cli, logger, environment);
  registerJavaScriptApplicationCommand(cli, logger);
  registerJavaScriptStringSearchCommand(cli, logger);
  registerJavaScriptRuntimeReconciliationCommand(cli, logger);
};

const registerElectronActiveCommand = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
  environment: Readonly<Record<string, string | undefined>>,
): void => {
  cli.command(CLI_COMMANDS.captureElectronScenario, {
    description: "Run one owned Electron scenario with cancellable actions",
    args: z.object({
      inputJson: z
        .string()
        .describe(
          "Inline JSON or a JSON file matching capture_electron_scenario",
        ),
    }),
    run: ({ args }) =>
      withCommandCancellation((signal) =>
        logCliCommand(
          logger,
          CLI_COMMANDS.captureElectronScenario,
          async () => {
            const input = await parseCliJsonInput(
              args.inputJson,
              "capture_electron_scenario",
            );
            if (!input.ok) return input.error;
            const parsed = electronActiveObservationInputSchema.safeParse(
              resolveCliJsonPaths(input.value, [
                ["executable_path"],
                ["application_path"],
                ["application_root"],
              ]),
            );
            if (!parsed.success)
              return inputError(
                "capture_electron_scenario",
                parsed.error.issues,
                input.value,
              );
            const { captureElectronScenario } =
              await import("../application/javascript/ElectronActiveObservationService.js");
            const { createElectronScenarioProvider } =
              await import("../composition/electronScenario.js");
            const result = await captureElectronScenario(
              createElectronScenarioProvider(environment),
              parsed.data,
              { signal },
            );
            return result.ok ? result.value : cliError(result.error);
          },
        ),
      ),
  });
};

const registerJavaScriptStringSearchCommand = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
): void => {
  cli.command(CLI_COMMANDS.searchJavascriptStrings, {
    description:
      "Search an extracted JavaScript application's string constants or identifiers by case-sensitive substring",
    args: z.object({
      path: z.string().describe("ASAR or extracted application path"),
      query: z.string().min(1).describe("Case-sensitive substring to find"),
    }),
    options: z.object({
      scope: z
        .enum(["strings", "identifiers"])
        .optional()
        .describe(
          "Search string constants (default) or runtime identifier names",
        ),
      fileLimit: z
        .number()
        .int()
        .positive()
        .max(8192)
        .optional()
        .describe(
          "JavaScript files to scan in path order (default 256, cap 8192)",
        ),
      matchLimit: z
        .number()
        .int()
        .positive()
        .max(8192)
        .optional()
        .describe("Returned matches (default 1024, cap 8192)"),
      integrityPolicy: z
        .enum(["fail", "record-and-continue"])
        .optional()
        .describe("Declared-versus-observed integrity handling (default fail)"),
    }),
    run: ({ args, options }) =>
      withCommandCancellation((signal) =>
        logCliCommand(logger, CLI_COMMANDS.searchJavascriptStrings, () =>
          runCliJavaScriptStringSearch(
            {
              input_path: args.path,
              query: args.query,
              ...(options.scope === undefined ? {} : { scope: options.scope }),
              ...(options.fileLimit === undefined
                ? {}
                : { file_limit: options.fileLimit }),
              ...(options.matchLimit === undefined
                ? {}
                : { match_limit: options.matchLimit }),
              ...(options.integrityPolicy === undefined
                ? {}
                : { integrity_policy: options.integrityPolicy }),
            },
            signal,
          ),
        ),
      ),
  });
};

const registerJavaScriptRuntimeReconciliationCommand = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
): void => {
  cli.command(CLI_COMMANDS.reconcileJavaScriptRuntime, {
    description:
      "Reconcile static application and passive runtime Evidence JSON",
    args: z.object({
      inputJson: z
        .string()
        .describe(
          "Inline JSON or a JSON file path matching reconcile_javascript_runtime",
        ),
    }),
    run: ({ args }) =>
      logCliCommand(
        logger,
        CLI_COMMANDS.reconcileJavaScriptRuntime,
        async () => {
          const input = await parseCliJsonInput(
            args.inputJson,
            "reconcile_javascript_runtime",
          );
          if (!input.ok) return input.error;
          const { reconcileJavaScriptRuntimeEvidence } =
            await import("../application/javascript/JavaScriptRuntimeReconciliationService.js");
          const result = reconcileJavaScriptRuntimeEvidence(input.value);
          return result.ok ? result.value : cliError(result.error);
        },
      ),
  });
};

const registerElectronObservationCommands = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
): void => {
  registerElectronTargetList(cli, logger);
  registerElectronPageInspection(cli, logger);
};

const registerElectronTargetList = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
): void => {
  cli.command(CLI_COMMANDS.listElectronTargets, {
    description:
      "List local file pages exposed by the selected Electron CDP endpoint",
    args: z.object({
      endpoint: z.string().describe("Literal-loopback Electron CDP endpoint"),
    }),
    run: ({ args }) =>
      logCliCommand(logger, "list-electron-targets", async () => {
        const context = await electronObservationContext();
        const parsed = listElectronTargetsInputSchema.safeParse({
          cdp_endpoint: args.endpoint,
        });
        if (!parsed.success) return inputError("list_electron_targets");
        const { listElectronTargets } =
          await import("../application/javascript/ElectronObservationService.js");
        const result = await listElectronTargets(context.provider, parsed.data);
        return result.ok ? result.value : cliError(result.error);
      }),
  });
};

const registerElectronPageInspection = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
): void => {
  cli.command(CLI_COMMANDS.inspectElectronPage, {
    description: "Passively inspect one Electron file page",
    args: z.object({
      endpoint: z.string().describe("Literal-loopback Electron CDP endpoint"),
      targetId: z.string().describe("Target ID from list-electron-targets"),
    }),
    options: electronPageInspectionOptions,
    run: ({ args, options }) =>
      logCliCommand(logger, "inspect-electron-page", async () => {
        const context = await electronObservationContext();
        const parsed = inspectElectronPageInputSchema.safeParse({
          cdp_endpoint: args.endpoint,
          target_id: args.targetId,
          observation_ms: options.observationMs,
          include_script_sources: options.includeScriptSources,
        });
        if (!parsed.success) return inputError("inspect_electron_page");
        const { inspectElectronPage } =
          await import("../application/javascript/ElectronObservationService.js");
        const result = await inspectElectronPage(context.provider, parsed.data);
        return result.ok ? result.value : cliError(result.error);
      }),
  });
};

const registerJavaScriptApplicationCommand = (
  cli: ReturnType<typeof Cli.create>,
  logger: Logger,
): void => {
  cli.command(CLI_COMMANDS.analyzeJavaScriptApplication, {
    description:
      "Statically reconstruct a local JavaScript/Electron application",
    args: z.object({
      path: z.string().describe("ASAR or extracted application path"),
    }),
    options: javascriptApplicationOptions,
    run: ({ args, options }) =>
      withCommandCancellation((signal) =>
        logCliCommand(logger, CLI_COMMANDS.analyzeJavaScriptApplication, () =>
          runCliJavaScriptApplicationAnalysis(
            {
              input_path: args.path,
              format: options.artifactFormat,
              integrity_policy: options.integrityPolicy,
              ...(options.maxHeapMb === undefined
                ? {}
                : { max_heap_mb: options.maxHeapMb }),
              ...(options.analysisTimeoutMs === undefined
                ? {}
                : { analysis_timeout_ms: options.analysisTimeoutMs }),
              ...(options.maxSemanticSourceBytes === undefined
                ? {}
                : {
                    max_semantic_source_bytes: options.maxSemanticSourceBytes,
                  }),
              ...(options.scanShippedMaterial === undefined
                ? {}
                : { scan_shipped_material: options.scanShippedMaterial }),
              ...(options.pathsInclude === undefined
                ? {}
                : { paths_include: options.pathsInclude }),
              ...(options.pathsExclude === undefined
                ? {}
                : { paths_exclude: options.pathsExclude }),
            },
            signal,
          ),
        ),
      ),
  });
};

const electronObservationContext = async () => {
  const { createElectronObservationProvider } =
    await import("../composition/electronObservation.js");
  return { provider: createElectronObservationProvider() };
};

const inputError = (
  operation: string,
  issues?: Parameters<typeof projectInputIssues>[0],
  input?: unknown,
): JsonValue =>
  cliError(
    new AnalysisInputError(
      operation,
      undefined,
      issues === undefined ? [] : projectInputIssues(issues, input),
    ),
  );

const cliError = (
  error: Parameters<typeof projectAnalysisError>[0],
): JsonValue => ({
  error: "Electron analysis failed",
  ...projectAnalysisError(error),
});
