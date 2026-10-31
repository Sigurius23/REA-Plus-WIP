import { z } from "zod";
import { javaScriptEndpointReceiverSchema } from "../javascript/javascriptEndpointReceiver.js";
import type { JsonValue } from "../jsonValue.js";
import type { ApplicationNode } from "../javascript/javascriptApplicationGraphSchemas.js";

const partsSchema = z.array(
  z.union([
    z.strictObject({ text: z.string() }),
    z.strictObject({ expression: z.string() }),
  ]),
);

/** Derive URLs from caller substitutions, retaining the source template and exact observation. */
export const javascriptEndpointItems = (
  nodes: readonly ApplicationNode[],
  bindings: Readonly<Record<string, string>>,
): JsonValue[] =>
  nodes
    .filter((node) => node.kind === "endpoint")
    .flatMap((node) =>
      node.observations.map((observation) => {
        const { value, template_parts } = observation.properties;
        const parsed = partsSchema.safeParse(template_parts);
        const receiver = javaScriptEndpointReceiverSchema.safeParse(
          observation.properties.network_receiver,
        );
        const unresolved = new Set<string>();
        let materialized: string | null = null;
        if (parsed.success) {
          materialized = parsed.data
            .map((part) => {
              if ("text" in part) return part.text;
              if (!Object.hasOwn(bindings, part.expression)) {
                unresolved.add(part.expression);
                return "";
              }
              return bindings[part.expression] ?? "";
            })
            .join("");
          if (unresolved.size > 0) materialized = null;
        } else if (typeof value === "string" && !value.includes("{}"))
          materialized = value;
        return {
          node_id: node.node_id,
          observation_id: observation.observation_id,
          network_receiver: receiver.success ? receiver.data : null,
          template: value ?? null,
          template_parts: parsed.success ? parsed.data : null,
          materialized_value: materialized,
          materialization_status: parsed.success
            ? unresolved.size === 0
              ? "complete"
              : "unresolved"
            : materialized === null
              ? "not-recorded"
              : "literal",
          unresolved_expressions: [...unresolved],
          evidence: observation.evidence,
        };
      }),
    );
