import * as t from "@babel/types";

import { semanticBuiltinNamespacePath } from "./javascriptSemanticProvenance.js";

import type {
  JavaScriptSemanticCallable,
  JavaScriptSemanticEventOperation,
  JavaScriptSemanticListenerTarget,
  JavaScriptSemanticTimerOperation,
} from "./javascriptSemanticIr.js";
import { semanticCallableIdForNode } from "./javascriptSemanticProjection.js";
import { semanticStaticPropertyName } from "./javascriptAstValues.js";
import {
  resolveSemanticBindingState,
  semanticResolutionBlocked,
  type JavaScriptSemanticAnalysisState,
  type JavaScriptSemanticBindingState,
} from "./javascriptSemanticState.js";
import { traverseJavaScriptAst } from "./javascriptSemanticTraversal.js";
import { range } from "./javascriptStaticAnalysisHelpers.js";
import {
  dataEffectLiteralString,
  dataEffectMemberCallee,
  assignedSemanticResultBindings,
  scalarAssignedResultBinding,
  semanticProjectedBindingFacts,
} from "./javascriptSemanticDataEffectHelpers.js";
import { createSemanticEventHandlerResolver } from "./javascriptSemanticEventHandlers.js";
import { semanticBrowserEventProfile } from "./javascriptSemanticEventProfiles.js";

const EVENT_REGISTER_METHODS = [
  "on",
  "once",
  "addListener",
  "prependListener",
  "prependOnceListener",
] as const;
const EVENT_REMOVE_METHODS = [
  "off",
  "removeListener",
  "removeAllListeners",
] as const;
const EVENT_METHODS = [
  ...EVENT_REGISTER_METHODS,
  ...EVENT_REMOVE_METHODS,
  "emit",
] as const;
const TIMER_SCHEDULE_METHODS = [
  "setTimeout",
  "setInterval",
  "setImmediate",
] as const;
const TIMER_CANCEL_METHODS = [
  "clearTimeout",
  "clearInterval",
  "clearImmediate",
] as const;

interface AsyncEffectAnalysis {
  readonly eventOperations: readonly JavaScriptSemanticEventOperation[];
  readonly timerOperations: readonly JavaScriptSemanticTimerOperation[];
}

interface TimerCandidate {
  readonly node: t.CallExpression | t.OptionalCallExpression;
  readonly method: JavaScriptSemanticTimerOperation["method"];
  readonly kind: JavaScriptSemanticTimerOperation["kind"];
  readonly ownerCallableId: string | null;
  readonly handleBindingId: string | null;
  readonly projectedResultBindings: readonly {
    readonly bindingId: string;
    readonly projectionPath: readonly (string | number | null)[];
    readonly resolution: "complete" | "partial";
  }[];
}

interface TimerCollectionInput {
  readonly node: t.CallExpression | t.OptionalCallExpression;
  readonly ownerCallableId: string | null;
  readonly state: JavaScriptSemanticAnalysisState;
  readonly output: TimerCandidate[];
  readonly ancestors: readonly t.Node[];
}

interface EventCollectionContext {
  readonly state: JavaScriptSemanticAnalysisState;
  readonly output: JavaScriptSemanticEventOperation[];
  readonly resolveHandler: ReturnType<
    typeof createSemanticEventHandlerResolver
  >;
}

/** Recover explicit EventEmitter and Node timer candidates from inert syntax. */
export const collectJavaScriptSemanticAsyncEffects = (
  program: t.Program,
  state: JavaScriptSemanticAnalysisState,
  callables: readonly JavaScriptSemanticCallable[],
): AsyncEffectAnalysis => {
  const events: JavaScriptSemanticEventOperation[] = [];
  const timers: TimerCandidate[] = [];
  const callableIds = new Set(callables.map(({ callableId }) => callableId));
  const resolveHandler = createSemanticEventHandlerResolver(state, callables);
  const callableStack: string[] = [];
  const ancestors: t.Node[] = [];
  traverseJavaScriptAst(program, {
    enter: (node) => {
      const callableId = semanticCallableIdForNode(node);
      if (callableId !== null && callableIds.has(callableId))
        callableStack.push(callableId);
      if (t.isCallExpression(node) || t.isOptionalCallExpression(node)) {
        const ownerCallableId = callableStack.at(-1) ?? null;
        collectEvent(node, ownerCallableId, {
          state,
          output: events,
          resolveHandler,
        });
        collectTimer({
          node,
          ownerCallableId,
          state,
          output: timers,
          ancestors,
        });
      }
      ancestors.push(node);
    },
    exit: (node) => {
      const callableId = semanticCallableIdForNode(node);
      ancestors.pop();
      if (callableId !== null && callableStack.at(-1) === callableId)
        callableStack.pop();
    },
  });
  return {
    eventOperations: events,
    timerOperations: resolveTimers(timers),
  };
};

