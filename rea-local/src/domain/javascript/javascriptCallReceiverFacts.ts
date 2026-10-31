import * as t from "@babel/types";

import {
  semanticMemberWriteTargets,
  semanticStaticPropertyKey,
  unwrapJavaScriptExpression,
} from "./javascriptAstValues.js";
import {
  resolveSemanticBindingState,
  semanticResolutionBlocked,
  type JavaScriptSemanticAnalysisState,
  type JavaScriptSemanticBindingState,
} from "./javascriptSemanticState.js";
import { semanticRequireOrigin } from "./javascriptSemanticRequireOrigin.js";
import { SemanticPropertyPathCoverage } from "./javascriptSemanticPropertyPaths.js";
import { traverseJavaScriptAstSteps } from "./javascriptSemanticTraversal.js";

/** Lexical API identity for a call; an absent fact leaves the receiver unknown. */
export type JavaScriptCallReceiverFact =
  | { readonly kind: "network"; readonly identity: string }
  | { readonly kind: "keyed-collection"; readonly identity: string }
  | {
      readonly kind: "extension-storage";
      readonly identity: string;
      readonly area: "local" | "session" | "sync" | "managed";
    }
  | {
      readonly kind:
        | "window"
        | "indexed-db"
        | "cache-storage"
        | "local"
        | "local-indexed-db"
        | "local-cache-storage";
    };

/** Calls sharing a source start still own separate receiver facts in one parsed AST. */
export type JavaScriptCallReceiverFacts = ReadonlyMap<
  t.Node,
  JavaScriptCallReceiverFact
>;

interface ApiReference {
  readonly owner: string;
  readonly path: readonly string[];
  readonly identity: string;
  readonly instanceKind?: "network" | "keyed-collection" | "url";
  readonly constructionOrigin?: ApiReference;
}

type ResolutionStep =
  | { readonly kind: "member"; readonly node: t.Node; readonly key: string }
  | {
      readonly kind: "binding";
      readonly node: t.Node;
      readonly bindingId: string;
      readonly projection: readonly string[];
    }
  | { readonly kind: "construction" | "factory"; readonly node: t.Node };

const KEYED_CONSTRUCTORS = new Set([
  "Map",
  "WeakMap",
  "Set",
  "WeakSet",
  "Headers",
  "FormData",
  "URLSearchParams",
]);
const NETWORK_GLOBALS = new Set([
  "fetch",
  "WebSocket",
  "EventSource",
  "XMLHttpRequest",
]);
const WINDOW_GLOBALS = new Set([
  "window",
  "self",
  "globalThis",
  "top",
  "parent",
  "opener",
  "frames",
]);
const NETWORK_MODULES = new Set(["axios", "http", "https"]);
const AXIOS_REQUEST_METHODS = new Set([
  "get",
  "post",
  "put",
  "patch",
  "delete",
  "request",
  "head",
  "options",
]);

const project = (
  reference: ApiReference,
  path: readonly string[],
): ApiReference => ({ ...reference, path: [...reference.path, ...path] });

const moduleReference = (
  specifier: string,
  importedPath: readonly string[],
): ApiReference | undefined => {
  const module = specifier.startsWith("node:") ? specifier.slice(5) : specifier;
  if (!NETWORK_MODULES.has(module)) return undefined;
  return {
    owner: `module:${module}`,
    path: importedPath[0] === "default" ? importedPath.slice(1) : importedPath,
    identity: module,
  };
};

const globalReference = (name: string): ApiReference | undefined => {
  if (WINDOW_GLOBALS.has(name))
    return { owner: "global", path: [], identity: name };
  if (
    name === "chrome" ||
    name === "browser" ||
    name === "document" ||
    name === "indexedDB" ||
    name === "caches" ||
    name === "Object" ||
    name === "Reflect" ||
    name === "URL" ||
    KEYED_CONSTRUCTORS.has(name) ||
    NETWORK_GLOBALS.has(name)
  )
    return { owner: "global", path: [name], identity: name };
  return undefined;
};

type ReferenceResolution =
  | { readonly reference: ApiReference | undefined }
  | { readonly next: t.Node; readonly step: ResolutionStep };

/** Resolve narrow immutable aliases iteratively; arbitrary values stay unknown. */
class CallReceiverReferences {
  readonly #nodes = new WeakMap<t.Node, ApiReference | null>();
  readonly #bindings = new Map<string, ApiReference | null>();

  constructor(readonly state: JavaScriptSemanticAnalysisState) {}

