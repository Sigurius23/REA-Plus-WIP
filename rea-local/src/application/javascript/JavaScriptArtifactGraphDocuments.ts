import {
  addArtifactContainsEdge,
  addStaticInferenceEdge,
  artifactLocalIdentity,
  type JavaScriptArtifactGraphContext,
} from "./JavaScriptArtifactGraphContext.js";
import {
  artifactObservationEvidence,
  astObservationEvidence,
  staticInferenceEvidence,
} from "./JavaScriptArtifactGraphEvidence.js";
import { completeApplicationCoverage } from "../../domain/javascript/javascriptApplicationEvidenceSchemas.js";
import type { ApplicationNode } from "../../domain/javascript/javascriptApplicationGraphSchemas.js";
import type { JavaScriptArtifactFile } from "../../domain/javascript/javascriptArtifactFiles.js";
import { resolveArtifactPathByContext } from "./JavaScriptArtifactPathResolution.js";

/** Project static HTML documents and their script references without runtime-family claims. */
export const addJavaScriptHtmlRoles = (
  context: JavaScriptArtifactGraphContext,
): void => {
  const byHtml = new Map<string, typeof context.analysis.html_scripts>();
  const inlineByHtml = new Map<string, JavaScriptArtifactFile[]>();
  for (const script of context.analysis.html_scripts) {
    const existing = byHtml.get(script.html_path);
    byHtml.set(
      script.html_path,
      existing === undefined ? [script] : [...existing, script],
    );
  }
  for (const { file, html } of context.analysis.files) {
    if (file.inline_source !== undefined) {
      const existing = inlineByHtml.get(file.inline_source.html_path) ?? [];
      existing.push(file);
      inlineByHtml.set(file.inline_source.html_path, existing);
    }
    if (
      html !== undefined &&
      html.inline_script_count > 0 &&
      !byHtml.has(file.path)
    )
      byHtml.set(file.path, []);
  }
  for (const [htmlPath, scripts] of byHtml) {
    const html = context.filesByPath.get(htmlPath);
    if (html === undefined) continue;
    const document = addHtmlDocument(context, html);
    for (const file of inlineByHtml.get(htmlPath) ?? []) {
      const origin = file.inline_source;
      if (origin === undefined || origin.html_path !== htmlPath) continue;
      const derived = context.fileNodes.get(file.path);
      if (derived === undefined) continue;
      context.accumulator.addEdge({
        source_node_id: document.node_id,
        target_node_id: derived.node_id,
        relation: "contains",
        properties: {
          mechanism: "html-inline-script",
          logical_source: file.path,
          script_kind: origin.script_kind,
          body_sha256: file.sha256,
          runtime_execution: "unknown",
        },
        evidence: astObservationEvidence({
          sha256: html.sha256,
          path: html.path,
          range: origin.source_range,
          operation: "discover-html-inline-script",
          coverage: completeApplicationCoverage(),
          limitations: [
            "The source body is observed; browser activation and execution order remain unknown.",
          ],
        }),
      });
    }
    for (const script of scripts) {
      const resolution = resolveArtifactPathByContext({
        declaredPath: script.script_path,
        sourcePath: html.path,
        context: "html-reference",
        files: context.filesByPath,
        htmlBaseHref: script.base_href,
      });
      const resolvedPath = resolution.resolved_path;
      if (resolvedPath === null) {
        context.accumulator.addNode({
          kind: document.kind,
          identity: document.identity,
          observations: [
            {
              label: script.script_path,
              properties: {
                mechanism: "html-script-reference",
                script_path: script.script_path,
                base_href: script.base_href,
                ...resolution,
              },
              evidence: staticInferenceEvidence({
                sha256: html.sha256,
                path: html.path,
                range: script.location,
                operation: "resolve-html-script-reference",
                coverage: completeApplicationCoverage(),
                limitations: resolution.limitations,
              }),
            },
          ],
        });
        continue;
      }
      const resolved = context.fileNodes.get(resolvedPath);
      if (resolved === undefined) continue;
      addStaticInferenceEdge(context, {
        source: document,
        target: resolved,
        file: html,
        range: script.location,
        coverage: completeApplicationCoverage(),
        relation: "loads",
        properties: {
          script_path: script.script_path,
          base_href: script.base_href,
          resolution_context: resolution.resolution_context,
          resolved_path: resolvedPath,
          resolution_status: resolution.resolution_status,
          limitations: resolution.limitations,
        },
      });
    }
  }
};