const collectEvent = (
  node: t.CallExpression | t.OptionalCallExpression,
  ownerCallableId: string | null,
  context: EventCollectionContext,
): void => {
  const { state, output, resolveHandler } = context;
  const member = dataEffectMemberCallee(node);
  if (member === null) return;
  const browser = semanticBrowserEventProfile(member, state);
  const method =
    browser?.method ??
    EVENT_METHODS.find(
      (candidate) =>
        candidate ===
        semanticStaticPropertyName(member.property, member.computed),
    );
  if (method === undefined) return;
  const kind = browser?.kind ?? eventKind(method);
  const eventArgument = node.arguments[0];
  const callbackIndex = browser?.callbackIndex ?? 1;
  const listenerArgument = node.arguments[callbackIndex];
  const emitter = emitterIdentity(member.object, state);
  const eventName =
    browser?.eventName ?? dataEffectLiteralString(eventArgument);
  const listenerTarget = eventListenerTarget({
    node,
    callbackIndex,
    kind,
    method,
    resolveHandler,
  });
  output.push({
    eventId: `event:${kind}:${String(node.start ?? -1)}:${String(node.end ?? -1)}`,
    kind,
    method,
    location: range(node),
    ownerCallableId,
    emitterKey: browser?.emitterKey ?? emitter.key,
    emitterBindingId: browser === null ? emitter.bindingId : null,
    eventName,
    listenerBindingId: bindingId(listenerArgument, state),
    listenerLocation: t.isNode(listenerArgument)
      ? range(listenerArgument)
      : null,
    eventProfile: browser?.eventProfile ?? "event-emitter",
    ...(listenerTarget === undefined ? {} : { listenerTarget }),
    resolution: eventResolution(eventName, browser !== null, emitter.complete),
  });
};

/** Browser method syntax never establishes the effective target or activation. */
const eventResolution = (
  eventName: string | null,
  browserProfile: boolean,
  emitterComplete: boolean,
): JavaScriptSemanticEventOperation["resolution"] =>
  eventName === null
    ? "unresolved"
    : !browserProfile && emitterComplete
      ? "complete"
      : "partial";

/** A syntactic argument after a spread has no proved positional callback role. */
const eventListenerTarget = (input: {
  readonly node: t.CallExpression | t.OptionalCallExpression;
  readonly callbackIndex: number;
  readonly kind: JavaScriptSemanticEventOperation["kind"];
  readonly method: JavaScriptSemanticEventOperation["method"];
  readonly resolveHandler: ReturnType<
    typeof createSemanticEventHandlerResolver
  >;
}): JavaScriptSemanticListenerTarget | undefined => {
  if (input.kind === "dispatch" || input.method === "removeAllListeners")
    return undefined;
  if (
    input.node.arguments
      .slice(0, input.callbackIndex + 1)
      .some((argument) => t.isSpreadElement(argument))
  )
    return {
      callableId: null,
      reason: "A spread argument leaves the callback position unresolved.",
    };
  return input.resolveHandler(input.node.arguments[input.callbackIndex]);
};

const eventKind = (
  method: JavaScriptSemanticEventOperation["method"],
): JavaScriptSemanticEventOperation["kind"] => {
  if (EVENT_REGISTER_METHODS.some((candidate) => candidate === method))
    return "register";
  if (EVENT_REMOVE_METHODS.some((candidate) => candidate === method))
    return "remove";
  return "dispatch";
};

const emitterIdentity = (
  node: t.Expression | t.Super,
  state: JavaScriptSemanticAnalysisState,
): {
  readonly key: string;
  readonly bindingId: string | null;
  readonly complete: boolean;
} => {
  if (t.isIdentifier(node)) {
    const binding = resolveSemanticBindingState(state, node, node.name);
    if (binding !== undefined)
      return {
        key: `binding:${binding.bindingId}`,
        bindingId: binding.bindingId,
        complete: true,
      };
    return {
      key: `global:${node.name}`,
      bindingId: null,
      complete: !semanticResolutionBlocked(state, node, node.name),
    };
  }
  if (t.isThisExpression(node))
    return { key: "this", bindingId: null, complete: true };
  return {
    key: `expression:${String(node.start ?? -1)}:${String(node.end ?? -1)}`,
    bindingId: null,
    complete: false,
  };
};

const collectTimer = (input: TimerCollectionInput): void => {
  const { node, ownerCallableId, state, output, ancestors } = input;
  const method = timerMethod(node.callee, state);
  if (method === null) return;
  const kind = TIMER_SCHEDULE_METHODS.some((candidate) => candidate === method)
    ? "schedule"
    : "cancel";
  const projectedResultBindings = assignedSemanticResultBindings(
    node,
    ancestors,
    state,
  );
  output.push({
    node,
    method,
    kind,
    ownerCallableId,
    handleBindingId:
      kind === "schedule"
        ? scalarAssignedResultBinding(projectedResultBindings)
        : bindingId(node.arguments[0], state),
    projectedResultBindings:
      kind === "schedule"
        ? semanticProjectedBindingFacts(
            projectedResultBindings.filter(
              ({ projectionPath }) => projectionPath.length > 0,
            ),
          )
        : [],
  });
};

