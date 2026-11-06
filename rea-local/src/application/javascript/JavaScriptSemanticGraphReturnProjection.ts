import { createJavaScriptSemanticGraphUnknown } from "../../domain/javascript/javascriptSemanticGraph.js";
import {
  semanticSlotAtPath,
  semanticContainer,
  semanticPropertyPointer,
} from "../../domain/javascript/javascriptSemanticSlots.js";
import { sourceRangesEqual } from "../../domain/javascript/javascriptStaticAnalysisHelpers.js";
import type {
  JavaScriptSemanticReturnFieldSource,
  JavaScriptSemanticObjectOperation,
} from "../../domain/javascript/javascriptSemanticIr.js";
import type { JavaScriptSemanticProperty } from "../../domain/javascript/javascriptSemanticValueTypes.js";
import type { JavaScriptSemanticGraphNode } from "../../domain/javascript/javascriptSemanticGraphSchemas.js";
import {
  retainSemanticGraphNode,
  addSemanticGraphRelation,
  addSemanticGraphUnknown,
} from "./JavaScriptSemanticGraphConstruction.js";
import { semanticObjectOccurrence } from "./JavaScriptSemanticGraphObjectProjection.js";
import {
  inferredSemanticEvidenceAt,
  unknownSemanticEvidence,
} from "./JavaScriptSemanticGraphEvidence.js";
import type { SemanticFlowProjectionContext } from "./JavaScriptSemanticGraphFlowProjection.js";

/** Project field contributions; a returned aggregate is never its input alias. */
export function* projectSemanticReturnFields(
  context: SemanticFlowProjectionContext,
): Generator<void, void> {
  const returnedFields = new Map<string, JavaScriptSemanticGraphNode>();
  const propertyReads = new Map(
    context.ir.objectOperations
      .filter((operation) => operation.kind === "read")
      .map((operation) => [rangeKey(operation.location), operation]),
  );
  for (const callable of context.ir.callables) {
    for (const site of callable.returnSites) {
      if (site.fieldSources === undefined) continue; // Historical IR is not a measured empty inventory.
      const returned = context.returnSiteNodes.get(site.returnSiteId);
      if (returned === undefined) continue;
      for (const field of site.fieldSources) {
        yield;
        const fact = semanticSlotAtPath(site.value, field.path);
        const slot = retainSemanticGraphNode(context.state, context.file, {
          kind: "property-slot",
          roleKey: `return-property:${JSON.stringify([site.returnSiteId, field.path])}`,
          location: field.location,
          label: fact.name,
          functionNodeId: returned.function_node_id,
          properties: {
            name: fact.name,
            property_path: [...field.path],
            property_pointer: semanticPropertyPointer(field.path),
            return_site_id: site.returnSiteId,
            presence: fact.presence,
            value_status: fact.value.status,
            value_coverage: semanticContainer(fact.value)?.coverage ?? null,
            source_status: field.status,
            source_reason: field.reason,
          },
        });
        if (slot !== null)
          returnedFields.set(
            JSON.stringify([site.returnSiteId, field.path]),
            slot,
          );
        addSemanticGraphRelation(context.state, {
          source: slot,
          target: returned,
          relation: "defines",
          resolution: fact.presence === "present" ? "resolved" : "candidate",
          properties: { return_property_path: [...field.path] },
          evidence: inferredSemanticEvidenceAt(context.file, field.location),
        });
        const source = returnFieldExpression({
          context,
          returnSiteId: site.returnSiteId,
          field,
          fact,
          propertyReads,
        });
        addSemanticGraphRelation(context.state, {
          source,
          target: slot,
          relation: "defines",
          resolution:
            field.status === "complete" && fact.value.status === "literal"
              ? "resolved"
              : "candidate",
          properties: { return_property_path: [...field.path] },
          evidence: inferredSemanticEvidenceAt(
            context.file,
            field.expressionLocation ?? field.location,
          ),
        });
        const reason = fieldUnknownReason(
          field,
          fact,
          source !== null && source !== undefined,
        );
        if (reason !== null)
          addReturnUnknown(context, slot?.node_id ?? returned.node_id, {
            location: field.location,
            detail: reason,
            reason:
              field.status === "unsupported"
                ? "unsupported-syntax"
                : "unknown-value",
          });
      }
      const container = semanticContainer(site.value);
      if (container?.coverage.status === "partial")
        addReturnUnknown(context, returned.node_id, {
          location: site.location,
          detail:
            "Returned object has unknown or omitted own fields; retained field dependencies do not establish a complete return shape.",
          reason: "ambiguous-target",
        });
    }
  }
  const operations = new Map(
    context.ir.objectOperations.map((operation) => [
      operation.objectOperationId,
      operation,
    ]),
  );
  for (const flow of context.ir.callResultFieldFlows ?? []) {
    yield;
    const operation = operations.get(flow.objectOperationId);
    if (operation === undefined) continue;
    addSemanticGraphRelation(context.state, {
      source: returnedFields.get(
        JSON.stringify([flow.returnSiteId, flow.propertyPath]),
      ),
      target:
        operation.kind === "destructure" && operation.targetBindingId !== null
          ? context.bindingNodes.get(operation.targetBindingId)
          : semanticObjectOccurrence(context, operation),
      relation:
        operation.kind === "destructure" ? "destructures" : "reads-property",
      resolution: flow.resolution === "complete" ? "resolved" : "candidate",
      properties: {
        call_site_id: flow.callSiteId,
        return_site_id: flow.returnSiteId,
        return_property_path: [...flow.propertyPath],
      },
      evidence: inferredSemanticEvidenceAt(context.file, operation.location),
    });
    if (operation.kind === "read" && operation.targetBindingId !== null)
      addSemanticGraphRelation(context.state, {
        source: semanticObjectOccurrence(context, operation),
        target: context.bindingNodes.get(operation.targetBindingId),
        relation: "defines",
        resolution: "resolved",
        evidence: inferredSemanticEvidenceAt(context.file, operation.location),
      });
  }
}