  resolve(input: t.Node): ApiReference | undefined {
    const steps: ResolutionStep[] = [];
    const visited = new Set<string>();
    let node = input;
    let reference: ApiReference | undefined;
    while (true) {
      node = unwrapJavaScriptExpression(node).node;
      const cached = this.#nodes.get(node);
      if (cached !== undefined) {
        reference = cached ?? undefined;
        break;
      }
      const resolution = this.#advance(node, visited);
      if ("reference" in resolution) {
        reference = resolution.reference;
        break;
      }
      steps.push(resolution.step);
      node = resolution.next;
    }
    this.#nodes.set(node, reference ?? null);
    for (const step of steps.toReversed()) {
      if (reference !== undefined) {
        if (step.kind === "member") reference = project(reference, [step.key]);
        else if (step.kind === "binding")
          reference = project(reference, step.projection);
        else reference = instanceReference(reference, step);
      }
      this.#nodes.set(step.node, reference ?? null);
      if (step.kind === "binding")
        this.#bindings.set(step.bindingId, reference ?? null);
    }
    return reference;
  }

  #advance(node: t.Node, visited: Set<string>): ReferenceResolution {
    if (t.isMemberExpression(node) || t.isOptionalMemberExpression(node)) {
      const key = semanticStaticPropertyKey(node.property, node.computed);
      return key === null
        ? { reference: undefined }
        : { next: node.object, step: { kind: "member", node, key } };
    }
    if (t.isIdentifier(node)) return this.#identifier(node, visited);
    const required = semanticRequireOrigin(node, this.state);
    if (required !== undefined)
      return {
        reference: moduleReference(
          required.origin.specifier,
          required.origin.importedPath,
        ),
      };
    if (
      t.isNewExpression(node) ||
      t.isCallExpression(node) ||
      t.isOptionalCallExpression(node)
    )
      return {
        next: node.callee,
        step: {
          kind: t.isNewExpression(node) ? "construction" : "factory",
          node,
        },
      };
    return { reference: undefined };
  }

  #identifier(node: t.Identifier, visited: Set<string>): ReferenceResolution {
    if (semanticResolutionBlocked(this.state, node, node.name))
      return { reference: undefined };
    const binding = resolveSemanticBindingState(this.state, node, node.name);
    if (binding === undefined) return { reference: globalReference(node.name) };
    const cached = this.#bindings.get(binding.bindingId);
    if (cached !== undefined) return { reference: cached ?? undefined };
    if (visited.has(binding.bindingId) || !stableBinding(binding))
      return { reference: undefined };
    visited.add(binding.bindingId);
    if (binding.directOrigins.length > 0) {
      const [origin] = binding.directOrigins;
      const reference =
        binding.directOrigins.length === 1 && origin !== undefined
          ? moduleReference(origin.specifier, origin.importedPath)
          : undefined;
      this.#bindings.set(binding.bindingId, reference ?? null);
      return { reference };
    }
    const [initializer] = binding.initializers;
    if (
      initializer === undefined ||
      binding.initializers.length !== 1 ||
      this.state.conditionalInitializers.has(initializer.node) ||
      !initializer.projection.every(
        (key): key is string => typeof key === "string",
      )
    )
      return { reference: undefined };
    return {
      next: initializer.node,
      step: {
        kind: "binding",
        node,
        bindingId: binding.bindingId,
        projection: initializer.projection,
      },
    };
  }
}

const stableBinding = (binding: JavaScriptSemanticBindingState): boolean =>
  !binding.definitions.some(({ kind }) => kind === "assignment") &&
  binding.referenceInitializers.length === 0;

const instanceReference = (
  constructor: ApiReference,
  step: Extract<ResolutionStep, { readonly kind: "construction" | "factory" }>,
): ApiReference | undefined => {
  const global =
    constructor.owner === "global" && constructor.path.length === 1;
  const name = constructor.path[0];
  const keyed = global && name !== undefined && KEYED_CONSTRUCTORS.has(name);
  const url = global && name === "URL" && step.kind === "construction";
  const network =
    (global && name === "XMLHttpRequest" && step.kind === "construction") ||
    (constructor.owner === "module:axios" &&
      constructor.path.length === 1 &&
      name === "create" &&
      step.kind === "factory");
  if ((!keyed || step.kind !== "construction") && !network && !url)
    return undefined;
  return {
    owner: `instance:${String(step.node.start)}:${String(step.node.end)}`,
    path: [],
    identity: constructor.identity,
    instanceKind: keyed ? "keyed-collection" : url ? "url" : "network",
    constructionOrigin: constructor,
  };
};

