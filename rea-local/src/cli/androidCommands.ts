import { z } from "incur";
import { AnalysisError } from "../domain/analysisErrorBase.js";
import { AndroidAnalysisService } from "../application/android/AndroidAnalysisService.js";
import { createAndroidAnalysisProvider } from "../composition/android.js";
import { CLI_COMMANDS } from "../cliCommandNames.js";
import { logCliCommand } from "../cliLogging.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import type { AndroidOperation } from "../domain/android/androidAnalysis.js";
import type { Logger } from "pino";
import type { CliInstance } from "./types.js";
import { withCommandCancellation } from "./commandCancellation.js";

/** Expose the same explicit APK requests through one-shot CLI commands. */
export const registerAndroidCommands = (
  cli: CliInstance,
  logger: Logger,
  environment: Readonly<Record<string, string | undefined>>,
): void => {
  const provider = createAndroidAnalysisProvider(environment);
  const service = new AndroidAnalysisService(provider);
  const execute = (name: string, operation: AndroidOperation, input: unknown) =>
    withCommandCancellation((signal) =>
      logCliCommand(logger, name, async () => {
        const result = await service.execute(operation, input, { signal });
        try {
          await provider.close();
        } catch (cause) {
          if (cause instanceof AnalysisError)
            return projectAnalysisError(cause);
          throw cause;
        }
        return result.ok ? result.value : projectAnalysisError(result.error);
      }),
    );
  const selectionOptions = {
    apkMembers: z
      .array(z.string().min(1))
      .optional()
      .describe(
        "Exact .apks or loose-set APK members; repeat for each selected split",
      ),
    baseApk: z
      .string()
      .min(1)
      .optional()
      .describe("Base APK among selected members"),
  };
  const selection = (options: {
    apkMembers?: string[] | undefined;
    baseApk?: string | undefined;
  }) => ({
    ...(options.apkMembers === undefined
      ? {}
      : { apk_members: options.apkMembers }),
    ...(options.baseApk === undefined ? {} : { base_apk: options.baseApk }),
  });
  const path = z
    .string()
    .describe(
      "Local APK, XAPK, selected .apks, loose APK directory or AAB path",
    );
  const className = z.string().describe("Exact fully qualified class name");
  cli.command(CLI_COMMANDS.inspectAndroidPackage, {
    description:
      "Inspect APK declarations and decoded manifest without executing it",
    args: z.object({ path }),
    options: z.object({
      ...selectionOptions,
      verifySignatures: z
        .boolean()
        .optional()
        .describe(
          "Verify original APK signatures with configured REA_APKSIG_JAR",
        ),
    }),
    run: ({ args, options }) =>
      execute(CLI_COMMANDS.inspectAndroidPackage, "inspect_android_package", {
        ...args,
        ...selection(options),
        ...(options.verifySignatures === undefined
          ? {}
          : { verify_signatures: options.verifySignatures }),
      }),
  });
  cli.command(CLI_COMMANDS.searchAndroidClasses, {
    description: "Search APK class names; empty query inventories all classes",
    args: z.object({
      path,
      query: z
        .string()
        .describe(
          "Case-sensitive class-name substring; empty lists all classes",
        ),
    }),
    options: z.object(selectionOptions),
    run: ({ args, options }) =>
      execute(CLI_COMMANDS.searchAndroidClasses, "search_android_classes", {
        ...args,
        ...selection(options),
      }),
  });
  cli.command(CLI_COMMANDS.searchAndroidStrings, {
    description: "Search APK string constants by case-sensitive substring",
    args: z.object({
      path,
      query: z
        .string()
        .min(1)
        .describe("Case-sensitive substring to find in dex string constants"),
    }),
    options: z.object({
      ...selectionOptions,
      scanMode: z
        .enum(["decompiled", "dex"])
        .optional()
        .describe(
          "Search decompiled bodies (default, class cap 8192) or raw DEX const-string instructions",
        ),
      analysisTimeoutMs: z
        .number()
        .int()
        .positive()
        .max(2147483647)
        .optional()
        .describe(
          "Total string-search deadline in milliseconds; default 120000",
        ),
      classLimit: z
        .number()
        .int()
        .positive()
        .max(2147483647)
        .optional()
        .describe(
          "Class identities to scan (default 256; decompiled mode cap 8192)",
        ),
    }),
    run: ({ args, options }) =>
      execute(CLI_COMMANDS.searchAndroidStrings, "search_android_strings", {
        ...selection(options),
        path: args.path,
        query: args.query,
        ...(options.scanMode === undefined
          ? {}
          : { scan_mode: options.scanMode }),
        ...(options.analysisTimeoutMs === undefined
          ? {}
          : { analysis_timeout_ms: options.analysisTimeoutMs }),
        ...(options.classLimit === undefined
          ? {}
          : { class_limit: options.classLimit }),
      }),
  });
  cli.command(CLI_COMMANDS.inspectAndroidClass, {
    description: "Inspect one exact APK class's member inventory",
    args: z.object({ path, className }),
    options: z.object(selectionOptions),
    run: ({ args, options }) =>
      execute(CLI_COMMANDS.inspectAndroidClass, "inspect_android_class", {
        ...selection(options),
        path: args.path,
        class_name: args.className,
      }),
  });
  cli.command(CLI_COMMANDS.inspectAndroidMethod, {
    description: "Decompile one APK method with explicit overload selection",
    args: z.object({
      path,
      className,
      methodName: z.string().describe("Exact declared method name"),
    }),
    options: z.object({
      ...selectionOptions,
      overloadIndex: z
        .number()
        .int()
        .nonnegative()
        .optional()
        .describe(
          "Explicit zero-based index among same-name methods; required when ambiguous",
        ),
    }),
    run: ({ args, options }) =>
      execute(CLI_COMMANDS.inspectAndroidMethod, "inspect_android_method", {
        ...selection(options),
        path: args.path,
        class_name: args.className,
        method_name: args.methodName,
        ...(options.overloadIndex === undefined
          ? {}
          : { overload_index: options.overloadIndex }),
      }),
  });
  cli.command(CLI_COMMANDS.traceAndroidReferences, {
    description: "Trace incoming APK class or unique-method references",
    args: z.object({ path, className }),
    options: z.object({
      ...selectionOptions,
      methodName: z
        .string()
        .optional()
        .describe("Unique declared method name; omit for class references"),
    }),
    run: ({ args, options }) =>
      execute(CLI_COMMANDS.traceAndroidReferences, "trace_android_references", {
        ...selection(options),
        path: args.path,
        class_name: args.className,
        ...(options.methodName === undefined
          ? {}
          : { method_name: options.methodName }),
      }),
  });
};
