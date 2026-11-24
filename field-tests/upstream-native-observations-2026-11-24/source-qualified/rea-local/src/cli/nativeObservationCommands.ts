import { z } from "incur";
import type { Logger } from "pino";
import type { DirectAnalysis } from "../composition/directAnalysis.js";
import type { CliInstance } from "./types.js";
import { CLI_COMMANDS } from "../cliCommandNames.js";
import { NATIVE_OBSERVATION_OPERATIONS } from "../domain/native/nativeObservation.js";
import { jsonObjectSchema } from "../domain/jsonValue.js";
import { toolContract } from "../contracts/toolContracts.js";
import { projectAnalysisError } from "../domain/analysisErrorProjection.js";
import { analysisInputErrorFromIssues } from "../domain/inputIssueProjection.js";
import { logCliCommand } from "../cliLogging.js";
import { parseCliJsonInput } from "../cliJsonInput.js";
import {
  directAnalysisOptions,
  providerSelectionOption,
  formatSelectionOption,
  stagingDirSelectionOption,
} from "./options.js";
import { runCliRetainedAnalysis } from "./retainedAnalysis.js";

const inputSchema = z.strictObject({
  operation: z.enum(NATIVE_OBSERVATION_OPERATIONS),
  parameters: jsonObjectSchema,
});

/** One-shot access to the same named native read contracts and portable retained views. */
export function registerNativeObservationCommands(
  cli: CliInstance,
  logger: Logger,
  run: DirectAnalysis["runDirectAnalysis"],
): void {
  cli.command(CLI_COMMANDS.nativeObservation, {
    description:
      "Read native addresses, relationships or containment with portable source-context pages",
    args: z.object({
      path: z.string(),
      inputJson: z
        .string()
        .describe(
          'JSON or file with {"operation":"procedure_callees","parameters":{"procedure":"symbol"}}',
        ),
    }),
    options: z.object({
      provider: providerSelectionOption,
      "target-format": formatSelectionOption,
      "staging-dir": stagingDirSelectionOption,
      detail: z.enum(["complete", "summary"]).default("complete"),
      "evidence-output": z.string().min(1).optional(),
    }),
    run: ({ args, options: o }) =>
      logCliCommand(logger, CLI_COMMANDS.nativeObservation, async () => {
        const input = await parseCliJsonInput(
          args.inputJson,
          CLI_COMMANDS.nativeObservation,
        );
        if (!input.ok) return input.error;
        const parsed = inputSchema.safeParse(input.value);
        if (!parsed.success) return failure(parsed.error, input.value);
        const parameters = toolContract(
          parsed.data.operation,
        ).inputSchema.safeParse(parsed.data.parameters);
        if (!parameters.success) return failure(parameters.error, input.value);
        const semantic = jsonObjectSchema.parse(parameters.data);
        delete semantic.detail;
        return runCliRetainedAnalysis(
          (signal) =>
            run(args.path, parsed.data.operation, semantic, {
              ...directAnalysisOptions(logger, {
                providerId: o.provider,
                formatHint: o["target-format"],
                stagingDir: o["staging-dir"],
              }),
              signal,
            }),
          {
            operation: parsed.data.operation,
            detail: o.detail,
            evidenceOutput: o["evidence-output"],
          },
        );
      }),
  });
}
const failure = (error: z.ZodError, input: unknown) => ({
  error: "Native observation input is invalid",
  ...projectAnalysisError(
    analysisInputErrorFromIssues("native-observation", error.issues, input, {
      cause: error,
    }),
  ),
});