const referencePath = (reference: ApiReference): readonly string[] => [
  reference.owner,
  ...reference.path,
];

/** Index visible writes through known aliases; arbitrary call effects are not evaluated. */
function* collectReceiverWritesSteps(
  program: t.Program,
  references: CallReceiverReferences,
): Generator<void, SemanticPropertyPathCoverage> {
  const writes = new SemanticPropertyPathCoverage();
  yield* traverseJavaScriptAstSteps(program, {
    enter: (node) => {
      const target = t.isAssignmentExpression(node)
        ? node.left
        : t.isUpdateExpression(node)
          ? node.argument
          : t.isUnaryExpression(node, { operator: "delete" })
            ? node.argument
            : t.isForInStatement(node) || t.isForOfStatement(node)
              ? node.left
              : undefined;
      if (target !== undefined) {
        for (const member of semanticMemberWriteTargets(target)) {
          const receiver = references.resolve(member.object);
          if (receiver !== undefined)
            writes.retain([
              ...referencePath(receiver),
              semanticStaticPropertyKey(member.property, member.computed),
            ]);
        }
        for (const identifier of Object.values(
          t.getBindingIdentifiers(target),
        )) {
          const reference = references.resolve(identifier);
          if (reference !== undefined) writes.retain(referencePath(reference));
        }
      }
      if (!t.isCallExpression(node) && !t.isOptionalCallExpression(node))
        return;
      const callee = references.resolve(node.callee);
      if (
        callee?.owner !== "global" ||
        callee.path.length !== 2 ||
        !["Object", "Reflect"].includes(callee.path[0] ?? "")
      )
        return;
      const method = callee.path[1];
      if (
        method === undefined ||
        ![
          "assign",
          "defineProperty",
          "defineProperties",
          "setPrototypeOf",
          "set",
          "deleteProperty",
        ].includes(method)
      )
        return;
      const first = node.arguments[0];
      if (!t.isExpression(first)) return;
      const receiver = references.resolve(first);
      if (receiver === undefined) return;
      const key = node.arguments[1];
      writes.retain([
        ...referencePath(receiver),
        ...(["defineProperty", "set", "deleteProperty"].includes(method)
          ? [t.isNode(key) ? semanticStaticPropertyKey(key, true) : null]
          : []),
      ]);
    },
  });
  return writes;
}

const referenceWasWritten = (
  reference: ApiReference,
  writes: SemanticPropertyPathCoverage,
): boolean => {
  if (writes.covers(referencePath(reference))) return true;
  if (
    reference.instanceKind === "url" &&
    reference.path[0] === "searchParams" &&
    writes.covers([
      "global",
      "URLSearchParams",
      "prototype",
      ...reference.path.slice(1),
    ])
  )
    return true;
  const constructor = reference.constructionOrigin;
  return (
    constructor !== undefined &&
    (writes.covers(referencePath(constructor)) ||
      (constructor.owner === "global" &&
        writes.covers([
          ...referencePath(constructor),
          "prototype",
          ...reference.path,
        ])))
  );
};

const callReceiverFact = (
  reference: ApiReference,
): JavaScriptCallReceiverFact | undefined => {
  const member = reference.path[0];
  if (
    reference.instanceKind === "url" &&
    reference.path.length === 2 &&
    member === "searchParams"
  )
    return { kind: "keyed-collection", identity: "URLSearchParams" };
  if (
    reference.instanceKind === "keyed-collection" &&
    reference.path.length <= 1
  )
    return { kind: "keyed-collection", identity: reference.identity };
  if (
    reference.instanceKind === "network" &&
    reference.path.length === 1 &&
    ((reference.identity === "XMLHttpRequest" && member === "open") ||
      (reference.identity === "axios" &&
        member !== undefined &&
        AXIOS_REQUEST_METHODS.has(member)))
  )
    return { kind: "network", identity: reference.identity };
  if (
    (reference.owner === "module:axios" &&
      (reference.path.length === 0 ||
        (reference.path.length === 1 &&
          member !== undefined &&
          AXIOS_REQUEST_METHODS.has(member)))) ||
    ((reference.owner === "module:http" ||
      reference.owner === "module:https") &&
      reference.path.length === 1 &&
      (member === "get" || member === "request"))
  )
    return { kind: "network", identity: reference.identity };
  if (reference.owner !== "global") return undefined;
  const [root, storage, area] = reference.path;
  if (
    (root === "chrome" || root === "browser") &&
    storage === "storage" &&
    reference.path.length === 4 &&
    (area === "local" ||
      area === "session" ||
      area === "sync" ||
      area === "managed")
  )
    return {
      kind: "extension-storage",
      identity: `${root}.storage.${area}`,
      area,
    };
  if (
    reference.path.length === 1 &&
    root !== undefined &&
    NETWORK_GLOBALS.has(root)
  )
    return { kind: "network", identity: root };
  return undefined;
};