/** Associate a static document with its exact inventoried HTML source. */
const addHtmlDocument = (
  context: JavaScriptArtifactGraphContext,
  html: JavaScriptArtifactFile,
): ApplicationNode => {
  const resolution = {
    declared_path: html.path,
    resolution_context: "html-reference" as const,
    resolved_path: html.path,
    resolution_status: "resolved" as const,
    limitations: [],
  };
  const document = context.accumulator.addNode({
    kind: "web-document",
    identity: artifactLocalIdentity(html.sha256, "html-document", html.path),
    observations: [
      {
        label: html.path,
        properties: {
          path: html.path,
          ...resolution,
          mechanism: "html-script-entrypoint",
        },
        evidence: artifactObservationEvidence({
          sha256: html.sha256,
          path: html.path,
          operation: "discover-html-document",
          coverage: completeApplicationCoverage(),
        }),
      },
    ],
  });
  addArtifactContainsEdge(context, {
    source: context.root,
    target: document,
    file: html,
    operation: "discover-html-document",
  });
  const asset =
    context.assetNodes.get(html.path) ?? context.fileNodes.get(html.path);
  if (asset !== undefined)
    context.accumulator.addEdge({
      source_node_id: document.node_id,
      target_node_id: asset.node_id,
      relation: "maps_to",
      properties: resolution,
      evidence: artifactObservationEvidence({
        sha256: html.sha256,
        path: html.path,
        operation: "associate-html-document-source",
        coverage: completeApplicationCoverage(),
      }),
    });
  return document;
};

/** Project original source names and optional content digests from approved maps. */
export const addJavaScriptSourceMapOriginals = (
  context: JavaScriptArtifactGraphContext,
): void => {
  for (const sourceMap of context.analysis.source_maps) {
    const mapFile = context.filesByPath.get(sourceMap.path);
    const mapNode = context.fileNodes.get(sourceMap.path);
    if (mapFile === undefined || mapNode === undefined) continue;
    const coverage = completeApplicationCoverage();
    for (const original of sourceMap.sources) {
      const node = context.accumulator.addNode({
        kind: "source-module",
        identity: {
          strategy: "source-map-original",
          stability: "source-map-exact",
          source_map_sha256: mapFile.sha256,
          original_source: original.reference.source_name,
          source_root: original.reference.source_root,
          source_sha256: original.content_sha256,
        },
        observations: [
          {
            label: original.reference.source_name || null,
            source_map_reference: original.reference,
            properties: {
              content_available: original.content !== null,
            },
            evidence: artifactObservationEvidence({
              sha256: mapFile.sha256,
              path: mapFile.path,
              operation: "parse-local-source-map",
              coverage,
              limitations:
                sourceMap.limitation === null ? [] : [sourceMap.limitation],
            }),
          },
        ],
      });
      context.accumulator.addEdge({
        source_node_id: mapNode.node_id,
        target_node_id: node.node_id,
        relation: "contains",
        properties: {
          original_source: original.reference.source_name,
          source_root: original.reference.source_root,
        },
        evidence: artifactObservationEvidence({
          sha256: mapFile.sha256,
          path: mapFile.path,
          operation: "parse-local-source-map",
          coverage,
          limitations:
            sourceMap.limitation === null ? [] : [sourceMap.limitation],
        }),
      });
    }
  }
};