const resolveTimers = (
  candidates: readonly TimerCandidate[],
): JavaScriptSemanticTimerOperation[] => {
  const schedulesByBinding = new Map<string, TimerCandidate[]>();
  for (const candidate of candidates) {
    if (candidate.kind !== "schedule") continue;
    const ids = [
      ...(candidate.handleBindingId === null
        ? []
        : [candidate.handleBindingId]),
      ...candidate.projectedResultBindings.map(({ bindingId }) => bindingId),
    ];
    for (const id of ids) {
      const existing = schedulesByBinding.get(id) ?? [];
      existing.push(candidate);
      schedulesByBinding.set(id, existing);
    }
  }
  return candidates.map((candidate) => {
    const linked =
      candidate.kind === "cancel" && candidate.handleBindingId !== null
        ? (schedulesByBinding.get(candidate.handleBindingId) ?? [])
        : [];
    return {
      timerId: timerId(candidate),
      kind: candidate.kind,
      method: candidate.method,
      location: range(candidate.node),
      ownerCallableId: candidate.ownerCallableId,
      handleBindingId: candidate.handleBindingId,
      projectedResultBindings: candidate.projectedResultBindings,
      linkedTimerId:
        linked.length === 1 && linked[0] !== undefined
          ? timerId(linked[0])
          : null,
      delayMilliseconds: timerDelay(candidate),
      resolution:
        candidate.kind === "schedule"
          ? "complete"
          : linked.length === 1 &&
              !linked[0]?.projectedResultBindings.some(
                ({ bindingId }) => bindingId === candidate.handleBindingId,
              )
            ? "complete"
            : linked.length > 1
              ? "partial"
              : "unresolved",
    };
  });
};

const timerMethod = (
  callee: t.Node,
  state: JavaScriptSemanticAnalysisState,
): JavaScriptSemanticTimerOperation["method"] | null => {
  if (t.isIdentifier(callee)) {
    const binding = resolveSemanticBindingState(state, callee, callee.name);
    if (binding === undefined) {
      const method = admittedTimerMethod(callee.name);
      if (method === null) return null;
      return semanticResolutionBlocked(state, callee, callee.name)
        ? null
        : method;
    }
    return timerMethodFromBinding(binding);
  }
  if (!t.isMemberExpression(callee) && !t.isOptionalMemberExpression(callee))
    return null;
  const method = admittedTimerMethod(
    semanticStaticPropertyName(callee.property, callee.computed),
  );
  return method !== null &&
    t.isIdentifier(callee.object) &&
    timerNamespaceBinding(
      resolveSemanticBindingState(state, callee.object, callee.object.name),
    )
    ? method
    : null;
};

const admittedTimerMethod = (
  value: string,
): JavaScriptSemanticTimerOperation["method"] | null =>
  [...TIMER_SCHEDULE_METHODS, ...TIMER_CANCEL_METHODS].find(
    (candidate) => candidate === value,
  ) ?? null;

const timerMethodFromBinding = (
  binding: JavaScriptSemanticBindingState,
): JavaScriptSemanticTimerOperation["method"] | null => {
  for (const { specifier, importedPath } of binding.directOrigins) {
    if (!timerModule(specifier)) continue;
    const method = admittedTimerMethod(importedPath.at(-1) ?? "");
    if (method !== null) return method;
  }
  return null;
};

const timerNamespaceBinding = (
  binding: JavaScriptSemanticBindingState | undefined,
): boolean =>
  binding?.directOrigins.some(
    ({ specifier, importedPath }) =>
      timerModule(specifier) && semanticBuiltinNamespacePath(importedPath),
  ) ?? false;

const timerModule = (specifier: string): boolean =>
  specifier === "timers" || specifier === "node:timers";

const bindingId = (
  node:
    | t.Expression
    | t.SpreadElement
    | t.JSXNamespacedName
    | t.ArgumentPlaceholder
    | undefined,
  state: JavaScriptSemanticAnalysisState,
): string | null =>
  t.isIdentifier(node)
    ? (resolveSemanticBindingState(state, node, node.name)?.bindingId ?? null)
    : null;

const timerDelay = (candidate: TimerCandidate): number | null => {
  if (candidate.kind !== "schedule" || candidate.method === "setImmediate")
    return null;
  const delay = candidate.node.arguments[1];
  return t.isNumericLiteral(delay) ? delay.value : null;
};

const timerId = (candidate: TimerCandidate): string =>
  `timer:${candidate.kind}:${String(candidate.node.start ?? -1)}:${String(candidate.node.end ?? -1)}`;
