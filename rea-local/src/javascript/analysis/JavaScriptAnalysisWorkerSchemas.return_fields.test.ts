import { expect, it } from "vitest";
import { analyzeJavaScriptSemantics } from "../../domain/javascript/javascriptSemanticAnalysis.js";
import { javaScriptWorkerModuleRecordSchema } from "./JavaScriptAnalysisWorkerSchemas.js";

it("preserves source-bound return-field dependencies across the worker callable boundary", () => {
  const ir = analyzeJavaScriptSemantics(
    "export const result = input => ({output: input.value});",
  );
  const callable = ir.callables.find((c) => c.name === "result");
  if (!callable) throw new Error("Missing callable");
  expect(callable.returnSites[0]?.fieldSources).toHaveLength(1);
  const record = { kind: "callable", value: callable };
  expect(
    javaScriptWorkerModuleRecordSchema.parse(
      JSON.parse(JSON.stringify(record)),
    ),
  ).toEqual(record);
});

it("preserves absent return-field metadata in historical worker IR", () => {
  const ir = analyzeJavaScriptSemantics(
    "const result = input => ({output: input.value});",
  );
  const callable = ir.callables.find((c) => c.name === "result");
  if (!callable) throw new Error("Missing callable");
  const legacy = {
    ...callable,
    returnSites: callable.returnSites.map(
      ({ fieldSources: _fields, ...site }) => site,
    ),
  };
  const record = { kind: "callable", value: legacy };
  expect(javaScriptWorkerModuleRecordSchema.parse(record)).toEqual(record);
});