/** Classify calls using one lexical index and one shared visible-write index. */
export function* classifyJavaScriptCallReceiversSteps(
  program: t.Program,
  state: JavaScriptSemanticAnalysisState,
): Generator<void, JavaScriptCallReceiverFacts> {
  const references = new CallReceiverReferences(state);
  const writes = yield* collectReceiverWritesSteps(program, references);
  const facts = new Map<t.Node, JavaScriptCallReceiverFact>();
  yield* traverseJavaScriptAstSteps(program, {
    enter: (node) => {
      if (
        !t.isCallExpression(node) &&
        !t.isOptionalCallExpression(node) &&
        !t.isNewExpression(node)
      )
        return;
      const reference = references.resolve(node.callee);
      if (reference !== undefined && referenceWasWritten(reference, writes))
        return;
      const fact =
        reference === undefined ? undefined : callReceiverFact(reference);
      const legacy = fact ?? legacyOpenReceiverFact(node, state);
      if (legacy !== undefined) facts.set(node, legacy);
    },
  });
  return facts;
}

/** Retain the existing overloaded-open rules, including local/global shadows. */
const legacyOpenReceiverFact = (
  node: t.CallExpression | t.OptionalCallExpression | t.NewExpression,
  state: JavaScriptSemanticAnalysisState,
): JavaScriptCallReceiverFact | undefined => {
  if (
    t.isNewExpression(node) ||
    (!t.isMemberExpression(node.callee) &&
      !t.isOptionalMemberExpression(node.callee)) ||
    semanticStaticPropertyKey(node.callee.property, node.callee.computed) !==
      "open" ||
    !t.isIdentifier(node.callee.object)
  )
    return undefined;
  const receiver = node.callee.object.name;
  const binding = resolveSemanticBindingState(state, node, receiver);
  if (binding === undefined)
    return semanticResolutionBlocked(state, node, receiver)
      ? undefined
      : openGlobalFact(receiver);
  const local: JavaScriptCallReceiverFact = {
    kind:
      receiver === "indexedDB"
        ? "local-indexed-db"
        : receiver === "caches"
          ? "local-cache-storage"
          : "local",
  };
  if (receiver === "indexedDB" || receiver === "caches") return local;
  if (binding.mutable || binding.initializers.length !== 1) return local;
  const initializer = binding.initializers[0]?.node;
  if (!t.isIdentifier(initializer)) return local;
  const initializerBinding = resolveSemanticBindingState(
    state,
    initializer,
    initializer.name,
  );
  if (initializerBinding !== undefined) {
    if (initializer.name !== "indexedDB" && initializer.name !== "caches")
      return local;
    const nestedLocal: JavaScriptCallReceiverFact = {
      kind:
        initializer.name === "indexedDB"
          ? "local-indexed-db"
          : "local-cache-storage",
    };
    if (
      initializerBinding.mutable ||
      initializerBinding.initializers.length !== 1
    )
      return nestedLocal;
    const nested = initializerBinding.initializers[0]?.node;
    return t.isIdentifier(nested)
      ? (resolveGlobalAliasFact(state, initializer, nested.name) ?? nestedLocal)
      : nestedLocal;
  }
  return resolveGlobalAliasFact(state, initializer, initializer.name) ?? local;
};

const openGlobalFact = (
  name: string,
): JavaScriptCallReceiverFact | undefined => {
  if (WINDOW_GLOBALS.has(name) || name === "document")
    return { kind: "window" };
  if (name === "indexedDB") return { kind: "indexed-db" };
  if (name === "caches") return { kind: "cache-storage" };
  return undefined;
};

const resolveGlobalAliasFact = (
  state: JavaScriptSemanticAnalysisState,
  node: t.Node,
  name: string,
): JavaScriptCallReceiverFact | undefined =>
  resolveSemanticBindingState(state, node, name) === undefined &&
  !semanticResolutionBlocked(state, node, name)
    ? openGlobalFact(name)
    : undefined;
