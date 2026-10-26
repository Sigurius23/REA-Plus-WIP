import * as t from "@babel/types";
import { parse } from "@babel/parser";

import { semanticStaticPropertyName, unwrapJavaScriptExpression } from "./javascriptAstValues.js";

/**
 * One piece of a composed IPC channel expression: fixed literal text or a
 * member chain rooted in a module-bound name. The binding resolution against
 * module imports happens in the application layer; the splitter only reads
 * exact syntax and fails closed on anything dynamic.
 */
export type ElectronIpcChannelPart =
  | { readonly kind: "fixed-text"; readonly text: string }
  | { readonly kind: "module-binding"; readonly root: string; readonly members: readonly string[] };

/** Piece budget before one composition becomes unresolvable. */
const PIECE_LIMIT = 32;

interface MemberChain {
  readonly root: string;
  readonly members: readonly string[];
}

/** Collect static member names below a chain root without evaluating it. */
const memberChain = (node: t.Node): MemberChain | null => {
  const members: string[] = [];
  let current = unwrapJavaScriptExpression(node).node;
  for (;;) {
    if (t.isMemberExpression(current) || t.isOptionalMemberExpression(current)) {
      if (!t.isNode(current.object)) return null;
      // `semanticStaticPropertyName` returns "" for any dynamic key, so
      // computed or derived members fail closed here.
      const member = semanticStaticPropertyName(current.property, current.computed);
      if (member === "") return null;
      members.push(member);
      current = current.object;
      continue;
    }
    return t.isIdentifier(current)
      ? { root: current.name, members: members.toReversed() }
      : null;
  }
};

/** Flatten string-building syntax into ordered text and root pieces. */
type Piece =
  | { readonly kind: "fixed-text"; readonly text: string }
  | { readonly kind: "chain"; readonly chain: MemberChain };

const flattenOperand = (
  node: t.Node,
  budget: { count: number },
): readonly Piece[] | null => {
  const unwrapped = unwrapJavaScriptExpression(node).node;
  if (t.isTemplateLiteral(unwrapped)) {
    const pieces: Piece[] = [];
    for (const [index, quasi] of unwrapped.quasis.entries()) {
      // Empty quasis (leading/trailing interpolations) add nothing and are
      // dropped so composition keeps only meaningful pieces.
      const text = quasi.value.cooked ?? quasi.value.raw;
      if (text !== "") pieces.push({ kind: "fixed-text", text });
      const expression = unwrapped.expressions[index];
      if (expression === undefined) continue;
      if (budget.count + 1 > PIECE_LIMIT) return null;
      budget.count += 1;
      const subPieces = flattenOperand(expression, budget);
      if (subPieces === null) return null;
      pieces.push(...subPieces);
    }
    return pieces;
  }
  if (t.isBinaryExpression(unwrapped, { operator: "+" })) {
    if (budget.count + 2 > PIECE_LIMIT) return null;
    budget.count += 2;
    const left = flattenOperand(unwrapped.left, budget);
    const right = flattenOperand(unwrapped.right, budget);
    return left === null || right === null ? null : [...left, ...right];
  }
  if (t.isStringLiteral(unwrapped))
    return [{ kind: "fixed-text", text: unwrapped.value }];
  const chain = memberChain(unwrapped);
  return chain === null ? null : [{ kind: "chain", chain }];
};

/**
 * Split one statically recorded channel expression into its fixed text and
 * module-bound root pieces, in source order. Trees, function calls, computed
 * members without a literal key, and any other dynamic syntax fail closed:
 * the returned null leaves the channel honestly dynamic.
 */
export const electronIpcChannelParts = (
  expression: string,
): readonly ElectronIpcChannelPart[] | null => {
  let file: ReturnType<typeof parse>;
  try {
    file = parse(`(${expression})`, { errorRecovery: true });
  } catch {
    return null;
  }
  const program = file.program;
  if (program === undefined || program === null) return null;
  const statement = program.body[0];
  // Parser recovery can leave a wrong tree; a recovered split would claim a
  // channel the source does not state, so any parse error fails closed.
  if (
    statement === undefined ||
    !t.isExpressionStatement(statement) ||
    file.errors.length > 0
  )
    return null;
  const pieces = flattenOperand(statement.expression, { count: 0 });
  if (pieces === null || pieces.length === 0) return null;
  const parts: ElectronIpcChannelPart[] = [];
  for (const piece of pieces) {
    if (piece.kind === "fixed-text") {
      parts.push({ kind: "fixed-text", text: piece.text });
      continue;
    }
    parts.push({
      kind: "module-binding",
      root: piece.chain.root,
      members: piece.chain.members,
    });
  }
  return parts;
};