interface FieldExpressionInput {
  readonly context: SemanticFlowProjectionContext;
  readonly returnSiteId: string;
  readonly field: JavaScriptSemanticReturnFieldSource;
  readonly fact: JavaScriptSemanticProperty;
  readonly propertyReads: ReadonlyMap<
    string,
    JavaScriptSemanticObjectOperation
  >;
}

const returnFieldExpression = ({
  context,
  returnSiteId,
  field,
  fact,
  propertyReads,
}: FieldExpressionInput) => {
  const location = field.expressionLocation;
  if (location === null || field.status !== "complete") return null;
  if (field.expressionKind === "identifier") {
    const references = context
      .referenceNodesWithin(location)
      .filter((node) =>
        sourceRangesEqual(node.identity.source_range, location),
      );
    return references.length === 1 ? references[0] : null;
  }
  if (field.expressionKind === "property-read") {
    const operation = propertyReads.get(rangeKey(location));
    return operation === undefined
      ? null
      : semanticObjectOccurrence(context, operation);
  }
  if (field.expressionKind === "literal" && fact.value.status === "literal")
    return retainSemanticGraphNode(context.state, context.file, {
      kind: "literal",
      roleKey: `return-literal:${JSON.stringify([returnSiteId, field.path])}`,
      location,
      label: "returned literal",
      functionNodeId:
        context.returnSiteNodes.get(returnSiteId)?.function_node_id ?? null,
      properties: { value: fact.value.value },
    });
  return null;
};

const rangeKey = (
  location: JavaScriptSemanticReturnFieldSource["location"],
): string =>
  [
    location.start.line,
    location.start.column,
    location.end.line,
    location.end.column,
  ].join(":");

const addReturnUnknown = (
  context: SemanticFlowProjectionContext,
  nodeId: string,
  input: {
    readonly location: JavaScriptSemanticReturnFieldSource["location"];
    readonly detail: string;
    readonly reason:
      | "unsupported-syntax"
      | "unknown-value"
      | "ambiguous-target";
  },
) =>
  addSemanticGraphUnknown(
    context.state,
    createJavaScriptSemanticGraphUnknown(
      {
        node_id: nodeId,
        family: "data-flow",
        relation_kinds: ["defines"],
        reason: input.reason,
        detail: input.detail,
        candidate_node_ids: [],
        evidence: unknownSemanticEvidence(context.file, input.location),
      },
      context.state.evidenceContexts,
    ),
  );

const fieldUnknownReason = (
  field: JavaScriptSemanticReturnFieldSource,
  fact: JavaScriptSemanticProperty,
  hasSource: boolean,
): string | null =>
  field.reason ??
  ("reason" in fact.value
    ? fact.value.reason
    : hasSource
      ? null
      : "The return field's source expression is not represented.");
