import { describe, expect, it } from "vitest";

import {
  recordWorkflowUnknowns,
  createWorkflowEvidence,
} from "./WorkflowEvidence.js";
import { InvestigationRecords } from "./investigation/InvestigationRecords.js";
import { UnknownRegistryError } from "../domain/unknownRegistryError.js";
import { WorkflowEvidenceScope } from "./WorkflowEvidenceScope.js";
import {
  createAnalysisExecution,
  type AnalysisOperation,
} from "./AnalysisProvider.js";
import { AnalysisTimeoutError } from "../domain/analysisErrorCore.js";
import { err, ok } from "../domain/result.js";
import { nativeApiBoundarySchema } from "../domain/native/nativeApiBoundary.js";
import { projectNativeApiInspection } from "./native/NativeApiInspection.js";
import { functionDossierSchema } from "../domain/hopperValues.js";
import { ghidraFunctionDossier } from "../domain/ghidraValues.fixture.js";

describe("workflow residual question retention", () => {
  it("keeps questions linked to workflow Evidence and records repeats idempotently", () => {
    const records = new InvestigationRecords();
    const result = {
      residual_unknowns: ["Which provider resolves this boundary?"],
    };
    const evidence = createWorkflowEvidence({
      target: undefined,
      operation: "inspect_native_api",
      parameters: { procedure: "0x1000" },
      result,
      upstreamProfile: undefined,
    });
    expect(records.recordEvidence(evidence).ok).toBe(true);
    const input = {
      name: "inspect_native_api",
      result,
      evidenceId: evidence.evidence_id,
      recordUnknown: (
        unknown: Parameters<InvestigationRecords["recordUnknown"]>[0],
      ) => records.recordUnknown(unknown),
    };
    expect(recordWorkflowUnknowns(input).ok).toBe(true);
    expect(recordWorkflowUnknowns(input).ok).toBe(true);
    expect(records.listUnknowns()).toMatchObject([
      {
        question: result.residual_unknowns[0],
        domain: "native-api",
        supporting_evidence_ids: [evidence.evidence_id],
        required_authority: "shipped-artifact",
      },
    ]);
  });

  it.each([
    ["spaces", "  Which boundary?  "],
    ["line feed and tab", "\nWhich boundary?\t"],
    ["byte order mark", "\uFEFFWhich boundary?\uFEFF"],
  ])(
    "normalizes edge whitespace from %s without changing workflow Evidence",
    (_, question) => {
      const records = new InvestigationRecords();
      const result = { residual_unknowns: [question] };
      const evidence = createWorkflowEvidence({
        target: undefined,
        operation: "inspect_native_api",
        parameters: {},
        result,
        upstreamProfile: undefined,
      });

      expect(records.recordEvidence(evidence).ok).toBe(true);
      expect(
        recordWorkflowUnknowns({
          name: "inspect_native_api",
          result,
          evidenceId: evidence.evidence_id,
          recordUnknown: (unknown) => records.recordUnknown(unknown),
        }).ok,
      ).toBe(true);
      expect(records.listUnknowns()).toMatchObject([
        { question: "Which boundary?" },
      ]);
      expect(evidence.normalized_result).toEqual(result);
    },
  );

  it("rejects questions that are empty after whitespace normalization", () => {
    const records = new InvestigationRecords();
    const result = { residual_unknowns: [" \n\t "] };
    const evidence = createWorkflowEvidence({
      target: undefined,
      operation: "inspect_native_api",
      parameters: {},
      result,
      upstreamProfile: undefined,
    });

    expect(records.recordEvidence(evidence).ok).toBe(true);
    expect(
      recordWorkflowUnknowns({
        name: "inspect_native_api",
        result,
        evidenceId: evidence.evidence_id,
        recordUnknown: (unknown) => records.recordUnknown(unknown),
      }).ok,
    ).toBe(false);
    expect(records.listUnknowns()).toEqual([]);
    expect(evidence.normalized_result).toEqual(result);
  });

  it("preserves registry failures rather than presenting a completed workflow", () => {
    const error = new UnknownRegistryError("limit");
    expect(
      recordWorkflowUnknowns({
        name: "trace_feature",
        result: { residual_unknowns: ["Which branch handles the request?"] },
        evidenceId: "unretained",
        recordUnknown: () => err(error),
      }),
    ).toEqual(err(error));
  });
});

