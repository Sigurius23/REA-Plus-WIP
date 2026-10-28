import { createJavaScriptAnalysisPathScope } from "../../domain/javascript/javascriptAnalysisPathScope.js";
import {
  completeApplicationCoverage,
  partialApplicationCoverage,
} from "../../domain/javascript/javascriptApplicationEvidenceSchemas.js";
import {
  artifactLocalIdentity,
  javascriptAnalysisCoverage,
  type JavaScriptArtifactGraphContext,
} from "./JavaScriptArtifactGraphContext.js";
import {
  artifactObservationEvidence,
  astObservationEvidence,
} from "./JavaScriptArtifactGraphEvidence.js";

/** Opt-in inventory and isolated-worker candidates; no source is parsed in the parent. */
export function* addJavaScriptShippedMaterialSteps(
  context: JavaScriptArtifactGraphContext,
): Generator<void, void> {
  const scope = createJavaScriptAnalysisPathScope(context.fileSet.paths_scope);
  const nodes = new Map(
    context.snapshot.nodes.map((node) => [node.artifact_id, node]),
  );
  let candidates = 0;
  let examined = 0;
  let unavailable = 0;
  let unprojected = 0;
  for (const entry of context.snapshot.occurrences) {
    if (
      entry.entry_kind !== "file" ||
      !scope.considersPath(entry.logical_path) ||
      !/\.(?:p12|pfx|pem|key|der|cer|crt|jks|keystore)$/iu.test(
        entry.logical_path,
      )
    )
      continue;
    const node =
      entry.artifact_id === null ? undefined : nodes.get(entry.artifact_id);
    if (node === undefined) {
      unavailable += 1;
      continue;
    }
    candidates += 1;
    context.accumulator.addNode({
      kind: "artifact",
      identity: artifactLocalIdentity(
        node.sha256,
        "shipped-material",
        entry.logical_path,
      ),
      observations: [
        {
          label: "Declared key/certificate material candidate",
          properties: {
            candidate_kind: "key-certificate-extension",
            path: entry.logical_path,
            sha256: node.sha256,
            bytes: node.size,
            hash_status: entry.hash_status,
            content_status: "not-classified",
            secrecy: "unknown",
          },
          evidence: artifactObservationEvidence({
            sha256: node.sha256,
            path: entry.logical_path,
            operation: "scan-shipped-material",
            coverage: completeApplicationCoverage(),
            limitations: [
              "Filename extension is a candidate rule; certificate contents, private-key presence, usability and secrecy are unverified.",
            ],
          }),
        },
      ],
    });
    yield;
  }
  for (const { file, javascript, application_projection_failure } of context
    .analysis.files) {
    if (file.kind !== "javascript") continue;
    const literals = javascript?.shipped_material_candidates;
    if (literals === undefined) {
      unavailable += 1;
      continue;
    }
    examined += 1;
    if (application_projection_failure !== undefined) {
      unprojected += literals.length;
      continue;
    }
    for (const [index, literal] of literals.entries()) {
      candidates += 1;
      context.accumulator.addNode({
        kind: "artifact",
        identity: artifactLocalIdentity(
          file.sha256,
          "shipped-material",
          `${file.path}:${String(index)}`,
        ),
        observations: [
          {
            label: "Hexadecimal literal candidate",
            properties: {
              candidate_kind: "hex-literal",
              path: file.path,
              sha256: file.sha256,
              literal_length: literal.literal_length,
              value_sha256: literal.value_sha256,
              secrecy: "unknown",
            },
            evidence: astObservationEvidence({
              sha256: file.sha256,
              path: file.path,
              range: literal.location,
              operation: "scan-shipped-material",
              coverage:
                javascript === null
                  ? partialApplicationCoverage([], null)
                  : javascriptAnalysisCoverage(javascript),
              limitations: [
                "This may be a checksum, fixture or public identifier. It is not classified as a secret; the original value is not copied into this scan.",
              ],
            }),
          },
        ],
      });
      yield;
    }
  }
  context.accumulator.addNode({
    kind: "artifact",
    identity: artifactLocalIdentity(
      context.snapshot.manifest.root_sha256,
      "shipped-material",
      "scan-summary",
    ),
    observations: [
      {
        label: "Shipped-material scan scope",
        properties: {
          candidate_kind: "scan-summary",
          candidates,
          javascript_files_examined: examined,
          unavailable_files: unavailable,
          literal_candidates_not_projected: unprojected,
          paths_scope: context.fileSet.paths_scope,
          rules: ["key-certificate-extension", "hex-literal-32-40-64-128"],
          content_claim: "candidates-only",
        },
        evidence: artifactObservationEvidence({
          sha256: context.snapshot.manifest.root_sha256,
          path: "artifact-root",
          operation: "scan-shipped-material",
          coverage:
            unavailable + unprojected === 0
              ? completeApplicationCoverage()
              : partialApplicationCoverage([], null),
          limitations: [
            "Only inventory filename extensions and admitted UTF-8 JavaScript literals were examined. Other binary blobs, formats and secrets may be present. Unavailable workers and result-budget omissions do not establish absence.",
          ],
        }),
      },
    ],
  });
}
