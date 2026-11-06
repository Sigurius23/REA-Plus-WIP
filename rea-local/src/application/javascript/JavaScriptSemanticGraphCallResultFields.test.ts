import { expect, it } from "vitest";
import { graphForJavaScript as graphFor } from "../../../tests/fixtures/javascriptSemanticGraph.js";
import { queryJavaScriptSemanticGraph } from "../../domain/javascript/javascriptSemanticQuery.js";
import { analyzeJavaScriptSemantics } from "../../domain/javascript/javascriptSemanticAnalysis.js";

it.each([
  "function known(){return {value:'owned-value'};} const result=known(); const output=result.value; consume(output);",
  "const known=()=>({value:'owned-value'}); const result=known(); const {value:output}=result; consume(output);",
  "const known=()=>{return {'a/b~c':'owned-value'};}; const result=known(); const output=result['a/b~c']; consume(output);",
  "function known(){return {value:'owned-value',other:'sibling'};} const result=known(); result.other='changed'; const output=result.value; consume(output);",
])(
  "traces caller own-field reads to the selected local return: %s",
  (source) => {
    const graph = graphFor(source);
    const output = graph.nodes.find(
      (node) => node.kind === "binding" && node.label === "output",
    );
    if (output === undefined) throw new Error("Missing output binding");
    const trace = queryJavaScriptSemanticGraph(graph, {
      seed: { kind: "semantic-node", node_id: output.node_id },
      direction: "backward-provenance",
    });
    expect(trace.nodes).toContainEqual(
      expect.objectContaining({
        kind: "literal",
        properties: { value: "owned-value" },
      }),
    );
    expect(trace.relations).toContainEqual(
      expect.objectContaining({
        relation: expect.stringMatching(/^(reads-property|destructures)$/),
        resolution: "resolved",
        properties: expect.objectContaining({
          return_site_id: expect.any(String),
        }),
      }),
    );
  },
);

it("keeps unknown returned reads as candidate dependencies and legacy omission unchanged", () => {
  const source =
    "function known(input){return {value:input.value};} const result=known(document); const output=result.value; consume(output);";
  const ir = analyzeJavaScriptSemantics(source);
  const graph = graphFor(source, ir);
  expect(graph.relations).toContainEqual(
    expect.objectContaining({
      relation: "reads-property",
      resolution: "candidate",
      properties: expect.objectContaining({
        return_site_id: expect.any(String),
      }),
    }),
  );
  const { callResultFieldFlows: _flows, ...legacy } = ir;
  expect(
    graphFor(source, legacy).relations.some(
      (relation) => relation.properties.return_site_id !== undefined,
    ),
  ).toBe(false);
});

it.each([
  "function known(){return {value:'owned-value'};} const result=known(); result.value='replacement'; const output=result.value;",
  "function known(){return {value:'owned-value'};} const result=known(); change(result); const output=result.value;",
  "function known(){return {value:'owned-value'};} const result=known(); const alias=result; alias.value='replacement'; const output=result.value;",
  "function known(){return {value:'owned-value'};} const result=known(); const alias=result; const output=alias.value;",
  "function known(){return {value:'owned-value'};} let result=known(); result=other(); const output=result.value;",
  "let known=()=>({value:'owned-value'}); known=other; const result=known(); const output=result.value;",
  "function known(){return {value:'owned-value'};} const alias=known; const result=alias(); const output=result.value;",
  "async function known(){return {value:'owned-value'};} const result=known(); const output=result.value;",
  "function* known(){return {value:'owned-value'};} const result=known(); const output=result.value;",
  "function known(){if(flag)return {value:'owned-value'};} const result=known(); const output=result.value;",
  "function known(){return {value:'owned-value',...unknown};} const result=known(); const output=result.value;",
  "function known(){return {get value(){return 'owned-value'}};} const result=known(); const output=result.value;",
  "function known(){return {value:'owned-value',get trigger(){this.value='replacement';}};} const result=known(); result.trigger; const output=result.value;",
  "function known(){return {__proto__:{get trigger(){this.value='replacement';}},value:'owned-value'};} const result=known(); result.trigger; const output=result.value;",
  "function known(){return {value:'owned-value'};} const result=known(); const alias=result; change(alias); const output=result.value;",
  "function known(){return {value:'owned-value'};} const result=known?.(); const output=result.value;",
  "function known(){return {value:'owned-value'};} const result=known(); const output=result[key];",
  "function known(){return {value:'owned-value'};} const result=known(); delete result.value; const output=result.value;",
])(
  "does not invent caller field provenance for unsupported ownership: %s",
  (source) => {
    const ir = analyzeJavaScriptSemantics(source);
    expect(ir.callResultFieldFlows).toEqual([]);
  },
);
