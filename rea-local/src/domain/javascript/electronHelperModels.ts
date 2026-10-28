import * as t from "@babel/types";
import { semanticStaticPropertyName } from "./javascriptAstValues.js";
import { range } from "./javascriptStaticAnalysisHelpers.js";
import { traverseJavaScriptAstSteps } from "./javascriptSemanticTraversal.js";
import type { ParsedJavaScriptSource } from "./javascriptSourceParser.js";
import type { JavaScriptLexicalBindingIndex } from "./javascriptSemanticAnalysis.js";
import type {
  ElectronContextBridgeFinding,
  ElectronIpcFinding,
} from "./electronStaticAnalysisTypes.js";
import type { JavaScriptStaticAnalysis } from "./javascriptStaticAnalysisTypes.js";

export interface ElectronHelperParameter {
  readonly index: number;
  readonly path: readonly string[];
}
export interface ElectronHelperModel {
  readonly fn: t.Function;
  readonly bindingId: string | null;
  readonly namespace: ElectronHelperParameter;
  readonly bridge: ElectronContextBridgeFinding;
  readonly api: ElectronHelperParameter | null;
  readonly rules: readonly {
    readonly parameter: ElectronHelperParameter;
    readonly values: boolean;
    readonly finding: ElectronIpcFinding;
  }[];
}
const locationKey = (node: t.Node) => JSON.stringify(range(node));

/** Literal argument positions only; unknown computed/rest projections are not admitted. */
export const electronHelperParameters = (
  fn: t.Function,
  bindings: JavaScriptLexicalBindingIndex,
): ReadonlyMap<string, ElectronHelperParameter> => {
  const result = new Map<string, ElectronHelperParameter>();
  const pending: { node: t.Node; index: number; path: string[] }[] =
    fn.params.map((node, index) => ({ node, index, path: [] }));
  while (pending.length > 0) {
    const entry = pending.pop();
    if (entry === undefined) break;
    const { node, index, path } = entry;
    if (t.isIdentifier(node)) {
      const binding = bindings.resolve(node);
      if (binding !== undefined && binding.definitions.length === 1)
        result.set(binding.bindingId, { index, path });
    } else if (t.isAssignmentPattern(node))
      pending.push({ node: node.left, index, path });
    else if (t.isObjectPattern(node))
      for (const property of node.properties) {
        if (!t.isObjectProperty(property)) continue;
        const name = semanticStaticPropertyName(
          property.key,
          property.computed,
        );
        if (name !== "")
          pending.push({ node: property.value, index, path: [...path, name] });
      }
  }
  return result;
};

/** Model imported lodash mapValues and direct parameter flow into observed Electron calls. */
export function* collectElectronHelperModelsSteps(
  ast: ParsedJavaScriptSource,
  bindings: JavaScriptLexicalBindingIndex,
  facts: JavaScriptStaticAnalysis,
): Generator<void, readonly ElectronHelperModel[]> {
  const bridges = new Map(
    facts.electron.context_bridge_apis.map((finding) => [
      JSON.stringify(finding.location),
      finding,
    ]),
  );
  const models: ElectronHelperModel[] = [];
  yield* traverseJavaScriptAstSteps(ast, {
    enter: (node, _parent, ancestors) => {
      if (!t.isCallExpression(node)) return;
      const bridge = bridges.get(locationKey(node));
      const namespace = node.arguments[bridge?.world === "isolated" ? 1 : 0];
      if (bridge === undefined || !t.isIdentifier(namespace)) return;
      const namespaceBinding = bindings.resolve(namespace);
      if (namespaceBinding === undefined) return;
      for (const fn of ancestors()
        .filter((ancestor): ancestor is t.Function => t.isFunction(ancestor))
        .toReversed()) {
        const parameters = electronHelperParameters(fn, bindings);
        const parameter = parameters.get(namespaceBinding.bindingId);
        if (parameter === undefined) continue;
        const api = node.arguments[bridge.world === "isolated" ? 2 : 1];
        const apiBinding = t.isIdentifier(api)
          ? bindings.resolve(api)
          : undefined;
        const lineage = ancestors();
        const owner = lineage[lineage.indexOf(fn) - 1];
        const id =
          t.isFunctionDeclaration(fn) && fn.id !== null
            ? fn.id
            : t.isVariableDeclarator(owner) && t.isIdentifier(owner.id)
              ? owner.id
              : undefined;
        const binding = id === undefined ? undefined : bindings.resolve(id);
        if (
          id !== undefined &&
          (binding?.definitions.length !== 1 ||
            !binding.initializers.some(
              ({ node }) =>
                node === fn && bindings.initializerIsUnconditional(node),
            ))
        )
          continue;
        models.push({
          fn,
          bindingId: binding?.bindingId ?? null,
          namespace: parameter,
          bridge,
          api:
            apiBinding === undefined
              ? null
              : (parameters.get(apiBinding.bindingId) ?? null),
          rules: [],
        });
        break;
      }
    },
  });
  for (const model of models) {
    const parameters = electronHelperParameters(model.fn, bindings);
    const valueParameters = new Map<string, ElectronHelperParameter>();
    yield* traverseJavaScriptAstSteps(model.fn.body, {
      enter: (node) => {
        if (!t.isCallExpression(node) || !t.isIdentifier(node.callee)) return;
        const origin = bindings.origin(node.callee);
        if (
          origin?.specifier !== "lodash/mapValues" ||
          !["default", "*"].includes(origin.importedPath[0] ?? "*")
        )
          return;
        const [object, callback] = node.arguments;
        if (
          !t.isIdentifier(object) ||
          !t.isFunction(callback) ||
          !t.isIdentifier(callback.params[0])
        )
          return;
        const input = bindings.resolve(object);
        const output = bindings.resolve(callback.params[0]);
        const parameter =
          input === undefined ? undefined : parameters.get(input.bindingId);
        if (
          parameter !== undefined &&
          output !== undefined &&
          output.definitions.length === 1
        )
          valueParameters.set(output.bindingId, parameter);
      },
    });
    const rules: ElectronHelperModel["rules"][number][] = [];
    const ipc = new Map(
      facts.electron.ipc.map((finding) => [
        JSON.stringify(finding.location),
        finding,
      ]),
    );
    yield* traverseJavaScriptAstSteps(model.fn.body, {
      enter: (node) => {
        if (!t.isCallExpression(node) || !t.isIdentifier(node.arguments[0]))
          return;
        const finding = ipc.get(locationKey(node));
        const binding = bindings.resolve(node.arguments[0]);
        if (
          finding === undefined ||
          binding === undefined ||
          binding.definitions.length !== 1
        )
          return;
        const direct = parameters.get(binding.bindingId);
        const mapped = valueParameters.get(binding.bindingId);
        if (direct !== undefined || mapped !== undefined)
          rules.push({
            parameter: direct ?? mapped!,
            values: mapped !== undefined,
            finding,
          });
      },
    });
    models[models.indexOf(model)] = { ...model, rules };
  }
  return models;
}
