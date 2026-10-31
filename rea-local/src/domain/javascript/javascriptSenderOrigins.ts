import * as t from "@babel/types";

import {
  semanticStaticPropertyKey,
  unwrapJavaScriptExpression,
} from "./javascriptAstValues.js";
import {
  collectElectronMemberWritesSteps,
  electronMemberPath,
} from "./javascriptElectronMemberWrites.js";
import { SemanticPropertyPathCoverage } from "./javascriptSemanticPropertyPaths.js";
import {
  isUnshadowedGlobal,
  resolveSemanticBindingState,
  semanticResolutionBlocked,
  type JavaScriptSemanticAnalysisState,
  type JavaScriptSemanticBindingState,
} from "./javascriptSemanticState.js";
import { traverseJavaScriptAstSteps } from "./javascriptSemanticTraversal.js";

/** Exact static selection from a transport callback's event or sender parameter. */
export interface JavaScriptSenderOrigin {
  readonly transport: "electron" | "browser-extension";
  readonly projection: readonly string[];
}

interface SenderReference extends JavaScriptSenderOrigin {
  readonly sourceBindingId: string;
}

interface ProjectedReference {
  readonly projection: readonly string[];
}

interface AliasStep {
  readonly projection: readonly string[];
  readonly bindingId?: string;
}

/** Follow exact immutable aliases, without evaluating objects or helper calls. */
class ProjectedAliases<Value extends ProjectedReference> {
  readonly #bindings = new Map<string, Value | null>();

  constructor(
    readonly state: JavaScriptSemanticAnalysisState,
    readonly root: (
      node: t.Identifier,
      binding: JavaScriptSemanticBindingState | undefined,
    ) => Value | undefined,
  ) {}

  resolve(input: t.Node): Value | undefined {
    let node = input;
    let reference: Value | undefined;
    const steps: AliasStep[] = [];
    const visited = new Set<string>();
    while (true) {
      node = unwrapJavaScriptExpression(node).node;
      if (t.isMemberExpression(node) || t.isOptionalMemberExpression(node)) {
        const key = semanticStaticPropertyKey(node.property, node.computed);
        if (key === null) break;
        steps.push({ projection: [key] });
        node = node.object;
        continue;
      }
      if (!t.isIdentifier(node)) break;
      if (semanticResolutionBlocked(this.state, node, node.name)) break;
      const binding = resolveSemanticBindingState(this.state, node, node.name);
      if (binding === undefined) {
        reference = this.root(node, undefined);
        break;
      }
      const cached = this.#bindings.get(binding.bindingId);
      if (cached !== undefined) {
        reference = cached ?? undefined;
        break;
      }
      if (visited.has(binding.bindingId) || !bindingIsStable(binding)) break;
      visited.add(binding.bindingId);
      reference = this.root(node, binding);
      if (reference !== undefined) break;
      const initializer = exactAliasInitializer(binding, this.state);
      if (initializer === undefined) break;
      steps.push({
        bindingId: binding.bindingId,
        projection: initializer.projection,
      });
      node = initializer.node;
    }
    for (const step of steps.toReversed()) {
      if (reference !== undefined)
        reference = {
          ...reference,
          projection: [...reference.projection, ...step.projection],
        };
      if (step.bindingId !== undefined)
        this.#bindings.set(step.bindingId, reference ?? null);
    }
    return reference;
  }
}

const bindingIsStable = (binding: JavaScriptSemanticBindingState): boolean =>
  !binding.definitions.some(({ kind }) => kind === "assignment") &&
  binding.referenceInitializers.length === 0;

const exactAliasInitializer = (
  binding: JavaScriptSemanticBindingState,
  state: JavaScriptSemanticAnalysisState,
):
  | { readonly node: t.Node; readonly projection: readonly string[] }
  | undefined => {
  const [initializer] = binding.initializers;
  if (
    initializer === undefined ||
    binding.initializers.length !== 1 ||
    state.conditionalInitializers.has(initializer.node) ||
    !initializer.projection.every(
      (key): key is string => typeof key === "string",
    )
  )
    return undefined;
  return { node: initializer.node, projection: initializer.projection };
};

const browserApiAliases = (
  state: JavaScriptSemanticAnalysisState,
): ProjectedAliases<ProjectedReference> =>
  new ProjectedAliases(state, (node, binding) => {
    if (binding !== undefined) return undefined;
    if (node.name === "chrome" || node.name === "browser")
      return { projection: [node.name] };
    if (["globalThis", "window", "self"].includes(node.name))
      return { projection: [] };
    return undefined;
  });

/** Only declared registration syntax establishes an event-parameter origin. */
const electronRegistration = (
  node: t.CallExpression | t.OptionalCallExpression,
  bindings: ReadonlyMap<number, readonly string[]>,
): boolean => {
  const { root, members } = electronMemberPath(node.callee);
  const exported = bindings.get(root.start ?? -1);
  if (exported === undefined) return false;
  const path = [...exported, ...members];
  if (path.length !== 2) return false;
  const [api, method] = path;
  if (api === "ipcMain")
    return ["on", "once", "addListener", "handle", "handleOnce"].includes(
      method ?? "",
    );
  return (
    api === "ipcRenderer" &&
    ["on", "once", "addListener"].includes(method ?? "")
  );
};

const browserRegistrationPath = (
  reference: ProjectedReference | undefined,
): readonly string[] | undefined => {
  const path = reference?.projection;
  return path !== undefined &&
    path.length === 4 &&
    (path[0] === "chrome" || path[0] === "browser") &&
    path[1] === "runtime" &&
    path[2] === "onMessage" &&
    path[3] === "addListener"
    ? path
    : undefined;
};