it.each([
  "  Which boundary?  ",
  "\nWhich boundary?\t",
  "\uFEFFWhich boundary?\uFEFF",
])(
  "retains contract-accepted question %j without rewriting workflow Evidence",
  (question) => {
    const boundary = nativeApiBoundarySchema.parse({
      available: false,
      reason: "Synthetic provider unavailable boundary",
      residual_unknowns: [question],
    });
    const dossier = functionDossierSchema.parse(ghidraFunctionDossier());
    const result = projectNativeApiInspection({
      ...dossier,
      native_api: boundary,
    });
    const evidence = createWorkflowEvidence({
      target: undefined,
      operation: "inspect_native_api",
      parameters: { procedure: "0x1000" },
      result,
      upstreamProfile: undefined,
    });
    const records = new InvestigationRecords();
    expect(records.recordEvidence(evidence).ok).toBe(true);
    expect(
      recordWorkflowUnknowns({
        name: "inspect_native_api",
        result,
        evidenceId: evidence.evidence_id,
        recordUnknown: (input) => records.recordUnknown(input),
      }).ok,
    ).toBe(true);
    expect(records.listUnknowns()).toMatchObject([
      { question: "Which boundary?" },
    ]);
    expect(records.evidenceById(evidence.evidence_id)).toEqual(evidence);
    expect(evidence.normalized_result).toMatchObject({
      residual_unknowns: [question],
    });
  },
);

describe("workflow upstream provenance", () => {
  it("commits the same limitations regardless of concurrent provider settlement order", async () => {
    const run = async (reverse: boolean) => {
      const pending = new Map<AnalysisOperation, () => void>();
      const scope = new WorkflowEvidenceScope(
        {
          execute: (operation) =>
            new Promise((resolve) => {
              pending.set(operation, () =>
                resolve(
                  ok(
                    createAnalysisExecution(
                      [],
                      { id: "fixture", name: "fixture", version: "1" },
                      { limitations: [operation] },
                    ),
                  ),
                ),
              );
            }),
        },
        "binary_overview",
      );
      const calls = [
        scope.execute("list_segments", {}),
        scope.execute("list_procedures", {}),
      ];
      for (const operation of (reverse
        ? ["list_procedures", "list_segments"]
        : ["list_segments", "list_procedures"]) as AnalysisOperation[])
        pending.get(operation)?.();
      await Promise.all(calls);
      return createWorkflowEvidence({
        target: undefined,
        operation: "binary_overview",
        parameters: {},
        result: {},
        upstreamProfile: undefined,
        upstreamLimitations: scope.limitations(),
      });
    };
    expect((await run(false)).evidence_id).toBe((await run(true)).evidence_id);
  });

  it("retains a swallowed startup failure qualification without persisting diagnostics as facts", async () => {
    const failure = new AnalysisTimeoutError("list_documents", 30, {
      context: {
        providerId: "ghidra",
        phase: "startup",
        stage: "awaiting-post-analysis-bridge",
        providerOperation: "list_documents",
        diagnostics: { stdout: "diagnostics-only" },
        remediationAction: "Change startup policy",
        retryable: false,
      },
    });
    const scope = new WorkflowEvidenceScope(
      { execute: () => Promise.resolve(err(failure)) },
      "trace_native_values",
    );
    const result = await scope.execute("list_documents", {});
    expect(result).toMatchObject({
      ok: false,
      error: {
        operation: "trace_native_values",
        context: { providerOperation: "list_documents" },
      },
    });
    expect(scope.limitations()).toEqual([
      expect.stringContaining("dependent workflow facts remain unknown"),
    ]);
    expect(JSON.stringify(scope.limitations())).not.toContain(
      "diagnostics-only",
    );
  });
});
