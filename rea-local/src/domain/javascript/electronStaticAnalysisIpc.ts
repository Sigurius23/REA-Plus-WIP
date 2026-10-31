import * as t from "@babel/types";

import type {
  ElectronIpcDescriptor,
  ElectronIpcFinding,
} from "./electronStaticAnalysisTypes.js";
import {
  boundedExpression,
  electronCalleePath,
  electronStaticValue,
  handlerKind,
} from "./electronStaticAnalysisValues.js";
import { addLocatedFinding } from "./javascriptStaticAnalysisFindings.js";
import { argumentNode, range } from "./javascriptStaticAnalysisHelpers.js";
import type { JavaScriptFindingContext } from "./javascriptStaticAnalysisState.js";

/** Inspect Electron IPC operations and validation candidates. */
export const inspectElectronIpcNode = (
  node: t.Node,
  context: JavaScriptFindingContext,
): void => {
  if (t.isCallExpression(node) || t.isOptionalCallExpression(node)) {
    inspectIpcCall(node, context);
  }
};

const inspectIpcCall = (
  node: t.CallExpression | t.OptionalCallExpression,
  context: JavaScriptFindingContext,
): void => {
  const descriptor = ipcDescriptor(electronCalleePath(node.callee, context));
  if (descriptor === undefined) return;
  const channelNode = argumentNode(node.arguments[0]);
  const channelValue = electronStaticValue(context.source, channelNode);
  const channel =
    channelValue.status === "literal" && typeof channelValue.value === "string"
      ? channelValue.value
      : null;
  const channelReference =
    channel === null
      ? {
          channel: null,
          channel_expression:
            channelValue.status === "dynamic"
              ? channelValue.expression
              : boundedExpression(context.source, channelNode),
        }
      : { channel, channel_expression: null };
  const handlerNode =
    descriptor.mode === "listen" || descriptor.mode === "handle"
      ? argumentNode(node.arguments[1])
      : undefined;
  const findingState =
    descriptor.mode === "send"
      ? {
          ...descriptor,
          handler_kind: null,
          handler_location: null,
        }
      : descriptor.mode === "invoke"
        ? {
            ...descriptor,
            handler_kind: null,
            handler_location: null,
          }
        : handlerNode === undefined
          ? {
              ...descriptor,
              handler_kind: "missing" as const,
              handler_location: null,
            }
          : {
              ...descriptor,
              handler_kind: handlerKind(handlerNode),
              handler_location: range(handlerNode),
            };
  if (channel === null) context.accumulator.unknownFindings += 1;
  if (findingState.handler_kind === "missing")
    context.accumulator.unknownFindings += 1;
  const finding: ElectronIpcFinding = {
    ...findingState,
    ...channelReference,
    module_key: null,
    location: range(node),
  };
  addLocatedFinding(context, {
    collection: context.accumulator.ipc,
    key: `electron-ipc\0${descriptor.side}\0${descriptor.operation}\0${channelReference.channel ?? channelReference.channel_expression}`,
    node,
    value: finding,
  });
};

const ipcDescriptor = (
  path: readonly string[] | undefined,
): ElectronIpcDescriptor | undefined => {
  if (path?.length !== 2) return undefined;
  const [object, operation] = path;
  if (object === "ipcRenderer" && operation !== undefined) {
    const renderer = operation;
    switch (renderer) {
      case "send":
        return { side: "renderer", operation: "send", mode: "send" };
      case "sendSync":
        return { side: "renderer", operation: "send-sync", mode: "send" };
      case "invoke":
        return { side: "renderer", operation: "invoke", mode: "invoke" };
      case "postMessage":
        return {
          side: "renderer",
          operation: "post-message",
          mode: "send",
        };
      case "sendToHost":
        return {
          side: "renderer",
          operation: "send-to-host",
          mode: "send",
        };
      case "on":
        return { side: "renderer", operation: "on", mode: "listen" };
      case "once":
        return { side: "renderer", operation: "once", mode: "listen" };
    }
  }
  const main = object === "ipcMain" ? operation : undefined;
  switch (main) {
    case "on":
      return { side: "main", operation: "on", mode: "listen" };
    case "once":
      return { side: "main", operation: "once", mode: "listen" };
    case "handle":
      return { side: "main", operation: "handle", mode: "handle" };
    case "handleOnce":
      return { side: "main", operation: "handle-once", mode: "handle" };
    default:
      return undefined;
  }
};
