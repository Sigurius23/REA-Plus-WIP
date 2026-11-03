import {
  defaultTreeAdapter,
  parse,
  type DefaultTreeAdapterTypes,
} from "parse5";
import type { JavaScriptSourceRange } from "./javascriptStaticAnalysisTypes.js";

interface HtmlScriptReference {
  readonly scriptPath: string;
  readonly startOffset: number;
  readonly endOffset: number;
}

/** Exact raw inline body range; offsets count UTF-16 code units, not bytes. */
export interface HtmlInlineScript {
  readonly scriptKind: "classic" | "module";
  readonly startOffset: number;
  readonly endOffset: number;
  readonly location: JavaScriptSourceRange;
  readonly terminated: boolean;
}

const JAVASCRIPT_MIME_ESSENCES = new Set([
  "application/ecmascript",
  "application/javascript",
  "application/x-ecmascript",
  "application/x-javascript",
  "text/ecmascript",
  "text/javascript",
  "text/javascript1.0",
  "text/javascript1.1",
  "text/javascript1.2",
  "text/javascript1.3",
  "text/javascript1.4",
  "text/javascript1.5",
  "text/jscript",
  "text/livescript",
  "text/x-ecmascript",
  "text/x-javascript",
]);
const asciiLower = (value: string): string =>
  value.replace(/[A-Z]/gu, (letter) => letter.toLowerCase());
const stripAsciiWhitespace = (value: string): string =>
  value.replace(/^[\t\n\f\r ]+|[\t\n\f\r ]+$/gu, "");

/** HTML's type-string selection; MIME parameters and data blocks stay inert. */
const inlineScriptKind = (
  node: DefaultTreeAdapterTypes.Element,
): HtmlInlineScript["scriptKind"] | null => {
  const type = node.attrs.find(({ name }) => name === "type");
  const language = node.attrs.find(({ name }) => name === "language");
  const value =
    type?.value ??
    (language === undefined || language.value === ""
      ? "text/javascript"
      : `text/${language.value}`);
  if (
    type?.value === "" ||
    JAVASCRIPT_MIME_ESSENCES.has(asciiLower(value)) ||
    (type !== undefined &&
      JAVASCRIPT_MIME_ESSENCES.has(asciiLower(stripAsciiWhitespace(value))))
  )
    return "classic";
  return asciiLower(value) === "module" ? "module" : null;
};

/** Extract inert HTML script references and the first document base href. */
export const htmlArtifactReferences = (
  text: string,
  maxInlineScripts = Number.MAX_SAFE_INTEGER,
): {
  readonly baseHref: string | null;
  readonly scripts: readonly HtmlScriptReference[];
  readonly inlineScripts: readonly HtmlInlineScript[];
  readonly inlineScriptCount: number;
  readonly omittedInlineScripts: number;
} => {
  const pending: DefaultTreeAdapterTypes.Node[] = [
    parse(text, { sourceCodeLocationInfo: true }),
  ];
  const scripts: HtmlScriptReference[] = [];
  const inlineScripts: HtmlInlineScript[] = [];
  let inlineScriptCount = 0;
  let baseHref: string | null = null;
  while (pending.length > 0) {
    const node = pending.pop();
    if (node === undefined) continue;
    if (
      defaultTreeAdapter.isElementNode(node) &&
      node.namespaceURI === "http://www.w3.org/1999/xhtml"
    ) {
      if (node.tagName === "base" && baseHref === null) {
        const href = node.attrs.find(({ name }) => name === "href");
        if (href !== undefined) baseHref = href.value;
      }
      if (node.tagName === "script") {
        const src = node.attrs.find(({ name }) => name === "src");
        const location = node.sourceCodeLocation?.startTag;
        if (src !== undefined && src.value !== "" && location !== undefined) {
          scripts.push({
            scriptPath: src.value,
            startOffset: location.startOffset,
            endOffset: location.endOffset,
          });
        }
        const kind = inlineScriptKind(node);
        const sourceLocation = node.sourceCodeLocation;
        if (
          src === undefined &&
          kind !== null &&
          location !== undefined &&
          sourceLocation !== null &&
          sourceLocation !== undefined
        ) {
          const end = sourceLocation.endTag;
          const endOffset = end?.startOffset ?? text.length;
          if (endOffset > location.endOffset) {
            inlineScriptCount += 1;
            if (inlineScripts.length < maxInlineScripts) {
              const tail = end === undefined ? text.split(/\r\n|\r|\n/u) : null;
              inlineScripts.push({
                scriptKind: kind,
                startOffset: location.endOffset,
                endOffset,
                location: {
                  start: {
                    line: location.endLine,
                    column: location.endCol - 1,
                  },
                  end: {
                    line:
                      end?.startLine ?? tail?.length ?? sourceLocation.endLine,
                    column:
                      end === undefined
                        ? (tail?.at(-1)?.length ?? 0)
                        : end.startCol - 1,
                  },
                },
                terminated: end !== undefined,
              });
            }
          }
        }
      }
    }
    // Template content belongs to a separate inert document fragment. Only
    // traverse the actual document children, without recursion on deep input.
    if ("childNodes" in node) {
      for (const child of node.childNodes.toReversed()) pending.push(child);
    }
  }
  return {
    baseHref,
    scripts,
    inlineScripts,
    inlineScriptCount,
    omittedInlineScripts: inlineScriptCount - inlineScripts.length,
  };
};
