import { z } from "zod";
import type { JavaScriptCallReceiverFact } from "./javascriptCallReceiverFacts.js";

/** Static API identity, kept separate from an observed argument and runtime use. */
export const javaScriptEndpointReceiverSchema = z.discriminatedUnion("status", [
  z.strictObject({
    status: z.literal("recognized-network"),
    identity: z.string(),
  }),
  z.strictObject({ status: z.literal("unknown"), identity: z.null() }),
]);

export type JavaScriptEndpointReceiver = z.infer<
  typeof javaScriptEndpointReceiverSchema
>;

/** Method-name candidates do not establish that their receiver uses the network. */
export const endpointReceiver = (
  fact: JavaScriptCallReceiverFact | undefined,
): JavaScriptEndpointReceiver =>
  fact?.kind === "network"
    ? { status: "recognized-network", identity: fact.identity }
    : { status: "unknown", identity: null };
