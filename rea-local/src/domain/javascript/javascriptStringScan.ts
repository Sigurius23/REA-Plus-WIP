import type { Node } from "@babel/types";

import type { ParsedJavaScriptSource } from "./javascriptSourceParser.js";

/** Caller-selected search surface inside one parsed JavaScript source. */
export type JavaScriptStringSearchScope = "strings" | "identifiers";

/** One located string-constant or identifier match inside one source file. */
export interface JavaScriptStringMatch {
  /**
   * Byte offset where the literal or identifier starts in the file text, or
   * null when the parser did not report a location for the node.
   */
  readonly offset: number | null;
  /** The exact matched string value or identifier name. */
  readonly value: string;
  /** Syntax surface that produced the match. */
  readonly kind: "string" | "template-part" | "directive" | "identifier";
}

const SKIPPED_NODE_KEYS = new Set([
  "loc",
  "start",
  "end",
  "range",
  "extra",
  "leadingComments",
  "trailingComments",
  "innerComments",
]);

/**
 * Compile-time-only positions whose identifiers are not runtime value names.
 * String literals inside these positions still count as string constants.
 */
const TYPE_ONLY_KEYS = new Set([
  "typeAnnotation",
  "typeParameters",
  "returnType",
  "superTypeParameters",
  "implements",
]);

const isNode = (value: unknown): value is Node =>
  typeof value === "object" &&
  value !== null &&
  typeof (value as { type?: unknown }).type === "string";

/** Queue non-skipped child node branches in declaration order. */
const queueChildNodes = (
  pending: Node[],
  node: Node,
  scope: JavaScriptStringSearchScope,
): void => {
  const skipIdentifiers = scope === "identifiers" ? TYPE_ONLY_KEYS : null;
  for (const key of Object.keys(node)) {
    if (SKIPPED_NODE_KEYS.has(key) || skipIdentifiers?.has(key) === true)
      continue;
    const value: unknown = (node as unknown as Record<string, unknown>)[key];
    if (Array.isArray(value)) {
      for (const element of value) if (isNode(element)) pending.push(element);
    } else if (isNode(value)) pending.push(value);
  }
};

/**
 * Collect string-constant and identifier matches from one parsed source.
 *
 * Scope `strings` records string literals, directive literals and static
 * template quasis in source order. Scope `identifiers` records value
 * identifiers and excludes compile-time type positions. Nothing is executed;
 * only values the parser recovered from the shipped source bytes are recorded.
 */
export const collectJavaScriptStringMatches = (
  parsed: ParsedJavaScriptSource,
  search: {
    readonly query: string;
    readonly scope: JavaScriptStringSearchScope;
  },
): readonly JavaScriptStringMatch[] => {
  const collected: JavaScriptStringMatch[] = [];
  const identifiers = search.scope === "identifiers";
  let pending: Node[] = [parsed.program];
  while (pending.length > 0) {
    const batch = pending;
    pending = [];
    for (const node of batch) {
      const nodeType = node.type;
      if (nodeType === "StringLiteral" || nodeType === "DirectiveLiteral") {
        const value = (node as unknown as { value: string }).value;
        if (value.includes(search.query))
          collected.push({
            offset: typeof node.start === "number" ? node.start : null,
            value,
            kind: nodeType === "StringLiteral" ? "string" : "directive",
          });
      } else if (nodeType === "TemplateElement") {
        const cooked = (node as unknown as { value?: { cooked?: unknown } })
          .value?.cooked;
        if (typeof cooked === "string" && cooked.includes(search.query))
          collected.push({
            offset: typeof node.start === "number" ? node.start : null,
            value: cooked,
            kind: "template-part",
          });
      } else if (
        identifiers &&
        (nodeType === "Identifier" || nodeType === "JSXIdentifier")
      ) {
        const name = (node as unknown as { name: string }).name;
        if (name.includes(search.query))
          collected.push({
            offset: typeof node.start === "number" ? node.start : null,
            value: name,
            kind: "identifier",
          });
      }
      queueChildNodes(pending, node, search.scope);
    }
  }
  collected.sort((left, right) => (left.offset ?? -1) - (right.offset ?? -1));
  return collected;
};
