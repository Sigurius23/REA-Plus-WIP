import * as t from "@babel/types";

import {
  semanticStaticPropertyKey,
  unwrapJavaScriptExpression,
} from "./javascriptAstValues.js";
import type { JavaScriptSemanticCallAnalysis } from "./javascriptSemanticCalls.js";
import type {
  JavaScriptSemanticCallable,
  JavaScriptSemanticCallResultFieldFlow,
  JavaScriptSemanticObjectOperation,
  JavaScriptSemanticReturnSite,
} from "./javascriptSemanticIr.js";
import {
  invalidateSemanticEscapedPath,
  invalidateSemanticMutationPaths,
} from "./javascriptSemanticMutationValues.js";
import { semanticContainer } from "./javascriptSemanticSlots.js";
import type { JavaScriptSemanticProperty } from "./javascriptSemanticValueTypes.js";
import {
  resolveSemanticBindingState,
  type JavaScriptSemanticAnalysisState,
} from "./javascriptSemanticState.js";
import { range, sourceRangesEqual } from "./javascriptStaticAnalysisHelpers.js";

/** Recover caller field dependencies only while lexical/mutation proof is available. */
export const collectSemanticCallResultFields = (
  state: JavaScriptSemanticAnalysisState,
  callables: readonly JavaScriptSemanticCallable[],
  calls: JavaScriptSemanticCallAnalysis,
  operations: readonly JavaScriptSemanticObjectOperation[],
  parserPartial: boolean,
): JavaScriptSemanticCallResultFieldFlow[] => {
  if (parserPartial) return [];
  const callableById = new Map(
    callables.map((value) => [value.callableId, value]),
  );
  const callById = new Map(
    calls.callSites.map((value) => [value.callSiteId, value]),
  );
  const requestedFields = new Map<string, Set<string>>();
  for (const operation of operations) {
    if (
      (operation.kind !== "read" && operation.kind !== "destructure") ||
      operation.objectBindingId === null ||
      operation.propertyPath?.length !== 1
    )
      continue;
    const name = operation.propertyPath[0];
    if (name === undefined) continue;
    const requested =
      requestedFields.get(operation.objectBindingId) ?? new Set<string>();
    requested.add(name);
    requestedFields.set(operation.objectBindingId, requested);
  }
  const returnShapes = new Map<
    string,
    {
      readonly slots: ReadonlyMap<string, JavaScriptSemanticProperty>;
      readonly fields: ReadonlySet<string>;
    }
  >();
  const results = new Map<
    string,
    {
      readonly call: JavaScriptSemanticCallAnalysis["callSites"][number];
      readonly site: JavaScriptSemanticReturnSite;
      readonly fields: ReadonlyMap<string, "complete" | "partial">;
    }
  >();
  for (const flow of calls.callResultFlows) {
    const call = callById.get(flow.callSiteId);
    const binding = state.bindingsById.get(flow.bindingId);
    const requested = requestedFields.get(flow.bindingId);
    const initializer = binding?.initializers[0];
    if (
      call?.kind !== "call" ||
      call.resolution !== "exact" ||
      binding === undefined ||
      requested === undefined ||
      binding.kind !== "variable" ||
      binding.definitions.length !== 1 ||
      binding.initializers.length !== 1 ||
      binding.referenceInitializers.length !== 0 ||
      initializer === undefined ||
      initializer.projection.length !== 0 ||
      state.conditionalInitializers.has(initializer.node)
    )
      continue;
    const expression = unwrapJavaScriptExpression(initializer.node).node;
    if (
      !t.isCallExpression(expression) ||
      !sourceRangesEqual(range(expression), call.location) ||
      !stableDirectCallee(expression.callee, state)
    )
      continue;
    const callableId = call.calleeCallableIds[0];
    const callable =
      callableId === undefined ? undefined : callableById.get(callableId);
    const node =
      callableId === undefined
        ? undefined
        : state.callableNodesById.get(callableId);
    const site = callable?.returnSites[0];
    if (
      callable === undefined ||
      callable.returnSites.length !== 1 ||
      callable.returnCoverage.status !== "complete" ||
      site === undefined ||
      node === undefined ||
      !directObjectReturn(node, site)
    )
      continue;
    // Apply the owning mutation rules once per result binding, before matching
    // reads. Unchanged slot values preserve identity through these projections.
    let retained = invalidateSemanticMutationPaths(
      site.value,
      binding.mutatedPaths,
    );
    for (const escape of binding.escapedPaths)
      retained = invalidateSemanticEscapedPath(retained, escape.path);
    let shape = returnShapes.get(site.returnSiteId);
    if (shape === undefined) {
      shape = {
        slots: new Map(
          semanticContainer(site.value)?.slots.map((slot) => [slot.name, slot]),
        ),
        fields: new Set(
          (site.fieldSources ?? []).flatMap((field) =>
            field.status === "complete" &&
            field.path.length === 1 &&
            field.path[0] !== undefined
              ? [field.path[0]]
              : [],
          ),
        ),
      };
      returnShapes.set(site.returnSiteId, shape);
    }
    const slots =
      retained === site.value
        ? shape.slots
        : new Map(
            semanticContainer(retained)
              ?.slots.filter((slot) => requested.has(slot.name))
              .map((slot) => [slot.name, slot]),
          );
    const fields = new Map<string, "complete" | "partial">();
    for (const name of requested) {
      // Return sources cover direct own fields; nested object expressions
      // remain unsupported rather than gaining invented deep dependencies.
      if (!shape.fields.has(name)) continue;
      const original = shape.slots.get(name);
      const fact = slots.get(name);
      if (
        original?.presence === "present" &&
        fact?.presence === "present" &&
        fact.value === original.value
      )
        fields.set(
          JSON.stringify([name]),
          fact.value.status === "literal" ? "complete" : "partial",
        );
    }
    results.set(binding.bindingId, { call, site, fields });
  }
  const output: JavaScriptSemanticCallResultFieldFlow[] = [];
  for (const operation of operations) {
    if (
      (operation.kind !== "read" && operation.kind !== "destructure") ||
      operation.resolution !== "complete" ||
      operation.objectBindingId === null ||
      operation.propertyPath === null ||
      operation.propertyPath.length === 0
    )
      continue;
    const result = results.get(operation.objectBindingId);
    if (
      result === undefined ||
      operation.ownerCallableId !== result.call.callerCallableId ||
      operation.location.start.line < result.call.location.end.line ||
      (operation.location.start.line === result.call.location.end.line &&
        operation.location.start.column < result.call.location.end.column)
    )
      continue;
    const resolution = result.fields.get(
      JSON.stringify(operation.propertyPath),
    );
    if (resolution === undefined) continue;
    output.push({
      callSiteId: result.call.callSiteId,
      returnSiteId: result.site.returnSiteId,
      objectOperationId: operation.objectOperationId,
      propertyPath: [...operation.propertyPath],
      resolution,
    });
  }
  return output;
};

