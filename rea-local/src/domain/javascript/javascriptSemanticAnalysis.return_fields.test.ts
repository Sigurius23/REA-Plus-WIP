import { expect, it } from "vitest";
import { analyzeJavaScriptSemantics } from "./javascriptSemanticAnalysis.js";
import { onlyCallable } from "./javascriptSemanticAnalysis.fixture.js";

it.each([
  "() => { const input = {value: 'known'}; return {output: input.value}; }",
  "input => ({output: input.value})",
])("retains the selected object-field source for %s", (source) => {
  const callable = onlyCallable(
    analyzeJavaScriptSemantics(`const result = ${source};`),
    "result",
  );
  expect(callable.returnSites[0]?.fieldSources).toMatchObject([
    {
      path: ["output"],
      expressionKind: "property-read",
      status: "complete",
      reason: null,
    },
  ]);
  expect(
    callable.returnSites[0]?.fieldSources?.[0]?.expressionLocation,
  ).not.toBeNull();
});

it.each([
  ["{output: input.value, output: 'replacement'}", "literal", "complete"],
  ["{output: input.value, ...unknown}", "unsupported", "ambiguous"],
  [
    "{output: input.value, [unknown]: 'replacement'}",
    "unsupported",
    "ambiguous",
  ],
  [
    "{output: input.value, get output(){return 7}}",
    "unsupported",
    "unsupported",
  ],
  ["{['output']: input.value}", "unsupported", "unsupported"],
])("uses canonical overwrite/invalidation for %s", (object, kind, status) => {
  const ir = analyzeJavaScriptSemantics(`const result = input => (${object});`);
  const site = onlyCallable(ir, "result").returnSites[0];
  expect(site?.fieldSources).toMatchObject([
    { path: ["output"], expressionKind: kind, status },
  ]);
  if (status !== "complete")
    expect(site?.fieldSources?.[0]?.expressionLocation).toBeNull();
});

it("does not fabricate own prototype slots or expand nested expression support", () => {
  const site = onlyCallable(
    analyzeJavaScriptSemantics(
      "const result = input => ({__proto__: input, nested: {output: input.value}});",
    ),
    "result",
  ).returnSites[0];
  expect(site?.fieldSources).toMatchObject([
    { path: ["nested"], status: "unsupported" },
  ]);
});
