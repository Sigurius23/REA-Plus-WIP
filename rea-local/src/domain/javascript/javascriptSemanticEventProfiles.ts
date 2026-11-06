import * as t from "@babel/types";

import {
  semanticStaticPropertyKey,
  unwrapJavaScriptExpression,
} from "./javascriptAstValues.js";
import type { JavaScriptSemanticEventOperation } from "./javascriptSemanticIr.js";
import {
  isUnshadowedGlobal,
  type JavaScriptSemanticAnalysisState,
} from "./javascriptSemanticState.js";

interface BrowserEventProfile {
  readonly method: JavaScriptSemanticEventOperation["method"];
  readonly kind: "register" | "remove";
  readonly eventProfile: "chrome-event" | "dom-event-target";
  readonly eventName: string | null;
  readonly callbackIndex: number;
  readonly emitterKey: string;
}

/** Recognize browser callback positions; the receiver's runtime identity stays partial. */
export const semanticBrowserEventProfile = (
  member: t.MemberExpression | t.OptionalMemberExpression,
  state: JavaScriptSemanticAnalysisState,
): BrowserEventProfile | null => {
  const method = semanticStaticPropertyKey(member.property, member.computed);
  const receiver = staticGlobalPath(member.object, state);
  if (receiver === null) return null;
  if (
    receiver.root === "chrome" &&
    receiver.path.length >= 2 &&
    /^on[A-Z]/u.test(receiver.path.at(-1) ?? "") &&
    (method === "addListener" || method === "removeListener")
  ) {
    const eventName = [receiver.root, ...receiver.path].join(".");
    return {
      method,
      kind: method === "addListener" ? "register" : "remove",
      eventProfile: "chrome-event",
      eventName,
      callbackIndex: 0,
      emitterKey: `chrome-event:${JSON.stringify([receiver.root, ...receiver.path])}`,
    };
  }
  if (
    ["document", "window"].includes(receiver.root) &&
    receiver.path.length === 0 &&
    (method === "addEventListener" || method === "removeEventListener")
  )
    return {
      method,
      kind: method === "addEventListener" ? "register" : "remove",
      eventProfile: "dom-event-target",
      eventName: null,
      callbackIndex: 1,
      emitterKey: `dom-event-target:${receiver.root}`,
    };
  return null;
};

const staticGlobalPath = (
  input: t.Node,
  state: JavaScriptSemanticAnalysisState,
): { readonly root: string; readonly path: readonly string[] } | null => {
  const path: string[] = [];
  let node = unwrapJavaScriptExpression(input).node;
  while (t.isMemberExpression(node) || t.isOptionalMemberExpression(node)) {
    const key = semanticStaticPropertyKey(node.property, node.computed);
    if (key === null) return null;
    path.push(key);
    node = unwrapJavaScriptExpression(node.object).node;
  }
  return t.isIdentifier(node) && isUnshadowedGlobal(node, state, node.name)
    ? { root: node.name, path: path.reverse() }
    : null;
};
