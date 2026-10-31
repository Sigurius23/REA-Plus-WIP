import type { ApplicationNode } from "../../domain/javascript/javascriptApplicationGraphSchemas.js";
import type { JavaScriptArtifactFile } from "../../domain/javascript/javascriptArtifactFiles.js";
import type { JavaScriptSenderValidationFinding } from "../../domain/javascript/javascriptStaticAnalysisTypes.js";
import type {
  JavaScriptArtifactGraphContext,
  JavaScriptArtifactGraphCoverage,
} from "./JavaScriptArtifactGraphContext.js";
import { astObservationEvidence } from "./JavaScriptArtifactGraphEvidence.js";

/** Preserve a validation's syntax and transport without asserting enforcement. */
export const addSenderValidationObservation = (
  context: JavaScriptArtifactGraphContext,
  input: {
    readonly file: JavaScriptArtifactFile;
    readonly validation: JavaScriptSenderValidationFinding;
    readonly target: ApplicationNode;
    readonly coverage: JavaScriptArtifactGraphCoverage;
  },
): void => {
  const { file, validation, target, coverage } = input;
  context.accumulator.addNode({
    kind: target.kind,
    identity: target.identity,
    observations: [
      {
        label: `${validation.subject} validation candidate`,
        properties: {
          fact_kind: "sender-validation-candidate",
          transport: validation.transport ?? null,
          subject: validation.subject,
          mechanism: validation.mechanism,
          expected: validation.expected,
          enforcement: validation.enforcement,
        },
        evidence: astObservationEvidence({
          sha256: file.sha256,
          path: file.path,
          range: validation.location,
          operation: "observe-sender-validation-candidate",
          coverage,
          limitations: [
            "A comparison or string check is visible, but static syntax alone does not prove rejection, ordering, or complete sender validation.",
          ],
        }),
      },
    ],
  });
};
