import * as t from "@babel/types";
import { createJavaScriptLexicalBindingIndexSteps } from "./javascriptSemanticAnalysis.js";
import { traverseJavaScriptAstSteps } from "./javascriptSemanticTraversal.js";
import {
  readExactJavaScriptLiteral,
  semanticStaticPropertyName,
} from "./javascriptAstValues.js";
import { moduleFactory } from "./javascriptStaticAnalysisHelpers.js";
import { registerStandaloneBundlerTable } from "./javascriptStaticAnalysisBundler.js";
import type { ParsedJavaScriptSource } from "./javascriptSourceParser.js";
import type { JavaScriptAnalysisAccumulator } from "./javascriptStaticAnalysisState.js";

/** Recover webpack-compatible IIFE tables from bound table[index](module,module.exports,require) dispatch. */
export function* inspectStandaloneBundlerTablesSteps(
  source: string,
  ast: ParsedJavaScriptSource,
  accumulator: JavaScriptAnalysisAccumulator,
): Generator<void, void> {
  if (!source.includes(".exports")) return;
  const bindings = yield* createJavaScriptLexicalBindingIndexSteps(ast);
  const tables = new Map<string, t.ObjectExpression>();
  const calls = new Map<string, { keys: Set<string>; unknown: number }>();
  yield* traverseJavaScriptAstSteps(ast, {
    enter: (node) => {
      if (t.isCallExpression(node) && t.isIdentifier(node.callee)) {
        const binding = bindings.resolve(node.callee);
        if (binding !== undefined) {
          const record = calls.get(binding.bindingId) ?? {
            keys: new Set<string>(),
            unknown: 0,
          };
          const argument = node.arguments[0];
          const value = t.isNode(argument)
            ? readExactJavaScriptLiteral(argument)
            : { found: false as const };
          if (
            value.found &&
            (typeof value.value === "number" || typeof value.value === "string")
          )
            record.keys.add(String(value.value));
          else record.unknown += 1;
          calls.set(binding.bindingId, record);
        }
      }
      if (
        !t.isVariableDeclarator(node) ||
        !t.isIdentifier(node.id) ||
        !t.isObjectExpression(node.init) ||
        node.init.properties.length === 0 ||
        !node.init.properties.every(
          (property) => moduleFactory(property) !== undefined,
        )
      )
        return;
      const binding = bindings.resolve(node.id);
      if (binding?.definitions.length === 1)
        tables.set(binding.bindingId, node.init);
    },
  });
  if (tables.size === 0) return;
  const admitted = new Set<string>();
  yield* traverseJavaScriptAstSteps(ast, {
    enter: (node, _parent, ancestors) => {
      if (
        !t.isCallExpression(node) ||
        !t.isMemberExpression(node.callee) ||
        !node.callee.computed ||
        !t.isIdentifier(node.callee.object) ||
        !t.isIdentifier(node.callee.property)
      )
        return;
      const tableBinding = bindings.resolve(node.callee.object);
      const table =
        tableBinding === undefined
          ? undefined
          : tables.get(tableBinding.bindingId);
      if (table === undefined) return;
      const [module, exports, require] = node.arguments;
      if (
        !t.isIdentifier(module) ||
        !t.isMemberExpression(exports) ||
        !t.isIdentifier(exports.object) ||
        semanticStaticPropertyName(exports.property, exports.computed) !==
          "exports" ||
        !t.isIdentifier(require)
      )
        return;
      if (
        bindings.resolve(module)?.bindingId !==
        bindings.resolve(exports.object)?.bindingId
      )
        return;
      const requireBinding = bindings.resolve(require);
      const fn = ancestors().findLast((ancestor): ancestor is t.Function =>
        t.isFunction(ancestor),
      );
      if (
        fn === undefined ||
        !t.isIdentifier(fn.params[0]) ||
        requireBinding?.definitions.length !== 1 ||
        !requireBinding.initializers.some(({ node }) => node === fn)
      )
        return;
      const indexBinding = bindings.resolve(node.callee.property);
      if (
        indexBinding === undefined ||
        indexBinding.definitions.length !== 1 ||
        indexBinding.bindingId !== bindings.resolve(fn.params[0])?.bindingId
      )
        return;
      const key = `${String(table.start)}:${requireBinding.bindingId}`;
      if (admitted.has(key)) return;
      admitted.add(key);
      const entries = calls.get(requireBinding.bindingId);
      registerStandaloneBundlerTable(
        source,
        table,
        `commonjs-bootstrap@${String(table.start)}`,
        require.name,
        accumulator,
        [...(entries?.keys ?? [])],
        entries?.unknown ?? 0,
      );
    },
  });
}