/** Callable aliases and rewritten callees need separate lifetime proof. */
const stableDirectCallee = (
  node: t.Node,
  state: JavaScriptSemanticAnalysisState,
): boolean => {
  const expression = unwrapJavaScriptExpression(node).node;
  if (
    t.isFunctionExpression(expression) ||
    t.isArrowFunctionExpression(expression)
  )
    return true;
  if (!t.isIdentifier(expression)) return false;
  const binding = resolveSemanticBindingState(
    state,
    expression,
    expression.name,
  );
  const initializer = binding?.initializers[0];
  if (
    binding === undefined ||
    (binding.kind !== "variable" && binding.kind !== "function") ||
    binding.definitions.length !== 1 ||
    binding.initializers.length !== 1 ||
    initializer === undefined ||
    initializer.projection.length !== 0 ||
    state.conditionalInitializers.has(initializer.node)
  )
    return false;
  const target = unwrapJavaScriptExpression(initializer.node).node;
  return (
    t.isFunctionDeclaration(target) ||
    t.isFunctionExpression(target) ||
    t.isArrowFunctionExpression(target)
  );
};

const directObjectReturn = (
  node: t.Node,
  site: JavaScriptSemanticReturnSite,
): boolean => {
  if (
    !(
      t.isFunctionDeclaration(node) ||
      t.isFunctionExpression(node) ||
      t.isArrowFunctionExpression(node)
    ) ||
    node.async ||
    node.generator
  )
    return false;
  if (!t.isBlockStatement(node.body))
    return (
      directDataObject(node.body) &&
      sourceRangesEqual(range(node.body), site.location)
    );
  const returned = node.body.body.at(-1);
  return (
    t.isReturnStatement(returned) &&
    returned.argument !== null &&
    returned.argument !== undefined &&
    directDataObject(returned.argument) &&
    sourceRangesEqual(range(returned), site.location)
  );
};

/** Accessor reads can mutate sibling fields without an explicit call site. */
const directDataObject = (node: t.Node): boolean => {
  const object = unwrapJavaScriptExpression(node).node;
  return (
    t.isObjectExpression(object) &&
    object.properties.every(
      (property) =>
        !(
          t.isObjectMethod(property) &&
          (property.kind === "get" || property.kind === "set")
        ) &&
        !(
          t.isObjectProperty(property) &&
          !property.computed &&
          semanticStaticPropertyKey(property.key, false) === "__proto__"
        ),
    )
  );
};
