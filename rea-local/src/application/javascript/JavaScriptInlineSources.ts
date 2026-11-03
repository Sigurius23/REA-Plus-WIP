import { createHash } from "node:crypto";
import type {
  JavaScriptArtifactFile,
  JavaScriptArtifactFileSet,
} from "../../domain/javascript/javascriptArtifactFiles.js";
import { htmlArtifactReferences } from "../../domain/javascript/htmlArtifactReferences.js";
import { javaScriptInlineSourceUri } from "../../domain/javascript/javascriptInlineSourceIdentity.js";
import { JAVASCRIPT_ANALYSIS_RESOURCE_DEFAULTS } from "../../domain/javascript/javascriptAnalysisResourceControls.js";
import type {
  AnalyzedJavaScriptArtifactFile,
  JavaScriptHtmlScriptObservation,
} from "./JavaScriptArtifactAnalysisTypes.js";
import type { JavaScriptSourceRange } from "../../domain/javascript/javascriptStaticAnalysisTypes.js";

/** Inventoried files and their bounded derived bodies, prepared exactly once. */
export interface JavaScriptArtifactAnalysisSources {
  readonly fileSet: JavaScriptArtifactFileSet;
  readonly sources: readonly JavaScriptArtifactFile[];
  readonly html: ReadonlyMap<
    string,
    NonNullable<AnalyzedJavaScriptArtifactFile["html"]>
  >;
  readonly htmlScripts: readonly JavaScriptHtmlScriptObservation[];
}

export type JavaScriptArtifactAnalysisInput =
  | JavaScriptArtifactFileSet
  | JavaScriptArtifactAnalysisSources;

/** Retain physical inventory separately; no derived body is a filesystem entry. */
export function* prepareJavaScriptArtifactSourcesSteps(
  fileSet: JavaScriptArtifactFileSet,
  maxInlineScripts: number = JAVASCRIPT_ANALYSIS_RESOURCE_DEFAULTS.inlineScripts,
): Generator<void, JavaScriptArtifactAnalysisSources> {
  const sources: JavaScriptArtifactFile[] = [];
  const html = new Map<
    string,
    NonNullable<AnalyzedJavaScriptArtifactFile["html"]>
  >();
  const htmlScripts: JavaScriptHtmlScriptObservation[] = [];
  let remaining = maxInlineScripts;
  for (const file of fileSet.files) {
    sources.push(file);
    yield;
    if (file.kind !== "html" || !file.text.included) continue;
    if (file.inventory_artifact_id === null)
      throw new TypeError(
        "An inline source requires an inventoried HTML document",
      );
    const text = file.text.value;
    const refs = htmlArtifactReferences(text, remaining);
    remaining -= refs.inlineScripts.length;
    htmlScripts.push(
      ...refs.scripts.map((script) => ({
        html_path: file.path,
        script_path: script.scriptPath,
        base_href: refs.baseHref,
        location: rangeForOffsets(text, script.startOffset, script.endOffset),
      })),
    );
    const inline = [];
    for (const script of refs.inlineScripts) {
      yield;
      const body = text.slice(script.startOffset, script.endOffset);
      const bodySha = createHash("sha256").update(body).digest("hex");
      // Double slash is not a canonical artifact path. This is an explicit
      // logical URI, never an invented member in the physical inventory.
      const logicalSource = script.terminated
        ? javaScriptInlineSourceUri({
            html_path: file.path,
            start_offset: script.startOffset,
            end_offset: script.endOffset,
            script_kind: script.scriptKind,
          })
        : null;
      inline.push({
        ...script,
        logical_source: logicalSource,
        body_sha256: bodySha,
      });
      if (logicalSource === null) continue;
      sources.push({
        path: logicalSource,
        sha256: bodySha,
        bytes: Buffer.byteLength(body),
        container_sha256: file.container_sha256,
        inventory_artifact_id: null,
        kind: "javascript",
        unpacked: file.unpacked,
        text: { included: true, value: body },
        inline_source: {
          html_path: file.path,
          html_sha256: file.sha256,
          html_inventory_artifact_id: file.inventory_artifact_id,
          script_kind: script.scriptKind,
          base_href: refs.baseHref,
          start_offset: script.startOffset,
          end_offset: script.endOffset,
          offset_encoding: "utf16-code-units",
          source_range: script.location,
        },
      });
    }
    html.set(file.path, {
      base_href: refs.baseHref,
      inline_scripts: inline,
      inline_script_count: refs.inlineScriptCount,
      omitted_inline_scripts: refs.omittedInlineScripts,
      inline_script_budget: maxInlineScripts,
    });
  }
  return { fileSet, sources, html, htmlScripts };
}

/** Synchronous callers share the same representation and admission owner. */
export const javaScriptArtifactAnalysisSources = (
  input: JavaScriptArtifactAnalysisInput,
): JavaScriptArtifactAnalysisSources => {
  if ("sources" in input) return input;
  const steps = prepareJavaScriptArtifactSourcesSteps(input);
  for (;;) {
    const next = steps.next();
    if (next.done) return next.value;
  }
};

const rangeForOffsets = (
  text: string,
  start: number,
  end: number,
): JavaScriptSourceRange => {
  const point = (offset: number) => {
    const lines = text.slice(0, offset).split(/\r\n|\r|\n/u);
    return { line: lines.length, column: lines.at(-1)?.length ?? 0 };
  };
  return { start: point(start), end: point(end) };
};
