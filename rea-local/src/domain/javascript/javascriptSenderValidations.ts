import * as t from "@babel/types";

import { compositeKey } from "../unicodeCodePointOrder.js";
import { electronStaticValue } from "./electronStaticAnalysisValues.js";
import { electronMemberPath } from "./javascriptElectronMemberWrites.js";
import { semanticStaticPropertyName } from "./javascriptAstValues.js";
import { addLocatedFinding } from "./javascriptStaticAnalysisFindings.js";
import {
  argumentNode,
  calleeName,
  range,
} from "./javascriptStaticAnalysisHelpers.js";
import type { JavaScriptFindingContext } from "./javascriptStaticAnalysisState.js";
import type { JavaScriptSenderValidationFinding } from "./javascriptStaticAnalysisTypes.js";

type Subject = JavaScriptSenderValidationFinding["subject"];
type Transport = NonNullable<JavaScriptSenderValidationFinding["transport"]>;

/** Preserve sender-like syntax independently of its messaging transport. */
export const inspectJavaScriptSenderValidationNode = (
  node: t.Node,
  context: JavaScriptFindingContext,
): void => {
  if (
    t.isBinaryExpression(node) &&
    ["==", "===", "!=", "!==", "in"].includes(node.operator)
  ) {
    const left = senderSubject(node.left, context);
    const right = senderSubject(node.right, context);
    const subject = left ?? right;
    if (subject === undefined) return;
    addValidation(
      context,
      node,
      subject,
      `comparison:${node.operator}`,
      left === undefined ? node.left : node.right,
    );
  } else if (t.isCallExpression(node) || t.isOptionalCallExpression(node)) {
    if (
      !t.isMemberExpression(node.callee) &&
      !t.isOptionalMemberExpression(node.callee)
    )
      return;
    const method = semanticStaticPropertyName(
      node.callee.property,
      node.callee.computed,
    );
    if (!["startsWith", "endsWith", "includes"].includes(method)) return;
    const subject = senderSubject(node.callee.object, context);
    if (subject !== undefined)
      addValidation(
        context,
        node,
        subject,
        `call:${method}`,
        argumentNode(node.arguments[0]),
      );
  }
};

const addValidation = (
  context: JavaScriptFindingContext,
  node: t.Node,
  subject: { readonly subject: Subject; readonly transport: Transport },
  mechanism: string,
  expectedNode: t.Node | undefined,
): void => {
  const expected = electronStaticValue(context.source, expectedNode);
  if (expected.status === "dynamic") context.accumulator.unknownFindings += 1;
  const finding = {
    subject: subject.subject,
    mechanism,
    expected,
    enforcement: "unknown" as const,
    module_key: null,
    location: range(node),
  };
  const key = compositeKey([
    "sender-validation",
    subject.transport,
    subject.subject,
    mechanism,
    expected.status === "literal"
      ? String(expected.value)
      : expected.expression,
  ]);
  if (subject.transport === "electron") {
    addLocatedFinding(context, {
      collection: context.accumulator.senderValidations,
      key,
      node,
      value: { ...finding, transport: "electron" },
    });
  } else {
    addLocatedFinding(context, {
      collection: context.accumulator.genericSenderValidations,
      key,
      node,
      value: { ...finding, transport: subject.transport },
    });
  }
};

const senderSubject = (
  node: t.Node,
  context: JavaScriptFindingContext,
): { readonly subject: Subject; readonly transport: Transport } | undefined => {
  const callee =
    t.isCallExpression(node) || t.isOptionalCallExpression(node)
      ? node.callee
      : node;
  const { root, members } = electronMemberPath(callee);
  const origin = context.senderOrigins?.get(root.start ?? -1);
  const path = [...(origin?.projection ?? []), ...members].join(".");
  const known =
    origin?.transport === "electron"
      ? electronSubject(path)
      : origin?.transport === "browser-extension"
        ? browserSenderSubject(path)
        : undefined;
  if (known !== undefined && origin !== undefined)
    return { subject: known, transport: origin.transport };
  const subject = syntacticSenderSubject(calleeName(callee));
  return subject === undefined ? undefined : { subject, transport: "unknown" };
};

const electronSubject = (path: string): Subject | undefined => {
  switch (path) {
    case "sender.getURL":
    case "senderFrame.url":
      return "sender-url";
    case "senderFrame.origin":
      return "sender-origin";
    case "senderFrame":
      return "sender-frame";
    case "sender.id":
      return "sender-id";
    case "frameId":
      return "frame-id";
    case "processId":
      return "process-id";
    default:
      return undefined;
  }
};

const browserSenderSubject = (path: string): Subject | undefined => {
  switch (path) {
    case "url":
    case "tab.url":
      return "sender-url";
    case "origin":
      return "sender-origin";
    case "id":
      return "sender-id";
    case "frameId":
      return "frame-id";
    default:
      return undefined;
  }
};

const syntacticSenderSubject = (name: string): Subject | undefined => {
  if (/(?:^|\.)sender\.getURL$/u.test(name)) return "sender-url";
  if (/(?:^|\.)senderFrame\.origin$/u.test(name)) return "sender-origin";
  if (/(?:^|\.)senderFrame\.url$/u.test(name)) return "sender-url";
  if (/(?:^|\.)senderFrame$/u.test(name)) return "sender-frame";
  if (/(?:^|\.)sender\.id$/u.test(name)) return "sender-id";
  if (/(?:^|\.)frameId$/u.test(name)) return "frame-id";
  if (/(?:^|\.)processId$/u.test(name)) return "process-id";
  return undefined;
};