const addInlineParameterOrigin = (
  registration: RegistrationCandidate,
  state: JavaScriptSemanticAnalysisState,
  sources: Map<string, SenderReference>,
): void => {
  const { callback, index, transport } = registration;
  if (
    callback === undefined ||
    (!t.isFunctionExpression(callback) &&
      !t.isArrowFunctionExpression(callback))
  )
    return;
  const parameter = callback.params[index];
  if (!t.isIdentifier(parameter)) return;
  const binding = resolveSemanticBindingState(state, parameter, parameter.name);
  if (binding === undefined || !bindingIsStable(binding)) return;
  sources.set(binding.bindingId, {
    transport,
    sourceBindingId: binding.bindingId,
    projection: [],
  });
};

const reflectiveWriteTarget = (
  node: t.Node,
  state: JavaScriptSemanticAnalysisState,
): t.Node | undefined => {
  if (!t.isCallExpression(node) && !t.isOptionalCallExpression(node))
    return undefined;
  const { root, members } = electronMemberPath(node.callee);
  if (members.length !== 1 || !t.isIdentifier(root)) return undefined;
  const method = members[0];
  const objectWrite =
    isUnshadowedGlobal(root, state, "Object") &&
    ["assign", "defineProperty", "defineProperties", "setPrototypeOf"].includes(
      method ?? "",
    );
  const reflectWrite =
    isUnshadowedGlobal(root, state, "Reflect") &&
    ["set", "defineProperty", "deleteProperty", "setPrototypeOf"].includes(
      method ?? "",
    );
  const target = node.arguments[0];
  return (objectWrite || reflectWrite) && t.isExpression(target)
    ? target
    : undefined;
};

interface RegistrationCandidate {
  readonly callback: t.Node | undefined;
  readonly index: number;
  readonly transport: JavaScriptSenderOrigin["transport"];
  readonly browserPath?: readonly string[];
}

function* collectParameterOriginsSteps(
  program: t.Program,
  state: JavaScriptSemanticAnalysisState,
  electronBindings: ReadonlyMap<number, readonly string[]>,
): Generator<void, ReadonlyMap<string, SenderReference>> {
  const browserAliases = browserApiAliases(state);
  const writes: SemanticPropertyPathCoverage =
    yield* collectElectronMemberWritesSteps(
      program,
      (root) => browserAliases.resolve(root)?.projection,
    );
  const registrations: RegistrationCandidate[] = [];
  yield* traverseJavaScriptAstSteps(program, {
    enter: (node) => {
      const reflective = reflectiveWriteTarget(node, state);
      const reflectedPath =
        reflective === undefined
          ? undefined
          : browserAliases.resolve(reflective)?.projection;
      if (reflectedPath !== undefined) writes.retain(reflectedPath);
      const target = t.isAssignmentExpression(node)
        ? node.left
        : t.isUpdateExpression(node)
          ? node.argument
          : undefined;
      if (target !== undefined)
        for (const identifier of Object.values(
          t.getBindingIdentifiers(target),
        )) {
          const path = browserAliases.resolve(identifier)?.projection;
          if (path !== undefined) writes.retain(path);
        }
      if (!t.isCallExpression(node) && !t.isOptionalCallExpression(node))
        return;
      if (electronRegistration(node, electronBindings)) {
        registrations.push({
          callback: node.arguments[1],
          index: 0,
          transport: "electron",
        });
        return;
      }
      const path = browserRegistrationPath(browserAliases.resolve(node.callee));
      if (path !== undefined)
        registrations.push({
          callback: node.arguments[0],
          index: 1,
          transport: "browser-extension",
          browserPath: path,
        });
    },
  });
  const sources = new Map<string, SenderReference>();
  for (const [index, registration] of registrations.entries()) {
    if (index % 64 === 0) yield;
    if (
      registration.browserPath !== undefined &&
      writes.covers(registration.browserPath)
    )
      continue;
    addInlineParameterOrigin(registration, state, sources);
  }
  return sources;
}

/** Recover callback-owned sender roots and exact local projections without executing callbacks. */
export function* classifyJavaScriptSenderOriginsSteps(
  program: t.Program,
  state: JavaScriptSemanticAnalysisState,
  electronBindings: ReadonlyMap<number, readonly string[]>,
): Generator<void, ReadonlyMap<number, JavaScriptSenderOrigin>> {
  const sources = yield* collectParameterOriginsSteps(
    program,
    state,
    electronBindings,
  );
  const aliases = new ProjectedAliases(state, (_node, binding) =>
    binding === undefined ? undefined : sources.get(binding.bindingId),
  );
  const mutatedSources = new Set<string>();
  yield* collectElectronMemberWritesSteps(program, (root) => {
    const reference = aliases.resolve(root);
    if (reference !== undefined) mutatedSources.add(reference.sourceBindingId);
    return undefined;
  });
  const candidates = new Map<number, SenderReference>();
  yield* traverseJavaScriptAstSteps(program, {
    enter: (node) => {
      const reflected = reflectiveWriteTarget(node, state);
      if (reflected !== undefined) {
        const reference = aliases.resolve(reflected);
        if (reference !== undefined)
          mutatedSources.add(reference.sourceBindingId);
      }
      if (!t.isIdentifier(node)) return;
      const reference = aliases.resolve(node);
      if (reference !== undefined) candidates.set(node.start ?? -1, reference);
    },
  });
  const origins = new Map<number, JavaScriptSenderOrigin>();
  let index = 0;
  for (const [offset, reference] of candidates) {
    if (index++ % 64 === 0) yield;
    if (!mutatedSources.has(reference.sourceBindingId))
      origins.set(offset, {
        transport: reference.transport,
        projection: reference.projection,
      });
  }
  return origins;
}
