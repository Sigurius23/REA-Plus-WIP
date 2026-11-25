import { z } from "incur";
import { jsonObjectSchema } from "../domain/jsonValue.js";
import { resolve } from "node:path";
import type { DirectAnalysis } from "../composition/directAnalysis.js";
import type { Logger } from "pino";
import type { CliInstance } from "./types.js";
import { CLI_COMMANDS } from "../cliCommandNames.js";
import { logCliCommand } from "../cliLogging.js";
import { parseCliJsonInput } from "../cliJsonInput.js";
import { enhancedInputSchemas } from "../contracts/enhancedInputs.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import { analysisInputErrorFromIssues } from "../domain/inputIssueProjection.js";
import {
  directAnalysisOptions,
  providerSelectionOption,
  formatSelectionOption,
  stagingDirSelectionOption,
} from "./options.js";
import { runCliRetainedAnalysis } from "./retainedAnalysis.js";
const options = {
  provider: providerSelectionOption,
  "target-format": formatSelectionOption,
  "staging-dir": stagingDirSelectionOption,
  detail: z.enum(["complete", "summary"]).default("complete"),
  "evidence-output": z
    .string()
    .min(1)
    .optional()
    .describe("New portable complete Evidence bundle; required for summary"),
};
/** Native inventories and explicit batches share the existing direct-analysis and delivery owners. */
export function registerNativeInventoryCommands(
  cli: CliInstance,
  logger: Logger,
  run: DirectAnalysis["runDirectAnalysis"],
): void {
  cli.command(CLI_COMMANDS.decompileAll, {
    description:
      "Export analyzed native pseudocode to files with verified resume and a compact manifest",
    args: z.object({ path: z.string() }),
    options: z.object({
      provider: providerSelectionOption,
      "target-format": formatSelectionOption,
      "staging-dir": stagingDirSelectionOption,
      output: z
        .string()
        .min(1)
        .describe("New output directory; its parent must exist"),
      resume: z.boolean().default(false),
      name: z.string().optional(),
      "address-start": z.string().optional(),
      "address-end": z.string().optional(),
      limit: z.number().int().positive().optional(),
    }),
    run: ({ args, options: o }) =>
      logCliCommand(logger, CLI_COMMANDS.decompileAll, async () => {
        const input = {
          output_directory: resolve(o.output),
          resume: o.resume,
          ...(o.name === undefined ? {} : { name: o.name }),
          ...(o["address-start"] === undefined
            ? {}
            : { address_start: o["address-start"] }),
          ...(o["address-end"] === undefined
            ? {}
            : { address_end: o["address-end"] }),
          ...(o.limit === undefined ? {} : { limit: o.limit }),
        };
        const parsed = enhancedInputSchemas.decompile_all.safeParse(input);
        if (!parsed.success)
          return {
            error: "Export input is invalid",
            ...projectAnalysisError(
              analysisInputErrorFromIssues(
                "decompile_all",
                parsed.error.issues,
                input,
                { cause: parsed.error },
              ),
            ),
          };
        return run(
          args.path,
          "decompile_all",
          jsonObjectSchema.parse(parsed.data),
          directAnalysisOptions(logger, {
            providerId: o.provider,
            formatHint: o["target-format"],
            stagingDir: o["staging-dir"],
          }),
        );
      }),
  });
  cli.command(CLI_COMMANDS.nativeInventory, {
    description:
      "List analyzed native names, procedures or strings; optionally retain a summary and portable pages",
    args: z.object({ path: z.string() }),
    options: z.object({
      ...options,
      kind: z.enum(["names", "procedures", "strings"]).default("procedures"),
    }),
    run: ({ args, options: o }) =>
      logCliCommand(logger, CLI_COMMANDS.nativeInventory, () => {
        const operation =
          o.kind === "names"
            ? "list_names"
            : o.kind === "strings"
              ? "list_strings"
              : "list_procedures";
        return runCliRetainedAnalysis(
          (signal) =>
            run(
              args.path,
              operation,
              {},
              {
                ...directAnalysisOptions(logger, {
                  providerId: o.provider,
                  formatHint: o["target-format"],
                  stagingDir: o["staging-dir"],
                }),
                signal,
              },
            ),
          { operation, detail: o.detail, evidenceOutput: o["evidence-output"] },
        );
      }),
  });
  cli.command(CLI_COMMANDS.batchDecompile, {
    description:
      "Decompile an ordered JSON addresses array with per-item outcomes and optional retained pages",
    args: z.object({
      path: z.string(),
      inputJson: z
        .string()
        .describe('JSON or JSON file with {"addresses":["symbol","0x1234"]}'),
    }),
    options: z.object(options),
    run: ({ args, options: o }) =>
      logCliCommand(logger, CLI_COMMANDS.batchDecompile, async () => {
        const input = await parseCliJsonInput(
          args.inputJson,
          CLI_COMMANDS.batchDecompile,
        );
        if (!input.ok) return input.error;
        const parsed = enhancedInputSchemas.batch_decompile.safeParse(
          input.value,
        );
        if (!parsed.success)
          return {
            error: "Batch input is invalid",
            ...projectAnalysisError(
              analysisInputErrorFromIssues(
                "batch_decompile",
                parsed.error.issues,
                input.value,
                { cause: parsed.error },
              ),
            ),
          };
        return runCliRetainedAnalysis(
          (signal) =>
            run(
              args.path,
              "batch_decompile",
              { addresses: parsed.data.addresses },
              {
                ...directAnalysisOptions(logger, {
                  providerId: o.provider,
                  formatHint: o["target-format"],
                  stagingDir: o["staging-dir"],
                }),
                signal,
              },
            ),
          {
            operation: "batch_decompile",
            detail: o.detail,
            evidenceOutput: o["evidence-output"],
          },
        );
      }),
  });
}
