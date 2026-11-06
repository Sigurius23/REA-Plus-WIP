import * as t from "@babel/types";

import { unwrapJavaScriptExpression } from "./javascriptAstValues.js";
import type {
  JavaScriptSemanticCallable,
  JavaScriptSemanticListenerTarget,
} from "./javascriptSemanticIr.js";
import { semanticCallableIdForNode } from "./javascriptSemanticProjection.js";
import {
  resolveSemanticBindingState,
  type JavaScriptSemanticAnalysisState,
} from "./javascriptSemanticState.js";

/** Resolve a callback's unchanged lexical identity without implying execution. */
export const createSemanticEventHandlerResolver = (
  state: JavaScriptSemanticAnalysisState,
  callables: readonly JavaScriptSemanticCallable[],
): ((node: t.Node | undefined) => JavaScriptSemanticListenerTarget) => {
  const callableIds = new Set(
    callables
      .filter(({ kind }) => kind !== "class")
      .map(({ callableId }) => callableId),
  );
  return (input) => {
    let current = input;
    const seen = new Set<string>();
    while (current !== undefined) {
      const node = unwrapJavaScriptExpression(current).node;
      if (t.isFunction(node)) {
        const callableId = semanticCallableIdForNode(node);
        if (callableId !== null && callableIds.has(callableId))
          return { callableId, reason: null };
      }
      if (!t.isIdentifier(node))
        return unresolved(
          `Callback ${node.type} is not an exact local function or lexical alias.`,
        );
      const binding = resolveSemanticBindingState(state, node, node.name);
      if (binding === undefined)
        return unresolved(
          `Callback ${node.name} has no resolved local binding.`,
        );
      if (seen.has(binding.bindingId))
        return unresolved(`Callback alias cycle at ${binding.name}.`);
      seen.add(binding.bindingId);
      const initializer = binding.initializers[0];
      if (
        binding.definitions.length !== 1 ||
        !["variable", "function"].includes(binding.kind) ||
        binding.initializers.length !== 1 ||
        initializer === undefined ||
        initializer.projection.length > 0 ||
        state.conditionalInitializers.has(initializer.node)
      )
        return unresolved(
          `Callback ${binding.name} has reassigned, conditional, incoming or projected identity.`,
        );
      current = initializer.node;
    }
    return unresolved(
      "The registration has no positional callback expression.",
    );
  };
};

const unresolved = (reason: string): JavaScriptSemanticListenerTarget => ({
  callableId: null,
  reason,
});
